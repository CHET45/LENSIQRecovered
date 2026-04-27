package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ptb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super vkb<Throwable>, ? extends wub<?>> f71991b;

    /* JADX INFO: renamed from: ptb$a */
    public static final class C11115a<T> extends AtomicInteger implements pxb<T>, lf4 {
        private static final long serialVersionUID = 802743776666017014L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f71992C;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f71993a;

        /* JADX INFO: renamed from: d */
        public final ncg<Throwable> f71996d;

        /* JADX INFO: renamed from: m */
        public final wub<T> f71999m;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f71994b = new AtomicInteger();

        /* JADX INFO: renamed from: c */
        public final bc0 f71995c = new bc0();

        /* JADX INFO: renamed from: e */
        public final C11115a<T>.a f71997e = new a();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<lf4> f71998f = new AtomicReference<>();

        /* JADX INFO: renamed from: ptb$a$a */
        public final class a extends AtomicReference<lf4> implements pxb<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            public a() {
            }

            @Override // p000.pxb
            public void onComplete() {
                C11115a.this.m19762a();
            }

            @Override // p000.pxb
            public void onError(Throwable e) {
                C11115a.this.m19763b(e);
            }

            @Override // p000.pxb
            public void onNext(Object t) {
                C11115a.this.m19764c();
            }

            @Override // p000.pxb
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }
        }

        public C11115a(pxb<? super T> actual, ncg<Throwable> signaller, wub<T> source) {
            this.f71993a = actual;
            this.f71996d = signaller;
            this.f71999m = source;
        }

        /* JADX INFO: renamed from: a */
        public void m19762a() {
            zf4.dispose(this.f71998f);
            xd7.onComplete(this.f71993a, this, this.f71995c);
        }

        /* JADX INFO: renamed from: b */
        public void m19763b(Throwable ex) {
            zf4.dispose(this.f71998f);
            xd7.onError(this.f71993a, ex, this, this.f71995c);
        }

        /* JADX INFO: renamed from: c */
        public void m19764c() {
            m19765d();
        }

        /* JADX INFO: renamed from: d */
        public void m19765d() {
            if (this.f71994b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f71992C) {
                        this.f71992C = true;
                        this.f71999m.subscribe(this);
                    }
                    if (this.f71994b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this.f71998f);
            zf4.dispose(this.f71997e);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(this.f71998f.get());
        }

        @Override // p000.pxb
        public void onComplete() {
            zf4.dispose(this.f71997e);
            xd7.onComplete(this.f71993a, this, this.f71995c);
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            zf4.replace(this.f71998f, null);
            this.f71992C = false;
            this.f71996d.onNext(e);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            xd7.onNext(this.f71993a, t, this, this.f71995c);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.replace(this.f71998f, d);
        }
    }

    public ptb(wub<T> source, sy6<? super vkb<Throwable>, ? extends wub<?>> handler) {
        super(source);
        this.f71991b = handler;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        ncg<T> serialized = wjd.create().toSerialized();
        try {
            wub<?> wubVarApply = this.f71991b.apply(serialized);
            Objects.requireNonNull(wubVarApply, "The handler returned a null ObservableSource");
            wub<?> wubVar = wubVarApply;
            C11115a c11115a = new C11115a(observer, serialized, this.f63101a);
            observer.onSubscribe(c11115a);
            wubVar.subscribe(c11115a.f71997e);
            c11115a.m19765d();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
