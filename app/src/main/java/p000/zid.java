package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zid {

    /* JADX INFO: renamed from: i */
    public static final String f105191i = "PsDurationReader";

    /* JADX INFO: renamed from: j */
    public static final int f105192j = 20000;

    /* JADX INFO: renamed from: c */
    public boolean f105195c;

    /* JADX INFO: renamed from: d */
    public boolean f105196d;

    /* JADX INFO: renamed from: e */
    public boolean f105197e;

    /* JADX INFO: renamed from: a */
    public final h2h f105193a = new h2h(0);

    /* JADX INFO: renamed from: f */
    public long f105198f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f105199g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f105200h = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final jhc f105194b = new jhc();

    private static boolean checkMarkerBits(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int finishReadDuration(ak5 ak5Var) {
        this.f105194b.reset(t0i.f83321f);
        this.f105195c = true;
        ak5Var.resetPeekPosition();
        return 0;
    }

    private int peekIntAtPosition(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    private int readFirstScrValue(ak5 ak5Var, d5d d5dVar) throws IOException {
        int iMin = (int) Math.min(20000L, ak5Var.getLength());
        long j = 0;
        if (ak5Var.getPosition() != j) {
            d5dVar.f28476a = j;
            return 1;
        }
        this.f105194b.reset(iMin);
        ak5Var.resetPeekPosition();
        ak5Var.peekFully(this.f105194b.getData(), 0, iMin);
        this.f105198f = readFirstScrValueFromBuffer(this.f105194b);
        this.f105196d = true;
        return 0;
    }

    private long readFirstScrValueFromBuffer(jhc jhcVar) {
        int iLimit = jhcVar.limit();
        for (int position = jhcVar.getPosition(); position < iLimit - 3; position++) {
            if (peekIntAtPosition(jhcVar.getData(), position) == 442) {
                jhcVar.setPosition(position + 4);
                long scrValueFromPack = readScrValueFromPack(jhcVar);
                if (scrValueFromPack != -9223372036854775807L) {
                    return scrValueFromPack;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int readLastScrValue(ak5 ak5Var, d5d d5dVar) throws IOException {
        long length = ak5Var.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j = length - ((long) iMin);
        if (ak5Var.getPosition() != j) {
            d5dVar.f28476a = j;
            return 1;
        }
        this.f105194b.reset(iMin);
        ak5Var.resetPeekPosition();
        ak5Var.peekFully(this.f105194b.getData(), 0, iMin);
        this.f105199g = readLastScrValueFromBuffer(this.f105194b);
        this.f105197e = true;
        return 0;
    }

    private long readLastScrValueFromBuffer(jhc jhcVar) {
        int position = jhcVar.getPosition();
        for (int iLimit = jhcVar.limit() - 4; iLimit >= position; iLimit--) {
            if (peekIntAtPosition(jhcVar.getData(), iLimit) == 442) {
                jhcVar.setPosition(iLimit + 4);
                long scrValueFromPack = readScrValueFromPack(jhcVar);
                if (scrValueFromPack != -9223372036854775807L) {
                    return scrValueFromPack;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long readScrValueFromPack(jhc jhcVar) {
        int position = jhcVar.getPosition();
        if (jhcVar.bytesLeft() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        jhcVar.readBytes(bArr, 0, 9);
        jhcVar.setPosition(position);
        if (checkMarkerBits(bArr)) {
            return readScrValueFromPackHeader(bArr);
        }
        return -9223372036854775807L;
    }

    private static long readScrValueFromPackHeader(byte[] bArr) {
        byte b = bArr[0];
        long j = (((((long) b) & 56) >> 3) << 30) | ((((long) b) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b2 = bArr[2];
        return j | (((((long) b2) & 248) >> 3) << 15) | ((((long) b2) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long getDurationUs() {
        return this.f105200h;
    }

    public h2h getScrTimestampAdjuster() {
        return this.f105193a;
    }

    public boolean isDurationReadFinished() {
        return this.f105195c;
    }

    public int readDuration(ak5 ak5Var, d5d d5dVar) throws IOException {
        if (!this.f105197e) {
            return readLastScrValue(ak5Var, d5dVar);
        }
        if (this.f105199g == -9223372036854775807L) {
            return finishReadDuration(ak5Var);
        }
        if (!this.f105196d) {
            return readFirstScrValue(ak5Var, d5dVar);
        }
        long j = this.f105198f;
        if (j == -9223372036854775807L) {
            return finishReadDuration(ak5Var);
        }
        this.f105200h = this.f105193a.adjustTsTimestampGreaterThanPreviousTimestamp(this.f105199g) - this.f105193a.adjustTsTimestamp(j);
        return finishReadDuration(ak5Var);
    }
}
