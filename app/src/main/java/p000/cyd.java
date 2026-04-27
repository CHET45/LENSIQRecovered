package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public interface cyd extends InterfaceC0701e.c {

    /* JADX INFO: renamed from: cyd$a */
    public static final class C4566a {
        @Deprecated
        public static boolean all(@yfb cyd cydVar, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return cyd.super.all(qy6Var);
        }

        @Deprecated
        public static boolean any(@yfb cyd cydVar, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return cyd.super.any(qy6Var);
        }

        @Deprecated
        public static <R> R foldIn(@yfb cyd cydVar, R r, @yfb gz6<? super R, ? super InterfaceC0701e.c, ? extends R> gz6Var) {
            return (R) cyd.super.foldIn(r, gz6Var);
        }

        @Deprecated
        public static <R> R foldOut(@yfb cyd cydVar, R r, @yfb gz6<? super InterfaceC0701e.c, ? super R, ? extends R> gz6Var) {
            return (R) cyd.super.foldOut(r, gz6Var);
        }

        @yfb
        @Deprecated
        public static InterfaceC0701e then(@yfb cyd cydVar, @yfb InterfaceC0701e interfaceC0701e) {
            return cyd.super.then(interfaceC0701e);
        }
    }

    void onRemeasurementAvailable(@yfb byd bydVar);
}
