package p000;

import androidx.media3.exoplayer.C1233k;
import java.io.IOException;
import java.util.Objects;
import p000.mja;

/* JADX INFO: loaded from: classes3.dex */
public final class x9d implements mja {

    /* JADX INFO: renamed from: a */
    public final mja f97300a;

    /* JADX INFO: renamed from: b */
    public boolean f97301b;

    /* JADX INFO: renamed from: c */
    public boolean f97302c;

    /* JADX INFO: renamed from: d */
    @hib
    public mja.InterfaceC9368a f97303d;

    /* JADX INFO: renamed from: e */
    @hib
    public C15008b f97304e;

    /* JADX INFO: renamed from: x9d$a */
    public class C15007a implements mja.InterfaceC9368a {
        public C15007a() {
        }

        @Override // p000.mja.InterfaceC9368a
        public void onPrepared(mja mjaVar) {
            x9d x9dVar = x9d.this;
            x9dVar.f97301b = true;
            ((mja.InterfaceC9368a) v80.checkNotNull(x9dVar.f97303d)).onPrepared(x9d.this);
        }

        @Override // p000.yye.InterfaceC15893a
        public void onContinueLoadingRequested(mja mjaVar) {
            ((mja.InterfaceC9368a) v80.checkNotNull(x9d.this.f97303d)).onContinueLoadingRequested(x9d.this);
        }
    }

    /* JADX INFO: renamed from: x9d$b */
    public static class C15008b {

        /* JADX INFO: renamed from: a */
        public final of5[] f97306a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f97307b;

        /* JADX INFO: renamed from: c */
        public final mle[] f97308c;

        /* JADX INFO: renamed from: d */
        public final boolean[] f97309d;

        /* JADX INFO: renamed from: e */
        public final long f97310e;

        public C15008b(of5[] of5VarArr, boolean[] zArr, mle[] mleVarArr, boolean[] zArr2, long j) {
            this.f97306a = of5VarArr;
            this.f97307b = zArr;
            this.f97308c = mleVarArr;
            this.f97309d = zArr2;
            this.f97310e = j;
        }
    }

    public x9d(mja mjaVar) {
        this.f97300a = mjaVar;
    }

    private static boolean isSameAdaptionSet(of5 of5Var, of5 of5Var2) {
        if (!Objects.equals(of5Var.getTrackGroup(), of5Var2.getTrackGroup()) || of5Var.length() != of5Var2.length()) {
            return false;
        }
        for (int i = 0; i < of5Var.length(); i++) {
            if (of5Var.getIndexInTrackGroup(i) != of5Var2.getIndexInTrackGroup(i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean maybeUpdatePreloadTrackSelectionHolderForReselection(of5[] of5VarArr, C15008b c15008b) {
        of5[] of5VarArr2 = ((C15008b) v80.checkNotNull(c15008b)).f97306a;
        int i = 0;
        boolean z = false;
        while (i < of5VarArr.length) {
            of5 of5Var = of5VarArr[i];
            of5 of5Var2 = of5VarArr2[i];
            if (of5Var != null || of5Var2 != null) {
                c15008b.f97307b[i] = false;
                if (of5Var == null) {
                    c15008b.f97306a[i] = null;
                } else if (of5Var2 == null || !isSameAdaptionSet(of5Var, of5Var2)) {
                    c15008b.f97306a[i] = of5Var;
                } else if (of5Var.getTrackGroup().f42520c == 2 || of5Var.getTrackGroup().f42520c == 1 || of5Var.getSelectedIndexInTrackGroup() == of5Var2.getSelectedIndexInTrackGroup()) {
                    c15008b.f97307b[i] = true;
                } else {
                    c15008b.f97306a[i] = of5Var;
                }
                z = true;
            }
            i++;
        }
        return z;
    }

    private void prepareInternal(long j) {
        this.f97302c = true;
        this.f97300a.prepare(new C15007a(), j);
    }

    private long selectTracksInternal(of5[] of5VarArr, boolean[] zArr, mle[] mleVarArr, boolean[] zArr2, long j) {
        C15008b c15008b = this.f97304e;
        if (c15008b == null) {
            return this.f97300a.selectTracks(of5VarArr, zArr, mleVarArr, zArr2, j);
        }
        v80.checkState(mleVarArr.length == c15008b.f97308c.length);
        C15008b c15008b2 = this.f97304e;
        if (j == c15008b2.f97310e) {
            C15008b c15008b3 = (C15008b) v80.checkNotNull(c15008b2);
            long jSelectTracks = c15008b3.f97310e;
            boolean[] zArr3 = c15008b3.f97309d;
            if (maybeUpdatePreloadTrackSelectionHolderForReselection(of5VarArr, c15008b3)) {
                zArr3 = new boolean[zArr3.length];
                jSelectTracks = this.f97300a.selectTracks(c15008b3.f97306a, c15008b3.f97307b, c15008b3.f97308c, zArr3, c15008b3.f97310e);
                int i = 0;
                while (true) {
                    boolean[] zArr4 = c15008b3.f97307b;
                    if (i >= zArr4.length) {
                        break;
                    }
                    if (zArr4[i]) {
                        zArr3[i] = true;
                    }
                    i++;
                }
            }
            mle[] mleVarArr2 = c15008b3.f97308c;
            System.arraycopy(mleVarArr2, 0, mleVarArr, 0, mleVarArr2.length);
            System.arraycopy(zArr3, 0, zArr2, 0, zArr3.length);
            this.f97304e = null;
            return jSelectTracks;
        }
        int i2 = 0;
        while (true) {
            mle[] mleVarArr3 = this.f97304e.f97308c;
            if (i2 >= mleVarArr3.length) {
                this.f97304e = null;
                return this.f97300a.selectTracks(of5VarArr, zArr, mleVarArr, zArr2, j);
            }
            mle mleVar = mleVarArr3[i2];
            if (mleVar != null) {
                mleVarArr[i2] = mleVar;
                zArr[i2] = false;
            }
            i2++;
        }
    }

    @Override // p000.mja, p000.yye
    public boolean continueLoading(C1233k c1233k) {
        return this.f97300a.continueLoading(c1233k);
    }

    @Override // p000.mja
    public void discardBuffer(long j, boolean z) {
        this.f97300a.discardBuffer(j, z);
    }

    @Override // p000.mja
    public long getAdjustedSeekPositionUs(long j, jue jueVar) {
        return this.f97300a.getAdjustedSeekPositionUs(j, jueVar);
    }

    @Override // p000.mja, p000.yye
    public long getBufferedPositionUs() {
        return this.f97300a.getBufferedPositionUs();
    }

    @Override // p000.mja, p000.yye
    public long getNextLoadPositionUs() {
        return this.f97300a.getNextLoadPositionUs();
    }

    @Override // p000.mja
    public n6h getTrackGroups() {
        return this.f97300a.getTrackGroups();
    }

    @Override // p000.mja, p000.yye
    public boolean isLoading() {
        return this.f97300a.isLoading();
    }

    @Override // p000.mja
    public void maybeThrowPrepareError() throws IOException {
        this.f97300a.maybeThrowPrepareError();
    }

    public void maybeThrowStreamError() throws IOException {
        v80.checkState(this.f97301b);
        C15008b c15008b = this.f97304e;
        if (c15008b != null) {
            for (mle mleVar : c15008b.f97308c) {
                if (mleVar != null) {
                    mleVar.maybeThrowError();
                }
            }
        }
    }

    public void preload(mja.InterfaceC9368a interfaceC9368a, long j) {
        this.f97303d = interfaceC9368a;
        if (this.f97301b) {
            interfaceC9368a.onPrepared(this);
        }
        if (this.f97302c) {
            return;
        }
        prepareInternal(j);
    }

    @Override // p000.mja
    public void prepare(mja.InterfaceC9368a interfaceC9368a, long j) {
        this.f97303d = interfaceC9368a;
        if (this.f97301b) {
            interfaceC9368a.onPrepared(this);
        } else {
            if (this.f97302c) {
                return;
            }
            prepareInternal(j);
        }
    }

    @Override // p000.mja
    public long readDiscontinuity() {
        return this.f97300a.readDiscontinuity();
    }

    @Override // p000.mja, p000.yye
    public void reevaluateBuffer(long j) {
        this.f97300a.reevaluateBuffer(j);
    }

    @Override // p000.mja
    public long seekToUs(long j) {
        return this.f97300a.seekToUs(j);
    }

    @Override // p000.mja
    public long selectTracks(of5[] of5VarArr, boolean[] zArr, mle[] mleVarArr, boolean[] zArr2, long j) {
        return selectTracksInternal(of5VarArr, zArr, mleVarArr, zArr2, j);
    }

    public long selectTracksForPreloading(of5[] of5VarArr, long j) {
        mle[] mleVarArr = new mle[of5VarArr.length];
        boolean[] zArr = new boolean[of5VarArr.length];
        boolean[] zArr2 = new boolean[of5VarArr.length];
        long jSelectTracksInternal = selectTracksInternal(of5VarArr, zArr2, mleVarArr, zArr, j);
        this.f97304e = new C15008b(of5VarArr, zArr2, mleVarArr, zArr, jSelectTracksInternal);
        return jSelectTracksInternal;
    }
}
