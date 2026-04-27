package com.watchfun.voicenotes.manager.voicenotes;

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
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.utils.AppUtils;
import com.watchfun.transcommon.utils.HeaderUtils;
import com.watchfun.translatemodule.AsrActionMode;
import com.watchfun.translatemodule.VoiceWebSocketManager;
import java.io.File;
import p000.c5e;
import p000.e10;
import p000.gu8;
import p000.hib;
import p000.jk5;
import p000.pb9;
import p000.pj4;
import p000.qxb;
import p000.vfe;

/* JADX INFO: loaded from: classes7.dex */
public class RecordingService extends Service implements qxb<String> {

    /* JADX INFO: renamed from: f */
    public static final int f26452f = 12582912;

    /* JADX INFO: renamed from: m */
    public static final String f26453m = "foreground_channel_id";

    /* JADX INFO: renamed from: a */
    public NotificationManager f26454a;

    /* JADX INFO: renamed from: b */
    public final String f26455b = "Mp3Recorder";

    /* JADX INFO: renamed from: c */
    public String f26456c;

    /* JADX INFO: renamed from: d */
    public String f26457d;

    /* JADX INFO: renamed from: e */
    public boolean f26458e;

    private Notification buildNotification() {
        return new NotificationCompat.Builder(this, "foreground_channel_id").setContentTitle(getString(C4201R.string.trans_voice_notes_tip)).setContentText(getString(C4201R.string.string_recording)).setSmallIcon(C4201R.mipmap.ic_splash_logo).build();
    }

    @c5e(26)
    private void createNotificationChannel() {
        this.f26454a.createNotificationChannel(new NotificationChannel("foreground_channel_id", "Recording Service", 3));
    }

    private void initAsr() {
        File file = new File(getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "/audio/");
        if (!file.exists()) {
            file.mkdirs();
        }
        String str = file.getAbsolutePath() + pj4.f71071b + System.currentTimeMillis() + "";
        this.f26456c = str + "_phone.pcm";
        this.f26457d = str + "_phone.wav";
        pb9.get("recorder_file").post(this.f26456c);
    }

    private void showNotification() {
        gu8.setLanguage(this);
        C2473f.m4167d("Mp3Recorder", "showNotification called");
        if (this.f26454a == null) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            this.f26454a = notificationManager;
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
            this.f26454a.notify(f26452f, notificationBuildNotification);
            startForeground(f26452f, notificationBuildNotification);
            C2473f.m4167d("Mp3Recorder", "startForeground called");
        } catch (Exception e) {
            C2473f.m4168e("Mp3Recorder", "Error notifying: " + e.getMessage());
        }
    }

    private void startRecord() {
        TransLanguageData transLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString("language_voice_notes"));
        VoiceWebSocketManager.getInstance().setVadTime(10800000L, 10800000L);
        VoiceWebSocketManager.getInstance().startAsr(transLanguageData == null ? "zh-CN" : transLanguageData.getIatLanguage(), true, this.f26456c);
    }

    @Override // android.app.Service
    @hib
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f26454a = (NotificationManager) getSystemService("notification");
        showNotification();
        pb9.get("record_action", String.class).observeForever(this);
        VoiceWebSocketManager.getInstance().startSocket(this, e10.f31491g, e10.f31486b, e10.f31487c, e10.f31485a, HeaderUtils.buildWebsocketHeader(AsrActionMode.VOICE_NOTES_TYPE.getCode()));
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        NotificationManager notificationManager = this.f26454a;
        if (notificationManager != null) {
            notificationManager.cancel(f26452f);
        }
        this.f26458e = false;
        pb9.get("record_action", String.class).removeObserver(this);
        VoiceWebSocketManager.getInstance().release();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C2473f.m4167d("Mp3Recorder", "onStartCommand called");
        if (!this.f26458e) {
            showNotification();
            this.f26458e = true;
        }
        return 1;
    }

    public void stopRecord() {
        VoiceWebSocketManager.getInstance().stopAsr();
    }

    @Override // p000.qxb
    public void onChanged(String str) {
        if (TextUtils.equals(str, "start")) {
            initAsr();
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
