package p000;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class gre extends tlg {

    /* JADX INFO: renamed from: e */
    public static final String f40847e = "onMetaData";

    /* JADX INFO: renamed from: f */
    public static final String f40848f = "duration";

    /* JADX INFO: renamed from: g */
    public static final String f40849g = "keyframes";

    /* JADX INFO: renamed from: h */
    public static final String f40850h = "filepositions";

    /* JADX INFO: renamed from: i */
    public static final String f40851i = "times";

    /* JADX INFO: renamed from: j */
    public static final int f40852j = 0;

    /* JADX INFO: renamed from: k */
    public static final int f40853k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f40854l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f40855m = 3;

    /* JADX INFO: renamed from: n */
    public static final int f40856n = 8;

    /* JADX INFO: renamed from: o */
    public static final int f40857o = 9;

    /* JADX INFO: renamed from: p */
    public static final int f40858p = 10;

    /* JADX INFO: renamed from: q */
    public static final int f40859q = 11;

    /* JADX INFO: renamed from: b */
    public long f40860b;

    /* JADX INFO: renamed from: c */
    public long[] f40861c;

    /* JADX INFO: renamed from: d */
    public long[] f40862d;

    public gre() {
        super(new ts4());
        this.f40860b = -9223372036854775807L;
        this.f40861c = new long[0];
        this.f40862d = new long[0];
    }

    private static Boolean readAmfBoolean(ihc ihcVar) {
        return Boolean.valueOf(ihcVar.readUnsignedByte() == 1);
    }

    @hib
    private static Object readAmfData(ihc ihcVar, int i) {
        if (i == 0) {
            return readAmfDouble(ihcVar);
        }
        if (i == 1) {
            return readAmfBoolean(ihcVar);
        }
        if (i == 2) {
            return readAmfString(ihcVar);
        }
        if (i == 3) {
            return readAmfObject(ihcVar);
        }
        if (i == 8) {
            return readAmfEcmaArray(ihcVar);
        }
        if (i == 10) {
            return readAmfStrictArray(ihcVar);
        }
        if (i != 11) {
            return null;
        }
        return readAmfDate(ihcVar);
    }

    private static Date readAmfDate(ihc ihcVar) {
        Date date = new Date((long) readAmfDouble(ihcVar).doubleValue());
        ihcVar.skipBytes(2);
        return date;
    }

    private static Double readAmfDouble(ihc ihcVar) {
        return Double.valueOf(Double.longBitsToDouble(ihcVar.readLong()));
    }

    private static HashMap<String, Object> readAmfEcmaArray(ihc ihcVar) {
        int unsignedIntToInt = ihcVar.readUnsignedIntToInt();
        HashMap<String, Object> map = new HashMap<>(unsignedIntToInt);
        for (int i = 0; i < unsignedIntToInt; i++) {
            String amfString = readAmfString(ihcVar);
            Object amfData = readAmfData(ihcVar, readAmfType(ihcVar));
            if (amfData != null) {
                map.put(amfString, amfData);
            }
        }
        return map;
    }

    private static HashMap<String, Object> readAmfObject(ihc ihcVar) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String amfString = readAmfString(ihcVar);
            int amfType = readAmfType(ihcVar);
            if (amfType == 9) {
                return map;
            }
            Object amfData = readAmfData(ihcVar, amfType);
            if (amfData != null) {
                map.put(amfString, amfData);
            }
        }
    }

    private static ArrayList<Object> readAmfStrictArray(ihc ihcVar) {
        int unsignedIntToInt = ihcVar.readUnsignedIntToInt();
        ArrayList<Object> arrayList = new ArrayList<>(unsignedIntToInt);
        for (int i = 0; i < unsignedIntToInt; i++) {
            Object amfData = readAmfData(ihcVar, readAmfType(ihcVar));
            if (amfData != null) {
                arrayList.add(amfData);
            }
        }
        return arrayList;
    }

    private static String readAmfString(ihc ihcVar) {
        int unsignedShort = ihcVar.readUnsignedShort();
        int position = ihcVar.getPosition();
        ihcVar.skipBytes(unsignedShort);
        return new String(ihcVar.getData(), position, unsignedShort);
    }

    private static int readAmfType(ihc ihcVar) {
        return ihcVar.readUnsignedByte();
    }

    @Override // p000.tlg
    /* JADX INFO: renamed from: a */
    public boolean mo3841a(ihc ihcVar) {
        return true;
    }

    @Override // p000.tlg
    /* JADX INFO: renamed from: b */
    public boolean mo3842b(ihc ihcVar, long j) {
        if (readAmfType(ihcVar) != 2 || !"onMetaData".equals(readAmfString(ihcVar)) || ihcVar.bytesLeft() == 0 || readAmfType(ihcVar) != 8) {
            return false;
        }
        HashMap<String, Object> amfEcmaArray = readAmfEcmaArray(ihcVar);
        Object obj = amfEcmaArray.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f40860b = (long) (dDoubleValue * 1000000.0d);
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
                this.f40861c = new long[size];
                this.f40862d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f40861c = new long[0];
                        this.f40862d = new long[0];
                        break;
                    }
                    this.f40861c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f40862d[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long getDurationUs() {
        return this.f40860b;
    }

    public long[] getKeyFrameTagPositions() {
        return this.f40862d;
    }

    public long[] getKeyFrameTimesUs() {
        return this.f40861c;
    }

    @Override // p000.tlg
    public void seek() {
    }
}
