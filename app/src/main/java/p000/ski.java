package p000;

import android.util.Pair;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ski {

    /* JADX INFO: renamed from: a */
    public static final String f82139a = "LicenseDurationRemaining";

    /* JADX INFO: renamed from: b */
    public static final String f82140b = "PlaybackDurationRemaining";

    private ski() {
    }

    private static long getDurationRemainingSec(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    @hib
    public static Pair<Long, Long> getLicenseDurationRemainingSec(ar4 ar4Var) {
        Map<String, String> mapQueryKeyStatus = ar4Var.queryKeyStatus();
        if (mapQueryKeyStatus == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(getDurationRemainingSec(mapQueryKeyStatus, "LicenseDurationRemaining")), Long.valueOf(getDurationRemainingSec(mapQueryKeyStatus, "PlaybackDurationRemaining")));
    }
}
