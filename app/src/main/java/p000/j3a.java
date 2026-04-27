package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC1442a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.cdi;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j3a<P extends cdi> extends AbstractC1442a0 {

    /* JADX INFO: renamed from: J2 */
    public final P f49487J2;

    /* JADX INFO: renamed from: K2 */
    @hib
    public cdi f49488K2;

    /* JADX INFO: renamed from: L2 */
    public final List<cdi> f49489L2 = new ArrayList();

    public j3a(P p, @hib cdi cdiVar) {
        this.f49487J2 = p;
        this.f49488K2 = cdiVar;
    }

    private static void addAnimatorIfNeeded(List<Animator> list, @hib cdi cdiVar, ViewGroup viewGroup, View view, boolean z) {
        if (cdiVar == null) {
            return;
        }
        Animator animatorCreateAppear = z ? cdiVar.createAppear(viewGroup, view) : cdiVar.createDisappear(viewGroup, view);
        if (animatorCreateAppear != null) {
            list.add(animatorCreateAppear);
        }
    }

    private Animator createAnimator(@efb ViewGroup viewGroup, @efb View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        addAnimatorIfNeeded(arrayList, this.f49487J2, viewGroup, view, z);
        addAnimatorIfNeeded(arrayList, this.f49488K2, viewGroup, view, z);
        Iterator<cdi> it = this.f49489L2.iterator();
        while (it.hasNext()) {
            addAnimatorIfNeeded(arrayList, it.next(), viewGroup, view, z);
        }
        maybeApplyThemeValues(viewGroup.getContext(), z);
        C6661gz.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    private void maybeApplyThemeValues(@efb Context context, boolean z) {
        rfh.m21280q(this, context, mo8874q(z));
        rfh.m21281r(this, context, mo8875r(z), mo13706p(z));
    }

    public void addAdditionalAnimatorProvider(@efb cdi cdiVar) {
        this.f49489L2.add(cdiVar);
    }

    public void clearAdditionalAnimatorProvider() {
        this.f49489L2.clear();
    }

    @efb
    public P getPrimaryAnimatorProvider() {
        return this.f49487J2;
    }

    @hib
    public cdi getSecondaryAnimatorProvider() {
        return this.f49488K2;
    }

    @Override // androidx.transition.AbstractC1442a0
    public Animator onAppear(ViewGroup viewGroup, View view, sfh sfhVar, sfh sfhVar2) {
        return createAnimator(viewGroup, view, true);
    }

    @Override // androidx.transition.AbstractC1442a0
    public Animator onDisappear(ViewGroup viewGroup, View view, sfh sfhVar, sfh sfhVar2) {
        return createAnimator(viewGroup, view, false);
    }

    @efb
    /* JADX INFO: renamed from: p */
    public TimeInterpolator mo13706p(boolean z) {
        return C13280ty.f86290b;
    }

    @gc0
    /* JADX INFO: renamed from: q */
    public int mo8874q(boolean z) {
        return 0;
    }

    @gc0
    /* JADX INFO: renamed from: r */
    public int mo8875r(boolean z) {
        return 0;
    }

    public boolean removeAdditionalAnimatorProvider(@efb cdi cdiVar) {
        return this.f49489L2.remove(cdiVar);
    }

    public void setSecondaryAnimatorProvider(@hib cdi cdiVar) {
        this.f49488K2 = cdiVar;
    }
}
