package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class oi8 {

    /* JADX INFO: renamed from: a */
    public final Constructor<?> f67733a;

    /* JADX INFO: renamed from: b */
    public final int f67734b;

    /* JADX INFO: renamed from: c */
    public final Constructor<?> f67735c;

    /* JADX INFO: renamed from: d */
    public final Method f67736d;

    /* JADX INFO: renamed from: e */
    public final kr5[] f67737e;

    /* JADX INFO: renamed from: f */
    public final kr5[] f67738f;

    /* JADX INFO: renamed from: g */
    public final th8 f67739g;

    /* JADX INFO: renamed from: h */
    public boolean f67740h = false;

    /* JADX INFO: renamed from: i */
    public final boolean f67741i;

    /* JADX INFO: renamed from: j */
    public final String f67742j;

    /* JADX INFO: renamed from: k */
    public final int f67743k;

    public oi8(Class<?> cls, Constructor<?> constructor, Constructor<?> constructor2, Method method, kr5[] kr5VarArr, kr5[] kr5VarArr2, th8 th8Var) {
        int i;
        boolean z;
        this.f67733a = constructor;
        this.f67735c = constructor2;
        this.f67736d = method;
        this.f67737e = kr5VarArr;
        this.f67739g = th8Var;
        if (th8Var != null) {
            String strTypeName = th8Var.typeName();
            if (strTypeName.length() != 0) {
                this.f67742j = strTypeName;
            } else {
                this.f67742j = cls.getName();
            }
            i = 0;
            for (rp5 rp5Var : th8Var.parseFeatures()) {
                i |= rp5Var.f78973a;
            }
        } else {
            this.f67742j = cls.getName();
            i = 0;
        }
        this.f67743k = i;
        if (th8Var != null) {
            rp5[] features = th8Var.parseFeatures();
            z = false;
            for (rp5 rp5Var2 : features) {
                if (rp5Var2 == rp5.SupportArrayToBean) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        this.f67741i = z;
        kr5[] kr5VarArrComputeSortedFields = computeSortedFields(kr5VarArr, kr5VarArr2);
        this.f67738f = Arrays.equals(kr5VarArr, kr5VarArrComputeSortedFields) ? kr5VarArr : kr5VarArrComputeSortedFields;
        this.f67734b = constructor != null ? constructor.getParameterTypes().length : 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18714a(List<kr5> list, kr5 kr5Var, boolean z) {
        if (!z) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                kr5 kr5Var2 = list.get(i);
                if (kr5Var2.f55104a.equals(kr5Var.f55104a) && (!kr5Var2.f55098H || kr5Var.f55098H)) {
                    return false;
                }
            }
        }
        list.add(kr5Var);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0635  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.oi8 build(java.lang.Class<?> r38, int r39, java.lang.reflect.Type r40, boolean r41, boolean r42, boolean r43, boolean r44, p000.igd r45) {
        /*
            Method dump skipped, instruction units count: 1733
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.oi8.build(java.lang.Class, int, java.lang.reflect.Type, boolean, boolean, boolean, boolean, igd):oi8");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p000.kr5[] computeSortedFields(p000.kr5[] r9, p000.kr5[] r10) {
        /*
            r8 = this;
            th8 r0 = r8.f67739g
            if (r0 != 0) goto L5
            return r10
        L5:
            java.lang.String[] r0 = r0.orders()
            if (r0 == 0) goto Lad
            int r1 = r0.length
            if (r1 == 0) goto Lad
            r1 = 0
            r2 = r1
        L10:
            int r3 = r0.length
            if (r2 >= r3) goto L2a
            r3 = r1
        L14:
            int r4 = r10.length
            if (r3 >= r4) goto L29
            r4 = r10[r3]
            java.lang.String r4 = r4.f55104a
            r5 = r0[r2]
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L26
            int r2 = r2 + 1
            goto L10
        L26:
            int r3 = r3 + 1
            goto L14
        L29:
            return r10
        L2a:
            int r2 = r0.length
            int r9 = r9.length
            r3 = 1
            if (r2 != r9) goto L68
            r9 = r1
        L30:
            int r2 = r0.length
            if (r9 >= r2) goto L67
            r2 = r10[r9]
            java.lang.String r2 = r2.f55104a
            r4 = r0[r9]
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L64
            int r9 = r10.length
            kr5[] r9 = new p000.kr5[r9]
            r2 = r1
        L43:
            int r4 = r0.length
            if (r2 >= r4) goto L61
            r4 = r1
        L47:
            int r5 = r10.length
            if (r4 >= r5) goto L5e
            r5 = r10[r4]
            java.lang.String r5 = r5.f55104a
            r6 = r0[r2]
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L5b
            r4 = r10[r4]
            r9[r2] = r4
            goto L5e
        L5b:
            int r4 = r4 + 1
            goto L47
        L5e:
            int r2 = r2 + 1
            goto L43
        L61:
            r8.f67740h = r3
            return r9
        L64:
            int r9 = r9 + 1
            goto L30
        L67:
            return r10
        L68:
            int r9 = r10.length
            kr5[] r2 = new p000.kr5[r9]
            r4 = r1
        L6c:
            int r5 = r0.length
            if (r4 >= r5) goto L8a
            r5 = r1
        L70:
            int r6 = r10.length
            if (r5 >= r6) goto L87
            r6 = r10[r5]
            java.lang.String r6 = r6.f55104a
            r7 = r0[r4]
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L84
            r5 = r10[r5]
            r2[r4] = r5
            goto L87
        L84:
            int r5 = r5 + 1
            goto L70
        L87:
            int r4 = r4 + 1
            goto L6c
        L8a:
            int r0 = r0.length
            r4 = r1
        L8c:
            int r5 = r10.length
            if (r4 >= r5) goto Lab
            r5 = r1
        L90:
            if (r5 >= r9) goto La2
            if (r5 >= r0) goto La2
            r6 = r2[r4]
            r7 = r10[r5]
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L9f
            goto La8
        L9f:
            int r5 = r5 + 1
            goto L90
        La2:
            r5 = r10[r4]
            r2[r0] = r5
            int r0 = r0 + 1
        La8:
            int r4 = r4 + 1
            goto L8c
        Lab:
            r8.f67740h = r3
        Lad:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.oi8.computeSortedFields(kr5[], kr5[]):kr5[]");
    }
}
