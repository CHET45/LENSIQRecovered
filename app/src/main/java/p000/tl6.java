package p000;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class tl6<T> extends AbstractC8162k1<T, m86<T>> {

    /* JADX INFO: renamed from: C */
    public final int f85183C;

    /* JADX INFO: renamed from: F */
    public final boolean f85184F;

    /* JADX INFO: renamed from: c */
    public final long f85185c;

    /* JADX INFO: renamed from: d */
    public final long f85186d;

    /* JADX INFO: renamed from: e */
    public final TimeUnit f85187e;

    /* JADX INFO: renamed from: f */
    public final voe f85188f;

    /* JADX INFO: renamed from: m */
    public final long f85189m;

    /* JADX INFO: renamed from: tl6$a */
    public static final class C13091a<T> extends cnd<T, Object, m86<T>> implements fdg {

        /* JADX INFO: renamed from: G2 */
        public final long f85190G2;

        /* JADX INFO: renamed from: H2 */
        public final TimeUnit f85191H2;

        /* JADX INFO: renamed from: I2 */
        public final voe f85192I2;

        /* JADX INFO: renamed from: J2 */
        public final int f85193J2;

        /* JADX INFO: renamed from: K2 */
        public final boolean f85194K2;

        /* JADX INFO: renamed from: L2 */
        public final long f85195L2;

        /* JADX INFO: renamed from: M2 */
        public final voe.AbstractC14185c f85196M2;

        /* JADX INFO: renamed from: N2 */
        public long f85197N2;

        /* JADX INFO: renamed from: O2 */
        public long f85198O2;

        /* JADX INFO: renamed from: P2 */
        public fdg f85199P2;

        /* JADX INFO: renamed from: Q2 */
        public msh<T> f85200Q2;

        /* JADX INFO: renamed from: R2 */
        public volatile boolean f85201R2;

        /* JADX INFO: renamed from: S2 */
        public final b0f f85202S2;

        /* JADX INFO: renamed from: tl6$a$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final long f85203a;

            /* JADX INFO: renamed from: b */
            public final C13091a<?> f85204b;

            public a(long j, C13091a<?> c13091a) {
                this.f85203a = j;
                this.f85204b = c13091a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13091a<?> c13091a = this.f85204b;
                if (c13091a.f17085D2) {
                    c13091a.f85201R2 = true;
                } else {
                    c13091a.f17084C2.offer(this);
                }
                if (c13091a.enter()) {
                    c13091a.m22709e();
                }
            }
        }

        public C13091a(ycg<? super m86<T>> ycgVar, long j, TimeUnit timeUnit, voe voeVar, int i, long j2, boolean z) {
            super(ycgVar, new s1b());
            this.f85202S2 = new b0f();
            this.f85190G2 = j;
            this.f85191H2 = timeUnit;
            this.f85192I2 = voeVar;
            this.f85193J2 = i;
            this.f85195L2 = j2;
            this.f85194K2 = z;
            if (z) {
                this.f85196M2 = voeVar.createWorker();
            } else {
                this.f85196M2 = null;
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f17085D2 = true;
        }

        public void disposeTimer() {
            this.f85202S2.dispose();
            voe.AbstractC14185c abstractC14185c = this.f85196M2;
            if (abstractC14185c != null) {
                abstractC14185c.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
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
        /* JADX INFO: renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m22709e() {
            /*
                Method dump skipped, instruction units count: 288
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.tl6.C13091a.m22709e():void");
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f17086E2 = true;
            if (enter()) {
                m22709e();
            }
            this.f17083B2.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f17087F2 = th;
            this.f17086E2 = true;
            if (enter()) {
                m22709e();
            }
            this.f17083B2.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f85201R2) {
                return;
            }
            if (fastEnter()) {
                msh<T> mshVar = this.f85200Q2;
                mshVar.onNext(t);
                long j = this.f85197N2 + 1;
                if (j >= this.f85195L2) {
                    this.f85198O2++;
                    this.f85197N2 = 0L;
                    mshVar.onComplete();
                    long jRequested = requested();
                    if (jRequested == 0) {
                        this.f85200Q2 = null;
                        this.f85199P2.cancel();
                        this.f17083B2.onError(new cwa("Could not deliver window due to lack of requests"));
                        disposeTimer();
                        return;
                    }
                    msh<T> mshVarCreate = msh.create(this.f85193J2);
                    this.f85200Q2 = mshVarCreate;
                    this.f17083B2.onNext(mshVarCreate);
                    if (jRequested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    if (this.f85194K2) {
                        this.f85202S2.get().dispose();
                        voe.AbstractC14185c abstractC14185c = this.f85196M2;
                        a aVar = new a(this.f85198O2, this);
                        long j2 = this.f85190G2;
                        this.f85202S2.replace(abstractC14185c.schedulePeriodically(aVar, j2, j2, this.f85191H2));
                    }
                } else {
                    this.f85197N2 = j;
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.f17084C2.offer((U) ehb.next(t));
                if (!enter()) {
                    return;
                }
            }
            m22709e();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mf4 mf4VarSchedulePeriodicallyDirect;
            if (mdg.validate(this.f85199P2, fdgVar)) {
                this.f85199P2 = fdgVar;
                ycg<? super V> ycgVar = this.f17083B2;
                ycgVar.onSubscribe(this);
                if (this.f17085D2) {
                    return;
                }
                msh<T> mshVarCreate = msh.create(this.f85193J2);
                this.f85200Q2 = mshVarCreate;
                long jRequested = requested();
                if (jRequested == 0) {
                    this.f17085D2 = true;
                    fdgVar.cancel();
                    ycgVar.onError(new cwa("Could not deliver initial window due to lack of requests."));
                    return;
                }
                ycgVar.onNext(mshVarCreate);
                if (jRequested != Long.MAX_VALUE) {
                    produced(1L);
                }
                a aVar = new a(this.f85198O2, this);
                if (this.f85194K2) {
                    voe.AbstractC14185c abstractC14185c = this.f85196M2;
                    long j = this.f85190G2;
                    mf4VarSchedulePeriodicallyDirect = abstractC14185c.schedulePeriodically(aVar, j, j, this.f85191H2);
                } else {
                    voe voeVar = this.f85192I2;
                    long j2 = this.f85190G2;
                    mf4VarSchedulePeriodicallyDirect = voeVar.schedulePeriodicallyDirect(aVar, j2, j2, this.f85191H2);
                }
                if (this.f85202S2.replace(mf4VarSchedulePeriodicallyDirect)) {
                    fdgVar.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            requested(j);
        }
    }

    /* JADX INFO: renamed from: tl6$b */
    public static final class RunnableC13092b<T> extends cnd<T, Object, m86<T>> implements lj6<T>, fdg, Runnable {

        /* JADX INFO: renamed from: O2 */
        public static final Object f85205O2 = new Object();

        /* JADX INFO: renamed from: G2 */
        public final long f85206G2;

        /* JADX INFO: renamed from: H2 */
        public final TimeUnit f85207H2;

        /* JADX INFO: renamed from: I2 */
        public final voe f85208I2;

        /* JADX INFO: renamed from: J2 */
        public final int f85209J2;

        /* JADX INFO: renamed from: K2 */
        public fdg f85210K2;

        /* JADX INFO: renamed from: L2 */
        public msh<T> f85211L2;

        /* JADX INFO: renamed from: M2 */
        public final b0f f85212M2;

        /* JADX INFO: renamed from: N2 */
        public volatile boolean f85213N2;

        public RunnableC13092b(ycg<? super m86<T>> ycgVar, long j, TimeUnit timeUnit, voe voeVar, int i) {
            super(ycgVar, new s1b());
            this.f85212M2 = new b0f();
            this.f85206G2 = j;
            this.f85207H2 = timeUnit;
            this.f85208I2 = voeVar;
            this.f85209J2 = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        
            r10.f85212M2.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r10.f85211L2 = null;
            r0.clear();
            r0 = r10.f17087F2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [msh<T>] */
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
        public void m22710c() {
            /*
                r10 = this;
                uif<U> r0 = r10.f17084C2
                ycg<? super V> r1 = r10.f17083B2
                msh<T> r2 = r10.f85211L2
                r3 = 1
            L7:
                boolean r4 = r10.f85213N2
                boolean r5 = r10.f17086E2
                java.lang.Object r6 = r0.poll()
                r7 = 0
                if (r5 == 0) goto L2e
                if (r6 == 0) goto L18
                java.lang.Object r5 = p000.tl6.RunnableC13092b.f85205O2
                if (r6 != r5) goto L2e
            L18:
                r10.f85211L2 = r7
                r0.clear()
                java.lang.Throwable r0 = r10.f17087F2
                if (r0 == 0) goto L25
                r2.onError(r0)
                goto L28
            L25:
                r2.onComplete()
            L28:
                b0f r0 = r10.f85212M2
                r0.dispose()
                return
            L2e:
                if (r6 != 0) goto L38
                int r3 = -r3
                int r3 = r10.leave(r3)
                if (r3 != 0) goto L7
                return
            L38:
                java.lang.Object r5 = p000.tl6.RunnableC13092b.f85205O2
                if (r6 != r5) goto L87
                r2.onComplete()
                if (r4 != 0) goto L81
                int r2 = r10.f85209J2
                msh r2 = p000.msh.create(r2)
                r10.f85211L2 = r2
                long r4 = r10.requested()
                r8 = 0
                int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r6 == 0) goto L65
                r1.onNext(r2)
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 == 0) goto L7
                r4 = 1
                r10.produced(r4)
                goto L7
            L65:
                r10.f85211L2 = r7
                uif<U> r0 = r10.f17084C2
                r0.clear()
                fdg r0 = r10.f85210K2
                r0.cancel()
                cwa r0 = new cwa
                java.lang.String r2 = "Could not deliver first window due to lack of requests."
                r0.<init>(r2)
                r1.onError(r0)
                b0f r0 = r10.f85212M2
                r0.dispose()
                return
            L81:
                fdg r4 = r10.f85210K2
                r4.cancel()
                goto L7
            L87:
                java.lang.Object r4 = p000.ehb.getValue(r6)
                r2.onNext(r4)
                goto L7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.tl6.RunnableC13092b.m22710c():void");
        }

        @Override // p000.fdg
        public void cancel() {
            this.f17085D2 = true;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f17086E2 = true;
            if (enter()) {
                m22710c();
            }
            this.f17083B2.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f17087F2 = th;
            this.f17086E2 = true;
            if (enter()) {
                m22710c();
            }
            this.f17083B2.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f85213N2) {
                return;
            }
            if (fastEnter()) {
                this.f85211L2.onNext(t);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.f17084C2.offer((U) ehb.next(t));
                if (!enter()) {
                    return;
                }
            }
            m22710c();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f85210K2, fdgVar)) {
                this.f85210K2 = fdgVar;
                this.f85211L2 = msh.create(this.f85209J2);
                ycg<? super V> ycgVar = this.f17083B2;
                ycgVar.onSubscribe(this);
                long jRequested = requested();
                if (jRequested == 0) {
                    this.f17085D2 = true;
                    fdgVar.cancel();
                    ycgVar.onError(new cwa("Could not deliver first window due to lack of requests."));
                    return;
                }
                ycgVar.onNext(this.f85211L2);
                if (jRequested != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (this.f17085D2) {
                    return;
                }
                b0f b0fVar = this.f85212M2;
                voe voeVar = this.f85208I2;
                long j = this.f85206G2;
                if (b0fVar.replace(voeVar.schedulePeriodicallyDirect(this, j, j, this.f85207H2))) {
                    fdgVar.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            requested(j);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.f17085D2) {
                this.f85213N2 = true;
            }
            this.f17084C2.offer((U) f85205O2);
            if (enter()) {
                m22710c();
            }
        }
    }

    /* JADX INFO: renamed from: tl6$c */
    public static final class RunnableC13093c<T> extends cnd<T, Object, m86<T>> implements fdg, Runnable {

        /* JADX INFO: renamed from: G2 */
        public final long f85214G2;

        /* JADX INFO: renamed from: H2 */
        public final long f85215H2;

        /* JADX INFO: renamed from: I2 */
        public final TimeUnit f85216I2;

        /* JADX INFO: renamed from: J2 */
        public final voe.AbstractC14185c f85217J2;

        /* JADX INFO: renamed from: K2 */
        public final int f85218K2;

        /* JADX INFO: renamed from: L2 */
        public final List<msh<T>> f85219L2;

        /* JADX INFO: renamed from: M2 */
        public fdg f85220M2;

        /* JADX INFO: renamed from: N2 */
        public volatile boolean f85221N2;

        /* JADX INFO: renamed from: tl6$c$a */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final msh<T> f85222a;

            public a(msh<T> mshVar) {
                this.f85222a = mshVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC13093c.this.m22711c(this.f85222a);
            }
        }

        /* JADX INFO: renamed from: tl6$c$b */
        public static final class b<T> {

            /* JADX INFO: renamed from: a */
            public final msh<T> f85224a;

            /* JADX INFO: renamed from: b */
            public final boolean f85225b;

            public b(msh<T> mshVar, boolean z) {
                this.f85224a = mshVar;
                this.f85225b = z;
            }
        }

        public RunnableC13093c(ycg<? super m86<T>> ycgVar, long j, long j2, TimeUnit timeUnit, voe.AbstractC14185c abstractC14185c, int i) {
            super(ycgVar, new s1b());
            this.f85214G2 = j;
            this.f85215H2 = j2;
            this.f85216I2 = timeUnit;
            this.f85217J2 = abstractC14185c;
            this.f85218K2 = i;
            this.f85219L2 = new LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: c */
        public void m22711c(msh<T> mshVar) {
            this.f17084C2.offer((U) new b(mshVar, false));
            if (enter()) {
                m22712d();
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f17085D2 = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: d */
        public void m22712d() {
            ajf ajfVar = this.f17084C2;
            ycg<? super V> ycgVar = this.f17083B2;
            List<msh<T>> list = this.f85219L2;
            int iLeave = 1;
            while (!this.f85221N2) {
                boolean z = this.f17086E2;
                Object objPoll = ajfVar.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof b;
                if (z && (z2 || z3)) {
                    ajfVar.clear();
                    Throwable th = this.f17087F2;
                    if (th != null) {
                        Iterator<msh<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        Iterator<msh<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    this.f85217J2.dispose();
                    return;
                }
                if (z2) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (z3) {
                    b bVar = (b) objPoll;
                    if (!bVar.f85225b) {
                        list.remove(bVar.f85224a);
                        bVar.f85224a.onComplete();
                        if (list.isEmpty() && this.f17085D2) {
                            this.f85221N2 = true;
                        }
                    } else if (!this.f17085D2) {
                        long jRequested = requested();
                        if (jRequested != 0) {
                            msh<T> mshVarCreate = msh.create(this.f85218K2);
                            list.add(mshVarCreate);
                            ycgVar.onNext(mshVarCreate);
                            if (jRequested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            this.f85217J2.schedule(new a(mshVarCreate), this.f85214G2, this.f85216I2);
                        } else {
                            ycgVar.onError(new cwa("Can't emit window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator<msh<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objPoll);
                    }
                }
            }
            this.f85220M2.cancel();
            ajfVar.clear();
            list.clear();
            this.f85217J2.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f17086E2 = true;
            if (enter()) {
                m22712d();
            }
            this.f17083B2.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f17087F2 = th;
            this.f17086E2 = true;
            if (enter()) {
                m22712d();
            }
            this.f17083B2.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            if (fastEnter()) {
                Iterator<msh<T>> it = this.f85219L2.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.f17084C2.offer((U) t);
                if (!enter()) {
                    return;
                }
            }
            m22712d();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f85220M2, fdgVar)) {
                this.f85220M2 = fdgVar;
                this.f17083B2.onSubscribe(this);
                if (this.f17085D2) {
                    return;
                }
                long jRequested = requested();
                if (jRequested == 0) {
                    fdgVar.cancel();
                    this.f17083B2.onError(new cwa("Could not emit the first window due to lack of requests"));
                    return;
                }
                msh<T> mshVarCreate = msh.create(this.f85218K2);
                this.f85219L2.add(mshVarCreate);
                this.f17083B2.onNext(mshVarCreate);
                if (jRequested != Long.MAX_VALUE) {
                    produced(1L);
                }
                this.f85217J2.schedule(new a(mshVarCreate), this.f85214G2, this.f85216I2);
                voe.AbstractC14185c abstractC14185c = this.f85217J2;
                long j = this.f85215H2;
                abstractC14185c.schedulePeriodically(this, j, j, this.f85216I2);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            requested(j);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            Object bVar = new b(msh.create(this.f85218K2), true);
            if (!this.f17085D2) {
                this.f17084C2.offer((U) bVar);
            }
            if (enter()) {
                m22712d();
            }
        }
    }

    public tl6(m86<T> m86Var, long j, long j2, TimeUnit timeUnit, voe voeVar, long j3, int i, boolean z) {
        super(m86Var);
        this.f85185c = j;
        this.f85186d = j2;
        this.f85187e = timeUnit;
        this.f85188f = voeVar;
        this.f85189m = j3;
        this.f85183C = i;
        this.f85184F = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super m86<T>> ycgVar) {
        t1f t1fVar = new t1f(ycgVar);
        long j = this.f85185c;
        long j2 = this.f85186d;
        if (j != j2) {
            this.f52360b.subscribe((lj6) new RunnableC13093c(t1fVar, j, j2, this.f85187e, this.f85188f.createWorker(), this.f85183C));
            return;
        }
        long j3 = this.f85189m;
        if (j3 == Long.MAX_VALUE) {
            this.f52360b.subscribe((lj6) new RunnableC13092b(t1fVar, this.f85185c, this.f85187e, this.f85188f, this.f85183C));
        } else {
            this.f52360b.subscribe((lj6) new C13091a(t1fVar, j, this.f85187e, this.f85188f, this.f85183C, j3, this.f85184F));
        }
    }
}
