package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public interface xn6 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C15210a f98567a = C15210a.f98569a;

    /* JADX INFO: renamed from: b */
    public static final long f98568b = 15000;

    /* JADX INFO: renamed from: xn6$a */
    public static final class C15210a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C15210a f98569a = new C15210a();

        /* JADX INFO: renamed from: b */
        public static final long f98570b = 15000;

        private C15210a() {
        }
    }

    /* JADX INFO: renamed from: xn6$b */
    @q64(message = "Replaced with FontFamily.Resolver during the introduction of async fonts, all usages should be replaced. Custom subclasses can be converted into a FontFamily.Resolver by calling createFontFamilyResolver(myFontFamilyResolver, context)")
    public interface InterfaceC15211b {
        @yfb
        @q64(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @i2e(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
        Object load(@yfb xn6 xn6Var);
    }

    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ */
    default int mo30174getLoadingStrategyPKNRLFQ() {
        return oo6.f68233b.m31524getBlockingPKNRLFQ();
    }

    /* JADX INFO: renamed from: getStyle-_-LCdwA */
    int mo30175getStyle_LCdwA();

    @yfb
    jp6 getWeight();
}
