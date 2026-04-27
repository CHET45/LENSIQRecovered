package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public final class yya {

    /* JADX INFO: renamed from: yya$b */
    public static final class C15889b {

        /* JADX INFO: renamed from: a */
        public final String f103344a;

        /* JADX INFO: renamed from: b */
        public final b f103345b;

        /* JADX INFO: renamed from: c */
        public b f103346c;

        /* JADX INFO: renamed from: d */
        public boolean f103347d;

        /* JADX INFO: renamed from: e */
        public boolean f103348e;

        /* JADX INFO: renamed from: yya$b$a */
        public static final class a extends b {
            private a() {
                super();
            }
        }

        /* JADX INFO: renamed from: yya$b$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            @wx1
            public String f103349a;

            /* JADX INFO: renamed from: b */
            @wx1
            public Object f103350b;

            /* JADX INFO: renamed from: c */
            @wx1
            public b f103351c;

            private b() {
            }
        }

        private b addHolder() {
            b bVar = new b();
            this.f103346c.f103351c = bVar;
            this.f103346c = bVar;
            return bVar;
        }

        private a addUnconditionalHolder() {
            a aVar = new a();
            this.f103346c.f103351c = aVar;
            this.f103346c = aVar;
            return aVar;
        }

        private static boolean isEmpty(Object value) {
            return value instanceof CharSequence ? ((CharSequence) value).length() == 0 : value instanceof Collection ? ((Collection) value).isEmpty() : value instanceof Map ? ((Map) value).isEmpty() : value instanceof z6c ? !((z6c) value).isPresent() : value.getClass().isArray() && Array.getLength(value) == 0;
        }

        @op1
        public C15889b add(String name, @wx1 Object value) {
            return addHolder(name, value);
        }

        @op1
        public C15889b addValue(@wx1 Object value) {
            return addHolder(value);
        }

        @op1
        public C15889b omitNullValues() {
            this.f103347d = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r7 = this;
                boolean r0 = r7.f103347d
                boolean r1 = r7.f103348e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 32
                r2.<init>(r3)
                java.lang.String r3 = r7.f103344a
                r2.append(r3)
                r3 = 123(0x7b, float:1.72E-43)
                r2.append(r3)
                yya$b$b r3 = r7.f103345b
                yya$b$b r3 = r3.f103351c
                java.lang.String r4 = ""
            L1b:
                if (r3 == 0) goto L65
                java.lang.Object r5 = r3.f103350b
                boolean r6 = r3 instanceof p000.yya.C15889b.a
                if (r6 != 0) goto L30
                if (r5 != 0) goto L28
                if (r0 != 0) goto L62
                goto L30
            L28:
                if (r1 == 0) goto L30
                boolean r6 = isEmpty(r5)
                if (r6 != 0) goto L62
            L30:
                r2.append(r4)
                java.lang.String r4 = r3.f103349a
                if (r4 == 0) goto L3f
                r2.append(r4)
                r4 = 61
                r2.append(r4)
            L3f:
                if (r5 == 0) goto L5d
                java.lang.Class r4 = r5.getClass()
                boolean r4 = r4.isArray()
                if (r4 == 0) goto L5d
                java.lang.Object[] r4 = new java.lang.Object[]{r5}
                java.lang.String r4 = java.util.Arrays.deepToString(r4)
                int r5 = r4.length()
                r6 = 1
                int r5 = r5 - r6
                r2.append(r4, r6, r5)
                goto L60
            L5d:
                r2.append(r5)
            L60:
                java.lang.String r4 = ", "
            L62:
                yya$b$b r3 = r3.f103351c
                goto L1b
            L65:
                r0 = 125(0x7d, float:1.75E-43)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.yya.C15889b.toString():java.lang.String");
        }

        private C15889b(String className) {
            b bVar = new b();
            this.f103345b = bVar;
            this.f103346c = bVar;
            this.f103347d = false;
            this.f103348e = false;
            this.f103344a = (String) v7d.checkNotNull(className);
        }

        @op1
        public C15889b add(String name, boolean value) {
            return addUnconditionalHolder(name, String.valueOf(value));
        }

        @op1
        public C15889b addValue(boolean value) {
            return addUnconditionalHolder(String.valueOf(value));
        }

        @op1
        private C15889b addHolder(@wx1 Object value) {
            addHolder().f103350b = value;
            return this;
        }

        @op1
        private C15889b addUnconditionalHolder(Object value) {
            addUnconditionalHolder().f103350b = value;
            return this;
        }

        @op1
        public C15889b add(String name, char value) {
            return addUnconditionalHolder(name, String.valueOf(value));
        }

        @op1
        public C15889b addValue(char value) {
            return addUnconditionalHolder(String.valueOf(value));
        }

        @op1
        public C15889b add(String name, double value) {
            return addUnconditionalHolder(name, String.valueOf(value));
        }

        @op1
        public C15889b addValue(double value) {
            return addUnconditionalHolder(String.valueOf(value));
        }

        @op1
        private C15889b addHolder(String name, @wx1 Object value) {
            b bVarAddHolder = addHolder();
            bVarAddHolder.f103350b = value;
            bVarAddHolder.f103349a = (String) v7d.checkNotNull(name);
            return this;
        }

        @op1
        private C15889b addUnconditionalHolder(String name, Object value) {
            a aVarAddUnconditionalHolder = addUnconditionalHolder();
            aVarAddUnconditionalHolder.f103350b = value;
            aVarAddUnconditionalHolder.f103349a = (String) v7d.checkNotNull(name);
            return this;
        }

        @op1
        public C15889b add(String name, float value) {
            return addUnconditionalHolder(name, String.valueOf(value));
        }

        @op1
        public C15889b addValue(float value) {
            return addUnconditionalHolder(String.valueOf(value));
        }

        @op1
        public C15889b add(String name, int value) {
            return addUnconditionalHolder(name, String.valueOf(value));
        }

        @op1
        public C15889b addValue(int value) {
            return addUnconditionalHolder(String.valueOf(value));
        }

        @op1
        public C15889b add(String name, long value) {
            return addUnconditionalHolder(name, String.valueOf(value));
        }

        @op1
        public C15889b addValue(long value) {
            return addUnconditionalHolder(String.valueOf(value));
        }
    }

    private yya() {
    }

    public static <T> T firstNonNull(@wx1 T first, @wx1 T second) {
        if (first != null) {
            return first;
        }
        if (second != null) {
            return second;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static C15889b toStringHelper(Object self) {
        return new C15889b(self.getClass().getSimpleName());
    }

    public static C15889b toStringHelper(Class<?> clazz) {
        return new C15889b(clazz.getSimpleName());
    }

    public static C15889b toStringHelper(String className) {
        return new C15889b(className);
    }
}
