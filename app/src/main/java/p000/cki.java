package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class cki {

    /* JADX INFO: renamed from: a */
    public static final Pattern f16856a = Pattern.compile("^NOTE([ \t].*)?$");

    /* JADX INFO: renamed from: b */
    public static final String f16857b = "WEBVTT";

    private cki() {
    }

    @hib
    public static Matcher findNextCueHeader(jhc jhcVar) {
        String line;
        while (true) {
            String line2 = jhcVar.readLine();
            if (line2 == null) {
                return null;
            }
            if (f16856a.matcher(line2).matches()) {
                do {
                    line = jhcVar.readLine();
                    if (line != null) {
                    }
                } while (!line.isEmpty());
            } else {
                Matcher matcher = vji.f91434f.matcher(line2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean isWebvttHeaderLine(jhc jhcVar) {
        String line = jhcVar.readLine();
        return line != null && line.startsWith("WEBVTT");
    }

    public static float parsePercentage(String str) throws NumberFormatException {
        if (str.endsWith(yv7.f103133a)) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long parseTimestampUs(String str) {
        String[] strArrSplitAtFirst = t0i.splitAtFirst(str, "\\.");
        long j = 0;
        for (String str2 : t0i.split(strArrSplitAtFirst[0], g1i.f38277c)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplitAtFirst.length == 2) {
            String strTrim = strArrSplitAtFirst[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: " + strTrim);
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }

    public static void validateWebvttHeaderLine(jhc jhcVar) throws yhc {
        int position = jhcVar.getPosition();
        if (isWebvttHeaderLine(jhcVar)) {
            return;
        }
        jhcVar.setPosition(position);
        throw yhc.createForMalformedContainer("Expected WEBVTT. Got " + jhcVar.readLine(), null);
    }
}
