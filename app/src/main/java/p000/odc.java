package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes7.dex */
public final class odc<T, A, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final eec<? extends T> f67339b;

    /* JADX INFO: renamed from: c */
    public final Collector<T, A, R> f67340c;

    /* JADX INFO: renamed from: odc$a */
    public static final class C10327a<T, A, R> extends AtomicReference<fdg> implements kj6<T> {
        private static final long serialVersionUID = -7954444275102466525L;

        /* JADX INFO: renamed from: a */
        public final C10328b<T, A, R> f67341a;

        /* JADX INFO: renamed from: b */
        public final BiConsumer<A, T> f67342b;

        /* JADX INFO: renamed from: c */
        public final BinaryOperator<A> f67343c;

        /* JADX INFO: renamed from: d */
        public A f67344d;

        /* JADX INFO: renamed from: e */
        public boolean f67345e;

        public C10327a(C10328b<T, A, R> parent, A container, BiConsumer<A, T> accumulator, BinaryOperator<A> combiner) {
            this.f67341a = parent;
            this.f67342b = accumulator;
            this.f67343c = combiner;
            this.f67344d = container;
        }

        /* JADX INFO: renamed from: a */
        public void m18585a() {
            ldg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f67345e) {
                return;
            }
            A a = this.f67344d;
            this.f67344d = null;
            this.f67345e = true;
            this.f67341a.m18587b(a, this.f67343c);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f67345e) {
                ofe.onError(t);
                return;
            }
            this.f67344d = null;
            this.f67345e = true;
            this.f67341a.innerError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f67345e) {
                return;
            }
            try {
                this.f67342b.accept(this.f67344d, t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                get().cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.setOnce(this, s, Long.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: odc$b */
    public static final class C10328b<T, A, R> extends j34<R> {
        private static final long serialVersionUID = -5370107872170712765L;

        /* JADX INFO: renamed from: L */
        public final C10327a<T, A, R>[] f67346L;

        /* JADX INFO: renamed from: M */
        public final AtomicReference<C10329c<A>> f67347M;

        /* JADX INFO: renamed from: N */
        public final AtomicInteger f67348N;

        /* JADX INFO: renamed from: Q */
        public final bc0 f67349Q;

        /* JADX INFO: renamed from: X */
        public final Function<A, R> f67350X;

        public C10328b(ycg<? super R> subscriber, int n, Collector<T, A, R> collector) {
            super(subscriber);
            this.f67347M = new AtomicReference<>();
            this.f67348N = new AtomicInteger();
            this.f67349Q = new bc0();
            this.f67350X = collector.finisher();
            C10327a<T, A, R>[] c10327aArr = new C10327a[n];
            for (int i = 0; i < n; i++) {
                c10327aArr[i] = new C10327a<>(this, collector.supplier().get(), collector.accumulator(), collector.combiner());
            }
            this.f67346L = c10327aArr;
            this.f67348N.lazySet(n);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public C10329c<A> m18586a(A value) {
            C10329c<A> c10329c;
            int iM18589b;
            while (true) {
                c10329c = this.f67347M.get();
                if (c10329c == null) {
                    c10329c = new C10329c<>();
                    if (!v7b.m23844a(this.f67347M, null, c10329c)) {
                        continue;
                    }
                }
                iM18589b = c10329c.m18589b();
                if (iM18589b >= 0) {
                    break;
                }
                v7b.m23844a(this.f67347M, c10329c, null);
            }
            if (iM18589b == 0) {
                c10329c.f67351a = value;
            } else {
                c10329c.f67352b = value;
            }
            if (!c10329c.m18588a()) {
                return null;
            }
            v7b.m23844a(this.f67347M, c10329c, null);
            return c10329c;
        }

        /* JADX INFO: renamed from: b */
        public void m18587b(A a, BinaryOperator<A> binaryOperator) {
            while (true) {
                C10329c<A> c10329cM18586a = m18586a(a);
                if (c10329cM18586a == null) {
                    break;
                }
                try {
                    a = (A) binaryOperator.apply(c10329cM18586a.f67351a, c10329cM18586a.f67352b);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    innerError(th);
                    return;
                }
            }
            if (this.f67348N.decrementAndGet() == 0) {
                C10329c<A> c10329c = this.f67347M.get();
                this.f67347M.lazySet(null);
                try {
                    R rApply = this.f67350X.apply(c10329c.f67351a);
                    Objects.requireNonNull(rApply, "The finisher returned a null value");
                    complete(rApply);
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    innerError(th2);
                }
            }
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            for (C10327a<T, A, R> c10327a : this.f67346L) {
                c10327a.m18585a();
            }
        }

        public void innerError(Throwable ex) {
            if (this.f67349Q.compareAndSet(null, ex)) {
                cancel();
                this.f49483a.onError(ex);
            } else if (ex != this.f67349Q.get()) {
                ofe.onError(ex);
            }
        }
    }

    /* JADX INFO: renamed from: odc$c */
    public static final class C10329c<T> extends AtomicInteger {
        private static final long serialVersionUID = 473971317683868662L;

        /* JADX INFO: renamed from: a */
        public T f67351a;

        /* JADX INFO: renamed from: b */
        public T f67352b;

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f67353c = new AtomicInteger();

        /* JADX INFO: renamed from: a */
        public boolean m18588a() {
            return this.f67353c.incrementAndGet() == 2;
        }

        /* JADX INFO: renamed from: b */
        public int m18589b() {
            int i;
            do {
                i = get();
                if (i >= 2) {
                    return -1;
                }
            } while (!compareAndSet(i, i + 1));
            return i;
        }
    }

    public odc(eec<? extends T> source, Collector<T, A, R> collector) {
        this.f67339b = source;
        this.f67340c = collector;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        try {
            C10328b c10328b = new C10328b(s, this.f67339b.parallelism(), this.f67340c);
            s.onSubscribe(c10328b);
            this.f67339b.subscribe(c10328b.f67346L);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            w05.error(th, s);
        }
    }
}
