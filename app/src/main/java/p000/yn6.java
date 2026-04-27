package p000;

import android.graphics.Typeface;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class yn6 {

    /* JADX INFO: renamed from: a */
    public final String f102333a;

    /* JADX INFO: renamed from: b */
    public final String f102334b;

    /* JADX INFO: renamed from: c */
    public final String f102335c;

    /* JADX INFO: renamed from: d */
    public final float f102336d;

    /* JADX INFO: renamed from: e */
    @hib
    public Typeface f102337e;

    public yn6(String str, String str2, String str3, float f) {
        this.f102333a = str;
        this.f102334b = str2;
        this.f102335c = str3;
        this.f102336d = f;
    }

    /* JADX INFO: renamed from: a */
    public float m26225a() {
        return this.f102336d;
    }

    public String getFamily() {
        return this.f102333a;
    }

    public String getName() {
        return this.f102334b;
    }

    public String getStyle() {
        return this.f102335c;
    }

    @hib
    public Typeface getTypeface() {
        return this.f102337e;
    }

    public void setTypeface(@hib Typeface typeface) {
        this.f102337e = typeface;
    }
}
