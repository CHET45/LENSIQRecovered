package p000;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import p000.hue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class mx3 implements c0c {

    /* JADX INFO: renamed from: m */
    public static final int f62599m = 72000;

    /* JADX INFO: renamed from: n */
    public static final int f62600n = 100000;

    /* JADX INFO: renamed from: o */
    public static final int f62601o = 30000;

    /* JADX INFO: renamed from: p */
    public static final int f62602p = 0;

    /* JADX INFO: renamed from: q */
    public static final int f62603q = 1;

    /* JADX INFO: renamed from: r */
    public static final int f62604r = 2;

    /* JADX INFO: renamed from: s */
    public static final int f62605s = 3;

    /* JADX INFO: renamed from: t */
    public static final int f62606t = 4;

    /* JADX INFO: renamed from: a */
    public final a0c f62607a;

    /* JADX INFO: renamed from: b */
    public final long f62608b;

    /* JADX INFO: renamed from: c */
    public final long f62609c;

    /* JADX INFO: renamed from: d */
    public final f6g f62610d;

    /* JADX INFO: renamed from: e */
    public int f62611e;

    /* JADX INFO: renamed from: f */
    public long f62612f;

    /* JADX INFO: renamed from: g */
    public long f62613g;

    /* JADX INFO: renamed from: h */
    public long f62614h;

    /* JADX INFO: renamed from: i */
    public long f62615i;

    /* JADX INFO: renamed from: j */
    public long f62616j;

    /* JADX INFO: renamed from: k */
    public long f62617k;

    /* JADX INFO: renamed from: l */
    public long f62618l;

    /* JADX INFO: renamed from: mx3$b */
    public final class C9578b implements hue {
        private C9578b() {
        }

        @Override // p000.hue
        public long getDurationUs() {
            return mx3.this.f62610d.m10675a(mx3.this.f62612f);
        }

        @Override // p000.hue
        public hue.C7023a getSeekPoints(long j) {
            return new hue.C7023a(new kue(j, x0i.constrainValue((mx3.this.f62608b + BigInteger.valueOf(mx3.this.f62610d.m10676b(j)).multiply(BigInteger.valueOf(mx3.this.f62609c - mx3.this.f62608b)).divide(BigInteger.valueOf(mx3.this.f62612f)).longValue()) - 30000, mx3.this.f62608b, mx3.this.f62609c - 1)));
        }

        @Override // p000.hue
        public boolean isSeekable() {
            return true;
        }
    }

    public mx3(f6g f6gVar, long j, long j2, long j3, long j4, boolean z) {
        u80.checkArgument(j >= 0 && j2 > j);
        this.f62610d = f6gVar;
        this.f62608b = j;
        this.f62609c = j2;
        if (j3 == j2 - j || z) {
            this.f62612f = j4;
            this.f62611e = 4;
        } else {
            this.f62611e = 0;
        }
        this.f62607a = new a0c();
    }

    private long getNextSeekPosition(zj5 zj5Var) throws IOException {
        if (this.f62615i == this.f62616j) {
            return -1L;
        }
        long position = zj5Var.getPosition();
        if (!this.f62607a.skipToNextPage(zj5Var, this.f62616j)) {
            long j = this.f62615i;
            if (j != position) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f62607a.populate(zj5Var, false);
        zj5Var.resetPeekPosition();
        long j2 = this.f62614h;
        a0c a0cVar = this.f62607a;
        long j3 = a0cVar.f33c;
        long j4 = j2 - j3;
        int i = a0cVar.f38h + a0cVar.f39i;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        if (j4 < 0) {
            this.f62616j = position;
            this.f62618l = j3;
        } else {
            this.f62615i = zj5Var.getPosition() + ((long) i);
            this.f62617k = this.f62607a.f33c;
        }
        long j5 = this.f62616j;
        long j6 = this.f62615i;
        if (j5 - j6 < 100000) {
            this.f62616j = j6;
            return j6;
        }
        long position2 = zj5Var.getPosition() - (((long) i) * (j4 <= 0 ? 2L : 1L));
        long j7 = this.f62616j;
        long j8 = this.f62615i;
        return x0i.constrainValue(position2 + ((j4 * (j7 - j8)) / (this.f62618l - this.f62617k)), j8, j7 - 1);
    }

    private void skipToPageOfTargetGranule(zj5 zj5Var) throws IOException {
        while (true) {
            this.f62607a.skipToNextPage(zj5Var);
            this.f62607a.populate(zj5Var, false);
            a0c a0cVar = this.f62607a;
            if (a0cVar.f33c > this.f62614h) {
                zj5Var.resetPeekPosition();
                return;
            } else {
                zj5Var.skipFully(a0cVar.f38h + a0cVar.f39i);
                this.f62615i = zj5Var.getPosition();
                this.f62617k = this.f62607a.f33c;
            }
        }
    }

    @fdi
    /* JADX INFO: renamed from: e */
    public long m17650e(zj5 zj5Var) throws IOException {
        this.f62607a.reset();
        if (!this.f62607a.skipToNextPage(zj5Var)) {
            throw new EOFException();
        }
        this.f62607a.populate(zj5Var, false);
        a0c a0cVar = this.f62607a;
        zj5Var.skipFully(a0cVar.f38h + a0cVar.f39i);
        long j = this.f62607a.f33c;
        while (true) {
            a0c a0cVar2 = this.f62607a;
            if ((a0cVar2.f32b & 4) == 4 || !a0cVar2.skipToNextPage(zj5Var) || zj5Var.getPosition() >= this.f62609c || !this.f62607a.populate(zj5Var, true)) {
                break;
            }
            a0c a0cVar3 = this.f62607a;
            if (!dk5.skipFullyQuietly(zj5Var, a0cVar3.f38h + a0cVar3.f39i)) {
                break;
            }
            j = this.f62607a.f33c;
        }
        return j;
    }

    @Override // p000.c0c
    public long read(zj5 zj5Var) throws IOException {
        int i = this.f62611e;
        if (i == 0) {
            long position = zj5Var.getPosition();
            this.f62613g = position;
            this.f62611e = 1;
            long j = this.f62609c - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long nextSeekPosition = getNextSeekPosition(zj5Var);
                if (nextSeekPosition != -1) {
                    return nextSeekPosition;
                }
                this.f62611e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            skipToPageOfTargetGranule(zj5Var);
            this.f62611e = 4;
            return -(this.f62617k + 2);
        }
        this.f62612f = m17650e(zj5Var);
        this.f62611e = 4;
        return this.f62613g;
    }

    @Override // p000.c0c
    public void startSeek(long j) {
        this.f62614h = x0i.constrainValue(j, 0L, this.f62612f - 1);
        this.f62611e = 2;
        this.f62615i = this.f62608b;
        this.f62616j = this.f62609c;
        this.f62617k = 0L;
        this.f62618l = this.f62612f;
    }

    @Override // p000.c0c
    @hib
    public C9578b createSeekMap() {
        if (this.f62612f != 0) {
            return new C9578b();
        }
        return null;
    }
}
