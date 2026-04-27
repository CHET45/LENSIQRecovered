package p000;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class ly6 {

    /* JADX INFO: renamed from: a */
    public static int f59200a = 9;

    /* JADX INFO: renamed from: b */
    public static int f59201b = 14;

    public static void CloseHardWareAccelerate(View view) {
        if (Build.VERSION.SDK_INT >= f59201b) {
            my6.CloseHardWareAccelerate(view);
        }
    }

    public static boolean Lock(Context context, Boolean bool, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        if (!bool.booleanValue() || Build.VERSION.SDK_INT < f59200a) {
            return false;
        }
        my6.Lock(context, onAudioFocusChangeListener);
        return false;
    }

    public static boolean UnLock(Context context, Boolean bool, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        if (!bool.booleanValue() || Build.VERSION.SDK_INT < f59200a) {
            return false;
        }
        return my6.UnLock(context, onAudioFocusChangeListener);
    }
}
