package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class wjh {

    /* JADX INFO: renamed from: j */
    public static final String f94441j = "TsDurationReader";

    /* JADX INFO: renamed from: a */
    public final int f94442a;

    /* JADX INFO: renamed from: d */
    public boolean f94445d;

    /* JADX INFO: renamed from: e */
    public boolean f94446e;

    /* JADX INFO: renamed from: f */
    public boolean f94447f;

    /* JADX INFO: renamed from: b */
    public final h2h f94443b = new h2h(0);

    /* JADX INFO: renamed from: g */
    public long f94448g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f94449h = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public long f94450i = -9223372036854775807L;

    /* JADX INFO: renamed from: c */
    public final jhc f94444c = new jhc();

    public wjh(int i) {
        this.f94442a = i;
    }

    private int finishReadDuration(ak5 ak5Var) {
        this.f94444c.reset(t0i.f83321f);
        this.f94445d = true;
        ak5Var.resetPeekPosition();
        return 0;
    }

    private int readFirstPcrValue(ak5 ak5Var, d5d d5dVar, int i) throws IOException {
        int iMin = (int) Math.min(this.f94442a, ak5Var.getLength());
        long j = 0;
        if (ak5Var.getPosition() != j) {
            d5dVar.f28476a = j;
            return 1;
        }
        this.f94444c.reset(iMin);
        ak5Var.resetPeekPosition();
        ak5Var.peekFully(this.f94444c.getData(), 0, iMin);
        this.f94448g = readFirstPcrValueFromBuffer(this.f94444c, i);
        this.f94446e = true;
        return 0;
    }

    private long readFirstPcrValueFromBuffer(jhc jhcVar, int i) {
        int iLimit = jhcVar.limit();
        for (int position = jhcVar.getPosition(); position < iLimit; position++) {
            if (jhcVar.getData()[position] == 71) {
                long pcrFromPacket = fkh.readPcrFromPacket(jhcVar, position, i);
                if (pcrFromPacket != -9223372036854775807L) {
                    return pcrFromPacket;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int readLastPcrValue(ak5 ak5Var, d5d d5dVar, int i) throws IOException {
        long length = ak5Var.getLength();
        int iMin = (int) Math.min(this.f94442a, length);
        long j = length - ((long) iMin);
        if (ak5Var.getPosition() != j) {
            d5dVar.f28476a = j;
            return 1;
        }
        this.f94444c.reset(iMin);
        ak5Var.resetPeekPosition();
        ak5Var.peekFully(this.f94444c.getData(), 0, iMin);
        this.f94449h = readLastPcrValueFromBuffer(this.f94444c, i);
        this.f94447f = true;
        return 0;
    }

    private long readLastPcrValueFromBuffer(jhc jhcVar, int i) {
        int position = jhcVar.getPosition();
        int iLimit = jhcVar.limit();
        for (int i2 = iLimit - 188; i2 >= position; i2--) {
            if (fkh.isStartOfTsPacket(jhcVar.getData(), position, iLimit, i2)) {
                long pcrFromPacket = fkh.readPcrFromPacket(jhcVar, i2, i);
                if (pcrFromPacket != -9223372036854775807L) {
                    return pcrFromPacket;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long getDurationUs() {
        return this.f94450i;
    }

    public h2h getPcrTimestampAdjuster() {
        return this.f94443b;
    }

    public boolean isDurationReadFinished() {
        return this.f94445d;
    }

    public int readDuration(ak5 ak5Var, d5d d5dVar, int i) throws IOException {
        if (i <= 0) {
            return finishReadDuration(ak5Var);
        }
        if (!this.f94447f) {
            return readLastPcrValue(ak5Var, d5dVar, i);
        }
        if (this.f94449h == -9223372036854775807L) {
            return finishReadDuration(ak5Var);
        }
        if (!this.f94446e) {
            return readFirstPcrValue(ak5Var, d5dVar, i);
        }
        long j = this.f94448g;
        if (j == -9223372036854775807L) {
            return finishReadDuration(ak5Var);
        }
        this.f94450i = this.f94443b.adjustTsTimestampGreaterThanPreviousTimestamp(this.f94449h) - this.f94443b.adjustTsTimestamp(j);
        return finishReadDuration(ak5Var);
    }
}
