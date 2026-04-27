package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@q64(message = "Use FocusEventModifierNode instead")
public interface mm6 extends InterfaceC0701e.c {

    /* JADX INFO: renamed from: mm6$a */
    public static final class C9408a {
        @Deprecated
        public static boolean all(@yfb mm6 mm6Var, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return mm6.super.all(qy6Var);
        }

        @Deprecated
        public static boolean any(@yfb mm6 mm6Var, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return mm6.super.any(qy6Var);
        }

        @Deprecated
        public static <R> R foldIn(@yfb mm6 mm6Var, R r, @yfb gz6<? super R, ? super InterfaceC0701e.c, ? extends R> gz6Var) {
            return (R) mm6.super.foldIn(r, gz6Var);
        }

        @Deprecated
        public static <R> R foldOut(@yfb mm6 mm6Var, R r, @yfb gz6<? super InterfaceC0701e.c, ? super R, ? extends R> gz6Var) {
            return (R) mm6.super.foldOut(r, gz6Var);
        }

        @yfb
        @Deprecated
        public static InterfaceC0701e then(@yfb mm6 mm6Var, @yfb InterfaceC0701e interfaceC0701e) {
            return mm6.super.then(interfaceC0701e);
        }
    }

    void onFocusEvent(@yfb in6 in6Var);
}
