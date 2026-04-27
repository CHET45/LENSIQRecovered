package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ai6<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f1635b;

    /* JADX INFO: renamed from: c */
    public final zjd<?> f1636c;

    /* JADX INFO: renamed from: d */
    public final boolean f1637d;

    /* JADX INFO: renamed from: ai6$a */
    public static final class C0257a<T> extends AbstractC0259c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f1638f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f1639m;

        public C0257a(ycg<? super T> ycgVar, zjd<?> zjdVar) {
            super(ycgVar, zjdVar);
            this.f1638f = new AtomicInteger();
        }

        @Override // p000.ai6.AbstractC0259c
        /* JADX INFO: renamed from: a */
        public void mo599a() {
            this.f1639m = true;
            if (this.f1638f.getAndIncrement() == 0) {
                m601b();
                this.f1640a.onComplete();
            }
        }

        @Override // p000.ai6.AbstractC0259c
        /* JADX INFO: renamed from: c */
        public void mo600c() {
            if (this.f1638f.getAndIncrement() == 0) {
                do {
                    boolean z = this.f1639m;
                    m601b();
                    if (z) {
                        this.f1640a.onComplete();
                        return;
                    }
                } while (this.f1638f.decrementAndGet() != 0);
            }
        }
    }

    /* JADX INFO: renamed from: ai6$b */
    public static final class C0258b<T> extends AbstractC0259c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public C0258b(ycg<? super T> ycgVar, zjd<?> zjdVar) {
            super(ycgVar, zjdVar);
        }

        @Override // p000.ai6.AbstractC0259c
        /* JADX INFO: renamed from: a */
        public void mo599a() {
            this.f1640a.onComplete();
        }

        @Override // p000.ai6.AbstractC0259c
        /* JADX INFO: renamed from: c */
        public void mo600c() {
            m601b();
        }
    }

    /* JADX INFO: renamed from: ai6$c */
    public static abstract class AbstractC0259c<T> extends AtomicReference<T> implements lj6<T>, fdg {
        private static final long serialVersionUID = -3517602651313910099L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f1640a;

        /* JADX INFO: renamed from: b */
        public final zjd<?> f1641b;

        /* JADX INFO: renamed from: c */
        public final AtomicLong f1642c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final AtomicReference<fdg> f1643d = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public fdg f1644e;

        public AbstractC0259c(ycg<? super T> ycgVar, zjd<?> zjdVar) {
            this.f1640a = ycgVar;
            this.f1641b = zjdVar;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo599a();

        /* JADX INFO: renamed from: b */
        public void m601b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.f1642c.get() != 0) {
                    this.f1640a.onNext(andSet);
                    so0.produced(this.f1642c, 1L);
                } else {
                    cancel();
                    this.f1640a.onError(new cwa("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo600c();

        @Override // p000.fdg
        public void cancel() {
            mdg.cancel(this.f1643d);
            this.f1644e.cancel();
        }

        public void complete() {
            this.f1644e.cancel();
            mo599a();
        }

        /* JADX INFO: renamed from: d */
        public void m602d(fdg fdgVar) {
            mdg.setOnce(this.f1643d, fdgVar, Long.MAX_VALUE);
        }

        public void error(Throwable th) {
            this.f1644e.cancel();
            this.f1640a.onError(th);
        }

        @Override // p000.ycg
        public void onComplete() {
            mdg.cancel(this.f1643d);
            mo599a();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            mdg.cancel(this.f1643d);
            this.f1640a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f1644e, fdgVar)) {
                this.f1644e = fdgVar;
                this.f1640a.onSubscribe(this);
                if (this.f1643d.get() == null) {
                    this.f1641b.subscribe(new C0260d(this));
                    fdgVar.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f1642c, j);
            }
        }
    }

    /* JADX INFO: renamed from: ai6$d */
    public static final class C0260d<T> implements lj6<Object> {

        /* JADX INFO: renamed from: a */
        public final AbstractC0259c<T> f1645a;

        public C0260d(AbstractC0259c<T> abstractC0259c) {
            this.f1645a = abstractC0259c;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f1645a.complete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f1645a.error(th);
        }

        @Override // p000.ycg
        public void onNext(Object obj) {
            this.f1645a.mo600c();
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            this.f1645a.m602d(fdgVar);
        }
    }

    public ai6(zjd<T> zjdVar, zjd<?> zjdVar2, boolean z) {
        this.f1635b = zjdVar;
        this.f1636c = zjdVar2;
        this.f1637d = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        t1f t1fVar = new t1f(ycgVar);
        if (this.f1637d) {
            this.f1635b.subscribe(new C0257a(t1fVar, this.f1636c));
        } else {
            this.f1635b.subscribe(new C0258b(t1fVar, this.f1636c));
        }
    }
}
