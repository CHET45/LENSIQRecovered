package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class tob<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final n8d<? super T> f85513b;

    /* JADX INFO: renamed from: tob$a */
    public static final class C13128a<T> extends lv0<T, T> {

        /* JADX INFO: renamed from: f */
        public final n8d<? super T> f85514f;

        public C13128a(pxb<? super T> actual, n8d<? super T> filter) {
            super(actual);
            this.f85514f = filter;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f58862e != 0) {
                this.f58858a.onNext(null);
                return;
            }
            try {
                if (this.f85514f.test(t)) {
                    this.f58858a.onNext((Object) t);
                }
            } catch (Throwable th) {
                m16392c(th);
            }
        }

        @Override // p000.zif
        @dib
        public T poll() throws Throwable {
            T tPoll;
            do {
                tPoll = this.f58860c.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f85514f.test(tPoll));
            return tPoll;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m16393d(mode);
        }
    }

    public tob(wub<T> source, n8d<? super T> predicate) {
        super(source);
        this.f85513b = predicate;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new C13128a(observer, this.f85513b));
    }
}
