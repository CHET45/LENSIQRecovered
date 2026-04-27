package p000;

import p000.hrg;

/* JADX INFO: renamed from: um */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nInputTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/AllCapsTransformation\n+ 2 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBufferKt\n*L\n1#1,254:1\n461#2,7:255\n*S KotlinDebug\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/AllCapsTransformation\n*L\n217#1:255,7\n*E\n"})
public final class C13592um implements g48 {

    /* JADX INFO: renamed from: b */
    @yfb
    public final we9 f88425b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final wr8 f88426c = new wr8(vr8.f92051b.m32807getCharactersIUNYP9k(), (Boolean) null, 0, 0, (bxc) null, (Boolean) null, (ye9) null, 126, (jt3) null);

    public C13592um(@yfb we9 we9Var) {
        this.f88425b = we9Var;
    }

    private final we9 component1() {
        return this.f88425b;
    }

    public static /* synthetic */ C13592um copy$default(C13592um c13592um, we9 we9Var, int i, Object obj) {
        if ((i & 1) != 0) {
            we9Var = c13592um.f88425b;
        }
        return c13592um.copy(we9Var);
    }

    @yfb
    public final C13592um copy(@yfb we9 we9Var) {
        return new C13592um(we9Var);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13592um) && md8.areEqual(this.f88425b, ((C13592um) obj).f88425b);
    }

    @Override // p000.g48
    @yfb
    public wr8 getKeyboardOptions() {
        return this.f88426c;
    }

    public int hashCode() {
        return this.f88425b.hashCode();
    }

    @yfb
    public String toString() {
        return "InputTransformation.allCaps(locale=" + this.f88425b + ')';
    }

    @Override // p000.g48
    public void transformInput(@yfb hrg hrgVar) {
        hrg.InterfaceC6984a changes = hrgVar.getChanges();
        for (int i = 0; i < changes.getChangeCount(); i++) {
            long jMo30108getRangejx7JFs = changes.mo30108getRangejx7JFs(i);
            changes.mo30107getOriginalRangejx7JFs(i);
            if (!jvg.m30587getCollapsedimpl(jMo30108getRangejx7JFs)) {
                hrgVar.replace(jvg.m30591getMinimpl(jMo30108getRangejx7JFs), jvg.m30590getMaximpl(jMo30108getRangejx7JFs), b8g.toUpperCase(kvg.m30779substringFDrldGo(hrgVar.asCharSequence(), jMo30108getRangejx7JFs), this.f88425b));
            }
        }
    }
}
