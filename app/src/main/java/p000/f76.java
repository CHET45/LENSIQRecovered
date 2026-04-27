package p000;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f76 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: f76$a */
    public static final class C5659a<T> implements t66<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<T, zy2<? super bth>, Object> f35608a;

        /* JADX INFO: renamed from: f76$a$a */
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f35609a;

            /* JADX INFO: renamed from: c */
            public int f35611c;

            public a(zy2<? super a> zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f35609a = obj;
                this.f35611c |= Integer.MIN_VALUE;
                return C5659a.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C5659a(gz6<? super T, ? super zy2<? super bth>, ? extends Object> gz6Var) {
            this.f35608a = gz6Var;
        }

        @Override // p000.t66
        public Object emit(T t, zy2<? super bth> zy2Var) {
            Object objInvoke = this.f35608a.invoke(t, zy2Var);
            return objInvoke == pd8.getCOROUTINE_SUSPENDED() ? objInvoke : bth.f14751a;
        }

        public Object emit$$forInline(T t, zy2<? super bth> zy2Var) {
            o28.mark(4);
            new a(zy2Var);
            o28.mark(5);
            this.f35608a.invoke(t, zy2Var);
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: f76$b */
    @dwf({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n*L\n1#1,114:1\n29#2,4:115\n*S KotlinDebug\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n*L\n58#1:115,4\n*E\n"})
    public static final class C5660b<T> implements t66<T> {

        /* JADX INFO: renamed from: a */
        public int f35612a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kz6<Integer, T, zy2<? super bth>, Object> f35613b;

        /* JADX INFO: renamed from: f76$b$a */
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f35614a;

            /* JADX INFO: renamed from: c */
            public int f35616c;

            public a(zy2<? super a> zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f35614a = obj;
                this.f35616c |= Integer.MIN_VALUE;
                return C5660b.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C5660b(kz6<? super Integer, ? super T, ? super zy2<? super bth>, ? extends Object> kz6Var) {
            this.f35613b = kz6Var;
        }

        @Override // p000.t66
        public Object emit(T t, zy2<? super bth> zy2Var) {
            kz6<Integer, T, zy2<? super bth>, Object> kz6Var = this.f35613b;
            int i = this.f35612a;
            this.f35612a = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            Object objInvoke = kz6Var.invoke(wc1.boxInt(i), t, zy2Var);
            return objInvoke == pd8.getCOROUTINE_SUSPENDED() ? objInvoke : bth.f14751a;
        }

        public Object emit$$forInline(T t, zy2<? super bth> zy2Var) {
            o28.mark(4);
            new a(zy2Var);
            o28.mark(5);
            kz6<Integer, T, zy2<? super bth>, Object> kz6Var = this.f35613b;
            int i = this.f35612a;
            this.f35612a = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            kz6Var.invoke(Integer.valueOf(i), t, zy2Var);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: f76$c */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", m4010f = "Collect.kt", m4011i = {}, m4012l = {46}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5661c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f35617a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ y56<T> f35618b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5661c(y56<? extends T> y56Var, zy2<? super C5661c> zy2Var) {
            super(2, zy2Var);
            this.f35618b = y56Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C5661c(this.f35618b, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C5661c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f35617a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                y56<T> y56Var = this.f35618b;
                this.f35617a = 1;
                if (c76.collect(y56Var, this) == coroutine_suspended) {
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

    @gib
    public static final Object collect(@yfb y56<?> y56Var, @yfb zy2<? super bth> zy2Var) {
        Object objCollect = y56Var.collect(qfb.f74307a, zy2Var);
        return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
    }

    @q64(level = u64.f86867c, message = "Backwards compatibility with JS and K/N")
    private static final /* synthetic */ <T> Object collect$$forInline(y56<? extends T> y56Var, gz6<? super T, ? super zy2<? super bth>, ? extends Object> gz6Var, zy2<? super bth> zy2Var) {
        C5659a c5659a = new C5659a(gz6Var);
        o28.mark(0);
        y56Var.collect(c5659a, zy2Var);
        o28.mark(1);
        return bth.f14751a;
    }

    @gib
    public static final <T> Object collectIndexed(@yfb y56<? extends T> y56Var, @yfb kz6<? super Integer, ? super T, ? super zy2<? super bth>, ? extends Object> kz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objCollect = y56Var.collect(new C5660b(kz6Var), zy2Var);
        return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
    }

    private static final <T> Object collectIndexed$$forInline(y56<? extends T> y56Var, kz6<? super Integer, ? super T, ? super zy2<? super bth>, ? extends Object> kz6Var, zy2<? super bth> zy2Var) {
        C5660b c5660b = new C5660b(kz6Var);
        o28.mark(0);
        y56Var.collect(c5660b, zy2Var);
        o28.mark(1);
        return bth.f14751a;
    }

    @gib
    public static final <T> Object collectLatest(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objCollect = c76.collect(h76.buffer$default(c76.mapLatest(y56Var, gz6Var), 0, null, 2, null), zy2Var);
        return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
    }

    @gib
    public static final <T> Object emitAll(@yfb t66<? super T> t66Var, @yfb y56<? extends T> y56Var, @yfb zy2<? super bth> zy2Var) {
        c76.ensureActive(t66Var);
        Object objCollect = y56Var.collect(t66Var, zy2Var);
        return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
    }

    @yfb
    public static final <T> jj8 launchIn(@yfb y56<? extends T> y56Var, @yfb x13 x13Var) {
        return fg1.launch$default(x13Var, null, null, new C5661c(y56Var, null), 3, null);
    }

    @q64(level = u64.f86867c, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> Object collect(y56<? extends T> y56Var, gz6<? super T, ? super zy2<? super bth>, ? extends Object> gz6Var, zy2<? super bth> zy2Var) {
        Object objCollect = y56Var.collect(new C5659a(gz6Var), zy2Var);
        return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
    }
}
