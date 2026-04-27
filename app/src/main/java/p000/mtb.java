package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class mtb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final m8d<? super Throwable> f62100b;

    /* JADX INFO: renamed from: c */
    public final long f62101c;

    /* JADX INFO: renamed from: mtb$a */
    public static final class C9521a<T> extends AtomicInteger implements oxb<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f62102a;

        /* JADX INFO: renamed from: b */
        public final b0f f62103b;

        /* JADX INFO: renamed from: c */
        public final xub<? extends T> f62104c;

        /* JADX INFO: renamed from: d */
        public final m8d<? super Throwable> f62105d;

        /* JADX INFO: renamed from: e */
        public long f62106e;

        public C9521a(oxb<? super T> oxbVar, long j, m8d<? super Throwable> m8dVar, b0f b0fVar, xub<? extends T> xubVar) {
            this.f62102a = oxbVar;
            this.f62103b = b0fVar;
            this.f62104c = xubVar;
            this.f62105d = m8dVar;
            this.f62106e = j;
        }

        /* JADX INFO: renamed from: a */
        public void m17560a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f62103b.isDisposed()) {
                    this.f62104c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f62102a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            long j = this.f62106e;
            if (j != Long.MAX_VALUE) {
                this.f62106e = j - 1;
            }
            if (j == 0) {
                this.f62102a.onError(th);
                return;
            }
            try {
                if (this.f62105d.test(th)) {
                    m17560a();
                } else {
                    this.f62102a.onError(th);
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f62102a.onError(new pm2(th, th2));
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f62102a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            this.f62103b.replace(mf4Var);
        }
    }

    public mtb(Observable<T> observable, long j, m8d<? super Throwable> m8dVar) {
        super(observable);
        this.f62100b = m8dVar;
        this.f62101c = j;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        b0f b0fVar = new b0f();
        oxbVar.onSubscribe(b0fVar);
        new C9521a(oxbVar, this.f62101c, this.f62100b, b0fVar, this.f66354a).m17560a();
    }
}
