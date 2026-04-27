package p000;

import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public final class cl6<T, U extends Collection<? super T>> extends AbstractC7714j1<T, U> {

    /* JADX INFO: renamed from: c */
    public final nfg<U> f16884c;

    /* JADX INFO: renamed from: cl6$a */
    public static final class C2376a<T, U extends Collection<? super T>> extends j34<U> implements kj6<T>, fdg {
        private static final long serialVersionUID = -8134157938864266736L;

        /* JADX INFO: renamed from: L */
        public fdg f16885L;

        /* JADX WARN: Multi-variable type inference failed */
        public C2376a(ycg<? super U> actual, U collection) {
            super(actual);
            this.f49484b = collection;
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f16885L.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            complete(this.f49484b);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f49484b = null;
            this.f49483a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            Collection collection = (Collection) this.f49484b;
            if (collection != null) {
                collection.add(t);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f16885L, s)) {
                this.f16885L = s;
                this.f49483a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public cl6(l86<T> source, nfg<U> collectionSupplier) {
        super(source);
        this.f16884c = collectionSupplier;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super U> s) {
        try {
            this.f49321b.subscribe((kj6) new C2376a(s, (Collection) k75.nullCheck(this.f16884c.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            w05.error(th, s);
        }
    }
}
