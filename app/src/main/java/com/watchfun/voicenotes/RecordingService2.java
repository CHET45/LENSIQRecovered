package com.watchfun.voicenotes;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Environment;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.C2473f;
import com.watchfun.translatemodule.AudioRecorder;
import com.watchfun.voicenotes.RecordingService2;
import java.io.File;
import p000.c5e;
import p000.gu8;
import p000.hib;
import p000.jk5;
import p000.pb9;
import p000.pj4;
import p000.qxb;

/* JADX INFO: loaded from: classes7.dex */
public class RecordingService2 extends Service implements qxb<String> {

    /* JADX INFO: renamed from: f */
    public static final int f26333f = 49152;

    /* JADX INFO: renamed from: m */
    public static final String f26334m = "foreground_channel_id";

    /* JADX INFO: renamed from: a */
    public NotificationManager f26335a;

    /* JADX INFO: renamed from: b */
    public final String f26336b = "Mp3Recorder";

    /* JADX INFO: renamed from: c */
    public String f26337c;

    /* JADX INFO: renamed from: d */
    public boolean f26338d;

    /* JADX INFO: renamed from: e */
    public AudioRecorder f26339e;

    private Notification buildNotification() {
        return new NotificationCompat.Builder(this, "foreground_channel_id").setContentTitle(getString(C4297R.string.trans_voice_notes_tip)).setContentText(getString(C4297R.string.string_recording)).setSmallIcon(C4297R.drawable.ic_record_mic_status_doing).build();
    }

    @c5e(26)
    private void createNotificationChannel() {
        this.f26335a.createNotificationChannel(new NotificationChannel("foreground_channel_id", "Recording Service", 3));
    }

    private void initRecordConfig() {
        File file = new File(getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "/audio/");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f26337c = (file.getAbsolutePath() + pj4.f71071b + System.currentTimeMillis() + "") + "_phone.pcm";
        pb9.get("recorder_file").post(this.f26337c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startRecord$0(byte[] bArr, int i, int i2) {
    }

    private void showNotification() {
        gu8.setLanguage(this);
        C2473f.m4167d("Mp3Recorder", "showNotification called");
        if (this.f26335a == null) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            this.f26335a = notificationManager;
            if (notificationManager == null) {
                C2473f.m4168e("Mp3Recorder", "mNotificationManager is null. Cannot send notification.");
                return;
            }
        }
        Notification notificationBuildNotification = buildNotification();
        if (notificationBuildNotification == null) {
            C2473f.m4168e("Mp3Recorder", "Failed to build notification.");
            return;
        }
        createNotificationChannel();
        try {
            this.f26335a.notify(49152, notificationBuildNotification);
            startForeground(49152, notificationBuildNotification);
            C2473f.m4167d("Mp3Recorder", "startForeground called");
        } catch (Exception e) {
            C2473f.m4168e("Mp3Recorder", "Error notifying: " + e.getMessage());
        }
    }

    @Override // android.app.Service
    @hib
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f26335a = (NotificationManager) getSystemService("notification");
        showNotification();
        pb9.get("record_action", String.class).observeForever(this);
        this.f26339e = AudioRecorder.getInstance();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        NotificationManager notificationManager = this.f26335a;
        if (notificationManager != null) {
            notificationManager.cancel(49152);
        }
        this.f26338d = false;
        pb9.get("record_action", String.class).removeObserver(this);
        this.f26339e.release();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C2473f.m4167d("Mp3Recorder", "onStartCommand called");
        if (!this.f26338d) {
            showNotification();
            this.f26338d = true;
        }
        return 1;
    }

    public void startRecord() {
        this.f26339e.startRecord(this.f26337c, new AudioRecorder.RecordStreamListener() { // from class: oud
            @Override // com.watchfun.translatemodule.AudioRecorder.RecordStreamListener
            public final void recordOfByte(byte[] bArr, int i, int i2) {
                RecordingService2.lambda$startRecord$0(bArr, i, i2);
            }
        });
    }

    public void stopRecord() {
        this.f26339e.stopRecord();
    }

    @Override // p000.qxb
    public void onChanged(String str) {
        if (TextUtils.equals(str, "start")) {
            initRecordConfig();
            startRecord();
        } else {
            if (TextUtils.equals(str, "pause")) {
                return;
            }
            if (TextUtils.equals(str, "resume")) {
                startRecord();
            } else if (TextUtils.equals(str, jk5.f51004j)) {
                stopRecord();
            }
        }
    }
}
