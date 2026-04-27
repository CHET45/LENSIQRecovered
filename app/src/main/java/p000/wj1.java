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
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
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

/* JADX INFO: loaded from: classes3.dex */
@ey1
public abstract class wj1 implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: C */
    public static final Comparator<wj1> f94375C;

    /* JADX INFO: renamed from: b */
    public static final int f94376b = 128;

    /* JADX INFO: renamed from: c */
    public static final int f94377c = 256;

    /* JADX INFO: renamed from: d */
    public static final int f94378d = 8192;

    /* JADX INFO: renamed from: e */
    public static final wj1 f94379e = new C14642j(v98.f90383e);

    /* JADX INFO: renamed from: f */
    public static final InterfaceC14638f f94380f;

    /* JADX INFO: renamed from: m */
    public static final int f94381m = 255;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public int f94382a = 0;

    /* JADX INFO: renamed from: wj1$a */
    public class C14633a extends AbstractC14635c {

        /* JADX INFO: renamed from: a */
        public int f94383a = 0;

        /* JADX INFO: renamed from: b */
        public final int f94384b;

        public C14633a() {
            this.f94384b = wj1.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f94383a < this.f94384b;
        }

        @Override // p000.wj1.InterfaceC14639g
        public byte nextByte() {
            int i = this.f94383a;
            if (i >= this.f94384b) {
                throw new NoSuchElementException();
            }
            this.f94383a = i + 1;
            return wj1.this.internalByteAt(i);
        }
    }

    /* JADX INFO: renamed from: wj1$b */
    public class C14634b implements Comparator<wj1> {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, wj1$g] */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Iterator, wj1$g] */
        @Override // java.util.Comparator
        public int compare(wj1 former, wj1 latter) {
            ?? it = former.iterator();
            ?? it2 = latter.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(wj1.toInt(it.nextByte())).compareTo(Integer.valueOf(wj1.toInt(it2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(former.size()).compareTo(Integer.valueOf(latter.size()));
        }
    }

    /* JADX INFO: renamed from: wj1$c */
    public static abstract class AbstractC14635c implements InterfaceC14639g {
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

    /* JADX INFO: renamed from: wj1$d */
    public static final class C14636d implements InterfaceC14638f {
        private C14636d() {
        }

        @Override // p000.wj1.InterfaceC14638f
        public byte[] copyFrom(byte[] bytes, int offset, int size) {
            return Arrays.copyOfRange(bytes, offset, size + offset);
        }

        public /* synthetic */ C14636d(C14633a c14633a) {
            this();
        }
    }

    /* JADX INFO: renamed from: wj1$e */
    public static final class C14637e extends C14642j {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: H */
        public final int f94386H;

        /* JADX INFO: renamed from: L */
        public final int f94387L;

        public C14637e(byte[] bytes, int offset, int length) {
            super(bytes);
            wj1.m24591c(offset, offset + length, bytes.length);
            this.f94386H = offset;
            this.f94387L = length;
        }

        private void readObject(ObjectInputStream in) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // p000.wj1.C14642j, p000.wj1
        public byte byteAt(int index) {
            wj1.m24590b(index, size());
            return this.f94390F[this.f94386H + index];
        }

        @Override // p000.wj1.C14642j, p000.wj1
        /* JADX INFO: renamed from: d */
        public void mo9862d(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            System.arraycopy(this.f94390F, mo24599u() + sourceOffset, target, targetOffset, numberToCopy);
        }

        @Override // p000.wj1.C14642j, p000.wj1
        public byte internalByteAt(int index) {
            return this.f94390F[this.f94386H + index];
        }

        @Override // p000.wj1.C14642j, p000.wj1
        public int size() {
            return this.f94387L;
        }

        @Override // p000.wj1.C14642j
        /* JADX INFO: renamed from: u */
        public int mo24599u() {
            return this.f94386H;
        }

        public Object writeReplace() {
            return wj1.m24595n(toByteArray());
        }
    }

    /* JADX INFO: renamed from: wj1$f */
    public interface InterfaceC14638f {
        byte[] copyFrom(byte[] bytes, int offset, int size);
    }

    /* JADX INFO: renamed from: wj1$g */
    public interface InterfaceC14639g extends Iterator<Byte> {
        byte nextByte();
    }

    /* JADX INFO: renamed from: wj1$h */
    public static final class C14640h {

        /* JADX INFO: renamed from: a */
        public final i72 f94388a;

        /* JADX INFO: renamed from: b */
        public final byte[] f94389b;

        public /* synthetic */ C14640h(int i, C14633a c14633a) {
            this(i);
        }

        public wj1 build() {
            this.f94388a.checkNoSpaceLeft();
            return new C14642j(this.f94389b);
        }

        public i72 getCodedOutput() {
            return this.f94388a;
        }

        private C14640h(int size) {
            byte[] bArr = new byte[size];
            this.f94389b = bArr;
            this.f94388a = i72.newInstance(bArr);
        }
    }

    /* JADX INFO: renamed from: wj1$i */
    public static abstract class AbstractC14641i extends wj1 {
        private static final long serialVersionUID = 1;

        public /* synthetic */ AbstractC14641i(C14633a c14633a) {
            this();
        }

        @Override // p000.wj1
        /* JADX INFO: renamed from: e */
        public final int mo9863e() {
            return 0;
        }

        @Override // p000.wj1
        /* JADX INFO: renamed from: f */
        public final boolean mo9864f() {
            return true;
        }

        @Override // p000.wj1, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }

        @Override // p000.wj1
        /* JADX INFO: renamed from: s */
        public void mo9870s(nj1 byteOutput) throws IOException {
            mo9868p(byteOutput);
        }

        /* JADX INFO: renamed from: t */
        public abstract boolean mo24600t(wj1 other, int offset, int length);

        private AbstractC14641i() {
        }
    }

    /* JADX INFO: renamed from: wj1$j */
    public static class C14642j extends AbstractC14641i {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: F */
        public final byte[] f94390F;

        public C14642j(byte[] bytes) {
            super(null);
            bytes.getClass();
            this.f94390F = bytes;
        }

        @Override // p000.wj1
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.f94390F, mo24599u(), size()).asReadOnlyBuffer();
        }

        @Override // p000.wj1
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // p000.wj1
        public byte byteAt(int index) {
            return this.f94390F[index];
        }

        @Override // p000.wj1
        public final void copyTo(ByteBuffer target) {
            target.put(this.f94390F, mo24599u(), size());
        }

        @Override // p000.wj1
        /* JADX INFO: renamed from: d */
        public void mo9862d(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            System.arraycopy(this.f94390F, sourceOffset, target, targetOffset, numberToCopy);
        }

        @Override // p000.wj1
        public final boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof wj1) || size() != ((wj1) other).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(other instanceof C14642j)) {
                return other.equals(this);
            }
            C14642j c14642j = (C14642j) other;
            int iM24597k = m24597k();
            int iM24597k2 = c14642j.m24597k();
            if (iM24597k == 0 || iM24597k2 == 0 || iM24597k == iM24597k2) {
                return mo24600t(c14642j, 0, size());
            }
            return false;
        }

        @Override // p000.wj1
        /* JADX INFO: renamed from: i */
        public final int mo9865i(int h, int offset, int length) {
            return v98.m23885e(h, this.f94390F, mo24599u() + offset, length);
        }

        @Override // p000.wj1
        public byte internalByteAt(int index) {
            return this.f94390F[index];
        }

        @Override // p000.wj1
        public final boolean isValidUtf8() {
            int iMo24599u = mo24599u();
            return lzh.m16496n(this.f94390F, iMo24599u, size() + iMo24599u);
        }

        @Override // p000.wj1
        /* JADX INFO: renamed from: j */
        public final int mo9866j(int state, int offset, int length) {
            int iMo24599u = mo24599u() + offset;
            return lzh.m16498p(state, this.f94390F, iMo24599u, length + iMo24599u);
        }

        @Override // p000.wj1
        /* JADX INFO: renamed from: l */
        public final String mo9867l(Charset charset) {
            return new String(this.f94390F, mo24599u(), size(), charset);
        }

        @Override // p000.wj1
        public final e72 newCodedInput() {
            return e72.m9776d(this.f94390F, mo24599u(), size(), true);
        }

        @Override // p000.wj1
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.f94390F, mo24599u(), size());
        }

        @Override // p000.wj1
        /* JADX INFO: renamed from: p */
        public final void mo9868p(nj1 output) throws IOException {
            output.writeLazy(this.f94390F, mo24599u(), size());
        }

        @Override // p000.wj1
        /* JADX INFO: renamed from: r */
        public final void mo9869r(OutputStream outputStream, int sourceOffset, int numberToWrite) throws IOException {
            outputStream.write(this.f94390F, mo24599u() + sourceOffset, numberToWrite);
        }

        @Override // p000.wj1
        public int size() {
            return this.f94390F.length;
        }

        @Override // p000.wj1
        public final wj1 substring(int beginIndex, int endIndex) {
            int iM24591c = wj1.m24591c(beginIndex, endIndex, size());
            return iM24591c == 0 ? wj1.f94379e : new C14637e(this.f94390F, mo24599u() + beginIndex, iM24591c);
        }

        @Override // p000.wj1.AbstractC14641i
        /* JADX INFO: renamed from: t */
        public final boolean mo24600t(wj1 other, int offset, int length) {
            if (length > other.size()) {
                throw new IllegalArgumentException("Length too large: " + length + size());
            }
            int i = offset + length;
            if (i > other.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + offset + ", " + length + ", " + other.size());
            }
            if (!(other instanceof C14642j)) {
                return other.substring(offset, i).equals(substring(0, length));
            }
            C14642j c14642j = (C14642j) other;
            byte[] bArr = this.f94390F;
            byte[] bArr2 = c14642j.f94390F;
            int iMo24599u = mo24599u() + length;
            int iMo24599u2 = mo24599u();
            int iMo24599u3 = c14642j.mo24599u() + offset;
            while (iMo24599u2 < iMo24599u) {
                if (bArr[iMo24599u2] != bArr2[iMo24599u3]) {
                    return false;
                }
                iMo24599u2++;
                iMo24599u3++;
            }
            return true;
        }

        /* JADX INFO: renamed from: u */
        public int mo24599u() {
            return 0;
        }

        @Override // p000.wj1
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }
    }

    /* JADX INFO: renamed from: wj1$k */
    public static final class C14643k extends AbstractC14641i {

        /* JADX INFO: renamed from: F */
        public final ByteBuffer f94391F;

        public C14643k(ByteBuffer buffer) {
            super(null);
            v98.m23882b(buffer, "buffer");
            this.f94391F = buffer.slice().order(ByteOrder.nativeOrder());
        }

        private void readObject(ObjectInputStream in) throws IOException {
            throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
        }

        private ByteBuffer slice(int beginIndex, int endIndex) {
            if (beginIndex < this.f94391F.position() || endIndex > this.f94391F.limit() || beginIndex > endIndex) {
                throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(beginIndex), Integer.valueOf(endIndex)));
            }
            ByteBuffer byteBufferSlice = this.f94391F.slice();
            mi8.m17327e(byteBufferSlice, beginIndex - this.f94391F.position());
            mi8.m17325c(byteBufferSlice, endIndex - this.f94391F.position());
            return byteBufferSlice;
        }

        private Object writeReplace() {
            return wj1.copyFrom(this.f94391F.slice());
        }

        @Override // p000.wj1
        public ByteBuffer asReadOnlyByteBuffer() {
            return this.f94391F.asReadOnlyBuffer();
        }

        @Override // p000.wj1
        public List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // p000.wj1
        public byte byteAt(int index) {
            try {
                return this.f94391F.get(index);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            } catch (IndexOutOfBoundsException e2) {
                throw new ArrayIndexOutOfBoundsException(e2.getMessage());
            }
        }

        @Override // p000.wj1
        public void copyTo(ByteBuffer target) {
            target.put(this.f94391F.slice());
        }

        @Override // p000.wj1
        /* JADX INFO: renamed from: d */
        public void mo9862d(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            ByteBuffer byteBufferSlice = this.f94391F.slice();
            mi8.m17327e(byteBufferSlice, sourceOffset);
            byteBufferSlice.get(target, targetOffset, numberToCopy);
        }

        @Override // p000.wj1
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof wj1)) {
                return false;
            }
            wj1 wj1Var = (wj1) other;
            if (size() != wj1Var.size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            return other instanceof C14643k ? this.f94391F.equals(((C14643k) other).f94391F) : other instanceof ebe ? other.equals(this) : this.f94391F.equals(wj1Var.asReadOnlyByteBuffer());
        }

        @Override // p000.wj1
        /* JADX INFO: renamed from: i */
        public int mo9865i(int h, int offset, int length) {
            for (int i = offset; i < offset + length; i++) {
                h = (h * 31) + this.f94391F.get(i);
            }
            return h;
        }

        @Override // p000.wj1
        public byte internalByteAt(int index) {
            return byteAt(index);
        }

        @Override // p000.wj1
        public boolean isValidUtf8() {
            return lzh.m16494l(this.f94391F);
        }

        @Override // p000.wj1
        /* JADX INFO: renamed from: j */
        public int mo9866j(int state, int offset, int length) {
            return lzh.m16497o(state, this.f94391F, offset, length + offset);
        }

        @Override // p000.wj1
        /* JADX INFO: renamed from: l */
        public String mo9867l(Charset charset) {
            byte[] byteArray;
            int length;
            int iArrayOffset;
            if (this.f94391F.hasArray()) {
                byteArray = this.f94391F.array();
                iArrayOffset = this.f94391F.arrayOffset() + this.f94391F.position();
                length = this.f94391F.remaining();
            } else {
                byteArray = toByteArray();
                length = byteArray.length;
                iArrayOffset = 0;
            }
            return new String(byteArray, iArrayOffset, length, charset);
        }

        @Override // p000.wj1
        public e72 newCodedInput() {
            return e72.m9775c(this.f94391F, true);
        }

        @Override // p000.wj1
        public InputStream newInput() {
            return new a();
        }

        @Override // p000.wj1
        /* JADX INFO: renamed from: p */
        public void mo9868p(nj1 output) throws IOException {
            output.writeLazy(this.f94391F.slice());
        }

        @Override // p000.wj1
        /* JADX INFO: renamed from: r */
        public void mo9869r(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
            if (!this.f94391F.hasArray()) {
                jj1.m14116b(slice(sourceOffset, numberToWrite + sourceOffset), out);
            } else {
                out.write(this.f94391F.array(), this.f94391F.arrayOffset() + this.f94391F.position() + sourceOffset, numberToWrite);
            }
        }

        @Override // p000.wj1
        public int size() {
            return this.f94391F.remaining();
        }

        @Override // p000.wj1
        public wj1 substring(int beginIndex, int endIndex) {
            try {
                return new C14643k(slice(beginIndex, endIndex));
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            } catch (IndexOutOfBoundsException e2) {
                throw new ArrayIndexOutOfBoundsException(e2.getMessage());
            }
        }

        @Override // p000.wj1.AbstractC14641i
        /* JADX INFO: renamed from: t */
        public boolean mo24600t(wj1 other, int offset, int length) {
            return substring(0, length).equals(other.substring(offset, length + offset));
        }

        @Override // p000.wj1
        public void writeTo(OutputStream out) throws IOException {
            out.write(toByteArray());
        }

        /* JADX INFO: renamed from: wj1$k$a */
        public class a extends InputStream {

            /* JADX INFO: renamed from: a */
            public final ByteBuffer f94392a;

            public a() {
                this.f94392a = C14643k.this.f94391F.slice();
            }

            @Override // java.io.InputStream
            public int available() throws IOException {
                return this.f94392a.remaining();
            }

            @Override // java.io.InputStream
            public void mark(int readlimit) {
                mi8.m17326d(this.f94392a);
            }

            @Override // java.io.InputStream
            public boolean markSupported() {
                return true;
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                if (this.f94392a.hasRemaining()) {
                    return this.f94392a.get() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public void reset() throws IOException {
                try {
                    mi8.m17328f(this.f94392a);
                } catch (InvalidMarkException e) {
                    throw new IOException(e);
                }
            }

            @Override // java.io.InputStream
            public int read(byte[] bytes, int off, int len) throws IOException {
                if (!this.f94392a.hasRemaining()) {
                    return -1;
                }
                int iMin = Math.min(len, this.f94392a.remaining());
                this.f94392a.get(bytes, off, iMin);
                return iMin;
            }
        }
    }

    /* JADX INFO: renamed from: wj1$m */
    public static final class C14645m implements InterfaceC14638f {
        private C14645m() {
        }

        @Override // p000.wj1.InterfaceC14638f
        public byte[] copyFrom(byte[] bytes, int offset, int size) {
            byte[] bArr = new byte[size];
            System.arraycopy(bytes, offset, bArr, 0, size);
            return bArr;
        }

        public /* synthetic */ C14645m(C14633a c14633a) {
            this();
        }
    }

    static {
        C14633a c14633a = null;
        f94380f = C9958no.m18046b() ? new C14645m(c14633a) : new C14636d(c14633a);
        f94375C = new C14634b();
    }

    /* JADX INFO: renamed from: b */
    public static void m24590b(int index, int size) {
        if (((size - (index + 1)) | index) < 0) {
            if (index < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + index);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + index + ", " + size);
        }
    }

    private static wj1 balancedConcat(Iterator<wj1> iterator, int length) {
        if (length < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(length)));
        }
        if (length == 1) {
            return iterator.next();
        }
        int i = length >>> 1;
        return balancedConcat(iterator, i).concat(balancedConcat(iterator, length - i));
    }

    @qp1
    /* JADX INFO: renamed from: c */
    public static int m24591c(int startIndex, int endIndex, int size) {
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

    public static wj1 copyFrom(byte[] bytes, int offset, int size) {
        m24591c(offset, offset + size, bytes.length);
        return new C14642j(f94380f.copyFrom(bytes, offset, size));
    }

    public static wj1 copyFromUtf8(String text) {
        return new C14642j(text.getBytes(v98.f90380b));
    }

    public static final wj1 empty() {
        return f94379e;
    }

    private static int extractHexDigit(String hexString, int index) {
        int iHexDigit = hexDigit(hexString.charAt(index));
        if (iHexDigit != -1) {
            return iHexDigit;
        }
        throw new NumberFormatException("Invalid hexString " + hexString + " must only contain [0-9a-fA-F] but contained " + hexString.charAt(index) + " at index " + index);
    }

    public static wj1 fromHex(@ud2 String hexString) {
        if (hexString.length() % 2 != 0) {
            throw new NumberFormatException("Invalid hexString " + hexString + " of length " + hexString.length() + " must be even.");
        }
        int length = hexString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (extractHexDigit(hexString, i2 + 1) | (extractHexDigit(hexString, i2) << 4));
        }
        return new C14642j(bArr);
    }

    /* JADX INFO: renamed from: g */
    public static C14640h m24592g(int size) {
        return new C14640h(size, null);
    }

    /* JADX INFO: renamed from: h */
    public static wj1 m24593h(ByteBuffer buffer) {
        return new C14643k(buffer);
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

    /* JADX INFO: renamed from: m */
    public static wj1 m24594m(ByteBuffer buffer) {
        if (!buffer.hasArray()) {
            return new C14643k(buffer);
        }
        return m24596o(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
    }

    /* JADX INFO: renamed from: n */
    public static wj1 m24595n(byte[] bytes) {
        return new C14642j(bytes);
    }

    public static C14644l newOutput(int initialCapacity) {
        return new C14644l(initialCapacity);
    }

    /* JADX INFO: renamed from: o */
    public static wj1 m24596o(byte[] bytes, int offset, int length) {
        return new C14637e(bytes, offset, length);
    }

    private static wj1 readChunk(InputStream in, final int chunkSize) throws IOException {
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

    public static wj1 readFrom(InputStream streamToDrain) throws IOException {
        return readFrom(streamToDrain, 256, 8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte value) {
        return value & 255;
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return dtg.m9359a(this);
        }
        return dtg.m9359a(substring(0, 47)) + "...";
    }

    public static Comparator<wj1> unsignedLexicographicalComparator() {
        return f94375C;
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int index);

    public final wj1 concat(wj1 other) {
        if (Integer.MAX_VALUE - size() >= other.size()) {
            return ebe.m9859v(this, other);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + other.size());
    }

    public abstract void copyTo(ByteBuffer target);

    public void copyTo(byte[] target, int offset) {
        copyTo(target, 0, offset, size());
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo9862d(byte[] target, int sourceOffset, int targetOffset, int numberToCopy);

    /* JADX INFO: renamed from: e */
    public abstract int mo9863e();

    public final boolean endsWith(wj1 suffix) {
        return size() >= suffix.size() && substring(size() - suffix.size()).equals(suffix);
    }

    public abstract boolean equals(Object o);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo9864f();

    public final int hashCode() {
        int iMo9865i = this.f94382a;
        if (iMo9865i == 0) {
            int size = size();
            iMo9865i = mo9865i(size, 0, size);
            if (iMo9865i == 0) {
                iMo9865i = 1;
            }
            this.f94382a = iMo9865i;
        }
        return iMo9865i;
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo9865i(int h, int offset, int length);

    public abstract byte internalByteAt(int index);

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    /* JADX INFO: renamed from: j */
    public abstract int mo9866j(int state, int offset, int length);

    /* JADX INFO: renamed from: k */
    public final int m24597k() {
        return this.f94382a;
    }

    /* JADX INFO: renamed from: l */
    public abstract String mo9867l(Charset charset);

    public abstract e72 newCodedInput();

    public abstract InputStream newInput();

    /* JADX INFO: renamed from: p */
    public abstract void mo9868p(nj1 byteOutput) throws IOException;

    /* JADX INFO: renamed from: q */
    public final void m24598q(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
        m24591c(sourceOffset, sourceOffset + numberToWrite, size());
        if (numberToWrite > 0) {
            mo9869r(out, sourceOffset, numberToWrite);
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo9869r(OutputStream out, int sourceOffset, int numberToWrite) throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract void mo9870s(nj1 byteOutput) throws IOException;

    public abstract int size();

    public final boolean startsWith(wj1 prefix) {
        return size() >= prefix.size() && substring(0, prefix.size()).equals(prefix);
    }

    public final wj1 substring(int beginIndex) {
        return substring(beginIndex, size());
    }

    public abstract wj1 substring(int beginIndex, int endIndex);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return v98.f90383e;
        }
        byte[] bArr = new byte[size];
        mo9862d(bArr, 0, 0, size);
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
        return toString(v98.f90380b);
    }

    public abstract void writeTo(OutputStream out) throws IOException;

    public static C14644l newOutput() {
        return new C14644l(128);
    }

    public static wj1 readFrom(InputStream streamToDrain, int chunkSize) throws IOException {
        return readFrom(streamToDrain, chunkSize, chunkSize);
    }

    @Deprecated
    public final void copyTo(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        m24591c(sourceOffset, sourceOffset + numberToCopy, size());
        m24591c(targetOffset, targetOffset + numberToCopy, target.length);
        if (numberToCopy > 0) {
            mo9862d(target, sourceOffset, targetOffset, numberToCopy);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C14633a();
    }

    public static wj1 copyFrom(byte[] bytes) {
        return copyFrom(bytes, 0, bytes.length);
    }

    public static wj1 readFrom(InputStream streamToDrain, int minChunkSize, int maxChunkSize) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            wj1 chunk = readChunk(streamToDrain, minChunkSize);
            if (chunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(chunk);
            minChunkSize = Math.min(minChunkSize * 2, maxChunkSize);
        }
    }

    /* JADX INFO: renamed from: wj1$l */
    public static final class C14644l extends OutputStream {

        /* JADX INFO: renamed from: f */
        public static final byte[] f94394f = new byte[0];

        /* JADX INFO: renamed from: a */
        public final int f94395a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<wj1> f94396b;

        /* JADX INFO: renamed from: c */
        public int f94397c;

        /* JADX INFO: renamed from: d */
        public byte[] f94398d;

        /* JADX INFO: renamed from: e */
        public int f94399e;

        public C14644l(int initialCapacity) {
            if (initialCapacity < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f94395a = initialCapacity;
            this.f94396b = new ArrayList<>();
            this.f94398d = new byte[initialCapacity];
        }

        private void flushFullBuffer(int minSize) {
            this.f94396b.add(new C14642j(this.f94398d));
            int length = this.f94397c + this.f94398d.length;
            this.f94397c = length;
            this.f94398d = new byte[Math.max(this.f94395a, Math.max(minSize, length >>> 1))];
            this.f94399e = 0;
        }

        private void flushLastBuffer() {
            int i = this.f94399e;
            byte[] bArr = this.f94398d;
            if (i >= bArr.length) {
                this.f94396b.add(new C14642j(this.f94398d));
                this.f94398d = f94394f;
            } else if (i > 0) {
                this.f94396b.add(new C14642j(Arrays.copyOf(bArr, i)));
            }
            this.f94397c += this.f94399e;
            this.f94399e = 0;
        }

        public synchronized void reset() {
            this.f94396b.clear();
            this.f94397c = 0;
            this.f94399e = 0;
        }

        public synchronized int size() {
            return this.f94397c + this.f94399e;
        }

        public synchronized wj1 toByteString() {
            flushLastBuffer();
            return wj1.copyFrom(this.f94396b);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int b) {
            try {
                if (this.f94399e == this.f94398d.length) {
                    flushFullBuffer(1);
                }
                byte[] bArr = this.f94398d;
                int i = this.f94399e;
                this.f94399e = i + 1;
                bArr[i] = (byte) b;
            } catch (Throwable th) {
                throw th;
            }
        }

        public void writeTo(OutputStream out) throws IOException {
            int i;
            wj1[] wj1VarArr;
            byte[] bArr;
            int i2;
            synchronized (this) {
                wj1VarArr = (wj1[]) this.f94396b.toArray(new wj1[0]);
                bArr = this.f94398d;
                i2 = this.f94399e;
            }
            for (wj1 wj1Var : wj1VarArr) {
                wj1Var.writeTo(out);
            }
            out.write(Arrays.copyOf(bArr, i2));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] b, int offset, int length) {
            try {
                byte[] bArr = this.f94398d;
                int length2 = bArr.length;
                int i = this.f94399e;
                if (length <= length2 - i) {
                    System.arraycopy(b, offset, bArr, i, length);
                    this.f94399e += length;
                } else {
                    int length3 = bArr.length - i;
                    System.arraycopy(b, offset, bArr, i, length3);
                    int i2 = length - length3;
                    flushFullBuffer(i2);
                    System.arraycopy(b, offset + length3, this.f94398d, 0, i2);
                    this.f94399e = i2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static wj1 copyFrom(ByteBuffer bytes, int size) {
        m24591c(0, size, bytes.remaining());
        byte[] bArr = new byte[size];
        bytes.get(bArr);
        return new C14642j(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : mo9867l(charset);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), truncateAndEscapeForDisplay());
    }

    public static wj1 copyFrom(ByteBuffer bytes) {
        return copyFrom(bytes, bytes.remaining());
    }

    public static wj1 copyFrom(String text, String charsetName) throws UnsupportedEncodingException {
        return new C14642j(text.getBytes(charsetName));
    }

    public static wj1 copyFrom(String text, Charset charset) {
        return new C14642j(text.getBytes(charset));
    }

    public static wj1 copyFrom(Iterable<wj1> byteStrings) {
        int size;
        if (!(byteStrings instanceof Collection)) {
            Iterator<wj1> it = byteStrings.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) byteStrings).size();
        }
        if (size == 0) {
            return f94379e;
        }
        return balancedConcat(byteStrings.iterator(), size);
    }
}
