package p000;

import java.io.IOException;
import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class km6 implements xj5 {

    /* JADX INFO: renamed from: A */
    public static final int f54678A = 8;

    /* JADX INFO: renamed from: B */
    public static final int f54679B = 9;

    /* JADX INFO: renamed from: C */
    public static final int f54680C = 18;

    /* JADX INFO: renamed from: D */
    public static final int f54681D = 4607062;

    /* JADX INFO: renamed from: t */
    public static final ik5 f54682t = new ik5() { // from class: im6
        @Override // p000.ik5
        public final xj5[] createExtractors() {
            return km6.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: u */
    public static final int f54683u = 1;

    /* JADX INFO: renamed from: v */
    public static final int f54684v = 2;

    /* JADX INFO: renamed from: w */
    public static final int f54685w = 3;

    /* JADX INFO: renamed from: x */
    public static final int f54686x = 4;

    /* JADX INFO: renamed from: y */
    public static final int f54687y = 9;

    /* JADX INFO: renamed from: z */
    public static final int f54688z = 11;

    /* JADX INFO: renamed from: i */
    public bk5 f54694i;

    /* JADX INFO: renamed from: k */
    public boolean f54696k;

    /* JADX INFO: renamed from: l */
    public long f54697l;

    /* JADX INFO: renamed from: m */
    public int f54698m;

    /* JADX INFO: renamed from: n */
    public int f54699n;

    /* JADX INFO: renamed from: o */
    public int f54700o;

    /* JADX INFO: renamed from: p */
    public long f54701p;

    /* JADX INFO: renamed from: q */
    public boolean f54702q;

    /* JADX INFO: renamed from: r */
    public eh0 f54703r;

    /* JADX INFO: renamed from: s */
    public d8i f54704s;

    /* JADX INFO: renamed from: d */
    public final jhc f54689d = new jhc(4);

    /* JADX INFO: renamed from: e */
    public final jhc f54690e = new jhc(9);

    /* JADX INFO: renamed from: f */
    public final jhc f54691f = new jhc(11);

    /* JADX INFO: renamed from: g */
    public final jhc f54692g = new jhc();

    /* JADX INFO: renamed from: h */
    public final hre f54693h = new hre();

    /* JADX INFO: renamed from: j */
    public int f54695j = 1;

    @g5e({"extractorOutput"})
    private void ensureReadyForMediaOutput() {
        if (this.f54702q) {
            return;
        }
        this.f54694i.seekMap(new gue.C6549b(-9223372036854775807L));
        this.f54702q = true;
    }

    private long getCurrentTimestampUs() {
        if (this.f54696k) {
            return this.f54697l + this.f54701p;
        }
        if (this.f54693h.getDurationUs() == -9223372036854775807L) {
            return 0L;
        }
        return this.f54701p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$static$0() {
        return new xj5[]{new km6()};
    }

    private jhc prepareTagData(ak5 ak5Var) throws IOException {
        if (this.f54700o > this.f54692g.capacity()) {
            jhc jhcVar = this.f54692g;
            jhcVar.reset(new byte[Math.max(jhcVar.capacity() * 2, this.f54700o)], 0);
        } else {
            this.f54692g.setPosition(0);
        }
        this.f54692g.setLimit(this.f54700o);
        ak5Var.readFully(this.f54692g.getData(), 0, this.f54700o);
        return this.f54692g;
    }

    @g5e({"extractorOutput"})
    private boolean readFlvHeader(ak5 ak5Var) throws IOException {
        if (!ak5Var.readFully(this.f54690e.getData(), 0, 9, true)) {
            return false;
        }
        this.f54690e.setPosition(0);
        this.f54690e.skipBytes(4);
        int unsignedByte = this.f54690e.readUnsignedByte();
        boolean z = (unsignedByte & 4) != 0;
        boolean z2 = (unsignedByte & 1) != 0;
        if (z && this.f54703r == null) {
            this.f54703r = new eh0(this.f54694i.track(8, 1));
        }
        if (z2 && this.f54704s == null) {
            this.f54704s = new d8i(this.f54694i.track(9, 2));
        }
        this.f54694i.endTracks();
        this.f54698m = this.f54690e.readInt() - 5;
        this.f54695j = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @p000.g5e({"extractorOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean readTagData(p000.ak5 r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.getCurrentTimestampUs()
            int r2 = r9.f54699n
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            eh0 r3 = r9.f54703r
            if (r3 == 0) goto L23
            r9.ensureReadyForMediaOutput()
            eh0 r2 = r9.f54703r
            jhc r10 = r9.prepareTagData(r10)
            boolean r10 = r2.consume(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            d8i r3 = r9.f54704s
            if (r3 == 0) goto L39
            r9.ensureReadyForMediaOutput()
            d8i r2 = r9.f54704s
            jhc r10 = r9.prepareTagData(r10)
            boolean r10 = r2.consume(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.f54702q
            if (r2 != 0) goto L6e
            hre r2 = r9.f54693h
            jhc r10 = r9.prepareTagData(r10)
            boolean r10 = r2.consume(r10, r0)
            hre r0 = r9.f54693h
            long r0 = r0.getDurationUs()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            bk5 r2 = r9.f54694i
            l08 r3 = new l08
            hre r7 = r9.f54693h
            long[] r7 = r7.getKeyFrameTagPositions()
            hre r8 = r9.f54693h
            long[] r8 = r8.getKeyFrameTimesUs()
            r3.<init>(r7, r8, r0)
            r2.seekMap(r3)
            r9.f54702q = r6
            goto L21
        L6e:
            int r0 = r9.f54700o
            r10.skipFully(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.f54696k
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f54696k = r6
            hre r10 = r9.f54693h
            long r1 = r10.getDurationUs()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.f54701p
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f54697l = r1
        L8f:
            r10 = 4
            r9.f54698m = r10
            r10 = 2
            r9.f54695j = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.km6.readTagData(ak5):boolean");
    }

    private boolean readTagHeader(ak5 ak5Var) throws IOException {
        if (!ak5Var.readFully(this.f54691f.getData(), 0, 11, true)) {
            return false;
        }
        this.f54691f.setPosition(0);
        this.f54699n = this.f54691f.readUnsignedByte();
        this.f54700o = this.f54691f.readUnsignedInt24();
        this.f54701p = this.f54691f.readUnsignedInt24();
        this.f54701p = (((long) (this.f54691f.readUnsignedByte() << 24)) | this.f54701p) * 1000;
        this.f54691f.skipBytes(3);
        this.f54695j = 4;
        return true;
    }

    private void skipToTagHeader(ak5 ak5Var) throws IOException {
        ak5Var.skipFully(this.f54698m);
        this.f54698m = 0;
        this.f54695j = 3;
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f54694i = bk5Var;
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        v80.checkStateNotNull(this.f54694i);
        while (true) {
            int i = this.f54695j;
            if (i != 1) {
                if (i == 2) {
                    skipToTagHeader(ak5Var);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (readTagData(ak5Var)) {
                        return 0;
                    }
                } else if (!readTagHeader(ak5Var)) {
                    return -1;
                }
            } else if (!readFlvHeader(ak5Var)) {
                return -1;
            }
        }
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        if (j == 0) {
            this.f54695j = 1;
            this.f54696k = false;
        } else {
            this.f54695j = 3;
        }
        this.f54698m = 0;
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        ak5Var.peekFully(this.f54689d.getData(), 0, 3);
        this.f54689d.setPosition(0);
        if (this.f54689d.readUnsignedInt24() != 4607062) {
            return false;
        }
        ak5Var.peekFully(this.f54689d.getData(), 0, 2);
        this.f54689d.setPosition(0);
        if ((this.f54689d.readUnsignedShort() & 250) != 0) {
            return false;
        }
        ak5Var.peekFully(this.f54689d.getData(), 0, 4);
        this.f54689d.setPosition(0);
        int i = this.f54689d.readInt();
        ak5Var.resetPeekPosition();
        ak5Var.advancePeekPosition(i);
        ak5Var.peekFully(this.f54689d.getData(), 0, 4);
        this.f54689d.setPosition(0);
        return this.f54689d.readInt() == 0;
    }
}
