package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class im2 {
    @yfb
    public static final am2 Composer(@yfb ab8 ab8Var, @yfb bk8 bk8Var) {
        md8.checkNotNullParameter(ab8Var, "sb");
        md8.checkNotNullParameter(bk8Var, "json");
        return bk8Var.getConfiguration().getPrettyPrint() ? new hm2(ab8Var, bk8Var) : new am2(ab8Var);
    }
}
