package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p000.wj1;
import p000.ymh;

/* JADX INFO: loaded from: classes3.dex */
public final class ebe extends wj1 {

    /* JADX INFO: renamed from: Q */
    public static final int[] f32538Q = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, ymh.InterfaceC15726e.f102218z, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: F */
    public final int f32539F;

    /* JADX INFO: renamed from: H */
    public final wj1 f32540H;

    /* JADX INFO: renamed from: L */
    public final wj1 f32541L;

    /* JADX INFO: renamed from: M */
    public final int f32542M;

    /* JADX INFO: renamed from: N */
    public final int f32543N;

    /* JADX INFO: renamed from: ebe$a */
    public class C5244a extends wj1.AbstractC14635c {

        /* JADX INFO: renamed from: a */
        public final C5246c f32544a;

        /* JADX INFO: renamed from: b */
        public wj1.InterfaceC14639g f32545b = nextPiece();

        public C5244a() {
            this.f32544a = new C5246c(ebe.this, null);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [wj1$g] */
        private wj1.InterfaceC14639g nextPiece() {
            if (this.f32544a.hasNext()) {
                return this.f32544a.next().iterator();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32545b != null;
        }

        @Override // p000.wj1.InterfaceC14639g
        public byte nextByte() {
            wj1.InterfaceC14639g interfaceC14639g = this.f32545b;
            if (interfaceC14639g == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = interfaceC14639g.nextByte();
            if (!this.f32545b.hasNext()) {
                this.f32545b = nextPiece();
            }
            return bNextByte;
        }
    }

    /* JADX INFO: renamed from: ebe$c */
    public static final class C5246c implements Iterator<wj1.AbstractC14641i> {

        /* JADX INFO: renamed from: a */
        public final ArrayDeque<ebe> f32548a;

        /* JADX INFO: renamed from: b */
        public wj1.AbstractC14641i f32549b;

        public /* synthetic */ C5246c(wj1 wj1Var, C5244a c5244a) {
            this(wj1Var);
        }

        private wj1.AbstractC14641i getLeafByLeft(wj1 root) {
            while (root instanceof ebe) {
                ebe ebeVar = (ebe) root;
                this.f32548a.push(ebeVar);
                root = ebeVar.f32540H;
            }
            return (wj1.AbstractC14641i) root;
        }

        private wj1.AbstractC14641i getNextNonEmptyLeaf() {
            wj1.AbstractC14641i leafByLeft;
            do {
                ArrayDeque<ebe> arrayDeque = this.f32548a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByLeft = getLeafByLeft(this.f32548a.pop().f32541L);
            } while (leafByLeft.isEmpty());
            return leafByLeft;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32549b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C5246c(wj1 root) {
            if (!(root instanceof ebe)) {
                this.f32548a = null;
                this.f32549b = (wj1.AbstractC14641i) root;
                return;
            }
            ebe ebeVar = (ebe) root;
            ArrayDeque<ebe> arrayDeque = new ArrayDeque<>(ebeVar.mo9863e());
            this.f32548a = arrayDeque;
            arrayDeque.push(ebeVar);
            this.f32549b = getLeafByLeft(ebeVar.f32540H);
        }

        @Override // java.util.Iterator
        public wj1.AbstractC14641i next() {
            wj1.AbstractC14641i abstractC14641i = this.f32549b;
            if (abstractC14641i == null) {
                throw new NoSuchElementException();
            }
            this.f32549b = getNextNonEmptyLeaf();
            return abstractC14641i;
        }
    }

    public /* synthetic */ ebe(wj1 wj1Var, wj1 wj1Var2, C5244a c5244a) {
        this(wj1Var, wj1Var2);
    }

    private static wj1 concatenateBytes(wj1 left, wj1 right) {
        int size = left.size();
        int size2 = right.size();
        byte[] bArr = new byte[size + size2];
        left.copyTo(bArr, 0, 0, size);
        right.copyTo(bArr, 0, size, size2);
        return wj1.m24595n(bArr);
    }

    private boolean equalsFragments(wj1 wj1Var) {
        C5244a c5244a = null;
        C5246c c5246c = new C5246c(this, c5244a);
        wj1.AbstractC14641i next = c5246c.next();
        C5246c c5246c2 = new C5246c(wj1Var, c5244a);
        wj1.AbstractC14641i next2 = c5246c2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? next.mo24600t(next2, i2, iMin) : next2.mo24600t(next, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.f32539F;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                i = 0;
                next = c5246c.next();
            } else {
                i += iMin;
                next = next;
            }
            if (iMin == size2) {
                next2 = c5246c2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    private void readObject(ObjectInputStream in) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    /* JADX INFO: renamed from: v */
    public static wj1 m9859v(wj1 left, wj1 right) {
        if (right.size() == 0) {
            return left;
        }
        if (left.size() == 0) {
            return right;
        }
        int size = left.size() + right.size();
        if (size < 128) {
            return concatenateBytes(left, right);
        }
        if (left instanceof ebe) {
            ebe ebeVar = (ebe) left;
            if (ebeVar.f32541L.size() + right.size() < 128) {
                return new ebe(ebeVar.f32540H, concatenateBytes(ebeVar.f32541L, right));
            }
            if (ebeVar.f32540H.mo9863e() > ebeVar.f32541L.mo9863e() && ebeVar.mo9863e() > right.mo9863e()) {
                return new ebe(ebeVar.f32540H, new ebe(ebeVar.f32541L, right));
            }
        }
        return size >= m9860w(Math.max(left.mo9863e(), right.mo9863e()) + 1) ? new ebe(left, right) : new C5245b(null).balance(left, right);
    }

    /* JADX INFO: renamed from: w */
    public static int m9860w(int depth) {
        int[] iArr = f32538Q;
        if (depth >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[depth];
    }

    /* JADX INFO: renamed from: x */
    public static ebe m9861x(wj1 left, wj1 right) {
        return new ebe(left, right);
    }

    @Override // p000.wj1
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // p000.wj1
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        C5246c c5246c = new C5246c(this, null);
        while (c5246c.hasNext()) {
            arrayList.add(c5246c.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // p000.wj1
    public byte byteAt(int index) {
        wj1.m24590b(index, this.f32539F);
        return internalByteAt(index);
    }

    @Override // p000.wj1
    public void copyTo(ByteBuffer target) {
        this.f32540H.copyTo(target);
        this.f32541L.copyTo(target);
    }

    @Override // p000.wj1
    /* JADX INFO: renamed from: d */
    public void mo9862d(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        int i = sourceOffset + numberToCopy;
        int i2 = this.f32542M;
        if (i <= i2) {
            this.f32540H.mo9862d(target, sourceOffset, targetOffset, numberToCopy);
        } else {
            if (sourceOffset >= i2) {
                this.f32541L.mo9862d(target, sourceOffset - i2, targetOffset, numberToCopy);
                return;
            }
            int i3 = i2 - sourceOffset;
            this.f32540H.mo9862d(target, sourceOffset, targetOffset, i3);
            this.f32541L.mo9862d(target, 0, targetOffset + i3, numberToCopy - i3);
        }
    }

    @Override // p000.wj1
    /* JADX INFO: renamed from: e */
    public int mo9863e() {
        return this.f32543N;
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
        if (this.f32539F != wj1Var.size()) {
            return false;
        }
        if (this.f32539F == 0) {
            return true;
        }
        int iM24597k = m24597k();
        int iM24597k2 = wj1Var.m24597k();
        if (iM24597k == 0 || iM24597k2 == 0 || iM24597k == iM24597k2) {
            return equalsFragments(wj1Var);
        }
        return false;
    }

    @Override // p000.wj1
    /* JADX INFO: renamed from: f */
    public boolean mo9864f() {
        return this.f32539F >= m9860w(this.f32543N);
    }

    @Override // p000.wj1
    /* JADX INFO: renamed from: i */
    public int mo9865i(int h, int offset, int length) {
        int i = offset + length;
        int i2 = this.f32542M;
        if (i <= i2) {
            return this.f32540H.mo9865i(h, offset, length);
        }
        if (offset >= i2) {
            return this.f32541L.mo9865i(h, offset - i2, length);
        }
        int i3 = i2 - offset;
        return this.f32541L.mo9865i(this.f32540H.mo9865i(h, offset, i3), 0, length - i3);
    }

    @Override // p000.wj1
    public byte internalByteAt(int index) {
        int i = this.f32542M;
        return index < i ? this.f32540H.internalByteAt(index) : this.f32541L.internalByteAt(index - i);
    }

    @Override // p000.wj1
    public boolean isValidUtf8() {
        int iMo9866j = this.f32540H.mo9866j(0, 0, this.f32542M);
        wj1 wj1Var = this.f32541L;
        return wj1Var.mo9866j(iMo9866j, 0, wj1Var.size()) == 0;
    }

    @Override // p000.wj1
    /* JADX INFO: renamed from: j */
    public int mo9866j(int state, int offset, int length) {
        int i = offset + length;
        int i2 = this.f32542M;
        if (i <= i2) {
            return this.f32540H.mo9866j(state, offset, length);
        }
        if (offset >= i2) {
            return this.f32541L.mo9866j(state, offset - i2, length);
        }
        int i3 = i2 - offset;
        return this.f32541L.mo9866j(this.f32540H.mo9866j(state, offset, i3), 0, length - i3);
    }

    @Override // p000.wj1
    /* JADX INFO: renamed from: l */
    public String mo9867l(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // p000.wj1
    public e72 newCodedInput() {
        return e72.m9774b(asReadOnlyByteBufferList(), true);
    }

    @Override // p000.wj1
    public InputStream newInput() {
        return new C5247d();
    }

    @Override // p000.wj1
    /* JADX INFO: renamed from: p */
    public void mo9868p(nj1 output) throws IOException {
        this.f32540H.mo9868p(output);
        this.f32541L.mo9868p(output);
    }

    @Override // p000.wj1
    /* JADX INFO: renamed from: r */
    public void mo9869r(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
        int i = sourceOffset + numberToWrite;
        int i2 = this.f32542M;
        if (i <= i2) {
            this.f32540H.mo9869r(out, sourceOffset, numberToWrite);
        } else {
            if (sourceOffset >= i2) {
                this.f32541L.mo9869r(out, sourceOffset - i2, numberToWrite);
                return;
            }
            int i3 = i2 - sourceOffset;
            this.f32540H.mo9869r(out, sourceOffset, i3);
            this.f32541L.mo9869r(out, 0, numberToWrite - i3);
        }
    }

    @Override // p000.wj1
    /* JADX INFO: renamed from: s */
    public void mo9870s(nj1 output) throws IOException {
        this.f32541L.mo9870s(output);
        this.f32540H.mo9870s(output);
    }

    @Override // p000.wj1
    public int size() {
        return this.f32539F;
    }

    @Override // p000.wj1
    public wj1 substring(int beginIndex, int endIndex) {
        int iM24591c = wj1.m24591c(beginIndex, endIndex, this.f32539F);
        if (iM24591c == 0) {
            return wj1.f94379e;
        }
        if (iM24591c == this.f32539F) {
            return this;
        }
        int i = this.f32542M;
        return endIndex <= i ? this.f32540H.substring(beginIndex, endIndex) : beginIndex >= i ? this.f32541L.substring(beginIndex - i, endIndex - i) : new ebe(this.f32540H.substring(beginIndex), this.f32541L.substring(0, endIndex - this.f32542M));
    }

    public Object writeReplace() {
        return wj1.m24595n(toByteArray());
    }

    @Override // p000.wj1
    public void writeTo(OutputStream outputStream) throws IOException {
        this.f32540H.writeTo(outputStream);
        this.f32541L.writeTo(outputStream);
    }

    /* JADX INFO: renamed from: ebe$b */
    public static class C5245b {

        /* JADX INFO: renamed from: a */
        public final ArrayDeque<wj1> f32547a;

        private C5245b() {
            this.f32547a = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public wj1 balance(wj1 left, wj1 right) {
            doBalance(left);
            doBalance(right);
            wj1 wj1VarPop = this.f32547a.pop();
            while (!this.f32547a.isEmpty()) {
                wj1VarPop = new ebe(this.f32547a.pop(), wj1VarPop, null);
            }
            return wj1VarPop;
        }

        private void doBalance(wj1 root) {
            if (root.mo9864f()) {
                insert(root);
                return;
            }
            if (root instanceof ebe) {
                ebe ebeVar = (ebe) root;
                doBalance(ebeVar.f32540H);
                doBalance(ebeVar.f32541L);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + root.getClass());
            }
        }

        private int getDepthBinForLength(int length) {
            int iBinarySearch = Arrays.binarySearch(ebe.f32538Q, length);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void insert(wj1 byteString) {
            C5244a c5244a;
            int depthBinForLength = getDepthBinForLength(byteString.size());
            int iM9860w = ebe.m9860w(depthBinForLength + 1);
            if (this.f32547a.isEmpty() || this.f32547a.peek().size() >= iM9860w) {
                this.f32547a.push(byteString);
                return;
            }
            int iM9860w2 = ebe.m9860w(depthBinForLength);
            wj1 wj1VarPop = this.f32547a.pop();
            while (true) {
                c5244a = null;
                if (this.f32547a.isEmpty() || this.f32547a.peek().size() >= iM9860w2) {
                    break;
                } else {
                    wj1VarPop = new ebe(this.f32547a.pop(), wj1VarPop, c5244a);
                }
            }
            ebe ebeVar = new ebe(wj1VarPop, byteString, c5244a);
            while (!this.f32547a.isEmpty()) {
                if (this.f32547a.peek().size() >= ebe.m9860w(getDepthBinForLength(ebeVar.size()) + 1)) {
                    break;
                } else {
                    ebeVar = new ebe(this.f32547a.pop(), ebeVar, c5244a);
                }
            }
            this.f32547a.push(ebeVar);
        }

        public /* synthetic */ C5245b(C5244a c5244a) {
            this();
        }
    }

    private ebe(wj1 left, wj1 right) {
        this.f32540H = left;
        this.f32541L = right;
        int size = left.size();
        this.f32542M = size;
        this.f32539F = size + right.size();
        this.f32543N = Math.max(left.mo9863e(), right.mo9863e()) + 1;
    }

    @Override // p000.wj1, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C5244a();
    }

    /* JADX INFO: renamed from: ebe$d */
    public class C5247d extends InputStream {

        /* JADX INFO: renamed from: a */
        public C5246c f32550a;

        /* JADX INFO: renamed from: b */
        public wj1.AbstractC14641i f32551b;

        /* JADX INFO: renamed from: c */
        public int f32552c;

        /* JADX INFO: renamed from: d */
        public int f32553d;

        /* JADX INFO: renamed from: e */
        public int f32554e;

        /* JADX INFO: renamed from: f */
        public int f32555f;

        public C5247d() {
            initialize();
        }

        private void advanceIfCurrentPieceFullyRead() {
            if (this.f32551b != null) {
                int i = this.f32553d;
                int i2 = this.f32552c;
                if (i == i2) {
                    this.f32554e += i2;
                    this.f32553d = 0;
                    if (!this.f32550a.hasNext()) {
                        this.f32551b = null;
                        this.f32552c = 0;
                    } else {
                        wj1.AbstractC14641i next = this.f32550a.next();
                        this.f32551b = next;
                        this.f32552c = next.size();
                    }
                }
            }
        }

        private int availableInternal() {
            return ebe.this.size() - (this.f32554e + this.f32553d);
        }

        private void initialize() {
            C5246c c5246c = new C5246c(ebe.this, null);
            this.f32550a = c5246c;
            wj1.AbstractC14641i next = c5246c.next();
            this.f32551b = next;
            this.f32552c = next.size();
            this.f32553d = 0;
            this.f32554e = 0;
        }

        private int readSkipInternal(byte[] b, int offset, int length) {
            int i = length;
            while (i > 0) {
                advanceIfCurrentPieceFullyRead();
                if (this.f32551b == null) {
                    break;
                }
                int iMin = Math.min(this.f32552c - this.f32553d, i);
                if (b != null) {
                    this.f32551b.copyTo(b, this.f32553d, offset, iMin);
                    offset += iMin;
                }
                this.f32553d += iMin;
                i -= iMin;
            }
            return length - i;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return availableInternal();
        }

        @Override // java.io.InputStream
        public void mark(int readAheadLimit) {
            this.f32555f = this.f32554e + this.f32553d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] b, int offset, int length) {
            b.getClass();
            if (offset < 0 || length < 0 || length > b.length - offset) {
                throw new IndexOutOfBoundsException();
            }
            int skipInternal = readSkipInternal(b, offset, length);
            if (skipInternal != 0) {
                return skipInternal;
            }
            if (length > 0 || availableInternal() == 0) {
                return -1;
            }
            return skipInternal;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            initialize();
            readSkipInternal(null, 0, this.f32555f);
        }

        @Override // java.io.InputStream
        public long skip(long length) {
            if (length < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (length > 2147483647L) {
                length = 2147483647L;
            }
            return readSkipInternal(null, 0, (int) length);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            advanceIfCurrentPieceFullyRead();
            wj1.AbstractC14641i abstractC14641i = this.f32551b;
            if (abstractC14641i == null) {
                return -1;
            }
            int i = this.f32553d;
            this.f32553d = i + 1;
            return abstractC14641i.byteAt(i) & 255;
        }
    }
}
