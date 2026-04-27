package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes7.dex */
public final class dpe {

    /* JADX INFO: renamed from: a */
    public static final String f30348a = "rx3.purge-enabled";

    /* JADX INFO: renamed from: b */
    public static final boolean f30349b = m9293a(true, f30348a, true, true, new C4903a());

    /* JADX INFO: renamed from: dpe$a */
    public static final class C4903a implements sy6<String, String> {
        @Override // p000.sy6
        public String apply(String t) {
            return System.getProperty(t);
        }
    }

    private dpe() {
        throw new IllegalStateException("No instances!");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9293a(boolean enabled, String key, boolean defaultNotFound, boolean defaultNotEnabled, sy6<String, String> propertyAccessor) {
        if (!enabled) {
            return defaultNotEnabled;
        }
        try {
            String strApply = propertyAccessor.apply(key);
            return strApply == null ? defaultNotFound : "true".equals(strApply);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            return defaultNotFound;
        }
    }

    public static ScheduledExecutorService create(ThreadFactory factory) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, factory);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(f30349b);
        return scheduledThreadPoolExecutor;
    }
}
