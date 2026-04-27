package p000;

/* JADX INFO: loaded from: classes.dex */
public interface awg {

    /* JADX INFO: renamed from: awg$a */
    public static final class C1633a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void showMenu$default(awg awgVar, rud rudVar, ny6 ny6Var, ny6 ny6Var2, ny6 ny6Var3, ny6 ny6Var4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        awgVar.showMenu(rudVar, (i & 2) != 0 ? null : ny6Var, (i & 4) != 0 ? null : ny6Var2, (i & 8) != 0 ? null : ny6Var3, (i & 16) != 0 ? null : ny6Var4);
    }

    @yfb
    dwg getStatus();

    void hide();

    void showMenu(@yfb rud rudVar, @gib ny6<bth> ny6Var, @gib ny6<bth> ny6Var2, @gib ny6<bth> ny6Var3, @gib ny6<bth> ny6Var4);
}
