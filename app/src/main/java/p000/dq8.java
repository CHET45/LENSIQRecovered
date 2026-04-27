package p000;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.C0898a;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class dq8 {

    /* JADX INFO: renamed from: A */
    public static final String f30363A = "motionProgress";

    /* JADX INFO: renamed from: B */
    public static final String f30364B = "transitionEasing";

    /* JADX INFO: renamed from: C */
    public static final String f30365C = "visibility";

    /* JADX INFO: renamed from: f */
    public static int f30366f = -1;

    /* JADX INFO: renamed from: g */
    public static final String f30367g = "alpha";

    /* JADX INFO: renamed from: h */
    public static final String f30368h = "elevation";

    /* JADX INFO: renamed from: i */
    public static final String f30369i = "rotation";

    /* JADX INFO: renamed from: j */
    public static final String f30370j = "rotationX";

    /* JADX INFO: renamed from: k */
    public static final String f30371k = "rotationY";

    /* JADX INFO: renamed from: l */
    public static final String f30372l = "transformPivotX";

    /* JADX INFO: renamed from: m */
    public static final String f30373m = "transformPivotY";

    /* JADX INFO: renamed from: n */
    public static final String f30374n = "transitionPathRotate";

    /* JADX INFO: renamed from: o */
    public static final String f30375o = "scaleX";

    /* JADX INFO: renamed from: p */
    public static final String f30376p = "scaleY";

    /* JADX INFO: renamed from: q */
    public static final String f30377q = "wavePeriod";

    /* JADX INFO: renamed from: r */
    public static final String f30378r = "waveOffset";

    /* JADX INFO: renamed from: s */
    public static final String f30379s = "wavePhase";

    /* JADX INFO: renamed from: t */
    public static final String f30380t = "waveVariesBy";

    /* JADX INFO: renamed from: u */
    public static final String f30381u = "translationX";

    /* JADX INFO: renamed from: v */
    public static final String f30382v = "translationY";

    /* JADX INFO: renamed from: w */
    public static final String f30383w = "translationZ";

    /* JADX INFO: renamed from: x */
    public static final String f30384x = "progress";

    /* JADX INFO: renamed from: y */
    public static final String f30385y = "CUSTOM";

    /* JADX INFO: renamed from: z */
    public static final String f30386z = "curveFit";

    /* JADX INFO: renamed from: a */
    public int f30387a;

    /* JADX INFO: renamed from: b */
    public int f30388b;

    /* JADX INFO: renamed from: c */
    public String f30389c;

    /* JADX INFO: renamed from: d */
    public int f30390d;

    /* JADX INFO: renamed from: e */
    public HashMap<String, C0898a> f30391e;

    public dq8() {
        int i = f30366f;
        this.f30387a = i;
        this.f30388b = i;
        this.f30389c = null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m9296a(String constraintTag) {
        String str = this.f30389c;
        if (str == null || constraintTag == null) {
            return false;
        }
        return constraintTag.matches(str);
    }

    public abstract void addValues(HashMap<String, mbi> splines);

    /* JADX INFO: renamed from: b */
    public boolean m9297b(Object value) {
        return value instanceof Boolean ? ((Boolean) value).booleanValue() : Boolean.parseBoolean(value.toString());
    }

    /* JADX INFO: renamed from: c */
    public float m9298c(Object value) {
        return value instanceof Float ? ((Float) value).floatValue() : Float.parseFloat(value.toString());
    }

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract dq8 mo28677clone();

    public dq8 copy(dq8 src) {
        this.f30387a = src.f30387a;
        this.f30388b = src.f30388b;
        this.f30389c = src.f30389c;
        this.f30390d = src.f30390d;
        this.f30391e = src.f30391e;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public int m9299d(Object value) {
        return value instanceof Integer ? ((Integer) value).intValue() : Integer.parseInt(value.toString());
    }

    public abstract void getAttributeNames(HashSet<String> attributes);

    public int getFramePosition() {
        return this.f30387a;
    }

    public abstract void load(Context context, AttributeSet attrs);

    public void setFramePosition(int pos) {
        this.f30387a = pos;
    }

    public void setInterpolation(HashMap<String, Integer> interpolation) {
    }

    public abstract void setValue(String tag, Object value);

    public dq8 setViewId(int id) {
        this.f30388b = id;
        return this;
    }
}
