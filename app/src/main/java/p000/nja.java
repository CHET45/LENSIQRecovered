package p000;

import com.google.android.exoplayer2.offline.StreamKey;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p000.zye;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface nja extends zye {

    /* JADX INFO: renamed from: nja$a */
    public interface InterfaceC9906a extends zye.InterfaceC16321a<nja> {
        void onPrepared(nja njaVar);
    }

    @Override // p000.zye
    boolean continueLoading(long j);

    void discardBuffer(long j, boolean z);

    long getAdjustedSeekPositionUs(long j, iue iueVar);

    @Override // p000.zye
    long getBufferedPositionUs();

    @Override // p000.zye
    long getNextLoadPositionUs();

    default List<StreamKey> getStreamKeys(List<pf5> list) {
        return Collections.emptyList();
    }

    m6h getTrackGroups();

    @Override // p000.zye
    boolean isLoading();

    void maybeThrowPrepareError() throws IOException;

    void prepare(InterfaceC9906a interfaceC9906a, long j);

    long readDiscontinuity();

    @Override // p000.zye
    void reevaluateBuffer(long j);

    long seekToUs(long j);

    long selectTracks(pf5[] pf5VarArr, boolean[] zArr, nle[] nleVarArr, boolean[] zArr2, long j);
}
