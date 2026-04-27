package p000;

import android.os.AsyncTask;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class sd4 {

    /* JADX INFO: renamed from: e */
    public static final String f81304e = "DirectoryCopier";

    /* JADX INFO: renamed from: f */
    public static final int f81305f = 8192;

    /* JADX INFO: renamed from: a */
    public final File f81306a;

    /* JADX INFO: renamed from: b */
    public final File f81307b;

    /* JADX INFO: renamed from: c */
    public final WeakReference<InterfaceC12527b> f81308c;

    /* JADX INFO: renamed from: d */
    public AsyncTaskC12528c f81309d;

    /* JADX INFO: renamed from: sd4$b */
    public interface InterfaceC12527b {
        void onCopyComplete();

        void onCopyError(String str);

        void onCopyProgress(int i);

        void onCopyStart();
    }

    /* JADX INFO: renamed from: sd4$c */
    public class AsyncTaskC12528c extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public String f81310a;

        /* JADX INFO: renamed from: b */
        public int f81311b;

        /* JADX INFO: renamed from: c */
        public int f81312c;

        private AsyncTaskC12528c() {
        }

        private void copyFile(File file, File file2) throws IOException {
            FileOutputStream fileOutputStream;
            byte[] bArr;
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    bArr = new byte[8192];
                } finally {
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    fileOutputStream.close();
                    fileInputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
                fileInputStream.close();
                throw th;
            }
        }

        private int countFiles(File file) {
            File[] fileArrListFiles;
            if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
                return 0;
            }
            int iCountFiles = 0;
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    iCountFiles += countFiles(file2);
                }
                iCountFiles++;
            }
            return iCountFiles;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                copyDirectoryRecursive(sd4.this.f81306a, sd4.this.f81307b);
                return Boolean.TRUE;
            } catch (IOException e) {
                String str = "复制失败: " + e.getMessage();
                this.f81310a = str;
                Log.e(sd4.f81304e, str, e);
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            InterfaceC12527b interfaceC12527b = (InterfaceC12527b) sd4.this.f81308c.get();
            if (interfaceC12527b == null) {
                return;
            }
            if (bool.booleanValue()) {
                interfaceC12527b.onCopyComplete();
            } else {
                interfaceC12527b.onCopyError(this.f81310a);
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
            InterfaceC12527b interfaceC12527b = (InterfaceC12527b) sd4.this.f81308c.get();
            if (interfaceC12527b != null) {
                interfaceC12527b.onCopyProgress(numArr[0].intValue());
            }
        }

        public void copyDirectoryRecursive(File file, File file2) throws IOException {
            if (isCancelled()) {
                return;
            }
            if (!file2.exists() && !file2.mkdirs()) {
                throw new IOException("无法创建目录: " + file2.getAbsolutePath());
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file3 : fileArrListFiles) {
                    if (isCancelled()) {
                        return;
                    }
                    File file4 = new File(file2, file3.getName());
                    if (file3.isDirectory()) {
                        copyDirectoryRecursive(file3, file4);
                    } else {
                        copyFile(file3, file4);
                        int i = this.f81312c + 1;
                        this.f81312c = i;
                        publishProgress(Integer.valueOf((int) ((i * 100.0f) / this.f81311b)));
                    }
                }
            }
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            super.onCancelled();
            InterfaceC12527b interfaceC12527b = (InterfaceC12527b) sd4.this.f81308c.get();
            if (interfaceC12527b != null) {
                interfaceC12527b.onCopyError("复制已取消");
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f81311b = countFiles(sd4.this.f81306a);
            this.f81312c = 0;
            InterfaceC12527b interfaceC12527b = (InterfaceC12527b) sd4.this.f81308c.get();
            if (interfaceC12527b != null) {
                interfaceC12527b.onCopyStart();
            }
        }
    }

    public sd4(File file, File file2, InterfaceC12527b interfaceC12527b) {
        this.f81306a = file;
        this.f81307b = file2;
        this.f81308c = new WeakReference<>(interfaceC12527b);
    }

    public void cancelCopy() {
        AsyncTaskC12528c asyncTaskC12528c = this.f81309d;
        if (asyncTaskC12528c != null) {
            asyncTaskC12528c.cancel(true);
        }
    }

    public void startCopy() {
        AsyncTaskC12528c asyncTaskC12528c = this.f81309d;
        if (asyncTaskC12528c != null && asyncTaskC12528c.getStatus() != AsyncTask.Status.FINISHED) {
            Log.w(f81304e, "复制任务已在运行中");
            return;
        }
        AsyncTaskC12528c asyncTaskC12528c2 = new AsyncTaskC12528c();
        this.f81309d = asyncTaskC12528c2;
        try {
            asyncTaskC12528c2.copyDirectoryRecursive(this.f81306a, this.f81307b);
            if (this.f81308c.get() != null) {
                this.f81308c.get().onCopyComplete();
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (this.f81308c.get() != null) {
                this.f81308c.get().onCopyError(e.getMessage());
            }
        }
    }
}
