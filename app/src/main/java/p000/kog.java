package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class kog {

    /* JADX INFO: renamed from: a */
    public final bi7 f54874a;

    /* JADX INFO: renamed from: b */
    public bi7 f54875b;

    /* JADX INFO: renamed from: c */
    public List<bi7> f54876c;

    /* JADX INFO: renamed from: d */
    public List<bi7> f54877d;

    /* JADX INFO: renamed from: e */
    public Map<bi7, Double> f54878e;

    private kog() {
        throw new UnsupportedOperationException();
    }

    private bi7 getColdest() {
        return getHctsByTemp().get(0);
    }

    private List<bi7> getHctsByHue() {
        List<bi7> list = this.f54877d;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            arrayList.add(bi7.from(d, this.f54874a.getChroma(), this.f54874a.getTone()));
        }
        List<bi7> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.f54877d = listUnmodifiableList;
        return listUnmodifiableList;
    }

    private List<bi7> getHctsByTemp() {
        List<bi7> list = this.f54876c;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(getHctsByHue());
        arrayList.add(this.f54874a);
        Collections.sort(arrayList, Comparator.comparing(new Function() { // from class: iog
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f47809a.lambda$getHctsByTemp$0((bi7) obj);
            }
        }, new Comparator() { // from class: jog
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Double) obj).compareTo((Double) obj2);
            }
        }));
        this.f54876c = arrayList;
        return arrayList;
    }

    private Map<bi7, Double> getTempsByHct() {
        Map<bi7, Double> map = this.f54878e;
        if (map != null) {
            return map;
        }
        ArrayList<bi7> arrayList = new ArrayList(getHctsByHue());
        arrayList.add(this.f54874a);
        HashMap map2 = new HashMap();
        for (bi7 bi7Var : arrayList) {
            map2.put(bi7Var, Double.valueOf(rawTemperature(bi7Var)));
        }
        this.f54878e = map2;
        return map2;
    }

    private bi7 getWarmest() {
        return getHctsByTemp().get(getHctsByTemp().size() - 1);
    }

    private static boolean isBetween(double d, double d2, double d3) {
        return d2 < d3 ? d2 <= d && d <= d3 : d2 <= d || d <= d3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$getHctsByTemp$0(bi7 bi7Var) {
        return getTempsByHct().get(bi7Var);
    }

    public static double rawTemperature(bi7 bi7Var) {
        double[] dArrLabFromArgb = xa2.labFromArgb(bi7Var.toInt());
        return ((Math.pow(Math.hypot(dArrLabFromArgb[1], dArrLabFromArgb[2]), 1.07d) * 0.02d) * Math.cos(Math.toRadians(s3a.sanitizeDegreesDouble(s3a.sanitizeDegreesDouble(Math.toDegrees(Math.atan2(dArrLabFromArgb[2], dArrLabFromArgb[1]))) - 50.0d)))) - 0.5d;
    }

    public List<bi7> getAnalogousColors() {
        return getAnalogousColors(5, 12);
    }

    public bi7 getComplement() {
        bi7 bi7Var = this.f54875b;
        if (bi7Var != null) {
            return bi7Var;
        }
        double hue = getColdest().getHue();
        double dDoubleValue = getTempsByHct().get(getColdest()).doubleValue();
        double hue2 = getWarmest().getHue();
        double dDoubleValue2 = getTempsByHct().get(getWarmest()).doubleValue() - dDoubleValue;
        boolean zIsBetween = isBetween(this.f54874a.getHue(), hue, hue2);
        double d = zIsBetween ? hue2 : hue;
        if (!zIsBetween) {
            hue = hue2;
        }
        bi7 bi7Var2 = getHctsByHue().get((int) Math.round(this.f54874a.getHue()));
        double relativeTemperature = 1.0d - getRelativeTemperature(this.f54874a);
        double d2 = 1000.0d;
        for (double d3 = 0.0d; d3 <= 360.0d; d3 += 1.0d) {
            double dSanitizeDegreesDouble = s3a.sanitizeDegreesDouble(d + (1.0d * d3));
            if (isBetween(dSanitizeDegreesDouble, d, hue)) {
                bi7 bi7Var3 = getHctsByHue().get((int) Math.round(dSanitizeDegreesDouble));
                double dAbs = Math.abs(relativeTemperature - ((getTempsByHct().get(bi7Var3).doubleValue() - dDoubleValue) / dDoubleValue2));
                if (dAbs < d2) {
                    bi7Var2 = bi7Var3;
                    d2 = dAbs;
                }
            }
        }
        this.f54875b = bi7Var2;
        return bi7Var2;
    }

    public double getRelativeTemperature(bi7 bi7Var) {
        double dDoubleValue = getTempsByHct().get(getWarmest()).doubleValue() - getTempsByHct().get(getColdest()).doubleValue();
        double dDoubleValue2 = getTempsByHct().get(bi7Var).doubleValue() - getTempsByHct().get(getColdest()).doubleValue();
        if (dDoubleValue == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue2 / dDoubleValue;
    }

    public List<bi7> getAnalogousColors(int i, int i2) {
        int iRound = (int) Math.round(this.f54874a.getHue());
        bi7 bi7Var = getHctsByHue().get(iRound);
        double relativeTemperature = getRelativeTemperature(bi7Var);
        ArrayList arrayList = new ArrayList();
        arrayList.add(bi7Var);
        double dAbs = 0.0d;
        double dAbs2 = 0.0d;
        int i3 = 0;
        while (i3 < 360) {
            double relativeTemperature2 = getRelativeTemperature(getHctsByHue().get(s3a.sanitizeDegreesInt(iRound + i3)));
            dAbs2 += Math.abs(relativeTemperature2 - relativeTemperature);
            i3++;
            relativeTemperature = relativeTemperature2;
        }
        double d = dAbs2 / ((double) i2);
        double relativeTemperature3 = getRelativeTemperature(bi7Var);
        int i4 = 1;
        while (true) {
            if (arrayList.size() >= i2) {
                break;
            }
            bi7 bi7Var2 = getHctsByHue().get(s3a.sanitizeDegreesInt(iRound + i4));
            double relativeTemperature4 = getRelativeTemperature(bi7Var2);
            dAbs += Math.abs(relativeTemperature4 - relativeTemperature3);
            boolean z = dAbs >= ((double) arrayList.size()) * d;
            int i5 = 1;
            while (z && arrayList.size() < i2) {
                arrayList.add(bi7Var2);
                z = dAbs >= ((double) (arrayList.size() + i5)) * d;
                i5++;
            }
            i4++;
            if (i4 > 360) {
                while (arrayList.size() < i2) {
                    arrayList.add(bi7Var2);
                }
            } else {
                relativeTemperature3 = relativeTemperature4;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f54874a);
        int iFloor = (int) Math.floor((((double) i) - 1.0d) / 2.0d);
        for (int i6 = 1; i6 < iFloor + 1; i6++) {
            int size = 0 - i6;
            while (size < 0) {
                size += arrayList.size();
            }
            if (size >= arrayList.size()) {
                size %= arrayList.size();
            }
            arrayList2.add(0, (bi7) arrayList.get(size));
        }
        int i7 = i - iFloor;
        for (int i8 = 1; i8 < i7; i8++) {
            int size2 = i8;
            while (size2 < 0) {
                size2 += arrayList.size();
            }
            if (size2 >= arrayList.size()) {
                size2 %= arrayList.size();
            }
            arrayList2.add((bi7) arrayList.get(size2));
        }
        return arrayList2;
    }

    public kog(bi7 bi7Var) {
        this.f54874a = bi7Var;
    }
}
