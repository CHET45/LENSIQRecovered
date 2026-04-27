package p000;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class l47 {
    private static void copyFile(Context context, Uri uri, File file) {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            copyStream(inputStreamOpenInputStream, fileOutputStream);
            inputStreamOpenInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(6:21|3|(1:5)(1:23)|17|9|13)|8|17|9|13|(1:(0))) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int copyStream(java.io.InputStream r6, java.io.OutputStream r7) {
        /*
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r1 = new byte[r0]
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            r2.<init>(r6, r0)
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream
            r6.<init>(r7, r0)
            r7 = 0
            r3 = r7
        L10:
            int r4 = r2.read(r1, r7, r0)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            r5 = -1
            if (r4 == r5) goto L1e
            r6.write(r1, r7, r4)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            int r3 = r3 + r4
            goto L10
        L1c:
            r7 = move-exception
            goto L28
        L1e:
            r6.flush()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
        L21:
            r6.close()     // Catch: java.lang.Exception -> L2f
            r2.close()     // Catch: java.lang.Exception -> L2f
            goto L2f
        L28:
            r6.close()     // Catch: java.lang.Exception -> L2e
            r2.close()     // Catch: java.lang.Exception -> L2e
        L2e:
            throw r7
        L2f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.l47.copyStream(java.io.InputStream, java.io.OutputStream):int");
    }

    private static String getDataColumn(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Cursor cursor = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String getFileAbsolutePath(Context context, Uri uri) {
        Uri uri2 = null;
        if (context != null && uri != null) {
            int i = Build.VERSION.SDK_INT;
            if (i < 29 && DocumentsContract.isDocumentUri(context, uri)) {
                if (isExternalStorageDocument(uri)) {
                    String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(g1i.f38277c);
                    if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                        return Environment.getExternalStorageDirectory() + pj4.f71071b + strArrSplit[1];
                    }
                } else {
                    if (isDownloadsDocument(uri)) {
                        return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                    }
                    if (isMediaDocument(uri)) {
                        String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(g1i.f38277c);
                        String str = strArrSplit2[0];
                        if ("image".equals(str)) {
                            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        } else if ("video".equals(str)) {
                            uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        } else if ("audio".equals(str)) {
                            uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        }
                        return getDataColumn(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
                    }
                }
            }
            if (i >= 29) {
                return uriToFileApiQ(context, uri);
            }
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return isGooglePhotosUri(uri) ? uri.getLastPathSegment() : getFilePathFromUri(context, uri);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    private static String getFileFromContentUri(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        String[] strArr = {"_data", "_display_name"};
        Cursor cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
        if (cursorQuery == null) {
            return "";
        }
        cursorQuery.moveToFirst();
        try {
            return cursorQuery.getString(cursorQuery.getColumnIndex(strArr[0]));
        } catch (Exception unused) {
            return "";
        } finally {
            cursorQuery.close();
        }
    }

    private static String getFileName(Uri uri) {
        String path;
        int iLastIndexOf;
        if (uri == null || (iLastIndexOf = (path = uri.getPath()).lastIndexOf(47)) == -1) {
            return null;
        }
        return path.substring(iLastIndexOf + 1);
    }

    private static String getFilePathFromUri(Context context, Uri uri) {
        String realFilePath = getRealFilePath(context, uri);
        if (!TextUtils.isEmpty(realFilePath)) {
            return realFilePath;
        }
        File filesDir = context.getApplicationContext().getFilesDir();
        String fileName = getFileName(uri);
        if (TextUtils.isEmpty(fileName)) {
            return null;
        }
        File file = new File(filesDir + File.separator + fileName);
        copyFile(context, uri, file);
        return file.getAbsolutePath();
    }

    private static String getRealFilePath(Context context, Uri uri) {
        int columnIndex;
        String string = null;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme != null && !"file".equals(scheme)) {
            if (!"content".equals(scheme)) {
                return null;
            }
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_data")) > -1) {
                string = cursorQuery.getString(columnIndex);
            }
            cursorQuery.close();
            return string;
        }
        return uri.getPath();
    }

    private static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    private static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[PHI: r1
  0x0095: PHI (r1v3 java.io.File) = (r1v2 java.io.File), (r1v2 java.io.File), (r1v4 java.io.File) binds: [B:6:0x0022, B:8:0x0036, B:20:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    @p000.c5e(api = 29)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String uriToFileApiQ(android.content.Context r8, android.net.Uri r9) {
        /*
            java.lang.String r0 = r9.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L17
            java.io.File r8 = new java.io.File
            java.lang.String r9 = r9.getPath()
            r8.<init>(r9)
            goto L96
        L17:
            java.lang.String r0 = r9.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L95
            android.content.ContentResolver r0 = r8.getContentResolver()
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r2 = r0
            r3 = r9
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)
            boolean r3 = r2.moveToFirst()
            if (r3 == 0) goto L95
            java.lang.String r3 = "_display_name"
            int r3 = r2.getColumnIndex(r3)
            java.lang.String r2 = r2.getString(r3)
            java.io.InputStream r9 = r0.openInputStream(r9)     // Catch: java.io.IOException -> L75
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L75
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L75
            r3.<init>()     // Catch: java.io.IOException -> L75
            java.io.File r8 = r8.getExternalCacheDir()     // Catch: java.io.IOException -> L75
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.io.IOException -> L75
            r3.append(r8)     // Catch: java.io.IOException -> L75
            java.lang.String r8 = "/"
            r3.append(r8)     // Catch: java.io.IOException -> L75
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L75
            r3.append(r4)     // Catch: java.io.IOException -> L75
            java.lang.String r8 = r3.toString()     // Catch: java.io.IOException -> L75
            r0.<init>(r8)     // Catch: java.io.IOException -> L75
            boolean r8 = r0.exists()     // Catch: java.io.IOException -> L75
            if (r8 != 0) goto L77
            r0.mkdir()     // Catch: java.io.IOException -> L75
            goto L77
        L75:
            r8 = move-exception
            goto L92
        L77:
            java.io.File r8 = new java.io.File     // Catch: java.io.IOException -> L75
            java.lang.String r0 = r0.getPath()     // Catch: java.io.IOException -> L75
            r8.<init>(r0, r2)     // Catch: java.io.IOException -> L75
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L75
            r0.<init>(r8)     // Catch: java.io.IOException -> L75
            p000.k47.m14513a(r9, r0)     // Catch: java.io.IOException -> L75
            r0.close()     // Catch: java.io.IOException -> L8f
            r9.close()     // Catch: java.io.IOException -> L8f
            goto L96
        L8f:
            r9 = move-exception
            r1 = r8
            r8 = r9
        L92:
            r8.printStackTrace()
        L95:
            r8 = r1
        L96:
            java.lang.String r8 = r8.getAbsolutePath()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.l47.uriToFileApiQ(android.content.Context, android.net.Uri):java.lang.String");
    }
}
