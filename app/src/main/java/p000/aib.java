package p000;

import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
public enum aib implements v98.InterfaceC13947c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: d */
    public static final int f1656d = 0;

    /* JADX INFO: renamed from: e */
    public static final v98.InterfaceC13948d<aib> f1657e = new v98.InterfaceC13948d<aib>() { // from class: aib.a
        @Override // p000.v98.InterfaceC13948d
        public aib findValueByNumber(int number) {
            return aib.forNumber(number);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f1659a;

    /* JADX INFO: renamed from: aib$b */
    public static final class C0266b implements v98.InterfaceC13949e {

        /* JADX INFO: renamed from: a */
        public static final v98.InterfaceC13949e f1660a = new C0266b();

        private C0266b() {
        }

        @Override // p000.v98.InterfaceC13949e
        public boolean isInRange(int number) {
            return aib.forNumber(number) != null;
        }
    }

    aib(int value) {
        this.f1659a = value;
    }

    public static aib forNumber(int value) {
        if (value != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static v98.InterfaceC13948d<aib> internalGetValueMap() {
        return f1657e;
    }

    public static v98.InterfaceC13949e internalGetVerifier() {
        return C0266b.f1660a;
    }

    @Override // p000.v98.InterfaceC13947c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f1659a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static aib valueOf(int value) {
        return forNumber(value);
    }
}
