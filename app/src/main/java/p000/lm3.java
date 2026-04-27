package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
public final class lm3<T, R> extends km3<T, R> implements zy2<R> {

    /* JADX INFO: renamed from: a */
    @yfb
    public kz6<? super km3<?, ?>, Object, ? super zy2<Object>, ? extends Object> f58215a;

    /* JADX INFO: renamed from: b */
    @gib
    public Object f58216b;

    /* JADX INFO: renamed from: c */
    @gib
    public zy2<Object> f58217c;

    /* JADX INFO: renamed from: d */
    @yfb
    public Object f58218d;

    /* JADX INFO: renamed from: lm3$a */
    @dwf({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n+ 2 DeepRecursive.kt\nkotlin/DeepRecursiveScopeImpl\n*L\n1#1,71:1\n182#2,6:72\n*E\n"})
    public static final class C8897a implements zy2<Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e13 f58219a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ lm3 f58220b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ kz6 f58221c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ zy2 f58222d;

        public C8897a(e13 e13Var, lm3 lm3Var, kz6 kz6Var, zy2 zy2Var) {
            this.f58219a = e13Var;
            this.f58220b = lm3Var;
            this.f58221c = kz6Var;
            this.f58222d = zy2Var;
        }

        @Override // p000.zy2
        public e13 getContext() {
            return this.f58219a;
        }

        @Override // p000.zy2
        public void resumeWith(Object obj) {
            this.f58220b.f58215a = this.f58221c;
            this.f58220b.f58217c = this.f58222d;
            this.f58220b.f58218d = obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lm3(@yfb kz6<? super km3<T, R>, ? super T, ? super zy2<? super R>, ? extends Object> kz6Var, T t) {
        super(null);
        md8.checkNotNullParameter(kz6Var, "block");
        this.f58215a = kz6Var;
        this.f58216b = t;
        md8.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f58217c = this;
        this.f58218d = jm3.f51145a;
    }

    private final zy2<Object> crossFunctionCompletion(kz6<? super km3<?, ?>, Object, ? super zy2<Object>, ? extends Object> kz6Var, zy2<Object> zy2Var) {
        return new C8897a(a05.f2a, this, kz6Var, zy2Var);
    }

    @Override // p000.km3
    @gib
    public Object callRecursive(T t, @yfb zy2<? super R> zy2Var) {
        md8.checkNotNull(zy2Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f58217c = zy2Var;
        this.f58216b = t;
        Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return coroutine_suspended;
    }

    @Override // p000.zy2
    @yfb
    public e13 getContext() {
        return a05.f2a;
    }

    @Override // p000.zy2
    public void resumeWith(@yfb Object obj) {
        this.f58217c = null;
        this.f58218d = obj;
    }

    public final R runCallLoop() {
        while (true) {
            R r = (R) this.f58218d;
            zy2<Object> zy2Var = this.f58217c;
            if (zy2Var == null) {
                y7e.throwOnFailure(r);
                return r;
            }
            if (v7e.m32725equalsimpl0(jm3.f51145a, r)) {
                try {
                    kz6<? super km3<?, ?>, Object, ? super zy2<Object>, ? extends Object> kz6Var = this.f58215a;
                    Object obj = this.f58216b;
                    Object objWrapWithContinuationImpl = !(kz6Var instanceof tq0) ? od8.wrapWithContinuationImpl(kz6Var, this, obj, zy2Var) : ((kz6) qlh.beforeCheckcastToFunctionOfArity(kz6Var, 3)).invoke(this, obj, zy2Var);
                    if (objWrapWithContinuationImpl != pd8.getCOROUTINE_SUSPENDED()) {
                        v7e.C13927a c13927a = v7e.f90266b;
                        zy2Var.resumeWith(v7e.m32723constructorimpl(objWrapWithContinuationImpl));
                    }
                } catch (Throwable th) {
                    v7e.C13927a c13927a2 = v7e.f90266b;
                    zy2Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(th)));
                }
            } else {
                this.f58218d = jm3.f51145a;
                zy2Var.resumeWith(r);
            }
        }
    }

    @Override // p000.km3
    @gib
    public <U, S> Object callRecursive(@yfb im3<U, S> im3Var, U u, @yfb zy2<? super S> zy2Var) {
        kz6<km3<U, S>, U, zy2<? super S>, Object> block$kotlin_stdlib = im3Var.getBlock$kotlin_stdlib();
        md8.checkNotNull(block$kotlin_stdlib, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>");
        kz6<? super km3<?, ?>, Object, ? super zy2<Object>, ? extends Object> kz6Var = this.f58215a;
        if (block$kotlin_stdlib != kz6Var) {
            this.f58215a = block$kotlin_stdlib;
            md8.checkNotNull(zy2Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f58217c = crossFunctionCompletion(kz6Var, zy2Var);
        } else {
            md8.checkNotNull(zy2Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f58217c = zy2Var;
        }
        this.f58216b = u;
        Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return coroutine_suspended;
    }
}
