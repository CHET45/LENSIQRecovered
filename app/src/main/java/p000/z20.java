package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.C0392R;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public class z20 {

    /* JADX INFO: renamed from: l */
    public static final String f103682l = "ACTVAutoSizeHelper";

    /* JADX INFO: renamed from: n */
    public static final int f103684n = 12;

    /* JADX INFO: renamed from: o */
    public static final int f103685o = 112;

    /* JADX INFO: renamed from: p */
    public static final int f103686p = 1;

    /* JADX INFO: renamed from: s */
    public static final float f103689s = -1.0f;

    /* JADX INFO: renamed from: t */
    public static final int f103690t = 1048576;

    /* JADX INFO: renamed from: a */
    public int f103691a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f103692b = false;

    /* JADX INFO: renamed from: c */
    public float f103693c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f103694d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f103695e = -1.0f;

    /* JADX INFO: renamed from: f */
    public int[] f103696f = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f103697g = false;

    /* JADX INFO: renamed from: h */
    public TextPaint f103698h;

    /* JADX INFO: renamed from: i */
    @efb
    public final TextView f103699i;

    /* JADX INFO: renamed from: j */
    public final Context f103700j;

    /* JADX INFO: renamed from: k */
    public final C15927f f103701k;

    /* JADX INFO: renamed from: m */
    public static final RectF f103683m = new RectF();

    /* JADX INFO: renamed from: q */
    @igg({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> f103687q = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: r */
    @igg({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Field> f103688r = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: z20$a */
    @c5e(16)
    public static final class C15922a {
        private C15922a() {
        }

        @efb
        @ih4
        /* JADX INFO: renamed from: a */
        public static StaticLayout m26487a(@efb CharSequence charSequence, @efb Layout.Alignment alignment, int i, @efb TextView textView, @efb TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static int m26488b(@efb TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* JADX INFO: renamed from: z20$b */
    @c5e(18)
    public static final class C15923b {
        private C15923b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static boolean m26489a(@efb View view) {
            return view.isInLayout();
        }
    }

    /* JADX INFO: renamed from: z20$c */
    @c5e(23)
    public static final class C15924c {
        private C15924c() {
        }

        @efb
        @ih4
        /* JADX INFO: renamed from: a */
        public static StaticLayout m26490a(@efb CharSequence charSequence, @efb Layout.Alignment alignment, int i, int i2, @efb TextView textView, @efb TextPaint textPaint, @efb C15927f c15927f) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                c15927f.mo26491a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w(z20.f103682l, "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: renamed from: z20$d */
    @c5e(23)
    public static class C15925d extends C15927f {
        @Override // p000.z20.C15927f
        /* JADX INFO: renamed from: a */
        public void mo26491a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) z20.m26472i(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: renamed from: z20$e */
    @c5e(29)
    public static class C15926e extends C15925d {
        @Override // p000.z20.C15925d, p000.z20.C15927f
        /* JADX INFO: renamed from: a */
        public void mo26491a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // p000.z20.C15927f
        /* JADX INFO: renamed from: b */
        public boolean mo26492b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: renamed from: z20$f */
    public static class C15927f {
        /* JADX INFO: renamed from: a */
        public void mo26491a(StaticLayout.Builder builder, TextView textView) {
        }

        /* JADX INFO: renamed from: b */
        public boolean mo26492b(TextView textView) {
            return ((Boolean) z20.m26472i(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public z20(@efb TextView textView) {
        this.f103699i = textView;
        this.f103700j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f103701k = new C15926e();
        } else {
            this.f103701k = new C15925d();
        }
    }

    private static <T> T accessAndReturnWithDefault(@efb Object obj, @efb String str, @efb T t) {
        try {
            Field textViewField = getTextViewField(str);
            return textViewField == null ? t : (T) textViewField.get(obj);
        } catch (IllegalAccessException e) {
            Log.w(f103682l, "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    private int[] cleanupAutoSizePresetSizes(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    private void clearAutoSizeConfiguration() {
        this.f103691a = 0;
        this.f103694d = -1.0f;
        this.f103695e = -1.0f;
        this.f103693c = -1.0f;
        this.f103696f = new int[0];
        this.f103692b = false;
    }

    private StaticLayout createStaticLayoutForMeasuringPre16(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f103698h, i, alignment, ((Float) accessAndReturnWithDefault(this.f103699i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) accessAndReturnWithDefault(this.f103699i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) accessAndReturnWithDefault(this.f103699i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    private int findLargestTextSizeWhichFits(RectF rectF) {
        int length = this.f103696f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = 1;
        int i2 = length - 1;
        int i3 = 0;
        while (i <= i2) {
            int i4 = (i + i2) / 2;
            if (suggestedSizeFitsInSpace(this.f103696f[i4], rectF)) {
                int i5 = i4 + 1;
                i3 = i;
                i = i5;
            } else {
                i3 = i4 - 1;
                i2 = i3;
            }
        }
        return this.f103696f[i3];
    }

    @hib
    private static Field getTextViewField(@efb String str) {
        try {
            Field declaredField = f103688r.get(str);
            if (declaredField == null && (declaredField = TextView.class.getDeclaredField(str)) != null) {
                declaredField.setAccessible(true);
                f103688r.put(str, declaredField);
            }
            return declaredField;
        } catch (NoSuchFieldException e) {
            Log.w(f103682l, "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    @hib
    private static Method getTextViewMethod(@efb String str) {
        try {
            Method declaredMethod = f103687q.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                f103687q.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e) {
            Log.w(f103682l, "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static <T> T m26472i(@efb Object obj, @efb String str, @efb T t) {
        try {
            return (T) getTextViewMethod(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w(f103682l, "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    private void setRawTextSize(float f) {
        if (f != this.f103699i.getPaint().getTextSize()) {
            this.f103699i.getPaint().setTextSize(f);
            boolean zM26489a = C15923b.m26489a(this.f103699i);
            if (this.f103699i.getLayout() != null) {
                this.f103692b = false;
                try {
                    Method textViewMethod = getTextViewMethod("nullLayouts");
                    if (textViewMethod != null) {
                        textViewMethod.invoke(this.f103699i, null);
                    }
                } catch (Exception e) {
                    Log.w(f103682l, "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zM26489a) {
                    this.f103699i.forceLayout();
                } else {
                    this.f103699i.requestLayout();
                }
                this.f103699i.invalidate();
            }
        }
    }

    private boolean setupAutoSizeText() {
        if (supportsAutoSizeText() && this.f103691a == 1) {
            if (!this.f103697g || this.f103696f.length == 0) {
                int iFloor = ((int) Math.floor((this.f103695e - this.f103694d) / this.f103693c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round(this.f103694d + (i * this.f103693c));
                }
                this.f103696f = cleanupAutoSizePresetSizes(iArr);
            }
            this.f103692b = true;
        } else {
            this.f103692b = false;
        }
        return this.f103692b;
    }

    private void setupAutoSizeUniformPresetSizes(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f103696f = cleanupAutoSizePresetSizes(iArr);
            setupAutoSizeUniformPresetSizesConfiguration();
        }
    }

    private boolean setupAutoSizeUniformPresetSizesConfiguration() {
        boolean z = this.f103696f.length > 0;
        this.f103697g = z;
        if (z) {
            this.f103691a = 1;
            this.f103694d = r0[0];
            this.f103695e = r0[r1 - 1];
            this.f103693c = -1.0f;
        }
        return z;
    }

    private boolean suggestedSizeFitsInSpace(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f103699i.getText();
        TransformationMethod transformationMethod = this.f103699i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f103699i)) != null) {
            text = transformation;
        }
        int iM26488b = C15922a.m26488b(this.f103699i);
        m26480h(i);
        StaticLayout staticLayoutM26474b = m26474b(text, (Layout.Alignment) m26472i(this.f103699i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iM26488b);
        return (iM26488b == -1 || (staticLayoutM26474b.getLineCount() <= iM26488b && staticLayoutM26474b.getLineEnd(staticLayoutM26474b.getLineCount() - 1) == text.length())) && ((float) staticLayoutM26474b.getHeight()) <= rectF.bottom;
    }

    private boolean supportsAutoSizeText() {
        return !(this.f103699i instanceof AppCompatEditText);
    }

    private void validateAndSetAutoSizeTextTypeUniformConfiguration(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f103691a = 1;
        this.f103694d = f;
        this.f103695e = f2;
        this.f103693c = f3;
        this.f103697g = false;
    }

    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: a */
    public void m26473a() {
        if (m26481j()) {
            if (this.f103692b) {
                if (this.f103699i.getMeasuredHeight() <= 0 || this.f103699i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f103701k.mo26492b(this.f103699i) ? 1048576 : (this.f103699i.getMeasuredWidth() - this.f103699i.getTotalPaddingLeft()) - this.f103699i.getTotalPaddingRight();
                int height = (this.f103699i.getHeight() - this.f103699i.getCompoundPaddingBottom()) - this.f103699i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f103683m;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fFindLargestTextSizeWhichFits = findLargestTextSizeWhichFits(rectF);
                        if (fFindLargestTextSizeWhichFits != this.f103699i.getTextSize()) {
                            m26486o(0, fFindLargestTextSizeWhichFits);
                        }
                    } finally {
                    }
                }
            }
            this.f103692b = true;
        }
    }

    @efb
    @fdi
    /* JADX INFO: renamed from: b */
    public StaticLayout m26474b(@efb CharSequence charSequence, @efb Layout.Alignment alignment, int i, int i2) {
        return C15924c.m26490a(charSequence, alignment, i, i2, this.f103699i, this.f103698h, this.f103701k);
    }

    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: c */
    public int m26475c() {
        return Math.round(this.f103695e);
    }

    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: d */
    public int m26476d() {
        return Math.round(this.f103694d);
    }

    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: e */
    public int m26477e() {
        return Math.round(this.f103693c);
    }

    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: f */
    public int[] m26478f() {
        return this.f103696f;
    }

    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: g */
    public int m26479g() {
        return this.f103691a;
    }

    @fdi
    /* JADX INFO: renamed from: h */
    public void m26480h(int i) {
        TextPaint textPaint = this.f103698h;
        if (textPaint == null) {
            this.f103698h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f103698h.set(this.f103699i.getPaint());
        this.f103698h.setTextSize(i);
    }

    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: j */
    public boolean m26481j() {
        return supportsAutoSizeText() && this.f103691a != 0;
    }

    /* JADX INFO: renamed from: k */
    public void m26482k(@hib AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f103700j.obtainStyledAttributes(attributeSet, C0392R.styleable.AppCompatTextView, i, 0);
        TextView textView = this.f103699i;
        o8i.saveAttributeDataForStyleable(textView, textView.getContext(), C0392R.styleable.AppCompatTextView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatTextView_autoSizeTextType)) {
            this.f103691a = typedArrayObtainStyledAttributes.getInt(C0392R.styleable.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes.getDimension(C0392R.styleable.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes.getDimension(C0392R.styleable.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes.getDimension(C0392R.styleable.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatTextView_autoSizePresetSizes) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(C0392R.styleable.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            setupAutoSizeUniformPresetSizes(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!supportsAutoSizeText()) {
            this.f103691a = 0;
            return;
        }
        if (this.f103691a == 1) {
            if (!this.f103697g) {
                DisplayMetrics displayMetrics = this.f103700j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                validateAndSetAutoSizeTextTypeUniformConfiguration(dimension2, dimension3, dimension);
            }
            setupAutoSizeText();
        }
    }

    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: l */
    public void m26483l(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (supportsAutoSizeText()) {
            DisplayMetrics displayMetrics = this.f103700j.getResources().getDisplayMetrics();
            validateAndSetAutoSizeTextTypeUniformConfiguration(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (setupAutoSizeText()) {
                m26473a();
            }
        }
    }

    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: m */
    public void m26484m(@efb int[] iArr, int i) throws IllegalArgumentException {
        if (supportsAutoSizeText()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f103700j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f103696f = cleanupAutoSizePresetSizes(iArrCopyOf);
                if (!setupAutoSizeUniformPresetSizesConfiguration()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f103697g = false;
            }
            if (setupAutoSizeText()) {
                m26473a();
            }
        }
    }

    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: n */
    public void m26485n(int i) {
        if (supportsAutoSizeText()) {
            if (i == 0) {
                clearAutoSizeConfiguration();
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            DisplayMetrics displayMetrics = this.f103700j.getResources().getDisplayMetrics();
            validateAndSetAutoSizeTextTypeUniformConfiguration(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (setupAutoSizeText()) {
                m26473a();
            }
        }
    }

    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: o */
    public void m26486o(int i, float f) {
        Context context = this.f103700j;
        setRawTextSize(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
