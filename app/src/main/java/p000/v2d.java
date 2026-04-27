package p000;

import android.view.MotionEvent;
import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.viewinterop.AndroidViewHolder;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,352:1\n135#2:353\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n*L\n73#1:353\n*E\n"})
public final class v2d {

    /* JADX INFO: renamed from: v2d$a */
    @ck3(m4009c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1", m4010f = "PointerInteropFilter.android.kt", m4011i = {}, m4012l = {TarConstants.XSTAR_PREFIX_OFFSET}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13835a extends ugg implements gz6<s2d, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f89797a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f89798b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<MotionEvent, bth> f89799c;

        /* JADX INFO: renamed from: v2d$a$a */
        @ck3(m4009c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1", m4010f = "PointerInteropFilter.android.kt", m4011i = {0}, m4012l = {347}, m4013m = "invokeSuspend", m4014n = {"$this$awaitPointerEventScope"}, m4015s = {"L$0"})
        public static final class a extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f89800a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f89801b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ qy6<MotionEvent, bth> f89802c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(qy6<? super MotionEvent, bth> qy6Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f89802c = qy6Var;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f89802c, zy2Var);
                aVar.f89801b = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
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
                    int r1 = r4.f89800a
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r4.f89801b
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
                    java.lang.Object r5 = r4.f89801b
                    gn0 r5 = (p000.gn0) r5
                    r1 = r5
                L23:
                    v1d r5 = p000.v1d.Initial
                    r4.f89801b = r1
                    r4.f89800a = r2
                    java.lang.Object r5 = r1.awaitPointerEvent(r5, r4)
                    if (r5 != r0) goto L30
                    return r0
                L30:
                    t1d r5 = (p000.t1d) r5
                    android.view.MotionEvent r5 = r5.getMotionEvent$ui_release()
                    if (r5 == 0) goto L23
                    qy6<android.view.MotionEvent, bth> r3 = r4.f89802c
                    r3.invoke(r5)
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.v2d.C13835a.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13835a(qy6<? super MotionEvent, bth> qy6Var, zy2<? super C13835a> zy2Var) {
            super(2, zy2Var);
            this.f89799c = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C13835a c13835a = new C13835a(this.f89799c, zy2Var);
            c13835a.f89798b = obj;
            return c13835a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb s2d s2dVar, @gib zy2<? super bth> zy2Var) {
            return ((C13835a) create(s2dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f89797a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                s2d s2dVar = (s2d) this.f89798b;
                s2dVar.setInterceptOutOfBoundsChildEvents(true);
                a aVar = new a(this.f89799c, null);
                this.f89797a = 1;
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

    /* JADX INFO: renamed from: v2d$b */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n*L\n1#1,178:1\n74#2,4:179\n*E\n"})
    public static final class C13836b extends tt8 implements qy6<f58, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y3e f89803a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6 f89804b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13836b(y3e y3eVar, qy6 qy6Var) {
            super(1);
            this.f89803a = y3eVar;
            this.f89804b = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("pointerInteropFilter");
            f58Var.getProperties().set("requestDisallowInterceptTouchEvent", this.f89803a);
            f58Var.getProperties().set("onTouchEvent", this.f89804b);
        }
    }

    /* JADX INFO: renamed from: v2d$c */
    @dwf({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt$pointerInteropFilter$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,352:1\n1223#2,6:353\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt$pointerInteropFilter$2\n*L\n79#1:353,6\n*E\n"})
    public static final class C13837c extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<MotionEvent, Boolean> f89805a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ y3e f89806b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13837c(qy6<? super MotionEvent, Boolean> qy6Var, y3e y3eVar) {
            super(3);
            this.f89805a = qy6Var;
            this.f89806b = y3eVar;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(374375707);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(374375707, i, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:78)");
            }
            Object objRememberedValue = zl2Var.rememberedValue();
            if (objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new u2d();
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            u2d u2dVar = (u2d) objRememberedValue;
            u2dVar.setOnTouchEvent(this.f89805a);
            u2dVar.setRequestDisallowInterceptTouchEvent(this.f89806b);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return u2dVar;
        }
    }

    /* JADX INFO: renamed from: v2d$d */
    public static final class C13838d extends tt8 implements qy6<MotionEvent, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AndroidViewHolder f89807a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13838d(AndroidViewHolder androidViewHolder) {
            super(1);
            this.f89807a = androidViewHolder;
        }

        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb MotionEvent motionEvent) {
            boolean zDispatchTouchEvent;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zDispatchTouchEvent = this.f89807a.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    zDispatchTouchEvent = this.f89807a.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(zDispatchTouchEvent);
        }
    }

    @ug5
    @yfb
    public static final InterfaceC0701e motionEventSpy(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super MotionEvent, bth> qy6Var) {
        return vgg.pointerInput(interfaceC0701e, qy6Var, new C13835a(qy6Var, null));
    }

    @ug5
    @yfb
    public static final InterfaceC0701e pointerInteropFilter(@yfb InterfaceC0701e interfaceC0701e, @yfb AndroidViewHolder androidViewHolder) {
        u2d u2dVar = new u2d();
        u2dVar.setOnTouchEvent(new C13838d(androidViewHolder));
        y3e y3eVar = new y3e();
        u2dVar.setRequestDisallowInterceptTouchEvent(y3eVar);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release(y3eVar);
        return interfaceC0701e.then(u2dVar);
    }

    public static /* synthetic */ InterfaceC0701e pointerInteropFilter$default(InterfaceC0701e interfaceC0701e, y3e y3eVar, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y3eVar = null;
        }
        return pointerInteropFilter(interfaceC0701e, y3eVar, qy6Var);
    }

    @ug5
    @yfb
    public static final InterfaceC0701e pointerInteropFilter(@yfb InterfaceC0701e interfaceC0701e, @gib y3e y3eVar, @yfb qy6<? super MotionEvent, Boolean> qy6Var) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C13836b(y3eVar, qy6Var) : c58.getNoInspectorInfo(), new C13837c(qy6Var, y3eVar));
    }
}
