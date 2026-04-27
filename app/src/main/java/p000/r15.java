package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
@c5e(19)
public class r15 {

    /* JADX INFO: renamed from: a */
    public static final int f76739a = 8;

    /* JADX INFO: renamed from: b */
    public static final int f76740b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f76741c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f76742d = 4;

    private r15() {
    }

    /* JADX INFO: renamed from: a */
    public static int m20742a(int i) {
        return ((i + 7) & (-8)) / 8;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m20743b(@efb byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    @efb
    /* JADX INFO: renamed from: c */
    public static RuntimeException m20744c(@hib String str) {
        return new IllegalStateException(str);
    }

    @efb
    /* JADX INFO: renamed from: d */
    public static byte[] m20745d(@efb InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw m20744c("Not enough bytes to read: " + i);
            }
            i2 += i3;
        }
        return bArr;
    }

    @efb
    /* JADX INFO: renamed from: e */
    public static byte[] m20746e(@efb InputStream inputStream, int i, int i2) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = inputStream.read(bArr2);
                if (i4 < 0) {
                    throw m20744c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw m20744c(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw m20744c("Inflater did not finish");
            }
            throw m20744c("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    @efb
    /* JADX INFO: renamed from: f */
    public static String m20747f(InputStream inputStream, int i) throws IOException {
        return new String(m20745d(inputStream, i), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: g */
    public static long m20748g(@efb InputStream inputStream, int i) throws IOException {
        byte[] bArrM20745d = m20745d(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM20745d[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: h */
    public static int m20749h(@efb InputStream inputStream) throws IOException {
        return (int) m20748g(inputStream, 2);
    }

    /* JADX INFO: renamed from: i */
    public static long m20750i(@efb InputStream inputStream) throws IOException {
        return m20748g(inputStream, 4);
    }

    /* JADX INFO: renamed from: j */
    public static int m20751j(@efb InputStream inputStream) throws IOException {
        return (int) m20748g(inputStream, 1);
    }

    /* JADX INFO: renamed from: k */
    public static int m20752k(@efb String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* JADX INFO: renamed from: l */
    public static void m20753l(@efb InputStream inputStream, @efb OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m20754m(@efb OutputStream outputStream, byte[] bArr) throws IOException {
        m20758q(outputStream, bArr.length);
        byte[] bArrM20743b = m20743b(bArr);
        m20758q(outputStream, bArrM20743b.length);
        outputStream.write(bArrM20743b);
    }

    /* JADX INFO: renamed from: n */
    public static void m20755n(@efb OutputStream outputStream, @efb String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: o */
    public static void m20756o(@efb OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: p */
    public static void m20757p(@efb OutputStream outputStream, int i) throws IOException {
        m20756o(outputStream, i, 2);
    }

    /* JADX INFO: renamed from: q */
    public static void m20758q(@efb OutputStream outputStream, long j) throws IOException {
        m20756o(outputStream, j, 4);
    }

    /* JADX INFO: renamed from: r */
    public static void m20759r(@efb OutputStream outputStream, int i) throws IOException {
        m20756o(outputStream, i, 1);
    }
}
