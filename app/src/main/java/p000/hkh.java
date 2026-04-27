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
import p000.o93;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class hkh {

    /* JADX INFO: renamed from: A */
    public static final String f43947A = "data";

    /* JADX INFO: renamed from: A0 */
    public static final String f43948A0 = "filled";

    /* JADX INFO: renamed from: B */
    public static final String f43949B = "information";

    /* JADX INFO: renamed from: B0 */
    public static final String f43950B0 = "open";

    /* JADX INFO: renamed from: C */
    public static final String f43951C = "";

    /* JADX INFO: renamed from: D */
    public static final String f43952D = "id";

    /* JADX INFO: renamed from: E */
    public static final String f43953E = "origin";

    /* JADX INFO: renamed from: F */
    public static final String f43954F = "extent";

    /* JADX INFO: renamed from: G */
    public static final String f43955G = "displayAlign";

    /* JADX INFO: renamed from: H */
    public static final String f43956H = "backgroundColor";

    /* JADX INFO: renamed from: I */
    public static final String f43957I = "fontStyle";

    /* JADX INFO: renamed from: J */
    public static final String f43958J = "fontSize";

    /* JADX INFO: renamed from: K */
    public static final String f43959K = "fontFamily";

    /* JADX INFO: renamed from: L */
    public static final String f43960L = "fontWeight";

    /* JADX INFO: renamed from: M */
    public static final String f43961M = "color";

    /* JADX INFO: renamed from: N */
    public static final String f43962N = "ruby";

    /* JADX INFO: renamed from: O */
    public static final String f43963O = "rubyPosition";

    /* JADX INFO: renamed from: P */
    public static final String f43964P = "textDecoration";

    /* JADX INFO: renamed from: Q */
    public static final String f43965Q = "textAlign";

    /* JADX INFO: renamed from: R */
    public static final String f43966R = "textCombine";

    /* JADX INFO: renamed from: S */
    public static final String f43967S = "textEmphasis";

    /* JADX INFO: renamed from: T */
    public static final String f43968T = "writingMode";

    /* JADX INFO: renamed from: U */
    public static final String f43969U = "shear";

    /* JADX INFO: renamed from: V */
    public static final String f43970V = "multiRowAlign";

    /* JADX INFO: renamed from: W */
    public static final String f43971W = "container";

    /* JADX INFO: renamed from: X */
    public static final String f43972X = "base";

    /* JADX INFO: renamed from: Y */
    public static final String f43973Y = "baseContainer";

    /* JADX INFO: renamed from: Z */
    public static final String f43974Z = "text";

    /* JADX INFO: renamed from: a0 */
    public static final String f43975a0 = "textContainer";

    /* JADX INFO: renamed from: b0 */
    public static final String f43976b0 = "delimiter";

    /* JADX INFO: renamed from: c0 */
    public static final String f43977c0 = "before";

    /* JADX INFO: renamed from: d0 */
    public static final String f43978d0 = "after";

    /* JADX INFO: renamed from: e0 */
    public static final String f43979e0 = "outside";

    /* JADX INFO: renamed from: f0 */
    public static final String f43980f0 = "linethrough";

    /* JADX INFO: renamed from: g0 */
    public static final String f43981g0 = "nolinethrough";

    /* JADX INFO: renamed from: h0 */
    public static final String f43982h0 = "underline";

    /* JADX INFO: renamed from: i0 */
    public static final String f43983i0 = "nounderline";

    /* JADX INFO: renamed from: j0 */
    public static final String f43984j0 = "italic";

    /* JADX INFO: renamed from: k0 */
    public static final String f43985k0 = "bold";

    /* JADX INFO: renamed from: l0 */
    public static final String f43986l0 = "left";

    /* JADX INFO: renamed from: m0 */
    public static final String f43987m0 = "center";

    /* JADX INFO: renamed from: n */
    public static final String f43988n = "tt";

    /* JADX INFO: renamed from: n0 */
    public static final String f43989n0 = "right";

    /* JADX INFO: renamed from: o */
    public static final String f43990o = "head";

    /* JADX INFO: renamed from: o0 */
    public static final String f43991o0 = "start";

    /* JADX INFO: renamed from: p */
    public static final String f43992p = "body";

    /* JADX INFO: renamed from: p0 */
    public static final String f43993p0 = "end";

    /* JADX INFO: renamed from: q */
    public static final String f43994q = "div";

    /* JADX INFO: renamed from: q0 */
    public static final String f43995q0 = "none";

    /* JADX INFO: renamed from: r */
    public static final String f43996r = "p";

    /* JADX INFO: renamed from: r0 */
    public static final String f43997r0 = "all";

    /* JADX INFO: renamed from: s */
    public static final String f43998s = "span";

    /* JADX INFO: renamed from: s0 */
    public static final String f43999s0 = "tb";

    /* JADX INFO: renamed from: t */
    public static final String f44000t = "br";

    /* JADX INFO: renamed from: t0 */
    public static final String f44001t0 = "tblr";

    /* JADX INFO: renamed from: u */
    public static final String f44002u = "style";

    /* JADX INFO: renamed from: u0 */
    public static final String f44003u0 = "tbrl";

    /* JADX INFO: renamed from: v */
    public static final String f44004v = "styling";

    /* JADX INFO: renamed from: v0 */
    public static final String f44005v0 = "none";

    /* JADX INFO: renamed from: w */
    public static final String f44006w = "layout";

    /* JADX INFO: renamed from: w0 */
    public static final String f44007w0 = "auto";

    /* JADX INFO: renamed from: x */
    public static final String f44008x = "region";

    /* JADX INFO: renamed from: x0 */
    public static final String f44009x0 = "dot";

    /* JADX INFO: renamed from: y */
    public static final String f44010y = "metadata";

    /* JADX INFO: renamed from: y0 */
    public static final String f44011y0 = "sesame";

    /* JADX INFO: renamed from: z */
    public static final String f44012z = "image";

    /* JADX INFO: renamed from: z0 */
    public static final String f44013z0 = "circle";

    /* JADX INFO: renamed from: a */
    @hib
    public final String f44014a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f44015b;

    /* JADX INFO: renamed from: c */
    public final boolean f44016c;

    /* JADX INFO: renamed from: d */
    public final long f44017d;

    /* JADX INFO: renamed from: e */
    public final long f44018e;

    /* JADX INFO: renamed from: f */
    @hib
    public final pkh f44019f;

    /* JADX INFO: renamed from: g */
    @hib
    public final String[] f44020g;

    /* JADX INFO: renamed from: h */
    public final String f44021h;

    /* JADX INFO: renamed from: i */
    @hib
    public final String f44022i;

    /* JADX INFO: renamed from: j */
    @hib
    public final hkh f44023j;

    /* JADX INFO: renamed from: k */
    public final HashMap<String, Integer> f44024k;

    /* JADX INFO: renamed from: l */
    public final HashMap<String, Integer> f44025l;

    /* JADX INFO: renamed from: m */
    public List<hkh> f44026m;

    private hkh(@hib String str, @hib String str2, long j, long j2, @hib pkh pkhVar, @hib String[] strArr, String str3, @hib String str4, @hib hkh hkhVar) {
        this.f44014a = str;
        this.f44015b = str2;
        this.f44022i = str4;
        this.f44019f = pkhVar;
        this.f44020g = strArr;
        this.f44016c = str2 != null;
        this.f44017d = j;
        this.f44018e = j2;
        this.f44021h = (String) u80.checkNotNull(str3);
        this.f44023j = hkhVar;
        this.f44024k = new HashMap<>();
        this.f44025l = new HashMap<>();
    }

    private void applyStyleToOutput(Map<String, pkh> map, o93.C10261c c10261c, int i, int i2, int i3) {
        pkh pkhVarResolveStyle = mkh.resolveStyle(this.f44019f, this.f44020g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c10261c.getText();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c10261c.setText(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (pkhVarResolveStyle != null) {
            mkh.applyStylesToSpan(spannableStringBuilder2, i, i2, pkhVarResolveStyle, this.f44023j, map, i3);
            if ("p".equals(this.f44014a)) {
                if (pkhVarResolveStyle.getShearPercentage() != Float.MAX_VALUE) {
                    c10261c.setShearDegrees((pkhVarResolveStyle.getShearPercentage() * (-90.0f)) / 100.0f);
                }
                if (pkhVarResolveStyle.getTextAlign() != null) {
                    c10261c.setTextAlignment(pkhVarResolveStyle.getTextAlign());
                }
                if (pkhVarResolveStyle.getMultiRowAlign() != null) {
                    c10261c.setMultiRowAlignment(pkhVarResolveStyle.getMultiRowAlign());
                }
            }
        }
    }

    public static hkh buildNode(@hib String str, long j, long j2, @hib pkh pkhVar, @hib String[] strArr, String str2, @hib String str3, @hib hkh hkhVar) {
        return new hkh(str, null, j, j2, pkhVar, strArr, str2, str3, hkhVar);
    }

    public static hkh buildTextNode(String str) {
        return new hkh(null, mkh.m17361a(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static void cleanUpText(SpannableStringBuilder spannableStringBuilder) {
        for (i54 i54Var : (i54[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), i54.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(i54Var), spannableStringBuilder.getSpanEnd(i54Var), "");
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
        boolean zEquals = "p".equals(this.f44014a);
        boolean zEquals2 = "div".equals(this.f44014a);
        if (z || zEquals || (zEquals2 && this.f44022i != null)) {
            long j = this.f44017d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f44018e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f44026m == null) {
            return;
        }
        for (int i = 0; i < this.f44026m.size(); i++) {
            this.f44026m.get(i).getEventTimes(treeSet, z || zEquals);
        }
    }

    private static SpannableStringBuilder getRegionOutputText(String str, Map<String, o93.C10261c> map) {
        if (!map.containsKey(str)) {
            o93.C10261c c10261c = new o93.C10261c();
            c10261c.setText(new SpannableStringBuilder());
            map.put(str, c10261c);
        }
        return (SpannableStringBuilder) u80.checkNotNull(map.get(str).getText());
    }

    private void traverseForImage(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f44021h)) {
            str = this.f44021h;
        }
        if (isActive(j) && "div".equals(this.f44014a) && this.f44022i != null) {
            list.add(new Pair<>(str, this.f44022i));
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            getChild(i).traverseForImage(j, str, list);
        }
    }

    private void traverseForStyle(long j, Map<String, pkh> map, Map<String, kkh> map2, String str, Map<String, o93.C10261c> map3) {
        int i;
        if (isActive(j)) {
            String str2 = "".equals(this.f44021h) ? str : this.f44021h;
            Iterator<Map.Entry<String, Integer>> it = this.f44025l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f44024k.containsKey(key) ? this.f44024k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    applyStyleToOutput(map, (o93.C10261c) u80.checkNotNull(map3.get(key)), iIntValue, iIntValue2, ((kkh) u80.checkNotNull(map2.get(str2))).f54573j);
                }
            }
            while (i < getChildCount()) {
                getChild(i).traverseForStyle(j, map, map2, str2, map3);
                i++;
            }
        }
    }

    private void traverseForText(long j, boolean z, String str, Map<String, o93.C10261c> map) {
        this.f44024k.clear();
        this.f44025l.clear();
        if ("metadata".equals(this.f44014a)) {
            return;
        }
        if (!"".equals(this.f44021h)) {
            str = this.f44021h;
        }
        if (this.f44016c && z) {
            getRegionOutputText(str, map).append((CharSequence) u80.checkNotNull(this.f44015b));
            return;
        }
        if ("br".equals(this.f44014a) && z) {
            getRegionOutputText(str, map).append('\n');
            return;
        }
        if (isActive(j)) {
            for (Map.Entry<String, o93.C10261c> entry : map.entrySet()) {
                this.f44024k.put(entry.getKey(), Integer.valueOf(((CharSequence) u80.checkNotNull(entry.getValue().getText())).length()));
            }
            boolean zEquals = "p".equals(this.f44014a);
            for (int i = 0; i < getChildCount(); i++) {
                getChild(i).traverseForText(j, z || zEquals, str, map);
            }
            if (zEquals) {
                mkh.m17362b(getRegionOutputText(str, map));
            }
            for (Map.Entry<String, o93.C10261c> entry2 : map.entrySet()) {
                this.f44025l.put(entry2.getKey(), Integer.valueOf(((CharSequence) u80.checkNotNull(entry2.getValue().getText())).length()));
            }
        }
    }

    public void addChild(hkh hkhVar) {
        if (this.f44026m == null) {
            this.f44026m = new ArrayList();
        }
        this.f44026m.add(hkhVar);
    }

    public hkh getChild(int i) {
        List<hkh> list = this.f44026m;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getChildCount() {
        List<hkh> list = this.f44026m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<o93> getCues(long j, Map<String, pkh> map, Map<String, kkh> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        traverseForImage(j, this.f44021h, arrayList);
        TreeMap treeMap = new TreeMap();
        traverseForText(j, false, this.f44021h, treeMap);
        traverseForStyle(j, map, map2, this.f44021h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                kkh kkhVar = (kkh) u80.checkNotNull(map2.get(pair.first));
                arrayList2.add(new o93.C10261c().setBitmap(bitmapDecodeByteArray).setPosition(kkhVar.f54565b).setPositionAnchor(0).setLine(kkhVar.f54566c, 0).setLineAnchor(kkhVar.f54568e).setSize(kkhVar.f54569f).setBitmapHeight(kkhVar.f54570g).setVerticalType(kkhVar.f54573j).build());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            kkh kkhVar2 = (kkh) u80.checkNotNull(map2.get(entry.getKey()));
            o93.C10261c c10261c = (o93.C10261c) entry.getValue();
            cleanUpText((SpannableStringBuilder) u80.checkNotNull(c10261c.getText()));
            c10261c.setLine(kkhVar2.f54566c, kkhVar2.f54567d);
            c10261c.setLineAnchor(kkhVar2.f54568e);
            c10261c.setPosition(kkhVar2.f54565b);
            c10261c.setSize(kkhVar2.f54569f);
            c10261c.setTextSize(kkhVar2.f54572i, kkhVar2.f54571h);
            c10261c.setVerticalType(kkhVar2.f54573j);
            arrayList2.add(c10261c.build());
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
        return this.f44020g;
    }

    public boolean isActive(long j) {
        long j2 = this.f44017d;
        return (j2 == -9223372036854775807L && this.f44018e == -9223372036854775807L) || (j2 <= j && this.f44018e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.f44018e) || (j2 <= j && j < this.f44018e));
    }
}
