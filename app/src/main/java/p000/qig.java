package p000;

import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public enum qig implements w98.InterfaceC14497d {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: C */
    public static final int f74543C = 2;

    /* JADX INFO: renamed from: F */
    public static final w98.InterfaceC14498e<qig> f74544F = new w98.InterfaceC14498e<qig>() { // from class: qig.a
        @Override // p000.w98.InterfaceC14498e
        public qig findValueByNumber(int number) {
            return qig.forNumber(number);
        }
    };

    /* JADX INFO: renamed from: f */
    public static final int f74550f = 0;

    /* JADX INFO: renamed from: m */
    public static final int f74551m = 1;

    /* JADX INFO: renamed from: a */
    public final int f74552a;

    /* JADX INFO: renamed from: qig$b */
    public static final class C11486b implements w98.InterfaceC14499f {

        /* JADX INFO: renamed from: a */
        public static final w98.InterfaceC14499f f74553a = new C11486b();

        private C11486b() {
        }

        @Override // p000.w98.InterfaceC14499f
        public boolean isInRange(int number) {
            return qig.forNumber(number) != null;
        }
    }

    qig(int value) {
        this.f74552a = value;
    }

    public static qig forNumber(int value) {
        if (value == 0) {
            return SYNTAX_PROTO2;
        }
        if (value == 1) {
            return SYNTAX_PROTO3;
        }
        if (value != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    public static w98.InterfaceC14498e<qig> internalGetValueMap() {
        return f74544F;
    }

    public static w98.InterfaceC14499f internalGetVerifier() {
        return C11486b.f74553a;
    }

    @Override // p000.w98.InterfaceC14497d
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f74552a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static qig valueOf(int value) {
        return forNumber(value);
    }
}
