package p000;

import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class hwb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f45143b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f45144c;

    /* JADX INFO: renamed from: d */
    public final voe f45145d;

    /* JADX INFO: renamed from: e */
    public final xub<? extends T> f45146e;

    /* JADX INFO: renamed from: hwb$a */
    public static final class C7066a<T> implements oxb<T> {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f45147a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<mf4> f45148b;

        public C7066a(oxb<? super T> oxbVar, AtomicReference<mf4> atomicReference) {
            this.f45147a = oxbVar;
            this.f45148b = atomicReference;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f45147a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f45147a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f45147a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.replace(this.f45148b, mf4Var);
        }
    }

    /* JADX INFO: renamed from: hwb$b */
    public static final class C7067b<T> extends AtomicReference<mf4> implements oxb<T>, mf4, InterfaceC7069d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: C */
        public xub<? extends T> f45149C;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f45150a;

        /* JADX INFO: renamed from: b */
        public final long f45151b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f45152c;

        /* JADX INFO: renamed from: d */
        public final voe.AbstractC14185c f45153d;

        /* JADX INFO: renamed from: e */
        public final b0f f45154e = new b0f();

        /* JADX INFO: renamed from: f */
        public final AtomicLong f45155f = new AtomicLong();

        /* JADX INFO: renamed from: m */
        public final AtomicReference<mf4> f45156m = new AtomicReference<>();

        public C7067b(oxb<? super T> oxbVar, long j, TimeUnit timeUnit, voe.AbstractC14185c abstractC14185c, xub<? extends T> xubVar) {
            this.f45150a = oxbVar;
            this.f45151b = j;
            this.f45152c = timeUnit;
            this.f45153d = abstractC14185c;
            this.f45149C = xubVar;
        }

        /* JADX INFO: renamed from: a */
        public void m12653a(long j) {
            this.f45154e.replace(this.f45153d.schedule(new RunnableC7070e(j, this), this.f45151b, this.f45152c));
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this.f45156m);
            ag4.dispose(this);
            this.f45153d.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f45155f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f45154e.dispose();
                this.f45150a.onComplete();
                this.f45153d.dispose();
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f45155f.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                pfe.onError(th);
                return;
            }
            this.f45154e.dispose();
            this.f45150a.onError(th);
            this.f45153d.dispose();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            long j = this.f45155f.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.f45155f.compareAndSet(j, j2)) {
                    this.f45154e.get().dispose();
                    this.f45150a.onNext(t);
                    m12653a(j2);
                }
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f45156m, mf4Var);
        }

        @Override // p000.hwb.InterfaceC7069d
        public void onTimeout(long j) {
            if (this.f45155f.compareAndSet(j, Long.MAX_VALUE)) {
                ag4.dispose(this.f45156m);
                xub<? extends T> xubVar = this.f45149C;
                this.f45149C = null;
                xubVar.subscribe(new C7066a(this.f45150a, this));
                this.f45153d.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: hwb$c */
    public static final class C7068c<T> extends AtomicLong implements oxb<T>, mf4, InterfaceC7069d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f45157a;

        /* JADX INFO: renamed from: b */
        public final long f45158b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f45159c;

        /* JADX INFO: renamed from: d */
        public final voe.AbstractC14185c f45160d;

        /* JADX INFO: renamed from: e */
        public final b0f f45161e = new b0f();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<mf4> f45162f = new AtomicReference<>();

        public C7068c(oxb<? super T> oxbVar, long j, TimeUnit timeUnit, voe.AbstractC14185c abstractC14185c) {
            this.f45157a = oxbVar;
            this.f45158b = j;
            this.f45159c = timeUnit;
            this.f45160d = abstractC14185c;
        }

        /* JADX INFO: renamed from: a */
        public void m12654a(long j) {
            this.f45161e.replace(this.f45160d.schedule(new RunnableC7070e(j, this), this.f45158b, this.f45159c));
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this.f45162f);
            this.f45160d.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(this.f45162f.get());
        }

        @Override // p000.oxb
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f45161e.dispose();
                this.f45157a.onComplete();
                this.f45160d.dispose();
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                pfe.onError(th);
                return;
            }
            this.f45161e.dispose();
            this.f45157a.onError(th);
            this.f45160d.dispose();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    this.f45161e.get().dispose();
                    this.f45157a.onNext(t);
                    m12654a(j2);
                }
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f45162f, mf4Var);
        }

        @Override // p000.hwb.InterfaceC7069d
        public void onTimeout(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                ag4.dispose(this.f45162f);
                this.f45157a.onError(new TimeoutException(j75.timeoutMessage(this.f45158b, this.f45159c)));
                this.f45160d.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: hwb$d */
    public interface InterfaceC7069d {
        void onTimeout(long j);
    }

    /* JADX INFO: renamed from: hwb$e */
    public static final class RunnableC7070e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC7069d f45163a;

        /* JADX INFO: renamed from: b */
        public final long f45164b;

        public RunnableC7070e(long j, InterfaceC7069d interfaceC7069d) {
            this.f45164b = j;
            this.f45163a = interfaceC7069d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f45163a.onTimeout(this.f45164b);
        }
    }

    public hwb(Observable<T> observable, long j, TimeUnit timeUnit, voe voeVar, xub<? extends T> xubVar) {
        super(observable);
        this.f45143b = j;
        this.f45144c = timeUnit;
        this.f45145d = voeVar;
        this.f45146e = xubVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        if (this.f45146e == null) {
            C7068c c7068c = new C7068c(oxbVar, this.f45143b, this.f45144c, this.f45145d.createWorker());
            oxbVar.onSubscribe(c7068c);
            c7068c.m12654a(0L);
            this.f66354a.subscribe(c7068c);
            return;
        }
        C7067b c7067b = new C7067b(oxbVar, this.f45143b, this.f45144c, this.f45145d.createWorker(), this.f45146e);
        oxbVar.onSubscribe(c7067b);
        c7067b.m12653a(0L);
        this.f66354a.subscribe(c7067b);
    }
}
