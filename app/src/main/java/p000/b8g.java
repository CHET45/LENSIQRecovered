package p000;

/* JADX INFO: loaded from: classes.dex */
public final class b8g {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final rxc f12985a = C7025hv.ActualStringDelegate();

    @yfb
    public static final String capitalize(@yfb String str, @yfb we9 we9Var) {
        return f12985a.capitalize(str, we9Var.getPlatformLocale());
    }

    @yfb
    public static final String decapitalize(@yfb String str, @yfb we9 we9Var) {
        return f12985a.decapitalize(str, we9Var.getPlatformLocale());
    }

    @yfb
    public static final String toLowerCase(@yfb String str, @yfb we9 we9Var) {
        return f12985a.toLowerCase(str, we9Var.getPlatformLocale());
    }

    @yfb
    public static final String toUpperCase(@yfb String str, @yfb we9 we9Var) {
        return f12985a.toUpperCase(str, we9Var.getPlatformLocale());
    }

    @yfb
    public static final String capitalize(@yfb String str, @yfb ye9 ye9Var) {
        return capitalize(str, ye9Var.isEmpty() ? we9.f94035b.getCurrent() : ye9Var.get(0));
    }

    @yfb
    public static final String decapitalize(@yfb String str, @yfb ye9 ye9Var) {
        return decapitalize(str, ye9Var.isEmpty() ? we9.f94035b.getCurrent() : ye9Var.get(0));
    }

    @yfb
    public static final String toLowerCase(@yfb String str, @yfb ye9 ye9Var) {
        return toLowerCase(str, ye9Var.isEmpty() ? we9.f94035b.getCurrent() : ye9Var.get(0));
    }

    @yfb
    public static final String toUpperCase(@yfb String str, @yfb ye9 ye9Var) {
        return toUpperCase(str, ye9Var.isEmpty() ? we9.f94035b.getCurrent() : ye9Var.get(0));
    }
}
