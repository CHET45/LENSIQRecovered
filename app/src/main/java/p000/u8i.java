package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nViewConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewConfiguration.kt\nandroidx/compose/ui/platform/ViewConfiguration\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,76:1\n148#2:77\n*S KotlinDebug\n*F\n+ 1 ViewConfiguration.kt\nandroidx/compose/ui/platform/ViewConfiguration\n*L\n62#1:77\n*E\n"})
public interface u8i {

    /* JADX INFO: renamed from: u8i$a */
    public static final class C13406a {
        @Deprecated
        public static float getHandwritingGestureLineMargin(@yfb u8i u8iVar) {
            return u8i.super.getHandwritingGestureLineMargin();
        }

        @Deprecated
        public static float getHandwritingSlop(@yfb u8i u8iVar) {
            return u8i.super.getHandwritingSlop();
        }

        @Deprecated
        public static float getMaximumFlingVelocity(@yfb u8i u8iVar) {
            return u8i.super.getMaximumFlingVelocity();
        }

        @Deprecated
        /* JADX INFO: renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public static long m32560getMinimumTouchTargetSizeMYxV2XQ(@yfb u8i u8iVar) {
            return u8i.super.mo30909getMinimumTouchTargetSizeMYxV2XQ();
        }
    }

    long getDoubleTapMinTimeMillis();

    long getDoubleTapTimeoutMillis();

    default float getHandwritingGestureLineMargin() {
        return 16.0f;
    }

    default float getHandwritingSlop() {
        return 2.0f;
    }

    long getLongPressTimeoutMillis();

    default float getMaximumFlingVelocity() {
        return Float.MAX_VALUE;
    }

    /* JADX INFO: renamed from: getMinimumTouchTargetSize-MYxV2XQ */
    default long mo30909getMinimumTouchTargetSizeMYxV2XQ() {
        float f = 48;
        return mn4.m30998DpSizeYgX7TsA(kn4.m30705constructorimpl(f), kn4.m30705constructorimpl(f));
    }

    float getTouchSlop();
}
