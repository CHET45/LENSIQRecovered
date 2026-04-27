package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class rb6<T, K> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, K> f77648c;

    /* JADX INFO: renamed from: d */
    public final l11<? super K, ? super K> f77649d;

    /* JADX INFO: renamed from: rb6$a */
    public static final class C11989a<T, K> extends jv0<T, T> {

        /* JADX INFO: renamed from: C */
        public K f77650C;

        /* JADX INFO: renamed from: F */
        public boolean f77651F;

        /* JADX INFO: renamed from: f */
        public final sy6<? super T, K> f77652f;

        /* JADX INFO: renamed from: m */
        public final l11<? super K, ? super K> f77653m;

        public C11989a(bq2<? super T> actual, sy6<? super T, K> keySelector, l11<? super K, ? super K> comparer) {
            super(actual);
            this.f77652f = keySelector;
            this.f77653m = comparer;
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
            while (true) {
                T tPoll = this.f51990c.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f77652f.apply(tPoll);
                if (!this.f77651F) {
                    this.f77651F = true;
                    this.f77650C = kApply;
                    return tPoll;
                }
                if (!this.f77653m.test(this.f77650C, kApply)) {
                    this.f77650C = kApply;
                    return tPoll;
                }
                this.f77650C = kApply;
                if (this.f51992e != 1) {
                    this.f51989b.request(1L);
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
                return this.f51988a.tryOnNext((Object) t);
            }
            try {
                K kApply = this.f77652f.apply(t);
                if (this.f77651F) {
                    boolean zTest = this.f77653m.test(this.f77650C, kApply);
                    this.f77650C = kApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.f77651F = true;
                    this.f77650C = kApply;
                }
                this.f51988a.onNext((Object) t);
                return true;
            } catch (Throwable th) {
                m14343c(th);
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: rb6$b */
    public static final class C11990b<T, K> extends nv0<T, T> implements bq2<T> {

        /* JADX INFO: renamed from: C */
        public K f77654C;

        /* JADX INFO: renamed from: F */
        public boolean f77655F;

        /* JADX INFO: renamed from: f */
        public final sy6<? super T, K> f77656f;

        /* JADX INFO: renamed from: m */
        public final l11<? super K, ? super K> f77657m;

        public C11990b(ycg<? super T> actual, sy6<? super T, K> keySelector, l11<? super K, ? super K> comparer) {
            super(actual);
            this.f77656f = keySelector;
            this.f77657m = comparer;
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
            while (true) {
                T tPoll = this.f65773c.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f77656f.apply(tPoll);
                if (!this.f77655F) {
                    this.f77655F = true;
                    this.f77654C = kApply;
                    return tPoll;
                }
                if (!this.f77657m.test(this.f77654C, kApply)) {
                    this.f77654C = kApply;
                    return tPoll;
                }
                this.f77654C = kApply;
                if (this.f65775e != 1) {
                    this.f65772b.request(1L);
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
                this.f65771a.onNext((Object) t);
                return true;
            }
            try {
                K kApply = this.f77656f.apply(t);
                if (this.f77655F) {
                    boolean zTest = this.f77657m.test(this.f77654C, kApply);
                    this.f77654C = kApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.f77655F = true;
                    this.f77654C = kApply;
                }
                this.f65771a.onNext((Object) t);
                return true;
            } catch (Throwable th) {
                m18144c(th);
                return true;
            }
        }
    }

    public rb6(l86<T> source, sy6<? super T, K> keySelector, l11<? super K, ? super K> comparer) {
        super(source);
        this.f77648c = keySelector;
        this.f77649d = comparer;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        if (s instanceof bq2) {
            this.f49321b.subscribe((kj6) new C11989a((bq2) s, this.f77648c, this.f77649d));
        } else {
            this.f49321b.subscribe((kj6) new C11990b(s, this.f77648c, this.f77649d));
        }
    }
}
