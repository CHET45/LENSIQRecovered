package p000;

import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class yv5 {

    /* JADX INFO: renamed from: a */
    public static final int f103108a = 4;

    /* JADX INFO: renamed from: b */
    public static final int f103109b = 14;

    /* JADX INFO: renamed from: c */
    public static final int f103110c = 5;

    /* JADX INFO: renamed from: d */
    public static final int f103111d = 25;

    /* JADX INFO: renamed from: e */
    public static final int f103112e = 5;

    /* JADX INFO: renamed from: g */
    public static final String f103114g = "\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: h */
    public static final String f103115h = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000";

    /* JADX INFO: renamed from: i */
    public static final String f103116i = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: j */
    public static final String f103117j = ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: k */
    public static final String f103118k = "(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";

    /* JADX INFO: renamed from: m */
    public static final String f103120m = ",\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: n */
    public static final String f103121n = "(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";

    /* JADX INFO: renamed from: o */
    public static final String f103122o = ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: p */
    public static final String f103123p = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";

    /* JADX INFO: renamed from: f */
    public static final C15848a[] f103113f = {new C15848a(99, 99, -1, -1), new C15848a(35, 36, -1, -1), new C15848a(71, 72, -1, -1), new C15848a(96, 96, -1, -1), new C15848a(85, 86, -1, -1), new C15848a(90, 96, -1, -1), new C15848a(80, 81, -1, -1), new C15848a(6, 6, -1, -1), new C15848a(20, 20, -1, -1), new C15848a(19, 19, -1, -1), new C15848a(32, 34, -1, -1), new C15848a(96, 96, -1, -1), new C15848a(30, 31, -1, -1), new C15848a(96, 96, -1, -1), new C15848a(96, 96, -1, -1), new C15848a(50, 52, -1, -1), new C15848a(83, 83, -1, -1), new C15848a(60, 62, -1, -1), new C15848a(46, 47, -1, -1), new C15848a(66, 67, 73, -1), new C15848a(40, 42, -1, -1), new C15848a(70, 71, -1, -1), new C15848a(1, 2, -1, -1), new C15848a(20, 21, -1, -1), new C15848a(3, 4, -1, -1), new C15848a(96, 96, -1, -1), new C15848a(48, 49, -1, -1), new C15848a(55, 56, -1, -1), new C15848a(63, 65, -1, -1), new C15848a(96, 96, -1, -1), new C15848a(38, 39, -1, -1), new C15848a(55, 56, -1, -1), new C15848a(27, 28, -1, -1), new C15848a(58, 58, -1, -1), new C15848a(68, 69, -1, -1), new C15848a(3, 4, -1, -1), new C15848a(7, 8, -1, -1), new C15848a(87, 88, 86, -1), new C15848a(88, 89, 96, -1), new C15848a(10, 14, 0, 6), new C15848a(43, 45, -1, -1), new C15848a(73, 74, -1, -1), new C15848a(97, 97, -1, -1), new C15848a(15, 19, -1, -1), new C15848a(6, 6, 0, 9), new C15848a(96, 96, -1, -1), new C15848a(2, 2, -1, -1), new C15848a(29, 29, -1, -1), new C15848a(57, 57, -1, -1), new C15848a(37, 38, -1, -1), new C15848a(75, 79, 87, 88), new C15848a(84, 84, -1, -1), new C15848a(22, 24, 20, -1), new C15848a(6, 9, -1, -1), new C15848a(5, 5, -1, -1), new C15848a(98, 99, -1, -1), new C15848a(53, 54, -1, -1), new C15848a(24, 26, -1, -1), new C15848a(82, 83, -1, -1)};

    /* JADX INFO: renamed from: l */
    public static final Pattern f103119l = Pattern.compile("[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: q */
    public static final Pattern f103124q = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: r */
    public static final Pattern f103125r = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: s */
    public static final Pattern f103126s = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: t */
    public static final Pattern f103127t = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);

    /* JADX INFO: renamed from: u */
    public static final Pattern f103128u = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: yv5$a */
    public static class C15848a {

        /* JADX INFO: renamed from: a */
        public int f103129a;

        /* JADX INFO: renamed from: b */
        public int f103130b;

        /* JADX INFO: renamed from: c */
        public int f103131c;

        /* JADX INFO: renamed from: d */
        public int f103132d;

        public C15848a(int i, int i2, int i3, int i4) {
            this.f103129a = i;
            this.f103130b = i2;
            this.f103131c = i3;
            this.f103132d = i4;
        }

        /* JADX INFO: renamed from: a */
        public boolean m26365a(String str) {
            int i = Integer.parseInt(str.substring(0, 2));
            return (this.f103129a <= i && i <= this.f103130b) || i == this.f103131c || i == this.f103132d;
        }
    }

    private yv5() {
    }

    /* JADX INFO: renamed from: a */
    public static String m26364a(String str) {
        Matcher matcher = f103124q.matcher(str);
        int iEnd = 0;
        while (matcher.find(iEnd)) {
            if (checkHouseNumber(matcher.group(0))) {
                int iStart = matcher.start();
                int iAttemptMatch = attemptMatch(str, matcher);
                if (iAttemptMatch > 0) {
                    return str.substring(iStart, iAttemptMatch);
                }
                iEnd = -iAttemptMatch;
            } else {
                iEnd = matcher.end();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d5, code lost:
    
        if (r10 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d8, code lost:
    
        if (r9 <= 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00db, code lost:
    
        r9 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00dd, code lost:
    
        return -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        return -r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int attemptMatch(java.lang.String r13, java.util.regex.MatchResult r14) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.yv5.attemptMatch(java.lang.String, java.util.regex.MatchResult):int");
    }

    private static boolean checkHouseNumber(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (Character.isDigit(str.charAt(i2))) {
                i++;
            }
        }
        if (i > 5) {
            return false;
        }
        Matcher matcher = f103127t.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int i3 = Integer.parseInt(matcher.group(1));
        if (i3 == 0) {
            return false;
        }
        String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
        int i4 = i3 % 10;
        String str2 = ufh.f87924k;
        if (i4 == 1) {
            if (i3 % 100 != 11) {
                str2 = "st";
            }
            return lowerCase.equals(str2);
        }
        if (i4 == 2) {
            if (i3 % 100 != 12) {
                str2 = "nd";
            }
            return lowerCase.equals(str2);
        }
        if (i4 != 3) {
            return lowerCase.equals(ufh.f87924k);
        }
        if (i3 % 100 != 13) {
            str2 = "rd";
        }
        return lowerCase.equals(str2);
    }

    @fdi
    public static boolean isValidLocationName(String str) {
        return f103126s.matcher(str).matches();
    }

    private static boolean isValidZipCode(String str, MatchResult matchResult) {
        if (matchResult == null) {
            return false;
        }
        int iGroupCount = matchResult.groupCount();
        while (true) {
            if (iGroupCount <= 0) {
                break;
            }
            int i = iGroupCount - 1;
            if (matchResult.group(iGroupCount) != null) {
                iGroupCount = i;
                break;
            }
            iGroupCount = i;
        }
        return f103128u.matcher(str).matches() && f103113f[iGroupCount].m26365a(str);
    }

    @fdi
    public static MatchResult matchHouseNumber(String str, int i) {
        if (i > 0 && f103122o.indexOf(str.charAt(i - 1)) == -1) {
            return null;
        }
        Matcher matcherRegion = f103124q.matcher(str).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            MatchResult matchResult = matcherRegion.toMatchResult();
            if (checkHouseNumber(matchResult.group(0))) {
                return matchResult;
            }
        }
        return null;
    }

    @fdi
    public static MatchResult matchState(String str, int i) {
        if (i > 0 && f103117j.indexOf(str.charAt(i - 1)) == -1) {
            return null;
        }
        Matcher matcherRegion = f103125r.matcher(str).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return matcherRegion.toMatchResult();
        }
        return null;
    }

    @fdi
    public static boolean isValidZipCode(String str, String str2) {
        return isValidZipCode(str, matchState(str2, 0));
    }

    @fdi
    public static boolean isValidZipCode(String str) {
        return f103128u.matcher(str).matches();
    }
}
