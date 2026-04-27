package p000;

/* JADX INFO: renamed from: d2 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4584d2 {

    /* JADX INFO: renamed from: A */
    public static final byte f28227A = 10;

    /* JADX INFO: renamed from: B */
    public static final byte f28228B = 127;

    /* JADX INFO: renamed from: C */
    public static final int f28229C = 126;

    /* JADX INFO: renamed from: D */
    public static final int f28230D = 117;

    /* JADX INFO: renamed from: E */
    public static final int f28231E = 32;

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f28232a = "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.";

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f28233b = "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.";

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String f28234c = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";

    /* JADX INFO: renamed from: d */
    @yfb
    public static final String f28235d = "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.";

    /* JADX INFO: renamed from: e */
    @yfb
    public static final String f28236e = "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";

    /* JADX INFO: renamed from: f */
    @yfb
    public static final String f28237f = "null";

    /* JADX INFO: renamed from: g */
    public static final char f28238g = ',';

    /* JADX INFO: renamed from: h */
    public static final char f28239h = ':';

    /* JADX INFO: renamed from: i */
    public static final char f28240i = '{';

    /* JADX INFO: renamed from: j */
    public static final char f28241j = '}';

    /* JADX INFO: renamed from: k */
    public static final char f28242k = '[';

    /* JADX INFO: renamed from: l */
    public static final char f28243l = ']';

    /* JADX INFO: renamed from: m */
    public static final char f28244m = '\"';

    /* JADX INFO: renamed from: n */
    public static final char f28245n = '\\';

    /* JADX INFO: renamed from: o */
    public static final char f28246o = 0;

    /* JADX INFO: renamed from: p */
    public static final char f28247p = 'u';

    /* JADX INFO: renamed from: q */
    public static final byte f28248q = 0;

    /* JADX INFO: renamed from: r */
    public static final byte f28249r = 1;

    /* JADX INFO: renamed from: s */
    public static final byte f28250s = 2;

    /* JADX INFO: renamed from: t */
    public static final byte f28251t = 3;

    /* JADX INFO: renamed from: u */
    public static final byte f28252u = 4;

    /* JADX INFO: renamed from: v */
    public static final byte f28253v = 5;

    /* JADX INFO: renamed from: w */
    public static final byte f28254w = 6;

    /* JADX INFO: renamed from: x */
    public static final byte f28255x = 7;

    /* JADX INFO: renamed from: y */
    public static final byte f28256y = 8;

    /* JADX INFO: renamed from: z */
    public static final byte f28257z = 9;

    public static final byte charToTokenClass(char c) {
        if (c < '~') {
            return xv1.f99436c[c];
        }
        return (byte) 0;
    }

    public static final char escapeToChar(int i) {
        if (i < 117) {
            return xv1.f99435b[i];
        }
        return (char) 0;
    }

    @yfb
    public static final String tokenDescription(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == 127 ? "invalid token" : "valid token";
    }
}
