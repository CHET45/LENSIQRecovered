package p000;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.atomic.AtomicReference;
import p000.p5f;

/* JADX INFO: renamed from: mu */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class C9523mu implements yxc, x13 {

    /* JADX INFO: renamed from: e */
    public static final int f62121e = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final View f62122a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final stg f62123b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final x13 f62124c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final AtomicReference<p5f.C10800a<Object>> f62125d = p5f.m31723constructorimpl();

    /* JADX INFO: renamed from: mu$a */
    @ck3(m4009c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", m4010f = "AndroidPlatformTextInputSession.android.kt", m4011i = {}, m4012l = {73}, m4013m = "startInputMethod", m4014n = {}, m4015s = {})
    public static final class a extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f62126a;

        /* JADX INFO: renamed from: c */
        public int f62128c;

        public a(zy2<? super a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f62126a = obj;
            this.f62128c |= Integer.MIN_VALUE;
            return C9523mu.this.startInputMethod(null, this);
        }
    }

    /* JADX INFO: renamed from: mu$b */
    public static final class b extends tt8 implements qy6<x13, y38> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ txc f62129a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C9523mu f62130b;

        /* JADX INFO: renamed from: mu$b$a */
        public static final class a extends tt8 implements ny6<bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C9523mu f62131a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C9523mu c9523mu) {
                super(0);
                this.f62131a = c9523mu;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ bth invoke() {
                invoke2();
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                y13.cancel$default(this.f62131a.f62124c, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(txc txcVar, C9523mu c9523mu) {
            super(1);
            this.f62129a = txcVar;
            this.f62130b = c9523mu;
        }

        @Override // p000.qy6
        @yfb
        public final y38 invoke(@yfb x13 x13Var) {
            return new y38(this.f62129a, new a(this.f62130b));
        }
    }

    /* JADX INFO: renamed from: mu$c */
    @ck3(m4009c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", m4010f = "AndroidPlatformTextInputSession.android.kt", m4011i = {0}, m4012l = {185}, m4013m = "invokeSuspend", m4014n = {"methodSession"}, m4015s = {"L$0"})
    @dwf({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,184:1\n314#2,11:185\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3\n*L\n82#1:185,11\n*E\n"})
    public static final class c extends ugg implements gz6<y38, zy2<?>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f62132a;

        /* JADX INFO: renamed from: b */
        public int f62133b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f62134c;

        /* JADX INFO: renamed from: mu$c$a */
        public static final class a extends tt8 implements qy6<Throwable, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ y38 f62136a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C9523mu f62137b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y38 y38Var, C9523mu c9523mu) {
                super(1);
                this.f62136a = y38Var;
                this.f62137b = c9523mu;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
                invoke2(th);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@gib Throwable th) {
                this.f62136a.dispose();
                this.f62137b.f62123b.stopInput();
            }
        }

        public c(zy2<? super c> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            c cVar = C9523mu.this.new c(zy2Var);
            cVar.f62134c = obj;
            return cVar;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb y38 y38Var, @gib zy2<?> zy2Var) {
            return ((c) create(y38Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f62133b;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                y38 y38Var = (y38) this.f62134c;
                C9523mu c9523mu = C9523mu.this;
                this.f62134c = y38Var;
                this.f62132a = c9523mu;
                this.f62133b = 1;
                fq1 fq1Var = new fq1(od8.intercepted(this), 1);
                fq1Var.initCancellability();
                c9523mu.f62123b.startInput();
                fq1Var.invokeOnCancellation(new a(y38Var, c9523mu));
                Object result = fq1Var.getResult();
                if (result == pd8.getCOROUTINE_SUSPENDED()) {
                    jk3.probeCoroutineSuspended(this);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            throw new us8();
        }
    }

    public C9523mu(@yfb View view, @yfb stg stgVar, @yfb x13 x13Var) {
        this.f62122a = view;
        this.f62123b = stgVar;
        this.f62124c = x13Var;
    }

    @gib
    public final InputConnection createInputConnection(@yfb EditorInfo editorInfo) {
        y38 y38Var = (y38) p5f.m31727getCurrentSessionimpl(this.f62125d);
        if (y38Var != null) {
            return y38Var.createInputConnection(editorInfo);
        }
        return null;
    }

    @Override // p000.x13
    @yfb
    public e13 getCoroutineContext() {
        return this.f62124c.getCoroutineContext();
    }

    @Override // p000.xxc
    @yfb
    public View getView() {
        return this.f62122a;
    }

    public final boolean isReadyForConnection() {
        y38 y38Var = (y38) p5f.m31727getCurrentSessionimpl(this.f62125d);
        return y38Var != null && y38Var.isActive();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.xxc
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object startInputMethod(@p000.yfb p000.txc r6, @p000.yfb p000.zy2<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.C9523mu.a
            if (r0 == 0) goto L13
            r0 = r7
            mu$a r0 = (p000.C9523mu.a) r0
            int r1 = r0.f62128c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62128c = r1
            goto L18
        L13:
            mu$a r0 = new mu$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f62126a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f62128c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            p000.y7e.throwOnFailure(r7)
            goto L4a
        L31:
            p000.y7e.throwOnFailure(r7)
            java.util.concurrent.atomic.AtomicReference<p5f$a<java.lang.Object>> r7 = r5.f62125d
            mu$b r2 = new mu$b
            r2.<init>(r6, r5)
            mu$c r6 = new mu$c
            r4 = 0
            r6.<init>(r4)
            r0.f62128c = r3
            java.lang.Object r6 = p000.p5f.m31730withSessionCancellingPreviousimpl(r7, r2, r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            us8 r6 = new us8
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9523mu.startInputMethod(txc, zy2):java.lang.Object");
    }
}
