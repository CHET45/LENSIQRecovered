package p000;

/* JADX INFO: loaded from: classes7.dex */
@ggg
public final class cm2 extends am2 {

    /* JADX INFO: renamed from: c */
    public final boolean f16937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm2(@yfb ab8 ab8Var, boolean z) {
        super(ab8Var);
        md8.checkNotNullParameter(ab8Var, "writer");
        this.f16937c = z;
    }

    @Override // p000.am2
    public void printQuoted(@yfb String str) {
        md8.checkNotNullParameter(str, "value");
        if (this.f16937c) {
            super.printQuoted(str);
        } else {
            super.print(str);
        }
    }
}
