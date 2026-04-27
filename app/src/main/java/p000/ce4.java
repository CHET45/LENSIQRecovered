package p000;

/* JADX INFO: loaded from: classes6.dex */
public class ce4 implements rp7 {
    @Override // p000.rp7
    public ob2 parseDataToCmd(xs0 xs0Var, ob2 ob2Var) {
        if (xs0Var == null || xs0Var.getOpCode() != 6) {
            return null;
        }
        byte[] paramData = xs0Var.getParamData();
        if (xs0Var.getType() == 1) {
            return new be4().setOpCodeSn(xs0Var.getOpCodeSn());
        }
        jc2 jc2Var = new jc2();
        jc2Var.setRawData(paramData);
        be4 be4Var = ob2Var instanceof be4 ? (be4) ob2Var : new be4();
        be4Var.setOpCodeSn(xs0Var.getOpCodeSn());
        be4Var.setStatus(xs0Var.getStatus());
        be4Var.setResponse(jc2Var);
        return be4Var;
    }
}
