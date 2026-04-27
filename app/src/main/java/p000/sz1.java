package p000;

import java.io.IOException;
import java.util.List;
import p000.ic9;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface sz1 {
    long getAdjustedSeekPositionUs(long j, iue iueVar);

    void getNextChunk(long j, long j2, List<? extends xca> list, jz1 jz1Var);

    int getPreferredQueueSize(long j, List<? extends xca> list);

    void maybeThrowError() throws IOException;

    void onChunkLoadCompleted(fz1 fz1Var);

    boolean onChunkLoadError(fz1 fz1Var, boolean z, ic9.C7232d c7232d, ic9 ic9Var);

    void release();

    boolean shouldCancelLoad(long j, fz1 fz1Var, List<? extends xca> list);
}
