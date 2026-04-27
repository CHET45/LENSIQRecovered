package p000;

/* JADX INFO: loaded from: classes.dex */
public final class y2d {

    /* JADX INFO: renamed from: y2d$a */
    @ck3(m4009c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", m4010f = "PointerMoveDetector.kt", m4011i = {}, m4012l = {41}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,57:1\n329#2:58\n*S KotlinDebug\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n*L\n40#1:58\n*E\n"})
    public static final class C15408a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f100187a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ s2d f100188b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ v1d f100189c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<izb, bth> f100190d;

        /* JADX INFO: renamed from: y2d$a$a */
        @ck3(m4009c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", m4010f = "PointerMoveDetector.kt", m4011i = {0, 0}, m4012l = {44}, m4013m = "invokeSuspend", m4014n = {"$this$awaitPointerEventScope", "previousPosition"}, m4015s = {"L$0", "L$1"})
        @dwf({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
        public static final class a extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public Object f100191a;

            /* JADX INFO: renamed from: b */
            public int f100192b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f100193c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ e13 f100194d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ v1d f100195e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ qy6<izb, bth> f100196f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(e13 e13Var, v1d v1dVar, qy6<? super izb, bth> qy6Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f100194d = e13Var;
                this.f100195e = v1dVar;
                this.f100196f = qy6Var;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f100194d, this.f100195e, this.f100196f, zy2Var);
                aVar.f100193c = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
            /* JADX WARN: Type inference failed for: r8v15, types: [T, izb] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0040 -> B:14:0x0043). Please report as a decompilation issue!!! */
            @Override // p000.tq0
            @p000.gib
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r1 = r7.f100192b
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r7.f100191a
                    jvd$h r1 = (p000.jvd.C8121h) r1
                    java.lang.Object r3 = r7.f100193c
                    gn0 r3 = (p000.gn0) r3
                    p000.y7e.throwOnFailure(r8)
                    goto L43
                L17:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1f:
                    p000.y7e.throwOnFailure(r8)
                    java.lang.Object r8 = r7.f100193c
                    gn0 r8 = (p000.gn0) r8
                    jvd$h r1 = new jvd$h
                    r1.<init>()
                    r3 = r8
                L2c:
                    e13 r8 = r7.f100194d
                    boolean r8 = p000.oj8.isActive(r8)
                    if (r8 == 0) goto La3
                    v1d r8 = r7.f100195e
                    r7.f100193c = r3
                    r7.f100191a = r1
                    r7.f100192b = r2
                    java.lang.Object r8 = r3.awaitPointerEvent(r8, r7)
                    if (r8 != r0) goto L43
                    return r0
                L43:
                    t1d r8 = (p000.t1d) r8
                    int r4 = r8.m32358getType7fucELk()
                    x1d$a r5 = p000.x1d.f96025b
                    int r6 = r5.m33159getMove7fucELk()
                    boolean r6 = p000.x1d.m33153equalsimpl0(r4, r6)
                    if (r6 == 0) goto L57
                    r6 = r2
                    goto L5f
                L57:
                    int r6 = r5.m33157getEnter7fucELk()
                    boolean r6 = p000.x1d.m33153equalsimpl0(r4, r6)
                L5f:
                    if (r6 == 0) goto L63
                    r4 = r2
                    goto L6b
                L63:
                    int r5 = r5.m33158getExit7fucELk()
                    boolean r4 = p000.x1d.m33153equalsimpl0(r4, r5)
                L6b:
                    if (r4 == 0) goto L2c
                    java.util.List r8 = r8.getChanges()
                    java.lang.Object r8 = p000.v82.first(r8)
                    h2d r8 = (p000.h2d) r8
                    long r4 = r8.m29911getPositionF1C5BW0()
                    izb r8 = p000.izb.m30418boximpl(r4)
                    long r4 = r8.m30439unboximpl()
                    T r6 = r1.f52110a
                    boolean r4 = p000.izb.m30425equalsimpl(r4, r6)
                    if (r4 != 0) goto L8c
                    goto L8d
                L8c:
                    r8 = 0
                L8d:
                    if (r8 == 0) goto L2c
                    qy6<izb, bth> r4 = r7.f100196f
                    long r5 = r8.m30439unboximpl()
                    izb r8 = p000.izb.m30418boximpl(r5)
                    r1.f52110a = r8
                    izb r8 = p000.izb.m30418boximpl(r5)
                    r4.invoke(r8)
                    goto L2c
                La3:
                    bth r8 = p000.bth.f14751a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.y2d.C15408a.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15408a(s2d s2dVar, v1d v1dVar, qy6<? super izb, bth> qy6Var, zy2<? super C15408a> zy2Var) {
            super(2, zy2Var);
            this.f100188b = s2dVar;
            this.f100189c = v1dVar;
            this.f100190d = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C15408a(this.f100188b, this.f100189c, this.f100190d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C15408a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f100187a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                e13 context = getContext();
                s2d s2dVar = this.f100188b;
                a aVar = new a(context, this.f100189c, this.f100190d, null);
                this.f100187a = 1;
                if (s2dVar.awaitPointerEventScope(aVar, this) == coroutine_suspended) {
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

    @gib
    public static final Object detectMoves(@yfb s2d s2dVar, @yfb v1d v1dVar, @yfb qy6<? super izb, bth> qy6Var, @yfb zy2<? super bth> zy2Var) {
        Object objCoroutineScope = y13.coroutineScope(new C15408a(s2dVar, v1dVar, qy6Var, null), zy2Var);
        return objCoroutineScope == pd8.getCOROUTINE_SUSPENDED() ? objCoroutineScope : bth.f14751a;
    }

    public static /* synthetic */ Object detectMoves$default(s2d s2dVar, v1d v1dVar, qy6 qy6Var, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            v1dVar = v1d.Initial;
        }
        return detectMoves(s2dVar, v1dVar, qy6Var, zy2Var);
    }
}
