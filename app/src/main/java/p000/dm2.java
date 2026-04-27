package p000;

/* JADX INFO: loaded from: classes7.dex */
@ggg
public final class dm2 extends am2 {

    /* JADX INFO: renamed from: c */
    public final boolean f30038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm2(@yfb ab8 ab8Var, boolean z) {
        super(ab8Var);
        md8.checkNotNullParameter(ab8Var, "writer");
        this.f30038c = z;
    }

    @Override // p000.am2
    public void print(int i) {
        boolean z = this.f30038c;
        String unsignedString = Integer.toUnsignedString(woh.m33004constructorimpl(i));
        if (z) {
            printQuoted(unsignedString);
        } else {
            print(unsignedString);
        }
    }

    @Override // p000.am2
    public void print(long j) {
        boolean z = this.f30038c;
        String unsignedString = Long.toUnsignedString(oph.m31533constructorimpl(j));
        if (z) {
            printQuoted(unsignedString);
        } else {
            print(unsignedString);
        }
    }

    @Override // p000.am2
    public void print(byte b) {
        boolean z = this.f30038c;
        String strM29830toStringimpl = goh.m29830toStringimpl(goh.m29786constructorimpl(b));
        if (z) {
            printQuoted(strM29830toStringimpl);
        } else {
            print(strM29830toStringimpl);
        }
    }

    @Override // p000.am2
    public void print(short s) {
        boolean z = this.f30038c;
        String strM30368toStringimpl = iqh.m30368toStringimpl(iqh.m30324constructorimpl(s));
        if (z) {
            printQuoted(strM30368toStringimpl);
        } else {
            print(strM30368toStringimpl);
        }
    }
}
