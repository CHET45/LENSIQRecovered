package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ynb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final uu2<? super T> f102348b;

    /* JADX INFO: renamed from: ynb$a */
    public static final class C15737a<T> extends lv0<T, T> {

        /* JADX INFO: renamed from: f */
        public final uu2<? super T> f102349f;

        public C15737a(pxb<? super T> actual, uu2<? super T> onAfterNext) {
            super(actual);
            this.f102349f = onAfterNext;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.pxb
        public void onNext(T t) {
            this.f58858a.onNext((Object) t);
            if (this.f58862e == 0) {
                try {
                    this.f102349f.accept(t);
                } catch (Throwable th) {
                    m16392c(th);
                }
            }
        }

        @Override // p000.zif
        @dib
        public T poll() throws Throwable {
            T tPoll = this.f58860c.poll();
            if (tPoll != null) {
                this.f102349f.accept(tPoll);
            }
            return tPoll;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m16393d(mode);
        }
    }

    public ynb(wub<T> source, uu2<? super T> onAfterNext) {
        super(source);
        this.f102348b = onAfterNext;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new C15737a(observer, this.f102348b));
    }
}
