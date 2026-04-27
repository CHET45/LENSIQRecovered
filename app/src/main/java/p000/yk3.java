package p000;

/* JADX INFO: loaded from: classes.dex */
public final class yk3 implements r40<Float, C14294vy> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vk3<Float> f101876a;

    public yk3(@yfb vk3<Float> vk3Var) {
        this.f101876a = vk3Var;
    }

    @Override // p000.r40
    public /* bridge */ /* synthetic */ Object approachAnimation(vre vreVar, Float f, Float f2, qy6<? super Float, bth> qy6Var, zy2 zy2Var) {
        return approachAnimation(vreVar, f.floatValue(), f2.floatValue(), qy6Var, (zy2<? super C9609my<Float, C14294vy>>) zy2Var);
    }

    @gib
    public Object approachAnimation(@yfb vre vreVar, float f, float f2, @yfb qy6<? super Float, bth> qy6Var, @yfb zy2<? super C9609my<Float, C14294vy>> zy2Var) {
        Object objAnimateDecay = ksf.animateDecay(vreVar, f, C12827sy.AnimationState$default(0.0f, f2, 0L, 0L, false, 28, null), this.f101876a, qy6Var, zy2Var);
        return objAnimateDecay == pd8.getCOROUTINE_SUSPENDED() ? objAnimateDecay : (C9609my) objAnimateDecay;
    }
}
