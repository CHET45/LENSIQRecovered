package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.p002ui.graphics.layer.InterfaceC0742a;
import androidx.compose.p002ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.p002ui.graphics.layer.view.ViewLayerContainer;

/* JADX INFO: renamed from: at */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidGraphicsContext.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGraphicsContext.android.kt\nandroidx/compose/ui/graphics/AndroidGraphicsContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
public final class C1600at implements s97 {

    /* JADX INFO: renamed from: h */
    @yfb
    public static final c f11812h = new c(null);

    /* JADX INFO: renamed from: i */
    public static boolean f11813i = true;

    /* JADX INFO: renamed from: j */
    public static final boolean f11814j = false;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ViewGroup f11815a;

    /* JADX INFO: renamed from: d */
    @gib
    public DrawChildContainer f11818d;

    /* JADX INFO: renamed from: e */
    public boolean f11819e;

    /* JADX INFO: renamed from: f */
    public boolean f11820f;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Object f11816b = new Object();

    /* JADX INFO: renamed from: c */
    @gib
    public final wu8 f11817c = null;

    /* JADX INFO: renamed from: g */
    @gib
    public final ComponentCallbacks2 f11821g = null;

    /* JADX INFO: renamed from: at$a */
    public static final class a implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: at$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC16408a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1600at f11823a;

            public ViewTreeObserverOnPreDrawListenerC16408a(C1600at c1600at) {
                this.f11823a = c1600at;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                this.f11823a.f11817c.updateLayerPersistence();
                this.f11823a.f11815a.getViewTreeObserver().removeOnPreDrawListener(this);
                this.f11823a.f11820f = false;
                return true;
            }
        }

        public a() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@yfb Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            if (i < 40 || C1600at.this.f11820f) {
                return;
            }
            C1600at.this.f11817c.destroy();
            C1600at.this.f11815a.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC16408a(C1600at.this));
            C1600at.this.f11820f = true;
        }
    }

    /* JADX INFO: renamed from: at$b */
    public static final class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@yfb View view) {
            C1600at.this.registerComponentCallback(view.getContext());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@yfb View view) {
            C1600at.this.unregisterComponentCallback(view.getContext());
            C1600at.this.f11817c.destroy();
        }
    }

    /* JADX INFO: renamed from: at$c */
    public static final class c {
        public /* synthetic */ c(jt3 jt3Var) {
            this();
        }

        public final boolean isRenderNodeCompatible() {
            return C1600at.f11813i;
        }

        public final void setRenderNodeCompatible(boolean z) {
            C1600at.f11813i = z;
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: at$d */
    @c5e(29)
    public static final class d {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final d f11825a = new d();

        private d() {
        }

        @do8
        @ih4
        public static final long getUniqueDrawingId(@yfb View view) {
            return view.getUniqueDrawingId();
        }
    }

    public C1600at(@yfb ViewGroup viewGroup) {
        this.f11815a = viewGroup;
    }

    private final long getUniqueDrawingId(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.getUniqueDrawingId(view);
        }
        return -1L;
    }

    private final DrawChildContainer obtainViewLayerContainer(ViewGroup viewGroup) {
        DrawChildContainer drawChildContainer = this.f11818d;
        if (drawChildContainer != null) {
            return drawChildContainer;
        }
        ViewLayerContainer viewLayerContainer = new ViewLayerContainer(viewGroup.getContext());
        viewGroup.addView(viewLayerContainer);
        this.f11818d = viewLayerContainer;
        return viewLayerContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerComponentCallback(Context context) {
        if (this.f11819e) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(this.f11821g);
        this.f11819e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterComponentCallback(Context context) {
        if (this.f11819e) {
            context.getApplicationContext().unregisterComponentCallbacks(this.f11821g);
            this.f11819e = false;
        }
    }

    @Override // p000.s97
    @yfb
    public u97 createGraphicsLayer() {
        InterfaceC0742a za7Var;
        u97 u97Var;
        synchronized (this.f11816b) {
            try {
                long uniqueDrawingId = getUniqueDrawingId(this.f11815a);
                if (Build.VERSION.SDK_INT >= 29) {
                    za7Var = new ya7(uniqueDrawingId, null, null, 6, null);
                } else if (f11813i) {
                    try {
                        za7Var = new z97(this.f11815a, uniqueDrawingId, null, null, 12, null);
                    } catch (Throwable unused) {
                        f11813i = false;
                        za7Var = new za7(obtainViewLayerContainer(this.f11815a), uniqueDrawingId, null, null, 12, null);
                    }
                } else {
                    za7Var = new za7(obtainViewLayerContainer(this.f11815a), uniqueDrawingId, null, null, 12, null);
                }
                u97Var = new u97(za7Var, this.f11817c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return u97Var;
    }

    public final boolean isLayerManagerInitialized() {
        wu8 wu8Var = this.f11817c;
        if (wu8Var != null) {
            return wu8Var.hasImageReader();
        }
        return false;
    }

    @Override // p000.s97
    public void releaseGraphicsLayer(@yfb u97 u97Var) {
        synchronized (this.f11816b) {
            u97Var.release$ui_graphics_release();
            bth bthVar = bth.f14751a;
        }
    }
}
