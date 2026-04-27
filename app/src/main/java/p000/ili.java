package p000;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes4.dex */
public interface ili {
    @GET
    Observable<String> deleteFile(@Url String fullFileUrl);

    @GET
    Observable<ResponseBody> getAllDeviceThumbnailList(@Url String fullFileUrl);

    @GET(h10.f41970y)
    Observable<String> getDevicePhotoList();

    @GET(h10.f41971z)
    Observable<String> getDevicePhotoList_Ap();

    @GET
    Observable<String> setData(@Url String fullUrl);

    @GET
    Observable<String> setTime(@Url String fullUrl);

    @GET
    Observable<String> startLive(@Url String fullUrl);
}
