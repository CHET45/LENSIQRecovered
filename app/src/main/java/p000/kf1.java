package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000.a77;
import p000.au1;
import p000.mu1;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3116:1\n270#1,6:3119\n277#1,68:3126\n394#1,18:3217\n241#1:3235\n266#1,10:3236\n277#1,48:3247\n415#1:3295\n331#1,14:3296\n419#1,3:3311\n241#1:3324\n266#1,10:3325\n277#1,68:3336\n241#1:3414\n266#1,10:3415\n277#1,68:3426\n241#1:3498\n266#1,10:3499\n277#1,68:3510\n241#1:3579\n266#1,10:3580\n277#1,68:3591\n906#1,52:3661\n984#1,8:3717\n878#1:3725\n902#1,33:3726\n994#1:3759\n936#1,14:3760\n955#1,3:3775\n999#1,6:3778\n906#1,52:3792\n984#1,8:3848\n878#1:3856\n902#1,33:3857\n994#1:3890\n936#1,14:3891\n955#1,3:3906\n999#1,6:3909\n878#1:3924\n902#1,48:3925\n955#1,3:3974\n878#1:3977\n902#1,48:3978\n955#1,3:4027\n241#1:4039\n266#1,10:4040\n277#1,68:4051\n878#1:4120\n902#1,48:4121\n955#1,3:4170\n1#2:3117\n3099#3:3118\n3099#3:3125\n3099#3:3246\n3099#3:3335\n3099#3:3425\n3099#3:3497\n3099#3:3509\n3099#3:3590\n3099#3:3660\n3099#3:3923\n3099#3:4030\n3099#3:4031\n3113#3:4032\n3113#3:4033\n3112#3:4034\n3112#3:4035\n3112#3:4036\n3113#3:4037\n3112#3:4038\n3099#3:4050\n3100#3:4173\n3099#3:4174\n3099#3:4175\n3099#3:4176\n3100#3:4177\n3099#3:4178\n3100#3:4201\n3099#3:4202\n3099#3:4203\n3100#3:4204\n3099#3:4254\n3100#3:4255\n3100#3:4256\n3100#3:4274\n3100#3:4275\n351#4,9:3194\n360#4,2:3211\n369#4,4:3213\n373#4,8:3314\n351#4,9:3405\n360#4,2:3495\n369#4,4:3713\n373#4,8:3784\n369#4,4:3844\n373#4,8:3915\n206#5:3203\n207#5:3206\n206#5:3207\n207#5:3210\n57#6,2:3204\n57#6,2:3208\n57#6,2:3322\n266#7:3310\n266#7:3404\n266#7:3494\n266#7:3578\n266#7:3659\n266#7:4119\n902#8:3774\n902#8:3905\n902#8:3973\n902#8:4026\n902#8:4169\n33#9,11:4179\n33#9,11:4190\n68#10,3:4205\n42#10,8:4208\n68#10,3:4216\n42#10,8:4219\n42#10,8:4227\n68#10,3:4235\n42#10,8:4238\n42#10,8:4246\n774#11:4257\n865#11,2:4258\n2318#11,14:4260\n774#11:4276\n865#11,2:4277\n2318#11,14:4279\n774#11:4293\n865#11,2:4294\n2318#11,14:4296\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n110#1:3119,6\n110#1:3126,68\n151#1:3217,18\n151#1:3235\n151#1:3236,10\n151#1:3247,48\n151#1:3295\n151#1:3296,14\n151#1:3311,3\n191#1:3324\n191#1:3325,10\n191#1:3336,68\n222#1:3414\n222#1:3415,10\n222#1:3426,68\n353#1:3498\n353#1:3499,10\n353#1:3510,68\n411#1:3579\n411#1:3580,10\n411#1:3591,68\n687#1:3661,52\n716#1:3717,8\n716#1:3725\n716#1:3726,33\n716#1:3759\n716#1:3760,14\n716#1:3775,3\n716#1:3778,6\n752#1:3792,52\n768#1:3848,8\n768#1:3856\n768#1:3857,33\n768#1:3890\n768#1:3891,14\n768#1:3906,3\n768#1:3909,6\n801#1:3924\n801#1:3925,48\n801#1:3974,3\n991#1:3977\n991#1:3978,48\n991#1:4027,3\n1484#1:4039\n1484#1:4040,10\n1484#1:4051,68\n1532#1:4120\n1532#1:4121,48\n1532#1:4170,3\n67#1:3118\n110#1:3125\n151#1:3246\n191#1:3335\n222#1:3425\n275#1:3497\n353#1:3509\n411#1:3590\n626#1:3660\n791#1:3923\n1027#1:4030\n1076#1:4031\n1394#1:4032\n1396#1:4033\n1426#1:4034\n1436#1:4035\n1445#1:4036\n1446#1:4037\n1453#1:4038\n1484#1:4050\n1898#1:4173\n1900#1:4174\n1902#1:4175\n1915#1:4176\n1926#1:4177\n1927#1:4178\n2229#1:4201\n2242#1:4202\n2252#1:4203\n2255#1:4204\n2572#1:4254\n2574#1:4255\n2599#1:4256\n2661#1:4274\n2662#1:4275\n131#1:3194,9\n131#1:3211,2\n150#1:3213,4\n150#1:3314,8\n218#1:3405,9\n218#1:3495,2\n715#1:3713,4\n715#1:3784,8\n766#1:3844,4\n766#1:3915,8\n135#1:3203\n135#1:3206\n138#1:3207\n138#1:3210\n135#1:3204,2\n138#1:3208,2\n180#1:3322,2\n151#1:3310\n191#1:3404\n222#1:3494\n353#1:3578\n411#1:3659\n1484#1:4119\n716#1:3774\n768#1:3905\n801#1:3973\n991#1:4026\n1532#1:4169\n2131#1:4179,11\n2186#1:4190,11\n2394#1:4205,3\n2394#1:4208,8\n2449#1:4216,3\n2449#1:4219,8\n2468#1:4227,8\n2498#1:4235,3\n2498#1:4238,8\n2559#1:4246,8\n2608#1:4257\n2608#1:4258,2\n2609#1:4260,14\n2673#1:4276\n2673#1:4277,2\n2674#1:4279,14\n2714#1:4293\n2714#1:4294,2\n2715#1:4296,14\n*E\n"})
public class kf1<E> implements au1<E> {
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a */
    public final int f53833a;

    /* JADX INFO: renamed from: b */
    @gib
    @un8
    public final qy6<E, bth> f53834b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c */
    @gib
    public final kz6<pve<?>, Object, Object, kz6<Throwable, Object, e13, bth>> f53835c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f53829d = AtomicLongFieldUpdater.newUpdater(kf1.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f53830e = AtomicLongFieldUpdater.newUpdater(kf1.class, "receivers$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f53831f = AtomicLongFieldUpdater.newUpdater(kf1.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicLongFieldUpdater f53832m = AtomicLongFieldUpdater.newUpdater(kf1.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f53824C = AtomicReferenceFieldUpdater.newUpdater(kf1.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f53825F = AtomicReferenceFieldUpdater.newUpdater(kf1.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f53826H = AtomicReferenceFieldUpdater.newUpdater(kf1.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f53827L = AtomicReferenceFieldUpdater.newUpdater(kf1.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f53828M = AtomicReferenceFieldUpdater.newUpdater(kf1.class, Object.class, "closeHandler$volatile");

    /* JADX INFO: renamed from: kf1$a */
    @dwf({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n+ 2 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3116:1\n906#2,52:3117\n984#2,8:3173\n878#2:3181\n902#2,33:3182\n994#2:3215\n936#2,14:3216\n955#2,3:3231\n999#2,6:3234\n369#3,4:3169\n373#3,8:3240\n902#4:3230\n57#5,2:3248\n57#5,2:3251\n1#6:3250\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n*L\n1619#1:3117,52\n1657#1:3173,8\n1657#1:3181\n1657#1:3182,33\n1657#1:3215\n1657#1:3216,14\n1657#1:3231,3\n1657#1:3234,6\n1655#1:3169,4\n1655#1:3240,8\n1657#1:3230\n1693#1:3248,2\n1741#1:3251,2\n*E\n"})
    public final class C8324a implements mu1<E>, wgi {

        /* JADX INFO: renamed from: a */
        @gib
        public Object f53836a = lf1.f57453x;

        /* JADX INFO: renamed from: b */
        @gib
        public fq1<? super Boolean> f53837b;

        public C8324a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object hasNextOnNoWaiterSuspend(yu1<E> yu1Var, int i, long j, zy2<? super Boolean> zy2Var) {
            Boolean boolBoxBoolean;
            kf1<E> kf1Var = kf1.this;
            fq1 orCreateCancellableContinuation = hq1.getOrCreateCancellableContinuation(od8.intercepted(zy2Var));
            try {
                this.f53837b = orCreateCancellableContinuation;
                Object objUpdateCellReceive = kf1Var.updateCellReceive(yu1Var, i, j, this);
                if (objUpdateCellReceive == lf1.f57444o) {
                    kf1Var.prepareReceiverForSuspension(this, yu1Var, i);
                } else {
                    kz6 kz6VarBindCancellationFun = null;
                    if (objUpdateCellReceive == lf1.f57446q) {
                        if (j < kf1Var.getSendersCounter$kotlinx_coroutines_core()) {
                            yu1Var.cleanPrev();
                        }
                        yu1 yu1Var2 = (yu1) kf1.getReceiveSegment$volatile$FU().get(kf1Var);
                        while (true) {
                            if (kf1Var.isClosedForReceive()) {
                                onClosedHasNextNoWaiterSuspend();
                                break;
                            }
                            long andIncrement = kf1.getReceivers$volatile$FU().getAndIncrement(kf1Var);
                            int i2 = lf1.f57431b;
                            long j2 = andIncrement / ((long) i2);
                            int i3 = (int) (andIncrement % ((long) i2));
                            if (yu1Var2.f82931c != j2) {
                                yu1 yu1VarFindSegmentReceive = kf1Var.findSegmentReceive(j2, yu1Var2);
                                if (yu1VarFindSegmentReceive != null) {
                                    yu1Var2 = yu1VarFindSegmentReceive;
                                }
                            }
                            Object objUpdateCellReceive2 = kf1Var.updateCellReceive(yu1Var2, i3, andIncrement, this);
                            if (objUpdateCellReceive2 == lf1.f57444o) {
                                kf1Var.prepareReceiverForSuspension(this, yu1Var2, i3);
                                break;
                            }
                            if (objUpdateCellReceive2 == lf1.f57446q) {
                                if (andIncrement < kf1Var.getSendersCounter$kotlinx_coroutines_core()) {
                                    yu1Var2.cleanPrev();
                                }
                            } else {
                                if (objUpdateCellReceive2 == lf1.f57445p) {
                                    throw new IllegalStateException("unexpected");
                                }
                                yu1Var2.cleanPrev();
                                this.f53836a = objUpdateCellReceive2;
                                this.f53837b = null;
                                boolBoxBoolean = wc1.boxBoolean(true);
                                qy6<E, bth> qy6Var = kf1Var.f53834b;
                                if (qy6Var != null) {
                                    kz6VarBindCancellationFun = kf1Var.bindCancellationFun(qy6Var, objUpdateCellReceive2);
                                }
                            }
                        }
                    } else {
                        yu1Var.cleanPrev();
                        this.f53836a = objUpdateCellReceive;
                        this.f53837b = null;
                        boolBoxBoolean = wc1.boxBoolean(true);
                        qy6<E, bth> qy6Var2 = kf1Var.f53834b;
                        if (qy6Var2 != null) {
                            kz6VarBindCancellationFun = kf1Var.bindCancellationFun(qy6Var2, objUpdateCellReceive);
                        }
                    }
                    orCreateCancellableContinuation.resume(boolBoxBoolean, (kz6<? super Throwable, ? super Boolean, ? super e13, bth>) kz6VarBindCancellationFun);
                }
                Object result = orCreateCancellableContinuation.getResult();
                if (result == pd8.getCOROUTINE_SUSPENDED()) {
                    jk3.probeCoroutineSuspended(zy2Var);
                }
                return result;
            } catch (Throwable th) {
                orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                throw th;
            }
        }

        private final boolean onClosedHasNext() throws Throwable {
            this.f53836a = lf1.getCHANNEL_CLOSED();
            Throwable thM14698f = kf1.this.m14698f();
            if (thM14698f == null) {
                return false;
            }
            throw l0g.recoverStackTrace(thM14698f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onClosedHasNextNoWaiterSuspend() {
            fq1<? super Boolean> fq1Var = this.f53837b;
            md8.checkNotNull(fq1Var);
            this.f53837b = null;
            this.f53836a = lf1.getCHANNEL_CLOSED();
            Throwable thM14698f = kf1.this.m14698f();
            if (thM14698f == null) {
                v7e.C13927a c13927a = v7e.f90266b;
                fq1Var.resumeWith(v7e.m32723constructorimpl(Boolean.FALSE));
            } else {
                v7e.C13927a c13927a2 = v7e.f90266b;
                fq1Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(thM14698f)));
            }
        }

        @Override // p000.mu1
        @gib
        public Object hasNext(@yfb zy2<? super Boolean> zy2Var) throws Throwable {
            boolean zOnClosedHasNext = true;
            if (this.f53836a == lf1.f57453x || this.f53836a == lf1.getCHANNEL_CLOSED()) {
                kf1<E> kf1Var = kf1.this;
                yu1<E> yu1Var = (yu1) kf1.getReceiveSegment$volatile$FU().get(kf1Var);
                while (true) {
                    if (kf1Var.isClosedForReceive()) {
                        zOnClosedHasNext = onClosedHasNext();
                        break;
                    }
                    long andIncrement = kf1.getReceivers$volatile$FU().getAndIncrement(kf1Var);
                    int i = lf1.f57431b;
                    long j = andIncrement / ((long) i);
                    int i2 = (int) (andIncrement % ((long) i));
                    if (yu1Var.f82931c != j) {
                        yu1<E> yu1VarFindSegmentReceive = kf1Var.findSegmentReceive(j, yu1Var);
                        if (yu1VarFindSegmentReceive == null) {
                            continue;
                        } else {
                            yu1Var = yu1VarFindSegmentReceive;
                        }
                    }
                    Object objUpdateCellReceive = kf1Var.updateCellReceive(yu1Var, i2, andIncrement, null);
                    if (objUpdateCellReceive == lf1.f57444o) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objUpdateCellReceive == lf1.f57446q) {
                        if (andIncrement < kf1Var.getSendersCounter$kotlinx_coroutines_core()) {
                            yu1Var.cleanPrev();
                        }
                    } else {
                        if (objUpdateCellReceive == lf1.f57445p) {
                            return hasNextOnNoWaiterSuspend(yu1Var, i2, andIncrement, zy2Var);
                        }
                        yu1Var.cleanPrev();
                        this.f53836a = objUpdateCellReceive;
                    }
                }
            }
            return wc1.boxBoolean(zOnClosedHasNext);
        }

        @Override // p000.wgi
        public void invokeOnCancellation(@yfb sue<?> sueVar, int i) {
            fq1<? super Boolean> fq1Var = this.f53837b;
            if (fq1Var != null) {
                fq1Var.invokeOnCancellation(sueVar, i);
            }
        }

        @Override // p000.mu1
        @xn8(name = jk5.f50996b)
        @q64(level = u64.f86867c, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ Object next(zy2 zy2Var) {
            return mu1.C9524a.next(this, zy2Var);
        }

        public final boolean tryResumeHasNext(E e) {
            fq1<? super Boolean> fq1Var = this.f53837b;
            md8.checkNotNull(fq1Var);
            this.f53837b = null;
            this.f53836a = e;
            Boolean bool = Boolean.TRUE;
            kf1<E> kf1Var = kf1.this;
            qy6<E, bth> qy6Var = kf1Var.f53834b;
            return lf1.tryResume0(fq1Var, bool, qy6Var != null ? kf1Var.bindCancellationFun(qy6Var, e) : null);
        }

        public final void tryResumeHasNextOnClosedChannel() {
            fq1<? super Boolean> fq1Var = this.f53837b;
            md8.checkNotNull(fq1Var);
            this.f53837b = null;
            this.f53836a = lf1.getCHANNEL_CLOSED();
            Throwable thM14698f = kf1.this.m14698f();
            if (thM14698f == null) {
                v7e.C13927a c13927a = v7e.f90266b;
                fq1Var.resumeWith(v7e.m32723constructorimpl(Boolean.FALSE));
            } else {
                v7e.C13927a c13927a2 = v7e.f90266b;
                fq1Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(thM14698f)));
            }
        }

        @Override // p000.mu1
        public E next() throws Throwable {
            E e = (E) this.f53836a;
            if (e == lf1.f57453x) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f53836a = lf1.f57453x;
            if (e != lf1.getCHANNEL_CLOSED()) {
                return e;
            }
            throw l0g.recoverStackTrace(kf1.this.getReceiveException());
        }
    }

    /* JADX INFO: renamed from: kf1$b */
    public static final class C8325b implements wgi {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fq1<Boolean> f53839a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final dq1<Boolean> f53840b;

        /* JADX WARN: Multi-variable type inference failed */
        public C8325b(@yfb dq1<? super Boolean> dq1Var) {
            md8.checkNotNull(dq1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.f53839a = (fq1) dq1Var;
            this.f53840b = dq1Var;
        }

        @yfb
        public final dq1<Boolean> getCont() {
            return this.f53840b;
        }

        @Override // p000.wgi
        public void invokeOnCancellation(@yfb sue<?> sueVar, int i) {
            this.f53839a.invokeOnCancellation(sueVar, i);
        }
    }

    /* JADX INFO: renamed from: kf1$c */
    public /* synthetic */ class C8326c extends n07 implements kz6<Throwable, E, e13, bth> {
        public C8326c(Object obj) {
            super(3, obj, kf1.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th, Object obj, e13 e13Var) throws IllegalAccessException, InvocationTargetException {
            invoke2(th, obj, e13Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th, E e, e13 e13Var) throws IllegalAccessException, InvocationTargetException {
            ((kf1) this.receiver).onCancellationImplDoNotCall(th, e, e13Var);
        }
    }

    /* JADX INFO: renamed from: kf1$d */
    public /* synthetic */ class C8327d extends n07 implements kz6<Throwable, xu1<? extends E>, e13, bth> {
        public C8327d(Object obj) {
            super(3, obj, kf1.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th, Object obj, e13 e13Var) throws IllegalAccessException, InvocationTargetException {
            m30699invoke5_sEAP8(th, ((xu1) obj).m33284unboximpl(), e13Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-5_sEAP8, reason: not valid java name */
        public final void m30699invoke5_sEAP8(Throwable th, Object obj, e13 e13Var) throws IllegalAccessException, InvocationTargetException {
            ((kf1) this.receiver).m30697onCancellationChannelResultImplDoNotCall5_sEAP8(th, obj, e13Var);
        }
    }

    /* JADX INFO: renamed from: kf1$e */
    public /* synthetic */ class C8328e extends n07 implements kz6<kf1<?>, pve<?>, Object, bth> {

        /* JADX INFO: renamed from: a */
        public static final C8328e f53841a = new C8328e();

        public C8328e() {
            super(3, kf1.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(kf1<?> kf1Var, pve<?> pveVar, Object obj) {
            invoke2(kf1Var, pveVar, obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(kf1<?> kf1Var, pve<?> pveVar, Object obj) {
            kf1Var.registerSelectForReceive(pveVar, obj);
        }
    }

    /* JADX INFO: renamed from: kf1$f */
    public /* synthetic */ class C8329f extends n07 implements kz6<kf1<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a */
        public static final C8329f f53842a = new C8329f();

        public C8329f() {
            super(3, kf1.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // p000.kz6
        public final Object invoke(kf1<?> kf1Var, Object obj, Object obj2) {
            return kf1Var.processResultSelectReceive(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: kf1$g */
    public /* synthetic */ class C8330g extends n07 implements kz6<kf1<?>, pve<?>, Object, bth> {

        /* JADX INFO: renamed from: a */
        public static final C8330g f53843a = new C8330g();

        public C8330g() {
            super(3, kf1.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(kf1<?> kf1Var, pve<?> pveVar, Object obj) {
            invoke2(kf1Var, pveVar, obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(kf1<?> kf1Var, pve<?> pveVar, Object obj) {
            kf1Var.registerSelectForReceive(pveVar, obj);
        }
    }

    /* JADX INFO: renamed from: kf1$h */
    public /* synthetic */ class C8331h extends n07 implements kz6<kf1<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a */
        public static final C8331h f53844a = new C8331h();

        public C8331h() {
            super(3, kf1.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // p000.kz6
        public final Object invoke(kf1<?> kf1Var, Object obj, Object obj2) {
            return kf1Var.processResultSelectReceiveCatching(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: kf1$i */
    public /* synthetic */ class C8332i extends n07 implements kz6<kf1<?>, pve<?>, Object, bth> {

        /* JADX INFO: renamed from: a */
        public static final C8332i f53845a = new C8332i();

        public C8332i() {
            super(3, kf1.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(kf1<?> kf1Var, pve<?> pveVar, Object obj) {
            invoke2(kf1Var, pveVar, obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(kf1<?> kf1Var, pve<?> pveVar, Object obj) {
            kf1Var.registerSelectForReceive(pveVar, obj);
        }
    }

    /* JADX INFO: renamed from: kf1$j */
    public /* synthetic */ class C8333j extends n07 implements kz6<kf1<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a */
        public static final C8333j f53846a = new C8333j();

        public C8333j() {
            super(3, kf1.class, "processResultSelectReceiveOrNull", "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // p000.kz6
        public final Object invoke(kf1<?> kf1Var, Object obj, Object obj2) {
            return kf1Var.processResultSelectReceiveOrNull(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: kf1$k */
    public /* synthetic */ class C8334k extends n07 implements kz6<kf1<?>, pve<?>, Object, bth> {

        /* JADX INFO: renamed from: a */
        public static final C8334k f53847a = new C8334k();

        public C8334k() {
            super(3, kf1.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(kf1<?> kf1Var, pve<?> pveVar, Object obj) throws IllegalAccessException, InvocationTargetException {
            invoke2(kf1Var, pveVar, obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(kf1<?> kf1Var, pve<?> pveVar, Object obj) throws IllegalAccessException, InvocationTargetException {
            kf1Var.mo14704p(pveVar, obj);
        }
    }

    /* JADX INFO: renamed from: kf1$l */
    public /* synthetic */ class C8335l extends n07 implements kz6<kf1<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a */
        public static final C8335l f53848a = new C8335l();

        public C8335l() {
            super(3, kf1.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // p000.kz6
        public final Object invoke(kf1<?> kf1Var, Object obj, Object obj2) {
            return kf1Var.processResultSelectSend(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: kf1$m */
    @ck3(m4009c = "kotlinx.coroutines.channels.BufferedChannel", m4010f = "BufferedChannel.kt", m4011i = {}, m4012l = {759}, m4013m = "receiveCatching-JP2dKIU$suspendImpl", m4014n = {}, m4015s = {})
    public static final class C8336m<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f53849a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kf1<E> f53850b;

        /* JADX INFO: renamed from: c */
        public int f53851c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8336m(kf1<E> kf1Var, zy2<? super C8336m> zy2Var) {
            super(zy2Var);
            this.f53850b = kf1Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f53849a = obj;
            this.f53851c |= Integer.MIN_VALUE;
            Object objM14689n = kf1.m14689n(this.f53850b, this);
            return objM14689n == pd8.getCOROUTINE_SUSPENDED() ? objM14689n : xu1.m33272boximpl(objM14689n);
        }
    }

    /* JADX INFO: renamed from: kf1$n */
    @ck3(m4009c = "kotlinx.coroutines.channels.BufferedChannel", m4010f = "BufferedChannel.kt", m4011i = {0, 0, 0, 0}, m4012l = {3117}, m4013m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", m4014n = {"this", "segment", "index", "r"}, m4015s = {"L$0", "L$1", "I$0", "J$0"})
    public static final class C8337n extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f53852a;

        /* JADX INFO: renamed from: b */
        public Object f53853b;

        /* JADX INFO: renamed from: c */
        public int f53854c;

        /* JADX INFO: renamed from: d */
        public long f53855d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f53856e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ kf1<E> f53857f;

        /* JADX INFO: renamed from: m */
        public int f53858m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8337n(kf1<E> kf1Var, zy2<? super C8337n> zy2Var) {
            super(zy2Var);
            this.f53857f = kf1Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f53856e = obj;
            this.f53858m |= Integer.MIN_VALUE;
            Object objM30698receiveCatchingOnNoWaiterSuspendGKJJFZk = this.f53857f.m30698receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
            return objM30698receiveCatchingOnNoWaiterSuspendGKJJFZk == pd8.getCOROUTINE_SUSPENDED() ? objM30698receiveCatchingOnNoWaiterSuspendGKJJFZk : xu1.m33272boximpl(objM30698receiveCatchingOnNoWaiterSuspendGKJJFZk);
        }
    }

    /* JADX INFO: renamed from: kf1$o */
    public static final class C8338o implements kz6 {

        /* JADX INFO: renamed from: a */
        public static final C8338o f53859a = new C8338o();

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((yu1) obj, ((Number) obj2).intValue(), ((Number) obj3).longValue());
        }

        public final Void invoke(yu1<E> yu1Var, int i, long j) {
            throw new IllegalStateException("unexpected");
        }
    }

    /* JADX INFO: renamed from: kf1$p */
    public static final class C8339p implements oz6 {

        /* JADX INFO: renamed from: a */
        public static final C8339p f53860a = new C8339p();

        @Override // p000.oz6
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((yu1<Object>) obj, ((Number) obj2).intValue(), obj3, ((Number) obj4).longValue());
        }

        public final Void invoke(yu1<E> yu1Var, int i, E e, long j) {
            throw new IllegalStateException("unexpected");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kf1(int i, @gib qy6<? super E, bth> qy6Var) {
        this.f53833a = i;
        this.f53834b = qy6Var;
        if (i < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = lf1.initialBufferEnd(i);
        this.completedExpandBuffersAndPauseFlag$volatile = getBufferEndCounter();
        yu1 yu1Var = new yu1(0L, null, this, 3);
        this.sendSegment$volatile = yu1Var;
        this.receiveSegment$volatile = yu1Var;
        if (isRendezvousOrUnlimited()) {
            yu1Var = lf1.f57430a;
            md8.checkNotNull(yu1Var, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = yu1Var;
        this.f53835c = qy6Var != 0 ? new kz6() { // from class: if1
            @Override // p000.kz6
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return kf1.m14691xa189d599(this.f46724a, (pve) obj, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = lf1.f57421A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kz6<Throwable, Object, e13, bth> bindCancellationFun(final qy6<? super E, bth> qy6Var, final E e) {
        return new kz6() { // from class: jf1
            @Override // p000.kz6
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return kf1.bindCancellationFun$lambda$89(qy6Var, e, (Throwable) obj, obj2, (e13) obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth bindCancellationFun$lambda$89(qy6 qy6Var, Object obj, Throwable th, Object obj2, e13 e13Var) throws IllegalAccessException, InvocationTargetException {
        z4c.callUndeliveredElement(qy6Var, obj, e13Var);
        return bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final to8<bth> bindCancellationFunResult(qy6<? super E, bth> qy6Var) {
        return new C8327d(this);
    }

    private final boolean bufferOrRendezvousSend(long j) {
        return j < getBufferEndCounter() || j < getReceiversCounter$kotlinx_coroutines_core() + ((long) this.f53833a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void cancelSuspendedReceiveRequests(yu1<E> yu1Var, long j) {
        Object objM31108constructorimpl$default = n28.m31108constructorimpl$default(null, 1, null);
        loop0: while (yu1Var != null) {
            for (int i = lf1.f57431b - 1; -1 < i; i--) {
                if ((yu1Var.f82931c * ((long) lf1.f57431b)) + ((long) i) < j) {
                    break loop0;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = yu1Var.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != lf1.f57436g) {
                        if (!(state$kotlinx_coroutines_core instanceof xgi)) {
                            if (!(state$kotlinx_coroutines_core instanceof wgi)) {
                                break;
                            }
                            if (yu1Var.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, lf1.getCHANNEL_CLOSED())) {
                                objM31108constructorimpl$default = n28.m31113plusFjFbRPM(objM31108constructorimpl$default, state$kotlinx_coroutines_core);
                                yu1Var.onCancelledRequest(i, true);
                                break;
                            }
                        } else {
                            if (yu1Var.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, lf1.getCHANNEL_CLOSED())) {
                                objM31108constructorimpl$default = n28.m31113plusFjFbRPM(objM31108constructorimpl$default, ((xgi) state$kotlinx_coroutines_core).f97775a);
                                yu1Var.onCancelledRequest(i, true);
                                break;
                            }
                        }
                    } else {
                        if (yu1Var.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, lf1.getCHANNEL_CLOSED())) {
                            yu1Var.onSlotCleaned();
                            break;
                        }
                    }
                }
            }
            yu1Var = (yu1) yu1Var.getPrev();
        }
        if (objM31108constructorimpl$default != null) {
            if (!(objM31108constructorimpl$default instanceof ArrayList)) {
                resumeReceiverOnClosedChannel((wgi) objM31108constructorimpl$default);
                return;
            }
            md8.checkNotNull(objM31108constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objM31108constructorimpl$default;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                resumeReceiverOnClosedChannel((wgi) arrayList.get(size));
            }
        }
    }

    private final yu1<E> closeLinkedList() {
        Object obj = f53826H.get(this);
        yu1 yu1Var = (yu1) f53824C.get(this);
        if (yu1Var.f82931c > ((yu1) obj).f82931c) {
            obj = yu1Var;
        }
        yu1 yu1Var2 = (yu1) f53825F.get(this);
        if (yu1Var2.f82931c > ((yu1) obj).f82931c) {
            obj = yu1Var2;
        }
        return (yu1) op2.close((pp2) obj);
    }

    private final void completeCancel(long j) throws IllegalAccessException, InvocationTargetException {
        removeUnprocessedElements(completeClose(j));
    }

    private final yu1<E> completeClose(long j) {
        yu1<E> yu1VarCloseLinkedList = closeLinkedList();
        if (mo14700i()) {
            long jMarkAllEmptyCellsAsClosed = markAllEmptyCellsAsClosed(yu1VarCloseLinkedList);
            if (jMarkAllEmptyCellsAsClosed != -1) {
                m14697e(jMarkAllEmptyCellsAsClosed);
            }
        }
        cancelSuspendedReceiveRequests(yu1VarCloseLinkedList, j);
        return yu1VarCloseLinkedList;
    }

    private final void completeCloseOrCancel() {
        isClosedForSend();
    }

    private final void expandBuffer() {
        if (isRendezvousOrUnlimited()) {
            return;
        }
        yu1<E> yu1Var = (yu1) f53826H.get(this);
        while (true) {
            long andIncrement = f53831f.getAndIncrement(this);
            int i = lf1.f57431b;
            long j = andIncrement / ((long) i);
            if (getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (yu1Var.f82931c < j && yu1Var.getNext() != 0) {
                    moveSegmentBufferEndToSpecifiedOrLast(j, yu1Var);
                }
                m14687h(this, 0L, 1, null);
                return;
            }
            if (yu1Var.f82931c != j) {
                yu1<E> yu1VarFindSegmentBufferEnd = findSegmentBufferEnd(j, yu1Var, andIncrement);
                if (yu1VarFindSegmentBufferEnd == null) {
                    continue;
                } else {
                    yu1Var = yu1VarFindSegmentBufferEnd;
                }
            }
            if (updateCellExpandBuffer(yu1Var, (int) (andIncrement % ((long) i)), andIncrement)) {
                m14687h(this, 0L, 1, null);
                return;
            }
            m14687h(this, 0L, 1, null);
        }
    }

    private final yu1<E> findSegmentBufferEnd(long j, yu1<E> yu1Var, long j2) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f53826H;
        gz6 gz6Var = (gz6) lf1.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = op2.findSegmentInternal(yu1Var, j, gz6Var);
            if (!ave.m27899isClosedimpl(objFindSegmentInternal)) {
                sue sueVarM27897getSegmentimpl = ave.m27897getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    sue sueVar = (sue) atomicReferenceFieldUpdater.get(this);
                    if (sueVar.f82931c >= sueVarM27897getSegmentimpl.f82931c) {
                        break loop0;
                    }
                    if (!sueVarM27897getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (C0051a4.m134a(atomicReferenceFieldUpdater, this, sueVar, sueVarM27897getSegmentimpl)) {
                        if (sueVar.decPointers$kotlinx_coroutines_core()) {
                            sueVar.remove();
                        }
                    } else if (sueVarM27897getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        sueVarM27897getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (ave.m27899isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            moveSegmentBufferEndToSpecifiedOrLast(j, yu1Var);
            m14687h(this, 0L, 1, null);
            return null;
        }
        yu1<E> yu1Var2 = (yu1) ave.m27897getSegmentimpl(objFindSegmentInternal);
        if (yu1Var2.f82931c <= j) {
            return yu1Var2;
        }
        long j3 = yu1Var2.f82931c;
        int i = lf1.f57431b;
        if (f53831f.compareAndSet(this, j2 + 1, j3 * ((long) i))) {
            incCompletedExpandBufferAttempts((yu1Var2.f82931c * ((long) i)) - j2);
            return null;
        }
        m14687h(this, 0L, 1, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yu1<E> findSegmentReceive(long j, yu1<E> yu1Var) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f53825F;
        gz6 gz6Var = (gz6) lf1.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = op2.findSegmentInternal(yu1Var, j, gz6Var);
            if (!ave.m27899isClosedimpl(objFindSegmentInternal)) {
                sue sueVarM27897getSegmentimpl = ave.m27897getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    sue sueVar = (sue) atomicReferenceFieldUpdater.get(this);
                    if (sueVar.f82931c >= sueVarM27897getSegmentimpl.f82931c) {
                        break loop0;
                    }
                    if (!sueVarM27897getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (C0051a4.m134a(atomicReferenceFieldUpdater, this, sueVar, sueVarM27897getSegmentimpl)) {
                        if (sueVar.decPointers$kotlinx_coroutines_core()) {
                            sueVar.remove();
                        }
                    } else if (sueVarM27897getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        sueVarM27897getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (ave.m27899isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (yu1Var.f82931c * ((long) lf1.f57431b) >= getSendersCounter$kotlinx_coroutines_core()) {
                return null;
            }
            yu1Var.cleanPrev();
            return null;
        }
        yu1<E> yu1Var2 = (yu1) ave.m27897getSegmentimpl(objFindSegmentInternal);
        if (!isRendezvousOrUnlimited() && j <= getBufferEndCounter() / ((long) lf1.f57431b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f53826H;
            while (true) {
                sue sueVar2 = (sue) atomicReferenceFieldUpdater2.get(this);
                if (sueVar2.f82931c >= yu1Var2.f82931c || !yu1Var2.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (C0051a4.m134a(atomicReferenceFieldUpdater2, this, sueVar2, yu1Var2)) {
                    if (sueVar2.decPointers$kotlinx_coroutines_core()) {
                        sueVar2.remove();
                    }
                } else if (yu1Var2.decPointers$kotlinx_coroutines_core()) {
                    yu1Var2.remove();
                }
            }
        }
        long j2 = yu1Var2.f82931c;
        if (j2 <= j) {
            return yu1Var2;
        }
        int i = lf1.f57431b;
        updateReceiversCounterIfLower(j2 * ((long) i));
        if (yu1Var2.f82931c * ((long) i) >= getSendersCounter$kotlinx_coroutines_core()) {
            return null;
        }
        yu1Var2.cleanPrev();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yu1<E> findSegmentSend(long j, yu1<E> yu1Var) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f53824C;
        gz6 gz6Var = (gz6) lf1.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = op2.findSegmentInternal(yu1Var, j, gz6Var);
            if (!ave.m27899isClosedimpl(objFindSegmentInternal)) {
                sue sueVarM27897getSegmentimpl = ave.m27897getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    sue sueVar = (sue) atomicReferenceFieldUpdater.get(this);
                    if (sueVar.f82931c >= sueVarM27897getSegmentimpl.f82931c) {
                        break loop0;
                    }
                    if (!sueVarM27897getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (C0051a4.m134a(atomicReferenceFieldUpdater, this, sueVar, sueVarM27897getSegmentimpl)) {
                        if (sueVar.decPointers$kotlinx_coroutines_core()) {
                            sueVar.remove();
                        }
                    } else if (sueVarM27897getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        sueVarM27897getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (ave.m27899isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (yu1Var.f82931c * ((long) lf1.f57431b) >= getReceiversCounter$kotlinx_coroutines_core()) {
                return null;
            }
            yu1Var.cleanPrev();
            return null;
        }
        yu1<E> yu1Var2 = (yu1) ave.m27897getSegmentimpl(objFindSegmentInternal);
        long j2 = yu1Var2.f82931c;
        if (j2 <= j) {
            return yu1Var2;
        }
        int i = lf1.f57431b;
        updateSendersCounterIfLower(j2 * ((long) i));
        if (yu1Var2.f82931c * ((long) i) >= getReceiversCounter$kotlinx_coroutines_core()) {
            return null;
        }
        yu1Var2.cleanPrev();
        return null;
    }

    private final /* synthetic */ Object getAndUpdate$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, qy6<Object, ? extends Object> qy6Var) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!C0051a4.m134a(atomicReferenceFieldUpdater, obj, obj2, qy6Var.invoke(obj2)));
        return obj2;
    }

    private final /* synthetic */ long getBufferEnd$volatile() {
        return this.bufferEnd$volatile;
    }

    private final long getBufferEndCounter() {
        return f53831f.get(this);
    }

    private final /* synthetic */ Object getBufferEndSegment$volatile() {
        return this.bufferEndSegment$volatile;
    }

    private final /* synthetic */ Object getCloseHandler$volatile() {
        return this.closeHandler$volatile;
    }

    private final /* synthetic */ long getCompletedExpandBuffersAndPauseFlag$volatile() {
        return this.completedExpandBuffersAndPauseFlag$volatile;
    }

    public static /* synthetic */ void getOnReceive$annotations() {
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    /* JADX INFO: renamed from: getOnUndeliveredElementReceiveCancellationConstructor$annotations */
    private static /* synthetic */ void m14686x1df74ada() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable getReceiveException() {
        Throwable thM14698f = m14698f();
        return thM14698f == null ? new b62(av1.f11914a) : thM14698f;
    }

    private final /* synthetic */ Object getReceiveSegment$volatile() {
        return this.receiveSegment$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getReceiveSegment$volatile$FU() {
        return f53825F;
    }

    private final /* synthetic */ long getReceivers$volatile() {
        return this.receivers$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater getReceivers$volatile$FU() {
        return f53830e;
    }

    private final /* synthetic */ Object getSendSegment$volatile() {
        return this.sendSegment$volatile;
    }

    private final /* synthetic */ long getSendersAndCloseStatus$volatile() {
        return this.sendersAndCloseStatus$volatile;
    }

    private final /* synthetic */ Object get_closeCause$volatile() {
        return this._closeCause$volatile;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m14687h(kf1 kf1Var, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i & 1) != 0) {
            j = 1;
        }
        kf1Var.incCompletedExpandBufferAttempts(j);
    }

    private final void incCompletedExpandBufferAttempts(long j) {
        if ((f53832m.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((f53832m.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    private final void invokeCloseHandler() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f53828M;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!C0051a4.m134a(atomicReferenceFieldUpdater, this, obj, obj == null ? lf1.f57454y : lf1.f57455z));
        if (obj == null) {
            return;
        }
        ((qy6) obj).invoke(m14698f());
    }

    private final boolean isCellNonEmpty(yu1<E> yu1Var, int i, long j) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = yu1Var.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != lf1.f57436g) {
                if (state$kotlinx_coroutines_core == lf1.f57435f) {
                    return true;
                }
                if (state$kotlinx_coroutines_core == lf1.f57441l || state$kotlinx_coroutines_core == lf1.getCHANNEL_CLOSED() || state$kotlinx_coroutines_core == lf1.f57440k || state$kotlinx_coroutines_core == lf1.f57439j) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == lf1.f57438i) {
                    return true;
                }
                return state$kotlinx_coroutines_core != lf1.f57437h && j == getReceiversCounter$kotlinx_coroutines_core();
            }
        } while (!yu1Var.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, lf1.f57439j));
        expandBuffer();
        return false;
    }

    private final boolean isClosed(long j, boolean z) throws IllegalAccessException, InvocationTargetException {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            completeClose(j & lf1.f57427G);
            if (z && hasElements$kotlinx_coroutines_core()) {
                return false;
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException(("unexpected close status: " + i).toString());
            }
            completeCancel(j & lf1.f57427G);
        }
        return true;
    }

    @wg5
    public static /* synthetic */ void isClosedForReceive$annotations() {
    }

    private final boolean isClosedForReceive0(long j) {
        return isClosed(j, true);
    }

    @wg5
    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isClosedForSend0(long j) {
        return isClosed(j, false);
    }

    @wg5
    public static /* synthetic */ void isEmpty$annotations() {
    }

    private final boolean isRendezvousOrUnlimited() {
        long bufferEndCounter = getBufferEndCounter();
        return bufferEndCounter == 0 || bufferEndCounter == Long.MAX_VALUE;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, qy6<? super Long, bth> qy6Var) {
        while (true) {
            qy6Var.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ <E> Object m14688m(kf1<E> kf1Var, zy2<? super E> zy2Var) throws Throwable {
        yu1<E> yu1Var = (yu1) getReceiveSegment$volatile$FU().get(kf1Var);
        while (!kf1Var.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(kf1Var);
            int i = lf1.f57431b;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (yu1Var.f82931c != j) {
                yu1<E> yu1VarFindSegmentReceive = kf1Var.findSegmentReceive(j, yu1Var);
                if (yu1VarFindSegmentReceive == null) {
                    continue;
                } else {
                    yu1Var = yu1VarFindSegmentReceive;
                }
            }
            Object objUpdateCellReceive = kf1Var.updateCellReceive(yu1Var, i2, andIncrement, null);
            if (objUpdateCellReceive == lf1.f57444o) {
                throw new IllegalStateException("unexpected");
            }
            if (objUpdateCellReceive != lf1.f57446q) {
                if (objUpdateCellReceive == lf1.f57445p) {
                    return kf1Var.receiveOnNoWaiterSuspend(yu1Var, i2, andIncrement, zy2Var);
                }
                yu1Var.cleanPrev();
                return objUpdateCellReceive;
            }
            if (andIncrement < kf1Var.getSendersCounter$kotlinx_coroutines_core()) {
                yu1Var.cleanPrev();
            }
        }
        throw l0g.recoverStackTrace(kf1Var.getReceiveException());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (p000.yu1) r8.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long markAllEmptyCellsAsClosed(p000.yu1<E> r8) {
        /*
            r7 = this;
        L0:
            int r0 = p000.lf1.f57431b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f82931c
            int r5 = p000.lf1.f57431b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.getReceiversCounter$kotlinx_coroutines_core()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.getState$kotlinx_coroutines_core(r0)
            if (r1 == 0) goto L2c
            qhg r2 = p000.lf1.access$getIN_BUFFER$p()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            qhg r2 = p000.lf1.f57435f
            if (r1 != r2) goto L39
            return r3
        L2c:
            qhg r2 = p000.lf1.getCHANNEL_CLOSED()
            boolean r1 = r8.casState$kotlinx_coroutines_core(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.onSlotCleaned()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            pp2 r8 = r8.getPrev()
            yu1 r8 = (p000.yu1) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf1.markAllEmptyCellsAsClosed(yu1):long");
    }

    private final void markCancellationStarted() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f53829d;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, lf1.constructSendersAndCloseStatus(lf1.f57427G & j, 1)));
    }

    private final void markCancelled() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f53829d;
        do {
            j = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, lf1.constructSendersAndCloseStatus(lf1.f57427G & j, 3)));
    }

    private final void markClosed() {
        long j;
        long jConstructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f53829d;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                jConstructSendersAndCloseStatus = lf1.constructSendersAndCloseStatus(j & lf1.f57427G, 2);
            } else if (i != 1) {
                return;
            } else {
                jConstructSendersAndCloseStatus = lf1.constructSendersAndCloseStatus(j & lf1.f57427G, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, jConstructSendersAndCloseStatus));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void moveSegmentBufferEndToSpecifiedOrLast(long r5, p000.yu1<E> r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f82931c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            pp2 r0 = r7.getNext()
            yu1 r0 = (p000.yu1) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.isRemoved()
            if (r5 == 0) goto L22
            pp2 r5 = r7.getNext()
            yu1 r5 = (p000.yu1) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = getBufferEndSegment$volatile$FU()
        L26:
            java.lang.Object r6 = r5.get(r4)
            sue r6 = (p000.sue) r6
            long r0 = r6.f82931c
            long r2 = r7.f82931c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            goto L4b
        L35:
            boolean r0 = r7.tryIncPointers$kotlinx_coroutines_core()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = p000.C0051a4.m134a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.decPointers$kotlinx_coroutines_core()
            if (r5 == 0) goto L4b
            r6.remove()
        L4b:
            return
        L4c:
            boolean r6 = r7.decPointers$kotlinx_coroutines_core()
            if (r6 == 0) goto L26
            r7.remove()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf1.moveSegmentBufferEndToSpecifiedOrLast(long, yu1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ <E> java.lang.Object m14689n(p000.kf1<E> r13, p000.zy2<? super p000.xu1<? extends E>> r14) {
        /*
            boolean r0 = r14 instanceof p000.kf1.C8336m
            if (r0 == 0) goto L14
            r0 = r14
            kf1$m r0 = (p000.kf1.C8336m) r0
            int r1 = r0.f53851c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f53851c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            kf1$m r0 = new kf1$m
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f53849a
            java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r1 = r6.f53851c
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            p000.y7e.throwOnFailure(r14)
            xu1 r14 = (p000.xu1) r14
            java.lang.Object r13 = r14.m33284unboximpl()
            goto Lb2
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            p000.y7e.throwOnFailure(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = access$getReceiveSegment$volatile$FU()
            java.lang.Object r14 = r14.get(r13)
            yu1 r14 = (p000.yu1) r14
        L47:
            boolean r1 = r13.isClosedForReceive()
            if (r1 == 0) goto L58
            xu1$b r14 = p000.xu1.f99332b
            java.lang.Throwable r13 = r13.m14698f()
            java.lang.Object r13 = r14.m33285closedJP2dKIU(r13)
            goto Lb2
        L58:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getReceivers$volatile$FU()
            long r4 = r1.getAndIncrement(r13)
            int r1 = p000.lf1.f57431b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f82931c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            yu1 r1 = access$findSegmentReceive(r13, r7, r14)
            if (r1 != 0) goto L76
            goto L47
        L76:
            r14 = r1
        L77:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = access$updateCellReceive(r7, r8, r9, r10, r12)
            qhg r7 = p000.lf1.access$getSUSPEND$p()
            if (r1 == r7) goto Lb3
            qhg r7 = p000.lf1.access$getFAILED$p()
            if (r1 != r7) goto L98
            long r7 = r13.getSendersCounter$kotlinx_coroutines_core()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L47
            r14.cleanPrev()
            goto L47
        L98:
            qhg r7 = p000.lf1.access$getSUSPEND_NO_WAITER$p()
            if (r1 != r7) goto La9
            r6.f53851c = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.m30698receiveCatchingOnNoWaiterSuspendGKJJFZk(r2, r3, r4, r6)
            if (r13 != r0) goto Lb2
            return r0
        La9:
            r14.cleanPrev()
            xu1$b r13 = p000.xu1.f99332b
            java.lang.Object r13 = r13.m33287successJP2dKIU(r1)
        Lb2:
            return r13
        Lb3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf1.m14689n(kf1, zy2):java.lang.Object");
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Object m14690o(kf1 kf1Var, Object obj, qy6 qy6Var, kz6 kz6Var, ny6 ny6Var, kz6 kz6Var2, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
        }
        if ((i & 16) != 0) {
            kz6Var2 = C8338o.f53859a;
        }
        yu1 yu1Var = (yu1) getReceiveSegment$volatile$FU().get(kf1Var);
        while (!kf1Var.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(kf1Var);
            int i2 = lf1.f57431b;
            long j = andIncrement / ((long) i2);
            int i3 = (int) (andIncrement % ((long) i2));
            if (yu1Var.f82931c != j) {
                yu1 yu1VarFindSegmentReceive = kf1Var.findSegmentReceive(j, yu1Var);
                if (yu1VarFindSegmentReceive == null) {
                    continue;
                } else {
                    yu1Var = yu1VarFindSegmentReceive;
                }
            }
            Object objUpdateCellReceive = kf1Var.updateCellReceive(yu1Var, i3, andIncrement, obj);
            if (objUpdateCellReceive == lf1.f57444o) {
                wgi wgiVar = obj instanceof wgi ? (wgi) obj : null;
                if (wgiVar != null) {
                    kf1Var.prepareReceiverForSuspension(wgiVar, yu1Var, i3);
                }
                return kz6Var.invoke(yu1Var, Integer.valueOf(i3), Long.valueOf(andIncrement));
            }
            if (objUpdateCellReceive != lf1.f57446q) {
                if (objUpdateCellReceive == lf1.f57445p) {
                    return kz6Var2.invoke(yu1Var, Integer.valueOf(i3), Long.valueOf(andIncrement));
                }
                yu1Var.cleanPrev();
                return qy6Var.invoke(objUpdateCellReceive);
            }
            if (andIncrement < kf1Var.getSendersCounter$kotlinx_coroutines_core()) {
                yu1Var.cleanPrev();
            }
        }
        return ny6Var.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCancellationChannelResultImplDoNotCall-5_sEAP8, reason: not valid java name */
    public final void m30697onCancellationChannelResultImplDoNotCall5_sEAP8(Throwable th, Object obj, e13 e13Var) throws IllegalAccessException, InvocationTargetException {
        qy6<E, bth> qy6Var = this.f53834b;
        md8.checkNotNull(qy6Var);
        Object objM33277getOrNullimpl = xu1.m33277getOrNullimpl(obj);
        md8.checkNotNull(objM33277getOrNullimpl);
        z4c.callUndeliveredElement(qy6Var, objM33277getOrNullimpl, e13Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancellationImplDoNotCall(Throwable th, E e, e13 e13Var) throws IllegalAccessException, InvocationTargetException {
        qy6<E, bth> qy6Var = this.f53834b;
        md8.checkNotNull(qy6Var);
        z4c.callUndeliveredElement(qy6Var, e, e13Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveCatchingOnNoWaiterSuspend(dq1<? super xu1<? extends E>> dq1Var) {
        v7e.C13927a c13927a = v7e.f90266b;
        dq1Var.resumeWith(v7e.m32723constructorimpl(xu1.m33272boximpl(xu1.f99332b.m33285closedJP2dKIU(m14698f()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveOnNoWaiterSuspend(dq1<? super E> dq1Var) {
        v7e.C13927a c13927a = v7e.f90266b;
        dq1Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(getReceiveException())));
    }

    private final void onClosedSelectOnReceive(pve<?> pveVar) {
        pveVar.selectInRegistrationPhase(lf1.getCHANNEL_CLOSED());
    }

    private final void onClosedSelectOnSend(E e, pve<?> pveVar) throws IllegalAccessException, InvocationTargetException {
        qy6<E, bth> qy6Var = this.f53834b;
        if (qy6Var != null) {
            z4c.callUndeliveredElement(qy6Var, e, pveVar.getContext());
        }
        pveVar.selectInRegistrationPhase(lf1.getCHANNEL_CLOSED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onClosedSend(E e, zy2<? super bth> zy2Var) throws IllegalAccessException, InvocationTargetException {
        vrh vrhVarCallUndeliveredElementCatchingException$default;
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        qy6<E, bth> qy6Var = this.f53834b;
        if (qy6Var == null || (vrhVarCallUndeliveredElementCatchingException$default = z4c.callUndeliveredElementCatchingException$default(qy6Var, e, null, 2, null)) == null) {
            Throwable thM14699g = m14699g();
            v7e.C13927a c13927a = v7e.f90266b;
            fq1Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(thM14699g)));
        } else {
            a85.addSuppressed(vrhVarCallUndeliveredElementCatchingException$default, m14699g());
            v7e.C13927a c13927a2 = v7e.f90266b;
            fq1Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(vrhVarCallUndeliveredElementCatchingException$default)));
        }
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedSendOnNoWaiterSuspend(E e, dq1<? super bth> dq1Var) throws IllegalAccessException, InvocationTargetException {
        qy6<E, bth> qy6Var = this.f53834b;
        if (qy6Var != null) {
            z4c.callUndeliveredElement(qy6Var, e, dq1Var.getContext());
        }
        Throwable thM14699g = m14699g();
        v7e.C13927a c13927a = v7e.f90266b;
        dq1Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(thM14699g)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56 */
    public static final kz6 m14691xa189d599(final kf1 kf1Var, final pve pveVar, Object obj, final Object obj2) {
        return new kz6() { // from class: hf1
            @Override // p000.kz6
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return kf1.m14692xc6272352(obj2, kf1Var, pveVar, (Throwable) obj3, obj4, (e13) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55 */
    public static final bth m14692xc6272352(Object obj, kf1 kf1Var, pve pveVar, Throwable th, Object obj2, e13 e13Var) throws IllegalAccessException, InvocationTargetException {
        if (obj != lf1.getCHANNEL_CLOSED()) {
            z4c.callUndeliveredElement(kf1Var.f53834b, obj, pveVar.getContext());
        }
        return bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareReceiverForSuspension(wgi wgiVar, yu1<E> yu1Var, int i) {
        m14703l();
        wgiVar.invokeOnCancellation(yu1Var, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareSenderForSuspension(wgi wgiVar, yu1<E> yu1Var, int i) {
        wgiVar.invokeOnCancellation(yu1Var, i + lf1.f57431b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceive(Object obj, Object obj2) throws Throwable {
        if (obj2 != lf1.getCHANNEL_CLOSED()) {
            return obj2;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveCatching(Object obj, Object obj2) {
        return xu1.m33272boximpl(obj2 == lf1.getCHANNEL_CLOSED() ? xu1.f99332b.m33285closedJP2dKIU(m14698f()) : xu1.f99332b.m33287successJP2dKIU(obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveOrNull(Object obj, Object obj2) throws Throwable {
        if (obj2 != lf1.getCHANNEL_CLOSED()) {
            return obj2;
        }
        if (m14698f() == null) {
            return null;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectSend(Object obj, Object obj2) throws Throwable {
        if (obj2 != lf1.getCHANNEL_CLOSED()) {
            return this;
        }
        throw m14699g();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ <E> Object m14693q(kf1<E> kf1Var, E e, zy2<? super bth> zy2Var) throws IllegalAccessException, InvocationTargetException {
        yu1<E> yu1Var = (yu1) f53824C.get(kf1Var);
        while (true) {
            long andIncrement = f53829d.getAndIncrement(kf1Var);
            long j = lf1.f57427G & andIncrement;
            boolean zIsClosedForSend0 = kf1Var.isClosedForSend0(andIncrement);
            int i = lf1.f57431b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (yu1Var.f82931c != j2) {
                yu1<E> yu1VarFindSegmentSend = kf1Var.findSegmentSend(j2, yu1Var);
                if (yu1VarFindSegmentSend != null) {
                    yu1Var = yu1VarFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    Object objOnClosedSend = kf1Var.onClosedSend(e, zy2Var);
                    if (objOnClosedSend == pd8.getCOROUTINE_SUSPENDED()) {
                        return objOnClosedSend;
                    }
                }
            }
            int iUpdateCellSend = kf1Var.updateCellSend(yu1Var, i2, e, j, null, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                yu1Var.cleanPrev();
                break;
            }
            if (iUpdateCellSend == 1) {
                break;
            }
            if (iUpdateCellSend != 2) {
                if (iUpdateCellSend == 3) {
                    Object objSendOnNoWaiterSuspend = kf1Var.sendOnNoWaiterSuspend(yu1Var, i2, e, j, zy2Var);
                    if (objSendOnNoWaiterSuspend == pd8.getCOROUTINE_SUSPENDED()) {
                        return objSendOnNoWaiterSuspend;
                    }
                } else if (iUpdateCellSend == 4) {
                    if (j < kf1Var.getReceiversCounter$kotlinx_coroutines_core()) {
                        yu1Var.cleanPrev();
                    }
                    Object objOnClosedSend2 = kf1Var.onClosedSend(e, zy2Var);
                    if (objOnClosedSend2 == pd8.getCOROUTINE_SUSPENDED()) {
                        return objOnClosedSend2;
                    }
                } else if (iUpdateCellSend == 5) {
                    yu1Var.cleanPrev();
                }
            } else if (zIsClosedForSend0) {
                yu1Var.onSlotCleaned();
                Object objOnClosedSend3 = kf1Var.onClosedSend(e, zy2Var);
                if (objOnClosedSend3 == pd8.getCOROUTINE_SUSPENDED()) {
                    return objOnClosedSend3;
                }
            }
        }
        return bth.f14751a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        r0 = p000.v7e.f90266b;
        r9.resumeWith(p000.v7e.m32723constructorimpl(p000.wc1.boxBoolean(true)));
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ <E> java.lang.Object m14694r(p000.kf1<E> r18, E r19, p000.zy2<? super java.lang.Boolean> r20) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf1.m14694r(kf1, java.lang.Object, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m30698receiveCatchingOnNoWaiterSuspendGKJJFZk(p000.yu1<E> r11, int r12, long r13, p000.zy2<? super p000.xu1<? extends E>> r15) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf1.m30698receiveCatchingOnNoWaiterSuspendGKJJFZk(yu1, int, long, zy2):java.lang.Object");
    }

    private final <R> R receiveImpl(Object obj, qy6<? super E, ? extends R> qy6Var, kz6<? super yu1<E>, ? super Integer, ? super Long, ? extends R> kz6Var, ny6<? extends R> ny6Var, kz6<? super yu1<E>, ? super Integer, ? super Long, ? extends R> kz6Var2) {
        yu1 yu1Var = (yu1) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i = lf1.f57431b;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (yu1Var.f82931c != j) {
                yu1 yu1VarFindSegmentReceive = findSegmentReceive(j, yu1Var);
                if (yu1VarFindSegmentReceive == null) {
                    continue;
                } else {
                    yu1Var = yu1VarFindSegmentReceive;
                }
            }
            qhg qhgVar = (Object) updateCellReceive(yu1Var, i2, andIncrement, obj);
            if (qhgVar == lf1.f57444o) {
                wgi wgiVar = obj instanceof wgi ? (wgi) obj : null;
                if (wgiVar != null) {
                    prepareReceiverForSuspension(wgiVar, yu1Var, i2);
                }
                return kz6Var.invoke(yu1Var, Integer.valueOf(i2), Long.valueOf(andIncrement));
            }
            if (qhgVar != lf1.f57446q) {
                if (qhgVar == lf1.f57445p) {
                    return kz6Var2.invoke(yu1Var, Integer.valueOf(i2), Long.valueOf(andIncrement));
                }
                yu1Var.cleanPrev();
                return qy6Var.invoke(qhgVar);
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                yu1Var.cleanPrev();
            }
        }
        return ny6Var.invoke();
    }

    private final void receiveImplOnNoWaiter(yu1<E> yu1Var, int i, long j, wgi wgiVar, qy6<? super E, bth> qy6Var, ny6<bth> ny6Var) {
        qhg qhgVar = (Object) updateCellReceive(yu1Var, i, j, wgiVar);
        if (qhgVar == lf1.f57444o) {
            prepareReceiverForSuspension(wgiVar, yu1Var, i);
            return;
        }
        if (qhgVar != lf1.f57446q) {
            yu1Var.cleanPrev();
            qy6Var.invoke(qhgVar);
            return;
        }
        if (j < getSendersCounter$kotlinx_coroutines_core()) {
            yu1Var.cleanPrev();
        }
        yu1 yu1Var2 = (yu1) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i2 = lf1.f57431b;
            long j2 = andIncrement / ((long) i2);
            int i3 = (int) (andIncrement % ((long) i2));
            if (yu1Var2.f82931c != j2) {
                yu1 yu1VarFindSegmentReceive = findSegmentReceive(j2, yu1Var2);
                if (yu1VarFindSegmentReceive == null) {
                    continue;
                } else {
                    yu1Var2 = yu1VarFindSegmentReceive;
                }
            }
            qhg qhgVar2 = (Object) updateCellReceive(yu1Var2, i3, andIncrement, wgiVar);
            if (qhgVar2 == lf1.f57444o) {
                if (wgiVar == null) {
                    wgiVar = null;
                }
                if (wgiVar != null) {
                    prepareReceiverForSuspension(wgiVar, yu1Var2, i3);
                }
                bth bthVar = bth.f14751a;
                return;
            }
            if (qhgVar2 != lf1.f57446q) {
                if (qhgVar2 == lf1.f57445p) {
                    throw new IllegalStateException("unexpected");
                }
                yu1Var2.cleanPrev();
                qy6Var.invoke(qhgVar2);
                return;
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                yu1Var2.cleanPrev();
            }
        }
        ny6Var.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object receiveOnNoWaiterSuspend(yu1<E> yu1Var, int i, long j, zy2<? super E> zy2Var) {
        kz6 kz6Var;
        fq1 orCreateCancellableContinuation = hq1.getOrCreateCancellableContinuation(od8.intercepted(zy2Var));
        try {
            Object objUpdateCellReceive = updateCellReceive(yu1Var, i, j, orCreateCancellableContinuation);
            if (objUpdateCellReceive == lf1.f57444o) {
                prepareReceiverForSuspension(orCreateCancellableContinuation, yu1Var, i);
            } else {
                if (objUpdateCellReceive == lf1.f57446q) {
                    if (j < getSendersCounter$kotlinx_coroutines_core()) {
                        yu1Var.cleanPrev();
                    }
                    yu1 yu1Var2 = (yu1) getReceiveSegment$volatile$FU().get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            onClosedReceiveOnNoWaiterSuspend(orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                        int i2 = lf1.f57431b;
                        long j2 = andIncrement / ((long) i2);
                        int i3 = (int) (andIncrement % ((long) i2));
                        if (yu1Var2.f82931c != j2) {
                            yu1 yu1VarFindSegmentReceive = findSegmentReceive(j2, yu1Var2);
                            if (yu1VarFindSegmentReceive != null) {
                                yu1Var2 = yu1VarFindSegmentReceive;
                            }
                        }
                        objUpdateCellReceive = updateCellReceive(yu1Var2, i3, andIncrement, orCreateCancellableContinuation);
                        if (objUpdateCellReceive == lf1.f57444o) {
                            fq1 fq1Var = orCreateCancellableContinuation != null ? orCreateCancellableContinuation : null;
                            if (fq1Var != null) {
                                prepareReceiverForSuspension(fq1Var, yu1Var2, i3);
                            }
                        } else if (objUpdateCellReceive == lf1.f57446q) {
                            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                yu1Var2.cleanPrev();
                            }
                        } else {
                            if (objUpdateCellReceive == lf1.f57445p) {
                                throw new IllegalStateException("unexpected");
                            }
                            yu1Var2.cleanPrev();
                            qy6<E, bth> qy6Var = this.f53834b;
                            kz6Var = (kz6) (qy6Var != null ? bindCancellationFun(qy6Var) : null);
                        }
                    }
                } else {
                    yu1Var.cleanPrev();
                    qy6<E, bth> qy6Var2 = this.f53834b;
                    kz6Var = (kz6) (qy6Var2 != null ? bindCancellationFun(qy6Var2) : null);
                }
                orCreateCancellableContinuation.resume(objUpdateCellReceive, (kz6<? super Throwable, ? super Object, ? super e13, bth>) kz6Var);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == pd8.getCOROUTINE_SUSPENDED()) {
                jk3.probeCoroutineSuspended(zy2Var);
            }
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForReceive(pve<?> pveVar, Object obj) {
        yu1 yu1Var = (yu1) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i = lf1.f57431b;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (yu1Var.f82931c != j) {
                yu1 yu1VarFindSegmentReceive = findSegmentReceive(j, yu1Var);
                if (yu1VarFindSegmentReceive == null) {
                    continue;
                } else {
                    yu1Var = yu1VarFindSegmentReceive;
                }
            }
            Object objUpdateCellReceive = updateCellReceive(yu1Var, i2, andIncrement, pveVar);
            if (objUpdateCellReceive == lf1.f57444o) {
                wgi wgiVar = pveVar instanceof wgi ? (wgi) pveVar : null;
                if (wgiVar != null) {
                    prepareReceiverForSuspension(wgiVar, yu1Var, i2);
                    return;
                }
                return;
            }
            if (objUpdateCellReceive != lf1.f57446q) {
                if (objUpdateCellReceive == lf1.f57445p) {
                    throw new IllegalStateException("unexpected");
                }
                yu1Var.cleanPrev();
                pveVar.selectInRegistrationPhase(objUpdateCellReceive);
                return;
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                yu1Var.cleanPrev();
            }
        }
        onClosedSelectOnReceive(pveVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (p000.yu1) r12.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void removeUnprocessedElements(p000.yu1<E> r12) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf1.removeUnprocessedElements(yu1):void");
    }

    private final void resumeReceiverOnClosedChannel(wgi wgiVar) {
        resumeWaiterOnClosedChannel(wgiVar, true);
    }

    private final void resumeSenderOnCancelledChannel(wgi wgiVar) {
        resumeWaiterOnClosedChannel(wgiVar, false);
    }

    private final void resumeWaiterOnClosedChannel(wgi wgiVar, boolean z) {
        if (wgiVar instanceof C8325b) {
            dq1<Boolean> cont = ((C8325b) wgiVar).getCont();
            v7e.C13927a c13927a = v7e.f90266b;
            cont.resumeWith(v7e.m32723constructorimpl(Boolean.FALSE));
            return;
        }
        if (wgiVar instanceof dq1) {
            zy2 zy2Var = (zy2) wgiVar;
            v7e.C13927a c13927a2 = v7e.f90266b;
            zy2Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(z ? getReceiveException() : m14699g())));
        } else if (wgiVar instanceof gsd) {
            fq1<xu1<? extends E>> fq1Var = ((gsd) wgiVar).f40949a;
            v7e.C13927a c13927a3 = v7e.f90266b;
            fq1Var.resumeWith(v7e.m32723constructorimpl(xu1.m33272boximpl(xu1.f99332b.m33285closedJP2dKIU(m14698f()))));
        } else if (wgiVar instanceof C8324a) {
            ((C8324a) wgiVar).tryResumeHasNextOnClosedChannel();
        } else {
            if (wgiVar instanceof pve) {
                ((pve) wgiVar).trySelect(this, lf1.getCHANNEL_CLOSED());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + wgiVar).toString());
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Object m14695s(kf1 kf1Var, Object obj, Object obj2, ny6 ny6Var, gz6 gz6Var, ny6 ny6Var2, oz6 oz6Var, int i, Object obj3) {
        yu1 yu1Var;
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
        oz6 oz6Var2 = (i & 32) != 0 ? C8339p.f53860a : oz6Var;
        yu1 yu1Var2 = (yu1) f53824C.get(kf1Var);
        while (true) {
            long andIncrement = f53829d.getAndIncrement(kf1Var);
            long j = andIncrement & lf1.f57427G;
            boolean zIsClosedForSend0 = kf1Var.isClosedForSend0(andIncrement);
            int i2 = lf1.f57431b;
            long j2 = j / ((long) i2);
            int i3 = (int) (j % ((long) i2));
            if (yu1Var2.f82931c != j2) {
                yu1 yu1VarFindSegmentSend = kf1Var.findSegmentSend(j2, yu1Var2);
                if (yu1VarFindSegmentSend != null) {
                    yu1Var = yu1VarFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return ny6Var2.invoke();
                }
            } else {
                yu1Var = yu1Var2;
            }
            int iUpdateCellSend = kf1Var.updateCellSend(yu1Var, i3, obj, j, obj2, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                yu1Var.cleanPrev();
                return ny6Var.invoke();
            }
            if (iUpdateCellSend == 1) {
                return ny6Var.invoke();
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    yu1Var.onSlotCleaned();
                    return ny6Var2.invoke();
                }
                wgi wgiVar = obj2 instanceof wgi ? (wgi) obj2 : null;
                if (wgiVar != null) {
                    kf1Var.prepareSenderForSuspension(wgiVar, yu1Var, i3);
                }
                return gz6Var.invoke(yu1Var, Integer.valueOf(i3));
            }
            if (iUpdateCellSend == 3) {
                return oz6Var2.invoke(yu1Var, Integer.valueOf(i3), obj, Long.valueOf(j));
            }
            if (iUpdateCellSend == 4) {
                if (j < kf1Var.getReceiversCounter$kotlinx_coroutines_core()) {
                    yu1Var.cleanPrev();
                }
                return ny6Var2.invoke();
            }
            if (iUpdateCellSend == 5) {
                yu1Var.cleanPrev();
            }
            yu1Var2 = yu1Var;
        }
    }

    private final <R> R sendImpl(E e, Object obj, ny6<? extends R> ny6Var, gz6<? super yu1<E>, ? super Integer, ? extends R> gz6Var, ny6<? extends R> ny6Var2, oz6<? super yu1<E>, ? super Integer, ? super E, ? super Long, ? extends R> oz6Var) {
        yu1 yu1Var;
        yu1 yu1Var2 = (yu1) f53824C.get(this);
        while (true) {
            long andIncrement = f53829d.getAndIncrement(this);
            long j = andIncrement & lf1.f57427G;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i = lf1.f57431b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (yu1Var2.f82931c != j2) {
                yu1 yu1VarFindSegmentSend = findSegmentSend(j2, yu1Var2);
                if (yu1VarFindSegmentSend != null) {
                    yu1Var = yu1VarFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return ny6Var2.invoke();
                }
            } else {
                yu1Var = yu1Var2;
            }
            int iUpdateCellSend = updateCellSend(yu1Var, i2, e, j, obj, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                yu1Var.cleanPrev();
                return ny6Var.invoke();
            }
            if (iUpdateCellSend == 1) {
                return ny6Var.invoke();
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    yu1Var.onSlotCleaned();
                    return ny6Var2.invoke();
                }
                wgi wgiVar = obj instanceof wgi ? (wgi) obj : null;
                if (wgiVar != null) {
                    prepareSenderForSuspension(wgiVar, yu1Var, i2);
                }
                return gz6Var.invoke(yu1Var, Integer.valueOf(i2));
            }
            if (iUpdateCellSend == 3) {
                return oz6Var.invoke(yu1Var, Integer.valueOf(i2), e, Long.valueOf(j));
            }
            if (iUpdateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    yu1Var.cleanPrev();
                }
                return ny6Var2.invoke();
            }
            if (iUpdateCellSend == 5) {
                yu1Var.cleanPrev();
            }
            yu1Var2 = yu1Var;
        }
    }

    private final void sendImplOnNoWaiter(yu1<E> yu1Var, int i, E e, long j, wgi wgiVar, ny6<bth> ny6Var, ny6<bth> ny6Var2) {
        yu1 yu1Var2;
        bth bthVarInvoke;
        wgi wgiVar2 = wgiVar;
        int iUpdateCellSend = updateCellSend(yu1Var, i, e, j, wgiVar, false);
        if (iUpdateCellSend == 0) {
            yu1Var.cleanPrev();
            ny6Var.invoke();
            return;
        }
        if (iUpdateCellSend == 1) {
            ny6Var.invoke();
            return;
        }
        if (iUpdateCellSend == 2) {
            prepareSenderForSuspension(wgiVar2, yu1Var, i);
            return;
        }
        if (iUpdateCellSend == 4) {
            if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                yu1Var.cleanPrev();
            }
            ny6Var2.invoke();
            return;
        }
        if (iUpdateCellSend != 5) {
            throw new IllegalStateException("unexpected");
        }
        yu1Var.cleanPrev();
        yu1 yu1Var3 = (yu1) f53824C.get(this);
        while (true) {
            long andIncrement = f53829d.getAndIncrement(this);
            long j2 = andIncrement & lf1.f57427G;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i2 = lf1.f57431b;
            long j3 = j2 / ((long) i2);
            int i3 = (int) (j2 % ((long) i2));
            if (yu1Var3.f82931c != j3) {
                yu1 yu1VarFindSegmentSend = findSegmentSend(j3, yu1Var3);
                if (yu1VarFindSegmentSend != null) {
                    yu1Var2 = yu1VarFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    bthVarInvoke = ny6Var2.invoke();
                    break;
                }
            } else {
                yu1Var2 = yu1Var3;
            }
            yu1 yu1Var4 = yu1Var2;
            int iUpdateCellSend2 = updateCellSend(yu1Var2, i3, e, j2, wgiVar, zIsClosedForSend0);
            if (iUpdateCellSend2 == 0) {
                yu1Var4.cleanPrev();
                bthVarInvoke = ny6Var.invoke();
                break;
            }
            if (iUpdateCellSend2 == 1) {
                bthVarInvoke = ny6Var.invoke();
                break;
            }
            if (iUpdateCellSend2 != 2) {
                if (iUpdateCellSend2 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iUpdateCellSend2 != 4) {
                    if (iUpdateCellSend2 == 5) {
                        yu1Var4.cleanPrev();
                    }
                    yu1Var3 = yu1Var4;
                } else {
                    if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                        yu1Var4.cleanPrev();
                    }
                    bthVarInvoke = ny6Var2.invoke();
                }
            } else if (zIsClosedForSend0) {
                yu1Var4.onSlotCleaned();
                bthVarInvoke = ny6Var2.invoke();
            } else {
                if (wgiVar2 == null) {
                    wgiVar2 = null;
                }
                if (wgiVar2 != null) {
                    prepareSenderForSuspension(wgiVar2, yu1Var4, i3);
                }
                bthVarInvoke = bth.f14751a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendOnNoWaiterSuspend(p000.yu1<E> r21, int r22, E r23, long r24, p000.zy2<? super p000.bth> r26) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf1.sendOnNoWaiterSuspend(yu1, int, java.lang.Object, long, zy2):java.lang.Object");
    }

    private final /* synthetic */ void setBufferEnd$volatile(long j) {
        this.bufferEnd$volatile = j;
    }

    private final /* synthetic */ void setBufferEndSegment$volatile(Object obj) {
        this.bufferEndSegment$volatile = obj;
    }

    private final /* synthetic */ void setCloseHandler$volatile(Object obj) {
        this.closeHandler$volatile = obj;
    }

    private final /* synthetic */ void setCompletedExpandBuffersAndPauseFlag$volatile(long j) {
        this.completedExpandBuffersAndPauseFlag$volatile = j;
    }

    private final /* synthetic */ void setReceiveSegment$volatile(Object obj) {
        this.receiveSegment$volatile = obj;
    }

    private final /* synthetic */ void setReceivers$volatile(long j) {
        this.receivers$volatile = j;
    }

    private final /* synthetic */ void setSendSegment$volatile(Object obj) {
        this.sendSegment$volatile = obj;
    }

    private final /* synthetic */ void setSendersAndCloseStatus$volatile(long j) {
        this.sendersAndCloseStatus$volatile = j;
    }

    private final /* synthetic */ void set_closeCause$volatile(Object obj) {
        this._closeCause$volatile = obj;
    }

    private final boolean shouldSendSuspend(long j) {
        if (isClosedForSend0(j)) {
            return false;
        }
        return !bufferOrRendezvousSend(j & lf1.f57427G);
    }

    private final boolean tryResumeReceiver(Object obj, E e) {
        if (obj instanceof pve) {
            return ((pve) obj).trySelect(this, e);
        }
        if (obj instanceof gsd) {
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            fq1<xu1<? extends E>> fq1Var = ((gsd) obj).f40949a;
            xu1 xu1VarM33272boximpl = xu1.m33272boximpl(xu1.f99332b.m33287successJP2dKIU(e));
            qy6<E, bth> qy6Var = this.f53834b;
            return lf1.tryResume0(fq1Var, xu1VarM33272boximpl, (kz6) (qy6Var != null ? bindCancellationFunResult(qy6Var) : null));
        }
        if (obj instanceof C8324a) {
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((C8324a) obj).tryResumeHasNext(e);
        }
        if (obj instanceof dq1) {
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            dq1 dq1Var = (dq1) obj;
            qy6<E, bth> qy6Var2 = this.f53834b;
            return lf1.tryResume0(dq1Var, e, (kz6) (qy6Var2 != null ? bindCancellationFun(qy6Var2) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final boolean tryResumeSender(Object obj, yu1<E> yu1Var, int i) {
        if (obj instanceof dq1) {
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return lf1.m16114a((dq1) obj, bth.f14751a, null, 2, null);
        }
        if (obj instanceof pve) {
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            sjh sjhVarTrySelectDetailed = ((ove) obj).trySelectDetailed(this, bth.f14751a);
            if (sjhVarTrySelectDetailed == sjh.f82050b) {
                yu1Var.cleanElement$kotlinx_coroutines_core(i);
            }
            return sjhVarTrySelectDetailed == sjh.f82049a;
        }
        if (obj instanceof C8325b) {
            return lf1.m16114a(((C8325b) obj).getCont(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final /* synthetic */ void update$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, qy6<? super Long, Long> qy6Var) {
        long j;
        do {
            j = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j, qy6Var.invoke(Long.valueOf(j)).longValue()));
    }

    private final boolean updateCellExpandBuffer(yu1<E> yu1Var, int i, long j) {
        Object state$kotlinx_coroutines_core = yu1Var.getState$kotlinx_coroutines_core(i);
        if (!(state$kotlinx_coroutines_core instanceof wgi) || j < f53830e.get(this) || !yu1Var.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, lf1.f57438i)) {
            return updateCellExpandBufferSlow(yu1Var, i, j);
        }
        if (tryResumeSender(state$kotlinx_coroutines_core, yu1Var, i)) {
            yu1Var.setState$kotlinx_coroutines_core(i, lf1.f57435f);
            return true;
        }
        yu1Var.setState$kotlinx_coroutines_core(i, lf1.f57441l);
        yu1Var.onCancelledRequest(i, false);
        return false;
    }

    private final boolean updateCellExpandBufferSlow(yu1<E> yu1Var, int i, long j) {
        while (true) {
            Object state$kotlinx_coroutines_core = yu1Var.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core instanceof wgi) {
                if (j < f53830e.get(this)) {
                    if (yu1Var.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, new xgi((wgi) state$kotlinx_coroutines_core))) {
                        return true;
                    }
                } else if (yu1Var.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, lf1.f57438i)) {
                    if (tryResumeSender(state$kotlinx_coroutines_core, yu1Var, i)) {
                        yu1Var.setState$kotlinx_coroutines_core(i, lf1.f57435f);
                        return true;
                    }
                    yu1Var.setState$kotlinx_coroutines_core(i, lf1.f57441l);
                    yu1Var.onCancelledRequest(i, false);
                    return false;
                }
            } else {
                if (state$kotlinx_coroutines_core == lf1.f57441l) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == null) {
                    if (yu1Var.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, lf1.f57436g)) {
                        return true;
                    }
                } else {
                    if (state$kotlinx_coroutines_core == lf1.f57435f || state$kotlinx_coroutines_core == lf1.f57439j || state$kotlinx_coroutines_core == lf1.f57440k || state$kotlinx_coroutines_core == lf1.f57442m || state$kotlinx_coroutines_core == lf1.getCHANNEL_CLOSED()) {
                        return true;
                    }
                    if (state$kotlinx_coroutines_core != lf1.f57437h) {
                        throw new IllegalStateException(("Unexpected cell state: " + state$kotlinx_coroutines_core).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateCellReceive(yu1<E> yu1Var, int i, long j, Object obj) {
        Object state$kotlinx_coroutines_core = yu1Var.getState$kotlinx_coroutines_core(i);
        if (state$kotlinx_coroutines_core == null) {
            if (j >= (f53829d.get(this) & lf1.f57427G)) {
                if (obj == null) {
                    return lf1.f57445p;
                }
                if (yu1Var.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, obj)) {
                    expandBuffer();
                    return lf1.f57444o;
                }
            }
        } else if (state$kotlinx_coroutines_core == lf1.f57435f && yu1Var.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, lf1.f57440k)) {
            expandBuffer();
            return yu1Var.retrieveElement$kotlinx_coroutines_core(i);
        }
        return updateCellReceiveSlow(yu1Var, i, j, obj);
    }

    private final Object updateCellReceiveSlow(yu1<E> yu1Var, int i, long j, Object obj) {
        while (true) {
            Object state$kotlinx_coroutines_core = yu1Var.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core == null || state$kotlinx_coroutines_core == lf1.f57436g) {
                if (j < (f53829d.get(this) & lf1.f57427G)) {
                    if (yu1Var.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, lf1.f57439j)) {
                        expandBuffer();
                        return lf1.f57446q;
                    }
                } else {
                    if (obj == null) {
                        return lf1.f57445p;
                    }
                    if (yu1Var.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, obj)) {
                        expandBuffer();
                        return lf1.f57444o;
                    }
                }
            } else {
                if (state$kotlinx_coroutines_core != lf1.f57435f) {
                    if (state$kotlinx_coroutines_core != lf1.f57441l && state$kotlinx_coroutines_core != lf1.f57439j) {
                        if (state$kotlinx_coroutines_core == lf1.getCHANNEL_CLOSED()) {
                            expandBuffer();
                            return lf1.f57446q;
                        }
                        if (state$kotlinx_coroutines_core != lf1.f57438i && yu1Var.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, lf1.f57437h)) {
                            boolean z = state$kotlinx_coroutines_core instanceof xgi;
                            if (z) {
                                state$kotlinx_coroutines_core = ((xgi) state$kotlinx_coroutines_core).f97775a;
                            }
                            if (tryResumeSender(state$kotlinx_coroutines_core, yu1Var, i)) {
                                yu1Var.setState$kotlinx_coroutines_core(i, lf1.f57440k);
                                expandBuffer();
                                return yu1Var.retrieveElement$kotlinx_coroutines_core(i);
                            }
                            yu1Var.setState$kotlinx_coroutines_core(i, lf1.f57441l);
                            yu1Var.onCancelledRequest(i, false);
                            if (z) {
                                expandBuffer();
                            }
                            return lf1.f57446q;
                        }
                    }
                    return lf1.f57446q;
                }
                if (yu1Var.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, lf1.f57440k)) {
                    expandBuffer();
                    return yu1Var.retrieveElement$kotlinx_coroutines_core(i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int updateCellSend(yu1<E> yu1Var, int i, E e, long j, Object obj, boolean z) {
        yu1Var.storeElement$kotlinx_coroutines_core(i, e);
        if (z) {
            return updateCellSendSlow(yu1Var, i, e, j, obj, z);
        }
        Object state$kotlinx_coroutines_core = yu1Var.getState$kotlinx_coroutines_core(i);
        if (state$kotlinx_coroutines_core == null) {
            if (bufferOrRendezvousSend(j)) {
                if (yu1Var.casState$kotlinx_coroutines_core(i, null, lf1.f57435f)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (yu1Var.casState$kotlinx_coroutines_core(i, null, obj)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof wgi) {
            yu1Var.cleanElement$kotlinx_coroutines_core(i);
            if (tryResumeReceiver(state$kotlinx_coroutines_core, e)) {
                yu1Var.setState$kotlinx_coroutines_core(i, lf1.f57440k);
                m14702k();
                return 0;
            }
            if (yu1Var.getAndSetState$kotlinx_coroutines_core(i, lf1.f57442m) != lf1.f57442m) {
                yu1Var.onCancelledRequest(i, true);
            }
            return 5;
        }
        return updateCellSendSlow(yu1Var, i, e, j, obj, z);
    }

    private final int updateCellSendSlow(yu1<E> yu1Var, int i, E e, long j, Object obj, boolean z) {
        while (true) {
            Object state$kotlinx_coroutines_core = yu1Var.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core == null) {
                if (!bufferOrRendezvousSend(j) || z) {
                    if (z) {
                        if (yu1Var.casState$kotlinx_coroutines_core(i, null, lf1.f57441l)) {
                            yu1Var.onCancelledRequest(i, false);
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (yu1Var.casState$kotlinx_coroutines_core(i, null, obj)) {
                            return 2;
                        }
                    }
                } else if (yu1Var.casState$kotlinx_coroutines_core(i, null, lf1.f57435f)) {
                    return 1;
                }
            } else {
                if (state$kotlinx_coroutines_core != lf1.f57436g) {
                    if (state$kotlinx_coroutines_core == lf1.f57442m) {
                        yu1Var.cleanElement$kotlinx_coroutines_core(i);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == lf1.f57439j) {
                        yu1Var.cleanElement$kotlinx_coroutines_core(i);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == lf1.getCHANNEL_CLOSED()) {
                        yu1Var.cleanElement$kotlinx_coroutines_core(i);
                        completeCloseOrCancel();
                        return 4;
                    }
                    yu1Var.cleanElement$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core instanceof xgi) {
                        state$kotlinx_coroutines_core = ((xgi) state$kotlinx_coroutines_core).f97775a;
                    }
                    if (tryResumeReceiver(state$kotlinx_coroutines_core, e)) {
                        yu1Var.setState$kotlinx_coroutines_core(i, lf1.f57440k);
                        m14702k();
                        return 0;
                    }
                    if (yu1Var.getAndSetState$kotlinx_coroutines_core(i, lf1.f57442m) != lf1.f57442m) {
                        yu1Var.onCancelledRequest(i, true);
                    }
                    return 5;
                }
                if (yu1Var.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, lf1.f57435f)) {
                    return 1;
                }
            }
        }
    }

    private final void updateReceiversCounterIfLower(long j) {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f53830e;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j) {
                return;
            }
        } while (!f53830e.compareAndSet(this, j2, j));
    }

    private final void updateSendersCounterIfLower(long j) {
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f53829d;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            j3 = lf1.f57427G & j2;
            if (j3 >= j) {
                return;
            }
        } while (!f53829d.compareAndSet(this, j2, lf1.constructSendersAndCloseStatus(j3, (int) (j2 >> 60))));
    }

    @Override // p000.hsd
    public final boolean cancel(@gib Throwable th) {
        return cancelImpl$kotlinx_coroutines_core(th);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(@gib Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return m14696d(th, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void checkSegmentStructureInvariants() {
        if (isRendezvousOrUnlimited()) {
            if (f53826H.get(this) != lf1.f57430a) {
                throw new IllegalStateException(("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: " + this).toString());
            }
        } else if (((yu1) f53825F.get(this)).f82931c > ((yu1) f53826H.get(this)).f82931c) {
            throw new IllegalStateException(("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: " + this).toString());
        }
        List listListOf = l82.listOf((Object[]) new yu1[]{f53825F.get(this), f53824C.get(this), f53826H.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((yu1) obj) != lf1.f57430a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((yu1) next).f82931c;
            do {
                Object next2 = it.next();
                long j2 = ((yu1) next2).f82931c;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        yu1 yu1Var = (yu1) next;
        if (yu1Var.getPrev() != 0) {
            throw new IllegalStateException(("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: " + this).toString());
        }
        while (yu1Var.getNext() != 0) {
            S next3 = yu1Var.getNext();
            md8.checkNotNull(next3);
            if (((yu1) next3).getPrev() != 0) {
                S next4 = yu1Var.getNext();
                md8.checkNotNull(next4);
                if (((yu1) next4).getPrev() != yu1Var) {
                    throw new IllegalStateException(("The `segment.next.prev === segment` invariant is violated.\nChannel state: " + this).toString());
                }
            }
            int i = lf1.f57431b;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object state$kotlinx_coroutines_core = yu1Var.getState$kotlinx_coroutines_core(i3);
                if (!md8.areEqual(state$kotlinx_coroutines_core, lf1.f57435f) && !(state$kotlinx_coroutines_core instanceof wgi)) {
                    if (md8.areEqual(state$kotlinx_coroutines_core, lf1.f57442m) || md8.areEqual(state$kotlinx_coroutines_core, lf1.f57441l) || md8.areEqual(state$kotlinx_coroutines_core, lf1.getCHANNEL_CLOSED())) {
                        if (yu1Var.getElement$kotlinx_coroutines_core(i3) != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        i2++;
                    } else {
                        if (!md8.areEqual(state$kotlinx_coroutines_core, lf1.f57439j) && !md8.areEqual(state$kotlinx_coroutines_core, lf1.f57440k)) {
                            throw new IllegalStateException(("Unexpected segment cell state: " + state$kotlinx_coroutines_core + ".\nChannel state: " + this).toString());
                        }
                        if (yu1Var.getElement$kotlinx_coroutines_core(i3) != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                }
            }
            if (i2 == lf1.f57431b && yu1Var != f53825F.get(this) && yu1Var != f53824C.get(this) && yu1Var != f53826H.get(this)) {
                throw new IllegalStateException(("Logically removed segment is reachable.\nChannel state: " + this).toString());
            }
            S next5 = yu1Var.getNext();
            md8.checkNotNull(next5);
            yu1Var = (yu1) next5;
        }
    }

    @Override // p000.nye
    public boolean close(@gib Throwable th) {
        return m14696d(th, false);
    }

    /* JADX INFO: renamed from: d */
    public boolean m14696d(@gib Throwable th, boolean z) {
        if (z) {
            markCancellationStarted();
        }
        boolean zM134a = C0051a4.m134a(f53827L, this, lf1.f57421A, th);
        if (z) {
            markCancelled();
        } else {
            markClosed();
        }
        completeCloseOrCancel();
        m14701j();
        if (zM134a) {
            invokeCloseHandler();
        }
        return zM134a;
    }

    /* JADX INFO: renamed from: e */
    public final void m14697e(long j) {
        vrh vrhVarCallUndeliveredElementCatchingException$default;
        yu1<E> yu1Var = (yu1) f53825F.get(this);
        while (true) {
            long j2 = f53830e.get(this);
            if (j < Math.max(((long) this.f53833a) + j2, getBufferEndCounter())) {
                return;
            }
            if (f53830e.compareAndSet(this, j2, j2 + 1)) {
                int i = lf1.f57431b;
                long j3 = j2 / ((long) i);
                int i2 = (int) (j2 % ((long) i));
                if (yu1Var.f82931c != j3) {
                    yu1<E> yu1VarFindSegmentReceive = findSegmentReceive(j3, yu1Var);
                    if (yu1VarFindSegmentReceive == null) {
                        continue;
                    } else {
                        yu1Var = yu1VarFindSegmentReceive;
                    }
                }
                Object objUpdateCellReceive = updateCellReceive(yu1Var, i2, j2, null);
                if (objUpdateCellReceive != lf1.f57446q) {
                    yu1Var.cleanPrev();
                    qy6<E, bth> qy6Var = this.f53834b;
                    if (qy6Var != null && (vrhVarCallUndeliveredElementCatchingException$default = z4c.callUndeliveredElementCatchingException$default(qy6Var, objUpdateCellReceive, null, 2, null)) != null) {
                        throw vrhVarCallUndeliveredElementCatchingException$default;
                    }
                } else if (j2 < getSendersCounter$kotlinx_coroutines_core()) {
                    yu1Var.cleanPrev();
                }
            }
        }
    }

    @gib
    /* JADX INFO: renamed from: f */
    public final Throwable m14698f() {
        return (Throwable) f53827L.get(this);
    }

    @yfb
    /* JADX INFO: renamed from: g */
    public final Throwable m14699g() {
        Throwable thM14698f = m14698f();
        return thM14698f == null ? new c62(av1.f11914a) : thM14698f;
    }

    @Override // p000.hsd
    @yfb
    public jve<E> getOnReceive() {
        C8328e c8328e = C8328e.f53841a;
        md8.checkNotNull(c8328e, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        kz6 kz6Var = (kz6) qlh.beforeCheckcastToFunctionOfArity(c8328e, 3);
        C8329f c8329f = C8329f.f53842a;
        md8.checkNotNull(c8329f, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kve(this, kz6Var, (kz6) qlh.beforeCheckcastToFunctionOfArity(c8329f, 3), this.f53835c);
    }

    @Override // p000.hsd
    @yfb
    public jve<xu1<E>> getOnReceiveCatching() {
        C8330g c8330g = C8330g.f53843a;
        md8.checkNotNull(c8330g, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        kz6 kz6Var = (kz6) qlh.beforeCheckcastToFunctionOfArity(c8330g, 3);
        C8331h c8331h = C8331h.f53844a;
        md8.checkNotNull(c8331h, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kve(this, kz6Var, (kz6) qlh.beforeCheckcastToFunctionOfArity(c8331h, 3), this.f53835c);
    }

    @Override // p000.hsd
    @yfb
    public jve<E> getOnReceiveOrNull() {
        C8332i c8332i = C8332i.f53845a;
        md8.checkNotNull(c8332i, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        kz6 kz6Var = (kz6) qlh.beforeCheckcastToFunctionOfArity(c8332i, 3);
        C8333j c8333j = C8333j.f53846a;
        md8.checkNotNull(c8333j, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kve(this, kz6Var, (kz6) qlh.beforeCheckcastToFunctionOfArity(c8333j, 3), this.f53835c);
    }

    @Override // p000.nye
    @yfb
    public lve<E, kf1<E>> getOnSend() {
        C8334k c8334k = C8334k.f53847a;
        md8.checkNotNull(c8334k, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        kz6 kz6Var = (kz6) qlh.beforeCheckcastToFunctionOfArity(c8334k, 3);
        C8335l c8335l = C8335l.f53848a;
        md8.checkNotNull(c8335l, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new mve(this, kz6Var, (kz6) qlh.beforeCheckcastToFunctionOfArity(c8335l, 3), null, 8, null);
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return f53830e.get(this);
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return f53829d.get(this) & lf1.f57427G;
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            yu1<E> yu1VarFindSegmentReceive = (yu1) f53825F.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            int i = lf1.f57431b;
            long j = receiversCounter$kotlinx_coroutines_core / ((long) i);
            if (yu1VarFindSegmentReceive.f82931c == j || (yu1VarFindSegmentReceive = findSegmentReceive(j, yu1VarFindSegmentReceive)) != null) {
                yu1VarFindSegmentReceive.cleanPrev();
                if (isCellNonEmpty(yu1VarFindSegmentReceive, (int) (receiversCounter$kotlinx_coroutines_core % ((long) i)), receiversCounter$kotlinx_coroutines_core)) {
                    return true;
                }
                f53830e.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, 1 + receiversCounter$kotlinx_coroutines_core);
            } else if (((yu1) f53825F.get(this)).f82931c < j) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean mo14700i() {
        return false;
    }

    @Override // p000.nye
    public void invokeOnClose(@yfb qy6<? super Throwable, bth> qy6Var) {
        if (C0051a4.m134a(f53828M, this, null, qy6Var)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f53828M;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != lf1.f57454y) {
                if (obj == lf1.f57455z) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!C0051a4.m134a(f53828M, this, lf1.f57454y, lf1.f57455z));
        qy6Var.invoke(m14698f());
    }

    @Override // p000.hsd
    public boolean isClosedForReceive() {
        return isClosedForReceive0(f53829d.get(this));
    }

    @Override // p000.nye
    public boolean isClosedForSend() {
        return isClosedForSend0(f53829d.get(this));
    }

    @Override // p000.hsd
    public boolean isEmpty() {
        if (isClosedForReceive() || hasElements$kotlinx_coroutines_core()) {
            return false;
        }
        return !isClosedForReceive();
    }

    @Override // p000.hsd
    @yfb
    public mu1<E> iterator() {
        return new C8324a();
    }

    /* JADX INFO: renamed from: j */
    public void m14701j() {
    }

    /* JADX INFO: renamed from: k */
    public void m14702k() {
    }

    /* JADX INFO: renamed from: l */
    public void m14703l() {
    }

    @Override // p000.nye
    @q64(level = u64.f86866b, message = "Deprecated in the favour of 'trySend' method", replaceWith = @i2e(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return au1.C1610a.offer(this, e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        r14.selectInRegistrationPhase(p000.bth.f14751a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo14704p(@p000.yfb p000.pve<?> r14, @p000.gib java.lang.Object r15) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$volatile$FU()
            java.lang.Object r0 = r0.get(r13)
            yu1 r0 = (p000.yu1) r0
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getSendersAndCloseStatus$volatile$FU()
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r3 = r3 & r1
            boolean r1 = access$isClosedForSend0(r13, r1)
            int r2 = p000.lf1.f57431b
            long r5 = (long) r2
            long r5 = r3 / r5
            long r7 = (long) r2
            long r7 = r3 % r7
            int r2 = (int) r7
            long r7 = r0.f82931c
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L39
            yu1 r5 = access$findSegmentSend(r13, r5, r0)
            if (r5 != 0) goto L38
            if (r1 == 0) goto La
        L33:
            r13.onClosedSelectOnSend(r15, r14)
            goto L8c
        L38:
            r0 = r5
        L39:
            r5 = r13
            r6 = r0
            r7 = r2
            r8 = r15
            r9 = r3
            r11 = r14
            r12 = r1
            int r5 = access$updateCellSend(r5, r6, r7, r8, r9, r11, r12)
            if (r5 == 0) goto L88
            r6 = 1
            if (r5 == r6) goto L82
            r6 = 2
            if (r5 == r6) goto L6e
            r1 = 3
            if (r5 == r1) goto L66
            r1 = 4
            if (r5 == r1) goto L5a
            r1 = 5
            if (r5 == r1) goto L56
            goto La
        L56:
            r0.cleanPrev()
            goto La
        L5a:
            long r1 = r13.getReceiversCounter$kotlinx_coroutines_core()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L33
            r0.cleanPrev()
            goto L33
        L66:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            r14.<init>(r15)
            throw r14
        L6e:
            if (r1 == 0) goto L74
            r0.onSlotCleaned()
            goto L33
        L74:
            boolean r15 = r14 instanceof p000.wgi
            if (r15 == 0) goto L7b
            wgi r14 = (p000.wgi) r14
            goto L7c
        L7b:
            r14 = 0
        L7c:
            if (r14 == 0) goto L8c
            access$prepareSenderForSuspension(r13, r14, r0, r2)
            goto L8c
        L82:
            bth r15 = p000.bth.f14751a
            r14.selectInRegistrationPhase(r15)
            goto L8c
        L88:
            r0.cleanPrev()
            goto L82
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf1.mo14704p(pve, java.lang.Object):void");
    }

    @Override // p000.hsd
    @gib
    @q64(level = u64.f86866b, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @i2e(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return (E) au1.C1610a.poll(this);
    }

    @Override // p000.hsd
    @gib
    public Object receive(@yfb zy2<? super E> zy2Var) {
        return m14688m(this, zy2Var);
    }

    @Override // p000.hsd
    @gib
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    public Object mo28703receiveCatchingJP2dKIU(@yfb zy2<? super xu1<? extends E>> zy2Var) {
        return m14689n(this, zy2Var);
    }

    @Override // p000.hsd
    @gib
    @ip9
    @q64(level = u64.f86866b, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @i2e(expression = "receiveCatching().getOrNull()", imports = {}))
    public Object receiveOrNull(@yfb zy2<? super E> zy2Var) {
        return au1.C1610a.receiveOrNull(this, zy2Var);
    }

    @Override // p000.nye
    @gib
    public Object send(E e, @yfb zy2<? super bth> zy2Var) {
        return m14693q(this, e, zy2Var);
    }

    @gib
    public Object sendBroadcast$kotlinx_coroutines_core(E e, @yfb zy2<? super Boolean> zy2Var) {
        return m14694r(this, e, zy2Var);
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return shouldSendSuspend(f53829d.get(this));
    }

    @yfb
    /* JADX INFO: renamed from: t */
    public final Object m14705t(E e) {
        yu1 yu1Var;
        Object obj = lf1.f57435f;
        yu1 yu1Var2 = (yu1) f53824C.get(this);
        while (true) {
            long andIncrement = f53829d.getAndIncrement(this);
            long j = andIncrement & lf1.f57427G;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i = lf1.f57431b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (yu1Var2.f82931c != j2) {
                yu1 yu1VarFindSegmentSend = findSegmentSend(j2, yu1Var2);
                if (yu1VarFindSegmentSend != null) {
                    yu1Var = yu1VarFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return xu1.f99332b.m33285closedJP2dKIU(m14699g());
                }
            } else {
                yu1Var = yu1Var2;
            }
            int iUpdateCellSend = updateCellSend(yu1Var, i2, e, j, obj, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                yu1Var.cleanPrev();
                return xu1.f99332b.m33287successJP2dKIU(bth.f14751a);
            }
            if (iUpdateCellSend == 1) {
                return xu1.f99332b.m33287successJP2dKIU(bth.f14751a);
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    yu1Var.onSlotCleaned();
                    return xu1.f99332b.m33285closedJP2dKIU(m14699g());
                }
                wgi wgiVar = obj instanceof wgi ? (wgi) obj : null;
                if (wgiVar != null) {
                    prepareSenderForSuspension(wgiVar, yu1Var, i2);
                }
                m14697e((yu1Var.f82931c * ((long) i)) + ((long) i2));
                return xu1.f99332b.m33287successJP2dKIU(bth.f14751a);
            }
            if (iUpdateCellSend == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iUpdateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    yu1Var.cleanPrev();
                }
                return xu1.f99332b.m33285closedJP2dKIU(m14699g());
            }
            if (iUpdateCellSend == 5) {
                yu1Var.cleanPrev();
            }
            yu1Var2 = yu1Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d7, code lost:
    
        r3 = (p000.yu1) r3.getNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01de, code lost:
    
        if (r3 != null) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @p000.yfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf1.toString():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public final String toStringDebug$kotlinx_coroutines_core() {
        String strValueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("S=" + getSendersCounter$kotlinx_coroutines_core() + ",R=" + getReceiversCounter$kotlinx_coroutines_core() + ",B=" + getBufferEndCounter() + ",B'=" + f53832m.get(this) + ",C=" + ((int) (f53829d.get(this) >> 60)) + C4584d2.f28238g);
        int i = (int) (f53829d.get(this) >> 60);
        if (i == 1) {
            sb.append("CANCELLATION_STARTED,");
        } else if (i == 2) {
            sb.append("CLOSED,");
        } else if (i == 3) {
            sb.append("CANCELLED,");
        }
        sb.append("SEND_SEGM=" + kk3.getHexAddress(f53824C.get(this)) + ",RCV_SEGM=" + kk3.getHexAddress(f53825F.get(this)));
        if (!isRendezvousOrUnlimited()) {
            sb.append(",EB_SEGM=" + kk3.getHexAddress(f53826H.get(this)));
        }
        sb.append(a77.C0077a.f542d);
        List listListOf = l82.listOf((Object[]) new yu1[]{f53825F.get(this), f53824C.get(this), f53826H.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((yu1) obj) != lf1.f57430a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((yu1) next).f82931c;
            do {
                Object next2 = it.next();
                long j2 = ((yu1) next2).f82931c;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        yu1 yu1Var = (yu1) next;
        do {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(kk3.getHexAddress(yu1Var));
            sb2.append("=[");
            sb2.append(yu1Var.isRemoved() ? "*" : "");
            sb2.append(yu1Var.f82931c);
            sb2.append(",prev=");
            yu1 yu1Var2 = (yu1) yu1Var.getPrev();
            sb2.append(yu1Var2 != null ? kk3.getHexAddress(yu1Var2) : null);
            sb2.append(C4584d2.f28238g);
            sb.append(sb2.toString());
            int i2 = lf1.f57431b;
            for (int i3 = 0; i3 < i2; i3++) {
                Object state$kotlinx_coroutines_core = yu1Var.getState$kotlinx_coroutines_core(i3);
                Object element$kotlinx_coroutines_core = yu1Var.getElement$kotlinx_coroutines_core(i3);
                if (state$kotlinx_coroutines_core instanceof dq1) {
                    strValueOf = "cont";
                } else if (state$kotlinx_coroutines_core instanceof pve) {
                    strValueOf = "select";
                } else if (state$kotlinx_coroutines_core instanceof gsd) {
                    strValueOf = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof C8325b) {
                    strValueOf = "send(broadcast)";
                } else if (state$kotlinx_coroutines_core instanceof xgi) {
                    strValueOf = "EB(" + state$kotlinx_coroutines_core + ')';
                } else {
                    strValueOf = String.valueOf(state$kotlinx_coroutines_core);
                }
                sb.append(C4584d2.f28242k + i3 + "]=(" + strValueOf + C4584d2.f28238g + element$kotlinx_coroutines_core + "),");
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("next=");
            yu1 yu1Var3 = (yu1) yu1Var.getNext();
            sb3.append(yu1Var3 != null ? kk3.getHexAddress(yu1Var3) : null);
            sb3.append("]  ");
            sb.append(sb3.toString());
            yu1Var = (yu1) yu1Var.getNext();
        } while (yu1Var != null);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.hsd
    @yfb
    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    public Object mo28704tryReceivePtdJZtk() {
        yu1 yu1Var;
        long j = f53830e.get(this);
        long j2 = f53829d.get(this);
        if (isClosedForReceive0(j2)) {
            return xu1.f99332b.m33285closedJP2dKIU(m14698f());
        }
        if (j >= (j2 & lf1.f57427G)) {
            return xu1.f99332b.m33286failurePtdJZtk();
        }
        Object obj = lf1.f57442m;
        yu1 yu1Var2 = (yu1) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i = lf1.f57431b;
            long j3 = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (yu1Var2.f82931c != j3) {
                yu1 yu1VarFindSegmentReceive = findSegmentReceive(j3, yu1Var2);
                if (yu1VarFindSegmentReceive == null) {
                    continue;
                } else {
                    yu1Var = yu1VarFindSegmentReceive;
                }
            } else {
                yu1Var = yu1Var2;
            }
            Object objUpdateCellReceive = updateCellReceive(yu1Var, i2, andIncrement, obj);
            if (objUpdateCellReceive == lf1.f57444o) {
                wgi wgiVar = obj instanceof wgi ? (wgi) obj : null;
                if (wgiVar != null) {
                    prepareReceiverForSuspension(wgiVar, yu1Var, i2);
                }
                waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                yu1Var.onSlotCleaned();
                return xu1.f99332b.m33286failurePtdJZtk();
            }
            if (objUpdateCellReceive != lf1.f57446q) {
                if (objUpdateCellReceive == lf1.f57445p) {
                    throw new IllegalStateException("unexpected");
                }
                yu1Var.cleanPrev();
                return xu1.f99332b.m33287successJP2dKIU(objUpdateCellReceive);
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                yu1Var.cleanPrev();
            }
            yu1Var2 = yu1Var;
        }
        return xu1.f99332b.m33285closedJP2dKIU(m14698f());
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return p000.xu1.f99332b.m33287successJP2dKIU(p000.bth.f14751a);
     */
    @Override // p000.nye
    @p000.yfb
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo28705trySendJP2dKIU(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getSendersAndCloseStatus$volatile$FU()
            long r0 = r0.get(r14)
            boolean r0 = r14.shouldSendSuspend(r0)
            if (r0 == 0) goto L15
            xu1$b r15 = p000.xu1.f99332b
            java.lang.Object r15 = r15.m33286failurePtdJZtk()
            return r15
        L15:
            qhg r8 = p000.lf1.access$getINTERRUPTED_SEND$p()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$volatile$FU()
            java.lang.Object r0 = r0.get(r14)
            yu1 r0 = (p000.yu1) r0
        L23:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getSendersAndCloseStatus$volatile$FU()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = access$isClosedForSend0(r14, r1)
            int r1 = p000.lf1.f57431b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f82931c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L5b
            yu1 r1 = access$findSegmentSend(r14, r2, r0)
            if (r1 != 0) goto L59
            if (r11 == 0) goto L23
        L4d:
            xu1$b r15 = p000.xu1.f99332b
            java.lang.Throwable r0 = r14.m14699g()
            java.lang.Object r15 = r15.m33285closedJP2dKIU(r0)
            goto Lbc
        L59:
            r13 = r1
            goto L5c
        L5b:
            r13 = r0
        L5c:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb8
            r1 = 1
            if (r0 == r1) goto Laf
            r1 = 2
            if (r0 == r1) goto L92
            r1 = 3
            if (r0 == r1) goto L8a
            r1 = 4
            if (r0 == r1) goto L7e
            r1 = 5
            if (r0 == r1) goto L79
            goto L7c
        L79:
            r13.cleanPrev()
        L7c:
            r0 = r13
            goto L23
        L7e:
            long r0 = r14.getReceiversCounter$kotlinx_coroutines_core()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L4d
            r13.cleanPrev()
            goto L4d
        L8a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r15.<init>(r0)
            throw r15
        L92:
            if (r11 == 0) goto L98
            r13.onSlotCleaned()
            goto L4d
        L98:
            boolean r15 = r8 instanceof p000.wgi
            if (r15 == 0) goto L9f
            wgi r8 = (p000.wgi) r8
            goto La0
        L9f:
            r8 = 0
        La0:
            if (r8 == 0) goto La5
            access$prepareSenderForSuspension(r14, r8, r13, r12)
        La5:
            r13.onSlotCleaned()
            xu1$b r15 = p000.xu1.f99332b
            java.lang.Object r15 = r15.m33286failurePtdJZtk()
            goto Lbc
        Laf:
            xu1$b r15 = p000.xu1.f99332b
            bth r0 = p000.bth.f14751a
            java.lang.Object r15 = r15.m33287successJP2dKIU(r0)
            goto Lbc
        Lb8:
            r13.cleanPrev()
            goto Laf
        Lbc:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf1.mo28705trySendJP2dKIU(java.lang.Object):java.lang.Object");
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long j) {
        long j2;
        long j3;
        if (isRendezvousOrUnlimited()) {
            return;
        }
        while (getBufferEndCounter() <= j) {
        }
        int i = lf1.f57432c;
        for (int i2 = 0; i2 < i; i2++) {
            long bufferEndCounter = getBufferEndCounter();
            if (bufferEndCounter == (f53832m.get(this) & 4611686018427387903L) && bufferEndCounter == getBufferEndCounter()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f53832m;
        do {
            j2 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, lf1.constructEBCompletedAndPauseFlag(j2 & 4611686018427387903L, true)));
        while (true) {
            long bufferEndCounter2 = getBufferEndCounter();
            long j4 = f53832m.get(this);
            long j5 = j4 & 4611686018427387903L;
            boolean z = (4611686018427387904L & j4) != 0;
            if (bufferEndCounter2 == j5 && bufferEndCounter2 == getBufferEndCounter()) {
                break;
            } else if (!z) {
                f53832m.compareAndSet(this, j4, lf1.constructEBCompletedAndPauseFlag(j5, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f53832m;
        do {
            j3 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, lf1.constructEBCompletedAndPauseFlag(j3 & 4611686018427387903L, false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final to8<bth> bindCancellationFun(qy6<? super E, bth> qy6Var) {
        return new C8326c(this);
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, qy6<Object, bth> qy6Var) {
        while (true) {
            qy6Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @Override // p000.hsd
    public final void cancel() {
        cancelImpl$kotlinx_coroutines_core(null);
    }

    @Override // p000.hsd
    public final void cancel(@gib CancellationException cancellationException) {
        cancelImpl$kotlinx_coroutines_core(cancellationException);
    }

    public /* synthetic */ kf1(int i, qy6 qy6Var, int i2, jt3 jt3Var) {
        this(i, (i2 & 2) != 0 ? null : qy6Var);
    }
}
