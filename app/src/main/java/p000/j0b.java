package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class j0b implements lw4 {

    /* JADX INFO: renamed from: b */
    public static final int f49236b = 0;

    /* JADX INFO: renamed from: a */
    public final int f49237a;

    public j0b(int i) {
        this.f49237a = i;
    }

    @Override // p000.lw4
    public void applyTo(@yfb rw4 rw4Var) {
        if (rw4Var.getCursor$ui_text_release() == -1) {
            rw4Var.setCursor$ui_text_release(rw4Var.getSelectionStart$ui_text_release());
        }
        int selectionStart$ui_text_release = rw4Var.getSelectionStart$ui_text_release();
        String string = rw4Var.toString();
        int i = this.f49237a;
        int i2 = 0;
        if (i <= 0) {
            int i3 = -i;
            while (i2 < i3) {
                int iFindPrecedingBreak = gn8.findPrecedingBreak(string, selectionStart$ui_text_release);
                if (iFindPrecedingBreak == -1) {
                    break;
                }
                i2++;
                selectionStart$ui_text_release = iFindPrecedingBreak;
            }
        } else {
            while (i2 < i) {
                int iFindFollowingBreak = gn8.findFollowingBreak(string, selectionStart$ui_text_release);
                if (iFindFollowingBreak == -1) {
                    break;
                }
                i2++;
                selectionStart$ui_text_release = iFindFollowingBreak;
            }
        }
        rw4Var.setCursor$ui_text_release(selectionStart$ui_text_release);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0b) && this.f49237a == ((j0b) obj).f49237a;
    }

    public final int getAmount() {
        return this.f49237a;
    }

    public int hashCode() {
        return this.f49237a;
    }

    @yfb
    public String toString() {
        return "MoveCursorCommand(amount=" + this.f49237a + ')';
    }
}
