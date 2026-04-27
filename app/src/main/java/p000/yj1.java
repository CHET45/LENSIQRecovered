package p000;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class yj1 {

    /* JADX INFO: renamed from: a */
    public static final String f101781a = "yj1";

    public static void byte2File(byte[] bArr, File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(file.length());
                randomAccessFile.write(bArr);
                randomAccessFile.close();
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    public static byte[] byte2FileForResult(byte[] bArr, File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(file.length());
                randomAccessFile.write(bArr);
                randomAccessFile.close();
            } finally {
            }
        } catch (Exception unused) {
        }
        return file2Bytes(file);
    }

    public static byte[] byteMerger(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] file2Bytes(File file) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        byte[] byteArray = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bArr = new byte[1024];
                } finally {
                }
            } finally {
            }
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
            byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            fileInputStream.close();
        } catch (Exception unused) {
        }
        return byteArray;
    }

    public static double getMax(double[] dArr) {
        double d = 0.0d;
        for (double d2 : dArr) {
            if (d2 > d) {
                d = d2;
            }
        }
        return d;
    }

    public static byte[] merger(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] toBytes(short[] sArr) {
        int length = sArr.length;
        byte[] bArr = new byte[length << 1];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            short s = sArr[i];
            bArr[i2] = (byte) s;
            bArr[i2 + 1] = (byte) (s >> 8);
        }
        return bArr;
    }

    public static byte[] toHardBytes(double[] dArr) {
        byte[] bArr = new byte[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            double d = dArr[i];
            if (d > 127.0d) {
                d = 127.0d;
            }
            bArr[i] = (byte) d;
        }
        return bArr;
    }

    public static double[] toHardDouble(short[] sArr) {
        double[] dArr = new double[512];
        for (int i = 0; i < 512; i++) {
            dArr[i] = sArr[i];
        }
        return dArr;
    }

    public static short[] toHardShort(double[] dArr) {
        short[] sArr = new short[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            double d = dArr[i];
            if (d > 32767.0d) {
                d = 32767.0d;
            }
            sArr[i] = (short) d;
        }
        return sArr;
    }

    public static int toInt(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long toLong(byte[] bArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.put(bArr, 0, bArr.length);
        return byteBufferAllocate.getLong();
    }

    public static short[] toShorts(byte[] bArr) {
        int length = bArr.length >> 1;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            sArr[i] = (short) (((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255));
        }
        return sArr;
    }

    public static byte[] toSoftBytes(double[] dArr) {
        double max = getMax(dArr);
        double d = max > 127.0d ? max / 128.0d : 1.0d;
        byte[] bArr = new byte[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            double d2 = dArr[i] / d;
            if (d2 > 127.0d) {
                d2 = 127.0d;
            }
            bArr[i] = (byte) d2;
        }
        return bArr;
    }

    public static short[] toSoftShorts(double[] dArr) {
        double max = getMax(dArr);
        double d = max > 127.0d ? max / 128.0d : 1.0d;
        short[] sArr = new short[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            double d2 = dArr[i] / d;
            if (d2 > 32767.0d) {
                d2 = 32767.0d;
            }
            sArr[i] = (short) d2;
        }
        return sArr;
    }

    public static String toString(byte[] bArr) {
        return Arrays.toString(bArr);
    }

    public static int toInt(byte[] bArr) {
        return toInt(bArr, 0);
    }

    public static byte[] toBytes(float f) {
        int iFloatToIntBits = Float.floatToIntBits(f);
        byte[] bArr = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr[i] = (byte) (iFloatToIntBits >> (24 - (i * 8)));
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        for (int i2 = 0; i2 < 2; i2++) {
            byte b = bArr2[i2];
            int i3 = 3 - i2;
            bArr2[i2] = bArr2[i3];
            bArr2[i3] = b;
        }
        return bArr2;
    }

    public static byte[] toBytes(short s) {
        return new byte[]{(byte) s, (byte) (s >> 8)};
    }

    public static byte[] toBytes(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static byte[] toBytes(String str) {
        return str.getBytes();
    }

    public static byte[] toBytes(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(0, j);
        return byteBufferAllocate.array();
    }
}
