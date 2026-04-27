package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ql9 {

    /* JADX INFO: renamed from: ql9$a */
    @ck3(m4009c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", m4010f = "LongPressTextDragObserver.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11528a extends ugg implements gz6<x13, zy2<? super jj8>, Object> {

        /* JADX INFO: renamed from: a */
        public int f74819a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f74820b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ s2d f74821c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ zqg f74822d;

        /* JADX INFO: renamed from: ql9$a$a */
        @ck3(m4009c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", m4010f = "LongPressTextDragObserver.kt", m4011i = {}, m4012l = {83}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f74823a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ s2d f74824b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ zqg f74825c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s2d s2dVar, zqg zqgVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f74824b = s2dVar;
                this.f74825c = zqgVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f74824b, this.f74825c, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f74823a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    s2d s2dVar = this.f74824b;
                    zqg zqgVar = this.f74825c;
                    this.f74823a = 1;
                    if (ql9.detectPreDragGesturesWithObserver(s2dVar, zqgVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: ql9$a$b */
        @ck3(m4009c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", m4010f = "LongPressTextDragObserver.kt", m4011i = {}, m4012l = {86}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f74826a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ s2d f74827b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ zqg f74828c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(s2d s2dVar, zqg zqgVar, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f74827b = s2dVar;
                this.f74828c = zqgVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new b(this.f74827b, this.f74828c, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f74826a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    s2d s2dVar = this.f74827b;
                    zqg zqgVar = this.f74828c;
                    this.f74826a = 1;
                    if (ql9.detectDragGesturesWithObserver(s2dVar, zqgVar, this) == coroutine_suspended) {
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
        public C11528a(s2d s2dVar, zqg zqgVar, zy2<? super C11528a> zy2Var) {
            super(2, zy2Var);
            this.f74821c = s2dVar;
            this.f74822d = zqgVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C11528a c11528a = new C11528a(this.f74821c, this.f74822d, zy2Var);
            c11528a.f74820b = obj;
            return c11528a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super jj8> zy2Var) {
            return ((C11528a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f74819a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            x13 x13Var = (x13) this.f74820b;
            b23 b23Var = b23.f12444d;
            fg1.launch$default(x13Var, null, b23Var, new a(this.f74821c, this.f74822d, null), 1, null);
            return fg1.launch$default(x13Var, null, b23Var, new b(this.f74821c, this.f74822d, null), 1, null);
        }
    }

    /* JADX INFO: renamed from: ql9$b */
    public static final class C11529b extends tt8 implements qy6<izb, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zqg f74829a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11529b(zqg zqgVar) {
            super(1);
            this.f74829a = zqgVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m31938invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m31938invokek4lQ0M(long j) {
            this.f74829a.mo31653onStartk4lQ0M(j);
        }
    }

    /* JADX INFO: renamed from: ql9$c */
    public static final class C11530c extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zqg f74830a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11530c(zqg zqgVar) {
            super(0);
            this.f74830a = zqgVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f74830a.onStop();
        }
    }

    /* JADX INFO: renamed from: ql9$d */
    public static final class C11531d extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zqg f74831a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11531d(zqg zqgVar) {
            super(0);
            this.f74831a = zqgVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f74831a.onCancel();
        }
    }

    /* JADX INFO: renamed from: ql9$e */
    public static final class C11532e extends tt8 implements gz6<h2d, izb, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zqg f74832a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11532e(zqg zqgVar) {
            super(2);
            this.f74832a = zqgVar;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar, izb izbVar) {
            m31939invokeUv8p0NA(h2dVar, izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final void m31939invokeUv8p0NA(@yfb h2d h2dVar, long j) {
            this.f74832a.mo31652onDragk4lQ0M(j);
        }
    }

    /* JADX INFO: renamed from: ql9$f */
    public static final class C11533f extends tt8 implements qy6<izb, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zqg f74833a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11533f(zqg zqgVar) {
            super(1);
            this.f74833a = zqgVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m31940invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m31940invokek4lQ0M(long j) {
            this.f74833a.mo31653onStartk4lQ0M(j);
        }
    }

    /* JADX INFO: renamed from: ql9$g */
    public static final class C11534g extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zqg f74834a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11534g(zqg zqgVar) {
            super(0);
            this.f74834a = zqgVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f74834a.onStop();
        }
    }

    /* JADX INFO: renamed from: ql9$h */
    public static final class C11535h extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zqg f74835a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11535h(zqg zqgVar) {
            super(0);
            this.f74835a = zqgVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f74835a.onCancel();
        }
    }

    /* JADX INFO: renamed from: ql9$i */
    public static final class C11536i extends tt8 implements gz6<h2d, izb, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zqg f74836a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11536i(zqg zqgVar) {
            super(2);
            this.f74836a = zqgVar;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar, izb izbVar) {
            m31941invokeUv8p0NA(h2dVar, izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final void m31941invokeUv8p0NA(@yfb h2d h2dVar, long j) {
            this.f74836a.mo31652onDragk4lQ0M(j);
        }
    }

    /* JADX INFO: renamed from: ql9$j */
    @ck3(m4009c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", m4010f = "LongPressTextDragObserver.kt", m4011i = {0, 1, 1}, m4012l = {99, 103}, m4013m = "invokeSuspend", m4014n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, m4015s = {"L$0", "L$0", "L$1"})
    @dwf({"SMAP\nLongPressTextDragObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,126:1\n101#2,2:127\n33#2,6:129\n103#2:135\n*S KotlinDebug\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n*L\n104#1:127,2\n104#1:129,6\n104#1:135\n*E\n"})
    public static final class C11537j extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f74837a;

        /* JADX INFO: renamed from: b */
        public int f74838b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f74839c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ zqg f74840d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11537j(zqg zqgVar, zy2<? super C11537j> zy2Var) {
            super(2, zy2Var);
            this.f74840d = zqgVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C11537j c11537j = new C11537j(this.f74840d, zy2Var);
            c11537j.f74839c = obj;
            return c11537j;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
            return ((C11537j) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:17:0x005e). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r12.f74838b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r12.f74837a
                h2d r1 = (p000.h2d) r1
                java.lang.Object r4 = r12.f74839c
                gn0 r4 = (p000.gn0) r4
                p000.y7e.throwOnFailure(r13)
                goto L5e
            L1a:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L22:
                java.lang.Object r1 = r12.f74839c
                gn0 r1 = (p000.gn0) r1
                p000.y7e.throwOnFailure(r13)
                goto L43
            L2a:
                p000.y7e.throwOnFailure(r13)
                java.lang.Object r13 = r12.f74839c
                r1 = r13
                gn0 r1 = (p000.gn0) r1
                r12.f74839c = r1
                r12.f74838b = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r4 = r1
                r7 = r12
                java.lang.Object r13 = p000.dmg.awaitFirstDown$default(r4, r5, r6, r7, r8, r9)
                if (r13 != r0) goto L43
                return r0
            L43:
                h2d r13 = (p000.h2d) r13
                zqg r4 = r12.f74840d
                long r5 = r13.m29911getPositionF1C5BW0()
                r4.mo31651onDownk4lQ0M(r5)
                r4 = r1
                r1 = r13
            L50:
                r12.f74839c = r4
                r12.f74837a = r1
                r12.f74838b = r2
                r13 = 0
                java.lang.Object r13 = p000.gn0.awaitPointerEvent$default(r4, r13, r12, r3, r13)
                if (r13 != r0) goto L5e
                return r0
            L5e:
                t1d r13 = (p000.t1d) r13
                java.util.List r13 = r13.getChanges()
                int r5 = r13.size()
                r6 = 0
            L69:
                if (r6 >= r5) goto L89
                java.lang.Object r7 = r13.get(r6)
                h2d r7 = (p000.h2d) r7
                long r8 = r7.m29909getIdJ3iCeTQ()
                long r10 = r1.m29909getIdJ3iCeTQ()
                boolean r8 = p000.f2d.m28883equalsimpl0(r8, r10)
                if (r8 == 0) goto L86
                boolean r7 = r7.getPressed()
                if (r7 == 0) goto L86
                goto L50
            L86:
                int r6 = r6 + 1
                goto L69
            L89:
                zqg r13 = r12.f74840d
                r13.onUp()
                bth r13 = p000.bth.f14751a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ql9.C11537j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @gib
    public static final Object detectDownAndDragGesturesWithObserver(@yfb s2d s2dVar, @yfb zqg zqgVar, @yfb zy2<? super bth> zy2Var) {
        Object objCoroutineScope = y13.coroutineScope(new C11528a(s2dVar, zqgVar, null), zy2Var);
        return objCoroutineScope == pd8.getCOROUTINE_SUSPENDED() ? objCoroutineScope : bth.f14751a;
    }

    @gib
    public static final Object detectDragGesturesAfterLongPressWithObserver(@yfb s2d s2dVar, @yfb zqg zqgVar, @yfb zy2<? super bth> zy2Var) {
        Object objDetectDragGesturesAfterLongPress = ho4.detectDragGesturesAfterLongPress(s2dVar, new C11529b(zqgVar), new C11530c(zqgVar), new C11531d(zqgVar), new C11532e(zqgVar), zy2Var);
        return objDetectDragGesturesAfterLongPress == pd8.getCOROUTINE_SUSPENDED() ? objDetectDragGesturesAfterLongPress : bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectDragGesturesWithObserver(s2d s2dVar, zqg zqgVar, zy2<? super bth> zy2Var) {
        Object objDetectDragGestures = ho4.detectDragGestures(s2dVar, new C11533f(zqgVar), new C11534g(zqgVar), new C11535h(zqgVar), new C11536i(zqgVar), zy2Var);
        return objDetectDragGestures == pd8.getCOROUTINE_SUSPENDED() ? objDetectDragGestures : bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectPreDragGesturesWithObserver(s2d s2dVar, zqg zqgVar, zy2<? super bth> zy2Var) {
        Object objAwaitEachGesture = op6.awaitEachGesture(s2dVar, new C11537j(zqgVar, null), zy2Var);
        return objAwaitEachGesture == pd8.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : bth.f14751a;
    }
}
