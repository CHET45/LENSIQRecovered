package p000;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class oza implements ymh {

    /* JADX INFO: renamed from: m */
    public static int f69262m = -1;

    /* JADX INFO: renamed from: n */
    public static final String f69263n = "alpha";

    /* JADX INFO: renamed from: o */
    public static final String f69264o = "elevation";

    /* JADX INFO: renamed from: p */
    public static final String f69265p = "rotationZ";

    /* JADX INFO: renamed from: q */
    public static final String f69266q = "rotationX";

    /* JADX INFO: renamed from: r */
    public static final String f69267r = "transitionPathRotate";

    /* JADX INFO: renamed from: s */
    public static final String f69268s = "scaleX";

    /* JADX INFO: renamed from: t */
    public static final String f69269t = "scaleY";

    /* JADX INFO: renamed from: u */
    public static final String f69270u = "translationX";

    /* JADX INFO: renamed from: v */
    public static final String f69271v = "translationY";

    /* JADX INFO: renamed from: w */
    public static final String f69272w = "CUSTOM";

    /* JADX INFO: renamed from: x */
    public static final String f69273x = "visibility";

    /* JADX INFO: renamed from: h */
    public int f69274h;

    /* JADX INFO: renamed from: i */
    public int f69275i;

    /* JADX INFO: renamed from: j */
    public String f69276j;

    /* JADX INFO: renamed from: k */
    public int f69277k;

    /* JADX INFO: renamed from: l */
    public HashMap<String, ge3> f69278l;

    public oza() {
        int i = f69262m;
        this.f69274h = i;
        this.f69275i = i;
        this.f69276j = null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m19109a(String str) {
        String str2 = this.f69276j;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public abstract void addValues(HashMap<String, wyf> map);

    /* JADX INFO: renamed from: b */
    public boolean m19110b(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    /* JADX INFO: renamed from: c */
    public float m19111c(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    @Override // 
    public abstract oza clone();

    public oza copy(oza ozaVar) {
        this.f69274h = ozaVar.f69274h;
        this.f69275i = ozaVar.f69275i;
        this.f69276j = ozaVar.f69276j;
        this.f69277k = ozaVar.f69277k;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public int m19112d(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    public abstract void getAttributeNames(HashSet<String> hashSet);

    public int getFramePosition() {
        return this.f69274h;
    }

    public void setCustomAttribute(String str, int i, float f) {
        this.f69278l.put(str, new ge3(str, i, f));
    }

    public void setFramePosition(int i) {
        this.f69274h = i;
    }

    public void setInterpolation(HashMap<String, Integer> map) {
    }

    @Override // p000.ymh
    public boolean setValue(int i, int i2) {
        if (i != 100) {
            return false;
        }
        this.f69274h = i2;
        return true;
    }

    public oza setViewId(int i) {
        this.f69275i = i;
        return this;
    }

    public void setCustomAttribute(String str, int i, int i2) {
        this.f69278l.put(str, new ge3(str, i, i2));
    }

    @Override // p000.ymh
    public boolean setValue(int i, float f) {
        return false;
    }

    public void setCustomAttribute(String str, int i, boolean z) {
        this.f69278l.put(str, new ge3(str, i, z));
    }

    @Override // p000.ymh
    public boolean setValue(int i, String str) {
        if (i != 101) {
            return false;
        }
        this.f69276j = str;
        return true;
    }

    public void setCustomAttribute(String str, int i, String str2) {
        this.f69278l.put(str, new ge3(str, i, str2));
    }

    @Override // p000.ymh
    public boolean setValue(int i, boolean z) {
        return false;
    }
}
