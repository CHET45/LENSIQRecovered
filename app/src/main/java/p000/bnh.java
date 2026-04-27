package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import p000.f7e;
import p000.np6;
import p000.p7e;
import p000.yo6;

/* JADX INFO: loaded from: classes.dex */
public class bnh {

    /* JADX INFO: renamed from: a */
    public static final inh f14231a;

    /* JADX INFO: renamed from: b */
    public static final pp9<String, Typeface> f14232b;

    /* JADX INFO: renamed from: bnh$a */
    @p7e({p7e.EnumC10826a.f69934a})
    public static class C1960a extends np6.C9966d {

        /* JADX INFO: renamed from: j */
        @hib
        public f7e.AbstractC5672f f14233j;

        public C1960a(@hib f7e.AbstractC5672f abstractC5672f) {
            this.f14233j = abstractC5672f;
        }

        @Override // p000.np6.C9966d
        public void onTypefaceRequestFailed(int i) {
            f7e.AbstractC5672f abstractC5672f = this.f14233j;
            if (abstractC5672f != null) {
                abstractC5672f.lambda$callbackFailAsync$1(i);
            }
        }

        @Override // p000.np6.C9966d
        public void onTypefaceRetrieved(@efb Typeface typeface) {
            f7e.AbstractC5672f abstractC5672f = this.f14233j;
            if (abstractC5672f != null) {
                abstractC5672f.lambda$callbackSuccessAsync$0(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f14231a = new hnh();
        } else if (i >= 28) {
            f14231a = new gnh();
        } else {
            f14231a = new fnh();
        }
        f14232b = new pp9<>(16);
    }

    private bnh() {
    }

    @fdi
    @p7e({p7e.EnumC10826a.f69936c})
    public static void clearCache() {
        f14232b.evictAll();
    }

    @efb
    public static Typeface create(@efb Context context, @hib Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @hib
    @p7e({p7e.EnumC10826a.f69936c})
    public static Typeface createFromFontInfo(@efb Context context, @hib CancellationSignal cancellationSignal, @efb np6.C9965c[] c9965cArr, int i) {
        return f14231a.createFromFontInfo(context, cancellationSignal, c9965cArr, i);
    }

    @hib
    @p7e({p7e.EnumC10826a.f69934a})
    public static Typeface createFromResourcesFamilyXml(@efb Context context, @efb yo6.InterfaceC15740b interfaceC15740b, @efb Resources resources, int i, @hib String str, int i2, int i3, @hib f7e.AbstractC5672f abstractC5672f, @hib Handler handler, boolean z) {
        Typeface typefaceCreateFromFontFamilyFilesResourceEntry;
        if (interfaceC15740b instanceof yo6.C15744f) {
            yo6.C15744f c15744f = (yo6.C15744f) interfaceC15740b;
            Typeface systemFontFamily = getSystemFontFamily(c15744f.getSystemFontFamilyName());
            if (systemFontFamily != null) {
                if (abstractC5672f != null) {
                    abstractC5672f.callbackSuccessAsync(systemFontFamily, handler);
                }
                return systemFontFamily;
            }
            typefaceCreateFromFontFamilyFilesResourceEntry = np6.requestFont(context, c15744f.getRequest(), i3, !z ? abstractC5672f != null : c15744f.getFetchStrategy() != 0, z ? c15744f.getTimeout() : -1, f7e.AbstractC5672f.getHandler(handler), new C1960a(abstractC5672f));
        } else {
            typefaceCreateFromFontFamilyFilesResourceEntry = f14231a.createFromFontFamilyFilesResourceEntry(context, (yo6.C15742d) interfaceC15740b, resources, i3);
            if (abstractC5672f != null) {
                if (typefaceCreateFromFontFamilyFilesResourceEntry != null) {
                    abstractC5672f.callbackSuccessAsync(typefaceCreateFromFontFamilyFilesResourceEntry, handler);
                } else {
                    abstractC5672f.callbackFailAsync(-3, handler);
                }
            }
        }
        if (typefaceCreateFromFontFamilyFilesResourceEntry != null) {
            f14232b.put(createResourceUid(resources, i, str, i2, i3), typefaceCreateFromFontFamilyFilesResourceEntry);
        }
        return typefaceCreateFromFontFamilyFilesResourceEntry;
    }

    @hib
    @p7e({p7e.EnumC10826a.f69934a})
    public static Typeface createFromResourcesFontFile(@efb Context context, @efb Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceCreateFromResourcesFontFile = f14231a.createFromResourcesFontFile(context, resources, i, str, i3);
        if (typefaceCreateFromResourcesFontFile != null) {
            f14232b.put(createResourceUid(resources, i, str, i2, i3), typefaceCreateFromResourcesFontFile);
        }
        return typefaceCreateFromResourcesFontFile;
    }

    private static String createResourceUid(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    @hib
    @p7e({p7e.EnumC10826a.f69934a})
    public static Typeface findFromCache(@efb Resources resources, int i, @hib String str, int i2, int i3) {
        return f14232b.get(createResourceUid(resources, i, str, i2, i3));
    }

    @hib
    private static Typeface getBestFontFromFamily(Context context, Typeface typeface, int i) {
        inh inhVar = f14231a;
        yo6.C15742d c15742dM13231e = inhVar.m13231e(typeface);
        if (c15742dM13231e == null) {
            return null;
        }
        return inhVar.createFromFontFamilyFilesResourceEntry(context, c15742dM13231e, context.getResources(), i);
    }

    private static Typeface getSystemFontFamily(@hib String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    @hib
    @Deprecated
    @p7e({p7e.EnumC10826a.f69936c})
    public static Typeface findFromCache(@efb Resources resources, int i, int i2) {
        return findFromCache(resources, i, null, 0, i2);
    }

    @efb
    public static Typeface create(@efb Context context, @hib Typeface typeface, @h78(from = 1, m12174to = 1000) int i, boolean z) {
        if (context != null) {
            z7d.checkArgumentInRange(i, 1, 1000, "weight");
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            return f14231a.mo4095c(context, typeface, i, z);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @hib
    @Deprecated
    @p7e({p7e.EnumC10826a.f69936c})
    public static Typeface createFromResourcesFontFile(@efb Context context, @efb Resources resources, int i, String str, int i2) {
        return createFromResourcesFontFile(context, resources, i, str, 0, i2);
    }

    @hib
    @Deprecated
    @p7e({p7e.EnumC10826a.f69936c})
    public static Typeface createFromResourcesFamilyXml(@efb Context context, @efb yo6.InterfaceC15740b interfaceC15740b, @efb Resources resources, int i, int i2, @hib f7e.AbstractC5672f abstractC5672f, @hib Handler handler, boolean z) {
        return createFromResourcesFamilyXml(context, interfaceC15740b, resources, i, null, 0, i2, abstractC5672f, handler, z);
    }
}
