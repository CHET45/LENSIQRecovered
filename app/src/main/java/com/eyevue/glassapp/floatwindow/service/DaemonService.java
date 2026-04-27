package com.eyevue.glassapp.floatwindow.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.C2473f;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.services.EyevueAiService;
import p000.c5e;
import p000.gu8;
import p000.hib;
import p000.x4f;

/* JADX INFO: loaded from: classes4.dex */
public class DaemonService extends Service {

    /* JADX INFO: renamed from: e */
    public static final String f18278e = "DaemonService";

    /* JADX INFO: renamed from: f */
    public static final int f18279f = 100;

    /* JADX INFO: renamed from: m */
    public static final String f18280m = "DaemonServiceChannel";

    /* JADX INFO: renamed from: a */
    public NotificationManager f18281a;

    /* JADX INFO: renamed from: b */
    public boolean f18282b;

    /* JADX INFO: renamed from: c */
    public boolean f18283c;

    /* JADX INFO: renamed from: d */
    public final ServiceConnection f18284d = new ServiceConnectionC2637a();

    /* JADX INFO: renamed from: com.eyevue.glassapp.floatwindow.service.DaemonService$a */
    public class ServiceConnectionC2637a implements ServiceConnection {
        public ServiceConnectionC2637a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            DaemonService.this.f18283c = true;
            C2473f.m4168e(DaemonService.f18278e, "NewAiService onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            C2473f.m4168e(DaemonService.f18278e, "NewAiService onServiceDisconnected");
            DaemonService.this.startAiService();
            DaemonService.this.f18283c = false;
        }
    }

    private Notification buildNotification() {
        return new NotificationCompat.Builder(this, f18280m).setContentTitle(getString(C2531R.string.app_name)).setContentText(getString(C2531R.string.string_app_running)).setSmallIcon(C2531R.mipmap.ic_eyevue_launcher).build();
    }

    @c5e(26)
    private void createNotificationChannel() {
        this.f18281a.createNotificationChannel(new NotificationChannel(f18280m, "Recording Service", 3));
    }

    private void showNotification() {
        gu8.setLanguage(this);
        C2473f.m4167d(f18278e, "showNotification called");
        if (this.f18281a == null) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            this.f18281a = notificationManager;
            if (notificationManager == null) {
                C2473f.m4168e(f18278e, "mNotificationManager is null. Cannot send notification.");
                return;
            }
        }
        Notification notificationBuildNotification = buildNotification();
        if (notificationBuildNotification == null) {
            C2473f.m4168e(f18278e, "Failed to build notification.");
            return;
        }
        createNotificationChannel();
        try {
            this.f18281a.notify(100, notificationBuildNotification);
            startForeground(100, notificationBuildNotification);
            C2473f.m4167d(f18278e, "startForeground called");
        } catch (Exception e) {
            C2473f.m4168e(f18278e, "Error notifying: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startAiService() {
        if (x4f.isServiceRunning((Class<?>) EyevueAiService.class)) {
            return;
        }
        C2473f.m4168e(f18278e, "startService : NewAiService");
        bindService(new Intent(this, (Class<?>) EyevueAiService.class), this.f18284d, 1);
    }

    @Override // android.app.Service
    @hib
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f18281a = (NotificationManager) getSystemService("notification");
        showNotification();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        NotificationManager notificationManager = this.f18281a;
        if (notificationManager != null) {
            notificationManager.cancel(100);
        }
        this.f18282b = false;
        if (this.f18283c) {
            unbindService(this.f18284d);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (!this.f18282b) {
            showNotification();
            this.f18282b = true;
        }
        startAiService();
        return 1;
    }
}
