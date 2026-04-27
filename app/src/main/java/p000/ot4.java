package p000;

/* JADX INFO: loaded from: classes7.dex */
public class ot4 extends nt4 {

    /* JADX INFO: renamed from: ot4$a */
    public /* synthetic */ class C10648a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68655a;

        static {
            int[] iArr = new int[lt4.values().length];
            try {
                iArr[lt4.f58681b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lt4.f58682c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lt4.f58683d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[lt4.f58684e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[lt4.f58685f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[lt4.f58686m.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[lt4.f58678C.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f68655a = iArr;
        }
    }

    @jjf(version = "1.5")
    @yfb
    public static final lt4 durationUnitByIsoChar(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return lt4.f58678C;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
        }
        if (c == 'H') {
            return lt4.f58686m;
        }
        if (c == 'M') {
            return lt4.f58685f;
        }
        if (c == 'S') {
            return lt4.f58684e;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c);
    }

    @jjf(version = "1.5")
    @yfb
    public static final lt4 durationUnitByShortName(@yfb String str) {
        md8.checkNotNullParameter(str, "shortName");
        int iHashCode = str.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && str.equals("us")) {
                                    return lt4.f58682c;
                                }
                            } else if (str.equals("ns")) {
                                return lt4.f58681b;
                            }
                        } else if (str.equals("ms")) {
                            return lt4.f58683d;
                        }
                    } else if (str.equals("s")) {
                        return lt4.f58684e;
                    }
                } else if (str.equals("m")) {
                    return lt4.f58685f;
                }
            } else if (str.equals("h")) {
                return lt4.f58686m;
            }
        } else if (str.equals("d")) {
            return lt4.f58678C;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + str);
    }

    @jjf(version = "1.3")
    @yfb
    public static final String shortName(@yfb lt4 lt4Var) {
        md8.checkNotNullParameter(lt4Var, "<this>");
        switch (C10648a.f68655a[lt4Var.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "m";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + lt4Var).toString());
        }
    }
}
