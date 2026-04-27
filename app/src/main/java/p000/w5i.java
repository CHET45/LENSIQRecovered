package p000;

import android.util.Log;
import com.watchfun.transcommon.bean.callvideo.VideoTalkAppParamVO;
import com.watchfun.transcommon.bean.callvideo.VideoTalkBean;
import p000.u5i;

/* JADX INFO: loaded from: classes6.dex */
public class w5i implements u5i.InterfaceC13372a {

    /* JADX INFO: renamed from: d */
    public static final String f93383d = "VideoCallTalkPathPresenter";

    /* JADX INFO: renamed from: a */
    public final u5i.InterfaceC13373b f93384a;

    /* JADX INFO: renamed from: b */
    public final v5i f93385b = new v5i();

    /* JADX INFO: renamed from: c */
    public VideoTalkBean f93386c;

    /* JADX INFO: renamed from: w5i$a */
    public class C14434a implements tg3<VideoTalkAppParamVO> {
        public C14434a() {
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 mf4Var) {
        }

        @Override // p000.tg3
        public void onLoadError(int i, String str) {
            Log.i("aaaaaaaa", "code =" + i + "--------msg =" + str);
            w5i.this.f93384a.loadFail(i, str);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<VideoTalkAppParamVO> hr0Var, boolean z) {
            if (hr0Var != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" t =");
                sb.append(hr0Var);
                if (hr0Var.getData() == null) {
                    w5i.this.f93384a.loadFail(hr0Var.getCode(), hr0Var.getMsg());
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" t 222  =");
                sb2.append(hr0Var.getData());
                if (w5i.this.f93384a == null || hr0Var.getData() == null) {
                    return;
                }
                w5i.this.f93384a.setDataSuccess(hr0Var.getData(), false);
            }
        }
    }

    public w5i(u5i.InterfaceC13373b interfaceC13373b) {
        this.f93384a = interfaceC13373b;
    }

    public void loadData(VideoTalkBean videoTalkBean) {
        this.f93385b.getVideoCallTalkPath(videoTalkBean, new C14434a());
    }

    @Override // p000.u5i.InterfaceC13372a
    public void refreshData(VideoTalkBean videoTalkBean) {
        loadData(videoTalkBean);
    }
}
