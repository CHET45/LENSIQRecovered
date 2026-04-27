package p000;

import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class bwb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f15097b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f15098c;

    /* JADX INFO: renamed from: d */
    public final voe f15099d;

    /* JADX INFO: renamed from: e */
    public final boolean f15100e;

    /* JADX INFO: renamed from: bwb$a */
    public static final class RunnableC2093a<T> extends AtomicInteger implements oxb<T>, mf4, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f15101C;

        /* JADX INFO: renamed from: F */
        public Throwable f15102F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f15103H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f15104L;

        /* JADX INFO: renamed from: M */
        public boolean f15105M;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f15106a;

        /* JADX INFO: renamed from: b */
        public final long f15107b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f15108c;

        /* JADX INFO: renamed from: d */
        public final voe.AbstractC14185c f15109d;

        /* JADX INFO: renamed from: e */
        public final boolean f15110e;

        /* JADX INFO: renamed from: f */
        public final AtomicReference<T> f15111f = new AtomicReference<>();

        /* JADX INFO: renamed from: m */
        public mf4 f15112m;

        public RunnableC2093a(oxb<? super T> oxbVar, long j, TimeUnit timeUnit, voe.AbstractC14185c abstractC14185c, boolean z) {
            this.f15106a = oxbVar;
            this.f15107b = j;
            this.f15108c = timeUnit;
            this.f15109d = abstractC14185c;
            this.f15110e = z;
        }

        /* JADX INFO: renamed from: a */
        public void m3467a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f15111f;
            oxb<? super T> oxbVar = this.f15106a;
            int iAddAndGet = 1;
            while (!this.f15103H) {
                boolean z = this.f15101C;
                if (z && this.f15102F != null) {
                    atomicReference.lazySet(null);
                    oxbVar.onError(this.f15102F);
                    this.f15109d.dispose();
                    return;
                }
                boolean z2 = atomicReference.get() == null;
                if (z) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z2 && this.f15110e) {
                        oxbVar.onNext(andSet);
                    }
                    oxbVar.onComplete();
                    this.f15109d.dispose();
                    return;
                }
                if (z2) {
                    if (this.f15104L) {
                        this.f15105M = false;
                        this.f15104L = false;
                    }
                } else if (!this.f15105M || this.f15104L) {
                    oxbVar.onNext(atomicReference.getAndSet(null));
                    this.f15104L = false;
                    this.f15105M = true;
                    this.f15109d.schedule(this, this.f15107b, this.f15108c);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // p000.mf4
        public void dispose() {
            this.f15103H = true;
            this.f15112m.dispose();
            this.f15109d.dispose();
            if (getAndIncrement() == 0) {
                this.f15111f.lazySet(null);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f15103H;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f15101C = true;
            m3467a();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f15102F = th;
            this.f15101C = true;
            m3467a();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f15111f.set(t);
            m3467a();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f15112m, mf4Var)) {
                this.f15112m = mf4Var;
                this.f15106a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15104L = true;
            m3467a();
        }
    }

    public bwb(Observable<T> observable, long j, TimeUnit timeUnit, voe voeVar, boolean z) {
        super(observable);
        this.f15097b = j;
        this.f15098c = timeUnit;
        this.f15099d = voeVar;
        this.f15100e = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new RunnableC2093a(oxbVar, this.f15097b, this.f15098c, this.f15099d.createWorker(), this.f15100e));
    }
}
