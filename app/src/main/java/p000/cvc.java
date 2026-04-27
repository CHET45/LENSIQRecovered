package p000;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes4.dex */
public class cvc implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: l2 */
    public static float f27836l2 = 3.0f;

    /* JADX INFO: renamed from: m2 */
    public static float f27837m2 = 1.75f;

    /* JADX INFO: renamed from: n2 */
    public static float f27838n2 = 1.0f;

    /* JADX INFO: renamed from: o2 */
    public static int f27839o2 = 200;

    /* JADX INFO: renamed from: p2 */
    public static final int f27840p2 = -1;

    /* JADX INFO: renamed from: q2 */
    public static final int f27841q2 = 0;

    /* JADX INFO: renamed from: r2 */
    public static final int f27842r2 = 1;

    /* JADX INFO: renamed from: s2 */
    public static final int f27843s2 = 2;

    /* JADX INFO: renamed from: t2 */
    public static final int f27844t2 = -1;

    /* JADX INFO: renamed from: u2 */
    public static final int f27845u2 = 0;

    /* JADX INFO: renamed from: v2 */
    public static final int f27846v2 = 1;

    /* JADX INFO: renamed from: w2 */
    public static final int f27847w2 = 2;

    /* JADX INFO: renamed from: x2 */
    public static int f27848x2 = 1;

    /* JADX INFO: renamed from: C */
    public ImageView f27849C;

    /* JADX INFO: renamed from: F */
    public GestureDetector f27850F;

    /* JADX INFO: renamed from: H */
    public bd3 f27851H;

    /* JADX INFO: renamed from: M1 */
    public x3c f27854M1;

    /* JADX INFO: renamed from: V1 */
    public c5c f27857V1;

    /* JADX INFO: renamed from: Y */
    public u3c f27859Y;

    /* JADX INFO: renamed from: Z */
    public d4c f27860Z;

    /* JADX INFO: renamed from: Z1 */
    public View.OnClickListener f27861Z1;

    /* JADX INFO: renamed from: a2 */
    public View.OnLongClickListener f27863a2;

    /* JADX INFO: renamed from: b2 */
    public p4c f27865b2;

    /* JADX INFO: renamed from: c2 */
    public s4c f27867c2;

    /* JADX INFO: renamed from: d2 */
    public b5c f27869d2;

    /* JADX INFO: renamed from: e2 */
    public RunnableC4536f f27871e2;

    /* JADX INFO: renamed from: h2 */
    public float f27875h2;

    /* JADX INFO: renamed from: a */
    public Interpolator f27862a = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: b */
    public int f27864b = f27839o2;

    /* JADX INFO: renamed from: c */
    public float f27866c = f27838n2;

    /* JADX INFO: renamed from: d */
    public float f27868d = f27837m2;

    /* JADX INFO: renamed from: e */
    public float f27870e = f27836l2;

    /* JADX INFO: renamed from: f */
    public boolean f27872f = true;

    /* JADX INFO: renamed from: m */
    public boolean f27879m = false;

    /* JADX INFO: renamed from: L */
    public final Matrix f27852L = new Matrix();

    /* JADX INFO: renamed from: M */
    public final Matrix f27853M = new Matrix();

    /* JADX INFO: renamed from: N */
    public final Matrix f27855N = new Matrix();

    /* JADX INFO: renamed from: Q */
    public final RectF f27856Q = new RectF();

    /* JADX INFO: renamed from: X */
    public final float[] f27858X = new float[9];

    /* JADX INFO: renamed from: f2 */
    public int f27873f2 = 2;

    /* JADX INFO: renamed from: g2 */
    public int f27874g2 = 2;

    /* JADX INFO: renamed from: i2 */
    public boolean f27876i2 = true;

    /* JADX INFO: renamed from: j2 */
    public ImageView.ScaleType f27877j2 = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: k2 */
    public w2c f27878k2 = new C4531a();

    /* JADX INFO: renamed from: cvc$a */
    public class C4531a implements w2c {
        public C4531a() {
        }

        @Override // p000.w2c
        public void onDrag(float f, float f2) {
            if (cvc.this.f27851H.isScaling()) {
                return;
            }
            if (cvc.this.f27869d2 != null) {
                cvc.this.f27869d2.onDrag(f, f2);
            }
            cvc.this.f27855N.postTranslate(f, f2);
            cvc.this.checkAndDisplayMatrix();
            ViewParent parent = cvc.this.f27849C.getParent();
            if (!cvc.this.f27872f || cvc.this.f27851H.isScaling() || cvc.this.f27879m) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if ((cvc.this.f27873f2 == 2 || ((cvc.this.f27873f2 == 0 && f >= 1.0f) || ((cvc.this.f27873f2 == 1 && f <= -1.0f) || ((cvc.this.f27874g2 == 0 && f2 >= 1.0f) || (cvc.this.f27874g2 == 1 && f2 <= -1.0f))))) && parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }

        @Override // p000.w2c
        public void onFling(float f, float f2, float f3, float f4) {
            cvc cvcVar = cvc.this;
            cvcVar.f27871e2 = cvcVar.new RunnableC4536f(cvcVar.f27849C.getContext());
            RunnableC4536f runnableC4536f = cvc.this.f27871e2;
            cvc cvcVar2 = cvc.this;
            int imageViewWidth = cvcVar2.getImageViewWidth(cvcVar2.f27849C);
            cvc cvcVar3 = cvc.this;
            runnableC4536f.fling(imageViewWidth, cvcVar3.getImageViewHeight(cvcVar3.f27849C), (int) f3, (int) f4);
            cvc.this.f27849C.post(cvc.this.f27871e2);
        }

        @Override // p000.w2c
        public void onScale(float f, float f2, float f3) {
            if (cvc.this.getScale() < cvc.this.f27870e || f < 1.0f) {
                if (cvc.this.f27865b2 != null) {
                    cvc.this.f27865b2.onScaleChange(f, f2, f3);
                }
                cvc.this.f27855N.postScale(f, f, f2, f3);
                cvc.this.checkAndDisplayMatrix();
            }
        }
    }

    /* JADX INFO: renamed from: cvc$b */
    public class C4532b extends GestureDetector.SimpleOnGestureListener {
        public C4532b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (cvc.this.f27867c2 == null || cvc.this.getScale() > cvc.f27838n2 || motionEvent.getPointerCount() > cvc.f27848x2 || motionEvent2.getPointerCount() > cvc.f27848x2) {
                return false;
            }
            return cvc.this.f27867c2.onFling(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (cvc.this.f27863a2 != null) {
                cvc.this.f27863a2.onLongClick(cvc.this.f27849C);
            }
        }
    }

    /* JADX INFO: renamed from: cvc$c */
    public class GestureDetectorOnDoubleTapListenerC4533c implements GestureDetector.OnDoubleTapListener {
        public GestureDetectorOnDoubleTapListenerC4533c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float scale = cvc.this.getScale();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (scale < cvc.this.getMediumScale()) {
                    cvc cvcVar = cvc.this;
                    cvcVar.setScale(cvcVar.getMediumScale(), x, y, true);
                } else if (scale < cvc.this.getMediumScale() || scale >= cvc.this.getMaximumScale()) {
                    cvc cvcVar2 = cvc.this;
                    cvcVar2.setScale(cvcVar2.getMinimumScale(), x, y, true);
                } else {
                    cvc cvcVar3 = cvc.this;
                    cvcVar3.setScale(cvcVar3.getMaximumScale(), x, y, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (cvc.this.f27861Z1 != null) {
                cvc.this.f27861Z1.onClick(cvc.this.f27849C);
            }
            RectF displayRect = cvc.this.getDisplayRect();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (cvc.this.f27857V1 != null) {
                cvc.this.f27857V1.onViewTap(cvc.this.f27849C, x, y);
            }
            if (displayRect == null) {
                return false;
            }
            if (!displayRect.contains(x, y)) {
                if (cvc.this.f27854M1 == null) {
                    return false;
                }
                cvc.this.f27854M1.onOutsidePhotoTap(cvc.this.f27849C);
                return false;
            }
            float fWidth = (x - displayRect.left) / displayRect.width();
            float fHeight = (y - displayRect.top) / displayRect.height();
            if (cvc.this.f27860Z == null) {
                return true;
            }
            cvc.this.f27860Z.onPhotoTap(cvc.this.f27849C, fWidth, fHeight);
            return true;
        }
    }

    /* JADX INFO: renamed from: cvc$d */
    public static /* synthetic */ class C4534d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27883a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f27883a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27883a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27883a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27883a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: cvc$e */
    public class RunnableC4535e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final float f27884a;

        /* JADX INFO: renamed from: b */
        public final float f27885b;

        /* JADX INFO: renamed from: c */
        public final long f27886c = System.currentTimeMillis();

        /* JADX INFO: renamed from: d */
        public final float f27887d;

        /* JADX INFO: renamed from: e */
        public final float f27888e;

        public RunnableC4535e(float f, float f2, float f3, float f4) {
            this.f27884a = f3;
            this.f27885b = f4;
            this.f27887d = f;
            this.f27888e = f2;
        }

        private float interpolate() {
            return cvc.this.f27862a.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f27886c) * 1.0f) / cvc.this.f27864b));
        }

        @Override // java.lang.Runnable
        public void run() {
            float fInterpolate = interpolate();
            float f = this.f27887d;
            cvc.this.f27878k2.onScale((f + ((this.f27888e - f) * fInterpolate)) / cvc.this.getScale(), this.f27884a, this.f27885b);
            if (fInterpolate < 1.0f) {
                pd2.postOnAnimation(cvc.this.f27849C, this);
            }
        }
    }

    /* JADX INFO: renamed from: cvc$f */
    public class RunnableC4536f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final OverScroller f27890a;

        /* JADX INFO: renamed from: b */
        public int f27891b;

        /* JADX INFO: renamed from: c */
        public int f27892c;

        public RunnableC4536f(Context context) {
            this.f27890a = new OverScroller(context);
        }

        public void cancelFling() {
            this.f27890a.forceFinished(true);
        }

        public void fling(int i, int i2, int i3, int i4) {
            int i5;
            int iRound;
            int i6;
            int iRound2;
            RectF displayRect = cvc.this.getDisplayRect();
            if (displayRect == null) {
                return;
            }
            int iRound3 = Math.round(-displayRect.left);
            float f = i;
            if (f < displayRect.width()) {
                iRound = Math.round(displayRect.width() - f);
                i5 = 0;
            } else {
                i5 = iRound3;
                iRound = i5;
            }
            int iRound4 = Math.round(-displayRect.top);
            float f2 = i2;
            if (f2 < displayRect.height()) {
                iRound2 = Math.round(displayRect.height() - f2);
                i6 = 0;
            } else {
                i6 = iRound4;
                iRound2 = i6;
            }
            this.f27891b = iRound3;
            this.f27892c = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f27890a.fling(iRound3, iRound4, i3, i4, i5, iRound, i6, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f27890a.isFinished() && this.f27890a.computeScrollOffset()) {
                int currX = this.f27890a.getCurrX();
                int currY = this.f27890a.getCurrY();
                cvc.this.f27855N.postTranslate(this.f27891b - currX, this.f27892c - currY);
                cvc.this.checkAndDisplayMatrix();
                this.f27891b = currX;
                this.f27892c = currY;
                pd2.postOnAnimation(cvc.this.f27849C, this);
            }
        }
    }

    public cvc(ImageView imageView) {
        this.f27849C = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f27875h2 = 0.0f;
        this.f27851H = new bd3(imageView.getContext(), this.f27878k2);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new C4532b());
        this.f27850F = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC4533c());
    }

    private void cancelFling() {
        RunnableC4536f runnableC4536f = this.f27871e2;
        if (runnableC4536f != null) {
            runnableC4536f.cancelFling();
            this.f27871e2 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAndDisplayMatrix() {
        if (checkMatrixBounds()) {
            setImageViewMatrix(getDrawMatrix());
        }
    }

    private boolean checkMatrixBounds() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        RectF displayRect = getDisplayRect(getDrawMatrix());
        if (displayRect == null) {
            return false;
        }
        float fHeight = displayRect.height();
        float fWidth = displayRect.width();
        float imageViewHeight = getImageViewHeight(this.f27849C);
        float f6 = 0.0f;
        if (fHeight <= imageViewHeight) {
            int i = C4534d.f27883a[this.f27877j2.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    f4 = (imageViewHeight - fHeight) / 2.0f;
                    f5 = displayRect.top;
                } else {
                    f4 = imageViewHeight - fHeight;
                    f5 = displayRect.top;
                }
                f = f4 - f5;
            } else {
                f = -displayRect.top;
            }
            this.f27874g2 = 2;
        } else {
            float f7 = displayRect.top;
            if (f7 > 0.0f) {
                this.f27874g2 = 0;
                f = -f7;
            } else {
                float f8 = displayRect.bottom;
                if (f8 < imageViewHeight) {
                    this.f27874g2 = 1;
                    f = imageViewHeight - f8;
                } else {
                    this.f27874g2 = -1;
                    f = 0.0f;
                }
            }
        }
        float imageViewWidth = getImageViewWidth(this.f27849C);
        if (fWidth <= imageViewWidth) {
            int i2 = C4534d.f27883a[this.f27877j2.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f2 = (imageViewWidth - fWidth) / 2.0f;
                    f3 = displayRect.left;
                } else {
                    f2 = imageViewWidth - fWidth;
                    f3 = displayRect.left;
                }
                f6 = f2 - f3;
            } else {
                f6 = -displayRect.left;
            }
            this.f27873f2 = 2;
        } else {
            float f9 = displayRect.left;
            if (f9 > 0.0f) {
                this.f27873f2 = 0;
                f6 = -f9;
            } else {
                float f10 = displayRect.right;
                if (f10 < imageViewWidth) {
                    f6 = imageViewWidth - f10;
                    this.f27873f2 = 1;
                } else {
                    this.f27873f2 = -1;
                }
            }
        }
        this.f27855N.postTranslate(f6, f);
        return true;
    }

    private Matrix getDrawMatrix() {
        this.f27853M.set(this.f27852L);
        this.f27853M.postConcat(this.f27855N);
        return this.f27853M;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageViewHeight(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageViewWidth(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    private float getValue(Matrix matrix, int i) {
        matrix.getValues(this.f27858X);
        return this.f27858X[i];
    }

    private void resetMatrix() {
        this.f27855N.reset();
        setRotationBy(this.f27875h2);
        setImageViewMatrix(getDrawMatrix());
        checkMatrixBounds();
    }

    private void setImageViewMatrix(Matrix matrix) {
        RectF displayRect;
        this.f27849C.setImageMatrix(matrix);
        if (this.f27859Y == null || (displayRect = getDisplayRect(matrix)) == null) {
            return;
        }
        this.f27859Y.onMatrixChanged(displayRect);
    }

    private void updateBaseMatrix(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float imageViewWidth = getImageViewWidth(this.f27849C);
        float imageViewHeight = getImageViewHeight(this.f27849C);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f27852L.reset();
        float f = intrinsicWidth;
        float f2 = imageViewWidth / f;
        float f3 = intrinsicHeight;
        float f4 = imageViewHeight / f3;
        ImageView.ScaleType scaleType = this.f27877j2;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f27852L.postTranslate((imageViewWidth - f) / 2.0f, (imageViewHeight - f3) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f2, f4);
            this.f27852L.postScale(fMax, fMax);
            this.f27852L.postTranslate((imageViewWidth - (f * fMax)) / 2.0f, (imageViewHeight - (f3 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f2, f4));
            this.f27852L.postScale(fMin, fMin);
            this.f27852L.postTranslate((imageViewWidth - (f * fMin)) / 2.0f, (imageViewHeight - (f3 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, imageViewWidth, imageViewHeight);
            if (((int) this.f27875h2) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f3, f);
            }
            int i = C4534d.f27883a[this.f27877j2.ordinal()];
            if (i == 1) {
                this.f27852L.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 2) {
                this.f27852L.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                this.f27852L.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                this.f27852L.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        resetMatrix();
    }

    public void getDisplayMatrix(Matrix matrix) {
        matrix.set(getDrawMatrix());
    }

    public RectF getDisplayRect() {
        checkMatrixBounds();
        return getDisplayRect(getDrawMatrix());
    }

    public Matrix getImageMatrix() {
        return this.f27853M;
    }

    public float getMaximumScale() {
        return this.f27870e;
    }

    public float getMediumScale() {
        return this.f27868d;
    }

    public float getMinimumScale() {
        return this.f27866c;
    }

    public float getScale() {
        return (float) Math.sqrt(((float) Math.pow(getValue(this.f27855N, 0), 2.0d)) + ((float) Math.pow(getValue(this.f27855N, 3), 2.0d)));
    }

    public ImageView.ScaleType getScaleType() {
        return this.f27877j2;
    }

    public void getSuppMatrix(Matrix matrix) {
        matrix.set(this.f27855N);
    }

    @Deprecated
    public boolean isZoomEnabled() {
        return this.f27876i2;
    }

    public boolean isZoomable() {
        return this.f27876i2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        updateBaseMatrix(this.f27849C.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.f27876i2
            r1 = 0
            if (r0 == 0) goto Lbe
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = p000.w0i.m24311c(r0)
            if (r0 == 0) goto Lbe
            int r0 = r12.getAction()
            r2 = 1
            if (r0 == 0) goto L6e
            if (r0 == r2) goto L1b
            r3 = 3
            if (r0 == r3) goto L1b
            goto L7a
        L1b:
            float r0 = r10.getScale()
            float r3 = r10.f27866c
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L44
            android.graphics.RectF r0 = r10.getDisplayRect()
            if (r0 == 0) goto L7a
            cvc$e r9 = new cvc$e
            float r5 = r10.getScale()
            float r6 = r10.f27866c
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            goto L6c
        L44:
            float r0 = r10.getScale()
            float r3 = r10.f27870e
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L7a
            android.graphics.RectF r0 = r10.getDisplayRect()
            if (r0 == 0) goto L7a
            cvc$e r9 = new cvc$e
            float r5 = r10.getScale()
            float r6 = r10.f27870e
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
        L6c:
            r11 = r2
            goto L7b
        L6e:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L77
            r11.requestDisallowInterceptTouchEvent(r2)
        L77:
            r10.cancelFling()
        L7a:
            r11 = r1
        L7b:
            bd3 r0 = r10.f27851H
            if (r0 == 0) goto Lb2
            boolean r11 = r0.isScaling()
            bd3 r0 = r10.f27851H
            boolean r0 = r0.isDragging()
            bd3 r3 = r10.f27851H
            boolean r3 = r3.onTouchEvent(r12)
            if (r11 != 0) goto L9b
            bd3 r11 = r10.f27851H
            boolean r11 = r11.isScaling()
            if (r11 != 0) goto L9b
            r11 = r2
            goto L9c
        L9b:
            r11 = r1
        L9c:
            if (r0 != 0) goto La8
            bd3 r0 = r10.f27851H
            boolean r0 = r0.isDragging()
            if (r0 != 0) goto La8
            r0 = r2
            goto La9
        La8:
            r0 = r1
        La9:
            if (r11 == 0) goto Lae
            if (r0 == 0) goto Lae
            r1 = r2
        Lae:
            r10.f27879m = r1
            r1 = r3
            goto Lb3
        Lb2:
            r1 = r11
        Lb3:
            android.view.GestureDetector r11 = r10.f27850F
            if (r11 == 0) goto Lbe
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto Lbe
            r1 = r2
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cvc.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f27872f = z;
    }

    public void setBaseRotation(float f) {
        this.f27875h2 = f % 360.0f;
        update();
        setRotationBy(this.f27875h2);
        checkAndDisplayMatrix();
    }

    public boolean setDisplayMatrix(Matrix matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }
        if (this.f27849C.getDrawable() == null) {
            return false;
        }
        this.f27855N.set(matrix);
        checkAndDisplayMatrix();
        return true;
    }

    public void setMaximumScale(float f) {
        w0i.m24309a(this.f27866c, this.f27868d, f);
        this.f27870e = f;
    }

    public void setMediumScale(float f) {
        w0i.m24309a(this.f27866c, f, this.f27870e);
        this.f27868d = f;
    }

    public void setMinimumScale(float f) {
        w0i.m24309a(f, this.f27868d, this.f27870e);
        this.f27866c = f;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f27861Z1 = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f27850F.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f27863a2 = onLongClickListener;
    }

    public void setOnMatrixChangeListener(u3c u3cVar) {
        this.f27859Y = u3cVar;
    }

    public void setOnOutsidePhotoTapListener(x3c x3cVar) {
        this.f27854M1 = x3cVar;
    }

    public void setOnPhotoTapListener(d4c d4cVar) {
        this.f27860Z = d4cVar;
    }

    public void setOnScaleChangeListener(p4c p4cVar) {
        this.f27865b2 = p4cVar;
    }

    public void setOnSingleFlingListener(s4c s4cVar) {
        this.f27867c2 = s4cVar;
    }

    public void setOnViewDragListener(b5c b5cVar) {
        this.f27869d2 = b5cVar;
    }

    public void setOnViewTapListener(c5c c5cVar) {
        this.f27857V1 = c5cVar;
    }

    public void setRotationBy(float f) {
        this.f27855N.postRotate(f % 360.0f);
        checkAndDisplayMatrix();
    }

    public void setRotationTo(float f) {
        this.f27855N.setRotate(f % 360.0f);
        checkAndDisplayMatrix();
    }

    public void setScale(float f) {
        setScale(f, false);
    }

    public void setScaleLevels(float f, float f2, float f3) {
        w0i.m24309a(f, f2, f3);
        this.f27866c = f;
        this.f27868d = f2;
        this.f27870e = f3;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!w0i.m24312d(scaleType) || scaleType == this.f27877j2) {
            return;
        }
        this.f27877j2 = scaleType;
        update();
    }

    public void setZoomInterpolator(Interpolator interpolator) {
        this.f27862a = interpolator;
    }

    public void setZoomTransitionDuration(int i) {
        this.f27864b = i;
    }

    public void setZoomable(boolean z) {
        this.f27876i2 = z;
        update();
    }

    public void update() {
        if (this.f27876i2) {
            updateBaseMatrix(this.f27849C.getDrawable());
        } else {
            resetMatrix();
        }
    }

    public void setScale(float f, boolean z) {
        setScale(f, this.f27849C.getRight() / 2, this.f27849C.getBottom() / 2, z);
    }

    private RectF getDisplayRect(Matrix matrix) {
        if (this.f27849C.getDrawable() == null) {
            return null;
        }
        this.f27856Q.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        matrix.mapRect(this.f27856Q);
        return this.f27856Q;
    }

    public void setScale(float f, float f2, float f3, boolean z) {
        if (f < this.f27866c || f > this.f27870e) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.f27849C.post(new RunnableC4535e(getScale(), f, f2, f3));
        } else {
            this.f27855N.setScale(f, f, f2, f3);
            checkAndDisplayMatrix();
        }
    }
}
