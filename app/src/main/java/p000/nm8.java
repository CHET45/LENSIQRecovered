package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nJvmJsonStreams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmJsonStreams.kt\nkotlinx/serialization/json/internal/JsonToJavaStreamWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n130#1:269\n117#1:271\n130#1:272\n118#1,3:273\n125#1,2:276\n130#1:278\n125#1,2:279\n117#1:281\n130#1:282\n118#1,3:283\n125#1,2:286\n125#1,2:288\n117#1:290\n130#1:291\n118#1,3:292\n125#1,2:295\n125#1,2:297\n125#1,2:299\n117#1:301\n130#1:302\n118#1,3:303\n125#1,2:306\n117#1:308\n130#1:309\n118#1,3:310\n125#1,2:313\n125#1,2:315\n125#1,2:317\n125#1,2:319\n117#1:321\n130#1:322\n118#1,3:323\n125#1,2:326\n117#1:328\n130#1:329\n118#1,3:330\n125#1,2:333\n125#1,2:335\n117#1:337\n130#1:338\n118#1,3:339\n125#1,2:342\n117#1:344\n130#1:345\n118#1,3:346\n125#1,2:349\n125#1,2:351\n125#1,2:353\n117#1:355\n130#1:356\n118#1,3:357\n125#1,2:360\n125#1,2:362\n125#1,2:364\n125#1,2:366\n1#2:270\n*S KotlinDebug\n*F\n+ 1 JvmJsonStreams.kt\nkotlinx/serialization/json/internal/JsonToJavaStreamWriter\n*L\n117#1:269\n148#1:271\n148#1:272\n148#1:273,3\n149#1:276,2\n151#1:278\n158#1:279,2\n165#1:281\n165#1:282\n165#1:283,3\n166#1:286,2\n167#1:288,2\n173#1:290\n173#1:291\n173#1:292,3\n174#1:295,2\n175#1:297,2\n176#1:299,2\n186#1:301\n186#1:302\n186#1:303,3\n187#1:306,2\n196#1:308\n196#1:309\n196#1:310,3\n197#1:313,2\n198#1:315,2\n199#1:317,2\n200#1:319,2\n215#1:321\n215#1:322\n215#1:323,3\n216#1:326,2\n221#1:328\n221#1:329\n221#1:330,3\n222#1:333,2\n223#1:335,2\n228#1:337\n228#1:338\n228#1:339,3\n229#1:342,2\n234#1:344\n234#1:345\n234#1:346,3\n235#1:349,2\n236#1:351,2\n237#1:353,2\n242#1:355\n242#1:356\n242#1:357,3\n243#1:360,2\n244#1:362,2\n245#1:364,2\n246#1:366,2\n*E\n"})
public final class nm8 implements ab8 {

    /* JADX INFO: renamed from: b */
    @yfb
    public final OutputStream f64989b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final byte[] f64990c;

    /* JADX INFO: renamed from: d */
    @yfb
    public char[] f64991d;

    /* JADX INFO: renamed from: e */
    public int f64992e;

    public nm8(@yfb OutputStream outputStream) {
        md8.checkNotNullParameter(outputStream, "stream");
        this.f64989b = outputStream;
        this.f64990c = ki1.f54173c.take();
        this.f64991d = kv1.f55431c.take();
    }

    private final void appendStringSlowPath(int i, String str) throws IOException {
        byte b;
        int length = str.length();
        for (int i2 = i - 1; i2 < length; i2++) {
            int iEnsureTotalCapacity = ensureTotalCapacity(i, 2);
            char cCharAt = str.charAt(i2);
            if (cCharAt >= e8g.getESCAPE_MARKERS().length || (b = e8g.getESCAPE_MARKERS()[cCharAt]) == 0) {
                int i3 = iEnsureTotalCapacity + 1;
                this.f64991d[iEnsureTotalCapacity] = cCharAt;
                i = i3;
            } else {
                if (b == 1) {
                    String str2 = e8g.getESCAPE_STRINGS()[cCharAt];
                    md8.checkNotNull(str2);
                    int iEnsureTotalCapacity2 = ensureTotalCapacity(iEnsureTotalCapacity, str2.length());
                    str2.getChars(0, str2.length(), this.f64991d, iEnsureTotalCapacity2);
                    i = iEnsureTotalCapacity2 + str2.length();
                } else {
                    char[] cArr = this.f64991d;
                    cArr[iEnsureTotalCapacity] = '\\';
                    cArr[iEnsureTotalCapacity + 1] = (char) b;
                    i = iEnsureTotalCapacity + 2;
                }
            }
        }
        ensureTotalCapacity(i, 1);
        char[] cArr2 = this.f64991d;
        cArr2[i] = '\"';
        writeUtf8(cArr2, i + 1);
        flush();
    }

    private final void ensure(int i) throws IOException {
        if (this.f64990c.length - this.f64992e < i) {
            flush();
        }
    }

    private final int ensureTotalCapacity(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.f64991d;
        if (cArr.length <= i3) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, kpd.coerceAtLeast(i3, i * 2));
            md8.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f64991d = cArrCopyOf;
        }
        return i;
    }

    private final void flush() throws IOException {
        this.f64989b.write(this.f64990c, 0, this.f64992e);
        this.f64992e = 0;
    }

    private final int rest() {
        return this.f64990c.length - this.f64992e;
    }

    private final void writeUtf8(char[] cArr, int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        if (i > cArr.length) {
            throw new IllegalArgumentException(("count > string.length: " + i + " > " + cArr.length).toString());
        }
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            if (c < 128) {
                if (this.f64990c.length - this.f64992e < 1) {
                    flush();
                }
                byte[] bArr = this.f64990c;
                int i3 = this.f64992e;
                int i4 = i3 + 1;
                this.f64992e = i4;
                bArr[i3] = (byte) c;
                i2++;
                int iMin = Math.min(i, (bArr.length - i4) + i2);
                while (i2 < iMin) {
                    char c2 = cArr[i2];
                    if (c2 < 128) {
                        byte[] bArr2 = this.f64990c;
                        int i5 = this.f64992e;
                        this.f64992e = i5 + 1;
                        bArr2[i5] = (byte) c2;
                        i2++;
                    }
                }
            } else {
                if (c < 2048) {
                    if (this.f64990c.length - this.f64992e < 2) {
                        flush();
                    }
                    byte[] bArr3 = this.f64990c;
                    int i6 = this.f64992e;
                    int i7 = i6 + 1;
                    this.f64992e = i7;
                    bArr3[i6] = (byte) ((c >> 6) | 192);
                    this.f64992e = i6 + 2;
                    bArr3[i7] = (byte) ((c & '?') | 128);
                } else if (c < 55296 || c > 57343) {
                    if (this.f64990c.length - this.f64992e < 3) {
                        flush();
                    }
                    byte[] bArr4 = this.f64990c;
                    int i8 = this.f64992e;
                    int i9 = i8 + 1;
                    this.f64992e = i9;
                    bArr4[i8] = (byte) ((c >> '\f') | 224);
                    int i10 = i8 + 2;
                    this.f64992e = i10;
                    bArr4[i9] = (byte) (((c >> 6) & 63) | 128);
                    this.f64992e = i8 + 3;
                    bArr4[i10] = (byte) ((c & '?') | 128);
                } else {
                    int i11 = i2 + 1;
                    char c3 = i11 < i ? cArr[i11] : (char) 0;
                    if (c > 56319 || 56320 > c3 || c3 >= 57344) {
                        if (this.f64990c.length - this.f64992e < 1) {
                            flush();
                        }
                        byte[] bArr5 = this.f64990c;
                        int i12 = this.f64992e;
                        this.f64992e = i12 + 1;
                        bArr5[i12] = (byte) 63;
                        i2 = i11;
                    } else {
                        int i13 = (((c & 1023) << 10) | (c3 & 1023)) + 65536;
                        if (this.f64990c.length - this.f64992e < 4) {
                            flush();
                        }
                        byte[] bArr6 = this.f64990c;
                        int i14 = this.f64992e;
                        int i15 = i14 + 1;
                        this.f64992e = i15;
                        bArr6[i14] = (byte) ((i13 >> 18) | 240);
                        int i16 = i14 + 2;
                        this.f64992e = i16;
                        bArr6[i15] = (byte) (((i13 >> 12) & 63) | 128);
                        int i17 = i14 + 3;
                        this.f64992e = i17;
                        bArr6[i16] = (byte) (((i13 >> 6) & 63) | 128);
                        this.f64992e = i14 + 4;
                        bArr6[i17] = (byte) ((i13 & 63) | 128);
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    private final void writeUtf8CodePoint(int i) throws IOException {
        if (i < 128) {
            if (this.f64990c.length - this.f64992e < 1) {
                flush();
            }
            byte[] bArr = this.f64990c;
            int i2 = this.f64992e;
            this.f64992e = i2 + 1;
            bArr[i2] = (byte) i;
            return;
        }
        if (i < 2048) {
            if (this.f64990c.length - this.f64992e < 2) {
                flush();
            }
            byte[] bArr2 = this.f64990c;
            int i3 = this.f64992e;
            int i4 = i3 + 1;
            this.f64992e = i4;
            bArr2[i3] = (byte) ((i >> 6) | 192);
            this.f64992e = i3 + 2;
            bArr2[i4] = (byte) ((i & 63) | 128);
            return;
        }
        if (55296 <= i && i < 57344) {
            if (this.f64990c.length - this.f64992e < 1) {
                flush();
            }
            byte[] bArr3 = this.f64990c;
            int i5 = this.f64992e;
            this.f64992e = i5 + 1;
            bArr3[i5] = (byte) 63;
            return;
        }
        if (i < 65536) {
            if (this.f64990c.length - this.f64992e < 3) {
                flush();
            }
            byte[] bArr4 = this.f64990c;
            int i6 = this.f64992e;
            int i7 = i6 + 1;
            this.f64992e = i7;
            bArr4[i6] = (byte) ((i >> 12) | 224);
            int i8 = i6 + 2;
            this.f64992e = i8;
            bArr4[i7] = (byte) (((i >> 6) & 63) | 128);
            this.f64992e = i6 + 3;
            bArr4[i8] = (byte) ((i & 63) | 128);
            return;
        }
        if (i > 1114111) {
            throw new fl8("Unexpected code point: " + i);
        }
        if (this.f64990c.length - this.f64992e < 4) {
            flush();
        }
        byte[] bArr5 = this.f64990c;
        int i9 = this.f64992e;
        int i10 = i9 + 1;
        this.f64992e = i10;
        bArr5[i9] = (byte) ((i >> 18) | 240);
        int i11 = i9 + 2;
        this.f64992e = i11;
        bArr5[i10] = (byte) (((i >> 12) & 63) | 128);
        int i12 = i9 + 3;
        this.f64992e = i12;
        bArr5[i11] = (byte) (((i >> 6) & 63) | 128);
        this.f64992e = i9 + 4;
        bArr5[i12] = (byte) ((i & 63) | 128);
    }

    @Override // p000.ab8
    public void release() throws IOException {
        flush();
        kv1.f55431c.release(this.f64991d);
        ki1.f54173c.release(this.f64990c);
    }

    @Override // p000.ab8
    public void write(@yfb String str) throws IOException {
        md8.checkNotNullParameter(str, "text");
        int length = str.length();
        ensureTotalCapacity(0, length);
        str.getChars(0, length, this.f64991d, 0);
        writeUtf8(this.f64991d, length);
    }

    @Override // p000.ab8
    public void writeChar(char c) throws IOException {
        writeUtf8CodePoint(c);
    }

    @Override // p000.ab8
    public void writeLong(long j) throws IOException {
        write(String.valueOf(j));
    }

    @Override // p000.ab8
    public void writeQuoted(@yfb String str) throws IOException {
        md8.checkNotNullParameter(str, "text");
        ensureTotalCapacity(0, str.length() + 2);
        char[] cArr = this.f64991d;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i = length + 1;
        for (int i2 = 1; i2 < i; i2++) {
            char c = cArr[i2];
            if (c < e8g.getESCAPE_MARKERS().length && e8g.getESCAPE_MARKERS()[c] != 0) {
                appendStringSlowPath(i2, str);
                return;
            }
        }
        cArr[i] = '\"';
        writeUtf8(cArr, length + 2);
        flush();
    }

    private final void write(int i) {
        byte[] bArr = this.f64990c;
        int i2 = this.f64992e;
        this.f64992e = i2 + 1;
        bArr[i2] = (byte) i;
    }
}
