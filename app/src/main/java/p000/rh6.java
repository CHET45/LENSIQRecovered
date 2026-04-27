package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class rh6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super l86<Object>, ? extends zjd<?>> f78302c;

    /* JADX INFO: renamed from: rh6$a */
    public static final class C12092a<T> extends AbstractC12094c<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        public C12092a(ycg<? super T> actual, qg6<Object> processor, fdg receiver) {
            super(actual, processor, receiver);
        }

        @Override // p000.ycg
        public void onComplete() {
            m21360c(0);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f78309L.cancel();
            this.f78307F.onError(t);
        }
    }

    /* JADX INFO: renamed from: rh6$b */
    public static final class C12093b<T, U> extends AtomicInteger implements kj6<Object>, fdg {
        private static final long serialVersionUID = 2827772011130406689L;

        /* JADX INFO: renamed from: a */
        public final zjd<T> f78303a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<fdg> f78304b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f78305c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public AbstractC12094c<T, U> f78306d;

        public C12093b(zjd<T> source) {
            this.f78303a = source;
        }

        @Override // p000.fdg
        public void cancel() {
            ldg.cancel(this.f78304b);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f78306d.cancel();
            this.f78306d.f78307F.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f78306d.cancel();
            this.f78306d.f78307F.onError(t);
        }

        @Override // p000.ycg
        public void onNext(Object t) {
            if (getAndIncrement() == 0) {
                while (this.f78304b.get() != ldg.CANCELLED) {
                    this.f78303a.subscribe(this.f78306d);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.deferredSetOnce(this.f78304b, this.f78305c, s);
        }

        @Override // p000.fdg
        public void request(long n) {
            ldg.deferredRequest(this.f78304b, this.f78305c, n);
        }
    }

    /* JADX INFO: renamed from: rh6$c */
    public static abstract class AbstractC12094c<T, U> extends gdg implements kj6<T> {
        private static final long serialVersionUID = -5604623027276966720L;

        /* JADX INFO: renamed from: F */
        public final ycg<? super T> f78307F;

        /* JADX INFO: renamed from: H */
        public final qg6<U> f78308H;

        /* JADX INFO: renamed from: L */
        public final fdg f78309L;

        /* JADX INFO: renamed from: M */
        public long f78310M;

        public AbstractC12094c(ycg<? super T> actual, qg6<U> processor, fdg receiver) {
            super(false);
            this.f78307F = actual;
            this.f78308H = processor;
            this.f78309L = receiver;
        }

        /* JADX INFO: renamed from: c */
        public final void m21360c(U signal) {
            setSubscription(w05.INSTANCE);
            long j = this.f78310M;
            if (j != 0) {
                this.f78310M = 0L;
                produced(j);
            }
            this.f78309L.request(1L);
            this.f78308H.onNext(signal);
        }

        @Override // p000.gdg, p000.fdg
        public final void cancel() {
            super.cancel();
            this.f78309L.cancel();
        }

        @Override // p000.ycg
        public final void onNext(T t) {
            this.f78310M++;
            this.f78307F.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public final void onSubscribe(fdg s) {
            setSubscription(s);
        }
    }

    public rh6(l86<T> source, sy6<? super l86<Object>, ? extends zjd<?>> handler) {
        super(source);
        this.f78302c = handler;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        u1f u1fVar = new u1f(s);
        qg6<T> serialized = nsh.create(8).toSerialized();
        try {
            zjd<?> zjdVarApply = this.f78302c.apply(serialized);
            Objects.requireNonNull(zjdVarApply, "handler returned a null Publisher");
            zjd<?> zjdVar = zjdVarApply;
            C12093b c12093b = new C12093b(this.f49321b);
            C12092a c12092a = new C12092a(u1fVar, serialized, c12093b);
            c12093b.f78306d = c12092a;
            s.onSubscribe(c12092a);
            zjdVar.subscribe(c12093b);
            c12093b.onNext(0);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            w05.error(th, s);
        }
    }
}
