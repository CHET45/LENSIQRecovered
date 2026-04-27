package p000;

/* JADX INFO: loaded from: classes6.dex */
public class f47 implements rp7 {
    @Override // p000.rp7
    public ob2 parseDataToCmd(xs0 xs0Var, ob2 ob2Var) {
        String str;
        if (xs0Var == null || xs0Var.getOpCode() != 212) {
            return null;
        }
        byte[] paramData = xs0Var.getParamData();
        if (xs0Var.getType() == 1) {
            return new e47().setOpCodeSn(xs0Var.getOpCodeSn());
        }
        if (paramData == null || paramData.length < 32) {
            str = "";
        } else {
            try {
                str = new String(paramData, 0, 32);
            } catch (Exception e) {
                e.printStackTrace();
                str = "";
            }
        }
        g47 g47Var = new g47(str);
        g47Var.setRawData(paramData);
        e47 e47Var = ob2Var instanceof e47 ? (e47) ob2Var : new e47();
        e47Var.setOpCodeSn(xs0Var.getOpCodeSn());
        e47Var.setResponse(g47Var);
        e47Var.setStatus(xs0Var.getStatus());
        return e47Var;
    }
}
