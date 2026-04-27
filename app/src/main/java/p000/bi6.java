package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class bi6<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f13782b;

    /* JADX INFO: renamed from: c */
    public final zjd<?> f13783c;

    /* JADX INFO: renamed from: d */
    public final boolean f13784d;

    /* JADX INFO: renamed from: bi6$a */
    public static final class C1909a<T> extends AbstractC1911c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f13785f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f13786m;

        public C1909a(ycg<? super T> actual, zjd<?> other) {
            super(actual, other);
            this.f13785f = new AtomicInteger();
        }

        @Override // p000.bi6.AbstractC1911c
        /* JADX INFO: renamed from: a */
        public void mo3184a() {
            this.f13786m = true;
            if (this.f13785f.getAndIncrement() == 0) {
                m3186b();
                this.f13787a.onComplete();
            }
        }

        @Override // p000.bi6.AbstractC1911c
        /* JADX INFO: renamed from: c */
        public void mo3185c() {
            if (this.f13785f.getAndIncrement() == 0) {
                do {
                    boolean z = this.f13786m;
                    m3186b();
                    if (z) {
                        this.f13787a.onComplete();
                        return;
                    }
                } while (this.f13785f.decrementAndGet() != 0);
            }
        }
    }

    /* JADX INFO: renamed from: bi6$b */
    public static final class C1910b<T> extends AbstractC1911c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public C1910b(ycg<? super T> actual, zjd<?> other) {
            super(actual, other);
        }

        @Override // p000.bi6.AbstractC1911c
        /* JADX INFO: renamed from: a */
        public void mo3184a() {
            this.f13787a.onComplete();
        }

        @Override // p000.bi6.AbstractC1911c
        /* JADX INFO: renamed from: c */
        public void mo3185c() {
            m3186b();
        }
    }

    /* JADX INFO: renamed from: bi6$c */
    public static abstract class AbstractC1911c<T> extends AtomicReference<T> implements kj6<T>, fdg {
        private static final long serialVersionUID = -3517602651313910099L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f13787a;

        /* JADX INFO: renamed from: b */
        public final zjd<?> f13788b;

        /* JADX INFO: renamed from: c */
        public final AtomicLong f13789c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final AtomicReference<fdg> f13790d = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public fdg f13791e;

        public AbstractC1911c(ycg<? super T> actual, zjd<?> other) {
            this.f13787a = actual;
            this.f13788b = other;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo3184a();

        /* JADX INFO: renamed from: b */
        public void m3186b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.f13789c.get() != 0) {
                    this.f13787a.onNext(andSet);
                    ro0.produced(this.f13789c, 1L);
                } else {
                    cancel();
                    this.f13787a.onError(new bwa("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo3185c();

        @Override // p000.fdg
        public void cancel() {
            ldg.cancel(this.f13790d);
            this.f13791e.cancel();
        }

        public void complete() {
            this.f13791e.cancel();
            mo3184a();
        }

        /* JADX INFO: renamed from: d */
        public void m3187d(fdg o) {
            ldg.setOnce(this.f13790d, o, Long.MAX_VALUE);
        }

        public void error(Throwable e) {
            this.f13791e.cancel();
            this.f13787a.onError(e);
        }

        @Override // p000.ycg
        public void onComplete() {
            ldg.cancel(this.f13790d);
            mo3184a();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            ldg.cancel(this.f13790d);
            this.f13787a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f13791e, s)) {
                this.f13791e = s;
                this.f13787a.onSubscribe(this);
                if (this.f13790d.get() == null) {
                    this.f13788b.subscribe(new C1912d(this));
                    s.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f13789c, n);
            }
        }
    }

    /* JADX INFO: renamed from: bi6$d */
    public static final class C1912d<T> implements kj6<Object> {

        /* JADX INFO: renamed from: a */
        public final AbstractC1911c<T> f13792a;

        public C1912d(AbstractC1911c<T> parent) {
            this.f13792a = parent;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f13792a.complete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f13792a.error(t);
        }

        @Override // p000.ycg
        public void onNext(Object t) {
            this.f13792a.mo3185c();
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            this.f13792a.m3187d(s);
        }
    }

    public bi6(zjd<T> source, zjd<?> other, boolean emitLast) {
        this.f13782b = source;
        this.f13783c = other;
        this.f13784d = emitLast;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        u1f u1fVar = new u1f(s);
        if (this.f13784d) {
            this.f13782b.subscribe(new C1909a(u1fVar, this.f13783c));
        } else {
            this.f13782b.subscribe(new C1910b(u1fVar, this.f13783c));
        }
    }
}
