package com.watchfun.transcommon.gpt.presenter;

import com.google.gson.Gson;
import com.watchfun.transcommon.ApiPath;
import com.watchfun.transcommon.bean.p012ai.ChatMessageDTO;
import com.watchfun.transcommon.gpt.GPTContract;
import com.watchfun.transcommon.gpt.presenter.GptCompletionsPresenter;
import com.watchfun.transcommon.utils.MD5Util;
import io.reactivex.Observable;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import p000.C2062bv;
import p000.C2133c;
import p000.C6875hk;
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
public class GptCompletionsPresenter implements GPTContract.AiGPTDialoguePresenter {
    private static final String TAG = "GptCompletionsPresenter";
    private ChatMessageDTO mChatMessageDTO;
    private final GPTContract.AiDialogueView mGPTView;

    public GptCompletionsPresenter(GPTContract.AiDialogueView aiDialogueView) {
        this.mGPTView = aiDialogueView;
    }

    private Map<String, String> buildHttpHeader() throws Exception {
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        String strStringToMD5 = MD5Util.stringToMD5(e10.f31486b + e10.f31487c + strValueOf);
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
    public static /* synthetic */ void lambda$doOkHttpGetRx$1(String str, Map map, mob mobVar) throws Exception {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request requestBuild = new Request.Builder().url(str).headers(Headers.m18734of((Map<String, String>) map)).addHeader(go7.f40586w, new URL(str).getHost()).get().build();
        StringBuilder sb = new StringBuilder();
        sb.append("headers:");
        sb.append(map.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("url: ");
        sb2.append(str);
        try {
            Response responseExecute = okHttpClient.newCall(requestBuild).execute();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$doOkHttpPostRx$0(Map map, String str, Map map2, mob mobVar) throws Exception {
        OkHttpClient okHttpClient = new OkHttpClient();
        String json = new Gson().toJson(map);
        StringBuilder sb = new StringBuilder();
        sb.append("JSON = ");
        sb.append(json);
        RequestBody requestBodyCreate = RequestBody.create(json, MediaType.parse("application/json; charset=utf-8"));
        new URL(str).getHost();
        try {
            Response responseExecute = okHttpClient.newCall(new Request.Builder().url(str).headers(Headers.m18734of((Map<String, String>) map2)).post(requestBodyCreate).build()).execute();
            if (!responseExecute.isSuccessful()) {
                mobVar.onError(new Throwable("HTTP error " + responseExecute.code()));
                return;
            }
            String strString = responseExecute.body().string();
            HashMap map3 = new HashMap();
            map3.put("body", strString);
            mobVar.onNext(map3);
            mobVar.onComplete();
        } catch (IOException e) {
            mobVar.onError(e);
        }
    }

    private void loadData(List<C2133c.b> list) {
        C6875hk.getInstance().sendChatCmd(list, this.mChatMessageDTO.getContent());
    }

    public Observable<Map<String, Object>> doOkHttpGetRx(final String str, final Map<String, String> map) {
        return Observable.create(new dsb() { // from class: s87
            @Override // p000.dsb
            public final void subscribe(mob mobVar) throws Exception {
                GptCompletionsPresenter.lambda$doOkHttpGetRx$1(str, map, mobVar);
            }
        });
    }

    public Observable<Map<String, Object>> doOkHttpPostRx(final String str, final Map<String, String> map, final Map<String, Object> map2) {
        return Observable.create(new dsb() { // from class: r87
            @Override // p000.dsb
            public final void subscribe(mob mobVar) throws Exception {
                GptCompletionsPresenter.lambda$doOkHttpPostRx$0(map2, str, map, mobVar);
            }
        });
    }

    public void getAiModelList(boolean z) {
        try {
            doOkHttpGetRx(e10.f31489e + ApiPath.AI_MODEL_LIST, buildHttpHeader()).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new oxb<Map<String, Object>>() { // from class: com.watchfun.transcommon.gpt.presenter.GptCompletionsPresenter.1
                @Override // p000.oxb
                public void onComplete() {
                }

                @Override // p000.oxb
                public void onError(Throwable th) {
                }

                @Override // p000.oxb
                public void onSubscribe(mf4 mf4Var) {
                }

                @Override // p000.oxb
                public void onNext(Map<String, Object> map) {
                    Object obj;
                    if (map == null || (obj = map.get("body")) == null) {
                        return;
                    }
                    String string = obj.toString();
                    StringBuilder sb = new StringBuilder();
                    sb.append("【getAiModelList】\n");
                    sb.append(string);
                    Map map2 = (Map) new Gson().fromJson(string, HashMap.class);
                    if (!map2.containsKey("data") || map2.get("data") == null) {
                        return;
                    }
                    String string2 = map2.get("data").toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("data============");
                    sb2.append(string2);
                }
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiGPTDialoguePresenter
    public void refreshData(List<C2133c.b> list, ChatMessageDTO chatMessageDTO) {
        this.mChatMessageDTO = chatMessageDTO;
        loadData(list);
    }
}
