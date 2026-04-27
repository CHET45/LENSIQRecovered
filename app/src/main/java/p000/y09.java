package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface y09 {

    /* JADX INFO: renamed from: y09$a */
    public static final class C15364a {
        @Deprecated
        public static int getAfterContentPadding(@yfb y09 y09Var) {
            return y09.super.getAfterContentPadding();
        }

        @Deprecated
        public static int getBeforeContentPadding(@yfb y09 y09Var) {
            return y09.super.getBeforeContentPadding();
        }

        @Deprecated
        public static int getMainAxisItemSpacing(@yfb y09 y09Var) {
            return y09.super.getMainAxisItemSpacing();
        }

        @yfb
        @Deprecated
        public static t7c getOrientation(@yfb y09 y09Var) {
            return y09.super.getOrientation();
        }

        @Deprecated
        public static boolean getReverseLayout(@yfb y09 y09Var) {
            return y09.super.getReverseLayout();
        }

        @Deprecated
        /* JADX INFO: renamed from: getViewportSize-YbymL2g, reason: not valid java name */
        public static long m33329getViewportSizeYbymL2g(@yfb y09 y09Var) {
            return y09.super.mo27179getViewportSizeYbymL2g();
        }
    }

    default int getAfterContentPadding() {
        return 0;
    }

    default int getBeforeContentPadding() {
        return 0;
    }

    default int getMainAxisItemSpacing() {
        return 0;
    }

    @yfb
    default t7c getOrientation() {
        return t7c.Vertical;
    }

    default boolean getReverseLayout() {
        return false;
    }

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    default long mo27179getViewportSizeYbymL2g() {
        return r78.f77324b.m32092getZeroYbymL2g();
    }

    int getViewportStartOffset();

    @yfb
    List<t09> getVisibleItemsInfo();
}
