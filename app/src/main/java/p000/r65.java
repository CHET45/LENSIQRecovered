package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class r65 implements nle {

    /* JADX INFO: renamed from: a */
    public final kq6 f77111a;

    /* JADX INFO: renamed from: c */
    public long[] f77113c;

    /* JADX INFO: renamed from: d */
    public boolean f77114d;

    /* JADX INFO: renamed from: e */
    public a75 f77115e;

    /* JADX INFO: renamed from: f */
    public boolean f77116f;

    /* JADX INFO: renamed from: m */
    public int f77117m;

    /* JADX INFO: renamed from: b */
    public final n65 f77112b = new n65();

    /* JADX INFO: renamed from: C */
    public long f77110C = -9223372036854775807L;

    public r65(a75 a75Var, kq6 kq6Var, boolean z) {
        this.f77111a = kq6Var;
        this.f77115e = a75Var;
        this.f77113c = a75Var.f530b;
        updateEventStream(a75Var, z);
    }

    public String eventStreamId() {
        return this.f77115e.m172id();
    }

    @Override // p000.nle
    public boolean isReady() {
        return true;
    }

    @Override // p000.nle
    public void maybeThrowError() throws IOException {
    }

    @Override // p000.nle
    public int readData(nq6 nq6Var, sl3 sl3Var, int i) {
        int i2 = this.f77117m;
        boolean z = i2 == this.f77113c.length;
        if (z && !this.f77114d) {
            sl3Var.setFlags(4);
            return -4;
        }
        if ((i & 2) != 0 || !this.f77116f) {
            nq6Var.f65258b = this.f77111a;
            this.f77116f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.f77117m = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrEncode = this.f77112b.encode(this.f77115e.f529a[i2]);
            sl3Var.ensureSpaceForWrite(bArrEncode.length);
            sl3Var.f82162d.put(bArrEncode);
        }
        sl3Var.f82164f = this.f77113c[i2];
        sl3Var.setFlags(1);
        return -4;
    }

    public void seekToUs(long j) {
        int iBinarySearchCeil = x0i.binarySearchCeil(this.f77113c, j, true, false);
        this.f77117m = iBinarySearchCeil;
        if (!this.f77114d || iBinarySearchCeil != this.f77113c.length) {
            j = -9223372036854775807L;
        }
        this.f77110C = j;
    }

    @Override // p000.nle
    public int skipData(long j) {
        int iMax = Math.max(this.f77117m, x0i.binarySearchCeil(this.f77113c, j, true, false));
        int i = iMax - this.f77117m;
        this.f77117m = iMax;
        return i;
    }

    public void updateEventStream(a75 a75Var, boolean z) {
        int i = this.f77117m;
        long j = i == 0 ? -9223372036854775807L : this.f77113c[i - 1];
        this.f77114d = z;
        this.f77115e = a75Var;
        long[] jArr = a75Var.f530b;
        this.f77113c = jArr;
        long j2 = this.f77110C;
        if (j2 != -9223372036854775807L) {
            seekToUs(j2);
        } else if (j != -9223372036854775807L) {
            this.f77117m = x0i.binarySearchCeil(jArr, j, false, false);
        }
    }
}
