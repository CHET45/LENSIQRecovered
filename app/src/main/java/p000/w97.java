package p000;

import p000.n8c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nGraphicsLayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayer.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,429:1\n256#2:430\n*S KotlinDebug\n*F\n+ 1 GraphicsLayer.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerKt\n*L\n51#1:430\n*E\n"})
public final class w97 {

    /* JADX INFO: renamed from: a */
    public static final float f93672a = 8.0f;

    public static final void drawLayer(@yfb ip4 ip4Var, @yfb u97 u97Var) {
        u97Var.draw$ui_graphics_release(ip4Var.getDrawContext().getCanvas(), ip4Var.getDrawContext().getGraphicsLayer());
    }

    public static final void setOutline(@yfb u97 u97Var, @yfb n8c n8cVar) {
        if (n8cVar instanceof n8c.C9742b) {
            n8c.C9742b c9742b = (n8c.C9742b) n8cVar;
            u97Var.m32578setRectOutlinetz77jQw(mzb.Offset(c9742b.getRect().getLeft(), c9742b.getRect().getTop()), eqf.Size(c9742b.getRect().getWidth(), c9742b.getRect().getHeight()));
            return;
        }
        if (n8cVar instanceof n8c.C9741a) {
            u97Var.setPathOutline(((n8c.C9741a) n8cVar).getPath());
            return;
        }
        if (n8cVar instanceof n8c.C9743c) {
            n8c.C9743c c9743c = (n8c.C9743c) n8cVar;
            if (c9743c.getRoundRectPath$ui_graphics_release() != null) {
                u97Var.setPathOutline(c9743c.getRoundRectPath$ui_graphics_release());
            } else {
                mbe roundRect = c9743c.getRoundRect();
                u97Var.m32579setRoundRectOutlineTNW_H78(mzb.Offset(roundRect.getLeft(), roundRect.getTop()), eqf.Size(roundRect.getWidth(), roundRect.getHeight()), u03.m32492getXimpl(roundRect.m30991getBottomLeftCornerRadiuskKHJgLs()));
            }
        }
    }
}
