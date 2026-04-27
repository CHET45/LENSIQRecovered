package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class uvb<T, U> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final wub<? extends U> f89230b;

    /* JADX INFO: renamed from: uvb$a */
    public static final class C13741a<T, U> extends AtomicInteger implements pxb<T>, lf4 {
        private static final long serialVersionUID = 1418547743690811973L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f89231a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<lf4> f89232b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final C13741a<T, U>.a f89233c = new a();

        /* JADX INFO: renamed from: d */
        public final bc0 f89234d = new bc0();

        /* JADX INFO: renamed from: uvb$a$a */
        public final class a extends AtomicReference<lf4> implements pxb<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            public a() {
            }

            @Override // p000.pxb
            public void onComplete() {
                C13741a.this.m23605a();
            }

            @Override // p000.pxb
            public void onError(Throwable e) {
                C13741a.this.m23606b(e);
            }

            @Override // p000.pxb
            public void onNext(U t) {
                zf4.dispose(this);
                C13741a.this.m23605a();
            }

            @Override // p000.pxb
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }
        }

        public C13741a(pxb<? super T> downstream) {
            this.f89231a = downstream;
        }

        /* JADX INFO: renamed from: a */
        public void m23605a() {
            zf4.dispose(this.f89232b);
            xd7.onComplete(this.f89231a, this, this.f89234d);
        }

        /* JADX INFO: renamed from: b */
        public void m23606b(Throwable e) {
            zf4.dispose(this.f89232b);
            xd7.onError(this.f89231a, e, this, this.f89234d);
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this.f89232b);
            zf4.dispose(this.f89233c);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(this.f89232b.get());
        }

        @Override // p000.pxb
        public void onComplete() {
            zf4.dispose(this.f89233c);
            xd7.onComplete(this.f89231a, this, this.f89234d);
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            zf4.dispose(this.f89233c);
            xd7.onError(this.f89231a, e, this, this.f89234d);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            xd7.onNext(this.f89231a, t, this, this.f89234d);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f89232b, d);
        }
    }

    public uvb(wub<T> source, wub<? extends U> other) {
        super(source);
        this.f89230b = other;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> child) {
        C13741a c13741a = new C13741a(child);
        child.onSubscribe(c13741a);
        this.f89230b.subscribe(c13741a.f89233c);
        this.f63101a.subscribe(c13741a);
    }
}
