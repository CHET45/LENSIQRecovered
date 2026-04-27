package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class tb6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final uu2<? super T> f84142c;

    /* JADX INFO: renamed from: tb6$a */
    public static final class C12967a<T> extends jv0<T, T> {

        /* JADX INFO: renamed from: f */
        public final uu2<? super T> f84143f;

        public C12967a(bq2<? super T> actual, uu2<? super T> onAfterNext) {
            super(actual);
            this.f84143f = onAfterNext;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            this.f51988a.onNext((Object) t);
            if (this.f51992e == 0) {
                try {
                    this.f84143f.accept(t);
                } catch (Throwable th) {
                    m14343c(th);
                }
            }
        }

        @Override // p000.zif
        @dib
        public T poll() throws Throwable {
            T tPoll = this.f51990c.poll();
            if (tPoll != null) {
                this.f84143f.accept(tPoll);
            }
            return tPoll;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m14344d(mode);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            boolean zTryOnNext = this.f51988a.tryOnNext((Object) t);
            try {
                this.f84143f.accept(t);
            } catch (Throwable th) {
                m14343c(th);
            }
            return zTryOnNext;
        }
    }

    /* JADX INFO: renamed from: tb6$b */
    public static final class C12968b<T> extends nv0<T, T> {

        /* JADX INFO: renamed from: f */
        public final uu2<? super T> f84144f;

        public C12968b(ycg<? super T> actual, uu2<? super T> onAfterNext) {
            super(actual);
            this.f84144f = onAfterNext;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f65774d) {
                return;
            }
            this.f65771a.onNext((Object) t);
            if (this.f65775e == 0) {
                try {
                    this.f84144f.accept(t);
                } catch (Throwable th) {
                    m18144c(th);
                }
            }
        }

        @Override // p000.zif
        @dib
        public T poll() throws Throwable {
            T tPoll = this.f65773c.poll();
            if (tPoll != null) {
                this.f84144f.accept(tPoll);
            }
            return tPoll;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m18145d(mode);
        }
    }

    public tb6(l86<T> source, uu2<? super T> onAfterNext) {
        super(source);
        this.f84142c = onAfterNext;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        if (s instanceof bq2) {
            this.f49321b.subscribe((kj6) new C12967a((bq2) s, this.f84142c));
        } else {
            this.f49321b.subscribe((kj6) new C12968b(s, this.f84142c));
        }
    }
}
