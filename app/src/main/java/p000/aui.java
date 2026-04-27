package p000;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.commons.compress.utils.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
public class aui {

    /* JADX INFO: renamed from: f */
    public static final int f11906f = 8192;

    /* JADX INFO: renamed from: g */
    public static final String f11907g = "ZipExtractor";

    /* JADX INFO: renamed from: a */
    public final File f11908a;

    /* JADX INFO: renamed from: b */
    public final File f11909b;

    /* JADX INFO: renamed from: d */
    public InterfaceC1614a f11911d;

    /* JADX INFO: renamed from: e */
    public boolean f11912e = false;

    /* JADX INFO: renamed from: c */
    public final Handler f11910c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: aui$a */
    public interface InterfaceC1614a {
        void onError(String str);

        void onFinish();

        void onProgress(int i);

        void onStart();
    }

    public aui(File file, File file2) {
        this.f11908a = file;
        this.f11909b = file2;
    }

    private boolean isPathSafe(File file, String str) {
        try {
            return new File(file, str).getCanonicalPath().startsWith(file.getAbsolutePath());
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$extract$0() {
        this.f11911d.onStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$extract$1() {
        this.f11911d.onError("无法创建目标目录: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$extract$2() {
        this.f11911d.onError("解压被中断: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$extract$3() {
        this.f11911d.onError("无法创建目录");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$extract$4() {
        this.f11911d.onError("无法创建父目录");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$extract$5(int i) {
        this.f11911d.onProgress(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$extract$6() {
        this.f11911d.onFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$extract$7(IOException iOException) {
        this.f11911d.onError("解压失败: " + iOException.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$unzip$8() {
        this.f11911d.onError("无法创建父目录");
    }

    /* JADX WARN: Finally extract failed */
    @Deprecated
    public void extract() {
        this.f11912e = true;
        try {
            try {
                if (this.f11911d != null) {
                    this.f11910c.post(new Runnable() { // from class: sti
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f82853a.lambda$extract$0();
                        }
                    });
                }
            } catch (IOException e) {
                Log.e(f11907g, "解压失败: " + e.getMessage(), e);
                if (this.f11911d != null) {
                    this.f11910c.post(new Runnable() { // from class: zti
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f106086a.lambda$extract$7(e);
                        }
                    });
                }
            }
            if (!this.f11909b.exists() && !this.f11909b.mkdirs()) {
                Log.e(f11907g, "extract: 无法创建目标目录: " + this.f11909b.getAbsolutePath());
                if (this.f11911d != null) {
                    this.f11910c.post(new Runnable() { // from class: tti
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f85925a.lambda$extract$1();
                        }
                    });
                }
                throw new IOException("无法创建目标目录: " + this.f11909b.getAbsolutePath());
            }
            long length = this.f11908a.length();
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(this.f11908a)));
            try {
                long j = 0;
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    if (Thread.currentThread().isInterrupted()) {
                        Log.e(f11907g, "extract: 解压被中断");
                        if (this.f11911d != null) {
                            this.f11910c.post(new Runnable() { // from class: uti
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f89146a.lambda$extract$2();
                                }
                            });
                        }
                        throw new IOException("解压被中断");
                    }
                    File file = new File(this.f11909b, nextEntry.getName());
                    StringBuilder sb = new StringBuilder();
                    sb.append("extract: entry ");
                    sb.append(nextEntry.getName());
                    if (!nextEntry.isDirectory()) {
                        File parentFile = file.getParentFile();
                        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                            Log.e(f11907g, "extract: 无法创建父目录: " + parentFile.getAbsolutePath());
                            if (this.f11911d != null) {
                                this.f11910c.post(new Runnable() { // from class: wti
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f95508a.lambda$extract$4();
                                    }
                                });
                            }
                            throw new IOException("无法创建父目录: " + parentFile.getAbsolutePath());
                        }
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr, 0, i);
                                j += (long) i;
                                final int i2 = (int) ((100 * j) / length);
                                if (this.f11911d != null) {
                                    this.f11910c.post(new Runnable() { // from class: xti
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.f99250a.lambda$extract$5(i2);
                                        }
                                    });
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("extract: finish ");
                            sb2.append(file.getAbsolutePath());
                            bufferedOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else if (!file.exists() && !file.mkdirs()) {
                        Log.e(f11907g, "extract: 无法创建目录: " + file.getAbsolutePath());
                        if (this.f11911d != null) {
                            this.f11910c.post(new Runnable() { // from class: vti
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f92261a.lambda$extract$3();
                                }
                            });
                        }
                        throw new IOException("无法创建目录: " + file.getAbsolutePath());
                    }
                    zipInputStream.closeEntry();
                }
                zipInputStream.close();
                if (this.f11911d != null) {
                    this.f11910c.post(new Runnable() { // from class: yti
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f102975a.lambda$extract$6();
                        }
                    });
                }
                this.f11912e = false;
            } catch (Throwable th3) {
                try {
                    zipInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            this.f11912e = false;
            throw th5;
        }
    }

    public boolean isExtracting() {
        return this.f11912e;
    }

    public void setListener(InterfaceC1614a interfaceC1614a) {
        this.f11911d = interfaceC1614a;
    }

    public void unzip() {
        ZipFile zipFile;
        Enumeration<ZipArchiveEntry> entries;
        if (!this.f11909b.exists()) {
            this.f11909b.mkdirs();
        }
        File file = this.f11908a;
        if (file == null || !file.exists()) {
            Log.e(f11907g, "unzip: zipFile is null or not exist");
            return;
        }
        try {
            zipFile = new ZipFile(this.f11908a);
            try {
                entries = zipFile.getEntries();
            } finally {
            }
        } catch (Exception e) {
            Log.e(f11907g, "unzip: " + e.toString());
            return;
        }
        while (entries.hasMoreElements()) {
            ZipArchiveEntry zipArchiveEntryNextElement = entries.nextElement();
            File file2 = new File(this.f11909b, zipArchiveEntryNextElement.getName());
            if (!zipArchiveEntryNextElement.isDirectory()) {
                File parentFile = file2.getParentFile();
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    Log.e(f11907g, "extract: 无法创建父目录: " + parentFile.getAbsolutePath());
                    if (this.f11911d != null) {
                        this.f11910c.post(new Runnable() { // from class: rti
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f79566a.lambda$unzip$8();
                            }
                        });
                    }
                    throw new IOException("无法创建父目录: " + parentFile.getAbsolutePath());
                }
                InputStream inputStream = zipFile.getInputStream(zipArchiveEntryNextElement);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                IOUtils.copy(inputStream, fileOutputStream);
                inputStream.close();
                fileOutputStream.close();
                Log.e(f11907g, "unzip: " + e.toString());
                return;
            }
            if (!file2.exists()) {
                file2.mkdirs();
            }
        }
        zipFile.close();
    }
}
