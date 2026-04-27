package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class fhh {

    /* JADX INFO: renamed from: a */
    public static final Logger f36611a = Logger.getLogger(fhh.class.getName());

    /* JADX INFO: renamed from: b */
    public static final byte[] f36612b = fta.f37688d.getBytes(yw1.f103174a);

    private fhh() {
    }

    private static boolean endsWith(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSpecCompliantAscii(byte[] bArr) {
        for (byte b : bArr) {
            if (b < 32 || b > 126) {
                return false;
            }
        }
        return true;
    }

    private static byte[][] serializeHeadersWithCommasInBin(byte[][] bArr, int i) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(bArr[i2]);
        }
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            byte[] bArr3 = bArr[i + 1];
            if (endsWith(bArr2, f36612b)) {
                int i3 = 0;
                for (int i4 = 0; i4 <= bArr3.length; i4++) {
                    if (i4 == bArr3.length || bArr3[i4] == 44) {
                        byte[] bArrDecode = br0.base64().decode(new String(bArr3, i3, i4 - i3, yw1.f103174a));
                        arrayList.add(bArr2);
                        arrayList.add(bArrDecode);
                        i3 = i4 + 1;
                    }
                }
            } else {
                arrayList.add(bArr2);
                arrayList.add(bArr3);
            }
            i += 2;
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    public static byte[][] toHttp2Headers(fta ftaVar) {
        byte[][] bArrSerialize = fb8.serialize(ftaVar);
        if (bArrSerialize == null) {
            return new byte[0][];
        }
        int i = 0;
        for (int i2 = 0; i2 < bArrSerialize.length; i2 += 2) {
            byte[] bArr = bArrSerialize[i2];
            byte[] bArr2 = bArrSerialize[i2 + 1];
            if (endsWith(bArr, f36612b)) {
                bArrSerialize[i] = bArr;
                bArrSerialize[i + 1] = fb8.f36009b.encode(bArr2).getBytes(yw1.f103174a);
            } else if (isSpecCompliantAscii(bArr2)) {
                bArrSerialize[i] = bArr;
                bArrSerialize[i + 1] = bArr2;
            } else {
                String str = new String(bArr, yw1.f103174a);
                f36611a.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
            }
            i += 2;
        }
        return i == bArrSerialize.length ? bArrSerialize : (byte[][]) Arrays.copyOfRange(bArrSerialize, 0, i);
    }

    @dy1
    public static byte[][] toRawSerializedHeaders(byte[][] bArr) {
        for (int i = 0; i < bArr.length; i += 2) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            if (endsWith(bArr2, f36612b)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        return serializeHeadersWithCommasInBin(bArr, i);
                    }
                }
                bArr[i2] = br0.base64().decode(new String(bArr3, yw1.f103174a));
            }
        }
        return bArr;
    }
}
