package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface ued {

    /* JADX INFO: renamed from: ued$a */
    public interface InterfaceC13516a {
        ued createProgressiveMediaExtractor(j0d j0dVar);
    }

    void disableSeekingOnMp3Streams();

    long getCurrentInputPosition();

    void init(bh3 bh3Var, Uri uri, Map<String, List<String>> map, long j, long j2, bk5 bk5Var) throws IOException;

    int read(d5d d5dVar) throws IOException;

    void release();

    void seek(long j, long j2);
}
