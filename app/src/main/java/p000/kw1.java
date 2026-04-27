package p000;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class kw1 {

    /* JADX INFO: renamed from: i */
    public static final char f55467i = 65535;

    /* JADX INFO: renamed from: j */
    public static final int f55468j = 12;

    /* JADX INFO: renamed from: k */
    public static final int f55469k = 4096;

    /* JADX INFO: renamed from: l */
    public static final int f55470l = 3072;

    /* JADX INFO: renamed from: a */
    public final char[] f55471a;

    /* JADX INFO: renamed from: b */
    public final Reader f55472b;

    /* JADX INFO: renamed from: c */
    public int f55473c;

    /* JADX INFO: renamed from: d */
    public int f55474d;

    /* JADX INFO: renamed from: e */
    public int f55475e;

    /* JADX INFO: renamed from: f */
    public int f55476f;

    /* JADX INFO: renamed from: g */
    public int f55477g;

    /* JADX INFO: renamed from: h */
    public final String[] f55478h;

    public kw1(Reader reader, int i) {
        this.f55478h = new String[128];
        v1i.notNull(reader);
        v1i.isTrue(reader.markSupported());
        this.f55472b = reader;
        this.f55471a = new char[4096];
        bufferUp();
    }

    private void bufferUp() {
        int i = this.f55475e;
        if (i < this.f55474d) {
            return;
        }
        try {
            this.f55472b.skip(i);
            this.f55472b.mark(4096);
            int i2 = this.f55472b.read(this.f55471a);
            this.f55472b.reset();
            if (i2 != -1) {
                this.f55473c = i2;
                this.f55476f += this.f55475e;
                this.f55475e = 0;
                this.f55477g = 0;
                if (i2 > 3072) {
                    i2 = 3072;
                }
                this.f55474d = i2;
            }
        } catch (IOException e) {
            throw new prh(e);
        }
    }

    private static String cacheString(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        while (i3 < i2) {
            i5 = (i5 * 31) + cArr[i4];
            i3++;
            i4++;
        }
        int length = i5 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length] = str2;
            return str2;
        }
        if (m15025y(cArr, i, i2, str)) {
            return str;
        }
        String str3 = new String(cArr, i, i2);
        strArr[length] = str3;
        return str3;
    }

    private boolean isEmptyNoBufferUp() {
        return this.f55475e >= this.f55473c;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m15025y(char[] cArr, int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 == 0) {
                return true;
            }
            int i5 = i + 1;
            int i6 = i3 + 1;
            if (cArr[i] != str.charAt(i3)) {
                return false;
            }
            i = i5;
            i2 = i4;
            i3 = i6;
        }
    }

    /* JADX INFO: renamed from: A */
    public void m15026A() {
        this.f55475e--;
    }

    /* JADX INFO: renamed from: a */
    public char m15027a() {
        bufferUp();
        char c = isEmptyNoBufferUp() ? (char) 65535 : this.f55471a[this.f55475e];
        this.f55475e++;
        return c;
    }

    public void advance() {
        this.f55475e++;
    }

    /* JADX INFO: renamed from: b */
    public String m15028b() {
        int i;
        char c;
        bufferUp();
        int i2 = this.f55475e;
        int i3 = this.f55473c;
        char[] cArr = this.f55471a;
        while (true) {
            i = this.f55475e;
            if (i >= i3 || (c = cArr[i]) == '&' || c == '<' || c == 0) {
                break;
            }
            this.f55475e = i + 1;
        }
        return i > i2 ? cacheString(this.f55471a, this.f55478h, i2, i - i2) : "";
    }

    /* JADX INFO: renamed from: c */
    public String m15029c() {
        int i;
        char c;
        bufferUp();
        int i2 = this.f55475e;
        while (true) {
            i = this.f55475e;
            if (i >= this.f55473c || (c = this.f55471a[i]) < '0' || c > '9') {
                break;
            }
            this.f55475e = i + 1;
        }
        return cacheString(this.f55471a, this.f55478h, i2, i - i2);
    }

    public String consumeTo(char c) {
        int iM15048v = m15048v(c);
        if (iM15048v == -1) {
            return m15036j();
        }
        String strCacheString = cacheString(this.f55471a, this.f55478h, this.f55475e, iM15048v);
        this.f55475e += iM15048v;
        return strCacheString;
    }

    public String consumeToAny(char... cArr) {
        bufferUp();
        int i = this.f55475e;
        int i2 = this.f55473c;
        char[] cArr2 = this.f55471a;
        loop0: while (this.f55475e < i2) {
            for (char c : cArr) {
                if (cArr2[this.f55475e] == c) {
                    break loop0;
                }
            }
            this.f55475e++;
        }
        int i3 = this.f55475e;
        return i3 > i ? cacheString(this.f55471a, this.f55478h, i, i3 - i) : "";
    }

    public char current() {
        bufferUp();
        if (isEmptyNoBufferUp()) {
            return (char) 65535;
        }
        return this.f55471a[this.f55475e];
    }

    /* JADX INFO: renamed from: d */
    public String m15030d() {
        int i;
        char c;
        bufferUp();
        int i2 = this.f55475e;
        while (true) {
            i = this.f55475e;
            if (i >= this.f55473c || (((c = this.f55471a[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.f55475e = i + 1;
        }
        return cacheString(this.f55471a, this.f55478h, i2, i - i2);
    }

    /* JADX INFO: renamed from: e */
    public String m15031e() {
        char c;
        bufferUp();
        int i = this.f55475e;
        while (true) {
            int i2 = this.f55475e;
            if (i2 >= this.f55473c || (((c = this.f55471a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f55475e++;
        }
        return cacheString(this.f55471a, this.f55478h, i, this.f55475e - i);
    }

    /* JADX INFO: renamed from: f */
    public String m15032f() {
        char c;
        bufferUp();
        int i = this.f55475e;
        while (true) {
            int i2 = this.f55475e;
            if (i2 >= this.f55473c || (((c = this.f55471a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f55475e++;
        }
        while (!isEmptyNoBufferUp()) {
            char[] cArr = this.f55471a;
            int i3 = this.f55475e;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.f55475e = i3 + 1;
        }
        return cacheString(this.f55471a, this.f55478h, i, this.f55475e - i);
    }

    /* JADX INFO: renamed from: g */
    public String m15033g() {
        int i;
        char c;
        bufferUp();
        int i2 = this.f55475e;
        int i3 = this.f55473c;
        char[] cArr = this.f55471a;
        while (true) {
            i = this.f55475e;
            if (i >= i3 || (c = cArr[i]) == '\t' || c == '\n' || c == '\r' || c == '\f' || c == ' ' || c == '/' || c == '>' || c == 0) {
                break;
            }
            this.f55475e = i + 1;
        }
        return i > i2 ? cacheString(this.f55471a, this.f55478h, i2, i - i2) : "";
    }

    /* JADX INFO: renamed from: h */
    public String m15034h(String str) {
        int iM15049w = m15049w(str);
        if (iM15049w == -1) {
            return m15036j();
        }
        String strCacheString = cacheString(this.f55471a, this.f55478h, this.f55475e, iM15049w);
        this.f55475e += iM15049w;
        return strCacheString;
    }

    /* JADX INFO: renamed from: i */
    public String m15035i(char... cArr) {
        bufferUp();
        int i = this.f55475e;
        int i2 = this.f55473c;
        char[] cArr2 = this.f55471a;
        while (true) {
            int i3 = this.f55475e;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                break;
            }
            this.f55475e++;
        }
        int i4 = this.f55475e;
        return i4 > i ? cacheString(this.f55471a, this.f55478h, i, i4 - i) : "";
    }

    public boolean isEmpty() {
        bufferUp();
        return this.f55475e >= this.f55473c;
    }

    /* JADX INFO: renamed from: j */
    public String m15036j() {
        bufferUp();
        char[] cArr = this.f55471a;
        String[] strArr = this.f55478h;
        int i = this.f55475e;
        String strCacheString = cacheString(cArr, strArr, i, this.f55473c - i);
        this.f55475e = this.f55473c;
        return strCacheString;
    }

    /* JADX INFO: renamed from: k */
    public boolean m15037k(String str) {
        Locale locale = Locale.ENGLISH;
        return m15049w(str.toLowerCase(locale)) > -1 || m15049w(str.toUpperCase(locale)) > -1;
    }

    /* JADX INFO: renamed from: l */
    public void m15038l() {
        this.f55477g = this.f55475e;
    }

    /* JADX INFO: renamed from: m */
    public boolean m15039m(String str) {
        bufferUp();
        if (!m15042p(str)) {
            return false;
        }
        this.f55475e += str.length();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m15040n(String str) {
        if (!m15046t(str)) {
            return false;
        }
        this.f55475e += str.length();
        return true;
    }

    /* JADX INFO: renamed from: o */
    public boolean m15041o(char c) {
        return !isEmpty() && this.f55471a[this.f55475e] == c;
    }

    /* JADX INFO: renamed from: p */
    public boolean m15042p(String str) {
        bufferUp();
        int length = str.length();
        if (length > this.f55473c - this.f55475e) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.f55471a[this.f55475e + i]) {
                return false;
            }
        }
        return true;
    }

    public int pos() {
        return this.f55476f + this.f55475e;
    }

    /* JADX INFO: renamed from: q */
    public boolean m15043q(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        bufferUp();
        char c = this.f55471a[this.f55475e];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public boolean m15044r(char[] cArr) {
        bufferUp();
        return !isEmpty() && Arrays.binarySearch(cArr, this.f55471a[this.f55475e]) >= 0;
    }

    /* JADX INFO: renamed from: s */
    public boolean m15045s() {
        char c;
        return !isEmpty() && (c = this.f55471a[this.f55475e]) >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: t */
    public boolean m15046t(String str) {
        bufferUp();
        int length = str.length();
        if (length > this.f55473c - this.f55475e) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.f55471a[this.f55475e + i])) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        char[] cArr = this.f55471a;
        int i = this.f55475e;
        return new String(cArr, i, this.f55473c - i);
    }

    /* JADX INFO: renamed from: u */
    public boolean m15047u() {
        if (isEmpty()) {
            return false;
        }
        char c = this.f55471a[this.f55475e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    /* JADX INFO: renamed from: v */
    public int m15048v(char c) {
        bufferUp();
        for (int i = this.f55475e; i < this.f55473c; i++) {
            if (c == this.f55471a[i]) {
                return i - this.f55475e;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: w */
    public int m15049w(CharSequence charSequence) {
        bufferUp();
        char cCharAt = charSequence.charAt(0);
        int i = this.f55475e;
        while (i < this.f55473c) {
            if (cCharAt != this.f55471a[i]) {
                do {
                    i++;
                    if (i >= this.f55473c) {
                        break;
                    }
                } while (cCharAt != this.f55471a[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.f55473c;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.f55471a[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f55475e;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: x */
    public boolean m15050x(int i, int i2, String str) {
        return m15025y(this.f55471a, i, i2, str);
    }

    /* JADX INFO: renamed from: z */
    public void m15051z() {
        this.f55475e = this.f55477g;
    }

    public kw1(Reader reader) {
        this(reader, 4096);
    }

    public kw1(String str) {
        this(new StringReader(str), str.length());
    }
}
