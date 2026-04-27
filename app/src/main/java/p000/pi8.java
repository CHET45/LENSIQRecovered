package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class pi8 implements lkb {

    /* JADX INFO: renamed from: e */
    public static final char[] f70930e = {sjc.f82027q, 'r', C4584d2.f28247p, 'e'};

    /* JADX INFO: renamed from: f */
    public static final char[] f70931f = {'f', sjc.f82029s, sjc.f82015e, sjc.f82023m, 'e'};

    /* JADX INFO: renamed from: a */
    public final yr5[] f70932a;

    /* JADX INFO: renamed from: b */
    public final yr5[] f70933b;

    /* JADX INFO: renamed from: c */
    public int f70934c;

    /* JADX INFO: renamed from: d */
    public String f70935d;

    public pi8(Class<?> cls) {
        this(cls, (igd) null);
    }

    private static Map<String, String> map(String... strArr) {
        HashMap map = new HashMap();
        for (String str : strArr) {
            map.put(str, str);
        }
        return map;
    }

    public Map<String, Object> getFieldValuesMap(Object obj) throws Exception {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f70933b.length);
        for (yr5 yr5Var : this.f70933b) {
            linkedHashMap.put(yr5Var.f102749a.f55104a, yr5Var.getPropertyValue(obj));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a5 A[Catch: all -> 0x017b, Exception -> 0x0181, TryCatch #6 {Exception -> 0x0181, all -> 0x017b, blocks: (B:103:0x014e, B:105:0x0169, B:107:0x016d, B:116:0x0189, B:117:0x018d, B:119:0x0193, B:125:0x01a5, B:127:0x01ab, B:129:0x01b0, B:142:0x01fd, B:144:0x0203, B:153:0x021e, B:154:0x0222, B:156:0x0228, B:167:0x024e, B:169:0x0252, B:171:0x0259, B:173:0x025d, B:174:0x0262, B:176:0x0266, B:177:0x026b, B:178:0x0272, B:180:0x0278, B:185:0x0292, B:187:0x0296, B:189:0x029d, B:191:0x02a1, B:192:0x02a6, B:194:0x02aa, B:195:0x02af, B:196:0x02b6, B:198:0x02bc, B:204:0x02dc, B:206:0x02e0, B:213:0x02f4, B:215:0x02f8, B:217:0x02fc, B:219:0x0300, B:221:0x0304, B:223:0x0308, B:230:0x031a, B:232:0x031e, B:234:0x0322, B:225:0x030c, B:227:0x0310, B:238:0x0334, B:240:0x033d, B:242:0x0341, B:243:0x0345, B:244:0x0349, B:246:0x035e, B:250:0x036a, B:251:0x036e, B:255:0x0378, B:256:0x037b, B:259:0x0383, B:261:0x038e, B:263:0x0392, B:265:0x0397, B:269:0x03b3, B:270:0x03bd, B:273:0x03c4, B:277:0x03ce, B:282:0x03da, B:284:0x03e0, B:286:0x03e4, B:287:0x03e6, B:289:0x03ee, B:291:0x03f2, B:292:0x03f6, B:295:0x0405, B:296:0x040f, B:297:0x0412, B:299:0x0416, B:300:0x041f, B:303:0x0425, B:304:0x0430, B:309:0x0443, B:311:0x044c, B:314:0x0452, B:315:0x0457, B:316:0x045e, B:318:0x0462, B:319:0x0467, B:320:0x046e, B:323:0x0474, B:325:0x047d, B:330:0x0491, B:331:0x0496, B:332:0x049b, B:333:0x04a6, B:334:0x04ab, B:335:0x04b0, B:146:0x020a, B:148:0x020e, B:149:0x0213, B:151:0x0217, B:130:0x01c0, B:132:0x01c4, B:134:0x01d4, B:136:0x01d8, B:137:0x01e8, B:139:0x01f4, B:344:0x04de, B:345:0x04e2, B:347:0x04e8, B:352:0x04f8, B:354:0x0501, B:357:0x0510, B:359:0x0514, B:360:0x0518), top: B:393:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0405 A[Catch: all -> 0x017b, Exception -> 0x0181, TryCatch #6 {Exception -> 0x0181, all -> 0x017b, blocks: (B:103:0x014e, B:105:0x0169, B:107:0x016d, B:116:0x0189, B:117:0x018d, B:119:0x0193, B:125:0x01a5, B:127:0x01ab, B:129:0x01b0, B:142:0x01fd, B:144:0x0203, B:153:0x021e, B:154:0x0222, B:156:0x0228, B:167:0x024e, B:169:0x0252, B:171:0x0259, B:173:0x025d, B:174:0x0262, B:176:0x0266, B:177:0x026b, B:178:0x0272, B:180:0x0278, B:185:0x0292, B:187:0x0296, B:189:0x029d, B:191:0x02a1, B:192:0x02a6, B:194:0x02aa, B:195:0x02af, B:196:0x02b6, B:198:0x02bc, B:204:0x02dc, B:206:0x02e0, B:213:0x02f4, B:215:0x02f8, B:217:0x02fc, B:219:0x0300, B:221:0x0304, B:223:0x0308, B:230:0x031a, B:232:0x031e, B:234:0x0322, B:225:0x030c, B:227:0x0310, B:238:0x0334, B:240:0x033d, B:242:0x0341, B:243:0x0345, B:244:0x0349, B:246:0x035e, B:250:0x036a, B:251:0x036e, B:255:0x0378, B:256:0x037b, B:259:0x0383, B:261:0x038e, B:263:0x0392, B:265:0x0397, B:269:0x03b3, B:270:0x03bd, B:273:0x03c4, B:277:0x03ce, B:282:0x03da, B:284:0x03e0, B:286:0x03e4, B:287:0x03e6, B:289:0x03ee, B:291:0x03f2, B:292:0x03f6, B:295:0x0405, B:296:0x040f, B:297:0x0412, B:299:0x0416, B:300:0x041f, B:303:0x0425, B:304:0x0430, B:309:0x0443, B:311:0x044c, B:314:0x0452, B:315:0x0457, B:316:0x045e, B:318:0x0462, B:319:0x0467, B:320:0x046e, B:323:0x0474, B:325:0x047d, B:330:0x0491, B:331:0x0496, B:332:0x049b, B:333:0x04a6, B:334:0x04ab, B:335:0x04b0, B:146:0x020a, B:148:0x020e, B:149:0x0213, B:151:0x0217, B:130:0x01c0, B:132:0x01c4, B:134:0x01d4, B:136:0x01d8, B:137:0x01e8, B:139:0x01f4, B:344:0x04de, B:345:0x04e2, B:347:0x04e8, B:352:0x04f8, B:354:0x0501, B:357:0x0510, B:359:0x0514, B:360:0x0518), top: B:393:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0541 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d8 A[Catch: all -> 0x0535, Exception -> 0x0538, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0538, all -> 0x0535, blocks: (B:39:0x0081, B:50:0x009f, B:55:0x00b9, B:73:0x00f7, B:83:0x0115, B:91:0x0128, B:95:0x0132, B:99:0x013c, B:65:0x00d8), top: B:391:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fb A[Catch: all -> 0x0091, Exception -> 0x0096, TRY_ENTER, TryCatch #8 {Exception -> 0x0096, all -> 0x0091, blocks: (B:41:0x0089, B:43:0x008d, B:48:0x009b, B:52:0x00aa, B:54:0x00b3, B:58:0x00c4, B:61:0x00cb, B:63:0x00d2, B:75:0x00fb, B:76:0x00ff, B:78:0x0105, B:86:0x011e, B:67:0x00de, B:69:0x00e9, B:70:0x00f1), top: B:389:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011e A[Catch: all -> 0x0091, Exception -> 0x0096, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0096, all -> 0x0091, blocks: (B:41:0x0089, B:43:0x008d, B:48:0x009b, B:52:0x00aa, B:54:0x00b3, B:58:0x00c4, B:61:0x00cb, B:63:0x00d2, B:75:0x00fb, B:76:0x00ff, B:78:0x0105, B:86:0x011e, B:67:0x00de, B:69:0x00e9, B:70:0x00f1), top: B:389:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0127  */
    @Override // p000.lkb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(p000.ph8 r35, java.lang.Object r36, java.lang.Object r37, java.lang.reflect.Type r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pi8.write(ph8, java.lang.Object, java.lang.Object, java.lang.reflect.Type):void");
    }

    public pi8(Class<?> cls, igd igdVar) {
        this(cls, cls.getModifiers(), null, false, true, true, true, igdVar);
    }

    public pi8(Class<?> cls, String... strArr) {
        this(cls, cls.getModifiers(), map(strArr), false, true, true, true, null);
    }

    public pi8(Class<?> cls, int i, Map<String, String> map, boolean z, boolean z2, boolean z3, boolean z4, igd igdVar) {
        this.f70934c = 0;
        th8 th8Var = z2 ? (th8) cls.getAnnotation(th8.class) : null;
        if (th8Var != null) {
            this.f70934c = a2f.m60of(th8Var.serialzeFeatures());
            String strTypeName = th8Var.typeName();
            this.f70935d = strTypeName;
            if (strTypeName.length() == 0) {
                this.f70935d = null;
            }
        }
        List<kr5> listComputeGetters = qmh.computeGetters(cls, i, z, th8Var, map, false, z3, z4, igdVar);
        ArrayList arrayList = new ArrayList();
        Iterator<kr5> it = listComputeGetters.iterator();
        while (it.hasNext()) {
            arrayList.add(new yr5(it.next()));
        }
        yr5[] yr5VarArr = (yr5[]) arrayList.toArray(new yr5[arrayList.size()]);
        this.f70932a = yr5VarArr;
        String[] strArrOrders = th8Var != null ? th8Var.orders() : null;
        if (strArrOrders != null && strArrOrders.length != 0) {
            List<kr5> listComputeGetters2 = qmh.computeGetters(cls, i, z, th8Var, map, true, z3, z4, igdVar);
            ArrayList arrayList2 = new ArrayList();
            Iterator<kr5> it2 = listComputeGetters2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new yr5(it2.next()));
            }
            this.f70933b = (yr5[]) arrayList2.toArray(new yr5[arrayList2.size()]);
            return;
        }
        yr5[] yr5VarArr2 = new yr5[yr5VarArr.length];
        System.arraycopy(yr5VarArr, 0, yr5VarArr2, 0, yr5VarArr.length);
        Arrays.sort(yr5VarArr2);
        if (Arrays.equals(yr5VarArr2, yr5VarArr)) {
            this.f70933b = yr5VarArr;
        } else {
            this.f70933b = yr5VarArr2;
        }
    }
}
