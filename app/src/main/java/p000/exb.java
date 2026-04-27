package p000;

import io.reactivex.Observable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class exb<T> extends AbstractC10162o3<T, Observable<T>> {

    /* JADX INFO: renamed from: C */
    public final boolean f34359C;

    /* JADX INFO: renamed from: b */
    public final long f34360b;

    /* JADX INFO: renamed from: c */
    public final long f34361c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f34362d;

    /* JADX INFO: renamed from: e */
    public final voe f34363e;

    /* JADX INFO: renamed from: f */
    public final long f34364f;

    /* JADX INFO: renamed from: m */
    public final int f34365m;

    /* JADX INFO: renamed from: exb$a */
    public static final class C5506a<T> extends and<T, Object, Observable<T>> implements mf4 {

        /* JADX INFO: renamed from: A2 */
        public psh<T> f34366A2;

        /* JADX INFO: renamed from: B2 */
        public volatile boolean f34367B2;

        /* JADX INFO: renamed from: C2 */
        public final b0f f34368C2;

        /* JADX INFO: renamed from: q2 */
        public final long f34369q2;

        /* JADX INFO: renamed from: r2 */
        public final TimeUnit f34370r2;

        /* JADX INFO: renamed from: s2 */
        public final voe f34371s2;

        /* JADX INFO: renamed from: t2 */
        public final int f34372t2;

        /* JADX INFO: renamed from: u2 */
        public final boolean f34373u2;

        /* JADX INFO: renamed from: v2 */
        public final long f34374v2;

        /* JADX INFO: renamed from: w2 */
        public final voe.AbstractC14185c f34375w2;

        /* JADX INFO: renamed from: x2 */
        public long f34376x2;

        /* JADX INFO: renamed from: y2 */
        public long f34377y2;

        /* JADX INFO: renamed from: z2 */
        public mf4 f34378z2;

        /* JADX INFO: renamed from: exb$a$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final long f34379a;

            /* JADX INFO: renamed from: b */
            public final C5506a<?> f34380b;

            public a(long j, C5506a<?> c5506a) {
                this.f34379a = j;
                this.f34380b = c5506a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5506a<?> c5506a = this.f34380b;
                if (c5506a.f2167n2) {
                    c5506a.f34367B2 = true;
                } else {
                    c5506a.f2166m2.offer(this);
                }
                if (c5506a.enter()) {
                    c5506a.m10341f();
                }
            }
        }

        public C5506a(oxb<? super Observable<T>> oxbVar, long j, TimeUnit timeUnit, voe voeVar, int i, long j2, boolean z) {
            super(oxbVar, new s1b());
            this.f34368C2 = new b0f();
            this.f34369q2 = j;
            this.f34370r2 = timeUnit;
            this.f34371s2 = voeVar;
            this.f34372t2 = i;
            this.f34374v2 = j2;
            this.f34373u2 = z;
            if (z) {
                this.f34375w2 = voeVar.createWorker();
            } else {
                this.f34375w2 = null;
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f2167n2 = true;
        }

        /* JADX INFO: renamed from: e */
        public void m10340e() {
            ag4.dispose(this.f34368C2);
            voe.AbstractC14185c abstractC14185c = this.f34375w2;
            if (abstractC14185c != null) {
                abstractC14185c.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [psh<T>] */
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
        /* JADX INFO: renamed from: f */
        public void m10341f() {
            s1b s1bVar = (s1b) this.f2166m2;
            oxb<? super V> oxbVar = this.f2165l2;
            psh<T> pshVar = this.f34366A2;
            int iLeave = 1;
            while (!this.f34367B2) {
                boolean z = this.f2168o2;
                Object objPoll = s1bVar.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof a;
                if (z && (z2 || z3)) {
                    this.f34366A2 = null;
                    s1bVar.clear();
                    Throwable th = this.f2169p2;
                    if (th != null) {
                        pshVar.onError(th);
                    } else {
                        pshVar.onComplete();
                    }
                    m10340e();
                    return;
                }
                if (z2) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (z3) {
                    a aVar = (a) objPoll;
                    if (!this.f34373u2 || this.f34377y2 == aVar.f34379a) {
                        pshVar.onComplete();
                        this.f34376x2 = 0L;
                        pshVar = (psh<T>) psh.create(this.f34372t2);
                        this.f34366A2 = pshVar;
                        oxbVar.onNext(pshVar);
                    }
                } else {
                    pshVar.onNext(ehb.getValue(objPoll));
                    long j = this.f34376x2 + 1;
                    if (j >= this.f34374v2) {
                        this.f34377y2++;
                        this.f34376x2 = 0L;
                        pshVar.onComplete();
                        pshVar = (psh<T>) psh.create(this.f34372t2);
                        this.f34366A2 = pshVar;
                        this.f2165l2.onNext(pshVar);
                        if (this.f34373u2) {
                            mf4 mf4Var = this.f34368C2.get();
                            mf4Var.dispose();
                            voe.AbstractC14185c abstractC14185c = this.f34375w2;
                            a aVar2 = new a(this.f34377y2, this);
                            long j2 = this.f34369q2;
                            mf4 mf4VarSchedulePeriodically = abstractC14185c.schedulePeriodically(aVar2, j2, j2, this.f34370r2);
                            if (!this.f34368C2.compareAndSet(mf4Var, mf4VarSchedulePeriodically)) {
                                mf4VarSchedulePeriodically.dispose();
                            }
                        }
                    } else {
                        this.f34376x2 = j;
                    }
                }
            }
            this.f34378z2.dispose();
            s1bVar.clear();
            m10340e();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f2167n2;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f2168o2 = true;
            if (enter()) {
                m10341f();
            }
            this.f2165l2.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f2169p2 = th;
            this.f2168o2 = true;
            if (enter()) {
                m10341f();
            }
            this.f2165l2.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f34367B2) {
                return;
            }
            if (fastEnter()) {
                psh<T> pshVar = this.f34366A2;
                pshVar.onNext(t);
                long j = this.f34376x2 + 1;
                if (j >= this.f34374v2) {
                    this.f34377y2++;
                    this.f34376x2 = 0L;
                    pshVar.onComplete();
                    psh<T> pshVarCreate = psh.create(this.f34372t2);
                    this.f34366A2 = pshVarCreate;
                    this.f2165l2.onNext(pshVarCreate);
                    if (this.f34373u2) {
                        this.f34368C2.get().dispose();
                        voe.AbstractC14185c abstractC14185c = this.f34375w2;
                        a aVar = new a(this.f34377y2, this);
                        long j2 = this.f34369q2;
                        ag4.replace(this.f34368C2, abstractC14185c.schedulePeriodically(aVar, j2, j2, this.f34370r2));
                    }
                } else {
                    this.f34376x2 = j;
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.f2166m2.offer((U) ehb.next(t));
                if (!enter()) {
                    return;
                }
            }
            m10341f();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            mf4 mf4VarSchedulePeriodicallyDirect;
            if (ag4.validate(this.f34378z2, mf4Var)) {
                this.f34378z2 = mf4Var;
                oxb<? super V> oxbVar = this.f2165l2;
                oxbVar.onSubscribe(this);
                if (this.f2167n2) {
                    return;
                }
                psh<T> pshVarCreate = psh.create(this.f34372t2);
                this.f34366A2 = pshVarCreate;
                oxbVar.onNext(pshVarCreate);
                a aVar = new a(this.f34377y2, this);
                if (this.f34373u2) {
                    voe.AbstractC14185c abstractC14185c = this.f34375w2;
                    long j = this.f34369q2;
                    mf4VarSchedulePeriodicallyDirect = abstractC14185c.schedulePeriodically(aVar, j, j, this.f34370r2);
                } else {
                    voe voeVar = this.f34371s2;
                    long j2 = this.f34369q2;
                    mf4VarSchedulePeriodicallyDirect = voeVar.schedulePeriodicallyDirect(aVar, j2, j2, this.f34370r2);
                }
                this.f34368C2.replace(mf4VarSchedulePeriodicallyDirect);
            }
        }
    }

    /* JADX INFO: renamed from: exb$b */
    public static final class RunnableC5507b<T> extends and<T, Object, Observable<T>> implements oxb<T>, mf4, Runnable {

        /* JADX INFO: renamed from: y2 */
        public static final Object f34381y2 = new Object();

        /* JADX INFO: renamed from: q2 */
        public final long f34382q2;

        /* JADX INFO: renamed from: r2 */
        public final TimeUnit f34383r2;

        /* JADX INFO: renamed from: s2 */
        public final voe f34384s2;

        /* JADX INFO: renamed from: t2 */
        public final int f34385t2;

        /* JADX INFO: renamed from: u2 */
        public mf4 f34386u2;

        /* JADX INFO: renamed from: v2 */
        public psh<T> f34387v2;

        /* JADX INFO: renamed from: w2 */
        public final b0f f34388w2;

        /* JADX INFO: renamed from: x2 */
        public volatile boolean f34389x2;

        public RunnableC5507b(oxb<? super Observable<T>> oxbVar, long j, TimeUnit timeUnit, voe voeVar, int i) {
            super(oxbVar, new s1b());
            this.f34388w2 = new b0f();
            this.f34382q2 = j;
            this.f34383r2 = timeUnit;
            this.f34384s2 = voeVar;
            this.f34385t2 = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        
            r7.f34388w2.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            r7.f34387v2 = null;
            r0.clear();
            r0 = r7.f2169p2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [psh<T>] */
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
        /* JADX INFO: renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m10342c() {
            /*
                r7 = this;
                uif<U> r0 = r7.f2166m2
                s1b r0 = (p000.s1b) r0
                oxb<? super V> r1 = r7.f2165l2
                psh<T> r2 = r7.f34387v2
                r3 = 1
            L9:
                boolean r4 = r7.f34389x2
                boolean r5 = r7.f2168o2
                java.lang.Object r6 = r0.poll()
                if (r5 == 0) goto L30
                if (r6 == 0) goto L19
                java.lang.Object r5 = p000.exb.RunnableC5507b.f34381y2
                if (r6 != r5) goto L30
            L19:
                r1 = 0
                r7.f34387v2 = r1
                r0.clear()
                java.lang.Throwable r0 = r7.f2169p2
                if (r0 == 0) goto L27
                r2.onError(r0)
                goto L2a
            L27:
                r2.onComplete()
            L2a:
                b0f r0 = r7.f34388w2
                r0.dispose()
                return
            L30:
                if (r6 != 0) goto L3a
                int r3 = -r3
                int r3 = r7.leave(r3)
                if (r3 != 0) goto L9
                return
            L3a:
                java.lang.Object r5 = p000.exb.RunnableC5507b.f34381y2
                if (r6 != r5) goto L55
                r2.onComplete()
                if (r4 != 0) goto L4f
                int r2 = r7.f34385t2
                psh r2 = p000.psh.create(r2)
                r7.f34387v2 = r2
                r1.onNext(r2)
                goto L9
            L4f:
                mf4 r4 = r7.f34386u2
                r4.dispose()
                goto L9
            L55:
                java.lang.Object r4 = p000.ehb.getValue(r6)
                r2.onNext(r4)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.exb.RunnableC5507b.m10342c():void");
        }

        @Override // p000.mf4
        public void dispose() {
            this.f2167n2 = true;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f2167n2;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f2168o2 = true;
            if (enter()) {
                m10342c();
            }
            this.f2165l2.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f2169p2 = th;
            this.f2168o2 = true;
            if (enter()) {
                m10342c();
            }
            this.f2165l2.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f34389x2) {
                return;
            }
            if (fastEnter()) {
                this.f34387v2.onNext(t);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.f2166m2.offer((U) ehb.next(t));
                if (!enter()) {
                    return;
                }
            }
            m10342c();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f34386u2, mf4Var)) {
                this.f34386u2 = mf4Var;
                this.f34387v2 = psh.create(this.f34385t2);
                oxb<? super V> oxbVar = this.f2165l2;
                oxbVar.onSubscribe(this);
                oxbVar.onNext(this.f34387v2);
                if (this.f2167n2) {
                    return;
                }
                voe voeVar = this.f34384s2;
                long j = this.f34382q2;
                this.f34388w2.replace(voeVar.schedulePeriodicallyDirect(this, j, j, this.f34383r2));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.f2167n2) {
                this.f34389x2 = true;
            }
            this.f2166m2.offer((U) f34381y2);
            if (enter()) {
                m10342c();
            }
        }
    }

    /* JADX INFO: renamed from: exb$c */
    public static final class RunnableC5508c<T> extends and<T, Object, Observable<T>> implements mf4, Runnable {

        /* JADX INFO: renamed from: q2 */
        public final long f34390q2;

        /* JADX INFO: renamed from: r2 */
        public final long f34391r2;

        /* JADX INFO: renamed from: s2 */
        public final TimeUnit f34392s2;

        /* JADX INFO: renamed from: t2 */
        public final voe.AbstractC14185c f34393t2;

        /* JADX INFO: renamed from: u2 */
        public final int f34394u2;

        /* JADX INFO: renamed from: v2 */
        public final List<psh<T>> f34395v2;

        /* JADX INFO: renamed from: w2 */
        public mf4 f34396w2;

        /* JADX INFO: renamed from: x2 */
        public volatile boolean f34397x2;

        /* JADX INFO: renamed from: exb$c$a */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final psh<T> f34398a;

            public a(psh<T> pshVar) {
                this.f34398a = pshVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC5508c.this.m10343c(this.f34398a);
            }
        }

        /* JADX INFO: renamed from: exb$c$b */
        public static final class b<T> {

            /* JADX INFO: renamed from: a */
            public final psh<T> f34400a;

            /* JADX INFO: renamed from: b */
            public final boolean f34401b;

            public b(psh<T> pshVar, boolean z) {
                this.f34400a = pshVar;
                this.f34401b = z;
            }
        }

        public RunnableC5508c(oxb<? super Observable<T>> oxbVar, long j, long j2, TimeUnit timeUnit, voe.AbstractC14185c abstractC14185c, int i) {
            super(oxbVar, new s1b());
            this.f34390q2 = j;
            this.f34391r2 = j2;
            this.f34392s2 = timeUnit;
            this.f34393t2 = abstractC14185c;
            this.f34394u2 = i;
            this.f34395v2 = new LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: c */
        public void m10343c(psh<T> pshVar) {
            this.f2166m2.offer((U) new b(pshVar, false));
            if (enter()) {
                m10344d();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: d */
        public void m10344d() {
            s1b s1bVar = (s1b) this.f2166m2;
            oxb<? super V> oxbVar = this.f2165l2;
            List<psh<T>> list = this.f34395v2;
            int iLeave = 1;
            while (!this.f34397x2) {
                boolean z = this.f2168o2;
                Object objPoll = s1bVar.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof b;
                if (z && (z2 || z3)) {
                    s1bVar.clear();
                    Throwable th = this.f2169p2;
                    if (th != null) {
                        Iterator<psh<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        Iterator<psh<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    this.f34393t2.dispose();
                    return;
                }
                if (z2) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (z3) {
                    b bVar = (b) objPoll;
                    if (!bVar.f34401b) {
                        list.remove(bVar.f34400a);
                        bVar.f34400a.onComplete();
                        if (list.isEmpty() && this.f2167n2) {
                            this.f34397x2 = true;
                        }
                    } else if (!this.f2167n2) {
                        psh<T> pshVarCreate = psh.create(this.f34394u2);
                        list.add(pshVarCreate);
                        oxbVar.onNext(pshVarCreate);
                        this.f34393t2.schedule(new a(pshVarCreate), this.f34390q2, this.f34392s2);
                    }
                } else {
                    Iterator<psh<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objPoll);
                    }
                }
            }
            this.f34396w2.dispose();
            s1bVar.clear();
            list.clear();
            this.f34393t2.dispose();
        }

        @Override // p000.mf4
        public void dispose() {
            this.f2167n2 = true;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f2167n2;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f2168o2 = true;
            if (enter()) {
                m10344d();
            }
            this.f2165l2.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f2169p2 = th;
            this.f2168o2 = true;
            if (enter()) {
                m10344d();
            }
            this.f2165l2.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.oxb
        public void onNext(T t) {
            if (fastEnter()) {
                Iterator<psh<T>> it = this.f34395v2.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.f2166m2.offer((U) t);
                if (!enter()) {
                    return;
                }
            }
            m10344d();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f34396w2, mf4Var)) {
                this.f34396w2 = mf4Var;
                this.f2165l2.onSubscribe(this);
                if (this.f2167n2) {
                    return;
                }
                psh<T> pshVarCreate = psh.create(this.f34394u2);
                this.f34395v2.add(pshVarCreate);
                this.f2165l2.onNext(pshVarCreate);
                this.f34393t2.schedule(new a(pshVarCreate), this.f34390q2, this.f34392s2);
                voe.AbstractC14185c abstractC14185c = this.f34393t2;
                long j = this.f34391r2;
                abstractC14185c.schedulePeriodically(this, j, j, this.f34392s2);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            Object bVar = new b(psh.create(this.f34394u2), true);
            if (!this.f2167n2) {
                this.f2166m2.offer((U) bVar);
            }
            if (enter()) {
                m10344d();
            }
        }
    }

    public exb(xub<T> xubVar, long j, long j2, TimeUnit timeUnit, voe voeVar, long j3, int i, boolean z) {
        super(xubVar);
        this.f34360b = j;
        this.f34361c = j2;
        this.f34362d = timeUnit;
        this.f34363e = voeVar;
        this.f34364f = j3;
        this.f34365m = i;
        this.f34359C = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super Observable<T>> oxbVar) {
        n1f n1fVar = new n1f(oxbVar);
        long j = this.f34360b;
        long j2 = this.f34361c;
        if (j != j2) {
            this.f66354a.subscribe(new RunnableC5508c(n1fVar, j, j2, this.f34362d, this.f34363e.createWorker(), this.f34365m));
            return;
        }
        long j3 = this.f34364f;
        if (j3 == Long.MAX_VALUE) {
            this.f66354a.subscribe(new RunnableC5507b(n1fVar, this.f34360b, this.f34362d, this.f34363e, this.f34365m));
        } else {
            this.f66354a.subscribe(new C5506a(n1fVar, j, this.f34362d, this.f34363e, this.f34365m, j3, this.f34359C));
        }
    }
}
