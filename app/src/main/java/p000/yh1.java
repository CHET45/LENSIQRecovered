package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class yh1 implements k50<byte[]> {

    /* JADX INFO: renamed from: a */
    public static final String f101464a = "ByteArrayPool";

    @Override // p000.k50
    public int getElementSizeInBytes() {
        return 1;
    }

    @Override // p000.k50
    public String getTag() {
        return f101464a;
    }

    @Override // p000.k50
    public int getArrayLength(byte[] bArr) {
        return bArr.length;
    }

    @Override // p000.k50
    public byte[] newArray(int i) {
        return new byte[i];
    }
}
