package p000;

/* JADX INFO: loaded from: classes6.dex */
public class m7f implements rp7 {
    @Override // p000.rp7
    public ob2 parseDataToCmd(xs0 xs0Var, ob2 ob2Var) {
        if (xs0Var == null || xs0Var.getOpCode() != 209) {
            return null;
        }
        byte[] paramData = xs0Var.getParamData();
        int iBytesToInt = 530;
        if (xs0Var.getType() == 1) {
            if (paramData != null && paramData.length >= 2) {
                iBytesToInt = pk1.bytesToInt(paramData[0], paramData[1]);
            }
            return new l7f(new n7f(iBytesToInt)).setOpCodeSn(xs0Var.getOpCodeSn());
        }
        o7f o7fVar = new o7f(530);
        o7fVar.setRawData(paramData);
        if (paramData != null && paramData.length >= 2) {
            o7fVar.setRealMtu(pk1.bytesToInt(paramData[0], paramData[1]));
        }
        l7f l7fVar = ob2Var instanceof l7f ? (l7f) ob2Var : new l7f(new n7f(530));
        l7fVar.setOpCodeSn(xs0Var.getOpCodeSn());
        l7fVar.setStatus(xs0Var.getStatus());
        l7fVar.setResponse(o7fVar);
        return l7fVar;
    }
}
