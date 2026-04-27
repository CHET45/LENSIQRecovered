package p000;

import android.util.Log;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o10 {

    /* JADX INFO: renamed from: c */
    public static final String f66188c = "ApiUtils";

    /* JADX INFO: renamed from: a */
    public Map<Class, C10134c> f66189a;

    /* JADX INFO: renamed from: b */
    public Map<Class, Class> f66190b;

    /* JADX INFO: renamed from: o10$b */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC10133b {
        boolean isMock() default false;
    }

    /* JADX INFO: renamed from: o10$c */
    public static class C10134c {
    }

    /* JADX INFO: renamed from: o10$d */
    public static class C10135d {

        /* JADX INFO: renamed from: a */
        public static final o10 f66191a = new o10();

        private C10135d() {
        }
    }

    @hib
    public static <T extends C10134c> T getApi(@efb Class<T> cls) {
        if (cls != null) {
            return (T) getInstance().getApiInner(cls);
        }
        throw new NullPointerException("Argument 'apiClass' of type Class<T> (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <Result> Result getApiInner(Class cls) {
        Result result = (Result) ((C10134c) this.f66189a.get(cls));
        if (result != null) {
            return result;
        }
        synchronized (cls) {
            try {
                Result result2 = (Result) ((C10134c) this.f66189a.get(cls));
                if (result2 != null) {
                    return result2;
                }
                Class cls2 = this.f66190b.get(cls);
                if (cls2 == null) {
                    Log.e(f66188c, "The <" + cls + "> doesn't implement.");
                    return null;
                }
                try {
                    Result result3 = (Result) ((C10134c) cls2.newInstance());
                    this.f66189a.put(cls, (C10134c) result3);
                    return result3;
                } catch (Exception unused) {
                    Log.e(f66188c, "The <" + cls2 + "> has no parameterless constructor.");
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static o10 getInstance() {
        return C10135d.f66191a;
    }

    private void init() {
    }

    public static void register(@hib Class<? extends C10134c> cls) {
        if (cls == null) {
            return;
        }
        getInstance().registerImpl(cls);
    }

    private void registerImpl(Class cls) {
        this.f66190b.put(cls.getSuperclass(), cls);
    }

    @efb
    public static String toString_() {
        String string = getInstance().toString();
        if (string != null) {
            return string;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ApiUtils.toString_() marked by @androidx.annotation.NonNull");
    }

    public String toString() {
        return "ApiUtils: " + this.f66190b;
    }

    private o10() {
        this.f66189a = new ConcurrentHashMap();
        this.f66190b = new HashMap();
        init();
    }
}
