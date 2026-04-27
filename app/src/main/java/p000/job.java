package p000;

import io.reactivex.Observable;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class job<T> extends ljf<T> implements z07<T> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f51355a;

    /* JADX INFO: renamed from: b */
    public final long f51356b;

    /* JADX INFO: renamed from: c */
    public final T f51357c;

    /* JADX INFO: renamed from: job$a */
    public static final class C7995a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f51358a;

        /* JADX INFO: renamed from: b */
        public final long f51359b;

        /* JADX INFO: renamed from: c */
        public final T f51360c;

        /* JADX INFO: renamed from: d */
        public mf4 f51361d;

        /* JADX INFO: renamed from: e */
        public long f51362e;

        /* JADX INFO: renamed from: f */
        public boolean f51363f;

        public C7995a(inf<? super T> infVar, long j, T t) {
            this.f51358a = infVar;
            this.f51359b = j;
            this.f51360c = t;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f51361d.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f51361d.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f51363f) {
                return;
            }
            this.f51363f = true;
            T t = this.f51360c;
            if (t != null) {
                this.f51358a.onSuccess(t);
            } else {
                this.f51358a.onError(new NoSuchElementException());
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f51363f) {
                pfe.onError(th);
            } else {
                this.f51363f = true;
                this.f51358a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f51363f) {
                return;
            }
            long j = this.f51362e;
            if (j != this.f51359b) {
                this.f51362e = j + 1;
                return;
            }
            this.f51363f = true;
            this.f51361d.dispose();
            this.f51358a.onSuccess(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f51361d, mf4Var)) {
                this.f51361d = mf4Var;
                this.f51358a.onSubscribe(this);
            }
        }
    }

    public job(xub<T> xubVar, long j, T t) {
        this.f51355a = xubVar;
        this.f51356b = j;
        this.f51357c = t;
    }

    @Override // p000.z07
    public Observable<T> fuseToObservable() {
        return pfe.onAssembly(new fob(this.f51355a, this.f51356b, this.f51357c, true));
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f51355a.subscribe(new C7995a(infVar, this.f51356b, this.f51357c));
    }
}
