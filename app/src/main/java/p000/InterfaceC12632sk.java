package p000;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: sk */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC12632sk {

    /* JADX INFO: renamed from: sk$a */
    public interface a extends jt0<b> {
        void refreshData(Context context, String content, String language, String filePath);
    }

    /* JADX INFO: renamed from: sk$b */
    public interface b extends wu0 {
        void loadAudioFail();

        void loadAudioListSuccess(File responseData);
    }

    /* JADX INFO: renamed from: sk$c */
    public interface c extends jt0<b> {
        void refreshData(Context context, String content, String language, String sourceLanguage);
    }

    /* JADX INFO: renamed from: sk$d */
    public interface d extends wu0 {
        void transFail();

        void transSuccess(String responseData, boolean hasMore, boolean isCache, boolean isRefresh, int postion);
    }
}
