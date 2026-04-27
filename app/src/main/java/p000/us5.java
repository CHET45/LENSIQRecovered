package p000;

import android.util.Log;
import com.blankj.utilcode.util.C2481n;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class us5 {

    /* JADX INFO: renamed from: a */
    public static int f89025a = 524288;

    /* JADX INFO: renamed from: us5$a */
    public interface InterfaceC13691a {
        void onProgressUpdate(double d);
    }

    private us5() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static byte[] readFile2BytesByChannel(String str) {
        return readFile2BytesByChannel(C2481n.m4258O(str));
    }

    public static byte[] readFile2BytesByMap(String str) {
        return readFile2BytesByMap(C2481n.m4258O(str));
    }

    public static byte[] readFile2BytesByStream(String str) {
        return readFile2BytesByStream(C2481n.m4258O(str), (InterfaceC13691a) null);
    }

    public static List<String> readFile2List(String str) {
        return readFile2List(C2481n.m4258O(str), (String) null);
    }

    public static String readFile2String(String str) {
        return readFile2String(C2481n.m4258O(str), (String) null);
    }

    public static void setBufferSize(int i) {
        f89025a = i;
    }

    public static boolean writeFileFromBytesByChannel(String str, byte[] bArr, boolean z) {
        return writeFileFromBytesByChannel(C2481n.m4258O(str), bArr, false, z);
    }

    public static boolean writeFileFromBytesByMap(String str, byte[] bArr, boolean z) {
        return writeFileFromBytesByMap(str, bArr, false, z);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr) {
        return writeFileFromBytesByStream(C2481n.m4258O(str), bArr, false, (InterfaceC13691a) null);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream) {
        return writeFileFromIS(C2481n.m4258O(str), inputStream, false, (InterfaceC13691a) null);
    }

    public static boolean writeFileFromString(String str, String str2) {
        return writeFileFromString(C2481n.m4258O(str), str2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    public static byte[] readFile2BytesByChannel(File file) throws Throwable {
        FileChannel channel;
        ?? r1 = 0;
        try {
            if (!C2481n.m4328t0(file)) {
                return null;
            }
            try {
                channel = new RandomAccessFile(file, "r").getChannel();
            } catch (IOException e) {
                e = e;
                channel = null;
            } catch (Throwable th) {
                th = th;
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
            try {
                if (channel == null) {
                    Log.e("FileIOUtils", "fc is null.");
                    byte[] bArr = new byte[0];
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return bArr;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) channel.size());
                while (channel.read(byteBufferAllocate) > 0) {
                }
                byte[] bArrArray = byteBufferAllocate.array();
                try {
                    channel.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return bArrArray;
            } catch (IOException e5) {
                e = e5;
                e.printStackTrace();
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            r1 = file;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    public static byte[] readFile2BytesByMap(File file) throws Throwable {
        FileChannel channel;
        ?? r1 = 0;
        try {
            if (!C2481n.m4328t0(file)) {
                return null;
            }
            try {
                channel = new RandomAccessFile(file, "r").getChannel();
            } catch (IOException e) {
                e = e;
                channel = null;
            } catch (Throwable th) {
                th = th;
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
            try {
                if (channel == null) {
                    Log.e("FileIOUtils", "fc is null.");
                    byte[] bArr = new byte[0];
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return bArr;
                }
                int size = (int) channel.size();
                byte[] bArr2 = new byte[size];
                channel.map(FileChannel.MapMode.READ_ONLY, 0L, size).load().get(bArr2, 0, size);
                try {
                    channel.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return bArr2;
            } catch (IOException e5) {
                e = e5;
                e.printStackTrace();
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            r1 = file;
        }
    }

    public static byte[] readFile2BytesByStream(File file) {
        return readFile2BytesByStream(file, (InterfaceC13691a) null);
    }

    public static List<String> readFile2List(String str, String str2) {
        return readFile2List(C2481n.m4258O(str), str2);
    }

    public static String readFile2String(String str, String str2) {
        return readFile2String(C2481n.m4258O(str), str2);
    }

    public static boolean writeFileFromBytesByChannel(String str, byte[] bArr, boolean z, boolean z2) {
        return writeFileFromBytesByChannel(C2481n.m4258O(str), bArr, z, z2);
    }

    public static boolean writeFileFromBytesByMap(String str, byte[] bArr, boolean z, boolean z2) {
        return writeFileFromBytesByMap(C2481n.m4258O(str), bArr, z, z2);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, boolean z) {
        return writeFileFromBytesByStream(C2481n.m4258O(str), bArr, z, (InterfaceC13691a) null);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, boolean z) {
        return writeFileFromIS(C2481n.m4258O(str), inputStream, z, (InterfaceC13691a) null);
    }

    public static boolean writeFileFromString(String str, String str2, boolean z) {
        return writeFileFromString(C2481n.m4258O(str), str2, z);
    }

    public static byte[] readFile2BytesByStream(String str, InterfaceC13691a interfaceC13691a) {
        return readFile2BytesByStream(C2481n.m4258O(str), interfaceC13691a);
    }

    public static List<String> readFile2List(File file) {
        return readFile2List(file, 0, Integer.MAX_VALUE, (String) null);
    }

    public static String readFile2String(File file) {
        return readFile2String(file, (String) null);
    }

    public static boolean writeFileFromBytesByChannel(File file, byte[] bArr, boolean z) {
        return writeFileFromBytesByChannel(file, bArr, false, z);
    }

    public static boolean writeFileFromBytesByMap(File file, byte[] bArr, boolean z) {
        return writeFileFromBytesByMap(file, bArr, false, z);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr) {
        return writeFileFromBytesByStream(file, bArr, false, (InterfaceC13691a) null);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream) {
        return writeFileFromIS(file, inputStream, false, (InterfaceC13691a) null);
    }

    public static boolean writeFileFromString(File file, String str) {
        return writeFileFromString(file, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[Catch: FileNotFoundException -> 0x0063, SYNTHETIC, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0063, blocks: (B:5:0x0008, B:28:0x005f, B:24:0x0057, B:56:0x0092, B:55:0x008f, B:50:0x0085, B:45:0x007c, B:40:0x0072, B:21:0x0052, B:47:0x0080, B:37:0x006d, B:52:0x008a, B:25:0x005a, B:42:0x0077), top: B:63:0x0008, inners: #1, #3, #5, #7, #8, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] readFile2BytesByStream(java.io.File r10, p000.us5.InterfaceC13691a r11) throws java.lang.Throwable {
        /*
            boolean r0 = com.blankj.utilcode.util.C2481n.m4328t0(r10)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.io.FileNotFoundException -> L63
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L63
            r2.<init>(r10)     // Catch: java.io.FileNotFoundException -> L63
            int r10 = p000.us5.f89025a     // Catch: java.io.FileNotFoundException -> L63
            r0.<init>(r2, r10)     // Catch: java.io.FileNotFoundException -> L63
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68
            r10.<init>()     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68
            int r2 = p000.us5.f89025a     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r3 = -1
            r4 = 0
            if (r11 != 0) goto L31
        L21:
            int r11 = p000.us5.f89025a     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            int r11 = r0.read(r2, r4, r11)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            if (r11 == r3) goto L4e
            r10.write(r2, r4, r11)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            goto L21
        L2d:
            r11 = move-exception
            goto L80
        L2f:
            r11 = move-exception
            goto L6a
        L31:
            int r5 = r0.available()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            double r5 = (double) r5     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r7 = 0
            r11.onProgressUpdate(r7)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r7 = r4
        L3c:
            int r8 = p000.us5.f89025a     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            int r8 = r0.read(r2, r4, r8)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            if (r8 == r3) goto L4e
            r10.write(r2, r4, r8)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            int r7 = r7 + r8
            double r8 = (double) r7     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            double r8 = r8 / r5
            r11.onProgressUpdate(r8)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            goto L3c
        L4e:
            byte[] r11 = r10.toByteArray()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r0.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L5a:
            r10.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L62:
            return r11
        L63:
            r10 = move-exception
            goto L93
        L65:
            r11 = move-exception
            r10 = r1
            goto L80
        L68:
            r11 = move-exception
            r10 = r1
        L6a:
            r11.printStackTrace()     // Catch: java.lang.Throwable -> L2d
            r0.close()     // Catch: java.io.IOException -> L71
            goto L75
        L71:
            r11 = move-exception
            r11.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L75:
            if (r10 == 0) goto L7f
            r10.close()     // Catch: java.io.IOException -> L7b
            goto L7f
        L7b:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L7f:
            return r1
        L80:
            r0.close()     // Catch: java.io.IOException -> L84
            goto L88
        L84:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L88:
            if (r10 == 0) goto L92
            r10.close()     // Catch: java.io.IOException -> L8e
            goto L92
        L8e:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L92:
            throw r11     // Catch: java.io.FileNotFoundException -> L63
        L93:
            r10.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.us5.readFile2BytesByStream(java.io.File, us5$a):byte[]");
    }

    public static List<String> readFile2List(File file, String str) {
        return readFile2List(file, 0, Integer.MAX_VALUE, str);
    }

    public static String readFile2String(File file, String str) {
        byte[] file2BytesByStream = readFile2BytesByStream(file);
        if (file2BytesByStream == null) {
            return null;
        }
        if (C2481n.m4235C0(str)) {
            return new String(file2BytesByStream);
        }
        try {
            return new String(file2BytesByStream, str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean writeFileFromBytesByChannel(File file, byte[] bArr, boolean z, boolean z2) {
        if (bArr == null) {
            Log.e("FileIOUtils", "bytes is null.");
            return false;
        }
        if (!C2481n.m4325s(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            try {
                FileChannel channel = new FileOutputStream(file, z).getChannel();
                if (channel == null) {
                    Log.e("FileIOUtils", "fc is null.");
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return false;
                }
                channel.position(channel.size());
                channel.write(ByteBuffer.wrap(bArr));
                if (z2) {
                    channel.force(true);
                }
                try {
                    channel.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return true;
            } catch (IOException e3) {
                e3.printStackTrace();
                if (0 != 0) {
                    try {
                        abstractInterruptibleChannel.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    abstractInterruptibleChannel.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean writeFileFromBytesByMap(File file, byte[] bArr, boolean z, boolean z2) {
        if (bArr != null && C2481n.m4325s(file)) {
            AbstractInterruptibleChannel abstractInterruptibleChannel = null;
            try {
                try {
                    FileChannel channel = new FileOutputStream(file, z).getChannel();
                    if (channel == null) {
                        Log.e("FileIOUtils", "fc is null.");
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        return false;
                    }
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, channel.size(), bArr.length);
                    map.put(bArr);
                    if (z2) {
                        map.force();
                    }
                    try {
                        channel.close();
                        return true;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return true;
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                    if (0 != 0) {
                        try {
                            abstractInterruptibleChannel.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        abstractInterruptibleChannel.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        }
        Log.e("FileIOUtils", "create file <" + file + "> failed.");
        return false;
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, boolean z) {
        return writeFileFromBytesByStream(file, bArr, z, (InterfaceC13691a) null);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream, boolean z) {
        return writeFileFromIS(file, inputStream, z, (InterfaceC13691a) null);
    }

    public static boolean writeFileFromString(File file, String str, boolean z) throws Throwable {
        if (file == null || str == null) {
            return false;
        }
        if (!C2481n.m4325s(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file, z));
                try {
                    bufferedWriter2.write(str);
                    try {
                        bufferedWriter2.close();
                        return true;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return true;
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedWriter = bufferedWriter2;
                    e.printStackTrace();
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    public static List<String> readFile2List(String str, int i, int i2) {
        return readFile2List(C2481n.m4258O(str), i, i2, (String) null);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, InterfaceC13691a interfaceC13691a) {
        return writeFileFromBytesByStream(C2481n.m4258O(str), bArr, false, interfaceC13691a);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, InterfaceC13691a interfaceC13691a) {
        return writeFileFromIS(C2481n.m4258O(str), inputStream, false, interfaceC13691a);
    }

    public static List<String> readFile2List(String str, int i, int i2, String str2) {
        return readFile2List(C2481n.m4258O(str), i, i2, str2);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, boolean z, InterfaceC13691a interfaceC13691a) {
        return writeFileFromBytesByStream(C2481n.m4258O(str), bArr, z, interfaceC13691a);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, boolean z, InterfaceC13691a interfaceC13691a) {
        return writeFileFromIS(C2481n.m4258O(str), inputStream, z, interfaceC13691a);
    }

    public static List<String> readFile2List(File file, int i, int i2) {
        return readFile2List(file, i, i2, (String) null);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, InterfaceC13691a interfaceC13691a) {
        return writeFileFromBytesByStream(file, bArr, false, interfaceC13691a);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream, InterfaceC13691a interfaceC13691a) {
        return writeFileFromIS(file, inputStream, false, interfaceC13691a);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> readFile2List(java.io.File r6, int r7, int r8, java.lang.String r9) throws java.lang.Throwable {
        /*
            boolean r0 = com.blankj.utilcode.util.C2481n.m4328t0(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r7 <= r8) goto Lb
            return r1
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            boolean r2 = com.blankj.utilcode.util.C2481n.m4235C0(r9)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r3 = 1
            if (r2 == 0) goto L2c
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            goto L3c
        L27:
            r6 = move-exception
            goto L6c
        L29:
            r6 = move-exception
            r9 = r1
            goto L5e
        L2c:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r4.<init>(r5, r9)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r9 = r2
        L3c:
            java.lang.String r6 = r9.readLine()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            if (r6 == 0) goto L55
            if (r3 <= r8) goto L45
            goto L55
        L45:
            if (r7 > r3) goto L52
            if (r3 > r8) goto L52
            r0.add(r6)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            goto L52
        L4d:
            r6 = move-exception
            r1 = r9
            goto L6c
        L50:
            r6 = move-exception
            goto L5e
        L52:
            int r3 = r3 + 1
            goto L3c
        L55:
            r9.close()     // Catch: java.io.IOException -> L59
            goto L5d
        L59:
            r6 = move-exception
            r6.printStackTrace()
        L5d:
            return r0
        L5e:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L4d
            if (r9 == 0) goto L6b
            r9.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r6 = move-exception
            r6.printStackTrace()
        L6b:
            return r1
        L6c:
            if (r1 == 0) goto L76
            r1.close()     // Catch: java.io.IOException -> L72
            goto L76
        L72:
            r7 = move-exception
            r7.printStackTrace()
        L76:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.us5.readFile2List(java.io.File, int, int, java.lang.String):java.util.List");
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, boolean z, InterfaceC13691a interfaceC13691a) {
        if (bArr == null) {
            return false;
        }
        return writeFileFromIS(file, new ByteArrayInputStream(bArr), z, interfaceC13691a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:61|8|9|76|(4:(6:11|(2:12|(1:14)(0))|24|65|28|79)(6:19|(2:20|(1:22)(0))|24|65|28|79)|65|28|79)|71|24) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r7.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean writeFileFromIS(java.io.File r7, java.io.InputStream r8, boolean r9, p000.us5.InterfaceC13691a r10) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r8 == 0) goto L8c
            boolean r1 = com.blankj.utilcode.util.C2481n.m4325s(r7)
            if (r1 != 0) goto Lb
            goto L8c
        Lb:
            r1 = 0
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r3.<init>(r7, r9)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            int r7 = p000.us5.f89025a     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r2.<init>(r3, r7)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r7 = -1
            if (r10 != 0) goto L2f
            int r9 = p000.us5.f89025a     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
        L1f:
            int r10 = r8.read(r9)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            if (r10 == r7) goto L4e
            r2.write(r9, r0, r10)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            goto L1f
        L29:
            r7 = move-exception
            r1 = r2
            goto L79
        L2c:
            r7 = move-exception
            r1 = r2
            goto L63
        L2f:
            int r9 = r8.available()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            double r3 = (double) r9     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r5 = 0
            r10.onProgressUpdate(r5)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            int r9 = p000.us5.f89025a     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r1 = r0
        L3e:
            int r5 = r8.read(r9)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            if (r5 == r7) goto L4e
            r2.write(r9, r0, r5)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            int r1 = r1 + r5
            double r5 = (double) r1     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            double r5 = r5 / r3
            r10.onProgressUpdate(r5)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            goto L3e
        L4e:
            r8.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r7 = move-exception
            r7.printStackTrace()
        L56:
            r2.close()     // Catch: java.io.IOException -> L5a
            goto L5e
        L5a:
            r7 = move-exception
            r7.printStackTrace()
        L5e:
            r7 = 1
            return r7
        L60:
            r7 = move-exception
            goto L79
        L62:
            r7 = move-exception
        L63:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L60
            r8.close()     // Catch: java.io.IOException -> L6a
            goto L6e
        L6a:
            r7 = move-exception
            r7.printStackTrace()
        L6e:
            if (r1 == 0) goto L78
            r1.close()     // Catch: java.io.IOException -> L74
            goto L78
        L74:
            r7 = move-exception
            r7.printStackTrace()
        L78:
            return r0
        L79:
            r8.close()     // Catch: java.io.IOException -> L7d
            goto L81
        L7d:
            r8 = move-exception
            r8.printStackTrace()
        L81:
            if (r1 == 0) goto L8b
            r1.close()     // Catch: java.io.IOException -> L87
            goto L8b
        L87:
            r8 = move-exception
            r8.printStackTrace()
        L8b:
            throw r7
        L8c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "create file <"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = "> failed."
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "FileIOUtils"
            android.util.Log.e(r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.us5.writeFileFromIS(java.io.File, java.io.InputStream, boolean, us5$a):boolean");
    }
}
