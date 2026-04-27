package p000;

import android.util.Log;
import com.blankj.utilcode.util.C2481n;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class lui {

    /* JADX INFO: renamed from: a */
    public static final int f58849a = 8192;

    private lui() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static List<String> getComments(String str) throws IOException {
        return getComments(C2481n.m4258O(str));
    }

    public static List<String> getFilesPath(String str) throws IOException {
        return getFilesPath(C2481n.m4258O(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean unzipChildFile(java.io.File r1, java.util.List<java.io.File> r2, java.util.zip.ZipFile r3, java.util.zip.ZipEntry r4, java.lang.String r5) throws java.lang.Throwable {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r5)
            r2.add(r0)
            boolean r1 = r4.isDirectory()
            if (r1 == 0) goto L13
            boolean r1 = com.blankj.utilcode.util.C2481n.m4323r(r0)
            return r1
        L13:
            boolean r1 = com.blankj.utilcode.util.C2481n.m4325s(r0)
            r2 = 0
            if (r1 != 0) goto L1b
            return r2
        L1b:
            r1 = 0
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4c
            java.io.InputStream r3 = r3.getInputStream(r4)     // Catch: java.lang.Throwable -> L4c
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L4c
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L48
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L48
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L48
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L48
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L3e
        L33:
            int r4 = r5.read(r1)     // Catch: java.lang.Throwable -> L3e
            r0 = -1
            if (r4 == r0) goto L40
            r3.write(r1, r2, r4)     // Catch: java.lang.Throwable -> L3e
            goto L33
        L3e:
            r1 = move-exception
            goto L50
        L40:
            r5.close()
            r3.close()
            r1 = 1
            return r1
        L48:
            r2 = move-exception
            r3 = r1
        L4a:
            r1 = r2
            goto L50
        L4c:
            r2 = move-exception
            r3 = r1
            r5 = r3
            goto L4a
        L50:
            if (r5 == 0) goto L55
            r5.close()
        L55:
            if (r3 == 0) goto L5a
            r3.close()
        L5a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lui.unzipChildFile(java.io.File, java.util.List, java.util.zip.ZipFile, java.util.zip.ZipEntry, java.lang.String):boolean");
    }

    public static List<File> unzipFile(String str, String str2) throws IOException {
        return unzipFileByKeyword(str, str2, (String) null);
    }

    public static List<File> unzipFileByKeyword(String str, String str2, String str3) throws IOException {
        return unzipFileByKeyword(C2481n.m4258O(str), C2481n.m4258O(str2), str3);
    }

    public static boolean zipFile(String str, String str2) throws IOException {
        return zipFile(C2481n.m4258O(str), C2481n.m4258O(str2), (String) null);
    }

    public static boolean zipFiles(Collection<String> collection, String str) throws IOException {
        return zipFiles(collection, str, (String) null);
    }

    public static List<String> getComments(File file) throws IOException {
        if (file == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            arrayList.add(enumerationEntries.nextElement().getComment());
        }
        zipFile.close();
        return arrayList;
    }

    public static List<String> getFilesPath(File file) throws IOException {
        if (file == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            String strReplace = enumerationEntries.nextElement().getName().replace(nk1.f64796h, pj4.f71071b);
            if (strReplace.contains("../")) {
                Log.e("ZipUtils", "entryName: " + strReplace + " is dangerous!");
                arrayList.add(strReplace);
            } else {
                arrayList.add(strReplace);
            }
        }
        zipFile.close();
        return arrayList;
    }

    public static List<File> unzipFile(File file, File file2) throws IOException {
        return unzipFileByKeyword(file, file2, (String) null);
    }

    public static List<File> unzipFileByKeyword(File file, File file2, String str) throws IOException {
        if (file == null || file2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        try {
            if (C2481n.m4235C0(str)) {
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    String strReplace = zipEntryNextElement.getName().replace(nk1.f64796h, pj4.f71071b);
                    if (strReplace.contains("../")) {
                        Log.e("ZipUtils", "entryName: " + strReplace + " is dangerous!");
                    } else if (!unzipChildFile(file2, arrayList, zipFile, zipEntryNextElement, strReplace)) {
                        zipFile.close();
                        return arrayList;
                    }
                }
            } else {
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement2 = enumerationEntries.nextElement();
                    String strReplace2 = zipEntryNextElement2.getName().replace(nk1.f64796h, pj4.f71071b);
                    if (strReplace2.contains("../")) {
                        Log.e("ZipUtils", "entryName: " + strReplace2 + " is dangerous!");
                    } else if (strReplace2.contains(str) && !unzipChildFile(file2, arrayList, zipFile, zipEntryNextElement2, strReplace2)) {
                        zipFile.close();
                        return arrayList;
                    }
                }
            }
            zipFile.close();
            return arrayList;
        } catch (Throwable th) {
            zipFile.close();
            throw th;
        }
    }

    public static boolean zipFile(String str, String str2, String str3) throws IOException {
        return zipFile(C2481n.m4258O(str), C2481n.m4258O(str2), str3);
    }

    public static boolean zipFiles(Collection<String> collection, String str, String str2) throws Throwable {
        ZipOutputStream zipOutputStream;
        if (collection == null || str == null) {
            return false;
        }
        ZipOutputStream zipOutputStream2 = null;
        try {
            zipOutputStream = new ZipOutputStream(new FileOutputStream(str));
        } catch (Throwable th) {
            th = th;
        }
        try {
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                if (!zipFile(C2481n.m4258O(it.next()), "", zipOutputStream, str2)) {
                    zipOutputStream.finish();
                    zipOutputStream.close();
                    return false;
                }
            }
            zipOutputStream.finish();
            zipOutputStream.close();
            return true;
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream2 = zipOutputStream;
            if (zipOutputStream2 != null) {
                zipOutputStream2.finish();
                zipOutputStream2.close();
            }
            throw th;
        }
    }

    public static boolean zipFile(File file, File file2) throws IOException {
        return zipFile(file, file2, (String) null);
    }

    public static boolean zipFile(File file, File file2, String str) throws Throwable {
        ZipOutputStream zipOutputStream;
        if (file == null || file2 == null) {
            return false;
        }
        ZipOutputStream zipOutputStream2 = null;
        try {
            zipOutputStream = new ZipOutputStream(new FileOutputStream(file2));
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean zZipFile = zipFile(file, "", zipOutputStream, str);
            zipOutputStream.close();
            return zZipFile;
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream2 = zipOutputStream;
            if (zipOutputStream2 != null) {
                zipOutputStream2.close();
            }
            throw th;
        }
    }

    private static boolean zipFile(File file, String str, ZipOutputStream zipOutputStream, String str2) throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(C2481n.m4235C0(str) ? "" : File.separator);
        sb.append(file.getName());
        String string = sb.toString();
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    if (!zipFile(file2, string, zipOutputStream, str2)) {
                        return false;
                    }
                }
                return true;
            }
            ZipEntry zipEntry = new ZipEntry(string + '/');
            zipEntry.setComment(str2);
            zipOutputStream.putNextEntry(zipEntry);
            zipOutputStream.closeEntry();
            return true;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                ZipEntry zipEntry2 = new ZipEntry(string);
                zipEntry2.setComment(str2);
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = bufferedInputStream2.read(bArr, 0, 8192);
                    if (i != -1) {
                        zipOutputStream.write(bArr, 0, i);
                    } else {
                        zipOutputStream.closeEntry();
                        bufferedInputStream2.close();
                        return true;
                    }
                }
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean zipFiles(Collection<File> collection, File file) throws IOException {
        return zipFiles(collection, file, (String) null);
    }

    public static boolean zipFiles(Collection<File> collection, File file, String str) throws Throwable {
        ZipOutputStream zipOutputStream;
        if (collection == null || file == null) {
            return false;
        }
        ZipOutputStream zipOutputStream2 = null;
        try {
            zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
        } catch (Throwable th) {
            th = th;
        }
        try {
            Iterator<File> it = collection.iterator();
            while (it.hasNext()) {
                if (!zipFile(it.next(), "", zipOutputStream, str)) {
                    zipOutputStream.finish();
                    zipOutputStream.close();
                    return false;
                }
            }
            zipOutputStream.finish();
            zipOutputStream.close();
            return true;
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream2 = zipOutputStream;
            if (zipOutputStream2 != null) {
                zipOutputStream2.finish();
                zipOutputStream2.close();
            }
            throw th;
        }
    }
}
