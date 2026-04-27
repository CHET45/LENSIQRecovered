package p000;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class ou0 implements pf5 {

    /* JADX INFO: renamed from: c */
    public final g6h f68741c;

    /* JADX INFO: renamed from: d */
    public final int f68742d;

    /* JADX INFO: renamed from: e */
    public final int[] f68743e;

    /* JADX INFO: renamed from: f */
    public final int f68744f;

    /* JADX INFO: renamed from: g */
    public final kq6[] f68745g;

    /* JADX INFO: renamed from: h */
    public final long[] f68746h;

    /* JADX INFO: renamed from: i */
    public int f68747i;

    public ou0(g6h g6hVar, int... iArr) {
        this(g6hVar, iArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(kq6 kq6Var, kq6 kq6Var2) {
        return kq6Var2.f54985C - kq6Var.f54985C;
    }

    @Override // p000.pf5
    public void disable() {
    }

    @Override // p000.pf5
    public void enable() {
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ou0 ou0Var = (ou0) obj;
        return this.f68741c == ou0Var.f68741c && Arrays.equals(this.f68743e, ou0Var.f68743e);
    }

    @Override // p000.pf5
    public int evaluateQueueSize(long j, List<? extends xca> list) {
        return list.size();
    }

    @Override // p000.pf5
    public boolean excludeTrack(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsTrackExcluded = isTrackExcluded(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.f68742d && !zIsTrackExcluded) {
            zIsTrackExcluded = (i2 == i || isTrackExcluded(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zIsTrackExcluded) {
            return false;
        }
        long[] jArr = this.f68746h;
        jArr[i] = Math.max(jArr[i], x0i.addWithOverflowDefault(jElapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    @Override // p000.v6h
    public final kq6 getFormat(int i) {
        return this.f68745g[i];
    }

    @Override // p000.v6h
    public final int getIndexInTrackGroup(int i) {
        return this.f68743e[i];
    }

    @Override // p000.pf5
    public final kq6 getSelectedFormat() {
        return this.f68745g[getSelectedIndex()];
    }

    @Override // p000.pf5
    public final int getSelectedIndexInTrackGroup() {
        return this.f68743e[getSelectedIndex()];
    }

    @Override // p000.v6h
    public final g6h getTrackGroup() {
        return this.f68741c;
    }

    @Override // p000.v6h
    public final int getType() {
        return this.f68744f;
    }

    public int hashCode() {
        if (this.f68747i == 0) {
            this.f68747i = (System.identityHashCode(this.f68741c) * 31) + Arrays.hashCode(this.f68743e);
        }
        return this.f68747i;
    }

    @Override // p000.v6h
    public final int indexOf(kq6 kq6Var) {
        for (int i = 0; i < this.f68742d; i++) {
            if (this.f68745g[i] == kq6Var) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.pf5
    public boolean isTrackExcluded(int i, long j) {
        return this.f68746h[i] > j;
    }

    @Override // p000.v6h
    public final int length() {
        return this.f68743e.length;
    }

    @Override // p000.pf5
    public void onPlaybackSpeed(float f) {
    }

    public ou0(g6h g6hVar, int[] iArr, int i) {
        int i2 = 0;
        u80.checkState(iArr.length > 0);
        this.f68744f = i;
        this.f68741c = (g6h) u80.checkNotNull(g6hVar);
        int length = iArr.length;
        this.f68742d = length;
        this.f68745g = new kq6[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f68745g[i3] = g6hVar.getFormat(iArr[i3]);
        }
        Arrays.sort(this.f68745g, new Comparator() { // from class: mu0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ou0.lambda$new$0((kq6) obj, (kq6) obj2);
            }
        });
        this.f68743e = new int[this.f68742d];
        while (true) {
            int i4 = this.f68742d;
            if (i2 >= i4) {
                this.f68746h = new long[i4];
                return;
            } else {
                this.f68743e[i2] = g6hVar.indexOf(this.f68745g[i2]);
                i2++;
            }
        }
    }

    @Override // p000.v6h
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.f68742d; i2++) {
            if (this.f68743e[i2] == i) {
                return i2;
            }
        }
        return -1;
    }
}
