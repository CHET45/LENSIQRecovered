package com.eyevue.glassapp.bluetooth.beans;

import com.eyevue.glassapp.bluetooth.HexConvert;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DirectionValueBean extends BaseBytesBean {
    public byte direction;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public DirectionValueBean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        DirectionValueBean directionValueBean = new DirectionValueBean();
        byte[] bArrConvertList2Array = HexConvert.convertList2Array(byteList);
        if (bArrConvertList2Array.length > 0) {
            directionValueBean.direction = bArrConvertList2Array[0];
        }
        return directionValueBean;
    }
}
