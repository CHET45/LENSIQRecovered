package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.C1038f;
import com.blankj.utilcode.util.C2473f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(19)
@f00
public class lnh {

    /* JADX INFO: renamed from: d */
    @p7e({p7e.EnumC10826a.f69934a})
    public static final int f58334d = 0;

    /* JADX INFO: renamed from: e */
    @p7e({p7e.EnumC10826a.f69934a})
    public static final int f58335e = 1;

    /* JADX INFO: renamed from: f */
    @p7e({p7e.EnumC10826a.f69934a})
    public static final int f58336f = 2;

    /* JADX INFO: renamed from: g */
    public static final ThreadLocal<bua> f58337g = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public final int f58338a;

    /* JADX INFO: renamed from: b */
    @efb
    public final C1038f f58339b;

    /* JADX INFO: renamed from: c */
    public volatile int f58340c = 0;

    /* JADX INFO: renamed from: lnh$a */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69935b})
    public @interface InterfaceC8909a {
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public lnh(@efb C1038f c1038f, @h78(from = 0) int i) {
        this.f58339b = c1038f;
        this.f58338a = i;
    }

    private bua getMetadataItem() {
        ThreadLocal<bua> threadLocal = f58337g;
        bua buaVar = threadLocal.get();
        if (buaVar == null) {
            buaVar = new bua();
            threadLocal.set(buaVar);
        }
        this.f58339b.getMetadataList().list(buaVar, this.f58338a);
        return buaVar;
    }

    public void draw(@efb Canvas canvas, float f, float f2, @efb Paint paint) {
        Typeface typefaceM1608c = this.f58339b.m1608c();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceM1608c);
        canvas.drawText(this.f58339b.getEmojiCharArray(), this.f58338a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    public int getCodepointAt(int i) {
        return getMetadataItem().codepoints(i);
    }

    public int getCodepointsLength() {
        return getMetadataItem().codepointsLength();
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public short getCompatAdded() {
        return getMetadataItem().compatAdded();
    }

    @igg({"KotlinPropertyAccess"})
    @p7e({p7e.EnumC10826a.f69934a})
    public int getHasGlyph() {
        return this.f58340c & 3;
    }

    public int getHeight() {
        return getMetadataItem().height();
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public int getId() {
        return getMetadataItem().m3424id();
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public short getSdkAdded() {
        return getMetadataItem().sdkAdded();
    }

    @efb
    public Typeface getTypeface() {
        return this.f58339b.m1608c();
    }

    public int getWidth() {
        return getMetadataItem().width();
    }

    public boolean isDefaultEmoji() {
        return getMetadataItem().emojiStyle();
    }

    public boolean isPreferredSystemRender() {
        return (this.f58340c & 4) > 0;
    }

    @p7e({p7e.EnumC10826a.f69938e})
    public void resetHasGlyphCache() {
        if (isPreferredSystemRender()) {
            this.f58340c = 4;
        } else {
            this.f58340c = 0;
        }
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public void setExclusion(boolean z) {
        int hasGlyph = getHasGlyph();
        if (z) {
            this.f58340c = hasGlyph | 4;
        } else {
            this.f58340c = hasGlyph;
        }
    }

    @igg({"KotlinPropertyAccess"})
    @p7e({p7e.EnumC10826a.f69934a})
    public void setHasGlyph(boolean z) {
        int i = this.f58340c & 4;
        this.f58340c = z ? i | 2 : i | 1;
    }

    @efb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(getId()));
        sb.append(", codepoints:");
        int codepointsLength = getCodepointsLength();
        for (int i = 0; i < codepointsLength; i++) {
            sb.append(Integer.toHexString(getCodepointAt(i)));
            sb.append(C2473f.f17566z);
        }
        return sb.toString();
    }
}
