package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class bp0 implements lw4 {

    /* JADX INFO: renamed from: a */
    public static final int f14321a = 0;

    @Override // p000.lw4
    public void applyTo(@yfb rw4 rw4Var) {
        if (rw4Var.hasComposition$ui_text_release()) {
            rw4Var.delete$ui_text_release(rw4Var.getCompositionStart$ui_text_release(), rw4Var.getCompositionEnd$ui_text_release());
            return;
        }
        if (rw4Var.getCursor$ui_text_release() != -1) {
            if (rw4Var.getCursor$ui_text_release() == 0) {
                return;
            }
            rw4Var.delete$ui_text_release(gn8.findPrecedingBreak(rw4Var.toString(), rw4Var.getCursor$ui_text_release()), rw4Var.getCursor$ui_text_release());
        } else {
            int selectionStart$ui_text_release = rw4Var.getSelectionStart$ui_text_release();
            int selectionEnd$ui_text_release = rw4Var.getSelectionEnd$ui_text_release();
            rw4Var.setCursor$ui_text_release(rw4Var.getSelectionStart$ui_text_release());
            rw4Var.delete$ui_text_release(selectionStart$ui_text_release, selectionEnd$ui_text_release);
        }
    }

    public boolean equals(@gib Object obj) {
        return obj instanceof bp0;
    }

    public int hashCode() {
        return vvd.getOrCreateKotlinClass(bp0.class).hashCode();
    }

    @yfb
    public String toString() {
        return "BackspaceCommand()";
    }
}
