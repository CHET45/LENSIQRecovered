package p000;

import java.io.IOException;
import p000.j21;

/* JADX INFO: loaded from: classes3.dex */
public final class wid extends j21 {

    /* JADX INFO: renamed from: f */
    public static final long f94360f = 100000;

    /* JADX INFO: renamed from: g */
    public static final int f94361g = 1000;

    /* JADX INFO: renamed from: h */
    public static final int f94362h = 20000;

    /* JADX INFO: renamed from: wid$b */
    public static final class C14627b implements j21.InterfaceC7724f {

        /* JADX INFO: renamed from: a */
        public final h2h f94363a;

        /* JADX INFO: renamed from: b */
        public final jhc f94364b;

        private j21.C7723e searchForScrValueInBuffer(jhc jhcVar, long j, long j2) {
            int position = -1;
            int position2 = -1;
            long j3 = -9223372036854775807L;
            while (jhcVar.bytesLeft() >= 4) {
                if (wid.peekIntAtPosition(jhcVar.getData(), jhcVar.getPosition()) != 442) {
                    jhcVar.skipBytes(1);
                } else {
                    jhcVar.skipBytes(4);
                    long scrValueFromPack = zid.readScrValueFromPack(jhcVar);
                    if (scrValueFromPack != -9223372036854775807L) {
                        long jAdjustTsTimestamp = this.f94363a.adjustTsTimestamp(scrValueFromPack);
                        if (jAdjustTsTimestamp > j) {
                            return j3 == -9223372036854775807L ? j21.C7723e.overestimatedResult(jAdjustTsTimestamp, j2) : j21.C7723e.targetFoundResult(j2 + ((long) position2));
                        }
                        if (100000 + jAdjustTsTimestamp > j) {
                            return j21.C7723e.targetFoundResult(j2 + ((long) jhcVar.getPosition()));
                        }
                        position2 = jhcVar.getPosition();
                        j3 = jAdjustTsTimestamp;
                    }
                    skipToEndOfCurrentPack(jhcVar);
                    position = jhcVar.getPosition();
                }
            }
            return j3 != -9223372036854775807L ? j21.C7723e.underestimatedResult(j3, j2 + ((long) position)) : j21.C7723e.f49403h;
        }

        private static void skipToEndOfCurrentPack(jhc jhcVar) {
            int iPeekIntAtPosition;
            int iLimit = jhcVar.limit();
            if (jhcVar.bytesLeft() < 10) {
                jhcVar.setPosition(iLimit);
                return;
            }
            jhcVar.skipBytes(9);
            int unsignedByte = jhcVar.readUnsignedByte() & 7;
            if (jhcVar.bytesLeft() < unsignedByte) {
                jhcVar.setPosition(iLimit);
                return;
            }
            jhcVar.skipBytes(unsignedByte);
            if (jhcVar.bytesLeft() < 4) {
                jhcVar.setPosition(iLimit);
                return;
            }
            if (wid.peekIntAtPosition(jhcVar.getData(), jhcVar.getPosition()) == 443) {
                jhcVar.skipBytes(4);
                int unsignedShort = jhcVar.readUnsignedShort();
                if (jhcVar.bytesLeft() < unsignedShort) {
                    jhcVar.setPosition(iLimit);
                    return;
                }
                jhcVar.skipBytes(unsignedShort);
            }
            while (jhcVar.bytesLeft() >= 4 && (iPeekIntAtPosition = wid.peekIntAtPosition(jhcVar.getData(), jhcVar.getPosition())) != 442 && iPeekIntAtPosition != 441 && (iPeekIntAtPosition >>> 8) == 1) {
                jhcVar.skipBytes(4);
                if (jhcVar.bytesLeft() < 2) {
                    jhcVar.setPosition(iLimit);
                    return;
                }
                jhcVar.setPosition(Math.min(jhcVar.limit(), jhcVar.getPosition() + jhcVar.readUnsignedShort()));
            }
        }

        @Override // p000.j21.InterfaceC7724f
        public void onSeekFinished() {
            this.f94364b.reset(t0i.f83321f);
        }

        @Override // p000.j21.InterfaceC7724f
        public j21.C7723e searchForTimestamp(ak5 ak5Var, long j) throws IOException {
            long position = ak5Var.getPosition();
            int iMin = (int) Math.min(20000L, ak5Var.getLength() - position);
            this.f94364b.reset(iMin);
            ak5Var.peekFully(this.f94364b.getData(), 0, iMin);
            return searchForScrValueInBuffer(this.f94364b, j, position);
        }

        private C14627b(h2h h2hVar) {
            this.f94363a = h2hVar;
            this.f94364b = new jhc();
        }
    }

    public wid(h2h h2hVar, long j, long j2) {
        super(new j21.C7720b(), new C14627b(h2hVar), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int peekIntAtPosition(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
