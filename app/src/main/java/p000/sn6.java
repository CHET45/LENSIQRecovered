package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import p000.rm6;

/* JADX INFO: loaded from: classes.dex */
public final class sn6 extends InterfaceC0701e.d {

    /* JADX INFO: renamed from: X */
    @gib
    public l5b f82365X;

    /* JADX INFO: renamed from: Y */
    @gib
    public rm6.C12153a f82366Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f82367Z;

    /* JADX INFO: renamed from: sn6$a */
    @ck3(m4009c = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1", m4010f = "Focusable.kt", m4011i = {}, m4012l = {307}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12702a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f82368a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ l5b f82369b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ p98 f82370c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ yf4 f82371d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12702a(l5b l5bVar, p98 p98Var, yf4 yf4Var, zy2<? super C12702a> zy2Var) {
            super(2, zy2Var);
            this.f82369b = l5bVar;
            this.f82370c = p98Var;
            this.f82371d = yf4Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C12702a(this.f82369b, this.f82370c, this.f82371d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C12702a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f82368a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                l5b l5bVar = this.f82369b;
                p98 p98Var = this.f82370c;
                this.f82368a = 1;
                if (l5bVar.emit(p98Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            yf4 yf4Var = this.f82371d;
            if (yf4Var != null) {
                yf4Var.dispose();
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: sn6$b */
    public static final class C12703b extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l5b f82372a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ p98 f82373b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12703b(l5b l5bVar, p98 p98Var) {
            super(1);
            this.f82372a = l5bVar;
            this.f82373b = p98Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            this.f82372a.tryEmit(this.f82373b);
        }
    }

    public sn6(@gib l5b l5bVar) {
        this.f82365X = l5bVar;
    }

    private final void disposeInteractionSource() {
        rm6.C12153a c12153a;
        l5b l5bVar = this.f82365X;
        if (l5bVar != null && (c12153a = this.f82366Y) != null) {
            l5bVar.tryEmit(new rm6.C12154b(c12153a));
        }
        this.f82366Y = null;
    }

    private final void emitWithFallback(l5b l5bVar, p98 p98Var) {
        if (!isAttached()) {
            l5bVar.tryEmit(p98Var);
        } else {
            jj8 jj8Var = (jj8) getCoroutineScope().getCoroutineContext().get(jj8.f50715A);
            fg1.launch$default(getCoroutineScope(), null, null, new C12702a(l5bVar, p98Var, jj8Var != null ? jj8Var.invokeOnCompletion(new C12703b(l5bVar, p98Var)) : null, null), 3, null);
        }
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public boolean getShouldAutoInvalidate() {
        return this.f82367Z;
    }

    public final void setFocus(boolean z) {
        l5b l5bVar = this.f82365X;
        if (l5bVar != null) {
            if (!z) {
                rm6.C12153a c12153a = this.f82366Y;
                if (c12153a != null) {
                    emitWithFallback(l5bVar, new rm6.C12154b(c12153a));
                    this.f82366Y = null;
                    return;
                }
                return;
            }
            rm6.C12153a c12153a2 = this.f82366Y;
            if (c12153a2 != null) {
                emitWithFallback(l5bVar, new rm6.C12154b(c12153a2));
                this.f82366Y = null;
            }
            rm6.C12153a c12153a3 = new rm6.C12153a();
            emitWithFallback(l5bVar, c12153a3);
            this.f82366Y = c12153a3;
        }
    }

    public final void update(@gib l5b l5bVar) {
        if (md8.areEqual(this.f82365X, l5bVar)) {
            return;
        }
        disposeInteractionSource();
        this.f82365X = l5bVar;
    }
}
