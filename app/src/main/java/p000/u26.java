package p000;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.e36;
import p000.gue;
import p000.w26;
import p000.y26;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class u26 implements xj5 {

    /* JADX INFO: renamed from: A */
    public static final int f86581A = -1;

    /* JADX INFO: renamed from: r */
    public static final ik5 f86582r = new ik5() { // from class: t26
        @Override // p000.ik5
        public final xj5[] createExtractors() {
            return u26.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: s */
    public static final int f86583s = 1;

    /* JADX INFO: renamed from: t */
    public static final int f86584t = 0;

    /* JADX INFO: renamed from: u */
    public static final int f86585u = 1;

    /* JADX INFO: renamed from: v */
    public static final int f86586v = 2;

    /* JADX INFO: renamed from: w */
    public static final int f86587w = 3;

    /* JADX INFO: renamed from: x */
    public static final int f86588x = 4;

    /* JADX INFO: renamed from: y */
    public static final int f86589y = 5;

    /* JADX INFO: renamed from: z */
    public static final int f86590z = 32768;

    /* JADX INFO: renamed from: d */
    public final byte[] f86591d;

    /* JADX INFO: renamed from: e */
    public final jhc f86592e;

    /* JADX INFO: renamed from: f */
    public final boolean f86593f;

    /* JADX INFO: renamed from: g */
    public final w26.C14366a f86594g;

    /* JADX INFO: renamed from: h */
    public bk5 f86595h;

    /* JADX INFO: renamed from: i */
    public q6h f86596i;

    /* JADX INFO: renamed from: j */
    public int f86597j;

    /* JADX INFO: renamed from: k */
    @hib
    public eta f86598k;

    /* JADX INFO: renamed from: l */
    public e36 f86599l;

    /* JADX INFO: renamed from: m */
    public int f86600m;

    /* JADX INFO: renamed from: n */
    public int f86601n;

    /* JADX INFO: renamed from: o */
    public o26 f86602o;

    /* JADX INFO: renamed from: p */
    public int f86603p;

    /* JADX INFO: renamed from: q */
    public long f86604q;

    /* JADX INFO: renamed from: u26$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC13322a {
    }

    public u26() {
        this(0);
    }

    private long findFrame(jhc jhcVar, boolean z) {
        boolean zCheckAndReadFrameHeader;
        v80.checkNotNull(this.f86599l);
        int position = jhcVar.getPosition();
        while (position <= jhcVar.limit() - 16) {
            jhcVar.setPosition(position);
            if (w26.checkAndReadFrameHeader(jhcVar, this.f86599l, this.f86601n, this.f86594g)) {
                jhcVar.setPosition(position);
                return this.f86594g.f93125a;
            }
            position++;
        }
        if (!z) {
            jhcVar.setPosition(position);
            return -1L;
        }
        while (position <= jhcVar.limit() - this.f86600m) {
            jhcVar.setPosition(position);
            try {
                zCheckAndReadFrameHeader = w26.checkAndReadFrameHeader(jhcVar, this.f86599l, this.f86601n, this.f86594g);
            } catch (IndexOutOfBoundsException unused) {
                zCheckAndReadFrameHeader = false;
            }
            if (jhcVar.getPosition() <= jhcVar.limit() ? zCheckAndReadFrameHeader : false) {
                jhcVar.setPosition(position);
                return this.f86594g.f93125a;
            }
            position++;
        }
        jhcVar.setPosition(jhcVar.limit());
        return -1L;
    }

    private void getFrameStartMarker(ak5 ak5Var) throws IOException {
        this.f86601n = y26.getFrameStartMarker(ak5Var);
        ((bk5) t0i.castNonNull(this.f86595h)).seekMap(getSeekMap(ak5Var.getPosition(), ak5Var.getLength()));
        this.f86597j = 5;
    }

    private gue getSeekMap(long j, long j2) {
        v80.checkNotNull(this.f86599l);
        e36 e36Var = this.f86599l;
        e36.C5065a c5065a = e36Var.f31651k;
        if (c5065a != null && c5065a.f31653a.length > 0) {
            return new d36(e36Var, j);
        }
        if (j2 == -1 || e36Var.f31650j <= 0) {
            return new gue.C6549b(e36Var.getDurationUs());
        }
        o26 o26Var = new o26(e36Var, this.f86601n, j, j2);
        this.f86602o = o26Var;
        return o26Var.getSeekMap();
    }

    private void getStreamMarkerAndInfoBlockBytes(ak5 ak5Var) throws IOException {
        byte[] bArr = this.f86591d;
        ak5Var.peekFully(bArr, 0, bArr.length);
        ak5Var.resetPeekPosition();
        this.f86597j = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$static$0() {
        return new xj5[]{new u26()};
    }

    private void outputSampleMetadata() {
        ((q6h) t0i.castNonNull(this.f86596i)).sampleMetadata((this.f86604q * 1000000) / ((long) ((e36) t0i.castNonNull(this.f86599l)).f31645e), 1, this.f86603p, 0, null);
    }

    private int readFrames(ak5 ak5Var, d5d d5dVar) throws IOException {
        boolean z;
        v80.checkNotNull(this.f86596i);
        v80.checkNotNull(this.f86599l);
        o26 o26Var = this.f86602o;
        if (o26Var != null && o26Var.isSeeking()) {
            return this.f86602o.handlePendingSeek(ak5Var, d5dVar);
        }
        if (this.f86604q == -1) {
            this.f86604q = w26.getFirstSampleNumber(ak5Var, this.f86599l);
            return 0;
        }
        int iLimit = this.f86592e.limit();
        if (iLimit < 32768) {
            int i = ak5Var.read(this.f86592e.getData(), iLimit, 32768 - iLimit);
            z = i == -1;
            if (!z) {
                this.f86592e.setLimit(iLimit + i);
            } else if (this.f86592e.bytesLeft() == 0) {
                outputSampleMetadata();
                return -1;
            }
        } else {
            z = false;
        }
        int position = this.f86592e.getPosition();
        int i2 = this.f86603p;
        int i3 = this.f86600m;
        if (i2 < i3) {
            jhc jhcVar = this.f86592e;
            jhcVar.skipBytes(Math.min(i3 - i2, jhcVar.bytesLeft()));
        }
        long jFindFrame = findFrame(this.f86592e, z);
        int position2 = this.f86592e.getPosition() - position;
        this.f86592e.setPosition(position);
        this.f86596i.sampleData(this.f86592e, position2);
        this.f86603p += position2;
        if (jFindFrame != -1) {
            outputSampleMetadata();
            this.f86603p = 0;
            this.f86604q = jFindFrame;
        }
        int length = this.f86592e.getData().length - this.f86592e.limit();
        if (this.f86592e.bytesLeft() < 16 && length < 16) {
            int iBytesLeft = this.f86592e.bytesLeft();
            System.arraycopy(this.f86592e.getData(), this.f86592e.getPosition(), this.f86592e.getData(), 0, iBytesLeft);
            this.f86592e.setPosition(0);
            this.f86592e.setLimit(iBytesLeft);
        }
        return 0;
    }

    private void readId3Metadata(ak5 ak5Var) throws IOException {
        this.f86598k = y26.readId3Metadata(ak5Var, !this.f86593f);
        this.f86597j = 1;
    }

    private void readMetadataBlocks(ak5 ak5Var) throws IOException {
        y26.C15406a c15406a = new y26.C15406a(this.f86599l);
        boolean metadataBlock = false;
        while (!metadataBlock) {
            metadataBlock = y26.readMetadataBlock(ak5Var, c15406a);
            this.f86599l = (e36) t0i.castNonNull(c15406a.f100136a);
        }
        v80.checkNotNull(this.f86599l);
        this.f86600m = Math.max(this.f86599l.f31643c, 6);
        ((q6h) t0i.castNonNull(this.f86596i)).format(this.f86599l.getFormat(this.f86591d, this.f86598k).buildUpon().setContainerMimeType("audio/flac").build());
        ((q6h) t0i.castNonNull(this.f86596i)).durationUs(this.f86599l.getDurationUs());
        this.f86597j = 4;
    }

    private void readStreamMarker(ak5 ak5Var) throws IOException {
        y26.readStreamMarker(ak5Var);
        this.f86597j = 3;
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f86595h = bk5Var;
        this.f86596i = bk5Var.track(0, 1);
        bk5Var.endTracks();
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        int i = this.f86597j;
        if (i == 0) {
            readId3Metadata(ak5Var);
            return 0;
        }
        if (i == 1) {
            getStreamMarkerAndInfoBlockBytes(ak5Var);
            return 0;
        }
        if (i == 2) {
            readStreamMarker(ak5Var);
            return 0;
        }
        if (i == 3) {
            readMetadataBlocks(ak5Var);
            return 0;
        }
        if (i == 4) {
            getFrameStartMarker(ak5Var);
            return 0;
        }
        if (i == 5) {
            return readFrames(ak5Var, d5dVar);
        }
        throw new IllegalStateException();
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        if (j == 0) {
            this.f86597j = 0;
        } else {
            o26 o26Var = this.f86602o;
            if (o26Var != null) {
                o26Var.setSeekTargetUs(j2);
            }
        }
        this.f86604q = j2 != 0 ? -1L : 0L;
        this.f86603p = 0;
        this.f86592e.reset(0);
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        y26.peekId3Metadata(ak5Var, false);
        return y26.checkAndPeekStreamMarker(ak5Var);
    }

    public u26(int i) {
        this.f86591d = new byte[42];
        this.f86592e = new jhc(new byte[32768], 0);
        this.f86593f = (i & 1) != 0;
        this.f86594g = new w26.C14366a();
        this.f86597j = 0;
    }
}
