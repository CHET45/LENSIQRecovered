package p000;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;

/* JADX INFO: loaded from: classes8.dex */
public final class kj9 {

    /* JADX INFO: renamed from: a */
    public static final String f54266a = "http://www.slf4j.org/codes.html";

    /* JADX INFO: renamed from: b */
    public static final String f54267b = "http://www.slf4j.org/codes.html#StaticLoggerBinder";

    /* JADX INFO: renamed from: c */
    public static final String f54268c = "http://www.slf4j.org/codes.html#multiple_bindings";

    /* JADX INFO: renamed from: d */
    public static final String f54269d = "http://www.slf4j.org/codes.html#null_LF";

    /* JADX INFO: renamed from: e */
    public static final String f54270e = "http://www.slf4j.org/codes.html#version_mismatch";

    /* JADX INFO: renamed from: f */
    public static final String f54271f = "http://www.slf4j.org/codes.html#substituteLogger";

    /* JADX INFO: renamed from: g */
    public static final String f54272g = "http://www.slf4j.org/codes.html#loggerNameMismatch";

    /* JADX INFO: renamed from: h */
    public static final String f54273h = "http://www.slf4j.org/codes.html#replay";

    /* JADX INFO: renamed from: i */
    public static final String f54274i = "http://www.slf4j.org/codes.html#unsuccessfulInit";

    /* JADX INFO: renamed from: j */
    public static final String f54275j = "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit";

    /* JADX INFO: renamed from: k */
    public static final int f54276k = 0;

    /* JADX INFO: renamed from: l */
    public static final int f54277l = 1;

    /* JADX INFO: renamed from: m */
    public static final int f54278m = 2;

    /* JADX INFO: renamed from: n */
    public static final int f54279n = 3;

    /* JADX INFO: renamed from: o */
    public static final int f54280o = 4;

    /* JADX INFO: renamed from: p */
    public static volatile int f54281p = 0;

    /* JADX INFO: renamed from: t */
    public static final String f54285t = "java.vendor.url";

    /* JADX INFO: renamed from: q */
    public static final rdg f54282q = new rdg();

    /* JADX INFO: renamed from: r */
    public static final j8b f54283r = new j8b();

    /* JADX INFO: renamed from: s */
    public static final String f54284s = "slf4j.detectLoggerNameMismatch";

    /* JADX INFO: renamed from: u */
    public static boolean f54286u = z0i.safeGetBooleanSystemProperty(f54284s);

    /* JADX INFO: renamed from: v */
    public static final String[] f54287v = {"1.6", "1.7"};

    /* JADX INFO: renamed from: w */
    public static String f54288w = "org/slf4j/impl/StaticLoggerBinder.class";

    private kj9() {
    }

    /* JADX INFO: renamed from: a */
    public static void m14793a(Throwable th) {
        f54281p = 2;
        z0i.report("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* JADX INFO: renamed from: b */
    public static Set<URL> m14794b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = kj9.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f54288w) : classLoader.getResources(f54288w);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e) {
            z0i.report("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    private static final void bind() {
        Set<URL> setM14794b;
        try {
            if (isAndroid()) {
                setM14794b = null;
            } else {
                setM14794b = m14794b();
                reportMultipleBindingAmbiguity(setM14794b);
            }
            StaticLoggerBinder.getSingleton();
            f54281p = 3;
            reportActualBinding(setM14794b);
            fixSubstituteLoggers();
            replayEvents();
            f54282q.clear();
        } catch (Exception e) {
            m14793a(e);
            throw new IllegalStateException("Unexpected initialization failure", e);
        } catch (NoClassDefFoundError e2) {
            if (!messageContainsOrgSlf4jImplStaticLoggerBinder(e2.getMessage())) {
                m14793a(e2);
                throw e2;
            }
            f54281p = 4;
            z0i.report("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            z0i.report("Defaulting to no-operation (NOP) logger implementation");
            z0i.report("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e3) {
            String message = e3.getMessage();
            if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                f54281p = 2;
                z0i.report("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                z0i.report("Your binding is version 1.5.5 or earlier.");
                z0i.report("Upgrade your binding to version 1.6.x.");
            }
            throw e3;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m14795c() {
        f54281p = 0;
    }

    private static void emitReplayOrSubstituionWarning(sdg sdgVar, int i) {
        if (sdgVar.getLogger().isDelegateEventAware()) {
            emitReplayWarning(i);
        } else {
            if (sdgVar.getLogger().isDelegateNOP()) {
                return;
            }
            emitSubstitutionWarning();
        }
    }

    private static void emitReplayWarning(int i) {
        z0i.report("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        z0i.report("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        z0i.report("See also http://www.slf4j.org/codes.html#replay");
    }

    private static void emitSubstitutionWarning() {
        z0i.report("The following set of substitute loggers may have been accessed");
        z0i.report("during the initialization phase. Logging calls during this");
        z0i.report("phase were not honored. However, subsequent logging calls to these");
        z0i.report("loggers will work as normally expected.");
        z0i.report("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    private static void fixSubstituteLoggers() {
        rdg rdgVar = f54282q;
        synchronized (rdgVar) {
            try {
                rdgVar.postInitialization();
                for (qdg qdgVar : rdgVar.getLoggers()) {
                    qdgVar.setDelegate(getLogger(qdgVar.getName()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ILoggerFactory getILoggerFactory() {
        if (f54281p == 0) {
            synchronized (kj9.class) {
                try {
                    if (f54281p == 0) {
                        f54281p = 1;
                        performInitialization();
                    }
                } finally {
                }
            }
        }
        int i = f54281p;
        if (i == 1) {
            return f54282q;
        }
        if (i == 2) {
            throw new IllegalStateException(f54275j);
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return f54283r;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static jj9 getLogger(String str) {
        return getILoggerFactory().getLogger(str);
    }

    private static boolean isAmbiguousStaticLoggerBinderPathSet(Set<URL> set) {
        return set.size() > 1;
    }

    private static boolean isAndroid() {
        String strSafeGetSystemProperty = z0i.safeGetSystemProperty(f54285t);
        if (strSafeGetSystemProperty == null) {
            return false;
        }
        return strSafeGetSystemProperty.toLowerCase().contains("android");
    }

    private static boolean messageContainsOrgSlf4jImplStaticLoggerBinder(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    private static boolean nonMatchingClasses(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    private static final void performInitialization() {
        bind();
        if (f54281p == 3) {
            versionSanityCheck();
        }
    }

    private static void replayEvents() {
        LinkedBlockingQueue<sdg> eventQueue = f54282q.getEventQueue();
        int size = eventQueue.size();
        ArrayList<sdg> arrayList = new ArrayList(128);
        int i = 0;
        while (eventQueue.drainTo(arrayList, 128) != 0) {
            for (sdg sdgVar : arrayList) {
                replaySingleEvent(sdgVar);
                int i2 = i + 1;
                if (i == 0) {
                    emitReplayOrSubstituionWarning(sdgVar, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    private static void replaySingleEvent(sdg sdgVar) {
        if (sdgVar == null) {
            return;
        }
        qdg logger = sdgVar.getLogger();
        String name = logger.getName();
        if (logger.isDelegateNull()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (logger.isDelegateNOP()) {
            return;
        }
        if (logger.isDelegateEventAware()) {
            logger.log(sdgVar);
        } else {
            z0i.report(name);
        }
    }

    private static void reportActualBinding(Set<URL> set) {
        if (set == null || !isAmbiguousStaticLoggerBinderPathSet(set)) {
            return;
        }
        z0i.report("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    private static void reportMultipleBindingAmbiguity(Set<URL> set) {
        if (isAmbiguousStaticLoggerBinderPathSet(set)) {
            z0i.report("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                z0i.report("Found binding in [" + it.next() + "]");
            }
            z0i.report("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static final void versionSanityCheck() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f54287v) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            z0i.report("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f54287v).toString());
            z0i.report("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            z0i.report("Unexpected problem occured during version sanity check", th);
        }
    }

    public static jj9 getLogger(Class<?> cls) {
        Class<?> callingClass;
        jj9 logger = getLogger(cls.getName());
        if (f54286u && (callingClass = z0i.getCallingClass()) != null && nonMatchingClasses(cls, callingClass)) {
            z0i.report(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", logger.getName(), callingClass.getName()));
            z0i.report("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return logger;
    }
}
