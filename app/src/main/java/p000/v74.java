package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes6.dex */
public class v74 {

    /* JADX INFO: renamed from: v74$a */
    public static class C13898a implements AppBarLayout.InterfaceC3160g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b03 f90134a;

        public C13898a(b03 b03Var) {
            this.f90134a = b03Var;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC3160g, com.google.android.material.appbar.AppBarLayout.InterfaceC3155b
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            this.f90134a.onCoordinatorUpdate(i >= 0, appBarLayout.getTotalScrollRange() + i <= 0);
        }
    }

    public static void checkCoordinatorLayout(View view, gwd gwdVar, b03 b03Var) {
        try {
            if (view instanceof CoordinatorLayout) {
                gwdVar.getRefreshLayout().setEnableNestedScroll(false);
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt instanceof AppBarLayout) {
                        ((AppBarLayout) childAt).addOnOffsetChangedListener((AppBarLayout.InterfaceC3160g) new C13898a(b03Var));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
