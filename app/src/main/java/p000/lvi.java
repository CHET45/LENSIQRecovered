package p000;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class lvi {

    /* JADX INFO: renamed from: lvi$a */
    public class RunnableC8990a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f58933a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f58934b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f58935c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Context f58936d;

        public RunnableC8990a(String str, String str2, String str3, Context context) {
            this.f58933a = str;
            this.f58934b = str2;
            this.f58935c = str3;
            this.f58936d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String str = this.f58933a + pj4.f71071b + this.f58934b;
                String str2 = this.f58935c + pj4.f71071b + this.f58934b;
                if (this.f58936d.getAssets().list(str).length > 0) {
                    new File(str2).mkdirs();
                    lvi.this.m16412a(this.f58936d, str, str2);
                    return;
                }
                File file = new File(str2);
                if (file.exists()) {
                    return;
                }
                InputStream inputStreamOpen = this.f58936d.getAssets().open(str);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[1024000];
                while (true) {
                    int i = inputStreamOpen.read(bArr);
                    if (i == -1) {
                        inputStreamOpen.close();
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16412a(Context context, String str, String str2) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4);
        try {
            String[] list = context.getAssets().list(str);
            if (list != null) {
                for (String str3 : list) {
                    executorServiceNewFixedThreadPool.submit(new RunnableC8990a(str, str3, str2, context));
                }
            }
            executorServiceNewFixedThreadPool.shutdown();
            try {
                executorServiceNewFixedThreadPool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
