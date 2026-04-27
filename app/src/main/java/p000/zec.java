package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class zec<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final eec<? extends T> f104930b;

    /* JADX INFO: renamed from: c */
    public final i11<T, T, T> f104931c;

    /* JADX INFO: renamed from: zec$a */
    public static final class C16106a<T> extends AtomicReference<fdg> implements kj6<T> {
        private static final long serialVersionUID = -7954444275102466525L;

        /* JADX INFO: renamed from: a */
        public final C16107b<T> f104932a;

        /* JADX INFO: renamed from: b */
        public final i11<T, T, T> f104933b;

        /* JADX INFO: renamed from: c */
        public T f104934c;

        /* JADX INFO: renamed from: d */
        public boolean f104935d;

        public C16106a(C16107b<T> parent, i11<T, T, T> reducer) {
            this.f104932a = parent;
            this.f104933b = reducer;
        }

        /* JADX INFO: renamed from: a */
        public void m26684a() {
            ldg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f104935d) {
                return;
            }
            this.f104935d = true;
            this.f104932a.m26686b(this.f104934c);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f104935d) {
                ofe.onError(t);
            } else {
                this.f104935d = true;
                this.f104932a.innerError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f104935d) {
                return;
            }
            T t2 = this.f104934c;
            if (t2 == null) {
                this.f104934c = t;
                return;
            }
            try {
                T tApply = this.f104933b.apply(t2, t);
                Objects.requireNonNull(tApply, "The reducer returned a null value");
                this.f104934c = tApply;
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

    /* JADX INFO: renamed from: zec$b */
    public static final class C16107b<T> extends j34<T> {
        private static final long serialVersionUID = -5370107872170712765L;

        /* JADX INFO: renamed from: L */
        public final C16106a<T>[] f104936L;

        /* JADX INFO: renamed from: M */
        public final i11<T, T, T> f104937M;

        /* JADX INFO: renamed from: N */
        public final AtomicReference<C16108c<T>> f104938N;

        /* JADX INFO: renamed from: Q */
        public final AtomicInteger f104939Q;

        /* JADX INFO: renamed from: X */
        public final bc0 f104940X;

        public C16107b(ycg<? super T> subscriber, int n, i11<T, T, T> reducer) {
            super(subscriber);
            this.f104938N = new AtomicReference<>();
            this.f104939Q = new AtomicInteger();
            this.f104940X = new bc0();
            C16106a<T>[] c16106aArr = new C16106a[n];
            for (int i = 0; i < n; i++) {
                c16106aArr[i] = new C16106a<>(this, reducer);
            }
            this.f104936L = c16106aArr;
            this.f104937M = reducer;
            this.f104939Q.lazySet(n);
        }

        /* JADX INFO: renamed from: a */
        public C16108c<T> m26685a(T value) {
            C16108c<T> c16108c;
            int iM26688b;
            while (true) {
                c16108c = this.f104938N.get();
                if (c16108c == null) {
                    c16108c = new C16108c<>();
                    if (!v7b.m23844a(this.f104938N, null, c16108c)) {
                        continue;
                    }
                }
                iM26688b = c16108c.m26688b();
                if (iM26688b >= 0) {
                    break;
                }
                v7b.m23844a(this.f104938N, c16108c, null);
            }
            if (iM26688b == 0) {
                c16108c.f104941a = value;
            } else {
                c16108c.f104942b = value;
            }
            if (!c16108c.m26687a()) {
                return null;
            }
            v7b.m23844a(this.f104938N, c16108c, null);
            return c16108c;
        }

        /* JADX INFO: renamed from: b */
        public void m26686b(T value) {
            if (value != null) {
                while (true) {
                    C16108c<T> c16108cM26685a = m26685a(value);
                    if (c16108cM26685a == null) {
                        break;
                    }
                    try {
                        value = this.f104937M.apply(c16108cM26685a.f104941a, c16108cM26685a.f104942b);
                        Objects.requireNonNull(value, "The reducer returned a null value");
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        innerError(th);
                        return;
                    }
                }
            }
            if (this.f104939Q.decrementAndGet() == 0) {
                C16108c<T> c16108c = this.f104938N.get();
                this.f104938N.lazySet(null);
                if (c16108c != null) {
                    complete(c16108c.f104941a);
                } else {
                    this.f49483a.onComplete();
                }
            }
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            for (C16106a<T> c16106a : this.f104936L) {
                c16106a.m26684a();
            }
        }

        public void innerError(Throwable ex) {
            if (this.f104940X.compareAndSet(null, ex)) {
                cancel();
                this.f49483a.onError(ex);
            } else if (ex != this.f104940X.get()) {
                ofe.onError(ex);
            }
        }
    }

    /* JADX INFO: renamed from: zec$c */
    public static final class C16108c<T> extends AtomicInteger {
        private static final long serialVersionUID = 473971317683868662L;

        /* JADX INFO: renamed from: a */
        public T f104941a;

        /* JADX INFO: renamed from: b */
        public T f104942b;

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f104943c = new AtomicInteger();

        /* JADX INFO: renamed from: a */
        public boolean m26687a() {
            return this.f104943c.incrementAndGet() == 2;
        }

        /* JADX INFO: renamed from: b */
        public int m26688b() {
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

    public zec(eec<? extends T> source, i11<T, T, T> reducer) {
        this.f104930b = source;
        this.f104931c = reducer;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        C16107b c16107b = new C16107b(s, this.f104930b.parallelism(), this.f104931c);
        s.onSubscribe(c16107b);
        this.f104930b.subscribe(c16107b.f104936L);
    }
}
