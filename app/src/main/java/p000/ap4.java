package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public interface ap4 extends ep4 {

    /* JADX INFO: renamed from: ap4$a */
    public static final class C1544a {
        @Deprecated
        public static boolean all(@yfb ap4 ap4Var, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return ap4.super.all(qy6Var);
        }

        @Deprecated
        public static boolean any(@yfb ap4 ap4Var, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return ap4.super.any(qy6Var);
        }

        @Deprecated
        public static <R> R foldIn(@yfb ap4 ap4Var, R r, @yfb gz6<? super R, ? super InterfaceC0701e.c, ? extends R> gz6Var) {
            return (R) ap4.super.foldIn(r, gz6Var);
        }

        @Deprecated
        public static <R> R foldOut(@yfb ap4 ap4Var, R r, @yfb gz6<? super InterfaceC0701e.c, ? super R, ? extends R> gz6Var) {
            return (R) ap4.super.foldOut(r, gz6Var);
        }

        @yfb
        @Deprecated
        public static InterfaceC0701e then(@yfb ap4 ap4Var, @yfb InterfaceC0701e interfaceC0701e) {
            return ap4.super.then(interfaceC0701e);
        }
    }

    void onBuildCache(@yfb of1 of1Var);
}
