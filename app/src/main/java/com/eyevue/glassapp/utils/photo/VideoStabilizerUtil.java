package com.eyevue.glassapp.utils.photo;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.InterfaceC1154n;
import cn.watchfun.videostabilizer.WQVideoStabilizer;
import com.eyevue.glassapp.utils.photo.VideoStabilizerUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import p000.bth;
import p000.df4;
import p000.e0g;
import p000.fg1;
import p000.g55;
import p000.g59;
import p000.gib;
import p000.h59;
import p000.jj8;
import p000.jt3;
import p000.jvd;
import p000.md8;
import p000.mu5;
import p000.qy6;
import p000.yfb;
import p000.yn8;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 0)
public final class VideoStabilizerUtil implements InterfaceC1154n {
    public static final int CODE_FAILED = -1;
    public static final int CODE_SUCCESS = 0;

    @yfb
    private final WeakReference<FragmentActivity> activityWeakRef;
    private boolean isDestroyed;

    @gib
    private jj8 mJob;

    @gib
    private WQVideoStabilizer videoStabilizer;

    @yfb
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(jt3 jt3Var) {
            this();
        }

        @yfb
        public final VideoStabilizerUtil init(@yfb FragmentActivity fragmentActivity) {
            md8.checkNotNullParameter(fragmentActivity, "activity");
            VideoStabilizerUtil videoStabilizerUtil = new VideoStabilizerUtil(fragmentActivity, null);
            fragmentActivity.getLifecycle().addObserver(videoStabilizerUtil);
            return videoStabilizerUtil;
        }

        private Companion() {
        }
    }

    @e0g(parameters = 1)
    public static final class VideoStabilizerProgress {
        public static final int $stable = 0;
        private final int currentFrame;

        @yfb
        private final String message;
        private final float progress;
        private final int stage;
        private final int totalFrame;

        public VideoStabilizerProgress(int i, int i2, int i3, float f, @yfb String str) {
            md8.checkNotNullParameter(str, g55.f38799h);
            this.stage = i;
            this.currentFrame = i2;
            this.totalFrame = i3;
            this.progress = f;
            this.message = str;
        }

        public static /* synthetic */ VideoStabilizerProgress copy$default(VideoStabilizerProgress videoStabilizerProgress, int i, int i2, int i3, float f, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = videoStabilizerProgress.stage;
            }
            if ((i4 & 2) != 0) {
                i2 = videoStabilizerProgress.currentFrame;
            }
            int i5 = i2;
            if ((i4 & 4) != 0) {
                i3 = videoStabilizerProgress.totalFrame;
            }
            int i6 = i3;
            if ((i4 & 8) != 0) {
                f = videoStabilizerProgress.progress;
            }
            float f2 = f;
            if ((i4 & 16) != 0) {
                str = videoStabilizerProgress.message;
            }
            return videoStabilizerProgress.copy(i, i5, i6, f2, str);
        }

        public final int component1() {
            return this.stage;
        }

        public final int component2() {
            return this.currentFrame;
        }

        public final int component3() {
            return this.totalFrame;
        }

        public final float component4() {
            return this.progress;
        }

        @yfb
        public final String component5() {
            return this.message;
        }

        @yfb
        public final VideoStabilizerProgress copy(int i, int i2, int i3, float f, @yfb String str) {
            md8.checkNotNullParameter(str, g55.f38799h);
            return new VideoStabilizerProgress(i, i2, i3, f, str);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoStabilizerProgress)) {
                return false;
            }
            VideoStabilizerProgress videoStabilizerProgress = (VideoStabilizerProgress) obj;
            return this.stage == videoStabilizerProgress.stage && this.currentFrame == videoStabilizerProgress.currentFrame && this.totalFrame == videoStabilizerProgress.totalFrame && Float.compare(this.progress, videoStabilizerProgress.progress) == 0 && md8.areEqual(this.message, videoStabilizerProgress.message);
        }

        public final int getCurrentFrame() {
            return this.currentFrame;
        }

        @yfb
        public final String getMessage() {
            return this.message;
        }

        public final float getProgress() {
            return this.progress;
        }

        public final int getStage() {
            return this.stage;
        }

        public final int getTotalFrame() {
            return this.totalFrame;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.stage) * 31) + Integer.hashCode(this.currentFrame)) * 31) + Integer.hashCode(this.totalFrame)) * 31) + Float.hashCode(this.progress)) * 31) + this.message.hashCode();
        }

        @yfb
        public String toString() {
            return "VideoStabilizerProgress(stage=" + this.stage + ", currentFrame=" + this.currentFrame + ", totalFrame=" + this.totalFrame + ", progress=" + this.progress + ", message=" + this.message + ')';
        }
    }

    public /* synthetic */ VideoStabilizerUtil(FragmentActivity fragmentActivity, jt3 jt3Var) {
        this(fragmentActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyVideoStabilizer$lambda$1$lambda$0(qy6 qy6Var, int i, int i2, int i3, float f, String str) {
        md8.checkNotNull(str);
        qy6Var.invoke(new VideoStabilizerProgress(i, i2, i3, f, str));
    }

    private final FragmentActivity getMActivity() {
        if (isActive()) {
            return this.activityWeakRef.get();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yn8
    public final void applyVideoStabilizer(@yfb File file, @yfb final qy6<? super VideoStabilizerProgress, bth> qy6Var, @yfb qy6<? super VideoStabilizerResult, bth> qy6Var2) {
        String absolutePath;
        md8.checkNotNullParameter(file, "originVideoFile");
        md8.checkNotNullParameter(qy6Var, "progressCallBack");
        md8.checkNotNullParameter(qy6Var2, "stabilizerResult");
        jvd.C8121h c8121h = new jvd.C8121h();
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null) {
            File file2 = (File) c8121h.f52110a;
            if (file2 != null) {
                file2.delete();
            }
            qy6Var2.invoke(new VideoStabilizerResult(-1, "The activity has been destroyed.", null, null, 0L, 28, null));
            return;
        }
        File file3 = new File(mActivity.getFilesDir(), "media/" + mu5.getNameWithoutExtension(file) + "_filter." + mu5.getExtension(file));
        try {
            if (this.videoStabilizer == null) {
                this.videoStabilizer = new WQVideoStabilizer(mActivity);
            }
            WQVideoStabilizer wQVideoStabilizer = this.videoStabilizer;
            if (wQVideoStabilizer != null) {
                wQVideoStabilizer.setProgressCallback(new WQVideoStabilizer.ProgressCallback() { // from class: b8i
                    @Override // cn.watchfun.videostabilizer.WQVideoStabilizer.ProgressCallback
                    public final void onProgress(int i, int i2, int i3, float f, String str) {
                        VideoStabilizerUtil.applyVideoStabilizer$lambda$1$lambda$0(qy6Var, i, i2, i3, f, str);
                    }
                });
            }
            this.mJob = fg1.launch$default(h59.getLifecycleScope(mActivity), df4.getIO(), null, new VideoStabilizerUtil$applyVideoStabilizer$1$2(mActivity, c8121h, file, this, qy6Var2, file3, null), 2, null);
        } catch (Exception e) {
            e.printStackTrace();
            File file4 = (File) c8121h.f52110a;
            if (file4 != null) {
                file4.delete();
            }
            File file5 = (File) c8121h.f52110a;
            String str = (file5 == null || (absolutePath = file5.getAbsolutePath()) == null) ? "" : absolutePath;
            String message = e.getMessage();
            qy6Var2.invoke(new VideoStabilizerResult(-1, message == null ? "" : message, str, null, 0L, 24, null));
        }
    }

    public final void cancelRun() {
        WQVideoStabilizer wQVideoStabilizer = this.videoStabilizer;
        if (wQVideoStabilizer != null) {
            wQVideoStabilizer.destroy();
        }
    }

    public final boolean isActive() {
        FragmentActivity fragmentActivity;
        return !this.isDestroyed && ((fragmentActivity = this.activityWeakRef.get()) == null || !fragmentActivity.isFinishing());
    }

    @Override // androidx.lifecycle.InterfaceC1154n
    public void onStateChanged(@yfb g59 g59Var, @yfb AbstractC1143j.a aVar) {
        md8.checkNotNullParameter(g59Var, "source");
        md8.checkNotNullParameter(aVar, "event");
        if (aVar == AbstractC1143j.a.ON_DESTROY) {
            release();
            g59Var.getLifecycle().removeObserver(this);
        }
    }

    public final void release() {
        this.isDestroyed = true;
        WQVideoStabilizer wQVideoStabilizer = this.videoStabilizer;
        if (wQVideoStabilizer != null) {
            wQVideoStabilizer.destroy();
        }
        jj8 jj8Var = this.mJob;
        if (jj8Var != null) {
            jj8.C7916a.cancel$default(jj8Var, (CancellationException) null, 1, (Object) null);
        }
        this.activityWeakRef.clear();
    }

    private VideoStabilizerUtil(FragmentActivity fragmentActivity) {
        this.activityWeakRef = new WeakReference<>(fragmentActivity);
    }

    @e0g(parameters = 1)
    public static final class VideoStabilizerResult {
        public static final int $stable = 0;

        @yfb
        private final String comparisonFilePath;
        private final long duration;
        private final int errorCode;

        @yfb
        private final String errorMsg;

        @yfb
        private final String stabilizerVideoPath;

        public VideoStabilizerResult(int i, @yfb String str, @yfb String str2, @yfb String str3, long j) {
            md8.checkNotNullParameter(str, "errorMsg");
            md8.checkNotNullParameter(str2, "stabilizerVideoPath");
            md8.checkNotNullParameter(str3, "comparisonFilePath");
            this.errorCode = i;
            this.errorMsg = str;
            this.stabilizerVideoPath = str2;
            this.comparisonFilePath = str3;
            this.duration = j;
        }

        public static /* synthetic */ VideoStabilizerResult copy$default(VideoStabilizerResult videoStabilizerResult, int i, String str, String str2, String str3, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = videoStabilizerResult.errorCode;
            }
            if ((i2 & 2) != 0) {
                str = videoStabilizerResult.errorMsg;
            }
            String str4 = str;
            if ((i2 & 4) != 0) {
                str2 = videoStabilizerResult.stabilizerVideoPath;
            }
            String str5 = str2;
            if ((i2 & 8) != 0) {
                str3 = videoStabilizerResult.comparisonFilePath;
            }
            String str6 = str3;
            if ((i2 & 16) != 0) {
                j = videoStabilizerResult.duration;
            }
            return videoStabilizerResult.copy(i, str4, str5, str6, j);
        }

        public final int component1() {
            return this.errorCode;
        }

        @yfb
        public final String component2() {
            return this.errorMsg;
        }

        @yfb
        public final String component3() {
            return this.stabilizerVideoPath;
        }

        @yfb
        public final String component4() {
            return this.comparisonFilePath;
        }

        public final long component5() {
            return this.duration;
        }

        @yfb
        public final VideoStabilizerResult copy(int i, @yfb String str, @yfb String str2, @yfb String str3, long j) {
            md8.checkNotNullParameter(str, "errorMsg");
            md8.checkNotNullParameter(str2, "stabilizerVideoPath");
            md8.checkNotNullParameter(str3, "comparisonFilePath");
            return new VideoStabilizerResult(i, str, str2, str3, j);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoStabilizerResult)) {
                return false;
            }
            VideoStabilizerResult videoStabilizerResult = (VideoStabilizerResult) obj;
            return this.errorCode == videoStabilizerResult.errorCode && md8.areEqual(this.errorMsg, videoStabilizerResult.errorMsg) && md8.areEqual(this.stabilizerVideoPath, videoStabilizerResult.stabilizerVideoPath) && md8.areEqual(this.comparisonFilePath, videoStabilizerResult.comparisonFilePath) && this.duration == videoStabilizerResult.duration;
        }

        @yfb
        public final String getComparisonFilePath() {
            return this.comparisonFilePath;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        @yfb
        public final String getErrorMsg() {
            return this.errorMsg;
        }

        @yfb
        public final String getStabilizerVideoPath() {
            return this.stabilizerVideoPath;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.errorCode) * 31) + this.errorMsg.hashCode()) * 31) + this.stabilizerVideoPath.hashCode()) * 31) + this.comparisonFilePath.hashCode()) * 31) + Long.hashCode(this.duration);
        }

        @yfb
        public String toString() {
            return "VideoStabilizerResult(errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ", stabilizerVideoPath=" + this.stabilizerVideoPath + ", comparisonFilePath=" + this.comparisonFilePath + ", duration=" + this.duration + ')';
        }

        public /* synthetic */ VideoStabilizerResult(int i, String str, String str2, String str3, long j, int i2, jt3 jt3Var) {
            this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? 0L : j);
        }
    }
}
