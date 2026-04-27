package p000;

import java.io.IOException;
import p000.j21;

/* JADX INFO: loaded from: classes3.dex */
public final class tjh extends j21 {

    /* JADX INFO: renamed from: f */
    public static final long f85081f = 100000;

    /* JADX INFO: renamed from: g */
    public static final int f85082g = 940;

    /* JADX INFO: renamed from: tjh$a */
    public static final class C13076a implements j21.InterfaceC7724f {

        /* JADX INFO: renamed from: a */
        public final h2h f85083a;

        /* JADX INFO: renamed from: b */
        public final jhc f85084b = new jhc();

        /* JADX INFO: renamed from: c */
        public final int f85085c;

        /* JADX INFO: renamed from: d */
        public final int f85086d;

        public C13076a(int i, h2h h2hVar, int i2) {
            this.f85085c = i;
            this.f85083a = h2hVar;
            this.f85086d = i2;
        }

        private j21.C7723e searchForPcrValueInBuffer(jhc jhcVar, long j, long j2) {
            int iFindSyncBytePosition;
            int iFindSyncBytePosition2;
            int iLimit = jhcVar.limit();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (jhcVar.bytesLeft() >= 188 && (iFindSyncBytePosition2 = (iFindSyncBytePosition = fkh.findSyncBytePosition(jhcVar.getData(), jhcVar.getPosition(), iLimit)) + 188) <= iLimit) {
                long pcrFromPacket = fkh.readPcrFromPacket(jhcVar, iFindSyncBytePosition, this.f85085c);
                if (pcrFromPacket != -9223372036854775807L) {
                    long jAdjustTsTimestamp = this.f85083a.adjustTsTimestamp(pcrFromPacket);
                    if (jAdjustTsTimestamp > j) {
                        return j5 == -9223372036854775807L ? j21.C7723e.overestimatedResult(jAdjustTsTimestamp, j2) : j21.C7723e.targetFoundResult(j2 + j4);
                    }
                    if (100000 + jAdjustTsTimestamp > j) {
                        return j21.C7723e.targetFoundResult(j2 + ((long) iFindSyncBytePosition));
                    }
                    j4 = iFindSyncBytePosition;
                    j5 = jAdjustTsTimestamp;
                }
                jhcVar.setPosition(iFindSyncBytePosition2);
                j3 = iFindSyncBytePosition2;
            }
            return j5 != -9223372036854775807L ? j21.C7723e.underestimatedResult(j5, j2 + j3) : j21.C7723e.f49403h;
        }

        @Override // p000.j21.InterfaceC7724f
        public void onSeekFinished() {
            this.f85084b.reset(t0i.f83321f);
        }

        @Override // p000.j21.InterfaceC7724f
        public j21.C7723e searchForTimestamp(ak5 ak5Var, long j) throws IOException {
            long position = ak5Var.getPosition();
            int iMin = (int) Math.min(this.f85086d, ak5Var.getLength() - position);
            this.f85084b.reset(iMin);
            ak5Var.peekFully(this.f85084b.getData(), 0, iMin);
            return searchForPcrValueInBuffer(this.f85084b, j, position);
        }
    }

    public tjh(h2h h2hVar, long j, long j2, int i, int i2) {
        super(new j21.C7720b(), new C13076a(i, h2hVar, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }
}
