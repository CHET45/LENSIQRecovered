package p000;

import java.nio.ByteBuffer;
import p000.if0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ocf extends lq0 {

    /* JADX INFO: renamed from: u */
    public static final long f67219u = 150000;

    /* JADX INFO: renamed from: v */
    public static final long f67220v = 20000;

    /* JADX INFO: renamed from: w */
    public static final short f67221w = 1024;

    /* JADX INFO: renamed from: x */
    public static final int f67222x = 0;

    /* JADX INFO: renamed from: y */
    public static final int f67223y = 1;

    /* JADX INFO: renamed from: z */
    public static final int f67224z = 2;

    /* JADX INFO: renamed from: i */
    public final long f67225i;

    /* JADX INFO: renamed from: j */
    public final long f67226j;

    /* JADX INFO: renamed from: k */
    public final short f67227k;

    /* JADX INFO: renamed from: l */
    public int f67228l;

    /* JADX INFO: renamed from: m */
    public boolean f67229m;

    /* JADX INFO: renamed from: n */
    public byte[] f67230n;

    /* JADX INFO: renamed from: o */
    public byte[] f67231o;

    /* JADX INFO: renamed from: p */
    public int f67232p;

    /* JADX INFO: renamed from: q */
    public int f67233q;

    /* JADX INFO: renamed from: r */
    public int f67234r;

    /* JADX INFO: renamed from: s */
    public boolean f67235s;

    /* JADX INFO: renamed from: t */
    public long f67236t;

    public ocf() {
        this(f67219u, 20000L, (short) 1024);
    }

    private int durationUsToFrames(long j) {
        return (int) ((j * ((long) this.f58444b.f46720a)) / 1000000);
    }

    private int findNoiseLimit(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f67227k);
        int i = this.f67228l;
        return ((iLimit / i) * i) + i;
    }

    private int findNoisePosition(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f67227k) {
                int i = this.f67228l;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    private void output(byte[] bArr, int i) {
        m16315e(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f67235s = true;
        }
    }

    private void processMaybeSilence(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iFindNoisePosition = findNoisePosition(byteBuffer);
        int iPosition = iFindNoisePosition - byteBuffer.position();
        byte[] bArr = this.f67230n;
        int length = bArr.length;
        int i = this.f67233q;
        int i2 = length - i;
        if (iFindNoisePosition < iLimit && iPosition < i2) {
            output(bArr, i);
            this.f67233q = 0;
            this.f67232p = 0;
            return;
        }
        int iMin = Math.min(iPosition, i2);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f67230n, this.f67233q, iMin);
        int i3 = this.f67233q + iMin;
        this.f67233q = i3;
        byte[] bArr2 = this.f67230n;
        if (i3 == bArr2.length) {
            if (this.f67235s) {
                output(bArr2, this.f67234r);
                this.f67236t += (long) ((this.f67233q - (this.f67234r * 2)) / this.f67228l);
            } else {
                this.f67236t += (long) ((i3 - this.f67234r) / this.f67228l);
            }
            updatePaddingBuffer(byteBuffer, this.f67230n, this.f67233q);
            this.f67233q = 0;
            this.f67232p = 2;
        }
        byteBuffer.limit(iLimit);
    }

    private void processNoisy(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f67230n.length));
        int iFindNoiseLimit = findNoiseLimit(byteBuffer);
        if (iFindNoiseLimit == byteBuffer.position()) {
            this.f67232p = 1;
        } else {
            byteBuffer.limit(iFindNoiseLimit);
            output(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void processSilence(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iFindNoisePosition = findNoisePosition(byteBuffer);
        byteBuffer.limit(iFindNoisePosition);
        this.f67236t += (long) (byteBuffer.remaining() / this.f67228l);
        updatePaddingBuffer(byteBuffer, this.f67231o, this.f67234r);
        if (iFindNoisePosition < iLimit) {
            output(this.f67231o, this.f67234r);
            this.f67232p = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void updatePaddingBuffer(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.f67234r);
        int i2 = this.f67234r - iMin;
        System.arraycopy(bArr, i - i2, this.f67231o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f67231o, i2, iMin);
    }

    @Override // p000.lq0
    /* JADX INFO: renamed from: b */
    public void mo3214b() {
        if (this.f67229m) {
            this.f67228l = this.f58444b.f46723d;
            int iDurationUsToFrames = durationUsToFrames(this.f67225i) * this.f67228l;
            if (this.f67230n.length != iDurationUsToFrames) {
                this.f67230n = new byte[iDurationUsToFrames];
            }
            int iDurationUsToFrames2 = durationUsToFrames(this.f67226j) * this.f67228l;
            this.f67234r = iDurationUsToFrames2;
            if (this.f67231o.length != iDurationUsToFrames2) {
                this.f67231o = new byte[iDurationUsToFrames2];
            }
        }
        this.f67232p = 0;
        this.f67236t = 0L;
        this.f67233q = 0;
        this.f67235s = false;
    }

    @Override // p000.lq0
    /* JADX INFO: renamed from: c */
    public void mo3215c() {
        int i = this.f67233q;
        if (i > 0) {
            output(this.f67230n, i);
        }
        if (this.f67235s) {
            return;
        }
        this.f67236t += (long) (this.f67234r / this.f67228l);
    }

    @Override // p000.lq0
    /* JADX INFO: renamed from: d */
    public void mo3216d() {
        this.f67229m = false;
        this.f67234r = 0;
        byte[] bArr = x0i.f95983f;
        this.f67230n = bArr;
        this.f67231o = bArr;
    }

    public long getSkippedFrames() {
        return this.f67236t;
    }

    @Override // p000.lq0, p000.if0
    public boolean isActive() {
        return this.f67229m;
    }

    @Override // p000.lq0
    @op1
    public if0.C7262a onConfigure(if0.C7262a c7262a) throws if0.C7263b {
        if (c7262a.f46722c == 2) {
            return this.f67229m ? c7262a : if0.C7262a.f46719e;
        }
        throw new if0.C7263b(c7262a);
    }

    @Override // p000.if0
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !m16314a()) {
            int i = this.f67232p;
            if (i == 0) {
                processNoisy(byteBuffer);
            } else if (i == 1) {
                processMaybeSilence(byteBuffer);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                processSilence(byteBuffer);
            }
        }
    }

    public void setEnabled(boolean z) {
        this.f67229m = z;
    }

    public ocf(long j, long j2, short s) {
        u80.checkArgument(j2 <= j);
        this.f67225i = j;
        this.f67226j = j2;
        this.f67227k = s;
        byte[] bArr = x0i.f95983f;
        this.f67230n = bArr;
        this.f67231o = bArr;
    }

    private void output(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        m16315e(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.f67235s = true;
        }
    }
}
