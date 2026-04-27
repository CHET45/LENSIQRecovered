package p000;

import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
public interface dz2 extends e13.InterfaceC5040b {

    /* JADX INFO: renamed from: s */
    @yfb
    public static final C5021b f31343s = C5021b.f31344a;

    /* JADX INFO: renamed from: dz2$a */
    public static final class C5020a {
        public static <R> R fold(@yfb dz2 dz2Var, R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
            md8.checkNotNullParameter(gz6Var, "operation");
            return (R) e13.InterfaceC5040b.a.fold(dz2Var, r, gz6Var);
        }

        @gib
        public static <E extends e13.InterfaceC5040b> E get(@yfb dz2 dz2Var, @yfb e13.InterfaceC5041c<E> interfaceC5041c) {
            E e;
            md8.checkNotNullParameter(interfaceC5041c, "key");
            if (!(interfaceC5041c instanceof AbstractC13806v0)) {
                if (dz2.f31343s != interfaceC5041c) {
                    return null;
                }
                md8.checkNotNull(dz2Var, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dz2Var;
            }
            AbstractC13806v0 abstractC13806v0 = (AbstractC13806v0) interfaceC5041c;
            if (!abstractC13806v0.isSubKey$kotlin_stdlib(dz2Var.getKey()) || (e = (E) abstractC13806v0.tryCast$kotlin_stdlib(dz2Var)) == null) {
                return null;
            }
            return e;
        }

        @yfb
        public static e13 minusKey(@yfb dz2 dz2Var, @yfb e13.InterfaceC5041c<?> interfaceC5041c) {
            md8.checkNotNullParameter(interfaceC5041c, "key");
            if (!(interfaceC5041c instanceof AbstractC13806v0)) {
                return dz2.f31343s == interfaceC5041c ? a05.f2a : dz2Var;
            }
            AbstractC13806v0 abstractC13806v0 = (AbstractC13806v0) interfaceC5041c;
            return (!abstractC13806v0.isSubKey$kotlin_stdlib(dz2Var.getKey()) || abstractC13806v0.tryCast$kotlin_stdlib(dz2Var) == null) ? dz2Var : a05.f2a;
        }

        @yfb
        public static e13 plus(@yfb dz2 dz2Var, @yfb e13 e13Var) {
            md8.checkNotNullParameter(e13Var, "context");
            return e13.InterfaceC5040b.a.plus(dz2Var, e13Var);
        }

        public static void releaseInterceptedContinuation(@yfb dz2 dz2Var, @yfb zy2<?> zy2Var) {
            md8.checkNotNullParameter(zy2Var, "continuation");
        }
    }

    /* JADX INFO: renamed from: dz2$b */
    public static final class C5021b implements e13.InterfaceC5041c<dz2> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C5021b f31344a = new C5021b();

        private C5021b() {
        }
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @gib
    <E extends e13.InterfaceC5040b> E get(@yfb e13.InterfaceC5041c<E> interfaceC5041c);

    @yfb
    <T> zy2<T> interceptContinuation(@yfb zy2<? super T> zy2Var);

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @yfb
    e13 minusKey(@yfb e13.InterfaceC5041c<?> interfaceC5041c);

    void releaseInterceptedContinuation(@yfb zy2<?> zy2Var);
}
