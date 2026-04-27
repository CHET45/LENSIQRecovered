package p000;

import android.os.Build;
import android.os.Environment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class f4e extends hu0 {

    /* JADX INFO: renamed from: e */
    public static final String f35329e = "android.permission.MANAGE_EXTERNAL_STORAGE";

    public f4e(znc zncVar) {
        super(zncVar);
    }

    @Override // p000.ut1
    public void request() {
        if (!this.f44873d.shouldRequestManageExternalStoragePermission() || Build.VERSION.SDK_INT < 30) {
            finish();
            return;
        }
        if (Environment.isExternalStorageManager()) {
            finish();
            return;
        }
        znc zncVar = this.f44873d;
        if (zncVar.f105537q == null && zncVar.f105538r == null) {
            finish();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
        znc zncVar2 = this.f44873d;
        bi5 bi5Var = zncVar2.f105538r;
        if (bi5Var != null) {
            bi5Var.onExplainReason(getExplainScope(), arrayList, true);
        } else {
            zncVar2.f105537q.onExplainReason(getExplainScope(), arrayList);
        }
    }

    @Override // p000.ut1
    public void requestAgain(List<String> list) {
        this.f44873d.requestManageExternalStoragePermissionNow(this);
    }
}
