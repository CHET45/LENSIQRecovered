package p000;

/* JADX INFO: loaded from: classes.dex */
public class al1 extends sk1 {

    /* JADX INFO: renamed from: C */
    public int f1944C;

    /* JADX INFO: renamed from: F */
    public EnumC0306b f1945F;

    /* JADX INFO: renamed from: H */
    public char[] f1946H;

    /* JADX INFO: renamed from: L */
    public char[] f1947L;

    /* JADX INFO: renamed from: M */
    public char[] f1948M;

    /* JADX INFO: renamed from: al1$a */
    public static /* synthetic */ class C0305a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1949a;

        static {
            int[] iArr = new int[EnumC0306b.values().length];
            f1949a = iArr;
            try {
                iArr[EnumC0306b.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1949a[EnumC0306b.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1949a[EnumC0306b.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1949a[EnumC0306b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: al1$b */
    public enum EnumC0306b {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public al1(char[] cArr) {
        super(cArr);
        this.f1944C = 0;
        this.f1945F = EnumC0306b.UNKNOWN;
        this.f1946H = "true".toCharArray();
        this.f1947L = "false".toCharArray();
        this.f1948M = "null".toCharArray();
    }

    public static sk1 allocate(char[] cArr) {
        return new al1(cArr);
    }

    public boolean getBoolean() throws xk1 {
        EnumC0306b enumC0306b = this.f1945F;
        if (enumC0306b == EnumC0306b.TRUE) {
            return true;
        }
        if (enumC0306b == EnumC0306b.FALSE) {
            return false;
        }
        throw new xk1("this token is not a boolean: <" + content() + ">", this);
    }

    public EnumC0306b getType() {
        return this.f1945F;
    }

    public boolean isNull() throws xk1 {
        if (this.f1945F == EnumC0306b.NULL) {
            return true;
        }
        throw new xk1("this token is not a null: <" + content() + ">", this);
    }

    @Override // p000.sk1
    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        m22073a(sb, i);
        sb.append(content());
        return sb.toString();
    }

    @Override // p000.sk1
    public String toJSON() {
        if (!wk1.f94462d) {
            return content();
        }
        return "<" + content() + ">";
    }

    public boolean validate(char c, long j) {
        int i = C0305a.f1949a[this.f1945F.ordinal()];
        if (i == 1) {
            char[] cArr = this.f1946H;
            int i2 = this.f1944C;
            z = cArr[i2] == c;
            if (z && i2 + 1 == cArr.length) {
                setEnd(j);
            }
        } else if (i == 2) {
            char[] cArr2 = this.f1947L;
            int i3 = this.f1944C;
            z = cArr2[i3] == c;
            if (z && i3 + 1 == cArr2.length) {
                setEnd(j);
            }
        } else if (i == 3) {
            char[] cArr3 = this.f1948M;
            int i4 = this.f1944C;
            z = cArr3[i4] == c;
            if (z && i4 + 1 == cArr3.length) {
                setEnd(j);
            }
        } else if (i == 4) {
            char[] cArr4 = this.f1946H;
            int i5 = this.f1944C;
            if (cArr4[i5] == c) {
                this.f1945F = EnumC0306b.TRUE;
            } else if (this.f1947L[i5] == c) {
                this.f1945F = EnumC0306b.FALSE;
            } else if (this.f1948M[i5] == c) {
                this.f1945F = EnumC0306b.NULL;
            }
            z = true;
        }
        this.f1944C++;
        return z;
    }
}
