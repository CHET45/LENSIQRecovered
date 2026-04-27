package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class onh {

    /* JADX INFO: renamed from: f */
    public static final int f68204f = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public final do6 f68205a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final jp6 f68206b;

    /* JADX INFO: renamed from: c */
    public final int f68207c;

    /* JADX INFO: renamed from: d */
    public final int f68208d;

    /* JADX INFO: renamed from: e */
    @gib
    public final Object f68209e;

    public /* synthetic */ onh(do6 do6Var, jp6 jp6Var, int i, int i2, Object obj, jt3 jt3Var) {
        this(do6Var, jp6Var, i, i2, obj);
    }

    /* JADX INFO: renamed from: copy-e1PVR60$default, reason: not valid java name */
    public static /* synthetic */ onh m31510copye1PVR60$default(onh onhVar, do6 do6Var, jp6 jp6Var, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            do6Var = onhVar.f68205a;
        }
        if ((i3 & 2) != 0) {
            jp6Var = onhVar.f68206b;
        }
        jp6 jp6Var2 = jp6Var;
        if ((i3 & 4) != 0) {
            i = onhVar.f68207c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = onhVar.f68208d;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            obj = onhVar.f68209e;
        }
        return onhVar.m31513copye1PVR60(do6Var, jp6Var2, i4, i5, obj);
    }

    @gib
    public final do6 component1() {
        return this.f68205a;
    }

    @yfb
    public final jp6 component2() {
        return this.f68206b;
    }

    /* JADX INFO: renamed from: component3-_-LCdwA, reason: not valid java name */
    public final int m31511component3_LCdwA() {
        return this.f68207c;
    }

    /* JADX INFO: renamed from: component4-GVVA2EU, reason: not valid java name */
    public final int m31512component4GVVA2EU() {
        return this.f68208d;
    }

    @gib
    public final Object component5() {
        return this.f68209e;
    }

    @yfb
    /* JADX INFO: renamed from: copy-e1PVR60, reason: not valid java name */
    public final onh m31513copye1PVR60(@gib do6 do6Var, @yfb jp6 jp6Var, int i, int i2, @gib Object obj) {
        return new onh(do6Var, jp6Var, i, i2, obj, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onh)) {
            return false;
        }
        onh onhVar = (onh) obj;
        return md8.areEqual(this.f68205a, onhVar.f68205a) && md8.areEqual(this.f68206b, onhVar.f68206b) && fp6.m29575equalsimpl0(this.f68207c, onhVar.f68207c) && gp6.m29843equalsimpl0(this.f68208d, onhVar.f68208d) && md8.areEqual(this.f68209e, onhVar.f68209e);
    }

    @gib
    public final do6 getFontFamily() {
        return this.f68205a;
    }

    /* JADX INFO: renamed from: getFontStyle-_-LCdwA, reason: not valid java name */
    public final int m31514getFontStyle_LCdwA() {
        return this.f68207c;
    }

    /* JADX INFO: renamed from: getFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m31515getFontSynthesisGVVA2EU() {
        return this.f68208d;
    }

    @yfb
    public final jp6 getFontWeight() {
        return this.f68206b;
    }

    @gib
    public final Object getResourceLoaderCacheKey() {
        return this.f68209e;
    }

    public int hashCode() {
        do6 do6Var = this.f68205a;
        int iHashCode = (((((((do6Var == null ? 0 : do6Var.hashCode()) * 31) + this.f68206b.hashCode()) * 31) + fp6.m29576hashCodeimpl(this.f68207c)) * 31) + gp6.m29844hashCodeimpl(this.f68208d)) * 31;
        Object obj = this.f68209e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f68205a + ", fontWeight=" + this.f68206b + ", fontStyle=" + ((Object) fp6.m29577toStringimpl(this.f68207c)) + ", fontSynthesis=" + ((Object) gp6.m29847toStringimpl(this.f68208d)) + ", resourceLoaderCacheKey=" + this.f68209e + ')';
    }

    private onh(do6 do6Var, jp6 jp6Var, int i, int i2, Object obj) {
        this.f68205a = do6Var;
        this.f68206b = jp6Var;
        this.f68207c = i;
        this.f68208d = i2;
        this.f68209e = obj;
    }
}
