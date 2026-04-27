package com.watchfun.trans.translation;

import android.app.IntentService;
import android.content.Intent;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.ReturnCode;
import com.watchfun.trans.database.transmachine.TransMachineDatabase;
import java.io.File;
import java.util.Locale;
import p000.hib;
import p000.uah;

/* JADX INFO: loaded from: classes6.dex */
public class ConvertIntentService extends IntentService {

    /* JADX INFO: renamed from: c */
    public static final String f25693c = "key_pcm_path";

    /* JADX INFO: renamed from: d */
    public static final String f25694d = "key_mp_path";

    /* JADX INFO: renamed from: e */
    public static final String f25695e = "key_time";

    /* JADX INFO: renamed from: f */
    public static final int f25696f = 44100;

    /* JADX INFO: renamed from: a */
    public TransMachineDatabase f25697a;

    /* JADX INFO: renamed from: b */
    public uah f25698b;

    public ConvertIntentService() {
        super("ConvertIntentService");
    }

    private void convertPcmToMp3(long time, String pcmPath, String mp3Path) throws Exception {
        File file = new File(pcmPath);
        new File(mp3Path);
        if (file.exists()) {
            if (!ReturnCode.isSuccess(FFmpegKit.execute(String.format(Locale.US, "-y -f s16le -ar %d -ac 1 -i \"%s\" \"%s\"", 44100, pcmPath.replace("\" ", "\\\" "), mp3Path.replace("\" ", "\\\" "))).getReturnCode())) {
                throw new Exception("PCM 转换为 MP3 失败");
            }
            this.f25698b.updateSourceVoicePathByTime(time, mp3Path);
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.IntentService
    public void onHandleIntent(@hib Intent intent) {
        if (intent != null) {
            if (this.f25697a == null) {
                this.f25697a = TransMachineDatabase.getDatabase(getApplicationContext());
            }
            this.f25698b = this.f25697a.messageDao();
            String stringExtra = intent.getStringExtra("key_pcm_path");
            String stringExtra2 = intent.getStringExtra(f25694d);
            long longExtra = intent.getLongExtra("key_time", -1L);
            if (stringExtra == null || stringExtra2 == null || longExtra == -1) {
                return;
            }
            try {
                convertPcmToMp3(longExtra, stringExtra, stringExtra2);
            } catch (Exception unused) {
            }
        }
    }
}
