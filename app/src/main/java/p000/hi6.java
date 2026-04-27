package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class hi6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final i11<T, T, T> f43726c;

    /* JADX INFO: renamed from: hi6$a */
    public static final class C6858a<T> implements kj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f43727a;

        /* JADX INFO: renamed from: b */
        public final i11<T, T, T> f43728b;

        /* JADX INFO: renamed from: c */
        public fdg f43729c;

        /* JADX INFO: renamed from: d */
        public T f43730d;

        /* JADX INFO: renamed from: e */
        public boolean f43731e;

        public C6858a(ycg<? super T> actual, i11<T, T, T> accumulator) {
            this.f43727a = actual;
            this.f43728b = accumulator;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f43729c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f43731e) {
                return;
            }
            this.f43731e = true;
            this.f43727a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f43731e) {
                ofe.onError(t);
            } else {
                this.f43731e = true;
                this.f43727a.onError(t);
            }
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f43731e) {
                return;
            }
            ycg<? super T> ycgVar = this.f43727a;
            T t2 = this.f43730d;
            if (t2 == null) {
                this.f43730d = t;
                ycgVar.onNext(t);
                return;
            }
            try {
                T tApply = this.f43728b.apply(t2, t);
                Objects.requireNonNull(tApply, "The value returned by the accumulator is null");
                this.f43730d = tApply;
                ycgVar.onNext(tApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f43729c.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f43729c, s)) {
                this.f43729c = s;
                this.f43727a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f43729c.request(n);
        }
    }

    public hi6(l86<T> source, i11<T, T, T> accumulator) {
        super(source);
        this.f43726c = accumulator;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C6858a(s, this.f43726c));
    }
}
