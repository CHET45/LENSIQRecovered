package p000;

import android.R;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.C0915R;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.InterfaceC10809p7;
import p000.nf1;
import p000.p7e;

/* JADX INFO: renamed from: h7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6730h7 {

    /* JADX INFO: renamed from: A */
    public static final int f42541A = 1;

    /* JADX INFO: renamed from: A0 */
    public static final int f42542A0 = 32;

    /* JADX INFO: renamed from: B */
    public static final int f42543B = 2;

    /* JADX INFO: renamed from: B0 */
    @igg({"MinMaxConstant"})
    public static final int f42544B0 = 50;

    /* JADX INFO: renamed from: C */
    public static final int f42545C = 4;

    /* JADX INFO: renamed from: C0 */
    public static int f42546C0 = 0;

    /* JADX INFO: renamed from: D */
    public static final int f42547D = 8;

    /* JADX INFO: renamed from: E */
    public static final int f42548E = 16;

    /* JADX INFO: renamed from: F */
    public static final int f42549F = 32;

    /* JADX INFO: renamed from: G */
    public static final int f42550G = 64;

    /* JADX INFO: renamed from: H */
    public static final int f42551H = 128;

    /* JADX INFO: renamed from: I */
    public static final int f42552I = 256;

    /* JADX INFO: renamed from: J */
    public static final int f42553J = 512;

    /* JADX INFO: renamed from: K */
    public static final int f42554K = 1024;

    /* JADX INFO: renamed from: L */
    public static final int f42555L = 2048;

    /* JADX INFO: renamed from: M */
    public static final int f42556M = 4096;

    /* JADX INFO: renamed from: N */
    public static final int f42557N = 8192;

    /* JADX INFO: renamed from: O */
    public static final int f42558O = 16384;

    /* JADX INFO: renamed from: P */
    public static final int f42559P = 32768;

    /* JADX INFO: renamed from: Q */
    public static final int f42560Q = 65536;

    /* JADX INFO: renamed from: R */
    public static final int f42561R = 131072;

    /* JADX INFO: renamed from: S */
    public static final int f42562S = 262144;

    /* JADX INFO: renamed from: T */
    public static final int f42563T = 524288;

    /* JADX INFO: renamed from: U */
    public static final int f42564U = 1048576;

    /* JADX INFO: renamed from: V */
    public static final int f42565V = 2097152;

    /* JADX INFO: renamed from: W */
    public static final String f42566W = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";

    /* JADX INFO: renamed from: X */
    public static final String f42567X = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";

    /* JADX INFO: renamed from: Y */
    public static final String f42568Y = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";

    /* JADX INFO: renamed from: Z */
    public static final String f42569Z = "ACTION_ARGUMENT_SELECTION_START_INT";

    /* JADX INFO: renamed from: a0 */
    public static final String f42570a0 = "ACTION_ARGUMENT_SELECTION_END_INT";

    /* JADX INFO: renamed from: b0 */
    public static final String f42571b0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";

    /* JADX INFO: renamed from: c0 */
    public static final String f42572c0 = "android.view.accessibility.action.ARGUMENT_ROW_INT";

    /* JADX INFO: renamed from: d */
    public static final String f42573d = "AccessibilityNodeInfo.roleDescription";

    /* JADX INFO: renamed from: d0 */
    public static final String f42574d0 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";

    /* JADX INFO: renamed from: e */
    public static final String f42575e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";

    /* JADX INFO: renamed from: e0 */
    public static final String f42576e0 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";

    /* JADX INFO: renamed from: f */
    public static final String f42577f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";

    /* JADX INFO: renamed from: f0 */
    public static final String f42578f0 = "ACTION_ARGUMENT_MOVE_WINDOW_X";

    /* JADX INFO: renamed from: g */
    public static final String f42579g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";

    /* JADX INFO: renamed from: g0 */
    public static final String f42580g0 = "ACTION_ARGUMENT_MOVE_WINDOW_Y";

    /* JADX INFO: renamed from: h */
    public static final String f42581h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";

    /* JADX INFO: renamed from: h0 */
    @igg({"ActionValue"})
    public static final String f42582h0 = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";

    /* JADX INFO: renamed from: i */
    public static final String f42583i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";

    /* JADX INFO: renamed from: i0 */
    public static final String f42584i0 = "androidx.core.view.accessibility.action.ARGUMENT_DIRECTION_INT";

    /* JADX INFO: renamed from: j */
    public static final String f42585j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";

    /* JADX INFO: renamed from: j0 */
    public static final String f42586j0 = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT";

    /* JADX INFO: renamed from: k */
    public static final String f42587k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";

    /* JADX INFO: renamed from: k0 */
    public static final int f42588k0 = 1;

    /* JADX INFO: renamed from: l */
    public static final String f42589l = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";

    /* JADX INFO: renamed from: l0 */
    public static final int f42590l0 = 2;

    /* JADX INFO: renamed from: m */
    public static final String f42591m = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";

    /* JADX INFO: renamed from: m0 */
    public static final int f42592m0 = 1;

    /* JADX INFO: renamed from: n */
    public static final String f42593n = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";

    /* JADX INFO: renamed from: n0 */
    public static final int f42594n0 = 2;

    /* JADX INFO: renamed from: o */
    public static final String f42595o = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";

    /* JADX INFO: renamed from: o0 */
    public static final int f42596o0 = 4;

    /* JADX INFO: renamed from: p */
    public static final String f42597p = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY";

    /* JADX INFO: renamed from: p0 */
    public static final int f42598p0 = 8;

    /* JADX INFO: renamed from: q */
    public static final String f42599q = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY";

    /* JADX INFO: renamed from: q0 */
    public static final int f42600q0 = 16;

    /* JADX INFO: renamed from: r */
    public static final String f42601r = "androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY";

    /* JADX INFO: renamed from: r0 */
    public static final String f42602r0 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";

    /* JADX INFO: renamed from: s */
    public static final int f42603s = 1;

    /* JADX INFO: renamed from: s0 */
    public static final String f42604s0 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";

    /* JADX INFO: renamed from: t */
    public static final int f42605t = 2;

    /* JADX INFO: renamed from: t0 */
    public static final String f42606t0 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";

    /* JADX INFO: renamed from: u */
    public static final int f42607u = 4;

    /* JADX INFO: renamed from: u0 */
    public static final int f42608u0 = 20000;

    /* JADX INFO: renamed from: v */
    public static final int f42609v = 8;

    /* JADX INFO: renamed from: v0 */
    public static final int f42610v0 = 1;

    /* JADX INFO: renamed from: w */
    public static final int f42611w = 32;

    /* JADX INFO: renamed from: w0 */
    public static final int f42612w0 = 2;

    /* JADX INFO: renamed from: x */
    public static final int f42613x = 64;

    /* JADX INFO: renamed from: x0 */
    public static final int f42614x0 = 4;

    /* JADX INFO: renamed from: y */
    public static final int f42615y = 8388608;

    /* JADX INFO: renamed from: y0 */
    public static final int f42616y0 = 8;

    /* JADX INFO: renamed from: z */
    public static final int f42617z = 67108864;

    /* JADX INFO: renamed from: z0 */
    public static final int f42618z0 = 16;

    /* JADX INFO: renamed from: a */
    public final AccessibilityNodeInfo f42619a;

    /* JADX INFO: renamed from: b */
    @p7e({p7e.EnumC10826a.f69936c})
    public int f42620b = -1;

    /* JADX INFO: renamed from: c */
    public int f42621c = -1;

    /* JADX INFO: renamed from: h7$a */
    public static class a {

        /* JADX INFO: renamed from: B */
        public static final a f42623B;

        /* JADX INFO: renamed from: C */
        public static final a f42624C;

        /* JADX INFO: renamed from: D */
        public static final a f42625D;

        /* JADX INFO: renamed from: E */
        public static final a f42626E;

        /* JADX INFO: renamed from: F */
        public static final a f42627F;

        /* JADX INFO: renamed from: G */
        public static final a f42628G;

        /* JADX INFO: renamed from: H */
        @efb
        public static final a f42629H;

        /* JADX INFO: renamed from: I */
        @efb
        public static final a f42630I;

        /* JADX INFO: renamed from: J */
        @efb
        public static final a f42631J;

        /* JADX INFO: renamed from: K */
        @efb
        public static final a f42632K;

        /* JADX INFO: renamed from: L */
        public static final a f42633L;

        /* JADX INFO: renamed from: M */
        public static final a f42634M;

        /* JADX INFO: renamed from: N */
        public static final a f42635N;

        /* JADX INFO: renamed from: O */
        public static final a f42636O;

        /* JADX INFO: renamed from: P */
        public static final a f42637P;

        /* JADX INFO: renamed from: Q */
        @efb
        public static final a f42638Q;

        /* JADX INFO: renamed from: R */
        @efb
        public static final a f42639R;

        /* JADX INFO: renamed from: S */
        @efb
        public static final a f42640S;

        /* JADX INFO: renamed from: T */
        @efb
        public static final a f42641T;

        /* JADX INFO: renamed from: U */
        @efb
        public static final a f42642U;

        /* JADX INFO: renamed from: V */
        @efb
        public static final a f42643V;

        /* JADX INFO: renamed from: W */
        @efb
        @r6c(markerClass = {nf1.InterfaceC9839b.class})
        public static final a f42644W;

        /* JADX INFO: renamed from: e */
        public static final String f42645e = "A11yActionCompat";

        /* JADX INFO: renamed from: a */
        public final Object f42667a;

        /* JADX INFO: renamed from: b */
        public final int f42668b;

        /* JADX INFO: renamed from: c */
        public final Class<? extends InterfaceC10809p7.a> f42669c;

        /* JADX INFO: renamed from: d */
        @p7e({p7e.EnumC10826a.f69936c})
        public final InterfaceC10809p7 f42670d;

        /* JADX INFO: renamed from: f */
        public static final a f42646f = new a(1, null);

        /* JADX INFO: renamed from: g */
        public static final a f42647g = new a(2, null);

        /* JADX INFO: renamed from: h */
        public static final a f42648h = new a(4, null);

        /* JADX INFO: renamed from: i */
        public static final a f42649i = new a(8, null);

        /* JADX INFO: renamed from: j */
        public static final a f42650j = new a(16, null);

        /* JADX INFO: renamed from: k */
        public static final a f42651k = new a(32, null);

        /* JADX INFO: renamed from: l */
        public static final a f42652l = new a(64, null);

        /* JADX INFO: renamed from: m */
        public static final a f42653m = new a(128, null);

        /* JADX INFO: renamed from: n */
        public static final a f42654n = new a(256, (CharSequence) null, (Class<? extends InterfaceC10809p7.a>) InterfaceC10809p7.b.class);

        /* JADX INFO: renamed from: o */
        public static final a f42655o = new a(512, (CharSequence) null, (Class<? extends InterfaceC10809p7.a>) InterfaceC10809p7.b.class);

        /* JADX INFO: renamed from: p */
        public static final a f42656p = new a(1024, (CharSequence) null, (Class<? extends InterfaceC10809p7.a>) InterfaceC10809p7.c.class);

        /* JADX INFO: renamed from: q */
        public static final a f42657q = new a(2048, (CharSequence) null, (Class<? extends InterfaceC10809p7.a>) InterfaceC10809p7.c.class);

        /* JADX INFO: renamed from: r */
        public static final a f42658r = new a(4096, null);

        /* JADX INFO: renamed from: s */
        public static final a f42659s = new a(8192, null);

        /* JADX INFO: renamed from: t */
        public static final a f42660t = new a(16384, null);

        /* JADX INFO: renamed from: u */
        public static final a f42661u = new a(32768, null);

        /* JADX INFO: renamed from: v */
        public static final a f42662v = new a(65536, null);

        /* JADX INFO: renamed from: w */
        public static final a f42663w = new a(131072, (CharSequence) null, (Class<? extends InterfaceC10809p7.a>) InterfaceC10809p7.g.class);

        /* JADX INFO: renamed from: x */
        public static final a f42664x = new a(262144, null);

        /* JADX INFO: renamed from: y */
        public static final a f42665y = new a(524288, null);

        /* JADX INFO: renamed from: z */
        public static final a f42666z = new a(1048576, null);

        /* JADX INFO: renamed from: A */
        public static final a f42622A = new a(2097152, (CharSequence) null, (Class<? extends InterfaceC10809p7.a>) InterfaceC10809p7.h.class);

        static {
            int i = Build.VERSION.SDK_INT;
            f42623B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f42624C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC10809p7.e.class);
            f42625D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f42626E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f42627F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f42628G = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f42629H = new a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f42630I = new a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f42631J = new a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f42632K = new a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f42633L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f42634M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, InterfaceC10809p7.f.class);
            f42635N = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, InterfaceC10809p7.d.class);
            f42636O = new a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f42637P = new a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f42638Q = new a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f42639R = new a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f42640S = new a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f42641T = new a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f42642U = new a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f42643V = new a(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f42644W = new a(i >= 34 ? e.getActionScrollInDirection() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        @p7e({p7e.EnumC10826a.f69936c})
        public a createReplacementAction(CharSequence charSequence, InterfaceC10809p7 interfaceC10809p7) {
            return new a(null, this.f42668b, charSequence, interfaceC10809p7, this.f42669c);
        }

        public boolean equals(@hib Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f42667a;
            return obj2 == null ? aVar.f42667a == null : obj2.equals(aVar.f42667a);
        }

        public int getId() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f42667a).getId();
        }

        public CharSequence getLabel() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f42667a).getLabel();
        }

        public int hashCode() {
            Object obj = this.f42667a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @p7e({p7e.EnumC10826a.f69936c})
        public boolean perform(View view, Bundle bundle) {
            if (this.f42670d == null) {
                return false;
            }
            Class<? extends InterfaceC10809p7.a> cls = this.f42669c;
            InterfaceC10809p7.a aVar = null;
            if (cls != null) {
                try {
                    InterfaceC10809p7.a aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                    try {
                        aVarNewInstance.setBundle(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e) {
                        e = e;
                        aVar = aVarNewInstance;
                        Class<? extends InterfaceC10809p7.a> cls2 = this.f42669c;
                        Log.e(f42645e, "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            return this.f42670d.perform(view, aVar);
        }

        @efb
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strM12170a = C6730h7.m12170a(this.f42668b);
            if (strM12170a.equals("ACTION_UNKNOWN") && getLabel() != null) {
                strM12170a = getLabel().toString();
            }
            sb.append(strM12170a);
            return sb.toString();
        }

        @p7e({p7e.EnumC10826a.f69936c})
        public a(int i, CharSequence charSequence, InterfaceC10809p7 interfaceC10809p7) {
            this(null, i, charSequence, interfaceC10809p7, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i, CharSequence charSequence, Class<? extends InterfaceC10809p7.a> cls) {
            this(null, i, charSequence, null, cls);
        }

        public a(Object obj, int i, CharSequence charSequence, InterfaceC10809p7 interfaceC10809p7, Class<? extends InterfaceC10809p7.a> cls) {
            this.f42668b = i;
            this.f42670d = interfaceC10809p7;
            if (obj == null) {
                this.f42667a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f42667a = obj;
            }
            this.f42669c = cls;
        }
    }

    /* JADX INFO: renamed from: h7$b */
    @c5e(21)
    public static class b {
        private b() {
        }

        @ih4
        public static g createCollectionItemInfo(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    /* JADX INFO: renamed from: h7$c */
    @c5e(30)
    public static class c {
        private c() {
        }

        @ih4
        public static Object createRangeInfo(int i, float f, float f2, float f3) {
            return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
        }

        @ih4
        public static CharSequence getStateDescription(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        @ih4
        public static void setStateDescription(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: h7$d */
    @c5e(33)
    public static class d {
        private d() {
        }

        @ih4
        public static g buildCollectionItemInfoCompat(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
            return new g(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
        }

        @ih4
        public static C6730h7 getChild(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
            return C6730h7.m12171b(accessibilityNodeInfo.getChild(i, i2));
        }

        @ih4
        public static String getCollectionItemColumnTitle(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        @ih4
        public static String getCollectionItemRowTitle(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        @ih4
        public static AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        @ih4
        public static C6730h7 getParent(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            return C6730h7.m12171b(accessibilityNodeInfo.getParent(i));
        }

        @ih4
        public static String getUniqueId(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        @ih4
        public static boolean isTextSelectable(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        @ih4
        public static void setTextSelectable(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setTextSelectable(z);
        }

        @ih4
        public static void setUniqueId(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    /* JADX INFO: renamed from: h7$e */
    @c5e(34)
    public static class e {
        private e() {
        }

        @ih4
        public static AccessibilityNodeInfo.AccessibilityAction getActionScrollInDirection() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        @ih4
        public static void getBoundsInWindow(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        @ih4
        public static CharSequence getContainerTitle(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        @ih4
        public static long getMinDurationBetweenContentChangeMillis(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        @ih4
        public static boolean hasRequestInitialAccessibilityFocus(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        @ih4
        public static boolean isAccessibilityDataSensitive(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        @ih4
        public static void setAccessibilityDataSensitive(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z);
        }

        @ih4
        public static void setBoundsInWindow(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        @ih4
        public static void setContainerTitle(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        @ih4
        public static void setMinDurationBetweenContentChangeMillis(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j));
        }

        @ih4
        public static void setQueryFromAppProcessEnabled(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
        }

        @ih4
        public static void setRequestInitialAccessibilityFocus(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
        }
    }

    /* JADX INFO: renamed from: h7$f */
    public static class f {

        /* JADX INFO: renamed from: b */
        public static final int f42671b = 0;

        /* JADX INFO: renamed from: c */
        public static final int f42672c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f42673d = 2;

        /* JADX INFO: renamed from: a */
        public final Object f42674a;

        public f(Object obj) {
            this.f42674a = obj;
        }

        public static f obtain(int i, int i2, boolean z, int i3) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }

        public int getColumnCount() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f42674a).getColumnCount();
        }

        public int getRowCount() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f42674a).getRowCount();
        }

        public int getSelectionMode() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f42674a).getSelectionMode();
        }

        public boolean isHierarchical() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f42674a).isHierarchical();
        }

        public static f obtain(int i, int i2, boolean z) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }
    }

    /* JADX INFO: renamed from: h7$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        public final Object f42675a;

        /* JADX INFO: renamed from: h7$g$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public boolean f42676a;

            /* JADX INFO: renamed from: b */
            public int f42677b;

            /* JADX INFO: renamed from: c */
            public int f42678c;

            /* JADX INFO: renamed from: d */
            public int f42679d;

            /* JADX INFO: renamed from: e */
            public int f42680e;

            /* JADX INFO: renamed from: f */
            public boolean f42681f;

            /* JADX INFO: renamed from: g */
            public String f42682g;

            /* JADX INFO: renamed from: h */
            public String f42683h;

            @efb
            public g build() {
                return Build.VERSION.SDK_INT >= 33 ? d.buildCollectionItemInfoCompat(this.f42676a, this.f42677b, this.f42678c, this.f42679d, this.f42680e, this.f42681f, this.f42682g, this.f42683h) : b.createCollectionItemInfo(this.f42678c, this.f42680e, this.f42677b, this.f42679d, this.f42676a, this.f42681f);
            }

            @efb
            public a setColumnIndex(int i) {
                this.f42677b = i;
                return this;
            }

            @efb
            public a setColumnSpan(int i) {
                this.f42679d = i;
                return this;
            }

            @efb
            public a setColumnTitle(@hib String str) {
                this.f42683h = str;
                return this;
            }

            @efb
            public a setHeading(boolean z) {
                this.f42676a = z;
                return this;
            }

            @efb
            public a setRowIndex(int i) {
                this.f42678c = i;
                return this;
            }

            @efb
            public a setRowSpan(int i) {
                this.f42680e = i;
                return this;
            }

            @efb
            public a setRowTitle(@hib String str) {
                this.f42682g = str;
                return this;
            }

            @efb
            public a setSelected(boolean z) {
                this.f42681f = z;
                return this;
            }
        }

        public g(Object obj) {
            this.f42675a = obj;
        }

        public static g obtain(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }

        public int getColumnIndex() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f42675a).getColumnIndex();
        }

        public int getColumnSpan() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f42675a).getColumnSpan();
        }

        @hib
        public String getColumnTitle() {
            if (Build.VERSION.SDK_INT >= 33) {
                return d.getCollectionItemColumnTitle(this.f42675a);
            }
            return null;
        }

        public int getRowIndex() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f42675a).getRowIndex();
        }

        public int getRowSpan() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f42675a).getRowSpan();
        }

        @hib
        public String getRowTitle() {
            if (Build.VERSION.SDK_INT >= 33) {
                return d.getCollectionItemRowTitle(this.f42675a);
            }
            return null;
        }

        @Deprecated
        public boolean isHeading() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f42675a).isHeading();
        }

        public boolean isSelected() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f42675a).isSelected();
        }

        public static g obtain(int i, int i2, int i3, int i4, boolean z) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }
    }

    @Deprecated
    public C6730h7(Object obj) {
        this.f42619a = (AccessibilityNodeInfo) obj;
    }

    /* JADX INFO: renamed from: a */
    public static String m12170a(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i2) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i2) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private void addSpanLocationToExtras(ClickableSpan clickableSpan, Spanned spanned, int i2) {
        extrasIntList(f42585j).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        extrasIntList(f42587k).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        extrasIntList(f42589l).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        extrasIntList(f42583i).add(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: b */
    public static C6730h7 m12171b(Object obj) {
        if (obj != null) {
            return new C6730h7(obj);
        }
        return null;
    }

    private void clearExtrasSpans() {
        this.f42619a.getExtras().remove(f42585j);
        this.f42619a.getExtras().remove(f42587k);
        this.f42619a.getExtras().remove(f42589l);
        this.f42619a.getExtras().remove(f42583i);
    }

    private List<Integer> extrasIntList(String str) {
        ArrayList<Integer> integerArrayList = this.f42619a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f42619a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private boolean getBooleanProperty(int i2) {
        Bundle extras = getExtras();
        return extras != null && (extras.getInt(f42581h, 0) & i2) == i2;
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public static ClickableSpan[] getClickableSpans(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> getOrCreateSpansFromViewTags(View view) {
        SparseArray<WeakReference<ClickableSpan>> spansFromViewTags = getSpansFromViewTags(view);
        if (spansFromViewTags != null) {
            return spansFromViewTags;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C0915R.id.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> getSpansFromViewTags(View view) {
        return (SparseArray) view.getTag(C0915R.id.tag_accessibility_clickable_spans);
    }

    private boolean hasSpans() {
        return !extrasIntList(f42585j).isEmpty();
    }

    private int idForClickableSpan(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (clickableSpan.equals(sparseArray.valueAt(i2).get())) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = f42546C0;
        f42546C0 = i3 + 1;
        return i3;
    }

    public static C6730h7 obtain(View view) {
        return wrap(AccessibilityNodeInfo.obtain(view));
    }

    private void removeCollectedSpans(View view) {
        SparseArray<WeakReference<ClickableSpan>> spansFromViewTags = getSpansFromViewTags(view);
        if (spansFromViewTags != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < spansFromViewTags.size(); i2++) {
                if (spansFromViewTags.valueAt(i2).get() == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                spansFromViewTags.remove(((Integer) arrayList.get(i3)).intValue());
            }
        }
    }

    private void setBooleanProperty(int i2, boolean z) {
        Bundle extras = getExtras();
        if (extras != null) {
            int i3 = extras.getInt(f42581h, 0) & (~i2);
            if (!z) {
                i2 = 0;
            }
            extras.putInt(f42581h, i2 | i3);
        }
    }

    public static C6730h7 wrap(@efb AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C6730h7(accessibilityNodeInfo);
    }

    public void addAction(int i2) {
        this.f42619a.addAction(i2);
    }

    public void addChild(View view) {
        this.f42619a.addChild(view);
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public void addSpansToExtras(CharSequence charSequence, View view) {
    }

    public boolean canOpenPopup() {
        return this.f42619a.canOpenPopup();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6730h7)) {
            return false;
        }
        C6730h7 c6730h7 = (C6730h7) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f42619a;
        if (accessibilityNodeInfo == null) {
            if (c6730h7.f42619a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c6730h7.f42619a)) {
            return false;
        }
        return this.f42621c == c6730h7.f42621c && this.f42620b == c6730h7.f42620b;
    }

    public List<C6730h7> findAccessibilityNodeInfosByText(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText = this.f42619a.findAccessibilityNodeInfosByText(str);
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(wrap(listFindAccessibilityNodeInfosByText.get(i2)));
        }
        return arrayList;
    }

    public List<C6730h7> findAccessibilityNodeInfosByViewId(String str) {
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = this.f42619a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityNodeInfo> it = listFindAccessibilityNodeInfosByViewId.iterator();
        while (it.hasNext()) {
            arrayList.add(wrap(it.next()));
        }
        return arrayList;
    }

    public C6730h7 findFocus(int i2) {
        return m12171b(this.f42619a.findFocus(i2));
    }

    public C6730h7 focusSearch(int i2) {
        return m12171b(this.f42619a.focusSearch(i2));
    }

    public List<a> getActionList() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f42619a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new a(actionList.get(i2)));
        }
        return arrayList;
    }

    @Deprecated
    public int getActions() {
        return this.f42619a.getActions();
    }

    @efb
    public List<String> getAvailableExtraData() {
        return this.f42619a.getAvailableExtraData();
    }

    @Deprecated
    public void getBoundsInParent(Rect rect) {
        this.f42619a.getBoundsInParent(rect);
    }

    public void getBoundsInScreen(Rect rect) {
        this.f42619a.getBoundsInScreen(rect);
    }

    public void getBoundsInWindow(@efb Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.getBoundsInWindow(this.f42619a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f42619a.getExtras().getParcelable(f42599q);
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public C6730h7 getChild(int i2) {
        return m12171b(this.f42619a.getChild(i2));
    }

    public int getChildCount() {
        return this.f42619a.getChildCount();
    }

    public CharSequence getClassName() {
        return this.f42619a.getClassName();
    }

    public f getCollectionInfo() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f42619a.getCollectionInfo();
        if (collectionInfo != null) {
            return new f(collectionInfo);
        }
        return null;
    }

    public g getCollectionItemInfo() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f42619a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new g(collectionItemInfo);
        }
        return null;
    }

    @hib
    public CharSequence getContainerTitle() {
        return Build.VERSION.SDK_INT >= 34 ? e.getContainerTitle(this.f42619a) : this.f42619a.getExtras().getCharSequence(f42597p);
    }

    public CharSequence getContentDescription() {
        return this.f42619a.getContentDescription();
    }

    public int getDrawingOrder() {
        return this.f42619a.getDrawingOrder();
    }

    public CharSequence getError() {
        return this.f42619a.getError();
    }

    @hib
    public AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo() {
        if (Build.VERSION.SDK_INT >= 33) {
            return d.getExtraRenderingInfo(this.f42619a);
        }
        return null;
    }

    public Bundle getExtras() {
        return this.f42619a.getExtras();
    }

    @hib
    public CharSequence getHintText() {
        return this.f42619a.getHintText();
    }

    @Deprecated
    public Object getInfo() {
        return this.f42619a;
    }

    public int getInputType() {
        return this.f42619a.getInputType();
    }

    public C6730h7 getLabelFor() {
        return m12171b(this.f42619a.getLabelFor());
    }

    public C6730h7 getLabeledBy() {
        return m12171b(this.f42619a.getLabeledBy());
    }

    public int getLiveRegion() {
        return this.f42619a.getLiveRegion();
    }

    public int getMaxTextLength() {
        return this.f42619a.getMaxTextLength();
    }

    public long getMinDurationBetweenContentChangesMillis() {
        return Build.VERSION.SDK_INT >= 34 ? e.getMinDurationBetweenContentChangeMillis(this.f42619a) : this.f42619a.getExtras().getLong(f42601r);
    }

    public int getMovementGranularities() {
        return this.f42619a.getMovementGranularities();
    }

    public CharSequence getPackageName() {
        return this.f42619a.getPackageName();
    }

    @hib
    public CharSequence getPaneTitle() {
        return Build.VERSION.SDK_INT >= 28 ? this.f42619a.getPaneTitle() : this.f42619a.getExtras().getCharSequence(f42575e);
    }

    public C6730h7 getParent() {
        return m12171b(this.f42619a.getParent());
    }

    public h getRangeInfo() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f42619a.getRangeInfo();
        if (rangeInfo != null) {
            return new h(rangeInfo);
        }
        return null;
    }

    @hib
    public CharSequence getRoleDescription() {
        return this.f42619a.getExtras().getCharSequence(f42573d);
    }

    @hib
    public CharSequence getStateDescription() {
        return Build.VERSION.SDK_INT >= 30 ? c.getStateDescription(this.f42619a) : this.f42619a.getExtras().getCharSequence(f42593n);
    }

    public CharSequence getText() {
        if (!hasSpans()) {
            return this.f42619a.getText();
        }
        List<Integer> listExtrasIntList = extrasIntList(f42585j);
        List<Integer> listExtrasIntList2 = extrasIntList(f42587k);
        List<Integer> listExtrasIntList3 = extrasIntList(f42589l);
        List<Integer> listExtrasIntList4 = extrasIntList(f42583i);
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f42619a.getText(), 0, this.f42619a.getText().length()));
        for (int i2 = 0; i2 < listExtrasIntList.size(); i2++) {
            spannableString.setSpan(new C5134e6(listExtrasIntList4.get(i2).intValue(), this, getExtras().getInt(f42591m)), listExtrasIntList.get(i2).intValue(), listExtrasIntList2.get(i2).intValue(), listExtrasIntList3.get(i2).intValue());
        }
        return spannableString;
    }

    public int getTextSelectionEnd() {
        return this.f42619a.getTextSelectionEnd();
    }

    public int getTextSelectionStart() {
        return this.f42619a.getTextSelectionStart();
    }

    @hib
    public CharSequence getTooltipText() {
        return Build.VERSION.SDK_INT >= 28 ? this.f42619a.getTooltipText() : this.f42619a.getExtras().getCharSequence(f42577f);
    }

    @hib
    public i getTouchDelegateInfo() {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        if (Build.VERSION.SDK_INT < 29 || (touchDelegateInfo = this.f42619a.getTouchDelegateInfo()) == null) {
            return null;
        }
        return new i(touchDelegateInfo);
    }

    public C6730h7 getTraversalAfter() {
        return m12171b(this.f42619a.getTraversalAfter());
    }

    public C6730h7 getTraversalBefore() {
        return m12171b(this.f42619a.getTraversalBefore());
    }

    @hib
    public String getUniqueId() {
        return Build.VERSION.SDK_INT >= 33 ? d.getUniqueId(this.f42619a) : this.f42619a.getExtras().getString(f42595o);
    }

    public String getViewIdResourceName() {
        return this.f42619a.getViewIdResourceName();
    }

    public C11327q7 getWindow() {
        return C11327q7.m20081a(this.f42619a.getWindow());
    }

    public int getWindowId() {
        return this.f42619a.getWindowId();
    }

    @igg({"KotlinPropertyAccess"})
    public boolean hasRequestInitialAccessibilityFocus() {
        return Build.VERSION.SDK_INT >= 34 ? e.hasRequestInitialAccessibilityFocus(this.f42619a) : getBooleanProperty(32);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f42619a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean isAccessibilityDataSensitive() {
        return Build.VERSION.SDK_INT >= 34 ? e.isAccessibilityDataSensitive(this.f42619a) : getBooleanProperty(64);
    }

    public boolean isAccessibilityFocused() {
        return this.f42619a.isAccessibilityFocused();
    }

    public boolean isCheckable() {
        return this.f42619a.isCheckable();
    }

    public boolean isChecked() {
        return this.f42619a.isChecked();
    }

    public boolean isClickable() {
        return this.f42619a.isClickable();
    }

    public boolean isContentInvalid() {
        return this.f42619a.isContentInvalid();
    }

    public boolean isContextClickable() {
        return this.f42619a.isContextClickable();
    }

    public boolean isDismissable() {
        return this.f42619a.isDismissable();
    }

    public boolean isEditable() {
        return this.f42619a.isEditable();
    }

    public boolean isEnabled() {
        return this.f42619a.isEnabled();
    }

    public boolean isFocusable() {
        return this.f42619a.isFocusable();
    }

    public boolean isFocused() {
        return this.f42619a.isFocused();
    }

    public boolean isGranularScrollingSupported() {
        return getBooleanProperty(67108864);
    }

    public boolean isHeading() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f42619a.isHeading();
        }
        if (getBooleanProperty(2)) {
            return true;
        }
        g collectionItemInfo = getCollectionItemInfo();
        return collectionItemInfo != null && collectionItemInfo.isHeading();
    }

    public boolean isImportantForAccessibility() {
        return this.f42619a.isImportantForAccessibility();
    }

    public boolean isLongClickable() {
        return this.f42619a.isLongClickable();
    }

    public boolean isMultiLine() {
        return this.f42619a.isMultiLine();
    }

    public boolean isPassword() {
        return this.f42619a.isPassword();
    }

    public boolean isScreenReaderFocusable() {
        return Build.VERSION.SDK_INT >= 28 ? this.f42619a.isScreenReaderFocusable() : getBooleanProperty(1);
    }

    public boolean isScrollable() {
        return this.f42619a.isScrollable();
    }

    public boolean isSelected() {
        return this.f42619a.isSelected();
    }

    public boolean isShowingHintText() {
        return this.f42619a.isShowingHintText();
    }

    public boolean isTextEntryKey() {
        return Build.VERSION.SDK_INT >= 29 ? this.f42619a.isTextEntryKey() : getBooleanProperty(8);
    }

    public boolean isTextSelectable() {
        return Build.VERSION.SDK_INT >= 33 ? d.isTextSelectable(this.f42619a) : getBooleanProperty(8388608);
    }

    public boolean isVisibleToUser() {
        return this.f42619a.isVisibleToUser();
    }

    public boolean performAction(int i2) {
        return this.f42619a.performAction(i2);
    }

    @Deprecated
    public void recycle() {
    }

    public boolean refresh() {
        return this.f42619a.refresh();
    }

    public boolean removeAction(a aVar) {
        return this.f42619a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f42667a);
    }

    public boolean removeChild(View view) {
        return this.f42619a.removeChild(view);
    }

    public void setAccessibilityDataSensitive(boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.setAccessibilityDataSensitive(this.f42619a, z);
        } else {
            setBooleanProperty(64, z);
        }
    }

    public void setAccessibilityFocused(boolean z) {
        this.f42619a.setAccessibilityFocused(z);
    }

    public void setAvailableExtraData(@efb List<String> list) {
        this.f42619a.setAvailableExtraData(list);
    }

    @Deprecated
    public void setBoundsInParent(Rect rect) {
        this.f42619a.setBoundsInParent(rect);
    }

    public void setBoundsInScreen(Rect rect) {
        this.f42619a.setBoundsInScreen(rect);
    }

    public void setBoundsInWindow(@efb Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.setBoundsInWindow(this.f42619a, rect);
        } else {
            this.f42619a.getExtras().putParcelable(f42599q, rect);
        }
    }

    public void setCanOpenPopup(boolean z) {
        this.f42619a.setCanOpenPopup(z);
    }

    public void setCheckable(boolean z) {
        this.f42619a.setCheckable(z);
    }

    public void setChecked(boolean z) {
        this.f42619a.setChecked(z);
    }

    public void setClassName(CharSequence charSequence) {
        this.f42619a.setClassName(charSequence);
    }

    public void setClickable(boolean z) {
        this.f42619a.setClickable(z);
    }

    public void setCollectionInfo(Object obj) {
        this.f42619a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f42674a);
    }

    public void setCollectionItemInfo(Object obj) {
        this.f42619a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f42675a);
    }

    public void setContainerTitle(@hib CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.setContainerTitle(this.f42619a, charSequence);
        } else {
            this.f42619a.getExtras().putCharSequence(f42597p, charSequence);
        }
    }

    public void setContentDescription(CharSequence charSequence) {
        this.f42619a.setContentDescription(charSequence);
    }

    public void setContentInvalid(boolean z) {
        this.f42619a.setContentInvalid(z);
    }

    public void setContextClickable(boolean z) {
        this.f42619a.setContextClickable(z);
    }

    public void setDismissable(boolean z) {
        this.f42619a.setDismissable(z);
    }

    public void setDrawingOrder(int i2) {
        this.f42619a.setDrawingOrder(i2);
    }

    public void setEditable(boolean z) {
        this.f42619a.setEditable(z);
    }

    public void setEnabled(boolean z) {
        this.f42619a.setEnabled(z);
    }

    public void setError(CharSequence charSequence) {
        this.f42619a.setError(charSequence);
    }

    public void setFocusable(boolean z) {
        this.f42619a.setFocusable(z);
    }

    public void setFocused(boolean z) {
        this.f42619a.setFocused(z);
    }

    public void setGranularScrollingSupported(boolean z) {
        setBooleanProperty(67108864, z);
    }

    public void setHeading(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f42619a.setHeading(z);
        } else {
            setBooleanProperty(2, z);
        }
    }

    public void setHintText(@hib CharSequence charSequence) {
        this.f42619a.setHintText(charSequence);
    }

    public void setImportantForAccessibility(boolean z) {
        this.f42619a.setImportantForAccessibility(z);
    }

    public void setInputType(int i2) {
        this.f42619a.setInputType(i2);
    }

    public void setLabelFor(View view) {
        this.f42619a.setLabelFor(view);
    }

    public void setLabeledBy(View view) {
        this.f42619a.setLabeledBy(view);
    }

    public void setLiveRegion(int i2) {
        this.f42619a.setLiveRegion(i2);
    }

    public void setLongClickable(boolean z) {
        this.f42619a.setLongClickable(z);
    }

    public void setMaxTextLength(int i2) {
        this.f42619a.setMaxTextLength(i2);
    }

    public void setMinDurationBetweenContentChangesMillis(long j) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.setMinDurationBetweenContentChangeMillis(this.f42619a, j);
        } else {
            this.f42619a.getExtras().putLong(f42601r, j);
        }
    }

    public void setMovementGranularities(int i2) {
        this.f42619a.setMovementGranularities(i2);
    }

    public void setMultiLine(boolean z) {
        this.f42619a.setMultiLine(z);
    }

    public void setPackageName(CharSequence charSequence) {
        this.f42619a.setPackageName(charSequence);
    }

    public void setPaneTitle(@hib CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f42619a.setPaneTitle(charSequence);
        } else {
            this.f42619a.getExtras().putCharSequence(f42575e, charSequence);
        }
    }

    public void setParent(View view) {
        this.f42620b = -1;
        this.f42619a.setParent(view);
    }

    public void setPassword(boolean z) {
        this.f42619a.setPassword(z);
    }

    public void setQueryFromAppProcessEnabled(@efb View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.setQueryFromAppProcessEnabled(this.f42619a, view, z);
        }
    }

    public void setRangeInfo(h hVar) {
        this.f42619a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) hVar.f42687a);
    }

    @igg({"GetterSetterNames"})
    public void setRequestInitialAccessibilityFocus(boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.setRequestInitialAccessibilityFocus(this.f42619a, z);
        } else {
            setBooleanProperty(32, z);
        }
    }

    public void setRoleDescription(@hib CharSequence charSequence) {
        this.f42619a.getExtras().putCharSequence(f42573d, charSequence);
    }

    public void setScreenReaderFocusable(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f42619a.setScreenReaderFocusable(z);
        } else {
            setBooleanProperty(1, z);
        }
    }

    public void setScrollable(boolean z) {
        this.f42619a.setScrollable(z);
    }

    public void setSelected(boolean z) {
        this.f42619a.setSelected(z);
    }

    public void setShowingHintText(boolean z) {
        this.f42619a.setShowingHintText(z);
    }

    public void setSource(View view) {
        this.f42621c = -1;
        this.f42619a.setSource(view);
    }

    public void setStateDescription(@hib CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.setStateDescription(this.f42619a, charSequence);
        } else {
            this.f42619a.getExtras().putCharSequence(f42593n, charSequence);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f42619a.setText(charSequence);
    }

    public void setTextEntryKey(boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f42619a.setTextEntryKey(z);
        } else {
            setBooleanProperty(8, z);
        }
    }

    public void setTextSelectable(boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            d.setTextSelectable(this.f42619a, z);
        } else {
            setBooleanProperty(8388608, z);
        }
    }

    public void setTextSelection(int i2, int i3) {
        this.f42619a.setTextSelection(i2, i3);
    }

    public void setTooltipText(@hib CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f42619a.setTooltipText(charSequence);
        } else {
            this.f42619a.getExtras().putCharSequence(f42577f, charSequence);
        }
    }

    public void setTouchDelegateInfo(@efb i iVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f42619a.setTouchDelegateInfo(iVar.f42688a);
        }
    }

    public void setTraversalAfter(View view) {
        this.f42619a.setTraversalAfter(view);
    }

    public void setTraversalBefore(View view) {
        this.f42619a.setTraversalBefore(view);
    }

    public void setUniqueId(@hib String str) {
        if (Build.VERSION.SDK_INT >= 33) {
            d.setUniqueId(this.f42619a, str);
        } else {
            this.f42619a.getExtras().putString(f42595o, str);
        }
    }

    public void setViewIdResourceName(String str) {
        this.f42619a.setViewIdResourceName(str);
    }

    public void setVisibleToUser(boolean z) {
        this.f42619a.setVisibleToUser(z);
    }

    @efb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        getBoundsInWindow(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(getPackageName());
        sb.append("; className: ");
        sb.append(getClassName());
        sb.append("; text: ");
        sb.append(getText());
        sb.append("; error: ");
        sb.append(getError());
        sb.append("; maxTextLength: ");
        sb.append(getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(getStateDescription());
        sb.append("; contentDescription: ");
        sb.append(getContentDescription());
        sb.append("; tooltipText: ");
        sb.append(getTooltipText());
        sb.append("; viewIdResName: ");
        sb.append(getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(getUniqueId());
        sb.append("; checkable: ");
        sb.append(isCheckable());
        sb.append("; checked: ");
        sb.append(isChecked());
        sb.append("; focusable: ");
        sb.append(isFocusable());
        sb.append("; focused: ");
        sb.append(isFocused());
        sb.append("; selected: ");
        sb.append(isSelected());
        sb.append("; clickable: ");
        sb.append(isClickable());
        sb.append("; longClickable: ");
        sb.append(isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(isContextClickable());
        sb.append("; enabled: ");
        sb.append(isEnabled());
        sb.append("; password: ");
        sb.append(isPassword());
        sb.append("; scrollable: " + isScrollable());
        sb.append("; containerTitle: ");
        sb.append(getContainerTitle());
        sb.append("; granularScrollingSupported: ");
        sb.append(isGranularScrollingSupported());
        sb.append("; importantForAccessibility: ");
        sb.append(isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(isTextSelectable());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(isAccessibilityDataSensitive());
        sb.append("; [");
        List<a> actionList = getActionList();
        for (int i2 = 0; i2 < actionList.size(); i2++) {
            a aVar = actionList.get(i2);
            String strM12170a = m12170a(aVar.getId());
            if (strM12170a.equals("ACTION_UNKNOWN") && aVar.getLabel() != null) {
                strM12170a = aVar.getLabel().toString();
            }
            sb.append(strM12170a);
            if (i2 != actionList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public AccessibilityNodeInfo unwrap() {
        return this.f42619a;
    }

    /* JADX INFO: renamed from: h7$h */
    public static class h {

        /* JADX INFO: renamed from: b */
        public static final int f42684b = 0;

        /* JADX INFO: renamed from: c */
        public static final int f42685c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f42686d = 2;

        /* JADX INFO: renamed from: a */
        public final Object f42687a;

        public h(Object obj) {
            this.f42687a = obj;
        }

        public static h obtain(int i, float f, float f2, float f3) {
            return new h(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }

        public float getCurrent() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f42687a).getCurrent();
        }

        public float getMax() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f42687a).getMax();
        }

        public float getMin() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f42687a).getMin();
        }

        public int getType() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f42687a).getType();
        }

        public h(int i, float f, float f2, float f3) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f42687a = c.createRangeInfo(i, f, f2, f3);
            } else {
                this.f42687a = AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3);
            }
        }
    }

    public static C6730h7 obtain(View view, int i2) {
        return m12171b(AccessibilityNodeInfo.obtain(view, i2));
    }

    public void addAction(a aVar) {
        this.f42619a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f42667a);
    }

    public void addChild(View view, int i2) {
        this.f42619a.addChild(view, i2);
    }

    @hib
    public C6730h7 getChild(int i2, int i3) {
        return Build.VERSION.SDK_INT >= 33 ? d.getChild(this.f42619a, i2, i3) : getChild(i2);
    }

    @hib
    public C6730h7 getParent(int i2) {
        return Build.VERSION.SDK_INT >= 33 ? d.getParent(this.f42619a, i2) : getParent();
    }

    public boolean performAction(int i2, Bundle bundle) {
        return this.f42619a.performAction(i2, bundle);
    }

    public boolean removeChild(View view, int i2) {
        return this.f42619a.removeChild(view, i2);
    }

    public void setLabelFor(View view, int i2) {
        this.f42619a.setLabelFor(view, i2);
    }

    public void setLabeledBy(View view, int i2) {
        this.f42619a.setLabeledBy(view, i2);
    }

    public void setTraversalAfter(View view, int i2) {
        this.f42619a.setTraversalAfter(view, i2);
    }

    public void setTraversalBefore(View view, int i2) {
        this.f42619a.setTraversalBefore(view, i2);
    }

    public void setParent(View view, int i2) {
        this.f42620b = i2;
        this.f42619a.setParent(view, i2);
    }

    public void setSource(View view, int i2) {
        this.f42621c = i2;
        this.f42619a.setSource(view, i2);
    }

    /* JADX INFO: renamed from: h7$i */
    public static final class i {

        /* JADX INFO: renamed from: a */
        public final AccessibilityNodeInfo.TouchDelegateInfo f42688a;

        public i(@efb Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f42688a = C8641l7.m15353a(map);
            } else {
                this.f42688a = null;
            }
        }

        @hib
        public Region getRegionAt(@h78(from = 0) int i) {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f42688a.getRegionAt(i);
            }
            return null;
        }

        @h78(from = 0)
        public int getRegionCount() {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f42688a.getRegionCount();
            }
            return 0;
        }

        @hib
        public C6730h7 getTargetForRegion(@efb Region region) {
            AccessibilityNodeInfo targetForRegion;
            if (Build.VERSION.SDK_INT < 29 || (targetForRegion = this.f42688a.getTargetForRegion(region)) == null) {
                return null;
            }
            return C6730h7.wrap(targetForRegion);
        }

        public i(@efb AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.f42688a = touchDelegateInfo;
        }
    }

    public static C6730h7 obtain() {
        return wrap(AccessibilityNodeInfo.obtain());
    }

    private C6730h7(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f42619a = accessibilityNodeInfo;
    }

    public static C6730h7 obtain(C6730h7 c6730h7) {
        return wrap(AccessibilityNodeInfo.obtain(c6730h7.f42619a));
    }
}
