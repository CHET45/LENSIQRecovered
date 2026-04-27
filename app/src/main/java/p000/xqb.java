package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class xqb<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f98997a;

    /* JADX INFO: renamed from: xqb$a */
    public static final class C15257a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f98998a;

        /* JADX INFO: renamed from: b */
        public lf4 f98999b;

        /* JADX INFO: renamed from: c */
        public T f99000c;

        public C15257a(k9a<? super T> downstream) {
            this.f98998a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f98999b.dispose();
            this.f98999b = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f98999b == zf4.DISPOSED;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f98999b = zf4.DISPOSED;
            T t = this.f99000c;
            if (t == null) {
                this.f98998a.onComplete();
            } else {
                this.f99000c = null;
                this.f98998a.onSuccess(t);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f98999b = zf4.DISPOSED;
            this.f99000c = null;
            this.f98998a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f99000c = t;
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f98999b, d)) {
                this.f98999b = d;
                this.f98998a.onSubscribe(this);
            }
        }
    }

    public xqb(wub<T> source) {
        this.f98997a = source;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f98997a.subscribe(new C15257a(observer));
    }
}
