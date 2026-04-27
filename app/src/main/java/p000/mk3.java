package p000;

import android.os.Looper;
import android.widget.TextView;
import java.util.Locale;
import p000.lzc;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class mk3 {

    /* JADX INFO: renamed from: e */
    public static final int f61238e = 1000;

    /* JADX INFO: renamed from: a */
    public final ca5 f61239a;

    /* JADX INFO: renamed from: b */
    public final TextView f61240b;

    /* JADX INFO: renamed from: c */
    public final RunnableC9379b f61241c;

    /* JADX INFO: renamed from: d */
    public boolean f61242d;

    /* JADX INFO: renamed from: mk3$b */
    public final class RunnableC9379b implements lzc.InterfaceC9049g, Runnable {
        private RunnableC9379b() {
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPlayWhenReadyChanged(boolean z, int i) {
            mk3.this.m17351e();
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPlaybackStateChanged(int i) {
            mk3.this.m17351e();
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPositionDiscontinuity(lzc.C9053k c9053k, lzc.C9053k c9053k2, int i) {
            mk3.this.m17351e();
        }

        @Override // java.lang.Runnable
        public void run() {
            mk3.this.m17351e();
        }
    }

    public mk3(ca5 ca5Var, TextView textView) {
        u80.checkArgument(ca5Var.getApplicationLooper() == Looper.getMainLooper());
        this.f61239a = ca5Var;
        this.f61240b = textView;
        this.f61241c = new RunnableC9379b();
    }

    private static String getColorInfoString(@hib f92 f92Var) {
        if (f92Var == null || !f92Var.isValid()) {
            return "";
        }
        return " colr:" + f92Var.toLogString();
    }

    private static String getDecoderCountersBufferCountString(nl3 nl3Var) {
        if (nl3Var == null) {
            return "";
        }
        nl3Var.ensureUpdated();
        return " sib:" + nl3Var.f64831d + " sb:" + nl3Var.f64833f + " rb:" + nl3Var.f64832e + " db:" + nl3Var.f64834g + " mcdb:" + nl3Var.f64836i + " dk:" + nl3Var.f64837j;
    }

    private static String getPixelAspectRatioString(float f) {
        if (f == -1.0f || f == 1.0f) {
            return "";
        }
        return " par:" + String.format(Locale.US, "%.02f", Float.valueOf(f));
    }

    private static String getVideoFrameProcessingOffsetAverageString(long j, int i) {
        return i == 0 ? "N/A" : String.valueOf((long) (j / ((double) i)));
    }

    /* JADX INFO: renamed from: a */
    public String m17347a() {
        kq6 audioFormat = this.f61239a.getAudioFormat();
        nl3 audioDecoderCounters = this.f61239a.getAudioDecoderCounters();
        if (audioFormat == null || audioDecoderCounters == null) {
            return "";
        }
        return "\n" + audioFormat.f54989M + "(id:" + audioFormat.f54998a + " hz:" + audioFormat.f55009f2 + " ch:" + audioFormat.f55007e2 + getDecoderCountersBufferCountString(audioDecoderCounters) + c0b.f15434d;
    }

    /* JADX INFO: renamed from: b */
    public String m17348b() {
        return m17349c() + m17350d() + m17347a();
    }

    /* JADX INFO: renamed from: c */
    public String m17349c() {
        int playbackState = this.f61239a.getPlaybackState();
        return String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.f61239a.getPlayWhenReady()), playbackState != 1 ? playbackState != 2 ? playbackState != 3 ? playbackState != 4 ? "unknown" : "ended" : "ready" : "buffering" : "idle", Integer.valueOf(this.f61239a.getCurrentMediaItemIndex()));
    }

    /* JADX INFO: renamed from: d */
    public String m17350d() {
        kq6 videoFormat = this.f61239a.getVideoFormat();
        nl3 videoDecoderCounters = this.f61239a.getVideoDecoderCounters();
        if (videoFormat == null || videoDecoderCounters == null) {
            return "";
        }
        return "\n" + videoFormat.f54989M + "(id:" + videoFormat.f54998a + " r:" + videoFormat.f54996Z + "x" + videoFormat.f54990M1 + getColorInfoString(videoFormat.f55005d2) + getPixelAspectRatioString(videoFormat.f54999a2) + getDecoderCountersBufferCountString(videoDecoderCounters) + " vfpo: " + getVideoFrameProcessingOffsetAverageString(videoDecoderCounters.f64838k, videoDecoderCounters.f64839l) + c0b.f15434d;
    }

    @igg({"SetTextI18n"})
    /* JADX INFO: renamed from: e */
    public final void m17351e() {
        this.f61240b.setText(m17348b());
        this.f61240b.removeCallbacks(this.f61241c);
        this.f61240b.postDelayed(this.f61241c, 1000L);
    }

    public final void start() {
        if (this.f61242d) {
            return;
        }
        this.f61242d = true;
        this.f61239a.addListener(this.f61241c);
        m17351e();
    }

    public final void stop() {
        if (this.f61242d) {
            this.f61242d = false;
            this.f61239a.removeListener(this.f61241c);
            this.f61240b.removeCallbacks(this.f61241c);
        }
    }
}
