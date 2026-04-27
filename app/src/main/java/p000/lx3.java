package p000;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
public final class lx3 implements d0c {

    /* JADX INFO: renamed from: m */
    public static final int f59113m = 72000;

    /* JADX INFO: renamed from: n */
    public static final int f59114n = 100000;

    /* JADX INFO: renamed from: o */
    public static final int f59115o = 30000;

    /* JADX INFO: renamed from: p */
    public static final int f59116p = 0;

    /* JADX INFO: renamed from: q */
    public static final int f59117q = 1;

    /* JADX INFO: renamed from: r */
    public static final int f59118r = 2;

    /* JADX INFO: renamed from: s */
    public static final int f59119s = 3;

    /* JADX INFO: renamed from: t */
    public static final int f59120t = 4;

    /* JADX INFO: renamed from: a */
    public final b0c f59121a;

    /* JADX INFO: renamed from: b */
    public final long f59122b;

    /* JADX INFO: renamed from: c */
    public final long f59123c;

    /* JADX INFO: renamed from: d */
    public final e6g f59124d;

    /* JADX INFO: renamed from: e */
    public int f59125e;

    /* JADX INFO: renamed from: f */
    public long f59126f;

    /* JADX INFO: renamed from: g */
    public long f59127g;

    /* JADX INFO: renamed from: h */
    public long f59128h;

    /* JADX INFO: renamed from: i */
    public long f59129i;

    /* JADX INFO: renamed from: j */
    public long f59130j;

    /* JADX INFO: renamed from: k */
    public long f59131k;

    /* JADX INFO: renamed from: l */
    public long f59132l;

    /* JADX INFO: renamed from: lx3$b */
    public final class C9026b implements gue {
        private C9026b() {
        }

        @Override // p000.gue
        public long getDurationUs() {
            return lx3.this.f59124d.m9753a(lx3.this.f59126f);
        }

        @Override // p000.gue
        public gue.C6548a getSeekPoints(long j) {
            return new gue.C6548a(new lue(j, t0i.constrainValue((lx3.this.f59122b + BigInteger.valueOf(lx3.this.f59124d.m9754b(j)).multiply(BigInteger.valueOf(lx3.this.f59123c - lx3.this.f59122b)).divide(BigInteger.valueOf(lx3.this.f59126f)).longValue()) - 30000, lx3.this.f59122b, lx3.this.f59123c - 1)));
        }

        @Override // p000.gue
        public boolean isSeekable() {
            return true;
        }
    }

    public lx3(e6g e6gVar, long j, long j2, long j3, long j4, boolean z) {
        v80.checkArgument(j >= 0 && j2 > j);
        this.f59124d = e6gVar;
        this.f59122b = j;
        this.f59123c = j2;
        if (j3 == j2 - j || z) {
            this.f59126f = j4;
            this.f59125e = 4;
        } else {
            this.f59125e = 0;
        }
        this.f59121a = new b0c();
    }

    private long getNextSeekPosition(ak5 ak5Var) throws IOException {
        if (this.f59129i == this.f59130j) {
            return -1L;
        }
        long position = ak5Var.getPosition();
        if (!this.f59121a.skipToNextPage(ak5Var, this.f59130j)) {
            long j = this.f59129i;
            if (j != position) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f59121a.populate(ak5Var, false);
        ak5Var.resetPeekPosition();
        long j2 = this.f59128h;
        b0c b0cVar = this.f59121a;
        long j3 = b0cVar.f12339c;
        long j4 = j2 - j3;
        int i = b0cVar.f12344h + b0cVar.f12345i;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        if (j4 < 0) {
            this.f59130j = position;
            this.f59132l = j3;
        } else {
            this.f59129i = ak5Var.getPosition() + ((long) i);
            this.f59131k = this.f59121a.f12339c;
        }
        long j5 = this.f59130j;
        long j6 = this.f59129i;
        if (j5 - j6 < 100000) {
            this.f59130j = j6;
            return j6;
        }
        long position2 = ak5Var.getPosition() - (((long) i) * (j4 <= 0 ? 2L : 1L));
        long j7 = this.f59130j;
        long j8 = this.f59129i;
        return t0i.constrainValue(position2 + ((j4 * (j7 - j8)) / (this.f59132l - this.f59131k)), j8, j7 - 1);
    }

    private void skipToPageOfTargetGranule(ak5 ak5Var) throws IOException {
        while (true) {
            this.f59121a.skipToNextPage(ak5Var);
            this.f59121a.populate(ak5Var, false);
            b0c b0cVar = this.f59121a;
            if (b0cVar.f12339c > this.f59128h) {
                ak5Var.resetPeekPosition();
                return;
            } else {
                ak5Var.skipFully(b0cVar.f12344h + b0cVar.f12345i);
                this.f59129i = ak5Var.getPosition();
                this.f59131k = this.f59121a.f12339c;
            }
        }
    }

    @fdi
    /* JADX INFO: renamed from: e */
    public long m16453e(ak5 ak5Var) throws IOException {
        this.f59121a.reset();
        if (!this.f59121a.skipToNextPage(ak5Var)) {
            throw new EOFException();
        }
        this.f59121a.populate(ak5Var, false);
        b0c b0cVar = this.f59121a;
        ak5Var.skipFully(b0cVar.f12344h + b0cVar.f12345i);
        long j = this.f59121a.f12339c;
        while (true) {
            b0c b0cVar2 = this.f59121a;
            if ((b0cVar2.f12338b & 4) == 4 || !b0cVar2.skipToNextPage(ak5Var) || ak5Var.getPosition() >= this.f59123c || !this.f59121a.populate(ak5Var, true)) {
                break;
            }
            b0c b0cVar3 = this.f59121a;
            if (!ek5.skipFullyQuietly(ak5Var, b0cVar3.f12344h + b0cVar3.f12345i)) {
                break;
            }
            j = this.f59121a.f12339c;
        }
        return j;
    }

    @Override // p000.d0c
    public long read(ak5 ak5Var) throws IOException {
        int i = this.f59125e;
        if (i == 0) {
            long position = ak5Var.getPosition();
            this.f59127g = position;
            this.f59125e = 1;
            long j = this.f59123c - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long nextSeekPosition = getNextSeekPosition(ak5Var);
                if (nextSeekPosition != -1) {
                    return nextSeekPosition;
                }
                this.f59125e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            skipToPageOfTargetGranule(ak5Var);
            this.f59125e = 4;
            return -(this.f59131k + 2);
        }
        this.f59126f = m16453e(ak5Var);
        this.f59125e = 4;
        return this.f59127g;
    }

    @Override // p000.d0c
    public void startSeek(long j) {
        this.f59128h = t0i.constrainValue(j, 0L, this.f59126f - 1);
        this.f59125e = 2;
        this.f59129i = this.f59122b;
        this.f59130j = this.f59123c;
        this.f59131k = 0L;
        this.f59132l = this.f59126f;
    }

    @Override // p000.d0c
    @hib
    public C9026b createSeekMap() {
        if (this.f59126f != 0) {
            return new C9026b();
        }
        return null;
    }
}
