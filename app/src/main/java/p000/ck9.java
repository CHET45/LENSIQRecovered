package p000;

import com.eyevue.common.bean.login.UserBean;
import com.eyevue.common.bean.login.UserInfoBean;
import com.eyevue.common.bean.login.UserTokenBean;

/* JADX INFO: loaded from: classes4.dex */
public interface ck9 {

    /* JADX INFO: renamed from: ck9$a */
    public interface InterfaceC2346a extends jt0<InterfaceC2347b> {
        void requestData(String mobile);
    }

    /* JADX INFO: renamed from: ck9$b */
    public interface InterfaceC2347b extends wu0 {
        void onGetDataFail();

        void onGetDataSuccess(String status, boolean isCache, boolean isRefresh);
    }

    /* JADX INFO: renamed from: ck9$c */
    public interface InterfaceC2348c extends jt0<InterfaceC2349d> {
        void requestData(UserBean userBean);
    }

    /* JADX INFO: renamed from: ck9$d */
    public interface InterfaceC2349d extends wu0 {
        void onGetDataFail(String msg);

        void onGetDataSuccess(String s);
    }

    /* JADX INFO: renamed from: ck9$e */
    public interface InterfaceC2350e extends jt0<InterfaceC2351f> {
        void requestData(String mobile, String code);
    }

    /* JADX INFO: renamed from: ck9$f */
    public interface InterfaceC2351f extends wu0 {
        void onGetDataFail(int code, String msg);

        void onGetDataSuccess(UserTokenBean userInfo, boolean isCache, boolean isRefresh);
    }

    /* JADX INFO: renamed from: ck9$g */
    public interface InterfaceC2352g extends jt0<InterfaceC2353h> {
        void requestData();
    }

    /* JADX INFO: renamed from: ck9$h */
    public interface InterfaceC2353h extends wu0 {
        void onGetDataFail(int code, String msg);

        void onGetDataSuccess(int code);
    }

    /* JADX INFO: renamed from: ck9$i */
    public interface InterfaceC2354i extends jt0<InterfaceC2355j> {
        void requestData();
    }

    /* JADX INFO: renamed from: ck9$j */
    public interface InterfaceC2355j extends wu0 {
        void onGetDataFail();

        void onGetDataSuccess(UserTokenBean userTokenVO, boolean isCache, boolean isRefresh);
    }

    /* JADX INFO: renamed from: ck9$k */
    public interface InterfaceC2356k extends jt0<InterfaceC2357l> {
        void requestData(UserBean userBean);
    }

    /* JADX INFO: renamed from: ck9$l */
    public interface InterfaceC2357l extends wu0 {
        void onGetDataFail(int code, String msg);

        void onGetDataSuccess(int code, UserTokenBean userTokenVO);
    }

    /* JADX INFO: renamed from: ck9$m */
    public interface InterfaceC2358m extends jt0<InterfaceC2359n> {
        void requestData();
    }

    /* JADX INFO: renamed from: ck9$n */
    public interface InterfaceC2359n extends wu0 {
        void onGetDataFail();

        void onGetDataSuccess(String status, boolean isCache, boolean isRefresh);
    }

    /* JADX INFO: renamed from: ck9$o */
    public interface InterfaceC2360o extends jt0<InterfaceC2361p> {
        void requestData(String mobile);
    }

    /* JADX INFO: renamed from: ck9$p */
    public interface InterfaceC2361p extends wu0 {
        void onGetDataFail();

        void onGetDataSuccess(String status, boolean isCache, boolean isRefresh);
    }

    /* JADX INFO: renamed from: ck9$q */
    public interface InterfaceC2362q extends jt0<InterfaceC2363r> {
        void requestData(UserInfoBean userInfo);
    }

    /* JADX INFO: renamed from: ck9$r */
    public interface InterfaceC2363r extends wu0 {
        void onGetDataFail(int code);

        void onGetDataSuccess(String string, boolean isCache, boolean isRefresh);
    }

    /* JADX INFO: renamed from: ck9$s */
    public interface InterfaceC2364s extends jt0<InterfaceC2365t> {
        void requestData();
    }

    /* JADX INFO: renamed from: ck9$t */
    public interface InterfaceC2365t extends wu0 {
        void onGetDataFail(int code);

        void onGetDataSuccess(UserInfoBean userInfo, boolean isCache, boolean isRefresh);
    }
}
