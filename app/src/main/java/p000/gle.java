package p000;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p000.InterfaceC5892fn;
import p000.kle;
import p000.q6h;

/* JADX INFO: loaded from: classes3.dex */
public class gle {

    /* JADX INFO: renamed from: h */
    public static final int f40139h = 32;

    /* JADX INFO: renamed from: a */
    public final InterfaceC5892fn f40140a;

    /* JADX INFO: renamed from: b */
    public final int f40141b;

    /* JADX INFO: renamed from: c */
    public final jhc f40142c;

    /* JADX INFO: renamed from: d */
    public C6375a f40143d;

    /* JADX INFO: renamed from: e */
    public C6375a f40144e;

    /* JADX INFO: renamed from: f */
    public C6375a f40145f;

    /* JADX INFO: renamed from: g */
    public long f40146g;

    /* JADX INFO: renamed from: gle$a */
    public static final class C6375a implements InterfaceC5892fn.a {

        /* JADX INFO: renamed from: a */
        public long f40147a;

        /* JADX INFO: renamed from: b */
        public long f40148b;

        /* JADX INFO: renamed from: c */
        @hib
        public C5399en f40149c;

        /* JADX INFO: renamed from: d */
        @hib
        public C6375a f40150d;

        public C6375a(long j, int i) {
            reset(j, i);
        }

        public C6375a clear() {
            this.f40149c = null;
            C6375a c6375a = this.f40150d;
            this.f40150d = null;
            return c6375a;
        }

        @Override // p000.InterfaceC5892fn.a
        public C5399en getAllocation() {
            return (C5399en) v80.checkNotNull(this.f40149c);
        }

        public void initialize(C5399en c5399en, C6375a c6375a) {
            this.f40149c = c5399en;
            this.f40150d = c6375a;
        }

        @Override // p000.InterfaceC5892fn.a
        @hib
        public InterfaceC5892fn.a next() {
            C6375a c6375a = this.f40150d;
            if (c6375a == null || c6375a.f40149c == null) {
                return null;
            }
            return c6375a;
        }

        public void reset(long j, int i) {
            v80.checkState(this.f40149c == null);
            this.f40147a = j;
            this.f40148b = j + ((long) i);
        }

        public int translateOffset(long j) {
            return ((int) (j - this.f40147a)) + this.f40149c.f33562b;
        }
    }

    public gle(InterfaceC5892fn interfaceC5892fn) {
        this.f40140a = interfaceC5892fn;
        int individualAllocationLength = interfaceC5892fn.getIndividualAllocationLength();
        this.f40141b = individualAllocationLength;
        this.f40142c = new jhc(32);
        C6375a c6375a = new C6375a(0L, individualAllocationLength);
        this.f40143d = c6375a;
        this.f40144e = c6375a;
        this.f40145f = c6375a;
    }

    private void clearAllocationNodes(C6375a c6375a) {
        if (c6375a.f40149c == null) {
            return;
        }
        this.f40140a.release(c6375a);
        c6375a.clear();
    }

    private static C6375a getNodeContainingPosition(C6375a c6375a, long j) {
        while (j >= c6375a.f40148b) {
            c6375a = c6375a.f40150d;
        }
        return c6375a;
    }

    private void postAppend(int i) {
        long j = this.f40146g + ((long) i);
        this.f40146g = j;
        C6375a c6375a = this.f40145f;
        if (j == c6375a.f40148b) {
            this.f40145f = c6375a.f40150d;
        }
    }

    private int preAppend(int i) {
        C6375a c6375a = this.f40145f;
        if (c6375a.f40149c == null) {
            c6375a.initialize(this.f40140a.allocate(), new C6375a(this.f40145f.f40148b, this.f40141b));
        }
        return Math.min(i, (int) (this.f40145f.f40148b - this.f40146g));
    }

    private static C6375a readData(C6375a c6375a, long j, ByteBuffer byteBuffer, int i) {
        C6375a nodeContainingPosition = getNodeContainingPosition(c6375a, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (nodeContainingPosition.f40148b - j));
            byteBuffer.put(nodeContainingPosition.f40149c.f33561a, nodeContainingPosition.translateOffset(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == nodeContainingPosition.f40148b) {
                nodeContainingPosition = nodeContainingPosition.f40150d;
            }
        }
        return nodeContainingPosition;
    }

    private static C6375a readEncryptionData(C6375a c6375a, rl3 rl3Var, kle.C8445b c8445b, jhc jhcVar) {
        long j = c8445b.f54661b;
        int unsignedShort = 1;
        jhcVar.reset(1);
        C6375a data = readData(c6375a, j, jhcVar.getData(), 1);
        long j2 = j + 1;
        byte b = jhcVar.getData()[0];
        boolean z = (b & 128) != 0;
        int i = b & 127;
        f93 f93Var = rl3Var.f78607c;
        byte[] bArr = f93Var.f35746a;
        if (bArr == null) {
            f93Var.f35746a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        C6375a data2 = readData(data, j2, f93Var.f35746a, i);
        long j3 = j2 + ((long) i);
        if (z) {
            jhcVar.reset(2);
            data2 = readData(data2, j3, jhcVar.getData(), 2);
            j3 += 2;
            unsignedShort = jhcVar.readUnsignedShort();
        }
        int i2 = unsignedShort;
        int[] iArr = f93Var.f35749d;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = f93Var.f35750e;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i2 * 6;
            jhcVar.reset(i3);
            data2 = readData(data2, j3, jhcVar.getData(), i3);
            j3 += (long) i3;
            jhcVar.setPosition(0);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = jhcVar.readUnsignedShort();
                iArr4[i4] = jhcVar.readUnsignedIntToInt();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = c8445b.f54660a - ((int) (j3 - c8445b.f54661b));
        }
        q6h.C11325a c11325a = (q6h.C11325a) t0i.castNonNull(c8445b.f54662c);
        f93Var.set(i2, iArr2, iArr4, c11325a.f73348b, f93Var.f35746a, c11325a.f73347a, c11325a.f73349c, c11325a.f73350d);
        long j4 = c8445b.f54661b;
        int i5 = (int) (j3 - j4);
        c8445b.f54661b = j4 + ((long) i5);
        c8445b.f54660a -= i5;
        return data2;
    }

    private static C6375a readSampleData(C6375a c6375a, rl3 rl3Var, kle.C8445b c8445b, jhc jhcVar) {
        if (rl3Var.isEncrypted()) {
            c6375a = readEncryptionData(c6375a, rl3Var, c8445b, jhcVar);
        }
        if (!rl3Var.hasSupplementalData()) {
            rl3Var.ensureSpaceForWrite(c8445b.f54660a);
            return readData(c6375a, c8445b.f54661b, rl3Var.f78608d, c8445b.f54660a);
        }
        jhcVar.reset(4);
        C6375a data = readData(c6375a, c8445b.f54661b, jhcVar.getData(), 4);
        int unsignedIntToInt = jhcVar.readUnsignedIntToInt();
        c8445b.f54661b += 4;
        c8445b.f54660a -= 4;
        rl3Var.ensureSpaceForWrite(unsignedIntToInt);
        C6375a data2 = readData(data, c8445b.f54661b, rl3Var.f78608d, unsignedIntToInt);
        c8445b.f54661b += (long) unsignedIntToInt;
        int i = c8445b.f54660a - unsignedIntToInt;
        c8445b.f54660a = i;
        rl3Var.resetSupplementalData(i);
        return readData(data2, c8445b.f54661b, rl3Var.f78611m, c8445b.f54660a);
    }

    public void discardDownstreamTo(long j) {
        C6375a c6375a;
        if (j == -1) {
            return;
        }
        while (true) {
            c6375a = this.f40143d;
            if (j < c6375a.f40148b) {
                break;
            }
            this.f40140a.release(c6375a.f40149c);
            this.f40143d = this.f40143d.clear();
        }
        if (this.f40144e.f40147a < c6375a.f40147a) {
            this.f40144e = c6375a;
        }
    }

    public void discardUpstreamSampleBytes(long j) {
        v80.checkArgument(j <= this.f40146g);
        this.f40146g = j;
        if (j != 0) {
            C6375a c6375a = this.f40143d;
            if (j != c6375a.f40147a) {
                while (this.f40146g > c6375a.f40148b) {
                    c6375a = c6375a.f40150d;
                }
                C6375a c6375a2 = (C6375a) v80.checkNotNull(c6375a.f40150d);
                clearAllocationNodes(c6375a2);
                C6375a c6375a3 = new C6375a(c6375a.f40148b, this.f40141b);
                c6375a.f40150d = c6375a3;
                if (this.f40146g == c6375a.f40148b) {
                    c6375a = c6375a3;
                }
                this.f40145f = c6375a;
                if (this.f40144e == c6375a2) {
                    this.f40144e = c6375a3;
                    return;
                }
                return;
            }
        }
        clearAllocationNodes(this.f40143d);
        C6375a c6375a4 = new C6375a(this.f40146g, this.f40141b);
        this.f40143d = c6375a4;
        this.f40144e = c6375a4;
        this.f40145f = c6375a4;
    }

    public long getTotalBytesWritten() {
        return this.f40146g;
    }

    public void peekToBuffer(rl3 rl3Var, kle.C8445b c8445b) {
        readSampleData(this.f40144e, rl3Var, c8445b, this.f40142c);
    }

    public void readToBuffer(rl3 rl3Var, kle.C8445b c8445b) {
        this.f40144e = readSampleData(this.f40144e, rl3Var, c8445b, this.f40142c);
    }

    public void reset() {
        clearAllocationNodes(this.f40143d);
        this.f40143d.reset(0L, this.f40141b);
        C6375a c6375a = this.f40143d;
        this.f40144e = c6375a;
        this.f40145f = c6375a;
        this.f40146g = 0L;
        this.f40140a.trim();
    }

    public void rewind() {
        this.f40144e = this.f40143d;
    }

    public int sampleData(bh3 bh3Var, int i, boolean z) throws IOException {
        int iPreAppend = preAppend(i);
        C6375a c6375a = this.f40145f;
        int i2 = bh3Var.read(c6375a.f40149c.f33561a, c6375a.translateOffset(this.f40146g), iPreAppend);
        if (i2 != -1) {
            postAppend(i2);
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    private static C6375a readData(C6375a c6375a, long j, byte[] bArr, int i) {
        C6375a nodeContainingPosition = getNodeContainingPosition(c6375a, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (nodeContainingPosition.f40148b - j));
            System.arraycopy(nodeContainingPosition.f40149c.f33561a, nodeContainingPosition.translateOffset(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == nodeContainingPosition.f40148b) {
                nodeContainingPosition = nodeContainingPosition.f40150d;
            }
        }
        return nodeContainingPosition;
    }

    public void sampleData(jhc jhcVar, int i) {
        while (i > 0) {
            int iPreAppend = preAppend(i);
            C6375a c6375a = this.f40145f;
            jhcVar.readBytes(c6375a.f40149c.f33561a, c6375a.translateOffset(this.f40146g), iPreAppend);
            i -= iPreAppend;
            postAppend(iPreAppend);
        }
    }
}
