package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class otb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final py6<? super Observable<Throwable>, ? extends xub<?>> f68723b;

    /* JADX INFO: renamed from: otb$a */
    public static final class C10653a<T> extends AtomicInteger implements oxb<T>, mf4 {
        private static final long serialVersionUID = 802743776666017014L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f68724C;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f68725a;

        /* JADX INFO: renamed from: d */
        public final mcg<Throwable> f68728d;

        /* JADX INFO: renamed from: m */
        public final xub<T> f68731m;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f68726b = new AtomicInteger();

        /* JADX INFO: renamed from: c */
        public final cc0 f68727c = new cc0();

        /* JADX INFO: renamed from: e */
        public final C10653a<T>.a f68729e = new a();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<mf4> f68730f = new AtomicReference<>();

        /* JADX INFO: renamed from: otb$a$a */
        public final class a extends AtomicReference<mf4> implements oxb<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            public a() {
            }

            @Override // p000.oxb
            public void onComplete() {
                C10653a.this.m18989a();
            }

            @Override // p000.oxb
            public void onError(Throwable th) {
                C10653a.this.m18990b(th);
            }

            @Override // p000.oxb
            public void onNext(Object obj) {
                C10653a.this.m18991c();
            }

            @Override // p000.oxb
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }
        }

        public C10653a(oxb<? super T> oxbVar, mcg<Throwable> mcgVar, xub<T> xubVar) {
            this.f68725a = oxbVar;
            this.f68728d = mcgVar;
            this.f68731m = xubVar;
        }

        /* JADX INFO: renamed from: a */
        public void m18989a() {
            ag4.dispose(this.f68730f);
            yd7.onComplete(this.f68725a, this, this.f68727c);
        }

        /* JADX INFO: renamed from: b */
        public void m18990b(Throwable th) {
            ag4.dispose(this.f68730f);
            yd7.onError(this.f68725a, th, this, this.f68727c);
        }

        /* JADX INFO: renamed from: c */
        public void m18991c() {
            m18992d();
        }

        /* JADX INFO: renamed from: d */
        public void m18992d() {
            if (this.f68726b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f68724C) {
                        this.f68724C = true;
                        this.f68731m.subscribe(this);
                    }
                    if (this.f68726b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this.f68730f);
            ag4.dispose(this.f68729e);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(this.f68730f.get());
        }

        @Override // p000.oxb
        public void onComplete() {
            ag4.dispose(this.f68729e);
            yd7.onComplete(this.f68725a, this, this.f68727c);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            ag4.replace(this.f68730f, null);
            this.f68724C = false;
            this.f68728d.onNext(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            yd7.onNext(this.f68725a, t, this, this.f68727c);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.replace(this.f68730f, mf4Var);
        }
    }

    public otb(xub<T> xubVar, py6<? super Observable<Throwable>, ? extends xub<?>> py6Var) {
        super(xubVar);
        this.f68723b = py6Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        mcg<T> serialized = xjd.create().toSerialized();
        try {
            xub xubVar = (xub) xjb.requireNonNull(this.f68723b.apply(serialized), "The handler returned a null ObservableSource");
            C10653a c10653a = new C10653a(oxbVar, serialized, this.f66354a);
            oxbVar.onSubscribe(c10653a);
            xubVar.subscribe(c10653a.f68729e);
            c10653a.m18992d();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, oxbVar);
        }
    }
}
