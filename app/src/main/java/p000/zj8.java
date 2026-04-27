package p000;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;
import p000.hue;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zj8 implements yj5 {

    /* JADX INFO: renamed from: A */
    public static final int f105274A = 1024;

    /* JADX INFO: renamed from: n */
    public static final int f105275n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f105276o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f105277p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f105278q = 4;

    /* JADX INFO: renamed from: r */
    public static final int f105279r = 5;

    /* JADX INFO: renamed from: s */
    public static final int f105280s = 6;

    /* JADX INFO: renamed from: t */
    public static final int f105281t = 6;

    /* JADX INFO: renamed from: u */
    public static final long f105282u = 1165519206;

    /* JADX INFO: renamed from: v */
    public static final int f105283v = 65496;

    /* JADX INFO: renamed from: w */
    public static final int f105284w = 65498;

    /* JADX INFO: renamed from: x */
    public static final int f105285x = 65504;

    /* JADX INFO: renamed from: y */
    public static final int f105286y = 65505;

    /* JADX INFO: renamed from: z */
    public static final String f105287z = "http://ns.adobe.com/xap/1.0/";

    /* JADX INFO: renamed from: e */
    public ck5 f105289e;

    /* JADX INFO: renamed from: f */
    public int f105290f;

    /* JADX INFO: renamed from: g */
    public int f105291g;

    /* JADX INFO: renamed from: h */
    public int f105292h;

    /* JADX INFO: renamed from: j */
    @hib
    public MotionPhotoMetadata f105294j;

    /* JADX INFO: renamed from: k */
    public zj5 f105295k;

    /* JADX INFO: renamed from: l */
    public t1g f105296l;

    /* JADX INFO: renamed from: m */
    @hib
    public f1b f105297m;

    /* JADX INFO: renamed from: d */
    public final ihc f105288d = new ihc(6);

    /* JADX INFO: renamed from: i */
    public long f105293i = -1;

    private void advancePeekPositionToNextSegment(zj5 zj5Var) throws IOException {
        this.f105288d.reset(2);
        zj5Var.peekFully(this.f105288d.getData(), 0, 2);
        zj5Var.advancePeekPosition(this.f105288d.readUnsignedShort() - 2);
    }

    private void endReadingWithImageTrack() {
        outputImageTrack(new Metadata.Entry[0]);
        ((ck5) u80.checkNotNull(this.f105289e)).endTracks();
        this.f105289e.seekMap(new hue.C7024b(-9223372036854775807L));
        this.f105290f = 6;
    }

    @hib
    private static MotionPhotoMetadata getMotionPhotoMetadata(String str, long j) throws IOException {
        xza xzaVar;
        if (j == -1 || (xzaVar = fti.parse(str)) == null) {
            return null;
        }
        return xzaVar.getMotionPhotoMetadata(j);
    }

    private void outputImageTrack(Metadata.Entry... entryArr) {
        ((ck5) u80.checkNotNull(this.f105289e)).track(1024, 4).format(new kq6.C8497b().setContainerMimeType("image/jpeg").setMetadata(new Metadata(entryArr)).build());
    }

    private int peekMarker(zj5 zj5Var) throws IOException {
        this.f105288d.reset(2);
        zj5Var.peekFully(this.f105288d.getData(), 0, 2);
        return this.f105288d.readUnsignedShort();
    }

    private void readMarker(zj5 zj5Var) throws IOException {
        this.f105288d.reset(2);
        zj5Var.readFully(this.f105288d.getData(), 0, 2);
        int unsignedShort = this.f105288d.readUnsignedShort();
        this.f105291g = unsignedShort;
        if (unsignedShort == 65498) {
            if (this.f105293i != -1) {
                this.f105290f = 4;
                return;
            } else {
                endReadingWithImageTrack();
                return;
            }
        }
        if ((unsignedShort < 65488 || unsignedShort > 65497) && unsignedShort != 65281) {
            this.f105290f = 1;
        }
    }

    private void readSegment(zj5 zj5Var) throws IOException {
        String nullTerminatedString;
        if (this.f105291g == 65505) {
            ihc ihcVar = new ihc(this.f105292h);
            zj5Var.readFully(ihcVar.getData(), 0, this.f105292h);
            if (this.f105294j == null && "http://ns.adobe.com/xap/1.0/".equals(ihcVar.readNullTerminatedString()) && (nullTerminatedString = ihcVar.readNullTerminatedString()) != null) {
                MotionPhotoMetadata motionPhotoMetadata = getMotionPhotoMetadata(nullTerminatedString, zj5Var.getLength());
                this.f105294j = motionPhotoMetadata;
                if (motionPhotoMetadata != null) {
                    this.f105293i = motionPhotoMetadata.f19670d;
                }
            }
        } else {
            zj5Var.skipFully(this.f105292h);
        }
        this.f105290f = 0;
    }

    private void readSegmentLength(zj5 zj5Var) throws IOException {
        this.f105288d.reset(2);
        zj5Var.readFully(this.f105288d.getData(), 0, 2);
        this.f105292h = this.f105288d.readUnsignedShort() - 2;
        this.f105290f = 2;
    }

    private void sniffMotionPhotoVideo(zj5 zj5Var) throws IOException {
        if (!zj5Var.peekFully(this.f105288d.getData(), 0, 1, true)) {
            endReadingWithImageTrack();
            return;
        }
        zj5Var.resetPeekPosition();
        if (this.f105297m == null) {
            this.f105297m = new f1b();
        }
        t1g t1gVar = new t1g(zj5Var, this.f105293i);
        this.f105296l = t1gVar;
        if (!this.f105297m.sniff(t1gVar)) {
            endReadingWithImageTrack();
        } else {
            this.f105297m.init(new v1g(this.f105293i, (ck5) u80.checkNotNull(this.f105289e)));
            startReadingMotionPhoto();
        }
    }

    private void startReadingMotionPhoto() {
        outputImageTrack((Metadata.Entry) u80.checkNotNull(this.f105294j));
        this.f105290f = 5;
    }

    @Override // p000.yj5
    public void init(ck5 ck5Var) {
        this.f105289e = ck5Var;
    }

    @Override // p000.yj5
    public int read(zj5 zj5Var, c5d c5dVar) throws IOException {
        int i = this.f105290f;
        if (i == 0) {
            readMarker(zj5Var);
            return 0;
        }
        if (i == 1) {
            readSegmentLength(zj5Var);
            return 0;
        }
        if (i == 2) {
            readSegment(zj5Var);
            return 0;
        }
        if (i == 4) {
            long position = zj5Var.getPosition();
            long j = this.f105293i;
            if (position != j) {
                c5dVar.f15813a = j;
                return 1;
            }
            sniffMotionPhotoVideo(zj5Var);
            return 0;
        }
        if (i != 5) {
            if (i == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f105296l == null || zj5Var != this.f105295k) {
            this.f105295k = zj5Var;
            this.f105296l = new t1g(zj5Var, this.f105293i);
        }
        int i2 = ((f1b) u80.checkNotNull(this.f105297m)).read(this.f105296l, c5dVar);
        if (i2 == 1) {
            c5dVar.f15813a += this.f105293i;
        }
        return i2;
    }

    @Override // p000.yj5
    public void release() {
        f1b f1bVar = this.f105297m;
        if (f1bVar != null) {
            f1bVar.release();
        }
    }

    @Override // p000.yj5
    public void seek(long j, long j2) {
        if (j == 0) {
            this.f105290f = 0;
            this.f105297m = null;
        } else if (this.f105290f == 5) {
            ((f1b) u80.checkNotNull(this.f105297m)).seek(j, j2);
        }
    }

    @Override // p000.yj5
    public boolean sniff(zj5 zj5Var) throws IOException {
        if (peekMarker(zj5Var) != 65496) {
            return false;
        }
        int iPeekMarker = peekMarker(zj5Var);
        this.f105291g = iPeekMarker;
        if (iPeekMarker == 65504) {
            advancePeekPositionToNextSegment(zj5Var);
            this.f105291g = peekMarker(zj5Var);
        }
        if (this.f105291g != 65505) {
            return false;
        }
        zj5Var.advancePeekPosition(2);
        this.f105288d.reset(6);
        zj5Var.peekFully(this.f105288d.getData(), 0, 6);
        return this.f105288d.readUnsignedInt() == f105282u && this.f105288d.readUnsignedShort() == 0;
    }
}
