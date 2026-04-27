package p000;

import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.C1233k;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p000.yye;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface mja extends yye {

    /* JADX INFO: renamed from: mja$a */
    public interface InterfaceC9368a extends yye.InterfaceC15893a<mja> {
        void onPrepared(mja mjaVar);
    }

    @Override // p000.yye
    boolean continueLoading(C1233k c1233k);

    void discardBuffer(long j, boolean z);

    long getAdjustedSeekPositionUs(long j, jue jueVar);

    @Override // p000.yye
    long getBufferedPositionUs();

    @Override // p000.yye
    long getNextLoadPositionUs();

    default List<StreamKey> getStreamKeys(List<of5> list) {
        return Collections.emptyList();
    }

    n6h getTrackGroups();

    @Override // p000.yye
    boolean isLoading();

    void maybeThrowPrepareError() throws IOException;

    void prepare(InterfaceC9368a interfaceC9368a, long j);

    long readDiscontinuity();

    @Override // p000.yye
    void reevaluateBuffer(long j);

    long seekToUs(long j);

    long selectTracks(of5[] of5VarArr, boolean[] zArr, mle[] mleVarArr, boolean[] zArr2, long j);
}
