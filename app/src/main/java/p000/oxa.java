package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface oxa<T> extends InterfaceC0701e.c {

    /* JADX INFO: renamed from: oxa$a */
    public static final class C10710a {
        @Deprecated
        public static <T> boolean all(@yfb oxa<T> oxaVar, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return oxa.super.all(qy6Var);
        }

        @Deprecated
        public static <T> boolean any(@yfb oxa<T> oxaVar, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return oxa.super.any(qy6Var);
        }

        @Deprecated
        public static <T, R> R foldIn(@yfb oxa<T> oxaVar, R r, @yfb gz6<? super R, ? super InterfaceC0701e.c, ? extends R> gz6Var) {
            return (R) oxa.super.foldIn(r, gz6Var);
        }

        @Deprecated
        public static <T, R> R foldOut(@yfb oxa<T> oxaVar, R r, @yfb gz6<? super InterfaceC0701e.c, ? super R, ? extends R> gz6Var) {
            return (R) oxa.super.foldOut(r, gz6Var);
        }

        @yfb
        @Deprecated
        public static <T> InterfaceC0701e then(@yfb oxa<T> oxaVar, @yfb InterfaceC0701e interfaceC0701e) {
            return oxa.super.then(interfaceC0701e);
        }
    }

    @yfb
    aid<T> getKey();

    T getValue();
}
