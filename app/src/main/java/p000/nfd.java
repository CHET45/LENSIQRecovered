package p000;

import com.eyevue.common.bean.ProjectInfoBean;

/* JADX INFO: loaded from: classes4.dex */
public interface nfd {

    /* JADX INFO: renamed from: nfd$a */
    public interface InterfaceC9861a extends jt0<InterfaceC9862b> {
        void requestData(String equipmentCode);
    }

    /* JADX INFO: renamed from: nfd$b */
    public interface InterfaceC9862b extends wu0 {
        void onGetDataFail();

        void onGetDataSuccess(ProjectInfoBean projectInfo, boolean isCache, boolean isRefresh);
    }
}
