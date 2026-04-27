package p000;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class tnb<T, K> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, K> f85379b;

    /* JADX INFO: renamed from: c */
    public final Callable<? extends Collection<? super K>> f85380c;

    /* JADX INFO: renamed from: tnb$a */
    public static final class C13113a<T, K> extends mv0<T, T> {

        /* JADX INFO: renamed from: f */
        public final Collection<? super K> f85381f;

        /* JADX INFO: renamed from: m */
        public final py6<? super T, K> f85382m;

        public C13113a(oxb<? super T> oxbVar, py6<? super T, K> py6Var, Collection<? super K> collection) {
            super(oxbVar);
            this.f85382m = py6Var;
            this.f85381f = collection;
        }

        @Override // p000.mv0, p000.ajf
        public void clear() {
            this.f85381f.clear();
            super.clear();
        }

        @Override // p000.mv0, p000.oxb
        public void onComplete() {
            if (this.f62355d) {
                return;
            }
            this.f62355d = true;
            this.f85381f.clear();
            this.f62352a.onComplete();
        }

        @Override // p000.mv0, p000.oxb
        public void onError(Throwable th) {
            if (this.f62355d) {
                pfe.onError(th);
                return;
            }
            this.f62355d = true;
            this.f85381f.clear();
            this.f62352a.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f62355d) {
                return;
            }
            if (this.f62356e != 0) {
                this.f62352a.onNext(null);
                return;
            }
            try {
                if (this.f85381f.add(xjb.requireNonNull(this.f85382m.apply(t), "The keySelector returned a null key"))) {
                    this.f62352a.onNext((Object) t);
                }
            } catch (Throwable th) {
                m17581c(th);
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f62354c.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f85381f.add((Object) xjb.requireNonNull(this.f85382m.apply(tPoll), "The keySelector returned a null key")));
            return tPoll;
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return m17582d(i);
        }
    }

    public tnb(xub<T> xubVar, py6<? super T, K> py6Var, Callable<? extends Collection<? super K>> callable) {
        super(xubVar);
        this.f85379b = py6Var;
        this.f85380c = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        try {
            this.f66354a.subscribe(new C13113a(oxbVar, this.f85379b, (Collection) xjb.requireNonNull(this.f85380c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, oxbVar);
        }
    }
}
