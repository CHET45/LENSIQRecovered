package p000;

/* JADX INFO: loaded from: classes7.dex */
public class t80 extends AssertionError {
    private static final long serialVersionUID = 1;

    public t80() {
    }

    private static String defaultString(String str) {
        return str == null ? "" : str;
    }

    public t80(String str) {
        super(defaultString(str));
    }
}
