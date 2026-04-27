package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class n7a<T, R> extends m86<R> {

    /* JADX INFO: renamed from: b */
    public final aaa<T> f63445b;

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends zjd<? extends R>> f63446c;

    public n7a(aaa<T> aaaVar, py6<? super T, ? extends zjd<? extends R>> py6Var) {
        this.f63445b = aaaVar;
        this.f63446c = py6Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        this.f63445b.subscribe(new C9721a(ycgVar, this.f63446c));
    }

    /* JADX INFO: renamed from: n7a$a */
    public static final class C9721a<T, R> extends AtomicReference<fdg> implements lj6<R>, l9a<T>, fdg {
        private static final long serialVersionUID = -8948264376121066672L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f63447a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends zjd<? extends R>> f63448b;

        /* JADX INFO: renamed from: c */
        public mf4 f63449c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f63450d = new AtomicLong();

        public C9721a(ycg<? super R> ycgVar, py6<? super T, ? extends zjd<? extends R>> py6Var) {
            this.f63447a = ycgVar;
            this.f63448b = py6Var;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f63449c.dispose();
            mdg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f63447a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f63447a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(R r) {
            this.f63447a.onNext(r);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f63449c, mf4Var)) {
                this.f63449c = mf4Var;
                this.f63447a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            try {
                ((zjd) xjb.requireNonNull(this.f63448b.apply(t), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f63447a.onError(th);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            mdg.deferredRequest(this, this.f63450d, j);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.deferredSetOnce(this, this.f63450d, fdgVar);
        }
    }
}
