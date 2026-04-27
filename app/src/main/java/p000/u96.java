package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class u96<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final zjd<? extends T>[] f87163b;

    /* JADX INFO: renamed from: c */
    public final boolean f87164c;

    /* JADX INFO: renamed from: u96$a */
    public static final class C13413a<T> extends hdg implements lj6<T> {
        private static final long serialVersionUID = -8158322871608889516L;

        /* JADX INFO: renamed from: F */
        public final ycg<? super T> f87165F;

        /* JADX INFO: renamed from: H */
        public final zjd<? extends T>[] f87166H;

        /* JADX INFO: renamed from: L */
        public final boolean f87167L;

        /* JADX INFO: renamed from: M */
        public final AtomicInteger f87168M;

        /* JADX INFO: renamed from: N */
        public int f87169N;

        /* JADX INFO: renamed from: Q */
        public List<Throwable> f87170Q;

        /* JADX INFO: renamed from: X */
        public long f87171X;

        public C13413a(zjd<? extends T>[] zjdVarArr, boolean z, ycg<? super T> ycgVar) {
            super(false);
            this.f87165F = ycgVar;
            this.f87166H = zjdVarArr;
            this.f87167L = z;
            this.f87168M = new AtomicInteger();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f87168M.getAndIncrement() == 0) {
                zjd<? extends T>[] zjdVarArr = this.f87166H;
                int length = zjdVarArr.length;
                int i = this.f87169N;
                while (i != length) {
                    zjd<? extends T> zjdVar = zjdVarArr[i];
                    if (zjdVar == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (!this.f87167L) {
                            this.f87165F.onError(nullPointerException);
                            return;
                        }
                        List arrayList = this.f87170Q;
                        if (arrayList == null) {
                            arrayList = new ArrayList((length - i) + 1);
                            this.f87170Q = arrayList;
                        }
                        arrayList.add(nullPointerException);
                        i++;
                    } else {
                        long j = this.f87171X;
                        if (j != 0) {
                            this.f87171X = 0L;
                            produced(j);
                        }
                        zjdVar.subscribe(this);
                        i++;
                        this.f87169N = i;
                        if (this.f87168M.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list = this.f87170Q;
                if (list == null) {
                    this.f87165F.onComplete();
                } else if (list.size() == 1) {
                    this.f87165F.onError(list.get(0));
                } else {
                    this.f87165F.onError(new pm2(list));
                }
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f87167L) {
                this.f87165F.onError(th);
                return;
            }
            List arrayList = this.f87170Q;
            if (arrayList == null) {
                arrayList = new ArrayList((this.f87166H.length - this.f87169N) + 1);
                this.f87170Q = arrayList;
            }
            arrayList.add(th);
            onComplete();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f87171X++;
            this.f87165F.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            setSubscription(fdgVar);
        }
    }

    public u96(zjd<? extends T>[] zjdVarArr, boolean z) {
        this.f87163b = zjdVarArr;
        this.f87164c = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C13413a c13413a = new C13413a(this.f87163b, this.f87164c, ycgVar);
        ycgVar.onSubscribe(c13413a);
        c13413a.onComplete();
    }
}
