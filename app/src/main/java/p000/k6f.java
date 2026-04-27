package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class k6f implements lw4 {

    /* JADX INFO: renamed from: c */
    public static final int f52690c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C9041lz f52691a;

    /* JADX INFO: renamed from: b */
    public final int f52692b;

    public k6f(@yfb C9041lz c9041lz, int i) {
        this.f52691a = c9041lz;
        this.f52692b = i;
    }

    @Override // p000.lw4
    public void applyTo(@yfb rw4 rw4Var) {
        if (rw4Var.hasComposition$ui_text_release()) {
            int compositionStart$ui_text_release = rw4Var.getCompositionStart$ui_text_release();
            rw4Var.replace$ui_text_release(rw4Var.getCompositionStart$ui_text_release(), rw4Var.getCompositionEnd$ui_text_release(), getText());
            if (getText().length() > 0) {
                rw4Var.setComposition$ui_text_release(compositionStart$ui_text_release, getText().length() + compositionStart$ui_text_release);
            }
        } else {
            int selectionStart$ui_text_release = rw4Var.getSelectionStart$ui_text_release();
            rw4Var.replace$ui_text_release(rw4Var.getSelectionStart$ui_text_release(), rw4Var.getSelectionEnd$ui_text_release(), getText());
            if (getText().length() > 0) {
                rw4Var.setComposition$ui_text_release(selectionStart$ui_text_release, getText().length() + selectionStart$ui_text_release);
            }
        }
        int cursor$ui_text_release = rw4Var.getCursor$ui_text_release();
        int i = this.f52692b;
        rw4Var.setCursor$ui_text_release(kpd.coerceIn(i > 0 ? (cursor$ui_text_release + i) - 1 : (cursor$ui_text_release + i) - getText().length(), 0, rw4Var.getLength$ui_text_release()));
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6f)) {
            return false;
        }
        k6f k6fVar = (k6f) obj;
        return md8.areEqual(getText(), k6fVar.getText()) && this.f52692b == k6fVar.f52692b;
    }

    @yfb
    public final C9041lz getAnnotatedString() {
        return this.f52691a;
    }

    public final int getNewCursorPosition() {
        return this.f52692b;
    }

    @yfb
    public final String getText() {
        return this.f52691a.getText();
    }

    public int hashCode() {
        return (getText().hashCode() * 31) + this.f52692b;
    }

    @yfb
    public String toString() {
        return "SetComposingTextCommand(text='" + getText() + "', newCursorPosition=" + this.f52692b + ')';
    }

    public k6f(@yfb String str, int i) {
        this(new C9041lz(str, null, null, 6, null), i);
    }
}
