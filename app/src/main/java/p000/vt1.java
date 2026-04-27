package p000;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import p000.p5f;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nPlatformTextInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,256:1\n81#2:257\n107#2,2:258\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor\n*L\n210#1:257\n210#1:258,2\n*E\n"})
public final class vt1 {

    /* JADX INFO: renamed from: a */
    @gib
    public final vt1 f92197a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final z6b f92198b;

    /* JADX INFO: renamed from: vt1$a */
    @ck3(m4009c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", m4010f = "PlatformTextInputModifierNode.kt", m4011i = {}, m4012l = {nb2.f63863k}, m4013m = "textInputSession", m4014n = {}, m4015s = {})
    public static final class C14254a extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f92199a;

        /* JADX INFO: renamed from: c */
        public int f92201c;

        public C14254a(zy2<? super C14254a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f92199a = obj;
            this.f92201c |= Integer.MIN_VALUE;
            return vt1.this.textInputSession(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vt1$b */
    @ck3(m4009c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", m4010f = "PlatformTextInputModifierNode.kt", m4011i = {}, m4012l = {252}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14255b extends ugg implements gz6<yxc, zy2<?>, Object> {

        /* JADX INFO: renamed from: a */
        public int f92202a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f92203b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<yxc, zy2<?>, Object> f92204c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ vt1 f92205d;

        /* JADX INFO: renamed from: vt1$b$a */
        public static final class a implements yxc {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ yxc f92206a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ yxc f92207b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ AtomicReference<p5f.C10800a<Object>> f92208c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ vt1 f92209d;

            /* JADX INFO: renamed from: vt1$b$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", m4010f = "PlatformTextInputModifierNode.kt", m4011i = {}, m4012l = {239}, m4013m = "startInputMethod", m4014n = {}, m4015s = {})
            public static final class C16545a extends cz2 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f92210a;

                /* JADX INFO: renamed from: c */
                public int f92212c;

                public C16545a(zy2<? super C16545a> zy2Var) {
                    super(zy2Var);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    this.f92210a = obj;
                    this.f92212c |= Integer.MIN_VALUE;
                    return a.this.startInputMethod(null, this);
                }
            }

            /* JADX INFO: renamed from: vt1$b$a$b */
            public static final class b extends tt8 implements qy6<x13, bth> {

                /* JADX INFO: renamed from: a */
                public static final b f92213a = new b();

                public b() {
                    super(1);
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(x13 x13Var) {
                    invoke2(x13Var);
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@yfb x13 x13Var) {
                }
            }

            /* JADX INFO: renamed from: vt1$b$a$c */
            @ck3(m4009c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", m4010f = "PlatformTextInputModifierNode.kt", m4011i = {}, m4012l = {244}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class c extends ugg implements gz6<bth, zy2<?>, Object> {

                /* JADX INFO: renamed from: a */
                public int f92214a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ vt1 f92215b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ txc f92216c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ yxc f92217d;

                /* JADX INFO: renamed from: vt1$b$a$c$a, reason: collision with other inner class name */
                public static final class C16546a extends tt8 implements ny6<sxc> {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ vt1 f92218a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C16546a(vt1 vt1Var) {
                        super(0);
                        this.f92218a = vt1Var;
                    }

                    @Override // p000.ny6
                    @yfb
                    public final sxc invoke() {
                        return this.f92218a.getInterceptor();
                    }
                }

                /* JADX INFO: renamed from: vt1$b$a$c$b */
                @ck3(m4009c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", m4010f = "PlatformTextInputModifierNode.kt", m4011i = {}, m4012l = {245}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
                public static final class b extends ugg implements gz6<sxc, zy2<? super bth>, Object> {

                    /* JADX INFO: renamed from: a */
                    public int f92219a;

                    /* JADX INFO: renamed from: b */
                    public /* synthetic */ Object f92220b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ txc f92221c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ yxc f92222d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(txc txcVar, yxc yxcVar, zy2<? super b> zy2Var) {
                        super(2, zy2Var);
                        this.f92221c = txcVar;
                        this.f92222d = yxcVar;
                    }

                    @Override // p000.tq0
                    @yfb
                    public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                        b bVar = new b(this.f92221c, this.f92222d, zy2Var);
                        bVar.f92220b = obj;
                        return bVar;
                    }

                    @Override // p000.gz6
                    @gib
                    public final Object invoke(@yfb sxc sxcVar, @gib zy2<? super bth> zy2Var) {
                        return ((b) create(sxcVar, zy2Var)).invokeSuspend(bth.f14751a);
                    }

                    @Override // p000.tq0
                    @gib
                    public final Object invokeSuspend(@yfb Object obj) {
                        Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                        int i = this.f92219a;
                        if (i == 0) {
                            y7e.throwOnFailure(obj);
                            sxc sxcVar = (sxc) this.f92220b;
                            txc txcVar = this.f92221c;
                            yxc yxcVar = this.f92222d;
                            this.f92219a = 1;
                            if (sxcVar.interceptStartInputMethod(txcVar, yxcVar, this) == coroutine_suspended) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(vt1 vt1Var, txc txcVar, yxc yxcVar, zy2<? super c> zy2Var) {
                    super(2, zy2Var);
                    this.f92215b = vt1Var;
                    this.f92216c = txcVar;
                    this.f92217d = yxcVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new c(this.f92215b, this.f92216c, this.f92217d, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb bth bthVar, @gib zy2<?> zy2Var) {
                    return ((c) create(bthVar, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f92214a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        y56 y56VarSnapshotFlow = stf.snapshotFlow(new C16546a(this.f92215b));
                        b bVar = new b(this.f92216c, this.f92217d, null);
                        this.f92214a = 1;
                        if (c76.collectLatest(y56VarSnapshotFlow, bVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                    }
                    throw new IllegalStateException("Interceptors flow should never terminate.");
                }
            }

            public a(yxc yxcVar, AtomicReference<p5f.C10800a<Object>> atomicReference, vt1 vt1Var) {
                this.f92207b = yxcVar;
                this.f92208c = atomicReference;
                this.f92209d = vt1Var;
                this.f92206a = yxcVar;
            }

            @Override // p000.x13
            @yfb
            public e13 getCoroutineContext() {
                return this.f92206a.getCoroutineContext();
            }

            @Override // p000.xxc
            @yfb
            public View getView() {
                return this.f92206a.getView();
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p000.xxc
            @p000.gib
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object startInputMethod(@p000.yfb p000.txc r9, @p000.yfb p000.zy2<?> r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof p000.vt1.C14255b.a.C16545a
                    if (r0 == 0) goto L13
                    r0 = r10
                    vt1$b$a$a r0 = (p000.vt1.C14255b.a.C16545a) r0
                    int r1 = r0.f92212c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f92212c = r1
                    goto L18
                L13:
                    vt1$b$a$a r0 = new vt1$b$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f92210a
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f92212c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 == r3) goto L2d
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L2d:
                    p000.y7e.throwOnFailure(r10)
                    goto L4b
                L31:
                    p000.y7e.throwOnFailure(r10)
                    java.util.concurrent.atomic.AtomicReference<p5f$a<java.lang.Object>> r10 = r8.f92208c
                    vt1$b$a$b r2 = p000.vt1.C14255b.a.b.f92213a
                    vt1$b$a$c r4 = new vt1$b$a$c
                    vt1 r5 = r8.f92209d
                    yxc r6 = r8.f92207b
                    r7 = 0
                    r4.<init>(r5, r9, r6, r7)
                    r0.f92212c = r3
                    java.lang.Object r9 = p000.p5f.m31730withSessionCancellingPreviousimpl(r10, r2, r4, r0)
                    if (r9 != r1) goto L4b
                    return r1
                L4b:
                    us8 r9 = new us8
                    r9.<init>()
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.vt1.C14255b.a.startInputMethod(txc, zy2):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14255b(gz6<? super yxc, ? super zy2<?>, ? extends Object> gz6Var, vt1 vt1Var, zy2<? super C14255b> zy2Var) {
            super(2, zy2Var);
            this.f92204c = gz6Var;
            this.f92205d = vt1Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C14255b c14255b = new C14255b(this.f92204c, this.f92205d, zy2Var);
            c14255b.f92203b = obj;
            return c14255b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb yxc yxcVar, @gib zy2<?> zy2Var) {
            return ((C14255b) create(yxcVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f92202a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                a aVar = new a((yxc) this.f92203b, p5f.m31723constructorimpl(), this.f92205d);
                gz6<yxc, zy2<?>, Object> gz6Var = this.f92204c;
                this.f92202a = 1;
                if (gz6Var.invoke(aVar, this) == coroutine_suspended) {
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

    public vt1(@yfb sxc sxcVar, @gib vt1 vt1Var) {
        this.f92197a = vt1Var;
        this.f92198b = xtf.mutableStateOf$default(sxcVar, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sxc getInterceptor() {
        return (sxc) this.f92198b.getValue();
    }

    private final void setInterceptor(sxc sxcVar) {
        this.f92198b.setValue(sxcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object textInputSession(@p000.yfb p000.z9c r6, @p000.yfb p000.gz6<? super p000.yxc, ? super p000.zy2<?>, ? extends java.lang.Object> r7, @p000.yfb p000.zy2<?> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p000.vt1.C14254a
            if (r0 == 0) goto L13
            r0 = r8
            vt1$a r0 = (p000.vt1.C14254a) r0
            int r1 = r0.f92201c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92201c = r1
            goto L18
        L13:
            vt1$a r0 = new vt1$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f92199a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f92201c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            p000.y7e.throwOnFailure(r8)
            goto L45
        L31:
            p000.y7e.throwOnFailure(r8)
            vt1 r8 = r5.f92197a
            vt1$b r2 = new vt1$b
            r4 = 0
            r2.<init>(r7, r5, r4)
            r0.f92201c = r3
            java.lang.Object r6 = p000.vxc.access$interceptedTextInputSession(r6, r8, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            us8 r6 = new us8
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vt1.textInputSession(z9c, gz6, zy2):java.lang.Object");
    }

    public final void updateInterceptor(@yfb sxc sxcVar) {
        setInterceptor(sxcVar);
    }
}
