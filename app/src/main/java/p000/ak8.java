package p000;

import androidx.media3.common.C1213a;
import java.io.IOException;
import p000.gue;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
public final class ak8 implements xj5 {

    /* JADX INFO: renamed from: n */
    public static final int f1807n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f1808o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f1809p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f1810q = 4;

    /* JADX INFO: renamed from: r */
    public static final int f1811r = 5;

    /* JADX INFO: renamed from: s */
    public static final int f1812s = 6;

    /* JADX INFO: renamed from: t */
    public static final int f1813t = 65496;

    /* JADX INFO: renamed from: u */
    public static final int f1814u = 65498;

    /* JADX INFO: renamed from: v */
    public static final int f1815v = 65504;

    /* JADX INFO: renamed from: w */
    public static final int f1816w = 65505;

    /* JADX INFO: renamed from: x */
    public static final String f1817x = "http://ns.adobe.com/xap/1.0/";

    /* JADX INFO: renamed from: e */
    public bk5 f1819e;

    /* JADX INFO: renamed from: f */
    public int f1820f;

    /* JADX INFO: renamed from: g */
    public int f1821g;

    /* JADX INFO: renamed from: h */
    public int f1822h;

    /* JADX INFO: renamed from: j */
    @hib
    public yza f1824j;

    /* JADX INFO: renamed from: k */
    public ak5 f1825k;

    /* JADX INFO: renamed from: l */
    public u1g f1826l;

    /* JADX INFO: renamed from: m */
    @hib
    public e1b f1827m;

    /* JADX INFO: renamed from: d */
    public final jhc f1818d = new jhc(2);

    /* JADX INFO: renamed from: i */
    public long f1823i = -1;

    private void advancePeekPositionToNextSegment(ak5 ak5Var) throws IOException {
        this.f1818d.reset(2);
        ak5Var.peekFully(this.f1818d.getData(), 0, 2);
        ak5Var.advancePeekPosition(this.f1818d.readUnsignedShort() - 2);
    }

    private void endReading() {
        ((bk5) v80.checkNotNull(this.f1819e)).endTracks();
        this.f1819e.seekMap(new gue.C6549b(-9223372036854775807L));
        this.f1820f = 6;
    }

    @hib
    private static yza getMotionPhotoMetadata(String str, long j) throws IOException {
        wza wzaVar;
        if (j == -1 || (wzaVar = gti.parse(str)) == null) {
            return null;
        }
        return wzaVar.getMotionPhotoMetadata(j);
    }

    private void outputImageTrack(yza yzaVar) {
        ((bk5) v80.checkNotNull(this.f1819e)).track(1024, 4).format(new C1213a.b().setContainerMimeType("image/jpeg").setMetadata(new eta(yzaVar)).build());
    }

    private int peekMarker(ak5 ak5Var) throws IOException {
        this.f1818d.reset(2);
        ak5Var.peekFully(this.f1818d.getData(), 0, 2);
        return this.f1818d.readUnsignedShort();
    }

    private void readMarker(ak5 ak5Var) throws IOException {
        this.f1818d.reset(2);
        ak5Var.readFully(this.f1818d.getData(), 0, 2);
        int unsignedShort = this.f1818d.readUnsignedShort();
        this.f1821g = unsignedShort;
        if (unsignedShort == 65498) {
            if (this.f1823i != -1) {
                this.f1820f = 4;
                return;
            } else {
                endReading();
                return;
            }
        }
        if ((unsignedShort < 65488 || unsignedShort > 65497) && unsignedShort != 65281) {
            this.f1820f = 1;
        }
    }

    private void readSegment(ak5 ak5Var) throws IOException {
        String nullTerminatedString;
        if (this.f1821g == 65505) {
            jhc jhcVar = new jhc(this.f1822h);
            ak5Var.readFully(jhcVar.getData(), 0, this.f1822h);
            if (this.f1824j == null && "http://ns.adobe.com/xap/1.0/".equals(jhcVar.readNullTerminatedString()) && (nullTerminatedString = jhcVar.readNullTerminatedString()) != null) {
                yza motionPhotoMetadata = getMotionPhotoMetadata(nullTerminatedString, ak5Var.getLength());
                this.f1824j = motionPhotoMetadata;
                if (motionPhotoMetadata != null) {
                    this.f1823i = motionPhotoMetadata.f103532d;
                }
            }
        } else {
            ak5Var.skipFully(this.f1822h);
        }
        this.f1820f = 0;
    }

    private void readSegmentLength(ak5 ak5Var) throws IOException {
        this.f1818d.reset(2);
        ak5Var.readFully(this.f1818d.getData(), 0, 2);
        this.f1822h = this.f1818d.readUnsignedShort() - 2;
        this.f1820f = 2;
    }

    private void sniffMotionPhotoVideo(ak5 ak5Var) throws IOException {
        if (!ak5Var.peekFully(this.f1818d.getData(), 0, 1, true)) {
            endReading();
            return;
        }
        ak5Var.resetPeekPosition();
        if (this.f1827m == null) {
            this.f1827m = new e1b(peg.InterfaceC10936a.f70575a, 8);
        }
        u1g u1gVar = new u1g(ak5Var, this.f1823i);
        this.f1826l = u1gVar;
        if (!this.f1827m.sniff(u1gVar)) {
            endReading();
        } else {
            this.f1827m.init(new w1g(this.f1823i, (bk5) v80.checkNotNull(this.f1819e)));
            startReadingMotionPhoto();
        }
    }

    private void startReadingMotionPhoto() {
        outputImageTrack((yza) v80.checkNotNull(this.f1824j));
        this.f1820f = 5;
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f1819e = bk5Var;
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        int i = this.f1820f;
        if (i == 0) {
            readMarker(ak5Var);
            return 0;
        }
        if (i == 1) {
            readSegmentLength(ak5Var);
            return 0;
        }
        if (i == 2) {
            readSegment(ak5Var);
            return 0;
        }
        if (i == 4) {
            long position = ak5Var.getPosition();
            long j = this.f1823i;
            if (position != j) {
                d5dVar.f28476a = j;
                return 1;
            }
            sniffMotionPhotoVideo(ak5Var);
            return 0;
        }
        if (i != 5) {
            if (i == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f1826l == null || ak5Var != this.f1825k) {
            this.f1825k = ak5Var;
            this.f1826l = new u1g(ak5Var, this.f1823i);
        }
        int i2 = ((e1b) v80.checkNotNull(this.f1827m)).read(this.f1826l, d5dVar);
        if (i2 == 1) {
            d5dVar.f28476a += this.f1823i;
        }
        return i2;
    }

    @Override // p000.xj5
    public void release() {
        e1b e1bVar = this.f1827m;
        if (e1bVar != null) {
            e1bVar.release();
        }
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        if (j == 0) {
            this.f1820f = 0;
            this.f1827m = null;
        } else if (this.f1820f == 5) {
            ((e1b) v80.checkNotNull(this.f1827m)).seek(j, j2);
        }
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        if (peekMarker(ak5Var) != 65496) {
            return false;
        }
        int iPeekMarker = peekMarker(ak5Var);
        this.f1821g = iPeekMarker;
        if (iPeekMarker == 65504) {
            advancePeekPositionToNextSegment(ak5Var);
            this.f1821g = peekMarker(ak5Var);
        }
        return this.f1821g == 65505;
    }
}
