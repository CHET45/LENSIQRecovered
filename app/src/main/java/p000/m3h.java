package p000;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class m3h {

    /* JADX INFO: renamed from: a */
    public static Toast f59839a;

    /* JADX INFO: renamed from: b */
    public static WeakReference<Context> f59840b;

    public static void init(Context applicationContext) {
        f59840b = new WeakReference<>(applicationContext);
    }

    @igg({"ShowToast"})
    public static void showToast(String msg, int duration) {
        WeakReference<Context> weakReference = f59840b;
        if (weakReference == null) {
            throw new RuntimeException("u have not init toast utils");
        }
        if (weakReference.get() == null || TextUtils.isEmpty(msg) || duration < 0) {
            return;
        }
        Toast toast = f59839a;
        if (toast == null) {
            f59839a = Toast.makeText(f59840b.get(), msg, duration);
        } else {
            toast.setText(msg);
            f59839a.setDuration(duration);
        }
        f59839a.show();
    }

    public static void showToastLong(String msg) {
        showToast(msg, 1);
    }

    public static void showToastShort(String info) {
        showToast(info, 0);
    }

    @igg({"ShowToast"})
    public static void showToastTop(String msg, int duration) {
        WeakReference<Context> weakReference = f59840b;
        if (weakReference == null) {
            throw new RuntimeException("u have not init toast utils");
        }
        if (weakReference.get() == null || TextUtils.isEmpty(msg) || duration < 0) {
            return;
        }
        Toast toast = f59839a;
        if (toast == null) {
            f59839a = Toast.makeText(f59840b.get(), msg, duration);
        } else {
            toast.setText(msg);
            f59839a.setDuration(duration);
        }
        f59839a.show();
    }

    public static void showToastLong(int msg) {
        WeakReference<Context> weakReference = f59840b;
        if (weakReference == null) {
            throw new RuntimeException("u have not init toast utils");
        }
        if (weakReference.get() != null) {
            showToastLong(f59840b.get().getResources().getString(msg));
        }
    }

    public static void showToastShort(Context context, @g8g int info) {
        WeakReference<Context> weakReference = f59840b;
        if (weakReference == null) {
            throw new RuntimeException("u have not init toast utils");
        }
        if (weakReference.get() != null) {
            showToastShort(context.getResources().getString(info));
        }
    }
}
