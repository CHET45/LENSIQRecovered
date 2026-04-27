package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public interface ahc extends InterfaceC0701e.c {

    /* JADX INFO: renamed from: ahc$a */
    public static final class C0252a {
        @Deprecated
        public static boolean all(@yfb ahc ahcVar, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return ahc.super.all(qy6Var);
        }

        @Deprecated
        public static boolean any(@yfb ahc ahcVar, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return ahc.super.any(qy6Var);
        }

        @Deprecated
        public static <R> R foldIn(@yfb ahc ahcVar, R r, @yfb gz6<? super R, ? super InterfaceC0701e.c, ? extends R> gz6Var) {
            return (R) ahc.super.foldIn(r, gz6Var);
        }

        @Deprecated
        public static <R> R foldOut(@yfb ahc ahcVar, R r, @yfb gz6<? super InterfaceC0701e.c, ? super R, ? extends R> gz6Var) {
            return (R) ahc.super.foldOut(r, gz6Var);
        }

        @yfb
        @Deprecated
        public static InterfaceC0701e then(@yfb ahc ahcVar, @yfb InterfaceC0701e interfaceC0701e) {
            return ahc.super.then(interfaceC0701e);
        }
    }

    @gib
    Object modifyParentData(@yfb c64 c64Var, @gib Object obj);
}
