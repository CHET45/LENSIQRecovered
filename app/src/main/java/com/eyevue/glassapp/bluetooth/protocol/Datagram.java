package com.eyevue.glassapp.bluetooth.protocol;

import java.util.ArrayList;
import java.util.List;
import p000.efb;

/* JADX INFO: loaded from: classes4.dex */
public class Datagram {
    private static final int CHANNEL_BLE = 2;
    private static final int CHANNEL_SPP = 1;
    private static final int EOF_SPP = 22610;
    private static final int SOF_APP_BLE = 43861;
    private static final int SOF_BLE_APP = 44117;
    private static final int SOF_SPP = 21080;
    public LeHeader leHeader = new LeHeader();
    public SppHeader sppHeader = new SppHeader();

    public List<Integer> convertHeaderToCrcBytes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.leHeader.commandId));
        List<Integer> list = this.leHeader.payload;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public List<Integer> convertLeHeaderToBytes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(171);
        arrayList.add(85);
        arrayList.add(Integer.valueOf((this.leHeader.len >> 8) & 255));
        arrayList.add(Integer.valueOf(this.leHeader.len & 255));
        arrayList.add(Integer.valueOf(this.leHeader.commandId));
        List<Integer> list = this.leHeader.payload;
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(Integer.valueOf(getBytesCrc() & 255));
        return arrayList;
    }

    public List<Integer> convertSppHeaderToBytes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(82);
        arrayList.add(88);
        arrayList.add(Integer.valueOf((this.sppHeader.len >> 8) & 255));
        arrayList.add(Integer.valueOf(this.sppHeader.len & 255));
        arrayList.add(Integer.valueOf(this.sppHeader.commandId));
        List<Integer> list = this.sppHeader.payload;
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(Integer.valueOf(getBytesCrc() & 255));
        arrayList.add(88);
        arrayList.add(82);
        return arrayList;
    }

    public int getBytesCrc() {
        List<Integer> listConvertHeaderToCrcBytes = convertHeaderToCrcBytes();
        int iIntValue = 0;
        for (int i = 0; i < listConvertHeaderToCrcBytes.size(); i++) {
            iIntValue += listConvertHeaderToCrcBytes.get(i).intValue();
        }
        return iIntValue & 255;
    }

    public Datagram recoverBytesToDatagram(List<Integer> bytes) {
        Datagram datagram = new Datagram();
        int iIntValue = (bytes.get(0).intValue() << 8) | bytes.get(1).intValue();
        if (iIntValue == SOF_BLE_APP) {
            datagram.leHeader.len = (bytes.get(2).intValue() << 8) | bytes.get(3).intValue();
            datagram.leHeader.commandId = bytes.get(4).intValue();
            datagram.leHeader.payload = bytes.subList(5, bytes.size() - 1);
            datagram.leHeader.crc = bytes.get(bytes.size() - 1).intValue();
        } else if (iIntValue == 21080) {
            datagram.sppHeader.len = (bytes.get(2).intValue() << 8) | bytes.get(3).intValue();
            datagram.sppHeader.commandId = bytes.get(4).intValue();
            datagram.sppHeader.payload = bytes.subList(5, bytes.size() - 1);
            datagram.sppHeader.crc = bytes.get(bytes.size() - 1).intValue();
            bytes.get(bytes.size() - 2).intValue();
            bytes.get(bytes.size() - 1).intValue();
        }
        return datagram;
    }

    @efb
    public String toString() {
        return "Datagram{\nleHeader=" + this.leHeader + "\n}";
    }
}
