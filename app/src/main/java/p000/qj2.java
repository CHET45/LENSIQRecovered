package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0384b;
import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.C1156p;
import androidx.savedstate.C1414a;

/* JADX INFO: loaded from: classes.dex */
public class qj2 extends Dialog implements g59, z1c, bme {

    /* JADX INFO: renamed from: a */
    @gib
    public C1156p f74565a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ame f74566b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final w1c f74567c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public qj2(@yfb Context context) {
        this(context, 0, 2, null);
        md8.checkNotNullParameter(context, "context");
    }

    private final C1156p getLifecycleRegistry() {
        C1156p c1156p = this.f74565a;
        if (c1156p != null) {
            return c1156p;
        }
        C1156p c1156p2 = new C1156p(this);
        this.f74565a = c1156p2;
        return c1156p2;
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher$lambda$1(qj2 qj2Var) {
        md8.checkNotNullParameter(qj2Var, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@yfb View view, @gib ViewGroup.LayoutParams layoutParams) {
        md8.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // p000.g59
    @yfb
    public AbstractC1143j getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // p000.z1c
    @yfb
    public final w1c getOnBackPressedDispatcher() {
        return this.f74567c;
    }

    @Override // p000.bme
    @yfb
    public zle getSavedStateRegistry() {
        return this.f74566b.getSavedStateRegistry();
    }

    @un1
    public void initializeViewTreeOwners() {
        Window window = getWindow();
        md8.checkNotNull(window);
        View decorView = window.getDecorView();
        md8.checkNotNullExpressionValue(decorView, "window!!.decorView");
        zbi.set(decorView, this);
        Window window2 = getWindow();
        md8.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        md8.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        C0384b.set(decorView2, this);
        Window window3 = getWindow();
        md8.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        md8.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        C1414a.set(decorView3, this);
    }

    @Override // android.app.Dialog
    @un1
    public void onBackPressed() {
        this.f74567c.onBackPressed();
    }

    @Override // android.app.Dialog
    @un1
    public void onCreate(@gib Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            w1c w1cVar = this.f74567c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            md8.checkNotNullExpressionValue(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            w1cVar.setOnBackInvokedDispatcher(onBackInvokedDispatcher);
        }
        this.f74566b.performRestore(bundle);
        getLifecycleRegistry().handleLifecycleEvent(AbstractC1143j.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    @yfb
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        md8.checkNotNullExpressionValue(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f74566b.performSave(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    @un1
    public void onStart() {
        super.onStart();
        getLifecycleRegistry().handleLifecycleEvent(AbstractC1143j.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    @un1
    public void onStop() {
        getLifecycleRegistry().handleLifecycleEvent(AbstractC1143j.a.ON_DESTROY);
        this.f74565a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        super.setContentView(i);
    }

    public /* synthetic */ qj2(Context context, int i, int i2, jt3 jt3Var) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yn8
    public qj2(@yfb Context context, @dbg int i) {
        super(context, i);
        md8.checkNotNullParameter(context, "context");
        this.f74566b = ame.f2124d.create(this);
        this.f74567c = new w1c(new Runnable() { // from class: pj2
            @Override // java.lang.Runnable
            public final void run() {
                qj2.onBackPressedDispatcher$lambda$1(this.f71064a);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(@yfb View view) {
        md8.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@yfb View view, @gib ViewGroup.LayoutParams layoutParams) {
        md8.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }
}
