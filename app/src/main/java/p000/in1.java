package p000;

import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public enum in1 implements w98.InterfaceC14497d {
    CALENDAR_PERIOD_UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    FORTNIGHT(3),
    MONTH(4),
    QUARTER(5),
    HALF(6),
    YEAR(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: L */
    public static final int f47556L = 0;

    /* JADX INFO: renamed from: M */
    public static final int f47557M = 1;

    /* JADX INFO: renamed from: M1 */
    public static final int f47558M1 = 7;

    /* JADX INFO: renamed from: N */
    public static final int f47559N = 2;

    /* JADX INFO: renamed from: Q */
    public static final int f47560Q = 3;

    /* JADX INFO: renamed from: V1 */
    public static final w98.InterfaceC14498e<in1> f47561V1 = new w98.InterfaceC14498e<in1>() { // from class: in1.a
        @Override // p000.w98.InterfaceC14498e
        public in1 findValueByNumber(int i) {
            return in1.forNumber(i);
        }
    };

    /* JADX INFO: renamed from: X */
    public static final int f47562X = 4;

    /* JADX INFO: renamed from: Y */
    public static final int f47563Y = 5;

    /* JADX INFO: renamed from: Z */
    public static final int f47564Z = 6;

    /* JADX INFO: renamed from: a */
    public final int f47572a;

    /* JADX INFO: renamed from: in1$b */
    public static final class C7515b implements w98.InterfaceC14499f {

        /* JADX INFO: renamed from: a */
        public static final w98.InterfaceC14499f f47573a = new C7515b();

        private C7515b() {
        }

        @Override // p000.w98.InterfaceC14499f
        public boolean isInRange(int i) {
            return in1.forNumber(i) != null;
        }
    }

    in1(int i) {
        this.f47572a = i;
    }

    public static in1 forNumber(int i) {
        switch (i) {
            case 0:
                return CALENDAR_PERIOD_UNSPECIFIED;
            case 1:
                return DAY;
            case 2:
                return WEEK;
            case 3:
                return FORTNIGHT;
            case 4:
                return MONTH;
            case 5:
                return QUARTER;
            case 6:
                return HALF;
            case 7:
                return YEAR;
            default:
                return null;
        }
    }

    public static w98.InterfaceC14498e<in1> internalGetValueMap() {
        return f47561V1;
    }

    public static w98.InterfaceC14499f internalGetVerifier() {
        return C7515b.f47573a;
    }

    @Override // p000.w98.InterfaceC14497d
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47572a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static in1 valueOf(int i) {
        return forNumber(i);
    }
}
