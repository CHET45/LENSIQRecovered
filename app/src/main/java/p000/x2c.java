package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public interface x2c extends InterfaceC0701e.c {

    /* JADX INFO: renamed from: x2c$a */
    public static final class C14887a {
        @Deprecated
        public static boolean all(@yfb x2c x2cVar, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return x2c.super.all(qy6Var);
        }

        @Deprecated
        public static boolean any(@yfb x2c x2cVar, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return x2c.super.any(qy6Var);
        }

        @Deprecated
        public static <R> R foldIn(@yfb x2c x2cVar, R r, @yfb gz6<? super R, ? super InterfaceC0701e.c, ? extends R> gz6Var) {
            return (R) x2c.super.foldIn(r, gz6Var);
        }

        @Deprecated
        public static <R> R foldOut(@yfb x2c x2cVar, R r, @yfb gz6<? super InterfaceC0701e.c, ? super R, ? extends R> gz6Var) {
            return (R) x2c.super.foldOut(r, gz6Var);
        }

        @yfb
        @Deprecated
        public static InterfaceC0701e then(@yfb x2c x2cVar, @yfb InterfaceC0701e interfaceC0701e) {
            return x2c.super.then(interfaceC0701e);
        }
    }

    void onGloballyPositioned(@yfb mv8 mv8Var);
}
