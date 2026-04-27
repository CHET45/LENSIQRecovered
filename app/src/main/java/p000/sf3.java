package p000;

/* JADX INFO: loaded from: classes6.dex */
public class sf3 implements rp7 {
    @Override // p000.rp7
    public ob2 parseDataToCmd(xs0 xs0Var, ob2 ob2Var) {
        if (xs0Var == null || xs0Var.getOpCode() != 1) {
            return null;
        }
        if (xs0Var.getType() == 1) {
            return xs0Var.getHasResponse() == 0 ? new rf3((wg3) new wg3(xs0Var.getParamData()).setXmOpCode(xs0Var.getXmOpCode())).setOpCodeSn(xs0Var.getOpCodeSn()) : new pg3((wg3) new wg3(xs0Var.getParamData()).setXmOpCode(xs0Var.getXmOpCode())).setOpCodeSn(xs0Var.getOpCodeSn());
        }
        jc2 jc2Var = new jc2();
        jc2Var.setRawData(xs0Var.getParamData());
        jc2Var.setXmOpCode(xs0Var.getXmOpCode());
        pg3 pg3Var = ob2Var instanceof pg3 ? (pg3) ob2Var : new pg3(new wg3(new byte[0]));
        pg3Var.setOpCodeSn(xs0Var.getOpCodeSn());
        pg3Var.setStatus(xs0Var.getStatus());
        pg3Var.setResponse(jc2Var);
        return pg3Var;
    }
}
