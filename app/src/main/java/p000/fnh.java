package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p000.np6;
import p000.p7e;
import p000.yo6;

/* JADX INFO: loaded from: classes.dex */
@c5e(26)
@p7e({p7e.EnumC10826a.f69936c})
public class fnh extends cnh {

    /* JADX INFO: renamed from: A */
    public static final int f37189A = -1;

    /* JADX INFO: renamed from: t */
    public static final String f37190t = "TypefaceCompatApi26Impl";

    /* JADX INFO: renamed from: u */
    public static final String f37191u = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: v */
    public static final String f37192v = "addFontFromAssetManager";

    /* JADX INFO: renamed from: w */
    public static final String f37193w = "addFontFromBuffer";

    /* JADX INFO: renamed from: x */
    public static final String f37194x = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: y */
    public static final String f37195y = "freeze";

    /* JADX INFO: renamed from: z */
    public static final String f37196z = "abortCreation";

    /* JADX INFO: renamed from: m */
    public final Class<?> f37197m;

    /* JADX INFO: renamed from: n */
    public final Constructor<?> f37198n;

    /* JADX INFO: renamed from: o */
    public final Method f37199o;

    /* JADX INFO: renamed from: p */
    public final Method f37200p;

    /* JADX INFO: renamed from: q */
    public final Method f37201q;

    /* JADX INFO: renamed from: r */
    public final Method f37202r;

    /* JADX INFO: renamed from: s */
    public final Method f37203s;

    public fnh() {
        Class<?> clsM11003j;
        Constructor<?> constructorM11004k;
        Method methodM11000g;
        Method methodM11001h;
        Method methodM11005l;
        Method methodM10999f;
        Method methodMo11002i;
        try {
            clsM11003j = m11003j();
            constructorM11004k = m11004k(clsM11003j);
            methodM11000g = m11000g(clsM11003j);
            methodM11001h = m11001h(clsM11003j);
            methodM11005l = m11005l(clsM11003j);
            methodM10999f = m10999f(clsM11003j);
            methodMo11002i = mo11002i(clsM11003j);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e(f37190t, "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            clsM11003j = null;
            constructorM11004k = null;
            methodM11000g = null;
            methodM11001h = null;
            methodM11005l = null;
            methodM10999f = null;
            methodMo11002i = null;
        }
        this.f37197m = clsM11003j;
        this.f37198n = constructorM11004k;
        this.f37199o = methodM11000g;
        this.f37200p = methodM11001h;
        this.f37201q = methodM11005l;
        this.f37202r = methodM10999f;
        this.f37203s = methodMo11002i;
    }

    private void abortCreation(Object obj) {
        try {
            this.f37202r.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean addFontFromAssetManager(Context context, Object obj, String str, int i, int i2, int i3, @hib FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f37199o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean addFontFromBuffer(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f37200p.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean freeze(Object obj) {
        try {
            return ((Boolean) this.f37201q.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean isFontFamilyPrivateAPIAvailable() {
        if (this.f37199o == null) {
            Log.w(f37190t, "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f37199o != null;
    }

    @hib
    private Object newFamily() {
        try {
            return this.f37198n.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p000.cnh, p000.inh
    @efb
    /* JADX INFO: renamed from: c */
    public Typeface mo4095c(@efb Context context, @efb Typeface typeface, int i, boolean z) {
        Typeface typefaceM16209a;
        try {
            typefaceM16209a = lki.m16209a(typeface, i, z);
        } catch (RuntimeException unused) {
            typefaceM16209a = null;
        }
        return typefaceM16209a == null ? super.mo4095c(context, typeface, i, z) : typefaceM16209a;
    }

    @hib
    public Typeface createFromFamiliesWithDefault(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f37197m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f37203s.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p000.cnh, p000.inh
    @hib
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, yo6.C15742d c15742d, Resources resources, int i) {
        if (!isFontFamilyPrivateAPIAvailable()) {
            return super.createFromFontFamilyFilesResourceEntry(context, c15742d, resources, i);
        }
        Object objNewFamily = newFamily();
        if (objNewFamily == null) {
            return null;
        }
        for (yo6.C15743e c15743e : c15742d.getEntries()) {
            if (!addFontFromAssetManager(context, objNewFamily, c15743e.getFileName(), c15743e.getTtcIndex(), c15743e.getWeight(), c15743e.isItalic() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c15743e.getVariationSettings()))) {
                abortCreation(objNewFamily);
                return null;
            }
        }
        if (freeze(objNewFamily)) {
            return createFromFamiliesWithDefault(objNewFamily);
        }
        return null;
    }

    @Override // p000.cnh, p000.inh
    @hib
    public Typeface createFromFontInfo(Context context, @hib CancellationSignal cancellationSignal, @efb np6.C9965c[] c9965cArr, int i) {
        Typeface typefaceCreateFromFamiliesWithDefault;
        if (c9965cArr.length < 1) {
            return null;
        }
        if (!isFontFamilyPrivateAPIAvailable()) {
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
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c9965cMo12508d.getWeight()).setItalic(c9965cMo12508d.isItalic()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> fontInfoIntoByteBuffer = jnh.readFontInfoIntoByteBuffer(context, c9965cArr, cancellationSignal);
        Object objNewFamily = newFamily();
        if (objNewFamily == null) {
            return null;
        }
        boolean z = false;
        for (np6.C9965c c9965c : c9965cArr) {
            ByteBuffer byteBuffer = fontInfoIntoByteBuffer.get(c9965c.getUri());
            if (byteBuffer != null) {
                if (!addFontFromBuffer(objNewFamily, byteBuffer, c9965c.getTtcIndex(), c9965c.getWeight(), c9965c.isItalic() ? 1 : 0)) {
                    abortCreation(objNewFamily);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            abortCreation(objNewFamily);
            return null;
        }
        if (freeze(objNewFamily) && (typefaceCreateFromFamiliesWithDefault = createFromFamiliesWithDefault(objNewFamily)) != null) {
            return Typeface.create(typefaceCreateFromFamiliesWithDefault, i);
        }
        return null;
    }

    @Override // p000.inh
    @hib
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String str, int i2) {
        if (!isFontFamilyPrivateAPIAvailable()) {
            return super.createFromResourcesFontFile(context, resources, i, str, i2);
        }
        Object objNewFamily = newFamily();
        if (objNewFamily == null) {
            return null;
        }
        if (!addFontFromAssetManager(context, objNewFamily, str, 0, -1, -1, null)) {
            abortCreation(objNewFamily);
            return null;
        }
        if (freeze(objNewFamily)) {
            return createFromFamiliesWithDefault(objNewFamily);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public Method m10999f(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f37196z, null);
    }

    /* JADX INFO: renamed from: g */
    public Method m11000g(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(f37192v, AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: h */
    public Method m11001h(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(f37193w, ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* JADX INFO: renamed from: i */
    public Method mo11002i(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: j */
    public Class<?> m11003j() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* JADX INFO: renamed from: k */
    public Constructor<?> m11004k(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(null);
    }

    /* JADX INFO: renamed from: l */
    public Method m11005l(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f37195y, null);
    }
}
