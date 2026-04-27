package p000;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class l3h {

    /* JADX INFO: renamed from: a */
    public static Toast f56110a;

    /* JADX INFO: renamed from: b */
    public static WeakReference<Context> f56111b;

    public static void init(Context context) {
        f56111b = new WeakReference<>(context);
    }

    @igg({"ShowToast"})
    public static void showToast(String str, int i) {
        WeakReference<Context> weakReference = f56111b;
        if (weakReference == null) {
            throw new RuntimeException("u have not init toast utils");
        }
        if (weakReference.get() == null || TextUtils.isEmpty(str) || i < 0) {
            return;
        }
        Toast toast = f56110a;
        if (toast == null) {
            f56110a = Toast.makeText(f56111b.get(), str, i);
        } else {
            toast.setText(str);
            f56110a.setDuration(i);
        }
        f56110a.show();
    }

    public static void showToastLong(String str) {
        showToast(str, 1);
    }

    public static void showToastShort(String str) {
        showToast(str, 0);
    }

    @igg({"ShowToast"})
    public static void showToastTop(String str, int i) {
        WeakReference<Context> weakReference = f56111b;
        if (weakReference == null) {
            throw new RuntimeException("u have not init toast utils");
        }
        if (weakReference.get() == null || TextUtils.isEmpty(str) || i < 0) {
            return;
        }
        Toast toast = f56110a;
        if (toast == null) {
            f56110a = Toast.makeText(f56111b.get(), str, i);
        } else {
            toast.setText(str);
            f56110a.setDuration(i);
        }
        f56110a.show();
    }

    public static void showToastLong(int i) {
        WeakReference<Context> weakReference = f56111b;
        if (weakReference == null) {
            throw new RuntimeException("u have not init toast utils");
        }
        if (weakReference.get() != null) {
            showToastLong(f56111b.get().getResources().getString(i));
        }
    }

    public static void showToastShort(Context context, @g8g int i) {
        WeakReference<Context> weakReference = f56111b;
        if (weakReference == null) {
            throw new RuntimeException("u have not init toast utils");
        }
        if (weakReference.get() != null) {
            showToastShort(context.getResources().getString(i));
        }
    }
}
