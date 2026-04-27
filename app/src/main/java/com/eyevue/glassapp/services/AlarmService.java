package com.eyevue.glassapp.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.background.systemalarm.C1513a;
import com.blankj.utilcode.util.C2473f;
import com.eyevue.common.C2531R;
import p000.hib;
import p000.k8f;

/* JADX INFO: loaded from: classes4.dex */
public class AlarmService extends Service {

    /* JADX INFO: renamed from: F */
    public static final int f18303F = 10;

    /* JADX INFO: renamed from: H */
    public static final String f18304H = "alarm_channel";

    /* JADX INFO: renamed from: L */
    public static final String f18305L = "ACTION_STOP";

    /* JADX INFO: renamed from: M */
    public static final String f18306M = "ACTION_CANCEL";

    /* JADX INFO: renamed from: a */
    public MediaPlayer f18308a;

    /* JADX INFO: renamed from: b */
    public PowerManager.WakeLock f18309b;

    /* JADX INFO: renamed from: c */
    public String f18310c;

    /* JADX INFO: renamed from: d */
    public boolean f18311d;

    /* JADX INFO: renamed from: f */
    public NotificationManager f18313f;

    /* JADX INFO: renamed from: m */
    public long f18314m;

    /* JADX INFO: renamed from: e */
    public Handler f18312e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: C */
    public final Runnable f18307C = new RunnableC2670a();

    /* JADX INFO: renamed from: com.eyevue.glassapp.services.AlarmService$a */
    public class RunnableC2670a implements Runnable {
        public RunnableC2670a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AlarmService.this.f18308a == null || !AlarmService.this.f18308a.isPlaying()) {
                return;
            }
            AlarmService.this.f18308a.stop();
        }
    }

    private void createNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(f18304H, "Alarm Reminder", 4);
        notificationChannel.setDescription("Channel for alarm notifications");
        notificationChannel.enableVibration(true);
        notificationChannel.setLockscreenVisibility(1);
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        this.f18313f = notificationManager;
        notificationManager.createNotificationChannel(notificationChannel);
    }

    private void playAlarmSound() {
        MediaPlayer mediaPlayerCreate = MediaPlayer.create(this, RingtoneManager.getDefaultUri(4));
        this.f18308a = mediaPlayerCreate;
        mediaPlayerCreate.setLooping(true);
        this.f18308a.start();
    }

    private void showNotification() {
        Intent intent = new Intent(this, (Class<?>) AlarmService.class);
        intent.setAction(f18305L);
        PendingIntent service = PendingIntent.getService(this, 0, intent, 201326592);
        C2473f.m4168e("showNotification: remakrs = " + this.f18310c);
        Intent intent2 = new Intent(this, (Class<?>) AlarmReceiver.class);
        intent2.setAction(f18306M);
        Notification notificationBuild = new NotificationCompat.Builder(this, f18304H).setContentTitle(getString(C2531R.string.string_alarm_service_start_tip)).setContentText(TextUtils.isEmpty(this.f18310c) ? "" : this.f18310c).setSmallIcon(C2531R.mipmap.ic_eyevue_launcher).setPriority(1).setAutoCancel(false).setOngoing(true).setDeleteIntent(PendingIntent.getBroadcast(this, 1, intent2, k8f.C8233a.f52779i)).setContentIntent(service).addAction(0, getString(C2531R.string.stop_record_voice), service).build();
        NotificationManager notificationManager = this.f18313f;
        if (notificationManager != null) {
            notificationManager.notify(10, notificationBuild);
        }
    }

    private void stopMusicAndSelf() {
        MediaPlayer mediaPlayer = this.f18308a;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f18308a.stop();
            }
            this.f18308a.release();
            this.f18308a = null;
        }
        PowerManager.WakeLock wakeLock = this.f18309b;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.f18309b.release();
        }
        stopSelf();
    }

    @Override // android.app.Service
    @hib
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(805306394, "MyApp::MyAlarmWakeLock");
        this.f18309b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.acquire(C1513a.f11310N);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        MediaPlayer mediaPlayer = this.f18308a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f18308a.release();
        }
        NotificationManager notificationManager = this.f18313f;
        if (notificationManager != null) {
            notificationManager.cancel(10);
        }
        this.f18312e.removeCallbacksAndMessages(null);
        this.f18311d = false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        this.f18310c = intent.getStringExtra(AlarmReceiver.f18299c);
        this.f18314m = intent.getLongExtra("timestamp", 0L);
        if (f18305L.equals(intent.getAction()) || f18306M.equals(intent.getAction())) {
            stopMusicAndSelf();
        }
        if (!this.f18311d) {
            createNotificationChannel();
            showNotification();
            this.f18312e.removeCallbacks(this.f18307C);
            this.f18312e.postDelayed(this.f18307C, 300000L);
            this.f18311d = true;
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTimeout(int startId) {
        super.onTimeout(startId);
        stopSelf();
    }
}
