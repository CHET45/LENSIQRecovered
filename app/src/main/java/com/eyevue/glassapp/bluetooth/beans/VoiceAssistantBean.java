package com.eyevue.glassapp.bluetooth.beans;

import com.eyevue.glassapp.bluetooth.HexConvert;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceAssistantBean extends BaseBytesBean {
    public boolean isAiWakeUp;
    public boolean isLocalOfflineSpeech;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public VoiceAssistantBean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        VoiceAssistantBean voiceAssistantBean = new VoiceAssistantBean();
        if (!byteList.isEmpty()) {
            byte b = HexConvert.convertList2Array(byteList)[0];
            voiceAssistantBean.isLocalOfflineSpeech = (b & 1) == 0;
            voiceAssistantBean.isAiWakeUp = (b & 2) == 0;
        }
        return voiceAssistantBean;
    }
}
