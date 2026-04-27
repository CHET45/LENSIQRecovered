package com.eyevue.glassapp.bluetooth.beans;

import com.eyevue.glassapp.bluetooth.HexConvert;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CustomerCmdBean extends BaseBytesBean {
    public String customer;
    public String project;

    public static String filterNullBytes(byte[] bytes) {
        if (bytes == null) {
            return "";
        }
        int i = 0;
        for (byte b : bytes) {
            if (b != 0) {
                i++;
            }
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (byte b2 : bytes) {
            if (b2 != 0) {
                bArr[i2] = b2;
                i2++;
            }
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public CustomerCmdBean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        CustomerCmdBean customerCmdBean = new CustomerCmdBean();
        byte[] bArrConvertList2Array = HexConvert.convertList2Array(byteList);
        try {
            if (bArrConvertList2Array.length >= 8) {
                byte[] bArr = new byte[4];
                byte[] bArr2 = new byte[4];
                System.arraycopy(bArrConvertList2Array, 0, bArr, 0, 4);
                System.arraycopy(bArrConvertList2Array, 4, bArr2, 0, 4);
                customerCmdBean.project = filterNullBytes(bArr);
                customerCmdBean.customer = filterNullBytes(bArr2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerCmdBean;
    }
}
