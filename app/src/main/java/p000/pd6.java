package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class pd6<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends T> f70442b;

    /* JADX INFO: renamed from: pd6$a */
    public static abstract class AbstractC10916a<T> extends cw0<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* JADX INFO: renamed from: a */
        public Iterator<? extends T> f70443a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f70444b;

        /* JADX INFO: renamed from: c */
        public boolean f70445c;

        public AbstractC10916a(Iterator<? extends T> it) {
            this.f70443a = it;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo19428a();

        /* JADX INFO: renamed from: b */
        public abstract void mo19429b(long j);

        @Override // p000.fdg
        public final void cancel() {
            this.f70444b = true;
        }

        @Override // p000.ajf
        public final void clear() {
            this.f70443a = null;
        }

        @Override // p000.ajf
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f70443a;
            return it == null || !it.hasNext();
        }

        @Override // p000.ajf
        @cib
        public final T poll() {
            Iterator<? extends T> it = this.f70443a;
            if (it == null) {
                return null;
            }
            if (!this.f70445c) {
                this.f70445c = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return (T) xjb.requireNonNull(this.f70443a.next(), "Iterator.next() returned a null value");
        }

        @Override // p000.fdg
        public final void request(long j) {
            if (mdg.validate(j) && so0.add(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo19428a();
                } else {
                    mo19429b(j);
                }
            }
        }

        @Override // p000.wnd
        public final int requestFusion(int i) {
            return i & 1;
        }
    }

    /* JADX INFO: renamed from: pd6$b */
    public static final class C10917b<T> extends AbstractC10916a<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* JADX INFO: renamed from: d */
        public final cq2<? super T> f70446d;

        public C10917b(cq2<? super T> cq2Var, Iterator<? extends T> it) {
            super(it);
            this.f70446d = cq2Var;
        }

        @Override // p000.pd6.AbstractC10916a
        /* JADX INFO: renamed from: a */
        public void mo19428a() {
            Iterator<? extends T> it = this.f70443a;
            cq2<? super T> cq2Var = this.f70446d;
            while (!this.f70444b) {
                try {
                    T next = it.next();
                    if (this.f70444b) {
                        return;
                    }
                    if (next == null) {
                        cq2Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    cq2Var.tryOnNext(next);
                    if (this.f70444b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f70444b) {
                                return;
                            }
                            cq2Var.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        cq2Var.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    cq2Var.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // p000.pd6.AbstractC10916a
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo19429b(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.f70443a
                cq2<? super T> r1 = r8.f70446d
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L53
                boolean r6 = r8.f70444b
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L4b
                boolean r7 = r8.f70444b
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
                boolean r7 = r8.f70444b
                if (r7 == 0) goto L2f
                return
            L2f:
                boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L43
                if (r7 != 0) goto L3d
                boolean r9 = r8.f70444b
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
                p000.n75.throwIfFatal(r9)
                r1.onError(r9)
                return
            L4b:
                r9 = move-exception
                p000.n75.throwIfFatal(r9)
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
            throw new UnsupportedOperationException("Method not decompiled: p000.pd6.C10917b.mo19429b(long):void");
        }
    }

    /* JADX INFO: renamed from: pd6$c */
    public static final class C10918c<T> extends AbstractC10916a<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* JADX INFO: renamed from: d */
        public final ycg<? super T> f70447d;

        public C10918c(ycg<? super T> ycgVar, Iterator<? extends T> it) {
            super(it);
            this.f70447d = ycgVar;
        }

        @Override // p000.pd6.AbstractC10916a
        /* JADX INFO: renamed from: a */
        public void mo19428a() {
            Iterator<? extends T> it = this.f70443a;
            ycg<? super T> ycgVar = this.f70447d;
            while (!this.f70444b) {
                try {
                    T next = it.next();
                    if (this.f70444b) {
                        return;
                    }
                    if (next == null) {
                        ycgVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    ycgVar.onNext(next);
                    if (this.f70444b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f70444b) {
                                return;
                            }
                            ycgVar.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        ycgVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    ycgVar.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // p000.pd6.AbstractC10916a
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo19429b(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.f70443a
                ycg<? super T> r1 = r8.f70447d
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L50
                boolean r6 = r8.f70444b
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L48
                boolean r7 = r8.f70444b
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
                boolean r6 = r8.f70444b
                if (r6 == 0) goto L2e
                return
            L2e:
                boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
                if (r6 != 0) goto L3c
                boolean r9 = r8.f70444b
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
                p000.n75.throwIfFatal(r9)
                r1.onError(r9)
                return
            L48:
                r9 = move-exception
                p000.n75.throwIfFatal(r9)
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
            throw new UnsupportedOperationException("Method not decompiled: p000.pd6.C10918c.mo19429b(long):void");
        }
    }

    public pd6(Iterable<? extends T> iterable) {
        this.f70442b = iterable;
    }

    public static <T> void subscribe(ycg<? super T> ycgVar, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                x05.complete(ycgVar);
            } else if (ycgVar instanceof cq2) {
                ycgVar.onSubscribe(new C10917b((cq2) ycgVar, it));
            } else {
                ycgVar.onSubscribe(new C10918c(ycgVar, it));
            }
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            x05.error(th, ycgVar);
        }
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        try {
            subscribe(ycgVar, this.f70442b.iterator());
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            x05.error(th, ycgVar);
        }
    }
}
