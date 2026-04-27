package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class m50 implements CharSequence {

    /* JADX INFO: renamed from: a */
    @yfb
    public final char[] f59901a;

    /* JADX INFO: renamed from: b */
    public int f59902b;

    public m50(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "buffer");
        this.f59901a = cArr;
        this.f59902b = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    public char get(int i) {
        return this.f59901a[i];
    }

    @yfb
    public final char[] getBuffer$kotlinx_serialization_json() {
        return this.f59901a;
    }

    public int getLength() {
        return this.f59902b;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public void setLength(int i) {
        this.f59902b = i;
    }

    @Override // java.lang.CharSequence
    @yfb
    public CharSequence subSequence(int i, int i2) {
        return h9g.concatToString(this.f59901a, i, Math.min(i2, length()));
    }

    @yfb
    public final String substring(int i, int i2) {
        return h9g.concatToString(this.f59901a, i, Math.min(i2, length()));
    }

    @Override // java.lang.CharSequence
    @yfb
    public String toString() {
        return substring(0, length());
    }

    public final void trim(int i) {
        setLength(Math.min(this.f59901a.length, i));
    }
}
