package p000;

import java.io.IOException;
import java.util.ArrayList;
import p000.hue;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class wm0 implements yj5 {

    /* JADX INFO: renamed from: A */
    public static final int f94675A = 1263424842;

    /* JADX INFO: renamed from: B */
    public static final int f94676B = 1718776947;

    /* JADX INFO: renamed from: C */
    public static final int f94677C = 1852994675;

    /* JADX INFO: renamed from: D */
    public static final int f94678D = 1752331379;

    /* JADX INFO: renamed from: E */
    public static final int f94679E = 1935963489;

    /* JADX INFO: renamed from: F */
    public static final int f94680F = 1937012852;

    /* JADX INFO: renamed from: G */
    public static final int f94681G = 1935960438;

    /* JADX INFO: renamed from: H */
    public static final int f94682H = 0;

    /* JADX INFO: renamed from: I */
    public static final int f94683I = 1;

    /* JADX INFO: renamed from: J */
    public static final int f94684J = 2;

    /* JADX INFO: renamed from: K */
    public static final int f94685K = 3;

    /* JADX INFO: renamed from: L */
    public static final int f94686L = 4;

    /* JADX INFO: renamed from: M */
    public static final int f94687M = 5;

    /* JADX INFO: renamed from: N */
    public static final int f94688N = 6;

    /* JADX INFO: renamed from: O */
    public static final int f94689O = 16;

    /* JADX INFO: renamed from: P */
    public static final long f94690P = 262144;

    /* JADX INFO: renamed from: r */
    public static final String f94691r = "AviExtractor";

    /* JADX INFO: renamed from: s */
    public static final int f94692s = 1179011410;

    /* JADX INFO: renamed from: t */
    public static final int f94693t = 541677121;

    /* JADX INFO: renamed from: u */
    public static final int f94694u = 1414744396;

    /* JADX INFO: renamed from: v */
    public static final int f94695v = 1751742049;

    /* JADX INFO: renamed from: w */
    public static final int f94696w = 1819436136;

    /* JADX INFO: renamed from: x */
    public static final int f94697x = 1819440243;

    /* JADX INFO: renamed from: y */
    public static final int f94698y = 1769369453;

    /* JADX INFO: renamed from: z */
    public static final int f94699z = 829973609;

    /* JADX INFO: renamed from: f */
    public int f94702f;

    /* JADX INFO: renamed from: h */
    public xm0 f94704h;

    /* JADX INFO: renamed from: k */
    public long f94707k;

    /* JADX INFO: renamed from: l */
    @hib
    public oz1 f94708l;

    /* JADX INFO: renamed from: p */
    public int f94712p;

    /* JADX INFO: renamed from: q */
    public boolean f94713q;

    /* JADX INFO: renamed from: d */
    public final ihc f94700d = new ihc(12);

    /* JADX INFO: renamed from: e */
    public final C14680c f94701e = new C14680c();

    /* JADX INFO: renamed from: g */
    public ck5 f94703g = new qs4();

    /* JADX INFO: renamed from: j */
    public oz1[] f94706j = new oz1[0];

    /* JADX INFO: renamed from: n */
    public long f94710n = -1;

    /* JADX INFO: renamed from: o */
    public long f94711o = -1;

    /* JADX INFO: renamed from: m */
    public int f94709m = -1;

    /* JADX INFO: renamed from: i */
    public long f94705i = -9223372036854775807L;

    /* JADX INFO: renamed from: wm0$b */
    public class C14679b implements hue {

        /* JADX INFO: renamed from: d */
        public final long f94714d;

        public C14679b(long j) {
            this.f94714d = j;
        }

        @Override // p000.hue
        public long getDurationUs() {
            return this.f94714d;
        }

        @Override // p000.hue
        public hue.C7023a getSeekPoints(long j) {
            hue.C7023a seekPoints = wm0.this.f94706j[0].getSeekPoints(j);
            for (int i = 1; i < wm0.this.f94706j.length; i++) {
                hue.C7023a seekPoints2 = wm0.this.f94706j[i].getSeekPoints(j);
                if (seekPoints2.f44907a.f55385b < seekPoints.f44907a.f55385b) {
                    seekPoints = seekPoints2;
                }
            }
            return seekPoints;
        }

        @Override // p000.hue
        public boolean isSeekable() {
            return true;
        }
    }

    /* JADX INFO: renamed from: wm0$c */
    public static class C14680c {

        /* JADX INFO: renamed from: a */
        public int f94716a;

        /* JADX INFO: renamed from: b */
        public int f94717b;

        /* JADX INFO: renamed from: c */
        public int f94718c;

        private C14680c() {
        }

        public void populateFrom(ihc ihcVar) {
            this.f94716a = ihcVar.readLittleEndianInt();
            this.f94717b = ihcVar.readLittleEndianInt();
            this.f94718c = 0;
        }

        public void populateWithListHeaderFrom(ihc ihcVar) throws xhc {
            populateFrom(ihcVar);
            if (this.f94716a == 1414744396) {
                this.f94718c = ihcVar.readLittleEndianInt();
                return;
            }
            throw xhc.createForMalformedContainer("LIST expected, found: " + this.f94716a, null);
        }
    }

    private static void alignInputToEvenPosition(zj5 zj5Var) throws IOException {
        if ((zj5Var.getPosition() & 1) == 1) {
            zj5Var.skipFully(1);
        }
    }

    @hib
    private oz1 getChunkReader(int i) {
        for (oz1 oz1Var : this.f94706j) {
            if (oz1Var.handlesChunkId(i)) {
                return oz1Var;
            }
        }
        return null;
    }

    private void parseHdrlBody(ihc ihcVar) throws IOException {
        l89 from = l89.parseFrom(1819436136, ihcVar);
        if (from.getType() != 1819436136) {
            throw xhc.createForMalformedContainer("Unexpected header list type " + from.getType(), null);
        }
        xm0 xm0Var = (xm0) from.getChild(xm0.class);
        if (xm0Var == null) {
            throw xhc.createForMalformedContainer("AviHeader not found", null);
        }
        this.f94704h = xm0Var;
        this.f94705i = ((long) xm0Var.f98488c) * ((long) xm0Var.f98486a);
        ArrayList arrayList = new ArrayList();
        quh<tm0> it = from.f56771a.iterator();
        int i = 0;
        while (it.hasNext()) {
            tm0 next = it.next();
            if (next.getType() == 1819440243) {
                int i2 = i + 1;
                oz1 oz1VarProcessStreamList = processStreamList((l89) next, i);
                if (oz1VarProcessStreamList != null) {
                    arrayList.add(oz1VarProcessStreamList);
                }
                i = i2;
            }
        }
        this.f94706j = (oz1[]) arrayList.toArray(new oz1[0]);
        this.f94703g.endTracks();
    }

    private void parseIdx1Body(ihc ihcVar) {
        long jPeekSeekOffset = peekSeekOffset(ihcVar);
        while (ihcVar.bytesLeft() >= 16) {
            int littleEndianInt = ihcVar.readLittleEndianInt();
            int littleEndianInt2 = ihcVar.readLittleEndianInt();
            long littleEndianInt3 = ((long) ihcVar.readLittleEndianInt()) + jPeekSeekOffset;
            ihcVar.readLittleEndianInt();
            oz1 chunkReader = getChunkReader(littleEndianInt);
            if (chunkReader != null) {
                if ((littleEndianInt2 & 16) == 16) {
                    chunkReader.appendKeyFrameToIndex(littleEndianInt3);
                }
                chunkReader.incrementIndexChunkCount();
            }
        }
        for (oz1 oz1Var : this.f94706j) {
            oz1Var.compactIndex();
        }
        this.f94713q = true;
        this.f94703g.seekMap(new C14679b(this.f94705i));
    }

    private long peekSeekOffset(ihc ihcVar) {
        if (ihcVar.bytesLeft() < 16) {
            return 0L;
        }
        int position = ihcVar.getPosition();
        ihcVar.skipBytes(8);
        long littleEndianInt = ihcVar.readLittleEndianInt();
        long j = this.f94710n;
        long j2 = littleEndianInt <= j ? j + 8 : 0L;
        ihcVar.setPosition(position);
        return j2;
    }

    @hib
    private oz1 processStreamList(l89 l89Var, int i) {
        zm0 zm0Var = (zm0) l89Var.getChild(zm0.class);
        u5g u5gVar = (u5g) l89Var.getChild(u5g.class);
        if (zm0Var == null) {
            yh9.m25919w("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (u5gVar == null) {
            yh9.m25919w("AviExtractor", "Missing Stream Format");
            return null;
        }
        long durationUs = zm0Var.getDurationUs();
        kq6 kq6Var = u5gVar.f86856a;
        kq6.C8497b c8497bBuildUpon = kq6Var.buildUpon();
        c8497bBuildUpon.setId(i);
        int i2 = zm0Var.f105451f;
        if (i2 != 0) {
            c8497bBuildUpon.setMaxInputSize(i2);
        }
        a6g a6gVar = (a6g) l89Var.getChild(a6g.class);
        if (a6gVar != null) {
            c8497bBuildUpon.setLabel(a6gVar.f512a);
        }
        int trackType = sva.getTrackType(kq6Var.f54989M);
        if (trackType != 1 && trackType != 2) {
            return null;
        }
        r6h r6hVarTrack = this.f94703g.track(i, trackType);
        r6hVarTrack.format(c8497bBuildUpon.build());
        oz1 oz1Var = new oz1(i, trackType, durationUs, zm0Var.f105450e, r6hVarTrack);
        this.f94705i = durationUs;
        return oz1Var;
    }

    private int readMoviChunks(zj5 zj5Var) throws IOException {
        if (zj5Var.getPosition() >= this.f94711o) {
            return -1;
        }
        oz1 oz1Var = this.f94708l;
        if (oz1Var == null) {
            alignInputToEvenPosition(zj5Var);
            zj5Var.peekFully(this.f94700d.getData(), 0, 12);
            this.f94700d.setPosition(0);
            int littleEndianInt = this.f94700d.readLittleEndianInt();
            if (littleEndianInt == 1414744396) {
                this.f94700d.setPosition(8);
                zj5Var.skipFully(this.f94700d.readLittleEndianInt() != 1769369453 ? 8 : 12);
                zj5Var.resetPeekPosition();
                return 0;
            }
            int littleEndianInt2 = this.f94700d.readLittleEndianInt();
            if (littleEndianInt == 1263424842) {
                this.f94707k = zj5Var.getPosition() + ((long) littleEndianInt2) + 8;
                return 0;
            }
            zj5Var.skipFully(8);
            zj5Var.resetPeekPosition();
            oz1 chunkReader = getChunkReader(littleEndianInt);
            if (chunkReader == null) {
                this.f94707k = zj5Var.getPosition() + ((long) littleEndianInt2);
                return 0;
            }
            chunkReader.onChunkStart(littleEndianInt2);
            this.f94708l = chunkReader;
        } else if (oz1Var.onChunkData(zj5Var)) {
            this.f94708l = null;
        }
        return 0;
    }

    private boolean resolvePendingReposition(zj5 zj5Var, c5d c5dVar) throws IOException {
        boolean z;
        if (this.f94707k != -1) {
            long position = zj5Var.getPosition();
            long j = this.f94707k;
            if (j < position || j > 262144 + position) {
                c5dVar.f15813a = j;
                z = true;
            } else {
                zj5Var.skipFully((int) (j - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.f94707k = -1L;
        return z;
    }

    @Override // p000.yj5
    public void init(ck5 ck5Var) {
        this.f94702f = 0;
        this.f94703g = ck5Var;
        this.f94707k = -1L;
    }

    @Override // p000.yj5
    public int read(zj5 zj5Var, c5d c5dVar) throws IOException {
        if (resolvePendingReposition(zj5Var, c5dVar)) {
            return 1;
        }
        switch (this.f94702f) {
            case 0:
                if (!sniff(zj5Var)) {
                    throw xhc.createForMalformedContainer("AVI Header List not found", null);
                }
                zj5Var.skipFully(12);
                this.f94702f = 1;
                return 0;
            case 1:
                zj5Var.readFully(this.f94700d.getData(), 0, 12);
                this.f94700d.setPosition(0);
                this.f94701e.populateWithListHeaderFrom(this.f94700d);
                C14680c c14680c = this.f94701e;
                if (c14680c.f94718c == 1819436136) {
                    this.f94709m = c14680c.f94717b;
                    this.f94702f = 2;
                    return 0;
                }
                throw xhc.createForMalformedContainer("hdrl expected, found: " + this.f94701e.f94718c, null);
            case 2:
                int i = this.f94709m - 4;
                ihc ihcVar = new ihc(i);
                zj5Var.readFully(ihcVar.getData(), 0, i);
                parseHdrlBody(ihcVar);
                this.f94702f = 3;
                return 0;
            case 3:
                if (this.f94710n != -1) {
                    long position = zj5Var.getPosition();
                    long j = this.f94710n;
                    if (position != j) {
                        this.f94707k = j;
                        return 0;
                    }
                }
                zj5Var.peekFully(this.f94700d.getData(), 0, 12);
                zj5Var.resetPeekPosition();
                this.f94700d.setPosition(0);
                this.f94701e.populateFrom(this.f94700d);
                int littleEndianInt = this.f94700d.readLittleEndianInt();
                int i2 = this.f94701e.f94716a;
                if (i2 == 1179011410) {
                    zj5Var.skipFully(12);
                    return 0;
                }
                if (i2 != 1414744396 || littleEndianInt != 1769369453) {
                    this.f94707k = zj5Var.getPosition() + ((long) this.f94701e.f94717b) + 8;
                    return 0;
                }
                long position2 = zj5Var.getPosition();
                this.f94710n = position2;
                this.f94711o = position2 + ((long) this.f94701e.f94717b) + 8;
                if (!this.f94713q) {
                    if (((xm0) u80.checkNotNull(this.f94704h)).hasIndex()) {
                        this.f94702f = 4;
                        this.f94707k = this.f94711o;
                        return 0;
                    }
                    this.f94703g.seekMap(new hue.C7024b(this.f94705i));
                    this.f94713q = true;
                }
                this.f94707k = zj5Var.getPosition() + 12;
                this.f94702f = 6;
                return 0;
            case 4:
                zj5Var.readFully(this.f94700d.getData(), 0, 8);
                this.f94700d.setPosition(0);
                int littleEndianInt2 = this.f94700d.readLittleEndianInt();
                int littleEndianInt3 = this.f94700d.readLittleEndianInt();
                if (littleEndianInt2 == 829973609) {
                    this.f94702f = 5;
                    this.f94712p = littleEndianInt3;
                } else {
                    this.f94707k = zj5Var.getPosition() + ((long) littleEndianInt3);
                }
                return 0;
            case 5:
                ihc ihcVar2 = new ihc(this.f94712p);
                zj5Var.readFully(ihcVar2.getData(), 0, this.f94712p);
                parseIdx1Body(ihcVar2);
                this.f94702f = 6;
                this.f94707k = this.f94710n;
                return 0;
            case 6:
                return readMoviChunks(zj5Var);
            default:
                throw new AssertionError();
        }
    }

    @Override // p000.yj5
    public void release() {
    }

    @Override // p000.yj5
    public void seek(long j, long j2) {
        this.f94707k = -1L;
        this.f94708l = null;
        for (oz1 oz1Var : this.f94706j) {
            oz1Var.seekToPosition(j);
        }
        if (j != 0) {
            this.f94702f = 6;
        } else if (this.f94706j.length == 0) {
            this.f94702f = 0;
        } else {
            this.f94702f = 3;
        }
    }

    @Override // p000.yj5
    public boolean sniff(zj5 zj5Var) throws IOException {
        zj5Var.peekFully(this.f94700d.getData(), 0, 12);
        this.f94700d.setPosition(0);
        if (this.f94700d.readLittleEndianInt() != 1179011410) {
            return false;
        }
        this.f94700d.skipBytes(4);
        return this.f94700d.readLittleEndianInt() == 541677121;
    }
}
