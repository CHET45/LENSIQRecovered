package p000;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class yl6<T, R> extends AbstractC7714j1<T, R> {

    /* JADX INFO: renamed from: c */
    @dib
    public final zjd<?>[] f101994c;

    /* JADX INFO: renamed from: d */
    @dib
    public final Iterable<? extends zjd<?>> f101995d;

    /* JADX INFO: renamed from: e */
    public final sy6<? super Object[], R> f101996e;

    /* JADX INFO: renamed from: yl6$a */
    public final class C15711a implements sy6<T, R> {
        public C15711a() {
        }

        @Override // p000.sy6
        public R apply(T t) throws Throwable {
            R rApply = yl6.this.f101996e.apply(new Object[]{t});
            Objects.requireNonNull(rApply, "The combiner returned a null value");
            return rApply;
        }
    }

    /* JADX INFO: renamed from: yl6$b */
    public static final class C15712b<T, R> extends AtomicInteger implements bq2<T>, fdg {
        private static final long serialVersionUID = 1577321883966341961L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f101998C;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f101999a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super Object[], R> f102000b;

        /* JADX INFO: renamed from: c */
        public final C15713c[] f102001c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceArray<Object> f102002d;

        /* JADX INFO: renamed from: e */
        public final AtomicReference<fdg> f102003e;

        /* JADX INFO: renamed from: f */
        public final AtomicLong f102004f;

        /* JADX INFO: renamed from: m */
        public final bc0 f102005m;

        public C15712b(ycg<? super R> actual, sy6<? super Object[], R> combiner, int n) {
            this.f101999a = actual;
            this.f102000b = combiner;
            C15713c[] c15713cArr = new C15713c[n];
            for (int i = 0; i < n; i++) {
                c15713cArr[i] = new C15713c(this, i);
            }
            this.f102001c = c15713cArr;
            this.f102002d = new AtomicReferenceArray<>(n);
            this.f102003e = new AtomicReference<>();
            this.f102004f = new AtomicLong();
            this.f102005m = new bc0();
        }

        /* JADX INFO: renamed from: a */
        public void m26181a(int index) {
            C15713c[] c15713cArr = this.f102001c;
            for (int i = 0; i < c15713cArr.length; i++) {
                if (i != index) {
                    c15713cArr[i].m26186a();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m26182b(int index, boolean nonEmpty) {
            if (nonEmpty) {
                return;
            }
            this.f101998C = true;
            ldg.cancel(this.f102003e);
            m26181a(index);
            xd7.onComplete(this.f101999a, this, this.f102005m);
        }

        /* JADX INFO: renamed from: c */
        public void m26183c(int index, Throwable t) {
            this.f101998C = true;
            ldg.cancel(this.f102003e);
            m26181a(index);
            xd7.onError(this.f101999a, t, this, this.f102005m);
        }

        @Override // p000.fdg
        public void cancel() {
            ldg.cancel(this.f102003e);
            for (C15713c c15713c : this.f102001c) {
                c15713c.m26186a();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m26184d(int index, Object o) {
            this.f102002d.set(index, o);
        }

        /* JADX INFO: renamed from: e */
        public void m26185e(zjd<?>[] others, int n) {
            C15713c[] c15713cArr = this.f102001c;
            AtomicReference<fdg> atomicReference = this.f102003e;
            for (int i = 0; i < n && atomicReference.get() != ldg.CANCELLED; i++) {
                others[i].subscribe(c15713cArr[i]);
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f101998C) {
                return;
            }
            this.f101998C = true;
            m26181a(-1);
            xd7.onComplete(this.f101999a, this, this.f102005m);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f101998C) {
                ofe.onError(t);
                return;
            }
            this.f101998C = true;
            m26181a(-1);
            xd7.onError(this.f101999a, t, this, this.f102005m);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t) || this.f101998C) {
                return;
            }
            this.f102003e.get().request(1L);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.deferredSetOnce(this.f102003e, this.f102004f, s);
        }

        @Override // p000.fdg
        public void request(long n) {
            ldg.deferredRequest(this.f102003e, this.f102004f, n);
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            if (this.f101998C) {
                return false;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f102002d;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            objArr[0] = t;
            int i = 0;
            while (i < length) {
                Object obj = atomicReferenceArray.get(i);
                if (obj == null) {
                    return false;
                }
                i++;
                objArr[i] = obj;
            }
            try {
                R rApply = this.f102000b.apply(objArr);
                Objects.requireNonNull(rApply, "The combiner returned a null value");
                xd7.onNext(this.f101999a, rApply, this, this.f102005m);
                return true;
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                cancel();
                onError(th);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: yl6$c */
    public static final class C15713c extends AtomicReference<fdg> implements kj6<Object> {
        private static final long serialVersionUID = 3256684027868224024L;

        /* JADX INFO: renamed from: a */
        public final C15712b<?, ?> f102006a;

        /* JADX INFO: renamed from: b */
        public final int f102007b;

        /* JADX INFO: renamed from: c */
        public boolean f102008c;

        public C15713c(C15712b<?, ?> parent, int index) {
            this.f102006a = parent;
            this.f102007b = index;
        }

        /* JADX INFO: renamed from: a */
        public void m26186a() {
            ldg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f102006a.m26182b(this.f102007b, this.f102008c);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f102006a.m26183c(this.f102007b, t);
        }

        @Override // p000.ycg
        public void onNext(Object t) {
            if (!this.f102008c) {
                this.f102008c = true;
            }
            this.f102006a.m26184d(this.f102007b, t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.setOnce(this, s, Long.MAX_VALUE);
        }
    }

    public yl6(@cfb l86<T> source, @cfb zjd<?>[] otherArray, sy6<? super Object[], R> combiner) {
        super(source);
        this.f101994c = otherArray;
        this.f101995d = null;
        this.f101996e = combiner;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        int length;
        zjd<?>[] zjdVarArr = this.f101994c;
        if (zjdVarArr == null) {
            zjdVarArr = new zjd[8];
            try {
                length = 0;
                for (zjd<?> zjdVar : this.f101995d) {
                    if (length == zjdVarArr.length) {
                        zjdVarArr = (zjd[]) Arrays.copyOf(zjdVarArr, (length >> 1) + length);
                    }
                    int i = length + 1;
                    zjdVarArr[length] = zjdVar;
                    length = i;
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                w05.error(th, s);
                return;
            }
        } else {
            length = zjdVarArr.length;
        }
        if (length == 0) {
            new df6(this.f49321b, new C15711a()).subscribeActual(s);
            return;
        }
        C15712b c15712b = new C15712b(s, this.f101996e, length);
        s.onSubscribe(c15712b);
        c15712b.m26185e(zjdVarArr, length);
        this.f49321b.subscribe((kj6) c15712b);
    }

    public yl6(@cfb l86<T> source, @cfb Iterable<? extends zjd<?>> otherIterable, @cfb sy6<? super Object[], R> combiner) {
        super(source);
        this.f101994c = null;
        this.f101995d = otherIterable;
        this.f101996e = combiner;
    }
}
