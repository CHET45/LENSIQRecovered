package p000;

import java.io.IOException;
import p000.hue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class jm6 implements yj5 {

    /* JADX INFO: renamed from: A */
    public static final int f51146A = 8;

    /* JADX INFO: renamed from: B */
    public static final int f51147B = 9;

    /* JADX INFO: renamed from: C */
    public static final int f51148C = 18;

    /* JADX INFO: renamed from: D */
    public static final int f51149D = 4607062;

    /* JADX INFO: renamed from: t */
    public static final hk5 f51150t = new hk5() { // from class: hm6
        @Override // p000.hk5
        public final yj5[] createExtractors() {
            return jm6.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: u */
    public static final int f51151u = 1;

    /* JADX INFO: renamed from: v */
    public static final int f51152v = 2;

    /* JADX INFO: renamed from: w */
    public static final int f51153w = 3;

    /* JADX INFO: renamed from: x */
    public static final int f51154x = 4;

    /* JADX INFO: renamed from: y */
    public static final int f51155y = 9;

    /* JADX INFO: renamed from: z */
    public static final int f51156z = 11;

    /* JADX INFO: renamed from: i */
    public ck5 f51162i;

    /* JADX INFO: renamed from: k */
    public boolean f51164k;

    /* JADX INFO: renamed from: l */
    public long f51165l;

    /* JADX INFO: renamed from: m */
    public int f51166m;

    /* JADX INFO: renamed from: n */
    public int f51167n;

    /* JADX INFO: renamed from: o */
    public int f51168o;

    /* JADX INFO: renamed from: p */
    public long f51169p;

    /* JADX INFO: renamed from: q */
    public boolean f51170q;

    /* JADX INFO: renamed from: r */
    public dh0 f51171r;

    /* JADX INFO: renamed from: s */
    public c8i f51172s;

    /* JADX INFO: renamed from: d */
    public final ihc f51157d = new ihc(4);

    /* JADX INFO: renamed from: e */
    public final ihc f51158e = new ihc(9);

    /* JADX INFO: renamed from: f */
    public final ihc f51159f = new ihc(11);

    /* JADX INFO: renamed from: g */
    public final ihc f51160g = new ihc();

    /* JADX INFO: renamed from: h */
    public final gre f51161h = new gre();

    /* JADX INFO: renamed from: j */
    public int f51163j = 1;

    @g5e({"extractorOutput"})
    private void ensureReadyForMediaOutput() {
        if (this.f51170q) {
            return;
        }
        this.f51162i.seekMap(new hue.C7024b(-9223372036854775807L));
        this.f51170q = true;
    }

    private long getCurrentTimestampUs() {
        if (this.f51164k) {
            return this.f51165l + this.f51169p;
        }
        if (this.f51161h.getDurationUs() == -9223372036854775807L) {
            return 0L;
        }
        return this.f51169p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yj5[] lambda$static$0() {
        return new yj5[]{new jm6()};
    }

    private ihc prepareTagData(zj5 zj5Var) throws IOException {
        if (this.f51168o > this.f51160g.capacity()) {
            ihc ihcVar = this.f51160g;
            ihcVar.reset(new byte[Math.max(ihcVar.capacity() * 2, this.f51168o)], 0);
        } else {
            this.f51160g.setPosition(0);
        }
        this.f51160g.setLimit(this.f51168o);
        zj5Var.readFully(this.f51160g.getData(), 0, this.f51168o);
        return this.f51160g;
    }

    @g5e({"extractorOutput"})
    private boolean readFlvHeader(zj5 zj5Var) throws IOException {
        if (!zj5Var.readFully(this.f51158e.getData(), 0, 9, true)) {
            return false;
        }
        this.f51158e.setPosition(0);
        this.f51158e.skipBytes(4);
        int unsignedByte = this.f51158e.readUnsignedByte();
        boolean z = (unsignedByte & 4) != 0;
        boolean z2 = (unsignedByte & 1) != 0;
        if (z && this.f51171r == null) {
            this.f51171r = new dh0(this.f51162i.track(8, 1));
        }
        if (z2 && this.f51172s == null) {
            this.f51172s = new c8i(this.f51162i.track(9, 2));
        }
        this.f51162i.endTracks();
        this.f51166m = this.f51158e.readInt() - 5;
        this.f51163j = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @p000.g5e({"extractorOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean readTagData(p000.zj5 r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.getCurrentTimestampUs()
            int r2 = r9.f51167n
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            dh0 r3 = r9.f51171r
            if (r3 == 0) goto L23
            r9.ensureReadyForMediaOutput()
            dh0 r2 = r9.f51171r
            ihc r10 = r9.prepareTagData(r10)
            boolean r10 = r2.consume(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            c8i r3 = r9.f51172s
            if (r3 == 0) goto L39
            r9.ensureReadyForMediaOutput()
            c8i r2 = r9.f51172s
            ihc r10 = r9.prepareTagData(r10)
            boolean r10 = r2.consume(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.f51170q
            if (r2 != 0) goto L6e
            gre r2 = r9.f51161h
            ihc r10 = r9.prepareTagData(r10)
            boolean r10 = r2.consume(r10, r0)
            gre r0 = r9.f51161h
            long r0 = r0.getDurationUs()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            ck5 r2 = r9.f51162i
            k08 r3 = new k08
            gre r7 = r9.f51161h
            long[] r7 = r7.getKeyFrameTagPositions()
            gre r8 = r9.f51161h
            long[] r8 = r8.getKeyFrameTimesUs()
            r3.<init>(r7, r8, r0)
            r2.seekMap(r3)
            r9.f51170q = r6
            goto L21
        L6e:
            int r0 = r9.f51168o
            r10.skipFully(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.f51164k
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f51164k = r6
            gre r10 = r9.f51161h
            long r1 = r10.getDurationUs()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.f51169p
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f51165l = r1
        L8f:
            r10 = 4
            r9.f51166m = r10
            r10 = 2
            r9.f51163j = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jm6.readTagData(zj5):boolean");
    }

    private boolean readTagHeader(zj5 zj5Var) throws IOException {
        if (!zj5Var.readFully(this.f51159f.getData(), 0, 11, true)) {
            return false;
        }
        this.f51159f.setPosition(0);
        this.f51167n = this.f51159f.readUnsignedByte();
        this.f51168o = this.f51159f.readUnsignedInt24();
        this.f51169p = this.f51159f.readUnsignedInt24();
        this.f51169p = (((long) (this.f51159f.readUnsignedByte() << 24)) | this.f51169p) * 1000;
        this.f51159f.skipBytes(3);
        this.f51163j = 4;
        return true;
    }

    private void skipToTagHeader(zj5 zj5Var) throws IOException {
        zj5Var.skipFully(this.f51166m);
        this.f51166m = 0;
        this.f51163j = 3;
    }

    @Override // p000.yj5
    public void init(ck5 ck5Var) {
        this.f51162i = ck5Var;
    }

    @Override // p000.yj5
    public int read(zj5 zj5Var, c5d c5dVar) throws IOException {
        u80.checkStateNotNull(this.f51162i);
        while (true) {
            int i = this.f51163j;
            if (i != 1) {
                if (i == 2) {
                    skipToTagHeader(zj5Var);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (readTagData(zj5Var)) {
                        return 0;
                    }
                } else if (!readTagHeader(zj5Var)) {
                    return -1;
                }
            } else if (!readFlvHeader(zj5Var)) {
                return -1;
            }
        }
    }

    @Override // p000.yj5
    public void release() {
    }

    @Override // p000.yj5
    public void seek(long j, long j2) {
        if (j == 0) {
            this.f51163j = 1;
            this.f51164k = false;
        } else {
            this.f51163j = 3;
        }
        this.f51166m = 0;
    }

    @Override // p000.yj5
    public boolean sniff(zj5 zj5Var) throws IOException {
        zj5Var.peekFully(this.f51157d.getData(), 0, 3);
        this.f51157d.setPosition(0);
        if (this.f51157d.readUnsignedInt24() != 4607062) {
            return false;
        }
        zj5Var.peekFully(this.f51157d.getData(), 0, 2);
        this.f51157d.setPosition(0);
        if ((this.f51157d.readUnsignedShort() & 250) != 0) {
            return false;
        }
        zj5Var.peekFully(this.f51157d.getData(), 0, 4);
        this.f51157d.setPosition(0);
        int i = this.f51157d.readInt();
        zj5Var.resetPeekPosition();
        zj5Var.advancePeekPosition(i);
        zj5Var.peekFully(this.f51157d.getData(), 0, 4);
        this.f51157d.setPosition(0);
        return this.f51157d.readInt() == 0;
    }
}
