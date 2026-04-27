package p000;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class bl6<T, U extends Collection<? super T>> extends AbstractC8162k1<T, U> {

    /* JADX INFO: renamed from: c */
    public final Callable<U> f14053c;

    /* JADX INFO: renamed from: bl6$a */
    public static final class C1936a<T, U extends Collection<? super T>> extends k34<U> implements lj6<T>, fdg {
        private static final long serialVersionUID = -8134157938864266736L;

        /* JADX INFO: renamed from: L */
        public fdg f14054L;

        /* JADX WARN: Multi-variable type inference failed */
        public C1936a(ycg<? super U> ycgVar, U u) {
            super(ycgVar);
            this.f52503b = u;
        }

        @Override // p000.k34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f14054L.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            complete(this.f52503b);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f52503b = null;
            this.f52502a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            Collection collection = (Collection) this.f52503b;
            if (collection != null) {
                collection.add(t);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f14054L, fdgVar)) {
                this.f14054L = fdgVar;
                this.f52502a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public bl6(m86<T> m86Var, Callable<U> callable) {
        super(m86Var);
        this.f14053c = callable;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super U> ycgVar) {
        try {
            this.f52360b.subscribe((lj6) new C1936a(ycgVar, (Collection) xjb.requireNonNull(this.f14053c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            x05.error(th, ycgVar);
        }
    }
}
