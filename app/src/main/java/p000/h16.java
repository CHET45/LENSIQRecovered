package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class h16 extends jc2 {

    /* JADX INFO: renamed from: c */
    public byte[] f41985c;

    public byte[] getFirmwareUpdateBlockData() {
        return this.f41985c;
    }

    public h16 setFirmwareUpdateBlockData(byte[] bArr) {
        this.f41985c = bArr;
        return this;
    }

    @Override // p000.jc2
    public String toString() {
        return "FirmwareUpdateBlockResponse{firmwareUpdateBlockData=" + Arrays.toString(this.f41985c) + '}';
    }
}
