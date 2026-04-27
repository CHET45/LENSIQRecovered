package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class fh6<T> extends r4a<T> implements dh7<T>, u07<T> {

    /* JADX INFO: renamed from: a */
    public final l86<T> f36575a;

    /* JADX INFO: renamed from: b */
    public final i11<T, T, T> f36576b;

    /* JADX INFO: renamed from: fh6$a */
    public static final class C5804a<T> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f36577a;

        /* JADX INFO: renamed from: b */
        public final i11<T, T, T> f36578b;

        /* JADX INFO: renamed from: c */
        public T f36579c;

        /* JADX INFO: renamed from: d */
        public fdg f36580d;

        /* JADX INFO: renamed from: e */
        public boolean f36581e;

        public C5804a(k9a<? super T> actual, i11<T, T, T> reducer) {
            this.f36577a = actual;
            this.f36578b = reducer;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f36580d.cancel();
            this.f36581e = true;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f36581e;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f36581e) {
                return;
            }
            this.f36581e = true;
            T t = this.f36579c;
            if (t != null) {
                this.f36577a.onSuccess(t);
            } else {
                this.f36577a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f36581e) {
                ofe.onError(t);
            } else {
                this.f36581e = true;
                this.f36577a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f36581e) {
                return;
            }
            T t2 = this.f36579c;
            if (t2 == null) {
                this.f36579c = t;
                return;
            }
            try {
                T tApply = this.f36578b.apply(t2, t);
                Objects.requireNonNull(tApply, "The reducer returned a null value");
                this.f36579c = tApply;
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f36580d.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f36580d, s)) {
                this.f36580d = s;
                this.f36577a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public fh6(l86<T> source, i11<T, T, T> reducer) {
        this.f36575a = source;
        this.f36576b = reducer;
    }

    @Override // p000.u07
    public l86<T> fuseToFlowable() {
        return ofe.onAssembly(new dh6(this.f36575a, this.f36576b));
    }

    @Override // p000.dh7
    public zjd<T> source() {
        return this.f36575a;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f36575a.subscribe((kj6) new C5804a(observer, this.f36576b));
    }
}
