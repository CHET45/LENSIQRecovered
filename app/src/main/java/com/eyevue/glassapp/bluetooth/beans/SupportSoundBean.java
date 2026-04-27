package com.eyevue.glassapp.bluetooth.beans;

import com.eyevue.glassapp.bluetooth.HexConvert;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SupportSoundBean extends BaseBytesBean {
    public boolean support;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public SupportSoundBean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        SupportSoundBean supportSoundBean = new SupportSoundBean();
        byte[] bArrConvertList2Array = HexConvert.convertList2Array(byteList);
        if (bArrConvertList2Array.length > 0) {
            supportSoundBean.support = bArrConvertList2Array[0] == 1;
        }
        return supportSoundBean;
    }
}
