package p000;

import com.google.android.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.hue;
import p000.x26;
import p000.z26;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class v26 implements yj5 {

    /* JADX INFO: renamed from: A */
    public static final int f89730A = -1;

    /* JADX INFO: renamed from: r */
    public static final hk5 f89731r = new hk5() { // from class: s26
        @Override // p000.hk5
        public final yj5[] createExtractors() {
            return v26.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: s */
    public static final int f89732s = 1;

    /* JADX INFO: renamed from: t */
    public static final int f89733t = 0;

    /* JADX INFO: renamed from: u */
    public static final int f89734u = 1;

    /* JADX INFO: renamed from: v */
    public static final int f89735v = 2;

    /* JADX INFO: renamed from: w */
    public static final int f89736w = 3;

    /* JADX INFO: renamed from: x */
    public static final int f89737x = 4;

    /* JADX INFO: renamed from: y */
    public static final int f89738y = 5;

    /* JADX INFO: renamed from: z */
    public static final int f89739z = 32768;

    /* JADX INFO: renamed from: d */
    public final byte[] f89740d;

    /* JADX INFO: renamed from: e */
    public final ihc f89741e;

    /* JADX INFO: renamed from: f */
    public final boolean f89742f;

    /* JADX INFO: renamed from: g */
    public final x26.C14885a f89743g;

    /* JADX INFO: renamed from: h */
    public ck5 f89744h;

    /* JADX INFO: renamed from: i */
    public r6h f89745i;

    /* JADX INFO: renamed from: j */
    public int f89746j;

    /* JADX INFO: renamed from: k */
    @hib
    public Metadata f89747k;

    /* JADX INFO: renamed from: l */
    public f36 f89748l;

    /* JADX INFO: renamed from: m */
    public int f89749m;

    /* JADX INFO: renamed from: n */
    public int f89750n;

    /* JADX INFO: renamed from: o */
    public p26 f89751o;

    /* JADX INFO: renamed from: p */
    public int f89752p;

    /* JADX INFO: renamed from: q */
    public long f89753q;

    /* JADX INFO: renamed from: v26$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC13821a {
    }

    public v26() {
        this(0);
    }

    private long findFrame(ihc ihcVar, boolean z) {
        boolean zCheckAndReadFrameHeader;
        u80.checkNotNull(this.f89748l);
        int position = ihcVar.getPosition();
        while (position <= ihcVar.limit() - 16) {
            ihcVar.setPosition(position);
            if (x26.checkAndReadFrameHeader(ihcVar, this.f89748l, this.f89750n, this.f89743g)) {
                ihcVar.setPosition(position);
                return this.f89743g.f96092a;
            }
            position++;
        }
        if (!z) {
            ihcVar.setPosition(position);
            return -1L;
        }
        while (position <= ihcVar.limit() - this.f89749m) {
            ihcVar.setPosition(position);
            try {
                zCheckAndReadFrameHeader = x26.checkAndReadFrameHeader(ihcVar, this.f89748l, this.f89750n, this.f89743g);
            } catch (IndexOutOfBoundsException unused) {
                zCheckAndReadFrameHeader = false;
            }
            if (ihcVar.getPosition() <= ihcVar.limit() ? zCheckAndReadFrameHeader : false) {
                ihcVar.setPosition(position);
                return this.f89743g.f96092a;
            }
            position++;
        }
        ihcVar.setPosition(ihcVar.limit());
        return -1L;
    }

    private void getFrameStartMarker(zj5 zj5Var) throws IOException {
        this.f89750n = z26.getFrameStartMarker(zj5Var);
        ((ck5) x0i.castNonNull(this.f89744h)).seekMap(getSeekMap(zj5Var.getPosition(), zj5Var.getLength()));
        this.f89746j = 5;
    }

    private hue getSeekMap(long j, long j2) {
        u80.checkNotNull(this.f89748l);
        f36 f36Var = this.f89748l;
        if (f36Var.f34990k != null) {
            return new c36(f36Var, j);
        }
        if (j2 == -1 || f36Var.f34989j <= 0) {
            return new hue.C7024b(f36Var.getDurationUs());
        }
        p26 p26Var = new p26(f36Var, this.f89750n, j, j2);
        this.f89751o = p26Var;
        return p26Var.getSeekMap();
    }

    private void getStreamMarkerAndInfoBlockBytes(zj5 zj5Var) throws IOException {
        byte[] bArr = this.f89740d;
        zj5Var.peekFully(bArr, 0, bArr.length);
        zj5Var.resetPeekPosition();
        this.f89746j = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yj5[] lambda$static$0() {
        return new yj5[]{new v26()};
    }

    private void outputSampleMetadata() {
        ((r6h) x0i.castNonNull(this.f89745i)).sampleMetadata((this.f89753q * 1000000) / ((long) ((f36) x0i.castNonNull(this.f89748l)).f34984e), 1, this.f89752p, 0, null);
    }

    private int readFrames(zj5 zj5Var, c5d c5dVar) throws IOException {
        boolean z;
        u80.checkNotNull(this.f89745i);
        u80.checkNotNull(this.f89748l);
        p26 p26Var = this.f89751o;
        if (p26Var != null && p26Var.isSeeking()) {
            return this.f89751o.handlePendingSeek(zj5Var, c5dVar);
        }
        if (this.f89753q == -1) {
            this.f89753q = x26.getFirstSampleNumber(zj5Var, this.f89748l);
            return 0;
        }
        int iLimit = this.f89741e.limit();
        if (iLimit < 32768) {
            int i = zj5Var.read(this.f89741e.getData(), iLimit, 32768 - iLimit);
            z = i == -1;
            if (!z) {
                this.f89741e.setLimit(iLimit + i);
            } else if (this.f89741e.bytesLeft() == 0) {
                outputSampleMetadata();
                return -1;
            }
        } else {
            z = false;
        }
        int position = this.f89741e.getPosition();
        int i2 = this.f89752p;
        int i3 = this.f89749m;
        if (i2 < i3) {
            ihc ihcVar = this.f89741e;
            ihcVar.skipBytes(Math.min(i3 - i2, ihcVar.bytesLeft()));
        }
        long jFindFrame = findFrame(this.f89741e, z);
        int position2 = this.f89741e.getPosition() - position;
        this.f89741e.setPosition(position);
        this.f89745i.sampleData(this.f89741e, position2);
        this.f89752p += position2;
        if (jFindFrame != -1) {
            outputSampleMetadata();
            this.f89752p = 0;
            this.f89753q = jFindFrame;
        }
        if (this.f89741e.bytesLeft() < 16) {
            int iBytesLeft = this.f89741e.bytesLeft();
            System.arraycopy(this.f89741e.getData(), this.f89741e.getPosition(), this.f89741e.getData(), 0, iBytesLeft);
            this.f89741e.setPosition(0);
            this.f89741e.setLimit(iBytesLeft);
        }
        return 0;
    }

    private void readId3Metadata(zj5 zj5Var) throws IOException {
        this.f89747k = z26.readId3Metadata(zj5Var, !this.f89742f);
        this.f89746j = 1;
    }

    private void readMetadataBlocks(zj5 zj5Var) throws IOException {
        z26.C15939a c15939a = new z26.C15939a(this.f89748l);
        boolean metadataBlock = false;
        while (!metadataBlock) {
            metadataBlock = z26.readMetadataBlock(zj5Var, c15939a);
            this.f89748l = (f36) x0i.castNonNull(c15939a.f103738a);
        }
        u80.checkNotNull(this.f89748l);
        this.f89749m = Math.max(this.f89748l.f34982c, 6);
        ((r6h) x0i.castNonNull(this.f89745i)).format(this.f89748l.getFormat(this.f89740d, this.f89747k));
        this.f89746j = 4;
    }

    private void readStreamMarker(zj5 zj5Var) throws IOException {
        z26.readStreamMarker(zj5Var);
        this.f89746j = 3;
    }

    @Override // p000.yj5
    public void init(ck5 ck5Var) {
        this.f89744h = ck5Var;
        this.f89745i = ck5Var.track(0, 1);
        ck5Var.endTracks();
    }

    @Override // p000.yj5
    public int read(zj5 zj5Var, c5d c5dVar) throws IOException {
        int i = this.f89746j;
        if (i == 0) {
            readId3Metadata(zj5Var);
            return 0;
        }
        if (i == 1) {
            getStreamMarkerAndInfoBlockBytes(zj5Var);
            return 0;
        }
        if (i == 2) {
            readStreamMarker(zj5Var);
            return 0;
        }
        if (i == 3) {
            readMetadataBlocks(zj5Var);
            return 0;
        }
        if (i == 4) {
            getFrameStartMarker(zj5Var);
            return 0;
        }
        if (i == 5) {
            return readFrames(zj5Var, c5dVar);
        }
        throw new IllegalStateException();
    }

    @Override // p000.yj5
    public void release() {
    }

    @Override // p000.yj5
    public void seek(long j, long j2) {
        if (j == 0) {
            this.f89746j = 0;
        } else {
            p26 p26Var = this.f89751o;
            if (p26Var != null) {
                p26Var.setSeekTargetUs(j2);
            }
        }
        this.f89753q = j2 != 0 ? -1L : 0L;
        this.f89752p = 0;
        this.f89741e.reset(0);
    }

    @Override // p000.yj5
    public boolean sniff(zj5 zj5Var) throws IOException {
        z26.peekId3Metadata(zj5Var, false);
        return z26.checkAndPeekStreamMarker(zj5Var);
    }

    public v26(int i) {
        this.f89740d = new byte[42];
        this.f89741e = new ihc(new byte[32768], 0);
        this.f89742f = (i & 1) != 0;
        this.f89743g = new x26.C14885a();
        this.f89746j = 0;
    }
}
