package p000;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.StatFs;
import android.text.TextUtils;
import com.blankj.utilcode.util.C2479l;
import com.blankj.utilcode.util.C2481n;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
public final class xt5 {

    /* JADX INFO: renamed from: a */
    public static final String f99224a = System.getProperty("line.separator");

    /* JADX INFO: renamed from: xt5$a */
    public static class C15293a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return true;
        }
    }

    /* JADX INFO: renamed from: xt5$b */
    public static class C15294b implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.isFile();
        }
    }

    /* JADX INFO: renamed from: xt5$c */
    public static class C15295c implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return true;
        }
    }

    /* JADX INFO: renamed from: xt5$d */
    public interface InterfaceC15296d {
        boolean onReplace(File file, File file2);
    }

    private xt5() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean copy(String str, String str2) {
        return copy(getFileByPath(str), getFileByPath(str2), (InterfaceC15296d) null);
    }

    private static boolean copyDir(File file, File file2, InterfaceC15296d interfaceC15296d) {
        return copyOrMoveDir(file, file2, interfaceC15296d, false);
    }

    private static boolean copyFile(File file, File file2, InterfaceC15296d interfaceC15296d) {
        return copyOrMoveFile(file, file2, interfaceC15296d, false);
    }

    private static boolean copyOrMoveDir(File file, File file2, InterfaceC15296d interfaceC15296d, boolean z) {
        if (file == null || file2 == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        String str = File.separator;
        sb.append(str);
        String string = sb.toString();
        String str2 = file2.getPath() + str;
        if (str2.contains(string) || !file.exists() || !file.isDirectory() || !createOrExistsDir(file2)) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file3 : fileArrListFiles) {
                File file4 = new File(str2 + file3.getName());
                if (file3.isFile()) {
                    if (!copyOrMoveFile(file3, file4, interfaceC15296d, z)) {
                        return false;
                    }
                } else if (file3.isDirectory() && !copyOrMoveDir(file3, file4, interfaceC15296d, z)) {
                    return false;
                }
            }
        }
        return !z || deleteDir(file);
    }

    private static boolean copyOrMoveFile(File file, File file2, InterfaceC15296d interfaceC15296d, boolean z) {
        if (file != null && file2 != null && !file.equals(file2) && file.exists() && file.isFile()) {
            if (file2.exists()) {
                if (interfaceC15296d != null && !interfaceC15296d.onReplace(file, file2)) {
                    return true;
                }
                if (!file2.delete()) {
                    return false;
                }
            }
            if (!createOrExistsDir(file2.getParentFile())) {
                return false;
            }
            try {
                if (!C2481n.m4299f1(file2.getAbsolutePath(), new FileInputStream(file))) {
                    return false;
                }
                if (z) {
                    if (!deleteFile(file)) {
                        return false;
                    }
                }
                return true;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean createFileByDeleteOldFile(String str) {
        return createFileByDeleteOldFile(getFileByPath(str));
    }

    public static boolean createOrExistsDir(String str) {
        return createOrExistsDir(getFileByPath(str));
    }

    public static boolean createOrExistsFile(String str) {
        return createOrExistsFile(getFileByPath(str));
    }

    public static boolean delete(String str) {
        return delete(getFileByPath(str));
    }

    public static boolean deleteAllInDir(String str) {
        return deleteAllInDir(getFileByPath(str));
    }

    private static boolean deleteDir(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !deleteDir(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    private static boolean deleteFile(File file) {
        return file != null && (!file.exists() || (file.isFile() && file.delete()));
    }

    public static boolean deleteFilesInDir(String str) {
        return deleteFilesInDir(getFileByPath(str));
    }

    public static boolean deleteFilesInDirWithFilter(String str, FileFilter fileFilter) {
        return deleteFilesInDirWithFilter(getFileByPath(str), fileFilter);
    }

    private static long getDirLength(File file) {
        long dirLength = 0;
        if (!isDir(file)) {
            return 0L;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                dirLength += file2.isDirectory() ? getDirLength(file2) : file2.length();
            }
        }
        return dirLength;
    }

    public static String getDirName(File file) {
        return file == null ? "" : getDirName(file.getAbsolutePath());
    }

    private static String getDirSize(File file) {
        long dirLength = getDirLength(file);
        return dirLength == -1 ? "" : C2481n.m4303h(dirLength);
    }

    public static File getFileByPath(String str) {
        if (C2481n.m4235C0(str)) {
            return null;
        }
        return new File(str);
    }

    public static String getFileCharsetSimple(String str) {
        return getFileCharsetSimple(getFileByPath(str));
    }

    public static String getFileExtension(File file) {
        return file == null ? "" : getFileExtension(file.getPath());
    }

    public static long getFileLastModified(String str) {
        return getFileLastModified(getFileByPath(str));
    }

    public static long getFileLength(String str) {
        if (str.matches(rwd.f79962g)) {
            try {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                httpsURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpsURLConnection.connect();
                if (httpsURLConnection.getResponseCode() == 200) {
                    return httpsURLConnection.getContentLength();
                }
                return -1L;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return getFileLength(getFileByPath(str));
    }

    public static int getFileLines(String str) {
        return getFileLines(getFileByPath(str));
    }

    public static byte[] getFileMD5(String str) {
        return getFileMD5(getFileByPath(str));
    }

    public static String getFileMD5ToString(String str) {
        return getFileMD5ToString(C2481n.m4235C0(str) ? null : new File(str));
    }

    public static String getFileName(File file) {
        return file == null ? "" : getFileName(file.getAbsolutePath());
    }

    public static String getFileNameNoExtension(File file) {
        return file == null ? "" : getFileNameNoExtension(file.getPath());
    }

    private static String getFileSize(File file) {
        long fileLength = getFileLength(file);
        return fileLength == -1 ? "" : C2481n.m4303h(fileLength);
    }

    public static long getFsAvailableSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        StatFs statFs = new StatFs(str);
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }

    public static long getFsTotalSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        StatFs statFs = new StatFs(str);
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    public static long getLength(String str) {
        return getLength(getFileByPath(str));
    }

    public static String getSize(String str) {
        return getSize(getFileByPath(str));
    }

    public static boolean isDir(String str) {
        return isDir(getFileByPath(str));
    }

    public static boolean isFile(String str) {
        return isFile(getFileByPath(str));
    }

    public static boolean isFileExists(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        return isFileExists(file.getAbsolutePath());
    }

    private static boolean isFileExistsApi29(String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = C2479l.getApp().getContentResolver().openAssetFileDescriptor(Uri.parse(str), "r");
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    return false;
                }
                try {
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (FileNotFoundException unused2) {
            }
        }
        return false;
    }

    public static boolean isUtf8(String str) {
        return isUtf8(getFileByPath(str));
    }

    public static List<File> listFilesInDir(String str) {
        return listFilesInDir(str, (Comparator<File>) null);
    }

    public static List<File> listFilesInDirWithFilter(String str, FileFilter fileFilter) {
        return listFilesInDirWithFilter(getFileByPath(str), fileFilter);
    }

    private static List<File> listFilesInDirWithFilterInner(File file, FileFilter fileFilter, boolean z) {
        File[] fileArrListFiles;
        ArrayList arrayList = new ArrayList();
        if (isDir(file) && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (fileFilter.accept(file2)) {
                    arrayList.add(file2);
                }
                if (z && file2.isDirectory()) {
                    arrayList.addAll(listFilesInDirWithFilterInner(file2, fileFilter, true));
                }
            }
        }
        return arrayList;
    }

    public static boolean move(String str, String str2) {
        return move(getFileByPath(str), getFileByPath(str2), (InterfaceC15296d) null);
    }

    public static boolean moveDir(File file, File file2, InterfaceC15296d interfaceC15296d) {
        return copyOrMoveDir(file, file2, interfaceC15296d, true);
    }

    public static boolean moveFile(File file, File file2, InterfaceC15296d interfaceC15296d) {
        return copyOrMoveFile(file, file2, interfaceC15296d, true);
    }

    public static void notifySystemToScan(String str) {
        notifySystemToScan(getFileByPath(str));
    }

    public static boolean rename(String str, String str2) {
        return rename(getFileByPath(str), str2);
    }

    public static boolean copy(String str, String str2, InterfaceC15296d interfaceC15296d) {
        return copy(getFileByPath(str), getFileByPath(str2), interfaceC15296d);
    }

    public static boolean createFileByDeleteOldFile(File file) {
        if (file == null) {
            return false;
        }
        if ((file.exists() && !file.delete()) || !createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean createOrExistsDir(File file) {
        return file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
    }

    public static boolean createOrExistsFile(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean delete(File file) {
        if (file == null) {
            return false;
        }
        return file.isDirectory() ? deleteDir(file) : deleteFile(file);
    }

    public static boolean deleteAllInDir(File file) {
        return deleteFilesInDirWithFilter(file, new C15293a());
    }

    public static boolean deleteFilesInDir(File file) {
        return deleteFilesInDirWithFilter(file, new C15294b());
    }

    public static boolean deleteFilesInDirWithFilter(File file, FileFilter fileFilter) {
        if (file == null || fileFilter == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                if (fileFilter.accept(file2)) {
                    if (file2.isFile()) {
                        if (!file2.delete()) {
                            return false;
                        }
                    } else if (file2.isDirectory() && !deleteDir(file2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static String getFileCharsetSimple(File file) throws Throwable {
        int i;
        if (file == null) {
            return "";
        }
        if (isUtf8(file)) {
            return "UTF-8";
        }
        ?? r0 = 0;
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    i = (bufferedInputStream2.read() << 8) + bufferedInputStream2.read();
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedInputStream = bufferedInputStream2;
                    e.printStackTrace();
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    i = 0;
                } catch (Throwable th) {
                    th = th;
                    r0 = bufferedInputStream2;
                    if (r0 != 0) {
                        try {
                            r0.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
            r0 = 65279;
            return i != 65279 ? i != 65534 ? "GBK" : "Unicode" : CharsetNames.UTF_16BE;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static long getFileLastModified(File file) {
        if (file == null) {
            return -1L;
        }
        return file.lastModified();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x004f -> B:45:0x005e). Please report as a decompilation issue!!! */
    public static int getFileLines(File file) throws Throwable {
        int i = 1;
        ?? r1 = 0;
        BufferedInputStream bufferedInputStream = null;
        r1 = 0;
        try {
        } catch (IOException e) {
            e.printStackTrace();
            r1 = r1;
        }
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    byte[] bArr = new byte[1024];
                    if (!f99224a.endsWith("\n")) {
                        while (true) {
                            int i2 = bufferedInputStream2.read(bArr, 0, 1024);
                            if (i2 == -1) {
                                break;
                            }
                            for (int i3 = 0; i3 < i2; i3++) {
                                if (bArr[i3] == 13) {
                                    i++;
                                }
                            }
                        }
                    } else {
                        while (true) {
                            int i4 = bufferedInputStream2.read(bArr, 0, 1024);
                            if (i4 == -1) {
                                break;
                            }
                            for (int i5 = 0; i5 < i4; i5++) {
                                if (bArr[i5] == 10) {
                                    i++;
                                }
                            }
                        }
                    }
                    bufferedInputStream2.close();
                    r1 = bArr;
                } catch (IOException e2) {
                    e = e2;
                    bufferedInputStream = bufferedInputStream2;
                    e.printStackTrace();
                    r1 = bufferedInputStream;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                        r1 = bufferedInputStream;
                    }
                } catch (Throwable th) {
                    th = th;
                    r1 = bufferedInputStream2;
                    if (r1 != 0) {
                        try {
                            r1.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
            }
            return i;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0030: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:17:0x0030 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] getFileMD5(java.io.File r3) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            java.security.DigestInputStream r2 = new java.security.DigestInputStream     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            r3 = 262144(0x40000, float:3.67342E-40)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
        L18:
            int r1 = r2.read(r3)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            if (r1 > 0) goto L18
            java.security.MessageDigest r3 = r2.getMessageDigest()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            byte[] r3 = r3.digest()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            r2.close()     // Catch: java.io.IOException -> L2a
            goto L2e
        L2a:
            r0 = move-exception
            r0.printStackTrace()
        L2e:
            return r3
        L2f:
            r3 = move-exception
            r0 = r2
            goto L4b
        L32:
            r3 = move-exception
            goto L3d
        L34:
            r3 = move-exception
            goto L3d
        L36:
            r3 = move-exception
            goto L4b
        L38:
            r3 = move-exception
        L39:
            r2 = r0
            goto L3d
        L3b:
            r3 = move-exception
            goto L39
        L3d:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L4a
            r2.close()     // Catch: java.io.IOException -> L46
            goto L4a
        L46:
            r3 = move-exception
            r3.printStackTrace()
        L4a:
            return r0
        L4b:
            if (r0 == 0) goto L55
            r0.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r0 = move-exception
            r0.printStackTrace()
        L55:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xt5.getFileMD5(java.io.File):byte[]");
    }

    public static long getLength(File file) {
        if (file == null) {
            return 0L;
        }
        return file.isDirectory() ? getDirLength(file) : getFileLength(file);
    }

    public static String getSize(File file) {
        return file == null ? "" : file.isDirectory() ? getDirSize(file) : getFileSize(file);
    }

    public static boolean isDir(File file) {
        return file != null && file.exists() && file.isDirectory();
    }

    public static boolean isFile(File file) {
        return file != null && file.exists() && file.isFile();
    }

    public static boolean isUtf8(File file) throws Throwable {
        if (file == null) {
            return false;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                byte[] bArr = new byte[24];
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    int i = bufferedInputStream2.read(bArr);
                    if (i == -1) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return false;
                    }
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    boolean z = isUtf8(bArr2) == 100;
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    return z;
                } catch (IOException e3) {
                    e = e3;
                    bufferedInputStream = bufferedInputStream2;
                    e.printStackTrace();
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static List<File> listFilesInDir(File file) {
        return listFilesInDir(file, (Comparator<File>) null);
    }

    public static List<File> listFilesInDirWithFilter(File file, FileFilter fileFilter) {
        return listFilesInDirWithFilter(file, fileFilter, false, (Comparator<File>) null);
    }

    public static boolean move(String str, String str2, InterfaceC15296d interfaceC15296d) {
        return move(getFileByPath(str), getFileByPath(str2), interfaceC15296d);
    }

    public static void notifySystemToScan(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.parse(iei.f46708b + file.getAbsolutePath()));
        C2479l.getApp().sendBroadcast(intent);
    }

    public static boolean rename(File file, String str) {
        if (file == null || !file.exists() || C2481n.m4235C0(str)) {
            return false;
        }
        if (str.equals(file.getName())) {
            return true;
        }
        File file2 = new File(file.getParent() + File.separator + str);
        return !file2.exists() && file.renameTo(file2);
    }

    public static boolean copy(File file, File file2) {
        return copy(file, file2, (InterfaceC15296d) null);
    }

    public static String getDirName(String str) {
        int iLastIndexOf;
        return (C2481n.m4235C0(str) || (iLastIndexOf = str.lastIndexOf(File.separator)) == -1) ? "" : str.substring(0, iLastIndexOf + 1);
    }

    public static String getFileExtension(String str) {
        if (C2481n.m4235C0(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return (iLastIndexOf == -1 || str.lastIndexOf(File.separator) >= iLastIndexOf) ? "" : str.substring(iLastIndexOf + 1);
    }

    public static String getFileMD5ToString(File file) {
        return C2481n.m4309k(getFileMD5(file));
    }

    public static String getFileName(String str) {
        if (C2481n.m4235C0(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(File.separator);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    public static String getFileNameNoExtension(String str) {
        if (C2481n.m4235C0(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        int iLastIndexOf2 = str.lastIndexOf(File.separator);
        if (iLastIndexOf2 == -1) {
            return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
        }
        if (iLastIndexOf != -1 && iLastIndexOf2 <= iLastIndexOf) {
            return str.substring(iLastIndexOf2 + 1, iLastIndexOf);
        }
        return str.substring(iLastIndexOf2 + 1);
    }

    public static boolean isFileExists(String str) {
        File fileByPath = getFileByPath(str);
        if (fileByPath == null) {
            return false;
        }
        if (fileByPath.exists()) {
            return true;
        }
        return isFileExistsApi29(str);
    }

    public static List<File> listFilesInDir(String str, Comparator<File> comparator) {
        return listFilesInDir(getFileByPath(str), false, comparator);
    }

    public static List<File> listFilesInDirWithFilter(String str, FileFilter fileFilter, Comparator<File> comparator) {
        return listFilesInDirWithFilter(getFileByPath(str), fileFilter, comparator);
    }

    public static boolean move(File file, File file2) {
        return move(file, file2, (InterfaceC15296d) null);
    }

    public static boolean copy(File file, File file2, InterfaceC15296d interfaceC15296d) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            return copyDir(file, file2, interfaceC15296d);
        }
        return copyFile(file, file2, interfaceC15296d);
    }

    public static List<File> listFilesInDir(File file, Comparator<File> comparator) {
        return listFilesInDir(file, false, comparator);
    }

    public static List<File> listFilesInDirWithFilter(File file, FileFilter fileFilter, Comparator<File> comparator) {
        return listFilesInDirWithFilter(file, fileFilter, false, comparator);
    }

    public static boolean move(File file, File file2, InterfaceC15296d interfaceC15296d) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            return moveDir(file, file2, interfaceC15296d);
        }
        return moveFile(file, file2, interfaceC15296d);
    }

    public static List<File> listFilesInDir(String str, boolean z) {
        return listFilesInDir(getFileByPath(str), z);
    }

    public static List<File> listFilesInDirWithFilter(String str, FileFilter fileFilter, boolean z) {
        return listFilesInDirWithFilter(getFileByPath(str), fileFilter, z);
    }

    public static List<File> listFilesInDir(File file, boolean z) {
        return listFilesInDir(file, z, (Comparator<File>) null);
    }

    public static List<File> listFilesInDirWithFilter(File file, FileFilter fileFilter, boolean z) {
        return listFilesInDirWithFilter(file, fileFilter, z, (Comparator<File>) null);
    }

    public static List<File> listFilesInDir(String str, boolean z, Comparator<File> comparator) {
        return listFilesInDir(getFileByPath(str), z, comparator);
    }

    public static List<File> listFilesInDirWithFilter(String str, FileFilter fileFilter, boolean z, Comparator<File> comparator) {
        return listFilesInDirWithFilter(getFileByPath(str), fileFilter, z, comparator);
    }

    public static List<File> listFilesInDir(File file, boolean z, Comparator<File> comparator) {
        return listFilesInDirWithFilter(file, new C15295c(), z, comparator);
    }

    public static List<File> listFilesInDirWithFilter(File file, FileFilter fileFilter, boolean z, Comparator<File> comparator) {
        List<File> listListFilesInDirWithFilterInner = listFilesInDirWithFilterInner(file, fileFilter, z);
        if (comparator != null) {
            Collections.sort(listListFilesInDirWithFilterInner, comparator);
        }
        return listListFilesInDirWithFilterInner;
    }

    private static long getFileLength(File file) {
        if (isFile(file)) {
            return file.length();
        }
        return -1L;
    }

    private static int isUtf8(byte[] bArr) {
        if (bArr.length > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) {
            return 100;
        }
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int length2 = 0;
        while (i < length) {
            byte b = bArr[i];
            if (b == -1 || (b & (-2)) == -2) {
                return 0;
            }
            if (length2 == 0) {
                if ((b & 127) == b && b != 0) {
                    i2++;
                } else if ((b & k95.f53214o7) == -64) {
                    int i4 = length2;
                    for (int i5 = 0; i5 < 8; i5++) {
                        byte b2 = (byte) (128 >> i5);
                        if ((bArr[i] & b2) != b2) {
                            break;
                        }
                        i4 = i5;
                    }
                    i3++;
                    length2 = i4;
                }
                i++;
            } else {
                if (bArr.length - i <= length2) {
                    length2 = bArr.length - i;
                }
                boolean z = false;
                for (int i6 = 0; i6 < length2; i6++) {
                    byte b3 = bArr[i + i6];
                    if ((b3 & (-128)) != -128) {
                        if ((b3 & 127) == b3 && bArr[i] != 0) {
                            i2++;
                        }
                        z = true;
                    }
                }
                if (z) {
                    i3--;
                    i++;
                } else {
                    i3 += length2;
                    i += length2;
                }
                length2 = 0;
            }
        }
        if (i2 == length) {
            return 100;
        }
        return (int) (((i3 + i2) / length) * 100.0f);
    }
}
