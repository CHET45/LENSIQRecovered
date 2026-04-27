package com.watchfun.transcommon.gpt.presenter;

import com.google.gson.Gson;
import com.watchfun.callvideo.base.BaseCallActivity;
import com.watchfun.transcommon.gpt.GPTContract;
import com.watchfun.transcommon.gpt.presenter.GptAiAudioFilePresenter;
import com.watchfun.transcommon.utils.MD5Util;
import io.reactivex.Observable;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import p000.C2062bv;
import p000.a43;
import p000.dsb;
import p000.e10;
import p000.go7;
import p000.mf4;
import p000.mob;
import p000.npe;
import p000.oxb;
import p000.vfe;

/* JADX INFO: loaded from: classes5.dex */
public class GptAiAudioFilePresenter implements GPTContract.AiGPTAudioFilePresenter {
    private static final String TAG = "GptAiAudioFilePresenter";
    private String language;
    private File mFile;
    private final GPTContract.AiGPTAudioView mGPTAudioView;

    public GptAiAudioFilePresenter(GPTContract.AiGPTAudioView aiGPTAudioView) {
        this.mGPTAudioView = aiGPTAudioView;
    }

    private Map<String, String> buildHttpHeader() throws Exception {
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        String str = e10.f31486b + e10.f31487c + strValueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("authorization = ");
        sb.append(str);
        String strStringToMD5 = MD5Util.stringToMD5(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("md5Authorization = ");
        sb2.append(strStringToMD5);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$doOkHttpPostRx$0(File file, String str, String str2, Map map, mob mobVar) throws Exception {
        OkHttpClient okHttpClient = new OkHttpClient();
        StringBuilder sb = new StringBuilder();
        sb.append("file = ");
        sb.append(file);
        sb.append(", language = ");
        sb.append(str);
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        type.addFormDataPart("file", file.getName(), RequestBody.create(file, MediaType.parse("audio/mpeg")));
        type.addFormDataPart(BaseCallActivity.f25142j2, str);
        try {
            Response responseExecute = okHttpClient.newCall(new Request.Builder().url(str2).headers(Headers.m18734of((Map<String, String>) map)).addHeader(go7.f40586w, new URL(str2).getHost()).post(type.build()).build()).execute();
            if (!responseExecute.isSuccessful()) {
                mobVar.onError(new Throwable("HTTP error " + responseExecute.code()));
                return;
            }
            String strString = responseExecute.body().string();
            HashMap map2 = new HashMap();
            map2.put("body", strString);
            mobVar.onNext(map2);
            mobVar.onComplete();
        } catch (IOException e) {
            mobVar.onError(e);
        }
    }

    private void loadData() {
        try {
            Map<String, String> mapBuildHttpHeader = buildHttpHeader();
            String str = e10.f31489e + e10.f31493i;
            StringBuilder sb = new StringBuilder();
            sb.append("uri = ");
            sb.append(str);
            doOkHttpPostRx(str, mapBuildHttpHeader, this.mFile, this.language).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new oxb<Map<String, Object>>() { // from class: com.watchfun.transcommon.gpt.presenter.GptAiAudioFilePresenter.1
                @Override // p000.oxb
                public void onComplete() {
                }

                @Override // p000.oxb
                public void onError(Throwable th) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("e = ");
                    sb2.append(th);
                }

                @Override // p000.oxb
                public void onSubscribe(mf4 mf4Var) {
                }

                @Override // p000.oxb
                public void onNext(Map<String, Object> map) {
                    Object obj;
                    if (map != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("stringObjectMap============");
                        sb2.append(map.toString());
                        String string = map.get("body").toString();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("body============");
                        sb3.append(string);
                        Map map2 = (Map) new Gson().fromJson(string, HashMap.class);
                        if (!map2.containsKey("data") || (obj = map2.get("data")) == null) {
                            return;
                        }
                        String string2 = obj.toString();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("data============");
                        sb4.append(string2);
                        GptAiAudioFilePresenter.this.mGPTAudioView.loadRecListSuccess(string2, false, false, false);
                    }
                }
            });
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("e = ");
            sb2.append(e.toString());
            throw new RuntimeException(e);
        }
    }

    public Observable<Map<String, Object>> doOkHttpPostRx(final String str, final Map<String, String> map, final File file, final String str2) {
        return Observable.create(new dsb() { // from class: m87
            @Override // p000.dsb
            public final void subscribe(mob mobVar) throws Exception {
                GptAiAudioFilePresenter.lambda$doOkHttpPostRx$0(file, str2, str, map, mobVar);
            }
        });
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiGPTAudioFilePresenter
    public void refreshData(File file, String str) {
        this.mFile = file;
        this.language = str;
        StringBuilder sb = new StringBuilder();
        sb.append("mFile = ");
        sb.append(this.mFile);
        sb.append(", language = ");
        sb.append(str);
        loadData();
    }
}
