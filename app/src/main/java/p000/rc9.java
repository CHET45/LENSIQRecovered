package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class rc9 extends do6 {

    /* JADX INFO: renamed from: H */
    public static final int f77814H = 0;

    /* JADX INFO: renamed from: F */
    @yfb
    public final zmh f77815F;

    public rc9(@yfb zmh zmhVar) {
        super(true, null);
        this.f77815F = zmhVar;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rc9) && md8.areEqual(this.f77815F, ((rc9) obj).f77815F);
    }

    @yfb
    public final zmh getTypeface() {
        return this.f77815F;
    }

    public int hashCode() {
        return this.f77815F.hashCode();
    }

    @yfb
    public String toString() {
        return "LoadedFontFamily(typeface=" + this.f77815F + ')';
    }
}
