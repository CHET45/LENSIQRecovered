package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSelectionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,350:1\n225#2,8:351\n272#2,14:359\n*S KotlinDebug\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n*L\n158#1:351,8\n158#1:359,14\n*E\n"})
@e0g(parameters = 0)
public final class pwe implements eyd {

    /* JADX INFO: renamed from: m */
    public static final int f72375m = 8;

    /* JADX INFO: renamed from: a */
    public final long f72376a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final dxe f72377b;

    /* JADX INFO: renamed from: c */
    public final long f72378c;

    /* JADX INFO: renamed from: d */
    @yfb
    public a4g f72379d;

    /* JADX INFO: renamed from: e */
    @gib
    public cwe f72380e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final InterfaceC0701e f72381f;

    /* JADX INFO: renamed from: pwe$a */
    public static final class C11157a extends tt8 implements ny6<mv8> {
        public C11157a() {
            super(0);
        }

        @Override // p000.ny6
        @gib
        public final mv8 invoke() {
            return pwe.this.f72379d.getLayoutCoordinates();
        }
    }

    /* JADX INFO: renamed from: pwe$b */
    public static final class C11158b extends tt8 implements ny6<mv8> {
        public C11158b() {
            super(0);
        }

        @Override // p000.ny6
        @gib
        public final mv8 invoke() {
            return pwe.this.f72379d.getLayoutCoordinates();
        }
    }

    /* JADX INFO: renamed from: pwe$c */
    public static final class C11159c extends tt8 implements ny6<hug> {
        public C11159c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @gib
        public final hug invoke() {
            return pwe.this.f72379d.getTextLayoutResult();
        }
    }

    public /* synthetic */ pwe(long j, dxe dxeVar, long j2, a4g a4gVar, jt3 jt3Var) {
        this(j, dxeVar, j2, a4gVar);
    }

    public final void draw(@yfb ip4 ip4Var) {
        gwe gweVar = this.f72377b.getSubselections().get(this.f72376a);
        if (gweVar == null) {
            return;
        }
        int offset = !gweVar.getHandlesCrossed() ? gweVar.getStart().getOffset() : gweVar.getEnd().getOffset();
        int offset2 = !gweVar.getHandlesCrossed() ? gweVar.getEnd().getOffset() : gweVar.getStart().getOffset();
        if (offset == offset2) {
            return;
        }
        cwe cweVar = this.f72380e;
        int lastVisibleOffset = cweVar != null ? cweVar.getLastVisibleOffset() : 0;
        vic pathForRange = this.f72379d.getPathForRange(kpd.coerceAtMost(offset, lastVisibleOffset), kpd.coerceAtMost(offset2, lastVisibleOffset));
        if (pathForRange == null) {
            return;
        }
        if (!this.f72379d.getShouldClip()) {
            ip4.m30244drawPathLG529CI$default(ip4Var, pathForRange, this.f72378c, 0.0f, null, null, 0, 60, null);
            return;
        }
        float fM33069getWidthimpl = wpf.m33069getWidthimpl(ip4Var.mo30273getSizeNHjbRc());
        float fM33066getHeightimpl = wpf.m33066getHeightimpl(ip4Var.mo30273getSizeNHjbRc());
        int iM33213getIntersectrtfAjoo = x42.f96262b.m33213getIntersectrtfAjoo();
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31598clipRectN_I0leg(0.0f, 0.0f, fM33069getWidthimpl, fM33066getHeightimpl, iM33213getIntersectrtfAjoo);
            ip4.m30244drawPathLG529CI$default(ip4Var, pathForRange, this.f72378c, 0.0f, null, null, 0, 60, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
        }
    }

    @yfb
    public final InterfaceC0701e getModifier() {
        return this.f72381f;
    }

    @Override // p000.eyd
    public void onAbandoned() {
        cwe cweVar = this.f72380e;
        if (cweVar != null) {
            this.f72377b.unsubscribe(cweVar);
            this.f72380e = null;
        }
    }

    @Override // p000.eyd
    public void onForgotten() {
        cwe cweVar = this.f72380e;
        if (cweVar != null) {
            this.f72377b.unsubscribe(cweVar);
            this.f72380e = null;
        }
    }

    @Override // p000.eyd
    public void onRemembered() {
        this.f72380e = this.f72377b.subscribe(new m3b(this.f72376a, new C11158b(), new C11159c()));
    }

    public final void updateGlobalPosition(@yfb mv8 mv8Var) {
        this.f72379d = a4g.copy$default(this.f72379d, mv8Var, null, 2, null);
        this.f72377b.notifyPositionChange(this.f72376a);
    }

    public final void updateTextLayout(@yfb hug hugVar) {
        hug textLayoutResult = this.f72379d.getTextLayoutResult();
        if (textLayoutResult != null && !md8.areEqual(textLayoutResult.getLayoutInput().getText(), hugVar.getLayoutInput().getText())) {
            this.f72377b.notifySelectableChange(this.f72376a);
        }
        this.f72379d = a4g.copy$default(this.f72379d, null, hugVar, 1, null);
    }

    private pwe(long j, dxe dxeVar, long j2, a4g a4gVar) {
        this.f72376a = j;
        this.f72377b = dxeVar;
        this.f72378c = j2;
        this.f72379d = a4gVar;
        this.f72381f = c2d.pointerHoverIcon$default(qwe.makeSelectionModifier(dxeVar, j, new C11157a()), fvg.getTextPointerIcon(), false, 2, null);
    }

    public /* synthetic */ pwe(long j, dxe dxeVar, long j2, a4g a4gVar, int i, jt3 jt3Var) {
        this(j, dxeVar, j2, (i & 8) != 0 ? a4g.f401c.getEmpty() : a4gVar, null);
    }
}
