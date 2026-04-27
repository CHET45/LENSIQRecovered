package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nEditCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextCommand\n+ 2 MathUtils.kt\nandroidx/compose/ui/text/input/MathUtilsKt\n*L\n1#1,570:1\n23#2,3:571\n32#2,4:574\n*S KotlinDebug\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextCommand\n*L\n268#1:571,3\n273#1:574,4\n*E\n"})
@e0g(parameters = 1)
public final class f54 implements lw4 {

    /* JADX INFO: renamed from: c */
    public static final int f35356c = 0;

    /* JADX INFO: renamed from: a */
    public final int f35357a;

    /* JADX INFO: renamed from: b */
    public final int f35358b;

    public f54(int i, int i2) {
        this.f35357a = i;
        this.f35358b = i2;
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
        }
    }

    @Override // p000.lw4
    public void applyTo(@yfb rw4 rw4Var) {
        int selectionEnd$ui_text_release = rw4Var.getSelectionEnd$ui_text_release();
        int i = this.f35358b;
        int length$ui_text_release = selectionEnd$ui_text_release + i;
        if (((selectionEnd$ui_text_release ^ length$ui_text_release) & (i ^ length$ui_text_release)) < 0) {
            length$ui_text_release = rw4Var.getLength$ui_text_release();
        }
        rw4Var.delete$ui_text_release(rw4Var.getSelectionEnd$ui_text_release(), Math.min(length$ui_text_release, rw4Var.getLength$ui_text_release()));
        int selectionStart$ui_text_release = rw4Var.getSelectionStart$ui_text_release();
        int i2 = this.f35357a;
        int i3 = selectionStart$ui_text_release - i2;
        if (((selectionStart$ui_text_release ^ i3) & (i2 ^ selectionStart$ui_text_release)) < 0) {
            i3 = 0;
        }
        rw4Var.delete$ui_text_release(Math.max(0, i3), rw4Var.getSelectionStart$ui_text_release());
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f54)) {
            return false;
        }
        f54 f54Var = (f54) obj;
        return this.f35357a == f54Var.f35357a && this.f35358b == f54Var.f35358b;
    }

    public final int getLengthAfterCursor() {
        return this.f35358b;
    }

    public final int getLengthBeforeCursor() {
        return this.f35357a;
    }

    public int hashCode() {
        return (this.f35357a * 31) + this.f35358b;
    }

    @yfb
    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f35357a + ", lengthAfterCursor=" + this.f35358b + ')';
    }
}
