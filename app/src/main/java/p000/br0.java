package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@gd7(emulated = true)
public abstract class br0 {

    /* JADX INFO: renamed from: a */
    public static final br0 f14525a = new C2015h("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: b */
    public static final br0 f14526b = new C2015h("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: c */
    public static final br0 f14527c = new C2018k("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* JADX INFO: renamed from: d */
    public static final br0 f14528d = new C2018k("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: e */
    public static final br0 f14529e = new C2014g("base16()", "0123456789ABCDEF");

    /* JADX INFO: renamed from: br0$a */
    public class C2008a extends qj1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gw1 f14530a;

        public C2008a(final gw1 val$encodedSink) {
            this.f14530a = val$encodedSink;
        }

        @Override // p000.qj1
        public OutputStream openStream() throws IOException {
            return br0.this.encodingStream(this.f14530a.openStream());
        }
    }

    /* JADX INFO: renamed from: br0$b */
    public class C2009b extends rj1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ hw1 f14532a;

        public C2009b(final hw1 val$encodedSource) {
            this.f14532a = val$encodedSource;
        }

        @Override // p000.rj1
        public InputStream openStream() throws IOException {
            return br0.this.decodingStream(this.f14532a.openStream());
        }
    }

    /* JADX INFO: renamed from: br0$e */
    public class C2012e extends Writer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Appendable f14540a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Writer f14541b;

        public C2012e(final Appendable val$separatingAppendable, final Writer val$delegate) {
            this.f14540a = val$separatingAppendable;
            this.f14541b = val$delegate;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f14541b.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            this.f14541b.flush();
        }

        @Override // java.io.Writer
        public void write(int c) throws IOException {
            this.f14540a.append((char) c);
        }

        @Override // java.io.Writer
        public void write(char[] chars, int off, int len) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: br0$f */
    public static final class C2013f {

        /* JADX INFO: renamed from: a */
        public final String f14542a;

        /* JADX INFO: renamed from: b */
        public final char[] f14543b;

        /* JADX INFO: renamed from: c */
        public final int f14544c;

        /* JADX INFO: renamed from: d */
        public final int f14545d;

        /* JADX INFO: renamed from: e */
        public final int f14546e;

        /* JADX INFO: renamed from: f */
        public final int f14547f;

        /* JADX INFO: renamed from: g */
        public final byte[] f14548g;

        /* JADX INFO: renamed from: h */
        public final boolean[] f14549h;

        /* JADX INFO: renamed from: i */
        public final boolean f14550i;

        public C2013f(String name, char[] chars) {
            this(name, chars, decodabetFor(chars), false);
        }

        private static byte[] decodabetFor(char[] chars) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                boolean z = true;
                v7d.checkArgument(c < 128, "Non-ASCII character: %s", c);
                if (bArr[c] != -1) {
                    z = false;
                }
                v7d.checkArgument(z, "Duplicate character: %s", c);
                bArr[c] = (byte) i;
            }
            return bArr;
        }

        private boolean hasLowerCase() {
            for (char c : this.f14543b) {
                if (i80.isLowerCase(c)) {
                    return true;
                }
            }
            return false;
        }

        private boolean hasUpperCase() {
            for (char c : this.f14543b) {
                if (i80.isUpperCase(c)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public boolean m3360b(char ch) {
            return ch <= 127 && this.f14548g[ch] != -1;
        }

        /* JADX INFO: renamed from: c */
        public int m3361c(char ch) throws C2016i {
            if (ch > 127) {
                throw new C2016i("Unrecognized character: 0x" + Integer.toHexString(ch));
            }
            byte b = this.f14548g[ch];
            if (b != -1) {
                return b;
            }
            if (ch <= ' ' || ch == 127) {
                throw new C2016i("Unrecognized character: 0x" + Integer.toHexString(ch));
            }
            throw new C2016i("Unrecognized character: " + ch);
        }

        /* JADX INFO: renamed from: d */
        public char m3362d(int bits) {
            return this.f14543b[bits];
        }

        /* JADX INFO: renamed from: e */
        public C2013f m3363e() {
            if (this.f14550i) {
                return this;
            }
            byte[] bArr = this.f14548g;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            int i = 65;
            while (true) {
                if (i > 90) {
                    return new C2013f(this.f14542a + ".ignoreCase()", this.f14543b, bArrCopyOf, true);
                }
                int i2 = i | 32;
                byte[] bArr2 = this.f14548g;
                byte b = bArr2[i];
                byte b2 = bArr2[i2];
                if (b == -1) {
                    bArrCopyOf[i] = b2;
                } else {
                    v7d.checkState(b2 == -1, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i, (char) i2);
                    bArrCopyOf[i2] = b;
                }
                i++;
            }
        }

        public boolean equals(@wx1 Object other) {
            if (!(other instanceof C2013f)) {
                return false;
            }
            C2013f c2013f = (C2013f) other;
            return this.f14550i == c2013f.f14550i && Arrays.equals(this.f14543b, c2013f.f14543b);
        }

        /* JADX INFO: renamed from: f */
        public boolean m3364f(int index) {
            return this.f14549h[index % this.f14546e];
        }

        /* JADX INFO: renamed from: g */
        public C2013f m3365g() {
            if (!hasUpperCase()) {
                return this;
            }
            v7d.checkState(!hasLowerCase(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f14543b.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.f14543b;
                if (i >= cArr2.length) {
                    break;
                }
                cArr[i] = i80.toLowerCase(cArr2[i]);
                i++;
            }
            C2013f c2013f = new C2013f(this.f14542a + ".lowerCase()", cArr);
            return this.f14550i ? c2013f.m3363e() : c2013f;
        }

        /* JADX INFO: renamed from: h */
        public C2013f m3366h() {
            if (!hasLowerCase()) {
                return this;
            }
            v7d.checkState(!hasUpperCase(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f14543b.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.f14543b;
                if (i >= cArr2.length) {
                    break;
                }
                cArr[i] = i80.toUpperCase(cArr2[i]);
                i++;
            }
            C2013f c2013f = new C2013f(this.f14542a + ".upperCase()", cArr);
            return this.f14550i ? c2013f.m3363e() : c2013f;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f14543b) + (this.f14550i ? 1231 : 1237);
        }

        public boolean matches(char c) {
            byte[] bArr = this.f14548g;
            return c < bArr.length && bArr[c] != -1;
        }

        public String toString() {
            return this.f14542a;
        }

        private C2013f(String name, char[] chars, byte[] decodabet, boolean ignoreCase) {
            this.f14542a = (String) v7d.checkNotNull(name);
            this.f14543b = (char[]) v7d.checkNotNull(chars);
            try {
                int iLog2 = w68.log2(chars.length, RoundingMode.UNNECESSARY);
                this.f14545d = iLog2;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iLog2);
                int i = 1 << (3 - iNumberOfTrailingZeros);
                this.f14546e = i;
                this.f14547f = iLog2 >> iNumberOfTrailingZeros;
                this.f14544c = chars.length - 1;
                this.f14548g = decodabet;
                boolean[] zArr = new boolean[i];
                for (int i2 = 0; i2 < this.f14547f; i2++) {
                    zArr[w68.divide(i2 * 8, this.f14545d, RoundingMode.CEILING)] = true;
                }
                this.f14549h = zArr;
                this.f14550i = ignoreCase;
            } catch (ArithmeticException e) {
                throw new IllegalArgumentException("Illegal alphabet length " + chars.length, e);
            }
        }
    }

    /* JADX INFO: renamed from: br0$g */
    public static final class C2014g extends C2018k {

        /* JADX INFO: renamed from: k */
        public final char[] f14551k;

        public C2014g(String name, String alphabetChars) {
            this(new C2013f(name, alphabetChars.toCharArray()));
        }

        @Override // p000.br0.C2018k, p000.br0
        /* JADX INFO: renamed from: b */
        public int mo3354b(byte[] target, CharSequence chars) throws C2016i {
            v7d.checkNotNull(target);
            if (chars.length() % 2 == 1) {
                throw new C2016i("Invalid input length " + chars.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < chars.length()) {
                target[i2] = (byte) ((this.f14555f.m3361c(chars.charAt(i)) << 4) | this.f14555f.m3361c(chars.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }

        @Override // p000.br0.C2018k, p000.br0
        /* JADX INFO: renamed from: c */
        public void mo3355c(Appendable target, byte[] bytes, int off, int len) throws IOException {
            v7d.checkNotNull(target);
            v7d.checkPositionIndexes(off, off + len, bytes.length);
            for (int i = 0; i < len; i++) {
                int i2 = bytes[off + i] & 255;
                target.append(this.f14551k[i2]);
                target.append(this.f14551k[i2 | 256]);
            }
        }

        @Override // p000.br0.C2018k
        /* JADX INFO: renamed from: k */
        public br0 mo3367k(C2013f alphabet, @wx1 Character paddingChar) {
            return new C2014g(alphabet);
        }

        private C2014g(C2013f alphabet) {
            super(alphabet, null);
            this.f14551k = new char[512];
            v7d.checkArgument(alphabet.f14543b.length == 16);
            for (int i = 0; i < 256; i++) {
                this.f14551k[i] = alphabet.m3362d(i >>> 4);
                this.f14551k[i | 256] = alphabet.m3362d(i & 15);
            }
        }
    }

    /* JADX INFO: renamed from: br0$h */
    public static final class C2015h extends C2018k {
        public C2015h(String name, String alphabetChars, @wx1 Character paddingChar) {
            this(new C2013f(name, alphabetChars.toCharArray()), paddingChar);
        }

        @Override // p000.br0.C2018k, p000.br0
        /* JADX INFO: renamed from: b */
        public int mo3354b(byte[] target, CharSequence chars) throws C2016i {
            v7d.checkNotNull(target);
            CharSequence charSequenceMo3358i = mo3358i(chars);
            if (!this.f14555f.m3364f(charSequenceMo3358i.length())) {
                throw new C2016i("Invalid input length " + charSequenceMo3358i.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequenceMo3358i.length()) {
                int i3 = i + 2;
                int iM3361c = (this.f14555f.m3361c(charSequenceMo3358i.charAt(i)) << 18) | (this.f14555f.m3361c(charSequenceMo3358i.charAt(i + 1)) << 12);
                int i4 = i2 + 1;
                target[i2] = (byte) (iM3361c >>> 16);
                if (i3 < charSequenceMo3358i.length()) {
                    int i5 = i + 3;
                    int iM3361c2 = iM3361c | (this.f14555f.m3361c(charSequenceMo3358i.charAt(i3)) << 6);
                    int i6 = i2 + 2;
                    target[i4] = (byte) ((iM3361c2 >>> 8) & 255);
                    if (i5 < charSequenceMo3358i.length()) {
                        i += 4;
                        i2 += 3;
                        target[i6] = (byte) ((iM3361c2 | this.f14555f.m3361c(charSequenceMo3358i.charAt(i5))) & 255);
                    } else {
                        i2 = i6;
                        i = i5;
                    }
                } else {
                    i2 = i4;
                    i = i3;
                }
            }
            return i2;
        }

        @Override // p000.br0.C2018k, p000.br0
        /* JADX INFO: renamed from: c */
        public void mo3355c(Appendable target, byte[] bytes, int off, int len) throws IOException {
            v7d.checkNotNull(target);
            int i = off + len;
            v7d.checkPositionIndexes(off, i, bytes.length);
            while (len >= 3) {
                int i2 = off + 2;
                int i3 = ((bytes[off + 1] & 255) << 8) | ((bytes[off] & 255) << 16);
                off += 3;
                int i4 = i3 | (bytes[i2] & 255);
                target.append(this.f14555f.m3362d(i4 >>> 18));
                target.append(this.f14555f.m3362d((i4 >>> 12) & 63));
                target.append(this.f14555f.m3362d((i4 >>> 6) & 63));
                target.append(this.f14555f.m3362d(i4 & 63));
                len -= 3;
            }
            if (off < i) {
                m3368j(target, bytes, off, i - off);
            }
        }

        @Override // p000.br0.C2018k
        /* JADX INFO: renamed from: k */
        public br0 mo3367k(C2013f alphabet, @wx1 Character paddingChar) {
            return new C2015h(alphabet, paddingChar);
        }

        private C2015h(C2013f alphabet, @wx1 Character paddingChar) {
            super(alphabet, paddingChar);
            v7d.checkArgument(alphabet.f14543b.length == 64);
        }
    }

    /* JADX INFO: renamed from: br0$i */
    public static final class C2016i extends IOException {
        public C2016i(String message) {
            super(message);
        }

        public C2016i(Throwable cause) {
            super(cause);
        }
    }

    /* JADX INFO: renamed from: br0$j */
    public static final class C2017j extends br0 {

        /* JADX INFO: renamed from: f */
        public final br0 f14552f;

        /* JADX INFO: renamed from: g */
        public final String f14553g;

        /* JADX INFO: renamed from: h */
        public final int f14554h;

        public C2017j(br0 delegate, String separator, int afterEveryChars) {
            this.f14552f = (br0) v7d.checkNotNull(delegate);
            this.f14553g = (String) v7d.checkNotNull(separator);
            this.f14554h = afterEveryChars;
            v7d.checkArgument(afterEveryChars > 0, "Cannot add a separator after every %s chars", afterEveryChars);
        }

        @Override // p000.br0
        /* JADX INFO: renamed from: b */
        public int mo3354b(byte[] target, CharSequence chars) throws C2016i {
            StringBuilder sb = new StringBuilder(chars.length());
            for (int i = 0; i < chars.length(); i++) {
                char cCharAt = chars.charAt(i);
                if (this.f14553g.indexOf(cCharAt) < 0) {
                    sb.append(cCharAt);
                }
            }
            return this.f14552f.mo3354b(target, sb);
        }

        @Override // p000.br0
        /* JADX INFO: renamed from: c */
        public void mo3355c(Appendable target, byte[] bytes, int off, int len) throws IOException {
            this.f14552f.mo3355c(br0.m3351g(target, this.f14553g, this.f14554h), bytes, off, len);
        }

        @Override // p000.br0
        public boolean canDecode(CharSequence chars) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < chars.length(); i++) {
                char cCharAt = chars.charAt(i);
                if (this.f14553g.indexOf(cCharAt) < 0) {
                    sb.append(cCharAt);
                }
            }
            return this.f14552f.canDecode(sb);
        }

        @Override // p000.br0
        @jd7
        @yg8
        public InputStream decodingStream(Reader reader) {
            return this.f14552f.decodingStream(br0.m3350d(reader, this.f14553g));
        }

        @Override // p000.br0
        /* JADX INFO: renamed from: e */
        public int mo3356e(int chars) {
            return this.f14552f.mo3356e(chars);
        }

        @Override // p000.br0
        @jd7
        @yg8
        public OutputStream encodingStream(Writer output) {
            return this.f14552f.encodingStream(br0.m3352h(output, this.f14553g, this.f14554h));
        }

        @Override // p000.br0
        /* JADX INFO: renamed from: f */
        public int mo3357f(int bytes) {
            int iMo3357f = this.f14552f.mo3357f(bytes);
            return iMo3357f + (this.f14553g.length() * w68.divide(Math.max(0, iMo3357f - 1), this.f14554h, RoundingMode.FLOOR));
        }

        @Override // p000.br0
        /* JADX INFO: renamed from: i */
        public CharSequence mo3358i(CharSequence chars) {
            return this.f14552f.mo3358i(chars);
        }

        @Override // p000.br0
        public br0 ignoreCase() {
            return this.f14552f.ignoreCase().withSeparator(this.f14553g, this.f14554h);
        }

        @Override // p000.br0
        public br0 lowerCase() {
            return this.f14552f.lowerCase().withSeparator(this.f14553g, this.f14554h);
        }

        @Override // p000.br0
        public br0 omitPadding() {
            return this.f14552f.omitPadding().withSeparator(this.f14553g, this.f14554h);
        }

        public String toString() {
            return this.f14552f + ".withSeparator(\"" + this.f14553g + "\", " + this.f14554h + c0b.f15434d;
        }

        @Override // p000.br0
        public br0 upperCase() {
            return this.f14552f.upperCase().withSeparator(this.f14553g, this.f14554h);
        }

        @Override // p000.br0
        public br0 withPadChar(char padChar) {
            return this.f14552f.withPadChar(padChar).withSeparator(this.f14553g, this.f14554h);
        }

        @Override // p000.br0
        public br0 withSeparator(String separator, int afterEveryChars) {
            throw new UnsupportedOperationException("Already have a separator");
        }
    }

    /* JADX INFO: renamed from: br0$k */
    public static class C2018k extends br0 {

        /* JADX INFO: renamed from: f */
        public final C2013f f14555f;

        /* JADX INFO: renamed from: g */
        @wx1
        public final Character f14556g;

        /* JADX INFO: renamed from: h */
        @wx1
        @ez8
        public volatile br0 f14557h;

        /* JADX INFO: renamed from: i */
        @wx1
        @ez8
        public volatile br0 f14558i;

        /* JADX INFO: renamed from: j */
        @wx1
        @ez8
        public volatile br0 f14559j;

        /* JADX INFO: renamed from: br0$k$a */
        public class a extends OutputStream {

            /* JADX INFO: renamed from: a */
            public int f14560a = 0;

            /* JADX INFO: renamed from: b */
            public int f14561b = 0;

            /* JADX INFO: renamed from: c */
            public int f14562c = 0;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Writer f14563d;

            public a(final Writer val$out) {
                this.f14563d = val$out;
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                int i = this.f14561b;
                if (i > 0) {
                    int i2 = this.f14560a;
                    C2013f c2013f = C2018k.this.f14555f;
                    this.f14563d.write(c2013f.m3362d((i2 << (c2013f.f14545d - i)) & c2013f.f14544c));
                    this.f14562c++;
                    if (C2018k.this.f14556g != null) {
                        while (true) {
                            int i3 = this.f14562c;
                            C2018k c2018k = C2018k.this;
                            if (i3 % c2018k.f14555f.f14546e == 0) {
                                break;
                            }
                            this.f14563d.write(c2018k.f14556g.charValue());
                            this.f14562c++;
                        }
                    }
                }
                this.f14563d.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                this.f14563d.flush();
            }

            @Override // java.io.OutputStream
            public void write(int b) throws IOException {
                this.f14560a = (b & 255) | (this.f14560a << 8);
                this.f14561b += 8;
                while (true) {
                    int i = this.f14561b;
                    C2013f c2013f = C2018k.this.f14555f;
                    int i2 = c2013f.f14545d;
                    if (i < i2) {
                        return;
                    }
                    this.f14563d.write(c2013f.m3362d((this.f14560a >> (i - i2)) & c2013f.f14544c));
                    this.f14562c++;
                    this.f14561b -= C2018k.this.f14555f.f14545d;
                }
            }
        }

        public C2018k(String name, String alphabetChars, @wx1 Character paddingChar) {
            this(new C2013f(name, alphabetChars.toCharArray()), paddingChar);
        }

        @Override // p000.br0
        /* JADX INFO: renamed from: b */
        public int mo3354b(byte[] target, CharSequence chars) throws C2016i {
            C2013f c2013f;
            v7d.checkNotNull(target);
            CharSequence charSequenceMo3358i = mo3358i(chars);
            if (!this.f14555f.m3364f(charSequenceMo3358i.length())) {
                throw new C2016i("Invalid input length " + charSequenceMo3358i.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequenceMo3358i.length()) {
                long jM3361c = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    c2013f = this.f14555f;
                    if (i3 >= c2013f.f14546e) {
                        break;
                    }
                    jM3361c <<= c2013f.f14545d;
                    if (i + i3 < charSequenceMo3358i.length()) {
                        jM3361c |= (long) this.f14555f.m3361c(charSequenceMo3358i.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = c2013f.f14547f;
                int i6 = (i5 * 8) - (i4 * c2013f.f14545d);
                int i7 = (i5 - 1) * 8;
                while (i7 >= i6) {
                    target[i2] = (byte) ((jM3361c >>> i7) & 255);
                    i7 -= 8;
                    i2++;
                }
                i += this.f14555f.f14546e;
            }
            return i2;
        }

        @Override // p000.br0
        /* JADX INFO: renamed from: c */
        public void mo3355c(Appendable target, byte[] bytes, int off, int len) throws IOException {
            v7d.checkNotNull(target);
            v7d.checkPositionIndexes(off, off + len, bytes.length);
            int i = 0;
            while (i < len) {
                m3368j(target, bytes, off + i, Math.min(this.f14555f.f14547f, len - i));
                i += this.f14555f.f14547f;
            }
        }

        @Override // p000.br0
        public boolean canDecode(CharSequence chars) {
            v7d.checkNotNull(chars);
            CharSequence charSequenceMo3358i = mo3358i(chars);
            if (!this.f14555f.m3364f(charSequenceMo3358i.length())) {
                return false;
            }
            for (int i = 0; i < charSequenceMo3358i.length(); i++) {
                if (!this.f14555f.m3360b(charSequenceMo3358i.charAt(i))) {
                    return false;
                }
            }
            return true;
        }

        @Override // p000.br0
        @jd7
        @yg8
        public InputStream decodingStream(Reader reader) {
            v7d.checkNotNull(reader);
            return new b(reader);
        }

        @Override // p000.br0
        /* JADX INFO: renamed from: e */
        public int mo3356e(int chars) {
            return (int) (((((long) this.f14555f.f14545d) * ((long) chars)) + 7) / 8);
        }

        @Override // p000.br0
        @jd7
        @yg8
        public OutputStream encodingStream(Writer out) {
            v7d.checkNotNull(out);
            return new a(out);
        }

        public boolean equals(@wx1 Object other) {
            if (!(other instanceof C2018k)) {
                return false;
            }
            C2018k c2018k = (C2018k) other;
            return this.f14555f.equals(c2018k.f14555f) && Objects.equals(this.f14556g, c2018k.f14556g);
        }

        @Override // p000.br0
        /* JADX INFO: renamed from: f */
        public int mo3357f(int bytes) {
            C2013f c2013f = this.f14555f;
            return c2013f.f14546e * w68.divide(bytes, c2013f.f14547f, RoundingMode.CEILING);
        }

        public int hashCode() {
            return this.f14555f.hashCode() ^ Objects.hashCode(this.f14556g);
        }

        @Override // p000.br0
        /* JADX INFO: renamed from: i */
        public CharSequence mo3358i(CharSequence chars) {
            v7d.checkNotNull(chars);
            Character ch = this.f14556g;
            if (ch == null) {
                return chars;
            }
            char cCharValue = ch.charValue();
            int length = chars.length() - 1;
            while (length >= 0 && chars.charAt(length) == cCharValue) {
                length--;
            }
            return chars.subSequence(0, length + 1);
        }

        @Override // p000.br0
        public br0 ignoreCase() {
            br0 br0VarMo3367k = this.f14559j;
            if (br0VarMo3367k == null) {
                C2013f c2013fM3363e = this.f14555f.m3363e();
                br0VarMo3367k = c2013fM3363e == this.f14555f ? this : mo3367k(c2013fM3363e, this.f14556g);
                this.f14559j = br0VarMo3367k;
            }
            return br0VarMo3367k;
        }

        /* JADX INFO: renamed from: j */
        public void m3368j(Appendable target, byte[] bytes, int off, int len) throws IOException {
            v7d.checkNotNull(target);
            v7d.checkPositionIndexes(off, off + len, bytes.length);
            int i = 0;
            v7d.checkArgument(len <= this.f14555f.f14547f);
            long j = 0;
            for (int i2 = 0; i2 < len; i2++) {
                j = (j | ((long) (bytes[off + i2] & 255))) << 8;
            }
            int i3 = ((len + 1) * 8) - this.f14555f.f14545d;
            while (i < len * 8) {
                C2013f c2013f = this.f14555f;
                target.append(c2013f.m3362d(((int) (j >>> (i3 - i))) & c2013f.f14544c));
                i += this.f14555f.f14545d;
            }
            if (this.f14556g != null) {
                while (i < this.f14555f.f14547f * 8) {
                    target.append(this.f14556g.charValue());
                    i += this.f14555f.f14545d;
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public br0 mo3367k(C2013f alphabet, @wx1 Character paddingChar) {
            return new C2018k(alphabet, paddingChar);
        }

        @Override // p000.br0
        public br0 lowerCase() {
            br0 br0VarMo3367k = this.f14558i;
            if (br0VarMo3367k == null) {
                C2013f c2013fM3365g = this.f14555f.m3365g();
                br0VarMo3367k = c2013fM3365g == this.f14555f ? this : mo3367k(c2013fM3365g, this.f14556g);
                this.f14558i = br0VarMo3367k;
            }
            return br0VarMo3367k;
        }

        @Override // p000.br0
        public br0 omitPadding() {
            return this.f14556g == null ? this : mo3367k(this.f14555f, null);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f14555f);
            if (8 % this.f14555f.f14545d != 0) {
                if (this.f14556g == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f14556g);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        @Override // p000.br0
        public br0 upperCase() {
            br0 br0VarMo3367k = this.f14557h;
            if (br0VarMo3367k == null) {
                C2013f c2013fM3366h = this.f14555f.m3366h();
                br0VarMo3367k = c2013fM3366h == this.f14555f ? this : mo3367k(c2013fM3366h, this.f14556g);
                this.f14557h = br0VarMo3367k;
            }
            return br0VarMo3367k;
        }

        @Override // p000.br0
        public br0 withPadChar(char padChar) {
            Character ch;
            return (8 % this.f14555f.f14545d == 0 || ((ch = this.f14556g) != null && ch.charValue() == padChar)) ? this : mo3367k(this.f14555f, Character.valueOf(padChar));
        }

        @Override // p000.br0
        public br0 withSeparator(String separator, int afterEveryChars) {
            for (int i = 0; i < separator.length(); i++) {
                v7d.checkArgument(!this.f14555f.matches(separator.charAt(i)), "Separator (%s) cannot contain alphabet characters", separator);
            }
            Character ch = this.f14556g;
            if (ch != null) {
                v7d.checkArgument(separator.indexOf(ch.charValue()) < 0, "Separator (%s) cannot contain padding character", separator);
            }
            return new C2017j(this, separator, afterEveryChars);
        }

        public C2018k(C2013f alphabet, @wx1 Character paddingChar) {
            this.f14555f = (C2013f) v7d.checkNotNull(alphabet);
            v7d.checkArgument(paddingChar == null || !alphabet.matches(paddingChar.charValue()), "Padding character %s was already in alphabet", paddingChar);
            this.f14556g = paddingChar;
        }

        /* JADX INFO: renamed from: br0$k$b */
        public class b extends InputStream {

            /* JADX INFO: renamed from: a */
            public int f14565a = 0;

            /* JADX INFO: renamed from: b */
            public int f14566b = 0;

            /* JADX INFO: renamed from: c */
            public int f14567c = 0;

            /* JADX INFO: renamed from: d */
            public boolean f14568d = false;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Reader f14569e;

            public b(final Reader val$reader) {
                this.f14569e = val$reader;
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f14569e.close();
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
            
                throw new p000.br0.C2016i("Padding cannot start at index " + r4.f14567c);
             */
            @Override // java.io.InputStream
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public int read() throws java.io.IOException {
                /*
                    r4 = this;
                L0:
                    java.io.Reader r0 = r4.f14569e
                    int r0 = r0.read()
                    r1 = -1
                    if (r0 != r1) goto L34
                    boolean r0 = r4.f14568d
                    if (r0 != 0) goto L33
                    br0$k r0 = p000.br0.C2018k.this
                    br0$f r0 = r0.f14555f
                    int r2 = r4.f14567c
                    boolean r0 = r0.m3364f(r2)
                    if (r0 == 0) goto L1a
                    goto L33
                L1a:
                    br0$i r0 = new br0$i
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Invalid input length "
                    r1.append(r2)
                    int r2 = r4.f14567c
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L33:
                    return r1
                L34:
                    int r1 = r4.f14567c
                    r2 = 1
                    int r1 = r1 + r2
                    r4.f14567c = r1
                    char r0 = (char) r0
                    br0$k r1 = p000.br0.C2018k.this
                    java.lang.Character r1 = r1.f14556g
                    if (r1 == 0) goto L78
                    char r1 = r1.charValue()
                    if (r1 != r0) goto L78
                    boolean r0 = r4.f14568d
                    if (r0 != 0) goto L75
                    int r0 = r4.f14567c
                    if (r0 == r2) goto L5c
                    br0$k r1 = p000.br0.C2018k.this
                    br0$f r1 = r1.f14555f
                    int r0 = r0 + (-1)
                    boolean r0 = r1.m3364f(r0)
                    if (r0 == 0) goto L5c
                    goto L75
                L5c:
                    br0$i r0 = new br0$i
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Padding cannot start at index "
                    r1.append(r2)
                    int r2 = r4.f14567c
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L75:
                    r4.f14568d = r2
                    goto L0
                L78:
                    boolean r1 = r4.f14568d
                    if (r1 != 0) goto La4
                    int r1 = r4.f14565a
                    br0$k r2 = p000.br0.C2018k.this
                    br0$f r2 = r2.f14555f
                    int r3 = r2.f14545d
                    int r1 = r1 << r3
                    r4.f14565a = r1
                    int r0 = r2.m3361c(r0)
                    r0 = r0 | r1
                    r4.f14565a = r0
                    int r1 = r4.f14566b
                    br0$k r2 = p000.br0.C2018k.this
                    br0$f r2 = r2.f14555f
                    int r2 = r2.f14545d
                    int r1 = r1 + r2
                    r4.f14566b = r1
                    r2 = 8
                    if (r1 < r2) goto L0
                    int r1 = r1 - r2
                    r4.f14566b = r1
                    int r0 = r0 >> r1
                    r0 = r0 & 255(0xff, float:3.57E-43)
                    return r0
                La4:
                    br0$i r1 = new br0$i
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Expected padding character but found '"
                    r2.append(r3)
                    r2.append(r0)
                    java.lang.String r0 = "' at index "
                    r2.append(r0)
                    int r0 = r4.f14567c
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.br0.C2018k.b.read():int");
            }

            @Override // java.io.InputStream
            public int read(byte[] buf, int off, int len) throws IOException {
                int i = len + off;
                v7d.checkPositionIndexes(off, i, buf.length);
                int i2 = off;
                while (i2 < i) {
                    int i3 = read();
                    if (i3 == -1) {
                        int i4 = i2 - off;
                        if (i4 == 0) {
                            return -1;
                        }
                        return i4;
                    }
                    buf[i2] = (byte) i3;
                    i2++;
                }
                return i2 - off;
            }
        }
    }

    public static br0 base16() {
        return f14529e;
    }

    public static br0 base32() {
        return f14527c;
    }

    public static br0 base32Hex() {
        return f14528d;
    }

    public static br0 base64() {
        return f14525a;
    }

    public static br0 base64Url() {
        return f14526b;
    }

    @jd7
    @yg8
    /* JADX INFO: renamed from: d */
    public static Reader m3350d(Reader delegate, String toIgnore) {
        v7d.checkNotNull(delegate);
        v7d.checkNotNull(toIgnore);
        return new C2010c(delegate, toIgnore);
    }

    private static byte[] extract(byte[] result, int length) {
        if (length == result.length) {
            return result;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(result, 0, bArr, 0, length);
        return bArr;
    }

    /* JADX INFO: renamed from: g */
    public static Appendable m3351g(Appendable delegate, String separator, int afterEveryChars) {
        v7d.checkNotNull(delegate);
        v7d.checkNotNull(separator);
        v7d.checkArgument(afterEveryChars > 0);
        return new C2011d(afterEveryChars, delegate, separator);
    }

    @jd7
    @yg8
    /* JADX INFO: renamed from: h */
    public static Writer m3352h(Writer delegate, String separator, int afterEveryChars) {
        return new C2012e(m3351g(delegate, separator, afterEveryChars), delegate);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m3353a(CharSequence chars) throws C2016i {
        CharSequence charSequenceMo3358i = mo3358i(chars);
        byte[] bArr = new byte[mo3356e(charSequenceMo3358i.length())];
        return extract(bArr, mo3354b(bArr, charSequenceMo3358i));
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo3354b(byte[] target, CharSequence chars) throws C2016i;

    /* JADX INFO: renamed from: c */
    public abstract void mo3355c(Appendable target, byte[] bytes, int off, int len) throws IOException;

    public abstract boolean canDecode(CharSequence chars);

    public final byte[] decode(CharSequence chars) {
        try {
            return m3353a(chars);
        } catch (C2016i e) {
            throw new IllegalArgumentException(e);
        }
    }

    @jd7
    @yg8
    public final rj1 decodingSource(hw1 encodedSource) {
        v7d.checkNotNull(encodedSource);
        return new C2009b(encodedSource);
    }

    @jd7
    @yg8
    public abstract InputStream decodingStream(Reader reader);

    /* JADX INFO: renamed from: e */
    public abstract int mo3356e(int chars);

    public String encode(byte[] bytes) {
        return encode(bytes, 0, bytes.length);
    }

    @jd7
    @yg8
    public final qj1 encodingSink(gw1 encodedSink) {
        v7d.checkNotNull(encodedSink);
        return new C2008a(encodedSink);
    }

    @jd7
    @yg8
    public abstract OutputStream encodingStream(Writer writer);

    /* JADX INFO: renamed from: f */
    public abstract int mo3357f(int bytes);

    /* JADX INFO: renamed from: i */
    public CharSequence mo3358i(CharSequence chars) {
        return (CharSequence) v7d.checkNotNull(chars);
    }

    public abstract br0 ignoreCase();

    public abstract br0 lowerCase();

    public abstract br0 omitPadding();

    public abstract br0 upperCase();

    public abstract br0 withPadChar(char padChar);

    public abstract br0 withSeparator(String separator, int n);

    /* JADX INFO: renamed from: br0$c */
    public class C2010c extends Reader {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Reader f14534a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f14535b;

        public C2010c(final Reader val$delegate, final String val$toIgnore) {
            this.f14534a = val$delegate;
            this.f14535b = val$toIgnore;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f14534a.close();
        }

        @Override // java.io.Reader
        public int read() throws IOException {
            int i;
            do {
                i = this.f14534a.read();
                if (i == -1) {
                    break;
                }
            } while (this.f14535b.indexOf((char) i) >= 0);
            return i;
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int off, int len) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    public final String encode(byte[] bytes, int off, int len) {
        v7d.checkPositionIndexes(off, off + len, bytes.length);
        StringBuilder sb = new StringBuilder(mo3357f(len));
        try {
            mo3355c(sb, bytes, off, len);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: br0$d */
    public class C2011d implements Appendable {

        /* JADX INFO: renamed from: a */
        public int f14536a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f14537b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Appendable f14538c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f14539d;

        public C2011d(final int val$afterEveryChars, final Appendable val$delegate, final String val$separator) {
            this.f14537b = val$afterEveryChars;
            this.f14538c = val$delegate;
            this.f14539d = val$separator;
            this.f14536a = val$afterEveryChars;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            if (this.f14536a == 0) {
                this.f14538c.append(this.f14539d);
                this.f14536a = this.f14537b;
            }
            this.f14538c.append(c);
            this.f14536a--;
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@wx1 CharSequence chars, int off, int len) {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Appendable
        public Appendable append(@wx1 CharSequence chars) {
            throw new UnsupportedOperationException();
        }
    }
}
