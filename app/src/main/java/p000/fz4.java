package p000;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(19)
public abstract class fz4 extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    @efb
    public final lnh f38057b;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f38056a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public short f38058c = -1;

    /* JADX INFO: renamed from: d */
    public short f38059d = -1;

    /* JADX INFO: renamed from: e */
    public float f38060e = 1.0f;

    @p7e({p7e.EnumC10826a.f69934a})
    public fz4(@efb lnh lnhVar) {
        z7d.checkNotNull(lnhVar, "rasterizer cannot be null");
        this.f38057b = lnhVar;
    }

    @p7e({p7e.EnumC10826a.f69934a})
    /* JADX INFO: renamed from: a */
    public final float m11236a() {
        return this.f38060e;
    }

    @p7e({p7e.EnumC10826a.f69934a})
    /* JADX INFO: renamed from: b */
    public final int m11237b() {
        return this.f38058c;
    }

    @p7e({p7e.EnumC10826a.f69938e})
    public final int getHeight() {
        return this.f38059d;
    }

    @p7e({p7e.EnumC10826a.f69938e})
    public final int getId() {
        return getTypefaceRasterizer().getId();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@efb Paint paint, @igg({"UnknownNullness"}) CharSequence charSequence, int i, int i2, @hib Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f38056a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f38056a;
        this.f38060e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f38057b.getHeight();
        this.f38059d = (short) (this.f38057b.getHeight() * this.f38060e);
        short width = (short) (this.f38057b.getWidth() * this.f38060e);
        this.f38058c = width;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f38056a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return width;
    }

    @efb
    public final lnh getTypefaceRasterizer() {
        return this.f38057b;
    }
}
