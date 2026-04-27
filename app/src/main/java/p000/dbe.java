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
import p000.vj1;
import p000.ymh;

/* JADX INFO: loaded from: classes4.dex */
public final class dbe extends vj1 {

    /* JADX INFO: renamed from: Q */
    public static final int[] f29208Q = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, ymh.InterfaceC15726e.f102218z, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: F */
    public final int f29209F;

    /* JADX INFO: renamed from: H */
    public final vj1 f29210H;

    /* JADX INFO: renamed from: L */
    public final vj1 f29211L;

    /* JADX INFO: renamed from: M */
    public final int f29212M;

    /* JADX INFO: renamed from: N */
    public final int f29213N;

    /* JADX INFO: renamed from: dbe$a */
    public class C4727a extends vj1.AbstractC14105c {

        /* JADX INFO: renamed from: a */
        public final C4729c f29214a;

        /* JADX INFO: renamed from: b */
        public vj1.InterfaceC14109g f29215b = nextPiece();

        public C4727a() {
            this.f29214a = new C4729c(dbe.this, null);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [vj1$g] */
        private vj1.InterfaceC14109g nextPiece() {
            if (this.f29214a.hasNext()) {
                return this.f29214a.next().iterator();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29215b != null;
        }

        @Override // p000.vj1.InterfaceC14109g
        public byte nextByte() {
            vj1.InterfaceC14109g interfaceC14109g = this.f29215b;
            if (interfaceC14109g == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = interfaceC14109g.nextByte();
            if (!this.f29215b.hasNext()) {
                this.f29215b = nextPiece();
            }
            return bNextByte;
        }
    }

    /* JADX INFO: renamed from: dbe$c */
    public static final class C4729c implements Iterator<vj1.AbstractC14111i> {

        /* JADX INFO: renamed from: a */
        public final ArrayDeque<dbe> f29218a;

        /* JADX INFO: renamed from: b */
        public vj1.AbstractC14111i f29219b;

        public /* synthetic */ C4729c(vj1 vj1Var, C4727a c4727a) {
            this(vj1Var);
        }

        private vj1.AbstractC14111i getLeafByLeft(vj1 root) {
            while (root instanceof dbe) {
                dbe dbeVar = (dbe) root;
                this.f29218a.push(dbeVar);
                root = dbeVar.f29210H;
            }
            return (vj1.AbstractC14111i) root;
        }

        private vj1.AbstractC14111i getNextNonEmptyLeaf() {
            vj1.AbstractC14111i leafByLeft;
            do {
                ArrayDeque<dbe> arrayDeque = this.f29218a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByLeft = getLeafByLeft(this.f29218a.pop().f29211L);
            } while (leafByLeft.isEmpty());
            return leafByLeft;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29219b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C4729c(vj1 root) {
            if (!(root instanceof dbe)) {
                this.f29218a = null;
                this.f29219b = (vj1.AbstractC14111i) root;
                return;
            }
            dbe dbeVar = (dbe) root;
            ArrayDeque<dbe> arrayDeque = new ArrayDeque<>(dbeVar.mo9051e());
            this.f29218a = arrayDeque;
            arrayDeque.push(dbeVar);
            this.f29219b = getLeafByLeft(dbeVar.f29210H);
        }

        @Override // java.util.Iterator
        public vj1.AbstractC14111i next() {
            vj1.AbstractC14111i abstractC14111i = this.f29219b;
            if (abstractC14111i == null) {
                throw new NoSuchElementException();
            }
            this.f29219b = getNextNonEmptyLeaf();
            return abstractC14111i;
        }
    }

    public /* synthetic */ dbe(vj1 vj1Var, vj1 vj1Var2, C4727a c4727a) {
        this(vj1Var, vj1Var2);
    }

    private static vj1 concatenateBytes(vj1 left, vj1 right) {
        int size = left.size();
        int size2 = right.size();
        byte[] bArr = new byte[size + size2];
        left.copyTo(bArr, 0, 0, size);
        right.copyTo(bArr, 0, size, size2);
        return vj1.m24018m(bArr);
    }

    private boolean equalsFragments(vj1 vj1Var) {
        C4727a c4727a = null;
        C4729c c4729c = new C4729c(this, c4727a);
        vj1.AbstractC14111i next = c4729c.next();
        C4729c c4729c2 = new C4729c(vj1Var, c4727a);
        vj1.AbstractC14111i next2 = c4729c2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? next.mo24023s(next2, i2, iMin) : next2.mo24023s(next, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.f29209F;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                i = 0;
                next = c4729c.next();
            } else {
                i += iMin;
                next = next;
            }
            if (iMin == size2) {
                next2 = c4729c2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    private void readObject(ObjectInputStream in) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    /* JADX INFO: renamed from: u */
    public static vj1 m9047u(vj1 left, vj1 right) {
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
        if (left instanceof dbe) {
            dbe dbeVar = (dbe) left;
            if (dbeVar.f29211L.size() + right.size() < 128) {
                return new dbe(dbeVar.f29210H, concatenateBytes(dbeVar.f29211L, right));
            }
            if (dbeVar.f29210H.mo9051e() > dbeVar.f29211L.mo9051e() && dbeVar.mo9051e() > right.mo9051e()) {
                return new dbe(dbeVar.f29210H, new dbe(dbeVar.f29211L, right));
            }
        }
        return size >= m9048v(Math.max(left.mo9051e(), right.mo9051e()) + 1) ? new dbe(left, right) : new C4728b(null).balance(left, right);
    }

    /* JADX INFO: renamed from: v */
    public static int m9048v(int depth) {
        int[] iArr = f29208Q;
        if (depth >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[depth];
    }

    /* JADX INFO: renamed from: w */
    public static dbe m9049w(vj1 left, vj1 right) {
        return new dbe(left, right);
    }

    @Override // p000.vj1
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // p000.vj1
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        C4729c c4729c = new C4729c(this, null);
        while (c4729c.hasNext()) {
            arrayList.add(c4729c.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // p000.vj1
    public byte byteAt(int index) {
        vj1.m24014b(index, this.f29209F);
        return internalByteAt(index);
    }

    @Override // p000.vj1
    public void copyTo(ByteBuffer target) {
        this.f29210H.copyTo(target);
        this.f29211L.copyTo(target);
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: d */
    public void mo9050d(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        int i = sourceOffset + numberToCopy;
        int i2 = this.f29212M;
        if (i <= i2) {
            this.f29210H.mo9050d(target, sourceOffset, targetOffset, numberToCopy);
        } else {
            if (sourceOffset >= i2) {
                this.f29211L.mo9050d(target, sourceOffset - i2, targetOffset, numberToCopy);
                return;
            }
            int i3 = i2 - sourceOffset;
            this.f29210H.mo9050d(target, sourceOffset, targetOffset, i3);
            this.f29211L.mo9050d(target, 0, targetOffset + i3, numberToCopy - i3);
        }
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: e */
    public int mo9051e() {
        return this.f29213N;
    }

    @Override // p000.vj1
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof vj1)) {
            return false;
        }
        vj1 vj1Var = (vj1) other;
        if (this.f29209F != vj1Var.size()) {
            return false;
        }
        if (this.f29209F == 0) {
            return true;
        }
        int iM24020j = m24020j();
        int iM24020j2 = vj1Var.m24020j();
        if (iM24020j == 0 || iM24020j2 == 0 || iM24020j == iM24020j2) {
            return equalsFragments(vj1Var);
        }
        return false;
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: f */
    public boolean mo9052f() {
        return this.f29209F >= m9048v(this.f29213N);
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: h */
    public int mo9053h(int h, int offset, int length) {
        int i = offset + length;
        int i2 = this.f29212M;
        if (i <= i2) {
            return this.f29210H.mo9053h(h, offset, length);
        }
        if (offset >= i2) {
            return this.f29211L.mo9053h(h, offset - i2, length);
        }
        int i3 = i2 - offset;
        return this.f29211L.mo9053h(this.f29210H.mo9053h(h, offset, i3), 0, length - i3);
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: i */
    public int mo9054i(int state, int offset, int length) {
        int i = offset + length;
        int i2 = this.f29212M;
        if (i <= i2) {
            return this.f29210H.mo9054i(state, offset, length);
        }
        if (offset >= i2) {
            return this.f29211L.mo9054i(state, offset - i2, length);
        }
        int i3 = i2 - offset;
        return this.f29211L.mo9054i(this.f29210H.mo9054i(state, offset, i3), 0, length - i3);
    }

    @Override // p000.vj1
    public byte internalByteAt(int index) {
        int i = this.f29212M;
        return index < i ? this.f29210H.internalByteAt(index) : this.f29211L.internalByteAt(index - i);
    }

    @Override // p000.vj1
    public boolean isValidUtf8() {
        int iMo9054i = this.f29210H.mo9054i(0, 0, this.f29212M);
        vj1 vj1Var = this.f29211L;
        return vj1Var.mo9054i(iMo9054i, 0, vj1Var.size()) == 0;
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: k */
    public String mo9055k(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // p000.vj1
    public f72 newCodedInput() {
        return f72.m10682b(asReadOnlyByteBufferList(), true);
    }

    @Override // p000.vj1
    public InputStream newInput() {
        return new C4730d();
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: o */
    public void mo9056o(mj1 output) throws IOException {
        this.f29210H.mo9056o(output);
        this.f29211L.mo9056o(output);
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: q */
    public void mo9057q(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
        int i = sourceOffset + numberToWrite;
        int i2 = this.f29212M;
        if (i <= i2) {
            this.f29210H.mo9057q(out, sourceOffset, numberToWrite);
        } else {
            if (sourceOffset >= i2) {
                this.f29211L.mo9057q(out, sourceOffset - i2, numberToWrite);
                return;
            }
            int i3 = i2 - sourceOffset;
            this.f29210H.mo9057q(out, sourceOffset, i3);
            this.f29211L.mo9057q(out, 0, numberToWrite - i3);
        }
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: r */
    public void mo9058r(mj1 output) throws IOException {
        this.f29211L.mo9058r(output);
        this.f29210H.mo9058r(output);
    }

    @Override // p000.vj1
    public int size() {
        return this.f29209F;
    }

    @Override // p000.vj1
    public vj1 substring(int beginIndex, int endIndex) {
        int iM24015c = vj1.m24015c(beginIndex, endIndex, this.f29209F);
        if (iM24015c == 0) {
            return vj1.f91344e;
        }
        if (iM24015c == this.f29209F) {
            return this;
        }
        int i = this.f29212M;
        return endIndex <= i ? this.f29210H.substring(beginIndex, endIndex) : beginIndex >= i ? this.f29211L.substring(beginIndex - i, endIndex - i) : new dbe(this.f29210H.substring(beginIndex), this.f29211L.substring(0, endIndex - this.f29212M));
    }

    public Object writeReplace() {
        return vj1.m24018m(toByteArray());
    }

    @Override // p000.vj1
    public void writeTo(OutputStream outputStream) throws IOException {
        this.f29210H.writeTo(outputStream);
        this.f29211L.writeTo(outputStream);
    }

    /* JADX INFO: renamed from: dbe$b */
    public static class C4728b {

        /* JADX INFO: renamed from: a */
        public final ArrayDeque<vj1> f29217a;

        private C4728b() {
            this.f29217a = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public vj1 balance(vj1 left, vj1 right) {
            doBalance(left);
            doBalance(right);
            vj1 vj1VarPop = this.f29217a.pop();
            while (!this.f29217a.isEmpty()) {
                vj1VarPop = new dbe(this.f29217a.pop(), vj1VarPop, null);
            }
            return vj1VarPop;
        }

        private void doBalance(vj1 root) {
            if (root.mo9052f()) {
                insert(root);
                return;
            }
            if (root instanceof dbe) {
                dbe dbeVar = (dbe) root;
                doBalance(dbeVar.f29210H);
                doBalance(dbeVar.f29211L);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + root.getClass());
            }
        }

        private int getDepthBinForLength(int length) {
            int iBinarySearch = Arrays.binarySearch(dbe.f29208Q, length);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void insert(vj1 byteString) {
            C4727a c4727a;
            int depthBinForLength = getDepthBinForLength(byteString.size());
            int iM9048v = dbe.m9048v(depthBinForLength + 1);
            if (this.f29217a.isEmpty() || this.f29217a.peek().size() >= iM9048v) {
                this.f29217a.push(byteString);
                return;
            }
            int iM9048v2 = dbe.m9048v(depthBinForLength);
            vj1 vj1VarPop = this.f29217a.pop();
            while (true) {
                c4727a = null;
                if (this.f29217a.isEmpty() || this.f29217a.peek().size() >= iM9048v2) {
                    break;
                } else {
                    vj1VarPop = new dbe(this.f29217a.pop(), vj1VarPop, c4727a);
                }
            }
            dbe dbeVar = new dbe(vj1VarPop, byteString, c4727a);
            while (!this.f29217a.isEmpty()) {
                if (this.f29217a.peek().size() >= dbe.m9048v(getDepthBinForLength(dbeVar.size()) + 1)) {
                    break;
                } else {
                    dbeVar = new dbe(this.f29217a.pop(), dbeVar, c4727a);
                }
            }
            this.f29217a.push(dbeVar);
        }

        public /* synthetic */ C4728b(C4727a c4727a) {
            this();
        }
    }

    private dbe(vj1 left, vj1 right) {
        this.f29210H = left;
        this.f29211L = right;
        int size = left.size();
        this.f29212M = size;
        this.f29209F = size + right.size();
        this.f29213N = Math.max(left.mo9051e(), right.mo9051e()) + 1;
    }

    @Override // p000.vj1, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C4727a();
    }

    /* JADX INFO: renamed from: dbe$d */
    public class C4730d extends InputStream {

        /* JADX INFO: renamed from: a */
        public C4729c f29220a;

        /* JADX INFO: renamed from: b */
        public vj1.AbstractC14111i f29221b;

        /* JADX INFO: renamed from: c */
        public int f29222c;

        /* JADX INFO: renamed from: d */
        public int f29223d;

        /* JADX INFO: renamed from: e */
        public int f29224e;

        /* JADX INFO: renamed from: f */
        public int f29225f;

        public C4730d() {
            initialize();
        }

        private void advanceIfCurrentPieceFullyRead() {
            if (this.f29221b != null) {
                int i = this.f29223d;
                int i2 = this.f29222c;
                if (i == i2) {
                    this.f29224e += i2;
                    this.f29223d = 0;
                    if (!this.f29220a.hasNext()) {
                        this.f29221b = null;
                        this.f29222c = 0;
                    } else {
                        vj1.AbstractC14111i next = this.f29220a.next();
                        this.f29221b = next;
                        this.f29222c = next.size();
                    }
                }
            }
        }

        private int availableInternal() {
            return dbe.this.size() - (this.f29224e + this.f29223d);
        }

        private void initialize() {
            C4729c c4729c = new C4729c(dbe.this, null);
            this.f29220a = c4729c;
            vj1.AbstractC14111i next = c4729c.next();
            this.f29221b = next;
            this.f29222c = next.size();
            this.f29223d = 0;
            this.f29224e = 0;
        }

        private int readSkipInternal(byte[] b, int offset, int length) {
            int i = length;
            while (i > 0) {
                advanceIfCurrentPieceFullyRead();
                if (this.f29221b == null) {
                    break;
                }
                int iMin = Math.min(this.f29222c - this.f29223d, i);
                if (b != null) {
                    this.f29221b.copyTo(b, this.f29223d, offset, iMin);
                    offset += iMin;
                }
                this.f29223d += iMin;
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
            this.f29225f = this.f29224e + this.f29223d;
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
            readSkipInternal(null, 0, this.f29225f);
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
            vj1.AbstractC14111i abstractC14111i = this.f29221b;
            if (abstractC14111i == null) {
                return -1;
            }
            int i = this.f29223d;
            this.f29223d = i + 1;
            return abstractC14111i.byteAt(i) & 255;
        }
    }
}
