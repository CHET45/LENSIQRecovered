package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p000.ip6;

/* JADX INFO: loaded from: classes.dex */
@c5e(api = 26)
@dwf({"SMAP\nAndroidPreloadedFont.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPreloadedFont.android.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,234:1\n151#2,3:235\n33#2,4:238\n154#2,2:242\n38#2:244\n156#2:245\n37#3,2:246\n*S KotlinDebug\n*F\n+ 1 AndroidPreloadedFont.android.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n*L\n229#1:235,3\n229#1:238,4\n229#1:242,2\n229#1:244\n229#1:245\n231#1:246,2\n*E\n"})
public final class anh {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final anh f11422a = new anh();

    private anh() {
    }

    @c5e(26)
    @th5
    private final FontVariationAxis[] toVariationSettings(ip6.C7556e c7556e, Context context) {
        c64 c64VarDensity;
        if (context != null) {
            c64VarDensity = C2030bs.Density(context);
        } else {
            if (c7556e.getNeedsDensity$ui_text_release()) {
                throw new IllegalStateException("Required density, but not provided");
            }
            c64VarDensity = e64.Density(1.0f, 1.0f);
        }
        List<ip6.InterfaceC7552a> settings = c7556e.getSettings();
        ArrayList arrayList = new ArrayList(settings.size());
        int size = settings.size();
        for (int i = 0; i < size; i++) {
            ip6.InterfaceC7552a interfaceC7552a = settings.get(i);
            arrayList.add(new FontVariationAxis(interfaceC7552a.getAxisName(), interfaceC7552a.toVariationValue(c64VarDensity)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }

    @gib
    @ih4
    @th5
    public final Typeface createFromAssets(@yfb AssetManager assetManager, @yfb String str, @gib Context context, @yfb ip6.C7556e c7556e) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(assetManager, str).setFontVariationSettings(toVariationSettings(c7556e, context)).build();
    }

    @gib
    @ih4
    @th5
    public final Typeface createFromFile(@yfb File file, @gib Context context, @yfb ip6.C7556e c7556e) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(file).setFontVariationSettings(toVariationSettings(c7556e, context)).build();
    }

    @gib
    @ih4
    @th5
    public final Typeface createFromFileDescriptor(@yfb ParcelFileDescriptor parcelFileDescriptor, @gib Context context, @yfb ip6.C7556e c7556e) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(toVariationSettings(c7556e, context)).build();
    }
}
