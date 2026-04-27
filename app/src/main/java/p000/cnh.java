package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.np6;
import p000.p7e;
import p000.yo6;

/* JADX INFO: loaded from: classes.dex */
@c5e(21)
@p7e({p7e.EnumC10826a.f69936c})
public class cnh extends inh {

    /* JADX INFO: renamed from: d */
    public static final String f17128d = "TypefaceCompatApi21Impl";

    /* JADX INFO: renamed from: e */
    public static final String f17129e = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: f */
    public static final String f17130f = "addFontWeightStyle";

    /* JADX INFO: renamed from: g */
    public static final String f17131g = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: h */
    public static Class<?> f17132h;

    /* JADX INFO: renamed from: i */
    public static Constructor<?> f17133i;

    /* JADX INFO: renamed from: j */
    public static Method f17134j;

    /* JADX INFO: renamed from: k */
    public static Method f17135k;

    /* JADX INFO: renamed from: l */
    public static boolean f17136l;

    private static boolean addFontWeightStyle(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        init();
        try {
            return ((Boolean) f17134j.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static Typeface createFromFamiliesWithDefault(Object obj) throws NoSuchMethodException {
        init();
        try {
            Object objNewInstance = Array.newInstance(f17132h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f17135k.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private File getFile(@efb ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void init() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f17136l) {
            return;
        }
        f17136l = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e(f17128d, e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f17133i = constructor;
        f17132h = cls;
        f17134j = method2;
        f17135k = method;
    }

    private static Object newFamily() throws NoSuchMethodException {
        init();
        try {
            return f17133i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.inh
    @efb
    /* JADX INFO: renamed from: c */
    public Typeface mo4095c(@efb Context context, @efb Typeface typeface, int i, boolean z) {
        Typeface typefaceM14817a;
        try {
            typefaceM14817a = kki.m14817a(typeface, i, z);
        } catch (RuntimeException unused) {
            typefaceM14817a = null;
        }
        return typefaceM14817a == null ? super.mo4095c(context, typeface, i, z) : typefaceM14817a;
    }

    @Override // p000.inh
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, yo6.C15742d c15742d, Resources resources, int i) throws NoSuchMethodException {
        Object objNewFamily = newFamily();
        for (yo6.C15743e c15743e : c15742d.getEntries()) {
            File tempFile = jnh.getTempFile(context);
            if (tempFile == null) {
                return null;
            }
            try {
                if (!jnh.copyToFile(tempFile, resources, c15743e.getResourceId())) {
                    return null;
                }
                if (!addFontWeightStyle(objNewFamily, tempFile.getPath(), c15743e.getWeight(), c15743e.isItalic())) {
                    return null;
                }
                tempFile.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                tempFile.delete();
            }
        }
        return createFromFamiliesWithDefault(objNewFamily);
    }

    @Override // p000.inh
    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, @efb np6.C9965c[] c9965cArr, int i) {
        if (c9965cArr.length < 1) {
            return null;
        }
        np6.C9965c c9965cMo12508d = mo12508d(c9965cArr, i);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c9965cMo12508d.getUri(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                File file = getFile(parcelFileDescriptorOpenFileDescriptor);
                if (file != null && file.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceMo12507b = super.mo12507b(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceMo12507b;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
