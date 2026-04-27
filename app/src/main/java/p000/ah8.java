package p000;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes7.dex */
public class ah8 extends zg8 {

    /* JADX INFO: renamed from: ah8$a */
    @dwf({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    public static final class C0251a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C0251a f1619a = new C0251a();

        /* JADX INFO: renamed from: b */
        @gib
        @un8
        public static final Integer f1620b;

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
            f1620b = num;
        }

        private C0251a() {
        }
    }

    private final boolean sdkIsNullOrAtLeast(int i) {
        Integer num = C0251a.f1620b;
        return num == null || num.intValue() >= i;
    }

    @Override // p000.cxc
    @yfb
    public tod defaultPlatformRandom() {
        return sdkIsNullOrAtLeast(34) ? new ayc() : super.defaultPlatformRandom();
    }

    @Override // p000.cxc
    @gib
    public tv9 getMatchResultNamedGroup(@yfb MatchResult matchResult, @yfb String str) {
        md8.checkNotNullParameter(matchResult, "matchResult");
        md8.checkNotNullParameter(str, "name");
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        f78 f78Var = new f78(matcher.start(str), matcher.end(str) - 1);
        if (f78Var.getStart().intValue() < 0) {
            return null;
        }
        String strGroup = matcher.group(str);
        md8.checkNotNullExpressionValue(strGroup, "group(...)");
        return new tv9(strGroup, f78Var);
    }
}
