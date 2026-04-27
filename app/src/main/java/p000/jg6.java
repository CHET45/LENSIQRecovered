package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class jg6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super Throwable, ? extends zjd<? extends T>> f50471c;

    /* JADX INFO: renamed from: jg6$a */
    public static final class C7897a<T> extends gdg implements kj6<T> {
        private static final long serialVersionUID = 4063763155303814625L;

        /* JADX INFO: renamed from: F */
        public final ycg<? super T> f50472F;

        /* JADX INFO: renamed from: H */
        public final sy6<? super Throwable, ? extends zjd<? extends T>> f50473H;

        /* JADX INFO: renamed from: L */
        public boolean f50474L;

        /* JADX INFO: renamed from: M */
        public boolean f50475M;

        /* JADX INFO: renamed from: N */
        public long f50476N;

        public C7897a(ycg<? super T> actual, sy6<? super Throwable, ? extends zjd<? extends T>> nextSupplier) {
            super(false);
            this.f50472F = actual;
            this.f50473H = nextSupplier;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f50475M) {
                return;
            }
            this.f50475M = true;
            this.f50474L = true;
            this.f50472F.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f50474L) {
                if (this.f50475M) {
                    ofe.onError(t);
                    return;
                } else {
                    this.f50472F.onError(t);
                    return;
                }
            }
            this.f50474L = true;
            try {
                zjd<? extends T> zjdVarApply = this.f50473H.apply(t);
                Objects.requireNonNull(zjdVarApply, "The nextSupplier returned a null Publisher");
                zjd<? extends T> zjdVar = zjdVarApply;
                long j = this.f50476N;
                if (j != 0) {
                    produced(j);
                }
                zjdVar.subscribe(this);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f50472F.onError(new qm2(t, th));
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f50475M) {
                return;
            }
            if (!this.f50474L) {
                this.f50476N++;
            }
            this.f50472F.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            setSubscription(s);
        }
    }

    public jg6(l86<T> source, sy6<? super Throwable, ? extends zjd<? extends T>> nextSupplier) {
        super(source);
        this.f50471c = nextSupplier;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        C7897a c7897a = new C7897a(s, this.f50471c);
        s.onSubscribe(c7897a);
        this.f49321b.subscribe((kj6) c7897a);
    }
}
