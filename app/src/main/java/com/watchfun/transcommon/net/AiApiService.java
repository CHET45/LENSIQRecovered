package com.watchfun.transcommon.net;

import com.watchfun.callvideo.base.BaseCallActivity;
import com.watchfun.transcommon.ApiPath;
import com.watchfun.transcommon.bean.callvideo.VideoTalkAppParamVO;
import com.watchfun.transcommon.bean.callvideo.VideoTalkBean;
import com.watchfun.transcommon.bean.photo.PhotoTransBean;
import io.reactivex.Observable;
import java.util.Map;
import okhttp3.MultipartBody;
import p000.hr0;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
public interface AiApiService {
    @POST(ApiPath.CALL_VOICE_TALK_PATH)
    Observable<hr0<VideoTalkAppParamVO>> postCallVoiceTalk(@Body VideoTalkBean videoTalkBean);

    @POST(ApiPath.PHOTO_TRANSLATE_OLD_PATH)
    @Multipart
    Observable<hr0<PhotoTransBean>> postOldPhotoTranslate(@Part MultipartBody.Part part, @Query(BaseCallActivity.f25142j2) String str, @Query("tarLanguage") String str2, @HeaderMap Map<String, String> map);

    @POST(ApiPath.PHOTO_TRANSLATE_PATH)
    @Multipart
    Observable<hr0<PhotoTransBean>> postPhotoTranslate(@Part MultipartBody.Part part, @Query(BaseCallActivity.f25142j2) String str, @Query("tarLanguage") String str2, @HeaderMap Map<String, String> map);
}
