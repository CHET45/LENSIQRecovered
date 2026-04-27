package com.eyevue.glassapp.view.photo;

import android.net.Uri;
import android.util.Log;
import cn.watchfun.stylefilter.WQStyleFilter;
import com.blankj.utilcode.util.ToastUtils;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.utils.photo.BatchOperationUtil;
import com.eyevue.glassapp.utils.photo.FileOperationCallback;
import com.eyevue.glassapp.utils.photo.KtImageUtils;
import com.eyevue.glassapp.utils.photo.PermissionUtils;
import com.eyevue.glassapp.utils.photo.StyleFilterUtil;
import com.watchfun.base.BaseFragment;
import java.io.File;
import java.util.List;
import p000.bth;
import p000.efb;
import p000.hfa;
import p000.j8i;
import p000.qy6;
import p000.u77;
import p000.vfe;
import p000.xcg;
import p000.xrf;
import p000.zgb;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseMediaFragment<T extends j8i> extends BaseFragment<T> {

    /* JADX INFO: renamed from: b */
    public String f18736b;

    /* JADX INFO: renamed from: c */
    public Uri f18737c;

    /* JADX INFO: renamed from: d */
    public int f18738d;

    /* JADX INFO: renamed from: e */
    public StyleFilterUtil f18739e;

    /* JADX INFO: renamed from: m */
    public InterfaceC2825e f18741m;

    /* JADX INFO: renamed from: a */
    public final String f18735a = "BaseMediaFragment";

    /* JADX INFO: renamed from: f */
    public final xcg<hfa> f18740f = new xcg() { // from class: ds0
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f30522a.lambda$new$0((hfa) obj);
        }
    };

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.BaseMediaFragment$a */
    public class C2821a implements qy6<StyleFilterUtil.StyleFilterResult, bth> {
        public C2821a() {
        }

        @Override // p000.qy6
        public bth invoke(StyleFilterUtil.StyleFilterResult styleFilterResult) {
            Log.e("xtest", "图片水印处理结果：" + styleFilterResult.getErrorCode() + ",errorMsg:" + styleFilterResult.getErrorMsg());
            if (styleFilterResult.getErrorCode() == 0) {
                BaseMediaFragment.this.saveMedia(Uri.fromFile(new File(styleFilterResult.getOutputPath())));
                return null;
            }
            BaseMediaFragment baseMediaFragment = BaseMediaFragment.this;
            baseMediaFragment.saveMedia(baseMediaFragment.f18737c);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.BaseMediaFragment$b */
    public class C2822b implements FileOperationCallback {
        public C2822b() {
        }

        @Override // com.eyevue.glassapp.utils.photo.FileOperationCallback
        public void onOperationComplete(int successCount, int totalCount, List<String> messages) {
            if (successCount > 0) {
                ToastUtils.showShort(BaseMediaFragment.this.getString(C2531R.string.string_download_success));
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.BaseMediaFragment$c */
    public class C2823c implements FileOperationCallback {
        public C2823c() {
        }

        @Override // com.eyevue.glassapp.utils.photo.FileOperationCallback
        public void onOperationComplete(int successCount, int totalCount, List<String> messages) {
            if (successCount > 0) {
                ToastUtils.showShort(BaseMediaFragment.this.getString(C2531R.string.string_delete_success));
                if (BaseMediaFragment.this.f18741m != null) {
                    BaseMediaFragment.this.f18741m.onDelete(BaseMediaFragment.this.f18738d);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.BaseMediaFragment$d */
    public class C2824d implements PermissionUtils.PermissionCallback {
        public C2824d() {
        }

        @Override // com.eyevue.glassapp.utils.photo.PermissionUtils.PermissionCallback
        public void onPermissionDenied() {
        }

        @Override // com.eyevue.glassapp.utils.photo.PermissionUtils.PermissionCallback
        public void onPermissionGranted() {
            BaseMediaFragment.this.m4978g();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.BaseMediaFragment$e */
    public interface InterfaceC2825e {
        void onDelete(int position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(hfa hfaVar) {
        if (this.f18736b.contains(hfaVar.f43369b)) {
            mo4972f(hfaVar.f43368a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveMedia(Uri uri) {
        BatchOperationUtil.saveSelectedMediaToAlbum(getContext(), uri, false, new C2822b());
    }

    /* JADX INFO: renamed from: e */
    public void m4977e() {
        BatchOperationUtil.deleteSelectedMedia(this.f18737c, new C2823c());
    }

    /* JADX INFO: renamed from: f */
    public void mo4972f(int progress) {
    }

    /* JADX INFO: renamed from: g */
    public void m4978g() {
        if (!vfe.getInstance().getBoolean(u77.f86969m, false)) {
            saveMedia(this.f18737c);
            return;
        }
        float fCalculateImageValue = KtImageUtils.INSTANCE.calculateImageValue(getContext(), this.f18737c);
        if (this.f18739e == null) {
            this.f18739e = StyleFilterUtil.Companion.init(getActivity());
        }
        this.f18739e.applyWaterMask(this.f18737c.getPath(), "ic_watermask.png", WQStyleFilter.WatermarkPosition.BOTTOM_CENTER, xrf.dp2px(4.0f), fCalculateImageValue, new C2821a());
    }

    @Override // com.watchfun.base.BaseFragment
    public void initView() {
        super.initView();
        this.f18736b = getArguments().getString("url");
        this.f18738d = getArguments().getInt(C2865a.f19004r);
        zgb.defaultCenter().subscribeStrongly(hfa.class, this.f18740f);
    }

    @Override // com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        zgb.defaultCenter().unsubscribe(hfa.class, this.f18740f);
    }

    @Override // com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @efb String[] permissions2, @efb int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions2, grantResults);
        PermissionUtils.handlePermissionResult(requestCode, grantResults, new C2824d());
    }

    @Override // com.watchfun.base.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    public void setCurrentPosition(int currentPosition) {
        this.f18738d = currentPosition;
    }

    public void setOnDeleteListener(InterfaceC2825e listener) {
        this.f18741m = listener;
    }

    public void updateMedia(String filePath) {
    }
}
