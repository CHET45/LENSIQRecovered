package p000;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class xzf {

    /* JADX INFO: renamed from: a */
    public final int f99801a;

    /* JADX INFO: renamed from: b */
    public final int f99802b;

    /* JADX INFO: renamed from: c */
    public final int f99803c;

    /* JADX INFO: renamed from: d */
    public final int f99804d;

    /* JADX INFO: renamed from: e */
    public final int f99805e;

    /* JADX INFO: renamed from: f */
    public final int f99806f;

    private xzf(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f99801a = i;
        this.f99802b = i2;
        this.f99803c = i3;
        this.f99804d = i4;
        this.f99805e = i5;
        this.f99806f = i6;
    }

    @hib
    public static xzf fromFormatLine(String str) {
        v80.checkArgument(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            String lowerCase = i80.toLowerCase(strArrSplit[i6].trim());
            lowerCase.hashCode();
            switch (lowerCase) {
                case "end":
                    i3 = i6;
                    break;
                case "text":
                    i5 = i6;
                    break;
                case "layer":
                    i = i6;
                    break;
                case "start":
                    i2 = i6;
                    break;
                case "style":
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new xzf(i, i2, i3, i4, i5, strArrSplit.length);
    }
}
