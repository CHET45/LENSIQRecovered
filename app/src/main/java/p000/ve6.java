package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ve6<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<T> f90786a;

    /* JADX INFO: renamed from: ve6$a */
    public static final class C14017a<T> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f90787a;

        /* JADX INFO: renamed from: b */
        public fdg f90788b;

        /* JADX INFO: renamed from: c */
        public T f90789c;

        public C14017a(k9a<? super T> downstream) {
            this.f90787a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f90788b.cancel();
            this.f90788b = ldg.CANCELLED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f90788b == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f90788b = ldg.CANCELLED;
            T t = this.f90789c;
            if (t == null) {
                this.f90787a.onComplete();
            } else {
                this.f90789c = null;
                this.f90787a.onSuccess(t);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f90788b = ldg.CANCELLED;
            this.f90789c = null;
            this.f90787a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f90789c = t;
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f90788b, s)) {
                this.f90788b = s;
                this.f90787a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public ve6(zjd<T> source) {
        this.f90786a = source;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f90786a.subscribe(new C14017a(observer));
    }
}
