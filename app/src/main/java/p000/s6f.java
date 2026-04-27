package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class s6f implements lw4 {

    /* JADX INFO: renamed from: c */
    public static final int f80845c = 0;

    /* JADX INFO: renamed from: a */
    public final int f80846a;

    /* JADX INFO: renamed from: b */
    public final int f80847b;

    public s6f(int i, int i2) {
        this.f80846a = i;
        this.f80847b = i2;
    }

    @Override // p000.lw4
    public void applyTo(@yfb rw4 rw4Var) {
        int iCoerceIn = kpd.coerceIn(this.f80846a, 0, rw4Var.getLength$ui_text_release());
        int iCoerceIn2 = kpd.coerceIn(this.f80847b, 0, rw4Var.getLength$ui_text_release());
        if (iCoerceIn < iCoerceIn2) {
            rw4Var.setSelection$ui_text_release(iCoerceIn, iCoerceIn2);
        } else {
            rw4Var.setSelection$ui_text_release(iCoerceIn2, iCoerceIn);
        }
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6f)) {
            return false;
        }
        s6f s6fVar = (s6f) obj;
        return this.f80846a == s6fVar.f80846a && this.f80847b == s6fVar.f80847b;
    }

    public final int getEnd() {
        return this.f80847b;
    }

    public final int getStart() {
        return this.f80846a;
    }

    public int hashCode() {
        return (this.f80846a * 31) + this.f80847b;
    }

    @yfb
    public String toString() {
        return "SetSelectionCommand(start=" + this.f80846a + ", end=" + this.f80847b + ')';
    }
}
