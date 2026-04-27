package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class wnb<T, K> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, K> f94834b;

    /* JADX INFO: renamed from: c */
    public final l11<? super K, ? super K> f94835c;

    /* JADX INFO: renamed from: wnb$a */
    public static final class C14704a<T, K> extends lv0<T, T> {

        /* JADX INFO: renamed from: C */
        public K f94836C;

        /* JADX INFO: renamed from: F */
        public boolean f94837F;

        /* JADX INFO: renamed from: f */
        public final sy6<? super T, K> f94838f;

        /* JADX INFO: renamed from: m */
        public final l11<? super K, ? super K> f94839m;

        public C14704a(pxb<? super T> actual, sy6<? super T, K> keySelector, l11<? super K, ? super K> comparer) {
            super(actual);
            this.f94838f = keySelector;
            this.f94839m = comparer;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f58861d) {
                return;
            }
            if (this.f58862e != 0) {
                this.f58858a.onNext((Object) t);
                return;
            }
            try {
                K kApply = this.f94838f.apply(t);
                if (this.f94837F) {
                    boolean zTest = this.f94839m.test(this.f94836C, kApply);
                    this.f94836C = kApply;
                    if (zTest) {
                        return;
                    }
                } else {
                    this.f94837F = true;
                    this.f94836C = kApply;
                }
                this.f58858a.onNext((Object) t);
            } catch (Throwable th) {
                m16392c(th);
            }
        }

        @Override // p000.zif
        @dib
        public T poll() throws Throwable {
            while (true) {
                T tPoll = this.f58860c.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f94838f.apply(tPoll);
                if (!this.f94837F) {
                    this.f94837F = true;
                    this.f94836C = kApply;
                    return tPoll;
                }
                if (!this.f94839m.test(this.f94836C, kApply)) {
                    this.f94836C = kApply;
                    return tPoll;
                }
                this.f94836C = kApply;
            }
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m16393d(mode);
        }
    }

    public wnb(wub<T> source, sy6<? super T, K> keySelector, l11<? super K, ? super K> comparer) {
        super(source);
        this.f94834b = keySelector;
        this.f94835c = comparer;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new C14704a(observer, this.f94834b, this.f94835c));
    }
}
