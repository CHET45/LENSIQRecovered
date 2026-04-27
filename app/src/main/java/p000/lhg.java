package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public class lhg {

    /* JADX INFO: renamed from: a */
    public Context f57642a;

    /* JADX INFO: renamed from: b */
    public Drawable f57643b;

    /* JADX INFO: renamed from: c */
    public Drawable f57644c;

    /* JADX INFO: renamed from: d */
    public String f57645d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f57646e;

    /* JADX INFO: renamed from: f */
    public int f57647f;

    /* JADX INFO: renamed from: g */
    public Typeface f57648g;

    /* JADX INFO: renamed from: h */
    public int f57649h;

    /* JADX INFO: renamed from: i */
    public int f57650i = -2;

    /* JADX INFO: renamed from: j */
    public int f57651j = -2;

    /* JADX INFO: renamed from: k */
    public int f57652k = 0;

    public lhg(Context context) {
        this.f57642a = context;
    }

    public Drawable getBackground() {
        return this.f57643b;
    }

    public int getHeight() {
        return this.f57651j;
    }

    public Drawable getImage() {
        return this.f57644c;
    }

    public String getText() {
        return this.f57645d;
    }

    public int getTextAppearance() {
        return this.f57649h;
    }

    public int getTextSize() {
        return this.f57647f;
    }

    public Typeface getTextTypeface() {
        return this.f57648g;
    }

    public ColorStateList getTitleColor() {
        return this.f57646e;
    }

    public int getWeight() {
        return this.f57652k;
    }

    public int getWidth() {
        return this.f57650i;
    }

    public lhg setBackground(@gq4 int i) {
        return setBackground(lx2.getDrawable(this.f57642a, i));
    }

    public lhg setBackgroundColor(@g92 int i) {
        this.f57643b = new ColorDrawable(i);
        return this;
    }

    public lhg setBackgroundColorResource(@w92 int i) {
        return setBackgroundColor(lx2.getColor(this.f57642a, i));
    }

    public lhg setHeight(int i) {
        this.f57651j = i;
        return this;
    }

    public lhg setImage(@gq4 int i) {
        return setImage(lx2.getDrawable(this.f57642a, i));
    }

    public lhg setText(@g8g int i) {
        return setText(this.f57642a.getString(i));
    }

    public lhg setTextAppearance(@dbg int i) {
        this.f57649h = i;
        return this;
    }

    public lhg setTextColor(@g92 int i) {
        this.f57646e = ColorStateList.valueOf(i);
        return this;
    }

    public lhg setTextColorResource(@w92 int i) {
        return setTextColor(lx2.getColor(this.f57642a, i));
    }

    public lhg setTextSize(int i) {
        this.f57647f = i;
        return this;
    }

    public lhg setTextTypeface(Typeface typeface) {
        this.f57648g = typeface;
        return this;
    }

    public lhg setWeight(int i) {
        this.f57652k = i;
        return this;
    }

    public lhg setWidth(int i) {
        this.f57650i = i;
        return this;
    }

    public lhg setBackground(Drawable drawable) {
        this.f57643b = drawable;
        return this;
    }

    public lhg setImage(Drawable drawable) {
        this.f57644c = drawable;
        return this;
    }

    public lhg setText(String str) {
        this.f57645d = str;
        return this;
    }
}
