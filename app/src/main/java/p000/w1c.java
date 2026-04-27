package p000;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.InterfaceC1154n;
import java.util.Iterator;
import java.util.ListIterator;
import p000.w1c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n1747#2,3:431\n533#2,6:434\n533#2,6:440\n533#2,6:446\n533#2,6:452\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n114#1:431,3\n233#1:434,6\n251#1:440,6\n271#1:446,6\n290#1:452,6\n*E\n"})
public final class w1c {

    /* JADX INFO: renamed from: a */
    @gib
    public final Runnable f93082a;

    /* JADX INFO: renamed from: b */
    @gib
    public final vu2<Boolean> f93083b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final e60<v1c> f93084c;

    /* JADX INFO: renamed from: d */
    @gib
    public v1c f93085d;

    /* JADX INFO: renamed from: e */
    @gib
    public OnBackInvokedCallback f93086e;

    /* JADX INFO: renamed from: f */
    @gib
    public OnBackInvokedDispatcher f93087f;

    /* JADX INFO: renamed from: g */
    public boolean f93088g;

    /* JADX INFO: renamed from: h */
    public boolean f93089h;

    /* JADX INFO: renamed from: w1c$a */
    public static final class C14349a extends tt8 implements qy6<on0, bth> {
        public C14349a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(on0 on0Var) {
            invoke2(on0Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb on0 on0Var) {
            md8.checkNotNullParameter(on0Var, "backEvent");
            w1c.this.onBackStarted(on0Var);
        }
    }

    /* JADX INFO: renamed from: w1c$b */
    public static final class C14350b extends tt8 implements qy6<on0, bth> {
        public C14350b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(on0 on0Var) {
            invoke2(on0Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb on0 on0Var) {
            md8.checkNotNullParameter(on0Var, "backEvent");
            w1c.this.onBackProgressed(on0Var);
        }
    }

    /* JADX INFO: renamed from: w1c$c */
    public static final class C14351c extends tt8 implements ny6<bth> {
        public C14351c() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            w1c.this.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: w1c$d */
    public static final class C14352d extends tt8 implements ny6<bth> {
        public C14352d() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            w1c.this.onBackCancelled();
        }
    }

    /* JADX INFO: renamed from: w1c$e */
    public static final class C14353e extends tt8 implements ny6<bth> {
        public C14353e() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            w1c.this.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: w1c$f */
    @c5e(33)
    public static final class C14354f {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C14354f f93095a = new C14354f();

        private C14354f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createOnBackInvokedCallback$lambda$0(ny6 ny6Var) {
            md8.checkNotNullParameter(ny6Var, "$onBackInvoked");
            ny6Var.invoke();
        }

        @yfb
        @ih4
        public final OnBackInvokedCallback createOnBackInvokedCallback(@yfb final ny6<bth> ny6Var) {
            md8.checkNotNullParameter(ny6Var, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: x1c
                public final void onBackInvoked() {
                    w1c.C14354f.createOnBackInvokedCallback$lambda$0(ny6Var);
                }
            };
        }

        @ih4
        public final void registerOnBackInvokedCallback(@yfb Object obj, int i, @yfb Object obj2) {
            md8.checkNotNullParameter(obj, "dispatcher");
            md8.checkNotNullParameter(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        @ih4
        public final void unregisterOnBackInvokedCallback(@yfb Object obj, @yfb Object obj2) {
            md8.checkNotNullParameter(obj, "dispatcher");
            md8.checkNotNullParameter(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: w1c$g */
    @c5e(34)
    public static final class C14355g {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C14355g f93096a = new C14355g();

        /* JADX INFO: renamed from: w1c$g$a */
        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ qy6<on0, bth> f93097a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ qy6<on0, bth> f93098b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ny6<bth> f93099c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ ny6<bth> f93100d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(qy6<? super on0, bth> qy6Var, qy6<? super on0, bth> qy6Var2, ny6<bth> ny6Var, ny6<bth> ny6Var2) {
                this.f93097a = qy6Var;
                this.f93098b = qy6Var2;
                this.f93099c = ny6Var;
                this.f93100d = ny6Var2;
            }

            public void onBackCancelled() {
                this.f93100d.invoke();
            }

            public void onBackInvoked() {
                this.f93099c.invoke();
            }

            public void onBackProgressed(@yfb BackEvent backEvent) {
                md8.checkNotNullParameter(backEvent, "backEvent");
                this.f93098b.invoke(new on0(backEvent));
            }

            public void onBackStarted(@yfb BackEvent backEvent) {
                md8.checkNotNullParameter(backEvent, "backEvent");
                this.f93097a.invoke(new on0(backEvent));
            }
        }

        private C14355g() {
        }

        @yfb
        @ih4
        public final OnBackInvokedCallback createOnBackAnimationCallback(@yfb qy6<? super on0, bth> qy6Var, @yfb qy6<? super on0, bth> qy6Var2, @yfb ny6<bth> ny6Var, @yfb ny6<bth> ny6Var2) {
            md8.checkNotNullParameter(qy6Var, "onBackStarted");
            md8.checkNotNullParameter(qy6Var2, "onBackProgressed");
            md8.checkNotNullParameter(ny6Var, "onBackInvoked");
            md8.checkNotNullParameter(ny6Var2, "onBackCancelled");
            return new a(qy6Var, qy6Var2, ny6Var, ny6Var2);
        }
    }

    /* JADX INFO: renamed from: w1c$h */
    public final class C14356h implements InterfaceC1154n, cq1 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final AbstractC1143j f93101a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final v1c f93102b;

        /* JADX INFO: renamed from: c */
        @gib
        public cq1 f93103c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ w1c f93104d;

        public C14356h(@yfb w1c w1cVar, @yfb AbstractC1143j abstractC1143j, v1c v1cVar) {
            md8.checkNotNullParameter(abstractC1143j, "lifecycle");
            md8.checkNotNullParameter(v1cVar, "onBackPressedCallback");
            this.f93104d = w1cVar;
            this.f93101a = abstractC1143j;
            this.f93102b = v1cVar;
            abstractC1143j.addObserver(this);
        }

        @Override // p000.cq1
        public void cancel() {
            this.f93101a.removeObserver(this);
            this.f93102b.removeCancellable(this);
            cq1 cq1Var = this.f93103c;
            if (cq1Var != null) {
                cq1Var.cancel();
            }
            this.f93103c = null;
        }

        @Override // androidx.lifecycle.InterfaceC1154n
        public void onStateChanged(@yfb g59 g59Var, @yfb AbstractC1143j.a aVar) {
            md8.checkNotNullParameter(g59Var, "source");
            md8.checkNotNullParameter(aVar, "event");
            if (aVar == AbstractC1143j.a.ON_START) {
                this.f93103c = this.f93104d.addCancellableCallback$activity_release(this.f93102b);
                return;
            }
            if (aVar != AbstractC1143j.a.ON_STOP) {
                if (aVar == AbstractC1143j.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                cq1 cq1Var = this.f93103c;
                if (cq1Var != null) {
                    cq1Var.cancel();
                }
            }
        }
    }

    /* JADX INFO: renamed from: w1c$i */
    public final class C14357i implements cq1 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final v1c f93105a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w1c f93106b;

        public C14357i(@yfb w1c w1cVar, v1c v1cVar) {
            md8.checkNotNullParameter(v1cVar, "onBackPressedCallback");
            this.f93106b = w1cVar;
            this.f93105a = v1cVar;
        }

        @Override // p000.cq1
        public void cancel() {
            this.f93106b.f93084c.remove(this.f93105a);
            if (md8.areEqual(this.f93106b.f93085d, this.f93105a)) {
                this.f93105a.handleOnBackCancelled();
                this.f93106b.f93085d = null;
            }
            this.f93105a.removeCancellable(this);
            ny6<bth> enabledChangedCallback$activity_release = this.f93105a.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.f93105a.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* JADX INFO: renamed from: w1c$j */
    public /* synthetic */ class C14358j extends n07 implements ny6<bth> {
        public C14358j(Object obj) {
            super(0, obj, w1c.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((w1c) this.receiver).updateEnabledCallbacks();
        }
    }

    /* JADX INFO: renamed from: w1c$k */
    public /* synthetic */ class C14359k extends n07 implements ny6<bth> {
        public C14359k(Object obj) {
            super(0, obj, w1c.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((w1c) this.receiver).updateEnabledCallbacks();
        }
    }

    @yn8
    public w1c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ir9
    public final void onBackCancelled() {
        v1c v1cVarPrevious;
        e60<v1c> e60Var = this.f93084c;
        ListIterator<v1c> listIterator = e60Var.listIterator(e60Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                v1cVarPrevious = null;
                break;
            } else {
                v1cVarPrevious = listIterator.previous();
                if (v1cVarPrevious.isEnabled()) {
                    break;
                }
            }
        }
        v1c v1cVar = v1cVarPrevious;
        this.f93085d = null;
        if (v1cVar != null) {
            v1cVar.handleOnBackCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ir9
    public final void onBackProgressed(on0 on0Var) {
        v1c v1cVarPrevious;
        e60<v1c> e60Var = this.f93084c;
        ListIterator<v1c> listIterator = e60Var.listIterator(e60Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                v1cVarPrevious = null;
                break;
            } else {
                v1cVarPrevious = listIterator.previous();
                if (v1cVarPrevious.isEnabled()) {
                    break;
                }
            }
        }
        v1c v1cVar = v1cVarPrevious;
        if (v1cVar != null) {
            v1cVar.handleOnBackProgressed(on0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ir9
    public final void onBackStarted(on0 on0Var) {
        v1c v1cVarPrevious;
        e60<v1c> e60Var = this.f93084c;
        ListIterator<v1c> listIterator = e60Var.listIterator(e60Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                v1cVarPrevious = null;
                break;
            } else {
                v1cVarPrevious = listIterator.previous();
                if (v1cVarPrevious.isEnabled()) {
                    break;
                }
            }
        }
        v1c v1cVar = v1cVarPrevious;
        this.f93085d = v1cVar;
        if (v1cVar != null) {
            v1cVar.handleOnBackStarted(on0Var);
        }
    }

    @c5e(33)
    private final void updateBackInvokedCallbackState(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f93087f;
        OnBackInvokedCallback onBackInvokedCallback = this.f93086e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z && !this.f93088g) {
            C14354f.f93095a.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f93088g = true;
        } else {
            if (z || !this.f93088g) {
                return;
            }
            C14354f.f93095a.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f93088g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateEnabledCallbacks() {
        boolean z = this.f93089h;
        e60<v1c> e60Var = this.f93084c;
        boolean z2 = false;
        if (e60Var == null || !e60Var.isEmpty()) {
            Iterator<v1c> it = e60Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().isEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f93089h = z2;
        if (z2 != z) {
            vu2<Boolean> vu2Var = this.f93083b;
            if (vu2Var != null) {
                vu2Var.accept(Boolean.valueOf(z2));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                updateBackInvokedCallbackState(z2);
            }
        }
    }

    @ir9
    public final void addCallback(@yfb v1c v1cVar) {
        md8.checkNotNullParameter(v1cVar, "onBackPressedCallback");
        addCancellableCallback$activity_release(v1cVar);
    }

    @yfb
    @ir9
    public final cq1 addCancellableCallback$activity_release(@yfb v1c v1cVar) {
        md8.checkNotNullParameter(v1cVar, "onBackPressedCallback");
        this.f93084c.add(v1cVar);
        C14357i c14357i = new C14357i(this, v1cVar);
        v1cVar.addCancellable(c14357i);
        updateEnabledCallbacks();
        v1cVar.setEnabledChangedCallback$activity_release(new C14359k(this));
        return c14357i;
    }

    @fdi
    @ir9
    public final void dispatchOnBackCancelled() {
        onBackCancelled();
    }

    @fdi
    @ir9
    public final void dispatchOnBackProgressed(@yfb on0 on0Var) {
        md8.checkNotNullParameter(on0Var, "backEvent");
        onBackProgressed(on0Var);
    }

    @fdi
    @ir9
    public final void dispatchOnBackStarted(@yfb on0 on0Var) {
        md8.checkNotNullParameter(on0Var, "backEvent");
        onBackStarted(on0Var);
    }

    @ir9
    public final boolean hasEnabledCallbacks() {
        return this.f93089h;
    }

    @ir9
    public final void onBackPressed() {
        v1c v1cVarPrevious;
        e60<v1c> e60Var = this.f93084c;
        ListIterator<v1c> listIterator = e60Var.listIterator(e60Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                v1cVarPrevious = null;
                break;
            } else {
                v1cVarPrevious = listIterator.previous();
                if (v1cVarPrevious.isEnabled()) {
                    break;
                }
            }
        }
        v1c v1cVar = v1cVarPrevious;
        this.f93085d = null;
        if (v1cVar != null) {
            v1cVar.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f93082a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @c5e(33)
    public final void setOnBackInvokedDispatcher(@yfb OnBackInvokedDispatcher onBackInvokedDispatcher) {
        md8.checkNotNullParameter(onBackInvokedDispatcher, "invoker");
        this.f93087f = onBackInvokedDispatcher;
        updateBackInvokedCallbackState(this.f93089h);
    }

    public w1c(@gib Runnable runnable, @gib vu2<Boolean> vu2Var) {
        this.f93082a = runnable;
        this.f93083b = vu2Var;
        this.f93084c = new e60<>();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f93086e = i >= 34 ? C14355g.f93096a.createOnBackAnimationCallback(new C14349a(), new C14350b(), new C14351c(), new C14352d()) : C14354f.f93095a.createOnBackInvokedCallback(new C14353e());
        }
    }

    @ir9
    public final void addCallback(@yfb g59 g59Var, @yfb v1c v1cVar) {
        md8.checkNotNullParameter(g59Var, "owner");
        md8.checkNotNullParameter(v1cVar, "onBackPressedCallback");
        AbstractC1143j lifecycle = g59Var.getLifecycle();
        if (lifecycle.getCurrentState() == AbstractC1143j.b.DESTROYED) {
            return;
        }
        v1cVar.addCancellable(new C14356h(this, lifecycle, v1cVar));
        updateEnabledCallbacks();
        v1cVar.setEnabledChangedCallback$activity_release(new C14358j(this));
    }

    public /* synthetic */ w1c(Runnable runnable, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : runnable);
    }

    @yn8
    public w1c(@gib Runnable runnable) {
        this(runnable, null);
    }
}
