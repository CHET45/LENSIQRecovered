package p000;

import android.graphics.Picture;

/* JADX INFO: loaded from: classes.dex */
@ah5
@dwf({"SMAP\nAndroidDragAndDropSource.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,146:1\n256#2:147\n*S KotlinDebug\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback\n*L\n118#1:147\n*E\n"})
public final class ul1 {

    /* JADX INFO: renamed from: a */
    @gib
    public Picture f88279a;

    /* JADX INFO: renamed from: ul1$a */
    @dwf({"SMAP\nAndroidDragAndDropSource.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback$cachePicture$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,146:1\n317#2,38:147\n256#2:185\n*S KotlinDebug\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback$cachePicture$1$1\n*L\n132#1:147,38\n142#1:185\n*E\n"})
    public static final class C13571a extends tt8 implements qy6<ov2, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Picture f88280a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f88281b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f88282c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13571a(Picture picture, int i, int i2) {
            super(1);
            this.f88280a = picture;
            this.f88281b = i;
            this.f88282c = i2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ov2 ov2Var) {
            invoke2(ov2Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ov2 ov2Var) {
            vq1 vq1VarCanvas = C5437eq.Canvas(this.f88280a.beginRecording(this.f88281b, this.f88282c));
            ov8 layoutDirection = ov2Var.getLayoutDirection();
            long jMo30273getSizeNHjbRc = ov2Var.mo30273getSizeNHjbRc();
            c64 density = ov2Var.getDrawContext().getDensity();
            ov8 layoutDirection2 = ov2Var.getDrawContext().getLayoutDirection();
            vq1 canvas = ov2Var.getDrawContext().getCanvas();
            long jMo28019getSizeNHjbRc = ov2Var.getDrawContext().mo28019getSizeNHjbRc();
            u97 graphicsLayer = ov2Var.getDrawContext().getGraphicsLayer();
            bp4 drawContext = ov2Var.getDrawContext();
            drawContext.setDensity(ov2Var);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setCanvas(vq1VarCanvas);
            drawContext.mo28020setSizeuvyYCjk(jMo30273getSizeNHjbRc);
            drawContext.setGraphicsLayer(null);
            vq1VarCanvas.save();
            try {
                ov2Var.drawContent();
                vq1VarCanvas.restore();
                bp4 drawContext2 = ov2Var.getDrawContext();
                drawContext2.setDensity(density);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas);
                drawContext2.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer);
                this.f88280a.endRecording();
                C5437eq.getNativeCanvas(ov2Var.getDrawContext().getCanvas()).drawPicture(this.f88280a);
            } catch (Throwable th) {
                vq1VarCanvas.restore();
                bp4 drawContext3 = ov2Var.getDrawContext();
                drawContext3.setDensity(density);
                drawContext3.setLayoutDirection(layoutDirection2);
                drawContext3.setCanvas(canvas);
                drawContext3.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
                drawContext3.setGraphicsLayer(graphicsLayer);
                throw th;
            }
        }
    }

    @yfb
    public final hp4 cachePicture(@yfb tl1 tl1Var) {
        Picture picture = new Picture();
        this.f88279a = picture;
        return tl1Var.onDrawWithContent(new C13571a(picture, (int) wpf.m33069getWidthimpl(tl1Var.m32414getSizeNHjbRc()), (int) wpf.m33066getHeightimpl(tl1Var.m32414getSizeNHjbRc())));
    }

    public final void drawDragShadow(@yfb ip4 ip4Var) {
        Picture picture = this.f88279a;
        if (picture == null) {
            throw new IllegalArgumentException("No cached drag shadow. Check if Modifier.cacheDragShadow(painter) was called.");
        }
        C5437eq.getNativeCanvas(ip4Var.getDrawContext().getCanvas()).drawPicture(picture);
    }
}
