package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.input.pointer.SuspendPointerInputElement;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,831:1\n26#2:832\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt\n*L\n790#1:832\n*E\n"})
public final class vgg {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f91118a = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";

    /* JADX INFO: renamed from: b */
    @yfb
    public static final t1d f91119b = new t1d(l82.emptyList());

    /* JADX INFO: renamed from: c */
    @yfb
    public static final StackTraceElement[] f91120c = new StackTraceElement[0];

    @yfb
    public static final wgg SuspendingPointerInputModifierNode(@yfb gz6<? super s2d, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return new xgg(null, null, null, gz6Var);
    }

    private static /* synthetic */ void getPointerInputModifierNoParamError$annotations() {
    }

    @yfb
    @q64(level = u64.f86866b, message = f91118a)
    public static final InterfaceC0701e pointerInput(@yfb InterfaceC0701e interfaceC0701e, @yfb gz6<? super s2d, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        throw new IllegalStateException(f91118a);
    }

    @yfb
    public static final InterfaceC0701e pointerInput(@yfb InterfaceC0701e interfaceC0701e, @gib Object obj, @yfb gz6<? super s2d, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return interfaceC0701e.then(new SuspendPointerInputElement(obj, null, null, gz6Var, 6, null));
    }

    @yfb
    public static final InterfaceC0701e pointerInput(@yfb InterfaceC0701e interfaceC0701e, @gib Object obj, @gib Object obj2, @yfb gz6<? super s2d, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return interfaceC0701e.then(new SuspendPointerInputElement(obj, obj2, null, gz6Var, 4, null));
    }

    @yfb
    public static final InterfaceC0701e pointerInput(@yfb InterfaceC0701e interfaceC0701e, @yfb Object[] objArr, @yfb gz6<? super s2d, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return interfaceC0701e.then(new SuspendPointerInputElement(null, null, objArr, gz6Var, 3, null));
    }
}
