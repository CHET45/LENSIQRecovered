package com.eyevue.glassapp.view.p008qr;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.core.app.ActivityCompat;
import com.eyevue.common.C2531R;
import com.journeyapps.barcodescanner.CaptureManager;
import com.watchfun.base.BaseActivity;
import p000.C13984vb;
import p000.c5e;
import p000.efb;
import p000.igg;
import p000.lp1;
import p000.lx2;
import p000.m3h;
import p000.xnc;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueQrCaptureActivity extends BaseActivity<C13984vb> {

    /* JADX INFO: renamed from: c */
    public static final int f19023c = 100;

    /* JADX INFO: renamed from: a */
    public CaptureManager f19024a;

    /* JADX INFO: renamed from: b */
    public Bundle f19025b;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.qr.EyevueQrCaptureActivity$a */
    public class ViewOnClickListenerC2871a implements View.OnClickListener {
        public ViewOnClickListenerC2871a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueQrCaptureActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.qr.EyevueQrCaptureActivity$b */
    public class C2872b implements lp1.InterfaceC8924a {
        public C2872b() {
        }

        @Override // p000.lp1.InterfaceC8924a
        public void onOk() {
            EyevueQrCaptureActivity.this.checkAndRequestCameraPermission();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAndRequestCameraPermission() {
        if (lx2.checkSelfPermission(this, xnc.f98581F) != 0) {
            ActivityCompat.requestPermissions(this, new String[]{xnc.f98581F}, 100);
        } else {
            initCamera();
        }
    }

    private void initCamera() {
        CaptureManager captureManager = new CaptureManager(this, ((C13984vb) this.binding).f90530b);
        this.f19024a = captureManager;
        captureManager.initializeFromIntent(getIntent(), this.f19025b);
        this.f19024a.decode();
    }

    @c5e(api = 23)
    public static void setStatusBarDark(Activity activity) {
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        window.getDecorView().setSystemUiVisibility(1296);
        window.setStatusBarColor(activity.getResources().getColor(C2531R.color.transparent, null));
        window.setNavigationBarColor(activity.getResources().getColor(C2531R.color.black, null));
        window.addFlags(Integer.MIN_VALUE);
    }

    private void showCameraPermissionDialog() {
        new lp1(this, new C2872b()).show();
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C13984vb getViewBinding() {
        return C13984vb.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        setStatusBarDark(this);
        this.f19025b = savedInstanceState;
        T t = this.binding;
        if (((C13984vb) t).f90530b != null) {
            ((C13984vb) t).f90530b.getStatusView().setVisibility(8);
        }
        if (lx2.checkSelfPermission(this, xnc.f98581F) == 0) {
            initCamera();
        } else {
            showCameraPermissionDialog();
        }
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CaptureManager captureManager = this.f19024a;
        if (captureManager != null) {
            captureManager.onDestroy();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return ((C13984vb) this.binding).f90530b.onKeyDown(keyCode, event) || super.onKeyDown(keyCode, event);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        CaptureManager captureManager = this.f19024a;
        if (captureManager != null) {
            captureManager.onPause();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @igg({"MissingSuperCall"})
    public void onRequestPermissionsResult(int requestCode, @efb String[] permissions2, @efb int[] grantResults) {
        if (requestCode == 100) {
            if (grantResults.length <= 0 || grantResults[0] != 0) {
                m3h.showToastShort(getString(C2531R.string.eyevue_permission_system_set));
            } else {
                initCamera();
            }
        }
        CaptureManager captureManager = this.f19024a;
        if (captureManager != null) {
            captureManager.onRequestPermissionsResult(requestCode, permissions2, grantResults);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        setStatusBarDark(this);
        CaptureManager captureManager = this.f19024a;
        if (captureManager != null) {
            captureManager.onResume();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        CaptureManager captureManager = this.f19024a;
        if (captureManager != null) {
            captureManager.onSaveInstanceState(outState);
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        setStatusBarDark(this);
        ((C13984vb) this.binding).f90531c.setOnClickListener(new ViewOnClickListenerC2871a());
    }
}
