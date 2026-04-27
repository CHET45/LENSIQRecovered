package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class za6<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final mg6<T> f104562b;

    /* JADX INFO: renamed from: c */
    public final xo0 f104563c;

    /* JADX INFO: renamed from: za6$a */
    public static /* synthetic */ class C16046a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f104564a;

        static {
            int[] iArr = new int[xo0.values().length];
            f104564a = iArr;
            try {
                iArr[xo0.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f104564a[xo0.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f104564a[xo0.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f104564a[xo0.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: za6$b */
    public static abstract class AbstractC16047b<T> extends AtomicLong implements hc6<T>, fdg {
        private static final long serialVersionUID = 7326289992464377023L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f104565a;

        /* JADX INFO: renamed from: b */
        public final a0f f104566b = new a0f();

        public AbstractC16047b(ycg<? super T> downstream) {
            this.f104565a = downstream;
        }

        /* JADX INFO: renamed from: a */
        public void m26622a() {
            if (isCancelled()) {
                return;
            }
            try {
                this.f104565a.onComplete();
            } finally {
                this.f104566b.dispose();
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m26623b(Throwable e) {
            if (isCancelled()) {
                return false;
            }
            try {
                this.f104565a.onError(e);
                this.f104566b.dispose();
                return true;
            } catch (Throwable th) {
                this.f104566b.dispose();
                throw th;
            }
        }

        /* JADX INFO: renamed from: c */
        public void mo26624c() {
        }

        @Override // p000.fdg
        public final void cancel() {
            this.f104566b.dispose();
            mo26625d();
        }

        /* JADX INFO: renamed from: d */
        public void mo26625d() {
        }

        @Override // p000.hc6
        public final boolean isCancelled() {
            return this.f104566b.isDisposed();
        }

        @Override // p000.qy4
        public void onComplete() {
            m26622a();
        }

        @Override // p000.qy4
        public final void onError(Throwable e) {
            if (e == null) {
                e = k75.createNullPointerException("onError called with a null Throwable.");
            }
            if (signalError(e)) {
                return;
            }
            ofe.onError(e);
        }

        @Override // p000.fdg
        public final void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this, n);
                mo26624c();
            }
        }

        @Override // p000.hc6
        public final long requested() {
            return get();
        }

        @Override // p000.hc6
        public final hc6<T> serialize() {
            return new C16054i(this);
        }

        @Override // p000.hc6
        public final void setCancellable(bq1 c) {
            setDisposable(new iq1(c));
        }

        @Override // p000.hc6
        public final void setDisposable(lf4 d) {
            this.f104566b.update(d);
        }

        public boolean signalError(Throwable e) {
            return m26623b(e);
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }

        @Override // p000.hc6
        public final boolean tryOnError(Throwable e) {
            if (e == null) {
                e = k75.createNullPointerException("tryOnError called with a null Throwable.");
            }
            return signalError(e);
        }
    }

    /* JADX INFO: renamed from: za6$c */
    public static final class C16048c<T> extends AbstractC16047b<T> {
        private static final long serialVersionUID = 2427151001689639875L;

        /* JADX INFO: renamed from: c */
        public final qzf<T> f104567c;

        /* JADX INFO: renamed from: d */
        public Throwable f104568d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f104569e;

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f104570f;

        public C16048c(ycg<? super T> actual, int capacityHint) {
            super(actual);
            this.f104567c = new qzf<>(capacityHint);
            this.f104570f = new AtomicInteger();
        }

        @Override // p000.za6.AbstractC16047b
        /* JADX INFO: renamed from: c */
        public void mo26624c() {
            m26626e();
        }

        @Override // p000.za6.AbstractC16047b
        /* JADX INFO: renamed from: d */
        public void mo26625d() {
            if (this.f104570f.getAndIncrement() == 0) {
                this.f104567c.clear();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m26626e() {
            if (this.f104570f.getAndIncrement() != 0) {
                return;
            }
            ycg<? super T> ycgVar = this.f104565a;
            qzf<T> qzfVar = this.f104567c;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (j2 != j) {
                    if (isCancelled()) {
                        qzfVar.clear();
                        return;
                    }
                    boolean z = this.f104569e;
                    T tPoll = qzfVar.poll();
                    boolean z2 = tPoll == null;
                    if (z && z2) {
                        Throwable th = this.f104568d;
                        if (th != null) {
                            m26623b(th);
                            return;
                        } else {
                            m26622a();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    ycgVar.onNext(tPoll);
                    j2++;
                }
                if (j2 == j) {
                    if (isCancelled()) {
                        qzfVar.clear();
                        return;
                    }
                    boolean z3 = this.f104569e;
                    boolean zIsEmpty = qzfVar.isEmpty();
                    if (z3 && zIsEmpty) {
                        Throwable th2 = this.f104568d;
                        if (th2 != null) {
                            m26623b(th2);
                            return;
                        } else {
                            m26622a();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    ro0.produced(this, j2);
                }
                iAddAndGet = this.f104570f.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.za6.AbstractC16047b, p000.qy4
        public void onComplete() {
            this.f104569e = true;
            m26626e();
        }

        @Override // p000.qy4
        public void onNext(T t) {
            if (this.f104569e || isCancelled()) {
                return;
            }
            if (t == null) {
                onError(k75.createNullPointerException("onNext called with a null value."));
            } else {
                this.f104567c.offer(t);
                m26626e();
            }
        }

        @Override // p000.za6.AbstractC16047b
        public boolean signalError(Throwable e) {
            if (this.f104569e || isCancelled()) {
                return false;
            }
            this.f104568d = e;
            this.f104569e = true;
            m26626e();
            return true;
        }
    }

    /* JADX INFO: renamed from: za6$d */
    public static final class C16049d<T> extends AbstractC16053h<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public C16049d(ycg<? super T> downstream) {
            super(downstream);
        }

        @Override // p000.za6.AbstractC16053h
        /* JADX INFO: renamed from: e */
        public void mo26627e() {
        }
    }

    /* JADX INFO: renamed from: za6$e */
    public static final class C16050e<T> extends AbstractC16053h<T> {
        private static final long serialVersionUID = 338953216916120960L;

        public C16050e(ycg<? super T> downstream) {
            super(downstream);
        }

        @Override // p000.za6.AbstractC16053h
        /* JADX INFO: renamed from: e */
        public void mo26627e() {
            onError(new bwa("create: could not emit value due to lack of requests"));
        }
    }

    /* JADX INFO: renamed from: za6$f */
    public static final class C16051f<T> extends AbstractC16047b<T> {
        private static final long serialVersionUID = 4023437720691792495L;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<T> f104571c;

        /* JADX INFO: renamed from: d */
        public Throwable f104572d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f104573e;

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f104574f;

        public C16051f(ycg<? super T> downstream) {
            super(downstream);
            this.f104571c = new AtomicReference<>();
            this.f104574f = new AtomicInteger();
        }

        @Override // p000.za6.AbstractC16047b
        /* JADX INFO: renamed from: c */
        public void mo26624c() {
            m26628e();
        }

        @Override // p000.za6.AbstractC16047b
        /* JADX INFO: renamed from: d */
        public void mo26625d() {
            if (this.f104574f.getAndIncrement() == 0) {
                this.f104571c.lazySet(null);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        
            if (r9 != r5) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        
            if (isCancelled() == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        
            r2.lazySet(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
        
            r5 = r17.f104573e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
        
            if (r2.get() != null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
        
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
        
            if (r5 == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
        
            if (r12 == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
        
            r1 = r17.f104572d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
        
            if (r1 == null) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
        
            m26623b(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0070, code lost:
        
            m26622a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0076, code lost:
        
            if (r9 == 0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
        
            p000.ro0.produced(r17, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x007b, code lost:
        
            r4 = r17.f104574f.addAndGet(-r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m26628e() {
            /*
                r17 = this;
                r0 = r17
                java.util.concurrent.atomic.AtomicInteger r1 = r0.f104574f
                int r1 = r1.getAndIncrement()
                if (r1 == 0) goto Lb
                return
            Lb:
                ycg<? super T> r1 = r0.f104565a
                java.util.concurrent.atomic.AtomicReference<T> r2 = r0.f104571c
                r3 = 1
                r4 = r3
            L11:
                long r5 = r17.get()
                r7 = 0
                r9 = r7
            L18:
                int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                r12 = 0
                r13 = 0
                if (r11 == 0) goto L4f
                boolean r14 = r17.isCancelled()
                if (r14 == 0) goto L28
                r2.lazySet(r13)
                return
            L28:
                boolean r14 = r0.f104573e
                java.lang.Object r15 = r2.getAndSet(r13)
                if (r15 != 0) goto L33
                r16 = r3
                goto L35
            L33:
                r16 = r12
            L35:
                if (r14 == 0) goto L45
                if (r16 == 0) goto L45
                java.lang.Throwable r1 = r0.f104572d
                if (r1 == 0) goto L41
                r0.m26623b(r1)
                goto L44
            L41:
                r17.m26622a()
            L44:
                return
            L45:
                if (r16 == 0) goto L48
                goto L4f
            L48:
                r1.onNext(r15)
                r11 = 1
                long r9 = r9 + r11
                goto L18
            L4f:
                if (r11 != 0) goto L74
                boolean r5 = r17.isCancelled()
                if (r5 == 0) goto L5b
                r2.lazySet(r13)
                return
            L5b:
                boolean r5 = r0.f104573e
                java.lang.Object r6 = r2.get()
                if (r6 != 0) goto L64
                r12 = r3
            L64:
                if (r5 == 0) goto L74
                if (r12 == 0) goto L74
                java.lang.Throwable r1 = r0.f104572d
                if (r1 == 0) goto L70
                r0.m26623b(r1)
                goto L73
            L70:
                r17.m26622a()
            L73:
                return
            L74:
                int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r5 == 0) goto L7b
                p000.ro0.produced(r0, r9)
            L7b:
                java.util.concurrent.atomic.AtomicInteger r5 = r0.f104574f
                int r4 = -r4
                int r4 = r5.addAndGet(r4)
                if (r4 != 0) goto L11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.za6.C16051f.m26628e():void");
        }

        @Override // p000.za6.AbstractC16047b, p000.qy4
        public void onComplete() {
            this.f104573e = true;
            m26628e();
        }

        @Override // p000.qy4
        public void onNext(T t) {
            if (this.f104573e || isCancelled()) {
                return;
            }
            if (t == null) {
                onError(k75.createNullPointerException("onNext called with a null value."));
            } else {
                this.f104571c.set(t);
                m26628e();
            }
        }

        @Override // p000.za6.AbstractC16047b
        public boolean signalError(Throwable e) {
            if (this.f104573e || isCancelled()) {
                return false;
            }
            this.f104572d = e;
            this.f104573e = true;
            m26628e();
            return true;
        }
    }

    /* JADX INFO: renamed from: za6$g */
    public static final class C16052g<T> extends AbstractC16047b<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public C16052g(ycg<? super T> downstream) {
            super(downstream);
        }

        @Override // p000.qy4
        public void onNext(T t) {
            long j;
            if (isCancelled()) {
                return;
            }
            if (t == null) {
                onError(k75.createNullPointerException("onNext called with a null value."));
                return;
            }
            this.f104565a.onNext(t);
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, j - 1));
        }
    }

    /* JADX INFO: renamed from: za6$h */
    public static abstract class AbstractC16053h<T> extends AbstractC16047b<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public AbstractC16053h(ycg<? super T> downstream) {
            super(downstream);
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo26627e();

        @Override // p000.qy4
        public final void onNext(T t) {
            if (isCancelled()) {
                return;
            }
            if (t == null) {
                onError(k75.createNullPointerException("onNext called with a null value."));
            } else if (get() == 0) {
                mo26627e();
            } else {
                this.f104565a.onNext(t);
                ro0.produced(this, 1L);
            }
        }
    }

    /* JADX INFO: renamed from: za6$i */
    public static final class C16054i<T> extends AtomicInteger implements hc6<T> {
        private static final long serialVersionUID = 4883307006032401862L;

        /* JADX INFO: renamed from: a */
        public final AbstractC16047b<T> f104575a;

        /* JADX INFO: renamed from: b */
        public final bc0 f104576b = new bc0();

        /* JADX INFO: renamed from: c */
        public final tif<T> f104577c = new qzf(16);

        /* JADX INFO: renamed from: d */
        public volatile boolean f104578d;

        public C16054i(AbstractC16047b<T> emitter) {
            this.f104575a = emitter;
        }

        /* JADX INFO: renamed from: a */
        public void m26629a() {
            if (getAndIncrement() == 0) {
                m26630b();
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: b */
        public void m26630b() {
            AbstractC16047b<T> abstractC16047b = this.f104575a;
            tif<T> tifVar = this.f104577c;
            bc0 bc0Var = this.f104576b;
            int iAddAndGet = 1;
            while (!abstractC16047b.isCancelled()) {
                if (bc0Var.get() != null) {
                    tifVar.clear();
                    bc0Var.tryTerminateConsumer(abstractC16047b);
                    return;
                }
                boolean z = this.f104578d;
                T tPoll = tifVar.poll();
                boolean z2 = tPoll == null;
                if (z && z2) {
                    abstractC16047b.onComplete();
                    return;
                } else if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    abstractC16047b.onNext(tPoll);
                }
            }
            tifVar.clear();
        }

        @Override // p000.hc6
        public boolean isCancelled() {
            return this.f104575a.isCancelled();
        }

        @Override // p000.qy4
        public void onComplete() {
            if (this.f104575a.isCancelled() || this.f104578d) {
                return;
            }
            this.f104578d = true;
            m26629a();
        }

        @Override // p000.qy4
        public void onError(Throwable t) {
            if (tryOnError(t)) {
                return;
            }
            ofe.onError(t);
        }

        @Override // p000.qy4
        public void onNext(T t) {
            if (this.f104575a.isCancelled() || this.f104578d) {
                return;
            }
            if (t == null) {
                onError(k75.createNullPointerException("onNext called with a null value."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f104575a.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                tif<T> tifVar = this.f104577c;
                synchronized (tifVar) {
                    tifVar.offer(t);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m26630b();
        }

        @Override // p000.hc6
        public long requested() {
            return this.f104575a.requested();
        }

        @Override // p000.hc6
        public hc6<T> serialize() {
            return this;
        }

        @Override // p000.hc6
        public void setCancellable(bq1 c) {
            this.f104575a.setCancellable(c);
        }

        @Override // p000.hc6
        public void setDisposable(lf4 d) {
            this.f104575a.setDisposable(d);
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
            return this.f104575a.toString();
        }

        @Override // p000.hc6
        public boolean tryOnError(Throwable t) {
            if (!this.f104575a.isCancelled() && !this.f104578d) {
                if (t == null) {
                    t = k75.createNullPointerException("onError called with a null Throwable.");
                }
                if (this.f104576b.tryAddThrowable(t)) {
                    this.f104578d = true;
                    m26629a();
                    return true;
                }
            }
            return false;
        }
    }

    public za6(mg6<T> source, xo0 backpressure) {
        this.f104562b = source;
        this.f104563c = backpressure;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.l86
    public void subscribeActual(ycg<? super T> ycgVar) {
        int i = C16046a.f104564a[this.f104563c.ordinal()];
        AbstractC16047b c16048c = i != 1 ? i != 2 ? i != 3 ? i != 4 ? new C16048c(ycgVar, l86.bufferSize()) : new C16051f(ycgVar) : new C16049d(ycgVar) : new C16050e(ycgVar) : new C16052g(ycgVar);
        ycgVar.onSubscribe(c16048c);
        try {
            this.f104562b.subscribe(c16048c);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            c16048c.onError(th);
        }
    }
}
