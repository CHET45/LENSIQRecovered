package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import com.blankj.utilcode.util.ToastUtils;
import com.watchfun.trans.C4035R;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.dialog.PermissionExplanationDialog;
import com.watchfun.transcommon.manager.trans.AudioPlayerManager;
import com.watchfun.transcommon.utils.AiLangUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.bzb;
import p000.rv4;

/* JADX INFO: loaded from: classes6.dex */
public class eyb {

    /* JADX INFO: renamed from: l */
    public static final String[] f34468l = {xnc.f98580E, xnc.f98579D};

    /* JADX INFO: renamed from: m */
    public static final String f34469m = "TRANS_OFFLINE_AUTH_SUCCESS";

    /* JADX INFO: renamed from: n */
    public static final String f34470n = "OfflineBaseInvoke";

    /* JADX INFO: renamed from: a */
    public boolean f34471a;

    /* JADX INFO: renamed from: b */
    public rv4 f34472b;

    /* JADX INFO: renamed from: c */
    public PermissionExplanationDialog f34473c;

    /* JADX INFO: renamed from: d */
    public rv4 f34474d;

    /* JADX INFO: renamed from: e */
    public boolean f34475e;

    /* JADX INFO: renamed from: f */
    public long f34476f;

    /* JADX INFO: renamed from: g */
    public StringBuilder f34477g = new StringBuilder();

    /* JADX INFO: renamed from: h */
    public StringBuilder f34478h = new StringBuilder();

    /* JADX INFO: renamed from: i */
    public List<bzb.InterfaceC2119h> f34479i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public boolean f34480j;

    /* JADX INFO: renamed from: k */
    public long f34481k;

    /* JADX INFO: renamed from: eyb$a */
    public class C5519a implements bzb.InterfaceC2119h {
        public C5519a() {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void offlineResourceMissing() {
            for (bzb.InterfaceC2119h interfaceC2119h : eyb.this.f34479i) {
                if (interfaceC2119h != null) {
                    interfaceC2119h.offlineResourceMissing();
                }
            }
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onAuthResult(int code) {
            vfe.getInstance().putBoolean("TRANS_OFFLINE_AUTH_SUCCESS", true);
            StringBuilder sb = new StringBuilder();
            sb.append("onAuthResult: code ");
            sb.append(code);
            if (code == 0) {
                eyb.this.f34471a = true;
                bzb.getInstance().engineInit();
            }
            for (bzb.InterfaceC2119h interfaceC2119h : eyb.this.f34479i) {
                if (interfaceC2119h != null) {
                    interfaceC2119h.onAuthResult(code);
                }
            }
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onRecognizeResult(String result, String s1) {
            StringBuilder sb = new StringBuilder();
            sb.append("onRecognizeResult: ");
            sb.append(result);
            eyb.this.f34477g.setLength(0);
            eyb.this.f34477g.append(result);
            for (bzb.InterfaceC2119h interfaceC2119h : eyb.this.f34479i) {
                if (interfaceC2119h != null) {
                    interfaceC2119h.onRecognizeResult(result, s1);
                }
            }
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onRecognizeVadTimeOut() {
            for (bzb.InterfaceC2119h interfaceC2119h : eyb.this.f34479i) {
                if (interfaceC2119h != null) {
                    interfaceC2119h.onRecognizeVadTimeOut();
                }
            }
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTranslateResult(String result, String s1) {
            StringBuilder sb = new StringBuilder();
            sb.append("onTranslateResult: ");
            sb.append(result);
            eyb.this.f34478h.setLength(0);
            eyb.this.f34478h.append(result);
            for (bzb.InterfaceC2119h interfaceC2119h : eyb.this.f34479i) {
                if (interfaceC2119h != null) {
                    interfaceC2119h.onTranslateResult(result, s1);
                }
            }
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTtsConvertMp3Finish(String s) {
            Log.e(eyb.f34470n, "onTtsConvertMp3Finish : " + s);
            for (bzb.InterfaceC2119h interfaceC2119h : eyb.this.f34479i) {
                if (interfaceC2119h != null) {
                    interfaceC2119h.onTtsConvertMp3Finish(s);
                }
            }
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTtsResult(String result) {
            StringBuilder sb = new StringBuilder();
            sb.append("onTtsResult: ");
            sb.append(result);
            for (bzb.InterfaceC2119h interfaceC2119h : eyb.this.f34479i) {
                if (interfaceC2119h != null) {
                    interfaceC2119h.onTtsResult(result);
                }
            }
        }
    }

    /* JADX INFO: renamed from: eyb$b */
    public class C5520b implements rv4.InterfaceC12313c {
        public C5520b() {
        }

        @Override // p000.rv4.InterfaceC12313c
        public void onLeftClick() {
            eyb.this.f34472b = null;
        }

        @Override // p000.rv4.InterfaceC12313c
        public void onRightClick() {
            eyb.this.f34472b = null;
        }
    }

    /* JADX INFO: renamed from: eyb$c */
    public class C5521c implements rv4.InterfaceC12313c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String[] f34484a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Activity f34485b;

        public C5521c(final String[] val$permissions, final Activity val$act) {
            this.f34484a = val$permissions;
            this.f34485b = val$act;
        }

        @Override // p000.rv4.InterfaceC12313c
        public void onLeftClick() {
        }

        @Override // p000.rv4.InterfaceC12313c
        public void onRightClick() {
            Arrays.asList(this.f34484a);
            if (Build.VERSION.SDK_INT >= 33 || lx2.checkSelfPermission(this.f34485b, xnc.f98580E) == 0) {
                return;
            }
            ActivityCompat.requestPermissions(this.f34485b, new String[]{xnc.f98580E}, 10000);
        }
    }

    /* JADX INFO: renamed from: eyb$d */
    public class C5522d implements PermissionExplanationDialog.OnClickListListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f34487a;

        public C5522d(final Activity val$act) {
            this.f34487a = val$act;
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onOk() {
            eyb.this.checkPermission(this.f34487a);
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onRefuse() {
            Toast.makeText(this.f34487a, C4201R.string.permission_tip5, 0).show();
        }
    }

    /* JADX INFO: renamed from: eyb$e */
    public static class C5523e {

        /* JADX INFO: renamed from: a */
        public static final eyb f34489a = new eyb();

        private C5523e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPermission(Activity act) {
        for (String str : f34468l) {
            if (lx2.checkSelfPermission(act, str) != 0) {
                ActivityCompat.requestPermissions(act, f34468l, 200);
                return;
            }
        }
    }

    private void dismissPermissionExplanationDialog() {
        PermissionExplanationDialog permissionExplanationDialog = this.f34473c;
        if (permissionExplanationDialog != null) {
            if (permissionExplanationDialog.isShowing()) {
                this.f34473c.dismiss();
            }
            this.f34473c = null;
        }
    }

    public static eyb getInstance() {
        return C5523e.f34489a;
    }

    private boolean isOfflineResExist(Context context, TransLanguageData transLanguageData) {
        hyb hybVarFromCode = hyb.fromCode(transLanguageData.getKeyName());
        if (hybVarFromCode != null) {
            int iCheckOfflineResource = wyb.checkOfflineResource(hybVarFromCode.getOfflineLanguageType());
            if (iCheckOfflineResource == 0) {
                showDownloadDialog(context, String.format(context.getString(C4035R.string.language_resource_not_download), context.getResources().getString(hybVarFromCode.getLanguageId())));
                return false;
            }
            if (iCheckOfflineResource == 1) {
                return true;
            }
            if (iCheckOfflineResource == 2) {
                showDownloadDialog(context, context.getString(C4035R.string.base_resource_not_download));
                return false;
            }
        } else {
            ToastUtils.showShort(context.getString(C4035R.string.language_resource_not_support) + AiLangUtil.getValue(context, transLanguageData.getKeyName()));
        }
        return false;
    }

    private void showDownloadDialog(Context context, String text) {
        if (this.f34472b == null) {
            this.f34472b = new rv4(context);
        }
        this.f34472b.setMessage(text).setLeftButtonText(context.getString(C4201R.string.cancel)).setRightButtonText(context.getString(C4201R.string.confirm));
        this.f34472b.setOnDialogClickListener(new C5520b());
        this.f34472b.show();
    }

    private void showPermissionExplanationDialog(Activity act) {
        dismissPermissionExplanationDialog();
        if (this.f34473c == null) {
            this.f34473c = new PermissionExplanationDialog(act, new C5522d(act));
        }
        if (this.f34473c.isShowing()) {
            return;
        }
        this.f34473c.show();
    }

    private void showPermissionReqDialog(Activity act, String[] permissions2) {
        if (this.f34474d == null) {
            this.f34474d = new rv4(act);
        }
        this.f34474d.setMessage(act.getString(C4035R.string.permission_download_language)).setLeftButtonText(act.getString(C4201R.string.cancel)).setRightButtonText(act.getString(C4201R.string.confirm));
        this.f34474d.setOnDialogClickListener(new C5521c(permissions2, act));
        this.f34474d.show();
    }

    public void addOfflineListener(bzb.InterfaceC2119h listener) {
        if (listener != null) {
            this.f34479i.add(listener);
        }
    }

    public boolean checkAndRequestOfflinePermissions(Activity act) {
        if (!this.f34480j) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        String[] strArr = f34468l;
        if (l5g.hasPermissions(act, strArr)) {
            return true;
        }
        showPermissionReqDialog(act, strArr);
        return false;
    }

    public void checkAndStart() {
    }

    public boolean checkOfflineResource(Context context, TransLanguageData fromLanguageData, TransLanguageData toLanguageData) {
        return this.f34480j && isOfflineResExist(context, fromLanguageData) && isOfflineResExist(context, toLanguageData);
    }

    public void clearCacheStr() {
        this.f34477g.setLength(0);
        this.f34478h.setLength(0);
    }

    public String getLastRecognizeStr() {
        return this.f34477g.toString();
    }

    public String getLastTransStr() {
        return this.f34478h.toString();
    }

    public void initOffLineTrans(Context context) {
        if (this.f34480j && context != null) {
            im4.getInstance().init(context);
            if (Build.VERSION.SDK_INT >= 33) {
                if (bzb.getInstance().getAuthResult() != 0) {
                    bzb.getInstance().initSDK(context);
                } else {
                    this.f34471a = true;
                }
            } else if (l5g.hasPermissions(context, f34468l)) {
                if (bzb.getInstance().getAuthResult() != 0) {
                    bzb.getInstance().initSDK(context);
                } else {
                    this.f34471a = true;
                }
            }
            bzb.getInstance().setOfflineSdkListener(new C5519a());
        }
    }

    public boolean isFastTransCallback() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f34481k <= 40) {
            return true;
        }
        this.f34481k = jCurrentTimeMillis;
        return false;
    }

    public boolean isOfflineSdkInit() {
        return this.f34471a;
    }

    public boolean isOfflineStartTooFast() {
        if (System.currentTimeMillis() - this.f34476f < 400) {
            return true;
        }
        this.f34476f = System.currentTimeMillis();
        return false;
    }

    public boolean isSupportOfflineTranslation() {
        return this.f34480j;
    }

    public void offlineStop() {
        if (this.f34480j) {
            if (this.f34475e) {
                this.f34475e = false;
                bzb.getInstance().recognizeStopRecord();
            }
            this.f34476f = System.currentTimeMillis();
        }
    }

    public void removeOfflineListener(bzb.InterfaceC2119h listener) {
        if (listener != null) {
            this.f34479i.remove(listener);
        }
    }

    public void setLanguage(TransLanguageData fromLan, TransLanguageData toLan) {
        if (this.f34480j) {
            if (!this.f34471a) {
                Log.e(f34470n, "setLanguage: 离线SDK未初始化");
                return;
            }
            if (fromLan == null || toLan == null) {
                Log.e(f34470n, "setLanguage: fromLan or toLan is null");
                return;
            }
            bzb.getInstance().setLanguage(hyb.fromCode(fromLan.getKeyName()).getOfflineLanguageType(), hyb.fromCode(toLan.getKeyName()).getOfflineLanguageType());
        }
    }

    public void setOfflineSdkInit(boolean offlineSdkInit) {
        this.f34471a = offlineSdkInit;
    }

    public void setSupportOfflineTranslation(boolean supportOfflineTranslation) {
        this.f34480j = supportOfflineTranslation;
    }

    public void translate(Context context, String txt) {
        if (this.f34480j) {
            StringBuilder sb = new StringBuilder();
            sb.append("translate: ");
            sb.append(txt);
            if (!this.f34471a) {
                l3h.showToastShort(context.getString(C4035R.string.sdk_not_init));
                return;
            }
            String str = System.currentTimeMillis() + "";
            clearCacheStr();
            AudioPlayerManager.getInstance().stopAudio();
            bzb.getInstance().translateStart(txt, str);
        }
    }

    public void useOfflineTrans(Context context) {
        if (this.f34480j) {
            if (!vfe.getInstance().getBoolean("TRANS_OFFLINE_AUTH_SUCCESS", false)) {
                l3h.showToastShort(context.getString(C4035R.string.sdk_not_auth));
                return;
            }
            if (!this.f34471a) {
                l3h.showToastShort(context.getString(C4035R.string.sdk_not_init));
                return;
            }
            this.f34475e = true;
            clearCacheStr();
            AudioPlayerManager.getInstance().stopAudio();
            bzb.getInstance().recognizeStartRecord();
        }
    }
}
