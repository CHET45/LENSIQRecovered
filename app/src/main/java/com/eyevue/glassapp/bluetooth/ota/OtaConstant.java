package com.eyevue.glassapp.bluetooth.ota;

import com.arthenica.ffmpegkit.MediaInformation;
import com.blankj.utilcode.util.C2473f;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import p000.e0g;
import p000.jt3;
import p000.l7g;
import p000.md8;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 1)
public final class OtaConstant {
    public static final int $stable = 0;
    public static final boolean AUTO_FAULT_TOLERANT = false;
    public static final int AUTO_FAULT_TOLERANT_COUNT = 1;
    public static final int AUTO_TEST_COUNT = 30;
    public static final boolean AUTO_TEST_OTA = false;
    public static final int CURRENT_PROTOCOL = 0;

    @yfb
    public static final Companion Companion = new Companion(null);

    @yfb
    public static final String DIR_LOGCAT = "logcat";

    @yfb
    public static final String DIR_ROOT = "JieLiOTA";

    @yfb
    public static final String DIR_UPGRADE = "upgrade";
    public static final boolean HID_DEVICE_WAY = false;
    public static final boolean IS_NEED_DEVICE_AUTH = true;
    public static final boolean NEED_CUSTOM_RECONNECT_WAY = false;
    public static final int PROTOCOL_BLE = 0;
    public static final int PROTOCOL_SPP = 1;
    public static final long SCAN_TIMEOUT = 30000;
    public static final boolean USE_SPP_MULTIPLE_CHANNEL = false;

    @yfb
    private static final UUID UUID_A2DP;

    @yfb
    private static final UUID UUID_SPP;

    public static final class Companion {
        public /* synthetic */ Companion(jt3 jt3Var) {
            this();
        }

        @yfb
        public final String formatString(@yfb String str, @yfb Object... objArr) {
            md8.checkNotNullParameter(str, MediaInformation.KEY_FORMAT_PROPERTIES);
            md8.checkNotNullParameter(objArr, C2473f.f17565y);
            l7g l7gVar = l7g.f56714a;
            Locale locale = Locale.ENGLISH;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            md8.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }

        @yfb
        public final UUID getUUID_A2DP() {
            return OtaConstant.UUID_A2DP;
        }

        @yfb
        public final UUID getUUID_SPP() {
            return OtaConstant.UUID_SPP;
        }

        private Companion() {
        }
    }

    static {
        UUID uuidFromString = UUID.fromString("0000110b-0000-1000-8000-00805f9b34fb");
        md8.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        UUID_A2DP = uuidFromString;
        UUID uuidFromString2 = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");
        md8.checkNotNullExpressionValue(uuidFromString2, "fromString(...)");
        UUID_SPP = uuidFromString2;
    }
}
