package com.eyevue.glassapp.helper;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.eyevue.glassapp.helper.P2pWifiFileDownloader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.ConnectionPool;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import p000.pj4;

/* JADX INFO: loaded from: classes4.dex */
public class P2pWifiFileDownloader {
    private static final String TAG = "P2pWifiDownloader";
    private static volatile P2pWifiFileDownloader instance;
    private Call currentCall;
    private final AtomicBoolean isCanceled = new AtomicBoolean(false);
    private final Handler mainHandler;
    private final OkHttpClient okHttpClient;

    public interface DownloadCallback {
        void onError(Exception e);

        void onProgress(long current, long total);

        void onSuccess(String filePath);
    }

    private P2pWifiFileDownloader(Context context) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.okHttpClient = builder.connectTimeout(30L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).connectionPool(new ConnectionPool(2, 10L, timeUnit)).addInterceptor(new Interceptor() { // from class: dac
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return P2pWifiFileDownloader.lambda$new$0(chain);
            }
        }).build();
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    private long getDownloadedSize(File saveFile) {
        if (!saveFile.exists() || saveFile.isDirectory()) {
            return 0L;
        }
        return saveFile.length();
    }

    public static P2pWifiFileDownloader getInstance(Context context) {
        if (instance == null) {
            synchronized (P2pWifiFileDownloader.class) {
                try {
                    if (instance == null) {
                        instance = new P2pWifiFileDownloader(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getTotalSize(Response response, long downloadedSize) {
        long jContentLength = response.body().contentLength();
        String strHeader = response.header("Content-Range");
        return (strHeader == null || !strHeader.contains(pj4.f71071b)) ? downloadedSize + jContentLength : Long.parseLong(strHeader.split(pj4.f71071b)[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDownloadComplete(long currentDownloaded, long totalSize) {
        return currentDownloaded >= totalSize || totalSize <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Response lambda$new$0(Interceptor.Chain chain) throws IOException {
        return chain.proceed(chain.request().newBuilder().header("Accept-Encoding", "identity").header("Connection", "close").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyError(final DownloadCallback callback, final Exception e) {
        if (callback == null) {
            return;
        }
        this.mainHandler.post(new Runnable() { // from class: fac
            @Override // java.lang.Runnable
            public final void run() {
                callback.onError(e);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyProgress(final DownloadCallback callback, final long current, final long total) {
        if (callback == null || this.isCanceled.get()) {
            return;
        }
        this.mainHandler.post(new Runnable() { // from class: gac
            @Override // java.lang.Runnable
            public final void run() {
                callback.onProgress(current, total);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySuccess(final DownloadCallback callback, final String filePath) {
        if (callback == null) {
            return;
        }
        this.mainHandler.post(new Runnable() { // from class: eac
            @Override // java.lang.Runnable
            public final void run() {
                callback.onSuccess(filePath);
            }
        });
    }

    private void resetState() {
        this.isCanceled.set(false);
        this.currentCall = null;
    }

    public void cancelP2pDownload() {
        this.isCanceled.set(true);
        Call call = this.currentCall;
        if (call == null || call.isCanceled()) {
            return;
        }
        this.currentCall.cancel();
    }

    public void downloadP2pFile(String p2pFileUrl, final String saveFilePath, final DownloadCallback callback) {
        resetState();
        final File file = new File(saveFilePath);
        final long downloadedSize = getDownloadedSize(file);
        Call callNewCall = this.okHttpClient.newCall(new Request.Builder().url(p2pFileUrl).build());
        this.currentCall = callNewCall;
        callNewCall.enqueue(new Callback() { // from class: com.eyevue.glassapp.helper.P2pWifiFileDownloader.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                if (P2pWifiFileDownloader.this.isCanceled.get()) {
                    P2pWifiFileDownloader.this.notifyError(callback, new IOException("P2P下载已取消"));
                    return;
                }
                if (file.exists() && file.length() < 1024) {
                    file.delete();
                }
                P2pWifiFileDownloader.this.notifyError(callback, new IOException("P2P下载失败：" + e.getMessage()));
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful() || response.body() == null) {
                    P2pWifiFileDownloader.this.notifyError(callback, new IOException("P2P响应异常，码：" + response.code()));
                    return;
                }
                long totalSize = P2pWifiFileDownloader.this.getTotalSize(response, downloadedSize);
                if (totalSize <= 0) {
                    P2pWifiFileDownloader.this.notifyError(callback, new IOException("无法获取P2P文件大小"));
                    return;
                }
                try {
                    InputStream inputStreamByteStream = response.body().byteStream();
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
                        try {
                            randomAccessFile.seek(downloadedSize);
                            byte[] bArr = new byte[131072];
                            long j = downloadedSize;
                            while (true) {
                                int i = inputStreamByteStream.read(bArr);
                                if (i == -1 || P2pWifiFileDownloader.this.isCanceled.get()) {
                                    break;
                                }
                                randomAccessFile.write(bArr, 0, i);
                                long j2 = j + ((long) i);
                                P2pWifiFileDownloader.this.notifyProgress(callback, j2, totalSize);
                                j = j2;
                            }
                            if (P2pWifiFileDownloader.this.isCanceled.get()) {
                                P2pWifiFileDownloader.this.notifyError(callback, new IOException("P2P下载已取消"));
                            } else if (P2pWifiFileDownloader.this.isDownloadComplete(j, totalSize)) {
                                P2pWifiFileDownloader.this.notifySuccess(callback, saveFilePath);
                            } else {
                                P2pWifiFileDownloader.this.notifyError(callback, new IOException("P2P下载中断，文件未完整"));
                            }
                            randomAccessFile.close();
                            inputStreamByteStream.close();
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException e) {
                    if (file.exists()) {
                        file.delete();
                    }
                    P2pWifiFileDownloader.this.notifyError(callback, new IOException("P2P文件写入失败：" + e.getMessage()));
                }
            }
        });
    }
}
