package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
public final class j27 {

    /* JADX INFO: renamed from: a */
    public int f49415a;

    /* JADX INFO: renamed from: b */
    @yfb
    public char[] f49416b;

    /* JADX INFO: renamed from: c */
    public int f49417c;

    /* JADX INFO: renamed from: d */
    public int f49418d;

    public j27(@yfb char[] cArr, int i, int i2) {
        this.f49415a = cArr.length;
        this.f49416b = cArr;
        this.f49417c = i;
        this.f49418d = i2;
    }

    private final void delete(int i, int i2) {
        int i3 = this.f49417c;
        if (i < i3 && i2 <= i3) {
            int i4 = i3 - i2;
            char[] cArr = this.f49416b;
            u70.copyInto(cArr, cArr, this.f49418d - i4, i2, i3);
            this.f49417c = i;
            this.f49418d -= i4;
            return;
        }
        if (i < i3 && i2 >= i3) {
            this.f49418d = i2 + gapLength();
            this.f49417c = i;
            return;
        }
        int iGapLength = i + gapLength();
        int iGapLength2 = i2 + gapLength();
        int i5 = this.f49418d;
        char[] cArr2 = this.f49416b;
        u70.copyInto(cArr2, cArr2, this.f49417c, i5, iGapLength);
        this.f49417c += iGapLength - i5;
        this.f49418d = iGapLength2;
    }

    private final int gapLength() {
        return this.f49418d - this.f49417c;
    }

    private final void makeSureAvailableSpace(int i) {
        if (i <= gapLength()) {
            return;
        }
        int iGapLength = i - gapLength();
        int i2 = this.f49415a;
        do {
            i2 *= 2;
        } while (i2 - this.f49415a < iGapLength);
        char[] cArr = new char[i2];
        u70.copyInto(this.f49416b, cArr, 0, 0, this.f49417c);
        int i3 = this.f49415a;
        int i4 = this.f49418d;
        int i5 = i3 - i4;
        int i6 = i2 - i5;
        u70.copyInto(this.f49416b, cArr, i6, i4, i5 + i4);
        this.f49416b = cArr;
        this.f49415a = i2;
        this.f49418d = i6;
    }

    public final void append(@yfb StringBuilder sb) {
        sb.append(this.f49416b, 0, this.f49417c);
        char[] cArr = this.f49416b;
        int i = this.f49418d;
        sb.append(cArr, i, this.f49415a - i);
    }

    public final char get(int i) {
        int i2 = this.f49417c;
        return i < i2 ? this.f49416b[i] : this.f49416b[(i - i2) + this.f49418d];
    }

    public final int length() {
        return this.f49415a - gapLength();
    }

    public final void replace(int i, int i2, @yfb String str) {
        makeSureAvailableSpace(str.length() - (i2 - i));
        delete(i, i2);
        l27.toCharArray(str, this.f49416b, this.f49417c);
        this.f49417c += str.length();
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        return sb.toString();
    }
}
