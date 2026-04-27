package p000;

import android.util.SparseArray;
import java.io.IOException;
import p000.ckh;
import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class cjd implements xj5 {

    /* JADX INFO: renamed from: A */
    public static final int f16714A = 240;

    /* JADX INFO: renamed from: o */
    public static final ik5 f16715o = new ik5() { // from class: bjd
        @Override // p000.ik5
        public final xj5[] createExtractors() {
            return cjd.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: p */
    public static final int f16716p = 442;

    /* JADX INFO: renamed from: q */
    public static final int f16717q = 443;

    /* JADX INFO: renamed from: r */
    public static final int f16718r = 1;

    /* JADX INFO: renamed from: s */
    public static final int f16719s = 441;

    /* JADX INFO: renamed from: t */
    public static final int f16720t = 256;

    /* JADX INFO: renamed from: u */
    public static final long f16721u = 1048576;

    /* JADX INFO: renamed from: v */
    public static final long f16722v = 8192;

    /* JADX INFO: renamed from: w */
    public static final int f16723w = 189;

    /* JADX INFO: renamed from: x */
    public static final int f16724x = 192;

    /* JADX INFO: renamed from: y */
    public static final int f16725y = 224;

    /* JADX INFO: renamed from: z */
    public static final int f16726z = 224;

    /* JADX INFO: renamed from: d */
    public final h2h f16727d;

    /* JADX INFO: renamed from: e */
    public final SparseArray<C2334a> f16728e;

    /* JADX INFO: renamed from: f */
    public final jhc f16729f;

    /* JADX INFO: renamed from: g */
    public final zid f16730g;

    /* JADX INFO: renamed from: h */
    public boolean f16731h;

    /* JADX INFO: renamed from: i */
    public boolean f16732i;

    /* JADX INFO: renamed from: j */
    public boolean f16733j;

    /* JADX INFO: renamed from: k */
    public long f16734k;

    /* JADX INFO: renamed from: l */
    @hib
    public wid f16735l;

    /* JADX INFO: renamed from: m */
    public bk5 f16736m;

    /* JADX INFO: renamed from: n */
    public boolean f16737n;

    /* JADX INFO: renamed from: cjd$a */
    public static final class C2334a {

        /* JADX INFO: renamed from: i */
        public static final int f16738i = 64;

        /* JADX INFO: renamed from: a */
        public final dy4 f16739a;

        /* JADX INFO: renamed from: b */
        public final h2h f16740b;

        /* JADX INFO: renamed from: c */
        public final hhc f16741c = new hhc(new byte[64]);

        /* JADX INFO: renamed from: d */
        public boolean f16742d;

        /* JADX INFO: renamed from: e */
        public boolean f16743e;

        /* JADX INFO: renamed from: f */
        public boolean f16744f;

        /* JADX INFO: renamed from: g */
        public int f16745g;

        /* JADX INFO: renamed from: h */
        public long f16746h;

        public C2334a(dy4 dy4Var, h2h h2hVar) {
            this.f16739a = dy4Var;
            this.f16740b = h2hVar;
        }

        private void parseHeader() {
            this.f16741c.skipBits(8);
            this.f16742d = this.f16741c.readBit();
            this.f16743e = this.f16741c.readBit();
            this.f16741c.skipBits(6);
            this.f16745g = this.f16741c.readBits(8);
        }

        private void parseHeaderExtension() {
            this.f16746h = 0L;
            if (this.f16742d) {
                this.f16741c.skipBits(4);
                long bits = ((long) this.f16741c.readBits(3)) << 30;
                this.f16741c.skipBits(1);
                long bits2 = bits | ((long) (this.f16741c.readBits(15) << 15));
                this.f16741c.skipBits(1);
                long bits3 = bits2 | ((long) this.f16741c.readBits(15));
                this.f16741c.skipBits(1);
                if (!this.f16744f && this.f16743e) {
                    this.f16741c.skipBits(4);
                    long bits4 = ((long) this.f16741c.readBits(3)) << 30;
                    this.f16741c.skipBits(1);
                    long bits5 = bits4 | ((long) (this.f16741c.readBits(15) << 15));
                    this.f16741c.skipBits(1);
                    long bits6 = bits5 | ((long) this.f16741c.readBits(15));
                    this.f16741c.skipBits(1);
                    this.f16740b.adjustTsTimestamp(bits6);
                    this.f16744f = true;
                }
                this.f16746h = this.f16740b.adjustTsTimestamp(bits3);
            }
        }

        public void consume(jhc jhcVar) throws yhc {
            jhcVar.readBytes(this.f16741c.f43646a, 0, 3);
            this.f16741c.setPosition(0);
            parseHeader();
            jhcVar.readBytes(this.f16741c.f43646a, 0, this.f16745g);
            this.f16741c.setPosition(0);
            parseHeaderExtension();
            this.f16739a.packetStarted(this.f16746h, 4);
            this.f16739a.consume(jhcVar);
            this.f16739a.packetFinished(false);
        }

        public void seek() {
            this.f16744f = false;
            this.f16739a.seek();
        }
    }

    public cjd() {
        this(new h2h(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$static$0() {
        return new xj5[]{new cjd()};
    }

    @g5e({"output"})
    private void maybeOutputSeekMap(long j) {
        if (this.f16737n) {
            return;
        }
        this.f16737n = true;
        if (this.f16730g.getDurationUs() == -9223372036854775807L) {
            this.f16736m.seekMap(new gue.C6549b(this.f16730g.getDurationUs()));
            return;
        }
        wid widVar = new wid(this.f16730g.getScrTimestampAdjuster(), this.f16730g.getDurationUs(), j);
        this.f16735l = widVar;
        this.f16736m.seekMap(widVar.getSeekMap());
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f16736m = bk5Var;
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        dy4 nd7Var;
        v80.checkStateNotNull(this.f16736m);
        long length = ak5Var.getLength();
        if (length != -1 && !this.f16730g.isDurationReadFinished()) {
            return this.f16730g.readDuration(ak5Var, d5dVar);
        }
        maybeOutputSeekMap(length);
        wid widVar = this.f16735l;
        if (widVar != null && widVar.isSeeking()) {
            return this.f16735l.handlePendingSeek(ak5Var, d5dVar);
        }
        ak5Var.resetPeekPosition();
        long peekPosition = length != -1 ? length - ak5Var.getPeekPosition() : -1L;
        if ((peekPosition != -1 && peekPosition < 4) || !ak5Var.peekFully(this.f16729f.getData(), 0, 4, true)) {
            return -1;
        }
        this.f16729f.setPosition(0);
        int i = this.f16729f.readInt();
        if (i == 441) {
            return -1;
        }
        if (i == 442) {
            ak5Var.peekFully(this.f16729f.getData(), 0, 10);
            this.f16729f.setPosition(9);
            ak5Var.skipFully((this.f16729f.readUnsignedByte() & 7) + 14);
            return 0;
        }
        if (i == 443) {
            ak5Var.peekFully(this.f16729f.getData(), 0, 2);
            this.f16729f.setPosition(0);
            ak5Var.skipFully(this.f16729f.readUnsignedShort() + 6);
            return 0;
        }
        if (((i & (-256)) >> 8) != 1) {
            ak5Var.skipFully(1);
            return 0;
        }
        int i2 = i & 255;
        C2334a c2334a = this.f16728e.get(i2);
        if (!this.f16731h) {
            if (c2334a == null) {
                if (i2 == 189) {
                    nd7Var = new C11308q5("video/mp2p");
                    this.f16732i = true;
                    this.f16734k = ak5Var.getPosition();
                } else if ((i & 224) == 192) {
                    nd7Var = new n1b("video/mp2p");
                    this.f16732i = true;
                    this.f16734k = ak5Var.getPosition();
                } else if ((i & 240) == 224) {
                    nd7Var = new nd7("video/mp2p");
                    this.f16733j = true;
                    this.f16734k = ak5Var.getPosition();
                } else {
                    nd7Var = null;
                }
                if (nd7Var != null) {
                    nd7Var.createTracks(this.f16736m, new ckh.C2372e(i2, 256));
                    c2334a = new C2334a(nd7Var, this.f16727d);
                    this.f16728e.put(i2, c2334a);
                }
            }
            if (ak5Var.getPosition() > ((this.f16732i && this.f16733j) ? this.f16734k + 8192 : 1048576L)) {
                this.f16731h = true;
                this.f16736m.endTracks();
            }
        }
        ak5Var.peekFully(this.f16729f.getData(), 0, 2);
        this.f16729f.setPosition(0);
        int unsignedShort = this.f16729f.readUnsignedShort() + 6;
        if (c2334a == null) {
            ak5Var.skipFully(unsignedShort);
        } else {
            this.f16729f.reset(unsignedShort);
            ak5Var.readFully(this.f16729f.getData(), 0, unsignedShort);
            this.f16729f.setPosition(6);
            c2334a.consume(this.f16729f);
            jhc jhcVar = this.f16729f;
            jhcVar.setLimit(jhcVar.capacity());
        }
        return 0;
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        boolean z = this.f16727d.getTimestampOffsetUs() == -9223372036854775807L;
        if (!z) {
            long firstSampleTimestampUs = this.f16727d.getFirstSampleTimestampUs();
            z = (firstSampleTimestampUs == -9223372036854775807L || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j2) ? false : true;
        }
        if (z) {
            this.f16727d.reset(j2);
        }
        wid widVar = this.f16735l;
        if (widVar != null) {
            widVar.setSeekTargetUs(j2);
        }
        for (int i = 0; i < this.f16728e.size(); i++) {
            this.f16728e.valueAt(i).seek();
        }
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        byte[] bArr = new byte[14];
        ak5Var.peekFully(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        ak5Var.advancePeekPosition(bArr[13] & 7);
        ak5Var.peekFully(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public cjd(h2h h2hVar) {
        this.f16727d = h2hVar;
        this.f16729f = new jhc(4096);
        this.f16728e = new SparseArray<>();
        this.f16730g = new zid();
    }
}
