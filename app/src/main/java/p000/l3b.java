package p000;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Collection;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class l3b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8603a f56107a;

    /* JADX INFO: renamed from: b */
    public final View[] f56108b;

    /* JADX INFO: renamed from: l3b$a */
    public interface InterfaceC8603a {
        void onAnimationUpdate(@efb ValueAnimator valueAnimator, @efb View view);
    }

    @igg({"LambdaLast"})
    public l3b(@efb InterfaceC8603a interfaceC8603a, @efb View... viewArr) {
        this.f56107a = interfaceC8603a;
        this.f56108b = viewArr;
    }

    @efb
    public static l3b alphaListener(@efb View... viewArr) {
        return new l3b(new k3b(), viewArr);
    }

    @efb
    public static l3b scaleListener(@efb View... viewArr) {
        return new l3b(new i3b(), viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setAlpha(@efb ValueAnimator valueAnimator, @efb View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setScale(@efb ValueAnimator valueAnimator, @efb View view) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTranslationX(@efb ValueAnimator valueAnimator, @efb View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTranslationY(@efb ValueAnimator valueAnimator, @efb View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @efb
    public static l3b translationXListener(@efb View... viewArr) {
        return new l3b(new h3b(), viewArr);
    }

    @efb
    public static l3b translationYListener(@efb View... viewArr) {
        return new l3b(new j3b(), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@efb ValueAnimator valueAnimator) {
        for (View view : this.f56108b) {
            this.f56107a.onAnimationUpdate(valueAnimator, view);
        }
    }

    @efb
    public static l3b alphaListener(@efb Collection<View> collection) {
        return new l3b(new k3b(), collection);
    }

    @efb
    public static l3b scaleListener(@efb Collection<View> collection) {
        return new l3b(new i3b(), collection);
    }

    @efb
    public static l3b translationXListener(@efb Collection<View> collection) {
        return new l3b(new h3b(), collection);
    }

    @efb
    public static l3b translationYListener(@efb Collection<View> collection) {
        return new l3b(new j3b(), collection);
    }

    @igg({"LambdaLast"})
    public l3b(@efb InterfaceC8603a interfaceC8603a, @efb Collection<View> collection) {
        this.f56107a = interfaceC8603a;
        this.f56108b = (View[]) collection.toArray(new View[0]);
    }
}
