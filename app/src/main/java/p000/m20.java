package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.C0392R;
import p000.n6e;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public final class m20 {

    /* JADX INFO: renamed from: b */
    public static final String f59671b = "AppCompatDrawableManag";

    /* JADX INFO: renamed from: c */
    public static final boolean f59672c = false;

    /* JADX INFO: renamed from: d */
    public static final PorterDuff.Mode f59673d = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: e */
    public static m20 f59674e;

    /* JADX INFO: renamed from: a */
    public n6e f59675a;

    /* JADX INFO: renamed from: m20$a */
    public class C9097a implements n6e.InterfaceC9714f {

        /* JADX INFO: renamed from: a */
        public final int[] f59676a = {C0392R.drawable.abc_textfield_search_default_mtrl_alpha, C0392R.drawable.abc_textfield_default_mtrl_alpha, C0392R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* JADX INFO: renamed from: b */
        public final int[] f59677b = {C0392R.drawable.abc_ic_commit_search_api_mtrl_alpha, C0392R.drawable.abc_seekbar_tick_mark_material, C0392R.drawable.abc_ic_menu_share_mtrl_alpha, C0392R.drawable.abc_ic_menu_copy_mtrl_am_alpha, C0392R.drawable.abc_ic_menu_cut_mtrl_alpha, C0392R.drawable.abc_ic_menu_selectall_mtrl_alpha, C0392R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* JADX INFO: renamed from: c */
        public final int[] f59678c = {C0392R.drawable.abc_textfield_activated_mtrl_alpha, C0392R.drawable.abc_textfield_search_activated_mtrl_alpha, C0392R.drawable.abc_cab_background_top_mtrl_alpha, C0392R.drawable.abc_text_cursor_material, C0392R.drawable.abc_text_select_handle_left_mtrl, C0392R.drawable.abc_text_select_handle_middle_mtrl, C0392R.drawable.abc_text_select_handle_right_mtrl};

        /* JADX INFO: renamed from: d */
        public final int[] f59679d = {C0392R.drawable.abc_popup_background_mtrl_mult, C0392R.drawable.abc_cab_background_internal_bg, C0392R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* JADX INFO: renamed from: e */
        public final int[] f59680e = {C0392R.drawable.abc_tab_indicator_material, C0392R.drawable.abc_textfield_search_material};

        /* JADX INFO: renamed from: f */
        public final int[] f59681f = {C0392R.drawable.abc_btn_check_material, C0392R.drawable.abc_btn_radio_material, C0392R.drawable.abc_btn_check_material_anim, C0392R.drawable.abc_btn_radio_material_anim};

        private boolean arrayContains(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList createBorderlessButtonColorStateList(@efb Context context) {
            return createButtonColorStateList(context, 0);
        }

        private ColorStateList createButtonColorStateList(@efb Context context, @g92 int i) {
            int themeAttrColor = ixg.getThemeAttrColor(context, C0392R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{ixg.f48837c, ixg.f48840f, ixg.f48838d, ixg.f48844j}, new int[]{ixg.getDisabledThemeAttrColor(context, C0392R.attr.colorButtonNormal), ua2.compositeColors(themeAttrColor, i), ua2.compositeColors(themeAttrColor, i), i});
        }

        private ColorStateList createColoredButtonColorStateList(@efb Context context) {
            return createButtonColorStateList(context, ixg.getThemeAttrColor(context, C0392R.attr.colorAccent));
        }

        private ColorStateList createDefaultButtonColorStateList(@efb Context context) {
            return createButtonColorStateList(context, ixg.getThemeAttrColor(context, C0392R.attr.colorButtonNormal));
        }

        private ColorStateList createSwitchThumbColorStateList(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList themeAttrColorStateList = ixg.getThemeAttrColorStateList(context, C0392R.attr.colorSwitchThumbNormal);
            if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
                iArr[0] = ixg.f48837c;
                iArr2[0] = ixg.getDisabledThemeAttrColor(context, C0392R.attr.colorSwitchThumbNormal);
                iArr[1] = ixg.f48841g;
                iArr2[1] = ixg.getThemeAttrColor(context, C0392R.attr.colorControlActivated);
                iArr[2] = ixg.f48844j;
                iArr2[2] = ixg.getThemeAttrColor(context, C0392R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = ixg.f48837c;
                iArr[0] = iArr3;
                iArr2[0] = themeAttrColorStateList.getColorForState(iArr3, 0);
                iArr[1] = ixg.f48841g;
                iArr2[1] = ixg.getThemeAttrColor(context, C0392R.attr.colorControlActivated);
                iArr[2] = ixg.f48844j;
                iArr2[2] = themeAttrColorStateList.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable getRatingBarLayerDrawable(@efb n6e n6eVar, @efb Context context, @xc4 int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawable = n6eVar.getDrawable(context, C0392R.drawable.abc_star_black_48dp);
            Drawable drawable2 = n6eVar.getDrawable(context, C0392R.drawable.abc_star_half_black_48dp);
            if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawable;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawable2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void setPorterDuffColorFilter(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (qq4.canSafelyMutateDrawable(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = m20.f59673d;
            }
            drawable.setColorFilter(m20.getPorterDuffColorFilter(i, mode));
        }

        @Override // p000.n6e.InterfaceC9714f
        public Drawable createDrawableFor(@efb n6e n6eVar, @efb Context context, int i) {
            if (i == C0392R.drawable.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{n6eVar.getDrawable(context, C0392R.drawable.abc_cab_background_internal_bg), n6eVar.getDrawable(context, C0392R.drawable.abc_cab_background_top_mtrl_alpha)});
            }
            if (i == C0392R.drawable.abc_ratingbar_material) {
                return getRatingBarLayerDrawable(n6eVar, context, C0392R.dimen.abc_star_big);
            }
            if (i == C0392R.drawable.abc_ratingbar_indicator_material) {
                return getRatingBarLayerDrawable(n6eVar, context, C0392R.dimen.abc_star_medium);
            }
            if (i == C0392R.drawable.abc_ratingbar_small_material) {
                return getRatingBarLayerDrawable(n6eVar, context, C0392R.dimen.abc_star_small);
            }
            return null;
        }

        @Override // p000.n6e.InterfaceC9714f
        public ColorStateList getTintListForDrawableRes(@efb Context context, int i) {
            if (i == C0392R.drawable.abc_edit_text_material) {
                return u20.getColorStateList(context, C0392R.color.abc_tint_edittext);
            }
            if (i == C0392R.drawable.abc_switch_track_mtrl_alpha) {
                return u20.getColorStateList(context, C0392R.color.abc_tint_switch_track);
            }
            if (i == C0392R.drawable.abc_switch_thumb_material) {
                return createSwitchThumbColorStateList(context);
            }
            if (i == C0392R.drawable.abc_btn_default_mtrl_shape) {
                return createDefaultButtonColorStateList(context);
            }
            if (i == C0392R.drawable.abc_btn_borderless_material) {
                return createBorderlessButtonColorStateList(context);
            }
            if (i == C0392R.drawable.abc_btn_colored_material) {
                return createColoredButtonColorStateList(context);
            }
            if (i == C0392R.drawable.abc_spinner_mtrl_am_alpha || i == C0392R.drawable.abc_spinner_textfield_background_material) {
                return u20.getColorStateList(context, C0392R.color.abc_tint_spinner);
            }
            if (arrayContains(this.f59677b, i)) {
                return ixg.getThemeAttrColorStateList(context, C0392R.attr.colorControlNormal);
            }
            if (arrayContains(this.f59680e, i)) {
                return u20.getColorStateList(context, C0392R.color.abc_tint_default);
            }
            if (arrayContains(this.f59681f, i)) {
                return u20.getColorStateList(context, C0392R.color.abc_tint_btn_checkable);
            }
            if (i == C0392R.drawable.abc_seekbar_thumb_material) {
                return u20.getColorStateList(context, C0392R.color.abc_tint_seek_thumb);
            }
            return null;
        }

        @Override // p000.n6e.InterfaceC9714f
        public PorterDuff.Mode getTintModeForDrawableRes(int i) {
            if (i == C0392R.drawable.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // p000.n6e.InterfaceC9714f
        public boolean tintDrawable(@efb Context context, int i, @efb Drawable drawable) {
            if (i == C0392R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(R.id.background), ixg.getThemeAttrColor(context, C0392R.attr.colorControlNormal), m20.f59673d);
                setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), ixg.getThemeAttrColor(context, C0392R.attr.colorControlNormal), m20.f59673d);
                setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(R.id.progress), ixg.getThemeAttrColor(context, C0392R.attr.colorControlActivated), m20.f59673d);
                return true;
            }
            if (i != C0392R.drawable.abc_ratingbar_material && i != C0392R.drawable.abc_ratingbar_indicator_material && i != C0392R.drawable.abc_ratingbar_small_material) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(R.id.background), ixg.getDisabledThemeAttrColor(context, C0392R.attr.colorControlNormal), m20.f59673d);
            setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), ixg.getThemeAttrColor(context, C0392R.attr.colorControlActivated), m20.f59673d);
            setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(R.id.progress), ixg.getThemeAttrColor(context, C0392R.attr.colorControlActivated), m20.f59673d);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[RETURN] */
        @Override // p000.n6e.InterfaceC9714f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean tintDrawableUsingColorFilter(@p000.efb android.content.Context r8, int r9, @p000.efb android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = p000.m20.m16550a()
                int[] r1 = r7.f59676a
                boolean r1 = r7.arrayContains(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = androidx.appcompat.C0392R.attr.colorControlNormal
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.f59678c
                boolean r1 = r7.arrayContains(r1, r9)
                if (r1 == 0) goto L20
                int r9 = androidx.appcompat.C0392R.attr.colorControlActivated
                goto L11
            L20:
                int[] r1 = r7.f59679d
                boolean r1 = r7.arrayContains(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L4f
            L32:
                int r1 = androidx.appcompat.C0392R.drawable.abc_list_divider_mtrl_alpha
                if (r9 != r1) goto L46
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L4f
            L46:
                int r1 = androidx.appcompat.C0392R.drawable.abc_dialog_material_background
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L6c
                boolean r3 = p000.qq4.canSafelyMutateDrawable(r10)
                if (r3 == 0) goto L5b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L5b:
                int r8 = p000.ixg.getThemeAttrColor(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = p000.m20.getPorterDuffColorFilter(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L6b
                r10.setAlpha(r0)
            L6b:
                return r2
            L6c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.m20.C9097a.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m16551e(Drawable drawable, r2h r2hVar, int[] iArr) {
        n6e.m17792e(drawable, r2hVar, iArr);
    }

    public static synchronized m20 get() {
        try {
            if (f59674e == null) {
                preload();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f59674e;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i, PorterDuff.Mode mode) {
        return n6e.getPorterDuffColorFilter(i, mode);
    }

    public static synchronized void preload() {
        if (f59674e == null) {
            m20 m20Var = new m20();
            f59674e = m20Var;
            m20Var.f59675a = n6e.get();
            f59674e.f59675a.setHooks(new C9097a());
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized Drawable m16552b(@efb Context context, @gq4 int i, boolean z) {
        return this.f59675a.m17793a(context, i, z);
    }

    /* JADX INFO: renamed from: c */
    public synchronized ColorStateList m16553c(@efb Context context, @gq4 int i) {
        return this.f59675a.m17794b(context, i);
    }

    /* JADX INFO: renamed from: d */
    public synchronized Drawable m16554d(@efb Context context, @efb j3i j3iVar, @gq4 int i) {
        return this.f59675a.m17796d(context, j3iVar, i);
    }

    /* JADX INFO: renamed from: f */
    public boolean m16555f(@efb Context context, @gq4 int i, @efb Drawable drawable) {
        return this.f59675a.m17797f(context, i, drawable);
    }

    public synchronized Drawable getDrawable(@efb Context context, @gq4 int i) {
        return this.f59675a.getDrawable(context, i);
    }

    public synchronized void onConfigurationChanged(@efb Context context) {
        this.f59675a.onConfigurationChanged(context);
    }
}
