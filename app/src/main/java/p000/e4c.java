package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public interface e4c extends InterfaceC0701e.c {

    /* JADX INFO: renamed from: e4c$a */
    public static final class C5113a {
        @Deprecated
        public static boolean all(@yfb e4c e4cVar, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return e4c.super.all(qy6Var);
        }

        @Deprecated
        public static boolean any(@yfb e4c e4cVar, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return e4c.super.any(qy6Var);
        }

        @Deprecated
        public static <R> R foldIn(@yfb e4c e4cVar, R r, @yfb gz6<? super R, ? super InterfaceC0701e.c, ? extends R> gz6Var) {
            return (R) e4c.super.foldIn(r, gz6Var);
        }

        @Deprecated
        public static <R> R foldOut(@yfb e4c e4cVar, R r, @yfb gz6<? super InterfaceC0701e.c, ? super R, ? extends R> gz6Var) {
            return (R) e4c.super.foldOut(r, gz6Var);
        }

        @yfb
        @Deprecated
        public static InterfaceC0701e then(@yfb e4c e4cVar, @yfb InterfaceC0701e interfaceC0701e) {
            return e4c.super.then(interfaceC0701e);
        }
    }

    void onPlaced(@yfb mv8 mv8Var);
}
