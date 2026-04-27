package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class kt1 {

    /* JADX INFO: renamed from: a */
    public static final String f55276a = "CeaUtil";

    /* JADX INFO: renamed from: b */
    public static final int f55277b = 1195456820;

    /* JADX INFO: renamed from: c */
    public static final int f55278c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f55279d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f55280e = 181;

    /* JADX INFO: renamed from: f */
    public static final int f55281f = 49;

    /* JADX INFO: renamed from: g */
    public static final int f55282g = 47;

    private kt1() {
    }

    public static void consume(long j, ihc ihcVar, r6h[] r6hVarArr) {
        while (true) {
            if (ihcVar.bytesLeft() <= 1) {
                return;
            }
            int non255TerminatedValue = readNon255TerminatedValue(ihcVar);
            int non255TerminatedValue2 = readNon255TerminatedValue(ihcVar);
            int position = ihcVar.getPosition() + non255TerminatedValue2;
            if (non255TerminatedValue2 == -1 || non255TerminatedValue2 > ihcVar.bytesLeft()) {
                yh9.m25919w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                position = ihcVar.limit();
            } else if (non255TerminatedValue == 4 && non255TerminatedValue2 >= 8) {
                int unsignedByte = ihcVar.readUnsignedByte();
                int unsignedShort = ihcVar.readUnsignedShort();
                int i = unsignedShort == 49 ? ihcVar.readInt() : 0;
                int unsignedByte2 = ihcVar.readUnsignedByte();
                if (unsignedShort == 47) {
                    ihcVar.skipBytes(1);
                }
                boolean z = unsignedByte == 181 && (unsignedShort == 49 || unsignedShort == 47) && unsignedByte2 == 3;
                if (unsignedShort == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    consumeCcData(j, ihcVar, r6hVarArr);
                }
            }
            ihcVar.setPosition(position);
        }
    }

    public static void consumeCcData(long j, ihc ihcVar, r6h[] r6hVarArr) {
        int unsignedByte = ihcVar.readUnsignedByte();
        if ((unsignedByte & 64) != 0) {
            ihcVar.skipBytes(1);
            int i = (unsignedByte & 31) * 3;
            int position = ihcVar.getPosition();
            for (r6h r6hVar : r6hVarArr) {
                ihcVar.setPosition(position);
                r6hVar.sampleData(ihcVar, i);
                if (j != -9223372036854775807L) {
                    r6hVar.sampleMetadata(j, 1, i, 0, null);
                }
            }
        }
    }

    private static int readNon255TerminatedValue(ihc ihcVar) {
        int i = 0;
        while (ihcVar.bytesLeft() != 0) {
            int unsignedByte = ihcVar.readUnsignedByte();
            i += unsignedByte;
            if (unsignedByte != 255) {
                return i;
            }
        }
        return -1;
    }
}
