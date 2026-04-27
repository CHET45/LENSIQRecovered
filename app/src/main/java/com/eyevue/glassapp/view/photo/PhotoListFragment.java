package com.eyevue.glassapp.view.photo;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1137f0;
import androidx.recyclerview.widget.GridLayoutManager;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2475h;
import com.blankj.utilcode.util.C2478k;
import com.blankj.utilcode.util.ToastUtils;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.EyevueApplication;
import com.eyevue.glassapp.bluetooth.manager.ModBleResponse;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.bluetooth.protocol.Command;
import com.eyevue.glassapp.dialogs.WaitingDialog;
import com.eyevue.glassapp.location.LocationManager;
import com.eyevue.glassapp.utils.PermissionUtil;
import com.eyevue.glassapp.utils.photo.BatchOperationUtil;
import com.eyevue.glassapp.utils.photo.FileOperationCallback;
import com.eyevue.glassapp.utils.photo.FileUtils;
import com.eyevue.glassapp.utils.photo.ImageUpScale2Util;
import com.eyevue.glassapp.utils.photo.ImageUpScaleUtil;
import com.eyevue.glassapp.utils.photo.KtImageUtils;
import com.eyevue.glassapp.utils.photo.PermissionUtils;
import com.eyevue.glassapp.utils.photo.StyleFilterUtil;
import com.eyevue.glassapp.utils.photo.VideoStabilizerUtil;
import com.eyevue.glassapp.view.photo.PhotoListFragment;
import com.watchfun.base.BaseFragment;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p000.C6378gm;
import p000.C6908hm;
import p000.C7330im;
import p000.C7973jm;
import p000.bth;
import p000.e87;
import p000.efb;
import p000.gtc;
import p000.hfa;
import p000.i91;
import p000.ivc;
import p000.ltc;
import p000.lx2;
import p000.m3h;
import p000.mtc;
import p000.pb9;
import p000.pj4;
import p000.pu6;
import p000.qq9;
import p000.qxb;
import p000.qy6;
import p000.scc;
import p000.td9;
import p000.u77;
import p000.vfe;
import p000.wl7;
import p000.xcg;
import p000.xnc;
import p000.yv7;
import p000.zgb;

/* JADX INFO: loaded from: classes4.dex */
public class PhotoListFragment extends BaseFragment<pu6> {

    /* JADX INFO: renamed from: e2 */
    public static final String f18908e2 = "PhotoListFragment";

    /* JADX INFO: renamed from: C */
    public int f18909C;

    /* JADX INFO: renamed from: H */
    public ImageUpScale2Util f18911H;

    /* JADX INFO: renamed from: L */
    public ImageUpScaleUtil f18912L;

    /* JADX INFO: renamed from: M */
    public VideoStabilizerUtil f18913M;

    /* JADX INFO: renamed from: V1 */
    public WaitingDialog f18917V1;

    /* JADX INFO: renamed from: Z1 */
    public StyleFilterUtil f18921Z1;

    /* JADX INFO: renamed from: b */
    public gtc f18924b;

    /* JADX INFO: renamed from: c */
    public ivc f18926c;

    /* JADX INFO: renamed from: d */
    public long f18928d;

    /* JADX INFO: renamed from: e */
    public td9 f18930e;

    /* JADX INFO: renamed from: f */
    public WifiManager f18931f;

    /* JADX INFO: renamed from: m */
    public e87 f18932m;

    /* JADX INFO: renamed from: a */
    public final Handler f18922a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: F */
    public int f18910F = 0;

    /* JADX INFO: renamed from: N */
    public CopyOnWriteArrayList<Uri> f18915N = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: Q */
    public boolean f18916Q = false;

    /* JADX INFO: renamed from: X */
    public CopyOnWriteArrayList<Uri> f18918X = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: Y */
    public boolean f18919Y = false;

    /* JADX INFO: renamed from: Z */
    public boolean f18920Z = false;

    /* JADX INFO: renamed from: M1 */
    public boolean f18914M1 = false;

    /* JADX INFO: renamed from: a2 */
    public final xcg<C6908hm> f18923a2 = new xcg() { // from class: qtc
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f75740a.lambda$new$10((C6908hm) obj);
        }
    };

    /* JADX INFO: renamed from: b2 */
    public final xcg<C7973jm> f18925b2 = new xcg() { // from class: rtc
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f79555a.lambda$new$11((C7973jm) obj);
        }
    };

    /* JADX INFO: renamed from: c2 */
    public final xcg<hfa> f18927c2 = new xcg() { // from class: stc
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f82847a.lambda$new$12((hfa) obj);
        }
    };

    /* JADX INFO: renamed from: d2 */
    public final xcg<i91> f18929d2 = new xcg() { // from class: ttc
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f85902a.lambda$new$13((i91) obj);
        }
    };

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$a */
    public class ViewOnClickListenerC2841a implements View.OnClickListener {
        public ViewOnClickListenerC2841a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            PhotoListFragment.this.showTypeView(0);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$b */
    public class ViewOnClickListenerC2842b implements View.OnClickListener {
        public ViewOnClickListenerC2842b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            PhotoListFragment.this.showTypeView(1);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$c */
    public class ViewOnClickListenerC2843c implements View.OnClickListener {
        public ViewOnClickListenerC2843c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            PhotoListFragment.this.showTypeView(2);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$d */
    public class ViewOnClickListenerC2844d implements View.OnClickListener {
        public ViewOnClickListenerC2844d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            PhotoListFragment.this.showTypeView(3);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$e */
    public class C2845e implements FileOperationCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f18937a;

        public C2845e(final boolean val$deleteAfterSave) {
            this.f18937a = val$deleteAfterSave;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onOperationComplete$0(int i, List list, boolean z) {
            if (i > 0) {
                ToastUtils.showShort(PhotoListFragment.this.getString(C2531R.string.string_download_success));
            }
            showMessages(PhotoListFragment.f18908e2, list);
            PhotoListFragment.this.f18926c.exitEditMode();
            if (z) {
                PhotoListFragment photoListFragment = PhotoListFragment.this;
                photoListFragment.reloadMedia(photoListFragment.f18910F);
            }
        }

        @Override // com.eyevue.glassapp.utils.photo.FileOperationCallback
        public void onOperationComplete(final int successCount, int totalCount, final List<String> messages) {
            Handler handler = PhotoListFragment.this.f18922a;
            final boolean z = this.f18937a;
            handler.post(new Runnable() { // from class: huc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44901a.lambda$onOperationComplete$0(successCount, messages, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$f */
    public class C2846f implements PermissionUtils.PermissionCallback {
        public C2846f() {
        }

        @Override // com.eyevue.glassapp.utils.photo.PermissionUtils.PermissionCallback
        public void onPermissionDenied() {
        }

        @Override // com.eyevue.glassapp.utils.photo.PermissionUtils.PermissionCallback
        public void onPermissionGranted() {
            PhotoListFragment.this.saveSelectedMedia(false);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$g */
    public class C2847g implements td9.InterfaceC12994a {
        public C2847g() {
        }

        @Override // p000.td9.InterfaceC12994a
        public void onOk() {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$h */
    public class C2848h implements C2475h.f {
        public C2848h() {
        }

        @Override // com.blankj.utilcode.util.C2475h.f
        public void onDenied() {
            C2473f.m4168e(PhotoListFragment.f18908e2, "有权限去:::onDeniedonDeniedonDenied");
            PhotoListFragment.this.dismissLocationDialog();
        }

        @Override // com.blankj.utilcode.util.C2475h.f
        public void onGranted() {
            C2473f.m4168e(PhotoListFragment.f18908e2, "有权限去:::onGranted");
            LocationManager.getInstance().startLocation();
            PhotoListFragment.this.dismissLocationDialog();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$i */
    public class C2849i implements qy6<Float, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Uri f18942a;

        public C2849i(final Uri val$uri) {
            this.f18942a = val$uri;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$invoke$0(Uri uri, Float f) {
            PhotoListFragment.this.f18924b.updatePhotoFilterProgress(uri.toString(), f);
        }

        @Override // p000.qy6
        public bth invoke(final Float aFloat) {
            Log.e("xtest", "图片降噪处理进度：" + aFloat + yv7.f103133a);
            Handler handler = PhotoListFragment.this.f18922a;
            final Uri uri = this.f18942a;
            handler.post(new Runnable() { // from class: guc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41213a.lambda$invoke$0(uri, aFloat);
                }
            });
            return null;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$j */
    public class C2850j implements qy6<ImageUpScaleUtil.ImageUpScaleResult, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Uri f18944a;

        /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$j$a */
        public class a implements qy6<scc<String, String>, bth> {
            public a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$invoke$0(Uri uri, scc sccVar) {
                PhotoListFragment photoListFragment = PhotoListFragment.this;
                photoListFragment.reloadMedia(photoListFragment.f18910F);
                mtc.f62107a.removeFilterPhotoListLiveData(uri);
                pb9.get("PHOTO_REFRESH").post(new Pair(uri.getPath(), (String) sccVar.getFirst()));
                PhotoListFragment.this.resetEditEnable();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$invoke$1() {
                m3h.showToastShort("已暂停处理,正在删除已被处理的文件并重新开始");
                FileUtils.deleteAllFilterFiles(PhotoListFragment.this.getContext());
                PhotoListFragment photoListFragment = PhotoListFragment.this;
                photoListFragment.reloadMedia(photoListFragment.f18910F);
                if (PhotoListFragment.this.f18917V1 != null) {
                    PhotoListFragment.this.f18917V1.dismiss();
                }
                PhotoListFragment.this.applyPhotoAndVideoFilter();
            }

            @Override // p000.qy6
            public bth invoke(final scc<String, String> stringStringPair) {
                Log.e("xtest", "图片降噪处理完成，当前地址：" + C2850j.this.f18944a.getPath() + ",用tostring是：" + C2850j.this.f18944a.toString());
                StringBuilder sb = new StringBuilder();
                sb.append("降噪处理完成之后的地址是：");
                sb.append(stringStringPair.getFirst());
                Log.e("xtest", sb.toString());
                PhotoListFragment.this.f18924b.removePhotoFilterProgressMap(C2850j.this.f18944a.toString());
                qq9.f75117a.putBoolean(stringStringPair.getSecond(), true);
                Handler handler = PhotoListFragment.this.f18922a;
                final Uri uri = C2850j.this.f18944a;
                handler.post(new Runnable() { // from class: kuc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f55371a.lambda$invoke$0(uri, stringStringPair);
                    }
                });
                if (!PhotoListFragment.this.f18920Z) {
                    PhotoListFragment.this.f18915N.remove(0);
                    PhotoListFragment.this.applyPhotoFilter();
                    return null;
                }
                PhotoListFragment.this.f18920Z = false;
                if (PhotoListFragment.this.f18912L != null) {
                    PhotoListFragment.this.f18912L.cancelRun();
                }
                if (PhotoListFragment.this.f18920Z || PhotoListFragment.this.f18914M1) {
                    return null;
                }
                PhotoListFragment.this.f18922a.post(new Runnable() { // from class: luc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f58828a.lambda$invoke$1();
                    }
                });
                return null;
            }
        }

        public C2850j(final Uri val$uri) {
            this.f18944a = val$uri;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$invoke$0(Uri uri) {
            mtc.f62107a.removeFilterPhotoListLiveData(uri);
            PhotoListFragment.this.resetEditEnable();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$invoke$1(Uri uri) {
            mtc.f62107a.removeFilterPhotoListLiveData(uri);
            PhotoListFragment.this.resetEditEnable();
        }

        @Override // p000.qy6
        public bth invoke(ImageUpScaleUtil.ImageUpScaleResult imageUpScaleResult) {
            if (imageUpScaleResult.getErrorCode() != 0) {
                Log.e("xtest", "图片降噪处理失败：" + imageUpScaleResult.getErrorMsg());
                Handler handler = PhotoListFragment.this.f18922a;
                final Uri uri = this.f18944a;
                handler.post(new Runnable() { // from class: juc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51962a.lambda$invoke$1(uri);
                    }
                });
            } else {
                if (!new File(this.f18944a.getPath()).exists()) {
                    Handler handler2 = PhotoListFragment.this.f18922a;
                    final Uri uri2 = this.f18944a;
                    handler2.post(new Runnable() { // from class: iuc
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f48509a.lambda$invoke$0(uri2);
                        }
                    });
                    PhotoListFragment.this.f18915N.remove(0);
                    PhotoListFragment.this.applyPhotoFilter();
                    return null;
                }
                KtImageUtils.INSTANCE.saveImageToMedia(PhotoListFragment.this.requireActivity(), this.f18944a, imageUpScaleResult.getBitmap(), new a());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$k */
    public class C2851k implements qy6<VideoStabilizerUtil.VideoStabilizerProgress, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Uri f18947a;

        public C2851k(final Uri val$uri) {
            this.f18947a = val$uri;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$invoke$0(VideoStabilizerUtil.VideoStabilizerProgress videoStabilizerProgress, Uri uri) {
            PhotoListFragment.this.f18924b.updatePhotoFilterProgress(uri.toString(), Float.valueOf((videoStabilizerProgress.getStage() * 25) + (videoStabilizerProgress.getProgress() / 4.0f)));
        }

        @Override // p000.qy6
        public bth invoke(final VideoStabilizerUtil.VideoStabilizerProgress videoStabilizerProgress) {
            Log.e("xtest", "视频防抖处理当前步骤：" + videoStabilizerProgress.getStage() + ",进度：" + videoStabilizerProgress.getProgress() + yv7.f103133a);
            Handler handler = PhotoListFragment.this.f18922a;
            final Uri uri = this.f18947a;
            handler.post(new Runnable() { // from class: muc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62243a.lambda$invoke$0(videoStabilizerProgress, uri);
                }
            });
            return null;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$l */
    public class C2852l implements qy6<VideoStabilizerUtil.VideoStabilizerResult, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Uri f18949a;

        public C2852l(final Uri val$uri) {
            this.f18949a = val$uri;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$invoke$0(Uri uri) {
            mtc.f62107a.removeFilterPhotoListLiveData(uri);
            PhotoListFragment.this.resetEditEnable();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$invoke$1(Uri uri, VideoStabilizerUtil.VideoStabilizerResult videoStabilizerResult) {
            PhotoListFragment photoListFragment = PhotoListFragment.this;
            photoListFragment.reloadMedia(photoListFragment.f18910F);
            mtc.f62107a.removeFilterPhotoListLiveData(uri);
            pb9.get("PHOTO_REFRESH").post(new Pair(uri.toString(), videoStabilizerResult.getStabilizerVideoPath()));
            PhotoListFragment.this.resetEditEnable();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$invoke$2() {
            m3h.showToastShort("已暂停处理,正在删除已被处理的文件");
            FileUtils.deleteAllFilterFiles(PhotoListFragment.this.getContext());
            PhotoListFragment photoListFragment = PhotoListFragment.this;
            photoListFragment.reloadMedia(photoListFragment.f18910F);
            if (PhotoListFragment.this.f18917V1 != null) {
                PhotoListFragment.this.f18917V1.dismiss();
            }
            PhotoListFragment.this.applyPhotoAndVideoFilter();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$invoke$3(Uri uri) {
            mtc.f62107a.removeFilterPhotoListLiveData(uri);
            PhotoListFragment.this.resetEditEnable();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$invoke$4() {
            m3h.showToastShort("已暂停处理,正在删除已被处理的文件");
            FileUtils.deleteAllFilterFiles(PhotoListFragment.this.getContext());
            PhotoListFragment photoListFragment = PhotoListFragment.this;
            photoListFragment.reloadMedia(photoListFragment.f18910F);
            if (PhotoListFragment.this.f18917V1 != null) {
                PhotoListFragment.this.f18917V1.dismiss();
            }
            PhotoListFragment.this.applyPhotoAndVideoFilter();
        }

        @Override // p000.qy6
        public bth invoke(final VideoStabilizerUtil.VideoStabilizerResult videoStabilizerResult) {
            PhotoListFragment.this.resetEditEnable();
            if (videoStabilizerResult.getErrorCode() == 0) {
                Log.e("xtest", "视频防抖处理完成，当前地址：" + this.f18949a.getPath() + ",用tostring是：" + this.f18949a.toString());
                StringBuilder sb = new StringBuilder();
                sb.append("视频防抖处理完成之后的地址是：");
                sb.append(videoStabilizerResult.getStabilizerVideoPath());
                Log.e("xtest", sb.toString());
                File file = new File(videoStabilizerResult.getStabilizerVideoPath());
                if (!new File(this.f18949a.getPath()).exists()) {
                    file.delete();
                    Handler handler = PhotoListFragment.this.f18922a;
                    final Uri uri = this.f18949a;
                    handler.post(new Runnable() { // from class: nuc
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f65720a.lambda$invoke$0(uri);
                        }
                    });
                    PhotoListFragment.this.f18918X.remove(0);
                    PhotoListFragment.this.applyVideoFilter();
                    return null;
                }
                qq9.f75117a.putBoolean(file.getName(), true);
                Handler handler2 = PhotoListFragment.this.f18922a;
                final Uri uri2 = this.f18949a;
                handler2.post(new Runnable() { // from class: ouc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f68839a.lambda$invoke$1(uri2, videoStabilizerResult);
                    }
                });
                if (PhotoListFragment.this.f18914M1) {
                    PhotoListFragment.this.f18914M1 = false;
                    if (PhotoListFragment.this.f18913M != null) {
                        PhotoListFragment.this.f18913M.cancelRun();
                    }
                    if (!PhotoListFragment.this.f18920Z && !PhotoListFragment.this.f18914M1) {
                        PhotoListFragment.this.f18922a.post(new Runnable() { // from class: puc
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f72134a.lambda$invoke$2();
                            }
                        });
                    }
                } else {
                    PhotoListFragment.this.f18918X.remove(0);
                    PhotoListFragment.this.applyVideoFilter();
                }
            } else {
                Log.e("xtest", "视频防抖处理失败：" + videoStabilizerResult.getErrorMsg() + "，本次处理后的路径：" + videoStabilizerResult.getStabilizerVideoPath());
                File file2 = new File(videoStabilizerResult.getStabilizerVideoPath());
                if (!new File(this.f18949a.getPath()).exists()) {
                    file2.delete();
                    Handler handler3 = PhotoListFragment.this.f18922a;
                    final Uri uri3 = this.f18949a;
                    handler3.post(new Runnable() { // from class: quc
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f75823a.lambda$invoke$3(uri3);
                        }
                    });
                }
                if (PhotoListFragment.this.f18914M1) {
                    PhotoListFragment.this.f18914M1 = false;
                    if (PhotoListFragment.this.f18913M != null) {
                        PhotoListFragment.this.f18913M.cancelRun();
                    }
                    if (!PhotoListFragment.this.f18920Z && !PhotoListFragment.this.f18914M1) {
                        PhotoListFragment.this.f18922a.post(new Runnable() { // from class: ruc
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f79686a.lambda$invoke$4();
                            }
                        });
                    }
                } else {
                    PhotoListFragment.this.f18918X.remove(0);
                    PhotoListFragment.this.applyVideoFilter();
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$m */
    public class C2853m implements ltc {
        public C2853m() {
        }

        @Override // p000.ltc
        public void onPhotoClick(Uri uri) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < PhotoListFragment.this.f18926c.getMediaUrisLiveData().getValue().size(); i++) {
                arrayList.add(PhotoListFragment.this.f18926c.getMediaUrisLiveData().getValue().get(i).toString());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            EyevueApplication.getEyevueApplication().setMediaUris(arrayList);
            Intent intent = new Intent(PhotoListFragment.this.getContext(), (Class<?>) EyevuePreviewActivity.class);
            intent.putExtra(EyevuePreviewActivity.f18840e, arrayList.contains(uri.toString()) ? arrayList.indexOf(uri.toString()) : 0);
            PhotoListFragment.this.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$n */
    public class C2854n extends GridLayoutManager.SpanSizeLookup {
        public C2854n() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int position) {
            return PhotoListFragment.this.f18924b.getItemViewType(position) == 0 ? 3 : 1;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$o */
    public class C2855o implements ModBleResponse.OnIspWorkStateListenr {
        public C2855o() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onIspWorkState$0(int i) {
            if (i == Command.Param.ISP_IMPORTING) {
                ToastUtils.showShort(PhotoListFragment.this.getString(C2531R.string.string_isp_importing));
                return;
            }
            if (PhotoListFragment.this.f18926c != null) {
                PhotoListFragment.this.f18926c.cancelReceivePhoto();
            }
            if (i == Command.Param.ISP_TAKE_PHOTO) {
                ToastUtils.showShort(PhotoListFragment.this.getString(C2531R.string.string_isp_take_photo));
            } else if (i == Command.Param.ISP_TAKE_VIDEO) {
                ToastUtils.showShort(PhotoListFragment.this.getString(C2531R.string.string_isp_take_video));
            } else if (i == Command.Param.ISP_TAKE_AUDIO) {
                ToastUtils.showShort(PhotoListFragment.this.getString(C2531R.string.string_isp_take_audio));
            }
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnIspWorkStateListenr
        public void onIspWorkState(final int state) {
            C2478k.runOnUiThread(new Runnable() { // from class: suc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82924a.lambda$onIspWorkState$0(state);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$p */
    public class C2856p implements FileOperationCallback {
        public C2856p() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onOperationComplete$0(int i, List list) {
            if (i > 0) {
                ToastUtils.showShort(PhotoListFragment.this.getString(C2531R.string.string_delete_success));
            }
            showMessages(PhotoListFragment.f18908e2, list);
            PhotoListFragment.this.f18926c.exitEditMode();
            PhotoListFragment photoListFragment = PhotoListFragment.this;
            photoListFragment.reloadMedia(photoListFragment.f18910F);
        }

        @Override // com.eyevue.glassapp.utils.photo.FileOperationCallback
        public void onOperationComplete(final int successCount, int totalCount, final List<String> messages) {
            PhotoListFragment.this.f18922a.post(new Runnable() { // from class: tuc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86012a.lambda$onOperationComplete$0(successCount, messages);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$q */
    public class ViewOnClickListenerC2857q implements View.OnClickListener {

        /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.PhotoListFragment$q$a */
        public class a implements C2475h.f {
            public a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onGranted$0() {
                ((pu6) ((BaseFragment) PhotoListFragment.this).binding).f72089Y.setText(PhotoListFragment.this.getString(C2531R.string.string_wifi_connecting));
            }

            @Override // com.blankj.utilcode.util.C2475h.f
            public void onDenied() {
            }

            @Override // com.blankj.utilcode.util.C2475h.f
            public void onGranted() {
                if (Boolean.TRUE.equals(PhotoListFragment.this.f18926c.getIsImportingLiveData().getValue())) {
                    PhotoListFragment.this.f18926c.cancelReceivePhoto();
                    return;
                }
                PhotoListFragment.this.f18926c.exitEditMode();
                C2478k.runOnUiThreadDelayed(new Runnable() { // from class: vuc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f92288a.lambda$onGranted$0();
                    }
                }, 500L);
                if (PhotoListFragment.this.f18924b != null) {
                    PhotoListFragment.this.f18924b.clearDownloadMap();
                }
                PhotoListFragment.this.f18926c.connectP2pWifitoReceivePhoto();
            }
        }

        public ViewOnClickListenerC2857q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$0() {
            ((pu6) ((BaseFragment) PhotoListFragment.this).binding).f72089Y.setText(PhotoListFragment.this.getString(C2531R.string.string_wifi_connecting));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (System.currentTimeMillis() - PhotoListFragment.this.f18928d < 1000) {
                return;
            }
            PhotoListFragment.this.f18928d = System.currentTimeMillis();
            if (PhotoListFragment.this.f18909C == 0) {
                ToastUtils.showShort(PhotoListFragment.this.getString(C2531R.string.string_sync_photo_none_tip));
                return;
            }
            if (u77.f86955C) {
                m3h.showToastShort(PhotoListFragment.this.getString(C2531R.string.string_recording_tip));
                return;
            }
            if (u77.f86954B) {
                m3h.showToastShort(PhotoListFragment.this.getString(C2531R.string.string_recording_tip));
                return;
            }
            if (u77.f86963g < 15) {
                ToastUtils.showShort(PhotoListFragment.this.getString(C2531R.string.string_eyevue_import_media_low_battery_tip));
                return;
            }
            if (wl7.isApWifiEnabled(PhotoListFragment.this.getContext())) {
                ToastUtils.showShort(PhotoListFragment.this.getString(C2531R.string.string_eyevue_import_media_hotspot_tip));
                return;
            }
            if (PhotoListFragment.this.f18931f != null && !PhotoListFragment.this.f18931f.isWifiEnabled()) {
                PhotoListFragment.this.showOpenWifiDialog();
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                if (lx2.checkSelfPermission(PhotoListFragment.this.getContext(), xnc.f98619p) != 0) {
                    C2475h.permission(xnc.f98619p).callback(new a()).request();
                    return;
                }
            } else if (i >= 29 && (!PermissionUtil.isHasLocationPermission(PhotoListFragment.this.getContext()) || !PermissionUtil.checkGpsProviderEnable(PhotoListFragment.this.getContext()))) {
                PhotoListFragment.this.showGPSLocationDialog();
                return;
            }
            if (Boolean.TRUE.equals(PhotoListFragment.this.f18926c.getIsImportingLiveData().getValue())) {
                PhotoListFragment.this.f18926c.cancelReceivePhoto();
                return;
            }
            if (!ModUtils.bleCore.isConnected()) {
                ToastUtils.showShort(PhotoListFragment.this.getString(C2531R.string.eyevue_add_device_dialog_tip));
                return;
            }
            PhotoListFragment.this.f18926c.exitEditMode();
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: uuc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89157a.lambda$onClick$0();
                }
            }, 500L);
            if (PhotoListFragment.this.f18924b != null) {
                PhotoListFragment.this.f18924b.clearDownloadMap();
            }
            PhotoListFragment.this.f18926c.connectP2pWifitoReceivePhoto();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyPhotoAndVideoFilter() {
        try {
            HashMap<String, Float> map = new HashMap<>();
            ArrayList<Uri> arrayList = new ArrayList<>();
            if (qq9.f75117a.getBoolean(qq9.C11584a.f75122c, false)) {
                if (this.f18912L == null) {
                    this.f18912L = ImageUpScaleUtil.Companion.init(requireActivity());
                }
                List<Uri> listFindDifferentUris = findDifferentUris(this.f18915N, FileUtils.loadPhotoFromDirectory(getContext()));
                arrayList.addAll(listFindDifferentUris);
                this.f18915N.addAll(listFindDifferentUris);
                if (!this.f18916Q) {
                    applyPhotoFilter();
                }
                Iterator<Uri> it = listFindDifferentUris.iterator();
                while (it.hasNext()) {
                    map.put(it.next().toString(), Float.valueOf(0.0f));
                }
            }
            if (qq9.f75117a.getBoolean(qq9.C11584a.f75121b, false)) {
                if (this.f18913M == null) {
                    this.f18913M = VideoStabilizerUtil.Companion.init(requireActivity());
                }
                List<Uri> listFindDifferentUris2 = findDifferentUris(this.f18918X, FileUtils.loadVideoFromDirectory(getContext()));
                arrayList.addAll(listFindDifferentUris2);
                this.f18918X.addAll(listFindDifferentUris2);
                if (!this.f18919Y) {
                    applyVideoFilter();
                }
                Iterator<Uri> it2 = listFindDifferentUris2.iterator();
                while (it2.hasNext()) {
                    map.put(it2.next().toString(), Float.valueOf(0.0f));
                }
            }
            mtc.f62107a.addFilterPhotoListLiveData(arrayList);
            this.f18924b.setPhotoFilterProgressMap(map);
            resetEditEnable();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("xtest", "处理图片降噪或视频防抖出现崩溃");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyPhotoFilter() {
        if (this.f18915N.isEmpty()) {
            this.f18916Q = false;
            return;
        }
        this.f18916Q = true;
        Uri uri = this.f18915N.get(0);
        Log.e("xtest", "图片进度调试，开始执行图片降噪处理，路径：" + uri);
        Bitmap bitmapFromUri = getBitmapFromUri(getContext(), uri);
        if (bitmapFromUri == null) {
            this.f18915N.remove(0);
            applyPhotoFilter();
            return;
        }
        Log.e("xtest", "开始处理图片降噪，当前地址：" + uri.getPath() + ",用tostring是：" + uri.toString());
        this.f18912L.applyImageUpScale(bitmapFromUri, new C2849i(uri), new C2850j(uri));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyVideoFilter() {
        if (this.f18918X.isEmpty()) {
            this.f18919Y = false;
            return;
        }
        this.f18919Y = true;
        Uri uri = this.f18918X.get(0);
        File file = new File(uri.getPath());
        if (!file.exists()) {
            this.f18918X.remove(0);
            applyVideoFilter();
            return;
        }
        Log.e("xtest", "开始处理视频防抖，当前地址：" + uri.getPath() + ",用tostring是：" + uri.toString());
        this.f18913M.applyVideoStabilizer(file, new C2851k(uri), new C2852l(uri));
    }

    private void cancelImport() {
        if (this.f18926c != null) {
            if (this.f18909C > 0) {
                ((pu6) this.binding).f72089Y.setText(String.format(getString(C2531R.string.string_no_sync_num), String.valueOf(this.f18909C)));
            } else {
                ((pu6) this.binding).f72089Y.setText(getString(C2531R.string.string_sync_photo));
            }
            if (Boolean.TRUE.equals(this.f18926c.getIsImportingLiveData().getValue())) {
                this.f18926c.cancelReceivePhoto();
            }
        }
        ((pu6) this.binding).f72092b.setBackgroundResource(C2531R.drawable.bg_card_base_blue_shape);
        ((pu6) this.binding).f72092b.setText(C2531R.string.string_import);
        ((pu6) this.binding).f72092b.setTextColor(getContext().getColor(C2531R.color.black));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissLocationDialog() {
        td9 td9Var = this.f18930e;
        if (td9Var != null) {
            if (td9Var.isShowing()) {
                this.f18930e.dismiss();
            }
            this.f18930e = null;
        }
    }

    private List<Uri> findDifferentUris(List<Uri> list1, List<Uri> list2) {
        final HashSet hashSet = new HashSet(list1);
        final HashSet hashSet2 = new HashSet(list2);
        return (List) Stream.concat(list1.stream().filter(new Predicate() { // from class: euc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return PhotoListFragment.lambda$findDifferentUris$0(hashSet2, (Uri) obj);
            }
        }), list2.stream().filter(new Predicate() { // from class: fuc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return PhotoListFragment.lambda$findDifferentUris$1(hashSet, (Uri) obj);
            }
        })).collect(Collectors.toList());
    }

    private Bitmap getBitmapFromUri(Context context, Uri uri) {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
            inputStreamOpenInputStream.close();
            return bitmapDecodeStream;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void initRecyclerView() {
        this.f18926c.setMediaUris(FileUtils.loadMediaFromDirectory(getContext(), this.f18910F));
        this.f18924b = new gtc(getContext(), this.f18926c, new C2853m());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        ((pu6) this.binding).f72086N.setItemAnimator(null);
        ((pu6) this.binding).f72086N.setHasFixedSize(true);
        ((pu6) this.binding).f72086N.setLayoutManager(gridLayoutManager);
        ((pu6) this.binding).f72086N.setAdapter(this.f18924b);
        gridLayoutManager.setSpanSizeLookup(new C2854n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$findDifferentUris$0(Set set, Uri uri) {
        return !set.contains(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$findDifferentUris$1(Set set, Uri uri) {
        return !set.contains(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$10(C6908hm c6908hm) {
        if (c6908hm.f44098a) {
            if (PermissionUtils.checkStoragePermission(getContext())) {
                saveSelectedMedia(false);
                return;
            } else {
                PermissionUtils.requestStoragePermission(getActivity());
                return;
            }
        }
        if (c6908hm.f44099b) {
            Set<Uri> selectedUris = this.f18926c.getSelectedUris();
            StringBuilder sb = new StringBuilder();
            sb.append("Deleting ");
            sb.append(selectedUris.size());
            sb.append(" selected media files...");
            this.f18926c.deleteSelectPhotos();
            BatchOperationUtil.deleteSelectedMedia(getContext(), selectedUris, this.f18926c.getMediaUrisLiveData().getValue(), new C2856p());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$11(C7973jm c7973jm) {
        if (this.f18926c.isAllSelected()) {
            this.f18926c.deselectAll();
        } else {
            this.f18926c.selectAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$12(hfa hfaVar) {
        gtc gtcVar = this.f18924b;
        if (gtcVar != null) {
            gtcVar.updateDownloadProgress(hfaVar.f43368a, hfaVar.f43369b);
        }
        if (hfaVar.f43368a == 100) {
            Uri mediaNoFilterUriByName = FileUtils.getMediaNoFilterUriByName(requireContext(), hfaVar.f43369b, 1);
            if (mediaNoFilterUriByName != null) {
                Log.e("xtest", "文件进度下载完成，当前文件：" + hfaVar.f43369b);
                if (qq9.f75117a.getBoolean(qq9.C11584a.f75122c, false)) {
                    this.f18915N.add(mediaNoFilterUriByName);
                    if (this.f18912L == null) {
                        this.f18912L = ImageUpScaleUtil.Companion.init(requireActivity());
                    }
                    HashMap<String, Float> map = new HashMap<>();
                    map.put(mediaNoFilterUriByName.toString(), Float.valueOf(0.0f));
                    if (!this.f18916Q) {
                        applyPhotoFilter();
                    }
                    ArrayList<Uri> arrayList = new ArrayList<>();
                    arrayList.add(mediaNoFilterUriByName);
                    mtc.f62107a.addFilterPhotoListLiveData(arrayList);
                    this.f18924b.setPhotoFilterProgressMap(map);
                    resetEditEnable();
                }
            }
            Uri mediaNoFilterUriByName2 = FileUtils.getMediaNoFilterUriByName(requireContext(), hfaVar.f43369b, 2);
            if (mediaNoFilterUriByName2 != null) {
                Log.e("xtest", "文件进度下载完成，当前文件：" + hfaVar.f43369b);
                if (qq9.f75117a.getBoolean(qq9.C11584a.f75121b, false)) {
                    if (this.f18913M == null) {
                        this.f18913M = VideoStabilizerUtil.Companion.init(requireActivity());
                    }
                    ArrayList<Uri> arrayList2 = new ArrayList<>();
                    arrayList2.add(FileUtils.getMediaNoFilterUriByName(getContext(), hfaVar.f43369b, 2));
                    this.f18918X.addAll(arrayList2);
                    HashMap<String, Float> map2 = new HashMap<>();
                    map2.put(mediaNoFilterUriByName2.toString(), Float.valueOf(0.0f));
                    if (!this.f18919Y) {
                        applyVideoFilter();
                    }
                    mtc.f62107a.addFilterPhotoListLiveData(arrayList2);
                    this.f18924b.setPhotoFilterProgressMap(map2);
                    resetEditEnable();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$13(i91 i91Var) {
        ivc ivcVar;
        String str = i91Var.f46089a;
        str.hashCode();
        if (str.equals(i91.f46088f) && (ivcVar = this.f18926c) != null) {
            ivcVar.cancelReceivePhoto();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observeData$3(Boolean bool) {
        ((pu6) this.binding).f72081C.setVisibility(bool.booleanValue() ? 8 : 0);
        ((pu6) this.binding).f72097m.setVisibility(bool.booleanValue() ? 0 : 8);
        C7330im c7330im = new C7330im();
        c7330im.f47358a = bool.booleanValue();
        zgb.defaultCenter().publish(c7330im);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$observeData$4(Boolean bool) {
        C6378gm c6378gm = new C6378gm();
        c6378gm.f40160a = bool.booleanValue();
        zgb.defaultCenter().publish(c6378gm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observeData$5(Integer num) {
        if (num.intValue() == 0) {
            ToastUtils.showShort(getString(C2531R.string.string_sync_photo_none_tip));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observeData$6(Boolean bool) {
        Log.e("xtest", "监听导入状态：" + bool);
        if (bool.booleanValue()) {
            if (this.f18926c.f48572M != 0) {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getContext().getColor(C2531R.color.base_blue));
                String str = this.f18926c.f48574N + pj4.f71071b + this.f18926c.f48572M;
                String string = getString(C2531R.string.string_importing, str);
                SpannableString spannableString = new SpannableString(string);
                int iIndexOf = string.indexOf(str);
                spannableString.setSpan(foregroundColorSpan, iIndexOf, str.length() + iIndexOf, 34);
                ((pu6) this.binding).f72089Y.setText(spannableString);
            } else if (this.f18909C > 0) {
                ((pu6) this.binding).f72089Y.setText(String.format(getString(C2531R.string.string_no_sync_num), String.valueOf(this.f18909C)));
            } else {
                ((pu6) this.binding).f72089Y.setText(getString(C2531R.string.string_sync_photo));
            }
            ((pu6) this.binding).f72092b.setBackgroundResource(C2531R.drawable.bg_card_base_red_shape);
            ((pu6) this.binding).f72092b.setText(C2531R.string.cancel);
            ((pu6) this.binding).f72092b.setTextColor(getContext().getColor(C2531R.color.color_main_text));
        } else {
            if (this.f18909C > 0) {
                ((pu6) this.binding).f72089Y.setText(String.format(getString(C2531R.string.string_no_sync_num), String.valueOf(this.f18909C)));
            } else {
                ((pu6) this.binding).f72089Y.setText(getString(C2531R.string.string_sync_photo));
            }
            ((pu6) this.binding).f72092b.setBackgroundResource(C2531R.drawable.bg_card_base_blue_shape);
            ((pu6) this.binding).f72092b.setText(C2531R.string.string_import);
            ((pu6) this.binding).f72092b.setTextColor(getContext().getColor(C2531R.color.black));
        }
        reloadMedia(this.f18910F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observeData$7(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        if (this.f18909C > 0) {
            ((pu6) this.binding).f72089Y.setText(String.format(getString(C2531R.string.string_no_sync_num), String.valueOf(this.f18909C)));
        } else {
            ((pu6) this.binding).f72089Y.setText(getString(C2531R.string.string_sync_photo));
        }
        ((pu6) this.binding).f72092b.setBackgroundResource(C2531R.drawable.bg_card_base_blue_shape);
        ((pu6) this.binding).f72092b.setText(C2531R.string.string_import);
        ((pu6) this.binding).f72092b.setTextColor(getContext().getColor(C2531R.color.black));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observeData$8() {
        T t;
        if (Boolean.TRUE.equals(this.f18926c.getIsImportingLiveData().getValue()) || (t = this.binding) == 0) {
            return;
        }
        if (this.f18909C > 0) {
            ((pu6) t).f72089Y.setText(String.format(getString(C2531R.string.string_no_sync_num), String.valueOf(this.f18909C)));
            ((pu6) this.binding).f72082F.setVisibility(0);
        } else {
            ((pu6) t).f72089Y.setText(getString(C2531R.string.string_sync_photo));
            ((pu6) this.binding).f72082F.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observeData$9(int i) {
        this.f18909C = i;
        C2478k.runOnUiThread(new Runnable() { // from class: otc
            @Override // java.lang.Runnable
            public final void run() {
                this.f68733a.lambda$observeData$8();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onFragmentResume$2() {
        ModUtils.sendViaBle().getDevicePower();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$saveSelectedMedia$16(Uri uri) {
        return !FileUtils.isAudioFile(uri.getLastPathSegment());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnClickListener$14(View view) {
        if (Boolean.TRUE.equals(this.f18926c.getIsImportingLiveData().getValue())) {
            ToastUtils.showShort(getString(C2531R.string.string_sync_photo_ing_tip));
        } else {
            this.f18926c.enterEditMode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnClickListener$15(View view) {
        this.f18926c.exitEditMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showOpenWifiDialog$17() {
        startActivity(new Intent("android.settings.WIFI_SETTINGS"));
        dismissOpenWifiDialog();
    }

    public static PhotoListFragment newInstance() {
        return new PhotoListFragment();
    }

    private void observeData() {
        this.f18926c.getEditModeLiveData().observe(this, new qxb() { // from class: xtc
            @Override // p000.qxb
            public final void onChanged(Object obj) {
                this.f99238a.lambda$observeData$3((Boolean) obj);
            }
        });
        this.f18926c.getIsAllSelectedLiveData().observe(this, new qxb() { // from class: ytc
            @Override // p000.qxb
            public final void onChanged(Object obj) {
                PhotoListFragment.lambda$observeData$4((Boolean) obj);
            }
        });
        this.f18926c.getUnImportNumLiveData().observe(this, new qxb() { // from class: ztc
            @Override // p000.qxb
            public final void onChanged(Object obj) {
                this.f106076a.lambda$observeData$5((Integer) obj);
            }
        });
        this.f18926c.getIsImportingLiveData().observe(this, new qxb() { // from class: auc
            @Override // p000.qxb
            public final void onChanged(Object obj) {
                this.f11891a.lambda$observeData$6((Boolean) obj);
            }
        });
        this.f18926c.getIsWifiConnectStateLiveData().observe(this, new qxb() { // from class: buc
            @Override // p000.qxb
            public final void onChanged(Object obj) {
                this.f14816a.lambda$observeData$7((Boolean) obj);
            }
        });
        ModUtils.modBleResponse().setOnThumbnailCountListener(new ModBleResponse.OnThumbnailCountListener() { // from class: cuc
            @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnThumbnailCountListener
            public final void onThumbnailCount(int i) {
                this.f27652a.lambda$observeData$9(i);
            }
        });
        ModUtils.modBleResponse().setOnIspWorkStateListenr(new C2855o());
        zgb.defaultCenter().subscriber(C6908hm.class, this.f18923a2);
        zgb.defaultCenter().subscriber(C7973jm.class, this.f18925b2);
        zgb.defaultCenter().subscribeStrongly(hfa.class, this.f18927c2);
        zgb.defaultCenter().subscribeStrongly(i91.class, this.f18929d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reloadMedia(int type) {
        ArrayList<Uri> arrayListLoadMediaFromDirectory = FileUtils.loadMediaFromDirectory(getContext(), type);
        this.f18926c.setMediaUris(arrayListLoadMediaFromDirectory);
        if (arrayListLoadMediaFromDirectory.isEmpty()) {
            ((pu6) this.binding).f72085M.setVisibility(0);
        } else {
            ((pu6) this.binding).f72085M.setVisibility(8);
        }
    }

    private void requestLocationPermission() {
        C2475h.permission(xnc.f98583H, xnc.f98584I).callback(new C2848h()).request();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetEditEnable() {
        mtc mtcVar = mtc.f62107a;
        if (mtcVar.getFilterPhotoListLiveData() == null || mtcVar.getFilterPhotoListLiveData().isEmpty()) {
            ((pu6) this.binding).f72081C.setEnabled(true);
        } else {
            ((pu6) this.binding).f72081C.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveSelectedMedia(boolean deleteAfterSave) {
        Set<Uri> selectedUris = this.f18926c.getSelectedUris();
        if (this.f18910F == 0) {
            selectedUris = (Set) selectedUris.stream().filter(new Predicate() { // from class: duc
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return PhotoListFragment.lambda$saveSelectedMedia$16((Uri) obj);
                }
            }).collect(Collectors.toSet());
        }
        Set<Uri> set = selectedUris;
        StringBuilder sb = new StringBuilder();
        sb.append("保存 ");
        sb.append(set.size());
        sb.append("选中媒体文件");
        sb.append(deleteAfterSave ? " with deletion" : "");
        if (this.f18921Z1 == null) {
            this.f18921Z1 = StyleFilterUtil.Companion.init(getActivity());
        }
        BatchOperationUtil.saveSelectedMediaWithWaterMaskToAlbum(getContext(), set, this.f18926c.getMediaUrisLiveData().getValue(), deleteAfterSave, this.f18921Z1, vfe.getInstance().getBoolean(u77.f86969m, false), new C2845e(deleteAfterSave));
    }

    private void setOnClickListener() {
        ((pu6) this.binding).f72081C.setOnClickListener(new View.OnClickListener() { // from class: vtc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92238a.lambda$setOnClickListener$14(view);
            }
        });
        ((pu6) this.binding).f72097m.setOnClickListener(new View.OnClickListener() { // from class: wtc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95496a.lambda$setOnClickListener$15(view);
            }
        });
        ((pu6) this.binding).f72092b.setOnClickListener(new ViewOnClickListenerC2857q());
        ((pu6) this.binding).f72093c.setOnClickListener(new ViewOnClickListenerC2841a());
        ((pu6) this.binding).f72095e.setOnClickListener(new ViewOnClickListenerC2842b());
        ((pu6) this.binding).f72096f.setOnClickListener(new ViewOnClickListenerC2843c());
        ((pu6) this.binding).f72094d.setOnClickListener(new ViewOnClickListenerC2844d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showGPSLocationDialog() {
        if (isAdded()) {
            requestLocationPermission();
            td9 td9Var = new td9(getActivity(), new C2847g());
            this.f18930e = td9Var;
            td9Var.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showOpenWifiDialog() {
        if (isAdded()) {
            if (this.f18932m == null) {
                this.f18932m = new e87(getActivity(), new e87.InterfaceC5190a() { // from class: utc
                    @Override // p000.e87.InterfaceC5190a
                    public final void onOk() {
                        this.f89090a.lambda$showOpenWifiDialog$17();
                    }
                });
            }
            if (this.f18932m.isShowing()) {
                return;
            }
            this.f18932m.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTypeView(int type) {
        this.f18910F = type;
        if (type == 1) {
            ((pu6) this.binding).f72095e.setBackgroundResource(C2531R.drawable.bg_btn_main_base_purple999);
            ((pu6) this.binding).f72095e.setTextColor(getContext().getColor(C2531R.color.color_main_function));
            ((pu6) this.binding).f72094d.setBackgroundColor(0);
            ((pu6) this.binding).f72096f.setBackgroundColor(0);
            ((pu6) this.binding).f72093c.setBackgroundColor(0);
            ((pu6) this.binding).f72093c.setTextColor(getContext().getColor(C2531R.color.white));
            ((pu6) this.binding).f72094d.setTextColor(getContext().getColor(C2531R.color.white));
            ((pu6) this.binding).f72096f.setTextColor(getContext().getColor(C2531R.color.white));
        } else if (type == 2) {
            ((pu6) this.binding).f72093c.setBackgroundColor(0);
            ((pu6) this.binding).f72093c.setTextColor(getContext().getColor(C2531R.color.white));
            ((pu6) this.binding).f72095e.setBackgroundColor(0);
            ((pu6) this.binding).f72094d.setBackgroundColor(0);
            ((pu6) this.binding).f72095e.setTextColor(getContext().getColor(C2531R.color.white));
            ((pu6) this.binding).f72094d.setTextColor(getContext().getColor(C2531R.color.white));
            ((pu6) this.binding).f72096f.setBackgroundResource(C2531R.drawable.bg_btn_main_base_purple999);
            ((pu6) this.binding).f72096f.setTextColor(getContext().getColor(C2531R.color.color_main_function));
        } else if (type == 3) {
            ((pu6) this.binding).f72093c.setBackgroundColor(0);
            ((pu6) this.binding).f72093c.setTextColor(getContext().getColor(C2531R.color.white));
            ((pu6) this.binding).f72095e.setBackgroundColor(0);
            ((pu6) this.binding).f72095e.setTextColor(getContext().getColor(C2531R.color.white));
            ((pu6) this.binding).f72094d.setBackgroundResource(C2531R.drawable.bg_btn_main_base_purple999);
            ((pu6) this.binding).f72094d.setTextColor(getContext().getColor(C2531R.color.color_main_function));
            ((pu6) this.binding).f72096f.setBackgroundColor(0);
            ((pu6) this.binding).f72096f.setTextColor(getContext().getColor(C2531R.color.white));
        } else {
            ((pu6) this.binding).f72093c.setBackgroundResource(C2531R.drawable.bg_btn_main_base_purple999);
            ((pu6) this.binding).f72093c.setTextColor(getContext().getColor(C2531R.color.color_main_function));
            ((pu6) this.binding).f72095e.setBackgroundColor(0);
            ((pu6) this.binding).f72095e.setTextColor(getContext().getColor(C2531R.color.white));
            ((pu6) this.binding).f72094d.setBackgroundColor(0);
            ((pu6) this.binding).f72094d.setTextColor(getContext().getColor(C2531R.color.white));
            ((pu6) this.binding).f72096f.setBackgroundColor(0);
            ((pu6) this.binding).f72096f.setTextColor(getContext().getColor(C2531R.color.white));
        }
        if (this.f18926c.isAllSelected()) {
            this.f18926c.deselectAll();
        }
        reloadMedia(type);
    }

    @Override // com.watchfun.base.BaseFragment
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public pu6 provideViewBinding(ViewGroup viewGroup) {
        return pu6.inflate(getLayoutInflater(), viewGroup, false);
    }

    public void dismissOpenWifiDialog() {
        e87 e87Var = this.f18932m;
        if (e87Var != null) {
            if (e87Var.isShowing()) {
                this.f18932m.dismiss();
            }
            this.f18932m = null;
        }
    }

    @Override // com.watchfun.base.BaseFragment
    public void initView() {
        super.initView();
        FileUtils.ensureMediaDirectoryExists(getContext());
        ivc ivcVar = (ivc) new C1137f0(this).get(ivc.class);
        this.f18926c = ivcVar;
        if (Boolean.FALSE.equals(ivcVar.getIsImportingLiveData().getValue())) {
            this.f18926c.deleteAllThumbnail();
        }
        this.f18931f = (WifiManager) getContext().getSystemService("wifi");
        setOnClickListener();
        initRecyclerView();
        observeData();
    }

    @Override // com.watchfun.base.BaseFragment
    public void loadData() {
    }

    @Override // com.watchfun.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        zgb.defaultCenter().unsubscribe(C6908hm.class, this.f18923a2);
        zgb.defaultCenter().unsubscribe(C7973jm.class, this.f18925b2);
        zgb.defaultCenter().unsubscribe(hfa.class, this.f18927c2);
        zgb.defaultCenter().unsubscribe(i91.class, this.f18929d2);
    }

    @Override // com.watchfun.base.LazyLoadFragment
    public void onFragmentPause() {
        super.onFragmentPause();
    }

    @Override // com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment
    public void onFragmentResume() {
        super.onFragmentResume();
        if (!ModUtils.bleCore.isConnected()) {
            this.f18909C = 0;
            ((pu6) this.binding).f72082F.setVisibility(8);
        }
        this.f18926c.observeWifiConnectState();
        ModUtils.sendViaBle().appGetThumbnailImageCount();
        C2478k.runOnUiThreadDelayed(new Runnable() { // from class: ptc
            @Override // java.lang.Runnable
            public final void run() {
                PhotoListFragment.lambda$onFragmentResume$2();
            }
        }, 500L);
        reloadMedia(this.f18910F);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @efb String[] permissions2, @efb int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions2, grantResults);
        PermissionUtils.handlePermissionResult(requestCode, grantResults, new C2846f());
    }
}
