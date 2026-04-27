package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class dh6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final i11<T, T, T> f29647c;

    /* JADX INFO: renamed from: dh6$a */
    public static final class C4785a<T> extends j34<T> implements kj6<T> {
        private static final long serialVersionUID = -4663883003264602070L;

        /* JADX INFO: renamed from: L */
        public final i11<T, T, T> f29648L;

        /* JADX INFO: renamed from: M */
        public fdg f29649M;

        public C4785a(ycg<? super T> actual, i11<T, T, T> reducer) {
            super(actual);
            this.f29648L = reducer;
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f29649M.cancel();
            this.f29649M = ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            fdg fdgVar = this.f29649M;
            ldg ldgVar = ldg.CANCELLED;
            if (fdgVar == ldgVar) {
                return;
            }
            this.f29649M = ldgVar;
            T t = this.f49484b;
            if (t != null) {
                complete(t);
            } else {
                this.f49483a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            fdg fdgVar = this.f29649M;
            ldg ldgVar = ldg.CANCELLED;
            if (fdgVar == ldgVar) {
                ofe.onError(t);
            } else {
                this.f29649M = ldgVar;
                this.f49483a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f29649M == ldg.CANCELLED) {
                return;
            }
            T t2 = this.f49484b;
            if (t2 == null) {
                this.f49484b = t;
                return;
            }
            try {
                T tApply = this.f29648L.apply(t2, t);
                Objects.requireNonNull(tApply, "The reducer returned a null value");
                this.f49484b = tApply;
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f29649M.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f29649M, s)) {
                this.f29649M = s;
                this.f49483a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public dh6(l86<T> source, i11<T, T, T> reducer) {
        super(source);
        this.f29647c = reducer;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C4785a(s, this.f29647c));
    }
}
