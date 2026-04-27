package p000;

import io.reactivex.Observable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class wwb<T> extends AbstractC10162o3<T, Observable<T>> {

    /* JADX INFO: renamed from: b */
    public final long f95601b;

    /* JADX INFO: renamed from: c */
    public final long f95602c;

    /* JADX INFO: renamed from: d */
    public final int f95603d;

    /* JADX INFO: renamed from: wwb$a */
    public static final class RunnableC14814a<T> extends AtomicInteger implements oxb<T>, mf4, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super Observable<T>> f95604a;

        /* JADX INFO: renamed from: b */
        public final long f95605b;

        /* JADX INFO: renamed from: c */
        public final int f95606c;

        /* JADX INFO: renamed from: d */
        public long f95607d;

        /* JADX INFO: renamed from: e */
        public mf4 f95608e;

        /* JADX INFO: renamed from: f */
        public psh<T> f95609f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f95610m;

        public RunnableC14814a(oxb<? super Observable<T>> oxbVar, long j, int i) {
            this.f95604a = oxbVar;
            this.f95605b = j;
            this.f95606c = i;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f95610m = true;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f95610m;
        }

        @Override // p000.oxb
        public void onComplete() {
            psh<T> pshVar = this.f95609f;
            if (pshVar != null) {
                this.f95609f = null;
                pshVar.onComplete();
            }
            this.f95604a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            psh<T> pshVar = this.f95609f;
            if (pshVar != null) {
                this.f95609f = null;
                pshVar.onError(th);
            }
            this.f95604a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            psh<T> pshVarCreate = this.f95609f;
            if (pshVarCreate == null && !this.f95610m) {
                pshVarCreate = psh.create(this.f95606c, this);
                this.f95609f = pshVarCreate;
                this.f95604a.onNext(pshVarCreate);
            }
            if (pshVarCreate != null) {
                pshVarCreate.onNext(t);
                long j = this.f95607d + 1;
                this.f95607d = j;
                if (j >= this.f95605b) {
                    this.f95607d = 0L;
                    this.f95609f = null;
                    pshVarCreate.onComplete();
                    if (this.f95610m) {
                        this.f95608e.dispose();
                    }
                }
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f95608e, mf4Var)) {
                this.f95608e = mf4Var;
                this.f95604a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f95610m) {
                this.f95608e.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: wwb$b */
    public static final class RunnableC14815b<T> extends AtomicBoolean implements oxb<T>, mf4, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;

        /* JADX INFO: renamed from: C */
        public long f95611C;

        /* JADX INFO: renamed from: F */
        public mf4 f95612F;

        /* JADX INFO: renamed from: a */
        public final oxb<? super Observable<T>> f95614a;

        /* JADX INFO: renamed from: b */
        public final long f95615b;

        /* JADX INFO: renamed from: c */
        public final long f95616c;

        /* JADX INFO: renamed from: d */
        public final int f95617d;

        /* JADX INFO: renamed from: f */
        public long f95619f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f95620m;

        /* JADX INFO: renamed from: H */
        public final AtomicInteger f95613H = new AtomicInteger();

        /* JADX INFO: renamed from: e */
        public final ArrayDeque<psh<T>> f95618e = new ArrayDeque<>();

        public RunnableC14815b(oxb<? super Observable<T>> oxbVar, long j, long j2, int i) {
            this.f95614a = oxbVar;
            this.f95615b = j;
            this.f95616c = j2;
            this.f95617d = i;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f95620m = true;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f95620m;
        }

        @Override // p000.oxb
        public void onComplete() {
            ArrayDeque<psh<T>> arrayDeque = this.f95618e;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.f95614a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            ArrayDeque<psh<T>> arrayDeque = this.f95618e;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th);
            }
            this.f95614a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            ArrayDeque<psh<T>> arrayDeque = this.f95618e;
            long j = this.f95619f;
            long j2 = this.f95616c;
            if (j % j2 == 0 && !this.f95620m) {
                this.f95613H.getAndIncrement();
                psh<T> pshVarCreate = psh.create(this.f95617d, this);
                arrayDeque.offer(pshVarCreate);
                this.f95614a.onNext(pshVarCreate);
            }
            long j3 = this.f95611C + 1;
            Iterator<psh<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            if (j3 >= this.f95615b) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.f95620m) {
                    this.f95612F.dispose();
                    return;
                }
                this.f95611C = j3 - j2;
            } else {
                this.f95611C = j3;
            }
            this.f95619f = j + 1;
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f95612F, mf4Var)) {
                this.f95612F = mf4Var;
                this.f95614a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f95613H.decrementAndGet() == 0 && this.f95620m) {
                this.f95612F.dispose();
            }
        }
    }

    public wwb(xub<T> xubVar, long j, long j2, int i) {
        super(xubVar);
        this.f95601b = j;
        this.f95602c = j2;
        this.f95603d = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super Observable<T>> oxbVar) {
        if (this.f95601b == this.f95602c) {
            this.f66354a.subscribe(new RunnableC14814a(oxbVar, this.f95601b, this.f95603d));
        } else {
            this.f66354a.subscribe(new RunnableC14815b(oxbVar, this.f95601b, this.f95602c, this.f95603d));
        }
    }
}
