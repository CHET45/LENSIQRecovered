package p000;

import androidx.compose.p002ui.focus.C0725n;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class tn6 extends d44 implements nm6, rxe, o77, gn6 {

    /* JADX INFO: renamed from: c2 */
    public static final int f85359c2 = 8;

    /* JADX INFO: renamed from: M1 */
    public final boolean f85360M1;

    /* JADX INFO: renamed from: V1 */
    @gib
    public in6 f85361V1;

    /* JADX INFO: renamed from: Z1 */
    @yfb
    public final sn6 f85362Z1;

    /* JADX INFO: renamed from: a2 */
    @yfb
    public final un6 f85363a2 = (un6) m8877a(new un6());

    /* JADX INFO: renamed from: b2 */
    @yfb
    public final vn6 f85364b2 = (vn6) m8877a(new vn6());

    /* JADX INFO: renamed from: tn6$a */
    public static final class C13110a extends tt8 implements ny6<Boolean> {
        public C13110a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            return Boolean.valueOf(C0725n.requestFocus(tn6.this));
        }
    }

    /* JADX INFO: renamed from: tn6$b */
    @ck3(m4009c = "androidx.compose.foundation.FocusableNode$onFocusEvent$1", m4010f = "Focusable.kt", m4011i = {}, m4012l = {222}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13111b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f85366a;

        public C13111b(zy2<? super C13111b> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return tn6.this.new C13111b(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C13111b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f85366a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                tn6 tn6Var = tn6.this;
                this.f85366a = 1;
                if (tre.scrollIntoView$default(tn6Var, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    public tn6(@gib l5b l5bVar) {
        this.f85362Z1 = (sn6) m8877a(new sn6(l5bVar));
        m8877a(mn6.FocusTargetModifierNode());
    }

    @Override // p000.rxe
    public void applySemantics(@yfb eye eyeVar) {
        in6 in6Var = this.f85361V1;
        boolean z = false;
        if (in6Var != null && in6Var.isFocused()) {
            z = true;
        }
        bye.setFocused(eyeVar, z);
        bye.requestFocus$default(eyeVar, null, new C13110a(), 1, null);
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public boolean getShouldAutoInvalidate() {
        return this.f85360M1;
    }

    @Override // p000.nm6
    public void onFocusEvent(@yfb in6 in6Var) {
        if (md8.areEqual(this.f85361V1, in6Var)) {
            return;
        }
        boolean zIsFocused = in6Var.isFocused();
        if (zIsFocused) {
            fg1.launch$default(getCoroutineScope(), null, null, new C13111b(null), 3, null);
        }
        if (isAttached()) {
            sxe.invalidateSemantics(this);
        }
        this.f85362Z1.setFocus(zIsFocused);
        this.f85364b2.setFocus(zIsFocused);
        this.f85363a2.setFocus(zIsFocused);
        this.f85361V1 = in6Var;
    }

    @Override // p000.o77
    public void onGloballyPositioned(@yfb mv8 mv8Var) {
        this.f85364b2.onGloballyPositioned(mv8Var);
    }

    public final void update(@gib l5b l5bVar) {
        this.f85362Z1.update(l5bVar);
    }
}
