package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
public interface cw8 extends InterfaceC0701e.c {

    /* JADX INFO: renamed from: cw8$a */
    public static final class C4541a {
        @Deprecated
        public static boolean all(@yfb cw8 cw8Var, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return cw8.super.all(qy6Var);
        }

        @Deprecated
        public static boolean any(@yfb cw8 cw8Var, @yfb qy6<? super InterfaceC0701e.c, Boolean> qy6Var) {
            return cw8.super.any(qy6Var);
        }

        @Deprecated
        public static <R> R foldIn(@yfb cw8 cw8Var, R r, @yfb gz6<? super R, ? super InterfaceC0701e.c, ? extends R> gz6Var) {
            return (R) cw8.super.foldIn(r, gz6Var);
        }

        @Deprecated
        public static <R> R foldOut(@yfb cw8 cw8Var, R r, @yfb gz6<? super InterfaceC0701e.c, ? super R, ? extends R> gz6Var) {
            return (R) cw8.super.foldOut(r, gz6Var);
        }

        @Deprecated
        public static int maxIntrinsicHeight(@yfb cw8 cw8Var, @yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
            return cw8.super.maxIntrinsicHeight(gd8Var, ed8Var, i);
        }

        @Deprecated
        public static int maxIntrinsicWidth(@yfb cw8 cw8Var, @yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
            return cw8.super.maxIntrinsicWidth(gd8Var, ed8Var, i);
        }

        @Deprecated
        public static int minIntrinsicHeight(@yfb cw8 cw8Var, @yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
            return cw8.super.minIntrinsicHeight(gd8Var, ed8Var, i);
        }

        @Deprecated
        public static int minIntrinsicWidth(@yfb cw8 cw8Var, @yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
            return cw8.super.minIntrinsicWidth(gd8Var, ed8Var, i);
        }

        @yfb
        @Deprecated
        public static InterfaceC0701e then(@yfb cw8 cw8Var, @yfb InterfaceC0701e interfaceC0701e) {
            return cw8.super.then(interfaceC0701e);
        }
    }

    default int maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return rca.f77816a.maxHeight(this, gd8Var, ed8Var, i);
    }

    default int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return rca.f77816a.maxWidth(this, gd8Var, ed8Var, i);
    }

    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    vba mo27254measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j);

    default int minIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return rca.f77816a.minHeight(this, gd8Var, ed8Var, i);
    }

    default int minIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return rca.f77816a.minWidth(this, gd8Var, ed8Var, i);
    }
}
