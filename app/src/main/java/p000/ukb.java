package p000;

/* JADX INFO: loaded from: classes6.dex */
public interface ukb<T> {
    @Deprecated
    void broadcast(T t);

    void broadcast(T t, boolean z, boolean z2);

    void observe(@efb g59 g59Var, @efb qxb<T> qxbVar);

    void observeForever(@efb qxb<T> qxbVar);

    void observeSticky(@efb g59 g59Var, @efb qxb<T> qxbVar);

    void observeStickyForever(@efb qxb<T> qxbVar);

    void post(T t);

    void postAcrossApp(T t);

    void postAcrossProcess(T t);

    void postDelay(g59 g59Var, T t, long j);

    void postDelay(T t, long j);

    void postOrderly(T t);

    void removeObserver(@efb qxb<T> qxbVar);
}
