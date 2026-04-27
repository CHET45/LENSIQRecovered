package p000;

/* JADX INFO: loaded from: classes7.dex */
@jl8
public abstract class za8 implements ya8 {

    /* JADX INFO: renamed from: a */
    @gib
    public Character f104617a;

    public abstract boolean exhausted();

    public abstract int nextCodePoint();

    @Override // p000.ya8
    public final int read(@yfb char[] cArr, int i, int i2) {
        int i3;
        md8.checkNotNullParameter(cArr, "buffer");
        Character ch = this.f104617a;
        if (ch != null) {
            md8.checkNotNull(ch);
            cArr[i] = ch.charValue();
            this.f104617a = null;
            i3 = 1;
        } else {
            i3 = 0;
        }
        while (i3 < i2 && !exhausted()) {
            int iNextCodePoint = nextCodePoint();
            if (iNextCodePoint <= 65535) {
                cArr[i + i3] = (char) iNextCodePoint;
                i3++;
            } else {
                char c = (char) ((iNextCodePoint >>> 10) + 55232);
                char c2 = (char) ((iNextCodePoint & 1023) + 56320);
                cArr[i + i3] = c;
                int i4 = i3 + 1;
                if (i4 < i2) {
                    cArr[i4 + i] = c2;
                    i3 += 2;
                } else {
                    this.f104617a = Character.valueOf(c2);
                    i3 = i4;
                }
            }
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }
}
