package p000;

import android.content.Context;
import androidx.lifecycle.AbstractC1158q;
import androidx.work.C1507b;
import com.watchfun.trans.translation.ConvertWorker;
import java.util.List;
import java.util.UUID;
import p000.e5c;

/* JADX INFO: loaded from: classes6.dex */
public class od0 {

    /* JADX INFO: renamed from: b */
    public static final String f67289b = "audio_conversion_work";

    /* JADX INFO: renamed from: a */
    public final ypi f67290a;

    public od0(Context context) {
        this.f67290a = ypi.getInstance(context.getApplicationContext());
    }

    public void cancelAllConversions() {
        this.f67290a.cancelUniqueWork(f67289b);
    }

    public UUID enqueueConversion(long time, String pcmPath, String mp3Path) throws Throwable {
        e5c e5cVarBuild = new e5c.C5124a(ConvertWorker.class).setInputData(new C1507b.a().putLong("key_time", time).putString("key_pcm_path", pcmPath).putString(ConvertWorker.f25700H, mp3Path).build()).build();
        this.f67290a.enqueueUniqueWork(f67289b, s95.APPEND, e5cVarBuild);
        return e5cVarBuild.getId();
    }

    public AbstractC1158q<List<tpi>> getAllWorkInfos() {
        return this.f67290a.getWorkInfosForUniqueWorkLiveData(f67289b);
    }

    public AbstractC1158q<tpi> getWorkInfo(UUID workId) {
        return this.f67290a.getWorkInfoByIdLiveData(workId);
    }
}
