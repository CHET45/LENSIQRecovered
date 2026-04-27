package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class ew5 implements lw4 {

    /* JADX INFO: renamed from: a */
    public static final int f34288a = 0;

    @Override // p000.lw4
    public void applyTo(@yfb rw4 rw4Var) {
        rw4Var.commitComposition$ui_text_release();
    }

    public boolean equals(@gib Object obj) {
        return obj instanceof ew5;
    }

    public int hashCode() {
        return vvd.getOrCreateKotlinClass(ew5.class).hashCode();
    }

    @yfb
    public String toString() {
        return "FinishComposingTextCommand()";
    }
}
