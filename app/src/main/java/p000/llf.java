package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class llf<T> extends kjf<Boolean> {

    /* JADX INFO: renamed from: a */
    public final oof<? extends T> f58187a;

    /* JADX INFO: renamed from: b */
    public final oof<? extends T> f58188b;

    /* JADX INFO: renamed from: llf$a */
    public static class C8891a<T> implements hnf<T> {

        /* JADX INFO: renamed from: a */
        public final int f58189a;

        /* JADX INFO: renamed from: b */
        public final mm2 f58190b;

        /* JADX INFO: renamed from: c */
        public final Object[] f58191c;

        /* JADX INFO: renamed from: d */
        public final hnf<? super Boolean> f58192d;

        /* JADX INFO: renamed from: e */
        public final AtomicInteger f58193e;

        public C8891a(int index, mm2 set, Object[] values, hnf<? super Boolean> observer, AtomicInteger count) {
            this.f58189a = index;
            this.f58190b = set;
            this.f58191c = values;
            this.f58192d = observer;
            this.f58193e = count;
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            int andSet = this.f58193e.getAndSet(-1);
            if (andSet != 0 && andSet != 1) {
                ofe.onError(e);
            } else {
                this.f58190b.dispose();
                this.f58192d.onError(e);
            }
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            this.f58190b.add(d);
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            this.f58191c[this.f58189a] = value;
            if (this.f58193e.incrementAndGet() == 2) {
                hnf<? super Boolean> hnfVar = this.f58192d;
                Object[] objArr = this.f58191c;
                hnfVar.onSuccess(Boolean.valueOf(Objects.equals(objArr[0], objArr[1])));
            }
        }
    }

    public llf(oof<? extends T> first, oof<? extends T> second) {
        this.f58187a = first;
        this.f58188b = second;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super Boolean> observer) {
        AtomicInteger atomicInteger = new AtomicInteger();
        Object[] objArr = {null, null};
        mm2 mm2Var = new mm2();
        observer.onSubscribe(mm2Var);
        this.f58187a.subscribe(new C8891a(0, mm2Var, objArr, observer, atomicInteger));
        this.f58188b.subscribe(new C8891a(1, mm2Var, objArr, observer, atomicInteger));
    }
}
