package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,748:1\n81#2:749\n107#2,2:750\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n*L\n367#1:749\n367#1:750,2\n*E\n"})
public final class m2i implements vli {

    /* JADX INFO: renamed from: d */
    public static final int f59790d = 0;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f59791b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final z6b f59792c;

    public m2i(@yfb x48 x48Var, @yfb String str) {
        this.f59791b = str;
        this.f59792c = xtf.mutableStateOf$default(x48Var, null, 2, null);
    }

    public boolean equals(@gib Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2i) {
            return md8.areEqual(getValue$foundation_layout_release(), ((m2i) obj).getValue$foundation_layout_release());
        }
        return false;
    }

    @Override // p000.vli
    public int getBottom(@yfb c64 c64Var) {
        return getValue$foundation_layout_release().getBottom();
    }

    @Override // p000.vli
    public int getLeft(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return getValue$foundation_layout_release().getLeft();
    }

    @yfb
    public final String getName() {
        return this.f59791b;
    }

    @Override // p000.vli
    public int getRight(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return getValue$foundation_layout_release().getRight();
    }

    @Override // p000.vli
    public int getTop(@yfb c64 c64Var) {
        return getValue$foundation_layout_release().getTop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public final x48 getValue$foundation_layout_release() {
        return (x48) this.f59792c.getValue();
    }

    public int hashCode() {
        return this.f59791b.hashCode();
    }

    public final void setValue$foundation_layout_release(@yfb x48 x48Var) {
        this.f59792c.setValue(x48Var);
    }

    @yfb
    public String toString() {
        return this.f59791b + "(left=" + getValue$foundation_layout_release().getLeft() + ", top=" + getValue$foundation_layout_release().getTop() + ", right=" + getValue$foundation_layout_release().getRight() + ", bottom=" + getValue$foundation_layout_release().getBottom() + ')';
    }
}
