package p000;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public final class t2a extends j3a<wme> {

    /* JADX INFO: renamed from: N2 */
    public static final float f83506N2 = 0.85f;

    /* JADX INFO: renamed from: M2 */
    public final boolean f83507M2;

    public t2a(boolean z) {
        super(createPrimaryAnimatorProvider(z), createSecondaryAnimatorProvider());
        this.f83507M2 = z;
    }

    private static wme createPrimaryAnimatorProvider(boolean z) {
        wme wmeVar = new wme(z);
        wmeVar.setOutgoingEndScale(0.85f);
        wmeVar.setIncomingStartScale(0.85f);
        return wmeVar;
    }

    private static cdi createSecondaryAnimatorProvider() {
        return new to5();
    }

    @Override // p000.j3a
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@efb cdi cdiVar) {
        super.addAdditionalAnimatorProvider(cdiVar);
    }

    @Override // p000.j3a
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // p000.j3a
    @efb
    public /* bridge */ /* synthetic */ cdi getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // p000.j3a
    @hib
    public /* bridge */ /* synthetic */ cdi getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    public boolean isGrowing() {
        return this.f83507M2;
    }

    @Override // p000.j3a, androidx.transition.AbstractC1442a0
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, sfh sfhVar, sfh sfhVar2) {
        return super.onAppear(viewGroup, view, sfhVar, sfhVar2);
    }

    @Override // p000.j3a, androidx.transition.AbstractC1442a0
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, sfh sfhVar, sfh sfhVar2) {
        return super.onDisappear(viewGroup, view, sfhVar, sfhVar2);
    }

    @Override // p000.j3a
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@efb cdi cdiVar) {
        return super.removeAdditionalAnimatorProvider(cdiVar);
    }

    @Override // p000.j3a
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@hib cdi cdiVar) {
        super.setSecondaryAnimatorProvider(cdiVar);
    }
}
