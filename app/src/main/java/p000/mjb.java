package p000;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class mjb {
    public static cr0 buildError(int i) {
        return new cr0(i, getErrorDesc(i));
    }

    public static String getErrorDesc(int i) {
        if (i == 12295) {
            return "Command waiting for the device to reply timed out.";
        }
        if (i == 12296) {
            return "Device returned the failed result.";
        }
        if (i == 12298) {
            return "Device returned an error result.";
        }
        if (i == 12299) {
            return "Waiting command timeout.";
        }
        if (i == 0) {
            return "Success.";
        }
        if (i == 4097) {
            return "Parameter error.";
        }
        if (i == 4099) {
            return "Bluetooth is close.";
        }
        if (i == 4114) {
            return "Bluetooth device is disconnected.";
        }
        if (i == 8194) {
            return "Searching for a Device Exception.";
        }
        if (i == 20481) {
            return "Device authentication fails.";
        }
        switch (i) {
            case u45.f86787k /* 12290 */:
                return "Failed to send data.";
            case u45.f86788l /* 12291 */:
                return "System is busy.";
            case u45.f86789m /* 12292 */:
                return "Abnormal data format.";
            case u45.f86790n /* 12293 */:
                return "Failed to parse data.";
            default:
                switch (i) {
                    case u45.f86795s /* 16385 */:
                        return "Update failed.";
                    case 16386:
                        return "Device is in low charge.";
                    case u45.f86797u /* 16387 */:
                        return "Corrupted upgrade file.";
                    case u45.f86798v /* 16388 */:
                        return "Data offset error.";
                    case u45.f86799w /* 16389 */:
                        return "Data verification failure.";
                    case u45.f86800x /* 16390 */:
                        return "Key of the upgrade file does not match.";
                    case u45.f86801y /* 16391 */:
                        return "The type of the upgrade file is incorrect.";
                    case u45.f86802z /* 16392 */:
                        return "OTA is in progress.";
                    case u45.f86761A /* 16393 */:
                        return "Data length error.";
                    case u45.f86762B /* 16394 */:
                        return "Flash IO exception.";
                    case u45.f86763C /* 16395 */:
                        return "Command processing timeout.";
                    case u45.f86764D /* 16396 */:
                        return "File version is the same as the device version.";
                    case u45.f86765E /* 16397 */:
                        return "The TWS is not connected.";
                    case u45.f86766F /* 16398 */:
                        return "The headphones are not in the charging bin.";
                    case u45.f86767G /* 16399 */:
                        return "Same upgrade file.";
                    case u45.f86768H /* 16400 */:
                        return "Unknown error code.";
                    case u45.f86769I /* 16401 */:
                        return "Reconnecting to the device timed out.";
                    case u45.f86770J /* 16402 */:
                        return "Failed to reconnect the device.";
                    case u45.f86771K /* 16403 */:
                        return "Device is being upgraded.";
                    case u45.f86772L /* 16404 */:
                        return "Device is in device dual mode.";
                    default:
                        switch (i) {
                            case u45.f86774N /* 20484 */:
                                return "Not found file.";
                            case u45.f86775O /* 20485 */:
                                return "No upgrade data found.";
                            case u45.f86776P /* 20486 */:
                                return "I/O exception.";
                            default:
                                return "Unknown Error";
                        }
                }
        }
    }

    public static cr0 buildError(int i, String str) {
        return TextUtils.isEmpty(str) ? buildError(i) : buildError(i, 0, str);
    }

    public static cr0 buildError(int i, int i2, String str) {
        return new cr0(i, new g55(i, getErrorDesc(i), i2, str).toString());
    }
}
