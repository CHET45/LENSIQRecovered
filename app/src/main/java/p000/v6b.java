package p000;

/* JADX INFO: loaded from: classes7.dex */
@jcg(markerClass = zg5.class)
public interface v6b<T> extends q9f<T>, t66<T> {
    @Override // p000.t66
    @gib
    Object emit(T t, @yfb zy2<? super bth> zy2Var);

    @yfb
    l2g<Integer> getSubscriptionCount();

    @wg5
    void resetReplayCache();

    boolean tryEmit(T t);
}
