package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.C0723l;

/* JADX INFO: loaded from: classes.dex */
@q64(message = "Use FocusRequesterModifierNode instead")
public interface fn6 extends InterfaceC0701e.c {

    /* JADX INFO: renamed from: fn6$a */
    public static final class C5893a {
        @Deprecated
        public static boolean all(@yfb fn6 fn6Var, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return fn6.super.all(qy6Var);
        }

        @Deprecated
        public static boolean any(@yfb fn6 fn6Var, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return fn6.super.any(qy6Var);
        }

        @Deprecated
        public static <R> R foldIn(@yfb fn6 fn6Var, R r, @yfb gz6<? super R, ? super InterfaceC0701e.c, ? extends R> gz6Var) {
            return (R) fn6.super.foldIn(r, gz6Var);
        }

        @Deprecated
        public static <R> R foldOut(@yfb fn6 fn6Var, R r, @yfb gz6<? super InterfaceC0701e.c, ? super R, ? extends R> gz6Var) {
            return (R) fn6.super.foldOut(r, gz6Var);
        }

        @yfb
        @Deprecated
        public static InterfaceC0701e then(@yfb fn6 fn6Var, @yfb InterfaceC0701e interfaceC0701e) {
            return fn6.super.then(interfaceC0701e);
        }
    }

    @yfb
    C0723l getFocusRequester();
}
