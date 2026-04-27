package p000;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.blankj.utilcode.util.C2479l;
import com.blankj.utilcode.util.C2481n;

/* JADX INFO: loaded from: classes3.dex */
public class eci {
    public static void fixScrollViewTopping(View view) {
        view.setFocusable(false);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setFocusable(false);
            if (childAt instanceof ViewGroup) {
                fixScrollViewTopping(childAt);
            }
        }
    }

    public static boolean isLayoutRtl() {
        return TextUtils.getLayoutDirectionFromLocale(C2479l.getApp().getResources().getConfiguration().getLocales().get(0)) == 1;
    }

    public static View layoutId2View(@uw8 int i) {
        return ((LayoutInflater) C2479l.getApp().getSystemService("layout_inflater")).inflate(i, (ViewGroup) null);
    }

    public static void runOnUiThread(Runnable runnable) {
        C2481n.m4267S0(runnable);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j) {
        C2481n.m4269T0(runnable, j);
    }

    public static void setViewEnabled(View view, boolean z) {
        setViewEnabled(view, z, null);
    }

    public static void setViewEnabled(View view, boolean z, View... viewArr) {
        if (view == null) {
            return;
        }
        if (viewArr != null) {
            for (View view2 : viewArr) {
                if (view == view2) {
                    return;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                setViewEnabled(viewGroup.getChildAt(i), z, viewArr);
            }
        }
        view.setEnabled(z);
    }
}
