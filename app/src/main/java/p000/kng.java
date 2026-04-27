package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface kng extends s36 {
    static /* synthetic */ Object performFling$suspendImpl(kng kngVar, vre vreVar, float f, zy2<? super Float> zy2Var) {
        return kngVar.performFling(vreVar, f, lng.f58332a, zy2Var);
    }

    @gib
    Object performFling(@yfb vre vreVar, float f, @yfb qy6<? super Float, bth> qy6Var, @yfb zy2<? super Float> zy2Var);

    @Override // p000.s36
    @gib
    default Object performFling(@yfb vre vreVar, float f, @yfb zy2<? super Float> zy2Var) {
        return performFling$suspendImpl(this, vreVar, f, zy2Var);
    }
}
