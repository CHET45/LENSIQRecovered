package p000;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLiveLiteral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,100:1\n361#2,7:101\n361#2,7:108\n*S KotlinDebug\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n*L\n81#1:101,7\n92#1:108,7\n*E\n"})
public final class tb9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final HashMap<String, z6b<Object>> f84153a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static boolean f84154b;

    @ga8
    public static final void enableLiveLiterals() {
        f84154b = true;
    }

    public static final boolean isLiveLiteralsEnabled() {
        return f84154b;
    }

    @fl2
    @ga8
    public static /* synthetic */ void isLiveLiteralsEnabled$annotations() {
    }

    @fl2
    @yfb
    @ga8
    public static final <T> i2g<T> liveLiteral(@yfb String str, T t) {
        HashMap<String, z6b<Object>> map = f84153a;
        z6b<Object> z6bVarMutableStateOf$default = map.get(str);
        if (z6bVarMutableStateOf$default == null) {
            z6bVarMutableStateOf$default = xtf.mutableStateOf$default(t, null, 2, null);
            map.put(str, z6bVarMutableStateOf$default);
        }
        md8.checkNotNull(z6bVarMutableStateOf$default, "null cannot be cast to non-null type androidx.compose.runtime.State<T of androidx.compose.runtime.internal.LiveLiteralKt.liveLiteral>");
        return z6bVarMutableStateOf$default;
    }

    @ga8
    public static final void updateLiveLiteralValue(@yfb String str, @gib Object obj) {
        boolean z;
        HashMap<String, z6b<Object>> map = f84153a;
        z6b<Object> z6bVarMutableStateOf$default = map.get(str);
        if (z6bVarMutableStateOf$default == null) {
            z6bVarMutableStateOf$default = xtf.mutableStateOf$default(obj, null, 2, null);
            map.put(str, z6bVarMutableStateOf$default);
            z = false;
        } else {
            z = true;
        }
        z6b<Object> z6bVar = z6bVarMutableStateOf$default;
        if (z) {
            z6bVar.setValue(obj);
        }
    }
}
