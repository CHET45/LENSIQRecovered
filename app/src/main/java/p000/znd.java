package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class znd<T> implements pxb<T>, bq1 {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f105555a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final lob<T> f105556b;

    /* JADX INFO: renamed from: c */
    public final ynd f105557c;

    public znd(lob<T> lobVar, ynd yndVar) {
        this.f105556b = lobVar;
        this.f105557c = yndVar;
        lobVar.setCancellable(this);
    }

    @Override // p000.bq1
    public synchronized void cancel() {
        this.f105555a.set(true);
    }

    public synchronized boolean isWrappedEmitterUnsubscribed() {
        return this.f105555a.get();
    }

    @Override // p000.pxb
    public void onComplete() {
        this.f105557c.release();
        this.f105556b.onComplete();
    }

    @Override // p000.pxb
    public void onError(Throwable th) {
        this.f105557c.release();
        this.f105556b.tryOnError(th);
    }

    @Override // p000.pxb
    public void onNext(T t) {
        this.f105556b.onNext(t);
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 lf4Var) {
    }
}
