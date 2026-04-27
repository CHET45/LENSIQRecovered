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

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class mkh {

    /* JADX INFO: renamed from: a */
    public static final String f61269a = "TtmlRenderUtil";

    private mkh() {
    }

    /* JADX INFO: renamed from: a */
    public static String m17361a(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", C2473f.f17566z).replaceAll("[ \t\\x0B\f\r]+", C2473f.f17566z);
    }

    public static void applyStylesToSpan(Spannable spannable, int i, int i2, pkh pkhVar, @hib hkh hkhVar, Map<String, pkh> map, int i3) {
        hkh hkhVarFindRubyTextNode;
        pkh pkhVarResolveStyle;
        int i4;
        if (pkhVar.getStyle() != -1) {
            spannable.setSpan(new StyleSpan(pkhVar.getStyle()), i, i2, 33);
        }
        if (pkhVar.isLinethrough()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (pkhVar.isUnderline()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (pkhVar.hasFontColor()) {
            uwf.addOrReplaceSpan(spannable, new ForegroundColorSpan(pkhVar.getFontColor()), i, i2, 33);
        }
        if (pkhVar.hasBackgroundColor()) {
            uwf.addOrReplaceSpan(spannable, new BackgroundColorSpan(pkhVar.getBackgroundColor()), i, i2, 33);
        }
        if (pkhVar.getFontFamily() != null) {
            uwf.addOrReplaceSpan(spannable, new TypefaceSpan(pkhVar.getFontFamily()), i, i2, 33);
        }
        if (pkhVar.getTextEmphasis() != null) {
            erg ergVar = (erg) u80.checkNotNull(pkhVar.getTextEmphasis());
            int i5 = ergVar.f33918a;
            if (i5 == -1) {
                i5 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = ergVar.f33919b;
            }
            int i6 = ergVar.f33920c;
            if (i6 == -2) {
                i6 = 1;
            }
            uwf.addOrReplaceSpan(spannable, new grg(i5, i4, i6), i, i2, 33);
        }
        int rubyType = pkhVar.getRubyType();
        if (rubyType == 2) {
            hkh hkhVarFindRubyContainerNode = findRubyContainerNode(hkhVar, map);
            if (hkhVarFindRubyContainerNode != null && (hkhVarFindRubyTextNode = findRubyTextNode(hkhVarFindRubyContainerNode, map)) != null) {
                if (hkhVarFindRubyTextNode.getChildCount() != 1 || hkhVarFindRubyTextNode.getChild(0).f44015b == null) {
                    yh9.m25917i("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) x0i.castNonNull(hkhVarFindRubyTextNode.getChild(0).f44015b);
                    pkh pkhVarResolveStyle2 = resolveStyle(hkhVarFindRubyTextNode.f44019f, hkhVarFindRubyTextNode.getStyleIds(), map);
                    int rubyPosition = pkhVarResolveStyle2 != null ? pkhVarResolveStyle2.getRubyPosition() : -1;
                    if (rubyPosition == -1 && (pkhVarResolveStyle = resolveStyle(hkhVarFindRubyContainerNode.f44019f, hkhVarFindRubyContainerNode.getStyleIds(), map)) != null) {
                        rubyPosition = pkhVarResolveStyle.getRubyPosition();
                    }
                    spannable.setSpan(new lce(str, rubyPosition), i, i2, 33);
                }
            }
        } else if (rubyType == 3 || rubyType == 4) {
            spannable.setSpan(new i54(), i, i2, 33);
        }
        if (pkhVar.getTextCombine()) {
            uwf.addOrReplaceSpan(spannable, new pl7(), i, i2, 33);
        }
        int fontSizeUnit = pkhVar.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            uwf.addOrReplaceSpan(spannable, new AbsoluteSizeSpan((int) pkhVar.getFontSize(), true), i, i2, 33);
        } else if (fontSizeUnit == 2) {
            uwf.addOrReplaceSpan(spannable, new RelativeSizeSpan(pkhVar.getFontSize()), i, i2, 33);
        } else {
            if (fontSizeUnit != 3) {
                return;
            }
            uwf.addOrReplaceSpan(spannable, new RelativeSizeSpan(pkhVar.getFontSize() / 100.0f), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m17362b(SpannableStringBuilder spannableStringBuilder) {
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
    private static hkh findRubyContainerNode(@hib hkh hkhVar, Map<String, pkh> map) {
        while (hkhVar != null) {
            pkh pkhVarResolveStyle = resolveStyle(hkhVar.f44019f, hkhVar.getStyleIds(), map);
            if (pkhVarResolveStyle != null && pkhVarResolveStyle.getRubyType() == 1) {
                return hkhVar;
            }
            hkhVar = hkhVar.f44023j;
        }
        return null;
    }

    @hib
    private static hkh findRubyTextNode(hkh hkhVar, Map<String, pkh> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(hkhVar);
        while (!arrayDeque.isEmpty()) {
            hkh hkhVar2 = (hkh) arrayDeque.pop();
            pkh pkhVarResolveStyle = resolveStyle(hkhVar2.f44019f, hkhVar2.getStyleIds(), map);
            if (pkhVarResolveStyle != null && pkhVarResolveStyle.getRubyType() == 3) {
                return hkhVar2;
            }
            for (int childCount = hkhVar2.getChildCount() - 1; childCount >= 0; childCount--) {
                arrayDeque.push(hkhVar2.getChild(childCount));
            }
        }
        return null;
    }

    @hib
    public static pkh resolveStyle(@hib pkh pkhVar, @hib String[] strArr, Map<String, pkh> map) {
        int i = 0;
        if (pkhVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                pkh pkhVar2 = new pkh();
                int length = strArr.length;
                while (i < length) {
                    pkhVar2.chain(map.get(strArr[i]));
                    i++;
                }
                return pkhVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return pkhVar.chain(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    pkhVar.chain(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return pkhVar;
    }
}
