package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a0c {

    /* JADX INFO: renamed from: l */
    public static final int f25l = 27;

    /* JADX INFO: renamed from: m */
    public static final int f26m = 255;

    /* JADX INFO: renamed from: n */
    public static final int f27n = 65025;

    /* JADX INFO: renamed from: o */
    public static final int f28o = 65307;

    /* JADX INFO: renamed from: p */
    public static final int f29p = 1332176723;

    /* JADX INFO: renamed from: q */
    public static final int f30q = 4;

    /* JADX INFO: renamed from: a */
    public int f31a;

    /* JADX INFO: renamed from: b */
    public int f32b;

    /* JADX INFO: renamed from: c */
    public long f33c;

    /* JADX INFO: renamed from: d */
    public long f34d;

    /* JADX INFO: renamed from: e */
    public long f35e;

    /* JADX INFO: renamed from: f */
    public long f36f;

    /* JADX INFO: renamed from: g */
    public int f37g;

    /* JADX INFO: renamed from: h */
    public int f38h;

    /* JADX INFO: renamed from: i */
    public int f39i;

    /* JADX INFO: renamed from: j */
    public final int[] f40j = new int[255];

    /* JADX INFO: renamed from: k */
    public final ihc f41k = new ihc(255);

    public boolean populate(zj5 zj5Var, boolean z) throws IOException {
        reset();
        this.f41k.reset(27);
        if (!dk5.peekFullyQuietly(zj5Var, this.f41k.getData(), 0, 27, z) || this.f41k.readUnsignedInt() != 1332176723) {
            return false;
        }
        int unsignedByte = this.f41k.readUnsignedByte();
        this.f31a = unsignedByte;
        if (unsignedByte != 0) {
            if (z) {
                return false;
            }
            throw xhc.createForUnsupportedContainerFeature("unsupported bit stream revision");
        }
        this.f32b = this.f41k.readUnsignedByte();
        this.f33c = this.f41k.readLittleEndianLong();
        this.f34d = this.f41k.readLittleEndianUnsignedInt();
        this.f35e = this.f41k.readLittleEndianUnsignedInt();
        this.f36f = this.f41k.readLittleEndianUnsignedInt();
        int unsignedByte2 = this.f41k.readUnsignedByte();
        this.f37g = unsignedByte2;
        this.f38h = unsignedByte2 + 27;
        this.f41k.reset(unsignedByte2);
        if (!dk5.peekFullyQuietly(zj5Var, this.f41k.getData(), 0, this.f37g, z)) {
            return false;
        }
        for (int i = 0; i < this.f37g; i++) {
            this.f40j[i] = this.f41k.readUnsignedByte();
            this.f39i += this.f40j[i];
        }
        return true;
    }

    public void reset() {
        this.f31a = 0;
        this.f32b = 0;
        this.f33c = 0L;
        this.f34d = 0L;
        this.f35e = 0L;
        this.f36f = 0L;
        this.f37g = 0;
        this.f38h = 0;
        this.f39i = 0;
    }

    public boolean skipToNextPage(zj5 zj5Var) throws IOException {
        return skipToNextPage(zj5Var, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.getPosition() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.skip(1) == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean skipToNextPage(p000.zj5 r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            long r0 = r9.getPosition()
            long r2 = r9.getPeekPosition()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            p000.u80.checkArgument(r0)
            ihc r0 = r8.f41k
            r3 = 4
            r0.reset(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r4 = r9.getPosition()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L51
        L2b:
            ihc r4 = r8.f41k
            byte[] r4 = r4.getData()
            boolean r4 = p000.dk5.peekFullyQuietly(r9, r4, r1, r3, r2)
            if (r4 == 0) goto L51
            ihc r0 = r8.f41k
            r0.setPosition(r1)
            ihc r0 = r8.f41k
            long r4 = r0.readUnsignedInt()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r9.resetPeekPosition()
            return r2
        L4d:
            r9.skipFully(r2)
            goto L1a
        L51:
            if (r0 == 0) goto L5b
            long r3 = r9.getPosition()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L63
        L5b:
            int r3 = r9.skip(r2)
            r4 = -1
            if (r3 == r4) goto L63
            goto L51
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a0c.skipToNextPage(zj5, long):boolean");
    }
}
