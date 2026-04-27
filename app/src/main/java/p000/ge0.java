package p000;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import androidx.media.C1203a;

/* JADX INFO: loaded from: classes3.dex */
public final class ge0 {

    /* JADX INFO: renamed from: a */
    public static final String f39558a = "AudioManCompat";

    /* JADX INFO: renamed from: b */
    public static final int f39559b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f39560c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f39561d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f39562e = 4;

    /* JADX INFO: renamed from: ge0$a */
    @c5e(21)
    public static class C6264a {
        private C6264a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static boolean m11655a(AudioManager audioManager) {
            return audioManager.isVolumeFixed();
        }
    }

    /* JADX INFO: renamed from: ge0$b */
    @c5e(26)
    public static class C6265b {
        private C6265b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m11656a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static int m11657b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }

    /* JADX INFO: renamed from: ge0$c */
    @c5e(28)
    public static class C6266c {
        private C6266c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m11658a(AudioManager audioManager, int i) {
            return audioManager.getStreamMinVolume(i);
        }
    }

    private ge0() {
    }

    public static int abandonAudioFocusRequest(@efb AudioManager audioManager, @efb C1203a c1203a) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (c1203a != null) {
            return C6265b.m11656a(audioManager, c1203a.m1669b());
        }
        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }

    @h78(from = 0)
    public static int getStreamMaxVolume(@efb AudioManager audioManager, int i) {
        return audioManager.getStreamMaxVolume(i);
    }

    @h78(from = 0)
    public static int getStreamMinVolume(@efb AudioManager audioManager, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C6266c.m11658a(audioManager, i);
        }
        return 0;
    }

    public static boolean isVolumeFixed(@efb AudioManager audioManager) {
        return C6264a.m11655a(audioManager);
    }

    public static int requestAudioFocus(@efb AudioManager audioManager, @efb C1203a c1203a) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (c1203a != null) {
            return C6265b.m11657b(audioManager, c1203a.m1669b());
        }
        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }
}
