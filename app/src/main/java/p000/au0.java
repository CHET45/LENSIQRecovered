package p000;

/* JADX INFO: loaded from: classes4.dex */
public interface au0 {

    /* JADX INFO: renamed from: au0$a */
    public static final class C1609a {
        @yfb
        public static ar0 addDraggableModule(au0 au0Var, @yfb mt0<?, ?> mt0Var) {
            md8.checkParameterIsNotNull(mt0Var, "baseQuickAdapter");
            return new ar0(mt0Var);
        }

        @yfb
        public static sr0 addLoadMoreModule(au0 au0Var, @yfb mt0<?, ?> mt0Var) {
            md8.checkParameterIsNotNull(mt0Var, "baseQuickAdapter");
            return new sr0(mt0Var);
        }

        @yfb
        public static qu0 addUpFetchModule(au0 au0Var, @yfb mt0<?, ?> mt0Var) {
            md8.checkParameterIsNotNull(mt0Var, "baseQuickAdapter");
            return new qu0(mt0Var);
        }
    }

    @yfb
    ar0 addDraggableModule(@yfb mt0<?, ?> mt0Var);

    @yfb
    sr0 addLoadMoreModule(@yfb mt0<?, ?> mt0Var);

    @yfb
    qu0 addUpFetchModule(@yfb mt0<?, ?> mt0Var);
}
