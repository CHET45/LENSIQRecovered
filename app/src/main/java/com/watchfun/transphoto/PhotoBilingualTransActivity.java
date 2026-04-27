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
import p000.C12502sb;
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
public class PhotoBilingualTransActivity extends BaseActivity<C12502sb> implements avc.InterfaceC1620b {

    /* JADX INFO: renamed from: g2 */
    public static final /* synthetic */ boolean f26026g2 = false;

    /* JADX INFO: renamed from: C */
    public long f26027C;

    /* JADX INFO: renamed from: F */
    public boolean f26028F;

    /* JADX INFO: renamed from: H */
    public AnimationDrawable f26029H;

    /* JADX INFO: renamed from: L */
    public mf4 f26030L;

    /* JADX INFO: renamed from: M */
    public bvc f26031M;

    /* JADX INFO: renamed from: M1 */
    public File f26032M1;

    /* JADX INFO: renamed from: N */
    public TransLanguageData f26033N;

    /* JADX INFO: renamed from: Q */
    public TransLanguageData f26034Q;

    /* JADX INFO: renamed from: V1 */
    public String f26035V1;

    /* JADX INFO: renamed from: Y */
    public String f26037Y;

    /* JADX INFO: renamed from: Z */
    public File f26038Z;

    /* JADX INFO: renamed from: Z1 */
    public boolean f26039Z1;

    /* JADX INFO: renamed from: a */
    public SurfaceView f26040a;

    /* JADX INFO: renamed from: b */
    public mp1 f26042b;

    /* JADX INFO: renamed from: b2 */
    public boolean f26043b2;

    /* JADX INFO: renamed from: c2 */
    public PermissionExplanationDialog f26045c2;

    /* JADX INFO: renamed from: d */
    public List<TransLanguageData> f26046d;

    /* JADX INFO: renamed from: d2 */
    public boolean f26047d2;

    /* JADX INFO: renamed from: e */
    public List<TransLanguageData> f26048e;

    /* JADX INFO: renamed from: f */
    public ntc f26050f;

    /* JADX INFO: renamed from: f2 */
    public PhotoTransBean f26051f2;

    /* JADX INFO: renamed from: m */
    public ntc f26052m;

    /* JADX INFO: renamed from: c */
    public final int f26044c = 110;

    /* JADX INFO: renamed from: X */
    public boolean f26036X = false;

    /* JADX INFO: renamed from: a2 */
    public boolean f26041a2 = false;

    /* JADX INFO: renamed from: e2 */
    public boolean f26049e2 = false;

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoBilingualTransActivity$a */
    public class C4253a implements TouchImageView.InterfaceC4285c {
        public C4253a() {
        }

        @Override // com.watchfun.transphoto.widget.TouchImageView.InterfaceC4285c
        public void onClick() {
            if (PhotoBilingualTransActivity.this.isFinishing()) {
                return;
            }
            if ((PhotoBilingualTransActivity.this.f26029H == null || !PhotoBilingualTransActivity.this.f26029H.isRunning()) && xt5.isFileExists(PhotoBilingualTransActivity.this.f26038Z) && xt5.isFileExists(PhotoBilingualTransActivity.this.f26032M1)) {
                if (PhotoBilingualTransActivity.this.f26039Z1) {
                    PhotoBilingualTransActivity photoBilingualTransActivity = PhotoBilingualTransActivity.this;
                    photoBilingualTransActivity.loadImage(photoBilingualTransActivity.f26038Z, ((C12502sb) ((BaseActivity) PhotoBilingualTransActivity.this).binding).f81086X.getDrawable());
                    PhotoBilingualTransActivity photoBilingualTransActivity2 = PhotoBilingualTransActivity.this;
                    photoBilingualTransActivity2.showCustomToast(photoBilingualTransActivity2.getString(C4201R.string.string_switch_translate), true);
                    PhotoBilingualTransActivity.this.f26039Z1 = false;
                    return;
                }
                PhotoBilingualTransActivity photoBilingualTransActivity3 = PhotoBilingualTransActivity.this;
                photoBilingualTransActivity3.loadImage(photoBilingualTransActivity3.f26032M1, ((C12502sb) ((BaseActivity) PhotoBilingualTransActivity.this).binding).f81086X.getDrawable());
                PhotoBilingualTransActivity photoBilingualTransActivity4 = PhotoBilingualTransActivity.this;
                photoBilingualTransActivity4.showCustomToast(photoBilingualTransActivity4.getString(C4201R.string.string_switch_origin), true);
                PhotoBilingualTransActivity.this.f26039Z1 = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoBilingualTransActivity$b */
    public class ViewOnClickListenerC4254b implements View.OnClickListener {
        public ViewOnClickListenerC4254b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PhotoBilingualTransActivity.this.f26051f2 = null;
            ((C12502sb) ((BaseActivity) PhotoBilingualTransActivity.this).binding).f81078F.setVisibility(8);
            PhotoBilingualTransActivity.this.showTakePhotoView();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoBilingualTransActivity$c */
    public class ViewOnClickListenerC4255c implements View.OnClickListener {
        public ViewOnClickListenerC4255c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PhotoBilingualTransActivity.this.f26051f2 == null || PhotoBilingualTransActivity.this.f26051f2.getOriginalText().isEmpty() || PhotoBilingualTransActivity.this.f26051f2.getTranslateText().isEmpty()) {
                return;
            }
            Intent intent = new Intent(PhotoBilingualTransActivity.this, (Class<?>) BilingualTransActivity.class);
            intent.putExtra(BilingualTransActivity.f26018d, PhotoBilingualTransActivity.this.f26051f2.getOriginalText());
            intent.putExtra(BilingualTransActivity.f26019e, PhotoBilingualTransActivity.this.f26051f2.getTranslateText());
            PhotoBilingualTransActivity.this.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoBilingualTransActivity$d */
    public class C4256d implements C2475h.b {
        public C4256d() {
        }

        @Override // com.blankj.utilcode.util.C2475h.b
        public void onDenied(@efb List<String> list, @efb List<String> list2) {
            if (list.size() > 0) {
                l3h.showToastShort(PhotoBilingualTransActivity.this.getString(C4201R.string.permission_system_set));
            }
        }

        @Override // com.blankj.utilcode.util.C2475h.b
        public void onGranted(@efb List<String> list) {
            PhotoBilingualTransActivity.this.setCamera();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoBilingualTransActivity$e */
    public class C4257e implements mp1.InterfaceC9446i {
        public C4257e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$0() {
            PhotoBilingualTransActivity.this.showTakePhotoView();
        }

        @Override // p000.mp1.InterfaceC9446i
        public void getPhotoFile(String str) {
            PhotoBilingualTransActivity.this.f26047d2 = false;
            PhotoBilingualTransActivity.this.translatePhotoByPath(str);
        }

        @Override // p000.mp1.InterfaceC9446i
        public void getVideoFile(String str) {
        }

        @Override // p000.mp1.InterfaceC9446i
        public void onError() {
            PhotoBilingualTransActivity.this.runOnUiThread(new Runnable() { // from class: ktc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55313a.lambda$onError$0();
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

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoBilingualTransActivity$f */
    public class C4258f implements PermissionExplanationDialog.OnClickListListener {
        public C4258f() {
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onOk() {
            PhotoBilingualTransActivity.this.initCamera();
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onRefuse() {
            PhotoBilingualTransActivity photoBilingualTransActivity = PhotoBilingualTransActivity.this;
            photoBilingualTransActivity.showCustomToast(photoBilingualTransActivity.getString(C4201R.string.permission_tip5), false);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoBilingualTransActivity$g */
    public class C4259g extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LinearSnapHelper f26059a;

        public C4259g(LinearSnapHelper linearSnapHelper) {
            this.f26059a = linearSnapHelper;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@efb RecyclerView recyclerView, int i) {
            View viewFindSnapView;
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0 || recyclerView.getChildCount() <= 0 || (viewFindSnapView = this.f26059a.findSnapView(((C12502sb) ((BaseActivity) PhotoBilingualTransActivity.this).binding).f81091a2.getLayoutManager())) == null) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindSnapView);
            PhotoBilingualTransActivity.this.f26050f.setSelectPos(childAdapterPosition);
            PhotoBilingualTransActivity photoBilingualTransActivity = PhotoBilingualTransActivity.this;
            photoBilingualTransActivity.f26034Q = photoBilingualTransActivity.f26050f.getLanguages().get(childAdapterPosition);
            TextView textView = ((C12502sb) ((BaseActivity) PhotoBilingualTransActivity.this).binding).f81099e2;
            PhotoBilingualTransActivity photoBilingualTransActivity2 = PhotoBilingualTransActivity.this;
            textView.setText(AiLangUtil.getValue(photoBilingualTransActivity2, photoBilingualTransActivity2.f26034Q.getKeyName()));
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoBilingualTransActivity$h */
    public class C4260h extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LinearSnapHelper f26061a;

        public C4260h(LinearSnapHelper linearSnapHelper) {
            this.f26061a = linearSnapHelper;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@efb RecyclerView recyclerView, int i) {
            View viewFindSnapView;
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0 || recyclerView.getChildCount() <= 0 || (viewFindSnapView = this.f26061a.findSnapView(((C12502sb) ((BaseActivity) PhotoBilingualTransActivity.this).binding).f81093b2.getLayoutManager())) == null) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindSnapView);
            PhotoBilingualTransActivity.this.f26052m.setSelectPos(childAdapterPosition);
            PhotoBilingualTransActivity photoBilingualTransActivity = PhotoBilingualTransActivity.this;
            photoBilingualTransActivity.f26033N = photoBilingualTransActivity.f26052m.getLanguages().get(childAdapterPosition);
            StringBuilder sb = new StringBuilder();
            sb.append("onScrollStateChanged: fromLanguageData ");
            sb.append(qc7.toJson(PhotoBilingualTransActivity.this.f26033N));
            TextView textView = ((C12502sb) ((BaseActivity) PhotoBilingualTransActivity.this).binding).f81097d2;
            PhotoBilingualTransActivity photoBilingualTransActivity2 = PhotoBilingualTransActivity.this;
            textView.setText(AiLangUtil.getValue(photoBilingualTransActivity2, photoBilingualTransActivity2.f26033N.getKeyName()));
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoBilingualTransActivity$i */
    public class ViewOnClickListenerC4261i implements View.OnClickListener {
        public ViewOnClickListenerC4261i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PhotoBilingualTransActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoBilingualTransActivity$j */
    public class ViewOnClickListenerC4262j implements View.OnClickListener {
        public ViewOnClickListenerC4262j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (System.currentTimeMillis() - PhotoBilingualTransActivity.this.f26027C < 1000) {
                return;
            }
            PhotoBilingualTransActivity.this.f26027C = System.currentTimeMillis();
            if (PhotoBilingualTransActivity.this.checkPermissionToInit()) {
                PhotoBilingualTransActivity.this.showTranslateView();
                PhotoBilingualTransActivity.this.f26042b.takePicture(90, false);
                PhotoBilingualTransActivity.this.f26028F = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoBilingualTransActivity$k */
    public class ViewOnClickListenerC4263k implements View.OnClickListener {
        public ViewOnClickListenerC4263k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PhotoBilingualTransActivity.this.controlSelectLanguageView();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoBilingualTransActivity$l */
    public class ViewOnClickListenerC4264l implements View.OnClickListener {
        public ViewOnClickListenerC4264l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PhotoBilingualTransActivity.this.controlSelectLanguageView();
            if (PhotoBilingualTransActivity.this.f26036X) {
                if (!TextUtils.isEmpty(PhotoBilingualTransActivity.this.f26035V1)) {
                    PhotoBilingualTransActivity photoBilingualTransActivity = PhotoBilingualTransActivity.this;
                    photoBilingualTransActivity.translatePhotoByPath(photoBilingualTransActivity.f26035V1);
                }
                if (xt5.isFileExists(PhotoBilingualTransActivity.this.f26038Z)) {
                    PhotoBilingualTransActivity photoBilingualTransActivity2 = PhotoBilingualTransActivity.this;
                    photoBilingualTransActivity2.loadImage(photoBilingualTransActivity2.f26038Z, null);
                }
                PhotoBilingualTransActivity.this.showTranslateView();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoBilingualTransActivity$m */
    public class ViewOnClickListenerC4265m implements View.OnClickListener {
        public ViewOnClickListenerC4265m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PhotoBilingualTransActivity.this.controlSelectLanguageView();
            if (PhotoBilingualTransActivity.this.f26036X) {
                if (!TextUtils.isEmpty(PhotoBilingualTransActivity.this.f26035V1)) {
                    PhotoBilingualTransActivity photoBilingualTransActivity = PhotoBilingualTransActivity.this;
                    photoBilingualTransActivity.translatePhotoByPath(photoBilingualTransActivity.f26035V1);
                }
                if (xt5.isFileExists(PhotoBilingualTransActivity.this.f26038Z)) {
                    PhotoBilingualTransActivity photoBilingualTransActivity2 = PhotoBilingualTransActivity.this;
                    photoBilingualTransActivity2.loadImage(photoBilingualTransActivity2.f26038Z, null);
                }
                PhotoBilingualTransActivity.this.showTranslateView();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoBilingualTransActivity$n */
    public class ViewOnClickListenerC4266n implements View.OnClickListener {
        public ViewOnClickListenerC4266n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (System.currentTimeMillis() - PhotoBilingualTransActivity.this.f26027C < 1000) {
                return;
            }
            PhotoBilingualTransActivity.this.f26027C = System.currentTimeMillis();
            PhotoBilingualTransActivity.this.showTakePhotoView();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.PhotoBilingualTransActivity$o */
    public class ViewOnClickListenerC4267o implements View.OnClickListener {
        public ViewOnClickListenerC4267o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PhotoBilingualTransActivity.this.openGallery();
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
        boolean z = this.f26041a2;
        this.f26041a2 = !z;
        if (z) {
            hideSelectLanguageView();
        } else {
            showSelectLanguageView();
        }
    }

    private void dismissPermissionExplanationDialog() {
        PermissionExplanationDialog permissionExplanationDialog = this.f26045c2;
        if (permissionExplanationDialog != null) {
            if (permissionExplanationDialog.isShowing()) {
                this.f26045c2.dismiss();
            }
            this.f26045c2 = null;
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
        ((C12502sb) this.binding).f81080L.setVisibility(8);
        ((C12502sb) this.binding).f81087Y.setVisibility(8);
        ((C12502sb) this.binding).f81082M1.setVisibility(0);
        ((C12502sb) this.binding).f81077C.setVisibility(0);
        ((C12502sb) this.binding).f81094c.setVisibility(0);
        ((C12502sb) this.binding).f81100f.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initCamera() {
        C2475h.permission(xnc.f98581F).callback(new C4256d()).request();
    }

    private void initLanguage() {
        if (this.f26049e2) {
            return;
        }
        ((C12502sb) this.binding).f81097d2.setText(C4201R.string.string_auto);
        TransLanguageData transLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString("language_photo_from"));
        this.f26033N = transLanguageData;
        if (transLanguageData != null) {
            ((C12502sb) this.binding).f81097d2.setText(AiLangUtil.getValue(this, transLanguageData.getKeyName()));
        } else {
            this.f26033N = new TransLanguageData();
            LangLau langLau = new LangLau();
            langLau.setEn("Auto");
            langLau.setZh("自动检测");
            this.f26033N.setTransId(33);
            this.f26033N.setDefaultName("Auto");
            this.f26033N.setSelect(true);
            this.f26033N.setVoiceName("catherine");
            this.f26033N.setIatLanguage("auto");
            this.f26033N.setLangKey("auto");
            this.f26033N.setKeyName("string_auto");
            this.f26033N.setUseMicTTS(true);
            ((C12502sb) this.binding).f81097d2.setText(C4201R.string.string_auto);
            vfe.getInstance().putString("language_photo_from", TransLanguageData.toJson(this.f26033N));
        }
        ((C12502sb) this.binding).f81097d2.setText(AiLangUtil.getValue(this, this.f26033N.getKeyName()));
        this.f26052m.setData(this.f26048e);
        int iFindPosition = findPosition(this.f26048e, this.f26033N.getIatLanguage());
        this.f26052m.setSelectPos(iFindPosition);
        ((C12502sb) this.binding).f81093b2.smoothScrollToPosition(iFindPosition);
        TransLanguageData transLanguageData2 = AppUtils.getTransLanguageData(vfe.getInstance().getString("language_photo"));
        this.f26034Q = transLanguageData2;
        if (transLanguageData2 != null) {
            ((C12502sb) this.binding).f81099e2.setText(AiLangUtil.getValue(this, transLanguageData2.getKeyName()));
        } else {
            this.f26034Q = new TransLanguageData();
            LangLau langLau2 = new LangLau();
            langLau2.setEn("English");
            langLau2.setZh("英语");
            this.f26034Q.setTransId(2);
            this.f26034Q.setDefaultName("English");
            this.f26034Q.setSelect(true);
            this.f26034Q.setVoiceName("catherine");
            this.f26034Q.setIatLanguage(ufh.f87916c);
            this.f26034Q.setLangKey(ufh.f87916c);
            this.f26034Q.setKeyName("en_name");
            this.f26034Q.setUseMicTTS(true);
            ((C12502sb) this.binding).f81099e2.setText(C4201R.string.ai_trans_en);
            vfe.getInstance().putString("language_photo", TransLanguageData.toJson(this.f26034Q));
        }
        this.f26050f.setData(this.f26046d);
        int iFindPosition2 = findPosition(this.f26046d, this.f26034Q.getIatLanguage());
        this.f26050f.setSelectPos(iFindPosition2);
        ((C12502sb) this.binding).f81091a2.scrollToPosition(iFindPosition2 - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPause$0() {
        xt5.deleteAllInDir(getExternalFilesDir(Environment.DIRECTORY_PICTURES));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translatePhotoByInputStream$2() {
        File fileCompressImage = us7.compressImage(this.f26038Z);
        this.f26035V1 = fileCompressImage.getAbsolutePath();
        this.f26031M.loadData(fileCompressImage.getAbsolutePath(), this.f26033N.getIatLanguage(), this.f26034Q.getIatLanguage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translatePhotoByPath$1(String str) {
        File fileCompressImage = us7.compressImage(new File(str));
        this.f26035V1 = fileCompressImage.getAbsolutePath();
        this.f26031M.loadData(fileCompressImage.getAbsolutePath(), this.f26033N.getIatLanguage(), this.f26034Q.getIatLanguage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadImage(File file, Drawable drawable) {
        if (this.f26047d2) {
            if (drawable != null) {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).load(file).placeholder(drawable).into(((C12502sb) this.binding).f81086X);
                return;
            } else {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).load(file).into(((C12502sb) this.binding).f81086X);
                return;
            }
        }
        if (drawable != null) {
            ComponentCallbacks2C2485a.with((FragmentActivity) this).load(file).placeholder(drawable).apply((cu0<?>) new RequestOptions().transform(new u16())).into(((C12502sb) this.binding).f81086X);
        } else {
            ComponentCallbacks2C2485a.with((FragmentActivity) this).load(file).apply((cu0<?>) new RequestOptions().transform(new u16())).into(((C12502sb) this.binding).f81086X);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openGallery() {
        this.f26049e2 = true;
        Intent intent = new Intent("android.intent.action.PICK", (Uri) null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(intent, 110);
    }

    private void releaseCamera() {
        mp1 mp1Var = this.f26042b;
        if (mp1Var != null) {
            mp1Var.releaseCamera();
        }
        SurfaceView surfaceView = this.f26040a;
        if (surfaceView != null) {
            ((C12502sb) this.binding).f81096d.removeView(surfaceView);
            this.f26040a = null;
        }
        this.f26043b2 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCamera() {
        if (lx2.checkSelfPermission(this, xnc.f98581F) == 0 && !this.f26043b2) {
            this.f26040a = new SurfaceView(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            this.f26043b2 = true;
            ((C12502sb) this.binding).f81096d.addView(this.f26040a, 0, layoutParams);
            mp1 mp1Var = new mp1(this, this.f26040a);
            this.f26042b = mp1Var;
            mp1Var.setCameraCallBack(new C4257e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCustomToast(String str, boolean z) {
        l3h.showToastShort(str);
    }

    private void showPermissionExplanationDialog() {
        dismissPermissionExplanationDialog();
        if (this.f26045c2 == null) {
            this.f26045c2 = new PermissionExplanationDialog(this, new C4258f());
        }
        this.f26045c2.setTipContent(getString(C4201R.string.string_camera_permission));
        if (this.f26045c2.isShowing()) {
            return;
        }
        this.f26045c2.show();
    }

    private void showSelectLanguageView() {
        ((C12502sb) this.binding).f81080L.setVisibility(0);
        ((C12502sb) this.binding).f81087Y.setVisibility(8);
        ((C12502sb) this.binding).f81082M1.setVisibility(8);
        ((C12502sb) this.binding).f81077C.setVisibility(8);
        ((C12502sb) this.binding).f81094c.setVisibility(8);
        ((C12502sb) this.binding).f81100f.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTakePhotoView() {
        ((C12502sb) this.binding).f81082M1.setVisibility(0);
        ((C12502sb) this.binding).f81077C.setVisibility(0);
        ((C12502sb) this.binding).f81080L.setVisibility(8);
        ((C12502sb) this.binding).f81079H.setVisibility(8);
        ((C12502sb) this.binding).f81087Y.setVisibility(8);
        ((C12502sb) this.binding).f81086X.setVisibility(8);
        ((C12502sb) this.binding).f81094c.setVisibility(0);
        ((C12502sb) this.binding).f81100f.setVisibility(8);
        ((C12502sb) this.binding).f81088Z.setVisibility(8);
        ((C12502sb) this.binding).f81098e.setVisibility(0);
        ((C12502sb) this.binding).f81086X.setImageBitmap(null);
        ((C12502sb) this.binding).f81086X.setBackgroundColor(0);
        ((C12502sb) this.binding).f81086X.resetToDefault();
        this.f26036X = false;
        xt5.delete(this.f26037Y);
        mp1 mp1Var = this.f26042b;
        if (mp1Var != null && this.f26028F) {
            mp1Var.startPreview();
            this.f26028F = false;
        }
        AnimationDrawable animationDrawable = this.f26029H;
        if (animationDrawable != null && animationDrawable.isRunning()) {
            this.f26029H.stop();
        }
        mf4 mf4Var = this.f26030L;
        if (mf4Var != null) {
            mf4Var.dispose();
        }
    }

    private void showTransalteFail() {
        ((C12502sb) this.binding).f81094c.setVisibility(0);
        ((C12502sb) this.binding).f81087Y.setVisibility(0);
        ((C12502sb) this.binding).f81079H.setVisibility(8);
        ((C12502sb) this.binding).f81088Z.setVisibility(8);
        AnimationDrawable animationDrawable = this.f26029H;
        if (animationDrawable != null && animationDrawable.isRunning()) {
            this.f26029H.stop();
        }
        this.f26032M1 = null;
        this.f26036X = true;
        if (NetworkUtils.isConnected()) {
            showCustomToast(getString(C4201R.string.string_translate_fail), false);
        } else {
            showCustomToast(getString(C4201R.string.string_translate_fail_net), false);
        }
    }

    private void showTranslateSuccess() {
        ((C12502sb) this.binding).f81077C.setVisibility(8);
        ((C12502sb) this.binding).f81080L.setVisibility(8);
        ((C12502sb) this.binding).f81079H.setVisibility(8);
        ((C12502sb) this.binding).f81086X.setVisibility(0);
        ((C12502sb) this.binding).f81088Z.setVisibility(8);
        ((C12502sb) this.binding).f81087Y.setVisibility(0);
        ((C12502sb) this.binding).f81082M1.setVisibility(8);
        ((C12502sb) this.binding).f81094c.setVisibility(0);
        ((C12502sb) this.binding).f81100f.setVisibility(8);
        ((C12502sb) this.binding).f81098e.setVisibility(8);
        showCustomToast(getString(C4201R.string.string_switch_origin), true);
        AnimationDrawable animationDrawable = this.f26029H;
        if (animationDrawable != null && animationDrawable.isRunning()) {
            this.f26029H.stop();
        }
        this.f26039Z1 = true;
        this.f26036X = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTranslateView() {
        ((C12502sb) this.binding).f81079H.setVisibility(0);
        ((C12502sb) this.binding).f81088Z.setVisibility(0);
        ((C12502sb) this.binding).f81086X.setVisibility(0);
        ((C12502sb) this.binding).f81077C.setVisibility(8);
        ((C12502sb) this.binding).f81082M1.setVisibility(8);
        ((C12502sb) this.binding).f81094c.setVisibility(8);
        ((C12502sb) this.binding).f81100f.setVisibility(8);
        ((C12502sb) this.binding).f81098e.setVisibility(8);
        ((C12502sb) this.binding).f81086X.resetToDefault();
        if (this.f26029H == null) {
            this.f26029H = (AnimationDrawable) ((C12502sb) this.binding).f81088Z.getDrawable();
        }
        this.f26029H.start();
        this.f26028F = true;
    }

    private void translatePhotoByInputStream(InputStream inputStream, int i) {
        this.f26047d2 = true;
        byte[] bArrInputStream2ByteArr = us7.inputStream2ByteArr(inputStream);
        try {
            this.f26038Z = us7.saveImage(us7.rotateBitmap(BitmapFactory.decodeByteArray(bArrInputStream2ByteArr, 0, bArrInputStream2ByteArr.length), i), getoutputPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
        C2478k.getCachedPool().execute(new Runnable() { // from class: htc
            @Override // java.lang.Runnable
            public final void run() {
                this.f44845a.lambda$translatePhotoByInputStream$2();
            }
        });
        ((C12502sb) this.binding).f81086X.setBackgroundColor(-16777216);
        loadImage(this.f26038Z, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void translatePhotoByPath(final String str) {
        this.f26038Z = xt5.getFileByPath(str);
        this.f26037Y = str;
        C2478k.getCachedPool().execute(new Runnable() { // from class: jtc
            @Override // java.lang.Runnable
            public final void run() {
                this.f51811a.lambda$translatePhotoByPath$1(str);
            }
        });
        loadImage(xt5.getFileByPath(str), null);
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public C12502sb getViewBinding() {
        return C12502sb.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        yp0.setNavBarColor(this, -16777216);
        checkPermissionToInit();
        this.f26031M = new bvc(this);
        ntc ntcVar = new ntc(this);
        this.f26050f = ntcVar;
        ((C12502sb) this.binding).f81091a2.setAdapter(ntcVar);
        ((C12502sb) this.binding).f81091a2.setLayoutManager(new LinearLayoutManager(this, 1, false));
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        linearSnapHelper.attachToRecyclerView(((C12502sb) this.binding).f81091a2);
        List<TransLanguageData> languagePhotoData = AiLangUtil.parseLanguagePhotoData(this);
        this.f26046d = languagePhotoData;
        this.f26050f.setData(languagePhotoData);
        ((C12502sb) this.binding).f81091a2.addOnScrollListener(new C4259g(linearSnapHelper));
        ntc ntcVar2 = new ntc(this);
        this.f26052m = ntcVar2;
        ((C12502sb) this.binding).f81093b2.setAdapter(ntcVar2);
        ((C12502sb) this.binding).f81093b2.setLayoutManager(new LinearLayoutManager(this, 1, false));
        LinearSnapHelper linearSnapHelper2 = new LinearSnapHelper();
        linearSnapHelper2.attachToRecyclerView(((C12502sb) this.binding).f81093b2);
        this.f26048e = AiLangUtil.parseLanguagePhotoLeftData(this);
        StringBuilder sb = new StringBuilder();
        sb.append("onScrollStateChanged: leftLanguageDatas ");
        sb.append(qc7.toJson(this.f26048e));
        this.f26052m.setData(this.f26048e);
        ((C12502sb) this.binding).f81093b2.addOnScrollListener(new C4260h(linearSnapHelper2));
        ((C12502sb) this.binding).f81101m.setOnClickListener(new ViewOnClickListenerC4261i());
        ((C12502sb) this.binding).f81082M1.setOnClickListener(new ViewOnClickListenerC4262j());
        ((C12502sb) this.binding).f81094c.setOnClickListener(new ViewOnClickListenerC4263k());
        ((C12502sb) this.binding).f81100f.setOnClickListener(new ViewOnClickListenerC4264l());
        ((C12502sb) this.binding).f81080L.setOnClickListener(new ViewOnClickListenerC4265m());
        ((C12502sb) this.binding).f81079H.setOnClickListener(new ViewOnClickListenerC4266n());
        ((C12502sb) this.binding).f81077C.setOnClickListener(new ViewOnClickListenerC4267o());
        ((C12502sb) this.binding).f81086X.setOnClickListener(new C4253a());
        ((C12502sb) this.binding).f81087Y.setOnClickListener(new ViewOnClickListenerC4254b());
        ((C12502sb) this.binding).f81078F.setOnClickListener(new ViewOnClickListenerC4255c());
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
        this.f26049e2 = false;
    }

    @Override // p000.avc.InterfaceC1620b
    public void onDisposable(mf4 mf4Var) {
        this.f26030L = mf4Var;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        releaseCamera();
        if (isFinishing()) {
            C2478k.getCachedPool().execute(new Runnable() { // from class: itc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48254a.lambda$onPause$0();
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
            this.f26051f2 = null;
            ((C12502sb) this.binding).f81078F.setVisibility(8);
            return;
        }
        byte[] bArrDecode = Base64.decode(photoTransBean.translateImg, 0);
        try {
            this.f26032M1 = us7.saveImage(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length), getoutputPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
        loadImage(this.f26032M1, null);
        showTranslateSuccess();
        this.f26051f2 = photoTransBean;
        ((C12502sb) this.binding).f81078F.setVisibility(0);
    }
}
