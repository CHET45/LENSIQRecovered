package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class l58 {
    @yfb
    public static final ty5 getInstallations(@yfb hw5 hw5Var) {
        md8.checkNotNullParameter(hw5Var, "<this>");
        ty5 ty5Var = ty5.getInstance();
        md8.checkNotNullExpressionValue(ty5Var, "getInstance(...)");
        return ty5Var;
    }

    @yfb
    public static final ty5 installations(@yfb hw5 hw5Var, @yfb lw5 lw5Var) {
        md8.checkNotNullParameter(hw5Var, "<this>");
        md8.checkNotNullParameter(lw5Var, "app");
        ty5 ty5Var = ty5.getInstance(lw5Var);
        md8.checkNotNullExpressionValue(ty5Var, "getInstance(...)");
        return ty5Var;
    }
}
