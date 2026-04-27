package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class fnb<T, U> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends xub<U>> f37154b;

    /* JADX INFO: renamed from: fnb$a */
    public static final class C5895a<T, U> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f37155a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends xub<U>> f37156b;

        /* JADX INFO: renamed from: c */
        public mf4 f37157c;

        /* JADX INFO: renamed from: d */
        public final AtomicReference<mf4> f37158d = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public volatile long f37159e;

        /* JADX INFO: renamed from: f */
        public boolean f37160f;

        /* JADX INFO: renamed from: fnb$a$a */
        public static final class a<T, U> extends gg4<U> {

            /* JADX INFO: renamed from: b */
            public final C5895a<T, U> f37161b;

            /* JADX INFO: renamed from: c */
            public final long f37162c;

            /* JADX INFO: renamed from: d */
            public final T f37163d;

            /* JADX INFO: renamed from: e */
            public boolean f37164e;

            /* JADX INFO: renamed from: f */
            public final AtomicBoolean f37165f = new AtomicBoolean();

            public a(C5895a<T, U> c5895a, long j, T t) {
                this.f37161b = c5895a;
                this.f37162c = j;
                this.f37163d = t;
            }

            /* JADX INFO: renamed from: b */
            public void m10997b() {
                if (this.f37165f.compareAndSet(false, true)) {
                    this.f37161b.m10996a(this.f37162c, this.f37163d);
                }
            }

            @Override // p000.oxb
            public void onComplete() {
                if (this.f37164e) {
                    return;
                }
                this.f37164e = true;
                m10997b();
            }

            @Override // p000.oxb
            public void onError(Throwable th) {
                if (this.f37164e) {
                    pfe.onError(th);
                } else {
                    this.f37164e = true;
                    this.f37161b.onError(th);
                }
            }

            @Override // p000.oxb
            public void onNext(U u) {
                if (this.f37164e) {
                    return;
                }
                this.f37164e = true;
                dispose();
                m10997b();
            }
        }

        public C5895a(oxb<? super T> oxbVar, py6<? super T, ? extends xub<U>> py6Var) {
            this.f37155a = oxbVar;
            this.f37156b = py6Var;
        }

        /* JADX INFO: renamed from: a */
        public void m10996a(long j, T t) {
            if (j == this.f37159e) {
                this.f37155a.onNext(t);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f37157c.dispose();
            ag4.dispose(this.f37158d);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f37157c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f37160f) {
                return;
            }
            this.f37160f = true;
            mf4 mf4Var = this.f37158d.get();
            if (mf4Var != ag4.DISPOSED) {
                a aVar = (a) mf4Var;
                if (aVar != null) {
                    aVar.m10997b();
                }
                ag4.dispose(this.f37158d);
                this.f37155a.onComplete();
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            ag4.dispose(this.f37158d);
            this.f37155a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f37160f) {
                return;
            }
            long j = this.f37159e + 1;
            this.f37159e = j;
            mf4 mf4Var = this.f37158d.get();
            if (mf4Var != null) {
                mf4Var.dispose();
            }
            try {
                xub xubVar = (xub) xjb.requireNonNull(this.f37156b.apply(t), "The ObservableSource supplied is null");
                a aVar = new a(this, j, t);
                if (v7b.m23844a(this.f37158d, mf4Var, aVar)) {
                    xubVar.subscribe(aVar);
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                dispose();
                this.f37155a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f37157c, mf4Var)) {
                this.f37157c = mf4Var;
                this.f37155a.onSubscribe(this);
            }
        }
    }

    public fnb(xub<T> xubVar, py6<? super T, ? extends xub<U>> py6Var) {
        super(xubVar);
        this.f37154b = py6Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C5895a(new n1f(oxbVar), this.f37154b));
    }
}
