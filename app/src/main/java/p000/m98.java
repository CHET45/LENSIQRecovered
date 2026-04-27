package p000;

/* JADX INFO: loaded from: classes3.dex */
public interface m98 {
    @yfb
    y56<bth> getUpdateNotifications();

    @gib
    Object getVersion(@yfb zy2<? super Integer> zy2Var);

    @gib
    Object incrementAndGetVersion(@yfb zy2<? super Integer> zy2Var);

    @gib
    <T> Object lock(@yfb qy6<? super zy2<? super T>, ? extends Object> qy6Var, @yfb zy2<? super T> zy2Var);

    @gib
    <T> Object tryLock(@yfb gz6<? super Boolean, ? super zy2<? super T>, ? extends Object> gz6Var, @yfb zy2<? super T> zy2Var);
}
