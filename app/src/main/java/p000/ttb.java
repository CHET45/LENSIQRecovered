package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ttb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final wub<?> f85893b;

    /* JADX INFO: renamed from: c */
    public final boolean f85894c;

    /* JADX INFO: renamed from: ttb$a */
    public static final class C13232a<T> extends AbstractC13234c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        /* JADX INFO: renamed from: e */
        public final AtomicInteger f85895e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f85896f;

        public C13232a(pxb<? super T> actual, wub<?> other) {
            super(actual, other);
            this.f85895e = new AtomicInteger();
        }

        @Override // p000.ttb.AbstractC13234c
        /* JADX INFO: renamed from: a */
        public void mo22828a() {
            this.f85896f = true;
            if (this.f85895e.getAndIncrement() == 0) {
                m22830b();
                this.f85897a.onComplete();
            }
        }

        @Override // p000.ttb.AbstractC13234c
        /* JADX INFO: renamed from: c */
        public void mo22829c() {
            if (this.f85895e.getAndIncrement() == 0) {
                do {
                    boolean z = this.f85896f;
                    m22830b();
                    if (z) {
                        this.f85897a.onComplete();
                        return;
                    }
                } while (this.f85895e.decrementAndGet() != 0);
            }
        }
    }

    /* JADX INFO: renamed from: ttb$b */
    public static final class C13233b<T> extends AbstractC13234c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public C13233b(pxb<? super T> actual, wub<?> other) {
            super(actual, other);
        }

        @Override // p000.ttb.AbstractC13234c
        /* JADX INFO: renamed from: a */
        public void mo22828a() {
            this.f85897a.onComplete();
        }

        @Override // p000.ttb.AbstractC13234c
        /* JADX INFO: renamed from: c */
        public void mo22829c() {
            m22830b();
        }
    }

    /* JADX INFO: renamed from: ttb$c */
    public static abstract class AbstractC13234c<T> extends AtomicReference<T> implements pxb<T>, lf4 {
        private static final long serialVersionUID = -3517602651313910099L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f85897a;

        /* JADX INFO: renamed from: b */
        public final wub<?> f85898b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<lf4> f85899c = new AtomicReference<>();

        /* JADX INFO: renamed from: d */
        public lf4 f85900d;

        public AbstractC13234c(pxb<? super T> actual, wub<?> other) {
            this.f85897a = actual;
            this.f85898b = other;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo22828a();

        /* JADX INFO: renamed from: b */
        public void m22830b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f85897a.onNext(andSet);
            }
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo22829c();

        public void complete() {
            this.f85900d.dispose();
            mo22828a();
        }

        /* JADX INFO: renamed from: d */
        public boolean m22831d(lf4 o) {
            return zf4.setOnce(this.f85899c, o);
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this.f85899c);
            this.f85900d.dispose();
        }

        public void error(Throwable e) {
            this.f85900d.dispose();
            this.f85897a.onError(e);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f85899c.get() == zf4.DISPOSED;
        }

        @Override // p000.pxb
        public void onComplete() {
            zf4.dispose(this.f85899c);
            mo22828a();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            zf4.dispose(this.f85899c);
            this.f85897a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f85900d, d)) {
                this.f85900d = d;
                this.f85897a.onSubscribe(this);
                if (this.f85899c.get() == null) {
                    this.f85898b.subscribe(new C13235d(this));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ttb$d */
    public static final class C13235d<T> implements pxb<Object> {

        /* JADX INFO: renamed from: a */
        public final AbstractC13234c<T> f85901a;

        public C13235d(AbstractC13234c<T> parent) {
            this.f85901a = parent;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f85901a.complete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f85901a.error(t);
        }

        @Override // p000.pxb
        public void onNext(Object t) {
            this.f85901a.mo22829c();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            this.f85901a.m22831d(d);
        }
    }

    public ttb(wub<T> source, wub<?> other, boolean emitLast) {
        super(source);
        this.f85893b = other;
        this.f85894c = emitLast;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        m1f m1fVar = new m1f(t);
        if (this.f85894c) {
            this.f63101a.subscribe(new C13232a(m1fVar, this.f85893b));
        } else {
            this.f63101a.subscribe(new C13233b(m1fVar, this.f85893b));
        }
    }
}
