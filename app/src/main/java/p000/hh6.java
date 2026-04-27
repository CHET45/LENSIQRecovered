package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class hh6<T, R> extends kjf<R> {

    /* JADX INFO: renamed from: a */
    public final zjd<T> f43636a;

    /* JADX INFO: renamed from: b */
    public final R f43637b;

    /* JADX INFO: renamed from: c */
    public final i11<R, ? super T, R> f43638c;

    /* JADX INFO: renamed from: hh6$a */
    public static final class C6853a<T, R> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super R> f43639a;

        /* JADX INFO: renamed from: b */
        public final i11<R, ? super T, R> f43640b;

        /* JADX INFO: renamed from: c */
        public R f43641c;

        /* JADX INFO: renamed from: d */
        public fdg f43642d;

        public C6853a(hnf<? super R> actual, i11<R, ? super T, R> reducer, R value) {
            this.f43639a = actual;
            this.f43641c = value;
            this.f43640b = reducer;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f43642d.cancel();
            this.f43642d = ldg.CANCELLED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f43642d == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            R r = this.f43641c;
            if (r != null) {
                this.f43641c = null;
                this.f43642d = ldg.CANCELLED;
                this.f43639a.onSuccess(r);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable e) {
            if (this.f43641c == null) {
                ofe.onError(e);
                return;
            }
            this.f43641c = null;
            this.f43642d = ldg.CANCELLED;
            this.f43639a.onError(e);
        }

        @Override // p000.ycg
        public void onNext(T value) {
            R r = this.f43641c;
            if (r != null) {
                try {
                    R rApply = this.f43640b.apply(r, value);
                    Objects.requireNonNull(rApply, "The reducer returned a null value");
                    this.f43641c = rApply;
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f43642d.cancel();
                    onError(th);
                }
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f43642d, s)) {
                this.f43642d = s;
                this.f43639a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public hh6(zjd<T> source, R seed, i11<R, ? super T, R> reducer) {
        this.f43636a = source;
        this.f43637b = seed;
        this.f43638c = reducer;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super R> observer) {
        this.f43636a.subscribe(new C6853a(observer, this.f43638c, this.f43637b));
    }
}
