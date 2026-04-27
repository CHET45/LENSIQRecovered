package p000;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class b96<T, C extends Collection<? super T>> extends AbstractC8162k1<T, C> {

    /* JADX INFO: renamed from: c */
    public final int f13015c;

    /* JADX INFO: renamed from: d */
    public final int f13016d;

    /* JADX INFO: renamed from: e */
    public final Callable<C> f13017e;

    /* JADX INFO: renamed from: b96$a */
    public static final class C1787a<T, C extends Collection<? super T>> implements lj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super C> f13018a;

        /* JADX INFO: renamed from: b */
        public final Callable<C> f13019b;

        /* JADX INFO: renamed from: c */
        public final int f13020c;

        /* JADX INFO: renamed from: d */
        public C f13021d;

        /* JADX INFO: renamed from: e */
        public fdg f13022e;

        /* JADX INFO: renamed from: f */
        public boolean f13023f;

        /* JADX INFO: renamed from: m */
        public int f13024m;

        public C1787a(ycg<? super C> ycgVar, int i, Callable<C> callable) {
            this.f13018a = ycgVar;
            this.f13020c = i;
            this.f13019b = callable;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f13022e.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f13023f) {
                return;
            }
            this.f13023f = true;
            C c = this.f13021d;
            if (c != null && !c.isEmpty()) {
                this.f13018a.onNext(c);
            }
            this.f13018a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f13023f) {
                pfe.onError(th);
            } else {
                this.f13023f = true;
                this.f13018a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f13023f) {
                return;
            }
            C c = this.f13021d;
            if (c == null) {
                try {
                    c = (C) xjb.requireNonNull(this.f13019b.call(), "The bufferSupplier returned a null buffer");
                    this.f13021d = c;
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            c.add(t);
            int i = this.f13024m + 1;
            if (i != this.f13020c) {
                this.f13024m = i;
                return;
            }
            this.f13024m = 0;
            this.f13021d = null;
            this.f13018a.onNext(c);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f13022e, fdgVar)) {
                this.f13022e = fdgVar;
                this.f13018a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                this.f13022e.request(so0.multiplyCap(j, this.f13020c));
            }
        }
    }

    /* JADX INFO: renamed from: b96$b */
    public static final class C1788b<T, C extends Collection<? super T>> extends AtomicLong implements lj6<T>, fdg, eb1 {
        private static final long serialVersionUID = -7370244972039324525L;

        /* JADX INFO: renamed from: C */
        public boolean f13025C;

        /* JADX INFO: renamed from: F */
        public int f13026F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f13027H;

        /* JADX INFO: renamed from: L */
        public long f13028L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super C> f13029a;

        /* JADX INFO: renamed from: b */
        public final Callable<C> f13030b;

        /* JADX INFO: renamed from: c */
        public final int f13031c;

        /* JADX INFO: renamed from: d */
        public final int f13032d;

        /* JADX INFO: renamed from: m */
        public fdg f13035m;

        /* JADX INFO: renamed from: f */
        public final AtomicBoolean f13034f = new AtomicBoolean();

        /* JADX INFO: renamed from: e */
        public final ArrayDeque<C> f13033e = new ArrayDeque<>();

        public C1788b(ycg<? super C> ycgVar, int i, int i2, Callable<C> callable) {
            this.f13029a = ycgVar;
            this.f13031c = i;
            this.f13032d = i2;
            this.f13030b = callable;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f13027H = true;
            this.f13035m.cancel();
        }

        @Override // p000.eb1
        public boolean getAsBoolean() {
            return this.f13027H;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f13025C) {
                return;
            }
            this.f13025C = true;
            long j = this.f13028L;
            if (j != 0) {
                so0.produced(this, j);
            }
            ymd.postComplete(this.f13029a, this.f13033e, this, this);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f13025C) {
                pfe.onError(th);
                return;
            }
            this.f13025C = true;
            this.f13033e.clear();
            this.f13029a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f13025C) {
                return;
            }
            ArrayDeque<C> arrayDeque = this.f13033e;
            int i = this.f13026F;
            int i2 = i + 1;
            if (i == 0) {
                try {
                    arrayDeque.offer((C) ((Collection) xjb.requireNonNull(this.f13030b.call(), "The bufferSupplier returned a null buffer")));
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            C cPeek = arrayDeque.peek();
            if (cPeek != null && cPeek.size() + 1 == this.f13031c) {
                arrayDeque.poll();
                cPeek.add(t);
                this.f13028L++;
                this.f13029a.onNext(cPeek);
            }
            Iterator<C> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().add(t);
            }
            if (i2 == this.f13032d) {
                i2 = 0;
            }
            this.f13026F = i2;
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f13035m, fdgVar)) {
                this.f13035m = fdgVar;
                this.f13029a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (!mdg.validate(j) || ymd.postCompleteRequest(j, this.f13029a, this.f13033e, this, this)) {
                return;
            }
            if (this.f13034f.get() || !this.f13034f.compareAndSet(false, true)) {
                this.f13035m.request(so0.multiplyCap(this.f13032d, j));
            } else {
                this.f13035m.request(so0.addCap(this.f13031c, so0.multiplyCap(this.f13032d, j - 1)));
            }
        }
    }

    /* JADX INFO: renamed from: b96$c */
    public static final class C1789c<T, C extends Collection<? super T>> extends AtomicInteger implements lj6<T>, fdg {
        private static final long serialVersionUID = -5616169793639412593L;

        /* JADX INFO: renamed from: C */
        public int f13036C;

        /* JADX INFO: renamed from: a */
        public final ycg<? super C> f13037a;

        /* JADX INFO: renamed from: b */
        public final Callable<C> f13038b;

        /* JADX INFO: renamed from: c */
        public final int f13039c;

        /* JADX INFO: renamed from: d */
        public final int f13040d;

        /* JADX INFO: renamed from: e */
        public C f13041e;

        /* JADX INFO: renamed from: f */
        public fdg f13042f;

        /* JADX INFO: renamed from: m */
        public boolean f13043m;

        public C1789c(ycg<? super C> ycgVar, int i, int i2, Callable<C> callable) {
            this.f13037a = ycgVar;
            this.f13039c = i;
            this.f13040d = i2;
            this.f13038b = callable;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f13042f.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f13043m) {
                return;
            }
            this.f13043m = true;
            C c = this.f13041e;
            this.f13041e = null;
            if (c != null) {
                this.f13037a.onNext(c);
            }
            this.f13037a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f13043m) {
                pfe.onError(th);
                return;
            }
            this.f13043m = true;
            this.f13041e = null;
            this.f13037a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f13043m) {
                return;
            }
            C c = this.f13041e;
            int i = this.f13036C;
            int i2 = i + 1;
            if (i == 0) {
                try {
                    c = (C) xjb.requireNonNull(this.f13038b.call(), "The bufferSupplier returned a null buffer");
                    this.f13041e = c;
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            if (c != null) {
                c.add(t);
                if (c.size() == this.f13039c) {
                    this.f13041e = null;
                    this.f13037a.onNext(c);
                }
            }
            if (i2 == this.f13040d) {
                i2 = 0;
            }
            this.f13036C = i2;
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f13042f, fdgVar)) {
                this.f13042f = fdgVar;
                this.f13037a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    this.f13042f.request(so0.multiplyCap(this.f13040d, j));
                    return;
                }
                this.f13042f.request(so0.addCap(so0.multiplyCap(j, this.f13039c), so0.multiplyCap(this.f13040d - this.f13039c, j - 1)));
            }
        }
    }

    public b96(m86<T> m86Var, int i, int i2, Callable<C> callable) {
        super(m86Var);
        this.f13015c = i;
        this.f13016d = i2;
        this.f13017e = callable;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super C> ycgVar) {
        int i = this.f13015c;
        int i2 = this.f13016d;
        if (i == i2) {
            this.f52360b.subscribe((lj6) new C1787a(ycgVar, i, this.f13017e));
        } else if (i2 > i) {
            this.f52360b.subscribe((lj6) new C1789c(ycgVar, this.f13015c, this.f13016d, this.f13017e));
        } else {
            this.f52360b.subscribe((lj6) new C1788b(ycgVar, this.f13015c, this.f13016d, this.f13017e));
        }
    }
}
