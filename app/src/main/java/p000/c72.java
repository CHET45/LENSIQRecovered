package p000;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c72 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f15892a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final String[] f15893b = {"", k95.f53065W4, "B", "C"};

    /* JADX INFO: renamed from: c */
    public static final int f15894c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f15895d = 32;

    /* JADX INFO: renamed from: e */
    public static final int f15896e = 15;

    /* JADX INFO: renamed from: f */
    public static final int f15897f = 0;

    private c72() {
    }

    public static String buildAvcCodecString(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static List<byte[]> buildCea708InitializationData(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static String buildHevcCodecString(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        StringBuilder sb = new StringBuilder(x0i.formatInvariant("hvc1.%s%d.%X.%c%d", f15893b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? sjc.f82018h : sjc.f82016f), Integer.valueOf(i4)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static byte[] buildNalUnit(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f15892a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    private static int findNalStartCode(byte[] bArr, int i) {
        int length = bArr.length - f15892a.length;
        while (i <= length) {
            if (isNalStartCode(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static Pair<Integer, Integer> getVideoResolutionFromMpeg4VideoConfig(byte[] bArr) {
        boolean z;
        ihc ihcVar = new ihc(bArr);
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 3;
            if (i3 >= bArr.length) {
                z = false;
                break;
            }
            if (ihcVar.readUnsignedInt24() == 1 && (bArr[i3] & 240) == 32) {
                z = true;
                break;
            }
            ihcVar.setPosition(ihcVar.getPosition() - 2);
            i2++;
        }
        u80.checkArgument(z, "Invalid input: VOL not found.");
        ghc ghcVar = new ghc(bArr);
        ghcVar.skipBits((i2 + 4) * 8);
        ghcVar.skipBits(1);
        ghcVar.skipBits(8);
        if (ghcVar.readBit()) {
            ghcVar.skipBits(4);
            ghcVar.skipBits(3);
        }
        if (ghcVar.readBits(4) == 15) {
            ghcVar.skipBits(8);
            ghcVar.skipBits(8);
        }
        if (ghcVar.readBit()) {
            ghcVar.skipBits(2);
            ghcVar.skipBits(1);
            if (ghcVar.readBit()) {
                ghcVar.skipBits(79);
            }
        }
        u80.checkArgument(ghcVar.readBits(2) == 0, "Only supports rectangular video object layer shape.");
        u80.checkArgument(ghcVar.readBit());
        int bits = ghcVar.readBits(16);
        u80.checkArgument(ghcVar.readBit());
        if (ghcVar.readBit()) {
            u80.checkArgument(bits > 0);
            for (int i4 = bits - 1; i4 > 0; i4 >>= 1) {
                i++;
            }
            ghcVar.skipBits(i);
        }
        u80.checkArgument(ghcVar.readBit());
        int bits2 = ghcVar.readBits(13);
        u80.checkArgument(ghcVar.readBit());
        int bits3 = ghcVar.readBits(13);
        u80.checkArgument(ghcVar.readBit());
        ghcVar.skipBits(1);
        return Pair.create(Integer.valueOf(bits2), Integer.valueOf(bits3));
    }

    private static boolean isNalStartCode(byte[] bArr, int i) {
        if (bArr.length - i <= f15892a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f15892a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public static Pair<Integer, Integer> parseAlacAudioSpecificConfig(byte[] bArr) {
        ihc ihcVar = new ihc(bArr);
        ihcVar.setPosition(9);
        int unsignedByte = ihcVar.readUnsignedByte();
        ihcVar.setPosition(20);
        return Pair.create(Integer.valueOf(ihcVar.readUnsignedIntToInt()), Integer.valueOf(unsignedByte));
    }

    public static boolean parseCea708InitializationData(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    @hib
    public static byte[][] splitNalUnits(byte[] bArr) {
        if (!isNalStartCode(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iFindNalStartCode = 0;
        do {
            arrayList.add(Integer.valueOf(iFindNalStartCode));
            iFindNalStartCode = findNalStartCode(bArr, iFindNalStartCode + f15892a.length);
        } while (iFindNalStartCode != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i = 0;
        while (i < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i)).intValue();
            int iIntValue2 = (i < arrayList.size() + (-1) ? ((Integer) arrayList.get(i + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i] = bArr3;
            i++;
        }
        return bArr2;
    }
}
