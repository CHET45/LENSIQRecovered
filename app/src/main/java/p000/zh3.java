package p000;

/* JADX INFO: loaded from: classes6.dex */
public enum zh3 implements nt2 {
    BEGIN(0),
    CONTINUE(1),
    END(2),
    ONCE(3);


    /* JADX INFO: renamed from: a */
    public final int f105082a;

    zh3(int i) {
        this.f105082a = i;
    }

    public static zh3 valueOf(int i) {
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
        return this.f105082a;
    }

    public EnumC0304al next() {
        return EnumC0304al.valueOf(this.f105082a);
    }
}
