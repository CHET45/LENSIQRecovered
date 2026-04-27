package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,218:1\n68#2,3:219\n256#2:222\n72#2,3:230\n111#3,7:223\n*S KotlinDebug\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n*L\n195#1:219,3\n206#1:222\n195#1:230,3\n207#1:223,7\n*E\n"})
public abstract class occ {

    /* JADX INFO: renamed from: a */
    @gib
    public icc f67197a;

    /* JADX INFO: renamed from: b */
    public boolean f67198b;

    /* JADX INFO: renamed from: c */
    @gib
    public b92 f67199c;

    /* JADX INFO: renamed from: d */
    public float f67200d = 1.0f;

    /* JADX INFO: renamed from: e */
    @yfb
    public ov8 f67201e = ov8.Ltr;

    /* JADX INFO: renamed from: f */
    @yfb
    public final qy6<ip4, bth> f67202f = new C10309a();

    /* JADX INFO: renamed from: occ$a */
    public static final class C10309a extends tt8 implements qy6<ip4, bth> {
        public C10309a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ip4 ip4Var) {
            invoke2(ip4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ip4 ip4Var) {
            occ.this.mo3757d(ip4Var);
        }
    }

    private final void configureAlpha(float f) {
        if (this.f67200d == f) {
            return;
        }
        if (!mo3755a(f)) {
            if (f == 1.0f) {
                icc iccVar = this.f67197a;
                if (iccVar != null) {
                    iccVar.setAlpha(f);
                }
                this.f67198b = false;
            } else {
                obtainPaint().setAlpha(f);
                this.f67198b = true;
            }
        }
        this.f67200d = f;
    }

    private final void configureColorFilter(b92 b92Var) {
        if (md8.areEqual(this.f67199c, b92Var)) {
            return;
        }
        if (!mo3756b(b92Var)) {
            if (b92Var == null) {
                icc iccVar = this.f67197a;
                if (iccVar != null) {
                    iccVar.setColorFilter(null);
                }
                this.f67198b = false;
            } else {
                obtainPaint().setColorFilter(b92Var);
                this.f67198b = true;
            }
        }
        this.f67199c = b92Var;
    }

    private final void configureLayoutDirection(ov8 ov8Var) {
        if (this.f67201e != ov8Var) {
            m18578c(ov8Var);
            this.f67201e = ov8Var;
        }
    }

    /* JADX INFO: renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m31326drawx_KDEd0$default(occ occVar, ip4 ip4Var, long j, float f, b92 b92Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            b92Var = null;
        }
        occVar.m31327drawx_KDEd0(ip4Var, j, f2, b92Var);
    }

    private final icc obtainPaint() {
        icc iccVar = this.f67197a;
        if (iccVar != null) {
            return iccVar;
        }
        icc iccVarPaint = C14793wt.Paint();
        this.f67197a = iccVarPaint;
        return iccVarPaint;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo3755a(float f) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo3756b(@gib b92 b92Var) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m18578c(@yfb ov8 ov8Var) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo3757d(@yfb ip4 ip4Var);

    /* JADX INFO: renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m31327drawx_KDEd0(@yfb ip4 ip4Var, long j, float f, @gib b92 b92Var) {
        configureAlpha(f);
        configureColorFilter(b92Var);
        configureLayoutDirection(ip4Var.getLayoutDirection());
        float fM33069getWidthimpl = wpf.m33069getWidthimpl(ip4Var.mo30273getSizeNHjbRc()) - wpf.m33069getWidthimpl(j);
        float fM33066getHeightimpl = wpf.m33066getHeightimpl(ip4Var.mo30273getSizeNHjbRc()) - wpf.m33066getHeightimpl(j);
        ip4Var.getDrawContext().getTransform().inset(0.0f, 0.0f, fM33069getWidthimpl, fM33066getHeightimpl);
        if (f > 0.0f) {
            try {
                if (wpf.m33069getWidthimpl(j) > 0.0f && wpf.m33066getHeightimpl(j) > 0.0f) {
                    if (this.f67198b) {
                        rud rudVarM33303Recttz77jQw = xud.m33303Recttz77jQw(izb.f49009b.m30445getZeroF1C5BW0(), eqf.Size(wpf.m33069getWidthimpl(j), wpf.m33066getHeightimpl(j)));
                        vq1 canvas = ip4Var.getDrawContext().getCanvas();
                        try {
                            canvas.saveLayer(rudVarM33303Recttz77jQw, obtainPaint());
                            mo3757d(ip4Var);
                            canvas.restore();
                        } catch (Throwable th) {
                            canvas.restore();
                            throw th;
                        }
                    } else {
                        mo3757d(ip4Var);
                    }
                }
            } catch (Throwable th2) {
                ip4Var.getDrawContext().getTransform().inset(-0.0f, -0.0f, -fM33069getWidthimpl, -fM33066getHeightimpl);
                throw th2;
            }
        }
        ip4Var.getDrawContext().getTransform().inset(-0.0f, -0.0f, -fM33069getWidthimpl, -fM33066getHeightimpl);
    }

    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo28196getIntrinsicSizeNHjbRc();
}
