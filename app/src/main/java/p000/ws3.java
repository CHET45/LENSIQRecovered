package p000;

import java.math.RoundingMode;
import p000.us3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ws3 implements us3.InterfaceC13681g {

    /* JADX INFO: renamed from: h */
    public static final int f95259h = 250000;

    /* JADX INFO: renamed from: i */
    public static final int f95260i = 750000;

    /* JADX INFO: renamed from: j */
    public static final int f95261j = 4;

    /* JADX INFO: renamed from: k */
    public static final int f95262k = 250000;

    /* JADX INFO: renamed from: l */
    public static final int f95263l = 50000000;

    /* JADX INFO: renamed from: m */
    public static final int f95264m = 2;

    /* JADX INFO: renamed from: b */
    public final int f95265b;

    /* JADX INFO: renamed from: c */
    public final int f95266c;

    /* JADX INFO: renamed from: d */
    public final int f95267d;

    /* JADX INFO: renamed from: e */
    public final int f95268e;

    /* JADX INFO: renamed from: f */
    public final int f95269f;

    /* JADX INFO: renamed from: g */
    public final int f95270g;

    /* JADX INFO: renamed from: ws3$a */
    public static class C14767a {

        /* JADX INFO: renamed from: a */
        public int f95271a = 250000;

        /* JADX INFO: renamed from: b */
        public int f95272b = 750000;

        /* JADX INFO: renamed from: c */
        public int f95273c = 4;

        /* JADX INFO: renamed from: d */
        public int f95274d = 250000;

        /* JADX INFO: renamed from: e */
        public int f95275e = 50000000;

        /* JADX INFO: renamed from: f */
        public int f95276f = 2;

        public ws3 build() {
            return new ws3(this);
        }

        @op1
        public C14767a setAc3BufferMultiplicationFactor(int i) {
            this.f95276f = i;
            return this;
        }

        @op1
        public C14767a setMaxPcmBufferDurationUs(int i) {
            this.f95272b = i;
            return this;
        }

        @op1
        public C14767a setMinPcmBufferDurationUs(int i) {
            this.f95271a = i;
            return this;
        }

        @op1
        public C14767a setOffloadBufferDurationUs(int i) {
            this.f95275e = i;
            return this;
        }

        @op1
        public C14767a setPassthroughBufferDurationUs(int i) {
            this.f95274d = i;
            return this;
        }

        @op1
        public C14767a setPcmBufferMultiplicationFactor(int i) {
            this.f95273c = i;
            return this;
        }
    }

    public ws3(C14767a c14767a) {
        this.f95265b = c14767a.f95271a;
        this.f95266c = c14767a.f95272b;
        this.f95267d = c14767a.f95273c;
        this.f95268e = c14767a.f95274d;
        this.f95269f = c14767a.f95275e;
        this.f95270g = c14767a.f95276f;
    }

    /* JADX INFO: renamed from: a */
    public static int m24769a(int i, int i2, int i3) {
        return rd8.checkedCast(((((long) i) * ((long) i2)) * ((long) i3)) / 1000000);
    }

    /* JADX INFO: renamed from: c */
    public static int m24770c(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m24771b(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 == 0) {
            return m24774f(i, i5, i4);
        }
        if (i3 == 1) {
            return m24772d(i2);
        }
        if (i3 == 2) {
            return m24773e(i2, i6);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: d */
    public int m24772d(int i) {
        return rd8.checkedCast((((long) this.f95269f) * ((long) m24770c(i))) / 1000000);
    }

    /* JADX INFO: renamed from: e */
    public int m24773e(int i, int i2) {
        int i3 = this.f95268e;
        if (i == 5) {
            i3 *= this.f95270g;
        }
        return rd8.checkedCast((((long) i3) * ((long) (i2 != -1 ? w68.divide(i2, 8, RoundingMode.CEILING) : m24770c(i)))) / 1000000);
    }

    /* JADX INFO: renamed from: f */
    public int m24774f(int i, int i2, int i3) {
        return x0i.constrainValue(i * this.f95267d, m24769a(this.f95265b, i2, i3), m24769a(this.f95266c, i2, i3));
    }

    @Override // p000.us3.InterfaceC13681g
    public int getBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, int i6, double d) {
        return (((Math.max(i, (int) (((double) m24771b(i, i2, i3, i4, i5, i6)) * d)) + i4) - 1) / i4) * i4;
    }
}
