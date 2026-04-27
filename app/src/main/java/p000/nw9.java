package p000;

import com.google.android.material.C3146R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class nw9 {

    /* JADX INFO: renamed from: a */
    public static final Map<Integer, ru4> f65897a;

    static {
        HashMap map = new HashMap();
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_primary), r2a.f76894u);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_on_primary), r2a.f76896w);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_primary_inverse), r2a.f76895v);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_primary_container), r2a.f76892s);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_on_primary_container), r2a.f76893t);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_secondary), r2a.f76899z);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_on_secondary), r2a.f76845A);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_secondary_container), r2a.f76897x);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_on_secondary_container), r2a.f76898y);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_tertiary), r2a.f76848D);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_on_tertiary), r2a.f76849E);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_tertiary_container), r2a.f76846B);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_on_tertiary_container), r2a.f76847C);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_background), r2a.f76873b);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_on_background), r2a.f76875c);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_surface), r2a.f76877d);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_on_surface), r2a.f76886m);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_surface_variant), r2a.f76888o);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_on_surface_variant), r2a.f76889p);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_surface_inverse), r2a.f76878e);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_on_surface_inverse), r2a.f76887n);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_surface_bright), r2a.f76879f);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_surface_dim), r2a.f76880g);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_surface_container), r2a.f76883j);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_surface_container_low), r2a.f76882i);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_surface_container_high), r2a.f76884k);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_surface_container_lowest), r2a.f76881h);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_surface_container_highest), r2a.f76885l);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_outline), r2a.f76890q);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_outline_variant), r2a.f76891r);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_error), r2a.f76852H);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_on_error), r2a.f76853I);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_error_container), r2a.f76850F);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_on_error_container), r2a.f76851G);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_control_activated), r2a.f76866V);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_control_normal), r2a.f76867W);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_control_highlight), r2a.f76868X);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_text_primary_inverse), r2a.f76869Y);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_text_secondary_and_tertiary_inverse), r2a.f76870Z);
        map.put(Integer.valueOf(C3146R.color.f20706xbc712906), r2a.f76874b0);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_text_primary_inverse_disable_only), r2a.f76872a0);
        map.put(Integer.valueOf(C3146R.color.material_personalized_color_text_hint_foreground_inverse), r2a.f76876c0);
        f65897a = Collections.unmodifiableMap(map);
    }

    private nw9() {
    }

    @efb
    public static Map<Integer, Integer> createColorResourcesIdsToColorValues(@efb zu4 zu4Var) {
        HashMap map = new HashMap();
        for (Map.Entry<Integer, ru4> entry : f65897a.entrySet()) {
            map.put(entry.getKey(), Integer.valueOf(entry.getValue().getArgb(zu4Var)));
        }
        return Collections.unmodifiableMap(map);
    }
}
