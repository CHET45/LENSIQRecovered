package p000;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.blankj.utilcode.util.C2479l;
import com.blankj.utilcode.util.C2481n;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class dyh {
    private dyh() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.io.File copyUri2Cache(android.net.Uri r7) throws java.lang.Throwable {
        /*
            r0 = 0
            android.app.Application r1 = com.blankj.utilcode.util.C2479l.getApp()     // Catch: java.lang.Throwable -> L45 java.io.FileNotFoundException -> L4a
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L45 java.io.FileNotFoundException -> L4a
            java.io.InputStream r7 = r1.openInputStream(r7)     // Catch: java.lang.Throwable -> L45 java.io.FileNotFoundException -> L4a
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            android.app.Application r2 = com.blankj.utilcode.util.C2479l.getApp()     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            java.io.File r2 = r2.getCacheDir()     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            r3.<init>()     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            java.lang.String r4 = ""
            r3.append(r4)     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            r3.append(r4)     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            java.lang.String r2 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            com.blankj.utilcode.util.C2481n.m4299f1(r2, r7)     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            if (r7 == 0) goto L40
            r7.close()     // Catch: java.io.IOException -> L3c
            goto L40
        L3c:
            r7 = move-exception
            r7.printStackTrace()
        L40:
            return r1
        L41:
            r0 = move-exception
            goto L5a
        L43:
            r1 = move-exception
            goto L4c
        L45:
            r7 = move-exception
            r6 = r0
            r0 = r7
            r7 = r6
            goto L5a
        L4a:
            r1 = move-exception
            r7 = r0
        L4c:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L41
            if (r7 == 0) goto L59
            r7.close()     // Catch: java.io.IOException -> L55
            goto L59
        L55:
            r7 = move-exception
            r7.printStackTrace()
        L59:
            return r0
        L5a:
            if (r7 == 0) goto L64
            r7.close()     // Catch: java.io.IOException -> L60
            goto L64
        L60:
            r7 = move-exception
            r7.printStackTrace()
        L64:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dyh.copyUri2Cache(android.net.Uri):java.io.File");
    }

    public static Uri file2Uri(File file) {
        if (!C2481n.m4328t0(file)) {
            return null;
        }
        return FileProvider.getUriForFile(C2479l.getApp(), C2479l.getApp().getPackageName() + ".utilcode.fileprovider", file);
    }

    private static File getFileFromUri(Uri uri, String str) {
        return getFileFromUri(uri, null, null, str);
    }

    public static Uri res2Uri(String str) {
        return Uri.parse("android.resource://" + C2479l.getApp().getPackageName() + pj4.f71071b + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] uri2Bytes(android.net.Uri r3) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            android.app.Application r1 = com.blankj.utilcode.util.C2479l.getApp()     // Catch: java.lang.Throwable -> L23 java.io.FileNotFoundException -> L28
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L23 java.io.FileNotFoundException -> L28
            java.io.InputStream r3 = r1.openInputStream(r3)     // Catch: java.lang.Throwable -> L23 java.io.FileNotFoundException -> L28
            byte[] r0 = com.blankj.utilcode.util.C2481n.m4314m0(r3)     // Catch: java.lang.Throwable -> L1f java.io.FileNotFoundException -> L21
            if (r3 == 0) goto L1e
            r3.close()     // Catch: java.io.IOException -> L1a
            goto L1e
        L1a:
            r3 = move-exception
            r3.printStackTrace()
        L1e:
            return r0
        L1f:
            r0 = move-exception
            goto L38
        L21:
            r1 = move-exception
            goto L2a
        L23:
            r3 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
            goto L38
        L28:
            r1 = move-exception
            r3 = r0
        L2a:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L37
            r3.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r3 = move-exception
            r3.printStackTrace()
        L37:
            return r0
        L38:
            if (r3 == 0) goto L42
            r3.close()     // Catch: java.io.IOException -> L3e
            goto L42
        L3e:
            r3 = move-exception
            r3.printStackTrace()
        L42:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dyh.uri2Bytes(android.net.Uri):byte[]");
    }

    public static File uri2File(Uri uri) {
        if (uri == null) {
            return null;
        }
        File fileUri2FileReal = uri2FileReal(uri);
        return fileUri2FileReal != null ? fileUri2FileReal : copyUri2Cache(uri);
    }

    private static File uri2FileReal(Uri uri) {
        Uri uri2;
        File fileFromUri;
        String str;
        File file;
        uri.toString();
        String authority = uri.getAuthority();
        String scheme = uri.getScheme();
        String path = uri.getPath();
        int i = 0;
        if (path != null) {
            String[] strArr = {"/external/", "/external_path/"};
            for (int i2 = 0; i2 < 2; i2++) {
                String str2 = strArr[i2];
                if (path.startsWith(str2)) {
                    File file2 = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + path.replace(str2, pj4.f71071b));
                    if (file2.exists()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(uri.toString());
                        sb.append(" -> ");
                        sb.append(str2);
                        return file2;
                    }
                }
            }
            if (path.startsWith("/files_path/")) {
                file = new File(C2479l.getApp().getFilesDir().getAbsolutePath() + path.replace("/files_path/", pj4.f71071b));
            } else if (path.startsWith("/cache_path/")) {
                file = new File(C2479l.getApp().getCacheDir().getAbsolutePath() + path.replace("/cache_path/", pj4.f71071b));
            } else if (path.startsWith("/external_files_path/")) {
                file = new File(C2479l.getApp().getExternalFilesDir(null).getAbsolutePath() + path.replace("/external_files_path/", pj4.f71071b));
            } else if (path.startsWith("/external_cache_path/")) {
                file = new File(C2479l.getApp().getExternalCacheDir().getAbsolutePath() + path.replace("/external_cache_path/", pj4.f71071b));
            } else {
                file = null;
            }
            if (file != null && file.exists()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(uri.toString());
                sb2.append(" -> ");
                sb2.append(path);
                return file;
            }
        }
        if ("file".equals(scheme)) {
            if (path != null) {
                return new File(path);
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(uri.toString());
            sb3.append(" parse failed. -> 0");
            return null;
        }
        if (!DocumentsContract.isDocumentUri(C2479l.getApp(), uri)) {
            if ("content".equals(scheme)) {
                return getFileFromUri(uri, k95.f53083Y4);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(uri.toString());
            sb4.append(" parse failed. -> 3");
            return null;
        }
        if ("com.android.externalstorage.documents".equals(authority)) {
            String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(g1i.f38277c);
            String str3 = strArrSplit[0];
            if ("primary".equalsIgnoreCase(str3)) {
                return new File(Environment.getExternalStorageDirectory() + pj4.f71071b + strArrSplit[1]);
            }
            StorageManager storageManager = (StorageManager) C2479l.getApp().getSystemService("storage");
            try {
                Class<?> cls = Class.forName("android.os.storage.StorageVolume");
                Method method = storageManager.getClass().getMethod("getVolumeList", null);
                Method method2 = cls.getMethod("getUuid", null);
                Method method3 = cls.getMethod("getState", null);
                Method method4 = cls.getMethod("getPath", null);
                Method method5 = cls.getMethod("isPrimary", null);
                Method method6 = cls.getMethod("isEmulated", null);
                Object objInvoke = method.invoke(storageManager, null);
                int length = Array.getLength(objInvoke);
                while (i < length) {
                    Object obj = Array.get(objInvoke, i);
                    if ("mounted".equals(method3.invoke(obj, null)) || "mounted_ro".equals(method3.invoke(obj, null))) {
                        if ((!((Boolean) method5.invoke(obj, null)).booleanValue() || !((Boolean) method6.invoke(obj, null)).booleanValue()) && (str = (String) method2.invoke(obj, null)) != null && str.equals(str3)) {
                            return new File(method4.invoke(obj, null) + pj4.f71071b + strArrSplit[1]);
                        }
                    }
                    i++;
                }
            } catch (Exception e) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(uri.toString());
                sb5.append(" parse failed. ");
                sb5.append(e.toString());
                sb5.append(" -> 1_0");
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append(uri.toString());
            sb6.append(" parse failed. -> 1_0");
            return null;
        }
        if (!"com.android.providers.downloads.documents".equals(authority)) {
            if (!"com.android.providers.media.documents".equals(authority)) {
                if ("content".equals(scheme)) {
                    return getFileFromUri(uri, "1_3");
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(uri.toString());
                sb7.append(" parse failed. -> 1_4");
                return null;
            }
            String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(g1i.f38277c);
            String str4 = strArrSplit2[0];
            if ("image".equals(str4)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str4)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else {
                if (!"audio".equals(str4)) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(uri.toString());
                    sb8.append(" parse failed. -> 1_2");
                    return null;
                }
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return getFileFromUri(uri2, "_id=?", new String[]{strArrSplit2[1]}, "1_2");
        }
        String documentId = DocumentsContract.getDocumentId(uri);
        if (TextUtils.isEmpty(documentId)) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append(uri.toString());
            sb9.append(" parse failed(id is null). -> 1_1");
            return null;
        }
        if (documentId.startsWith("raw:")) {
            return new File(documentId.substring(4));
        }
        if (documentId.startsWith("msf:")) {
            documentId = documentId.split(g1i.f38277c)[1];
        }
        try {
            long j = Long.parseLong(documentId);
            String[] strArr2 = {"content://downloads/public_downloads", "content://downloads/all_downloads", "content://downloads/my_downloads"};
            while (i < 3) {
                try {
                    fileFromUri = getFileFromUri(ContentUris.withAppendedId(Uri.parse(strArr2[i]), j), "1_1");
                } catch (Exception unused) {
                }
                if (fileFromUri != null) {
                    return fileFromUri;
                }
                i++;
            }
            StringBuilder sb10 = new StringBuilder();
            sb10.append(uri.toString());
            sb10.append(" parse failed. -> 1_1");
        } catch (Exception unused2) {
        }
        return null;
    }

    private static File getFileFromUri(Uri uri, String str, String[] strArr, String str2) {
        if ("com.google.android.apps.photos.content".equals(uri.getAuthority())) {
            if (!TextUtils.isEmpty(uri.getLastPathSegment())) {
                return new File(uri.getLastPathSegment());
            }
        } else if ("com.tencent.mtt.fileprovider".equals(uri.getAuthority())) {
            String path = uri.getPath();
            if (!TextUtils.isEmpty(path)) {
                return new File(Environment.getExternalStorageDirectory(), path.substring(10, path.length()));
            }
        } else if ("com.huawei.hidisk.fileprovider".equals(uri.getAuthority())) {
            String path2 = uri.getPath();
            if (!TextUtils.isEmpty(path2)) {
                return new File(path2.replace("/root", ""));
            }
        }
        Cursor cursorQuery = C2479l.getApp().getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
        try {
            if (cursorQuery == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(uri.toString());
                sb.append(" parse failed(cursor is null). -> ");
                sb.append(str2);
                return null;
            }
            if (!cursorQuery.moveToFirst()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(uri.toString());
                sb2.append(" parse failed(moveToFirst return false). -> ");
                sb2.append(str2);
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("_data");
            if (columnIndex > -1) {
                return new File(cursorQuery.getString(columnIndex));
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(uri.toString());
            sb3.append(" parse failed(columnIndex: ");
            sb3.append(columnIndex);
            sb3.append(" is wrong). -> ");
            sb3.append(str2);
            return null;
        } catch (Exception unused) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(uri.toString());
            sb4.append(" parse failed. -> ");
            sb4.append(str2);
            return null;
        } finally {
            cursorQuery.close();
        }
    }
}
