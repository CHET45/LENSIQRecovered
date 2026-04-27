package p000;

/* JADX INFO: loaded from: classes6.dex */
public class b57 implements rp7 {
    @Override // p000.rp7
    public ob2 parseDataToCmd(xs0 xs0Var, ob2 ob2Var) {
        if (xs0Var == null || xs0Var.getOpCode() != 2) {
            return null;
        }
        byte[] paramData = xs0Var.getParamData();
        if (xs0Var.getType() == 1) {
            return new a57().setOpCodeSn(xs0Var.getOpCodeSn());
        }
        wmg wmgVar = new wmg();
        wmgVar.setRawData(paramData);
        if (paramData != null && paramData.length >= 4) {
            byte[] bArr = new byte[4];
            System.arraycopy(paramData, 0, bArr, 0, 4);
            wmgVar.setMask(pk1.bytesToInt(bArr));
        }
        a57 a57Var = ob2Var instanceof a57 ? (a57) ob2Var : new a57();
        a57Var.setOpCodeSn(xs0Var.getOpCodeSn());
        a57Var.setStatus(xs0Var.getStatus());
        a57Var.setResponse(wmgVar);
        return a57Var;
    }
}
