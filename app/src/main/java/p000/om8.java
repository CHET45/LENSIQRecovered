package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class om8 implements ab8 {

    /* JADX INFO: renamed from: b */
    @yfb
    public char[] f68129b = kv1.f55431c.take();

    /* JADX INFO: renamed from: c */
    public int f68130c;

    private final void appendStringSlowPath(int i, int i2, String str) {
        byte b;
        int length = str.length();
        while (i < length) {
            int iEnsureTotalCapacity = ensureTotalCapacity(i2, 2);
            char cCharAt = str.charAt(i);
            if (cCharAt >= e8g.getESCAPE_MARKERS().length || (b = e8g.getESCAPE_MARKERS()[cCharAt]) == 0) {
                int i3 = iEnsureTotalCapacity + 1;
                this.f68129b[iEnsureTotalCapacity] = cCharAt;
                i2 = i3;
                i++;
            } else {
                if (b == 1) {
                    String str2 = e8g.getESCAPE_STRINGS()[cCharAt];
                    md8.checkNotNull(str2);
                    int iEnsureTotalCapacity2 = ensureTotalCapacity(iEnsureTotalCapacity, str2.length());
                    str2.getChars(0, str2.length(), this.f68129b, iEnsureTotalCapacity2);
                    i2 = iEnsureTotalCapacity2 + str2.length();
                    this.f68130c = i2;
                } else {
                    char[] cArr = this.f68129b;
                    cArr[iEnsureTotalCapacity] = '\\';
                    cArr[iEnsureTotalCapacity + 1] = (char) b;
                    i2 = iEnsureTotalCapacity + 2;
                    this.f68130c = i2;
                }
                i++;
            }
        }
        int iEnsureTotalCapacity3 = ensureTotalCapacity(i2, 1);
        this.f68129b[iEnsureTotalCapacity3] = '\"';
        this.f68130c = iEnsureTotalCapacity3 + 1;
    }

    private final void ensureAdditionalCapacity(int i) {
        ensureTotalCapacity(this.f68130c, i);
    }

    private final int ensureTotalCapacity(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.f68129b;
        if (cArr.length <= i3) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, kpd.coerceAtLeast(i3, i * 2));
            md8.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f68129b = cArrCopyOf;
        }
        return i;
    }

    @Override // p000.ab8
    public void release() {
        kv1.f55431c.release(this.f68129b);
    }

    @yfb
    public String toString() {
        return new String(this.f68129b, 0, this.f68130c);
    }

    @Override // p000.ab8
    public void write(@yfb String str) {
        md8.checkNotNullParameter(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        ensureAdditionalCapacity(length);
        str.getChars(0, str.length(), this.f68129b, this.f68130c);
        this.f68130c += length;
    }

    @Override // p000.ab8
    public void writeChar(char c) {
        ensureAdditionalCapacity(1);
        char[] cArr = this.f68129b;
        int i = this.f68130c;
        this.f68130c = i + 1;
        cArr[i] = c;
    }

    @Override // p000.ab8
    public void writeLong(long j) {
        write(String.valueOf(j));
    }

    @Override // p000.ab8
    public void writeQuoted(@yfb String str) {
        md8.checkNotNullParameter(str, "text");
        ensureAdditionalCapacity(str.length() + 2);
        char[] cArr = this.f68129b;
        int i = this.f68130c;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        for (int i4 = i2; i4 < i3; i4++) {
            char c = cArr[i4];
            if (c < e8g.getESCAPE_MARKERS().length && e8g.getESCAPE_MARKERS()[c] != 0) {
                appendStringSlowPath(i4 - i2, i4, str);
                return;
            }
        }
        cArr[i3] = '\"';
        this.f68130c = i3 + 1;
    }
}
