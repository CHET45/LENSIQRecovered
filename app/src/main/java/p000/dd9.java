package p000;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,161:1\n76#2:162\n76#2:163\n23#3,8:164\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n*L\n48#1:162\n49#1:163\n49#1:164,8\n*E\n"})
@e0g(parameters = 0)
public final class dd9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final dd9 f29416a = new dd9();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final zhd<InterfaceC14545wc> f29417b = pn2.compositionLocalOf$default(null, C4750a.f29419a, 1, null);

    /* JADX INFO: renamed from: c */
    public static final int f29418c = 0;

    /* JADX INFO: renamed from: dd9$a */
    public static final class C4750a extends tt8 implements ny6<InterfaceC14545wc> {

        /* JADX INFO: renamed from: a */
        public static final C4750a f29419a = new C4750a();

        public C4750a() {
            super(0);
        }

        @Override // p000.ny6
        @gib
        public final InterfaceC14545wc invoke() {
            return null;
        }
    }

    private dd9() {
    }

    @gib
    @xn8(name = "getCurrent")
    @hk2
    public final InterfaceC14545wc getCurrent(@gib zl2 zl2Var, int i) {
        zl2Var.startReplaceableGroup(1418020823);
        InterfaceC14545wc interfaceC14545wc = (InterfaceC14545wc) zl2Var.consume(f29417b);
        if (interfaceC14545wc == null) {
            Object baseContext = (Context) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof InterfaceC14545wc) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            interfaceC14545wc = (InterfaceC14545wc) baseContext;
        }
        zl2Var.endReplaceableGroup();
        return interfaceC14545wc;
    }

    @yfb
    public final did<InterfaceC14545wc> provides(@yfb InterfaceC14545wc interfaceC14545wc) {
        return f29417b.provides(interfaceC14545wc);
    }
}
