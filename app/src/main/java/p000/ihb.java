package p000;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public class ihb extends Fragment {

    /* JADX INFO: renamed from: a */
    public static c4c f47036a;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRequestPermissionsResult$0(boolean z) {
        c4c c4cVar = f47036a;
        if (c4cVar != null) {
            c4cVar.permissionResult(z);
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    private void requestNotificationsPermission() {
        requestPermissions(new String[]{xnc.f98618o}, 200);
    }

    public static void requestPermission(Activity activity, c4c result) {
        f47036a = result;
        activity.getFragmentManager().beginTransaction().add(new ihb(), activity.getLocalClassName()).commitAllowingStateLoss();
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 33) {
            requestNotificationsPermission();
        }
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @efb String[] permissions2, @efb int[] grantResults) {
        if (requestCode == 200) {
            final boolean z = false;
            if (grantResults.length > 0 && grantResults[0] == 0) {
                z = true;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: hhb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43644a.lambda$onRequestPermissionsResult$0(z);
                }
            }, 500L);
        }
    }
}
