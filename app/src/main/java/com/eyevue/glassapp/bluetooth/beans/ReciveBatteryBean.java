package com.eyevue.glassapp.bluetooth.beans;

import com.eyevue.glassapp.bluetooth.HexConvert;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ReciveBatteryBean extends BaseBytesBean {
    public boolean isCharging = false;
    public int value;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public ReciveBatteryBean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        ReciveBatteryBean reciveBatteryBean = new ReciveBatteryBean();
        byte[] bArrConvertList2Array = HexConvert.convertList2Array(byteList);
        if (bArrConvertList2Array.length >= 2) {
            int i = bArrConvertList2Array[1] & 255;
            boolean z = byteList.get(0).intValue() == 1;
            reciveBatteryBean.value = i;
            reciveBatteryBean.isCharging = z;
        }
        return reciveBatteryBean;
    }
}
