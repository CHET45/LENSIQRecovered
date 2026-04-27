package p000;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class c96<T, C extends Collection<? super T>> extends AbstractC7714j1<T, C> {

    /* JADX INFO: renamed from: c */
    public final int f16007c;

    /* JADX INFO: renamed from: d */
    public final int f16008d;

    /* JADX INFO: renamed from: e */
    public final nfg<C> f16009e;

    /* JADX INFO: renamed from: c96$a */
    public static final class C2241a<T, C extends Collection<? super T>> implements kj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super C> f16010a;

        /* JADX INFO: renamed from: b */
        public final nfg<C> f16011b;

        /* JADX INFO: renamed from: c */
        public final int f16012c;

        /* JADX INFO: renamed from: d */
        public C f16013d;

        /* JADX INFO: renamed from: e */
        public fdg f16014e;

        /* JADX INFO: renamed from: f */
        public boolean f16015f;

        /* JADX INFO: renamed from: m */
        public int f16016m;

        public C2241a(ycg<? super C> actual, int size, nfg<C> bufferSupplier) {
            this.f16010a = actual;
            this.f16012c = size;
            this.f16011b = bufferSupplier;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f16014e.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f16015f) {
                return;
            }
            this.f16015f = true;
            C c = this.f16013d;
            this.f16013d = null;
            if (c != null) {
                this.f16010a.onNext(c);
            }
            this.f16010a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f16015f) {
                ofe.onError(t);
                return;
            }
            this.f16013d = null;
            this.f16015f = true;
            this.f16010a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f16015f) {
                return;
            }
            C c = this.f16013d;
            if (c == null) {
                try {
                    C c2 = this.f16011b.get();
                    Objects.requireNonNull(c2, "The bufferSupplier returned a null buffer");
                    c = c2;
                    this.f16013d = c;
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            c.add(t);
            int i = this.f16016m + 1;
            if (i != this.f16012c) {
                this.f16016m = i;
                return;
            }
            this.f16016m = 0;
            this.f16013d = null;
            this.f16010a.onNext(c);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f16014e, s)) {
                this.f16014e = s;
                this.f16010a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                this.f16014e.request(ro0.multiplyCap(n, this.f16012c));
            }
        }
    }

    /* JADX INFO: renamed from: c96$b */
    public static final class C2242b<T, C extends Collection<? super T>> extends AtomicLong implements kj6<T>, fdg, cb1 {
        private static final long serialVersionUID = -7370244972039324525L;

        /* JADX INFO: renamed from: C */
        public boolean f16017C;

        /* JADX INFO: renamed from: F */
        public int f16018F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f16019H;

        /* JADX INFO: renamed from: L */
        public long f16020L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super C> f16021a;

        /* JADX INFO: renamed from: b */
        public final nfg<C> f16022b;

        /* JADX INFO: renamed from: c */
        public final int f16023c;

        /* JADX INFO: renamed from: d */
        public final int f16024d;

        /* JADX INFO: renamed from: m */
        public fdg f16027m;

        /* JADX INFO: renamed from: f */
        public final AtomicBoolean f16026f = new AtomicBoolean();

        /* JADX INFO: renamed from: e */
        public final ArrayDeque<C> f16025e = new ArrayDeque<>();

        public C2242b(ycg<? super C> actual, int size, int skip, nfg<C> bufferSupplier) {
            this.f16021a = actual;
            this.f16023c = size;
            this.f16024d = skip;
            this.f16022b = bufferSupplier;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f16019H = true;
            this.f16027m.cancel();
        }

        @Override // p000.cb1
        public boolean getAsBoolean() {
            return this.f16019H;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f16017C) {
                return;
            }
            this.f16017C = true;
            long j = this.f16020L;
            if (j != 0) {
                ro0.produced(this, j);
            }
            xmd.postComplete(this.f16021a, this.f16025e, this, this);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f16017C) {
                ofe.onError(t);
                return;
            }
            this.f16017C = true;
            this.f16025e.clear();
            this.f16021a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f16017C) {
                return;
            }
            ArrayDeque<C> arrayDeque = this.f16025e;
            int i = this.f16018F;
            int i2 = i + 1;
            if (i == 0) {
                try {
                    C c = this.f16022b.get();
                    Objects.requireNonNull(c, "The bufferSupplier returned a null buffer");
                    arrayDeque.offer(c);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            Collection collection = (Collection) arrayDeque.peek();
            if (collection.size() + 1 == this.f16023c) {
                arrayDeque.poll();
                collection.add(t);
                this.f16020L++;
                this.f16021a.onNext(collection);
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).add(t);
            }
            if (i2 == this.f16024d) {
                i2 = 0;
            }
            this.f16018F = i2;
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f16027m, s)) {
                this.f16027m = s;
                this.f16021a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (!ldg.validate(n) || xmd.postCompleteRequest(n, this.f16021a, this.f16025e, this, this)) {
                return;
            }
            if (this.f16026f.get() || !this.f16026f.compareAndSet(false, true)) {
                this.f16027m.request(ro0.multiplyCap(this.f16024d, n));
            } else {
                this.f16027m.request(ro0.addCap(this.f16023c, ro0.multiplyCap(this.f16024d, n - 1)));
            }
        }
    }

    /* JADX INFO: renamed from: c96$c */
    public static final class C2243c<T, C extends Collection<? super T>> extends AtomicInteger implements kj6<T>, fdg {
        private static final long serialVersionUID = -5616169793639412593L;

        /* JADX INFO: renamed from: C */
        public int f16028C;

        /* JADX INFO: renamed from: a */
        public final ycg<? super C> f16029a;

        /* JADX INFO: renamed from: b */
        public final nfg<C> f16030b;

        /* JADX INFO: renamed from: c */
        public final int f16031c;

        /* JADX INFO: renamed from: d */
        public final int f16032d;

        /* JADX INFO: renamed from: e */
        public C f16033e;

        /* JADX INFO: renamed from: f */
        public fdg f16034f;

        /* JADX INFO: renamed from: m */
        public boolean f16035m;

        public C2243c(ycg<? super C> actual, int size, int skip, nfg<C> bufferSupplier) {
            this.f16029a = actual;
            this.f16031c = size;
            this.f16032d = skip;
            this.f16030b = bufferSupplier;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f16034f.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f16035m) {
                return;
            }
            this.f16035m = true;
            C c = this.f16033e;
            this.f16033e = null;
            if (c != null) {
                this.f16029a.onNext(c);
            }
            this.f16029a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f16035m) {
                ofe.onError(t);
                return;
            }
            this.f16035m = true;
            this.f16033e = null;
            this.f16029a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f16035m) {
                return;
            }
            C c = this.f16033e;
            int i = this.f16028C;
            int i2 = i + 1;
            if (i == 0) {
                try {
                    C c2 = this.f16030b.get();
                    Objects.requireNonNull(c2, "The bufferSupplier returned a null buffer");
                    c = c2;
                    this.f16033e = c;
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            if (c != null) {
                c.add(t);
                if (c.size() == this.f16031c) {
                    this.f16033e = null;
                    this.f16029a.onNext(c);
                }
            }
            if (i2 == this.f16032d) {
                i2 = 0;
            }
            this.f16028C = i2;
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f16034f, s)) {
                this.f16034f = s;
                this.f16029a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    this.f16034f.request(ro0.multiplyCap(this.f16032d, n));
                    return;
                }
                this.f16034f.request(ro0.addCap(ro0.multiplyCap(n, this.f16031c), ro0.multiplyCap(this.f16032d - this.f16031c, n - 1)));
            }
        }
    }

    public c96(l86<T> source, int size, int skip, nfg<C> bufferSupplier) {
        super(source);
        this.f16007c = size;
        this.f16008d = skip;
        this.f16009e = bufferSupplier;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super C> s) {
        int i = this.f16007c;
        int i2 = this.f16008d;
        if (i == i2) {
            this.f49321b.subscribe((kj6) new C2241a(s, i, this.f16009e));
        } else if (i2 > i) {
            this.f49321b.subscribe((kj6) new C2243c(s, this.f16007c, this.f16008d, this.f16009e));
        } else {
            this.f49321b.subscribe((kj6) new C2242b(s, this.f16007c, this.f16008d, this.f16009e));
        }
    }
}
