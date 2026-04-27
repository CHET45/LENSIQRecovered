package p000;

import com.eyevue.common.bean.authcode.CheckDeviceNameBean;

/* JADX INFO: loaded from: classes4.dex */
public interface mkd {

    /* JADX INFO: renamed from: mkd$a */
    public interface InterfaceC9383a extends jt0<InterfaceC9384b> {
        void requestData(String qrCode);
    }

    /* JADX INFO: renamed from: mkd$b */
    public interface InterfaceC9384b extends wu0 {
        void onGetDataFail(int code, String msg);

        void onGetDataSuccess(CheckDeviceNameBean deviceNameVO, boolean isCache, boolean isRefresh);
    }

    /* JADX INFO: renamed from: mkd$c */
    public interface InterfaceC9385c extends jt0<InterfaceC9386d> {
        void requestData(String qrCode);
    }

    /* JADX INFO: renamed from: mkd$d */
    public interface InterfaceC9386d extends wu0 {
        void onGetDataFail(int code, String msg);

        void onGetDataSuccess(String status, boolean isCache, boolean isRefresh);
    }
}
