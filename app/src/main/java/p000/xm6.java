package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.C0722k;
import androidx.compose.p002ui.focus.C0723l;
import androidx.compose.p002ui.focus.C0724m;
import androidx.compose.p002ui.focus.InterfaceC0720i;

/* JADX INFO: loaded from: classes.dex */
public final class xm6 {

    /* JADX INFO: renamed from: xm6$a */
    public static final class C15196a extends tt8 implements qy6<InterfaceC0720i, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ym6 f98498a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15196a(ym6 ym6Var) {
            super(1);
            this.f98498a = ym6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(InterfaceC0720i interfaceC0720i) {
            invoke2(interfaceC0720i);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb InterfaceC0720i interfaceC0720i) {
            this.f98498a.apply(interfaceC0720i);
        }
    }

    /* JADX INFO: renamed from: xm6$b */
    public static final class C15197b extends tt8 implements qy6<InterfaceC0720i, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ym6 f98499a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15197b(ym6 ym6Var) {
            super(1);
            this.f98499a = ym6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(InterfaceC0720i interfaceC0720i) {
            invoke2(interfaceC0720i);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb InterfaceC0720i interfaceC0720i) {
            this.f98499a.apply(interfaceC0720i);
        }
    }

    @yfb
    @q64(message = "Use focusProperties() instead", replaceWith = @i2e(expression = "this.focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties"}))
    public static final InterfaceC0701e focusOrder(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super vm6, bth> qy6Var) {
        return C0722k.focusProperties(interfaceC0701e, new C15196a(new ym6(qy6Var)));
    }

    @yfb
    @q64(message = "Use focusRequester() instead", replaceWith = @i2e(expression = "this.focusRequester(focusRequester)", imports = {"androidx.compose.ui.focus.focusRequester"}))
    public static final InterfaceC0701e focusOrder(@yfb InterfaceC0701e interfaceC0701e, @yfb C0723l c0723l) {
        return C0724m.focusRequester(interfaceC0701e, c0723l);
    }

    @yfb
    @q64(message = "Use focusProperties() and focusRequester() instead", replaceWith = @i2e(expression = "this.focusRequester(focusRequester).focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties, androidx.compose.ui.focus.focusRequester"}))
    public static final InterfaceC0701e focusOrder(@yfb InterfaceC0701e interfaceC0701e, @yfb C0723l c0723l, @yfb qy6<? super vm6, bth> qy6Var) {
        return C0722k.focusProperties(C0724m.focusRequester(interfaceC0701e, c0723l), new C15197b(new ym6(qy6Var)));
    }
}
