package p000;

/* JADX INFO: loaded from: classes6.dex */
public class iqd implements rp7 {

    /* JADX INFO: renamed from: a */
    public static final String f47973a = "RcspCmdHandler";

    @Override // p000.rp7
    public ob2 parseDataToCmd(xs0 xs0Var, ob2 ob2Var) {
        tb2 tb2Var;
        int type = 0;
        boolean z = xs0Var.getType() == 1;
        boolean z2 = xs0Var.getHasResponse() == 1;
        if (xs0Var.getParamData() != null && xs0Var.getParamData().length > 0) {
            type = 1;
        }
        if (z) {
            if (z2) {
                type = type != 0 ? 3 : 2;
            }
        } else {
            if (ob2Var == null) {
                byte[] bArrPackSendBasePacket = qhc.packSendBasePacket(xs0Var);
                dh8.m9160w(f47973a, " unknown data ::::::: " + pk1.byte2HexStr(bArrPackSendBasePacket));
                return null;
            }
            type = ob2Var.getType();
        }
        if (type == 1) {
            ys0 ys0Var = new ys0();
            ys0Var.setXmOpCode(xs0Var.getXmOpCode());
            ys0Var.setParamData(xs0Var.getParamData());
            sb2 sb2Var = new sb2(xs0Var.getOpCode(), sb2.class.getSimpleName(), ys0Var);
            sb2Var.setOpCodeSn(xs0Var.getOpCodeSn()).setStatus(xs0Var.getStatus());
            return sb2Var;
        }
        if (type != 2) {
            if (type != 3) {
                return new ob2(xs0Var.getOpCode(), ob2.class.getSimpleName()).setOpCodeSn(xs0Var.getOpCodeSn()).setStatus(xs0Var.getStatus());
            }
            ub2 ub2Var = new ub2(xs0Var.getOpCode(), ub2.class.getSimpleName());
            if (!z) {
                jc2 jc2Var = new jc2();
                jc2Var.setRawData(xs0Var.getParamData());
                jc2Var.setXmOpCode(xs0Var.getXmOpCode());
                ub2Var.setResponse(jc2Var);
            }
            ub2Var.setOpCodeSn(xs0Var.getOpCodeSn());
            ub2Var.setStatus(xs0Var.getStatus());
            return ub2Var;
        }
        ys0 ys0Var2 = new ys0();
        ys0Var2.setXmOpCode(xs0Var.getXmOpCode());
        if (z) {
            ys0Var2.setParamData(xs0Var.getParamData());
            tb2Var = new tb2(xs0Var.getOpCode(), tb2.class.getSimpleName(), ys0Var2);
        } else {
            if (ob2Var.getParam() != null) {
                ys0Var2.setParamData(ob2Var.getParam().getParamData());
            }
            tb2Var = new tb2(xs0Var.getOpCode(), tb2.class.getSimpleName(), ys0Var2);
            jc2 jc2Var2 = new jc2();
            jc2Var2.setRawData(xs0Var.getParamData());
            jc2Var2.setXmOpCode(xs0Var.getXmOpCode());
            tb2Var.setResponse(jc2Var2);
        }
        tb2Var.setOpCodeSn(xs0Var.getOpCodeSn());
        tb2Var.setStatus(xs0Var.getStatus());
        return tb2Var;
    }
}
