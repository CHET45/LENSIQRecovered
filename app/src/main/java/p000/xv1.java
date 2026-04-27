package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class xv1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final xv1 f99434a;

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public static final char[] f99435b;

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public static final byte[] f99436c;

    static {
        xv1 xv1Var = new xv1();
        f99434a = xv1Var;
        f99435b = new char[117];
        f99436c = new byte[126];
        xv1Var.initEscape();
        xv1Var.initCharToToken();
    }

    private xv1() {
    }

    private final void initC2ESC(int i, char c) {
        if (c != 'u') {
            f99435b[c] = (char) i;
        }
    }

    private final void initC2TC(int i, byte b) {
        f99436c[i] = b;
    }

    private final void initCharToToken() {
        for (int i = 0; i < 33; i++) {
            initC2TC(i, (byte) 127);
        }
        initC2TC(9, (byte) 3);
        initC2TC(10, (byte) 3);
        initC2TC(13, (byte) 3);
        initC2TC(32, (byte) 3);
        initC2TC(C4584d2.f28238g, (byte) 4);
        initC2TC(':', (byte) 5);
        initC2TC('{', (byte) 6);
        initC2TC('}', (byte) 7);
        initC2TC(C4584d2.f28242k, (byte) 8);
        initC2TC(C4584d2.f28243l, (byte) 9);
        initC2TC('\"', (byte) 1);
        initC2TC('\\', (byte) 2);
    }

    private final void initEscape() {
        for (int i = 0; i < 32; i++) {
            initC2ESC(i, C4584d2.f28247p);
        }
        initC2ESC(8, 'b');
        initC2ESC(9, sjc.f82027q);
        initC2ESC(10, 'n');
        initC2ESC(12, 'f');
        initC2ESC(13, 'r');
        initC2ESC('/', '/');
        initC2ESC('\"', '\"');
        initC2ESC('\\', '\\');
    }

    private final void initC2ESC(char c, char c2) {
        initC2ESC((int) c, c2);
    }

    private final void initC2TC(char c, byte b) {
        initC2TC((int) c, b);
    }
}
