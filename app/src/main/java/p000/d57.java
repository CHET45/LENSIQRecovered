package p000;

/* JADX INFO: loaded from: classes6.dex */
public class d57 implements rp7 {
    @Override // p000.rp7
    public ob2 parseDataToCmd(xs0 xs0Var, ob2 ob2Var) {
        int iBytesToInt;
        if (xs0Var == null || xs0Var.getOpCode() != 3) {
            return null;
        }
        byte[] paramData = xs0Var.getParamData();
        byte b = 0;
        if (xs0Var.getType() != 1) {
            cng cngVar = new cng();
            cngVar.setRawData(paramData);
            qhc.parseTargetInfo(cngVar, xs0Var);
            c57 c57Var = ob2Var instanceof c57 ? (c57) ob2Var : new c57(new e57(0).setPlatform((byte) 0));
            c57Var.setOpCodeSn(xs0Var.getOpCodeSn());
            c57Var.setStatus(xs0Var.getStatus());
            c57Var.setResponse(cngVar);
            return c57Var;
        }
        if (paramData == null || paramData.length < 4) {
            iBytesToInt = 0;
        } else {
            byte[] bArr = new byte[4];
            System.arraycopy(paramData, 0, bArr, 0, 4);
            iBytesToInt = pk1.bytesToInt(bArr);
            if (paramData.length >= 5) {
                b = paramData[4];
            }
        }
        return new c57(new e57(iBytesToInt).setPlatform(b)).setOpCodeSn(xs0Var.getOpCodeSn());
    }
}
