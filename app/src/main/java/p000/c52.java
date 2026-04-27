package p000;

import androidx.media3.common.C1213a;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.C1233k;
import java.io.IOException;
import java.util.List;
import p000.e52;
import p000.mja;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class c52 implements mja, mja.InterfaceC9368a {

    /* JADX INFO: renamed from: a */
    public final mja f15785a;

    /* JADX INFO: renamed from: b */
    @hib
    public mja.InterfaceC9368a f15786b;

    /* JADX INFO: renamed from: c */
    public C2203a[] f15787c = new C2203a[0];

    /* JADX INFO: renamed from: d */
    public long f15788d;

    /* JADX INFO: renamed from: e */
    public long f15789e;

    /* JADX INFO: renamed from: f */
    public long f15790f;

    /* JADX INFO: renamed from: m */
    @hib
    public e52.C5121d f15791m;

    /* JADX INFO: renamed from: c52$a */
    public final class C2203a implements mle {

        /* JADX INFO: renamed from: a */
        public final mle f15792a;

        /* JADX INFO: renamed from: b */
        public boolean f15793b;

        public C2203a(mle mleVar) {
            this.f15792a = mleVar;
        }

        public void clearSentEos() {
            this.f15793b = false;
        }

        @Override // p000.mle
        public boolean isReady() {
            return !c52.this.m3769a() && this.f15792a.isReady();
        }

        @Override // p000.mle
        public void maybeThrowError() throws IOException {
            this.f15792a.maybeThrowError();
        }

        @Override // p000.mle
        public int readData(oq6 oq6Var, rl3 rl3Var, int i) {
            if (c52.this.m3769a()) {
                return -3;
            }
            if (this.f15793b) {
                rl3Var.setFlags(4);
                return -4;
            }
            long bufferedPositionUs = c52.this.getBufferedPositionUs();
            int data = this.f15792a.readData(oq6Var, rl3Var, i);
            if (data == -5) {
                C1213a c1213a = (C1213a) v80.checkNotNull(oq6Var.f68294b);
                int i2 = c1213a.f8269J;
                if (i2 != 0 || c1213a.f8270K != 0) {
                    c52 c52Var = c52.this;
                    if (c52Var.f15789e != 0) {
                        i2 = 0;
                    }
                    oq6Var.f68294b = c1213a.buildUpon().setEncoderDelay(i2).setEncoderPadding(c52Var.f15790f == Long.MIN_VALUE ? c1213a.f8270K : 0).build();
                }
                return -5;
            }
            long j = c52.this.f15790f;
            if (j == Long.MIN_VALUE || ((data != -4 || rl3Var.f78610f < j) && !(data == -3 && bufferedPositionUs == Long.MIN_VALUE && !rl3Var.f78609e))) {
                return data;
            }
            rl3Var.clear();
            rl3Var.setFlags(4);
            this.f15793b = true;
            return -4;
        }

        @Override // p000.mle
        public int skipData(long j) {
            if (c52.this.m3769a()) {
                return -3;
            }
            return this.f15792a.skipData(j);
        }
    }

    public c52(mja mjaVar, boolean z, long j, long j2) {
        this.f15785a = mjaVar;
        this.f15788d = z ? j : -9223372036854775807L;
        this.f15789e = j;
        this.f15790f = j2;
    }

    private jue clipSeekParameters(long j, jue jueVar) {
        long jConstrainValue = t0i.constrainValue(jueVar.f51982a, 0L, j - this.f15789e);
        long j2 = jueVar.f51983b;
        long j3 = this.f15790f;
        long jConstrainValue2 = t0i.constrainValue(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (jConstrainValue == jueVar.f51982a && jConstrainValue2 == jueVar.f51983b) ? jueVar : new jue(jConstrainValue, jConstrainValue2);
    }

    private static long enforceClippingRange(long j, long j2, long j3) {
        long jMax = Math.max(j, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    private static boolean shouldKeepInitialDiscontinuity(long j, long j2, of5[] of5VarArr) {
        if (j < j2) {
            return true;
        }
        if (j != 0) {
            for (of5 of5Var : of5VarArr) {
                if (of5Var != null) {
                    C1213a selectedFormat = of5Var.getSelectedFormat();
                    if (!rva.allSamplesAreSyncSamples(selectedFormat.f8291o, selectedFormat.f8287k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m3769a() {
        return this.f15788d != -9223372036854775807L;
    }

    @Override // p000.mja, p000.yye
    public boolean continueLoading(C1233k c1233k) {
        return this.f15785a.continueLoading(c1233k);
    }

    @Override // p000.mja
    public void discardBuffer(long j, boolean z) {
        this.f15785a.discardBuffer(j, z);
    }

    @Override // p000.mja
    public long getAdjustedSeekPositionUs(long j, jue jueVar) {
        long j2 = this.f15789e;
        if (j == j2) {
            return j2;
        }
        return this.f15785a.getAdjustedSeekPositionUs(j, clipSeekParameters(j, jueVar));
    }

    @Override // p000.mja, p000.yye
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f15785a.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j = this.f15790f;
            if (j == Long.MIN_VALUE || bufferedPositionUs < j) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p000.mja, p000.yye
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f15785a.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j = this.f15790f;
            if (j == Long.MIN_VALUE || nextLoadPositionUs < j) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p000.mja
    public List<StreamKey> getStreamKeys(List<of5> list) {
        return this.f15785a.getStreamKeys(list);
    }

    @Override // p000.mja
    public n6h getTrackGroups() {
        return this.f15785a.getTrackGroups();
    }

    @Override // p000.mja, p000.yye
    public boolean isLoading() {
        return this.f15785a.isLoading();
    }

    @Override // p000.mja
    public void maybeThrowPrepareError() throws IOException {
        e52.C5121d c5121d = this.f15791m;
        if (c5121d != null) {
            throw c5121d;
        }
        this.f15785a.maybeThrowPrepareError();
    }

    @Override // p000.mja.InterfaceC9368a
    public void onPrepared(mja mjaVar) {
        if (this.f15791m != null) {
            return;
        }
        ((mja.InterfaceC9368a) v80.checkNotNull(this.f15786b)).onPrepared(this);
    }

    @Override // p000.mja
    public void prepare(mja.InterfaceC9368a interfaceC9368a, long j) {
        this.f15786b = interfaceC9368a;
        this.f15785a.prepare(this, j);
    }

    @Override // p000.mja
    public long readDiscontinuity() {
        if (m3769a()) {
            long j = this.f15788d;
            this.f15788d = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j;
        }
        long discontinuity2 = this.f15785a.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return enforceClippingRange(discontinuity2, this.f15789e, this.f15790f);
    }

    @Override // p000.mja, p000.yye
    public void reevaluateBuffer(long j) {
        this.f15785a.reevaluateBuffer(j);
    }

    @Override // p000.mja
    public long seekToUs(long j) {
        this.f15788d = -9223372036854775807L;
        for (C2203a c2203a : this.f15787c) {
            if (c2203a != null) {
                c2203a.clearSentEos();
            }
        }
        return enforceClippingRange(this.f15785a.seekToUs(j), this.f15789e, this.f15790f);
    }

    @Override // p000.mja
    public long selectTracks(of5[] of5VarArr, boolean[] zArr, mle[] mleVarArr, boolean[] zArr2, long j) {
        this.f15787c = new C2203a[mleVarArr.length];
        mle[] mleVarArr2 = new mle[mleVarArr.length];
        int i = 0;
        while (true) {
            mle mleVar = null;
            if (i >= mleVarArr.length) {
                break;
            }
            C2203a[] c2203aArr = this.f15787c;
            C2203a c2203a = (C2203a) mleVarArr[i];
            c2203aArr[i] = c2203a;
            if (c2203a != null) {
                mleVar = c2203a.f15792a;
            }
            mleVarArr2[i] = mleVar;
            i++;
        }
        long jSelectTracks = this.f15785a.selectTracks(of5VarArr, zArr, mleVarArr2, zArr2, j);
        long jEnforceClippingRange = enforceClippingRange(jSelectTracks, j, this.f15790f);
        this.f15788d = (m3769a() && shouldKeepInitialDiscontinuity(jSelectTracks, j, of5VarArr)) ? jEnforceClippingRange : -9223372036854775807L;
        for (int i2 = 0; i2 < mleVarArr.length; i2++) {
            mle mleVar2 = mleVarArr2[i2];
            if (mleVar2 == null) {
                this.f15787c[i2] = null;
            } else {
                C2203a[] c2203aArr2 = this.f15787c;
                C2203a c2203a2 = c2203aArr2[i2];
                if (c2203a2 == null || c2203a2.f15792a != mleVar2) {
                    c2203aArr2[i2] = new C2203a(mleVar2);
                }
            }
            mleVarArr[i2] = this.f15787c[i2];
        }
        return jEnforceClippingRange;
    }

    public void setClippingError(e52.C5121d c5121d) {
        this.f15791m = c5121d;
    }

    public void updateClipping(long j, long j2) {
        this.f15789e = j;
        this.f15790f = j2;
    }

    @Override // p000.yye.InterfaceC15893a
    public void onContinueLoadingRequested(mja mjaVar) {
        ((mja.InterfaceC9368a) v80.checkNotNull(this.f15786b)).onContinueLoadingRequested(this);
    }
}
