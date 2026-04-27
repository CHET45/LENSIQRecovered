package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class fob<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f37246b;

    /* JADX INFO: renamed from: c */
    public final T f37247c;

    /* JADX INFO: renamed from: d */
    public final boolean f37248d;

    /* JADX INFO: renamed from: fob$a */
    public static final class C5905a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f37249a;

        /* JADX INFO: renamed from: b */
        public final long f37250b;

        /* JADX INFO: renamed from: c */
        public final T f37251c;

        /* JADX INFO: renamed from: d */
        public final boolean f37252d;

        /* JADX INFO: renamed from: e */
        public mf4 f37253e;

        /* JADX INFO: renamed from: f */
        public long f37254f;

        /* JADX INFO: renamed from: m */
        public boolean f37255m;

        public C5905a(oxb<? super T> oxbVar, long j, T t, boolean z) {
            this.f37249a = oxbVar;
            this.f37250b = j;
            this.f37251c = t;
            this.f37252d = z;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f37253e.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f37253e.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f37255m) {
                return;
            }
            this.f37255m = true;
            T t = this.f37251c;
            if (t == null && this.f37252d) {
                this.f37249a.onError(new NoSuchElementException());
                return;
            }
            if (t != null) {
                this.f37249a.onNext(t);
            }
            this.f37249a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f37255m) {
                pfe.onError(th);
            } else {
                this.f37255m = true;
                this.f37249a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f37255m) {
                return;
            }
            long j = this.f37254f;
            if (j != this.f37250b) {
                this.f37254f = j + 1;
                return;
            }
            this.f37255m = true;
            this.f37253e.dispose();
            this.f37249a.onNext(t);
            this.f37249a.onComplete();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f37253e, mf4Var)) {
                this.f37253e = mf4Var;
                this.f37249a.onSubscribe(this);
            }
        }
    }

    public fob(xub<T> xubVar, long j, T t, boolean z) {
        super(xubVar);
        this.f37246b = j;
        this.f37247c = t;
        this.f37248d = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C5905a(oxbVar, this.f37246b, this.f37247c, this.f37248d));
    }
}
