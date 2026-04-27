package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class lt1 {

    /* JADX INFO: renamed from: a */
    public static final String f58668a = "CeaUtil";

    /* JADX INFO: renamed from: b */
    public static final int f58669b = 1195456820;

    /* JADX INFO: renamed from: c */
    public static final int f58670c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f58671d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f58672e = 181;

    /* JADX INFO: renamed from: f */
    public static final int f58673f = 49;

    /* JADX INFO: renamed from: g */
    public static final int f58674g = 47;

    private lt1() {
    }

    public static void consume(long j, jhc jhcVar, q6h[] q6hVarArr) {
        while (true) {
            if (jhcVar.bytesLeft() <= 1) {
                return;
            }
            int non255TerminatedValue = readNon255TerminatedValue(jhcVar);
            int non255TerminatedValue2 = readNon255TerminatedValue(jhcVar);
            int position = jhcVar.getPosition() + non255TerminatedValue2;
            if (non255TerminatedValue2 == -1 || non255TerminatedValue2 > jhcVar.bytesLeft()) {
                xh9.m25148w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                position = jhcVar.limit();
            } else if (non255TerminatedValue == 4 && non255TerminatedValue2 >= 8) {
                int unsignedByte = jhcVar.readUnsignedByte();
                int unsignedShort = jhcVar.readUnsignedShort();
                int i = unsignedShort == 49 ? jhcVar.readInt() : 0;
                int unsignedByte2 = jhcVar.readUnsignedByte();
                if (unsignedShort == 47) {
                    jhcVar.skipBytes(1);
                }
                boolean z = unsignedByte == 181 && (unsignedShort == 49 || unsignedShort == 47) && unsignedByte2 == 3;
                if (unsignedShort == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    consumeCcData(j, jhcVar, q6hVarArr);
                }
            }
            jhcVar.setPosition(position);
        }
    }

    public static void consumeCcData(long j, jhc jhcVar, q6h[] q6hVarArr) {
        int unsignedByte = jhcVar.readUnsignedByte();
        if ((unsignedByte & 64) != 0) {
            jhcVar.skipBytes(1);
            int i = (unsignedByte & 31) * 3;
            int position = jhcVar.getPosition();
            for (q6h q6hVar : q6hVarArr) {
                jhcVar.setPosition(position);
                q6hVar.sampleData(jhcVar, i);
                v80.checkState(j != -9223372036854775807L);
                q6hVar.sampleMetadata(j, 1, i, 0, null);
            }
        }
    }

    private static int readNon255TerminatedValue(jhc jhcVar) {
        int i = 0;
        while (jhcVar.bytesLeft() != 0) {
            int unsignedByte = jhcVar.readUnsignedByte();
            i += unsignedByte;
            if (unsignedByte != 255) {
                return i;
            }
        }
        return -1;
    }
}
