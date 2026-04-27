package p000;

import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public enum yq5 implements w98.InterfaceC14497d {
    FIELD_BEHAVIOR_UNSPECIFIED(0),
    OPTIONAL(1),
    REQUIRED(2),
    OUTPUT_ONLY(3),
    INPUT_ONLY(4),
    IMMUTABLE(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: F */
    public static final int f102633F = 0;

    /* JADX INFO: renamed from: H */
    public static final int f102634H = 1;

    /* JADX INFO: renamed from: L */
    public static final int f102635L = 2;

    /* JADX INFO: renamed from: M */
    public static final int f102636M = 3;

    /* JADX INFO: renamed from: N */
    public static final int f102637N = 4;

    /* JADX INFO: renamed from: Q */
    public static final int f102638Q = 5;

    /* JADX INFO: renamed from: X */
    public static final w98.InterfaceC14498e<yq5> f102639X = new w98.InterfaceC14498e<yq5>() { // from class: yq5.a
        @Override // p000.w98.InterfaceC14498e
        public yq5 findValueByNumber(int i) {
            return yq5.forNumber(i);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f102647a;

    /* JADX INFO: renamed from: yq5$b */
    public static final class C15762b implements w98.InterfaceC14499f {

        /* JADX INFO: renamed from: a */
        public static final w98.InterfaceC14499f f102648a = new C15762b();

        private C15762b() {
        }

        @Override // p000.w98.InterfaceC14499f
        public boolean isInRange(int i) {
            return yq5.forNumber(i) != null;
        }
    }

    yq5(int i) {
        this.f102647a = i;
    }

    public static yq5 forNumber(int i) {
        if (i == 0) {
            return FIELD_BEHAVIOR_UNSPECIFIED;
        }
        if (i == 1) {
            return OPTIONAL;
        }
        if (i == 2) {
            return REQUIRED;
        }
        if (i == 3) {
            return OUTPUT_ONLY;
        }
        if (i == 4) {
            return INPUT_ONLY;
        }
        if (i != 5) {
            return null;
        }
        return IMMUTABLE;
    }

    public static w98.InterfaceC14498e<yq5> internalGetValueMap() {
        return f102639X;
    }

    public static w98.InterfaceC14499f internalGetVerifier() {
        return C15762b.f102648a;
    }

    @Override // p000.w98.InterfaceC14497d
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f102647a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static yq5 valueOf(int i) {
        return forNumber(i);
    }
}
