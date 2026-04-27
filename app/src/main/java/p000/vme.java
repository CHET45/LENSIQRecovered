package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public final class vme implements bdi {

    /* JADX INFO: renamed from: a */
    public float f91742a;

    /* JADX INFO: renamed from: b */
    public float f91743b;

    /* JADX INFO: renamed from: c */
    public float f91744c;

    /* JADX INFO: renamed from: d */
    public float f91745d;

    /* JADX INFO: renamed from: e */
    public boolean f91746e;

    /* JADX INFO: renamed from: f */
    public boolean f91747f;

    /* JADX INFO: renamed from: vme$a */
    public class C14169a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f91748a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f91749b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f91750c;

        public C14169a(View view, float f, float f2) {
            this.f91748a = view;
            this.f91749b = f;
            this.f91750c = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f91748a.setScaleX(this.f91749b);
            this.f91748a.setScaleY(this.f91750c);
        }
    }

    public vme() {
        this(true);
    }

    private static Animator createScaleAnimator(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f * scaleY, f2 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new C14169a(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // p000.bdi
    @hib
    public Animator createAppear(@efb ViewGroup viewGroup, @efb View view) {
        return this.f91746e ? createScaleAnimator(view, this.f91744c, this.f91745d) : createScaleAnimator(view, this.f91743b, this.f91742a);
    }

    @Override // p000.bdi
    @hib
    public Animator createDisappear(@efb ViewGroup viewGroup, @efb View view) {
        if (this.f91747f) {
            return this.f91746e ? createScaleAnimator(view, this.f91742a, this.f91743b) : createScaleAnimator(view, this.f91745d, this.f91744c);
        }
        return null;
    }

    public float getIncomingEndScale() {
        return this.f91745d;
    }

    public float getIncomingStartScale() {
        return this.f91744c;
    }

    public float getOutgoingEndScale() {
        return this.f91743b;
    }

    public float getOutgoingStartScale() {
        return this.f91742a;
    }

    public boolean isGrowing() {
        return this.f91746e;
    }

    public boolean isScaleOnDisappear() {
        return this.f91747f;
    }

    public void setGrowing(boolean z) {
        this.f91746e = z;
    }

    public void setIncomingEndScale(float f) {
        this.f91745d = f;
    }

    public void setIncomingStartScale(float f) {
        this.f91744c = f;
    }

    public void setOutgoingEndScale(float f) {
        this.f91743b = f;
    }

    public void setOutgoingStartScale(float f) {
        this.f91742a = f;
    }

    public void setScaleOnDisappear(boolean z) {
        this.f91747f = z;
    }

    public vme(boolean z) {
        this.f91742a = 1.0f;
        this.f91743b = 1.1f;
        this.f91744c = 0.8f;
        this.f91745d = 1.0f;
        this.f91747f = true;
        this.f91746e = z;
    }
}
