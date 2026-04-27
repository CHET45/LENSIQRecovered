package p000;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "RegexExtensionsJDK8Kt")
public final class swd {
    @gib
    @jjf(version = "1.2")
    public static final tv9 get(@yfb uv9 uv9Var, @yfb String str) {
        md8.checkNotNullParameter(uv9Var, "<this>");
        md8.checkNotNullParameter(str, "name");
        vv9 vv9Var = uv9Var instanceof vv9 ? (vv9) uv9Var : null;
        if (vv9Var != null) {
            return vv9Var.get(str);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
