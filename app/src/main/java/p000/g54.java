package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class g54 implements lw4 {

    /* JADX INFO: renamed from: c */
    public static final int f38793c = 0;

    /* JADX INFO: renamed from: a */
    public final int f38794a;

    /* JADX INFO: renamed from: b */
    public final int f38795b;

    public g54(int i, int i2) {
        this.f38794a = i;
        this.f38795b = i2;
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
        }
    }

    @Override // p000.lw4
    public void applyTo(@yfb rw4 rw4Var) {
        int i = this.f38794a;
        int i2 = 0;
        int i3 = 0;
        int selectionStart$ui_text_release = 0;
        while (true) {
            if (i3 < i) {
                int i4 = selectionStart$ui_text_release + 1;
                if (rw4Var.getSelectionStart$ui_text_release() <= i4) {
                    selectionStart$ui_text_release = rw4Var.getSelectionStart$ui_text_release();
                    break;
                } else {
                    selectionStart$ui_text_release = mw4.isSurrogatePair(rw4Var.get$ui_text_release((rw4Var.getSelectionStart$ui_text_release() - i4) + (-1)), rw4Var.get$ui_text_release(rw4Var.getSelectionStart$ui_text_release() - i4)) ? selectionStart$ui_text_release + 2 : i4;
                    i3++;
                }
            } else {
                break;
            }
        }
        int i5 = this.f38795b;
        int length$ui_text_release = 0;
        while (true) {
            if (i2 >= i5) {
                break;
            }
            int i6 = length$ui_text_release + 1;
            if (rw4Var.getSelectionEnd$ui_text_release() + i6 >= rw4Var.getLength$ui_text_release()) {
                length$ui_text_release = rw4Var.getLength$ui_text_release() - rw4Var.getSelectionEnd$ui_text_release();
                break;
            } else {
                length$ui_text_release = mw4.isSurrogatePair(rw4Var.get$ui_text_release((rw4Var.getSelectionEnd$ui_text_release() + i6) + (-1)), rw4Var.get$ui_text_release(rw4Var.getSelectionEnd$ui_text_release() + i6)) ? length$ui_text_release + 2 : i6;
                i2++;
            }
        }
        rw4Var.delete$ui_text_release(rw4Var.getSelectionEnd$ui_text_release(), rw4Var.getSelectionEnd$ui_text_release() + length$ui_text_release);
        rw4Var.delete$ui_text_release(rw4Var.getSelectionStart$ui_text_release() - selectionStart$ui_text_release, rw4Var.getSelectionStart$ui_text_release());
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g54)) {
            return false;
        }
        g54 g54Var = (g54) obj;
        return this.f38794a == g54Var.f38794a && this.f38795b == g54Var.f38795b;
    }

    public final int getLengthAfterCursor() {
        return this.f38795b;
    }

    public final int getLengthBeforeCursor() {
        return this.f38794a;
    }

    public int hashCode() {
        return (this.f38794a * 31) + this.f38795b;
    }

    @yfb
    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f38794a + ", lengthAfterCursor=" + this.f38795b + ')';
    }
}
