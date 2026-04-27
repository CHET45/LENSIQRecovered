package p000;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class kqf {

    /* JADX INFO: renamed from: kqf$a */
    public static class RunnableC8502a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8503b f55066a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f55067b;

        public RunnableC8502a(InterfaceC8503b interfaceC8503b, View view) {
            this.f55066a = interfaceC8503b;
            this.f55067b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC8503b interfaceC8503b = this.f55066a;
            if (interfaceC8503b != null) {
                interfaceC8503b.onGetSize(this.f55067b);
            }
        }
    }

    /* JADX INFO: renamed from: kqf$b */
    public interface InterfaceC8503b {
        void onGetSize(View view);
    }

    private kqf() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static float applyDimension(float f, int i) {
        float f2;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        if (i == 0) {
            return f;
        }
        if (i == 1) {
            f2 = displayMetrics.density;
        } else if (i == 2) {
            f2 = displayMetrics.scaledDensity;
        } else if (i == 3) {
            f *= displayMetrics.xdpi;
            f2 = 0.013888889f;
        } else if (i == 4) {
            f2 = displayMetrics.xdpi;
        } else {
            if (i != 5) {
                return 0.0f;
            }
            f *= displayMetrics.xdpi;
            f2 = 0.03937008f;
        }
        return f * f2;
    }

    public static int dp2px(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static void forceGetViewSize(View view, InterfaceC8503b interfaceC8503b) {
        view.post(new RunnableC8502a(interfaceC8503b, view));
    }

    public static int getMeasuredHeight(View view) {
        return measureView(view)[1];
    }

    public static int getMeasuredWidth(View view) {
        return measureView(view)[0];
    }

    public static int[] measureView(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        view.measure(childMeasureSpec, i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return new int[]{view.getMeasuredWidth(), view.getMeasuredHeight()};
    }

    public static int px2dp(float f) {
        return (int) ((f / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2sp(float f) {
        return (int) ((f / Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int sp2px(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
