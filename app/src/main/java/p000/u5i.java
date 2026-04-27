package p000;

import com.watchfun.transcommon.bean.callvideo.VideoTalkAppParamVO;
import com.watchfun.transcommon.bean.callvideo.VideoTalkBean;

/* JADX INFO: loaded from: classes6.dex */
public interface u5i {

    /* JADX INFO: renamed from: u5i$a */
    public interface InterfaceC13372a extends jt0<InterfaceC13373b> {
        void refreshData(VideoTalkBean videoTalkBean);
    }

    /* JADX INFO: renamed from: u5i$b */
    public interface InterfaceC13373b extends wu0 {
        void loadFail(int i, String str);

        void setDataSuccess(VideoTalkAppParamVO videoTalkAppParamVO, boolean z);
    }
}
