package p000;

import android.util.SparseArray;
import java.io.IOException;
import p000.dkh;
import p000.hue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class djd implements yj5 {

    /* JADX INFO: renamed from: A */
    public static final int f29804A = 240;

    /* JADX INFO: renamed from: o */
    public static final hk5 f29805o = new hk5() { // from class: ajd
        @Override // p000.hk5
        public final yj5[] createExtractors() {
            return djd.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: p */
    public static final int f29806p = 442;

    /* JADX INFO: renamed from: q */
    public static final int f29807q = 443;

    /* JADX INFO: renamed from: r */
    public static final int f29808r = 1;

    /* JADX INFO: renamed from: s */
    public static final int f29809s = 441;

    /* JADX INFO: renamed from: t */
    public static final int f29810t = 256;

    /* JADX INFO: renamed from: u */
    public static final long f29811u = 1048576;

    /* JADX INFO: renamed from: v */
    public static final long f29812v = 8192;

    /* JADX INFO: renamed from: w */
    public static final int f29813w = 189;

    /* JADX INFO: renamed from: x */
    public static final int f29814x = 192;

    /* JADX INFO: renamed from: y */
    public static final int f29815y = 224;

    /* JADX INFO: renamed from: z */
    public static final int f29816z = 224;

    /* JADX INFO: renamed from: d */
    public final g2h f29817d;

    /* JADX INFO: renamed from: e */
    public final SparseArray<C4824a> f29818e;

    /* JADX INFO: renamed from: f */
    public final ihc f29819f;

    /* JADX INFO: renamed from: g */
    public final yid f29820g;

    /* JADX INFO: renamed from: h */
    public boolean f29821h;

    /* JADX INFO: renamed from: i */
    public boolean f29822i;

    /* JADX INFO: renamed from: j */
    public boolean f29823j;

    /* JADX INFO: renamed from: k */
    public long f29824k;

    /* JADX INFO: renamed from: l */
    @hib
    public xid f29825l;

    /* JADX INFO: renamed from: m */
    public ck5 f29826m;

    /* JADX INFO: renamed from: n */
    public boolean f29827n;

    /* JADX INFO: renamed from: djd$a */
    public static final class C4824a {

        /* JADX INFO: renamed from: i */
        public static final int f29828i = 64;

        /* JADX INFO: renamed from: a */
        public final cy4 f29829a;

        /* JADX INFO: renamed from: b */
        public final g2h f29830b;

        /* JADX INFO: renamed from: c */
        public final ghc f29831c = new ghc(new byte[64]);

        /* JADX INFO: renamed from: d */
        public boolean f29832d;

        /* JADX INFO: renamed from: e */
        public boolean f29833e;

        /* JADX INFO: renamed from: f */
        public boolean f29834f;

        /* JADX INFO: renamed from: g */
        public int f29835g;

        /* JADX INFO: renamed from: h */
        public long f29836h;

        public C4824a(cy4 cy4Var, g2h g2hVar) {
            this.f29829a = cy4Var;
            this.f29830b = g2hVar;
        }

        private void parseHeader() {
            this.f29831c.skipBits(8);
            this.f29832d = this.f29831c.readBit();
            this.f29833e = this.f29831c.readBit();
            this.f29831c.skipBits(6);
            this.f29835g = this.f29831c.readBits(8);
        }

        private void parseHeaderExtension() {
            this.f29836h = 0L;
            if (this.f29832d) {
                this.f29831c.skipBits(4);
                long bits = ((long) this.f29831c.readBits(3)) << 30;
                this.f29831c.skipBits(1);
                long bits2 = bits | ((long) (this.f29831c.readBits(15) << 15));
                this.f29831c.skipBits(1);
                long bits3 = bits2 | ((long) this.f29831c.readBits(15));
                this.f29831c.skipBits(1);
                if (!this.f29834f && this.f29833e) {
                    this.f29831c.skipBits(4);
                    long bits4 = ((long) this.f29831c.readBits(3)) << 30;
                    this.f29831c.skipBits(1);
                    long bits5 = bits4 | ((long) (this.f29831c.readBits(15) << 15));
                    this.f29831c.skipBits(1);
                    long bits6 = bits5 | ((long) this.f29831c.readBits(15));
                    this.f29831c.skipBits(1);
                    this.f29830b.adjustTsTimestamp(bits6);
                    this.f29834f = true;
                }
                this.f29836h = this.f29830b.adjustTsTimestamp(bits3);
            }
        }

        public void consume(ihc ihcVar) throws xhc {
            ihcVar.readBytes(this.f29831c.f39834a, 0, 3);
            this.f29831c.setPosition(0);
            parseHeader();
            ihcVar.readBytes(this.f29831c.f39834a, 0, this.f29835g);
            this.f29831c.setPosition(0);
            parseHeaderExtension();
            this.f29829a.packetStarted(this.f29836h, 4);
            this.f29829a.consume(ihcVar);
            this.f29829a.packetFinished();
        }

        public void seek() {
            this.f29834f = false;
            this.f29829a.seek();
        }
    }

    public djd() {
        this(new g2h(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yj5[] lambda$static$0() {
        return new yj5[]{new djd()};
    }

    @g5e({"output"})
    private void maybeOutputSeekMap(long j) {
        if (this.f29827n) {
            return;
        }
        this.f29827n = true;
        if (this.f29820g.getDurationUs() == -9223372036854775807L) {
            this.f29826m.seekMap(new hue.C7024b(this.f29820g.getDurationUs()));
            return;
        }
        xid xidVar = new xid(this.f29820g.getScrTimestampAdjuster(), this.f29820g.getDurationUs(), j);
        this.f29825l = xidVar;
        this.f29826m.seekMap(xidVar.getSeekMap());
    }

    @Override // p000.yj5
    public void init(ck5 ck5Var) {
        this.f29826m = ck5Var;
    }

    @Override // p000.yj5
    public int read(zj5 zj5Var, c5d c5dVar) throws IOException {
        cy4 od7Var;
        u80.checkStateNotNull(this.f29826m);
        long length = zj5Var.getLength();
        if (length != -1 && !this.f29820g.isDurationReadFinished()) {
            return this.f29820g.readDuration(zj5Var, c5dVar);
        }
        maybeOutputSeekMap(length);
        xid xidVar = this.f29825l;
        if (xidVar != null && xidVar.isSeeking()) {
            return this.f29825l.handlePendingSeek(zj5Var, c5dVar);
        }
        zj5Var.resetPeekPosition();
        long peekPosition = length != -1 ? length - zj5Var.getPeekPosition() : -1L;
        if ((peekPosition != -1 && peekPosition < 4) || !zj5Var.peekFully(this.f29819f.getData(), 0, 4, true)) {
            return -1;
        }
        this.f29819f.setPosition(0);
        int i = this.f29819f.readInt();
        if (i == 441) {
            return -1;
        }
        if (i == 442) {
            zj5Var.peekFully(this.f29819f.getData(), 0, 10);
            this.f29819f.setPosition(9);
            zj5Var.skipFully((this.f29819f.readUnsignedByte() & 7) + 14);
            return 0;
        }
        if (i == 443) {
            zj5Var.peekFully(this.f29819f.getData(), 0, 2);
            this.f29819f.setPosition(0);
            zj5Var.skipFully(this.f29819f.readUnsignedShort() + 6);
            return 0;
        }
        if (((i & (-256)) >> 8) != 1) {
            zj5Var.skipFully(1);
            return 0;
        }
        int i2 = i & 255;
        C4824a c4824a = this.f29818e.get(i2);
        if (!this.f29821h) {
            if (c4824a == null) {
                if (i2 == 189) {
                    od7Var = new C10796p5();
                    this.f29822i = true;
                    this.f29824k = zj5Var.getPosition();
                } else if ((i & 224) == 192) {
                    od7Var = new m1b();
                    this.f29822i = true;
                    this.f29824k = zj5Var.getPosition();
                } else if ((i & 240) == 224) {
                    od7Var = new od7();
                    this.f29823j = true;
                    this.f29824k = zj5Var.getPosition();
                } else {
                    od7Var = null;
                }
                if (od7Var != null) {
                    od7Var.createTracks(this.f29826m, new dkh.C4838e(i2, 256));
                    c4824a = new C4824a(od7Var, this.f29817d);
                    this.f29818e.put(i2, c4824a);
                }
            }
            if (zj5Var.getPosition() > ((this.f29822i && this.f29823j) ? this.f29824k + 8192 : 1048576L)) {
                this.f29821h = true;
                this.f29826m.endTracks();
            }
        }
        zj5Var.peekFully(this.f29819f.getData(), 0, 2);
        this.f29819f.setPosition(0);
        int unsignedShort = this.f29819f.readUnsignedShort() + 6;
        if (c4824a == null) {
            zj5Var.skipFully(unsignedShort);
        } else {
            this.f29819f.reset(unsignedShort);
            zj5Var.readFully(this.f29819f.getData(), 0, unsignedShort);
            this.f29819f.setPosition(6);
            c4824a.consume(this.f29819f);
            ihc ihcVar = this.f29819f;
            ihcVar.setLimit(ihcVar.capacity());
        }
        return 0;
    }

    @Override // p000.yj5
    public void release() {
    }

    @Override // p000.yj5
    public void seek(long j, long j2) {
        boolean z = this.f29817d.getTimestampOffsetUs() == -9223372036854775807L;
        if (!z) {
            long firstSampleTimestampUs = this.f29817d.getFirstSampleTimestampUs();
            z = (firstSampleTimestampUs == -9223372036854775807L || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j2) ? false : true;
        }
        if (z) {
            this.f29817d.reset(j2);
        }
        xid xidVar = this.f29825l;
        if (xidVar != null) {
            xidVar.setSeekTargetUs(j2);
        }
        for (int i = 0; i < this.f29818e.size(); i++) {
            this.f29818e.valueAt(i).seek();
        }
    }

    @Override // p000.yj5
    public boolean sniff(zj5 zj5Var) throws IOException {
        byte[] bArr = new byte[14];
        zj5Var.peekFully(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zj5Var.advancePeekPosition(bArr[13] & 7);
        zj5Var.peekFully(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public djd(g2h g2hVar) {
        this.f29817d = g2hVar;
        this.f29819f = new ihc(4096);
        this.f29818e = new SparseArray<>();
        this.f29820g = new yid();
    }
}
