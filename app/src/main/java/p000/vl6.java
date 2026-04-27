package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class vl6<T, U, R> extends AbstractC8162k1<T, R> {

    /* JADX INFO: renamed from: c */
    public final j11<? super T, ? super U, ? extends R> f91582c;

    /* JADX INFO: renamed from: d */
    public final zjd<? extends U> f91583d;

    /* JADX INFO: renamed from: vl6$a */
    public final class C14150a implements lj6<U> {

        /* JADX INFO: renamed from: a */
        public final C14151b<T, U, R> f91584a;

        public C14150a(C14151b<T, U, R> c14151b) {
            this.f91584a = c14151b;
        }

        @Override // p000.ycg
        public void onComplete() {
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f91584a.otherError(th);
        }

        @Override // p000.ycg
        public void onNext(U u) {
            this.f91584a.lazySet(u);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (this.f91584a.setOther(fdgVar)) {
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    /* JADX INFO: renamed from: vl6$b */
    public static final class C14151b<T, U, R> extends AtomicReference<U> implements cq2<T>, fdg {
        private static final long serialVersionUID = -312246233408980075L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f91586a;

        /* JADX INFO: renamed from: b */
        public final j11<? super T, ? super U, ? extends R> f91587b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<fdg> f91588c = new AtomicReference<>();

        /* JADX INFO: renamed from: d */
        public final AtomicLong f91589d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final AtomicReference<fdg> f91590e = new AtomicReference<>();

        public C14151b(ycg<? super R> ycgVar, j11<? super T, ? super U, ? extends R> j11Var) {
            this.f91586a = ycgVar;
            this.f91587b = j11Var;
        }

        @Override // p000.fdg
        public void cancel() {
            mdg.cancel(this.f91588c);
            mdg.cancel(this.f91590e);
        }

        @Override // p000.ycg
        public void onComplete() {
            mdg.cancel(this.f91590e);
            this.f91586a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            mdg.cancel(this.f91590e);
            this.f91586a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.f91588c.get().request(1L);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.deferredSetOnce(this.f91588c, this.f91589d, fdgVar);
        }

        public void otherError(Throwable th) {
            mdg.cancel(this.f91588c);
            this.f91586a.onError(th);
        }

        @Override // p000.fdg
        public void request(long j) {
            mdg.deferredRequest(this.f91588c, this.f91589d, j);
        }

        public boolean setOther(fdg fdgVar) {
            return mdg.setOnce(this.f91590e, fdgVar);
        }

        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            U u = get();
            if (u != null) {
                try {
                    this.f91586a.onNext(xjb.requireNonNull(this.f91587b.apply(t, u), "The combiner returned a null value"));
                    return true;
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    cancel();
                    this.f91586a.onError(th);
                }
            }
            return false;
        }
    }

    public vl6(m86<T> m86Var, j11<? super T, ? super U, ? extends R> j11Var, zjd<? extends U> zjdVar) {
        super(m86Var);
        this.f91582c = j11Var;
        this.f91583d = zjdVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        t1f t1fVar = new t1f(ycgVar);
        C14151b c14151b = new C14151b(t1fVar, this.f91582c);
        t1fVar.onSubscribe(c14151b);
        this.f91583d.subscribe(new C14150a(c14151b));
        this.f52360b.subscribe((lj6) c14151b);
    }
}
