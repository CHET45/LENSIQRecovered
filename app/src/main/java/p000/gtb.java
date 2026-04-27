package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class gtb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final py6<? super Observable<Object>, ? extends xub<?>> f41044b;

    /* JADX INFO: renamed from: gtb$a */
    public static final class C6532a<T> extends AtomicInteger implements oxb<T>, mf4 {
        private static final long serialVersionUID = 802743776666017014L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f41045C;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f41046a;

        /* JADX INFO: renamed from: d */
        public final mcg<Object> f41049d;

        /* JADX INFO: renamed from: m */
        public final xub<T> f41052m;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f41047b = new AtomicInteger();

        /* JADX INFO: renamed from: c */
        public final cc0 f41048c = new cc0();

        /* JADX INFO: renamed from: e */
        public final C6532a<T>.a f41050e = new a();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<mf4> f41051f = new AtomicReference<>();

        /* JADX INFO: renamed from: gtb$a$a */
        public final class a extends AtomicReference<mf4> implements oxb<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            public a() {
            }

            @Override // p000.oxb
            public void onComplete() {
                C6532a.this.m11966a();
            }

            @Override // p000.oxb
            public void onError(Throwable th) {
                C6532a.this.m11967b(th);
            }

            @Override // p000.oxb
            public void onNext(Object obj) {
                C6532a.this.m11968c();
            }

            @Override // p000.oxb
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }
        }

        public C6532a(oxb<? super T> oxbVar, mcg<Object> mcgVar, xub<T> xubVar) {
            this.f41046a = oxbVar;
            this.f41049d = mcgVar;
            this.f41052m = xubVar;
        }

        /* JADX INFO: renamed from: a */
        public void m11966a() {
            ag4.dispose(this.f41051f);
            yd7.onComplete(this.f41046a, this, this.f41048c);
        }

        /* JADX INFO: renamed from: b */
        public void m11967b(Throwable th) {
            ag4.dispose(this.f41051f);
            yd7.onError(this.f41046a, th, this, this.f41048c);
        }

        /* JADX INFO: renamed from: c */
        public void m11968c() {
            m11969d();
        }

        /* JADX INFO: renamed from: d */
        public void m11969d() {
            if (this.f41047b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f41045C) {
                        this.f41045C = true;
                        this.f41052m.subscribe(this);
                    }
                    if (this.f41047b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this.f41051f);
            ag4.dispose(this.f41050e);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(this.f41051f.get());
        }

        @Override // p000.oxb
        public void onComplete() {
            ag4.replace(this.f41051f, null);
            this.f41045C = false;
            this.f41049d.onNext(0);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            ag4.dispose(this.f41050e);
            yd7.onError(this.f41046a, th, this, this.f41048c);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            yd7.onNext(this.f41046a, t, this, this.f41048c);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f41051f, mf4Var);
        }
    }

    public gtb(xub<T> xubVar, py6<? super Observable<Object>, ? extends xub<?>> py6Var) {
        super(xubVar);
        this.f41044b = py6Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        mcg<T> serialized = xjd.create().toSerialized();
        try {
            xub xubVar = (xub) xjb.requireNonNull(this.f41044b.apply(serialized), "The handler returned a null ObservableSource");
            C6532a c6532a = new C6532a(oxbVar, serialized, this.f66354a);
            oxbVar.onSubscribe(c6532a);
            xubVar.subscribe(c6532a.f41050e);
            c6532a.m11969d();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, oxbVar);
        }
    }
}
