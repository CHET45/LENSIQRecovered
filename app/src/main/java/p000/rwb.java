package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class rwb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final voe f79949b;

    /* JADX INFO: renamed from: rwb$a */
    public static final class C12336a<T> extends AtomicBoolean implements oxb<T>, mf4 {
        private static final long serialVersionUID = 1015244841293359600L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f79950a;

        /* JADX INFO: renamed from: b */
        public final voe f79951b;

        /* JADX INFO: renamed from: c */
        public mf4 f79952c;

        /* JADX INFO: renamed from: rwb$a$a */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C12336a.this.f79952c.dispose();
            }
        }

        public C12336a(oxb<? super T> oxbVar, voe voeVar) {
            this.f79950a = oxbVar;
            this.f79951b = voeVar;
        }

        @Override // p000.mf4
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f79951b.scheduleDirect(new a());
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (get()) {
                return;
            }
            this.f79950a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (get()) {
                pfe.onError(th);
            } else {
                this.f79950a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.f79950a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f79952c, mf4Var)) {
                this.f79952c = mf4Var;
                this.f79950a.onSubscribe(this);
            }
        }
    }

    public rwb(xub<T> xubVar, voe voeVar) {
        super(xubVar);
        this.f79949b = voeVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C12336a(oxbVar, this.f79949b));
    }
}
