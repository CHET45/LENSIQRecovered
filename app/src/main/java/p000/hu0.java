package p000;

import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hu0 implements ut1 {

    /* JADX INFO: renamed from: a */
    @gib
    @un8
    public ut1 f44870a;

    /* JADX INFO: renamed from: b */
    public ci5 f44871b;

    /* JADX INFO: renamed from: c */
    public vq6 f44872c;

    /* JADX INFO: renamed from: d */
    @un8
    @yfb
    public znc f44873d;

    public hu0(@yfb znc zncVar) {
        md8.checkNotNullParameter(zncVar, "pb");
        this.f44873d = zncVar;
        this.f44871b = new ci5(zncVar, this);
        this.f44872c = new vq6(this.f44873d, this);
        this.f44871b = new ci5(this.f44873d, this);
        this.f44872c = new vq6(this.f44873d, this);
    }

    @Override // p000.ut1
    public void finish() {
        ut1 ut1Var = this.f44870a;
        if (ut1Var != null) {
            ut1Var.request();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f44873d.f105532l);
        arrayList.addAll(this.f44873d.f105533m);
        arrayList.addAll(this.f44873d.f105530j);
        if (this.f44873d.shouldRequestBackgroundLocationPermission()) {
            if (upc.isGranted(this.f44873d.getActivity(), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                this.f44873d.f105531k.add("android.permission.ACCESS_BACKGROUND_LOCATION");
            } else {
                arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
            }
        }
        if (this.f44873d.shouldRequestSystemAlertWindowPermission() && this.f44873d.getTargetSdkVersion() >= 23) {
            if (Settings.canDrawOverlays(this.f44873d.getActivity())) {
                this.f44873d.f105531k.add(xnc.f98609f);
            } else {
                arrayList.add(xnc.f98609f);
            }
        }
        if (this.f44873d.shouldRequestWriteSettingsPermission() && this.f44873d.getTargetSdkVersion() >= 23) {
            if (Settings.System.canWrite(this.f44873d.getActivity())) {
                this.f44873d.f105531k.add(xnc.f98610g);
            } else {
                arrayList.add(xnc.f98610g);
            }
        }
        if (this.f44873d.shouldRequestManageExternalStoragePermission()) {
            if (Build.VERSION.SDK_INT < 30 || !Environment.isExternalStorageManager()) {
                arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
            } else {
                this.f44873d.f105531k.add("android.permission.MANAGE_EXTERNAL_STORAGE");
            }
        }
        v3e v3eVar = this.f44873d.f105536p;
        if (v3eVar != null) {
            md8.checkNotNull(v3eVar);
            v3eVar.onResult(arrayList.isEmpty(), new ArrayList(this.f44873d.f105531k), arrayList);
        }
        this.f44873d.removeInvisibleFragment$permissionx_release();
    }

    @Override // p000.ut1
    @yfb
    public ci5 getExplainScope() {
        return this.f44871b;
    }

    @Override // p000.ut1
    @yfb
    public vq6 getForwardScope() {
        return this.f44872c;
    }
}
