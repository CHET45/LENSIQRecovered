package p000;

import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public enum p62 implements w98.InterfaceC14497d {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    UNAUTHENTICATED(16),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Z1 */
    public static final int f69790Z1 = 0;

    /* JADX INFO: renamed from: a2 */
    public static final int f69791a2 = 1;

    /* JADX INFO: renamed from: b2 */
    public static final int f69793b2 = 2;

    /* JADX INFO: renamed from: c2 */
    public static final int f69795c2 = 3;

    /* JADX INFO: renamed from: d2 */
    public static final int f69797d2 = 4;

    /* JADX INFO: renamed from: e2 */
    public static final int f69799e2 = 5;

    /* JADX INFO: renamed from: f2 */
    public static final int f69801f2 = 6;

    /* JADX INFO: renamed from: g2 */
    public static final int f69802g2 = 7;

    /* JADX INFO: renamed from: h2 */
    public static final int f69803h2 = 16;

    /* JADX INFO: renamed from: i2 */
    public static final int f69804i2 = 8;

    /* JADX INFO: renamed from: j2 */
    public static final int f69805j2 = 9;

    /* JADX INFO: renamed from: k2 */
    public static final int f69806k2 = 10;

    /* JADX INFO: renamed from: l2 */
    public static final int f69807l2 = 11;

    /* JADX INFO: renamed from: m2 */
    public static final int f69809m2 = 12;

    /* JADX INFO: renamed from: n2 */
    public static final int f69810n2 = 13;

    /* JADX INFO: renamed from: o2 */
    public static final int f69811o2 = 14;

    /* JADX INFO: renamed from: p2 */
    public static final int f69812p2 = 15;

    /* JADX INFO: renamed from: q2 */
    public static final w98.InterfaceC14498e<p62> f69813q2 = new w98.InterfaceC14498e<p62>() { // from class: p62.a
        @Override // p000.w98.InterfaceC14498e
        public p62 findValueByNumber(int i) {
            return p62.forNumber(i);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f69815a;

    /* JADX INFO: renamed from: p62$b */
    public static final class C10806b implements w98.InterfaceC14499f {

        /* JADX INFO: renamed from: a */
        public static final w98.InterfaceC14499f f69816a = new C10806b();

        private C10806b() {
        }

        @Override // p000.w98.InterfaceC14499f
        public boolean isInRange(int i) {
            return p62.forNumber(i) != null;
        }
    }

    p62(int i) {
        this.f69815a = i;
    }

    public static p62 forNumber(int i) {
        switch (i) {
            case 0:
                return OK;
            case 1:
                return CANCELLED;
            case 2:
                return UNKNOWN;
            case 3:
                return INVALID_ARGUMENT;
            case 4:
                return DEADLINE_EXCEEDED;
            case 5:
                return NOT_FOUND;
            case 6:
                return ALREADY_EXISTS;
            case 7:
                return PERMISSION_DENIED;
            case 8:
                return RESOURCE_EXHAUSTED;
            case 9:
                return FAILED_PRECONDITION;
            case 10:
                return ABORTED;
            case 11:
                return OUT_OF_RANGE;
            case 12:
                return UNIMPLEMENTED;
            case 13:
                return INTERNAL;
            case 14:
                return UNAVAILABLE;
            case 15:
                return DATA_LOSS;
            case 16:
                return UNAUTHENTICATED;
            default:
                return null;
        }
    }

    public static w98.InterfaceC14498e<p62> internalGetValueMap() {
        return f69813q2;
    }

    public static w98.InterfaceC14499f internalGetVerifier() {
        return C10806b.f69816a;
    }

    @Override // p000.w98.InterfaceC14497d
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f69815a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static p62 valueOf(int i) {
        return forNumber(i);
    }
}
