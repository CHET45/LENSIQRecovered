package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class sc3 extends jc2 {

    /* JADX INFO: renamed from: c */
    public int f81192c;

    public int getJlOpCode() {
        return this.f81192c;
    }

    public void setJlOpCode(int i) {
        this.f81192c = i;
    }

    @Override // p000.jc2
    public String toString() {
        return "CustomCommonResponse{rawData=" + Arrays.toString(getRawData()) + "\nxmOpCode=" + getXmOpCode() + "\njlOpCode=" + this.f81192c + '}';
    }
}
