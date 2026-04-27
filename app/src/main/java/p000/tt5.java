package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class tt5 {

    /* JADX INFO: renamed from: a */
    public static final String f85822a = "FileUtil";

    /* JADX INFO: renamed from: b */
    public static final int f85823b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f85824c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f85825d = 2;

    /* JADX INFO: renamed from: a */
    private static String m22769a(Context context) {
        File externalFilesDir;
        return (Build.VERSION.SDK_INT < 29 || context == null || (externalFilesDir = context.getExternalFilesDir(null)) == null) ? Environment.getExternalStorageDirectory().getPath() : externalFilesDir.getPath();
    }

    public static boolean bitmapToFile(Bitmap bitmap, String str, int i) throws Throwable {
        FileOutputStream fileOutputStream;
        if (bitmap != null && !TextUtils.isEmpty(str)) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(str);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream2 = fileOutputStream;
                        e.printStackTrace();
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.flush();
                                fileOutputStream2.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                }
            } catch (IOException e5) {
                e = e5;
            }
        }
        return false;
    }

    public static boolean bytesToFile(byte[] bArr, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        if (bArr == null || TextUtils.isEmpty(str)) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(str);
                try {
                    fileOutputStream.write(bArr);
                    try {
                        fileOutputStream.close();
                        return true;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return true;
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    if (fileOutputStream2 == null) {
                        return false;
                    }
                    try {
                        fileOutputStream2.close();
                        return false;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }

    public static boolean checkFileExist(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007a A[Catch: IOException -> 0x0050, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x0050, blocks: (B:30:0x004b, B:54:0x007a, B:64:0x0090), top: B:82:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0090 A[Catch: IOException -> 0x0050, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x0050, blocks: (B:30:0x004b, B:54:0x007a, B:64:0x0090), top: B:82:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0094 -> B:81:0x00ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void copyFromAssetsToSdcard(android.content.Context r3, boolean r4, java.lang.String r5, java.lang.String r6) throws java.lang.Throwable {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto Lad
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto Lad
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            if (r4 != 0) goto L1b
            if (r4 != 0) goto Lad
            boolean r4 = r0.exists()
            if (r4 != 0) goto Lad
        L1b:
            r4 = 0
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60 java.io.FileNotFoundException -> L64
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60 java.io.FileNotFoundException -> L64
            java.io.InputStream r3 = r3.open(r5)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60 java.io.FileNotFoundException -> L64
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L59
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L59
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r4]     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3f java.io.FileNotFoundException -> L41
        L31:
            r0 = 0
            int r1 = r3.read(r6, r0, r4)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3f java.io.FileNotFoundException -> L41
            if (r1 < 0) goto L43
            r5.write(r6, r0, r1)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3f java.io.FileNotFoundException -> L41
            goto L31
        L3c:
            r4 = move-exception
            goto L98
        L3f:
            r4 = move-exception
            goto L6b
        L41:
            r4 = move-exception
            goto L81
        L43:
            r5.close()     // Catch: java.io.IOException -> L47
            goto L4b
        L47:
            r4 = move-exception
            r4.printStackTrace()
        L4b:
            r3.close()     // Catch: java.io.IOException -> L50
            goto Lad
        L50:
            r3 = move-exception
            goto L94
        L52:
            r5 = move-exception
            r2 = r5
            r5 = r4
            r4 = r2
            goto L98
        L57:
            r5 = move-exception
            goto L68
        L59:
            r5 = move-exception
            goto L7e
        L5b:
            r3 = move-exception
            r5 = r4
            r4 = r3
            r3 = r5
            goto L98
        L60:
            r3 = move-exception
            r5 = r3
            r3 = r4
            goto L68
        L64:
            r3 = move-exception
            r5 = r3
            r3 = r4
            goto L7e
        L68:
            r2 = r5
            r5 = r4
            r4 = r2
        L6b:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L78
            r5.close()     // Catch: java.io.IOException -> L74
            goto L78
        L74:
            r4 = move-exception
            r4.printStackTrace()
        L78:
            if (r3 == 0) goto Lad
            r3.close()     // Catch: java.io.IOException -> L50
            goto Lad
        L7e:
            r2 = r5
            r5 = r4
            r4 = r2
        L81:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L8e
            r5.close()     // Catch: java.io.IOException -> L8a
            goto L8e
        L8a:
            r4 = move-exception
            r4.printStackTrace()
        L8e:
            if (r3 == 0) goto Lad
            r3.close()     // Catch: java.io.IOException -> L50
            goto Lad
        L94:
            r3.printStackTrace()
            goto Lad
        L98:
            if (r5 == 0) goto La2
            r5.close()     // Catch: java.io.IOException -> L9e
            goto La2
        L9e:
            r5 = move-exception
            r5.printStackTrace()
        La2:
            if (r3 == 0) goto Lac
            r3.close()     // Catch: java.io.IOException -> La8
            goto Lac
        La8:
            r3 = move-exception
            r3.printStackTrace()
        Lac:
            throw r4
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tt5.copyFromAssetsToSdcard(android.content.Context, boolean, java.lang.String, java.lang.String):void");
    }

    public static void deleteFile(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            if (file.delete()) {
                dh8.m9156i("FileUtil", "delete file success!");
                return;
            }
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (file.delete()) {
                    dh8.m9156i("FileUtil", "delete empty file success!");
                    return;
                }
                return;
            }
            for (File file2 : fileArrListFiles) {
                deleteFile(file2);
            }
            if (file.delete()) {
                dh8.m9156i("FileUtil", "delete empty file success!");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.FileInputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] getBytes(java.lang.String r6) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r6 == 0) goto Lb0
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto Lb
            goto Lb0
        Lb:
            java.io.File r1 = new java.io.File
            r1.<init>(r6)
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5c java.io.FileNotFoundException -> L5f
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5c java.io.FileNotFoundException -> L5f
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d java.io.FileNotFoundException -> L50
            r1.<init>()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d java.io.FileNotFoundException -> L50
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c java.io.FileNotFoundException -> L2e
        L1e:
            int r3 = r6.read(r2)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c java.io.FileNotFoundException -> L2e
            r4 = -1
            if (r3 == r4) goto L31
            r4 = 0
            r1.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c java.io.FileNotFoundException -> L2e
            goto L1e
        L2a:
            r0 = move-exception
            goto L45
        L2c:
            r2 = move-exception
            goto L64
        L2e:
            r2 = move-exception
            goto L7d
        L31:
            r1.close()     // Catch: java.io.IOException -> L35
            goto L39
        L35:
            r0 = move-exception
            r0.printStackTrace()
        L39:
            byte[] r0 = r1.toByteArray()
            r6.close()     // Catch: java.io.IOException -> L42
            goto L97
        L42:
            r6 = move-exception
            goto L94
        L45:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L98
        L4a:
            r1 = move-exception
            goto L98
        L4d:
            r1 = move-exception
            r2 = r1
            goto L53
        L50:
            r1 = move-exception
            r2 = r1
            goto L55
        L53:
            r1 = r0
            goto L64
        L55:
            r1 = r0
            goto L7d
        L57:
            r6 = move-exception
            r1 = r0
            r0 = r6
            r6 = r1
            goto L45
        L5c:
            r6 = move-exception
            r2 = r6
            goto L62
        L5f:
            r6 = move-exception
            r2 = r6
            goto L7b
        L62:
            r6 = r0
            r1 = r6
        L64:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L75
            r1.close()     // Catch: java.io.IOException -> L6d
            goto L71
        L6d:
            r0 = move-exception
            r0.printStackTrace()
        L71:
            byte[] r0 = r1.toByteArray()
        L75:
            if (r6 == 0) goto L97
            r6.close()     // Catch: java.io.IOException -> L42
            goto L97
        L7b:
            r6 = r0
            r1 = r6
        L7d:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L8e
            r1.close()     // Catch: java.io.IOException -> L86
            goto L8a
        L86:
            r0 = move-exception
            r0.printStackTrace()
        L8a:
            byte[] r0 = r1.toByteArray()
        L8e:
            if (r6 == 0) goto L97
            r6.close()     // Catch: java.io.IOException -> L42
            goto L97
        L94:
            r6.printStackTrace()
        L97:
            return r0
        L98:
            if (r0 == 0) goto La5
            r0.close()     // Catch: java.io.IOException -> L9e
            goto La2
        L9e:
            r2 = move-exception
            r2.printStackTrace()
        La2:
            r0.toByteArray()
        La5:
            if (r6 == 0) goto Laf
            r6.close()     // Catch: java.io.IOException -> Lab
            goto Laf
        Lab:
            r6 = move-exception
            r6.printStackTrace()
        Laf:
            throw r1
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tt5.getBytes(java.lang.String):byte[]");
    }

    public static byte[] getFromRaw(Context context, int i) throws Throwable {
        byte[] bArr;
        IOException e;
        InputStream inputStream = null;
        bArr = null;
        byte[] bArr2 = null;
        inputStream = null;
        try {
            try {
                InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
                try {
                    Runtime runtime = Runtime.getRuntime();
                    int iFreeMemory = 512000;
                    if (runtime != null && runtime.freeMemory() < 512000) {
                        iFreeMemory = (int) runtime.freeMemory();
                    }
                    byte[] bArr3 = new byte[iFreeMemory];
                    byte[] bArr4 = new byte[1024];
                    int i2 = 0;
                    while (true) {
                        int i3 = inputStreamOpenRawResource.read(bArr4, 0, 1024);
                        if (i3 < 0) {
                            break;
                        }
                        int i4 = i2 + i3;
                        if (i4 <= iFreeMemory) {
                            System.arraycopy(bArr4, 0, bArr3, i2, i3);
                            i2 = i4;
                        }
                        e.printStackTrace();
                        return bArr2;
                    }
                    if (i2 > 0) {
                        bArr2 = new byte[i2];
                        System.arraycopy(bArr3, 0, bArr2, 0, i2);
                    }
                    try {
                        inputStreamOpenRawResource.close();
                        return bArr2;
                    } catch (IOException e2) {
                        e = e2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    byte[] bArr5 = bArr2;
                    inputStream = inputStreamOpenRawResource;
                    bArr = bArr5;
                    e.printStackTrace();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e4) {
                            bArr2 = bArr;
                            e = e4;
                        }
                    }
                    return bArr;
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStreamOpenRawResource;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e6) {
            e = e6;
            bArr = null;
        }
    }

    public static int judgeFileType(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.endsWith(".png") || str.endsWith(".PNG") || str.endsWith(".JPEG") || str.endsWith(".jpeg") || str.endsWith(".jpg") || str.endsWith(".JPG")) {
            return 1;
        }
        return (str.endsWith(".mov") || str.endsWith(".MOV") || str.endsWith(".mp4") || str.endsWith(".MP4") || str.endsWith(".avi") || str.endsWith(".AVI")) ? 2 : 0;
    }

    public static String splicingFilePath(Context context, String str, String str2, String str3, String str4) {
        String strM22769a = m22769a(context);
        if (!TextUtils.isEmpty(str)) {
            String str5 = File.separator;
            if (str.contains(str5)) {
                for (String str6 : str.split(str5)) {
                    if (!TextUtils.isEmpty(str6)) {
                        strM22769a = strM22769a + File.separator + str6;
                        File file = new File(strM22769a);
                        if (!file.exists() && file.mkdir()) {
                            dh8.m9160w("FileUtil", "create root dir success! path : " + strM22769a);
                        }
                    }
                }
            } else {
                strM22769a = strM22769a + str5 + str;
                File file2 = new File(strM22769a);
                if (!file2.exists() && file2.mkdir()) {
                    dh8.m9160w("FileUtil", "create root dir success! path : " + strM22769a);
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return strM22769a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strM22769a);
            String str7 = File.separator;
            sb.append(str7);
            sb.append(str2);
            String string = sb.toString();
            File file3 = new File(string);
            if (!file3.exists() && file3.mkdir()) {
                dh8.m9160w("FileUtil", "create one dir success!");
            }
            if (TextUtils.isEmpty(str3)) {
                return string;
            }
            String str8 = string + str7 + str3;
            File file4 = new File(str8);
            if (!file4.exists() && file4.mkdir()) {
                dh8.m9160w("FileUtil", "create two dir success!");
            }
            if (TextUtils.isEmpty(str4)) {
                return str8;
            }
            strM22769a = str8 + str7 + str4;
            File file5 = new File(strM22769a);
            if (!file5.exists() && file5.mkdir()) {
                dh8.m9160w("FileUtil", "create three sub dir success!");
            }
        }
        return strM22769a;
    }
}
