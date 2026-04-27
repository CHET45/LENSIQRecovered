package p000;

import android.os.Build;
import android.os.Trace;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public class a7d implements Spannable {

    /* JADX INFO: renamed from: e */
    public static final char f554e = '\n';

    /* JADX INFO: renamed from: f */
    public static final Object f555f = new Object();

    /* JADX INFO: renamed from: m */
    @efb
    @xc7("sLock")
    public static Executor f556m;

    /* JADX INFO: renamed from: a */
    @efb
    public final Spannable f557a;

    /* JADX INFO: renamed from: b */
    @efb
    public final C0081b f558b;

    /* JADX INFO: renamed from: c */
    @efb
    public final int[] f559c;

    /* JADX INFO: renamed from: d */
    @hib
    public final PrecomputedText f560d;

    /* JADX INFO: renamed from: a7d$a */
    @c5e(28)
    public static class C0080a {
        private C0080a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Spannable m175a(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }

    /* JADX INFO: renamed from: a7d$c */
    public static class C0082c extends FutureTask<a7d> {

        /* JADX INFO: renamed from: a7d$c$a */
        public static class a implements Callable<a7d> {

            /* JADX INFO: renamed from: a */
            public C0081b f570a;

            /* JADX INFO: renamed from: b */
            public CharSequence f571b;

            public a(@efb C0081b c0081b, @efb CharSequence charSequence) {
                this.f570a = c0081b;
                this.f571b = charSequence;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public a7d call() throws Exception {
                return a7d.create(this.f571b, this.f570a);
            }
        }

        public C0082c(@efb C0081b c0081b, @efb CharSequence charSequence) {
            super(new a(c0081b, charSequence));
        }
    }

    private a7d(@efb CharSequence charSequence, @efb C0081b c0081b, @efb int[] iArr) {
        this.f557a = new SpannableString(charSequence);
        this.f558b = c0081b;
        this.f559c = iArr;
        this.f560d = null;
    }

    @igg({"WrongConstant"})
    public static a7d create(@efb CharSequence charSequence, @efb C0081b c0081b) {
        PrecomputedText.Params params;
        z7d.checkNotNull(charSequence);
        z7d.checkNotNull(c0081b);
        try {
            Trace.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = c0081b.f565e) != null) {
                return new a7d(PrecomputedText.create(charSequence, params), c0081b);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int iIndexOf = TextUtils.indexOf(charSequence, '\n', i, length);
                i = iIndexOf < 0 ? length : iIndexOf + 1;
                arrayList.add(Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), c0081b.getTextPaint(), Integer.MAX_VALUE).setBreakStrategy(c0081b.getBreakStrategy()).setHyphenationFrequency(c0081b.getHyphenationFrequency()).setTextDirection(c0081b.getTextDirection()).build();
            return new a7d(charSequence, c0081b, iArr);
        } finally {
            Trace.endSection();
        }
    }

    @erh
    public static Future<a7d> getTextFuture(@efb CharSequence charSequence, @efb C0081b c0081b, @hib Executor executor) {
        C0082c c0082c = new C0082c(c0081b, charSequence);
        if (executor == null) {
            synchronized (f555f) {
                try {
                    if (f556m == null) {
                        f556m = Executors.newFixedThreadPool(1);
                    }
                    executor = f556m;
                } finally {
                }
            }
        }
        executor.execute(c0082c);
        return c0082c;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f557a.charAt(i);
    }

    @h78(from = 0)
    public int getParagraphCount() {
        return Build.VERSION.SDK_INT >= 29 ? this.f560d.getParagraphCount() : this.f559c.length;
    }

    @h78(from = 0)
    public int getParagraphEnd(@h78(from = 0) int i) {
        z7d.checkArgumentInRange(i, 0, getParagraphCount(), "paraIndex");
        return Build.VERSION.SDK_INT >= 29 ? this.f560d.getParagraphEnd(i) : this.f559c[i];
    }

    @h78(from = 0)
    public int getParagraphStart(@h78(from = 0) int i) {
        z7d.checkArgumentInRange(i, 0, getParagraphCount(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f560d.getParagraphStart(i);
        }
        if (i == 0) {
            return 0;
        }
        return this.f559c[i - 1];
    }

    @efb
    public C0081b getParams() {
        return this.f558b;
    }

    @c5e(28)
    @hib
    @p7e({p7e.EnumC10826a.f69936c})
    public PrecomputedText getPrecomputedText() {
        if (s6d.m21761a(this.f557a)) {
            return t6d.m22395a(this.f557a);
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f557a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f557a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f557a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f560d.getSpans(i, i2, cls) : (T[]) this.f557a.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f557a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f557a.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f560d.removeSpan(obj);
        } else {
            this.f557a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f560d.setSpan(obj, i, i2, i3);
        } else {
            this.f557a.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f557a.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @efb
    public String toString() {
        return this.f557a.toString();
    }

    @c5e(28)
    private a7d(@efb PrecomputedText precomputedText, @efb C0081b c0081b) {
        this.f557a = C0080a.m175a(precomputedText);
        this.f558b = c0081b;
        this.f559c = null;
        this.f560d = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    /* JADX INFO: renamed from: a7d$b */
    public static final class C0081b {

        /* JADX INFO: renamed from: a */
        @efb
        public final TextPaint f561a;

        /* JADX INFO: renamed from: b */
        @hib
        public final TextDirectionHeuristic f562b;

        /* JADX INFO: renamed from: c */
        public final int f563c;

        /* JADX INFO: renamed from: d */
        public final int f564d;

        /* JADX INFO: renamed from: e */
        public final PrecomputedText.Params f565e;

        /* JADX INFO: renamed from: a7d$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            @efb
            public final TextPaint f566a;

            /* JADX INFO: renamed from: c */
            public int f568c = 1;

            /* JADX INFO: renamed from: d */
            public int f569d = 1;

            /* JADX INFO: renamed from: b */
            public TextDirectionHeuristic f567b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public a(@efb TextPaint textPaint) {
                this.f566a = textPaint;
            }

            @efb
            public C0081b build() {
                return new C0081b(this.f566a, this.f567b, this.f568c, this.f569d);
            }

            @c5e(23)
            public a setBreakStrategy(int i) {
                this.f568c = i;
                return this;
            }

            @c5e(23)
            public a setHyphenationFrequency(int i) {
                this.f569d = i;
                return this;
            }

            public a setTextDirection(@efb TextDirectionHeuristic textDirectionHeuristic) {
                this.f567b = textDirectionHeuristic;
                return this;
            }
        }

        public C0081b(@efb TextPaint textPaint, @efb TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f565e = j7d.m13779a(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f565e = null;
            }
            this.f561a = textPaint;
            this.f562b = textDirectionHeuristic;
            this.f563c = i;
            this.f564d = i2;
        }

        public boolean equals(@hib Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0081b)) {
                return false;
            }
            C0081b c0081b = (C0081b) obj;
            return equalsWithoutTextDirection(c0081b) && this.f562b == c0081b.getTextDirection();
        }

        @p7e({p7e.EnumC10826a.f69936c})
        public boolean equalsWithoutTextDirection(@efb C0081b c0081b) {
            if (this.f563c == c0081b.getBreakStrategy() && this.f564d == c0081b.getHyphenationFrequency() && this.f561a.getTextSize() == c0081b.getTextPaint().getTextSize() && this.f561a.getTextScaleX() == c0081b.getTextPaint().getTextScaleX() && this.f561a.getTextSkewX() == c0081b.getTextPaint().getTextSkewX() && this.f561a.getLetterSpacing() == c0081b.getTextPaint().getLetterSpacing() && TextUtils.equals(this.f561a.getFontFeatureSettings(), c0081b.getTextPaint().getFontFeatureSettings()) && this.f561a.getFlags() == c0081b.getTextPaint().getFlags() && this.f561a.getTextLocales().equals(c0081b.getTextPaint().getTextLocales())) {
                return this.f561a.getTypeface() == null ? c0081b.getTextPaint().getTypeface() == null : this.f561a.getTypeface().equals(c0081b.getTextPaint().getTypeface());
            }
            return false;
        }

        @c5e(23)
        public int getBreakStrategy() {
            return this.f563c;
        }

        @c5e(23)
        public int getHyphenationFrequency() {
            return this.f564d;
        }

        @hib
        public TextDirectionHeuristic getTextDirection() {
            return this.f562b;
        }

        @efb
        public TextPaint getTextPaint() {
            return this.f561a;
        }

        public int hashCode() {
            return pkb.hash(Float.valueOf(this.f561a.getTextSize()), Float.valueOf(this.f561a.getTextScaleX()), Float.valueOf(this.f561a.getTextSkewX()), Float.valueOf(this.f561a.getLetterSpacing()), Integer.valueOf(this.f561a.getFlags()), this.f561a.getTextLocales(), this.f561a.getTypeface(), Boolean.valueOf(this.f561a.isElegantTextHeight()), this.f562b, Integer.valueOf(this.f563c), Integer.valueOf(this.f564d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f561a.getTextSize());
            sb.append(", textScaleX=" + this.f561a.getTextScaleX());
            sb.append(", textSkewX=" + this.f561a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f561a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f561a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f561a.getTextLocales());
            sb.append(", typeface=" + this.f561a.getTypeface());
            sb.append(", variationSettings=" + this.f561a.getFontVariationSettings());
            sb.append(", textDir=" + this.f562b);
            sb.append(", breakStrategy=" + this.f563c);
            sb.append(", hyphenationFrequency=" + this.f564d);
            sb.append("}");
            return sb.toString();
        }

        @c5e(28)
        public C0081b(@efb PrecomputedText.Params params) {
            this.f561a = params.getTextPaint();
            this.f562b = params.getTextDirection();
            this.f563c = params.getBreakStrategy();
            this.f564d = params.getHyphenationFrequency();
            this.f565e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
