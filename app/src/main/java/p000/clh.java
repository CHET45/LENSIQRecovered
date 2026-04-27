package p000;

/* JADX INFO: loaded from: classes6.dex */
public class clh implements rp7 {
    @Override // p000.rp7
    public ob2 parseDataToCmd(xs0 xs0Var, ob2 ob2Var) {
        if (xs0Var == null) {
            return null;
        }
        int opCode = xs0Var.getOpCode();
        if (opCode == 194 || opCode == 195 || opCode == 196) {
            byte[] paramData = xs0Var.getParamData();
            int iByteToInt = 0;
            if (xs0Var.getType() == 1) {
                switch (opCode) {
                    case nb2.f63870r /* 194 */:
                        phb phbVar = new phb();
                        qhc.parseNotifyADVInfo(phbVar, xs0Var);
                        return new ohb(phbVar).setOpCodeSn(xs0Var.getOpCodeSn());
                    case nb2.f63871s /* 195 */:
                        if (paramData != null && paramData.length > 0) {
                            iByteToInt = pk1.byteToInt(paramData[0]);
                        }
                        return new l6f(new m6f(iByteToInt)).setOpCodeSn(xs0Var.getOpCodeSn());
                    case nb2.f63872t /* 196 */:
                        if (paramData != null && paramData.length > 0) {
                            iByteToInt = pk1.byteToInt(paramData[0]);
                        }
                        return new r3e(new s3e(iByteToInt)).setOpCodeSn(xs0Var.getOpCodeSn());
                }
            }
            if (opCode == 195) {
                n6f n6fVar = new n6f((paramData == null || paramData.length <= 0) ? -1 : pk1.byteToInt(paramData[0]));
                n6fVar.setRawData(paramData);
                l6f l6fVar = ob2Var instanceof l6f ? (l6f) ob2Var : new l6f(new m6f(0));
                l6fVar.setOpCodeSn(xs0Var.getOpCodeSn());
                l6fVar.setStatus(xs0Var.getStatus());
                l6fVar.setResponse(n6fVar);
                return l6fVar;
            }
            if (opCode == 196) {
                jc2 jc2Var = new jc2();
                jc2Var.setRawData(paramData);
                r3e r3eVar = ob2Var instanceof r3e ? (r3e) ob2Var : new r3e(new s3e(0));
                r3eVar.setOpCodeSn(xs0Var.getOpCodeSn());
                r3eVar.setStatus(xs0Var.getStatus());
                r3eVar.setResponse(jc2Var);
                return r3eVar;
            }
        }
        return null;
    }
}
