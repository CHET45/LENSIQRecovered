package p000;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class m51 extends c51 {

    /* JADX INFO: renamed from: C */
    public static final int f59903C = 5;

    /* JADX INFO: renamed from: F */
    public static final int f59904F = 6;

    /* JADX INFO: renamed from: H */
    public static final int f59905H = 7;

    /* JADX INFO: renamed from: L */
    public static final int f59906L = 8;

    /* JADX INFO: renamed from: M */
    public static final int f59907M = 9;

    /* JADX INFO: renamed from: N */
    public static final int f59908N = 2147483646;

    /* JADX INFO: renamed from: Q */
    public static final int f59909Q = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c */
    public static final int f59910c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f59911d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f59912e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f59913f = 3;

    /* JADX INFO: renamed from: m */
    public static final int f59914m = 4;

    /* JADX INFO: renamed from: a */
    public final int f59915a;

    /* JADX INFO: renamed from: b */
    public final Date f59916b;

    /* JADX INFO: renamed from: m51$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9141a {
    }

    public m51(int i) {
        super(createMessage(i, null));
        this.f59915a = i;
        this.f59916b = null;
    }

    private static String createMessage(int i, Date date) {
        return reasonDescription(i) + " (code " + i + c0b.f15434d + retryDateSuggestionIfExists(date);
    }

    private static String reasonDescription(int i) {
        if (i == 2147483646) {
            return "Undocumented scan throttle";
        }
        switch (i) {
            case 0:
                return "Bluetooth cannot start";
            case 1:
                return "Bluetooth disabled";
            case 2:
                return "Bluetooth not available";
            case 3:
                return "Location Permission missing";
            case 4:
                return "Location Services disabled";
            case 5:
                return "Scan failed because it has already started";
            case 6:
                return "Scan failed because application registration failed";
            case 7:
                return "Scan failed because of an internal error";
            case 8:
                return "Scan failed because feature unsupported";
            case 9:
                return "Scan failed because out of hardware resources";
            default:
                return "Unknown error";
        }
    }

    private static String retryDateSuggestionIfExists(Date date) {
        if (date == null) {
            return "";
        }
        return ", suggested retry date is " + date;
    }

    public int getReason() {
        return this.f59915a;
    }

    @hib
    public Date getRetryDateSuggestion() {
        return this.f59916b;
    }

    public m51(int i, @efb Date date) {
        super(createMessage(i, date));
        this.f59915a = i;
        this.f59916b = date;
    }

    public m51(int i, Throwable th) {
        super(createMessage(i, null), th);
        this.f59915a = i;
        this.f59916b = null;
    }
}
