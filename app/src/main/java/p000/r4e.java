package p000;

import android.provider.Settings;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class r4e extends hu0 {
    public r4e(znc zncVar) {
        super(zncVar);
    }

    @Override // p000.ut1
    public void request() {
        if (!this.f44873d.shouldRequestWriteSettingsPermission()) {
            finish();
            return;
        }
        if (this.f44873d.getTargetSdkVersion() < 23) {
            this.f44873d.f105531k.add(xnc.f98610g);
            this.f44873d.f105527g.remove(xnc.f98610g);
            finish();
            return;
        }
        if (Settings.System.canWrite(this.f44873d.f105521a)) {
            finish();
            return;
        }
        znc zncVar = this.f44873d;
        if (zncVar.f105537q == null && zncVar.f105538r == null) {
            finish();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(xnc.f98610g);
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
        this.f44873d.requestWriteSettingsPermissionNow(this);
    }
}
