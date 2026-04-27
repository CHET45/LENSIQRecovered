package p000;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class wzf {

    /* JADX INFO: renamed from: a */
    public final int f95871a;

    /* JADX INFO: renamed from: b */
    public final int f95872b;

    /* JADX INFO: renamed from: c */
    public final int f95873c;

    /* JADX INFO: renamed from: d */
    public final int f95874d;

    /* JADX INFO: renamed from: e */
    public final int f95875e;

    private wzf(int i, int i2, int i3, int i4, int i5) {
        this.f95871a = i;
        this.f95872b = i2;
        this.f95873c = i3;
        this.f95874d = i4;
        this.f95875e = i5;
    }

    @hib
    public static wzf fromFormatLine(String str) {
        u80.checkArgument(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            String lowerCase = i80.toLowerCase(strArrSplit[i5].trim());
            lowerCase.hashCode();
            switch (lowerCase) {
                case "end":
                    i2 = i5;
                    break;
                case "text":
                    i4 = i5;
                    break;
                case "start":
                    i = i5;
                    break;
                case "style":
                    i3 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new wzf(i, i2, i3, i4, strArrSplit.length);
    }
}
