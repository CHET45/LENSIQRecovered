package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.bdi;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public abstract class i3a<P extends bdi> extends Visibility {

    /* JADX INFO: renamed from: a */
    public final P f45578a;

    /* JADX INFO: renamed from: b */
    @hib
    public bdi f45579b;

    /* JADX INFO: renamed from: c */
    public final List<bdi> f45580c = new ArrayList();

    public i3a(P p, @hib bdi bdiVar) {
        this.f45578a = p;
        this.f45579b = bdiVar;
    }

    private static void addAnimatorIfNeeded(List<Animator> list, @hib bdi bdiVar, ViewGroup viewGroup, View view, boolean z) {
        if (bdiVar == null) {
            return;
        }
        Animator animatorCreateAppear = z ? bdiVar.createAppear(viewGroup, view) : bdiVar.createDisappear(viewGroup, view);
        if (animatorCreateAppear != null) {
            list.add(animatorCreateAppear);
        }
    }

    private Animator createAnimator(@efb ViewGroup viewGroup, @efb View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        addAnimatorIfNeeded(arrayList, this.f45578a, viewGroup, view, z);
        addAnimatorIfNeeded(arrayList, this.f45579b, viewGroup, view, z);
        Iterator<bdi> it = this.f45580c.iterator();
        while (it.hasNext()) {
            addAnimatorIfNeeded(arrayList, it.next(), viewGroup, view, z);
        }
        maybeApplyThemeValues(viewGroup.getContext(), z);
        C6661gz.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    private void maybeApplyThemeValues(@efb Context context, boolean z) {
        qfh.m20346q(this, context, mo9650b(z));
        qfh.m20347r(this, context, mo9651c(z), mo12753a(z));
    }

    @efb
    /* JADX INFO: renamed from: a */
    public TimeInterpolator mo12753a(boolean z) {
        return C13280ty.f86290b;
    }

    public void addAdditionalAnimatorProvider(@efb bdi bdiVar) {
        this.f45580c.add(bdiVar);
    }

    @gc0
    /* JADX INFO: renamed from: b */
    public int mo9650b(boolean z) {
        return 0;
    }

    @gc0
    /* JADX INFO: renamed from: c */
    public int mo9651c(boolean z) {
        return 0;
    }

    public void clearAdditionalAnimatorProvider() {
        this.f45580c.clear();
    }

    @efb
    public P getPrimaryAnimatorProvider() {
        return this.f45578a;
    }

    @hib
    public bdi getSecondaryAnimatorProvider() {
        return this.f45579b;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return createAnimator(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return createAnimator(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(@efb bdi bdiVar) {
        return this.f45580c.remove(bdiVar);
    }

    public void setSecondaryAnimatorProvider(@hib bdi bdiVar) {
        this.f45579b = bdiVar;
    }
}
