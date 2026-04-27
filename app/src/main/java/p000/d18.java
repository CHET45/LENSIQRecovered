package p000;

/* JADX INFO: loaded from: classes.dex */
public final class d18 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: d18$a */
    @dwf({"SMAP\nInfiniteAnimationPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteAnimationPolicy.kt\nandroidx/compose/animation/core/InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2\n*L\n1#1,42:1\n*E\n"})
    public static final class C4581a<R> extends tt8 implements qy6<Long, R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<Long, R> f28216a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4581a(qy6<? super Long, ? extends R> qy6Var) {
            super(1);
            this.f28216a = qy6Var;
        }

        public final R invoke(long j) {
            return this.f28216a.invoke(Long.valueOf(j / 1000000));
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Long l) {
            return invoke(l.longValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: d18$b */
    @ck3(m4009c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", m4010f = "InfiniteAnimationPolicy.kt", m4011i = {}, m4012l = {31}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C4582b<R> extends ugg implements qy6<zy2<? super R>, Object> {

        /* JADX INFO: renamed from: a */
        public int f28217a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<Long, R> f28218b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4582b(qy6<? super Long, ? extends R> qy6Var, zy2<? super C4582b> zy2Var) {
            super(1, zy2Var);
            this.f28218b = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return new C4582b(this.f28218b, zy2Var);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@gib zy2<? super R> zy2Var) {
            return ((C4582b) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f28217a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                qy6<Long, R> qy6Var = this.f28218b;
                this.f28217a = 1;
                obj = sya.withFrameNanos(qy6Var, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @gib
    public static final <R> Object withInfiniteAnimationFrameMillis(@yfb qy6<? super Long, ? extends R> qy6Var, @yfb zy2<? super R> zy2Var) {
        return withInfiniteAnimationFrameNanos(new C4581a(qy6Var), zy2Var);
    }

    private static final <R> Object withInfiniteAnimationFrameMillis$$forInline(qy6<? super Long, ? extends R> qy6Var, zy2<? super R> zy2Var) {
        C4581a c4581a = new C4581a(qy6Var);
        o28.mark(0);
        Object objWithInfiniteAnimationFrameNanos = withInfiniteAnimationFrameNanos(c4581a, zy2Var);
        o28.mark(1);
        return objWithInfiniteAnimationFrameNanos;
    }

    @gib
    public static final <R> Object withInfiniteAnimationFrameNanos(@yfb qy6<? super Long, ? extends R> qy6Var, @yfb zy2<? super R> zy2Var) {
        c18 c18Var = (c18) zy2Var.getContext().get(c18.f15459z);
        return c18Var == null ? sya.withFrameNanos(qy6Var, zy2Var) : c18Var.onInfiniteOperation(new C4582b(qy6Var, null), zy2Var);
    }
}
