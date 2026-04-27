package com.eyevue.glassapp.bluetooth.beans;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CommonBean extends BaseBytesBean {
    public int value;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public List<Integer> convertBytes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.value));
        return arrayList;
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public CommonBean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        CommonBean commonBean = new CommonBean();
        commonBean.value = byteList.get(0).intValue();
        return commonBean;
    }
}
