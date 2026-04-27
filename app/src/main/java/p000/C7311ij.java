package p000;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import p000.v7e;
import sun.misc.Signal;
import sun.misc.SignalHandler;

/* JADX INFO: renamed from: ij */
/* JADX INFO: loaded from: classes7.dex */
@igg({"all"})
@yr7
public final class C7311ij {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C7311ij f47147a = new C7311ij();

    /* JADX INFO: renamed from: b */
    public static final boolean f47148b;

    /* JADX INFO: renamed from: ij$a */
    public static final class a implements ClassFileTransformer {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f47149a = new a();

        private a() {
        }

        @gib
        public byte[] transform(@gib ClassLoader classLoader, @yfb String str, @gib Class<?> cls, @yfb ProtectionDomain protectionDomain, @gib byte[] bArr) {
            if (classLoader == null || !md8.areEqual(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                return null;
            }
            C6333gj.f39919a.setInstalledStatically$kotlinx_coroutines_core(true);
            return uj1.readBytes(classLoader.getResourceAsStream("DebugProbesKt.bin"));
        }
    }

    static {
        Object objM32723constructorimpl;
        try {
            v7e.C13927a c13927a = v7e.f90266b;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            objM32723constructorimpl = v7e.m32723constructorimpl(property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null);
        } catch (Throwable th) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
        }
        Boolean bool = (Boolean) (v7e.m32729isFailureimpl(objM32723constructorimpl) ? null : objM32723constructorimpl);
        f47148b = bool != null ? bool.booleanValue() : gk3.f39982a.getEnableCreationStackTraces$kotlinx_coroutines_core();
    }

    private C7311ij() {
    }

    private final void installSignalHandler() {
        try {
            Signal.handle(new Signal("TRAP"), new SignalHandler() { // from class: hj
                /* JADX INFO: renamed from: a */
                public final void m12413a(Signal signal) {
                    C7311ij.installSignalHandler$lambda$1(signal);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void installSignalHandler$lambda$1(Signal signal) {
        gk3 gk3Var = gk3.f39982a;
        if (gk3Var.isInstalled$kotlinx_coroutines_debug()) {
            gk3Var.dumpCoroutines(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @do8
    public static final void premain(@gib String str, @yfb Instrumentation instrumentation) {
        C6333gj.f39919a.setInstalledStatically$kotlinx_coroutines_core(true);
        instrumentation.addTransformer(a.f47149a);
        gk3 gk3Var = gk3.f39982a;
        gk3Var.setEnableCreationStackTraces$kotlinx_coroutines_core(f47148b);
        gk3Var.install$kotlinx_coroutines_core();
        f47147a.installSignalHandler();
    }
}
