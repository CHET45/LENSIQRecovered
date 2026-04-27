package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class a5a<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final aaa<? extends T>[] f438b;

    /* JADX INFO: renamed from: a5a$a */
    public static final class C0067a<T> extends AtomicInteger implements l9a<T>, fdg {
        private static final long serialVersionUID = 3520831347801429610L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f439a;

        /* JADX INFO: renamed from: e */
        public final aaa<? extends T>[] f443e;

        /* JADX INFO: renamed from: f */
        public int f444f;

        /* JADX INFO: renamed from: m */
        public long f445m;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f440b = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final b0f f442d = new b0f();

        /* JADX INFO: renamed from: c */
        public final AtomicReference<Object> f441c = new AtomicReference<>(ehb.COMPLETE);

        public C0067a(ycg<? super T> ycgVar, aaa<? extends T>[] aaaVarArr) {
            this.f439a = ycgVar;
            this.f443e = aaaVarArr;
        }

        /* JADX INFO: renamed from: a */
        public void m158a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f441c;
            ycg<? super T> ycgVar = this.f439a;
            b0f b0fVar = this.f442d;
            while (!b0fVar.isDisposed()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    if (obj != ehb.COMPLETE) {
                        long j = this.f445m;
                        if (j != this.f440b.get()) {
                            this.f445m = j + 1;
                            atomicReference.lazySet(null);
                            ycgVar.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!b0fVar.isDisposed()) {
                        int i = this.f444f;
                        aaa<? extends T>[] aaaVarArr = this.f443e;
                        if (i == aaaVarArr.length) {
                            ycgVar.onComplete();
                            return;
                        } else {
                            this.f444f = i + 1;
                            aaaVarArr[i].subscribe(this);
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
            this.f442d.dispose();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f441c.lazySet(ehb.COMPLETE);
            m158a();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f439a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            this.f442d.replace(mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f441c.lazySet(t);
            m158a();
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f440b, j);
                m158a();
            }
        }
    }

    public a5a(aaa<? extends T>[] aaaVarArr) {
        this.f438b = aaaVarArr;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C0067a c0067a = new C0067a(ycgVar, this.f438b);
        ycgVar.onSubscribe(c0067a);
        c0067a.m158a();
    }
}
