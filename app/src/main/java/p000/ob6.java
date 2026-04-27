package p000;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class ob6<T, K> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final py6<? super T, K> f67052c;

    /* JADX INFO: renamed from: d */
    public final Callable<? extends Collection<? super K>> f67053d;

    /* JADX INFO: renamed from: ob6$a */
    public static final class C10288a<T, K> extends ov0<T, T> {

        /* JADX INFO: renamed from: f */
        public final Collection<? super K> f67054f;

        /* JADX INFO: renamed from: m */
        public final py6<? super T, K> f67055m;

        public C10288a(ycg<? super T> ycgVar, py6<? super T, K> py6Var, Collection<? super K> collection) {
            super(ycgVar);
            this.f67055m = py6Var;
            this.f67054f = collection;
        }

        @Override // p000.ov0, p000.ajf
        public void clear() {
            this.f67054f.clear();
            super.clear();
        }

        @Override // p000.ov0, p000.ycg
        public void onComplete() {
            if (this.f68848d) {
                return;
            }
            this.f68848d = true;
            this.f67054f.clear();
            this.f68845a.onComplete();
        }

        @Override // p000.ov0, p000.ycg
        public void onError(Throwable th) {
            if (this.f68848d) {
                pfe.onError(th);
                return;
            }
            this.f68848d = true;
            this.f67054f.clear();
            this.f68845a.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f68848d) {
                return;
            }
            if (this.f68849e != 0) {
                this.f68845a.onNext(null);
                return;
            }
            try {
                if (this.f67054f.add(xjb.requireNonNull(this.f67055m.apply(t), "The keySelector returned a null key"))) {
                    this.f68845a.onNext((Object) t);
                } else {
                    this.f68846b.request(1L);
                }
            } catch (Throwable th) {
                m19035c(th);
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            T tPoll;
            while (true) {
                tPoll = this.f68847c.poll();
                if (tPoll == null || this.f67054f.add((Object) xjb.requireNonNull(this.f67055m.apply(tPoll), "The keySelector returned a null key"))) {
                    break;
                }
                if (this.f68849e == 2) {
                    this.f68846b.request(1L);
                }
            }
            return tPoll;
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return m19036d(i);
        }
    }

    public ob6(m86<T> m86Var, py6<? super T, K> py6Var, Callable<? extends Collection<? super K>> callable) {
        super(m86Var);
        this.f67052c = py6Var;
        this.f67053d = callable;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        try {
            this.f52360b.subscribe((lj6) new C10288a(ycgVar, this.f67052c, (Collection) xjb.requireNonNull(this.f67053d.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            x05.error(th, ycgVar);
        }
    }
}
