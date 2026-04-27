package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import p000.do6;
import p000.xn6;

/* JADX INFO: loaded from: classes.dex */
public final class r64 implements xn6.InterfaceC15211b {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C11901a f77106b = new C11901a(null);

    /* JADX INFO: renamed from: c */
    @yfb
    public static Map<do6.InterfaceC4891b, xn6.InterfaceC15211b> f77107c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    @yfb
    public static final cig f77108d = whg.createSynchronizedObject();

    /* JADX INFO: renamed from: a */
    @yfb
    public final do6.InterfaceC4891b f77109a;

    /* JADX INFO: renamed from: r64$a */
    @dwf({"SMAP\nTextLayoutResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,610:1\n26#2:611\n1#3:612\n*S KotlinDebug\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n*L\n290#1:611\n*E\n"})
    public static final class C11901a {
        public /* synthetic */ C11901a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final xn6.InterfaceC15211b from(@yfb do6.InterfaceC4891b interfaceC4891b) {
            synchronized (getLock()) {
                C11901a c11901a = r64.f77106b;
                xn6.InterfaceC15211b interfaceC15211b = c11901a.getCache().get(interfaceC4891b);
                if (interfaceC15211b != null) {
                    return interfaceC15211b;
                }
                r64 r64Var = new r64(interfaceC4891b, null);
                c11901a.getCache().put(interfaceC4891b, r64Var);
                return r64Var;
            }
        }

        @yfb
        public final Map<do6.InterfaceC4891b, xn6.InterfaceC15211b> getCache() {
            return r64.f77107c;
        }

        @yfb
        public final cig getLock() {
            return r64.f77108d;
        }

        public final void setCache(@yfb Map<do6.InterfaceC4891b, xn6.InterfaceC15211b> map) {
            r64.f77107c = map;
        }

        private C11901a() {
        }
    }

    public /* synthetic */ r64(do6.InterfaceC4891b interfaceC4891b, jt3 jt3Var) {
        this(interfaceC4891b);
    }

    @Override // p000.xn6.InterfaceC15211b
    @yfb
    @q64(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @i2e(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    public Object load(@yfb xn6 xn6Var) {
        return do6.InterfaceC4891b.m28658resolveDPcqOEQ$default(this.f77109a, ko6.toFontFamily(xn6Var), xn6Var.getWeight(), xn6Var.mo30175getStyle_LCdwA(), 0, 8, null).getValue();
    }

    private r64(do6.InterfaceC4891b interfaceC4891b) {
        this.f77109a = interfaceC4891b;
    }
}
