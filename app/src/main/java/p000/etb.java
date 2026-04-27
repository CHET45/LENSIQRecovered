package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class etb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final eb1 f34011b;

    /* JADX INFO: renamed from: etb$a */
    public static final class C5465a<T> extends AtomicInteger implements oxb<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f34012a;

        /* JADX INFO: renamed from: b */
        public final b0f f34013b;

        /* JADX INFO: renamed from: c */
        public final xub<? extends T> f34014c;

        /* JADX INFO: renamed from: d */
        public final eb1 f34015d;

        public C5465a(oxb<? super T> oxbVar, eb1 eb1Var, b0f b0fVar, xub<? extends T> xubVar) {
            this.f34012a = oxbVar;
            this.f34013b = b0fVar;
            this.f34014c = xubVar;
            this.f34015d = eb1Var;
        }

        /* JADX INFO: renamed from: a */
        public void m10227a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    this.f34014c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // p000.oxb
        public void onComplete() {
            try {
                if (this.f34015d.getAsBoolean()) {
                    this.f34012a.onComplete();
                } else {
                    m10227a();
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f34012a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f34012a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f34012a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            this.f34013b.replace(mf4Var);
        }
    }

    public etb(Observable<T> observable, eb1 eb1Var) {
        super(observable);
        this.f34011b = eb1Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        b0f b0fVar = new b0f();
        oxbVar.onSubscribe(b0fVar);
        new C5465a(oxbVar, this.f34011b, b0fVar, this.f66354a).m10227a();
    }
}
