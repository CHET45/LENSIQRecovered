package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ci8 extends HashMap<j74, pog> {

    /* JADX INFO: renamed from: a */
    public static final ci8 f16627a = new ci8();
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ci8$a */
    public class C2323a extends ade {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ epg f16628a;

        public C2323a(epg epgVar) {
            this.f16628a = epgVar;
        }

        @Override // p000.ade
        public void testFailure(fp5 fp5Var) throws Exception {
            this.f16628a.addError(ci8.this.asTest(fp5Var.getDescription()), fp5Var.getException());
        }

        @Override // p000.ade
        public void testFinished(j74 j74Var) throws Exception {
            this.f16628a.endTest(ci8.this.asTest(j74Var));
        }

        @Override // p000.ade
        public void testStarted(j74 j74Var) throws Exception {
            this.f16628a.startTest(ci8.this.asTest(j74Var));
        }
    }

    public static ci8 getDefault() {
        return f16627a;
    }

    /* JADX INFO: renamed from: a */
    public pog m3984a(j74 j74Var) {
        if (j74Var.isTest()) {
            return new di8(j74Var);
        }
        npg npgVar = new npg(j74Var.getDisplayName());
        Iterator<j74> it = j74Var.getChildren().iterator();
        while (it.hasNext()) {
            npgVar.addTest(asTest(it.next()));
        }
        return npgVar;
    }

    public pog asTest(j74 j74Var) {
        if (j74Var.isSuite()) {
            return m3984a(j74Var);
        }
        if (!containsKey(j74Var)) {
            put(j74Var, m3984a(j74Var));
        }
        return get(j74Var);
    }

    public List<pog> asTestList(j74 j74Var) {
        if (j74Var.isTest()) {
            return Arrays.asList(asTest(j74Var));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<j74> it = j74Var.getChildren().iterator();
        while (it.hasNext()) {
            arrayList.add(asTest(it.next()));
        }
        return arrayList;
    }

    public bde getNotifier(epg epgVar, bi8 bi8Var) {
        bde bdeVar = new bde();
        bdeVar.addListener(new C2323a(epgVar));
        return bdeVar;
    }
}
