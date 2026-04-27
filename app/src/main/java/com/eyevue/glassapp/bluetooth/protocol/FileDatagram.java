package com.eyevue.glassapp.bluetooth.protocol;

import java.util.ArrayList;
import java.util.List;
import p000.efb;

/* JADX INFO: loaded from: classes4.dex */
public class FileDatagram {
    private static final int SOF_SPP = 21080;
    public FileHeader fileHeader = new FileHeader();

    public List<Integer> convertHeaderToCrc2Bytes() {
        return this.fileHeader.payload;
    }

    public List<Integer> convertHeaderToCrcBytes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(82);
        arrayList.add(88);
        arrayList.add(Integer.valueOf((this.fileHeader.address >> 24) & 255));
        arrayList.add(Integer.valueOf((this.fileHeader.address >> 16) & 255));
        arrayList.add(Integer.valueOf((this.fileHeader.address >> 8) & 255));
        arrayList.add(Integer.valueOf(this.fileHeader.address & 255));
        arrayList.add(Integer.valueOf(this.fileHeader.len & 255));
        this.fileHeader.crc = getBytesCrc();
        arrayList.add(Integer.valueOf(this.fileHeader.crc & 255));
        return arrayList;
    }

    public List<Integer> convertLeHeaderToBytes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(82);
        arrayList.add(88);
        arrayList.add(Integer.valueOf((this.fileHeader.address >> 24) & 255));
        arrayList.add(Integer.valueOf((this.fileHeader.address >> 16) & 255));
        arrayList.add(Integer.valueOf((this.fileHeader.address >> 8) & 255));
        arrayList.add(Integer.valueOf(this.fileHeader.address & 255));
        arrayList.add(Integer.valueOf(this.fileHeader.len & 255));
        this.fileHeader.crc = getBytesCrc();
        arrayList.add(Integer.valueOf(this.fileHeader.crc & 255));
        this.fileHeader.crc2 = getBytesCrc2();
        arrayList.add(Integer.valueOf((this.fileHeader.crc2 >> 8) & 255));
        arrayList.add(Integer.valueOf(this.fileHeader.crc2 & 255));
        List<Integer> list = this.fileHeader.payload;
        if (list != null) {
            arrayList.addAll(list);
        }
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

    public int getBytesCrc2() {
        List<Integer> listConvertHeaderToCrc2Bytes = convertHeaderToCrc2Bytes();
        int iIntValue = 0;
        for (int i = 0; i < listConvertHeaderToCrc2Bytes.size(); i++) {
            iIntValue += listConvertHeaderToCrc2Bytes.get(i).intValue();
        }
        return 65535 & iIntValue;
    }

    public FileDatagram recoverBytesToDatagram(List<Integer> bytes) {
        FileDatagram fileDatagram = new FileDatagram();
        fileDatagram.fileHeader.len = (bytes.get(2).intValue() << 8) | bytes.get(3).intValue();
        fileDatagram.fileHeader.commandId = bytes.get(4).intValue();
        fileDatagram.fileHeader.crc = bytes.get(bytes.size() - 3).intValue();
        fileDatagram.fileHeader.payload = bytes.subList(5, bytes.size() - 3);
        return fileDatagram;
    }

    @efb
    public String toString() {
        return "FileDatagram{fileHeader=" + this.fileHeader + '}';
    }
}
