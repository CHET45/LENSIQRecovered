package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class fr5 extends su5 {

    /* JADX INFO: renamed from: a */
    public final EnumC5939b f37537a;

    /* JADX INFO: renamed from: b */
    public final b2i f37538b;

    /* JADX INFO: renamed from: c */
    public final wr5 f37539c;

    /* JADX INFO: renamed from: fr5$a */
    public static /* synthetic */ class C5938a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37540a;

        static {
            int[] iArr = new int[EnumC5939b.values().length];
            f37540a = iArr;
            try {
                iArr[EnumC5939b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37540a[EnumC5939b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37540a[EnumC5939b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37540a[EnumC5939b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37540a[EnumC5939b.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37540a[EnumC5939b.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: fr5$b */
    public enum EnumC5939b {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN("in"),
        NOT_IN("not_in");


        /* JADX INFO: renamed from: a */
        public final String f37552a;

        EnumC5939b(String str) {
            this.f37552a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f37552a;
        }
    }

    public fr5(wr5 wr5Var, EnumC5939b enumC5939b, b2i b2iVar) {
        this.f37539c = wr5Var;
        this.f37537a = enumC5939b;
        this.f37538b = b2iVar;
    }

    public static fr5 create(wr5 wr5Var, EnumC5939b enumC5939b, b2i b2iVar) {
        if (!wr5Var.isKeyField()) {
            return enumC5939b == EnumC5939b.ARRAY_CONTAINS ? new b60(wr5Var, b2iVar) : enumC5939b == EnumC5939b.IN ? new az7(wr5Var, b2iVar) : enumC5939b == EnumC5939b.ARRAY_CONTAINS_ANY ? new a60(wr5Var, b2iVar) : enumC5939b == EnumC5939b.NOT_IN ? new xfb(wr5Var, b2iVar) : new fr5(wr5Var, enumC5939b, b2iVar);
        }
        if (enumC5939b == EnumC5939b.IN) {
            return new qq8(wr5Var, b2iVar);
        }
        if (enumC5939b == EnumC5939b.NOT_IN) {
            return new rq8(wr5Var, b2iVar);
        }
        r80.hardAssert((enumC5939b == EnumC5939b.ARRAY_CONTAINS || enumC5939b == EnumC5939b.ARRAY_CONTAINS_ANY) ? false : true, enumC5939b.toString() + "queries don't make sense on document keys", new Object[0]);
        return new pq8(wr5Var, enumC5939b, b2iVar);
    }

    /* JADX INFO: renamed from: a */
    public boolean m11112a(int i) {
        switch (C5938a.f37540a[this.f37537a.ordinal()]) {
            case 1:
                return i < 0;
            case 2:
                return i <= 0;
            case 3:
                return i == 0;
            case 4:
                return i != 0;
            case 5:
                return i > 0;
            case 6:
                return i >= 0;
            default:
                throw r80.fail("Unknown FieldFilter operator: %s", this.f37537a);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fr5)) {
            return false;
        }
        fr5 fr5Var = (fr5) obj;
        return this.f37537a == fr5Var.f37537a && this.f37539c.equals(fr5Var.f37539c) && this.f37538b.equals(fr5Var.f37538b);
    }

    @Override // p000.su5
    public String getCanonicalId() {
        return getField().canonicalString() + getOperator().toString() + s2i.canonicalId(getValue());
    }

    public wr5 getField() {
        return this.f37539c;
    }

    @Override // p000.su5
    public List<su5> getFilters() {
        return Collections.singletonList(this);
    }

    @Override // p000.su5
    public List<fr5> getFlattenedFilters() {
        return Collections.singletonList(this);
    }

    public EnumC5939b getOperator() {
        return this.f37537a;
    }

    public b2i getValue() {
        return this.f37538b;
    }

    public int hashCode() {
        return ((((1147 + this.f37537a.hashCode()) * 31) + this.f37539c.hashCode()) * 31) + this.f37538b.hashCode();
    }

    public boolean isInequality() {
        return Arrays.asList(EnumC5939b.LESS_THAN, EnumC5939b.LESS_THAN_OR_EQUAL, EnumC5939b.GREATER_THAN, EnumC5939b.GREATER_THAN_OR_EQUAL, EnumC5939b.NOT_EQUAL, EnumC5939b.NOT_IN).contains(this.f37537a);
    }

    @Override // p000.su5
    public boolean matches(ph4 ph4Var) {
        b2i field = ph4Var.getField(this.f37539c);
        return this.f37537a == EnumC5939b.NOT_EQUAL ? (field == null || field.hasNullValue() || !m11112a(s2i.compare(field, this.f37538b))) ? false : true : field != null && s2i.typeOrder(field) == s2i.typeOrder(this.f37538b) && m11112a(s2i.compare(field, this.f37538b));
    }

    public String toString() {
        return getCanonicalId();
    }
}
