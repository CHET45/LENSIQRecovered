package p000;

import java.util.List;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface pf5 extends v6h {

    /* JADX INFO: renamed from: pf5$a */
    public static final class C10940a {

        /* JADX INFO: renamed from: d */
        public static final String f70593d = "ETSDefinition";

        /* JADX INFO: renamed from: a */
        public final g6h f70594a;

        /* JADX INFO: renamed from: b */
        public final int[] f70595b;

        /* JADX INFO: renamed from: c */
        public final int f70596c;

        public C10940a(g6h g6hVar, int... iArr) {
            this(g6hVar, iArr, 0);
        }

        public C10940a(g6h g6hVar, int[] iArr, int i) {
            if (iArr.length == 0) {
                yh9.m25916e("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f70594a = g6hVar;
            this.f70595b = iArr;
            this.f70596c = i;
        }
    }

    /* JADX INFO: renamed from: pf5$b */
    public interface InterfaceC10941b {
        pf5[] createTrackSelections(C10940a[] c10940aArr, vp0 vp0Var, vna.C14175b c14175b, t1h t1hVar);
    }

    void disable();

    void enable();

    int evaluateQueueSize(long j, List<? extends xca> list);

    boolean excludeTrack(int i, long j);

    default long getLatestBitrateEstimate() {
        return Long.MIN_VALUE;
    }

    kq6 getSelectedFormat();

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

    default boolean shouldCancelChunkLoad(long j, fz1 fz1Var, List<? extends xca> list) {
        return false;
    }

    void updateSelectedTrack(long j, long j2, long j3, List<? extends xca> list, ada[] adaVarArr);
}
