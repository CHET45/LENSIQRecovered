package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public final class wme implements cdi {

    /* JADX INFO: renamed from: a */
    public float f94762a;

    /* JADX INFO: renamed from: b */
    public float f94763b;

    /* JADX INFO: renamed from: c */
    public float f94764c;

    /* JADX INFO: renamed from: d */
    public float f94765d;

    /* JADX INFO: renamed from: e */
    public boolean f94766e;

    /* JADX INFO: renamed from: f */
    public boolean f94767f;

    /* JADX INFO: renamed from: wme$a */
    public class C14693a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f94768a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f94769b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f94770c;

        public C14693a(View view, float f, float f2) {
            this.f94768a = view;
            this.f94769b = f;
            this.f94770c = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f94768a.setScaleX(this.f94769b);
            this.f94768a.setScaleY(this.f94770c);
        }
    }

    public wme() {
        this(true);
    }

    private static Animator createScaleAnimator(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f * scaleY, f2 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new C14693a(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // p000.cdi
    @hib
    public Animator createAppear(@efb ViewGroup viewGroup, @efb View view) {
        return this.f94766e ? createScaleAnimator(view, this.f94764c, this.f94765d) : createScaleAnimator(view, this.f94763b, this.f94762a);
    }

    @Override // p000.cdi
    @hib
    public Animator createDisappear(@efb ViewGroup viewGroup, @efb View view) {
        if (this.f94767f) {
            return this.f94766e ? createScaleAnimator(view, this.f94762a, this.f94763b) : createScaleAnimator(view, this.f94765d, this.f94764c);
        }
        return null;
    }

    public float getIncomingEndScale() {
        return this.f94765d;
    }

    public float getIncomingStartScale() {
        return this.f94764c;
    }

    public float getOutgoingEndScale() {
        return this.f94763b;
    }

    public float getOutgoingStartScale() {
        return this.f94762a;
    }

    public boolean isGrowing() {
        return this.f94766e;
    }

    public boolean isScaleOnDisappear() {
        return this.f94767f;
    }

    public void setGrowing(boolean z) {
        this.f94766e = z;
    }

    public void setIncomingEndScale(float f) {
        this.f94765d = f;
    }

    public void setIncomingStartScale(float f) {
        this.f94764c = f;
    }

    public void setOutgoingEndScale(float f) {
        this.f94763b = f;
    }

    public void setOutgoingStartScale(float f) {
        this.f94762a = f;
    }

    public void setScaleOnDisappear(boolean z) {
        this.f94767f = z;
    }

    public wme(boolean z) {
        this.f94762a = 1.0f;
        this.f94763b = 1.1f;
        this.f94764c = 0.8f;
        this.f94765d = 1.0f;
        this.f94767f = true;
        this.f94766e = z;
    }
}
