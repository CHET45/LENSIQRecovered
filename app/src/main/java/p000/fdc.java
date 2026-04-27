package p000;

/* JADX INFO: loaded from: classes.dex */
public interface fdc {
    default boolean getHasStaleResolvedFonts() {
        return false;
    }

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();
}
