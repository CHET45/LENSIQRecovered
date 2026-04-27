package p000;

import java.io.IOException;
import p000.k21;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class xid extends k21 {

    /* JADX INFO: renamed from: f */
    public static final long f98112f = 100000;

    /* JADX INFO: renamed from: g */
    public static final int f98113g = 1000;

    /* JADX INFO: renamed from: h */
    public static final int f98114h = 20000;

    /* JADX INFO: renamed from: xid$b */
    public static final class C15144b implements k21.InterfaceC8173f {

        /* JADX INFO: renamed from: a */
        public final g2h f98115a;

        /* JADX INFO: renamed from: b */
        public final ihc f98116b;

        private k21.C8172e searchForScrValueInBuffer(ihc ihcVar, long j, long j2) {
            int position = -1;
            int position2 = -1;
            long j3 = -9223372036854775807L;
            while (ihcVar.bytesLeft() >= 4) {
                if (xid.peekIntAtPosition(ihcVar.getData(), ihcVar.getPosition()) != 442) {
                    ihcVar.skipBytes(1);
                } else {
                    ihcVar.skipBytes(4);
                    long scrValueFromPack = yid.readScrValueFromPack(ihcVar);
                    if (scrValueFromPack != -9223372036854775807L) {
                        long jAdjustTsTimestamp = this.f98115a.adjustTsTimestamp(scrValueFromPack);
                        if (jAdjustTsTimestamp > j) {
                            return j3 == -9223372036854775807L ? k21.C8172e.overestimatedResult(jAdjustTsTimestamp, j2) : k21.C8172e.targetFoundResult(j2 + ((long) position2));
                        }
                        if (100000 + jAdjustTsTimestamp > j) {
                            return k21.C8172e.targetFoundResult(j2 + ((long) ihcVar.getPosition()));
                        }
                        position2 = ihcVar.getPosition();
                        j3 = jAdjustTsTimestamp;
                    }
                    skipToEndOfCurrentPack(ihcVar);
                    position = ihcVar.getPosition();
                }
            }
            return j3 != -9223372036854775807L ? k21.C8172e.underestimatedResult(j3, j2 + ((long) position)) : k21.C8172e.f52423h;
        }

        private static void skipToEndOfCurrentPack(ihc ihcVar) {
            int iPeekIntAtPosition;
            int iLimit = ihcVar.limit();
            if (ihcVar.bytesLeft() < 10) {
                ihcVar.setPosition(iLimit);
                return;
            }
            ihcVar.skipBytes(9);
            int unsignedByte = ihcVar.readUnsignedByte() & 7;
            if (ihcVar.bytesLeft() < unsignedByte) {
                ihcVar.setPosition(iLimit);
                return;
            }
            ihcVar.skipBytes(unsignedByte);
            if (ihcVar.bytesLeft() < 4) {
                ihcVar.setPosition(iLimit);
                return;
            }
            if (xid.peekIntAtPosition(ihcVar.getData(), ihcVar.getPosition()) == 443) {
                ihcVar.skipBytes(4);
                int unsignedShort = ihcVar.readUnsignedShort();
                if (ihcVar.bytesLeft() < unsignedShort) {
                    ihcVar.setPosition(iLimit);
                    return;
                }
                ihcVar.skipBytes(unsignedShort);
            }
            while (ihcVar.bytesLeft() >= 4 && (iPeekIntAtPosition = xid.peekIntAtPosition(ihcVar.getData(), ihcVar.getPosition())) != 442 && iPeekIntAtPosition != 441 && (iPeekIntAtPosition >>> 8) == 1) {
                ihcVar.skipBytes(4);
                if (ihcVar.bytesLeft() < 2) {
                    ihcVar.setPosition(iLimit);
                    return;
                }
                ihcVar.setPosition(Math.min(ihcVar.limit(), ihcVar.getPosition() + ihcVar.readUnsignedShort()));
            }
        }

        @Override // p000.k21.InterfaceC8173f
        public void onSeekFinished() {
            this.f98116b.reset(x0i.f95983f);
        }

        @Override // p000.k21.InterfaceC8173f
        public k21.C8172e searchForTimestamp(zj5 zj5Var, long j) throws IOException {
            long position = zj5Var.getPosition();
            int iMin = (int) Math.min(20000L, zj5Var.getLength() - position);
            this.f98116b.reset(iMin);
            zj5Var.peekFully(this.f98116b.getData(), 0, iMin);
            return searchForScrValueInBuffer(this.f98116b, j, position);
        }

        private C15144b(g2h g2hVar) {
            this.f98115a = g2hVar;
            this.f98116b = new ihc();
        }
    }

    public xid(g2h g2hVar, long j, long j2) {
        super(new k21.C8169b(), new C15144b(g2hVar), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int peekIntAtPosition(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
