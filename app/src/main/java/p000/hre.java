package p000;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class hre extends slg {

    /* JADX INFO: renamed from: e */
    public static final String f44646e = "onMetaData";

    /* JADX INFO: renamed from: f */
    public static final String f44647f = "duration";

    /* JADX INFO: renamed from: g */
    public static final String f44648g = "keyframes";

    /* JADX INFO: renamed from: h */
    public static final String f44649h = "filepositions";

    /* JADX INFO: renamed from: i */
    public static final String f44650i = "times";

    /* JADX INFO: renamed from: j */
    public static final int f44651j = 0;

    /* JADX INFO: renamed from: k */
    public static final int f44652k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f44653l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f44654m = 3;

    /* JADX INFO: renamed from: n */
    public static final int f44655n = 8;

    /* JADX INFO: renamed from: o */
    public static final int f44656o = 9;

    /* JADX INFO: renamed from: p */
    public static final int f44657p = 10;

    /* JADX INFO: renamed from: q */
    public static final int f44658q = 11;

    /* JADX INFO: renamed from: b */
    public long f44659b;

    /* JADX INFO: renamed from: c */
    public long[] f44660c;

    /* JADX INFO: renamed from: d */
    public long[] f44661d;

    public hre() {
        super(new yd4());
        this.f44659b = -9223372036854775807L;
        this.f44660c = new long[0];
        this.f44661d = new long[0];
    }

    private static Boolean readAmfBoolean(jhc jhcVar) {
        return Boolean.valueOf(jhcVar.readUnsignedByte() == 1);
    }

    @hib
    private static Object readAmfData(jhc jhcVar, int i) {
        if (i == 0) {
            return readAmfDouble(jhcVar);
        }
        if (i == 1) {
            return readAmfBoolean(jhcVar);
        }
        if (i == 2) {
            return readAmfString(jhcVar);
        }
        if (i == 3) {
            return readAmfObject(jhcVar);
        }
        if (i == 8) {
            return readAmfEcmaArray(jhcVar);
        }
        if (i == 10) {
            return readAmfStrictArray(jhcVar);
        }
        if (i != 11) {
            return null;
        }
        return readAmfDate(jhcVar);
    }

    private static Date readAmfDate(jhc jhcVar) {
        Date date = new Date((long) readAmfDouble(jhcVar).doubleValue());
        jhcVar.skipBytes(2);
        return date;
    }

    private static Double readAmfDouble(jhc jhcVar) {
        return Double.valueOf(Double.longBitsToDouble(jhcVar.readLong()));
    }

    private static HashMap<String, Object> readAmfEcmaArray(jhc jhcVar) {
        int unsignedIntToInt = jhcVar.readUnsignedIntToInt();
        HashMap<String, Object> map = new HashMap<>(unsignedIntToInt);
        for (int i = 0; i < unsignedIntToInt; i++) {
            String amfString = readAmfString(jhcVar);
            Object amfData = readAmfData(jhcVar, readAmfType(jhcVar));
            if (amfData != null) {
                map.put(amfString, amfData);
            }
        }
        return map;
    }

    private static HashMap<String, Object> readAmfObject(jhc jhcVar) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String amfString = readAmfString(jhcVar);
            int amfType = readAmfType(jhcVar);
            if (amfType == 9) {
                return map;
            }
            Object amfData = readAmfData(jhcVar, amfType);
            if (amfData != null) {
                map.put(amfString, amfData);
            }
        }
    }

    private static ArrayList<Object> readAmfStrictArray(jhc jhcVar) {
        int unsignedIntToInt = jhcVar.readUnsignedIntToInt();
        ArrayList<Object> arrayList = new ArrayList<>(unsignedIntToInt);
        for (int i = 0; i < unsignedIntToInt; i++) {
            Object amfData = readAmfData(jhcVar, readAmfType(jhcVar));
            if (amfData != null) {
                arrayList.add(amfData);
            }
        }
        return arrayList;
    }

    private static String readAmfString(jhc jhcVar) {
        int unsignedShort = jhcVar.readUnsignedShort();
        int position = jhcVar.getPosition();
        jhcVar.skipBytes(unsignedShort);
        return new String(jhcVar.getData(), position, unsignedShort);
    }

    private static int readAmfType(jhc jhcVar) {
        return jhcVar.readUnsignedByte();
    }

    @Override // p000.slg
    /* JADX INFO: renamed from: a */
    public boolean mo8983a(jhc jhcVar) {
        return true;
    }

    @Override // p000.slg
    /* JADX INFO: renamed from: b */
    public boolean mo8984b(jhc jhcVar, long j) {
        if (readAmfType(jhcVar) != 2 || !"onMetaData".equals(readAmfString(jhcVar)) || jhcVar.bytesLeft() == 0 || readAmfType(jhcVar) != 8) {
            return false;
        }
        HashMap<String, Object> amfEcmaArray = readAmfEcmaArray(jhcVar);
        Object obj = amfEcmaArray.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f44659b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = amfEcmaArray.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f44660c = new long[size];
                this.f44661d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f44660c = new long[0];
                        this.f44661d = new long[0];
                        break;
                    }
                    this.f44660c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f44661d[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long getDurationUs() {
        return this.f44659b;
    }

    public long[] getKeyFrameTagPositions() {
        return this.f44661d;
    }

    public long[] getKeyFrameTimesUs() {
        return this.f44660c;
    }

    @Override // p000.slg
    public void seek() {
    }
}
