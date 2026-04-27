package p000;

/* JADX INFO: loaded from: classes6.dex */
public class rhb implements rp7 {
    @Override // p000.rp7
    public ob2 parseDataToCmd(xs0 xs0Var, ob2 ob2Var) {
        int iByteToInt;
        if (xs0Var == null || xs0Var.getOpCode() != 11) {
            return null;
        }
        byte[] paramData = xs0Var.getParamData();
        if (xs0Var.getType() == 1) {
            if (paramData == null || paramData.length <= 0) {
                iByteToInt = 0;
            } else {
                iByteToInt = pk1.byteToInt(paramData[0]);
                iByteToInt = paramData.length > 1 ? pk1.byteToInt(paramData[1]) : 0;
            }
            return new qhb(new shb(iByteToInt, iByteToInt)).setOpCodeSn(xs0Var.getOpCodeSn());
        }
        thb thbVar = new thb();
        thbVar.setRawData(paramData);
        if (paramData != null && paramData.length >= 1) {
            thbVar.setFlag(pk1.byteToInt(paramData[0]));
        }
        qhb qhbVar = ob2Var instanceof qhb ? (qhb) ob2Var : new qhb(new shb(0, 0));
        qhbVar.setOpCodeSn(xs0Var.getOpCodeSn());
        qhbVar.setStatus(xs0Var.getStatus());
        qhbVar.setResponse(thbVar);
        return qhbVar;
    }
}
