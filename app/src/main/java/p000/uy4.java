package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class uy4 implements vy4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final uy4 f89433a = new uy4();

    /* JADX INFO: renamed from: b */
    @yfb
    public static vy4 f89434b = new cw3();

    /* JADX INFO: renamed from: c */
    public static final int f89435c = 8;

    private uy4() {
    }

    @Override // p000.vy4
    @yfb
    public i2g<Boolean> getFontLoaded() {
        return f89434b.getFontLoaded();
    }

    @fdi
    public final void setDelegateForTesting$ui_text_release(@gib vy4 vy4Var) {
        if (vy4Var == null) {
            vy4Var = new cw3();
        }
        f89434b = vy4Var;
    }
}
