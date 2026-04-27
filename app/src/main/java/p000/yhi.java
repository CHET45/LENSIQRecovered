package p000;

import com.zlw.main.recorderlib.recorder.C4442a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes7.dex */
public class yhi {

    /* JADX INFO: renamed from: a */
    public static final String f101658a = "yhi";

    /* JADX INFO: renamed from: yhi$a */
    public static class C15675a {

        /* JADX INFO: renamed from: b */
        public int f101660b;

        /* JADX INFO: renamed from: g */
        public short f101665g;

        /* JADX INFO: renamed from: h */
        public int f101666h;

        /* JADX INFO: renamed from: i */
        public int f101667i;

        /* JADX INFO: renamed from: j */
        public short f101668j;

        /* JADX INFO: renamed from: k */
        public short f101669k;

        /* JADX INFO: renamed from: m */
        public int f101671m;

        /* JADX INFO: renamed from: a */
        public final String f101659a = "RIFF";

        /* JADX INFO: renamed from: c */
        public final String f101661c = "WAVE";

        /* JADX INFO: renamed from: d */
        public final String f101662d = "fmt ";

        /* JADX INFO: renamed from: e */
        public final int f101663e = 16;

        /* JADX INFO: renamed from: f */
        public final short f101664f = 1;

        /* JADX INFO: renamed from: l */
        public final String f101670l = "data";

        public C15675a(int i, int i2, short s, short s2) {
            this.f101660b = i;
            this.f101665g = s;
            this.f101666h = i2;
            this.f101667i = ((i2 * s2) / 8) * s;
            this.f101668j = (short) ((s * s2) / 8);
            this.f101669k = s2;
            this.f101671m = i - 44;
        }

        public byte[] getHeader() {
            return zj1.merger(zj1.merger(zj1.merger(zj1.merger(zj1.merger(zj1.merger(zj1.merger(zj1.merger(zj1.merger(zj1.merger(zj1.merger(zj1.merger(zj1.toBytes("RIFF"), zj1.toBytes(this.f101660b)), zj1.toBytes("WAVE")), zj1.toBytes("fmt ")), zj1.toBytes(16)), zj1.toBytes((short) 1)), zj1.toBytes(this.f101665g)), zj1.toBytes(this.f101666h)), zj1.toBytes(this.f101667i)), zj1.toBytes(this.f101668j)), zj1.toBytes(this.f101669k)), zj1.toBytes("data")), zj1.toBytes(this.f101671m));
        }
    }

    public static byte[] generateWavFileHeader(int i, int i2, int i3, int i4) {
        return new C15675a(i, i2, (short) i3, (short) i4).getHeader();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.ByteArrayOutputStream] */
    private static byte[] getHeader(String str) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i;
        byte[] byteArray = null;
        if (!new File(str).isFile()) {
            return null;
        }
        ?? file = new File(str);
        try {
            try {
                fileInputStream = new FileInputStream((File) file);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream(44);
                } catch (Exception e) {
                    e = e;
                    byteArrayOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    file = 0;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                            ij9.m13138e(e2, f101658a, e2.getMessage(), new Object[0]);
                            throw th;
                        }
                    }
                    if (file != 0) {
                        file.close();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                byteArrayOutputStream = null;
                fileInputStream = null;
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
                file = 0;
            }
            try {
                bArr = new byte[44];
                i = fileInputStream.read(bArr);
            } catch (Exception e4) {
                e = e4;
                ij9.m13138e(e, f101658a, e.getMessage(), new Object[0]);
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e5) {
                        ij9.m13138e(e5, f101658a, e5.getMessage(), new Object[0]);
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
            }
            if (i != 44) {
                ij9.m13137e(f101658a, "读取失败 len: %s", Integer.valueOf(i));
                try {
                    fileInputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException e6) {
                    ij9.m13138e(e6, f101658a, e6.getMessage(), new Object[0]);
                }
                return null;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            byteArray = byteArrayOutputStream.toByteArray();
            try {
                fileInputStream.close();
                byteArrayOutputStream.close();
            } catch (IOException e7) {
                ij9.m13138e(e7, f101658a, e7.getMessage(), new Object[0]);
            }
            return byteArray;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static long getWavDuration(String str) {
        if (str.endsWith(C4442a.a.WAV.getExtension())) {
            return getWavDuration(getHeader(str));
        }
        return -1L;
    }

    public static String headerToString(byte[] bArr) {
        int i;
        int i2;
        if (bArr == null || bArr.length < 44) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < 4; i3++) {
            sb.append((char) bArr[i3]);
        }
        sb.append(",");
        sb.append(zj1.toInt(bArr, 4));
        sb.append(",");
        int i4 = 8;
        while (true) {
            if (i4 >= 16) {
                break;
            }
            sb.append((char) bArr[i4]);
            i4++;
        }
        sb.append(",");
        for (i = 16; i < 24; i++) {
            sb.append((int) bArr[i]);
        }
        sb.append(",");
        sb.append(zj1.toInt(bArr, 24));
        sb.append(",");
        sb.append(zj1.toInt(bArr, 28));
        sb.append(",");
        int i5 = 32;
        while (true) {
            if (i5 >= 36) {
                break;
            }
            sb.append((int) bArr[i5]);
            i5++;
        }
        sb.append(",");
        for (i2 = 36; i2 < 40; i2++) {
            sb.append((char) bArr[i2]);
        }
        sb.append(",");
        sb.append(zj1.toInt(bArr, 40));
        return sb.toString();
    }

    public static void pcmToWav(File file, byte[] bArr) throws Throwable {
        if (yt5.isFile(file)) {
            writeHeader(new File(file.getAbsolutePath().substring(0, r3.length() - 4) + ".wav"), bArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static void writeHeader(File file, byte[] bArr) throws Throwable {
        if (!yt5.isFile(file)) {
            return;
        }
        int i = 0;
        i = 0;
        i = 0;
        i = 0;
        i = 0;
        ?? r1 = 0;
        r1 = 0;
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                try {
                    randomAccessFile2.seek(0L);
                    randomAccessFile2.write(bArr);
                    randomAccessFile2.close();
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e) {
                        String str = f101658a;
                        String message = e.getMessage();
                        Object[] objArr = new Object[0];
                        ij9.m13138e(e, str, message, objArr);
                        i = objArr;
                        r1 = message;
                    }
                } catch (Exception e2) {
                    e = e2;
                    randomAccessFile = randomAccessFile2;
                    ij9.m13138e(e, f101658a, e.getMessage(), new Object[0]);
                    r1 = randomAccessFile;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                            r1 = randomAccessFile;
                        } catch (IOException e3) {
                            String str2 = f101658a;
                            String message2 = e3.getMessage();
                            Object[] objArr2 = new Object[0];
                            ij9.m13138e(e3, str2, message2, objArr2);
                            i = objArr2;
                            r1 = message2;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    r1 = randomAccessFile2;
                    if (r1 != 0) {
                        try {
                            r1.close();
                        } catch (IOException e4) {
                            ij9.m13138e(e4, f101658a, e4.getMessage(), new Object[i]);
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static long getWavDuration(byte[] bArr) {
        if (bArr != null && bArr.length >= 44) {
            return (((long) zj1.toInt(bArr, 40)) * 1000) / ((long) zj1.toInt(bArr, 28));
        }
        ij9.m13137e(f101658a, "header size有误", new Object[0]);
        return -1L;
    }
}
