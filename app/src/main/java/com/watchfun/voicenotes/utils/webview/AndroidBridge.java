package com.watchfun.voicenotes.utils.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import com.watchfun.callvideo.base.BaseCallActivity;
import com.watchfun.transcommon.selectlau.SelectTransActivity;
import com.watchfun.voicenotes.C4297R;
import com.watchfun.voicenotes.api.AiVoiceNoteApi;
import com.watchfun.voicenotes.api.ApiPath;
import com.watchfun.voicenotes.bean.H5Param;
import com.watchfun.voicenotes.database.VoiceNotesBean;
import com.watchfun.voicenotes.database.VoiceNotesDao;
import com.watchfun.voicenotes.database.VoiceNotesDatabase;
import com.watchfun.voicenotes.utils.webview.AndroidBridge;
import io.reactivex.Observable;
import java.io.File;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C2062bv;
import p000.C9389ml;
import p000.b52;
import p000.dsb;
import p000.k3h;
import p000.kfi;
import p000.l9f;
import p000.mf4;
import p000.mob;
import p000.npe;
import p000.oxb;
import p000.qt5;
import p000.sc7;
import p000.vt5;

/* JADX INFO: loaded from: classes7.dex */
public class AndroidBridge {
    public static final String SHARE_AUDIO = "audio";
    public static final String SHARE_DOC = "ShareDoc";
    public static final String SHARE_JPG = "ShareJpeg";
    public static final String SHARE_MARKDOWN = "ShareMarkdown";
    public static final String SHARE_PDF = "SharePDF";
    public static final String SHARE_TXT = "ShareTxt";
    private static final String TAG = "AndroidBridge";
    private Context context;
    private String voiceNoteId;
    private VoiceNotesDao voiceNotesDao;

    public AndroidBridge(Context context) {
        this.context = context;
        this.voiceNotesDao = VoiceNotesDatabase.getDatabase(context).messageDao();
    }

    public static String getH5ApiDomain() {
        return AiVoiceNoteApi.BASE_URL.replace("/api/", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ExportAudio$0(VoiceNotesBean voiceNotesBean, mob mobVar) throws Exception {
        if (voiceNotesBean != null) {
            String recordPath = voiceNotesBean.getRecordPath();
            if (TextUtils.isEmpty(recordPath)) {
                return;
            }
            File file = new File(recordPath);
            if (file.exists() && file.isFile()) {
                mobVar.onNext(vt5.copyShareFileToCache(voiceNotesBean.getTitle(), file));
                mobVar.onComplete();
            }
        }
    }

    private void startToSelectTransActivity(String str) {
        Intent intent = new Intent(this.context, (Class<?>) SelectTransActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(SelectTransActivity.KEY_TITLE, str);
        bundle.putString(SelectTransActivity.KEY_OTHER_TITLE, "");
        bundle.putInt(SelectTransActivity.KEY_TYPE, 1);
        bundle.putInt(SelectTransActivity.KEY_ACTION_TYPE, 6);
        intent.putExtras(bundle);
        this.context.startActivity(intent);
    }

    private void uploadFile(String str, String str2, String str3, String str4) {
        qt5 qt5Var = qt5.getInstance(this.context);
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        File file = new File(str4);
        if (file.exists() && file.isFile()) {
            String str5 = AiVoiceNoteApi.BASE_URL + ApiPath.GENERATE_SUMMARY;
            HashMap map = new HashMap();
            map.put("id", str);
            map.put(BaseCallActivity.f25142j2, str2);
            map.put("templateType", str3);
            kfi.startFileUpload(qt5Var, file, str5, map);
        }
    }

    @JavascriptInterface
    public void BackNative() {
        Context context = this.context;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    @JavascriptInterface
    public void CopyClipboard(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b52.copyText(str);
        k3h.showToastShort(C9389ml.getInstance().getAppContext().getResources().getString(C4297R.string.text_copy_success));
    }

    @JavascriptInterface
    public void Delete(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "paramStr is empty");
            return;
        }
        H5Param.DeleteParam deleteParam = (H5Param.DeleteParam) sc7.fromJson(str, H5Param.DeleteParam.class);
        if (deleteParam == null) {
            return;
        }
        this.voiceNotesDao.deleteMeetInfo(this.voiceNotesDao.findById(deleteParam.f26446id));
        Context context = this.context;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    @JavascriptInterface
    public void Export(String str) throws Throwable {
        String strOptString;
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "paramStr is empty");
            return;
        }
        try {
            strOptString = new JSONObject(str).optString("fileType");
        } catch (JSONException e) {
            Log.e(TAG, "Export: " + e);
            strOptString = "";
        }
        H5Param.ExportDocumentParam exportDocumentParam = (H5Param.ExportDocumentParam) sc7.fromJson(str, H5Param.ExportDocumentParam.class);
        if (exportDocumentParam == null) {
            return;
        }
        byte[] bArr = exportDocumentParam.fileData;
        String str2 = exportDocumentParam.fileName;
        if (TextUtils.equals(strOptString, SHARE_TXT)) {
            l9f.checkPermissionAndShareFile((Activity) this.context, 1, bArr, str2);
            return;
        }
        if (TextUtils.equals(strOptString, SHARE_DOC)) {
            l9f.checkPermissionAndShareFile((Activity) this.context, 3, bArr, str2);
            return;
        }
        if (TextUtils.equals(strOptString, SHARE_MARKDOWN)) {
            l9f.checkPermissionAndShareFile((Activity) this.context, 2, bArr, str2);
            return;
        }
        if (TextUtils.equals(strOptString, SHARE_JPG)) {
            l9f.checkPermissionAndShareFile((Activity) this.context, 4, bArr, str2);
            return;
        }
        Log.e(TAG, "Unsupported export type: " + strOptString);
    }

    @JavascriptInterface
    public void ExportAudio() {
        final VoiceNotesBean voiceNotesBeanFindById = this.voiceNotesDao.findById(this.voiceNoteId);
        Observable.create(new dsb() { // from class: cq
            @Override // p000.dsb
            public final void subscribe(mob mobVar) throws Exception {
                AndroidBridge.lambda$ExportAudio$0(voiceNotesBeanFindById, mobVar);
            }
        }).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new oxb<File>() { // from class: com.watchfun.voicenotes.utils.webview.AndroidBridge.1
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
            public void onNext(File file) {
                if (file == null || !file.exists()) {
                    Toast.makeText(AndroidBridge.this.context, "audio is not exist", 0).show();
                } else {
                    l9f.checkPermissionAndShareFile((Activity) AndroidBridge.this.context, 5, file, voiceNotesBeanFindById.getTitle());
                }
            }
        });
    }

    @JavascriptInterface
    public void GenerateSummary(String str) {
        VoiceNotesBean voiceNotesBeanFindById;
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "paramStr is empty");
            return;
        }
        H5Param.GenerateSummaryParam generateSummaryParam = (H5Param.GenerateSummaryParam) sc7.fromJson(str, H5Param.GenerateSummaryParam.class);
        if (generateSummaryParam == null || (voiceNotesBeanFindById = this.voiceNotesDao.findById(this.voiceNoteId)) == null) {
            return;
        }
        String recordPath = voiceNotesBeanFindById.getRecordPath();
        if (TextUtils.isEmpty(recordPath)) {
            return;
        }
        File file = new File(recordPath);
        if (file.exists() && file.isFile()) {
            uploadFile(this.voiceNoteId + "", generateSummaryParam.language, generateSummaryParam.templateType, recordPath);
        }
    }

    @JavascriptInterface
    public void Rename(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "paramStr is empty");
            return;
        }
        H5Param.RenameParam renameParam = (H5Param.RenameParam) sc7.fromJson(str, H5Param.RenameParam.class);
        if (renameParam == null) {
            return;
        }
        VoiceNotesBean voiceNotesBeanFindById = this.voiceNotesDao.findById(renameParam.f26448id);
        voiceNotesBeanFindById.setTitle(renameParam.name);
        this.voiceNotesDao.updateMeetInfo(voiceNotesBeanFindById);
    }

    @JavascriptInterface
    public void SelectLanguage() {
        startToSelectTransActivity("");
    }

    public void setVoiceNoteId(String str) {
        this.voiceNoteId = str;
    }
}
