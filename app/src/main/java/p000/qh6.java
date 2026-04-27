package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class qh6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final py6<? super m86<Object>, ? extends zjd<?>> f74451c;

    /* JADX INFO: renamed from: qh6$a */
    public static final class C11478a<T> extends AbstractC11480c<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        public C11478a(ycg<? super T> ycgVar, rg6<Object> rg6Var, fdg fdgVar) {
            super(ycgVar, rg6Var, fdgVar);
        }

        @Override // p000.ycg
        public void onComplete() {
            m20365c(0);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f74458L.cancel();
            this.f74456F.onError(th);
        }
    }

    /* JADX INFO: renamed from: qh6$b */
    public static final class C11479b<T, U> extends AtomicInteger implements lj6<Object>, fdg {
        private static final long serialVersionUID = 2827772011130406689L;

        /* JADX INFO: renamed from: a */
        public final zjd<T> f74452a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<fdg> f74453b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f74454c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public AbstractC11480c<T, U> f74455d;

        public C11479b(zjd<T> zjdVar) {
            this.f74452a = zjdVar;
        }

        @Override // p000.fdg
        public void cancel() {
            mdg.cancel(this.f74453b);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f74455d.cancel();
            this.f74455d.f74456F.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f74455d.cancel();
            this.f74455d.f74456F.onError(th);
        }

        @Override // p000.ycg
        public void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.f74453b.get() != mdg.CANCELLED) {
                    this.f74452a.subscribe(this.f74455d);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.deferredSetOnce(this.f74453b, this.f74454c, fdgVar);
        }

        @Override // p000.fdg
        public void request(long j) {
            mdg.deferredRequest(this.f74453b, this.f74454c, j);
        }
    }

    /* JADX INFO: renamed from: qh6$c */
    public static abstract class AbstractC11480c<T, U> extends hdg implements lj6<T> {
        private static final long serialVersionUID = -5604623027276966720L;

        /* JADX INFO: renamed from: F */
        public final ycg<? super T> f74456F;

        /* JADX INFO: renamed from: H */
        public final rg6<U> f74457H;

        /* JADX INFO: renamed from: L */
        public final fdg f74458L;

        /* JADX INFO: renamed from: M */
        public long f74459M;

        public AbstractC11480c(ycg<? super T> ycgVar, rg6<U> rg6Var, fdg fdgVar) {
            super(false);
            this.f74456F = ycgVar;
            this.f74457H = rg6Var;
            this.f74458L = fdgVar;
        }

        /* JADX INFO: renamed from: c */
        public final void m20365c(U u) {
            setSubscription(x05.INSTANCE);
            long j = this.f74459M;
            if (j != 0) {
                this.f74459M = 0L;
                produced(j);
            }
            this.f74458L.request(1L);
            this.f74457H.onNext(u);
        }

        @Override // p000.hdg, p000.fdg
        public final void cancel() {
            super.cancel();
            this.f74458L.cancel();
        }

        @Override // p000.ycg
        public final void onNext(T t) {
            this.f74459M++;
            this.f74456F.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public final void onSubscribe(fdg fdgVar) {
            setSubscription(fdgVar);
        }
    }

    public qh6(m86<T> m86Var, py6<? super m86<Object>, ? extends zjd<?>> py6Var) {
        super(m86Var);
        this.f74451c = py6Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        t1f t1fVar = new t1f(ycgVar);
        rg6<T> serialized = msh.create(8).toSerialized();
        try {
            zjd zjdVar = (zjd) xjb.requireNonNull(this.f74451c.apply(serialized), "handler returned a null Publisher");
            C11479b c11479b = new C11479b(this.f52360b);
            C11478a c11478a = new C11478a(t1fVar, serialized, c11479b);
            c11479b.f74455d = c11478a;
            ycgVar.onSubscribe(c11478a);
            zjdVar.subscribe(c11479b);
            c11479b.onNext(0);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            x05.error(th, ycgVar);
        }
    }
}
