package p000;

import p000.dq1;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,246:1\n81#2:247\n107#2,2:248\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl\n*L\n127#1:247\n127#1:248,2\n*E\n"})
public final class lw0 implements kw0 {

    /* JADX INFO: renamed from: a */
    public final boolean f58939a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final x7b f58940b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final z6b f58941c;

    /* JADX INFO: renamed from: d */
    @gib
    public dq1<? super bth> f58942d;

    /* JADX INFO: renamed from: lw0$a */
    @ck3(m4009c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2", m4010f = "BasicTooltip.kt", m4011i = {}, m4012l = {156, 158}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C8992a extends ugg implements qy6<zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f58943a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<zy2<? super bth>, Object> f58945c;

        /* JADX INFO: renamed from: lw0$a$a */
        @ck3(m4009c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2$1", m4010f = "BasicTooltip.kt", m4011i = {}, m4012l = {159}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f58946a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ qy6<zy2<? super bth>, Object> f58947b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(qy6<? super zy2<? super bth>, ? extends Object> qy6Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f58947b = qy6Var;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f58947b, zy2Var);
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
                int i = this.f58946a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    qy6<zy2<? super bth>, Object> qy6Var = this.f58947b;
                    this.f58946a = 1;
                    if (qy6Var.invoke(this) == coroutine_suspended) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public C8992a(qy6<? super zy2<? super bth>, ? extends Object> qy6Var, zy2<? super C8992a> zy2Var) {
            super(1, zy2Var);
            this.f58945c = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return lw0.this.new C8992a(this.f58945c, zy2Var);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@gib zy2<? super bth> zy2Var) {
            return ((C8992a) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f58943a;
            try {
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    if (lw0.this.isPersistent()) {
                        qy6<zy2<? super bth>, Object> qy6Var = this.f58945c;
                        this.f58943a = 1;
                        if (qy6Var.invoke(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        a aVar = new a(this.f58945c, null);
                        this.f58943a = 2;
                        if (c2h.withTimeout(1500L, aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                lw0.this.setVisible(false);
                return bth.f14751a;
            } catch (Throwable th) {
                lw0.this.setVisible(false);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: lw0$b */
    @ck3(m4009c = "androidx.compose.foundation.BasicTooltipStateImpl$show$cancellableShow$1", m4010f = "BasicTooltip.kt", m4011i = {}, m4012l = {247}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl$show$cancellableShow$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,246:1\n314#2,11:247\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl$show$cancellableShow$1\n*L\n145#1:247,11\n*E\n"})
    public static final class C8993b extends ugg implements qy6<zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f58948a;

        /* JADX INFO: renamed from: b */
        public int f58949b;

        public C8993b(zy2<? super C8993b> zy2Var) {
            super(1, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return lw0.this.new C8993b(zy2Var);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@gib zy2<? super bth> zy2Var) {
            return ((C8993b) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f58949b;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                lw0 lw0Var = lw0.this;
                this.f58948a = lw0Var;
                this.f58949b = 1;
                fq1 fq1Var = new fq1(od8.intercepted(this), 1);
                fq1Var.initCancellability();
                lw0Var.setVisible(true);
                lw0Var.f58942d = fq1Var;
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
            return bth.f14751a;
        }
    }

    public lw0(boolean z, boolean z2, @yfb x7b x7bVar) {
        this.f58939a = z2;
        this.f58940b = x7bVar;
        this.f58941c = xtf.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    @Override // p000.kw0
    public void dismiss() {
        setVisible(false);
    }

    @Override // p000.kw0
    public boolean isPersistent() {
        return this.f58939a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.kw0
    public boolean isVisible() {
        return ((Boolean) this.f58941c.getValue()).booleanValue();
    }

    @Override // p000.kw0
    public void onDispose() {
        dq1<? super bth> dq1Var = this.f58942d;
        if (dq1Var != null) {
            dq1.C4906a.cancel$default(dq1Var, null, 1, null);
        }
    }

    public void setVisible(boolean z) {
        this.f58941c.setValue(Boolean.valueOf(z));
    }

    @Override // p000.kw0
    @gib
    public Object show(@yfb j7b j7bVar, @yfb zy2<? super bth> zy2Var) {
        Object objMutate = this.f58940b.mutate(j7bVar, new C8992a(new C8993b(null), null), zy2Var);
        return objMutate == pd8.getCOROUTINE_SUSPENDED() ? objMutate : bth.f14751a;
    }
}
