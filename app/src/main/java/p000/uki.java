package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.HashMap;
import java.util.Set;
import p000.cu2;
import p000.ymh;
import p000.zeh;

/* JADX INFO: loaded from: classes.dex */
public class uki {

    /* JADX INFO: renamed from: u */
    public static final boolean f88246u = true;

    /* JADX INFO: renamed from: v */
    public static float f88247v = Float.NaN;

    /* JADX INFO: renamed from: a */
    public iu2 f88248a;

    /* JADX INFO: renamed from: b */
    public int f88249b;

    /* JADX INFO: renamed from: c */
    public int f88250c;

    /* JADX INFO: renamed from: d */
    public int f88251d;

    /* JADX INFO: renamed from: e */
    public int f88252e;

    /* JADX INFO: renamed from: f */
    public float f88253f;

    /* JADX INFO: renamed from: g */
    public float f88254g;

    /* JADX INFO: renamed from: h */
    public float f88255h;

    /* JADX INFO: renamed from: i */
    public float f88256i;

    /* JADX INFO: renamed from: j */
    public float f88257j;

    /* JADX INFO: renamed from: k */
    public float f88258k;

    /* JADX INFO: renamed from: l */
    public float f88259l;

    /* JADX INFO: renamed from: m */
    public float f88260m;

    /* JADX INFO: renamed from: n */
    public float f88261n;

    /* JADX INFO: renamed from: o */
    public float f88262o;

    /* JADX INFO: renamed from: p */
    public float f88263p;

    /* JADX INFO: renamed from: q */
    public float f88264q;

    /* JADX INFO: renamed from: r */
    public int f88265r;

    /* JADX INFO: renamed from: s */
    public final HashMap<String, ge3> f88266s;

    /* JADX INFO: renamed from: t */
    public String f88267t;

    public uki() {
        this.f88248a = null;
        this.f88249b = 0;
        this.f88250c = 0;
        this.f88251d = 0;
        this.f88252e = 0;
        this.f88253f = Float.NaN;
        this.f88254g = Float.NaN;
        this.f88255h = Float.NaN;
        this.f88256i = Float.NaN;
        this.f88257j = Float.NaN;
        this.f88258k = Float.NaN;
        this.f88259l = Float.NaN;
        this.f88260m = Float.NaN;
        this.f88261n = Float.NaN;
        this.f88262o = Float.NaN;
        this.f88263p = Float.NaN;
        this.f88264q = Float.NaN;
        this.f88265r = 0;
        this.f88266s = new HashMap<>();
        this.f88267t = null;
    }

    private static void add(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void interpolate(int i, int i2, uki ukiVar, uki ukiVar2, uki ukiVar3, zeh zehVar, float f) {
        int i3;
        float f2;
        int i4;
        int i5;
        float f3;
        float f4;
        int i6;
        float f5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f6 = 100.0f * f;
        int i13 = (int) f6;
        int i14 = ukiVar2.f88249b;
        int i15 = ukiVar2.f88250c;
        int i16 = ukiVar3.f88249b;
        int i17 = ukiVar3.f88250c;
        int i18 = ukiVar2.f88251d - i14;
        int i19 = ukiVar2.f88252e - i15;
        int i20 = ukiVar3.f88251d - i16;
        int i21 = ukiVar3.f88252e - i17;
        float f7 = ukiVar2.f88263p;
        float f8 = ukiVar3.f88263p;
        if (ukiVar2.f88265r == 8) {
            i15 = (int) (i15 - (i21 / 2.0f));
            i5 = (int) (i14 - (i20 / 2.0f));
            if (Float.isNaN(f7)) {
                i4 = i21;
                i3 = i20;
                f2 = 0.0f;
            } else {
                f2 = f7;
                i3 = i20;
                i4 = i21;
            }
        } else {
            i3 = i18;
            f2 = f7;
            i4 = i19;
            i5 = i14;
        }
        if (ukiVar3.f88265r == 8) {
            i16 = (int) (i16 - (i3 / 2.0f));
            i17 = (int) (i17 - (i4 / 2.0f));
            i20 = i3;
            i21 = i4;
            if (Float.isNaN(f8)) {
                f8 = 0.0f;
            }
        }
        if (Float.isNaN(f2) && !Float.isNaN(f8)) {
            f2 = 1.0f;
        }
        if (!Float.isNaN(f2) && Float.isNaN(f8)) {
            f8 = 1.0f;
        }
        if (ukiVar2.f88265r == 4) {
            f4 = f8;
            f3 = 0.0f;
        } else {
            f3 = f2;
            f4 = f8;
        }
        float f9 = ukiVar3.f88265r == 4 ? 0.0f : f4;
        if (ukiVar.f88248a == null || !zehVar.hasPositionKeyframes()) {
            i6 = i15;
            f5 = f;
            i7 = i5;
            i8 = i16;
        } else {
            zeh.C16109a c16109aFindPreviousPosition = zehVar.findPreviousPosition(ukiVar.f88248a.f48402o, i13);
            i6 = i15;
            zeh.C16109a c16109aFindNextPosition = zehVar.findNextPosition(ukiVar.f88248a.f48402o, i13);
            if (c16109aFindPreviousPosition == c16109aFindNextPosition) {
                c16109aFindNextPosition = null;
            }
            if (c16109aFindPreviousPosition != null) {
                i5 = (int) (c16109aFindPreviousPosition.f104976d * i);
                i10 = i16;
                i9 = i2;
                i6 = (int) (c16109aFindPreviousPosition.f104977e * i9);
                i11 = c16109aFindPreviousPosition.f104973a;
            } else {
                i9 = i2;
                i10 = i16;
                i11 = 0;
            }
            i7 = i5;
            if (c16109aFindNextPosition != null) {
                i8 = (int) (c16109aFindNextPosition.f104976d * i);
                i17 = (int) (c16109aFindNextPosition.f104977e * i9);
                i12 = c16109aFindNextPosition.f104973a;
            } else {
                i12 = 100;
                i8 = i10;
            }
            f5 = (f6 - i11) / (i12 - i11);
        }
        int i22 = i6;
        ukiVar.f88248a = ukiVar2.f88248a;
        int i23 = (int) (i7 + ((i8 - i7) * f5));
        ukiVar.f88249b = i23;
        int i24 = (int) (i22 + (f5 * (i17 - i22)));
        ukiVar.f88250c = i24;
        float f10 = 1.0f - f;
        ukiVar.f88251d = i23 + ((int) ((i3 * f10) + (i20 * f)));
        ukiVar.f88252e = i24 + ((int) ((f10 * i4) + (i21 * f)));
        ukiVar.f88253f = interpolate(ukiVar2.f88253f, ukiVar3.f88253f, 0.5f, f);
        ukiVar.f88254g = interpolate(ukiVar2.f88254g, ukiVar3.f88254g, 0.5f, f);
        ukiVar.f88255h = interpolate(ukiVar2.f88255h, ukiVar3.f88255h, 0.0f, f);
        ukiVar.f88256i = interpolate(ukiVar2.f88256i, ukiVar3.f88256i, 0.0f, f);
        ukiVar.f88257j = interpolate(ukiVar2.f88257j, ukiVar3.f88257j, 0.0f, f);
        ukiVar.f88261n = interpolate(ukiVar2.f88261n, ukiVar3.f88261n, 1.0f, f);
        ukiVar.f88262o = interpolate(ukiVar2.f88262o, ukiVar3.f88262o, 1.0f, f);
        ukiVar.f88258k = interpolate(ukiVar2.f88258k, ukiVar3.f88258k, 0.0f, f);
        ukiVar.f88259l = interpolate(ukiVar2.f88259l, ukiVar3.f88259l, 0.0f, f);
        ukiVar.f88260m = interpolate(ukiVar2.f88260m, ukiVar3.f88260m, 0.0f, f);
        ukiVar.f88263p = interpolate(f3, f9, 1.0f, f);
        Set<String> setKeySet = ukiVar3.f88266s.keySet();
        ukiVar.f88266s.clear();
        for (String str : setKeySet) {
            if (ukiVar2.f88266s.containsKey(str)) {
                ge3 ge3Var = ukiVar2.f88266s.get(str);
                ge3 ge3Var2 = ukiVar3.f88266s.get(str);
                ge3 ge3Var3 = new ge3(ge3Var);
                ukiVar.f88266s.put(str, ge3Var3);
                if (ge3Var.numberOfInterpolatedValues() == 1) {
                    ge3Var3.setValue(Float.valueOf(interpolate(ge3Var.getValueToInterpolate(), ge3Var2.getValueToInterpolate(), 0.0f, f)));
                } else {
                    int iNumberOfInterpolatedValues = ge3Var.numberOfInterpolatedValues();
                    float[] fArr = new float[iNumberOfInterpolatedValues];
                    float[] fArr2 = new float[iNumberOfInterpolatedValues];
                    ge3Var.getValuesToInterpolate(fArr);
                    ge3Var2.getValuesToInterpolate(fArr2);
                    for (int i25 = 0; i25 < iNumberOfInterpolatedValues; i25++) {
                        fArr[i25] = interpolate(fArr[i25], fArr2[i25], 0.0f, f);
                        ge3Var3.setValue(fArr);
                    }
                }
            }
        }
    }

    private void serializeAnchor(StringBuilder sb, cu2.EnumC4503b enumC4503b) {
        cu2 anchor = this.f88248a.getAnchor(enumC4503b);
        if (anchor == null || anchor.f27600f == null) {
            return;
        }
        sb.append("Anchor");
        sb.append(enumC4503b.name());
        sb.append(": ['");
        String str = anchor.f27600f.getOwner().f48402o;
        if (str == null) {
            str = "#PARENT";
        }
        sb.append(str);
        sb.append("', '");
        sb.append(anchor.f27600f.getType().name());
        sb.append("', '");
        sb.append(anchor.f27601g);
        sb.append("'],\n");
    }

    /* JADX INFO: renamed from: a */
    public void m23407a(String str) {
        String str2;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str3 = (".(" + stackTraceElement.getFileName() + g1i.f38277c + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + C2473f.f17566z + (hashCode() % 1000);
        if (this.f88248a != null) {
            str2 = str3 + pj4.f71071b + (this.f88248a.hashCode() % 1000);
        } else {
            str2 = str3 + "/NULL";
        }
        System.out.println(str2 + C2473f.f17566z + str);
    }

    public void addCustomColor(String str, int i) {
        setCustomAttribute(str, 902, i);
    }

    public void addCustomFloat(String str, float f) {
        setCustomAttribute(str, 901, f);
    }

    /* JADX INFO: renamed from: b */
    public void m23408b(sk1 sk1Var) throws xk1 {
        vk1 vk1Var = (vk1) sk1Var;
        int size = vk1Var.size();
        for (int i = 0; i < size; i++) {
            tk1 tk1Var = (tk1) vk1Var.get(i);
            tk1Var.content();
            sk1 value = tk1Var.getValue();
            String strContent = value.content();
            if (strContent.matches("#[0-9a-fA-F]+")) {
                setCustomAttribute(tk1Var.content(), 902, Integer.parseInt(strContent.substring(1), 16));
            } else if (value instanceof uk1) {
                setCustomAttribute(tk1Var.content(), 901, value.getFloat());
            } else {
                setCustomAttribute(tk1Var.content(), ymh.InterfaceC15723b.f102135m, strContent);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m23409c() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = (".(" + stackTraceElement.getFileName() + g1i.f38277c + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + C2473f.f17566z + (hashCode() % 1000);
        String str2 = this.f88248a != null ? str + pj4.f71071b + (this.f88248a.hashCode() % 1000) + C2473f.f17566z : str + "/NULL ";
        HashMap<String, ge3> map = this.f88266s;
        if (map != null) {
            for (String str3 : map.keySet()) {
                System.out.println(str2 + this.f88266s.get(str3).toString());
            }
        }
    }

    public float centerX() {
        return this.f88249b + ((this.f88251d - r0) / 2.0f);
    }

    public float centerY() {
        return this.f88250c + ((this.f88252e - r0) / 2.0f);
    }

    public ge3 getCustomAttribute(String str) {
        return this.f88266s.get(str);
    }

    public Set<String> getCustomAttributeNames() {
        return this.f88266s.keySet();
    }

    public int getCustomColor(String str) {
        if (this.f88266s.containsKey(str)) {
            return this.f88266s.get(str).getColorValue();
        }
        return -21880;
    }

    public float getCustomFloat(String str) {
        if (this.f88266s.containsKey(str)) {
            return this.f88266s.get(str).getFloatValue();
        }
        return Float.NaN;
    }

    public String getId() {
        iu2 iu2Var = this.f88248a;
        return iu2Var == null ? "unknown" : iu2Var.f48402o;
    }

    public int height() {
        return Math.max(0, this.f88252e - this.f88250c);
    }

    public boolean isDefaultTransform() {
        return Float.isNaN(this.f88255h) && Float.isNaN(this.f88256i) && Float.isNaN(this.f88257j) && Float.isNaN(this.f88258k) && Float.isNaN(this.f88259l) && Float.isNaN(this.f88260m) && Float.isNaN(this.f88261n) && Float.isNaN(this.f88262o) && Float.isNaN(this.f88263p);
    }

    public StringBuilder serialize(StringBuilder sb) {
        return serialize(sb, false);
    }

    public void setCustomAttribute(String str, int i, float f) {
        if (this.f88266s.containsKey(str)) {
            this.f88266s.get(str).setFloatValue(f);
        } else {
            this.f88266s.put(str, new ge3(str, i, f));
        }
    }

    public void setCustomValue(fb3 fb3Var, float[] fArr) {
    }

    public boolean setValue(String str, sk1 sk1Var) throws xk1 {
        str.hashCode();
        switch (str) {
            case "phone_orientation":
                f88247v = sk1Var.getFloat();
                return true;
            case "bottom":
                this.f88252e = sk1Var.getInt();
                return true;
            case "custom":
                m23408b(sk1Var);
                return true;
            case "rotationX":
                this.f88255h = sk1Var.getFloat();
                return true;
            case "rotationY":
                this.f88256i = sk1Var.getFloat();
                return true;
            case "rotationZ":
                this.f88257j = sk1Var.getFloat();
                return true;
            case "translationX":
                this.f88258k = sk1Var.getFloat();
                return true;
            case "translationY":
                this.f88259l = sk1Var.getFloat();
                return true;
            case "translationZ":
                this.f88260m = sk1Var.getFloat();
                return true;
            case "pivotX":
                this.f88253f = sk1Var.getFloat();
                return true;
            case "pivotY":
                this.f88254g = sk1Var.getFloat();
                return true;
            case "scaleX":
                this.f88261n = sk1Var.getFloat();
                return true;
            case "scaleY":
                this.f88262o = sk1Var.getFloat();
                return true;
            case "top":
                this.f88250c = sk1Var.getInt();
                return true;
            case "left":
                this.f88249b = sk1Var.getInt();
                return true;
            case "alpha":
                this.f88263p = sk1Var.getFloat();
                return true;
            case "right":
                this.f88251d = sk1Var.getInt();
                return true;
            case "interpolatedPos":
                this.f88264q = sk1Var.getFloat();
                return true;
            default:
                return false;
        }
    }

    public uki update() {
        iu2 iu2Var = this.f88248a;
        if (iu2Var != null) {
            this.f88249b = iu2Var.getLeft();
            this.f88250c = this.f88248a.getTop();
            this.f88251d = this.f88248a.getRight();
            this.f88252e = this.f88248a.getBottom();
            updateAttributes(this.f88248a.f48400n);
        }
        return this;
    }

    public void updateAttributes(uki ukiVar) {
        this.f88253f = ukiVar.f88253f;
        this.f88254g = ukiVar.f88254g;
        this.f88255h = ukiVar.f88255h;
        this.f88256i = ukiVar.f88256i;
        this.f88257j = ukiVar.f88257j;
        this.f88258k = ukiVar.f88258k;
        this.f88259l = ukiVar.f88259l;
        this.f88260m = ukiVar.f88260m;
        this.f88261n = ukiVar.f88261n;
        this.f88262o = ukiVar.f88262o;
        this.f88263p = ukiVar.f88263p;
        this.f88265r = ukiVar.f88265r;
        this.f88266s.clear();
        for (ge3 ge3Var : ukiVar.f88266s.values()) {
            this.f88266s.put(ge3Var.getName(), ge3Var.copy());
        }
    }

    public int width() {
        return Math.max(0, this.f88251d - this.f88249b);
    }

    public StringBuilder serialize(StringBuilder sb, boolean z) {
        sb.append("{\n");
        add(sb, "left", this.f88249b);
        add(sb, "top", this.f88250c);
        add(sb, "right", this.f88251d);
        add(sb, "bottom", this.f88252e);
        add(sb, "pivotX", this.f88253f);
        add(sb, "pivotY", this.f88254g);
        add(sb, "rotationX", this.f88255h);
        add(sb, "rotationY", this.f88256i);
        add(sb, "rotationZ", this.f88257j);
        add(sb, "translationX", this.f88258k);
        add(sb, "translationY", this.f88259l);
        add(sb, "translationZ", this.f88260m);
        add(sb, "scaleX", this.f88261n);
        add(sb, "scaleY", this.f88262o);
        add(sb, "alpha", this.f88263p);
        add(sb, "visibility", this.f88265r);
        add(sb, "interpolatedPos", this.f88264q);
        if (this.f88248a != null) {
            for (cu2.EnumC4503b enumC4503b : cu2.EnumC4503b.values()) {
                serializeAnchor(sb, enumC4503b);
            }
        }
        if (z) {
            add(sb, "phone_orientation", f88247v);
        }
        if (z) {
            add(sb, "phone_orientation", f88247v);
        }
        if (this.f88266s.size() != 0) {
            sb.append("custom : {\n");
            for (String str : this.f88266s.keySet()) {
                ge3 ge3Var = this.f88266s.get(str);
                sb.append(str);
                sb.append(": ");
                switch (ge3Var.getType()) {
                    case 900:
                        sb.append(ge3Var.getIntegerValue());
                        sb.append(",\n");
                        break;
                    case 901:
                    case ymh.InterfaceC15723b.f102137o /* 905 */:
                        sb.append(ge3Var.getFloatValue());
                        sb.append(",\n");
                        break;
                    case 902:
                        sb.append("'");
                        sb.append(ge3.colorString(ge3Var.getIntegerValue()));
                        sb.append("',\n");
                        break;
                    case ymh.InterfaceC15723b.f102135m /* 903 */:
                        sb.append("'");
                        sb.append(ge3Var.getStringValue());
                        sb.append("',\n");
                        break;
                    case ymh.InterfaceC15723b.f102136n /* 904 */:
                        sb.append("'");
                        sb.append(ge3Var.getBooleanValue());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    public void setCustomAttribute(String str, int i, int i2) {
        if (this.f88266s.containsKey(str)) {
            this.f88266s.get(str).setIntValue(i2);
        } else {
            this.f88266s.put(str, new ge3(str, i, i2));
        }
    }

    private static void add(StringBuilder sb, String str, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f);
        sb.append(",\n");
    }

    public void setCustomAttribute(String str, int i, boolean z) {
        if (this.f88266s.containsKey(str)) {
            this.f88266s.get(str).setBooleanValue(z);
        } else {
            this.f88266s.put(str, new ge3(str, i, z));
        }
    }

    public uki update(iu2 iu2Var) {
        if (iu2Var == null) {
            return this;
        }
        this.f88248a = iu2Var;
        update();
        return this;
    }

    public void setCustomAttribute(String str, int i, String str2) {
        if (this.f88266s.containsKey(str)) {
            this.f88266s.get(str).setStringValue(str2);
        } else {
            this.f88266s.put(str, new ge3(str, i, str2));
        }
    }

    public uki(iu2 iu2Var) {
        this.f88248a = null;
        this.f88249b = 0;
        this.f88250c = 0;
        this.f88251d = 0;
        this.f88252e = 0;
        this.f88253f = Float.NaN;
        this.f88254g = Float.NaN;
        this.f88255h = Float.NaN;
        this.f88256i = Float.NaN;
        this.f88257j = Float.NaN;
        this.f88258k = Float.NaN;
        this.f88259l = Float.NaN;
        this.f88260m = Float.NaN;
        this.f88261n = Float.NaN;
        this.f88262o = Float.NaN;
        this.f88263p = Float.NaN;
        this.f88264q = Float.NaN;
        this.f88265r = 0;
        this.f88266s = new HashMap<>();
        this.f88267t = null;
        this.f88248a = iu2Var;
    }

    public uki(uki ukiVar) {
        this.f88248a = null;
        this.f88249b = 0;
        this.f88250c = 0;
        this.f88251d = 0;
        this.f88252e = 0;
        this.f88253f = Float.NaN;
        this.f88254g = Float.NaN;
        this.f88255h = Float.NaN;
        this.f88256i = Float.NaN;
        this.f88257j = Float.NaN;
        this.f88258k = Float.NaN;
        this.f88259l = Float.NaN;
        this.f88260m = Float.NaN;
        this.f88261n = Float.NaN;
        this.f88262o = Float.NaN;
        this.f88263p = Float.NaN;
        this.f88264q = Float.NaN;
        this.f88265r = 0;
        this.f88266s = new HashMap<>();
        this.f88267t = null;
        this.f88248a = ukiVar.f88248a;
        this.f88249b = ukiVar.f88249b;
        this.f88250c = ukiVar.f88250c;
        this.f88251d = ukiVar.f88251d;
        this.f88252e = ukiVar.f88252e;
        updateAttributes(ukiVar);
    }

    private static float interpolate(float f, float f2, float f3, float f4) {
        boolean zIsNaN = Float.isNaN(f);
        boolean zIsNaN2 = Float.isNaN(f2);
        if (zIsNaN && zIsNaN2) {
            return Float.NaN;
        }
        if (zIsNaN) {
            f = f3;
        }
        if (zIsNaN2) {
            f2 = f3;
        }
        return f + (f4 * (f2 - f));
    }
}
