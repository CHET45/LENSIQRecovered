package p000;

/* JADX INFO: loaded from: classes.dex */
public final class pmg implements r40<Float, C14294vy> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final InterfaceC11178py<Float> f71411a;

    public pmg(@yfb InterfaceC11178py<Float> interfaceC11178py) {
        this.f71411a = interfaceC11178py;
    }

    @Override // p000.r40
    public /* bridge */ /* synthetic */ Object approachAnimation(vre vreVar, Float f, Float f2, qy6<? super Float, bth> qy6Var, zy2 zy2Var) {
        return approachAnimation(vreVar, f.floatValue(), f2.floatValue(), qy6Var, (zy2<? super C9609my<Float, C14294vy>>) zy2Var);
    }

    @gib
    public Object approachAnimation(@yfb vre vreVar, float f, float f2, @yfb qy6<? super Float, bth> qy6Var, @yfb zy2<? super C9609my<Float, C14294vy>> zy2Var) {
        Object objAnimateWithTarget = ksf.animateWithTarget(vreVar, Math.abs(f) * Math.signum(f2), f, C12827sy.AnimationState$default(0.0f, f2, 0L, 0L, false, 28, null), this.f71411a, qy6Var, zy2Var);
        return objAnimateWithTarget == pd8.getCOROUTINE_SUSPENDED() ? objAnimateWithTarget : (C9609my) objAnimateWithTarget;
    }
}
