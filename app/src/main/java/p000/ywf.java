package p000;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ywf implements Appendable, CharSequence {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f103229a;

    /* JADX INFO: renamed from: b */
    public final Deque<C15863a> f103230b;

    /* JADX INFO: renamed from: ywf$a */
    public static class C15863a {

        /* JADX INFO: renamed from: a */
        public final Object f103231a;

        /* JADX INFO: renamed from: b */
        public int f103232b;

        /* JADX INFO: renamed from: c */
        public int f103233c;

        /* JADX INFO: renamed from: d */
        public final int f103234d;

        public C15863a(@efb Object obj, int i, int i2, int i3) {
            this.f103231a = obj;
            this.f103232b = i;
            this.f103233c = i2;
            this.f103234d = i3;
        }
    }

    /* JADX INFO: renamed from: ywf$b */
    public static class C15864b extends SpannableStringBuilder {
        public C15864b(CharSequence charSequence) {
            super(charSequence);
        }
    }

    public ywf() {
        this("");
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public static boolean m26382a(int i, int i2, int i3) {
        return i3 > i2 && i2 >= 0 && i3 <= i;
    }

    private void copySpans(int i, @hib CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof C15864b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                if (!z) {
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj = spans[i2];
                        setSpan(obj, spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj));
                    }
                    return;
                }
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    Object obj2 = spans[i3];
                    setSpan(obj2, spanned.getSpanStart(obj2) + i, spanned.getSpanEnd(obj2) + i, spanned.getSpanFlags(obj2));
                }
            }
        }
    }

    public static void setSpans(@efb ywf ywfVar, @hib Object obj, int i, int i2) {
        if (obj == null || !m26382a(ywfVar.length(), i, i2)) {
            return;
        }
        setSpansInternal(ywfVar, obj, i, i2);
    }

    private static void setSpansInternal(@efb ywf ywfVar, @hib Object obj, int i, int i2) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                ywfVar.setSpan(obj, i, i2, 33);
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                setSpansInternal(ywfVar, obj2, i, i2);
            }
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f103229a.charAt(i);
    }

    public void clear() {
        this.f103229a.setLength(0);
        this.f103230b.clear();
    }

    @efb
    public List<C15863a> getSpans(int i, int i2) {
        int i3;
        int length = length();
        if (!m26382a(length, i, i2)) {
            return Collections.emptyList();
        }
        if (i == 0 && length == i2) {
            ArrayList arrayList = new ArrayList(this.f103230b);
            Collections.reverse(arrayList);
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(0);
        Iterator<C15863a> itDescendingIterator = this.f103230b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            C15863a next = itDescendingIterator.next();
            int i4 = next.f103232b;
            if ((i4 >= i && i4 < i2) || (((i3 = next.f103233c) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                arrayList2.add(next);
            }
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public char lastChar() {
        return this.f103229a.charAt(length() - 1);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f103229a.length();
    }

    @efb
    public CharSequence removeFromEnd(int i) {
        C15863a next;
        int i2;
        int length = length();
        C15864b c15864b = new C15864b(this.f103229a.subSequence(i, length));
        Iterator<C15863a> it = this.f103230b.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            int i3 = next.f103232b;
            if (i3 >= i && (i2 = next.f103233c) <= length) {
                c15864b.setSpan(next.f103231a, i3 - i, i2 - i, 33);
                it.remove();
            }
        }
        this.f103229a.replace(i, length, "");
        return c15864b;
    }

    @efb
    public ywf setSpan(@efb Object obj, int i) {
        return setSpan(obj, i, length());
    }

    @efb
    public SpannableStringBuilder spannableStringBuilder() {
        C15864b c15864b = new C15864b(this.f103229a);
        for (C15863a c15863a : this.f103230b) {
            c15864b.setSpan(c15863a.f103231a, c15863a.f103232b, c15863a.f103233c, c15863a.f103234d);
        }
        return c15864b;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        List<C15863a> spans = getSpans(i, i2);
        if (spans.isEmpty()) {
            return this.f103229a.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f103229a.subSequence(i, i2));
        int length = spannableStringBuilder.length();
        for (C15863a c15863a : spans) {
            int iMax = Math.max(0, c15863a.f103232b - i);
            spannableStringBuilder.setSpan(c15863a.f103231a, iMax, Math.min(length, (c15863a.f103233c - c15863a.f103232b) + iMax), c15863a.f103234d);
        }
        return spannableStringBuilder;
    }

    @efb
    public CharSequence text() {
        return spannableStringBuilder();
    }

    @Override // java.lang.CharSequence
    @efb
    public String toString() {
        return this.f103229a.toString();
    }

    public ywf(@efb CharSequence charSequence) {
        this.f103230b = new ArrayDeque(8);
        this.f103229a = new StringBuilder(charSequence);
        copySpans(0, charSequence);
    }

    @efb
    public ywf setSpan(@efb Object obj, int i, int i2) {
        return setSpan(obj, i, i2, 33);
    }

    @efb
    public ywf setSpan(@efb Object obj, int i, int i2, int i3) {
        this.f103230b.push(new C15863a(obj, i, i2, i3));
        return this;
    }

    @efb
    public ywf append(@efb String str) {
        this.f103229a.append(str);
        return this;
    }

    @Override // java.lang.Appendable
    @efb
    public ywf append(char c) {
        this.f103229a.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    @efb
    public ywf append(@efb CharSequence charSequence) {
        copySpans(length(), charSequence);
        this.f103229a.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    @efb
    public ywf append(CharSequence charSequence, int i, int i2) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        copySpans(length(), charSequenceSubSequence);
        this.f103229a.append(charSequenceSubSequence);
        return this;
    }

    @efb
    public ywf append(@efb CharSequence charSequence, @efb Object obj) {
        int length = length();
        append(charSequence);
        setSpan(obj, length);
        return this;
    }

    @efb
    public ywf append(@efb CharSequence charSequence, @efb Object obj, int i) {
        int length = length();
        append(charSequence);
        setSpan(obj, length, length(), i);
        return this;
    }
}
