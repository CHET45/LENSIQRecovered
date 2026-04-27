package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface ved {

    /* JADX INFO: renamed from: ved$a */
    public interface InterfaceC14020a {
        ved createProgressiveMediaExtractor(k0d k0dVar);
    }

    void disableSeekingOnMp3Streams();

    long getCurrentInputPosition();

    void init(ah3 ah3Var, Uri uri, Map<String, List<String>> map, long j, long j2, ck5 ck5Var) throws IOException;

    int read(c5d c5dVar) throws IOException;

    void release();

    void seek(long j, long j2);
}
