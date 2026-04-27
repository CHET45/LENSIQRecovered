package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text/input/internal/PartialGapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
@e0g(parameters = 0)
public final class iic implements CharSequence {

    /* JADX INFO: renamed from: C */
    public static final int f47104C = 64;

    /* JADX INFO: renamed from: F */
    public static final int f47105F = -1;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C7301a f47106e = new C7301a(null);

    /* JADX INFO: renamed from: f */
    public static final int f47107f = 8;

    /* JADX INFO: renamed from: m */
    public static final int f47108m = 255;

    /* JADX INFO: renamed from: a */
    @yfb
    public CharSequence f47109a;

    /* JADX INFO: renamed from: b */
    @gib
    public k27 f47110b;

    /* JADX INFO: renamed from: c */
    public int f47111c = -1;

    /* JADX INFO: renamed from: d */
    public int f47112d = -1;

    /* JADX INFO: renamed from: iic$a */
    public static final class C7301a {
        public /* synthetic */ C7301a(jt3 jt3Var) {
            this();
        }

        private C7301a() {
        }
    }

    public iic(@yfb CharSequence charSequence) {
        this.f47109a = charSequence;
    }

    public static /* synthetic */ void replace$default(iic iicVar, int i, int i2, CharSequence charSequence, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        int i6 = i3;
        if ((i5 & 16) != 0) {
            i4 = charSequence.length();
        }
        iicVar.replace(i, i2, charSequence, i6, i4);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    public final boolean contentEquals(@yfb CharSequence charSequence) {
        return md8.areEqual(toString(), charSequence.toString());
    }

    public char get(int i) {
        k27 k27Var = this.f47110b;
        if (k27Var != null && i >= this.f47111c) {
            int length = k27Var.length();
            int i2 = this.f47111c;
            return i < length + i2 ? k27Var.get(i - i2) : this.f47109a.charAt(i - ((length - this.f47112d) + i2));
        }
        return this.f47109a.charAt(i);
    }

    public int getLength() {
        k27 k27Var = this.f47110b;
        return k27Var == null ? this.f47109a.length() : (this.f47109a.length() - (this.f47112d - this.f47111c)) + k27Var.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final void replace(int i, int i2, @yfb CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            throw new IllegalArgumentException(("start=" + i + " > end=" + i2).toString());
        }
        if (i3 > i4) {
            throw new IllegalArgumentException(("textStart=" + i3 + " > textEnd=" + i4).toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(("start must be non-negative, but was " + i).toString());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(("textStart must be non-negative, but was " + i3).toString());
        }
        k27 k27Var = this.f47110b;
        int i5 = i4 - i3;
        if (k27Var != null) {
            int i6 = this.f47111c;
            int i7 = i - i6;
            int i8 = i2 - i6;
            if (i7 >= 0 && i8 <= k27Var.length()) {
                k27Var.replace(i7, i8, charSequence, i3, i4);
                return;
            }
            this.f47109a = toString();
            this.f47110b = null;
            this.f47111c = -1;
            this.f47112d = -1;
            replace(i, i2, charSequence, i3, i4);
            return;
        }
        int iMax = Math.max(255, i5 + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i, 64);
        int iMin2 = Math.min(this.f47109a.length() - i2, 64);
        int i9 = i - iMin;
        e3h.toCharArray(this.f47109a, cArr, 0, i9, i);
        int i10 = iMax - iMin2;
        int i11 = iMin2 + i2;
        e3h.toCharArray(this.f47109a, cArr, i10, i2, i11);
        e3h.toCharArray(charSequence, cArr, iMin, i3, i4);
        this.f47110b = new k27(cArr, iMin + i5, i10);
        this.f47111c = i9;
        this.f47112d = i11;
    }

    @Override // java.lang.CharSequence
    @yfb
    public CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @yfb
    public String toString() {
        k27 k27Var = this.f47110b;
        if (k27Var == null) {
            return this.f47109a.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f47109a, 0, this.f47111c);
        k27Var.append(sb);
        CharSequence charSequence = this.f47109a;
        sb.append(charSequence, this.f47112d, charSequence.length());
        return sb.toString();
    }
}
