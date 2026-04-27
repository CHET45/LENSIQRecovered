package p000;

/* JADX INFO: loaded from: classes.dex */
public final class pbe {
    @yfb
    public static final mbe RoundRect(float f, float f2, float f3, float f4, float f5, float f6) {
        long jCornerRadius = v03.CornerRadius(f5, f6);
        return new mbe(f, f2, f3, f4, jCornerRadius, jCornerRadius, jCornerRadius, jCornerRadius, null);
    }

    @yfb
    /* JADX INFO: renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final mbe m31773RoundRectZAM2FJo(@yfb rud rudVar, long j, long j2, long j3, long j4) {
        return new mbe(rudVar.getLeft(), rudVar.getTop(), rudVar.getRight(), rudVar.getBottom(), j, j2, j3, j4, null);
    }

    @yfb
    /* JADX INFO: renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final mbe m31775RoundRectgG7oq9Y(float f, float f2, float f3, float f4, long j) {
        return RoundRect(f, f2, f3, f4, u03.m32492getXimpl(j), u03.m32493getYimpl(j));
    }

    @yfb
    /* JADX INFO: renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final mbe m31776RoundRectsniSvfs(@yfb rud rudVar, long j) {
        return RoundRect(rudVar, u03.m32492getXimpl(j), u03.m32493getYimpl(j));
    }

    @yfb
    public static final rud getBoundingRect(@yfb mbe mbeVar) {
        return new rud(mbeVar.getLeft(), mbeVar.getTop(), mbeVar.getRight(), mbeVar.getBottom());
    }

    public static final long getCenter(@yfb mbe mbeVar) {
        return mzb.Offset(mbeVar.getLeft() + (mbeVar.getWidth() / 2.0f), mbeVar.getTop() + (mbeVar.getHeight() / 2.0f));
    }

    public static final float getMaxDimension(@yfb mbe mbeVar) {
        return Math.max(Math.abs(mbeVar.getWidth()), Math.abs(mbeVar.getHeight()));
    }

    public static final float getMinDimension(@yfb mbe mbeVar) {
        return Math.min(Math.abs(mbeVar.getWidth()), Math.abs(mbeVar.getHeight()));
    }

    @yfb
    public static final rud getSafeInnerRect(@yfb mbe mbeVar) {
        return new rud(mbeVar.getLeft() + (Math.max(u03.m32492getXimpl(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs()), u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs())) * 0.29289323f), mbeVar.getTop() + (Math.max(u03.m32493getYimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()), u03.m32493getYimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs())) * 0.29289323f), mbeVar.getRight() - (Math.max(u03.m32492getXimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()), u03.m32492getXimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), mbeVar.getBottom() - (Math.max(u03.m32493getYimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()), u03.m32493getYimpl(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isCircle(@yfb mbe mbeVar) {
        return mbeVar.getWidth() == mbeVar.getHeight() && isEllipse(mbeVar);
    }

    public static final boolean isEllipse(@yfb mbe mbeVar) {
        return u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) == u03.m32492getXimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) && u03.m32493getYimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) == u03.m32493getYimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) && u03.m32492getXimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) == u03.m32492getXimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) && u03.m32493getYimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) == u03.m32493getYimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) && u03.m32492getXimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) == u03.m32492getXimpl(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs()) && u03.m32493getYimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) == u03.m32493getYimpl(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs()) && ((double) mbeVar.getWidth()) <= ((double) u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs())) * 2.0d && ((double) mbeVar.getHeight()) <= ((double) u03.m32493getYimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs())) * 2.0d;
    }

    public static final boolean isEmpty(@yfb mbe mbeVar) {
        return mbeVar.getLeft() >= mbeVar.getRight() || mbeVar.getTop() >= mbeVar.getBottom();
    }

    public static final boolean isFinite(@yfb mbe mbeVar) {
        float left = mbeVar.getLeft();
        if (!Float.isInfinite(left) && !Float.isNaN(left)) {
            float top = mbeVar.getTop();
            if (!Float.isInfinite(top) && !Float.isNaN(top)) {
                float right = mbeVar.getRight();
                if (!Float.isInfinite(right) && !Float.isNaN(right)) {
                    float bottom = mbeVar.getBottom();
                    if (!Float.isInfinite(bottom) && !Float.isNaN(bottom)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isRect(@yfb mbe mbeVar) {
        return (u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) == 0.0f || u03.m32493getYimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) == 0.0f) && (u03.m32492getXimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) == 0.0f || u03.m32493getYimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) == 0.0f) && ((u03.m32492getXimpl(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs()) == 0.0f || u03.m32493getYimpl(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) && (u03.m32492getXimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) == 0.0f || u03.m32493getYimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) == 0.0f));
    }

    public static final boolean isSimple(@yfb mbe mbeVar) {
        return u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) == u03.m32493getYimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) && u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) == u03.m32492getXimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) && u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) == u03.m32493getYimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs()) && u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) == u03.m32492getXimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) && u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) == u03.m32493getYimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs()) && u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) == u03.m32492getXimpl(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs()) && u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) == u03.m32493getYimpl(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs());
    }

    @yfb
    public static final mbe lerp(@yfb mbe mbeVar, @yfb mbe mbeVar2, float f) {
        return new mbe(m3a.lerp(mbeVar.getLeft(), mbeVar2.getLeft(), f), m3a.lerp(mbeVar.getTop(), mbeVar2.getTop(), f), m3a.lerp(mbeVar.getRight(), mbeVar2.getRight(), f), m3a.lerp(mbeVar.getBottom(), mbeVar2.getBottom(), f), v03.m32678lerp3Ry4LBc(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs(), mbeVar2.m30993getTopLeftCornerRadiuskKHJgLs(), f), v03.m32678lerp3Ry4LBc(mbeVar.m30994getTopRightCornerRadiuskKHJgLs(), mbeVar2.m30994getTopRightCornerRadiuskKHJgLs(), f), v03.m32678lerp3Ry4LBc(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs(), mbeVar2.m30992getBottomRightCornerRadiuskKHJgLs(), f), v03.m32678lerp3Ry4LBc(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs(), mbeVar2.m30991getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    @yfb
    /* JADX INFO: renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final mbe m31777translateUv8p0NA(@yfb mbe mbeVar, long j) {
        return new mbe(izb.m30429getXimpl(j) + mbeVar.getLeft(), izb.m30430getYimpl(j) + mbeVar.getTop(), izb.m30429getXimpl(j) + mbeVar.getRight(), izb.m30430getYimpl(j) + mbeVar.getBottom(), mbeVar.m30993getTopLeftCornerRadiuskKHJgLs(), mbeVar.m30994getTopRightCornerRadiuskKHJgLs(), mbeVar.m30992getBottomRightCornerRadiuskKHJgLs(), mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    @yfb
    public static final mbe RoundRect(@yfb rud rudVar, float f, float f2) {
        return RoundRect(rudVar.getLeft(), rudVar.getTop(), rudVar.getRight(), rudVar.getBottom(), f, f2);
    }
}
