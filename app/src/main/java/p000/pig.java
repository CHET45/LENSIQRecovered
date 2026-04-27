package p000;

import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
public enum pig implements v98.InterfaceC13947c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: C */
    public static final int f71026C = 2;

    /* JADX INFO: renamed from: F */
    public static final v98.InterfaceC13948d<pig> f71027F = new v98.InterfaceC13948d<pig>() { // from class: pig.a
        @Override // p000.v98.InterfaceC13948d
        public pig findValueByNumber(int number) {
            return pig.forNumber(number);
        }
    };

    /* JADX INFO: renamed from: f */
    public static final int f71033f = 0;

    /* JADX INFO: renamed from: m */
    public static final int f71034m = 1;

    /* JADX INFO: renamed from: a */
    public final int f71035a;

    /* JADX INFO: renamed from: pig$b */
    public static final class C10977b implements v98.InterfaceC13949e {

        /* JADX INFO: renamed from: a */
        public static final v98.InterfaceC13949e f71036a = new C10977b();

        private C10977b() {
        }

        @Override // p000.v98.InterfaceC13949e
        public boolean isInRange(int number) {
            return pig.forNumber(number) != null;
        }
    }

    pig(int value) {
        this.f71035a = value;
    }

    public static pig forNumber(int value) {
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

    public static v98.InterfaceC13948d<pig> internalGetValueMap() {
        return f71027F;
    }

    public static v98.InterfaceC13949e internalGetVerifier() {
        return C10977b.f71036a;
    }

    @Override // p000.v98.InterfaceC13947c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f71035a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static pig valueOf(int value) {
        return forNumber(value);
    }
}
