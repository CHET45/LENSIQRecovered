package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;
import p000.bnh;
import p000.f7e;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public class np6 {

    /* JADX INFO: renamed from: a */
    @Deprecated
    @p7e({p7e.EnumC10826a.f69936c})
    public static final String f65153a = "font_results";

    /* JADX INFO: renamed from: b */
    @Deprecated
    @p7e({p7e.EnumC10826a.f69936c})
    public static final int f65154b = -1;

    /* JADX INFO: renamed from: c */
    @Deprecated
    @p7e({p7e.EnumC10826a.f69936c})
    public static final int f65155c = -2;

    /* JADX INFO: renamed from: np6$a */
    public static final class C9963a implements BaseColumns {

        /* JADX INFO: renamed from: a */
        public static final String f65156a = "file_id";

        /* JADX INFO: renamed from: b */
        public static final String f65157b = "font_ttc_index";

        /* JADX INFO: renamed from: c */
        public static final String f65158c = "font_variation_settings";

        /* JADX INFO: renamed from: d */
        public static final String f65159d = "font_weight";

        /* JADX INFO: renamed from: e */
        public static final String f65160e = "font_italic";

        /* JADX INFO: renamed from: f */
        public static final String f65161f = "result_code";

        /* JADX INFO: renamed from: g */
        public static final int f65162g = 0;

        /* JADX INFO: renamed from: h */
        public static final int f65163h = 1;

        /* JADX INFO: renamed from: i */
        public static final int f65164i = 2;

        /* JADX INFO: renamed from: j */
        public static final int f65165j = 3;
    }

    /* JADX INFO: renamed from: np6$b */
    public static class C9964b {

        /* JADX INFO: renamed from: c */
        public static final int f65166c = 0;

        /* JADX INFO: renamed from: d */
        public static final int f65167d = 1;

        /* JADX INFO: renamed from: e */
        public static final int f65168e = 2;

        /* JADX INFO: renamed from: a */
        public final int f65169a;

        /* JADX INFO: renamed from: b */
        public final C9965c[] f65170b;

        @Deprecated
        @p7e({p7e.EnumC10826a.f69936c})
        public C9964b(int i, @hib C9965c[] c9965cArr) {
            this.f65169a = i;
            this.f65170b = c9965cArr;
        }

        /* JADX INFO: renamed from: a */
        public static C9964b m18050a(int i, @hib C9965c[] c9965cArr) {
            return new C9964b(i, c9965cArr);
        }

        public C9965c[] getFonts() {
            return this.f65170b;
        }

        public int getStatusCode() {
            return this.f65169a;
        }
    }

    /* JADX INFO: renamed from: np6$c */
    public static class C9965c {

        /* JADX INFO: renamed from: a */
        public final Uri f65171a;

        /* JADX INFO: renamed from: b */
        public final int f65172b;

        /* JADX INFO: renamed from: c */
        public final int f65173c;

        /* JADX INFO: renamed from: d */
        public final boolean f65174d;

        /* JADX INFO: renamed from: e */
        public final int f65175e;

        @Deprecated
        @p7e({p7e.EnumC10826a.f69936c})
        public C9965c(@efb Uri uri, @h78(from = 0) int i, @h78(from = 1, m12174to = 1000) int i2, boolean z, int i3) {
            this.f65171a = (Uri) z7d.checkNotNull(uri);
            this.f65172b = i;
            this.f65173c = i2;
            this.f65174d = z;
            this.f65175e = i3;
        }

        /* JADX INFO: renamed from: a */
        public static C9965c m18051a(@efb Uri uri, @h78(from = 0) int i, @h78(from = 1, m12174to = 1000) int i2, boolean z, int i3) {
            return new C9965c(uri, i, i2, z, i3);
        }

        public int getResultCode() {
            return this.f65175e;
        }

        @h78(from = 0)
        public int getTtcIndex() {
            return this.f65172b;
        }

        @efb
        public Uri getUri() {
            return this.f65171a;
        }

        @h78(from = 1, m12174to = 1000)
        public int getWeight() {
            return this.f65173c;
        }

        public boolean isItalic() {
            return this.f65174d;
        }
    }

    /* JADX INFO: renamed from: np6$d */
    public static class C9966d {

        /* JADX INFO: renamed from: a */
        @Deprecated
        @p7e({p7e.EnumC10826a.f69936c})
        public static final int f65176a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f65177b = 0;

        /* JADX INFO: renamed from: c */
        public static final int f65178c = -1;

        /* JADX INFO: renamed from: d */
        public static final int f65179d = -2;

        /* JADX INFO: renamed from: e */
        public static final int f65180e = -3;

        /* JADX INFO: renamed from: f */
        public static final int f65181f = -4;

        /* JADX INFO: renamed from: g */
        public static final int f65182g = 1;

        /* JADX INFO: renamed from: h */
        public static final int f65183h = 2;

        /* JADX INFO: renamed from: i */
        public static final int f65184i = 3;

        /* JADX INFO: renamed from: np6$d$a */
        @Retention(RetentionPolicy.SOURCE)
        @p7e({p7e.EnumC10826a.f69936c})
        public @interface a {
        }

        public void onTypefaceRequestFailed(int i) {
        }

        public void onTypefaceRetrieved(Typeface typeface) {
        }
    }

    private np6() {
    }

    @hib
    public static Typeface buildTypeface(@efb Context context, @hib CancellationSignal cancellationSignal, @efb C9965c[] c9965cArr) {
        return bnh.createFromFontInfo(context, cancellationSignal, c9965cArr, 0);
    }

    @efb
    public static C9964b fetchFonts(@efb Context context, @hib CancellationSignal cancellationSignal, @efb to6 to6Var) throws PackageManager.NameNotFoundException {
        return so6.m22156b(context, to6Var, cancellationSignal);
    }

    @Deprecated
    @p7e({p7e.EnumC10826a.f69936c})
    public static Typeface getFontSync(Context context, to6 to6Var, @hib f7e.AbstractC5672f abstractC5672f, @hib Handler handler, boolean z, int i, int i2) {
        return requestFont(context, to6Var, i2, z, i, f7e.AbstractC5672f.getHandler(handler), new bnh.C1960a(abstractC5672f));
    }

    @hib
    @fdi
    @Deprecated
    @p7e({p7e.EnumC10826a.f69936c})
    public static ProviderInfo getProvider(@efb PackageManager packageManager, @efb to6 to6Var, @hib Resources resources) throws PackageManager.NameNotFoundException {
        return so6.m22157c(packageManager, to6Var, resources);
    }

    @Deprecated
    @p7e({p7e.EnumC10826a.f69936c})
    public static Map<Uri, ByteBuffer> prepareFontData(Context context, C9965c[] c9965cArr, CancellationSignal cancellationSignal) {
        return jnh.readFontInfoIntoByteBuffer(context, c9965cArr, cancellationSignal);
    }

    public static void requestFont(@efb Context context, @efb to6 to6Var, @efb C9966d c9966d, @efb Handler handler) {
        mo1 mo1Var = new mo1(c9966d);
        wo6.m24678b(context.getApplicationContext(), to6Var, 0, z3e.m26555b(handler), mo1Var);
    }

    @Deprecated
    @p7e({p7e.EnumC10826a.f69936c})
    public static void resetCache() {
        wo6.m24680d();
    }

    @fdi
    @p7e({p7e.EnumC10826a.f69934a})
    public static void resetTypefaceCache() {
        wo6.m24680d();
    }

    @hib
    @p7e({p7e.EnumC10826a.f69934a})
    public static Typeface requestFont(@efb Context context, @efb to6 to6Var, int i, boolean z, @h78(from = 0) int i2, @efb Handler handler, @efb C9966d c9966d) {
        mo1 mo1Var = new mo1(c9966d, handler);
        if (z) {
            return wo6.m24679c(context, to6Var, mo1Var, i, i2);
        }
        return wo6.m24678b(context, to6Var, i, null, mo1Var);
    }
}
