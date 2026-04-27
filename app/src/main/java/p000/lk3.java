package p000;

import android.os.Looper;
import android.widget.TextView;
import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.Locale;
import p000.izc;

/* JADX INFO: loaded from: classes3.dex */
public class lk3 {

    /* JADX INFO: renamed from: e */
    public static final int f57972e = 1000;

    /* JADX INFO: renamed from: a */
    public final ExoPlayer f57973a;

    /* JADX INFO: renamed from: b */
    public final TextView f57974b;

    /* JADX INFO: renamed from: c */
    public final RunnableC8862b f57975c;

    /* JADX INFO: renamed from: d */
    public boolean f57976d;

    /* JADX INFO: renamed from: lk3$b */
    public final class RunnableC8862b implements izc.InterfaceC7680g, Runnable {
        private RunnableC8862b() {
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPlayWhenReadyChanged(boolean z, int i) {
            lk3.this.m16192e();
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPlaybackStateChanged(int i) {
            lk3.this.m16192e();
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPositionDiscontinuity(izc.C7684k c7684k, izc.C7684k c7684k2, int i) {
            lk3.this.m16192e();
        }

        @Override // java.lang.Runnable
        public void run() {
            lk3.this.m16192e();
        }
    }

    public lk3(ExoPlayer exoPlayer, TextView textView) {
        v80.checkArgument(exoPlayer.getApplicationLooper() == Looper.getMainLooper());
        this.f57973a = exoPlayer;
        this.f57974b = textView;
        this.f57975c = new RunnableC8862b();
    }

    private static String getColorInfoString(@hib e92 e92Var) {
        if (e92Var == null || !e92Var.isValid()) {
            return "";
        }
        return " colr:" + e92Var.toLogString();
    }

    private static String getDecoderCountersBufferCountString(ol3 ol3Var) {
        if (ol3Var == null) {
            return "";
        }
        ol3Var.ensureUpdated();
        return " sib:" + ol3Var.f68019d + " sb:" + ol3Var.f68021f + " rb:" + ol3Var.f68020e + " dib:" + ol3Var.f68023h + " db:" + ol3Var.f68022g + " mcdb:" + ol3Var.f68024i + " dk:" + ol3Var.f68025j;
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

    @ovh
    /* JADX INFO: renamed from: a */
    public String m16188a() {
        C1213a audioFormat = this.f57973a.getAudioFormat();
        ol3 audioDecoderCounters = this.f57973a.getAudioDecoderCounters();
        if (audioFormat == null || audioDecoderCounters == null) {
            return "";
        }
        return "\n" + audioFormat.f8291o + "(id:" + audioFormat.f8277a + " hz:" + audioFormat.f8267H + " ch:" + audioFormat.f8266G + getDecoderCountersBufferCountString(audioDecoderCounters) + c0b.f15434d;
    }

    @ovh
    /* JADX INFO: renamed from: b */
    public String m16189b() {
        return m16190c() + m16191d() + m16188a();
    }

    @ovh
    /* JADX INFO: renamed from: c */
    public String m16190c() {
        int playbackState = this.f57973a.getPlaybackState();
        return String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.f57973a.getPlayWhenReady()), playbackState != 1 ? playbackState != 2 ? playbackState != 3 ? playbackState != 4 ? "unknown" : "ended" : "ready" : "buffering" : "idle", Integer.valueOf(this.f57973a.getCurrentMediaItemIndex()));
    }

    @ovh
    /* JADX INFO: renamed from: d */
    public String m16191d() {
        C1213a videoFormat = this.f57973a.getVideoFormat();
        a8i videoSize = this.f57973a.getVideoSize();
        ol3 videoDecoderCounters = this.f57973a.getVideoDecoderCounters();
        if (videoFormat == null || videoDecoderCounters == null) {
            return "";
        }
        return "\n" + videoFormat.f8291o + "(id:" + videoFormat.f8277a + " r:" + videoSize.f647a + "x" + videoSize.f648b + getColorInfoString(videoFormat.f8264E) + getPixelAspectRatioString(videoSize.f650d) + getDecoderCountersBufferCountString(videoDecoderCounters) + " vfpo: " + getVideoFrameProcessingOffsetAverageString(videoDecoderCounters.f68026k, videoDecoderCounters.f68027l) + c0b.f15434d;
    }

    @ovh
    @igg({"SetTextI18n"})
    /* JADX INFO: renamed from: e */
    public final void m16192e() {
        this.f57974b.setText(m16189b());
        this.f57974b.removeCallbacks(this.f57975c);
        this.f57974b.postDelayed(this.f57975c, 1000L);
    }

    public final void start() {
        if (this.f57976d) {
            return;
        }
        this.f57976d = true;
        this.f57973a.addListener(this.f57975c);
        m16192e();
    }

    public final void stop() {
        if (this.f57976d) {
            this.f57976d = false;
            this.f57973a.removeListener(this.f57975c);
            this.f57974b.removeCallbacks(this.f57975c);
        }
    }
}
