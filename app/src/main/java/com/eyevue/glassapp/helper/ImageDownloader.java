package com.eyevue.glassapp.helper;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public class ImageDownloader {
    private static volatile ImageDownloader instance;
    private final OkHttpClient baseClient;
    private final Handler mainHandler;

    public interface ImageCallback {
        void onError(Exception e);

        void onSuccess(String filePath);
    }

    private ImageDownloader(Context context) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.baseClient = builder.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit).build();
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    public static ImageDownloader getInstance(Context context) {
        if (instance == null) {
            synchronized (ImageDownloader.class) {
                try {
                    if (instance == null) {
                        instance = new ImageDownloader(context);
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResponse(Response response, String savePath, ImageCallback callback) {
        try {
            ResponseBody responseBodyBody = response.body();
            try {
                if (responseBodyBody != null) {
                    writeToFile(responseBodyBody.bytes(), savePath, callback);
                    responseBodyBody.close();
                } else {
                    notifyError(callback, new IOException("Response body is null"));
                    if (responseBodyBody != null) {
                        responseBodyBody.close();
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            notifyError(callback, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$writeToFile$0(String str, byte[] bArr, ImageCallback imageCallback) {
        File file = new File(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                notifySuccess(imageCallback, str);
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            if (file.exists()) {
                file.delete();
            }
            notifyError(imageCallback, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyError(final ImageCallback callback, final Exception e) {
        if (callback != null) {
            this.mainHandler.post(new Runnable() { // from class: et7
                @Override // java.lang.Runnable
                public final void run() {
                    callback.onError(e);
                }
            });
        }
    }

    private void notifySuccess(ImageCallback callback, String filePath) {
        if (callback != null) {
            callback.onSuccess(filePath);
        }
    }

    private void writeToFile(final byte[] bytes, final String savePath, final ImageCallback callback) {
        this.mainHandler.post(new Runnable() { // from class: ft7
            @Override // java.lang.Runnable
            public final void run() {
                this.f37669a.lambda$writeToFile$0(savePath, bytes, callback);
            }
        });
    }

    public void downloadImage(String url, final String savePath, final ImageCallback callback) {
        OkHttpClient.Builder builderNewBuilder = this.baseClient.newBuilder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builderNewBuilder.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build().newCall(new Request.Builder().url(url).header("Accept-Encoding", "identity").header("Connection", "close").build()).enqueue(new Callback() { // from class: com.eyevue.glassapp.helper.ImageDownloader.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                ImageDownloader.this.notifyError(callback, e);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                ImageDownloader.this.handleResponse(response, savePath, callback);
            }
        });
    }
}
