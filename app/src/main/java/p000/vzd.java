package p000;

import androidx.compose.animation.C0579l;
import androidx.compose.animation.C0581n;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRenderInTransitionOverlayNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,157:1\n76#2:158\n109#2,2:159\n*S KotlinDebug\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode\n*L\n91#1:158\n91#1:159,2\n*E\n"})
@e0g(parameters = 0)
public final class vzd extends InterfaceC0701e.d implements fp4, mxa {

    /* JADX INFO: renamed from: Z1 */
    public static final int f92957Z1 = 8;

    /* JADX INFO: renamed from: M1 */
    @yfb
    public final b5b f92958M1;

    /* JADX INFO: renamed from: V1 */
    @gib
    public C14312a f92959V1;

    /* JADX INFO: renamed from: X */
    @yfb
    public C0581n f92960X;

    /* JADX INFO: renamed from: Y */
    @yfb
    public ny6<Boolean> f92961Y;

    /* JADX INFO: renamed from: Z */
    @yfb
    public gz6<? super ov8, ? super c64, ? extends vic> f92962Z;

    /* JADX INFO: renamed from: vzd$a */
    @dwf({"SMAP\nRenderInTransitionOverlayNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode$LayerWithRenderer\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,157:1\n70#2,4:158\n244#3,5:162\n272#3,9:167\n128#3,7:176\n282#3,4:183\n128#3,7:187\n*S KotlinDebug\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode$LayerWithRenderer\n*L\n106#1:158,4\n111#1:162,5\n111#1:167,9\n112#1:176,7\n111#1:183,4\n117#1:187,7\n*E\n"})
    public final class C14312a implements av8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final u97 f92963a;

        public C14312a(@yfb u97 u97Var) {
            this.f92963a = u97Var;
        }

        @Override // p000.av8
        public void drawInOverlay(@yfb ip4 ip4Var) {
            if (vzd.this.getRenderInOverlay().invoke().booleanValue()) {
                vzd vzdVar = vzd.this;
                long jMo30034localPositionOfR5De75A = vzdVar.getSharedScope().getRoot$animation_release().mo30034localPositionOfR5De75A(w34.requireLayoutCoordinates(vzdVar), izb.f49009b.m30445getZeroF1C5BW0());
                float fM30429getXimpl = izb.m30429getXimpl(jMo30034localPositionOfR5De75A);
                float fM30430getYimpl = izb.m30430getYimpl(jMo30034localPositionOfR5De75A);
                vic vicVarInvoke = vzdVar.getClipInOverlay().invoke(ip4Var.getLayoutDirection(), w34.requireDensity(vzdVar));
                if (vicVarInvoke == null) {
                    ip4Var.getDrawContext().getTransform().translate(fM30429getXimpl, fM30430getYimpl);
                    try {
                        w97.drawLayer(ip4Var, this.f92963a);
                        return;
                    } finally {
                    }
                }
                int iM33213getIntersectrtfAjoo = x42.f96262b.m33213getIntersectrtfAjoo();
                bp4 drawContext = ip4Var.getDrawContext();
                long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo31597clipPathmtrdDE(vicVarInvoke, iM33213getIntersectrtfAjoo);
                    ip4Var.getDrawContext().getTransform().translate(fM30429getXimpl, fM30430getYimpl);
                    try {
                        w97.drawLayer(ip4Var, this.f92963a);
                    } finally {
                    }
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
                }
            }
        }

        @yfb
        public final u97 getLayer() {
            return this.f92963a;
        }

        @Override // p000.av8
        @gib
        public C0579l getParentState() {
            return vzd.this.getParentState();
        }

        @Override // p000.av8
        public float getZIndex() {
            return vzd.this.getZIndexInOverlay();
        }
    }

    /* JADX INFO: renamed from: vzd$b */
    public static final class C14313b extends tt8 implements qy6<ip4, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ov2 f92965a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14313b(ov2 ov2Var) {
            super(1);
            this.f92965a = ov2Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ip4 ip4Var) {
            invoke2(ip4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ip4 ip4Var) {
            this.f92965a.drawContent();
        }
    }

    public vzd(@yfb C0581n c0581n, @yfb ny6<Boolean> ny6Var, float f, @yfb gz6<? super ov8, ? super c64, ? extends vic> gz6Var) {
        this.f92960X = c0581n;
        this.f92961Y = ny6Var;
        this.f92962Z = gz6Var;
        this.f92958M1 = pbd.mutableFloatStateOf(f);
    }

    @Override // p000.fp4
    public void draw(@yfb ov2 ov2Var) {
        u97 layer = getLayer();
        if (layer == null) {
            throw new IllegalArgumentException("Error: layer never initialized");
        }
        ip4.m30252recordJVtK1S4$default(ov2Var, layer, 0L, new C14313b(ov2Var), 1, null);
        if (this.f92961Y.invoke().booleanValue()) {
            return;
        }
        w97.drawLayer(ov2Var, layer);
    }

    @yfb
    public final gz6<ov8, c64, vic> getClipInOverlay() {
        return this.f92962Z;
    }

    @gib
    public final u97 getLayer() {
        C14312a c14312a = this.f92959V1;
        if (c14312a != null) {
            return c14312a.getLayer();
        }
        return null;
    }

    @gib
    public final C0579l getParentState() {
        return (C0579l) getCurrent(n9f.getModifierLocalSharedElementInternalState());
    }

    @yfb
    public final ny6<Boolean> getRenderInOverlay() {
        return this.f92961Y;
    }

    @yfb
    public final C0581n getSharedScope() {
        return this.f92960X;
    }

    public final float getZIndexInOverlay() {
        return this.f92958M1.getFloatValue();
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onAttach() {
        C14312a c14312a = new C14312a(w34.requireGraphicsContext(this).createGraphicsLayer());
        this.f92960X.onLayerRendererCreated$animation_release(c14312a);
        this.f92959V1 = c14312a;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        C14312a c14312a = this.f92959V1;
        if (c14312a != null) {
            this.f92960X.onLayerRendererRemoved$animation_release(c14312a);
            w34.requireGraphicsContext(this).releaseGraphicsLayer(c14312a.getLayer());
        }
    }

    public final void setClipInOverlay(@yfb gz6<? super ov8, ? super c64, ? extends vic> gz6Var) {
        this.f92962Z = gz6Var;
    }

    public final void setRenderInOverlay(@yfb ny6<Boolean> ny6Var) {
        this.f92961Y = ny6Var;
    }

    public final void setSharedScope(@yfb C0581n c0581n) {
        this.f92960X = c0581n;
    }

    public final void setZIndexInOverlay(float f) {
        this.f92958M1.setFloatValue(f);
    }
}
