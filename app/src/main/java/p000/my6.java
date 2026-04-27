package p000;

import android.content.Context;
import android.media.AudioManager;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class my6 {

    /* JADX INFO: renamed from: a */
    public static int f62782a;

    public static void CloseHardWareAccelerate(View view) {
        view.setLayerType(1, null);
    }

    public static boolean Lock(Context context, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        try {
            xi9.m25209d("start request music_stream focus");
            ((AudioManager) context.getSystemService("audio")).requestAudioFocus(onAudioFocusChangeListener, 3, 2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean UnLock(Context context, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        try {
            xi9.m25209d("start abandon audio focus");
            ((AudioManager) context.getSystemService("audio")).abandonAudioFocus(onAudioFocusChangeListener);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void avoidSystemError(int i) {
        xi9.m25209d("avoidSystemError");
        f62782a = i;
    }
}
