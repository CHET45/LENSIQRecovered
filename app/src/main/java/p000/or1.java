package p000;

/* JADX INFO: loaded from: classes.dex */
public final class or1 {

    /* JADX INFO: renamed from: or1$a */
    @dwf({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScopeKt$asDrawTransform$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,791:1\n33#2,7:792\n*S KotlinDebug\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScopeKt$asDrawTransform$1\n*L\n745#1:792,7\n*E\n"})
    public static final class C10509a implements tp4 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bp4 f68365a;

        public C10509a(bp4 bp4Var) {
            this.f68365a = bp4Var;
        }

        @Override // p000.tp4
        /* JADX INFO: renamed from: clipPath-mtrdD-E, reason: not valid java name */
        public void mo31597clipPathmtrdDE(@yfb vic vicVar, int i) {
            this.f68365a.getCanvas().mo28666clipPathmtrdDE(vicVar, i);
        }

        @Override // p000.tp4
        /* JADX INFO: renamed from: clipRect-N_I0leg, reason: not valid java name */
        public void mo31598clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
            this.f68365a.getCanvas().mo28667clipRectN_I0leg(f, f2, f3, f4, i);
        }

        @Override // p000.tp4
        /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public long mo31599getCenterF1C5BW0() {
            return eqf.m28834getCenteruvyYCjk(mo31600getSizeNHjbRc());
        }

        @Override // p000.tp4
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public long mo31600getSizeNHjbRc() {
            return this.f68365a.mo28019getSizeNHjbRc();
        }

        @Override // p000.tp4
        public void inset(float f, float f2, float f3, float f4) {
            vq1 canvas = this.f68365a.getCanvas();
            bp4 bp4Var = this.f68365a;
            long jSize = eqf.Size(wpf.m33069getWidthimpl(mo31600getSizeNHjbRc()) - (f3 + f), wpf.m33066getHeightimpl(mo31600getSizeNHjbRc()) - (f4 + f2));
            if (!(wpf.m33069getWidthimpl(jSize) >= 0.0f && wpf.m33066getHeightimpl(jSize) >= 0.0f)) {
                f28.throwIllegalArgumentException("Width and height must be greater than or equal to zero");
            }
            bp4Var.mo28020setSizeuvyYCjk(jSize);
            canvas.translate(f, f2);
        }

        @Override // p000.tp4
        /* JADX INFO: renamed from: rotate-Uv8p0NA, reason: not valid java name */
        public void mo31601rotateUv8p0NA(float f, long j) {
            vq1 canvas = this.f68365a.getCanvas();
            canvas.translate(izb.m30429getXimpl(j), izb.m30430getYimpl(j));
            canvas.rotate(f);
            canvas.translate(-izb.m30429getXimpl(j), -izb.m30430getYimpl(j));
        }

        @Override // p000.tp4
        /* JADX INFO: renamed from: scale-0AR0LA0, reason: not valid java name */
        public void mo31602scale0AR0LA0(float f, float f2, long j) {
            vq1 canvas = this.f68365a.getCanvas();
            canvas.translate(izb.m30429getXimpl(j), izb.m30430getYimpl(j));
            canvas.scale(f, f2);
            canvas.translate(-izb.m30429getXimpl(j), -izb.m30430getYimpl(j));
        }

        @Override // p000.tp4
        /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
        public void mo31603transform58bKbWc(@yfb float[] fArr) {
            this.f68365a.getCanvas().mo28668concat58bKbWc(fArr);
        }

        @Override // p000.tp4
        public void translate(float f, float f2) {
            this.f68365a.getCanvas().translate(f, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tp4 asDrawTransform(bp4 bp4Var) {
        return new C10509a(bp4Var);
    }
}
