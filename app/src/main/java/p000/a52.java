package p000;

import android.content.ClipboardManager;

/* JADX INFO: loaded from: classes.dex */
public interface a52 {
    @gib
    default u42 getClip() {
        return null;
    }

    @yfb
    default ClipboardManager getNativeClipboard() {
        throw new UnsupportedOperationException("This platform does not offer a native Clipboard");
    }

    @gib
    C9041lz getText();

    default boolean hasText() {
        C9041lz text = getText();
        return text != null && text.length() > 0;
    }

    default void setClip(@gib u42 u42Var) {
    }

    void setText(@yfb C9041lz c9041lz);
}
