package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class bki {

    /* JADX INFO: renamed from: a */
    public static final Pattern f14041a = Pattern.compile("^NOTE([ \t].*)?$");

    /* JADX INFO: renamed from: b */
    public static final String f14042b = "WEBVTT";

    private bki() {
    }

    @hib
    public static Matcher findNextCueHeader(ihc ihcVar) {
        String line;
        while (true) {
            String line2 = ihcVar.readLine();
            if (line2 == null) {
                return null;
            }
            if (f14041a.matcher(line2).matches()) {
                do {
                    line = ihcVar.readLine();
                    if (line != null) {
                    }
                } while (!line.isEmpty());
            } else {
                Matcher matcher = yji.f101821f.matcher(line2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean isWebvttHeaderLine(ihc ihcVar) {
        String line = ihcVar.readLine();
        return line != null && line.startsWith("WEBVTT");
    }

    public static float parsePercentage(String str) throws NumberFormatException {
        if (str.endsWith(yv7.f103133a)) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long parseTimestampUs(String str) throws NumberFormatException {
        String[] strArrSplitAtFirst = x0i.splitAtFirst(str, "\\.");
        long j = 0;
        for (String str2 : x0i.split(strArrSplitAtFirst[0], g1i.f38277c)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplitAtFirst.length == 2) {
            j2 += Long.parseLong(strArrSplitAtFirst[1]);
        }
        return j2 * 1000;
    }

    public static void validateWebvttHeaderLine(ihc ihcVar) throws xhc {
        int position = ihcVar.getPosition();
        if (isWebvttHeaderLine(ihcVar)) {
            return;
        }
        ihcVar.setPosition(position);
        throw xhc.createForMalformedContainer("Expected WEBVTT. Got " + ihcVar.readLine(), null);
    }
}
