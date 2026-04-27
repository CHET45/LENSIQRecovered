package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class eb3 {

    /* JADX INFO: renamed from: c */
    public static final int f32500c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f32501a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ny6<Boolean> f32502b;

    public eb3(@yfb String str, @yfb ny6<Boolean> ny6Var) {
        this.f32501a = str;
        this.f32502b = ny6Var;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb3)) {
            return false;
        }
        eb3 eb3Var = (eb3) obj;
        return md8.areEqual(this.f32501a, eb3Var.f32501a) && this.f32502b == eb3Var.f32502b;
    }

    @yfb
    public final ny6<Boolean> getAction() {
        return this.f32502b;
    }

    @yfb
    public final String getLabel() {
        return this.f32501a;
    }

    public int hashCode() {
        return (this.f32501a.hashCode() * 31) + this.f32502b.hashCode();
    }

    @yfb
    public String toString() {
        return "CustomAccessibilityAction(label=" + this.f32501a + ", action=" + this.f32502b + ')';
    }
}
