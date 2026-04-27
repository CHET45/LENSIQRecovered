package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
@q64(message = "Use PointerInputChange.isConsumed and PointerInputChange.consume() instead")
public final class ou2 {

    /* JADX INFO: renamed from: c */
    public static final int f68752c = 8;

    /* JADX INFO: renamed from: a */
    public boolean f68753a;

    /* JADX INFO: renamed from: b */
    public boolean f68754b;

    /* JADX WARN: Illegal instructions before constructor call */
    public ou2() {
        boolean z = false;
        this(z, z, 3, null);
    }

    @q64(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void getDownChange$annotations() {
    }

    @q64(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void getPositionChange$annotations() {
    }

    public final boolean getDownChange() {
        return this.f68754b;
    }

    public final boolean getPositionChange() {
        return this.f68753a;
    }

    public final void setDownChange(boolean z) {
        this.f68754b = z;
    }

    public final void setPositionChange(boolean z) {
        this.f68753a = z;
    }

    public ou2(boolean z, boolean z2) {
        this.f68753a = z;
        this.f68754b = z2;
    }

    public /* synthetic */ ou2(boolean z, boolean z2, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
