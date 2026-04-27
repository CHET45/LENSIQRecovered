package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@nx4
public final class fyh {

    /* JADX INFO: renamed from: b */
    public static final String f38039b = "-._~!$'()*,;&=@:";

    /* JADX INFO: renamed from: a */
    public static final String f38038a = "-_.*";

    /* JADX INFO: renamed from: c */
    public static final l55 f38040c = new nnc(f38038a, true);

    /* JADX INFO: renamed from: d */
    public static final l55 f38041d = new nnc("-._~!$'()*,;&=@:+", false);

    /* JADX INFO: renamed from: e */
    public static final l55 f38042e = new nnc("-._~!$'()*,;&=@:+/?", false);

    private fyh() {
    }

    public static l55 urlFormParameterEscaper() {
        return f38040c;
    }

    public static l55 urlFragmentEscaper() {
        return f38042e;
    }

    public static l55 urlPathSegmentEscaper() {
        return f38041d;
    }
}
