package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class oc6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final n8d<? super T> f67116c;

    /* JADX INFO: renamed from: oc6$a */
    public static final class C10295a<T> extends jv0<T, T> {

        /* JADX INFO: renamed from: f */
        public final n8d<? super T> f67117f;

        public C10295a(bq2<? super T> actual, n8d<? super T> filter) {
            super(actual);
            this.f67117f = filter;
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.f51989b.request(1L);
        }

        @Override // p000.zif
        @dib
        public T poll() throws Throwable {
            bod<T> bodVar = this.f51990c;
            n8d<? super T> n8dVar = this.f67117f;
            while (true) {
                T tPoll = bodVar.poll();
                if (tPoll == null) {
                    return null;
                }
                if (n8dVar.test(tPoll)) {
                    return tPoll;
                }
                if (this.f51992e == 2) {
                    bodVar.request(1L);
                }
            }
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m14344d(mode);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            if (this.f51991d) {
                return false;
            }
            if (this.f51992e != 0) {
                return this.f51988a.tryOnNext(null);
            }
            try {
                return this.f67117f.test(t) && this.f51988a.tryOnNext((Object) t);
            } catch (Throwable th) {
                m14343c(th);
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: oc6$b */
    public static final class C10296b<T> extends nv0<T, T> implements bq2<T> {

        /* JADX INFO: renamed from: f */
        public final n8d<? super T> f67118f;

        public C10296b(ycg<? super T> actual, n8d<? super T> filter) {
            super(actual);
            this.f67118f = filter;
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.f65772b.request(1L);
        }

        @Override // p000.zif
        @dib
        public T poll() throws Throwable {
            bod<T> bodVar = this.f65773c;
            n8d<? super T> n8dVar = this.f67118f;
            while (true) {
                T tPoll = bodVar.poll();
                if (tPoll == null) {
                    return null;
                }
                if (n8dVar.test(tPoll)) {
                    return tPoll;
                }
                if (this.f65775e == 2) {
                    bodVar.request(1L);
                }
            }
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m18145d(mode);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            if (this.f65774d) {
                return false;
            }
            if (this.f65775e != 0) {
                this.f65771a.onNext(null);
                return true;
            }
            try {
                boolean zTest = this.f67118f.test(t);
                if (zTest) {
                    this.f65771a.onNext((Object) t);
                }
                return zTest;
            } catch (Throwable th) {
                m18144c(th);
                return true;
            }
        }
    }

    public oc6(l86<T> source, n8d<? super T> predicate) {
        super(source);
        this.f67116c = predicate;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        if (s instanceof bq2) {
            this.f49321b.subscribe((kj6) new C10295a((bq2) s, this.f67116c));
        } else {
            this.f49321b.subscribe((kj6) new C10296b(s, this.f67116c));
        }
    }
}
