package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.C3146R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public final class sqf implements cdi {

    /* JADX INFO: renamed from: c */
    public static final int f82632c = -1;

    /* JADX INFO: renamed from: a */
    public int f82633a;

    /* JADX INFO: renamed from: b */
    @fkd
    public int f82634b = -1;

    /* JADX INFO: renamed from: sqf$a */
    public class C12748a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f82635a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f82636b;

        public C12748a(View view, float f) {
            this.f82635a = view;
            this.f82636b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f82635a.setTranslationX(this.f82636b);
        }
    }

    /* JADX INFO: renamed from: sqf$b */
    public class C12749b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f82637a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f82638b;

        public C12749b(View view, float f) {
            this.f82637a = view;
            this.f82638b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f82637a.setTranslationY(this.f82638b);
        }
    }

    /* JADX INFO: renamed from: sqf$c */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69935b})
    public @interface InterfaceC12750c {
    }

    public sqf(int i) {
        this.f82633a = i;
    }

    private static Animator createTranslationAppearAnimator(View view, View view2, int i, @fkd int i2) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return createTranslationXAnimator(view2, i2 + translationX, translationX, translationX);
        }
        if (i == 5) {
            return createTranslationXAnimator(view2, translationX - i2, translationX, translationX);
        }
        if (i == 48) {
            return createTranslationYAnimator(view2, translationY - i2, translationY, translationY);
        }
        if (i == 80) {
            return createTranslationYAnimator(view2, i2 + translationY, translationY, translationY);
        }
        if (i == 8388611) {
            return createTranslationXAnimator(view2, isRtl(view) ? i2 + translationX : translationX - i2, translationX, translationX);
        }
        if (i == 8388613) {
            return createTranslationXAnimator(view2, isRtl(view) ? translationX - i2 : i2 + translationX, translationX, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i);
    }

    private static Animator createTranslationDisappearAnimator(View view, View view2, int i, @fkd int i2) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return createTranslationXAnimator(view2, translationX, translationX - i2, translationX);
        }
        if (i == 5) {
            return createTranslationXAnimator(view2, translationX, i2 + translationX, translationX);
        }
        if (i == 48) {
            return createTranslationYAnimator(view2, translationY, i2 + translationY, translationY);
        }
        if (i == 80) {
            return createTranslationYAnimator(view2, translationY, translationY - i2, translationY);
        }
        if (i == 8388611) {
            return createTranslationXAnimator(view2, translationX, isRtl(view) ? translationX - i2 : i2 + translationX, translationX);
        }
        if (i == 8388613) {
            return createTranslationXAnimator(view2, translationX, isRtl(view) ? i2 + translationX : translationX - i2, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i);
    }

    private static Animator createTranslationXAnimator(View view, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f2));
        objectAnimatorOfPropertyValuesHolder.addListener(new C12748a(view, f3));
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static Animator createTranslationYAnimator(View view, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f, f2));
        objectAnimatorOfPropertyValuesHolder.addListener(new C12749b(view, f3));
        return objectAnimatorOfPropertyValuesHolder;
    }

    private int getSlideDistanceOrDefault(Context context) {
        int i = this.f82634b;
        return i != -1 ? i : context.getResources().getDimensionPixelSize(C3146R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    private static boolean isRtl(View view) {
        return o8i.getLayoutDirection(view) == 1;
    }

    @Override // p000.cdi
    @hib
    public Animator createAppear(@efb ViewGroup viewGroup, @efb View view) {
        return createTranslationAppearAnimator(viewGroup, view, this.f82633a, getSlideDistanceOrDefault(view.getContext()));
    }

    @Override // p000.cdi
    @hib
    public Animator createDisappear(@efb ViewGroup viewGroup, @efb View view) {
        return createTranslationDisappearAnimator(viewGroup, view, this.f82633a, getSlideDistanceOrDefault(view.getContext()));
    }

    @fkd
    public int getSlideDistance() {
        return this.f82634b;
    }

    public int getSlideEdge() {
        return this.f82633a;
    }

    public void setSlideDistance(@fkd int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
        this.f82634b = i;
    }

    public void setSlideEdge(int i) {
        this.f82633a = i;
    }
}
