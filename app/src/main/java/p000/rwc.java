package p000;

import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@by4
public final class rwc {

    /* JADX INFO: renamed from: a */
    public static final Logger f79954a = Logger.getLogger(rwc.class.getName());

    /* JADX INFO: renamed from: b */
    public static final ukc f79955b = loadPatternCompiler();

    /* JADX INFO: renamed from: rwc$b */
    public static final class C12338b implements ukc {
        private C12338b() {
        }

        @Override // p000.ukc
        public hc2 compile(String pattern) {
            return new gj8(Pattern.compile(pattern));
        }

        @Override // p000.ukc
        public boolean isPcreLike() {
            return true;
        }
    }

    private rwc() {
    }

    /* JADX INFO: renamed from: a */
    public static hc2 m21588a(String pattern) {
        v7d.checkNotNull(pattern);
        return f79955b.compile(pattern);
    }

    @wx1
    /* JADX INFO: renamed from: b */
    public static String m21589b(@wx1 String string) {
        if (m21595h(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static String m21590c(double value) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(value));
    }

    /* JADX INFO: renamed from: d */
    public static <T extends Enum<T>> z6c<T> m21591d(Class<T> enumClass, String value) {
        WeakReference<? extends Enum<?>> weakReference = n45.m17772a(enumClass).get(value);
        return weakReference == null ? z6c.absent() : z6c.m26593of(enumClass.cast(weakReference.get()));
    }

    /* JADX INFO: renamed from: e */
    public static String m21592e(@wx1 String string) {
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m21593f() {
        return f79955b.isPcreLike();
    }

    /* JADX INFO: renamed from: g */
    public static yv1 m21594g(yv1 matcher) {
        return matcher.m26361b();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m21595h(@wx1 String string) {
        return string == null || string.isEmpty();
    }

    private static ukc loadPatternCompiler() {
        return new C12338b();
    }

    private static void logPatternCompilerError(ServiceConfigurationError e) {
        f79954a.log(Level.WARNING, "Error loading regex compiler, falling back to next option", (Throwable) e);
    }
}
