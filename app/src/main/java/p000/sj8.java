package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000.e13;
import p000.jj8;
import p000.jvd;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 7 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 8 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 9 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1583:1\n732#1,3:1587\n361#1,2:1597\n363#1,5:1602\n368#1,5:1608\n373#1,2:1616\n361#1,2:1618\n363#1,5:1623\n368#1,5:1629\n373#1,2:1637\n169#1,2:1645\n734#1:1647\n536#1:1648\n169#1,2:1649\n537#1,15:1651\n169#1,2:1666\n169#1,2:1668\n169#1,2:1681\n732#1,3:1683\n732#1,3:1686\n169#1,2:1689\n732#1,3:1691\n169#1,2:1694\n169#1,2:1698\n169#1,2:1700\n536#1:1704\n169#1,2:1705\n537#1,15:1707\n1#2:1584\n1#2:1607\n1#2:1628\n27#3:1585\n27#3:1696\n27#3:1702\n16#4:1586\n16#4:1697\n16#4:1703\n295#5,2:1590\n295#5,2:1592\n22#6:1594\n159#7:1595\n159#7:1596\n149#7,4:1722\n275#8,3:1599\n278#8,3:1613\n275#8,3:1620\n278#8,3:1634\n275#8,6:1639\n351#9,11:1670\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n241#1:1587,3\n324#1:1597,2\n324#1:1602,5\n324#1:1608,5\n324#1:1616,2\n357#1:1618,2\n357#1:1623,5\n357#1:1629,5\n357#1:1637,2\n377#1:1645,2\n422#1:1647\n468#1:1648\n468#1:1649,2\n468#1:1651,15\n536#1:1666,2\n579#1:1668,2\n621#1:1681,2\n648#1:1683,3\n657#1:1686,3\n721#1:1689,2\n750#1:1691,3\n763#1:1694,2\n836#1:1698,2\n858#1:1700,2\n1023#1:1704\n1023#1:1705,2\n1023#1:1707,15\n324#1:1607\n357#1:1628\n204#1:1585\n766#1:1696\n911#1:1702\n204#1:1586\n766#1:1697\n911#1:1703\n252#1:1590,2\n256#1:1592,2\n264#1:1594\n270#1:1595\n272#1:1596\n1327#1:1722,4\n324#1:1599,3\n324#1:1613,3\n357#1:1620,3\n357#1:1634,3\n362#1:1639,6\n585#1:1670,11\n*E\n"})
@q64(level = u64.f86866b, message = "This is internal API and may be removed in the future releases")
public class sj8 implements jj8, yy1, dhc {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f81981a = AtomicReferenceFieldUpdater.newUpdater(sj8.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f81982b = AtomicReferenceFieldUpdater.newUpdater(sj8.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: sj8$a */
    @dwf({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$AwaitContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
    public static final class C12616a<T> extends fq1<T> {

        /* JADX INFO: renamed from: F */
        @yfb
        public final sj8 f81983F;

        public C12616a(@yfb zy2<? super T> zy2Var, @yfb sj8 sj8Var) {
            super(zy2Var, 1);
            this.f81983F = sj8Var;
        }

        @Override // p000.fq1
        @yfb
        /* JADX INFO: renamed from: b */
        public String mo11046b() {
            return "AwaitContinuation";
        }

        @Override // p000.fq1
        @yfb
        public Throwable getContinuationCancellationCause(@yfb jj8 jj8Var) {
            Throwable rootCause;
            Object state$kotlinx_coroutines_core = this.f81983F.getState$kotlinx_coroutines_core();
            return (!(state$kotlinx_coroutines_core instanceof C12618c) || (rootCause = ((C12618c) state$kotlinx_coroutines_core).getRootCause()) == null) ? state$kotlinx_coroutines_core instanceof ni2 ? ((ni2) state$kotlinx_coroutines_core).f64635a : jj8Var.getCancellationException() : rootCause;
        }
    }

    /* JADX INFO: renamed from: sj8$b */
    public static final class C12617b extends rj8 {

        /* JADX INFO: renamed from: C */
        @gib
        public final Object f81984C;

        /* JADX INFO: renamed from: e */
        @yfb
        public final sj8 f81985e;

        /* JADX INFO: renamed from: f */
        @yfb
        public final C12618c f81986f;

        /* JADX INFO: renamed from: m */
        @yfb
        public final xy1 f81987m;

        public C12617b(@yfb sj8 sj8Var, @yfb C12618c c12618c, @yfb xy1 xy1Var, @gib Object obj) {
            this.f81985e = sj8Var;
            this.f81986f = c12618c;
            this.f81987m = xy1Var;
            this.f81984C = obj;
        }

        @Override // p000.rj8
        public boolean getOnCancelling() {
            return false;
        }

        @Override // p000.rj8
        public void invoke(@gib Throwable th) {
            this.f81985e.continueCompleting(this.f81986f, this.f81987m, this.f81984C);
        }
    }

    /* JADX INFO: renamed from: sj8$c */
    @dwf({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$Finishing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
    public static final class C12618c implements iz7 {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f81988b = AtomicIntegerFieldUpdater.newUpdater(C12618c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f81989c = AtomicReferenceFieldUpdater.newUpdater(C12618c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f81990d = AtomicReferenceFieldUpdater.newUpdater(C12618c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a */
        @yfb
        public final meb f81991a;

        public C12618c(@yfb meb mebVar, boolean z, @gib Throwable th) {
            this.f81991a = mebVar;
            this._isCompleting$volatile = z ? 1 : 0;
            this._rootCause$volatile = th;
        }

        private final ArrayList<Throwable> allocateList() {
            return new ArrayList<>(4);
        }

        private final Object getExceptionsHolder() {
            return f81990d.get(this);
        }

        private final /* synthetic */ Object get_exceptionsHolder$volatile() {
            return this._exceptionsHolder$volatile;
        }

        private final /* synthetic */ int get_isCompleting$volatile() {
            return this._isCompleting$volatile;
        }

        private final /* synthetic */ Object get_rootCause$volatile() {
            return this._rootCause$volatile;
        }

        private final void setExceptionsHolder(Object obj) {
            f81990d.set(this, obj);
        }

        private final /* synthetic */ void set_exceptionsHolder$volatile(Object obj) {
            this._exceptionsHolder$volatile = obj;
        }

        private final /* synthetic */ void set_isCompleting$volatile(int i) {
            this._isCompleting$volatile = i;
        }

        private final /* synthetic */ void set_rootCause$volatile(Object obj) {
            this._rootCause$volatile = obj;
        }

        public final void addExceptionLocked(@yfb Throwable th) {
            Throwable rootCause = getRootCause();
            if (rootCause == null) {
                setRootCause(th);
                return;
            }
            if (th == rootCause) {
                return;
            }
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                setExceptionsHolder(th);
                return;
            }
            if (exceptionsHolder instanceof Throwable) {
                if (th == exceptionsHolder) {
                    return;
                }
                ArrayList<Throwable> arrayListAllocateList = allocateList();
                arrayListAllocateList.add(exceptionsHolder);
                arrayListAllocateList.add(th);
                setExceptionsHolder(arrayListAllocateList);
                return;
            }
            if (exceptionsHolder instanceof ArrayList) {
                ((ArrayList) exceptionsHolder).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + exceptionsHolder).toString());
        }

        @Override // p000.iz7
        @yfb
        public meb getList() {
            return this.f81991a;
        }

        @gib
        public final Throwable getRootCause() {
            return (Throwable) f81989c.get(this);
        }

        @Override // p000.iz7
        public boolean isActive() {
            return getRootCause() == null;
        }

        public final boolean isCancelling() {
            return getRootCause() != null;
        }

        public final boolean isCompleting() {
            return f81988b.get(this) != 0;
        }

        public final boolean isSealed() {
            return getExceptionsHolder() == tj8.f85056h;
        }

        @yfb
        public final List<Throwable> sealLocked(@gib Throwable th) {
            ArrayList<Throwable> arrayListAllocateList;
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                arrayListAllocateList = allocateList();
            } else if (exceptionsHolder instanceof Throwable) {
                ArrayList<Throwable> arrayListAllocateList2 = allocateList();
                arrayListAllocateList2.add(exceptionsHolder);
                arrayListAllocateList = arrayListAllocateList2;
            } else {
                if (!(exceptionsHolder instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + exceptionsHolder).toString());
                }
                arrayListAllocateList = (ArrayList) exceptionsHolder;
            }
            Throwable rootCause = getRootCause();
            if (rootCause != null) {
                arrayListAllocateList.add(0, rootCause);
            }
            if (th != null && !md8.areEqual(th, rootCause)) {
                arrayListAllocateList.add(th);
            }
            setExceptionsHolder(tj8.f85056h);
            return arrayListAllocateList;
        }

        public final void setCompleting(boolean z) {
            f81988b.set(this, z ? 1 : 0);
        }

        public final void setRootCause(@gib Throwable th) {
            f81989c.set(this, th);
        }

        @yfb
        public String toString() {
            return "Finishing[cancelling=" + isCancelling() + ", completing=" + isCompleting() + ", rootCause=" + getRootCause() + ", exceptions=" + getExceptionsHolder() + ", list=" + getList() + C4584d2.f28243l;
        }
    }

    /* JADX INFO: renamed from: sj8$d */
    public final class C12619d extends rj8 {

        /* JADX INFO: renamed from: e */
        @yfb
        public final pve<?> f81992e;

        public C12619d(@yfb pve<?> pveVar) {
            this.f81992e = pveVar;
        }

        @Override // p000.rj8
        public boolean getOnCancelling() {
            return false;
        }

        @Override // p000.rj8
        public void invoke(@gib Throwable th) {
            Object state$kotlinx_coroutines_core = sj8.this.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof ni2)) {
                state$kotlinx_coroutines_core = tj8.unboxState(state$kotlinx_coroutines_core);
            }
            this.f81992e.trySelect(sj8.this, state$kotlinx_coroutines_core);
        }
    }

    /* JADX INFO: renamed from: sj8$e */
    public final class C12620e extends rj8 {

        /* JADX INFO: renamed from: e */
        @yfb
        public final pve<?> f81994e;

        public C12620e(@yfb pve<?> pveVar) {
            this.f81994e = pveVar;
        }

        @Override // p000.rj8
        public boolean getOnCancelling() {
            return false;
        }

        @Override // p000.rj8
        public void invoke(@gib Throwable th) {
            this.f81994e.trySelect(sj8.this, bth.f14751a);
        }
    }

    /* JADX INFO: renamed from: sj8$f */
    @ck3(m4009c = "kotlinx.coroutines.JobSupport$children$1", m4010f = "JobSupport.kt", m4011i = {1, 1, 1}, m4012l = {1003, 1005}, m4013m = "invokeSuspend", m4014n = {"$this$sequence", "this_$iv", "cur$iv"}, m4015s = {"L$0", "L$1", "L$2"})
    @dwf({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1583:1\n275#2,6:1584\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n*L\n1005#1:1584,6\n*E\n"})
    public static final class C12621f extends t7e implements gz6<xye<? super jj8>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f81996a;

        /* JADX INFO: renamed from: b */
        public Object f81997b;

        /* JADX INFO: renamed from: c */
        public int f81998c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f81999d;

        public C12621f(zy2<? super C12621f> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C12621f c12621f = sj8.this.new C12621f(zy2Var);
            c12621f.f81999d = obj;
            return c12621f;
        }

        @Override // p000.gz6
        public final Object invoke(xye<? super jj8> xyeVar, zy2<? super bth> zy2Var) {
            return ((C12621f) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r6.f81998c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.f81997b
                lh9 r1 = (p000.lh9) r1
                java.lang.Object r3 = r6.f81996a
                jh9 r3 = (p000.jh9) r3
                java.lang.Object r4 = r6.f81999d
                xye r4 = (p000.xye) r4
                p000.y7e.throwOnFailure(r7)
                goto L81
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                p000.y7e.throwOnFailure(r7)
                goto L86
            L2a:
                p000.y7e.throwOnFailure(r7)
                java.lang.Object r7 = r6.f81999d
                xye r7 = (p000.xye) r7
                sj8 r1 = p000.sj8.this
                java.lang.Object r1 = r1.getState$kotlinx_coroutines_core()
                boolean r4 = r1 instanceof p000.xy1
                if (r4 == 0) goto L48
                xy1 r1 = (p000.xy1) r1
                yy1 r1 = r1.f99649e
                r6.f81998c = r3
                java.lang.Object r7 = r7.yield(r1, r6)
                if (r7 != r0) goto L86
                return r0
            L48:
                boolean r3 = r1 instanceof p000.iz7
                if (r3 == 0) goto L86
                iz7 r1 = (p000.iz7) r1
                meb r1 = r1.getList()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.getNext()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                p000.md8.checkNotNull(r3, r4)
                lh9 r3 = (p000.lh9) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L63:
                boolean r7 = p000.md8.areEqual(r1, r3)
                if (r7 != 0) goto L86
                boolean r7 = r1 instanceof p000.xy1
                if (r7 == 0) goto L81
                r7 = r1
                xy1 r7 = (p000.xy1) r7
                yy1 r7 = r7.f99649e
                r6.f81999d = r4
                r6.f81996a = r3
                r6.f81997b = r1
                r6.f81998c = r2
                java.lang.Object r7 = r4.yield(r7, r6)
                if (r7 != r0) goto L81
                return r0
            L81:
                lh9 r1 = r1.getNextNode()
                goto L63
            L86:
                bth r7 = p000.bth.f14751a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.sj8.C12621f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: sj8$g */
    public /* synthetic */ class C12622g extends n07 implements kz6<sj8, pve<?>, Object, bth> {

        /* JADX INFO: renamed from: a */
        public static final C12622g f82001a = new C12622g();

        public C12622g() {
            super(3, sj8.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(sj8 sj8Var, pve<?> pveVar, Object obj) {
            invoke2(sj8Var, pveVar, obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(sj8 sj8Var, pve<?> pveVar, Object obj) {
            sj8Var.onAwaitInternalRegFunc(pveVar, obj);
        }
    }

    /* JADX INFO: renamed from: sj8$h */
    public /* synthetic */ class C12623h extends n07 implements kz6<sj8, Object, Object, Object> {

        /* JADX INFO: renamed from: a */
        public static final C12623h f82002a = new C12623h();

        public C12623h() {
            super(3, sj8.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // p000.kz6
        public final Object invoke(sj8 sj8Var, Object obj, Object obj2) {
            return sj8Var.onAwaitInternalProcessResFunc(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: sj8$i */
    public /* synthetic */ class C12624i extends n07 implements kz6<sj8, pve<?>, Object, bth> {

        /* JADX INFO: renamed from: a */
        public static final C12624i f82003a = new C12624i();

        public C12624i() {
            super(3, sj8.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(sj8 sj8Var, pve<?> pveVar, Object obj) {
            invoke2(sj8Var, pveVar, obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(sj8 sj8Var, pve<?> pveVar, Object obj) {
            sj8Var.registerSelectForOnJoin(pveVar, obj);
        }
    }

    public sj8(boolean z) {
        this._state$volatile = z ? tj8.f85058j : tj8.f85057i;
    }

    private final void addSuppressedExceptions(Throwable th, List<? extends Throwable> list) throws IllegalAccessException, InvocationTargetException {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                a85.addSuppressed(th, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitSuspend(zy2<Object> zy2Var) {
        C12616a c12616a = new C12616a(od8.intercepted(zy2Var), this);
        c12616a.initCancellability();
        hq1.disposeOnCancellation(c12616a, qj8.invokeOnCompletion$default(this, false, new b8e(c12616a), 1, null));
        Object result = c12616a.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    private final Object cancelMakeCompleting(Object obj) throws Throwable {
        Object objTryMakeCompleting;
        do {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof iz7) || ((state$kotlinx_coroutines_core instanceof C12618c) && ((C12618c) state$kotlinx_coroutines_core).isCompleting())) {
                return tj8.f85049a;
            }
            objTryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new ni2(createCauseException(obj), false, 2, null));
        } while (objTryMakeCompleting == tj8.f85051c);
        return objTryMakeCompleting;
    }

    private final boolean cancelParent(Throwable th) {
        if (mo3832j()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        wy1 parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        return (parentHandle$kotlinx_coroutines_core == null || parentHandle$kotlinx_coroutines_core == xeb.f97598a) ? z : parentHandle$kotlinx_coroutines_core.childCancelled(th) || z;
    }

    private final void completeStateFinalization(iz7 iz7Var, Object obj) throws Throwable {
        wy1 parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            parentHandle$kotlinx_coroutines_core.dispose();
            setParentHandle$kotlinx_coroutines_core(xeb.f97598a);
        }
        ni2 ni2Var = obj instanceof ni2 ? (ni2) obj : null;
        Throwable th = ni2Var != null ? ni2Var.f64635a : null;
        if (!(iz7Var instanceof rj8)) {
            meb list = iz7Var.getList();
            if (list != null) {
                notifyCompletion(list, th);
                return;
            }
            return;
        }
        try {
            ((rj8) iz7Var).invoke(th);
        } catch (Throwable th2) {
            handleOnCompletionException$kotlinx_coroutines_core(new oi2("Exception in completion handler " + iz7Var + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void continueCompleting(C12618c c12618c, xy1 xy1Var, Object obj) {
        xy1 xy1VarNextChild = nextChild(xy1Var);
        if (xy1VarNextChild == null || !tryWaitForChild(c12618c, xy1VarNextChild, obj)) {
            c12618c.getList().close(2);
            xy1 xy1VarNextChild2 = nextChild(xy1Var);
            if (xy1VarNextChild2 == null || !tryWaitForChild(c12618c, xy1VarNextChild2, obj)) {
                mo3831a(finalizeFinishingState(c12618c, obj));
            }
        }
    }

    private final Throwable createCauseException(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new kj8(mo22028c(), null, this) : th;
        }
        md8.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((dhc) obj).getChildJobCancellationCause();
    }

    public static /* synthetic */ kj8 defaultCancellationException$kotlinx_coroutines_core$default(sj8 sj8Var, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if (str == null) {
            str = sj8Var.mo22028c();
        }
        return new kj8(str, th, sj8Var);
    }

    private final Object finalizeFinishingState(C12618c c12618c, Object obj) throws Throwable {
        boolean zIsCancelling;
        Throwable finalRootCause;
        ni2 ni2Var = obj instanceof ni2 ? (ni2) obj : null;
        Throwable th = ni2Var != null ? ni2Var.f64635a : null;
        synchronized (c12618c) {
            zIsCancelling = c12618c.isCancelling();
            List<Throwable> listSealLocked = c12618c.sealLocked(th);
            finalRootCause = getFinalRootCause(c12618c, listSealLocked);
            if (finalRootCause != null) {
                addSuppressedExceptions(finalRootCause, listSealLocked);
            }
        }
        if (finalRootCause != null && finalRootCause != th) {
            obj = new ni2(finalRootCause, false, 2, null);
        }
        if (finalRootCause != null && (cancelParent(finalRootCause) || mo22032h(finalRootCause))) {
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((ni2) obj).makeHandled();
        }
        if (!zIsCancelling) {
            mo22034k(finalRootCause);
        }
        mo22035l(obj);
        C0051a4.m134a(f81981a, this, c12618c, tj8.boxIncomplete(obj));
        completeStateFinalization(c12618c, obj);
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m22026g() {
    }

    private final Throwable getExceptionOrNull(Object obj) {
        ni2 ni2Var = obj instanceof ni2 ? (ni2) obj : null;
        if (ni2Var != null) {
            return ni2Var.f64635a;
        }
        return null;
    }

    private final Throwable getFinalRootCause(C12618c c12618c, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (c12618c.isCancelling()) {
                return new kj8(mo22028c(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof x1h) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof x1h)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public static /* synthetic */ void getOnJoin$annotations() {
    }

    private final meb getOrPromoteCancellingList(iz7 iz7Var) {
        meb list = iz7Var.getList();
        if (list != null) {
            return list;
        }
        if (iz7Var instanceof rz4) {
            return new meb();
        }
        if (iz7Var instanceof rj8) {
            promoteSingleToNodeList((rj8) iz7Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + iz7Var).toString());
    }

    private final /* synthetic */ Object get_parentHandle$volatile() {
        return this._parentHandle$volatile;
    }

    private final /* synthetic */ Object get_state$volatile() {
        return this._state$volatile;
    }

    private final boolean isCancelling(iz7 iz7Var) {
        return (iz7Var instanceof C12618c) && ((C12618c) iz7Var).isCancelling();
    }

    private final boolean joinInternal() {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof iz7)) {
                return false;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object joinSuspend(zy2<? super bth> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        hq1.disposeOnCancellation(fq1Var, qj8.invokeOnCompletion$default(this, false, new e8e(fq1Var), 1, null));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    private final Void loopOnState(qy6<Object, bth> qy6Var) {
        while (true) {
            qy6Var.invoke(getState$kotlinx_coroutines_core());
        }
    }

    private final Object makeCancelling(Object obj) throws Throwable {
        Throwable thCreateCauseException = null;
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof C12618c) {
                synchronized (state$kotlinx_coroutines_core) {
                    if (((C12618c) state$kotlinx_coroutines_core).isSealed()) {
                        return tj8.f85052d;
                    }
                    boolean zIsCancelling = ((C12618c) state$kotlinx_coroutines_core).isCancelling();
                    if (obj != null || !zIsCancelling) {
                        if (thCreateCauseException == null) {
                            thCreateCauseException = createCauseException(obj);
                        }
                        ((C12618c) state$kotlinx_coroutines_core).addExceptionLocked(thCreateCauseException);
                    }
                    Throwable rootCause = zIsCancelling ? null : ((C12618c) state$kotlinx_coroutines_core).getRootCause();
                    if (rootCause != null) {
                        notifyCancelling(((C12618c) state$kotlinx_coroutines_core).getList(), rootCause);
                    }
                    return tj8.f85049a;
                }
            }
            if (!(state$kotlinx_coroutines_core instanceof iz7)) {
                return tj8.f85052d;
            }
            if (thCreateCauseException == null) {
                thCreateCauseException = createCauseException(obj);
            }
            iz7 iz7Var = (iz7) state$kotlinx_coroutines_core;
            if (!iz7Var.isActive()) {
                Object objTryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new ni2(thCreateCauseException, false, 2, null));
                if (objTryMakeCompleting == tj8.f85049a) {
                    throw new IllegalStateException(("Cannot happen in " + state$kotlinx_coroutines_core).toString());
                }
                if (objTryMakeCompleting != tj8.f85051c) {
                    return objTryMakeCompleting;
                }
            } else if (tryMakeCancelling(iz7Var, thCreateCauseException)) {
                return tj8.f85049a;
            }
        }
    }

    private final xy1 nextChild(lh9 lh9Var) {
        while (lh9Var.isRemoved()) {
            lh9Var = lh9Var.getPrevNode();
        }
        while (true) {
            lh9Var = lh9Var.getNextNode();
            if (!lh9Var.isRemoved()) {
                if (lh9Var instanceof xy1) {
                    return (xy1) lh9Var;
                }
                if (lh9Var instanceof meb) {
                    return null;
                }
            }
        }
    }

    private final void notifyCancelling(meb mebVar, Throwable th) throws Throwable {
        mo22034k(th);
        mebVar.close(4);
        Object next = mebVar.getNext();
        md8.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        oi2 oi2Var = null;
        for (lh9 nextNode = (lh9) next; !md8.areEqual(nextNode, mebVar); nextNode = nextNode.getNextNode()) {
            if ((nextNode instanceof rj8) && ((rj8) nextNode).getOnCancelling()) {
                try {
                    ((rj8) nextNode).invoke(th);
                } catch (Throwable th2) {
                    if (oi2Var != null) {
                        a85.addSuppressed(oi2Var, th2);
                    } else {
                        oi2Var = new oi2("Exception in completion handler " + nextNode + " for " + this, th2);
                        bth bthVar = bth.f14751a;
                    }
                }
            }
        }
        if (oi2Var != null) {
            handleOnCompletionException$kotlinx_coroutines_core(oi2Var);
        }
        cancelParent(th);
    }

    private final void notifyCompletion(meb mebVar, Throwable th) throws Throwable {
        mebVar.close(1);
        Object next = mebVar.getNext();
        md8.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        oi2 oi2Var = null;
        for (lh9 nextNode = (lh9) next; !md8.areEqual(nextNode, mebVar); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof rj8) {
                try {
                    ((rj8) nextNode).invoke(th);
                } catch (Throwable th2) {
                    if (oi2Var != null) {
                        a85.addSuppressed(oi2Var, th2);
                    } else {
                        oi2Var = new oi2("Exception in completion handler " + nextNode + " for " + this, th2);
                        bth bthVar = bth.f14751a;
                    }
                }
            }
        }
        if (oi2Var != null) {
            handleOnCompletionException$kotlinx_coroutines_core(oi2Var);
        }
    }

    private final void notifyHandlers(meb mebVar, Throwable th, qy6<? super rj8, Boolean> qy6Var) throws Throwable {
        Object next = mebVar.getNext();
        md8.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        oi2 oi2Var = null;
        for (lh9 nextNode = (lh9) next; !md8.areEqual(nextNode, mebVar); nextNode = nextNode.getNextNode()) {
            if ((nextNode instanceof rj8) && qy6Var.invoke(nextNode).booleanValue()) {
                try {
                    ((rj8) nextNode).invoke(th);
                } catch (Throwable th2) {
                    if (oi2Var != null) {
                        a85.addSuppressed(oi2Var, th2);
                    } else {
                        oi2Var = new oi2("Exception in completion handler " + nextNode + " for " + this, th2);
                        bth bthVar = bth.f14751a;
                    }
                }
            }
        }
        if (oi2Var != null) {
            handleOnCompletionException$kotlinx_coroutines_core(oi2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onAwaitInternalProcessResFunc(Object obj, Object obj2) throws Throwable {
        if (obj2 instanceof ni2) {
            throw ((ni2) obj2).f64635a;
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAwaitInternalRegFunc(pve<?> pveVar, Object obj) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof iz7)) {
                if (!(state$kotlinx_coroutines_core instanceof ni2)) {
                    state$kotlinx_coroutines_core = tj8.unboxState(state$kotlinx_coroutines_core);
                }
                pveVar.selectInRegistrationPhase(state$kotlinx_coroutines_core);
                return;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        pveVar.disposeOnCompletion(qj8.invokeOnCompletion$default(this, false, new C12619d(pveVar), 1, null));
    }

    private final void promoteEmptyToNodeList(rz4 rz4Var) {
        meb mebVar = new meb();
        Object dz7Var = mebVar;
        if (!rz4Var.isActive()) {
            dz7Var = new dz7(mebVar);
        }
        C0051a4.m134a(f81981a, this, rz4Var, dz7Var);
    }

    private final void promoteSingleToNodeList(rj8 rj8Var) {
        rj8Var.addOneIfEmpty(new meb());
        C0051a4.m134a(f81981a, this, rj8Var, rj8Var.getNextNode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForOnJoin(pve<?> pveVar, Object obj) {
        if (joinInternal()) {
            pveVar.disposeOnCompletion(qj8.invokeOnCompletion$default(this, false, new C12620e(pveVar), 1, null));
        } else {
            pveVar.selectInRegistrationPhase(bth.f14751a);
        }
    }

    private final /* synthetic */ void set_parentHandle$volatile(Object obj) {
        this._parentHandle$volatile = obj;
    }

    private final /* synthetic */ void set_state$volatile(Object obj) {
        this._state$volatile = obj;
    }

    private final int startInternal(Object obj) {
        if (obj instanceof rz4) {
            if (((rz4) obj).isActive()) {
                return 0;
            }
            if (!C0051a4.m134a(f81981a, this, obj, tj8.f85058j)) {
                return -1;
            }
            mo2873m();
            return 1;
        }
        if (!(obj instanceof dz7)) {
            return 0;
        }
        if (!C0051a4.m134a(f81981a, this, obj, ((dz7) obj).getList())) {
            return -1;
        }
        mo2873m();
        return 1;
    }

    private final String stateString(Object obj) {
        if (!(obj instanceof C12618c)) {
            return obj instanceof iz7 ? ((iz7) obj).isActive() ? "Active" : "New" : obj instanceof ni2 ? "Cancelled" : "Completed";
        }
        C12618c c12618c = (C12618c) obj;
        return c12618c.isCancelling() ? "Cancelling" : c12618c.isCompleting() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException toCancellationException$default(sj8 sj8Var, Throwable th, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return sj8Var.m22036n(th, str);
    }

    private final boolean tryFinalizeSimpleState(iz7 iz7Var, Object obj) throws Throwable {
        if (!C0051a4.m134a(f81981a, this, iz7Var, tj8.boxIncomplete(obj))) {
            return false;
        }
        mo22034k(null);
        mo22035l(obj);
        completeStateFinalization(iz7Var, obj);
        return true;
    }

    private final boolean tryMakeCancelling(iz7 iz7Var, Throwable th) throws Throwable {
        meb orPromoteCancellingList = getOrPromoteCancellingList(iz7Var);
        if (orPromoteCancellingList == null) {
            return false;
        }
        if (!C0051a4.m134a(f81981a, this, iz7Var, new C12618c(orPromoteCancellingList, false, th))) {
            return false;
        }
        notifyCancelling(orPromoteCancellingList, th);
        return true;
    }

    private final Object tryMakeCompleting(Object obj, Object obj2) throws Throwable {
        return !(obj instanceof iz7) ? tj8.f85049a : ((!(obj instanceof rz4) && !(obj instanceof rj8)) || (obj instanceof xy1) || (obj2 instanceof ni2)) ? tryMakeCompletingSlowPath((iz7) obj, obj2) : tryFinalizeSimpleState((iz7) obj, obj2) ? obj2 : tj8.f85051c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object tryMakeCompletingSlowPath(iz7 iz7Var, Object obj) throws Throwable {
        meb orPromoteCancellingList = getOrPromoteCancellingList(iz7Var);
        if (orPromoteCancellingList == null) {
            return tj8.f85051c;
        }
        C12618c c12618c = iz7Var instanceof C12618c ? (C12618c) iz7Var : null;
        if (c12618c == null) {
            c12618c = new C12618c(orPromoteCancellingList, false, null);
        }
        jvd.C8121h c8121h = new jvd.C8121h();
        synchronized (c12618c) {
            if (c12618c.isCompleting()) {
                return tj8.f85049a;
            }
            c12618c.setCompleting(true);
            if (c12618c != iz7Var && !C0051a4.m134a(f81981a, this, iz7Var, c12618c)) {
                return tj8.f85051c;
            }
            boolean zIsCancelling = c12618c.isCancelling();
            ni2 ni2Var = obj instanceof ni2 ? (ni2) obj : null;
            if (ni2Var != null) {
                c12618c.addExceptionLocked(ni2Var.f64635a);
            }
            ?? rootCause = zIsCancelling ? 0 : c12618c.getRootCause();
            c8121h.f52110a = rootCause;
            bth bthVar = bth.f14751a;
            if (rootCause != 0) {
                notifyCancelling(orPromoteCancellingList, rootCause);
            }
            xy1 xy1VarNextChild = nextChild(orPromoteCancellingList);
            if (xy1VarNextChild != null && tryWaitForChild(c12618c, xy1VarNextChild, obj)) {
                return tj8.f85050b;
            }
            orPromoteCancellingList.close(2);
            xy1 xy1VarNextChild2 = nextChild(orPromoteCancellingList);
            return (xy1VarNextChild2 == null || !tryWaitForChild(c12618c, xy1VarNextChild2, obj)) ? finalizeFinishingState(c12618c, obj) : tj8.f85050b;
        }
    }

    private final boolean tryPutNodeIntoList(rj8 rj8Var, gz6<? super iz7, ? super meb, Boolean> gz6Var) {
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof rz4) {
                rz4 rz4Var = (rz4) state$kotlinx_coroutines_core;
                if (!rz4Var.isActive()) {
                    promoteEmptyToNodeList(rz4Var);
                } else if (C0051a4.m134a(f81981a, this, state$kotlinx_coroutines_core, rj8Var)) {
                    return true;
                }
            } else {
                if (!(state$kotlinx_coroutines_core instanceof iz7)) {
                    return false;
                }
                meb list = ((iz7) state$kotlinx_coroutines_core).getList();
                if (list == null) {
                    md8.checkNotNull(state$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    promoteSingleToNodeList((rj8) state$kotlinx_coroutines_core);
                } else if (gz6Var.invoke(state$kotlinx_coroutines_core, list).booleanValue()) {
                    return true;
                }
            }
        }
    }

    private final boolean tryWaitForChild(C12618c c12618c, xy1 xy1Var, Object obj) {
        while (oj8.invokeOnCompletion(xy1Var.f99649e, false, new C12617b(this, c12618c, xy1Var, obj)) == xeb.f97598a) {
            xy1Var = nextChild(xy1Var);
            if (xy1Var == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void mo3831a(@gib Object obj) {
    }

    @Override // p000.jj8
    @yfb
    public final wy1 attachChild(@yfb yy1 yy1Var) {
        xy1 xy1Var = new xy1(yy1Var);
        xy1Var.setJob(this);
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof rz4) {
                rz4 rz4Var = (rz4) state$kotlinx_coroutines_core;
                if (!rz4Var.isActive()) {
                    promoteEmptyToNodeList(rz4Var);
                } else if (C0051a4.m134a(f81981a, this, state$kotlinx_coroutines_core, xy1Var)) {
                    break;
                }
            } else {
                if (!(state$kotlinx_coroutines_core instanceof iz7)) {
                    Object state$kotlinx_coroutines_core2 = getState$kotlinx_coroutines_core();
                    ni2 ni2Var = state$kotlinx_coroutines_core2 instanceof ni2 ? (ni2) state$kotlinx_coroutines_core2 : null;
                    xy1Var.invoke(ni2Var != null ? ni2Var.f64635a : null);
                    return xeb.f97598a;
                }
                meb list = ((iz7) state$kotlinx_coroutines_core).getList();
                if (list == null) {
                    md8.checkNotNull(state$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    promoteSingleToNodeList((rj8) state$kotlinx_coroutines_core);
                } else if (!list.addLast(xy1Var, 7)) {
                    boolean zAddLast = list.addLast(xy1Var, 3);
                    Object state$kotlinx_coroutines_core3 = getState$kotlinx_coroutines_core();
                    if (state$kotlinx_coroutines_core3 instanceof C12618c) {
                        rootCause = ((C12618c) state$kotlinx_coroutines_core3).getRootCause();
                    } else {
                        ni2 ni2Var2 = state$kotlinx_coroutines_core3 instanceof ni2 ? (ni2) state$kotlinx_coroutines_core3 : null;
                        if (ni2Var2 != null) {
                            rootCause = ni2Var2.f64635a;
                        }
                    }
                    xy1Var.invoke(rootCause);
                    if (!zAddLast) {
                        return xeb.f97598a;
                    }
                }
            }
        }
        return xy1Var;
    }

    @gib
    /* JADX INFO: renamed from: b */
    public final Object m22027b(@yfb zy2<Object> zy2Var) throws Throwable {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof iz7)) {
                if (state$kotlinx_coroutines_core instanceof ni2) {
                    throw ((ni2) state$kotlinx_coroutines_core).f64635a;
                }
                return tj8.unboxState(state$kotlinx_coroutines_core);
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return awaitSuspend(zy2Var);
    }

    @yfb
    /* JADX INFO: renamed from: c */
    public String mo22028c() {
        return "Job was cancelled";
    }

    @Override // p000.jj8
    @q64(level = u64.f86867c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    public final boolean cancelCoroutine(@gib Throwable th) {
        return cancelImpl$kotlinx_coroutines_core(th);
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(@gib Object obj) throws Throwable {
        Object objMakeCancelling = tj8.f85049a;
        if (getOnCancelComplete$kotlinx_coroutines_core() && (objMakeCancelling = cancelMakeCompleting(obj)) == tj8.f85050b) {
            return true;
        }
        if (objMakeCancelling == tj8.f85049a) {
            objMakeCancelling = makeCancelling(obj);
        }
        if (objMakeCancelling == tj8.f85049a || objMakeCancelling == tj8.f85050b) {
            return true;
        }
        if (objMakeCancelling == tj8.f85052d) {
            return false;
        }
        mo3831a(objMakeCancelling);
        return true;
    }

    public void cancelInternal(@yfb Throwable th) throws Throwable {
        cancelImpl$kotlinx_coroutines_core(th);
    }

    public boolean childCancelled(@yfb Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th) && getHandlesException$kotlinx_coroutines_core();
    }

    @gib
    /* JADX INFO: renamed from: d */
    public final Throwable m22029d() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof C12618c) {
            Throwable rootCause = ((C12618c) state$kotlinx_coroutines_core).getRootCause();
            if (rootCause != null) {
                return rootCause;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(state$kotlinx_coroutines_core instanceof iz7)) {
            if (state$kotlinx_coroutines_core instanceof ni2) {
                return ((ni2) state$kotlinx_coroutines_core).f64635a;
            }
            return null;
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @yfb
    public final kj8 defaultCancellationException$kotlinx_coroutines_core(@gib String str, @gib Throwable th) {
        if (str == null) {
            str = mo22028c();
        }
        return new kj8(str, th, this);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m22030e() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof ni2) && ((ni2) state$kotlinx_coroutines_core).getHandled();
    }

    @yfb
    /* JADX INFO: renamed from: f */
    public final jve<?> m22031f() {
        C12622g c12622g = C12622g.f82001a;
        md8.checkNotNull(c12622g, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        kz6 kz6Var = (kz6) qlh.beforeCheckcastToFunctionOfArity(c12622g, 3);
        C12623h c12623h = C12623h.f82002a;
        md8.checkNotNull(c12623h, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kve(this, kz6Var, (kz6) qlh.beforeCheckcastToFunctionOfArity(c12623h, 3), null, 8, null);
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    public <R> R fold(R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
        return (R) jj8.C7916a.fold(this, r, gz6Var);
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @gib
    public <E extends e13.InterfaceC5040b> E get(@yfb e13.InterfaceC5041c<E> interfaceC5041c) {
        return (E) jj8.C7916a.get(this, interfaceC5041c);
    }

    @Override // p000.jj8
    @yfb
    public final CancellationException getCancellationException() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof C12618c)) {
            if (state$kotlinx_coroutines_core instanceof iz7) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (state$kotlinx_coroutines_core instanceof ni2) {
                return toCancellationException$default(this, ((ni2) state$kotlinx_coroutines_core).f64635a, null, 1, null);
            }
            return new kj8(kk3.getClassSimpleName(this) + " has completed normally", null, this);
        }
        Throwable rootCause = ((C12618c) state$kotlinx_coroutines_core).getRootCause();
        if (rootCause != null) {
            CancellationException cancellationExceptionM22036n = m22036n(rootCause, kk3.getClassSimpleName(this) + " is cancelling");
            if (cancellationExceptionM22036n != null) {
                return cancellationExceptionM22036n;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // p000.dhc
    @yfb
    public CancellationException getChildJobCancellationCause() {
        Throwable rootCause;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof C12618c) {
            rootCause = ((C12618c) state$kotlinx_coroutines_core).getRootCause();
        } else if (state$kotlinx_coroutines_core instanceof ni2) {
            rootCause = ((ni2) state$kotlinx_coroutines_core).f64635a;
        } else {
            if (state$kotlinx_coroutines_core instanceof iz7) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + state$kotlinx_coroutines_core).toString());
            }
            rootCause = null;
        }
        CancellationException cancellationException = rootCause instanceof CancellationException ? (CancellationException) rootCause : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new kj8("Parent job is " + stateString(state$kotlinx_coroutines_core), rootCause, this);
    }

    @Override // p000.jj8
    @yfb
    public final vye<jj8> getChildren() {
        return bze.sequence(new C12621f(null));
    }

    @gib
    public final Object getCompletedInternal$kotlinx_coroutines_core() throws Throwable {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof iz7) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (state$kotlinx_coroutines_core instanceof ni2) {
            throw ((ni2) state$kotlinx_coroutines_core).f64635a;
        }
        return tj8.unboxState(state$kotlinx_coroutines_core);
    }

    @gib
    public final Throwable getCompletionExceptionOrNull() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof iz7) {
            throw new IllegalStateException("This job has not completed yet");
        }
        return getExceptionOrNull(state$kotlinx_coroutines_core);
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
        return true;
    }

    @Override // p000.e13.InterfaceC5040b
    @yfb
    public final e13.InterfaceC5041c<?> getKey() {
        return jj8.f50715A;
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return false;
    }

    @Override // p000.jj8
    @yfb
    public final hve getOnJoin() {
        C12624i c12624i = C12624i.f82003a;
        md8.checkNotNull(c12624i, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new ive(this, (kz6) qlh.beforeCheckcastToFunctionOfArity(c12624i, 3), null, 4, null);
    }

    @Override // p000.jj8
    @gib
    public jj8 getParent() {
        wy1 parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            return parentHandle$kotlinx_coroutines_core.getParent();
        }
        return null;
    }

    @gib
    public final wy1 getParentHandle$kotlinx_coroutines_core() {
        return (wy1) f81982b.get(this);
    }

    @gib
    public final Object getState$kotlinx_coroutines_core() {
        return f81981a.get(this);
    }

    /* JADX INFO: renamed from: h */
    public boolean mo22032h(@yfb Throwable th) {
        return false;
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(@yfb Throwable th) throws Throwable {
        throw th;
    }

    /* JADX INFO: renamed from: i */
    public final void m22033i(@gib jj8 jj8Var) {
        if (jj8Var == null) {
            setParentHandle$kotlinx_coroutines_core(xeb.f97598a);
            return;
        }
        jj8Var.start();
        wy1 wy1VarAttachChild = jj8Var.attachChild(this);
        setParentHandle$kotlinx_coroutines_core(wy1VarAttachChild);
        if (isCompleted()) {
            wy1VarAttachChild.dispose();
            setParentHandle$kotlinx_coroutines_core(xeb.f97598a);
        }
    }

    @Override // p000.jj8
    @yfb
    public final yf4 invokeOnCompletion(@yfb qy6<? super Throwable, bth> qy6Var) {
        return invokeOnCompletionInternal$kotlinx_coroutines_core(true, new ye8(qy6Var));
    }

    @yfb
    public final yf4 invokeOnCompletionInternal$kotlinx_coroutines_core(boolean z, @yfb rj8 rj8Var) {
        boolean z2;
        boolean zAddLast;
        rj8Var.setJob(this);
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            z2 = true;
            if (!(state$kotlinx_coroutines_core instanceof rz4)) {
                if (!(state$kotlinx_coroutines_core instanceof iz7)) {
                    z2 = false;
                    break;
                }
                iz7 iz7Var = (iz7) state$kotlinx_coroutines_core;
                meb list = iz7Var.getList();
                if (list == null) {
                    md8.checkNotNull(state$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    promoteSingleToNodeList((rj8) state$kotlinx_coroutines_core);
                } else {
                    if (rj8Var.getOnCancelling()) {
                        C12618c c12618c = iz7Var instanceof C12618c ? (C12618c) iz7Var : null;
                        Throwable rootCause = c12618c != null ? c12618c.getRootCause() : null;
                        if (rootCause != null) {
                            if (z) {
                                rj8Var.invoke(rootCause);
                            }
                            return xeb.f97598a;
                        }
                        zAddLast = list.addLast(rj8Var, 5);
                    } else {
                        zAddLast = list.addLast(rj8Var, 1);
                    }
                    if (zAddLast) {
                        break;
                    }
                }
            } else {
                rz4 rz4Var = (rz4) state$kotlinx_coroutines_core;
                if (!rz4Var.isActive()) {
                    promoteEmptyToNodeList(rz4Var);
                } else if (C0051a4.m134a(f81981a, this, state$kotlinx_coroutines_core, rj8Var)) {
                    break;
                }
            }
        }
        if (z2) {
            return rj8Var;
        }
        if (z) {
            Object state$kotlinx_coroutines_core2 = getState$kotlinx_coroutines_core();
            ni2 ni2Var = state$kotlinx_coroutines_core2 instanceof ni2 ? (ni2) state$kotlinx_coroutines_core2 : null;
            rj8Var.invoke(ni2Var != null ? ni2Var.f64635a : null);
        }
        return xeb.f97598a;
    }

    @Override // p000.jj8
    public boolean isActive() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof iz7) && ((iz7) state$kotlinx_coroutines_core).isActive();
    }

    @Override // p000.jj8
    public final boolean isCancelled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof ni2) || ((state$kotlinx_coroutines_core instanceof C12618c) && ((C12618c) state$kotlinx_coroutines_core).isCancelling());
    }

    @Override // p000.jj8
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof iz7);
    }

    public final boolean isCompletedExceptionally() {
        return getState$kotlinx_coroutines_core() instanceof ni2;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo3832j() {
        return false;
    }

    @Override // p000.jj8
    @gib
    public final Object join(@yfb zy2<? super bth> zy2Var) {
        if (joinInternal()) {
            Object objJoinSuspend = joinSuspend(zy2Var);
            return objJoinSuspend == pd8.getCOROUTINE_SUSPENDED() ? objJoinSuspend : bth.f14751a;
        }
        oj8.ensureActive(zy2Var.getContext());
        return bth.f14751a;
    }

    /* JADX INFO: renamed from: k */
    public void mo22034k(@gib Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public void mo22035l(@gib Object obj) {
    }

    /* JADX INFO: renamed from: m */
    public void mo2873m() {
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(@gib Object obj) throws Throwable {
        Object objTryMakeCompleting;
        do {
            objTryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), obj);
            if (objTryMakeCompleting == tj8.f85049a) {
                return false;
            }
            if (objTryMakeCompleting == tj8.f85050b) {
                return true;
            }
        } while (objTryMakeCompleting == tj8.f85051c);
        mo3831a(objTryMakeCompleting);
        return true;
    }

    @gib
    public final Object makeCompletingOnce$kotlinx_coroutines_core(@gib Object obj) throws Throwable {
        Object objTryMakeCompleting;
        do {
            objTryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), obj);
            if (objTryMakeCompleting == tj8.f85049a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, getExceptionOrNull(obj));
            }
        } while (objTryMakeCompleting == tj8.f85051c);
        return objTryMakeCompleting;
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @yfb
    public e13 minusKey(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        return jj8.C7916a.minusKey(this, interfaceC5041c);
    }

    @yfb
    /* JADX INFO: renamed from: n */
    public final CancellationException m22036n(@yfb Throwable th, @gib String str) {
        CancellationException kj8Var = th instanceof CancellationException ? (CancellationException) th : null;
        if (kj8Var == null) {
            if (str == null) {
                str = mo22028c();
            }
            kj8Var = new kj8(str, th, this);
        }
        return kj8Var;
    }

    @yfb
    public String nameString$kotlinx_coroutines_core() {
        return kk3.getClassSimpleName(this);
    }

    @Override // p000.yy1
    public final void parentCancelled(@yfb dhc dhcVar) throws Throwable {
        cancelImpl$kotlinx_coroutines_core(dhcVar);
    }

    @Override // p000.e13
    @yfb
    public e13 plus(@yfb e13 e13Var) {
        return jj8.C7916a.plus(this, e13Var);
    }

    public final void removeNode$kotlinx_coroutines_core(@yfb rj8 rj8Var) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof rj8)) {
                if (!(state$kotlinx_coroutines_core instanceof iz7) || ((iz7) state$kotlinx_coroutines_core).getList() == null) {
                    return;
                }
                rj8Var.mo30525remove();
                return;
            }
            if (state$kotlinx_coroutines_core != rj8Var) {
                return;
            }
        } while (!C0051a4.m134a(f81981a, this, state$kotlinx_coroutines_core, tj8.f85058j));
    }

    public final void setParentHandle$kotlinx_coroutines_core(@gib wy1 wy1Var) {
        f81982b.set(this, wy1Var);
    }

    @Override // p000.jj8
    public final boolean start() {
        int iStartInternal;
        do {
            iStartInternal = startInternal(getState$kotlinx_coroutines_core());
            if (iStartInternal == 0) {
                return false;
            }
        } while (iStartInternal != 1);
        return true;
    }

    @la8
    @yfb
    public final String toDebugString() {
        return nameString$kotlinx_coroutines_core() + '{' + stateString(getState$kotlinx_coroutines_core()) + '}';
    }

    @yfb
    public String toString() {
        return toDebugString() + '@' + kk3.getHexAddress(this);
    }

    @Override // p000.jj8
    @q64(level = u64.f86867c, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(Throwable th) throws Throwable {
        Throwable kj8Var;
        if (th == null || (kj8Var = toCancellationException$default(this, th, null, 1, null)) == null) {
            kj8Var = new kj8(mo22028c(), null, this);
        }
        cancelInternal(kj8Var);
        return true;
    }

    @Override // p000.jj8
    @yfb
    @q64(level = u64.f86866b, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public jj8 plus(@yfb jj8 jj8Var) {
        return jj8.C7916a.plus((jj8) this, jj8Var);
    }

    @Override // p000.jj8
    @yfb
    public final yf4 invokeOnCompletion(boolean z, boolean z2, @yfb qy6<? super Throwable, bth> qy6Var) {
        rj8 ye8Var;
        if (z) {
            ye8Var = new xe8(qy6Var);
        } else {
            ye8Var = new ye8(qy6Var);
        }
        return invokeOnCompletionInternal$kotlinx_coroutines_core(z2, ye8Var);
    }

    @Override // p000.jj8
    public void cancel(@gib CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new kj8(mo22028c(), null, this);
        }
        cancelInternal(cancellationException);
    }
}
