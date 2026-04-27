package p000;

import android.media.AudioManager;
import android.os.Build;
import com.blankj.utilcode.util.C2479l;

/* JADX INFO: loaded from: classes3.dex */
public class hgi {
    public static int getMaxVolume(int i) {
        return ((AudioManager) C2479l.getApp().getSystemService("audio")).getStreamMaxVolume(i);
    }

    public static int getMinVolume(int i) {
        AudioManager audioManager = (AudioManager) C2479l.getApp().getSystemService("audio");
        if (Build.VERSION.SDK_INT >= 28) {
            return audioManager.getStreamMinVolume(i);
        }
        return 0;
    }

    public static int getVolume(int i) {
        return ((AudioManager) C2479l.getApp().getSystemService("audio")).getStreamVolume(i);
    }

    public static void setVolume(int i, int i2, int i3) {
        try {
            ((AudioManager) C2479l.getApp().getSystemService("audio")).setStreamVolume(i, i2, i3);
        } catch (SecurityException unused) {
        }
    }
}
