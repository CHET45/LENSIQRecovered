package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.do6;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextStringSimpleNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,470:1\n1#2:471\n26#3:472\n26#3:473\n256#4:474\n696#5:475\n696#5:476\n*S KotlinDebug\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n*L\n362#1:472\n363#1:473\n422#1:474\n447#1:475\n449#1:476\n*E\n"})
@e0g(parameters = 0)
public final class xvg extends InterfaceC0701e.d implements ew8, fp4, rxe {

    /* JADX INFO: renamed from: g2 */
    public static final int f99492g2 = 8;

    /* JADX INFO: renamed from: M1 */
    public int f99493M1;

    /* JADX INFO: renamed from: V1 */
    public boolean f99494V1;

    /* JADX INFO: renamed from: X */
    @yfb
    public String f99495X;

    /* JADX INFO: renamed from: Y */
    @yfb
    public yvg f99496Y;

    /* JADX INFO: renamed from: Z */
    @yfb
    public do6.InterfaceC4891b f99497Z;

    /* JADX INFO: renamed from: Z1 */
    public int f99498Z1;

    /* JADX INFO: renamed from: a2 */
    public int f99499a2;

    /* JADX INFO: renamed from: b2 */
    @gib
    public u92 f99500b2;

    /* JADX INFO: renamed from: c2 */
    @gib
    public Map<AbstractC9938nm, Integer> f99501c2;

    /* JADX INFO: renamed from: d2 */
    @gib
    public idc f99502d2;

    /* JADX INFO: renamed from: e2 */
    @gib
    public qy6<? super List<hug>, Boolean> f99503e2;

    /* JADX INFO: renamed from: f2 */
    @gib
    public C15320a f99504f2;

    /* JADX INFO: renamed from: xvg$b */
    public static final class C15321b extends tt8 implements qy6<List<hug>, Boolean> {
        public C15321b() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb List<hug> list) {
            idc layoutCache = xvg.this.getLayoutCache();
            yvg yvgVar = xvg.this.f99496Y;
            u92 u92Var = xvg.this.f99500b2;
            hug hugVarSlowCreateTextLayoutResultOrNull = layoutCache.slowCreateTextLayoutResultOrNull(yvgVar.m33452mergedA7vx0o((16777214 & 1) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : u92Var != null ? u92Var.m32561invoke0d7_KjU() : w82.f93556b.m32987getUnspecified0d7_KjU(), (16777214 & 2) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : 0L, (16777214 & 4) != 0 ? null : null, (16777214 & 8) != 0 ? null : null, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : null, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : 0L, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : 0L, (16777214 & 4096) != 0 ? null : null, (16777214 & 8192) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? bqg.f14513b.m28047getUnspecifiede0LSkKk() : 0, (16777214 & 65536) != 0 ? wqg.f95173b.m33096getUnspecifieds_7Xco() : 0, (16777214 & 131072) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : 0L, (16777214 & 262144) != 0 ? null : null, (16777214 & 524288) != 0 ? null : null, (16777214 & 1048576) != 0 ? d69.f28526b.m28590getUnspecifiedrAG3T2k() : 0, (16777214 & 2097152) != 0 ? bp7.f14380b.m28030getUnspecifiedvmbZdU8() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null));
            if (hugVarSlowCreateTextLayoutResultOrNull != null) {
                list.add(hugVarSlowCreateTextLayoutResultOrNull);
            } else {
                hugVarSlowCreateTextLayoutResultOrNull = null;
            }
            return Boolean.valueOf(hugVarSlowCreateTextLayoutResultOrNull != null);
        }
    }

    /* JADX INFO: renamed from: xvg$c */
    public static final class C15322c extends tt8 implements qy6<C9041lz, Boolean> {
        public C15322c() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb C9041lz c9041lz) {
            xvg.this.setSubstitution(c9041lz.getText());
            xvg.this.invalidateForTranslate();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: xvg$d */
    public static final class C15323d extends tt8 implements qy6<Boolean, Boolean> {
        public C15323d() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return invoke(bool.booleanValue());
        }

        @yfb
        public final Boolean invoke(boolean z) {
            if (xvg.this.f99504f2 == null) {
                return Boolean.FALSE;
            }
            C15320a c15320a = xvg.this.f99504f2;
            if (c15320a != null) {
                c15320a.setShowingSubstitution(z);
            }
            xvg.this.invalidateForTranslate();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: xvg$e */
    public static final class C15324e extends tt8 implements ny6<Boolean> {
        public C15324e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            xvg.this.clearSubstitution();
            xvg.this.invalidateForTranslate();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: xvg$f */
    public static final class C15325f extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f99514a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15325f(AbstractC0767t abstractC0767t) {
            super(1);
            this.f99514a = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.place$default(aVar, this.f99514a, 0, 0, 0.0f, 4, null);
        }
    }

    public /* synthetic */ xvg(String str, yvg yvgVar, do6.InterfaceC4891b interfaceC4891b, int i, boolean z, int i2, int i3, u92 u92Var, jt3 jt3Var) {
        this(str, yvgVar, interfaceC4891b, i, z, i2, i3, u92Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearSubstitution() {
        this.f99504f2 = null;
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final idc getLayoutCache() {
        if (this.f99502d2 == null) {
            this.f99502d2 = new idc(this.f99495X, this.f99496Y, this.f99497Z, this.f99493M1, this.f99494V1, this.f99498Z1, this.f99499a2, null);
        }
        idc idcVar = this.f99502d2;
        md8.checkNotNull(idcVar);
        return idcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateForTranslate() {
        sxe.invalidateSemantics(this);
        hw8.invalidateMeasurement(this);
        gp4.invalidateDraw(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setSubstitution(String str) {
        bth bthVar;
        C15320a c15320a = this.f99504f2;
        if (c15320a == null) {
            C15320a c15320a2 = new C15320a(this.f99495X, str, false, null, 12, null);
            idc idcVar = new idc(str, this.f99496Y, this.f99497Z, this.f99493M1, this.f99494V1, this.f99498Z1, this.f99499a2, null);
            idcVar.setDensity$foundation_release(getLayoutCache().getDensity$foundation_release());
            c15320a2.setLayoutCache(idcVar);
            this.f99504f2 = c15320a2;
            return true;
        }
        if (md8.areEqual(str, c15320a.getSubstitution())) {
            return false;
        }
        c15320a.setSubstitution(str);
        idc layoutCache = c15320a.getLayoutCache();
        if (layoutCache != null) {
            layoutCache.m30209updateL6sJoHM(str, this.f99496Y, this.f99497Z, this.f99493M1, this.f99494V1, this.f99498Z1, this.f99499a2);
            bthVar = bth.f14751a;
        } else {
            bthVar = null;
        }
        return bthVar != null;
    }

    @Override // p000.rxe
    public void applySemantics(@yfb eye eyeVar) {
        qy6 c15321b = this.f99503e2;
        if (c15321b == null) {
            c15321b = new C15321b();
            this.f99503e2 = c15321b;
        }
        bye.setText(eyeVar, new C9041lz(this.f99495X, null, null, 6, null));
        C15320a c15320a = this.f99504f2;
        if (c15320a != null) {
            bye.setShowingTextSubstitution(eyeVar, c15320a.isShowingSubstitution());
            bye.setTextSubstitution(eyeVar, new C9041lz(c15320a.getSubstitution(), null, null, 6, null));
        }
        bye.setTextSubstitution$default(eyeVar, null, new C15322c(), 1, null);
        bye.showTextSubstitution$default(eyeVar, null, new C15323d(), 1, null);
        bye.clearTextSubstitution$default(eyeVar, null, new C15324e(), 1, null);
        bye.getTextLayoutResult$default(eyeVar, null, c15321b, 1, null);
    }

    public final void doInvalidations(boolean z, boolean z2, boolean z3) {
        if (z2 || z3) {
            getLayoutCache().m30209updateL6sJoHM(this.f99495X, this.f99496Y, this.f99497Z, this.f99493M1, this.f99494V1, this.f99498Z1, this.f99499a2);
        }
        if (isAttached()) {
            if (z2 || (z && this.f99503e2 != null)) {
                sxe.invalidateSemantics(this);
            }
            if (z2 || z3) {
                hw8.invalidateMeasurement(this);
                gp4.invalidateDraw(this);
            }
            if (z) {
                gp4.invalidateDraw(this);
            }
        }
    }

    @Override // p000.fp4
    public void draw(@yfb ov2 ov2Var) {
        if (isAttached()) {
            idc layoutCache = getLayoutCache(ov2Var);
            bdc paragraph$foundation_release = layoutCache.getParagraph$foundation_release();
            if (paragraph$foundation_release == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.f99502d2 + ", textSubstitution=" + this.f99504f2 + ')').toString());
            }
            vq1 canvas = ov2Var.getDrawContext().getCanvas();
            boolean didOverflow$foundation_release = layoutCache.getDidOverflow$foundation_release();
            if (didOverflow$foundation_release) {
                float fM32087getWidthimpl = r78.m32087getWidthimpl(layoutCache.m30206getLayoutSizeYbymL2g$foundation_release());
                float fM32086getHeightimpl = r78.m32086getHeightimpl(layoutCache.m30206getLayoutSizeYbymL2g$foundation_release());
                canvas.save();
                vq1.m32780clipRectN_I0leg$default(canvas, 0.0f, 0.0f, fM32087getWidthimpl, fM32086getHeightimpl, 0, 16, null);
            }
            try {
                qqg textDecoration = this.f99496Y.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = qqg.f75141b.getNone();
                }
                qqg qqgVar = textDecoration;
                e8f shadow = this.f99496Y.getShadow();
                if (shadow == null) {
                    shadow = e8f.f32134d.getNone();
                }
                e8f e8fVar = shadow;
                rp4 drawStyle = this.f99496Y.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = nu5.f65694a;
                }
                rp4 rp4Var = drawStyle;
                he1 brush = this.f99496Y.getBrush();
                if (brush != null) {
                    bdc.m27981painthn5TExg$default(paragraph$foundation_release, canvas, brush, this.f99496Y.getAlpha(), e8fVar, qqgVar, rp4Var, 0, 64, null);
                } else {
                    u92 u92Var = this.f99500b2;
                    long jM32561invoke0d7_KjU = u92Var != null ? u92Var.m32561invoke0d7_KjU() : w82.f93556b.m32987getUnspecified0d7_KjU();
                    if (jM32561invoke0d7_KjU == 16) {
                        jM32561invoke0d7_KjU = this.f99496Y.m33437getColor0d7_KjU() != 16 ? this.f99496Y.m33437getColor0d7_KjU() : w82.f93556b.m32977getBlack0d7_KjU();
                    }
                    bdc.m27979paintLG529CI$default(paragraph$foundation_release, canvas, jM32561invoke0d7_KjU, e8fVar, qqgVar, rp4Var, 0, 32, null);
                }
                if (didOverflow$foundation_release) {
                    canvas.restore();
                }
            } catch (Throwable th) {
                if (didOverflow$foundation_release) {
                    canvas.restore();
                }
                throw th;
            }
        }
    }

    @Override // p000.ew8
    public int maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return getLayoutCache(gd8Var).intrinsicHeight(i, gd8Var.getLayoutDirection());
    }

    @Override // p000.ew8
    public int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return getLayoutCache(gd8Var).maxIntrinsicWidth(gd8Var.getLayoutDirection());
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        idc layoutCache = getLayoutCache(interfaceC0761n);
        boolean zM30207layoutWithConstraintsK40F9xA = layoutCache.m30207layoutWithConstraintsK40F9xA(j, interfaceC0761n.getLayoutDirection());
        layoutCache.getObserveFontChanges$foundation_release();
        bdc paragraph$foundation_release = layoutCache.getParagraph$foundation_release();
        md8.checkNotNull(paragraph$foundation_release);
        long jM30206getLayoutSizeYbymL2g$foundation_release = layoutCache.m30206getLayoutSizeYbymL2g$foundation_release();
        if (zM30207layoutWithConstraintsK40F9xA) {
            hw8.invalidateLayer(this);
            Map<AbstractC9938nm, Integer> linkedHashMap = this.f99501c2;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>(2);
            }
            linkedHashMap.put(C10463om.getFirstBaseline(), Integer.valueOf(Math.round(paragraph$foundation_release.getFirstBaseline())));
            linkedHashMap.put(C10463om.getLastBaseline(), Integer.valueOf(Math.round(paragraph$foundation_release.getLastBaseline())));
            this.f99501c2 = linkedHashMap;
        }
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(ku2.f55323b.m30772fitPrioritizingWidthZbe2FdA(r78.m32087getWidthimpl(jM30206getLayoutSizeYbymL2g$foundation_release), r78.m32087getWidthimpl(jM30206getLayoutSizeYbymL2g$foundation_release), r78.m32086getHeightimpl(jM30206getLayoutSizeYbymL2g$foundation_release), r78.m32086getHeightimpl(jM30206getLayoutSizeYbymL2g$foundation_release)));
        int iM32087getWidthimpl = r78.m32087getWidthimpl(jM30206getLayoutSizeYbymL2g$foundation_release);
        int iM32086getHeightimpl = r78.m32086getHeightimpl(jM30206getLayoutSizeYbymL2g$foundation_release);
        Map<AbstractC9938nm, Integer> map = this.f99501c2;
        md8.checkNotNull(map);
        return interfaceC0761n.layout(iM32087getWidthimpl, iM32086getHeightimpl, map, new C15325f(abstractC0767tMo27949measureBRTryo0));
    }

    @Override // p000.ew8
    public int minIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return getLayoutCache(gd8Var).intrinsicHeight(i, gd8Var.getLayoutDirection());
    }

    @Override // p000.ew8
    public int minIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return getLayoutCache(gd8Var).minIntrinsicWidth(gd8Var.getLayoutDirection());
    }

    public final boolean updateDraw(@gib u92 u92Var, @yfb yvg yvgVar) {
        boolean zAreEqual = md8.areEqual(u92Var, this.f99500b2);
        this.f99500b2 = u92Var;
        return (zAreEqual && yvgVar.hasSameDrawAffectingAttributes(this.f99496Y)) ? false : true;
    }

    /* JADX INFO: renamed from: updateLayoutRelatedArgs-HuAbxIM, reason: not valid java name */
    public final boolean m33317updateLayoutRelatedArgsHuAbxIM(@yfb yvg yvgVar, int i, int i2, boolean z, @yfb do6.InterfaceC4891b interfaceC4891b, int i3) {
        boolean z2 = !this.f99496Y.hasSameLayoutAffectingAttributes(yvgVar);
        this.f99496Y = yvgVar;
        if (this.f99499a2 != i) {
            this.f99499a2 = i;
            z2 = true;
        }
        if (this.f99498Z1 != i2) {
            this.f99498Z1 = i2;
            z2 = true;
        }
        if (this.f99494V1 != z) {
            this.f99494V1 = z;
            z2 = true;
        }
        if (!md8.areEqual(this.f99497Z, interfaceC4891b)) {
            this.f99497Z = interfaceC4891b;
            z2 = true;
        }
        if (bvg.m28164equalsimpl0(this.f99493M1, i3)) {
            return z2;
        }
        this.f99493M1 = i3;
        return true;
    }

    public final boolean updateText(@yfb String str) {
        if (md8.areEqual(this.f99495X, str)) {
            return false;
        }
        this.f99495X = str;
        clearSubstitution();
        return true;
    }

    public /* synthetic */ xvg(String str, yvg yvgVar, do6.InterfaceC4891b interfaceC4891b, int i, boolean z, int i2, int i3, u92 u92Var, int i4, jt3 jt3Var) {
        this(str, yvgVar, interfaceC4891b, (i4 & 8) != 0 ? bvg.f14961b.m28171getClipgIe3tQ8() : i, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? Integer.MAX_VALUE : i2, (i4 & 64) != 0 ? 1 : i3, (i4 & 128) != 0 ? null : u92Var, null);
    }

    private xvg(String str, yvg yvgVar, do6.InterfaceC4891b interfaceC4891b, int i, boolean z, int i2, int i3, u92 u92Var) {
        this.f99495X = str;
        this.f99496Y = yvgVar;
        this.f99497Z = interfaceC4891b;
        this.f99493M1 = i;
        this.f99494V1 = z;
        this.f99498Z1 = i2;
        this.f99499a2 = i3;
        this.f99500b2 = u92Var;
    }

    /* JADX INFO: renamed from: xvg$a */
    @e0g(parameters = 0)
    public static final class C15320a {

        /* JADX INFO: renamed from: e */
        public static final int f99505e = 8;

        /* JADX INFO: renamed from: a */
        @yfb
        public final String f99506a;

        /* JADX INFO: renamed from: b */
        @yfb
        public String f99507b;

        /* JADX INFO: renamed from: c */
        public boolean f99508c;

        /* JADX INFO: renamed from: d */
        @gib
        public idc f99509d;

        public C15320a(@yfb String str, @yfb String str2, boolean z, @gib idc idcVar) {
            this.f99506a = str;
            this.f99507b = str2;
            this.f99508c = z;
            this.f99509d = idcVar;
        }

        public static /* synthetic */ C15320a copy$default(C15320a c15320a, String str, String str2, boolean z, idc idcVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c15320a.f99506a;
            }
            if ((i & 2) != 0) {
                str2 = c15320a.f99507b;
            }
            if ((i & 4) != 0) {
                z = c15320a.f99508c;
            }
            if ((i & 8) != 0) {
                idcVar = c15320a.f99509d;
            }
            return c15320a.copy(str, str2, z, idcVar);
        }

        @yfb
        public final String component1() {
            return this.f99506a;
        }

        @yfb
        public final String component2() {
            return this.f99507b;
        }

        public final boolean component3() {
            return this.f99508c;
        }

        @gib
        public final idc component4() {
            return this.f99509d;
        }

        @yfb
        public final C15320a copy(@yfb String str, @yfb String str2, boolean z, @gib idc idcVar) {
            return new C15320a(str, str2, z, idcVar);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15320a)) {
                return false;
            }
            C15320a c15320a = (C15320a) obj;
            return md8.areEqual(this.f99506a, c15320a.f99506a) && md8.areEqual(this.f99507b, c15320a.f99507b) && this.f99508c == c15320a.f99508c && md8.areEqual(this.f99509d, c15320a.f99509d);
        }

        @gib
        public final idc getLayoutCache() {
            return this.f99509d;
        }

        @yfb
        public final String getOriginal() {
            return this.f99506a;
        }

        @yfb
        public final String getSubstitution() {
            return this.f99507b;
        }

        public int hashCode() {
            int iHashCode = ((((this.f99506a.hashCode() * 31) + this.f99507b.hashCode()) * 31) + Boolean.hashCode(this.f99508c)) * 31;
            idc idcVar = this.f99509d;
            return iHashCode + (idcVar == null ? 0 : idcVar.hashCode());
        }

        public final boolean isShowingSubstitution() {
            return this.f99508c;
        }

        public final void setLayoutCache(@gib idc idcVar) {
            this.f99509d = idcVar;
        }

        public final void setShowingSubstitution(boolean z) {
            this.f99508c = z;
        }

        public final void setSubstitution(@yfb String str) {
            this.f99507b = str;
        }

        @yfb
        public String toString() {
            return "TextSubstitution(layoutCache=" + this.f99509d + ", isShowingSubstitution=" + this.f99508c + ')';
        }

        public /* synthetic */ C15320a(String str, String str2, boolean z, idc idcVar, int i, jt3 jt3Var) {
            this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : idcVar);
        }
    }

    private final idc getLayoutCache(c64 c64Var) {
        idc layoutCache;
        C15320a c15320a = this.f99504f2;
        if (c15320a != null && c15320a.isShowingSubstitution() && (layoutCache = c15320a.getLayoutCache()) != null) {
            layoutCache.setDensity$foundation_release(c64Var);
            return layoutCache;
        }
        idc layoutCache2 = getLayoutCache();
        layoutCache2.setDensity$foundation_release(c64Var);
        return layoutCache2;
    }
}
