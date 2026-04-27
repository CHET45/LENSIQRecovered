package p000;

import android.util.Log;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes6.dex */
public class pw3 implements hj9 {

    /* JADX INFO: renamed from: a */
    public static final String f72255a = "[LiveEventBus]";

    @Override // p000.hj9
    public void log(Level level, String str) {
        if (level == Level.SEVERE) {
            Log.e(f72255a, str);
            return;
        }
        if (level == Level.WARNING) {
            Log.w(f72255a, str);
        } else if (level == Level.INFO) {
            Log.i(f72255a, str);
        } else {
            if (level == Level.CONFIG) {
                return;
            }
            Level level2 = Level.OFF;
        }
    }

    @Override // p000.hj9
    public void log(Level level, String str, Throwable th) {
        if (level == Level.SEVERE) {
            Log.e(f72255a, str, th);
            return;
        }
        if (level == Level.WARNING) {
            Log.w(f72255a, str, th);
        } else if (level == Level.INFO) {
            Log.i(f72255a, str, th);
        } else {
            if (level == Level.CONFIG) {
                return;
            }
            Level level2 = Level.OFF;
        }
    }
}
