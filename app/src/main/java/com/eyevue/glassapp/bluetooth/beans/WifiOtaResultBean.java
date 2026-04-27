package com.eyevue.glassapp.bluetooth.beans;

import com.eyevue.glassapp.bluetooth.protocol.Command;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class WifiOtaResultBean extends BaseBytesBean {
    public boolean isSuccess;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public WifiOtaResultBean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        WifiOtaResultBean wifiOtaResultBean = new WifiOtaResultBean();
        wifiOtaResultBean.isSuccess = byteList.get(0).intValue() == Command.Param.WIFI_OTA_SUCCESS;
        return wifiOtaResultBean;
    }
}
