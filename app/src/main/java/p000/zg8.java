package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class zg8 extends cxc {

    /* JADX INFO: renamed from: zg8$a */
    @dwf({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    public static final class C16131a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C16131a f105052a = new C16131a();

        /* JADX INFO: renamed from: b */
        @gib
        @un8
        public static final Integer f105053b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f105053b = num;
        }

        private C16131a() {
        }
    }

    private final boolean sdkIsNullOrAtLeast(int i) {
        Integer num = C16131a.f105053b;
        return num == null || num.intValue() >= i;
    }

    @Override // p000.cxc
    public void addSuppressed(@yfb Throwable th, @yfb Throwable th2) throws IllegalAccessException, InvocationTargetException {
        md8.checkNotNullParameter(th, "cause");
        md8.checkNotNullParameter(th2, "exception");
        if (sdkIsNullOrAtLeast(19)) {
            th.addSuppressed(th2);
        } else {
            super.addSuppressed(th, th2);
        }
    }

    @Override // p000.cxc
    @yfb
    public List<Throwable> getSuppressed(@yfb Throwable th) {
        md8.checkNotNullParameter(th, "exception");
        if (!sdkIsNullOrAtLeast(19)) {
            return super.getSuppressed(th);
        }
        Throwable[] suppressed = th.getSuppressed();
        md8.checkNotNullExpressionValue(suppressed, "getSuppressed(...)");
        return u70.asList(suppressed);
    }
}
