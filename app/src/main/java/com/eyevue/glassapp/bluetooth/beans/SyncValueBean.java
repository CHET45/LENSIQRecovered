package com.eyevue.glassapp.bluetooth.beans;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SyncValueBean extends BaseBytesBean {
    public boolean isImport;
    public boolean isNod;
    public boolean isPlayMusic;
    public boolean isShakeHand;
    public boolean isTakeAudio;
    public boolean isTakePhoto;
    public boolean isTakeVideo;
    public boolean isVolumeDown;
    public boolean isVolumeUp;
    public boolean isWear;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    public String toString() {
        return "SyncValueBean{isTakePhoto=" + this.isTakePhoto + ", isTakeVideo=" + this.isTakeVideo + ", isTakeAudio=" + this.isTakeAudio + ", isVolumeUp=" + this.isVolumeUp + ", isVolumeDown=" + this.isVolumeDown + ", isNod=" + this.isNod + ", isShakeHand=" + this.isShakeHand + ", isPlayMusic=" + this.isPlayMusic + ", isWear=" + this.isWear + ", isImport=" + this.isImport + '}';
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public SyncValueBean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        SyncValueBean syncValueBean = new SyncValueBean();
        if (byteList.size() >= 9) {
            syncValueBean.isTakePhoto = byteList.get(0).intValue() == 1;
            syncValueBean.isTakeAudio = byteList.get(1).intValue() == 1;
            syncValueBean.isTakeVideo = byteList.get(2).intValue() == 1;
            syncValueBean.isVolumeUp = byteList.get(3).intValue() == 1;
            syncValueBean.isVolumeDown = byteList.get(4).intValue() == 1;
            syncValueBean.isNod = byteList.get(5).intValue() == 1;
            syncValueBean.isShakeHand = byteList.get(6).intValue() == 1;
            syncValueBean.isPlayMusic = byteList.get(7).intValue() == 1;
            syncValueBean.isWear = byteList.get(8).intValue() == 1;
        }
        if (byteList.size() >= 10) {
            syncValueBean.isImport = byteList.get(9).intValue() == 1;
        }
        return syncValueBean;
    }
}
