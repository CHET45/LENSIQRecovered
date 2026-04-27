package p000;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class qd6<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends T> f74025b;

    /* JADX INFO: renamed from: qd6$a */
    public static abstract class AbstractC11438a<T> extends bw0<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* JADX INFO: renamed from: a */
        public Iterator<? extends T> f74026a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f74027b;

        /* JADX INFO: renamed from: c */
        public boolean f74028c;

        public AbstractC11438a(Iterator<? extends T> it) {
            this.f74026a = it;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo20264a();

        /* JADX INFO: renamed from: b */
        public abstract void mo20265b(long r);

        @Override // p000.fdg
        public final void cancel() {
            this.f74027b = true;
        }

        @Override // p000.zif
        public final void clear() {
            this.f74026a = null;
        }

        @Override // p000.zif
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f74026a;
            if (it == null) {
                return true;
            }
            if (!this.f74028c || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // p000.zif
        @dib
        public final T poll() {
            Iterator<? extends T> it = this.f74026a;
            if (it == null) {
                return null;
            }
            if (!this.f74028c) {
                this.f74028c = true;
            } else if (!it.hasNext()) {
                return null;
            }
            T next = this.f74026a.next();
            Objects.requireNonNull(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // p000.fdg
        public final void request(long n) {
            if (ldg.validate(n) && ro0.add(this, n) == 0) {
                if (n == Long.MAX_VALUE) {
                    mo20264a();
                } else {
                    mo20265b(n);
                }
            }
        }

        @Override // p000.vnd
        public final int requestFusion(int mode) {
            return mode & 1;
        }
    }

    /* JADX INFO: renamed from: qd6$b */
    public static final class C11439b<T> extends AbstractC11438a<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* JADX INFO: renamed from: d */
        public final bq2<? super T> f74029d;

        public C11439b(bq2<? super T> actual, Iterator<? extends T> it) {
            super(it);
            this.f74029d = actual;
        }

        @Override // p000.qd6.AbstractC11438a
        /* JADX INFO: renamed from: a */
        public void mo20264a() {
            Iterator<? extends T> it = this.f74026a;
            bq2<? super T> bq2Var = this.f74029d;
            while (!this.f74027b) {
                try {
                    T next = it.next();
                    if (this.f74027b) {
                        return;
                    }
                    if (next == null) {
                        bq2Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    bq2Var.tryOnNext(next);
                    if (this.f74027b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f74027b) {
                                return;
                            }
                            bq2Var.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        bq2Var.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    bq2Var.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // p000.qd6.AbstractC11438a
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo20265b(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.f74026a
                bq2<? super T> r1 = r8.f74029d
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L53
                boolean r6 = r8.f74027b
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L4b
                boolean r7 = r8.f74027b
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
                r1.onError(r9)
                return
            L26:
                boolean r6 = r1.tryOnNext(r6)
                boolean r7 = r8.f74027b
                if (r7 == 0) goto L2f
                return
            L2f:
                boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L43
                if (r7 != 0) goto L3d
                boolean r9 = r8.f74027b
                if (r9 != 0) goto L3c
                r1.onComplete()
            L3c:
                return
            L3d:
                if (r6 == 0) goto L7
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L43:
                r9 = move-exception
                p000.o75.throwIfFatal(r9)
                r1.onError(r9)
                return
            L4b:
                r9 = move-exception
                p000.o75.throwIfFatal(r9)
                r1.onError(r9)
                return
            L53:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.qd6.C11439b.mo20265b(long):void");
        }
    }

    /* JADX INFO: renamed from: qd6$c */
    public static final class C11440c<T> extends AbstractC11438a<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* JADX INFO: renamed from: d */
        public final ycg<? super T> f74030d;

        public C11440c(ycg<? super T> actual, Iterator<? extends T> it) {
            super(it);
            this.f74030d = actual;
        }

        @Override // p000.qd6.AbstractC11438a
        /* JADX INFO: renamed from: a */
        public void mo20264a() {
            Iterator<? extends T> it = this.f74026a;
            ycg<? super T> ycgVar = this.f74030d;
            while (!this.f74027b) {
                try {
                    T next = it.next();
                    if (this.f74027b) {
                        return;
                    }
                    if (next == null) {
                        ycgVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    ycgVar.onNext(next);
                    if (this.f74027b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f74027b) {
                                return;
                            }
                            ycgVar.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        ycgVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    ycgVar.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // p000.qd6.AbstractC11438a
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo20265b(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.f74026a
                ycg<? super T> r1 = r8.f74030d
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L50
                boolean r6 = r8.f74027b
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L48
                boolean r7 = r8.f74027b
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
                r1.onError(r9)
                return
            L26:
                r1.onNext(r6)
                boolean r6 = r8.f74027b
                if (r6 == 0) goto L2e
                return
            L2e:
                boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
                if (r6 != 0) goto L3c
                boolean r9 = r8.f74027b
                if (r9 != 0) goto L3b
                r1.onComplete()
            L3b:
                return
            L3c:
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L40:
                r9 = move-exception
                p000.o75.throwIfFatal(r9)
                r1.onError(r9)
                return
            L48:
                r9 = move-exception
                p000.o75.throwIfFatal(r9)
                r1.onError(r9)
                return
            L50:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.qd6.C11440c.mo20265b(long):void");
        }
    }

    public qd6(Iterable<? extends T> source) {
        this.f74025b = source;
    }

    public static <T> void subscribe(ycg<? super T> s, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                w05.complete(s);
            } else if (s instanceof bq2) {
                s.onSubscribe(new C11439b((bq2) s, it));
            } else {
                s.onSubscribe(new C11440c(s, it));
            }
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            w05.error(th, s);
        }
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        try {
            subscribe(s, this.f74025b.iterator());
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            w05.error(th, s);
        }
    }
}
