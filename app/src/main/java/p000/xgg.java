package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import p000.v7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,831:1\n573#1:862\n574#1:864\n576#1,4:866\n582#1:881\n585#1,3:893\n1208#2:832\n1187#2,2:833\n1208#2:835\n1187#2,2:836\n36#3:838\n36#3:863\n36#3:935\n146#4:839\n460#4,11:840\n492#4,11:851\n146#4:865\n460#4,11:870\n492#4,11:882\n728#4,2:936\n86#5,2:896\n33#5,6:898\n88#5:904\n86#5,2:905\n33#5,6:907\n88#5:913\n416#5,3:914\n33#5,4:917\n419#5:921\n420#5:923\n38#5:924\n421#5:925\n1#6:922\n314#7,9:926\n323#7,2:938\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n*L\n597#1:862\n597#1:864\n597#1:866,4\n597#1:881\n597#1:893,3\n489#1:832\n489#1:833,2\n498#1:835\n498#1:836,2\n573#1:838\n597#1:863\n665#1:935\n574#1:839\n579#1:840,11\n582#1:851,11\n597#1:865\n597#1:870,11\n597#1:882,11\n666#1:936,2\n623#1:896,2\n623#1:898,6\n623#1:904\n633#1:905,2\n633#1:907,6\n633#1:913\n636#1:914,3\n636#1:917,4\n636#1:921\n636#1:923\n636#1:924\n636#1:925\n636#1:922\n663#1:926,9\n663#1:938,2\n*E\n"})
@e0g(parameters = 1)
public final class xgg extends InterfaceC0701e.d implements wgg, s2d, c64 {

    /* JADX INFO: renamed from: f2 */
    public static final int f97736f2 = 0;

    /* JADX INFO: renamed from: M1 */
    @yfb
    public gz6<? super s2d, ? super zy2<? super bth>, ? extends Object> f97737M1;

    /* JADX INFO: renamed from: V1 */
    @gib
    public jj8 f97738V1;

    /* JADX INFO: renamed from: X */
    @gib
    public Object f97739X;

    /* JADX INFO: renamed from: Y */
    @gib
    public Object f97740Y;

    /* JADX INFO: renamed from: Z */
    @gib
    public Object[] f97741Z;

    /* JADX INFO: renamed from: Z1 */
    @yfb
    public t1d f97742Z1;

    /* JADX INFO: renamed from: a2 */
    @yfb
    public final f7b<C15059a<?>> f97743a2;

    /* JADX INFO: renamed from: b2 */
    @yfb
    public final f7b<C15059a<?>> f97744b2;

    /* JADX INFO: renamed from: c2 */
    @gib
    public t1d f97745c2;

    /* JADX INFO: renamed from: d2 */
    public long f97746d2;

    /* JADX INFO: renamed from: e2 */
    public boolean f97747e2;

    /* JADX INFO: renamed from: xgg$a */
    @dwf({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,831:1\n36#2:832\n735#3,2:833\n314#4,11:835\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n*L\n735#1:832\n736#1:833,2\n743#1:835,11\n*E\n"})
    public final class C15059a<R> implements gn0, c64, zy2<R> {

        /* JADX INFO: renamed from: a */
        @yfb
        public final zy2<R> f97748a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ xgg f97749b;

        /* JADX INFO: renamed from: c */
        @gib
        public dq1<? super t1d> f97750c;

        /* JADX INFO: renamed from: d */
        @yfb
        public v1d f97751d = v1d.Main;

        /* JADX INFO: renamed from: e */
        @yfb
        public final e13 f97752e = a05.f2a;

        /* JADX INFO: renamed from: xgg$a$a */
        @ck3(m4009c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", m4010f = "SuspendingPointerInputFilter.kt", m4011i = {0}, m4012l = {782}, m4013m = "withTimeout", m4014n = {"job"}, m4015s = {"L$0"})
        public static final class a<T> extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f97754a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f97755b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C15059a<R> f97756c;

            /* JADX INFO: renamed from: d */
            public int f97757d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C15059a<R> c15059a, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f97756c = c15059a;
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                this.f97755b = obj;
                this.f97757d |= Integer.MIN_VALUE;
                return this.f97756c.withTimeout(0L, null, this);
            }
        }

        /* JADX INFO: renamed from: xgg$a$b */
        @ck3(m4009c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", m4010f = "SuspendingPointerInputFilter.kt", m4011i = {}, m4012l = {774, 775}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f97758a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f97759b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C15059a<R> f97760c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j, C15059a<R> c15059a, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f97759b = j;
                this.f97760c = c15059a;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new b(this.f97759b, this.f97760c, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
            @Override // p000.tq0
            @p000.gib
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r1 = r8.f97758a
                    r2 = 1
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r5) goto L1c
                    if (r1 != r4) goto L14
                    p000.y7e.throwOnFailure(r9)
                    goto L38
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    p000.y7e.throwOnFailure(r9)
                    goto L2f
                L20:
                    p000.y7e.throwOnFailure(r9)
                    long r6 = r8.f97759b
                    long r6 = r6 - r2
                    r8.f97758a = r5
                    java.lang.Object r9 = p000.p34.delay(r6, r8)
                    if (r9 != r0) goto L2f
                    return r0
                L2f:
                    r8.f97758a = r4
                    java.lang.Object r9 = p000.p34.delay(r2, r8)
                    if (r9 != r0) goto L38
                    return r0
                L38:
                    xgg$a<R> r9 = r8.f97760c
                    dq1 r9 = p000.xgg.C15059a.access$getPointerAwaiter$p(r9)
                    if (r9 == 0) goto L54
                    v7e$a r0 = p000.v7e.f90266b
                    w1d r0 = new w1d
                    long r1 = r8.f97759b
                    r0.<init>(r1)
                    java.lang.Object r0 = p000.y7e.createFailure(r0)
                    java.lang.Object r0 = p000.v7e.m32723constructorimpl(r0)
                    r9.resumeWith(r0)
                L54:
                    bth r9 = p000.bth.f14751a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.xgg.C15059a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: xgg$a$c */
        @ck3(m4009c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", m4010f = "SuspendingPointerInputFilter.kt", m4011i = {}, m4012l = {753}, m4013m = "withTimeoutOrNull", m4014n = {}, m4015s = {})
        public static final class c<T> extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f97761a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C15059a<R> f97762b;

            /* JADX INFO: renamed from: c */
            public int f97763c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C15059a<R> c15059a, zy2<? super c> zy2Var) {
                super(zy2Var);
                this.f97762b = c15059a;
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                this.f97761a = obj;
                this.f97763c |= Integer.MIN_VALUE;
                return this.f97762b.withTimeoutOrNull(0L, null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C15059a(@yfb zy2<? super R> zy2Var) {
            this.f97748a = zy2Var;
            this.f97749b = xgg.this;
        }

        @Override // p000.gn0
        @gib
        public Object awaitPointerEvent(@yfb v1d v1dVar, @yfb zy2<? super t1d> zy2Var) {
            fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
            fq1Var.initCancellability();
            this.f97751d = v1dVar;
            this.f97750c = fq1Var;
            Object result = fq1Var.getResult();
            if (result == pd8.getCOROUTINE_SUSPENDED()) {
                jk3.probeCoroutineSuspended(zy2Var);
            }
            return result;
        }

        public final void cancel(@gib Throwable th) {
            dq1<? super t1d> dq1Var = this.f97750c;
            if (dq1Var != null) {
                dq1Var.cancel(th);
            }
            this.f97750c = null;
        }

        @Override // p000.zy2
        @yfb
        public e13 getContext() {
            return this.f97752e;
        }

        @Override // p000.gn0
        @yfb
        public t1d getCurrentEvent() {
            return xgg.this.f97742Z1;
        }

        @Override // p000.c64
        public float getDensity() {
            return this.f97749b.getDensity();
        }

        @Override // p000.gn0
        /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo29764getExtendedTouchPaddingNHjbRc() {
            return xgg.this.mo27781getExtendedTouchPaddingNHjbRc();
        }

        @Override // p000.dp6
        public float getFontScale() {
            return this.f97749b.getFontScale();
        }

        @Override // p000.gn0
        /* JADX INFO: renamed from: getSize-YbymL2g */
        public long mo29765getSizeYbymL2g() {
            return xgg.this.f97746d2;
        }

        @Override // p000.gn0
        @yfb
        public u8i getViewConfiguration() {
            return xgg.this.getViewConfiguration();
        }

        public final void offerPointerEvent(@yfb t1d t1dVar, @yfb v1d v1dVar) {
            dq1<? super t1d> dq1Var;
            if (v1dVar != this.f97751d || (dq1Var = this.f97750c) == null) {
                return;
            }
            this.f97750c = null;
            v7e.C13927a c13927a = v7e.f90266b;
            dq1Var.resumeWith(v7e.m32723constructorimpl(t1dVar));
        }

        @Override // p000.zy2
        public void resumeWith(@yfb Object obj) {
            f7b f7bVar = xgg.this.f97743a2;
            xgg xggVar = xgg.this;
            synchronized (f7bVar) {
                xggVar.f97743a2.remove(this);
                bth bthVar = bth.f14751a;
            }
            this.f97748a.resumeWith(obj);
        }

        @Override // p000.c64
        @f0g
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public int mo27166roundToPxR2X_6o(long j) {
            return this.f97749b.mo27166roundToPxR2X_6o(j);
        }

        @Override // p000.c64
        @f0g
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public int mo27167roundToPx0680j_4(float f) {
            return this.f97749b.mo27167roundToPx0680j_4(f);
        }

        @Override // p000.dp6
        @f0g
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public float mo27168toDpGaN1DYA(long j) {
            return this.f97749b.mo27168toDpGaN1DYA(j);
        }

        @Override // p000.c64
        @f0g
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo27169toDpu2uoSUM(float f) {
            return this.f97749b.mo27169toDpu2uoSUM(f);
        }

        @Override // p000.c64
        @f0g
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public long mo27171toDpSizekrfVVM(long j) {
            return this.f97749b.mo27171toDpSizekrfVVM(j);
        }

        @Override // p000.c64
        @f0g
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public float mo27172toPxR2X_6o(long j) {
            return this.f97749b.mo27172toPxR2X_6o(j);
        }

        @Override // p000.c64
        @f0g
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public float mo27173toPx0680j_4(float f) {
            return this.f97749b.mo27173toPx0680j_4(f);
        }

        @Override // p000.c64
        @f0g
        @yfb
        public rud toRect(@yfb on4 on4Var) {
            return this.f97749b.toRect(on4Var);
        }

        @Override // p000.c64
        @f0g
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public long mo27174toSizeXkaWNTQ(long j) {
            return this.f97749b.mo27174toSizeXkaWNTQ(j);
        }

        @Override // p000.dp6
        @f0g
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public long mo27175toSp0xMU5do(float f) {
            return this.f97749b.mo27175toSp0xMU5do(f);
        }

        @Override // p000.c64
        @f0g
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo27176toSpkPz2Gy4(float f) {
            return this.f97749b.mo27176toSpkPz2Gy4(f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [jj8] */
        /* JADX WARN: Type inference failed for: r11v3, types: [jj8] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // p000.gn0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object withTimeout(long r11, @p000.yfb p000.gz6<? super p000.gn0, ? super p000.zy2<? super T>, ? extends java.lang.Object> r13, @p000.yfb p000.zy2<? super T> r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof p000.xgg.C15059a.a
                if (r0 == 0) goto L13
                r0 = r14
                xgg$a$a r0 = (p000.xgg.C15059a.a) r0
                int r1 = r0.f97757d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f97757d = r1
                goto L18
            L13:
                xgg$a$a r0 = new xgg$a$a
                r0.<init>(r10, r14)
            L18:
                java.lang.Object r14 = r0.f97755b
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f97757d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r11 = r0.f97754a
                jj8 r11 = (p000.jj8) r11
                p000.y7e.throwOnFailure(r14)     // Catch: java.lang.Throwable -> L2d
                goto L75
            L2d:
                r12 = move-exception
                goto L7b
            L2f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L37:
                p000.y7e.throwOnFailure(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L56
                dq1<? super t1d> r14 = r10.f97750c
                if (r14 == 0) goto L56
                v7e$a r2 = p000.v7e.f90266b
                w1d r2 = new w1d
                r2.<init>(r11)
                java.lang.Object r2 = p000.y7e.createFailure(r2)
                java.lang.Object r2 = p000.v7e.m32723constructorimpl(r2)
                r14.resumeWith(r2)
            L56:
                xgg r14 = p000.xgg.this
                x13 r4 = r14.getCoroutineScope()
                xgg$a$b r7 = new xgg$a$b
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                jj8 r11 = p000.dg1.launch$default(r4, r5, r6, r7, r8, r9)
                r0.f97754a = r11     // Catch: java.lang.Throwable -> L2d
                r0.f97757d = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2d
                if (r14 != r1) goto L75
                return r1
            L75:
                wp1 r12 = p000.wp1.f95003a
                r11.cancel(r12)
                return r14
            L7b:
                wp1 r13 = p000.wp1.f95003a
                r11.cancel(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.xgg.C15059a.withTimeout(long, gz6, zy2):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.gn0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object withTimeoutOrNull(long r5, @p000.yfb p000.gz6<? super p000.gn0, ? super p000.zy2<? super T>, ? extends java.lang.Object> r7, @p000.yfb p000.zy2<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof p000.xgg.C15059a.c
                if (r0 == 0) goto L13
                r0 = r8
                xgg$a$c r0 = (p000.xgg.C15059a.c) r0
                int r1 = r0.f97763c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f97763c = r1
                goto L18
            L13:
                xgg$a$c r0 = new xgg$a$c
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.f97761a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f97763c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                p000.y7e.throwOnFailure(r8)     // Catch: p000.w1d -> L3d
                goto L3e
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                p000.y7e.throwOnFailure(r8)
                r0.f97763c = r3     // Catch: p000.w1d -> L3d
                java.lang.Object r8 = r4.withTimeout(r5, r7, r0)     // Catch: p000.w1d -> L3d
                if (r8 != r1) goto L3e
                return r1
            L3d:
                r8 = 0
            L3e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.xgg.C15059a.withTimeoutOrNull(long, gz6, zy2):java.lang.Object");
        }

        @Override // p000.c64
        @f0g
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo27170toDpu2uoSUM(int i) {
            return this.f97749b.mo27170toDpu2uoSUM(i);
        }

        @Override // p000.c64
        @f0g
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo27177toSpkPz2Gy4(int i) {
            return this.f97749b.mo27177toSpkPz2Gy4(i);
        }
    }

    /* JADX INFO: renamed from: xgg$b */
    public /* synthetic */ class C15060b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f97764a;

        static {
            int[] iArr = new int[v1d.values().length];
            try {
                iArr[v1d.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v1d.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v1d.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f97764a = iArr;
        }
    }

    /* JADX INFO: renamed from: xgg$c */
    public static final class C15061c extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C15059a<R> f97765a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15061c(C15059a<R> c15059a) {
            super(1);
            this.f97765a = c15059a;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            this.f97765a.cancel(th);
        }
    }

    /* JADX INFO: renamed from: xgg$d */
    @ck3(m4009c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", m4010f = "SuspendingPointerInputFilter.kt", m4011i = {}, m4012l = {616}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15062d extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f97766a;

        public C15062d(zy2<? super C15062d> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return xgg.this.new C15062d(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C15062d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f97766a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                gz6<s2d, zy2<? super bth>, Object> pointerInputHandler = xgg.this.getPointerInputHandler();
                xgg xggVar = xgg.this;
                this.f97766a = 1;
                if (pointerInputHandler.invoke(xggVar, this) == coroutine_suspended) {
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

    public /* synthetic */ xgg(Object obj, Object obj2, Object[] objArr, gz6 gz6Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : objArr, gz6Var);
    }

    private final void dispatchPointerEvent(t1d t1dVar, v1d v1dVar) {
        f7b<C15059a<?>> f7bVar;
        int size;
        synchronized (this.f97743a2) {
            f7b<C15059a<?>> f7bVar2 = this.f97744b2;
            f7bVar2.addAll(f7bVar2.getSize(), this.f97743a2);
        }
        try {
            int i = C15060b.f97764a[v1dVar.ordinal()];
            if (i == 1 || i == 2) {
                f7b<C15059a<?>> f7bVar3 = this.f97744b2;
                int size2 = f7bVar3.getSize();
                if (size2 > 0) {
                    C15059a<?>[] content = f7bVar3.getContent();
                    int i2 = 0;
                    do {
                        content[i2].offerPointerEvent(t1dVar, v1dVar);
                        i2++;
                    } while (i2 < size2);
                }
            } else if (i == 3 && (size = (f7bVar = this.f97744b2).getSize()) > 0) {
                int i3 = size - 1;
                C15059a<?>[] content2 = f7bVar.getContent();
                do {
                    content2[i3].offerPointerEvent(t1dVar, v1dVar);
                    i3--;
                } while (i3 >= 0);
            }
        } finally {
            this.f97744b2.clear();
        }
    }

    private final void forEachCurrentPointerHandler(v1d v1dVar, qy6<? super C15059a<?>, bth> qy6Var) {
        f7b<C15059a<?>> f7bVar;
        int size;
        synchronized (this.f97743a2) {
            try {
                f7b<C15059a<?>> f7bVar2 = this.f97744b2;
                f7bVar2.addAll(f7bVar2.getSize(), this.f97743a2);
                o28.finallyStart(1);
            } catch (Throwable th) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th;
            }
        }
        o28.finallyEnd(1);
        try {
            int i = C15060b.f97764a[v1dVar.ordinal()];
            if (i == 1 || i == 2) {
                f7b<C15059a<?>> f7bVar3 = this.f97744b2;
                int size2 = f7bVar3.getSize();
                if (size2 > 0) {
                    C15059a<?>[] content = f7bVar3.getContent();
                    int i2 = 0;
                    do {
                        qy6Var.invoke(content[i2]);
                        i2++;
                    } while (i2 < size2);
                }
            } else if (i == 3 && (size = (f7bVar = this.f97744b2).getSize()) > 0) {
                int i3 = size - 1;
                C15059a<?>[] content2 = f7bVar.getContent();
                do {
                    qy6Var.invoke(content2[i3]);
                    i3--;
                } while (i3 >= 0);
            }
        } finally {
            o28.finallyStart(1);
            this.f97744b2.clear();
            o28.finallyEnd(1);
        }
    }

    @Override // p000.s2d
    @gib
    public <R> Object awaitPointerEventScope(@yfb gz6<? super gn0, ? super zy2<? super R>, ? extends Object> gz6Var, @yfb zy2<? super R> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        C15059a c15059a = new C15059a(fq1Var);
        synchronized (this.f97743a2) {
            this.f97743a2.add(c15059a);
            zy2<bth> zy2VarCreateCoroutine = ez2.createCoroutine(gz6Var, c15059a, c15059a);
            v7e.C13927a c13927a = v7e.f90266b;
            zy2VarCreateCoroutine.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
        }
        fq1Var.invokeOnCancellation(new C15061c(c15059a));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    @Override // p000.c64
    public float getDensity() {
        return w34.requireLayoutNode(this).getDensity().getDensity();
    }

    @Override // p000.s2d
    /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
    public long mo27781getExtendedTouchPaddingNHjbRc() {
        long jMo27174toSizeXkaWNTQ = mo27174toSizeXkaWNTQ(getViewConfiguration().mo30909getMinimumTouchTargetSizeMYxV2XQ());
        long jMo27782getSizeYbymL2g = mo27782getSizeYbymL2g();
        return eqf.Size(Math.max(0.0f, wpf.m33069getWidthimpl(jMo27174toSizeXkaWNTQ) - r78.m32087getWidthimpl(jMo27782getSizeYbymL2g)) / 2.0f, Math.max(0.0f, wpf.m33066getHeightimpl(jMo27174toSizeXkaWNTQ) - r78.m32086getHeightimpl(jMo27782getSizeYbymL2g)) / 2.0f);
    }

    @Override // p000.dp6
    public float getFontScale() {
        return w34.requireLayoutNode(this).getDensity().getFontScale();
    }

    @Override // p000.s2d
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.f97747e2;
    }

    @Override // p000.wgg
    @yfb
    public gz6<s2d, zy2<? super bth>, Object> getPointerInputHandler() {
        return this.f97737M1;
    }

    @Override // p000.s2d
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public long mo27782getSizeYbymL2g() {
        return this.f97746d2;
    }

    @Override // p000.s2d
    @yfb
    public u8i getViewConfiguration() {
        return w34.requireLayoutNode(this).getViewConfiguration();
    }

    @Override // p000.p2d
    public void onCancelPointerInput() {
        t1d t1dVar = this.f97745c2;
        if (t1dVar == null) {
            return;
        }
        List<h2d> changes = t1dVar.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (changes.get(i).getPressed()) {
                List<h2d> changes2 = t1dVar.getChanges();
                ArrayList arrayList = new ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    h2d h2dVar = changes2.get(i2);
                    arrayList.add(new h2d(h2dVar.m29909getIdJ3iCeTQ(), h2dVar.getUptimeMillis(), h2dVar.m29911getPositionF1C5BW0(), false, h2dVar.getPressure(), h2dVar.getUptimeMillis(), h2dVar.m29911getPositionF1C5BW0(), h2dVar.getPressed(), h2dVar.getPressed(), 0, 0L, 1536, (jt3) null));
                }
                t1d t1dVar2 = new t1d(arrayList);
                this.f97742Z1 = t1dVar2;
                dispatchPointerEvent(t1dVar2, v1d.Initial);
                dispatchPointerEvent(t1dVar2, v1d.Main);
                dispatchPointerEvent(t1dVar2, v1d.Final);
                this.f97745c2 = null;
                return;
            }
        }
    }

    @Override // p000.p2d
    public void onDensityChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        resetPointerInputHandler();
        super.onDetach();
    }

    @Override // p000.p2d
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo27219onPointerEventH0pRuoY(@yfb t1d t1dVar, @yfb v1d v1dVar, long j) {
        this.f97746d2 = j;
        if (v1dVar == v1d.Initial) {
            this.f97742Z1 = t1dVar;
        }
        if (this.f97738V1 == null) {
            this.f97738V1 = fg1.launch$default(getCoroutineScope(), null, b23.f12444d, new C15062d(null), 1, null);
        }
        dispatchPointerEvent(t1dVar, v1dVar);
        List<h2d> changes = t1dVar.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!u1d.changedToUpIgnoreConsumed(changes.get(i))) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            t1dVar = null;
        }
        this.f97745c2 = t1dVar;
    }

    @Override // p000.p2d
    public void onViewConfigurationChange() {
        resetPointerInputHandler();
    }

    @Override // p000.wgg
    public void resetPointerInputHandler() {
        jj8 jj8Var = this.f97738V1;
        if (jj8Var != null) {
            jj8Var.cancel((CancellationException) new r2d());
            this.f97738V1 = null;
        }
    }

    @Override // p000.s2d
    public void setInterceptOutOfBoundsChildEvents(boolean z) {
        this.f97747e2 = z;
    }

    @Override // p000.wgg
    public void setPointerInputHandler(@yfb gz6<? super s2d, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        resetPointerInputHandler();
        this.f97737M1 = gz6Var;
    }

    public final void update$ui_release(@gib Object obj, @gib Object obj2, @gib Object[] objArr, @yfb gz6<? super s2d, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        boolean z = !md8.areEqual(this.f97739X, obj);
        this.f97739X = obj;
        if (!md8.areEqual(this.f97740Y, obj2)) {
            z = true;
        }
        this.f97740Y = obj2;
        Object[] objArr2 = this.f97741Z;
        if (objArr2 != null && objArr == null) {
            z = true;
        }
        if (objArr2 == null && objArr != null) {
            z = true;
        }
        boolean z2 = (objArr2 == null || objArr == null || Arrays.equals(objArr, objArr2)) ? z : true;
        this.f97741Z = objArr;
        if (z2) {
            resetPointerInputHandler();
        }
        this.f97737M1 = gz6Var;
    }

    public xgg(@gib Object obj, @gib Object obj2, @gib Object[] objArr, @yfb gz6<? super s2d, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        this.f97739X = obj;
        this.f97740Y = obj2;
        this.f97741Z = objArr;
        this.f97737M1 = gz6Var;
        this.f97742Z1 = vgg.f91119b;
        this.f97743a2 = new f7b<>(new C15059a[16], 0);
        this.f97744b2 = new f7b<>(new C15059a[16], 0);
        this.f97746d2 = r78.f77324b.m32092getZeroYbymL2g();
    }
}
