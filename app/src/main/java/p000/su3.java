package p000;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class su3 implements uv4 {

    /* JADX INFO: renamed from: h */
    public static final int f82857h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f82858i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f82859j = 2;

    /* JADX INFO: renamed from: k */
    public static final int f82860k = 4;

    /* JADX INFO: renamed from: l */
    public static final int f82861l = 8;

    /* JADX INFO: renamed from: m */
    public static final int f82862m = 8;

    /* JADX INFO: renamed from: n */
    public static final int f82863n = 4;

    /* JADX INFO: renamed from: o */
    public static final int f82864o = 8;

    /* JADX INFO: renamed from: a */
    public final byte[] f82865a = new byte[8];

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<C12783b> f82866b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c */
    public final x2i f82867c = new x2i();

    /* JADX INFO: renamed from: d */
    public tv4 f82868d;

    /* JADX INFO: renamed from: e */
    public int f82869e;

    /* JADX INFO: renamed from: f */
    public int f82870f;

    /* JADX INFO: renamed from: g */
    public long f82871g;

    /* JADX INFO: renamed from: su3$b */
    public static final class C12783b {

        /* JADX INFO: renamed from: a */
        public final int f82872a;

        /* JADX INFO: renamed from: b */
        public final long f82873b;

        private C12783b(int i, long j) {
            this.f82872a = i;
            this.f82873b = j;
        }
    }

    @g5e({"processor"})
    private long maybeResyncToNextLevel1Element(zj5 zj5Var) throws IOException {
        zj5Var.resetPeekPosition();
        while (true) {
            zj5Var.peekFully(this.f82865a, 0, 4);
            int unsignedVarintLength = x2i.parseUnsignedVarintLength(this.f82865a[0]);
            if (unsignedVarintLength != -1 && unsignedVarintLength <= 4) {
                int iAssembleVarint = (int) x2i.assembleVarint(this.f82865a, unsignedVarintLength, false);
                if (this.f82868d.isLevel1Element(iAssembleVarint)) {
                    zj5Var.skipFully(unsignedVarintLength);
                    return iAssembleVarint;
                }
            }
            zj5Var.skipFully(1);
        }
    }

    private double readFloat(zj5 zj5Var, int i) throws IOException {
        return i == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(readInteger(zj5Var, i));
    }

    private long readInteger(zj5 zj5Var, int i) throws IOException {
        zj5Var.readFully(this.f82865a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f82865a[i2] & 255));
        }
        return j;
    }

    private static String readString(zj5 zj5Var, int i) throws IOException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        zj5Var.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // p000.uv4
    public void init(tv4 tv4Var) {
        this.f82868d = tv4Var;
    }

    @Override // p000.uv4
    public boolean read(zj5 zj5Var) throws IOException {
        u80.checkStateNotNull(this.f82868d);
        while (true) {
            C12783b c12783bPeek = this.f82866b.peek();
            if (c12783bPeek != null && zj5Var.getPosition() >= c12783bPeek.f82873b) {
                this.f82868d.endMasterElement(this.f82866b.pop().f82872a);
                return true;
            }
            if (this.f82869e == 0) {
                long unsignedVarint = this.f82867c.readUnsignedVarint(zj5Var, true, false, 4);
                if (unsignedVarint == -2) {
                    unsignedVarint = maybeResyncToNextLevel1Element(zj5Var);
                }
                if (unsignedVarint == -1) {
                    return false;
                }
                this.f82870f = (int) unsignedVarint;
                this.f82869e = 1;
            }
            if (this.f82869e == 1) {
                this.f82871g = this.f82867c.readUnsignedVarint(zj5Var, false, true, 8);
                this.f82869e = 2;
            }
            int elementType = this.f82868d.getElementType(this.f82870f);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = zj5Var.getPosition();
                    this.f82866b.push(new C12783b(this.f82870f, this.f82871g + position));
                    this.f82868d.startMasterElement(this.f82870f, position, this.f82871g);
                    this.f82869e = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j = this.f82871g;
                    if (j <= 8) {
                        this.f82868d.integerElement(this.f82870f, readInteger(zj5Var, (int) j));
                        this.f82869e = 0;
                        return true;
                    }
                    throw xhc.createForMalformedContainer("Invalid integer size: " + this.f82871g, null);
                }
                if (elementType == 3) {
                    long j2 = this.f82871g;
                    if (j2 <= 2147483647L) {
                        this.f82868d.stringElement(this.f82870f, readString(zj5Var, (int) j2));
                        this.f82869e = 0;
                        return true;
                    }
                    throw xhc.createForMalformedContainer("String element size: " + this.f82871g, null);
                }
                if (elementType == 4) {
                    this.f82868d.binaryElement(this.f82870f, (int) this.f82871g, zj5Var);
                    this.f82869e = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw xhc.createForMalformedContainer("Invalid element type " + elementType, null);
                }
                long j3 = this.f82871g;
                if (j3 == 4 || j3 == 8) {
                    this.f82868d.floatElement(this.f82870f, readFloat(zj5Var, (int) j3));
                    this.f82869e = 0;
                    return true;
                }
                throw xhc.createForMalformedContainer("Invalid float size: " + this.f82871g, null);
            }
            zj5Var.skipFully((int) this.f82871g);
            this.f82869e = 0;
        }
    }

    @Override // p000.uv4
    public void reset() {
        this.f82869e = 0;
        this.f82866b.clear();
        this.f82867c.reset();
    }
}
