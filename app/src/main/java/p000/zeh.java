package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
public class zeh implements ymh {

    /* JADX INFO: renamed from: A */
    public static final int f104952A = -1;

    /* JADX INFO: renamed from: B */
    public static final int f104953B = -2;

    /* JADX INFO: renamed from: q */
    public static final int f104954q = 0;

    /* JADX INFO: renamed from: r */
    public static final int f104955r = 1;

    /* JADX INFO: renamed from: s */
    public static final int f104956s = 2;

    /* JADX INFO: renamed from: t */
    public static final int f104957t = 0;

    /* JADX INFO: renamed from: u */
    public static final int f104958u = 1;

    /* JADX INFO: renamed from: v */
    public static final int f104959v = 2;

    /* JADX INFO: renamed from: w */
    public static final int f104960w = 3;

    /* JADX INFO: renamed from: x */
    public static final int f104961x = 4;

    /* JADX INFO: renamed from: y */
    public static final int f104962y = 5;

    /* JADX INFO: renamed from: z */
    public static final int f104963z = 6;

    /* JADX INFO: renamed from: h */
    public HashMap<Integer, HashMap<String, C16109a>> f104964h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    public HashMap<String, C16110b> f104965i = new HashMap<>();

    /* JADX INFO: renamed from: j */
    public wmh f104966j = new wmh();

    /* JADX INFO: renamed from: k */
    public int f104967k = 0;

    /* JADX INFO: renamed from: l */
    public String f104968l = null;

    /* JADX INFO: renamed from: m */
    public gv4 f104969m = null;

    /* JADX INFO: renamed from: n */
    public int f104970n = 0;

    /* JADX INFO: renamed from: o */
    public int f104971o = 400;

    /* JADX INFO: renamed from: p */
    public float f104972p = 0.0f;

    /* JADX INFO: renamed from: zeh$a */
    public static class C16109a {

        /* JADX INFO: renamed from: a */
        public int f104973a;

        /* JADX INFO: renamed from: b */
        public String f104974b;

        /* JADX INFO: renamed from: c */
        public int f104975c;

        /* JADX INFO: renamed from: d */
        public float f104976d;

        /* JADX INFO: renamed from: e */
        public float f104977e;

        public C16109a(String str, int i, int i2, float f, float f2) {
            this.f104974b = str;
            this.f104973a = i;
            this.f104975c = i2;
            this.f104976d = f;
            this.f104977e = f2;
        }
    }

    /* JADX INFO: renamed from: zeh$b */
    public static class C16110b {

        /* JADX INFO: renamed from: d */
        public zya f104981d;

        /* JADX INFO: renamed from: h */
        public gq8 f104985h = new gq8();

        /* JADX INFO: renamed from: i */
        public int f104986i = -1;

        /* JADX INFO: renamed from: j */
        public int f104987j = -1;

        /* JADX INFO: renamed from: a */
        public uki f104978a = new uki();

        /* JADX INFO: renamed from: b */
        public uki f104979b = new uki();

        /* JADX INFO: renamed from: c */
        public uki f104980c = new uki();

        /* JADX INFO: renamed from: e */
        public d0b f104982e = new d0b(this.f104978a);

        /* JADX INFO: renamed from: f */
        public d0b f104983f = new d0b(this.f104979b);

        /* JADX INFO: renamed from: g */
        public d0b f104984g = new d0b(this.f104980c);

        public C16110b() {
            zya zyaVar = new zya(this.f104982e);
            this.f104981d = zyaVar;
            zyaVar.setStart(this.f104982e);
            this.f104981d.setEnd(this.f104983f);
        }

        public uki getFrame(int i) {
            return i == 0 ? this.f104978a : i == 1 ? this.f104979b : this.f104980c;
        }

        public void interpolate(int i, int i2, float f, zeh zehVar) {
            this.f104986i = i2;
            this.f104987j = i;
            this.f104981d.setup(i, i2, 1.0f, System.nanoTime());
            uki.interpolate(i, i2, this.f104980c, this.f104978a, this.f104979b, zehVar, f);
            this.f104980c.f88264q = f;
            this.f104981d.interpolate(this.f104984g, f, System.nanoTime(), this.f104985h);
        }

        public void setKeyAttribute(wmh wmhVar) {
            pza pzaVar = new pza();
            wmhVar.applyDelta(pzaVar);
            this.f104981d.addKey(pzaVar);
        }

        public void setKeyCycle(wmh wmhVar) {
            qza qzaVar = new qza();
            wmhVar.applyDelta(qzaVar);
            this.f104981d.addKey(qzaVar);
        }

        public void setKeyPosition(wmh wmhVar) {
            rza rzaVar = new rza();
            wmhVar.applyDelta(rzaVar);
            this.f104981d.addKey(rzaVar);
        }

        public void update(iu2 iu2Var, int i) {
            if (i == 0) {
                this.f104978a.update(iu2Var);
                this.f104981d.setStart(this.f104982e);
            } else if (i == 1) {
                this.f104979b.update(iu2Var);
                this.f104981d.setEnd(this.f104983f);
            }
            this.f104987j = -1;
        }
    }

    public static lc8 getInterpolator(int i, final String str) {
        switch (i) {
            case -1:
                return new lc8() { // from class: qeh
                    @Override // p000.lc8
                    public final float getInterpolation(float f) {
                        return zeh.lambda$getInterpolator$0(str, f);
                    }
                };
            case 0:
                return new lc8() { // from class: reh
                    @Override // p000.lc8
                    public final float getInterpolation(float f) {
                        return zeh.lambda$getInterpolator$1(f);
                    }
                };
            case 1:
                return new lc8() { // from class: seh
                    @Override // p000.lc8
                    public final float getInterpolation(float f) {
                        return zeh.lambda$getInterpolator$2(f);
                    }
                };
            case 2:
                return new lc8() { // from class: teh
                    @Override // p000.lc8
                    public final float getInterpolation(float f) {
                        return zeh.lambda$getInterpolator$3(f);
                    }
                };
            case 3:
                return new lc8() { // from class: ueh
                    @Override // p000.lc8
                    public final float getInterpolation(float f) {
                        return zeh.lambda$getInterpolator$4(f);
                    }
                };
            case 4:
                return new lc8() { // from class: xeh
                    @Override // p000.lc8
                    public final float getInterpolation(float f) {
                        return zeh.lambda$getInterpolator$7(f);
                    }
                };
            case 5:
                return new lc8() { // from class: weh
                    @Override // p000.lc8
                    public final float getInterpolation(float f) {
                        return zeh.lambda$getInterpolator$6(f);
                    }
                };
            case 6:
                return new lc8() { // from class: veh
                    @Override // p000.lc8
                    public final float getInterpolation(float f) {
                        return zeh.lambda$getInterpolator$5(f);
                    }
                };
            default:
                return null;
        }
    }

    private C16110b getWidgetState(String str) {
        return this.f104965i.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$0(String str, float f) {
        return (float) gv4.getInterpolator(str).get(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$1(float f) {
        return (float) gv4.getInterpolator(gv4.f41445k).get(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$2(float f) {
        return (float) gv4.getInterpolator(gv4.f41444j).get(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$3(float f) {
        return (float) gv4.getInterpolator(gv4.f41443i).get(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$4(float f) {
        return (float) gv4.getInterpolator(gv4.f41446l).get(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$5(float f) {
        return (float) gv4.getInterpolator(gv4.f41447m).get(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$6(float f) {
        return (float) gv4.getInterpolator(gv4.f41448n).get(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$7(float f) {
        return (float) gv4.getInterpolator("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").get(f);
    }

    public void addCustomColor(int i, String str, String str2, int i2) {
        getWidgetState(str, null, i).getFrame(i).addCustomColor(str2, i2);
    }

    public void addCustomFloat(int i, String str, String str2, float f) {
        getWidgetState(str, null, i).getFrame(i).addCustomFloat(str2, f);
    }

    public void addKeyAttribute(String str, wmh wmhVar) {
        getWidgetState(str, null, 0).setKeyAttribute(wmhVar);
    }

    public void addKeyCycle(String str, wmh wmhVar) {
        getWidgetState(str, null, 0).setKeyCycle(wmhVar);
    }

    public void addKeyPosition(String str, wmh wmhVar) {
        getWidgetState(str, null, 0).setKeyPosition(wmhVar);
    }

    public void clear() {
        this.f104965i.clear();
    }

    public boolean contains(String str) {
        return this.f104965i.containsKey(str);
    }

    public void fillKeyPositions(uki ukiVar, float[] fArr, float[] fArr2, float[] fArr3) {
        C16109a c16109a;
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            HashMap<String, C16109a> map = this.f104964h.get(Integer.valueOf(i2));
            if (map != null && (c16109a = map.get(ukiVar.f88248a.f48402o)) != null) {
                fArr[i] = c16109a.f104976d;
                fArr2[i] = c16109a.f104977e;
                fArr3[i] = c16109a.f104973a;
                i++;
            }
        }
    }

    public C16109a findNextPosition(String str, int i) {
        C16109a c16109a;
        while (i <= 100) {
            HashMap<String, C16109a> map = this.f104964h.get(Integer.valueOf(i));
            if (map != null && (c16109a = map.get(str)) != null) {
                return c16109a;
            }
            i++;
        }
        return null;
    }

    public C16109a findPreviousPosition(String str, int i) {
        C16109a c16109a;
        while (i >= 0) {
            HashMap<String, C16109a> map = this.f104964h.get(Integer.valueOf(i));
            if (map != null && (c16109a = map.get(str)) != null) {
                return c16109a;
            }
            i--;
        }
        return null;
    }

    public int getAutoTransition() {
        return this.f104970n;
    }

    public uki getEnd(String str) {
        C16110b c16110b = this.f104965i.get(str);
        if (c16110b == null) {
            return null;
        }
        return c16110b.f104979b;
    }

    @Override // p000.ymh
    public int getId(String str) {
        return 0;
    }

    public uki getInterpolated(String str) {
        C16110b c16110b = this.f104965i.get(str);
        if (c16110b == null) {
            return null;
        }
        return c16110b.f104980c;
    }

    public int getKeyFrames(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.f104965i.get(str).f104981d.buildKeyFrames(fArr, iArr, iArr2);
    }

    public zya getMotion(String str) {
        return getWidgetState(str, null, 0).f104981d;
    }

    public int getNumberKeyPositions(uki ukiVar) {
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            HashMap<String, C16109a> map = this.f104964h.get(Integer.valueOf(i2));
            if (map != null && map.get(ukiVar.f88248a.f48402o) != null) {
                i++;
            }
        }
        return i;
    }

    public float[] getPath(String str) {
        float[] fArr = new float[124];
        this.f104965i.get(str).f104981d.buildPath(fArr, 62);
        return fArr;
    }

    public uki getStart(String str) {
        C16110b c16110b = this.f104965i.get(str);
        if (c16110b == null) {
            return null;
        }
        return c16110b.f104978a;
    }

    public boolean hasPositionKeyframes() {
        return this.f104964h.size() > 0;
    }

    public void interpolate(int i, int i2, float f) {
        gv4 gv4Var = this.f104969m;
        if (gv4Var != null) {
            f = (float) gv4Var.get(f);
        }
        Iterator<String> it = this.f104965i.keySet().iterator();
        while (it.hasNext()) {
            this.f104965i.get(it.next()).interpolate(i, i2, f, this);
        }
    }

    public boolean isEmpty() {
        return this.f104965i.isEmpty();
    }

    public void setTransitionProperties(wmh wmhVar) {
        wmhVar.applyDelta(this.f104966j);
        wmhVar.applyDelta(this);
    }

    @Override // p000.ymh
    public boolean setValue(int i, int i2) {
        return false;
    }

    public void updateFrom(ju2 ju2Var, int i) {
        ArrayList<iu2> children = ju2Var.getChildren();
        int size = children.size();
        for (int i2 = 0; i2 < size; i2++) {
            iu2 iu2Var = children.get(i2);
            getWidgetState(iu2Var.f48402o, null, i).update(iu2Var, i);
        }
    }

    private C16110b getWidgetState(String str, iu2 iu2Var, int i) {
        C16110b c16110b = this.f104965i.get(str);
        if (c16110b == null) {
            c16110b = new C16110b();
            this.f104966j.applyDelta(c16110b.f104981d);
            this.f104965i.put(str, c16110b);
            if (iu2Var != null) {
                c16110b.update(iu2Var, i);
            }
        }
        return c16110b;
    }

    public void addKeyPosition(String str, int i, int i2, float f, float f2) {
        wmh wmhVar = new wmh();
        wmhVar.add(510, 2);
        wmhVar.add(100, i);
        wmhVar.add(ymh.InterfaceC15728g.f102255n, f);
        wmhVar.add(507, f2);
        getWidgetState(str, null, 0).setKeyPosition(wmhVar);
        C16109a c16109a = new C16109a(str, i, i2, f, f2);
        HashMap<String, C16109a> map = this.f104964h.get(Integer.valueOf(i));
        if (map == null) {
            map = new HashMap<>();
            this.f104964h.put(Integer.valueOf(i), map);
        }
        map.put(str, c16109a);
    }

    @Override // p000.ymh
    public boolean setValue(int i, float f) {
        if (i != 706) {
            return false;
        }
        this.f104972p = f;
        return false;
    }

    public uki getEnd(iu2 iu2Var) {
        return getWidgetState(iu2Var.f48402o, null, 1).f104979b;
    }

    public uki getInterpolated(iu2 iu2Var) {
        return getWidgetState(iu2Var.f48402o, null, 2).f104980c;
    }

    public uki getStart(iu2 iu2Var) {
        return getWidgetState(iu2Var.f48402o, null, 0).f104978a;
    }

    @Override // p000.ymh
    public boolean setValue(int i, String str) {
        if (i != 705) {
            return false;
        }
        this.f104968l = str;
        this.f104969m = gv4.getInterpolator(str);
        return false;
    }

    @Override // p000.ymh
    public boolean setValue(int i, boolean z) {
        return false;
    }

    public lc8 getInterpolator() {
        return getInterpolator(this.f104967k, this.f104968l);
    }
}
