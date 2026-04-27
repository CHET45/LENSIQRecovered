package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class ac2 implements lw4 {

    /* JADX INFO: renamed from: c */
    public static final int f1068c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C9041lz f1069a;

    /* JADX INFO: renamed from: b */
    public final int f1070b;

    public ac2(@yfb C9041lz c9041lz, int i) {
        this.f1069a = c9041lz;
        this.f1070b = i;
    }

    @Override // p000.lw4
    public void applyTo(@yfb rw4 rw4Var) {
        if (rw4Var.hasComposition$ui_text_release()) {
            rw4Var.replace$ui_text_release(rw4Var.getCompositionStart$ui_text_release(), rw4Var.getCompositionEnd$ui_text_release(), getText());
        } else {
            rw4Var.replace$ui_text_release(rw4Var.getSelectionStart$ui_text_release(), rw4Var.getSelectionEnd$ui_text_release(), getText());
        }
        int cursor$ui_text_release = rw4Var.getCursor$ui_text_release();
        int i = this.f1070b;
        rw4Var.setCursor$ui_text_release(kpd.coerceIn(i > 0 ? (cursor$ui_text_release + i) - 1 : (cursor$ui_text_release + i) - getText().length(), 0, rw4Var.getLength$ui_text_release()));
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac2)) {
            return false;
        }
        ac2 ac2Var = (ac2) obj;
        return md8.areEqual(getText(), ac2Var.getText()) && this.f1070b == ac2Var.f1070b;
    }

    @yfb
    public final C9041lz getAnnotatedString() {
        return this.f1069a;
    }

    public final int getNewCursorPosition() {
        return this.f1070b;
    }

    @yfb
    public final String getText() {
        return this.f1069a.getText();
    }

    public int hashCode() {
        return (getText().hashCode() * 31) + this.f1070b;
    }

    @yfb
    public String toString() {
        return "CommitTextCommand(text='" + getText() + "', newCursorPosition=" + this.f1070b + ')';
    }

    public ac2(@yfb String str, int i) {
        this(new C9041lz(str, null, null, 6, null), i);
    }
}
