package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class yid {

    /* JADX INFO: renamed from: i */
    public static final String f101710i = "PsDurationReader";

    /* JADX INFO: renamed from: j */
    public static final int f101711j = 20000;

    /* JADX INFO: renamed from: c */
    public boolean f101714c;

    /* JADX INFO: renamed from: d */
    public boolean f101715d;

    /* JADX INFO: renamed from: e */
    public boolean f101716e;

    /* JADX INFO: renamed from: a */
    public final g2h f101712a = new g2h(0);

    /* JADX INFO: renamed from: f */
    public long f101717f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f101718g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f101719h = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final ihc f101713b = new ihc();

    private static boolean checkMarkerBits(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int finishReadDuration(zj5 zj5Var) {
        this.f101713b.reset(x0i.f95983f);
        this.f101714c = true;
        zj5Var.resetPeekPosition();
        return 0;
    }

    private int peekIntAtPosition(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    private int readFirstScrValue(zj5 zj5Var, c5d c5dVar) throws IOException {
        int iMin = (int) Math.min(20000L, zj5Var.getLength());
        long j = 0;
        if (zj5Var.getPosition() != j) {
            c5dVar.f15813a = j;
            return 1;
        }
        this.f101713b.reset(iMin);
        zj5Var.resetPeekPosition();
        zj5Var.peekFully(this.f101713b.getData(), 0, iMin);
        this.f101717f = readFirstScrValueFromBuffer(this.f101713b);
        this.f101715d = true;
        return 0;
    }

    private long readFirstScrValueFromBuffer(ihc ihcVar) {
        int iLimit = ihcVar.limit();
        for (int position = ihcVar.getPosition(); position < iLimit - 3; position++) {
            if (peekIntAtPosition(ihcVar.getData(), position) == 442) {
                ihcVar.setPosition(position + 4);
                long scrValueFromPack = readScrValueFromPack(ihcVar);
                if (scrValueFromPack != -9223372036854775807L) {
                    return scrValueFromPack;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int readLastScrValue(zj5 zj5Var, c5d c5dVar) throws IOException {
        long length = zj5Var.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j = length - ((long) iMin);
        if (zj5Var.getPosition() != j) {
            c5dVar.f15813a = j;
            return 1;
        }
        this.f101713b.reset(iMin);
        zj5Var.resetPeekPosition();
        zj5Var.peekFully(this.f101713b.getData(), 0, iMin);
        this.f101718g = readLastScrValueFromBuffer(this.f101713b);
        this.f101716e = true;
        return 0;
    }

    private long readLastScrValueFromBuffer(ihc ihcVar) {
        int position = ihcVar.getPosition();
        for (int iLimit = ihcVar.limit() - 4; iLimit >= position; iLimit--) {
            if (peekIntAtPosition(ihcVar.getData(), iLimit) == 442) {
                ihcVar.setPosition(iLimit + 4);
                long scrValueFromPack = readScrValueFromPack(ihcVar);
                if (scrValueFromPack != -9223372036854775807L) {
                    return scrValueFromPack;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long readScrValueFromPack(ihc ihcVar) {
        int position = ihcVar.getPosition();
        if (ihcVar.bytesLeft() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        ihcVar.readBytes(bArr, 0, 9);
        ihcVar.setPosition(position);
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
        return this.f101719h;
    }

    public g2h getScrTimestampAdjuster() {
        return this.f101712a;
    }

    public boolean isDurationReadFinished() {
        return this.f101714c;
    }

    public int readDuration(zj5 zj5Var, c5d c5dVar) throws IOException {
        if (!this.f101716e) {
            return readLastScrValue(zj5Var, c5dVar);
        }
        if (this.f101718g == -9223372036854775807L) {
            return finishReadDuration(zj5Var);
        }
        if (!this.f101715d) {
            return readFirstScrValue(zj5Var, c5dVar);
        }
        long j = this.f101717f;
        if (j == -9223372036854775807L) {
            return finishReadDuration(zj5Var);
        }
        long jAdjustTsTimestamp = this.f101712a.adjustTsTimestamp(this.f101718g) - this.f101712a.adjustTsTimestamp(j);
        this.f101719h = jAdjustTsTimestamp;
        if (jAdjustTsTimestamp < 0) {
            yh9.m25919w("PsDurationReader", "Invalid duration: " + this.f101719h + ". Using TIME_UNSET instead.");
            this.f101719h = -9223372036854775807L;
        }
        return finishReadDuration(zj5Var);
    }
}
