package p000;

/* JADX INFO: loaded from: classes6.dex */
public enum t45 implements nt2 {
    AUTH(0),
    HTTP(1),
    UNKNOWN(-1);


    /* JADX INFO: renamed from: a */
    public final int f83684a;

    t45(int i) {
        this.f83684a = i;
    }

    public static t45 valueOf(int i) {
        return i == 0 ? AUTH : i == 1 ? HTTP : UNKNOWN;
    }

    @Override // p000.nt2
    public int getValue() {
        return this.f83684a;
    }
}
