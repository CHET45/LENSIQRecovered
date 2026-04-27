package p000;

import androidx.media3.common.C1213a;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import p000.ar7;
import p000.eta;
import p000.nue;
import p000.o1b;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class r0b implements xj5 {

    /* JADX INFO: renamed from: A */
    public static final int f76686A = 2;

    /* JADX INFO: renamed from: B */
    public static final int f76687B = 4;

    /* JADX INFO: renamed from: C */
    public static final int f76688C = 8;

    /* JADX INFO: renamed from: D */
    public static final String f76689D = "Mp3Extractor";

    /* JADX INFO: renamed from: F */
    public static final int f76691F = 131072;

    /* JADX INFO: renamed from: G */
    public static final int f76692G = 32768;

    /* JADX INFO: renamed from: H */
    public static final int f76693H = 10;

    /* JADX INFO: renamed from: I */
    public static final int f76694I = -128000;

    /* JADX INFO: renamed from: J */
    public static final int f76695J = 1483304551;

    /* JADX INFO: renamed from: K */
    public static final int f76696K = 1231971951;

    /* JADX INFO: renamed from: L */
    public static final int f76697L = 1447187017;

    /* JADX INFO: renamed from: M */
    public static final int f76698M = 0;

    /* JADX INFO: renamed from: z */
    public static final int f76700z = 1;

    /* JADX INFO: renamed from: d */
    public final int f76701d;

    /* JADX INFO: renamed from: e */
    public final long f76702e;

    /* JADX INFO: renamed from: f */
    public final jhc f76703f;

    /* JADX INFO: renamed from: g */
    public final o1b.C10138a f76704g;

    /* JADX INFO: renamed from: h */
    public final o27 f76705h;

    /* JADX INFO: renamed from: i */
    public final er7 f76706i;

    /* JADX INFO: renamed from: j */
    public final q6h f76707j;

    /* JADX INFO: renamed from: k */
    public bk5 f76708k;

    /* JADX INFO: renamed from: l */
    public q6h f76709l;

    /* JADX INFO: renamed from: m */
    public q6h f76710m;

    /* JADX INFO: renamed from: n */
    public int f76711n;

    /* JADX INFO: renamed from: o */
    @hib
    public eta f76712o;

    /* JADX INFO: renamed from: p */
    public long f76713p;

    /* JADX INFO: renamed from: q */
    public long f76714q;

    /* JADX INFO: renamed from: r */
    public long f76715r;

    /* JADX INFO: renamed from: s */
    public long f76716s;

    /* JADX INFO: renamed from: t */
    public int f76717t;

    /* JADX INFO: renamed from: u */
    public nue f76718u;

    /* JADX INFO: renamed from: v */
    public boolean f76719v;

    /* JADX INFO: renamed from: w */
    public boolean f76720w;

    /* JADX INFO: renamed from: x */
    public long f76721x;

    /* JADX INFO: renamed from: y */
    public static final ik5 f76699y = new ik5() { // from class: o0b
        @Override // p000.ik5
        public final xj5[] createExtractors() {
            return r0b.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: E */
    public static final ar7.InterfaceC1575a f76690E = new ar7.InterfaceC1575a() { // from class: q0b
        @Override // p000.ar7.InterfaceC1575a
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return r0b.lambda$static$1(i, i2, i3, i4, i5);
        }
    };

    /* JADX INFO: renamed from: r0b$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC11836a {
    }

    public r0b() {
        this(0);
    }

    @z25({"extractorOutput", "realTrackOutput"})
    private void assertInitialized() {
        v80.checkStateNotNull(this.f76709l);
        t0i.castNonNull(this.f76708k);
    }

    @g5e({"realTrackOutput"})
    private nue computeSeeker(ak5 ak5Var) throws IOException {
        long id3TlenUs;
        long j;
        long dataEndPosition;
        nue nueVarMaybeReadSeekFrame = maybeReadSeekFrame(ak5Var);
        rwa rwaVarMaybeHandleSeekMetadata = maybeHandleSeekMetadata(this.f76712o, ak5Var.getPosition());
        if (this.f76719v) {
            return new nue.C10066a();
        }
        if ((this.f76701d & 4) != 0) {
            if (rwaVarMaybeHandleSeekMetadata != null) {
                id3TlenUs = rwaVarMaybeHandleSeekMetadata.getDurationUs();
                dataEndPosition = rwaVarMaybeHandleSeekMetadata.getDataEndPosition();
            } else if (nueVarMaybeReadSeekFrame != null) {
                id3TlenUs = nueVarMaybeReadSeekFrame.getDurationUs();
                dataEndPosition = nueVarMaybeReadSeekFrame.getDataEndPosition();
            } else {
                id3TlenUs = getId3TlenUs(this.f76712o);
                j = -1;
                nueVarMaybeReadSeekFrame = new n08(id3TlenUs, ak5Var.getPosition(), j);
            }
            j = dataEndPosition;
            nueVarMaybeReadSeekFrame = new n08(id3TlenUs, ak5Var.getPosition(), j);
        } else if (rwaVarMaybeHandleSeekMetadata != null) {
            nueVarMaybeReadSeekFrame = rwaVarMaybeHandleSeekMetadata;
        } else if (nueVarMaybeReadSeekFrame == null) {
            nueVarMaybeReadSeekFrame = null;
        }
        if (nueVarMaybeReadSeekFrame != null && shouldFallbackToConstantBitrateSeeking(nueVarMaybeReadSeekFrame) && nueVarMaybeReadSeekFrame.getDurationUs() != -9223372036854775807L && (nueVarMaybeReadSeekFrame.getDataEndPosition() != -1 || ak5Var.getLength() != -1)) {
            long dataStartPosition = nueVarMaybeReadSeekFrame.getDataStartPosition() != -1 ? nueVarMaybeReadSeekFrame.getDataStartPosition() : 0L;
            long dataEndPosition2 = nueVarMaybeReadSeekFrame.getDataEndPosition() != -1 ? nueVarMaybeReadSeekFrame.getDataEndPosition() : ak5Var.getLength();
            nueVarMaybeReadSeekFrame = new ut2(dataEndPosition2, dataStartPosition, rd8.saturatedCast(t0i.scaleLargeValue(dataEndPosition2 - dataStartPosition, 8000000L, nueVarMaybeReadSeekFrame.getDurationUs(), RoundingMode.HALF_UP)), -1, false);
        } else if (nueVarMaybeReadSeekFrame == null || shouldFallbackToConstantBitrateSeeking(nueVarMaybeReadSeekFrame)) {
            nueVarMaybeReadSeekFrame = getConstantBitrateSeeker(ak5Var, (this.f76701d & 2) != 0);
        }
        this.f76709l.durationUs(nueVarMaybeReadSeekFrame.getDurationUs());
        return nueVarMaybeReadSeekFrame;
    }

    private long computeTimeUs(long j) {
        return this.f76713p + ((j * 1000000) / ((long) this.f76704g.f66224d));
    }

    private nue getConstantBitrateSeeker(ak5 ak5Var, boolean z) throws IOException {
        ak5Var.peekFully(this.f76703f.getData(), 0, 4);
        this.f76703f.setPosition(0);
        this.f76704g.setForHeaderData(this.f76703f.readInt());
        return new ut2(ak5Var.getLength(), ak5Var.getPosition(), this.f76704g, z);
    }

    private static long getId3TlenUs(@hib eta etaVar) {
        if (etaVar == null) {
            return -9223372036854775807L;
        }
        int length = etaVar.length();
        for (int i = 0; i < length; i++) {
            eta.InterfaceC5464a interfaceC5464a = etaVar.get(i);
            if (interfaceC5464a instanceof ptg) {
                ptg ptgVar = (ptg) interfaceC5464a;
                if (ptgVar.f27130a.equals("TLEN")) {
                    return t0i.msToUs(Long.parseLong(ptgVar.f72008d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int getSeekFrameHeader(jhc jhcVar, int i) {
        if (jhcVar.limit() >= i + 4) {
            jhcVar.setPosition(i);
            int i2 = jhcVar.readInt();
            if (i2 == 1483304551 || i2 == 1231971951) {
                return i2;
            }
        }
        if (jhcVar.limit() < 40) {
            return 0;
        }
        jhcVar.setPosition(36);
        return jhcVar.readInt() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean headersMatch(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$static$0() {
        return new xj5[]{new r0b()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$1(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    @hib
    private static rwa maybeHandleSeekMetadata(@hib eta etaVar, long j) {
        if (etaVar == null) {
            return null;
        }
        int length = etaVar.length();
        for (int i = 0; i < length; i++) {
            eta.InterfaceC5464a interfaceC5464a = etaVar.get(i);
            if (interfaceC5464a instanceof pwa) {
                return rwa.create(j, (pwa) interfaceC5464a, getId3TlenUs(etaVar));
            }
        }
        return null;
    }

    @hib
    private nue maybeReadSeekFrame(ak5 ak5Var) throws IOException {
        int i;
        int i2;
        jhc jhcVar = new jhc(this.f76704g.f66223c);
        ak5Var.peekFully(jhcVar.getData(), 0, this.f76704g.f66223c);
        o1b.C10138a c10138a = this.f76704g;
        int i3 = 21;
        if ((c10138a.f66221a & 1) != 0) {
            if (c10138a.f66225e != 1) {
                i3 = 36;
            }
        } else if (c10138a.f66225e == 1) {
            i3 = 13;
        }
        int seekFrameHeader = getSeekFrameHeader(jhcVar, i3);
        if (seekFrameHeader != 1231971951) {
            if (seekFrameHeader == 1447187017) {
                a3i a3iVarCreate = a3i.create(ak5Var.getLength(), ak5Var.getPosition(), this.f76704g, jhcVar);
                ak5Var.skipFully(this.f76704g.f66223c);
                return a3iVarCreate;
            }
            if (seekFrameHeader != 1483304551) {
                ak5Var.resetPeekPosition();
                return null;
            }
        }
        wsi wsiVar = wsi.parse(this.f76704g, jhcVar);
        if (!this.f76705h.hasGaplessInfo() && (i = wsiVar.f95462d) != -1 && (i2 = wsiVar.f95463e) != -1) {
            o27 o27Var = this.f76705h;
            o27Var.f66276a = i;
            o27Var.f66277b = i2;
        }
        long position = ak5Var.getPosition();
        if (ak5Var.getLength() != -1 && wsiVar.f95461c != -1 && ak5Var.getLength() != wsiVar.f95461c + position) {
            xh9.m25146i(f76689D, "Data size mismatch between stream (" + ak5Var.getLength() + ") and Xing frame (" + (wsiVar.f95461c + position) + "), using Xing value.");
        }
        ak5Var.skipFully(this.f76704g.f66223c);
        return seekFrameHeader == 1483304551 ? ysi.create(wsiVar, position) : getConstantBitrateSeeker(position, wsiVar, ak5Var.getLength());
    }

    private void maybeUpdateCbrDurationToLastSample() {
        nue nueVar = this.f76718u;
        if ((nueVar instanceof ut2) && nueVar.isSeekable()) {
            long j = this.f76716s;
            if (j == -1 || j == this.f76718u.getDataEndPosition()) {
                return;
            }
            this.f76718u = ((ut2) this.f76718u).copyWithNewDataEndPosition(this.f76716s);
            ((bk5) v80.checkNotNull(this.f76708k)).seekMap(this.f76718u);
            ((q6h) v80.checkNotNull(this.f76709l)).durationUs(this.f76718u.getDurationUs());
        }
    }

    private boolean peekEndOfStreamOrHeader(ak5 ak5Var) throws IOException {
        nue nueVar = this.f76718u;
        if (nueVar != null) {
            long dataEndPosition = nueVar.getDataEndPosition();
            if (dataEndPosition != -1 && ak5Var.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !ak5Var.peekFully(this.f76703f.getData(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @g5e({"extractorOutput", "realTrackOutput"})
    private int readInternal(ak5 ak5Var) throws IOException {
        if (this.f76711n == 0) {
            try {
                synchronize(ak5Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f76718u == null) {
            nue nueVarComputeSeeker = computeSeeker(ak5Var);
            this.f76718u = nueVarComputeSeeker;
            this.f76708k.seekMap(nueVarComputeSeeker);
            C1213a.b metadata = new C1213a.b().setContainerMimeType("audio/mpeg").setSampleMimeType(this.f76704g.f66222b).setMaxInputSize(4096).setChannelCount(this.f76704g.f66225e).setSampleRate(this.f76704g.f66224d).setEncoderDelay(this.f76705h.f66276a).setEncoderPadding(this.f76705h.f66277b).setMetadata((this.f76701d & 8) != 0 ? null : this.f76712o);
            if (this.f76718u.getAverageBitrate() != -2147483647) {
                metadata.setAverageBitrate(this.f76718u.getAverageBitrate());
            }
            this.f76710m.format(metadata.build());
            this.f76715r = ak5Var.getPosition();
        } else if (this.f76715r != 0) {
            long position = ak5Var.getPosition();
            long j = this.f76715r;
            if (position < j) {
                ak5Var.skipFully((int) (j - position));
            }
        }
        return readSample(ak5Var);
    }

    @g5e({"realTrackOutput", "seeker"})
    private int readSample(ak5 ak5Var) throws IOException {
        if (this.f76717t == 0) {
            ak5Var.resetPeekPosition();
            if (peekEndOfStreamOrHeader(ak5Var)) {
                return -1;
            }
            this.f76703f.setPosition(0);
            int i = this.f76703f.readInt();
            if (!headersMatch(i, this.f76711n) || o1b.getFrameSize(i) == -1) {
                ak5Var.skipFully(1);
                this.f76711n = 0;
                return 0;
            }
            this.f76704g.setForHeaderData(i);
            if (this.f76713p == -9223372036854775807L) {
                this.f76713p = this.f76718u.getTimeUs(ak5Var.getPosition());
                if (this.f76702e != -9223372036854775807L) {
                    this.f76713p += this.f76702e - this.f76718u.getTimeUs(0L);
                }
            }
            this.f76717t = this.f76704g.f66223c;
            long position = ak5Var.getPosition();
            o1b.C10138a c10138a = this.f76704g;
            this.f76716s = position + ((long) c10138a.f66223c);
            nue nueVar = this.f76718u;
            if (nueVar instanceof n08) {
                n08 n08Var = (n08) nueVar;
                n08Var.maybeAddSeekPoint(computeTimeUs(this.f76714q + ((long) c10138a.f66227g)), this.f76716s);
                if (this.f76720w && n08Var.isTimeUsInIndex(this.f76721x)) {
                    this.f76720w = false;
                    this.f76710m = this.f76709l;
                }
            }
        }
        int iSampleData = this.f76710m.sampleData((bh3) ak5Var, this.f76717t, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i2 = this.f76717t - iSampleData;
        this.f76717t = i2;
        if (i2 > 0) {
            return 0;
        }
        this.f76710m.sampleMetadata(computeTimeUs(this.f76714q), 1, this.f76704g.f66223c, 0, null);
        this.f76714q += (long) this.f76704g.f66227g;
        this.f76717t = 0;
        return 0;
    }

    private boolean shouldFallbackToConstantBitrateSeeking(nue nueVar) {
        return (nueVar.isSeekable() || (this.f76701d & 1) == 0) ? false : true;
    }

    private boolean synchronize(ak5 ak5Var, boolean z) throws IOException {
        int peekPosition;
        int i;
        int frameSize;
        int i2 = z ? 32768 : 131072;
        ak5Var.resetPeekPosition();
        if (ak5Var.getPosition() == 0) {
            eta etaVarPeekId3Data = this.f76706i.peekId3Data(ak5Var, (this.f76701d & 8) == 0 ? null : f76690E);
            this.f76712o = etaVarPeekId3Data;
            if (etaVarPeekId3Data != null) {
                this.f76705h.setFromMetadata(etaVarPeekId3Data);
            }
            peekPosition = (int) ak5Var.getPeekPosition();
            if (!z) {
                ak5Var.skipFully(peekPosition);
            }
            i = 0;
        } else {
            peekPosition = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (!peekEndOfStreamOrHeader(ak5Var)) {
                this.f76703f.setPosition(0);
                int i5 = this.f76703f.readInt();
                if ((i == 0 || headersMatch(i5, i)) && (frameSize = o1b.getFrameSize(i5)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.f76704g.setForHeaderData(i5);
                        i = i5;
                    }
                    ak5Var.advancePeekPosition(frameSize - 4);
                } else {
                    int i6 = i4 + 1;
                    if (i4 == i2) {
                        if (z) {
                            return false;
                        }
                        maybeUpdateCbrDurationToLastSample();
                        throw new EOFException();
                    }
                    if (z) {
                        ak5Var.resetPeekPosition();
                        ak5Var.advancePeekPosition(peekPosition + i6);
                    } else {
                        ak5Var.skipFully(1);
                    }
                    i3 = 0;
                    i4 = i6;
                    i = 0;
                }
            } else if (i3 <= 0) {
                maybeUpdateCbrDurationToLastSample();
                throw new EOFException();
            }
        }
        if (z) {
            ak5Var.skipFully(peekPosition + i4);
        } else {
            ak5Var.resetPeekPosition();
        }
        this.f76711n = i;
        return true;
    }

    public void disableSeeking() {
        this.f76719v = true;
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f76708k = bk5Var;
        q6h q6hVarTrack = bk5Var.track(0, 1);
        this.f76709l = q6hVarTrack;
        this.f76710m = q6hVarTrack;
        this.f76708k.endTracks();
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        assertInitialized();
        int internal = readInternal(ak5Var);
        if (internal == -1 && (this.f76718u instanceof n08)) {
            long jComputeTimeUs = computeTimeUs(this.f76714q);
            if (this.f76718u.getDurationUs() != jComputeTimeUs) {
                ((n08) this.f76718u).m17690a(jComputeTimeUs);
                this.f76708k.seekMap(this.f76718u);
                this.f76709l.durationUs(this.f76718u.getDurationUs());
            }
        }
        return internal;
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        this.f76711n = 0;
        this.f76713p = -9223372036854775807L;
        this.f76714q = 0L;
        this.f76717t = 0;
        this.f76721x = j2;
        nue nueVar = this.f76718u;
        if (!(nueVar instanceof n08) || ((n08) nueVar).isTimeUsInIndex(j2)) {
            return;
        }
        this.f76720w = true;
        this.f76710m = this.f76707j;
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        return synchronize(ak5Var, true);
    }

    public r0b(int i) {
        this(i, -9223372036854775807L);
    }

    public r0b(int i, long j) {
        this.f76701d = (i & 2) != 0 ? i | 1 : i;
        this.f76702e = j;
        this.f76703f = new jhc(10);
        this.f76704g = new o1b.C10138a();
        this.f76705h = new o27();
        this.f76713p = -9223372036854775807L;
        this.f76706i = new er7();
        yd4 yd4Var = new yd4();
        this.f76707j = yd4Var;
        this.f76710m = yd4Var;
        this.f76716s = -1L;
    }

    @hib
    private nue getConstantBitrateSeeker(long j, wsi wsiVar, long j2) {
        long j3;
        long j4;
        long jComputeDurationUs = wsiVar.computeDurationUs();
        if (jComputeDurationUs == -9223372036854775807L) {
            return null;
        }
        long j5 = wsiVar.f95461c;
        if (j5 != -1) {
            long j6 = j + j5;
            j3 = j5 - ((long) wsiVar.f95459a.f66223c);
            j4 = j6;
        } else {
            if (j2 == -1) {
                return null;
            }
            j3 = (j2 - j) - ((long) wsiVar.f95459a.f66223c);
            j4 = j2;
        }
        long j7 = j3;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new ut2(j4, j + ((long) wsiVar.f95459a.f66223c), rd8.checkedCast(t0i.scaleLargeValue(j7, 8000000L, jComputeDurationUs, roundingMode)), rd8.checkedCast(nl9.divide(j7, wsiVar.f95460b, roundingMode)), false);
    }
}
