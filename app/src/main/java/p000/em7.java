package p000;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
@igg({"InlinedApi"})
public final class em7 {

    /* JADX INFO: renamed from: a */
    public static final int f33462a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f33463b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f33464c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f33465d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f33466e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f33467f = 8;

    /* JADX INFO: renamed from: g */
    public static final int f33468g = 16;

    /* JADX INFO: renamed from: h */
    public static final int f33469h = 32;

    /* JADX INFO: renamed from: i */
    public static final int f33470i = 256;

    /* JADX INFO: renamed from: j */
    public static final int f33471j = 0;

    /* JADX INFO: renamed from: k */
    public static final int f33472k = 63;

    /* JADX INFO: renamed from: em7$a */
    @c5e(24)
    public static class C5383a {
        private C5383a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Spanned m10124a(String str, int i) {
            return Html.fromHtml(str, i);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static Spanned m10125b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static String m10126c(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    private em7() {
    }

    @efb
    public static Spanned fromHtml(@efb String str, int i) {
        return C5383a.m10124a(str, i);
    }

    @efb
    public static String toHtml(@efb Spanned spanned, int i) {
        return C5383a.m10126c(spanned, i);
    }

    @efb
    public static Spanned fromHtml(@efb String str, int i, @hib Html.ImageGetter imageGetter, @hib Html.TagHandler tagHandler) {
        return C5383a.m10125b(str, i, imageGetter, tagHandler);
    }
}
