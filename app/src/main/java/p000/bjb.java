package p000;

/* JADX INFO: loaded from: classes6.dex */
public class bjb {
    public static int bytesToInt(byte[] bArr) {
        int iPow = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            iPow = (int) (((double) iPow) + (((double) bArr[length]) * Math.pow(255.0d, (bArr.length - length) - 1)));
        }
        return iPow;
    }
}
