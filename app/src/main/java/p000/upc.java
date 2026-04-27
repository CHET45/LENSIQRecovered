package p000;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes6.dex */
public class upc {
    public static epc init(FragmentActivity fragmentActivity) {
        return new epc(fragmentActivity);
    }

    public static boolean isGranted(Context context, String str) {
        return lx2.checkSelfPermission(context, str) == 0;
    }

    public static epc init(Fragment fragment) {
        return new epc(fragment);
    }
}
