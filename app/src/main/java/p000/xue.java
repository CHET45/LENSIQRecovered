package p000;

import androidx.media3.exoplayer.offline.AbstractC1252g;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface xue {
    AbstractC1252g<?> create(nfa nfaVar);

    xue setDurationUs(long j);

    xue setExecutor(Executor executor);

    xue setMaxMergedSegmentStartTimeDiffMs(long j);

    xue setStartPositionUs(long j);
}
