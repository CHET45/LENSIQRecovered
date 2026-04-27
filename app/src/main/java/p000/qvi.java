package p000;

/* JADX INFO: loaded from: classes6.dex */
public enum qvi implements nt2 {
    MEM(0),
    FILE(1),
    UNKNOWN(-1);


    /* JADX INFO: renamed from: a */
    public final int f75959a;

    qvi(int i) {
        this.f75959a = i;
    }

    @Override // p000.nt2
    public int getValue() {
        return this.f75959a;
    }
}
