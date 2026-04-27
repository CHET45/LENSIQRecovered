package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nInputTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/MaxLengthFilter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,254:1\n1#2:255\n*E\n"})
public final class m4a implements g48 {

    /* JADX INFO: renamed from: b */
    public final int f59888b;

    public m4a(int i) {
        this.f59888b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("maxLength must be at least zero, was " + i).toString());
    }

    private final int component1() {
        return this.f59888b;
    }

    public static /* synthetic */ m4a copy$default(m4a m4aVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = m4aVar.f59888b;
        }
        return m4aVar.copy(i);
    }

    @Override // p000.g48
    public void applySemantics(@yfb eye eyeVar) {
        bye.setMaxTextLength(eyeVar, this.f59888b);
    }

    @yfb
    public final m4a copy(int i) {
        return new m4a(i);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m4a) && this.f59888b == ((m4a) obj).f59888b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f59888b);
    }

    @yfb
    public String toString() {
        return "InputTransformation.maxLength(" + this.f59888b + ')';
    }

    @Override // p000.g48
    public void transformInput(@yfb hrg hrgVar) {
        if (hrgVar.getLength() > this.f59888b) {
            hrgVar.revertAllChanges();
        }
    }
}
