package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class vnb<T, K> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, K> f91786b;

    /* JADX INFO: renamed from: c */
    public final m11<? super K, ? super K> f91787c;

    /* JADX INFO: renamed from: vnb$a */
    public static final class C14177a<T, K> extends mv0<T, T> {

        /* JADX INFO: renamed from: C */
        public K f91788C;

        /* JADX INFO: renamed from: F */
        public boolean f91789F;

        /* JADX INFO: renamed from: f */
        public final py6<? super T, K> f91790f;

        /* JADX INFO: renamed from: m */
        public final m11<? super K, ? super K> f91791m;

        public C14177a(oxb<? super T> oxbVar, py6<? super T, K> py6Var, m11<? super K, ? super K> m11Var) {
            super(oxbVar);
            this.f91790f = py6Var;
            this.f91791m = m11Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f62355d) {
                return;
            }
            if (this.f62356e != 0) {
                this.f62352a.onNext((Object) t);
                return;
            }
            try {
                K kApply = this.f91790f.apply(t);
                if (this.f91789F) {
                    boolean zTest = this.f91791m.test(this.f91788C, kApply);
                    this.f91788C = kApply;
                    if (zTest) {
                        return;
                    }
                } else {
                    this.f91789F = true;
                    this.f91788C = kApply;
                }
                this.f62352a.onNext((Object) t);
            } catch (Throwable th) {
                m17581c(th);
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.f62354c.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f91790f.apply(tPoll);
                if (!this.f91789F) {
                    this.f91789F = true;
                    this.f91788C = kApply;
                    return tPoll;
                }
                if (!this.f91791m.test(this.f91788C, kApply)) {
                    this.f91788C = kApply;
                    return tPoll;
                }
                this.f91788C = kApply;
            }
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return m17582d(i);
        }
    }

    public vnb(xub<T> xubVar, py6<? super T, K> py6Var, m11<? super K, ? super K> m11Var) {
        super(xubVar);
        this.f91786b = py6Var;
        this.f91787c = m11Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C14177a(oxbVar, this.f91786b, this.f91787c));
    }
}
