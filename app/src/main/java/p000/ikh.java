package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p000.n93;

/* JADX INFO: loaded from: classes3.dex */
public final class ikh {

    /* JADX INFO: renamed from: A */
    public static final String f47249A = "data";

    /* JADX INFO: renamed from: A0 */
    public static final String f47250A0 = "circle";

    /* JADX INFO: renamed from: B */
    public static final String f47251B = "information";

    /* JADX INFO: renamed from: B0 */
    public static final String f47252B0 = "filled";

    /* JADX INFO: renamed from: C */
    public static final String f47253C = "";

    /* JADX INFO: renamed from: C0 */
    public static final String f47254C0 = "open";

    /* JADX INFO: renamed from: D */
    public static final String f47255D = "id";

    /* JADX INFO: renamed from: E */
    public static final String f47256E = "style";

    /* JADX INFO: renamed from: F */
    public static final String f47257F = "origin";

    /* JADX INFO: renamed from: G */
    public static final String f47258G = "extent";

    /* JADX INFO: renamed from: H */
    public static final String f47259H = "displayAlign";

    /* JADX INFO: renamed from: I */
    public static final String f47260I = "backgroundColor";

    /* JADX INFO: renamed from: J */
    public static final String f47261J = "fontStyle";

    /* JADX INFO: renamed from: K */
    public static final String f47262K = "fontSize";

    /* JADX INFO: renamed from: L */
    public static final String f47263L = "fontFamily";

    /* JADX INFO: renamed from: M */
    public static final String f47264M = "fontWeight";

    /* JADX INFO: renamed from: N */
    public static final String f47265N = "color";

    /* JADX INFO: renamed from: O */
    public static final String f47266O = "ruby";

    /* JADX INFO: renamed from: P */
    public static final String f47267P = "rubyPosition";

    /* JADX INFO: renamed from: Q */
    public static final String f47268Q = "textDecoration";

    /* JADX INFO: renamed from: R */
    public static final String f47269R = "textAlign";

    /* JADX INFO: renamed from: S */
    public static final String f47270S = "textCombine";

    /* JADX INFO: renamed from: T */
    public static final String f47271T = "textEmphasis";

    /* JADX INFO: renamed from: U */
    public static final String f47272U = "writingMode";

    /* JADX INFO: renamed from: V */
    public static final String f47273V = "shear";

    /* JADX INFO: renamed from: W */
    public static final String f47274W = "multiRowAlign";

    /* JADX INFO: renamed from: X */
    public static final String f47275X = "container";

    /* JADX INFO: renamed from: Y */
    public static final String f47276Y = "base";

    /* JADX INFO: renamed from: Z */
    public static final String f47277Z = "baseContainer";

    /* JADX INFO: renamed from: a0 */
    public static final String f47278a0 = "text";

    /* JADX INFO: renamed from: b0 */
    public static final String f47279b0 = "textContainer";

    /* JADX INFO: renamed from: c0 */
    public static final String f47280c0 = "delimiter";

    /* JADX INFO: renamed from: d0 */
    public static final String f47281d0 = "before";

    /* JADX INFO: renamed from: e0 */
    public static final String f47282e0 = "after";

    /* JADX INFO: renamed from: f0 */
    public static final String f47283f0 = "outside";

    /* JADX INFO: renamed from: g0 */
    public static final String f47284g0 = "linethrough";

    /* JADX INFO: renamed from: h0 */
    public static final String f47285h0 = "nolinethrough";

    /* JADX INFO: renamed from: i0 */
    public static final String f47286i0 = "underline";

    /* JADX INFO: renamed from: j0 */
    public static final String f47287j0 = "nounderline";

    /* JADX INFO: renamed from: k0 */
    public static final String f47288k0 = "italic";

    /* JADX INFO: renamed from: l0 */
    public static final String f47289l0 = "bold";

    /* JADX INFO: renamed from: m0 */
    public static final String f47290m0 = "left";

    /* JADX INFO: renamed from: n */
    public static final String f47291n = "tt";

    /* JADX INFO: renamed from: n0 */
    public static final String f47292n0 = "center";

    /* JADX INFO: renamed from: o */
    public static final String f47293o = "head";

    /* JADX INFO: renamed from: o0 */
    public static final String f47294o0 = "right";

    /* JADX INFO: renamed from: p */
    public static final String f47295p = "body";

    /* JADX INFO: renamed from: p0 */
    public static final String f47296p0 = "start";

    /* JADX INFO: renamed from: q */
    public static final String f47297q = "div";

    /* JADX INFO: renamed from: q0 */
    public static final String f47298q0 = "end";

    /* JADX INFO: renamed from: r */
    public static final String f47299r = "p";

    /* JADX INFO: renamed from: r0 */
    public static final String f47300r0 = "none";

    /* JADX INFO: renamed from: s */
    public static final String f47301s = "span";

    /* JADX INFO: renamed from: s0 */
    public static final String f47302s0 = "all";

    /* JADX INFO: renamed from: t */
    public static final String f47303t = "br";

    /* JADX INFO: renamed from: t0 */
    public static final String f47304t0 = "tb";

    /* JADX INFO: renamed from: u */
    public static final String f47305u = "style";

    /* JADX INFO: renamed from: u0 */
    public static final String f47306u0 = "tblr";

    /* JADX INFO: renamed from: v */
    public static final String f47307v = "styling";

    /* JADX INFO: renamed from: v0 */
    public static final String f47308v0 = "tbrl";

    /* JADX INFO: renamed from: w */
    public static final String f47309w = "layout";

    /* JADX INFO: renamed from: w0 */
    public static final String f47310w0 = "none";

    /* JADX INFO: renamed from: x */
    public static final String f47311x = "region";

    /* JADX INFO: renamed from: x0 */
    public static final String f47312x0 = "auto";

    /* JADX INFO: renamed from: y */
    public static final String f47313y = "metadata";

    /* JADX INFO: renamed from: y0 */
    public static final String f47314y0 = "dot";

    /* JADX INFO: renamed from: z */
    public static final String f47315z = "image";

    /* JADX INFO: renamed from: z0 */
    public static final String f47316z0 = "sesame";

    /* JADX INFO: renamed from: a */
    @hib
    public final String f47317a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f47318b;

    /* JADX INFO: renamed from: c */
    public final boolean f47319c;

    /* JADX INFO: renamed from: d */
    public final long f47320d;

    /* JADX INFO: renamed from: e */
    public final long f47321e;

    /* JADX INFO: renamed from: f */
    @hib
    public final okh f47322f;

    /* JADX INFO: renamed from: g */
    @hib
    public final String[] f47323g;

    /* JADX INFO: renamed from: h */
    public final String f47324h;

    /* JADX INFO: renamed from: i */
    @hib
    public final String f47325i;

    /* JADX INFO: renamed from: j */
    @hib
    public final ikh f47326j;

    /* JADX INFO: renamed from: k */
    public final HashMap<String, Integer> f47327k;

    /* JADX INFO: renamed from: l */
    public final HashMap<String, Integer> f47328l;

    /* JADX INFO: renamed from: m */
    public List<ikh> f47329m;

    private ikh(@hib String str, @hib String str2, long j, long j2, @hib okh okhVar, @hib String[] strArr, String str3, @hib String str4, @hib ikh ikhVar) {
        this.f47317a = str;
        this.f47318b = str2;
        this.f47325i = str4;
        this.f47322f = okhVar;
        this.f47323g = strArr;
        this.f47319c = str2 != null;
        this.f47320d = j;
        this.f47321e = j2;
        this.f47324h = (String) v80.checkNotNull(str3);
        this.f47326j = ikhVar;
        this.f47327k = new HashMap<>();
        this.f47328l = new HashMap<>();
    }

    private void applyStyleToOutput(Map<String, okh> map, n93.C9750c c9750c, int i, int i2, int i3) {
        okh okhVarResolveStyle = nkh.resolveStyle(this.f47322f, this.f47323g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c9750c.getText();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c9750c.setText(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (okhVarResolveStyle != null) {
            nkh.applyStylesToSpan(spannableStringBuilder2, i, i2, okhVarResolveStyle, this.f47326j, map, i3);
            if ("p".equals(this.f47317a)) {
                if (okhVarResolveStyle.getShearPercentage() != Float.MAX_VALUE) {
                    c9750c.setShearDegrees((okhVarResolveStyle.getShearPercentage() * (-90.0f)) / 100.0f);
                }
                if (okhVarResolveStyle.getTextAlign() != null) {
                    c9750c.setTextAlignment(okhVarResolveStyle.getTextAlign());
                }
                if (okhVarResolveStyle.getMultiRowAlign() != null) {
                    c9750c.setMultiRowAlignment(okhVarResolveStyle.getMultiRowAlign());
                }
            }
        }
    }

    public static ikh buildNode(@hib String str, long j, long j2, @hib okh okhVar, @hib String[] strArr, String str2, @hib String str3, @hib ikh ikhVar) {
        return new ikh(str, null, j, j2, okhVar, strArr, str2, str3, ikhVar);
    }

    public static ikh buildTextNode(String str) {
        return new ikh(null, nkh.m17978a(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static void cleanUpText(SpannableStringBuilder spannableStringBuilder) {
        for (j54 j54Var : (j54[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), j54.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(j54Var), spannableStringBuilder.getSpanEnd(j54Var), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void getEventTimes(TreeSet<Long> treeSet, boolean z) {
        boolean zEquals = "p".equals(this.f47317a);
        boolean zEquals2 = "div".equals(this.f47317a);
        if (z || zEquals || (zEquals2 && this.f47325i != null)) {
            long j = this.f47320d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f47321e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f47329m == null) {
            return;
        }
        for (int i = 0; i < this.f47329m.size(); i++) {
            this.f47329m.get(i).getEventTimes(treeSet, z || zEquals);
        }
    }

    private static SpannableStringBuilder getRegionOutputText(String str, Map<String, n93.C9750c> map) {
        if (!map.containsKey(str)) {
            n93.C9750c c9750c = new n93.C9750c();
            c9750c.setText(new SpannableStringBuilder());
            map.put(str, c9750c);
        }
        return (SpannableStringBuilder) v80.checkNotNull(map.get(str).getText());
    }

    private void traverseForImage(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f47324h)) {
            str = this.f47324h;
        }
        if (isActive(j) && "div".equals(this.f47317a) && this.f47325i != null) {
            list.add(new Pair<>(str, this.f47325i));
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            getChild(i).traverseForImage(j, str, list);
        }
    }

    private void traverseForStyle(long j, Map<String, okh> map, Map<String, lkh> map2, String str, Map<String, n93.C9750c> map3) {
        int i;
        if (isActive(j)) {
            String str2 = "".equals(this.f47324h) ? str : this.f47324h;
            Iterator<Map.Entry<String, Integer>> it = this.f47328l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f47327k.containsKey(key) ? this.f47327k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    applyStyleToOutput(map, (n93.C9750c) v80.checkNotNull(map3.get(key)), iIntValue, iIntValue2, ((lkh) v80.checkNotNull(map2.get(str2))).f58021j);
                }
            }
            while (i < getChildCount()) {
                getChild(i).traverseForStyle(j, map, map2, str2, map3);
                i++;
            }
        }
    }

    private void traverseForText(long j, boolean z, String str, Map<String, n93.C9750c> map) {
        this.f47327k.clear();
        this.f47328l.clear();
        if ("metadata".equals(this.f47317a)) {
            return;
        }
        if (!"".equals(this.f47324h)) {
            str = this.f47324h;
        }
        if (this.f47319c && z) {
            getRegionOutputText(str, map).append((CharSequence) v80.checkNotNull(this.f47318b));
            return;
        }
        if ("br".equals(this.f47317a) && z) {
            getRegionOutputText(str, map).append('\n');
            return;
        }
        if (isActive(j)) {
            for (Map.Entry<String, n93.C9750c> entry : map.entrySet()) {
                this.f47327k.put(entry.getKey(), Integer.valueOf(((CharSequence) v80.checkNotNull(entry.getValue().getText())).length()));
            }
            boolean zEquals = "p".equals(this.f47317a);
            for (int i = 0; i < getChildCount(); i++) {
                getChild(i).traverseForText(j, z || zEquals, str, map);
            }
            if (zEquals) {
                nkh.m17979b(getRegionOutputText(str, map));
            }
            for (Map.Entry<String, n93.C9750c> entry2 : map.entrySet()) {
                this.f47328l.put(entry2.getKey(), Integer.valueOf(((CharSequence) v80.checkNotNull(entry2.getValue().getText())).length()));
            }
        }
    }

    public void addChild(ikh ikhVar) {
        if (this.f47329m == null) {
            this.f47329m = new ArrayList();
        }
        this.f47329m.add(ikhVar);
    }

    public ikh getChild(int i) {
        List<ikh> list = this.f47329m;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getChildCount() {
        List<ikh> list = this.f47329m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<n93> getCues(long j, Map<String, okh> map, Map<String, lkh> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        traverseForImage(j, this.f47324h, arrayList);
        TreeMap treeMap = new TreeMap();
        traverseForText(j, false, this.f47324h, treeMap);
        traverseForStyle(j, map, map2, this.f47324h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                lkh lkhVar = (lkh) v80.checkNotNull(map2.get(pair.first));
                arrayList2.add(new n93.C9750c().setBitmap(bitmapDecodeByteArray).setPosition(lkhVar.f58013b).setPositionAnchor(0).setLine(lkhVar.f58014c, 0).setLineAnchor(lkhVar.f58016e).setSize(lkhVar.f58017f).setBitmapHeight(lkhVar.f58018g).setVerticalType(lkhVar.f58021j).build());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            lkh lkhVar2 = (lkh) v80.checkNotNull(map2.get(entry.getKey()));
            n93.C9750c c9750c = (n93.C9750c) entry.getValue();
            cleanUpText((SpannableStringBuilder) v80.checkNotNull(c9750c.getText()));
            c9750c.setLine(lkhVar2.f58014c, lkhVar2.f58015d);
            c9750c.setLineAnchor(lkhVar2.f58016e);
            c9750c.setPosition(lkhVar2.f58013b);
            c9750c.setSize(lkhVar2.f58017f);
            c9750c.setTextSize(lkhVar2.f58020i, lkhVar2.f58019h);
            c9750c.setVerticalType(lkhVar2.f58021j);
            arrayList2.add(c9750c.build());
        }
        return arrayList2;
    }

    public long[] getEventTimesUs() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        getEventTimes(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    @hib
    public String[] getStyleIds() {
        return this.f47323g;
    }

    public boolean isActive(long j) {
        long j2 = this.f47320d;
        return (j2 == -9223372036854775807L && this.f47321e == -9223372036854775807L) || (j2 <= j && this.f47321e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.f47321e) || (j2 <= j && j < this.f47321e));
    }
}
