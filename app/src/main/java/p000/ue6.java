package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ue6<T> extends s4a<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<T> f87776a;

    /* JADX INFO: renamed from: ue6$a */
    public static final class C13512a<T> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f87777a;

        /* JADX INFO: renamed from: b */
        public fdg f87778b;

        /* JADX INFO: renamed from: c */
        public T f87779c;

        public C13512a(l9a<? super T> l9aVar) {
            this.f87777a = l9aVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f87778b.cancel();
            this.f87778b = mdg.CANCELLED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f87778b == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f87778b = mdg.CANCELLED;
            T t = this.f87779c;
            if (t == null) {
                this.f87777a.onComplete();
            } else {
                this.f87779c = null;
                this.f87777a.onSuccess(t);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f87778b = mdg.CANCELLED;
            this.f87779c = null;
            this.f87777a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f87779c = t;
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f87778b, fdgVar)) {
                this.f87778b = fdgVar;
                this.f87777a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public ue6(zjd<T> zjdVar) {
        this.f87776a = zjdVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f87776a.subscribe(new C13512a(l9aVar));
    }
}
