package p000;

import android.util.Pair;
import java.io.IOException;
import org.opencv.videoio.Videoio;
import org.videolan.libvlc.RendererDiscoverer;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class phi implements yj5 {

    /* JADX INFO: renamed from: k */
    public static final String f70846k = "WavExtractor";

    /* JADX INFO: renamed from: l */
    public static final int f70847l = 10;

    /* JADX INFO: renamed from: m */
    public static final hk5 f70848m = new hk5() { // from class: mhi
        @Override // p000.hk5
        public final yj5[] createExtractors() {
            return phi.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: n */
    public static final int f70849n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f70850o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f70851p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f70852q = 3;

    /* JADX INFO: renamed from: r */
    public static final int f70853r = 4;

    /* JADX INFO: renamed from: d */
    public ck5 f70854d;

    /* JADX INFO: renamed from: e */
    public r6h f70855e;

    /* JADX INFO: renamed from: h */
    public InterfaceC10962b f70858h;

    /* JADX INFO: renamed from: f */
    public int f70856f = 0;

    /* JADX INFO: renamed from: g */
    public long f70857g = -1;

    /* JADX INFO: renamed from: i */
    public int f70859i = -1;

    /* JADX INFO: renamed from: j */
    public long f70860j = -1;

    /* JADX INFO: renamed from: phi$a */
    public static final class C10961a implements InterfaceC10962b {

        /* JADX INFO: renamed from: m */
        public static final int[] f70861m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n */
        public static final int[] f70862n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, nb2.f63864l, 253, 279, 307, 337, 371, 408, Videoio.CAP_PROP_XI_WB_KG, Videoio.CAP_PROP_XI_CC_MATRIX_33, Videoio.CAP_PROP_XI_TRG_DELAY, 598, 658, 724, 796, 876, 963, 1060, 1166, RendererDiscoverer.Event.ItemAdded, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a */
        public final ck5 f70863a;

        /* JADX INFO: renamed from: b */
        public final r6h f70864b;

        /* JADX INFO: renamed from: c */
        public final qhi f70865c;

        /* JADX INFO: renamed from: d */
        public final int f70866d;

        /* JADX INFO: renamed from: e */
        public final byte[] f70867e;

        /* JADX INFO: renamed from: f */
        public final ihc f70868f;

        /* JADX INFO: renamed from: g */
        public final int f70869g;

        /* JADX INFO: renamed from: h */
        public final kq6 f70870h;

        /* JADX INFO: renamed from: i */
        public int f70871i;

        /* JADX INFO: renamed from: j */
        public long f70872j;

        /* JADX INFO: renamed from: k */
        public int f70873k;

        /* JADX INFO: renamed from: l */
        public long f70874l;

        public C10961a(ck5 ck5Var, r6h r6hVar, qhi qhiVar) throws xhc {
            this.f70863a = ck5Var;
            this.f70864b = r6hVar;
            this.f70865c = qhiVar;
            int iMax = Math.max(1, qhiVar.f74475c / 10);
            this.f70869g = iMax;
            ihc ihcVar = new ihc(qhiVar.f74479g);
            ihcVar.readLittleEndianUnsignedShort();
            int littleEndianUnsignedShort = ihcVar.readLittleEndianUnsignedShort();
            this.f70866d = littleEndianUnsignedShort;
            int i = qhiVar.f74474b;
            int i2 = (((qhiVar.f74477e - (i * 4)) * 8) / (qhiVar.f74478f * i)) + 1;
            if (littleEndianUnsignedShort == i2) {
                int iCeilDivide = x0i.ceilDivide(iMax, littleEndianUnsignedShort);
                this.f70867e = new byte[qhiVar.f74477e * iCeilDivide];
                this.f70868f = new ihc(iCeilDivide * numOutputFramesToBytes(littleEndianUnsignedShort, i));
                int i3 = ((qhiVar.f74475c * qhiVar.f74477e) * 8) / littleEndianUnsignedShort;
                this.f70870h = new kq6.C8497b().setSampleMimeType("audio/raw").setAverageBitrate(i3).setPeakBitrate(i3).setMaxInputSize(numOutputFramesToBytes(iMax, i)).setChannelCount(qhiVar.f74474b).setSampleRate(qhiVar.f74475c).setPcmEncoding(2).build();
                return;
            }
            throw xhc.createForMalformedContainer("Expected frames per block: " + i2 + "; got: " + littleEndianUnsignedShort, null);
        }

        private void decode(byte[] bArr, int i, ihc ihcVar) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.f70865c.f74474b; i3++) {
                    decodeBlockForChannel(bArr, i2, i3, ihcVar.getData());
                }
            }
            int iNumOutputFramesToBytes = numOutputFramesToBytes(this.f70866d * i);
            ihcVar.setPosition(0);
            ihcVar.setLimit(iNumOutputFramesToBytes);
        }

        private void decodeBlockForChannel(byte[] bArr, int i, int i2, byte[] bArr2) {
            qhi qhiVar = this.f70865c;
            int i3 = qhiVar.f74477e;
            int i4 = qhiVar.f74474b;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int iConstrainValue = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int iMin = Math.min(bArr[i5 + 2] & 255, 88);
            int i8 = f70862n[iMin];
            int i9 = ((i * this.f70866d * i4) + i2) * 2;
            bArr2[i9] = (byte) (iConstrainValue & 255);
            bArr2[i9 + 1] = (byte) (iConstrainValue >> 8);
            for (int i10 = 0; i10 < i7 * 2; i10++) {
                byte b = bArr[((i10 / 8) * i4 * 4) + i6 + ((i10 / 2) % 4)];
                int i11 = i10 % 2 == 0 ? b & 15 : (b & 255) >> 4;
                int i12 = ((((i11 & 7) * 2) + 1) * i8) >> 3;
                if ((i11 & 8) != 0) {
                    i12 = -i12;
                }
                iConstrainValue = x0i.constrainValue(iConstrainValue + i12, -32768, 32767);
                i9 += i4 * 2;
                bArr2[i9] = (byte) (iConstrainValue & 255);
                bArr2[i9 + 1] = (byte) (iConstrainValue >> 8);
                int i13 = iMin + f70861m[i11];
                int[] iArr = f70862n;
                iMin = x0i.constrainValue(i13, 0, iArr.length - 1);
                i8 = iArr[iMin];
            }
        }

        private int numOutputBytesToFrames(int i) {
            return i / (this.f70865c.f74474b * 2);
        }

        private int numOutputFramesToBytes(int i) {
            return numOutputFramesToBytes(i, this.f70865c.f74474b);
        }

        private void writeSampleMetadata(int i) {
            long jScaleLargeTimestamp = this.f70872j + x0i.scaleLargeTimestamp(this.f70874l, 1000000L, this.f70865c.f74475c);
            int iNumOutputFramesToBytes = numOutputFramesToBytes(i);
            this.f70864b.sampleMetadata(jScaleLargeTimestamp, 1, iNumOutputFramesToBytes, this.f70873k - iNumOutputFramesToBytes, null);
            this.f70874l += (long) i;
            this.f70873k -= iNumOutputFramesToBytes;
        }

        @Override // p000.phi.InterfaceC10962b
        public void init(int i, long j) {
            this.f70863a.seekMap(new uhi(this.f70865c, this.f70866d, i, j));
            this.f70864b.format(this.f70870h);
        }

        @Override // p000.phi.InterfaceC10962b
        public void reset(long j) {
            this.f70871i = 0;
            this.f70872j = j;
            this.f70873k = 0;
            this.f70874l = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        @Override // p000.phi.InterfaceC10962b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean sampleData(p000.zj5 r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f70869g
                int r1 = r6.f70873k
                int r1 = r6.numOutputBytesToFrames(r1)
                int r0 = r0 - r1
                int r1 = r6.f70866d
                int r0 = p000.x0i.ceilDivide(r0, r1)
                qhi r1 = r6.f70865c
                int r1 = r1.f74477e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f70871i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f70867e
                int r5 = r6.f70871i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f70871i
                int r4 = r4 + r3
                r6.f70871i = r4
                goto L1e
            L3e:
                int r7 = r6.f70871i
                qhi r8 = r6.f70865c
                int r8 = r8.f74477e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f70867e
                ihc r9 = r6.f70868f
                r6.decode(r8, r7, r9)
                int r8 = r6.f70871i
                qhi r9 = r6.f70865c
                int r9 = r9.f74477e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f70871i = r8
                ihc r7 = r6.f70868f
                int r7 = r7.limit()
                r6h r8 = r6.f70864b
                ihc r9 = r6.f70868f
                r8.sampleData(r9, r7)
                int r8 = r6.f70873k
                int r8 = r8 + r7
                r6.f70873k = r8
                int r7 = r6.numOutputBytesToFrames(r8)
                int r8 = r6.f70869g
                if (r7 < r8) goto L75
                r6.writeSampleMetadata(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f70873k
                int r7 = r6.numOutputBytesToFrames(r7)
                if (r7 <= 0) goto L82
                r6.writeSampleMetadata(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.phi.C10961a.sampleData(zj5, long):boolean");
        }

        private static int numOutputFramesToBytes(int i, int i2) {
            return i * 2 * i2;
        }
    }

    /* JADX INFO: renamed from: phi$b */
    public interface InterfaceC10962b {
        void init(int i, long j) throws xhc;

        void reset(long j);

        boolean sampleData(zj5 zj5Var, long j) throws IOException;
    }

    /* JADX INFO: renamed from: phi$c */
    public static final class C10963c implements InterfaceC10962b {

        /* JADX INFO: renamed from: a */
        public final ck5 f70875a;

        /* JADX INFO: renamed from: b */
        public final r6h f70876b;

        /* JADX INFO: renamed from: c */
        public final qhi f70877c;

        /* JADX INFO: renamed from: d */
        public final kq6 f70878d;

        /* JADX INFO: renamed from: e */
        public final int f70879e;

        /* JADX INFO: renamed from: f */
        public long f70880f;

        /* JADX INFO: renamed from: g */
        public int f70881g;

        /* JADX INFO: renamed from: h */
        public long f70882h;

        public C10963c(ck5 ck5Var, r6h r6hVar, qhi qhiVar, String str, int i) throws xhc {
            this.f70875a = ck5Var;
            this.f70876b = r6hVar;
            this.f70877c = qhiVar;
            int i2 = (qhiVar.f74474b * qhiVar.f74478f) / 8;
            if (qhiVar.f74477e == i2) {
                int i3 = qhiVar.f74475c;
                int i4 = i3 * i2 * 8;
                int iMax = Math.max(i2, (i3 * i2) / 10);
                this.f70879e = iMax;
                this.f70878d = new kq6.C8497b().setSampleMimeType(str).setAverageBitrate(i4).setPeakBitrate(i4).setMaxInputSize(iMax).setChannelCount(qhiVar.f74474b).setSampleRate(qhiVar.f74475c).setPcmEncoding(i).build();
                return;
            }
            throw xhc.createForMalformedContainer("Expected block size: " + i2 + "; got: " + qhiVar.f74477e, null);
        }

        @Override // p000.phi.InterfaceC10962b
        public void init(int i, long j) {
            this.f70875a.seekMap(new uhi(this.f70877c, 1, i, j));
            this.f70876b.format(this.f70878d);
        }

        @Override // p000.phi.InterfaceC10962b
        public void reset(long j) {
            this.f70880f = j;
            this.f70881g = 0;
            this.f70882h = 0L;
        }

        @Override // p000.phi.InterfaceC10962b
        public boolean sampleData(zj5 zj5Var, long j) throws IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.f70881g) < (i2 = this.f70879e)) {
                int iSampleData = this.f70876b.sampleData((ah3) zj5Var, (int) Math.min(i2 - i, j2), true);
                if (iSampleData == -1) {
                    j2 = 0;
                } else {
                    this.f70881g += iSampleData;
                    j2 -= (long) iSampleData;
                }
            }
            int i3 = this.f70877c.f74477e;
            int i4 = this.f70881g / i3;
            if (i4 > 0) {
                long jScaleLargeTimestamp = this.f70880f + x0i.scaleLargeTimestamp(this.f70882h, 1000000L, r1.f74475c);
                int i5 = i4 * i3;
                int i6 = this.f70881g - i5;
                this.f70876b.sampleMetadata(jScaleLargeTimestamp, 1, i5, i6, null);
                this.f70882h += (long) i4;
                this.f70881g = i6;
            }
            return j2 <= 0;
        }
    }

    @z25({"extractorOutput", "trackOutput"})
    private void assertInitialized() {
        u80.checkStateNotNull(this.f70855e);
        x0i.castNonNull(this.f70854d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yj5[] lambda$static$0() {
        return new yj5[]{new phi()};
    }

    private void readFileType(zj5 zj5Var) throws IOException {
        u80.checkState(zj5Var.getPosition() == 0);
        int i = this.f70859i;
        if (i != -1) {
            zj5Var.skipFully(i);
            this.f70856f = 4;
        } else {
            if (!thi.checkFileType(zj5Var)) {
                throw xhc.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
            }
            zj5Var.skipFully((int) (zj5Var.getPeekPosition() - zj5Var.getPosition()));
            this.f70856f = 1;
        }
    }

    @g5e({"extractorOutput", "trackOutput"})
    private void readFormat(zj5 zj5Var) throws IOException {
        qhi format = thi.readFormat(zj5Var);
        int i = format.f74473a;
        if (i == 17) {
            this.f70858h = new C10961a(this.f70854d, this.f70855e, format);
        } else if (i == 6) {
            this.f70858h = new C10963c(this.f70854d, this.f70855e, format, "audio/g711-alaw", -1);
        } else if (i == 7) {
            this.f70858h = new C10963c(this.f70854d, this.f70855e, format, "audio/g711-mlaw", -1);
        } else {
            int pcmEncodingForType = whi.getPcmEncodingForType(i, format.f74478f);
            if (pcmEncodingForType == 0) {
                throw xhc.createForUnsupportedContainerFeature("Unsupported WAV format type: " + format.f74473a);
            }
            this.f70858h = new C10963c(this.f70854d, this.f70855e, format, "audio/raw", pcmEncodingForType);
        }
        this.f70856f = 3;
    }

    private void readRf64SampleDataSize(zj5 zj5Var) throws IOException {
        this.f70857g = thi.readRf64SampleDataSize(zj5Var);
        this.f70856f = 2;
    }

    private int readSampleData(zj5 zj5Var) throws IOException {
        u80.checkState(this.f70860j != -1);
        return ((InterfaceC10962b) u80.checkNotNull(this.f70858h)).sampleData(zj5Var, this.f70860j - zj5Var.getPosition()) ? -1 : 0;
    }

    private void skipToSampleData(zj5 zj5Var) throws IOException {
        Pair<Long, Long> pairSkipToSampleData = thi.skipToSampleData(zj5Var);
        this.f70859i = ((Long) pairSkipToSampleData.first).intValue();
        long jLongValue = ((Long) pairSkipToSampleData.second).longValue();
        long j = this.f70857g;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        this.f70860j = ((long) this.f70859i) + jLongValue;
        long length = zj5Var.getLength();
        if (length != -1 && this.f70860j > length) {
            yh9.m25919w("WavExtractor", "Data exceeds input length: " + this.f70860j + ", " + length);
            this.f70860j = length;
        }
        ((InterfaceC10962b) u80.checkNotNull(this.f70858h)).init(this.f70859i, this.f70860j);
        this.f70856f = 4;
    }

    @Override // p000.yj5
    public void init(ck5 ck5Var) {
        this.f70854d = ck5Var;
        this.f70855e = ck5Var.track(0, 1);
        ck5Var.endTracks();
    }

    @Override // p000.yj5
    public int read(zj5 zj5Var, c5d c5dVar) throws IOException {
        assertInitialized();
        int i = this.f70856f;
        if (i == 0) {
            readFileType(zj5Var);
            return 0;
        }
        if (i == 1) {
            readRf64SampleDataSize(zj5Var);
            return 0;
        }
        if (i == 2) {
            readFormat(zj5Var);
            return 0;
        }
        if (i == 3) {
            skipToSampleData(zj5Var);
            return 0;
        }
        if (i == 4) {
            return readSampleData(zj5Var);
        }
        throw new IllegalStateException();
    }

    @Override // p000.yj5
    public void release() {
    }

    @Override // p000.yj5
    public void seek(long j, long j2) {
        this.f70856f = j == 0 ? 0 : 4;
        InterfaceC10962b interfaceC10962b = this.f70858h;
        if (interfaceC10962b != null) {
            interfaceC10962b.reset(j2);
        }
    }

    @Override // p000.yj5
    public boolean sniff(zj5 zj5Var) throws IOException {
        return thi.checkFileType(zj5Var);
    }
}
