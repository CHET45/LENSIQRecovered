package p000;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.savedstate.C1414a;

/* JADX INFO: loaded from: classes.dex */
public final class lj2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final ViewGroup.LayoutParams f57729a = new ViewGroup.LayoutParams(-2, -2);

    public static final void setContent(@yfb ComponentActivity componentActivity, @gib dn2 dn2Var, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(dn2Var);
            composeView.setContent(gz6Var);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(dn2Var);
        composeView2.setContent(gz6Var);
        setOwners(componentActivity);
        componentActivity.setContentView(composeView2, f57729a);
    }

    public static /* synthetic */ void setContent$default(ComponentActivity componentActivity, dn2 dn2Var, gz6 gz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            dn2Var = null;
        }
        setContent(componentActivity, dn2Var, gz6Var);
    }

    private static final void setOwners(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        if (zbi.get(decorView) == null) {
            zbi.set(decorView, componentActivity);
        }
        if (bci.get(decorView) == null) {
            bci.set(decorView, componentActivity);
        }
        if (C1414a.get(decorView) == null) {
            C1414a.set(decorView, componentActivity);
        }
    }
}
