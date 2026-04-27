package p000;

import java.util.List;
import p000.C9041lz;
import p000.do6;
import p000.xn6;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class gug {

    /* JADX INFO: renamed from: l */
    public static final int f41223l = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C9041lz f41224a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final yvg f41225b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final List<C9041lz.c<ewc>> f41226c;

    /* JADX INFO: renamed from: d */
    public final int f41227d;

    /* JADX INFO: renamed from: e */
    public final boolean f41228e;

    /* JADX INFO: renamed from: f */
    public final int f41229f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final c64 f41230g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final ov8 f41231h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final do6.InterfaceC4891b f41232i;

    /* JADX INFO: renamed from: j */
    public final long f41233j;

    /* JADX INFO: renamed from: k */
    @gib
    public xn6.InterfaceC15211b f41234k;

    @q64(message = "Font.ResourceLoader is replaced with FontFamily.Resolver", replaceWith = @i2e(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints", imports = {}))
    public /* synthetic */ gug(C9041lz c9041lz, yvg yvgVar, List list, int i, boolean z, int i2, c64 c64Var, ov8 ov8Var, xn6.InterfaceC15211b interfaceC15211b, long j, jt3 jt3Var) {
        this(c9041lz, yvgVar, (List<C9041lz.c<ewc>>) list, i, z, i2, c64Var, ov8Var, interfaceC15211b, j);
    }

    @q64(message = "Replaced with FontFamily.Resolver", replaceWith = @i2e(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getResourceLoader$annotations() {
    }

    @yfb
    @q64(message = "Font.ResourceLoader is deprecated", replaceWith = @i2e(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overFlow, density, layoutDirection, fontFamilyResolver, constraints)", imports = {}))
    /* JADX INFO: renamed from: copy-hu-1Yfo, reason: not valid java name */
    public final gug m29856copyhu1Yfo(@yfb C9041lz c9041lz, @yfb yvg yvgVar, @yfb List<C9041lz.c<ewc>> list, int i, boolean z, int i2, @yfb c64 c64Var, @yfb ov8 ov8Var, @yfb xn6.InterfaceC15211b interfaceC15211b, long j) {
        return new gug(c9041lz, yvgVar, list, i, z, i2, c64Var, ov8Var, interfaceC15211b, this.f41232i, j);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gug)) {
            return false;
        }
        gug gugVar = (gug) obj;
        return md8.areEqual(this.f41224a, gugVar.f41224a) && md8.areEqual(this.f41225b, gugVar.f41225b) && md8.areEqual(this.f41226c, gugVar.f41226c) && this.f41227d == gugVar.f41227d && this.f41228e == gugVar.f41228e && bvg.m28164equalsimpl0(this.f41229f, gugVar.f41229f) && md8.areEqual(this.f41230g, gugVar.f41230g) && this.f41231h == gugVar.f41231h && md8.areEqual(this.f41232i, gugVar.f41232i) && ku2.m30756equalsimpl0(this.f41233j, gugVar.f41233j);
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m29857getConstraintsmsEJaDk() {
        return this.f41233j;
    }

    @yfb
    public final c64 getDensity() {
        return this.f41230g;
    }

    @yfb
    public final do6.InterfaceC4891b getFontFamilyResolver() {
        return this.f41232i;
    }

    @yfb
    public final ov8 getLayoutDirection() {
        return this.f41231h;
    }

    public final int getMaxLines() {
        return this.f41227d;
    }

    /* JADX INFO: renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m29858getOverflowgIe3tQ8() {
        return this.f41229f;
    }

    @yfb
    public final List<C9041lz.c<ewc>> getPlaceholders() {
        return this.f41226c;
    }

    @yfb
    public final xn6.InterfaceC15211b getResourceLoader() {
        xn6.InterfaceC15211b interfaceC15211b = this.f41234k;
        return interfaceC15211b == null ? r64.f77106b.from(this.f41232i) : interfaceC15211b;
    }

    public final boolean getSoftWrap() {
        return this.f41228e;
    }

    @yfb
    public final yvg getStyle() {
        return this.f41225b;
    }

    @yfb
    public final C9041lz getText() {
        return this.f41224a;
    }

    public int hashCode() {
        return (((((((((((((((((this.f41224a.hashCode() * 31) + this.f41225b.hashCode()) * 31) + this.f41226c.hashCode()) * 31) + this.f41227d) * 31) + Boolean.hashCode(this.f41228e)) * 31) + bvg.m28165hashCodeimpl(this.f41229f)) * 31) + this.f41230g.hashCode()) * 31) + this.f41231h.hashCode()) * 31) + this.f41232i.hashCode()) * 31) + ku2.m30766hashCodeimpl(this.f41233j);
    }

    @yfb
    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f41224a) + ", style=" + this.f41225b + ", placeholders=" + this.f41226c + ", maxLines=" + this.f41227d + ", softWrap=" + this.f41228e + ", overflow=" + ((Object) bvg.m28166toStringimpl(this.f41229f)) + ", density=" + this.f41230g + ", layoutDirection=" + this.f41231h + ", fontFamilyResolver=" + this.f41232i + ", constraints=" + ((Object) ku2.m30768toStringimpl(this.f41233j)) + ')';
    }

    public /* synthetic */ gug(C9041lz c9041lz, yvg yvgVar, List list, int i, boolean z, int i2, c64 c64Var, ov8 ov8Var, do6.InterfaceC4891b interfaceC4891b, long j, jt3 jt3Var) {
        this(c9041lz, yvgVar, (List<C9041lz.c<ewc>>) list, i, z, i2, c64Var, ov8Var, interfaceC4891b, j);
    }

    private gug(C9041lz c9041lz, yvg yvgVar, List<C9041lz.c<ewc>> list, int i, boolean z, int i2, c64 c64Var, ov8 ov8Var, xn6.InterfaceC15211b interfaceC15211b, do6.InterfaceC4891b interfaceC4891b, long j) {
        this.f41224a = c9041lz;
        this.f41225b = yvgVar;
        this.f41226c = list;
        this.f41227d = i;
        this.f41228e = z;
        this.f41229f = i2;
        this.f41230g = c64Var;
        this.f41231h = ov8Var;
        this.f41232i = interfaceC4891b;
        this.f41233j = j;
        this.f41234k = interfaceC15211b;
    }

    private gug(C9041lz c9041lz, yvg yvgVar, List<C9041lz.c<ewc>> list, int i, boolean z, int i2, c64 c64Var, ov8 ov8Var, xn6.InterfaceC15211b interfaceC15211b, long j) {
        this(c9041lz, yvgVar, list, i, z, i2, c64Var, ov8Var, interfaceC15211b, c44.createFontFamilyResolver(interfaceC15211b), j);
    }

    private gug(C9041lz c9041lz, yvg yvgVar, List<C9041lz.c<ewc>> list, int i, boolean z, int i2, c64 c64Var, ov8 ov8Var, do6.InterfaceC4891b interfaceC4891b, long j) {
        this(c9041lz, yvgVar, list, i, z, i2, c64Var, ov8Var, (xn6.InterfaceC15211b) null, interfaceC4891b, j);
    }
}
