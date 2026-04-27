package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class c5a<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final aaa<? extends T>[] f15804b;

    /* JADX INFO: renamed from: c5a$a */
    public static final class C2206a<T> extends AtomicInteger implements l9a<T>, fdg {
        private static final long serialVersionUID = 3520831347801429610L;

        /* JADX INFO: renamed from: C */
        public long f15805C;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f15806a;

        /* JADX INFO: renamed from: e */
        public final aaa<? extends T>[] f15810e;

        /* JADX INFO: renamed from: m */
        public int f15812m;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f15807b = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final b0f f15809d = new b0f();

        /* JADX INFO: renamed from: c */
        public final AtomicReference<Object> f15808c = new AtomicReference<>(ehb.COMPLETE);

        /* JADX INFO: renamed from: f */
        public final cc0 f15811f = new cc0();

        public C2206a(ycg<? super T> ycgVar, aaa<? extends T>[] aaaVarArr) {
            this.f15806a = ycgVar;
            this.f15810e = aaaVarArr;
        }

        /* JADX INFO: renamed from: a */
        public void m3777a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f15808c;
            ycg<? super T> ycgVar = this.f15806a;
            b0f b0fVar = this.f15809d;
            while (!b0fVar.isDisposed()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    if (obj != ehb.COMPLETE) {
                        long j = this.f15805C;
                        if (j != this.f15807b.get()) {
                            this.f15805C = j + 1;
                            atomicReference.lazySet(null);
                            ycgVar.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!b0fVar.isDisposed()) {
                        int i = this.f15812m;
                        aaa<? extends T>[] aaaVarArr = this.f15810e;
                        if (i == aaaVarArr.length) {
                            if (this.f15811f.get() != null) {
                                ycgVar.onError(this.f15811f.terminate());
                                return;
                            } else {
                                ycgVar.onComplete();
                                return;
                            }
                        }
                        this.f15812m = i + 1;
                        aaaVarArr[i].subscribe(this);
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f15809d.dispose();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f15808c.lazySet(ehb.COMPLETE);
            m3777a();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f15808c.lazySet(ehb.COMPLETE);
            if (this.f15811f.addThrowable(th)) {
                m3777a();
            } else {
                pfe.onError(th);
            }
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            this.f15809d.replace(mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f15808c.lazySet(t);
            m3777a();
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f15807b, j);
                m3777a();
            }
        }
    }

    public c5a(aaa<? extends T>[] aaaVarArr) {
        this.f15804b = aaaVarArr;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C2206a c2206a = new C2206a(ycgVar, this.f15804b);
        ycgVar.onSubscribe(c2206a);
        c2206a.m3777a();
    }
}
