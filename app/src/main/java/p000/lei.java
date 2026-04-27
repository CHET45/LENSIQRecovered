package p000;

import com.watchfun.voicenotes.api.AiVoiceNoteApi;
import com.watchfun.voicenotes.api.ApiPath;
import com.watchfun.voicenotes.api.ApiService;
import com.watchfun.voicenotes.bean.SaveVoiceNoteReq;
import com.watchfun.voicenotes.bean.SaveVoiceNoteResp;
import com.watchfun.voicenotes.bean.UpdateNoteTitleReq;
import com.watchfun.voicenotes.bean.VoiceNoteLimitTimeResp;
import p000.h75;

/* JADX INFO: loaded from: classes7.dex */
public class lei {

    /* JADX INFO: renamed from: a */
    public final ApiService f57411a = n8e.getApiService();

    /* JADX INFO: renamed from: lei$a */
    public class C8800a extends us0<SaveVoiceNoteResp> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f57412f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8800a(String str, boolean z, boolean z2, tg3 tg3Var) {
            super(str, z, z2);
            this.f57412f = tg3Var;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 mf4Var) {
            this.f57412f.addNetDisposable(mf4Var);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a c6732a) {
            zi9.dOnlyEvent("appName = " + C9389ml.getInstance().getAppName() + " reqHost=" + AiVoiceNoteApi.BASE_URL + " reqUrl =" + ApiPath.SAVE_VOICE_NOTE + " reqProtol = https  resCode=" + c6732a.getCode() + " resMsg=" + c6732a.getMessage());
            this.f57412f.onLoadError(c6732a.getCode(), c6732a.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<SaveVoiceNoteResp> hr0Var, boolean z) {
            zi9.dOnlyEvent("appName = " + C9389ml.getInstance().getAppName() + " reqHost=" + AiVoiceNoteApi.BASE_URL + " reqUrl =" + ApiPath.SAVE_VOICE_NOTE + " reqProtol = https  resCode=" + hr0Var.getCode() + " resMsg=" + hr0Var.getMsg());
            if (hr0Var.isSuccess()) {
                this.f57412f.onLoadSuccess(hr0Var, z);
            } else {
                this.f57412f.onLoadError(1002, hr0Var.getMsg());
            }
        }
    }

    /* JADX INFO: renamed from: lei$b */
    public class C8801b extends us0<Boolean> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f57414f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8801b(String str, boolean z, boolean z2, tg3 tg3Var) {
            super(str, z, z2);
            this.f57414f = tg3Var;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 mf4Var) {
            this.f57414f.addNetDisposable(mf4Var);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a c6732a) {
            zi9.dOnlyEvent("appName = " + C9389ml.getInstance().getAppName() + " reqHost=" + AiVoiceNoteApi.BASE_URL + " reqUrl =" + ApiPath.UPDATE_VOICE_NOTE_TITLE + " reqProtol = https  resCode=" + c6732a.getCode() + " resMsg=" + c6732a.getMessage());
            this.f57414f.onLoadError(c6732a.getCode(), c6732a.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<Boolean> hr0Var, boolean z) {
            zi9.dOnlyEvent("appName = " + C9389ml.getInstance().getAppName() + " reqHost=" + AiVoiceNoteApi.BASE_URL + " reqUrl =" + ApiPath.UPDATE_VOICE_NOTE_TITLE + " reqProtol = https  resCode=" + hr0Var.getCode() + " resMsg=" + hr0Var.getMsg());
            if (hr0Var.isSuccess()) {
                this.f57414f.onLoadSuccess(hr0Var, z);
            } else {
                this.f57414f.onLoadError(1002, hr0Var.getMsg());
            }
        }
    }

    /* JADX INFO: renamed from: lei$c */
    public class C8802c extends us0<VoiceNoteLimitTimeResp> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f57416f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8802c(String str, boolean z, boolean z2, tg3 tg3Var) {
            super(str, z, z2);
            this.f57416f = tg3Var;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 mf4Var) {
            this.f57416f.addNetDisposable(mf4Var);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a c6732a) {
            this.f57416f.onLoadError(c6732a.getCode(), c6732a.getMessage());
            zi9.dOnlyEvent("appName = " + C9389ml.getInstance().getAppName() + " reqHost=" + AiVoiceNoteApi.BASE_URL + " reqUrl =" + ApiPath.VOICE_NOTE_GET_LIMIT_TIME + " reqProtol = https  resCode=" + c6732a.getCode() + " resMsg=" + c6732a.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<VoiceNoteLimitTimeResp> hr0Var, boolean z) {
            zi9.dOnlyEvent("appName = " + C9389ml.getInstance().getAppName() + " reqHost=" + AiVoiceNoteApi.BASE_URL + " reqUrl =" + ApiPath.VOICE_NOTE_GET_LIMIT_TIME + " reqProtol = https  resCode=" + hr0Var.getCode() + " resMsg=" + hr0Var.getMsg());
            if (hr0Var.isSuccess()) {
                this.f57416f.onLoadSuccess(hr0Var, z);
            } else {
                this.f57416f.onLoadError(1002, hr0Var.getMsg());
            }
        }
    }

    public void queryVoiceNodeLimitTime(tg3<VoiceNoteLimitTimeResp> tg3Var) {
        this.f57411a.queryVoiceNodeLimitTime().subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C8802c("", false, false, tg3Var));
    }

    public void saveVoiceNote(SaveVoiceNoteReq saveVoiceNoteReq, tg3<SaveVoiceNoteResp> tg3Var) {
        this.f57411a.saveVoiceNote(saveVoiceNoteReq).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C8800a("", false, false, tg3Var));
    }

    public void updateNoteTitle(UpdateNoteTitleReq updateNoteTitleReq, tg3<Boolean> tg3Var) {
        this.f57411a.updateVoiceNoteTitle(updateNoteTitleReq).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C8801b("", false, false, tg3Var));
    }
}
