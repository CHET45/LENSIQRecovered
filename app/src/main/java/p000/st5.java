package p000;

import android.content.Context;
import android.os.Environment;
import android.os.MemoryFile;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes6.dex */
public class st5 {

    /* JADX INFO: renamed from: a */
    public static String f82813a = "";

    /* JADX INFO: renamed from: b */
    public static final String f82814b = "wav";

    /* JADX INFO: renamed from: c */
    public static final String f82815c = "pcm";

    /* JADX INFO: renamed from: d */
    public static final String f82816d = "msc";

    /* JADX INFO: renamed from: e */
    public static final String f82817e = "res";

    /* JADX INFO: renamed from: f */
    public static final String f82818f = ".jet";

    public static String codeString(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            int i = (bufferedInputStream.read() << 8) + bufferedInputStream.read();
            return i != 4094 ? i != 61371 ? i != 65279 ? "GBK" : "YTF-16BE" : "UTF-8" : "Unicode";
        } catch (FileNotFoundException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void copyAssetsFile(Context context, String str, String str2) throws Throwable {
        Throwable th;
        InputStream inputStreamOpen;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            try {
                makeDir(str2);
                fileOutputStream = new FileOutputStream(str2, false);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpen = null;
        }
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (i <= 0) {
                    inputStreamOpen.close();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream2 = fileOutputStream;
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            if (fileOutputStream2 == null) {
                throw th;
            }
            fileOutputStream2.close();
            throw th;
        }
    }

    public static void deleteFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    public static boolean formatPcm(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || f82815c.equals(str)) {
            return true;
        }
        if (f82814b.equals(str)) {
            return pcm2Wav(str2, i);
        }
        xi9.m25212e("format not supported");
        return false;
    }

    public static String getResFilePath(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = System.currentTimeMillis() + "";
        }
        String absolutePath = ("mounted".equals(Environment.getExternalStorageState()) ? Environment.getExternalStorageDirectory() : context.getFilesDir()).getAbsolutePath();
        if (!absolutePath.endsWith(pj4.f71071b)) {
            absolutePath = absolutePath + pj4.f71071b;
        }
        String str2 = (absolutePath + "msc/") + "res/";
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        String str3 = str2 + str;
        if (str3.endsWith(f82818f)) {
            return str3;
        }
        return str3 + f82818f;
    }

    public static String getUserPath(Context context) {
        if (!TextUtils.isEmpty(f82813a)) {
            return f82813a;
        }
        String absolutePath = context.getFilesDir().getAbsolutePath();
        if (!absolutePath.endsWith(pj4.f71071b)) {
            absolutePath = absolutePath + pj4.f71071b;
        }
        String str = absolutePath + "msclib/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        f82813a = str;
        return str;
    }

    public static void makeDir(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!str.endsWith(pj4.f71071b)) {
            file = file.getParentFile();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static boolean pcm2Wav(String str, int i) {
        try {
            tvi tviVar = new tvi(new File(str), i);
            tviVar.m22884c();
            tviVar.m22879a();
            return true;
        } catch (IOException e) {
            xi9.m25212e(e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] readFile(java.lang.String r3) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            if (r3 != 0) goto Ld
            return r0
        Ld:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            int r1 = r3.available()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            byte[] r0 = new byte[r1]     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            r3.read(r0)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            r3.close()     // Catch: java.io.IOException -> L1f
            goto L3f
        L1f:
            r3 = move-exception
            goto L3a
        L21:
            r0 = move-exception
            goto L44
        L23:
            r1 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
            goto L2d
        L28:
            r3 = move-exception
            goto L47
        L2a:
            r3 = move-exception
            r1 = r3
            r3 = r0
        L2d:
            p000.xi9.m25212e(r1)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L3e
            r0.close()     // Catch: java.io.IOException -> L36
            goto L3e
        L36:
            r0 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
        L3a:
            p000.xi9.m25212e(r3)
            goto L3f
        L3e:
            r0 = r3
        L3f:
            return r0
        L40:
            r3 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
        L44:
            r2 = r0
            r0 = r3
            r3 = r2
        L47:
            if (r0 == 0) goto L51
            r0.close()     // Catch: java.io.IOException -> L4d
            goto L51
        L4d:
            r0 = move-exception
            p000.xi9.m25212e(r0)
        L51:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.st5.readFile(java.lang.String):byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static byte[] readFileFromAssets(Context context, String str) throws Throwable {
        ?? r2;
        IOException e;
        ?? Open;
        ?? r0 = 0;
        r0 = 0;
        ?? r02 = 0;
        try {
            try {
                Open = context.getAssets().open(str);
                try {
                    r0 = new byte[Open.available()];
                    Open.read(r0);
                } catch (Exception e2) {
                    e = e2;
                    ?? r1 = r0;
                    r02 = Open;
                    r2 = r1;
                    xi9.m25212e(e);
                    if (r02 != 0) {
                        try {
                            r02.close();
                        } catch (IOException e3) {
                            r0 = r2;
                            e = e3;
                            xi9.m25212e(e);
                        }
                    }
                    r0 = r2;
                } catch (Throwable th) {
                    th = th;
                    r0 = Open;
                    if (r0 != 0) {
                        try {
                            r0.close();
                        } catch (IOException e4) {
                            xi9.m25212e(e4);
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
                r2 = 0;
            }
            try {
                Open.close();
                r0 = r0;
            } catch (IOException e6) {
                e = e6;
                xi9.m25212e(e);
            }
            return r0;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean saveFile(MemoryFile memoryFile, long j, String str) throws Throwable {
        boolean z = false;
        if (memoryFile == null || TextUtils.isEmpty(str)) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    deleteFile(str);
                    makeDir(str);
                    FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                    try {
                        byte[] bArr = new byte[65536];
                        int i = 0;
                        while (true) {
                            long j2 = i;
                            if (j2 >= j) {
                                break;
                            }
                            long j3 = j - j2;
                            if (j3 > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                                j3 = 65536;
                            }
                            int i2 = (int) j3;
                            memoryFile.readBytes(bArr, i, 0, i2);
                            fileOutputStream2.write(bArr, 0, i2);
                            i += i2;
                        }
                        z = true;
                        fileOutputStream2.close();
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        xi9.m25212e(e);
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception unused2) {
        }
        return z;
    }

    public static boolean saveFile(ConcurrentLinkedQueue<byte[]> concurrentLinkedQueue, String str) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                makeDir(str);
                FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                try {
                    Iterator<byte[]> it = concurrentLinkedQueue.iterator();
                    while (it.hasNext()) {
                        fileOutputStream2.write(it.next());
                    }
                    fileOutputStream2.close();
                    return true;
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    xi9.m25212e(e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e2) {
                            xi9.m25212e(e2);
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e3) {
                            xi9.m25212e(e3);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c A[Catch: Exception -> 0x003f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x003f, blocks: (B:23:0x0031, B:29:0x003c), top: B:37:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean saveFile(byte[] r3, java.lang.String r4, boolean r5, int r6) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r5 != 0) goto Lb
            deleteFile(r4)     // Catch: java.lang.Throwable -> L7 java.lang.Exception -> L9
            goto Lb
        L7:
            r3 = move-exception
            goto L40
        L9:
            r3 = move-exception
            goto L36
        Lb:
            makeDir(r4)     // Catch: java.lang.Throwable -> L7 java.lang.Exception -> L9
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L7 java.lang.Exception -> L9
            java.lang.String r2 = "rw"
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L7 java.lang.Exception -> L9
            if (r5 != 0) goto L22
            r4 = 0
            r1.setLength(r4)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            goto L2d
        L1d:
            r3 = move-exception
            r0 = r1
            goto L40
        L20:
            r3 = move-exception
            goto L35
        L22:
            if (r6 >= 0) goto L29
            long r4 = r1.length()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            goto L2a
        L29:
            long r4 = (long) r6     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
        L2a:
            r1.seek(r4)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
        L2d:
            r1.write(r3)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r3 = 1
            r1.close()     // Catch: java.lang.Exception -> L3f
            goto L3f
        L35:
            r0 = r1
        L36:
            p000.xi9.m25212e(r3)     // Catch: java.lang.Throwable -> L7
            r3 = 0
            if (r0 == 0) goto L3f
            r0.close()     // Catch: java.lang.Exception -> L3f
        L3f:
            return r3
        L40:
            if (r0 == 0) goto L45
            r0.close()     // Catch: java.lang.Exception -> L45
        L45:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.st5.saveFile(byte[], java.lang.String, boolean, int):boolean");
    }
}
