package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.C0693R;
import androidx.compose.p002ui.platform.AbstractComposeView;
import androidx.compose.p002ui.platform.AndroidComposeView;
import androidx.compose.p002ui.platform.C0826f;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lri {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final ViewGroup.LayoutParams f58570a = new ViewGroup.LayoutParams(-2, -2);

    @yfb
    @ir9
    public static final h9e createSubcomposition(@yfb lw8 lw8Var, @yfb dn2 dn2Var) {
        return in2.ReusableComposition(new xqh(lw8Var), dn2Var);
    }

    @ik2(scheme = "[0[0]]")
    private static final cn2 doSetContent(AndroidComposeView androidComposeView, dn2 dn2Var, gz6<? super zl2, ? super Integer, bth> gz6Var) {
        if (c58.isDebugInspectorInfoEnabled() && androidComposeView.getTag(C0693R.id.inspection_slot_table_set) == null) {
            androidComposeView.setTag(C0693R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
        }
        cn2 cn2VarComposition = in2.Composition(new xqh(androidComposeView.getRoot()), dn2Var);
        Object tag = androidComposeView.getView().getTag(C0693R.id.wrapped_composition_tag);
        C0826f c0826f = tag instanceof C0826f ? (C0826f) tag : null;
        if (c0826f == null) {
            c0826f = new C0826f(androidComposeView, cn2VarComposition);
            androidComposeView.getView().setTag(C0693R.id.wrapped_composition_tag, c0826f);
        }
        c0826f.setContent(gz6Var);
        if (!md8.areEqual(androidComposeView.getCoroutineContext(), dn2Var.getEffectCoroutineContext())) {
            androidComposeView.setCoroutineContext(dn2Var.getEffectCoroutineContext());
        }
        return c0826f;
    }

    @yfb
    @ik2(scheme = "[0[0]]")
    public static final cn2 setContent(@yfb AbstractComposeView abstractComposeView, @yfb dn2 dn2Var, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var) {
        s77.f80900a.ensureStarted();
        AndroidComposeView androidComposeView = null;
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), dn2Var.getEffectCoroutineContext());
            abstractComposeView.addView(androidComposeView.getView(), f58570a);
        }
        return doSetContent(androidComposeView, dn2Var, gz6Var);
    }
}
