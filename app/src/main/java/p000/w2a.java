package p000;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.C3146R;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public final class w2a extends i3a<wo5> {

    /* JADX INFO: renamed from: d */
    public static final float f93132d = 0.92f;

    /* JADX INFO: renamed from: e */
    @gc0
    public static final int f93133e = C3146R.attr.motionDurationLong1;

    /* JADX INFO: renamed from: f */
    @gc0
    public static final int f93134f = C3146R.attr.motionEasingEmphasizedInterpolator;

    public w2a() {
        super(createPrimaryAnimatorProvider(), createSecondaryAnimatorProvider());
    }

    private static wo5 createPrimaryAnimatorProvider() {
        return new wo5();
    }

    private static bdi createSecondaryAnimatorProvider() {
        vme vmeVar = new vme();
        vmeVar.setScaleOnDisappear(false);
        vmeVar.setIncomingStartScale(0.92f);
        return vmeVar;
    }

    @Override // p000.i3a
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@efb bdi bdiVar) {
        super.addAdditionalAnimatorProvider(bdiVar);
    }

    @Override // p000.i3a
    @gc0
    /* JADX INFO: renamed from: b */
    public int mo9650b(boolean z) {
        return f93133e;
    }

    @Override // p000.i3a
    @gc0
    /* JADX INFO: renamed from: c */
    public int mo9651c(boolean z) {
        return f93134f;
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
