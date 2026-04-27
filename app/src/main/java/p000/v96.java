package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class v96<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final zjd<? extends T>[] f90370b;

    /* JADX INFO: renamed from: c */
    public final boolean f90371c;

    /* JADX INFO: renamed from: v96$a */
    public static final class C13944a<T> extends gdg implements kj6<T> {
        private static final long serialVersionUID = -8158322871608889516L;

        /* JADX INFO: renamed from: F */
        public final ycg<? super T> f90372F;

        /* JADX INFO: renamed from: H */
        public final zjd<? extends T>[] f90373H;

        /* JADX INFO: renamed from: L */
        public final boolean f90374L;

        /* JADX INFO: renamed from: M */
        public final AtomicInteger f90375M;

        /* JADX INFO: renamed from: N */
        public int f90376N;

        /* JADX INFO: renamed from: Q */
        public List<Throwable> f90377Q;

        /* JADX INFO: renamed from: X */
        public long f90378X;

        public C13944a(zjd<? extends T>[] sources, boolean delayError, ycg<? super T> downstream) {
            super(false);
            this.f90372F = downstream;
            this.f90373H = sources;
            this.f90374L = delayError;
            this.f90375M = new AtomicInteger();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f90375M.getAndIncrement() == 0) {
                zjd<? extends T>[] zjdVarArr = this.f90373H;
                int length = zjdVarArr.length;
                int i = this.f90376N;
                while (i != length) {
                    zjd<? extends T> zjdVar = zjdVarArr[i];
                    if (zjdVar == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (!this.f90374L) {
                            this.f90372F.onError(nullPointerException);
                            return;
                        }
                        List arrayList = this.f90377Q;
                        if (arrayList == null) {
                            arrayList = new ArrayList((length - i) + 1);
                            this.f90377Q = arrayList;
                        }
                        arrayList.add(nullPointerException);
                        i++;
                    } else {
                        long j = this.f90378X;
                        if (j != 0) {
                            this.f90378X = 0L;
                            produced(j);
                        }
                        zjdVar.subscribe(this);
                        i++;
                        this.f90376N = i;
                        if (this.f90375M.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list = this.f90377Q;
                if (list == null) {
                    this.f90372F.onComplete();
                } else if (list.size() == 1) {
                    this.f90372F.onError(list.get(0));
                } else {
                    this.f90372F.onError(new qm2(list));
                }
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (!this.f90374L) {
                this.f90372F.onError(t);
                return;
            }
            List arrayList = this.f90377Q;
            if (arrayList == null) {
                arrayList = new ArrayList((this.f90373H.length - this.f90376N) + 1);
                this.f90377Q = arrayList;
            }
            arrayList.add(t);
            onComplete();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f90378X++;
            this.f90372F.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            setSubscription(s);
        }
    }

    public v96(zjd<? extends T>[] sources, boolean delayError) {
        this.f90370b = sources;
        this.f90371c = delayError;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        C13944a c13944a = new C13944a(this.f90370b, this.f90371c, s);
        s.onSubscribe(c13944a);
        c13944a.onComplete();
    }
}
