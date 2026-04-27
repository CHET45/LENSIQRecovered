package p000;

import p000.ps3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class vs3 implements ps3.InterfaceC11094f {

    /* JADX INFO: renamed from: i */
    public static final int f92115i = 250000;

    /* JADX INFO: renamed from: j */
    public static final int f92116j = 750000;

    /* JADX INFO: renamed from: k */
    public static final int f92117k = 4;

    /* JADX INFO: renamed from: l */
    public static final int f92118l = 250000;

    /* JADX INFO: renamed from: m */
    public static final int f92119m = 50000000;

    /* JADX INFO: renamed from: n */
    public static final int f92120n = 2;

    /* JADX INFO: renamed from: o */
    public static final int f92121o = 4;

    /* JADX INFO: renamed from: b */
    public final int f92122b;

    /* JADX INFO: renamed from: c */
    public final int f92123c;

    /* JADX INFO: renamed from: d */
    public final int f92124d;

    /* JADX INFO: renamed from: e */
    public final int f92125e;

    /* JADX INFO: renamed from: f */
    public final int f92126f;

    /* JADX INFO: renamed from: g */
    public final int f92127g;

    /* JADX INFO: renamed from: h */
    public final int f92128h;

    /* JADX INFO: renamed from: vs3$a */
    public static class C14241a {

        /* JADX INFO: renamed from: a */
        public int f92129a = 250000;

        /* JADX INFO: renamed from: b */
        public int f92130b = 750000;

        /* JADX INFO: renamed from: c */
        public int f92131c = 4;

        /* JADX INFO: renamed from: d */
        public int f92132d = 250000;

        /* JADX INFO: renamed from: e */
        public int f92133e = 50000000;

        /* JADX INFO: renamed from: f */
        public int f92134f = 2;

        /* JADX INFO: renamed from: g */
        public int f92135g = 4;

        public vs3 build() {
            return new vs3(this);
        }

        @op1
        public C14241a setAc3BufferMultiplicationFactor(int i) {
            this.f92134f = i;
            return this;
        }

        @op1
        public C14241a setDtshdBufferMultiplicationFactor(int i) {
            this.f92135g = i;
            return this;
        }

        @op1
        public C14241a setMaxPcmBufferDurationUs(int i) {
            this.f92130b = i;
            return this;
        }

        @op1
        public C14241a setMinPcmBufferDurationUs(int i) {
            this.f92129a = i;
            return this;
        }

        @op1
        public C14241a setOffloadBufferDurationUs(int i) {
            this.f92133e = i;
            return this;
        }

        @op1
        public C14241a setPassthroughBufferDurationUs(int i) {
            this.f92132d = i;
            return this;
        }

        @op1
        public C14241a setPcmBufferMultiplicationFactor(int i) {
            this.f92131c = i;
            return this;
        }
    }

    public vs3(C14241a c14241a) {
        this.f92122b = c14241a.f92129a;
        this.f92123c = c14241a.f92130b;
        this.f92124d = c14241a.f92131c;
        this.f92125e = c14241a.f92132d;
        this.f92126f = c14241a.f92133e;
        this.f92127g = c14241a.f92134f;
        this.f92128h = c14241a.f92135g;
    }

    /* JADX INFO: renamed from: a */
    public static int m24164a(int i, int i2, int i3) {
        return rd8.checkedCast(((((long) i) * ((long) i2)) * ((long) i3)) / 1000000);
    }

    private static int getNonPcmMaximumEncodedRateBytesPerSecond(int i) {
        int maximumEncodedRateBytesPerSecond = ek5.getMaximumEncodedRateBytesPerSecond(i);
        v80.checkState(maximumEncodedRateBytesPerSecond != -2147483647);
        return maximumEncodedRateBytesPerSecond;
    }

    /* JADX INFO: renamed from: b */
    public int m24165b(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 == 0) {
            return m24168e(i, i5, i4);
        }
        if (i3 == 1) {
            return m24166c(i2);
        }
        if (i3 == 2) {
            return m24167d(i2, i6);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: c */
    public int m24166c(int i) {
        return rd8.checkedCast((((long) this.f92126f) * ((long) getNonPcmMaximumEncodedRateBytesPerSecond(i))) / 1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m24167d(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f92125e
            r1 = 5
            r2 = 8
            if (r4 != r1) goto Lb
            int r1 = r3.f92127g
        L9:
            int r0 = r0 * r1
            goto L10
        Lb:
            if (r4 != r2) goto L10
            int r1 = r3.f92128h
            goto L9
        L10:
            r1 = -1
            if (r5 == r1) goto L1a
            java.math.RoundingMode r4 = java.math.RoundingMode.CEILING
            int r4 = p000.w68.divide(r5, r2, r4)
            goto L1e
        L1a:
            int r4 = getNonPcmMaximumEncodedRateBytesPerSecond(r4)
        L1e:
            long r0 = (long) r0
            long r4 = (long) r4
            long r0 = r0 * r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r4
            int r4 = p000.rd8.checkedCast(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vs3.m24167d(int, int):int");
    }

    /* JADX INFO: renamed from: e */
    public int m24168e(int i, int i2, int i3) {
        return t0i.constrainValue(i * this.f92124d, m24164a(this.f92122b, i2, i3), m24164a(this.f92123c, i2, i3));
    }

    @Override // p000.ps3.InterfaceC11094f
    public int getBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, int i6, double d) {
        return (((Math.max(i, (int) (((double) m24165b(i, i2, i3, i4, i5, i6)) * d)) + i4) - 1) / i4) * i4;
    }
}
