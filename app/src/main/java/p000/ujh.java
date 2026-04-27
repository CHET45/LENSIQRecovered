package p000;

import java.io.IOException;
import p000.k21;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ujh extends k21 {

    /* JADX INFO: renamed from: f */
    public static final long f88174f = 100000;

    /* JADX INFO: renamed from: g */
    public static final int f88175g = 940;

    /* JADX INFO: renamed from: ujh$a */
    public static final class C13559a implements k21.InterfaceC8173f {

        /* JADX INFO: renamed from: a */
        public final g2h f88176a;

        /* JADX INFO: renamed from: b */
        public final ihc f88177b = new ihc();

        /* JADX INFO: renamed from: c */
        public final int f88178c;

        /* JADX INFO: renamed from: d */
        public final int f88179d;

        public C13559a(int i, g2h g2hVar, int i2) {
            this.f88178c = i;
            this.f88176a = g2hVar;
            this.f88179d = i2;
        }

        private k21.C8172e searchForPcrValueInBuffer(ihc ihcVar, long j, long j2) {
            int iFindSyncBytePosition;
            int iFindSyncBytePosition2;
            int iLimit = ihcVar.limit();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (ihcVar.bytesLeft() >= 188 && (iFindSyncBytePosition2 = (iFindSyncBytePosition = ekh.findSyncBytePosition(ihcVar.getData(), ihcVar.getPosition(), iLimit)) + 188) <= iLimit) {
                long pcrFromPacket = ekh.readPcrFromPacket(ihcVar, iFindSyncBytePosition, this.f88178c);
                if (pcrFromPacket != -9223372036854775807L) {
                    long jAdjustTsTimestamp = this.f88176a.adjustTsTimestamp(pcrFromPacket);
                    if (jAdjustTsTimestamp > j) {
                        return j5 == -9223372036854775807L ? k21.C8172e.overestimatedResult(jAdjustTsTimestamp, j2) : k21.C8172e.targetFoundResult(j2 + j4);
                    }
                    if (100000 + jAdjustTsTimestamp > j) {
                        return k21.C8172e.targetFoundResult(j2 + ((long) iFindSyncBytePosition));
                    }
                    j4 = iFindSyncBytePosition;
                    j5 = jAdjustTsTimestamp;
                }
                ihcVar.setPosition(iFindSyncBytePosition2);
                j3 = iFindSyncBytePosition2;
            }
            return j5 != -9223372036854775807L ? k21.C8172e.underestimatedResult(j5, j2 + j3) : k21.C8172e.f52423h;
        }

        @Override // p000.k21.InterfaceC8173f
        public void onSeekFinished() {
            this.f88177b.reset(x0i.f95983f);
        }

        @Override // p000.k21.InterfaceC8173f
        public k21.C8172e searchForTimestamp(zj5 zj5Var, long j) throws IOException {
            long position = zj5Var.getPosition();
            int iMin = (int) Math.min(this.f88179d, zj5Var.getLength() - position);
            this.f88177b.reset(iMin);
            zj5Var.peekFully(this.f88177b.getData(), 0, iMin);
            return searchForPcrValueInBuffer(this.f88177b, j, position);
        }
    }

    public ujh(g2h g2hVar, long j, long j2, int i, int i2) {
        super(new k21.C8169b(), new C13559a(i, g2hVar, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }
}
