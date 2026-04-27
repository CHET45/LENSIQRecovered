package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class r27 {
    public static byte[] generate16kMono16bitSilence() {
        byte[] bArr = new byte[(int) (((double) 16000) * 0.2d * ((double) 1) * ((double) 2))];
        Arrays.fill(bArr, (byte) 0);
        return bArr;
    }
}
