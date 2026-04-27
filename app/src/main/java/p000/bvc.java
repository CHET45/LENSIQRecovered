package p000;

import com.watchfun.transcommon.bean.photo.PhotoTransBean;
import com.watchfun.transcommon.net.AiApiService;
import com.watchfun.transcommon.utils.MD5Util;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p000.avc;
import p000.h75;

/* JADX INFO: loaded from: classes7.dex */
public class bvc implements avc.InterfaceC1619a {

    /* JADX INFO: renamed from: b */
    public static final String f14946b = "PhotoTransPresenter";

    /* JADX INFO: renamed from: a */
    public final avc.InterfaceC1620b f14947a;

    /* JADX INFO: renamed from: bvc$a */
    public class C2069a extends us0<PhotoTransBean> {
        public C2069a(String str, boolean z, boolean z2) {
            super(str, z, z2);
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 mf4Var) {
            if (bvc.this.f14947a != null) {
                bvc.this.f14947a.addNetDisposable(mf4Var);
                bvc.this.f14947a.onDisposable(mf4Var);
            }
        }

        @Override // p000.us0
        public void onFail(h75.C6732a c6732a) {
            bvc.this.f14947a.loadFail();
        }

        @Override // p000.us0
        public void onSuccess(hr0<PhotoTransBean> hr0Var, boolean z) {
            if (!hr0Var.isSuccess()) {
                bvc.this.f14947a.loadFail();
            } else if (hr0Var.getData() == null) {
                bvc.this.f14947a.loadFail();
            } else if (bvc.this.f14947a != null) {
                bvc.this.f14947a.setDataSuccess(hr0Var.getData(), false);
            }
        }
    }

    public bvc(avc.InterfaceC1620b interfaceC1620b) {
        this.f14947a = interfaceC1620b;
    }

    private Map<String, String> buildHttpHeader() {
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        String strStringToMD5 = MD5Util.stringToMD5(e10.f31486b + e10.f31487c + strValueOf);
        StringBuilder sb = new StringBuilder();
        sb.append("buildHttpHeader -----------------=");
        sb.append(e10.f31486b);
        map.put("x-request-appid", e10.f31486b);
        map.put("x-request-timestamp", strValueOf);
        map.put("x-request-sign", strStringToMD5);
        String string = vfe.getInstance().getString("SP_KEY_LOCATION_LATITUDE");
        String string2 = vfe.getInstance().getString("SP_KEY_LOCATION_LONGITUDE");
        map.put("latitude", string);
        map.put("longitude", string2);
        map.put("isInChina", a43.f347l);
        return map;
    }

    private MultipartBody.Part createMultipartBody(File file, String str) {
        return MultipartBody.Part.createFormData("file", str, RequestBody.create(MediaType.parse(k9f.f53383l), file));
    }

    public void loadData(String str, String str2, String str3) {
        File file = new File(str);
        MultipartBody.Part partCreateMultipartBody = createMultipartBody(file, file.getName());
        o8e.clearCache();
        ((AiApiService) o8e.getService(AiApiService.class, e10.f31489e)).postOldPhotoTranslate(partCreateMultipartBody, str2, str3, buildHttpHeader()).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C2069a("", false, false));
    }

    @Override // p000.avc.InterfaceC1619a
    public void refreshData() {
    }
}
