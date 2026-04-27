package p000;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.blankj.utilcode.util.C2473f;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nkh {

    /* JADX INFO: renamed from: a */
    public static final String f64824a = "TtmlRenderUtil";

    private nkh() {
    }

    /* JADX INFO: renamed from: a */
    public static String m17978a(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", C2473f.f17566z).replaceAll("[ \t\\x0B\f\r]+", C2473f.f17566z);
    }

    @igg({"WrongConstant"})
    public static void applyStylesToSpan(Spannable spannable, int i, int i2, okh okhVar, @hib ikh ikhVar, Map<String, okh> map, int i3) {
        ikh ikhVarFindRubyTextNode;
        okh okhVarResolveStyle;
        int i4;
        if (okhVar.getStyle() != -1) {
            spannable.setSpan(new StyleSpan(okhVar.getStyle()), i, i2, 33);
        }
        if (okhVar.isLinethrough()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (okhVar.isUnderline()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (okhVar.hasFontColor()) {
            vwf.addOrReplaceSpan(spannable, new ForegroundColorSpan(okhVar.getFontColor()), i, i2, 33);
        }
        if (okhVar.hasBackgroundColor()) {
            vwf.addOrReplaceSpan(spannable, new BackgroundColorSpan(okhVar.getBackgroundColor()), i, i2, 33);
        }
        if (okhVar.getFontFamily() != null) {
            vwf.addOrReplaceSpan(spannable, new TypefaceSpan(okhVar.getFontFamily()), i, i2, 33);
        }
        if (okhVar.getTextEmphasis() != null) {
            drg drgVar = (drg) v80.checkNotNull(okhVar.getTextEmphasis());
            int i5 = drgVar.f30512a;
            if (i5 == -1) {
                i5 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = drgVar.f30513b;
            }
            int i6 = drgVar.f30514c;
            if (i6 == -2) {
                i6 = 1;
            }
            vwf.addOrReplaceSpan(spannable, new frg(i5, i4, i6), i, i2, 33);
        }
        int rubyType = okhVar.getRubyType();
        if (rubyType == 2) {
            ikh ikhVarFindRubyContainerNode = findRubyContainerNode(ikhVar, map);
            if (ikhVarFindRubyContainerNode != null && (ikhVarFindRubyTextNode = findRubyTextNode(ikhVarFindRubyContainerNode, map)) != null) {
                if (ikhVarFindRubyTextNode.getChildCount() != 1 || ikhVarFindRubyTextNode.getChild(0).f47318b == null) {
                    xh9.m25146i("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) t0i.castNonNull(ikhVarFindRubyTextNode.getChild(0).f47318b);
                    okh okhVarResolveStyle2 = resolveStyle(ikhVarFindRubyTextNode.f47322f, ikhVarFindRubyTextNode.getStyleIds(), map);
                    int rubyPosition = okhVarResolveStyle2 != null ? okhVarResolveStyle2.getRubyPosition() : -1;
                    if (rubyPosition == -1 && (okhVarResolveStyle = resolveStyle(ikhVarFindRubyContainerNode.f47322f, ikhVarFindRubyContainerNode.getStyleIds(), map)) != null) {
                        rubyPosition = okhVarResolveStyle.getRubyPosition();
                    }
                    spannable.setSpan(new mce(str, rubyPosition), i, i2, 33);
                }
            }
        } else if (rubyType == 3 || rubyType == 4) {
            spannable.setSpan(new j54(), i, i2, 33);
        }
        if (okhVar.getTextCombine()) {
            vwf.addOrReplaceSpan(spannable, new ql7(), i, i2, 33);
        }
        int fontSizeUnit = okhVar.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            vwf.addOrReplaceSpan(spannable, new AbsoluteSizeSpan((int) okhVar.getFontSize(), true), i, i2, 33);
        } else if (fontSizeUnit == 2) {
            vwf.addOrReplaceSpan(spannable, new RelativeSizeSpan(okhVar.getFontSize()), i, i2, 33);
        } else {
            if (fontSizeUnit != 3) {
                return;
            }
            vwf.addInheritedRelativeSizeSpan(spannable, okhVar.getFontSize() / 100.0f, i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m17979b(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    @hib
    private static ikh findRubyContainerNode(@hib ikh ikhVar, Map<String, okh> map) {
        while (ikhVar != null) {
            okh okhVarResolveStyle = resolveStyle(ikhVar.f47322f, ikhVar.getStyleIds(), map);
            if (okhVarResolveStyle != null && okhVarResolveStyle.getRubyType() == 1) {
                return ikhVar;
            }
            ikhVar = ikhVar.f47326j;
        }
        return null;
    }

    @hib
    private static ikh findRubyTextNode(ikh ikhVar, Map<String, okh> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(ikhVar);
        while (!arrayDeque.isEmpty()) {
            ikh ikhVar2 = (ikh) arrayDeque.pop();
            okh okhVarResolveStyle = resolveStyle(ikhVar2.f47322f, ikhVar2.getStyleIds(), map);
            if (okhVarResolveStyle != null && okhVarResolveStyle.getRubyType() == 3) {
                return ikhVar2;
            }
            for (int childCount = ikhVar2.getChildCount() - 1; childCount >= 0; childCount--) {
                arrayDeque.push(ikhVar2.getChild(childCount));
            }
        }
        return null;
    }

    @hib
    public static okh resolveStyle(@hib okh okhVar, @hib String[] strArr, Map<String, okh> map) {
        int i = 0;
        if (okhVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                okh okhVar2 = new okh();
                int length = strArr.length;
                while (i < length) {
                    okhVar2.chain(map.get(strArr[i]));
                    i++;
                }
                return okhVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return okhVar.chain(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    okhVar.chain(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return okhVar;
    }
}
