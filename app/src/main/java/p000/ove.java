package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000.fve;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,904:1\n1#2:905\n2632#3,3:906\n1863#3,2:918\n1863#3,2:926\n1863#3,2:928\n351#4,9:909\n360#4,2:920\n149#5,4:922\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n529#1:906,3\n593#1:918,2\n749#1:926,2\n774#1:928,2\n569#1:909,9\n569#1:920,2\n734#1:922,4\n*E\n"})
@yjd
public class ove<R> implements tp1, fve<R>, qve<R> {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68955f = AtomicReferenceFieldUpdater.newUpdater(ove.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a */
    @yfb
    public final e13 f68956a;

    /* JADX INFO: renamed from: c */
    @gib
    public Object f68958c;
    private volatile /* synthetic */ Object state$volatile = rve.f79894f;

    /* JADX INFO: renamed from: b */
    @gib
    public List<ove<R>.C10668a> f68957b = new ArrayList(2);

    /* JADX INFO: renamed from: d */
    public int f68959d = -1;

    /* JADX INFO: renamed from: e */
    @gib
    public Object f68960e = rve.f79897i;

    /* JADX INFO: renamed from: ove$a */
    @dwf({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation$ClauseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,904:1\n1#2:905\n*E\n"})
    public final class C10668a {

        /* JADX INFO: renamed from: a */
        @un8
        @yfb
        public final Object f68961a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final kz6<Object, pve<?>, Object, bth> f68962b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final kz6<Object, Object, Object, Object> f68963c;

        /* JADX INFO: renamed from: d */
        @gib
        public final Object f68964d;

        /* JADX INFO: renamed from: e */
        @yfb
        public final Object f68965e;

        /* JADX INFO: renamed from: f */
        @gib
        @un8
        public final kz6<pve<?>, Object, Object, kz6<Throwable, Object, e13, bth>> f68966f;

        /* JADX INFO: renamed from: g */
        @gib
        @un8
        public Object f68967g;

        /* JADX INFO: renamed from: h */
        @un8
        public int f68968h = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public C10668a(@yfb Object obj, @yfb kz6<Object, ? super pve<?>, Object, bth> kz6Var, @yfb kz6<Object, Object, Object, ? extends Object> kz6Var2, @gib Object obj2, @yfb Object obj3, @gib kz6<? super pve<?>, Object, Object, ? extends kz6<? super Throwable, Object, ? super e13, bth>> kz6Var3) {
            this.f68961a = obj;
            this.f68962b = kz6Var;
            this.f68963c = kz6Var2;
            this.f68964d = obj2;
            this.f68965e = obj3;
            this.f68966f = kz6Var3;
        }

        @gib
        public final kz6<Throwable, Object, e13, bth> createOnCancellationAction(@yfb pve<?> pveVar, @gib Object obj) {
            kz6<pve<?>, Object, Object, kz6<Throwable, Object, e13, bth>> kz6Var = this.f68966f;
            if (kz6Var != null) {
                return kz6Var.invoke(pveVar, this.f68964d, obj);
            }
            return null;
        }

        public final void dispose() {
            Object obj = this.f68967g;
            ove<R> oveVar = ove.this;
            if (obj instanceof sue) {
                ((sue) obj).onCancellation(this.f68968h, null, oveVar.getContext());
                return;
            }
            yf4 yf4Var = obj instanceof yf4 ? (yf4) obj : null;
            if (yf4Var != null) {
                yf4Var.dispose();
            }
        }

        @gib
        public final Object invokeBlock(@gib Object obj, @yfb zy2<? super R> zy2Var) {
            Object obj2 = this.f68965e;
            if (this.f68964d == rve.getPARAM_CLAUSE_0()) {
                md8.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((qy6) obj2).invoke(zy2Var);
            }
            md8.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((gz6) obj2).invoke(obj, zy2Var);
        }

        @gib
        public final Object processResult(@gib Object obj) {
            return this.f68963c.invoke(this.f68961a, this.f68964d, obj);
        }

        public final boolean tryRegisterAsWaiter(@yfb ove<R> oveVar) {
            this.f68962b.invoke(this.f68961a, oveVar, this.f68964d);
            return oveVar.f68960e == rve.f79897i;
        }
    }

    /* JADX INFO: renamed from: ove$b */
    @ck3(m4009c = "kotlinx.coroutines.selects.SelectImplementation", m4010f = "Select.kt", m4011i = {0}, m4012l = {453, 456}, m4013m = "doSelectSuspend", m4014n = {"this"}, m4015s = {"L$0"})
    public static final class C10669b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f68970a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f68971b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ove<R> f68972c;

        /* JADX INFO: renamed from: d */
        public int f68973d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10669b(ove<R> oveVar, zy2<? super C10669b> zy2Var) {
            super(zy2Var);
            this.f68972c = oveVar;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f68971b = obj;
            this.f68973d |= Integer.MIN_VALUE;
            return this.f68972c.doSelectSuspend(this);
        }
    }

    /* JADX INFO: renamed from: ove$c */
    @ck3(m4009c = "kotlinx.coroutines.selects.SelectImplementation", m4010f = "Select.kt", m4011i = {}, m4012l = {729}, m4013m = "processResultAndInvokeBlockRecoveringException", m4014n = {}, m4015s = {})
    public static final class C10670c extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f68974a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ove<R> f68975b;

        /* JADX INFO: renamed from: c */
        public int f68976c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10670c(ove<R> oveVar, zy2<? super C10670c> zy2Var) {
            super(zy2Var);
            this.f68975b = oveVar;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f68974a = obj;
            this.f68976c |= Integer.MIN_VALUE;
            return this.f68975b.processResultAndInvokeBlockRecoveringException(null, null, this);
        }
    }

    public ove(@yfb e13 e13Var) {
        this.f68956a = e13Var;
    }

    @yjd
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ <R> Object m19043a(ove<R> oveVar, zy2<? super R> zy2Var) {
        return oveVar.isSelected() ? oveVar.complete(zy2Var) : oveVar.doSelectSuspend(zy2Var);
    }

    private final void checkClauseObject(Object obj) {
        List<ove<R>.C10668a> list = this.f68957b;
        md8.checkNotNull(list);
        List<ove<R>.C10668a> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((C10668a) it.next()).f68961a == obj) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
            }
        }
    }

    private final void cleanup(ove<R>.C10668a c10668a) {
        List<ove<R>.C10668a> list = this.f68957b;
        if (list == null) {
            return;
        }
        for (ove<R>.C10668a c10668a2 : list) {
            if (c10668a2 != c10668a) {
                c10668a2.dispose();
            }
        }
        f68955f.set(this, rve.f79895g);
        this.f68960e = rve.f79897i;
        this.f68957b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object complete(zy2<? super R> zy2Var) {
        Object obj = f68955f.get(this);
        md8.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        ove<R>.C10668a c10668a = (C10668a) obj;
        Object obj2 = this.f68960e;
        cleanup(c10668a);
        return c10668a.invokeBlock(c10668a.processResult(obj2), zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doSelectSuspend(p000.zy2<? super R> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p000.ove.C10669b
            if (r0 == 0) goto L13
            r0 = r6
            ove$b r0 = (p000.ove.C10669b) r0
            int r1 = r0.f68973d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68973d = r1
            goto L18
        L13:
            ove$b r0 = new ove$b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f68971b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f68973d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p000.y7e.throwOnFailure(r6)
            goto L57
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f68970a
            ove r2 = (p000.ove) r2
            p000.y7e.throwOnFailure(r6)
            goto L4b
        L3c:
            p000.y7e.throwOnFailure(r6)
            r0.f68970a = r5
            r0.f68973d = r4
            java.lang.Object r6 = r5.waitUntilSelected(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.f68970a = r6
            r0.f68973d = r3
            java.lang.Object r6 = r2.complete(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ove.doSelectSuspend(zy2):java.lang.Object");
    }

    private final ove<R>.C10668a findClause(Object obj) {
        List<ove<R>.C10668a> list = this.f68957b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C10668a) next).f68961a == obj) {
                obj2 = next;
                break;
            }
        }
        ove<R>.C10668a c10668a = (C10668a) obj2;
        if (c10668a != null) {
            return c10668a;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getInRegistrationPhase() {
        Object obj = f68955f.get(this);
        return obj == rve.f79894f || (obj instanceof List);
    }

    private final /* synthetic */ Object getState$volatile() {
        return this.state$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCancelled() {
        return f68955f.get(this) == rve.f79896h;
    }

    private final boolean isSelected() {
        return f68955f.get(this) instanceof C10668a;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, qy6<Object, bth> qy6Var) {
        while (true) {
            qy6Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processResultAndInvokeBlockRecoveringException(p000.ove<R>.C10668a r5, java.lang.Object r6, p000.zy2<? super R> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p000.ove.C10670c
            if (r0 == 0) goto L13
            r0 = r7
            ove$c r0 = (p000.ove.C10670c) r0
            int r1 = r0.f68976c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68976c = r1
            goto L18
        L13:
            ove$c r0 = new ove$c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f68974a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f68976c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p000.y7e.throwOnFailure(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p000.y7e.throwOnFailure(r7)
            java.lang.Object r6 = r5.processResult(r6)
            r0.f68976c = r3
            java.lang.Object r7 = r5.invokeBlock(r6, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ove.processResultAndInvokeBlockRecoveringException(ove$a, java.lang.Object, zy2):java.lang.Object");
    }

    public static /* synthetic */ void register$default(ove oveVar, C10668a c10668a, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        oveVar.register(c10668a, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reregisterClause(Object obj) {
        ove<R>.C10668a c10668aFindClause = findClause(obj);
        md8.checkNotNull(c10668aFindClause);
        c10668aFindClause.f68967g = null;
        c10668aFindClause.f68968h = -1;
        register(c10668aFindClause, true);
    }

    private final /* synthetic */ void setState$volatile(Object obj) {
        this.state$volatile = obj;
    }

    private final int trySelectInternal(Object obj, Object obj2) {
        while (true) {
            Object obj3 = f68955f.get(this);
            if (obj3 instanceof dq1) {
                ove<R>.C10668a c10668aFindClause = findClause(obj);
                if (c10668aFindClause == null) {
                    continue;
                } else {
                    kz6<Throwable, Object, e13, bth> kz6VarCreateOnCancellationAction = c10668aFindClause.createOnCancellationAction(this, obj2);
                    if (C0051a4.m134a(f68955f, this, obj3, c10668aFindClause)) {
                        this.f68960e = obj2;
                        if (rve.tryResume((dq1) obj3, kz6VarCreateOnCancellationAction)) {
                            return 0;
                        }
                        this.f68960e = rve.f79897i;
                        return 2;
                    }
                }
            } else {
                if (md8.areEqual(obj3, rve.f79895g) || (obj3 instanceof C10668a)) {
                    return 3;
                }
                if (md8.areEqual(obj3, rve.f79896h)) {
                    return 2;
                }
                if (md8.areEqual(obj3, rve.f79894f)) {
                    if (C0051a4.m134a(f68955f, this, obj3, k82.listOf(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (C0051a4.m134a(f68955f, this, obj3, v82.plus((Collection<? extends Object>) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    private final /* synthetic */ void update$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, qy6<Object, ? extends Object> qy6Var) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!C0051a4.m134a(atomicReferenceFieldUpdater, obj, obj2, qy6Var.invoke(obj2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r0 = r0.getResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r0 != p000.pd8.getCOROUTINE_SUSPENDED()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        p000.jk3.probeCoroutineSuspended(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r0 != p000.pd8.getCOROUTINE_SUSPENDED()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        return p000.bth.f14751a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object waitUntilSelected(p000.zy2<? super p000.bth> r6) {
        /*
            r5 = this;
            fq1 r0 = new fq1
            zy2 r1 = p000.od8.intercepted(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getState$volatile$FU()
        L11:
            java.lang.Object r2 = r1.get(r5)
            qhg r3 = p000.rve.access$getSTATE_REG$p()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = access$getState$volatile$FU()
            boolean r2 = p000.C0051a4.m134a(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            p000.hq1.invokeOnCancellation(r0, r5)
            goto L62
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = access$getState$volatile$FU()
            qhg r4 = p000.rve.access$getSTATE_REG$p()
            boolean r3 = p000.C0051a4.m134a(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            access$reregisterClause(r5, r3)
            goto L41
        L4f:
            boolean r1 = r2 instanceof p000.ove.C10668a
            if (r1 == 0) goto L79
            bth r1 = p000.bth.f14751a
            ove$a r2 = (p000.ove.C10668a) r2
            java.lang.Object r3 = access$getInternalResult$p(r5)
            kz6 r2 = r2.createOnCancellationAction(r5, r3)
            r0.resume(r1, r2)
        L62:
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L6f
            p000.jk3.probeCoroutineSuspended(r6)
        L6f:
            java.lang.Object r6 = p000.pd8.getCOROUTINE_SUSPENDED()
            if (r0 != r6) goto L76
            return r0
        L76:
            bth r6 = p000.bth.f14751a
            return r6
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected state: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ove.waitUntilSelected(zy2):java.lang.Object");
    }

    @Override // p000.pve
    public void disposeOnCompletion(@yfb yf4 yf4Var) {
        this.f68958c = yf4Var;
    }

    @gib
    @yjd
    public Object doSelect(@yfb zy2<? super R> zy2Var) {
        return m19043a(this, zy2Var);
    }

    @Override // p000.pve
    @yfb
    public e13 getContext() {
        return this.f68956a;
    }

    @Override // p000.fve
    public <P, Q> void invoke(@yfb lve<? super P, ? extends Q> lveVar, @yfb gz6<? super Q, ? super zy2<? super R>, ? extends Object> gz6Var) {
        fve.C5999a.invoke(this, lveVar, gz6Var);
    }

    @Override // p000.wgi
    public void invokeOnCancellation(@yfb sue<?> sueVar, int i) {
        this.f68958c = sueVar;
        this.f68959d = i;
    }

    @Override // p000.fve
    @wg5
    @ip9
    @q64(level = u64.f86866b, message = "Replaced with the same extension function", replaceWith = @i2e(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    public void onTimeout(long j, @yfb qy6<? super zy2<? super R>, ? extends Object> qy6Var) {
        fve.C5999a.onTimeout(this, j, qy6Var);
    }

    @xn8(name = "register")
    public final void register(@yfb ove<R>.C10668a c10668a, boolean z) {
        if (f68955f.get(this) instanceof C10668a) {
            return;
        }
        if (!z) {
            checkClauseObject(c10668a.f68961a);
        }
        if (!c10668a.tryRegisterAsWaiter(this)) {
            f68955f.set(this, c10668a);
            return;
        }
        if (!z) {
            List<ove<R>.C10668a> list = this.f68957b;
            md8.checkNotNull(list);
            list.add(c10668a);
        }
        c10668a.f68967g = this.f68958c;
        c10668a.f68968h = this.f68959d;
        this.f68958c = null;
        this.f68959d = -1;
    }

    @Override // p000.pve
    public void selectInRegistrationPhase(@gib Object obj) {
        this.f68960e = obj;
    }

    @Override // p000.pve
    public boolean trySelect(@yfb Object obj, @gib Object obj2) {
        return trySelectInternal(obj, obj2) == 0;
    }

    @yfb
    public final sjh trySelectDetailed(@yfb Object obj, @gib Object obj2) {
        return rve.TrySelectDetailedResult(trySelectInternal(obj, obj2));
    }

    public void invoke(@yfb hve hveVar, @yfb qy6<? super zy2<? super R>, ? extends Object> qy6Var) {
        register$default(this, new C10668a(hveVar.getClauseObject(), hveVar.getRegFunc(), hveVar.getProcessResFunc(), rve.getPARAM_CLAUSE_0(), qy6Var, hveVar.getOnCancellationConstructor()), false, 1, null);
    }

    public <Q> void invoke(@yfb jve<? extends Q> jveVar, @yfb gz6<? super Q, ? super zy2<? super R>, ? extends Object> gz6Var) {
        register$default(this, new C10668a(jveVar.getClauseObject(), jveVar.getRegFunc(), jveVar.getProcessResFunc(), null, gz6Var, jveVar.getOnCancellationConstructor()), false, 1, null);
    }

    public <P, Q> void invoke(@yfb lve<? super P, ? extends Q> lveVar, P p, @yfb gz6<? super Q, ? super zy2<? super R>, ? extends Object> gz6Var) {
        register$default(this, new C10668a(lveVar.getClauseObject(), lveVar.getRegFunc(), lveVar.getProcessResFunc(), p, gz6Var, lveVar.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // p000.tp1
    public void invoke(@gib Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68955f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == rve.f79895g) {
                return;
            }
        } while (!C0051a4.m134a(atomicReferenceFieldUpdater, this, obj, rve.f79896h));
        List<ove<R>.C10668a> list = this.f68957b;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((C10668a) it.next()).dispose();
        }
        this.f68960e = rve.f79897i;
        this.f68957b = null;
    }
}
