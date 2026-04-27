package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class gnb<T, U> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends wub<U>> f40337b;

    /* JADX INFO: renamed from: gnb$a */
    public static final class C6434a<T, U> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f40338a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends wub<U>> f40339b;

        /* JADX INFO: renamed from: c */
        public lf4 f40340c;

        /* JADX INFO: renamed from: d */
        public final AtomicReference<lf4> f40341d = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public volatile long f40342e;

        /* JADX INFO: renamed from: f */
        public boolean f40343f;

        /* JADX INFO: renamed from: gnb$a$a */
        public static final class a<T, U> extends fg4<U> {

            /* JADX INFO: renamed from: b */
            public final C6434a<T, U> f40344b;

            /* JADX INFO: renamed from: c */
            public final long f40345c;

            /* JADX INFO: renamed from: d */
            public final T f40346d;

            /* JADX INFO: renamed from: e */
            public boolean f40347e;

            /* JADX INFO: renamed from: f */
            public final AtomicBoolean f40348f = new AtomicBoolean();

            public a(C6434a<T, U> parent, long index, T value) {
                this.f40344b = parent;
                this.f40345c = index;
                this.f40346d = value;
            }

            /* JADX INFO: renamed from: b */
            public void m11790b() {
                if (this.f40348f.compareAndSet(false, true)) {
                    this.f40344b.m11789a(this.f40345c, this.f40346d);
                }
            }

            @Override // p000.pxb
            public void onComplete() {
                if (this.f40347e) {
                    return;
                }
                this.f40347e = true;
                m11790b();
            }

            @Override // p000.pxb
            public void onError(Throwable t) {
                if (this.f40347e) {
                    ofe.onError(t);
                } else {
                    this.f40347e = true;
                    this.f40344b.onError(t);
                }
            }

            @Override // p000.pxb
            public void onNext(U t) {
                if (this.f40347e) {
                    return;
                }
                this.f40347e = true;
                dispose();
                m11790b();
            }
        }

        public C6434a(pxb<? super T> actual, sy6<? super T, ? extends wub<U>> debounceSelector) {
            this.f40338a = actual;
            this.f40339b = debounceSelector;
        }

        /* JADX INFO: renamed from: a */
        public void m11789a(long idx, T value) {
            if (idx == this.f40342e) {
                this.f40338a.onNext(value);
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f40340c.dispose();
            zf4.dispose(this.f40341d);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f40340c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f40343f) {
                return;
            }
            this.f40343f = true;
            lf4 lf4Var = this.f40341d.get();
            if (lf4Var != zf4.DISPOSED) {
                a aVar = (a) lf4Var;
                if (aVar != null) {
                    aVar.m11790b();
                }
                zf4.dispose(this.f40341d);
                this.f40338a.onComplete();
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            zf4.dispose(this.f40341d);
            this.f40338a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f40343f) {
                return;
            }
            long j = this.f40342e + 1;
            this.f40342e = j;
            lf4 lf4Var = this.f40341d.get();
            if (lf4Var != null) {
                lf4Var.dispose();
            }
            try {
                wub<U> wubVarApply = this.f40339b.apply(t);
                Objects.requireNonNull(wubVarApply, "The ObservableSource supplied is null");
                wub<U> wubVar = wubVarApply;
                a aVar = new a(this, j, t);
                if (v7b.m23844a(this.f40341d, lf4Var, aVar)) {
                    wubVar.subscribe(aVar);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                dispose();
                this.f40338a.onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f40340c, d)) {
                this.f40340c = d;
                this.f40338a.onSubscribe(this);
            }
        }
    }

    public gnb(wub<T> source, sy6<? super T, ? extends wub<U>> debounceSelector) {
        super(source);
        this.f40337b = debounceSelector;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        this.f63101a.subscribe(new C6434a(new m1f(t), this.f40337b));
    }
}
