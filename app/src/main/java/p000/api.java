package p000;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p000.jj8;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
@ia8
public final class api {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final api f11557a = new api();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final AtomicReference<zoi> f11558b = new AtomicReference<>(zoi.f105633a.getLifecycleAware());

    /* JADX INFO: renamed from: c */
    public static final int f11559c = 8;

    /* JADX INFO: renamed from: api$a */
    public static final class ViewOnAttachStateChangeListenerC1553a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jj8 f11560a;

        public ViewOnAttachStateChangeListenerC1553a(jj8 jj8Var) {
            this.f11560a = jj8Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@yfb View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@yfb View view) {
            view.removeOnAttachStateChangeListener(this);
            jj8.C7916a.cancel$default(this.f11560a, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: renamed from: api$b */
    @ck3(m4009c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", m4010f = "WindowRecomposer.android.kt", m4011i = {}, m4012l = {235}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C1554b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f11561a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ wsd f11562b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f11563c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1554b(wsd wsdVar, View view, zy2<? super C1554b> zy2Var) {
            super(2, zy2Var);
            this.f11562b = wsdVar;
            this.f11563c = view;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C1554b(this.f11562b, this.f11563c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C1554b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            View view;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f11561a;
            try {
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    wsd wsdVar = this.f11562b;
                    this.f11561a = 1;
                    if (wsdVar.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                if (bpi.getCompositionContext(view) == this.f11562b) {
                    bpi.setCompositionContext(this.f11563c, null);
                }
                return bth.f14751a;
            } finally {
                if (bpi.getCompositionContext(this.f11563c) == this.f11562b) {
                    bpi.setCompositionContext(this.f11563c, null);
                }
            }
        }
    }

    private api() {
    }

    @yjd
    public final boolean compareAndSetFactory(@yfb zoi zoiVar, @yfb zoi zoiVar2) {
        return v7b.m23844a(f11558b, zoiVar, zoiVar2);
    }

    @yfb
    public final wsd createAndInstallWindowRecomposer$ui_release(@yfb View view) {
        wsd wsdVarCreateRecomposer = f11558b.get().createRecomposer(view);
        bpi.setCompositionContext(view, wsdVarCreateRecomposer);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1553a(fg1.launch$default(q77.f73410a, je7.from(view.getHandler(), "windowRecomposer cleanup").getImmediate(), null, new C1554b(wsdVarCreateRecomposer, view, null), 2, null)));
        return wsdVarCreateRecomposer;
    }

    @yfb
    @yjd
    public final zoi getAndSetFactory(@yfb zoi zoiVar) {
        return f11558b.getAndSet(zoiVar);
    }

    public final void setFactory(@yfb zoi zoiVar) {
        f11558b.set(zoiVar);
    }

    public final <R> R withFactory(@yfb zoi zoiVar, @yfb ny6<? extends R> ny6Var) throws IllegalAccessException, InvocationTargetException {
        zoi andSetFactory = getAndSetFactory(zoiVar);
        try {
            R rInvoke = ny6Var.invoke();
            o28.finallyStart(1);
            if (!compareAndSetFactory(zoiVar, andSetFactory)) {
                throw new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
            }
            o28.finallyEnd(1);
            return rInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o28.finallyStart(1);
                if (compareAndSetFactory(zoiVar, andSetFactory)) {
                    o28.finallyEnd(1);
                    throw th2;
                }
                a85.addSuppressed(th, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th;
            }
        }
    }
}
