package p000;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class t3e extends hu0 {

    /* JADX INFO: renamed from: e */
    public static final String f83634e = "android.permission.ACCESS_BACKGROUND_LOCATION";

    public t3e(znc zncVar) {
        super(zncVar);
    }

    @Override // p000.ut1
    public void request() {
        if (this.f44873d.shouldRequestBackgroundLocationPermission()) {
            if (Build.VERSION.SDK_INT < 29) {
                this.f44873d.f105527g.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                this.f44873d.f105530j.add("android.permission.ACCESS_BACKGROUND_LOCATION");
            }
            if (upc.isGranted(this.f44873d.f105521a, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                finish();
                return;
            }
            boolean zIsGranted = upc.isGranted(this.f44873d.f105521a, xnc.f98583H);
            boolean zIsGranted2 = upc.isGranted(this.f44873d.f105521a, xnc.f98584I);
            if (zIsGranted || zIsGranted2) {
                znc zncVar = this.f44873d;
                if (zncVar.f105537q == null && zncVar.f105538r == null) {
                    requestAgain(null);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                znc zncVar2 = this.f44873d;
                bi5 bi5Var = zncVar2.f105538r;
                if (bi5Var != null) {
                    bi5Var.onExplainReason(getExplainScope(), arrayList, true);
                    return;
                } else {
                    zncVar2.f105537q.onExplainReason(getExplainScope(), arrayList);
                    return;
                }
            }
        }
        finish();
    }

    @Override // p000.ut1
    public void requestAgain(List<String> list) {
        this.f44873d.requestAccessBackgroundLocationNow(this);
    }
}
