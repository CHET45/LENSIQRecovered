package p000;

import io.reactivex.Observable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class h7a<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: a */
    public final aaa<T> f42732a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends Iterable<? extends R>> f42733b;

    /* JADX INFO: renamed from: h7a$a */
    public static final class C6737a<T, R> extends aw0<R> implements l9a<T> {

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f42734a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends Iterable<? extends R>> f42735b;

        /* JADX INFO: renamed from: c */
        public mf4 f42736c;

        /* JADX INFO: renamed from: d */
        public volatile Iterator<? extends R> f42737d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f42738e;

        /* JADX INFO: renamed from: f */
        public boolean f42739f;

        public C6737a(oxb<? super R> oxbVar, py6<? super T, ? extends Iterable<? extends R>> py6Var) {
            this.f42734a = oxbVar;
            this.f42735b = py6Var;
        }

        @Override // p000.ajf
        public void clear() {
            this.f42737d = null;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f42738e = true;
            this.f42736c.dispose();
            this.f42736c = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f42738e;
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f42737d == null;
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f42734a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f42736c = ag4.DISPOSED;
            this.f42734a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f42736c, mf4Var)) {
                this.f42736c = mf4Var;
                this.f42734a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            oxb<? super R> oxbVar = this.f42734a;
            try {
                Iterator<? extends R> it = this.f42735b.apply(t).iterator();
                if (!it.hasNext()) {
                    oxbVar.onComplete();
                    return;
                }
                this.f42737d = it;
                if (this.f42739f) {
                    oxbVar.onNext(null);
                    oxbVar.onComplete();
                    return;
                }
                while (!this.f42738e) {
                    try {
                        oxbVar.onNext(it.next());
                        if (this.f42738e) {
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
                oxbVar.onError(th3);
            }
        }

        @Override // p000.ajf
        @cib
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f42737d;
            if (it == null) {
                return null;
            }
            R r = (R) xjb.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f42737d = null;
            }
            return r;
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f42739f = true;
            return 2;
        }
    }

    public h7a(aaa<T> aaaVar, py6<? super T, ? extends Iterable<? extends R>> py6Var) {
        this.f42732a = aaaVar;
        this.f42733b = py6Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        this.f42732a.subscribe(new C6737a(oxbVar, this.f42733b));
    }
}
