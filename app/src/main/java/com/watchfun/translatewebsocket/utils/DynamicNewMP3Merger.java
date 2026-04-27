package com.watchfun.translatewebsocket.utils;

import android.text.TextUtils;
import com.watchfun.translatewebsocket.utils.DynamicNewMP3Merger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.gm2;
import p000.x45;

/* JADX INFO: loaded from: classes7.dex */
public class DynamicNewMP3Merger {
    private List<byte[]> fragments;
    private Map<String, List<byte[]>> listMap = new HashMap();

    private int calculateFrameSize(byte[] bArr, int i) {
        int i2 = i + 3;
        if (i2 >= bArr.length) {
            return 0;
        }
        int i3 = (bArr[i2] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        if ((i3 & (-2097152)) != -2097152) {
            return 0;
        }
        int i4 = (i3 >> 19) & 3;
        int i5 = (i3 >> 17) & 3;
        int i6 = (i3 >> 12) & 15;
        int i7 = (i3 >> 10) & 3;
        int i8 = (i3 >> 9) & 1;
        int i9 = (i3 >> 16) & 1;
        int[][] iArr = {new int[]{11025, x45.f96561k3, 8000}, new int[0], new int[]{22050, 24000, 16000}, new int[]{44100, 48000, 32000}};
        int[][][] iArr2 = {new int[][]{new int[]{0}, new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}, new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}, new int[]{0, 32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256}}, new int[0][], new int[][]{new int[]{0}, new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}, new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}, new int[]{0, 32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256}}, new int[][]{new int[]{0}, new int[]{0, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320}, new int[]{0, 32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384}, new int[]{0, 32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, Videoio.CAP_PROP_XI_WB_KR}}};
        if (i4 == 1 || i5 == 0 || i6 == 0 || i6 > 14 || i7 > 2 || i4 >= 4) {
            return 0;
        }
        int i10 = iArr2[i4][i5][i6];
        int i11 = iArr[i4][i7];
        if (i11 == 0) {
            return 0;
        }
        int i12 = i5 == 3 ? (((i10 * x45.f96561k3) / i11) + i8) * 4 : ((i10 * 144000) / i11) + i8;
        return i9 == 0 ? i12 + 2 : i12;
    }

    private int calculateTotalFrames(byte[] bArr) {
        int iCalculateFrameSize = 0;
        int i = 0;
        while (iCalculateFrameSize < bArr.length) {
            if (isFrameHeader(bArr, iCalculateFrameSize)) {
                i++;
                iCalculateFrameSize += calculateFrameSize(bArr, iCalculateFrameSize);
            } else {
                iCalculateFrameSize++;
            }
        }
        return i;
    }

    private byte[] concatenate(List<byte[]> list) {
        byte[] bArr = new byte[list.stream().mapToInt(new ToIntFunction() { // from class: wu4
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return DynamicNewMP3Merger.lambda$concatenate$0((byte[]) obj);
            }
        }).sum()];
        int length = 0;
        for (byte[] bArr2 : list) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    private byte[] createXingHeader(int i, int i2) {
        byte[] bArr = new byte[24];
        System.arraycopy(new byte[]{88, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HashtableSizeOptions, 103}, 0, bArr, 0, 4);
        bArr[7] = 7;
        writeInt32BE(bArr, 8, i);
        writeInt32BE(bArr, 12, i2);
        writeInt32BE(bArr, 16, 24);
        return bArr;
    }

    private int findAndTruncateID3v1(byte[] bArr, int i) {
        if (bArr.length >= 128) {
            int length = bArr.length;
            int i2 = length - 128;
            if (bArr[i2] == 84 && bArr[length + gm2.f40167d] == 65 && bArr[length - 126] == 71) {
                return i2;
            }
        }
        return i;
    }

    private int findFirstFrameHeaderPosition(byte[] bArr) {
        int iD3v2Size;
        int iCalculateFrameSize;
        if (hasID3v2(bArr)) {
            iD3v2Size = getID3v2Size(bArr);
            if (iD3v2Size > bArr.length) {
                return -1;
            }
        } else {
            iD3v2Size = 0;
        }
        while (iD3v2Size < bArr.length - 4) {
            if (isFrameHeader(bArr, iD3v2Size) && (iCalculateFrameSize = calculateFrameSize(bArr, iD3v2Size) + iD3v2Size) < bArr.length && isFrameHeader(bArr, iCalculateFrameSize)) {
                return iD3v2Size;
            }
            iD3v2Size++;
        }
        return -1;
    }

    private int findFirstValidXingOrVbriHeader(byte[] bArr) {
        for (int i = 0; i < bArr.length - 8; i++) {
            if (isFrameHeader(bArr, i)) {
                int i2 = i + 4;
                if (isXingHeader(bArr, i2) || isVbriHeader(bArr, i2)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    private int findFirstXingHeaderPosition(byte[] bArr) {
        for (int i = 0; i < bArr.length - 8; i++) {
            if (isFrameHeader(bArr, i)) {
                int i2 = i + 4;
                if (isXingHeader(bArr, i2) || isVbriHeader(bArr, i2)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    private int getID3v2Size(byte[] bArr) {
        if (bArr.length < 10 || !hasID3v2(bArr)) {
            return 0;
        }
        return (bArr[9] & 127) | (((bArr[6] & 127) << 21) + 10) | ((bArr[7] & 127) << 14) | ((bArr[8] & 127) << 7);
    }

    private boolean hasID3v2(byte[] bArr) {
        return bArr.length >= 3 && bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51;
    }

    private byte[] injectNewXingHeader(byte[] bArr, int i, int i2) {
        int iFindFirstFrameHeaderPosition = findFirstFrameHeaderPosition(bArr);
        if (iFindFirstFrameHeaderPosition == -1) {
            return bArr;
        }
        byte[] bArrCreateXingHeader = createXingHeader(i, i2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3 = iFindFirstFrameHeaderPosition + 4;
        try {
            byteArrayOutputStream.write(Arrays.copyOfRange(bArr, 0, i3));
            byteArrayOutputStream.write(bArrCreateXingHeader);
            byteArrayOutputStream.write(Arrays.copyOfRange(bArr, i3, bArr.length));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private boolean isFrameHeader(byte[] bArr, int i) {
        return (bArr[i] & 255) == 255 && (bArr[i + 1] & 224) == 224;
    }

    private boolean isVbriHeader(byte[] bArr, int i) {
        return bArr[i] == 86 && bArr[i + 1] == 66 && bArr[i + 2] == 82 && bArr[i + 3] == 73;
    }

    private boolean isXingHeader(byte[] bArr, int i) {
        byte b = bArr[i];
        return (b == 88 && bArr[i + 1] == 105 && bArr[i + 2] == 110 && bArr[i + 3] == 103) || (b == 73 && bArr[i + 1] == 110 && bArr[i + 2] == 102 && bArr[i + 3] == 111);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$concatenate$0(byte[] bArr) {
        return bArr.length;
    }

    private byte[] processFragment(byte[] bArr, boolean z, boolean z2) {
        int length = bArr.length;
        int iD3v2Size = (z || !hasID3v2(bArr)) ? 0 : getID3v2Size(bArr);
        if (!z2) {
            length = findAndTruncateID3v1(bArr, length);
        }
        return safeCopy(bArr, iD3v2Size, length);
    }

    private byte[] removeRedundantID3v1(byte[] bArr) {
        int length = bArr.length;
        int length2 = bArr.length - 128;
        while (true) {
            if (length2 >= 0) {
                int i = length2 + 2;
                if (i < bArr.length && bArr[length2] == 84 && bArr[length2 + 1] == 65 && bArr[i] == 71) {
                    length = length2 + 128;
                    break;
                }
                length2 -= 128;
            } else {
                break;
            }
        }
        return Arrays.copyOf(bArr, length);
    }

    private byte[] safeCopy(byte[] bArr, int i, int i2) {
        return (i >= i2 || i < 0 || i2 > bArr.length) ? new byte[0] : Arrays.copyOfRange(bArr, i, i2);
    }

    private byte[] updateXingFrameCount(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b = bArr[i];
        if (b == 88 || b == 73) {
            writeInt32BE(bArrCopyOf, i + 8, i2);
        } else if (b == 86) {
            writeInt32BE(bArrCopyOf, i + 14, i2);
        }
        return bArrCopyOf;
    }

    private byte[] updateXingHeader(byte[] bArr) {
        int iFindFirstValidXingOrVbriHeader = findFirstValidXingOrVbriHeader(bArr);
        int iCalculateTotalFrames = calculateTotalFrames(bArr);
        int i = iCalculateTotalFrames * 1152;
        return iFindFirstValidXingOrVbriHeader != -1 ? updateXingTotalSamples(updateXingFrameCount(bArr, iFindFirstValidXingOrVbriHeader, iCalculateTotalFrames), iFindFirstValidXingOrVbriHeader, i) : injectNewXingHeader(bArr, iCalculateTotalFrames, i);
    }

    private byte[] updateXingHeaderTotalFrames(byte[] bArr) {
        int iFindFirstXingHeaderPosition = findFirstXingHeaderPosition(bArr);
        return iFindFirstXingHeaderPosition == -1 ? bArr : updateXingFrameCount(bArr, iFindFirstXingHeaderPosition, calculateTotalFrames(bArr));
    }

    private byte[] updateXingTotalSamples(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b = bArr[i];
        if (b == 88 || b == 73) {
            writeInt32BE(bArrCopyOf, i + 12, i2);
        }
        return bArrCopyOf;
    }

    private void writeInt32BE(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) ((i2 >> 24) & 255);
        bArr[i + 1] = (byte) ((i2 >> 16) & 255);
        bArr[i + 2] = (byte) ((i2 >> 8) & 255);
        bArr[i + 3] = (byte) (i2 & 255);
    }

    public void addFragment(String str, byte[] bArr) {
        List<byte[]> list = this.listMap.get(str);
        this.fragments = list;
        if (list != null) {
            list.add(bArr);
        } else {
            ArrayList arrayList = new ArrayList();
            this.fragments = arrayList;
            arrayList.add(bArr);
        }
        this.listMap.put(str, this.fragments);
    }

    public void clear(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.listMap.remove(str);
        }
        List<byte[]> list = this.fragments;
        if (list != null) {
            list.clear();
        }
    }

    public byte[] merge() {
        if (this.fragments.isEmpty()) {
            return new byte[0];
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < this.fragments.size()) {
            byte[] bArrProcessFragment = processFragment(this.fragments.get(i), i == 0, i == this.fragments.size() - 1);
            if (bArrProcessFragment.length > 0) {
                arrayList.add(bArrProcessFragment);
            }
            i++;
        }
        return updateXingHeader(removeRedundantID3v1(concatenate(arrayList)));
    }

    public void release() {
        this.listMap.clear();
        List<byte[]> list = this.fragments;
        if (list != null) {
            list.clear();
        }
    }
}
