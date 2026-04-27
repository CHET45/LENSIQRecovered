package com.watchfun.transcommon.gpt;

import android.content.Context;
import com.watchfun.transcommon.bean.p012ai.ChatMessageDTO;
import java.io.File;
import java.util.List;
import p000.C2133c;
import p000.jt0;
import p000.wu0;

/* JADX INFO: loaded from: classes5.dex */
public interface GPTContract {

    public interface AiDialogueView extends wu0 {
        void loadDataSuccess(String str);
    }

    public interface AiGPTAudioFilePresenter extends jt0<AiGPTAudioView> {
        void refreshData(File file, String str);
    }

    public interface AiGPTAudioView extends wu0 {
        void loadRecListSuccess(String str, boolean z, boolean z2, boolean z3);
    }

    public interface AiGPTDialoguePresenter extends jt0<AiDialogueView> {
        void refreshData(List<C2133c.b> list, ChatMessageDTO chatMessageDTO);
    }

    public interface AiGPTTextToAudioPresenter extends jt0<AiGPTTextToAudioView> {
        void refreshData(Context context, String str, String str2, String str3);
    }

    public interface AiGPTTextToAudioView extends wu0 {
        void loadAudioListSuccess(File file);
    }
}
