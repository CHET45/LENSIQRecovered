package com.eyevue.glassapp.bluetooth.beans;

import com.eyevue.glassapp.bluetooth.HexConvert;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PhotoValueBean extends BaseBytesBean {
    public byte[] value;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public PhotoValueBean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        PhotoValueBean photoValueBean = new PhotoValueBean();
        photoValueBean.value = HexConvert.convertList2Array(byteList);
        return photoValueBean;
    }
}
