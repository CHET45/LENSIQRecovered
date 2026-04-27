package com.watchfun.transcommon.gpt.presenter;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.watchfun.transcommon.ApiPath;
import com.watchfun.transcommon.gpt.GPTContract;
import com.watchfun.transcommon.gpt.GPTResponseData;
import com.watchfun.transcommon.utils.MD5Util;
import io.reactivex.Observable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MediaType;
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
public class GptAiTextToAudioPresenter implements GPTContract.AiGPTTextToAudioPresenter {
    private static final String TAG = "GptAiTextToAudioPresenter";
    private String mContents;
    private Context mContext;
    private String mFilePath;
    private final GPTContract.AiGPTTextToAudioView mGPTAudioView;
    private String mLanguage;
    private float mSpeed;
    private GPTResponseData resultData;

    public GptAiTextToAudioPresenter(GPTContract.AiGPTTextToAudioView aiGPTTextToAudioView) {
        this.mGPTAudioView = aiGPTTextToAudioView;
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
    public /* synthetic */ void lambda$doOkHttpPostRx$0(String str, String str2, Map map, mob mobVar) throws Exception {
        OkHttpClient okHttpClient = new OkHttpClient();
        StringBuilder sb = new StringBuilder();
        sb.append(" mContents = ");
        sb.append(str);
        try {
            Response responseExecute = okHttpClient.newCall(new Request.Builder().url(str2).headers(Headers.m18734of((Map<String, String>) map)).addHeader(go7.f40586w, new URL(str2).getHost()).post(RequestBody.create(new Gson().toJson(new ContentRequest(str, this.mLanguage, this.mSpeed)), MediaType.parse("application/json; charset=utf-8"))).build()).execute();
            if (!responseExecute.isSuccessful()) {
                mobVar.onError(new Throwable("HTTP error " + responseExecute.code()));
                return;
            }
            InputStream inputStreamByteStream = responseExecute.body().byteStream();
            File file = TextUtils.isEmpty(this.mFilePath) ? new File(this.mContext.getFilesDir(), "audio_output.mp3") : new File(this.mFilePath);
            saveToFile(inputStreamByteStream, file);
            HashMap map2 = new HashMap();
            map2.put("file", file);
            mobVar.onNext(map2);
            mobVar.onComplete();
        } catch (IOException e) {
            mobVar.onError(e);
        }
    }

    private void loadData() {
        try {
            doOkHttpPostRx(e10.f31489e + "audio/tts", buildHttpHeader(), this.mContents).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new oxb<Map<String, Object>>() { // from class: com.watchfun.transcommon.gpt.presenter.GptAiTextToAudioPresenter.1
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
                    if (map == null || map.get("file") == null) {
                        return;
                    }
                    File file = (File) map.get("file");
                    StringBuilder sb = new StringBuilder();
                    sb.append("音频文件已保存到: ");
                    sb.append(file != null ? file.getAbsolutePath() : "未知路径");
                    GptAiTextToAudioPresenter.this.mGPTAudioView.loadAudioListSuccess(file);
                }
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void loadDataBySpeed() {
        try {
            doOkHttpPostRx(e10.f31489e + ApiPath.GPT_AUDIO_V2, buildHttpHeader(), this.mContents).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new oxb<Map<String, Object>>() { // from class: com.watchfun.transcommon.gpt.presenter.GptAiTextToAudioPresenter.2
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
                    if (map == null || map.get("file") == null) {
                        return;
                    }
                    File file = (File) map.get("file");
                    StringBuilder sb = new StringBuilder();
                    sb.append("音频文件已保存到: ");
                    sb.append(file != null ? file.getAbsolutePath() : "未知路径");
                    GptAiTextToAudioPresenter.this.mGPTAudioView.loadAudioListSuccess(file);
                }
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void saveToFile(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public Observable<Map<String, Object>> doOkHttpPostRx(final String str, final Map<String, String> map, final String str2) {
        return Observable.create(new dsb() { // from class: n87
            @Override // p000.dsb
            public final void subscribe(mob mobVar) throws Exception {
                this.f63487a.lambda$doOkHttpPostRx$0(str2, str, map, mobVar);
            }
        });
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiGPTTextToAudioPresenter
    public void refreshData(Context context, String str, String str2, String str3) {
        this.mContext = context;
        this.mContents = str;
        this.mLanguage = str2;
        this.mFilePath = str3;
        loadData();
    }

    public void refreshDataBySpeed(Context context, String str, String str2, String str3, float f) {
        this.mContext = context;
        this.mContents = str;
        this.mLanguage = str2;
        this.mFilePath = str3;
        this.mSpeed = f;
        loadDataBySpeed();
    }

    public class ContentRequest {
        private String content;
        private String language;
        private float voiceSpeed;

        public ContentRequest(String str, String str2) {
            this.content = str;
            this.language = str2;
        }

        public String getContent() {
            return this.content;
        }

        public String getLanguage() {
            return this.language;
        }

        public float getVoiceSpeed() {
            return this.voiceSpeed;
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setLanguage(String str) {
            this.language = str;
        }

        public void setVoiceSpeed(float f) {
            this.voiceSpeed = f;
        }

        public ContentRequest(String str, String str2, float f) {
            this.content = str;
            this.language = str2;
            this.voiceSpeed = f;
        }
    }
}
