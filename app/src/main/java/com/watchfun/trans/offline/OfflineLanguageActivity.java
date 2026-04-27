package com.watchfun.trans.offline;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.watchfun.base.BaseActivity;
import com.watchfun.trans.C4035R;
import com.watchfun.trans.offline.C4075a;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.utils.AppUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C7828jb;
import p000.bzb;
import p000.czb;
import p000.efb;
import p000.eyb;
import p000.im4;
import p000.l3h;
import p000.l5g;
import p000.lx2;
import p000.qc7;
import p000.rv4;
import p000.ubb;
import p000.vfe;
import p000.vk4;
import p000.wyb;
import p000.xnc;
import p000.xyb;
import p000.zm4;

/* JADX INFO: loaded from: classes6.dex */
public class OfflineLanguageActivity extends BaseActivity<C7828jb> {

    /* JADX INFO: renamed from: M */
    public static final String f25458M = "OfflineLanguageActivity";

    /* JADX INFO: renamed from: C */
    public String f25459C;

    /* JADX INFO: renamed from: F */
    public int f25460F;

    /* JADX INFO: renamed from: H */
    public vk4 f25461H;

    /* JADX INFO: renamed from: a */
    public RecyclerView f25463a;

    /* JADX INFO: renamed from: c */
    public Handler f25465c;

    /* JADX INFO: renamed from: d */
    public C4075a f25466d;

    /* JADX INFO: renamed from: e */
    public String[] f25467e;

    /* JADX INFO: renamed from: f */
    public rv4 f25468f;

    /* JADX INFO: renamed from: b */
    public List<vk4> f25464b = new ArrayList();

    /* JADX INFO: renamed from: m */
    public long f25469m = 2000;

    /* JADX INFO: renamed from: L */
    public long f25462L = System.currentTimeMillis();

    /* JADX INFO: renamed from: com.watchfun.trans.offline.OfflineLanguageActivity$a */
    public class ViewOnClickListenerC4069a implements View.OnClickListener {
        public ViewOnClickListenerC4069a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            OfflineLanguageActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.offline.OfflineLanguageActivity$b */
    public class C4070b implements bzb.InterfaceC2119h {
        public C4070b() {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void offlineResourceMissing() {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onAuthResult(int code) {
            if (code == 0) {
                vfe.getInstance().putBoolean("TRANS_OFFLINE_AUTH_SUCCESS", true);
                eyb.getInstance().setOfflineSdkInit(true);
            }
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onRecognizeResult(String s, String s1) {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onRecognizeVadTimeOut() {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTranslateResult(String s, String s1) {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTtsConvertMp3Finish(String s) {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTtsResult(String s) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.offline.OfflineLanguageActivity$c */
    public class C4071c implements rv4.InterfaceC12313c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vk4 f25472a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25473b;

        public C4071c(final vk4 val$bean, final int val$pos) {
            this.f25472a = val$bean;
            this.f25473b = val$pos;
        }

        @Override // p000.rv4.InterfaceC12313c
        public void onLeftClick() {
        }

        @Override // p000.rv4.InterfaceC12313c
        public void onRightClick() {
            OfflineLanguageActivity.this.getPermission(this.f25472a, this.f25473b);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.offline.OfflineLanguageActivity$d */
    public class C4072d extends TypeToken<List<czb>> {
        public C4072d() {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.offline.OfflineLanguageActivity$e */
    public class C4073e implements C4075a.c {
        public C4073e() {
        }

        @Override // com.watchfun.trans.offline.C4075a.c
        public void onDownload(vk4 bean, int pos) {
            OfflineLanguageActivity.this.f25461H = bean;
            OfflineLanguageActivity.this.f25460F = pos;
            if (Build.VERSION.SDK_INT >= 33) {
                OfflineLanguageActivity.this.doDownload(bean, pos);
                return;
            }
            OfflineLanguageActivity offlineLanguageActivity = OfflineLanguageActivity.this;
            if (l5g.hasPermissions(offlineLanguageActivity, offlineLanguageActivity.f25467e)) {
                OfflineLanguageActivity.this.doDownload(bean, pos);
            } else {
                OfflineLanguageActivity.this.showPermissionReqDialog(bean, pos);
            }
        }

        @Override // com.watchfun.trans.offline.C4075a.c
        public void onRedownload(vk4 bean, int pos) {
            if (Build.VERSION.SDK_INT >= 33) {
                OfflineLanguageActivity.this.doDownload(bean, pos);
                return;
            }
            OfflineLanguageActivity offlineLanguageActivity = OfflineLanguageActivity.this;
            if (l5g.hasPermissions(offlineLanguageActivity, offlineLanguageActivity.f25467e)) {
                OfflineLanguageActivity.this.doDownload(bean, pos);
            } else {
                OfflineLanguageActivity.this.showPermissionReqDialog(bean, pos);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.offline.OfflineLanguageActivity$f */
    public class C4074f implements im4.InterfaceC7493e {

        /* JADX INFO: renamed from: com.watchfun.trans.offline.OfflineLanguageActivity$f$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                OfflineLanguageActivity.this.f25466d.setData(OfflineLanguageActivity.this.f25464b);
            }
        }

        /* JADX INFO: renamed from: com.watchfun.trans.offline.OfflineLanguageActivity$f$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                OfflineLanguageActivity.this.f25466d.setData(OfflineLanguageActivity.this.f25464b);
            }
        }

        /* JADX INFO: renamed from: com.watchfun.trans.offline.OfflineLanguageActivity$f$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                OfflineLanguageActivity.this.f25466d.setData(OfflineLanguageActivity.this.f25464b);
            }
        }

        /* JADX INFO: renamed from: com.watchfun.trans.offline.OfflineLanguageActivity$f$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                OfflineLanguageActivity.this.f25466d.setData(OfflineLanguageActivity.this.f25464b);
            }
        }

        /* JADX INFO: renamed from: com.watchfun.trans.offline.OfflineLanguageActivity$f$e */
        public class e implements Runnable {
            public e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                OfflineLanguageActivity.this.f25466d.setData(OfflineLanguageActivity.this.f25464b);
                if (ubb.isNetworkAvailable(OfflineLanguageActivity.this)) {
                    return;
                }
                l3h.showToastShort(OfflineLanguageActivity.this, C4201R.string.loading_no_net_view_text_hint);
            }
        }

        /* JADX INFO: renamed from: com.watchfun.trans.offline.OfflineLanguageActivity$f$f */
        public class f implements Runnable {
            public f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                OfflineLanguageActivity.this.f25466d.setData(OfflineLanguageActivity.this.f25464b);
            }
        }

        public C4074f() {
        }

        @Override // p000.im4.InterfaceC7493e
        public void onComplete(String taskId, File file) {
            StringBuilder sb = new StringBuilder();
            sb.append("onComplete: ");
            sb.append(taskId);
            sb.append("file: ");
            sb.append(file);
            vk4 vk4VarFindDownloadBean = OfflineLanguageActivity.this.findDownloadBean(taskId);
            if (vk4VarFindDownloadBean != null) {
                vk4VarFindDownloadBean.setDownloadStatus(zm4.SUCCESS);
                OfflineLanguageActivity.this.f25465c.post(new d());
            }
            if (bzb.getInstance().getAuthResult() != 0) {
                bzb.getInstance().initSDK(OfflineLanguageActivity.this);
            }
        }

        @Override // p000.im4.InterfaceC7493e
        public void onCopy(String taskId) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCopy: taskId ");
            sb.append(taskId);
        }

        @Override // p000.im4.InterfaceC7493e
        public void onError(String taskId, int downloadError, Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("onError: taskId ");
            sb.append(taskId);
            vk4 vk4VarFindDownloadBean = OfflineLanguageActivity.this.findDownloadBean(taskId);
            if (vk4VarFindDownloadBean != null) {
                vk4VarFindDownloadBean.setDownloadStatus(zm4.FAILED);
                OfflineLanguageActivity.this.f25465c.post(new e());
            }
        }

        @Override // p000.im4.InterfaceC7493e
        public void onPaused(String taskId) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPaused: taskId ");
            sb.append(taskId);
        }

        @Override // p000.im4.InterfaceC7493e
        public void onProgress(String taskId, int progress) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - OfflineLanguageActivity.this.f25462L >= OfflineLanguageActivity.this.f25469m || progress == 100) {
                vk4 vk4VarFindDownloadBean = OfflineLanguageActivity.this.findDownloadBean(taskId);
                vk4VarFindDownloadBean.setDownloadStatus(zm4.DOWNLOADING);
                StringBuilder sb = new StringBuilder();
                sb.append("onProgress: find bean for taskId: ");
                sb.append(taskId);
                vk4VarFindDownloadBean.getProgress();
                vk4VarFindDownloadBean.setProgress(progress);
                OfflineLanguageActivity.this.f25465c.post(new c());
                OfflineLanguageActivity.this.f25462L = jCurrentTimeMillis;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onProgress: progress ");
            sb2.append(progress);
            sb2.append(",taskId ");
            sb2.append(taskId);
        }

        @Override // p000.im4.InterfaceC7493e
        public void onResumed(String taskId) {
            StringBuilder sb = new StringBuilder();
            sb.append("onResumed: taskId ");
            sb.append(taskId);
        }

        @Override // p000.im4.InterfaceC7493e
        public void onStart(String taskId) {
            StringBuilder sb = new StringBuilder();
            sb.append("onStart: ");
            sb.append(taskId);
            vk4 vk4VarFindDownloadBean = OfflineLanguageActivity.this.findDownloadBean(taskId);
            if (vk4VarFindDownloadBean != null) {
                vk4VarFindDownloadBean.setDownloadStatus(zm4.DOWNLOADING);
                vk4VarFindDownloadBean.setProgress(0);
                OfflineLanguageActivity.this.f25465c.post(new a());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onStart: bean is null for taskId: ");
                sb2.append(taskId);
            }
        }

        @Override // p000.im4.InterfaceC7493e
        public void onUnzip(String taskId) {
            StringBuilder sb = new StringBuilder();
            sb.append("onUnzip: taskId ");
            sb.append(taskId);
            vk4 vk4VarFindDownloadBean = OfflineLanguageActivity.this.findDownloadBean(taskId);
            if (vk4VarFindDownloadBean != null) {
                vk4VarFindDownloadBean.setDownloadStatus(zm4.UNZIPING);
                OfflineLanguageActivity.this.f25465c.post(new f());
            }
        }

        @Override // p000.im4.InterfaceC7493e
        public void onWaiting(String taskId) {
            StringBuilder sb = new StringBuilder();
            sb.append("onWaiting: ");
            sb.append(taskId);
            vk4 vk4VarFindDownloadBean = OfflineLanguageActivity.this.findDownloadBean(taskId);
            if (vk4VarFindDownloadBean != null) {
                vk4VarFindDownloadBean.setDownloadStatus(zm4.DOWNLOADING);
                OfflineLanguageActivity.this.f25465c.post(new b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doDownload(vk4 bean, int pos) {
        String strDownloadOfflineLanguageResource;
        bzb.getInstance().initDirs(this);
        String resourceCode = bean.getResourceCode();
        if ("base".equals(resourceCode)) {
            updateUiOnDownload(bean, im4.getInstance().downloadOfflineBasicResource(bean.getUrl()));
            return;
        }
        if (im4.getInstance().isExistInActiveTasksByUrl(this.f25459C)) {
            l3h.showToastShort(getString(C4035R.string.base_resource_is_downloading));
            return;
        }
        if (wyb.checkOfflineBaseResource()) {
            strDownloadOfflineLanguageResource = im4.getInstance().downloadOfflineLanguageResource(resourceCode, bean.getUrl());
        } else {
            String strDownloadOfflineBasicResource = im4.getInstance().downloadOfflineBasicResource(this.f25459C);
            strDownloadOfflineLanguageResource = strDownloadOfflineBasicResource;
            bean = findDownloadBeanByUrl(this.f25459C);
        }
        updateUiOnDownload(bean, strDownloadOfflineLanguageResource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public vk4 findDownloadBean(String taskId) {
        for (vk4 vk4Var : this.f25464b) {
            if (TextUtils.equals(vk4Var.getTaskId(), taskId)) {
                return vk4Var;
            }
        }
        return null;
    }

    private vk4 findDownloadBeanByUrl(String url) {
        for (vk4 vk4Var : this.f25464b) {
            if (TextUtils.equals(vk4Var.getUrl(), url)) {
                return vk4Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getPermission(vk4 bean, int pos) {
        if (Build.VERSION.SDK_INT >= 33) {
            doDownload(bean, pos);
        } else if (lx2.checkSelfPermission(this, xnc.f98580E) != 0) {
            ActivityCompat.requestPermissions(this, new String[]{xnc.f98580E}, 10000);
        } else {
            doDownload(bean, pos);
        }
    }

    private void initListData() throws Throwable {
        String textFromAssets = AppUtils.getTextFromAssets(this, "offline_sdk_resource.json");
        StringBuilder sb = new StringBuilder();
        sb.append("initListData: json ");
        sb.append(textFromAssets);
        List<czb> list = (List) qc7.fromJson(textFromAssets, new C4072d().getType());
        xyb[] xybVarArr = {xyb.BASE, xyb.CN, xyb.EN, xyb.JA, xyb.KO, xyb.FR, xyb.ES, xyb.RU, xyb.DE, xyb.VI, xyb.TH, xyb.PT, xyb.AR, xyb.HI};
        List<vk4> allDownloadData = im4.getInstance().getAllDownloadData();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onResume: getAllDownloadData ");
        sb2.append(allDownloadData.toString());
        int i = 0;
        for (czb czbVar : list) {
            vk4 vk4Var = new vk4();
            if (14 > i) {
                vk4Var.setName(getString(xybVarArr[i].getResNameId()));
            }
            vk4Var.setResourceCode(czbVar.getAbbr());
            vk4Var.setUrl(czbVar.getDownload_url());
            if ("base".equals(czbVar.getAbbr())) {
                this.f25459C = czbVar.getDownload_url();
            }
            vk4Var.setSize(czbVar.getSize());
            Iterator<vk4> it = allDownloadData.iterator();
            while (true) {
                if (it.hasNext()) {
                    vk4 next = it.next();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("onResume: tmp.getUrl ");
                    sb3.append(next.getUrl());
                    sb3.append(",bean.getUrl ");
                    sb3.append(vk4Var.getUrl());
                    if (TextUtils.equals(next.getUrl(), vk4Var.getUrl())) {
                        vk4Var.setTaskId(next.getTaskId());
                        vk4Var.setDownloadStatus(next.getDownloadStatus());
                        vk4Var.setProgress(next.getProgress());
                        break;
                    }
                }
            }
            this.f25464b.add(vk4Var);
            i++;
        }
    }

    private void initOfflineListener() {
        bzb.getInstance().setOfflineSdkListener(new C4070b());
    }

    private void initRv() {
        this.f25466d = new C4075a(this, this.f25464b);
        RecyclerView recyclerView = ((C7828jb) this.binding).f50144d;
        this.f25463a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f25463a.setAdapter(this.f25466d);
    }

    private void setListener() {
        this.f25466d.setListener(new C4073e());
        im4.getInstance().setDownloadListener(new C4074f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPermissionReqDialog(vk4 bean, int pos) {
        rv4 rv4Var = new rv4(this);
        this.f25468f = rv4Var;
        rv4Var.setMessage(getString(C4035R.string.permission_download_language)).setLeftButtonText(getString(C4201R.string.cancel)).setRightButtonText(getString(C4201R.string.confirm));
        this.f25468f.setOnDialogClickListener(new C4071c(bean, pos));
        this.f25468f.show();
    }

    private void updateUiOnDownload(vk4 bean, String taskId) {
        if (bean == null) {
            return;
        }
        bean.setTaskId(taskId);
        bean.setDownloadStatus(zm4.DOWNLOADING);
        bean.setProgress(0);
        this.f25466d.setData(this.f25464b);
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() throws Throwable {
        super.initView();
        this.f25465c = new Handler();
        this.f25467e = new String[]{xnc.f98579D, xnc.f98580E};
        im4.getInstance().init(this);
        initListData();
        ((C7828jb) this.binding).f50142b.setOnClickListener(new ViewOnClickListenerC4069a());
        initRv();
        setListener();
        initOfflineListener();
    }

    @Override // com.watchfun.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(1);
        super.onCreate(savedInstanceState);
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        im4.getInstance().setDownloadListener(null);
        rv4 rv4Var = this.f25468f;
        if (rv4Var != null) {
            rv4Var.dismiss();
        }
        Handler handler = this.f25465c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @efb String[] permissions2, @efb int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions2, grantResults);
        if (requestCode == 10000) {
            for (int i : grantResults) {
                if (i != 0) {
                    l3h.showToastShort(this, C4035R.string.file_permission_denied);
                    return;
                }
            }
            doDownload(this.f25461H, this.f25460F);
        }
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C7828jb getViewBinding() {
        return C7828jb.inflate(getLayoutInflater());
    }
}
