package com.eyevue.glassapp.bluetooth.beans;

import com.eyevue.glassapp.bluetooth.HexConvert;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BatteryBean extends BaseBytesBean {
    public boolean isCharging = false;
    public int value;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public BatteryBean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        BatteryBean batteryBean = new BatteryBean();
        byte[] bArrConvertList2Array = HexConvert.convertList2Array(byteList);
        if (bArrConvertList2Array.length >= 2) {
            batteryBean.value = ((bArrConvertList2Array[0] & 15) * 10) + (bArrConvertList2Array[1] & 15);
        }
        if (bArrConvertList2Array.length >= 3) {
            batteryBean.isCharging = byteList.get(2).intValue() == 1;
        }
        return batteryBean;
    }
}
