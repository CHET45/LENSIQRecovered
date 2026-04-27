package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class rm2 extends su5 {

    /* JADX INFO: renamed from: a */
    public final List<su5> f78708a;

    /* JADX INFO: renamed from: b */
    public final EnumC12152a f78709b;

    /* JADX INFO: renamed from: c */
    public List<fr5> f78710c;

    /* JADX INFO: renamed from: rm2$a */
    public enum EnumC12152a {
        AND("and"),
        OR("or");


        /* JADX INFO: renamed from: a */
        public final String f78714a;

        EnumC12152a(String str) {
            this.f78714a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f78714a;
        }
    }

    public rm2(List<su5> list, EnumC12152a enumC12152a) {
        this.f78708a = new ArrayList(list);
        this.f78709b = enumC12152a;
    }

    @hib
    private fr5 findFirstMatchingFilter(pz6<fr5, Boolean> pz6Var) {
        for (fr5 fr5Var : getFlattenedFilters()) {
            if (pz6Var.apply(fr5Var).booleanValue()) {
                return fr5Var;
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof rm2)) {
            return false;
        }
        rm2 rm2Var = (rm2) obj;
        return this.f78709b == rm2Var.f78709b && this.f78708a.equals(rm2Var.f78708a);
    }

    @Override // p000.su5
    public String getCanonicalId() {
        StringBuilder sb = new StringBuilder();
        if (isFlatConjunction()) {
            Iterator<su5> it = this.f78708a.iterator();
            while (it.hasNext()) {
                sb.append(it.next().getCanonicalId());
            }
            return sb.toString();
        }
        sb.append(this.f78709b.toString() + c0b.f15433c);
        sb.append(TextUtils.join(",", this.f78708a));
        sb.append(c0b.f15434d);
        return sb.toString();
    }

    @Override // p000.su5
    public List<su5> getFilters() {
        return Collections.unmodifiableList(this.f78708a);
    }

    @Override // p000.su5
    public List<fr5> getFlattenedFilters() {
        List<fr5> list = this.f78710c;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        this.f78710c = new ArrayList();
        Iterator<su5> it = this.f78708a.iterator();
        while (it.hasNext()) {
            this.f78710c.addAll(it.next().getFlattenedFilters());
        }
        return Collections.unmodifiableList(this.f78710c);
    }

    public EnumC12152a getOperator() {
        return this.f78709b;
    }

    public int hashCode() {
        return ((1147 + this.f78709b.hashCode()) * 31) + this.f78708a.hashCode();
    }

    public boolean isConjunction() {
        return this.f78709b == EnumC12152a.AND;
    }

    public boolean isDisjunction() {
        return this.f78709b == EnumC12152a.OR;
    }

    public boolean isFlat() {
        Iterator<su5> it = this.f78708a.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof rm2) {
                return false;
            }
        }
        return true;
    }

    public boolean isFlatConjunction() {
        return isFlat() && isConjunction();
    }

    @Override // p000.su5
    public boolean matches(ph4 ph4Var) {
        if (isConjunction()) {
            Iterator<su5> it = this.f78708a.iterator();
            while (it.hasNext()) {
                if (!it.next().matches(ph4Var)) {
                    return false;
                }
            }
            return true;
        }
        Iterator<su5> it2 = this.f78708a.iterator();
        while (it2.hasNext()) {
            if (it2.next().matches(ph4Var)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return getCanonicalId();
    }

    public rm2 withAddedFilters(List<su5> list) {
        ArrayList arrayList = new ArrayList(this.f78708a);
        arrayList.addAll(list);
        return new rm2(arrayList, this.f78709b);
    }
}
