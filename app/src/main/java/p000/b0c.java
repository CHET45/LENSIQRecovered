package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class b0c {

    /* JADX INFO: renamed from: l */
    public static final int f12331l = 27;

    /* JADX INFO: renamed from: m */
    public static final int f12332m = 255;

    /* JADX INFO: renamed from: n */
    public static final int f12333n = 65025;

    /* JADX INFO: renamed from: o */
    public static final int f12334o = 65307;

    /* JADX INFO: renamed from: p */
    public static final int f12335p = 1332176723;

    /* JADX INFO: renamed from: q */
    public static final int f12336q = 4;

    /* JADX INFO: renamed from: a */
    public int f12337a;

    /* JADX INFO: renamed from: b */
    public int f12338b;

    /* JADX INFO: renamed from: c */
    public long f12339c;

    /* JADX INFO: renamed from: d */
    public long f12340d;

    /* JADX INFO: renamed from: e */
    public long f12341e;

    /* JADX INFO: renamed from: f */
    public long f12342f;

    /* JADX INFO: renamed from: g */
    public int f12343g;

    /* JADX INFO: renamed from: h */
    public int f12344h;

    /* JADX INFO: renamed from: i */
    public int f12345i;

    /* JADX INFO: renamed from: j */
    public final int[] f12346j = new int[255];

    /* JADX INFO: renamed from: k */
    public final jhc f12347k = new jhc(255);

    public boolean populate(ak5 ak5Var, boolean z) throws IOException {
        reset();
        this.f12347k.reset(27);
        if (!ek5.peekFullyQuietly(ak5Var, this.f12347k.getData(), 0, 27, z) || this.f12347k.readUnsignedInt() != 1332176723) {
            return false;
        }
        int unsignedByte = this.f12347k.readUnsignedByte();
        this.f12337a = unsignedByte;
        if (unsignedByte != 0) {
            if (z) {
                return false;
            }
            throw yhc.createForUnsupportedContainerFeature("unsupported bit stream revision");
        }
        this.f12338b = this.f12347k.readUnsignedByte();
        this.f12339c = this.f12347k.readLittleEndianLong();
        this.f12340d = this.f12347k.readLittleEndianUnsignedInt();
        this.f12341e = this.f12347k.readLittleEndianUnsignedInt();
        this.f12342f = this.f12347k.readLittleEndianUnsignedInt();
        int unsignedByte2 = this.f12347k.readUnsignedByte();
        this.f12343g = unsignedByte2;
        this.f12344h = unsignedByte2 + 27;
        this.f12347k.reset(unsignedByte2);
        if (!ek5.peekFullyQuietly(ak5Var, this.f12347k.getData(), 0, this.f12343g, z)) {
            return false;
        }
        for (int i = 0; i < this.f12343g; i++) {
            this.f12346j[i] = this.f12347k.readUnsignedByte();
            this.f12345i += this.f12346j[i];
        }
        return true;
    }

    public void reset() {
        this.f12337a = 0;
        this.f12338b = 0;
        this.f12339c = 0L;
        this.f12340d = 0L;
        this.f12341e = 0L;
        this.f12342f = 0L;
        this.f12343g = 0;
        this.f12344h = 0;
        this.f12345i = 0;
    }

    public boolean skipToNextPage(ak5 ak5Var) throws IOException {
        return skipToNextPage(ak5Var, -1L);
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
    public boolean skipToNextPage(p000.ak5 r9, long r10) throws java.io.IOException {
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
            p000.v80.checkArgument(r0)
            jhc r0 = r8.f12347k
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
            jhc r4 = r8.f12347k
            byte[] r4 = r4.getData()
            boolean r4 = p000.ek5.peekFullyQuietly(r9, r4, r1, r3, r2)
            if (r4 == 0) goto L51
            jhc r0 = r8.f12347k
            r0.setPosition(r1)
            jhc r0 = r8.f12347k
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
        throw new UnsupportedOperationException("Method not decompiled: p000.b0c.skipToNextPage(ak5, long):boolean");
    }
}
