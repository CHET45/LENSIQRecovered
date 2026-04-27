package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nComposers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composers.kt\nkotlinx/serialization/json/internal/ComposerWithPrettyPrint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
public final class hm2 extends am2 {

    /* JADX INFO: renamed from: c */
    @yfb
    public final bk8 f44103c;

    /* JADX INFO: renamed from: d */
    public int f44104d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm2(@yfb ab8 ab8Var, @yfb bk8 bk8Var) {
        super(ab8Var);
        md8.checkNotNullParameter(ab8Var, "writer");
        md8.checkNotNullParameter(bk8Var, "json");
        this.f44103c = bk8Var;
    }

    @Override // p000.am2
    public void indent() {
        m892a(true);
        this.f44104d++;
    }

    @Override // p000.am2
    public void nextItem() {
        m892a(false);
        print("\n");
        int i = this.f44104d;
        for (int i2 = 0; i2 < i; i2++) {
            print(this.f44103c.getConfiguration().getPrettyPrintIndent());
        }
    }

    @Override // p000.am2
    public void nextItemIfNotFirst() {
        if (getWritingFirst()) {
            m892a(false);
        } else {
            nextItem();
        }
    }

    @Override // p000.am2
    public void space() {
        print(' ');
    }

    @Override // p000.am2
    public void unIndent() {
        this.f44104d--;
    }
}
