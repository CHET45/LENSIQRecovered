package p000;

import androidx.media3.common.C1213a;
import java.util.List;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface of5 extends u6h {

    /* JADX INFO: renamed from: of5$a */
    public static final class C10355a {

        /* JADX INFO: renamed from: d */
        public static final String f67488d = "ETSDefinition";

        /* JADX INFO: renamed from: a */
        public final h6h f67489a;

        /* JADX INFO: renamed from: b */
        public final int[] f67490b;

        /* JADX INFO: renamed from: c */
        public final int f67491c;

        public C10355a(h6h h6hVar, int... iArr) {
            this(h6hVar, iArr, 0);
        }

        public C10355a(h6h h6hVar, int[] iArr, int i) {
            if (iArr.length == 0) {
                xh9.m25145e("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f67489a = h6hVar;
            this.f67490b = iArr;
            this.f67491c = i;
        }
    }

    /* JADX INFO: renamed from: of5$b */
    public interface InterfaceC10356b {
        of5[] createTrackSelections(C10355a[] c10355aArr, up0 up0Var, una.C13612b c13612b, q1h q1hVar);
    }

    void disable();

    void enable();

    int evaluateQueueSize(long j, List<? extends yca> list);

    boolean excludeTrack(int i, long j);

    default long getLatestBitrateEstimate() {
        return -2147483647L;
    }

    C1213a getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    @hib
    Object getSelectionData();

    int getSelectionReason();

    boolean isTrackExcluded(int i, long j);

    default void onDiscontinuity() {
    }

    default void onPlayWhenReadyChanged(boolean z) {
    }

    void onPlaybackSpeed(float f);

    default void onRebuffer() {
    }

    default boolean shouldCancelChunkLoad(long j, gz1 gz1Var, List<? extends yca> list) {
        return false;
    }

    void updateSelectedTrack(long j, long j2, long j3, List<? extends yca> list, zca[] zcaVarArr);
}
