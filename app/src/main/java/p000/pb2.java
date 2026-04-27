package p000;

/* JADX INFO: loaded from: classes6.dex */
public class pb2 {
    public static qc3 buildCustomCmd(byte[] bArr) {
        return new qc3(new id3(bArr));
    }

    public static ob2 buildCustomCmdWithoutResponse(byte[] bArr) {
        return new qc3(1, new id3(bArr));
    }

    public static rf3 buildDataCmd(ob2 ob2Var, byte[] bArr) {
        if (ob2Var == null || bArr == null) {
            return null;
        }
        wg3 wg3Var = new wg3(bArr);
        wg3Var.setXmOpCode(ob2Var.getId());
        return new rf3(wg3Var);
    }

    public static pg3 buildDataCmdWithResponse(ob2 ob2Var, byte[] bArr) {
        if (ob2Var == null || bArr == null || bArr.length <= 0) {
            return null;
        }
        wg3 wg3Var = new wg3(bArr);
        wg3Var.setXmOpCode(ob2Var.getId());
        return new pg3(wg3Var);
    }

    public static c57 buildGetTargetInfoCmd(int i) {
        return buildGetTargetInfoCmd(i, (byte) 0);
    }

    public static c57 buildGetTargetInfoCmdForAll() {
        return buildGetTargetInfoCmd(-1, (byte) 0);
    }

    public static ob2 buildSetDeviceNotifyADVInfoCmd(int i) {
        return new l6f(new m6f(i));
    }

    public static ob2 buildStopDeviceNotifyADVInfoCmd() {
        return buildSetDeviceNotifyADVInfoCmd(0);
    }

    public static c57 buildGetTargetInfoCmd(int i, byte b) {
        return new c57(new e57(i).setPlatform(b));
    }
}
