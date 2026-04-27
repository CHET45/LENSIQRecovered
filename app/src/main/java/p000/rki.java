package p000;

import android.util.Pair;
import com.google.android.exoplayer2.drm.InterfaceC3004d;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class rki {

    /* JADX INFO: renamed from: a */
    public static final String f78597a = "LicenseDurationRemaining";

    /* JADX INFO: renamed from: b */
    public static final String f78598b = "PlaybackDurationRemaining";

    private rki() {
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
    public static Pair<Long, Long> getLicenseDurationRemainingSec(InterfaceC3004d interfaceC3004d) {
        Map<String, String> mapQueryKeyStatus = interfaceC3004d.queryKeyStatus();
        if (mapQueryKeyStatus == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(getDurationRemainingSec(mapQueryKeyStatus, "LicenseDurationRemaining")), Long.valueOf(getDurationRemainingSec(mapQueryKeyStatus, "PlaybackDurationRemaining")));
    }
}
