package p000;

import com.permissionx.guolindev.dialog.RationaleDialogFragment;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ci5 {

    /* JADX INFO: renamed from: a */
    public znc f16609a;

    /* JADX INFO: renamed from: b */
    public ut1 f16610b;

    public ci5(znc zncVar, ut1 ut1Var) {
        this.f16609a = zncVar;
        this.f16610b = ut1Var;
    }

    public void showRequestReasonDialog(List<String> list, String str, String str2, String str3) {
        this.f16609a.showHandlePermissionDialog(this.f16610b, true, list, str, str2, str3);
    }

    public void showRequestReasonDialog(List<String> list, String str, String str2) {
        showRequestReasonDialog(list, str, str2, null);
    }

    public void showRequestReasonDialog(@efb qpd qpdVar) {
        this.f16609a.showHandlePermissionDialog(this.f16610b, true, qpdVar);
    }

    public void showRequestReasonDialog(@efb RationaleDialogFragment rationaleDialogFragment) {
        this.f16609a.showHandlePermissionDialog(this.f16610b, true, rationaleDialogFragment);
    }
}
