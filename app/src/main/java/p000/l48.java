package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class l48 extends ys0 {

    /* JADX INFO: renamed from: c */
    public byte[] f56136c;

    public l48() {
    }

    @Override // p000.ys0, p000.eq7
    public byte[] getParamData() {
        return this.f56136c;
    }

    public byte[] getUpdateFileFlagData() {
        return this.f56136c;
    }

    public void setUpdateFileFlagData(byte[] bArr) {
        this.f56136c = bArr;
    }

    @Override // p000.ys0
    public String toString() {
        return "InquireUpdateParam{updateFileFlagData=" + Arrays.toString(this.f56136c) + '}';
    }

    public l48(byte[] bArr) {
        setUpdateFileFlagData(bArr);
    }
}
