package p000;

import com.eyevue.common.bean.ProjectInfoBean;
import com.eyevue.common.bean.SupportDeviceBean;
import com.eyevue.common.bean.adconfig.AdConfigDataBean;
import com.eyevue.common.bean.adconfig.AdConfigInfoBean;
import com.eyevue.common.bean.authcode.AuthCode;
import com.eyevue.common.bean.authcode.CheckDeviceNameBean;
import com.eyevue.common.bean.feedback.FeedbackTypeBean;
import com.eyevue.common.bean.feedback.SaveFeedbackBean;
import com.eyevue.common.bean.login.UserBean;
import com.eyevue.common.bean.login.UserInfoBean;
import com.eyevue.common.bean.login.UserTokenBean;
import com.eyevue.common.bean.update.VersionData;
import io.reactivex.Observable;
import java.util.List;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
public interface k10 {
    @GET(h10.f41948c)
    Observable<hr0<List<AdConfigDataBean>>> getAdConfigData();

    @GET(h10.f41949d)
    Observable<hr0<AdConfigInfoBean>> getAdConfigInfo(@Query("id") int id);

    @POST(h10.f41969x)
    Observable<hr0<CheckDeviceNameBean>> getCheckDeviceNameData(@Body AuthCode authcode);

    @GET(h10.f41951f)
    Observable<hr0<VersionData>> getCheckVersionInfo();

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(h10.f41958m)
    Observable<hr0<UserTokenBean>> getEmailLoginData(@Body UserBean userBean);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(h10.f41962q)
    Observable<hr0<String>> getEmailsCodeData(@Body UserBean userBean);

    @GET(h10.f41952g)
    Observable<hr0<List<FeedbackTypeBean>>> getFeedbackTypeData();

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(h10.f41954i)
    Observable<hr0<UserTokenBean>> getLoginData(@Body UserBean userBean);

    @GET(h10.f41947b)
    Observable<hr0<ProjectInfoBean>> getProjectData(@Query("equipmentCode") String equipmentCode);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(h10.f41955j)
    Observable<hr0<String>> getSmsCodeData(@Body UserBean userBean);

    @GET(h10.f41945G)
    Observable<hr0<List<SupportDeviceBean>>> getSupportDeviceList();

    @GET(h10.f41957l)
    Observable<hr0<UserInfoBean>> getUserInfoData();

    @POST(h10.f41961p)
    Observable<hr0<String>> postAccountLogout();

    @POST(h10.f41960o)
    Observable<hr0<String>> postFindPassword(@Body UserBean userBean);

    @POST(h10.f41950e)
    Observable<hr0<String>> postRegisterTourist();

    @POST(h10.f41959n)
    Observable<hr0<UserTokenBean>> postRegisterUser(@Body UserBean userBean);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(h10.f41956k)
    Observable<hr0<UserTokenBean>> refreshToken(@Body UserBean userBean);

    @POST(h10.f41953h)
    Observable<hr0<String>> submitFeedbackData(@Body SaveFeedbackBean saveFeedbackBean);

    @POST(h10.f41968w)
    Observable<hr0<String>> submitQRCodeData(@Body AuthCode authcode);

    @POST(h10.f41963r)
    Observable<hr0<String>> updateUserInfoData(@Body UserInfoBean userInfo);
}
