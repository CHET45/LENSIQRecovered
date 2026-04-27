package p000;

import android.app.Application;
import android.media.projection.MediaProjection;
import android.os.Build;
import com.zlw.main.recorderlib.recorder.C4442a;
import com.zlw.main.recorderlib.recorder.C4443b;
import com.zlw.main.recorderlib.recorder.RecordService;

/* JADX INFO: loaded from: classes7.dex */
public class mtd {

    /* JADX INFO: renamed from: c */
    public static final String f62110c = "mtd";

    /* JADX INFO: renamed from: d */
    @igg({"StaticFieldLeak"})
    public static volatile mtd f62111d;

    /* JADX INFO: renamed from: a */
    public Application f62112a;

    /* JADX INFO: renamed from: b */
    public MediaProjection f62113b;

    private mtd() {
    }

    public static mtd getInstance() {
        if (f62111d == null) {
            synchronized (mtd.class) {
                try {
                    if (f62111d == null) {
                        f62111d = new mtd();
                    }
                } finally {
                }
            }
        }
        return f62111d;
    }

    public boolean changeFormat(C4442a.a aVar) {
        return RecordService.changeFormat(aVar);
    }

    public boolean changeRecordConfig(C4442a c4442a) {
        return RecordService.changeRecordConfig(c4442a);
    }

    public void changeRecordDir(String str) {
        RecordService.changeRecordDir(str);
    }

    public MediaProjection getMediaProjection() {
        return this.f62113b;
    }

    public C4442a getRecordConfig() {
        return RecordService.getRecordConfig();
    }

    public C4443b.h getState() {
        return RecordService.getState();
    }

    public void init(Application application, boolean z) {
        this.f62112a = application;
        ij9.f47186d = z;
    }

    public void pause() {
        Application application = this.f62112a;
        if (application == null) {
            return;
        }
        RecordService.pauseRecording(application);
    }

    public void resume() {
        Application application = this.f62112a;
        if (application == null) {
            return;
        }
        RecordService.resumeRecording(application);
    }

    public void setMediaProjection(MediaProjection mediaProjection) {
        this.f62113b = mediaProjection;
    }

    public void setRecordDataListener(jtd jtdVar) {
        RecordService.setRecordDataListener(jtdVar);
    }

    public void setRecordFftDataListener(ktd ktdVar) {
        RecordService.setRecordFftDataListener(ktdVar);
    }

    public void setRecordResultListener(std stdVar) {
        RecordService.setRecordResultListener(stdVar);
    }

    public void setRecordSoundSizeListener(aud audVar) {
        RecordService.setRecordSoundSizeListener(audVar);
    }

    public void setRecordStateListener(bud budVar) {
        RecordService.setRecordStateListener(budVar);
    }

    public boolean setSource(int i) {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        RecordService.getRecordConfig().setSource(i);
        return true;
    }

    public void start() {
        if (this.f62112a == null) {
            ij9.m13137e(f62110c, "未进行初始化", new Object[0]);
        } else {
            ij9.m13139i(f62110c, "start...", new Object[0]);
            RecordService.startRecording(this.f62112a);
        }
    }

    public void stop() {
        Application application = this.f62112a;
        if (application == null) {
            return;
        }
        RecordService.stopRecording(application);
    }
}
