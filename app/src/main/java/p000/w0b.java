package p000;

import android.media.MediaExtractor;
import com.zlw.main.recorderlib.recorder.C4442a;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class w0b {

    /* JADX INFO: renamed from: a */
    public static final String f93047a = "w0b";

    public static long getDuration(String str) throws Throwable {
        if (!yt5.isFileExists(str) || !str.endsWith(C4442a.a.MP3.getExtension())) {
            return 0L;
        }
        MediaExtractor mediaExtractor = null;
        try {
            try {
                MediaExtractor mediaExtractor2 = new MediaExtractor();
                try {
                    mediaExtractor2.setDataSource(str);
                    long j = mediaExtractor2.getTrackFormat(0).getLong("durationUs") / 1000;
                    mediaExtractor2.release();
                    return j;
                } catch (IOException e) {
                    e = e;
                    mediaExtractor = mediaExtractor2;
                    ij9.m13138e(e, f93047a, e.getMessage(), new Object[0]);
                    if (mediaExtractor != null) {
                        mediaExtractor.release();
                    }
                    return 0L;
                } catch (Throwable th) {
                    th = th;
                    mediaExtractor = mediaExtractor2;
                    if (mediaExtractor != null) {
                        mediaExtractor.release();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }
}
