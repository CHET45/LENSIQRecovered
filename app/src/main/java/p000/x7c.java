package p000;

import com.eyevue.common.bean.ota.OtaBean;

/* JADX INFO: loaded from: classes4.dex */
public interface x7c {

    /* JADX INFO: renamed from: x7c$a */
    public interface InterfaceC14969a extends jt0<InterfaceC14970b> {
        void requestData(String version, String customer);
    }

    /* JADX INFO: renamed from: x7c$b */
    public interface InterfaceC14970b extends wu0 {
        void onGetDataFail(int code, String msg);

        void onGetDataSuccess(OtaBean userInfo, boolean isCache, boolean isRefresh);
    }
}
