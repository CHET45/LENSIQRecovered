package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class iwb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f48675b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f48676c;

    /* JADX INFO: renamed from: d */
    public final woe f48677d;

    /* JADX INFO: renamed from: e */
    public final wub<? extends T> f48678e;

    /* JADX INFO: renamed from: iwb$a */
    public static final class C7639a<T> implements pxb<T> {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f48679a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<lf4> f48680b;

        public C7639a(pxb<? super T> actual, AtomicReference<lf4> arbiter) {
            this.f48679a = actual;
            this.f48680b = arbiter;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f48679a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f48679a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f48679a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.replace(this.f48680b, d);
        }
    }

    /* JADX INFO: renamed from: iwb$b */
    public static final class C7640b<T> extends AtomicReference<lf4> implements pxb<T>, lf4, InterfaceC7642d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: C */
        public wub<? extends T> f48681C;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f48682a;

        /* JADX INFO: renamed from: b */
        public final long f48683b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f48684c;

        /* JADX INFO: renamed from: d */
        public final woe.AbstractC14729c f48685d;

        /* JADX INFO: renamed from: e */
        public final a0f f48686e = new a0f();

        /* JADX INFO: renamed from: f */
        public final AtomicLong f48687f = new AtomicLong();

        /* JADX INFO: renamed from: m */
        public final AtomicReference<lf4> f48688m = new AtomicReference<>();

        public C7640b(pxb<? super T> actual, long timeout, TimeUnit unit, woe.AbstractC14729c worker, wub<? extends T> fallback) {
            this.f48682a = actual;
            this.f48683b = timeout;
            this.f48684c = unit;
            this.f48685d = worker;
            this.f48681C = fallback;
        }

        /* JADX INFO: renamed from: a */
        public void m13489a(long nextIndex) {
            this.f48686e.replace(this.f48685d.schedule(new RunnableC7643e(nextIndex, this), this.f48683b, this.f48684c));
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this.f48688m);
            zf4.dispose(this);
            this.f48685d.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f48687f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f48686e.dispose();
                this.f48682a.onComplete();
                this.f48685d.dispose();
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f48687f.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                ofe.onError(t);
                return;
            }
            this.f48686e.dispose();
            this.f48682a.onError(t);
            this.f48685d.dispose();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            long j = this.f48687f.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.f48687f.compareAndSet(j, j2)) {
                    this.f48686e.get().dispose();
                    this.f48682a.onNext(t);
                    m13489a(j2);
                }
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f48688m, d);
        }

        @Override // p000.iwb.InterfaceC7642d
        public void onTimeout(long idx) {
            if (this.f48687f.compareAndSet(idx, Long.MAX_VALUE)) {
                zf4.dispose(this.f48688m);
                wub<? extends T> wubVar = this.f48681C;
                this.f48681C = null;
                wubVar.subscribe(new C7639a(this.f48682a, this));
                this.f48685d.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: iwb$c */
    public static final class C7641c<T> extends AtomicLong implements pxb<T>, lf4, InterfaceC7642d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f48689a;

        /* JADX INFO: renamed from: b */
        public final long f48690b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f48691c;

        /* JADX INFO: renamed from: d */
        public final woe.AbstractC14729c f48692d;

        /* JADX INFO: renamed from: e */
        public final a0f f48693e = new a0f();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<lf4> f48694f = new AtomicReference<>();

        public C7641c(pxb<? super T> actual, long timeout, TimeUnit unit, woe.AbstractC14729c worker) {
            this.f48689a = actual;
            this.f48690b = timeout;
            this.f48691c = unit;
            this.f48692d = worker;
        }

        /* JADX INFO: renamed from: a */
        public void m13490a(long nextIndex) {
            this.f48693e.replace(this.f48692d.schedule(new RunnableC7643e(nextIndex, this), this.f48690b, this.f48691c));
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this.f48694f);
            this.f48692d.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(this.f48694f.get());
        }

        @Override // p000.pxb
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f48693e.dispose();
                this.f48689a.onComplete();
                this.f48692d.dispose();
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                ofe.onError(t);
                return;
            }
            this.f48693e.dispose();
            this.f48689a.onError(t);
            this.f48692d.dispose();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    this.f48693e.get().dispose();
                    this.f48689a.onNext(t);
                    m13490a(j2);
                }
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f48694f, d);
        }

        @Override // p000.iwb.InterfaceC7642d
        public void onTimeout(long idx) {
            if (compareAndSet(idx, Long.MAX_VALUE)) {
                zf4.dispose(this.f48694f);
                this.f48689a.onError(new TimeoutException(k75.timeoutMessage(this.f48690b, this.f48691c)));
                this.f48692d.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: iwb$d */
    public interface InterfaceC7642d {
        void onTimeout(long idx);
    }

    /* JADX INFO: renamed from: iwb$e */
    public static final class RunnableC7643e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC7642d f48695a;

        /* JADX INFO: renamed from: b */
        public final long f48696b;

        public RunnableC7643e(long idx, InterfaceC7642d parent) {
            this.f48696b = idx;
            this.f48695a = parent;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f48695a.onTimeout(this.f48696b);
        }
    }

    public iwb(vkb<T> source, long timeout, TimeUnit unit, woe scheduler, wub<? extends T> other) {
        super(source);
        this.f48675b = timeout;
        this.f48676c = unit;
        this.f48677d = scheduler;
        this.f48678e = other;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        if (this.f48678e == null) {
            C7641c c7641c = new C7641c(observer, this.f48675b, this.f48676c, this.f48677d.createWorker());
            observer.onSubscribe(c7641c);
            c7641c.m13490a(0L);
            this.f63101a.subscribe(c7641c);
            return;
        }
        C7640b c7640b = new C7640b(observer, this.f48675b, this.f48676c, this.f48677d.createWorker(), this.f48678e);
        observer.onSubscribe(c7640b);
        c7640b.m13489a(0L);
        this.f63101a.subscribe(c7640b);
    }
}
