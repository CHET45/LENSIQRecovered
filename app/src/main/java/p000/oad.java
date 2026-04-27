package p000;

/* JADX INFO: loaded from: classes.dex */
public final class oad {

    /* JADX INFO: renamed from: oad$a */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", m4010f = "PressDownGesture.kt", m4011i = {0, 1, 1}, m4012l = {33, 39}, m4013m = "invokeSuspend", m4014n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, m4015s = {"L$0", "L$0", "L$1"})
    @dwf({"SMAP\nPressDownGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressDownGesture.kt\nandroidx/compose/foundation/text/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,49:1\n101#2,2:50\n33#2,6:52\n103#2:58\n*S KotlinDebug\n*F\n+ 1 PressDownGesture.kt\nandroidx/compose/foundation/text/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2\n*L\n40#1:50,2\n40#1:52,6\n40#1:58\n*E\n"})
    public static final class C10286a extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f67000a;

        /* JADX INFO: renamed from: b */
        public int f67001b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f67002c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ emg f67003d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ny6<bth> f67004e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10286a(emg emgVar, ny6<bth> ny6Var, zy2<? super C10286a> zy2Var) {
            super(2, zy2Var);
            this.f67003d = emgVar;
            this.f67004e = ny6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C10286a c10286a = new C10286a(this.f67003d, this.f67004e, zy2Var);
            c10286a.f67002c = obj;
            return c10286a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
            return ((C10286a) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:19:0x0062). Please report as a decompilation issue!!! */
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
                int r1 = r12.f67001b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r12.f67000a
                h2d r1 = (p000.h2d) r1
                java.lang.Object r4 = r12.f67002c
                gn0 r4 = (p000.gn0) r4
                p000.y7e.throwOnFailure(r13)
                goto L62
            L1a:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L22:
                java.lang.Object r1 = r12.f67002c
                gn0 r1 = (p000.gn0) r1
                p000.y7e.throwOnFailure(r13)
                goto L43
            L2a:
                p000.y7e.throwOnFailure(r13)
                java.lang.Object r13 = r12.f67002c
                r1 = r13
                gn0 r1 = (p000.gn0) r1
                r12.f67002c = r1
                r12.f67001b = r3
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
                emg r4 = r12.f67003d
                long r5 = r13.m29911getPositionF1C5BW0()
                r4.mo28826onEventk4lQ0M(r5)
                ny6<bth> r4 = r12.f67004e
                if (r4 == 0) goto L92
                r4 = r1
                r1 = r13
            L54:
                r12.f67002c = r4
                r12.f67000a = r1
                r12.f67001b = r2
                r13 = 0
                java.lang.Object r13 = p000.gn0.awaitPointerEvent$default(r4, r13, r12, r3, r13)
                if (r13 != r0) goto L62
                return r0
            L62:
                t1d r13 = (p000.t1d) r13
                java.util.List r13 = r13.getChanges()
                int r5 = r13.size()
                r6 = 0
            L6d:
                if (r6 >= r5) goto L8d
                java.lang.Object r7 = r13.get(r6)
                h2d r7 = (p000.h2d) r7
                long r8 = r7.m29909getIdJ3iCeTQ()
                long r10 = r1.m29909getIdJ3iCeTQ()
                boolean r8 = p000.f2d.m28883equalsimpl0(r8, r10)
                if (r8 == 0) goto L8a
                boolean r7 = r7.getPressed()
                if (r7 == 0) goto L8a
                goto L54
            L8a:
                int r6 = r6 + 1
                goto L6d
            L8d:
                ny6<bth> r13 = r12.f67004e
                r13.invoke()
            L92:
                bth r13 = p000.bth.f14751a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.oad.C10286a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @gib
    public static final Object detectPressDownGesture(@yfb s2d s2dVar, @yfb emg emgVar, @gib ny6<bth> ny6Var, @yfb zy2<? super bth> zy2Var) {
        Object objAwaitEachGesture = op6.awaitEachGesture(s2dVar, new C10286a(emgVar, ny6Var, null), zy2Var);
        return objAwaitEachGesture == pd8.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : bth.f14751a;
    }

    public static /* synthetic */ Object detectPressDownGesture$default(s2d s2dVar, emg emgVar, ny6 ny6Var, zy2 zy2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            ny6Var = null;
        }
        return detectPressDownGesture(s2dVar, emgVar, ny6Var, zy2Var);
    }
}
