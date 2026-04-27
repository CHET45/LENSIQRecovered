package com.watchfun.voicenotes.api;

import com.watchfun.voicenotes.bean.SaveVoiceNoteReq;
import com.watchfun.voicenotes.bean.SaveVoiceNoteResp;
import com.watchfun.voicenotes.bean.UpdateNoteTitleReq;
import com.watchfun.voicenotes.bean.VoiceNoteLimitTimeResp;
import io.reactivex.Observable;
import p000.hr0;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes7.dex */
public interface ApiService {
    @GET(ApiPath.VOICE_NOTE_GET_LIMIT_TIME)
    Observable<hr0<VoiceNoteLimitTimeResp>> queryVoiceNodeLimitTime();

    @POST(ApiPath.SAVE_VOICE_NOTE)
    Observable<hr0<SaveVoiceNoteResp>> saveVoiceNote(@Body SaveVoiceNoteReq saveVoiceNoteReq);

    @POST(ApiPath.UPDATE_VOICE_NOTE_TITLE)
    Observable<hr0<Boolean>> updateVoiceNoteTitle(@Body UpdateNoteTitleReq updateNoteTitleReq);
}
