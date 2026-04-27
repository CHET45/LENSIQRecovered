package p000;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.C3146R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public final class e3a extends i3a<bdi> {

    /* JADX INFO: renamed from: C */
    public static final int f31660C = 2;

    /* JADX INFO: renamed from: F */
    @gc0
    public static final int f31661F = C3146R.attr.motionDurationLong1;

    /* JADX INFO: renamed from: H */
    @gc0
    public static final int f31662H = C3146R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: f */
    public static final int f31663f = 0;

    /* JADX INFO: renamed from: m */
    public static final int f31664m = 1;

    /* JADX INFO: renamed from: d */
    public final int f31665d;

    /* JADX INFO: renamed from: e */
    public final boolean f31666e;

    /* JADX INFO: renamed from: e3a$a */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69935b})
    public @interface InterfaceC5066a {
    }

    public e3a(int i, boolean z) {
        super(createPrimaryAnimatorProvider(i, z), createSecondaryAnimatorProvider());
        this.f31665d = i;
        this.f31666e = z;
    }

    private static bdi createPrimaryAnimatorProvider(int i, boolean z) {
        if (i == 0) {
            return new rqf(z ? cb7.f16190c : 8388611);
        }
        if (i == 1) {
            return new rqf(z ? 80 : 48);
        }
        if (i == 2) {
            return new vme(z);
        }
        throw new IllegalArgumentException("Invalid axis: " + i);
    }

    private static bdi createSecondaryAnimatorProvider() {
        return new wo5();
    }

    @Override // p000.i3a
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@efb bdi bdiVar) {
        super.addAdditionalAnimatorProvider(bdiVar);
    }

    @Override // p000.i3a
    @gc0
    /* JADX INFO: renamed from: b */
    public int mo9650b(boolean z) {
        return f31661F;
    }

    @Override // p000.i3a
    @gc0
    /* JADX INFO: renamed from: c */
    public int mo9651c(boolean z) {
        return f31662H;
    }

    @Override // p000.i3a
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    public int getAxis() {
        return this.f31665d;
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

    public boolean isForward() {
        return this.f31666e;
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
