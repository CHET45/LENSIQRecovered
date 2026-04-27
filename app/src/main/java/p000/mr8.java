package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0897R;
import androidx.constraintlayout.widget.C0898a;
import com.blankj.utilcode.util.C2473f;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class mr8 extends dq8 {

    /* JADX INFO: renamed from: Y */
    public static final String f61786Y = "KeyTrigger";

    /* JADX INFO: renamed from: Z */
    public static final String f61787Z = "KeyTrigger";

    /* JADX INFO: renamed from: a0 */
    public static final String f61788a0 = "viewTransitionOnCross";

    /* JADX INFO: renamed from: b0 */
    public static final String f61789b0 = "viewTransitionOnPositiveCross";

    /* JADX INFO: renamed from: c0 */
    public static final String f61790c0 = "viewTransitionOnNegativeCross";

    /* JADX INFO: renamed from: d0 */
    public static final String f61791d0 = "postLayout";

    /* JADX INFO: renamed from: e0 */
    public static final String f61792e0 = "triggerSlack";

    /* JADX INFO: renamed from: f0 */
    public static final String f61793f0 = "triggerCollisionView";

    /* JADX INFO: renamed from: g0 */
    public static final String f61794g0 = "triggerCollisionId";

    /* JADX INFO: renamed from: h0 */
    public static final String f61795h0 = "triggerID";

    /* JADX INFO: renamed from: i0 */
    public static final String f61796i0 = "positiveCross";

    /* JADX INFO: renamed from: j0 */
    public static final String f61797j0 = "negativeCross";

    /* JADX INFO: renamed from: k0 */
    public static final String f61798k0 = "triggerReceiver";

    /* JADX INFO: renamed from: l0 */
    public static final String f61799l0 = "CROSS";

    /* JADX INFO: renamed from: m0 */
    public static final int f61800m0 = 5;

    /* JADX INFO: renamed from: D */
    public int f61801D = -1;

    /* JADX INFO: renamed from: E */
    public String f61802E = null;

    /* JADX INFO: renamed from: F */
    public int f61803F;

    /* JADX INFO: renamed from: G */
    public String f61804G;

    /* JADX INFO: renamed from: H */
    public String f61805H;

    /* JADX INFO: renamed from: I */
    public int f61806I;

    /* JADX INFO: renamed from: J */
    public int f61807J;

    /* JADX INFO: renamed from: K */
    public View f61808K;

    /* JADX INFO: renamed from: L */
    public float f61809L;

    /* JADX INFO: renamed from: M */
    public boolean f61810M;

    /* JADX INFO: renamed from: N */
    public boolean f61811N;

    /* JADX INFO: renamed from: O */
    public boolean f61812O;

    /* JADX INFO: renamed from: P */
    public float f61813P;

    /* JADX INFO: renamed from: Q */
    public float f61814Q;

    /* JADX INFO: renamed from: R */
    public boolean f61815R;

    /* JADX INFO: renamed from: S */
    public int f61816S;

    /* JADX INFO: renamed from: T */
    public int f61817T;

    /* JADX INFO: renamed from: U */
    public int f61818U;

    /* JADX INFO: renamed from: V */
    public RectF f61819V;

    /* JADX INFO: renamed from: W */
    public RectF f61820W;

    /* JADX INFO: renamed from: X */
    public HashMap<String, Method> f61821X;

    /* JADX INFO: renamed from: mr8$a */
    public static class C9487a {

        /* JADX INFO: renamed from: a */
        public static final int f61822a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f61823b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f61824c = 4;

        /* JADX INFO: renamed from: d */
        public static final int f61825d = 5;

        /* JADX INFO: renamed from: e */
        public static final int f61826e = 6;

        /* JADX INFO: renamed from: f */
        public static final int f61827f = 7;

        /* JADX INFO: renamed from: g */
        public static final int f61828g = 8;

        /* JADX INFO: renamed from: h */
        public static final int f61829h = 9;

        /* JADX INFO: renamed from: i */
        public static final int f61830i = 10;

        /* JADX INFO: renamed from: j */
        public static final int f61831j = 11;

        /* JADX INFO: renamed from: k */
        public static final int f61832k = 12;

        /* JADX INFO: renamed from: l */
        public static final int f61833l = 13;

        /* JADX INFO: renamed from: m */
        public static final int f61834m = 14;

        /* JADX INFO: renamed from: n */
        public static SparseIntArray f61835n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f61835n = sparseIntArray;
            sparseIntArray.append(C0897R.styleable.KeyTrigger_framePosition, 8);
            f61835n.append(C0897R.styleable.KeyTrigger_onCross, 4);
            f61835n.append(C0897R.styleable.KeyTrigger_onNegativeCross, 1);
            f61835n.append(C0897R.styleable.KeyTrigger_onPositiveCross, 2);
            f61835n.append(C0897R.styleable.KeyTrigger_motionTarget, 7);
            f61835n.append(C0897R.styleable.KeyTrigger_triggerId, 6);
            f61835n.append(C0897R.styleable.KeyTrigger_triggerSlack, 5);
            f61835n.append(C0897R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            f61835n.append(C0897R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            f61835n.append(C0897R.styleable.KeyTrigger_triggerReceiver, 11);
            f61835n.append(C0897R.styleable.KeyTrigger_viewTransitionOnCross, 12);
            f61835n.append(C0897R.styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            f61835n.append(C0897R.styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        private C9487a() {
        }

        public static void read(mr8 c, TypedArray a, Context context) {
            int indexCount = a.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = a.getIndex(i);
                switch (f61835n.get(index)) {
                    case 1:
                        c.f61804G = a.getString(index);
                        break;
                    case 2:
                        c.f61805H = a.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + d99.f28832c + f61835n.get(index));
                        break;
                    case 4:
                        c.f61802E = a.getString(index);
                        break;
                    case 5:
                        c.f61809L = a.getFloat(index, c.f61809L);
                        break;
                    case 6:
                        c.f61806I = a.getResourceId(index, c.f61806I);
                        break;
                    case 7:
                        if (MotionLayout.f6116c4) {
                            int resourceId = a.getResourceId(index, c.f30388b);
                            c.f30388b = resourceId;
                            if (resourceId == -1) {
                                c.f30389c = a.getString(index);
                            }
                        } else if (a.peekValue(index).type == 3) {
                            c.f30389c = a.getString(index);
                        } else {
                            c.f30388b = a.getResourceId(index, c.f30388b);
                        }
                        break;
                    case 8:
                        int integer = a.getInteger(index, c.f30387a);
                        c.f30387a = integer;
                        c.f61813P = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        c.f61807J = a.getResourceId(index, c.f61807J);
                        break;
                    case 10:
                        c.f61815R = a.getBoolean(index, c.f61815R);
                        break;
                    case 11:
                        c.f61803F = a.getResourceId(index, c.f61803F);
                        break;
                    case 12:
                        c.f61818U = a.getResourceId(index, c.f61818U);
                        break;
                    case 13:
                        c.f61816S = a.getResourceId(index, c.f61816S);
                        break;
                    case 14:
                        c.f61817T = a.getResourceId(index, c.f61817T);
                        break;
                }
            }
        }
    }

    public mr8() {
        int i = dq8.f30366f;
        this.f61803F = i;
        this.f61804G = null;
        this.f61805H = null;
        this.f61806I = i;
        this.f61807J = i;
        this.f61808K = null;
        this.f61809L = 0.1f;
        this.f61810M = true;
        this.f61811N = true;
        this.f61812O = true;
        this.f61813P = Float.NaN;
        this.f61815R = false;
        this.f61816S = i;
        this.f61817T = i;
        this.f61818U = i;
        this.f61819V = new RectF();
        this.f61820W = new RectF();
        this.f61821X = new HashMap<>();
        this.f30390d = 5;
        this.f30391e = new HashMap<>();
    }

    private void fire(String str, View call) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            fireCustom(str, call);
            return;
        }
        if (this.f61821X.containsKey(str)) {
            method = this.f61821X.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = call.getClass().getMethod(str, null);
                this.f61821X.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.f61821X.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + call.getClass().getSimpleName() + C2473f.f17566z + vj3.getName(call));
                return;
            }
        }
        try {
            method.invoke(call, null);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.f61802E + "\"on class " + call.getClass().getSimpleName() + C2473f.f17566z + vj3.getName(call));
        }
    }

    private void fireCustom(String str, View view) {
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f30391e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                C0898a c0898a = this.f30391e.get(str2);
                if (c0898a != null) {
                    c0898a.applyCustom(view);
                }
            }
        }
    }

    private void setUpRect(RectF rect, View child, boolean postLayout) {
        rect.top = child.getTop();
        rect.bottom = child.getBottom();
        rect.left = child.getLeft();
        rect.right = child.getRight();
        if (postLayout) {
            child.getMatrix().mapRect(rect);
        }
    }

    @Override // p000.dq8
    public void addValues(HashMap<String, mbi> splines) {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void conditionallyFire(float r10, android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mr8.conditionallyFire(float, android.view.View):void");
    }

    @Override // p000.dq8
    public dq8 copy(dq8 src) {
        super.copy(src);
        mr8 mr8Var = (mr8) src;
        this.f61801D = mr8Var.f61801D;
        this.f61802E = mr8Var.f61802E;
        this.f61803F = mr8Var.f61803F;
        this.f61804G = mr8Var.f61804G;
        this.f61805H = mr8Var.f61805H;
        this.f61806I = mr8Var.f61806I;
        this.f61807J = mr8Var.f61807J;
        this.f61808K = mr8Var.f61808K;
        this.f61809L = mr8Var.f61809L;
        this.f61810M = mr8Var.f61810M;
        this.f61811N = mr8Var.f61811N;
        this.f61812O = mr8Var.f61812O;
        this.f61813P = mr8Var.f61813P;
        this.f61814Q = mr8Var.f61814Q;
        this.f61815R = mr8Var.f61815R;
        this.f61819V = mr8Var.f61819V;
        this.f61820W = mr8Var.f61820W;
        this.f61821X = mr8Var.f61821X;
        return this;
    }

    @Override // p000.dq8
    public void getAttributeNames(HashSet<String> attributes) {
    }

    @Override // p000.dq8
    public void load(Context context, AttributeSet attrs) {
        C9487a.read(this, context.obtainStyledAttributes(attrs, C0897R.styleable.KeyTrigger), context);
    }

    /* JADX INFO: renamed from: q */
    public int m17536q() {
        return this.f61801D;
    }

    @Override // p000.dq8
    public void setValue(String tag, Object value) {
        tag.hashCode();
        switch (tag) {
            case "positiveCross":
                this.f61805H = value.toString();
                break;
            case "viewTransitionOnPositiveCross":
                this.f61817T = m9299d(value);
                break;
            case "triggerCollisionId":
                this.f61807J = m9299d(value);
                break;
            case "triggerID":
                this.f61806I = m9299d(value);
                break;
            case "negativeCross":
                this.f61804G = value.toString();
                break;
            case "triggerCollisionView":
                this.f61808K = (View) value;
                break;
            case "viewTransitionOnNegativeCross":
                this.f61816S = m9299d(value);
                break;
            case "CROSS":
                this.f61802E = value.toString();
                break;
            case "triggerSlack":
                this.f61809L = m9298c(value);
                break;
            case "viewTransitionOnCross":
                this.f61818U = m9299d(value);
                break;
            case "postLayout":
                this.f61815R = m9297b(value);
                break;
            case "triggerReceiver":
                this.f61803F = m9299d(value);
                break;
        }
    }

    @Override // p000.dq8
    /* JADX INFO: renamed from: clone */
    public dq8 mo28677clone() {
        return new mr8().copy(this);
    }
}
