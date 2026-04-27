package p000;

import java.io.Closeable;
import java.util.Map;
import org.slf4j.impl.StaticMDCBinder;
import org.slf4j.spi.MDCAdapter;

/* JADX INFO: loaded from: classes8.dex */
public class kq9 {

    /* JADX INFO: renamed from: a */
    public static final String f55052a = "http://www.slf4j.org/codes.html#null_MDCA";

    /* JADX INFO: renamed from: b */
    public static final String f55053b = "http://www.slf4j.org/codes.html#no_static_mdc_binder";

    /* JADX INFO: renamed from: c */
    public static MDCAdapter f55054c;

    /* JADX INFO: renamed from: kq9$b */
    public static class C8499b implements Closeable {

        /* JADX INFO: renamed from: a */
        public final String f55055a;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            kq9.remove(this.f55055a);
        }

        private C8499b(String str) {
            this.f55055a = str;
        }
    }

    static {
        try {
            f55054c = bwCompatibleGetMDCAdapterFromBinder();
        } catch (Exception e) {
            z0i.report("MDC binding unsuccessful.", e);
        } catch (NoClassDefFoundError e2) {
            f55054c = new k8b();
            String message = e2.getMessage();
            if (message == null || !message.contains("StaticMDCBinder")) {
                throw e2;
            }
            z0i.report("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
            z0i.report("Defaulting to no-operation MDCAdapter implementation.");
            z0i.report("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
        }
    }

    private kq9() {
    }

    private static MDCAdapter bwCompatibleGetMDCAdapterFromBinder() throws NoClassDefFoundError {
        try {
            return StaticMDCBinder.getSingleton().getMDCA();
        } catch (NoSuchMethodError unused) {
            return StaticMDCBinder.SINGLETON.getMDCA();
        }
    }

    public static void clear() {
        MDCAdapter mDCAdapter = f55054c;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.clear();
    }

    public static String get(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        MDCAdapter mDCAdapter = f55054c;
        if (mDCAdapter != null) {
            return mDCAdapter.get(str);
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    public static Map<String, String> getCopyOfContextMap() {
        MDCAdapter mDCAdapter = f55054c;
        if (mDCAdapter != null) {
            return mDCAdapter.getCopyOfContextMap();
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    public static MDCAdapter getMDCAdapter() {
        return f55054c;
    }

    public static void put(String str, String str2) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        MDCAdapter mDCAdapter = f55054c;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.put(str, str2);
    }

    public static C8499b putCloseable(String str, String str2) throws IllegalArgumentException {
        put(str, str2);
        return new C8499b(str);
    }

    public static void remove(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        MDCAdapter mDCAdapter = f55054c;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.remove(str);
    }

    public static void setContextMap(Map<String, String> map) {
        MDCAdapter mDCAdapter = f55054c;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.setContextMap(map);
    }
}
