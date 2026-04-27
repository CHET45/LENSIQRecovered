package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.SystemClock;
import android.util.Log;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.blankj.utilcode.util.C2481n;
import p000.k8f;

/* JADX INFO: loaded from: classes3.dex */
public class q22 {

    /* JADX INFO: renamed from: a */
    public static final int f72999a = -1;

    /* JADX INFO: renamed from: b */
    public static final float f73000b = -0.06f;

    /* JADX INFO: renamed from: c */
    public static final int f73001c = -2;

    /* JADX INFO: renamed from: d */
    public static final int f73002d = -3;

    /* JADX INFO: renamed from: e */
    public static final float f73003e = 0.8f;

    /* JADX INFO: renamed from: f */
    public static final int f73004f = 4;

    /* JADX INFO: renamed from: g */
    public static final float f73005g = 0.9f;

    /* JADX INFO: renamed from: h */
    public static final int f73006h = 5;

    /* JADX INFO: renamed from: i */
    public static final float f73007i = 0.9f;

    /* JADX INFO: renamed from: j */
    public static final long f73008j = 1000;

    /* JADX INFO: renamed from: k */
    public static final long f73009k = 2000;

    /* JADX INFO: renamed from: l */
    public static long f73010l;

    /* JADX INFO: renamed from: m */
    public static int f73011m;

    /* JADX INFO: renamed from: q22$a */
    public static class C11274a extends AbstractViewOnClickListenerC11278e {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ View.OnClickListener f73012e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11274a(boolean z, long j, View.OnClickListener onClickListener) {
            super(z, j);
            this.f73012e = onClickListener;
        }

        @Override // p000.q22.AbstractViewOnClickListenerC11278e
        public void onDebouncingClick(View view) {
            this.f73012e.onClick(view);
        }
    }

    /* JADX INFO: renamed from: q22$b */
    public static class RunnableC11275b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f73013a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f73014b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f73015c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f73016d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f73017e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ View f73018f;

        public RunnableC11275b(View view, int i, int i2, int i3, int i4, View view2) {
            this.f73013a = view;
            this.f73014b = i;
            this.f73015c = i2;
            this.f73016d = i3;
            this.f73017e = i4;
            this.f73018f = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = new Rect();
            this.f73013a.getHitRect(rect);
            rect.top -= this.f73014b;
            rect.bottom += this.f73015c;
            rect.left -= this.f73016d;
            rect.right += this.f73017e;
            this.f73018f.setTouchDelegate(new TouchDelegate(rect, this.f73013a));
        }
    }

    /* JADX INFO: renamed from: q22$c */
    public interface InterfaceC11276c {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC11276c f73019a = new a();

        /* JADX INFO: renamed from: q22$c$a */
        public static class a implements InterfaceC11276c {
            @Override // p000.q22.InterfaceC11276c
            public void dismiss() {
                C2481n.m4281Z0();
            }

            @Override // p000.q22.InterfaceC11276c
            public void show(CharSequence charSequence, long j) {
                C2481n.m4284a1(charSequence);
            }
        }

        void dismiss();

        void show(CharSequence charSequence, long j);
    }

    /* JADX INFO: renamed from: q22$d */
    public static class C11277d extends k8f.C8234b {

        /* JADX INFO: renamed from: b */
        public BitmapDrawable f73020b;

        /* JADX INFO: renamed from: c */
        public Paint f73021c;

        public C11277d(Drawable drawable) {
            super(drawable);
            this.f73020b = null;
            this.f73021c = null;
            if (drawable instanceof ColorDrawable) {
                Paint paint = new Paint(5);
                this.f73021c = paint;
                paint.setColor(((ColorDrawable) drawable).getColor());
            }
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f73020b == null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                if (this.f73021c != null) {
                    canvas2.drawRect(getBounds(), this.f73021c);
                } else {
                    super.draw(canvas2);
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(Resources.getSystem(), bitmapCreateBitmap);
                this.f73020b = bitmapDrawable;
                bitmapDrawable.setBounds(getBounds());
            }
            this.f73020b.draw(canvas);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            super.setAlpha(i);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            super.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: renamed from: q22$e */
    public static abstract class AbstractViewOnClickListenerC11278e implements View.OnClickListener {

        /* JADX INFO: renamed from: c */
        public static boolean f73022c = true;

        /* JADX INFO: renamed from: d */
        public static final Runnable f73023d = new a();

        /* JADX INFO: renamed from: a */
        public long f73024a;

        /* JADX INFO: renamed from: b */
        public boolean f73025b;

        /* JADX INFO: renamed from: q22$e$a */
        public static class a implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                boolean unused = AbstractViewOnClickListenerC11278e.f73022c = true;
            }
        }

        public AbstractViewOnClickListenerC11278e() {
            this(true, 1000L);
        }

        private static boolean isValid(@efb View view, long j) {
            if (view != null) {
                return C2481n.m4237D0(view, j);
            }
            throw new NullPointerException("Argument 'view' of type View (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!this.f73025b) {
                if (isValid(view, this.f73024a)) {
                    onDebouncingClick(view);
                }
            } else if (f73022c) {
                f73022c = false;
                view.postDelayed(f73023d, this.f73024a);
                onDebouncingClick(view);
            }
        }

        public abstract void onDebouncingClick(View view);

        public AbstractViewOnClickListenerC11278e(boolean z) {
            this(z, 1000L);
        }

        public AbstractViewOnClickListenerC11278e(long j) {
            this(true, j);
        }

        public AbstractViewOnClickListenerC11278e(boolean z, long j) {
            this.f73025b = z;
            this.f73024a = j;
        }
    }

    /* JADX INFO: renamed from: q22$f */
    public static abstract class AbstractViewOnClickListenerC11279f implements View.OnClickListener {

        /* JADX INFO: renamed from: e */
        public static final long f73026e = 666;

        /* JADX INFO: renamed from: a */
        public final int f73027a;

        /* JADX INFO: renamed from: b */
        public final long f73028b;

        /* JADX INFO: renamed from: c */
        public long f73029c;

        /* JADX INFO: renamed from: d */
        public int f73030d;

        public AbstractViewOnClickListenerC11279f(int i) {
            this(i, 666L);
        }

        public abstract void onBeforeTriggerClick(View view, int i);

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f73027a <= 1) {
                onTriggerClick(view);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f73029c < this.f73028b) {
                int i = this.f73030d + 1;
                this.f73030d = i;
                int i2 = this.f73027a;
                if (i == i2) {
                    onTriggerClick(view);
                } else if (i < i2) {
                    onBeforeTriggerClick(view, i);
                } else {
                    this.f73030d = 1;
                    onBeforeTriggerClick(view, 1);
                }
            } else {
                this.f73030d = 1;
                onBeforeTriggerClick(view, 1);
            }
            this.f73029c = jCurrentTimeMillis;
        }

        public abstract void onTriggerClick(View view);

        public AbstractViewOnClickListenerC11279f(int i, long j) {
            this.f73027a = i;
            this.f73028b = j;
        }
    }

    /* JADX INFO: renamed from: q22$g */
    public static class ViewOnTouchListenerC11280g implements View.OnTouchListener {

        /* JADX INFO: renamed from: q22$g$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public static final ViewOnTouchListenerC11280g f73031a = new ViewOnTouchListenerC11280g(null);

            private a() {
            }
        }

        public /* synthetic */ ViewOnTouchListenerC11280g(C11274a c11274a) {
            this();
        }

        public static ViewOnTouchListenerC11280g getInstance() {
            return a.f73031a;
        }

        private void processAlpha(View view, boolean z) {
            Object tag = view.getTag(z ? -2 : -3);
            if (tag instanceof Float) {
                view.setAlpha(((Float) tag).floatValue());
            }
        }

        private void processScale(View view, boolean z) {
            Object tag = view.getTag(-1);
            if (tag instanceof Float) {
                float fFloatValue = z ? 1.0f + ((Float) tag).floatValue() : 1.0f;
                view.animate().scaleX(fFloatValue).scaleY(fFloatValue).setDuration(200L).start();
            }
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                processScale(view, true);
                processAlpha(view, true);
            } else if (action == 1 || action == 3) {
                processScale(view, false);
                processAlpha(view, false);
            }
            return false;
        }

        private ViewOnTouchListenerC11280g() {
        }
    }

    private q22() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static void applyDebouncing(View[] viewArr, boolean z, @h78(from = 0) long j, View.OnClickListener onClickListener) {
        if (viewArr == null || viewArr.length == 0 || onClickListener == null) {
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setOnClickListener(new C11274a(z, j, onClickListener));
            }
        }
    }

    public static void applyGlobalDebouncing(View view, View.OnClickListener onClickListener) {
        applyGlobalDebouncing(new View[]{view}, onClickListener);
    }

    public static void applyPressedBgAlpha(View view) {
        applyPressedBgAlpha(view, 0.9f);
    }

    public static void applyPressedBgDark(View view) {
        applyPressedBgDark(view, 0.9f);
    }

    private static void applyPressedBgStyle(View view, int i, float f) {
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        int i2 = -i;
        Object tag = view.getTag(i2);
        if (tag instanceof Drawable) {
            o8i.setBackground(view, (Drawable) tag);
            return;
        }
        Drawable drawableCreateStyleDrawable = createStyleDrawable(background, i, f);
        o8i.setBackground(view, drawableCreateStyleDrawable);
        view.setTag(i2, drawableCreateStyleDrawable);
    }

    public static void applyPressedViewAlpha(View... viewArr) {
        applyPressedViewAlpha(viewArr, (float[]) null);
    }

    public static void applyPressedViewScale(View... viewArr) {
        applyPressedViewScale(viewArr, (float[]) null);
    }

    public static void applySingleDebouncing(View view, View.OnClickListener onClickListener) {
        applySingleDebouncing(new View[]{view}, onClickListener);
    }

    public static void back2HomeFriendly(CharSequence charSequence) {
        back2HomeFriendly(charSequence, 2000L, InterfaceC11276c.f73019a);
    }

    private static Drawable createAlphaDrawable(Drawable drawable, float f) {
        C11277d c11277d = new C11277d(drawable);
        c11277d.setAlpha((int) (f * 255.0f));
        return c11277d;
    }

    private static Drawable createDarkDrawable(Drawable drawable, float f) {
        C11277d c11277d = new C11277d(drawable);
        c11277d.setColorFilter(getDarkColorFilter(f));
        return c11277d;
    }

    private static Drawable createStyleDrawable(Drawable drawable, int i, float f) {
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        if (drawable.getConstantState() == null) {
            return drawable;
        }
        Drawable drawableMutate = drawable.getConstantState().newDrawable().mutate();
        if (i == 4) {
            drawableMutate = createAlphaDrawable(drawableMutate, f);
        } else if (i == 5) {
            drawableMutate = createDarkDrawable(drawableMutate, f);
        }
        Drawable drawableCreateAlphaDrawable = createAlphaDrawable(drawable.getConstantState().newDrawable().mutate(), 0.5f);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, drawableMutate);
        stateListDrawable.addState(new int[]{-16842910}, drawableCreateAlphaDrawable);
        stateListDrawable.addState(StateSet.WILD_CARD, drawable);
        return stateListDrawable;
    }

    public static void expandClickArea(@efb View view, int i) {
        if (view == null) {
            throw new NullPointerException("Argument 'view' of type View (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        expandClickArea(view, i, i, i, i);
    }

    private static ColorMatrixColorFilter getDarkColorFilter(float f) {
        return new ColorMatrixColorFilter(new ColorMatrix(new float[]{f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f}));
    }

    public static void applyGlobalDebouncing(View view, @h78(from = 0) long j, View.OnClickListener onClickListener) {
        applyGlobalDebouncing(new View[]{view}, j, onClickListener);
    }

    public static void applyPressedBgAlpha(View view, float f) {
        applyPressedBgStyle(view, 4, f);
    }

    public static void applyPressedBgDark(View view, float f) {
        applyPressedBgStyle(view, 5, f);
    }

    public static void applyPressedViewAlpha(View[] viewArr, float[] fArr) {
        if (viewArr == null || viewArr.length == 0) {
            return;
        }
        for (int i = 0; i < viewArr.length; i++) {
            if (fArr == null || i >= fArr.length) {
                applyPressedViewAlpha(viewArr[i], 0.8f);
            } else {
                applyPressedViewAlpha(viewArr[i], fArr[i]);
            }
        }
    }

    public static void applyPressedViewScale(View[] viewArr, float[] fArr) {
        if (viewArr == null || viewArr.length == 0) {
            return;
        }
        for (int i = 0; i < viewArr.length; i++) {
            if (fArr == null || i >= fArr.length) {
                applyPressedViewScale(viewArr[i], -0.06f);
            } else {
                applyPressedViewScale(viewArr[i], fArr[i]);
            }
        }
    }

    public static void applySingleDebouncing(View view, @h78(from = 0) long j, View.OnClickListener onClickListener) {
        applySingleDebouncing(new View[]{view}, j, onClickListener);
    }

    public static void back2HomeFriendly(@efb CharSequence charSequence, long j, @efb InterfaceC11276c interfaceC11276c) {
        if (charSequence == null) {
            throw new NullPointerException("Argument 'tip' of type CharSequence (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (interfaceC11276c == null) {
            throw new NullPointerException("Argument 'listener' of type Back2HomeFriendlyListener (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (Math.abs(jElapsedRealtime - f73010l) >= j) {
            f73011m = 1;
            interfaceC11276c.show(charSequence, j);
            f73010l = jElapsedRealtime;
            return;
        }
        int i = f73011m + 1;
        f73011m = i;
        if (i == 2) {
            C2481n.m4275W0();
            interfaceC11276c.dismiss();
            f73010l = 0L;
        }
    }

    public static void applyGlobalDebouncing(View[] viewArr, View.OnClickListener onClickListener) {
        applyGlobalDebouncing(viewArr, 1000L, onClickListener);
    }

    public static void applySingleDebouncing(View[] viewArr, View.OnClickListener onClickListener) {
        applySingleDebouncing(viewArr, 1000L, onClickListener);
    }

    public static void expandClickArea(@efb View view, int i, int i2, int i3, int i4) {
        if (view != null) {
            View view2 = (View) view.getParent();
            if (view2 == null) {
                Log.e("ClickUtils", "expandClickArea must have parent view.");
                return;
            } else {
                view2.post(new RunnableC11275b(view, i, i4, i2, i3, view2));
                return;
            }
        }
        throw new NullPointerException("Argument 'view' of type View (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void applyGlobalDebouncing(View[] viewArr, @h78(from = 0) long j, View.OnClickListener onClickListener) {
        applyDebouncing(viewArr, true, j, onClickListener);
    }

    public static void applySingleDebouncing(View[] viewArr, @h78(from = 0) long j, View.OnClickListener onClickListener) {
        applyDebouncing(viewArr, false, j, onClickListener);
    }

    public static void applyPressedViewAlpha(View view, float f) {
        if (view == null) {
            return;
        }
        view.setTag(-2, Float.valueOf(f));
        view.setTag(-3, Float.valueOf(view.getAlpha()));
        view.setClickable(true);
        view.setOnTouchListener(ViewOnTouchListenerC11280g.getInstance());
    }

    public static void applyPressedViewScale(View view, float f) {
        if (view == null) {
            return;
        }
        view.setTag(-1, Float.valueOf(f));
        view.setClickable(true);
        view.setOnTouchListener(ViewOnTouchListenerC11280g.getInstance());
    }
}
