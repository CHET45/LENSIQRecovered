package p000;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.br7;
import p000.kq6;
import p000.oue;
import p000.p1b;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class s0b implements yj5 {

    /* JADX INFO: renamed from: A */
    public static final int f80279A = 4;

    /* JADX INFO: renamed from: B */
    public static final int f80280B = 8;

    /* JADX INFO: renamed from: D */
    public static final int f80282D = 131072;

    /* JADX INFO: renamed from: E */
    public static final int f80283E = 32768;

    /* JADX INFO: renamed from: F */
    public static final int f80284F = 10;

    /* JADX INFO: renamed from: G */
    public static final int f80285G = -128000;

    /* JADX INFO: renamed from: H */
    public static final int f80286H = 1483304551;

    /* JADX INFO: renamed from: I */
    public static final int f80287I = 1231971951;

    /* JADX INFO: renamed from: J */
    public static final int f80288J = 1447187017;

    /* JADX INFO: renamed from: K */
    public static final int f80289K = 0;

    /* JADX INFO: renamed from: y */
    public static final int f80291y = 1;

    /* JADX INFO: renamed from: z */
    public static final int f80292z = 2;

    /* JADX INFO: renamed from: d */
    public final int f80293d;

    /* JADX INFO: renamed from: e */
    public final long f80294e;

    /* JADX INFO: renamed from: f */
    public final ihc f80295f;

    /* JADX INFO: renamed from: g */
    public final p1b.C10751a f80296g;

    /* JADX INFO: renamed from: h */
    public final n27 f80297h;

    /* JADX INFO: renamed from: i */
    public final dr7 f80298i;

    /* JADX INFO: renamed from: j */
    public final r6h f80299j;

    /* JADX INFO: renamed from: k */
    public ck5 f80300k;

    /* JADX INFO: renamed from: l */
    public r6h f80301l;

    /* JADX INFO: renamed from: m */
    public r6h f80302m;

    /* JADX INFO: renamed from: n */
    public int f80303n;

    /* JADX INFO: renamed from: o */
    @hib
    public Metadata f80304o;

    /* JADX INFO: renamed from: p */
    public long f80305p;

    /* JADX INFO: renamed from: q */
    public long f80306q;

    /* JADX INFO: renamed from: r */
    public long f80307r;

    /* JADX INFO: renamed from: s */
    public int f80308s;

    /* JADX INFO: renamed from: t */
    public oue f80309t;

    /* JADX INFO: renamed from: u */
    public boolean f80310u;

    /* JADX INFO: renamed from: v */
    public boolean f80311v;

    /* JADX INFO: renamed from: w */
    public long f80312w;

    /* JADX INFO: renamed from: x */
    public static final hk5 f80290x = new hk5() { // from class: n0b
        @Override // p000.hk5
        public final yj5[] createExtractors() {
            return s0b.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: C */
    public static final br7.InterfaceC2019a f80281C = new br7.InterfaceC2019a() { // from class: p0b
        @Override // p000.br7.InterfaceC2019a
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return s0b.lambda$static$1(i, i2, i3, i4, i5);
        }
    };

    /* JADX INFO: renamed from: s0b$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC12386a {
    }

    public s0b() {
        this(0);
    }

    @z25({"extractorOutput", "realTrackOutput"})
    private void assertInitialized() {
        u80.checkStateNotNull(this.f80301l);
        x0i.castNonNull(this.f80300k);
    }

    private oue computeSeeker(zj5 zj5Var) throws IOException {
        long id3TlenUs;
        long dataEndPosition;
        oue oueVarMaybeReadSeekFrame = maybeReadSeekFrame(zj5Var);
        qwa qwaVarMaybeHandleSeekMetadata = maybeHandleSeekMetadata(this.f80304o, zj5Var.getPosition());
        if (this.f80310u) {
            return new oue.C10660a();
        }
        if ((this.f80293d & 4) != 0) {
            if (qwaVarMaybeHandleSeekMetadata != null) {
                id3TlenUs = qwaVarMaybeHandleSeekMetadata.getDurationUs();
                dataEndPosition = qwaVarMaybeHandleSeekMetadata.getDataEndPosition();
            } else if (oueVarMaybeReadSeekFrame != null) {
                id3TlenUs = oueVarMaybeReadSeekFrame.getDurationUs();
                dataEndPosition = oueVarMaybeReadSeekFrame.getDataEndPosition();
            } else {
                id3TlenUs = getId3TlenUs(this.f80304o);
                dataEndPosition = -1;
            }
            oueVarMaybeReadSeekFrame = new m08(id3TlenUs, zj5Var.getPosition(), dataEndPosition);
        } else if (qwaVarMaybeHandleSeekMetadata != null) {
            oueVarMaybeReadSeekFrame = qwaVarMaybeHandleSeekMetadata;
        } else if (oueVarMaybeReadSeekFrame == null) {
            oueVarMaybeReadSeekFrame = null;
        }
        if (oueVarMaybeReadSeekFrame == null || !(oueVarMaybeReadSeekFrame.isSeekable() || (this.f80293d & 1) == 0)) {
            return getConstantBitrateSeeker(zj5Var, (this.f80293d & 2) != 0);
        }
        return oueVarMaybeReadSeekFrame;
    }

    private long computeTimeUs(long j) {
        return this.f80305p + ((j * 1000000) / ((long) this.f80296g.f69423d));
    }

    private oue getConstantBitrateSeeker(zj5 zj5Var, boolean z) throws IOException {
        zj5Var.peekFully(this.f80295f.getData(), 0, 4);
        this.f80295f.setPosition(0);
        this.f80296g.setForHeaderData(this.f80295f.readInt());
        return new tt2(zj5Var.getLength(), zj5Var.getPosition(), this.f80296g, z);
    }

    private static long getId3TlenUs(@hib Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        int length = metadata.length();
        for (int i = 0; i < length; i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                if (textInformationFrame.f19640a.equals("TLEN")) {
                    return x0i.msToUs(Long.parseLong(textInformationFrame.f19656d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int getSeekFrameHeader(ihc ihcVar, int i) {
        if (ihcVar.limit() >= i + 4) {
            ihcVar.setPosition(i);
            int i2 = ihcVar.readInt();
            if (i2 == 1483304551 || i2 == 1231971951) {
                return i2;
            }
        }
        if (ihcVar.limit() < 40) {
            return 0;
        }
        ihcVar.setPosition(36);
        return ihcVar.readInt() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean headersMatch(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yj5[] lambda$static$0() {
        return new yj5[]{new s0b()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$1(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    @hib
    private static qwa maybeHandleSeekMetadata(@hib Metadata metadata, long j) {
        if (metadata == null) {
            return null;
        }
        int length = metadata.length();
        for (int i = 0; i < length; i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof MlltFrame) {
                return qwa.create(j, (MlltFrame) entry, getId3TlenUs(metadata));
            }
        }
        return null;
    }

    @hib
    private oue maybeReadSeekFrame(zj5 zj5Var) throws IOException {
        ihc ihcVar = new ihc(this.f80296g.f69422c);
        zj5Var.peekFully(ihcVar.getData(), 0, this.f80296g.f69422c);
        p1b.C10751a c10751a = this.f80296g;
        int i = 21;
        if ((c10751a.f69420a & 1) != 0) {
            if (c10751a.f69424e != 1) {
                i = 36;
            }
        } else if (c10751a.f69424e == 1) {
            i = 13;
        }
        int i2 = i;
        int seekFrameHeader = getSeekFrameHeader(ihcVar, i2);
        if (seekFrameHeader != 1483304551 && seekFrameHeader != 1231971951) {
            if (seekFrameHeader != 1447187017) {
                zj5Var.resetPeekPosition();
                return null;
            }
            z2i z2iVarCreate = z2i.create(zj5Var.getLength(), zj5Var.getPosition(), this.f80296g, ihcVar);
            zj5Var.skipFully(this.f80296g.f69422c);
            return z2iVarCreate;
        }
        xsi xsiVarCreate = xsi.create(zj5Var.getLength(), zj5Var.getPosition(), this.f80296g, ihcVar);
        if (xsiVarCreate != null && !this.f80297h.hasGaplessInfo()) {
            zj5Var.resetPeekPosition();
            zj5Var.advancePeekPosition(i2 + 141);
            zj5Var.peekFully(this.f80295f.getData(), 0, 3);
            this.f80295f.setPosition(0);
            this.f80297h.setFromXingHeaderValue(this.f80295f.readUnsignedInt24());
        }
        zj5Var.skipFully(this.f80296g.f69422c);
        return (xsiVarCreate == null || xsiVarCreate.isSeekable() || seekFrameHeader != 1231971951) ? xsiVarCreate : getConstantBitrateSeeker(zj5Var, false);
    }

    private boolean peekEndOfStreamOrHeader(zj5 zj5Var) throws IOException {
        oue oueVar = this.f80309t;
        if (oueVar != null) {
            long dataEndPosition = oueVar.getDataEndPosition();
            if (dataEndPosition != -1 && zj5Var.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !zj5Var.peekFully(this.f80295f.getData(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @g5e({"extractorOutput", "realTrackOutput"})
    private int readInternal(zj5 zj5Var) throws IOException {
        if (this.f80303n == 0) {
            try {
                synchronize(zj5Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f80309t == null) {
            oue oueVarComputeSeeker = computeSeeker(zj5Var);
            this.f80309t = oueVarComputeSeeker;
            this.f80300k.seekMap(oueVarComputeSeeker);
            this.f80302m.format(new kq6.C8497b().setSampleMimeType(this.f80296g.f69421b).setMaxInputSize(4096).setChannelCount(this.f80296g.f69424e).setSampleRate(this.f80296g.f69423d).setEncoderDelay(this.f80297h.f63053a).setEncoderPadding(this.f80297h.f63054b).setMetadata((this.f80293d & 8) != 0 ? null : this.f80304o).build());
            this.f80307r = zj5Var.getPosition();
        } else if (this.f80307r != 0) {
            long position = zj5Var.getPosition();
            long j = this.f80307r;
            if (position < j) {
                zj5Var.skipFully((int) (j - position));
            }
        }
        return readSample(zj5Var);
    }

    @g5e({"realTrackOutput", "seeker"})
    private int readSample(zj5 zj5Var) throws IOException {
        if (this.f80308s == 0) {
            zj5Var.resetPeekPosition();
            if (peekEndOfStreamOrHeader(zj5Var)) {
                return -1;
            }
            this.f80295f.setPosition(0);
            int i = this.f80295f.readInt();
            if (!headersMatch(i, this.f80303n) || p1b.getFrameSize(i) == -1) {
                zj5Var.skipFully(1);
                this.f80303n = 0;
                return 0;
            }
            this.f80296g.setForHeaderData(i);
            if (this.f80305p == -9223372036854775807L) {
                this.f80305p = this.f80309t.getTimeUs(zj5Var.getPosition());
                if (this.f80294e != -9223372036854775807L) {
                    this.f80305p += this.f80294e - this.f80309t.getTimeUs(0L);
                }
            }
            p1b.C10751a c10751a = this.f80296g;
            this.f80308s = c10751a.f69422c;
            oue oueVar = this.f80309t;
            if (oueVar instanceof m08) {
                m08 m08Var = (m08) oueVar;
                m08Var.maybeAddSeekPoint(computeTimeUs(this.f80306q + ((long) c10751a.f69426g)), zj5Var.getPosition() + ((long) this.f80296g.f69422c));
                if (this.f80311v && m08Var.isTimeUsInIndex(this.f80312w)) {
                    this.f80311v = false;
                    this.f80302m = this.f80301l;
                }
            }
        }
        int iSampleData = this.f80302m.sampleData((ah3) zj5Var, this.f80308s, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i2 = this.f80308s - iSampleData;
        this.f80308s = i2;
        if (i2 > 0) {
            return 0;
        }
        this.f80302m.sampleMetadata(computeTimeUs(this.f80306q), 1, this.f80296g.f69422c, 0, null);
        this.f80306q += (long) this.f80296g.f69426g;
        this.f80308s = 0;
        return 0;
    }

    private boolean synchronize(zj5 zj5Var, boolean z) throws IOException {
        int peekPosition;
        int i;
        int frameSize;
        int i2 = z ? 32768 : 131072;
        zj5Var.resetPeekPosition();
        if (zj5Var.getPosition() == 0) {
            Metadata metadataPeekId3Data = this.f80298i.peekId3Data(zj5Var, (this.f80293d & 8) == 0 ? null : f80281C);
            this.f80304o = metadataPeekId3Data;
            if (metadataPeekId3Data != null) {
                this.f80297h.setFromMetadata(metadataPeekId3Data);
            }
            peekPosition = (int) zj5Var.getPeekPosition();
            if (!z) {
                zj5Var.skipFully(peekPosition);
            }
            i = 0;
        } else {
            peekPosition = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (!peekEndOfStreamOrHeader(zj5Var)) {
                this.f80295f.setPosition(0);
                int i5 = this.f80295f.readInt();
                if ((i == 0 || headersMatch(i5, i)) && (frameSize = p1b.getFrameSize(i5)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.f80296g.setForHeaderData(i5);
                        i = i5;
                    }
                    zj5Var.advancePeekPosition(frameSize - 4);
                } else {
                    int i6 = i4 + 1;
                    if (i4 == i2) {
                        if (z) {
                            return false;
                        }
                        throw xhc.createForMalformedContainer("Searched too many bytes.", null);
                    }
                    if (z) {
                        zj5Var.resetPeekPosition();
                        zj5Var.advancePeekPosition(peekPosition + i6);
                    } else {
                        zj5Var.skipFully(1);
                    }
                    i3 = 0;
                    i4 = i6;
                    i = 0;
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            zj5Var.skipFully(peekPosition + i4);
        } else {
            zj5Var.resetPeekPosition();
        }
        this.f80303n = i;
        return true;
    }

    public void disableSeeking() {
        this.f80310u = true;
    }

    @Override // p000.yj5
    public void init(ck5 ck5Var) {
        this.f80300k = ck5Var;
        r6h r6hVarTrack = ck5Var.track(0, 1);
        this.f80301l = r6hVarTrack;
        this.f80302m = r6hVarTrack;
        this.f80300k.endTracks();
    }

    @Override // p000.yj5
    public int read(zj5 zj5Var, c5d c5dVar) throws IOException {
        assertInitialized();
        int internal = readInternal(zj5Var);
        if (internal == -1 && (this.f80309t instanceof m08)) {
            long jComputeTimeUs = computeTimeUs(this.f80306q);
            if (this.f80309t.getDurationUs() != jComputeTimeUs) {
                ((m08) this.f80309t).m16541a(jComputeTimeUs);
                this.f80300k.seekMap(this.f80309t);
            }
        }
        return internal;
    }

    @Override // p000.yj5
    public void release() {
    }

    @Override // p000.yj5
    public void seek(long j, long j2) {
        this.f80303n = 0;
        this.f80305p = -9223372036854775807L;
        this.f80306q = 0L;
        this.f80308s = 0;
        this.f80312w = j2;
        oue oueVar = this.f80309t;
        if (!(oueVar instanceof m08) || ((m08) oueVar).isTimeUsInIndex(j2)) {
            return;
        }
        this.f80311v = true;
        this.f80302m = this.f80299j;
    }

    @Override // p000.yj5
    public boolean sniff(zj5 zj5Var) throws IOException {
        return synchronize(zj5Var, true);
    }

    public s0b(int i) {
        this(i, -9223372036854775807L);
    }

    public s0b(int i, long j) {
        this.f80293d = (i & 2) != 0 ? i | 1 : i;
        this.f80294e = j;
        this.f80295f = new ihc(10);
        this.f80296g = new p1b.C10751a();
        this.f80297h = new n27();
        this.f80305p = -9223372036854775807L;
        this.f80298i = new dr7();
        ts4 ts4Var = new ts4();
        this.f80299j = ts4Var;
        this.f80302m = ts4Var;
    }
}
