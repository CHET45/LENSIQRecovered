package p000;

import com.watchfun.transcommon.bean.callvideo.VideoTalkAppParamVO;
import com.watchfun.transcommon.bean.callvideo.VideoTalkBean;
import com.watchfun.transcommon.net.AiApiService;
import p000.h75;

/* JADX INFO: loaded from: classes6.dex */
public class v5i {

    /* JADX INFO: renamed from: a */
    public final AiApiService f90041a;

    /* JADX INFO: renamed from: v5i$a */
    public class C13880a extends us0<VideoTalkAppParamVO> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f90042f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13880a(String str, boolean z, boolean z2, tg3 tg3Var) {
            super(str, z, z2);
            this.f90042f = tg3Var;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 mf4Var) {
            this.f90042f.addNetDisposable(mf4Var);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a c6732a) {
            this.f90042f.onLoadError(c6732a.getCode(), c6732a.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<VideoTalkAppParamVO> hr0Var, boolean z) {
            if (hr0Var.isSuccess()) {
                this.f90042f.onLoadSuccess(hr0Var, z);
            } else {
                this.f90042f.onLoadError(1002, hr0Var.getMsg());
            }
        }
    }

    public v5i() {
        o8e.clearCache();
        this.f90041a = (AiApiService) o8e.getService(AiApiService.class, e10.f31488d);
    }

    public void getVideoCallTalkPath(VideoTalkBean videoTalkBean, tg3<VideoTalkAppParamVO> tg3Var) {
        this.f90041a.postCallVoiceTalk(videoTalkBean).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C13880a("", false, false, tg3Var));
    }
}
