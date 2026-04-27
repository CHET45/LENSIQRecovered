package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import java.util.concurrent.CancellationException;
import p000.v7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,438:1\n314#2,11:439\n1#3:450\n106#4,2:451\n108#4:464\n492#5,11:453\n*S KotlinDebug\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n*L\n130#1:439,11\n334#1:451,2\n334#1:464\n334#1:453,11\n*E\n"})
@e0g(parameters = 0)
public final class qv2 extends InterfaceC0701e.d implements qd1, iv8, mn2 {

    /* JADX INFO: renamed from: f2 */
    public static final int f75858f2 = 8;

    /* JADX INFO: renamed from: M1 */
    @gib
    public sd1 f75859M1;

    /* JADX INFO: renamed from: V1 */
    public final boolean f75860V1;

    /* JADX INFO: renamed from: X */
    @yfb
    public t7c f75861X;

    /* JADX INFO: renamed from: Y */
    @yfb
    public final fse f75862Y;

    /* JADX INFO: renamed from: Z */
    public boolean f75863Z;

    /* JADX INFO: renamed from: a2 */
    @gib
    public mv8 f75865a2;

    /* JADX INFO: renamed from: b2 */
    @gib
    public rud f75866b2;

    /* JADX INFO: renamed from: c2 */
    public boolean f75867c2;

    /* JADX INFO: renamed from: e2 */
    public boolean f75869e2;

    /* JADX INFO: renamed from: Z1 */
    @yfb
    public final ld1 f75864Z1 = new ld1();

    /* JADX INFO: renamed from: d2 */
    public long f75868d2 = r78.f77324b.m32092getZeroYbymL2g();

    /* JADX INFO: renamed from: qv2$a */
    @dwf({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,438:1\n1#2:439\n*E\n"})
    @e0g(parameters = 0)
    public static final class C11708a {

        /* JADX INFO: renamed from: c */
        public static final int f75870c = 8;

        /* JADX INFO: renamed from: a */
        @yfb
        public final ny6<rud> f75871a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final dq1<bth> f75872b;

        /* JADX WARN: Multi-variable type inference failed */
        public C11708a(@yfb ny6<rud> ny6Var, @yfb dq1<? super bth> dq1Var) {
            this.f75871a = ny6Var;
            this.f75872b = dq1Var;
        }

        @yfb
        public final dq1<bth> getContinuation() {
            return this.f75872b;
        }

        @yfb
        public final ny6<rud> getCurrentBounds() {
            return this.f75871a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
        @p000.yfb
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r4 = this;
                dq1<bth> r0 = r4.f75872b
                e13 r0 = r0.getContext()
                u13$a r1 = p000.u13.f86542c
                e13$b r0 = r0.get(r1)
                u13 r0 = (p000.u13) r0
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.getName()
                goto L16
            L15:
                r0 = 0
            L16:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = p000.tw1.checkRadix(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(this, checkRadix(radix))"
                p000.md8.checkNotNullExpressionValue(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L50
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L52
            L50:
                java.lang.String r0 = "("
            L52:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                ny6<rud> r0 = r4.f75871a
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                dq1<bth> r0 = r4.f75872b
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.qv2.C11708a.toString():java.lang.String");
        }
    }

    /* JADX INFO: renamed from: qv2$b */
    public /* synthetic */ class C11709b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f75873a;

        static {
            int[] iArr = new int[t7c.values().length];
            try {
                iArr[t7c.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t7c.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f75873a = iArr;
        }
    }

    /* JADX INFO: renamed from: qv2$c */
    @ck3(m4009c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", m4010f = "ContentInViewNode.kt", m4011i = {}, m4012l = {nb2.f63872t}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11710c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f75874a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f75875b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ cwh f75877d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ sd1 f75878e;

        /* JADX INFO: renamed from: qv2$c$a */
        @ck3(m4009c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", m4010f = "ContentInViewNode.kt", m4011i = {}, m4012l = {201}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<nab, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f75879a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f75880b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ cwh f75881c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ qv2 f75882d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ sd1 f75883e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ jj8 f75884f;

            /* JADX INFO: renamed from: qv2$c$a$a, reason: collision with other inner class name */
            public static final class C16507a extends tt8 implements qy6<Float, bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ qv2 f75885a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ cwh f75886b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ jj8 f75887c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ nab f75888d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16507a(qv2 qv2Var, cwh cwhVar, jj8 jj8Var, nab nabVar) {
                    super(1);
                    this.f75885a = qv2Var;
                    this.f75886b = cwhVar;
                    this.f75887c = jj8Var;
                    this.f75888d = nabVar;
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(Float f) {
                    invoke(f.floatValue());
                    return bth.f14751a;
                }

                public final void invoke(float f) {
                    float f2 = this.f75885a.f75863Z ? 1.0f : -1.0f;
                    fse fseVar = this.f75885a.f75862Y;
                    float fM29654toFloatk4lQ0M = f2 * fseVar.m29654toFloatk4lQ0M(fseVar.m29652reverseIfNeededMKHz9U(this.f75888d.mo29656scrollByOzD1aCk(fseVar.m29652reverseIfNeededMKHz9U(fseVar.m29655toOffsettuRUvjQ(f2 * f)), oab.f66990b.m31323getUserInputWNlRxjI())));
                    if (Math.abs(fM29654toFloatk4lQ0M) < Math.abs(f)) {
                        qj8.cancel$default(this.f75887c, "Scroll animation cancelled because scroll was not consumed (" + fM29654toFloatk4lQ0M + " < " + f + ')', null, 2, null);
                    }
                }
            }

            /* JADX INFO: renamed from: qv2$c$a$b */
            @dwf({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$launchAnimation$2$1$2\n+ 2 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,438:1\n118#2,4:439\n123#2,4:444\n48#3:443\n*S KotlinDebug\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$launchAnimation$2$1$2\n*L\n244#1:439,4\n244#1:444,4\n244#1:443\n*E\n"})
            public static final class b extends tt8 implements ny6<bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ qv2 f75889a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ cwh f75890b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ sd1 f75891c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(qv2 qv2Var, cwh cwhVar, sd1 sd1Var) {
                    super(0);
                    this.f75889a = qv2Var;
                    this.f75890b = cwhVar;
                    this.f75891c = sd1Var;
                }

                @Override // p000.ny6
                public /* bridge */ /* synthetic */ bth invoke() {
                    invoke2();
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ld1 ld1Var = this.f75889a.f75864Z1;
                    qv2 qv2Var = this.f75889a;
                    while (true) {
                        if (!ld1Var.f57225a.isNotEmpty()) {
                            break;
                        }
                        rud rudVarInvoke = ((C11708a) ld1Var.f57225a.last()).getCurrentBounds().invoke();
                        if (!(rudVarInvoke == null ? true : qv2.m20670a(qv2Var, rudVarInvoke, 0L, 1, null))) {
                            break;
                        }
                        dq1<bth> continuation = ((C11708a) ld1Var.f57225a.removeAt(ld1Var.f57225a.getSize() - 1)).getContinuation();
                        bth bthVar = bth.f14751a;
                        v7e.C13927a c13927a = v7e.f90266b;
                        continuation.resumeWith(v7e.m32723constructorimpl(bthVar));
                    }
                    if (this.f75889a.f75867c2) {
                        rud focusedChildBounds = this.f75889a.getFocusedChildBounds();
                        if (focusedChildBounds != null && qv2.m20670a(this.f75889a, focusedChildBounds, 0L, 1, null)) {
                            this.f75889a.f75867c2 = false;
                        }
                    }
                    this.f75890b.setValue(this.f75889a.calculateScrollDelta(this.f75891c));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(cwh cwhVar, qv2 qv2Var, sd1 sd1Var, jj8 jj8Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f75881c = cwhVar;
                this.f75882d = qv2Var;
                this.f75883e = sd1Var;
                this.f75884f = jj8Var;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f75881c, this.f75882d, this.f75883e, this.f75884f, zy2Var);
                aVar.f75880b = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb nab nabVar, @gib zy2<? super bth> zy2Var) {
                return ((a) create(nabVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f75879a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    nab nabVar = (nab) this.f75880b;
                    this.f75881c.setValue(this.f75882d.calculateScrollDelta(this.f75883e));
                    cwh cwhVar = this.f75881c;
                    C16507a c16507a = new C16507a(this.f75882d, cwhVar, this.f75884f, nabVar);
                    b bVar = new b(this.f75882d, this.f75881c, this.f75883e);
                    this.f75879a = 1;
                    if (cwhVar.animateToZero(c16507a, bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11710c(cwh cwhVar, sd1 sd1Var, zy2<? super C11710c> zy2Var) {
            super(2, zy2Var);
            this.f75877d = cwhVar;
            this.f75878e = sd1Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C11710c c11710c = qv2.this.new C11710c(this.f75877d, this.f75878e, zy2Var);
            c11710c.f75875b = obj;
            return c11710c;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C11710c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f75874a;
            try {
                try {
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        jj8 job = oj8.getJob(((x13) this.f75875b).getCoroutineContext());
                        qv2.this.f75869e2 = true;
                        fse fseVar = qv2.this.f75862Y;
                        j7b j7bVar = j7b.Default;
                        a aVar = new a(this.f75877d, qv2.this, this.f75878e, job, null);
                        this.f75874a = 1;
                        if (fseVar.scroll(j7bVar, aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                    }
                    qv2.this.f75864Z1.resumeAndRemoveAll();
                    qv2.this.f75869e2 = false;
                    qv2.this.f75864Z1.cancelAndRemoveAll(null);
                    qv2.this.f75867c2 = false;
                    return bth.f14751a;
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Throwable th) {
                qv2.this.f75869e2 = false;
                qv2.this.f75864Z1.cancelAndRemoveAll(null);
                qv2.this.f75867c2 = false;
                throw th;
            }
        }
    }

    public qv2(@yfb t7c t7cVar, @yfb fse fseVar, boolean z, @gib sd1 sd1Var) {
        this.f75861X = t7cVar;
        this.f75862Y = fseVar;
        this.f75863Z = z;
        this.f75859M1 = sd1Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m20670a(qv2 qv2Var, rud rudVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = qv2Var.f75868d2;
        }
        return qv2Var.m32029isMaxVisibleO0kMr_c(rudVar, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateScrollDelta(sd1 sd1Var) {
        if (r78.m32085equalsimpl0(this.f75868d2, r78.f77324b.m32092getZeroYbymL2g())) {
            return 0.0f;
        }
        rud rudVarFindBringIntoViewRequest = findBringIntoViewRequest();
        if (rudVarFindBringIntoViewRequest == null) {
            rudVarFindBringIntoViewRequest = this.f75867c2 ? getFocusedChildBounds() : null;
            if (rudVarFindBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long jM32288toSizeozmzZPI = s78.m32288toSizeozmzZPI(this.f75868d2);
        int i = C11709b.f75873a[this.f75861X.ordinal()];
        if (i == 1) {
            return sd1Var.calculateScrollDistance(rudVarFindBringIntoViewRequest.getTop(), rudVarFindBringIntoViewRequest.getBottom() - rudVarFindBringIntoViewRequest.getTop(), wpf.m33066getHeightimpl(jM32288toSizeozmzZPI));
        }
        if (i == 2) {
            return sd1Var.calculateScrollDistance(rudVarFindBringIntoViewRequest.getLeft(), rudVarFindBringIntoViewRequest.getRight() - rudVarFindBringIntoViewRequest.getLeft(), wpf.m33069getWidthimpl(jM32288toSizeozmzZPI));
        }
        throw new ceb();
    }

    /* JADX INFO: renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m32026compareToTemP2vQ(long j, long j2) {
        int i = C11709b.f75873a[this.f75861X.ordinal()];
        if (i == 1) {
            return md8.compare(r78.m32086getHeightimpl(j), r78.m32086getHeightimpl(j2));
        }
        if (i == 2) {
            return md8.compare(r78.m32087getWidthimpl(j), r78.m32087getWidthimpl(j2));
        }
        throw new ceb();
    }

    /* JADX INFO: renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m32027compareToiLBOSCw(long j, long j2) {
        int i = C11709b.f75873a[this.f75861X.ordinal()];
        if (i == 1) {
            return Float.compare(wpf.m33066getHeightimpl(j), wpf.m33066getHeightimpl(j2));
        }
        if (i == 2) {
            return Float.compare(wpf.m33069getWidthimpl(j), wpf.m33069getWidthimpl(j2));
        }
        throw new ceb();
    }

    /* JADX INFO: renamed from: computeDestination-O0kMr_c, reason: not valid java name */
    private final rud m32028computeDestinationO0kMr_c(rud rudVar, long j) {
        return rudVar.m32210translatek4lQ0M(izb.m30438unaryMinusF1C5BW0(m32030relocationOffsetBMxPBkI(rudVar, j)));
    }

    private final rud findBringIntoViewRequest() {
        f7b f7bVar = this.f75864Z1.f57225a;
        int size = f7bVar.getSize();
        rud rudVar = null;
        if (size > 0) {
            int i = size - 1;
            Object[] content = f7bVar.getContent();
            do {
                rud rudVarInvoke = ((C11708a) content[i]).getCurrentBounds().invoke();
                if (rudVarInvoke != null) {
                    if (m32027compareToiLBOSCw(rudVarInvoke.m32206getSizeNHjbRc(), s78.m32288toSizeozmzZPI(this.f75868d2)) > 0) {
                        return rudVar == null ? rudVarInvoke : rudVar;
                    }
                    rudVar = rudVarInvoke;
                }
                i--;
            } while (i >= 0);
        }
        return rudVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rud getFocusedChildBounds() {
        if (!isAttached()) {
            return null;
        }
        mv8 mv8VarRequireLayoutCoordinates = w34.requireLayoutCoordinates(this);
        mv8 mv8Var = this.f75865a2;
        if (mv8Var != null) {
            if (!mv8Var.isAttached()) {
                mv8Var = null;
            }
            if (mv8Var != null) {
                return mv8VarRequireLayoutCoordinates.localBoundingBoxOf(mv8Var, false);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: isMaxVisible-O0kMr_c, reason: not valid java name */
    private final boolean m32029isMaxVisibleO0kMr_c(rud rudVar, long j) {
        long jM32030relocationOffsetBMxPBkI = m32030relocationOffsetBMxPBkI(rudVar, j);
        return Math.abs(izb.m30429getXimpl(jM32030relocationOffsetBMxPBkI)) <= 0.5f && Math.abs(izb.m30430getYimpl(jM32030relocationOffsetBMxPBkI)) <= 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        sd1 sd1VarRequireBringIntoViewSpec = requireBringIntoViewSpec();
        if (this.f75869e2) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        fg1.launch$default(getCoroutineScope(), null, b23.f12444d, new C11710c(new cwh(sd1VarRequireBringIntoViewSpec.getScrollAnimationSpec()), sd1VarRequireBringIntoViewSpec, null), 1, null);
    }

    /* JADX INFO: renamed from: relocationOffset-BMxPBkI, reason: not valid java name */
    private final long m32030relocationOffsetBMxPBkI(rud rudVar, long j) {
        long jM32288toSizeozmzZPI = s78.m32288toSizeozmzZPI(j);
        int i = C11709b.f75873a[this.f75861X.ordinal()];
        if (i == 1) {
            return mzb.Offset(0.0f, requireBringIntoViewSpec().calculateScrollDistance(rudVar.getTop(), rudVar.getBottom() - rudVar.getTop(), wpf.m33066getHeightimpl(jM32288toSizeozmzZPI)));
        }
        if (i == 2) {
            return mzb.Offset(requireBringIntoViewSpec().calculateScrollDistance(rudVar.getLeft(), rudVar.getRight() - rudVar.getLeft(), wpf.m33069getWidthimpl(jM32288toSizeozmzZPI)), 0.0f);
        }
        throw new ceb();
    }

    private final sd1 requireBringIntoViewSpec() {
        sd1 sd1Var = this.f75859M1;
        return sd1Var == null ? (sd1) nn2.currentValueOf(this, td1.getLocalBringIntoViewSpec()) : sd1Var;
    }

    @Override // p000.qd1
    @gib
    public Object bringChildIntoView(@yfb ny6<rud> ny6Var, @yfb zy2<? super bth> zy2Var) {
        rud rudVarInvoke = ny6Var.invoke();
        if (rudVarInvoke == null || m20670a(this, rudVarInvoke, 0L, 1, null)) {
            return bth.f14751a;
        }
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        if (this.f75864Z1.enqueue(new C11708a(ny6Var, fq1Var)) && !this.f75869e2) {
            launchAnimation();
        }
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    @Override // p000.qd1
    @yfb
    public rud calculateRectForParent(@yfb rud rudVar) {
        if (r78.m32085equalsimpl0(this.f75868d2, r78.f77324b.m32092getZeroYbymL2g())) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return m32028computeDestinationO0kMr_c(rudVar, this.f75868d2);
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public boolean getShouldAutoInvalidate() {
        return this.f75860V1;
    }

    /* JADX INFO: renamed from: getViewportSize-YbymL2g$foundation_release, reason: not valid java name */
    public final long m32031getViewportSizeYbymL2g$foundation_release() {
        return this.f75868d2;
    }

    public final void onFocusBoundsChanged(@gib mv8 mv8Var) {
        this.f75865a2 = mv8Var;
    }

    @Override // p000.iv8
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public void mo27780onRemeasuredozmzZPI(long j) {
        rud focusedChildBounds;
        long j2 = this.f75868d2;
        this.f75868d2 = j;
        if (m32026compareToTemP2vQ(j, j2) < 0 && (focusedChildBounds = getFocusedChildBounds()) != null) {
            rud rudVar = this.f75866b2;
            if (rudVar == null) {
                rudVar = focusedChildBounds;
            }
            if (!this.f75869e2 && !this.f75867c2 && m32029isMaxVisibleO0kMr_c(rudVar, j2) && !m32029isMaxVisibleO0kMr_c(focusedChildBounds, j)) {
                this.f75867c2 = true;
                launchAnimation();
            }
            this.f75866b2 = focusedChildBounds;
        }
    }

    public final void update(@yfb t7c t7cVar, boolean z, @gib sd1 sd1Var) {
        this.f75861X = t7cVar;
        this.f75863Z = z;
        this.f75859M1 = sd1Var;
    }
}
