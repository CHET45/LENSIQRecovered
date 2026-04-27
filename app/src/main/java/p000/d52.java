package p000;

import java.io.IOException;
import p000.f52;
import p000.nja;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d52 implements nja, nja.InterfaceC9906a {

    /* JADX INFO: renamed from: a */
    public final nja f28448a;

    /* JADX INFO: renamed from: b */
    @hib
    public nja.InterfaceC9906a f28449b;

    /* JADX INFO: renamed from: c */
    public C4614a[] f28450c = new C4614a[0];

    /* JADX INFO: renamed from: d */
    public long f28451d;

    /* JADX INFO: renamed from: e */
    public long f28452e;

    /* JADX INFO: renamed from: f */
    public long f28453f;

    /* JADX INFO: renamed from: m */
    @hib
    public f52.C5598b f28454m;

    /* JADX INFO: renamed from: d52$a */
    public final class C4614a implements nle {

        /* JADX INFO: renamed from: a */
        public final nle f28455a;

        /* JADX INFO: renamed from: b */
        public boolean f28456b;

        public C4614a(nle nleVar) {
            this.f28455a = nleVar;
        }

        public void clearSentEos() {
            this.f28456b = false;
        }

        @Override // p000.nle
        public boolean isReady() {
            return !d52.this.m8882a() && this.f28455a.isReady();
        }

        @Override // p000.nle
        public void maybeThrowError() throws IOException {
            this.f28455a.maybeThrowError();
        }

        @Override // p000.nle
        public int readData(nq6 nq6Var, sl3 sl3Var, int i) {
            if (d52.this.m8882a()) {
                return -3;
            }
            if (this.f28456b) {
                sl3Var.setFlags(4);
                return -4;
            }
            long bufferedPositionUs = d52.this.getBufferedPositionUs();
            int data = this.f28455a.readData(nq6Var, sl3Var, i);
            if (data == -5) {
                kq6 kq6Var = (kq6) u80.checkNotNull(nq6Var.f65258b);
                int i2 = kq6Var.f55011h2;
                if (i2 != 0 || kq6Var.f55012i2 != 0) {
                    d52 d52Var = d52.this;
                    if (d52Var.f28452e != 0) {
                        i2 = 0;
                    }
                    nq6Var.f65258b = kq6Var.buildUpon().setEncoderDelay(i2).setEncoderPadding(d52Var.f28453f == Long.MIN_VALUE ? kq6Var.f55012i2 : 0).build();
                }
                return -5;
            }
            long j = d52.this.f28453f;
            if (j == Long.MIN_VALUE || ((data != -4 || sl3Var.f82164f < j) && !(data == -3 && bufferedPositionUs == Long.MIN_VALUE && !sl3Var.f82163e))) {
                return data;
            }
            sl3Var.clear();
            sl3Var.setFlags(4);
            this.f28456b = true;
            return -4;
        }

        @Override // p000.nle
        public int skipData(long j) {
            if (d52.this.m8882a()) {
                return -3;
            }
            return this.f28455a.skipData(j);
        }
    }

    public d52(nja njaVar, boolean z, long j, long j2) {
        this.f28448a = njaVar;
        this.f28451d = z ? j : -9223372036854775807L;
        this.f28452e = j;
        this.f28453f = j2;
    }

    private iue clipSeekParameters(long j, iue iueVar) {
        long jConstrainValue = x0i.constrainValue(iueVar.f48525a, 0L, j - this.f28452e);
        long j2 = iueVar.f48526b;
        long j3 = this.f28453f;
        long jConstrainValue2 = x0i.constrainValue(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (jConstrainValue == iueVar.f48525a && jConstrainValue2 == iueVar.f48526b) ? iueVar : new iue(jConstrainValue, jConstrainValue2);
    }

    private static boolean shouldKeepInitialDiscontinuity(long j, pf5[] pf5VarArr) {
        if (j != 0) {
            for (pf5 pf5Var : pf5VarArr) {
                if (pf5Var != null) {
                    kq6 selectedFormat = pf5Var.getSelectedFormat();
                    if (!sva.allSamplesAreSyncSamples(selectedFormat.f54989M, selectedFormat.f54986F)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m8882a() {
        return this.f28451d != -9223372036854775807L;
    }

    @Override // p000.nja, p000.zye
    public boolean continueLoading(long j) {
        return this.f28448a.continueLoading(j);
    }

    @Override // p000.nja
    public void discardBuffer(long j, boolean z) {
        this.f28448a.discardBuffer(j, z);
    }

    @Override // p000.nja
    public long getAdjustedSeekPositionUs(long j, iue iueVar) {
        long j2 = this.f28452e;
        if (j == j2) {
            return j2;
        }
        return this.f28448a.getAdjustedSeekPositionUs(j, clipSeekParameters(j, iueVar));
    }

    @Override // p000.nja, p000.zye
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f28448a.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j = this.f28453f;
            if (j == Long.MIN_VALUE || bufferedPositionUs < j) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p000.nja, p000.zye
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f28448a.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j = this.f28453f;
            if (j == Long.MIN_VALUE || nextLoadPositionUs < j) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p000.nja
    public m6h getTrackGroups() {
        return this.f28448a.getTrackGroups();
    }

    @Override // p000.nja, p000.zye
    public boolean isLoading() {
        return this.f28448a.isLoading();
    }

    @Override // p000.nja
    public void maybeThrowPrepareError() throws IOException {
        f52.C5598b c5598b = this.f28454m;
        if (c5598b != null) {
            throw c5598b;
        }
        this.f28448a.maybeThrowPrepareError();
    }

    @Override // p000.nja.InterfaceC9906a
    public void onPrepared(nja njaVar) {
        if (this.f28454m != null) {
            return;
        }
        ((nja.InterfaceC9906a) u80.checkNotNull(this.f28449b)).onPrepared(this);
    }

    @Override // p000.nja
    public void prepare(nja.InterfaceC9906a interfaceC9906a, long j) {
        this.f28449b = interfaceC9906a;
        this.f28448a.prepare(this, j);
    }

    @Override // p000.nja
    public long readDiscontinuity() {
        if (m8882a()) {
            long j = this.f28451d;
            this.f28451d = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j;
        }
        long discontinuity2 = this.f28448a.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        u80.checkState(discontinuity2 >= this.f28452e);
        long j2 = this.f28453f;
        u80.checkState(j2 == Long.MIN_VALUE || discontinuity2 <= j2);
        return discontinuity2;
    }

    @Override // p000.nja, p000.zye
    public void reevaluateBuffer(long j) {
        this.f28448a.reevaluateBuffer(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // p000.nja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long seekToUs(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f28451d = r0
            d52$a[] r0 = r5.f28450c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.clearSentEos()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            nja r0 = r5.f28448a
            long r0 = r0.seekToUs(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f28452e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f28453f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            p000.u80.checkState(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d52.seekToUs(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // p000.nja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long selectTracks(p000.pf5[] r13, boolean[] r14, p000.nle[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            d52$a[] r2 = new p000.d52.C4614a[r2]
            r0.f28450c = r2
            int r2 = r1.length
            nle[] r9 = new p000.nle[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            d52$a[] r3 = r0.f28450c
            r4 = r1[r2]
            d52$a r4 = (p000.d52.C4614a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            nle r11 = r4.f28455a
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            nja r2 = r0.f28448a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.selectTracks(r3, r4, r5, r6, r7)
            boolean r4 = r12.m8882a()
            if (r4 == 0) goto L43
            long r4 = r0.f28452e
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = shouldKeepInitialDiscontinuity(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.f28451d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f28452e
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L61
            long r4 = r0.f28453f
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L63
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L61
            goto L63
        L61:
            r4 = r10
            goto L64
        L63:
            r4 = 1
        L64:
            p000.u80.checkState(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            d52$a[] r4 = r0.f28450c
            r4[r10] = r11
            goto L84
        L73:
            d52$a[] r5 = r0.f28450c
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            nle r6 = r6.f28455a
            if (r6 == r4) goto L84
        L7d:
            d52$a r6 = new d52$a
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            d52$a[] r4 = r0.f28450c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d52.selectTracks(pf5[], boolean[], nle[], boolean[], long):long");
    }

    public void setClippingError(f52.C5598b c5598b) {
        this.f28454m = c5598b;
    }

    public void updateClipping(long j, long j2) {
        this.f28452e = j;
        this.f28453f = j2;
    }

    @Override // p000.zye.InterfaceC16321a
    public void onContinueLoadingRequested(nja njaVar) {
        ((nja.InterfaceC9906a) u80.checkNotNull(this.f28449b)).onContinueLoadingRequested(this);
    }
}
