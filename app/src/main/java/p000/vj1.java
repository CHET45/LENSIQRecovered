package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public abstract class vj1 implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: C */
    public static final Comparator<vj1> f91340C;

    /* JADX INFO: renamed from: b */
    public static final int f91341b = 128;

    /* JADX INFO: renamed from: c */
    public static final int f91342c = 256;

    /* JADX INFO: renamed from: d */
    public static final int f91343d = 8192;

    /* JADX INFO: renamed from: e */
    public static final vj1 f91344e = new C14112j(w98.f93677e);

    /* JADX INFO: renamed from: f */
    public static final InterfaceC14108f f91345f;

    /* JADX INFO: renamed from: m */
    public static final int f91346m = 255;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public int f91347a = 0;

    /* JADX INFO: renamed from: vj1$a */
    public class C14103a extends AbstractC14105c {

        /* JADX INFO: renamed from: a */
        public int f91348a = 0;

        /* JADX INFO: renamed from: b */
        public final int f91349b;

        public C14103a() {
            this.f91349b = vj1.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f91348a < this.f91349b;
        }

        @Override // p000.vj1.InterfaceC14109g
        public byte nextByte() {
            int i = this.f91348a;
            if (i >= this.f91349b) {
                throw new NoSuchElementException();
            }
            this.f91348a = i + 1;
            return vj1.this.internalByteAt(i);
        }
    }

    /* JADX INFO: renamed from: vj1$b */
    public class C14104b implements Comparator<vj1> {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, vj1$g] */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Iterator, vj1$g] */
        @Override // java.util.Comparator
        public int compare(vj1 former, vj1 latter) {
            ?? it = former.iterator();
            ?? it2 = latter.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(vj1.toInt(it.nextByte())).compareTo(Integer.valueOf(vj1.toInt(it2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(former.size()).compareTo(Integer.valueOf(latter.size()));
        }
    }

    /* JADX INFO: renamed from: vj1$c */
    public static abstract class AbstractC14105c implements InterfaceC14109g {
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    /* JADX INFO: renamed from: vj1$d */
    public static final class C14106d implements InterfaceC14108f {
        private C14106d() {
        }

        @Override // p000.vj1.InterfaceC14108f
        public byte[] copyFrom(byte[] bytes, int offset, int size) {
            return Arrays.copyOfRange(bytes, offset, size + offset);
        }

        public /* synthetic */ C14106d(C14103a c14103a) {
            this();
        }
    }

    /* JADX INFO: renamed from: vj1$e */
    public static final class C14107e extends C14112j {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: H */
        public final int f91351H;

        /* JADX INFO: renamed from: L */
        public final int f91352L;

        public C14107e(byte[] bytes, int offset, int length) {
            super(bytes);
            vj1.m24015c(offset, offset + length, bytes.length);
            this.f91351H = offset;
            this.f91352L = length;
        }

        private void readObject(ObjectInputStream in) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // p000.vj1.C14112j, p000.vj1
        public byte byteAt(int index) {
            vj1.m24014b(index, size());
            return this.f91355F[this.f91351H + index];
        }

        @Override // p000.vj1.C14112j, p000.vj1
        /* JADX INFO: renamed from: d */
        public void mo9050d(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            System.arraycopy(this.f91355F, mo24022t() + sourceOffset, target, targetOffset, numberToCopy);
        }

        @Override // p000.vj1.C14112j, p000.vj1
        public byte internalByteAt(int index) {
            return this.f91355F[this.f91351H + index];
        }

        @Override // p000.vj1.C14112j, p000.vj1
        public int size() {
            return this.f91352L;
        }

        @Override // p000.vj1.C14112j
        /* JADX INFO: renamed from: t */
        public int mo24022t() {
            return this.f91351H;
        }

        public Object writeReplace() {
            return vj1.m24018m(toByteArray());
        }
    }

    /* JADX INFO: renamed from: vj1$f */
    public interface InterfaceC14108f {
        byte[] copyFrom(byte[] bytes, int offset, int size);
    }

    /* JADX INFO: renamed from: vj1$g */
    public interface InterfaceC14109g extends Iterator<Byte> {
        byte nextByte();
    }

    /* JADX INFO: renamed from: vj1$h */
    public static final class C14110h {

        /* JADX INFO: renamed from: a */
        public final j72 f91353a;

        /* JADX INFO: renamed from: b */
        public final byte[] f91354b;

        public /* synthetic */ C14110h(int i, C14103a c14103a) {
            this(i);
        }

        public vj1 build() {
            this.f91353a.checkNoSpaceLeft();
            return new C14112j(this.f91354b);
        }

        public j72 getCodedOutput() {
            return this.f91353a;
        }

        private C14110h(int size) {
            byte[] bArr = new byte[size];
            this.f91354b = bArr;
            this.f91353a = j72.newInstance(bArr);
        }
    }

    /* JADX INFO: renamed from: vj1$i */
    public static abstract class AbstractC14111i extends vj1 {
        private static final long serialVersionUID = 1;

        @Override // p000.vj1
        /* JADX INFO: renamed from: e */
        public final int mo9051e() {
            return 0;
        }

        @Override // p000.vj1
        /* JADX INFO: renamed from: f */
        public final boolean mo9052f() {
            return true;
        }

        @Override // p000.vj1, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }

        @Override // p000.vj1
        /* JADX INFO: renamed from: r */
        public void mo9058r(mj1 byteOutput) throws IOException {
            mo9056o(byteOutput);
        }

        /* JADX INFO: renamed from: s */
        public abstract boolean mo24023s(vj1 other, int offset, int length);
    }

    /* JADX INFO: renamed from: vj1$j */
    public static class C14112j extends AbstractC14111i {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: F */
        public final byte[] f91355F;

        public C14112j(byte[] bytes) {
            bytes.getClass();
            this.f91355F = bytes;
        }

        @Override // p000.vj1
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.f91355F, mo24022t(), size()).asReadOnlyBuffer();
        }

        @Override // p000.vj1
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // p000.vj1
        public byte byteAt(int index) {
            return this.f91355F[index];
        }

        @Override // p000.vj1
        public final void copyTo(ByteBuffer target) {
            target.put(this.f91355F, mo24022t(), size());
        }

        @Override // p000.vj1
        /* JADX INFO: renamed from: d */
        public void mo9050d(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            System.arraycopy(this.f91355F, sourceOffset, target, targetOffset, numberToCopy);
        }

        @Override // p000.vj1
        public final boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof vj1) || size() != ((vj1) other).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(other instanceof C14112j)) {
                return other.equals(this);
            }
            C14112j c14112j = (C14112j) other;
            int iM24020j = m24020j();
            int iM24020j2 = c14112j.m24020j();
            if (iM24020j == 0 || iM24020j2 == 0 || iM24020j == iM24020j2) {
                return mo24023s(c14112j, 0, size());
            }
            return false;
        }

        @Override // p000.vj1
        /* JADX INFO: renamed from: h */
        public final int mo9053h(int h, int offset, int length) {
            return w98.m24436e(h, this.f91355F, mo24022t() + offset, length);
        }

        @Override // p000.vj1
        /* JADX INFO: renamed from: i */
        public final int mo9054i(int state, int offset, int length) {
            int iMo24022t = mo24022t() + offset;
            return pzh.m19876p(state, this.f91355F, iMo24022t, length + iMo24022t);
        }

        @Override // p000.vj1
        public byte internalByteAt(int index) {
            return this.f91355F[index];
        }

        @Override // p000.vj1
        public final boolean isValidUtf8() {
            int iMo24022t = mo24022t();
            return pzh.m19874n(this.f91355F, iMo24022t, size() + iMo24022t);
        }

        @Override // p000.vj1
        /* JADX INFO: renamed from: k */
        public final String mo9055k(Charset charset) {
            return new String(this.f91355F, mo24022t(), size(), charset);
        }

        @Override // p000.vj1
        public final f72 newCodedInput() {
            return f72.m10684d(this.f91355F, mo24022t(), size(), true);
        }

        @Override // p000.vj1
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.f91355F, mo24022t(), size());
        }

        @Override // p000.vj1
        /* JADX INFO: renamed from: o */
        public final void mo9056o(mj1 output) throws IOException {
            output.writeLazy(this.f91355F, mo24022t(), size());
        }

        @Override // p000.vj1
        /* JADX INFO: renamed from: q */
        public final void mo9057q(OutputStream outputStream, int sourceOffset, int numberToWrite) throws IOException {
            outputStream.write(this.f91355F, mo24022t() + sourceOffset, numberToWrite);
        }

        @Override // p000.vj1.AbstractC14111i
        /* JADX INFO: renamed from: s */
        public final boolean mo24023s(vj1 other, int offset, int length) {
            if (length > other.size()) {
                throw new IllegalArgumentException("Length too large: " + length + size());
            }
            int i = offset + length;
            if (i > other.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + offset + ", " + length + ", " + other.size());
            }
            if (!(other instanceof C14112j)) {
                return other.substring(offset, i).equals(substring(0, length));
            }
            C14112j c14112j = (C14112j) other;
            byte[] bArr = this.f91355F;
            byte[] bArr2 = c14112j.f91355F;
            int iMo24022t = mo24022t() + length;
            int iMo24022t2 = mo24022t();
            int iMo24022t3 = c14112j.mo24022t() + offset;
            while (iMo24022t2 < iMo24022t) {
                if (bArr[iMo24022t2] != bArr2[iMo24022t3]) {
                    return false;
                }
                iMo24022t2++;
                iMo24022t3++;
            }
            return true;
        }

        @Override // p000.vj1
        public int size() {
            return this.f91355F.length;
        }

        @Override // p000.vj1
        public final vj1 substring(int beginIndex, int endIndex) {
            int iM24015c = vj1.m24015c(beginIndex, endIndex, size());
            return iM24015c == 0 ? vj1.f91344e : new C14107e(this.f91355F, mo24022t() + beginIndex, iM24015c);
        }

        /* JADX INFO: renamed from: t */
        public int mo24022t() {
            return 0;
        }

        @Override // p000.vj1
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }
    }

    /* JADX INFO: renamed from: vj1$l */
    public static final class C14114l implements InterfaceC14108f {
        private C14114l() {
        }

        @Override // p000.vj1.InterfaceC14108f
        public byte[] copyFrom(byte[] bytes, int offset, int size) {
            byte[] bArr = new byte[size];
            System.arraycopy(bytes, offset, bArr, 0, size);
            return bArr;
        }

        public /* synthetic */ C14114l(C14103a c14103a) {
            this();
        }
    }

    static {
        C14103a c14103a = null;
        f91345f = C9427mo.m17477b() ? new C14114l(c14103a) : new C14106d(c14103a);
        f91340C = new C14104b();
    }

    /* JADX INFO: renamed from: b */
    public static void m24014b(int index, int size) {
        if (((size - (index + 1)) | index) < 0) {
            if (index < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + index);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + index + ", " + size);
        }
    }

    private static vj1 balancedConcat(Iterator<vj1> iterator, int length) {
        if (length < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(length)));
        }
        if (length == 1) {
            return iterator.next();
        }
        int i = length >>> 1;
        return balancedConcat(iterator, i).concat(balancedConcat(iterator, length - i));
    }

    @pp1
    /* JADX INFO: renamed from: c */
    public static int m24015c(int startIndex, int endIndex, int size) {
        int i = endIndex - startIndex;
        if ((startIndex | endIndex | i | (size - endIndex)) >= 0) {
            return i;
        }
        if (startIndex < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + startIndex + " < 0");
        }
        if (endIndex < startIndex) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + startIndex + ", " + endIndex);
        }
        throw new IndexOutOfBoundsException("End index: " + endIndex + " >= " + size);
    }

    public static vj1 copyFrom(byte[] bytes, int offset, int size) {
        m24015c(offset, offset + size, bytes.length);
        return new C14112j(f91345f.copyFrom(bytes, offset, size));
    }

    public static vj1 copyFromUtf8(String text) {
        return new C14112j(text.getBytes(w98.f93674b));
    }

    public static final vj1 empty() {
        return f91344e;
    }

    private static int extractHexDigit(String hexString, int index) {
        int iHexDigit = hexDigit(hexString.charAt(index));
        if (iHexDigit != -1) {
            return iHexDigit;
        }
        throw new NumberFormatException("Invalid hexString " + hexString + " must only contain [0-9a-fA-F] but contained " + hexString.charAt(index) + " at index " + index);
    }

    public static vj1 fromHex(@td2 String hexString) {
        if (hexString.length() % 2 != 0) {
            throw new NumberFormatException("Invalid hexString " + hexString + " of length " + hexString.length() + " must be even.");
        }
        int length = hexString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (extractHexDigit(hexString, i2 + 1) | (extractHexDigit(hexString, i2) << 4));
        }
        return new C14112j(bArr);
    }

    /* JADX INFO: renamed from: g */
    public static C14110h m24016g(int size) {
        return new C14110h(size, null);
    }

    private static int hexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (c < 'a' || c > 'f') {
            return -1;
        }
        return c - 'W';
    }

    /* JADX INFO: renamed from: l */
    public static vj1 m24017l(ByteBuffer buffer) {
        if (!buffer.hasArray()) {
            return new ycb(buffer);
        }
        return m24019n(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
    }

    /* JADX INFO: renamed from: m */
    public static vj1 m24018m(byte[] bytes) {
        return new C14112j(bytes);
    }

    /* JADX INFO: renamed from: n */
    public static vj1 m24019n(byte[] bytes, int offset, int length) {
        return new C14107e(bytes, offset, length);
    }

    public static C14113k newOutput(int initialCapacity) {
        return new C14113k(initialCapacity);
    }

    private static vj1 readChunk(InputStream in, final int chunkSize) throws IOException {
        byte[] bArr = new byte[chunkSize];
        int i = 0;
        while (i < chunkSize) {
            int i2 = in.read(bArr, i, chunkSize - i);
            if (i2 == -1) {
                break;
            }
            i += i2;
        }
        if (i == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i);
    }

    public static vj1 readFrom(InputStream streamToDrain) throws IOException {
        return readFrom(streamToDrain, 256, 8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte value) {
        return value & 255;
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return ctg.m8687a(this);
        }
        return ctg.m8687a(substring(0, 47)) + "...";
    }

    public static Comparator<vj1> unsignedLexicographicalComparator() {
        return f91340C;
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int index);

    public final vj1 concat(vj1 other) {
        if (Integer.MAX_VALUE - size() >= other.size()) {
            return dbe.m9047u(this, other);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + other.size());
    }

    public abstract void copyTo(ByteBuffer target);

    public void copyTo(byte[] target, int offset) {
        copyTo(target, 0, offset, size());
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo9050d(byte[] target, int sourceOffset, int targetOffset, int numberToCopy);

    /* JADX INFO: renamed from: e */
    public abstract int mo9051e();

    public final boolean endsWith(vj1 suffix) {
        return size() >= suffix.size() && substring(size() - suffix.size()).equals(suffix);
    }

    public abstract boolean equals(Object o);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo9052f();

    /* JADX INFO: renamed from: h */
    public abstract int mo9053h(int h, int offset, int length);

    public final int hashCode() {
        int iMo9053h = this.f91347a;
        if (iMo9053h == 0) {
            int size = size();
            iMo9053h = mo9053h(size, 0, size);
            if (iMo9053h == 0) {
                iMo9053h = 1;
            }
            this.f91347a = iMo9053h;
        }
        return iMo9053h;
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo9054i(int state, int offset, int length);

    public abstract byte internalByteAt(int index);

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    /* JADX INFO: renamed from: j */
    public final int m24020j() {
        return this.f91347a;
    }

    /* JADX INFO: renamed from: k */
    public abstract String mo9055k(Charset charset);

    public abstract f72 newCodedInput();

    public abstract InputStream newInput();

    /* JADX INFO: renamed from: o */
    public abstract void mo9056o(mj1 byteOutput) throws IOException;

    /* JADX INFO: renamed from: p */
    public final void m24021p(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
        m24015c(sourceOffset, sourceOffset + numberToWrite, size());
        if (numberToWrite > 0) {
            mo9057q(out, sourceOffset, numberToWrite);
        }
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo9057q(OutputStream out, int sourceOffset, int numberToWrite) throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract void mo9058r(mj1 byteOutput) throws IOException;

    public abstract int size();

    public final boolean startsWith(vj1 prefix) {
        return size() >= prefix.size() && substring(0, prefix.size()).equals(prefix);
    }

    public final vj1 substring(int beginIndex) {
        return substring(beginIndex, size());
    }

    public abstract vj1 substring(int beginIndex, int endIndex);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return w98.f93677e;
        }
        byte[] bArr = new byte[size];
        mo9050d(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String charsetName) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(charsetName));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(charsetName);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    public final String toStringUtf8() {
        return toString(w98.f93674b);
    }

    public abstract void writeTo(OutputStream out) throws IOException;

    public static C14113k newOutput() {
        return new C14113k(128);
    }

    public static vj1 readFrom(InputStream streamToDrain, int chunkSize) throws IOException {
        return readFrom(streamToDrain, chunkSize, chunkSize);
    }

    @Deprecated
    public final void copyTo(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        m24015c(sourceOffset, sourceOffset + numberToCopy, size());
        m24015c(targetOffset, targetOffset + numberToCopy, target.length);
        if (numberToCopy > 0) {
            mo9050d(target, sourceOffset, targetOffset, numberToCopy);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C14103a();
    }

    public static vj1 copyFrom(byte[] bytes) {
        return copyFrom(bytes, 0, bytes.length);
    }

    public static vj1 readFrom(InputStream streamToDrain, int minChunkSize, int maxChunkSize) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            vj1 chunk = readChunk(streamToDrain, minChunkSize);
            if (chunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(chunk);
            minChunkSize = Math.min(minChunkSize * 2, maxChunkSize);
        }
    }

    /* JADX INFO: renamed from: vj1$k */
    public static final class C14113k extends OutputStream {

        /* JADX INFO: renamed from: f */
        public static final byte[] f91356f = new byte[0];

        /* JADX INFO: renamed from: a */
        public final int f91357a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<vj1> f91358b;

        /* JADX INFO: renamed from: c */
        public int f91359c;

        /* JADX INFO: renamed from: d */
        public byte[] f91360d;

        /* JADX INFO: renamed from: e */
        public int f91361e;

        public C14113k(int initialCapacity) {
            if (initialCapacity < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f91357a = initialCapacity;
            this.f91358b = new ArrayList<>();
            this.f91360d = new byte[initialCapacity];
        }

        private void flushFullBuffer(int minSize) {
            this.f91358b.add(new C14112j(this.f91360d));
            int length = this.f91359c + this.f91360d.length;
            this.f91359c = length;
            this.f91360d = new byte[Math.max(this.f91357a, Math.max(minSize, length >>> 1))];
            this.f91361e = 0;
        }

        private void flushLastBuffer() {
            int i = this.f91361e;
            byte[] bArr = this.f91360d;
            if (i >= bArr.length) {
                this.f91358b.add(new C14112j(this.f91360d));
                this.f91360d = f91356f;
            } else if (i > 0) {
                this.f91358b.add(new C14112j(Arrays.copyOf(bArr, i)));
            }
            this.f91359c += this.f91361e;
            this.f91361e = 0;
        }

        public synchronized void reset() {
            this.f91358b.clear();
            this.f91359c = 0;
            this.f91361e = 0;
        }

        public synchronized int size() {
            return this.f91359c + this.f91361e;
        }

        public synchronized vj1 toByteString() {
            flushLastBuffer();
            return vj1.copyFrom(this.f91358b);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int b) {
            try {
                if (this.f91361e == this.f91360d.length) {
                    flushFullBuffer(1);
                }
                byte[] bArr = this.f91360d;
                int i = this.f91361e;
                this.f91361e = i + 1;
                bArr[i] = (byte) b;
            } catch (Throwable th) {
                throw th;
            }
        }

        public void writeTo(OutputStream out) throws IOException {
            int i;
            vj1[] vj1VarArr;
            byte[] bArr;
            int i2;
            synchronized (this) {
                vj1VarArr = (vj1[]) this.f91358b.toArray(new vj1[0]);
                bArr = this.f91360d;
                i2 = this.f91361e;
            }
            for (vj1 vj1Var : vj1VarArr) {
                vj1Var.writeTo(out);
            }
            out.write(Arrays.copyOf(bArr, i2));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] b, int offset, int length) {
            try {
                byte[] bArr = this.f91360d;
                int length2 = bArr.length;
                int i = this.f91361e;
                if (length <= length2 - i) {
                    System.arraycopy(b, offset, bArr, i, length);
                    this.f91361e += length;
                } else {
                    int length3 = bArr.length - i;
                    System.arraycopy(b, offset, bArr, i, length3);
                    int i2 = length - length3;
                    flushFullBuffer(i2);
                    System.arraycopy(b, offset + length3, this.f91360d, 0, i2);
                    this.f91361e = i2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static vj1 copyFrom(ByteBuffer bytes, int size) {
        m24015c(0, size, bytes.remaining());
        byte[] bArr = new byte[size];
        bytes.get(bArr);
        return new C14112j(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : mo9055k(charset);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), truncateAndEscapeForDisplay());
    }

    public static vj1 copyFrom(ByteBuffer bytes) {
        return copyFrom(bytes, bytes.remaining());
    }

    public static vj1 copyFrom(String text, String charsetName) throws UnsupportedEncodingException {
        return new C14112j(text.getBytes(charsetName));
    }

    public static vj1 copyFrom(String text, Charset charset) {
        return new C14112j(text.getBytes(charset));
    }

    public static vj1 copyFrom(Iterable<vj1> byteStrings) {
        int size;
        if (!(byteStrings instanceof Collection)) {
            Iterator<vj1> it = byteStrings.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) byteStrings).size();
        }
        if (size == 0) {
            return f91344e;
        }
        return balancedConcat(byteStrings.iterator(), size);
    }
}
