package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@q64(message = "Use Modifier.focusProperties() instead")
public interface wm6 extends InterfaceC0701e.c {

    /* JADX INFO: renamed from: wm6$a */
    public static final class C14688a {
        @Deprecated
        public static boolean all(@yfb wm6 wm6Var, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return wm6.super.all(qy6Var);
        }

        @Deprecated
        public static boolean any(@yfb wm6 wm6Var, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return wm6.super.any(qy6Var);
        }

        @Deprecated
        public static <R> R foldIn(@yfb wm6 wm6Var, R r, @yfb gz6<? super R, ? super InterfaceC0701e.c, ? extends R> gz6Var) {
            return (R) wm6.super.foldIn(r, gz6Var);
        }

        @Deprecated
        public static <R> R foldOut(@yfb wm6 wm6Var, R r, @yfb gz6<? super InterfaceC0701e.c, ? super R, ? extends R> gz6Var) {
            return (R) wm6.super.foldOut(r, gz6Var);
        }

        @yfb
        @Deprecated
        public static InterfaceC0701e then(@yfb wm6 wm6Var, @yfb InterfaceC0701e interfaceC0701e) {
            return wm6.super.then(interfaceC0701e);
        }
    }

    void populateFocusOrder(@yfb vm6 vm6Var);
}
