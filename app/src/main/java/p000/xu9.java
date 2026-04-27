package p000;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextPaint;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class xu9 {

    /* JADX INFO: renamed from: A */
    public static final int f99365A = 75;

    /* JADX INFO: renamed from: B */
    public static final float[] f99366B = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};

    /* JADX INFO: renamed from: C */
    public static final int f99367C = 25;

    /* JADX INFO: renamed from: x */
    public static final int f99368x = 25;

    /* JADX INFO: renamed from: y */
    public static final int f99369y = 25;

    /* JADX INFO: renamed from: z */
    public static final float f99370z = 0.87f;

    /* JADX INFO: renamed from: a */
    public final int f99371a;

    /* JADX INFO: renamed from: b */
    public final boolean f99372b;

    /* JADX INFO: renamed from: c */
    public final int f99373c;

    /* JADX INFO: renamed from: d */
    public final int f99374d;

    /* JADX INFO: renamed from: e */
    public final int f99375e;

    /* JADX INFO: renamed from: f */
    public final int f99376f;

    /* JADX INFO: renamed from: g */
    public final int f99377g;

    /* JADX INFO: renamed from: h */
    public final int f99378h;

    /* JADX INFO: renamed from: i */
    public final int f99379i;

    /* JADX INFO: renamed from: j */
    public final int f99380j;

    /* JADX INFO: renamed from: k */
    public final int f99381k;

    /* JADX INFO: renamed from: l */
    public final int f99382l;

    /* JADX INFO: renamed from: m */
    public final int f99383m;

    /* JADX INFO: renamed from: n */
    public final Typeface f99384n;

    /* JADX INFO: renamed from: o */
    public final Typeface f99385o;

    /* JADX INFO: renamed from: p */
    public final int f99386p;

    /* JADX INFO: renamed from: q */
    public final int f99387q;

    /* JADX INFO: renamed from: r */
    public final int f99388r;

    /* JADX INFO: renamed from: s */
    public final int f99389s;

    /* JADX INFO: renamed from: t */
    public final Typeface f99390t;

    /* JADX INFO: renamed from: u */
    public final float[] f99391u;

    /* JADX INFO: renamed from: v */
    public final int f99392v;

    /* JADX INFO: renamed from: w */
    public final int f99393w;

    public xu9(@efb C15304a c15304a) {
        this.f99371a = c15304a.f99394a;
        this.f99372b = c15304a.f99395b;
        this.f99373c = c15304a.f99396c;
        this.f99374d = c15304a.f99397d;
        this.f99375e = c15304a.f99398e;
        this.f99376f = c15304a.f99399f;
        this.f99377g = c15304a.f99400g;
        this.f99378h = c15304a.f99401h;
        this.f99379i = c15304a.f99402i;
        this.f99380j = c15304a.f99403j;
        this.f99381k = c15304a.f99404k;
        this.f99382l = c15304a.f99405l;
        this.f99383m = c15304a.f99406m;
        this.f99384n = c15304a.f99407n;
        this.f99385o = c15304a.f99408o;
        this.f99386p = c15304a.f99409p;
        this.f99387q = c15304a.f99410q;
        this.f99388r = c15304a.f99411r;
        this.f99389s = c15304a.f99412s;
        this.f99390t = c15304a.f99413t;
        this.f99391u = c15304a.f99414u;
        this.f99392v = c15304a.f99415v;
        this.f99393w = c15304a.f99416w;
    }

    @efb
    public static C15304a builder(@efb xu9 xu9Var) {
        return new C15304a(xu9Var);
    }

    @efb
    public static C15304a builderWithDefaults(@efb Context context) {
        cd4 cd4VarCreate = cd4.create(context);
        return new C15304a().codeBlockMargin(cd4VarCreate.toPx(8)).blockMargin(cd4VarCreate.toPx(24)).blockQuoteWidth(cd4VarCreate.toPx(4)).bulletListItemStrokeWidth(cd4VarCreate.toPx(1)).headingBreakHeight(cd4VarCreate.toPx(1)).thematicBreakHeight(cd4VarCreate.toPx(4));
    }

    @efb
    public static xu9 create(@efb Context context) {
        return builderWithDefaults(context).build();
    }

    @efb
    public static C15304a emptyBuilder() {
        return new C15304a();
    }

    public void applyBlockQuoteStyle(@efb Paint paint) {
        int iApplyAlpha = this.f99375e;
        if (iApplyAlpha == 0) {
            iApplyAlpha = ya2.applyAlpha(paint.getColor(), 25);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iApplyAlpha);
    }

    public void applyCodeBlockTextStyle(@efb Paint paint) {
        int i = this.f99380j;
        if (i == 0) {
            i = this.f99379i;
        }
        if (i != 0) {
            paint.setColor(i);
        }
        Typeface typeface = this.f99385o;
        if (typeface == null) {
            typeface = this.f99384n;
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i2 = this.f99387q;
            if (i2 <= 0) {
                i2 = this.f99386p;
            }
            if (i2 > 0) {
                paint.setTextSize(i2);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i3 = this.f99387q;
        if (i3 <= 0) {
            i3 = this.f99386p;
        }
        if (i3 > 0) {
            paint.setTextSize(i3);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void applyCodeTextStyle(@efb Paint paint) {
        int i = this.f99379i;
        if (i != 0) {
            paint.setColor(i);
        }
        Typeface typeface = this.f99384n;
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i2 = this.f99386p;
            if (i2 > 0) {
                paint.setTextSize(i2);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i3 = this.f99386p;
        if (i3 > 0) {
            paint.setTextSize(i3);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void applyHeadingBreakStyle(@efb Paint paint) {
        int iApplyAlpha = this.f99389s;
        if (iApplyAlpha == 0) {
            iApplyAlpha = ya2.applyAlpha(paint.getColor(), 75);
        }
        paint.setColor(iApplyAlpha);
        paint.setStyle(Paint.Style.FILL);
        int i = this.f99388r;
        if (i >= 0) {
            paint.setStrokeWidth(i);
        }
    }

    public void applyHeadingTextStyle(@efb Paint paint, @h78(from = 1, m12174to = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) int i) {
        Typeface typeface = this.f99390t;
        if (typeface == null) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(typeface);
        }
        float[] fArr = this.f99391u;
        if (fArr == null) {
            fArr = f99366B;
        }
        if (fArr == null || fArr.length < i) {
            throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", Integer.valueOf(i), Arrays.toString(fArr)));
        }
        paint.setTextSize(paint.getTextSize() * fArr[i - 1]);
    }

    public void applyLinkStyle(@efb TextPaint textPaint) {
        textPaint.setUnderlineText(this.f99372b);
        int i = this.f99371a;
        if (i != 0) {
            textPaint.setColor(i);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    public void applyListItemStyle(@efb Paint paint) {
        int color = this.f99376f;
        if (color == 0) {
            color = paint.getColor();
        }
        paint.setColor(color);
        int i = this.f99377g;
        if (i != 0) {
            paint.setStrokeWidth(i);
        }
    }

    public void applyThematicBreakStyle(@efb Paint paint) {
        int iApplyAlpha = this.f99392v;
        if (iApplyAlpha == 0) {
            iApplyAlpha = ya2.applyAlpha(paint.getColor(), 25);
        }
        paint.setColor(iApplyAlpha);
        paint.setStyle(Paint.Style.FILL);
        int i = this.f99393w;
        if (i >= 0) {
            paint.setStrokeWidth(i);
        }
    }

    public int getBlockMargin() {
        return this.f99373c;
    }

    public int getBlockQuoteWidth() {
        int i = this.f99374d;
        return i == 0 ? (int) ((this.f99373c * 0.25f) + 0.5f) : i;
    }

    public int getBulletWidth(int i) {
        int iMin = Math.min(this.f99373c, i) / 2;
        int i2 = this.f99378h;
        return (i2 == 0 || i2 > iMin) ? iMin : i2;
    }

    public int getCodeBackgroundColor(@efb Paint paint) {
        int i = this.f99381k;
        return i != 0 ? i : ya2.applyAlpha(paint.getColor(), 25);
    }

    public int getCodeBlockBackgroundColor(@efb Paint paint) {
        int i = this.f99382l;
        if (i == 0) {
            i = this.f99381k;
        }
        return i != 0 ? i : ya2.applyAlpha(paint.getColor(), 25);
    }

    public int getCodeBlockMargin() {
        return this.f99383m;
    }

    /* JADX INFO: renamed from: xu9$a */
    public static class C15304a {

        /* JADX INFO: renamed from: a */
        public int f99394a;

        /* JADX INFO: renamed from: b */
        public boolean f99395b;

        /* JADX INFO: renamed from: c */
        public int f99396c;

        /* JADX INFO: renamed from: d */
        public int f99397d;

        /* JADX INFO: renamed from: e */
        public int f99398e;

        /* JADX INFO: renamed from: f */
        public int f99399f;

        /* JADX INFO: renamed from: g */
        public int f99400g;

        /* JADX INFO: renamed from: h */
        public int f99401h;

        /* JADX INFO: renamed from: i */
        public int f99402i;

        /* JADX INFO: renamed from: j */
        public int f99403j;

        /* JADX INFO: renamed from: k */
        public int f99404k;

        /* JADX INFO: renamed from: l */
        public int f99405l;

        /* JADX INFO: renamed from: m */
        public int f99406m;

        /* JADX INFO: renamed from: n */
        public Typeface f99407n;

        /* JADX INFO: renamed from: o */
        public Typeface f99408o;

        /* JADX INFO: renamed from: p */
        public int f99409p;

        /* JADX INFO: renamed from: q */
        public int f99410q;

        /* JADX INFO: renamed from: r */
        public int f99411r;

        /* JADX INFO: renamed from: s */
        public int f99412s;

        /* JADX INFO: renamed from: t */
        public Typeface f99413t;

        /* JADX INFO: renamed from: u */
        public float[] f99414u;

        /* JADX INFO: renamed from: v */
        public int f99415v;

        /* JADX INFO: renamed from: w */
        public int f99416w;

        public C15304a() {
            this.f99395b = true;
            this.f99411r = -1;
            this.f99416w = -1;
        }

        @efb
        public C15304a blockMargin(@fkd int i) {
            this.f99396c = i;
            return this;
        }

        @efb
        public C15304a blockQuoteColor(@g92 int i) {
            this.f99398e = i;
            return this;
        }

        @efb
        public C15304a blockQuoteWidth(@fkd int i) {
            this.f99397d = i;
            return this;
        }

        @efb
        public xu9 build() {
            return new xu9(this);
        }

        @efb
        public C15304a bulletListItemStrokeWidth(@fkd int i) {
            this.f99400g = i;
            return this;
        }

        @efb
        public C15304a bulletWidth(@fkd int i) {
            this.f99401h = i;
            return this;
        }

        @efb
        public C15304a codeBackgroundColor(@g92 int i) {
            this.f99404k = i;
            return this;
        }

        @efb
        public C15304a codeBlockBackgroundColor(@g92 int i) {
            this.f99405l = i;
            return this;
        }

        @efb
        public C15304a codeBlockMargin(@fkd int i) {
            this.f99406m = i;
            return this;
        }

        @efb
        public C15304a codeBlockTextColor(@g92 int i) {
            this.f99403j = i;
            return this;
        }

        @efb
        public C15304a codeBlockTextSize(@fkd int i) {
            this.f99410q = i;
            return this;
        }

        @efb
        public C15304a codeBlockTypeface(@efb Typeface typeface) {
            this.f99408o = typeface;
            return this;
        }

        @efb
        public C15304a codeTextColor(@g92 int i) {
            this.f99402i = i;
            return this;
        }

        @efb
        public C15304a codeTextSize(@fkd int i) {
            this.f99409p = i;
            return this;
        }

        @efb
        public C15304a codeTypeface(@efb Typeface typeface) {
            this.f99407n = typeface;
            return this;
        }

        @efb
        public C15304a headingBreakColor(@g92 int i) {
            this.f99412s = i;
            return this;
        }

        @efb
        public C15304a headingBreakHeight(@fkd int i) {
            this.f99411r = i;
            return this;
        }

        @efb
        public C15304a headingTextSizeMultipliers(@efb @zpf(MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) float[] fArr) {
            this.f99414u = fArr;
            return this;
        }

        @efb
        public C15304a headingTypeface(@efb Typeface typeface) {
            this.f99413t = typeface;
            return this;
        }

        @efb
        public C15304a isLinkUnderlined(boolean z) {
            this.f99395b = z;
            return this;
        }

        @efb
        public C15304a linkColor(@g92 int i) {
            this.f99394a = i;
            return this;
        }

        @efb
        public C15304a listItemColor(@g92 int i) {
            this.f99399f = i;
            return this;
        }

        @efb
        public C15304a thematicBreakColor(@g92 int i) {
            this.f99415v = i;
            return this;
        }

        @efb
        public C15304a thematicBreakHeight(@fkd int i) {
            this.f99416w = i;
            return this;
        }

        public C15304a(@efb xu9 xu9Var) {
            this.f99395b = true;
            this.f99411r = -1;
            this.f99416w = -1;
            this.f99394a = xu9Var.f99371a;
            this.f99395b = xu9Var.f99372b;
            this.f99396c = xu9Var.f99373c;
            this.f99397d = xu9Var.f99374d;
            this.f99398e = xu9Var.f99375e;
            this.f99399f = xu9Var.f99376f;
            this.f99400g = xu9Var.f99377g;
            this.f99401h = xu9Var.f99378h;
            this.f99402i = xu9Var.f99379i;
            this.f99403j = xu9Var.f99380j;
            this.f99404k = xu9Var.f99381k;
            this.f99405l = xu9Var.f99382l;
            this.f99406m = xu9Var.f99383m;
            this.f99407n = xu9Var.f99384n;
            this.f99409p = xu9Var.f99386p;
            this.f99411r = xu9Var.f99388r;
            this.f99412s = xu9Var.f99389s;
            this.f99413t = xu9Var.f99390t;
            this.f99414u = xu9Var.f99391u;
            this.f99415v = xu9Var.f99392v;
            this.f99416w = xu9Var.f99393w;
        }
    }

    public void applyLinkStyle(@efb Paint paint) {
        paint.setUnderlineText(this.f99372b);
        int i = this.f99371a;
        if (i != 0) {
            paint.setColor(i);
        } else if (paint instanceof TextPaint) {
            paint.setColor(((TextPaint) paint).linkColor);
        }
    }
}
