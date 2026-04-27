package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class dr9 extends m13 {
    @gib
    @la8
    /* JADX INFO: renamed from: a */
    public final String m9332a() {
        dr9 immediate;
        dr9 main = df4.getMain();
        if (this == main) {
            return "Dispatchers.Main";
        }
        try {
            immediate = main.getImmediate();
        } catch (UnsupportedOperationException unused) {
            immediate = null;
        }
        if (this == immediate) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @yfb
    public abstract dr9 getImmediate();

    @Override // p000.m13
    @yfb
    public m13 limitedParallelism(int i, @gib String str) {
        c69.checkParallelism(i);
        return c69.namedOrThis(this, str);
    }

    @Override // p000.m13
    @yfb
    public String toString() {
        String strM9332a = m9332a();
        if (strM9332a != null) {
            return strM9332a;
        }
        return kk3.getClassSimpleName(this) + '@' + kk3.getHexAddress(this);
    }
}
