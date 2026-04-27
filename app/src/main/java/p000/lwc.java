package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPlaceholderSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderSpan.android.kt\nandroidx/compose/ui/text/android/style/PlaceholderSpan\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
@e0g(parameters = 0)
public final class lwc extends ReplacementSpan {

    /* JADX INFO: renamed from: L */
    @yfb
    public static final C9012a f59073L = new C9012a(null);

    /* JADX INFO: renamed from: M */
    public static final int f59074M = 8;

    /* JADX INFO: renamed from: M1 */
    public static final int f59075M1 = 5;

    /* JADX INFO: renamed from: N */
    public static final int f59076N = 0;

    /* JADX INFO: renamed from: Q */
    public static final int f59077Q = 1;

    /* JADX INFO: renamed from: V1 */
    public static final int f59078V1 = 6;

    /* JADX INFO: renamed from: X */
    public static final int f59079X = 2;

    /* JADX INFO: renamed from: Y */
    public static final int f59080Y = 3;

    /* JADX INFO: renamed from: Z */
    public static final int f59081Z = 4;

    /* JADX INFO: renamed from: Z1 */
    public static final int f59082Z1 = 0;

    /* JADX INFO: renamed from: a2 */
    public static final int f59083a2 = 1;

    /* JADX INFO: renamed from: b2 */
    public static final int f59084b2 = 2;

    /* JADX INFO: renamed from: C */
    public int f59085C;

    /* JADX INFO: renamed from: F */
    public int f59086F;

    /* JADX INFO: renamed from: H */
    public boolean f59087H;

    /* JADX INFO: renamed from: a */
    public final float f59088a;

    /* JADX INFO: renamed from: b */
    public final int f59089b;

    /* JADX INFO: renamed from: c */
    public final float f59090c;

    /* JADX INFO: renamed from: d */
    public final int f59091d;

    /* JADX INFO: renamed from: e */
    public final float f59092e;

    /* JADX INFO: renamed from: f */
    public final int f59093f;

    /* JADX INFO: renamed from: m */
    public Paint.FontMetricsInt f59094m;

    /* JADX INFO: renamed from: lwc$a */
    public static final class C9012a {

        /* JADX INFO: renamed from: lwc$a$a */
        @i8e(EnumC11189pz.f72536a)
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        /* JADX INFO: renamed from: lwc$a$b */
        @i8e(EnumC11189pz.f72536a)
        @Retention(RetentionPolicy.SOURCE)
        public @interface b {
        }

        public /* synthetic */ C9012a(jt3 jt3Var) {
            this();
        }

        private C9012a() {
        }
    }

    public lwc(float f, int i, float f2, int i2, float f3, int i3) {
        this.f59088a = f;
        this.f59089b = i;
        this.f59090c = f2;
        this.f59091d = i2;
        this.f59092e = f3;
        this.f59093f = i3;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@yfb Canvas canvas, @gib CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @yfb Paint paint) {
    }

    @yfb
    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt fontMetricsInt = this.f59094m;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        md8.throwUninitializedPropertyAccessException("fontMetrics");
        return null;
    }

    public final int getHeightPx() {
        if (this.f59087H) {
            return this.f59086F;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    @igg({"DocumentExceptions"})
    public int getSize(@yfb Paint paint, @gib CharSequence charSequence, int i, int i2, @gib Paint.FontMetricsInt fontMetricsInt) {
        float f;
        int iCeilToInt;
        this.f59087H = true;
        float textSize = paint.getTextSize();
        this.f59094m = paint.getFontMetricsInt();
        if (getFontMetrics().descent <= getFontMetrics().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        int i3 = this.f59089b;
        if (i3 == 0) {
            f = this.f59088a * this.f59092e;
        } else {
            if (i3 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f = this.f59088a * textSize;
        }
        this.f59085C = mwc.ceilToInt(f);
        int i4 = this.f59091d;
        if (i4 == 0) {
            iCeilToInt = mwc.ceilToInt(this.f59090c * this.f59092e);
        } else {
            if (i4 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            iCeilToInt = mwc.ceilToInt(this.f59090c * textSize);
        }
        this.f59086F = iCeilToInt;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = getFontMetrics().ascent;
            fontMetricsInt.descent = getFontMetrics().descent;
            fontMetricsInt.leading = getFontMetrics().leading;
            switch (this.f59093f) {
                case 0:
                    if (fontMetricsInt.ascent > (-getHeightPx())) {
                        fontMetricsInt.ascent = -getHeightPx();
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + getHeightPx() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + getHeightPx();
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - getHeightPx()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - getHeightPx();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < getHeightPx()) {
                        int heightPx = fontMetricsInt.ascent - ((getHeightPx() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = heightPx;
                        fontMetricsInt.descent = heightPx + getHeightPx();
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
            fontMetricsInt.top = Math.min(getFontMetrics().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(getFontMetrics().bottom, fontMetricsInt.descent);
        }
        return getWidthPx();
    }

    public final int getVerticalAlign() {
        return this.f59093f;
    }

    public final int getWidthPx() {
        if (this.f59087H) {
            return this.f59085C;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }
}
