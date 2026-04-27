package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class j6f implements lw4 {

    /* JADX INFO: renamed from: c */
    public static final int f49652c = 0;

    /* JADX INFO: renamed from: a */
    public final int f49653a;

    /* JADX INFO: renamed from: b */
    public final int f49654b;

    public j6f(int i, int i2) {
        this.f49653a = i;
        this.f49654b = i2;
    }

    @Override // p000.lw4
    public void applyTo(@yfb rw4 rw4Var) {
        if (rw4Var.hasComposition$ui_text_release()) {
            rw4Var.commitComposition$ui_text_release();
        }
        int iCoerceIn = kpd.coerceIn(this.f49653a, 0, rw4Var.getLength$ui_text_release());
        int iCoerceIn2 = kpd.coerceIn(this.f49654b, 0, rw4Var.getLength$ui_text_release());
        if (iCoerceIn != iCoerceIn2) {
            if (iCoerceIn < iCoerceIn2) {
                rw4Var.setComposition$ui_text_release(iCoerceIn, iCoerceIn2);
            } else {
                rw4Var.setComposition$ui_text_release(iCoerceIn2, iCoerceIn);
            }
        }
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6f)) {
            return false;
        }
        j6f j6fVar = (j6f) obj;
        return this.f49653a == j6fVar.f49653a && this.f49654b == j6fVar.f49654b;
    }

    public final int getEnd() {
        return this.f49654b;
    }

    public final int getStart() {
        return this.f49653a;
    }

    public int hashCode() {
        return (this.f49653a * 31) + this.f49654b;
    }

    @yfb
    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f49653a + ", end=" + this.f49654b + ')';
    }
}
