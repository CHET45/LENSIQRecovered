package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import org.opencv.videoio.Videoio;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,414:1\n37#1:415\n53#1:416\n326#1,4:420\n43#2,3:417\n*S KotlinDebug\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n*L\n68#1:415\n68#1:416\n310#1:420,4\n232#1:417,3\n*E\n"})
public final class r9i {

    /* JADX INFO: renamed from: r9i$a */
    @ck3(m4009c = "androidx.core.view.ViewKt$allViews$1", m4010f = "View.kt", m4011i = {0}, m4012l = {Videoio.CAP_PROP_XI_GPO_SELECTOR, Videoio.CAP_PROP_XI_LED_SELECTOR}, m4013m = "invokeSuspend", m4014n = {"$this$sequence"}, m4015s = {"L$0"})
    public static final class C11952a extends t7e implements gz6<xye<? super View>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f77485a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f77486b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f77487c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11952a(View view, zy2<? super C11952a> zy2Var) {
            super(2, zy2Var);
            this.f77487c = view;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C11952a c11952a = new C11952a(this.f77487c, zy2Var);
            c11952a.f77486b = obj;
            return c11952a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb xye<? super View> xyeVar, @gib zy2<? super bth> zy2Var) {
            return ((C11952a) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            xye xyeVar;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f77485a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                xyeVar = (xye) this.f77486b;
                View view = this.f77487c;
                this.f77486b = xyeVar;
                this.f77485a = 1;
                if (xyeVar.yield(view, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                    return bth.f14751a;
                }
                xyeVar = (xye) this.f77486b;
                y7e.throwOnFailure(obj);
            }
            View view2 = this.f77487c;
            if (view2 instanceof ViewGroup) {
                vye<View> descendants = d9i.getDescendants((ViewGroup) view2);
                this.f77486b = null;
                this.f77485a = 2;
                if (xyeVar.yieldAll(descendants, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: r9i$b */
    public /* synthetic */ class C11953b extends n07 implements qy6<ViewParent, ViewParent> {

        /* JADX INFO: renamed from: a */
        public static final C11953b f77488a = new C11953b();

        public C11953b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // p000.qy6
        public final ViewParent invoke(@yfb ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    /* JADX INFO: renamed from: r9i$c */
    @dwf({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnAttach$1\n*L\n1#1,414:1\n*E\n"})
    public static final class ViewOnAttachStateChangeListenerC11954c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f77489a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<View, bth> f77490b;

        /* JADX WARN: Multi-variable type inference failed */
        public ViewOnAttachStateChangeListenerC11954c(View view, qy6<? super View, bth> qy6Var) {
            this.f77489a = view;
            this.f77490b = qy6Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@yfb View view) {
            this.f77489a.removeOnAttachStateChangeListener(this);
            this.f77490b.invoke(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@yfb View view) {
        }
    }

    /* JADX INFO: renamed from: r9i$d */
    @dwf({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnDetach$1\n*L\n1#1,414:1\n*E\n"})
    public static final class ViewOnAttachStateChangeListenerC11955d implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f77491a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<View, bth> f77492b;

        /* JADX WARN: Multi-variable type inference failed */
        public ViewOnAttachStateChangeListenerC11955d(View view, qy6<? super View, bth> qy6Var) {
            this.f77491a = view;
            this.f77492b = qy6Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@yfb View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@yfb View view) {
            this.f77491a.removeOnAttachStateChangeListener(this);
            this.f77492b.invoke(view);
        }
    }

    /* JADX INFO: renamed from: r9i$e */
    @dwf({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,414:1\n69#2,2:415\n*E\n"})
    public static final class ViewOnLayoutChangeListenerC11956e implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6 f77493a;

        public ViewOnLayoutChangeListenerC11956e(qy6 qy6Var) {
            this.f77493a = qy6Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@yfb View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            this.f77493a.invoke(view);
        }
    }

    /* JADX INFO: renamed from: r9i$f */
    @dwf({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n*L\n1#1,414:1\n*E\n"})
    public static final class ViewOnLayoutChangeListenerC11957f implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<View, bth> f77494a;

        /* JADX WARN: Multi-variable type inference failed */
        public ViewOnLayoutChangeListenerC11957f(qy6<? super View, bth> qy6Var) {
            this.f77494a = qy6Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@yfb View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            this.f77494a.invoke(view);
        }
    }

    /* JADX INFO: renamed from: r9i$g */
    @dwf({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnPreDraw$1\n*L\n1#1,414:1\n*E\n"})
    public static final class RunnableC11958g implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<View, bth> f77495a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f77496b;

        /* JADX WARN: Multi-variable type inference failed */
        public RunnableC11958g(qy6<? super View, bth> qy6Var, View view) {
            this.f77495a = qy6Var;
            this.f77496b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f77495a.invoke(this.f77496b);
        }
    }

    /* JADX INFO: renamed from: r9i$h */
    @dwf({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$postDelayed$runnable$1\n*L\n1#1,414:1\n*E\n"})
    public static final class RunnableC11959h implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<bth> f77497a;

        public RunnableC11959h(ny6<bth> ny6Var) {
            this.f77497a = ny6Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f77497a.invoke();
        }
    }

    public static final void doOnAttach(@yfb View view, @yfb qy6<? super View, bth> qy6Var) {
        if (view.isAttachedToWindow()) {
            qy6Var.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC11954c(view, qy6Var));
        }
    }

    public static final void doOnDetach(@yfb View view, @yfb qy6<? super View, bth> qy6Var) {
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC11955d(view, qy6Var));
        } else {
            qy6Var.invoke(view);
        }
    }

    public static final void doOnLayout(@yfb View view, @yfb qy6<? super View, bth> qy6Var) {
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC11956e(qy6Var));
        } else {
            qy6Var.invoke(view);
        }
    }

    public static final void doOnNextLayout(@yfb View view, @yfb qy6<? super View, bth> qy6Var) {
        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC11957f(qy6Var));
    }

    @yfb
    public static final d5c doOnPreDraw(@yfb View view, @yfb qy6<? super View, bth> qy6Var) {
        return d5c.add(view, new RunnableC11958g(qy6Var, view));
    }

    @yfb
    public static final Bitmap drawToBitmap(@yfb View view, @yfb Bitmap.Config config) {
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    @yfb
    public static final vye<View> getAllViews(@yfb View view) {
        return bze.sequence(new C11952a(view, null));
    }

    @yfb
    public static final vye<ViewParent> getAncestors(@yfb View view) {
        return ize.generateSequence(view.getParent(), C11953b.f77488a);
    }

    public static final int getMarginBottom(@yfb View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginEnd(@yfb View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    public static final int getMarginLeft(@yfb View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginRight(@yfb View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginStart(@yfb View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    public static final int getMarginTop(@yfb View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean isGone(@yfb View view) {
        return view.getVisibility() == 8;
    }

    public static final boolean isInvisible(@yfb View view) {
        return view.getVisibility() == 4;
    }

    public static final boolean isVisible(@yfb View view) {
        return view.getVisibility() == 0;
    }

    @yfb
    public static final Runnable postDelayed(@yfb View view, long j, @yfb ny6<bth> ny6Var) {
        RunnableC11959h runnableC11959h = new RunnableC11959h(ny6Var);
        view.postDelayed(runnableC11959h, j);
        return runnableC11959h;
    }

    @yfb
    public static final Runnable postOnAnimationDelayed(@yfb View view, long j, @yfb final ny6<bth> ny6Var) {
        Runnable runnable = new Runnable() { // from class: q9i
            @Override // java.lang.Runnable
            public final void run() {
                ny6Var.invoke();
            }
        };
        view.postOnAnimationDelayed(runnable, j);
        return runnable;
    }

    public static final void setGone(@yfb View view, boolean z) {
        view.setVisibility(z ? 8 : 0);
    }

    public static final void setInvisible(@yfb View view, boolean z) {
        view.setVisibility(z ? 4 : 0);
    }

    public static final void setPadding(@yfb View view, @fkd int i) {
        view.setPadding(i, i, i, i);
    }

    public static final void setVisible(@yfb View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public static final void updateLayoutParams(@yfb View view, @yfb qy6<? super ViewGroup.LayoutParams, bth> qy6Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        qy6Var.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    @xn8(name = "updateLayoutParamsTyped")
    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View view, qy6<? super T, bth> qy6Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        md8.reifiedOperationMarker(1, "T");
        qy6Var.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void updatePadding(@yfb View view, @fkd int i, @fkd int i2, @fkd int i3, @fkd int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        view.setPadding(i, i2, i3, i4);
    }

    public static final void updatePaddingRelative(@yfb View view, @fkd int i, @fkd int i2, @fkd int i3, @fkd int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i, i2, i3, i4);
    }
}
