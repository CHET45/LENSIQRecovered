package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.permissionx.guolindev.dialog.RationaleDialogFragment;
import com.permissionx.guolindev.request.InvisibleFragment;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class znc {

    /* JADX INFO: renamed from: t */
    public static final String f105519t = "InvisibleFragment";

    /* JADX INFO: renamed from: u */
    @yfb
    public static final C16191a f105520u = new C16191a(null);

    /* JADX INFO: renamed from: a */
    public FragmentActivity f105521a;

    /* JADX INFO: renamed from: b */
    public Fragment f105522b;

    /* JADX INFO: renamed from: c */
    public int f105523c;

    /* JADX INFO: renamed from: d */
    public int f105524d;

    /* JADX INFO: renamed from: e */
    @gib
    @un8
    public Dialog f105525e;

    /* JADX INFO: renamed from: f */
    @un8
    @yfb
    public Set<String> f105526f;

    /* JADX INFO: renamed from: g */
    @un8
    @yfb
    public Set<String> f105527g;

    /* JADX INFO: renamed from: h */
    @un8
    public boolean f105528h;

    /* JADX INFO: renamed from: i */
    @un8
    public boolean f105529i;

    /* JADX INFO: renamed from: j */
    @un8
    @yfb
    public Set<String> f105530j;

    /* JADX INFO: renamed from: k */
    @un8
    @yfb
    public Set<String> f105531k;

    /* JADX INFO: renamed from: l */
    @un8
    @yfb
    public Set<String> f105532l;

    /* JADX INFO: renamed from: m */
    @un8
    @yfb
    public Set<String> f105533m;

    /* JADX INFO: renamed from: n */
    @un8
    @yfb
    public Set<String> f105534n;

    /* JADX INFO: renamed from: o */
    @un8
    @yfb
    public Set<String> f105535o;

    /* JADX INFO: renamed from: p */
    @gib
    @un8
    public v3e f105536p;

    /* JADX INFO: renamed from: q */
    @gib
    @un8
    public ai5 f105537q;

    /* JADX INFO: renamed from: r */
    @gib
    @un8
    public bi5 f105538r;

    /* JADX INFO: renamed from: s */
    @gib
    @un8
    public wq6 f105539s;

    /* JADX INFO: renamed from: znc$a */
    public static final class C16191a {
        private C16191a() {
        }

        public /* synthetic */ C16191a(jt3 jt3Var) {
            this();
        }
    }

    /* JADX INFO: renamed from: znc$b */
    public static final class ViewOnClickListenerC16192b implements View.OnClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qpd f105541b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f105542c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ut1 f105543d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ List f105544e;

        public ViewOnClickListenerC16192b(qpd qpdVar, boolean z, ut1 ut1Var, List list) {
            this.f105541b = qpdVar;
            this.f105542c = z;
            this.f105543d = ut1Var;
            this.f105544e = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f105541b.dismiss();
            if (this.f105542c) {
                this.f105543d.requestAgain(this.f105544e);
            } else {
                znc.this.forwardToSettings(this.f105544e);
            }
        }
    }

    /* JADX INFO: renamed from: znc$c */
    public static final class ViewOnClickListenerC16193c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qpd f105545a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ut1 f105546b;

        public ViewOnClickListenerC16193c(qpd qpdVar, ut1 ut1Var) {
            this.f105545a = qpdVar;
            this.f105546b = ut1Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f105545a.dismiss();
            this.f105546b.finish();
        }
    }

    /* JADX INFO: renamed from: znc$d */
    public static final class DialogInterfaceOnDismissListenerC16194d implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC16194d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            znc.this.f105525e = null;
        }
    }

    /* JADX INFO: renamed from: znc$e */
    public static final class ViewOnClickListenerC16195e implements View.OnClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RationaleDialogFragment f105549b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f105550c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ut1 f105551d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ List f105552e;

        public ViewOnClickListenerC16195e(RationaleDialogFragment rationaleDialogFragment, boolean z, ut1 ut1Var, List list) {
            this.f105549b = rationaleDialogFragment;
            this.f105550c = z;
            this.f105551d = ut1Var;
            this.f105552e = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f105549b.dismiss();
            if (this.f105550c) {
                this.f105551d.requestAgain(this.f105552e);
            } else {
                znc.this.forwardToSettings(this.f105552e);
            }
        }
    }

    /* JADX INFO: renamed from: znc$f */
    public static final class ViewOnClickListenerC16196f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RationaleDialogFragment f105553a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ut1 f105554b;

        public ViewOnClickListenerC16196f(RationaleDialogFragment rationaleDialogFragment, ut1 ut1Var) {
            this.f105553a = rationaleDialogFragment;
            this.f105554b = ut1Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f105553a.dismiss();
            this.f105554b.finish();
        }
    }

    public znc(@gib FragmentActivity fragmentActivity, @gib Fragment fragment, @yfb Set<String> set, @yfb Set<String> set2) {
        md8.checkNotNullParameter(set, "normalPermissions");
        md8.checkNotNullParameter(set2, "specialPermissions");
        this.f105523c = -1;
        this.f105524d = -1;
        this.f105530j = new LinkedHashSet();
        this.f105531k = new LinkedHashSet();
        this.f105532l = new LinkedHashSet();
        this.f105533m = new LinkedHashSet();
        this.f105534n = new LinkedHashSet();
        this.f105535o = new LinkedHashSet();
        if (fragmentActivity != null) {
            this.f105521a = fragmentActivity;
        }
        if (fragmentActivity == null && fragment != null) {
            FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
            md8.checkNotNullExpressionValue(fragmentActivityRequireActivity, "fragment.requireActivity()");
            this.f105521a = fragmentActivityRequireActivity;
        }
        this.f105522b = fragment;
        this.f105526f = set;
        this.f105527g = set2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forwardToSettings(List<String> list) {
        this.f105535o.clear();
        this.f105535o.addAll(list);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        FragmentActivity fragmentActivity = this.f105521a;
        if (fragmentActivity == null) {
            md8.throwUninitializedPropertyAccessException("activity");
        }
        intent.setData(Uri.fromParts(C12269rt.f79418l, fragmentActivity.getPackageName(), null));
        getInvisibleFragment().startActivityForResult(intent, 1);
    }

    private final FragmentManager getFragmentManager() {
        FragmentManager childFragmentManager;
        Fragment fragment = this.f105522b;
        if (fragment != null && (childFragmentManager = fragment.getChildFragmentManager()) != null) {
            return childFragmentManager;
        }
        FragmentActivity fragmentActivity = this.f105521a;
        if (fragmentActivity == null) {
            md8.throwUninitializedPropertyAccessException("activity");
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        md8.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        return supportFragmentManager;
    }

    private final InvisibleFragment getInvisibleFragment() {
        Fragment fragmentFindFragmentByTag = getFragmentManager().findFragmentByTag(f105519t);
        System.out.println((Object) ("existedFragment is " + fragmentFindFragmentByTag));
        if (fragmentFindFragmentByTag != null) {
            return (InvisibleFragment) fragmentFindFragmentByTag;
        }
        InvisibleFragment invisibleFragment = new InvisibleFragment();
        getFragmentManager().beginTransaction().add(invisibleFragment, f105519t).commitNowAllowingStateLoss();
        return invisibleFragment;
    }

    @yfb
    public final znc explainReasonBeforeRequest() {
        this.f105528h = true;
        return this;
    }

    @yfb
    public final FragmentActivity getActivity() {
        FragmentActivity fragmentActivity = this.f105521a;
        if (fragmentActivity == null) {
            md8.throwUninitializedPropertyAccessException("activity");
        }
        return fragmentActivity;
    }

    public final int getTargetSdkVersion() {
        FragmentActivity fragmentActivity = this.f105521a;
        if (fragmentActivity == null) {
            md8.throwUninitializedPropertyAccessException("activity");
        }
        return fragmentActivity.getApplicationInfo().targetSdkVersion;
    }

    @yfb
    public final znc onExplainRequestReason(@gib ai5 ai5Var) {
        this.f105537q = ai5Var;
        return this;
    }

    @yfb
    public final znc onForwardToSettings(@gib wq6 wq6Var) {
        this.f105539s = wq6Var;
        return this;
    }

    public final void removeInvisibleFragment$permissionx_release() {
        Fragment fragmentFindFragmentByTag = getFragmentManager().findFragmentByTag(f105519t);
        if (fragmentFindFragmentByTag != null) {
            getFragmentManager().beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
        }
    }

    public final void request(@gib v3e v3eVar) {
        this.f105536p = v3eVar;
        w3e w3eVar = new w3e();
        w3eVar.addTaskToChain(new m4e(this));
        w3eVar.addTaskToChain(new t3e(this));
        w3eVar.addTaskToChain(new n4e(this));
        w3eVar.addTaskToChain(new r4e(this));
        w3eVar.addTaskToChain(new f4e(this));
        w3eVar.runTask();
    }

    public final void requestAccessBackgroundLocationNow(@gib ut1 ut1Var) {
        getInvisibleFragment().m7268a(this, ut1Var);
    }

    public final void requestManageExternalStoragePermissionNow(@gib ut1 ut1Var) {
        getInvisibleFragment().m7269b(this, ut1Var);
    }

    public final void requestNow(@gib Set<String> set, @gib ut1 ut1Var) {
        getInvisibleFragment().m7270c(this, set, ut1Var);
    }

    public final void requestSystemAlertWindowPermissionNow(@gib ut1 ut1Var) {
        getInvisibleFragment().m7271d(this, ut1Var);
    }

    public final void requestWriteSettingsPermissionNow(@gib ut1 ut1Var) {
        getInvisibleFragment().m7272e(this, ut1Var);
    }

    public final void setActivity(@yfb FragmentActivity fragmentActivity) {
        md8.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.f105521a = fragmentActivity;
    }

    @yfb
    public final znc setDialogTintColor(int i, int i2) {
        this.f105523c = i;
        this.f105524d = i2;
        return this;
    }

    public final boolean shouldRequestBackgroundLocationPermission() {
        return this.f105527g.contains("android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    public final boolean shouldRequestManageExternalStoragePermission() {
        return this.f105527g.contains("android.permission.MANAGE_EXTERNAL_STORAGE");
    }

    public final boolean shouldRequestSystemAlertWindowPermission() {
        return this.f105527g.contains(xnc.f98609f);
    }

    public final boolean shouldRequestWriteSettingsPermission() {
        return this.f105527g.contains(xnc.f98610g);
    }

    public final void showHandlePermissionDialog(@yfb ut1 ut1Var, boolean z, @yfb List<String> list, @gib String str, @gib String str2, @gib String str3) {
        md8.checkNotNullParameter(ut1Var, "chainTask");
        md8.checkNotNullParameter(list, "permissions");
        FragmentActivity fragmentActivity = this.f105521a;
        if (fragmentActivity == null) {
            md8.throwUninitializedPropertyAccessException("activity");
        }
        md8.checkNotNull(str);
        md8.checkNotNull(str2);
        showHandlePermissionDialog(ut1Var, z, new ut3(fragmentActivity, list, str, str2, str3, this.f105523c, this.f105524d));
    }

    @yfb
    public final znc onExplainRequestReason(@gib bi5 bi5Var) {
        this.f105538r = bi5Var;
        return this;
    }

    public final void showHandlePermissionDialog(@yfb ut1 ut1Var, boolean z, @yfb qpd qpdVar) {
        md8.checkNotNullParameter(ut1Var, "chainTask");
        md8.checkNotNullParameter(qpdVar, "dialog");
        this.f105529i = true;
        List<String> permissionsToRequest = qpdVar.getPermissionsToRequest();
        md8.checkNotNullExpressionValue(permissionsToRequest, "dialog.permissionsToRequest");
        if (permissionsToRequest.isEmpty()) {
            ut1Var.finish();
            return;
        }
        this.f105525e = qpdVar;
        qpdVar.show();
        if ((qpdVar instanceof ut3) && ((ut3) qpdVar).isPermissionLayoutEmpty$permissionx_release()) {
            qpdVar.dismiss();
            ut1Var.finish();
        }
        View positiveButton = qpdVar.getPositiveButton();
        md8.checkNotNullExpressionValue(positiveButton, "dialog.positiveButton");
        View negativeButton = qpdVar.getNegativeButton();
        qpdVar.setCancelable(false);
        qpdVar.setCanceledOnTouchOutside(false);
        positiveButton.setClickable(true);
        positiveButton.setOnClickListener(new ViewOnClickListenerC16192b(qpdVar, z, ut1Var, permissionsToRequest));
        if (negativeButton != null) {
            negativeButton.setClickable(true);
            negativeButton.setOnClickListener(new ViewOnClickListenerC16193c(qpdVar, ut1Var));
        }
        Dialog dialog = this.f105525e;
        if (dialog != null) {
            dialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC16194d());
        }
    }

    public final void showHandlePermissionDialog(@yfb ut1 ut1Var, boolean z, @yfb RationaleDialogFragment rationaleDialogFragment) {
        md8.checkNotNullParameter(ut1Var, "chainTask");
        md8.checkNotNullParameter(rationaleDialogFragment, "dialogFragment");
        this.f105529i = true;
        List<String> permissionsToRequest = rationaleDialogFragment.getPermissionsToRequest();
        md8.checkNotNullExpressionValue(permissionsToRequest, "dialogFragment.permissionsToRequest");
        if (permissionsToRequest.isEmpty()) {
            ut1Var.finish();
            return;
        }
        rationaleDialogFragment.showNow(getFragmentManager(), "PermissionXRationaleDialogFragment");
        View positiveButton = rationaleDialogFragment.getPositiveButton();
        md8.checkNotNullExpressionValue(positiveButton, "dialogFragment.positiveButton");
        View negativeButton = rationaleDialogFragment.getNegativeButton();
        rationaleDialogFragment.setCancelable(false);
        positiveButton.setClickable(true);
        positiveButton.setOnClickListener(new ViewOnClickListenerC16195e(rationaleDialogFragment, z, ut1Var, permissionsToRequest));
        if (negativeButton != null) {
            negativeButton.setClickable(true);
            negativeButton.setOnClickListener(new ViewOnClickListenerC16196f(rationaleDialogFragment, ut1Var));
        }
    }
}
