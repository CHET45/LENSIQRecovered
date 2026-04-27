package p000;

/* JADX INFO: loaded from: classes6.dex */
public enum u2i implements nt2 {
    STRING(0),
    INT(1),
    DOUBLE(2),
    BOOL(3),
    UNKNOWN(-1);


    /* JADX INFO: renamed from: a */
    public final int f86694a;

    u2i(int i) {
        this.f86694a = i;
    }

    public static u2i valueOf(int i) {
        if (i == 0) {
            return STRING;
        }
        if (i == 1) {
            return INT;
        }
        if (i == 2) {
            return DOUBLE;
        }
        if (i == 3) {
            return BOOL;
        }
        if (i == -1) {
            return UNKNOWN;
        }
        throw new IllegalArgumentException("type not supported");
    }

    @Override // p000.nt2
    public int getValue() {
        return this.f86694a;
    }
}
