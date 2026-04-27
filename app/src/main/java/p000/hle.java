package p000;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p000.InterfaceC6430gn;
import p000.lle;
import p000.r6h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class hle {

    /* JADX INFO: renamed from: h */
    public static final int f44080h = 32;

    /* JADX INFO: renamed from: a */
    public final InterfaceC6430gn f44081a;

    /* JADX INFO: renamed from: b */
    public final int f44082b;

    /* JADX INFO: renamed from: c */
    public final ihc f44083c;

    /* JADX INFO: renamed from: d */
    public C6905a f44084d;

    /* JADX INFO: renamed from: e */
    public C6905a f44085e;

    /* JADX INFO: renamed from: f */
    public C6905a f44086f;

    /* JADX INFO: renamed from: g */
    public long f44087g;

    /* JADX INFO: renamed from: hle$a */
    public static final class C6905a implements InterfaceC6430gn.a {

        /* JADX INFO: renamed from: a */
        public long f44088a;

        /* JADX INFO: renamed from: b */
        public long f44089b;

        /* JADX INFO: renamed from: c */
        @hib
        public C4874dn f44090c;

        /* JADX INFO: renamed from: d */
        @hib
        public C6905a f44091d;

        public C6905a(long j, int i) {
            reset(j, i);
        }

        public C6905a clear() {
            this.f44090c = null;
            C6905a c6905a = this.f44091d;
            this.f44091d = null;
            return c6905a;
        }

        @Override // p000.InterfaceC6430gn.a
        public C4874dn getAllocation() {
            return (C4874dn) u80.checkNotNull(this.f44090c);
        }

        public void initialize(C4874dn c4874dn, C6905a c6905a) {
            this.f44090c = c4874dn;
            this.f44091d = c6905a;
        }

        @Override // p000.InterfaceC6430gn.a
        @hib
        public InterfaceC6430gn.a next() {
            C6905a c6905a = this.f44091d;
            if (c6905a == null || c6905a.f44090c == null) {
                return null;
            }
            return c6905a;
        }

        public void reset(long j, int i) {
            u80.checkState(this.f44090c == null);
            this.f44088a = j;
            this.f44089b = j + ((long) i);
        }

        public int translateOffset(long j) {
            return ((int) (j - this.f44088a)) + this.f44090c.f30168b;
        }
    }

    public hle(InterfaceC6430gn interfaceC6430gn) {
        this.f44081a = interfaceC6430gn;
        int individualAllocationLength = interfaceC6430gn.getIndividualAllocationLength();
        this.f44082b = individualAllocationLength;
        this.f44083c = new ihc(32);
        C6905a c6905a = new C6905a(0L, individualAllocationLength);
        this.f44084d = c6905a;
        this.f44085e = c6905a;
        this.f44086f = c6905a;
    }

    private void clearAllocationNodes(C6905a c6905a) {
        if (c6905a.f44090c == null) {
            return;
        }
        this.f44081a.release(c6905a);
        c6905a.clear();
    }

    private static C6905a getNodeContainingPosition(C6905a c6905a, long j) {
        while (j >= c6905a.f44089b) {
            c6905a = c6905a.f44091d;
        }
        return c6905a;
    }

    private void postAppend(int i) {
        long j = this.f44087g + ((long) i);
        this.f44087g = j;
        C6905a c6905a = this.f44086f;
        if (j == c6905a.f44089b) {
            this.f44086f = c6905a.f44091d;
        }
    }

    private int preAppend(int i) {
        C6905a c6905a = this.f44086f;
        if (c6905a.f44090c == null) {
            c6905a.initialize(this.f44081a.allocate(), new C6905a(this.f44086f.f44089b, this.f44082b));
        }
        return Math.min(i, (int) (this.f44086f.f44089b - this.f44087g));
    }

    private static C6905a readData(C6905a c6905a, long j, ByteBuffer byteBuffer, int i) {
        C6905a nodeContainingPosition = getNodeContainingPosition(c6905a, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (nodeContainingPosition.f44089b - j));
            byteBuffer.put(nodeContainingPosition.f44090c.f30167a, nodeContainingPosition.translateOffset(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == nodeContainingPosition.f44089b) {
                nodeContainingPosition = nodeContainingPosition.f44091d;
            }
        }
        return nodeContainingPosition;
    }

    private static C6905a readEncryptionData(C6905a c6905a, sl3 sl3Var, lle.C8888b c8888b, ihc ihcVar) {
        long j = c8888b.f58183b;
        int unsignedShort = 1;
        ihcVar.reset(1);
        C6905a data = readData(c6905a, j, ihcVar.getData(), 1);
        long j2 = j + 1;
        byte b = ihcVar.getData()[0];
        boolean z = (b & 128) != 0;
        int i = b & 127;
        g93 g93Var = sl3Var.f82161c;
        byte[] bArr = g93Var.f39028a;
        if (bArr == null) {
            g93Var.f39028a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        C6905a data2 = readData(data, j2, g93Var.f39028a, i);
        long j3 = j2 + ((long) i);
        if (z) {
            ihcVar.reset(2);
            data2 = readData(data2, j3, ihcVar.getData(), 2);
            j3 += 2;
            unsignedShort = ihcVar.readUnsignedShort();
        }
        int i2 = unsignedShort;
        int[] iArr = g93Var.f39031d;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = g93Var.f39032e;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i2 * 6;
            ihcVar.reset(i3);
            data2 = readData(data2, j3, ihcVar.getData(), i3);
            j3 += (long) i3;
            ihcVar.setPosition(0);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = ihcVar.readUnsignedShort();
                iArr4[i4] = ihcVar.readUnsignedIntToInt();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = c8888b.f58182a - ((int) (j3 - c8888b.f58183b));
        }
        r6h.C11906a c11906a = (r6h.C11906a) x0i.castNonNull(c8888b.f58184c);
        g93Var.set(i2, iArr2, iArr4, c11906a.f77148b, g93Var.f39028a, c11906a.f77147a, c11906a.f77149c, c11906a.f77150d);
        long j4 = c8888b.f58183b;
        int i5 = (int) (j3 - j4);
        c8888b.f58183b = j4 + ((long) i5);
        c8888b.f58182a -= i5;
        return data2;
    }

    private static C6905a readSampleData(C6905a c6905a, sl3 sl3Var, lle.C8888b c8888b, ihc ihcVar) {
        if (sl3Var.isEncrypted()) {
            c6905a = readEncryptionData(c6905a, sl3Var, c8888b, ihcVar);
        }
        if (!sl3Var.hasSupplementalData()) {
            sl3Var.ensureSpaceForWrite(c8888b.f58182a);
            return readData(c6905a, c8888b.f58183b, sl3Var.f82162d, c8888b.f58182a);
        }
        ihcVar.reset(4);
        C6905a data = readData(c6905a, c8888b.f58183b, ihcVar.getData(), 4);
        int unsignedIntToInt = ihcVar.readUnsignedIntToInt();
        c8888b.f58183b += 4;
        c8888b.f58182a -= 4;
        sl3Var.ensureSpaceForWrite(unsignedIntToInt);
        C6905a data2 = readData(data, c8888b.f58183b, sl3Var.f82162d, unsignedIntToInt);
        c8888b.f58183b += (long) unsignedIntToInt;
        int i = c8888b.f58182a - unsignedIntToInt;
        c8888b.f58182a = i;
        sl3Var.resetSupplementalData(i);
        return readData(data2, c8888b.f58183b, sl3Var.f82165m, c8888b.f58182a);
    }

    public void discardDownstreamTo(long j) {
        C6905a c6905a;
        if (j == -1) {
            return;
        }
        while (true) {
            c6905a = this.f44084d;
            if (j < c6905a.f44089b) {
                break;
            }
            this.f44081a.release(c6905a.f44090c);
            this.f44084d = this.f44084d.clear();
        }
        if (this.f44085e.f44088a < c6905a.f44088a) {
            this.f44085e = c6905a;
        }
    }

    public void discardUpstreamSampleBytes(long j) {
        u80.checkArgument(j <= this.f44087g);
        this.f44087g = j;
        if (j != 0) {
            C6905a c6905a = this.f44084d;
            if (j != c6905a.f44088a) {
                while (this.f44087g > c6905a.f44089b) {
                    c6905a = c6905a.f44091d;
                }
                C6905a c6905a2 = (C6905a) u80.checkNotNull(c6905a.f44091d);
                clearAllocationNodes(c6905a2);
                C6905a c6905a3 = new C6905a(c6905a.f44089b, this.f44082b);
                c6905a.f44091d = c6905a3;
                if (this.f44087g == c6905a.f44089b) {
                    c6905a = c6905a3;
                }
                this.f44086f = c6905a;
                if (this.f44085e == c6905a2) {
                    this.f44085e = c6905a3;
                    return;
                }
                return;
            }
        }
        clearAllocationNodes(this.f44084d);
        C6905a c6905a4 = new C6905a(this.f44087g, this.f44082b);
        this.f44084d = c6905a4;
        this.f44085e = c6905a4;
        this.f44086f = c6905a4;
    }

    public long getTotalBytesWritten() {
        return this.f44087g;
    }

    public void peekToBuffer(sl3 sl3Var, lle.C8888b c8888b) {
        readSampleData(this.f44085e, sl3Var, c8888b, this.f44083c);
    }

    public void readToBuffer(sl3 sl3Var, lle.C8888b c8888b) {
        this.f44085e = readSampleData(this.f44085e, sl3Var, c8888b, this.f44083c);
    }

    public void reset() {
        clearAllocationNodes(this.f44084d);
        this.f44084d.reset(0L, this.f44082b);
        C6905a c6905a = this.f44084d;
        this.f44085e = c6905a;
        this.f44086f = c6905a;
        this.f44087g = 0L;
        this.f44081a.trim();
    }

    public void rewind() {
        this.f44085e = this.f44084d;
    }

    public int sampleData(ah3 ah3Var, int i, boolean z) throws IOException {
        int iPreAppend = preAppend(i);
        C6905a c6905a = this.f44086f;
        int i2 = ah3Var.read(c6905a.f44090c.f30167a, c6905a.translateOffset(this.f44087g), iPreAppend);
        if (i2 != -1) {
            postAppend(i2);
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    private static C6905a readData(C6905a c6905a, long j, byte[] bArr, int i) {
        C6905a nodeContainingPosition = getNodeContainingPosition(c6905a, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (nodeContainingPosition.f44089b - j));
            System.arraycopy(nodeContainingPosition.f44090c.f30167a, nodeContainingPosition.translateOffset(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == nodeContainingPosition.f44089b) {
                nodeContainingPosition = nodeContainingPosition.f44091d;
            }
        }
        return nodeContainingPosition;
    }

    public void sampleData(ihc ihcVar, int i) {
        while (i > 0) {
            int iPreAppend = preAppend(i);
            C6905a c6905a = this.f44086f;
            ihcVar.readBytes(c6905a.f44090c.f30167a, c6905a.translateOffset(this.f44087g), iPreAppend);
            i -= iPreAppend;
            postAppend(iPreAppend);
        }
    }
}
