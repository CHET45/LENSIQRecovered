package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ee1 extends Dialog {

    /* JADX INFO: renamed from: b */
    public static final long f32722b = 250;

    /* JADX INFO: renamed from: c */
    public static final long f32723c = 150;

    /* JADX INFO: renamed from: a */
    public final View f32724a;

    /* JADX INFO: renamed from: ee1$a */
    public class C5269a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f32725a;

        public C5269a(boolean z) {
            this.f32725a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f32725a) {
                return;
            }
            ee1.super.dismiss();
        }
    }

    public ee1(Context context, View view) {
        super(context);
        this.f32724a = view;
    }

    private void startAnimation(boolean z) {
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        long j = z ? 250L : 150L;
        this.f32724a.setScaleX(f);
        this.f32724a.setScaleY(f);
        this.f32724a.animate().scaleX(f2).scaleY(f2).setDuration(j).setInterpolator(new u69()).setListener(new C5269a(z)).start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        startAnimation(false);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // android.app.Dialog
    public void show() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        startAnimation(true);
        super.show();
    }
}
