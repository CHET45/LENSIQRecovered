package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@q64(message = "Use PlatformTextInputModifierNode instead.")
public interface wxc {
    void hideSoftwareKeyboard();

    default void notifyFocusedRect(@yfb rud rudVar) {
    }

    void showSoftwareKeyboard();

    default void startInput() {
    }

    void startInput(@yfb zsg zsgVar, @yfb nw7 nw7Var, @yfb qy6<? super List<? extends lw4>, bth> qy6Var, @yfb qy6<? super mw7, bth> qy6Var2);

    void stopInput();

    void updateState(@gib zsg zsgVar, @yfb zsg zsgVar2);

    default void updateTextLayoutResult(@yfb zsg zsgVar, @yfb nzb nzbVar, @yfb hug hugVar, @yfb qy6<? super x3a, bth> qy6Var, @yfb rud rudVar, @yfb rud rudVar2) {
    }
}
