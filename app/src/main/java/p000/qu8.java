package p000;

import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public enum qu8 implements w98.InterfaceC14497d {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: F */
    public static final int f75781F = 0;

    /* JADX INFO: renamed from: H */
    public static final int f75782H = 1;

    /* JADX INFO: renamed from: L */
    public static final int f75783L = 2;

    /* JADX INFO: renamed from: M */
    public static final int f75784M = 3;

    /* JADX INFO: renamed from: N */
    public static final int f75785N = 4;

    /* JADX INFO: renamed from: Q */
    public static final int f75786Q = 5;

    /* JADX INFO: renamed from: X */
    public static final w98.InterfaceC14498e<qu8> f75787X = new w98.InterfaceC14498e<qu8>() { // from class: qu8.a
        @Override // p000.w98.InterfaceC14498e
        public qu8 findValueByNumber(int i) {
            return qu8.forNumber(i);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f75795a;

    /* JADX INFO: renamed from: qu8$b */
    public static final class C11699b implements w98.InterfaceC14499f {

        /* JADX INFO: renamed from: a */
        public static final w98.InterfaceC14499f f75796a = new C11699b();

        private C11699b() {
        }

        @Override // p000.w98.InterfaceC14499f
        public boolean isInRange(int i) {
            return qu8.forNumber(i) != null;
        }
    }

    qu8(int i) {
        this.f75795a = i;
    }

    public static qu8 forNumber(int i) {
        if (i == 0) {
            return LAUNCH_STAGE_UNSPECIFIED;
        }
        if (i == 1) {
            return EARLY_ACCESS;
        }
        if (i == 2) {
            return ALPHA;
        }
        if (i == 3) {
            return BETA;
        }
        if (i == 4) {
            return GA;
        }
        if (i != 5) {
            return null;
        }
        return DEPRECATED;
    }

    public static w98.InterfaceC14498e<qu8> internalGetValueMap() {
        return f75787X;
    }

    public static w98.InterfaceC14499f internalGetVerifier() {
        return C11699b.f75796a;
    }

    @Override // p000.w98.InterfaceC14497d
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f75795a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static qu8 valueOf(int i) {
        return forNumber(i);
    }
}
