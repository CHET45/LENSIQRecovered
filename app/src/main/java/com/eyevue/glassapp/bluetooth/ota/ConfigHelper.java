package com.eyevue.glassapp.bluetooth.ota;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.watchfun.base.BaseApplication;
import p000.dwf;
import p000.e0g;
import p000.gib;
import p000.h78;
import p000.igg;
import p000.jt3;
import p000.md8;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 0)
public class ConfigHelper {

    @yfb
    private static final String KEY_AGREE_POLICY_VERSION = "agree_policy_version";

    @yfb
    private static final String KEY_AUTO_TEST_COUNT = "auto_test_count";

    @yfb
    private static final String KEY_AUTO_TEST_OTA = "auto_test_ota";

    @yfb
    private static final String KEY_BLE_MTU_VALUE = "ble_mtu_value";

    @yfb
    private static final String KEY_BROADCAST_BOX = "broadcast_box_switch";

    @yfb
    private static final String KEY_COMMUNICATION_WAY = "communication_way";

    @yfb
    private static final String KEY_DEVELOP_MODE = "develop_mode";

    @yfb
    private static final String KEY_DOWNLOAD_URI = "download_uri";

    @yfb
    private static final String KEY_FAULT_TOLERANT = "fault_tolerant";

    @yfb
    private static final String KEY_FAULT_TOLERANT_COUNT = "fault_tolerant_count";

    @yfb
    private static final String KEY_IS_HID_DEVICE = "is_hid_device";

    @yfb
    private static final String KEY_IS_USE_DEVICE_AUTH = "is_use_device_auth";

    @yfb
    private static final String KEY_SCAN_FILTER_STRING = "scan_filter_string";

    @yfb
    private static final String KEY_SPP_CUSTOM_UUID = "spp_custom_uuid";

    @yfb
    private static final String KEY_SPP_MULTIPLE_CHANNEL = "spp_multiple_channel";

    @yfb
    private static final String KEY_USE_CUSTOM_RECONNECT_WAY = "use_custom_reconnect_way";
    private static final int LATEST_POLICY_APP_VERSION = 10800;

    @gib
    @igg({"StaticFieldLeak"})
    private static volatile ConfigHelper instance;
    private final SharedPreferences preferences;

    @yfb
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @dwf({"SMAP\nConfigHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigHelper.kt\ncom/eyevue/glassapp/bluetooth/ota/ConfigHelper$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(jt3 jt3Var) {
            this();
        }

        @yfb
        public final ConfigHelper getInstance() {
            ConfigHelper configHelper = ConfigHelper.instance;
            if (configHelper == null) {
                synchronized (this) {
                    configHelper = ConfigHelper.instance;
                    if (configHelper == null) {
                        Application baseApplication = BaseApplication.getInstance();
                        md8.checkNotNullExpressionValue(baseApplication, "getInstance(...)");
                        configHelper = new ConfigHelper(baseApplication, null);
                        Companion companion = ConfigHelper.Companion;
                        ConfigHelper.instance = configHelper;
                    }
                }
            }
            return configHelper;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ConfigHelper(Context context, jt3 jt3Var) {
        this(context);
    }

    public final void enableBroadcastBox(boolean z) {
        this.preferences.edit().putBoolean(KEY_BROADCAST_BOX, z).apply();
    }

    public final int getAutoTestCount() {
        return this.preferences.getInt(KEY_AUTO_TEST_COUNT, 30);
    }

    public final int getBleRequestMtu() {
        return this.preferences.getInt(KEY_BLE_MTU_VALUE, 509);
    }

    @gib
    public final String getCustomSppChannel() {
        return this.preferences.getString(KEY_SPP_CUSTOM_UUID, OtaConstant.Companion.getUUID_SPP().toString());
    }

    public final int getFaultTolerantCount() {
        return this.preferences.getInt(KEY_FAULT_TOLERANT_COUNT, 1);
    }

    @gib
    public final String getScanFilter() {
        return this.preferences.getString(KEY_SCAN_FILTER_STRING, "");
    }

    public final boolean isAgreePolicy() {
        int i = this.preferences.getInt(KEY_AGREE_POLICY_VERSION, 0);
        return i > 0 && i >= 10800;
    }

    public final boolean isAutoTest() {
        return this.preferences.getBoolean(KEY_AUTO_TEST_OTA, false);
    }

    public final boolean isBleWay() {
        return this.preferences.getInt(KEY_COMMUNICATION_WAY, 0) == 0;
    }

    public final boolean isDevelopMode() {
        return this.preferences.getBoolean(KEY_DEVELOP_MODE, false);
    }

    public final boolean isEnableBroadcastBox() {
        return this.preferences.getBoolean(KEY_BROADCAST_BOX, false);
    }

    public final boolean isFaultTolerant() {
        return this.preferences.getBoolean(KEY_FAULT_TOLERANT, false);
    }

    public final boolean isHidDevice() {
        return this.preferences.getBoolean(KEY_IS_HID_DEVICE, false);
    }

    public final boolean isUseCustomReConnectWay() {
        return this.preferences.getBoolean(KEY_USE_CUSTOM_RECONNECT_WAY, false);
    }

    public final boolean isUseDeviceAuth() {
        return this.preferences.getBoolean(KEY_IS_USE_DEVICE_AUTH, true);
    }

    public final boolean isUseMultiSppChannel() {
        return this.preferences.getBoolean(KEY_SPP_MULTIPLE_CHANNEL, false);
    }

    public final void setAutoTest(boolean z) {
        this.preferences.edit().putBoolean(KEY_AUTO_TEST_OTA, z).apply();
    }

    public final void setAutoTestCount(int i) {
        if (isAutoTest()) {
            this.preferences.edit().putInt(KEY_AUTO_TEST_COUNT, i).apply();
        }
    }

    public final void setBleRequestMtu(@h78(from = 20, m12174to = 509) int i) {
        this.preferences.edit().putInt(KEY_BLE_MTU_VALUE, i).apply();
    }

    public final void setBleWay(boolean z) {
        this.preferences.edit().putInt(KEY_COMMUNICATION_WAY, !z ? 1 : 0).apply();
    }

    public final void setCustomSppChannel(@gib String str) {
        this.preferences.edit().putString(KEY_SPP_CUSTOM_UUID, str).apply();
    }

    public final void setDevelopMode(boolean z) {
        this.preferences.edit().putBoolean(KEY_DEVELOP_MODE, z).apply();
    }

    public final void setFaultTolerant(boolean z) {
        this.preferences.edit().putBoolean(KEY_FAULT_TOLERANT, z).apply();
    }

    public final void setFaultTolerantCount(int i) {
        if (isFaultTolerant()) {
            this.preferences.edit().putInt(KEY_FAULT_TOLERANT_COUNT, i).apply();
        }
    }

    public final void setHidDevice(boolean z) {
        this.preferences.edit().putBoolean(KEY_IS_HID_DEVICE, z).apply();
    }

    public final void setScanFilter(@gib String str) {
        this.preferences.edit().putString(KEY_SCAN_FILTER_STRING, str).apply();
    }

    public final void setUseCustomReConnectWay(boolean z) {
        this.preferences.edit().putBoolean(KEY_USE_CUSTOM_RECONNECT_WAY, z).apply();
    }

    public final void setUseDeviceAuth(boolean z) {
        this.preferences.edit().putBoolean(KEY_IS_USE_DEVICE_AUTH, z).apply();
    }

    public final void setUseMultiSppChannel(boolean z) {
        this.preferences.edit().putBoolean(KEY_SPP_MULTIPLE_CHANNEL, z).apply();
    }

    private ConfigHelper(Context context) {
        this.preferences = context.getSharedPreferences("ota_config_data", 0);
    }
}
