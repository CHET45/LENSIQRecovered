package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class rg3 extends ArrayList<qg3> {
    public qg3 getDataInfo(xs0 xs0Var) {
        int size = size();
        int i = 0;
        while (i < size) {
            qg3 qg3Var = get(i);
            i++;
            qg3 qg3Var2 = qg3Var;
            if (qg3Var2.getBasePacket().getOpCode() == xs0Var.getOpCode() && qg3Var2.getBasePacket().getOpCodeSn() == xs0Var.getOpCodeSn()) {
                return qg3Var2;
            }
        }
        return null;
    }
}
