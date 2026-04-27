package com.draggable.library.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.draggable.library.core.DraggableZoomCore;
import p000.gib;
import p000.jt3;
import p000.md8;
import p000.mlh;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
public final class DraggableZoomCore {
    private final long ANIMATOR_DURATION;
    private final int MAX_TRANSLATE_Y;
    private final String TAG;

    @gib
    private final ActionListener actionListener;
    private DraggableParamsInfo draggableParams;

    @gib
    private final ExitAnimatorCallback exitCallback;
    private boolean isAnimating;
    private int mAlpha;
    private final int mContainerHeight;
    private final int mContainerWidth;
    private int mCurrentHeight;
    private float mCurrentScaleX;
    private float mCurrentScaleY;
    private float mCurrentTransLateY;
    private float mCurrentTranslateX;
    private int mCurrentWidth;
    private float mDownX;
    private float mDownY;
    private float mTargetTranslateY;
    private float maxHeight;
    private float minScaleXY;
    private final View scaleDraggableView;

    public interface ActionListener {
        void currentAlphaValue(int i);

        void onExit();
    }

    public interface EnterAnimatorCallback {
        void onEnterAnimatorEnd();

        void onEnterAnimatorStart();
    }

    public interface ExitAnimatorCallback {
        void onStartInitAnimatorParams();
    }

    public DraggableZoomCore(@yfb DraggableParamsInfo draggableParamsInfo, @yfb View view, int i, int i2, @gib ActionListener actionListener, @gib ExitAnimatorCallback exitAnimatorCallback) {
        md8.checkParameterIsNotNull(draggableParamsInfo, "draggableParams");
        md8.checkParameterIsNotNull(view, "scaleDraggableView");
        this.draggableParams = draggableParamsInfo;
        this.scaleDraggableView = view;
        this.mContainerWidth = i;
        this.mContainerHeight = i2;
        this.actionListener = actionListener;
        this.exitCallback = exitAnimatorCallback;
        this.TAG = DraggableZoomCore.class.getSimpleName();
        this.ANIMATOR_DURATION = 200L;
        this.mCurrentScaleX = 1.0f;
        this.mCurrentScaleY = 1.0f;
        this.minScaleXY = 0.3f;
        this.maxHeight = 1.0f;
        this.MAX_TRANSLATE_Y = 1500;
    }

    private final void animateToOriginLocation(float f, float f2) {
        ExitAnimatorCallback exitAnimatorCallback = this.exitCallback;
        if (exitAnimatorCallback != null) {
            exitAnimatorCallback.onStartInitAnimatorParams();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("mCurrentTranslateX : ");
        sb.append(this.mCurrentTranslateX);
        sb.append("  mCurrentTransLateY : ");
        sb.append(this.mCurrentTransLateY);
        final float viewLeft = this.mCurrentTranslateX - this.draggableParams.getViewLeft();
        final float viewTop = this.mCurrentTransLateY - this.draggableParams.getViewTop();
        final float viewWidth = f - this.draggableParams.getViewWidth();
        final float viewHeight = f2 - this.draggableParams.getViewHeight();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(this.ANIMATOR_DURATION);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.draggable.library.core.DraggableZoomCore$animateToOriginLocation$$inlined$apply$lambda$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                md8.checkExpressionValueIsNotNull(valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue == null) {
                    throw new mlh("null cannot be cast to non-null type kotlin.Float");
                }
                float fFloatValue = ((Float) animatedValue).floatValue();
                this.this$0.mCurrentTranslateX = r0.draggableParams.getViewLeft() + (viewLeft * fFloatValue);
                this.this$0.mCurrentTransLateY = r0.draggableParams.getViewTop() + (viewTop * fFloatValue);
                DraggableZoomCore draggableZoomCore = this.this$0;
                draggableZoomCore.mCurrentWidth = draggableZoomCore.draggableParams.getViewWidth() + ((int) (viewWidth * fFloatValue));
                DraggableZoomCore draggableZoomCore2 = this.this$0;
                draggableZoomCore2.mCurrentHeight = draggableZoomCore2.draggableParams.getViewHeight() + ((int) (viewHeight * fFloatValue));
                this.this$0.mAlpha = (int) (r0.mAlpha * fFloatValue);
                this.this$0.changeChildViewAnimateParams();
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.draggable.library.core.DraggableZoomCore$animateToOriginLocation$$inlined$apply$lambda$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@gib Animator animator) {
                this.this$0.setAnimating(false);
                DraggableZoomCore.ActionListener actionListener = this.this$0.getActionListener();
                if (actionListener != null) {
                    actionListener.onExit();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(@gib Animator animator) {
                this.this$0.setAnimating(true);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeChildViewAnimateParams() {
        View view = this.scaleDraggableView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.mCurrentWidth;
            layoutParams.height = this.mCurrentHeight;
        } else {
            layoutParams = null;
        }
        view.setLayoutParams(layoutParams);
        view.setTranslationX(this.mCurrentTranslateX);
        view.setTranslationY(this.mCurrentTransLateY);
        view.setScaleX(this.mCurrentScaleX);
        view.setScaleY(this.mCurrentScaleY);
        ActionListener actionListener = this.actionListener;
        if (actionListener != null) {
            actionListener.currentAlphaValue(this.mAlpha);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeChildViewDragParams() {
        View view = this.scaleDraggableView;
        view.setTranslationX(this.mCurrentTranslateX);
        view.setTranslationY(this.mCurrentTransLateY);
        view.setScaleX(this.mCurrentScaleX);
        view.setScaleY(this.mCurrentScaleY);
        ActionListener actionListener = this.actionListener;
        if (actionListener != null) {
            actionListener.currentAlphaValue(this.mAlpha);
        }
    }

    public static /* synthetic */ void enterWithAnimator$default(DraggableZoomCore draggableZoomCore, EnterAnimatorCallback enterAnimatorCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            enterAnimatorCallback = null;
        }
        draggableZoomCore.enterWithAnimator(enterAnimatorCallback);
    }

    private final void onActionMove(float f, float f2) {
        float f3 = f2 / this.MAX_TRANSLATE_Y;
        float f4 = 1;
        if (f3 > f4) {
            f3 = 1.0f;
        }
        if (f3 < 0) {
            f3 = 0.0f;
        }
        this.mCurrentTransLateY = this.mTargetTranslateY + f2;
        this.mCurrentTranslateX = f;
        float f5 = f4 - f3;
        this.mCurrentScaleX = f5;
        this.mCurrentScaleY = f5;
        float f6 = this.minScaleXY;
        if (f5 <= f6) {
            this.mCurrentScaleX = f6;
        }
        if (f5 <= f6) {
            this.mCurrentScaleY = f6;
        }
        if (this.mCurrentScaleX > f4) {
            this.mCurrentScaleX = 1.0f;
        }
        if (this.mCurrentScaleY > f4) {
            this.mCurrentScaleY = 1.0f;
        }
        this.mCurrentWidth = (int) (this.mContainerWidth * this.mCurrentScaleX);
        this.mCurrentHeight = (int) (this.mContainerHeight * this.mCurrentScaleY);
        float f7 = 255;
        this.mAlpha = (int) (f7 - (f3 * f7));
        changeChildViewDragParams();
    }

    private final void restoreStatusWithAnimator() {
        StringBuilder sb = new StringBuilder();
        sb.append("mCurrentTransLateY : ");
        sb.append(this.mCurrentTransLateY);
        sb.append(' ');
        final int i = this.mAlpha;
        final int i2 = 255 - i;
        final float f = this.mCurrentScaleX;
        float f2 = 1;
        final float f3 = f2 - f;
        final float f4 = this.mCurrentScaleY;
        final float f5 = f2 - f4;
        final float f6 = this.mCurrentTranslateX;
        final float f7 = 0 - f6;
        final float f8 = this.mCurrentTransLateY;
        final float f9 = this.mTargetTranslateY - f8;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.ANIMATOR_DURATION);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.draggable.library.core.DraggableZoomCore$restoreStatusWithAnimator$$inlined$apply$lambda$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                md8.checkExpressionValueIsNotNull(valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue == null) {
                    throw new mlh("null cannot be cast to non-null type kotlin.Float");
                }
                float fFloatValue = ((Float) animatedValue).floatValue();
                this.this$0.mCurrentTransLateY = f8 + (f9 * fFloatValue);
                this.this$0.mCurrentTranslateX = f6 + (f7 * fFloatValue);
                this.this$0.mCurrentScaleY = f4 + (f5 * fFloatValue);
                this.this$0.mCurrentScaleX = f + (f3 * fFloatValue);
                this.this$0.mAlpha = i + ((int) (i2 * fFloatValue));
                this.this$0.changeChildViewDragParams();
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.draggable.library.core.DraggableZoomCore$restoreStatusWithAnimator$$inlined$apply$lambda$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@gib Animator animator) {
                this.this$0.setAnimating(false);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(@gib Animator animator) {
                this.this$0.setAnimating(true);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public final void adjustScaleViewToCorrectLocation() {
        if (this.draggableParams.isValid()) {
            float scaledViewWhRadio = this.mContainerWidth / this.draggableParams.getScaledViewWhRadio();
            this.maxHeight = scaledViewWhRadio;
            int i = this.mContainerHeight;
            if (scaledViewWhRadio > i) {
                this.maxHeight = i;
            }
            float f = this.maxHeight;
            this.mCurrentHeight = (int) f;
            this.mCurrentWidth = this.mContainerWidth;
            this.mCurrentTranslateX = 0.0f;
            float f2 = (i - f) / 2;
            this.mCurrentTransLateY = f2;
            this.mTargetTranslateY = f2;
        } else {
            this.mCurrentWidth = this.mContainerWidth;
            this.mCurrentHeight = this.mContainerHeight;
            this.mCurrentTranslateX = 0.0f;
            this.mCurrentTransLateY = 0.0f;
            this.mTargetTranslateY = 0.0f;
        }
        this.mAlpha = 255;
        changeChildViewAnimateParams();
    }

    public final void adjustScaleViewToInitLocation() {
        if (this.draggableParams.isValid()) {
            this.mCurrentHeight = this.draggableParams.getViewHeight();
            this.mCurrentWidth = this.draggableParams.getViewWidth();
            this.mCurrentTranslateX = this.draggableParams.getViewLeft();
            this.mCurrentTransLateY = this.draggableParams.getViewTop();
            float scaledViewWhRadio = this.mContainerWidth / this.draggableParams.getScaledViewWhRadio();
            this.maxHeight = scaledViewWhRadio;
            int i = this.mContainerHeight;
            if (scaledViewWhRadio > i) {
                this.maxHeight = i;
            }
            this.mTargetTranslateY = (i - this.maxHeight) / 2;
        }
    }

    public final void adjustViewToMatchParent() {
        this.mCurrentWidth = this.mContainerWidth;
        this.mCurrentHeight = this.mContainerHeight;
        this.mCurrentTranslateX = 0.0f;
        this.mCurrentTransLateY = 0.0f;
        this.mTargetTranslateY = 0.0f;
        changeChildViewAnimateParams();
    }

    public final void enterWithAnimator(@gib final EnterAnimatorCallback enterAnimatorCallback) {
        if (this.draggableParams.isValid()) {
            final float f = this.mCurrentTranslateX - 0;
            final float f2 = this.mCurrentTransLateY - this.mTargetTranslateY;
            final int viewWidth = this.mContainerWidth - this.draggableParams.getViewWidth();
            final float viewHeight = this.maxHeight - this.draggableParams.getViewHeight();
            StringBuilder sb = new StringBuilder();
            sb.append("enterWithAnimator : dx:");
            sb.append(f);
            sb.append("  dy:");
            sb.append(f2);
            sb.append("  dWidth : ");
            sb.append(viewWidth);
            sb.append(" xss dHeight:");
            sb.append(viewHeight);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(this.ANIMATOR_DURATION);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.draggable.library.core.DraggableZoomCore$enterWithAnimator$$inlined$apply$lambda$1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    md8.checkExpressionValueIsNotNull(valueAnimator, "it");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue == null) {
                        throw new mlh("null cannot be cast to non-null type kotlin.Float");
                    }
                    float fFloatValue = ((Float) animatedValue).floatValue();
                    this.this$0.mCurrentTranslateX = r0.draggableParams.getViewLeft() - (f * fFloatValue);
                    this.this$0.mCurrentTransLateY = r0.draggableParams.getViewTop() - (f2 * fFloatValue);
                    DraggableZoomCore draggableZoomCore = this.this$0;
                    draggableZoomCore.mCurrentWidth = draggableZoomCore.draggableParams.getViewWidth() + ((int) (viewWidth * fFloatValue));
                    DraggableZoomCore draggableZoomCore2 = this.this$0;
                    draggableZoomCore2.mCurrentHeight = draggableZoomCore2.draggableParams.getViewHeight() + ((int) (viewHeight * fFloatValue));
                    this.this$0.mAlpha = (int) (255 * fFloatValue);
                    this.this$0.changeChildViewAnimateParams();
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.draggable.library.core.DraggableZoomCore$enterWithAnimator$$inlined$apply$lambda$2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@gib Animator animator) {
                    this.this$0.setAnimating(false);
                    DraggableZoomCore.EnterAnimatorCallback enterAnimatorCallback2 = enterAnimatorCallback;
                    if (enterAnimatorCallback2 != null) {
                        enterAnimatorCallback2.onEnterAnimatorEnd();
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(@gib Animator animator) {
                    this.this$0.setAnimating(true);
                    DraggableZoomCore.EnterAnimatorCallback enterAnimatorCallback2 = enterAnimatorCallback;
                    if (enterAnimatorCallback2 != null) {
                        enterAnimatorCallback2.onEnterAnimatorStart();
                    }
                }
            });
            valueAnimatorOfFloat.start();
        }
    }

    public final void exitWithAnimator(boolean z) {
        int i = this.mContainerWidth;
        float f = this.mCurrentScaleX;
        float f2 = i * f;
        float f3 = this.maxHeight * this.mCurrentScaleY;
        float f4 = 1;
        float f5 = i * (f4 - f);
        float f6 = 2;
        this.mCurrentTranslateX += f5 / f6;
        StringBuilder sb = new StringBuilder();
        sb.append("mCurrentTransLateY : ");
        sb.append(this.mCurrentTransLateY);
        sb.append("  1111   mTargetTranslateY : ");
        sb.append(this.mTargetTranslateY);
        if (z) {
            float f7 = this.maxHeight;
            int i2 = this.mContainerHeight;
            this.mCurrentTransLateY += ((i2 * (f4 - (this.mCurrentScaleY * (f7 / i2)))) / f6) - this.mTargetTranslateY;
        } else {
            this.mCurrentTransLateY += (this.maxHeight * (f4 - this.mCurrentScaleY)) / f6;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mCurrentTransLateY : ");
        sb2.append(this.mCurrentTransLateY);
        sb2.append("  222");
        this.mCurrentScaleX = 1.0f;
        this.mCurrentScaleY = 1.0f;
        if (this.draggableParams.isValid()) {
            animateToOriginLocation(f2, f3);
            return;
        }
        ActionListener actionListener = this.actionListener;
        if (actionListener != null) {
            actionListener.onExit();
        }
    }

    @gib
    public final ActionListener getActionListener() {
        return this.actionListener;
    }

    @gib
    public final ExitAnimatorCallback getExitCallback() {
        return this.exitCallback;
    }

    public final boolean isAnimating() {
        return this.isAnimating;
    }

    public final boolean onInterceptTouchEvent(boolean z, @yfb MotionEvent motionEvent) {
        md8.checkParameterIsNotNull(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownX = motionEvent.getX();
            this.mDownY = motionEvent.getY();
        } else if (action == 2 && motionEvent.getPointerCount() == 1) {
            float x = motionEvent.getX() - this.mDownX;
            float y = motionEvent.getY() - this.mDownY;
            if (Math.abs(x) > Math.abs(y)) {
                return false;
            }
            if (y > 0) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DraggableZoomCore onInterceptTouchEvent  intercept : ");
        sb.append(z);
        return z;
    }

    public final void onTouchEvent(@yfb MotionEvent motionEvent) {
        md8.checkParameterIsNotNull(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownX = motionEvent.getX();
            this.mDownY = motionEvent.getY();
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (this.mDownX == 0.0f && this.mDownY == 0.0f) {
                this.mDownX = motionEvent.getX();
                this.mDownY = motionEvent.getY();
            }
            onActionMove(motionEvent.getX() - this.mDownX, motionEvent.getY() - this.mDownY);
            return;
        }
        if (motionEvent.getPointerCount() == 1) {
            float f = this.mCurrentScaleY;
            if (f != 1.0f) {
                if (f < 0.85d) {
                    exitWithAnimator(true);
                } else {
                    restoreStatusWithAnimator();
                }
            }
            if (this.mCurrentTransLateY < this.mTargetTranslateY) {
                restoreStatusWithAnimator();
            }
        }
    }

    public final void setAnimating(boolean z) {
        this.isAnimating = z;
    }

    public /* synthetic */ DraggableZoomCore(DraggableParamsInfo draggableParamsInfo, View view, int i, int i2, ActionListener actionListener, ExitAnimatorCallback exitAnimatorCallback, int i3, jt3 jt3Var) {
        this(draggableParamsInfo, view, i, i2, (i3 & 16) != 0 ? null : actionListener, (i3 & 32) != 0 ? null : exitAnimatorCallback);
    }
}
