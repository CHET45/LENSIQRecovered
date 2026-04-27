package p000;

/* JADX INFO: loaded from: classes3.dex */
public interface kw3 extends f59 {
    default void onCreate(@yfb g59 g59Var) {
        md8.checkNotNullParameter(g59Var, "owner");
    }

    default void onDestroy(@yfb g59 g59Var) {
        md8.checkNotNullParameter(g59Var, "owner");
    }

    default void onPause(@yfb g59 g59Var) {
        md8.checkNotNullParameter(g59Var, "owner");
    }

    default void onResume(@yfb g59 g59Var) {
        md8.checkNotNullParameter(g59Var, "owner");
    }

    default void onStart(@yfb g59 g59Var) {
        md8.checkNotNullParameter(g59Var, "owner");
    }

    default void onStop(@yfb g59 g59Var) {
        md8.checkNotNullParameter(g59Var, "owner");
    }
}
