package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
public final class ez2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: ez2$a */
    public static final class C5533a<T> implements zy2<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e13 f34533a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<v7e<? extends T>, bth> f34534b;

        /* JADX WARN: Multi-variable type inference failed */
        public C5533a(e13 e13Var, qy6<? super v7e<? extends T>, bth> qy6Var) {
            this.f34533a = e13Var;
            this.f34534b = qy6Var;
        }

        @Override // p000.zy2
        public e13 getContext() {
            return this.f34533a;
        }

        @Override // p000.zy2
        public void resumeWith(Object obj) {
            this.f34534b.invoke(v7e.m32722boximpl(obj));
        }
    }

    @jjf(version = "1.3")
    @t28
    private static final <T> zy2<T> Continuation(e13 e13Var, qy6<? super v7e<? extends T>, bth> qy6Var) {
        md8.checkNotNullParameter(e13Var, "context");
        md8.checkNotNullParameter(qy6Var, "resumeWith");
        return new C5533a(e13Var, qy6Var);
    }

    @jjf(version = "1.3")
    @yfb
    public static final <T> zy2<bth> createCoroutine(@yfb qy6<? super zy2<? super T>, ? extends Object> qy6Var, @yfb zy2<? super T> zy2Var) {
        md8.checkNotNullParameter(qy6Var, "<this>");
        md8.checkNotNullParameter(zy2Var, "completion");
        return new oke(od8.intercepted(od8.createCoroutineUnintercepted(qy6Var, zy2Var)), pd8.getCOROUTINE_SUSPENDED());
    }

    private static final e13 getCoroutineContext() {
        throw new wfb("Implemented as intrinsic");
    }

    @jjf(version = "1.3")
    @t28
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    @jjf(version = "1.3")
    @t28
    private static final <T> void resume(zy2<? super T> zy2Var, T t) {
        md8.checkNotNullParameter(zy2Var, "<this>");
        v7e.C13927a c13927a = v7e.f90266b;
        zy2Var.resumeWith(v7e.m32723constructorimpl(t));
    }

    @jjf(version = "1.3")
    @t28
    private static final <T> void resumeWithException(zy2<? super T> zy2Var, Throwable th) {
        md8.checkNotNullParameter(zy2Var, "<this>");
        md8.checkNotNullParameter(th, "exception");
        v7e.C13927a c13927a = v7e.f90266b;
        zy2Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(th)));
    }

    @jjf(version = "1.3")
    public static final <T> void startCoroutine(@yfb qy6<? super zy2<? super T>, ? extends Object> qy6Var, @yfb zy2<? super T> zy2Var) {
        md8.checkNotNullParameter(qy6Var, "<this>");
        md8.checkNotNullParameter(zy2Var, "completion");
        zy2 zy2VarIntercepted = od8.intercepted(od8.createCoroutineUnintercepted(qy6Var, zy2Var));
        v7e.C13927a c13927a = v7e.f90266b;
        zy2VarIntercepted.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
    }

    @jjf(version = "1.3")
    @t28
    private static final <T> Object suspendCoroutine(qy6<? super zy2<? super T>, bth> qy6Var, zy2<? super T> zy2Var) throws Throwable {
        o28.mark(0);
        oke okeVar = new oke(od8.intercepted(zy2Var));
        qy6Var.invoke(okeVar);
        Object orThrow = okeVar.getOrThrow();
        if (orThrow == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        o28.mark(1);
        return orThrow;
    }

    @jjf(version = "1.3")
    @yfb
    public static final <R, T> zy2<bth> createCoroutine(@yfb gz6<? super R, ? super zy2<? super T>, ? extends Object> gz6Var, R r, @yfb zy2<? super T> zy2Var) {
        md8.checkNotNullParameter(gz6Var, "<this>");
        md8.checkNotNullParameter(zy2Var, "completion");
        return new oke(od8.intercepted(od8.createCoroutineUnintercepted(gz6Var, r, zy2Var)), pd8.getCOROUTINE_SUSPENDED());
    }

    @jjf(version = "1.3")
    public static final <R, T> void startCoroutine(@yfb gz6<? super R, ? super zy2<? super T>, ? extends Object> gz6Var, R r, @yfb zy2<? super T> zy2Var) {
        md8.checkNotNullParameter(gz6Var, "<this>");
        md8.checkNotNullParameter(zy2Var, "completion");
        zy2 zy2VarIntercepted = od8.intercepted(od8.createCoroutineUnintercepted(gz6Var, r, zy2Var));
        v7e.C13927a c13927a = v7e.f90266b;
        zy2VarIntercepted.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
    }
}
