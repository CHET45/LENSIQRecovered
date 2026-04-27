package p000;

import androidx.media3.exoplayer.C1233k;
import java.io.IOException;
import java.util.List;
import p000.hc9;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface tz1 {
    long getAdjustedSeekPositionUs(long j, jue jueVar);

    void getNextChunk(C1233k c1233k, long j, List<? extends yca> list, kz1 kz1Var);

    int getPreferredQueueSize(long j, List<? extends yca> list);

    void maybeThrowError() throws IOException;

    void onChunkLoadCompleted(gz1 gz1Var);

    boolean onChunkLoadError(gz1 gz1Var, boolean z, hc9.C6795d c6795d, hc9 hc9Var);

    void release();

    boolean shouldCancelLoad(long j, gz1 gz1Var, List<? extends yca> list);
}
