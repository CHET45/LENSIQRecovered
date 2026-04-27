package p000;

import java.nio.ByteBuffer;
import p000.hf0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class pcf extends mq0 {

    /* JADX INFO: renamed from: A */
    public static final long f70342A = 2000000;

    /* JADX INFO: renamed from: B */
    @Deprecated
    public static final long f70343B = 20000;

    /* JADX INFO: renamed from: C */
    public static final int f70344C = 0;

    /* JADX INFO: renamed from: D */
    public static final int f70345D = 1;

    /* JADX INFO: renamed from: E */
    public static final int f70346E = 0;

    /* JADX INFO: renamed from: F */
    public static final int f70347F = 1;

    /* JADX INFO: renamed from: G */
    public static final int f70348G = 2;

    /* JADX INFO: renamed from: H */
    public static final int f70349H = 3;

    /* JADX INFO: renamed from: I */
    public static final int f70350I = 1000;

    /* JADX INFO: renamed from: w */
    public static final float f70351w = 0.2f;

    /* JADX INFO: renamed from: x */
    public static final int f70352x = 10;

    /* JADX INFO: renamed from: y */
    public static final short f70353y = 1024;

    /* JADX INFO: renamed from: z */
    public static final long f70354z = 100000;

    /* JADX INFO: renamed from: i */
    public final float f70355i;

    /* JADX INFO: renamed from: j */
    public final short f70356j;

    /* JADX INFO: renamed from: k */
    public final int f70357k;

    /* JADX INFO: renamed from: l */
    public final long f70358l;

    /* JADX INFO: renamed from: m */
    public final long f70359m;

    /* JADX INFO: renamed from: n */
    public int f70360n;

    /* JADX INFO: renamed from: o */
    public boolean f70361o;

    /* JADX INFO: renamed from: p */
    public int f70362p;

    /* JADX INFO: renamed from: q */
    public long f70363q;

    /* JADX INFO: renamed from: r */
    public int f70364r;

    /* JADX INFO: renamed from: s */
    public byte[] f70365s;

    /* JADX INFO: renamed from: t */
    public int f70366t;

    /* JADX INFO: renamed from: u */
    public int f70367u;

    /* JADX INFO: renamed from: v */
    public byte[] f70368v;

    public pcf() {
        this(100000L, 0.2f, f70342A, 10, (short) 1024);
    }

    private int alignToBytePerFrameBoundary(int i) {
        int i2 = this.f70360n;
        return (i / i2) * i2;
    }

    private int calculateFadeInPercentage(int i, int i2) {
        int i3 = this.f70357k;
        return i3 + ((((100 - i3) * (i * 1000)) / i2) / 1000);
    }

    private int calculateFadeOutPercentage(int i, int i2) {
        return (((this.f70357k - 100) * ((i * 1000) / i2)) / 1000) + 100;
    }

    private int calculateShortenedSilenceLength(int i) {
        int iDurationUsToFrames = ((durationUsToFrames(this.f70359m) - this.f70364r) * this.f70360n) - (this.f70365s.length / 2);
        v80.checkState(iDurationUsToFrames >= 0);
        return alignToBytePerFrameBoundary(Math.min((i * this.f70355i) + 0.5f, iDurationUsToFrames));
    }

    private int durationUsToFrames(long j) {
        return (int) ((j * ((long) this.f61732b.f43350a)) / 1000000);
    }

    private int findNoiseLimit(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (isNoise(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i = this.f70360n;
                return ((iLimit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    private int findNoisePosition(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (isNoise(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i = this.f70360n;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    private boolean isNoise(byte b, byte b2) {
        return Math.abs(twoByteSampleToInt(b, b2)) > this.f70356j;
    }

    private void modifyVolume(byte[] bArr, int i, int i2) {
        if (i2 == 3) {
            return;
        }
        for (int i3 = 0; i3 < i; i3 += 2) {
            sampleIntToTwoBigEndianBytes(bArr, i3, (twoByteSampleToInt(bArr[i3 + 1], bArr[i3]) * (i2 == 0 ? calculateFadeOutPercentage(i3, i - 1) : i2 == 2 ? calculateFadeInPercentage(i3, i - 1) : this.f70357k)) / 100);
        }
    }

    private void output(ByteBuffer byteBuffer) {
        m17515b(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void outputRange(byte[] bArr, int i, int i2) {
        v80.checkArgument(i % this.f70360n == 0, "byteOutput size is not aligned to frame size " + i);
        modifyVolume(bArr, i, i2);
        m17515b(i).put(bArr, 0, i).flip();
    }

    private void outputShortenedSilenceBuffer(boolean z) {
        int length;
        int iCalculateShortenedSilenceLength;
        int i = this.f70367u;
        byte[] bArr = this.f70365s;
        if (i == bArr.length || z) {
            if (this.f70364r == 0) {
                if (z) {
                    outputSilence(i, 3);
                    length = i;
                } else {
                    v80.checkState(i >= bArr.length / 2);
                    length = this.f70365s.length / 2;
                    outputSilence(length, 0);
                }
                iCalculateShortenedSilenceLength = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iCalculateShortenedSilenceLength2 = calculateShortenedSilenceLength(length2) + (this.f70365s.length / 2);
                outputSilence(iCalculateShortenedSilenceLength2, 2);
                iCalculateShortenedSilenceLength = iCalculateShortenedSilenceLength2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iCalculateShortenedSilenceLength = calculateShortenedSilenceLength(length);
                outputSilence(iCalculateShortenedSilenceLength, 1);
            }
            v80.checkState(length % this.f70360n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            v80.checkState(i >= iCalculateShortenedSilenceLength);
            this.f70367u -= length;
            int i2 = this.f70366t + length;
            this.f70366t = i2;
            this.f70366t = i2 % this.f70365s.length;
            int i3 = this.f70364r;
            int i4 = this.f70360n;
            this.f70364r = i3 + (iCalculateShortenedSilenceLength / i4);
            this.f70363q += (long) ((length - iCalculateShortenedSilenceLength) / i4);
        }
    }

    private void outputSilence(int i, int i2) {
        if (i == 0) {
            return;
        }
        v80.checkArgument(this.f70367u >= i);
        if (i2 == 2) {
            int i3 = this.f70366t;
            int i4 = this.f70367u;
            int i5 = i3 + i4;
            byte[] bArr = this.f70365s;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, (i3 + i4) - i, this.f70368v, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.f70368v, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, this.f70368v, 0, i6);
                    System.arraycopy(this.f70365s, 0, this.f70368v, i6, length);
                }
            }
        } else {
            int i7 = this.f70366t;
            int i8 = i7 + i;
            byte[] bArr2 = this.f70365s;
            if (i8 <= bArr2.length) {
                System.arraycopy(bArr2, i7, this.f70368v, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr2, i7, this.f70368v, 0, length2);
                System.arraycopy(this.f70365s, 0, this.f70368v, length2, i - length2);
            }
        }
        v80.checkArgument(i % this.f70360n == 0, "sizeToOutput is not aligned to frame size: " + i);
        v80.checkState(this.f70366t < this.f70365s.length);
        outputRange(this.f70368v, i, i2);
    }

    private void processNoisy(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f70365s.length));
        int iFindNoiseLimit = findNoiseLimit(byteBuffer);
        if (iFindNoiseLimit == byteBuffer.position()) {
            this.f70362p = 1;
        } else {
            byteBuffer.limit(Math.min(iFindNoiseLimit, byteBuffer.capacity()));
            output(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private static void sampleIntToTwoBigEndianBytes(byte[] bArr, int i, int i2) {
        if (i2 >= 32767) {
            bArr[i] = -1;
            bArr[i + 1] = 127;
        } else if (i2 <= -32768) {
            bArr[i] = 0;
            bArr[i + 1] = -128;
        } else {
            bArr[i] = (byte) (i2 & 255);
            bArr[i + 1] = (byte) (i2 >> 8);
        }
    }

    private void shortenSilenceSilenceUntilNoise(ByteBuffer byteBuffer) {
        int length;
        int i;
        v80.checkState(this.f70366t < this.f70365s.length);
        int iLimit = byteBuffer.limit();
        int iFindNoisePosition = findNoisePosition(byteBuffer);
        int iPosition = iFindNoisePosition - byteBuffer.position();
        int i2 = this.f70366t;
        int i3 = this.f70367u;
        int i4 = i2 + i3;
        byte[] bArr = this.f70365s;
        if (i4 < bArr.length) {
            length = bArr.length - (i3 + i2);
            i = i2 + i3;
        } else {
            int length2 = i3 - (bArr.length - i2);
            length = i2 - length2;
            i = length2;
        }
        boolean z = iFindNoisePosition < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f70365s, i, iMin);
        int i5 = this.f70367u + iMin;
        this.f70367u = i5;
        v80.checkState(i5 <= this.f70365s.length);
        boolean z2 = z && iPosition < length;
        outputShortenedSilenceBuffer(z2);
        if (z2) {
            this.f70362p = 0;
            this.f70364r = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private static int twoByteSampleToInt(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    public long getSkippedFrames() {
        return this.f70363q;
    }

    @Override // p000.mq0, p000.hf0
    public boolean isActive() {
        return super.isActive() && this.f70361o;
    }

    @Override // p000.mq0
    public hf0.C6832a onConfigure(hf0.C6832a c6832a) throws hf0.C6833b {
        if (c6832a.f43352c == 2) {
            return c6832a.f43350a == -1 ? hf0.C6832a.f43349e : c6832a;
        }
        throw new hf0.C6833b(c6832a);
    }

    @Override // p000.mq0
    public void onFlush() {
        if (isActive()) {
            this.f70360n = this.f61732b.f43351b * 2;
            int iAlignToBytePerFrameBoundary = alignToBytePerFrameBoundary(durationUsToFrames(this.f70358l) / 2) * 2;
            if (this.f70365s.length != iAlignToBytePerFrameBoundary) {
                this.f70365s = new byte[iAlignToBytePerFrameBoundary];
                this.f70368v = new byte[iAlignToBytePerFrameBoundary];
            }
        }
        this.f70362p = 0;
        this.f70363q = 0L;
        this.f70364r = 0;
        this.f70366t = 0;
        this.f70367u = 0;
    }

    @Override // p000.mq0
    public void onQueueEndOfStream() {
        if (this.f70367u > 0) {
            outputShortenedSilenceBuffer(true);
            this.f70364r = 0;
        }
    }

    @Override // p000.mq0
    public void onReset() {
        this.f70361o = false;
        byte[] bArr = t0i.f83321f;
        this.f70365s = bArr;
        this.f70368v = bArr;
    }

    @Override // p000.hf0
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !m17514a()) {
            int i = this.f70362p;
            if (i == 0) {
                processNoisy(byteBuffer);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                shortenSilenceSilenceUntilNoise(byteBuffer);
            }
        }
    }

    public void setEnabled(boolean z) {
        this.f70361o = z;
    }

    @Deprecated
    public pcf(long j, long j2, short s) {
        this(j, j2 / j, j, 0, s);
    }

    private int alignToBytePerFrameBoundary(float f) {
        return alignToBytePerFrameBoundary((int) f);
    }

    public pcf(long j, float f, long j2, int i, short s) {
        boolean z = false;
        this.f70364r = 0;
        this.f70366t = 0;
        this.f70367u = 0;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        v80.checkArgument(z);
        this.f70358l = j;
        this.f70355i = f;
        this.f70359m = j2;
        this.f70357k = i;
        this.f70356j = s;
        byte[] bArr = t0i.f83321f;
        this.f70365s = bArr;
        this.f70368v = bArr;
    }
}
