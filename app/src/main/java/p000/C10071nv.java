package p000;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import p000.qqg;

/* JADX INFO: renamed from: nv */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidTextPaint.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,203:1\n1#2:204\n696#3:205\n198#4:206\n*S KotlinDebug\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n*L\n105#1:205\n131#1:206\n*E\n"})
@e0g(parameters = 0)
public final class C10071nv extends TextPaint {

    /* JADX INFO: renamed from: i */
    public static final int f65760i = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public icc f65761a;

    /* JADX INFO: renamed from: b */
    @yfb
    public qqg f65762b;

    /* JADX INFO: renamed from: c */
    public int f65763c;

    /* JADX INFO: renamed from: d */
    @yfb
    public e8f f65764d;

    /* JADX INFO: renamed from: e */
    @gib
    public he1 f65765e;

    /* JADX INFO: renamed from: f */
    @gib
    public i2g<? extends Shader> f65766f;

    /* JADX INFO: renamed from: g */
    @gib
    public wpf f65767g;

    /* JADX INFO: renamed from: h */
    @gib
    public rp4 f65768h;

    /* JADX INFO: renamed from: nv$a */
    public static final class a extends tt8 implements ny6<Shader> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ he1 f65769a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f65770b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(he1 he1Var, long j) {
            super(0);
            this.f65769a = he1Var;
            this.f65770b = j;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Shader invoke() {
            return ((a8f) this.f65769a).mo27218createShaderuvyYCjk(this.f65770b);
        }
    }

    public C10071nv(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        this.f65762b = qqg.f75141b.getNone();
        this.f65763c = ip4.f47823w.m30275getDefaultBlendMode0nO6VwU();
        this.f65764d = e8f.f32134d.getNone();
    }

    private final void clearShader() {
        this.f65766f = null;
        this.f65765e = null;
        this.f65767g = null;
        setShader(null);
    }

    @fdi
    public static /* synthetic */ void getBrush$ui_text_release$annotations() {
    }

    @fdi
    /* JADX INFO: renamed from: getBrushSize-VsRJwc0$ui_text_release$annotations, reason: not valid java name */
    public static /* synthetic */ void m31231getBrushSizeVsRJwc0$ui_text_release$annotations() {
    }

    private final icc getComposePaint() {
        icc iccVar = this.f65761a;
        if (iccVar != null) {
            return iccVar;
        }
        icc iccVarAsComposePaint = C14793wt.asComposePaint(this);
        this.f65761a = iccVarAsComposePaint;
        return iccVarAsComposePaint;
    }

    @fdi
    public static /* synthetic */ void getShadow$ui_text_release$annotations() {
    }

    /* JADX INFO: renamed from: setBrush-12SF9DM$default, reason: not valid java name */
    public static /* synthetic */ void m31232setBrush12SF9DM$default(C10071nv c10071nv, he1 he1Var, long j, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = Float.NaN;
        }
        c10071nv.m31236setBrush12SF9DM(he1Var, j, f);
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m31233getBlendMode0nO6VwU() {
        return this.f65763c;
    }

    @gib
    public final he1 getBrush$ui_text_release() {
        return this.f65765e;
    }

    @gib
    /* JADX INFO: renamed from: getBrushSize-VsRJwc0$ui_text_release, reason: not valid java name */
    public final wpf m31234getBrushSizeVsRJwc0$ui_text_release() {
        return this.f65767g;
    }

    @gib
    public final i2g<Shader> getShaderState$ui_text_release() {
        return this.f65766f;
    }

    @yfb
    public final e8f getShadow$ui_text_release() {
        return this.f65764d;
    }

    /* JADX INFO: renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m31235setBlendModes9anfk8(int i) {
        if (q51.m31897equalsimpl0(i, this.f65763c)) {
            return;
        }
        getComposePaint().mo30198setBlendModes9anfk8(i);
        this.f65763c = i;
    }

    public final void setBrush$ui_text_release(@gib he1 he1Var) {
        this.f65765e = he1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX INFO: renamed from: setBrush-12SF9DM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m31236setBrush12SF9DM(@p000.gib p000.he1 r5, long r6, float r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L6
            r4.clearShader()
            goto L6a
        L6:
            boolean r0 = r5 instanceof p000.bvf
            if (r0 == 0) goto L18
            bvf r5 = (p000.bvf) r5
            long r5 = r5.m28160getValue0d7_KjU()
            long r5 = p000.arg.m27876modulateDxMtmZc(r5, r8)
            r4.m31238setColor8_81llA(r5)
            goto L6a
        L18:
            boolean r0 = r5 instanceof p000.a8f
            if (r0 == 0) goto L6a
            he1 r0 = r4.f65765e
            boolean r0 = p000.md8.areEqual(r0, r5)
            r1 = 0
            if (r0 == 0) goto L35
            wpf r0 = r4.f65767g
            if (r0 != 0) goto L2b
            r0 = r1
            goto L33
        L2b:
            long r2 = r0.m33074unboximpl()
            boolean r0 = p000.wpf.m33065equalsimpl0(r2, r6)
        L33:
            if (r0 != 0) goto L54
        L35:
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L3f
            r1 = 1
        L3f:
            if (r1 == 0) goto L54
            r4.f65765e = r5
            wpf r0 = p000.wpf.m33057boximpl(r6)
            r4.f65767g = r0
            nv$a r0 = new nv$a
            r0.<init>(r5, r6)
            i2g r5 = p000.stf.derivedStateOf(r0)
            r4.f65766f = r5
        L54:
            icc r5 = r4.getComposePaint()
            i2g<? extends android.graphics.Shader> r6 = r4.f65766f
            if (r6 == 0) goto L63
            java.lang.Object r6 = r6.getValue()
            android.graphics.Shader r6 = (android.graphics.Shader) r6
            goto L64
        L63:
            r6 = 0
        L64:
            r5.setShader(r6)
            p000.C10661ov.setAlpha(r4, r8)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10071nv.m31236setBrush12SF9DM(he1, long, float):void");
    }

    /* JADX INFO: renamed from: setBrushSize-iaC8Vc4$ui_text_release, reason: not valid java name */
    public final void m31237setBrushSizeiaC8Vc4$ui_text_release(@gib wpf wpfVar) {
        this.f65767g = wpfVar;
    }

    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m31238setColor8_81llA(long j) {
        if (j != 16) {
            setColor(j92.m30490toArgb8_81llA(j));
            clearShader();
        }
    }

    public final void setDrawStyle(@gib rp4 rp4Var) {
        if (rp4Var == null || md8.areEqual(this.f65768h, rp4Var)) {
            return;
        }
        this.f65768h = rp4Var;
        if (md8.areEqual(rp4Var, nu5.f65694a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (rp4Var instanceof eag) {
            getComposePaint().mo30203setStylek9PVt8s(rcc.f77828b.m32115getStrokeTiuSbCo());
            eag eagVar = (eag) rp4Var;
            getComposePaint().setStrokeWidth(eagVar.getWidth());
            getComposePaint().setStrokeMiterLimit(eagVar.getMiter());
            getComposePaint().mo30202setStrokeJoinWw9F2mQ(eagVar.m28821getJoinLxFBmk8());
            getComposePaint().mo30201setStrokeCapBeK7IIE(eagVar.m28820getCapKaPHkGw());
            getComposePaint().setPathEffect(eagVar.getPathEffect());
        }
    }

    public final void setShaderState$ui_text_release(@gib i2g<? extends Shader> i2gVar) {
        this.f65766f = i2gVar;
    }

    public final void setShadow(@gib e8f e8fVar) {
        if (e8fVar == null || md8.areEqual(this.f65764d, e8fVar)) {
            return;
        }
        this.f65764d = e8fVar;
        if (md8.areEqual(e8fVar, e8f.f32134d.getNone())) {
            clearShadowLayer();
        } else {
            setShadowLayer(cvg.correctBlurRadius(this.f65764d.getBlurRadius()), izb.m30429getXimpl(this.f65764d.m28818getOffsetF1C5BW0()), izb.m30430getYimpl(this.f65764d.m28818getOffsetF1C5BW0()), j92.m30490toArgb8_81llA(this.f65764d.m28817getColor0d7_KjU()));
        }
    }

    public final void setShadow$ui_text_release(@yfb e8f e8fVar) {
        this.f65764d = e8fVar;
    }

    public final void setTextDecoration(@gib qqg qqgVar) {
        if (qqgVar == null || md8.areEqual(this.f65762b, qqgVar)) {
            return;
        }
        this.f65762b = qqgVar;
        qqg.C11588a c11588a = qqg.f75141b;
        setUnderlineText(qqgVar.contains(c11588a.getUnderline()));
        setStrikeThruText(this.f65762b.contains(c11588a.getLineThrough()));
    }
}
