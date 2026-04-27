package p000;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.C3146R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public final class d3a extends j3a<cdi> {

    /* JADX INFO: renamed from: O2 */
    public static final int f28337O2 = 0;

    /* JADX INFO: renamed from: P2 */
    public static final int f28338P2 = 1;

    /* JADX INFO: renamed from: Q2 */
    public static final int f28339Q2 = 2;

    /* JADX INFO: renamed from: R2 */
    @gc0
    public static final int f28340R2 = C3146R.attr.motionDurationLong1;

    /* JADX INFO: renamed from: S2 */
    @gc0
    public static final int f28341S2 = C3146R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: M2 */
    public final int f28342M2;

    /* JADX INFO: renamed from: N2 */
    public final boolean f28343N2;

    /* JADX INFO: renamed from: d3a$a */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69935b})
    public @interface InterfaceC4597a {
    }

    public d3a(int i, boolean z) {
        super(createPrimaryAnimatorProvider(i, z), createSecondaryAnimatorProvider());
        this.f28342M2 = i;
        this.f28343N2 = z;
    }

    private static cdi createPrimaryAnimatorProvider(int i, boolean z) {
        if (i == 0) {
            return new sqf(z ? cb7.f16190c : 8388611);
        }
        if (i == 1) {
            return new sqf(z ? 80 : 48);
        }
        if (i == 2) {
            return new wme(z);
        }
        throw new IllegalArgumentException("Invalid axis: " + i);
    }

    private static cdi createSecondaryAnimatorProvider() {
        return new xo5();
    }

    @Override // p000.j3a
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@efb cdi cdiVar) {
        super.addAdditionalAnimatorProvider(cdiVar);
    }

    @Override // p000.j3a
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    public int getAxis() {
        return this.f28342M2;
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

    public boolean isForward() {
        return this.f28343N2;
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
        return f28340R2;
    }

    @Override // p000.j3a
    @gc0
    /* JADX INFO: renamed from: r */
    public int mo8875r(boolean z) {
        return f28341S2;
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
