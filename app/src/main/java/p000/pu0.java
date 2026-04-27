package p000;

import android.os.SystemClock;
import androidx.media3.common.C1213a;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class pu0 implements of5 {

    /* JADX INFO: renamed from: c */
    public final h6h f72062c;

    /* JADX INFO: renamed from: d */
    public final int f72063d;

    /* JADX INFO: renamed from: e */
    public final int[] f72064e;

    /* JADX INFO: renamed from: f */
    public final int f72065f;

    /* JADX INFO: renamed from: g */
    public final C1213a[] f72066g;

    /* JADX INFO: renamed from: h */
    public final long[] f72067h;

    /* JADX INFO: renamed from: i */
    public int f72068i;

    /* JADX INFO: renamed from: j */
    public boolean f72069j;

    public pu0(h6h h6hVar, int... iArr) {
        this(h6hVar, iArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(C1213a c1213a, C1213a c1213a2) {
        return c1213a2.f8286j - c1213a.f8286j;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19767b() {
        return this.f72069j;
    }

    @Override // p000.of5
    public void disable() {
    }

    @Override // p000.of5
    public void enable() {
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pu0 pu0Var = (pu0) obj;
        return this.f72062c.equals(pu0Var.f72062c) && Arrays.equals(this.f72064e, pu0Var.f72064e);
    }

    @Override // p000.of5
    public int evaluateQueueSize(long j, List<? extends yca> list) {
        return list.size();
    }

    @Override // p000.of5
    public boolean excludeTrack(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsTrackExcluded = isTrackExcluded(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.f72063d && !zIsTrackExcluded) {
            zIsTrackExcluded = (i2 == i || isTrackExcluded(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zIsTrackExcluded) {
            return false;
        }
        long[] jArr = this.f72067h;
        jArr[i] = Math.max(jArr[i], t0i.addWithOverflowDefault(jElapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    @Override // p000.u6h
    public final C1213a getFormat(int i) {
        return this.f72066g[i];
    }

    @Override // p000.u6h
    public final int getIndexInTrackGroup(int i) {
        return this.f72064e[i];
    }

    @Override // p000.of5
    public final C1213a getSelectedFormat() {
        return this.f72066g[getSelectedIndex()];
    }

    @Override // p000.of5
    public final int getSelectedIndexInTrackGroup() {
        return this.f72064e[getSelectedIndex()];
    }

    @Override // p000.u6h
    public final h6h getTrackGroup() {
        return this.f72062c;
    }

    @Override // p000.u6h
    public final int getType() {
        return this.f72065f;
    }

    public int hashCode() {
        if (this.f72068i == 0) {
            this.f72068i = (System.identityHashCode(this.f72062c) * 31) + Arrays.hashCode(this.f72064e);
        }
        return this.f72068i;
    }

    @Override // p000.u6h
    public final int indexOf(C1213a c1213a) {
        for (int i = 0; i < this.f72063d; i++) {
            if (this.f72066g[i] == c1213a) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.of5
    public boolean isTrackExcluded(int i, long j) {
        return this.f72067h[i] > j;
    }

    @Override // p000.u6h
    public final int length() {
        return this.f72064e.length;
    }

    @Override // p000.of5
    @un1
    public void onPlayWhenReadyChanged(boolean z) {
        this.f72069j = z;
    }

    @Override // p000.of5
    public void onPlaybackSpeed(float f) {
    }

    public pu0(h6h h6hVar, int[] iArr, int i) {
        v80.checkState(iArr.length > 0);
        this.f72065f = i;
        this.f72062c = (h6h) v80.checkNotNull(h6hVar);
        int length = iArr.length;
        this.f72063d = length;
        this.f72066g = new C1213a[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f72066g[i2] = h6hVar.getFormat(iArr[i2]);
        }
        Arrays.sort(this.f72066g, new Comparator() { // from class: nu0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return pu0.lambda$new$0((C1213a) obj, (C1213a) obj2);
            }
        });
        this.f72064e = new int[this.f72063d];
        int i3 = 0;
        while (true) {
            int i4 = this.f72063d;
            if (i3 >= i4) {
                this.f72067h = new long[i4];
                this.f72069j = false;
                return;
            } else {
                this.f72064e[i3] = h6hVar.indexOf(this.f72066g[i3]);
                i3++;
            }
        }
    }

    @Override // p000.u6h
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.f72063d; i2++) {
            if (this.f72064e[i2] == i) {
                return i2;
            }
        }
        return -1;
    }
}
