package com.eyevue.glassapp.bluetooth.beans;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class Common2Bean extends BaseBytesBean {
    public int value1 = 0;
    public int value2 = 0;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public List<Integer> convertBytes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.value1));
        arrayList.add(Integer.valueOf(this.value2));
        return arrayList;
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public Common2Bean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        Common2Bean common2Bean = new Common2Bean();
        common2Bean.value1 = byteList.get(0).intValue();
        common2Bean.value2 = byteList.get(1).intValue();
        return common2Bean;
    }
}
