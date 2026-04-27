package p000;

import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
public interface n13 extends e13.InterfaceC5040b {

    /* JADX INFO: renamed from: t */
    @yfb
    public static final C9643b f62944t = C9643b.f62945a;

    /* JADX INFO: renamed from: n13$a */
    public static final class C9642a {
        public static <R> R fold(@yfb n13 n13Var, R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
            return (R) e13.InterfaceC5040b.a.fold(n13Var, r, gz6Var);
        }

        @gib
        public static <E extends e13.InterfaceC5040b> E get(@yfb n13 n13Var, @yfb e13.InterfaceC5041c<E> interfaceC5041c) {
            return (E) e13.InterfaceC5040b.a.get(n13Var, interfaceC5041c);
        }

        @yfb
        public static e13 minusKey(@yfb n13 n13Var, @yfb e13.InterfaceC5041c<?> interfaceC5041c) {
            return e13.InterfaceC5040b.a.minusKey(n13Var, interfaceC5041c);
        }

        @yfb
        public static e13 plus(@yfb n13 n13Var, @yfb e13 e13Var) {
            return e13.InterfaceC5040b.a.plus(n13Var, e13Var);
        }
    }

    /* JADX INFO: renamed from: n13$b */
    public static final class C9643b implements e13.InterfaceC5041c<n13> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C9643b f62945a = new C9643b();

        private C9643b() {
        }
    }

    void handleException(@yfb e13 e13Var, @yfb Throwable th);
}
