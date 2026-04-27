package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p000.uyh;

/* JADX INFO: loaded from: classes.dex */
public class f2g {

    /* JADX INFO: renamed from: f */
    public static final int f34891f = -1;

    /* JADX INFO: renamed from: g */
    public static final int f34892g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f34893h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f34894i = 2;

    /* JADX INFO: renamed from: j */
    public static final Integer f34895j = 0;

    /* JADX INFO: renamed from: a */
    public HashMap<Object, lvd> f34896a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public HashMap<Object, oj7> f34897b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public HashMap<String, ArrayList<String>> f34898c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public final gu2 f34899d;

    /* JADX INFO: renamed from: e */
    public int f34900e;

    /* JADX INFO: renamed from: f2g$a */
    public static /* synthetic */ class C5561a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34901a;

        static {
            int[] iArr = new int[EnumC5565e.values().length];
            f34901a = iArr;
            try {
                iArr[EnumC5565e.HORIZONTAL_CHAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34901a[EnumC5565e.VERTICAL_CHAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34901a[EnumC5565e.ALIGN_HORIZONTALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34901a[EnumC5565e.ALIGN_VERTICALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34901a[EnumC5565e.BARRIER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: f2g$b */
    public enum EnumC5562b {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    /* JADX INFO: renamed from: f2g$c */
    public enum EnumC5563c {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    /* JADX INFO: renamed from: f2g$d */
    public enum EnumC5564d {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    /* JADX INFO: renamed from: f2g$e */
    public enum EnumC5565e {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    public f2g() {
        gu2 gu2Var = new gu2(this);
        this.f34899d = gu2Var;
        this.f34900e = 0;
        this.f34896a.put(f34895j, gu2Var);
    }

    private String createHelperKey() {
        StringBuilder sb = new StringBuilder();
        sb.append("__HELPER_KEY_");
        int i = this.f34900e;
        this.f34900e = i + 1;
        sb.append(i);
        sb.append(uyh.C13797c.f89516d);
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public lvd m10485a(Object obj) {
        return this.f34896a.get(obj);
    }

    public void apply(ju2 ju2Var) {
        oj7 oj7Var;
        qj7 helperWidget;
        qj7 helperWidget2;
        ju2Var.removeAllChildren();
        this.f34899d.getWidth().apply(this, ju2Var, 0);
        this.f34899d.getHeight().apply(this, ju2Var, 1);
        for (Object obj : this.f34897b.keySet()) {
            qj7 helperWidget3 = this.f34897b.get(obj).getHelperWidget();
            if (helperWidget3 != null) {
                lvd lvdVarConstraints = this.f34896a.get(obj);
                if (lvdVarConstraints == null) {
                    lvdVarConstraints = constraints(obj);
                }
                lvdVarConstraints.setConstraintWidget(helperWidget3);
            }
        }
        for (Object obj2 : this.f34896a.keySet()) {
            lvd lvdVar = this.f34896a.get(obj2);
            if (lvdVar != this.f34899d && (lvdVar.getFacade() instanceof oj7) && (helperWidget2 = ((oj7) lvdVar.getFacade()).getHelperWidget()) != null) {
                lvd lvdVarConstraints2 = this.f34896a.get(obj2);
                if (lvdVarConstraints2 == null) {
                    lvdVarConstraints2 = constraints(obj2);
                }
                lvdVarConstraints2.setConstraintWidget(helperWidget2);
            }
        }
        Iterator<Object> it = this.f34896a.keySet().iterator();
        while (it.hasNext()) {
            lvd lvdVar2 = this.f34896a.get(it.next());
            if (lvdVar2 != this.f34899d) {
                iu2 constraintWidget = lvdVar2.getConstraintWidget();
                constraintWidget.setDebugName(lvdVar2.getKey().toString());
                constraintWidget.setParent(null);
                if (lvdVar2.getFacade() instanceof fd7) {
                    lvdVar2.apply();
                }
                ju2Var.add(constraintWidget);
            } else {
                lvdVar2.setConstraintWidget(ju2Var);
            }
        }
        Iterator<Object> it2 = this.f34897b.keySet().iterator();
        while (it2.hasNext()) {
            oj7 oj7Var2 = this.f34897b.get(it2.next());
            if (oj7Var2.getHelperWidget() != null) {
                Iterator<Object> it3 = oj7Var2.f67811l0.iterator();
                while (it3.hasNext()) {
                    oj7Var2.getHelperWidget().add(this.f34896a.get(it3.next()).getConstraintWidget());
                }
                oj7Var2.apply();
            } else {
                oj7Var2.apply();
            }
        }
        Iterator<Object> it4 = this.f34896a.keySet().iterator();
        while (it4.hasNext()) {
            lvd lvdVar3 = this.f34896a.get(it4.next());
            if (lvdVar3 != this.f34899d && (lvdVar3.getFacade() instanceof oj7) && (helperWidget = (oj7Var = (oj7) lvdVar3.getFacade()).getHelperWidget()) != null) {
                for (Object obj3 : oj7Var.f67811l0) {
                    lvd lvdVar4 = this.f34896a.get(obj3);
                    if (lvdVar4 != null) {
                        helperWidget.add(lvdVar4.getConstraintWidget());
                    } else if (obj3 instanceof lvd) {
                        helperWidget.add(((lvd) obj3).getConstraintWidget());
                    } else {
                        System.out.println("couldn't find reference for " + obj3);
                    }
                }
                lvdVar3.apply();
            }
        }
        for (Object obj4 : this.f34896a.keySet()) {
            lvd lvdVar5 = this.f34896a.get(obj4);
            lvdVar5.apply();
            iu2 constraintWidget2 = lvdVar5.getConstraintWidget();
            if (constraintWidget2 != null && obj4 != null) {
                constraintWidget2.f48402o = obj4.toString();
            }
        }
    }

    public aq0 barrier(Object obj, EnumC5564d enumC5564d) {
        gu2 gu2VarConstraints = constraints(obj);
        if (gu2VarConstraints.getFacade() == null || !(gu2VarConstraints.getFacade() instanceof aq0)) {
            aq0 aq0Var = new aq0(this);
            aq0Var.setBarrierDirection(enumC5564d);
            gu2VarConstraints.setFacade(aq0Var);
        }
        return (aq0) gu2VarConstraints.getFacade();
    }

    public C8449km centerHorizontally(Object... objArr) {
        C8449km c8449km = (C8449km) helper(null, EnumC5565e.ALIGN_HORIZONTALLY);
        c8449km.add(objArr);
        return c8449km;
    }

    public C8892lm centerVertically(Object... objArr) {
        C8892lm c8892lm = (C8892lm) helper(null, EnumC5565e.ALIGN_VERTICALLY);
        c8892lm.add(objArr);
        return c8892lm;
    }

    public gu2 constraints(Object obj) {
        lvd lvdVarCreateConstraintReference = this.f34896a.get(obj);
        if (lvdVarCreateConstraintReference == null) {
            lvdVarCreateConstraintReference = createConstraintReference(obj);
            this.f34896a.put(obj, lvdVarCreateConstraintReference);
            lvdVarCreateConstraintReference.setKey(obj);
        }
        if (lvdVarCreateConstraintReference instanceof gu2) {
            return (gu2) lvdVarCreateConstraintReference;
        }
        return null;
    }

    public int convertDimension(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public gu2 createConstraintReference(Object obj) {
        return new gu2(this);
    }

    public void directMapping() {
        for (Object obj : this.f34896a.keySet()) {
            gu2 gu2VarConstraints = constraints(obj);
            if (gu2VarConstraints != null) {
                gu2VarConstraints.setView(obj);
            }
        }
    }

    public ArrayList<String> getIdsForTag(String str) {
        if (this.f34898c.containsKey(str)) {
            return this.f34898c.get(str);
        }
        return null;
    }

    public fd7 guideline(Object obj, int i) {
        gu2 gu2VarConstraints = constraints(obj);
        if (gu2VarConstraints.getFacade() == null || !(gu2VarConstraints.getFacade() instanceof fd7)) {
            fd7 fd7Var = new fd7(this);
            fd7Var.setOrientation(i);
            fd7Var.setKey(obj);
            gu2VarConstraints.setFacade(fd7Var);
        }
        return (fd7) gu2VarConstraints.getFacade();
    }

    public f2g height(zc4 zc4Var) {
        return setHeight(zc4Var);
    }

    public oj7 helper(Object obj, EnumC5565e enumC5565e) {
        oj7 ll7Var;
        if (obj == null) {
            obj = createHelperKey();
        }
        oj7 oj7Var = this.f34897b.get(obj);
        if (oj7Var == null) {
            int i = C5561a.f34901a[enumC5565e.ordinal()];
            if (i == 1) {
                ll7Var = new ll7(this);
            } else if (i == 2) {
                ll7Var = new g5i(this);
            } else if (i == 3) {
                ll7Var = new C8449km(this);
            } else if (i == 4) {
                ll7Var = new C8892lm(this);
            } else if (i != 5) {
                oj7Var = new oj7(this, enumC5565e);
                oj7Var.setKey(obj);
                this.f34897b.put(obj, oj7Var);
            } else {
                ll7Var = new aq0(this);
            }
            oj7Var = ll7Var;
            oj7Var.setKey(obj);
            this.f34897b.put(obj, oj7Var);
        }
        return oj7Var;
    }

    public ll7 horizontalChain() {
        return (ll7) helper(null, EnumC5565e.HORIZONTAL_CHAIN);
    }

    public fd7 horizontalGuideline(Object obj) {
        return guideline(obj, 0);
    }

    public void map(Object obj, Object obj2) {
        gu2 gu2VarConstraints = constraints(obj);
        if (gu2VarConstraints != null) {
            gu2VarConstraints.setView(obj2);
        }
    }

    public void reset() {
        this.f34897b.clear();
        this.f34898c.clear();
    }

    public boolean sameFixedHeight(int i) {
        return this.f34899d.getHeight().equalsFixedValue(i);
    }

    public boolean sameFixedWidth(int i) {
        return this.f34899d.getWidth().equalsFixedValue(i);
    }

    public f2g setHeight(zc4 zc4Var) {
        this.f34899d.setHeight(zc4Var);
        return this;
    }

    public void setTag(String str, String str2) {
        ArrayList<String> arrayList;
        gu2 gu2VarConstraints = constraints(str);
        if (gu2VarConstraints != null) {
            gu2VarConstraints.setTag(str2);
            if (this.f34898c.containsKey(str2)) {
                arrayList = this.f34898c.get(str2);
            } else {
                arrayList = new ArrayList<>();
                this.f34898c.put(str2, arrayList);
            }
            arrayList.add(str);
        }
    }

    public f2g setWidth(zc4 zc4Var) {
        this.f34899d.setWidth(zc4Var);
        return this;
    }

    public g5i verticalChain() {
        return (g5i) helper(null, EnumC5565e.VERTICAL_CHAIN);
    }

    public fd7 verticalGuideline(Object obj) {
        return guideline(obj, 1);
    }

    public f2g width(zc4 zc4Var) {
        return setWidth(zc4Var);
    }

    public ll7 horizontalChain(Object... objArr) {
        ll7 ll7Var = (ll7) helper(null, EnumC5565e.HORIZONTAL_CHAIN);
        ll7Var.add(objArr);
        return ll7Var;
    }

    public g5i verticalChain(Object... objArr) {
        g5i g5iVar = (g5i) helper(null, EnumC5565e.VERTICAL_CHAIN);
        g5iVar.add(objArr);
        return g5iVar;
    }
}
