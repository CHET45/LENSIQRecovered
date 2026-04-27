package com.watchfun.trans.translation;

import android.content.Context;
import androidx.work.C1507b;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.ReturnCode;
import com.watchfun.trans.database.transmachine.TransMachineDatabase;
import java.io.File;
import p000.amc;
import p000.efb;
import p000.st5;
import p000.uah;

/* JADX INFO: loaded from: classes6.dex */
public class ConvertWorker extends Worker {

    /* JADX INFO: renamed from: F */
    public static final String f25699F = "key_pcm_path";

    /* JADX INFO: renamed from: H */
    public static final String f25700H = "key_mp3_path";

    /* JADX INFO: renamed from: L */
    public static final String f25701L = "progress";

    /* JADX INFO: renamed from: M */
    public static final String f25702M = "key_time";

    /* JADX INFO: renamed from: N */
    public static final int f25703N = 44100;

    /* JADX INFO: renamed from: C */
    public uah f25704C;

    /* JADX INFO: renamed from: m */
    public TransMachineDatabase f25705m;

    /* JADX INFO: renamed from: com.watchfun.trans.translation.ConvertWorker$a */
    public interface InterfaceC4138a {
        void onProgress(int progress);
    }

    public ConvertWorker(@efb Context context, @efb WorkerParameters workerParams) {
        super(context.getApplicationContext(), workerParams);
        this.f25705m = TransMachineDatabase.getDatabase(context.getApplicationContext());
    }

    private void convertPcmToMp3(long time, String pcmPath, String mp3Path) throws Exception {
        File file = new File(pcmPath);
        File file2 = new File(mp3Path);
        if (file.exists() && file2.exists()) {
            if (!ReturnCode.isSuccess(FFmpegKit.execute(String.format("-y -f s16le -ar %d -ac 1 -i %s %s", 44100, pcmPath, mp3Path)).getReturnCode())) {
                throw new Exception("PCM 转换为 MP3 失败");
            }
            this.f25704C.updateSourceVoicePathByTime(time, mp3Path);
        }
    }

    @Override // androidx.work.Worker
    @efb
    public ListenableWorker.AbstractC1502a doWork() {
        this.f25704C = this.f25705m.messageDao();
        String string = getInputData().getString("key_pcm_path");
        String strReplace = string.replace(st5.f82815c, amc.f2088w);
        long j = getInputData().getLong("key_time", -1L);
        if (strReplace == null || j == -1) {
            return ListenableWorker.AbstractC1502a.failure();
        }
        try {
            convertPcmToMp3(j, string, strReplace);
            return ListenableWorker.AbstractC1502a.success(new C1507b.a().putString(f25700H, strReplace).build());
        } catch (Exception unused) {
            return ListenableWorker.AbstractC1502a.failure();
        }
    }
}
