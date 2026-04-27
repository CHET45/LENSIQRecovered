package com.eyevue.common.bean;

import com.watchfun.transcommon.bean.p012ai.AiModelBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ProjectInfoBean {
    private List<String> aiModelArray;
    private String aiModelAwakening;
    private String aiModelRoleId;
    private String aiModelRoleName;
    private List<AiModelBean> aiModels;
    private String authCode;
    private boolean authCodeFullMatch;
    private String backgroundUrl;
    private int bluetoothMode;
    private String code;
    private int customerId;
    private String customerShortName;
    private String deviceName;
    private EqConfig eqConfig;
    private String equalizer;
    private int equalizerModelNum;
    private String equipmentCode;
    private int exceptionCode;
    private String exceptionMsg;
    private String imageUrl;
    private String name;
    private List<OfflineCommand> offlineCommands;
    private String otaCode;
    private String pidVid;
    private String pidVidHex;
    private String projectCompatibleSdk;
    private String projectFunctionType;
    private int projectType;
    private String remark;
    private boolean showCustomEq;
    private String speechProvider;
    private int status;
    private boolean supportAi;
    private boolean supportBrainWave;
    private boolean supportDoubleHeadset;
    private boolean supportFreeTalk;
    private boolean supportHeadsetMobile;
    private boolean supportHealth;
    private boolean supportMall;
    private boolean supportOfflineTranslation;
    private boolean supportPhotoTranslation;
    private boolean supportSimultaneousInterpretation;
    private boolean supportSport;
    private boolean supportTextTranslation;
    private boolean supportTranslation;
    private boolean supportVideoTranslation;
    private boolean supportVoiceNote;
    private boolean supportVoiceNoteNew;
    private String translationProvider;
    private String ttsProvider;
    private boolean useDeviceEq;
    private boolean verifyMac;
    private int verifyMacRegional;
    private int voiceNoteTime;

    public static class EqConfig {
        private List<EqConfigItem> items;
        private int mode;

        public List<EqConfigItem> getItems() {
            return this.items;
        }

        public int getMode() {
            return this.mode;
        }

        public void setItems(List<EqConfigItem> items) {
            this.items = items;
        }

        public void setMode(int mode) {
            this.mode = mode;
        }
    }

    public static class EqConfigItem {
        private boolean check;
        private String gain;
        private int index;
        private boolean isCustom;
        private String name;

        public String getGain() {
            return this.gain;
        }

        public int getIndex() {
            return this.index;
        }

        public String getName() {
            return this.name;
        }

        public boolean isCheck() {
            return this.check;
        }

        public boolean isCustom() {
            return this.isCustom;
        }

        public void setCheck(boolean check) {
            this.check = check;
        }

        public void setCustom(boolean custom) {
            this.isCustom = custom;
        }

        public void setGain(String gain) {
            this.gain = gain;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class OfflineCommand {
        private List<String> items;

        public List<String> getItems() {
            return this.items;
        }

        public void setItems(List<String> items) {
            this.items = items;
        }
    }

    public List<String> getAiModelArray() {
        return this.aiModelArray;
    }

    public String getAiModelAwakening() {
        return this.aiModelAwakening;
    }

    public String getAiModelRoleId() {
        return this.aiModelRoleId;
    }

    public String getAiModelRoleName() {
        return this.aiModelRoleName;
    }

    public List<AiModelBean> getAiModels() {
        return this.aiModels;
    }

    public String getAuthCode() {
        return this.authCode;
    }

    public String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public int getBluetoothMode() {
        return this.bluetoothMode;
    }

    public String getCode() {
        return this.code;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public String getCustomerShortName() {
        return this.customerShortName;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public EqConfig getEqConfig() {
        return this.eqConfig;
    }

    public String getEqualizer() {
        return this.equalizer;
    }

    public int getEqualizerModelNum() {
        return this.equalizerModelNum;
    }

    public String getEquipmentCode() {
        return this.equipmentCode;
    }

    public String getExceptionMsg() {
        return this.exceptionMsg;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getName() {
        return this.name;
    }

    public List<OfflineCommand> getOfflineCommands() {
        return this.offlineCommands;
    }

    public String getOtaCode() {
        return this.otaCode;
    }

    public String getPidVid() {
        return this.pidVid;
    }

    public String getPidVidHex() {
        return this.pidVidHex;
    }

    public String getProjectCompatibleSdk() {
        return this.projectCompatibleSdk;
    }

    public String getProjectFunctionType() {
        return this.projectFunctionType;
    }

    public int getProjectType() {
        return this.projectType;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getSpeechProvider() {
        return this.speechProvider;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTranslationProvider() {
        return this.translationProvider;
    }

    public String getTtsProvider() {
        return this.ttsProvider;
    }

    public int getVerifyMacRegional() {
        return this.verifyMacRegional;
    }

    public int getVoiceNoteTime() {
        return this.voiceNoteTime;
    }

    public boolean isAuthCodeFullMatch() {
        return this.authCodeFullMatch;
    }

    public int isExceptionCode() {
        return this.exceptionCode;
    }

    public boolean isShowCustomEq() {
        return this.showCustomEq;
    }

    public boolean isSupportAi() {
        return this.supportAi;
    }

    public boolean isSupportBrainWave() {
        return this.supportBrainWave;
    }

    public boolean isSupportDoubleHeadset() {
        return this.supportDoubleHeadset;
    }

    public boolean isSupportFreeTalk() {
        return this.supportFreeTalk;
    }

    public boolean isSupportHeadsetMobile() {
        return this.supportHeadsetMobile;
    }

    public boolean isSupportHealth() {
        return this.supportHealth;
    }

    public boolean isSupportMall() {
        return this.supportMall;
    }

    public boolean isSupportOfflineTranslation() {
        return this.supportOfflineTranslation;
    }

    public boolean isSupportPhotoTranslation() {
        return this.supportPhotoTranslation;
    }

    public boolean isSupportSimultaneousInterpretation() {
        return this.supportSimultaneousInterpretation;
    }

    public boolean isSupportSport() {
        return this.supportSport;
    }

    public boolean isSupportTextTranslation() {
        return this.supportTextTranslation;
    }

    public boolean isSupportTranslation() {
        return this.supportTranslation;
    }

    public boolean isSupportVideoTranslation() {
        return this.supportVideoTranslation;
    }

    public boolean isSupportVoiceNote() {
        return this.supportVoiceNote;
    }

    public boolean isSupportVoiceNotesV1() {
        return this.supportVoiceNoteNew;
    }

    public boolean isUseDeviceEq() {
        return this.useDeviceEq;
    }

    public boolean isVerifyMac() {
        return this.verifyMac;
    }

    public void setAiModelArray(List<String> aiModelArray) {
        this.aiModelArray = aiModelArray;
    }

    public void setAiModelAwakening(String aiModelAwakening) {
        this.aiModelAwakening = aiModelAwakening;
    }

    public void setAiModelRoleId(String aiModelRoleId) {
        this.aiModelRoleId = aiModelRoleId;
    }

    public void setAiModelRoleName(String aiModelRoleName) {
        this.aiModelRoleName = aiModelRoleName;
    }

    public void setAiModels(List<AiModelBean> aiModels) {
        this.aiModels = aiModels;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public void setAuthCodeFullMatch(boolean authCodeFullMatch) {
        this.authCodeFullMatch = authCodeFullMatch;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }

    public void setBluetoothMode(int bluetoothMode) {
        this.bluetoothMode = bluetoothMode;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerShortName(String customerShortName) {
        this.customerShortName = customerShortName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setEqConfig(EqConfig eqConfig) {
        this.eqConfig = eqConfig;
    }

    public void setEqualizer(String equalizer) {
        this.equalizer = equalizer;
    }

    public void setEqualizerModelNum(int equalizerModelNum) {
        this.equalizerModelNum = equalizerModelNum;
    }

    public void setEquipmentCode(String equipmentCode) {
        this.equipmentCode = equipmentCode;
    }

    public void setExceptionCode(int exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOfflineCommands(List<OfflineCommand> offlineCommands) {
        this.offlineCommands = offlineCommands;
    }

    public void setOtaCode(String otaCode) {
        this.otaCode = otaCode;
    }

    public void setPidVid(String pidVid) {
        this.pidVid = pidVid;
    }

    public void setPidVidHex(String pidVidHex) {
        this.pidVidHex = pidVidHex;
    }

    public void setProjectCompatibleSdk(String projectCompatibleSdk) {
        this.projectCompatibleSdk = projectCompatibleSdk;
    }

    public void setProjectFunctionType(String projectFunctionType) {
        this.projectFunctionType = projectFunctionType;
    }

    public void setProjectType(int projectType) {
        this.projectType = projectType;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setShowCustomEq(boolean showCustomEq) {
        this.showCustomEq = showCustomEq;
    }

    public void setSpeechProvider(String speechProvider) {
        this.speechProvider = speechProvider;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setSupportAi(boolean supportAi) {
        this.supportAi = supportAi;
    }

    public void setSupportBrainWave(boolean supportBrainWave) {
        this.supportBrainWave = supportBrainWave;
    }

    public void setSupportDoubleHeadset(boolean supportDoubleHeadset) {
        this.supportDoubleHeadset = supportDoubleHeadset;
    }

    public void setSupportFreeTalk(boolean supportFreeTalk) {
        this.supportFreeTalk = supportFreeTalk;
    }

    public void setSupportHeadsetMobile(boolean supportHeadsetMobile) {
        this.supportHeadsetMobile = supportHeadsetMobile;
    }

    public void setSupportHealth(boolean supportHealth) {
        this.supportHealth = supportHealth;
    }

    public void setSupportMall(boolean supportMall) {
        this.supportMall = supportMall;
    }

    public void setSupportOfflineTranslation(boolean supportOfflineTranslation) {
        this.supportOfflineTranslation = supportOfflineTranslation;
    }

    public void setSupportPhotoTranslation(boolean supportPhotoTranslation) {
        this.supportPhotoTranslation = supportPhotoTranslation;
    }

    public void setSupportSimultaneousInterpretation(boolean v) {
        this.supportSimultaneousInterpretation = v;
    }

    public void setSupportSport(boolean supportSport) {
        this.supportSport = supportSport;
    }

    public void setSupportTextTranslation(boolean supportTextTranslation) {
        this.supportTextTranslation = supportTextTranslation;
    }

    public void setSupportTranslation(boolean supportTranslation) {
        this.supportTranslation = supportTranslation;
    }

    public void setSupportVideoTranslation(boolean supportVideoTranslation) {
        this.supportVideoTranslation = supportVideoTranslation;
    }

    public void setSupportVoiceNote(boolean supportVoiceNote) {
        this.supportVoiceNote = supportVoiceNote;
    }

    public void setSupportVoiceNoteNew(boolean supportVoiceNoteNew) {
        this.supportVoiceNoteNew = supportVoiceNoteNew;
    }

    public void setTranslationProvider(String translationProvider) {
        this.translationProvider = translationProvider;
    }

    public void setTtsProvider(String ttsProvider) {
        this.ttsProvider = ttsProvider;
    }

    public void setUseDeviceEq(boolean useDeviceEq) {
        this.useDeviceEq = useDeviceEq;
    }

    public void setVerifyMac(boolean verifyMac) {
        this.verifyMac = verifyMac;
    }

    public void setVerifyMacRegional(int verifyMacRegional) {
        this.verifyMacRegional = verifyMacRegional;
    }

    public void setVoiceNoteTime(int voiceNoteTime) {
        this.voiceNoteTime = voiceNoteTime;
    }
}
