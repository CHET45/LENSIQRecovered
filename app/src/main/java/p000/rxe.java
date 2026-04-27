package p000;

/* JADX INFO: loaded from: classes.dex */
public interface rxe extends v34 {
    void applySemantics(@yfb eye eyeVar);

    default boolean getShouldClearDescendantSemantics() {
        return false;
    }

    default boolean getShouldMergeDescendantSemantics() {
        return false;
    }
}
