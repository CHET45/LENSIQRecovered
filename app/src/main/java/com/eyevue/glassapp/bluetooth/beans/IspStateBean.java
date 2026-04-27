package com.eyevue.glassapp.bluetooth.beans;

import com.eyevue.glassapp.bluetooth.HexConvert;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class IspStateBean extends BaseBytesBean {
    public byte state;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public IspStateBean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        IspStateBean ispStateBean = new IspStateBean();
        byte[] bArrConvertList2Array = HexConvert.convertList2Array(byteList);
        if (bArrConvertList2Array.length > 0) {
            ispStateBean.state = bArrConvertList2Array[0];
        }
        return ispStateBean;
    }
}
