package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class sf5 {

    /* JADX INFO: renamed from: a */
    public final View f81645a;

    /* JADX INFO: renamed from: b */
    public final View f81646b;

    /* JADX INFO: renamed from: c */
    public final List<AnimatorListenerAdapter> f81647c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<View> f81648d = new ArrayList();

    /* JADX INFO: renamed from: e */
    @hib
    public ValueAnimator.AnimatorUpdateListener f81649e;

    /* JADX INFO: renamed from: f */
    public long f81650f;

    /* JADX INFO: renamed from: g */
    public int f81651g;

    /* JADX INFO: renamed from: h */
    public int f81652h;

    /* JADX INFO: renamed from: sf5$a */
    public class C12553a extends AnimatorListenerAdapter {
        public C12553a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            sf5.this.f81646b.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: sf5$b */
    public class C12554b extends AnimatorListenerAdapter {
        public C12554b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            sf5.this.f81646b.setVisibility(8);
        }
    }

    public sf5(@efb View view, @efb View view2) {
        this.f81645a = view;
        this.f81646b = view2;
    }

    private void addListeners(Animator animator, List<AnimatorListenerAdapter> list) {
        Iterator<AnimatorListenerAdapter> it = list.iterator();
        while (it.hasNext()) {
            animator.addListener(it.next());
        }
    }

    private AnimatorSet getAnimatorSet(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getExpandCollapseAnimator(z), getExpandedViewChildrenAlphaAnimator(z), getEndAnchoredViewsTranslateAnimator(z));
        return animatorSet;
    }

    private Animator getEndAnchoredViewsTranslateAnimator(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.f81646b.getLeft() - this.f81645a.getLeft()) + (this.f81645a.getRight() - this.f81646b.getRight()), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(l3b.translationXListener(this.f81648d));
        valueAnimatorOfFloat.setDuration(this.f81650f);
        valueAnimatorOfFloat.setInterpolator(j9e.m13909of(z, C13280ty.f86290b));
        return valueAnimatorOfFloat;
    }

    private Animator getExpandCollapseAnimator(boolean z) {
        Rect rectCalculateRectFromBounds = cci.calculateRectFromBounds(this.f81645a, this.f81651g);
        Rect rectCalculateRectFromBounds2 = cci.calculateRectFromBounds(this.f81646b, this.f81652h);
        final Rect rect = new Rect(rectCalculateRectFromBounds);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new tud(rect), rectCalculateRectFromBounds, rectCalculateRectFromBounds2);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rf5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f78149a.lambda$getExpandCollapseAnimator$0(rect, valueAnimator);
            }
        });
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f81649e;
        if (animatorUpdateListener != null) {
            valueAnimatorOfObject.addUpdateListener(animatorUpdateListener);
        }
        valueAnimatorOfObject.setDuration(this.f81650f);
        valueAnimatorOfObject.setInterpolator(j9e.m13909of(z, C13280ty.f86290b));
        return valueAnimatorOfObject;
    }

    private Animator getExpandedViewChildrenAlphaAnimator(boolean z) {
        List<View> children = cci.getChildren(this.f81646b);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(l3b.alphaListener(children));
        valueAnimatorOfFloat.setDuration(this.f81650f);
        valueAnimatorOfFloat.setInterpolator(j9e.m13909of(z, C13280ty.f86289a));
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getExpandCollapseAnimator$0(Rect rect, ValueAnimator valueAnimator) {
        cci.setBoundsFromRect(this.f81646b, rect);
    }

    @efb
    @op1
    public sf5 addEndAnchoredViews(@efb View... viewArr) {
        Collections.addAll(this.f81648d, viewArr);
        return this;
    }

    @efb
    @op1
    public sf5 addListener(@efb AnimatorListenerAdapter animatorListenerAdapter) {
        this.f81647c.add(animatorListenerAdapter);
        return this;
    }

    @efb
    public Animator getCollapseAnimator() {
        AnimatorSet animatorSet = getAnimatorSet(false);
        animatorSet.addListener(new C12554b());
        addListeners(animatorSet, this.f81647c);
        return animatorSet;
    }

    @efb
    public Animator getExpandAnimator() {
        AnimatorSet animatorSet = getAnimatorSet(true);
        animatorSet.addListener(new C12553a());
        addListeners(animatorSet, this.f81647c);
        return animatorSet;
    }

    @efb
    @op1
    public sf5 setAdditionalUpdateListener(@hib ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f81649e = animatorUpdateListener;
        return this;
    }

    @efb
    @op1
    public sf5 setCollapsedViewOffsetY(int i) {
        this.f81651g = i;
        return this;
    }

    @efb
    @op1
    public sf5 setDuration(long j) {
        this.f81650f = j;
        return this;
    }

    @efb
    @op1
    public sf5 setExpandedViewOffsetY(int i) {
        this.f81652h = i;
        return this;
    }

    @efb
    @op1
    public sf5 addEndAnchoredViews(@efb Collection<View> collection) {
        this.f81648d.addAll(collection);
        return this;
    }
}
