package p000;

import p000.e13;
import p000.nxg;

/* JADX INFO: loaded from: classes7.dex */
@t54
@wg5
public interface g03<S> extends nxg<S> {

    /* JADX INFO: renamed from: g03$a */
    public static final class C6049a {
        public static <S, R> R fold(@yfb g03<S> g03Var, R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
            return (R) nxg.C10112a.fold(g03Var, r, gz6Var);
        }

        @gib
        public static <S, E extends e13.InterfaceC5040b> E get(@yfb g03<S> g03Var, @yfb e13.InterfaceC5041c<E> interfaceC5041c) {
            return (E) nxg.C10112a.get(g03Var, interfaceC5041c);
        }

        @yfb
        public static <S> e13 minusKey(@yfb g03<S> g03Var, @yfb e13.InterfaceC5041c<?> interfaceC5041c) {
            return nxg.C10112a.minusKey(g03Var, interfaceC5041c);
        }

        @yfb
        public static <S> e13 plus(@yfb g03<S> g03Var, @yfb e13 e13Var) {
            return nxg.C10112a.plus(g03Var, e13Var);
        }
    }

    @yfb
    g03<S> copyForChild();

    @yfb
    e13 mergeForChild(@yfb e13.InterfaceC5040b interfaceC5040b);
}
