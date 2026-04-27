package p000;

import android.animation.Animator;
import p000.InterfaceC14278vw;

/* JADX INFO: loaded from: classes5.dex */
public abstract class rz7<T extends Animator> {

    /* JADX INFO: renamed from: a */
    public sz7 f80181a;

    /* JADX INFO: renamed from: b */
    public final float[] f80182b;

    /* JADX INFO: renamed from: c */
    public final int[] f80183c;

    public rz7(int i) {
        this.f80182b = new float[i * 2];
        this.f80183c = new int[i];
    }

    /* JADX INFO: renamed from: a */
    public float m21614a(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    /* JADX INFO: renamed from: b */
    public void m21615b(@efb sz7 sz7Var) {
        this.f80181a = sz7Var;
    }

    public abstract void cancelAnimatorImmediately();

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(@efb InterfaceC14278vw.a aVar);

    public abstract void requestCancelAnimatorAfterCurrentCycle();

    public abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}
