package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class ys0 implements eq7 {

    /* JADX INFO: renamed from: a */
    public int f102812a = -1;

    /* JADX INFO: renamed from: b */
    public byte[] f102813b;

    @Override // p000.eq7
    public byte[] getParamData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.f102812a;
        if (i != -1) {
            byteArrayOutputStream.write(i);
        }
        byte[] bArr = this.f102813b;
        if (bArr != null && bArr.length > 0) {
            try {
                byteArrayOutputStream.write(bArr);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public int getXmOpCode() {
        return this.f102812a;
    }

    public ys0 setParamData(byte[] bArr) {
        this.f102813b = bArr;
        return this;
    }

    public ys0 setXmOpCode(int i) {
        this.f102812a = i;
        return this;
    }

    public String toString() {
        return "BaseParameter{xmOpCode=" + this.f102812a + '}';
    }
}
