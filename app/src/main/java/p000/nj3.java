package p000;

import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public enum nj3 implements w98.InterfaceC14497d {
    DAY_OF_WEEK_UNSPECIFIED(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: L */
    public static final int f64728L = 0;

    /* JADX INFO: renamed from: M */
    public static final int f64729M = 1;

    /* JADX INFO: renamed from: M1 */
    public static final int f64730M1 = 7;

    /* JADX INFO: renamed from: N */
    public static final int f64731N = 2;

    /* JADX INFO: renamed from: Q */
    public static final int f64732Q = 3;

    /* JADX INFO: renamed from: V1 */
    public static final w98.InterfaceC14498e<nj3> f64733V1 = new w98.InterfaceC14498e<nj3>() { // from class: nj3.a
        @Override // p000.w98.InterfaceC14498e
        public nj3 findValueByNumber(int i) {
            return nj3.forNumber(i);
        }
    };

    /* JADX INFO: renamed from: X */
    public static final int f64734X = 4;

    /* JADX INFO: renamed from: Y */
    public static final int f64735Y = 5;

    /* JADX INFO: renamed from: Z */
    public static final int f64736Z = 6;

    /* JADX INFO: renamed from: a */
    public final int f64744a;

    /* JADX INFO: renamed from: nj3$b */
    public static final class C9903b implements w98.InterfaceC14499f {

        /* JADX INFO: renamed from: a */
        public static final w98.InterfaceC14499f f64745a = new C9903b();

        private C9903b() {
        }

        @Override // p000.w98.InterfaceC14499f
        public boolean isInRange(int i) {
            return nj3.forNumber(i) != null;
        }
    }

    nj3(int i) {
        this.f64744a = i;
    }

    public static nj3 forNumber(int i) {
        switch (i) {
            case 0:
                return DAY_OF_WEEK_UNSPECIFIED;
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                return null;
        }
    }

    public static w98.InterfaceC14498e<nj3> internalGetValueMap() {
        return f64733V1;
    }

    public static w98.InterfaceC14499f internalGetVerifier() {
        return C9903b.f64745a;
    }

    @Override // p000.w98.InterfaceC14497d
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f64744a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static nj3 valueOf(int i) {
        return forNumber(i);
    }
}
