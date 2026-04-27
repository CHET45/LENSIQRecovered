package p000;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes3.dex */
public class wuh implements Spannable {

    /* JADX INFO: renamed from: a */
    public boolean f95545a = false;

    /* JADX INFO: renamed from: b */
    @efb
    public Spannable f95546b;

    /* JADX INFO: renamed from: wuh$a */
    @c5e(24)
    public static class C14801a {
        private C14801a() {
        }

        /* JADX INFO: renamed from: a */
        public static IntStream m24833a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* JADX INFO: renamed from: b */
        public static IntStream m24834b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* JADX INFO: renamed from: wuh$b */
    public static class C14802b {
        /* JADX INFO: renamed from: a */
        public boolean mo24835a(CharSequence charSequence) {
            return charSequence instanceof a7d;
        }
    }

    /* JADX INFO: renamed from: wuh$c */
    @c5e(28)
    public static class C14803c extends C14802b {
        @Override // p000.wuh.C14802b
        /* JADX INFO: renamed from: a */
        public boolean mo24835a(CharSequence charSequence) {
            return s6d.m21761a(charSequence) || (charSequence instanceof a7d);
        }
    }

    public wuh(@efb Spannable spannable) {
        this.f95546b = spannable;
    }

    /* JADX INFO: renamed from: b */
    public static C14802b m24831b() {
        return Build.VERSION.SDK_INT < 28 ? new C14802b() : new C14803c();
    }

    private void ensureSafeWrites() {
        Spannable spannable = this.f95546b;
        if (!this.f95545a && m24831b().mo24835a(spannable)) {
            this.f95546b = new SpannableString(spannable);
        }
        this.f95545a = true;
    }

    /* JADX INFO: renamed from: a */
    public Spannable m24832a() {
        return this.f95546b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f95546b.charAt(i);
    }

    @Override // java.lang.CharSequence
    @c5e(api = 24)
    @efb
    public IntStream chars() {
        return C14801a.m24833a(this.f95546b);
    }

    @Override // java.lang.CharSequence
    @c5e(api = 24)
    @efb
    public IntStream codePoints() {
        return C14801a.m24834b(this.f95546b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f95546b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f95546b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f95546b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.f95546b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f95546b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f95546b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        ensureSafeWrites();
        this.f95546b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        ensureSafeWrites();
        this.f95546b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    @efb
    public CharSequence subSequence(int i, int i2) {
        return this.f95546b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @efb
    public String toString() {
        return this.f95546b.toString();
    }

    public wuh(@efb Spanned spanned) {
        this.f95546b = new SpannableString(spanned);
    }

    public wuh(@efb CharSequence charSequence) {
        this.f95546b = new SpannableString(charSequence);
    }
}
