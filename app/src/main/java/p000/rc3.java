package p000;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class rc3 implements rp7 {
    @Override // p000.rp7
    public ob2 parseDataToCmd(xs0 xs0Var, ob2 ob2Var) {
        if (xs0Var == null || xs0Var.getOpCode() != 255) {
            return null;
        }
        byte[] paramData = xs0Var.getParamData();
        int i = xs0Var.getHasResponse() == 1 ? 2 : 1;
        if (xs0Var.getType() == 1) {
            byte[] bArr = new byte[0];
            if (paramData == null || paramData.length <= 0) {
                paramData = bArr;
            }
            id3 id3Var = new id3(paramData);
            id3Var.setXmOpCode(xs0Var.getXmOpCode());
            qc3 qc3Var = new qc3(i, id3Var);
            qc3Var.setOpCodeSn(xs0Var.getOpCodeSn());
            return qc3Var;
        }
        jd3 jd3Var = new jd3();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(xs0Var.getXmOpCode());
        try {
            byteArrayOutputStream.write(paramData);
        } catch (Exception e) {
            e.printStackTrace();
        }
        jd3Var.setRawData(byteArrayOutputStream.toByteArray());
        jd3Var.setData(paramData);
        jd3Var.setXmOpCode(xs0Var.getXmOpCode());
        qc3 qc3Var2 = ob2Var instanceof qc3 ? (qc3) ob2Var : new qc3(i, new id3(new byte[0]));
        qc3Var2.setOpCodeSn(xs0Var.getOpCodeSn());
        qc3Var2.setStatus(xs0Var.getStatus());
        qc3Var2.setResponse(jd3Var);
        return qc3Var2;
    }
}
