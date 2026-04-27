package p000;

import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public final class el6<T, U extends Collection<? super T>> extends kjf<U> implements u07<U> {

    /* JADX INFO: renamed from: a */
    public final l86<T> f33333a;

    /* JADX INFO: renamed from: b */
    public final nfg<U> f33334b;

    /* JADX INFO: renamed from: el6$a */
    public static final class C5365a<T, U extends Collection<? super T>> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super U> f33335a;

        /* JADX INFO: renamed from: b */
        public fdg f33336b;

        /* JADX INFO: renamed from: c */
        public U f33337c;

        public C5365a(hnf<? super U> actual, U collection) {
            this.f33335a = actual;
            this.f33337c = collection;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f33336b.cancel();
            this.f33336b = ldg.CANCELLED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f33336b == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f33336b = ldg.CANCELLED;
            this.f33335a.onSuccess(this.f33337c);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f33337c = null;
            this.f33336b = ldg.CANCELLED;
            this.f33335a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f33337c.add(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f33336b, s)) {
                this.f33336b = s;
                this.f33335a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public el6(l86<T> source) {
        this(source, u60.asSupplier());
    }

    @Override // p000.u07
    public l86<U> fuseToFlowable() {
        return ofe.onAssembly(new cl6(this.f33333a, this.f33334b));
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super U> observer) {
        try {
            this.f33333a.subscribe((kj6) new C5365a(observer, (Collection) k75.nullCheck(this.f33334b.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }

    public el6(l86<T> source, nfg<U> collectionSupplier) {
        this.f33333a = source;
        this.f33334b = collectionSupplier;
    }
}
