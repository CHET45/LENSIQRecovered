package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class vjh {

    /* JADX INFO: renamed from: j */
    public static final String f91414j = "TsDurationReader";

    /* JADX INFO: renamed from: a */
    public final int f91415a;

    /* JADX INFO: renamed from: d */
    public boolean f91418d;

    /* JADX INFO: renamed from: e */
    public boolean f91419e;

    /* JADX INFO: renamed from: f */
    public boolean f91420f;

    /* JADX INFO: renamed from: b */
    public final g2h f91416b = new g2h(0);

    /* JADX INFO: renamed from: g */
    public long f91421g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f91422h = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public long f91423i = -9223372036854775807L;

    /* JADX INFO: renamed from: c */
    public final ihc f91417c = new ihc();

    public vjh(int i) {
        this.f91415a = i;
    }

    private int finishReadDuration(zj5 zj5Var) {
        this.f91417c.reset(x0i.f95983f);
        this.f91418d = true;
        zj5Var.resetPeekPosition();
        return 0;
    }

    private int readFirstPcrValue(zj5 zj5Var, c5d c5dVar, int i) throws IOException {
        int iMin = (int) Math.min(this.f91415a, zj5Var.getLength());
        long j = 0;
        if (zj5Var.getPosition() != j) {
            c5dVar.f15813a = j;
            return 1;
        }
        this.f91417c.reset(iMin);
        zj5Var.resetPeekPosition();
        zj5Var.peekFully(this.f91417c.getData(), 0, iMin);
        this.f91421g = readFirstPcrValueFromBuffer(this.f91417c, i);
        this.f91419e = true;
        return 0;
    }

    private long readFirstPcrValueFromBuffer(ihc ihcVar, int i) {
        int iLimit = ihcVar.limit();
        for (int position = ihcVar.getPosition(); position < iLimit; position++) {
            if (ihcVar.getData()[position] == 71) {
                long pcrFromPacket = ekh.readPcrFromPacket(ihcVar, position, i);
                if (pcrFromPacket != -9223372036854775807L) {
                    return pcrFromPacket;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int readLastPcrValue(zj5 zj5Var, c5d c5dVar, int i) throws IOException {
        long length = zj5Var.getLength();
        int iMin = (int) Math.min(this.f91415a, length);
        long j = length - ((long) iMin);
        if (zj5Var.getPosition() != j) {
            c5dVar.f15813a = j;
            return 1;
        }
        this.f91417c.reset(iMin);
        zj5Var.resetPeekPosition();
        zj5Var.peekFully(this.f91417c.getData(), 0, iMin);
        this.f91422h = readLastPcrValueFromBuffer(this.f91417c, i);
        this.f91420f = true;
        return 0;
    }

    private long readLastPcrValueFromBuffer(ihc ihcVar, int i) {
        int position = ihcVar.getPosition();
        int iLimit = ihcVar.limit();
        for (int i2 = iLimit - 188; i2 >= position; i2--) {
            if (ekh.isStartOfTsPacket(ihcVar.getData(), position, iLimit, i2)) {
                long pcrFromPacket = ekh.readPcrFromPacket(ihcVar, i2, i);
                if (pcrFromPacket != -9223372036854775807L) {
                    return pcrFromPacket;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long getDurationUs() {
        return this.f91423i;
    }

    public g2h getPcrTimestampAdjuster() {
        return this.f91416b;
    }

    public boolean isDurationReadFinished() {
        return this.f91418d;
    }

    public int readDuration(zj5 zj5Var, c5d c5dVar, int i) throws IOException {
        if (i <= 0) {
            return finishReadDuration(zj5Var);
        }
        if (!this.f91420f) {
            return readLastPcrValue(zj5Var, c5dVar, i);
        }
        if (this.f91422h == -9223372036854775807L) {
            return finishReadDuration(zj5Var);
        }
        if (!this.f91419e) {
            return readFirstPcrValue(zj5Var, c5dVar, i);
        }
        long j = this.f91421g;
        if (j == -9223372036854775807L) {
            return finishReadDuration(zj5Var);
        }
        long jAdjustTsTimestamp = this.f91416b.adjustTsTimestamp(this.f91422h) - this.f91416b.adjustTsTimestamp(j);
        this.f91423i = jAdjustTsTimestamp;
        if (jAdjustTsTimestamp < 0) {
            yh9.m25919w("TsDurationReader", "Invalid duration: " + this.f91423i + ". Using TIME_UNSET instead.");
            this.f91423i = -9223372036854775807L;
        }
        return finishReadDuration(zj5Var);
    }
}
