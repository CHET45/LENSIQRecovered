package com.eyevue.glassapp.bluetooth.beans;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceValueBean extends BaseBytesBean {
    public String btVersion;
    public String deviceVersion;
    public String ispVersion;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    public String toString() {
        return "DeviceValueBean{btVersion=" + this.btVersion + ", ispVersion=" + this.ispVersion + ", deviceVersion=" + this.deviceVersion + '}';
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public DeviceValueBean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        DeviceValueBean deviceValueBean = new DeviceValueBean();
        if (byteList.size() >= 7) {
            deviceValueBean.btVersion = byteList.get(0) + "." + byteList.get(1) + "." + byteList.get(2);
            deviceValueBean.ispVersion = byteList.get(3) + "." + byteList.get(4) + "." + byteList.get(5);
            StringBuilder sb = new StringBuilder();
            sb.append(byteList.get(6));
            sb.append("");
            deviceValueBean.deviceVersion = sb.toString();
        }
        return deviceValueBean;
    }
}
