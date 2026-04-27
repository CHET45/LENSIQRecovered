package p000;

import java.util.List;
import java.util.concurrent.CancellationException;
import p000.jj8;
import p000.md8;
import p000.t39;

/* JADX INFO: renamed from: mt */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLegacyPlatformTextInputServiceAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyPlatformTextInputServiceAdapter.android.kt\nandroidx/compose/foundation/text/input/internal/AndroidLegacyPlatformTextInputServiceAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
@e0g(parameters = 0)
public final class C9506mt extends t39 {

    /* JADX INFO: renamed from: f */
    public static final int f61987f = 8;

    /* JADX INFO: renamed from: c */
    @gib
    public jj8 f61988c;

    /* JADX INFO: renamed from: d */
    @gib
    public a49 f61989d;

    /* JADX INFO: renamed from: e */
    @gib
    public v6b<bth> f61990e;

    /* JADX INFO: renamed from: mt$a */
    public static final class a extends tt8 implements qy6<a49, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zsg f61991a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C9506mt f61992b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ nw7 f61993c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<List<? extends lw4>, bth> f61994d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ qy6<mw7, bth> f61995e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(zsg zsgVar, C9506mt c9506mt, nw7 nw7Var, qy6<? super List<? extends lw4>, bth> qy6Var, qy6<? super mw7, bth> qy6Var2) {
            super(1);
            this.f61991a = zsgVar;
            this.f61992b = c9506mt;
            this.f61993c = nw7Var;
            this.f61994d = qy6Var;
            this.f61995e = qy6Var2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(a49 a49Var) {
            invoke2(a49Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb a49 a49Var) {
            a49Var.startInput(this.f61991a, this.f61992b.m22351a(), this.f61993c, this.f61994d, this.f61995e);
        }
    }

    /* JADX INFO: renamed from: mt$b */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", m4010f = "LegacyPlatformTextInputServiceAdapter.android.kt", m4011i = {}, m4012l = {123}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class b extends ugg implements gz6<xxc, zy2<?>, Object> {

        /* JADX INFO: renamed from: a */
        public int f61996a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f61997b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<a49, bth> f61998c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C9506mt f61999d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ t39.InterfaceC12899a f62000e;

        /* JADX INFO: renamed from: mt$b$a */
        @ck3(m4009c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", m4010f = "LegacyPlatformTextInputServiceAdapter.android.kt", m4011i = {}, m4012l = {146}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<?>, Object> {

            /* JADX INFO: renamed from: a */
            public int f62001a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f62002b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ xxc f62003c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ qy6<a49, bth> f62004d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C9506mt f62005e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ t39.InterfaceC12899a f62006f;

            /* JADX INFO: renamed from: mt$b$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", m4010f = "LegacyPlatformTextInputServiceAdapter.android.kt", m4011i = {}, m4012l = {137, 138}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class C16489a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f62007a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C9506mt f62008b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ v38 f62009c;

                /* JADX INFO: renamed from: mt$b$a$a$a, reason: collision with other inner class name */
                public static final class C16490a extends tt8 implements qy6<Long, bth> {

                    /* JADX INFO: renamed from: a */
                    public static final C16490a f62010a = new C16490a();

                    public C16490a() {
                        super(1);
                    }

                    @Override // p000.qy6
                    public /* bridge */ /* synthetic */ bth invoke(Long l) {
                        invoke(l.longValue());
                        return bth.f14751a;
                    }

                    public final void invoke(long j) {
                    }
                }

                /* JADX INFO: renamed from: mt$b$a$a$b, reason: collision with other inner class name */
                public static final class C16491b<T> implements t66 {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ v38 f62011a;

                    public C16491b(v38 v38Var) {
                        this.f62011a = v38Var;
                    }

                    @Override // p000.t66
                    public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
                        return emit((bth) obj, (zy2<? super bth>) zy2Var);
                    }

                    @gib
                    public final Object emit(@yfb bth bthVar, @yfb zy2<? super bth> zy2Var) {
                        this.f62011a.startStylusHandwriting();
                        return bth.f14751a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16489a(C9506mt c9506mt, v38 v38Var, zy2<? super C16489a> zy2Var) {
                    super(2, zy2Var);
                    this.f62008b = c9506mt;
                    this.f62009c = v38Var;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new C16489a(this.f62008b, this.f62009c, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((C16489a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f62007a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        C16490a c16490a = C16490a.f62010a;
                        this.f62007a = 1;
                        if (sya.withFrameMillis(c16490a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y7e.throwOnFailure(obj);
                            throw new us8();
                        }
                        y7e.throwOnFailure(obj);
                    }
                    v6b stylusHandwritingTrigger = this.f62008b.getStylusHandwritingTrigger();
                    if (stylusHandwritingTrigger == null) {
                        return bth.f14751a;
                    }
                    C16491b c16491b = new C16491b(this.f62009c);
                    this.f62007a = 2;
                    if (stylusHandwritingTrigger.collect(c16491b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    throw new us8();
                }
            }

            /* JADX INFO: renamed from: mt$b$a$b, reason: collision with other inner class name */
            public /* synthetic */ class C16492b extends n07 implements qy6<x3a, bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ t39.InterfaceC12899a f62012a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16492b(t39.InterfaceC12899a interfaceC12899a) {
                    super(1, md8.C9318a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                    this.f62012a = interfaceC12899a;
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(x3a x3aVar) {
                    m31048invoke58bKbWc(x3aVar.m33204unboximpl());
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m31048invoke58bKbWc(@yfb float[] fArr) {
                    C9506mt.startInput$localToScreen(this.f62012a, fArr);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(xxc xxcVar, qy6<? super a49, bth> qy6Var, C9506mt c9506mt, t39.InterfaceC12899a interfaceC12899a, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f62003c = xxcVar;
                this.f62004d = qy6Var;
                this.f62005e = c9506mt;
                this.f62006f = interfaceC12899a;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f62003c, this.f62004d, this.f62005e, this.f62006f, zy2Var);
                aVar.f62002b = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<?> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f62001a;
                try {
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        x13 x13Var = (x13) this.f62002b;
                        v38 v38VarInvoke = u39.getInputMethodManagerFactory().invoke(this.f62003c.getView());
                        a49 a49Var = new a49(this.f62003c.getView(), new C16492b(this.f62006f), v38VarInvoke);
                        if (ccg.isStylusHandwritingSupported()) {
                            fg1.launch$default(x13Var, null, null, new C16489a(this.f62005e, v38VarInvoke, null), 3, null);
                        }
                        qy6<a49, bth> qy6Var = this.f62004d;
                        if (qy6Var != null) {
                            qy6Var.invoke(a49Var);
                        }
                        this.f62005e.f61989d = a49Var;
                        xxc xxcVar = this.f62003c;
                        this.f62001a = 1;
                        if (xxcVar.startInputMethod(a49Var, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                    }
                    throw new us8();
                } catch (Throwable th) {
                    this.f62005e.f61989d = null;
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(qy6<? super a49, bth> qy6Var, C9506mt c9506mt, t39.InterfaceC12899a interfaceC12899a, zy2<? super b> zy2Var) {
            super(2, zy2Var);
            this.f61998c = qy6Var;
            this.f61999d = c9506mt;
            this.f62000e = interfaceC12899a;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            b bVar = new b(this.f61998c, this.f61999d, this.f62000e, zy2Var);
            bVar.f61997b = obj;
            return bVar;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb xxc xxcVar, @gib zy2<?> zy2Var) {
            return ((b) create(xxcVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f61996a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                a aVar = new a((xxc) this.f61997b, this.f61998c, this.f61999d, this.f62000e, null);
                this.f61996a = 1;
                if (y13.coroutineScope(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final v6b<bth> getStylusHandwritingTrigger() {
        v6b<bth> v6bVar = this.f61990e;
        if (v6bVar != null) {
            return v6bVar;
        }
        if (!ccg.isStylusHandwritingSupported()) {
            return null;
        }
        v6b<bth> v6bVarMutableSharedFlow$default = s9f.MutableSharedFlow$default(1, 0, gf1.f39659c, 2, null);
        this.f61990e = v6bVarMutableSharedFlow$default;
        return v6bVarMutableSharedFlow$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInput$localToScreen(t39.InterfaceC12899a interfaceC12899a, float[] fArr) {
        mv8 layoutCoordinates = interfaceC12899a.getLayoutCoordinates();
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates == null) {
                return;
            }
            layoutCoordinates.mo30045transformToScreen58bKbWc(fArr);
        }
    }

    @Override // p000.wxc
    public void notifyFocusedRect(@yfb rud rudVar) {
        a49 a49Var = this.f61989d;
        if (a49Var != null) {
            a49Var.notifyFocusedRect(rudVar);
        }
    }

    @Override // p000.wxc
    public void startInput(@yfb zsg zsgVar, @yfb nw7 nw7Var, @yfb qy6<? super List<? extends lw4>, bth> qy6Var, @yfb qy6<? super mw7, bth> qy6Var2) {
        startInput(new a(zsgVar, this, nw7Var, qy6Var, qy6Var2));
    }

    @Override // p000.t39
    public void startStylusHandwriting() {
        v6b<bth> stylusHandwritingTrigger = getStylusHandwritingTrigger();
        if (stylusHandwritingTrigger != null) {
            stylusHandwritingTrigger.tryEmit(bth.f14751a);
        }
    }

    @Override // p000.wxc
    public void stopInput() {
        jj8 jj8Var = this.f61988c;
        if (jj8Var != null) {
            jj8.C7916a.cancel$default(jj8Var, (CancellationException) null, 1, (Object) null);
        }
        this.f61988c = null;
        v6b<bth> stylusHandwritingTrigger = getStylusHandwritingTrigger();
        if (stylusHandwritingTrigger != null) {
            stylusHandwritingTrigger.resetReplayCache();
        }
    }

    @Override // p000.wxc
    public void updateState(@gib zsg zsgVar, @yfb zsg zsgVar2) {
        a49 a49Var = this.f61989d;
        if (a49Var != null) {
            a49Var.updateState(zsgVar, zsgVar2);
        }
    }

    @Override // p000.wxc
    public void updateTextLayoutResult(@yfb zsg zsgVar, @yfb nzb nzbVar, @yfb hug hugVar, @yfb qy6<? super x3a, bth> qy6Var, @yfb rud rudVar, @yfb rud rudVar2) {
        a49 a49Var = this.f61989d;
        if (a49Var != null) {
            a49Var.updateTextLayoutResult(zsgVar, nzbVar, hugVar, rudVar, rudVar2);
        }
    }

    @Override // p000.wxc
    public void startInput() {
        startInput(null);
    }

    private final void startInput(qy6<? super a49, bth> qy6Var) {
        t39.InterfaceC12899a interfaceC12899aM22351a = m22351a();
        if (interfaceC12899aM22351a == null) {
            return;
        }
        this.f61988c = interfaceC12899aM22351a.launchTextInputSession(new b(qy6Var, this, interfaceC12899aM22351a, null));
    }
}
