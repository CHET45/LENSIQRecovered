package p000;

import com.watchfun.voicenotes.bean.SaveVoiceNoteReq;
import com.watchfun.voicenotes.bean.SaveVoiceNoteResp;
import com.watchfun.voicenotes.bean.UpdateNoteTitleReq;

/* JADX INFO: loaded from: classes7.dex */
public interface jei {

    /* JADX INFO: renamed from: jei$a */
    public interface InterfaceC7888a extends jt0<InterfaceC7889b> {
        void queryVoiceNodeLimitTime();

        void saveVoiceNote(SaveVoiceNoteReq saveVoiceNoteReq);

        void updateNoteTitle(UpdateNoteTitleReq updateNoteTitleReq);
    }

    /* JADX INFO: renamed from: jei$b */
    public interface InterfaceC7889b extends wu0 {
        void queryVoiceNodeLimitFail();

        void queryVoiceNodeLimitTimeSuccess(boolean z, int i, int i2);

        void saveVoiceNoteFail();

        void saveVoiceNoteSuccess(SaveVoiceNoteResp saveVoiceNoteResp);

        void updateNoteTitleFail();

        void updateNoteTitleSuccess();
    }
}
