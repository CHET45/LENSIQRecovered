package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class x7g {
    @yfb
    public static final w7g StringJsonLexer(@yfb bk8 bk8Var, @yfb String str) {
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(str, "source");
        return !bk8Var.getConfiguration().getAllowComments() ? new w7g(str) : new y7g(str);
    }
}
