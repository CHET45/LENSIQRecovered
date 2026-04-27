package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p000.nqd;

/* JADX INFO: loaded from: classes4.dex */
public class q10 implements nqd.InterfaceC10003a {

    /* JADX INFO: renamed from: a */
    public static final int f72735a = 5;

    /* JADX INFO: renamed from: b */
    public static final int f72736b = 4096;

    /* JADX INFO: renamed from: q10$a */
    public static class C11248a {

        /* JADX INFO: renamed from: a */
        public ZipFile f72737a;

        /* JADX INFO: renamed from: b */
        public ZipEntry f72738b;

        public C11248a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f72737a = zipFile;
            this.f72738b = zipEntry;
        }
    }

    private void closeSilently(final Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private long copy(InputStream in, OutputStream out) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int i = in.read(bArr);
            if (i == -1) {
                out.flush();
                return j;
            }
            out.write(bArr, 0, i);
            j += (long) i;
        }
    }

    private C11248a findAPKWithLibrary(final Context context, final String[] abis, final String mappedLibraryName, final oqd instance) {
        String[] strArrSourceDirectories = sourceDirectories(context);
        int length = strArrSourceDirectories.length;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str = strArrSourceDirectories[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile != null) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        for (String str2 : abis) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(oqd.f68307g);
                            char c = File.separatorChar;
                            sb.append(c);
                            sb.append(str2);
                            sb.append(c);
                            sb.append(mappedLibraryName);
                            String string = sb.toString();
                            instance.log("Looking for %s in APK %s...", string, str);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                return new C11248a(zipFile, entry);
                            }
                        }
                        i4 = i5;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
        }
    }

    private String[] getSupportedABIs(Context context, String mappedLibraryName) {
        StringBuilder sb = new StringBuilder();
        sb.append(oqd.f68307g);
        char c = File.separatorChar;
        sb.append(c);
        sb.append("([^\\");
        sb.append(c);
        sb.append("]*)");
        sb.append(c);
        sb.append(mappedLibraryName);
        Pattern patternCompile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str : sourceDirectories(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private String[] sourceDirectories(final Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // p000.nqd.InterfaceC10003a
    @igg({"SetWorldReadable"})
    public void installLibrary(Context context, String[] strArr, String str, File file, oqd oqdVar) throws Throwable {
        C11248a c11248aFindAPKWithLibrary;
        String[] supportedABIs;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        long jCopy;
        C11248a c11248a = null;
        Closeable closeable = null;
        try {
            c11248aFindAPKWithLibrary = findAPKWithLibrary(context, strArr, str, oqdVar);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (c11248aFindAPKWithLibrary == null) {
                try {
                    supportedABIs = getSupportedABIs(context, str);
                } catch (Exception e) {
                    supportedABIs = new String[]{e.toString()};
                }
                throw new fwa(str, strArr, supportedABIs);
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i >= 5) {
                    oqdVar.log("FATAL! Couldn't extract the library from the APK!");
                    try {
                        ZipFile zipFile = c11248aFindAPKWithLibrary.f72737a;
                        if (zipFile != null) {
                            zipFile.close();
                            return;
                        }
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                oqdVar.log("Found %s! Extracting...", str);
                try {
                    if (file.exists() || file.createNewFile()) {
                        try {
                            inputStream = c11248aFindAPKWithLibrary.f72737a.getInputStream(c11248aFindAPKWithLibrary.f72738b);
                            try {
                                fileOutputStream = new FileOutputStream(file);
                                try {
                                    jCopy = copy(inputStream, fileOutputStream);
                                    fileOutputStream.getFD().sync();
                                } catch (FileNotFoundException unused2) {
                                    closeSilently(inputStream);
                                } catch (IOException unused3) {
                                    closeSilently(inputStream);
                                } catch (Throwable th2) {
                                    th = th2;
                                    closeable = inputStream;
                                    closeSilently(closeable);
                                    closeSilently(fileOutputStream);
                                    throw th;
                                }
                            } catch (FileNotFoundException unused4) {
                                fileOutputStream = null;
                            } catch (IOException unused5) {
                                fileOutputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream = null;
                            }
                        } catch (FileNotFoundException unused6) {
                            inputStream = null;
                            fileOutputStream = null;
                        } catch (IOException unused7) {
                            inputStream = null;
                            fileOutputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            fileOutputStream = null;
                        }
                        if (jCopy == file.length()) {
                            closeSilently(inputStream);
                            closeSilently(fileOutputStream);
                            file.setReadable(true, false);
                            file.setExecutable(true, false);
                            file.setWritable(true);
                            try {
                                ZipFile zipFile2 = c11248aFindAPKWithLibrary.f72737a;
                                if (zipFile2 != null) {
                                    zipFile2.close();
                                    return;
                                }
                                return;
                            } catch (IOException unused8) {
                                return;
                            }
                        }
                        closeSilently(inputStream);
                        closeSilently(fileOutputStream);
                    }
                } catch (IOException unused9) {
                }
                i = i2;
            }
        } catch (Throwable th5) {
            th = th5;
            c11248a = c11248aFindAPKWithLibrary;
            if (c11248a != null) {
                try {
                    ZipFile zipFile3 = c11248a.f72737a;
                    if (zipFile3 != null) {
                        zipFile3.close();
                    }
                } catch (IOException unused10) {
                }
            }
            throw th;
        }
    }
}
