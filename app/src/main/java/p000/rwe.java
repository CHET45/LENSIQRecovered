package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import java.util.List;
import org.videolan.libvlc.MediaPlayer;
import p000.jvd;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,444:1\n33#2,6:445\n33#2,6:451\n33#2,6:457\n33#2,6:463\n33#2,6:469\n33#2,6:475\n33#2,6:481\n86#2,2:487\n33#2,6:489\n88#2:495\n86#2,2:496\n33#2,6:498\n88#2:504\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n*L\n134#1:445,6\n165#1:451,6\n188#1:457,6\n247#1:463,6\n322#1:469,6\n358#1:475,6\n384#1:481,6\n426#1:487,2\n426#1:489,6\n426#1:495\n443#1:496,2\n443#1:498,6\n443#1:504\n*E\n"})
public final class rwe {

    /* JADX INFO: renamed from: a */
    public static final int f79981a = 8675309;

    /* JADX INFO: renamed from: rwe$a */
    @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m4010f = "SelectionGestures.kt", m4011i = {0}, m4012l = {ymh.InterfaceC15724c.f102181w}, m4013m = "awaitDown", m4014n = {"$this$awaitDown"}, m4015s = {"L$0"})
    public static final class C12339a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f79982a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f79983b;

        /* JADX INFO: renamed from: c */
        public int f79984c;

        public C12339a(zy2<? super C12339a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f79983b = obj;
            this.f79984c |= Integer.MIN_VALUE;
            return rwe.awaitDown(null, this);
        }
    }

    /* JADX INFO: renamed from: rwe$b */
    @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m4010f = "SelectionGestures.kt", m4011i = {0, 0, 1, 1}, m4012l = {158, 181}, m4013m = "mouseSelection", m4014n = {"$this$mouseSelection", "observer", "$this$mouseSelection", "observer"}, m4015s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C12340b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f79985a;

        /* JADX INFO: renamed from: b */
        public Object f79986b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f79987c;

        /* JADX INFO: renamed from: d */
        public int f79988d;

        public C12340b(zy2<? super C12340b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f79987c = obj;
            this.f79988d |= Integer.MIN_VALUE;
            return rwe.mouseSelection(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: rwe$c */
    public static final class C12341c extends tt8 implements qy6<h2d, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e0b f79989a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12341c(e0b e0bVar) {
            super(1);
            this.f79989a = e0bVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar) {
            invoke2(h2dVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb h2d h2dVar) {
            if (this.f79989a.mo28717onExtendDragk4lQ0M(h2dVar.m29911getPositionF1C5BW0())) {
                h2dVar.consume();
            }
        }
    }

    /* JADX INFO: renamed from: rwe$d */
    public static final class C12342d extends tt8 implements qy6<h2d, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e0b f79990a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ mwe f79991b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12342d(e0b e0bVar, mwe mweVar) {
            super(1);
            this.f79990a = e0bVar;
            this.f79991b = mweVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar) {
            invoke2(h2dVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb h2d h2dVar) {
            if (this.f79990a.mo28715onDrag3MmeM6k(h2dVar.m29911getPositionF1C5BW0(), this.f79991b)) {
                h2dVar.consume();
            }
        }
    }

    /* JADX INFO: renamed from: rwe$e */
    @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m4010f = "SelectionGestures.kt", m4011i = {0, 0, 1, 1}, m4012l = {351, 377}, m4013m = "mouseSelectionBtf2", m4014n = {"$this$mouseSelectionBtf2", "observer", "$this$mouseSelectionBtf2", "observer"}, m4015s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C12343e extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f79992a;

        /* JADX INFO: renamed from: b */
        public Object f79993b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f79994c;

        /* JADX INFO: renamed from: d */
        public int f79995d;

        public C12343e(zy2<? super C12343e> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f79994c = obj;
            this.f79995d |= Integer.MIN_VALUE;
            return rwe.mouseSelectionBtf2(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: rwe$f */
    public static final class C12344f extends tt8 implements qy6<h2d, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e0b f79996a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12344f(e0b e0bVar) {
            super(1);
            this.f79996a = e0bVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar) {
            invoke2(h2dVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb h2d h2dVar) {
            if (this.f79996a.mo28717onExtendDragk4lQ0M(h2dVar.m29911getPositionF1C5BW0())) {
                h2dVar.consume();
            }
        }
    }

    /* JADX INFO: renamed from: rwe$g */
    public static final class C12345g extends tt8 implements qy6<h2d, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e0b f79997a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ mwe f79998b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12345g(e0b e0bVar, mwe mweVar) {
            super(1);
            this.f79997a = e0bVar;
            this.f79998b = mweVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar) {
            invoke2(h2dVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb h2d h2dVar) {
            if (this.f79997a.mo28715onDrag3MmeM6k(h2dVar.m29911getPositionF1C5BW0(), this.f79998b)) {
                h2dVar.consume();
            }
        }
    }

    /* JADX INFO: renamed from: rwe$h */
    @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1", m4010f = "SelectionGestures.kt", m4011i = {}, m4012l = {104}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12346h extends ugg implements gz6<s2d, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f79999a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f80000b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e0b f80001c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ zqg f80002d;

        /* JADX INFO: renamed from: rwe$h$a */
        @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", m4010f = "SelectionGestures.kt", m4011i = {0}, m4012l = {105, 111, 113}, m4013m = "invokeSuspend", m4014n = {"$this$awaitEachGesture"}, m4015s = {"L$0"})
        @dwf({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,444:1\n86#2,2:445\n33#2,6:447\n88#2:453\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n*L\n109#1:445,2\n109#1:447,6\n109#1:453\n*E\n"})
        public static final class a extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f80003a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f80004b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ e0b f80005c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ v22 f80006d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ zqg f80007e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e0b e0bVar, v22 v22Var, zqg zqgVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f80005c = e0bVar;
                this.f80006d = v22Var;
                this.f80007e = zqgVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f80005c, this.f80006d, this.f80007e, zy2Var);
                aVar.f80004b = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
            @Override // p000.tq0
            @p000.gib
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r1 = r9.f80003a
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r4) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    goto L1a
                L12:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1a:
                    p000.y7e.throwOnFailure(r10)
                    goto L89
                L1e:
                    java.lang.Object r1 = r9.f80004b
                    gn0 r1 = (p000.gn0) r1
                    p000.y7e.throwOnFailure(r10)
                    goto L39
                L26:
                    p000.y7e.throwOnFailure(r10)
                    java.lang.Object r10 = r9.f80004b
                    r1 = r10
                    gn0 r1 = (p000.gn0) r1
                    r9.f80004b = r1
                    r9.f80003a = r4
                    java.lang.Object r10 = p000.rwe.access$awaitDown(r1, r9)
                    if (r10 != r0) goto L39
                    return r0
                L39:
                    t1d r10 = (p000.t1d) r10
                    boolean r4 = p000.rwe.isPrecisePointer(r10)
                    r5 = 0
                    if (r4 == 0) goto L76
                    int r4 = r10.m32356getButtonsry648PA()
                    boolean r4 = p000.y1d.m33347isPrimaryPressedaHzCxE(r4)
                    if (r4 == 0) goto L76
                    java.util.List r4 = r10.getChanges()
                    int r6 = r4.size()
                    r7 = 0
                L55:
                    if (r7 >= r6) goto L67
                    java.lang.Object r8 = r4.get(r7)
                    h2d r8 = (p000.h2d) r8
                    boolean r8 = r8.isConsumed()
                    if (r8 == 0) goto L64
                    goto L76
                L64:
                    int r7 = r7 + 1
                    goto L55
                L67:
                    e0b r2 = r9.f80005c
                    v22 r4 = r9.f80006d
                    r9.f80004b = r5
                    r9.f80003a = r3
                    java.lang.Object r10 = p000.rwe.access$mouseSelection(r1, r2, r4, r10, r9)
                    if (r10 != r0) goto L89
                    return r0
                L76:
                    boolean r3 = p000.rwe.isPrecisePointer(r10)
                    if (r3 != 0) goto L89
                    zqg r3 = r9.f80007e
                    r9.f80004b = r5
                    r9.f80003a = r2
                    java.lang.Object r10 = p000.rwe.access$touchSelection(r1, r3, r10, r9)
                    if (r10 != r0) goto L89
                    return r0
                L89:
                    bth r10 = p000.bth.f14751a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.rwe.C12346h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12346h(e0b e0bVar, zqg zqgVar, zy2<? super C12346h> zy2Var) {
            super(2, zy2Var);
            this.f80001c = e0bVar;
            this.f80002d = zqgVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C12346h c12346h = new C12346h(this.f80001c, this.f80002d, zy2Var);
            c12346h.f80000b = obj;
            return c12346h;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb s2d s2dVar, @gib zy2<? super bth> zy2Var) {
            return ((C12346h) create(s2dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f79999a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                s2d s2dVar = (s2d) this.f80000b;
                a aVar = new a(this.f80001c, new v22(s2dVar.getViewConfiguration()), this.f80002d, null);
                this.f79999a = 1;
                if (op6.awaitEachGesture(s2dVar, aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: rwe$i */
    @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2", m4010f = "SelectionGestures.kt", m4011i = {0}, m4012l = {209, 217, 220, 221}, m4013m = "invokeSuspend", m4014n = {"$this$awaitEachGesture"}, m4015s = {"L$0"})
    @dwf({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,444:1\n86#2,2:445\n33#2,6:447\n88#2:453\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2\n*L\n215#1:445,2\n215#1:447,6\n215#1:453\n*E\n"})
    public static final class C12347i extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f80008a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f80009b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ v22 f80010c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ e0b f80011d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ zqg f80012e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12347i(v22 v22Var, e0b e0bVar, zqg zqgVar, zy2<? super C12347i> zy2Var) {
            super(2, zy2Var);
            this.f80010c = v22Var;
            this.f80011d = e0bVar;
            this.f80012e = zqgVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C12347i c12347i = new C12347i(this.f80010c, this.f80011d, this.f80012e, zy2Var);
            c12347i.f80009b = obj;
            return c12347i;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
            return ((C12347i) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
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
                int r1 = r12.f80008a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2a
                if (r1 == r5) goto L22
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1d:
                p000.y7e.throwOnFailure(r13)
                goto La3
            L22:
                java.lang.Object r1 = r12.f80009b
                gn0 r1 = (p000.gn0) r1
                p000.y7e.throwOnFailure(r13)
                goto L3d
            L2a:
                p000.y7e.throwOnFailure(r13)
                java.lang.Object r13 = r12.f80009b
                r1 = r13
                gn0 r1 = (p000.gn0) r1
                r12.f80009b = r1
                r12.f80008a = r5
                java.lang.Object r13 = p000.rwe.access$awaitDown(r1, r12)
                if (r13 != r0) goto L3d
                return r0
            L3d:
                t1d r13 = (p000.t1d) r13
                v22 r6 = r12.f80010c
                r6.update(r13)
                boolean r6 = p000.rwe.isPrecisePointer(r13)
                r7 = 0
                if (r6 == 0) goto L7f
                int r8 = r13.m32356getButtonsry648PA()
                boolean r8 = p000.y1d.m33347isPrimaryPressedaHzCxE(r8)
                if (r8 == 0) goto L7f
                java.util.List r8 = r13.getChanges()
                int r9 = r8.size()
                r10 = 0
            L5e:
                if (r10 >= r9) goto L70
                java.lang.Object r11 = r8.get(r10)
                h2d r11 = (p000.h2d) r11
                boolean r11 = r11.isConsumed()
                if (r11 == 0) goto L6d
                goto L7f
            L6d:
                int r10 = r10 + 1
                goto L5e
            L70:
                e0b r2 = r12.f80011d
                v22 r3 = r12.f80010c
                r12.f80009b = r7
                r12.f80008a = r4
                java.lang.Object r13 = p000.rwe.access$mouseSelectionBtf2(r1, r2, r3, r13, r12)
                if (r13 != r0) goto La3
                return r0
            L7f:
                if (r6 != 0) goto La3
                v22 r4 = r12.f80010c
                int r4 = r4.getClicks()
                if (r4 != r5) goto L96
                zqg r2 = r12.f80012e
                r12.f80009b = r7
                r12.f80008a = r3
                java.lang.Object r13 = p000.rwe.access$touchSelectionFirstPress(r1, r2, r13, r12)
                if (r13 != r0) goto La3
                return r0
            L96:
                zqg r3 = r12.f80012e
                r12.f80009b = r7
                r12.f80008a = r2
                java.lang.Object r13 = p000.rwe.access$touchSelectionSubsequentPress(r1, r3, r13, r12)
                if (r13 != r0) goto La3
                return r0
            La3:
                bth r13 = p000.bth.f14751a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.rwe.C12347i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: rwe$j */
    @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m4010f = "SelectionGestures.kt", m4011i = {0, 0, 0, 1, 1}, m4012l = {124, 128}, m4013m = "touchSelection", m4014n = {"$this$touchSelection", "observer", "firstDown", "$this$touchSelection", "observer"}, m4015s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class C12348j extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f80013a;

        /* JADX INFO: renamed from: b */
        public Object f80014b;

        /* JADX INFO: renamed from: c */
        public Object f80015c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f80016d;

        /* JADX INFO: renamed from: e */
        public int f80017e;

        public C12348j(zy2<? super C12348j> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f80016d = obj;
            this.f80017e |= Integer.MIN_VALUE;
            return rwe.touchSelection(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: rwe$k */
    public static final class C12349k extends tt8 implements qy6<h2d, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zqg f80018a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12349k(zqg zqgVar) {
            super(1);
            this.f80018a = zqgVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar) {
            invoke2(h2dVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb h2d h2dVar) {
            this.f80018a.mo31652onDragk4lQ0M(u1d.positionChange(h2dVar));
            h2dVar.consume();
        }
    }

    /* JADX INFO: renamed from: rwe$l */
    @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m4010f = "SelectionGestures.kt", m4011i = {0, 0, 0, 1, 1}, m4012l = {238, 241}, m4013m = "touchSelectionFirstPress", m4014n = {"$this$touchSelectionFirstPress", "observer", "firstDown", "$this$touchSelectionFirstPress", "observer"}, m4015s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class C12350l extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f80019a;

        /* JADX INFO: renamed from: b */
        public Object f80020b;

        /* JADX INFO: renamed from: c */
        public Object f80021c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f80022d;

        /* JADX INFO: renamed from: e */
        public int f80023e;

        public C12350l(zy2<? super C12350l> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f80022d = obj;
            this.f80023e |= Integer.MIN_VALUE;
            return rwe.touchSelectionFirstPress(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: rwe$m */
    public static final class C12351m extends tt8 implements qy6<h2d, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zqg f80024a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12351m(zqg zqgVar) {
            super(1);
            this.f80024a = zqgVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar) {
            invoke2(h2dVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb h2d h2dVar) {
            this.f80024a.mo31652onDragk4lQ0M(u1d.positionChange(h2dVar));
            h2dVar.consume();
        }
    }

    /* JADX INFO: renamed from: rwe$n */
    @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m4010f = "SelectionGestures.kt", m4011i = {0, 0, 0, 0, 0, 1, 1}, m4012l = {MediaPlayer.Event.ESAdded, 315}, m4013m = "touchSelectionSubsequentPress", m4014n = {"$this$touchSelectionSubsequentPress", "observer", "firstDown", "overSlop", "pointerId", "$this$touchSelectionSubsequentPress", "observer"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1"})
    public static final class C12352n extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f80025a;

        /* JADX INFO: renamed from: b */
        public Object f80026b;

        /* JADX INFO: renamed from: c */
        public Object f80027c;

        /* JADX INFO: renamed from: d */
        public Object f80028d;

        /* JADX INFO: renamed from: e */
        public long f80029e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f80030f;

        /* JADX INFO: renamed from: m */
        public int f80031m;

        public C12352n(zy2<? super C12352n> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f80030f = obj;
            this.f80031m |= Integer.MIN_VALUE;
            return rwe.touchSelectionSubsequentPress(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: rwe$o */
    @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", m4010f = "SelectionGestures.kt", m4011i = {0}, m4012l = {MediaPlayer.Event.ESDeleted}, m4013m = "invokeSuspend", m4014n = {"$this$withTimeoutOrNull"}, m4015s = {"L$0"})
    public static final class C12353o extends t7e implements gz6<gn0, zy2<? super sk4>, Object> {

        /* JADX INFO: renamed from: a */
        public int f80032a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f80033b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f80034c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ jvd.C8120g f80035d;

        /* JADX INFO: renamed from: rwe$o$a */
        public static final class a extends tt8 implements gz6<h2d, izb, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jvd.C8120g f80036a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jvd.C8120g c8120g) {
                super(2);
                this.f80036a = c8120g;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar, izb izbVar) {
                m32224invokeUv8p0NA(h2dVar, izbVar.m30439unboximpl());
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
            public final void m32224invokeUv8p0NA(@yfb h2d h2dVar, long j) {
                h2dVar.consume();
                this.f80036a.f52109a = j;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12353o(long j, jvd.C8120g c8120g, zy2<? super C12353o> zy2Var) {
            super(2, zy2Var);
            this.f80034c = j;
            this.f80035d = c8120g;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C12353o c12353o = new C12353o(this.f80034c, this.f80035d, zy2Var);
            c12353o.f80033b = obj;
            return c12353o;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super sk4> zy2Var) {
            return ((C12353o) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            gn0 gn0Var;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f80032a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                gn0 gn0Var2 = (gn0) this.f80033b;
                long j = this.f80034c;
                a aVar = new a(this.f80035d);
                this.f80033b = gn0Var2;
                this.f80032a = 1;
                Object objM30063awaitTouchSlopOrCancellationjO51t88 = ho4.m30063awaitTouchSlopOrCancellationjO51t88(gn0Var2, j, aVar, this);
                if (objM30063awaitTouchSlopOrCancellationjO51t88 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                gn0Var = gn0Var2;
                obj = objM30063awaitTouchSlopOrCancellationjO51t88;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gn0Var = (gn0) this.f80033b;
                y7e.throwOnFailure(obj);
            }
            if (((h2d) obj) != null && mzb.m31100isSpecifiedk4lQ0M(this.f80035d.f52109a)) {
                return sk4.Drag;
            }
            h2d h2dVar = (h2d) v82.first((List) gn0Var.getCurrentEvent().getChanges());
            if (!u1d.changedToUpIgnoreConsumed(h2dVar)) {
                return sk4.Cancel;
            }
            h2dVar.consume();
            return sk4.Up;
        }
    }

    /* JADX INFO: renamed from: rwe$p */
    public static final class C12354p extends tt8 implements qy6<h2d, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zqg f80037a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12354p(zqg zqgVar) {
            super(1);
            this.f80037a = zqgVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar) {
            invoke2(h2dVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb h2d h2dVar) {
            this.f80037a.mo31652onDragk4lQ0M(u1d.positionChange(h2dVar));
            h2dVar.consume();
        }
    }

    /* JADX INFO: renamed from: rwe$q */
    @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1", m4010f = "SelectionGestures.kt", m4011i = {}, m4012l = {91}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12355q extends ugg implements gz6<s2d, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f80038a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f80039b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<Boolean, bth> f80040c;

        /* JADX INFO: renamed from: rwe$q$a */
        @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", m4010f = "SelectionGestures.kt", m4011i = {0}, m4012l = {93}, m4013m = "invokeSuspend", m4014n = {"$this$awaitPointerEventScope"}, m4015s = {"L$0"})
        public static final class a extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f80041a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f80042b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ qy6<Boolean, bth> f80043c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(qy6<? super Boolean, bth> qy6Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f80043c = qy6Var;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f80043c, zy2Var);
                aVar.f80042b = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p000.tq0
            @p000.gib
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r1 = r4.f80041a
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r4.f80042b
                    gn0 r1 = (p000.gn0) r1
                    p000.y7e.throwOnFailure(r5)
                    goto L30
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1b:
                    p000.y7e.throwOnFailure(r5)
                    java.lang.Object r5 = r4.f80042b
                    gn0 r5 = (p000.gn0) r5
                    r1 = r5
                L23:
                    v1d r5 = p000.v1d.Initial
                    r4.f80042b = r1
                    r4.f80041a = r2
                    java.lang.Object r5 = r1.awaitPointerEvent(r5, r4)
                    if (r5 != r0) goto L30
                    return r0
                L30:
                    t1d r5 = (p000.t1d) r5
                    qy6<java.lang.Boolean, bth> r3 = r4.f80043c
                    boolean r5 = p000.rwe.isPrecisePointer(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = p000.wc1.boxBoolean(r5)
                    r3.invoke(r5)
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.rwe.C12355q.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12355q(qy6<? super Boolean, bth> qy6Var, zy2<? super C12355q> zy2Var) {
            super(2, zy2Var);
            this.f80040c = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C12355q c12355q = new C12355q(this.f80040c, zy2Var);
            c12355q.f80039b = obj;
            return c12355q;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb s2d s2dVar, @gib zy2<? super bth> zy2Var) {
            return ((C12355q) create(s2dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f80038a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                s2d s2dVar = (s2d) this.f80039b;
                a aVar = new a(this.f80040c, null);
                this.f80038a = 1;
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitDown(p000.gn0 r7, p000.zy2<? super p000.t1d> r8) {
        /*
            boolean r0 = r8 instanceof p000.rwe.C12339a
            if (r0 == 0) goto L13
            r0 = r8
            rwe$a r0 = (p000.rwe.C12339a) r0
            int r1 = r0.f79984c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79984c = r1
            goto L18
        L13:
            rwe$a r0 = new rwe$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f79983b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f79984c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f79982a
            gn0 r7 = (p000.gn0) r7
            p000.y7e.throwOnFailure(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            p000.y7e.throwOnFailure(r8)
        L38:
            v1d r8 = p000.v1d.Main
            r0.f79982a = r7
            r0.f79984c = r3
            java.lang.Object r8 = r7.awaitPointerEvent(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            t1d r8 = (p000.t1d) r8
            java.util.List r2 = r8.getChanges()
            int r4 = r2.size()
            r5 = 0
        L50:
            if (r5 >= r4) goto L62
            java.lang.Object r6 = r2.get(r5)
            h2d r6 = (p000.h2d) r6
            boolean r6 = p000.u1d.changedToDownIgnoreConsumed(r6)
            if (r6 != 0) goto L5f
            goto L38
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rwe.awaitDown(gn0, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean distanceIsTolerable(u8i u8iVar, h2d h2dVar, h2d h2dVar2) {
        return izb.m30427getDistanceimpl(izb.m30433minusMKHz9U(h2dVar.m29911getPositionF1C5BW0(), h2dVar2.m29911getPositionF1C5BW0())) < ho4.m30072pointerSlopE8SPZFQ(u8iVar, h2dVar.m29914getTypeT8wyACA());
    }

    public static final boolean isPrecisePointer(@yfb t1d t1dVar) {
        List<h2d> changes = t1dVar.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (!z2d.m33469equalsimpl0(changes.get(i).m29914getTypeT8wyACA(), z2d.f103875b.m33474getMouseT8wyACA())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object mouseSelection(p000.gn0 r7, p000.e0b r8, p000.v22 r9, p000.t1d r10, p000.zy2<? super p000.bth> r11) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rwe.mouseSelection(gn0, e0b, v22, t1d, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:20:0x004b, B:31:0x0087, B:33:0x008f, B:35:0x009d, B:37:0x00a9, B:28:0x006e), top: B:66:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:53:0x00f7, B:55:0x00ff, B:57:0x010d, B:59:0x0119, B:50:0x00de), top: B:66:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object mouseSelectionBtf2(p000.gn0 r7, p000.e0b r8, p000.v22 r9, p000.t1d r10, p000.zy2<? super p000.bth> r11) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rwe.mouseSelectionBtf2(gn0, e0b, v22, t1d, zy2):java.lang.Object");
    }

    @yfb
    public static final InterfaceC0701e selectionGestureInput(@yfb InterfaceC0701e interfaceC0701e, @yfb e0b e0bVar, @yfb zqg zqgVar) {
        return vgg.pointerInput(interfaceC0701e, e0bVar, zqgVar, new C12346h(e0bVar, zqgVar, null));
    }

    @gib
    public static final Object selectionGesturePointerInputBtf2(@yfb s2d s2dVar, @yfb e0b e0bVar, @yfb zqg zqgVar, @yfb zy2<? super bth> zy2Var) {
        Object objAwaitEachGesture = op6.awaitEachGesture(s2dVar, new C12347i(new v22(s2dVar.getViewConfiguration()), e0bVar, zqgVar, null), zy2Var);
        return objAwaitEachGesture == pd8.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9 A[Catch: CancellationException -> 0x0035, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0031, B:33:0x00a1, B:35:0x00a9, B:37:0x00b8, B:39:0x00c4, B:40:0x00c7, B:41:0x00ca, B:42:0x00ce, B:20:0x004c, B:26:0x0073, B:28:0x0077, B:30:0x0081, B:23:0x0056), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[Catch: CancellationException -> 0x0035, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0031, B:33:0x00a1, B:35:0x00a9, B:37:0x00b8, B:39:0x00c4, B:40:0x00c7, B:41:0x00ca, B:42:0x00ce, B:20:0x004c, B:26:0x0073, B:28:0x0077, B:30:0x0081, B:23:0x0056), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object touchSelection(p000.gn0 r8, p000.zqg r9, p000.t1d r10, p000.zy2<? super p000.bth> r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rwe.touchSelection(gn0, zqg, t1d, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9 A[Catch: CancellationException -> 0x0035, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0031, B:33:0x00a1, B:35:0x00a9, B:37:0x00b8, B:39:0x00c4, B:40:0x00c7, B:41:0x00ca, B:42:0x00ce, B:20:0x004c, B:26:0x0073, B:28:0x0077, B:30:0x0081, B:23:0x0056), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[Catch: CancellationException -> 0x0035, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0031, B:33:0x00a1, B:35:0x00a9, B:37:0x00b8, B:39:0x00c4, B:40:0x00c7, B:41:0x00ca, B:42:0x00ce, B:20:0x004c, B:26:0x0073, B:28:0x0077, B:30:0x0081, B:23:0x0056), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object touchSelectionFirstPress(p000.gn0 r8, p000.zqg r9, p000.t1d r10, p000.zy2<? super p000.bth> r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rwe.touchSelectionFirstPress(gn0, zqg, t1d, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7 A[Catch: CancellationException -> 0x0037, TryCatch #1 {CancellationException -> 0x0037, blocks: (B:13:0x0032, B:45:0x00df, B:47:0x00e7, B:49:0x00f6, B:51:0x0102, B:52:0x0105, B:53:0x0108, B:54:0x010c, B:28:0x00a2, B:30:0x00a6, B:31:0x00a8, B:33:0x00ac, B:35:0x00af, B:37:0x00ba, B:39:0x00c0, B:41:0x00c4, B:42:0x00c9, B:25:0x0066), top: B:61:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c A[Catch: CancellationException -> 0x0037, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0037, blocks: (B:13:0x0032, B:45:0x00df, B:47:0x00e7, B:49:0x00f6, B:51:0x0102, B:52:0x0105, B:53:0x0108, B:54:0x010c, B:28:0x00a2, B:30:0x00a6, B:31:0x00a8, B:33:0x00ac, B:35:0x00af, B:37:0x00ba, B:39:0x00c0, B:41:0x00c4, B:42:0x00c9, B:25:0x0066), top: B:61:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object touchSelectionSubsequentPress(p000.gn0 r12, p000.zqg r13, p000.t1d r14, p000.zy2<? super p000.bth> r15) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rwe.touchSelectionSubsequentPress(gn0, zqg, t1d, zy2):java.lang.Object");
    }

    @yfb
    public static final InterfaceC0701e updateSelectionTouchMode(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super Boolean, bth> qy6Var) {
        return vgg.pointerInput(interfaceC0701e, Integer.valueOf(f79981a), new C12355q(qy6Var, null));
    }
}
