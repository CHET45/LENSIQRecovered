package p000;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public final class ru3 implements vv4 {

    /* JADX INFO: renamed from: h */
    public static final int f79581h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f79582i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f79583j = 2;

    /* JADX INFO: renamed from: k */
    public static final int f79584k = 4;

    /* JADX INFO: renamed from: l */
    public static final int f79585l = 8;

    /* JADX INFO: renamed from: m */
    public static final int f79586m = 8;

    /* JADX INFO: renamed from: n */
    public static final int f79587n = 4;

    /* JADX INFO: renamed from: o */
    public static final int f79588o = 8;

    /* JADX INFO: renamed from: a */
    public final byte[] f79589a = new byte[8];

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<C12288b> f79590b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c */
    public final y2i f79591c = new y2i();

    /* JADX INFO: renamed from: d */
    public sv4 f79592d;

    /* JADX INFO: renamed from: e */
    public int f79593e;

    /* JADX INFO: renamed from: f */
    public int f79594f;

    /* JADX INFO: renamed from: g */
    public long f79595g;

    /* JADX INFO: renamed from: ru3$b */
    public static final class C12288b {

        /* JADX INFO: renamed from: a */
        public final int f79596a;

        /* JADX INFO: renamed from: b */
        public final long f79597b;

        private C12288b(int i, long j) {
            this.f79596a = i;
            this.f79597b = j;
        }
    }

    @g5e({"processor"})
    private long maybeResyncToNextLevel1Element(ak5 ak5Var) throws IOException {
        ak5Var.resetPeekPosition();
        while (true) {
            ak5Var.peekFully(this.f79589a, 0, 4);
            int unsignedVarintLength = y2i.parseUnsignedVarintLength(this.f79589a[0]);
            if (unsignedVarintLength != -1 && unsignedVarintLength <= 4) {
                int iAssembleVarint = (int) y2i.assembleVarint(this.f79589a, unsignedVarintLength, false);
                if (this.f79592d.isLevel1Element(iAssembleVarint)) {
                    ak5Var.skipFully(unsignedVarintLength);
                    return iAssembleVarint;
                }
            }
            ak5Var.skipFully(1);
        }
    }

    private double readFloat(ak5 ak5Var, int i) throws IOException {
        return i == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(readInteger(ak5Var, i));
    }

    private long readInteger(ak5 ak5Var, int i) throws IOException {
        ak5Var.readFully(this.f79589a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f79589a[i2] & 255));
        }
        return j;
    }

    private static String readString(ak5 ak5Var, int i) throws IOException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        ak5Var.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // p000.vv4
    public void init(sv4 sv4Var) {
        this.f79592d = sv4Var;
    }

    @Override // p000.vv4
    public boolean read(ak5 ak5Var) throws IOException {
        v80.checkStateNotNull(this.f79592d);
        while (true) {
            C12288b c12288bPeek = this.f79590b.peek();
            if (c12288bPeek != null && ak5Var.getPosition() >= c12288bPeek.f79597b) {
                this.f79592d.endMasterElement(this.f79590b.pop().f79596a);
                return true;
            }
            if (this.f79593e == 0) {
                long unsignedVarint = this.f79591c.readUnsignedVarint(ak5Var, true, false, 4);
                if (unsignedVarint == -2) {
                    unsignedVarint = maybeResyncToNextLevel1Element(ak5Var);
                }
                if (unsignedVarint == -1) {
                    return false;
                }
                this.f79594f = (int) unsignedVarint;
                this.f79593e = 1;
            }
            if (this.f79593e == 1) {
                this.f79595g = this.f79591c.readUnsignedVarint(ak5Var, false, true, 8);
                this.f79593e = 2;
            }
            int elementType = this.f79592d.getElementType(this.f79594f);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = ak5Var.getPosition();
                    this.f79590b.push(new C12288b(this.f79594f, this.f79595g + position));
                    this.f79592d.startMasterElement(this.f79594f, position, this.f79595g);
                    this.f79593e = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j = this.f79595g;
                    if (j <= 8) {
                        this.f79592d.integerElement(this.f79594f, readInteger(ak5Var, (int) j));
                        this.f79593e = 0;
                        return true;
                    }
                    throw yhc.createForMalformedContainer("Invalid integer size: " + this.f79595g, null);
                }
                if (elementType == 3) {
                    long j2 = this.f79595g;
                    if (j2 <= 2147483647L) {
                        this.f79592d.stringElement(this.f79594f, readString(ak5Var, (int) j2));
                        this.f79593e = 0;
                        return true;
                    }
                    throw yhc.createForMalformedContainer("String element size: " + this.f79595g, null);
                }
                if (elementType == 4) {
                    this.f79592d.binaryElement(this.f79594f, (int) this.f79595g, ak5Var);
                    this.f79593e = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw yhc.createForMalformedContainer("Invalid element type " + elementType, null);
                }
                long j3 = this.f79595g;
                if (j3 == 4 || j3 == 8) {
                    this.f79592d.floatElement(this.f79594f, readFloat(ak5Var, (int) j3));
                    this.f79593e = 0;
                    return true;
                }
                throw yhc.createForMalformedContainer("Invalid float size: " + this.f79595g, null);
            }
            ak5Var.skipFully((int) this.f79595g);
            this.f79593e = 0;
        }
    }

    @Override // p000.vv4
    public void reset() {
        this.f79593e = 0;
        this.f79590b.clear();
        this.f79591c.reset();
    }
}
