package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nInputTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/FilterChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,254:1\n1#2:255\n*E\n"})
public final class tu5 implements g48 {

    /* JADX INFO: renamed from: b */
    @yfb
    public final g48 f85951b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final g48 f85952c;

    public tu5(@yfb g48 g48Var, @yfb g48 g48Var2) {
        this.f85951b = g48Var;
        this.f85952c = g48Var2;
    }

    @Override // p000.g48
    public void applySemantics(@yfb eye eyeVar) {
        this.f85951b.applySemantics(eyeVar);
        this.f85952c.applySemantics(eyeVar);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tu5.class != obj.getClass()) {
            return false;
        }
        tu5 tu5Var = (tu5) obj;
        return md8.areEqual(this.f85951b, tu5Var.f85951b) && md8.areEqual(this.f85952c, tu5Var.f85952c) && md8.areEqual(getKeyboardOptions(), tu5Var.getKeyboardOptions());
    }

    @Override // p000.g48
    @gib
    public wr8 getKeyboardOptions() {
        wr8 wr8VarFillUnspecifiedValuesWith$foundation_release;
        wr8 keyboardOptions = this.f85952c.getKeyboardOptions();
        return (keyboardOptions == null || (wr8VarFillUnspecifiedValuesWith$foundation_release = keyboardOptions.fillUnspecifiedValuesWith$foundation_release(this.f85951b.getKeyboardOptions())) == null) ? this.f85951b.getKeyboardOptions() : wr8VarFillUnspecifiedValuesWith$foundation_release;
    }

    public int hashCode() {
        int iHashCode = ((this.f85951b.hashCode() * 31) + this.f85952c.hashCode()) * 32;
        wr8 keyboardOptions = getKeyboardOptions();
        return iHashCode + (keyboardOptions != null ? keyboardOptions.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return this.f85951b + ".then(" + this.f85952c + ')';
    }

    @Override // p000.g48
    public void transformInput(@yfb hrg hrgVar) {
        this.f85951b.transformInput(hrgVar);
        this.f85952c.transformInput(hrgVar);
    }
}
