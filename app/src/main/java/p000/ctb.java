package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class ctb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f27520b;

    /* JADX INFO: renamed from: ctb$a */
    public static final class C4494a<T> extends AtomicInteger implements oxb<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f27521a;

        /* JADX INFO: renamed from: b */
        public final b0f f27522b;

        /* JADX INFO: renamed from: c */
        public final xub<? extends T> f27523c;

        /* JADX INFO: renamed from: d */
        public long f27524d;

        public C4494a(oxb<? super T> oxbVar, long j, b0f b0fVar, xub<? extends T> xubVar) {
            this.f27521a = oxbVar;
            this.f27522b = b0fVar;
            this.f27523c = xubVar;
            this.f27524d = j;
        }

        /* JADX INFO: renamed from: a */
        public void m8685a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f27522b.isDisposed()) {
                    this.f27523c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.oxb
        public void onComplete() {
            long j = this.f27524d;
            if (j != Long.MAX_VALUE) {
                this.f27524d = j - 1;
            }
            if (j != 0) {
                m8685a();
            } else {
                this.f27521a.onComplete();
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f27521a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f27521a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            this.f27522b.replace(mf4Var);
        }
    }

    public ctb(Observable<T> observable, long j) {
        super(observable);
        this.f27520b = j;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        b0f b0fVar = new b0f();
        oxbVar.onSubscribe(b0fVar);
        long j = this.f27520b;
        new C4494a(oxbVar, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, b0fVar, this.f66354a).m8685a();
    }
}
