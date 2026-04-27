package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public class cxc {

    /* JADX INFO: renamed from: cxc$a */
    @dwf({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
    public static final class C4556a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C4556a f28014a = new C4556a();

        /* JADX INFO: renamed from: b */
        @gib
        @un8
        public static final Method f28015b;

        /* JADX INFO: renamed from: c */
        @gib
        @un8
        public static final Method f28016c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            md8.checkNotNull(methods);
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (md8.areEqual(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    md8.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    if (md8.areEqual(e80.singleOrNull(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            f28015b = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (md8.areEqual(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            f28016c = method;
        }

        private C4556a() {
        }
    }

    public void addSuppressed(@yfb Throwable th, @yfb Throwable th2) throws IllegalAccessException, InvocationTargetException {
        md8.checkNotNullParameter(th, "cause");
        md8.checkNotNullParameter(th2, "exception");
        Method method = C4556a.f28015b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    @yfb
    public tod defaultPlatformRandom() {
        return new ip5();
    }

    @gib
    public tv9 getMatchResultNamedGroup(@yfb MatchResult matchResult, @yfb String str) {
        md8.checkNotNullParameter(matchResult, "matchResult");
        md8.checkNotNullParameter(str, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    @yfb
    public List<Throwable> getSuppressed(@yfb Throwable th) {
        Object objInvoke;
        List<Throwable> listAsList;
        md8.checkNotNullParameter(th, "exception");
        Method method = C4556a.f28016c;
        return (method == null || (objInvoke = method.invoke(th, null)) == null || (listAsList = u70.asList((Throwable[]) objInvoke)) == null) ? l82.emptyList() : listAsList;
    }
}
