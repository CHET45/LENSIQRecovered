package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p000.np6;
import p000.p7e;
import p000.yo6;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class inh {

    /* JADX INFO: renamed from: b */
    public static final String f47637b = "TypefaceCompatBaseImpl";

    /* JADX INFO: renamed from: c */
    public static final int f47638c = 0;

    /* JADX INFO: renamed from: a */
    @igg({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, yo6.C15742d> f47639a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: inh$a */
    public class C7522a implements InterfaceC7525d<np6.C9965c> {
        public C7522a() {
        }

        @Override // p000.inh.InterfaceC7525d
        public int getWeight(np6.C9965c c9965c) {
            return c9965c.getWeight();
        }

        @Override // p000.inh.InterfaceC7525d
        public boolean isItalic(np6.C9965c c9965c) {
            return c9965c.isItalic();
        }
    }

    /* JADX INFO: renamed from: inh$b */
    public class C7523b implements InterfaceC7525d<yo6.C15743e> {
        public C7523b() {
        }

        @Override // p000.inh.InterfaceC7525d
        public int getWeight(yo6.C15743e c15743e) {
            return c15743e.getWeight();
        }

        @Override // p000.inh.InterfaceC7525d
        public boolean isItalic(yo6.C15743e c15743e) {
            return c15743e.isItalic();
        }
    }

    /* JADX INFO: renamed from: inh$c */
    public class C7524c implements InterfaceC7525d<yo6.C15743e> {
        public C7524c() {
        }

        @Override // p000.inh.InterfaceC7525d
        public int getWeight(yo6.C15743e c15743e) {
            return c15743e.getWeight();
        }

        @Override // p000.inh.InterfaceC7525d
        public boolean isItalic(yo6.C15743e c15743e) {
            return c15743e.isItalic();
        }
    }

    /* JADX INFO: renamed from: inh$d */
    public interface InterfaceC7525d<T> {
        int getWeight(T t);

        boolean isItalic(T t);
    }

    private void addFontFamily(Typeface typeface, yo6.C15742d c15742d) {
        long uniqueKey = getUniqueKey(typeface);
        if (uniqueKey != 0) {
            this.f47639a.put(Long.valueOf(uniqueKey), c15742d);
        }
    }

    private yo6.C15743e findBestEntry(yo6.C15742d c15742d, int i) {
        return (yo6.C15743e) findBestFont(c15742d.getEntries(), i, new C7523b());
    }

    private static <T> T findBestFont(T[] tArr, int i, InterfaceC7525d<T> interfaceC7525d) {
        return (T) findBestFont(tArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, interfaceC7525d);
    }

    private static long getUniqueKey(@hib Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e(f47637b, "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e(f47637b, "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    @hib
    /* JADX INFO: renamed from: a */
    public Typeface m13230a(Context context, yo6.C15742d c15742d, Resources resources, int i, boolean z) {
        yo6.C15743e c15743eFindBestEntry = findBestEntry(c15742d, i, z);
        if (c15743eFindBestEntry == null) {
            return null;
        }
        Typeface typefaceCreateFromResourcesFontFile = bnh.createFromResourcesFontFile(context, resources, c15743eFindBestEntry.getResourceId(), c15743eFindBestEntry.getFileName(), 0, 0);
        addFontFamily(typefaceCreateFromResourcesFontFile, c15742d);
        return typefaceCreateFromResourcesFontFile;
    }

    /* JADX INFO: renamed from: b */
    public Typeface mo12507b(Context context, InputStream inputStream) {
        File tempFile = jnh.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (jnh.copyToFile(tempFile, inputStream)) {
                return Typeface.createFromFile(tempFile.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    @efb
    /* JADX INFO: renamed from: c */
    public Typeface mo4095c(@efb Context context, @efb Typeface typeface, int i, boolean z) {
        Typeface typefaceM14168a;
        try {
            typefaceM14168a = jki.m14168a(this, context, typeface, i, z);
        } catch (RuntimeException unused) {
            typefaceM14168a = null;
        }
        return typefaceM14168a == null ? typeface : typefaceM14168a;
    }

    @hib
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, yo6.C15742d c15742d, Resources resources, int i) {
        yo6.C15743e c15743eFindBestEntry = findBestEntry(c15742d, i);
        if (c15743eFindBestEntry == null) {
            return null;
        }
        Typeface typefaceCreateFromResourcesFontFile = bnh.createFromResourcesFontFile(context, resources, c15743eFindBestEntry.getResourceId(), c15743eFindBestEntry.getFileName(), 0, i);
        addFontFamily(typefaceCreateFromResourcesFontFile, c15742d);
        return typefaceCreateFromResourcesFontFile;
    }

    @hib
    public Typeface createFromFontInfo(Context context, @hib CancellationSignal cancellationSignal, @efb np6.C9965c[] c9965cArr, int i) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (c9965cArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(mo12508d(c9965cArr, i).getUri());
        } catch (IOException unused) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface typefaceMo12507b = mo12507b(context, inputStreamOpenInputStream);
            jnh.closeQuietly(inputStreamOpenInputStream);
            return typefaceMo12507b;
        } catch (IOException unused2) {
            jnh.closeQuietly(inputStreamOpenInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = inputStreamOpenInputStream;
            jnh.closeQuietly(inputStream);
            throw th;
        }
    }

    @hib
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String str, int i2) {
        File tempFile = jnh.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (jnh.copyToFile(tempFile, resources, i)) {
                return Typeface.createFromFile(tempFile.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    /* JADX INFO: renamed from: d */
    public np6.C9965c mo12508d(np6.C9965c[] c9965cArr, int i) {
        return (np6.C9965c) findBestFont(c9965cArr, i, new C7522a());
    }

    @hib
    /* JADX INFO: renamed from: e */
    public yo6.C15742d m13231e(Typeface typeface) {
        long uniqueKey = getUniqueKey(typeface);
        if (uniqueKey == 0) {
            return null;
        }
        return this.f47639a.get(Long.valueOf(uniqueKey));
    }

    private yo6.C15743e findBestEntry(yo6.C15742d c15742d, int i, boolean z) {
        return (yo6.C15743e) findBestFont(c15742d.getEntries(), i, z, new C7524c());
    }

    private static <T> T findBestFont(T[] tArr, int i, boolean z, InterfaceC7525d<T> interfaceC7525d) {
        T t = null;
        int i2 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(interfaceC7525d.getWeight(t2) - i) * 2) + (interfaceC7525d.isItalic(t2) == z ? 0 : 1);
            if (t == null || i2 > iAbs) {
                t = t2;
                i2 = iAbs;
            }
        }
        return t;
    }
}
