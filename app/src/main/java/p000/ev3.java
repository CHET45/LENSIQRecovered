package p000;

/* JADX INFO: loaded from: classes3.dex */
public class ev3 extends er5 {

    /* JADX INFO: renamed from: c */
    public sjb f34119c;

    public ev3(whc whcVar, Class<?> cls, kr5 kr5Var) {
        super(cls, kr5Var, 2);
    }

    public sjb getFieldValueDeserilizer(whc whcVar) {
        if (this.f34119c == null) {
            kr5 kr5Var = this.f33882a;
            this.f34119c = whcVar.getDeserializer(kr5Var.f55110m, kr5Var.f55096C);
        }
        return this.f34119c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // p000.er5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parseField(p000.hw3 r4, java.lang.Object r5, java.lang.reflect.Type r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            r3 = this;
            sjb r0 = r3.f34119c
            if (r0 != 0) goto L12
            whc r0 = r4.f45131b
            kr5 r1 = r3.f33882a
            java.lang.Class<?> r2 = r1.f55110m
            java.lang.reflect.Type r1 = r1.f55096C
            sjb r0 = r0.getDeserializer(r2, r1)
            r3.f34119c = r0
        L12:
            boolean r0 = r6 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L1a
            mhc r0 = r4.f45135f
            r0.f61023d = r6
        L1a:
            kr5 r6 = r3.f33882a
            java.lang.String r0 = r6.f55103X
            if (r0 == 0) goto L31
            sjb r1 = r3.f34119c
            boolean r2 = r1 instanceof p000.cj3
            if (r2 == 0) goto L31
            cj3 r1 = (p000.cj3) r1
            java.lang.reflect.Type r2 = r6.f55096C
            java.lang.String r6 = r6.f55104a
            java.lang.Object r6 = r1.deserialze(r4, r2, r6, r0)
            goto L3b
        L31:
            sjb r0 = r3.f34119c
            java.lang.reflect.Type r1 = r6.f55096C
            java.lang.String r6 = r6.f55104a
            java.lang.Object r6 = r0.deserialze(r4, r1, r6)
        L3b:
            int r0 = r4.f45126H
            r1 = 1
            if (r0 != r1) goto L4e
            hw3$a r5 = r4.m12643d()
            r5.f45139c = r3
            mhc r6 = r4.f45135f
            r5.f45140d = r6
            r5 = 0
            r4.f45126H = r5
            goto L72
        L4e:
            if (r5 != 0) goto L58
            kr5 r4 = r3.f33882a
            java.lang.String r4 = r4.f55104a
            r7.put(r4, r6)
            goto L72
        L58:
            if (r6 != 0) goto L6f
            kr5 r4 = r3.f33882a
            java.lang.Class<?> r4 = r4.f55110m
            java.lang.Class r7 = java.lang.Byte.TYPE
            if (r4 == r7) goto L6e
            java.lang.Class r7 = java.lang.Short.TYPE
            if (r4 == r7) goto L6e
            java.lang.Class r7 = java.lang.Float.TYPE
            if (r4 == r7) goto L6e
            java.lang.Class r7 = java.lang.Double.TYPE
            if (r4 != r7) goto L6f
        L6e:
            return
        L6f:
            r3.setValue(r5, r6)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ev3.parseField(hw3, java.lang.Object, java.lang.reflect.Type, java.util.Map):void");
    }
}
