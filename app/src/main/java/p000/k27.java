package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text/input/internal/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
public final class k27 {

    /* JADX INFO: renamed from: a */
    public int f52452a;

    /* JADX INFO: renamed from: b */
    @yfb
    public char[] f52453b;

    /* JADX INFO: renamed from: c */
    public int f52454c;

    /* JADX INFO: renamed from: d */
    public int f52455d;

    public k27(@yfb char[] cArr, int i, int i2) {
        this.f52452a = cArr.length;
        this.f52453b = cArr;
        this.f52454c = i;
        this.f52455d = i2;
    }

    private final void delete(int i, int i2) {
        int i3 = this.f52454c;
        if (i < i3 && i2 <= i3) {
            int i4 = i3 - i2;
            char[] cArr = this.f52453b;
            u70.copyInto(cArr, cArr, this.f52455d - i4, i2, i3);
            this.f52454c = i;
            this.f52455d -= i4;
            return;
        }
        if (i < i3 && i2 >= i3) {
            this.f52455d = i2 + gapLength();
            this.f52454c = i;
            return;
        }
        int iGapLength = i + gapLength();
        int iGapLength2 = i2 + gapLength();
        int i5 = this.f52455d;
        char[] cArr2 = this.f52453b;
        u70.copyInto(cArr2, cArr2, this.f52454c, i5, iGapLength);
        this.f52454c += iGapLength - i5;
        this.f52455d = iGapLength2;
    }

    private final int gapLength() {
        return this.f52455d - this.f52454c;
    }

    private final void makeSureAvailableSpace(int i) {
        if (i <= gapLength()) {
            return;
        }
        int iGapLength = i - gapLength();
        int i2 = this.f52452a;
        do {
            i2 *= 2;
        } while (i2 - this.f52452a < iGapLength);
        char[] cArr = new char[i2];
        u70.copyInto(this.f52453b, cArr, 0, 0, this.f52454c);
        int i3 = this.f52452a;
        int i4 = this.f52455d;
        int i5 = i3 - i4;
        int i6 = i2 - i5;
        u70.copyInto(this.f52453b, cArr, i6, i4, i5 + i4);
        this.f52453b = cArr;
        this.f52452a = i2;
        this.f52455d = i6;
    }

    public static /* synthetic */ void replace$default(k27 k27Var, int i, int i2, CharSequence charSequence, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        int i6 = i3;
        if ((i5 & 16) != 0) {
            i4 = charSequence.length();
        }
        k27Var.replace(i, i2, charSequence, i6, i4);
    }

    public final void append(@yfb StringBuilder sb) {
        sb.append(this.f52453b, 0, this.f52454c);
        char[] cArr = this.f52453b;
        int i = this.f52455d;
        sb.append(cArr, i, this.f52452a - i);
    }

    public final char get(int i) {
        int i2 = this.f52454c;
        return i < i2 ? this.f52453b[i] : this.f52453b[(i - i2) + this.f52455d];
    }

    public final int length() {
        return this.f52452a - gapLength();
    }

    public final void replace(int i, int i2, @yfb CharSequence charSequence, int i3, int i4) {
        int i5 = i4 - i3;
        makeSureAvailableSpace(i5 - (i2 - i));
        delete(i, i2);
        e3h.toCharArray(charSequence, this.f52453b, this.f52454c, i3, i4);
        this.f52454c += i5;
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        return sb.toString();
    }
}
