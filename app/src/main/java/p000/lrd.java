package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lrd {

    /* JADX INFO: renamed from: a */
    public static final int f58549a = 16384;

    /* JADX INFO: renamed from: b */
    public static final int f58550b = 128;

    @yfb
    public static final krd ReaderJsonLexer(@yfb bk8 bk8Var, @yfb ya8 ya8Var, @yfb char[] cArr) {
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(ya8Var, "reader");
        md8.checkNotNullParameter(cArr, "buffer");
        return !bk8Var.getConfiguration().getAllowComments() ? new krd(ya8Var, cArr) : new mrd(ya8Var, cArr);
    }

    public static /* synthetic */ krd ReaderJsonLexer$default(bk8 bk8Var, ya8 ya8Var, char[] cArr, int i, Object obj) {
        if ((i & 4) != 0) {
            cArr = mv1.f62357c.take();
        }
        return ReaderJsonLexer(bk8Var, ya8Var, cArr);
    }
}
