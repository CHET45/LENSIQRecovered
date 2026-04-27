package p000;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.p7e;
import p000.z79;

/* JADX INFO: loaded from: classes.dex */
public final class z79 {

    /* JADX INFO: renamed from: a */
    public static final String[] f104326a = new String[0];

    /* JADX INFO: renamed from: b */
    public static final Comparator<C16025b> f104327b = new Comparator() { // from class: y79
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return z79.lambda$static$0((z79.C16025b) obj, (z79.C16025b) obj2);
        }
    };

    /* JADX INFO: renamed from: z79$a */
    @c5e(24)
    public static class C16024a {
        private C16024a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m26604a(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static boolean m26605b(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    /* JADX INFO: renamed from: z79$b */
    public static class C16025b {

        /* JADX INFO: renamed from: a */
        public URLSpan f104328a;

        /* JADX INFO: renamed from: b */
        public String f104329b;

        /* JADX INFO: renamed from: c */
        public int f104330c;

        /* JADX INFO: renamed from: d */
        public int f104331d;
    }

    /* JADX INFO: renamed from: z79$c */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC16026c {
    }

    private z79() {
    }

    private static void addLinkMovementMethod(@efb TextView textView) {
        if ((textView.getMovementMethod() instanceof LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static boolean addLinks(@efb Spannable spannable, int i) {
        if (shouldAddLinksFallbackToFramework()) {
            return Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList<C16025b> arrayList = new ArrayList();
        if ((i & 1) != 0) {
            gatherLinks(arrayList, spannable, wkc.f94543w, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((i & 2) != 0) {
            gatherLinks(arrayList, spannable, wkc.f94519A, new String[]{wq9.f95147b}, null, null);
        }
        if ((i & 8) != 0) {
            gatherMapLinks(arrayList, spannable);
        }
        pruneOverlaps(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        for (C16025b c16025b : arrayList) {
            if (c16025b.f104328a == null) {
                applyLink(c16025b.f104329b, c16025b.f104330c, c16025b.f104331d, spannable);
            }
        }
        return true;
    }

    private static void applyLink(String str, int i, int i2, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i, i2, 33);
    }

    private static String findAddress(String str) {
        return Build.VERSION.SDK_INT >= 28 ? WebView.findAddress(str) : yv5.m26364a(str);
    }

    private static void gatherLinks(ArrayList<C16025b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                if (strGroup != null) {
                    C16025b c16025b = new C16025b();
                    c16025b.f104329b = makeUrl(strGroup, strArr, matcher, transformFilter);
                    c16025b.f104330c = iStart;
                    c16025b.f104331d = iEnd;
                    arrayList.add(c16025b);
                }
            }
        }
    }

    private static void gatherMapLinks(ArrayList<C16025b> arrayList, Spannable spannable) {
        int iIndexOf;
        String string = spannable.toString();
        int i = 0;
        while (true) {
            try {
                String strFindAddress = findAddress(string);
                if (strFindAddress != null && (iIndexOf = string.indexOf(strFindAddress)) >= 0) {
                    C16025b c16025b = new C16025b();
                    int length = strFindAddress.length() + iIndexOf;
                    c16025b.f104330c = iIndexOf + i;
                    i += length;
                    c16025b.f104331d = i;
                    string = string.substring(length);
                    try {
                        c16025b.f104329b = "geo:0,0?q=" + URLEncoder.encode(strFindAddress, "UTF-8");
                        arrayList.add(c16025b);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(C16025b c16025b, C16025b c16025b2) {
        int i = c16025b.f104330c;
        int i2 = c16025b2.f104330c;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return Integer.compare(c16025b2.f104331d, c16025b.f104331d);
    }

    private static String makeUrl(@efb String str, @efb String[] strArr, Matcher matcher, @hib Linkify.TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            String str2 = strArr[i];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                z = true;
                if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                    str = str2 + str.substring(str2.length());
                }
            } else {
                i++;
            }
        }
        if (z || strArr.length <= 0) {
            return str;
        }
        return strArr[0] + str;
    }

    private static void pruneOverlaps(ArrayList<C16025b> arrayList, Spannable spannable) {
        int i;
        int i2 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            C16025b c16025b = new C16025b();
            c16025b.f104328a = uRLSpan;
            c16025b.f104330c = spannable.getSpanStart(uRLSpan);
            c16025b.f104331d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(c16025b);
        }
        Collections.sort(arrayList, f104327b);
        int size = arrayList.size();
        while (i2 < size - 1) {
            C16025b c16025b2 = arrayList.get(i2);
            int i3 = i2 + 1;
            C16025b c16025b3 = arrayList.get(i3);
            int i4 = c16025b2.f104330c;
            int i5 = c16025b3.f104330c;
            if (i4 <= i5 && (i = c16025b2.f104331d) > i5) {
                int i6 = c16025b3.f104331d;
                int i7 = (i6 > i && i - i4 <= i6 - i5) ? i - i4 < i6 - i5 ? i2 : -1 : i3;
                if (i7 != -1) {
                    Object obj = arrayList.get(i7).f104328a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i7);
                    size--;
                }
            }
            i2 = i3;
        }
    }

    private static boolean shouldAddLinksFallbackToFramework() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean addLinks(@efb TextView textView, int i) {
        if (shouldAddLinksFallbackToFramework()) {
            return Linkify.addLinks(textView, i);
        }
        if (i == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            if (addLinks((Spannable) text, i)) {
                addLinkMovementMethod(textView);
                return true;
            }
        } else {
            SpannableString spannableStringValueOf = SpannableString.valueOf(text);
            if (addLinks(spannableStringValueOf, i)) {
                addLinkMovementMethod(textView);
                textView.setText(spannableStringValueOf);
                return true;
            }
        }
        return false;
    }

    public static void addLinks(@efb TextView textView, @efb Pattern pattern, @hib String str) {
        if (shouldAddLinksFallbackToFramework()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            addLinks(textView, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
        }
    }

    public static void addLinks(@efb TextView textView, @efb Pattern pattern, @hib String str, @hib Linkify.MatchFilter matchFilter, @hib Linkify.TransformFilter transformFilter) {
        if (shouldAddLinksFallbackToFramework()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            addLinks(textView, pattern, str, (String[]) null, matchFilter, transformFilter);
        }
    }

    public static void addLinks(@efb TextView textView, @efb Pattern pattern, @hib String str, @hib String[] strArr, @hib Linkify.MatchFilter matchFilter, @hib Linkify.TransformFilter transformFilter) {
        if (shouldAddLinksFallbackToFramework()) {
            C16024a.m26604a(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(textView.getText());
        if (addLinks(spannableStringValueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(spannableStringValueOf);
            addLinkMovementMethod(textView);
        }
    }

    public static boolean addLinks(@efb Spannable spannable, @efb Pattern pattern, @hib String str) {
        if (shouldAddLinksFallbackToFramework()) {
            return Linkify.addLinks(spannable, pattern, str);
        }
        return addLinks(spannable, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
    }

    public static boolean addLinks(@efb Spannable spannable, @efb Pattern pattern, @hib String str, @hib Linkify.MatchFilter matchFilter, @hib Linkify.TransformFilter transformFilter) {
        if (shouldAddLinksFallbackToFramework()) {
            return Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter);
        }
        return addLinks(spannable, pattern, str, (String[]) null, matchFilter, transformFilter);
    }

    public static boolean addLinks(@efb Spannable spannable, @efb Pattern pattern, @hib String str, @hib String[] strArr, @hib Linkify.MatchFilter matchFilter, @hib Linkify.TransformFilter transformFilter) {
        String lowerCase;
        if (shouldAddLinksFallbackToFramework()) {
            return C16024a.m26605b(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f104326a;
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i = 0;
        while (i < strArr.length) {
            String str2 = strArr[i];
            i++;
            if (str2 == null) {
                lowerCase = "";
            } else {
                lowerCase = str2.toLowerCase(Locale.ROOT);
            }
            strArr2[i] = lowerCase;
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z = false;
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if ((matchFilter != null ? matchFilter.acceptMatch(spannable, iStart, iEnd) : true) && strGroup != null) {
                applyLink(makeUrl(strGroup, strArr2, matcher, transformFilter), iStart, iEnd, spannable);
                z = true;
            }
        }
        return z;
    }
}
