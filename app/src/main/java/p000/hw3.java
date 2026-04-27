package p000;

import java.io.Closeable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public class hw3 implements Closeable {

    /* JADX INFO: renamed from: Q */
    public static final int f45121Q = 0;

    /* JADX INFO: renamed from: X */
    public static final int f45122X = 1;

    /* JADX INFO: renamed from: Y */
    public static final int f45123Y = 2;

    /* JADX INFO: renamed from: C */
    public int f45124C;

    /* JADX INFO: renamed from: F */
    public List<C7064a> f45125F;

    /* JADX INFO: renamed from: H */
    public int f45126H;

    /* JADX INFO: renamed from: L */
    public List<wj5> f45127L;

    /* JADX INFO: renamed from: M */
    public List<uj5> f45128M;

    /* JADX INFO: renamed from: N */
    public es5 f45129N;

    /* JADX INFO: renamed from: a */
    public final rhg f45130a;

    /* JADX INFO: renamed from: b */
    public whc f45131b;

    /* JADX INFO: renamed from: c */
    public String f45132c;

    /* JADX INFO: renamed from: d */
    public DateFormat f45133d;

    /* JADX INFO: renamed from: e */
    public final lh8 f45134e;

    /* JADX INFO: renamed from: f */
    public mhc f45135f;

    /* JADX INFO: renamed from: m */
    public mhc[] f45136m;

    /* JADX INFO: renamed from: hw3$a */
    public static class C7064a {

        /* JADX INFO: renamed from: a */
        public final mhc f45137a;

        /* JADX INFO: renamed from: b */
        public final String f45138b;

        /* JADX INFO: renamed from: c */
        public er5 f45139c;

        /* JADX INFO: renamed from: d */
        public mhc f45140d;

        public C7064a(mhc mhcVar, String str) {
            this.f45137a = mhcVar;
            this.f45138b = str;
        }
    }

    public hw3(String str) {
        this(str, whc.f94265e, fh8.f36585d);
    }

    /* JADX INFO: renamed from: a */
    public void m12640a(C7064a c7064a) {
        if (this.f45125F == null) {
            this.f45125F = new ArrayList(2);
        }
        this.f45125F.add(c7064a);
    }

    public final void accept(int i) {
        lh8 lh8Var = this.f45134e;
        if (lh8Var.f57601a == i) {
            lh8Var.nextToken();
            return;
        }
        throw new jh8("syntax error, expect " + sh8.name(i) + ", actual " + sh8.name(this.f45134e.f57601a));
    }

    /* JADX INFO: renamed from: b */
    public void m12641b(Collection collection) {
        if (collection instanceof List) {
            C7064a c7064aM12643d = m12643d();
            c7064aM12643d.f45139c = new p5e(this, (List) collection, collection.size() - 1);
            c7064aM12643d.f45140d = this.f45135f;
            this.f45126H = 0;
            return;
        }
        C7064a c7064aM12643d2 = m12643d();
        c7064aM12643d2.f45139c = new p5e(collection);
        c7064aM12643d2.f45140d = this.f45135f;
        this.f45126H = 0;
    }

    /* JADX INFO: renamed from: c */
    public void m12642c(Map map, Object obj) {
        p5e p5eVar = new p5e(map, obj);
        C7064a c7064aM12643d = m12643d();
        c7064aM12643d.f45139c = p5eVar;
        c7064aM12643d.f45140d = this.f45135f;
        this.f45126H = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            lh8 lh8Var = this.f45134e;
            if ((lh8Var.f57603c & rp5.AutoCloseSource.f78973a) != 0 && lh8Var.f57601a != 20) {
                throw new jh8("not close json text, token : " + sh8.name(this.f45134e.f57601a));
            }
            lh8Var.close();
        } catch (Throwable th) {
            this.f45134e.close();
            throw th;
        }
    }

    public void config(rp5 rp5Var, boolean z) {
        this.f45134e.config(rp5Var, z);
    }

    /* JADX INFO: renamed from: d */
    public C7064a m12643d() {
        return this.f45125F.get(r0.size() - 1);
    }

    /* JADX INFO: renamed from: e */
    public void m12644e() {
        this.f45135f = this.f45135f.f61021b;
        mhc[] mhcVarArr = this.f45136m;
        int i = this.f45124C;
        mhcVarArr[i - 1] = null;
        this.f45124C = i - 1;
    }

    /* JADX INFO: renamed from: f */
    public mhc m12645f(mhc mhcVar, Object obj, Object obj2) {
        if (this.f45134e.f57618r) {
            return null;
        }
        this.f45135f = new mhc(mhcVar, obj, obj2);
        int i = this.f45124C;
        this.f45124C = i + 1;
        mhc[] mhcVarArr = this.f45136m;
        if (mhcVarArr == null) {
            this.f45136m = new mhc[8];
        } else if (i >= mhcVarArr.length) {
            mhc[] mhcVarArr2 = new mhc[(mhcVarArr.length * 3) / 2];
            System.arraycopy(mhcVarArr, 0, mhcVarArr2, 0, mhcVarArr.length);
            this.f45136m = mhcVarArr2;
        }
        mhc[] mhcVarArr3 = this.f45136m;
        mhc mhcVar2 = this.f45135f;
        mhcVarArr3[i] = mhcVar2;
        return mhcVar2;
    }

    public String getDateFomartPattern() {
        return this.f45132c;
    }

    public DateFormat getDateFormat() {
        if (this.f45133d == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.f45132c, this.f45134e.f57612l);
            this.f45133d = simpleDateFormat;
            simpleDateFormat.setTimeZone(this.f45134e.f57611k);
        }
        return this.f45133d;
    }

    public List<uj5> getExtraProcessors() {
        if (this.f45128M == null) {
            this.f45128M = new ArrayList(2);
        }
        return this.f45128M;
    }

    public List<wj5> getExtraTypeProviders() {
        if (this.f45127L == null) {
            this.f45127L = new ArrayList(2);
        }
        return this.f45127L;
    }

    public void handleResovleTask(Object obj) {
        List<C7064a> list = this.f45125F;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C7064a c7064a = this.f45125F.get(i);
            er5 er5Var = c7064a.f45139c;
            if (er5Var != null) {
                mhc mhcVar = c7064a.f45140d;
                Object obj2 = null;
                Object obj3 = mhcVar != null ? mhcVar.f61020a : null;
                String str = c7064a.f45138b;
                if (str.startsWith("$")) {
                    for (int i2 = 0; i2 < this.f45124C; i2++) {
                        if (str.equals(this.f45136m[i2].toString())) {
                            obj2 = this.f45136m[i2].f61020a;
                        }
                    }
                } else {
                    obj2 = c7064a.f45137a.f61020a;
                }
                er5Var.setValue(obj3, obj2);
            }
        }
    }

    public Object parse() {
        return parse(null);
    }

    public <T> List<T> parseArray(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        parseArray((Class<?>) cls, (Collection) arrayList);
        return arrayList;
    }

    public Object parseArrayWithType(Type type) {
        lh8 lh8Var = this.f45134e;
        if (lh8Var.f57601a == 8) {
            lh8Var.nextToken();
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        if (actualTypeArguments.length != 1) {
            throw new jh8("not support type " + type);
        }
        Type type2 = actualTypeArguments[0];
        if (type2 instanceof Class) {
            ArrayList arrayList = new ArrayList();
            parseArray((Class<?>) type2, (Collection) arrayList);
            return arrayList;
        }
        if (type2 instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type2;
            Type type3 = wildcardType.getUpperBounds()[0];
            if (!Object.class.equals(type3)) {
                ArrayList arrayList2 = new ArrayList();
                parseArray((Class<?>) type3, (Collection) arrayList2);
                return arrayList2;
            }
            if (wildcardType.getLowerBounds().length == 0) {
                return parse();
            }
            throw new jh8("not support type : " + type);
        }
        if (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length != 1) {
                throw new jh8("not support : " + typeVariable);
            }
            Type type4 = bounds[0];
            if (type4 instanceof Class) {
                ArrayList arrayList3 = new ArrayList();
                parseArray((Class<?>) type4, (Collection) arrayList3);
                return arrayList3;
            }
        }
        if (type2 instanceof ParameterizedType) {
            ArrayList arrayList4 = new ArrayList();
            parseArray((ParameterizedType) type2, arrayList4);
            return arrayList4;
        }
        throw new jh8("TODO : " + type);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x028a, code lost:
    
        r4.nextToken(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0291, code lost:
    
        if (r4.f57601a != 13) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0293, code lost:
    
        r4.nextToken(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0296, code lost:
    
        r0 = r19.f45131b.getDeserializer(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x029e, code lost:
    
        if ((r0 instanceof p000.ni8) == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02a0, code lost:
    
        r0 = ((p000.ni8) r0).m17965a(r19, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02a7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02a9, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02aa, code lost:
    
        if (r0 != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02ae, code lost:
    
        if (r7 != java.lang.Cloneable.class) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02b0, code lost:
    
        r0 = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02bc, code lost:
    
        if ("java.util.Collections$EmptyMap".equals(r6) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02be, code lost:
    
        r0 = java.util.Collections.emptyMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02c3, code lost:
    
        r0 = r7.newInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02c7, code lost:
    
        if (r14 != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02c9, code lost:
    
        r19.f45135f = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02cb, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02d3, code lost:
    
        throw new p000.jh8("create instance error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02d4, code lost:
    
        r19.f45126H = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02d9, code lost:
    
        if (r19.f45135f == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02dd, code lost:
    
        if ((r21 instanceof java.lang.Integer) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02df, code lost:
    
        m12644e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02e6, code lost:
    
        if (r20.size() <= 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02e8, code lost:
    
        r0 = p000.qmh.cast((java.lang.Object) r20, (java.lang.Class<java.lang.Object>) r7, r19.f45131b);
        parseObject(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02f1, code lost:
    
        if (r14 != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02f3, code lost:
    
        r19.f45135f = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02f5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02f6, code lost:
    
        r0 = r19.f45131b.getDeserializer(r7).deserialze(r19, r7, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0300, code lost:
    
        if (r14 != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0302, code lost:
    
        r19.f45135f = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0304, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x021e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:21:0x0066, B:24:0x0070, B:29:0x007d, B:31:0x0086, B:35:0x0097, B:37:0x00a1, B:40:0x00a9, B:41:0x00c7, B:115:0x021e, B:119:0x0230, B:135:0x024f, B:139:0x025e, B:141:0x0264, B:143:0x026c, B:145:0x027e, B:146:0x028a, B:148:0x0293, B:149:0x0296, B:151:0x02a0, B:158:0x02b0, B:159:0x02b6, B:161:0x02be, B:162:0x02c3, B:166:0x02cc, B:167:0x02d3, B:168:0x02d4, B:170:0x02db, B:172:0x02df, B:173:0x02e2, B:175:0x02e8, B:179:0x02f6, B:185:0x030a, B:187:0x0312, B:189:0x0319, B:191:0x0328, B:193:0x032c, B:195:0x0332, B:198:0x0337, B:200:0x033b, B:219:0x0385, B:221:0x0389, B:225:0x0393, B:226:0x03ab, B:201:0x033e, B:203:0x0346, B:206:0x034c, B:207:0x0358, B:210:0x0361, B:213:0x0367, B:216:0x036d, B:217:0x0379, B:227:0x03ac, B:228:0x03c8, B:231:0x03cd, B:237:0x03df, B:239:0x03e5, B:241:0x03f1, B:242:0x03f7, B:244:0x03fc, B:342:0x058f, B:346:0x0599, B:349:0x05a2, B:353:0x05b5, B:352:0x05af, B:356:0x05bf, B:360:0x05d2, B:362:0x05db, B:366:0x05ee, B:383:0x0636, B:365:0x05e8, B:369:0x05f9, B:373:0x060c, B:372:0x0606, B:376:0x0617, B:380:0x062a, B:379:0x0624, B:381:0x0631, B:359:0x05cc, B:387:0x0640, B:388:0x0658, B:245:0x0400, B:253:0x0413, B:256:0x041f, B:260:0x0436, B:262:0x043f, B:266:0x044b, B:268:0x0455, B:270:0x045c, B:272:0x0460, B:280:0x0475, B:281:0x048d, B:269:0x0459, B:265:0x0448, B:259:0x0430, B:284:0x0492, B:288:0x04a5, B:290:0x04b6, B:294:0x04ca, B:296:0x04d0, B:299:0x04d6, B:301:0x04e0, B:303:0x04e8, B:307:0x04fa, B:310:0x0502, B:311:0x0504, B:313:0x0509, B:315:0x0512, B:318:0x051b, B:319:0x051e, B:321:0x0524, B:323:0x052b, B:330:0x0538, B:331:0x0550, B:316:0x0516, B:291:0x04c1, B:287:0x049f, B:334:0x0557, B:336:0x0563, B:339:0x0576, B:341:0x0582, B:389:0x0659, B:391:0x066a, B:392:0x066e, B:394:0x0677, B:401:0x068e, B:402:0x06a6, B:118:0x022a, B:138:0x0259, B:46:0x00d1, B:50:0x00e4, B:49:0x00de, B:56:0x00f7, B:58:0x0100, B:60:0x010a, B:61:0x010d, B:64:0x0112, B:65:0x0128, B:66:0x0129, B:67:0x0141, B:80:0x015a, B:81:0x015f, B:83:0x0164, B:86:0x0171, B:87:0x0175, B:90:0x017b, B:91:0x0193, B:84:0x0169, B:92:0x0194, B:93:0x01ac, B:99:0x01b6, B:101:0x01bf, B:104:0x01ce, B:105:0x01d4, B:106:0x01f2, B:107:0x01f3, B:108:0x020b, B:109:0x020c, B:111:0x0215, B:403:0x06a7, B:404:0x06bf, B:405:0x06c0, B:406:0x06d8), top: B:410:0x0066, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0259 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:21:0x0066, B:24:0x0070, B:29:0x007d, B:31:0x0086, B:35:0x0097, B:37:0x00a1, B:40:0x00a9, B:41:0x00c7, B:115:0x021e, B:119:0x0230, B:135:0x024f, B:139:0x025e, B:141:0x0264, B:143:0x026c, B:145:0x027e, B:146:0x028a, B:148:0x0293, B:149:0x0296, B:151:0x02a0, B:158:0x02b0, B:159:0x02b6, B:161:0x02be, B:162:0x02c3, B:166:0x02cc, B:167:0x02d3, B:168:0x02d4, B:170:0x02db, B:172:0x02df, B:173:0x02e2, B:175:0x02e8, B:179:0x02f6, B:185:0x030a, B:187:0x0312, B:189:0x0319, B:191:0x0328, B:193:0x032c, B:195:0x0332, B:198:0x0337, B:200:0x033b, B:219:0x0385, B:221:0x0389, B:225:0x0393, B:226:0x03ab, B:201:0x033e, B:203:0x0346, B:206:0x034c, B:207:0x0358, B:210:0x0361, B:213:0x0367, B:216:0x036d, B:217:0x0379, B:227:0x03ac, B:228:0x03c8, B:231:0x03cd, B:237:0x03df, B:239:0x03e5, B:241:0x03f1, B:242:0x03f7, B:244:0x03fc, B:342:0x058f, B:346:0x0599, B:349:0x05a2, B:353:0x05b5, B:352:0x05af, B:356:0x05bf, B:360:0x05d2, B:362:0x05db, B:366:0x05ee, B:383:0x0636, B:365:0x05e8, B:369:0x05f9, B:373:0x060c, B:372:0x0606, B:376:0x0617, B:380:0x062a, B:379:0x0624, B:381:0x0631, B:359:0x05cc, B:387:0x0640, B:388:0x0658, B:245:0x0400, B:253:0x0413, B:256:0x041f, B:260:0x0436, B:262:0x043f, B:266:0x044b, B:268:0x0455, B:270:0x045c, B:272:0x0460, B:280:0x0475, B:281:0x048d, B:269:0x0459, B:265:0x0448, B:259:0x0430, B:284:0x0492, B:288:0x04a5, B:290:0x04b6, B:294:0x04ca, B:296:0x04d0, B:299:0x04d6, B:301:0x04e0, B:303:0x04e8, B:307:0x04fa, B:310:0x0502, B:311:0x0504, B:313:0x0509, B:315:0x0512, B:318:0x051b, B:319:0x051e, B:321:0x0524, B:323:0x052b, B:330:0x0538, B:331:0x0550, B:316:0x0516, B:291:0x04c1, B:287:0x049f, B:334:0x0557, B:336:0x0563, B:339:0x0576, B:341:0x0582, B:389:0x0659, B:391:0x066a, B:392:0x066e, B:394:0x0677, B:401:0x068e, B:402:0x06a6, B:118:0x022a, B:138:0x0259, B:46:0x00d1, B:50:0x00e4, B:49:0x00de, B:56:0x00f7, B:58:0x0100, B:60:0x010a, B:61:0x010d, B:64:0x0112, B:65:0x0128, B:66:0x0129, B:67:0x0141, B:80:0x015a, B:81:0x015f, B:83:0x0164, B:86:0x0171, B:87:0x0175, B:90:0x017b, B:91:0x0193, B:84:0x0169, B:92:0x0194, B:93:0x01ac, B:99:0x01b6, B:101:0x01bf, B:104:0x01ce, B:105:0x01d4, B:106:0x01f2, B:107:0x01f3, B:108:0x020b, B:109:0x020c, B:111:0x0215, B:403:0x06a7, B:404:0x06bf, B:405:0x06c0, B:406:0x06d8), top: B:410:0x0066, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0264 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:21:0x0066, B:24:0x0070, B:29:0x007d, B:31:0x0086, B:35:0x0097, B:37:0x00a1, B:40:0x00a9, B:41:0x00c7, B:115:0x021e, B:119:0x0230, B:135:0x024f, B:139:0x025e, B:141:0x0264, B:143:0x026c, B:145:0x027e, B:146:0x028a, B:148:0x0293, B:149:0x0296, B:151:0x02a0, B:158:0x02b0, B:159:0x02b6, B:161:0x02be, B:162:0x02c3, B:166:0x02cc, B:167:0x02d3, B:168:0x02d4, B:170:0x02db, B:172:0x02df, B:173:0x02e2, B:175:0x02e8, B:179:0x02f6, B:185:0x030a, B:187:0x0312, B:189:0x0319, B:191:0x0328, B:193:0x032c, B:195:0x0332, B:198:0x0337, B:200:0x033b, B:219:0x0385, B:221:0x0389, B:225:0x0393, B:226:0x03ab, B:201:0x033e, B:203:0x0346, B:206:0x034c, B:207:0x0358, B:210:0x0361, B:213:0x0367, B:216:0x036d, B:217:0x0379, B:227:0x03ac, B:228:0x03c8, B:231:0x03cd, B:237:0x03df, B:239:0x03e5, B:241:0x03f1, B:242:0x03f7, B:244:0x03fc, B:342:0x058f, B:346:0x0599, B:349:0x05a2, B:353:0x05b5, B:352:0x05af, B:356:0x05bf, B:360:0x05d2, B:362:0x05db, B:366:0x05ee, B:383:0x0636, B:365:0x05e8, B:369:0x05f9, B:373:0x060c, B:372:0x0606, B:376:0x0617, B:380:0x062a, B:379:0x0624, B:381:0x0631, B:359:0x05cc, B:387:0x0640, B:388:0x0658, B:245:0x0400, B:253:0x0413, B:256:0x041f, B:260:0x0436, B:262:0x043f, B:266:0x044b, B:268:0x0455, B:270:0x045c, B:272:0x0460, B:280:0x0475, B:281:0x048d, B:269:0x0459, B:265:0x0448, B:259:0x0430, B:284:0x0492, B:288:0x04a5, B:290:0x04b6, B:294:0x04ca, B:296:0x04d0, B:299:0x04d6, B:301:0x04e0, B:303:0x04e8, B:307:0x04fa, B:310:0x0502, B:311:0x0504, B:313:0x0509, B:315:0x0512, B:318:0x051b, B:319:0x051e, B:321:0x0524, B:323:0x052b, B:330:0x0538, B:331:0x0550, B:316:0x0516, B:291:0x04c1, B:287:0x049f, B:334:0x0557, B:336:0x0563, B:339:0x0576, B:341:0x0582, B:389:0x0659, B:391:0x066a, B:392:0x066e, B:394:0x0677, B:401:0x068e, B:402:0x06a6, B:118:0x022a, B:138:0x0259, B:46:0x00d1, B:50:0x00e4, B:49:0x00de, B:56:0x00f7, B:58:0x0100, B:60:0x010a, B:61:0x010d, B:64:0x0112, B:65:0x0128, B:66:0x0129, B:67:0x0141, B:80:0x015a, B:81:0x015f, B:83:0x0164, B:86:0x0171, B:87:0x0175, B:90:0x017b, B:91:0x0193, B:84:0x0169, B:92:0x0194, B:93:0x01ac, B:99:0x01b6, B:101:0x01bf, B:104:0x01ce, B:105:0x01d4, B:106:0x01f2, B:107:0x01f3, B:108:0x020b, B:109:0x020c, B:111:0x0215, B:403:0x06a7, B:404:0x06bf, B:405:0x06c0, B:406:0x06d8), top: B:410:0x0066, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x030a A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:21:0x0066, B:24:0x0070, B:29:0x007d, B:31:0x0086, B:35:0x0097, B:37:0x00a1, B:40:0x00a9, B:41:0x00c7, B:115:0x021e, B:119:0x0230, B:135:0x024f, B:139:0x025e, B:141:0x0264, B:143:0x026c, B:145:0x027e, B:146:0x028a, B:148:0x0293, B:149:0x0296, B:151:0x02a0, B:158:0x02b0, B:159:0x02b6, B:161:0x02be, B:162:0x02c3, B:166:0x02cc, B:167:0x02d3, B:168:0x02d4, B:170:0x02db, B:172:0x02df, B:173:0x02e2, B:175:0x02e8, B:179:0x02f6, B:185:0x030a, B:187:0x0312, B:189:0x0319, B:191:0x0328, B:193:0x032c, B:195:0x0332, B:198:0x0337, B:200:0x033b, B:219:0x0385, B:221:0x0389, B:225:0x0393, B:226:0x03ab, B:201:0x033e, B:203:0x0346, B:206:0x034c, B:207:0x0358, B:210:0x0361, B:213:0x0367, B:216:0x036d, B:217:0x0379, B:227:0x03ac, B:228:0x03c8, B:231:0x03cd, B:237:0x03df, B:239:0x03e5, B:241:0x03f1, B:242:0x03f7, B:244:0x03fc, B:342:0x058f, B:346:0x0599, B:349:0x05a2, B:353:0x05b5, B:352:0x05af, B:356:0x05bf, B:360:0x05d2, B:362:0x05db, B:366:0x05ee, B:383:0x0636, B:365:0x05e8, B:369:0x05f9, B:373:0x060c, B:372:0x0606, B:376:0x0617, B:380:0x062a, B:379:0x0624, B:381:0x0631, B:359:0x05cc, B:387:0x0640, B:388:0x0658, B:245:0x0400, B:253:0x0413, B:256:0x041f, B:260:0x0436, B:262:0x043f, B:266:0x044b, B:268:0x0455, B:270:0x045c, B:272:0x0460, B:280:0x0475, B:281:0x048d, B:269:0x0459, B:265:0x0448, B:259:0x0430, B:284:0x0492, B:288:0x04a5, B:290:0x04b6, B:294:0x04ca, B:296:0x04d0, B:299:0x04d6, B:301:0x04e0, B:303:0x04e8, B:307:0x04fa, B:310:0x0502, B:311:0x0504, B:313:0x0509, B:315:0x0512, B:318:0x051b, B:319:0x051e, B:321:0x0524, B:323:0x052b, B:330:0x0538, B:331:0x0550, B:316:0x0516, B:291:0x04c1, B:287:0x049f, B:334:0x0557, B:336:0x0563, B:339:0x0576, B:341:0x0582, B:389:0x0659, B:391:0x066a, B:392:0x066e, B:394:0x0677, B:401:0x068e, B:402:0x06a6, B:118:0x022a, B:138:0x0259, B:46:0x00d1, B:50:0x00e4, B:49:0x00de, B:56:0x00f7, B:58:0x0100, B:60:0x010a, B:61:0x010d, B:64:0x0112, B:65:0x0128, B:66:0x0129, B:67:0x0141, B:80:0x015a, B:81:0x015f, B:83:0x0164, B:86:0x0171, B:87:0x0175, B:90:0x017b, B:91:0x0193, B:84:0x0169, B:92:0x0194, B:93:0x01ac, B:99:0x01b6, B:101:0x01bf, B:104:0x01ce, B:105:0x01d4, B:106:0x01f2, B:107:0x01f3, B:108:0x020b, B:109:0x020c, B:111:0x0215, B:403:0x06a7, B:404:0x06bf, B:405:0x06c0, B:406:0x06d8), top: B:410:0x0066, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03df A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:21:0x0066, B:24:0x0070, B:29:0x007d, B:31:0x0086, B:35:0x0097, B:37:0x00a1, B:40:0x00a9, B:41:0x00c7, B:115:0x021e, B:119:0x0230, B:135:0x024f, B:139:0x025e, B:141:0x0264, B:143:0x026c, B:145:0x027e, B:146:0x028a, B:148:0x0293, B:149:0x0296, B:151:0x02a0, B:158:0x02b0, B:159:0x02b6, B:161:0x02be, B:162:0x02c3, B:166:0x02cc, B:167:0x02d3, B:168:0x02d4, B:170:0x02db, B:172:0x02df, B:173:0x02e2, B:175:0x02e8, B:179:0x02f6, B:185:0x030a, B:187:0x0312, B:189:0x0319, B:191:0x0328, B:193:0x032c, B:195:0x0332, B:198:0x0337, B:200:0x033b, B:219:0x0385, B:221:0x0389, B:225:0x0393, B:226:0x03ab, B:201:0x033e, B:203:0x0346, B:206:0x034c, B:207:0x0358, B:210:0x0361, B:213:0x0367, B:216:0x036d, B:217:0x0379, B:227:0x03ac, B:228:0x03c8, B:231:0x03cd, B:237:0x03df, B:239:0x03e5, B:241:0x03f1, B:242:0x03f7, B:244:0x03fc, B:342:0x058f, B:346:0x0599, B:349:0x05a2, B:353:0x05b5, B:352:0x05af, B:356:0x05bf, B:360:0x05d2, B:362:0x05db, B:366:0x05ee, B:383:0x0636, B:365:0x05e8, B:369:0x05f9, B:373:0x060c, B:372:0x0606, B:376:0x0617, B:380:0x062a, B:379:0x0624, B:381:0x0631, B:359:0x05cc, B:387:0x0640, B:388:0x0658, B:245:0x0400, B:253:0x0413, B:256:0x041f, B:260:0x0436, B:262:0x043f, B:266:0x044b, B:268:0x0455, B:270:0x045c, B:272:0x0460, B:280:0x0475, B:281:0x048d, B:269:0x0459, B:265:0x0448, B:259:0x0430, B:284:0x0492, B:288:0x04a5, B:290:0x04b6, B:294:0x04ca, B:296:0x04d0, B:299:0x04d6, B:301:0x04e0, B:303:0x04e8, B:307:0x04fa, B:310:0x0502, B:311:0x0504, B:313:0x0509, B:315:0x0512, B:318:0x051b, B:319:0x051e, B:321:0x0524, B:323:0x052b, B:330:0x0538, B:331:0x0550, B:316:0x0516, B:291:0x04c1, B:287:0x049f, B:334:0x0557, B:336:0x0563, B:339:0x0576, B:341:0x0582, B:389:0x0659, B:391:0x066a, B:392:0x066e, B:394:0x0677, B:401:0x068e, B:402:0x06a6, B:118:0x022a, B:138:0x0259, B:46:0x00d1, B:50:0x00e4, B:49:0x00de, B:56:0x00f7, B:58:0x0100, B:60:0x010a, B:61:0x010d, B:64:0x0112, B:65:0x0128, B:66:0x0129, B:67:0x0141, B:80:0x015a, B:81:0x015f, B:83:0x0164, B:86:0x0171, B:87:0x0175, B:90:0x017b, B:91:0x0193, B:84:0x0169, B:92:0x0194, B:93:0x01ac, B:99:0x01b6, B:101:0x01bf, B:104:0x01ce, B:105:0x01d4, B:106:0x01f2, B:107:0x01f3, B:108:0x020b, B:109:0x020c, B:111:0x0215, B:403:0x06a7, B:404:0x06bf, B:405:0x06c0, B:406:0x06d8), top: B:410:0x0066, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04fa A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:21:0x0066, B:24:0x0070, B:29:0x007d, B:31:0x0086, B:35:0x0097, B:37:0x00a1, B:40:0x00a9, B:41:0x00c7, B:115:0x021e, B:119:0x0230, B:135:0x024f, B:139:0x025e, B:141:0x0264, B:143:0x026c, B:145:0x027e, B:146:0x028a, B:148:0x0293, B:149:0x0296, B:151:0x02a0, B:158:0x02b0, B:159:0x02b6, B:161:0x02be, B:162:0x02c3, B:166:0x02cc, B:167:0x02d3, B:168:0x02d4, B:170:0x02db, B:172:0x02df, B:173:0x02e2, B:175:0x02e8, B:179:0x02f6, B:185:0x030a, B:187:0x0312, B:189:0x0319, B:191:0x0328, B:193:0x032c, B:195:0x0332, B:198:0x0337, B:200:0x033b, B:219:0x0385, B:221:0x0389, B:225:0x0393, B:226:0x03ab, B:201:0x033e, B:203:0x0346, B:206:0x034c, B:207:0x0358, B:210:0x0361, B:213:0x0367, B:216:0x036d, B:217:0x0379, B:227:0x03ac, B:228:0x03c8, B:231:0x03cd, B:237:0x03df, B:239:0x03e5, B:241:0x03f1, B:242:0x03f7, B:244:0x03fc, B:342:0x058f, B:346:0x0599, B:349:0x05a2, B:353:0x05b5, B:352:0x05af, B:356:0x05bf, B:360:0x05d2, B:362:0x05db, B:366:0x05ee, B:383:0x0636, B:365:0x05e8, B:369:0x05f9, B:373:0x060c, B:372:0x0606, B:376:0x0617, B:380:0x062a, B:379:0x0624, B:381:0x0631, B:359:0x05cc, B:387:0x0640, B:388:0x0658, B:245:0x0400, B:253:0x0413, B:256:0x041f, B:260:0x0436, B:262:0x043f, B:266:0x044b, B:268:0x0455, B:270:0x045c, B:272:0x0460, B:280:0x0475, B:281:0x048d, B:269:0x0459, B:265:0x0448, B:259:0x0430, B:284:0x0492, B:288:0x04a5, B:290:0x04b6, B:294:0x04ca, B:296:0x04d0, B:299:0x04d6, B:301:0x04e0, B:303:0x04e8, B:307:0x04fa, B:310:0x0502, B:311:0x0504, B:313:0x0509, B:315:0x0512, B:318:0x051b, B:319:0x051e, B:321:0x0524, B:323:0x052b, B:330:0x0538, B:331:0x0550, B:316:0x0516, B:291:0x04c1, B:287:0x049f, B:334:0x0557, B:336:0x0563, B:339:0x0576, B:341:0x0582, B:389:0x0659, B:391:0x066a, B:392:0x066e, B:394:0x0677, B:401:0x068e, B:402:0x06a6, B:118:0x022a, B:138:0x0259, B:46:0x00d1, B:50:0x00e4, B:49:0x00de, B:56:0x00f7, B:58:0x0100, B:60:0x010a, B:61:0x010d, B:64:0x0112, B:65:0x0128, B:66:0x0129, B:67:0x0141, B:80:0x015a, B:81:0x015f, B:83:0x0164, B:86:0x0171, B:87:0x0175, B:90:0x017b, B:91:0x0193, B:84:0x0169, B:92:0x0194, B:93:0x01ac, B:99:0x01b6, B:101:0x01bf, B:104:0x01ce, B:105:0x01d4, B:106:0x01f2, B:107:0x01f3, B:108:0x020b, B:109:0x020c, B:111:0x0215, B:403:0x06a7, B:404:0x06bf, B:405:0x06c0, B:406:0x06d8), top: B:410:0x0066, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0509 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:21:0x0066, B:24:0x0070, B:29:0x007d, B:31:0x0086, B:35:0x0097, B:37:0x00a1, B:40:0x00a9, B:41:0x00c7, B:115:0x021e, B:119:0x0230, B:135:0x024f, B:139:0x025e, B:141:0x0264, B:143:0x026c, B:145:0x027e, B:146:0x028a, B:148:0x0293, B:149:0x0296, B:151:0x02a0, B:158:0x02b0, B:159:0x02b6, B:161:0x02be, B:162:0x02c3, B:166:0x02cc, B:167:0x02d3, B:168:0x02d4, B:170:0x02db, B:172:0x02df, B:173:0x02e2, B:175:0x02e8, B:179:0x02f6, B:185:0x030a, B:187:0x0312, B:189:0x0319, B:191:0x0328, B:193:0x032c, B:195:0x0332, B:198:0x0337, B:200:0x033b, B:219:0x0385, B:221:0x0389, B:225:0x0393, B:226:0x03ab, B:201:0x033e, B:203:0x0346, B:206:0x034c, B:207:0x0358, B:210:0x0361, B:213:0x0367, B:216:0x036d, B:217:0x0379, B:227:0x03ac, B:228:0x03c8, B:231:0x03cd, B:237:0x03df, B:239:0x03e5, B:241:0x03f1, B:242:0x03f7, B:244:0x03fc, B:342:0x058f, B:346:0x0599, B:349:0x05a2, B:353:0x05b5, B:352:0x05af, B:356:0x05bf, B:360:0x05d2, B:362:0x05db, B:366:0x05ee, B:383:0x0636, B:365:0x05e8, B:369:0x05f9, B:373:0x060c, B:372:0x0606, B:376:0x0617, B:380:0x062a, B:379:0x0624, B:381:0x0631, B:359:0x05cc, B:387:0x0640, B:388:0x0658, B:245:0x0400, B:253:0x0413, B:256:0x041f, B:260:0x0436, B:262:0x043f, B:266:0x044b, B:268:0x0455, B:270:0x045c, B:272:0x0460, B:280:0x0475, B:281:0x048d, B:269:0x0459, B:265:0x0448, B:259:0x0430, B:284:0x0492, B:288:0x04a5, B:290:0x04b6, B:294:0x04ca, B:296:0x04d0, B:299:0x04d6, B:301:0x04e0, B:303:0x04e8, B:307:0x04fa, B:310:0x0502, B:311:0x0504, B:313:0x0509, B:315:0x0512, B:318:0x051b, B:319:0x051e, B:321:0x0524, B:323:0x052b, B:330:0x0538, B:331:0x0550, B:316:0x0516, B:291:0x04c1, B:287:0x049f, B:334:0x0557, B:336:0x0563, B:339:0x0576, B:341:0x0582, B:389:0x0659, B:391:0x066a, B:392:0x066e, B:394:0x0677, B:401:0x068e, B:402:0x06a6, B:118:0x022a, B:138:0x0259, B:46:0x00d1, B:50:0x00e4, B:49:0x00de, B:56:0x00f7, B:58:0x0100, B:60:0x010a, B:61:0x010d, B:64:0x0112, B:65:0x0128, B:66:0x0129, B:67:0x0141, B:80:0x015a, B:81:0x015f, B:83:0x0164, B:86:0x0171, B:87:0x0175, B:90:0x017b, B:91:0x0193, B:84:0x0169, B:92:0x0194, B:93:0x01ac, B:99:0x01b6, B:101:0x01bf, B:104:0x01ce, B:105:0x01d4, B:106:0x01f2, B:107:0x01f3, B:108:0x020b, B:109:0x020c, B:111:0x0215, B:403:0x06a7, B:404:0x06bf, B:405:0x06c0, B:406:0x06d8), top: B:410:0x0066, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0512 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:21:0x0066, B:24:0x0070, B:29:0x007d, B:31:0x0086, B:35:0x0097, B:37:0x00a1, B:40:0x00a9, B:41:0x00c7, B:115:0x021e, B:119:0x0230, B:135:0x024f, B:139:0x025e, B:141:0x0264, B:143:0x026c, B:145:0x027e, B:146:0x028a, B:148:0x0293, B:149:0x0296, B:151:0x02a0, B:158:0x02b0, B:159:0x02b6, B:161:0x02be, B:162:0x02c3, B:166:0x02cc, B:167:0x02d3, B:168:0x02d4, B:170:0x02db, B:172:0x02df, B:173:0x02e2, B:175:0x02e8, B:179:0x02f6, B:185:0x030a, B:187:0x0312, B:189:0x0319, B:191:0x0328, B:193:0x032c, B:195:0x0332, B:198:0x0337, B:200:0x033b, B:219:0x0385, B:221:0x0389, B:225:0x0393, B:226:0x03ab, B:201:0x033e, B:203:0x0346, B:206:0x034c, B:207:0x0358, B:210:0x0361, B:213:0x0367, B:216:0x036d, B:217:0x0379, B:227:0x03ac, B:228:0x03c8, B:231:0x03cd, B:237:0x03df, B:239:0x03e5, B:241:0x03f1, B:242:0x03f7, B:244:0x03fc, B:342:0x058f, B:346:0x0599, B:349:0x05a2, B:353:0x05b5, B:352:0x05af, B:356:0x05bf, B:360:0x05d2, B:362:0x05db, B:366:0x05ee, B:383:0x0636, B:365:0x05e8, B:369:0x05f9, B:373:0x060c, B:372:0x0606, B:376:0x0617, B:380:0x062a, B:379:0x0624, B:381:0x0631, B:359:0x05cc, B:387:0x0640, B:388:0x0658, B:245:0x0400, B:253:0x0413, B:256:0x041f, B:260:0x0436, B:262:0x043f, B:266:0x044b, B:268:0x0455, B:270:0x045c, B:272:0x0460, B:280:0x0475, B:281:0x048d, B:269:0x0459, B:265:0x0448, B:259:0x0430, B:284:0x0492, B:288:0x04a5, B:290:0x04b6, B:294:0x04ca, B:296:0x04d0, B:299:0x04d6, B:301:0x04e0, B:303:0x04e8, B:307:0x04fa, B:310:0x0502, B:311:0x0504, B:313:0x0509, B:315:0x0512, B:318:0x051b, B:319:0x051e, B:321:0x0524, B:323:0x052b, B:330:0x0538, B:331:0x0550, B:316:0x0516, B:291:0x04c1, B:287:0x049f, B:334:0x0557, B:336:0x0563, B:339:0x0576, B:341:0x0582, B:389:0x0659, B:391:0x066a, B:392:0x066e, B:394:0x0677, B:401:0x068e, B:402:0x06a6, B:118:0x022a, B:138:0x0259, B:46:0x00d1, B:50:0x00e4, B:49:0x00de, B:56:0x00f7, B:58:0x0100, B:60:0x010a, B:61:0x010d, B:64:0x0112, B:65:0x0128, B:66:0x0129, B:67:0x0141, B:80:0x015a, B:81:0x015f, B:83:0x0164, B:86:0x0171, B:87:0x0175, B:90:0x017b, B:91:0x0193, B:84:0x0169, B:92:0x0194, B:93:0x01ac, B:99:0x01b6, B:101:0x01bf, B:104:0x01ce, B:105:0x01d4, B:106:0x01f2, B:107:0x01f3, B:108:0x020b, B:109:0x020c, B:111:0x0215, B:403:0x06a7, B:404:0x06bf, B:405:0x06c0, B:406:0x06d8), top: B:410:0x0066, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0516 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:21:0x0066, B:24:0x0070, B:29:0x007d, B:31:0x0086, B:35:0x0097, B:37:0x00a1, B:40:0x00a9, B:41:0x00c7, B:115:0x021e, B:119:0x0230, B:135:0x024f, B:139:0x025e, B:141:0x0264, B:143:0x026c, B:145:0x027e, B:146:0x028a, B:148:0x0293, B:149:0x0296, B:151:0x02a0, B:158:0x02b0, B:159:0x02b6, B:161:0x02be, B:162:0x02c3, B:166:0x02cc, B:167:0x02d3, B:168:0x02d4, B:170:0x02db, B:172:0x02df, B:173:0x02e2, B:175:0x02e8, B:179:0x02f6, B:185:0x030a, B:187:0x0312, B:189:0x0319, B:191:0x0328, B:193:0x032c, B:195:0x0332, B:198:0x0337, B:200:0x033b, B:219:0x0385, B:221:0x0389, B:225:0x0393, B:226:0x03ab, B:201:0x033e, B:203:0x0346, B:206:0x034c, B:207:0x0358, B:210:0x0361, B:213:0x0367, B:216:0x036d, B:217:0x0379, B:227:0x03ac, B:228:0x03c8, B:231:0x03cd, B:237:0x03df, B:239:0x03e5, B:241:0x03f1, B:242:0x03f7, B:244:0x03fc, B:342:0x058f, B:346:0x0599, B:349:0x05a2, B:353:0x05b5, B:352:0x05af, B:356:0x05bf, B:360:0x05d2, B:362:0x05db, B:366:0x05ee, B:383:0x0636, B:365:0x05e8, B:369:0x05f9, B:373:0x060c, B:372:0x0606, B:376:0x0617, B:380:0x062a, B:379:0x0624, B:381:0x0631, B:359:0x05cc, B:387:0x0640, B:388:0x0658, B:245:0x0400, B:253:0x0413, B:256:0x041f, B:260:0x0436, B:262:0x043f, B:266:0x044b, B:268:0x0455, B:270:0x045c, B:272:0x0460, B:280:0x0475, B:281:0x048d, B:269:0x0459, B:265:0x0448, B:259:0x0430, B:284:0x0492, B:288:0x04a5, B:290:0x04b6, B:294:0x04ca, B:296:0x04d0, B:299:0x04d6, B:301:0x04e0, B:303:0x04e8, B:307:0x04fa, B:310:0x0502, B:311:0x0504, B:313:0x0509, B:315:0x0512, B:318:0x051b, B:319:0x051e, B:321:0x0524, B:323:0x052b, B:330:0x0538, B:331:0x0550, B:316:0x0516, B:291:0x04c1, B:287:0x049f, B:334:0x0557, B:336:0x0563, B:339:0x0576, B:341:0x0582, B:389:0x0659, B:391:0x066a, B:392:0x066e, B:394:0x0677, B:401:0x068e, B:402:0x06a6, B:118:0x022a, B:138:0x0259, B:46:0x00d1, B:50:0x00e4, B:49:0x00de, B:56:0x00f7, B:58:0x0100, B:60:0x010a, B:61:0x010d, B:64:0x0112, B:65:0x0128, B:66:0x0129, B:67:0x0141, B:80:0x015a, B:81:0x015f, B:83:0x0164, B:86:0x0171, B:87:0x0175, B:90:0x017b, B:91:0x0193, B:84:0x0169, B:92:0x0194, B:93:0x01ac, B:99:0x01b6, B:101:0x01bf, B:104:0x01ce, B:105:0x01d4, B:106:0x01f2, B:107:0x01f3, B:108:0x020b, B:109:0x020c, B:111:0x0215, B:403:0x06a7, B:404:0x06bf, B:405:0x06c0, B:406:0x06d8), top: B:410:0x0066, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x051b A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:21:0x0066, B:24:0x0070, B:29:0x007d, B:31:0x0086, B:35:0x0097, B:37:0x00a1, B:40:0x00a9, B:41:0x00c7, B:115:0x021e, B:119:0x0230, B:135:0x024f, B:139:0x025e, B:141:0x0264, B:143:0x026c, B:145:0x027e, B:146:0x028a, B:148:0x0293, B:149:0x0296, B:151:0x02a0, B:158:0x02b0, B:159:0x02b6, B:161:0x02be, B:162:0x02c3, B:166:0x02cc, B:167:0x02d3, B:168:0x02d4, B:170:0x02db, B:172:0x02df, B:173:0x02e2, B:175:0x02e8, B:179:0x02f6, B:185:0x030a, B:187:0x0312, B:189:0x0319, B:191:0x0328, B:193:0x032c, B:195:0x0332, B:198:0x0337, B:200:0x033b, B:219:0x0385, B:221:0x0389, B:225:0x0393, B:226:0x03ab, B:201:0x033e, B:203:0x0346, B:206:0x034c, B:207:0x0358, B:210:0x0361, B:213:0x0367, B:216:0x036d, B:217:0x0379, B:227:0x03ac, B:228:0x03c8, B:231:0x03cd, B:237:0x03df, B:239:0x03e5, B:241:0x03f1, B:242:0x03f7, B:244:0x03fc, B:342:0x058f, B:346:0x0599, B:349:0x05a2, B:353:0x05b5, B:352:0x05af, B:356:0x05bf, B:360:0x05d2, B:362:0x05db, B:366:0x05ee, B:383:0x0636, B:365:0x05e8, B:369:0x05f9, B:373:0x060c, B:372:0x0606, B:376:0x0617, B:380:0x062a, B:379:0x0624, B:381:0x0631, B:359:0x05cc, B:387:0x0640, B:388:0x0658, B:245:0x0400, B:253:0x0413, B:256:0x041f, B:260:0x0436, B:262:0x043f, B:266:0x044b, B:268:0x0455, B:270:0x045c, B:272:0x0460, B:280:0x0475, B:281:0x048d, B:269:0x0459, B:265:0x0448, B:259:0x0430, B:284:0x0492, B:288:0x04a5, B:290:0x04b6, B:294:0x04ca, B:296:0x04d0, B:299:0x04d6, B:301:0x04e0, B:303:0x04e8, B:307:0x04fa, B:310:0x0502, B:311:0x0504, B:313:0x0509, B:315:0x0512, B:318:0x051b, B:319:0x051e, B:321:0x0524, B:323:0x052b, B:330:0x0538, B:331:0x0550, B:316:0x0516, B:291:0x04c1, B:287:0x049f, B:334:0x0557, B:336:0x0563, B:339:0x0576, B:341:0x0582, B:389:0x0659, B:391:0x066a, B:392:0x066e, B:394:0x0677, B:401:0x068e, B:402:0x06a6, B:118:0x022a, B:138:0x0259, B:46:0x00d1, B:50:0x00e4, B:49:0x00de, B:56:0x00f7, B:58:0x0100, B:60:0x010a, B:61:0x010d, B:64:0x0112, B:65:0x0128, B:66:0x0129, B:67:0x0141, B:80:0x015a, B:81:0x015f, B:83:0x0164, B:86:0x0171, B:87:0x0175, B:90:0x017b, B:91:0x0193, B:84:0x0169, B:92:0x0194, B:93:0x01ac, B:99:0x01b6, B:101:0x01bf, B:104:0x01ce, B:105:0x01d4, B:106:0x01f2, B:107:0x01f3, B:108:0x020b, B:109:0x020c, B:111:0x0215, B:403:0x06a7, B:404:0x06bf, B:405:0x06c0, B:406:0x06d8), top: B:410:0x0066, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05a2 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:21:0x0066, B:24:0x0070, B:29:0x007d, B:31:0x0086, B:35:0x0097, B:37:0x00a1, B:40:0x00a9, B:41:0x00c7, B:115:0x021e, B:119:0x0230, B:135:0x024f, B:139:0x025e, B:141:0x0264, B:143:0x026c, B:145:0x027e, B:146:0x028a, B:148:0x0293, B:149:0x0296, B:151:0x02a0, B:158:0x02b0, B:159:0x02b6, B:161:0x02be, B:162:0x02c3, B:166:0x02cc, B:167:0x02d3, B:168:0x02d4, B:170:0x02db, B:172:0x02df, B:173:0x02e2, B:175:0x02e8, B:179:0x02f6, B:185:0x030a, B:187:0x0312, B:189:0x0319, B:191:0x0328, B:193:0x032c, B:195:0x0332, B:198:0x0337, B:200:0x033b, B:219:0x0385, B:221:0x0389, B:225:0x0393, B:226:0x03ab, B:201:0x033e, B:203:0x0346, B:206:0x034c, B:207:0x0358, B:210:0x0361, B:213:0x0367, B:216:0x036d, B:217:0x0379, B:227:0x03ac, B:228:0x03c8, B:231:0x03cd, B:237:0x03df, B:239:0x03e5, B:241:0x03f1, B:242:0x03f7, B:244:0x03fc, B:342:0x058f, B:346:0x0599, B:349:0x05a2, B:353:0x05b5, B:352:0x05af, B:356:0x05bf, B:360:0x05d2, B:362:0x05db, B:366:0x05ee, B:383:0x0636, B:365:0x05e8, B:369:0x05f9, B:373:0x060c, B:372:0x0606, B:376:0x0617, B:380:0x062a, B:379:0x0624, B:381:0x0631, B:359:0x05cc, B:387:0x0640, B:388:0x0658, B:245:0x0400, B:253:0x0413, B:256:0x041f, B:260:0x0436, B:262:0x043f, B:266:0x044b, B:268:0x0455, B:270:0x045c, B:272:0x0460, B:280:0x0475, B:281:0x048d, B:269:0x0459, B:265:0x0448, B:259:0x0430, B:284:0x0492, B:288:0x04a5, B:290:0x04b6, B:294:0x04ca, B:296:0x04d0, B:299:0x04d6, B:301:0x04e0, B:303:0x04e8, B:307:0x04fa, B:310:0x0502, B:311:0x0504, B:313:0x0509, B:315:0x0512, B:318:0x051b, B:319:0x051e, B:321:0x0524, B:323:0x052b, B:330:0x0538, B:331:0x0550, B:316:0x0516, B:291:0x04c1, B:287:0x049f, B:334:0x0557, B:336:0x0563, B:339:0x0576, B:341:0x0582, B:389:0x0659, B:391:0x066a, B:392:0x066e, B:394:0x0677, B:401:0x068e, B:402:0x06a6, B:118:0x022a, B:138:0x0259, B:46:0x00d1, B:50:0x00e4, B:49:0x00de, B:56:0x00f7, B:58:0x0100, B:60:0x010a, B:61:0x010d, B:64:0x0112, B:65:0x0128, B:66:0x0129, B:67:0x0141, B:80:0x015a, B:81:0x015f, B:83:0x0164, B:86:0x0171, B:87:0x0175, B:90:0x017b, B:91:0x0193, B:84:0x0169, B:92:0x0194, B:93:0x01ac, B:99:0x01b6, B:101:0x01bf, B:104:0x01ce, B:105:0x01d4, B:106:0x01f2, B:107:0x01f3, B:108:0x020b, B:109:0x020c, B:111:0x0215, B:403:0x06a7, B:404:0x06bf, B:405:0x06c0, B:406:0x06d8), top: B:410:0x0066, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0305 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x05bb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object parseObject(java.util.Map r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hw3.parseObject(java.util.Map, java.lang.Object):java.lang.Object");
    }

    public String parseString() {
        lh8 lh8Var = this.f45134e;
        int i = lh8Var.f57601a;
        if (i != 4) {
            if (i == 2) {
                String strNumberString = lh8Var.numberString();
                this.f45134e.nextToken(16);
                return strNumberString;
            }
            Object obj = parse();
            if (obj == null) {
                return null;
            }
            return obj.toString();
        }
        String strStringVal = lh8Var.stringVal();
        lh8 lh8Var2 = this.f45134e;
        char c = lh8Var2.f57604d;
        char cCharAt = lh8.f57593s;
        if (c == ',') {
            int i2 = lh8Var2.f57605e + 1;
            lh8Var2.f57605e = i2;
            if (i2 < lh8Var2.f57616p) {
                cCharAt = lh8Var2.f57615o.charAt(i2);
            }
            lh8Var2.f57604d = cCharAt;
            this.f45134e.f57601a = 16;
        } else if (c == ']') {
            int i3 = lh8Var2.f57605e + 1;
            lh8Var2.f57605e = i3;
            if (i3 < lh8Var2.f57616p) {
                cCharAt = lh8Var2.f57615o.charAt(i3);
            }
            lh8Var2.f57604d = cCharAt;
            this.f45134e.f57601a = 15;
        } else if (c == '}') {
            int i4 = lh8Var2.f57605e + 1;
            lh8Var2.f57605e = i4;
            if (i4 < lh8Var2.f57616p) {
                cCharAt = lh8Var2.f57615o.charAt(i4);
            }
            lh8Var2.f57604d = cCharAt;
            this.f45134e.f57601a = 13;
        } else {
            lh8Var2.nextToken();
        }
        return strStringVal;
    }

    public void setContext(mhc mhcVar) {
        if (this.f45134e.f57618r) {
            return;
        }
        this.f45135f = mhcVar;
    }

    public void setDateFomrat(DateFormat dateFormat) {
        this.f45133d = dateFormat;
    }

    public void setDateFormat(String str) {
        this.f45132c = str;
        this.f45133d = null;
    }

    public hw3(String str, whc whcVar) {
        this(new lh8(str, fh8.f36585d), whcVar);
    }

    public Object parse(Object obj) {
        lh8 lh8Var = this.f45134e;
        int i = lh8Var.f57601a;
        if (i == 2) {
            Number numberIntegerValue = lh8Var.integerValue();
            this.f45134e.nextToken();
            return numberIntegerValue;
        }
        if (i == 3) {
            Number numberDecimalValue = lh8Var.decimalValue((lh8Var.f57603c & rp5.UseBigDecimal.f78973a) != 0);
            this.f45134e.nextToken();
            return numberDecimalValue;
        }
        if (i == 4) {
            String strStringVal = lh8Var.stringVal();
            this.f45134e.nextToken(16);
            if ((this.f45134e.f57603c & rp5.AllowISO8601DateFormat.f78973a) != 0) {
                lh8 lh8Var2 = new lh8(strStringVal);
                try {
                    if (lh8Var2.scanISO8601DateIfMatch(true)) {
                        return lh8Var2.f57613m.getTime();
                    }
                } finally {
                    lh8Var2.close();
                }
            }
            return strStringVal;
        }
        if (i == 12) {
            return parseObject((lh8Var.f57603c & rp5.OrderedField.f78973a) != 0 ? new mh8(new LinkedHashMap()) : new mh8(), obj);
        }
        if (i == 14) {
            gh8 gh8Var = new gh8();
            parseArray(gh8Var, obj);
            return gh8Var;
        }
        switch (i) {
            case 6:
                lh8Var.nextToken(16);
                return Boolean.TRUE;
            case 7:
                lh8Var.nextToken(16);
                return Boolean.FALSE;
            case 8:
                break;
            case 9:
                lh8Var.nextToken(18);
                lh8 lh8Var3 = this.f45134e;
                if (lh8Var3.f57601a != 18) {
                    throw new jh8("syntax error, " + this.f45134e.info());
                }
                lh8Var3.nextToken(10);
                accept(10);
                long jLongValue = this.f45134e.integerValue().longValue();
                accept(2);
                accept(11);
                return new Date(jLongValue);
            default:
                switch (i) {
                    case 20:
                        if (lh8Var.isBlankInput()) {
                            return null;
                        }
                        throw new jh8("syntax error, " + this.f45134e.info());
                    case 21:
                        lh8Var.nextToken();
                        HashSet hashSet = new HashSet();
                        parseArray(hashSet, obj);
                        return hashSet;
                    case 22:
                        lh8Var.nextToken();
                        TreeSet treeSet = new TreeSet();
                        parseArray(treeSet, obj);
                        return treeSet;
                    case 23:
                        break;
                    default:
                        throw new jh8("syntax error, " + this.f45134e.info());
                }
                break;
        }
        lh8Var.nextToken();
        return null;
    }

    public hw3(String str, whc whcVar, int i) {
        this(new lh8(str, i), whcVar);
    }

    public void parseArray(Class<?> cls, Collection collection) {
        parseArray((Type) cls, collection);
    }

    public hw3(char[] cArr, int i, whc whcVar, int i2) {
        this(new lh8(cArr, i, i2), whcVar);
    }

    public void parseArray(Type type, Collection collection) {
        parseArray(type, collection, null);
    }

    public hw3(lh8 lh8Var) {
        this(lh8Var, whc.f94265e);
    }

    public void parseArray(Type type, Collection collection, Object obj) {
        sjb deserializer;
        Object objStringVal;
        lh8 lh8Var = this.f45134e;
        int i = lh8Var.f57601a;
        if (i == 21 || i == 22) {
            lh8Var.nextToken();
        }
        lh8 lh8Var2 = this.f45134e;
        if (lh8Var2.f57601a == 14) {
            if (Integer.TYPE == type) {
                deserializer = b88.f12963a;
                lh8Var2.nextToken(2);
            } else if (String.class == type) {
                deserializer = k7g.f52747a;
                lh8Var2.nextToken(4);
            } else {
                deserializer = this.f45131b.getDeserializer(type);
                this.f45134e.nextToken(12);
            }
            mhc mhcVar = this.f45135f;
            if (!this.f45134e.f57618r) {
                m12645f(mhcVar, collection, obj);
            }
            int i2 = 0;
            while (true) {
                try {
                    if ((this.f45134e.f57603c & rp5.AllowArbitraryCommas.f78973a) != 0) {
                        while (true) {
                            lh8 lh8Var3 = this.f45134e;
                            if (lh8Var3.f57601a != 16) {
                                break;
                            } else {
                                lh8Var3.nextToken();
                            }
                        }
                    }
                    lh8 lh8Var4 = this.f45134e;
                    int i3 = lh8Var4.f57601a;
                    if (i3 == 15) {
                        this.f45135f = mhcVar;
                        lh8Var4.nextToken(16);
                        return;
                    }
                    Object objDeserialze = null;
                    if (Integer.TYPE == type) {
                        collection.add(b88.f12963a.deserialze(this, null, null));
                    } else if (String.class == type) {
                        if (i3 == 4) {
                            objStringVal = lh8Var4.stringVal();
                            this.f45134e.nextToken(16);
                        } else {
                            Object obj2 = parse();
                            if (obj2 != null) {
                                objDeserialze = obj2.toString();
                            }
                            objStringVal = objDeserialze;
                        }
                        collection.add(objStringVal);
                    } else {
                        if (i3 == 8) {
                            lh8Var4.nextToken();
                        } else {
                            objDeserialze = deserializer.deserialze(this, type, Integer.valueOf(i2));
                        }
                        collection.add(objDeserialze);
                        if (this.f45126H == 1) {
                            m12641b(collection);
                        }
                    }
                    lh8 lh8Var5 = this.f45134e;
                    if (lh8Var5.f57601a == 16) {
                        lh8Var5.nextToken();
                    }
                    i2++;
                } catch (Throwable th) {
                    this.f45135f = mhcVar;
                    throw th;
                }
            }
        } else {
            throw new jh8("exepct '[', but " + sh8.name(this.f45134e.f57601a) + ", " + this.f45134e.info());
        }
    }

    public hw3(lh8 lh8Var, whc whcVar) {
        this.f45132c = fh8.f36586e;
        this.f45124C = 0;
        this.f45126H = 0;
        this.f45127L = null;
        this.f45128M = null;
        this.f45129N = null;
        this.f45134e = lh8Var;
        this.f45131b = whcVar;
        this.f45130a = whcVar.f94267b;
        char c = lh8Var.f57604d;
        char c2 = lh8.f57593s;
        if (c == '{') {
            int i = lh8Var.f57605e + 1;
            lh8Var.f57605e = i;
            lh8Var.f57604d = i < lh8Var.f57616p ? lh8Var.f57615o.charAt(i) : c2;
            lh8Var.f57601a = 12;
            return;
        }
        if (c == '[') {
            int i2 = lh8Var.f57605e + 1;
            lh8Var.f57605e = i2;
            lh8Var.f57604d = i2 < lh8Var.f57616p ? lh8Var.f57615o.charAt(i2) : c2;
            lh8Var.f57601a = 14;
            return;
        }
        lh8Var.nextToken();
    }

    public Object[] parseArray(Type[] typeArr) {
        Object objCast;
        Class<?> componentType;
        boolean zIsArray;
        int i;
        lh8 lh8Var = this.f45134e;
        int i2 = lh8Var.f57601a;
        int i3 = 8;
        if (i2 == 8) {
            lh8Var.nextToken(16);
            return null;
        }
        if (i2 != 14) {
            throw new jh8("syntax error, " + this.f45134e.info());
        }
        Object[] objArr = new Object[typeArr.length];
        if (typeArr.length == 0) {
            lh8Var.nextToken(15);
            lh8 lh8Var2 = this.f45134e;
            if (lh8Var2.f57601a != 15) {
                throw new jh8("syntax error, " + this.f45134e.info());
            }
            lh8Var2.nextToken(16);
            return new Object[0];
        }
        lh8Var.nextToken(2);
        int i4 = 0;
        while (i4 < typeArr.length) {
            lh8 lh8Var3 = this.f45134e;
            int i5 = lh8Var3.f57601a;
            if (i5 == i3) {
                lh8Var3.nextToken(16);
                objCast = null;
            } else {
                Type type = typeArr[i4];
                if (type == Integer.TYPE || type == Integer.class) {
                    if (i5 == 2) {
                        objCast = Integer.valueOf(lh8Var3.intValue());
                        this.f45134e.nextToken(16);
                    } else {
                        objCast = qmh.cast(parse(), type, this.f45131b);
                    }
                } else if (type != String.class) {
                    if (i4 == typeArr.length - 1 && (type instanceof Class)) {
                        Class cls = (Class) type;
                        zIsArray = cls.isArray();
                        componentType = cls.getComponentType();
                    } else {
                        componentType = null;
                        zIsArray = false;
                    }
                    if (zIsArray && this.f45134e.f57601a != 14) {
                        ArrayList arrayList = new ArrayList();
                        sjb deserializer = this.f45131b.getDeserializer(componentType);
                        if (this.f45134e.f57601a != 15) {
                            while (true) {
                                arrayList.add(deserializer.deserialze(this, type, null));
                                lh8 lh8Var4 = this.f45134e;
                                i = lh8Var4.f57601a;
                                if (i != 16) {
                                    break;
                                }
                                lh8Var4.nextToken(12);
                            }
                            if (i != 15) {
                                throw new jh8("syntax error, " + this.f45134e.info());
                            }
                        }
                        objCast = qmh.cast(arrayList, type, this.f45131b);
                    } else {
                        objCast = this.f45131b.getDeserializer(type).deserialze(this, type, null);
                    }
                } else if (i5 == 4) {
                    objCast = lh8Var3.stringVal();
                    this.f45134e.nextToken(16);
                } else {
                    objCast = qmh.cast(parse(), type, this.f45131b);
                }
            }
            objArr[i4] = objCast;
            lh8 lh8Var5 = this.f45134e;
            int i6 = lh8Var5.f57601a;
            if (i6 == 15) {
                break;
            }
            if (i6 != 16) {
                throw new jh8("syntax error, " + this.f45134e.info());
            }
            if (i4 == typeArr.length - 1) {
                lh8Var5.nextToken(15);
            } else {
                lh8Var5.nextToken(2);
            }
            i4++;
            i3 = 8;
        }
        lh8 lh8Var6 = this.f45134e;
        if (lh8Var6.f57601a != 15) {
            throw new jh8("syntax error, " + this.f45134e.info());
        }
        lh8Var6.nextToken(16);
        return objArr;
    }

    public final void parseArray(Collection collection) {
        parseArray(collection, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01e2 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x0028, B:15:0x003c, B:22:0x004e, B:26:0x0060, B:35:0x007e, B:37:0x0084, B:39:0x0090, B:43:0x00a2, B:45:0x00ab, B:48:0x00b3, B:42:0x009c, B:50:0x00bc, B:54:0x00ce, B:56:0x00d7, B:57:0x00da, B:53:0x00c8, B:61:0x00e4, B:62:0x00e7, B:64:0x00ed, B:66:0x00f8, B:87:0x0125, B:117:0x01f0, B:119:0x01f7, B:120:0x01fa, B:122:0x0200, B:124:0x0204, B:129:0x0214, B:132:0x0220, B:136:0x0234, B:135:0x022e, B:137:0x0237, B:89:0x012d, B:93:0x0137, B:94:0x0144, B:95:0x014c, B:96:0x0153, B:97:0x0154, B:99:0x0161, B:101:0x0171, B:100:0x016c, B:102:0x017a, B:103:0x0182, B:104:0x018c, B:105:0x0196, B:107:0x01ae, B:109:0x01b9, B:110:0x01bf, B:111:0x01c4, B:113:0x01d1, B:115:0x01dc, B:114:0x01d7, B:116:0x01e2, B:25:0x005a, B:27:0x0067, B:29:0x006c, B:32:0x0077), top: B:144:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f7 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x0028, B:15:0x003c, B:22:0x004e, B:26:0x0060, B:35:0x007e, B:37:0x0084, B:39:0x0090, B:43:0x00a2, B:45:0x00ab, B:48:0x00b3, B:42:0x009c, B:50:0x00bc, B:54:0x00ce, B:56:0x00d7, B:57:0x00da, B:53:0x00c8, B:61:0x00e4, B:62:0x00e7, B:64:0x00ed, B:66:0x00f8, B:87:0x0125, B:117:0x01f0, B:119:0x01f7, B:120:0x01fa, B:122:0x0200, B:124:0x0204, B:129:0x0214, B:132:0x0220, B:136:0x0234, B:135:0x022e, B:137:0x0237, B:89:0x012d, B:93:0x0137, B:94:0x0144, B:95:0x014c, B:96:0x0153, B:97:0x0154, B:99:0x0161, B:101:0x0171, B:100:0x016c, B:102:0x017a, B:103:0x0182, B:104:0x018c, B:105:0x0196, B:107:0x01ae, B:109:0x01b9, B:110:0x01bf, B:111:0x01c4, B:113:0x01d1, B:115:0x01dc, B:114:0x01d7, B:116:0x01e2, B:25:0x005a, B:27:0x0067, B:29:0x006c, B:32:0x0077), top: B:144:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0200 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x0028, B:15:0x003c, B:22:0x004e, B:26:0x0060, B:35:0x007e, B:37:0x0084, B:39:0x0090, B:43:0x00a2, B:45:0x00ab, B:48:0x00b3, B:42:0x009c, B:50:0x00bc, B:54:0x00ce, B:56:0x00d7, B:57:0x00da, B:53:0x00c8, B:61:0x00e4, B:62:0x00e7, B:64:0x00ed, B:66:0x00f8, B:87:0x0125, B:117:0x01f0, B:119:0x01f7, B:120:0x01fa, B:122:0x0200, B:124:0x0204, B:129:0x0214, B:132:0x0220, B:136:0x0234, B:135:0x022e, B:137:0x0237, B:89:0x012d, B:93:0x0137, B:94:0x0144, B:95:0x014c, B:96:0x0153, B:97:0x0154, B:99:0x0161, B:101:0x0171, B:100:0x016c, B:102:0x017a, B:103:0x0182, B:104:0x018c, B:105:0x0196, B:107:0x01ae, B:109:0x01b9, B:110:0x01bf, B:111:0x01c4, B:113:0x01d1, B:115:0x01dc, B:114:0x01d7, B:116:0x01e2, B:25:0x005a, B:27:0x0067, B:29:0x006c, B:32:0x0077), top: B:144:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x023a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x0028, B:15:0x003c, B:22:0x004e, B:26:0x0060, B:35:0x007e, B:37:0x0084, B:39:0x0090, B:43:0x00a2, B:45:0x00ab, B:48:0x00b3, B:42:0x009c, B:50:0x00bc, B:54:0x00ce, B:56:0x00d7, B:57:0x00da, B:53:0x00c8, B:61:0x00e4, B:62:0x00e7, B:64:0x00ed, B:66:0x00f8, B:87:0x0125, B:117:0x01f0, B:119:0x01f7, B:120:0x01fa, B:122:0x0200, B:124:0x0204, B:129:0x0214, B:132:0x0220, B:136:0x0234, B:135:0x022e, B:137:0x0237, B:89:0x012d, B:93:0x0137, B:94:0x0144, B:95:0x014c, B:96:0x0153, B:97:0x0154, B:99:0x0161, B:101:0x0171, B:100:0x016c, B:102:0x017a, B:103:0x0182, B:104:0x018c, B:105:0x0196, B:107:0x01ae, B:109:0x01b9, B:110:0x01bf, B:111:0x01c4, B:113:0x01d1, B:115:0x01dc, B:114:0x01d7, B:116:0x01e2, B:25:0x005a, B:27:0x0067, B:29:0x006c, B:32:0x0077), top: B:144:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7 A[Catch: all -> 0x0049, PHI: r5
  0x00e7: PHI (r5v4 boolean) = (r5v3 boolean), (r5v3 boolean), (r5v3 boolean), (r5v8 boolean) binds: [B:34:0x007c, B:36:0x0082, B:61:0x00e4, B:48:0x00b3] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0049, blocks: (B:12:0x0028, B:15:0x003c, B:22:0x004e, B:26:0x0060, B:35:0x007e, B:37:0x0084, B:39:0x0090, B:43:0x00a2, B:45:0x00ab, B:48:0x00b3, B:42:0x009c, B:50:0x00bc, B:54:0x00ce, B:56:0x00d7, B:57:0x00da, B:53:0x00c8, B:61:0x00e4, B:62:0x00e7, B:64:0x00ed, B:66:0x00f8, B:87:0x0125, B:117:0x01f0, B:119:0x01f7, B:120:0x01fa, B:122:0x0200, B:124:0x0204, B:129:0x0214, B:132:0x0220, B:136:0x0234, B:135:0x022e, B:137:0x0237, B:89:0x012d, B:93:0x0137, B:94:0x0144, B:95:0x014c, B:96:0x0153, B:97:0x0154, B:99:0x0161, B:101:0x0171, B:100:0x016c, B:102:0x017a, B:103:0x0182, B:104:0x018c, B:105:0x0196, B:107:0x01ae, B:109:0x01b9, B:110:0x01bf, B:111:0x01c4, B:113:0x01d1, B:115:0x01dc, B:114:0x01d7, B:116:0x01e2, B:25:0x005a, B:27:0x0067, B:29:0x006c, B:32:0x0077), top: B:144:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x0028, B:15:0x003c, B:22:0x004e, B:26:0x0060, B:35:0x007e, B:37:0x0084, B:39:0x0090, B:43:0x00a2, B:45:0x00ab, B:48:0x00b3, B:42:0x009c, B:50:0x00bc, B:54:0x00ce, B:56:0x00d7, B:57:0x00da, B:53:0x00c8, B:61:0x00e4, B:62:0x00e7, B:64:0x00ed, B:66:0x00f8, B:87:0x0125, B:117:0x01f0, B:119:0x01f7, B:120:0x01fa, B:122:0x0200, B:124:0x0204, B:129:0x0214, B:132:0x0220, B:136:0x0234, B:135:0x022e, B:137:0x0237, B:89:0x012d, B:93:0x0137, B:94:0x0144, B:95:0x014c, B:96:0x0153, B:97:0x0154, B:99:0x0161, B:101:0x0171, B:100:0x016c, B:102:0x017a, B:103:0x0182, B:104:0x018c, B:105:0x0196, B:107:0x01ae, B:109:0x01b9, B:110:0x01bf, B:111:0x01c4, B:113:0x01d1, B:115:0x01dc, B:114:0x01d7, B:116:0x01e2, B:25:0x005a, B:27:0x0067, B:29:0x006c, B:32:0x0077), top: B:144:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void parseArray(java.util.Collection r17, java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hw3.parseArray(java.util.Collection, java.lang.Object):void");
    }

    public <T> T parseObject(Class<T> cls) {
        return (T) parseObject(cls, (Object) null);
    }

    public <T> T parseObject(Type type) {
        return (T) parseObject(type, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T parseObject(Type type, Object obj) {
        lh8 lh8Var = this.f45134e;
        int i = lh8Var.f57601a;
        if (i == 8) {
            lh8Var.nextToken();
            return null;
        }
        if (i == 4) {
            if (type == byte[].class) {
                T t = (T) lh8Var.bytesValue();
                this.f45134e.nextToken();
                return t;
            }
            if (type == char[].class) {
                String strStringVal = lh8Var.stringVal();
                this.f45134e.nextToken();
                return (T) strStringVal.toCharArray();
            }
        }
        try {
            return (T) this.f45131b.getDeserializer(type).deserialze(this, type, obj);
        } catch (jh8 e) {
            throw e;
        } catch (Exception e2) {
            throw new jh8(e2.getMessage(), e2);
        }
    }

    public void parseObject(Object obj) {
        Object objDeserialze;
        Class<?> cls = obj.getClass();
        sjb deserializer = this.f45131b.getDeserializer(cls);
        ni8 ni8Var = deserializer instanceof ni8 ? (ni8) deserializer : null;
        int i = this.f45134e.f57601a;
        if (i != 12 && i != 16) {
            throw new jh8("syntax error, expect {, actual " + this.f45134e.tokenName());
        }
        while (true) {
            String strScanSymbol = this.f45134e.scanSymbol(this.f45130a);
            if (strScanSymbol == null) {
                lh8 lh8Var = this.f45134e;
                int i2 = lh8Var.f57601a;
                if (i2 == 13) {
                    lh8Var.nextToken(16);
                    return;
                } else if (i2 != 16 || (lh8Var.f57603c & rp5.AllowArbitraryCommas.f78973a) == 0) {
                }
            }
            er5 er5VarM17966b = ni8Var != null ? ni8Var.m17966b(strScanSymbol) : null;
            if (er5VarM17966b == null) {
                lh8 lh8Var2 = this.f45134e;
                if ((lh8Var2.f57603c & rp5.IgnoreNotMatch.f78973a) != 0) {
                    lh8Var2.nextTokenWithChar(':');
                    parse();
                    lh8 lh8Var3 = this.f45134e;
                    if (lh8Var3.f57601a == 13) {
                        lh8Var3.nextToken();
                        return;
                    }
                } else {
                    throw new jh8("setter not found, class " + cls.getName() + ", property " + strScanSymbol);
                }
            } else {
                kr5 kr5Var = er5VarM17966b.f33882a;
                Class<?> cls2 = kr5Var.f55110m;
                Type type = kr5Var.f55096C;
                if (cls2 == Integer.TYPE) {
                    this.f45134e.nextTokenWithChar(':');
                    objDeserialze = b88.f12963a.deserialze(this, type, null);
                } else if (cls2 == String.class) {
                    this.f45134e.nextTokenWithChar(':');
                    objDeserialze = parseString();
                } else if (cls2 == Long.TYPE) {
                    this.f45134e.nextTokenWithChar(':');
                    objDeserialze = b88.f12963a.deserialze(this, type, null);
                } else {
                    sjb deserializer2 = this.f45131b.getDeserializer(cls2, type);
                    this.f45134e.nextTokenWithChar(':');
                    objDeserialze = deserializer2.deserialze(this, type, null);
                }
                er5VarM17966b.setValue(obj, objDeserialze);
                lh8 lh8Var4 = this.f45134e;
                int i3 = lh8Var4.f57601a;
                if (i3 != 16 && i3 == 13) {
                    lh8Var4.nextToken(16);
                    return;
                }
            }
        }
    }

    public Object parseObject(Map map) {
        return parseObject(map, (Object) null);
    }

    public mh8 parseObject() {
        return (mh8) parseObject((this.f45134e.f57603c & rp5.OrderedField.f78973a) != 0 ? new mh8(new LinkedHashMap()) : new mh8(), (Object) null);
    }
}
