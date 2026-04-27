package p000;

import p000.do6;

/* JADX INFO: loaded from: classes.dex */
public final class usg {

    /* JADX INFO: renamed from: a */
    @yfb
    public ov8 f89051a;

    /* JADX INFO: renamed from: b */
    @yfb
    public c64 f89052b;

    /* JADX INFO: renamed from: c */
    @yfb
    public do6.InterfaceC4891b f89053c;

    /* JADX INFO: renamed from: d */
    @yfb
    public yvg f89054d;

    /* JADX INFO: renamed from: e */
    @yfb
    public Object f89055e;

    /* JADX INFO: renamed from: f */
    public long f89056f = m32657computeMinSizeYbymL2g();

    public usg(@yfb ov8 ov8Var, @yfb c64 c64Var, @yfb do6.InterfaceC4891b interfaceC4891b, @yfb yvg yvgVar, @yfb Object obj) {
        this.f89051a = ov8Var;
        this.f89052b = c64Var;
        this.f89053c = interfaceC4891b;
        this.f89054d = yvgVar;
        this.f89055e = obj;
    }

    /* JADX INFO: renamed from: computeMinSize-YbymL2g, reason: not valid java name */
    private final long m32657computeMinSizeYbymL2g() {
        return srg.computeSizeForDefaultText$default(this.f89054d, this.f89052b, this.f89053c, null, 0, 24, null);
    }

    @yfb
    public final c64 getDensity() {
        return this.f89052b;
    }

    @yfb
    public final do6.InterfaceC4891b getFontFamilyResolver() {
        return this.f89053c;
    }

    @yfb
    public final ov8 getLayoutDirection() {
        return this.f89051a;
    }

    /* JADX INFO: renamed from: getMinSize-YbymL2g, reason: not valid java name */
    public final long m32658getMinSizeYbymL2g() {
        return this.f89056f;
    }

    @yfb
    public final yvg getResolvedStyle() {
        return this.f89054d;
    }

    @yfb
    public final Object getTypeface() {
        return this.f89055e;
    }

    public final void setDensity(@yfb c64 c64Var) {
        this.f89052b = c64Var;
    }

    public final void setFontFamilyResolver(@yfb do6.InterfaceC4891b interfaceC4891b) {
        this.f89053c = interfaceC4891b;
    }

    public final void setLayoutDirection(@yfb ov8 ov8Var) {
        this.f89051a = ov8Var;
    }

    public final void setResolvedStyle(@yfb yvg yvgVar) {
        this.f89054d = yvgVar;
    }

    public final void setTypeface(@yfb Object obj) {
        this.f89055e = obj;
    }

    public final void update(@yfb ov8 ov8Var, @yfb c64 c64Var, @yfb do6.InterfaceC4891b interfaceC4891b, @yfb yvg yvgVar, @yfb Object obj) {
        if (ov8Var == this.f89051a && md8.areEqual(c64Var, this.f89052b) && md8.areEqual(interfaceC4891b, this.f89053c) && md8.areEqual(yvgVar, this.f89054d) && md8.areEqual(obj, this.f89055e)) {
            return;
        }
        this.f89051a = ov8Var;
        this.f89052b = c64Var;
        this.f89053c = interfaceC4891b;
        this.f89054d = yvgVar;
        this.f89055e = obj;
        this.f89056f = m32657computeMinSizeYbymL2g();
    }
}
