package com.eyevue.glassapp.utils.photo;

import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public class VideoDurationLoader {
    private final ExecutorService executor = Executors.newFixedThreadPool(4);
    private final Map<String, Long> durationCache = new ConcurrentHashMap();
    private Handler handler = new Handler(Looper.getMainLooper());

    public interface DurationCallback {
        void onDurationLoaded(long duration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadDuration$0(String str, long j, DurationCallback durationCallback) {
        this.durationCache.put(str, Long.valueOf(j));
        durationCallback.onDurationLoaded(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadDuration$1(final String str, final DurationCallback durationCallback) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                j = strExtractMetadata != null ? Long.parseLong(strExtractMetadata) : 0L;
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException e3) {
                    throw new RuntimeException(e3);
                }
            }
            final long j = j;
            this.handler.post(new Runnable() { // from class: k6i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52693a.lambda$loadDuration$0(str, j, durationCallback);
                }
            });
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
                throw th;
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public void loadDuration(final String videoPath, final DurationCallback callback) {
        if (this.durationCache.containsKey(videoPath)) {
            callback.onDurationLoaded(this.durationCache.get(videoPath).longValue());
        } else {
            this.executor.submit(new Runnable() { // from class: l6i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f56351a.lambda$loadDuration$1(videoPath, callback);
                }
            });
        }
    }
}
