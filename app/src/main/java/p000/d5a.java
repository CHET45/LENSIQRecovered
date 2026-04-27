package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class d5a<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final z9a<? extends T>[] f28463b;

    /* JADX INFO: renamed from: d5a$a */
    public static final class C4618a<T> extends AtomicInteger implements k9a<T>, fdg {
        private static final long serialVersionUID = 3520831347801429610L;

        /* JADX INFO: renamed from: C */
        public long f28464C;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f28465a;

        /* JADX INFO: renamed from: e */
        public final z9a<? extends T>[] f28469e;

        /* JADX INFO: renamed from: m */
        public int f28471m;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f28466b = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final a0f f28468d = new a0f();

        /* JADX INFO: renamed from: c */
        public final AtomicReference<Object> f28467c = new AtomicReference<>(fhb.COMPLETE);

        /* JADX INFO: renamed from: f */
        public final bc0 f28470f = new bc0();

        public C4618a(ycg<? super T> actual, z9a<? extends T>[] sources) {
            this.f28465a = actual;
            this.f28469e = sources;
        }

        /* JADX INFO: renamed from: a */
        public void m8888a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f28467c;
            ycg<? super T> ycgVar = this.f28465a;
            a0f a0fVar = this.f28468d;
            while (!a0fVar.isDisposed()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    if (obj != fhb.COMPLETE) {
                        long j = this.f28464C;
                        if (j != this.f28466b.get()) {
                            this.f28464C = j + 1;
                            atomicReference.lazySet(null);
                            ycgVar.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!a0fVar.isDisposed()) {
                        int i = this.f28471m;
                        z9a<? extends T>[] z9aVarArr = this.f28469e;
                        if (i == z9aVarArr.length) {
                            this.f28470f.tryTerminateConsumer(this.f28465a);
                            return;
                        } else {
                            this.f28471m = i + 1;
                            z9aVarArr[i].subscribe(this);
                        }
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
            this.f28468d.dispose();
            this.f28470f.tryTerminateAndReport();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f28467c.lazySet(fhb.COMPLETE);
            m8888a();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f28467c.lazySet(fhb.COMPLETE);
            if (this.f28470f.tryAddThrowableOrReport(e)) {
                m8888a();
            }
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            this.f28468d.replace(d);
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f28467c.lazySet(value);
            m8888a();
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f28466b, n);
                m8888a();
            }
        }
    }

    public d5a(z9a<? extends T>[] sources) {
        this.f28463b = sources;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        C4618a c4618a = new C4618a(s, this.f28463b);
        s.onSubscribe(c4618a);
        c4618a.m8888a();
    }
}
