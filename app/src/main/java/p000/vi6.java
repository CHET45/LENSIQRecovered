package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class vi6<T> extends kjf<T> implements u07<T> {

    /* JADX INFO: renamed from: a */
    public final l86<T> f91235a;

    /* JADX INFO: renamed from: b */
    public final T f91236b;

    /* JADX INFO: renamed from: vi6$a */
    public static final class C14089a<T> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f91237a;

        /* JADX INFO: renamed from: b */
        public final T f91238b;

        /* JADX INFO: renamed from: c */
        public fdg f91239c;

        /* JADX INFO: renamed from: d */
        public boolean f91240d;

        /* JADX INFO: renamed from: e */
        public T f91241e;

        public C14089a(hnf<? super T> actual, T defaultValue) {
            this.f91237a = actual;
            this.f91238b = defaultValue;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f91239c.cancel();
            this.f91239c = ldg.CANCELLED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f91239c == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f91240d) {
                return;
            }
            this.f91240d = true;
            this.f91239c = ldg.CANCELLED;
            T t = this.f91241e;
            this.f91241e = null;
            if (t == null) {
                t = this.f91238b;
            }
            if (t != null) {
                this.f91237a.onSuccess(t);
            } else {
                this.f91237a.onError(new NoSuchElementException());
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f91240d) {
                ofe.onError(t);
                return;
            }
            this.f91240d = true;
            this.f91239c = ldg.CANCELLED;
            this.f91237a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f91240d) {
                return;
            }
            if (this.f91241e == null) {
                this.f91241e = t;
                return;
            }
            this.f91240d = true;
            this.f91239c.cancel();
            this.f91239c = ldg.CANCELLED;
            this.f91237a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f91239c, s)) {
                this.f91239c = s;
                this.f91237a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public vi6(l86<T> source, T defaultValue) {
        this.f91235a = source;
        this.f91236b = defaultValue;
    }

    @Override // p000.u07
    public l86<T> fuseToFlowable() {
        return ofe.onAssembly(new ri6(this.f91235a, this.f91236b, true));
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f91235a.subscribe((kj6) new C14089a(observer, this.f91236b));
    }
}
