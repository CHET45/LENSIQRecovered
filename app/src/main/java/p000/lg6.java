package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class lg6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super Throwable, ? extends T> f57498c;

    /* JADX INFO: renamed from: lg6$a */
    public static final class C8808a<T> extends unf<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;

        /* JADX INFO: renamed from: m */
        public final sy6<? super Throwable, ? extends T> f57499m;

        public C8808a(ycg<? super T> actual, sy6<? super Throwable, ? extends T> valueSupplier) {
            super(actual);
            this.f57499m = valueSupplier;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f88628a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            try {
                T tApply = this.f57499m.apply(t);
                Objects.requireNonNull(tApply, "The valueSupplier returned a null value");
                m23463a(tApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f88628a.onError(new qm2(t, th));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            this.f88631d++;
            this.f88628a.onNext((Object) t);
        }
    }

    public lg6(l86<T> source, sy6<? super Throwable, ? extends T> valueSupplier) {
        super(source);
        this.f57498c = valueSupplier;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C8808a(s, this.f57498c));
    }
}
