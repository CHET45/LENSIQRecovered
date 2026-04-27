package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.C3146R;

/* JADX INFO: loaded from: classes5.dex */
public final class v2a extends j3a<to5> {

    /* JADX INFO: renamed from: M2 */
    public static final float f89783M2 = 0.8f;

    /* JADX INFO: renamed from: N2 */
    public static final float f89784N2 = 0.3f;

    /* JADX INFO: renamed from: O2 */
    @gc0
    public static final int f89785O2 = C3146R.attr.motionDurationMedium4;

    /* JADX INFO: renamed from: P2 */
    @gc0
    public static final int f89786P2 = C3146R.attr.motionDurationShort3;

    /* JADX INFO: renamed from: Q2 */
    @gc0
    public static final int f89787Q2 = C3146R.attr.motionEasingEmphasizedDecelerateInterpolator;

    /* JADX INFO: renamed from: R2 */
    @gc0
    public static final int f89788R2 = C3146R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public v2a() {
        super(createPrimaryAnimatorProvider(), createSecondaryAnimatorProvider());
    }

    private static to5 createPrimaryAnimatorProvider() {
        to5 to5Var = new to5();
        to5Var.setIncomingEndThreshold(0.3f);
        return to5Var;
    }

    private static cdi createSecondaryAnimatorProvider() {
        wme wmeVar = new wme();
        wmeVar.setScaleOnDisappear(false);
        wmeVar.setIncomingStartScale(0.8f);
        return wmeVar;
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

    @Override // p000.j3a, androidx.transition.AbstractC1442a0
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, sfh sfhVar, sfh sfhVar2) {
        return super.onAppear(viewGroup, view, sfhVar, sfhVar2);
    }

    @Override // p000.j3a, androidx.transition.AbstractC1442a0
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, sfh sfhVar, sfh sfhVar2) {
        return super.onDisappear(viewGroup, view, sfhVar, sfhVar2);
    }

    @Override // p000.j3a
    @efb
    /* JADX INFO: renamed from: p */
    public TimeInterpolator mo13706p(boolean z) {
        return C13280ty.f86289a;
    }

    @Override // p000.j3a
    @gc0
    /* JADX INFO: renamed from: q */
    public int mo8874q(boolean z) {
        return z ? f89785O2 : f89786P2;
    }

    @Override // p000.j3a
    @gc0
    /* JADX INFO: renamed from: r */
    public int mo8875r(boolean z) {
        return z ? f89787Q2 : f89788R2;
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
