package com.eyevue.glassapp.bluetooth.beans;

import com.eyevue.glassapp.bluetooth.HexConvert;
import com.eyevue.glassapp.bluetooth.protocol.Command;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class WearBean extends BaseBytesBean {
    public boolean isWear;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public WearBean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        WearBean wearBean = new WearBean();
        byte[] bArrConvertList2Array = HexConvert.convertList2Array(byteList);
        if (bArrConvertList2Array.length > 0) {
            wearBean.isWear = bArrConvertList2Array[0] == Command.Param.WEAR_DETECT_ON;
        }
        return wearBean;
    }
}
