package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public interface ep4 extends InterfaceC0701e.c {

    /* JADX INFO: renamed from: ep4$a */
    public static final class C5428a {
        @Deprecated
        public static boolean all(@yfb ep4 ep4Var, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return ep4.super.all(qy6Var);
        }

        @Deprecated
        public static boolean any(@yfb ep4 ep4Var, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return ep4.super.any(qy6Var);
        }

        @Deprecated
        public static <R> R foldIn(@yfb ep4 ep4Var, R r, @yfb gz6<? super R, ? super InterfaceC0701e.c, ? extends R> gz6Var) {
            return (R) ep4.super.foldIn(r, gz6Var);
        }

        @Deprecated
        public static <R> R foldOut(@yfb ep4 ep4Var, R r, @yfb gz6<? super InterfaceC0701e.c, ? super R, ? extends R> gz6Var) {
            return (R) ep4.super.foldOut(r, gz6Var);
        }

        @yfb
        @Deprecated
        public static InterfaceC0701e then(@yfb ep4 ep4Var, @yfb InterfaceC0701e interfaceC0701e) {
            return ep4.super.then(interfaceC0701e);
        }
    }

    void draw(@yfb ov2 ov2Var);
}
