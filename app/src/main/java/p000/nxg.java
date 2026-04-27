package p000;

import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
public interface nxg<S> extends e13.InterfaceC5040b {

    /* JADX INFO: renamed from: nxg$a */
    public static final class C10112a {
        public static <S, R> R fold(@yfb nxg<S> nxgVar, R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
            return (R) e13.InterfaceC5040b.a.fold(nxgVar, r, gz6Var);
        }

        @gib
        public static <S, E extends e13.InterfaceC5040b> E get(@yfb nxg<S> nxgVar, @yfb e13.InterfaceC5041c<E> interfaceC5041c) {
            return (E) e13.InterfaceC5040b.a.get(nxgVar, interfaceC5041c);
        }

        @yfb
        public static <S> e13 minusKey(@yfb nxg<S> nxgVar, @yfb e13.InterfaceC5041c<?> interfaceC5041c) {
            return e13.InterfaceC5040b.a.minusKey(nxgVar, interfaceC5041c);
        }

        @yfb
        public static <S> e13 plus(@yfb nxg<S> nxgVar, @yfb e13 e13Var) {
            return e13.InterfaceC5040b.a.plus(nxgVar, e13Var);
        }
    }

    void restoreThreadContext(@yfb e13 e13Var, S s);

    S updateThreadContext(@yfb e13 e13Var);
}
