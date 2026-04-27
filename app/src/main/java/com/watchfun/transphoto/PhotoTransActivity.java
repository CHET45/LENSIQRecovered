package com.watchfun.transphoto;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.view.SurfaceView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2475h;
import com.blankj.utilcode.util.C2478k;
import com.blankj.utilcode.util.NetworkUtils;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.bumptech.glide.request.RequestOptions;
import com.watchfun.base.BaseActivity;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.bean.p012ai.LangLau;
import com.watchfun.transcommon.bean.photo.PhotoTransBean;
import com.watchfun.transcommon.dialog.PermissionExplanationDialog;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.transcommon.utils.AppUtils;
import com.watchfun.transphoto.widget.TouchImageView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import p000.C12966tb;
import p000.avc;
import p000.bvc;
import p000.cu0;
import p000.efb;
import p000.hib;
import p000.k95;
import p000.l3h;
import p000.lx2;
import p000.mf4;
import p000.mp1;
import p000.ntc;
import p000.qc7;
import p000.u16;
import p000.ufh;
import p000.us7;
import p000.vfe;
import p000.xnc;
import p000.xt5;
import p000.yp0;

/* JADX INFO: loaded from: classes7.dex */
public class PhotoTransActivity extends BaseActivity<C12966tb> implements avc.InterfaceC1620b {

    /* JADX INFO: renamed from: f2 */
    public static final /* synthetic */ boolean f26070f2 = false;

    /* JADX INFO: renamed from: C */
    public long f26071C;

    /* JADX INFO: renamed from: F */
    public boolean f26072F;

    /* JADX INFO: renamed from: H */
    public AnimationDrawable f26073H;

    /* JADX INFO: renamed from: L */
    public mf4 f26074L;

    /* JADX INFO: renamed from: M */
    public bvc f26075M;

    /* JADX INFO: renamed from: M1 */
    public File f26076M1;

    /* JADX INFO: renamed from: N */
    public TransLanguageData f26077N;

    /* JADX INFO: renamed from: Q */
    public TransLanguageData f26078Q;

    /* JADX INFO: renamed from: V1 */
    public String f26079V1;

    /* JADX INFO: renamed from: Y */
    public String f26081Y;

    /* JADX INFO: renamed from: Z */
    public File f26082Z;

    /* JADX INFO: renamed from: Z1 */
    public boolean f26083Z1;

    /* JADX INFO: renamed from: a */
    public SurfaceView f26084a;

    /* JADX INFO: renamed from: b */
    public mp1 f26086b;

    /* JADX INFO: renamed from: b2 */
    public boolean f26087b2;

    /* JADX INFO: renamed from: c2 */
    public PermissionExplanationDialog f26089c2;

    /* JADX INFO: renamed from: d */
    public List<TransLanguageData> f26090d;

    /* JADX INFO: renamed from: d2 */
    public boolean f26091d2;

    /* JADX INFO: renamed from: e */
    public List<TransLanguageData> f26092e;

    /* JADX INFO: renamed from: f */
    public ntc f26094f;

    /* JADX INFO: renamed from: m */
    public ntc f26095m;

    /* JADX INFO: renamed from: c */
    public final int f26088c = 110;

    /* JADX INFO: renamed from: X */
    public boolean f26080X = false;

    /* JADX INFO: renamed from: a2 */
    public boolean f26085a2 = false;

    /* JADX INFO: renamed from: e2 */
    public boolean f26093e2 = false;

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoTransActivity$a */
    public class C4268a implements TouchImageView.InterfaceC4285c {
        public C4268a() {
        }

        @Override // com.watchfun.transphoto.widget.TouchImageView.InterfaceC4285c
        public void onClick() {
            if (PhotoTransActivity.this.isFinishing()) {
                return;
            }
            if ((PhotoTransActivity.this.f26073H == null || !PhotoTransActivity.this.f26073H.isRunning()) && xt5.isFileExists(PhotoTransActivity.this.f26082Z) && xt5.isFileExists(PhotoTransActivity.this.f26076M1)) {
                if (PhotoTransActivity.this.f26083Z1) {
                    PhotoTransActivity photoTransActivity = PhotoTransActivity.this;
                    photoTransActivity.loadImage(photoTransActivity.f26082Z, ((C12966tb) ((BaseActivity) PhotoTransActivity.this).binding).f84116Q.getDrawable());
                    PhotoTransActivity photoTransActivity2 = PhotoTransActivity.this;
                    photoTransActivity2.showCustomToast(photoTransActivity2.getString(C4201R.string.string_switch_translate), true);
                    PhotoTransActivity.this.f26083Z1 = false;
                    return;
                }
                PhotoTransActivity photoTransActivity3 = PhotoTransActivity.this;
                photoTransActivity3.loadImage(photoTransActivity3.f26076M1, ((C12966tb) ((BaseActivity) PhotoTransActivity.this).binding).f84116Q.getDrawable());
                PhotoTransActivity photoTransActivity4 = PhotoTransActivity.this;
                photoTransActivity4.showCustomToast(photoTransActivity4.getString(C4201R.string.string_switch_origin), true);
                PhotoTransActivity.this.f26083Z1 = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoTransActivity$b */
    public class ViewOnClickListenerC4269b implements View.OnClickListener {
        public ViewOnClickListenerC4269b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PhotoTransActivity.this.showTakePhotoView();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoTransActivity$c */
    public class C4270c implements C2475h.b {
        public C4270c() {
        }

        @Override // com.blankj.utilcode.util.C2475h.b
        public void onDenied(@efb List<String> list, @efb List<String> list2) {
            if (list.size() > 0) {
                l3h.showToastShort(PhotoTransActivity.this.getString(C4201R.string.permission_system_set));
            }
        }

        @Override // com.blankj.utilcode.util.C2475h.b
        public void onGranted(@efb List<String> list) {
            PhotoTransActivity.this.setCamera();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoTransActivity$d */
    public class C4271d implements mp1.InterfaceC9446i {
        public C4271d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$0() {
            PhotoTransActivity.this.showTakePhotoView();
        }

        @Override // p000.mp1.InterfaceC9446i
        public void getPhotoFile(String str) {
            PhotoTransActivity.this.f26091d2 = false;
            PhotoTransActivity.this.translatePhotoByPath(str);
        }

        @Override // p000.mp1.InterfaceC9446i
        public void getVideoFile(String str) {
        }

        @Override // p000.mp1.InterfaceC9446i
        public void onError() {
            PhotoTransActivity.this.runOnUiThread(new Runnable() { // from class: zuc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f106130a.lambda$onError$0();
                }
            });
        }

        @Override // p000.mp1.InterfaceC9446i
        public void onPreviewFrame(byte[] bArr, Camera camera) {
        }

        @Override // p000.mp1.InterfaceC9446i
        public void onTakePicture(byte[] bArr, Camera camera) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoTransActivity$e */
    public class C4272e implements PermissionExplanationDialog.OnClickListListener {
        public C4272e() {
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onOk() {
            PhotoTransActivity.this.initCamera();
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onRefuse() {
            PhotoTransActivity photoTransActivity = PhotoTransActivity.this;
            photoTransActivity.showCustomToast(photoTransActivity.getString(C4201R.string.permission_tip5), false);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoTransActivity$f */
    public class C4273f extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LinearSnapHelper f26101a;

        public C4273f(LinearSnapHelper linearSnapHelper) {
            this.f26101a = linearSnapHelper;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@efb RecyclerView recyclerView, int i) {
            View viewFindSnapView;
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0 || recyclerView.getChildCount() <= 0 || (viewFindSnapView = this.f26101a.findSnapView(((C12966tb) ((BaseActivity) PhotoTransActivity.this).binding).f84121Z1.getLayoutManager())) == null) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindSnapView);
            PhotoTransActivity.this.f26094f.setSelectPos(childAdapterPosition);
            PhotoTransActivity photoTransActivity = PhotoTransActivity.this;
            photoTransActivity.f26078Q = photoTransActivity.f26094f.getLanguages().get(childAdapterPosition);
            TextView textView = ((C12966tb) ((BaseActivity) PhotoTransActivity.this).binding).f84129d2;
            PhotoTransActivity photoTransActivity2 = PhotoTransActivity.this;
            textView.setText(AiLangUtil.getValue(photoTransActivity2, photoTransActivity2.f26078Q.getKeyName()));
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoTransActivity$g */
    public class C4274g extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LinearSnapHelper f26103a;

        public C4274g(LinearSnapHelper linearSnapHelper) {
            this.f26103a = linearSnapHelper;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@efb RecyclerView recyclerView, int i) {
            View viewFindSnapView;
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0 || recyclerView.getChildCount() <= 0 || (viewFindSnapView = this.f26103a.findSnapView(((C12966tb) ((BaseActivity) PhotoTransActivity.this).binding).f84123a2.getLayoutManager())) == null) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindSnapView);
            PhotoTransActivity.this.f26095m.setSelectPos(childAdapterPosition);
            PhotoTransActivity photoTransActivity = PhotoTransActivity.this;
            photoTransActivity.f26077N = photoTransActivity.f26095m.getLanguages().get(childAdapterPosition);
            StringBuilder sb = new StringBuilder();
            sb.append("onScrollStateChanged: fromLanguageData ");
            sb.append(qc7.toJson(PhotoTransActivity.this.f26077N));
            TextView textView = ((C12966tb) ((BaseActivity) PhotoTransActivity.this).binding).f84127c2;
            PhotoTransActivity photoTransActivity2 = PhotoTransActivity.this;
            textView.setText(AiLangUtil.getValue(photoTransActivity2, photoTransActivity2.f26077N.getKeyName()));
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoTransActivity$h */
    public class ViewOnClickListenerC4275h implements View.OnClickListener {
        public ViewOnClickListenerC4275h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PhotoTransActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoTransActivity$i */
    public class ViewOnClickListenerC4276i implements View.OnClickListener {
        public ViewOnClickListenerC4276i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (System.currentTimeMillis() - PhotoTransActivity.this.f26071C < 1000) {
                return;
            }
            PhotoTransActivity.this.f26071C = System.currentTimeMillis();
            if (PhotoTransActivity.this.checkPermissionToInit()) {
                PhotoTransActivity.this.showTranslateView();
                PhotoTransActivity.this.f26086b.takePicture(90, false);
                PhotoTransActivity.this.f26072F = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoTransActivity$j */
    public class ViewOnClickListenerC4277j implements View.OnClickListener {
        public ViewOnClickListenerC4277j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PhotoTransActivity.this.controlSelectLanguageView();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoTransActivity$k */
    public class ViewOnClickListenerC4278k implements View.OnClickListener {
        public ViewOnClickListenerC4278k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PhotoTransActivity.this.controlSelectLanguageView();
            if (PhotoTransActivity.this.f26080X) {
                if (!TextUtils.isEmpty(PhotoTransActivity.this.f26079V1)) {
                    PhotoTransActivity photoTransActivity = PhotoTransActivity.this;
                    photoTransActivity.translatePhotoByPath(photoTransActivity.f26079V1);
                }
                if (xt5.isFileExists(PhotoTransActivity.this.f26082Z)) {
                    PhotoTransActivity photoTransActivity2 = PhotoTransActivity.this;
                    photoTransActivity2.loadImage(photoTransActivity2.f26082Z, null);
                }
                PhotoTransActivity.this.showTranslateView();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoTransActivity$l */
    public class ViewOnClickListenerC4279l implements View.OnClickListener {
        public ViewOnClickListenerC4279l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PhotoTransActivity.this.controlSelectLanguageView();
            if (PhotoTransActivity.this.f26080X) {
                if (!TextUtils.isEmpty(PhotoTransActivity.this.f26079V1)) {
                    PhotoTransActivity photoTransActivity = PhotoTransActivity.this;
                    photoTransActivity.translatePhotoByPath(photoTransActivity.f26079V1);
                }
                if (xt5.isFileExists(PhotoTransActivity.this.f26082Z)) {
                    PhotoTransActivity photoTransActivity2 = PhotoTransActivity.this;
                    photoTransActivity2.loadImage(photoTransActivity2.f26082Z, null);
                }
                PhotoTransActivity.this.showTranslateView();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoTransActivity$m */
    public class ViewOnClickListenerC4280m implements View.OnClickListener {
        public ViewOnClickListenerC4280m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (System.currentTimeMillis() - PhotoTransActivity.this.f26071C < 1000) {
                return;
            }
            PhotoTransActivity.this.f26071C = System.currentTimeMillis();
            PhotoTransActivity.this.showTakePhotoView();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoTransActivity$n */
    public class ViewOnClickListenerC4281n implements View.OnClickListener {
        public ViewOnClickListenerC4281n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PhotoTransActivity.this.openGallery();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkPermissionToInit() {
        boolean zIsGranted = C2475h.isGranted(xnc.f98581F);
        if (zIsGranted) {
            initCamera();
        } else {
            showPermissionExplanationDialog();
        }
        return zIsGranted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void controlSelectLanguageView() {
        boolean z = this.f26085a2;
        this.f26085a2 = !z;
        if (z) {
            hideSelectLanguageView();
        } else {
            showSelectLanguageView();
        }
    }

    private void dismissPermissionExplanationDialog() {
        PermissionExplanationDialog permissionExplanationDialog = this.f26089c2;
        if (permissionExplanationDialog != null) {
            if (permissionExplanationDialog.isShowing()) {
                this.f26089c2.dismiss();
            }
            this.f26089c2 = null;
        }
    }

    private int findPosition(List<TransLanguageData> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIatLanguage().equals(str)) {
                return i;
            }
        }
        return 0;
    }

    private int getRotate(InputStream inputStream) {
        try {
            int attributeInt = new ExifInterface(inputStream).getAttributeInt(k95.f52880C, 1);
            C2473f.m4168e("ltttt", "只::::" + attributeInt);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private File getoutputPath() {
        return new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES), System.currentTimeMillis() + ".jpg");
    }

    private void hideSelectLanguageView() {
        ((C12966tb) this.binding).f84111H.setVisibility(8);
        ((C12966tb) this.binding).f84118X.setVisibility(8);
        ((C12966tb) this.binding).f84120Z.setVisibility(0);
        ((C12966tb) this.binding).f84109C.setVisibility(0);
        ((C12966tb) this.binding).f84126c.setVisibility(0);
        ((C12966tb) this.binding).f84131f.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initCamera() {
        C2475h.permission(xnc.f98581F).callback(new C4270c()).request();
    }

    private void initLanguage() {
        if (this.f26093e2) {
            return;
        }
        ((C12966tb) this.binding).f84127c2.setText(C4201R.string.string_auto);
        TransLanguageData transLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString("language_photo_from"));
        this.f26077N = transLanguageData;
        if (transLanguageData != null) {
            ((C12966tb) this.binding).f84127c2.setText(AiLangUtil.getValue(this, transLanguageData.getKeyName()));
        } else {
            this.f26077N = new TransLanguageData();
            LangLau langLau = new LangLau();
            langLau.setEn("Auto");
            langLau.setZh("自动检测");
            this.f26077N.setTransId(33);
            this.f26077N.setDefaultName("Auto");
            this.f26077N.setSelect(true);
            this.f26077N.setVoiceName("catherine");
            this.f26077N.setIatLanguage("auto");
            this.f26077N.setLangKey("auto");
            this.f26077N.setKeyName("string_auto");
            this.f26077N.setUseMicTTS(true);
            ((C12966tb) this.binding).f84127c2.setText(C4201R.string.string_auto);
            vfe.getInstance().putString("language_photo_from", TransLanguageData.toJson(this.f26077N));
        }
        ((C12966tb) this.binding).f84127c2.setText(AiLangUtil.getValue(this, this.f26077N.getKeyName()));
        this.f26095m.setData(this.f26092e);
        int iFindPosition = findPosition(this.f26092e, this.f26077N.getIatLanguage());
        this.f26095m.setSelectPos(iFindPosition);
        ((C12966tb) this.binding).f84123a2.smoothScrollToPosition(iFindPosition);
        TransLanguageData transLanguageData2 = AppUtils.getTransLanguageData(vfe.getInstance().getString("language_photo"));
        this.f26078Q = transLanguageData2;
        if (transLanguageData2 != null) {
            ((C12966tb) this.binding).f84129d2.setText(AiLangUtil.getValue(this, transLanguageData2.getKeyName()));
        } else {
            this.f26078Q = new TransLanguageData();
            LangLau langLau2 = new LangLau();
            langLau2.setEn("English");
            langLau2.setZh("英语");
            this.f26078Q.setTransId(2);
            this.f26078Q.setDefaultName("English");
            this.f26078Q.setSelect(true);
            this.f26078Q.setVoiceName("catherine");
            this.f26078Q.setIatLanguage(ufh.f87916c);
            this.f26078Q.setLangKey(ufh.f87916c);
            this.f26078Q.setKeyName("en_name");
            this.f26078Q.setUseMicTTS(true);
            ((C12966tb) this.binding).f84129d2.setText(C4201R.string.ai_trans_en);
            vfe.getInstance().putString("language_photo", TransLanguageData.toJson(this.f26078Q));
        }
        this.f26094f.setData(this.f26090d);
        int iFindPosition2 = findPosition(this.f26090d, this.f26078Q.getIatLanguage());
        this.f26094f.setSelectPos(iFindPosition2);
        ((C12966tb) this.binding).f84121Z1.scrollToPosition(iFindPosition2 - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPause$0() {
        xt5.deleteAllInDir(getExternalFilesDir(Environment.DIRECTORY_PICTURES));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translatePhotoByInputStream$2() {
        File fileCompressImage = us7.compressImage(this.f26082Z);
        this.f26079V1 = fileCompressImage.getAbsolutePath();
        this.f26075M.loadData(fileCompressImage.getAbsolutePath(), this.f26077N.getIatLanguage(), this.f26078Q.getIatLanguage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translatePhotoByPath$1(String str) {
        File fileCompressImage = us7.compressImage(new File(str));
        this.f26079V1 = fileCompressImage.getAbsolutePath();
        this.f26075M.loadData(fileCompressImage.getAbsolutePath(), this.f26077N.getIatLanguage(), this.f26078Q.getIatLanguage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadImage(File file, Drawable drawable) {
        if (this.f26091d2) {
            if (drawable != null) {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).load(file).placeholder(drawable).into(((C12966tb) this.binding).f84116Q);
                return;
            } else {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).load(file).into(((C12966tb) this.binding).f84116Q);
                return;
            }
        }
        if (drawable != null) {
            ComponentCallbacks2C2485a.with((FragmentActivity) this).load(file).placeholder(drawable).apply((cu0<?>) new RequestOptions().transform(new u16())).into(((C12966tb) this.binding).f84116Q);
        } else {
            ComponentCallbacks2C2485a.with((FragmentActivity) this).load(file).apply((cu0<?>) new RequestOptions().transform(new u16())).into(((C12966tb) this.binding).f84116Q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openGallery() {
        this.f26093e2 = true;
        Intent intent = new Intent("android.intent.action.PICK", (Uri) null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(intent, 110);
    }

    private void releaseCamera() {
        mp1 mp1Var = this.f26086b;
        if (mp1Var != null) {
            mp1Var.releaseCamera();
        }
        SurfaceView surfaceView = this.f26084a;
        if (surfaceView != null) {
            ((C12966tb) this.binding).f84128d.removeView(surfaceView);
            this.f26084a = null;
        }
        this.f26087b2 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCamera() {
        if (lx2.checkSelfPermission(this, xnc.f98581F) == 0 && !this.f26087b2) {
            this.f26084a = new SurfaceView(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            this.f26087b2 = true;
            ((C12966tb) this.binding).f84128d.addView(this.f26084a, 0, layoutParams);
            mp1 mp1Var = new mp1(this, this.f26084a);
            this.f26086b = mp1Var;
            mp1Var.setCameraCallBack(new C4271d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCustomToast(String str, boolean z) {
        l3h.showToastShort(str);
    }

    private void showPermissionExplanationDialog() {
        dismissPermissionExplanationDialog();
        if (this.f26089c2 == null) {
            this.f26089c2 = new PermissionExplanationDialog(this, new C4272e());
        }
        this.f26089c2.setTipContent(getString(C4201R.string.string_camera_permission));
        if (this.f26089c2.isShowing()) {
            return;
        }
        this.f26089c2.show();
    }

    private void showSelectLanguageView() {
        ((C12966tb) this.binding).f84111H.setVisibility(0);
        ((C12966tb) this.binding).f84118X.setVisibility(8);
        ((C12966tb) this.binding).f84120Z.setVisibility(8);
        ((C12966tb) this.binding).f84109C.setVisibility(8);
        ((C12966tb) this.binding).f84126c.setVisibility(8);
        ((C12966tb) this.binding).f84131f.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTakePhotoView() {
        ((C12966tb) this.binding).f84120Z.setVisibility(0);
        ((C12966tb) this.binding).f84109C.setVisibility(0);
        ((C12966tb) this.binding).f84111H.setVisibility(8);
        ((C12966tb) this.binding).f84110F.setVisibility(8);
        ((C12966tb) this.binding).f84118X.setVisibility(8);
        ((C12966tb) this.binding).f84116Q.setVisibility(8);
        ((C12966tb) this.binding).f84126c.setVisibility(0);
        ((C12966tb) this.binding).f84131f.setVisibility(8);
        ((C12966tb) this.binding).f84119Y.setVisibility(8);
        ((C12966tb) this.binding).f84130e.setVisibility(0);
        ((C12966tb) this.binding).f84116Q.setImageBitmap(null);
        ((C12966tb) this.binding).f84116Q.setBackgroundColor(0);
        ((C12966tb) this.binding).f84116Q.resetToDefault();
        this.f26080X = false;
        xt5.delete(this.f26081Y);
        mp1 mp1Var = this.f26086b;
        if (mp1Var != null && this.f26072F) {
            mp1Var.startPreview();
            this.f26072F = false;
        }
        AnimationDrawable animationDrawable = this.f26073H;
        if (animationDrawable != null && animationDrawable.isRunning()) {
            this.f26073H.stop();
        }
        mf4 mf4Var = this.f26074L;
        if (mf4Var != null) {
            mf4Var.dispose();
        }
    }

    private void showTransalteFail() {
        ((C12966tb) this.binding).f84126c.setVisibility(0);
        ((C12966tb) this.binding).f84118X.setVisibility(0);
        ((C12966tb) this.binding).f84110F.setVisibility(8);
        ((C12966tb) this.binding).f84119Y.setVisibility(8);
        AnimationDrawable animationDrawable = this.f26073H;
        if (animationDrawable != null && animationDrawable.isRunning()) {
            this.f26073H.stop();
        }
        this.f26076M1 = null;
        this.f26080X = true;
        if (NetworkUtils.isConnected()) {
            showCustomToast(getString(C4201R.string.string_translate_fail), false);
        } else {
            showCustomToast(getString(C4201R.string.string_translate_fail_net), false);
        }
    }

    private void showTranslateSuccess() {
        ((C12966tb) this.binding).f84109C.setVisibility(8);
        ((C12966tb) this.binding).f84111H.setVisibility(8);
        ((C12966tb) this.binding).f84110F.setVisibility(8);
        ((C12966tb) this.binding).f84116Q.setVisibility(0);
        ((C12966tb) this.binding).f84119Y.setVisibility(8);
        ((C12966tb) this.binding).f84118X.setVisibility(0);
        ((C12966tb) this.binding).f84120Z.setVisibility(8);
        ((C12966tb) this.binding).f84126c.setVisibility(0);
        ((C12966tb) this.binding).f84131f.setVisibility(8);
        ((C12966tb) this.binding).f84130e.setVisibility(8);
        showCustomToast(getString(C4201R.string.string_switch_origin), true);
        AnimationDrawable animationDrawable = this.f26073H;
        if (animationDrawable != null && animationDrawable.isRunning()) {
            this.f26073H.stop();
        }
        this.f26083Z1 = true;
        this.f26080X = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTranslateView() {
        ((C12966tb) this.binding).f84110F.setVisibility(0);
        ((C12966tb) this.binding).f84119Y.setVisibility(0);
        ((C12966tb) this.binding).f84116Q.setVisibility(0);
        ((C12966tb) this.binding).f84109C.setVisibility(8);
        ((C12966tb) this.binding).f84120Z.setVisibility(8);
        ((C12966tb) this.binding).f84126c.setVisibility(8);
        ((C12966tb) this.binding).f84131f.setVisibility(8);
        ((C12966tb) this.binding).f84130e.setVisibility(8);
        ((C12966tb) this.binding).f84116Q.resetToDefault();
        if (this.f26073H == null) {
            this.f26073H = (AnimationDrawable) ((C12966tb) this.binding).f84119Y.getDrawable();
        }
        this.f26073H.start();
        this.f26072F = true;
    }

    private void translatePhotoByInputStream(InputStream inputStream, int i) {
        this.f26091d2 = true;
        byte[] bArrInputStream2ByteArr = us7.inputStream2ByteArr(inputStream);
        try {
            this.f26082Z = us7.saveImage(us7.rotateBitmap(BitmapFactory.decodeByteArray(bArrInputStream2ByteArr, 0, bArrInputStream2ByteArr.length), i), getoutputPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
        C2478k.getCachedPool().execute(new Runnable() { // from class: yuc
            @Override // java.lang.Runnable
            public final void run() {
                this.f103001a.lambda$translatePhotoByInputStream$2();
            }
        });
        ((C12966tb) this.binding).f84116Q.setBackgroundColor(-16777216);
        loadImage(this.f26082Z, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void translatePhotoByPath(final String str) {
        this.f26082Z = xt5.getFileByPath(str);
        this.f26081Y = str;
        C2478k.getCachedPool().execute(new Runnable() { // from class: wuc
            @Override // java.lang.Runnable
            public final void run() {
                this.f95542a.lambda$translatePhotoByPath$1(str);
            }
        });
        loadImage(xt5.getFileByPath(str), null);
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public C12966tb getViewBinding() {
        return C12966tb.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        yp0.setNavBarColor(this, -16777216);
        checkPermissionToInit();
        this.f26075M = new bvc(this);
        ntc ntcVar = new ntc(this);
        this.f26094f = ntcVar;
        ((C12966tb) this.binding).f84121Z1.setAdapter(ntcVar);
        ((C12966tb) this.binding).f84121Z1.setLayoutManager(new LinearLayoutManager(this, 1, false));
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        linearSnapHelper.attachToRecyclerView(((C12966tb) this.binding).f84121Z1);
        List<TransLanguageData> languagePhotoData = AiLangUtil.parseLanguagePhotoData(this);
        this.f26090d = languagePhotoData;
        this.f26094f.setData(languagePhotoData);
        ((C12966tb) this.binding).f84121Z1.addOnScrollListener(new C4273f(linearSnapHelper));
        ntc ntcVar2 = new ntc(this);
        this.f26095m = ntcVar2;
        ((C12966tb) this.binding).f84123a2.setAdapter(ntcVar2);
        ((C12966tb) this.binding).f84123a2.setLayoutManager(new LinearLayoutManager(this, 1, false));
        LinearSnapHelper linearSnapHelper2 = new LinearSnapHelper();
        linearSnapHelper2.attachToRecyclerView(((C12966tb) this.binding).f84123a2);
        this.f26092e = AiLangUtil.parseLanguagePhotoLeftData(this);
        StringBuilder sb = new StringBuilder();
        sb.append("onScrollStateChanged: leftLanguageDatas ");
        sb.append(qc7.toJson(this.f26092e));
        this.f26095m.setData(this.f26092e);
        ((C12966tb) this.binding).f84123a2.addOnScrollListener(new C4274g(linearSnapHelper2));
        ((C12966tb) this.binding).f84132m.setOnClickListener(new ViewOnClickListenerC4275h());
        ((C12966tb) this.binding).f84120Z.setOnClickListener(new ViewOnClickListenerC4276i());
        ((C12966tb) this.binding).f84126c.setOnClickListener(new ViewOnClickListenerC4277j());
        ((C12966tb) this.binding).f84131f.setOnClickListener(new ViewOnClickListenerC4278k());
        ((C12966tb) this.binding).f84111H.setOnClickListener(new ViewOnClickListenerC4279l());
        ((C12966tb) this.binding).f84110F.setOnClickListener(new ViewOnClickListenerC4280m());
        ((C12966tb) this.binding).f84109C.setOnClickListener(new ViewOnClickListenerC4281n());
        ((C12966tb) this.binding).f84116Q.setOnClickListener(new C4268a());
        ((C12966tb) this.binding).f84118X.setOnClickListener(new ViewOnClickListenerC4269b());
    }

    @Override // p000.avc.InterfaceC1620b
    public void loadFail() {
        showTransalteFail();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @hib Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 110 && i2 == -1 && intent != null) {
            try {
                showTranslateView();
                translatePhotoByInputStream(getContentResolver().openInputStream(intent.getData()), getRotate(getContentResolver().openInputStream(intent.getData())));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f26093e2 = false;
    }

    @Override // p000.avc.InterfaceC1620b
    public void onDisposable(mf4 mf4Var) {
        this.f26074L = mf4Var;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        releaseCamera();
        if (isFinishing()) {
            C2478k.getCachedPool().execute(new Runnable() { // from class: xuc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f99419a.lambda$onPause$0();
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initLanguage();
        setCamera();
    }

    @Override // p000.avc.InterfaceC1620b
    public void setDataSuccess(PhotoTransBean photoTransBean, boolean z) {
        if (photoTransBean == null || TextUtils.isEmpty(photoTransBean.translateImg)) {
            showTransalteFail();
            return;
        }
        byte[] bArrDecode = Base64.decode(photoTransBean.translateImg, 0);
        try {
            this.f26076M1 = us7.saveImage(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length), getoutputPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
        loadImage(this.f26076M1, null);
        showTranslateSuccess();
    }
}
