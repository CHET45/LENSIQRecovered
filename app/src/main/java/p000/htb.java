package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class htb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super vkb<Object>, ? extends wub<?>> f44835b;

    /* JADX INFO: renamed from: htb$a */
    public static final class C7015a<T> extends AtomicInteger implements pxb<T>, lf4 {
        private static final long serialVersionUID = 802743776666017014L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f44836C;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f44837a;

        /* JADX INFO: renamed from: d */
        public final ncg<Object> f44840d;

        /* JADX INFO: renamed from: m */
        public final wub<T> f44843m;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f44838b = new AtomicInteger();

        /* JADX INFO: renamed from: c */
        public final bc0 f44839c = new bc0();

        /* JADX INFO: renamed from: e */
        public final C7015a<T>.a f44841e = new a();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<lf4> f44842f = new AtomicReference<>();

        /* JADX INFO: renamed from: htb$a$a */
        public final class a extends AtomicReference<lf4> implements pxb<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            public a() {
            }

            @Override // p000.pxb
            public void onComplete() {
                C7015a.this.m12603a();
            }

            @Override // p000.pxb
            public void onError(Throwable e) {
                C7015a.this.m12604b(e);
            }

            @Override // p000.pxb
            public void onNext(Object t) {
                C7015a.this.m12605c();
            }

            @Override // p000.pxb
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }
        }

        public C7015a(pxb<? super T> actual, ncg<Object> signaller, wub<T> source) {
            this.f44837a = actual;
            this.f44840d = signaller;
            this.f44843m = source;
        }

        /* JADX INFO: renamed from: a */
        public void m12603a() {
            zf4.dispose(this.f44842f);
            xd7.onComplete(this.f44837a, this, this.f44839c);
        }

        /* JADX INFO: renamed from: b */
        public void m12604b(Throwable ex) {
            zf4.dispose(this.f44842f);
            xd7.onError(this.f44837a, ex, this, this.f44839c);
        }

        /* JADX INFO: renamed from: c */
        public void m12605c() {
            m12606d();
        }

        /* JADX INFO: renamed from: d */
        public void m12606d() {
            if (this.f44838b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f44836C) {
                        this.f44836C = true;
                        this.f44843m.subscribe(this);
                    }
                    if (this.f44838b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this.f44842f);
            zf4.dispose(this.f44841e);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(this.f44842f.get());
        }

        @Override // p000.pxb
        public void onComplete() {
            zf4.replace(this.f44842f, null);
            this.f44836C = false;
            this.f44840d.onNext(0);
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            zf4.dispose(this.f44841e);
            xd7.onError(this.f44837a, e, this, this.f44839c);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            xd7.onNext(this.f44837a, t, this, this.f44839c);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f44842f, d);
        }
    }

    public htb(wub<T> source, sy6<? super vkb<Object>, ? extends wub<?>> handler) {
        super(source);
        this.f44835b = handler;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        ncg<T> serialized = wjd.create().toSerialized();
        try {
            wub<?> wubVarApply = this.f44835b.apply(serialized);
            Objects.requireNonNull(wubVarApply, "The handler returned a null ObservableSource");
            wub<?> wubVar = wubVarApply;
            C7015a c7015a = new C7015a(observer, serialized, this.f63101a);
            observer.onSubscribe(c7015a);
            wubVar.subscribe(c7015a.f44841e);
            c7015a.m12606d();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
