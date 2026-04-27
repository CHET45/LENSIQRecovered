package p000;

import android.content.res.Resources;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.scwang.smart.refresh.layout.kernel.C3941R;

/* JADX INFO: loaded from: classes6.dex */
public class yrf implements Interpolator {

    /* JADX INFO: renamed from: b */
    public static int f102790b = 0;

    /* JADX INFO: renamed from: c */
    public static int f102791c = 1;

    /* JADX INFO: renamed from: d */
    public static float f102792d = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: e */
    public static final float f102793e = 8.0f;

    /* JADX INFO: renamed from: f */
    public static final float f102794f;

    /* JADX INFO: renamed from: g */
    public static final float f102795g;

    /* JADX INFO: renamed from: a */
    public int f102796a;

    static {
        float fViscousFluid = 1.0f / viscousFluid(1.0f);
        f102794f = fViscousFluid;
        f102795g = 1.0f - (fViscousFluid * viscousFluid(1.0f));
    }

    public yrf(int i) {
        this.f102796a = i;
    }

    public static boolean canLoadMore(@efb View view, PointF pointF, boolean z) {
        if (view.canScrollVertically(1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null && !isScrollableView(view)) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (isTransformedTouchPointInView(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    Object tag = childAt.getTag(C3941R.id.srl_tag);
                    if ("fixed".equals(tag) || "fixed-top".equals(tag)) {
                        return false;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean zCanLoadMore = canLoadMore(childAt, pointF, z);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return zCanLoadMore;
                }
            }
        }
        return z || view.canScrollVertically(-1);
    }

    public static boolean canRefresh(@efb View view, PointF pointF) {
        if (view.canScrollVertically(-1) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof ViewGroup) || pointF == null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        PointF pointF2 = new PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount - 1);
            if (isTransformedTouchPointInView(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                Object tag = childAt.getTag(C3941R.id.srl_tag);
                if ("fixed".equals(tag) || "fixed-bottom".equals(tag)) {
                    return false;
                }
                pointF.offset(pointF2.x, pointF2.y);
                boolean zCanRefresh = canRefresh(childAt, pointF);
                pointF.offset(-pointF2.x, -pointF2.y);
                return zCanRefresh;
            }
        }
        return true;
    }

    public static int dp2px(float f) {
        return (int) ((f * f102792d) + 0.5f);
    }

    public static void fling(View view, int i) {
        if (view instanceof ScrollView) {
            ((ScrollView) view).fling(i);
            return;
        }
        if (view instanceof AbsListView) {
            ((AbsListView) view).fling(i);
            return;
        }
        if (view instanceof WebView) {
            ((WebView) view).flingScroll(0, i);
        } else if (view instanceof NestedScrollView) {
            ((NestedScrollView) view).fling(i);
        } else if (view instanceof RecyclerView) {
            ((RecyclerView) view).fling(0, i);
        }
    }

    public static boolean isContentView(View view) {
        if (view instanceof bwd) {
            return false;
        }
        return isScrollableView(view) || (view instanceof ViewPager) || (view instanceof vab);
    }

    public static boolean isScrollableView(View view) {
        if (view instanceof bwd) {
            return false;
        }
        return (view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof gse) || (view instanceof WebView) || (view instanceof rab);
    }

    public static boolean isTransformedTouchPointInView(@efb View view, @efb View view2, float f, float f2, PointF pointF) {
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f, f2};
        fArr[0] = (view.getScrollX() - view2.getLeft()) + f;
        float scrollY = fArr[1] + (view.getScrollY() - view2.getTop());
        fArr[1] = scrollY;
        float f3 = fArr[0];
        boolean z = f3 >= 0.0f && scrollY >= 0.0f && f3 < ((float) view2.getWidth()) && fArr[1] < ((float) view2.getHeight());
        if (z && pointF != null) {
            pointF.set(fArr[0] - f, fArr[1] - f2);
        }
        return z;
    }

    public static int measureViewHeight(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        view.measure(childMeasureSpec, i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public static float px2dp(int i) {
        return i / f102792d;
    }

    public static void scrollListBy(@efb AbsListView absListView, int i) {
        absListView.scrollListBy(i);
    }

    private static float viscousFluid(float f) {
        float f2 = f * 8.0f;
        return f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : 0.36787945f + ((1.0f - ((float) Math.exp(1.0f - f2))) * 0.63212055f);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (this.f102796a == f102791c) {
            float f2 = 1.0f - f;
            return 1.0f - (f2 * f2);
        }
        float fViscousFluid = f102794f * viscousFluid(f);
        return fViscousFluid > 0.0f ? fViscousFluid + f102795g : fViscousFluid;
    }
}
