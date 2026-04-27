package p000;

import android.util.Pair;
import androidx.media3.common.C1213a;
import java.io.IOException;
import org.opencv.videoio.Videoio;
import org.videolan.libvlc.RendererDiscoverer;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ohi implements xj5 {

    /* JADX INFO: renamed from: k */
    public static final String f67657k = "WavExtractor";

    /* JADX INFO: renamed from: l */
    public static final int f67658l = 10;

    /* JADX INFO: renamed from: m */
    public static final ik5 f67659m = new ik5() { // from class: nhi
        @Override // p000.ik5
        public final xj5[] createExtractors() {
            return ohi.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: n */
    public static final int f67660n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f67661o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f67662p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f67663q = 3;

    /* JADX INFO: renamed from: r */
    public static final int f67664r = 4;

    /* JADX INFO: renamed from: d */
    public bk5 f67665d;

    /* JADX INFO: renamed from: e */
    public q6h f67666e;

    /* JADX INFO: renamed from: h */
    public InterfaceC10384b f67669h;

    /* JADX INFO: renamed from: f */
    public int f67667f = 0;

    /* JADX INFO: renamed from: g */
    public long f67668g = -1;

    /* JADX INFO: renamed from: i */
    public int f67670i = -1;

    /* JADX INFO: renamed from: j */
    public long f67671j = -1;

    /* JADX INFO: renamed from: ohi$a */
    public static final class C10383a implements InterfaceC10384b {

        /* JADX INFO: renamed from: m */
        public static final int[] f67672m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n */
        public static final int[] f67673n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, nb2.f63864l, 253, 279, 307, 337, 371, 408, Videoio.CAP_PROP_XI_WB_KG, Videoio.CAP_PROP_XI_CC_MATRIX_33, Videoio.CAP_PROP_XI_TRG_DELAY, 598, 658, 724, 796, 876, 963, 1060, 1166, RendererDiscoverer.Event.ItemAdded, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a */
        public final bk5 f67674a;

        /* JADX INFO: renamed from: b */
        public final q6h f67675b;

        /* JADX INFO: renamed from: c */
        public final rhi f67676c;

        /* JADX INFO: renamed from: d */
        public final int f67677d;

        /* JADX INFO: renamed from: e */
        public final byte[] f67678e;

        /* JADX INFO: renamed from: f */
        public final jhc f67679f;

        /* JADX INFO: renamed from: g */
        public final int f67680g;

        /* JADX INFO: renamed from: h */
        public final C1213a f67681h;

        /* JADX INFO: renamed from: i */
        public int f67682i;

        /* JADX INFO: renamed from: j */
        public long f67683j;

        /* JADX INFO: renamed from: k */
        public int f67684k;

        /* JADX INFO: renamed from: l */
        public long f67685l;

        public C10383a(bk5 bk5Var, q6h q6hVar, rhi rhiVar) throws yhc {
            this.f67674a = bk5Var;
            this.f67675b = q6hVar;
            this.f67676c = rhiVar;
            int iMax = Math.max(1, rhiVar.f78351c / 10);
            this.f67680g = iMax;
            jhc jhcVar = new jhc(rhiVar.f78355g);
            jhcVar.readLittleEndianUnsignedShort();
            int littleEndianUnsignedShort = jhcVar.readLittleEndianUnsignedShort();
            this.f67677d = littleEndianUnsignedShort;
            int i = rhiVar.f78350b;
            int i2 = (((rhiVar.f78353e - (i * 4)) * 8) / (rhiVar.f78354f * i)) + 1;
            if (littleEndianUnsignedShort == i2) {
                int iCeilDivide = t0i.ceilDivide(iMax, littleEndianUnsignedShort);
                this.f67678e = new byte[rhiVar.f78353e * iCeilDivide];
                this.f67679f = new jhc(iCeilDivide * numOutputFramesToBytes(littleEndianUnsignedShort, i));
                int i3 = ((rhiVar.f78351c * rhiVar.f78353e) * 8) / littleEndianUnsignedShort;
                this.f67681h = new C1213a.b().setSampleMimeType("audio/raw").setAverageBitrate(i3).setPeakBitrate(i3).setMaxInputSize(numOutputFramesToBytes(iMax, i)).setChannelCount(rhiVar.f78350b).setSampleRate(rhiVar.f78351c).setPcmEncoding(2).build();
                return;
            }
            throw yhc.createForMalformedContainer("Expected frames per block: " + i2 + "; got: " + littleEndianUnsignedShort, null);
        }

        private void decode(byte[] bArr, int i, jhc jhcVar) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.f67676c.f78350b; i3++) {
                    decodeBlockForChannel(bArr, i2, i3, jhcVar.getData());
                }
            }
            int iNumOutputFramesToBytes = numOutputFramesToBytes(this.f67677d * i);
            jhcVar.setPosition(0);
            jhcVar.setLimit(iNumOutputFramesToBytes);
        }

        private void decodeBlockForChannel(byte[] bArr, int i, int i2, byte[] bArr2) {
            rhi rhiVar = this.f67676c;
            int i3 = rhiVar.f78353e;
            int i4 = rhiVar.f78350b;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int iConstrainValue = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int iMin = Math.min(bArr[i5 + 2] & 255, 88);
            int i8 = f67673n[iMin];
            int i9 = ((i * this.f67677d * i4) + i2) * 2;
            bArr2[i9] = (byte) (iConstrainValue & 255);
            bArr2[i9 + 1] = (byte) (iConstrainValue >> 8);
            for (int i10 = 0; i10 < i7 * 2; i10++) {
                byte b = bArr[((i10 / 8) * i4 * 4) + i6 + ((i10 / 2) % 4)];
                int i11 = i10 % 2 == 0 ? b & 15 : (b & 255) >> 4;
                int i12 = ((((i11 & 7) * 2) + 1) * i8) >> 3;
                if ((i11 & 8) != 0) {
                    i12 = -i12;
                }
                iConstrainValue = t0i.constrainValue(iConstrainValue + i12, -32768, 32767);
                i9 += i4 * 2;
                bArr2[i9] = (byte) (iConstrainValue & 255);
                bArr2[i9 + 1] = (byte) (iConstrainValue >> 8);
                int i13 = iMin + f67672m[i11];
                int[] iArr = f67673n;
                iMin = t0i.constrainValue(i13, 0, iArr.length - 1);
                i8 = iArr[iMin];
            }
        }

        private int numOutputBytesToFrames(int i) {
            return i / (this.f67676c.f78350b * 2);
        }

        private int numOutputFramesToBytes(int i) {
            return numOutputFramesToBytes(i, this.f67676c.f78350b);
        }

        private void writeSampleMetadata(int i) {
            long jScaleLargeTimestamp = this.f67683j + t0i.scaleLargeTimestamp(this.f67685l, 1000000L, this.f67676c.f78351c);
            int iNumOutputFramesToBytes = numOutputFramesToBytes(i);
            this.f67675b.sampleMetadata(jScaleLargeTimestamp, 1, iNumOutputFramesToBytes, this.f67684k - iNumOutputFramesToBytes, null);
            this.f67685l += (long) i;
            this.f67684k -= iNumOutputFramesToBytes;
        }

        @Override // p000.ohi.InterfaceC10384b
        public void init(int i, long j) {
            vhi vhiVar = new vhi(this.f67676c, this.f67677d, i, j);
            this.f67674a.seekMap(vhiVar);
            this.f67675b.format(this.f67681h);
            this.f67675b.durationUs(vhiVar.getDurationUs());
        }

        @Override // p000.ohi.InterfaceC10384b
        public void reset(long j) {
            this.f67682i = 0;
            this.f67683j = j;
            this.f67684k = 0;
            this.f67685l = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        @Override // p000.ohi.InterfaceC10384b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean sampleData(p000.ak5 r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f67680g
                int r1 = r6.f67684k
                int r1 = r6.numOutputBytesToFrames(r1)
                int r0 = r0 - r1
                int r1 = r6.f67677d
                int r0 = p000.t0i.ceilDivide(r0, r1)
                rhi r1 = r6.f67676c
                int r1 = r1.f78353e
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
                int r3 = r6.f67682i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f67678e
                int r5 = r6.f67682i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f67682i
                int r4 = r4 + r3
                r6.f67682i = r4
                goto L1e
            L3e:
                int r7 = r6.f67682i
                rhi r8 = r6.f67676c
                int r8 = r8.f78353e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f67678e
                jhc r9 = r6.f67679f
                r6.decode(r8, r7, r9)
                int r8 = r6.f67682i
                rhi r9 = r6.f67676c
                int r9 = r9.f78353e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f67682i = r8
                jhc r7 = r6.f67679f
                int r7 = r7.limit()
                q6h r8 = r6.f67675b
                jhc r9 = r6.f67679f
                r8.sampleData(r9, r7)
                int r8 = r6.f67684k
                int r8 = r8 + r7
                r6.f67684k = r8
                int r7 = r6.numOutputBytesToFrames(r8)
                int r8 = r6.f67680g
                if (r7 < r8) goto L75
                r6.writeSampleMetadata(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f67684k
                int r7 = r6.numOutputBytesToFrames(r7)
                if (r7 <= 0) goto L82
                r6.writeSampleMetadata(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ohi.C10383a.sampleData(ak5, long):boolean");
        }

        private static int numOutputFramesToBytes(int i, int i2) {
            return i * 2 * i2;
        }
    }

    /* JADX INFO: renamed from: ohi$b */
    public interface InterfaceC10384b {
        void init(int i, long j) throws yhc;

        void reset(long j);

        boolean sampleData(ak5 ak5Var, long j) throws IOException;
    }

    /* JADX INFO: renamed from: ohi$c */
    public static final class C10385c implements InterfaceC10384b {

        /* JADX INFO: renamed from: a */
        public final bk5 f67686a;

        /* JADX INFO: renamed from: b */
        public final q6h f67687b;

        /* JADX INFO: renamed from: c */
        public final rhi f67688c;

        /* JADX INFO: renamed from: d */
        public final C1213a f67689d;

        /* JADX INFO: renamed from: e */
        public final int f67690e;

        /* JADX INFO: renamed from: f */
        public long f67691f;

        /* JADX INFO: renamed from: g */
        public int f67692g;

        /* JADX INFO: renamed from: h */
        public long f67693h;

        public C10385c(bk5 bk5Var, q6h q6hVar, rhi rhiVar, String str, int i) throws yhc {
            this.f67686a = bk5Var;
            this.f67687b = q6hVar;
            this.f67688c = rhiVar;
            int i2 = (rhiVar.f78350b * rhiVar.f78354f) / 8;
            if (rhiVar.f78353e == i2) {
                int i3 = rhiVar.f78351c;
                int i4 = i3 * i2 * 8;
                int iMax = Math.max(i2, (i3 * i2) / 10);
                this.f67690e = iMax;
                this.f67689d = new C1213a.b().setContainerMimeType("audio/wav").setSampleMimeType(str).setAverageBitrate(i4).setPeakBitrate(i4).setMaxInputSize(iMax).setChannelCount(rhiVar.f78350b).setSampleRate(rhiVar.f78351c).setPcmEncoding(i).build();
                return;
            }
            throw yhc.createForMalformedContainer("Expected block size: " + i2 + "; got: " + rhiVar.f78353e, null);
        }

        @Override // p000.ohi.InterfaceC10384b
        public void init(int i, long j) {
            vhi vhiVar = new vhi(this.f67688c, 1, i, j);
            this.f67686a.seekMap(vhiVar);
            this.f67687b.format(this.f67689d);
            this.f67687b.durationUs(vhiVar.getDurationUs());
        }

        @Override // p000.ohi.InterfaceC10384b
        public void reset(long j) {
            this.f67691f = j;
            this.f67692g = 0;
            this.f67693h = 0L;
        }

        @Override // p000.ohi.InterfaceC10384b
        public boolean sampleData(ak5 ak5Var, long j) throws IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.f67692g) < (i2 = this.f67690e)) {
                int iSampleData = this.f67687b.sampleData((bh3) ak5Var, (int) Math.min(i2 - i, j2), true);
                if (iSampleData == -1) {
                    j2 = 0;
                } else {
                    this.f67692g += iSampleData;
                    j2 -= (long) iSampleData;
                }
            }
            int i3 = this.f67688c.f78353e;
            int i4 = this.f67692g / i3;
            if (i4 > 0) {
                long jScaleLargeTimestamp = this.f67691f + t0i.scaleLargeTimestamp(this.f67693h, 1000000L, r1.f78351c);
                int i5 = i4 * i3;
                int i6 = this.f67692g - i5;
                this.f67687b.sampleMetadata(jScaleLargeTimestamp, 1, i5, i6, null);
                this.f67693h += (long) i4;
                this.f67692g = i6;
            }
            return j2 <= 0;
        }
    }

    @z25({"extractorOutput", "trackOutput"})
    private void assertInitialized() {
        v80.checkStateNotNull(this.f67666e);
        t0i.castNonNull(this.f67665d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$static$0() {
        return new xj5[]{new ohi()};
    }

    private void readFileType(ak5 ak5Var) throws IOException {
        v80.checkState(ak5Var.getPosition() == 0);
        int i = this.f67670i;
        if (i != -1) {
            ak5Var.skipFully(i);
            this.f67667f = 4;
        } else {
            if (!shi.checkFileType(ak5Var)) {
                throw yhc.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
            }
            ak5Var.skipFully((int) (ak5Var.getPeekPosition() - ak5Var.getPosition()));
            this.f67667f = 1;
        }
    }

    @g5e({"extractorOutput", "trackOutput"})
    private void readFormat(ak5 ak5Var) throws IOException {
        rhi format = shi.readFormat(ak5Var);
        int i = format.f78349a;
        if (i == 17) {
            this.f67669h = new C10383a(this.f67665d, this.f67666e, format);
        } else if (i == 6) {
            this.f67669h = new C10385c(this.f67665d, this.f67666e, format, "audio/g711-alaw", -1);
        } else if (i == 7) {
            this.f67669h = new C10385c(this.f67665d, this.f67666e, format, "audio/g711-mlaw", -1);
        } else {
            int pcmEncodingForType = xhi.getPcmEncodingForType(i, format.f78354f);
            if (pcmEncodingForType == 0) {
                throw yhc.createForUnsupportedContainerFeature("Unsupported WAV format type: " + format.f78349a);
            }
            this.f67669h = new C10385c(this.f67665d, this.f67666e, format, "audio/raw", pcmEncodingForType);
        }
        this.f67667f = 3;
    }

    private void readRf64SampleDataSize(ak5 ak5Var) throws IOException {
        this.f67668g = shi.readRf64SampleDataSize(ak5Var);
        this.f67667f = 2;
    }

    private int readSampleData(ak5 ak5Var) throws IOException {
        v80.checkState(this.f67671j != -1);
        return ((InterfaceC10384b) v80.checkNotNull(this.f67669h)).sampleData(ak5Var, this.f67671j - ak5Var.getPosition()) ? -1 : 0;
    }

    private void skipToSampleData(ak5 ak5Var) throws IOException {
        Pair<Long, Long> pairSkipToSampleData = shi.skipToSampleData(ak5Var);
        this.f67670i = ((Long) pairSkipToSampleData.first).intValue();
        long jLongValue = ((Long) pairSkipToSampleData.second).longValue();
        long j = this.f67668g;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        this.f67671j = ((long) this.f67670i) + jLongValue;
        long length = ak5Var.getLength();
        if (length != -1 && this.f67671j > length) {
            xh9.m25148w("WavExtractor", "Data exceeds input length: " + this.f67671j + ", " + length);
            this.f67671j = length;
        }
        ((InterfaceC10384b) v80.checkNotNull(this.f67669h)).init(this.f67670i, this.f67671j);
        this.f67667f = 4;
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f67665d = bk5Var;
        this.f67666e = bk5Var.track(0, 1);
        bk5Var.endTracks();
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        assertInitialized();
        int i = this.f67667f;
        if (i == 0) {
            readFileType(ak5Var);
            return 0;
        }
        if (i == 1) {
            readRf64SampleDataSize(ak5Var);
            return 0;
        }
        if (i == 2) {
            readFormat(ak5Var);
            return 0;
        }
        if (i == 3) {
            skipToSampleData(ak5Var);
            return 0;
        }
        if (i == 4) {
            return readSampleData(ak5Var);
        }
        throw new IllegalStateException();
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        this.f67667f = j == 0 ? 0 : 4;
        InterfaceC10384b interfaceC10384b = this.f67669h;
        if (interfaceC10384b != null) {
            interfaceC10384b.reset(j2);
        }
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        return shi.checkFileType(ak5Var);
    }
}
