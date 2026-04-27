package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p000.np6;
import p000.p7e;
import p000.yo6;

/* JADX INFO: loaded from: classes.dex */
@c5e(24)
@p7e({p7e.EnumC10826a.f69936c})
public class dnh extends inh {

    /* JADX INFO: renamed from: d */
    public static final String f30234d = "TypefaceCompatApi24Impl";

    /* JADX INFO: renamed from: e */
    public static final String f30235e = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: f */
    public static final String f30236f = "addFontWeightStyle";

    /* JADX INFO: renamed from: g */
    public static final String f30237g = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: h */
    public static final Class<?> f30238h;

    /* JADX INFO: renamed from: i */
    public static final Constructor<?> f30239i;

    /* JADX INFO: renamed from: j */
    public static final Method f30240j;

    /* JADX INFO: renamed from: k */
    public static final Method f30241k;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e(f30234d, e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f30239i = constructor;
        f30238h = cls;
        f30240j = method2;
        f30241k = method;
    }

    private static boolean addFontWeightStyle(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f30240j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface createFromFamiliesWithDefault(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(f30238h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f30241k.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean isUsable() {
        Method method = f30240j;
        if (method == null) {
            Log.w(f30234d, "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object newFamily() {
        try {
            return f30239i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
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
    @hib
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, yo6.C15742d c15742d, Resources resources, int i) {
        Object objNewFamily = newFamily();
        if (objNewFamily == null) {
            return null;
        }
        for (yo6.C15743e c15743e : c15742d.getEntries()) {
            ByteBuffer byteBufferCopyToDirectBuffer = jnh.copyToDirectBuffer(context, resources, c15743e.getResourceId());
            if (byteBufferCopyToDirectBuffer == null || !addFontWeightStyle(objNewFamily, byteBufferCopyToDirectBuffer, c15743e.getTtcIndex(), c15743e.getWeight(), c15743e.isItalic())) {
                return null;
            }
        }
        return createFromFamiliesWithDefault(objNewFamily);
    }

    @Override // p000.inh
    @hib
    public Typeface createFromFontInfo(Context context, @hib CancellationSignal cancellationSignal, @efb np6.C9965c[] c9965cArr, int i) {
        Object objNewFamily = newFamily();
        if (objNewFamily == null) {
            return null;
        }
        scf scfVar = new scf();
        for (np6.C9965c c9965c : c9965cArr) {
            Uri uri = c9965c.getUri();
            ByteBuffer byteBufferMmap = (ByteBuffer) scfVar.get(uri);
            if (byteBufferMmap == null) {
                byteBufferMmap = jnh.mmap(context, cancellationSignal, uri);
                scfVar.put(uri, byteBufferMmap);
            }
            if (byteBufferMmap == null || !addFontWeightStyle(objNewFamily, byteBufferMmap, c9965c.getTtcIndex(), c9965c.getWeight(), c9965c.isItalic())) {
                return null;
            }
        }
        Typeface typefaceCreateFromFamiliesWithDefault = createFromFamiliesWithDefault(objNewFamily);
        if (typefaceCreateFromFamiliesWithDefault == null) {
            return null;
        }
        return Typeface.create(typefaceCreateFromFamiliesWithDefault, i);
    }
}
