package p000;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class i4a {

    /* JADX INFO: renamed from: b */
    public static final String f45719b = "malformed JUnit 3 test class: ";

    /* JADX INFO: renamed from: a */
    public final j4a f45720a;

    /* JADX INFO: renamed from: i4a$a */
    public class C7142a extends o3e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f45721a;

        /* JADX INFO: renamed from: i4a$a$a */
        public class a extends dfg {
            public a(Class cls, List list) throws o18 {
                super((Class<?>) cls, (List<tde>) list);
            }
        }

        public C7142a(List list) {
            this.f45721a = list;
        }

        @Override // p000.o3e
        public tde getRunner() {
            try {
                return new a(null, this.f45721a);
            } catch (o18 e) {
                return new h55(null, e);
            }
        }
    }

    private i4a(File file) {
        this.f45720a = j4a.forFolder(file);
    }

    private tde buildRunner(j74 j74Var) {
        if (j74Var.toString().equals("TestSuite with 0 tests")) {
            return dfg.emptySuite();
        }
        if (j74Var.toString().startsWith(f45719b)) {
            return new wh8(new npg(getMalformedTestClass(j74Var)));
        }
        Class<?> testClass = j74Var.getTestClass();
        if (testClass != null) {
            String methodName = j74Var.getMethodName();
            return methodName == null ? o3e.aClass(testClass).getRunner() : o3e.method(testClass, methodName).getRunner();
        }
        throw new RuntimeException("Can't build a runner from description [" + j74Var + "]");
    }

    private o3e constructLeafRequest(List<j74> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<j74> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(buildRunner(it.next()));
        }
        return new C7142a(arrayList);
    }

    private List<j74> findLeaves(o3e o3eVar) {
        ArrayList arrayList = new ArrayList();
        findLeaves(null, o3eVar.getRunner().getDescription(), arrayList);
        return arrayList;
    }

    @Deprecated
    public static i4a forFolder(String str) {
        return storedLocally(new File(str));
    }

    private Class<?> getMalformedTestClass(j74 j74Var) {
        try {
            return Class.forName(j74Var.toString().replace(f45719b, ""));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static i4a storedLocally(File file) {
        return new i4a(file);
    }

    public w7e run(Class<?> cls) {
        return run(o3e.aClass(cls));
    }

    public o3e sortRequest(o3e o3eVar) {
        if (o3eVar instanceof vvf) {
            return o3eVar;
        }
        List<j74> listFindLeaves = findLeaves(o3eVar);
        Collections.sort(listFindLeaves, this.f45720a.testComparator());
        return constructLeafRequest(listFindLeaves);
    }

    public List<j74> sortedLeavesForTest(o3e o3eVar) {
        return findLeaves(sortRequest(o3eVar));
    }

    public w7e run(o3e o3eVar) {
        return run(o3eVar, new fi8());
    }

    private void findLeaves(j74 j74Var, j74 j74Var2, List<j74> list) {
        if (j74Var2.getChildren().isEmpty()) {
            if (j74Var2.toString().equals("warning(junit.framework.TestSuite$1)")) {
                list.add(j74.createSuiteDescription(f45719b + j74Var, new Annotation[0]));
                return;
            }
            list.add(j74Var2);
            return;
        }
        Iterator<j74> it = j74Var2.getChildren().iterator();
        while (it.hasNext()) {
            findLeaves(j74Var2, it.next(), list);
        }
    }

    public w7e run(o3e o3eVar, fi8 fi8Var) {
        fi8Var.addListener(this.f45720a.listener());
        return fi8Var.run(sortRequest(o3eVar).getRunner());
    }
}
