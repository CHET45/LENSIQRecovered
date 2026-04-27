package p000;

import io.reactivex.Observable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class vlf<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f91617a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends Iterable<? extends R>> f91618b;

    /* JADX INFO: renamed from: vlf$a */
    public static final class C14155a<T, R> extends qv0<R> implements inf<T> {
        private static final long serialVersionUID = -8938804753851907758L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f91619a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends Iterable<? extends R>> f91620b;

        /* JADX INFO: renamed from: c */
        public mf4 f91621c;

        /* JADX INFO: renamed from: d */
        public volatile Iterator<? extends R> f91622d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f91623e;

        /* JADX INFO: renamed from: f */
        public boolean f91624f;

        public C14155a(oxb<? super R> oxbVar, py6<? super T, ? extends Iterable<? extends R>> py6Var) {
            this.f91619a = oxbVar;
            this.f91620b = py6Var;
        }

        @Override // p000.ajf
        public void clear() {
            this.f91622d = null;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f91623e = true;
            this.f91621c.dispose();
            this.f91621c = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f91623e;
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f91622d == null;
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f91621c = ag4.DISPOSED;
            this.f91619a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f91621c, mf4Var)) {
                this.f91621c = mf4Var;
                this.f91619a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            oxb<? super R> oxbVar = this.f91619a;
            try {
                Iterator<? extends R> it = this.f91620b.apply(t).iterator();
                if (!it.hasNext()) {
                    oxbVar.onComplete();
                    return;
                }
                if (this.f91624f) {
                    this.f91622d = it;
                    oxbVar.onNext(null);
                    oxbVar.onComplete();
                    return;
                }
                while (!this.f91623e) {
                    try {
                        oxbVar.onNext(it.next());
                        if (this.f91623e) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                oxbVar.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            n75.throwIfFatal(th);
                            oxbVar.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        n75.throwIfFatal(th2);
                        oxbVar.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                n75.throwIfFatal(th3);
                this.f91619a.onError(th3);
            }
        }

        @Override // p000.ajf
        @cib
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f91622d;
            if (it == null) {
                return null;
            }
            R r = (R) xjb.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f91622d = null;
            }
            return r;
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f91624f = true;
            return 2;
        }
    }

    public vlf(pof<T> pofVar, py6<? super T, ? extends Iterable<? extends R>> py6Var) {
        this.f91617a = pofVar;
        this.f91618b = py6Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        this.f91617a.subscribe(new C14155a(oxbVar, this.f91618b));
    }
}
