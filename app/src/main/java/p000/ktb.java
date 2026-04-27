package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class ktb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final m11<? super Integer, ? super Throwable> f55307b;

    /* JADX INFO: renamed from: ktb$a */
    public static final class C8520a<T> extends AtomicInteger implements oxb<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f55308a;

        /* JADX INFO: renamed from: b */
        public final b0f f55309b;

        /* JADX INFO: renamed from: c */
        public final xub<? extends T> f55310c;

        /* JADX INFO: renamed from: d */
        public final m11<? super Integer, ? super Throwable> f55311d;

        /* JADX INFO: renamed from: e */
        public int f55312e;

        public C8520a(oxb<? super T> oxbVar, m11<? super Integer, ? super Throwable> m11Var, b0f b0fVar, xub<? extends T> xubVar) {
            this.f55308a = oxbVar;
            this.f55309b = b0fVar;
            this.f55310c = xubVar;
            this.f55311d = m11Var;
        }

        /* JADX INFO: renamed from: a */
        public void m14991a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f55309b.isDisposed()) {
                    this.f55310c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f55308a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            try {
                m11<? super Integer, ? super Throwable> m11Var = this.f55311d;
                int i = this.f55312e + 1;
                this.f55312e = i;
                if (m11Var.test(Integer.valueOf(i), th)) {
                    m14991a();
                } else {
                    this.f55308a.onError(th);
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f55308a.onError(new pm2(th, th2));
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f55308a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            this.f55309b.replace(mf4Var);
        }
    }

    public ktb(Observable<T> observable, m11<? super Integer, ? super Throwable> m11Var) {
        super(observable);
        this.f55307b = m11Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        b0f b0fVar = new b0f();
        oxbVar.onSubscribe(b0fVar);
        new C8520a(oxbVar, this.f55307b, b0fVar, this.f66354a).m14991a();
    }
}
