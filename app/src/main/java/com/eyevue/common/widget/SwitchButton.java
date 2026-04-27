package com.eyevue.common.widget;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CompoundButton;
import com.eyevue.common.C2531R;
import p000.wa2;

/* JADX INFO: loaded from: classes4.dex */
public class SwitchButton extends CompoundButton {

    /* JADX INFO: renamed from: M2 */
    public static final float f17966M2 = 1.8f;

    /* JADX INFO: renamed from: N2 */
    public static final int f17967N2 = 20;

    /* JADX INFO: renamed from: O2 */
    public static final int f17968O2 = 2;

    /* JADX INFO: renamed from: P2 */
    public static final int f17969P2 = 250;

    /* JADX INFO: renamed from: Q2 */
    public static final int f17970Q2 = 3309506;

    /* JADX INFO: renamed from: R2 */
    public static final int[] f17971R2 = {16842912, 16842910, 16842919};

    /* JADX INFO: renamed from: S2 */
    public static final int[] f17972S2 = {-16842912, 16842910, 16842919};

    /* JADX INFO: renamed from: A2 */
    public Layout f17973A2;

    /* JADX INFO: renamed from: B2 */
    public Layout f17974B2;

    /* JADX INFO: renamed from: C */
    public float f17975C;

    /* JADX INFO: renamed from: C2 */
    public float f17976C2;

    /* JADX INFO: renamed from: D2 */
    public float f17977D2;

    /* JADX INFO: renamed from: E2 */
    public int f17978E2;

    /* JADX INFO: renamed from: F */
    public long f17979F;

    /* JADX INFO: renamed from: F2 */
    public int f17980F2;

    /* JADX INFO: renamed from: G2 */
    public int f17981G2;

    /* JADX INFO: renamed from: H */
    public boolean f17982H;

    /* JADX INFO: renamed from: H2 */
    public boolean f17983H2;

    /* JADX INFO: renamed from: I2 */
    public boolean f17984I2;

    /* JADX INFO: renamed from: J2 */
    public boolean f17985J2;

    /* JADX INFO: renamed from: K2 */
    public RunnableC2540b f17986K2;

    /* JADX INFO: renamed from: L */
    public int f17987L;

    /* JADX INFO: renamed from: L2 */
    public CompoundButton.OnCheckedChangeListener f17988L2;

    /* JADX INFO: renamed from: M */
    public int f17989M;

    /* JADX INFO: renamed from: M1 */
    public int f17990M1;

    /* JADX INFO: renamed from: N */
    public int f17991N;

    /* JADX INFO: renamed from: Q */
    public int f17992Q;

    /* JADX INFO: renamed from: V1 */
    public int f17993V1;

    /* JADX INFO: renamed from: Z1 */
    public int f17994Z1;

    /* JADX INFO: renamed from: a */
    public Drawable f17995a;

    /* JADX INFO: renamed from: a2 */
    public int f17996a2;

    /* JADX INFO: renamed from: b */
    public Drawable f17997b;

    /* JADX INFO: renamed from: b2 */
    public int f17998b2;

    /* JADX INFO: renamed from: c */
    public ColorStateList f17999c;

    /* JADX INFO: renamed from: c2 */
    public int f18000c2;

    /* JADX INFO: renamed from: d */
    public ColorStateList f18001d;

    /* JADX INFO: renamed from: d2 */
    public Drawable f18002d2;

    /* JADX INFO: renamed from: e */
    public float f18003e;

    /* JADX INFO: renamed from: e2 */
    public Drawable f18004e2;

    /* JADX INFO: renamed from: f */
    public float f18005f;

    /* JADX INFO: renamed from: f2 */
    public RectF f18006f2;

    /* JADX INFO: renamed from: g2 */
    public RectF f18007g2;

    /* JADX INFO: renamed from: h2 */
    public RectF f18008h2;

    /* JADX INFO: renamed from: i2 */
    public RectF f18009i2;

    /* JADX INFO: renamed from: j2 */
    public RectF f18010j2;

    /* JADX INFO: renamed from: k2 */
    public Paint f18011k2;

    /* JADX INFO: renamed from: l2 */
    public boolean f18012l2;

    /* JADX INFO: renamed from: m */
    public RectF f18013m;

    /* JADX INFO: renamed from: m2 */
    public boolean f18014m2;

    /* JADX INFO: renamed from: n2 */
    public boolean f18015n2;

    /* JADX INFO: renamed from: o2 */
    public ValueAnimator f18016o2;

    /* JADX INFO: renamed from: p2 */
    public float f18017p2;

    /* JADX INFO: renamed from: q2 */
    public RectF f18018q2;

    /* JADX INFO: renamed from: r2 */
    public float f18019r2;

    /* JADX INFO: renamed from: s2 */
    public float f18020s2;

    /* JADX INFO: renamed from: t2 */
    public float f18021t2;

    /* JADX INFO: renamed from: u2 */
    public int f18022u2;

    /* JADX INFO: renamed from: v2 */
    public int f18023v2;

    /* JADX INFO: renamed from: w2 */
    public Paint f18024w2;

    /* JADX INFO: renamed from: x2 */
    public CharSequence f18025x2;

    /* JADX INFO: renamed from: y2 */
    public CharSequence f18026y2;

    /* JADX INFO: renamed from: z2 */
    public TextPaint f18027z2;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2538a();

        /* JADX INFO: renamed from: a */
        public CharSequence f18028a;

        /* JADX INFO: renamed from: b */
        public CharSequence f18029b;

        /* JADX INFO: renamed from: com.eyevue.common.widget.SwitchButton$SavedState$a */
        public class C2538a implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, C2539a c2539a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            TextUtils.writeToParcel(this.f18028a, out, flags);
            TextUtils.writeToParcel(this.f18029b, out, flags);
        }

        public SavedState(Parcelable superState) {
            super(superState);
        }

        private SavedState(Parcel in) {
            super(in);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f18028a = (CharSequence) creator.createFromParcel(in);
            this.f18029b = (CharSequence) creator.createFromParcel(in);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.common.widget.SwitchButton$a */
    public class C2539a implements ValueAnimator.AnimatorUpdateListener {
        public C2539a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SwitchButton.this.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.eyevue.common.widget.SwitchButton$b */
    public final class RunnableC2540b implements Runnable {
        private RunnableC2540b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SwitchButton.this.setPressed(false);
        }

        public /* synthetic */ RunnableC2540b(SwitchButton switchButton, C2539a c2539a) {
            this();
        }
    }

    public SwitchButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f18015n2 = false;
        this.f17983H2 = false;
        this.f17984I2 = false;
        this.f17985J2 = false;
        init(attrs);
    }

    private void catchView() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.f17985J2 = true;
    }

    private int ceil(double dimen) {
        return (int) Math.ceil(dimen);
    }

    private ColorStateList getColorStateListCompat(Context context, int id) {
        return context.getColorStateList(id);
    }

    private Drawable getDrawableCompat(Context context, int id) {
        return context.getDrawable(id);
    }

    private float getProgress() {
        return this.f18017p2;
    }

    private boolean getStatusBasedOnPos() {
        return getProgress() > 0.5f;
    }

    private static int getThemeAccentColorOrDefault(Context context, int defaultColor) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true) ? typedValue.data : defaultColor;
    }

    private void init(AttributeSet attrs) {
        int i;
        float f;
        float f2;
        float f3;
        String str;
        float f4;
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        Drawable drawable;
        float f5;
        float f6;
        ColorStateList colorStateList;
        Drawable drawable2;
        float f7;
        ColorStateList colorStateList2;
        boolean z;
        float f8;
        float f9;
        float f10;
        ColorStateList colorStateList3;
        TypedArray typedArrayObtainStyledAttributes;
        boolean z2;
        this.f18022u2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f18023v2 = ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout();
        this.f18011k2 = new Paint(1);
        Paint paint = new Paint(1);
        this.f18024w2 = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f18024w2.setStrokeWidth(getResources().getDisplayMetrics().density);
        this.f18027z2 = getPaint();
        this.f18006f2 = new RectF();
        this.f18007g2 = new RectF();
        this.f18008h2 = new RectF();
        this.f18013m = new RectF();
        this.f18009i2 = new RectF();
        this.f18010j2 = new RectF();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 0.0f).setDuration(250L);
        this.f18016o2 = duration;
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f18016o2.addUpdateListener(new C2539a());
        this.f18018q2 = new RectF();
        float f11 = getResources().getDisplayMetrics().density * 2.0f;
        TypedArray typedArrayObtainStyledAttributes2 = attrs == null ? null : getContext().obtainStyledAttributes(attrs, C2531R.styleable.SwitchButton);
        if (typedArrayObtainStyledAttributes2 != null) {
            Drawable drawable3 = typedArrayObtainStyledAttributes2.getDrawable(C2531R.styleable.SwitchButton_kswThumbDrawable);
            colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(C2531R.styleable.SwitchButton_kswThumbColor);
            float dimension = typedArrayObtainStyledAttributes2.getDimension(C2531R.styleable.SwitchButton_kswThumbMargin, f11);
            float dimension2 = typedArrayObtainStyledAttributes2.getDimension(C2531R.styleable.SwitchButton_kswThumbMarginLeft, dimension);
            float dimension3 = typedArrayObtainStyledAttributes2.getDimension(C2531R.styleable.SwitchButton_kswThumbMarginRight, dimension);
            float dimension4 = typedArrayObtainStyledAttributes2.getDimension(C2531R.styleable.SwitchButton_kswThumbMarginTop, dimension);
            float dimension5 = typedArrayObtainStyledAttributes2.getDimension(C2531R.styleable.SwitchButton_kswThumbMarginBottom, dimension);
            float dimension6 = typedArrayObtainStyledAttributes2.getDimension(C2531R.styleable.SwitchButton_kswThumbWidth, 0.0f);
            float dimension7 = typedArrayObtainStyledAttributes2.getDimension(C2531R.styleable.SwitchButton_kswThumbHeight, 0.0f);
            float dimension8 = typedArrayObtainStyledAttributes2.getDimension(C2531R.styleable.SwitchButton_kswThumbRadius, -1.0f);
            float dimension9 = typedArrayObtainStyledAttributes2.getDimension(C2531R.styleable.SwitchButton_kswBackRadius, -1.0f);
            Drawable drawable4 = typedArrayObtainStyledAttributes2.getDrawable(C2531R.styleable.SwitchButton_kswBackDrawable);
            ColorStateList colorStateList4 = typedArrayObtainStyledAttributes2.getColorStateList(C2531R.styleable.SwitchButton_kswBackColor);
            float f12 = typedArrayObtainStyledAttributes2.getFloat(C2531R.styleable.SwitchButton_kswThumbRangeRatio, 1.8f);
            int integer = typedArrayObtainStyledAttributes2.getInteger(C2531R.styleable.SwitchButton_kswAnimationDuration, 250);
            boolean z3 = typedArrayObtainStyledAttributes2.getBoolean(C2531R.styleable.SwitchButton_kswFadeBack, true);
            int color = typedArrayObtainStyledAttributes2.getColor(C2531R.styleable.SwitchButton_kswTintColor, 0);
            String string = typedArrayObtainStyledAttributes2.getString(C2531R.styleable.SwitchButton_kswTextOn);
            String string2 = typedArrayObtainStyledAttributes2.getString(C2531R.styleable.SwitchButton_kswTextOff);
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(C2531R.styleable.SwitchButton_kswTextThumbInset, 0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(C2531R.styleable.SwitchButton_kswTextExtra, 0);
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(C2531R.styleable.SwitchButton_kswTextAdjust, 0);
            typedArrayObtainStyledAttributes2.recycle();
            f4 = dimension7;
            f8 = dimension3;
            f9 = dimension4;
            i3 = dimensionPixelSize2;
            f5 = dimension5;
            colorStateList2 = colorStateList4;
            f7 = dimension2;
            drawable = drawable4;
            str2 = string;
            f = dimension9;
            drawable2 = drawable3;
            i4 = dimensionPixelSize3;
            f6 = dimension6;
            str = string2;
            i2 = dimensionPixelSize;
            f3 = f12;
            i5 = color;
            i = integer;
            z = z3;
            f2 = dimension8;
        } else {
            i = 250;
            f = -1.0f;
            f2 = -1.0f;
            f3 = 1.8f;
            str = null;
            f4 = 0.0f;
            str2 = null;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            drawable = null;
            f5 = 0.0f;
            f6 = 0.0f;
            colorStateList = null;
            drawable2 = null;
            f7 = 0.0f;
            colorStateList2 = null;
            z = true;
            f8 = 0.0f;
            f9 = 0.0f;
        }
        float f13 = f5;
        if (attrs == null) {
            f10 = f7;
            colorStateList3 = colorStateList2;
            typedArrayObtainStyledAttributes = null;
        } else {
            f10 = f7;
            colorStateList3 = colorStateList2;
            typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, new int[]{R.attr.focusable, R.attr.clickable});
        }
        if (typedArrayObtainStyledAttributes != null) {
            z2 = true;
            boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
            boolean z5 = typedArrayObtainStyledAttributes.getBoolean(1, z4);
            setFocusable(z4);
            setClickable(z5);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            z2 = true;
            setFocusable(true);
            setClickable(true);
        }
        this.f18025x2 = str2;
        this.f18026y2 = str;
        this.f17978E2 = i2;
        this.f17980F2 = i3;
        this.f17981G2 = i4;
        this.f17995a = drawable2;
        this.f18001d = colorStateList;
        this.f18012l2 = drawable2 != null ? z2 : false;
        this.f17987L = i5;
        if (i5 == 0) {
            this.f17987L = getThemeAccentColorOrDefault(getContext(), f17970Q2);
        }
        if (!this.f18012l2 && this.f18001d == null) {
            ColorStateList colorStateListGenerateThumbColorWithTintColor = wa2.generateThumbColorWithTintColor(this.f17987L);
            this.f18001d = colorStateListGenerateThumbColorWithTintColor;
            this.f17993V1 = colorStateListGenerateThumbColorWithTintColor.getDefaultColor();
        }
        this.f17989M = ceil(f6);
        this.f17991N = ceil(f4);
        this.f17997b = drawable;
        ColorStateList colorStateList5 = colorStateList3;
        this.f17999c = colorStateList5;
        boolean z6 = drawable != null ? z2 : false;
        this.f18014m2 = z6;
        if (!z6 && colorStateList5 == null) {
            ColorStateList colorStateListGenerateBackColorWithTintColor = wa2.generateBackColorWithTintColor(this.f17987L);
            this.f17999c = colorStateListGenerateBackColorWithTintColor;
            int defaultColor = colorStateListGenerateBackColorWithTintColor.getDefaultColor();
            this.f17994Z1 = defaultColor;
            this.f17996a2 = this.f17999c.getColorForState(f17971R2, defaultColor);
        }
        this.f18013m.set(f10, f9, f8, f13);
        float f14 = f3;
        this.f17975C = this.f18013m.width() >= 0.0f ? Math.max(f14, 1.0f) : f14;
        this.f18003e = f2;
        this.f18005f = f;
        long j = i;
        this.f17979F = j;
        this.f17982H = z;
        this.f18016o2.setDuration(j);
        if (isChecked()) {
            setProgress(1.0f);
        }
    }

    private Layout makeLayout(CharSequence text) {
        return new StaticLayout(text, this.f18027z2, (int) Math.ceil(Layout.getDesiredWidth(text, r2)), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    private int measureHeight(int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (this.f17991N == 0 && this.f18012l2) {
            this.f17991N = this.f17995a.getIntrinsicHeight();
        }
        if (mode != 1073741824) {
            if (this.f17991N == 0) {
                this.f17991N = ceil(getResources().getDisplayMetrics().density * 20.0f);
            }
            float f = this.f17991N;
            RectF rectF = this.f18013m;
            int iCeil = ceil(f + rectF.top + rectF.bottom);
            this.f17990M1 = iCeil;
            if (iCeil < 0) {
                this.f17990M1 = 0;
                this.f17991N = 0;
                return size;
            }
            int iCeil2 = ceil(this.f17977D2 - iCeil);
            if (iCeil2 > 0) {
                this.f17990M1 += iCeil2;
                this.f17991N += iCeil2;
            }
            int iMax = Math.max(this.f17991N, this.f17990M1);
            return Math.max(Math.max(iMax, getPaddingTop() + iMax + getPaddingBottom()), getSuggestedMinimumHeight());
        }
        if (this.f17991N != 0) {
            RectF rectF2 = this.f18013m;
            this.f17990M1 = ceil(r6 + rectF2.top + rectF2.bottom);
            this.f17990M1 = ceil(Math.max(r6, this.f17977D2));
            if ((((r6 + getPaddingTop()) + getPaddingBottom()) - Math.min(0.0f, this.f18013m.top)) - Math.min(0.0f, this.f18013m.bottom) > size) {
                this.f17991N = 0;
            }
        }
        if (this.f17991N == 0) {
            int iCeil3 = ceil(((size - getPaddingTop()) - getPaddingBottom()) + Math.min(0.0f, this.f18013m.top) + Math.min(0.0f, this.f18013m.bottom));
            this.f17990M1 = iCeil3;
            if (iCeil3 < 0) {
                this.f17990M1 = 0;
                this.f17991N = 0;
                return size;
            }
            RectF rectF3 = this.f18013m;
            this.f17991N = ceil((iCeil3 - rectF3.top) - rectF3.bottom);
        }
        if (this.f17991N >= 0) {
            return size;
        }
        this.f17990M1 = 0;
        this.f17991N = 0;
        return size;
    }

    private int measureWidth(int widthMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        if (this.f17989M == 0 && this.f18012l2) {
            this.f17989M = this.f17995a.getIntrinsicWidth();
        }
        int iCeil = ceil(this.f17976C2);
        if (this.f17975C == 0.0f) {
            this.f17975C = 1.8f;
        }
        if (mode != 1073741824) {
            if (this.f17989M == 0) {
                this.f17989M = ceil(getResources().getDisplayMetrics().density * 20.0f);
            }
            if (this.f17975C == 0.0f) {
                this.f17975C = 1.8f;
            }
            int iCeil2 = ceil(this.f17989M * this.f17975C);
            float f = iCeil + this.f17980F2;
            float f2 = iCeil2 - this.f17989M;
            RectF rectF = this.f18013m;
            int iCeil3 = ceil(f - ((f2 + Math.max(rectF.left, rectF.right)) + this.f17978E2));
            float f3 = iCeil2;
            RectF rectF2 = this.f18013m;
            int iCeil4 = ceil(rectF2.left + f3 + rectF2.right + Math.max(0, iCeil3));
            this.f17992Q = iCeil4;
            if (iCeil4 >= 0) {
                int iCeil5 = ceil(f3 + Math.max(0.0f, this.f18013m.left) + Math.max(0.0f, this.f18013m.right) + Math.max(0, iCeil3));
                return Math.max(iCeil5, getPaddingLeft() + iCeil5 + getPaddingRight());
            }
            this.f17989M = 0;
            this.f17992Q = 0;
            return size;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (this.f17989M != 0) {
            int iCeil6 = ceil(r2 * this.f17975C);
            int i = this.f17980F2 + iCeil;
            int i2 = iCeil6 - this.f17989M;
            RectF rectF3 = this.f18013m;
            int iCeil7 = i - (i2 + ceil(Math.max(rectF3.left, rectF3.right)));
            float f4 = iCeil6;
            RectF rectF4 = this.f18013m;
            int iCeil8 = ceil(rectF4.left + f4 + rectF4.right + Math.max(iCeil7, 0));
            this.f17992Q = iCeil8;
            if (iCeil8 < 0) {
                this.f17989M = 0;
            }
            if (f4 + Math.max(this.f18013m.left, 0.0f) + Math.max(this.f18013m.right, 0.0f) + Math.max(iCeil7, 0) > paddingLeft) {
                this.f17989M = 0;
            }
        }
        if (this.f17989M != 0) {
            return size;
        }
        int iCeil9 = ceil((((size - getPaddingLeft()) - getPaddingRight()) - Math.max(this.f18013m.left, 0.0f)) - Math.max(this.f18013m.right, 0.0f));
        if (iCeil9 < 0) {
            this.f17989M = 0;
            this.f17992Q = 0;
            return size;
        }
        float f5 = iCeil9;
        this.f17989M = ceil(f5 / this.f17975C);
        RectF rectF5 = this.f18013m;
        int iCeil10 = ceil(f5 + rectF5.left + rectF5.right);
        this.f17992Q = iCeil10;
        if (iCeil10 < 0) {
            this.f17989M = 0;
            this.f17992Q = 0;
            return size;
        }
        int i3 = iCeil + this.f17980F2;
        int i4 = iCeil9 - this.f17989M;
        RectF rectF6 = this.f18013m;
        int iCeil11 = i3 - (i4 + ceil(Math.max(rectF6.left, rectF6.right)));
        if (iCeil11 > 0) {
            this.f17989M -= iCeil11;
        }
        if (this.f17989M >= 0) {
            return size;
        }
        this.f17989M = 0;
        this.f17992Q = 0;
        return size;
    }

    private void setDrawableState(Drawable drawable) {
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0006 A[PHI: r0
  0x0006: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setProgress(final float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto Le
        L8:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            goto L6
        Le:
            r2.f18017p2 = r3
            r2.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eyevue.common.widget.SwitchButton.setProgress(float):void");
    }

    private void setup() {
        int i;
        if (this.f17989M == 0 || (i = this.f17991N) == 0 || this.f17992Q == 0 || this.f17990M1 == 0) {
            return;
        }
        if (this.f18003e == -1.0f) {
            this.f18003e = Math.min(r0, i) / 2.0f;
        }
        if (this.f18005f == -1.0f) {
            this.f18005f = Math.min(this.f17992Q, this.f17990M1) / 2.0f;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int iCeil = ceil((this.f17992Q - Math.min(0.0f, this.f18013m.left)) - Math.min(0.0f, this.f18013m.right));
        float paddingTop = measuredHeight <= ceil((this.f17990M1 - Math.min(0.0f, this.f18013m.top)) - Math.min(0.0f, this.f18013m.bottom)) ? getPaddingTop() + Math.max(0.0f, this.f18013m.top) : (((measuredHeight - r3) + 1) / 2.0f) + getPaddingTop() + Math.max(0.0f, this.f18013m.top);
        float paddingLeft = measuredWidth <= this.f17992Q ? getPaddingLeft() + Math.max(0.0f, this.f18013m.left) : (((measuredWidth - iCeil) + 1) / 2.0f) + getPaddingLeft() + Math.max(0.0f, this.f18013m.left);
        this.f18006f2.set(paddingLeft, paddingTop, this.f17989M + paddingLeft, this.f17991N + paddingTop);
        RectF rectF = this.f18006f2;
        float f = rectF.left;
        RectF rectF2 = this.f18013m;
        float f2 = f - rectF2.left;
        RectF rectF3 = this.f18007g2;
        float f3 = rectF.top;
        float f4 = rectF2.top;
        rectF3.set(f2, f3 - f4, this.f17992Q + f2, (f3 - f4) + this.f17990M1);
        RectF rectF4 = this.f18008h2;
        RectF rectF5 = this.f18006f2;
        rectF4.set(rectF5.left, 0.0f, (this.f18007g2.right - this.f18013m.right) - rectF5.width(), 0.0f);
        this.f18005f = Math.min(Math.min(this.f18007g2.width(), this.f18007g2.height()) / 2.0f, this.f18005f);
        Drawable drawable = this.f17997b;
        if (drawable != null) {
            RectF rectF6 = this.f18007g2;
            drawable.setBounds((int) rectF6.left, (int) rectF6.top, ceil(rectF6.right), ceil(this.f18007g2.bottom));
        }
        if (this.f17973A2 != null) {
            RectF rectF7 = this.f18007g2;
            float fWidth = (rectF7.left + (((((rectF7.width() + this.f17978E2) - this.f17989M) - this.f18013m.right) - this.f17973A2.getWidth()) / 2.0f)) - this.f17981G2;
            RectF rectF8 = this.f18007g2;
            float fHeight = rectF8.top + ((rectF8.height() - this.f17973A2.getHeight()) / 2.0f);
            this.f18009i2.set(fWidth, fHeight, this.f17973A2.getWidth() + fWidth, this.f17973A2.getHeight() + fHeight);
        }
        if (this.f17974B2 != null) {
            RectF rectF9 = this.f18007g2;
            float fWidth2 = ((rectF9.right - (((((rectF9.width() + this.f17978E2) - this.f17989M) - this.f18013m.left) - this.f17974B2.getWidth()) / 2.0f)) - this.f17974B2.getWidth()) + this.f17981G2;
            RectF rectF10 = this.f18007g2;
            float fHeight2 = rectF10.top + ((rectF10.height() - this.f17974B2.getHeight()) / 2.0f);
            this.f18010j2.set(fWidth2, fHeight2, this.f17974B2.getWidth() + fWidth2, this.f17974B2.getHeight() + fHeight2);
        }
        this.f17984I2 = true;
    }

    /* JADX INFO: renamed from: b */
    public void m4391b(boolean checked) {
        ValueAnimator valueAnimator = this.f18016o2;
        if (valueAnimator == null) {
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f18016o2.cancel();
        }
        this.f18016o2.setDuration(this.f17979F);
        if (checked) {
            this.f18016o2.setFloatValues(this.f18017p2, 1.0f);
        } else {
            this.f18016o2.setFloatValues(this.f18017p2, 0.0f);
        }
        this.f18016o2.start();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        super.drawableStateChanged();
        if (this.f18012l2 || (colorStateList2 = this.f18001d) == null) {
            setDrawableState(this.f17995a);
        } else {
            this.f17993V1 = colorStateList2.getColorForState(getDrawableState(), this.f17993V1);
        }
        int[] iArr = isChecked() ? f17972S2 : f17971R2;
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            int defaultColor = textColors.getDefaultColor();
            this.f17998b2 = textColors.getColorForState(f17971R2, defaultColor);
            this.f18000c2 = textColors.getColorForState(f17972S2, defaultColor);
        }
        if (!this.f18014m2 && (colorStateList = this.f17999c) != null) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), this.f17994Z1);
            this.f17994Z1 = colorForState;
            this.f17996a2 = this.f17999c.getColorForState(iArr, colorForState);
            return;
        }
        Drawable drawable = this.f17997b;
        if ((drawable instanceof StateListDrawable) && this.f17982H) {
            drawable.setState(iArr);
            this.f18004e2 = this.f17997b.getCurrent().mutate();
        } else {
            this.f18004e2 = null;
        }
        setDrawableState(this.f17997b);
        Drawable drawable2 = this.f17997b;
        if (drawable2 != null) {
            this.f18002d2 = drawable2.getCurrent().mutate();
        }
    }

    public long getAnimationDuration() {
        return this.f17979F;
    }

    public ColorStateList getBackColor() {
        return this.f17999c;
    }

    public Drawable getBackDrawable() {
        return this.f17997b;
    }

    public float getBackRadius() {
        return this.f18005f;
    }

    public PointF getBackSizeF() {
        return new PointF(this.f18007g2.width(), this.f18007g2.height());
    }

    public CharSequence getTextOff() {
        return this.f18026y2;
    }

    public CharSequence getTextOn() {
        return this.f18025x2;
    }

    public ColorStateList getThumbColor() {
        return this.f18001d;
    }

    public Drawable getThumbDrawable() {
        return this.f17995a;
    }

    public float getThumbHeight() {
        return this.f17991N;
    }

    public RectF getThumbMargin() {
        return this.f18013m;
    }

    public float getThumbRadius() {
        return this.f18003e;
    }

    public float getThumbRangeRatio() {
        return this.f17975C;
    }

    public float getThumbWidth() {
        return this.f17989M;
    }

    public int getTintColor() {
        return this.f17987L;
    }

    public boolean isDrawDebugRect() {
        return this.f18015n2;
    }

    public boolean isFadeBack() {
        return this.f17982H;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f17984I2) {
            setup();
        }
        if (this.f17984I2) {
            if (this.f18014m2) {
                if (!this.f17982H || this.f18002d2 == null || this.f18004e2 == null) {
                    this.f17997b.setAlpha(255);
                    this.f17997b.draw(canvas);
                } else {
                    Drawable drawable = isChecked() ? this.f18002d2 : this.f18004e2;
                    Drawable drawable2 = isChecked() ? this.f18004e2 : this.f18002d2;
                    int progress = (int) (getProgress() * 255.0f);
                    drawable.setAlpha(progress);
                    drawable.draw(canvas);
                    drawable2.setAlpha(255 - progress);
                    drawable2.draw(canvas);
                }
            } else if (this.f17982H) {
                int i = isChecked() ? this.f17994Z1 : this.f17996a2;
                int i2 = isChecked() ? this.f17996a2 : this.f17994Z1;
                int progress2 = (int) (getProgress() * 255.0f);
                this.f18011k2.setARGB((Color.alpha(i) * progress2) / 255, Color.red(i), Color.green(i), Color.blue(i));
                RectF rectF = this.f18007g2;
                float f = this.f18005f;
                canvas.drawRoundRect(rectF, f, f, this.f18011k2);
                this.f18011k2.setARGB((Color.alpha(i2) * (255 - progress2)) / 255, Color.red(i2), Color.green(i2), Color.blue(i2));
                RectF rectF2 = this.f18007g2;
                float f2 = this.f18005f;
                canvas.drawRoundRect(rectF2, f2, f2, this.f18011k2);
                this.f18011k2.setAlpha(255);
            } else {
                this.f18011k2.setColor(this.f17994Z1);
                RectF rectF3 = this.f18007g2;
                float f3 = this.f18005f;
                canvas.drawRoundRect(rectF3, f3, f3, this.f18011k2);
            }
            Layout layout = ((double) getProgress()) > 0.5d ? this.f17973A2 : this.f17974B2;
            RectF rectF4 = ((double) getProgress()) > 0.5d ? this.f18009i2 : this.f18010j2;
            if (layout != null && rectF4 != null) {
                int progress3 = (int) ((((double) getProgress()) >= 0.75d ? (getProgress() * 4.0f) - 3.0f : ((double) getProgress()) < 0.25d ? 1.0f - (getProgress() * 4.0f) : 0.0f) * 255.0f);
                int i3 = ((double) getProgress()) > 0.5d ? this.f17998b2 : this.f18000c2;
                layout.getPaint().setARGB((Color.alpha(i3) * progress3) / 255, Color.red(i3), Color.green(i3), Color.blue(i3));
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                layout.draw(canvas);
                canvas.restore();
            }
            this.f18018q2.set(this.f18006f2);
            this.f18018q2.offset(this.f18017p2 * this.f18008h2.width(), 0.0f);
            if (this.f18012l2) {
                Drawable drawable3 = this.f17995a;
                RectF rectF5 = this.f18018q2;
                drawable3.setBounds((int) rectF5.left, (int) rectF5.top, ceil(rectF5.right), ceil(this.f18018q2.bottom));
                this.f17995a.draw(canvas);
            } else {
                this.f18011k2.setColor(this.f17993V1);
                RectF rectF6 = this.f18018q2;
                float f4 = this.f18003e;
                canvas.drawRoundRect(rectF6, f4, f4, this.f18011k2);
            }
            if (this.f18015n2) {
                this.f18024w2.setColor(Color.parseColor("#AA0000"));
                canvas.drawRect(this.f18007g2, this.f18024w2);
                this.f18024w2.setColor(Color.parseColor("#0000FF"));
                canvas.drawRect(this.f18018q2, this.f18024w2);
                this.f18024w2.setColor(Color.parseColor("#000000"));
                RectF rectF7 = this.f18008h2;
                float f5 = rectF7.left;
                float f6 = this.f18006f2.top;
                canvas.drawLine(f5, f6, rectF7.right, f6, this.f18024w2);
                this.f18024w2.setColor(Color.parseColor("#00CC00"));
                canvas.drawRect(((double) getProgress()) > 0.5d ? this.f18009i2 : this.f18010j2, this.f18024w2);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f17973A2 == null && !TextUtils.isEmpty(this.f18025x2)) {
            this.f17973A2 = makeLayout(this.f18025x2);
        }
        if (this.f17974B2 == null && !TextUtils.isEmpty(this.f18026y2)) {
            this.f17974B2 = makeLayout(this.f18026y2);
        }
        float width = this.f17973A2 != null ? r0.getWidth() : 0.0f;
        float width2 = this.f17974B2 != null ? r2.getWidth() : 0.0f;
        if (width == 0.0f && width2 == 0.0f) {
            this.f17976C2 = 0.0f;
        } else {
            this.f17976C2 = Math.max(width, width2);
        }
        float height = this.f17973A2 != null ? r0.getHeight() : 0.0f;
        float height2 = this.f17974B2 != null ? r2.getHeight() : 0.0f;
        if (height == 0.0f && height2 == 0.0f) {
            this.f17977D2 = 0.0f;
        } else {
            this.f17977D2 = Math.max(height, height2);
        }
        setMeasuredDimension(measureWidth(widthMeasureSpec), measureHeight(heightMeasureSpec));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        SavedState savedState = (SavedState) state;
        setText(savedState.f18028a, savedState.f18029b);
        this.f17983H2 = true;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f17983H2 = false;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f18028a = this.f18025x2;
        savedState.f18029b = this.f18026y2;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (w == oldw && h == oldh) {
            return;
        }
        setup();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eyevue.common.widget.SwitchButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setAnimationDuration(long animationDuration) {
        this.f17979F = animationDuration;
    }

    public void setBackColor(ColorStateList backColor) {
        this.f17999c = backColor;
        if (backColor != null) {
            setBackDrawable(null);
        }
        invalidate();
    }

    public void setBackColorRes(int backColorRes) {
        setBackColor(getColorStateListCompat(getContext(), backColorRes));
    }

    public void setBackDrawable(Drawable backDrawable) {
        this.f17997b = backDrawable;
        this.f18014m2 = backDrawable != null;
        refreshDrawableState();
        this.f17984I2 = false;
        requestLayout();
        invalidate();
    }

    public void setBackDrawableRes(int backDrawableRes) {
        setBackDrawable(getDrawableCompat(getContext(), backDrawableRes));
    }

    public void setBackRadius(float backRadius) {
        this.f18005f = backRadius;
        if (this.f18014m2) {
            return;
        }
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(final boolean checked) {
        if (isChecked() != checked) {
            m4391b(checked);
        }
        if (this.f17983H2) {
            setCheckedImmediatelyNoEvent(checked);
        } else {
            super.setChecked(checked);
        }
    }

    public void setCheckedImmediately(boolean checked) {
        super.setChecked(checked);
        ValueAnimator valueAnimator = this.f18016o2;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f18016o2.cancel();
        }
        setProgress(checked ? 1.0f : 0.0f);
        invalidate();
    }

    public void setCheckedImmediatelyNoEvent(boolean checked) {
        if (this.f17988L2 == null) {
            setCheckedImmediately(checked);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setCheckedImmediately(checked);
        super.setOnCheckedChangeListener(this.f17988L2);
    }

    public void setCheckedNoEvent(final boolean checked) {
        if (this.f17988L2 == null) {
            setChecked(checked);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(checked);
        super.setOnCheckedChangeListener(this.f17988L2);
    }

    public void setDrawDebugRect(boolean drawDebugRect) {
        this.f18015n2 = drawDebugRect;
        invalidate();
    }

    public void setFadeBack(boolean fadeBack) {
        this.f17982H = fadeBack;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.f17988L2 = onCheckedChangeListener;
    }

    public void setText(CharSequence onText, CharSequence offText) {
        this.f18025x2 = onText;
        this.f18026y2 = offText;
        this.f17973A2 = null;
        this.f17974B2 = null;
        this.f17984I2 = false;
        requestLayout();
        invalidate();
    }

    public void setTextAdjust(int textAdjust) {
        this.f17981G2 = textAdjust;
        this.f17984I2 = false;
        requestLayout();
        invalidate();
    }

    public void setTextExtra(int textExtra) {
        this.f17980F2 = textExtra;
        this.f17984I2 = false;
        requestLayout();
        invalidate();
    }

    public void setTextThumbInset(int textThumbInset) {
        this.f17978E2 = textThumbInset;
        this.f17984I2 = false;
        requestLayout();
        invalidate();
    }

    public void setThumbColor(ColorStateList thumbColor) {
        this.f18001d = thumbColor;
        if (thumbColor != null) {
            setThumbDrawable(null);
        }
        invalidate();
    }

    public void setThumbColorRes(int thumbColorRes) {
        setThumbColor(getColorStateListCompat(getContext(), thumbColorRes));
    }

    public void setThumbDrawable(Drawable thumbDrawable) {
        this.f17995a = thumbDrawable;
        this.f18012l2 = thumbDrawable != null;
        refreshDrawableState();
        this.f17984I2 = false;
        requestLayout();
        invalidate();
    }

    public void setThumbDrawableRes(int thumbDrawableRes) {
        setThumbDrawable(getDrawableCompat(getContext(), thumbDrawableRes));
    }

    public void setThumbMargin(RectF thumbMargin) {
        if (thumbMargin == null) {
            setThumbMargin(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            setThumbMargin(thumbMargin.left, thumbMargin.top, thumbMargin.right, thumbMargin.bottom);
        }
    }

    public void setThumbRadius(float thumbRadius) {
        this.f18003e = thumbRadius;
        if (this.f18012l2) {
            return;
        }
        invalidate();
    }

    public void setThumbRangeRatio(float thumbRangeRatio) {
        this.f17975C = thumbRangeRatio;
        this.f17984I2 = false;
        requestLayout();
    }

    public void setThumbSize(int width, int height) {
        this.f17989M = width;
        this.f17991N = height;
        this.f17984I2 = false;
        requestLayout();
    }

    public void setTintColor(int tintColor) {
        this.f17987L = tintColor;
        this.f18001d = wa2.generateThumbColorWithTintColor(tintColor);
        this.f17999c = wa2.generateBackColorWithTintColor(this.f17987L);
        this.f18014m2 = false;
        this.f18012l2 = false;
        refreshDrawableState();
        invalidate();
    }

    public void toggleImmediately() {
        setCheckedImmediately(!isChecked());
    }

    public void toggleImmediatelyNoEvent() {
        if (this.f17988L2 == null) {
            toggleImmediately();
            return;
        }
        super.setOnCheckedChangeListener(null);
        toggleImmediately();
        super.setOnCheckedChangeListener(this.f17988L2);
    }

    public void toggleNoEvent() {
        if (this.f17988L2 == null) {
            toggle();
            return;
        }
        super.setOnCheckedChangeListener(null);
        toggle();
        super.setOnCheckedChangeListener(this.f17988L2);
    }

    public void setThumbMargin(float left, float top, float right, float bottom) {
        this.f18013m.set(left, top, right, bottom);
        this.f17984I2 = false;
        requestLayout();
    }

    public SwitchButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f18015n2 = false;
        this.f17983H2 = false;
        this.f17984I2 = false;
        this.f17985J2 = false;
        init(attrs);
    }

    public SwitchButton(Context context) {
        super(context);
        this.f18015n2 = false;
        this.f17983H2 = false;
        this.f17984I2 = false;
        this.f17985J2 = false;
        init(null);
    }
}
