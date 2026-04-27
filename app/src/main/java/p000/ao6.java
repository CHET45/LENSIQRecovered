package p000;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ao6 {

    /* JADX INFO: renamed from: d */
    public final AssetManager f11441d;

    /* JADX INFO: renamed from: e */
    @hib
    public zn6 f11442e;

    /* JADX INFO: renamed from: a */
    public final h6b<String> f11438a = new h6b<>();

    /* JADX INFO: renamed from: b */
    public final Map<h6b<String>, Typeface> f11439b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map<String, Typeface> f11440c = new HashMap();

    /* JADX INFO: renamed from: f */
    public String f11443f = ".ttf";

    public ao6(Drawable.Callback callback, @hib zn6 zn6Var) {
        this.f11442e = zn6Var;
        if (callback instanceof View) {
            this.f11441d = ((View) callback).getContext().getAssets();
        } else {
            dj9.warning("LottieDrawable must be inside of a view for images to work.");
            this.f11441d = null;
        }
    }

    private Typeface getFontFamily(String str) {
        String fontPath;
        Typeface typeface = this.f11440c.get(str);
        if (typeface != null) {
            return typeface;
        }
        zn6 zn6Var = this.f11442e;
        Typeface typefaceFetchFont = zn6Var != null ? zn6Var.fetchFont(str) : null;
        zn6 zn6Var2 = this.f11442e;
        if (zn6Var2 != null && typefaceFetchFont == null && (fontPath = zn6Var2.getFontPath(str)) != null) {
            typefaceFetchFont = Typeface.createFromAsset(this.f11441d, fontPath);
        }
        if (typefaceFetchFont == null) {
            typefaceFetchFont = Typeface.createFromAsset(this.f11441d, "fonts/" + str + this.f11443f);
        }
        this.f11440c.put(str, typefaceFetchFont);
        return typefaceFetchFont;
    }

    private Typeface typefaceForStyle(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    public Typeface getTypeface(String str, String str2) {
        this.f11438a.set(str, str2);
        Typeface typeface = this.f11439b.get(this.f11438a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceTypefaceForStyle = typefaceForStyle(getFontFamily(str), str2);
        this.f11439b.put(this.f11438a, typefaceTypefaceForStyle);
        return typefaceTypefaceForStyle;
    }

    public void setDefaultFontFileExtension(String str) {
        this.f11443f = str;
    }

    public void setDelegate(@hib zn6 zn6Var) {
        this.f11442e = zn6Var;
    }
}
