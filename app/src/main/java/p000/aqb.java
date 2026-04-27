package p000;

import io.reactivex.Observable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class aqb<T, S> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<S> f11586a;

    /* JADX INFO: renamed from: b */
    public final j11<S, ry4<T>, S> f11587b;

    /* JADX INFO: renamed from: c */
    public final tu2<? super S> f11588c;

    public aqb(Callable<S> callable, j11<S, ry4<T>, S> j11Var, tu2<? super S> tu2Var) {
        this.f11586a = callable;
        this.f11587b = j11Var;
        this.f11588c = tu2Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        try {
            C1562a c1562a = new C1562a(oxbVar, this.f11587b, this.f11588c, this.f11586a.call());
            oxbVar.onSubscribe(c1562a);
            c1562a.run();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, oxbVar);
        }
    }

    /* JADX INFO: renamed from: aqb$a */
    public static final class C1562a<T, S> implements ry4<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f11589a;

        /* JADX INFO: renamed from: b */
        public final j11<S, ? super ry4<T>, S> f11590b;

        /* JADX INFO: renamed from: c */
        public final tu2<? super S> f11591c;

        /* JADX INFO: renamed from: d */
        public S f11592d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f11593e;

        /* JADX INFO: renamed from: f */
        public boolean f11594f;

        /* JADX INFO: renamed from: m */
        public boolean f11595m;

        public C1562a(oxb<? super T> oxbVar, j11<S, ? super ry4<T>, S> j11Var, tu2<? super S> tu2Var, S s) {
            this.f11589a = oxbVar;
            this.f11590b = j11Var;
            this.f11591c = tu2Var;
            this.f11592d = s;
        }

        private void dispose(S s) {
            try {
                this.f11591c.accept(s);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(th);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f11593e;
        }

        @Override // p000.ry4
        public void onComplete() {
            if (this.f11594f) {
                return;
            }
            this.f11594f = true;
            this.f11589a.onComplete();
        }

        @Override // p000.ry4
        public void onError(Throwable th) {
            if (this.f11594f) {
                pfe.onError(th);
                return;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f11594f = true;
            this.f11589a.onError(th);
        }

        @Override // p000.ry4
        public void onNext(T t) {
            if (this.f11594f) {
                return;
            }
            if (this.f11595m) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f11595m = true;
                this.f11589a.onNext(t);
            }
        }

        public void run() {
            S sApply = this.f11592d;
            if (this.f11593e) {
                this.f11592d = null;
                dispose(sApply);
                return;
            }
            j11<S, ? super ry4<T>, S> j11Var = this.f11590b;
            while (!this.f11593e) {
                this.f11595m = false;
                try {
                    sApply = j11Var.apply(sApply, this);
                    if (this.f11594f) {
                        this.f11593e = true;
                        this.f11592d = null;
                        dispose(sApply);
                        return;
                    }
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f11592d = null;
                    this.f11593e = true;
                    onError(th);
                    dispose(sApply);
                    return;
                }
            }
            this.f11592d = null;
            dispose(sApply);
        }

        @Override // p000.mf4
        public void dispose() {
            this.f11593e = true;
        }
    }
}
