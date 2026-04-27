package p000;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public final class s2a extends i3a<vme> {

    /* JADX INFO: renamed from: e */
    public static final float f80431e = 0.85f;

    /* JADX INFO: renamed from: d */
    public final boolean f80432d;

    public s2a(boolean z) {
        super(createPrimaryAnimatorProvider(z), createSecondaryAnimatorProvider());
        this.f80432d = z;
    }

    private static vme createPrimaryAnimatorProvider(boolean z) {
        vme vmeVar = new vme(z);
        vmeVar.setOutgoingEndScale(0.85f);
        vmeVar.setIncomingStartScale(0.85f);
        return vmeVar;
    }

    private static bdi createSecondaryAnimatorProvider() {
        return new so5();
    }

    @Override // p000.i3a
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@efb bdi bdiVar) {
        super.addAdditionalAnimatorProvider(bdiVar);
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

    public boolean isGrowing() {
        return this.f80432d;
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
