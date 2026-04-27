package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class hg7 extends InterfaceC0701e.d implements nm6 {

    /* JADX INFO: renamed from: X */
    @gib
    public in6 f43417X;

    /* JADX INFO: renamed from: Y */
    @yfb
    public final fx8 f43418Y = hz8.lazy(g39.f38327c, (ny6) new C6842a());

    /* JADX INFO: renamed from: hg7$a */
    public static final class C6842a extends tt8 implements ny6<hl2> {
        public C6842a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final hl2 invoke() {
            return ol2.ComposeInputMethodManager(x34.requireView(hg7.this));
        }
    }

    /* JADX INFO: renamed from: hg7$b */
    @ck3(m4009c = "androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$onFocusEvent$1", m4010f = "HandwritingHandler.android.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C6843b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f43420a;

        public C6843b(zy2<? super C6843b> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return hg7.this.new C6843b(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C6843b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f43420a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            hg7.this.getComposeImm().acceptStylusHandwritingDelegation();
            return bth.f14751a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hl2 getComposeImm() {
        return (hl2) this.f43418Y.getValue();
    }

    @Override // p000.nm6
    public void onFocusEvent(@yfb in6 in6Var) {
        if (md8.areEqual(this.f43417X, in6Var)) {
            return;
        }
        this.f43417X = in6Var;
        if (in6Var.getHasFocus()) {
            fg1.launch$default(getCoroutineScope(), null, null, new C6843b(null), 3, null);
        }
    }
}
