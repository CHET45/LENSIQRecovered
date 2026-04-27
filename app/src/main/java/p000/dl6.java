package p000;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class dl6<T, U extends Collection<? super T>> extends ljf<U> implements v07<U> {

    /* JADX INFO: renamed from: a */
    public final m86<T> f29939a;

    /* JADX INFO: renamed from: b */
    public final Callable<U> f29940b;

    /* JADX INFO: renamed from: dl6$a */
    public static final class C4844a<T, U extends Collection<? super T>> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super U> f29941a;

        /* JADX INFO: renamed from: b */
        public fdg f29942b;

        /* JADX INFO: renamed from: c */
        public U f29943c;

        public C4844a(inf<? super U> infVar, U u) {
            this.f29941a = infVar;
            this.f29943c = u;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f29942b.cancel();
            this.f29942b = mdg.CANCELLED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f29942b == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f29942b = mdg.CANCELLED;
            this.f29941a.onSuccess(this.f29943c);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f29943c = null;
            this.f29942b = mdg.CANCELLED;
            this.f29941a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f29943c.add(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f29942b, fdgVar)) {
                this.f29942b = fdgVar;
                this.f29941a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public dl6(m86<T> m86Var) {
        this(m86Var, v60.asCallable());
    }

    @Override // p000.v07
    public m86<U> fuseToFlowable() {
        return pfe.onAssembly(new bl6(this.f29939a, this.f29940b));
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super U> infVar) {
        try {
            this.f29939a.subscribe((lj6) new C4844a(infVar, (Collection) xjb.requireNonNull(this.f29940b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, infVar);
        }
    }

    public dl6(m86<T> m86Var, Callable<U> callable) {
        this.f29939a = m86Var;
        this.f29940b = callable;
    }
}
