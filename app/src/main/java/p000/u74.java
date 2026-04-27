package p000;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.C0878b;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0901d;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class u74 implements tid {

    /* JADX INFO: renamed from: g */
    public static final boolean f86929g = false;

    /* JADX INFO: renamed from: h */
    public static final String f86930h = "DesignTool";

    /* JADX INFO: renamed from: i */
    public static final HashMap<Pair<Integer, Integer>, String> f86931i;

    /* JADX INFO: renamed from: j */
    public static final HashMap<String, String> f86932j;

    /* JADX INFO: renamed from: a */
    public final MotionLayout f86933a;

    /* JADX INFO: renamed from: b */
    public C0878b f86934b;

    /* JADX INFO: renamed from: c */
    public String f86935c = null;

    /* JADX INFO: renamed from: d */
    public String f86936d = null;

    /* JADX INFO: renamed from: e */
    public int f86937e = -1;

    /* JADX INFO: renamed from: f */
    public int f86938f = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> map = new HashMap<>();
        f86931i = map;
        HashMap<String, String> map2 = new HashMap<>();
        f86932j = map2;
        map.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        map.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        map.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        map.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        map.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        map.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        map.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        map.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        map.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        map.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        map.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        map.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        map.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        map2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        map2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        map2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        map2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        map2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        map2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        map2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        map2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        map2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        map2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        map2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        map2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public u74(MotionLayout motionLayout) {
        this.f86933a = motionLayout;
    }

    private static void Connect(int dpi, C0901d set, View view, HashMap<String, String> attributes, int from, int to) {
        String str = f86931i.get(Pair.create(Integer.valueOf(from), Integer.valueOf(to)));
        String str2 = attributes.get(str);
        if (str2 != null) {
            String str3 = f86932j.get(str);
            set.connect(view.getId(), from, Integer.parseInt(str2), to, str3 != null ? GetPxFromDp(dpi, attributes.get(str3)) : 0);
        }
    }

    private static int GetPxFromDp(int dpi, String value) {
        int iIndexOf;
        if (value == null || (iIndexOf = value.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(value.substring(0, iIndexOf)).intValue() * dpi) / 160.0f);
    }

    private static void SetAbsolutePositions(int dpi, C0901d set, View view, HashMap<String, String> attributes) {
        String str = attributes.get("layout_editor_absoluteX");
        if (str != null) {
            set.setEditorAbsoluteX(view.getId(), GetPxFromDp(dpi, str));
        }
        String str2 = attributes.get("layout_editor_absoluteY");
        if (str2 != null) {
            set.setEditorAbsoluteY(view.getId(), GetPxFromDp(dpi, str2));
        }
    }

    private static void SetBias(C0901d set, View view, HashMap<String, String> attributes, int type) {
        String str = attributes.get(type == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (type == 0) {
                set.setHorizontalBias(view.getId(), Float.parseFloat(str));
            } else if (type == 1) {
                set.setVerticalBias(view.getId(), Float.parseFloat(str));
            }
        }
    }

    private static void SetDimensions(int dpi, C0901d set, View view, HashMap<String, String> attributes, int type) {
        String str = attributes.get(type == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int iGetPxFromDp = !str.equalsIgnoreCase("wrap_content") ? GetPxFromDp(dpi, str) : -2;
            if (type == 0) {
                set.constrainWidth(view.getId(), iGetPxFromDp);
            } else {
                set.constrainHeight(view.getId(), iGetPxFromDp);
            }
        }
    }

    @Override // p000.tid
    public int designAccess(int cmd, String type, Object viewObject, float[] in, int inLength, float[] out, int outLength) {
        eza ezaVar;
        View view = (View) viewObject;
        if (cmd != 0) {
            MotionLayout motionLayout = this.f86933a;
            if (motionLayout.f6187r2 == null || view == null || (ezaVar = motionLayout.f6128B2.get(view)) == null) {
                return -1;
            }
        } else {
            ezaVar = null;
        }
        if (cmd == 0) {
            return 1;
        }
        if (cmd == 1) {
            int duration = this.f86933a.f6187r2.getDuration() / 16;
            ezaVar.m10383e(out, duration);
            return duration;
        }
        if (cmd == 2) {
            int duration2 = this.f86933a.f6187r2.getDuration() / 16;
            ezaVar.m10382d(out, null);
            return duration2;
        }
        if (cmd != 3) {
            return -1;
        }
        this.f86933a.f6187r2.getDuration();
        return ezaVar.m10387i(type, out, outLength);
    }

    public void disableAutoTransition(boolean disable) {
        this.f86933a.m1271I(disable);
    }

    public void dumpConstraintSet(String set) {
        MotionLayout motionLayout = this.f86933a;
        if (motionLayout.f6187r2 == null) {
            motionLayout.f6187r2 = this.f86934b;
        }
        int iM1278P = motionLayout.m1278P(set);
        System.out.println(" dumping  " + set + " (" + iM1278P + c0b.f15434d);
        try {
            this.f86933a.f6187r2.m1301h(iM1278P).dump(this.f86933a.f6187r2, new int[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getAnimationKeyFrames(Object view, float[] key) {
        C0878b c0878b = this.f86933a.f6187r2;
        if (c0878b == null) {
            return -1;
        }
        int duration = c0878b.getDuration() / 16;
        eza ezaVar = this.f86933a.f6128B2.get(view);
        if (ezaVar == null) {
            return 0;
        }
        ezaVar.m10382d(key, null);
        return duration;
    }

    public int getAnimationPath(Object view, float[] path, int len) {
        MotionLayout motionLayout = this.f86933a;
        if (motionLayout.f6187r2 == null) {
            return -1;
        }
        eza ezaVar = motionLayout.f6128B2.get(view);
        if (ezaVar == null) {
            return 0;
        }
        ezaVar.m10383e(path, len);
        return len;
    }

    public void getAnimationRectangles(Object view, float[] path) {
        C0878b c0878b = this.f86933a.f6187r2;
        if (c0878b == null) {
            return;
        }
        int duration = c0878b.getDuration() / 16;
        eza ezaVar = this.f86933a.f6128B2.get(view);
        if (ezaVar == null) {
            return;
        }
        ezaVar.m10385g(path, duration);
    }

    public String getEndState() {
        int endState = this.f86933a.getEndState();
        if (this.f86938f == endState) {
            return this.f86936d;
        }
        String strM1276N = this.f86933a.m1276N(endState);
        if (strM1276N != null) {
            this.f86936d = strM1276N;
            this.f86938f = endState;
        }
        return strM1276N;
    }

    public int getKeyFrameInfo(Object view, int type, int[] info) {
        eza ezaVar = this.f86933a.f6128B2.get((View) view);
        if (ezaVar == null) {
            return 0;
        }
        return ezaVar.getKeyFrameInfo(type, info);
    }

    @Override // p000.tid
    public float getKeyFramePosition(Object view, int type, float x, float y) {
        eza ezaVar;
        if ((view instanceof View) && (ezaVar = this.f86933a.f6128B2.get((View) view)) != null) {
            return ezaVar.m10390l(type, x, y);
        }
        return 0.0f;
    }

    public int getKeyFramePositions(Object view, int[] type, float[] pos) {
        eza ezaVar = this.f86933a.f6128B2.get((View) view);
        if (ezaVar == null) {
            return 0;
        }
        return ezaVar.getKeyFramePositions(type, pos);
    }

    public Object getKeyframe(int type, int target, int position) {
        MotionLayout motionLayout = this.f86933a;
        C0878b c0878b = motionLayout.f6187r2;
        if (c0878b == null) {
            return null;
        }
        return c0878b.m1304k(motionLayout.getContext(), type, target, position);
    }

    @Override // p000.tid
    public Object getKeyframeAtLocation(Object viewObject, float x, float y) {
        eza ezaVar;
        View view = (View) viewObject;
        MotionLayout motionLayout = this.f86933a;
        if (motionLayout.f6187r2 == null) {
            return -1;
        }
        if (view == null || (ezaVar = motionLayout.f6128B2.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return ezaVar.m10392n(viewGroup.getWidth(), viewGroup.getHeight(), x, y);
    }

    @Override // p000.tid
    public Boolean getPositionKeyframe(Object keyFrame, Object view, float x, float y, String[] attribute, float[] value) {
        if (!(keyFrame instanceof jr8)) {
            return Boolean.FALSE;
        }
        View view2 = (View) view;
        this.f86933a.f6128B2.get(view2).m10396r(view2, (jr8) keyFrame, x, y, attribute, value);
        this.f86933a.rebuildScene();
        this.f86933a.f6144J2 = true;
        return Boolean.TRUE;
    }

    public float getProgress() {
        return this.f86933a.getProgress();
    }

    public String getStartState() {
        int startState = this.f86933a.getStartState();
        if (this.f86937e == startState) {
            return this.f86935c;
        }
        String strM1276N = this.f86933a.m1276N(startState);
        if (strM1276N != null) {
            this.f86935c = strM1276N;
            this.f86937e = startState;
        }
        return this.f86933a.m1276N(startState);
    }

    public String getState() {
        if (this.f86935c != null && this.f86936d != null) {
            float progress = getProgress();
            if (progress <= 0.01f) {
                return this.f86935c;
            }
            if (progress >= 0.99f) {
                return this.f86936d;
            }
        }
        return this.f86935c;
    }

    @Override // p000.tid
    public long getTransitionTimeMs() {
        return this.f86933a.getTransitionTimeMs();
    }

    public boolean isInTransition() {
        return (this.f86935c == null || this.f86936d == null) ? false : true;
    }

    @Override // p000.tid
    public void setAttributes(int dpi, String constraintSetId, Object opaqueView, Object opaqueAttributes) {
        View view = (View) opaqueView;
        HashMap map = (HashMap) opaqueAttributes;
        int iM1278P = this.f86933a.m1278P(constraintSetId);
        C0901d c0901dM1301h = this.f86933a.f6187r2.m1301h(iM1278P);
        if (c0901dM1301h == null) {
            return;
        }
        c0901dM1301h.clear(view.getId());
        SetDimensions(dpi, c0901dM1301h, view, map, 0);
        SetDimensions(dpi, c0901dM1301h, view, map, 1);
        Connect(dpi, c0901dM1301h, view, map, 6, 6);
        Connect(dpi, c0901dM1301h, view, map, 6, 7);
        Connect(dpi, c0901dM1301h, view, map, 7, 7);
        Connect(dpi, c0901dM1301h, view, map, 7, 6);
        Connect(dpi, c0901dM1301h, view, map, 1, 1);
        Connect(dpi, c0901dM1301h, view, map, 1, 2);
        Connect(dpi, c0901dM1301h, view, map, 2, 2);
        Connect(dpi, c0901dM1301h, view, map, 2, 1);
        Connect(dpi, c0901dM1301h, view, map, 3, 3);
        Connect(dpi, c0901dM1301h, view, map, 3, 4);
        Connect(dpi, c0901dM1301h, view, map, 4, 3);
        Connect(dpi, c0901dM1301h, view, map, 4, 4);
        Connect(dpi, c0901dM1301h, view, map, 5, 5);
        SetBias(c0901dM1301h, view, map, 0);
        SetBias(c0901dM1301h, view, map, 1);
        SetAbsolutePositions(dpi, c0901dM1301h, view, map);
        this.f86933a.updateState(iM1278P, c0901dM1301h);
        this.f86933a.requestLayout();
    }

    @Override // p000.tid
    public void setKeyFrame(Object view, int position, String name, Object value) {
        C0878b c0878b = this.f86933a.f6187r2;
        if (c0878b != null) {
            c0878b.setKeyframe((View) view, position, name, value);
            MotionLayout motionLayout = this.f86933a;
            motionLayout.f6140H2 = position / 100.0f;
            motionLayout.f6136F2 = 0.0f;
            motionLayout.rebuildScene();
            this.f86933a.m1273K(true);
        }
    }

    @Override // p000.tid
    public boolean setKeyFramePosition(Object view, int position, int type, float x, float y) {
        if (!(view instanceof View)) {
            return false;
        }
        MotionLayout motionLayout = this.f86933a;
        if (motionLayout.f6187r2 != null) {
            eza ezaVar = motionLayout.f6128B2.get(view);
            MotionLayout motionLayout2 = this.f86933a;
            int i = (int) (motionLayout2.f6134E2 * 100.0f);
            if (ezaVar != null) {
                View view2 = (View) view;
                if (motionLayout2.f6187r2.m1316x(view2, i)) {
                    float fM10390l = ezaVar.m10390l(2, x, y);
                    float fM10390l2 = ezaVar.m10390l(5, x, y);
                    this.f86933a.f6187r2.setKeyframe(view2, i, "motion:percentX", Float.valueOf(fM10390l));
                    this.f86933a.f6187r2.setKeyframe(view2, i, "motion:percentY", Float.valueOf(fM10390l2));
                    this.f86933a.rebuildScene();
                    this.f86933a.m1273K(true);
                    this.f86933a.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public void setKeyframe(Object keyFrame, String tag, Object value) {
        if (keyFrame instanceof dq8) {
            ((dq8) keyFrame).setValue(tag, value);
            this.f86933a.rebuildScene();
            this.f86933a.f6144J2 = true;
        }
    }

    public void setState(String id) {
        if (id == null) {
            id = "motion_base";
        }
        if (this.f86935c == id) {
            return;
        }
        this.f86935c = id;
        this.f86936d = null;
        MotionLayout motionLayout = this.f86933a;
        if (motionLayout.f6187r2 == null) {
            motionLayout.f6187r2 = this.f86934b;
        }
        int iM1278P = motionLayout.m1278P(id);
        this.f86937e = iM1278P;
        if (iM1278P != 0) {
            if (iM1278P == this.f86933a.getStartState()) {
                this.f86933a.setProgress(0.0f);
            } else if (iM1278P == this.f86933a.getEndState()) {
                this.f86933a.setProgress(1.0f);
            } else {
                this.f86933a.transitionToState(iM1278P);
                this.f86933a.setProgress(1.0f);
            }
        }
        this.f86933a.requestLayout();
    }

    @Override // p000.tid
    public void setToolPosition(float position) {
        MotionLayout motionLayout = this.f86933a;
        if (motionLayout.f6187r2 == null) {
            motionLayout.f6187r2 = this.f86934b;
        }
        motionLayout.setProgress(position);
        this.f86933a.m1273K(true);
        this.f86933a.requestLayout();
        this.f86933a.invalidate();
    }

    public void setTransition(String start, String end) {
        MotionLayout motionLayout = this.f86933a;
        if (motionLayout.f6187r2 == null) {
            motionLayout.f6187r2 = this.f86934b;
        }
        int iM1278P = motionLayout.m1278P(start);
        int iM1278P2 = this.f86933a.m1278P(end);
        this.f86933a.setTransition(iM1278P, iM1278P2);
        this.f86937e = iM1278P;
        this.f86938f = iM1278P2;
        this.f86935c = start;
        this.f86936d = end;
    }

    public void setViewDebug(Object view, int debugMode) {
        eza ezaVar;
        if ((view instanceof View) && (ezaVar = this.f86933a.f6128B2.get(view)) != null) {
            ezaVar.setDrawPath(debugMode);
            this.f86933a.invalidate();
        }
    }

    public Object getKeyframe(Object view, int type, int position) {
        if (this.f86933a.f6187r2 == null) {
            return null;
        }
        int id = ((View) view).getId();
        MotionLayout motionLayout = this.f86933a;
        return motionLayout.f6187r2.m1304k(motionLayout.getContext(), type, id, position);
    }
}
