package p000;

import android.animation.Animator;

/* JADX INFO: renamed from: hz */
/* JADX INFO: loaded from: classes5.dex */
public class C7084hz {

    /* JADX INFO: renamed from: a */
    @hib
    public Animator f45281a;

    public void cancelCurrent() {
        Animator animator = this.f45281a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void clear() {
        this.f45281a = null;
    }

    public void onNextAnimationStart(Animator animator) {
        cancelCurrent();
        this.f45281a = animator;
    }
}
