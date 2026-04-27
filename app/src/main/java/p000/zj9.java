package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.fr5;
import p000.rm2;

/* JADX INFO: loaded from: classes5.dex */
public class zj9 {
    /* JADX INFO: renamed from: a */
    public static su5 m26874a(su5 su5Var) {
        assertFieldFilterOrCompositeFilter(su5Var);
        if (isSingleFieldFilter(su5Var)) {
            return su5Var;
        }
        rm2 rm2Var = (rm2) su5Var;
        List<su5> filters = rm2Var.getFilters();
        if (filters.size() == 1) {
            return m26874a(filters.get(0));
        }
        if (rm2Var.isFlat()) {
            return rm2Var;
        }
        ArrayList<su5> arrayList = new ArrayList();
        Iterator<su5> it = filters.iterator();
        while (it.hasNext()) {
            arrayList.add(m26874a(it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (su5 su5Var2 : arrayList) {
            if (su5Var2 instanceof fr5) {
                arrayList2.add(su5Var2);
            } else if (su5Var2 instanceof rm2) {
                rm2 rm2Var2 = (rm2) su5Var2;
                if (rm2Var2.getOperator().equals(rm2Var.getOperator())) {
                    arrayList2.addAll(rm2Var2.getFilters());
                } else {
                    arrayList2.add(rm2Var2);
                }
            }
        }
        return arrayList2.size() == 1 ? (su5) arrayList2.get(0) : new rm2(arrayList2, rm2Var.getOperator());
    }

    private static su5 applyDistribution(fr5 fr5Var, fr5 fr5Var2) {
        return new rm2(Arrays.asList(fr5Var, fr5Var2), rm2.EnumC12152a.AND);
    }

    private static void assertFieldFilterOrCompositeFilter(su5 su5Var) {
        r80.hardAssert((su5Var instanceof fr5) || (su5Var instanceof rm2), "Only field filters and composite filters are accepted.", new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    public static su5 m26875b(su5 su5Var, su5 su5Var2) {
        assertFieldFilterOrCompositeFilter(su5Var);
        assertFieldFilterOrCompositeFilter(su5Var2);
        boolean z = su5Var instanceof fr5;
        return m26874a((z && (su5Var2 instanceof fr5)) ? applyDistribution((fr5) su5Var, (fr5) su5Var2) : (z && (su5Var2 instanceof rm2)) ? applyDistribution((fr5) su5Var, (rm2) su5Var2) : ((su5Var instanceof rm2) && (su5Var2 instanceof fr5)) ? applyDistribution((fr5) su5Var2, (rm2) su5Var) : applyDistribution((rm2) su5Var, (rm2) su5Var2));
    }

    /* JADX INFO: renamed from: c */
    public static su5 m26876c(su5 su5Var) {
        assertFieldFilterOrCompositeFilter(su5Var);
        if (su5Var instanceof fr5) {
            return su5Var;
        }
        rm2 rm2Var = (rm2) su5Var;
        if (rm2Var.getFilters().size() == 1) {
            return m26876c(su5Var.getFilters().get(0));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<su5> it = rm2Var.getFilters().iterator();
        while (it.hasNext()) {
            arrayList.add(m26876c(it.next()));
        }
        su5 su5VarM26874a = m26874a(new rm2(arrayList, rm2Var.getOperator()));
        if (isDisjunctiveNormalForm(su5VarM26874a)) {
            return su5VarM26874a;
        }
        r80.hardAssert(su5VarM26874a instanceof rm2, "field filters are already in DNF form.", new Object[0]);
        rm2 rm2Var2 = (rm2) su5VarM26874a;
        r80.hardAssert(rm2Var2.isConjunction(), "Disjunction of filters all of which are already in DNF form is itself in DNF form.", new Object[0]);
        r80.hardAssert(rm2Var2.getFilters().size() > 1, "Single-filter composite filters are already in DNF form.", new Object[0]);
        su5 su5VarM26875b = rm2Var2.getFilters().get(0);
        for (int i = 1; i < rm2Var2.getFilters().size(); i++) {
            su5VarM26875b = m26875b(su5VarM26875b, rm2Var2.getFilters().get(i));
        }
        return su5VarM26875b;
    }

    /* JADX INFO: renamed from: d */
    public static su5 m26877d(su5 su5Var) {
        assertFieldFilterOrCompositeFilter(su5Var);
        ArrayList arrayList = new ArrayList();
        if (!(su5Var instanceof fr5)) {
            rm2 rm2Var = (rm2) su5Var;
            Iterator<su5> it = rm2Var.getFilters().iterator();
            while (it.hasNext()) {
                arrayList.add(m26877d(it.next()));
            }
            return new rm2(arrayList, rm2Var.getOperator());
        }
        if (!(su5Var instanceof az7)) {
            return su5Var;
        }
        az7 az7Var = (az7) su5Var;
        Iterator<b2i> it2 = az7Var.getValue().getArrayValue().getValuesList().iterator();
        while (it2.hasNext()) {
            arrayList.add(fr5.create(az7Var.getField(), fr5.EnumC5939b.EQUAL, it2.next()));
        }
        return new rm2(arrayList, rm2.EnumC12152a.OR);
    }

    public static List<su5> getDnfTerms(rm2 rm2Var) {
        if (rm2Var.getFilters().isEmpty()) {
            return Collections.emptyList();
        }
        su5 su5VarM26876c = m26876c(m26877d(rm2Var));
        r80.hardAssert(isDisjunctiveNormalForm(su5VarM26876c), "computeDistributedNormalForm did not result in disjunctive normal form", new Object[0]);
        return (isSingleFieldFilter(su5VarM26876c) || isFlatConjunction(su5VarM26876c)) ? Collections.singletonList(su5VarM26876c) : su5VarM26876c.getFilters();
    }

    private static boolean isDisjunctionOfFieldFiltersAndFlatConjunctions(su5 su5Var) {
        if (su5Var instanceof rm2) {
            rm2 rm2Var = (rm2) su5Var;
            if (rm2Var.isDisjunction()) {
                for (su5 su5Var2 : rm2Var.getFilters()) {
                    if (!isSingleFieldFilter(su5Var2) && !isFlatConjunction(su5Var2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static boolean isDisjunctiveNormalForm(su5 su5Var) {
        return isSingleFieldFilter(su5Var) || isFlatConjunction(su5Var) || isDisjunctionOfFieldFiltersAndFlatConjunctions(su5Var);
    }

    private static boolean isFlatConjunction(su5 su5Var) {
        return (su5Var instanceof rm2) && ((rm2) su5Var).isFlatConjunction();
    }

    private static boolean isSingleFieldFilter(su5 su5Var) {
        return su5Var instanceof fr5;
    }

    private static su5 applyDistribution(fr5 fr5Var, rm2 rm2Var) {
        if (rm2Var.isConjunction()) {
            return rm2Var.withAddedFilters(Collections.singletonList(fr5Var));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<su5> it = rm2Var.getFilters().iterator();
        while (it.hasNext()) {
            arrayList.add(m26875b(fr5Var, it.next()));
        }
        return new rm2(arrayList, rm2.EnumC12152a.OR);
    }

    private static su5 applyDistribution(rm2 rm2Var, rm2 rm2Var2) {
        r80.hardAssert((rm2Var.getFilters().isEmpty() || rm2Var2.getFilters().isEmpty()) ? false : true, "Found an empty composite filter", new Object[0]);
        if (rm2Var.isConjunction() && rm2Var2.isConjunction()) {
            return rm2Var.withAddedFilters(rm2Var2.getFilters());
        }
        rm2 rm2Var3 = rm2Var.isDisjunction() ? rm2Var : rm2Var2;
        if (rm2Var.isDisjunction()) {
            rm2Var = rm2Var2;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<su5> it = rm2Var3.getFilters().iterator();
        while (it.hasNext()) {
            arrayList.add(m26875b(it.next(), rm2Var));
        }
        return new rm2(arrayList, rm2.EnumC12152a.OR);
    }
}
