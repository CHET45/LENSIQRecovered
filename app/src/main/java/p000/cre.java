package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class cre {

    /* JADX INFO: renamed from: a */
    public static final double f27137a = 15.0d;

    /* JADX INFO: renamed from: b */
    public static final double f27138b = 0.01d;

    /* JADX INFO: renamed from: c */
    public static final double f27139c = 10.0d;

    /* JADX INFO: renamed from: d */
    public static final double f27140d = 48.0d;

    /* JADX INFO: renamed from: e */
    public static final double f27141e = 0.7d;

    /* JADX INFO: renamed from: f */
    public static final double f27142f = 0.3d;

    /* JADX INFO: renamed from: g */
    public static final double f27143g = 0.1d;

    /* JADX INFO: renamed from: cre$a */
    public static class C4470a implements Comparator<Map.Entry<Integer, Double>> {
        @Override // java.util.Comparator
        public int compare(Map.Entry<Integer, Double> entry, Map.Entry<Integer, Double> entry2) {
            return -entry.getValue().compareTo(entry2.getValue());
        }
    }

    private cre() {
    }

    private static List<Integer> filter(Map<Integer, Double> map, Map<Integer, xo1> map2) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, xo1> entry : map2.entrySet()) {
            Integer key = entry.getKey();
            int iIntValue = key.intValue();
            xo1 value = entry.getValue();
            double dDoubleValue = map.get(key).doubleValue();
            if (value.getChroma() >= 15.0d && xa2.lstarFromArgb(iIntValue) >= 10.0d && dDoubleValue >= 0.01d) {
                arrayList.add(key);
            }
        }
        return arrayList;
    }

    public static List<Integer> score(Map<Integer, Integer> map) {
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        double dIntValue = 0.0d;
        while (it.hasNext()) {
            dIntValue += (double) it.next().getValue().intValue();
        }
        HashMap map2 = new HashMap();
        double[] dArr = new double[361];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            int iIntValue = key.intValue();
            double dIntValue2 = ((double) entry.getValue().intValue()) / dIntValue;
            xo1 xo1VarFromInt = xo1.fromInt(iIntValue);
            map2.put(key, xo1VarFromInt);
            int iRound = (int) Math.round(xo1VarFromInt.getHue());
            dArr[iRound] = dArr[iRound] + dIntValue2;
        }
        HashMap map3 = new HashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            Integer num = (Integer) entry2.getKey();
            num.intValue();
            int iRound2 = (int) Math.round(((xo1) entry2.getValue()).getHue());
            double d = 0.0d;
            for (int i = iRound2 - 15; i < iRound2 + 15; i++) {
                d += dArr[s3a.sanitizeDegreesInt(i)];
            }
            map3.put(num, Double.valueOf(d));
        }
        HashMap map4 = new HashMap();
        for (Map.Entry entry3 : map2.entrySet()) {
            Integer num2 = (Integer) entry3.getKey();
            num2.intValue();
            xo1 xo1Var = (xo1) entry3.getValue();
            map4.put(num2, Double.valueOf((((Double) map3.get(num2)).doubleValue() * 100.0d * 0.7d) + ((xo1Var.getChroma() - 48.0d) * (xo1Var.getChroma() < 48.0d ? 0.1d : 0.3d))));
        }
        List<Integer> listFilter = filter(map3, map2);
        HashMap map5 = new HashMap();
        for (Integer num3 : listFilter) {
            num3.intValue();
            map5.put(num3, (Double) map4.get(num3));
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(map5.entrySet());
        Collections.sort(arrayList, new C4470a());
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry4 : arrayList) {
            Integer num4 = (Integer) entry4.getKey();
            num4.intValue();
            xo1 xo1Var2 = (xo1) map2.get(num4);
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList2.add((Integer) entry4.getKey());
                    break;
                }
                if (s3a.differenceDegrees(xo1Var2.getHue(), ((xo1) map2.get((Integer) it2.next())).getHue()) < 15.0d) {
                    break;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(-12417548);
        }
        return arrayList2;
    }
}
