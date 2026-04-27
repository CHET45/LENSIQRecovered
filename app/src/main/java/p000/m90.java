package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public class m90 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final String f60220a;

    /* JADX INFO: renamed from: b */
    public final n90 f60221b;

    /* JADX INFO: renamed from: c */
    public final vv7 f60222c;

    /* JADX INFO: renamed from: d */
    public final xv7 f60223d;

    /* JADX INFO: renamed from: e */
    public final Drawable f60224e;

    /* JADX INFO: renamed from: f */
    public Drawable f60225f;

    /* JADX INFO: renamed from: g */
    public Drawable.Callback f60226g;

    /* JADX INFO: renamed from: h */
    public int f60227h;

    /* JADX INFO: renamed from: i */
    public float f60228i;

    /* JADX INFO: renamed from: j */
    public boolean f60229j;

    /* JADX INFO: renamed from: k */
    public boolean f60230k = false;

    /* JADX INFO: renamed from: m90$a */
    public class C9220a implements Drawable.Callback {

        /* JADX INFO: renamed from: a */
        public final Drawable.Callback f60231a;

        public C9220a(@efb Drawable.Callback callback) {
            this.f60231a = callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@efb Drawable drawable) {
            this.f60231a.invalidateDrawable(m90.this);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@efb Drawable drawable, @efb Runnable runnable, long j) {
            this.f60231a.scheduleDrawable(m90.this, runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@efb Drawable drawable, @efb Runnable runnable) {
            this.f60231a.unscheduleDrawable(m90.this, runnable);
        }
    }

    public m90(@efb String str, @efb n90 n90Var, @efb xv7 xv7Var, @hib vv7 vv7Var) {
        this.f60220a = str;
        this.f60221b = n90Var;
        this.f60223d = xv7Var;
        this.f60222c = vv7Var;
        Drawable drawablePlaceholder = n90Var.placeholder(this);
        this.f60224e = drawablePlaceholder;
        if (drawablePlaceholder != null) {
            m17130a(drawablePlaceholder);
        }
    }

    private void initBounds() {
        if (this.f60227h == 0) {
            this.f60229j = true;
            setBounds(noDimensionsBounds(this.f60225f));
            return;
        }
        this.f60229j = false;
        Rect rectResolveBounds = resolveBounds();
        this.f60225f.setBounds(rectResolveBounds);
        this.f60225f.setCallback(this.f60226g);
        setBounds(rectResolveBounds);
        invalidateSelf();
    }

    @efb
    private static Rect noDimensionsBounds(@hib Drawable drawable) {
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            if (!bounds.isEmpty()) {
                return bounds;
            }
            Rect rectIntrinsicBounds = sq4.intrinsicBounds(drawable);
            if (!rectIntrinsicBounds.isEmpty()) {
                return rectIntrinsicBounds;
            }
        }
        return new Rect(0, 0, 1, 1);
    }

    @efb
    private Rect resolveBounds() {
        return this.f60223d.resolveImageSize(this);
    }

    /* JADX INFO: renamed from: a */
    public void m17130a(@efb Drawable drawable) {
        Drawable drawable2 = this.f60225f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        Rect bounds = drawable.getBounds();
        if (!bounds.isEmpty()) {
            this.f60225f = drawable;
            drawable.setCallback(this.f60226g);
            setBounds(bounds);
            this.f60229j = false;
            return;
        }
        Rect rectIntrinsicBounds = sq4.intrinsicBounds(drawable);
        if (rectIntrinsicBounds.isEmpty()) {
            drawable.setBounds(0, 0, 1, 1);
        } else {
            drawable.setBounds(rectIntrinsicBounds);
        }
        setBounds(drawable.getBounds());
        setResult(drawable);
    }

    public void clearResult() {
        Drawable drawable = this.f60225f;
        if (drawable != null) {
            drawable.setCallback(null);
            this.f60225f = null;
            setBounds(0, 0, 0, 0);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@efb Canvas canvas) {
        if (hasResult()) {
            this.f60225f.draw(canvas);
        }
    }

    @efb
    public String getDestination() {
        return this.f60220a;
    }

    @hib
    public vv7 getImageSize() {
        return this.f60222c;
    }

    @efb
    public xv7 getImageSizeResolver() {
        return this.f60223d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (hasResult()) {
            return this.f60225f.getIntrinsicHeight();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (hasResult()) {
            return this.f60225f.getIntrinsicWidth();
        }
        return 1;
    }

    public float getLastKnowTextSize() {
        return this.f60228i;
    }

    public int getLastKnownCanvasWidth() {
        return this.f60227h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (hasResult()) {
            return this.f60225f.getOpacity();
        }
        return -2;
    }

    public Drawable getResult() {
        return this.f60225f;
    }

    public boolean hasKnownDimensions() {
        return this.f60227h > 0;
    }

    public boolean hasResult() {
        return this.f60225f != null;
    }

    public void initWithKnownDimensions(int i, float f) {
        this.f60227h = i;
        this.f60228i = f;
        if (this.f60229j) {
            initBounds();
        }
    }

    public boolean isAttached() {
        return getCallback() != null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@h78(from = 0, m12174to = coe.f17274d) int i) {
    }

    public void setCallback2(@hib Drawable.Callback callback) {
        this.f60226g = callback == null ? null : new C9220a(callback);
        super.setCallback(callback);
        if (this.f60226g == null) {
            Drawable drawable = this.f60225f;
            if (drawable != null) {
                drawable.setCallback(null);
                Object obj = this.f60225f;
                if (obj instanceof Animatable) {
                    Animatable animatable = (Animatable) obj;
                    boolean zIsRunning = animatable.isRunning();
                    this.f60230k = zIsRunning;
                    if (zIsRunning) {
                        animatable.stop();
                    }
                }
            }
            this.f60221b.cancel(this);
            return;
        }
        Drawable drawable2 = this.f60225f;
        if (drawable2 != null && drawable2.getCallback() == null) {
            this.f60225f.setCallback(this.f60226g);
        }
        Drawable drawable3 = this.f60225f;
        boolean z = drawable3 == null || drawable3 == this.f60224e;
        if (drawable3 != null) {
            drawable3.setCallback(this.f60226g);
            Object obj2 = this.f60225f;
            if ((obj2 instanceof Animatable) && this.f60230k) {
                ((Animatable) obj2).start();
            }
        }
        if (z) {
            this.f60221b.load(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@hib ColorFilter colorFilter) {
    }

    public void setResult(@efb Drawable drawable) {
        this.f60230k = false;
        Drawable drawable2 = this.f60225f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f60225f = drawable;
        initBounds();
    }

    @efb
    public String toString() {
        return "AsyncDrawable{destination='" + this.f60220a + "', imageSize=" + this.f60222c + ", result=" + this.f60225f + ", canvasWidth=" + this.f60227h + ", textSize=" + this.f60228i + ", waitingForDimensions=" + this.f60229j + '}';
    }
}
