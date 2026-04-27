package p000;

/* JADX INFO: loaded from: classes6.dex */
public class w7c implements rp7 {
    @Override // p000.rp7
    public ob2 parseDataToCmd(xs0 xs0Var, ob2 ob2Var) {
        int i;
        int iBytesToInt;
        int iBytesToInt2;
        if (xs0Var == null) {
            return null;
        }
        int opCode = xs0Var.getOpCode();
        if (opCode == 225 || opCode == 226 || opCode == 227 || opCode == 228 || opCode == 229 || opCode == 230 || opCode == 231 || opCode == 232) {
            byte[] paramData = xs0Var.getParamData();
            int iBytesToInt3 = 0;
            if (xs0Var.getType() == 1) {
                switch (opCode) {
                    case 225:
                        return new y57().setOpCodeSn(xs0Var.getOpCodeSn());
                    case nb2.f63860h /* 226 */:
                        byte[] bArr = new byte[0];
                        if (paramData == null || paramData.length <= 0) {
                            paramData = bArr;
                        }
                        return new k48(new l48(paramData)).setOpCodeSn(xs0Var.getOpCodeSn());
                    case nb2.f63861i /* 227 */:
                        return new h35().setOpCodeSn(xs0Var.getOpCodeSn());
                    case nb2.f63862j /* 228 */:
                        return new u95().setOpCodeSn(xs0Var.getOpCodeSn());
                    case nb2.f63863k /* 229 */:
                        if (paramData == null || paramData.length < 6) {
                            iBytesToInt = 0;
                        } else {
                            byte[] bArr2 = new byte[4];
                            System.arraycopy(paramData, 0, bArr2, 0, 4);
                            iBytesToInt3 = pk1.bytesToInt(bArr2);
                            iBytesToInt = pk1.bytesToInt(paramData[4], paramData[5]);
                        }
                        return new f16(new g16(iBytesToInt3, iBytesToInt)).setOpCodeSn(xs0Var.getOpCodeSn());
                    case nb2.f63864l /* 230 */:
                        return new j16().setOpCodeSn(xs0Var.getOpCodeSn());
                    case 231:
                        if (paramData != null && paramData.length > 0) {
                            iBytesToInt3 = pk1.byteToInt(paramData[0]);
                        }
                        return new dsd(new esd(iBytesToInt3)).setOpCodeSn(xs0Var.getOpCodeSn());
                    case nb2.f63866n /* 232 */:
                        if (paramData == null || paramData.length < 4) {
                            iBytesToInt2 = 0;
                        } else {
                            byte[] bArr3 = new byte[4];
                            System.arraycopy(paramData, 0, bArr3, 0, 4);
                            iBytesToInt2 = pk1.bytesToInt(bArr3);
                            if (paramData.length >= 8) {
                                System.arraycopy(paramData, 4, bArr3, 0, 4);
                                iBytesToInt3 = pk1.bytesToInt(bArr3);
                            }
                        }
                        return new uhb(new vhb(iBytesToInt2).setCurrentProgress(iBytesToInt3)).setOpCodeSn(xs0Var.getOpCodeSn());
                }
            }
            int iByteToInt = -1;
            switch (opCode) {
                case 225:
                    if (paramData == null || paramData.length < 6) {
                        i = 0;
                    } else {
                        byte[] bArr4 = new byte[4];
                        System.arraycopy(paramData, 0, bArr4, 0, 4);
                        int iBytesToInt4 = pk1.bytesToInt(bArr4);
                        iBytesToInt3 = pk1.bytesToInt(paramData[4], paramData[5]);
                        i = iBytesToInt4;
                    }
                    kwh kwhVar = new kwh();
                    kwhVar.setRawData(paramData);
                    kwhVar.setUpdateFileFlagOffset(i);
                    kwhVar.setUpdateFileFlagLen(iBytesToInt3);
                    y57 y57Var = ob2Var instanceof y57 ? (y57) ob2Var : new y57();
                    y57Var.setOpCodeSn(xs0Var.getOpCodeSn());
                    y57Var.setStatus(xs0Var.getStatus());
                    y57Var.setResponse(kwhVar);
                    return y57Var;
                case nb2.f63860h /* 226 */:
                    if (paramData != null && paramData.length > 0) {
                        iByteToInt = pk1.byteToInt(paramData[0]);
                    }
                    m48 m48Var = new m48(iByteToInt);
                    m48Var.setRawData(paramData);
                    k48 k48Var = ob2Var instanceof k48 ? (k48) ob2Var : new k48(new l48(new byte[0]));
                    k48Var.setOpCodeSn(xs0Var.getOpCodeSn());
                    k48Var.setStatus(xs0Var.getStatus());
                    k48Var.setResponse(m48Var);
                    return k48Var;
                case nb2.f63861i /* 227 */:
                    if (paramData != null && paramData.length > 0) {
                        iByteToInt = pk1.byteToInt(paramData[0]);
                    }
                    i35 i35Var = new i35(iByteToInt);
                    i35Var.setRawData(paramData);
                    h35 h35Var = ob2Var instanceof h35 ? (h35) ob2Var : new h35();
                    h35Var.setOpCodeSn(xs0Var.getOpCodeSn());
                    h35Var.setStatus(xs0Var.getStatus());
                    h35Var.setResponse(i35Var);
                    return h35Var;
                case nb2.f63862j /* 228 */:
                    if (paramData != null && paramData.length > 0) {
                        iBytesToInt3 = pk1.byteToInt(paramData[0]);
                    }
                    v95 v95Var = new v95(iBytesToInt3);
                    v95Var.setRawData(paramData);
                    u95 u95Var = ob2Var instanceof u95 ? (u95) ob2Var : new u95();
                    u95Var.setOpCodeSn(xs0Var.getOpCodeSn());
                    u95Var.setStatus(xs0Var.getStatus());
                    u95Var.setResponse(v95Var);
                    return u95Var;
                case nb2.f63863k /* 229 */:
                    byte[] bArr5 = new byte[0];
                    if (paramData != null && paramData.length > 0) {
                        bArr5 = paramData;
                    }
                    h16 h16Var = new h16();
                    h16Var.setRawData(paramData);
                    h16Var.setFirmwareUpdateBlockData(bArr5);
                    f16 f16Var = ob2Var instanceof f16 ? (f16) ob2Var : new f16(new g16(0, 0));
                    f16Var.setOpCodeSn(xs0Var.getOpCodeSn());
                    f16Var.setStatus(xs0Var.getStatus());
                    f16Var.setResponse(h16Var);
                    return f16Var;
                case nb2.f63864l /* 230 */:
                    if (paramData != null && paramData.length > 0) {
                        iByteToInt = pk1.byteToInt(paramData[0]);
                    }
                    k16 k16Var = new k16(iByteToInt);
                    k16Var.setRawData(paramData);
                    j16 j16Var = ob2Var instanceof j16 ? (j16) ob2Var : new j16();
                    j16Var.setOpCodeSn(xs0Var.getOpCodeSn());
                    j16Var.setStatus(xs0Var.getStatus());
                    j16Var.setResponse(k16Var);
                    return j16Var;
                case 231:
                    if (paramData != null && paramData.length > 0) {
                        iByteToInt = pk1.byteToInt(paramData[0]);
                    }
                    fsd fsdVar = new fsd(iByteToInt);
                    fsdVar.setRawData(paramData);
                    dsd dsdVar = ob2Var instanceof dsd ? (dsd) ob2Var : new dsd(new esd(0));
                    dsdVar.setOpCodeSn(xs0Var.getOpCodeSn());
                    dsdVar.setStatus(xs0Var.getStatus());
                    dsdVar.setResponse(fsdVar);
                    return dsdVar;
                case nb2.f63866n /* 232 */:
                    jc2 jc2Var = new jc2();
                    jc2Var.setRawData(paramData);
                    uhb uhbVar = ob2Var instanceof uhb ? (uhb) ob2Var : new uhb(new vhb(0));
                    uhbVar.setOpCodeSn(xs0Var.getOpCodeSn());
                    uhbVar.setStatus(xs0Var.getStatus());
                    uhbVar.setResponse(jc2Var);
                    return uhbVar;
            }
        }
        return null;
    }
}
