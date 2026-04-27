package p000;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class he0 {

    /* JADX INFO: renamed from: a */
    public static final String f43214a = "AudioManagerCompat";

    /* JADX INFO: renamed from: b */
    public static final int f43215b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f43216c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f43217d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f43218e = 3;

    /* JADX INFO: renamed from: f */
    public static final int f43219f = 4;

    /* JADX INFO: renamed from: g */
    @hib
    public static AudioManager f43220g;

    /* JADX INFO: renamed from: h */
    public static Context f43221h;

    /* JADX INFO: renamed from: he0$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6813a {
    }

    private he0() {
    }

    public static int abandonAudioFocusRequest(AudioManager audioManager, ce0 ce0Var) {
        return audioManager.abandonAudioFocusRequest(ce0Var.m3912a());
    }

    public static synchronized AudioManager getAudioManager(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (f43221h != applicationContext) {
                f43220g = null;
            }
            AudioManager audioManager = f43220g;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final yp2 yp2Var = new yp2();
                bo0.get().execute(new Runnable() { // from class: fe0
                    @Override // java.lang.Runnable
                    public final void run() {
                        he0.lambda$getAudioManager$0(applicationContext, yp2Var);
                    }
                });
                yp2Var.blockUninterruptible();
                return (AudioManager) v80.checkNotNull(f43220g);
            }
            AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService("audio");
            f43220g = audioManager2;
            return (AudioManager) v80.checkNotNull(audioManager2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @h78(from = 0)
    public static int getStreamMaxVolume(AudioManager audioManager, int i) {
        return audioManager.getStreamMaxVolume(i);
    }

    @h78(from = 0)
    public static int getStreamMinVolume(AudioManager audioManager, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return audioManager.getStreamMinVolume(i);
        }
        return 0;
    }

    public static int getStreamVolume(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            xh9.m25149w(f43214a, "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public static boolean isStreamMute(AudioManager audioManager, int i) {
        return audioManager.isStreamMute(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAudioManager$0(Context context, yp2 yp2Var) {
        f43220g = (AudioManager) context.getSystemService("audio");
        yp2Var.open();
    }

    public static int requestAudioFocus(AudioManager audioManager, ce0 ce0Var) {
        return audioManager.requestAudioFocus(ce0Var.m3912a());
    }
}
