package p000;

/* JADX INFO: loaded from: classes6.dex */
public enum ii9 implements nt2 {
    VERBOSE(0),
    DEBUG(1),
    INFO(2),
    WARN(3),
    ERROR(4),
    FATAL(5),
    OFF(100);


    /* JADX INFO: renamed from: a */
    public final int f47103a;

    ii9(int i) {
        this.f47103a = i;
    }

    public static ii9 valueOf(int i) {
        if (i == 100) {
            return OFF;
        }
        if (i == 0) {
            return VERBOSE;
        }
        if (i == 1) {
            return DEBUG;
        }
        if (i == 2) {
            return INFO;
        }
        if (i == 3) {
            return WARN;
        }
        if (i == 4) {
            return ERROR;
        }
        if (i == 5) {
            return FATAL;
        }
        return null;
    }

    @Override // p000.nt2
    public int getValue() {
        return this.f47103a;
    }
}
