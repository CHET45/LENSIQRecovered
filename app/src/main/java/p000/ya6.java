package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ya6<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final ng6<T> f100924b;

    /* JADX INFO: renamed from: c */
    public final yo0 f100925c;

    /* JADX INFO: renamed from: ya6$a */
    public static /* synthetic */ class C15581a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f100926a;

        static {
            int[] iArr = new int[yo0.values().length];
            f100926a = iArr;
            try {
                iArr[yo0.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100926a[yo0.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100926a[yo0.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f100926a[yo0.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: ya6$b */
    public static abstract class AbstractC15582b<T> extends AtomicLong implements ic6<T>, fdg {
        private static final long serialVersionUID = 7326289992464377023L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f100927a;

        /* JADX INFO: renamed from: b */
        public final b0f f100928b = new b0f();

        public AbstractC15582b(ycg<? super T> ycgVar) {
            this.f100927a = ycgVar;
        }

        /* JADX INFO: renamed from: a */
        public void m25806a() {
            if (isCancelled()) {
                return;
            }
            try {
                this.f100927a.onComplete();
            } finally {
                this.f100928b.dispose();
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m25807b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.f100927a.onError(th);
                this.f100928b.dispose();
                return true;
            } catch (Throwable th2) {
                this.f100928b.dispose();
                throw th2;
            }
        }

        /* JADX INFO: renamed from: c */
        public void mo25808c() {
        }

        @Override // p000.fdg
        public final void cancel() {
            this.f100928b.dispose();
            mo25809d();
        }

        /* JADX INFO: renamed from: d */
        public void mo25809d() {
        }

        @Override // p000.ic6
        public final boolean isCancelled() {
            return this.f100928b.isDisposed();
        }

        @Override // p000.ry4
        public void onComplete() {
            m25806a();
        }

        @Override // p000.ry4
        public final void onError(Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            pfe.onError(th);
        }

        @Override // p000.fdg
        public final void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this, j);
                mo25808c();
            }
        }

        @Override // p000.ic6
        public final long requested() {
            return get();
        }

        @Override // p000.ic6
        public final ic6<T> serialize() {
            return new C15589i(this);
        }

        @Override // p000.ic6
        public final void setCancellable(aq1 aq1Var) {
            setDisposable(new jq1(aq1Var));
        }

        @Override // p000.ic6
        public final void setDisposable(mf4 mf4Var) {
            this.f100928b.update(mf4Var);
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }

        @Override // p000.ic6
        public boolean tryOnError(Throwable th) {
            return m25807b(th);
        }
    }

    /* JADX INFO: renamed from: ya6$c */
    public static final class C15583c<T> extends AbstractC15582b<T> {
        private static final long serialVersionUID = 2427151001689639875L;

        /* JADX INFO: renamed from: c */
        public final rzf<T> f100929c;

        /* JADX INFO: renamed from: d */
        public Throwable f100930d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f100931e;

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f100932f;

        public C15583c(ycg<? super T> ycgVar, int i) {
            super(ycgVar);
            this.f100929c = new rzf<>(i);
            this.f100932f = new AtomicInteger();
        }

        @Override // p000.ya6.AbstractC15582b
        /* JADX INFO: renamed from: c */
        public void mo25808c() {
            m25810e();
        }

        @Override // p000.ya6.AbstractC15582b
        /* JADX INFO: renamed from: d */
        public void mo25809d() {
            if (this.f100932f.getAndIncrement() == 0) {
                this.f100929c.clear();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m25810e() {
            if (this.f100932f.getAndIncrement() != 0) {
                return;
            }
            ycg<? super T> ycgVar = this.f100927a;
            rzf<T> rzfVar = this.f100929c;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (j2 != j) {
                    if (isCancelled()) {
                        rzfVar.clear();
                        return;
                    }
                    boolean z = this.f100931e;
                    T tPoll = rzfVar.poll();
                    boolean z2 = tPoll == null;
                    if (z && z2) {
                        Throwable th = this.f100930d;
                        if (th != null) {
                            m25807b(th);
                            return;
                        } else {
                            m25806a();
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
                        rzfVar.clear();
                        return;
                    }
                    boolean z3 = this.f100931e;
                    boolean zIsEmpty = rzfVar.isEmpty();
                    if (z3 && zIsEmpty) {
                        Throwable th2 = this.f100930d;
                        if (th2 != null) {
                            m25807b(th2);
                            return;
                        } else {
                            m25806a();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    so0.produced(this, j2);
                }
                iAddAndGet = this.f100932f.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.ya6.AbstractC15582b, p000.ry4
        public void onComplete() {
            this.f100931e = true;
            m25810e();
        }

        @Override // p000.ry4
        public void onNext(T t) {
            if (this.f100931e || isCancelled()) {
                return;
            }
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f100929c.offer(t);
                m25810e();
            }
        }

        @Override // p000.ya6.AbstractC15582b, p000.ic6
        public boolean tryOnError(Throwable th) {
            if (this.f100931e || isCancelled()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f100930d = th;
            this.f100931e = true;
            m25810e();
            return true;
        }
    }

    /* JADX INFO: renamed from: ya6$d */
    public static final class C15584d<T> extends AbstractC15588h<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public C15584d(ycg<? super T> ycgVar) {
            super(ycgVar);
        }

        @Override // p000.ya6.AbstractC15588h
        /* JADX INFO: renamed from: e */
        public void mo25811e() {
        }
    }

    /* JADX INFO: renamed from: ya6$e */
    public static final class C15585e<T> extends AbstractC15588h<T> {
        private static final long serialVersionUID = 338953216916120960L;

        public C15585e(ycg<? super T> ycgVar) {
            super(ycgVar);
        }

        @Override // p000.ya6.AbstractC15588h
        /* JADX INFO: renamed from: e */
        public void mo25811e() {
            onError(new cwa("create: could not emit value due to lack of requests"));
        }
    }

    /* JADX INFO: renamed from: ya6$f */
    public static final class C15586f<T> extends AbstractC15582b<T> {
        private static final long serialVersionUID = 4023437720691792495L;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<T> f100933c;

        /* JADX INFO: renamed from: d */
        public Throwable f100934d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f100935e;

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f100936f;

        public C15586f(ycg<? super T> ycgVar) {
            super(ycgVar);
            this.f100933c = new AtomicReference<>();
            this.f100936f = new AtomicInteger();
        }

        @Override // p000.ya6.AbstractC15582b
        /* JADX INFO: renamed from: c */
        public void mo25808c() {
            m25812e();
        }

        @Override // p000.ya6.AbstractC15582b
        /* JADX INFO: renamed from: d */
        public void mo25809d() {
            if (this.f100936f.getAndIncrement() == 0) {
                this.f100933c.lazySet(null);
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
        
            r5 = r17.f100935e;
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
        
            r1 = r17.f100934d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
        
            if (r1 == null) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
        
            m25807b(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0070, code lost:
        
            m25806a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0076, code lost:
        
            if (r9 == 0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
        
            p000.so0.produced(r17, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x007b, code lost:
        
            r4 = r17.f100936f.addAndGet(-r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m25812e() {
            /*
                r17 = this;
                r0 = r17
                java.util.concurrent.atomic.AtomicInteger r1 = r0.f100936f
                int r1 = r1.getAndIncrement()
                if (r1 == 0) goto Lb
                return
            Lb:
                ycg<? super T> r1 = r0.f100927a
                java.util.concurrent.atomic.AtomicReference<T> r2 = r0.f100933c
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
                boolean r14 = r0.f100935e
                java.lang.Object r15 = r2.getAndSet(r13)
                if (r15 != 0) goto L33
                r16 = r3
                goto L35
            L33:
                r16 = r12
            L35:
                if (r14 == 0) goto L45
                if (r16 == 0) goto L45
                java.lang.Throwable r1 = r0.f100934d
                if (r1 == 0) goto L41
                r0.m25807b(r1)
                goto L44
            L41:
                r17.m25806a()
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
                boolean r5 = r0.f100935e
                java.lang.Object r6 = r2.get()
                if (r6 != 0) goto L64
                r12 = r3
            L64:
                if (r5 == 0) goto L74
                if (r12 == 0) goto L74
                java.lang.Throwable r1 = r0.f100934d
                if (r1 == 0) goto L70
                r0.m25807b(r1)
                goto L73
            L70:
                r17.m25806a()
            L73:
                return
            L74:
                int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r5 == 0) goto L7b
                p000.so0.produced(r0, r9)
            L7b:
                java.util.concurrent.atomic.AtomicInteger r5 = r0.f100936f
                int r4 = -r4
                int r4 = r5.addAndGet(r4)
                if (r4 != 0) goto L11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ya6.C15586f.m25812e():void");
        }

        @Override // p000.ya6.AbstractC15582b, p000.ry4
        public void onComplete() {
            this.f100935e = true;
            m25812e();
        }

        @Override // p000.ry4
        public void onNext(T t) {
            if (this.f100935e || isCancelled()) {
                return;
            }
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f100933c.set(t);
                m25812e();
            }
        }

        @Override // p000.ya6.AbstractC15582b, p000.ic6
        public boolean tryOnError(Throwable th) {
            if (this.f100935e || isCancelled()) {
                return false;
            }
            if (th == null) {
                onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f100934d = th;
            this.f100935e = true;
            m25812e();
            return true;
        }
    }

    /* JADX INFO: renamed from: ya6$g */
    public static final class C15587g<T> extends AbstractC15582b<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public C15587g(ycg<? super T> ycgVar) {
            super(ycgVar);
        }

        @Override // p000.ry4
        public void onNext(T t) {
            long j;
            if (isCancelled()) {
                return;
            }
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.f100927a.onNext(t);
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, j - 1));
        }
    }

    /* JADX INFO: renamed from: ya6$h */
    public static abstract class AbstractC15588h<T> extends AbstractC15582b<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public AbstractC15588h(ycg<? super T> ycgVar) {
            super(ycgVar);
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo25811e();

        @Override // p000.ry4
        public final void onNext(T t) {
            if (isCancelled()) {
                return;
            }
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() == 0) {
                mo25811e();
            } else {
                this.f100927a.onNext(t);
                so0.produced(this, 1L);
            }
        }
    }

    /* JADX INFO: renamed from: ya6$i */
    public static final class C15589i<T> extends AtomicInteger implements ic6<T> {
        private static final long serialVersionUID = 4883307006032401862L;

        /* JADX INFO: renamed from: a */
        public final AbstractC15582b<T> f100937a;

        /* JADX INFO: renamed from: b */
        public final cc0 f100938b = new cc0();

        /* JADX INFO: renamed from: c */
        public final uif<T> f100939c = new rzf(16);

        /* JADX INFO: renamed from: d */
        public volatile boolean f100940d;

        public C15589i(AbstractC15582b<T> abstractC15582b) {
            this.f100937a = abstractC15582b;
        }

        /* JADX INFO: renamed from: a */
        public void m25813a() {
            if (getAndIncrement() == 0) {
                m25814b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m25814b() {
            AbstractC15582b<T> abstractC15582b = this.f100937a;
            uif<T> uifVar = this.f100939c;
            cc0 cc0Var = this.f100938b;
            int iAddAndGet = 1;
            while (!abstractC15582b.isCancelled()) {
                if (cc0Var.get() != null) {
                    uifVar.clear();
                    abstractC15582b.onError(cc0Var.terminate());
                    return;
                }
                boolean z = this.f100940d;
                T tPoll = uifVar.poll();
                boolean z2 = tPoll == null;
                if (z && z2) {
                    abstractC15582b.onComplete();
                    return;
                } else if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    abstractC15582b.onNext(tPoll);
                }
            }
            uifVar.clear();
        }

        @Override // p000.ic6
        public boolean isCancelled() {
            return this.f100937a.isCancelled();
        }

        @Override // p000.ry4
        public void onComplete() {
            if (this.f100937a.isCancelled() || this.f100940d) {
                return;
            }
            this.f100940d = true;
            m25813a();
        }

        @Override // p000.ry4
        public void onError(Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            pfe.onError(th);
        }

        @Override // p000.ry4
        public void onNext(T t) {
            if (this.f100937a.isCancelled() || this.f100940d) {
                return;
            }
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f100937a.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                uif<T> uifVar = this.f100939c;
                synchronized (uifVar) {
                    uifVar.offer(t);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m25814b();
        }

        @Override // p000.ic6
        public long requested() {
            return this.f100937a.requested();
        }

        @Override // p000.ic6
        public ic6<T> serialize() {
            return this;
        }

        @Override // p000.ic6
        public void setCancellable(aq1 aq1Var) {
            this.f100937a.setCancellable(aq1Var);
        }

        @Override // p000.ic6
        public void setDisposable(mf4 mf4Var) {
            this.f100937a.setDisposable(mf4Var);
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
            return this.f100937a.toString();
        }

        @Override // p000.ic6
        public boolean tryOnError(Throwable th) {
            if (!this.f100937a.isCancelled() && !this.f100940d) {
                if (th == null) {
                    th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.f100938b.addThrowable(th)) {
                    this.f100940d = true;
                    m25813a();
                    return true;
                }
            }
            return false;
        }
    }

    public ya6(ng6<T> ng6Var, yo0 yo0Var) {
        this.f100924b = ng6Var;
        this.f100925c = yo0Var;
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
    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        int i = C15581a.f100926a[this.f100925c.ordinal()];
        AbstractC15582b c15583c = i != 1 ? i != 2 ? i != 3 ? i != 4 ? new C15583c(ycgVar, m86.bufferSize()) : new C15586f(ycgVar) : new C15584d(ycgVar) : new C15585e(ycgVar) : new C15587g(ycgVar);
        ycgVar.onSubscribe(c15583c);
        try {
            this.f100924b.subscribe(c15583c);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c15583c.onError(th);
        }
    }
}
