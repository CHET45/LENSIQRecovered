package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public interface o2d extends InterfaceC0701e.c {

    /* JADX INFO: renamed from: o2d$a */
    public static final class C10154a {
        @Deprecated
        public static boolean all(@yfb o2d o2dVar, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return o2d.super.all(qy6Var);
        }

        @Deprecated
        public static boolean any(@yfb o2d o2dVar, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return o2d.super.any(qy6Var);
        }

        @Deprecated
        public static <R> R foldIn(@yfb o2d o2dVar, R r, @yfb gz6<? super R, ? super InterfaceC0701e.c, ? extends R> gz6Var) {
            return (R) o2d.super.foldIn(r, gz6Var);
        }

        @Deprecated
        public static <R> R foldOut(@yfb o2d o2dVar, R r, @yfb gz6<? super InterfaceC0701e.c, ? super R, ? extends R> gz6Var) {
            return (R) o2d.super.foldOut(r, gz6Var);
        }

        @yfb
        @Deprecated
        public static InterfaceC0701e then(@yfb o2d o2dVar, @yfb InterfaceC0701e interfaceC0701e) {
            return o2d.super.then(interfaceC0701e);
        }
    }

    @yfb
    n2d getPointerInputFilter();
}
