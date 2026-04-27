package p000;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import java.util.WeakHashMap;
import p000.C9041lz;
import p000.b79;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nURLSpanCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLSpanCache.android.kt\nandroidx/compose/ui/text/platform/URLSpanCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,82:1\n361#2,7:83\n361#2,7:90\n361#2,7:97\n*S KotlinDebug\n*F\n+ 1 URLSpanCache.android.kt\nandroidx/compose/ui/text/platform/URLSpanCache\n*L\n59#1:83,7\n63#1:90,7\n72#1:97,7\n*E\n"})
@p7e({p7e.EnumC10826a.f69935b})
@vb8
@e0g(parameters = 0)
public final class cqh {

    /* JADX INFO: renamed from: d */
    public static final int f27113d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final WeakHashMap<eyh, URLSpan> f27114a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b */
    @yfb
    public final WeakHashMap<C9041lz.c<b79.C1771b>, URLSpan> f27115b = new WeakHashMap<>();

    /* JADX INFO: renamed from: c */
    @yfb
    public final WeakHashMap<C9041lz.c<b79>, el2> f27116c = new WeakHashMap<>();

    @gib
    public final ClickableSpan toClickableSpan(@yfb C9041lz.c<b79> cVar) {
        WeakHashMap<C9041lz.c<b79>, el2> weakHashMap = this.f27116c;
        el2 el2Var = weakHashMap.get(cVar);
        if (el2Var == null) {
            el2Var = new el2(cVar.getItem());
            weakHashMap.put(cVar, el2Var);
        }
        return el2Var;
    }

    @yfb
    public final URLSpan toURLSpan(@yfb eyh eyhVar) {
        WeakHashMap<eyh, URLSpan> weakHashMap = this.f27114a;
        URLSpan uRLSpan = weakHashMap.get(eyhVar);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(eyhVar.getUrl());
            weakHashMap.put(eyhVar, uRLSpan);
        }
        return uRLSpan;
    }

    @yfb
    public final URLSpan toURLSpan(@yfb C9041lz.c<b79.C1771b> cVar) {
        WeakHashMap<C9041lz.c<b79.C1771b>, URLSpan> weakHashMap = this.f27115b;
        URLSpan uRLSpan = weakHashMap.get(cVar);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(cVar.getItem().getUrl());
            weakHashMap.put(cVar, uRLSpan);
        }
        return uRLSpan;
    }
}
