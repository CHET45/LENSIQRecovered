package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC1442a0;

/* JADX INFO: loaded from: classes5.dex */
public final class fk7 extends AbstractC1442a0 {
    @Override // androidx.transition.AbstractC1442a0
    @efb
    public Animator onAppear(@efb ViewGroup viewGroup, @efb View view, @hib sfh sfhVar, @hib sfh sfhVar2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // androidx.transition.AbstractC1442a0
    @efb
    public Animator onDisappear(@efb ViewGroup viewGroup, @efb View view, @hib sfh sfhVar, @hib sfh sfhVar2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
