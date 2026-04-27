package com.eyevue.glassapp.bluetooth.beans;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class VolumeValueBean extends BaseBytesBean {
    public int callVolume;
    public int mediaVolume;
    public int systemVolume;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public VolumeValueBean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        VolumeValueBean volumeValueBean = new VolumeValueBean();
        if (byteList.size() >= 3) {
            volumeValueBean.systemVolume = byteList.get(0).intValue();
            volumeValueBean.mediaVolume = byteList.get(1).intValue();
            volumeValueBean.callVolume = byteList.get(2).intValue();
        }
        return volumeValueBean;
    }
}
