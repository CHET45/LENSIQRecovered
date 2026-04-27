package p000;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 1)
@igg({"ValidFragment"})
public final class zoc extends Fragment {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C16202a f105615b = new C16202a(null);

    /* JADX INFO: renamed from: c */
    public static final int f105616c = 0;

    /* JADX INFO: renamed from: d */
    @gib
    public static c4c f105617d;

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f105618a = "PermissionFragment";

    /* JADX INFO: renamed from: zoc$a */
    public static final class C16202a {
        public /* synthetic */ C16202a(jt3 jt3Var) {
            this();
        }

        public final void requestPermission(@yfb Activity activity, @yfb c4c c4cVar) {
            md8.checkNotNullParameter(activity, "activity");
            md8.checkNotNullParameter(c4cVar, "onPermissionResult");
            C16202a c16202a = zoc.f105615b;
            zoc.f105617d = c4cVar;
            activity.getFragmentManager().beginTransaction().add(new zoc(), activity.getLocalClassName()).commitAllowingStateLoss();
        }

        private C16202a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityResult$lambda$0(zoc zocVar) {
        Activity activity = zocVar.getActivity();
        if (activity == null) {
            return;
        }
        boolean zCheckPermission = tpc.checkPermission(activity);
        Log.i(zocVar.f105618a, "PermissionFragment onActivityResult: " + zCheckPermission);
        c4c c4cVar = f105617d;
        if (c4cVar != null) {
            c4cVar.permissionResult(zCheckPermission);
        }
        f105617d = null;
        zocVar.getFragmentManager().beginTransaction().remove(zocVar).commitAllowingStateLoss();
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@gib Bundle bundle) {
        super.onActivityCreated(bundle);
        tpc.f85548a.requestPermission$app_gpRelease(this);
        Log.i(this.f105618a, "PermissionFragment：requestPermission");
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, @gib Intent intent) {
        if (i == 199) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: woc
                @Override // java.lang.Runnable
                public final void run() {
                    zoc.onActivityResult$lambda$0(this.f94969a);
                }
            }, 500L);
        }
    }
}
