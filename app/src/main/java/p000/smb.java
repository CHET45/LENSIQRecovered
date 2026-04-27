package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class smb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final aaa<? extends T> f82245b;

    /* JADX INFO: renamed from: smb$a */
    public static final class C12661a<T> extends AtomicReference<mf4> implements oxb<T>, l9a<T>, mf4 {
        private static final long serialVersionUID = -1953724749712440952L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f82246a;

        /* JADX INFO: renamed from: b */
        public aaa<? extends T> f82247b;

        /* JADX INFO: renamed from: c */
        public boolean f82248c;

        public C12661a(oxb<? super T> oxbVar, aaa<? extends T> aaaVar) {
            this.f82246a = oxbVar;
            this.f82247b = aaaVar;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f82248c) {
                this.f82246a.onComplete();
                return;
            }
            this.f82248c = true;
            ag4.replace(this, null);
            aaa<? extends T> aaaVar = this.f82247b;
            this.f82247b = null;
            aaaVar.subscribe(this);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f82246a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f82246a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (!ag4.setOnce(this, mf4Var) || this.f82248c) {
                return;
            }
            this.f82246a.onSubscribe(this);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f82246a.onNext(t);
            this.f82246a.onComplete();
        }
    }

    public smb(Observable<T> observable, aaa<? extends T> aaaVar) {
        super(observable);
        this.f82245b = aaaVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C12661a(oxbVar, this.f82245b));
    }
}
