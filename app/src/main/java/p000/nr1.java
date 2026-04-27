package p000;

import java.util.List;
import p000.w82;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,791:1\n1#2:792\n*E\n"})
public final class nr1 implements ip4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final C10018a f65347a = new C10018a(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: b */
    @yfb
    public final bp4 f65348b = new C10019b();

    /* JADX INFO: renamed from: c */
    @gib
    public icc f65349c;

    /* JADX INFO: renamed from: d */
    @gib
    public icc f65350d;

    /* JADX INFO: renamed from: nr1$a */
    @yjd
    public static final class C10018a {

        /* JADX INFO: renamed from: a */
        @yfb
        public c64 f65351a;

        /* JADX INFO: renamed from: b */
        @yfb
        public ov8 f65352b;

        /* JADX INFO: renamed from: c */
        @yfb
        public vq1 f65353c;

        /* JADX INFO: renamed from: d */
        public long f65354d;

        public /* synthetic */ C10018a(c64 c64Var, ov8 ov8Var, vq1 vq1Var, long j, jt3 jt3Var) {
            this(c64Var, ov8Var, vq1Var, j);
        }

        /* JADX INFO: renamed from: copy-Ug5Nnss$default, reason: not valid java name */
        public static /* synthetic */ C10018a m31195copyUg5Nnss$default(C10018a c10018a, c64 c64Var, ov8 ov8Var, vq1 vq1Var, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                c64Var = c10018a.f65351a;
            }
            if ((i & 2) != 0) {
                ov8Var = c10018a.f65352b;
            }
            ov8 ov8Var2 = ov8Var;
            if ((i & 4) != 0) {
                vq1Var = c10018a.f65353c;
            }
            vq1 vq1Var2 = vq1Var;
            if ((i & 8) != 0) {
                j = c10018a.f65354d;
            }
            return c10018a.m31197copyUg5Nnss(c64Var, ov8Var2, vq1Var2, j);
        }

        @yfb
        public final c64 component1() {
            return this.f65351a;
        }

        @yfb
        public final ov8 component2() {
            return this.f65352b;
        }

        @yfb
        public final vq1 component3() {
            return this.f65353c;
        }

        /* JADX INFO: renamed from: component4-NH-jbRc, reason: not valid java name */
        public final long m31196component4NHjbRc() {
            return this.f65354d;
        }

        @yfb
        /* JADX INFO: renamed from: copy-Ug5Nnss, reason: not valid java name */
        public final C10018a m31197copyUg5Nnss(@yfb c64 c64Var, @yfb ov8 ov8Var, @yfb vq1 vq1Var, long j) {
            return new C10018a(c64Var, ov8Var, vq1Var, j, null);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10018a)) {
                return false;
            }
            C10018a c10018a = (C10018a) obj;
            return md8.areEqual(this.f65351a, c10018a.f65351a) && this.f65352b == c10018a.f65352b && md8.areEqual(this.f65353c, c10018a.f65353c) && wpf.m33065equalsimpl0(this.f65354d, c10018a.f65354d);
        }

        @yfb
        public final vq1 getCanvas() {
            return this.f65353c;
        }

        @yfb
        public final c64 getDensity() {
            return this.f65351a;
        }

        @yfb
        public final ov8 getLayoutDirection() {
            return this.f65352b;
        }

        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m31198getSizeNHjbRc() {
            return this.f65354d;
        }

        public int hashCode() {
            return (((((this.f65351a.hashCode() * 31) + this.f65352b.hashCode()) * 31) + this.f65353c.hashCode()) * 31) + wpf.m33070hashCodeimpl(this.f65354d);
        }

        public final void setCanvas(@yfb vq1 vq1Var) {
            this.f65353c = vq1Var;
        }

        public final void setDensity(@yfb c64 c64Var) {
            this.f65351a = c64Var;
        }

        public final void setLayoutDirection(@yfb ov8 ov8Var) {
            this.f65352b = ov8Var;
        }

        /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m31199setSizeuvyYCjk(long j) {
            this.f65354d = j;
        }

        @yfb
        public String toString() {
            return "DrawParams(density=" + this.f65351a + ", layoutDirection=" + this.f65352b + ", canvas=" + this.f65353c + ", size=" + ((Object) wpf.m33073toStringimpl(this.f65354d)) + ')';
        }

        private C10018a(c64 c64Var, ov8 ov8Var, vq1 vq1Var, long j) {
            this.f65351a = c64Var;
            this.f65352b = ov8Var;
            this.f65353c = vq1Var;
            this.f65354d = j;
        }

        public /* synthetic */ C10018a(c64 c64Var, ov8 ov8Var, vq1 vq1Var, long j, int i, jt3 jt3Var) {
            this((i & 1) != 0 ? cp4.getDefaultDensity() : c64Var, (i & 2) != 0 ? ov8.Ltr : ov8Var, (i & 4) != 0 ? new uz4() : vq1Var, (i & 8) != 0 ? wpf.f95046b.m33078getZeroNHjbRc() : j, null);
        }
    }

    /* JADX INFO: renamed from: nr1$b */
    public static final class C10019b implements bp4 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final tp4 f65355a = or1.asDrawTransform(this);

        /* JADX INFO: renamed from: b */
        @gib
        public u97 f65356b;

        public C10019b() {
        }

        @Override // p000.bp4
        @yfb
        public vq1 getCanvas() {
            return nr1.this.getDrawParams().getCanvas();
        }

        @Override // p000.bp4
        @yfb
        public c64 getDensity() {
            return nr1.this.getDrawParams().getDensity();
        }

        @Override // p000.bp4
        @gib
        public u97 getGraphicsLayer() {
            return this.f65356b;
        }

        @Override // p000.bp4
        @yfb
        public ov8 getLayoutDirection() {
            return nr1.this.getDrawParams().getLayoutDirection();
        }

        @Override // p000.bp4
        /* JADX INFO: renamed from: getSize-NH-jbRc */
        public long mo28019getSizeNHjbRc() {
            return nr1.this.getDrawParams().m31198getSizeNHjbRc();
        }

        @Override // p000.bp4
        @yfb
        public tp4 getTransform() {
            return this.f65355a;
        }

        @Override // p000.bp4
        public void setCanvas(@yfb vq1 vq1Var) {
            nr1.this.getDrawParams().setCanvas(vq1Var);
        }

        @Override // p000.bp4
        public void setDensity(@yfb c64 c64Var) {
            nr1.this.getDrawParams().setDensity(c64Var);
        }

        @Override // p000.bp4
        public void setGraphicsLayer(@gib u97 u97Var) {
            this.f65356b = u97Var;
        }

        @Override // p000.bp4
        public void setLayoutDirection(@yfb ov8 ov8Var) {
            nr1.this.getDrawParams().setLayoutDirection(ov8Var);
        }

        @Override // p000.bp4
        /* JADX INFO: renamed from: setSize-uvyYCjk */
        public void mo28020setSizeuvyYCjk(long j) {
            nr1.this.getDrawParams().m31199setSizeuvyYCjk(j);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ icc m18081a(nr1 nr1Var, long j, rp4 rp4Var, float f, b92 b92Var, int i, int i2, int i3, Object obj) {
        return nr1Var.m31189configurePaint2qPWKa0(j, rp4Var, f, b92Var, i, (i3 & 32) != 0 ? ip4.f47823w.m30276getDefaultFilterQualityfv9h1I() : i2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ icc m18082b(nr1 nr1Var, he1 he1Var, rp4 rp4Var, float f, b92 b92Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = ip4.f47823w.m30276getDefaultFilterQualityfv9h1I();
        }
        return nr1Var.m31190configurePaintswdJneE(he1Var, rp4Var, f, b92Var, i, i2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ icc m18083c(nr1 nr1Var, long j, float f, float f2, int i, int i2, ajc ajcVar, float f3, b92 b92Var, int i3, int i4, int i5, Object obj) {
        return nr1Var.m31191configureStrokePaintQ_0CZUI(j, f, f2, i, i2, ajcVar, f3, b92Var, i3, (i5 & 512) != 0 ? ip4.f47823w.m30276getDefaultFilterQualityfv9h1I() : i4);
    }

    /* JADX INFO: renamed from: configurePaint-2qPWKa0, reason: not valid java name */
    private final icc m31189configurePaint2qPWKa0(long j, rp4 rp4Var, @y46(from = 0.0d, m25645to = 1.0d) float f, b92 b92Var, int i, int i2) {
        icc iccVarSelectPaint = selectPaint(rp4Var);
        long jM31193modulate5vOe2sY = m31193modulate5vOe2sY(j, f);
        if (!w82.m32952equalsimpl0(iccVarSelectPaint.mo30193getColor0d7_KjU(), jM31193modulate5vOe2sY)) {
            iccVarSelectPaint.mo30199setColor8_81llA(jM31193modulate5vOe2sY);
        }
        if (iccVarSelectPaint.getShader() != null) {
            iccVarSelectPaint.setShader(null);
        }
        if (!md8.areEqual(iccVarSelectPaint.getColorFilter(), b92Var)) {
            iccVarSelectPaint.setColorFilter(b92Var);
        }
        if (!q51.m31897equalsimpl0(iccVarSelectPaint.mo30192getBlendMode0nO6VwU(), i)) {
            iccVarSelectPaint.mo30198setBlendModes9anfk8(i);
        }
        if (!xu5.m33291equalsimpl0(iccVarSelectPaint.mo30194getFilterQualityfv9h1I(), i2)) {
            iccVarSelectPaint.mo30200setFilterQualityvDHp3xo(i2);
        }
        return iccVarSelectPaint;
    }

    /* JADX INFO: renamed from: configurePaint-swdJneE, reason: not valid java name */
    private final icc m31190configurePaintswdJneE(he1 he1Var, rp4 rp4Var, @y46(from = 0.0d, m25645to = 1.0d) float f, b92 b92Var, int i, int i2) {
        icc iccVarSelectPaint = selectPaint(rp4Var);
        if (he1Var != null) {
            he1Var.mo27217applyToPq9zytI(mo30273getSizeNHjbRc(), iccVarSelectPaint, f);
        } else {
            if (iccVarSelectPaint.getShader() != null) {
                iccVarSelectPaint.setShader(null);
            }
            long jMo30193getColor0d7_KjU = iccVarSelectPaint.mo30193getColor0d7_KjU();
            w82.C14471a c14471a = w82.f93556b;
            if (!w82.m32952equalsimpl0(jMo30193getColor0d7_KjU, c14471a.m32977getBlack0d7_KjU())) {
                iccVarSelectPaint.mo30199setColor8_81llA(c14471a.m32977getBlack0d7_KjU());
            }
            if (iccVarSelectPaint.getAlpha() != f) {
                iccVarSelectPaint.setAlpha(f);
            }
        }
        if (!md8.areEqual(iccVarSelectPaint.getColorFilter(), b92Var)) {
            iccVarSelectPaint.setColorFilter(b92Var);
        }
        if (!q51.m31897equalsimpl0(iccVarSelectPaint.mo30192getBlendMode0nO6VwU(), i)) {
            iccVarSelectPaint.mo30198setBlendModes9anfk8(i);
        }
        if (!xu5.m33291equalsimpl0(iccVarSelectPaint.mo30194getFilterQualityfv9h1I(), i2)) {
            iccVarSelectPaint.mo30200setFilterQualityvDHp3xo(i2);
        }
        return iccVarSelectPaint;
    }

    /* JADX INFO: renamed from: configureStrokePaint-Q_0CZUI, reason: not valid java name */
    private final icc m31191configureStrokePaintQ_0CZUI(long j, float f, float f2, int i, int i2, ajc ajcVar, @y46(from = 0.0d, m25645to = 1.0d) float f3, b92 b92Var, int i3, int i4) {
        icc iccVarObtainStrokePaint = obtainStrokePaint();
        long jM31193modulate5vOe2sY = m31193modulate5vOe2sY(j, f3);
        if (!w82.m32952equalsimpl0(iccVarObtainStrokePaint.mo30193getColor0d7_KjU(), jM31193modulate5vOe2sY)) {
            iccVarObtainStrokePaint.mo30199setColor8_81llA(jM31193modulate5vOe2sY);
        }
        if (iccVarObtainStrokePaint.getShader() != null) {
            iccVarObtainStrokePaint.setShader(null);
        }
        if (!md8.areEqual(iccVarObtainStrokePaint.getColorFilter(), b92Var)) {
            iccVarObtainStrokePaint.setColorFilter(b92Var);
        }
        if (!q51.m31897equalsimpl0(iccVarObtainStrokePaint.mo30192getBlendMode0nO6VwU(), i3)) {
            iccVarObtainStrokePaint.mo30198setBlendModes9anfk8(i3);
        }
        if (iccVarObtainStrokePaint.getStrokeWidth() != f) {
            iccVarObtainStrokePaint.setStrokeWidth(f);
        }
        if (iccVarObtainStrokePaint.getStrokeMiterLimit() != f2) {
            iccVarObtainStrokePaint.setStrokeMiterLimit(f2);
        }
        if (!fag.m28900equalsimpl0(iccVarObtainStrokePaint.mo30195getStrokeCapKaPHkGw(), i)) {
            iccVarObtainStrokePaint.mo30201setStrokeCapBeK7IIE(i);
        }
        if (!hag.m29980equalsimpl0(iccVarObtainStrokePaint.mo30196getStrokeJoinLxFBmk8(), i2)) {
            iccVarObtainStrokePaint.mo30202setStrokeJoinWw9F2mQ(i2);
        }
        if (!md8.areEqual(iccVarObtainStrokePaint.getPathEffect(), ajcVar)) {
            iccVarObtainStrokePaint.setPathEffect(ajcVar);
        }
        if (!xu5.m33291equalsimpl0(iccVarObtainStrokePaint.mo30194getFilterQualityfv9h1I(), i4)) {
            iccVarObtainStrokePaint.mo30200setFilterQualityvDHp3xo(i4);
        }
        return iccVarObtainStrokePaint;
    }

    /* JADX INFO: renamed from: configureStrokePaint-ho4zsrM, reason: not valid java name */
    private final icc m31192configureStrokePaintho4zsrM(he1 he1Var, float f, float f2, int i, int i2, ajc ajcVar, @y46(from = 0.0d, m25645to = 1.0d) float f3, b92 b92Var, int i3, int i4) {
        icc iccVarObtainStrokePaint = obtainStrokePaint();
        if (he1Var != null) {
            he1Var.mo27217applyToPq9zytI(mo30273getSizeNHjbRc(), iccVarObtainStrokePaint, f3);
        } else if (iccVarObtainStrokePaint.getAlpha() != f3) {
            iccVarObtainStrokePaint.setAlpha(f3);
        }
        if (!md8.areEqual(iccVarObtainStrokePaint.getColorFilter(), b92Var)) {
            iccVarObtainStrokePaint.setColorFilter(b92Var);
        }
        if (!q51.m31897equalsimpl0(iccVarObtainStrokePaint.mo30192getBlendMode0nO6VwU(), i3)) {
            iccVarObtainStrokePaint.mo30198setBlendModes9anfk8(i3);
        }
        if (iccVarObtainStrokePaint.getStrokeWidth() != f) {
            iccVarObtainStrokePaint.setStrokeWidth(f);
        }
        if (iccVarObtainStrokePaint.getStrokeMiterLimit() != f2) {
            iccVarObtainStrokePaint.setStrokeMiterLimit(f2);
        }
        if (!fag.m28900equalsimpl0(iccVarObtainStrokePaint.mo30195getStrokeCapKaPHkGw(), i)) {
            iccVarObtainStrokePaint.mo30201setStrokeCapBeK7IIE(i);
        }
        if (!hag.m29980equalsimpl0(iccVarObtainStrokePaint.mo30196getStrokeJoinLxFBmk8(), i2)) {
            iccVarObtainStrokePaint.mo30202setStrokeJoinWw9F2mQ(i2);
        }
        if (!md8.areEqual(iccVarObtainStrokePaint.getPathEffect(), ajcVar)) {
            iccVarObtainStrokePaint.setPathEffect(ajcVar);
        }
        if (!xu5.m33291equalsimpl0(iccVarObtainStrokePaint.mo30194getFilterQualityfv9h1I(), i4)) {
            iccVarObtainStrokePaint.mo30200setFilterQualityvDHp3xo(i4);
        }
        return iccVarObtainStrokePaint;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ icc m18084d(nr1 nr1Var, he1 he1Var, float f, float f2, int i, int i2, ajc ajcVar, float f3, b92 b92Var, int i3, int i4, int i5, Object obj) {
        return nr1Var.m31192configureStrokePaintho4zsrM(he1Var, f, f2, i, i2, ajcVar, f3, b92Var, i3, (i5 & 512) != 0 ? ip4.f47823w.m30276getDefaultFilterQualityfv9h1I() : i4);
    }

    @yjd
    public static /* synthetic */ void getDrawParams$annotations() {
    }

    /* JADX INFO: renamed from: modulate-5vOe2sY, reason: not valid java name */
    private final long m31193modulate5vOe2sY(long j, float f) {
        return f == 1.0f ? j : w82.m32950copywmQWz5c$default(j, w82.m32953getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final icc obtainFillPaint() {
        icc iccVar = this.f65349c;
        if (iccVar != null) {
            return iccVar;
        }
        icc iccVarPaint = C14793wt.Paint();
        iccVarPaint.mo30203setStylek9PVt8s(rcc.f77828b.m32114getFillTiuSbCo());
        this.f65349c = iccVarPaint;
        return iccVarPaint;
    }

    private final icc obtainStrokePaint() {
        icc iccVar = this.f65350d;
        if (iccVar != null) {
            return iccVar;
        }
        icc iccVarPaint = C14793wt.Paint();
        iccVarPaint.mo30203setStylek9PVt8s(rcc.f77828b.m32115getStrokeTiuSbCo());
        this.f65350d = iccVarPaint;
        return iccVarPaint;
    }

    private final icc selectPaint(rp4 rp4Var) {
        if (md8.areEqual(rp4Var, nu5.f65694a)) {
            return obtainFillPaint();
        }
        if (!(rp4Var instanceof eag)) {
            throw new ceb();
        }
        icc iccVarObtainStrokePaint = obtainStrokePaint();
        eag eagVar = (eag) rp4Var;
        if (iccVarObtainStrokePaint.getStrokeWidth() != eagVar.getWidth()) {
            iccVarObtainStrokePaint.setStrokeWidth(eagVar.getWidth());
        }
        if (!fag.m28900equalsimpl0(iccVarObtainStrokePaint.mo30195getStrokeCapKaPHkGw(), eagVar.m28820getCapKaPHkGw())) {
            iccVarObtainStrokePaint.mo30201setStrokeCapBeK7IIE(eagVar.m28820getCapKaPHkGw());
        }
        if (iccVarObtainStrokePaint.getStrokeMiterLimit() != eagVar.getMiter()) {
            iccVarObtainStrokePaint.setStrokeMiterLimit(eagVar.getMiter());
        }
        if (!hag.m29980equalsimpl0(iccVarObtainStrokePaint.mo30196getStrokeJoinLxFBmk8(), eagVar.m28821getJoinLxFBmk8())) {
            iccVarObtainStrokePaint.mo30202setStrokeJoinWw9F2mQ(eagVar.m28821getJoinLxFBmk8());
        }
        if (!md8.areEqual(iccVarObtainStrokePaint.getPathEffect(), eagVar.getPathEffect())) {
            iccVarObtainStrokePaint.setPathEffect(eagVar.getPathEffect());
        }
        return iccVarObtainStrokePaint;
    }

    /* JADX INFO: renamed from: draw-yzxVdVo, reason: not valid java name */
    public final void m31194drawyzxVdVo(@yfb c64 c64Var, @yfb ov8 ov8Var, @yfb vq1 vq1Var, long j, @yfb qy6<? super ip4, bth> qy6Var) {
        C10018a drawParams = getDrawParams();
        c64 c64VarComponent1 = drawParams.component1();
        ov8 ov8VarComponent2 = drawParams.component2();
        vq1 vq1VarComponent3 = drawParams.component3();
        long jM31196component4NHjbRc = drawParams.m31196component4NHjbRc();
        C10018a drawParams2 = getDrawParams();
        drawParams2.setDensity(c64Var);
        drawParams2.setLayoutDirection(ov8Var);
        drawParams2.setCanvas(vq1Var);
        drawParams2.m31199setSizeuvyYCjk(j);
        vq1Var.save();
        qy6Var.invoke(this);
        vq1Var.restore();
        C10018a drawParams3 = getDrawParams();
        drawParams3.setDensity(c64VarComponent1);
        drawParams3.setLayoutDirection(ov8VarComponent2);
        drawParams3.setCanvas(vq1VarComponent3);
        drawParams3.m31199setSizeuvyYCjk(jM31196component4NHjbRc);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawArc-illE91I */
    public void mo30253drawArcillE91I(@yfb he1 he1Var, float f, float f2, boolean z, long j, long j2, @y46(from = 0.0d, m25645to = 1.0d) float f3, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65347a.getCanvas().drawArc(izb.m30429getXimpl(j), izb.m30430getYimpl(j), izb.m30429getXimpl(j) + wpf.m33069getWidthimpl(j2), izb.m30430getYimpl(j) + wpf.m33066getHeightimpl(j2), f, f2, z, m18082b(this, he1Var, rp4Var, f3, b92Var, i, 0, 32, null));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawArc-yD3GUKo */
    public void mo30254drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, @y46(from = 0.0d, m25645to = 1.0d) float f3, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65347a.getCanvas().drawArc(izb.m30429getXimpl(j2), izb.m30430getYimpl(j2), izb.m30429getXimpl(j2) + wpf.m33069getWidthimpl(j3), izb.m30430getYimpl(j2) + wpf.m33066getHeightimpl(j3), f, f2, z, m18081a(this, j, rp4Var, f3, b92Var, i, 0, 32, null));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawCircle-V9BoPsw */
    public void mo30255drawCircleV9BoPsw(@yfb he1 he1Var, float f, long j, @y46(from = 0.0d, m25645to = 1.0d) float f2, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65347a.getCanvas().mo28669drawCircle9KIMszo(j, f, m18082b(this, he1Var, rp4Var, f2, b92Var, i, 0, 32, null));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawCircle-VaOC9Bg */
    public void mo30256drawCircleVaOC9Bg(long j, float f, long j2, @y46(from = 0.0d, m25645to = 1.0d) float f2, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65347a.getCanvas().mo28669drawCircle9KIMszo(j2, f, m18081a(this, j, rp4Var, f2, b92Var, i, 0, 32, null));
    }

    @Override // p000.ip4
    @q64(level = u64.f86867c, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @i2e(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* JADX INFO: renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo30257drawImage9jGpkUE(rs7 rs7Var, long j, long j2, long j3, long j4, @y46(from = 0.0d, m25645to = 1.0d) float f, rp4 rp4Var, b92 b92Var, int i) {
        this.f65347a.getCanvas().mo28671drawImageRectHPBpro0(rs7Var, j, j2, j3, j4, m18082b(this, null, rp4Var, f, b92Var, i, 0, 32, null));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawImage-AZ2fEMs */
    public void mo30258drawImageAZ2fEMs(@yfb rs7 rs7Var, long j, long j2, long j3, long j4, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i, int i2) {
        this.f65347a.getCanvas().mo28671drawImageRectHPBpro0(rs7Var, j, j2, j3, j4, m31190configurePaintswdJneE(null, rp4Var, f, b92Var, i, i2));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawImage-gbVJVH8 */
    public void mo30259drawImagegbVJVH8(@yfb rs7 rs7Var, long j, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65347a.getCanvas().mo28670drawImaged4ec7I(rs7Var, j, m18082b(this, null, rp4Var, f, b92Var, i, 0, 32, null));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawLine-1RTmtNc */
    public void mo30260drawLine1RTmtNc(@yfb he1 he1Var, long j, long j2, float f, int i, @gib ajc ajcVar, @y46(from = 0.0d, m25645to = 1.0d) float f2, @gib b92 b92Var, int i2) {
        this.f65347a.getCanvas().mo28672drawLineWko1d7g(j, j2, m18084d(this, he1Var, f, 4.0f, i, hag.f43019b.m29985getMiterLxFBmk8(), ajcVar, f2, b92Var, i2, 0, 512, null));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawLine-NGM6Ib0 */
    public void mo30261drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, @gib ajc ajcVar, @y46(from = 0.0d, m25645to = 1.0d) float f2, @gib b92 b92Var, int i2) {
        this.f65347a.getCanvas().mo28672drawLineWko1d7g(j2, j3, m18083c(this, j, f, 4.0f, i, hag.f43019b.m29985getMiterLxFBmk8(), ajcVar, f2, b92Var, i2, 0, 512, null));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawOval-AsUm42w */
    public void mo30262drawOvalAsUm42w(@yfb he1 he1Var, long j, long j2, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65347a.getCanvas().drawOval(izb.m30429getXimpl(j), izb.m30430getYimpl(j), izb.m30429getXimpl(j) + wpf.m33069getWidthimpl(j2), izb.m30430getYimpl(j) + wpf.m33066getHeightimpl(j2), m18082b(this, he1Var, rp4Var, f, b92Var, i, 0, 32, null));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawOval-n-J9OG0 */
    public void mo30263drawOvalnJ9OG0(long j, long j2, long j3, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65347a.getCanvas().drawOval(izb.m30429getXimpl(j2), izb.m30430getYimpl(j2), izb.m30429getXimpl(j2) + wpf.m33069getWidthimpl(j3), izb.m30430getYimpl(j2) + wpf.m33066getHeightimpl(j3), m18081a(this, j, rp4Var, f, b92Var, i, 0, 32, null));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawPath-GBMwjPU */
    public void mo30264drawPathGBMwjPU(@yfb vic vicVar, @yfb he1 he1Var, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65347a.getCanvas().drawPath(vicVar, m18082b(this, he1Var, rp4Var, f, b92Var, i, 0, 32, null));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawPath-LG529CI */
    public void mo30265drawPathLG529CI(@yfb vic vicVar, long j, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65347a.getCanvas().drawPath(vicVar, m18081a(this, j, rp4Var, f, b92Var, i, 0, 32, null));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawPoints-F8ZwMP8 */
    public void mo30266drawPointsF8ZwMP8(@yfb List<izb> list, int i, long j, float f, int i2, @gib ajc ajcVar, @y46(from = 0.0d, m25645to = 1.0d) float f2, @gib b92 b92Var, int i3) {
        this.f65347a.getCanvas().mo28673drawPointsO7TthRY(i, list, m18083c(this, j, f, 4.0f, i2, hag.f43019b.m29985getMiterLxFBmk8(), ajcVar, f2, b92Var, i3, 0, 512, null));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawPoints-Gsft0Ws */
    public void mo30267drawPointsGsft0Ws(@yfb List<izb> list, int i, @yfb he1 he1Var, float f, int i2, @gib ajc ajcVar, @y46(from = 0.0d, m25645to = 1.0d) float f2, @gib b92 b92Var, int i3) {
        this.f65347a.getCanvas().mo28673drawPointsO7TthRY(i, list, m18084d(this, he1Var, f, 4.0f, i2, hag.f43019b.m29985getMiterLxFBmk8(), ajcVar, f2, b92Var, i3, 0, 512, null));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawRect-AsUm42w */
    public void mo30268drawRectAsUm42w(@yfb he1 he1Var, long j, long j2, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65347a.getCanvas().drawRect(izb.m30429getXimpl(j), izb.m30430getYimpl(j), izb.m30429getXimpl(j) + wpf.m33069getWidthimpl(j2), izb.m30430getYimpl(j) + wpf.m33066getHeightimpl(j2), m18082b(this, he1Var, rp4Var, f, b92Var, i, 0, 32, null));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawRect-n-J9OG0 */
    public void mo30269drawRectnJ9OG0(long j, long j2, long j3, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65347a.getCanvas().drawRect(izb.m30429getXimpl(j2), izb.m30430getYimpl(j2), izb.m30429getXimpl(j2) + wpf.m33069getWidthimpl(j3), izb.m30430getYimpl(j2) + wpf.m33066getHeightimpl(j3), m18081a(this, j, rp4Var, f, b92Var, i, 0, 32, null));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ */
    public void mo30270drawRoundRectZuiqVtQ(@yfb he1 he1Var, long j, long j2, long j3, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65347a.getCanvas().drawRoundRect(izb.m30429getXimpl(j), izb.m30430getYimpl(j), izb.m30429getXimpl(j) + wpf.m33069getWidthimpl(j2), izb.m30430getYimpl(j) + wpf.m33066getHeightimpl(j2), u03.m32492getXimpl(j3), u03.m32493getYimpl(j3), m18082b(this, he1Var, rp4Var, f, b92Var, i, 0, 32, null));
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA */
    public void mo30271drawRoundRectuAw5IA(long j, long j2, long j3, long j4, @yfb rp4 rp4Var, @y46(from = 0.0d, m25645to = 1.0d) float f, @gib b92 b92Var, int i) {
        this.f65347a.getCanvas().drawRoundRect(izb.m30429getXimpl(j2), izb.m30430getYimpl(j2), izb.m30429getXimpl(j2) + wpf.m33069getWidthimpl(j3), izb.m30430getYimpl(j2) + wpf.m33066getHeightimpl(j3), u03.m32492getXimpl(j4), u03.m32493getYimpl(j4), m18081a(this, j, rp4Var, f, b92Var, i, 0, 32, null));
    }

    @Override // p000.c64
    public float getDensity() {
        return this.f65347a.getDensity().getDensity();
    }

    @Override // p000.ip4
    @yfb
    public bp4 getDrawContext() {
        return this.f65348b;
    }

    @yfb
    public final C10018a getDrawParams() {
        return this.f65347a;
    }

    @Override // p000.dp6
    public float getFontScale() {
        return this.f65347a.getDensity().getFontScale();
    }

    @Override // p000.ip4
    @yfb
    public ov8 getLayoutDirection() {
        return this.f65347a.getLayoutDirection();
    }
}
