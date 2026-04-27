package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface gxa extends InterfaceC0701e.c {

    /* JADX INFO: renamed from: gxa$a */
    public static final class C6639a {
        @Deprecated
        public static boolean all(@yfb gxa gxaVar, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return gxa.super.all(qy6Var);
        }

        @Deprecated
        public static boolean any(@yfb gxa gxaVar, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return gxa.super.any(qy6Var);
        }

        @Deprecated
        public static <R> R foldIn(@yfb gxa gxaVar, R r, @yfb gz6<? super R, ? super InterfaceC0701e.c, ? extends R> gz6Var) {
            return (R) gxa.super.foldIn(r, gz6Var);
        }

        @Deprecated
        public static <R> R foldOut(@yfb gxa gxaVar, R r, @yfb gz6<? super InterfaceC0701e.c, ? super R, ? extends R> gz6Var) {
            return (R) gxa.super.foldOut(r, gz6Var);
        }

        @yfb
        @Deprecated
        public static InterfaceC0701e then(@yfb gxa gxaVar, @yfb InterfaceC0701e interfaceC0701e) {
            return gxa.super.then(interfaceC0701e);
        }
    }

    void onModifierLocalsUpdated(@yfb qxa qxaVar);
}
