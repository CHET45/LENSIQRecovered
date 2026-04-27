package com.eyevue.glassapp.bluetooth.beans;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CommonValue2Bean extends BaseBytesBean {
    public int value;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public CommonValue2Bean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        CommonValue2Bean commonValue2Bean = new CommonValue2Bean();
        if (byteList.size() < 2) {
            return null;
        }
        commonValue2Bean.value = byteList.get(1).intValue() | (byteList.get(0).intValue() << 8);
        return commonValue2Bean;
    }
}
