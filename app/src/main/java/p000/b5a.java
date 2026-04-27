package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class b5a<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final z9a<? extends T>[] f12709b;

    /* JADX INFO: renamed from: b5a$a */
    public static final class C1741a<T> extends AtomicInteger implements k9a<T>, fdg {
        private static final long serialVersionUID = 3520831347801429610L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f12710a;

        /* JADX INFO: renamed from: e */
        public final z9a<? extends T>[] f12714e;

        /* JADX INFO: renamed from: f */
        public int f12715f;

        /* JADX INFO: renamed from: m */
        public long f12716m;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f12711b = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final a0f f12713d = new a0f();

        /* JADX INFO: renamed from: c */
        public final AtomicReference<Object> f12712c = new AtomicReference<>(fhb.COMPLETE);

        public C1741a(ycg<? super T> actual, z9a<? extends T>[] sources) {
            this.f12710a = actual;
            this.f12714e = sources;
        }

        /* JADX INFO: renamed from: a */
        public void m2937a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f12712c;
            ycg<? super T> ycgVar = this.f12710a;
            a0f a0fVar = this.f12713d;
            while (!a0fVar.isDisposed()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    if (obj != fhb.COMPLETE) {
                        long j = this.f12716m;
                        if (j != this.f12711b.get()) {
                            this.f12716m = j + 1;
                            atomicReference.lazySet(null);
                            ycgVar.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!a0fVar.isDisposed()) {
                        int i = this.f12715f;
                        z9a<? extends T>[] z9aVarArr = this.f12714e;
                        if (i == z9aVarArr.length) {
                            ycgVar.onComplete();
                            return;
                        } else {
                            this.f12715f = i + 1;
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
            this.f12713d.dispose();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f12712c.lazySet(fhb.COMPLETE);
            m2937a();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f12710a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            this.f12713d.replace(d);
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f12712c.lazySet(value);
            m2937a();
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f12711b, n);
                m2937a();
            }
        }
    }

    public b5a(z9a<? extends T>[] sources) {
        this.f12709b = sources;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        C1741a c1741a = new C1741a(s, this.f12709b);
        s.onSubscribe(c1741a);
        c1741a.m2937a();
    }
}
