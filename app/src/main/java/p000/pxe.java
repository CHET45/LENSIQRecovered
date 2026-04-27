package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public interface pxe extends InterfaceC0701e.c {

    /* JADX INFO: renamed from: pxe$a */
    public static final class C11175a {
        @Deprecated
        public static boolean all(@yfb pxe pxeVar, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return pxe.super.all(qy6Var);
        }

        @Deprecated
        public static boolean any(@yfb pxe pxeVar, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return pxe.super.any(qy6Var);
        }

        @Deprecated
        public static <R> R foldIn(@yfb pxe pxeVar, R r, @yfb gz6<? super R, ? super InterfaceC0701e.c, ? extends R> gz6Var) {
            return (R) pxe.super.foldIn(r, gz6Var);
        }

        @Deprecated
        public static <R> R foldOut(@yfb pxe pxeVar, R r, @yfb gz6<? super InterfaceC0701e.c, ? super R, ? extends R> gz6Var) {
            return (R) pxe.super.foldOut(r, gz6Var);
        }

        @Deprecated
        public static int getId(@yfb pxe pxeVar) {
            return pxe.super.getId();
        }

        @q64(message = "SemanticsModifier.id is now unused and has been set to a fixed value. Retrieve the id from LayoutInfo instead.", replaceWith = @i2e(expression = "", imports = {}))
        public static /* synthetic */ void getId$annotations() {
        }

        @yfb
        @Deprecated
        public static InterfaceC0701e then(@yfb pxe pxeVar, @yfb InterfaceC0701e interfaceC0701e) {
            return pxe.super.then(interfaceC0701e);
        }
    }

    default int getId() {
        return -1;
    }

    @yfb
    nxe getSemanticsConfiguration();
}
