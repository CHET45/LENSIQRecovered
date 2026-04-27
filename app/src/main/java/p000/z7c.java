package p000;

import com.eyevue.common.bean.ota.OtaBean;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
public interface z7c {
    @GET(h10.f41941C)
    Observable<hr0<OtaBean>> checkoutOtaVersion(@Query("deviceVersion") String version, @Query(g55.f38796e) String code);
}
