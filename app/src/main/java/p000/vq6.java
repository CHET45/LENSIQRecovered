package p000;

import com.permissionx.guolindev.dialog.RationaleDialogFragment;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class vq6 {

    /* JADX INFO: renamed from: a */
    public znc f91973a;

    /* JADX INFO: renamed from: b */
    public ut1 f91974b;

    public vq6(znc zncVar, ut1 ut1Var) {
        this.f91973a = zncVar;
        this.f91974b = ut1Var;
    }

    public void showForwardToSettingsDialog(List<String> list, String str, String str2, String str3) {
        this.f91973a.showHandlePermissionDialog(this.f91974b, false, list, str, str2, str3);
    }

    public void showForwardToSettingsDialog(List<String> list, String str, String str2) {
        showForwardToSettingsDialog(list, str, str2, null);
    }

    public void showForwardToSettingsDialog(@efb qpd qpdVar) {
        this.f91973a.showHandlePermissionDialog(this.f91974b, false, qpdVar);
    }

    public void showForwardToSettingsDialog(@efb RationaleDialogFragment rationaleDialogFragment) {
        this.f91973a.showHandlePermissionDialog(this.f91974b, false, rationaleDialogFragment);
    }
}
