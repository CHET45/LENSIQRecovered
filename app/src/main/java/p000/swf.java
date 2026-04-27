package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class swf {

    /* JADX INFO: renamed from: q */
    public static final int f83169q = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final btg f83170a;

    /* JADX INFO: renamed from: b */
    public final long f83171b;

    /* JADX INFO: renamed from: c */
    @gib
    public final jp6 f83172c;

    /* JADX INFO: renamed from: d */
    @gib
    public final fp6 f83173d;

    /* JADX INFO: renamed from: e */
    @gib
    public final gp6 f83174e;

    /* JADX INFO: renamed from: f */
    @gib
    public final do6 f83175f;

    /* JADX INFO: renamed from: g */
    @gib
    public final String f83176g;

    /* JADX INFO: renamed from: h */
    public final long f83177h;

    /* JADX INFO: renamed from: i */
    @gib
    public final gv0 f83178i;

    /* JADX INFO: renamed from: j */
    @gib
    public final ftg f83179j;

    /* JADX INFO: renamed from: k */
    @gib
    public final ye9 f83180k;

    /* JADX INFO: renamed from: l */
    public final long f83181l;

    /* JADX INFO: renamed from: m */
    @gib
    public final qqg f83182m;

    /* JADX INFO: renamed from: n */
    @gib
    public final e8f f83183n;

    /* JADX INFO: renamed from: o */
    @gib
    public final qxc f83184o;

    /* JADX INFO: renamed from: p */
    @gib
    public final rp4 f83185p;

    @q64(level = u64.f86867c, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ swf(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, jt3 jt3Var) {
        this(j, j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar);
    }

    /* JADX INFO: renamed from: copy-NcG25M8$default, reason: not valid java name */
    public static /* synthetic */ swf m32343copyNcG25M8$default(swf swfVar, he1 he1Var, float f, long j, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j2, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j3, qqg qqgVar, e8f e8fVar, qxc qxcVar, rp4 rp4Var, int i, Object obj) {
        e8f e8fVar2;
        qxc qxcVar2;
        float alpha = (i & 2) != 0 ? swfVar.getAlpha() : f;
        long j4 = (i & 4) != 0 ? swfVar.f83171b : j;
        jp6 jp6Var2 = (i & 8) != 0 ? swfVar.f83172c : jp6Var;
        fp6 fp6Var2 = (i & 16) != 0 ? swfVar.f83173d : fp6Var;
        gp6 gp6Var2 = (i & 32) != 0 ? swfVar.f83174e : gp6Var;
        do6 do6Var2 = (i & 64) != 0 ? swfVar.f83175f : do6Var;
        String str2 = (i & 128) != 0 ? swfVar.f83176g : str;
        long j5 = (i & 256) != 0 ? swfVar.f83177h : j2;
        gv0 gv0Var2 = (i & 512) != 0 ? swfVar.f83178i : gv0Var;
        ftg ftgVar2 = (i & 1024) != 0 ? swfVar.f83179j : ftgVar;
        ye9 ye9Var2 = (i & 2048) != 0 ? swfVar.f83180k : ye9Var;
        long j6 = (i & 4096) != 0 ? swfVar.f83181l : j3;
        qqg qqgVar2 = (i & 8192) != 0 ? swfVar.f83182m : qqgVar;
        e8f e8fVar3 = (i & 16384) != 0 ? swfVar.f83183n : e8fVar;
        if ((i & 32768) != 0) {
            e8fVar2 = e8fVar3;
            qxcVar2 = swfVar.f83184o;
        } else {
            e8fVar2 = e8fVar3;
            qxcVar2 = qxcVar;
        }
        return swfVar.m32347copyNcG25M8(he1Var, alpha, j4, jp6Var2, fp6Var2, gp6Var2, do6Var2, str2, j5, gv0Var2, ftgVar2, ye9Var2, j6, qqgVar2, e8fVar2, qxcVar2, (i & 65536) != 0 ? swfVar.f83185p : rp4Var);
    }

    public static /* synthetic */ swf merge$default(swf swfVar, swf swfVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            swfVar2 = null;
        }
        return swfVar.merge(swfVar2);
    }

    @q64(level = u64.f86867c, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-2BkPm_w, reason: not valid java name */
    public final /* synthetic */ swf m32344copy2BkPm_w(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, qxc qxcVar) {
        return new swf(w82.m32952equalsimpl0(j, m32350getColor0d7_KjU()) ? this.f83170a : btg.f14745a.m28156from8_81llA(j), j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, qxcVar, (rp4) null, 32768, (jt3) null);
    }

    @yfb
    /* JADX INFO: renamed from: copy-GSF8kmg, reason: not valid java name */
    public final swf m32345copyGSF8kmg(long j, long j2, @gib jp6 jp6Var, @gib fp6 fp6Var, @gib gp6 gp6Var, @gib do6 do6Var, @gib String str, long j3, @gib gv0 gv0Var, @gib ftg ftgVar, @gib ye9 ye9Var, long j4, @gib qqg qqgVar, @gib e8f e8fVar, @gib qxc qxcVar, @gib rp4 rp4Var) {
        return new swf(w82.m32952equalsimpl0(j, m32350getColor0d7_KjU()) ? this.f83170a : btg.f14745a.m28156from8_81llA(j), j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, qxcVar, rp4Var, (jt3) null);
    }

    @q64(level = u64.f86867c, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-IuqyXdg, reason: not valid java name */
    public final /* synthetic */ swf m32346copyIuqyXdg(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar) {
        return new swf(w82.m32952equalsimpl0(j, m32350getColor0d7_KjU()) ? this.f83170a : btg.f14745a.m28156from8_81llA(j), j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, this.f83184o, this.f83185p, (jt3) null);
    }

    @yfb
    /* JADX INFO: renamed from: copy-NcG25M8, reason: not valid java name */
    public final swf m32347copyNcG25M8(@gib he1 he1Var, float f, long j, @gib jp6 jp6Var, @gib fp6 fp6Var, @gib gp6 gp6Var, @gib do6 do6Var, @gib String str, long j2, @gib gv0 gv0Var, @gib ftg ftgVar, @gib ye9 ye9Var, long j3, @gib qqg qqgVar, @gib e8f e8fVar, @gib qxc qxcVar, @gib rp4 rp4Var) {
        return new swf(btg.f14745a.from(he1Var, f), j, jp6Var, fp6Var, gp6Var, do6Var, str, j2, gv0Var, ftgVar, ye9Var, j3, qqgVar, e8fVar, qxcVar, rp4Var, (jt3) null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swf)) {
            return false;
        }
        swf swfVar = (swf) obj;
        return hasSameLayoutAffectingAttributes$ui_text_release(swfVar) && hasSameNonLayoutAttributes$ui_text_release(swfVar);
    }

    public final float getAlpha() {
        return this.f83170a.getAlpha();
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m32348getBackground0d7_KjU() {
        return this.f83181l;
    }

    @gib
    /* JADX INFO: renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final gv0 m32349getBaselineShift5SSeXJ0() {
        return this.f83178i;
    }

    @gib
    public final he1 getBrush() {
        return this.f83170a.getBrush();
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m32350getColor0d7_KjU() {
        return this.f83170a.mo28155getColor0d7_KjU();
    }

    @gib
    public final rp4 getDrawStyle() {
        return this.f83185p;
    }

    @gib
    public final do6 getFontFamily() {
        return this.f83175f;
    }

    @gib
    public final String getFontFeatureSettings() {
        return this.f83176g;
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m32351getFontSizeXSAIIZE() {
        return this.f83171b;
    }

    @gib
    /* JADX INFO: renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final fp6 m32352getFontStyle4Lr2A7w() {
        return this.f83173d;
    }

    @gib
    /* JADX INFO: renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final gp6 m32353getFontSynthesisZQGJjVo() {
        return this.f83174e;
    }

    @gib
    public final jp6 getFontWeight() {
        return this.f83172c;
    }

    /* JADX INFO: renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m32354getLetterSpacingXSAIIZE() {
        return this.f83177h;
    }

    @gib
    public final ye9 getLocaleList() {
        return this.f83180k;
    }

    @gib
    public final qxc getPlatformStyle() {
        return this.f83184o;
    }

    @gib
    public final e8f getShadow() {
        return this.f83183n;
    }

    @gib
    public final qqg getTextDecoration() {
        return this.f83182m;
    }

    @yfb
    public final btg getTextForegroundStyle$ui_text_release() {
        return this.f83170a;
    }

    @gib
    public final ftg getTextGeometricTransform() {
        return this.f83179j;
    }

    public final boolean hasSameLayoutAffectingAttributes$ui_text_release(@yfb swf swfVar) {
        if (this == swfVar) {
            return true;
        }
        return jwg.m30610equalsimpl0(this.f83171b, swfVar.f83171b) && md8.areEqual(this.f83172c, swfVar.f83172c) && md8.areEqual(this.f83173d, swfVar.f83173d) && md8.areEqual(this.f83174e, swfVar.f83174e) && md8.areEqual(this.f83175f, swfVar.f83175f) && md8.areEqual(this.f83176g, swfVar.f83176g) && jwg.m30610equalsimpl0(this.f83177h, swfVar.f83177h) && md8.areEqual(this.f83178i, swfVar.f83178i) && md8.areEqual(this.f83179j, swfVar.f83179j) && md8.areEqual(this.f83180k, swfVar.f83180k) && w82.m32952equalsimpl0(this.f83181l, swfVar.f83181l) && md8.areEqual(this.f83184o, swfVar.f83184o);
    }

    public final boolean hasSameNonLayoutAttributes$ui_text_release(@yfb swf swfVar) {
        return md8.areEqual(this.f83170a, swfVar.f83170a) && md8.areEqual(this.f83182m, swfVar.f83182m) && md8.areEqual(this.f83183n, swfVar.f83183n) && md8.areEqual(this.f83185p, swfVar.f83185p);
    }

    public int hashCode() {
        int iM32958hashCodeimpl = w82.m32958hashCodeimpl(m32350getColor0d7_KjU()) * 31;
        he1 brush = getBrush();
        int iHashCode = (((((iM32958hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(getAlpha())) * 31) + jwg.m30614hashCodeimpl(this.f83171b)) * 31;
        jp6 jp6Var = this.f83172c;
        int iHashCode2 = (iHashCode + (jp6Var != null ? jp6Var.hashCode() : 0)) * 31;
        fp6 fp6Var = this.f83173d;
        int iM29576hashCodeimpl = (iHashCode2 + (fp6Var != null ? fp6.m29576hashCodeimpl(fp6Var.m29578unboximpl()) : 0)) * 31;
        gp6 gp6Var = this.f83174e;
        int iM29844hashCodeimpl = (iM29576hashCodeimpl + (gp6Var != null ? gp6.m29844hashCodeimpl(gp6Var.m29848unboximpl()) : 0)) * 31;
        do6 do6Var = this.f83175f;
        int iHashCode3 = (iM29844hashCodeimpl + (do6Var != null ? do6Var.hashCode() : 0)) * 31;
        String str = this.f83176g;
        int iHashCode4 = (((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + jwg.m30614hashCodeimpl(this.f83177h)) * 31;
        gv0 gv0Var = this.f83178i;
        int iM29863hashCodeimpl = (iHashCode4 + (gv0Var != null ? gv0.m29863hashCodeimpl(gv0Var.m29865unboximpl()) : 0)) * 31;
        ftg ftgVar = this.f83179j;
        int iHashCode5 = (iM29863hashCodeimpl + (ftgVar != null ? ftgVar.hashCode() : 0)) * 31;
        ye9 ye9Var = this.f83180k;
        int iHashCode6 = (((iHashCode5 + (ye9Var != null ? ye9Var.hashCode() : 0)) * 31) + w82.m32958hashCodeimpl(this.f83181l)) * 31;
        qqg qqgVar = this.f83182m;
        int iHashCode7 = (iHashCode6 + (qqgVar != null ? qqgVar.hashCode() : 0)) * 31;
        e8f e8fVar = this.f83183n;
        int iHashCode8 = (iHashCode7 + (e8fVar != null ? e8fVar.hashCode() : 0)) * 31;
        qxc qxcVar = this.f83184o;
        int iHashCode9 = (iHashCode8 + (qxcVar != null ? qxcVar.hashCode() : 0)) * 31;
        rp4 rp4Var = this.f83185p;
        return iHashCode9 + (rp4Var != null ? rp4Var.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int iM30614hashCodeimpl = jwg.m30614hashCodeimpl(this.f83171b) * 31;
        jp6 jp6Var = this.f83172c;
        int iHashCode = (iM30614hashCodeimpl + (jp6Var != null ? jp6Var.hashCode() : 0)) * 31;
        fp6 fp6Var = this.f83173d;
        int iM29576hashCodeimpl = (iHashCode + (fp6Var != null ? fp6.m29576hashCodeimpl(fp6Var.m29578unboximpl()) : 0)) * 31;
        gp6 gp6Var = this.f83174e;
        int iM29844hashCodeimpl = (iM29576hashCodeimpl + (gp6Var != null ? gp6.m29844hashCodeimpl(gp6Var.m29848unboximpl()) : 0)) * 31;
        do6 do6Var = this.f83175f;
        int iHashCode2 = (iM29844hashCodeimpl + (do6Var != null ? do6Var.hashCode() : 0)) * 31;
        String str = this.f83176g;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + jwg.m30614hashCodeimpl(this.f83177h)) * 31;
        gv0 gv0Var = this.f83178i;
        int iM29863hashCodeimpl = (iHashCode3 + (gv0Var != null ? gv0.m29863hashCodeimpl(gv0Var.m29865unboximpl()) : 0)) * 31;
        ftg ftgVar = this.f83179j;
        int iHashCode4 = (iM29863hashCodeimpl + (ftgVar != null ? ftgVar.hashCode() : 0)) * 31;
        ye9 ye9Var = this.f83180k;
        int iHashCode5 = (((iHashCode4 + (ye9Var != null ? ye9Var.hashCode() : 0)) * 31) + w82.m32958hashCodeimpl(this.f83181l)) * 31;
        qxc qxcVar = this.f83184o;
        return iHashCode5 + (qxcVar != null ? qxcVar.hashCode() : 0);
    }

    @f0g
    @yfb
    public final swf merge(@gib swf swfVar) {
        return swfVar == null ? this : twf.m32446fastMergedSHsh3o(this, swfVar.f83170a.mo28155getColor0d7_KjU(), swfVar.f83170a.getBrush(), swfVar.f83170a.getAlpha(), swfVar.f83171b, swfVar.f83172c, swfVar.f83173d, swfVar.f83174e, swfVar.f83175f, swfVar.f83176g, swfVar.f83177h, swfVar.f83178i, swfVar.f83179j, swfVar.f83180k, swfVar.f83181l, swfVar.f83182m, swfVar.f83183n, swfVar.f83184o, swfVar.f83185p);
    }

    @f0g
    @yfb
    public final swf plus(@yfb swf swfVar) {
        return merge(swfVar);
    }

    @yfb
    public String toString() {
        return "SpanStyle(color=" + ((Object) w82.m32959toStringimpl(m32350getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) jwg.m30620toStringimpl(this.f83171b)) + ", fontWeight=" + this.f83172c + ", fontStyle=" + this.f83173d + ", fontSynthesis=" + this.f83174e + ", fontFamily=" + this.f83175f + ", fontFeatureSettings=" + this.f83176g + ", letterSpacing=" + ((Object) jwg.m30620toStringimpl(this.f83177h)) + ", baselineShift=" + this.f83178i + ", textGeometricTransform=" + this.f83179j + ", localeList=" + this.f83180k + ", background=" + ((Object) w82.m32959toStringimpl(this.f83181l)) + ", textDecoration=" + this.f83182m + ", shadow=" + this.f83183n + ", platformStyle=" + this.f83184o + ", drawStyle=" + this.f83185p + ')';
    }

    @q64(level = u64.f86867c, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ swf(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, qxc qxcVar, jt3 jt3Var) {
        this(j, j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, qxcVar);
    }

    public /* synthetic */ swf(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, qxc qxcVar, rp4 rp4Var, jt3 jt3Var) {
        this(j, j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, qxcVar, rp4Var);
    }

    public /* synthetic */ swf(he1 he1Var, float f, long j, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j2, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j3, qqg qqgVar, e8f e8fVar, qxc qxcVar, rp4 rp4Var, jt3 jt3Var) {
        this(he1Var, f, j, jp6Var, fp6Var, gp6Var, do6Var, str, j2, gv0Var, ftgVar, ye9Var, j3, qqgVar, e8fVar, qxcVar, rp4Var);
    }

    public /* synthetic */ swf(btg btgVar, long j, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j2, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j3, qqg qqgVar, e8f e8fVar, qxc qxcVar, rp4 rp4Var, jt3 jt3Var) {
        this(btgVar, j, jp6Var, fp6Var, gp6Var, do6Var, str, j2, gv0Var, ftgVar, ye9Var, j3, qqgVar, e8fVar, qxcVar, rp4Var);
    }

    private swf(btg btgVar, long j, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j2, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j3, qqg qqgVar, e8f e8fVar, qxc qxcVar, rp4 rp4Var) {
        this.f83170a = btgVar;
        this.f83171b = j;
        this.f83172c = jp6Var;
        this.f83173d = fp6Var;
        this.f83174e = gp6Var;
        this.f83175f = do6Var;
        this.f83176g = str;
        this.f83177h = j2;
        this.f83178i = gv0Var;
        this.f83179j = ftgVar;
        this.f83180k = ye9Var;
        this.f83181l = j3;
        this.f83182m = qqgVar;
        this.f83183n = e8fVar;
        this.f83184o = qxcVar;
        this.f83185p = rp4Var;
    }

    public /* synthetic */ swf(btg btgVar, long j, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j2, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j3, qqg qqgVar, e8f e8fVar, qxc qxcVar, rp4 rp4Var, int i, jt3 jt3Var) {
        this(btgVar, (i & 2) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j, (i & 4) != 0 ? null : jp6Var, (i & 8) != 0 ? null : fp6Var, (i & 16) != 0 ? null : gp6Var, (i & 32) != 0 ? null : do6Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j2, (i & 256) != 0 ? null : gv0Var, (i & 512) != 0 ? null : ftgVar, (i & 1024) != 0 ? null : ye9Var, (i & 2048) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j3, (i & 4096) != 0 ? null : qqgVar, (i & 8192) != 0 ? null : e8fVar, (i & 16384) != 0 ? null : qxcVar, (i & 32768) != 0 ? null : rp4Var, (jt3) null);
    }

    public /* synthetic */ swf(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j, (i & 2) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : jp6Var, (i & 8) != 0 ? null : fp6Var, (i & 16) != 0 ? null : gp6Var, (i & 32) != 0 ? null : do6Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j3, (i & 256) != 0 ? null : gv0Var, (i & 512) != 0 ? null : ftgVar, (i & 1024) != 0 ? null : ye9Var, (i & 2048) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : qqgVar, (i & 8192) != 0 ? null : e8fVar, (jt3) null);
    }

    private swf(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar) {
        this(btg.f14745a.m28156from8_81llA(j), j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, (qxc) null, (rp4) null, 32768, (jt3) null);
    }

    public /* synthetic */ swf(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, qxc qxcVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j, (i & 2) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : jp6Var, (i & 8) != 0 ? null : fp6Var, (i & 16) != 0 ? null : gp6Var, (i & 32) != 0 ? null : do6Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j3, (i & 256) != 0 ? null : gv0Var, (i & 512) != 0 ? null : ftgVar, (i & 1024) != 0 ? null : ye9Var, (i & 2048) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : qqgVar, (i & 8192) != 0 ? null : e8fVar, (i & 16384) != 0 ? null : qxcVar, (jt3) null);
    }

    private swf(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, qxc qxcVar) {
        this(btg.f14745a.m28156from8_81llA(j), j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, qxcVar, (rp4) null, 32768, (jt3) null);
    }

    public /* synthetic */ swf(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, qxc qxcVar, rp4 rp4Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j, (i & 2) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : jp6Var, (i & 8) != 0 ? null : fp6Var, (i & 16) != 0 ? null : gp6Var, (i & 32) != 0 ? null : do6Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j3, (i & 256) != 0 ? null : gv0Var, (i & 512) != 0 ? null : ftgVar, (i & 1024) != 0 ? null : ye9Var, (i & 2048) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : qqgVar, (i & 8192) != 0 ? null : e8fVar, (i & 16384) != 0 ? null : qxcVar, (i & 32768) != 0 ? null : rp4Var, (jt3) null);
    }

    private swf(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, qxc qxcVar, rp4 rp4Var) {
        this(btg.f14745a.m28156from8_81llA(j), j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, qxcVar, rp4Var, (jt3) null);
    }

    public /* synthetic */ swf(he1 he1Var, float f, long j, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j2, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j3, qqg qqgVar, e8f e8fVar, qxc qxcVar, rp4 rp4Var, int i, jt3 jt3Var) {
        this(he1Var, (i & 2) != 0 ? Float.NaN : f, (i & 4) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : jp6Var, (i & 16) != 0 ? null : fp6Var, (i & 32) != 0 ? null : gp6Var, (i & 64) != 0 ? null : do6Var, (i & 128) != 0 ? null : str, (i & 256) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j2, (i & 512) != 0 ? null : gv0Var, (i & 1024) != 0 ? null : ftgVar, (i & 2048) != 0 ? null : ye9Var, (i & 4096) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j3, (i & 8192) != 0 ? null : qqgVar, (i & 16384) != 0 ? null : e8fVar, (32768 & i) != 0 ? null : qxcVar, (i & 65536) != 0 ? null : rp4Var, (jt3) null);
    }

    private swf(he1 he1Var, float f, long j, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j2, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j3, qqg qqgVar, e8f e8fVar, qxc qxcVar, rp4 rp4Var) {
        this(btg.f14745a.from(he1Var, f), j, jp6Var, fp6Var, gp6Var, do6Var, str, j2, gv0Var, ftgVar, ye9Var, j3, qqgVar, e8fVar, qxcVar, rp4Var, (jt3) null);
    }
}
