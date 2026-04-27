package p000;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: o7 */
/* JADX INFO: loaded from: classes.dex */
public final class C10209o7 {

    /* JADX INFO: renamed from: a */
    public static final int f66575a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f66576b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f66577c = 4;

    /* JADX INFO: renamed from: d */
    public static final int f66578d = 8;

    /* JADX INFO: renamed from: e */
    public static final int f66579e = 32;

    /* JADX INFO: renamed from: f */
    public static final int f66580f = -1;

    /* JADX INFO: renamed from: g */
    public static final int f66581g = 2;

    /* JADX INFO: renamed from: h */
    public static final int f66582h = 4;

    /* JADX INFO: renamed from: i */
    public static final int f66583i = 8;

    /* JADX INFO: renamed from: j */
    public static final int f66584j = 16;

    /* JADX INFO: renamed from: k */
    public static final int f66585k = 32;

    private C10209o7() {
    }

    @efb
    public static String capabilityToString(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @efb
    public static String feedbackTypeToString(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (i > 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
            i &= ~iNumberOfTrailingZeros;
            if (sb.length() > 1) {
                sb.append(", ");
            }
            if (iNumberOfTrailingZeros == 1) {
                sb.append("FEEDBACK_SPOKEN");
            } else if (iNumberOfTrailingZeros == 2) {
                sb.append("FEEDBACK_HAPTIC");
            } else if (iNumberOfTrailingZeros == 4) {
                sb.append("FEEDBACK_AUDIBLE");
            } else if (iNumberOfTrailingZeros == 8) {
                sb.append("FEEDBACK_VISUAL");
            } else if (iNumberOfTrailingZeros == 16) {
                sb.append("FEEDBACK_GENERIC");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @hib
    public static String flagToString(int i) {
        if (i == 1) {
            return "DEFAULT";
        }
        if (i == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (i == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    public static int getCapabilities(@efb AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @hib
    public static String loadDescription(@efb AccessibilityServiceInfo accessibilityServiceInfo, @efb PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}
