package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public class go9 extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: r2 */
    public static final int f40606r2 = 1;

    /* JADX INFO: renamed from: s2 */
    public static final int f40607s2 = 2;

    /* JADX INFO: renamed from: t2 */
    public static final int f40608t2 = -1;

    /* JADX INFO: renamed from: C */
    public final ValueAnimator.AnimatorUpdateListener f40609C;

    /* JADX INFO: renamed from: F */
    @hib
    public qs7 f40610F;

    /* JADX INFO: renamed from: H */
    @hib
    public String f40611H;

    /* JADX INFO: renamed from: L */
    @hib
    public ps7 f40612L;

    /* JADX INFO: renamed from: M */
    @hib
    public ao6 f40613M;

    /* JADX INFO: renamed from: M1 */
    @hib
    public jn2 f40614M1;

    /* JADX INFO: renamed from: N */
    @hib
    public zn6 f40615N;

    /* JADX INFO: renamed from: Q */
    @hib
    public tqg f40616Q;

    /* JADX INFO: renamed from: V1 */
    public int f40617V1;

    /* JADX INFO: renamed from: X */
    public boolean f40618X;

    /* JADX INFO: renamed from: Y */
    public boolean f40619Y;

    /* JADX INFO: renamed from: Z */
    public boolean f40620Z;

    /* JADX INFO: renamed from: Z1 */
    public boolean f40621Z1;

    /* JADX INFO: renamed from: a */
    public bn9 f40622a;

    /* JADX INFO: renamed from: a2 */
    public boolean f40623a2;

    /* JADX INFO: renamed from: b */
    public final ap9 f40624b;

    /* JADX INFO: renamed from: b2 */
    public boolean f40625b2;

    /* JADX INFO: renamed from: c */
    public boolean f40626c;

    /* JADX INFO: renamed from: c2 */
    public xzd f40627c2;

    /* JADX INFO: renamed from: d */
    public boolean f40628d;

    /* JADX INFO: renamed from: d2 */
    public boolean f40629d2;

    /* JADX INFO: renamed from: e */
    public boolean f40630e;

    /* JADX INFO: renamed from: e2 */
    public final Matrix f40631e2;

    /* JADX INFO: renamed from: f */
    public EnumC6445d f40632f;

    /* JADX INFO: renamed from: f2 */
    public Bitmap f40633f2;

    /* JADX INFO: renamed from: g2 */
    public Canvas f40634g2;

    /* JADX INFO: renamed from: h2 */
    public Rect f40635h2;

    /* JADX INFO: renamed from: i2 */
    public RectF f40636i2;

    /* JADX INFO: renamed from: j2 */
    public Paint f40637j2;

    /* JADX INFO: renamed from: k2 */
    public Rect f40638k2;

    /* JADX INFO: renamed from: l2 */
    public Rect f40639l2;

    /* JADX INFO: renamed from: m */
    public final ArrayList<InterfaceC6444c> f40640m;

    /* JADX INFO: renamed from: m2 */
    public RectF f40641m2;

    /* JADX INFO: renamed from: n2 */
    public RectF f40642n2;

    /* JADX INFO: renamed from: o2 */
    public Matrix f40643o2;

    /* JADX INFO: renamed from: p2 */
    public Matrix f40644p2;

    /* JADX INFO: renamed from: q2 */
    public boolean f40645q2;

    /* JADX INFO: renamed from: go9$a */
    public class C6442a implements ValueAnimator.AnimatorUpdateListener {
        public C6442a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (go9.this.f40614M1 != null) {
                go9.this.f40614M1.setProgress(go9.this.f40624b.getAnimatedValueAbsolute());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: go9$b */
    public class C6443b<T> extends bp9<T> {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ pif f40647d;

        public C6443b(pif pifVar) {
            this.f40647d = pifVar;
        }

        @Override // p000.bp9
        public T getValue(io9<T> io9Var) {
            return (T) this.f40647d.getValue(io9Var);
        }
    }

    /* JADX INFO: renamed from: go9$c */
    public interface InterfaceC6444c {
        void run(bn9 bn9Var);
    }

    /* JADX INFO: renamed from: go9$d */
    public enum EnumC6445d {
        NONE,
        PLAY,
        RESUME
    }

    /* JADX INFO: renamed from: go9$e */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6446e {
    }

    public go9() {
        ap9 ap9Var = new ap9();
        this.f40624b = ap9Var;
        this.f40626c = true;
        this.f40628d = false;
        this.f40630e = false;
        this.f40632f = EnumC6445d.NONE;
        this.f40640m = new ArrayList<>();
        C6442a c6442a = new C6442a();
        this.f40609C = c6442a;
        this.f40619Y = false;
        this.f40620Z = true;
        this.f40617V1 = 255;
        this.f40627c2 = xzd.AUTOMATIC;
        this.f40629d2 = false;
        this.f40631e2 = new Matrix();
        this.f40645q2 = false;
        ap9Var.addUpdateListener(c6442a);
    }

    private boolean animationsEnabled() {
        return this.f40626c || this.f40628d;
    }

    private void buildCompositionLayer() {
        bn9 bn9Var = this.f40622a;
        if (bn9Var == null) {
            return;
        }
        jn2 jn2Var = new jn2(this, yu8.parse(bn9Var), bn9Var.getLayers(), bn9Var);
        this.f40614M1 = jn2Var;
        if (this.f40623a2) {
            jn2Var.setOutlineMasksAndMattes(true);
        }
        this.f40614M1.setClipToCompositionBounds(this.f40620Z);
    }

    private void computeRenderMode() {
        bn9 bn9Var = this.f40622a;
        if (bn9Var == null) {
            return;
        }
        this.f40629d2 = this.f40627c2.useSoftwareRendering(Build.VERSION.SDK_INT, bn9Var.hasDashPattern(), bn9Var.getMaskAndMatteCount());
    }

    private void convertRect(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void drawDirectlyToCanvas(Canvas canvas) {
        jn2 jn2Var = this.f40614M1;
        bn9 bn9Var = this.f40622a;
        if (jn2Var == null || bn9Var == null) {
            return;
        }
        this.f40631e2.reset();
        if (!getBounds().isEmpty()) {
            this.f40631e2.preScale(r2.width() / bn9Var.getBounds().width(), r2.height() / bn9Var.getBounds().height());
        }
        jn2Var.draw(canvas, this.f40631e2, this.f40617V1);
    }

    private void ensureSoftwareRenderingBitmap(int i, int i2) {
        Bitmap bitmap = this.f40633f2;
        if (bitmap == null || bitmap.getWidth() < i || this.f40633f2.getHeight() < i2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.f40633f2 = bitmapCreateBitmap;
            this.f40634g2.setBitmap(bitmapCreateBitmap);
            this.f40645q2 = true;
            return;
        }
        if (this.f40633f2.getWidth() > i || this.f40633f2.getHeight() > i2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f40633f2, 0, 0, i, i2);
            this.f40633f2 = bitmapCreateBitmap2;
            this.f40634g2.setBitmap(bitmapCreateBitmap2);
            this.f40645q2 = true;
        }
    }

    private void ensureSoftwareRenderingObjectsInitialized() {
        if (this.f40634g2 != null) {
            return;
        }
        this.f40634g2 = new Canvas();
        this.f40642n2 = new RectF();
        this.f40643o2 = new Matrix();
        this.f40644p2 = new Matrix();
        this.f40635h2 = new Rect();
        this.f40636i2 = new RectF();
        this.f40637j2 = new it8();
        this.f40638k2 = new Rect();
        this.f40639l2 = new Rect();
        this.f40641m2 = new RectF();
    }

    @hib
    private Context getContext() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private ao6 getFontAssetManager() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f40613M == null) {
            this.f40613M = new ao6(getCallback(), this.f40615N);
        }
        return this.f40613M;
    }

    private qs7 getImageAssetManager() {
        if (getCallback() == null) {
            return null;
        }
        qs7 qs7Var = this.f40610F;
        if (qs7Var != null && !qs7Var.hasSameContext(getContext())) {
            this.f40610F = null;
        }
        if (this.f40610F == null) {
            this.f40610F = new qs7(getCallback(), this.f40611H, this.f40612L, this.f40622a.getImages());
        }
        return this.f40610F;
    }

    private boolean ignoreCanvasClipBounds() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (((View) callback).getParent() instanceof ViewGroup) {
            return !((ViewGroup) r0).getClipChildren();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addValueCallback$14(fr8 fr8Var, Object obj, bp9 bp9Var, bn9 bn9Var) {
        addValueCallback(fr8Var, obj, (bp9<Object>) bp9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAnimation$0(bn9 bn9Var) {
        playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resumeAnimation$1(bn9 bn9Var) {
        resumeAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFrame$12(int i, bn9 bn9Var) {
        setFrame(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaxFrame$4(int i, bn9 bn9Var) {
        setMaxFrame(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaxFrame$7(String str, bn9 bn9Var) {
        setMaxFrame(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaxProgress$5(float f, bn9 bn9Var) {
        setMaxProgress(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinAndMaxFrame$10(int i, int i2, bn9 bn9Var) {
        setMinAndMaxFrame(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinAndMaxFrame$8(String str, bn9 bn9Var) {
        setMinAndMaxFrame(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinAndMaxFrame$9(String str, String str2, boolean z, bn9 bn9Var) {
        setMinAndMaxFrame(str, str2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinAndMaxProgress$11(float f, float f2, bn9 bn9Var) {
        setMinAndMaxProgress(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinFrame$2(int i, bn9 bn9Var) {
        setMinFrame(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinFrame$6(String str, bn9 bn9Var) {
        setMinFrame(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinProgress$3(float f, bn9 bn9Var) {
        setMinProgress(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setProgress$13(float f, bn9 bn9Var) {
        setProgress(f);
    }

    private void renderAndDrawAsBitmap(Canvas canvas, jn2 jn2Var) {
        if (this.f40622a == null || jn2Var == null) {
            return;
        }
        ensureSoftwareRenderingObjectsInitialized();
        canvas.getMatrix(this.f40643o2);
        canvas.getClipBounds(this.f40635h2);
        convertRect(this.f40635h2, this.f40636i2);
        this.f40643o2.mapRect(this.f40636i2);
        convertRect(this.f40636i2, this.f40635h2);
        if (this.f40620Z) {
            this.f40642n2.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            jn2Var.getBounds(this.f40642n2, null, false);
        }
        this.f40643o2.mapRect(this.f40642n2);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        scaleRect(this.f40642n2, fWidth, fHeight);
        if (!ignoreCanvasClipBounds()) {
            RectF rectF = this.f40642n2;
            Rect rect = this.f40635h2;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.f40642n2.width());
        int iCeil2 = (int) Math.ceil(this.f40642n2.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        ensureSoftwareRenderingBitmap(iCeil, iCeil2);
        if (this.f40645q2) {
            this.f40631e2.set(this.f40643o2);
            this.f40631e2.preScale(fWidth, fHeight);
            Matrix matrix = this.f40631e2;
            RectF rectF2 = this.f40642n2;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f40633f2.eraseColor(0);
            jn2Var.draw(this.f40634g2, this.f40631e2, this.f40617V1);
            this.f40643o2.invert(this.f40644p2);
            this.f40644p2.mapRect(this.f40641m2, this.f40642n2);
            convertRect(this.f40641m2, this.f40639l2);
        }
        this.f40638k2.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f40633f2, this.f40638k2, this.f40639l2, this.f40637j2);
    }

    private void scaleRect(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f40624b.addListener(animatorListener);
    }

    @c5e(api = 19)
    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f40624b.addPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f40624b.addUpdateListener(animatorUpdateListener);
    }

    public <T> void addValueCallback(final fr8 fr8Var, final T t, @hib final bp9<T> bp9Var) {
        jn2 jn2Var = this.f40614M1;
        if (jn2Var == null) {
            this.f40640m.add(new InterfaceC6444c() { // from class: vn9
                @Override // p000.go9.InterfaceC6444c
                public final void run(bn9 bn9Var) {
                    this.f91781a.lambda$addValueCallback$14(fr8Var, t, bp9Var, bn9Var);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (fr8Var == fr8.f37561c) {
            jn2Var.addValueCallback(t, bp9Var);
        } else if (fr8Var.getResolvedElement() != null) {
            fr8Var.getResolvedElement().addValueCallback(t, bp9Var);
        } else {
            List<fr8> listResolveKeyPath = resolveKeyPath(fr8Var);
            for (int i = 0; i < listResolveKeyPath.size(); i++) {
                listResolveKeyPath.get(i).getResolvedElement().addValueCallback(t, bp9Var);
            }
            zIsEmpty = true ^ listResolveKeyPath.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t == to9.f85473E) {
                setProgress(getProgress());
            }
        }
    }

    public void cancelAnimation() {
        this.f40640m.clear();
        this.f40624b.cancel();
        if (isVisible()) {
            return;
        }
        this.f40632f = EnumC6445d.NONE;
    }

    public void clearComposition() {
        if (this.f40624b.isRunning()) {
            this.f40624b.cancel();
            if (!isVisible()) {
                this.f40632f = EnumC6445d.NONE;
            }
        }
        this.f40622a = null;
        this.f40614M1 = null;
        this.f40610F = null;
        this.f40624b.clearComposition();
        invalidateSelf();
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@efb Canvas canvas) {
        bt8.beginSection("Drawable#draw");
        if (this.f40630e) {
            try {
                if (this.f40629d2) {
                    renderAndDrawAsBitmap(canvas, this.f40614M1);
                } else {
                    drawDirectlyToCanvas(canvas);
                }
            } catch (Throwable th) {
                dj9.error("Lottie crashed in draw!", th);
            }
        } else if (this.f40629d2) {
            renderAndDrawAsBitmap(canvas, this.f40614M1);
        } else {
            drawDirectlyToCanvas(canvas);
        }
        this.f40645q2 = false;
        bt8.endSection("Drawable#draw");
    }

    public boolean enableMergePathsForKitKatAndAbove() {
        return this.f40618X;
    }

    @ir9
    public void endAnimation() {
        this.f40640m.clear();
        this.f40624b.endAnimation();
        if (isVisible()) {
            return;
        }
        this.f40632f = EnumC6445d.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f40617V1;
    }

    @hib
    public Bitmap getBitmapForId(String str) {
        qs7 imageAssetManager = getImageAssetManager();
        if (imageAssetManager != null) {
            return imageAssetManager.bitmapForId(str);
        }
        return null;
    }

    public boolean getClipToCompositionBounds() {
        return this.f40620Z;
    }

    public bn9 getComposition() {
        return this.f40622a;
    }

    public int getFrame() {
        return (int) this.f40624b.getFrame();
    }

    @hib
    @Deprecated
    public Bitmap getImageAsset(String str) {
        qs7 imageAssetManager = getImageAssetManager();
        if (imageAssetManager != null) {
            return imageAssetManager.bitmapForId(str);
        }
        bn9 bn9Var = this.f40622a;
        jo9 jo9Var = bn9Var == null ? null : bn9Var.getImages().get(str);
        if (jo9Var != null) {
            return jo9Var.getBitmap();
        }
        return null;
    }

    @hib
    public String getImageAssetsFolder() {
        return this.f40611H;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        bn9 bn9Var = this.f40622a;
        if (bn9Var == null) {
            return -1;
        }
        return bn9Var.getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        bn9 bn9Var = this.f40622a;
        if (bn9Var == null) {
            return -1;
        }
        return bn9Var.getBounds().width();
    }

    @hib
    public jo9 getLottieImageAssetForId(String str) {
        bn9 bn9Var = this.f40622a;
        if (bn9Var == null) {
            return null;
        }
        return bn9Var.getImages().get(str);
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f40619Y;
    }

    public float getMaxFrame() {
        return this.f40624b.getMaxFrame();
    }

    public float getMinFrame() {
        return this.f40624b.getMinFrame();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @hib
    public unc getPerformanceTracker() {
        bn9 bn9Var = this.f40622a;
        if (bn9Var != null) {
            return bn9Var.getPerformanceTracker();
        }
        return null;
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    public float getProgress() {
        return this.f40624b.getAnimatedValueAbsolute();
    }

    public xzd getRenderMode() {
        return this.f40629d2 ? xzd.SOFTWARE : xzd.HARDWARE;
    }

    public int getRepeatCount() {
        return this.f40624b.getRepeatCount();
    }

    @igg({"WrongConstant"})
    public int getRepeatMode() {
        return this.f40624b.getRepeatMode();
    }

    public float getSpeed() {
        return this.f40624b.getSpeed();
    }

    @hib
    public tqg getTextDelegate() {
        return this.f40616Q;
    }

    @hib
    public Typeface getTypeface(String str, String str2) {
        ao6 fontAssetManager = getFontAssetManager();
        if (fontAssetManager != null) {
            return fontAssetManager.getTypeface(str, str2);
        }
        return null;
    }

    public boolean hasMasks() {
        jn2 jn2Var = this.f40614M1;
        return jn2Var != null && jn2Var.hasMasks();
    }

    public boolean hasMatte() {
        jn2 jn2Var = this.f40614M1;
        return jn2Var != null && jn2Var.hasMatte();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@efb Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f40645q2) {
            return;
        }
        this.f40645q2 = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isAnimating() {
        ap9 ap9Var = this.f40624b;
        if (ap9Var == null) {
            return false;
        }
        return ap9Var.isRunning();
    }

    public boolean isApplyingOpacityToLayersEnabled() {
        return this.f40625b2;
    }

    public boolean isLooping() {
        return this.f40624b.getRepeatCount() == -1;
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.f40618X;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return isAnimating();
    }

    @Deprecated
    public void loop(boolean z) {
        this.f40624b.setRepeatCount(z ? -1 : 0);
    }

    public void pauseAnimation() {
        this.f40640m.clear();
        this.f40624b.pauseAnimation();
        if (isVisible()) {
            return;
        }
        this.f40632f = EnumC6445d.NONE;
    }

    @ir9
    public void playAnimation() {
        if (this.f40614M1 == null) {
            this.f40640m.add(new InterfaceC6444c() { // from class: bo9
                @Override // p000.go9.InterfaceC6444c
                public final void run(bn9 bn9Var) {
                    this.f14249a.lambda$playAnimation$0(bn9Var);
                }
            });
            return;
        }
        computeRenderMode();
        if (animationsEnabled() || getRepeatCount() == 0) {
            if (isVisible()) {
                this.f40624b.playAnimation();
                this.f40632f = EnumC6445d.NONE;
            } else {
                this.f40632f = EnumC6445d.PLAY;
            }
        }
        if (animationsEnabled()) {
            return;
        }
        setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        this.f40624b.endAnimation();
        if (isVisible()) {
            return;
        }
        this.f40632f = EnumC6445d.NONE;
    }

    /* JADX INFO: renamed from: r */
    public boolean m11814r() {
        if (isVisible()) {
            return this.f40624b.isRunning();
        }
        EnumC6445d enumC6445d = this.f40632f;
        return enumC6445d == EnumC6445d.PLAY || enumC6445d == EnumC6445d.RESUME;
    }

    public void removeAllAnimatorListeners() {
        this.f40624b.removeAllListeners();
    }

    public void removeAllUpdateListeners() {
        this.f40624b.removeAllUpdateListeners();
        this.f40624b.addUpdateListener(this.f40609C);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f40624b.removeListener(animatorListener);
    }

    @c5e(api = 19)
    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f40624b.removePauseListener(animatorPauseListener);
    }

    public void removeAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f40624b.removeUpdateListener(animatorUpdateListener);
    }

    public List<fr8> resolveKeyPath(fr8 fr8Var) {
        if (this.f40614M1 == null) {
            dj9.warning("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f40614M1.resolveKeyPath(fr8Var, 0, arrayList, new fr8(new String[0]));
        return arrayList;
    }

    @ir9
    public void resumeAnimation() {
        if (this.f40614M1 == null) {
            this.f40640m.add(new InterfaceC6444c() { // from class: xn9
                @Override // p000.go9.InterfaceC6444c
                public final void run(bn9 bn9Var) {
                    this.f98571a.lambda$resumeAnimation$1(bn9Var);
                }
            });
            return;
        }
        computeRenderMode();
        if (animationsEnabled() || getRepeatCount() == 0) {
            if (isVisible()) {
                this.f40624b.resumeAnimation();
                this.f40632f = EnumC6445d.NONE;
            } else {
                this.f40632f = EnumC6445d.RESUME;
            }
        }
        if (animationsEnabled()) {
            return;
        }
        setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        this.f40624b.endAnimation();
        if (isVisible()) {
            return;
        }
        this.f40632f = EnumC6445d.NONE;
    }

    public void reverseAnimationSpeed() {
        this.f40624b.reverseAnimationSpeed();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@efb Drawable drawable, @efb Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@h78(from = 0, m12174to = coe.f17274d) int i) {
        this.f40617V1 = i;
        invalidateSelf();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f40625b2 = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        if (z != this.f40620Z) {
            this.f40620Z = z;
            jn2 jn2Var = this.f40614M1;
            if (jn2Var != null) {
                jn2Var.setClipToCompositionBounds(z);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@hib ColorFilter colorFilter) {
        dj9.warning("Use addColorFilter instead.");
    }

    public boolean setComposition(bn9 bn9Var) {
        if (this.f40622a == bn9Var) {
            return false;
        }
        this.f40645q2 = true;
        clearComposition();
        this.f40622a = bn9Var;
        buildCompositionLayer();
        this.f40624b.setComposition(bn9Var);
        setProgress(this.f40624b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f40640m).iterator();
        while (it.hasNext()) {
            InterfaceC6444c interfaceC6444c = (InterfaceC6444c) it.next();
            if (interfaceC6444c != null) {
                interfaceC6444c.run(bn9Var);
            }
            it.remove();
        }
        this.f40640m.clear();
        bn9Var.setPerformanceTrackingEnabled(this.f40621Z1);
        computeRenderMode();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void setFontAssetDelegate(zn6 zn6Var) {
        this.f40615N = zn6Var;
        ao6 ao6Var = this.f40613M;
        if (ao6Var != null) {
            ao6Var.setDelegate(zn6Var);
        }
    }

    public void setFrame(final int i) {
        if (this.f40622a == null) {
            this.f40640m.add(new InterfaceC6444c() { // from class: eo9
                @Override // p000.go9.InterfaceC6444c
                public final void run(bn9 bn9Var) {
                    this.f33721a.lambda$setFrame$12(i, bn9Var);
                }
            });
        } else {
            this.f40624b.setFrame(i);
        }
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f40628d = z;
    }

    public void setImageAssetDelegate(ps7 ps7Var) {
        this.f40612L = ps7Var;
        qs7 qs7Var = this.f40610F;
        if (qs7Var != null) {
            qs7Var.setDelegate(ps7Var);
        }
    }

    public void setImagesAssetsFolder(@hib String str) {
        this.f40611H = str;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f40619Y = z;
    }

    public void setMaxFrame(final int i) {
        if (this.f40622a == null) {
            this.f40640m.add(new InterfaceC6444c() { // from class: tn9
                @Override // p000.go9.InterfaceC6444c
                public final void run(bn9 bn9Var) {
                    this.f85368a.lambda$setMaxFrame$4(i, bn9Var);
                }
            });
        } else {
            this.f40624b.setMaxFrame(i + 0.99f);
        }
    }

    public void setMaxProgress(@y46(from = 0.0d, m25645to = 1.0d) final float f) {
        bn9 bn9Var = this.f40622a;
        if (bn9Var == null) {
            this.f40640m.add(new InterfaceC6444c() { // from class: wn9
                @Override // p000.go9.InterfaceC6444c
                public final void run(bn9 bn9Var2) {
                    this.f94828a.lambda$setMaxProgress$5(f, bn9Var2);
                }
            });
        } else {
            this.f40624b.setMaxFrame(awa.lerp(bn9Var.getStartFrame(), this.f40622a.getEndFrame(), f));
        }
    }

    public void setMinAndMaxFrame(final String str) {
        bn9 bn9Var = this.f40622a;
        if (bn9Var == null) {
            this.f40640m.add(new InterfaceC6444c() { // from class: rn9
                @Override // p000.go9.InterfaceC6444c
                public final void run(bn9 bn9Var2) {
                    this.f78793a.lambda$setMinAndMaxFrame$8(str, bn9Var2);
                }
            });
            return;
        }
        eu9 marker = bn9Var.getMarker(str);
        if (marker != null) {
            int i = (int) marker.f34036b;
            setMinAndMaxFrame(i, ((int) marker.f34037c) + i);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public void setMinAndMaxProgress(@y46(from = 0.0d, m25645to = 1.0d) final float f, @y46(from = 0.0d, m25645to = 1.0d) final float f2) {
        bn9 bn9Var = this.f40622a;
        if (bn9Var == null) {
            this.f40640m.add(new InterfaceC6444c() { // from class: fo9
                @Override // p000.go9.InterfaceC6444c
                public final void run(bn9 bn9Var2) {
                    this.f37240a.lambda$setMinAndMaxProgress$11(f, f2, bn9Var2);
                }
            });
        } else {
            setMinAndMaxFrame((int) awa.lerp(bn9Var.getStartFrame(), this.f40622a.getEndFrame(), f), (int) awa.lerp(this.f40622a.getStartFrame(), this.f40622a.getEndFrame(), f2));
        }
    }

    public void setMinFrame(final int i) {
        if (this.f40622a == null) {
            this.f40640m.add(new InterfaceC6444c() { // from class: un9
                @Override // p000.go9.InterfaceC6444c
                public final void run(bn9 bn9Var) {
                    this.f88600a.lambda$setMinFrame$2(i, bn9Var);
                }
            });
        } else {
            this.f40624b.setMinFrame(i);
        }
    }

    public void setMinProgress(final float f) {
        bn9 bn9Var = this.f40622a;
        if (bn9Var == null) {
            this.f40640m.add(new InterfaceC6444c() { // from class: co9
                @Override // p000.go9.InterfaceC6444c
                public final void run(bn9 bn9Var2) {
                    this.f17233a.lambda$setMinProgress$3(f, bn9Var2);
                }
            });
        } else {
            setMinFrame((int) awa.lerp(bn9Var.getStartFrame(), this.f40622a.getEndFrame(), f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        if (this.f40623a2 == z) {
            return;
        }
        this.f40623a2 = z;
        jn2 jn2Var = this.f40614M1;
        if (jn2Var != null) {
            jn2Var.setOutlineMasksAndMattes(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f40621Z1 = z;
        bn9 bn9Var = this.f40622a;
        if (bn9Var != null) {
            bn9Var.setPerformanceTrackingEnabled(z);
        }
    }

    public void setProgress(@y46(from = 0.0d, m25645to = 1.0d) final float f) {
        if (this.f40622a == null) {
            this.f40640m.add(new InterfaceC6444c() { // from class: do9
                @Override // p000.go9.InterfaceC6444c
                public final void run(bn9 bn9Var) {
                    this.f30268a.lambda$setProgress$13(f, bn9Var);
                }
            });
            return;
        }
        bt8.beginSection("Drawable#setProgress");
        this.f40624b.setFrame(this.f40622a.getFrameForProgress(f));
        bt8.endSection("Drawable#setProgress");
    }

    public void setRenderMode(xzd xzdVar) {
        this.f40627c2 = xzdVar;
        computeRenderMode();
    }

    public void setRepeatCount(int i) {
        this.f40624b.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f40624b.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.f40630e = z;
    }

    public void setSpeed(float f) {
        this.f40624b.setSpeed(f);
    }

    public void setSystemAnimationsAreEnabled(Boolean bool) {
        this.f40626c = bool.booleanValue();
    }

    public void setTextDelegate(tqg tqgVar) {
        this.f40616Q = tqgVar;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            EnumC6445d enumC6445d = this.f40632f;
            if (enumC6445d == EnumC6445d.PLAY) {
                playAnimation();
            } else if (enumC6445d == EnumC6445d.RESUME) {
                resumeAnimation();
            }
        } else if (this.f40624b.isRunning()) {
            pauseAnimation();
            this.f40632f = EnumC6445d.RESUME;
        } else if (zIsVisible) {
            this.f40632f = EnumC6445d.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    @ir9
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        playAnimation();
    }

    @Override // android.graphics.drawable.Animatable
    @ir9
    public void stop() {
        endAnimation();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@efb Drawable drawable, @efb Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    @hib
    public Bitmap updateBitmap(String str, @hib Bitmap bitmap) {
        qs7 imageAssetManager = getImageAssetManager();
        if (imageAssetManager == null) {
            dj9.warning("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap bitmapUpdateBitmap = imageAssetManager.updateBitmap(str, bitmap);
        invalidateSelf();
        return bitmapUpdateBitmap;
    }

    public boolean useTextGlyphs() {
        return this.f40616Q == null && this.f40622a.getCharacters().size() > 0;
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        if (this.f40618X == z) {
            return;
        }
        this.f40618X = z;
        if (this.f40622a != null) {
            buildCompositionLayer();
        }
    }

    public void setMaxFrame(final String str) {
        bn9 bn9Var = this.f40622a;
        if (bn9Var == null) {
            this.f40640m.add(new InterfaceC6444c() { // from class: zn9
                @Override // p000.go9.InterfaceC6444c
                public final void run(bn9 bn9Var2) {
                    this.f105507a.lambda$setMaxFrame$7(str, bn9Var2);
                }
            });
            return;
        }
        eu9 marker = bn9Var.getMarker(str);
        if (marker != null) {
            setMaxFrame((int) (marker.f34036b + marker.f34037c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void setMinFrame(final String str) {
        bn9 bn9Var = this.f40622a;
        if (bn9Var == null) {
            this.f40640m.add(new InterfaceC6444c() { // from class: ao9
                @Override // p000.go9.InterfaceC6444c
                public final void run(bn9 bn9Var2) {
                    this.f11444a.lambda$setMinFrame$6(str, bn9Var2);
                }
            });
            return;
        }
        eu9 marker = bn9Var.getMarker(str);
        if (marker != null) {
            setMinFrame((int) marker.f34036b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    private void convertRect(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setMinAndMaxFrame(final String str, final String str2, final boolean z) {
        bn9 bn9Var = this.f40622a;
        if (bn9Var == null) {
            this.f40640m.add(new InterfaceC6444c() { // from class: yn9
                @Override // p000.go9.InterfaceC6444c
                public final void run(bn9 bn9Var2) {
                    this.f102338a.lambda$setMinAndMaxFrame$9(str, str2, z, bn9Var2);
                }
            });
            return;
        }
        eu9 marker = bn9Var.getMarker(str);
        if (marker == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i = (int) marker.f34036b;
        eu9 marker2 = this.f40622a.getMarker(str2);
        if (marker2 == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
        }
        setMinAndMaxFrame(i, (int) (marker2.f34036b + (z ? 1.0f : 0.0f)));
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void draw(Canvas canvas, Matrix matrix) {
        jn2 jn2Var = this.f40614M1;
        bn9 bn9Var = this.f40622a;
        if (jn2Var == null || bn9Var == null) {
            return;
        }
        if (this.f40629d2) {
            canvas.save();
            canvas.concat(matrix);
            renderAndDrawAsBitmap(canvas, jn2Var);
            canvas.restore();
        } else {
            jn2Var.draw(canvas, matrix, this.f40617V1);
        }
        this.f40645q2 = false;
    }

    public <T> void addValueCallback(fr8 fr8Var, T t, pif<T> pifVar) {
        addValueCallback(fr8Var, t, new C6443b(pifVar));
    }

    public void setMinAndMaxFrame(final int i, final int i2) {
        if (this.f40622a == null) {
            this.f40640m.add(new InterfaceC6444c() { // from class: sn9
                @Override // p000.go9.InterfaceC6444c
                public final void run(bn9 bn9Var) {
                    this.f82374a.lambda$setMinAndMaxFrame$10(i, i2, bn9Var);
                }
            });
        } else {
            this.f40624b.setMinAndMaxFrames(i, i2 + 0.99f);
        }
    }
}
