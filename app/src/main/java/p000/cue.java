package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.C0713b;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class cue {

    /* JADX INFO: renamed from: f */
    public static final int f27654f = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final i2g<Character> f27655a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qic f27656b = new qic(new C4512c(this));

    /* JADX INFO: renamed from: c */
    @yfb
    public final n72 f27657c = new n72() { // from class: bue
        @Override // p000.n72
        public final int transform(int i, int i2) {
            return cue.codepointTransformation$lambda$0(this.f14817b, i, i2);
        }
    };

    /* JADX INFO: renamed from: d */
    @yfb
    public final InterfaceC0701e f27658d = C0713b.onFocusChanged(InterfaceC0701e.f5158d1, new C4510a());

    /* JADX INFO: renamed from: e */
    @yfb
    public final au1<bth> f27659e = nu1.Channel$default(Integer.MAX_VALUE, null, null, 6, null);

    /* JADX INFO: renamed from: cue$a */
    public static final class C4510a extends tt8 implements qy6<in6, bth> {
        public C4510a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(in6 in6Var) {
            invoke2(in6Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb in6 in6Var) {
            if (in6Var.isFocused()) {
                return;
            }
            cue.this.getPasswordInputTransformation().hide();
        }
    }

    /* JADX INFO: renamed from: cue$b */
    @ck3(m4009c = "androidx.compose.foundation.text.SecureTextFieldController$observeHideEvents$2", m4010f = "BasicSecureTextField.kt", m4011i = {}, m4012l = {242}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C4511b extends ugg implements gz6<bth, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f27661a;

        public C4511b(zy2<? super C4511b> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return cue.this.new C4511b(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb bth bthVar, @gib zy2<? super bth> zy2Var) {
            return ((C4511b) create(bthVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f27661a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                this.f27661a = 1;
                if (p34.delay(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            cue.this.getPasswordInputTransformation().hide();
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: cue$c */
    public /* synthetic */ class C4512c extends n07 implements ny6<bth> {
        public C4512c(Object obj) {
            super(0, obj, cue.class, "scheduleHide", "scheduleHide()V", 0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((cue) this.receiver).scheduleHide();
        }
    }

    public cue(@yfb i2g<Character> i2gVar) {
        this.f27655a = i2gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int codepointTransformation$lambda$0(cue cueVar, int i, int i2) {
        return i == cueVar.f27656b.getRevealCodepointIndex$foundation_release() ? i2 : cueVar.f27655a.getValue().charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleHide() {
        if (xu1.m33281isFailureimpl(this.f27659e.mo28705trySendJP2dKIU(bth.f14751a))) {
            this.f27656b.hide();
        }
    }

    @yfb
    public final n72 getCodepointTransformation() {
        return this.f27657c;
    }

    @yfb
    public final InterfaceC0701e getFocusChangeModifier() {
        return this.f27658d;
    }

    @yfb
    public final qic getPasswordInputTransformation() {
        return this.f27656b;
    }

    @gib
    public final Object observeHideEvents(@yfb zy2<? super bth> zy2Var) {
        Object objCollectLatest = c76.collectLatest(c76.consumeAsFlow(this.f27659e), new C4511b(null), zy2Var);
        return objCollectLatest == pd8.getCOROUTINE_SUSPENDED() ? objCollectLatest : bth.f14751a;
    }
}
