package p000;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class k3h {

    /* JADX INFO: renamed from: a */
    public static Toast f52535a;

    /* JADX INFO: renamed from: b */
    public static WeakReference<Context> f52536b;

    public static void init(Context context) {
        f52536b = new WeakReference<>(context);
    }

    @igg({"ShowToast"})
    public static void showToast(String str, int i) {
        WeakReference<Context> weakReference = f52536b;
        if (weakReference == null) {
            throw new RuntimeException("u have not init toast utils");
        }
        if (weakReference.get() == null || TextUtils.isEmpty(str) || i < 0) {
            return;
        }
        Toast toast = f52535a;
        if (toast == null) {
            f52535a = Toast.makeText(f52536b.get(), str, i);
        } else {
            toast.setText(str);
            f52535a.setDuration(i);
        }
        f52535a.show();
    }

    public static void showToastLong(String str) {
        showToast(str, 1);
    }

    public static void showToastShort(String str) {
        showToast(str, 0);
    }

    @igg({"ShowToast"})
    public static void showToastTop(String str, int i) {
        WeakReference<Context> weakReference = f52536b;
        if (weakReference == null) {
            throw new RuntimeException("u have not init toast utils");
        }
        if (weakReference.get() == null || TextUtils.isEmpty(str) || i < 0) {
            return;
        }
        Toast toast = f52535a;
        if (toast == null) {
            f52535a = Toast.makeText(f52536b.get(), str, i);
        } else {
            toast.setText(str);
            f52535a.setDuration(i);
        }
        f52535a.show();
    }

    public static void showToastLong(int i) {
        WeakReference<Context> weakReference = f52536b;
        if (weakReference == null) {
            throw new RuntimeException("u have not init toast utils");
        }
        if (weakReference.get() != null) {
            showToastLong(f52536b.get().getResources().getString(i));
        }
    }

    public static void showToastShort(Context context, @g8g int i) {
        WeakReference<Context> weakReference = f52536b;
        if (weakReference == null) {
            throw new RuntimeException("u have not init toast utils");
        }
        if (weakReference.get() != null) {
            showToastShort(context.getResources().getString(i));
        }
    }
}
