package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class x44 implements lw4 {

    /* JADX INFO: renamed from: a */
    public static final int f96266a = 0;

    @Override // p000.lw4
    public void applyTo(@yfb rw4 rw4Var) {
        rw4Var.replace$ui_text_release(0, rw4Var.getLength$ui_text_release(), "");
    }

    public boolean equals(@gib Object obj) {
        return obj instanceof x44;
    }

    public int hashCode() {
        return vvd.getOrCreateKotlinClass(x44.class).hashCode();
    }

    @yfb
    public String toString() {
        return "DeleteAllCommand()";
    }
}
