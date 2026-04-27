package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p000.jj8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCursorAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnimationState.kt\nandroidx/compose/foundation/text/input/internal/CursorAnimationState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,97:1\n76#2:98\n109#2,2:99\n*S KotlinDebug\n*F\n+ 1 CursorAnimationState.kt\nandroidx/compose/foundation/text/input/internal/CursorAnimationState\n*L\n44#1:98\n44#1:99,2\n*E\n"})
@e0g(parameters = 0)
public final class wa3 {

    /* JADX INFO: renamed from: c */
    public static final int f93792c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public AtomicReference<jj8> f93793a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b */
    @yfb
    public final b5b f93794b = pbd.mutableFloatStateOf(0.0f);

    /* JADX INFO: renamed from: wa3$a */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", m4010f = "CursorAnimationState.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14525a extends ugg implements gz6<x13, zy2<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a */
        public int f93795a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f93796b;

        /* JADX INFO: renamed from: wa3$a$a */
        @ck3(m4009c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", m4010f = "CursorAnimationState.kt", m4011i = {}, m4012l = {69, 77, 79}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f93798a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ jj8 f93799b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ wa3 f93800c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jj8 jj8Var, wa3 wa3Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f93799b = jj8Var;
                this.f93800c = wa3Var;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f93799b, this.f93800c, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0049 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0055 -> B:21:0x003a). Please report as a decompilation issue!!! */
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
            public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r1 = r8.f93798a
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    if (r1 == 0) goto L2a
                    if (r1 == r7) goto L26
                    if (r1 == r6) goto L22
                    if (r1 != r5) goto L1a
                    p000.y7e.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L18
                    goto L3a
                L18:
                    r9 = move-exception
                    goto L58
                L1a:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L22:
                    p000.y7e.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L18
                    goto L4a
                L26:
                    p000.y7e.throwOnFailure(r9)
                    goto L3a
                L2a:
                    p000.y7e.throwOnFailure(r9)
                    jj8 r9 = r8.f93799b
                    if (r9 == 0) goto L3a
                    r8.f93798a = r7
                    java.lang.Object r9 = p000.oj8.cancelAndJoin(r9, r8)
                    if (r9 != r0) goto L3a
                    return r0
                L3a:
                    wa3 r9 = r8.f93800c     // Catch: java.lang.Throwable -> L18
                    r1 = 1065353216(0x3f800000, float:1.0)
                    p000.wa3.access$setCursorAlpha(r9, r1)     // Catch: java.lang.Throwable -> L18
                    r8.f93798a = r6     // Catch: java.lang.Throwable -> L18
                    java.lang.Object r9 = p000.p34.delay(r3, r8)     // Catch: java.lang.Throwable -> L18
                    if (r9 != r0) goto L4a
                    return r0
                L4a:
                    wa3 r9 = r8.f93800c     // Catch: java.lang.Throwable -> L18
                    p000.wa3.access$setCursorAlpha(r9, r2)     // Catch: java.lang.Throwable -> L18
                    r8.f93798a = r5     // Catch: java.lang.Throwable -> L18
                    java.lang.Object r9 = p000.p34.delay(r3, r8)     // Catch: java.lang.Throwable -> L18
                    if (r9 != r0) goto L3a
                    return r0
                L58:
                    wa3 r0 = r8.f93800c
                    p000.wa3.access$setCursorAlpha(r0, r2)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.wa3.C14525a.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C14525a(zy2<? super C14525a> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C14525a c14525a = wa3.this.new C14525a(zy2Var);
            c14525a.f93796b = obj;
            return c14525a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super Boolean> zy2Var) {
            return ((C14525a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f93795a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return wc1.boxBoolean(v7b.m23844a(wa3.this.f93793a, null, fg1.launch$default((x13) this.f93796b, null, null, new a((jj8) wa3.this.f93793a.getAndSet(null), wa3.this, null), 3, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCursorAlpha(float f) {
        this.f93794b.setFloatValue(f);
    }

    public final void cancelAndHide() {
        jj8 andSet = this.f93793a.getAndSet(null);
        if (andSet != null) {
            jj8.C7916a.cancel$default(andSet, (CancellationException) null, 1, (Object) null);
        }
    }

    public final float getCursorAlpha() {
        return this.f93794b.getFloatValue();
    }

    @gib
    public final Object snapToVisibleAndAnimate(@yfb zy2<? super bth> zy2Var) {
        Object objCoroutineScope = y13.coroutineScope(new C14525a(null), zy2Var);
        return objCoroutineScope == pd8.getCOROUTINE_SUSPENDED() ? objCoroutineScope : bth.f14751a;
    }
}
