package p000;

import com.eyevue.common.bean.adconfig.AdConfigDataBean;
import com.eyevue.common.bean.adconfig.AdConfigInfoBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface tc8 {

    /* JADX INFO: renamed from: tc8$a */
    public interface InterfaceC12977a extends jt0<InterfaceC12978b> {
        void requestData(int id);
    }

    /* JADX INFO: renamed from: tc8$b */
    public interface InterfaceC12978b extends wu0 {
        void onGetDataFail();

        void onGetDataSuccess(AdConfigInfoBean adConfigData, boolean isCache, boolean isRefresh);
    }

    /* JADX INFO: renamed from: tc8$c */
    public interface InterfaceC12979c extends jt0<InterfaceC12980d> {
        void requestData();
    }

    /* JADX INFO: renamed from: tc8$d */
    public interface InterfaceC12980d extends wu0 {
        void onGetDataFail();

        void onGetDataSuccess(List<AdConfigDataBean> adConfigData, boolean isCache, boolean isRefresh);
    }
}
