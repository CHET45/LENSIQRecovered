package p000;

/* JADX INFO: renamed from: ow */
/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,785:1\n81#2:786\n107#2,2:787\n81#2:789\n107#2,2:790\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n*L\n59#1:786\n59#1:787,2\n65#1:789\n65#1:790,2\n*E\n"})
public final class C10671ow implements vli {

    /* JADX INFO: renamed from: f */
    public static final int f68977f = 0;

    /* JADX INFO: renamed from: b */
    public final int f68978b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final String f68979c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final z6b f68980d = xtf.mutableStateOf$default(r48.f77013e, null, 2, null);

    /* JADX INFO: renamed from: e */
    @yfb
    public final z6b f68981e = xtf.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    public C10671ow(int i, @yfb String str) {
        this.f68978b = i;
        this.f68979c = str;
    }

    private final void setVisible(boolean z) {
        this.f68981e.setValue(Boolean.valueOf(z));
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10671ow) && this.f68978b == ((C10671ow) obj).f68978b;
    }

    @Override // p000.vli
    public int getBottom(@yfb c64 c64Var) {
        return getInsets$foundation_layout_release().f77017d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public final r48 getInsets$foundation_layout_release() {
        return (r48) this.f68980d.getValue();
    }

    @Override // p000.vli
    public int getLeft(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return getInsets$foundation_layout_release().f77014a;
    }

    @Override // p000.vli
    public int getRight(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return getInsets$foundation_layout_release().f77016c;
    }

    @Override // p000.vli
    public int getTop(@yfb c64 c64Var) {
        return getInsets$foundation_layout_release().f77015b;
    }

    public final int getType$foundation_layout_release() {
        return this.f68978b;
    }

    public int hashCode() {
        return this.f68978b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isVisible() {
        return ((Boolean) this.f68981e.getValue()).booleanValue();
    }

    public final void setInsets$foundation_layout_release(@yfb r48 r48Var) {
        this.f68980d.setValue(r48Var);
    }

    @yfb
    public String toString() {
        return this.f68979c + '(' + getInsets$foundation_layout_release().f77014a + ", " + getInsets$foundation_layout_release().f77015b + ", " + getInsets$foundation_layout_release().f77016c + ", " + getInsets$foundation_layout_release().f77017d + ')';
    }

    public final void update$foundation_layout_release(@yfb smi smiVar, int i) {
        if (i == 0 || (i & this.f68978b) != 0) {
            setInsets$foundation_layout_release(smiVar.getInsets(this.f68978b));
            setVisible(smiVar.isVisible(this.f68978b));
        }
    }
}
