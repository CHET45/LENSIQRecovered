package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import p000.xx2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nContextMenuGestures.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuGestures.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuGestures_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,72:1\n86#2,2:73\n33#2,6:75\n88#2:81\n*S KotlinDebug\n*F\n+ 1 ContextMenuGestures.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuGestures_androidKt\n*L\n67#1:73,2\n67#1:75,6\n67#1:81\n*E\n"})
public final class rx2 {

    /* JADX INFO: renamed from: rx2$a */
    @ck3(m4009c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt", m4010f = "ContextMenuGestures.android.kt", m4011i = {0}, m4012l = {66}, m4013m = "awaitFirstRightClickDown", m4014n = {"$this$awaitFirstRightClickDown"}, m4015s = {"L$0"})
    public static final class C12358a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f80051a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f80052b;

        /* JADX INFO: renamed from: c */
        public int f80053c;

        public C12358a(zy2<? super C12358a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f80052b = obj;
            this.f80053c |= Integer.MIN_VALUE;
            return rx2.awaitFirstRightClickDown(null, this);
        }
    }

    /* JADX INFO: renamed from: rx2$b */
    @ck3(m4009c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$contextMenuGestures$1", m4010f = "ContextMenuGestures.android.kt", m4011i = {}, m4012l = {44}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12359b extends ugg implements gz6<s2d, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f80054a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f80055b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ xx2 f80056c;

        /* JADX INFO: renamed from: rx2$b$a */
        public static final class a extends tt8 implements qy6<izb, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ xx2 f80057a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(xx2 xx2Var) {
                super(1);
                this.f80057a = xx2Var;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
                m32236invokek4lQ0M(izbVar.m30439unboximpl());
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m32236invokek4lQ0M(long j) {
                this.f80057a.setStatus(new xx2.AbstractC15340a.b(j, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12359b(xx2 xx2Var, zy2<? super C12359b> zy2Var) {
            super(2, zy2Var);
            this.f80056c = xx2Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C12359b c12359b = new C12359b(this.f80056c, zy2Var);
            c12359b.f80055b = obj;
            return c12359b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb s2d s2dVar, @gib zy2<? super bth> zy2Var) {
            return ((C12359b) create(s2dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f80054a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                s2d s2dVar = (s2d) this.f80055b;
                a aVar = new a(this.f80056c);
                this.f80054a = 1;
                if (rx2.onRightClickDown(s2dVar, aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: rx2$c */
    @ck3(m4009c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2", m4010f = "ContextMenuGestures.android.kt", m4011i = {0}, m4012l = {53, 56}, m4013m = "invokeSuspend", m4014n = {"$this$awaitEachGesture"}, m4015s = {"L$0"})
    public static final class C12360c extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f80058a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f80059b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<izb, bth> f80060c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12360c(qy6<? super izb, bth> qy6Var, zy2<? super C12360c> zy2Var) {
            super(2, zy2Var);
            this.f80060c = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C12360c c12360c = new C12360c(this.f80060c, zy2Var);
            c12360c.f80059b = obj;
            return c12360c;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
            return ((C12360c) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
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
                int r1 = r7.f80058a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p000.y7e.throwOnFailure(r8)
                goto L53
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f80059b
                gn0 r1 = (p000.gn0) r1
                p000.y7e.throwOnFailure(r8)
                goto L35
            L22:
                p000.y7e.throwOnFailure(r8)
                java.lang.Object r8 = r7.f80059b
                r1 = r8
                gn0 r1 = (p000.gn0) r1
                r7.f80059b = r1
                r7.f80058a = r3
                java.lang.Object r8 = p000.rx2.access$awaitFirstRightClickDown(r1, r7)
                if (r8 != r0) goto L35
                return r0
            L35:
                h2d r8 = (p000.h2d) r8
                r8.consume()
                qy6<izb, bth> r4 = r7.f80060c
                long r5 = r8.m29911getPositionF1C5BW0()
                izb r8 = p000.izb.m30418boximpl(r5)
                r4.invoke(r8)
                r8 = 0
                r7.f80059b = r8
                r7.f80058a = r2
                java.lang.Object r8 = p000.dmg.waitForUpOrCancellation$default(r1, r8, r7, r3, r8)
                if (r8 != r0) goto L53
                return r0
            L53:
                h2d r8 = (p000.h2d) r8
                if (r8 == 0) goto L5a
                r8.consume()
            L5a:
                bth r8 = p000.bth.f14751a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.rx2.C12360c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitFirstRightClickDown(p000.gn0 r8, p000.zy2<? super p000.h2d> r9) {
        /*
            boolean r0 = r9 instanceof p000.rx2.C12358a
            if (r0 == 0) goto L13
            r0 = r9
            rx2$a r0 = (p000.rx2.C12358a) r0
            int r1 = r0.f80053c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80053c = r1
            goto L18
        L13:
            rx2$a r0 = new rx2$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f80052b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f80053c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f80051a
            gn0 r8 = (p000.gn0) r8
            p000.y7e.throwOnFailure(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            p000.y7e.throwOnFailure(r9)
        L38:
            r0.f80051a = r8
            r0.f80053c = r3
            r9 = 0
            java.lang.Object r9 = p000.gn0.awaitPointerEvent$default(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            t1d r9 = (p000.t1d) r9
            int r2 = r9.m32356getButtonsry648PA()
            boolean r2 = p000.y1d.m33349isSecondaryPressedaHzCxE(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r9.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5a:
            if (r6 >= r4) goto L6c
            java.lang.Object r7 = r2.get(r6)
            h2d r7 = (p000.h2d) r7
            boolean r7 = p000.u1d.changedToDown(r7)
            if (r7 != 0) goto L69
            goto L38
        L69:
            int r6 = r6 + 1
            goto L5a
        L6c:
            java.util.List r8 = r9.getChanges()
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rx2.awaitFirstRightClickDown(gn0, zy2):java.lang.Object");
    }

    @yfb
    public static final InterfaceC0701e contextMenuGestures(@yfb InterfaceC0701e interfaceC0701e, @yfb xx2 xx2Var) {
        return vgg.pointerInput(interfaceC0701e, sx2.f83197a, new C12359b(xx2Var, null));
    }

    @gib
    @fdi
    public static final Object onRightClickDown(@yfb s2d s2dVar, @yfb qy6<? super izb, bth> qy6Var, @yfb zy2<? super bth> zy2Var) {
        Object objAwaitEachGesture = op6.awaitEachGesture(s2dVar, new C12360c(qy6Var, null), zy2Var);
        return objAwaitEachGesture == pd8.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : bth.f14751a;
    }
}
