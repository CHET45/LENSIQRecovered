package p000;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p000.nra;

/* JADX INFO: loaded from: classes3.dex */
@omg(19)
public class ora implements yic, fb7 {

    /* JADX INFO: renamed from: d */
    public final String f68376d;

    /* JADX INFO: renamed from: f */
    public final nra f68378f;

    /* JADX INFO: renamed from: a */
    public final Path f68373a = new Path();

    /* JADX INFO: renamed from: b */
    public final Path f68374b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f68375c = new Path();

    /* JADX INFO: renamed from: e */
    public final List<yic> f68377e = new ArrayList();

    /* JADX INFO: renamed from: ora$a */
    public static /* synthetic */ class C10512a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68379a;

        static {
            int[] iArr = new int[nra.EnumC10023a.values().length];
            f68379a = iArr;
            try {
                iArr[nra.EnumC10023a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68379a[nra.EnumC10023a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68379a[nra.EnumC10023a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68379a[nra.EnumC10023a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68379a[nra.EnumC10023a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ora(nra nraVar) {
        this.f68376d = nraVar.getName();
        this.f68378f = nraVar;
    }

    private void addPaths() {
        for (int i = 0; i < this.f68377e.size(); i++) {
            this.f68375c.addPath(this.f68377e.get(i).getPath());
        }
    }

    @omg(19)
    private void opFirstPathWithRest(Path.Op op) {
        this.f68374b.reset();
        this.f68373a.reset();
        for (int size = this.f68377e.size() - 1; size >= 1; size--) {
            yic yicVar = this.f68377e.get(size);
            if (yicVar instanceof pv2) {
                pv2 pv2Var = (pv2) yicVar;
                List<yic> listM19793b = pv2Var.m19793b();
                for (int size2 = listM19793b.size() - 1; size2 >= 0; size2--) {
                    Path path = listM19793b.get(size2).getPath();
                    path.transform(pv2Var.m19794c());
                    this.f68374b.addPath(path);
                }
            } else {
                this.f68374b.addPath(yicVar.getPath());
            }
        }
        yic yicVar2 = this.f68377e.get(0);
        if (yicVar2 instanceof pv2) {
            pv2 pv2Var2 = (pv2) yicVar2;
            List<yic> listM19793b2 = pv2Var2.m19793b();
            for (int i = 0; i < listM19793b2.size(); i++) {
                Path path2 = listM19793b2.get(i).getPath();
                path2.transform(pv2Var2.m19794c());
                this.f68373a.addPath(path2);
            }
        } else {
            this.f68373a.set(yicVar2.getPath());
        }
        this.f68375c.op(this.f68373a, this.f68374b, op);
    }

    @Override // p000.fb7
    public void absorbContent(ListIterator<gv2> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            gv2 gv2VarPrevious = listIterator.previous();
            if (gv2VarPrevious instanceof yic) {
                this.f68377e.add((yic) gv2VarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // p000.gv2
    public String getName() {
        return this.f68376d;
    }

    @Override // p000.yic
    public Path getPath() {
        this.f68375c.reset();
        if (this.f68378f.isHidden()) {
            return this.f68375c;
        }
        int i = C10512a.f68379a[this.f68378f.getMode().ordinal()];
        if (i == 1) {
            addPaths();
        } else if (i == 2) {
            opFirstPathWithRest(Path.Op.UNION);
        } else if (i == 3) {
            opFirstPathWithRest(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            opFirstPathWithRest(Path.Op.INTERSECT);
        } else if (i == 5) {
            opFirstPathWithRest(Path.Op.XOR);
        }
        return this.f68375c;
    }

    @Override // p000.gv2
    public void setContents(List<gv2> list, List<gv2> list2) {
        for (int i = 0; i < this.f68377e.size(); i++) {
            this.f68377e.get(i).setContents(list, list2);
        }
    }
}
