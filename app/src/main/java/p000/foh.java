package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\n_UArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,10766:1\n3824#1:10816\n3832#1:10817\n3840#1:10818\n3848#1:10819\n3824#1:10820\n3832#1:10821\n3840#1:10822\n3848#1:10823\n3824#1:10824\n3832#1:10825\n3840#1:10826\n3848#1:10827\n3824#1:10884\n3832#1:10885\n3840#1:10886\n3848#1:10887\n3824#1:10888\n3832#1:10889\n3840#1:10890\n3848#1:10891\n3824#1:10892\n3832#1:10893\n3840#1:10894\n3848#1:10895\n3824#1:10896\n3832#1:10897\n3840#1:10898\n3848#1:10899\n3824#1:10900\n3832#1:10901\n3840#1:10902\n3848#1:10903\n3824#1:10904\n3832#1:10905\n3840#1:10906\n3848#1:10907\n3824#1:10908\n3832#1:10909\n3840#1:10910\n3848#1:10911\n3824#1:10912\n3832#1:10913\n3840#1:10914\n3848#1:10915\n3824#1:10916\n3832#1:10917\n3840#1:10918\n3848#1:10919\n3824#1:10920\n3832#1:10921\n3840#1:10922\n3848#1:10923\n3824#1:10924\n3832#1:10925\n3840#1:10926\n3848#1:10927\n3824#1:10928\n3832#1:10929\n3840#1:10930\n3848#1:10931\n3824#1:10932\n3832#1:10933\n3840#1:10934\n3848#1:10935\n3824#1:10936\n3832#1:10937\n3840#1:10938\n3848#1:10939\n3824#1:10940\n3832#1:10941\n3840#1:10942\n3848#1:10943\n3824#1:10944\n3832#1:10945\n3840#1:10946\n3848#1:10947\n3824#1:10948\n3832#1:10949\n3840#1:10950\n3848#1:10951\n3824#1:10952\n3832#1:10953\n3840#1:10954\n3848#1:10955\n3824#1:10956\n3832#1:10957\n3840#1:10958\n3848#1:10959\n3824#1:10960\n3832#1:10961\n3840#1:10962\n3848#1:10963\n3824#1:10964\n3832#1:10965\n3840#1:10966\n3848#1:10967\n3824#1:10968\n3832#1:10969\n3840#1:10970\n3848#1:10971\n3824#1:10972\n3832#1:10973\n3840#1:10974\n3848#1:10975\n3824#1:10976\n3832#1:10977\n3840#1:10978\n3848#1:10979\n3824#1:10980\n3832#1:10981\n3840#1:10982\n3848#1:10983\n3824#1:10984\n3832#1:10985\n3840#1:10986\n3848#1:10987\n3824#1:10988\n3832#1:10989\n3840#1:10990\n3848#1:10991\n3824#1:10992\n3832#1:10993\n3840#1:10994\n3848#1:10995\n3824#1:10996\n3832#1:10997\n3840#1:10998\n3848#1:10999\n3824#1:11000\n3832#1:11001\n3840#1:11002\n3848#1:11003\n3824#1:11004\n3832#1:11005\n3840#1:11006\n3848#1:11007\n3824#1:11008\n3832#1:11009\n3840#1:11010\n3848#1:11011\n3824#1:11012\n3832#1:11013\n3840#1:11014\n3848#1:11015\n3824#1:11016\n3832#1:11017\n3840#1:11018\n3848#1:11019\n3824#1:11020\n3832#1:11021\n3840#1:11022\n3848#1:11023\n3824#1:11024\n3832#1:11025\n3840#1:11026\n3848#1:11027\n3824#1:11028\n3832#1:11029\n3840#1:11030\n3848#1:11031\n3824#1:11032\n3832#1:11033\n3840#1:11034\n3848#1:11035\n1718#2,6:10767\n1730#2,6:10773\n1694#2,6:10779\n1706#2,6:10785\n1826#2,6:10791\n1838#2,6:10797\n1802#2,6:10803\n1814#2,6:10809\n1#3:10815\n381#4,7:10828\n381#4,7:10835\n381#4,7:10842\n381#4,7:10849\n381#4,7:10856\n381#4,7:10863\n381#4,7:10870\n381#4,7:10877\n*S KotlinDebug\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n*L\n1735#1:10816\n1752#1:10817\n1769#1:10818\n1786#1:10819\n2563#1:10820\n2580#1:10821\n2597#1:10822\n2614#1:10823\n2930#1:10824\n2946#1:10825\n2962#1:10826\n2978#1:10827\n5622#1:10884\n5642#1:10885\n5662#1:10886\n5682#1:10887\n5703#1:10888\n5725#1:10889\n5747#1:10890\n5769#1:10891\n5882#1:10892\n5901#1:10893\n5920#1:10894\n5939#1:10895\n5961#1:10896\n5990#1:10897\n6019#1:10898\n6048#1:10899\n6073#1:10900\n6098#1:10901\n6123#1:10902\n6148#1:10903\n6178#1:10904\n6201#1:10905\n6224#1:10906\n6247#1:10907\n6270#1:10908\n6293#1:10909\n6316#1:10910\n6339#1:10911\n6360#1:10912\n6383#1:10913\n6406#1:10914\n6429#1:10915\n6452#1:10916\n6473#1:10917\n6494#1:10918\n6515#1:10919\n6536#1:10920\n6557#1:10921\n6578#1:10922\n6599#1:10923\n6618#1:10924\n6639#1:10925\n6660#1:10926\n6681#1:10927\n6704#1:10928\n6727#1:10929\n6750#1:10930\n6773#1:10931\n6794#1:10932\n6815#1:10933\n6836#1:10934\n6857#1:10935\n6874#1:10936\n6889#1:10937\n6904#1:10938\n6919#1:10939\n6938#1:10940\n6957#1:10941\n6976#1:10942\n6995#1:10943\n7010#1:10944\n7025#1:10945\n7040#1:10946\n7055#1:10947\n7074#1:10948\n7093#1:10949\n7112#1:10950\n7131#1:10951\n7153#1:10952\n7182#1:10953\n7211#1:10954\n7240#1:10955\n7265#1:10956\n7290#1:10957\n7315#1:10958\n7340#1:10959\n7370#1:10960\n7393#1:10961\n7416#1:10962\n7439#1:10963\n7462#1:10964\n7485#1:10965\n7508#1:10966\n7531#1:10967\n7552#1:10968\n7575#1:10969\n7598#1:10970\n7621#1:10971\n7644#1:10972\n7665#1:10973\n7686#1:10974\n7707#1:10975\n7728#1:10976\n7749#1:10977\n7770#1:10978\n7791#1:10979\n7810#1:10980\n7831#1:10981\n7852#1:10982\n7873#1:10983\n7896#1:10984\n7919#1:10985\n7942#1:10986\n7965#1:10987\n7986#1:10988\n8007#1:10989\n8028#1:10990\n8049#1:10991\n8066#1:10992\n8081#1:10993\n8096#1:10994\n8111#1:10995\n8130#1:10996\n8149#1:10997\n8168#1:10998\n8187#1:10999\n8202#1:11000\n8217#1:11001\n8232#1:11002\n8247#1:11003\n8465#1:11004\n8490#1:11005\n8515#1:11006\n8540#1:11007\n8565#1:11008\n8590#1:11009\n8615#1:11010\n8640#1:11011\n8664#1:11012\n8688#1:11013\n8712#1:11014\n8736#1:11015\n8760#1:11016\n8784#1:11017\n8808#1:11018\n8832#1:11019\n8854#1:11020\n8879#1:11021\n8904#1:11022\n8929#1:11023\n8954#1:11024\n8980#1:11025\n9006#1:11026\n9032#1:11027\n9057#1:11028\n9082#1:11029\n9107#1:11030\n9132#1:11031\n9157#1:11032\n9181#1:11033\n9205#1:11034\n9229#1:11035\n841#1:10767,6\n851#1:10773,6\n861#1:10779,6\n871#1:10785,6\n881#1:10791,6\n891#1:10797,6\n901#1:10803,6\n911#1:10809,6\n4840#1:10828,7\n4860#1:10835,7\n4880#1:10842,7\n4900#1:10849,7\n4921#1:10856,7\n4942#1:10863,7\n4963#1:10870,7\n4984#1:10877,7\n*E\n"})
public class foh extends aoh {
    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: all-JOV_ifY, reason: not valid java name */
    private static final boolean m28920allJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$all");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            if (!qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: all-MShoTSo, reason: not valid java name */
    private static final boolean m28921allMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$all");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            if (!qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: all-jgv0xPQ, reason: not valid java name */
    private static final boolean m28922alljgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$all");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            if (!qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: all-xTcfx_M, reason: not valid java name */
    private static final boolean m28923allxTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$all");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            if (!qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: any--ajY-9A, reason: not valid java name */
    private static final boolean m28924anyajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$any");
        return e80.any(iArr);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: any-GBYM_sE, reason: not valid java name */
    private static final boolean m28925anyGBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$any");
        return e80.any(bArr);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: any-JOV_ifY, reason: not valid java name */
    private static final boolean m28926anyJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$any");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            if (qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: any-MShoTSo, reason: not valid java name */
    private static final boolean m28927anyMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$any");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            if (qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: any-QwZRm1k, reason: not valid java name */
    private static final boolean m28928anyQwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$any");
        return e80.any(jArr);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: any-jgv0xPQ, reason: not valid java name */
    private static final boolean m28929anyjgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$any");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            if (qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: any-rL5Bavg, reason: not valid java name */
    private static final boolean m28930anyrL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$any");
        return e80.any(sArr);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: any-xTcfx_M, reason: not valid java name */
    private static final boolean m28931anyxTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$any");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            if (qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: asByteArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m28932asByteArrayGBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$asByteArray");
        return bArr;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: asIntArray--ajY-9A, reason: not valid java name */
    private static final int[] m28933asIntArrayajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$asIntArray");
        return iArr;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: asLongArray-QwZRm1k, reason: not valid java name */
    private static final long[] m28934asLongArrayQwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$asLongArray");
        return jArr;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: asShortArray-rL5Bavg, reason: not valid java name */
    private static final short[] m28935asShortArrayrL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$asShortArray");
        return sArr;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    private static final byte[] asUByteArray(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return hoh.m30083constructorimpl(bArr);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    private static final int[] asUIntArray(int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return fph.m29585constructorimpl(iArr);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    private static final long[] asULongArray(long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return pph.m31838constructorimpl(jArr);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    private static final short[] asUShortArray(short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return jqh.m30546constructorimpl(sArr);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: associateWith-JOV_ifY, reason: not valid java name */
    private static final <V> Map<goh, V> m28936associateWithJOV_ifY(byte[] bArr, qy6<? super goh, ? extends V> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$associateWith");
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(hoh.m30089getSizeimpl(bArr)), 16));
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            linkedHashMap.put(goh.m29780boximpl(bM30088getw2LRezQ), qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ)));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: associateWith-MShoTSo, reason: not valid java name */
    private static final <V> Map<oph, V> m28937associateWithMShoTSo(long[] jArr, qy6<? super oph, ? extends V> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$associateWith");
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(pph.m31844getSizeimpl(jArr)), 16));
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            linkedHashMap.put(oph.m31527boximpl(jM31843getsVKNKU), qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU)));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: associateWith-jgv0xPQ, reason: not valid java name */
    private static final <V> Map<woh, V> m28938associateWithjgv0xPQ(int[] iArr, qy6<? super woh, ? extends V> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$associateWith");
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(fph.m29591getSizeimpl(iArr)), 16));
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            linkedHashMap.put(woh.m32998boximpl(iM29590getpVg5ArA), qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA)));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: associateWith-xTcfx_M, reason: not valid java name */
    private static final <V> Map<iqh, V> m28939associateWithxTcfx_M(short[] sArr, qy6<? super iqh, ? extends V> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$associateWith");
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(jqh.m30552getSizeimpl(sArr)), 16));
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            linkedHashMap.put(iqh.m30318boximpl(sM30551getMh2AYeg), qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: associateWithTo-4D70W2E, reason: not valid java name */
    private static final <V, M extends Map<? super woh, ? super V>> M m28940associateWithTo4D70W2E(int[] iArr, M m, qy6<? super woh, ? extends V> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$associateWithTo");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            m.put(woh.m32998boximpl(iM29590getpVg5ArA), qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA)));
        }
        return m;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: associateWithTo-H21X9dk, reason: not valid java name */
    private static final <V, M extends Map<? super goh, ? super V>> M m28941associateWithToH21X9dk(byte[] bArr, M m, qy6<? super goh, ? extends V> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$associateWithTo");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            m.put(goh.m29780boximpl(bM30088getw2LRezQ), qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ)));
        }
        return m;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: associateWithTo-X6OPwNk, reason: not valid java name */
    private static final <V, M extends Map<? super oph, ? super V>> M m28942associateWithToX6OPwNk(long[] jArr, M m, qy6<? super oph, ? extends V> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$associateWithTo");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            m.put(oph.m31527boximpl(jM31843getsVKNKU), qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU)));
        }
        return m;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: associateWithTo-ciTST-8, reason: not valid java name */
    private static final <V, M extends Map<? super iqh, ? super V>> M m28943associateWithTociTST8(short[] sArr, M m, qy6<? super iqh, ? extends V> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$associateWithTo");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            m.put(iqh.m30318boximpl(sM30551getMh2AYeg), qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)));
        }
        return m;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component1--ajY-9A, reason: not valid java name */
    private static final int m28944component1ajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$component1");
        return fph.m29590getpVg5ArA(iArr, 0);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component1-GBYM_sE, reason: not valid java name */
    private static final byte m28945component1GBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$component1");
        return hoh.m30088getw2LRezQ(bArr, 0);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component1-QwZRm1k, reason: not valid java name */
    private static final long m28946component1QwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$component1");
        return pph.m31843getsVKNKU(jArr, 0);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component1-rL5Bavg, reason: not valid java name */
    private static final short m28947component1rL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$component1");
        return jqh.m30551getMh2AYeg(sArr, 0);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component2--ajY-9A, reason: not valid java name */
    private static final int m28948component2ajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$component2");
        return fph.m29590getpVg5ArA(iArr, 1);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component2-GBYM_sE, reason: not valid java name */
    private static final byte m28949component2GBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$component2");
        return hoh.m30088getw2LRezQ(bArr, 1);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component2-QwZRm1k, reason: not valid java name */
    private static final long m28950component2QwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$component2");
        return pph.m31843getsVKNKU(jArr, 1);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component2-rL5Bavg, reason: not valid java name */
    private static final short m28951component2rL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$component2");
        return jqh.m30551getMh2AYeg(sArr, 1);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component3--ajY-9A, reason: not valid java name */
    private static final int m28952component3ajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$component3");
        return fph.m29590getpVg5ArA(iArr, 2);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component3-GBYM_sE, reason: not valid java name */
    private static final byte m28953component3GBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$component3");
        return hoh.m30088getw2LRezQ(bArr, 2);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component3-QwZRm1k, reason: not valid java name */
    private static final long m28954component3QwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$component3");
        return pph.m31843getsVKNKU(jArr, 2);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component3-rL5Bavg, reason: not valid java name */
    private static final short m28955component3rL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$component3");
        return jqh.m30551getMh2AYeg(sArr, 2);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component4--ajY-9A, reason: not valid java name */
    private static final int m28956component4ajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$component4");
        return fph.m29590getpVg5ArA(iArr, 3);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component4-GBYM_sE, reason: not valid java name */
    private static final byte m28957component4GBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$component4");
        return hoh.m30088getw2LRezQ(bArr, 3);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component4-QwZRm1k, reason: not valid java name */
    private static final long m28958component4QwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$component4");
        return pph.m31843getsVKNKU(jArr, 3);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component4-rL5Bavg, reason: not valid java name */
    private static final short m28959component4rL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$component4");
        return jqh.m30551getMh2AYeg(sArr, 3);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component5--ajY-9A, reason: not valid java name */
    private static final int m28960component5ajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$component5");
        return fph.m29590getpVg5ArA(iArr, 4);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component5-GBYM_sE, reason: not valid java name */
    private static final byte m28961component5GBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$component5");
        return hoh.m30088getw2LRezQ(bArr, 4);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component5-QwZRm1k, reason: not valid java name */
    private static final long m28962component5QwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$component5");
        return pph.m31843getsVKNKU(jArr, 4);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: component5-rL5Bavg, reason: not valid java name */
    private static final short m28963component5rL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$component5");
        return jqh.m30551getMh2AYeg(sArr, 4);
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: contentEquals-FGO6Aew, reason: not valid java name */
    public static boolean m28964contentEqualsFGO6Aew(@gib short[] sArr, @gib short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: contentEquals-KJPZfPQ, reason: not valid java name */
    public static boolean m28965contentEqualsKJPZfPQ(@gib int[] iArr, @gib int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: contentEquals-kV0jMPg, reason: not valid java name */
    public static boolean m28966contentEqualskV0jMPg(@gib byte[] bArr, @gib byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: contentEquals-lec5QzE, reason: not valid java name */
    public static boolean m28967contentEqualslec5QzE(@gib long[] jArr, @gib long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: contentHashCode-2csIQuQ, reason: not valid java name */
    public static final int m28968contentHashCode2csIQuQ(@gib byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: contentHashCode-XUkPCBk, reason: not valid java name */
    public static final int m28969contentHashCodeXUkPCBk(@gib int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: contentHashCode-d-6D3K8, reason: not valid java name */
    public static final int m28970contentHashCoded6D3K8(@gib short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: contentHashCode-uLth9ew, reason: not valid java name */
    public static final int m28971contentHashCodeuLth9ew(@gib long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @jjf(version = "1.4")
    @yfb
    @yh5
    /* JADX INFO: renamed from: contentToString-2csIQuQ, reason: not valid java name */
    public static String m28972contentToString2csIQuQ(@gib byte[] bArr) {
        String strJoinToString$default;
        return (bArr == null || (strJoinToString$default = v82.joinToString$default(hoh.m30081boximpl(bArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strJoinToString$default;
    }

    @jjf(version = "1.4")
    @yfb
    @yh5
    /* JADX INFO: renamed from: contentToString-XUkPCBk, reason: not valid java name */
    public static String m28973contentToStringXUkPCBk(@gib int[] iArr) {
        String strJoinToString$default;
        return (iArr == null || (strJoinToString$default = v82.joinToString$default(fph.m29583boximpl(iArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strJoinToString$default;
    }

    @jjf(version = "1.4")
    @yfb
    @yh5
    /* JADX INFO: renamed from: contentToString-d-6D3K8, reason: not valid java name */
    public static String m28974contentToStringd6D3K8(@gib short[] sArr) {
        String strJoinToString$default;
        return (sArr == null || (strJoinToString$default = v82.joinToString$default(jqh.m30544boximpl(sArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strJoinToString$default;
    }

    @jjf(version = "1.4")
    @yfb
    @yh5
    /* JADX INFO: renamed from: contentToString-uLth9ew, reason: not valid java name */
    public static String m28975contentToStringuLth9ew(@gib long[] jArr) {
        String strJoinToString$default;
        return (jArr == null || (strJoinToString$default = v82.joinToString$default(pph.m31836boximpl(jArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strJoinToString$default;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: copyInto--B0-L2c, reason: not valid java name */
    private static final long[] m28976copyIntoB0L2c(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        md8.checkNotNullParameter(jArr, "$this$copyInto");
        md8.checkNotNullParameter(jArr2, FirebaseAnalytics.C3552d.f23234z);
        u70.copyInto(jArr, jArr2, i, i2, i3);
        return jArr2;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: copyInto-9-ak10g, reason: not valid java name */
    private static final short[] m28977copyInto9ak10g(short[] sArr, short[] sArr2, int i, int i2, int i3) {
        md8.checkNotNullParameter(sArr, "$this$copyInto");
        md8.checkNotNullParameter(sArr2, FirebaseAnalytics.C3552d.f23234z);
        u70.copyInto(sArr, sArr2, i, i2, i3);
        return sArr2;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: copyInto-FUQE5sA, reason: not valid java name */
    private static final byte[] m28978copyIntoFUQE5sA(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        md8.checkNotNullParameter(bArr, "$this$copyInto");
        md8.checkNotNullParameter(bArr2, FirebaseAnalytics.C3552d.f23234z);
        u70.copyInto(bArr, bArr2, i, i2, i3);
        return bArr2;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: copyInto-sIZ3KeM, reason: not valid java name */
    private static final int[] m28979copyIntosIZ3KeM(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        md8.checkNotNullParameter(iArr, "$this$copyInto");
        md8.checkNotNullParameter(iArr2, FirebaseAnalytics.C3552d.f23234z);
        u70.copyInto(iArr, iArr2, i, i2, i3);
        return iArr2;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: copyOf--ajY-9A, reason: not valid java name */
    private static final int[] m28980copyOfajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$copyOf");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return fph.m29585constructorimpl(iArrCopyOf);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: copyOf-GBYM_sE, reason: not valid java name */
    private static final byte[] m28981copyOfGBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$copyOf");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return hoh.m30083constructorimpl(bArrCopyOf);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: copyOf-PpDY95g, reason: not valid java name */
    private static final byte[] m28982copyOfPpDY95g(byte[] bArr, int i) {
        md8.checkNotNullParameter(bArr, "$this$copyOf");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return hoh.m30083constructorimpl(bArrCopyOf);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: copyOf-QwZRm1k, reason: not valid java name */
    private static final long[] m28983copyOfQwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$copyOf");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return pph.m31838constructorimpl(jArrCopyOf);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: copyOf-nggk6HY, reason: not valid java name */
    private static final short[] m28984copyOfnggk6HY(short[] sArr, int i) {
        md8.checkNotNullParameter(sArr, "$this$copyOf");
        short[] sArrCopyOf = Arrays.copyOf(sArr, i);
        md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return jqh.m30546constructorimpl(sArrCopyOf);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: copyOf-qFRl0hI, reason: not valid java name */
    private static final int[] m28985copyOfqFRl0hI(int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "$this$copyOf");
        int[] iArrCopyOf = Arrays.copyOf(iArr, i);
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return fph.m29585constructorimpl(iArrCopyOf);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: copyOf-r7IrZao, reason: not valid java name */
    private static final long[] m28986copyOfr7IrZao(long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "$this$copyOf");
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return pph.m31838constructorimpl(jArrCopyOf);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: copyOf-rL5Bavg, reason: not valid java name */
    private static final short[] m28987copyOfrL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$copyOf");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return jqh.m30546constructorimpl(sArrCopyOf);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: copyOfRange--nroSd4, reason: not valid java name */
    private static final long[] m28988copyOfRangenroSd4(long[] jArr, int i, int i2) {
        long[] jArrCopyOfRange;
        md8.checkNotNullParameter(jArr, "$this$copyOfRange");
        if (dxc.apiVersionIsAtLeast(1, 3, 0)) {
            jArrCopyOfRange = u70.copyOfRange(jArr, i, i2);
        } else {
            if (i2 > jArr.length) {
                throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + jArr.length);
            }
            jArrCopyOfRange = Arrays.copyOfRange(jArr, i, i2);
            md8.checkNotNull(jArrCopyOfRange);
        }
        return pph.m31838constructorimpl(jArrCopyOfRange);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: copyOfRange-4UcCI2c, reason: not valid java name */
    private static final byte[] m28989copyOfRange4UcCI2c(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange;
        md8.checkNotNullParameter(bArr, "$this$copyOfRange");
        if (dxc.apiVersionIsAtLeast(1, 3, 0)) {
            bArrCopyOfRange = u70.copyOfRange(bArr, i, i2);
        } else {
            if (i2 > bArr.length) {
                throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + bArr.length);
            }
            bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
            md8.checkNotNull(bArrCopyOfRange);
        }
        return hoh.m30083constructorimpl(bArrCopyOfRange);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: copyOfRange-Aa5vz7o, reason: not valid java name */
    private static final short[] m28990copyOfRangeAa5vz7o(short[] sArr, int i, int i2) {
        short[] sArrCopyOfRange;
        md8.checkNotNullParameter(sArr, "$this$copyOfRange");
        if (dxc.apiVersionIsAtLeast(1, 3, 0)) {
            sArrCopyOfRange = u70.copyOfRange(sArr, i, i2);
        } else {
            if (i2 > sArr.length) {
                throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + sArr.length);
            }
            sArrCopyOfRange = Arrays.copyOfRange(sArr, i, i2);
            md8.checkNotNull(sArrCopyOfRange);
        }
        return jqh.m30546constructorimpl(sArrCopyOfRange);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: copyOfRange-oBK06Vg, reason: not valid java name */
    private static final int[] m28991copyOfRangeoBK06Vg(int[] iArr, int i, int i2) {
        int[] iArrCopyOfRange;
        md8.checkNotNullParameter(iArr, "$this$copyOfRange");
        if (dxc.apiVersionIsAtLeast(1, 3, 0)) {
            iArrCopyOfRange = u70.copyOfRange(iArr, i, i2);
        } else {
            if (i2 > iArr.length) {
                throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + iArr.length);
            }
            iArrCopyOfRange = Arrays.copyOfRange(iArr, i, i2);
            md8.checkNotNull(iArrCopyOfRange);
        }
        return fph.m29585constructorimpl(iArrCopyOfRange);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: count-JOV_ifY, reason: not valid java name */
    private static final int m28992countJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$count");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        int i = 0;
        for (int i2 = 0; i2 < iM30089getSizeimpl; i2++) {
            if (qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: count-MShoTSo, reason: not valid java name */
    private static final int m28993countMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$count");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        int i = 0;
        for (int i2 = 0; i2 < iM31844getSizeimpl; i2++) {
            if (qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: count-jgv0xPQ, reason: not valid java name */
    private static final int m28994countjgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$count");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        int i = 0;
        for (int i2 = 0; i2 < iM29591getSizeimpl; i2++) {
            if (qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: count-xTcfx_M, reason: not valid java name */
    private static final int m28995countxTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$count");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        int i = 0;
        for (int i2 = 0; i2 < iM30552getSizeimpl; i2++) {
            if (qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: drop-PpDY95g, reason: not valid java name */
    public static final List<goh> m28996dropPpDY95g(@yfb byte[] bArr, int i) {
        md8.checkNotNullParameter(bArr, "$this$drop");
        if (i >= 0) {
            return m29524takeLastPpDY95g(bArr, kpd.coerceAtLeast(hoh.m30089getSizeimpl(bArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: drop-nggk6HY, reason: not valid java name */
    public static final List<iqh> m28997dropnggk6HY(@yfb short[] sArr, int i) {
        md8.checkNotNullParameter(sArr, "$this$drop");
        if (i >= 0) {
            return m29525takeLastnggk6HY(sArr, kpd.coerceAtLeast(jqh.m30552getSizeimpl(sArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: drop-qFRl0hI, reason: not valid java name */
    public static final List<woh> m28998dropqFRl0hI(@yfb int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "$this$drop");
        if (i >= 0) {
            return m29526takeLastqFRl0hI(iArr, kpd.coerceAtLeast(fph.m29591getSizeimpl(iArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: drop-r7IrZao, reason: not valid java name */
    public static final List<oph> m28999dropr7IrZao(@yfb long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "$this$drop");
        if (i >= 0) {
            return m29527takeLastr7IrZao(jArr, kpd.coerceAtLeast(pph.m31844getSizeimpl(jArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: dropLast-PpDY95g, reason: not valid java name */
    public static final List<goh> m29000dropLastPpDY95g(@yfb byte[] bArr, int i) {
        md8.checkNotNullParameter(bArr, "$this$dropLast");
        if (i >= 0) {
            return m29520takePpDY95g(bArr, kpd.coerceAtLeast(hoh.m30089getSizeimpl(bArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: dropLast-nggk6HY, reason: not valid java name */
    public static final List<iqh> m29001dropLastnggk6HY(@yfb short[] sArr, int i) {
        md8.checkNotNullParameter(sArr, "$this$dropLast");
        if (i >= 0) {
            return m29521takenggk6HY(sArr, kpd.coerceAtLeast(jqh.m30552getSizeimpl(sArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: dropLast-qFRl0hI, reason: not valid java name */
    public static final List<woh> m29002dropLastqFRl0hI(@yfb int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "$this$dropLast");
        if (i >= 0) {
            return m29522takeqFRl0hI(iArr, kpd.coerceAtLeast(fph.m29591getSizeimpl(iArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: dropLast-r7IrZao, reason: not valid java name */
    public static final List<oph> m29003dropLastr7IrZao(@yfb long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "$this$dropLast");
        if (i >= 0) {
            return m29523taker7IrZao(jArr, kpd.coerceAtLeast(pph.m31844getSizeimpl(jArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: dropLastWhile-JOV_ifY, reason: not valid java name */
    private static final List<goh> m29004dropLastWhileJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$dropLastWhile");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = e80.getLastIndex(bArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, lastIndex))).booleanValue()) {
                return m29520takePpDY95g(bArr, lastIndex + 1);
            }
        }
        return l82.emptyList();
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: dropLastWhile-MShoTSo, reason: not valid java name */
    private static final List<oph> m29005dropLastWhileMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$dropLastWhile");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = e80.getLastIndex(jArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, lastIndex))).booleanValue()) {
                return m29523taker7IrZao(jArr, lastIndex + 1);
            }
        }
        return l82.emptyList();
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: dropLastWhile-jgv0xPQ, reason: not valid java name */
    private static final List<woh> m29006dropLastWhilejgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$dropLastWhile");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = e80.getLastIndex(iArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, lastIndex))).booleanValue()) {
                return m29522takeqFRl0hI(iArr, lastIndex + 1);
            }
        }
        return l82.emptyList();
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: dropLastWhile-xTcfx_M, reason: not valid java name */
    private static final List<iqh> m29007dropLastWhilexTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$dropLastWhile");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = e80.getLastIndex(sArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, lastIndex))).booleanValue()) {
                return m29521takenggk6HY(sArr, lastIndex + 1);
            }
        }
        return l82.emptyList();
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: dropWhile-JOV_ifY, reason: not valid java name */
    private static final List<goh> m29008dropWhileJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$dropWhile");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        boolean z = false;
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            if (z) {
                arrayList.add(goh.m29780boximpl(bM30088getw2LRezQ));
            } else if (!qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ)).booleanValue()) {
                arrayList.add(goh.m29780boximpl(bM30088getw2LRezQ));
                z = true;
            }
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: dropWhile-MShoTSo, reason: not valid java name */
    private static final List<oph> m29009dropWhileMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$dropWhile");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        boolean z = false;
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            if (z) {
                arrayList.add(oph.m31527boximpl(jM31843getsVKNKU));
            } else if (!qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU)).booleanValue()) {
                arrayList.add(oph.m31527boximpl(jM31843getsVKNKU));
                z = true;
            }
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: dropWhile-jgv0xPQ, reason: not valid java name */
    private static final List<woh> m29010dropWhilejgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$dropWhile");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        boolean z = false;
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            if (z) {
                arrayList.add(woh.m32998boximpl(iM29590getpVg5ArA));
            } else if (!qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA)).booleanValue()) {
                arrayList.add(woh.m32998boximpl(iM29590getpVg5ArA));
                z = true;
            }
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: dropWhile-xTcfx_M, reason: not valid java name */
    private static final List<iqh> m29011dropWhilexTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$dropWhile");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        boolean z = false;
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            if (z) {
                arrayList.add(iqh.m30318boximpl(sM30551getMh2AYeg));
            } else if (!qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)).booleanValue()) {
                arrayList.add(iqh.m30318boximpl(sM30551getMh2AYeg));
                z = true;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ long[] m11015e(long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = pph.m31844getSizeimpl(jArr);
        }
        md8.checkNotNullParameter(jArr, "$this$copyInto");
        md8.checkNotNullParameter(jArr2, FirebaseAnalytics.C3552d.f23234z);
        u70.copyInto(jArr, jArr2, i, i2, i3);
        return jArr2;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: elementAtOrElse-CVVdw08, reason: not valid java name */
    private static final short m29012elementAtOrElseCVVdw08(short[] sArr, int i, qy6<? super Integer, iqh> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$elementAtOrElse");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= jqh.m30552getSizeimpl(sArr)) ? qy6Var.invoke(Integer.valueOf(i)).m30374unboximpl() : jqh.m30551getMh2AYeg(sArr, i);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: elementAtOrElse-QxvSvLU, reason: not valid java name */
    private static final int m29013elementAtOrElseQxvSvLU(int[] iArr, int i, qy6<? super Integer, woh> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$elementAtOrElse");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= fph.m29591getSizeimpl(iArr)) ? qy6Var.invoke(Integer.valueOf(i)).m33056unboximpl() : fph.m29590getpVg5ArA(iArr, i);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: elementAtOrElse-Xw8i6dc, reason: not valid java name */
    private static final long m29014elementAtOrElseXw8i6dc(long[] jArr, int i, qy6<? super Integer, oph> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$elementAtOrElse");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= pph.m31844getSizeimpl(jArr)) ? qy6Var.invoke(Integer.valueOf(i)).m31585unboximpl() : pph.m31843getsVKNKU(jArr, i);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: elementAtOrElse-cO-VybQ, reason: not valid java name */
    private static final byte m29015elementAtOrElsecOVybQ(byte[] bArr, int i, qy6<? super Integer, goh> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$elementAtOrElse");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= hoh.m30089getSizeimpl(bArr)) ? qy6Var.invoke(Integer.valueOf(i)).m29836unboximpl() : hoh.m30088getw2LRezQ(bArr, i);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: elementAtOrNull-PpDY95g, reason: not valid java name */
    private static final goh m29016elementAtOrNullPpDY95g(byte[] bArr, int i) {
        md8.checkNotNullParameter(bArr, "$this$elementAtOrNull");
        return m29136getOrNullPpDY95g(bArr, i);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: elementAtOrNull-nggk6HY, reason: not valid java name */
    private static final iqh m29017elementAtOrNullnggk6HY(short[] sArr, int i) {
        md8.checkNotNullParameter(sArr, "$this$elementAtOrNull");
        return m29137getOrNullnggk6HY(sArr, i);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: elementAtOrNull-qFRl0hI, reason: not valid java name */
    private static final woh m29018elementAtOrNullqFRl0hI(int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "$this$elementAtOrNull");
        return m29138getOrNullqFRl0hI(iArr, i);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: elementAtOrNull-r7IrZao, reason: not valid java name */
    private static final oph m29019elementAtOrNullr7IrZao(long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "$this$elementAtOrNull");
        return m29139getOrNullr7IrZao(jArr, i);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ short[] m11016f(short[] sArr, short[] sArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jqh.m30552getSizeimpl(sArr);
        }
        md8.checkNotNullParameter(sArr, "$this$copyInto");
        md8.checkNotNullParameter(sArr2, FirebaseAnalytics.C3552d.f23234z);
        u70.copyInto(sArr, sArr2, i, i2, i3);
        return sArr2;
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: fill-2fe2U9s, reason: not valid java name */
    public static final void m29020fill2fe2U9s(@yfb int[] iArr, int i, int i2, int i3) {
        md8.checkNotNullParameter(iArr, "$this$fill");
        u70.fill(iArr, i, i2, i3);
    }

    /* JADX INFO: renamed from: fill-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ void m29021fill2fe2U9s$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = fph.m29591getSizeimpl(iArr);
        }
        m29020fill2fe2U9s(iArr, i, i2, i3);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: fill-EtDCXyQ, reason: not valid java name */
    public static final void m29022fillEtDCXyQ(@yfb short[] sArr, short s, int i, int i2) {
        md8.checkNotNullParameter(sArr, "$this$fill");
        u70.fill(sArr, s, i, i2);
    }

    /* JADX INFO: renamed from: fill-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ void m29023fillEtDCXyQ$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jqh.m30552getSizeimpl(sArr);
        }
        m29022fillEtDCXyQ(sArr, s, i, i2);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: fill-K6DWlUc, reason: not valid java name */
    public static final void m29024fillK6DWlUc(@yfb long[] jArr, long j, int i, int i2) {
        md8.checkNotNullParameter(jArr, "$this$fill");
        u70.fill(jArr, j, i, i2);
    }

    /* JADX INFO: renamed from: fill-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ void m29025fillK6DWlUc$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = pph.m31844getSizeimpl(jArr);
        }
        m29024fillK6DWlUc(jArr, j, i, i2);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: fill-WpHrYlw, reason: not valid java name */
    public static final void m29026fillWpHrYlw(@yfb byte[] bArr, byte b, int i, int i2) {
        md8.checkNotNullParameter(bArr, "$this$fill");
        u70.fill(bArr, b, i, i2);
    }

    /* JADX INFO: renamed from: fill-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ void m29027fillWpHrYlw$default(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = hoh.m30089getSizeimpl(bArr);
        }
        m29026fillWpHrYlw(bArr, b, i, i2);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filter-JOV_ifY, reason: not valid java name */
    private static final List<goh> m29028filterJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$filter");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            if (qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ)).booleanValue()) {
                arrayList.add(goh.m29780boximpl(bM30088getw2LRezQ));
            }
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filter-MShoTSo, reason: not valid java name */
    private static final List<oph> m29029filterMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$filter");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            if (qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU)).booleanValue()) {
                arrayList.add(oph.m31527boximpl(jM31843getsVKNKU));
            }
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filter-jgv0xPQ, reason: not valid java name */
    private static final List<woh> m29030filterjgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$filter");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            if (qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA)).booleanValue()) {
                arrayList.add(woh.m32998boximpl(iM29590getpVg5ArA));
            }
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filter-xTcfx_M, reason: not valid java name */
    private static final List<iqh> m29031filterxTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$filter");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            if (qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)).booleanValue()) {
                arrayList.add(iqh.m30318boximpl(sM30551getMh2AYeg));
            }
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterIndexed-ELGow60, reason: not valid java name */
    private static final List<goh> m29032filterIndexedELGow60(byte[] bArr, gz6<? super Integer, ? super goh, Boolean> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$filterIndexed");
        md8.checkNotNullParameter(gz6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30089getSizeimpl) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), goh.m29780boximpl(bM30088getw2LRezQ)).booleanValue()) {
                arrayList.add(goh.m29780boximpl(bM30088getw2LRezQ));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterIndexed-WyvcNBI, reason: not valid java name */
    private static final List<woh> m29033filterIndexedWyvcNBI(int[] iArr, gz6<? super Integer, ? super woh, Boolean> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$filterIndexed");
        md8.checkNotNullParameter(gz6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        int i = 0;
        int i2 = 0;
        while (i < iM29591getSizeimpl) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), woh.m32998boximpl(iM29590getpVg5ArA)).booleanValue()) {
                arrayList.add(woh.m32998boximpl(iM29590getpVg5ArA));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterIndexed-s8dVfGU, reason: not valid java name */
    private static final List<oph> m29034filterIndexeds8dVfGU(long[] jArr, gz6<? super Integer, ? super oph, Boolean> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$filterIndexed");
        md8.checkNotNullParameter(gz6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        int i = 0;
        int i2 = 0;
        while (i < iM31844getSizeimpl) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), oph.m31527boximpl(jM31843getsVKNKU)).booleanValue()) {
                arrayList.add(oph.m31527boximpl(jM31843getsVKNKU));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterIndexed-xzaTVY8, reason: not valid java name */
    private static final List<iqh> m29035filterIndexedxzaTVY8(short[] sArr, gz6<? super Integer, ? super iqh, Boolean> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$filterIndexed");
        md8.checkNotNullParameter(gz6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30552getSizeimpl) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), iqh.m30318boximpl(sM30551getMh2AYeg)).booleanValue()) {
                arrayList.add(iqh.m30318boximpl(sM30551getMh2AYeg));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterIndexedTo--6EtJGI, reason: not valid java name */
    private static final <C extends Collection<? super woh>> C m29036filterIndexedTo6EtJGI(int[] iArr, C c, gz6<? super Integer, ? super woh, Boolean> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$filterIndexedTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "predicate");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        int i = 0;
        int i2 = 0;
        while (i < iM29591getSizeimpl) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), woh.m32998boximpl(iM29590getpVg5ArA)).booleanValue()) {
                c.add(woh.m32998boximpl(iM29590getpVg5ArA));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <C extends Collection<? super iqh>> C m29037filterIndexedToQqktQ3k(short[] sArr, C c, gz6<? super Integer, ? super iqh, Boolean> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$filterIndexedTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "predicate");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30552getSizeimpl) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), iqh.m30318boximpl(sM30551getMh2AYeg)).booleanValue()) {
                c.add(iqh.m30318boximpl(sM30551getMh2AYeg));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <C extends Collection<? super goh>> C m29038filterIndexedToeNpIKz8(byte[] bArr, C c, gz6<? super Integer, ? super goh, Boolean> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$filterIndexedTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "predicate");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30089getSizeimpl) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), goh.m29780boximpl(bM30088getw2LRezQ)).booleanValue()) {
                c.add(goh.m29780boximpl(bM30088getw2LRezQ));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <C extends Collection<? super oph>> C m29039filterIndexedTope2Q0Dw(long[] jArr, C c, gz6<? super Integer, ? super oph, Boolean> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$filterIndexedTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "predicate");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        int i = 0;
        int i2 = 0;
        while (i < iM31844getSizeimpl) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), oph.m31527boximpl(jM31843getsVKNKU)).booleanValue()) {
                c.add(oph.m31527boximpl(jM31843getsVKNKU));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterNot-JOV_ifY, reason: not valid java name */
    private static final List<goh> m29040filterNotJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$filterNot");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            if (!qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ)).booleanValue()) {
                arrayList.add(goh.m29780boximpl(bM30088getw2LRezQ));
            }
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterNot-MShoTSo, reason: not valid java name */
    private static final List<oph> m29041filterNotMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$filterNot");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            if (!qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU)).booleanValue()) {
                arrayList.add(oph.m31527boximpl(jM31843getsVKNKU));
            }
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterNot-jgv0xPQ, reason: not valid java name */
    private static final List<woh> m29042filterNotjgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$filterNot");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            if (!qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA)).booleanValue()) {
                arrayList.add(woh.m32998boximpl(iM29590getpVg5ArA));
            }
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterNot-xTcfx_M, reason: not valid java name */
    private static final List<iqh> m29043filterNotxTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$filterNot");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            if (!qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)).booleanValue()) {
                arrayList.add(iqh.m30318boximpl(sM30551getMh2AYeg));
            }
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterNotTo-HqK1JgA, reason: not valid java name */
    private static final <C extends Collection<? super oph>> C m29044filterNotToHqK1JgA(long[] jArr, C c, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$filterNotTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            if (!qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU)).booleanValue()) {
                c.add(oph.m31527boximpl(jM31843getsVKNKU));
            }
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterNotTo-oEOeDjA, reason: not valid java name */
    private static final <C extends Collection<? super iqh>> C m29045filterNotTooEOeDjA(short[] sArr, C c, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$filterNotTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            if (!qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)).booleanValue()) {
                c.add(iqh.m30318boximpl(sM30551getMh2AYeg));
            }
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterNotTo-wU5IKMo, reason: not valid java name */
    private static final <C extends Collection<? super woh>> C m29046filterNotTowU5IKMo(int[] iArr, C c, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$filterNotTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            if (!qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA)).booleanValue()) {
                c.add(woh.m32998boximpl(iM29590getpVg5ArA));
            }
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterNotTo-wzUQCXU, reason: not valid java name */
    private static final <C extends Collection<? super goh>> C m29047filterNotTowzUQCXU(byte[] bArr, C c, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$filterNotTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            if (!qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ)).booleanValue()) {
                c.add(goh.m29780boximpl(bM30088getw2LRezQ));
            }
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterTo-HqK1JgA, reason: not valid java name */
    private static final <C extends Collection<? super oph>> C m29048filterToHqK1JgA(long[] jArr, C c, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$filterTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            if (qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU)).booleanValue()) {
                c.add(oph.m31527boximpl(jM31843getsVKNKU));
            }
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterTo-oEOeDjA, reason: not valid java name */
    private static final <C extends Collection<? super iqh>> C m29049filterTooEOeDjA(short[] sArr, C c, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$filterTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            if (qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)).booleanValue()) {
                c.add(iqh.m30318boximpl(sM30551getMh2AYeg));
            }
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterTo-wU5IKMo, reason: not valid java name */
    private static final <C extends Collection<? super woh>> C m29050filterTowU5IKMo(int[] iArr, C c, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$filterTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            if (qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA)).booleanValue()) {
                c.add(woh.m32998boximpl(iM29590getpVg5ArA));
            }
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: filterTo-wzUQCXU, reason: not valid java name */
    private static final <C extends Collection<? super goh>> C m29051filterTowzUQCXU(byte[] bArr, C c, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$filterTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            if (qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ)).booleanValue()) {
                c.add(goh.m29780boximpl(bM30088getw2LRezQ));
            }
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: find-JOV_ifY, reason: not valid java name */
    private static final goh m29052findJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$find");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            if (qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ)).booleanValue()) {
                return goh.m29780boximpl(bM30088getw2LRezQ);
            }
        }
        return null;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: find-MShoTSo, reason: not valid java name */
    private static final oph m29053findMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$find");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            if (qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU)).booleanValue()) {
                return oph.m31527boximpl(jM31843getsVKNKU);
            }
        }
        return null;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: find-jgv0xPQ, reason: not valid java name */
    private static final woh m29054findjgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$find");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            if (qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA)).booleanValue()) {
                return woh.m32998boximpl(iM29590getpVg5ArA);
            }
        }
        return null;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: find-xTcfx_M, reason: not valid java name */
    private static final iqh m29055findxTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$find");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            if (qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)).booleanValue()) {
                return iqh.m30318boximpl(sM30551getMh2AYeg);
            }
        }
        return null;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: findLast-JOV_ifY, reason: not valid java name */
    private static final goh m29056findLastJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$findLast");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr) - 1;
        if (iM30089getSizeimpl >= 0) {
            while (true) {
                int i = iM30089getSizeimpl - 1;
                byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, iM30089getSizeimpl);
                if (qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ)).booleanValue()) {
                    return goh.m29780boximpl(bM30088getw2LRezQ);
                }
                if (i < 0) {
                    break;
                }
                iM30089getSizeimpl = i;
            }
        }
        return null;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: findLast-MShoTSo, reason: not valid java name */
    private static final oph m29057findLastMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$findLast");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr) - 1;
        if (iM31844getSizeimpl >= 0) {
            while (true) {
                int i = iM31844getSizeimpl - 1;
                long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, iM31844getSizeimpl);
                if (qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU)).booleanValue()) {
                    return oph.m31527boximpl(jM31843getsVKNKU);
                }
                if (i < 0) {
                    break;
                }
                iM31844getSizeimpl = i;
            }
        }
        return null;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: findLast-jgv0xPQ, reason: not valid java name */
    private static final woh m29058findLastjgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$findLast");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr) - 1;
        if (iM29591getSizeimpl >= 0) {
            while (true) {
                int i = iM29591getSizeimpl - 1;
                int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, iM29591getSizeimpl);
                if (qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA)).booleanValue()) {
                    return woh.m32998boximpl(iM29590getpVg5ArA);
                }
                if (i < 0) {
                    break;
                }
                iM29591getSizeimpl = i;
            }
        }
        return null;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: findLast-xTcfx_M, reason: not valid java name */
    private static final iqh m29059findLastxTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$findLast");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr) - 1;
        if (iM30552getSizeimpl >= 0) {
            while (true) {
                int i = iM30552getSizeimpl - 1;
                short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, iM30552getSizeimpl);
                if (qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)).booleanValue()) {
                    return iqh.m30318boximpl(sM30551getMh2AYeg);
                }
                if (i < 0) {
                    break;
                }
                iM30552getSizeimpl = i;
            }
        }
        return null;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: first--ajY-9A, reason: not valid java name */
    private static final int m29060firstajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$first");
        return woh.m33004constructorimpl(e80.first(iArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: first-GBYM_sE, reason: not valid java name */
    private static final byte m29061firstGBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$first");
        return goh.m29786constructorimpl(e80.first(bArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: first-JOV_ifY, reason: not valid java name */
    private static final byte m29062firstJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$first");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            if (qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ)).booleanValue()) {
                return bM30088getw2LRezQ;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: first-MShoTSo, reason: not valid java name */
    private static final long m29063firstMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$first");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            if (qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU)).booleanValue()) {
                return jM31843getsVKNKU;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: first-QwZRm1k, reason: not valid java name */
    private static final long m29064firstQwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$first");
        return oph.m31533constructorimpl(e80.first(jArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: first-jgv0xPQ, reason: not valid java name */
    private static final int m29065firstjgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$first");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            if (qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA)).booleanValue()) {
                return iM29590getpVg5ArA;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: first-rL5Bavg, reason: not valid java name */
    private static final short m29066firstrL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$first");
        return iqh.m30324constructorimpl(e80.first(sArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: first-xTcfx_M, reason: not valid java name */
    private static final short m29067firstxTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$first");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            if (qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)).booleanValue()) {
                return sM30551getMh2AYeg;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @gib
    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: firstOrNull--ajY-9A, reason: not valid java name */
    public static final woh m29068firstOrNullajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$firstOrNull");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        return woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0));
    }

    @gib
    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: firstOrNull-GBYM_sE, reason: not valid java name */
    public static final goh m29069firstOrNullGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$firstOrNull");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        return goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: firstOrNull-JOV_ifY, reason: not valid java name */
    private static final goh m29070firstOrNullJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$firstOrNull");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            if (qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ)).booleanValue()) {
                return goh.m29780boximpl(bM30088getw2LRezQ);
            }
        }
        return null;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: firstOrNull-MShoTSo, reason: not valid java name */
    private static final oph m29071firstOrNullMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$firstOrNull");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            if (qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU)).booleanValue()) {
                return oph.m31527boximpl(jM31843getsVKNKU);
            }
        }
        return null;
    }

    @gib
    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: firstOrNull-QwZRm1k, reason: not valid java name */
    public static final oph m29072firstOrNullQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$firstOrNull");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        return oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: firstOrNull-jgv0xPQ, reason: not valid java name */
    private static final woh m29073firstOrNulljgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$firstOrNull");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            if (qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA)).booleanValue()) {
                return woh.m32998boximpl(iM29590getpVg5ArA);
            }
        }
        return null;
    }

    @gib
    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: firstOrNull-rL5Bavg, reason: not valid java name */
    public static final iqh m29074firstOrNullrL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$firstOrNull");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        return iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: firstOrNull-xTcfx_M, reason: not valid java name */
    private static final iqh m29075firstOrNullxTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$firstOrNull");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            if (qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)).booleanValue()) {
                return iqh.m30318boximpl(sM30551getMh2AYeg);
            }
        }
        return null;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: flatMap-JOV_ifY, reason: not valid java name */
    private static final <R> List<R> m29076flatMapJOV_ifY(byte[] bArr, qy6<? super goh, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$flatMap");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            q82.addAll(arrayList, qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: flatMap-MShoTSo, reason: not valid java name */
    private static final <R> List<R> m29077flatMapMShoTSo(long[] jArr, qy6<? super oph, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$flatMap");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            q82.addAll(arrayList, qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: flatMap-jgv0xPQ, reason: not valid java name */
    private static final <R> List<R> m29078flatMapjgv0xPQ(int[] iArr, qy6<? super woh, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$flatMap");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            q82.addAll(arrayList, qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: flatMap-xTcfx_M, reason: not valid java name */
    private static final <R> List<R> m29079flatMapxTcfx_M(short[] sArr, qy6<? super iqh, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$flatMap");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            q82.addAll(arrayList, qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: flatMapIndexed-ELGow60, reason: not valid java name */
    private static final <R> List<R> m29080flatMapIndexedELGow60(byte[] bArr, gz6<? super Integer, ? super goh, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$flatMapIndexed");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30089getSizeimpl) {
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i2), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: flatMapIndexed-WyvcNBI, reason: not valid java name */
    private static final <R> List<R> m29081flatMapIndexedWyvcNBI(int[] iArr, gz6<? super Integer, ? super woh, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$flatMapIndexed");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        int i = 0;
        int i2 = 0;
        while (i < iM29591getSizeimpl) {
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i2), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: flatMapIndexed-s8dVfGU, reason: not valid java name */
    private static final <R> List<R> m29082flatMapIndexeds8dVfGU(long[] jArr, gz6<? super Integer, ? super oph, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$flatMapIndexed");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        int i = 0;
        int i2 = 0;
        while (i < iM31844getSizeimpl) {
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i2), oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: flatMapIndexed-xzaTVY8, reason: not valid java name */
    private static final <R> List<R> m29083flatMapIndexedxzaTVY8(short[] sArr, gz6<? super Integer, ? super iqh, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$flatMapIndexed");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30552getSizeimpl) {
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i2), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: flatMapIndexedTo--6EtJGI, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m29084flatMapIndexedTo6EtJGI(int[] iArr, C c, gz6<? super Integer, ? super woh, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$flatMapIndexedTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        int i = 0;
        int i2 = 0;
        while (i < iM29591getSizeimpl) {
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i2), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))));
            i++;
            i2++;
        }
        return c;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: flatMapIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m29085flatMapIndexedToQqktQ3k(short[] sArr, C c, gz6<? super Integer, ? super iqh, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$flatMapIndexedTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30552getSizeimpl) {
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i2), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))));
            i++;
            i2++;
        }
        return c;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: flatMapIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m29086flatMapIndexedToeNpIKz8(byte[] bArr, C c, gz6<? super Integer, ? super goh, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$flatMapIndexedTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30089getSizeimpl) {
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i2), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))));
            i++;
            i2++;
        }
        return c;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: flatMapIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m29087flatMapIndexedTope2Q0Dw(long[] jArr, C c, gz6<? super Integer, ? super oph, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$flatMapIndexedTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        int i = 0;
        int i2 = 0;
        while (i < iM31844getSizeimpl) {
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i2), oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))));
            i++;
            i2++;
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: flatMapTo-HqK1JgA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m29088flatMapToHqK1JgA(long[] jArr, C c, qy6<? super oph, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$flatMapTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            q82.addAll(c, qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))));
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: flatMapTo-oEOeDjA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m29089flatMapTooEOeDjA(short[] sArr, C c, qy6<? super iqh, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$flatMapTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            q82.addAll(c, qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))));
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: flatMapTo-wU5IKMo, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m29090flatMapTowU5IKMo(int[] iArr, C c, qy6<? super woh, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$flatMapTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            q82.addAll(c, qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))));
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: flatMapTo-wzUQCXU, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m29091flatMapTowzUQCXU(byte[] bArr, C c, qy6<? super goh, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$flatMapTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            q82.addAll(c, qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))));
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: fold-A8wKCXQ, reason: not valid java name */
    private static final <R> R m29092foldA8wKCXQ(long[] jArr, R r, gz6<? super R, ? super oph, ? extends R> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$fold");
        md8.checkNotNullParameter(gz6Var, "operation");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            r = gz6Var.invoke(r, oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
        }
        return r;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: fold-yXmHNn8, reason: not valid java name */
    private static final <R> R m29093foldyXmHNn8(byte[] bArr, R r, gz6<? super R, ? super goh, ? extends R> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$fold");
        md8.checkNotNullParameter(gz6Var, "operation");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            r = gz6Var.invoke(r, goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
        }
        return r;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: fold-zi1B2BA, reason: not valid java name */
    private static final <R> R m29094foldzi1B2BA(int[] iArr, R r, gz6<? super R, ? super woh, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$fold");
        md8.checkNotNullParameter(gz6Var, "operation");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            r = gz6Var.invoke(r, woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
        }
        return r;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: fold-zww5nb8, reason: not valid java name */
    private static final <R> R m29095foldzww5nb8(short[] sArr, R r, gz6<? super R, ? super iqh, ? extends R> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$fold");
        md8.checkNotNullParameter(gz6Var, "operation");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            r = gz6Var.invoke(r, iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
        }
        return r;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: foldIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> R m29096foldIndexed3iWJZGE(byte[] bArr, R r, kz6<? super Integer, ? super R, ? super goh, ? extends R> kz6Var) {
        md8.checkNotNullParameter(bArr, "$this$foldIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30089getSizeimpl) {
            r = kz6Var.invoke(Integer.valueOf(i2), r, goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
            i++;
            i2++;
        }
        return r;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: foldIndexed-bzxtMww, reason: not valid java name */
    private static final <R> R m29097foldIndexedbzxtMww(short[] sArr, R r, kz6<? super Integer, ? super R, ? super iqh, ? extends R> kz6Var) {
        md8.checkNotNullParameter(sArr, "$this$foldIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30552getSizeimpl) {
            r = kz6Var.invoke(Integer.valueOf(i2), r, iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
            i++;
            i2++;
        }
        return r;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: foldIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> R m29098foldIndexedmwnnOCs(long[] jArr, R r, kz6<? super Integer, ? super R, ? super oph, ? extends R> kz6Var) {
        md8.checkNotNullParameter(jArr, "$this$foldIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        int i = 0;
        int i2 = 0;
        while (i < iM31844getSizeimpl) {
            r = kz6Var.invoke(Integer.valueOf(i2), r, oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
            i++;
            i2++;
        }
        return r;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: foldIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> R m29099foldIndexedyVwIW0Q(int[] iArr, R r, kz6<? super Integer, ? super R, ? super woh, ? extends R> kz6Var) {
        md8.checkNotNullParameter(iArr, "$this$foldIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        int i = 0;
        int i2 = 0;
        while (i < iM29591getSizeimpl) {
            r = kz6Var.invoke(Integer.valueOf(i2), r, woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
            i++;
            i2++;
        }
        return r;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: foldRight-A8wKCXQ, reason: not valid java name */
    private static final <R> R m29100foldRightA8wKCXQ(long[] jArr, R r, gz6<? super oph, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$foldRight");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (int lastIndex = e80.getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r = gz6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, lastIndex)), r);
        }
        return r;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: foldRight-yXmHNn8, reason: not valid java name */
    private static final <R> R m29101foldRightyXmHNn8(byte[] bArr, R r, gz6<? super goh, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$foldRight");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (int lastIndex = e80.getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r = gz6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, lastIndex)), r);
        }
        return r;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: foldRight-zi1B2BA, reason: not valid java name */
    private static final <R> R m29102foldRightzi1B2BA(int[] iArr, R r, gz6<? super woh, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$foldRight");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (int lastIndex = e80.getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r = gz6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, lastIndex)), r);
        }
        return r;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: foldRight-zww5nb8, reason: not valid java name */
    private static final <R> R m29103foldRightzww5nb8(short[] sArr, R r, gz6<? super iqh, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$foldRight");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (int lastIndex = e80.getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r = gz6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, lastIndex)), r);
        }
        return r;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: foldRightIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> R m29104foldRightIndexed3iWJZGE(byte[] bArr, R r, kz6<? super Integer, ? super goh, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(bArr, "$this$foldRightIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        for (int lastIndex = e80.getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r = kz6Var.invoke(Integer.valueOf(lastIndex), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, lastIndex)), r);
        }
        return r;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: foldRightIndexed-bzxtMww, reason: not valid java name */
    private static final <R> R m29105foldRightIndexedbzxtMww(short[] sArr, R r, kz6<? super Integer, ? super iqh, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(sArr, "$this$foldRightIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        for (int lastIndex = e80.getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r = kz6Var.invoke(Integer.valueOf(lastIndex), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, lastIndex)), r);
        }
        return r;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: foldRightIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> R m29106foldRightIndexedmwnnOCs(long[] jArr, R r, kz6<? super Integer, ? super oph, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(jArr, "$this$foldRightIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        for (int lastIndex = e80.getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r = kz6Var.invoke(Integer.valueOf(lastIndex), oph.m31527boximpl(pph.m31843getsVKNKU(jArr, lastIndex)), r);
        }
        return r;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: foldRightIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> R m29107foldRightIndexedyVwIW0Q(int[] iArr, R r, kz6<? super Integer, ? super woh, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(iArr, "$this$foldRightIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        for (int lastIndex = e80.getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r = kz6Var.invoke(Integer.valueOf(lastIndex), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, lastIndex)), r);
        }
        return r;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: forEach-JOV_ifY, reason: not valid java name */
    private static final void m29108forEachJOV_ifY(byte[] bArr, qy6<? super goh, bth> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$forEach");
        md8.checkNotNullParameter(qy6Var, "action");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
        }
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: forEach-MShoTSo, reason: not valid java name */
    private static final void m29109forEachMShoTSo(long[] jArr, qy6<? super oph, bth> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$forEach");
        md8.checkNotNullParameter(qy6Var, "action");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
        }
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: forEach-jgv0xPQ, reason: not valid java name */
    private static final void m29110forEachjgv0xPQ(int[] iArr, qy6<? super woh, bth> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$forEach");
        md8.checkNotNullParameter(qy6Var, "action");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
        }
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: forEach-xTcfx_M, reason: not valid java name */
    private static final void m29111forEachxTcfx_M(short[] sArr, qy6<? super iqh, bth> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$forEach");
        md8.checkNotNullParameter(qy6Var, "action");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
        }
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: forEachIndexed-ELGow60, reason: not valid java name */
    private static final void m29112forEachIndexedELGow60(byte[] bArr, gz6<? super Integer, ? super goh, bth> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$forEachIndexed");
        md8.checkNotNullParameter(gz6Var, "action");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30089getSizeimpl) {
            gz6Var.invoke(Integer.valueOf(i2), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
            i++;
            i2++;
        }
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: forEachIndexed-WyvcNBI, reason: not valid java name */
    private static final void m29113forEachIndexedWyvcNBI(int[] iArr, gz6<? super Integer, ? super woh, bth> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$forEachIndexed");
        md8.checkNotNullParameter(gz6Var, "action");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        int i = 0;
        int i2 = 0;
        while (i < iM29591getSizeimpl) {
            gz6Var.invoke(Integer.valueOf(i2), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
            i++;
            i2++;
        }
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: forEachIndexed-s8dVfGU, reason: not valid java name */
    private static final void m29114forEachIndexeds8dVfGU(long[] jArr, gz6<? super Integer, ? super oph, bth> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$forEachIndexed");
        md8.checkNotNullParameter(gz6Var, "action");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        int i = 0;
        int i2 = 0;
        while (i < iM31844getSizeimpl) {
            gz6Var.invoke(Integer.valueOf(i2), oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
            i++;
            i2++;
        }
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: forEachIndexed-xzaTVY8, reason: not valid java name */
    private static final void m29115forEachIndexedxzaTVY8(short[] sArr, gz6<? super Integer, ? super iqh, bth> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$forEachIndexed");
        md8.checkNotNullParameter(gz6Var, "action");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30552getSizeimpl) {
            gz6Var.invoke(Integer.valueOf(i2), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
            i++;
            i2++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ byte[] m11017g(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = hoh.m30089getSizeimpl(bArr);
        }
        md8.checkNotNullParameter(bArr, "$this$copyInto");
        md8.checkNotNullParameter(bArr2, FirebaseAnalytics.C3552d.f23234z);
        u70.copyInto(bArr, bArr2, i, i2, i3);
        return bArr2;
    }

    @yfb
    /* JADX INFO: renamed from: getIndices--ajY-9A, reason: not valid java name */
    public static final f78 m29116getIndicesajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$indices");
        return e80.getIndices(iArr);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: getIndices--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m29117getIndicesajY9A$annotations(int[] iArr) {
    }

    @yfb
    /* JADX INFO: renamed from: getIndices-GBYM_sE, reason: not valid java name */
    public static final f78 m29118getIndicesGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$indices");
        return e80.getIndices(bArr);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: getIndices-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m29119getIndicesGBYM_sE$annotations(byte[] bArr) {
    }

    @yfb
    /* JADX INFO: renamed from: getIndices-QwZRm1k, reason: not valid java name */
    public static final f78 m29120getIndicesQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$indices");
        return e80.getIndices(jArr);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: getIndices-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m29121getIndicesQwZRm1k$annotations(long[] jArr) {
    }

    @yfb
    /* JADX INFO: renamed from: getIndices-rL5Bavg, reason: not valid java name */
    public static final f78 m29122getIndicesrL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$indices");
        return e80.getIndices(sArr);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: getIndices-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m29123getIndicesrL5Bavg$annotations(short[] sArr) {
    }

    /* JADX INFO: renamed from: getLastIndex--ajY-9A, reason: not valid java name */
    public static final int m29124getLastIndexajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$lastIndex");
        return e80.getLastIndex(iArr);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: getLastIndex--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m29125getLastIndexajY9A$annotations(int[] iArr) {
    }

    /* JADX INFO: renamed from: getLastIndex-GBYM_sE, reason: not valid java name */
    public static final int m29126getLastIndexGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$lastIndex");
        return e80.getLastIndex(bArr);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: getLastIndex-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m29127getLastIndexGBYM_sE$annotations(byte[] bArr) {
    }

    /* JADX INFO: renamed from: getLastIndex-QwZRm1k, reason: not valid java name */
    public static final int m29128getLastIndexQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$lastIndex");
        return e80.getLastIndex(jArr);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: getLastIndex-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m29129getLastIndexQwZRm1k$annotations(long[] jArr) {
    }

    /* JADX INFO: renamed from: getLastIndex-rL5Bavg, reason: not valid java name */
    public static final int m29130getLastIndexrL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$lastIndex");
        return e80.getLastIndex(sArr);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: getLastIndex-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m29131getLastIndexrL5Bavg$annotations(short[] sArr) {
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: getOrElse-CVVdw08, reason: not valid java name */
    private static final short m29132getOrElseCVVdw08(short[] sArr, int i, qy6<? super Integer, iqh> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$getOrElse");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= jqh.m30552getSizeimpl(sArr)) ? qy6Var.invoke(Integer.valueOf(i)).m30374unboximpl() : jqh.m30551getMh2AYeg(sArr, i);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: getOrElse-QxvSvLU, reason: not valid java name */
    private static final int m29133getOrElseQxvSvLU(int[] iArr, int i, qy6<? super Integer, woh> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$getOrElse");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= fph.m29591getSizeimpl(iArr)) ? qy6Var.invoke(Integer.valueOf(i)).m33056unboximpl() : fph.m29590getpVg5ArA(iArr, i);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: getOrElse-Xw8i6dc, reason: not valid java name */
    private static final long m29134getOrElseXw8i6dc(long[] jArr, int i, qy6<? super Integer, oph> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$getOrElse");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= pph.m31844getSizeimpl(jArr)) ? qy6Var.invoke(Integer.valueOf(i)).m31585unboximpl() : pph.m31843getsVKNKU(jArr, i);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: getOrElse-cO-VybQ, reason: not valid java name */
    private static final byte m29135getOrElsecOVybQ(byte[] bArr, int i, qy6<? super Integer, goh> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$getOrElse");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= hoh.m30089getSizeimpl(bArr)) ? qy6Var.invoke(Integer.valueOf(i)).m29836unboximpl() : hoh.m30088getw2LRezQ(bArr, i);
    }

    @gib
    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: getOrNull-PpDY95g, reason: not valid java name */
    public static final goh m29136getOrNullPpDY95g(@yfb byte[] bArr, int i) {
        md8.checkNotNullParameter(bArr, "$this$getOrNull");
        if (i < 0 || i >= hoh.m30089getSizeimpl(bArr)) {
            return null;
        }
        return goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i));
    }

    @gib
    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: getOrNull-nggk6HY, reason: not valid java name */
    public static final iqh m29137getOrNullnggk6HY(@yfb short[] sArr, int i) {
        md8.checkNotNullParameter(sArr, "$this$getOrNull");
        if (i < 0 || i >= jqh.m30552getSizeimpl(sArr)) {
            return null;
        }
        return iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i));
    }

    @gib
    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: getOrNull-qFRl0hI, reason: not valid java name */
    public static final woh m29138getOrNullqFRl0hI(@yfb int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "$this$getOrNull");
        if (i < 0 || i >= fph.m29591getSizeimpl(iArr)) {
            return null;
        }
        return woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i));
    }

    @gib
    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: getOrNull-r7IrZao, reason: not valid java name */
    public static final oph m29139getOrNullr7IrZao(@yfb long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "$this$getOrNull");
        if (i < 0 || i >= pph.m31844getSizeimpl(jArr)) {
            return null;
        }
        return oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: groupBy--_j2Y-Q, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m29140groupBy_j2YQ(long[] jArr, qy6<? super oph, ? extends K> qy6Var, qy6<? super oph, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(jArr, "$this$groupBy");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            K kInvoke = qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(qy6Var2.invoke(oph.m31527boximpl(jM31843getsVKNKU)));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: groupBy-3bBvP4M, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m29141groupBy3bBvP4M(short[] sArr, qy6<? super iqh, ? extends K> qy6Var, qy6<? super iqh, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(sArr, "$this$groupBy");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            K kInvoke = qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(qy6Var2.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: groupBy-JOV_ifY, reason: not valid java name */
    private static final <K> Map<K, List<goh>> m29142groupByJOV_ifY(byte[] bArr, qy6<? super goh, ? extends K> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$groupBy");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            K kInvoke = qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(goh.m29780boximpl(bM30088getw2LRezQ));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: groupBy-L4rlFek, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m29143groupByL4rlFek(int[] iArr, qy6<? super woh, ? extends K> qy6Var, qy6<? super woh, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(iArr, "$this$groupBy");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            K kInvoke = qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(qy6Var2.invoke(woh.m32998boximpl(iM29590getpVg5ArA)));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: groupBy-MShoTSo, reason: not valid java name */
    private static final <K> Map<K, List<oph>> m29144groupByMShoTSo(long[] jArr, qy6<? super oph, ? extends K> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$groupBy");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            K kInvoke = qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(oph.m31527boximpl(jM31843getsVKNKU));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: groupBy-bBsjw1Y, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m29145groupBybBsjw1Y(byte[] bArr, qy6<? super goh, ? extends K> qy6Var, qy6<? super goh, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(bArr, "$this$groupBy");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            K kInvoke = qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(qy6Var2.invoke(goh.m29780boximpl(bM30088getw2LRezQ)));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: groupBy-jgv0xPQ, reason: not valid java name */
    private static final <K> Map<K, List<woh>> m29146groupByjgv0xPQ(int[] iArr, qy6<? super woh, ? extends K> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$groupBy");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            K kInvoke = qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(woh.m32998boximpl(iM29590getpVg5ArA));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: groupBy-xTcfx_M, reason: not valid java name */
    private static final <K> Map<K, List<iqh>> m29147groupByxTcfx_M(short[] sArr, qy6<? super iqh, ? extends K> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$groupBy");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            K kInvoke = qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(iqh.m30318boximpl(sM30551getMh2AYeg));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: groupByTo-4D70W2E, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<woh>>> M m29148groupByTo4D70W2E(int[] iArr, M m, qy6<? super woh, ? extends K> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$groupByTo");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            K kInvoke = qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(woh.m32998boximpl(iM29590getpVg5ArA));
        }
        return m;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: groupByTo-H21X9dk, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<goh>>> M m29149groupByToH21X9dk(byte[] bArr, M m, qy6<? super goh, ? extends K> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$groupByTo");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            K kInvoke = qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(goh.m29780boximpl(bM30088getw2LRezQ));
        }
        return m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: groupByTo-JM6gNCM, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m29150groupByToJM6gNCM(int[] iArr, M m, qy6<? super woh, ? extends K> qy6Var, qy6<? super woh, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(iArr, "$this$groupByTo");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            K kInvoke = qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qy6Var2.invoke(woh.m32998boximpl(iM29590getpVg5ArA)));
        }
        return m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: groupByTo-QxgOkWg, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m29151groupByToQxgOkWg(long[] jArr, M m, qy6<? super oph, ? extends K> qy6Var, qy6<? super oph, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(jArr, "$this$groupByTo");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            K kInvoke = qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qy6Var2.invoke(oph.m31527boximpl(jM31843getsVKNKU)));
        }
        return m;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: groupByTo-X6OPwNk, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<oph>>> M m29152groupByToX6OPwNk(long[] jArr, M m, qy6<? super oph, ? extends K> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$groupByTo");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            K kInvoke = qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(oph.m31527boximpl(jM31843getsVKNKU));
        }
        return m;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: groupByTo-ciTST-8, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<iqh>>> M m29153groupByTociTST8(short[] sArr, M m, qy6<? super iqh, ? extends K> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$groupByTo");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            K kInvoke = qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(iqh.m30318boximpl(sM30551getMh2AYeg));
        }
        return m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: groupByTo-q8RuPII, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m29154groupByToq8RuPII(short[] sArr, M m, qy6<? super iqh, ? extends K> qy6Var, qy6<? super iqh, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(sArr, "$this$groupByTo");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            K kInvoke = qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qy6Var2.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)));
        }
        return m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: groupByTo-qOZmbk8, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m29155groupByToqOZmbk8(byte[] bArr, M m, qy6<? super goh, ? extends K> qy6Var, qy6<? super goh, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(bArr, "$this$groupByTo");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            K kInvoke = qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qy6Var2.invoke(goh.m29780boximpl(bM30088getw2LRezQ)));
        }
        return m;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int[] m11018h(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fph.m29591getSizeimpl(iArr);
        }
        md8.checkNotNullParameter(iArr, "$this$copyInto");
        md8.checkNotNullParameter(iArr2, FirebaseAnalytics.C3552d.f23234z);
        u70.copyInto(iArr, iArr2, i, i2, i3);
        return iArr2;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: indexOf-3uqUaXg, reason: not valid java name */
    private static final int m29156indexOf3uqUaXg(long[] jArr, long j) {
        md8.checkNotNullParameter(jArr, "$this$indexOf");
        return e80.indexOf(jArr, j);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: indexOf-XzdR7RA, reason: not valid java name */
    private static final int m29157indexOfXzdR7RA(short[] sArr, short s) {
        md8.checkNotNullParameter(sArr, "$this$indexOf");
        return e80.indexOf(sArr, s);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: indexOf-gMuBH34, reason: not valid java name */
    private static final int m29158indexOfgMuBH34(byte[] bArr, byte b) {
        md8.checkNotNullParameter(bArr, "$this$indexOf");
        return e80.indexOf(bArr, b);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: indexOf-uWY9BYg, reason: not valid java name */
    private static final int m29159indexOfuWY9BYg(int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "$this$indexOf");
        return e80.indexOf(iArr, i);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: indexOfFirst-JOV_ifY, reason: not valid java name */
    private static final int m29160indexOfFirstJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$indexOfFirst");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (qy6Var.invoke(goh.m29780boximpl(goh.m29786constructorimpl(bArr[i]))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: indexOfFirst-MShoTSo, reason: not valid java name */
    private static final int m29161indexOfFirstMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$indexOfFirst");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (qy6Var.invoke(oph.m31527boximpl(oph.m31533constructorimpl(jArr[i]))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: indexOfFirst-jgv0xPQ, reason: not valid java name */
    private static final int m29162indexOfFirstjgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$indexOfFirst");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (qy6Var.invoke(woh.m32998boximpl(woh.m33004constructorimpl(iArr[i]))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: indexOfFirst-xTcfx_M, reason: not valid java name */
    private static final int m29163indexOfFirstxTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$indexOfFirst");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (qy6Var.invoke(iqh.m30318boximpl(iqh.m30324constructorimpl(sArr[i]))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: indexOfLast-JOV_ifY, reason: not valid java name */
    private static final int m29164indexOfLastJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$indexOfLast");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (qy6Var.invoke(goh.m29780boximpl(goh.m29786constructorimpl(bArr[length]))).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: indexOfLast-MShoTSo, reason: not valid java name */
    private static final int m29165indexOfLastMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$indexOfLast");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (qy6Var.invoke(oph.m31527boximpl(oph.m31533constructorimpl(jArr[length]))).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: indexOfLast-jgv0xPQ, reason: not valid java name */
    private static final int m29166indexOfLastjgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$indexOfLast");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (qy6Var.invoke(woh.m32998boximpl(woh.m33004constructorimpl(iArr[length]))).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: indexOfLast-xTcfx_M, reason: not valid java name */
    private static final int m29167indexOfLastxTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$indexOfLast");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (qy6Var.invoke(iqh.m30318boximpl(iqh.m30324constructorimpl(sArr[length]))).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: last--ajY-9A, reason: not valid java name */
    private static final int m29168lastajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$last");
        return woh.m33004constructorimpl(e80.last(iArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: last-GBYM_sE, reason: not valid java name */
    private static final byte m29169lastGBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$last");
        return goh.m29786constructorimpl(e80.last(bArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: last-JOV_ifY, reason: not valid java name */
    private static final byte m29170lastJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$last");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr) - 1;
        if (iM30089getSizeimpl >= 0) {
            while (true) {
                int i = iM30089getSizeimpl - 1;
                byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, iM30089getSizeimpl);
                if (!qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    iM30089getSizeimpl = i;
                } else {
                    return bM30088getw2LRezQ;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: last-MShoTSo, reason: not valid java name */
    private static final long m29171lastMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$last");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr) - 1;
        if (iM31844getSizeimpl >= 0) {
            while (true) {
                int i = iM31844getSizeimpl - 1;
                long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, iM31844getSizeimpl);
                if (!qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    iM31844getSizeimpl = i;
                } else {
                    return jM31843getsVKNKU;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: last-QwZRm1k, reason: not valid java name */
    private static final long m29172lastQwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$last");
        return oph.m31533constructorimpl(e80.last(jArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: last-jgv0xPQ, reason: not valid java name */
    private static final int m29173lastjgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$last");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr) - 1;
        if (iM29591getSizeimpl >= 0) {
            while (true) {
                int i = iM29591getSizeimpl - 1;
                int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, iM29591getSizeimpl);
                if (!qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    iM29591getSizeimpl = i;
                } else {
                    return iM29590getpVg5ArA;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: last-rL5Bavg, reason: not valid java name */
    private static final short m29174lastrL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$last");
        return iqh.m30324constructorimpl(e80.last(sArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: last-xTcfx_M, reason: not valid java name */
    private static final short m29175lastxTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$last");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr) - 1;
        if (iM30552getSizeimpl >= 0) {
            while (true) {
                int i = iM30552getSizeimpl - 1;
                short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, iM30552getSizeimpl);
                if (!qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    iM30552getSizeimpl = i;
                } else {
                    return sM30551getMh2AYeg;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: lastIndexOf-3uqUaXg, reason: not valid java name */
    private static final int m29176lastIndexOf3uqUaXg(long[] jArr, long j) {
        md8.checkNotNullParameter(jArr, "$this$lastIndexOf");
        return e80.lastIndexOf(jArr, j);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: lastIndexOf-XzdR7RA, reason: not valid java name */
    private static final int m29177lastIndexOfXzdR7RA(short[] sArr, short s) {
        md8.checkNotNullParameter(sArr, "$this$lastIndexOf");
        return e80.lastIndexOf(sArr, s);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: lastIndexOf-gMuBH34, reason: not valid java name */
    private static final int m29178lastIndexOfgMuBH34(byte[] bArr, byte b) {
        md8.checkNotNullParameter(bArr, "$this$lastIndexOf");
        return e80.lastIndexOf(bArr, b);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: lastIndexOf-uWY9BYg, reason: not valid java name */
    private static final int m29179lastIndexOfuWY9BYg(int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "$this$lastIndexOf");
        return e80.lastIndexOf(iArr, i);
    }

    @gib
    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: lastOrNull--ajY-9A, reason: not valid java name */
    public static final woh m29180lastOrNullajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$lastOrNull");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        return woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, fph.m29591getSizeimpl(iArr) - 1));
    }

    @gib
    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: lastOrNull-GBYM_sE, reason: not valid java name */
    public static final goh m29181lastOrNullGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$lastOrNull");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        return goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, hoh.m30089getSizeimpl(bArr) - 1));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: lastOrNull-JOV_ifY, reason: not valid java name */
    private static final goh m29182lastOrNullJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$lastOrNull");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr) - 1;
        if (iM30089getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i = iM30089getSizeimpl - 1;
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, iM30089getSizeimpl);
            if (qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ)).booleanValue()) {
                return goh.m29780boximpl(bM30088getw2LRezQ);
            }
            if (i < 0) {
                return null;
            }
            iM30089getSizeimpl = i;
        }
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: lastOrNull-MShoTSo, reason: not valid java name */
    private static final oph m29183lastOrNullMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$lastOrNull");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr) - 1;
        if (iM31844getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i = iM31844getSizeimpl - 1;
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, iM31844getSizeimpl);
            if (qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU)).booleanValue()) {
                return oph.m31527boximpl(jM31843getsVKNKU);
            }
            if (i < 0) {
                return null;
            }
            iM31844getSizeimpl = i;
        }
    }

    @gib
    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: lastOrNull-QwZRm1k, reason: not valid java name */
    public static final oph m29184lastOrNullQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$lastOrNull");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        return oph.m31527boximpl(pph.m31843getsVKNKU(jArr, pph.m31844getSizeimpl(jArr) - 1));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: lastOrNull-jgv0xPQ, reason: not valid java name */
    private static final woh m29185lastOrNulljgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$lastOrNull");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr) - 1;
        if (iM29591getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i = iM29591getSizeimpl - 1;
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, iM29591getSizeimpl);
            if (qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA)).booleanValue()) {
                return woh.m32998boximpl(iM29590getpVg5ArA);
            }
            if (i < 0) {
                return null;
            }
            iM29591getSizeimpl = i;
        }
    }

    @gib
    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: lastOrNull-rL5Bavg, reason: not valid java name */
    public static final iqh m29186lastOrNullrL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$lastOrNull");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        return iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, jqh.m30552getSizeimpl(sArr) - 1));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: lastOrNull-xTcfx_M, reason: not valid java name */
    private static final iqh m29187lastOrNullxTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$lastOrNull");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr) - 1;
        if (iM30552getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i = iM30552getSizeimpl - 1;
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, iM30552getSizeimpl);
            if (qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)).booleanValue()) {
                return iqh.m30318boximpl(sM30551getMh2AYeg);
            }
            if (i < 0) {
                return null;
            }
            iM30552getSizeimpl = i;
        }
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: map-JOV_ifY, reason: not valid java name */
    private static final <R> List<R> m29188mapJOV_ifY(byte[] bArr, qy6<? super goh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$map");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList(hoh.m30089getSizeimpl(bArr));
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            arrayList.add(qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: map-MShoTSo, reason: not valid java name */
    private static final <R> List<R> m29189mapMShoTSo(long[] jArr, qy6<? super oph, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$map");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList(pph.m31844getSizeimpl(jArr));
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            arrayList.add(qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: map-jgv0xPQ, reason: not valid java name */
    private static final <R> List<R> m29190mapjgv0xPQ(int[] iArr, qy6<? super woh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$map");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList(fph.m29591getSizeimpl(iArr));
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            arrayList.add(qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: map-xTcfx_M, reason: not valid java name */
    private static final <R> List<R> m29191mapxTcfx_M(short[] sArr, qy6<? super iqh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$map");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList(jqh.m30552getSizeimpl(sArr));
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            arrayList.add(qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: mapIndexed-ELGow60, reason: not valid java name */
    private static final <R> List<R> m29192mapIndexedELGow60(byte[] bArr, gz6<? super Integer, ? super goh, ? extends R> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$mapIndexed");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList(hoh.m30089getSizeimpl(bArr));
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30089getSizeimpl) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(i2), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: mapIndexed-WyvcNBI, reason: not valid java name */
    private static final <R> List<R> m29193mapIndexedWyvcNBI(int[] iArr, gz6<? super Integer, ? super woh, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$mapIndexed");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList(fph.m29591getSizeimpl(iArr));
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        int i = 0;
        int i2 = 0;
        while (i < iM29591getSizeimpl) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(i2), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: mapIndexed-s8dVfGU, reason: not valid java name */
    private static final <R> List<R> m29194mapIndexeds8dVfGU(long[] jArr, gz6<? super Integer, ? super oph, ? extends R> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$mapIndexed");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList(pph.m31844getSizeimpl(jArr));
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        int i = 0;
        int i2 = 0;
        while (i < iM31844getSizeimpl) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(i2), oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: mapIndexed-xzaTVY8, reason: not valid java name */
    private static final <R> List<R> m29195mapIndexedxzaTVY8(short[] sArr, gz6<? super Integer, ? super iqh, ? extends R> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$mapIndexed");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList(jqh.m30552getSizeimpl(sArr));
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30552getSizeimpl) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(i2), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: mapIndexedTo--6EtJGI, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m29196mapIndexedTo6EtJGI(int[] iArr, C c, gz6<? super Integer, ? super woh, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$mapIndexedTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        int i = 0;
        int i2 = 0;
        while (i < iM29591getSizeimpl) {
            c.add(gz6Var.invoke(Integer.valueOf(i2), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))));
            i++;
            i2++;
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: mapIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m29197mapIndexedToQqktQ3k(short[] sArr, C c, gz6<? super Integer, ? super iqh, ? extends R> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$mapIndexedTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30552getSizeimpl) {
            c.add(gz6Var.invoke(Integer.valueOf(i2), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))));
            i++;
            i2++;
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: mapIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m29198mapIndexedToeNpIKz8(byte[] bArr, C c, gz6<? super Integer, ? super goh, ? extends R> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$mapIndexedTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30089getSizeimpl) {
            c.add(gz6Var.invoke(Integer.valueOf(i2), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))));
            i++;
            i2++;
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: mapIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m29199mapIndexedTope2Q0Dw(long[] jArr, C c, gz6<? super Integer, ? super oph, ? extends R> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$mapIndexedTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        int i = 0;
        int i2 = 0;
        while (i < iM31844getSizeimpl) {
            c.add(gz6Var.invoke(Integer.valueOf(i2), oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))));
            i++;
            i2++;
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: mapTo-HqK1JgA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m29200mapToHqK1JgA(long[] jArr, C c, qy6<? super oph, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$mapTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            c.add(qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))));
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: mapTo-oEOeDjA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m29201mapTooEOeDjA(short[] sArr, C c, qy6<? super iqh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$mapTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            c.add(qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))));
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: mapTo-wU5IKMo, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m29202mapTowU5IKMo(int[] iArr, C c, qy6<? super woh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$mapTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            c.add(qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))));
        }
        return c;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: mapTo-wzUQCXU, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m29203mapTowzUQCXU(byte[] bArr, C c, qy6<? super goh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$mapTo");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            c.add(qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))));
        }
        return c;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxByOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> goh m29204maxByOrNullJOV_ifY(byte[] bArr, qy6<? super goh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$maxByOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
        int lastIndex = e80.getLastIndex(bArr);
        if (lastIndex == 0) {
            return goh.m29780boximpl(bM30088getw2LRezQ);
        }
        R rInvoke = qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM30088getw2LRezQ2 = hoh.m30088getw2LRezQ(bArr, i);
                R rInvoke2 = qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    bM30088getw2LRezQ = bM30088getw2LRezQ2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return goh.m29780boximpl(bM30088getw2LRezQ);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxByOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> oph m29205maxByOrNullMShoTSo(long[] jArr, qy6<? super oph, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$maxByOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
        int lastIndex = e80.getLastIndex(jArr);
        if (lastIndex == 0) {
            return oph.m31527boximpl(jM31843getsVKNKU);
        }
        R rInvoke = qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM31843getsVKNKU2 = pph.m31843getsVKNKU(jArr, i);
                R rInvoke2 = qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    jM31843getsVKNKU = jM31843getsVKNKU2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return oph.m31527boximpl(jM31843getsVKNKU);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxByOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> woh m29206maxByOrNulljgv0xPQ(int[] iArr, qy6<? super woh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$maxByOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        if (lastIndex == 0) {
            return woh.m32998boximpl(iM29590getpVg5ArA);
        }
        R rInvoke = qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM29590getpVg5ArA2 = fph.m29590getpVg5ArA(iArr, i);
                R rInvoke2 = qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    iM29590getpVg5ArA = iM29590getpVg5ArA2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return woh.m32998boximpl(iM29590getpVg5ArA);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxByOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> iqh m29207maxByOrNullxTcfx_M(short[] sArr, qy6<? super iqh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$maxByOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
        int lastIndex = e80.getLastIndex(sArr);
        if (lastIndex == 0) {
            return iqh.m30318boximpl(sM30551getMh2AYeg);
        }
        R rInvoke = qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM30551getMh2AYeg2 = jqh.m30551getMh2AYeg(sArr, i);
                R rInvoke2 = qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    sM30551getMh2AYeg = sM30551getMh2AYeg2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iqh.m30318boximpl(sM30551getMh2AYeg);
    }

    @jjf(version = "1.7")
    @t28
    @xn8(name = "maxByOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> int m29209maxByOrThrowU(int[] iArr, qy6<? super woh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$maxBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        if (lastIndex == 0) {
            return iM29590getpVg5ArA;
        }
        R rInvoke = qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM29590getpVg5ArA2 = fph.m29590getpVg5ArA(iArr, i);
                R rInvoke2 = qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    iM29590getpVg5ArA = iM29590getpVg5ArA2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iM29590getpVg5ArA;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final double m29212maxOfJOV_ifY(byte[] bArr, qy6<? super goh, Double> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$maxOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (hoh.m30091isEmptyimpl(bArr)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0))).doubleValue();
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final double m29215maxOfMShoTSo(long[] jArr, qy6<? super oph, Double> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$maxOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (pph.m31846isEmptyimpl(jArr)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0))).doubleValue();
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final double m29218maxOfjgv0xPQ(int[] iArr, qy6<? super woh, Double> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$maxOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0))).doubleValue();
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final double m29221maxOfxTcfx_M(short[] sArr, qy6<? super iqh, Double> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$maxOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jqh.m30554isEmptyimpl(sArr)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0))).doubleValue();
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Double m29225maxOfOrNullJOV_ifY(byte[] bArr, qy6<? super goh, Double> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$maxOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0))).doubleValue();
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final Double m29228maxOfOrNullMShoTSo(long[] jArr, qy6<? super oph, Double> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$maxOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0))).doubleValue();
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Double m29231maxOfOrNulljgv0xPQ(int[] iArr, qy6<? super woh, Double> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$maxOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0))).doubleValue();
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Double m29234maxOfOrNullxTcfx_M(short[] sArr, qy6<? super iqh, Double> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$maxOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0))).doubleValue();
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfWith-5NtCtWE, reason: not valid java name */
    private static final <R> R m29236maxOfWith5NtCtWE(long[] jArr, Comparator<? super R> comparator, qy6<? super oph, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$maxOfWith");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (pph.m31846isEmptyimpl(jArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0)));
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfWith-LTi4i_s, reason: not valid java name */
    private static final <R> R m29237maxOfWithLTi4i_s(byte[] bArr, Comparator<? super R> comparator, qy6<? super goh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$maxOfWith");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (hoh.m30091isEmptyimpl(bArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0)));
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfWith-l8EHGbQ, reason: not valid java name */
    private static final <R> R m29238maxOfWithl8EHGbQ(short[] sArr, Comparator<? super R> comparator, qy6<? super iqh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$maxOfWith");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jqh.m30554isEmptyimpl(sArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0)));
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfWith-myNOsp4, reason: not valid java name */
    private static final <R> R m29239maxOfWithmyNOsp4(int[] iArr, Comparator<? super R> comparator, qy6<? super woh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$maxOfWith");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0)));
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfWithOrNull-5NtCtWE, reason: not valid java name */
    private static final <R> R m29240maxOfWithOrNull5NtCtWE(long[] jArr, Comparator<? super R> comparator, qy6<? super oph, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$maxOfWithOrNull");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        R rInvoke = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0)));
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfWithOrNull-LTi4i_s, reason: not valid java name */
    private static final <R> R m29241maxOfWithOrNullLTi4i_s(byte[] bArr, Comparator<? super R> comparator, qy6<? super goh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$maxOfWithOrNull");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        R rInvoke = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0)));
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfWithOrNull-l8EHGbQ, reason: not valid java name */
    private static final <R> R m29242maxOfWithOrNulll8EHGbQ(short[] sArr, Comparator<? super R> comparator, qy6<? super iqh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$maxOfWithOrNull");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        R rInvoke = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0)));
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfWithOrNull-myNOsp4, reason: not valid java name */
    private static final <R> R m29243maxOfWithOrNullmyNOsp4(int[] iArr, Comparator<? super R> comparator, qy6<? super woh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$maxOfWithOrNull");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        R rInvoke = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0)));
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: maxOrNull--ajY-9A, reason: not valid java name */
    public static final woh m29244maxOrNullajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$maxOrNull");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM29590getpVg5ArA2 = fph.m29590getpVg5ArA(iArr, i);
                if (Integer.compareUnsigned(iM29590getpVg5ArA, iM29590getpVg5ArA2) < 0) {
                    iM29590getpVg5ArA = iM29590getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return woh.m32998boximpl(iM29590getpVg5ArA);
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: maxOrNull-GBYM_sE, reason: not valid java name */
    public static final goh m29245maxOrNullGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$maxOrNull");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM30088getw2LRezQ2 = hoh.m30088getw2LRezQ(bArr, i);
                if (md8.compare(bM30088getw2LRezQ & 255, bM30088getw2LRezQ2 & 255) < 0) {
                    bM30088getw2LRezQ = bM30088getw2LRezQ2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return goh.m29780boximpl(bM30088getw2LRezQ);
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: maxOrNull-QwZRm1k, reason: not valid java name */
    public static final oph m29246maxOrNullQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$maxOrNull");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM31843getsVKNKU2 = pph.m31843getsVKNKU(jArr, i);
                if (Long.compareUnsigned(jM31843getsVKNKU, jM31843getsVKNKU2) < 0) {
                    jM31843getsVKNKU = jM31843getsVKNKU2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return oph.m31527boximpl(jM31843getsVKNKU);
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: maxOrNull-rL5Bavg, reason: not valid java name */
    public static final iqh m29247maxOrNullrL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$maxOrNull");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM30551getMh2AYeg2 = jqh.m30551getMh2AYeg(sArr, i);
                if (md8.compare(sM30551getMh2AYeg & iqh.f48007d, 65535 & sM30551getMh2AYeg2) < 0) {
                    sM30551getMh2AYeg = sM30551getMh2AYeg2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iqh.m30318boximpl(sM30551getMh2AYeg);
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final int m29249maxOrThrowU(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$max");
        if (fph.m29593isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM29590getpVg5ArA2 = fph.m29590getpVg5ArA(iArr, i);
                if (Integer.compareUnsigned(iM29590getpVg5ArA, iM29590getpVg5ArA2) < 0) {
                    iM29590getpVg5ArA = iM29590getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iM29590getpVg5ArA;
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: maxWithOrNull-XMRcp5o, reason: not valid java name */
    public static final goh m29252maxWithOrNullXMRcp5o(@yfb byte[] bArr, @yfb Comparator<? super goh> comparator) {
        md8.checkNotNullParameter(bArr, "$this$maxWithOrNull");
        md8.checkNotNullParameter(comparator, "comparator");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM30088getw2LRezQ2 = hoh.m30088getw2LRezQ(bArr, i);
                if (comparator.compare(goh.m29780boximpl(bM30088getw2LRezQ), goh.m29780boximpl(bM30088getw2LRezQ2)) < 0) {
                    bM30088getw2LRezQ = bM30088getw2LRezQ2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return goh.m29780boximpl(bM30088getw2LRezQ);
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: maxWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final woh m29253maxWithOrNullYmdZ_VM(@yfb int[] iArr, @yfb Comparator<? super woh> comparator) {
        md8.checkNotNullParameter(iArr, "$this$maxWithOrNull");
        md8.checkNotNullParameter(comparator, "comparator");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM29590getpVg5ArA2 = fph.m29590getpVg5ArA(iArr, i);
                if (comparator.compare(woh.m32998boximpl(iM29590getpVg5ArA), woh.m32998boximpl(iM29590getpVg5ArA2)) < 0) {
                    iM29590getpVg5ArA = iM29590getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return woh.m32998boximpl(iM29590getpVg5ArA);
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: maxWithOrNull-eOHTfZs, reason: not valid java name */
    public static final iqh m29254maxWithOrNulleOHTfZs(@yfb short[] sArr, @yfb Comparator<? super iqh> comparator) {
        md8.checkNotNullParameter(sArr, "$this$maxWithOrNull");
        md8.checkNotNullParameter(comparator, "comparator");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM30551getMh2AYeg2 = jqh.m30551getMh2AYeg(sArr, i);
                if (comparator.compare(iqh.m30318boximpl(sM30551getMh2AYeg), iqh.m30318boximpl(sM30551getMh2AYeg2)) < 0) {
                    sM30551getMh2AYeg = sM30551getMh2AYeg2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iqh.m30318boximpl(sM30551getMh2AYeg);
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: maxWithOrNull-zrEWJaI, reason: not valid java name */
    public static final oph m29255maxWithOrNullzrEWJaI(@yfb long[] jArr, @yfb Comparator<? super oph> comparator) {
        md8.checkNotNullParameter(jArr, "$this$maxWithOrNull");
        md8.checkNotNullParameter(comparator, "comparator");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM31843getsVKNKU2 = pph.m31843getsVKNKU(jArr, i);
                if (comparator.compare(oph.m31527boximpl(jM31843getsVKNKU), oph.m31527boximpl(jM31843getsVKNKU2)) < 0) {
                    jM31843getsVKNKU = jM31843getsVKNKU2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return oph.m31527boximpl(jM31843getsVKNKU);
    }

    @jjf(version = "1.7")
    @xn8(name = "maxWithOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final int m29257maxWithOrThrowU(@yfb int[] iArr, @yfb Comparator<? super woh> comparator) {
        md8.checkNotNullParameter(iArr, "$this$maxWith");
        md8.checkNotNullParameter(comparator, "comparator");
        if (fph.m29593isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM29590getpVg5ArA2 = fph.m29590getpVg5ArA(iArr, i);
                if (comparator.compare(woh.m32998boximpl(iM29590getpVg5ArA), woh.m32998boximpl(iM29590getpVg5ArA2)) < 0) {
                    iM29590getpVg5ArA = iM29590getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iM29590getpVg5ArA;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minByOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> goh m29260minByOrNullJOV_ifY(byte[] bArr, qy6<? super goh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$minByOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
        int lastIndex = e80.getLastIndex(bArr);
        if (lastIndex == 0) {
            return goh.m29780boximpl(bM30088getw2LRezQ);
        }
        R rInvoke = qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM30088getw2LRezQ2 = hoh.m30088getw2LRezQ(bArr, i);
                R rInvoke2 = qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    bM30088getw2LRezQ = bM30088getw2LRezQ2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return goh.m29780boximpl(bM30088getw2LRezQ);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minByOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> oph m29261minByOrNullMShoTSo(long[] jArr, qy6<? super oph, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$minByOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
        int lastIndex = e80.getLastIndex(jArr);
        if (lastIndex == 0) {
            return oph.m31527boximpl(jM31843getsVKNKU);
        }
        R rInvoke = qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM31843getsVKNKU2 = pph.m31843getsVKNKU(jArr, i);
                R rInvoke2 = qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    jM31843getsVKNKU = jM31843getsVKNKU2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return oph.m31527boximpl(jM31843getsVKNKU);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minByOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> woh m29262minByOrNulljgv0xPQ(int[] iArr, qy6<? super woh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$minByOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        if (lastIndex == 0) {
            return woh.m32998boximpl(iM29590getpVg5ArA);
        }
        R rInvoke = qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM29590getpVg5ArA2 = fph.m29590getpVg5ArA(iArr, i);
                R rInvoke2 = qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    iM29590getpVg5ArA = iM29590getpVg5ArA2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return woh.m32998boximpl(iM29590getpVg5ArA);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minByOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> iqh m29263minByOrNullxTcfx_M(short[] sArr, qy6<? super iqh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$minByOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
        int lastIndex = e80.getLastIndex(sArr);
        if (lastIndex == 0) {
            return iqh.m30318boximpl(sM30551getMh2AYeg);
        }
        R rInvoke = qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM30551getMh2AYeg2 = jqh.m30551getMh2AYeg(sArr, i);
                R rInvoke2 = qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    sM30551getMh2AYeg = sM30551getMh2AYeg2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iqh.m30318boximpl(sM30551getMh2AYeg);
    }

    @jjf(version = "1.7")
    @t28
    @xn8(name = "minByOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> int m29265minByOrThrowU(int[] iArr, qy6<? super woh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$minBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        if (lastIndex == 0) {
            return iM29590getpVg5ArA;
        }
        R rInvoke = qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM29590getpVg5ArA2 = fph.m29590getpVg5ArA(iArr, i);
                R rInvoke2 = qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    iM29590getpVg5ArA = iM29590getpVg5ArA2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iM29590getpVg5ArA;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final double m29268minOfJOV_ifY(byte[] bArr, qy6<? super goh, Double> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$minOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (hoh.m30091isEmptyimpl(bArr)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0))).doubleValue();
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final double m29271minOfMShoTSo(long[] jArr, qy6<? super oph, Double> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$minOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (pph.m31846isEmptyimpl(jArr)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0))).doubleValue();
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final double m29274minOfjgv0xPQ(int[] iArr, qy6<? super woh, Double> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$minOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0))).doubleValue();
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final double m29277minOfxTcfx_M(short[] sArr, qy6<? super iqh, Double> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$minOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jqh.m30554isEmptyimpl(sArr)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0))).doubleValue();
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Double m29281minOfOrNullJOV_ifY(byte[] bArr, qy6<? super goh, Double> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$minOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0))).doubleValue();
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final Double m29284minOfOrNullMShoTSo(long[] jArr, qy6<? super oph, Double> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$minOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0))).doubleValue();
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Double m29287minOfOrNulljgv0xPQ(int[] iArr, qy6<? super woh, Double> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$minOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0))).doubleValue();
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Double m29290minOfOrNullxTcfx_M(short[] sArr, qy6<? super iqh, Double> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$minOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0))).doubleValue();
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfWith-5NtCtWE, reason: not valid java name */
    private static final <R> R m29292minOfWith5NtCtWE(long[] jArr, Comparator<? super R> comparator, qy6<? super oph, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$minOfWith");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (pph.m31846isEmptyimpl(jArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0)));
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfWith-LTi4i_s, reason: not valid java name */
    private static final <R> R m29293minOfWithLTi4i_s(byte[] bArr, Comparator<? super R> comparator, qy6<? super goh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$minOfWith");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (hoh.m30091isEmptyimpl(bArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0)));
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfWith-l8EHGbQ, reason: not valid java name */
    private static final <R> R m29294minOfWithl8EHGbQ(short[] sArr, Comparator<? super R> comparator, qy6<? super iqh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$minOfWith");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jqh.m30554isEmptyimpl(sArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0)));
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfWith-myNOsp4, reason: not valid java name */
    private static final <R> R m29295minOfWithmyNOsp4(int[] iArr, Comparator<? super R> comparator, qy6<? super woh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$minOfWith");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0)));
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfWithOrNull-5NtCtWE, reason: not valid java name */
    private static final <R> R m29296minOfWithOrNull5NtCtWE(long[] jArr, Comparator<? super R> comparator, qy6<? super oph, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$minOfWithOrNull");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        R rInvoke = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0)));
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfWithOrNull-LTi4i_s, reason: not valid java name */
    private static final <R> R m29297minOfWithOrNullLTi4i_s(byte[] bArr, Comparator<? super R> comparator, qy6<? super goh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$minOfWithOrNull");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        R rInvoke = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0)));
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfWithOrNull-l8EHGbQ, reason: not valid java name */
    private static final <R> R m29298minOfWithOrNulll8EHGbQ(short[] sArr, Comparator<? super R> comparator, qy6<? super iqh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$minOfWithOrNull");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        R rInvoke = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0)));
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfWithOrNull-myNOsp4, reason: not valid java name */
    private static final <R> R m29299minOfWithOrNullmyNOsp4(int[] iArr, Comparator<? super R> comparator, qy6<? super woh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$minOfWithOrNull");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        R rInvoke = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0)));
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: minOrNull--ajY-9A, reason: not valid java name */
    public static final woh m29300minOrNullajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$minOrNull");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM29590getpVg5ArA2 = fph.m29590getpVg5ArA(iArr, i);
                if (Integer.compareUnsigned(iM29590getpVg5ArA, iM29590getpVg5ArA2) > 0) {
                    iM29590getpVg5ArA = iM29590getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return woh.m32998boximpl(iM29590getpVg5ArA);
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: minOrNull-GBYM_sE, reason: not valid java name */
    public static final goh m29301minOrNullGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$minOrNull");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM30088getw2LRezQ2 = hoh.m30088getw2LRezQ(bArr, i);
                if (md8.compare(bM30088getw2LRezQ & 255, bM30088getw2LRezQ2 & 255) > 0) {
                    bM30088getw2LRezQ = bM30088getw2LRezQ2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return goh.m29780boximpl(bM30088getw2LRezQ);
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: minOrNull-QwZRm1k, reason: not valid java name */
    public static final oph m29302minOrNullQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$minOrNull");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM31843getsVKNKU2 = pph.m31843getsVKNKU(jArr, i);
                if (Long.compareUnsigned(jM31843getsVKNKU, jM31843getsVKNKU2) > 0) {
                    jM31843getsVKNKU = jM31843getsVKNKU2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return oph.m31527boximpl(jM31843getsVKNKU);
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: minOrNull-rL5Bavg, reason: not valid java name */
    public static final iqh m29303minOrNullrL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$minOrNull");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM30551getMh2AYeg2 = jqh.m30551getMh2AYeg(sArr, i);
                if (md8.compare(sM30551getMh2AYeg & iqh.f48007d, 65535 & sM30551getMh2AYeg2) > 0) {
                    sM30551getMh2AYeg = sM30551getMh2AYeg2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iqh.m30318boximpl(sM30551getMh2AYeg);
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final int m29305minOrThrowU(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$min");
        if (fph.m29593isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM29590getpVg5ArA2 = fph.m29590getpVg5ArA(iArr, i);
                if (Integer.compareUnsigned(iM29590getpVg5ArA, iM29590getpVg5ArA2) > 0) {
                    iM29590getpVg5ArA = iM29590getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iM29590getpVg5ArA;
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: minWithOrNull-XMRcp5o, reason: not valid java name */
    public static final goh m29308minWithOrNullXMRcp5o(@yfb byte[] bArr, @yfb Comparator<? super goh> comparator) {
        md8.checkNotNullParameter(bArr, "$this$minWithOrNull");
        md8.checkNotNullParameter(comparator, "comparator");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM30088getw2LRezQ2 = hoh.m30088getw2LRezQ(bArr, i);
                if (comparator.compare(goh.m29780boximpl(bM30088getw2LRezQ), goh.m29780boximpl(bM30088getw2LRezQ2)) > 0) {
                    bM30088getw2LRezQ = bM30088getw2LRezQ2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return goh.m29780boximpl(bM30088getw2LRezQ);
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: minWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final woh m29309minWithOrNullYmdZ_VM(@yfb int[] iArr, @yfb Comparator<? super woh> comparator) {
        md8.checkNotNullParameter(iArr, "$this$minWithOrNull");
        md8.checkNotNullParameter(comparator, "comparator");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM29590getpVg5ArA2 = fph.m29590getpVg5ArA(iArr, i);
                if (comparator.compare(woh.m32998boximpl(iM29590getpVg5ArA), woh.m32998boximpl(iM29590getpVg5ArA2)) > 0) {
                    iM29590getpVg5ArA = iM29590getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return woh.m32998boximpl(iM29590getpVg5ArA);
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: minWithOrNull-eOHTfZs, reason: not valid java name */
    public static final iqh m29310minWithOrNulleOHTfZs(@yfb short[] sArr, @yfb Comparator<? super iqh> comparator) {
        md8.checkNotNullParameter(sArr, "$this$minWithOrNull");
        md8.checkNotNullParameter(comparator, "comparator");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM30551getMh2AYeg2 = jqh.m30551getMh2AYeg(sArr, i);
                if (comparator.compare(iqh.m30318boximpl(sM30551getMh2AYeg), iqh.m30318boximpl(sM30551getMh2AYeg2)) > 0) {
                    sM30551getMh2AYeg = sM30551getMh2AYeg2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iqh.m30318boximpl(sM30551getMh2AYeg);
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: minWithOrNull-zrEWJaI, reason: not valid java name */
    public static final oph m29311minWithOrNullzrEWJaI(@yfb long[] jArr, @yfb Comparator<? super oph> comparator) {
        md8.checkNotNullParameter(jArr, "$this$minWithOrNull");
        md8.checkNotNullParameter(comparator, "comparator");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM31843getsVKNKU2 = pph.m31843getsVKNKU(jArr, i);
                if (comparator.compare(oph.m31527boximpl(jM31843getsVKNKU), oph.m31527boximpl(jM31843getsVKNKU2)) > 0) {
                    jM31843getsVKNKU = jM31843getsVKNKU2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return oph.m31527boximpl(jM31843getsVKNKU);
    }

    @jjf(version = "1.7")
    @xn8(name = "minWithOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final int m29313minWithOrThrowU(@yfb int[] iArr, @yfb Comparator<? super woh> comparator) {
        md8.checkNotNullParameter(iArr, "$this$minWith");
        md8.checkNotNullParameter(comparator, "comparator");
        if (fph.m29593isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM29590getpVg5ArA2 = fph.m29590getpVg5ArA(iArr, i);
                if (comparator.compare(woh.m32998boximpl(iM29590getpVg5ArA), woh.m32998boximpl(iM29590getpVg5ArA2)) > 0) {
                    iM29590getpVg5ArA = iM29590getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iM29590getpVg5ArA;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: none--ajY-9A, reason: not valid java name */
    private static final boolean m29316noneajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$none");
        return fph.m29593isEmptyimpl(iArr);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: none-GBYM_sE, reason: not valid java name */
    private static final boolean m29317noneGBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$none");
        return hoh.m30091isEmptyimpl(bArr);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: none-JOV_ifY, reason: not valid java name */
    private static final boolean m29318noneJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$none");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            if (qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: none-MShoTSo, reason: not valid java name */
    private static final boolean m29319noneMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$none");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            if (qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: none-QwZRm1k, reason: not valid java name */
    private static final boolean m29320noneQwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$none");
        return pph.m31846isEmptyimpl(jArr);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: none-jgv0xPQ, reason: not valid java name */
    private static final boolean m29321nonejgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$none");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            if (qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: none-rL5Bavg, reason: not valid java name */
    private static final boolean m29322nonerL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$none");
        return jqh.m30554isEmptyimpl(sArr);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: none-xTcfx_M, reason: not valid java name */
    private static final boolean m29323nonexTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$none");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            if (qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: onEach-JOV_ifY, reason: not valid java name */
    private static final byte[] m29324onEachJOV_ifY(byte[] bArr, qy6<? super goh, bth> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$onEach");
        md8.checkNotNullParameter(qy6Var, "action");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
        }
        return bArr;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: onEach-MShoTSo, reason: not valid java name */
    private static final long[] m29325onEachMShoTSo(long[] jArr, qy6<? super oph, bth> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$onEach");
        md8.checkNotNullParameter(qy6Var, "action");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
        }
        return jArr;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: onEach-jgv0xPQ, reason: not valid java name */
    private static final int[] m29326onEachjgv0xPQ(int[] iArr, qy6<? super woh, bth> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$onEach");
        md8.checkNotNullParameter(qy6Var, "action");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
        }
        return iArr;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: onEach-xTcfx_M, reason: not valid java name */
    private static final short[] m29327onEachxTcfx_M(short[] sArr, qy6<? super iqh, bth> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$onEach");
        md8.checkNotNullParameter(qy6Var, "action");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
        }
        return sArr;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: onEachIndexed-ELGow60, reason: not valid java name */
    private static final byte[] m29328onEachIndexedELGow60(byte[] bArr, gz6<? super Integer, ? super goh, bth> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$onEachIndexed");
        md8.checkNotNullParameter(gz6Var, "action");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30089getSizeimpl) {
            gz6Var.invoke(Integer.valueOf(i2), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
            i++;
            i2++;
        }
        return bArr;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: onEachIndexed-WyvcNBI, reason: not valid java name */
    private static final int[] m29329onEachIndexedWyvcNBI(int[] iArr, gz6<? super Integer, ? super woh, bth> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$onEachIndexed");
        md8.checkNotNullParameter(gz6Var, "action");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        int i = 0;
        int i2 = 0;
        while (i < iM29591getSizeimpl) {
            gz6Var.invoke(Integer.valueOf(i2), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
            i++;
            i2++;
        }
        return iArr;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: onEachIndexed-s8dVfGU, reason: not valid java name */
    private static final long[] m29330onEachIndexeds8dVfGU(long[] jArr, gz6<? super Integer, ? super oph, bth> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$onEachIndexed");
        md8.checkNotNullParameter(gz6Var, "action");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        int i = 0;
        int i2 = 0;
        while (i < iM31844getSizeimpl) {
            gz6Var.invoke(Integer.valueOf(i2), oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
            i++;
            i2++;
        }
        return jArr;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: onEachIndexed-xzaTVY8, reason: not valid java name */
    private static final short[] m29331onEachIndexedxzaTVY8(short[] sArr, gz6<? super Integer, ? super iqh, bth> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$onEachIndexed");
        md8.checkNotNullParameter(gz6Var, "action");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        int i = 0;
        int i2 = 0;
        while (i < iM30552getSizeimpl) {
            gz6Var.invoke(Integer.valueOf(i2), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
            i++;
            i2++;
        }
        return sArr;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: plus-3uqUaXg, reason: not valid java name */
    private static final long[] m29332plus3uqUaXg(long[] jArr, long j) {
        md8.checkNotNullParameter(jArr, "$this$plus");
        return pph.m31838constructorimpl(u70.plus(jArr, j));
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: plus-CFIt9YE, reason: not valid java name */
    public static final int[] m29333plusCFIt9YE(@yfb int[] iArr, @yfb Collection<woh> collection) {
        md8.checkNotNullParameter(iArr, "$this$plus");
        md8.checkNotNullParameter(collection, "elements");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        int[] iArrCopyOf = Arrays.copyOf(iArr, fph.m29591getSizeimpl(iArr) + collection.size());
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        Iterator<woh> it = collection.iterator();
        while (it.hasNext()) {
            iArrCopyOf[iM29591getSizeimpl] = it.next().m33056unboximpl();
            iM29591getSizeimpl++;
        }
        return fph.m29585constructorimpl(iArrCopyOf);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: plus-XzdR7RA, reason: not valid java name */
    private static final short[] m29334plusXzdR7RA(short[] sArr, short s) {
        md8.checkNotNullParameter(sArr, "$this$plus");
        return jqh.m30546constructorimpl(u70.plus(sArr, s));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: plus-ctEhBpI, reason: not valid java name */
    private static final int[] m29335plusctEhBpI(int[] iArr, int[] iArr2) {
        md8.checkNotNullParameter(iArr, "$this$plus");
        md8.checkNotNullParameter(iArr2, "elements");
        return fph.m29585constructorimpl(u70.plus(iArr, iArr2));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: plus-gMuBH34, reason: not valid java name */
    private static final byte[] m29336plusgMuBH34(byte[] bArr, byte b) {
        md8.checkNotNullParameter(bArr, "$this$plus");
        return hoh.m30083constructorimpl(u70.plus(bArr, b));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: plus-kdPth3s, reason: not valid java name */
    private static final byte[] m29337pluskdPth3s(byte[] bArr, byte[] bArr2) {
        md8.checkNotNullParameter(bArr, "$this$plus");
        md8.checkNotNullParameter(bArr2, "elements");
        return hoh.m30083constructorimpl(u70.plus(bArr, bArr2));
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: plus-kzHmqpY, reason: not valid java name */
    public static final long[] m29338pluskzHmqpY(@yfb long[] jArr, @yfb Collection<oph> collection) {
        md8.checkNotNullParameter(jArr, "$this$plus");
        md8.checkNotNullParameter(collection, "elements");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        long[] jArrCopyOf = Arrays.copyOf(jArr, pph.m31844getSizeimpl(jArr) + collection.size());
        md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        Iterator<oph> it = collection.iterator();
        while (it.hasNext()) {
            jArrCopyOf[iM31844getSizeimpl] = it.next().m31585unboximpl();
            iM31844getSizeimpl++;
        }
        return pph.m31838constructorimpl(jArrCopyOf);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: plus-mazbYpA, reason: not valid java name */
    private static final short[] m29339plusmazbYpA(short[] sArr, short[] sArr2) {
        md8.checkNotNullParameter(sArr, "$this$plus");
        md8.checkNotNullParameter(sArr2, "elements");
        return jqh.m30546constructorimpl(u70.plus(sArr, sArr2));
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: plus-ojwP5H8, reason: not valid java name */
    public static final short[] m29340plusojwP5H8(@yfb short[] sArr, @yfb Collection<iqh> collection) {
        md8.checkNotNullParameter(sArr, "$this$plus");
        md8.checkNotNullParameter(collection, "elements");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        short[] sArrCopyOf = Arrays.copyOf(sArr, jqh.m30552getSizeimpl(sArr) + collection.size());
        md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        Iterator<iqh> it = collection.iterator();
        while (it.hasNext()) {
            sArrCopyOf[iM30552getSizeimpl] = it.next().m30374unboximpl();
            iM30552getSizeimpl++;
        }
        return jqh.m30546constructorimpl(sArrCopyOf);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: plus-uWY9BYg, reason: not valid java name */
    private static final int[] m29341plusuWY9BYg(int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "$this$plus");
        return fph.m29585constructorimpl(u70.plus(iArr, i));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: plus-us8wMrg, reason: not valid java name */
    private static final long[] m29342plusus8wMrg(long[] jArr, long[] jArr2) {
        md8.checkNotNullParameter(jArr, "$this$plus");
        md8.checkNotNullParameter(jArr2, "elements");
        return pph.m31838constructorimpl(u70.plus(jArr, jArr2));
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: plus-xo_DsdI, reason: not valid java name */
    public static final byte[] m29343plusxo_DsdI(@yfb byte[] bArr, @yfb Collection<goh> collection) {
        md8.checkNotNullParameter(bArr, "$this$plus");
        md8.checkNotNullParameter(collection, "elements");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        byte[] bArrCopyOf = Arrays.copyOf(bArr, hoh.m30089getSizeimpl(bArr) + collection.size());
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        Iterator<goh> it = collection.iterator();
        while (it.hasNext()) {
            bArrCopyOf[iM30089getSizeimpl] = it.next().m29836unboximpl();
            iM30089getSizeimpl++;
        }
        return hoh.m30083constructorimpl(bArrCopyOf);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: random--ajY-9A, reason: not valid java name */
    private static final int m29344randomajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$random");
        return m29345random2D5oskM(iArr, tod.f85517a);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: random-2D5oskM, reason: not valid java name */
    public static final int m29345random2D5oskM(@yfb int[] iArr, @yfb tod todVar) {
        md8.checkNotNullParameter(iArr, "$this$random");
        md8.checkNotNullParameter(todVar, "random");
        if (fph.m29593isEmptyimpl(iArr)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fph.m29590getpVg5ArA(iArr, todVar.nextInt(fph.m29591getSizeimpl(iArr)));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: random-GBYM_sE, reason: not valid java name */
    private static final byte m29346randomGBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$random");
        return m29349randomoSF2wD8(bArr, tod.f85517a);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: random-JzugnMA, reason: not valid java name */
    public static final long m29347randomJzugnMA(@yfb long[] jArr, @yfb tod todVar) {
        md8.checkNotNullParameter(jArr, "$this$random");
        md8.checkNotNullParameter(todVar, "random");
        if (pph.m31846isEmptyimpl(jArr)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return pph.m31843getsVKNKU(jArr, todVar.nextInt(pph.m31844getSizeimpl(jArr)));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: random-QwZRm1k, reason: not valid java name */
    private static final long m29348randomQwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$random");
        return m29347randomJzugnMA(jArr, tod.f85517a);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: random-oSF2wD8, reason: not valid java name */
    public static final byte m29349randomoSF2wD8(@yfb byte[] bArr, @yfb tod todVar) {
        md8.checkNotNullParameter(bArr, "$this$random");
        md8.checkNotNullParameter(todVar, "random");
        if (hoh.m30091isEmptyimpl(bArr)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return hoh.m30088getw2LRezQ(bArr, todVar.nextInt(hoh.m30089getSizeimpl(bArr)));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: random-rL5Bavg, reason: not valid java name */
    private static final short m29350randomrL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$random");
        return m29351randoms5X_as8(sArr, tod.f85517a);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: random-s5X_as8, reason: not valid java name */
    public static final short m29351randoms5X_as8(@yfb short[] sArr, @yfb tod todVar) {
        md8.checkNotNullParameter(sArr, "$this$random");
        md8.checkNotNullParameter(todVar, "random");
        if (jqh.m30554isEmptyimpl(sArr)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return jqh.m30551getMh2AYeg(sArr, todVar.nextInt(jqh.m30552getSizeimpl(sArr)));
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: randomOrNull--ajY-9A, reason: not valid java name */
    private static final woh m29352randomOrNullajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$randomOrNull");
        return m29353randomOrNull2D5oskM(iArr, tod.f85517a);
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: randomOrNull-2D5oskM, reason: not valid java name */
    public static final woh m29353randomOrNull2D5oskM(@yfb int[] iArr, @yfb tod todVar) {
        md8.checkNotNullParameter(iArr, "$this$randomOrNull");
        md8.checkNotNullParameter(todVar, "random");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        return woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, todVar.nextInt(fph.m29591getSizeimpl(iArr))));
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: randomOrNull-GBYM_sE, reason: not valid java name */
    private static final goh m29354randomOrNullGBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$randomOrNull");
        return m29357randomOrNulloSF2wD8(bArr, tod.f85517a);
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: randomOrNull-JzugnMA, reason: not valid java name */
    public static final oph m29355randomOrNullJzugnMA(@yfb long[] jArr, @yfb tod todVar) {
        md8.checkNotNullParameter(jArr, "$this$randomOrNull");
        md8.checkNotNullParameter(todVar, "random");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        return oph.m31527boximpl(pph.m31843getsVKNKU(jArr, todVar.nextInt(pph.m31844getSizeimpl(jArr))));
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: randomOrNull-QwZRm1k, reason: not valid java name */
    private static final oph m29356randomOrNullQwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$randomOrNull");
        return m29355randomOrNullJzugnMA(jArr, tod.f85517a);
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: randomOrNull-oSF2wD8, reason: not valid java name */
    public static final goh m29357randomOrNulloSF2wD8(@yfb byte[] bArr, @yfb tod todVar) {
        md8.checkNotNullParameter(bArr, "$this$randomOrNull");
        md8.checkNotNullParameter(todVar, "random");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        return goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, todVar.nextInt(hoh.m30089getSizeimpl(bArr))));
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: randomOrNull-rL5Bavg, reason: not valid java name */
    private static final iqh m29358randomOrNullrL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$randomOrNull");
        return m29359randomOrNulls5X_as8(sArr, tod.f85517a);
    }

    @gib
    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: randomOrNull-s5X_as8, reason: not valid java name */
    public static final iqh m29359randomOrNulls5X_as8(@yfb short[] sArr, @yfb tod todVar) {
        md8.checkNotNullParameter(sArr, "$this$randomOrNull");
        md8.checkNotNullParameter(todVar, "random");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        return iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, todVar.nextInt(jqh.m30552getSizeimpl(sArr))));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduce-ELGow60, reason: not valid java name */
    private static final byte m29360reduceELGow60(byte[] bArr, gz6<? super goh, ? super goh, goh> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$reduce");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (hoh.m30091isEmptyimpl(bArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                bM30088getw2LRezQ = gz6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).m29836unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return bM30088getw2LRezQ;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduce-WyvcNBI, reason: not valid java name */
    private static final int m29361reduceWyvcNBI(int[] iArr, gz6<? super woh, ? super woh, woh> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$reduce");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (fph.m29593isEmptyimpl(iArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                iM29590getpVg5ArA = gz6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).m33056unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iM29590getpVg5ArA;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduce-s8dVfGU, reason: not valid java name */
    private static final long m29362reduces8dVfGU(long[] jArr, gz6<? super oph, ? super oph, oph> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$reduce");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (pph.m31846isEmptyimpl(jArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                jM31843getsVKNKU = gz6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU), oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).m31585unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return jM31843getsVKNKU;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduce-xzaTVY8, reason: not valid java name */
    private static final short m29363reducexzaTVY8(short[] sArr, gz6<? super iqh, ? super iqh, iqh> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$reduce");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (jqh.m30554isEmptyimpl(sArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                sM30551getMh2AYeg = gz6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).m30374unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return sM30551getMh2AYeg;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceIndexed-D40WMg8, reason: not valid java name */
    private static final int m29364reduceIndexedD40WMg8(int[] iArr, kz6<? super Integer, ? super woh, ? super woh, woh> kz6Var) {
        md8.checkNotNullParameter(iArr, "$this$reduceIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (fph.m29593isEmptyimpl(iArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                iM29590getpVg5ArA = kz6Var.invoke(Integer.valueOf(i), woh.m32998boximpl(iM29590getpVg5ArA), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).m33056unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iM29590getpVg5ArA;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceIndexed-EOyYB1Y, reason: not valid java name */
    private static final byte m29365reduceIndexedEOyYB1Y(byte[] bArr, kz6<? super Integer, ? super goh, ? super goh, goh> kz6Var) {
        md8.checkNotNullParameter(bArr, "$this$reduceIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (hoh.m30091isEmptyimpl(bArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                bM30088getw2LRezQ = kz6Var.invoke(Integer.valueOf(i), goh.m29780boximpl(bM30088getw2LRezQ), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).m29836unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return bM30088getw2LRezQ;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceIndexed-aLgx1Fo, reason: not valid java name */
    private static final short m29366reduceIndexedaLgx1Fo(short[] sArr, kz6<? super Integer, ? super iqh, ? super iqh, iqh> kz6Var) {
        md8.checkNotNullParameter(sArr, "$this$reduceIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (jqh.m30554isEmptyimpl(sArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                sM30551getMh2AYeg = kz6Var.invoke(Integer.valueOf(i), iqh.m30318boximpl(sM30551getMh2AYeg), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).m30374unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return sM30551getMh2AYeg;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceIndexed-z1zDJgo, reason: not valid java name */
    private static final long m29367reduceIndexedz1zDJgo(long[] jArr, kz6<? super Integer, ? super oph, ? super oph, oph> kz6Var) {
        md8.checkNotNullParameter(jArr, "$this$reduceIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (pph.m31846isEmptyimpl(jArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                jM31843getsVKNKU = kz6Var.invoke(Integer.valueOf(i), oph.m31527boximpl(jM31843getsVKNKU), oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).m31585unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return jM31843getsVKNKU;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceIndexedOrNull-D40WMg8, reason: not valid java name */
    private static final woh m29368reduceIndexedOrNullD40WMg8(int[] iArr, kz6<? super Integer, ? super woh, ? super woh, woh> kz6Var) {
        md8.checkNotNullParameter(iArr, "$this$reduceIndexedOrNull");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                iM29590getpVg5ArA = kz6Var.invoke(Integer.valueOf(i), woh.m32998boximpl(iM29590getpVg5ArA), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).m33056unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return woh.m32998boximpl(iM29590getpVg5ArA);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceIndexedOrNull-EOyYB1Y, reason: not valid java name */
    private static final goh m29369reduceIndexedOrNullEOyYB1Y(byte[] bArr, kz6<? super Integer, ? super goh, ? super goh, goh> kz6Var) {
        md8.checkNotNullParameter(bArr, "$this$reduceIndexedOrNull");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                bM30088getw2LRezQ = kz6Var.invoke(Integer.valueOf(i), goh.m29780boximpl(bM30088getw2LRezQ), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).m29836unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return goh.m29780boximpl(bM30088getw2LRezQ);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceIndexedOrNull-aLgx1Fo, reason: not valid java name */
    private static final iqh m29370reduceIndexedOrNullaLgx1Fo(short[] sArr, kz6<? super Integer, ? super iqh, ? super iqh, iqh> kz6Var) {
        md8.checkNotNullParameter(sArr, "$this$reduceIndexedOrNull");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                sM30551getMh2AYeg = kz6Var.invoke(Integer.valueOf(i), iqh.m30318boximpl(sM30551getMh2AYeg), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).m30374unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iqh.m30318boximpl(sM30551getMh2AYeg);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceIndexedOrNull-z1zDJgo, reason: not valid java name */
    private static final oph m29371reduceIndexedOrNullz1zDJgo(long[] jArr, kz6<? super Integer, ? super oph, ? super oph, oph> kz6Var) {
        md8.checkNotNullParameter(jArr, "$this$reduceIndexedOrNull");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                jM31843getsVKNKU = kz6Var.invoke(Integer.valueOf(i), oph.m31527boximpl(jM31843getsVKNKU), oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).m31585unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return oph.m31527boximpl(jM31843getsVKNKU);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceOrNull-ELGow60, reason: not valid java name */
    private static final goh m29372reduceOrNullELGow60(byte[] bArr, gz6<? super goh, ? super goh, goh> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$reduceOrNull");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                bM30088getw2LRezQ = gz6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).m29836unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return goh.m29780boximpl(bM30088getw2LRezQ);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceOrNull-WyvcNBI, reason: not valid java name */
    private static final woh m29373reduceOrNullWyvcNBI(int[] iArr, gz6<? super woh, ? super woh, woh> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$reduceOrNull");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                iM29590getpVg5ArA = gz6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).m33056unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return woh.m32998boximpl(iM29590getpVg5ArA);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceOrNull-s8dVfGU, reason: not valid java name */
    private static final oph m29374reduceOrNulls8dVfGU(long[] jArr, gz6<? super oph, ? super oph, oph> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$reduceOrNull");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                jM31843getsVKNKU = gz6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU), oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).m31585unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return oph.m31527boximpl(jM31843getsVKNKU);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceOrNull-xzaTVY8, reason: not valid java name */
    private static final iqh m29375reduceOrNullxzaTVY8(short[] sArr, gz6<? super iqh, ? super iqh, iqh> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$reduceOrNull");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                sM30551getMh2AYeg = gz6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).m30374unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iqh.m30318boximpl(sM30551getMh2AYeg);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceRight-ELGow60, reason: not valid java name */
    private static final byte m29376reduceRightELGow60(byte[] bArr, gz6<? super goh, ? super goh, goh> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$reduceRight");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = e80.getLastIndex(bArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            bM30088getw2LRezQ = gz6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)), goh.m29780boximpl(bM30088getw2LRezQ)).m29836unboximpl();
        }
        return bM30088getw2LRezQ;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceRight-WyvcNBI, reason: not valid java name */
    private static final int m29377reduceRightWyvcNBI(int[] iArr, gz6<? super woh, ? super woh, woh> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$reduceRight");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = e80.getLastIndex(iArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            iM29590getpVg5ArA = gz6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)), woh.m32998boximpl(iM29590getpVg5ArA)).m33056unboximpl();
        }
        return iM29590getpVg5ArA;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceRight-s8dVfGU, reason: not valid java name */
    private static final long m29378reduceRights8dVfGU(long[] jArr, gz6<? super oph, ? super oph, oph> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$reduceRight");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = e80.getLastIndex(jArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            jM31843getsVKNKU = gz6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)), oph.m31527boximpl(jM31843getsVKNKU)).m31585unboximpl();
        }
        return jM31843getsVKNKU;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceRight-xzaTVY8, reason: not valid java name */
    private static final short m29379reduceRightxzaTVY8(short[] sArr, gz6<? super iqh, ? super iqh, iqh> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$reduceRight");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = e80.getLastIndex(sArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            sM30551getMh2AYeg = gz6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)), iqh.m30318boximpl(sM30551getMh2AYeg)).m30374unboximpl();
        }
        return sM30551getMh2AYeg;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceRightIndexed-D40WMg8, reason: not valid java name */
    private static final int m29380reduceRightIndexedD40WMg8(int[] iArr, kz6<? super Integer, ? super woh, ? super woh, woh> kz6Var) {
        md8.checkNotNullParameter(iArr, "$this$reduceRightIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = e80.getLastIndex(iArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            iM29590getpVg5ArA = kz6Var.invoke(Integer.valueOf(i), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)), woh.m32998boximpl(iM29590getpVg5ArA)).m33056unboximpl();
        }
        return iM29590getpVg5ArA;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceRightIndexed-EOyYB1Y, reason: not valid java name */
    private static final byte m29381reduceRightIndexedEOyYB1Y(byte[] bArr, kz6<? super Integer, ? super goh, ? super goh, goh> kz6Var) {
        md8.checkNotNullParameter(bArr, "$this$reduceRightIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = e80.getLastIndex(bArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            bM30088getw2LRezQ = kz6Var.invoke(Integer.valueOf(i), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)), goh.m29780boximpl(bM30088getw2LRezQ)).m29836unboximpl();
        }
        return bM30088getw2LRezQ;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceRightIndexed-aLgx1Fo, reason: not valid java name */
    private static final short m29382reduceRightIndexedaLgx1Fo(short[] sArr, kz6<? super Integer, ? super iqh, ? super iqh, iqh> kz6Var) {
        md8.checkNotNullParameter(sArr, "$this$reduceRightIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = e80.getLastIndex(sArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            sM30551getMh2AYeg = kz6Var.invoke(Integer.valueOf(i), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)), iqh.m30318boximpl(sM30551getMh2AYeg)).m30374unboximpl();
        }
        return sM30551getMh2AYeg;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceRightIndexed-z1zDJgo, reason: not valid java name */
    private static final long m29383reduceRightIndexedz1zDJgo(long[] jArr, kz6<? super Integer, ? super oph, ? super oph, oph> kz6Var) {
        md8.checkNotNullParameter(jArr, "$this$reduceRightIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = e80.getLastIndex(jArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            jM31843getsVKNKU = kz6Var.invoke(Integer.valueOf(i), oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)), oph.m31527boximpl(jM31843getsVKNKU)).m31585unboximpl();
        }
        return jM31843getsVKNKU;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceRightIndexedOrNull-D40WMg8, reason: not valid java name */
    private static final woh m29384reduceRightIndexedOrNullD40WMg8(int[] iArr, kz6<? super Integer, ? super woh, ? super woh, woh> kz6Var) {
        md8.checkNotNullParameter(iArr, "$this$reduceRightIndexedOrNull");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = e80.getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            iM29590getpVg5ArA = kz6Var.invoke(Integer.valueOf(i), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)), woh.m32998boximpl(iM29590getpVg5ArA)).m33056unboximpl();
        }
        return woh.m32998boximpl(iM29590getpVg5ArA);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceRightIndexedOrNull-EOyYB1Y, reason: not valid java name */
    private static final goh m29385reduceRightIndexedOrNullEOyYB1Y(byte[] bArr, kz6<? super Integer, ? super goh, ? super goh, goh> kz6Var) {
        md8.checkNotNullParameter(bArr, "$this$reduceRightIndexedOrNull");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = e80.getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            bM30088getw2LRezQ = kz6Var.invoke(Integer.valueOf(i), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)), goh.m29780boximpl(bM30088getw2LRezQ)).m29836unboximpl();
        }
        return goh.m29780boximpl(bM30088getw2LRezQ);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceRightIndexedOrNull-aLgx1Fo, reason: not valid java name */
    private static final iqh m29386reduceRightIndexedOrNullaLgx1Fo(short[] sArr, kz6<? super Integer, ? super iqh, ? super iqh, iqh> kz6Var) {
        md8.checkNotNullParameter(sArr, "$this$reduceRightIndexedOrNull");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = e80.getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            sM30551getMh2AYeg = kz6Var.invoke(Integer.valueOf(i), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)), iqh.m30318boximpl(sM30551getMh2AYeg)).m30374unboximpl();
        }
        return iqh.m30318boximpl(sM30551getMh2AYeg);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceRightIndexedOrNull-z1zDJgo, reason: not valid java name */
    private static final oph m29387reduceRightIndexedOrNullz1zDJgo(long[] jArr, kz6<? super Integer, ? super oph, ? super oph, oph> kz6Var) {
        md8.checkNotNullParameter(jArr, "$this$reduceRightIndexedOrNull");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = e80.getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            jM31843getsVKNKU = kz6Var.invoke(Integer.valueOf(i), oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)), oph.m31527boximpl(jM31843getsVKNKU)).m31585unboximpl();
        }
        return oph.m31527boximpl(jM31843getsVKNKU);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceRightOrNull-ELGow60, reason: not valid java name */
    private static final goh m29388reduceRightOrNullELGow60(byte[] bArr, gz6<? super goh, ? super goh, goh> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$reduceRightOrNull");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = e80.getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            bM30088getw2LRezQ = gz6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)), goh.m29780boximpl(bM30088getw2LRezQ)).m29836unboximpl();
        }
        return goh.m29780boximpl(bM30088getw2LRezQ);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceRightOrNull-WyvcNBI, reason: not valid java name */
    private static final woh m29389reduceRightOrNullWyvcNBI(int[] iArr, gz6<? super woh, ? super woh, woh> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$reduceRightOrNull");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = e80.getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            iM29590getpVg5ArA = gz6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)), woh.m32998boximpl(iM29590getpVg5ArA)).m33056unboximpl();
        }
        return woh.m32998boximpl(iM29590getpVg5ArA);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceRightOrNull-s8dVfGU, reason: not valid java name */
    private static final oph m29390reduceRightOrNulls8dVfGU(long[] jArr, gz6<? super oph, ? super oph, oph> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$reduceRightOrNull");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = e80.getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            jM31843getsVKNKU = gz6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)), oph.m31527boximpl(jM31843getsVKNKU)).m31585unboximpl();
        }
        return oph.m31527boximpl(jM31843getsVKNKU);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reduceRightOrNull-xzaTVY8, reason: not valid java name */
    private static final iqh m29391reduceRightOrNullxzaTVY8(short[] sArr, gz6<? super iqh, ? super iqh, iqh> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$reduceRightOrNull");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = e80.getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            sM30551getMh2AYeg = gz6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)), iqh.m30318boximpl(sM30551getMh2AYeg)).m30374unboximpl();
        }
        return iqh.m30318boximpl(sM30551getMh2AYeg);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reverse--ajY-9A, reason: not valid java name */
    private static final void m29392reverseajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$reverse");
        e80.reverse(iArr);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reverse--nroSd4, reason: not valid java name */
    private static final void m29393reversenroSd4(long[] jArr, int i, int i2) {
        md8.checkNotNullParameter(jArr, "$this$reverse");
        e80.reverse(jArr, i, i2);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reverse-4UcCI2c, reason: not valid java name */
    private static final void m29394reverse4UcCI2c(byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "$this$reverse");
        e80.reverse(bArr, i, i2);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reverse-Aa5vz7o, reason: not valid java name */
    private static final void m29395reverseAa5vz7o(short[] sArr, int i, int i2) {
        md8.checkNotNullParameter(sArr, "$this$reverse");
        e80.reverse(sArr, i, i2);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reverse-GBYM_sE, reason: not valid java name */
    private static final void m29396reverseGBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$reverse");
        e80.reverse(bArr);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reverse-QwZRm1k, reason: not valid java name */
    private static final void m29397reverseQwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$reverse");
        e80.reverse(jArr);
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: reverse-oBK06Vg, reason: not valid java name */
    private static final void m29398reverseoBK06Vg(int[] iArr, int i, int i2) {
        md8.checkNotNullParameter(iArr, "$this$reverse");
        e80.reverse(iArr, i, i2);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reverse-rL5Bavg, reason: not valid java name */
    private static final void m29399reverserL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$reverse");
        e80.reverse(sArr);
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: reversed--ajY-9A, reason: not valid java name */
    public static final List<woh> m29400reversedajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$reversed");
        if (fph.m29593isEmptyimpl(iArr)) {
            return l82.emptyList();
        }
        List<woh> mutableList = v82.toMutableList((Collection) fph.m29583boximpl(iArr));
        s82.reverse(mutableList);
        return mutableList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: reversed-GBYM_sE, reason: not valid java name */
    public static final List<goh> m29401reversedGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$reversed");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return l82.emptyList();
        }
        List<goh> mutableList = v82.toMutableList((Collection) hoh.m30081boximpl(bArr));
        s82.reverse(mutableList);
        return mutableList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: reversed-QwZRm1k, reason: not valid java name */
    public static final List<oph> m29402reversedQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$reversed");
        if (pph.m31846isEmptyimpl(jArr)) {
            return l82.emptyList();
        }
        List<oph> mutableList = v82.toMutableList((Collection) pph.m31836boximpl(jArr));
        s82.reverse(mutableList);
        return mutableList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: reversed-rL5Bavg, reason: not valid java name */
    public static final List<iqh> m29403reversedrL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$reversed");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return l82.emptyList();
        }
        List<iqh> mutableList = v82.toMutableList((Collection) jqh.m30544boximpl(sArr));
        s82.reverse(mutableList);
        return mutableList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reversedArray--ajY-9A, reason: not valid java name */
    private static final int[] m29404reversedArrayajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$reversedArray");
        return fph.m29585constructorimpl(e80.reversedArray(iArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reversedArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m29405reversedArrayGBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$reversedArray");
        return hoh.m30083constructorimpl(e80.reversedArray(bArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reversedArray-QwZRm1k, reason: not valid java name */
    private static final long[] m29406reversedArrayQwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$reversedArray");
        return pph.m31838constructorimpl(e80.reversedArray(jArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: reversedArray-rL5Bavg, reason: not valid java name */
    private static final short[] m29407reversedArrayrL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$reversedArray");
        return jqh.m30546constructorimpl(e80.reversedArray(sArr));
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: runningFold-A8wKCXQ, reason: not valid java name */
    private static final <R> List<R> m29408runningFoldA8wKCXQ(long[] jArr, R r, gz6<? super R, ? super oph, ? extends R> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$runningFold");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (pph.m31846isEmptyimpl(jArr)) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(pph.m31844getSizeimpl(jArr) + 1);
        arrayList.add(r);
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            r = gz6Var.invoke(r, oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: runningFold-yXmHNn8, reason: not valid java name */
    private static final <R> List<R> m29409runningFoldyXmHNn8(byte[] bArr, R r, gz6<? super R, ? super goh, ? extends R> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$runningFold");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(hoh.m30089getSizeimpl(bArr) + 1);
        arrayList.add(r);
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            r = gz6Var.invoke(r, goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: runningFold-zi1B2BA, reason: not valid java name */
    private static final <R> List<R> m29410runningFoldzi1B2BA(int[] iArr, R r, gz6<? super R, ? super woh, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$runningFold");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (fph.m29593isEmptyimpl(iArr)) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(fph.m29591getSizeimpl(iArr) + 1);
        arrayList.add(r);
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            r = gz6Var.invoke(r, woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: runningFold-zww5nb8, reason: not valid java name */
    private static final <R> List<R> m29411runningFoldzww5nb8(short[] sArr, R r, gz6<? super R, ? super iqh, ? extends R> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$runningFold");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(jqh.m30552getSizeimpl(sArr) + 1);
        arrayList.add(r);
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            r = gz6Var.invoke(r, iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: runningFoldIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> List<R> m29412runningFoldIndexed3iWJZGE(byte[] bArr, R r, kz6<? super Integer, ? super R, ? super goh, ? extends R> kz6Var) {
        md8.checkNotNullParameter(bArr, "$this$runningFoldIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(hoh.m30089getSizeimpl(bArr) + 1);
        arrayList.add(r);
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: runningFoldIndexed-bzxtMww, reason: not valid java name */
    private static final <R> List<R> m29413runningFoldIndexedbzxtMww(short[] sArr, R r, kz6<? super Integer, ? super R, ? super iqh, ? extends R> kz6Var) {
        md8.checkNotNullParameter(sArr, "$this$runningFoldIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(jqh.m30552getSizeimpl(sArr) + 1);
        arrayList.add(r);
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: runningFoldIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> List<R> m29414runningFoldIndexedmwnnOCs(long[] jArr, R r, kz6<? super Integer, ? super R, ? super oph, ? extends R> kz6Var) {
        md8.checkNotNullParameter(jArr, "$this$runningFoldIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (pph.m31846isEmptyimpl(jArr)) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(pph.m31844getSizeimpl(jArr) + 1);
        arrayList.add(r);
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: runningFoldIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> List<R> m29415runningFoldIndexedyVwIW0Q(int[] iArr, R r, kz6<? super Integer, ? super R, ? super woh, ? extends R> kz6Var) {
        md8.checkNotNullParameter(iArr, "$this$runningFoldIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (fph.m29593isEmptyimpl(iArr)) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(fph.m29591getSizeimpl(iArr) + 1);
        arrayList.add(r);
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: runningReduce-ELGow60, reason: not valid java name */
    private static final List<goh> m29416runningReduceELGow60(byte[] bArr, gz6<? super goh, ? super goh, goh> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$runningReduce");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return l82.emptyList();
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
        ArrayList arrayList = new ArrayList(hoh.m30089getSizeimpl(bArr));
        arrayList.add(goh.m29780boximpl(bM30088getw2LRezQ));
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 1; i < iM30089getSizeimpl; i++) {
            bM30088getw2LRezQ = gz6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).m29836unboximpl();
            arrayList.add(goh.m29780boximpl(bM30088getw2LRezQ));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: runningReduce-WyvcNBI, reason: not valid java name */
    private static final List<woh> m29417runningReduceWyvcNBI(int[] iArr, gz6<? super woh, ? super woh, woh> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$runningReduce");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (fph.m29593isEmptyimpl(iArr)) {
            return l82.emptyList();
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        ArrayList arrayList = new ArrayList(fph.m29591getSizeimpl(iArr));
        arrayList.add(woh.m32998boximpl(iM29590getpVg5ArA));
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 1; i < iM29591getSizeimpl; i++) {
            iM29590getpVg5ArA = gz6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).m33056unboximpl();
            arrayList.add(woh.m32998boximpl(iM29590getpVg5ArA));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: runningReduce-s8dVfGU, reason: not valid java name */
    private static final List<oph> m29418runningReduces8dVfGU(long[] jArr, gz6<? super oph, ? super oph, oph> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$runningReduce");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (pph.m31846isEmptyimpl(jArr)) {
            return l82.emptyList();
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
        ArrayList arrayList = new ArrayList(pph.m31844getSizeimpl(jArr));
        arrayList.add(oph.m31527boximpl(jM31843getsVKNKU));
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 1; i < iM31844getSizeimpl; i++) {
            jM31843getsVKNKU = gz6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU), oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).m31585unboximpl();
            arrayList.add(oph.m31527boximpl(jM31843getsVKNKU));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: runningReduce-xzaTVY8, reason: not valid java name */
    private static final List<iqh> m29419runningReducexzaTVY8(short[] sArr, gz6<? super iqh, ? super iqh, iqh> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$runningReduce");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return l82.emptyList();
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
        ArrayList arrayList = new ArrayList(jqh.m30552getSizeimpl(sArr));
        arrayList.add(iqh.m30318boximpl(sM30551getMh2AYeg));
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 1; i < iM30552getSizeimpl; i++) {
            sM30551getMh2AYeg = gz6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).m30374unboximpl();
            arrayList.add(iqh.m30318boximpl(sM30551getMh2AYeg));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: runningReduceIndexed-D40WMg8, reason: not valid java name */
    private static final List<woh> m29420runningReduceIndexedD40WMg8(int[] iArr, kz6<? super Integer, ? super woh, ? super woh, woh> kz6Var) {
        md8.checkNotNullParameter(iArr, "$this$runningReduceIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (fph.m29593isEmptyimpl(iArr)) {
            return l82.emptyList();
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        ArrayList arrayList = new ArrayList(fph.m29591getSizeimpl(iArr));
        arrayList.add(woh.m32998boximpl(iM29590getpVg5ArA));
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 1; i < iM29591getSizeimpl; i++) {
            iM29590getpVg5ArA = kz6Var.invoke(Integer.valueOf(i), woh.m32998boximpl(iM29590getpVg5ArA), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).m33056unboximpl();
            arrayList.add(woh.m32998boximpl(iM29590getpVg5ArA));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: runningReduceIndexed-EOyYB1Y, reason: not valid java name */
    private static final List<goh> m29421runningReduceIndexedEOyYB1Y(byte[] bArr, kz6<? super Integer, ? super goh, ? super goh, goh> kz6Var) {
        md8.checkNotNullParameter(bArr, "$this$runningReduceIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return l82.emptyList();
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
        ArrayList arrayList = new ArrayList(hoh.m30089getSizeimpl(bArr));
        arrayList.add(goh.m29780boximpl(bM30088getw2LRezQ));
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 1; i < iM30089getSizeimpl; i++) {
            bM30088getw2LRezQ = kz6Var.invoke(Integer.valueOf(i), goh.m29780boximpl(bM30088getw2LRezQ), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).m29836unboximpl();
            arrayList.add(goh.m29780boximpl(bM30088getw2LRezQ));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: runningReduceIndexed-aLgx1Fo, reason: not valid java name */
    private static final List<iqh> m29422runningReduceIndexedaLgx1Fo(short[] sArr, kz6<? super Integer, ? super iqh, ? super iqh, iqh> kz6Var) {
        md8.checkNotNullParameter(sArr, "$this$runningReduceIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return l82.emptyList();
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
        ArrayList arrayList = new ArrayList(jqh.m30552getSizeimpl(sArr));
        arrayList.add(iqh.m30318boximpl(sM30551getMh2AYeg));
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 1; i < iM30552getSizeimpl; i++) {
            sM30551getMh2AYeg = kz6Var.invoke(Integer.valueOf(i), iqh.m30318boximpl(sM30551getMh2AYeg), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).m30374unboximpl();
            arrayList.add(iqh.m30318boximpl(sM30551getMh2AYeg));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: runningReduceIndexed-z1zDJgo, reason: not valid java name */
    private static final List<oph> m29423runningReduceIndexedz1zDJgo(long[] jArr, kz6<? super Integer, ? super oph, ? super oph, oph> kz6Var) {
        md8.checkNotNullParameter(jArr, "$this$runningReduceIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (pph.m31846isEmptyimpl(jArr)) {
            return l82.emptyList();
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
        ArrayList arrayList = new ArrayList(pph.m31844getSizeimpl(jArr));
        arrayList.add(oph.m31527boximpl(jM31843getsVKNKU));
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 1; i < iM31844getSizeimpl; i++) {
            jM31843getsVKNKU = kz6Var.invoke(Integer.valueOf(i), oph.m31527boximpl(jM31843getsVKNKU), oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).m31585unboximpl();
            arrayList.add(oph.m31527boximpl(jM31843getsVKNKU));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: scan-A8wKCXQ, reason: not valid java name */
    private static final <R> List<R> m29424scanA8wKCXQ(long[] jArr, R r, gz6<? super R, ? super oph, ? extends R> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$scan");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (pph.m31846isEmptyimpl(jArr)) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(pph.m31844getSizeimpl(jArr) + 1);
        arrayList.add(r);
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            r = gz6Var.invoke(r, oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: scan-yXmHNn8, reason: not valid java name */
    private static final <R> List<R> m29425scanyXmHNn8(byte[] bArr, R r, gz6<? super R, ? super goh, ? extends R> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$scan");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(hoh.m30089getSizeimpl(bArr) + 1);
        arrayList.add(r);
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            r = gz6Var.invoke(r, goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: scan-zi1B2BA, reason: not valid java name */
    private static final <R> List<R> m29426scanzi1B2BA(int[] iArr, R r, gz6<? super R, ? super woh, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$scan");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (fph.m29593isEmptyimpl(iArr)) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(fph.m29591getSizeimpl(iArr) + 1);
        arrayList.add(r);
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            r = gz6Var.invoke(r, woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: scan-zww5nb8, reason: not valid java name */
    private static final <R> List<R> m29427scanzww5nb8(short[] sArr, R r, gz6<? super R, ? super iqh, ? extends R> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$scan");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(jqh.m30552getSizeimpl(sArr) + 1);
        arrayList.add(r);
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            r = gz6Var.invoke(r, iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: scanIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> List<R> m29428scanIndexed3iWJZGE(byte[] bArr, R r, kz6<? super Integer, ? super R, ? super goh, ? extends R> kz6Var) {
        md8.checkNotNullParameter(bArr, "$this$scanIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(hoh.m30089getSizeimpl(bArr) + 1);
        arrayList.add(r);
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: scanIndexed-bzxtMww, reason: not valid java name */
    private static final <R> List<R> m29429scanIndexedbzxtMww(short[] sArr, R r, kz6<? super Integer, ? super R, ? super iqh, ? extends R> kz6Var) {
        md8.checkNotNullParameter(sArr, "$this$scanIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(jqh.m30552getSizeimpl(sArr) + 1);
        arrayList.add(r);
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: scanIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> List<R> m29430scanIndexedmwnnOCs(long[] jArr, R r, kz6<? super Integer, ? super R, ? super oph, ? extends R> kz6Var) {
        md8.checkNotNullParameter(jArr, "$this$scanIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (pph.m31846isEmptyimpl(jArr)) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(pph.m31844getSizeimpl(jArr) + 1);
        arrayList.add(r);
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: scanIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> List<R> m29431scanIndexedyVwIW0Q(int[] iArr, R r, kz6<? super Integer, ? super R, ? super woh, ? extends R> kz6Var) {
        md8.checkNotNullParameter(iArr, "$this$scanIndexed");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (fph.m29593isEmptyimpl(iArr)) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(fph.m29591getSizeimpl(iArr) + 1);
        arrayList.add(r);
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: shuffle--ajY-9A, reason: not valid java name */
    public static final void m29432shuffleajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$shuffle");
        m29433shuffle2D5oskM(iArr, tod.f85517a);
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: shuffle-2D5oskM, reason: not valid java name */
    public static final void m29433shuffle2D5oskM(@yfb int[] iArr, @yfb tod todVar) {
        md8.checkNotNullParameter(iArr, "$this$shuffle");
        md8.checkNotNullParameter(todVar, "random");
        for (int lastIndex = e80.getLastIndex(iArr); lastIndex > 0; lastIndex--) {
            int iNextInt = todVar.nextInt(lastIndex + 1);
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, lastIndex);
            fph.m29595setVXSXFK8(iArr, lastIndex, fph.m29590getpVg5ArA(iArr, iNextInt));
            fph.m29595setVXSXFK8(iArr, iNextInt, iM29590getpVg5ArA);
        }
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: shuffle-GBYM_sE, reason: not valid java name */
    public static final void m29434shuffleGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$shuffle");
        m29437shuffleoSF2wD8(bArr, tod.f85517a);
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: shuffle-JzugnMA, reason: not valid java name */
    public static final void m29435shuffleJzugnMA(@yfb long[] jArr, @yfb tod todVar) {
        md8.checkNotNullParameter(jArr, "$this$shuffle");
        md8.checkNotNullParameter(todVar, "random");
        for (int lastIndex = e80.getLastIndex(jArr); lastIndex > 0; lastIndex--) {
            int iNextInt = todVar.nextInt(lastIndex + 1);
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, lastIndex);
            pph.m31848setk8EXiF4(jArr, lastIndex, pph.m31843getsVKNKU(jArr, iNextInt));
            pph.m31848setk8EXiF4(jArr, iNextInt, jM31843getsVKNKU);
        }
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: shuffle-QwZRm1k, reason: not valid java name */
    public static final void m29436shuffleQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$shuffle");
        m29435shuffleJzugnMA(jArr, tod.f85517a);
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: shuffle-oSF2wD8, reason: not valid java name */
    public static final void m29437shuffleoSF2wD8(@yfb byte[] bArr, @yfb tod todVar) {
        md8.checkNotNullParameter(bArr, "$this$shuffle");
        md8.checkNotNullParameter(todVar, "random");
        for (int lastIndex = e80.getLastIndex(bArr); lastIndex > 0; lastIndex--) {
            int iNextInt = todVar.nextInt(lastIndex + 1);
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, lastIndex);
            hoh.m30093setVurrAj0(bArr, lastIndex, hoh.m30088getw2LRezQ(bArr, iNextInt));
            hoh.m30093setVurrAj0(bArr, iNextInt, bM30088getw2LRezQ);
        }
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: shuffle-rL5Bavg, reason: not valid java name */
    public static final void m29438shufflerL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$shuffle");
        m29439shuffles5X_as8(sArr, tod.f85517a);
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: shuffle-s5X_as8, reason: not valid java name */
    public static final void m29439shuffles5X_as8(@yfb short[] sArr, @yfb tod todVar) {
        md8.checkNotNullParameter(sArr, "$this$shuffle");
        md8.checkNotNullParameter(todVar, "random");
        for (int lastIndex = e80.getLastIndex(sArr); lastIndex > 0; lastIndex--) {
            int iNextInt = todVar.nextInt(lastIndex + 1);
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, lastIndex);
            jqh.m30556set01HTLdE(sArr, lastIndex, jqh.m30551getMh2AYeg(sArr, iNextInt));
            jqh.m30556set01HTLdE(sArr, iNextInt, sM30551getMh2AYeg);
        }
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: single--ajY-9A, reason: not valid java name */
    private static final int m29440singleajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$single");
        return woh.m33004constructorimpl(e80.single(iArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: single-GBYM_sE, reason: not valid java name */
    private static final byte m29441singleGBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$single");
        return goh.m29786constructorimpl(e80.single(bArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: single-JOV_ifY, reason: not valid java name */
    private static final byte m29442singleJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$single");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        goh gohVarM29780boximpl = null;
        boolean z = false;
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            if (qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                gohVarM29780boximpl = goh.m29780boximpl(bM30088getw2LRezQ);
                z = true;
            }
        }
        if (z) {
            return gohVarM29780boximpl.m29836unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: single-MShoTSo, reason: not valid java name */
    private static final long m29443singleMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$single");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        oph ophVarM31527boximpl = null;
        boolean z = false;
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            if (qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                ophVarM31527boximpl = oph.m31527boximpl(jM31843getsVKNKU);
                z = true;
            }
        }
        if (z) {
            return ophVarM31527boximpl.m31585unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: single-QwZRm1k, reason: not valid java name */
    private static final long m29444singleQwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$single");
        return oph.m31533constructorimpl(e80.single(jArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: single-jgv0xPQ, reason: not valid java name */
    private static final int m29445singlejgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$single");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        woh wohVarM32998boximpl = null;
        boolean z = false;
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            if (qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                wohVarM32998boximpl = woh.m32998boximpl(iM29590getpVg5ArA);
                z = true;
            }
        }
        if (z) {
            return wohVarM32998boximpl.m33056unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: single-rL5Bavg, reason: not valid java name */
    private static final short m29446singlerL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$single");
        return iqh.m30324constructorimpl(e80.single(sArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: single-xTcfx_M, reason: not valid java name */
    private static final short m29447singlexTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$single");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        iqh iqhVarM30318boximpl = null;
        boolean z = false;
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            if (qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                iqhVarM30318boximpl = iqh.m30318boximpl(sM30551getMh2AYeg);
                z = true;
            }
        }
        if (z) {
            return iqhVarM30318boximpl.m30374unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @gib
    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: singleOrNull--ajY-9A, reason: not valid java name */
    public static final woh m29448singleOrNullajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$singleOrNull");
        if (fph.m29591getSizeimpl(iArr) == 1) {
            return woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0));
        }
        return null;
    }

    @gib
    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: singleOrNull-GBYM_sE, reason: not valid java name */
    public static final goh m29449singleOrNullGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$singleOrNull");
        if (hoh.m30089getSizeimpl(bArr) == 1) {
            return goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0));
        }
        return null;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: singleOrNull-JOV_ifY, reason: not valid java name */
    private static final goh m29450singleOrNullJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$singleOrNull");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        goh gohVarM29780boximpl = null;
        boolean z = false;
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            if (qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ)).booleanValue()) {
                if (z) {
                    return null;
                }
                gohVarM29780boximpl = goh.m29780boximpl(bM30088getw2LRezQ);
                z = true;
            }
        }
        if (z) {
            return gohVarM29780boximpl;
        }
        return null;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: singleOrNull-MShoTSo, reason: not valid java name */
    private static final oph m29451singleOrNullMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$singleOrNull");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        oph ophVarM31527boximpl = null;
        boolean z = false;
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            if (qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU)).booleanValue()) {
                if (z) {
                    return null;
                }
                ophVarM31527boximpl = oph.m31527boximpl(jM31843getsVKNKU);
                z = true;
            }
        }
        if (z) {
            return ophVarM31527boximpl;
        }
        return null;
    }

    @gib
    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: singleOrNull-QwZRm1k, reason: not valid java name */
    public static final oph m29452singleOrNullQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$singleOrNull");
        if (pph.m31844getSizeimpl(jArr) == 1) {
            return oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0));
        }
        return null;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: singleOrNull-jgv0xPQ, reason: not valid java name */
    private static final woh m29453singleOrNulljgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$singleOrNull");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        woh wohVarM32998boximpl = null;
        boolean z = false;
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            if (qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA)).booleanValue()) {
                if (z) {
                    return null;
                }
                wohVarM32998boximpl = woh.m32998boximpl(iM29590getpVg5ArA);
                z = true;
            }
        }
        if (z) {
            return wohVarM32998boximpl;
        }
        return null;
    }

    @gib
    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: singleOrNull-rL5Bavg, reason: not valid java name */
    public static final iqh m29454singleOrNullrL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$singleOrNull");
        if (jqh.m30552getSizeimpl(sArr) == 1) {
            return iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0));
        }
        return null;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: singleOrNull-xTcfx_M, reason: not valid java name */
    private static final iqh m29455singleOrNullxTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$singleOrNull");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        iqh iqhVarM30318boximpl = null;
        boolean z = false;
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            if (qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)).booleanValue()) {
                if (z) {
                    return null;
                }
                iqhVarM30318boximpl = iqh.m30318boximpl(sM30551getMh2AYeg);
                z = true;
            }
        }
        if (z) {
            return iqhVarM30318boximpl;
        }
        return null;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: slice-F7u83W8, reason: not valid java name */
    public static final List<oph> m29456sliceF7u83W8(@yfb long[] jArr, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(jArr, "$this$slice");
        md8.checkNotNullParameter(iterable, "indices");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, it.next().intValue())));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: slice-HwE9HBo, reason: not valid java name */
    public static final List<woh> m29457sliceHwE9HBo(@yfb int[] iArr, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(iArr, "$this$slice");
        md8.checkNotNullParameter(iterable, "indices");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, it.next().intValue())));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: slice-JGPC0-M, reason: not valid java name */
    public static final List<iqh> m29458sliceJGPC0M(@yfb short[] sArr, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(sArr, "$this$slice");
        md8.checkNotNullParameter(iterable, "indices");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, it.next().intValue())));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: slice-JQknh5Q, reason: not valid java name */
    public static final List<goh> m29459sliceJQknh5Q(@yfb byte[] bArr, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(bArr, "$this$slice");
        md8.checkNotNullParameter(iterable, "indices");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, it.next().intValue())));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: slice-Q6IL4kU, reason: not valid java name */
    public static final List<iqh> m29460sliceQ6IL4kU(@yfb short[] sArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(sArr, "$this$slice");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? l82.emptyList() : aoh.m27786asListrL5Bavg(jqh.m30546constructorimpl(u70.copyOfRange(sArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1)));
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: slice-ZRhS8yI, reason: not valid java name */
    public static final List<oph> m29461sliceZRhS8yI(@yfb long[] jArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(jArr, "$this$slice");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? l82.emptyList() : aoh.m27785asListQwZRm1k(pph.m31838constructorimpl(u70.copyOfRange(jArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1)));
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: slice-c0bezYM, reason: not valid java name */
    public static final List<goh> m29462slicec0bezYM(@yfb byte[] bArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(bArr, "$this$slice");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? l82.emptyList() : aoh.m27784asListGBYM_sE(hoh.m30083constructorimpl(u70.copyOfRange(bArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1)));
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: slice-tAntMlw, reason: not valid java name */
    public static final List<woh> m29463slicetAntMlw(@yfb int[] iArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(iArr, "$this$slice");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? l82.emptyList() : aoh.m27783asListajY9A(fph.m29585constructorimpl(u70.copyOfRange(iArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1)));
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sliceArray-CFIt9YE, reason: not valid java name */
    public static final int[] m29464sliceArrayCFIt9YE(@yfb int[] iArr, @yfb Collection<Integer> collection) {
        md8.checkNotNullParameter(iArr, "$this$sliceArray");
        md8.checkNotNullParameter(collection, "indices");
        return fph.m29585constructorimpl(e80.sliceArray(iArr, collection));
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sliceArray-Q6IL4kU, reason: not valid java name */
    public static final short[] m29465sliceArrayQ6IL4kU(@yfb short[] sArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(sArr, "$this$sliceArray");
        md8.checkNotNullParameter(f78Var, "indices");
        return jqh.m30546constructorimpl(e80.sliceArray(sArr, f78Var));
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sliceArray-ZRhS8yI, reason: not valid java name */
    public static final long[] m29466sliceArrayZRhS8yI(@yfb long[] jArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(jArr, "$this$sliceArray");
        md8.checkNotNullParameter(f78Var, "indices");
        return pph.m31838constructorimpl(e80.sliceArray(jArr, f78Var));
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sliceArray-c0bezYM, reason: not valid java name */
    public static final byte[] m29467sliceArrayc0bezYM(@yfb byte[] bArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(bArr, "$this$sliceArray");
        md8.checkNotNullParameter(f78Var, "indices");
        return hoh.m30083constructorimpl(e80.sliceArray(bArr, f78Var));
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sliceArray-kzHmqpY, reason: not valid java name */
    public static final long[] m29468sliceArraykzHmqpY(@yfb long[] jArr, @yfb Collection<Integer> collection) {
        md8.checkNotNullParameter(jArr, "$this$sliceArray");
        md8.checkNotNullParameter(collection, "indices");
        return pph.m31838constructorimpl(e80.sliceArray(jArr, collection));
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sliceArray-ojwP5H8, reason: not valid java name */
    public static final short[] m29469sliceArrayojwP5H8(@yfb short[] sArr, @yfb Collection<Integer> collection) {
        md8.checkNotNullParameter(sArr, "$this$sliceArray");
        md8.checkNotNullParameter(collection, "indices");
        return jqh.m30546constructorimpl(e80.sliceArray(sArr, collection));
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sliceArray-tAntMlw, reason: not valid java name */
    public static final int[] m29470sliceArraytAntMlw(@yfb int[] iArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(iArr, "$this$sliceArray");
        md8.checkNotNullParameter(f78Var, "indices");
        return fph.m29585constructorimpl(e80.sliceArray(iArr, f78Var));
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sliceArray-xo_DsdI, reason: not valid java name */
    public static final byte[] m29471sliceArrayxo_DsdI(@yfb byte[] bArr, @yfb Collection<Integer> collection) {
        md8.checkNotNullParameter(bArr, "$this$sliceArray");
        md8.checkNotNullParameter(collection, "indices");
        return hoh.m30083constructorimpl(e80.sliceArray(bArr, collection));
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: sort--ajY-9A, reason: not valid java name */
    public static final void m29472sortajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$sort");
        if (fph.m29591getSizeimpl(iArr) > 1) {
            ynh.m33398sortArrayoBK06Vg(iArr, 0, fph.m29591getSizeimpl(iArr));
        }
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: sort--nroSd4, reason: not valid java name */
    public static final void m29473sortnroSd4(@yfb long[] jArr, int i, int i2) {
        md8.checkNotNullParameter(jArr, "$this$sort");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, pph.m31844getSizeimpl(jArr));
        if (i < i2 - 1) {
            ynh.m33395sortArraynroSd4(jArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: sort--nroSd4$default, reason: not valid java name */
    public static /* synthetic */ void m29474sortnroSd4$default(long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = pph.m31844getSizeimpl(jArr);
        }
        m29473sortnroSd4(jArr, i, i2);
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: sort-4UcCI2c, reason: not valid java name */
    public static final void m29475sort4UcCI2c(@yfb byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "$this$sort");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, hoh.m30089getSizeimpl(bArr));
        if (i < i2 - 1) {
            ynh.m33396sortArray4UcCI2c(bArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: sort-4UcCI2c$default, reason: not valid java name */
    public static /* synthetic */ void m29476sort4UcCI2c$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = hoh.m30089getSizeimpl(bArr);
        }
        m29475sort4UcCI2c(bArr, i, i2);
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: sort-Aa5vz7o, reason: not valid java name */
    public static final void m29477sortAa5vz7o(@yfb short[] sArr, int i, int i2) {
        md8.checkNotNullParameter(sArr, "$this$sort");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, jqh.m30552getSizeimpl(sArr));
        if (i < i2 - 1) {
            ynh.m33397sortArrayAa5vz7o(sArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: sort-Aa5vz7o$default, reason: not valid java name */
    public static /* synthetic */ void m29478sortAa5vz7o$default(short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = jqh.m30552getSizeimpl(sArr);
        }
        m29477sortAa5vz7o(sArr, i, i2);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: sort-GBYM_sE, reason: not valid java name */
    public static final void m29479sortGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$sort");
        if (hoh.m30089getSizeimpl(bArr) > 1) {
            ynh.m33396sortArray4UcCI2c(bArr, 0, hoh.m30089getSizeimpl(bArr));
        }
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: sort-QwZRm1k, reason: not valid java name */
    public static final void m29480sortQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$sort");
        if (pph.m31844getSizeimpl(jArr) > 1) {
            ynh.m33395sortArraynroSd4(jArr, 0, pph.m31844getSizeimpl(jArr));
        }
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: sort-oBK06Vg, reason: not valid java name */
    public static final void m29481sortoBK06Vg(@yfb int[] iArr, int i, int i2) {
        md8.checkNotNullParameter(iArr, "$this$sort");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, fph.m29591getSizeimpl(iArr));
        if (i < i2 - 1) {
            ynh.m33398sortArrayoBK06Vg(iArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: sort-oBK06Vg$default, reason: not valid java name */
    public static /* synthetic */ void m29482sortoBK06Vg$default(int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = fph.m29591getSizeimpl(iArr);
        }
        m29481sortoBK06Vg(iArr, i, i2);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: sort-rL5Bavg, reason: not valid java name */
    public static final void m29483sortrL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$sort");
        if (jqh.m30552getSizeimpl(sArr) > 1) {
            ynh.m33397sortArrayAa5vz7o(sArr, 0, jqh.m30552getSizeimpl(sArr));
        }
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: sortDescending--ajY-9A, reason: not valid java name */
    public static final void m29484sortDescendingajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$sortDescending");
        if (fph.m29591getSizeimpl(iArr) > 1) {
            m29472sortajY9A(iArr);
            e80.reverse(iArr);
        }
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: sortDescending--nroSd4, reason: not valid java name */
    public static final void m29485sortDescendingnroSd4(@yfb long[] jArr, int i, int i2) {
        md8.checkNotNullParameter(jArr, "$this$sortDescending");
        m29473sortnroSd4(jArr, i, i2);
        e80.reverse(jArr, i, i2);
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: sortDescending-4UcCI2c, reason: not valid java name */
    public static final void m29486sortDescending4UcCI2c(@yfb byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "$this$sortDescending");
        m29475sort4UcCI2c(bArr, i, i2);
        e80.reverse(bArr, i, i2);
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: sortDescending-Aa5vz7o, reason: not valid java name */
    public static final void m29487sortDescendingAa5vz7o(@yfb short[] sArr, int i, int i2) {
        md8.checkNotNullParameter(sArr, "$this$sortDescending");
        m29477sortAa5vz7o(sArr, i, i2);
        e80.reverse(sArr, i, i2);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: sortDescending-GBYM_sE, reason: not valid java name */
    public static final void m29488sortDescendingGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$sortDescending");
        if (hoh.m30089getSizeimpl(bArr) > 1) {
            m29479sortGBYM_sE(bArr);
            e80.reverse(bArr);
        }
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: sortDescending-QwZRm1k, reason: not valid java name */
    public static final void m29489sortDescendingQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$sortDescending");
        if (pph.m31844getSizeimpl(jArr) > 1) {
            m29480sortQwZRm1k(jArr);
            e80.reverse(jArr);
        }
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: sortDescending-oBK06Vg, reason: not valid java name */
    public static final void m29490sortDescendingoBK06Vg(@yfb int[] iArr, int i, int i2) {
        md8.checkNotNullParameter(iArr, "$this$sortDescending");
        m29481sortoBK06Vg(iArr, i, i2);
        e80.reverse(iArr, i, i2);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: sortDescending-rL5Bavg, reason: not valid java name */
    public static final void m29491sortDescendingrL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$sortDescending");
        if (jqh.m30552getSizeimpl(sArr) > 1) {
            m29483sortrL5Bavg(sArr);
            e80.reverse(sArr);
        }
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sorted--ajY-9A, reason: not valid java name */
    public static final List<woh> m29492sortedajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$sorted");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM29585constructorimpl = fph.m29585constructorimpl(iArrCopyOf);
        m29472sortajY9A(iArrM29585constructorimpl);
        return aoh.m27783asListajY9A(iArrM29585constructorimpl);
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sorted-GBYM_sE, reason: not valid java name */
    public static final List<goh> m29493sortedGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$sorted");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM30083constructorimpl = hoh.m30083constructorimpl(bArrCopyOf);
        m29479sortGBYM_sE(bArrM30083constructorimpl);
        return aoh.m27784asListGBYM_sE(bArrM30083constructorimpl);
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sorted-QwZRm1k, reason: not valid java name */
    public static final List<oph> m29494sortedQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$sorted");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM31838constructorimpl = pph.m31838constructorimpl(jArrCopyOf);
        m29480sortQwZRm1k(jArrM31838constructorimpl);
        return aoh.m27785asListQwZRm1k(jArrM31838constructorimpl);
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sorted-rL5Bavg, reason: not valid java name */
    public static final List<iqh> m29495sortedrL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$sorted");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM30546constructorimpl = jqh.m30546constructorimpl(sArrCopyOf);
        m29483sortrL5Bavg(sArrM30546constructorimpl);
        return aoh.m27786asListrL5Bavg(sArrM30546constructorimpl);
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sortedArray--ajY-9A, reason: not valid java name */
    public static final int[] m29496sortedArrayajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$sortedArray");
        if (fph.m29593isEmptyimpl(iArr)) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM29585constructorimpl = fph.m29585constructorimpl(iArrCopyOf);
        m29472sortajY9A(iArrM29585constructorimpl);
        return iArrM29585constructorimpl;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sortedArray-GBYM_sE, reason: not valid java name */
    public static final byte[] m29497sortedArrayGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$sortedArray");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM30083constructorimpl = hoh.m30083constructorimpl(bArrCopyOf);
        m29479sortGBYM_sE(bArrM30083constructorimpl);
        return bArrM30083constructorimpl;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sortedArray-QwZRm1k, reason: not valid java name */
    public static final long[] m29498sortedArrayQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$sortedArray");
        if (pph.m31846isEmptyimpl(jArr)) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM31838constructorimpl = pph.m31838constructorimpl(jArrCopyOf);
        m29480sortQwZRm1k(jArrM31838constructorimpl);
        return jArrM31838constructorimpl;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sortedArray-rL5Bavg, reason: not valid java name */
    public static final short[] m29499sortedArrayrL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$sortedArray");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM30546constructorimpl = jqh.m30546constructorimpl(sArrCopyOf);
        m29483sortrL5Bavg(sArrM30546constructorimpl);
        return sArrM30546constructorimpl;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sortedArrayDescending--ajY-9A, reason: not valid java name */
    public static final int[] m29500sortedArrayDescendingajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$sortedArrayDescending");
        if (fph.m29593isEmptyimpl(iArr)) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM29585constructorimpl = fph.m29585constructorimpl(iArrCopyOf);
        m29484sortDescendingajY9A(iArrM29585constructorimpl);
        return iArrM29585constructorimpl;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sortedArrayDescending-GBYM_sE, reason: not valid java name */
    public static final byte[] m29501sortedArrayDescendingGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$sortedArrayDescending");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM30083constructorimpl = hoh.m30083constructorimpl(bArrCopyOf);
        m29488sortDescendingGBYM_sE(bArrM30083constructorimpl);
        return bArrM30083constructorimpl;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sortedArrayDescending-QwZRm1k, reason: not valid java name */
    public static final long[] m29502sortedArrayDescendingQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$sortedArrayDescending");
        if (pph.m31846isEmptyimpl(jArr)) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM31838constructorimpl = pph.m31838constructorimpl(jArrCopyOf);
        m29489sortDescendingQwZRm1k(jArrM31838constructorimpl);
        return jArrM31838constructorimpl;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sortedArrayDescending-rL5Bavg, reason: not valid java name */
    public static final short[] m29503sortedArrayDescendingrL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$sortedArrayDescending");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM30546constructorimpl = jqh.m30546constructorimpl(sArrCopyOf);
        m29491sortDescendingrL5Bavg(sArrM30546constructorimpl);
        return sArrM30546constructorimpl;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sortedDescending--ajY-9A, reason: not valid java name */
    public static final List<woh> m29504sortedDescendingajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$sortedDescending");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM29585constructorimpl = fph.m29585constructorimpl(iArrCopyOf);
        m29472sortajY9A(iArrM29585constructorimpl);
        return m29400reversedajY9A(iArrM29585constructorimpl);
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sortedDescending-GBYM_sE, reason: not valid java name */
    public static final List<goh> m29505sortedDescendingGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$sortedDescending");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM30083constructorimpl = hoh.m30083constructorimpl(bArrCopyOf);
        m29479sortGBYM_sE(bArrM30083constructorimpl);
        return m29401reversedGBYM_sE(bArrM30083constructorimpl);
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sortedDescending-QwZRm1k, reason: not valid java name */
    public static final List<oph> m29506sortedDescendingQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$sortedDescending");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM31838constructorimpl = pph.m31838constructorimpl(jArrCopyOf);
        m29480sortQwZRm1k(jArrM31838constructorimpl);
        return m29402reversedQwZRm1k(jArrM31838constructorimpl);
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: sortedDescending-rL5Bavg, reason: not valid java name */
    public static final List<iqh> m29507sortedDescendingrL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$sortedDescending");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM30546constructorimpl = jqh.m30546constructorimpl(sArrCopyOf);
        m29483sortrL5Bavg(sArrM30546constructorimpl);
        return m29403reversedrL5Bavg(sArrM30546constructorimpl);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: sum--ajY-9A, reason: not valid java name */
    private static final int m29508sumajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$sum");
        return woh.m33004constructorimpl(e80.sum(iArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: sum-GBYM_sE, reason: not valid java name */
    private static final int m29509sumGBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$sum");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + woh.m33004constructorimpl(hoh.m30088getw2LRezQ(bArr, i) & 255));
        }
        return iM33004constructorimpl;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: sum-QwZRm1k, reason: not valid java name */
    private static final long m29510sumQwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$sum");
        return oph.m31533constructorimpl(e80.sum(jArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: sum-rL5Bavg, reason: not valid java name */
    private static final int m29511sumrL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$sum");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + woh.m33004constructorimpl(jqh.m30551getMh2AYeg(sArr, i) & iqh.f48007d));
        }
        return iM33004constructorimpl;
    }

    @jjf(version = "1.3")
    @t28
    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: sumBy-JOV_ifY, reason: not valid java name */
    private static final int m29512sumByJOV_ifY(byte[] bArr, qy6<? super goh, woh> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$sumBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        int iM33004constructorimpl = 0;
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @jjf(version = "1.3")
    @t28
    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: sumBy-MShoTSo, reason: not valid java name */
    private static final int m29513sumByMShoTSo(long[] jArr, qy6<? super oph, woh> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$sumBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        int iM33004constructorimpl = 0;
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @jjf(version = "1.3")
    @t28
    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: sumBy-jgv0xPQ, reason: not valid java name */
    private static final int m29514sumByjgv0xPQ(int[] iArr, qy6<? super woh, woh> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$sumBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        int iM33004constructorimpl = 0;
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @jjf(version = "1.3")
    @t28
    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: sumBy-xTcfx_M, reason: not valid java name */
    private static final int m29515sumByxTcfx_M(short[] sArr, qy6<? super iqh, woh> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$sumBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        int iM33004constructorimpl = 0;
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @jjf(version = "1.3")
    @t28
    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: sumByDouble-JOV_ifY, reason: not valid java name */
    private static final double m29516sumByDoubleJOV_ifY(byte[] bArr, qy6<? super goh, Double> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$sumByDouble");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        double dDoubleValue = 0.0d;
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            dDoubleValue += qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).doubleValue();
        }
        return dDoubleValue;
    }

    @jjf(version = "1.3")
    @t28
    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: sumByDouble-MShoTSo, reason: not valid java name */
    private static final double m29517sumByDoubleMShoTSo(long[] jArr, qy6<? super oph, Double> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$sumByDouble");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        double dDoubleValue = 0.0d;
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            dDoubleValue += qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).doubleValue();
        }
        return dDoubleValue;
    }

    @jjf(version = "1.3")
    @t28
    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: sumByDouble-jgv0xPQ, reason: not valid java name */
    private static final double m29518sumByDoublejgv0xPQ(int[] iArr, qy6<? super woh, Double> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$sumByDouble");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        double dDoubleValue = 0.0d;
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            dDoubleValue += qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).doubleValue();
        }
        return dDoubleValue;
    }

    @jjf(version = "1.3")
    @t28
    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: sumByDouble-xTcfx_M, reason: not valid java name */
    private static final double m29519sumByDoublexTcfx_M(short[] sArr, qy6<? super iqh, Double> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$sumByDouble");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        double dDoubleValue = 0.0d;
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            dDoubleValue += qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfDouble")
    @yh5
    private static final double sumOfDouble(int[] iArr, qy6<? super woh, Double> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        double dDoubleValue = 0.0d;
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            dDoubleValue += qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfInt")
    @yh5
    private static final int sumOfInt(int[] iArr, qy6<? super woh, Integer> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        int iIntValue = 0;
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            iIntValue += qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).intValue();
        }
        return iIntValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfLong")
    @yh5
    private static final long sumOfLong(int[] iArr, qy6<? super woh, Long> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        long jLongValue = 0;
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            jLongValue += qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).longValue();
        }
        return jLongValue;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @xn8(name = "sumOfUByte")
    public static final int sumOfUByte(@yfb goh[] gohVarArr) {
        md8.checkNotNullParameter(gohVarArr, "<this>");
        int iM33004constructorimpl = 0;
        for (goh gohVar : gohVarArr) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + woh.m33004constructorimpl(gohVar.m29836unboximpl() & 255));
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfUInt")
    @ihi(markerClass = {yh5.class})
    @yh5
    private static final int sumOfUInt(int[] iArr, qy6<? super woh, woh> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfULong")
    @ihi(markerClass = {yh5.class})
    @yh5
    private static final long sumOfULong(int[] iArr, qy6<? super woh, oph> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jM31533constructorimpl = oph.m31533constructorimpl(0L);
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @xn8(name = "sumOfUShort")
    public static final int sumOfUShort(@yfb iqh[] iqhVarArr) {
        md8.checkNotNullParameter(iqhVarArr, "<this>");
        int iM33004constructorimpl = 0;
        for (iqh iqhVar : iqhVarArr) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + woh.m33004constructorimpl(iqhVar.m30374unboximpl() & iqh.f48007d));
        }
        return iM33004constructorimpl;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: take-PpDY95g, reason: not valid java name */
    public static final List<goh> m29520takePpDY95g(@yfb byte[] bArr, int i) {
        md8.checkNotNullParameter(bArr, "$this$take");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        if (i >= hoh.m30089getSizeimpl(bArr)) {
            return v82.toList(hoh.m30081boximpl(bArr));
        }
        if (i == 1) {
            return k82.listOf(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0)));
        }
        ArrayList arrayList = new ArrayList(i);
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        int i2 = 0;
        for (int i3 = 0; i3 < iM30089getSizeimpl; i3++) {
            arrayList.add(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i3)));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: take-nggk6HY, reason: not valid java name */
    public static final List<iqh> m29521takenggk6HY(@yfb short[] sArr, int i) {
        md8.checkNotNullParameter(sArr, "$this$take");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        if (i >= jqh.m30552getSizeimpl(sArr)) {
            return v82.toList(jqh.m30544boximpl(sArr));
        }
        if (i == 1) {
            return k82.listOf(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0)));
        }
        ArrayList arrayList = new ArrayList(i);
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        int i2 = 0;
        for (int i3 = 0; i3 < iM30552getSizeimpl; i3++) {
            arrayList.add(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i3)));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: take-qFRl0hI, reason: not valid java name */
    public static final List<woh> m29522takeqFRl0hI(@yfb int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "$this$take");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        if (i >= fph.m29591getSizeimpl(iArr)) {
            return v82.toList(fph.m29583boximpl(iArr));
        }
        if (i == 1) {
            return k82.listOf(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0)));
        }
        ArrayList arrayList = new ArrayList(i);
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        int i2 = 0;
        for (int i3 = 0; i3 < iM29591getSizeimpl; i3++) {
            arrayList.add(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i3)));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: take-r7IrZao, reason: not valid java name */
    public static final List<oph> m29523taker7IrZao(@yfb long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "$this$take");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        if (i >= pph.m31844getSizeimpl(jArr)) {
            return v82.toList(pph.m31836boximpl(jArr));
        }
        if (i == 1) {
            return k82.listOf(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0)));
        }
        ArrayList arrayList = new ArrayList(i);
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        int i2 = 0;
        for (int i3 = 0; i3 < iM31844getSizeimpl; i3++) {
            arrayList.add(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i3)));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: takeLast-PpDY95g, reason: not valid java name */
    public static final List<goh> m29524takeLastPpDY95g(@yfb byte[] bArr, int i) {
        md8.checkNotNullParameter(bArr, "$this$takeLast");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        if (i >= iM30089getSizeimpl) {
            return v82.toList(hoh.m30081boximpl(bArr));
        }
        if (i == 1) {
            return k82.listOf(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, iM30089getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = iM30089getSizeimpl - i; i2 < iM30089getSizeimpl; i2++) {
            arrayList.add(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i2)));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: takeLast-nggk6HY, reason: not valid java name */
    public static final List<iqh> m29525takeLastnggk6HY(@yfb short[] sArr, int i) {
        md8.checkNotNullParameter(sArr, "$this$takeLast");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        if (i >= iM30552getSizeimpl) {
            return v82.toList(jqh.m30544boximpl(sArr));
        }
        if (i == 1) {
            return k82.listOf(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, iM30552getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = iM30552getSizeimpl - i; i2 < iM30552getSizeimpl; i2++) {
            arrayList.add(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i2)));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: takeLast-qFRl0hI, reason: not valid java name */
    public static final List<woh> m29526takeLastqFRl0hI(@yfb int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "$this$takeLast");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        if (i >= iM29591getSizeimpl) {
            return v82.toList(fph.m29583boximpl(iArr));
        }
        if (i == 1) {
            return k82.listOf(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, iM29591getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = iM29591getSizeimpl - i; i2 < iM29591getSizeimpl; i2++) {
            arrayList.add(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i2)));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: takeLast-r7IrZao, reason: not valid java name */
    public static final List<oph> m29527takeLastr7IrZao(@yfb long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "$this$takeLast");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        if (i >= iM31844getSizeimpl) {
            return v82.toList(pph.m31836boximpl(jArr));
        }
        if (i == 1) {
            return k82.listOf(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, iM31844getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = iM31844getSizeimpl - i; i2 < iM31844getSizeimpl; i2++) {
            arrayList.add(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i2)));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: takeLastWhile-JOV_ifY, reason: not valid java name */
    private static final List<goh> m29528takeLastWhileJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$takeLastWhile");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = e80.getLastIndex(bArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, lastIndex))).booleanValue()) {
                return m28996dropPpDY95g(bArr, lastIndex + 1);
            }
        }
        return v82.toList(hoh.m30081boximpl(bArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: takeLastWhile-MShoTSo, reason: not valid java name */
    private static final List<oph> m29529takeLastWhileMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$takeLastWhile");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = e80.getLastIndex(jArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, lastIndex))).booleanValue()) {
                return m28999dropr7IrZao(jArr, lastIndex + 1);
            }
        }
        return v82.toList(pph.m31836boximpl(jArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: takeLastWhile-jgv0xPQ, reason: not valid java name */
    private static final List<woh> m29530takeLastWhilejgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$takeLastWhile");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = e80.getLastIndex(iArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, lastIndex))).booleanValue()) {
                return m28998dropqFRl0hI(iArr, lastIndex + 1);
            }
        }
        return v82.toList(fph.m29583boximpl(iArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: takeLastWhile-xTcfx_M, reason: not valid java name */
    private static final List<iqh> m29531takeLastWhilexTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$takeLastWhile");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = e80.getLastIndex(sArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, lastIndex))).booleanValue()) {
                return m28997dropnggk6HY(sArr, lastIndex + 1);
            }
        }
        return v82.toList(jqh.m30544boximpl(sArr));
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: takeWhile-JOV_ifY, reason: not valid java name */
    private static final List<goh> m29532takeWhileJOV_ifY(byte[] bArr, qy6<? super goh, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$takeWhile");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            if (!qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ)).booleanValue()) {
                break;
            }
            arrayList.add(goh.m29780boximpl(bM30088getw2LRezQ));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: takeWhile-MShoTSo, reason: not valid java name */
    private static final List<oph> m29533takeWhileMShoTSo(long[] jArr, qy6<? super oph, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$takeWhile");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            if (!qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU)).booleanValue()) {
                break;
            }
            arrayList.add(oph.m31527boximpl(jM31843getsVKNKU));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: takeWhile-jgv0xPQ, reason: not valid java name */
    private static final List<woh> m29534takeWhilejgv0xPQ(int[] iArr, qy6<? super woh, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$takeWhile");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            if (!qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA)).booleanValue()) {
                break;
            }
            arrayList.add(woh.m32998boximpl(iM29590getpVg5ArA));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: takeWhile-xTcfx_M, reason: not valid java name */
    private static final List<iqh> m29535takeWhilexTcfx_M(short[] sArr, qy6<? super iqh, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$takeWhile");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            if (!qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg)).booleanValue()) {
                break;
            }
            arrayList.add(iqh.m30318boximpl(sM30551getMh2AYeg));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: toByteArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m29536toByteArrayGBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$toByteArray");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: toIntArray--ajY-9A, reason: not valid java name */
    private static final int[] m29537toIntArrayajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$toIntArray");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: toLongArray-QwZRm1k, reason: not valid java name */
    private static final long[] m29538toLongArrayQwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$toLongArray");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: toShortArray-rL5Bavg, reason: not valid java name */
    private static final short[] m29539toShortArrayrL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$toShortArray");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: toTypedArray--ajY-9A, reason: not valid java name */
    public static final woh[] m29540toTypedArrayajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$toTypedArray");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        woh[] wohVarArr = new woh[iM29591getSizeimpl];
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            wohVarArr[i] = woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i));
        }
        return wohVarArr;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: toTypedArray-GBYM_sE, reason: not valid java name */
    public static final goh[] m29541toTypedArrayGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$toTypedArray");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        goh[] gohVarArr = new goh[iM30089getSizeimpl];
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            gohVarArr[i] = goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i));
        }
        return gohVarArr;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: toTypedArray-QwZRm1k, reason: not valid java name */
    public static final oph[] m29542toTypedArrayQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$toTypedArray");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        oph[] ophVarArr = new oph[iM31844getSizeimpl];
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            ophVarArr[i] = oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i));
        }
        return ophVarArr;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: toTypedArray-rL5Bavg, reason: not valid java name */
    public static final iqh[] m29543toTypedArrayrL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$toTypedArray");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        iqh[] iqhVarArr = new iqh[iM30552getSizeimpl];
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            iqhVarArr[i] = iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i));
        }
        return iqhVarArr;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    public static final byte[] toUByteArray(@yfb goh[] gohVarArr) {
        md8.checkNotNullParameter(gohVarArr, "<this>");
        int length = gohVarArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = gohVarArr[i].m29836unboximpl();
        }
        return hoh.m30083constructorimpl(bArr);
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    public static final int[] toUIntArray(@yfb woh[] wohVarArr) {
        md8.checkNotNullParameter(wohVarArr, "<this>");
        int length = wohVarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = wohVarArr[i].m33056unboximpl();
        }
        return fph.m29585constructorimpl(iArr);
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    public static final long[] toULongArray(@yfb oph[] ophVarArr) {
        md8.checkNotNullParameter(ophVarArr, "<this>");
        int length = ophVarArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ophVarArr[i].m31585unboximpl();
        }
        return pph.m31838constructorimpl(jArr);
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    public static final short[] toUShortArray(@yfb iqh[] iqhVarArr) {
        md8.checkNotNullParameter(iqhVarArr, "<this>");
        int length = iqhVarArr.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = iqhVarArr[i].m30374unboximpl();
        }
        return jqh.m30546constructorimpl(sArr);
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: withIndex--ajY-9A, reason: not valid java name */
    public static final Iterable<q08<woh>> m29544withIndexajY9A(@yfb final int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$withIndex");
        return new r08(new ny6() { // from class: boh
            @Override // p000.ny6
            public final Object invoke() {
                return fph.m29594iteratorimpl(iArr);
            }
        });
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: withIndex-GBYM_sE, reason: not valid java name */
    public static final Iterable<q08<goh>> m29545withIndexGBYM_sE(@yfb final byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$withIndex");
        return new r08(new ny6() { // from class: doh
            @Override // p000.ny6
            public final Object invoke() {
                return hoh.m30092iteratorimpl(bArr);
            }
        });
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: withIndex-QwZRm1k, reason: not valid java name */
    public static final Iterable<q08<oph>> m29546withIndexQwZRm1k(@yfb final long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$withIndex");
        return new r08(new ny6() { // from class: coh
            @Override // p000.ny6
            public final Object invoke() {
                return pph.m31847iteratorimpl(jArr);
            }
        });
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: withIndex-rL5Bavg, reason: not valid java name */
    public static final Iterable<q08<iqh>> m29547withIndexrL5Bavg(@yfb final short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$withIndex");
        return new r08(new ny6() { // from class: eoh
            @Override // p000.ny6
            public final Object invoke() {
                return jqh.m30555iteratorimpl(sArr);
            }
        });
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: zip-7znnbtw, reason: not valid java name */
    private static final <R, V> List<V> m29548zip7znnbtw(int[] iArr, Iterable<? extends R> iterable, gz6<? super woh, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$zip");
        md8.checkNotNullParameter(iterable, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), iM29591getSizeimpl));
        int i = 0;
        for (R r : iterable) {
            if (i >= iM29591getSizeimpl) {
                break;
            }
            arrayList.add(gz6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)), r));
            i++;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: zip-8LME4QE, reason: not valid java name */
    private static final <R, V> List<V> m29549zip8LME4QE(long[] jArr, R[] rArr, gz6<? super oph, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$zip");
        md8.checkNotNullParameter(rArr, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(pph.m31844getSizeimpl(jArr), rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)), rArr[i]));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: zip-C-E_24M, reason: not valid java name */
    public static final <R> List<scc<woh, R>> m29550zipCE_24M(@yfb int[] iArr, @yfb R[] rArr) {
        md8.checkNotNullParameter(iArr, "$this$zip");
        md8.checkNotNullParameter(rArr, "other");
        int iMin = Math.min(fph.m29591getSizeimpl(iArr), rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, i);
            arrayList.add(vkh.m24050to(woh.m32998boximpl(iM29590getpVg5ArA), rArr[i]));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: zip-F7u83W8, reason: not valid java name */
    public static final <R> List<scc<oph, R>> m29551zipF7u83W8(@yfb long[] jArr, @yfb Iterable<? extends R> iterable) {
        md8.checkNotNullParameter(jArr, "$this$zip");
        md8.checkNotNullParameter(iterable, "other");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), iM31844getSizeimpl));
        int i = 0;
        for (R r : iterable) {
            if (i >= iM31844getSizeimpl) {
                break;
            }
            arrayList.add(vkh.m24050to(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)), r));
            i++;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: zip-HwE9HBo, reason: not valid java name */
    public static final <R> List<scc<woh, R>> m29552zipHwE9HBo(@yfb int[] iArr, @yfb Iterable<? extends R> iterable) {
        md8.checkNotNullParameter(iArr, "$this$zip");
        md8.checkNotNullParameter(iterable, "other");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), iM29591getSizeimpl));
        int i = 0;
        for (R r : iterable) {
            if (i >= iM29591getSizeimpl) {
                break;
            }
            arrayList.add(vkh.m24050to(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)), r));
            i++;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: zip-JAKpvQM, reason: not valid java name */
    private static final <V> List<V> m29553zipJAKpvQM(byte[] bArr, byte[] bArr2, gz6<? super goh, ? super goh, ? extends V> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$zip");
        md8.checkNotNullParameter(bArr2, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(hoh.m30089getSizeimpl(bArr), hoh.m30089getSizeimpl(bArr2));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr2, i))));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: zip-JGPC0-M, reason: not valid java name */
    public static final <R> List<scc<iqh, R>> m29554zipJGPC0M(@yfb short[] sArr, @yfb Iterable<? extends R> iterable) {
        md8.checkNotNullParameter(sArr, "$this$zip");
        md8.checkNotNullParameter(iterable, "other");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), iM30552getSizeimpl));
        int i = 0;
        for (R r : iterable) {
            if (i >= iM30552getSizeimpl) {
                break;
            }
            arrayList.add(vkh.m24050to(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)), r));
            i++;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: zip-JQknh5Q, reason: not valid java name */
    public static final <R> List<scc<goh, R>> m29555zipJQknh5Q(@yfb byte[] bArr, @yfb Iterable<? extends R> iterable) {
        md8.checkNotNullParameter(bArr, "$this$zip");
        md8.checkNotNullParameter(iterable, "other");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), iM30089getSizeimpl));
        int i = 0;
        for (R r : iterable) {
            if (i >= iM30089getSizeimpl) {
                break;
            }
            arrayList.add(vkh.m24050to(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)), r));
            i++;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: zip-L83TJbI, reason: not valid java name */
    private static final <V> List<V> m29556zipL83TJbI(int[] iArr, int[] iArr2, gz6<? super woh, ? super woh, ? extends V> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$zip");
        md8.checkNotNullParameter(iArr2, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(fph.m29591getSizeimpl(iArr), fph.m29591getSizeimpl(iArr2));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr2, i))));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: zip-LuipOMY, reason: not valid java name */
    private static final <R, V> List<V> m29557zipLuipOMY(byte[] bArr, R[] rArr, gz6<? super goh, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$zip");
        md8.checkNotNullParameter(rArr, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(hoh.m30089getSizeimpl(bArr), rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)), rArr[i]));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: zip-PabeH-Q, reason: not valid java name */
    private static final <V> List<V> m29558zipPabeHQ(long[] jArr, long[] jArr2, gz6<? super oph, ? super oph, ? extends V> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$zip");
        md8.checkNotNullParameter(jArr2, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(pph.m31844getSizeimpl(jArr), pph.m31844getSizeimpl(jArr2));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)), oph.m31527boximpl(pph.m31843getsVKNKU(jArr2, i))));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: zip-TUPTUsU, reason: not valid java name */
    private static final <R, V> List<V> m29559zipTUPTUsU(long[] jArr, Iterable<? extends R> iterable, gz6<? super oph, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(jArr, "$this$zip");
        md8.checkNotNullParameter(iterable, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), iM31844getSizeimpl));
        int i = 0;
        for (R r : iterable) {
            if (i >= iM31844getSizeimpl) {
                break;
            }
            arrayList.add(gz6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)), r));
            i++;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: zip-UCnP4_w, reason: not valid java name */
    private static final <R, V> List<V> m29560zipUCnP4_w(byte[] bArr, Iterable<? extends R> iterable, gz6<? super goh, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(bArr, "$this$zip");
        md8.checkNotNullParameter(iterable, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), iM30089getSizeimpl));
        int i = 0;
        for (R r : iterable) {
            if (i >= iM30089getSizeimpl) {
                break;
            }
            arrayList.add(gz6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)), r));
            i++;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: zip-ZjwqOic, reason: not valid java name */
    private static final <R, V> List<V> m29561zipZjwqOic(int[] iArr, R[] rArr, gz6<? super woh, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(iArr, "$this$zip");
        md8.checkNotNullParameter(rArr, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(fph.m29591getSizeimpl(iArr), rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)), rArr[i]));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: zip-ctEhBpI, reason: not valid java name */
    public static final List<scc<woh, woh>> m29562zipctEhBpI(@yfb int[] iArr, @yfb int[] iArr2) {
        md8.checkNotNullParameter(iArr, "$this$zip");
        md8.checkNotNullParameter(iArr2, "other");
        int iMin = Math.min(fph.m29591getSizeimpl(iArr), fph.m29591getSizeimpl(iArr2));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(vkh.m24050to(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)), woh.m32998boximpl(fph.m29590getpVg5ArA(iArr2, i))));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: zip-ePBmRWY, reason: not valid java name */
    private static final <R, V> List<V> m29563zipePBmRWY(short[] sArr, R[] rArr, gz6<? super iqh, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$zip");
        md8.checkNotNullParameter(rArr, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(jqh.m30552getSizeimpl(sArr), rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)), rArr[i]));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: zip-f7H3mmw, reason: not valid java name */
    public static final <R> List<scc<oph, R>> m29564zipf7H3mmw(@yfb long[] jArr, @yfb R[] rArr) {
        md8.checkNotNullParameter(jArr, "$this$zip");
        md8.checkNotNullParameter(rArr, "other");
        int iMin = Math.min(pph.m31844getSizeimpl(jArr), rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, i);
            arrayList.add(vkh.m24050to(oph.m31527boximpl(jM31843getsVKNKU), rArr[i]));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: zip-gVVukQo, reason: not valid java name */
    private static final <V> List<V> m29565zipgVVukQo(short[] sArr, short[] sArr2, gz6<? super iqh, ? super iqh, ? extends V> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$zip");
        md8.checkNotNullParameter(sArr2, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(jqh.m30552getSizeimpl(sArr), jqh.m30552getSizeimpl(sArr2));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr2, i))));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: zip-kBb4a-s, reason: not valid java name */
    private static final <R, V> List<V> m29566zipkBb4as(short[] sArr, Iterable<? extends R> iterable, gz6<? super iqh, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(sArr, "$this$zip");
        md8.checkNotNullParameter(iterable, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), iM30552getSizeimpl));
        int i = 0;
        for (R r : iterable) {
            if (i >= iM30552getSizeimpl) {
                break;
            }
            arrayList.add(gz6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)), r));
            i++;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: zip-kdPth3s, reason: not valid java name */
    public static final List<scc<goh, goh>> m29567zipkdPth3s(@yfb byte[] bArr, @yfb byte[] bArr2) {
        md8.checkNotNullParameter(bArr, "$this$zip");
        md8.checkNotNullParameter(bArr2, "other");
        int iMin = Math.min(hoh.m30089getSizeimpl(bArr), hoh.m30089getSizeimpl(bArr2));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(vkh.m24050to(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)), goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr2, i))));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: zip-mazbYpA, reason: not valid java name */
    public static final List<scc<iqh, iqh>> m29568zipmazbYpA(@yfb short[] sArr, @yfb short[] sArr2) {
        md8.checkNotNullParameter(sArr, "$this$zip");
        md8.checkNotNullParameter(sArr2, "other");
        int iMin = Math.min(jqh.m30552getSizeimpl(sArr), jqh.m30552getSizeimpl(sArr2));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(vkh.m24050to(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)), iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr2, i))));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: zip-nl983wc, reason: not valid java name */
    public static final <R> List<scc<goh, R>> m29569zipnl983wc(@yfb byte[] bArr, @yfb R[] rArr) {
        md8.checkNotNullParameter(bArr, "$this$zip");
        md8.checkNotNullParameter(rArr, "other");
        int iMin = Math.min(hoh.m30089getSizeimpl(bArr), rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, i);
            arrayList.add(vkh.m24050to(goh.m29780boximpl(bM30088getw2LRezQ), rArr[i]));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: zip-uaTIQ5s, reason: not valid java name */
    public static final <R> List<scc<iqh, R>> m29570zipuaTIQ5s(@yfb short[] sArr, @yfb R[] rArr) {
        md8.checkNotNullParameter(sArr, "$this$zip");
        md8.checkNotNullParameter(rArr, "other");
        int iMin = Math.min(jqh.m30552getSizeimpl(sArr), rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i);
            arrayList.add(vkh.m24050to(iqh.m30318boximpl(sM30551getMh2AYeg), rArr[i]));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: zip-us8wMrg, reason: not valid java name */
    public static final List<scc<oph, oph>> m29571zipus8wMrg(@yfb long[] jArr, @yfb long[] jArr2) {
        md8.checkNotNullParameter(jArr, "$this$zip");
        md8.checkNotNullParameter(jArr2, "other");
        int iMin = Math.min(pph.m31844getSizeimpl(jArr), pph.m31844getSizeimpl(jArr2));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(vkh.m24050to(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)), oph.m31527boximpl(pph.m31843getsVKNKU(jArr2, i))));
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    private static final byte[] toUByteArray(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return hoh.m30083constructorimpl(bArrCopyOf);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    private static final int[] toUIntArray(int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return fph.m29585constructorimpl(iArrCopyOf);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    private static final long[] toULongArray(long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return pph.m31838constructorimpl(jArrCopyOf);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    private static final short[] toUShortArray(short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return jqh.m30546constructorimpl(sArrCopyOf);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfDouble")
    @yh5
    private static final double sumOfDouble(long[] jArr, qy6<? super oph, Double> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        double dDoubleValue = 0.0d;
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            dDoubleValue += qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfInt")
    @yh5
    private static final int sumOfInt(long[] jArr, qy6<? super oph, Integer> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        int iIntValue = 0;
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            iIntValue += qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).intValue();
        }
        return iIntValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfLong")
    @yh5
    private static final long sumOfLong(long[] jArr, qy6<? super oph, Long> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        long jLongValue = 0;
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            jLongValue += qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).longValue();
        }
        return jLongValue;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfUInt")
    @ihi(markerClass = {yh5.class})
    @yh5
    private static final int sumOfUInt(long[] jArr, qy6<? super oph, woh> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfULong")
    @ihi(markerClass = {yh5.class})
    @yh5
    private static final long sumOfULong(long[] jArr, qy6<? super oph, oph> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jM31533constructorimpl = oph.m31533constructorimpl(0L);
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfDouble")
    @yh5
    private static final double sumOfDouble(byte[] bArr, qy6<? super goh, Double> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        double dDoubleValue = 0.0d;
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            dDoubleValue += qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfInt")
    @yh5
    private static final int sumOfInt(byte[] bArr, qy6<? super goh, Integer> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        int iIntValue = 0;
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            iIntValue += qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).intValue();
        }
        return iIntValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfLong")
    @yh5
    private static final long sumOfLong(byte[] bArr, qy6<? super goh, Long> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        long jLongValue = 0;
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            jLongValue += qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).longValue();
        }
        return jLongValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final float m29213maxOfJOV_ifY(byte[] bArr, qy6<? super goh, Float> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$maxOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!hoh.m30091isEmptyimpl(bArr)) {
            float fFloatValue = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0))).floatValue();
            int lastIndex = e80.getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final float m29216maxOfMShoTSo(long[] jArr, qy6<? super oph, Float> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$maxOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!pph.m31846isEmptyimpl(jArr)) {
            float fFloatValue = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0))).floatValue();
            int lastIndex = e80.getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final float m29219maxOfjgv0xPQ(int[] iArr, qy6<? super woh, Float> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$maxOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!fph.m29593isEmptyimpl(iArr)) {
            float fFloatValue = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0))).floatValue();
            int lastIndex = e80.getLastIndex(iArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final float m29222maxOfxTcfx_M(short[] sArr, qy6<? super iqh, Float> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$maxOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!jqh.m30554isEmptyimpl(sArr)) {
            float fFloatValue = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0))).floatValue();
            int lastIndex = e80.getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Float m29226maxOfOrNullJOV_ifY(byte[] bArr, qy6<? super goh, Float> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$maxOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0))).floatValue();
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final Float m29229maxOfOrNullMShoTSo(long[] jArr, qy6<? super oph, Float> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$maxOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0))).floatValue();
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Float m29232maxOfOrNulljgv0xPQ(int[] iArr, qy6<? super woh, Float> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$maxOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0))).floatValue();
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Float m29235maxOfOrNullxTcfx_M(short[] sArr, qy6<? super iqh, Float> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$maxOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0))).floatValue();
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final long m29250maxOrThrowU(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$max");
        if (!pph.m31846isEmptyimpl(jArr)) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
            int lastIndex = e80.getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM31843getsVKNKU2 = pph.m31843getsVKNKU(jArr, i);
                    if (Long.compareUnsigned(jM31843getsVKNKU, jM31843getsVKNKU2) < 0) {
                        jM31843getsVKNKU = jM31843getsVKNKU2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return jM31843getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "maxWithOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final long m29258maxWithOrThrowU(@yfb long[] jArr, @yfb Comparator<? super oph> comparator) {
        md8.checkNotNullParameter(jArr, "$this$maxWith");
        md8.checkNotNullParameter(comparator, "comparator");
        if (!pph.m31846isEmptyimpl(jArr)) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
            int lastIndex = e80.getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM31843getsVKNKU2 = pph.m31843getsVKNKU(jArr, i);
                    if (comparator.compare(oph.m31527boximpl(jM31843getsVKNKU), oph.m31527boximpl(jM31843getsVKNKU2)) < 0) {
                        jM31843getsVKNKU = jM31843getsVKNKU2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return jM31843getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final float m29269minOfJOV_ifY(byte[] bArr, qy6<? super goh, Float> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$minOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!hoh.m30091isEmptyimpl(bArr)) {
            float fFloatValue = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0))).floatValue();
            int lastIndex = e80.getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final float m29272minOfMShoTSo(long[] jArr, qy6<? super oph, Float> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$minOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!pph.m31846isEmptyimpl(jArr)) {
            float fFloatValue = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0))).floatValue();
            int lastIndex = e80.getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final float m29275minOfjgv0xPQ(int[] iArr, qy6<? super woh, Float> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$minOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!fph.m29593isEmptyimpl(iArr)) {
            float fFloatValue = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0))).floatValue();
            int lastIndex = e80.getLastIndex(iArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final float m29278minOfxTcfx_M(short[] sArr, qy6<? super iqh, Float> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$minOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!jqh.m30554isEmptyimpl(sArr)) {
            float fFloatValue = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0))).floatValue();
            int lastIndex = e80.getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Float m29282minOfOrNullJOV_ifY(byte[] bArr, qy6<? super goh, Float> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$minOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0))).floatValue();
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final Float m29285minOfOrNullMShoTSo(long[] jArr, qy6<? super oph, Float> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$minOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0))).floatValue();
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Float m29288minOfOrNulljgv0xPQ(int[] iArr, qy6<? super woh, Float> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$minOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0))).floatValue();
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Float m29291minOfOrNullxTcfx_M(short[] sArr, qy6<? super iqh, Float> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$minOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0))).floatValue();
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final long m29306minOrThrowU(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$min");
        if (!pph.m31846isEmptyimpl(jArr)) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
            int lastIndex = e80.getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM31843getsVKNKU2 = pph.m31843getsVKNKU(jArr, i);
                    if (Long.compareUnsigned(jM31843getsVKNKU, jM31843getsVKNKU2) > 0) {
                        jM31843getsVKNKU = jM31843getsVKNKU2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return jM31843getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minWithOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final long m29314minWithOrThrowU(@yfb long[] jArr, @yfb Comparator<? super oph> comparator) {
        md8.checkNotNullParameter(jArr, "$this$minWith");
        md8.checkNotNullParameter(comparator, "comparator");
        if (!pph.m31846isEmptyimpl(jArr)) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
            int lastIndex = e80.getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM31843getsVKNKU2 = pph.m31843getsVKNKU(jArr, i);
                    if (comparator.compare(oph.m31527boximpl(jM31843getsVKNKU), oph.m31527boximpl(jM31843getsVKNKU2)) > 0) {
                        jM31843getsVKNKU = jM31843getsVKNKU2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return jM31843getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfDouble")
    @yh5
    private static final double sumOfDouble(short[] sArr, qy6<? super iqh, Double> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        double dDoubleValue = 0.0d;
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            dDoubleValue += qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfInt")
    @yh5
    private static final int sumOfInt(short[] sArr, qy6<? super iqh, Integer> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        int iIntValue = 0;
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            iIntValue += qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).intValue();
        }
        return iIntValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfLong")
    @yh5
    private static final long sumOfLong(short[] sArr, qy6<? super iqh, Long> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        long jLongValue = 0;
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            jLongValue += qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).longValue();
        }
        return jLongValue;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfUInt")
    @ihi(markerClass = {yh5.class})
    @yh5
    private static final int sumOfUInt(byte[] bArr, qy6<? super goh, woh> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfULong")
    @ihi(markerClass = {yh5.class})
    @yh5
    private static final long sumOfULong(byte[] bArr, qy6<? super goh, oph> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jM31533constructorimpl = oph.m31533constructorimpl(0L);
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))).m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @jjf(version = "1.7")
    @t28
    @xn8(name = "maxByOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> long m29210maxByOrThrowU(long[] jArr, qy6<? super oph, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$maxBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!pph.m31846isEmptyimpl(jArr)) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
            int lastIndex = e80.getLastIndex(jArr);
            if (lastIndex == 0) {
                return jM31843getsVKNKU;
            }
            R rInvoke = qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM31843getsVKNKU2 = pph.m31843getsVKNKU(jArr, i);
                    R rInvoke2 = qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        jM31843getsVKNKU = jM31843getsVKNKU2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return jM31843getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @t28
    @xn8(name = "minByOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> long m29266minByOrThrowU(long[] jArr, qy6<? super oph, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$minBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!pph.m31846isEmptyimpl(jArr)) {
            long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
            int lastIndex = e80.getLastIndex(jArr);
            if (lastIndex == 0) {
                return jM31843getsVKNKU;
            }
            R rInvoke = qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM31843getsVKNKU2 = pph.m31843getsVKNKU(jArr, i);
                    R rInvoke2 = qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        jM31843getsVKNKU = jM31843getsVKNKU2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return jM31843getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfUInt")
    @ihi(markerClass = {yh5.class})
    @yh5
    private static final int sumOfUInt(short[] sArr, qy6<? super iqh, woh> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfULong")
    @ihi(markerClass = {yh5.class})
    @yh5
    private static final long sumOfULong(short[] sArr, qy6<? super iqh, oph> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jM31533constructorimpl = oph.m31533constructorimpl(0L);
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))).m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m29214maxOfJOV_ifY(byte[] bArr, qy6<? super goh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$maxOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!hoh.m30091isEmptyimpl(bArr)) {
            R rInvoke = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0)));
            int lastIndex = e80.getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m29217maxOfMShoTSo(long[] jArr, qy6<? super oph, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$maxOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!pph.m31846isEmptyimpl(jArr)) {
            R rInvoke = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0)));
            int lastIndex = e80.getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m29220maxOfjgv0xPQ(int[] iArr, qy6<? super woh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$maxOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!fph.m29593isEmptyimpl(iArr)) {
            R rInvoke = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0)));
            int lastIndex = e80.getLastIndex(iArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m29223maxOfxTcfx_M(short[] sArr, qy6<? super iqh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$maxOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!jqh.m30554isEmptyimpl(sArr)) {
            R rInvoke = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0)));
            int lastIndex = e80.getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m29224maxOfOrNullJOV_ifY(byte[] bArr, qy6<? super goh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$maxOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        R rInvoke = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0)));
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m29227maxOfOrNullMShoTSo(long[] jArr, qy6<? super oph, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$maxOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        R rInvoke = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0)));
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m29230maxOfOrNulljgv0xPQ(int[] iArr, qy6<? super woh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$maxOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        R rInvoke = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0)));
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m29233maxOfOrNullxTcfx_M(short[] sArr, qy6<? super iqh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$maxOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        R rInvoke = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0)));
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final byte m29248maxOrThrowU(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$max");
        if (!hoh.m30091isEmptyimpl(bArr)) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
            int lastIndex = e80.getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM30088getw2LRezQ2 = hoh.m30088getw2LRezQ(bArr, i);
                    if (md8.compare(bM30088getw2LRezQ & 255, bM30088getw2LRezQ2 & 255) < 0) {
                        bM30088getw2LRezQ = bM30088getw2LRezQ2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return bM30088getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "maxWithOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final byte m29256maxWithOrThrowU(@yfb byte[] bArr, @yfb Comparator<? super goh> comparator) {
        md8.checkNotNullParameter(bArr, "$this$maxWith");
        md8.checkNotNullParameter(comparator, "comparator");
        if (!hoh.m30091isEmptyimpl(bArr)) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
            int lastIndex = e80.getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM30088getw2LRezQ2 = hoh.m30088getw2LRezQ(bArr, i);
                    if (comparator.compare(goh.m29780boximpl(bM30088getw2LRezQ), goh.m29780boximpl(bM30088getw2LRezQ2)) < 0) {
                        bM30088getw2LRezQ = bM30088getw2LRezQ2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return bM30088getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m29270minOfJOV_ifY(byte[] bArr, qy6<? super goh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$minOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!hoh.m30091isEmptyimpl(bArr)) {
            R rInvoke = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0)));
            int lastIndex = e80.getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m29273minOfMShoTSo(long[] jArr, qy6<? super oph, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$minOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!pph.m31846isEmptyimpl(jArr)) {
            R rInvoke = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0)));
            int lastIndex = e80.getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m29276minOfjgv0xPQ(int[] iArr, qy6<? super woh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$minOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!fph.m29593isEmptyimpl(iArr)) {
            R rInvoke = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0)));
            int lastIndex = e80.getLastIndex(iArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m29279minOfxTcfx_M(short[] sArr, qy6<? super iqh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$minOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!jqh.m30554isEmptyimpl(sArr)) {
            R rInvoke = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0)));
            int lastIndex = e80.getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m29280minOfOrNullJOV_ifY(byte[] bArr, qy6<? super goh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$minOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        R rInvoke = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, 0)));
        int lastIndex = e80.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m29283minOfOrNullMShoTSo(long[] jArr, qy6<? super oph, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$minOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        R rInvoke = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, 0)));
        int lastIndex = e80.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m29286minOfOrNulljgv0xPQ(int[] iArr, qy6<? super woh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$minOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        R rInvoke = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, 0)));
        int lastIndex = e80.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @yh5
    /* JADX INFO: renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m29289minOfOrNullxTcfx_M(short[] sArr, qy6<? super iqh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$minOfOrNull");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        R rInvoke = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, 0)));
        int lastIndex = e80.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final byte m29304minOrThrowU(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$min");
        if (!hoh.m30091isEmptyimpl(bArr)) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
            int lastIndex = e80.getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM30088getw2LRezQ2 = hoh.m30088getw2LRezQ(bArr, i);
                    if (md8.compare(bM30088getw2LRezQ & 255, bM30088getw2LRezQ2 & 255) > 0) {
                        bM30088getw2LRezQ = bM30088getw2LRezQ2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return bM30088getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minWithOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final byte m29312minWithOrThrowU(@yfb byte[] bArr, @yfb Comparator<? super goh> comparator) {
        md8.checkNotNullParameter(bArr, "$this$minWith");
        md8.checkNotNullParameter(comparator, "comparator");
        if (!hoh.m30091isEmptyimpl(bArr)) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
            int lastIndex = e80.getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM30088getw2LRezQ2 = hoh.m30088getw2LRezQ(bArr, i);
                    if (comparator.compare(goh.m29780boximpl(bM30088getw2LRezQ), goh.m29780boximpl(bM30088getw2LRezQ2)) > 0) {
                        bM30088getw2LRezQ = bM30088getw2LRezQ2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return bM30088getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @xn8(name = "sumOfUInt")
    public static final int sumOfUInt(@yfb woh[] wohVarArr) {
        md8.checkNotNullParameter(wohVarArr, "<this>");
        int iM33004constructorimpl = 0;
        for (woh wohVar : wohVarArr) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + wohVar.m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @xn8(name = "sumOfULong")
    public static final long sumOfULong(@yfb oph[] ophVarArr) {
        md8.checkNotNullParameter(ophVarArr, "<this>");
        long jM31533constructorimpl = 0;
        for (oph ophVar : ophVarArr) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + ophVar.m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @jjf(version = "1.7")
    @t28
    @xn8(name = "maxByOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> byte m29208maxByOrThrowU(byte[] bArr, qy6<? super goh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$maxBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!hoh.m30091isEmptyimpl(bArr)) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
            int lastIndex = e80.getLastIndex(bArr);
            if (lastIndex == 0) {
                return bM30088getw2LRezQ;
            }
            R rInvoke = qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM30088getw2LRezQ2 = hoh.m30088getw2LRezQ(bArr, i);
                    R rInvoke2 = qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        bM30088getw2LRezQ = bM30088getw2LRezQ2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return bM30088getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @t28
    @xn8(name = "minByOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> byte m29264minByOrThrowU(byte[] bArr, qy6<? super goh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$minBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!hoh.m30091isEmptyimpl(bArr)) {
            byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
            int lastIndex = e80.getLastIndex(bArr);
            if (lastIndex == 0) {
                return bM30088getw2LRezQ;
            }
            R rInvoke = qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM30088getw2LRezQ2 = hoh.m30088getw2LRezQ(bArr, i);
                    R rInvoke2 = qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        bM30088getw2LRezQ = bM30088getw2LRezQ2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return bM30088getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final short m29251maxOrThrowU(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$max");
        if (!jqh.m30554isEmptyimpl(sArr)) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
            int lastIndex = e80.getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM30551getMh2AYeg2 = jqh.m30551getMh2AYeg(sArr, i);
                    if (md8.compare(sM30551getMh2AYeg & iqh.f48007d, 65535 & sM30551getMh2AYeg2) < 0) {
                        sM30551getMh2AYeg = sM30551getMh2AYeg2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return sM30551getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "maxWithOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final short m29259maxWithOrThrowU(@yfb short[] sArr, @yfb Comparator<? super iqh> comparator) {
        md8.checkNotNullParameter(sArr, "$this$maxWith");
        md8.checkNotNullParameter(comparator, "comparator");
        if (!jqh.m30554isEmptyimpl(sArr)) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
            int lastIndex = e80.getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM30551getMh2AYeg2 = jqh.m30551getMh2AYeg(sArr, i);
                    if (comparator.compare(iqh.m30318boximpl(sM30551getMh2AYeg), iqh.m30318boximpl(sM30551getMh2AYeg2)) < 0) {
                        sM30551getMh2AYeg = sM30551getMh2AYeg2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return sM30551getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final short m29307minOrThrowU(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$min");
        if (!jqh.m30554isEmptyimpl(sArr)) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
            int lastIndex = e80.getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM30551getMh2AYeg2 = jqh.m30551getMh2AYeg(sArr, i);
                    if (md8.compare(sM30551getMh2AYeg & iqh.f48007d, 65535 & sM30551getMh2AYeg2) > 0) {
                        sM30551getMh2AYeg = sM30551getMh2AYeg2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return sM30551getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minWithOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final short m29315minWithOrThrowU(@yfb short[] sArr, @yfb Comparator<? super iqh> comparator) {
        md8.checkNotNullParameter(sArr, "$this$minWith");
        md8.checkNotNullParameter(comparator, "comparator");
        if (!jqh.m30554isEmptyimpl(sArr)) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
            int lastIndex = e80.getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM30551getMh2AYeg2 = jqh.m30551getMh2AYeg(sArr, i);
                    if (comparator.compare(iqh.m30318boximpl(sM30551getMh2AYeg), iqh.m30318boximpl(sM30551getMh2AYeg2)) > 0) {
                        sM30551getMh2AYeg = sM30551getMh2AYeg2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return sM30551getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @t28
    @xn8(name = "maxByOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> short m29211maxByOrThrowU(short[] sArr, qy6<? super iqh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$maxBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!jqh.m30554isEmptyimpl(sArr)) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
            int lastIndex = e80.getLastIndex(sArr);
            if (lastIndex == 0) {
                return sM30551getMh2AYeg;
            }
            R rInvoke = qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM30551getMh2AYeg2 = jqh.m30551getMh2AYeg(sArr, i);
                    R rInvoke2 = qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        sM30551getMh2AYeg = sM30551getMh2AYeg2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return sM30551getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @t28
    @xn8(name = "minByOrThrow-U")
    @yh5
    /* JADX INFO: renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> short m29267minByOrThrowU(short[] sArr, qy6<? super iqh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$minBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (!jqh.m30554isEmptyimpl(sArr)) {
            short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
            int lastIndex = e80.getLastIndex(sArr);
            if (lastIndex == 0) {
                return sM30551getMh2AYeg;
            }
            R rInvoke = qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM30551getMh2AYeg2 = jqh.m30551getMh2AYeg(sArr, i);
                    R rInvoke2 = qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        sM30551getMh2AYeg = sM30551getMh2AYeg2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return sM30551getMh2AYeg;
        }
        throw new NoSuchElementException();
    }
}
