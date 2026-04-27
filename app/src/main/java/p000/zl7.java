package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import p000.x1d;
import p000.xl7;

/* JADX INFO: loaded from: classes.dex */
public final class zl7 extends InterfaceC0701e.d implements p2d {

    /* JADX INFO: renamed from: X */
    @yfb
    public l5b f105397X;

    /* JADX INFO: renamed from: Y */
    @gib
    public xl7.C15183a f105398Y;

    /* JADX INFO: renamed from: zl7$a */
    @ck3(m4009c = "androidx.compose.foundation.HoverableNode", m4010f = "Hoverable.kt", m4011i = {0, 0}, m4012l = {111}, m4013m = "emitEnter", m4014n = {"this", "interaction"}, m4015s = {"L$0", "L$1"})
    public static final class C16174a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f105399a;

        /* JADX INFO: renamed from: b */
        public Object f105400b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f105401c;

        /* JADX INFO: renamed from: e */
        public int f105403e;

        public C16174a(zy2<? super C16174a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f105401c = obj;
            this.f105403e |= Integer.MIN_VALUE;
            return zl7.this.emitEnter(this);
        }
    }

    /* JADX INFO: renamed from: zl7$b */
    @ck3(m4009c = "androidx.compose.foundation.HoverableNode", m4010f = "Hoverable.kt", m4011i = {0}, m4012l = {119}, m4013m = "emitExit", m4014n = {"this"}, m4015s = {"L$0"})
    public static final class C16175b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f105404a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f105405b;

        /* JADX INFO: renamed from: d */
        public int f105407d;

        public C16175b(zy2<? super C16175b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f105405b = obj;
            this.f105407d |= Integer.MIN_VALUE;
            return zl7.this.emitExit(this);
        }
    }

    /* JADX INFO: renamed from: zl7$c */
    @ck3(m4009c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", m4010f = "Hoverable.kt", m4011i = {}, m4012l = {94}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C16176c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f105408a;

        public C16176c(zy2<? super C16176c> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return zl7.this.new C16176c(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C16176c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f105408a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                zl7 zl7Var = zl7.this;
                this.f105408a = 1;
                if (zl7Var.emitEnter(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: zl7$d */
    @ck3(m4009c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", m4010f = "Hoverable.kt", m4011i = {}, m4012l = {95}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C16177d extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f105410a;

        public C16177d(zy2<? super C16177d> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return zl7.this.new C16177d(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C16177d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f105410a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                zl7 zl7Var = zl7.this;
                this.f105410a = 1;
                if (zl7Var.emitExit(this) == coroutine_suspended) {
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

    public zl7(@yfb l5b l5bVar) {
        this.f105397X = l5bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emitEnter(p000.zy2<? super p000.bth> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p000.zl7.C16174a
            if (r0 == 0) goto L13
            r0 = r5
            zl7$a r0 = (p000.zl7.C16174a) r0
            int r1 = r0.f105403e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f105403e = r1
            goto L18
        L13:
            zl7$a r0 = new zl7$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f105401c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f105403e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f105400b
            xl7$a r1 = (p000.xl7.C15183a) r1
            java.lang.Object r0 = r0.f105399a
            zl7 r0 = (p000.zl7) r0
            p000.y7e.throwOnFailure(r5)
            goto L56
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            p000.y7e.throwOnFailure(r5)
            xl7$a r5 = r4.f105398Y
            if (r5 != 0) goto L58
            xl7$a r5 = new xl7$a
            r5.<init>()
            l5b r2 = r4.f105397X
            r0.f105399a = r4
            r0.f105400b = r5
            r0.f105403e = r3
            java.lang.Object r0 = r2.emit(r5, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r4
            r1 = r5
        L56:
            r0.f105398Y = r1
        L58:
            bth r5 = p000.bth.f14751a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zl7.emitEnter(zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emitExit(p000.zy2<? super p000.bth> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p000.zl7.C16175b
            if (r0 == 0) goto L13
            r0 = r5
            zl7$b r0 = (p000.zl7.C16175b) r0
            int r1 = r0.f105407d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f105407d = r1
            goto L18
        L13:
            zl7$b r0 = new zl7$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f105405b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f105407d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f105404a
            zl7 r0 = (p000.zl7) r0
            p000.y7e.throwOnFailure(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            p000.y7e.throwOnFailure(r5)
            xl7$a r5 = r4.f105398Y
            if (r5 == 0) goto L52
            xl7$b r2 = new xl7$b
            r2.<init>(r5)
            l5b r5 = r4.f105397X
            r0.f105404a = r4
            r0.f105407d = r3
            java.lang.Object r5 = r5.emit(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            r5 = 0
            r0.f105398Y = r5
        L52:
            bth r5 = p000.bth.f14751a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zl7.emitExit(zy2):java.lang.Object");
    }

    private final void tryEmitExit() {
        xl7.C15183a c15183a = this.f105398Y;
        if (c15183a != null) {
            this.f105397X.tryEmit(new xl7.C15184b(c15183a));
            this.f105398Y = null;
        }
    }

    @Override // p000.p2d
    public void onCancelPointerInput() {
        tryEmitExit();
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        tryEmitExit();
    }

    @Override // p000.p2d
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo27219onPointerEventH0pRuoY(@yfb t1d t1dVar, @yfb v1d v1dVar, long j) {
        if (v1dVar == v1d.Main) {
            int iM32358getType7fucELk = t1dVar.m32358getType7fucELk();
            x1d.C14873a c14873a = x1d.f96025b;
            if (x1d.m33153equalsimpl0(iM32358getType7fucELk, c14873a.m33157getEnter7fucELk())) {
                fg1.launch$default(getCoroutineScope(), null, null, new C16176c(null), 3, null);
            } else if (x1d.m33153equalsimpl0(iM32358getType7fucELk, c14873a.m33158getExit7fucELk())) {
                fg1.launch$default(getCoroutineScope(), null, null, new C16177d(null), 3, null);
            }
        }
    }

    public final void updateInteractionSource(@yfb l5b l5bVar) {
        if (md8.areEqual(this.f105397X, l5bVar)) {
            return;
        }
        tryEmitExit();
        this.f105397X = l5bVar;
    }
}
