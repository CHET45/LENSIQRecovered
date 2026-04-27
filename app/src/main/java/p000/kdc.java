package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class kdc {

    /* JADX INFO: renamed from: j */
    public static final int f53661j = 0;

    /* JADX INFO: renamed from: a */
    public final int f53662a;

    /* JADX INFO: renamed from: b */
    public final int f53663b;

    /* JADX INFO: renamed from: c */
    public final long f53664c;

    /* JADX INFO: renamed from: d */
    @gib
    public final ntg f53665d;

    /* JADX INFO: renamed from: e */
    @gib
    public final mxc f53666e;

    /* JADX INFO: renamed from: f */
    @gib
    public final h69 f53667f;

    /* JADX INFO: renamed from: g */
    public final int f53668g;

    /* JADX INFO: renamed from: h */
    public final int f53669h;

    /* JADX INFO: renamed from: i */
    @gib
    public final xug f53670i;

    public /* synthetic */ kdc(int i, int i2, long j, ntg ntgVar, mxc mxcVar, h69 h69Var, int i3, int i4, xug xugVar, jt3 jt3Var) {
        this(i, i2, j, ntgVar, mxcVar, h69Var, i3, i4, xugVar);
    }

    /* JADX INFO: renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ kdc m30660copyElsmlbk$default(kdc kdcVar, bqg bqgVar, wqg wqgVar, long j, ntg ntgVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bqgVar = bqg.m28034boximpl(kdcVar.f53662a);
        }
        if ((i & 2) != 0) {
            wqgVar = wqg.m33084boximpl(kdcVar.f53663b);
        }
        wqg wqgVar2 = wqgVar;
        if ((i & 4) != 0) {
            j = kdcVar.f53664c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            ntgVar = kdcVar.f53665d;
        }
        return kdcVar.m30669copyElsmlbk(bqgVar, wqgVar2, j2, ntgVar);
    }

    /* JADX INFO: renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ kdc m30663copyxPh5V4g$default(kdc kdcVar, bqg bqgVar, wqg wqgVar, long j, ntg ntgVar, mxc mxcVar, h69 h69Var, int i, Object obj) {
        if ((i & 1) != 0) {
            bqgVar = bqg.m28034boximpl(kdcVar.f53662a);
        }
        if ((i & 2) != 0) {
            wqgVar = wqg.m33084boximpl(kdcVar.f53663b);
        }
        wqg wqgVar2 = wqgVar;
        if ((i & 4) != 0) {
            j = kdcVar.f53664c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            ntgVar = kdcVar.f53665d;
        }
        ntg ntgVar2 = ntgVar;
        if ((i & 16) != 0) {
            mxcVar = kdcVar.f53666e;
        }
        mxc mxcVar2 = mxcVar;
        if ((i & 32) != 0) {
            h69Var = kdcVar.f53667f;
        }
        return kdcVar.m30672copyxPh5V4g(bqgVar, wqgVar2, j2, ntgVar2, mxcVar2, h69Var);
    }

    @q64(level = u64.f86865a, message = "Kept for backwards compatibility.")
    /* JADX INFO: renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m30665getHyphensEaSxIns$annotations() {
    }

    @q64(level = u64.f86865a, message = "Kept for backwards compatibility.")
    /* JADX INFO: renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m30666getLineBreakLgCVezo$annotations() {
    }

    @q64(level = u64.f86865a, message = "Kept for backwards compatibility.")
    /* JADX INFO: renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m30667getTextAlignbuA522U$annotations() {
    }

    @q64(level = u64.f86865a, message = "Kept for backwards compatibility.")
    /* JADX INFO: renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m30668getTextDirectionmmuk1to$annotations() {
    }

    public static /* synthetic */ kdc merge$default(kdc kdcVar, kdc kdcVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            kdcVar2 = null;
        }
        return kdcVar.merge(kdcVar2);
    }

    @q64(level = u64.f86867c, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ kdc m30669copyElsmlbk(bqg bqgVar, wqg wqgVar, long j, ntg ntgVar) {
        return new kdc(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j, ntgVar, this.f53666e, this.f53667f, this.f53668g, this.f53669h, this.f53670i, (jt3) null);
    }

    @q64(level = u64.f86867c, message = "ParagraphStyle copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* JADX INFO: renamed from: copy-NH1kkwU, reason: not valid java name */
    public final /* synthetic */ kdc m30670copyNH1kkwU(bqg bqgVar, wqg wqgVar, long j, ntg ntgVar, mxc mxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, xug xugVar) {
        return new kdc(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j, ntgVar, mxcVar, h69Var, d69Var != null ? d69Var.m28582unboximpl() : d69.f28526b.m28590getUnspecifiedrAG3T2k(), bp7Var != null ? bp7Var.m28027unboximpl() : bp7.f14380b.m28030getUnspecifiedvmbZdU8(), xugVar, (jt3) null);
    }

    @q64(level = u64.f86867c, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-ciSxzs0, reason: not valid java name */
    public final /* synthetic */ kdc m30671copyciSxzs0(bqg bqgVar, wqg wqgVar, long j, ntg ntgVar, mxc mxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var) {
        return new kdc(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j, ntgVar, mxcVar, h69Var, d69Var != null ? d69Var.m28582unboximpl() : d69.f28526b.m28590getUnspecifiedrAG3T2k(), bp7Var != null ? bp7Var.m28027unboximpl() : bp7.f14380b.m28030getUnspecifiedvmbZdU8(), this.f53670i, (jt3) null);
    }

    @q64(level = u64.f86867c, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ kdc m30672copyxPh5V4g(bqg bqgVar, wqg wqgVar, long j, ntg ntgVar, mxc mxcVar, h69 h69Var) {
        return new kdc(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j, ntgVar, mxcVar, h69Var, this.f53668g, this.f53669h, this.f53670i, (jt3) null);
    }

    @yfb
    /* JADX INFO: renamed from: copy-ykzQM6k, reason: not valid java name */
    public final kdc m30673copyykzQM6k(int i, int i2, long j, @gib ntg ntgVar, @gib mxc mxcVar, @gib h69 h69Var, int i3, int i4, @gib xug xugVar) {
        return new kdc(i, i2, j, ntgVar, mxcVar, h69Var, i3, i4, xugVar, (jt3) null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdc)) {
            return false;
        }
        kdc kdcVar = (kdc) obj;
        return bqg.m28037equalsimpl0(this.f53662a, kdcVar.f53662a) && wqg.m33087equalsimpl0(this.f53663b, kdcVar.f53663b) && jwg.m30610equalsimpl0(this.f53664c, kdcVar.f53664c) && md8.areEqual(this.f53665d, kdcVar.f53665d) && md8.areEqual(this.f53666e, kdcVar.f53666e) && md8.areEqual(this.f53667f, kdcVar.f53667f) && d69.m28576equalsimpl0(this.f53668g, kdcVar.f53668g) && bp7.m28024equalsimpl0(this.f53669h, kdcVar.f53669h) && md8.areEqual(this.f53670i, kdcVar.f53670i);
    }

    @gib
    @xn8(name = "getHyphens-EaSxIns")
    /* JADX INFO: renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final bp7 m30674getHyphensEaSxIns() {
        return bp7.m28021boximpl(this.f53669h);
    }

    /* JADX INFO: renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m30675getHyphensvmbZdU8() {
        return this.f53669h;
    }

    @gib
    @xn8(name = "getLineBreak-LgCVezo")
    /* JADX INFO: renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final d69 m30676getLineBreakLgCVezo() {
        return d69.m28570boximpl(this.f53668g);
    }

    /* JADX INFO: renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m30677getLineBreakrAG3T2k() {
        return this.f53668g;
    }

    /* JADX INFO: renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m30678getLineHeightXSAIIZE() {
        return this.f53664c;
    }

    @gib
    public final h69 getLineHeightStyle() {
        return this.f53667f;
    }

    @gib
    public final mxc getPlatformStyle() {
        return this.f53666e;
    }

    @gib
    @xn8(name = "getTextAlign-buA522U")
    /* JADX INFO: renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final bqg m30679getTextAlignbuA522U() {
        return bqg.m28034boximpl(this.f53662a);
    }

    /* JADX INFO: renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m30680getTextAligne0LSkKk() {
        return this.f53662a;
    }

    @gib
    @xn8(name = "getTextDirection-mmuk1to")
    /* JADX INFO: renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final wqg m30681getTextDirectionmmuk1to() {
        return wqg.m33084boximpl(this.f53663b);
    }

    /* JADX INFO: renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m30682getTextDirections_7Xco() {
        return this.f53663b;
    }

    @gib
    public final ntg getTextIndent() {
        return this.f53665d;
    }

    @gib
    public final xug getTextMotion() {
        return this.f53670i;
    }

    public int hashCode() {
        int iM28038hashCodeimpl = ((((bqg.m28038hashCodeimpl(this.f53662a) * 31) + wqg.m33088hashCodeimpl(this.f53663b)) * 31) + jwg.m30614hashCodeimpl(this.f53664c)) * 31;
        ntg ntgVar = this.f53665d;
        int iHashCode = (iM28038hashCodeimpl + (ntgVar != null ? ntgVar.hashCode() : 0)) * 31;
        mxc mxcVar = this.f53666e;
        int iHashCode2 = (iHashCode + (mxcVar != null ? mxcVar.hashCode() : 0)) * 31;
        h69 h69Var = this.f53667f;
        int iHashCode3 = (((((iHashCode2 + (h69Var != null ? h69Var.hashCode() : 0)) * 31) + d69.m28580hashCodeimpl(this.f53668g)) * 31) + bp7.m28025hashCodeimpl(this.f53669h)) * 31;
        xug xugVar = this.f53670i;
        return iHashCode3 + (xugVar != null ? xugVar.hashCode() : 0);
    }

    @f0g
    @yfb
    public final kdc merge(@gib kdc kdcVar) {
        return kdcVar == null ? this : ldc.m30862fastMergej5T8yCg(this, kdcVar.f53662a, kdcVar.f53663b, kdcVar.f53664c, kdcVar.f53665d, kdcVar.f53666e, kdcVar.f53667f, kdcVar.f53668g, kdcVar.f53669h, kdcVar.f53670i);
    }

    @f0g
    @yfb
    public final kdc plus(@yfb kdc kdcVar) {
        return merge(kdcVar);
    }

    @yfb
    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) bqg.m28039toStringimpl(this.f53662a)) + ", textDirection=" + ((Object) wqg.m33089toStringimpl(this.f53663b)) + ", lineHeight=" + ((Object) jwg.m30620toStringimpl(this.f53664c)) + ", textIndent=" + this.f53665d + ", platformStyle=" + this.f53666e + ", lineHeightStyle=" + this.f53667f + ", lineBreak=" + ((Object) d69.m28581toStringimpl(this.f53668g)) + ", hyphens=" + ((Object) bp7.m28026toStringimpl(this.f53669h)) + ", textMotion=" + this.f53670i + ')';
    }

    @q64(level = u64.f86867c, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ kdc(bqg bqgVar, wqg wqgVar, long j, ntg ntgVar, jt3 jt3Var) {
        this(bqgVar, wqgVar, j, ntgVar);
    }

    @q64(level = u64.f86867c, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructors.")
    public /* synthetic */ kdc(bqg bqgVar, wqg wqgVar, long j, ntg ntgVar, mxc mxcVar, h69 h69Var, jt3 jt3Var) {
        this(bqgVar, wqgVar, j, ntgVar, mxcVar, h69Var);
    }

    @q64(level = u64.f86867c, message = "ParagraphStyle constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable constructors.")
    public /* synthetic */ kdc(bqg bqgVar, wqg wqgVar, long j, ntg ntgVar, mxc mxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, jt3 jt3Var) {
        this(bqgVar, wqgVar, j, ntgVar, mxcVar, h69Var, d69Var, bp7Var);
    }

    @q64(level = u64.f86867c, message = "ParagraphStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ kdc(bqg bqgVar, wqg wqgVar, long j, ntg ntgVar, mxc mxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, xug xugVar, jt3 jt3Var) {
        this(bqgVar, wqgVar, j, ntgVar, mxcVar, h69Var, d69Var, bp7Var, xugVar);
    }

    private kdc(int i, int i2, long j, ntg ntgVar, mxc mxcVar, h69 h69Var, int i3, int i4, xug xugVar) {
        this.f53662a = i;
        this.f53663b = i2;
        this.f53664c = j;
        this.f53665d = ntgVar;
        this.f53666e = mxcVar;
        this.f53667f = h69Var;
        this.f53668g = i3;
        this.f53669h = i4;
        this.f53670i = xugVar;
        if (jwg.m30610equalsimpl0(j, jwg.f52146b.m30624getUnspecifiedXSAIIZE()) || jwg.m30613getValueimpl(j) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + jwg.m30613getValueimpl(j) + ')').toString());
    }

    public /* synthetic */ kdc(int i, int i2, long j, ntg ntgVar, mxc mxcVar, h69 h69Var, int i3, int i4, xug xugVar, int i5, jt3 jt3Var) {
        this((i5 & 1) != 0 ? bqg.f14513b.m28047getUnspecifiede0LSkKk() : i, (i5 & 2) != 0 ? wqg.f95173b.m33096getUnspecifieds_7Xco() : i2, (i5 & 4) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j, (i5 & 8) != 0 ? null : ntgVar, (i5 & 16) != 0 ? null : mxcVar, (i5 & 32) != 0 ? null : h69Var, (i5 & 64) != 0 ? d69.f28526b.m28590getUnspecifiedrAG3T2k() : i3, (i5 & 128) != 0 ? bp7.f14380b.m28030getUnspecifiedvmbZdU8() : i4, (i5 & 256) == 0 ? xugVar : null, (jt3) null);
    }

    public /* synthetic */ kdc(bqg bqgVar, wqg wqgVar, long j, ntg ntgVar, mxc mxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, xug xugVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : bqgVar, (i & 2) != 0 ? null : wqgVar, (i & 4) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : ntgVar, (i & 16) != 0 ? null : mxcVar, (i & 32) != 0 ? null : h69Var, (i & 64) != 0 ? null : d69Var, (i & 128) != 0 ? null : bp7Var, (i & 256) == 0 ? xugVar : null, (jt3) null);
    }

    private kdc(bqg bqgVar, wqg wqgVar, long j, ntg ntgVar, mxc mxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, xug xugVar) {
        this(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j, ntgVar, mxcVar, h69Var, d69Var != null ? d69Var.m28582unboximpl() : d69.f28526b.m28590getUnspecifiedrAG3T2k(), bp7Var != null ? bp7Var.m28027unboximpl() : bp7.f14380b.m28030getUnspecifiedvmbZdU8(), xugVar, (jt3) null);
    }

    public /* synthetic */ kdc(bqg bqgVar, wqg wqgVar, long j, ntg ntgVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : bqgVar, (i & 2) != 0 ? null : wqgVar, (i & 4) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : ntgVar, null);
    }

    private kdc(bqg bqgVar, wqg wqgVar, long j, ntg ntgVar) {
        this(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j, ntgVar, (mxc) null, (h69) null, d69.f28526b.m28590getUnspecifiedrAG3T2k(), bp7.f14380b.m28030getUnspecifiedvmbZdU8(), (xug) null, (jt3) null);
    }

    public /* synthetic */ kdc(bqg bqgVar, wqg wqgVar, long j, ntg ntgVar, mxc mxcVar, h69 h69Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : bqgVar, (i & 2) != 0 ? null : wqgVar, (i & 4) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : ntgVar, (i & 16) != 0 ? null : mxcVar, (i & 32) == 0 ? h69Var : null, null);
    }

    private kdc(bqg bqgVar, wqg wqgVar, long j, ntg ntgVar, mxc mxcVar, h69 h69Var) {
        this(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j, ntgVar, mxcVar, h69Var, d69.f28526b.m28590getUnspecifiedrAG3T2k(), bp7.f14380b.m28030getUnspecifiedvmbZdU8(), (xug) null, (jt3) null);
    }

    public /* synthetic */ kdc(bqg bqgVar, wqg wqgVar, long j, ntg ntgVar, mxc mxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : bqgVar, (i & 2) != 0 ? null : wqgVar, (i & 4) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : ntgVar, (i & 16) != 0 ? null : mxcVar, (i & 32) != 0 ? null : h69Var, (i & 64) != 0 ? null : d69Var, (i & 128) == 0 ? bp7Var : null, (jt3) null);
    }

    private kdc(bqg bqgVar, wqg wqgVar, long j, ntg ntgVar, mxc mxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var) {
        this(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j, ntgVar, mxcVar, h69Var, d69Var != null ? d69Var.m28582unboximpl() : d69.f28526b.m28590getUnspecifiedrAG3T2k(), bp7Var != null ? bp7Var.m28027unboximpl() : bp7.f14380b.m28030getUnspecifiedvmbZdU8(), (xug) null, (jt3) null);
    }
}
