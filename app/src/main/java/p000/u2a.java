package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.C3146R;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public final class u2a extends i3a<so5> {

    /* JADX INFO: renamed from: d */
    public static final float f86637d = 0.8f;

    /* JADX INFO: renamed from: e */
    public static final float f86638e = 0.3f;

    /* JADX INFO: renamed from: f */
    @gc0
    public static final int f86639f = C3146R.attr.motionDurationMedium4;

    /* JADX INFO: renamed from: m */
    @gc0
    public static final int f86640m = C3146R.attr.motionDurationShort3;

    /* JADX INFO: renamed from: C */
    @gc0
    public static final int f86635C = C3146R.attr.motionEasingEmphasizedDecelerateInterpolator;

    /* JADX INFO: renamed from: F */
    @gc0
    public static final int f86636F = C3146R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public u2a() {
        super(createPrimaryAnimatorProvider(), createSecondaryAnimatorProvider());
    }

    private static so5 createPrimaryAnimatorProvider() {
        so5 so5Var = new so5();
        so5Var.setIncomingEndThreshold(0.3f);
        return so5Var;
    }

    private static bdi createSecondaryAnimatorProvider() {
        vme vmeVar = new vme();
        vmeVar.setScaleOnDisappear(false);
        vmeVar.setIncomingStartScale(0.8f);
        return vmeVar;
    }

    @Override // p000.i3a
    @efb
    /* JADX INFO: renamed from: a */
    public TimeInterpolator mo12753a(boolean z) {
        return C13280ty.f86289a;
    }

    @Override // p000.i3a
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@efb bdi bdiVar) {
        super.addAdditionalAnimatorProvider(bdiVar);
    }

    @Override // p000.i3a
    @gc0
    /* JADX INFO: renamed from: b */
    public int mo9650b(boolean z) {
        return z ? f86639f : f86640m;
    }

    @Override // p000.i3a
    @gc0
    /* JADX INFO: renamed from: c */
    public int mo9651c(boolean z) {
        return z ? f86635C : f86636F;
    }

    @Override // p000.i3a
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // p000.i3a
    @efb
    public /* bridge */ /* synthetic */ bdi getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // p000.i3a
    @hib
    public /* bridge */ /* synthetic */ bdi getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    @Override // p000.i3a, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // p000.i3a, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // p000.i3a
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@efb bdi bdiVar) {
        return super.removeAdditionalAnimatorProvider(bdiVar);
    }

    @Override // p000.i3a
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@hib bdi bdiVar) {
        super.setSecondaryAnimatorProvider(bdiVar);
    }
}
