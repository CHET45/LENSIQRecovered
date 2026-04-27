package p000;

import p000.vtb;

/* JADX INFO: loaded from: classes7.dex */
public final class uqb<T> extends vkb<T> implements lme<T> {

    /* JADX INFO: renamed from: a */
    public final T f88807a;

    public uqb(final T value) {
        this.f88807a = value;
    }

    @Override // p000.lme, p000.nfg
    public T get() {
        return this.f88807a;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        vtb.RunnableC14256a runnableC14256a = new vtb.RunnableC14256a(observer, this.f88807a);
        observer.onSubscribe(runnableC14256a);
        runnableC14256a.run();
    }
}
