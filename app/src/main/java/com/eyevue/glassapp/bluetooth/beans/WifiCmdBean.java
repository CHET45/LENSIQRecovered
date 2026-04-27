package com.eyevue.glassapp.bluetooth.beans;

import com.eyevue.glassapp.bluetooth.HexConvert;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class WifiCmdBean extends BaseBytesBean {
    public String ssid;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public WifiCmdBean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        WifiCmdBean wifiCmdBean = new WifiCmdBean();
        try {
            wifiCmdBean.ssid = new String(HexConvert.convertList2Array(byteList), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wifiCmdBean;
    }
}
