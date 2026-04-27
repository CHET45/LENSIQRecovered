package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n1#1,120:1\n66#1:121\n*S KotlinDebug\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n108#1:121\n*E\n"})
public final class sya {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: sya$a */
    @dwf({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt$withFrameMillis$2\n*L\n1#1,120:1\n*E\n"})
    public static final class C12828a<R> extends tt8 implements qy6<Long, R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<Long, R> f83223a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12828a(qy6<? super Long, ? extends R> qy6Var) {
            super(1);
            this.f83223a = qy6Var;
        }

        public final R invoke(long j) {
            return this.f83223a.invoke(Long.valueOf(j / 1000000));
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Long l) {
            return invoke(l.longValue());
        }
    }

    @yfb
    public static final rya getMonotonicFrameClock(@yfb e13 e13Var) {
        rya ryaVar = (rya) e13Var.get(rya.f80099P);
        if (ryaVar != null) {
            return ryaVar;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    @sg5
    public static /* synthetic */ void getMonotonicFrameClock$annotations(e13 e13Var) {
    }

    @gib
    public static final <R> Object withFrameMillis(@yfb rya ryaVar, @yfb qy6<? super Long, ? extends R> qy6Var, @yfb zy2<? super R> zy2Var) {
        return ryaVar.withFrameNanos(new C12828a(qy6Var), zy2Var);
    }

    private static final <R> Object withFrameMillis$$forInline(rya ryaVar, qy6<? super Long, ? extends R> qy6Var, zy2<? super R> zy2Var) {
        C12828a c12828a = new C12828a(qy6Var);
        o28.mark(0);
        Object objWithFrameNanos = ryaVar.withFrameNanos(c12828a, zy2Var);
        o28.mark(1);
        return objWithFrameNanos;
    }

    @gib
    public static final <R> Object withFrameNanos(@yfb qy6<? super Long, ? extends R> qy6Var, @yfb zy2<? super R> zy2Var) {
        return getMonotonicFrameClock(zy2Var.getContext()).withFrameNanos(qy6Var, zy2Var);
    }

    @gib
    public static final <R> Object withFrameMillis(@yfb qy6<? super Long, ? extends R> qy6Var, @yfb zy2<? super R> zy2Var) {
        return getMonotonicFrameClock(zy2Var.getContext()).withFrameNanos(new C12828a(qy6Var), zy2Var);
    }
}
