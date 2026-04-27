package p000;

/* JADX INFO: loaded from: classes.dex */
public final class e18 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: e18$a */
    @ck3(m4009c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", m4010f = "InfiniteAnimationPolicy.kt", m4011i = {}, m4012l = {65}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5042a<R> extends ugg implements qy6<zy2<? super R>, Object> {

        /* JADX INFO: renamed from: a */
        public int f31500a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<Long, R> f31501b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5042a(qy6<? super Long, ? extends R> qy6Var, zy2<? super C5042a> zy2Var) {
            super(1, zy2Var);
            this.f31501b = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return new C5042a(this.f31501b, zy2Var);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@gib zy2<? super R> zy2Var) {
            return ((C5042a) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f31500a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                qy6<Long, R> qy6Var = this.f31501b;
                this.f31500a = 1;
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
    public static final <R> Object withInfiniteAnimationFrameNanos(@yfb qy6<? super Long, ? extends R> qy6Var, @yfb zy2<? super R> zy2Var) {
        c18 c18Var = (c18) zy2Var.getContext().get(c18.f15459z);
        return c18Var == null ? sya.withFrameNanos(qy6Var, zy2Var) : c18Var.onInfiniteOperation(new C5042a(qy6Var, null), zy2Var);
    }
}
