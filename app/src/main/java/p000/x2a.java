package p000;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.C3146R;

/* JADX INFO: loaded from: classes5.dex */
public final class x2a extends j3a<xo5> {

    /* JADX INFO: renamed from: M2 */
    public static final float f96101M2 = 0.92f;

    /* JADX INFO: renamed from: N2 */
    @gc0
    public static final int f96102N2 = C3146R.attr.motionDurationLong1;

    /* JADX INFO: renamed from: O2 */
    @gc0
    public static final int f96103O2 = C3146R.attr.motionEasingEmphasizedInterpolator;

    public x2a() {
        super(createPrimaryAnimatorProvider(), createSecondaryAnimatorProvider());
    }

    private static xo5 createPrimaryAnimatorProvider() {
        return new xo5();
    }

    private static cdi createSecondaryAnimatorProvider() {
        wme wmeVar = new wme();
        wmeVar.setScaleOnDisappear(false);
        wmeVar.setIncomingStartScale(0.92f);
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
    @gc0
    /* JADX INFO: renamed from: q */
    public int mo8874q(boolean z) {
        return f96102N2;
    }

    @Override // p000.j3a
    @gc0
    /* JADX INFO: renamed from: r */
    public int mo8875r(boolean z) {
        return f96103O2;
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
