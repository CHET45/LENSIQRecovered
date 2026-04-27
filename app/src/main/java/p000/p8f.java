package p000;

import p000.n8c;

/* JADX INFO: loaded from: classes.dex */
public final class p8f {
    private static final boolean cornersFit(mbe mbeVar) {
        return u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) + u03.m32492getXimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) <= mbeVar.getWidth() && u03.m32492getXimpl(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs()) + u03.m32492getXimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) <= mbeVar.getWidth() && u03.m32493getYimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) + u03.m32493getYimpl(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs()) <= mbeVar.getHeight() && u03.m32493getYimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) + u03.m32493getYimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) <= mbeVar.getHeight();
    }

    public static final boolean isInOutline(@yfb n8c n8cVar, float f, float f2, @gib vic vicVar, @gib vic vicVar2) {
        if (n8cVar instanceof n8c.C9742b) {
            return isInRectangle(((n8c.C9742b) n8cVar).getRect(), f, f2);
        }
        if (n8cVar instanceof n8c.C9743c) {
            return isInRoundedRect((n8c.C9743c) n8cVar, f, f2, vicVar, vicVar2);
        }
        if (n8cVar instanceof n8c.C9741a) {
            return isInPath(((n8c.C9741a) n8cVar).getPath(), f, f2, vicVar, vicVar2);
        }
        throw new ceb();
    }

    public static /* synthetic */ boolean isInOutline$default(n8c n8cVar, float f, float f2, vic vicVar, vic vicVar2, int i, Object obj) {
        if ((i & 8) != 0) {
            vicVar = null;
        }
        if ((i & 16) != 0) {
            vicVar2 = null;
        }
        return isInOutline(n8cVar, f, f2, vicVar, vicVar2);
    }

    private static final boolean isInPath(vic vicVar, float f, float f2, vic vicVar2, vic vicVar3) {
        rud rudVar = new rud(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (vicVar2 == null) {
            vicVar2 = C8522ku.Path();
        }
        vic.addRect$default(vicVar2, rudVar, null, 2, null);
        if (vicVar3 == null) {
            vicVar3 = C8522ku.Path();
        }
        vicVar3.mo28699opN5in7k0(vicVar, vicVar2, tjc.f85067b.m32408getIntersectb3I0S0c());
        boolean zIsEmpty = vicVar3.isEmpty();
        vicVar3.reset();
        vicVar2.reset();
        return !zIsEmpty;
    }

    private static final boolean isInRectangle(rud rudVar, float f, float f2) {
        return rudVar.getLeft() <= f && f < rudVar.getRight() && rudVar.getTop() <= f2 && f2 < rudVar.getBottom();
    }

    private static final boolean isInRoundedRect(n8c.C9743c c9743c, float f, float f2, vic vicVar, vic vicVar2) {
        mbe roundRect = c9743c.getRoundRect();
        if (f < roundRect.getLeft() || f >= roundRect.getRight() || f2 < roundRect.getTop() || f2 >= roundRect.getBottom()) {
            return false;
        }
        if (!cornersFit(roundRect)) {
            vic vicVarPath = vicVar2 == null ? C8522ku.Path() : vicVar2;
            vic.addRoundRect$default(vicVarPath, roundRect, null, 2, null);
            return isInPath(vicVarPath, f, f2, vicVar, vicVar2);
        }
        float fM32492getXimpl = u03.m32492getXimpl(roundRect.m30993getTopLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
        float fM32493getYimpl = u03.m32493getYimpl(roundRect.m30993getTopLeftCornerRadiuskKHJgLs()) + roundRect.getTop();
        float right = roundRect.getRight() - u03.m32492getXimpl(roundRect.m30994getTopRightCornerRadiuskKHJgLs());
        float fM32493getYimpl2 = u03.m32493getYimpl(roundRect.m30994getTopRightCornerRadiuskKHJgLs()) + roundRect.getTop();
        float right2 = roundRect.getRight() - u03.m32492getXimpl(roundRect.m30992getBottomRightCornerRadiuskKHJgLs());
        float bottom = roundRect.getBottom() - u03.m32493getYimpl(roundRect.m30992getBottomRightCornerRadiuskKHJgLs());
        float bottom2 = roundRect.getBottom() - u03.m32493getYimpl(roundRect.m30991getBottomLeftCornerRadiuskKHJgLs());
        float fM32492getXimpl2 = u03.m32492getXimpl(roundRect.m30991getBottomLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
        if (f < fM32492getXimpl && f2 < fM32493getYimpl) {
            return m31735isWithinEllipseVE1yxkc(f, f2, roundRect.m30993getTopLeftCornerRadiuskKHJgLs(), fM32492getXimpl, fM32493getYimpl);
        }
        if (f < fM32492getXimpl2 && f2 > bottom2) {
            return m31735isWithinEllipseVE1yxkc(f, f2, roundRect.m30991getBottomLeftCornerRadiuskKHJgLs(), fM32492getXimpl2, bottom2);
        }
        if (f > right && f2 < fM32493getYimpl2) {
            return m31735isWithinEllipseVE1yxkc(f, f2, roundRect.m30994getTopRightCornerRadiuskKHJgLs(), right, fM32493getYimpl2);
        }
        if (f <= right2 || f2 <= bottom) {
            return true;
        }
        return m31735isWithinEllipseVE1yxkc(f, f2, roundRect.m30992getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
    }

    /* JADX INFO: renamed from: isWithinEllipse-VE1yxkc, reason: not valid java name */
    private static final boolean m31735isWithinEllipseVE1yxkc(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fM32492getXimpl = u03.m32492getXimpl(j);
        float fM32493getYimpl = u03.m32493getYimpl(j);
        return ((f5 * f5) / (fM32492getXimpl * fM32492getXimpl)) + ((f6 * f6) / (fM32493getYimpl * fM32493getYimpl)) <= 1.0f;
    }
}
