package p000;

import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public enum pi9 implements w98.InterfaceC14497d {
    DEFAULT(0),
    DEBUG(100),
    INFO(200),
    NOTICE(300),
    WARNING(400),
    ERROR(500),
    CRITICAL(600),
    ALERT(700),
    EMERGENCY(800),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: M */
    public static final int f70940M = 0;

    /* JADX INFO: renamed from: M1 */
    public static final int f70941M1 = 600;

    /* JADX INFO: renamed from: N */
    public static final int f70942N = 100;

    /* JADX INFO: renamed from: Q */
    public static final int f70943Q = 200;

    /* JADX INFO: renamed from: V1 */
    public static final int f70944V1 = 700;

    /* JADX INFO: renamed from: X */
    public static final int f70945X = 300;

    /* JADX INFO: renamed from: Y */
    public static final int f70946Y = 400;

    /* JADX INFO: renamed from: Z */
    public static final int f70947Z = 500;

    /* JADX INFO: renamed from: Z1 */
    public static final int f70948Z1 = 800;

    /* JADX INFO: renamed from: a2 */
    public static final w98.InterfaceC14498e<pi9> f70949a2 = new w98.InterfaceC14498e<pi9>() { // from class: pi9.a
        @Override // p000.w98.InterfaceC14498e
        public pi9 findValueByNumber(int i) {
            return pi9.forNumber(i);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f70957a;

    /* JADX INFO: renamed from: pi9$b */
    public static final class C10970b implements w98.InterfaceC14499f {

        /* JADX INFO: renamed from: a */
        public static final w98.InterfaceC14499f f70958a = new C10970b();

        private C10970b() {
        }

        @Override // p000.w98.InterfaceC14499f
        public boolean isInRange(int i) {
            return pi9.forNumber(i) != null;
        }
    }

    pi9(int i) {
        this.f70957a = i;
    }

    public static pi9 forNumber(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 100) {
            return DEBUG;
        }
        if (i == 200) {
            return INFO;
        }
        if (i == 300) {
            return NOTICE;
        }
        if (i == 400) {
            return WARNING;
        }
        if (i == 500) {
            return ERROR;
        }
        if (i == 600) {
            return CRITICAL;
        }
        if (i == 700) {
            return ALERT;
        }
        if (i != 800) {
            return null;
        }
        return EMERGENCY;
    }

    public static w98.InterfaceC14498e<pi9> internalGetValueMap() {
        return f70949a2;
    }

    public static w98.InterfaceC14499f internalGetVerifier() {
        return C10970b.f70958a;
    }

    @Override // p000.w98.InterfaceC14497d
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f70957a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static pi9 valueOf(int i) {
        return forNumber(i);
    }
}
