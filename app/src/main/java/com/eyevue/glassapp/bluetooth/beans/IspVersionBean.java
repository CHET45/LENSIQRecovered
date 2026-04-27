package com.eyevue.glassapp.bluetooth.beans;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class IspVersionBean extends BaseBytesBean {
    public String value;

    public List<Integer> convertStringToBytes() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.value.split("\\.")) {
            int i = Integer.parseInt(str);
            if (i >= 0 && i <= 255) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }
}
