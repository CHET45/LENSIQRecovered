package p000;

import p000.n8c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n1#1,297:1\n235#1,16:298\n235#1,16:314\n*S KotlinDebug\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n146#1:298,16\n185#1:314,16\n*E\n"})
public final class o8c {
    public static final void addOutline(@yfb vic vicVar, @yfb n8c n8cVar) {
        if (n8cVar instanceof n8c.C9742b) {
            vic.addRect$default(vicVar, ((n8c.C9742b) n8cVar).getRect(), null, 2, null);
        } else if (n8cVar instanceof n8c.C9743c) {
            vic.addRoundRect$default(vicVar, ((n8c.C9743c) n8cVar).getRoundRect(), null, 2, null);
        } else {
            if (!(n8cVar instanceof n8c.C9741a)) {
                throw new ceb();
            }
            vic.m32765addPathUv8p0NA$default(vicVar, ((n8c.C9741a) n8cVar).getPath(), 0L, 2, null);
        }
    }

    public static final void drawOutline(@yfb vq1 vq1Var, @yfb n8c n8cVar, @yfb icc iccVar) {
        if (n8cVar instanceof n8c.C9742b) {
            vq1Var.drawRect(((n8c.C9742b) n8cVar).getRect(), iccVar);
            return;
        }
        if (!(n8cVar instanceof n8c.C9743c)) {
            if (!(n8cVar instanceof n8c.C9741a)) {
                throw new ceb();
            }
            vq1Var.drawPath(((n8c.C9741a) n8cVar).getPath(), iccVar);
        } else {
            n8c.C9743c c9743c = (n8c.C9743c) n8cVar;
            vic roundRectPath$ui_graphics_release = c9743c.getRoundRectPath$ui_graphics_release();
            if (roundRectPath$ui_graphics_release != null) {
                vq1Var.drawPath(roundRectPath$ui_graphics_release, iccVar);
            } else {
                vq1Var.drawRoundRect(c9743c.getRoundRect().getLeft(), c9743c.getRoundRect().getTop(), c9743c.getRoundRect().getRight(), c9743c.getRoundRect().getBottom(), u03.m32492getXimpl(c9743c.getRoundRect().m30991getBottomLeftCornerRadiuskKHJgLs()), u03.m32493getYimpl(c9743c.getRoundRect().m30991getBottomLeftCornerRadiuskKHJgLs()), iccVar);
            }
        }
    }

    /* JADX INFO: renamed from: drawOutline-hn5TExg, reason: not valid java name */
    public static final void m31289drawOutlinehn5TExg(@yfb ip4 ip4Var, @yfb n8c n8cVar, @yfb he1 he1Var, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        vic path;
        if (n8cVar instanceof n8c.C9742b) {
            rud rect = ((n8c.C9742b) n8cVar).getRect();
            ip4Var.mo30268drawRectAsUm42w(he1Var, topLeft(rect), size(rect), f, rp4Var, b92Var, i);
            return;
        }
        if (n8cVar instanceof n8c.C9743c) {
            n8c.C9743c c9743c = (n8c.C9743c) n8cVar;
            path = c9743c.getRoundRectPath$ui_graphics_release();
            if (path == null) {
                mbe roundRect = c9743c.getRoundRect();
                ip4Var.mo30270drawRoundRectZuiqVtQ(he1Var, topLeft(roundRect), size(roundRect), v03.CornerRadius$default(u03.m32492getXimpl(roundRect.m30991getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), f, rp4Var, b92Var, i);
                return;
            }
        } else {
            if (!(n8cVar instanceof n8c.C9741a)) {
                throw new ceb();
            }
            path = ((n8c.C9741a) n8cVar).getPath();
        }
        ip4Var.mo30264drawPathGBMwjPU(path, he1Var, f, rp4Var, b92Var, i);
    }

    /* JADX INFO: renamed from: drawOutline-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m31290drawOutlinehn5TExg$default(ip4 ip4Var, n8c n8cVar, he1 he1Var, float f, rp4 rp4Var, b92 b92Var, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            rp4Var = nu5.f65694a;
        }
        rp4 rp4Var2 = rp4Var;
        if ((i2 & 16) != 0) {
            b92Var = null;
        }
        b92 b92Var2 = b92Var;
        if ((i2 & 32) != 0) {
            i = ip4.f47823w.m30275getDefaultBlendMode0nO6VwU();
        }
        m31289drawOutlinehn5TExg(ip4Var, n8cVar, he1Var, f2, rp4Var2, b92Var2, i);
    }

    /* JADX INFO: renamed from: drawOutline-wDX37Ww, reason: not valid java name */
    public static final void m31291drawOutlinewDX37Ww(@yfb ip4 ip4Var, @yfb n8c n8cVar, long j, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        vic path;
        if (n8cVar instanceof n8c.C9742b) {
            rud rect = ((n8c.C9742b) n8cVar).getRect();
            ip4Var.mo30269drawRectnJ9OG0(j, topLeft(rect), size(rect), f, rp4Var, b92Var, i);
            return;
        }
        if (n8cVar instanceof n8c.C9743c) {
            n8c.C9743c c9743c = (n8c.C9743c) n8cVar;
            path = c9743c.getRoundRectPath$ui_graphics_release();
            if (path == null) {
                mbe roundRect = c9743c.getRoundRect();
                ip4Var.mo30271drawRoundRectuAw5IA(j, topLeft(roundRect), size(roundRect), v03.CornerRadius$default(u03.m32492getXimpl(roundRect.m30991getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), rp4Var, f, b92Var, i);
                return;
            }
        } else {
            if (!(n8cVar instanceof n8c.C9741a)) {
                throw new ceb();
            }
            path = ((n8c.C9741a) n8cVar).getPath();
        }
        ip4Var.mo30265drawPathLG529CI(path, j, f, rp4Var, b92Var, i);
    }

    private static final void drawOutlineHelper(ip4 ip4Var, n8c n8cVar, gz6<? super ip4, ? super rud, bth> gz6Var, gz6<? super ip4, ? super mbe, bth> gz6Var2, gz6<? super ip4, ? super vic, bth> gz6Var3) {
        if (n8cVar instanceof n8c.C9742b) {
            gz6Var.invoke(ip4Var, ((n8c.C9742b) n8cVar).getRect());
            return;
        }
        if (!(n8cVar instanceof n8c.C9743c)) {
            if (!(n8cVar instanceof n8c.C9741a)) {
                throw new ceb();
            }
            gz6Var3.invoke(ip4Var, ((n8c.C9741a) n8cVar).getPath());
        } else {
            n8c.C9743c c9743c = (n8c.C9743c) n8cVar;
            vic roundRectPath$ui_graphics_release = c9743c.getRoundRectPath$ui_graphics_release();
            if (roundRectPath$ui_graphics_release != null) {
                gz6Var3.invoke(ip4Var, roundRectPath$ui_graphics_release);
            } else {
                gz6Var2.invoke(ip4Var, c9743c.getRoundRect());
            }
        }
    }

    private static final boolean hasSameCornerRadius(mbe mbeVar) {
        return ((u03.m32492getXimpl(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs()) > u03.m32492getXimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) ? 1 : (u03.m32492getXimpl(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs()) == u03.m32492getXimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (u03.m32492getXimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) > u03.m32492getXimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) ? 1 : (u03.m32492getXimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) == u03.m32492getXimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (u03.m32492getXimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) > u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) ? 1 : (u03.m32492getXimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) == u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) ? 0 : -1)) == 0) && ((u03.m32493getYimpl(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs()) > u03.m32493getYimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) ? 1 : (u03.m32493getYimpl(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs()) == u03.m32493getYimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (u03.m32493getYimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) > u03.m32493getYimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) ? 1 : (u03.m32493getYimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) == u03.m32493getYimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (u03.m32493getYimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) > u03.m32493getYimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) ? 1 : (u03.m32493getYimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) == u03.m32493getYimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) ? 0 : -1)) == 0);
    }

    private static final long size(rud rudVar) {
        return eqf.Size(rudVar.getWidth(), rudVar.getHeight());
    }

    private static final long topLeft(rud rudVar) {
        return mzb.Offset(rudVar.getLeft(), rudVar.getTop());
    }

    private static final long size(mbe mbeVar) {
        return eqf.Size(mbeVar.getWidth(), mbeVar.getHeight());
    }

    private static final long topLeft(mbe mbeVar) {
        return mzb.Offset(mbeVar.getLeft(), mbeVar.getTop());
    }
}
