package p000;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bkg {
    public static final boolean systemProp(@yfb String str, boolean z) {
        String strSystemProp = zjg.systemProp(str);
        return strSystemProp != null ? Boolean.parseBoolean(strSystemProp) : z;
    }

    public static /* synthetic */ int systemProp$default(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return zjg.systemProp(str, i, i2, i3);
    }

    public static final int systemProp(@yfb String str, int i, int i2, int i3) {
        return (int) zjg.systemProp(str, i, i2, i3);
    }

    public static /* synthetic */ long systemProp$default(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return zjg.systemProp(str, j, j4, j3);
    }

    public static final long systemProp(@yfb String str, long j, long j2, long j3) {
        String strSystemProp = zjg.systemProp(str);
        if (strSystemProp == null) {
            return j;
        }
        Long longOrNull = g9g.toLongOrNull(strSystemProp);
        if (longOrNull == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strSystemProp + '\'').toString());
        }
        long jLongValue = longOrNull.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    @yfb
    public static final String systemProp(@yfb String str, @yfb String str2) {
        String strSystemProp = zjg.systemProp(str);
        return strSystemProp == null ? str2 : strSystemProp;
    }
}
