package p000;

/* JADX INFO: renamed from: al */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC0304al implements nt2 {
    BEGIN(0),
    CONTINUE(1),
    END(2),
    ONCE(3);


    /* JADX INFO: renamed from: a */
    public final int f1941a;

    EnumC0304al(int i) {
        this.f1941a = i;
    }

    public static EnumC0304al valueOf(int i) {
        if (i == 0) {
            return BEGIN;
        }
        if (i == 1) {
            return CONTINUE;
        }
        if (i == 2) {
            return END;
        }
        if (i == 3) {
            return ONCE;
        }
        throw new IllegalArgumentException("type not supported");
    }

    @Override // p000.nt2
    public int getValue() {
        return this.f1941a;
    }
}
