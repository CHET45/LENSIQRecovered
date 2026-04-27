package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C1453l;

/* JADX INFO: loaded from: classes3.dex */
public class d67 {
    private d67() {
    }

    @hib
    /* JADX INFO: renamed from: a */
    public static b67 m8935a(@efb View view, @efb ViewGroup viewGroup, @hib Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? c67.m3823a(view, viewGroup, matrix) : C1453l.m2413a(view, viewGroup, matrix);
    }

    /* JADX INFO: renamed from: b */
    public static void m8936b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            c67.m3824b(view);
        } else {
            C1453l.m2417e(view);
        }
    }
}
