package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p000.md2;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,24479:1\n12617#1,2:24480\n12627#1,2:24482\n1310#1,2:24484\n1318#1,2:24486\n1326#1,2:24488\n1334#1,2:24490\n1342#1,2:24492\n1350#1,2:24494\n1358#1,2:24496\n1366#1,2:24498\n1374#1,2:24500\n2353#1,5:24502\n2366#1,5:24507\n2379#1,5:24512\n2392#1,5:24517\n2405#1,5:24522\n2418#1,5:24527\n2431#1,5:24532\n2444#1,5:24537\n2457#1,5:24542\n4344#1,2:24548\n4354#1,2:24550\n4364#1,2:24552\n4374#1,2:24554\n4384#1,2:24556\n4394#1,2:24558\n4404#1,2:24560\n4414#1,2:24562\n4424#1,2:24564\n4011#1:24566\n13467#1,2:24567\n4012#1,2:24569\n13469#1:24571\n4014#1:24572\n4025#1:24573\n13477#1,2:24574\n4026#1,2:24576\n13479#1:24578\n4028#1:24579\n4039#1:24580\n13487#1,2:24581\n4040#1,2:24583\n13489#1:24585\n4042#1:24586\n4053#1:24587\n13497#1,2:24588\n4054#1,2:24590\n13499#1:24592\n4056#1:24593\n4067#1:24594\n13507#1,2:24595\n4068#1,2:24597\n13509#1:24599\n4070#1:24600\n4081#1:24601\n13517#1,2:24602\n4082#1,2:24604\n13519#1:24606\n4084#1:24607\n4095#1:24608\n13527#1,2:24609\n4096#1,2:24611\n13529#1:24613\n4098#1:24614\n4109#1:24615\n13537#1,2:24616\n4110#1,2:24618\n13539#1:24620\n4112#1:24621\n4123#1:24622\n13547#1,2:24623\n4124#1,2:24625\n13549#1:24627\n4126#1:24628\n13467#1,3:24629\n13477#1,3:24632\n13487#1,3:24635\n13497#1,3:24638\n13507#1,3:24641\n13517#1,3:24644\n13527#1,3:24647\n13537#1,3:24650\n13547#1,3:24653\n4144#1,2:24656\n4254#1,2:24658\n4264#1,2:24660\n4274#1,2:24662\n4284#1,2:24664\n4294#1,2:24666\n4304#1,2:24668\n4314#1,2:24670\n4324#1,2:24672\n4334#1,2:24674\n9181#1,4:24676\n9196#1,4:24680\n9211#1,4:24684\n9226#1,4:24688\n9241#1,4:24692\n9256#1,4:24696\n9271#1,4:24700\n9286#1,4:24704\n9301#1,4:24708\n8894#1,4:24712\n8910#1,4:24716\n8926#1,4:24720\n8942#1,4:24724\n8958#1,4:24728\n8974#1,4:24732\n8990#1,4:24736\n9006#1,4:24740\n9022#1,4:24744\n9038#1,4:24748\n9054#1,4:24752\n9070#1,4:24756\n9086#1,4:24760\n9102#1,4:24764\n9118#1,4:24768\n9134#1,4:24772\n9150#1,4:24776\n9166#1,4:24780\n9469#1,4:24784\n10487#1,5:24788\n10498#1,5:24793\n10509#1,5:24798\n10520#1,5:24803\n10531#1,5:24808\n10542#1,5:24813\n10553#1,5:24818\n10564#1,5:24823\n10575#1,5:24828\n10590#1,5:24833\n10831#1,3:24838\n10834#1,3:24848\n10848#1,3:24851\n10851#1,3:24861\n10865#1,3:24864\n10868#1,3:24874\n10882#1,3:24877\n10885#1,3:24887\n10899#1,3:24890\n10902#1,3:24900\n10916#1,3:24903\n10919#1,3:24913\n10933#1,3:24916\n10936#1,3:24926\n10950#1,3:24929\n10953#1,3:24939\n10967#1,3:24942\n10970#1,3:24952\n10985#1,3:24955\n10988#1,3:24965\n11003#1,3:24968\n11006#1,3:24978\n11021#1,3:24981\n11024#1,3:24991\n11039#1,3:24994\n11042#1,3:25004\n11057#1,3:25007\n11060#1,3:25017\n11075#1,3:25020\n11078#1,3:25030\n11093#1,3:25033\n11096#1,3:25043\n11111#1,3:25046\n11114#1,3:25056\n11129#1,3:25059\n11132#1,3:25069\n11493#1,3:25198\n11503#1,3:25201\n11513#1,3:25204\n11523#1,3:25207\n11533#1,3:25210\n11543#1,3:25213\n11553#1,3:25216\n11563#1,3:25219\n11573#1,3:25222\n11359#1,4:25225\n11372#1,4:25229\n11385#1,4:25233\n11398#1,4:25237\n11411#1,4:25241\n11424#1,4:25245\n11437#1,4:25249\n11450#1,4:25253\n11463#1,4:25257\n11348#1:25261\n13467#1,2:25262\n13469#1:25265\n11349#1:25266\n13467#1,3:25267\n11484#1:25270\n13402#1:25271\n13403#1:25273\n11485#1:25274\n13402#1,2:25275\n13467#1,3:25277\n13477#1,3:25280\n13487#1,3:25283\n13497#1,3:25286\n13507#1,3:25289\n13517#1,3:25292\n13527#1,3:25295\n13537#1,3:25298\n13547#1,3:25301\n20698#1,2:25304\n20700#1,6:25307\n20914#1,2:25313\n20916#1,6:25316\n23091#1,6:25322\n23107#1,6:25328\n23123#1,6:25334\n23139#1,6:25340\n23155#1,6:25346\n23171#1,6:25352\n23187#1,6:25358\n23203#1,6:25364\n23219#1,6:25370\n23325#1,8:25376\n23343#1,8:25384\n23361#1,8:25392\n23379#1,8:25400\n23397#1,8:25408\n23415#1,8:25416\n23433#1,8:25424\n23451#1,8:25432\n23469#1,8:25440\n23567#1,6:25448\n23583#1,6:25454\n23599#1,6:25460\n23615#1,6:25466\n23631#1,6:25472\n23647#1,6:25478\n23663#1,6:25484\n23679#1,6:25490\n1#2:24547\n1#2:25264\n1#2:25272\n1#2:25306\n1#2:25315\n381#3,7:24841\n381#3,7:24854\n381#3,7:24867\n381#3,7:24880\n381#3,7:24893\n381#3,7:24906\n381#3,7:24919\n381#3,7:24932\n381#3,7:24945\n381#3,7:24958\n381#3,7:24971\n381#3,7:24984\n381#3,7:24997\n381#3,7:25010\n381#3,7:25023\n381#3,7:25036\n381#3,7:25049\n381#3,7:25062\n381#3,7:25072\n381#3,7:25079\n381#3,7:25086\n381#3,7:25093\n381#3,7:25100\n381#3,7:25107\n381#3,7:25114\n381#3,7:25121\n381#3,7:25128\n381#3,7:25135\n381#3,7:25142\n381#3,7:25149\n381#3,7:25156\n381#3,7:25163\n381#3,7:25170\n381#3,7:25177\n381#3,7:25184\n381#3,7:25191\n*S KotlinDebug\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n557#1:24480,2\n566#1:24482,2\n860#1:24484,2\n870#1:24486,2\n880#1:24488,2\n890#1:24490,2\n900#1:24492,2\n910#1:24494,2\n920#1:24496,2\n930#1:24498,2\n940#1:24500,2\n950#1:24502,5\n960#1:24507,5\n970#1:24512,5\n980#1:24517,5\n990#1:24522,5\n1000#1:24527,5\n1010#1:24532,5\n1020#1:24537,5\n1030#1:24542,5\n3829#1:24548,2\n3838#1:24550,2\n3847#1:24552,2\n3856#1:24554,2\n3865#1:24556,2\n3874#1:24558,2\n3883#1:24560,2\n3892#1:24562,2\n3901#1:24564,2\n3912#1:24566\n3912#1:24567,2\n3912#1:24569,2\n3912#1:24571\n3912#1:24572\n3923#1:24573\n3923#1:24574,2\n3923#1:24576,2\n3923#1:24578\n3923#1:24579\n3934#1:24580\n3934#1:24581,2\n3934#1:24583,2\n3934#1:24585\n3934#1:24586\n3945#1:24587\n3945#1:24588,2\n3945#1:24590,2\n3945#1:24592\n3945#1:24593\n3956#1:24594\n3956#1:24595,2\n3956#1:24597,2\n3956#1:24599\n3956#1:24600\n3967#1:24601\n3967#1:24602,2\n3967#1:24604,2\n3967#1:24606\n3967#1:24607\n3978#1:24608\n3978#1:24609,2\n3978#1:24611,2\n3978#1:24613\n3978#1:24614\n3989#1:24615\n3989#1:24616,2\n3989#1:24618,2\n3989#1:24620\n3989#1:24621\n4000#1:24622\n4000#1:24623,2\n4000#1:24625,2\n4000#1:24627\n4000#1:24628\n4011#1:24629,3\n4025#1:24632,3\n4039#1:24635,3\n4053#1:24638,3\n4067#1:24641,3\n4081#1:24644,3\n4095#1:24647,3\n4109#1:24650,3\n4123#1:24653,3\n4135#1:24656,2\n4154#1:24658,2\n4163#1:24660,2\n4172#1:24662,2\n4181#1:24664,2\n4190#1:24666,2\n4199#1:24668,2\n4208#1:24670,2\n4217#1:24672,2\n4226#1:24674,2\n8500#1:24676,4\n8515#1:24680,4\n8530#1:24684,4\n8545#1:24688,4\n8560#1:24692,4\n8575#1:24696,4\n8590#1:24700,4\n8605#1:24704,4\n8620#1:24708,4\n8635#1:24712,4\n8650#1:24716,4\n8665#1:24720,4\n8680#1:24724,4\n8695#1:24728,4\n8710#1:24732,4\n8725#1:24736,4\n8740#1:24740,4\n8755#1:24744,4\n8769#1:24748,4\n8783#1:24752,4\n8797#1:24756,4\n8811#1:24760,4\n8825#1:24764,4\n8839#1:24768,4\n8853#1:24772,4\n8867#1:24776,4\n8881#1:24780,4\n9320#1:24784,4\n10065#1:24788,5\n10074#1:24793,5\n10083#1:24798,5\n10092#1:24803,5\n10101#1:24808,5\n10110#1:24813,5\n10119#1:24818,5\n10128#1:24823,5\n10137#1:24828,5\n10150#1:24833,5\n10606#1:24838,3\n10606#1:24848,3\n10618#1:24851,3\n10618#1:24861,3\n10630#1:24864,3\n10630#1:24874,3\n10642#1:24877,3\n10642#1:24887,3\n10654#1:24890,3\n10654#1:24900,3\n10666#1:24903,3\n10666#1:24913,3\n10678#1:24916,3\n10678#1:24926,3\n10690#1:24929,3\n10690#1:24939,3\n10702#1:24942,3\n10702#1:24952,3\n10715#1:24955,3\n10715#1:24965,3\n10728#1:24968,3\n10728#1:24978,3\n10741#1:24981,3\n10741#1:24991,3\n10754#1:24994,3\n10754#1:25004,3\n10767#1:25007,3\n10767#1:25017,3\n10780#1:25020,3\n10780#1:25030,3\n10793#1:25033,3\n10793#1:25043,3\n10806#1:25046,3\n10806#1:25056,3\n10819#1:25059,3\n10819#1:25069,3\n11158#1:25198,3\n11168#1:25201,3\n11178#1:25204,3\n11188#1:25207,3\n11198#1:25210,3\n11208#1:25213,3\n11218#1:25216,3\n11228#1:25219,3\n11238#1:25222,3\n11248#1:25225,4\n11258#1:25229,4\n11268#1:25233,4\n11278#1:25237,4\n11288#1:25241,4\n11298#1:25245,4\n11308#1:25249,4\n11318#1:25253,4\n11328#1:25257,4\n11338#1:25261\n11338#1:25262,2\n11338#1:25265\n11338#1:25266\n11348#1:25267,3\n11476#1:25270\n11476#1:25271\n11476#1:25273\n11476#1:25274\n11484#1:25275,2\n18984#1:25277,3\n18996#1:25280,3\n19008#1:25283,3\n19020#1:25286,3\n19032#1:25289,3\n19044#1:25292,3\n19056#1:25295,3\n19068#1:25298,3\n19080#1:25301,3\n21528#1:25304,2\n21528#1:25307,6\n21681#1:25313,2\n21681#1:25316,6\n23000#1:25322,6\n23010#1:25328,6\n23020#1:25334,6\n23030#1:25340,6\n23040#1:25346,6\n23050#1:25352,6\n23060#1:25358,6\n23070#1:25364,6\n23080#1:25370,6\n23234#1:25376,8\n23244#1:25384,8\n23254#1:25392,8\n23264#1:25400,8\n23274#1:25408,8\n23284#1:25416,8\n23294#1:25424,8\n23304#1:25432,8\n23314#1:25440,8\n23486#1:25448,6\n23496#1:25454,6\n23506#1:25460,6\n23516#1:25466,6\n23526#1:25472,6\n23536#1:25478,6\n23546#1:25484,6\n23556#1:25490,6\n11338#1:25264\n11476#1:25272\n21528#1:25306\n21681#1:25315\n10606#1:24841,7\n10618#1:24854,7\n10630#1:24867,7\n10642#1:24880,7\n10654#1:24893,7\n10666#1:24906,7\n10678#1:24919,7\n10690#1:24932,7\n10702#1:24945,7\n10715#1:24958,7\n10728#1:24971,7\n10741#1:24984,7\n10754#1:24997,7\n10767#1:25010,7\n10780#1:25023,7\n10793#1:25036,7\n10806#1:25049,7\n10819#1:25062,7\n10833#1:25072,7\n10850#1:25079,7\n10867#1:25086,7\n10884#1:25093,7\n10901#1:25100,7\n10918#1:25107,7\n10935#1:25114,7\n10952#1:25121,7\n10969#1:25128,7\n10987#1:25135,7\n11005#1:25142,7\n11023#1:25149,7\n11041#1:25156,7\n11059#1:25163,7\n11077#1:25170,7\n11095#1:25177,7\n11113#1:25184,7\n11131#1:25191,7\n*E\n"})
public class e80 extends u70 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: e80$a */
    @dwf({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24022#2:18\n*E\n"})
    public static final class C5169a<T> implements Iterable<T>, uo8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object[] f32083a;

        public C5169a(Object[] objArr) {
            this.f32083a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return l60.iterator(this.f32083a);
        }
    }

    /* JADX INFO: renamed from: e80$b */
    @dwf({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24030#2:18\n*E\n"})
    public static final class C5170b implements Iterable<Byte>, uo8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ byte[] f32084a;

        public C5170b(byte[] bArr) {
            this.f32084a = bArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Byte> iterator() {
            return m60.iterator(this.f32084a);
        }
    }

    /* JADX INFO: renamed from: e80$c */
    @dwf({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24038#2:18\n*E\n"})
    public static final class C5171c implements Iterable<Short>, uo8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ short[] f32085a;

        public C5171c(short[] sArr) {
            this.f32085a = sArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Short> iterator() {
            return m60.iterator(this.f32085a);
        }
    }

    /* JADX INFO: renamed from: e80$d */
    @dwf({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24046#2:18\n*E\n"})
    public static final class C5172d implements Iterable<Integer>, uo8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int[] f32086a;

        public C5172d(int[] iArr) {
            this.f32086a = iArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Integer> iterator() {
            return m60.iterator(this.f32086a);
        }
    }

    /* JADX INFO: renamed from: e80$e */
    @dwf({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24054#2:18\n*E\n"})
    public static final class C5173e implements Iterable<Long>, uo8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long[] f32087a;

        public C5173e(long[] jArr) {
            this.f32087a = jArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Long> iterator() {
            return m60.iterator(this.f32087a);
        }
    }

    /* JADX INFO: renamed from: e80$f */
    @dwf({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24062#2:18\n*E\n"})
    public static final class C5174f implements Iterable<Float>, uo8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float[] f32088a;

        public C5174f(float[] fArr) {
            this.f32088a = fArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Float> iterator() {
            return m60.iterator(this.f32088a);
        }
    }

    /* JADX INFO: renamed from: e80$g */
    @dwf({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24070#2:18\n*E\n"})
    public static final class C5175g implements Iterable<Double>, uo8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double[] f32089a;

        public C5175g(double[] dArr) {
            this.f32089a = dArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Double> iterator() {
            return m60.iterator(this.f32089a);
        }
    }

    /* JADX INFO: renamed from: e80$h */
    @dwf({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24078#2:18\n*E\n"})
    public static final class C5176h implements Iterable<Boolean>, uo8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean[] f32090a;

        public C5176h(boolean[] zArr) {
            this.f32090a = zArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Boolean> iterator() {
            return m60.iterator(this.f32090a);
        }
    }

    /* JADX INFO: renamed from: e80$i */
    @dwf({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24086#2:18\n*E\n"})
    public static final class C5177i implements Iterable<Character>, uo8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ char[] f32091a;

        public C5177i(char[] cArr) {
            this.f32091a = cArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Character> iterator() {
            return m60.iterator(this.f32091a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: e80$j */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24096#2:23\n*E\n"})
    public static final class C5178j<T> implements vye<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object[] f32092a;

        public C5178j(Object[] objArr) {
            this.f32092a = objArr;
        }

        @Override // p000.vye
        public Iterator<T> iterator() {
            return l60.iterator(this.f32092a);
        }
    }

    /* JADX INFO: renamed from: e80$k */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24106#2:23\n*E\n"})
    public static final class C5179k implements vye<Byte> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ byte[] f32093a;

        public C5179k(byte[] bArr) {
            this.f32093a = bArr;
        }

        @Override // p000.vye
        public Iterator<Byte> iterator() {
            return m60.iterator(this.f32093a);
        }
    }

    /* JADX INFO: renamed from: e80$l */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24116#2:23\n*E\n"})
    public static final class C5180l implements vye<Short> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ short[] f32094a;

        public C5180l(short[] sArr) {
            this.f32094a = sArr;
        }

        @Override // p000.vye
        public Iterator<Short> iterator() {
            return m60.iterator(this.f32094a);
        }
    }

    /* JADX INFO: renamed from: e80$m */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24126#2:23\n*E\n"})
    public static final class C5181m implements vye<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int[] f32095a;

        public C5181m(int[] iArr) {
            this.f32095a = iArr;
        }

        @Override // p000.vye
        public Iterator<Integer> iterator() {
            return m60.iterator(this.f32095a);
        }
    }

    /* JADX INFO: renamed from: e80$n */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24136#2:23\n*E\n"})
    public static final class C5182n implements vye<Long> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long[] f32096a;

        public C5182n(long[] jArr) {
            this.f32096a = jArr;
        }

        @Override // p000.vye
        public Iterator<Long> iterator() {
            return m60.iterator(this.f32096a);
        }
    }

    /* JADX INFO: renamed from: e80$o */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24146#2:23\n*E\n"})
    public static final class C5183o implements vye<Float> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float[] f32097a;

        public C5183o(float[] fArr) {
            this.f32097a = fArr;
        }

        @Override // p000.vye
        public Iterator<Float> iterator() {
            return m60.iterator(this.f32097a);
        }
    }

    /* JADX INFO: renamed from: e80$p */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24156#2:23\n*E\n"})
    public static final class C5184p implements vye<Double> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double[] f32098a;

        public C5184p(double[] dArr) {
            this.f32098a = dArr;
        }

        @Override // p000.vye
        public Iterator<Double> iterator() {
            return m60.iterator(this.f32098a);
        }
    }

    /* JADX INFO: renamed from: e80$q */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24166#2:23\n*E\n"})
    public static final class C5185q implements vye<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean[] f32099a;

        public C5185q(boolean[] zArr) {
            this.f32099a = zArr;
        }

        @Override // p000.vye
        public Iterator<Boolean> iterator() {
            return m60.iterator(this.f32099a);
        }
    }

    /* JADX INFO: renamed from: e80$r */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24176#2:23\n*E\n"})
    public static final class C5186r implements vye<Character> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ char[] f32100a;

        public C5186r(char[] cArr) {
            this.f32100a = cArr;
        }

        @Override // p000.vye
        public Iterator<Character> iterator() {
            return m60.iterator(this.f32100a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* JADX INFO: renamed from: e80$s */
    public static final class C5187s<K, T> implements wb7<T, K> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ T[] f32101a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<T, K> f32102b;

        /* JADX WARN: Multi-variable type inference failed */
        public C5187s(T[] tArr, qy6<? super T, ? extends K> qy6Var) {
            this.f32101a = tArr;
            this.f32102b = qy6Var;
        }

        @Override // p000.wb7
        public K keyOf(T t) {
            return this.f32102b.invoke(t);
        }

        @Override // p000.wb7
        public Iterator<T> sourceIterator() {
            return l60.iterator(this.f32101a);
        }
    }

    public static final <T> boolean all(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : tArr) {
            if (!qy6Var.invoke(t).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return !(tArr.length == 0);
    }

    @yfb
    public static <T> Iterable<T> asIterable(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? l82.emptyList() : new C5169a(tArr);
    }

    @yfb
    public static <T> vye<T> asSequence(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? ize.emptySequence() : new C5178j(tArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <T, K, V> Map<K, V> associate(@yfb T[] tArr, @yfb qy6<? super T, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(tArr.length), 16));
        for (InterfaceC0000a interfaceC0000a : tArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(interfaceC0000a);
            linkedHashMap.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @yfb
    public static final <T, K> Map<K, T> associateBy(@yfb T[] tArr, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(tArr.length), 16));
        for (T t : tArr) {
            linkedHashMap.put(qy6Var.invoke(t), t);
        }
        return linkedHashMap;
    }

    @yfb
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(@yfb T[] tArr, @yfb M m, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (T t : tArr) {
            m.put(qy6Var.invoke(t), t);
        }
        return m;
    }

    @yfb
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(@yfb T[] tArr, @yfb M m, @yfb qy6<? super T, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (T t : tArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(t);
            m.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return m;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <K, V> Map<K, V> associateWith(@yfb K[] kArr, @yfb qy6<? super K, ? extends V> qy6Var) {
        md8.checkNotNullParameter(kArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(kArr.length), 16));
        for (K k : kArr) {
            linkedHashMap.put(k, qy6Var.invoke(k));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(@yfb K[] kArr, @yfb M m, @yfb qy6<? super K, ? extends V> qy6Var) {
        md8.checkNotNullParameter(kArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        for (K k : kArr) {
            m.put(k, qy6Var.invoke(k));
        }
        return m;
    }

    public static final double average(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (byte b : bArr) {
            d += (double) b;
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    @xn8(name = "averageOfByte")
    public static final double averageOfByte(@yfb Byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        double dByteValue = 0.0d;
        int i = 0;
        for (Byte b : bArr) {
            dByteValue += (double) b.byteValue();
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i);
    }

    @xn8(name = "averageOfDouble")
    public static final double averageOfDouble(@yfb Double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        double dDoubleValue = 0.0d;
        int i = 0;
        for (Double d : dArr) {
            dDoubleValue += d.doubleValue();
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i);
    }

    @xn8(name = "averageOfFloat")
    public static final double averageOfFloat(@yfb Float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        double dFloatValue = 0.0d;
        int i = 0;
        for (Float f : fArr) {
            dFloatValue += (double) f.floatValue();
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    @xn8(name = "averageOfInt")
    public static final double averageOfInt(@yfb Integer[] numArr) {
        md8.checkNotNullParameter(numArr, "<this>");
        double dIntValue = 0.0d;
        int i = 0;
        for (Integer num : numArr) {
            dIntValue += (double) num.intValue();
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i);
    }

    @xn8(name = "averageOfLong")
    public static final double averageOfLong(@yfb Long[] lArr) {
        md8.checkNotNullParameter(lArr, "<this>");
        double dLongValue = 0.0d;
        int i = 0;
        for (Long l : lArr) {
            dLongValue += l.longValue();
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i);
    }

    @xn8(name = "averageOfShort")
    public static final double averageOfShort(@yfb Short[] shArr) {
        md8.checkNotNullParameter(shArr, "<this>");
        double dShortValue = 0.0d;
        int i = 0;
        for (Short sh : shArr) {
            dShortValue += (double) sh.shortValue();
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i);
    }

    @t28
    private static final <T> T component1(T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return tArr[0];
    }

    @t28
    private static final <T> T component2(T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return tArr[1];
    }

    @t28
    private static final <T> T component3(T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return tArr[2];
    }

    @t28
    private static final <T> T component4(T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return tArr[3];
    }

    @t28
    private static final <T> T component5(T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return tArr[4];
    }

    public static <T> boolean contains(@yfb T[] tArr, T t) {
        md8.checkNotNullParameter(tArr, "<this>");
        return indexOf(tArr, t) >= 0;
    }

    @t28
    private static final <T> int count(T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return tArr.length;
    }

    @yfb
    public static final <T> List<T> distinct(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return v82.toList(toMutableSet(tArr));
    }

    @yfb
    public static final <T, K> List<T> distinctBy(@yfb T[] tArr, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (hashSet.add(qy6Var.invoke(t))) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @yfb
    public static <T> List<T> drop(@yfb T[] tArr, int i) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (i >= 0) {
            return takeLast(tArr, kpd.coerceAtLeast(tArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final <T> List<T> dropLast(@yfb T[] tArr, int i) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (i >= 0) {
            return take(tArr, kpd.coerceAtLeast(tArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final <T> List<T> dropLastWhile(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(tArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(tArr[lastIndex]).booleanValue()) {
                return take(tArr, lastIndex + 1);
            }
        }
        return l82.emptyList();
    }

    @yfb
    public static final <T> List<T> dropWhile(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (T t : tArr) {
            if (z) {
                arrayList.add(t);
            } else if (!qy6Var.invoke(t).booleanValue()) {
                arrayList.add(t);
                z = true;
            }
        }
        return arrayList;
    }

    @t28
    private static final <T> T elementAtOrElse(T[] tArr, int i, qy6<? super Integer, ? extends T> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= tArr.length) ? qy6Var.invoke(Integer.valueOf(i)) : tArr[i];
    }

    @t28
    private static final <T> T elementAtOrNull(T[] tArr, int i) {
        md8.checkNotNullParameter(tArr, "<this>");
        return (T) getOrNull(tArr, i);
    }

    @yfb
    public static final <T> List<T> filter(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (qy6Var.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @yfb
    public static final <T> List<T> filterIndexed(@yfb T[] tArr, @yfb gz6<? super Integer, ? super T, Boolean> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = tArr[i];
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), t).booleanValue()) {
                arrayList.add(t);
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @yfb
    public static final <T, C extends Collection<? super T>> C filterIndexedTo(@yfb T[] tArr, @yfb C c, @yfb gz6<? super Integer, ? super T, Boolean> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "predicate");
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = tArr[i];
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), t).booleanValue()) {
                c.add(t);
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    public static final /* synthetic */ <R> List<R> filterIsInstance(Object[] objArr) {
        md8.checkNotNullParameter(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            md8.reifiedOperationMarker(3, "R");
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Object[] objArr, C c) {
        md8.checkNotNullParameter(objArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        for (Object obj : objArr) {
            md8.reifiedOperationMarker(3, "R");
            if (obj != null) {
                c.add(obj);
            }
        }
        return c;
    }

    @yfb
    public static final <T> List<T> filterNot(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (!qy6Var.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @yfb
    public static <T> List<T> filterNotNull(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return (List) filterNotNullTo(tArr, new ArrayList());
    }

    @yfb
    public static final <C extends Collection<? super T>, T> C filterNotNullTo(@yfb T[] tArr, @yfb C c) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    @yfb
    public static final <T, C extends Collection<? super T>> C filterNotTo(@yfb T[] tArr, @yfb C c, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : tArr) {
            if (!qy6Var.invoke(t).booleanValue()) {
                c.add(t);
            }
        }
        return c;
    }

    @yfb
    public static final <T, C extends Collection<? super T>> C filterTo(@yfb T[] tArr, @yfb C c, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : tArr) {
            if (qy6Var.invoke(t).booleanValue()) {
                c.add(t);
            }
        }
        return c;
    }

    @t28
    private static final <T> T find(T[] tArr, qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : tArr) {
            if (qy6Var.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @t28
    private static final <T> T findLast(T[] tArr, qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                T t = tArr[length];
                if (qy6Var.invoke(t).booleanValue()) {
                    return t;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    public static <T> T first(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @jjf(version = "1.5")
    @t28
    private static final <T, R> R firstNotNullOf(T[] tArr, qy6<? super T, ? extends R> qy6Var) {
        R rInvoke;
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        int length = tArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                rInvoke = qy6Var.invoke(tArr[i]);
                if (rInvoke != null) {
                    break;
                }
                i++;
            } else {
                rInvoke = null;
                break;
            }
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
    }

    @jjf(version = "1.5")
    @t28
    private static final <T, R> R firstNotNullOfOrNull(T[] tArr, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        for (T t : tArr) {
            R rInvoke = qy6Var.invoke(t);
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @gib
    public static <T> T firstOrNull(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    @yfb
    public static final <T, R> List<R> flatMap(@yfb T[] tArr, @yfb qy6<? super T, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            q82.addAll(arrayList, qy6Var.invoke(t));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterable")
    private static final <T, R> List<R> flatMapIndexedIterable(T[] tArr, gz6<? super Integer, ? super T, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i2), tArr[i]));
            i++;
            i2++;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterableTo")
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(T[] tArr, C c, gz6<? super Integer, ? super T, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i2), tArr[i]));
            i++;
            i2++;
        }
        return c;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedSequence")
    private static final <T, R> List<R> flatMapIndexedSequence(T[] tArr, gz6<? super Integer, ? super T, ? extends vye<? extends R>> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i2), tArr[i]));
            i++;
            i2++;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedSequenceTo")
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(T[] tArr, C c, gz6<? super Integer, ? super T, ? extends vye<? extends R>> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i2), tArr[i]));
            i++;
            i2++;
        }
        return c;
    }

    @r9c
    @jjf(version = "1.4")
    @xn8(name = "flatMapSequence")
    @yfb
    public static final <T, R> List<R> flatMapSequence(@yfb T[] tArr, @yfb qy6<? super T, ? extends vye<? extends R>> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            q82.addAll(arrayList, qy6Var.invoke(t));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @xn8(name = "flatMapSequenceTo")
    @yfb
    public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(@yfb T[] tArr, @yfb C c, @yfb qy6<? super T, ? extends vye<? extends R>> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (T t : tArr) {
            q82.addAll(c, qy6Var.invoke(t));
        }
        return c;
    }

    @yfb
    public static final <T, R, C extends Collection<? super R>> C flatMapTo(@yfb T[] tArr, @yfb C c, @yfb qy6<? super T, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (T t : tArr) {
            q82.addAll(c, qy6Var.invoke(t));
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R fold(@yfb T[] tArr, R r, @yfb gz6<? super R, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (InterfaceC0000a interfaceC0000a : tArr) {
            r = gz6Var.invoke(r, interfaceC0000a);
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldIndexed(@yfb T[] tArr, R r, @yfb kz6<? super Integer, ? super R, ? super T, ? extends R> kz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = kz6Var.invoke(Integer.valueOf(i2), r, tArr[i]);
            i++;
            i2++;
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldRight(@yfb T[] tArr, R r, @yfb gz6<? super T, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (int lastIndex = getLastIndex(tArr); lastIndex >= 0; lastIndex--) {
            r = gz6Var.invoke(tArr[lastIndex], r);
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldRightIndexed(@yfb T[] tArr, R r, @yfb kz6<? super Integer, ? super T, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        for (int lastIndex = getLastIndex(tArr); lastIndex >= 0; lastIndex--) {
            r = kz6Var.invoke(Integer.valueOf(lastIndex), tArr[lastIndex], r);
        }
        return r;
    }

    public static final <T> void forEach(@yfb T[] tArr, @yfb qy6<? super T, bth> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (T t : tArr) {
            qy6Var.invoke(t);
        }
    }

    public static final <T> void forEachIndexed(@yfb T[] tArr, @yfb gz6<? super Integer, ? super T, bth> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), tArr[i]);
            i++;
            i2++;
        }
    }

    @yfb
    public static <T> f78 getIndices(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return new f78(0, getLastIndex(tArr));
    }

    public static <T> int getLastIndex(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return tArr.length - 1;
    }

    @t28
    private static final <T> T getOrElse(T[] tArr, int i, qy6<? super Integer, ? extends T> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= tArr.length) ? qy6Var.invoke(Integer.valueOf(i)) : tArr[i];
    }

    @gib
    public static <T> T getOrNull(@yfb T[] tArr, int i) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    @yfb
    public static final <T, K> Map<K, List<T>> groupBy(@yfb T[] tArr, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : tArr) {
            K kInvoke = qy6Var.invoke(t);
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t);
        }
        return linkedHashMap;
    }

    @yfb
    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(@yfb T[] tArr, @yfb M m, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (T t : tArr) {
            K kInvoke = qy6Var.invoke(t);
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t);
        }
        return m;
    }

    @jjf(version = "1.1")
    @yfb
    public static final <T, K> wb7<T, K> groupingBy(@yfb T[] tArr, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        return new C5187s(tArr, qy6Var);
    }

    public static <T> int indexOf(@yfb T[] tArr, T t) {
        md8.checkNotNullParameter(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (md8.areEqual(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (qy6Var.invoke(tArr[i]).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final <T> int indexOfLast(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (qy6Var.invoke(tArr[length]).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @yfb
    public static final <T> Set<T> intersect(@yfb T[] tArr, @yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        q82.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    @t28
    private static final <T> boolean isEmpty(T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0;
    }

    @t28
    private static final <T> boolean isNotEmpty(T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return !(tArr.length == 0);
    }

    @yfb
    public static final <T, A extends Appendable> A joinTo(@yfb T[] tArr, @yfb A a, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super T, ? extends CharSequence> qy6Var) throws IOException {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(a, "buffer");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            w8g.appendElement(a, t, qy6Var);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @yfb
    public static final <T> String joinToString(@yfb T[] tArr, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super T, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        return ((StringBuilder) joinTo(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, qy6Var)).toString();
    }

    public static /* synthetic */ String joinToString$default(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            qy6Var = null;
        }
        return joinToString(objArr, charSequence, charSequence5, charSequence6, i3, charSequence7, qy6Var);
    }

    public static <T> T last(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[getLastIndex(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> int lastIndexOf(@yfb T[] tArr, T t) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (t == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (md8.areEqual(t, tArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @gib
    public static <T> T lastOrNull(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    @yfb
    public static final <T, R> List<R> map(@yfb T[] tArr, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(qy6Var.invoke(t));
        }
        return arrayList;
    }

    @yfb
    public static final <T, R> List<R> mapIndexed(@yfb T[] tArr, @yfb gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(i2), tArr[i]));
            i++;
            i2++;
        }
        return arrayList;
    }

    @yfb
    public static final <T, R> List<R> mapIndexedNotNull(@yfb T[] tArr, @yfb gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            R rInvoke = gz6Var.invoke(Integer.valueOf(i2), tArr[i]);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @yfb
    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(@yfb T[] tArr, @yfb C c, @yfb gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            R rInvoke = gz6Var.invoke(Integer.valueOf(i2), tArr[i]);
            if (rInvoke != null) {
                c.add(rInvoke);
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @yfb
    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(@yfb T[] tArr, @yfb C c, @yfb gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(gz6Var.invoke(Integer.valueOf(i2), tArr[i]));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <T, R> List<R> mapNotNull(@yfb T[] tArr, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            R rInvoke = qy6Var.invoke(t);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @yfb
    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(@yfb T[] tArr, @yfb C c, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (T t : tArr) {
            R rInvoke = qy6Var.invoke(t);
            if (rInvoke != null) {
                c.add(rInvoke);
            }
        }
        return c;
    }

    @yfb
    public static final <T, R, C extends Collection<? super R>> C mapTo(@yfb T[] tArr, @yfb C c, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (T t : tArr) {
            c.add(qy6Var.invoke(t));
        }
        return c;
    }

    @gib
    @jjf(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T maxByOrNull(@yfb T[] tArr, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t;
        }
        R rInvoke = qy6Var.invoke(t);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t2 = tArr[i];
                R rInvoke2 = qy6Var.invoke(t2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    t = t2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    @jjf(version = "1.7")
    @xn8(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(@yfb T[] tArr, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t;
        }
        R rInvoke = qy6Var.invoke(t);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t2 = tArr[i];
                R rInvoke2 = qy6Var.invoke(t2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    t = t2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T> double maxOf(T[] tArr, qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke(tArr[0]).doubleValue();
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(tArr[i]).doubleValue());
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
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Double m28765maxOfOrNull(T[] tArr, qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(tArr[0]).doubleValue();
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(tArr[i]).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T, R> R maxOfWith(T[] tArr, Comparator<? super R> comparator, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(tArr[i]);
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

    /* JADX WARN: Multi-variable type inference failed */
    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T, R> R maxOfWithOrNull(T[] tArr, Comparator<? super R> comparator, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(tArr[i]);
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
    public static final Double maxOrNull(@yfb Double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0].doubleValue();
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, dArr[i].doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow")
    public static final double maxOrThrow(@yfb Double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = dArr[0].doubleValue();
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, dArr[i].doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @gib
    @jjf(version = "1.4")
    public static final <T> T maxWithOrNull(@yfb T[] tArr, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t2 = tArr[i];
                if (comparator.compare(t, t2) < 0) {
                    t = t2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    @jjf(version = "1.7")
    @xn8(name = "maxWithOrThrow")
    public static final <T> T maxWithOrThrow(@yfb T[] tArr, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t2 = tArr[i];
                if (comparator.compare(t, t2) < 0) {
                    t = t2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    @gib
    @jjf(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T minByOrNull(@yfb T[] tArr, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t;
        }
        R rInvoke = qy6Var.invoke(t);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t2 = tArr[i];
                R rInvoke2 = qy6Var.invoke(t2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    t = t2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    @jjf(version = "1.7")
    @xn8(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T minByOrThrow(@yfb T[] tArr, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t;
        }
        R rInvoke = qy6Var.invoke(t);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t2 = tArr[i];
                R rInvoke2 = qy6Var.invoke(t2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    t = t2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T> double minOf(T[] tArr, qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke(tArr[0]).doubleValue();
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(tArr[i]).doubleValue());
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
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Double m28801minOfOrNull(T[] tArr, qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(tArr[0]).doubleValue();
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(tArr[i]).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T, R> R minOfWith(T[] tArr, Comparator<? super R> comparator, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(tArr[i]);
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

    /* JADX WARN: Multi-variable type inference failed */
    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T, R> R minOfWithOrNull(T[] tArr, Comparator<? super R> comparator, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(tArr[i]);
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
    public static final Double minOrNull(@yfb Double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0].doubleValue();
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, dArr[i].doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow")
    public static final double minOrThrow(@yfb Double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = dArr[0].doubleValue();
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, dArr[i].doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @gib
    @jjf(version = "1.4")
    public static final <T> T minWithOrNull(@yfb T[] tArr, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t2 = tArr[i];
                if (comparator.compare(t, t2) > 0) {
                    t = t2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    @jjf(version = "1.7")
    @xn8(name = "minWithOrThrow")
    public static final <T> T minWithOrThrow(@yfb T[] tArr, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t2 = tArr[i];
                if (comparator.compare(t, t2) > 0) {
                    t = t2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    public static final <T> boolean none(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0;
    }

    @jjf(version = "1.4")
    @t28
    private static final <T> T[] onEach(T[] tArr, qy6<? super T, bth> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (T t : tArr) {
            qy6Var.invoke(t);
        }
        return tArr;
    }

    @jjf(version = "1.4")
    @t28
    private static final <T> T[] onEachIndexed(T[] tArr, gz6<? super Integer, ? super T, bth> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), tArr[i]);
            i++;
            i2++;
        }
        return tArr;
    }

    @yfb
    public static final <T> scc<List<T>, List<T>> partition(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : tArr) {
            if (qy6Var.invoke(t).booleanValue()) {
                arrayList.add(t);
            } else {
                arrayList2.add(t);
            }
        }
        return new scc<>(arrayList, arrayList2);
    }

    @jjf(version = "1.3")
    @t28
    private static final <T> T random(T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return (T) random(tArr, tod.f85517a);
    }

    @jjf(version = "1.4")
    @t28
    private static final <T> T randomOrNull(T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return (T) randomOrNull(tArr, tod.f85517a);
    }

    public static final <S, T extends S> S reduce(@yfb T[] tArr, @yfb gz6<? super S, ? super T, ? extends S> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (Object) tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                sInvoke = gz6Var.invoke(sInvoke, (Object) tArr[i]);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return sInvoke;
    }

    public static final <S, T extends S> S reduceIndexed(@yfb T[] tArr, @yfb kz6<? super Integer, ? super S, ? super T, ? extends S> kz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (Object) tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                sInvoke = kz6Var.invoke(Integer.valueOf(i), sInvoke, (Object) tArr[i]);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return sInvoke;
    }

    @gib
    @jjf(version = "1.4")
    public static final <S, T extends S> S reduceIndexedOrNull(@yfb T[] tArr, @yfb kz6<? super Integer, ? super S, ? super T, ? extends S> kz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S sInvoke = (Object) tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                sInvoke = kz6Var.invoke(Integer.valueOf(i), sInvoke, (Object) tArr[i]);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return sInvoke;
    }

    @gib
    @jjf(version = "1.4")
    public static final <S, T extends S> S reduceOrNull(@yfb T[] tArr, @yfb gz6<? super S, ? super T, ? extends S> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S sInvoke = (Object) tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                sInvoke = gz6Var.invoke(sInvoke, (Object) tArr[i]);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return sInvoke;
    }

    public static final <S, T extends S> S reduceRight(@yfb T[] tArr, @yfb gz6<? super T, ? super S, ? extends S> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            sInvoke = gz6Var.invoke((Object) tArr[i], sInvoke);
        }
        return sInvoke;
    }

    public static final <S, T extends S> S reduceRightIndexed(@yfb T[] tArr, @yfb kz6<? super Integer, ? super T, ? super S, ? extends S> kz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            sInvoke = kz6Var.invoke(Integer.valueOf(i), (Object) tArr[i], sInvoke);
        }
        return sInvoke;
    }

    @gib
    @jjf(version = "1.4")
    public static final <S, T extends S> S reduceRightIndexedOrNull(@yfb T[] tArr, @yfb kz6<? super Integer, ? super T, ? super S, ? extends S> kz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            return null;
        }
        S sInvoke = (S) tArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            sInvoke = kz6Var.invoke(Integer.valueOf(i), (Object) tArr[i], sInvoke);
        }
        return sInvoke;
    }

    @gib
    @jjf(version = "1.4")
    public static final <S, T extends S> S reduceRightOrNull(@yfb T[] tArr, @yfb gz6<? super T, ? super S, ? extends S> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            return null;
        }
        S sInvoke = (S) tArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            sInvoke = gz6Var.invoke((Object) tArr[i], sInvoke);
        }
        return sInvoke;
    }

    @yfb
    public static final <T> T[] requireNoNulls(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        for (T t : tArr) {
            if (t == null) {
                throw new IllegalArgumentException("null element found in " + tArr + a18.f100c);
            }
        }
        return tArr;
    }

    public static final <T> void reverse(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(tArr);
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            T t = tArr[i];
            tArr[i] = tArr[lastIndex];
            tArr[lastIndex] = t;
            lastIndex--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @yfb
    public static final <T> List<T> reversed(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return l82.emptyList();
        }
        List<T> mutableList = toMutableList(tArr);
        s82.reverse(mutableList);
        return mutableList;
    }

    @yfb
    public static final <T> T[] reversedArray(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) s70.arrayOfNulls(tArr, tArr.length);
        int lastIndex = getLastIndex(tArr);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                tArr2[lastIndex - i] = tArr[i];
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return tArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.4")
    @yfb
    public static final <T, R> List<R> runningFold(@yfb T[] tArr, R r, @yfb gz6<? super R, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (tArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r);
        for (InterfaceC0000a interfaceC0000a : tArr) {
            r = gz6Var.invoke(r, interfaceC0000a);
            arrayList.add(r);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.4")
    @yfb
    public static final <T, R> List<R> runningFoldIndexed(@yfb T[] tArr, R r, @yfb kz6<? super Integer, ? super R, ? super T, ? extends R> kz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (tArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r);
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, tArr[i]);
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <S, T extends S> List<S> runningReduce(@yfb T[] tArr, @yfb gz6<? super S, ? super T, ? extends S> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (tArr.length == 0) {
            return l82.emptyList();
        }
        S sInvoke = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(sInvoke);
        int length = tArr.length;
        for (int i = 1; i < length; i++) {
            sInvoke = gz6Var.invoke(sInvoke, (Object) tArr[i]);
            arrayList.add(sInvoke);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <S, T extends S> List<S> runningReduceIndexed(@yfb T[] tArr, @yfb kz6<? super Integer, ? super S, ? super T, ? extends S> kz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (tArr.length == 0) {
            return l82.emptyList();
        }
        S sInvoke = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(sInvoke);
        int length = tArr.length;
        for (int i = 1; i < length; i++) {
            sInvoke = kz6Var.invoke(Integer.valueOf(i), sInvoke, (Object) tArr[i]);
            arrayList.add(sInvoke);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> scan(byte[] bArr, R r, gz6<? super R, ? super Byte, ? extends R> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (bArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r);
        for (byte b : bArr) {
            r = gz6Var.invoke(r, Byte.valueOf(b));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> scanIndexed(byte[] bArr, R r, kz6<? super Integer, ? super R, ? super Byte, ? extends R> kz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (bArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r);
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Byte.valueOf(bArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    public static final <T> void shuffle(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        shuffle(tArr, tod.f85517a);
    }

    public static final <T> T single(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @gib
    public static <T> T singleOrNull(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    @yfb
    public static <T> List<T> slice(@yfb T[] tArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? l82.emptyList() : u70.asList(u70.copyOfRange(tArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1));
    }

    @yfb
    public static final <T> T[] sliceArray(@yfb T[] tArr, @yfb Collection<Integer> collection) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(collection, "indices");
        T[] tArr2 = (T[]) s70.arrayOfNulls(tArr, collection.size());
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            tArr2[i] = tArr[it.next().intValue()];
            i++;
        }
        return tArr2;
    }

    public static final <T, R extends Comparable<? super R>> void sortBy(@yfb T[] tArr, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length > 1) {
            u70.sortWith(tArr, new md2.C9296a(qy6Var));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortByDescending(@yfb T[] tArr, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length > 1) {
            u70.sortWith(tArr, new md2.C9298c(qy6Var));
        }
    }

    public static final <T extends Comparable<? super T>> void sortDescending(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        u70.sortWith(tArr, md2.reverseOrder());
    }

    @yfb
    public static final <T extends Comparable<? super T>> List<T> sorted(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return u70.asList(sortedArray(tArr));
    }

    @yfb
    public static final <T extends Comparable<? super T>> T[] sortedArray(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) objArrCopyOf);
        u70.sort((Object[]) tArr2);
        return tArr2;
    }

    @yfb
    public static final <T extends Comparable<? super T>> T[] sortedArrayDescending(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) objArrCopyOf);
        u70.sortWith(tArr2, md2.reverseOrder());
        return tArr2;
    }

    @yfb
    public static final <T> T[] sortedArrayWith(@yfb T[] tArr, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        md8.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        u70.sortWith(tArr2, comparator);
        return tArr2;
    }

    @yfb
    public static final <T, R extends Comparable<? super R>> List<T> sortedBy(@yfb T[] tArr, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(tArr, new md2.C9296a(qy6Var));
    }

    @yfb
    public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(@yfb T[] tArr, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(tArr, new md2.C9298c(qy6Var));
    }

    @yfb
    public static final <T extends Comparable<? super T>> List<T> sortedDescending(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return sortedWith(tArr, md2.reverseOrder());
    }

    @yfb
    public static <T> List<T> sortedWith(@yfb T[] tArr, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return u70.asList(sortedArrayWith(tArr, comparator));
    }

    @yfb
    public static final <T> Set<T> subtract(@yfb T[] tArr, @yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        q82.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    public static final int sum(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        int i = 0;
        for (byte b : bArr) {
            i += b;
        }
        return i;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> int sumBy(@yfb T[] tArr, @yfb qy6<? super T, Integer> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (T t : tArr) {
            iIntValue += qy6Var.invoke(t).intValue();
        }
        return iIntValue;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> double sumByDouble(@yfb T[] tArr, @yfb qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (T t : tArr) {
            dDoubleValue += qy6Var.invoke(t).doubleValue();
        }
        return dDoubleValue;
    }

    @xn8(name = "sumOfByte")
    public static final int sumOfByte(@yfb Byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        int iByteValue = 0;
        for (Byte b : bArr) {
            iByteValue += b.byteValue();
        }
        return iByteValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfDouble")
    private static final <T> double sumOfDouble(T[] tArr, qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (T t : tArr) {
            dDoubleValue += qy6Var.invoke(t).doubleValue();
        }
        return dDoubleValue;
    }

    @xn8(name = "sumOfFloat")
    public static final float sumOfFloat(@yfb Float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        float fFloatValue = 0.0f;
        for (Float f : fArr) {
            fFloatValue += f.floatValue();
        }
        return fFloatValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfInt")
    private static final <T> int sumOfInt(T[] tArr, qy6<? super T, Integer> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (T t : tArr) {
            iIntValue += qy6Var.invoke(t).intValue();
        }
        return iIntValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfLong")
    private static final <T> long sumOfLong(T[] tArr, qy6<? super T, Long> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jLongValue = 0;
        for (T t : tArr) {
            jLongValue += qy6Var.invoke(t).longValue();
        }
        return jLongValue;
    }

    @xn8(name = "sumOfShort")
    public static final int sumOfShort(@yfb Short[] shArr) {
        md8.checkNotNullParameter(shArr, "<this>");
        int iShortValue = 0;
        for (Short sh : shArr) {
            iShortValue += sh.shortValue();
        }
        return iShortValue;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfUInt")
    @ihi(markerClass = {yh5.class})
    private static final <T> int sumOfUInt(T[] tArr, qy6<? super T, woh> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        for (T t : tArr) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(t).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfULong")
    @ihi(markerClass = {yh5.class})
    private static final <T> long sumOfULong(T[] tArr, qy6<? super T, oph> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jM31533constructorimpl = oph.m31533constructorimpl(0L);
        for (T t : tArr) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + qy6Var.invoke(t).m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @yfb
    public static final <T> List<T> take(@yfb T[] tArr, int i) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        if (i >= tArr.length) {
            return toList(tArr);
        }
        if (i == 1) {
            return k82.listOf(tArr[0]);
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (T t : tArr) {
            arrayList.add(t);
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @yfb
    public static final <T> List<T> takeLast(@yfb T[] tArr, int i) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        int length = tArr.length;
        if (i >= length) {
            return toList(tArr);
        }
        if (i == 1) {
            return k82.listOf(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(tArr[i2]);
        }
        return arrayList;
    }

    @yfb
    public static final <T> List<T> takeLastWhile(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(tArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(tArr[lastIndex]).booleanValue()) {
                return drop(tArr, lastIndex + 1);
            }
        }
        return toList(tArr);
    }

    @yfb
    public static final <T> List<T> takeWhile(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (!qy6Var.invoke(t).booleanValue()) {
                break;
            }
            arrayList.add(t);
        }
        return arrayList;
    }

    @yfb
    public static final boolean[] toBooleanArray(@yfb Boolean[] boolArr) {
        md8.checkNotNullParameter(boolArr, "<this>");
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = boolArr[i].booleanValue();
        }
        return zArr;
    }

    @yfb
    public static final byte[] toByteArray(@yfb Byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = bArr[i].byteValue();
        }
        return bArr2;
    }

    @yfb
    public static final char[] toCharArray(@yfb Character[] chArr) {
        md8.checkNotNullParameter(chArr, "<this>");
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = chArr[i].charValue();
        }
        return cArr;
    }

    @yfb
    public static final <T, C extends Collection<? super T>> C toCollection(@yfb T[] tArr, @yfb C c) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        for (T t : tArr) {
            c.add(t);
        }
        return c;
    }

    @yfb
    public static final double[] toDoubleArray(@yfb Double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i = 0; i < length; i++) {
            dArr2[i] = dArr[i].doubleValue();
        }
        return dArr2;
    }

    @yfb
    public static final float[] toFloatArray(@yfb Float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i = 0; i < length; i++) {
            fArr2[i] = fArr[i].floatValue();
        }
        return fArr2;
    }

    @yfb
    public static final <T> HashSet<T> toHashSet(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return (HashSet) toCollection(tArr, new HashSet(wt9.mapCapacity(tArr.length)));
    }

    @yfb
    public static final int[] toIntArray(@yfb Integer[] numArr) {
        md8.checkNotNullParameter(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    @yfb
    public static <T> List<T> toList(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? toMutableList(tArr) : k82.listOf(tArr[0]) : l82.emptyList();
    }

    @yfb
    public static final long[] toLongArray(@yfb Long[] lArr) {
        md8.checkNotNullParameter(lArr, "<this>");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = lArr[i].longValue();
        }
        return jArr;
    }

    @yfb
    public static <T> List<T> toMutableList(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return new ArrayList(l82.asCollection(tArr));
    }

    @yfb
    public static final <T> Set<T> toMutableSet(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return (Set) toCollection(tArr, new LinkedHashSet(wt9.mapCapacity(tArr.length)));
    }

    @yfb
    public static final <T> Set<T> toSet(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? (Set) toCollection(tArr, new LinkedHashSet(wt9.mapCapacity(tArr.length))) : v6f.setOf(tArr[0]) : w6f.emptySet();
    }

    @yfb
    public static final short[] toShortArray(@yfb Short[] shArr) {
        md8.checkNotNullParameter(shArr, "<this>");
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = shArr[i].shortValue();
        }
        return sArr;
    }

    @yfb
    public static final <T> Set<T> union(@yfb T[] tArr, @yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        q82.addAll(mutableSet, iterable);
        return mutableSet;
    }

    @yfb
    public static <T> Iterable<q08<T>> withIndex(@yfb final T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return new r08(new ny6() { // from class: b80
            @Override // p000.ny6
            public final Object invoke() {
                return l60.iterator(tArr);
            }
        });
    }

    @yfb
    public static final <T, R, V> List<V> zip(@yfb T[] tArr, @yfb R[] rArr, @yfb gz6<? super T, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(tArr[i], rArr[i]));
        }
        return arrayList;
    }

    public static final boolean all(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (byte b : bArr) {
            if (!qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return !(bArr.length == 0);
    }

    public static final double average(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (short s : sArr) {
            d += (double) s;
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    @t28
    private static final byte component1(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return bArr[0];
    }

    @t28
    private static final byte component2(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return bArr[1];
    }

    @t28
    private static final byte component3(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return bArr[2];
    }

    @t28
    private static final byte component4(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return bArr[3];
    }

    @t28
    private static final byte component5(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return bArr[4];
    }

    public static boolean contains(@yfb byte[] bArr, byte b) {
        md8.checkNotNullParameter(bArr, "<this>");
        return indexOf(bArr, b) >= 0;
    }

    @t28
    private static final int count(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @yfb
    public static final List<Byte> distinct(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return v82.toList(toMutableSet(bArr));
    }

    @t28
    private static final byte elementAtOrElse(byte[] bArr, int i, qy6<? super Integer, Byte> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= bArr.length) ? qy6Var.invoke(Integer.valueOf(i)).byteValue() : bArr[i];
    }

    @t28
    private static final Byte elementAtOrNull(byte[] bArr, int i) {
        md8.checkNotNullParameter(bArr, "<this>");
        return getOrNull(bArr, i);
    }

    @yfb
    public static final <C extends Collection<? super Byte>> C filterNotTo(@yfb byte[] bArr, @yfb C c, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (byte b : bArr) {
            if (!qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                c.add(Byte.valueOf(b));
            }
        }
        return c;
    }

    @yfb
    public static final <C extends Collection<? super Byte>> C filterTo(@yfb byte[] bArr, @yfb C c, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (byte b : bArr) {
            if (qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                c.add(Byte.valueOf(b));
            }
        }
        return c;
    }

    @t28
    private static final Byte find(byte[] bArr, qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (byte b : bArr) {
            if (qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                return Byte.valueOf(b);
            }
        }
        return null;
    }

    @gib
    public static final Byte firstOrNull(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(byte[] bArr, gz6<? super Integer, ? super Byte, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i2), Byte.valueOf(bArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    public static final <R> R fold(@yfb byte[] bArr, R r, @yfb gz6<? super R, ? super Byte, ? extends R> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (byte b : bArr) {
            r = gz6Var.invoke(r, Byte.valueOf(b));
        }
        return r;
    }

    public static final <R> R foldIndexed(@yfb byte[] bArr, R r, @yfb kz6<? super Integer, ? super R, ? super Byte, ? extends R> kz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = kz6Var.invoke(Integer.valueOf(i2), r, Byte.valueOf(bArr[i]));
            i++;
            i2++;
        }
        return r;
    }

    public static final void forEach(@yfb byte[] bArr, @yfb qy6<? super Byte, bth> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (byte b : bArr) {
            qy6Var.invoke(Byte.valueOf(b));
        }
    }

    public static final void forEachIndexed(@yfb byte[] bArr, @yfb gz6<? super Integer, ? super Byte, bth> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), Byte.valueOf(bArr[i]));
            i++;
            i2++;
        }
    }

    @yfb
    public static f78 getIndices(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return new f78(0, getLastIndex(bArr));
    }

    public static int getLastIndex(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return bArr.length - 1;
    }

    @t28
    private static final byte getOrElse(byte[] bArr, int i, qy6<? super Integer, Byte> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= bArr.length) ? qy6Var.invoke(Integer.valueOf(i)).byteValue() : bArr[i];
    }

    @gib
    public static final Byte getOrNull(@yfb byte[] bArr, int i) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (i < 0 || i >= bArr.length) {
            return null;
        }
        return Byte.valueOf(bArr[i]);
    }

    @t28
    private static final boolean isEmpty(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0;
    }

    @t28
    private static final boolean isNotEmpty(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return !(bArr.length == 0);
    }

    @yfb
    public static final String joinToString(@yfb byte[] bArr, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super Byte, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        return ((StringBuilder) joinTo(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, qy6Var)).toString();
    }

    public static /* synthetic */ String joinToString$default(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            qy6Var = null;
        }
        return joinToString(bArr, charSequence, charSequence5, charSequence6, i3, charSequence7, (qy6<? super Byte, ? extends CharSequence>) qy6Var);
    }

    @gib
    public static final Byte lastOrNull(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    public static final boolean none(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0;
    }

    @jjf(version = "1.4")
    @t28
    private static final byte[] onEach(byte[] bArr, qy6<? super Byte, bth> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (byte b : bArr) {
            qy6Var.invoke(Byte.valueOf(b));
        }
        return bArr;
    }

    @jjf(version = "1.4")
    @t28
    private static final byte[] onEachIndexed(byte[] bArr, gz6<? super Integer, ? super Byte, bth> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), Byte.valueOf(bArr[i]));
            i++;
            i2++;
        }
        return bArr;
    }

    @jjf(version = "1.3")
    @t28
    private static final byte random(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return random(bArr, (tod) tod.f85517a);
    }

    @jjf(version = "1.4")
    @t28
    private static final Byte randomOrNull(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return randomOrNull(bArr, (tod) tod.f85517a);
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> scan(short[] sArr, R r, gz6<? super R, ? super Short, ? extends R> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (sArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r);
        for (short s : sArr) {
            r = gz6Var.invoke(r, Short.valueOf(s));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> scanIndexed(short[] sArr, R r, kz6<? super Integer, ? super R, ? super Short, ? extends R> kz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (sArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r);
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Short.valueOf(sArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    public static final void shuffle(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        shuffle(bArr, (tod) tod.f85517a);
    }

    @gib
    public static final Byte singleOrNull(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    public static final void sortDescending(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 1) {
            u70.sort(bArr);
            reverse(bArr);
        }
    }

    @yfb
    public static final List<Byte> sorted(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        Byte[] typedArray = u70.toTypedArray(bArr);
        u70.sort((Object[]) typedArray);
        return u70.asList(typedArray);
    }

    @yfb
    public static final <R extends Comparable<? super R>> List<Byte> sortedBy(@yfb byte[] bArr, @yfb qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(bArr, (Comparator<? super Byte>) new md2.C9296a(qy6Var));
    }

    @yfb
    public static final <R extends Comparable<? super R>> List<Byte> sortedByDescending(@yfb byte[] bArr, @yfb qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(bArr, (Comparator<? super Byte>) new md2.C9298c(qy6Var));
    }

    @yfb
    public static final List<Byte> sortedDescending(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        u70.sort(bArrCopyOf);
        return reversed(bArrCopyOf);
    }

    @yfb
    public static final List<Byte> sortedWith(@yfb byte[] bArr, @yfb Comparator<? super Byte> comparator) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Byte[] typedArray = u70.toTypedArray(bArr);
        u70.sortWith(typedArray, comparator);
        return u70.asList(typedArray);
    }

    public static final int sum(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        int i = 0;
        for (short s : sArr) {
            i += s;
        }
        return i;
    }

    @yfb
    public static final HashSet<Byte> toHashSet(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return (HashSet) toCollection(bArr, new HashSet(wt9.mapCapacity(bArr.length)));
    }

    @yfb
    public static final List<Byte> toMutableList(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    @yfb
    public static final Set<Byte> toMutableSet(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return (Set) toCollection(bArr, new LinkedHashSet(wt9.mapCapacity(bArr.length)));
    }

    @yfb
    public static final Iterable<q08<Byte>> withIndex(@yfb final byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return new r08(new ny6() { // from class: a80
            @Override // p000.ny6
            public final Object invoke() {
                return m60.iterator(bArr);
            }
        });
    }

    public static final boolean all(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (short s : sArr) {
            if (!qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return !(sArr.length == 0);
    }

    @yfb
    public static final Iterable<Byte> asIterable(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0 ? l82.emptyList() : new C5170b(bArr);
    }

    @yfb
    public static final vye<Byte> asSequence(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0 ? ize.emptySequence() : new C5179k(bArr);
    }

    @yfb
    public static final <K, M extends Map<? super K, ? super Byte>> M associateByTo(@yfb byte[] bArr, @yfb M m, @yfb qy6<? super Byte, ? extends K> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (byte b : bArr) {
            m.put(qy6Var.invoke(Byte.valueOf(b)), Byte.valueOf(b));
        }
        return m;
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@yfb byte[] bArr, @yfb M m, @yfb qy6<? super Byte, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (byte b : bArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Byte.valueOf(b));
            m.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return m;
    }

    @jjf(version = "1.4")
    @t28
    private static final <V, M extends Map<? super Byte, ? super V>> M associateWithTo(byte[] bArr, M m, qy6<? super Byte, ? extends V> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        for (byte b : bArr) {
            m.put(Byte.valueOf(b), qy6Var.invoke(Byte.valueOf(b)));
        }
        return m;
    }

    public static final double average(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (int i2 : iArr) {
            d += (double) i2;
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    @t28
    private static final short component1(short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return sArr[0];
    }

    @t28
    private static final short component2(short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return sArr[1];
    }

    @t28
    private static final short component3(short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return sArr[2];
    }

    @t28
    private static final short component4(short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return sArr[3];
    }

    @t28
    private static final short component5(short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return sArr[4];
    }

    public static boolean contains(@yfb short[] sArr, short s) {
        md8.checkNotNullParameter(sArr, "<this>");
        return indexOf(sArr, s) >= 0;
    }

    @t28
    private static final int count(short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @yfb
    public static final List<Short> distinct(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return v82.toList(toMutableSet(sArr));
    }

    @yfb
    public static final List<Byte> drop(@yfb byte[] bArr, int i) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (i >= 0) {
            return takeLast(bArr, kpd.coerceAtLeast(bArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final List<Byte> dropLast(@yfb byte[] bArr, int i) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (i >= 0) {
            return take(bArr, kpd.coerceAtLeast(bArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @t28
    private static final short elementAtOrElse(short[] sArr, int i, qy6<? super Integer, Short> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= sArr.length) ? qy6Var.invoke(Integer.valueOf(i)).shortValue() : sArr[i];
    }

    @t28
    private static final Short elementAtOrNull(short[] sArr, int i) {
        md8.checkNotNullParameter(sArr, "<this>");
        return getOrNull(sArr, i);
    }

    @yfb
    public static final List<Byte> filter(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b : bArr) {
            if (qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                arrayList.add(Byte.valueOf(b));
            }
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Byte>> C filterIndexedTo(@yfb byte[] bArr, @yfb C c, @yfb gz6<? super Integer, ? super Byte, Boolean> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "predicate");
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Byte.valueOf(b)).booleanValue()) {
                c.add(Byte.valueOf(b));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @yfb
    public static final List<Byte> filterNot(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b : bArr) {
            if (!qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                arrayList.add(Byte.valueOf(b));
            }
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Short>> C filterNotTo(@yfb short[] sArr, @yfb C c, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (short s : sArr) {
            if (!qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                c.add(Short.valueOf(s));
            }
        }
        return c;
    }

    @yfb
    public static final <C extends Collection<? super Short>> C filterTo(@yfb short[] sArr, @yfb C c, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (short s : sArr) {
            if (qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                c.add(Short.valueOf(s));
            }
        }
        return c;
    }

    @t28
    private static final Short find(short[] sArr, qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (short s : sArr) {
            if (qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                return Short.valueOf(s);
            }
        }
        return null;
    }

    @gib
    public static final Short firstOrNull(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(short[] sArr, gz6<? super Integer, ? super Short, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i2), Short.valueOf(sArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    public static final <R> R fold(@yfb short[] sArr, R r, @yfb gz6<? super R, ? super Short, ? extends R> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (short s : sArr) {
            r = gz6Var.invoke(r, Short.valueOf(s));
        }
        return r;
    }

    public static final <R> R foldIndexed(@yfb short[] sArr, R r, @yfb kz6<? super Integer, ? super R, ? super Short, ? extends R> kz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = kz6Var.invoke(Integer.valueOf(i2), r, Short.valueOf(sArr[i]));
            i++;
            i2++;
        }
        return r;
    }

    public static final <R> R foldRight(@yfb byte[] bArr, R r, @yfb gz6<? super Byte, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (int lastIndex = getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r = gz6Var.invoke(Byte.valueOf(bArr[lastIndex]), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@yfb byte[] bArr, R r, @yfb kz6<? super Integer, ? super Byte, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        for (int lastIndex = getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r = kz6Var.invoke(Integer.valueOf(lastIndex), Byte.valueOf(bArr[lastIndex]), r);
        }
        return r;
    }

    public static final void forEach(@yfb short[] sArr, @yfb qy6<? super Short, bth> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (short s : sArr) {
            qy6Var.invoke(Short.valueOf(s));
        }
    }

    public static final void forEachIndexed(@yfb short[] sArr, @yfb gz6<? super Integer, ? super Short, bth> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), Short.valueOf(sArr[i]));
            i++;
            i2++;
        }
    }

    @yfb
    public static f78 getIndices(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return new f78(0, getLastIndex(sArr));
    }

    public static int getLastIndex(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return sArr.length - 1;
    }

    @t28
    private static final short getOrElse(short[] sArr, int i, qy6<? super Integer, Short> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= sArr.length) ? qy6Var.invoke(Integer.valueOf(i)).shortValue() : sArr[i];
    }

    @gib
    public static final Short getOrNull(@yfb short[] sArr, int i) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (i < 0 || i >= sArr.length) {
            return null;
        }
        return Short.valueOf(sArr[i]);
    }

    public static final int indexOfFirst(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (qy6Var.invoke(Byte.valueOf(bArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (qy6Var.invoke(Byte.valueOf(bArr[length])).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @yfb
    public static final Set<Byte> intersect(@yfb byte[] bArr, @yfb Iterable<Byte> iterable) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        q82.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    @t28
    private static final boolean isEmpty(short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0;
    }

    @t28
    private static final boolean isNotEmpty(short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return !(sArr.length == 0);
    }

    @yfb
    public static final String joinToString(@yfb short[] sArr, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super Short, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        return ((StringBuilder) joinTo(sArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, qy6Var)).toString();
    }

    public static /* synthetic */ String joinToString$default(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            qy6Var = null;
        }
        return joinToString(sArr, charSequence, charSequence5, charSequence6, i3, charSequence7, (qy6<? super Short, ? extends CharSequence>) qy6Var);
    }

    @gib
    public static final Short lastOrNull(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@yfb byte[] bArr, @yfb C c, @yfb gz6<? super Integer, ? super Byte, ? extends R> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(gz6Var.invoke(Integer.valueOf(i2), Byte.valueOf(bArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapTo(@yfb byte[] bArr, @yfb C c, @yfb qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (byte b : bArr) {
            c.add(qy6Var.invoke(Byte.valueOf(b)));
        }
        return c;
    }

    public static final boolean none(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0;
    }

    @jjf(version = "1.4")
    @t28
    private static final short[] onEach(short[] sArr, qy6<? super Short, bth> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (short s : sArr) {
            qy6Var.invoke(Short.valueOf(s));
        }
        return sArr;
    }

    @jjf(version = "1.4")
    @t28
    private static final short[] onEachIndexed(short[] sArr, gz6<? super Integer, ? super Short, bth> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), Short.valueOf(sArr[i]));
            i++;
            i2++;
        }
        return sArr;
    }

    @jjf(version = "1.3")
    @t28
    private static final short random(short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return random(sArr, (tod) tod.f85517a);
    }

    @jjf(version = "1.4")
    @t28
    private static final Short randomOrNull(short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return randomOrNull(sArr, (tod) tod.f85517a);
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> scan(int[] iArr, R r, gz6<? super R, ? super Integer, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (iArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r);
        for (int i : iArr) {
            r = gz6Var.invoke(r, Integer.valueOf(i));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> scanIndexed(int[] iArr, R r, kz6<? super Integer, ? super R, ? super Integer, ? extends R> kz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (iArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Integer.valueOf(iArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    public static final void shuffle(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        shuffle(sArr, (tod) tod.f85517a);
    }

    @gib
    public static final Short singleOrNull(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    @yfb
    public static final List<Byte> slice(@yfb byte[] bArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? l82.emptyList() : u70.asList(u70.copyOfRange(bArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1));
    }

    @yfb
    public static final List<Short> sorted(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        Short[] typedArray = u70.toTypedArray(sArr);
        u70.sort((Object[]) typedArray);
        return u70.asList(typedArray);
    }

    @yfb
    public static final byte[] sortedArray(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        u70.sort(bArrCopyOf);
        return bArrCopyOf;
    }

    @yfb
    public static final byte[] sortedArrayDescending(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        sortDescending(bArrCopyOf);
        return bArrCopyOf;
    }

    @yfb
    public static final <R extends Comparable<? super R>> List<Short> sortedBy(@yfb short[] sArr, @yfb qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(sArr, (Comparator<? super Short>) new md2.C9296a(qy6Var));
    }

    @yfb
    public static final <R extends Comparable<? super R>> List<Short> sortedByDescending(@yfb short[] sArr, @yfb qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(sArr, (Comparator<? super Short>) new md2.C9298c(qy6Var));
    }

    @yfb
    public static final List<Short> sortedDescending(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        u70.sort(sArrCopyOf);
        return reversed(sArrCopyOf);
    }

    @yfb
    public static final List<Short> sortedWith(@yfb short[] sArr, @yfb Comparator<? super Short> comparator) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Short[] typedArray = u70.toTypedArray(sArr);
        u70.sortWith(typedArray, comparator);
        return u70.asList(typedArray);
    }

    @yfb
    public static final Set<Byte> subtract(@yfb byte[] bArr, @yfb Iterable<Byte> iterable) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        q82.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    public static int sum(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final int sumBy(@yfb byte[] bArr, @yfb qy6<? super Byte, Integer> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (byte b : bArr) {
            iIntValue += qy6Var.invoke(Byte.valueOf(b)).intValue();
        }
        return iIntValue;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final double sumByDouble(@yfb byte[] bArr, @yfb qy6<? super Byte, Double> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (byte b : bArr) {
            dDoubleValue += qy6Var.invoke(Byte.valueOf(b)).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfDouble")
    private static final double sumOfDouble(byte[] bArr, qy6<? super Byte, Double> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (byte b : bArr) {
            dDoubleValue += qy6Var.invoke(Byte.valueOf(b)).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfInt")
    private static final int sumOfInt(byte[] bArr, qy6<? super Byte, Integer> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (byte b : bArr) {
            iIntValue += qy6Var.invoke(Byte.valueOf(b)).intValue();
        }
        return iIntValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfLong")
    private static final long sumOfLong(byte[] bArr, qy6<? super Byte, Long> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jLongValue = 0;
        for (byte b : bArr) {
            jLongValue += qy6Var.invoke(Byte.valueOf(b)).longValue();
        }
        return jLongValue;
    }

    @yfb
    public static final <C extends Collection<? super Byte>> C toCollection(@yfb byte[] bArr, @yfb C c) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        for (byte b : bArr) {
            c.add(Byte.valueOf(b));
        }
        return c;
    }

    @yfb
    public static final HashSet<Short> toHashSet(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return (HashSet) toCollection(sArr, new HashSet(wt9.mapCapacity(sArr.length)));
    }

    @yfb
    public static final Set<Short> toMutableSet(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return (Set) toCollection(sArr, new LinkedHashSet(wt9.mapCapacity(sArr.length)));
    }

    @yfb
    public static final Set<Byte> union(@yfb byte[] bArr, @yfb Iterable<Byte> iterable) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        q82.addAll(mutableSet, iterable);
        return mutableSet;
    }

    @yfb
    public static final Iterable<q08<Short>> withIndex(@yfb final short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return new r08(new ny6() { // from class: w70
            @Override // p000.ny6
            public final Object invoke() {
                return m60.iterator(sArr);
            }
        });
    }

    public static final boolean all(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int i : iArr) {
            if (!qy6Var.invoke(Integer.valueOf(i)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return !(iArr.length == 0);
    }

    @jjf(version = "1.4")
    @t28
    private static final <V> Map<Byte, V> associateWith(byte[] bArr, qy6<? super Byte, ? extends V> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(bArr.length), 16));
        for (byte b : bArr) {
            linkedHashMap.put(Byte.valueOf(b), qy6Var.invoke(Byte.valueOf(b)));
        }
        return linkedHashMap;
    }

    public static final double average(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (long j : jArr) {
            d += j;
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    @t28
    private static final int component1(int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return iArr[0];
    }

    @t28
    private static final int component2(int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return iArr[1];
    }

    @t28
    private static final int component3(int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return iArr[2];
    }

    @t28
    private static final int component4(int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return iArr[3];
    }

    @t28
    private static final int component5(int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return iArr[4];
    }

    public static boolean contains(@yfb int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "<this>");
        return indexOf(iArr, i) >= 0;
    }

    @t28
    private static final int count(int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @yfb
    public static final List<Integer> distinct(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return v82.toList(toMutableSet(iArr));
    }

    @t28
    private static final int elementAtOrElse(int[] iArr, int i, qy6<? super Integer, Integer> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= iArr.length) ? qy6Var.invoke(Integer.valueOf(i)).intValue() : iArr[i];
    }

    @t28
    private static final Integer elementAtOrNull(int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "<this>");
        return getOrNull(iArr, i);
    }

    @yfb
    public static final List<Byte> filterIndexed(@yfb byte[] bArr, @yfb gz6<? super Integer, ? super Byte, Boolean> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Byte.valueOf(b)).booleanValue()) {
                arrayList.add(Byte.valueOf(b));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Integer>> C filterNotTo(@yfb int[] iArr, @yfb C c, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int i : iArr) {
            if (!qy6Var.invoke(Integer.valueOf(i)).booleanValue()) {
                c.add(Integer.valueOf(i));
            }
        }
        return c;
    }

    @yfb
    public static final <C extends Collection<? super Integer>> C filterTo(@yfb int[] iArr, @yfb C c, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int i : iArr) {
            if (qy6Var.invoke(Integer.valueOf(i)).booleanValue()) {
                c.add(Integer.valueOf(i));
            }
        }
        return c;
    }

    @t28
    private static final Integer find(int[] iArr, qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int i : iArr) {
            if (qy6Var.invoke(Integer.valueOf(i)).booleanValue()) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    @t28
    private static final Byte findLast(byte[] bArr, qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                byte b = bArr[length];
                if (qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                    return Byte.valueOf(b);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    public static byte first(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @gib
    public static final Integer firstOrNull(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(int[] iArr, gz6<? super Integer, ? super Integer, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(byte[] bArr, C c, gz6<? super Integer, ? super Byte, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i2), Byte.valueOf(bArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C flatMapTo(@yfb byte[] bArr, @yfb C c, @yfb qy6<? super Byte, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (byte b : bArr) {
            q82.addAll(c, qy6Var.invoke(Byte.valueOf(b)));
        }
        return c;
    }

    public static final <R> R fold(@yfb int[] iArr, R r, @yfb gz6<? super R, ? super Integer, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (int i : iArr) {
            r = gz6Var.invoke(r, Integer.valueOf(i));
        }
        return r;
    }

    public static final <R> R foldIndexed(@yfb int[] iArr, R r, @yfb kz6<? super Integer, ? super R, ? super Integer, ? extends R> kz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = kz6Var.invoke(Integer.valueOf(i2), r, Integer.valueOf(iArr[i]));
            i++;
            i2++;
        }
        return r;
    }

    public static final void forEach(@yfb int[] iArr, @yfb qy6<? super Integer, bth> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (int i : iArr) {
            qy6Var.invoke(Integer.valueOf(i));
        }
    }

    public static final void forEachIndexed(@yfb int[] iArr, @yfb gz6<? super Integer, ? super Integer, bth> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i]));
            i++;
            i2++;
        }
    }

    @yfb
    public static f78 getIndices(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return new f78(0, getLastIndex(iArr));
    }

    public static int getLastIndex(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return iArr.length - 1;
    }

    @t28
    private static final int getOrElse(int[] iArr, int i, qy6<? super Integer, Integer> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= iArr.length) ? qy6Var.invoke(Integer.valueOf(i)).intValue() : iArr[i];
    }

    @gib
    public static Integer getOrNull(@yfb int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    @t28
    private static final boolean isEmpty(int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0;
    }

    @t28
    private static final boolean isNotEmpty(int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return !(iArr.length == 0);
    }

    @yfb
    public static final String joinToString(@yfb int[] iArr, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super Integer, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        return ((StringBuilder) joinTo(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, qy6Var)).toString();
    }

    public static /* synthetic */ String joinToString$default(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            qy6Var = null;
        }
        return joinToString(iArr, charSequence, charSequence5, charSequence6, i3, charSequence7, (qy6<? super Integer, ? extends CharSequence>) qy6Var);
    }

    public static byte last(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[getLastIndex(bArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @gib
    public static final Integer lastOrNull(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    @yfb
    public static final <R> List<R> map(@yfb byte[] bArr, @yfb qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(qy6Var.invoke(Byte.valueOf(b)));
        }
        return arrayList;
    }

    @yfb
    public static final <R> List<R> mapIndexed(@yfb byte[] bArr, @yfb gz6<? super Integer, ? super Byte, ? extends R> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(i2), Byte.valueOf(bArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    public static final boolean none(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0;
    }

    @jjf(version = "1.4")
    @t28
    private static final int[] onEach(int[] iArr, qy6<? super Integer, bth> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (int i : iArr) {
            qy6Var.invoke(Integer.valueOf(i));
        }
        return iArr;
    }

    @jjf(version = "1.4")
    @t28
    private static final int[] onEachIndexed(int[] iArr, gz6<? super Integer, ? super Integer, bth> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i]));
            i++;
            i2++;
        }
        return iArr;
    }

    @jjf(version = "1.3")
    @t28
    private static final int random(int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return random(iArr, (tod) tod.f85517a);
    }

    @jjf(version = "1.4")
    @t28
    private static final Integer randomOrNull(int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return randomOrNull(iArr, (tod) tod.f85517a);
    }

    @gib
    @jjf(version = "1.4")
    public static final Byte reduceRightIndexedOrNull(@yfb byte[] bArr, @yfb kz6<? super Integer, ? super Byte, ? super Byte, Byte> kz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte bByteValue = bArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            bByteValue = kz6Var.invoke(Integer.valueOf(i), Byte.valueOf(bArr[i]), Byte.valueOf(bByteValue)).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Byte reduceRightOrNull(@yfb byte[] bArr, @yfb gz6<? super Byte, ? super Byte, Byte> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte bByteValue = bArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            bByteValue = gz6Var.invoke(Byte.valueOf(bArr[i]), Byte.valueOf(bByteValue)).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @yfb
    public static final List<Byte> reversed(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return l82.emptyList();
        }
        List<Byte> mutableList = toMutableList(bArr);
        s82.reverse(mutableList);
        return mutableList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> scan(long[] jArr, R r, gz6<? super R, ? super Long, ? extends R> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (jArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r);
        for (long j : jArr) {
            r = gz6Var.invoke(r, Long.valueOf(j));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> scanIndexed(long[] jArr, R r, kz6<? super Integer, ? super R, ? super Long, ? extends R> kz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (jArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r);
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Long.valueOf(jArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    public static final void shuffle(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        shuffle(iArr, (tod) tod.f85517a);
    }

    @gib
    public static final Integer singleOrNull(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    @yfb
    public static byte[] sliceArray(@yfb byte[] bArr, @yfb Collection<Integer> collection) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(collection, "indices");
        byte[] bArr2 = new byte[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr2[i] = bArr[it.next().intValue()];
            i++;
        }
        return bArr2;
    }

    @yfb
    public static final List<Integer> sorted(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        Integer[] typedArray = u70.toTypedArray(iArr);
        u70.sort((Object[]) typedArray);
        return u70.asList(typedArray);
    }

    @yfb
    public static final <R extends Comparable<? super R>> List<Integer> sortedBy(@yfb int[] iArr, @yfb qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(iArr, (Comparator<? super Integer>) new md2.C9296a(qy6Var));
    }

    @yfb
    public static final <R extends Comparable<? super R>> List<Integer> sortedByDescending(@yfb int[] iArr, @yfb qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(iArr, (Comparator<? super Integer>) new md2.C9298c(qy6Var));
    }

    @yfb
    public static final List<Integer> sortedDescending(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        u70.sort(iArrCopyOf);
        return reversed(iArrCopyOf);
    }

    @yfb
    public static final List<Integer> sortedWith(@yfb int[] iArr, @yfb Comparator<? super Integer> comparator) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Integer[] typedArray = u70.toTypedArray(iArr);
        u70.sortWith(typedArray, comparator);
        return u70.asList(typedArray);
    }

    public static long sum(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        return j;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfUInt")
    @ihi(markerClass = {yh5.class})
    private static final int sumOfUInt(byte[] bArr, qy6<? super Byte, woh> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        for (byte b : bArr) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(Byte.valueOf(b)).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfULong")
    @ihi(markerClass = {yh5.class})
    private static final long sumOfULong(byte[] bArr, qy6<? super Byte, oph> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jM31533constructorimpl = oph.m31533constructorimpl(0L);
        for (byte b : bArr) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + qy6Var.invoke(Byte.valueOf(b)).m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @yfb
    public static final HashSet<Integer> toHashSet(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return (HashSet) toCollection(iArr, new HashSet(wt9.mapCapacity(iArr.length)));
    }

    @yfb
    public static final List<Short> toMutableList(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    @yfb
    public static final Set<Integer> toMutableSet(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return (Set) toCollection(iArr, new LinkedHashSet(wt9.mapCapacity(iArr.length)));
    }

    @yfb
    public static final Iterable<q08<Integer>> withIndex(@yfb final int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return new r08(new ny6() { // from class: c80
            @Override // p000.ny6
            public final Object invoke() {
                return m60.iterator(iArr);
            }
        });
    }

    @yfb
    public static final <R, V> List<V> zip(@yfb byte[] bArr, @yfb R[] rArr, @yfb gz6<? super Byte, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(bArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Byte.valueOf(bArr[i]), rArr[i]));
        }
        return arrayList;
    }

    public static final boolean all(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (long j : jArr) {
            if (!qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return !(jArr.length == 0);
    }

    @yfb
    public static final Iterable<Short> asIterable(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0 ? l82.emptyList() : new C5171c(sArr);
    }

    @yfb
    public static final vye<Short> asSequence(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0 ? ize.emptySequence() : new C5180l(sArr);
    }

    @yfb
    public static final <K, V> Map<K, V> associate(@yfb byte[] bArr, @yfb qy6<? super Byte, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(bArr.length), 16));
        for (byte b : bArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Byte.valueOf(b));
            linkedHashMap.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K> Map<K, Byte> associateBy(@yfb byte[] bArr, @yfb qy6<? super Byte, ? extends K> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(bArr.length), 16));
        for (byte b : bArr) {
            linkedHashMap.put(qy6Var.invoke(Byte.valueOf(b)), Byte.valueOf(b));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K, M extends Map<? super K, ? super Short>> M associateByTo(@yfb short[] sArr, @yfb M m, @yfb qy6<? super Short, ? extends K> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (short s : sArr) {
            m.put(qy6Var.invoke(Short.valueOf(s)), Short.valueOf(s));
        }
        return m;
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@yfb short[] sArr, @yfb M m, @yfb qy6<? super Short, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (short s : sArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Short.valueOf(s));
            m.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return m;
    }

    @jjf(version = "1.4")
    @t28
    private static final <V, M extends Map<? super Short, ? super V>> M associateWithTo(short[] sArr, M m, qy6<? super Short, ? extends V> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        for (short s : sArr) {
            m.put(Short.valueOf(s), qy6Var.invoke(Short.valueOf(s)));
        }
        return m;
    }

    public static final double average(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (float f : fArr) {
            d += (double) f;
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    @t28
    private static final long component1(long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return jArr[0];
    }

    @t28
    private static final long component2(long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return jArr[1];
    }

    @t28
    private static final long component3(long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return jArr[2];
    }

    @t28
    private static final long component4(long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return jArr[3];
    }

    @t28
    private static final long component5(long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return jArr[4];
    }

    public static boolean contains(@yfb long[] jArr, long j) {
        md8.checkNotNullParameter(jArr, "<this>");
        return indexOf(jArr, j) >= 0;
    }

    @t28
    private static final int count(long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @yfb
    public static final List<Long> distinct(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return v82.toList(toMutableSet(jArr));
    }

    @yfb
    public static final List<Short> drop(@yfb short[] sArr, int i) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (i >= 0) {
            return takeLast(sArr, kpd.coerceAtLeast(sArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final List<Short> dropLast(@yfb short[] sArr, int i) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (i >= 0) {
            return take(sArr, kpd.coerceAtLeast(sArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final List<Byte> dropLastWhile(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(bArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Byte.valueOf(bArr[lastIndex])).booleanValue()) {
                return take(bArr, lastIndex + 1);
            }
        }
        return l82.emptyList();
    }

    @t28
    private static final long elementAtOrElse(long[] jArr, int i, qy6<? super Integer, Long> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= jArr.length) ? qy6Var.invoke(Integer.valueOf(i)).longValue() : jArr[i];
    }

    @t28
    private static final Long elementAtOrNull(long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "<this>");
        return getOrNull(jArr, i);
    }

    @yfb
    public static final List<Short> filter(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s : sArr) {
            if (qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                arrayList.add(Short.valueOf(s));
            }
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Short>> C filterIndexedTo(@yfb short[] sArr, @yfb C c, @yfb gz6<? super Integer, ? super Short, Boolean> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "predicate");
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            short s = sArr[i];
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Short.valueOf(s)).booleanValue()) {
                c.add(Short.valueOf(s));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @yfb
    public static final List<Short> filterNot(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s : sArr) {
            if (!qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                arrayList.add(Short.valueOf(s));
            }
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Long>> C filterNotTo(@yfb long[] jArr, @yfb C c, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (long j : jArr) {
            if (!qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                c.add(Long.valueOf(j));
            }
        }
        return c;
    }

    @yfb
    public static final <C extends Collection<? super Long>> C filterTo(@yfb long[] jArr, @yfb C c, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (long j : jArr) {
            if (qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                c.add(Long.valueOf(j));
            }
        }
        return c;
    }

    @t28
    private static final Long find(long[] jArr, qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (long j : jArr) {
            if (qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                return Long.valueOf(j);
            }
        }
        return null;
    }

    @gib
    public static final Long firstOrNull(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    @yfb
    public static final <R> List<R> flatMap(@yfb byte[] bArr, @yfb qy6<? super Byte, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        for (byte b : bArr) {
            q82.addAll(arrayList, qy6Var.invoke(Byte.valueOf(b)));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(long[] jArr, gz6<? super Integer, ? super Long, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    public static final <R> R fold(@yfb long[] jArr, R r, @yfb gz6<? super R, ? super Long, ? extends R> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (long j : jArr) {
            r = gz6Var.invoke(r, Long.valueOf(j));
        }
        return r;
    }

    public static final <R> R foldIndexed(@yfb long[] jArr, R r, @yfb kz6<? super Integer, ? super R, ? super Long, ? extends R> kz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = kz6Var.invoke(Integer.valueOf(i2), r, Long.valueOf(jArr[i]));
            i++;
            i2++;
        }
        return r;
    }

    public static final <R> R foldRight(@yfb short[] sArr, R r, @yfb gz6<? super Short, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (int lastIndex = getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r = gz6Var.invoke(Short.valueOf(sArr[lastIndex]), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@yfb short[] sArr, R r, @yfb kz6<? super Integer, ? super Short, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        for (int lastIndex = getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r = kz6Var.invoke(Integer.valueOf(lastIndex), Short.valueOf(sArr[lastIndex]), r);
        }
        return r;
    }

    public static final void forEach(@yfb long[] jArr, @yfb qy6<? super Long, bth> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (long j : jArr) {
            qy6Var.invoke(Long.valueOf(j));
        }
    }

    public static final void forEachIndexed(@yfb long[] jArr, @yfb gz6<? super Integer, ? super Long, bth> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i]));
            i++;
            i2++;
        }
    }

    @yfb
    public static f78 getIndices(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return new f78(0, getLastIndex(jArr));
    }

    public static int getLastIndex(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return jArr.length - 1;
    }

    @t28
    private static final long getOrElse(long[] jArr, int i, qy6<? super Integer, Long> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= jArr.length) ? qy6Var.invoke(Integer.valueOf(i)).longValue() : jArr[i];
    }

    @gib
    public static final Long getOrNull(@yfb long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (i < 0 || i >= jArr.length) {
            return null;
        }
        return Long.valueOf(jArr[i]);
    }

    public static int indexOf(@yfb byte[] bArr, byte b) {
        md8.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (qy6Var.invoke(Short.valueOf(sArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (qy6Var.invoke(Short.valueOf(sArr[length])).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @yfb
    public static final Set<Short> intersect(@yfb short[] sArr, @yfb Iterable<Short> iterable) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        q82.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    @t28
    private static final boolean isEmpty(long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0;
    }

    @t28
    private static final boolean isNotEmpty(long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return !(jArr.length == 0);
    }

    @yfb
    public static final String joinToString(@yfb long[] jArr, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super Long, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        return ((StringBuilder) joinTo(jArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, qy6Var)).toString();
    }

    public static /* synthetic */ String joinToString$default(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            qy6Var = null;
        }
        return joinToString(jArr, charSequence, charSequence5, charSequence6, i3, charSequence7, (qy6<? super Long, ? extends CharSequence>) qy6Var);
    }

    public static int lastIndexOf(@yfb byte[] bArr, byte b) {
        md8.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (b == bArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @gib
    public static final Long lastOrNull(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@yfb short[] sArr, @yfb C c, @yfb gz6<? super Integer, ? super Short, ? extends R> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(gz6Var.invoke(Integer.valueOf(i2), Short.valueOf(sArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapTo(@yfb short[] sArr, @yfb C c, @yfb qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (short s : sArr) {
            c.add(qy6Var.invoke(Short.valueOf(s)));
        }
        return c;
    }

    public static final boolean none(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0;
    }

    @jjf(version = "1.4")
    @t28
    private static final long[] onEach(long[] jArr, qy6<? super Long, bth> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (long j : jArr) {
            qy6Var.invoke(Long.valueOf(j));
        }
        return jArr;
    }

    @jjf(version = "1.4")
    @t28
    private static final long[] onEachIndexed(long[] jArr, gz6<? super Integer, ? super Long, bth> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i]));
            i++;
            i2++;
        }
        return jArr;
    }

    @jjf(version = "1.3")
    @t28
    private static final long random(long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return random(jArr, (tod) tod.f85517a);
    }

    @jjf(version = "1.4")
    @t28
    private static final Long randomOrNull(long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return randomOrNull(jArr, (tod) tod.f85517a);
    }

    @gib
    @jjf(version = "1.4")
    public static final Byte reduceIndexedOrNull(@yfb byte[] bArr, @yfb kz6<? super Integer, ? super Byte, ? super Byte, Byte> kz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte bByteValue = bArr[0];
        int lastIndex = getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                bByteValue = kz6Var.invoke(Integer.valueOf(i), Byte.valueOf(bByteValue), Byte.valueOf(bArr[i])).byteValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Byte.valueOf(bByteValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Byte reduceOrNull(@yfb byte[] bArr, @yfb gz6<? super Byte, ? super Byte, Byte> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte bByteValue = bArr[0];
        int lastIndex = getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                bByteValue = gz6Var.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[i])).byteValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Byte.valueOf(bByteValue);
    }

    public static final byte reduceRight(@yfb byte[] bArr, @yfb gz6<? super Byte, ? super Byte, Byte> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex >= 0) {
            byte bByteValue = bArr[lastIndex];
            for (int i = lastIndex - 1; i >= 0; i--) {
                bByteValue = gz6Var.invoke(Byte.valueOf(bArr[i]), Byte.valueOf(bByteValue)).byteValue();
            }
            return bByteValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final byte reduceRightIndexed(@yfb byte[] bArr, @yfb kz6<? super Integer, ? super Byte, ? super Byte, Byte> kz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex >= 0) {
            byte bByteValue = bArr[lastIndex];
            for (int i = lastIndex - 1; i >= 0; i--) {
                bByteValue = kz6Var.invoke(Integer.valueOf(i), Byte.valueOf(bArr[i]), Byte.valueOf(bByteValue)).byteValue();
            }
            return bByteValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @yfb
    public static byte[] reversedArray(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                bArr2[lastIndex - i] = bArr[i];
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return bArr2;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> scan(float[] fArr, R r, gz6<? super R, ? super Float, ? extends R> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (fArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r);
        for (float f : fArr) {
            r = gz6Var.invoke(r, Float.valueOf(f));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> scanIndexed(float[] fArr, R r, kz6<? super Integer, ? super R, ? super Float, ? extends R> kz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (fArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r);
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Float.valueOf(fArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    public static final void shuffle(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        shuffle(jArr, (tod) tod.f85517a);
    }

    public static byte single(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return bArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @gib
    public static final Long singleOrNull(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    @yfb
    public static final List<Short> slice(@yfb short[] sArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? l82.emptyList() : u70.asList(u70.copyOfRange(sArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (sArr.length > 1) {
            u70.sort(sArr);
            reverse(sArr);
        }
    }

    @yfb
    public static final List<Long> sorted(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        Long[] typedArray = u70.toTypedArray(jArr);
        u70.sort((Object[]) typedArray);
        return u70.asList(typedArray);
    }

    @yfb
    public static final short[] sortedArray(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        u70.sort(sArrCopyOf);
        return sArrCopyOf;
    }

    @yfb
    public static final short[] sortedArrayDescending(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        sortDescending(sArrCopyOf);
        return sArrCopyOf;
    }

    @yfb
    public static final <R extends Comparable<? super R>> List<Long> sortedBy(@yfb long[] jArr, @yfb qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(jArr, (Comparator<? super Long>) new md2.C9296a(qy6Var));
    }

    @yfb
    public static final <R extends Comparable<? super R>> List<Long> sortedByDescending(@yfb long[] jArr, @yfb qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(jArr, (Comparator<? super Long>) new md2.C9298c(qy6Var));
    }

    @yfb
    public static final List<Long> sortedDescending(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        u70.sort(jArrCopyOf);
        return reversed(jArrCopyOf);
    }

    @yfb
    public static final List<Long> sortedWith(@yfb long[] jArr, @yfb Comparator<? super Long> comparator) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Long[] typedArray = u70.toTypedArray(jArr);
        u70.sortWith(typedArray, comparator);
        return u70.asList(typedArray);
    }

    @yfb
    public static final Set<Short> subtract(@yfb short[] sArr, @yfb Iterable<Short> iterable) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        q82.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    public static final float sum(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        float f = 0.0f;
        for (float f2 : fArr) {
            f += f2;
        }
        return f;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final int sumBy(@yfb short[] sArr, @yfb qy6<? super Short, Integer> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (short s : sArr) {
            iIntValue += qy6Var.invoke(Short.valueOf(s)).intValue();
        }
        return iIntValue;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final double sumByDouble(@yfb short[] sArr, @yfb qy6<? super Short, Double> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (short s : sArr) {
            dDoubleValue += qy6Var.invoke(Short.valueOf(s)).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfDouble")
    private static final double sumOfDouble(short[] sArr, qy6<? super Short, Double> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (short s : sArr) {
            dDoubleValue += qy6Var.invoke(Short.valueOf(s)).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfInt")
    private static final int sumOfInt(short[] sArr, qy6<? super Short, Integer> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (short s : sArr) {
            iIntValue += qy6Var.invoke(Short.valueOf(s)).intValue();
        }
        return iIntValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfLong")
    private static final long sumOfLong(short[] sArr, qy6<? super Short, Long> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jLongValue = 0;
        for (short s : sArr) {
            jLongValue += qy6Var.invoke(Short.valueOf(s)).longValue();
        }
        return jLongValue;
    }

    @yfb
    public static final List<Byte> takeLastWhile(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(bArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Byte.valueOf(bArr[lastIndex])).booleanValue()) {
                return drop(bArr, lastIndex + 1);
            }
        }
        return toList(bArr);
    }

    @yfb
    public static final List<Byte> takeWhile(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b : bArr) {
            if (!qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                break;
            }
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Short>> C toCollection(@yfb short[] sArr, @yfb C c) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        for (short s : sArr) {
            c.add(Short.valueOf(s));
        }
        return c;
    }

    @yfb
    public static final HashSet<Long> toHashSet(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return (HashSet) toCollection(jArr, new HashSet(wt9.mapCapacity(jArr.length)));
    }

    @yfb
    public static List<Byte> toList(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return l82.emptyList();
        }
        if (length != 1) {
            return toMutableList(bArr);
        }
        return k82.listOf(Byte.valueOf(bArr[0]));
    }

    @yfb
    public static final Set<Long> toMutableSet(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return (Set) toCollection(jArr, new LinkedHashSet(wt9.mapCapacity(jArr.length)));
    }

    @yfb
    public static final Set<Byte> toSet(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return w6f.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(bArr, new LinkedHashSet(wt9.mapCapacity(bArr.length)));
        }
        return v6f.setOf(Byte.valueOf(bArr[0]));
    }

    @yfb
    public static final Set<Short> union(@yfb short[] sArr, @yfb Iterable<Short> iterable) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        q82.addAll(mutableSet, iterable);
        return mutableSet;
    }

    @yfb
    public static final Iterable<q08<Long>> withIndex(@yfb final long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return new r08(new ny6() { // from class: z70
            @Override // p000.ny6
            public final Object invoke() {
                return m60.iterator(jArr);
            }
        });
    }

    public static final boolean all(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (float f : fArr) {
            if (!qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return !(fArr.length == 0);
    }

    @jjf(version = "1.4")
    @t28
    private static final <V> Map<Short, V> associateWith(short[] sArr, qy6<? super Short, ? extends V> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(sArr.length), 16));
        for (short s : sArr) {
            linkedHashMap.put(Short.valueOf(s), qy6Var.invoke(Short.valueOf(s)));
        }
        return linkedHashMap;
    }

    public static final double average(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (double d2 : dArr) {
            d += d2;
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    @t28
    private static final float component1(float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return fArr[0];
    }

    @t28
    private static final float component2(float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return fArr[1];
    }

    @t28
    private static final float component3(float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return fArr[2];
    }

    @t28
    private static final float component4(float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return fArr[3];
    }

    @t28
    private static final float component5(float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return fArr[4];
    }

    public static final boolean contains(@yfb boolean[] zArr, boolean z) {
        md8.checkNotNullParameter(zArr, "<this>");
        return indexOf(zArr, z) >= 0;
    }

    @t28
    private static final int count(float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @yfb
    public static final List<Float> distinct(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return v82.toList(toMutableSet(fArr));
    }

    @yfb
    public static final List<Byte> dropWhile(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (byte b : bArr) {
            if (z) {
                arrayList.add(Byte.valueOf(b));
            } else if (!qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                arrayList.add(Byte.valueOf(b));
                z = true;
            }
        }
        return arrayList;
    }

    @t28
    private static final float elementAtOrElse(float[] fArr, int i, qy6<? super Integer, Float> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= fArr.length) ? qy6Var.invoke(Integer.valueOf(i)).floatValue() : fArr[i];
    }

    @t28
    private static final Float elementAtOrNull(float[] fArr, int i) {
        md8.checkNotNullParameter(fArr, "<this>");
        return getOrNull(fArr, i);
    }

    @yfb
    public static final <C extends Collection<? super Float>> C filterNotTo(@yfb float[] fArr, @yfb C c, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (float f : fArr) {
            if (!qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                c.add(Float.valueOf(f));
            }
        }
        return c;
    }

    @yfb
    public static final <C extends Collection<? super Float>> C filterTo(@yfb float[] fArr, @yfb C c, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (float f : fArr) {
            if (qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                c.add(Float.valueOf(f));
            }
        }
        return c;
    }

    @t28
    private static final Float find(float[] fArr, qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (float f : fArr) {
            if (qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                return Float.valueOf(f);
            }
        }
        return null;
    }

    @gib
    public static final Float firstOrNull(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(float[] fArr, gz6<? super Integer, ? super Float, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    public static final <R> R fold(@yfb float[] fArr, R r, @yfb gz6<? super R, ? super Float, ? extends R> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (float f : fArr) {
            r = gz6Var.invoke(r, Float.valueOf(f));
        }
        return r;
    }

    public static final <R> R foldIndexed(@yfb float[] fArr, R r, @yfb kz6<? super Integer, ? super R, ? super Float, ? extends R> kz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = kz6Var.invoke(Integer.valueOf(i2), r, Float.valueOf(fArr[i]));
            i++;
            i2++;
        }
        return r;
    }

    public static final void forEach(@yfb float[] fArr, @yfb qy6<? super Float, bth> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (float f : fArr) {
            qy6Var.invoke(Float.valueOf(f));
        }
    }

    public static final void forEachIndexed(@yfb float[] fArr, @yfb gz6<? super Integer, ? super Float, bth> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i]));
            i++;
            i2++;
        }
    }

    @yfb
    public static final f78 getIndices(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return new f78(0, getLastIndex(fArr));
    }

    public static int getLastIndex(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return fArr.length - 1;
    }

    @t28
    private static final float getOrElse(float[] fArr, int i, qy6<? super Integer, Float> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= fArr.length) ? qy6Var.invoke(Integer.valueOf(i)).floatValue() : fArr[i];
    }

    @gib
    public static final Float getOrNull(@yfb float[] fArr, int i) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (i < 0 || i >= fArr.length) {
            return null;
        }
        return Float.valueOf(fArr[i]);
    }

    @t28
    private static final boolean isEmpty(float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0;
    }

    @t28
    private static final boolean isNotEmpty(float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return !(fArr.length == 0);
    }

    @yfb
    public static final String joinToString(@yfb float[] fArr, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super Float, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        return ((StringBuilder) joinTo(fArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, qy6Var)).toString();
    }

    public static /* synthetic */ String joinToString$default(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            qy6Var = null;
        }
        return joinToString(fArr, charSequence, charSequence5, charSequence6, i3, charSequence7, (qy6<? super Float, ? extends CharSequence>) qy6Var);
    }

    @gib
    public static final Float lastOrNull(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R maxOfWithOrNull(byte[] bArr, Comparator<? super R> comparator, qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Byte.valueOf(bArr[i]));
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
    public static final Byte maxWithOrNull(@yfb byte[] bArr, @yfb Comparator<? super Byte> comparator) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        int lastIndex = getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b2 = bArr[i];
                if (comparator.compare(Byte.valueOf(b), Byte.valueOf(b2)) < 0) {
                    b = b2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Byte.valueOf(b);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R minOfWithOrNull(byte[] bArr, Comparator<? super R> comparator, qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Byte.valueOf(bArr[i]));
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
    public static final Byte minWithOrNull(@yfb byte[] bArr, @yfb Comparator<? super Byte> comparator) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        int lastIndex = getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b2 = bArr[i];
                if (comparator.compare(Byte.valueOf(b), Byte.valueOf(b2)) > 0) {
                    b = b2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Byte.valueOf(b);
    }

    public static final boolean none(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0;
    }

    @jjf(version = "1.4")
    @t28
    private static final float[] onEach(float[] fArr, qy6<? super Float, bth> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (float f : fArr) {
            qy6Var.invoke(Float.valueOf(f));
        }
        return fArr;
    }

    @jjf(version = "1.4")
    @t28
    private static final float[] onEachIndexed(float[] fArr, gz6<? super Integer, ? super Float, bth> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i]));
            i++;
            i2++;
        }
        return fArr;
    }

    @jjf(version = "1.3")
    @t28
    private static final float random(float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return random(fArr, (tod) tod.f85517a);
    }

    @jjf(version = "1.4")
    @t28
    private static final Float randomOrNull(float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return randomOrNull(fArr, (tod) tod.f85517a);
    }

    public static final byte reduce(@yfb byte[] bArr, @yfb gz6<? super Byte, ? super Byte, Byte> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (bArr.length != 0) {
            byte bByteValue = bArr[0];
            int lastIndex = getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    bByteValue = gz6Var.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[i])).byteValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return bByteValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final byte reduceIndexed(@yfb byte[] bArr, @yfb kz6<? super Integer, ? super Byte, ? super Byte, Byte> kz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (bArr.length != 0) {
            byte bByteValue = bArr[0];
            int lastIndex = getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    bByteValue = kz6Var.invoke(Integer.valueOf(i), Byte.valueOf(bByteValue), Byte.valueOf(bArr[i])).byteValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return bByteValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static void reverse(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(bArr);
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            byte b = bArr[i];
            bArr[i] = bArr[lastIndex];
            bArr[lastIndex] = b;
            lastIndex--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> runningFold(byte[] bArr, R r, gz6<? super R, ? super Byte, ? extends R> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (bArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r);
        for (byte b : bArr) {
            r = gz6Var.invoke(r, Byte.valueOf(b));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> runningFoldIndexed(byte[] bArr, R r, kz6<? super Integer, ? super R, ? super Byte, ? extends R> kz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (bArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r);
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Byte.valueOf(bArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> scan(double[] dArr, R r, gz6<? super R, ? super Double, ? extends R> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (dArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r);
        for (double d : dArr) {
            r = gz6Var.invoke(r, Double.valueOf(d));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> scanIndexed(double[] dArr, R r, kz6<? super Integer, ? super R, ? super Double, ? extends R> kz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (dArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r);
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Double.valueOf(dArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    public static final void shuffle(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        shuffle(fArr, (tod) tod.f85517a);
    }

    @gib
    public static final Float singleOrNull(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    @yfb
    public static final List<Float> sorted(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        Float[] typedArray = u70.toTypedArray(fArr);
        u70.sort((Object[]) typedArray);
        return u70.asList(typedArray);
    }

    @yfb
    public static final <R extends Comparable<? super R>> List<Float> sortedBy(@yfb float[] fArr, @yfb qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(fArr, (Comparator<? super Float>) new md2.C9296a(qy6Var));
    }

    @yfb
    public static final <R extends Comparable<? super R>> List<Float> sortedByDescending(@yfb float[] fArr, @yfb qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(fArr, (Comparator<? super Float>) new md2.C9298c(qy6Var));
    }

    @yfb
    public static final List<Float> sortedDescending(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        md8.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        u70.sort(fArrCopyOf);
        return reversed(fArrCopyOf);
    }

    @yfb
    public static final List<Float> sortedWith(@yfb float[] fArr, @yfb Comparator<? super Float> comparator) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Float[] typedArray = u70.toTypedArray(fArr);
        u70.sortWith(typedArray, comparator);
        return u70.asList(typedArray);
    }

    public static final double sum(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        double d = 0.0d;
        for (double d2 : dArr) {
            d += d2;
        }
        return d;
    }

    @yfb
    public static final HashSet<Float> toHashSet(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return (HashSet) toCollection(fArr, new HashSet(wt9.mapCapacity(fArr.length)));
    }

    @yfb
    public static final List<Integer> toMutableList(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    @yfb
    public static final Set<Float> toMutableSet(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return (Set) toCollection(fArr, new LinkedHashSet(wt9.mapCapacity(fArr.length)));
    }

    @yfb
    public static final Iterable<q08<Float>> withIndex(@yfb final float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return new r08(new ny6() { // from class: x70
            @Override // p000.ny6
            public final Object invoke() {
                return m60.iterator(fArr);
            }
        });
    }

    public static final boolean all(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (double d : dArr) {
            if (!qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return !(dArr.length == 0);
    }

    @yfb
    public static Iterable<Integer> asIterable(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0 ? l82.emptyList() : new C5172d(iArr);
    }

    @yfb
    public static final vye<Integer> asSequence(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0 ? ize.emptySequence() : new C5181m(iArr);
    }

    @yfb
    public static final <K, M extends Map<? super K, ? super Integer>> M associateByTo(@yfb int[] iArr, @yfb M m, @yfb qy6<? super Integer, ? extends K> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (int i : iArr) {
            m.put(qy6Var.invoke(Integer.valueOf(i)), Integer.valueOf(i));
        }
        return m;
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@yfb int[] iArr, @yfb M m, @yfb qy6<? super Integer, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (int i : iArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Integer.valueOf(i));
            m.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return m;
    }

    @jjf(version = "1.4")
    @t28
    private static final <V, M extends Map<? super Integer, ? super V>> M associateWithTo(int[] iArr, M m, qy6<? super Integer, ? extends V> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        for (int i : iArr) {
            m.put(Integer.valueOf(i), qy6Var.invoke(Integer.valueOf(i)));
        }
        return m;
    }

    @t28
    private static final double component1(double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return dArr[0];
    }

    @t28
    private static final double component2(double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return dArr[1];
    }

    @t28
    private static final double component3(double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return dArr[2];
    }

    @t28
    private static final double component4(double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return dArr[3];
    }

    @t28
    private static final double component5(double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return dArr[4];
    }

    public static boolean contains(@yfb char[] cArr, char c) {
        md8.checkNotNullParameter(cArr, "<this>");
        return indexOf(cArr, c) >= 0;
    }

    @t28
    private static final int count(double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @yfb
    public static final List<Double> distinct(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return v82.toList(toMutableSet(dArr));
    }

    @yfb
    public static final <K> List<Byte> distinctBy(@yfb byte[] bArr, @yfb qy6<? super Byte, ? extends K> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (byte b : bArr) {
            if (hashSet.add(qy6Var.invoke(Byte.valueOf(b)))) {
                arrayList.add(Byte.valueOf(b));
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Integer> drop(@yfb int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (i >= 0) {
            return takeLast(iArr, kpd.coerceAtLeast(iArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final List<Integer> dropLast(@yfb int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (i >= 0) {
            return take(iArr, kpd.coerceAtLeast(iArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @t28
    private static final double elementAtOrElse(double[] dArr, int i, qy6<? super Integer, Double> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= dArr.length) ? qy6Var.invoke(Integer.valueOf(i)).doubleValue() : dArr[i];
    }

    @t28
    private static final Double elementAtOrNull(double[] dArr, int i) {
        md8.checkNotNullParameter(dArr, "<this>");
        return getOrNull(dArr, i);
    }

    @yfb
    public static final List<Integer> filter(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (qy6Var.invoke(Integer.valueOf(i)).booleanValue()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Short> filterIndexed(@yfb short[] sArr, @yfb gz6<? super Integer, ? super Short, Boolean> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            short s = sArr[i];
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Short.valueOf(s)).booleanValue()) {
                arrayList.add(Short.valueOf(s));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Integer>> C filterIndexedTo(@yfb int[] iArr, @yfb C c, @yfb gz6<? super Integer, ? super Integer, Boolean> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "predicate");
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            int i4 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Integer.valueOf(i3)).booleanValue()) {
                c.add(Integer.valueOf(i3));
            }
            i++;
            i2 = i4;
        }
        return c;
    }

    @yfb
    public static final List<Integer> filterNot(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (!qy6Var.invoke(Integer.valueOf(i)).booleanValue()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Double>> C filterNotTo(@yfb double[] dArr, @yfb C c, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (double d : dArr) {
            if (!qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                c.add(Double.valueOf(d));
            }
        }
        return c;
    }

    @yfb
    public static final <C extends Collection<? super Double>> C filterTo(@yfb double[] dArr, @yfb C c, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (double d : dArr) {
            if (qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                c.add(Double.valueOf(d));
            }
        }
        return c;
    }

    @t28
    private static final Double find(double[] dArr, qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (double d : dArr) {
            if (qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                return Double.valueOf(d);
            }
        }
        return null;
    }

    @t28
    private static final Short findLast(short[] sArr, qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                short s = sArr[length];
                if (qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                    return Short.valueOf(s);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    public static short first(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @gib
    public static final Double firstOrNull(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(double[] dArr, gz6<? super Integer, ? super Double, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(short[] sArr, C c, gz6<? super Integer, ? super Short, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i2), Short.valueOf(sArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C flatMapTo(@yfb short[] sArr, @yfb C c, @yfb qy6<? super Short, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (short s : sArr) {
            q82.addAll(c, qy6Var.invoke(Short.valueOf(s)));
        }
        return c;
    }

    public static final <R> R fold(@yfb double[] dArr, R r, @yfb gz6<? super R, ? super Double, ? extends R> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (double d : dArr) {
            r = gz6Var.invoke(r, Double.valueOf(d));
        }
        return r;
    }

    public static final <R> R foldIndexed(@yfb double[] dArr, R r, @yfb kz6<? super Integer, ? super R, ? super Double, ? extends R> kz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = kz6Var.invoke(Integer.valueOf(i2), r, Double.valueOf(dArr[i]));
            i++;
            i2++;
        }
        return r;
    }

    public static final <R> R foldRight(@yfb int[] iArr, R r, @yfb gz6<? super Integer, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (int lastIndex = getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r = gz6Var.invoke(Integer.valueOf(iArr[lastIndex]), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@yfb int[] iArr, R r, @yfb kz6<? super Integer, ? super Integer, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        for (int lastIndex = getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r = kz6Var.invoke(Integer.valueOf(lastIndex), Integer.valueOf(iArr[lastIndex]), r);
        }
        return r;
    }

    public static final void forEach(@yfb double[] dArr, @yfb qy6<? super Double, bth> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (double d : dArr) {
            qy6Var.invoke(Double.valueOf(d));
        }
    }

    public static final void forEachIndexed(@yfb double[] dArr, @yfb gz6<? super Integer, ? super Double, bth> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i]));
            i++;
            i2++;
        }
    }

    @yfb
    public static final f78 getIndices(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return new f78(0, getLastIndex(dArr));
    }

    public static final int getLastIndex(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return dArr.length - 1;
    }

    @t28
    private static final double getOrElse(double[] dArr, int i, qy6<? super Integer, Double> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= dArr.length) ? qy6Var.invoke(Integer.valueOf(i)).doubleValue() : dArr[i];
    }

    @gib
    public static final Double getOrNull(@yfb double[] dArr, int i) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (i < 0 || i >= dArr.length) {
            return null;
        }
        return Double.valueOf(dArr[i]);
    }

    public static int indexOf(@yfb short[] sArr, short s) {
        md8.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (qy6Var.invoke(Integer.valueOf(iArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (qy6Var.invoke(Integer.valueOf(iArr[length])).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @yfb
    public static final Set<Integer> intersect(@yfb int[] iArr, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        q82.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    @t28
    private static final boolean isEmpty(double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0;
    }

    @t28
    private static final boolean isNotEmpty(double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return !(dArr.length == 0);
    }

    @yfb
    public static final <A extends Appendable> A joinTo(@yfb byte[] bArr, @yfb A a, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super Byte, ? extends CharSequence> qy6Var) throws IOException {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(a, "buffer");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (qy6Var != null) {
                a.append(qy6Var.invoke(Byte.valueOf(b)));
            } else {
                a.append(String.valueOf((int) b));
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @yfb
    public static final String joinToString(@yfb double[] dArr, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super Double, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        return ((StringBuilder) joinTo(dArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, qy6Var)).toString();
    }

    public static /* synthetic */ String joinToString$default(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            qy6Var = null;
        }
        return joinToString(dArr, charSequence, charSequence5, charSequence6, i3, charSequence7, (qy6<? super Double, ? extends CharSequence>) qy6Var);
    }

    public static short last(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[getLastIndex(sArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int lastIndexOf(@yfb short[] sArr, short s) {
        md8.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (s == sArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @gib
    public static final Double lastOrNull(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    @yfb
    public static final <R> List<R> map(@yfb short[] sArr, @yfb qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(qy6Var.invoke(Short.valueOf(s)));
        }
        return arrayList;
    }

    @yfb
    public static final <R> List<R> mapIndexed(@yfb short[] sArr, @yfb gz6<? super Integer, ? super Short, ? extends R> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(i2), Short.valueOf(sArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@yfb int[] iArr, @yfb C c, @yfb gz6<? super Integer, ? super Integer, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(gz6Var.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapTo(@yfb int[] iArr, @yfb C c, @yfb qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (int i : iArr) {
            c.add(qy6Var.invoke(Integer.valueOf(i)));
        }
        return c;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double maxOf(byte[] bArr, qy6<? super Byte, Double> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length != 0) {
            double dDoubleValue = qy6Var.invoke(Byte.valueOf(bArr[0])).doubleValue();
            int lastIndex = getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Byte.valueOf(bArr[i])).doubleValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m28759maxOfOrNull(byte[] bArr, qy6<? super Byte, Double> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int lastIndex = getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Byte.valueOf(bArr[i])).doubleValue());
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
    private static final <R> R maxOfWith(byte[] bArr, Comparator<? super R> comparator, qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length != 0) {
            R rInvoke = qy6Var.invoke(Byte.valueOf(bArr[0]));
            int lastIndex = getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Byte.valueOf(bArr[i]));
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
        throw new NoSuchElementException();
    }

    @gib
    @jjf(version = "1.4")
    public static final Float maxOrNull(@yfb Float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, fArr[i].floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow")
    public static final float maxOrThrow(@yfb Float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float fFloatValue = fArr[0].floatValue();
            int lastIndex = getLastIndex(fArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, fArr[i].floatValue());
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

    @jjf(version = "1.7")
    @xn8(name = "maxWithOrThrow")
    public static final byte maxWithOrThrow(@yfb byte[] bArr, @yfb Comparator<? super Byte> comparator) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (bArr.length != 0) {
            byte b = bArr[0];
            int lastIndex = getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte b2 = bArr[i];
                    if (comparator.compare(Byte.valueOf(b), Byte.valueOf(b2)) < 0) {
                        b = b2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return b;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double minOf(byte[] bArr, qy6<? super Byte, Double> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length != 0) {
            double dDoubleValue = qy6Var.invoke(Byte.valueOf(bArr[0])).doubleValue();
            int lastIndex = getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Byte.valueOf(bArr[i])).doubleValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m28795minOfOrNull(byte[] bArr, qy6<? super Byte, Double> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int lastIndex = getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Byte.valueOf(bArr[i])).doubleValue());
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
    private static final <R> R minOfWith(byte[] bArr, Comparator<? super R> comparator, qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length != 0) {
            R rInvoke = qy6Var.invoke(Byte.valueOf(bArr[0]));
            int lastIndex = getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Byte.valueOf(bArr[i]));
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
        throw new NoSuchElementException();
    }

    @gib
    @jjf(version = "1.4")
    public static final Float minOrNull(@yfb Float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, fArr[i].floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow")
    public static final float minOrThrow(@yfb Float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float fFloatValue = fArr[0].floatValue();
            int lastIndex = getLastIndex(fArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, fArr[i].floatValue());
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

    @jjf(version = "1.7")
    @xn8(name = "minWithOrThrow")
    public static final byte minWithOrThrow(@yfb byte[] bArr, @yfb Comparator<? super Byte> comparator) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (bArr.length != 0) {
            byte b = bArr[0];
            int lastIndex = getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte b2 = bArr[i];
                    if (comparator.compare(Byte.valueOf(b), Byte.valueOf(b2)) > 0) {
                        b = b2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return b;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0;
    }

    @jjf(version = "1.4")
    @t28
    private static final double[] onEach(double[] dArr, qy6<? super Double, bth> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (double d : dArr) {
            qy6Var.invoke(Double.valueOf(d));
        }
        return dArr;
    }

    @jjf(version = "1.4")
    @t28
    private static final double[] onEachIndexed(double[] dArr, gz6<? super Integer, ? super Double, bth> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i]));
            i++;
            i2++;
        }
        return dArr;
    }

    @jjf(version = "1.3")
    @t28
    private static final double random(double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return random(dArr, tod.f85517a);
    }

    @jjf(version = "1.4")
    @t28
    private static final Double randomOrNull(double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return randomOrNull(dArr, tod.f85517a);
    }

    @yfb
    public static final List<Short> reversed(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return l82.emptyList();
        }
        List<Short> mutableList = toMutableList(sArr);
        s82.reverse(mutableList);
        return mutableList;
    }

    @jjf(version = "1.4")
    @t28
    private static final List<Byte> runningReduce(byte[] bArr, gz6<? super Byte, ? super Byte, Byte> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (bArr.length == 0) {
            return l82.emptyList();
        }
        byte bByteValue = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(bByteValue));
        int length = bArr.length;
        for (int i = 1; i < length; i++) {
            bByteValue = gz6Var.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[i])).byteValue();
            arrayList.add(Byte.valueOf(bByteValue));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final List<Byte> runningReduceIndexed(byte[] bArr, kz6<? super Integer, ? super Byte, ? super Byte, Byte> kz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (bArr.length == 0) {
            return l82.emptyList();
        }
        byte bByteValue = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(bByteValue));
        int length = bArr.length;
        for (int i = 1; i < length; i++) {
            bByteValue = kz6Var.invoke(Integer.valueOf(i), Byte.valueOf(bByteValue), Byte.valueOf(bArr[i])).byteValue();
            arrayList.add(Byte.valueOf(bByteValue));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> scan(boolean[] zArr, R r, gz6<? super R, ? super Boolean, ? extends R> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (zArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r);
        for (boolean z : zArr) {
            r = gz6Var.invoke(r, Boolean.valueOf(z));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> scanIndexed(boolean[] zArr, R r, kz6<? super Integer, ? super R, ? super Boolean, ? extends R> kz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (zArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r);
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Boolean.valueOf(zArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    public static final void shuffle(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        shuffle(dArr, tod.f85517a);
    }

    @gib
    public static final Double singleOrNull(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    @yfb
    public static final List<Integer> slice(@yfb int[] iArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? l82.emptyList() : u70.asList(u70.copyOfRange(iArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1));
    }

    @yfb
    public static short[] sliceArray(@yfb short[] sArr, @yfb Collection<Integer> collection) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(collection, "indices");
        short[] sArr2 = new short[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            sArr2[i] = sArr[it.next().intValue()];
            i++;
        }
        return sArr2;
    }

    @yfb
    public static final List<Double> sorted(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        Double[] typedArray = u70.toTypedArray(dArr);
        u70.sort((Object[]) typedArray);
        return u70.asList(typedArray);
    }

    @yfb
    public static final int[] sortedArray(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        u70.sort(iArrCopyOf);
        return iArrCopyOf;
    }

    @yfb
    public static final int[] sortedArrayDescending(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        sortDescending(iArrCopyOf);
        return iArrCopyOf;
    }

    @yfb
    public static final <R extends Comparable<? super R>> List<Double> sortedBy(@yfb double[] dArr, @yfb qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(dArr, new md2.C9296a(qy6Var));
    }

    @yfb
    public static final <R extends Comparable<? super R>> List<Double> sortedByDescending(@yfb double[] dArr, @yfb qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(dArr, new md2.C9298c(qy6Var));
    }

    @yfb
    public static final List<Double> sortedDescending(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        md8.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        u70.sort(dArrCopyOf);
        return reversed(dArrCopyOf);
    }

    @yfb
    public static final List<Double> sortedWith(@yfb double[] dArr, @yfb Comparator<? super Double> comparator) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Double[] typedArray = u70.toTypedArray(dArr);
        u70.sortWith(typedArray, comparator);
        return u70.asList(typedArray);
    }

    @yfb
    public static final Set<Integer> subtract(@yfb int[] iArr, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        q82.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final int sumBy(@yfb int[] iArr, @yfb qy6<? super Integer, Integer> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (int i : iArr) {
            iIntValue += qy6Var.invoke(Integer.valueOf(i)).intValue();
        }
        return iIntValue;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final double sumByDouble(@yfb int[] iArr, @yfb qy6<? super Integer, Double> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (int i : iArr) {
            dDoubleValue += qy6Var.invoke(Integer.valueOf(i)).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfDouble")
    private static final double sumOfDouble(int[] iArr, qy6<? super Integer, Double> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (int i : iArr) {
            dDoubleValue += qy6Var.invoke(Integer.valueOf(i)).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfInt")
    private static final int sumOfInt(int[] iArr, qy6<? super Integer, Integer> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (int i : iArr) {
            iIntValue += qy6Var.invoke(Integer.valueOf(i)).intValue();
        }
        return iIntValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfLong")
    private static final long sumOfLong(int[] iArr, qy6<? super Integer, Long> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jLongValue = 0;
        for (int i : iArr) {
            jLongValue += qy6Var.invoke(Integer.valueOf(i)).longValue();
        }
        return jLongValue;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfUInt")
    @ihi(markerClass = {yh5.class})
    private static final int sumOfUInt(short[] sArr, qy6<? super Short, woh> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        for (short s : sArr) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(Short.valueOf(s)).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfULong")
    @ihi(markerClass = {yh5.class})
    private static final long sumOfULong(short[] sArr, qy6<? super Short, oph> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jM31533constructorimpl = oph.m31533constructorimpl(0L);
        for (short s : sArr) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + qy6Var.invoke(Short.valueOf(s)).m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @yfb
    public static final <C extends Collection<? super Integer>> C toCollection(@yfb int[] iArr, @yfb C c) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        for (int i : iArr) {
            c.add(Integer.valueOf(i));
        }
        return c;
    }

    @yfb
    public static final HashSet<Double> toHashSet(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return (HashSet) toCollection(dArr, new HashSet(wt9.mapCapacity(dArr.length)));
    }

    @yfb
    public static final Set<Double> toMutableSet(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return (Set) toCollection(dArr, new LinkedHashSet(wt9.mapCapacity(dArr.length)));
    }

    @yfb
    public static final Set<Integer> union(@yfb int[] iArr, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        q82.addAll(mutableSet, iterable);
        return mutableSet;
    }

    @yfb
    public static final Iterable<q08<Double>> withIndex(@yfb final double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return new r08(new ny6() { // from class: d80
            @Override // p000.ny6
            public final Object invoke() {
                return m60.iterator(dArr);
            }
        });
    }

    @yfb
    public static final <R, V> List<V> zip(@yfb short[] sArr, @yfb R[] rArr, @yfb gz6<? super Short, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(sArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Short.valueOf(sArr[i]), rArr[i]));
        }
        return arrayList;
    }

    public static final boolean all(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (boolean z : zArr) {
            if (!qy6Var.invoke(Boolean.valueOf(z)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return !(zArr.length == 0);
    }

    @jjf(version = "1.4")
    @t28
    private static final <V> Map<Integer, V> associateWith(int[] iArr, qy6<? super Integer, ? extends V> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(iArr.length), 16));
        for (int i : iArr) {
            linkedHashMap.put(Integer.valueOf(i), qy6Var.invoke(Integer.valueOf(i)));
        }
        return linkedHashMap;
    }

    @t28
    private static final boolean component1(boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return zArr[0];
    }

    @t28
    private static final boolean component2(boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return zArr[1];
    }

    @t28
    private static final boolean component3(boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return zArr[2];
    }

    @t28
    private static final boolean component4(boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return zArr[3];
    }

    @t28
    private static final boolean component5(boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return zArr[4];
    }

    @t64(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @q64(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @i2e(expression = "any { it == element }", imports = {}))
    public static final /* synthetic */ boolean contains(float[] fArr, float f) {
        md8.checkNotNullParameter(fArr, "<this>");
        for (float f2 : fArr) {
            if (f2 == f) {
                return true;
            }
        }
        return false;
    }

    @t28
    private static final int count(boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @yfb
    public static final List<Boolean> distinct(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return v82.toList(toMutableSet(zArr));
    }

    @t28
    private static final boolean elementAtOrElse(boolean[] zArr, int i, qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= zArr.length) ? qy6Var.invoke(Integer.valueOf(i)).booleanValue() : zArr[i];
    }

    @t28
    private static final Boolean elementAtOrNull(boolean[] zArr, int i) {
        md8.checkNotNullParameter(zArr, "<this>");
        return getOrNull(zArr, i);
    }

    @yfb
    public static final <C extends Collection<? super Boolean>> C filterNotTo(@yfb boolean[] zArr, @yfb C c, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (boolean z : zArr) {
            if (!qy6Var.invoke(Boolean.valueOf(z)).booleanValue()) {
                c.add(Boolean.valueOf(z));
            }
        }
        return c;
    }

    @yfb
    public static final <C extends Collection<? super Boolean>> C filterTo(@yfb boolean[] zArr, @yfb C c, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (boolean z : zArr) {
            if (qy6Var.invoke(Boolean.valueOf(z)).booleanValue()) {
                c.add(Boolean.valueOf(z));
            }
        }
        return c;
    }

    @t28
    private static final Boolean find(boolean[] zArr, qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (boolean z : zArr) {
            if (qy6Var.invoke(Boolean.valueOf(z)).booleanValue()) {
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    @gib
    public static final Boolean firstOrNull(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(boolean[] zArr, gz6<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i2), Boolean.valueOf(zArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    public static final <R> R fold(@yfb boolean[] zArr, R r, @yfb gz6<? super R, ? super Boolean, ? extends R> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (boolean z : zArr) {
            r = gz6Var.invoke(r, Boolean.valueOf(z));
        }
        return r;
    }

    public static final <R> R foldIndexed(@yfb boolean[] zArr, R r, @yfb kz6<? super Integer, ? super R, ? super Boolean, ? extends R> kz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = kz6Var.invoke(Integer.valueOf(i2), r, Boolean.valueOf(zArr[i]));
            i++;
            i2++;
        }
        return r;
    }

    public static final void forEach(@yfb boolean[] zArr, @yfb qy6<? super Boolean, bth> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (boolean z : zArr) {
            qy6Var.invoke(Boolean.valueOf(z));
        }
    }

    public static final void forEachIndexed(@yfb boolean[] zArr, @yfb gz6<? super Integer, ? super Boolean, bth> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), Boolean.valueOf(zArr[i]));
            i++;
            i2++;
        }
    }

    @yfb
    public static final f78 getIndices(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return new f78(0, getLastIndex(zArr));
    }

    public static final int getLastIndex(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return zArr.length - 1;
    }

    @t28
    private static final boolean getOrElse(boolean[] zArr, int i, qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= zArr.length) ? qy6Var.invoke(Integer.valueOf(i)).booleanValue() : zArr[i];
    }

    @gib
    public static final Boolean getOrNull(@yfb boolean[] zArr, int i) {
        md8.checkNotNullParameter(zArr, "<this>");
        if (i < 0 || i >= zArr.length) {
            return null;
        }
        return Boolean.valueOf(zArr[i]);
    }

    @yfb
    public static final <K, M extends Map<? super K, List<Byte>>> M groupByTo(@yfb byte[] bArr, @yfb M m, @yfb qy6<? super Byte, ? extends K> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (byte b : bArr) {
            K kInvoke = qy6Var.invoke(Byte.valueOf(b));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Byte.valueOf(b));
        }
        return m;
    }

    @t28
    private static final boolean isEmpty(boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0;
    }

    @t28
    private static final boolean isNotEmpty(boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return !(zArr.length == 0);
    }

    @yfb
    public static final String joinToString(@yfb boolean[] zArr, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super Boolean, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        return ((StringBuilder) joinTo(zArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, qy6Var)).toString();
    }

    public static /* synthetic */ String joinToString$default(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            qy6Var = null;
        }
        return joinToString(zArr, charSequence, charSequence5, charSequence6, i3, charSequence7, (qy6<? super Boolean, ? extends CharSequence>) qy6Var);
    }

    @gib
    public static final Boolean lastOrNull(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Byte maxByOrNull(@yfb byte[] bArr, @yfb qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b);
        }
        R rInvoke = qy6Var.invoke(Byte.valueOf(b));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b2 = bArr[i];
                R rInvoke2 = qy6Var.invoke(Byte.valueOf(b2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    b = b2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Byte.valueOf(b);
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Byte minByOrNull(@yfb byte[] bArr, @yfb qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b);
        }
        R rInvoke = qy6Var.invoke(Byte.valueOf(b));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b2 = bArr[i];
                R rInvoke2 = qy6Var.invoke(Byte.valueOf(b2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    b = b2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Byte.valueOf(b);
    }

    public static final boolean none(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0;
    }

    @jjf(version = "1.4")
    @t28
    private static final boolean[] onEach(boolean[] zArr, qy6<? super Boolean, bth> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (boolean z : zArr) {
            qy6Var.invoke(Boolean.valueOf(z));
        }
        return zArr;
    }

    @jjf(version = "1.4")
    @t28
    private static final boolean[] onEachIndexed(boolean[] zArr, gz6<? super Integer, ? super Boolean, bth> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), Boolean.valueOf(zArr[i]));
            i++;
            i2++;
        }
        return zArr;
    }

    @yfb
    public static final scc<List<Byte>, List<Byte>> partition(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte b : bArr) {
            if (qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                arrayList.add(Byte.valueOf(b));
            } else {
                arrayList2.add(Byte.valueOf(b));
            }
        }
        return new scc<>(arrayList, arrayList2);
    }

    @jjf(version = "1.3")
    @t28
    private static final boolean random(boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return random(zArr, tod.f85517a);
    }

    @jjf(version = "1.4")
    @t28
    private static final Boolean randomOrNull(boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return randomOrNull(zArr, tod.f85517a);
    }

    @gib
    @jjf(version = "1.4")
    public static final Short reduceRightIndexedOrNull(@yfb short[] sArr, @yfb kz6<? super Integer, ? super Short, ? super Short, Short> kz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short sShortValue = sArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            sShortValue = kz6Var.invoke(Integer.valueOf(i), Short.valueOf(sArr[i]), Short.valueOf(sShortValue)).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Short reduceRightOrNull(@yfb short[] sArr, @yfb gz6<? super Short, ? super Short, Short> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short sShortValue = sArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            sShortValue = gz6Var.invoke(Short.valueOf(sArr[i]), Short.valueOf(sShortValue)).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> scan(char[] cArr, R r, gz6<? super R, ? super Character, ? extends R> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (cArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r);
        for (char c : cArr) {
            r = gz6Var.invoke(r, Character.valueOf(c));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> scanIndexed(char[] cArr, R r, kz6<? super Integer, ? super R, ? super Character, ? extends R> kz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (cArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r);
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Character.valueOf(cArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    public static final void shuffle(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        shuffle(zArr, tod.f85517a);
    }

    @gib
    public static final Boolean singleOrNull(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    public static final void sortDescending(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            u70.sort(iArr);
            reverse(iArr);
        }
    }

    @yfb
    public static final List<Character> sorted(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        Character[] typedArray = u70.toTypedArray(cArr);
        u70.sort((Object[]) typedArray);
        return u70.asList(typedArray);
    }

    @yfb
    public static final <R extends Comparable<? super R>> List<Boolean> sortedBy(@yfb boolean[] zArr, @yfb qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(zArr, new md2.C9296a(qy6Var));
    }

    @yfb
    public static final <R extends Comparable<? super R>> List<Boolean> sortedByDescending(@yfb boolean[] zArr, @yfb qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(zArr, new md2.C9298c(qy6Var));
    }

    @yfb
    public static final List<Character> sortedDescending(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        md8.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        u70.sort(cArrCopyOf);
        return reversed(cArrCopyOf);
    }

    @yfb
    public static final List<Boolean> sortedWith(@yfb boolean[] zArr, @yfb Comparator<? super Boolean> comparator) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Boolean[] typedArray = u70.toTypedArray(zArr);
        u70.sortWith(typedArray, comparator);
        return u70.asList(typedArray);
    }

    @yfb
    public static final List<Byte> take(@yfb byte[] bArr, int i) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        if (i >= bArr.length) {
            return toList(bArr);
        }
        if (i == 1) {
            return k82.listOf(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Byte> takeLast(@yfb byte[] bArr, int i) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        int length = bArr.length;
        if (i >= length) {
            return toList(bArr);
        }
        if (i == 1) {
            return k82.listOf(Byte.valueOf(bArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(Byte.valueOf(bArr[i2]));
        }
        return arrayList;
    }

    @yfb
    public static final HashSet<Boolean> toHashSet(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return (HashSet) toCollection(zArr, new HashSet(wt9.mapCapacity(zArr.length)));
    }

    @yfb
    public static final List<Long> toMutableList(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    @yfb
    public static final Set<Boolean> toMutableSet(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return (Set) toCollection(zArr, new LinkedHashSet(wt9.mapCapacity(zArr.length)));
    }

    @yfb
    public static final Iterable<q08<Boolean>> withIndex(@yfb final boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return new r08(new ny6() { // from class: y70
            @Override // p000.ny6
            public final Object invoke() {
                return m60.iterator(zArr);
            }
        });
    }

    public static final boolean all(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (char c : cArr) {
            if (!qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return !(cArr.length == 0);
    }

    @yfb
    public static Iterable<Long> asIterable(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0 ? l82.emptyList() : new C5173e(jArr);
    }

    @yfb
    public static final vye<Long> asSequence(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0 ? ize.emptySequence() : new C5182n(jArr);
    }

    @yfb
    public static final <K, V> Map<K, V> associate(@yfb short[] sArr, @yfb qy6<? super Short, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(sArr.length), 16));
        for (short s : sArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Short.valueOf(s));
            linkedHashMap.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K> Map<K, Short> associateBy(@yfb short[] sArr, @yfb qy6<? super Short, ? extends K> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(sArr.length), 16));
        for (short s : sArr) {
            linkedHashMap.put(qy6Var.invoke(Short.valueOf(s)), Short.valueOf(s));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K, M extends Map<? super K, ? super Long>> M associateByTo(@yfb long[] jArr, @yfb M m, @yfb qy6<? super Long, ? extends K> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (long j : jArr) {
            m.put(qy6Var.invoke(Long.valueOf(j)), Long.valueOf(j));
        }
        return m;
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@yfb long[] jArr, @yfb M m, @yfb qy6<? super Long, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (long j : jArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Long.valueOf(j));
            m.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return m;
    }

    @jjf(version = "1.4")
    @t28
    private static final <V, M extends Map<? super Long, ? super V>> M associateWithTo(long[] jArr, M m, qy6<? super Long, ? extends V> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        for (long j : jArr) {
            m.put(Long.valueOf(j), qy6Var.invoke(Long.valueOf(j)));
        }
        return m;
    }

    @t28
    private static final char component1(char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return cArr[0];
    }

    @t28
    private static final char component2(char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return cArr[1];
    }

    @t28
    private static final char component3(char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return cArr[2];
    }

    @t28
    private static final char component4(char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return cArr[3];
    }

    @t28
    private static final char component5(char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return cArr[4];
    }

    @t64(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @q64(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @i2e(expression = "any { it == element }", imports = {}))
    public static final /* synthetic */ boolean contains(double[] dArr, double d) {
        md8.checkNotNullParameter(dArr, "<this>");
        for (double d2 : dArr) {
            if (d2 == d) {
                return true;
            }
        }
        return false;
    }

    @t28
    private static final int count(char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @yfb
    public static final List<Character> distinct(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return v82.toList(toMutableSet(cArr));
    }

    @yfb
    public static final List<Long> drop(@yfb long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (i >= 0) {
            return takeLast(jArr, kpd.coerceAtLeast(jArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final List<Long> dropLast(@yfb long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (i >= 0) {
            return take(jArr, kpd.coerceAtLeast(jArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final List<Short> dropLastWhile(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(sArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Short.valueOf(sArr[lastIndex])).booleanValue()) {
                return take(sArr, lastIndex + 1);
            }
        }
        return l82.emptyList();
    }

    @t28
    private static final char elementAtOrElse(char[] cArr, int i, qy6<? super Integer, Character> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= cArr.length) ? qy6Var.invoke(Integer.valueOf(i)).charValue() : cArr[i];
    }

    @t28
    private static final Character elementAtOrNull(char[] cArr, int i) {
        md8.checkNotNullParameter(cArr, "<this>");
        return getOrNull(cArr, i);
    }

    @yfb
    public static final List<Long> filter(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            if (qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Long>> C filterIndexedTo(@yfb long[] jArr, @yfb C c, @yfb gz6<? super Integer, ? super Long, Boolean> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "predicate");
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            long j = jArr[i];
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Long.valueOf(j)).booleanValue()) {
                c.add(Long.valueOf(j));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @yfb
    public static final List<Long> filterNot(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            if (!qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Character>> C filterNotTo(@yfb char[] cArr, @yfb C c, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (char c2 : cArr) {
            if (!qy6Var.invoke(Character.valueOf(c2)).booleanValue()) {
                c.add(Character.valueOf(c2));
            }
        }
        return c;
    }

    @yfb
    public static final <C extends Collection<? super Character>> C filterTo(@yfb char[] cArr, @yfb C c, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (char c2 : cArr) {
            if (qy6Var.invoke(Character.valueOf(c2)).booleanValue()) {
                c.add(Character.valueOf(c2));
            }
        }
        return c;
    }

    @t28
    private static final Character find(char[] cArr, qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (char c : cArr) {
            if (qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                return Character.valueOf(c);
            }
        }
        return null;
    }

    @gib
    public static final Character firstOrNull(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    @yfb
    public static final <R> List<R> flatMap(@yfb short[] sArr, @yfb qy6<? super Short, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        for (short s : sArr) {
            q82.addAll(arrayList, qy6Var.invoke(Short.valueOf(s)));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(char[] cArr, gz6<? super Integer, ? super Character, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(cArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    public static final <R> R fold(@yfb char[] cArr, R r, @yfb gz6<? super R, ? super Character, ? extends R> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (char c : cArr) {
            r = gz6Var.invoke(r, Character.valueOf(c));
        }
        return r;
    }

    public static final <R> R foldIndexed(@yfb char[] cArr, R r, @yfb kz6<? super Integer, ? super R, ? super Character, ? extends R> kz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = kz6Var.invoke(Integer.valueOf(i2), r, Character.valueOf(cArr[i]));
            i++;
            i2++;
        }
        return r;
    }

    public static final <R> R foldRight(@yfb long[] jArr, R r, @yfb gz6<? super Long, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (int lastIndex = getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r = gz6Var.invoke(Long.valueOf(jArr[lastIndex]), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@yfb long[] jArr, R r, @yfb kz6<? super Integer, ? super Long, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        for (int lastIndex = getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r = kz6Var.invoke(Integer.valueOf(lastIndex), Long.valueOf(jArr[lastIndex]), r);
        }
        return r;
    }

    public static final void forEach(@yfb char[] cArr, @yfb qy6<? super Character, bth> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (char c : cArr) {
            qy6Var.invoke(Character.valueOf(c));
        }
    }

    public static final void forEachIndexed(@yfb char[] cArr, @yfb gz6<? super Integer, ? super Character, bth> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(cArr[i]));
            i++;
            i2++;
        }
    }

    @yfb
    public static final f78 getIndices(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return new f78(0, getLastIndex(cArr));
    }

    public static final int getLastIndex(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return cArr.length - 1;
    }

    @t28
    private static final char getOrElse(char[] cArr, int i, qy6<? super Integer, Character> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= cArr.length) ? qy6Var.invoke(Integer.valueOf(i)).charValue() : cArr[i];
    }

    @gib
    public static final Character getOrNull(@yfb char[] cArr, int i) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (i < 0 || i >= cArr.length) {
            return null;
        }
        return Character.valueOf(cArr[i]);
    }

    @yfb
    public static final <K> Map<K, List<Byte>> groupBy(@yfb byte[] bArr, @yfb qy6<? super Byte, ? extends K> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b : bArr) {
            K kInvoke = qy6Var.invoke(Byte.valueOf(b));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Byte.valueOf(b));
        }
        return linkedHashMap;
    }

    public static int indexOf(@yfb int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (qy6Var.invoke(Long.valueOf(jArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (qy6Var.invoke(Long.valueOf(jArr[length])).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @yfb
    public static final Set<Long> intersect(@yfb long[] jArr, @yfb Iterable<Long> iterable) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        q82.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    @t28
    private static final boolean isEmpty(char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0;
    }

    @t28
    private static final boolean isNotEmpty(char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return !(cArr.length == 0);
    }

    @yfb
    public static final String joinToString(@yfb char[] cArr, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super Character, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        return ((StringBuilder) joinTo(cArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, qy6Var)).toString();
    }

    public static /* synthetic */ String joinToString$default(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            qy6Var = null;
        }
        return joinToString(cArr, charSequence, charSequence5, charSequence6, i3, charSequence7, (qy6<? super Character, ? extends CharSequence>) qy6Var);
    }

    public static int lastIndexOf(@yfb int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (i == iArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @gib
    public static final Character lastOrNull(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@yfb long[] jArr, @yfb C c, @yfb gz6<? super Integer, ? super Long, ? extends R> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(gz6Var.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapTo(@yfb long[] jArr, @yfb C c, @yfb qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (long j : jArr) {
            c.add(qy6Var.invoke(Long.valueOf(j)));
        }
        return c;
    }

    @jjf(version = "1.7")
    @xn8(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> byte maxByOrThrow(@yfb byte[] bArr, @yfb qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length != 0) {
            byte b = bArr[0];
            int lastIndex = getLastIndex(bArr);
            if (lastIndex == 0) {
                return b;
            }
            R rInvoke = qy6Var.invoke(Byte.valueOf(b));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte b2 = bArr[i];
                    R rInvoke2 = qy6Var.invoke(Byte.valueOf(b2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        b = b2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return b;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> byte minByOrThrow(@yfb byte[] bArr, @yfb qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length != 0) {
            byte b = bArr[0];
            int lastIndex = getLastIndex(bArr);
            if (lastIndex == 0) {
                return b;
            }
            R rInvoke = qy6Var.invoke(Byte.valueOf(b));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte b2 = bArr[i];
                    R rInvoke2 = qy6Var.invoke(Byte.valueOf(b2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        b = b2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return b;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0;
    }

    @jjf(version = "1.4")
    @t28
    private static final char[] onEach(char[] cArr, qy6<? super Character, bth> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (char c : cArr) {
            qy6Var.invoke(Character.valueOf(c));
        }
        return cArr;
    }

    @jjf(version = "1.4")
    @t28
    private static final char[] onEachIndexed(char[] cArr, gz6<? super Integer, ? super Character, bth> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(cArr[i]));
            i++;
            i2++;
        }
        return cArr;
    }

    @jjf(version = "1.3")
    @t28
    private static final char random(char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return random(cArr, (tod) tod.f85517a);
    }

    @jjf(version = "1.4")
    @t28
    private static final Character randomOrNull(char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return randomOrNull(cArr, (tod) tod.f85517a);
    }

    public static final short reduceRight(@yfb short[] sArr, @yfb gz6<? super Short, ? super Short, Short> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex >= 0) {
            short sShortValue = sArr[lastIndex];
            for (int i = lastIndex - 1; i >= 0; i--) {
                sShortValue = gz6Var.invoke(Short.valueOf(sArr[i]), Short.valueOf(sShortValue)).shortValue();
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final short reduceRightIndexed(@yfb short[] sArr, @yfb kz6<? super Integer, ? super Short, ? super Short, Short> kz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex >= 0) {
            short sShortValue = sArr[lastIndex];
            for (int i = lastIndex - 1; i >= 0; i--) {
                sShortValue = kz6Var.invoke(Integer.valueOf(i), Short.valueOf(sArr[i]), Short.valueOf(sShortValue)).shortValue();
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @yfb
    public static short[] reversedArray(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                sArr2[lastIndex - i] = sArr[i];
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return sArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.4")
    @yfb
    public static final <T, R> List<R> scan(@yfb T[] tArr, R r, @yfb gz6<? super R, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (tArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r);
        for (InterfaceC0000a interfaceC0000a : tArr) {
            r = gz6Var.invoke(r, interfaceC0000a);
            arrayList.add(r);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.4")
    @yfb
    public static final <T, R> List<R> scanIndexed(@yfb T[] tArr, R r, @yfb kz6<? super Integer, ? super R, ? super T, ? extends R> kz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (tArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r);
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, tArr[i]);
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    public static final void shuffle(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        shuffle(cArr, (tod) tod.f85517a);
    }

    public static short single(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return sArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @gib
    public static final Character singleOrNull(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    @yfb
    public static final List<Long> slice(@yfb long[] jArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? l82.emptyList() : u70.asList(u70.copyOfRange(jArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1));
    }

    @yfb
    public static final long[] sortedArray(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        u70.sort(jArrCopyOf);
        return jArrCopyOf;
    }

    @yfb
    public static final long[] sortedArrayDescending(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        sortDescending(jArrCopyOf);
        return jArrCopyOf;
    }

    @yfb
    public static final <R extends Comparable<? super R>> List<Character> sortedBy(@yfb char[] cArr, @yfb qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(cArr, (Comparator<? super Character>) new md2.C9296a(qy6Var));
    }

    @yfb
    public static final <R extends Comparable<? super R>> List<Character> sortedByDescending(@yfb char[] cArr, @yfb qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(cArr, (Comparator<? super Character>) new md2.C9298c(qy6Var));
    }

    @yfb
    public static final List<Character> sortedWith(@yfb char[] cArr, @yfb Comparator<? super Character> comparator) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Character[] typedArray = u70.toTypedArray(cArr);
        u70.sortWith(typedArray, comparator);
        return u70.asList(typedArray);
    }

    @yfb
    public static final Set<Long> subtract(@yfb long[] jArr, @yfb Iterable<Long> iterable) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        q82.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final int sumBy(@yfb long[] jArr, @yfb qy6<? super Long, Integer> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (long j : jArr) {
            iIntValue += qy6Var.invoke(Long.valueOf(j)).intValue();
        }
        return iIntValue;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final double sumByDouble(@yfb long[] jArr, @yfb qy6<? super Long, Double> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (long j : jArr) {
            dDoubleValue += qy6Var.invoke(Long.valueOf(j)).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfDouble")
    private static final double sumOfDouble(long[] jArr, qy6<? super Long, Double> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (long j : jArr) {
            dDoubleValue += qy6Var.invoke(Long.valueOf(j)).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfInt")
    private static final int sumOfInt(long[] jArr, qy6<? super Long, Integer> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (long j : jArr) {
            iIntValue += qy6Var.invoke(Long.valueOf(j)).intValue();
        }
        return iIntValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfLong")
    private static final long sumOfLong(long[] jArr, qy6<? super Long, Long> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jLongValue = 0;
        for (long j : jArr) {
            jLongValue += qy6Var.invoke(Long.valueOf(j)).longValue();
        }
        return jLongValue;
    }

    @yfb
    public static final List<Short> takeLastWhile(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(sArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Short.valueOf(sArr[lastIndex])).booleanValue()) {
                return drop(sArr, lastIndex + 1);
            }
        }
        return toList(sArr);
    }

    @yfb
    public static final List<Short> takeWhile(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s : sArr) {
            if (!qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Long>> C toCollection(@yfb long[] jArr, @yfb C c) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        for (long j : jArr) {
            c.add(Long.valueOf(j));
        }
        return c;
    }

    @yfb
    public static final HashSet<Character> toHashSet(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return (HashSet) toCollection(cArr, new HashSet(wt9.mapCapacity(kpd.coerceAtMost(cArr.length, 128))));
    }

    @yfb
    public static List<Short> toList(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return l82.emptyList();
        }
        if (length != 1) {
            return toMutableList(sArr);
        }
        return k82.listOf(Short.valueOf(sArr[0]));
    }

    @yfb
    public static final Set<Character> toMutableSet(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return (Set) toCollection(cArr, new LinkedHashSet(wt9.mapCapacity(kpd.coerceAtMost(cArr.length, 128))));
    }

    @yfb
    public static final Set<Short> toSet(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return w6f.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(sArr, new LinkedHashSet(wt9.mapCapacity(sArr.length)));
        }
        return v6f.setOf(Short.valueOf(sArr[0]));
    }

    @yfb
    public static final Set<Long> union(@yfb long[] jArr, @yfb Iterable<Long> iterable) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        q82.addAll(mutableSet, iterable);
        return mutableSet;
    }

    @yfb
    public static final Iterable<q08<Character>> withIndex(@yfb final char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return new r08(new ny6() { // from class: v70
            @Override // p000.ny6
            public final Object invoke() {
                return m60.iterator(cArr);
            }
        });
    }

    public static final <T> boolean any(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : tArr) {
            if (qy6Var.invoke(t).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @jjf(version = "1.4")
    @t28
    private static final <V> Map<Long, V> associateWith(long[] jArr, qy6<? super Long, ? extends V> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(jArr.length), 16));
        for (long j : jArr) {
            linkedHashMap.put(Long.valueOf(j), qy6Var.invoke(Long.valueOf(j)));
        }
        return linkedHashMap;
    }

    public static final <T> int count(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int i = 0;
        for (T t : tArr) {
            if (qy6Var.invoke(t).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @yfb
    public static final List<Integer> filterIndexed(@yfb int[] iArr, @yfb gz6<? super Integer, ? super Integer, Boolean> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            int i4 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Integer.valueOf(i3)).booleanValue()) {
                arrayList.add(Integer.valueOf(i3));
            }
            i++;
            i2 = i4;
        }
        return arrayList;
    }

    @t28
    private static final Integer findLast(int[] iArr, qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                int i2 = iArr[length];
                if (qy6Var.invoke(Integer.valueOf(i2)).booleanValue()) {
                    return Integer.valueOf(i2);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    public static int first(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @gib
    public static final <T> T firstOrNull(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : tArr) {
            if (qy6Var.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(int[] iArr, C c, gz6<? super Integer, ? super Integer, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C flatMapTo(@yfb int[] iArr, @yfb C c, @yfb qy6<? super Integer, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (int i : iArr) {
            q82.addAll(c, qy6Var.invoke(Integer.valueOf(i)));
        }
        return c;
    }

    public static int last(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[getLastIndex(iArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @gib
    public static final <T> T lastOrNull(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            T t = tArr[length];
            if (qy6Var.invoke(t).booleanValue()) {
                return t;
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @yfb
    public static final <R> List<R> map(@yfb int[] iArr, @yfb qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(qy6Var.invoke(Integer.valueOf(i)));
        }
        return arrayList;
    }

    @yfb
    public static final <R> List<R> mapIndexed(@yfb int[] iArr, @yfb gz6<? super Integer, ? super Integer, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    public static final <T> boolean none(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : tArr) {
            if (qy6Var.invoke(t).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @jjf(version = "1.3")
    public static final <T> T random(@yfb T[] tArr, @yfb tod todVar) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (tArr.length != 0) {
            return tArr[todVar.nextInt(tArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @gib
    @jjf(version = "1.4")
    public static final <T> T randomOrNull(@yfb T[] tArr, @yfb tod todVar) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[todVar.nextInt(tArr.length)];
    }

    @gib
    @jjf(version = "1.4")
    public static final Short reduceIndexedOrNull(@yfb short[] sArr, @yfb kz6<? super Integer, ? super Short, ? super Short, Short> kz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short sShortValue = sArr[0];
        int lastIndex = getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                sShortValue = kz6Var.invoke(Integer.valueOf(i), Short.valueOf(sShortValue), Short.valueOf(sArr[i])).shortValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Short.valueOf(sShortValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Short reduceOrNull(@yfb short[] sArr, @yfb gz6<? super Short, ? super Short, Short> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short sShortValue = sArr[0];
        int lastIndex = getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                sShortValue = gz6Var.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[i])).shortValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Short.valueOf(sShortValue);
    }

    @yfb
    public static final List<Integer> reversed(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return l82.emptyList();
        }
        List<Integer> mutableList = toMutableList(iArr);
        s82.reverse(mutableList);
        return mutableList;
    }

    @jjf(version = "1.4")
    public static final <T> void shuffle(@yfb T[] tArr, @yfb tod todVar) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        for (int lastIndex = getLastIndex(tArr); lastIndex > 0; lastIndex--) {
            int iNextInt = todVar.nextInt(lastIndex + 1);
            T t = tArr[lastIndex];
            tArr[lastIndex] = tArr[iNextInt];
            tArr[iNextInt] = t;
        }
    }

    @gib
    public static final <T> T singleOrNull(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : tArr) {
            if (qy6Var.invoke(t2).booleanValue()) {
                if (z) {
                    return null;
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        return null;
    }

    @yfb
    public static int[] sliceArray(@yfb int[] iArr, @yfb Collection<Integer> collection) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(collection, "indices");
        int[] iArr2 = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr2[i] = iArr[it.next().intValue()];
            i++;
        }
        return iArr2;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfUInt")
    @ihi(markerClass = {yh5.class})
    private static final int sumOfUInt(int[] iArr, qy6<? super Integer, woh> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        for (int i : iArr) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(Integer.valueOf(i)).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfULong")
    @ihi(markerClass = {yh5.class})
    private static final long sumOfULong(int[] iArr, qy6<? super Integer, oph> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jM31533constructorimpl = oph.m31533constructorimpl(0L);
        for (int i : iArr) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + qy6Var.invoke(Integer.valueOf(i)).m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @yfb
    public static final List<Float> toMutableList(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @yfb
    public static final <R, V> List<V> zip(@yfb int[] iArr, @yfb R[] rArr, @yfb gz6<? super Integer, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(iArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(iArr[i]), rArr[i]));
        }
        return arrayList;
    }

    public static final boolean any(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (byte b : bArr) {
            if (qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @yfb
    public static Iterable<Float> asIterable(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0 ? l82.emptyList() : new C5174f(fArr);
    }

    @yfb
    public static final vye<Float> asSequence(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0 ? ize.emptySequence() : new C5183o(fArr);
    }

    @yfb
    public static final <K, M extends Map<? super K, ? super Float>> M associateByTo(@yfb float[] fArr, @yfb M m, @yfb qy6<? super Float, ? extends K> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (float f : fArr) {
            m.put(qy6Var.invoke(Float.valueOf(f)), Float.valueOf(f));
        }
        return m;
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@yfb float[] fArr, @yfb M m, @yfb qy6<? super Float, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (float f : fArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Float.valueOf(f));
            m.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return m;
    }

    @jjf(version = "1.4")
    @t28
    private static final <V, M extends Map<? super Float, ? super V>> M associateWithTo(float[] fArr, M m, qy6<? super Float, ? extends V> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        for (float f : fArr) {
            m.put(Float.valueOf(f), qy6Var.invoke(Float.valueOf(f)));
        }
        return m;
    }

    public static final int count(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int i = 0;
        for (byte b : bArr) {
            if (qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @yfb
    public static final List<Float> drop(@yfb float[] fArr, int i) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (i >= 0) {
            return takeLast(fArr, kpd.coerceAtLeast(fArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final List<Float> dropLast(@yfb float[] fArr, int i) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (i >= 0) {
            return take(fArr, kpd.coerceAtLeast(fArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final List<Short> dropWhile(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (short s : sArr) {
            if (z) {
                arrayList.add(Short.valueOf(s));
            } else if (!qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                arrayList.add(Short.valueOf(s));
                z = true;
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Float> filter(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f : fArr) {
            if (qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                arrayList.add(Float.valueOf(f));
            }
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Float>> C filterIndexedTo(@yfb float[] fArr, @yfb C c, @yfb gz6<? super Integer, ? super Float, Boolean> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "predicate");
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f = fArr[i];
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Float.valueOf(f)).booleanValue()) {
                c.add(Float.valueOf(f));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @yfb
    public static final List<Float> filterNot(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f : fArr) {
            if (!qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                arrayList.add(Float.valueOf(f));
            }
        }
        return arrayList;
    }

    @gib
    public static final Byte firstOrNull(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (byte b : bArr) {
            if (qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                return Byte.valueOf(b);
            }
        }
        return null;
    }

    public static final <R> R foldRight(@yfb float[] fArr, R r, @yfb gz6<? super Float, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (int lastIndex = getLastIndex(fArr); lastIndex >= 0; lastIndex--) {
            r = gz6Var.invoke(Float.valueOf(fArr[lastIndex]), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@yfb float[] fArr, R r, @yfb kz6<? super Integer, ? super Float, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        for (int lastIndex = getLastIndex(fArr); lastIndex >= 0; lastIndex--) {
            r = kz6Var.invoke(Integer.valueOf(lastIndex), Float.valueOf(fArr[lastIndex]), r);
        }
        return r;
    }

    public static int indexOf(@yfb long[] jArr, long j) {
        md8.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (qy6Var.invoke(Float.valueOf(fArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (qy6Var.invoke(Float.valueOf(fArr[length])).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @yfb
    public static final Set<Float> intersect(@yfb float[] fArr, @yfb Iterable<Float> iterable) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        q82.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    public static int lastIndexOf(@yfb long[] jArr, long j) {
        md8.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (j == jArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@yfb float[] fArr, @yfb C c, @yfb gz6<? super Integer, ? super Float, ? extends R> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(gz6Var.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapTo(@yfb float[] fArr, @yfb C c, @yfb qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (float f : fArr) {
            c.add(qy6Var.invoke(Float.valueOf(f)));
        }
        return c;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R maxOfWithOrNull(short[] sArr, Comparator<? super R> comparator, qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Short.valueOf(sArr[i]));
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
    private static final <R> R minOfWithOrNull(short[] sArr, Comparator<? super R> comparator, qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Short.valueOf(sArr[i]));
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

    public static final boolean none(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (byte b : bArr) {
            if (qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final short reduce(@yfb short[] sArr, @yfb gz6<? super Short, ? super Short, Short> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (sArr.length != 0) {
            short sShortValue = sArr[0];
            int lastIndex = getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    sShortValue = gz6Var.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[i])).shortValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final short reduceIndexed(@yfb short[] sArr, @yfb kz6<? super Integer, ? super Short, ? super Short, Short> kz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (sArr.length != 0) {
            short sShortValue = sArr[0];
            int lastIndex = getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    sShortValue = kz6Var.invoke(Integer.valueOf(i), Short.valueOf(sShortValue), Short.valueOf(sArr[i])).shortValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static void reverse(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        int length = (sArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(sArr);
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            short s = sArr[i];
            sArr[i] = sArr[lastIndex];
            sArr[lastIndex] = s;
            lastIndex--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> runningFold(short[] sArr, R r, gz6<? super R, ? super Short, ? extends R> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (sArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r);
        for (short s : sArr) {
            r = gz6Var.invoke(r, Short.valueOf(s));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> runningFoldIndexed(short[] sArr, R r, kz6<? super Integer, ? super R, ? super Short, ? extends R> kz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (sArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r);
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Short.valueOf(sArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @yfb
    public static final List<Float> slice(@yfb float[] fArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? l82.emptyList() : u70.asList(u70.copyOfRange(fArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (jArr.length > 1) {
            u70.sort(jArr);
            reverse(jArr);
        }
    }

    @yfb
    public static final float[] sortedArray(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        md8.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        u70.sort(fArrCopyOf);
        return fArrCopyOf;
    }

    @yfb
    public static final float[] sortedArrayDescending(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        md8.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        sortDescending(fArrCopyOf);
        return fArrCopyOf;
    }

    @yfb
    public static final Set<Float> subtract(@yfb float[] fArr, @yfb Iterable<Float> iterable) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        q82.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final int sumBy(@yfb float[] fArr, @yfb qy6<? super Float, Integer> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (float f : fArr) {
            iIntValue += qy6Var.invoke(Float.valueOf(f)).intValue();
        }
        return iIntValue;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final double sumByDouble(@yfb float[] fArr, @yfb qy6<? super Float, Double> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (float f : fArr) {
            dDoubleValue += qy6Var.invoke(Float.valueOf(f)).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfDouble")
    private static final double sumOfDouble(float[] fArr, qy6<? super Float, Double> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (float f : fArr) {
            dDoubleValue += qy6Var.invoke(Float.valueOf(f)).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfInt")
    private static final int sumOfInt(float[] fArr, qy6<? super Float, Integer> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (float f : fArr) {
            iIntValue += qy6Var.invoke(Float.valueOf(f)).intValue();
        }
        return iIntValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfLong")
    private static final long sumOfLong(float[] fArr, qy6<? super Float, Long> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jLongValue = 0;
        for (float f : fArr) {
            jLongValue += qy6Var.invoke(Float.valueOf(f)).longValue();
        }
        return jLongValue;
    }

    @yfb
    public static final <C extends Collection<? super Float>> C toCollection(@yfb float[] fArr, @yfb C c) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        for (float f : fArr) {
            c.add(Float.valueOf(f));
        }
        return c;
    }

    @yfb
    public static final Set<Float> union(@yfb float[] fArr, @yfb Iterable<Float> iterable) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        q82.addAll(mutableSet, iterable);
        return mutableSet;
    }

    public static final boolean any(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (short s : sArr) {
            if (qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @jjf(version = "1.4")
    @t28
    private static final <V> Map<Float, V> associateWith(float[] fArr, qy6<? super Float, ? extends V> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(fArr.length), 16));
        for (float f : fArr) {
            linkedHashMap.put(Float.valueOf(f), qy6Var.invoke(Float.valueOf(f)));
        }
        return linkedHashMap;
    }

    public static final int count(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int i = 0;
        for (short s : sArr) {
            if (qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @gib
    public static final Short firstOrNull(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (short s : sArr) {
            if (qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                return Short.valueOf(s);
            }
        }
        return null;
    }

    @gib
    @jjf(version = "1.4")
    public static final Short maxWithOrNull(@yfb short[] sArr, @yfb Comparator<? super Short> comparator) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s2 = sArr[i];
                if (comparator.compare(Short.valueOf(s), Short.valueOf(s2)) < 0) {
                    s = s2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Short.valueOf(s);
    }

    @gib
    @jjf(version = "1.4")
    public static final Short minWithOrNull(@yfb short[] sArr, @yfb Comparator<? super Short> comparator) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s2 = sArr[i];
                if (comparator.compare(Short.valueOf(s), Short.valueOf(s2)) > 0) {
                    s = s2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Short.valueOf(s);
    }

    public static final boolean none(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (short s : sArr) {
            if (qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @gib
    @jjf(version = "1.4")
    public static final Byte randomOrNull(@yfb byte[] bArr, @yfb tod todVar) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[todVar.nextInt(bArr.length)]);
    }

    @gib
    @jjf(version = "1.4")
    public static final Integer reduceRightIndexedOrNull(@yfb int[] iArr, @yfb kz6<? super Integer, ? super Integer, ? super Integer, Integer> kz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int iIntValue = iArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            iIntValue = kz6Var.invoke(Integer.valueOf(i), Integer.valueOf(iArr[i]), Integer.valueOf(iIntValue)).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Integer reduceRightOrNull(@yfb int[] iArr, @yfb gz6<? super Integer, ? super Integer, Integer> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int iIntValue = iArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            iIntValue = gz6Var.invoke(Integer.valueOf(iArr[i]), Integer.valueOf(iIntValue)).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @gib
    public static final Byte singleOrNull(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Byte bValueOf = null;
        boolean z = false;
        for (byte b : bArr) {
            if (qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                if (z) {
                    return null;
                }
                bValueOf = Byte.valueOf(b);
                z = true;
            }
        }
        if (z) {
            return bValueOf;
        }
        return null;
    }

    @yfb
    public static final List<Double> toMutableList(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static final boolean any(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int i : iArr) {
            if (qy6Var.invoke(Integer.valueOf(i)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @yfb
    public static Iterable<Double> asIterable(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0 ? l82.emptyList() : new C5175g(dArr);
    }

    @yfb
    public static final vye<Double> asSequence(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0 ? ize.emptySequence() : new C5184p(dArr);
    }

    @yfb
    public static final <K, V> Map<K, V> associate(@yfb int[] iArr, @yfb qy6<? super Integer, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(iArr.length), 16));
        for (int i : iArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Integer.valueOf(i));
            linkedHashMap.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K> Map<K, Integer> associateBy(@yfb int[] iArr, @yfb qy6<? super Integer, ? extends K> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(iArr.length), 16));
        for (int i : iArr) {
            linkedHashMap.put(qy6Var.invoke(Integer.valueOf(i)), Integer.valueOf(i));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K, M extends Map<? super K, ? super Double>> M associateByTo(@yfb double[] dArr, @yfb M m, @yfb qy6<? super Double, ? extends K> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (double d : dArr) {
            m.put(qy6Var.invoke(Double.valueOf(d)), Double.valueOf(d));
        }
        return m;
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@yfb double[] dArr, @yfb M m, @yfb qy6<? super Double, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (double d : dArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Double.valueOf(d));
            m.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return m;
    }

    @jjf(version = "1.4")
    @t28
    private static final <V, M extends Map<? super Double, ? super V>> M associateWithTo(double[] dArr, M m, qy6<? super Double, ? extends V> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        for (double d : dArr) {
            m.put(Double.valueOf(d), qy6Var.invoke(Double.valueOf(d)));
        }
        return m;
    }

    public static final int count(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int i = 0;
        for (int i2 : iArr) {
            if (qy6Var.invoke(Integer.valueOf(i2)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @yfb
    public static final <K> List<Short> distinctBy(@yfb short[] sArr, @yfb qy6<? super Short, ? extends K> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (short s : sArr) {
            if (hashSet.add(qy6Var.invoke(Short.valueOf(s)))) {
                arrayList.add(Short.valueOf(s));
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Double> drop(@yfb double[] dArr, int i) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (i >= 0) {
            return takeLast(dArr, kpd.coerceAtLeast(dArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final List<Double> dropLast(@yfb double[] dArr, int i) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (i >= 0) {
            return take(dArr, kpd.coerceAtLeast(dArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final List<Integer> dropLastWhile(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(iArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Integer.valueOf(iArr[lastIndex])).booleanValue()) {
                return take(iArr, lastIndex + 1);
            }
        }
        return l82.emptyList();
    }

    @yfb
    public static final List<Double> filter(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d : dArr) {
            if (qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                arrayList.add(Double.valueOf(d));
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Long> filterIndexed(@yfb long[] jArr, @yfb gz6<? super Integer, ? super Long, Boolean> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            long j = jArr[i];
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Long.valueOf(j)).booleanValue()) {
                arrayList.add(Long.valueOf(j));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Double>> C filterIndexedTo(@yfb double[] dArr, @yfb C c, @yfb gz6<? super Integer, ? super Double, Boolean> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "predicate");
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            double d = dArr[i];
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Double.valueOf(d)).booleanValue()) {
                c.add(Double.valueOf(d));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @yfb
    public static final List<Double> filterNot(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d : dArr) {
            if (!qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                arrayList.add(Double.valueOf(d));
            }
        }
        return arrayList;
    }

    @t28
    private static final Long findLast(long[] jArr, qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                long j = jArr[length];
                if (qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                    return Long.valueOf(j);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    public static long first(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @gib
    public static final Integer firstOrNull(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int i : iArr) {
            if (qy6Var.invoke(Integer.valueOf(i)).booleanValue()) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    @yfb
    public static final <R> List<R> flatMap(@yfb int[] iArr, @yfb qy6<? super Integer, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            q82.addAll(arrayList, qy6Var.invoke(Integer.valueOf(i)));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(long[] jArr, C c, gz6<? super Integer, ? super Long, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C flatMapTo(@yfb long[] jArr, @yfb C c, @yfb qy6<? super Long, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (long j : jArr) {
            q82.addAll(c, qy6Var.invoke(Long.valueOf(j)));
        }
        return c;
    }

    public static final <R> R foldRight(@yfb double[] dArr, R r, @yfb gz6<? super Double, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (int lastIndex = getLastIndex(dArr); lastIndex >= 0; lastIndex--) {
            r = gz6Var.invoke(Double.valueOf(dArr[lastIndex]), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@yfb double[] dArr, R r, @yfb kz6<? super Integer, ? super Double, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        for (int lastIndex = getLastIndex(dArr); lastIndex >= 0; lastIndex--) {
            r = kz6Var.invoke(Integer.valueOf(lastIndex), Double.valueOf(dArr[lastIndex]), r);
        }
        return r;
    }

    @t64(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @q64(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @i2e(expression = "indexOfFirst { it == element }", imports = {}))
    public static final /* synthetic */ int indexOf(float[] fArr, float f) {
        md8.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (f == fArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (qy6Var.invoke(Double.valueOf(dArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (qy6Var.invoke(Double.valueOf(dArr[length])).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @yfb
    public static final Set<Double> intersect(@yfb double[] dArr, @yfb Iterable<Double> iterable) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        q82.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    public static long last(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[getLastIndex(jArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @t64(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @q64(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @i2e(expression = "indexOfLast { it == element }", imports = {}))
    public static final /* synthetic */ int lastIndexOf(float[] fArr, float f) {
        md8.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (f == fArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @gib
    public static final Byte lastOrNull(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            byte b = bArr[length];
            if (qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                return Byte.valueOf(b);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @yfb
    public static final <R> List<R> map(@yfb long[] jArr, @yfb qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(qy6Var.invoke(Long.valueOf(j)));
        }
        return arrayList;
    }

    @yfb
    public static final <R> List<R> mapIndexed(@yfb long[] jArr, @yfb gz6<? super Integer, ? super Long, ? extends R> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@yfb double[] dArr, @yfb C c, @yfb gz6<? super Integer, ? super Double, ? extends R> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(gz6Var.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapTo(@yfb double[] dArr, @yfb C c, @yfb qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (double d : dArr) {
            c.add(qy6Var.invoke(Double.valueOf(d)));
        }
        return c;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double maxOf(short[] sArr, qy6<? super Short, Double> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length != 0) {
            double dDoubleValue = qy6Var.invoke(Short.valueOf(sArr[0])).doubleValue();
            int lastIndex = getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Short.valueOf(sArr[i])).doubleValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m28766maxOfOrNull(short[] sArr, qy6<? super Short, Double> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Short.valueOf(sArr[0])).doubleValue();
        int lastIndex = getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Short.valueOf(sArr[i])).doubleValue());
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
    private static final <R> R maxOfWith(short[] sArr, Comparator<? super R> comparator, qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length != 0) {
            R rInvoke = qy6Var.invoke(Short.valueOf(sArr[0]));
            int lastIndex = getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Short.valueOf(sArr[i]));
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
        throw new NoSuchElementException();
    }

    @gib
    @jjf(version = "1.4")
    public static final <T extends Comparable<? super T>> T maxOrNull(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t2 = tArr[i];
                if (t.compareTo(t2) < 0) {
                    t = t2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    @jjf(version = "1.7")
    @yfb
    @xn8(name = "maxOrThrow")
    public static final <T extends Comparable<? super T>> T maxOrThrow(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            T t = tArr[0];
            int lastIndex = getLastIndex(tArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    T t2 = tArr[i];
                    if (t.compareTo(t2) < 0) {
                        t = t2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return t;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "maxWithOrThrow")
    public static final short maxWithOrThrow(@yfb short[] sArr, @yfb Comparator<? super Short> comparator) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (sArr.length != 0) {
            short s = sArr[0];
            int lastIndex = getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short s2 = sArr[i];
                    if (comparator.compare(Short.valueOf(s), Short.valueOf(s2)) < 0) {
                        s = s2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return s;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double minOf(short[] sArr, qy6<? super Short, Double> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length != 0) {
            double dDoubleValue = qy6Var.invoke(Short.valueOf(sArr[0])).doubleValue();
            int lastIndex = getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Short.valueOf(sArr[i])).doubleValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m28802minOfOrNull(short[] sArr, qy6<? super Short, Double> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Short.valueOf(sArr[0])).doubleValue();
        int lastIndex = getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Short.valueOf(sArr[i])).doubleValue());
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
    private static final <R> R minOfWith(short[] sArr, Comparator<? super R> comparator, qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length != 0) {
            R rInvoke = qy6Var.invoke(Short.valueOf(sArr[0]));
            int lastIndex = getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Short.valueOf(sArr[i]));
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
        throw new NoSuchElementException();
    }

    @gib
    @jjf(version = "1.4")
    public static final <T extends Comparable<? super T>> T minOrNull(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t2 = tArr[i];
                if (t.compareTo(t2) > 0) {
                    t = t2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    @jjf(version = "1.7")
    @yfb
    @xn8(name = "minOrThrow")
    public static final <T extends Comparable<? super T>> T minOrThrow(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            T t = tArr[0];
            int lastIndex = getLastIndex(tArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    T t2 = tArr[i];
                    if (t.compareTo(t2) > 0) {
                        t = t2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return t;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minWithOrThrow")
    public static final short minWithOrThrow(@yfb short[] sArr, @yfb Comparator<? super Short> comparator) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (sArr.length != 0) {
            short s = sArr[0];
            int lastIndex = getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short s2 = sArr[i];
                    if (comparator.compare(Short.valueOf(s), Short.valueOf(s2)) > 0) {
                        s = s2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return s;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int i : iArr) {
            if (qy6Var.invoke(Integer.valueOf(i)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @jjf(version = "1.3")
    public static final byte random(@yfb byte[] bArr, @yfb tod todVar) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (bArr.length != 0) {
            return bArr[todVar.nextInt(bArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int reduceRight(@yfb int[] iArr, @yfb gz6<? super Integer, ? super Integer, Integer> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            int iIntValue = iArr[lastIndex];
            for (int i = lastIndex - 1; i >= 0; i--) {
                iIntValue = gz6Var.invoke(Integer.valueOf(iArr[i]), Integer.valueOf(iIntValue)).intValue();
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final int reduceRightIndexed(@yfb int[] iArr, @yfb kz6<? super Integer, ? super Integer, ? super Integer, Integer> kz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            int iIntValue = iArr[lastIndex];
            for (int i = lastIndex - 1; i >= 0; i--) {
                iIntValue = kz6Var.invoke(Integer.valueOf(i), Integer.valueOf(iArr[i]), Integer.valueOf(iIntValue)).intValue();
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @yfb
    public static final List<Long> reversed(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return l82.emptyList();
        }
        List<Long> mutableList = toMutableList(jArr);
        s82.reverse(mutableList);
        return mutableList;
    }

    @yfb
    public static int[] reversedArray(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                iArr2[lastIndex - i] = iArr[i];
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iArr2;
    }

    @jjf(version = "1.4")
    @t28
    private static final List<Short> runningReduce(short[] sArr, gz6<? super Short, ? super Short, Short> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (sArr.length == 0) {
            return l82.emptyList();
        }
        short sShortValue = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(sShortValue));
        int length = sArr.length;
        for (int i = 1; i < length; i++) {
            sShortValue = gz6Var.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[i])).shortValue();
            arrayList.add(Short.valueOf(sShortValue));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final List<Short> runningReduceIndexed(short[] sArr, kz6<? super Integer, ? super Short, ? super Short, Short> kz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (sArr.length == 0) {
            return l82.emptyList();
        }
        short sShortValue = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(sShortValue));
        int length = sArr.length;
        for (int i = 1; i < length; i++) {
            sShortValue = kz6Var.invoke(Integer.valueOf(i), Short.valueOf(sShortValue), Short.valueOf(sArr[i])).shortValue();
            arrayList.add(Short.valueOf(sShortValue));
        }
        return arrayList;
    }

    public static int single(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return iArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @yfb
    public static final List<Double> slice(@yfb double[] dArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? l82.emptyList() : u70.asList(u70.copyOfRange(dArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1));
    }

    @yfb
    public static long[] sliceArray(@yfb long[] jArr, @yfb Collection<Integer> collection) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(collection, "indices");
        long[] jArr2 = new long[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr2[i] = jArr[it.next().intValue()];
            i++;
        }
        return jArr2;
    }

    @yfb
    public static final double[] sortedArray(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        md8.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        u70.sort(dArrCopyOf);
        return dArrCopyOf;
    }

    @yfb
    public static final double[] sortedArrayDescending(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        md8.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        sortDescending(dArrCopyOf);
        return dArrCopyOf;
    }

    @yfb
    public static final Set<Double> subtract(@yfb double[] dArr, @yfb Iterable<Double> iterable) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        q82.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final int sumBy(@yfb double[] dArr, @yfb qy6<? super Double, Integer> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (double d : dArr) {
            iIntValue += qy6Var.invoke(Double.valueOf(d)).intValue();
        }
        return iIntValue;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final double sumByDouble(@yfb double[] dArr, @yfb qy6<? super Double, Double> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (double d : dArr) {
            dDoubleValue += qy6Var.invoke(Double.valueOf(d)).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfDouble")
    private static final double sumOfDouble(double[] dArr, qy6<? super Double, Double> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (double d : dArr) {
            dDoubleValue += qy6Var.invoke(Double.valueOf(d)).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfInt")
    private static final int sumOfInt(double[] dArr, qy6<? super Double, Integer> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (double d : dArr) {
            iIntValue += qy6Var.invoke(Double.valueOf(d)).intValue();
        }
        return iIntValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfLong")
    private static final long sumOfLong(double[] dArr, qy6<? super Double, Long> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jLongValue = 0;
        for (double d : dArr) {
            jLongValue += qy6Var.invoke(Double.valueOf(d)).longValue();
        }
        return jLongValue;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfUInt")
    @ihi(markerClass = {yh5.class})
    private static final int sumOfUInt(long[] jArr, qy6<? super Long, woh> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        for (long j : jArr) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(Long.valueOf(j)).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfULong")
    @ihi(markerClass = {yh5.class})
    private static final long sumOfULong(long[] jArr, qy6<? super Long, oph> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jM31533constructorimpl = oph.m31533constructorimpl(0L);
        for (long j : jArr) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + qy6Var.invoke(Long.valueOf(j)).m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @yfb
    public static final List<Integer> takeLastWhile(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(iArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Integer.valueOf(iArr[lastIndex])).booleanValue()) {
                return drop(iArr, lastIndex + 1);
            }
        }
        return toList(iArr);
    }

    @yfb
    public static final List<Integer> takeWhile(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (!qy6Var.invoke(Integer.valueOf(i)).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Double>> C toCollection(@yfb double[] dArr, @yfb C c) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        for (double d : dArr) {
            c.add(Double.valueOf(d));
        }
        return c;
    }

    @yfb
    public static List<Integer> toList(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return l82.emptyList();
        }
        if (length != 1) {
            return toMutableList(iArr);
        }
        return k82.listOf(Integer.valueOf(iArr[0]));
    }

    @yfb
    public static final Set<Integer> toSet(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return w6f.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(iArr, new LinkedHashSet(wt9.mapCapacity(iArr.length)));
        }
        return v6f.setOf(Integer.valueOf(iArr[0]));
    }

    @yfb
    public static final Set<Double> union(@yfb double[] dArr, @yfb Iterable<Double> iterable) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        q82.addAll(mutableSet, iterable);
        return mutableSet;
    }

    @yfb
    public static final <R, V> List<V> zip(@yfb long[] jArr, @yfb R[] rArr, @yfb gz6<? super Long, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(jArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Long.valueOf(jArr[i]), rArr[i]));
        }
        return arrayList;
    }

    public static final boolean any(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (long j : jArr) {
            if (qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @jjf(version = "1.4")
    @t28
    private static final <V> Map<Double, V> associateWith(double[] dArr, qy6<? super Double, ? extends V> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(dArr.length), 16));
        for (double d : dArr) {
            linkedHashMap.put(Double.valueOf(d), qy6Var.invoke(Double.valueOf(d)));
        }
        return linkedHashMap;
    }

    public static final int count(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int i = 0;
        for (long j : jArr) {
            if (qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @gib
    public static final Long firstOrNull(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (long j : jArr) {
            if (qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                return Long.valueOf(j);
            }
        }
        return null;
    }

    @yfb
    public static final <A extends Appendable> A joinTo(@yfb short[] sArr, @yfb A a, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super Short, ? extends CharSequence> qy6Var) throws IOException {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(a, "buffer");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (short s : sArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (qy6Var != null) {
                a.append(qy6Var.invoke(Short.valueOf(s)));
            } else {
                a.append(String.valueOf((int) s));
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final boolean none(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (long j : jArr) {
            if (qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @gib
    @jjf(version = "1.4")
    public static final Short randomOrNull(@yfb short[] sArr, @yfb tod todVar) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[todVar.nextInt(sArr.length)]);
    }

    public static final void sortDescending(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length > 1) {
            u70.sort(fArr);
            reverse(fArr);
        }
    }

    @yfb
    public static final List<Boolean> toMutableList(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static final boolean any(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (float f : fArr) {
            if (qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @yfb
    public static final Iterable<Boolean> asIterable(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0 ? l82.emptyList() : new C5176h(zArr);
    }

    @yfb
    public static final vye<Boolean> asSequence(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0 ? ize.emptySequence() : new C5185q(zArr);
    }

    @yfb
    public static final <K, M extends Map<? super K, ? super Boolean>> M associateByTo(@yfb boolean[] zArr, @yfb M m, @yfb qy6<? super Boolean, ? extends K> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (boolean z : zArr) {
            m.put(qy6Var.invoke(Boolean.valueOf(z)), Boolean.valueOf(z));
        }
        return m;
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@yfb boolean[] zArr, @yfb M m, @yfb qy6<? super Boolean, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (boolean z : zArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Boolean.valueOf(z));
            m.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return m;
    }

    @jjf(version = "1.4")
    @t28
    private static final <V, M extends Map<? super Boolean, ? super V>> M associateWithTo(boolean[] zArr, M m, qy6<? super Boolean, ? extends V> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        for (boolean z : zArr) {
            m.put(Boolean.valueOf(z), qy6Var.invoke(Boolean.valueOf(z)));
        }
        return m;
    }

    public static final int count(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int i = 0;
        for (float f : fArr) {
            if (qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @yfb
    public static final List<Boolean> drop(@yfb boolean[] zArr, int i) {
        md8.checkNotNullParameter(zArr, "<this>");
        if (i >= 0) {
            return takeLast(zArr, kpd.coerceAtLeast(zArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final List<Boolean> dropLast(@yfb boolean[] zArr, int i) {
        md8.checkNotNullParameter(zArr, "<this>");
        if (i >= 0) {
            return take(zArr, kpd.coerceAtLeast(zArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final List<Boolean> filter(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z : zArr) {
            if (qy6Var.invoke(Boolean.valueOf(z)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z));
            }
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Boolean>> C filterIndexedTo(@yfb boolean[] zArr, @yfb C c, @yfb gz6<? super Integer, ? super Boolean, Boolean> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "predicate");
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            boolean z = zArr[i];
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Boolean.valueOf(z)).booleanValue()) {
                c.add(Boolean.valueOf(z));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @yfb
    public static final List<Boolean> filterNot(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z : zArr) {
            if (!qy6Var.invoke(Boolean.valueOf(z)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z));
            }
        }
        return arrayList;
    }

    @gib
    public static final Float firstOrNull(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (float f : fArr) {
            if (qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                return Float.valueOf(f);
            }
        }
        return null;
    }

    public static final <R> R foldRight(@yfb boolean[] zArr, R r, @yfb gz6<? super Boolean, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (int lastIndex = getLastIndex(zArr); lastIndex >= 0; lastIndex--) {
            r = gz6Var.invoke(Boolean.valueOf(zArr[lastIndex]), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@yfb boolean[] zArr, R r, @yfb kz6<? super Integer, ? super Boolean, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        for (int lastIndex = getLastIndex(zArr); lastIndex >= 0; lastIndex--) {
            r = kz6Var.invoke(Integer.valueOf(lastIndex), Boolean.valueOf(zArr[lastIndex]), r);
        }
        return r;
    }

    @yfb
    public static final <K, M extends Map<? super K, List<Short>>> M groupByTo(@yfb short[] sArr, @yfb M m, @yfb qy6<? super Short, ? extends K> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (short s : sArr) {
            K kInvoke = qy6Var.invoke(Short.valueOf(s));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Short.valueOf(s));
        }
        return m;
    }

    @t64(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @q64(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @i2e(expression = "indexOfFirst { it == element }", imports = {}))
    public static final /* synthetic */ int indexOf(double[] dArr, double d) {
        md8.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (d == dArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (qy6Var.invoke(Boolean.valueOf(zArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (qy6Var.invoke(Boolean.valueOf(zArr[length])).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @yfb
    public static final Set<Boolean> intersect(@yfb boolean[] zArr, @yfb Iterable<Boolean> iterable) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        q82.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    @t64(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @q64(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @i2e(expression = "indexOfLast { it == element }", imports = {}))
    public static final /* synthetic */ int lastIndexOf(double[] dArr, double d) {
        md8.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (d == dArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@yfb boolean[] zArr, @yfb C c, @yfb gz6<? super Integer, ? super Boolean, ? extends R> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(gz6Var.invoke(Integer.valueOf(i2), Boolean.valueOf(zArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapTo(@yfb boolean[] zArr, @yfb C c, @yfb qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (boolean z : zArr) {
            c.add(qy6Var.invoke(Boolean.valueOf(z)));
        }
        return c;
    }

    public static final boolean none(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (float f : fArr) {
            if (qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @yfb
    public static final scc<List<Short>, List<Short>> partition(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (short s : sArr) {
            if (qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                arrayList.add(Short.valueOf(s));
            } else {
                arrayList2.add(Short.valueOf(s));
            }
        }
        return new scc<>(arrayList, arrayList2);
    }

    @gib
    @jjf(version = "1.4")
    public static final Integer reduceIndexedOrNull(@yfb int[] iArr, @yfb kz6<? super Integer, ? super Integer, ? super Integer, Integer> kz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int iIntValue = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                iIntValue = kz6Var.invoke(Integer.valueOf(i), Integer.valueOf(iIntValue), Integer.valueOf(iArr[i])).intValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Integer.valueOf(iIntValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Integer reduceOrNull(@yfb int[] iArr, @yfb gz6<? super Integer, ? super Integer, Integer> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int iIntValue = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                iIntValue = gz6Var.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[i])).intValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Integer.valueOf(iIntValue);
    }

    @jjf(version = "1.4")
    public static final void shuffle(@yfb byte[] bArr, @yfb tod todVar) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        for (int lastIndex = getLastIndex(bArr); lastIndex > 0; lastIndex--) {
            int iNextInt = todVar.nextInt(lastIndex + 1);
            byte b = bArr[lastIndex];
            bArr[lastIndex] = bArr[iNextInt];
            bArr[iNextInt] = b;
        }
    }

    @gib
    public static final Short singleOrNull(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Short shValueOf = null;
        boolean z = false;
        for (short s : sArr) {
            if (qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                if (z) {
                    return null;
                }
                shValueOf = Short.valueOf(s);
                z = true;
            }
        }
        if (z) {
            return shValueOf;
        }
        return null;
    }

    @yfb
    public static final List<Boolean> slice(@yfb boolean[] zArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? l82.emptyList() : u70.asList(u70.copyOfRange(zArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1));
    }

    @yfb
    public static final char[] sortedArray(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        md8.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        u70.sort(cArrCopyOf);
        return cArrCopyOf;
    }

    @yfb
    public static final char[] sortedArrayDescending(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        md8.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        sortDescending(cArrCopyOf);
        return cArrCopyOf;
    }

    @yfb
    public static final Set<Boolean> subtract(@yfb boolean[] zArr, @yfb Iterable<Boolean> iterable) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        q82.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final int sumBy(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Integer> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (boolean z : zArr) {
            iIntValue += qy6Var.invoke(Boolean.valueOf(z)).intValue();
        }
        return iIntValue;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final double sumByDouble(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Double> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (boolean z : zArr) {
            dDoubleValue += qy6Var.invoke(Boolean.valueOf(z)).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfDouble")
    private static final double sumOfDouble(boolean[] zArr, qy6<? super Boolean, Double> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (boolean z : zArr) {
            dDoubleValue += qy6Var.invoke(Boolean.valueOf(z)).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfInt")
    private static final int sumOfInt(boolean[] zArr, qy6<? super Boolean, Integer> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (boolean z : zArr) {
            iIntValue += qy6Var.invoke(Boolean.valueOf(z)).intValue();
        }
        return iIntValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfLong")
    private static final long sumOfLong(boolean[] zArr, qy6<? super Boolean, Long> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jLongValue = 0;
        for (boolean z : zArr) {
            jLongValue += qy6Var.invoke(Boolean.valueOf(z)).longValue();
        }
        return jLongValue;
    }

    @yfb
    public static final List<Short> take(@yfb short[] sArr, int i) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        if (i >= sArr.length) {
            return toList(sArr);
        }
        if (i == 1) {
            return k82.listOf(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Short> takeLast(@yfb short[] sArr, int i) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        int length = sArr.length;
        if (i >= length) {
            return toList(sArr);
        }
        if (i == 1) {
            return k82.listOf(Short.valueOf(sArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(Short.valueOf(sArr[i2]));
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Boolean>> C toCollection(@yfb boolean[] zArr, @yfb C c) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        for (boolean z : zArr) {
            c.add(Boolean.valueOf(z));
        }
        return c;
    }

    @yfb
    public static final Set<Boolean> union(@yfb boolean[] zArr, @yfb Iterable<Boolean> iterable) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        q82.addAll(mutableSet, iterable);
        return mutableSet;
    }

    public static final boolean any(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (double d : dArr) {
            if (qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @jjf(version = "1.4")
    @t28
    private static final <V> Map<Boolean, V> associateWith(boolean[] zArr, qy6<? super Boolean, ? extends V> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(zArr.length), 16));
        for (boolean z : zArr) {
            linkedHashMap.put(Boolean.valueOf(z), qy6Var.invoke(Boolean.valueOf(z)));
        }
        return linkedHashMap;
    }

    public static final int count(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int i = 0;
        for (double d : dArr) {
            if (qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @yfb
    public static final List<Integer> dropWhile(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (int i : iArr) {
            if (z) {
                arrayList.add(Integer.valueOf(i));
            } else if (!qy6Var.invoke(Integer.valueOf(i)).booleanValue()) {
                arrayList.add(Integer.valueOf(i));
                z = true;
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Float> filterIndexed(@yfb float[] fArr, @yfb gz6<? super Integer, ? super Float, Boolean> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f = fArr[i];
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Float.valueOf(f)).booleanValue()) {
                arrayList.add(Float.valueOf(f));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @t28
    private static final Float findLast(float[] fArr, qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                float f = fArr[length];
                if (qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                    return Float.valueOf(f);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    public static final float first(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @gib
    public static final Double firstOrNull(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (double d : dArr) {
            if (qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                return Double.valueOf(d);
            }
        }
        return null;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(float[] fArr, C c, gz6<? super Integer, ? super Float, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C flatMapTo(@yfb float[] fArr, @yfb C c, @yfb qy6<? super Float, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (float f : fArr) {
            q82.addAll(c, qy6Var.invoke(Float.valueOf(f)));
        }
        return c;
    }

    public static final float last(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[getLastIndex(fArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @gib
    public static final Short lastOrNull(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            short s = sArr[length];
            if (qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                return Short.valueOf(s);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @yfb
    public static final <R> List<R> map(@yfb float[] fArr, @yfb qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(qy6Var.invoke(Float.valueOf(f)));
        }
        return arrayList;
    }

    @yfb
    public static final <R> List<R> mapIndexed(@yfb float[] fArr, @yfb gz6<? super Integer, ? super Float, ? extends R> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R maxOfWithOrNull(int[] iArr, Comparator<? super R> comparator, qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Integer.valueOf(iArr[i]));
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
    private static final <R> R minOfWithOrNull(int[] iArr, Comparator<? super R> comparator, qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Integer.valueOf(iArr[i]));
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

    public static final boolean none(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (double d : dArr) {
            if (qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @jjf(version = "1.3")
    public static final short random(@yfb short[] sArr, @yfb tod todVar) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (sArr.length != 0) {
            return sArr[todVar.nextInt(sArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @gib
    @jjf(version = "1.4")
    public static final Integer randomOrNull(@yfb int[] iArr, @yfb tod todVar) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[todVar.nextInt(iArr.length)]);
    }

    public static final int reduce(@yfb int[] iArr, @yfb gz6<? super Integer, ? super Integer, Integer> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (iArr.length != 0) {
            int iIntValue = iArr[0];
            int lastIndex = getLastIndex(iArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    iIntValue = gz6Var.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[i])).intValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final int reduceIndexed(@yfb int[] iArr, @yfb kz6<? super Integer, ? super Integer, ? super Integer, Integer> kz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (iArr.length != 0) {
            int iIntValue = iArr[0];
            int lastIndex = getLastIndex(iArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    iIntValue = kz6Var.invoke(Integer.valueOf(i), Integer.valueOf(iIntValue), Integer.valueOf(iArr[i])).intValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @gib
    @jjf(version = "1.4")
    public static final Long reduceRightIndexedOrNull(@yfb long[] jArr, @yfb kz6<? super Integer, ? super Long, ? super Long, Long> kz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long jLongValue = jArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            jLongValue = kz6Var.invoke(Integer.valueOf(i), Long.valueOf(jArr[i]), Long.valueOf(jLongValue)).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Long reduceRightOrNull(@yfb long[] jArr, @yfb gz6<? super Long, ? super Long, Long> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long jLongValue = jArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            jLongValue = gz6Var.invoke(Long.valueOf(jArr[i]), Long.valueOf(jLongValue)).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public static void reverse(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(iArr);
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = iArr[i];
            iArr[i] = iArr[lastIndex];
            iArr[lastIndex] = i2;
            lastIndex--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @yfb
    public static final List<Float> reversed(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return l82.emptyList();
        }
        List<Float> mutableList = toMutableList(fArr);
        s82.reverse(mutableList);
        return mutableList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> runningFold(int[] iArr, R r, gz6<? super R, ? super Integer, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (iArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r);
        for (int i : iArr) {
            r = gz6Var.invoke(r, Integer.valueOf(i));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> runningFoldIndexed(int[] iArr, R r, kz6<? super Integer, ? super R, ? super Integer, ? extends R> kz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (iArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Integer.valueOf(iArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @yfb
    public static final float[] sliceArray(@yfb float[] fArr, @yfb Collection<Integer> collection) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(collection, "indices");
        float[] fArr2 = new float[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr2[i] = fArr[it.next().intValue()];
            i++;
        }
        return fArr2;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfUInt")
    @ihi(markerClass = {yh5.class})
    private static final int sumOfUInt(float[] fArr, qy6<? super Float, woh> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        for (float f : fArr) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(Float.valueOf(f)).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfULong")
    @ihi(markerClass = {yh5.class})
    private static final long sumOfULong(float[] fArr, qy6<? super Float, oph> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jM31533constructorimpl = oph.m31533constructorimpl(0L);
        for (float f : fArr) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + qy6Var.invoke(Float.valueOf(f)).m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @yfb
    public static final List<Character> toMutableList(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }

    @yfb
    public static final <R, V> List<V> zip(@yfb float[] fArr, @yfb R[] rArr, @yfb gz6<? super Float, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(fArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Float.valueOf(fArr[i]), rArr[i]));
        }
        return arrayList;
    }

    public static final boolean any(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (boolean z : zArr) {
            if (qy6Var.invoke(Boolean.valueOf(z)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @yfb
    public static final Iterable<Character> asIterable(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0 ? l82.emptyList() : new C5177i(cArr);
    }

    @yfb
    public static final vye<Character> asSequence(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0 ? ize.emptySequence() : new C5186r(cArr);
    }

    @yfb
    public static final <K, V> Map<K, V> associate(@yfb long[] jArr, @yfb qy6<? super Long, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(jArr.length), 16));
        for (long j : jArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Long.valueOf(j));
            linkedHashMap.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K> Map<K, Long> associateBy(@yfb long[] jArr, @yfb qy6<? super Long, ? extends K> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(jArr.length), 16));
        for (long j : jArr) {
            linkedHashMap.put(qy6Var.invoke(Long.valueOf(j)), Long.valueOf(j));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(@yfb char[] cArr, @yfb M m, @yfb qy6<? super Character, ? extends K> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (char c : cArr) {
            m.put(qy6Var.invoke(Character.valueOf(c)), Character.valueOf(c));
        }
        return m;
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@yfb char[] cArr, @yfb M m, @yfb qy6<? super Character, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (char c : cArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Character.valueOf(c));
            m.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return m;
    }

    @jjf(version = "1.4")
    @t28
    private static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(char[] cArr, M m, qy6<? super Character, ? extends V> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        for (char c : cArr) {
            m.put(Character.valueOf(c), qy6Var.invoke(Character.valueOf(c)));
        }
        return m;
    }

    public static final int count(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int i = 0;
        for (boolean z : zArr) {
            if (qy6Var.invoke(Boolean.valueOf(z)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @yfb
    public static final List<Character> drop(@yfb char[] cArr, int i) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (i >= 0) {
            return takeLast(cArr, kpd.coerceAtLeast(cArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final List<Character> dropLast(@yfb char[] cArr, int i) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (i >= 0) {
            return take(cArr, kpd.coerceAtLeast(cArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final List<Long> dropLastWhile(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(jArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Long.valueOf(jArr[lastIndex])).booleanValue()) {
                return take(jArr, lastIndex + 1);
            }
        }
        return l82.emptyList();
    }

    @yfb
    public static final List<Character> filter(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c : cArr) {
            if (qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                arrayList.add(Character.valueOf(c));
            }
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Character>> C filterIndexedTo(@yfb char[] cArr, @yfb C c, @yfb gz6<? super Integer, ? super Character, Boolean> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "predicate");
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char c2 = cArr[i];
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(c2)).booleanValue()) {
                c.add(Character.valueOf(c2));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @yfb
    public static final List<Character> filterNot(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c : cArr) {
            if (!qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                arrayList.add(Character.valueOf(c));
            }
        }
        return arrayList;
    }

    @gib
    public static final Boolean firstOrNull(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (boolean z : zArr) {
            if (qy6Var.invoke(Boolean.valueOf(z)).booleanValue()) {
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    @yfb
    public static final <R> List<R> flatMap(@yfb long[] jArr, @yfb qy6<? super Long, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            q82.addAll(arrayList, qy6Var.invoke(Long.valueOf(j)));
        }
        return arrayList;
    }

    public static final <R> R foldRight(@yfb char[] cArr, R r, @yfb gz6<? super Character, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (int lastIndex = getLastIndex(cArr); lastIndex >= 0; lastIndex--) {
            r = gz6Var.invoke(Character.valueOf(cArr[lastIndex]), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@yfb char[] cArr, R r, @yfb kz6<? super Integer, ? super Character, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        for (int lastIndex = getLastIndex(cArr); lastIndex >= 0; lastIndex--) {
            r = kz6Var.invoke(Integer.valueOf(lastIndex), Character.valueOf(cArr[lastIndex]), r);
        }
        return r;
    }

    @yfb
    public static final <K> Map<K, List<Short>> groupBy(@yfb short[] sArr, @yfb qy6<? super Short, ? extends K> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s : sArr) {
            K kInvoke = qy6Var.invoke(Short.valueOf(s));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Short.valueOf(s));
        }
        return linkedHashMap;
    }

    public static final int indexOf(@yfb boolean[] zArr, boolean z) {
        md8.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (z == zArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (qy6Var.invoke(Character.valueOf(cArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (qy6Var.invoke(Character.valueOf(cArr[length])).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @yfb
    public static final Set<Character> intersect(@yfb char[] cArr, @yfb Iterable<Character> iterable) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        q82.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    public static final int lastIndexOf(@yfb boolean[] zArr, boolean z) {
        md8.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (z == zArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@yfb char[] cArr, @yfb C c, @yfb gz6<? super Integer, ? super Character, ? extends R> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(cArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapTo(@yfb char[] cArr, @yfb C c, @yfb qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (char c2 : cArr) {
            c.add(qy6Var.invoke(Character.valueOf(c2)));
        }
        return c;
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Short maxByOrNull(@yfb short[] sArr, @yfb qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s);
        }
        R rInvoke = qy6Var.invoke(Short.valueOf(s));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s2 = sArr[i];
                R rInvoke2 = qy6Var.invoke(Short.valueOf(s2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    s = s2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Short.valueOf(s);
    }

    @jjf(version = "1.7")
    @xn8(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> short maxByOrThrow(@yfb short[] sArr, @yfb qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length != 0) {
            short s = sArr[0];
            int lastIndex = getLastIndex(sArr);
            if (lastIndex == 0) {
                return s;
            }
            R rInvoke = qy6Var.invoke(Short.valueOf(s));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short s2 = sArr[i];
                    R rInvoke2 = qy6Var.invoke(Short.valueOf(s2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        s = s2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return s;
        }
        throw new NoSuchElementException();
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Short minByOrNull(@yfb short[] sArr, @yfb qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s);
        }
        R rInvoke = qy6Var.invoke(Short.valueOf(s));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s2 = sArr[i];
                R rInvoke2 = qy6Var.invoke(Short.valueOf(s2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    s = s2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Short.valueOf(s);
    }

    @jjf(version = "1.7")
    @xn8(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> short minByOrThrow(@yfb short[] sArr, @yfb qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length != 0) {
            short s = sArr[0];
            int lastIndex = getLastIndex(sArr);
            if (lastIndex == 0) {
                return s;
            }
            R rInvoke = qy6Var.invoke(Short.valueOf(s));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short s2 = sArr[i];
                    R rInvoke2 = qy6Var.invoke(Short.valueOf(s2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        s = s2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return s;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (boolean z : zArr) {
            if (qy6Var.invoke(Boolean.valueOf(z)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final long reduceRight(@yfb long[] jArr, @yfb gz6<? super Long, ? super Long, Long> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex >= 0) {
            long jLongValue = jArr[lastIndex];
            for (int i = lastIndex - 1; i >= 0; i--) {
                jLongValue = gz6Var.invoke(Long.valueOf(jArr[i]), Long.valueOf(jLongValue)).longValue();
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final long reduceRightIndexed(@yfb long[] jArr, @yfb kz6<? super Integer, ? super Long, ? super Long, Long> kz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex >= 0) {
            long jLongValue = jArr[lastIndex];
            for (int i = lastIndex - 1; i >= 0; i--) {
                jLongValue = kz6Var.invoke(Integer.valueOf(i), Long.valueOf(jArr[i]), Long.valueOf(jLongValue)).longValue();
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @yfb
    public static long[] reversedArray(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                jArr2[lastIndex - i] = jArr[i];
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return jArr2;
    }

    public static long single(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return jArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @yfb
    public static final List<Character> slice(@yfb char[] cArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? l82.emptyList() : u70.asList(u70.copyOfRange(cArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length > 1) {
            u70.sort(dArr);
            reverse(dArr);
        }
    }

    @yfb
    public static final Set<Character> subtract(@yfb char[] cArr, @yfb Iterable<Character> iterable) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        q82.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final int sumBy(@yfb char[] cArr, @yfb qy6<? super Character, Integer> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (char c : cArr) {
            iIntValue += qy6Var.invoke(Character.valueOf(c)).intValue();
        }
        return iIntValue;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final double sumByDouble(@yfb char[] cArr, @yfb qy6<? super Character, Double> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (char c : cArr) {
            dDoubleValue += qy6Var.invoke(Character.valueOf(c)).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfDouble")
    private static final double sumOfDouble(char[] cArr, qy6<? super Character, Double> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (char c : cArr) {
            dDoubleValue += qy6Var.invoke(Character.valueOf(c)).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfInt")
    private static final int sumOfInt(char[] cArr, qy6<? super Character, Integer> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (char c : cArr) {
            iIntValue += qy6Var.invoke(Character.valueOf(c)).intValue();
        }
        return iIntValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfLong")
    private static final long sumOfLong(char[] cArr, qy6<? super Character, Long> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jLongValue = 0;
        for (char c : cArr) {
            jLongValue += qy6Var.invoke(Character.valueOf(c)).longValue();
        }
        return jLongValue;
    }

    @yfb
    public static final List<Long> takeLastWhile(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(jArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Long.valueOf(jArr[lastIndex])).booleanValue()) {
                return drop(jArr, lastIndex + 1);
            }
        }
        return toList(jArr);
    }

    @yfb
    public static final List<Long> takeWhile(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            if (!qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    @yfb
    public static final <C extends Collection<? super Character>> C toCollection(@yfb char[] cArr, @yfb C c) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        for (char c2 : cArr) {
            c.add(Character.valueOf(c2));
        }
        return c;
    }

    @yfb
    public static List<Long> toList(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return l82.emptyList();
        }
        if (length != 1) {
            return toMutableList(jArr);
        }
        return k82.listOf(Long.valueOf(jArr[0]));
    }

    @yfb
    public static final Set<Long> toSet(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return w6f.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(jArr, new LinkedHashSet(wt9.mapCapacity(jArr.length)));
        }
        return v6f.setOf(Long.valueOf(jArr[0]));
    }

    @yfb
    public static final Set<Character> union(@yfb char[] cArr, @yfb Iterable<Character> iterable) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        q82.addAll(mutableSet, iterable);
        return mutableSet;
    }

    public static final boolean any(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (char c : cArr) {
            if (qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @jjf(version = "1.4")
    @t28
    private static final <V> Map<Character, V> associateWith(char[] cArr, qy6<? super Character, ? extends V> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(kpd.coerceAtMost(cArr.length, 128)), 16));
        for (char c : cArr) {
            linkedHashMap.put(Character.valueOf(c), qy6Var.invoke(Character.valueOf(c)));
        }
        return linkedHashMap;
    }

    public static final int count(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int i = 0;
        for (char c : cArr) {
            if (qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @gib
    public static final Character firstOrNull(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (char c : cArr) {
            if (qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                return Character.valueOf(c);
            }
        }
        return null;
    }

    @gib
    @jjf(version = "1.4")
    public static final Byte maxOrNull(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        int lastIndex = getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b2 = bArr[i];
                if (b < b2) {
                    b = b2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Byte.valueOf(b);
    }

    @gib
    @jjf(version = "1.4")
    public static final Integer maxWithOrNull(@yfb int[] iArr, @yfb Comparator<? super Integer> comparator) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i3 = iArr[i2];
                if (comparator.compare(Integer.valueOf(i), Integer.valueOf(i3)) < 0) {
                    i = i3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    @gib
    @jjf(version = "1.4")
    public static final Byte minOrNull(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        int lastIndex = getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b2 = bArr[i];
                if (b > b2) {
                    b = b2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Byte.valueOf(b);
    }

    @gib
    @jjf(version = "1.4")
    public static final Integer minWithOrNull(@yfb int[] iArr, @yfb Comparator<? super Integer> comparator) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i3 = iArr[i2];
                if (comparator.compare(Integer.valueOf(i), Integer.valueOf(i3)) > 0) {
                    i = i3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    public static final boolean none(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (char c : cArr) {
            if (qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @gib
    @jjf(version = "1.4")
    public static final Long randomOrNull(@yfb long[] jArr, @yfb tod todVar) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[todVar.nextInt(jArr.length)]);
    }

    @gib
    public static final Integer singleOrNull(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Integer numValueOf = null;
        boolean z = false;
        for (int i : iArr) {
            if (qy6Var.invoke(Integer.valueOf(i)).booleanValue()) {
                if (z) {
                    return null;
                }
                numValueOf = Integer.valueOf(i);
                z = true;
            }
        }
        if (z) {
            return numValueOf;
        }
        return null;
    }

    @yfb
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(@yfb T[] tArr, @yfb M m, @yfb qy6<? super T, ? extends K> qy6Var, @yfb qy6<? super T, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (T t : tArr) {
            m.put(qy6Var.invoke(t), qy6Var2.invoke(t));
        }
        return m;
    }

    @yfb
    public static final <K> List<Integer> distinctBy(@yfb int[] iArr, @yfb qy6<? super Integer, ? extends K> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (hashSet.add(qy6Var.invoke(Integer.valueOf(i)))) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Double> filterIndexed(@yfb double[] dArr, @yfb gz6<? super Integer, ? super Double, Boolean> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            double d = dArr[i];
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Double.valueOf(d)).booleanValue()) {
                arrayList.add(Double.valueOf(d));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @t28
    private static final Double findLast(double[] dArr, qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                double d = dArr[length];
                if (qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                    return Double.valueOf(d);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    public static final double first(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(double[] dArr, C c, gz6<? super Integer, ? super Double, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C flatMapTo(@yfb double[] dArr, @yfb C c, @yfb qy6<? super Double, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (double d : dArr) {
            q82.addAll(c, qy6Var.invoke(Double.valueOf(d)));
        }
        return c;
    }

    public static final int indexOf(@yfb char[] cArr, char c) {
        md8.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final double last(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[getLastIndex(dArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int lastIndexOf(@yfb char[] cArr, char c) {
        md8.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (c == cArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @gib
    public static final Integer lastOrNull(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            int i2 = iArr[length];
            if (qy6Var.invoke(Integer.valueOf(i2)).booleanValue()) {
                return Integer.valueOf(i2);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @yfb
    public static final <R> List<R> map(@yfb double[] dArr, @yfb qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(qy6Var.invoke(Double.valueOf(d)));
        }
        return arrayList;
    }

    @yfb
    public static final <R> List<R> mapIndexed(@yfb double[] dArr, @yfb gz6<? super Integer, ? super Double, ? extends R> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double maxOf(int[] iArr, qy6<? super Integer, Double> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length != 0) {
            double dDoubleValue = qy6Var.invoke(Integer.valueOf(iArr[0])).doubleValue();
            int lastIndex = getLastIndex(iArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Integer.valueOf(iArr[i])).doubleValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m28763maxOfOrNull(int[] iArr, qy6<? super Integer, Double> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int lastIndex = getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Integer.valueOf(iArr[i])).doubleValue());
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
    private static final <R> R maxOfWith(int[] iArr, Comparator<? super R> comparator, qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length != 0) {
            R rInvoke = qy6Var.invoke(Integer.valueOf(iArr[0]));
            int lastIndex = getLastIndex(iArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Integer.valueOf(iArr[i]));
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
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow")
    public static final byte maxOrThrow(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            byte b = bArr[0];
            int lastIndex = getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte b2 = bArr[i];
                    if (b < b2) {
                        b = b2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return b;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "maxWithOrThrow")
    public static final int maxWithOrThrow(@yfb int[] iArr, @yfb Comparator<? super Integer> comparator) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (iArr.length != 0) {
            int i = iArr[0];
            int lastIndex = getLastIndex(iArr);
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = iArr[i2];
                    if (comparator.compare(Integer.valueOf(i), Integer.valueOf(i3)) < 0) {
                        i = i3;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
            return i;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double minOf(int[] iArr, qy6<? super Integer, Double> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length != 0) {
            double dDoubleValue = qy6Var.invoke(Integer.valueOf(iArr[0])).doubleValue();
            int lastIndex = getLastIndex(iArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Integer.valueOf(iArr[i])).doubleValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m28799minOfOrNull(int[] iArr, qy6<? super Integer, Double> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int lastIndex = getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Integer.valueOf(iArr[i])).doubleValue());
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
    private static final <R> R minOfWith(int[] iArr, Comparator<? super R> comparator, qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length != 0) {
            R rInvoke = qy6Var.invoke(Integer.valueOf(iArr[0]));
            int lastIndex = getLastIndex(iArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Integer.valueOf(iArr[i]));
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
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow")
    public static final byte minOrThrow(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            byte b = bArr[0];
            int lastIndex = getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte b2 = bArr[i];
                    if (b > b2) {
                        b = b2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return b;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minWithOrThrow")
    public static final int minWithOrThrow(@yfb int[] iArr, @yfb Comparator<? super Integer> comparator) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (iArr.length != 0) {
            int i = iArr[0];
            int lastIndex = getLastIndex(iArr);
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = iArr[i2];
                    if (comparator.compare(Integer.valueOf(i), Integer.valueOf(i3)) > 0) {
                        i = i3;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
            return i;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.3")
    public static final int random(@yfb int[] iArr, @yfb tod todVar) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (iArr.length != 0) {
            return iArr[todVar.nextInt(iArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @yfb
    public static final List<Double> reversed(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return l82.emptyList();
        }
        List<Double> mutableList = toMutableList(dArr);
        s82.reverse(mutableList);
        return mutableList;
    }

    @jjf(version = "1.4")
    @t28
    private static final List<Integer> runningReduce(int[] iArr, gz6<? super Integer, ? super Integer, Integer> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (iArr.length == 0) {
            return l82.emptyList();
        }
        int iIntValue = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(iIntValue));
        int length = iArr.length;
        for (int i = 1; i < length; i++) {
            iIntValue = gz6Var.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[i])).intValue();
            arrayList.add(Integer.valueOf(iIntValue));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final List<Integer> runningReduceIndexed(int[] iArr, kz6<? super Integer, ? super Integer, ? super Integer, Integer> kz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (iArr.length == 0) {
            return l82.emptyList();
        }
        int iIntValue = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(iIntValue));
        int length = iArr.length;
        for (int i = 1; i < length; i++) {
            iIntValue = kz6Var.invoke(Integer.valueOf(i), Integer.valueOf(iIntValue), Integer.valueOf(iArr[i])).intValue();
            arrayList.add(Integer.valueOf(iIntValue));
        }
        return arrayList;
    }

    @yfb
    public static final <T> List<T> slice(@yfb T[] tArr, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(iterable, "indices");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(tArr[it.next().intValue()]);
        }
        return arrayList;
    }

    @yfb
    public static final double[] sliceArray(@yfb double[] dArr, @yfb Collection<Integer> collection) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(collection, "indices");
        double[] dArr2 = new double[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            dArr2[i] = dArr[it.next().intValue()];
            i++;
        }
        return dArr2;
    }

    @xn8(name = "sumOfDouble")
    public static final double sumOfDouble(@yfb Double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        double dDoubleValue = 0.0d;
        for (Double d : dArr) {
            dDoubleValue += d.doubleValue();
        }
        return dDoubleValue;
    }

    @xn8(name = "sumOfInt")
    public static final int sumOfInt(@yfb Integer[] numArr) {
        md8.checkNotNullParameter(numArr, "<this>");
        int iIntValue = 0;
        for (Integer num : numArr) {
            iIntValue += num.intValue();
        }
        return iIntValue;
    }

    @xn8(name = "sumOfLong")
    public static final long sumOfLong(@yfb Long[] lArr) {
        md8.checkNotNullParameter(lArr, "<this>");
        long jLongValue = 0;
        for (Long l : lArr) {
            jLongValue += l.longValue();
        }
        return jLongValue;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfUInt")
    @ihi(markerClass = {yh5.class})
    private static final int sumOfUInt(double[] dArr, qy6<? super Double, woh> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        for (double d : dArr) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(Double.valueOf(d)).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfULong")
    @ihi(markerClass = {yh5.class})
    private static final long sumOfULong(double[] dArr, qy6<? super Double, oph> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jM31533constructorimpl = oph.m31533constructorimpl(0L);
        for (double d : dArr) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + qy6Var.invoke(Double.valueOf(d)).m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @yfb
    public static final <R, V> List<V> zip(@yfb double[] dArr, @yfb R[] rArr, @yfb gz6<? super Double, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(dArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Double.valueOf(dArr[i]), rArr[i]));
        }
        return arrayList;
    }

    @gib
    @jjf(version = "1.4")
    public static final Float randomOrNull(@yfb float[] fArr, @yfb tod todVar) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[todVar.nextInt(fArr.length)]);
    }

    @gib
    @jjf(version = "1.4")
    public static final Long reduceIndexedOrNull(@yfb long[] jArr, @yfb kz6<? super Integer, ? super Long, ? super Long, Long> kz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long jLongValue = jArr[0];
        int lastIndex = getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                jLongValue = kz6Var.invoke(Integer.valueOf(i), Long.valueOf(jLongValue), Long.valueOf(jArr[i])).longValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(jLongValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Long reduceOrNull(@yfb long[] jArr, @yfb gz6<? super Long, ? super Long, Long> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long jLongValue = jArr[0];
        int lastIndex = getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                jLongValue = gz6Var.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[i])).longValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(jLongValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Float reduceRightIndexedOrNull(@yfb float[] fArr, @yfb kz6<? super Integer, ? super Float, ? super Float, Float> kz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            return null;
        }
        float fFloatValue = fArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            fFloatValue = kz6Var.invoke(Integer.valueOf(i), Float.valueOf(fArr[i]), Float.valueOf(fFloatValue)).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Float reduceRightOrNull(@yfb float[] fArr, @yfb gz6<? super Float, ? super Float, Float> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            return null;
        }
        float fFloatValue = fArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            fFloatValue = gz6Var.invoke(Float.valueOf(fArr[i]), Float.valueOf(fFloatValue)).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @jjf(version = "1.4")
    public static final void shuffle(@yfb short[] sArr, @yfb tod todVar) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        for (int lastIndex = getLastIndex(sArr); lastIndex > 0; lastIndex--) {
            int iNextInt = todVar.nextInt(lastIndex + 1);
            short s = sArr[lastIndex];
            sArr[lastIndex] = sArr[iNextInt];
            sArr[iNextInt] = s;
        }
    }

    public static final void sortDescending(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (cArr.length > 1) {
            u70.sort(cArr);
            reverse(cArr);
        }
    }

    @yfb
    public static final <K, V> Map<K, V> associate(@yfb float[] fArr, @yfb qy6<? super Float, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(fArr.length), 16));
        for (float f : fArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Float.valueOf(f));
            linkedHashMap.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K> Map<K, Float> associateBy(@yfb float[] fArr, @yfb qy6<? super Float, ? extends K> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(fArr.length), 16));
        for (float f : fArr) {
            linkedHashMap.put(qy6Var.invoke(Float.valueOf(f)), Float.valueOf(f));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@yfb byte[] bArr, @yfb M m, @yfb qy6<? super Byte, ? extends K> qy6Var, @yfb qy6<? super Byte, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (byte b : bArr) {
            m.put(qy6Var.invoke(Byte.valueOf(b)), qy6Var2.invoke(Byte.valueOf(b)));
        }
        return m;
    }

    @yfb
    public static final List<Float> dropLastWhile(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(fArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Float.valueOf(fArr[lastIndex])).booleanValue()) {
                return take(fArr, lastIndex + 1);
            }
        }
        return l82.emptyList();
    }

    @yfb
    public static final List<Long> dropWhile(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (long j : jArr) {
            if (z) {
                arrayList.add(Long.valueOf(j));
            } else if (!qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                arrayList.add(Long.valueOf(j));
                z = true;
            }
        }
        return arrayList;
    }

    @yfb
    public static final <R> List<R> flatMap(@yfb float[] fArr, @yfb qy6<? super Float, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        for (float f : fArr) {
            q82.addAll(arrayList, qy6Var.invoke(Float.valueOf(f)));
        }
        return arrayList;
    }

    @yfb
    public static final <A extends Appendable> A joinTo(@yfb int[] iArr, @yfb A a, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super Integer, ? extends CharSequence> qy6Var) throws IOException {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(a, "buffer");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (int i3 : iArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (qy6Var != null) {
                a.append(qy6Var.invoke(Integer.valueOf(i3)));
            } else {
                a.append(String.valueOf(i3));
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R maxOfWithOrNull(long[] jArr, Comparator<? super R> comparator, qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Long.valueOf(jArr[i]));
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
    private static final <R> R minOfWithOrNull(long[] jArr, Comparator<? super R> comparator, qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Long.valueOf(jArr[i]));
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

    public static final long reduce(@yfb long[] jArr, @yfb gz6<? super Long, ? super Long, Long> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (jArr.length != 0) {
            long jLongValue = jArr[0];
            int lastIndex = getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    jLongValue = gz6Var.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[i])).longValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final long reduceIndexed(@yfb long[] jArr, @yfb kz6<? super Integer, ? super Long, ? super Long, Long> kz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (jArr.length != 0) {
            long jLongValue = jArr[0];
            int lastIndex = getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    jLongValue = kz6Var.invoke(Integer.valueOf(i), Long.valueOf(jLongValue), Long.valueOf(jArr[i])).longValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceRight(@yfb float[] fArr, @yfb gz6<? super Float, ? super Float, Float> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            float fFloatValue = fArr[lastIndex];
            for (int i = lastIndex - 1; i >= 0; i--) {
                fFloatValue = gz6Var.invoke(Float.valueOf(fArr[i]), Float.valueOf(fFloatValue)).floatValue();
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceRightIndexed(@yfb float[] fArr, @yfb kz6<? super Integer, ? super Float, ? super Float, Float> kz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            float fFloatValue = fArr[lastIndex];
            for (int i = lastIndex - 1; i >= 0; i--) {
                fFloatValue = kz6Var.invoke(Integer.valueOf(i), Float.valueOf(fArr[i]), Float.valueOf(fFloatValue)).floatValue();
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static void reverse(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        int length = (jArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(jArr);
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            jArr[i] = jArr[lastIndex];
            jArr[lastIndex] = j;
            lastIndex--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @yfb
    public static final float[] reversedArray(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                fArr2[lastIndex - i] = fArr[i];
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return fArr2;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> runningFold(long[] jArr, R r, gz6<? super R, ? super Long, ? extends R> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (jArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r);
        for (long j : jArr) {
            r = gz6Var.invoke(r, Long.valueOf(j));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> runningFoldIndexed(long[] jArr, R r, kz6<? super Integer, ? super R, ? super Long, ? extends R> kz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (jArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r);
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Long.valueOf(jArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    public static final float single(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return fArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @gib
    public static final Long singleOrNull(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Long lValueOf = null;
        boolean z = false;
        for (long j : jArr) {
            if (qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                if (z) {
                    return null;
                }
                lValueOf = Long.valueOf(j);
                z = true;
            }
        }
        if (z) {
            return lValueOf;
        }
        return null;
    }

    @yfb
    public static final List<Float> takeLastWhile(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(fArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Float.valueOf(fArr[lastIndex])).booleanValue()) {
                return drop(fArr, lastIndex + 1);
            }
        }
        return toList(fArr);
    }

    @yfb
    public static final List<Float> takeWhile(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f : fArr) {
            if (!qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @yfb
    public static List<Float> toList(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return l82.emptyList();
        }
        if (length != 1) {
            return toMutableList(fArr);
        }
        return k82.listOf(Float.valueOf(fArr[0]));
    }

    @yfb
    public static final Set<Float> toSet(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return w6f.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(fArr, new LinkedHashSet(wt9.mapCapacity(fArr.length)));
        }
        return v6f.setOf(Float.valueOf(fArr[0]));
    }

    @yfb
    public static final List<Boolean> filterIndexed(@yfb boolean[] zArr, @yfb gz6<? super Integer, ? super Boolean, Boolean> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            boolean z = zArr[i];
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Boolean.valueOf(z)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @t28
    private static final Boolean findLast(boolean[] zArr, qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                boolean z = zArr[length];
                if (qy6Var.invoke(Boolean.valueOf(z)).booleanValue()) {
                    return Boolean.valueOf(z);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    public static final boolean first(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(boolean[] zArr, C c, gz6<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i2), Boolean.valueOf(zArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C flatMapTo(@yfb boolean[] zArr, @yfb C c, @yfb qy6<? super Boolean, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (boolean z : zArr) {
            q82.addAll(c, qy6Var.invoke(Boolean.valueOf(z)));
        }
        return c;
    }

    @yfb
    public static final <K, M extends Map<? super K, List<Integer>>> M groupByTo(@yfb int[] iArr, @yfb M m, @yfb qy6<? super Integer, ? extends K> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (int i : iArr) {
            K kInvoke = qy6Var.invoke(Integer.valueOf(i));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Integer.valueOf(i));
        }
        return m;
    }

    public static final boolean last(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[getLastIndex(zArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @gib
    public static final Long lastOrNull(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            long j = jArr[length];
            if (qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                return Long.valueOf(j);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @yfb
    public static final <R> List<R> map(@yfb boolean[] zArr, @yfb qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(qy6Var.invoke(Boolean.valueOf(z)));
        }
        return arrayList;
    }

    @yfb
    public static final <R> List<R> mapIndexed(@yfb boolean[] zArr, @yfb gz6<? super Integer, ? super Boolean, ? extends R> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(i2), Boolean.valueOf(zArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @yfb
    public static final scc<List<Integer>, List<Integer>> partition(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i : iArr) {
            if (qy6Var.invoke(Integer.valueOf(i)).booleanValue()) {
                arrayList.add(Integer.valueOf(i));
            } else {
                arrayList2.add(Integer.valueOf(i));
            }
        }
        return new scc<>(arrayList, arrayList2);
    }

    @jjf(version = "1.3")
    public static final long random(@yfb long[] jArr, @yfb tod todVar) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (jArr.length != 0) {
            return jArr[todVar.nextInt(jArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @gib
    @jjf(version = "1.4")
    public static final Double randomOrNull(@yfb double[] dArr, @yfb tod todVar) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[todVar.nextInt(dArr.length)]);
    }

    @yfb
    public static final List<Boolean> reversed(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return l82.emptyList();
        }
        List<Boolean> mutableList = toMutableList(zArr);
        s82.reverse(mutableList);
        return mutableList;
    }

    @yfb
    public static final boolean[] sliceArray(@yfb boolean[] zArr, @yfb Collection<Integer> collection) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(collection, "indices");
        boolean[] zArr2 = new boolean[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr2[i] = zArr[it.next().intValue()];
            i++;
        }
        return zArr2;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfUInt")
    @ihi(markerClass = {yh5.class})
    private static final int sumOfUInt(boolean[] zArr, qy6<? super Boolean, woh> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        for (boolean z : zArr) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(Boolean.valueOf(z)).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfULong")
    @ihi(markerClass = {yh5.class})
    private static final long sumOfULong(boolean[] zArr, qy6<? super Boolean, oph> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jM31533constructorimpl = oph.m31533constructorimpl(0L);
        for (boolean z : zArr) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + qy6Var.invoke(Boolean.valueOf(z)).m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @yfb
    public static final List<Integer> take(@yfb int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        if (i >= iArr.length) {
            return toList(iArr);
        }
        if (i == 1) {
            return k82.listOf(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (int i3 : iArr) {
            arrayList.add(Integer.valueOf(i3));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Integer> takeLast(@yfb int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        int length = iArr.length;
        if (i >= length) {
            return toList(iArr);
        }
        if (i == 1) {
            return k82.listOf(Integer.valueOf(iArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(Integer.valueOf(iArr[i2]));
        }
        return arrayList;
    }

    @yfb
    public static final <R, V> List<V> zip(@yfb boolean[] zArr, @yfb R[] rArr, @yfb gz6<? super Boolean, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(zArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Boolean.valueOf(zArr[i]), rArr[i]));
        }
        return arrayList;
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@yfb short[] sArr, @yfb M m, @yfb qy6<? super Short, ? extends K> qy6Var, @yfb qy6<? super Short, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (short s : sArr) {
            m.put(qy6Var.invoke(Short.valueOf(s)), qy6Var2.invoke(Short.valueOf(s)));
        }
        return m;
    }

    @gib
    @jjf(version = "1.4")
    public static final Short maxOrNull(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s2 = sArr[i];
                if (s < s2) {
                    s = s2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Short.valueOf(s);
    }

    @gib
    @jjf(version = "1.4")
    public static final Short minOrNull(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s2 = sArr[i];
                if (s > s2) {
                    s = s2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Short.valueOf(s);
    }

    @jjf(version = "1.4")
    public static final <T extends Comparable<? super T>> void sortDescending(@yfb T[] tArr, int i, int i2) {
        md8.checkNotNullParameter(tArr, "<this>");
        u70.sortWith(tArr, md2.reverseOrder(), i, i2);
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow")
    public static final short maxOrThrow(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            short s = sArr[0];
            int lastIndex = getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short s2 = sArr[i];
                    if (s < s2) {
                        s = s2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return s;
        }
        throw new NoSuchElementException();
    }

    @gib
    @jjf(version = "1.4")
    public static final Long maxWithOrNull(@yfb long[] jArr, @yfb Comparator<? super Long> comparator) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j2 = jArr[i];
                if (comparator.compare(Long.valueOf(j), Long.valueOf(j2)) < 0) {
                    j = j2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(j);
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow")
    public static final short minOrThrow(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            short s = sArr[0];
            int lastIndex = getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short s2 = sArr[i];
                    if (s > s2) {
                        s = s2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return s;
        }
        throw new NoSuchElementException();
    }

    @gib
    @jjf(version = "1.4")
    public static final Long minWithOrNull(@yfb long[] jArr, @yfb Comparator<? super Long> comparator) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j2 = jArr[i];
                if (comparator.compare(Long.valueOf(j), Long.valueOf(j2)) > 0) {
                    j = j2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(j);
    }

    @gib
    @jjf(version = "1.4")
    public static final Boolean randomOrNull(@yfb boolean[] zArr, @yfb tod todVar) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[todVar.nextInt(zArr.length)]);
    }

    @gib
    @jjf(version = "1.4")
    public static final Double reduceRightIndexedOrNull(@yfb double[] dArr, @yfb kz6<? super Integer, ? super Double, ? super Double, Double> kz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            return null;
        }
        double dDoubleValue = dArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            dDoubleValue = kz6Var.invoke(Integer.valueOf(i), Double.valueOf(dArr[i]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Double reduceRightOrNull(@yfb double[] dArr, @yfb gz6<? super Double, ? super Double, Double> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            return null;
        }
        double dDoubleValue = dArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            dDoubleValue = gz6Var.invoke(Double.valueOf(dArr[i]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @gib
    public static final Float singleOrNull(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Float fValueOf = null;
        boolean z = false;
        for (float f : fArr) {
            if (qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                if (z) {
                    return null;
                }
                fValueOf = Float.valueOf(f);
                z = true;
            }
        }
        if (z) {
            return fValueOf;
        }
        return null;
    }

    @yfb
    public static final List<Byte> slice(@yfb byte[] bArr, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(iterable, "indices");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf(bArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    public static final void sortDescending(@yfb byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "<this>");
        u70.sort(bArr, i, i2);
        reverse(bArr, i, i2);
    }

    @yfb
    public static final <K, V> Map<K, V> associate(@yfb double[] dArr, @yfb qy6<? super Double, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(dArr.length), 16));
        for (double d : dArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Double.valueOf(d));
            linkedHashMap.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K> Map<K, Double> associateBy(@yfb double[] dArr, @yfb qy6<? super Double, ? extends K> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(dArr.length), 16));
        for (double d : dArr) {
            linkedHashMap.put(qy6Var.invoke(Double.valueOf(d)), Double.valueOf(d));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@yfb int[] iArr, @yfb M m, @yfb qy6<? super Integer, ? extends K> qy6Var, @yfb qy6<? super Integer, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (int i : iArr) {
            m.put(qy6Var.invoke(Integer.valueOf(i)), qy6Var2.invoke(Integer.valueOf(i)));
        }
        return m;
    }

    @yfb
    public static final <K> List<Long> distinctBy(@yfb long[] jArr, @yfb qy6<? super Long, ? extends K> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            if (hashSet.add(qy6Var.invoke(Long.valueOf(j)))) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Double> dropLastWhile(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(dArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Double.valueOf(dArr[lastIndex])).booleanValue()) {
                return take(dArr, lastIndex + 1);
            }
        }
        return l82.emptyList();
    }

    @yfb
    public static final List<Character> filterIndexed(@yfb char[] cArr, @yfb gz6<? super Integer, ? super Character, Boolean> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char c = cArr[i];
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(c)).booleanValue()) {
                arrayList.add(Character.valueOf(c));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @t28
    private static final Character findLast(char[] cArr, qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char c = cArr[length];
                if (qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                    return Character.valueOf(c);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    public static final char first(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @yfb
    public static final <R> List<R> flatMap(@yfb double[] dArr, @yfb qy6<? super Double, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        for (double d : dArr) {
            q82.addAll(arrayList, qy6Var.invoke(Double.valueOf(d)));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(char[] cArr, C c, gz6<? super Integer, ? super Character, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(cArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C flatMapTo(@yfb char[] cArr, @yfb C c, @yfb qy6<? super Character, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (char c2 : cArr) {
            q82.addAll(c, qy6Var.invoke(Character.valueOf(c2)));
        }
        return c;
    }

    @yfb
    public static final <K> Map<K, List<Integer>> groupBy(@yfb int[] iArr, @yfb qy6<? super Integer, ? extends K> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i : iArr) {
            K kInvoke = qy6Var.invoke(Integer.valueOf(i));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Integer.valueOf(i));
        }
        return linkedHashMap;
    }

    public static final char last(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[getLastIndex(cArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @gib
    public static final Float lastOrNull(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            float f = fArr[length];
            if (qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                return Float.valueOf(f);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @yfb
    public static final <R> List<R> map(@yfb char[] cArr, @yfb qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(qy6Var.invoke(Character.valueOf(c)));
        }
        return arrayList;
    }

    @yfb
    public static final <R> List<R> mapIndexed(@yfb char[] cArr, @yfb gz6<? super Integer, ? super Character, ? extends R> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(cArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @jjf(version = "1.7")
    @xn8(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> int maxByOrThrow(@yfb int[] iArr, @yfb qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length != 0) {
            int i = iArr[0];
            int lastIndex = getLastIndex(iArr);
            if (lastIndex == 0) {
                return i;
            }
            R rInvoke = qy6Var.invoke(Integer.valueOf(i));
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = iArr[i2];
                    R rInvoke2 = qy6Var.invoke(Integer.valueOf(i3));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        i = i3;
                        rInvoke = rInvoke2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
            return i;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double maxOf(long[] jArr, qy6<? super Long, Double> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length != 0) {
            double dDoubleValue = qy6Var.invoke(Long.valueOf(jArr[0])).doubleValue();
            int lastIndex = getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Long.valueOf(jArr[i])).doubleValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m28764maxOfOrNull(long[] jArr, qy6<? super Long, Double> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Long.valueOf(jArr[0])).doubleValue();
        int lastIndex = getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Long.valueOf(jArr[i])).doubleValue());
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
    private static final <R> R maxOfWith(long[] jArr, Comparator<? super R> comparator, qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length != 0) {
            R rInvoke = qy6Var.invoke(Long.valueOf(jArr[0]));
            int lastIndex = getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Long.valueOf(jArr[i]));
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
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "maxWithOrThrow")
    public static final long maxWithOrThrow(@yfb long[] jArr, @yfb Comparator<? super Long> comparator) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (jArr.length != 0) {
            long j = jArr[0];
            int lastIndex = getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long j2 = jArr[i];
                    if (comparator.compare(Long.valueOf(j), Long.valueOf(j2)) < 0) {
                        j = j2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return j;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> int minByOrThrow(@yfb int[] iArr, @yfb qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length != 0) {
            int i = iArr[0];
            int lastIndex = getLastIndex(iArr);
            if (lastIndex == 0) {
                return i;
            }
            R rInvoke = qy6Var.invoke(Integer.valueOf(i));
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = iArr[i2];
                    R rInvoke2 = qy6Var.invoke(Integer.valueOf(i3));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        i = i3;
                        rInvoke = rInvoke2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
            return i;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double minOf(long[] jArr, qy6<? super Long, Double> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length != 0) {
            double dDoubleValue = qy6Var.invoke(Long.valueOf(jArr[0])).doubleValue();
            int lastIndex = getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Long.valueOf(jArr[i])).doubleValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m28800minOfOrNull(long[] jArr, qy6<? super Long, Double> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Long.valueOf(jArr[0])).doubleValue();
        int lastIndex = getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Long.valueOf(jArr[i])).doubleValue());
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
    private static final <R> R minOfWith(long[] jArr, Comparator<? super R> comparator, qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length != 0) {
            R rInvoke = qy6Var.invoke(Long.valueOf(jArr[0]));
            int lastIndex = getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Long.valueOf(jArr[i]));
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
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minWithOrThrow")
    public static final long minWithOrThrow(@yfb long[] jArr, @yfb Comparator<? super Long> comparator) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (jArr.length != 0) {
            long j = jArr[0];
            int lastIndex = getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long j2 = jArr[i];
                    if (comparator.compare(Long.valueOf(j), Long.valueOf(j2)) > 0) {
                        j = j2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return j;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.3")
    public static final float random(@yfb float[] fArr, @yfb tod todVar) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (fArr.length != 0) {
            return fArr[todVar.nextInt(fArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @gib
    @jjf(version = "1.4")
    public static final Float reduceIndexedOrNull(@yfb float[] fArr, @yfb kz6<? super Integer, ? super Float, ? super Float, Float> kz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = kz6Var.invoke(Integer.valueOf(i), Float.valueOf(fFloatValue), Float.valueOf(fArr[i])).floatValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Float reduceOrNull(@yfb float[] fArr, @yfb gz6<? super Float, ? super Float, Float> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = gz6Var.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[i])).floatValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    public static final double reduceRight(@yfb double[] dArr, @yfb gz6<? super Double, ? super Double, Double> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            double dDoubleValue = dArr[lastIndex];
            for (int i = lastIndex - 1; i >= 0; i--) {
                dDoubleValue = gz6Var.invoke(Double.valueOf(dArr[i]), Double.valueOf(dDoubleValue)).doubleValue();
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final double reduceRightIndexed(@yfb double[] dArr, @yfb kz6<? super Integer, ? super Double, ? super Double, Double> kz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            double dDoubleValue = dArr[lastIndex];
            for (int i = lastIndex - 1; i >= 0; i--) {
                dDoubleValue = kz6Var.invoke(Integer.valueOf(i), Double.valueOf(dArr[i]), Double.valueOf(dDoubleValue)).doubleValue();
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @yfb
    public static final List<Character> reversed(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return l82.emptyList();
        }
        List<Character> mutableList = toMutableList(cArr);
        s82.reverse(mutableList);
        return mutableList;
    }

    @yfb
    public static final double[] reversedArray(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                dArr2[lastIndex - i] = dArr[i];
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dArr2;
    }

    @jjf(version = "1.4")
    @t28
    private static final List<Long> runningReduce(long[] jArr, gz6<? super Long, ? super Long, Long> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (jArr.length == 0) {
            return l82.emptyList();
        }
        long jLongValue = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(jLongValue));
        int length = jArr.length;
        for (int i = 1; i < length; i++) {
            jLongValue = gz6Var.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[i])).longValue();
            arrayList.add(Long.valueOf(jLongValue));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final List<Long> runningReduceIndexed(long[] jArr, kz6<? super Integer, ? super Long, ? super Long, Long> kz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (jArr.length == 0) {
            return l82.emptyList();
        }
        long jLongValue = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(jLongValue));
        int length = jArr.length;
        for (int i = 1; i < length; i++) {
            jLongValue = kz6Var.invoke(Integer.valueOf(i), Long.valueOf(jLongValue), Long.valueOf(jArr[i])).longValue();
            arrayList.add(Long.valueOf(jLongValue));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    public static final void shuffle(@yfb int[] iArr, @yfb tod todVar) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        for (int lastIndex = getLastIndex(iArr); lastIndex > 0; lastIndex--) {
            int iNextInt = todVar.nextInt(lastIndex + 1);
            int i = iArr[lastIndex];
            iArr[lastIndex] = iArr[iNextInt];
            iArr[iNextInt] = i;
        }
    }

    public static final double single(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return dArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @yfb
    public static final char[] sliceArray(@yfb char[] cArr, @yfb Collection<Integer> collection) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(collection, "indices");
        char[] cArr2 = new char[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            cArr2[i] = cArr[it.next().intValue()];
            i++;
        }
        return cArr2;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfUInt")
    @ihi(markerClass = {yh5.class})
    private static final int sumOfUInt(char[] cArr, qy6<? super Character, woh> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        for (char c : cArr) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(Character.valueOf(c)).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfULong")
    @ihi(markerClass = {yh5.class})
    private static final long sumOfULong(char[] cArr, qy6<? super Character, oph> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jM31533constructorimpl = oph.m31533constructorimpl(0L);
        for (char c : cArr) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + qy6Var.invoke(Character.valueOf(c)).m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @yfb
    public static final List<Double> takeLastWhile(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(dArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Double.valueOf(dArr[lastIndex])).booleanValue()) {
                return drop(dArr, lastIndex + 1);
            }
        }
        return toList(dArr);
    }

    @yfb
    public static final List<Double> takeWhile(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d : dArr) {
            if (!qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    @yfb
    public static List<Double> toList(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return l82.emptyList();
        }
        if (length != 1) {
            return toMutableList(dArr);
        }
        return k82.listOf(Double.valueOf(dArr[0]));
    }

    @yfb
    public static final Set<Double> toSet(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return w6f.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(dArr, new LinkedHashSet(wt9.mapCapacity(dArr.length)));
        }
        return v6f.setOf(Double.valueOf(dArr[0]));
    }

    @yfb
    public static final <R, V> List<V> zip(@yfb char[] cArr, @yfb R[] rArr, @yfb gz6<? super Character, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(cArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Character.valueOf(cArr[i]), rArr[i]));
        }
        return arrayList;
    }

    @yfb
    public static final List<Float> dropWhile(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (float f : fArr) {
            if (z) {
                arrayList.add(Float.valueOf(f));
            } else if (!qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                arrayList.add(Float.valueOf(f));
                z = true;
            }
        }
        return arrayList;
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Integer maxByOrNull(@yfb int[] iArr, @yfb qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i);
        }
        R rInvoke = qy6Var.invoke(Integer.valueOf(i));
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i3 = iArr[i2];
                R rInvoke2 = qy6Var.invoke(Integer.valueOf(i3));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    i = i3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R maxOfWithOrNull(float[] fArr, Comparator<? super R> comparator, qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Float.valueOf(fArr[i]));
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
    public static final <R extends Comparable<? super R>> Integer minByOrNull(@yfb int[] iArr, @yfb qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i);
        }
        R rInvoke = qy6Var.invoke(Integer.valueOf(i));
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i3 = iArr[i2];
                R rInvoke2 = qy6Var.invoke(Integer.valueOf(i3));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    i = i3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R minOfWithOrNull(float[] fArr, Comparator<? super R> comparator, qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Float.valueOf(fArr[i]));
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
    public static final Character randomOrNull(@yfb char[] cArr, @yfb tod todVar) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[todVar.nextInt(cArr.length)]);
    }

    public static final float reduce(@yfb float[] fArr, @yfb gz6<? super Float, ? super Float, Float> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (fArr.length != 0) {
            float fFloatValue = fArr[0];
            int lastIndex = getLastIndex(fArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = gz6Var.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[i])).floatValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceIndexed(@yfb float[] fArr, @yfb kz6<? super Integer, ? super Float, ? super Float, Float> kz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (fArr.length != 0) {
            float fFloatValue = fArr[0];
            int lastIndex = getLastIndex(fArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = kz6Var.invoke(Integer.valueOf(i), Float.valueOf(fFloatValue), Float.valueOf(fArr[i])).floatValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void reverse(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        int length = (fArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(fArr);
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            float f = fArr[i];
            fArr[i] = fArr[lastIndex];
            fArr[lastIndex] = f;
            lastIndex--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> runningFold(float[] fArr, R r, gz6<? super R, ? super Float, ? extends R> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (fArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r);
        for (float f : fArr) {
            r = gz6Var.invoke(r, Float.valueOf(f));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> runningFoldIndexed(float[] fArr, R r, kz6<? super Integer, ? super R, ? super Float, ? extends R> kz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (fArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r);
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Float.valueOf(fArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    public static final void sortDescending(@yfb short[] sArr, int i, int i2) {
        md8.checkNotNullParameter(sArr, "<this>");
        u70.sort(sArr, i, i2);
        reverse(sArr, i, i2);
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@yfb long[] jArr, @yfb M m, @yfb qy6<? super Long, ? extends K> qy6Var, @yfb qy6<? super Long, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (long j : jArr) {
            m.put(qy6Var.invoke(Long.valueOf(j)), qy6Var2.invoke(Long.valueOf(j)));
        }
        return m;
    }

    @gib
    public static final Double singleOrNull(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Double dValueOf = null;
        boolean z = false;
        for (double d : dArr) {
            if (qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                if (z) {
                    return null;
                }
                dValueOf = Double.valueOf(d);
                z = true;
            }
        }
        if (z) {
            return dValueOf;
        }
        return null;
    }

    public static final <T> T first(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : tArr) {
            if (qy6Var.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @yfb
    public static final <A extends Appendable> A joinTo(@yfb long[] jArr, @yfb A a, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super Long, ? extends CharSequence> qy6Var) throws IOException {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(a, "buffer");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (long j : jArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (qy6Var != null) {
                a.append(qy6Var.invoke(Long.valueOf(j)));
            } else {
                a.append(String.valueOf(j));
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <T> T last(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                T t = tArr[length];
                if (!qy6Var.invoke(t).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return t;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @gib
    public static final Double lastOrNull(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            double d = dArr[length];
            if (qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                return Double.valueOf(d);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @gib
    @jjf(version = "1.4")
    public static final Integer maxOrNull(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    @gib
    @jjf(version = "1.4")
    public static Integer minOrNull(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i3 = iArr[i2];
                if (i > i3) {
                    i = i3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    @jjf(version = "1.3")
    public static final double random(@yfb double[] dArr, @yfb tod todVar) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (dArr.length != 0) {
            return dArr[todVar.nextInt(dArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @gib
    @jjf(version = "1.4")
    public static final Boolean reduceRightIndexedOrNull(@yfb boolean[] zArr, @yfb kz6<? super Integer, ? super Boolean, ? super Boolean, Boolean> kz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            return null;
        }
        boolean zBooleanValue = zArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            zBooleanValue = kz6Var.invoke(Integer.valueOf(i), Boolean.valueOf(zArr[i]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Boolean reduceRightOrNull(@yfb boolean[] zArr, @yfb gz6<? super Boolean, ? super Boolean, Boolean> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            return null;
        }
        boolean zBooleanValue = zArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            zBooleanValue = gz6Var.invoke(Boolean.valueOf(zArr[i]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @yfb
    public static final <T> T[] sliceArray(@yfb T[] tArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? (T[]) u70.copyOfRange(tArr, 0, 0) : (T[]) u70.copyOfRange(tArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1);
    }

    @jjf(version = "1.4")
    public static void sortDescending(@yfb int[] iArr, int i, int i2) {
        md8.checkNotNullParameter(iArr, "<this>");
        u70.sort(iArr, i, i2);
        reverse(iArr, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <T, R, V> List<V> zip(@yfb T[] tArr, @yfb Iterable<? extends R> iterable, @yfb gz6<? super T, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(gz6Var.invoke(tArr[i], r));
            i++;
        }
        return arrayList;
    }

    @yfb
    public static final <K, V> Map<K, V> associate(@yfb boolean[] zArr, @yfb qy6<? super Boolean, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(zArr.length), 16));
        for (boolean z : zArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Boolean.valueOf(z));
            linkedHashMap.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K> Map<K, Boolean> associateBy(@yfb boolean[] zArr, @yfb qy6<? super Boolean, ? extends K> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(zArr.length), 16));
        for (boolean z : zArr) {
            linkedHashMap.put(qy6Var.invoke(Boolean.valueOf(z)), Boolean.valueOf(z));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@yfb float[] fArr, @yfb M m, @yfb qy6<? super Float, ? extends K> qy6Var, @yfb qy6<? super Float, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (float f : fArr) {
            m.put(qy6Var.invoke(Float.valueOf(f)), qy6Var2.invoke(Float.valueOf(f)));
        }
        return m;
    }

    @yfb
    public static final List<Boolean> dropLastWhile(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(zArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Boolean.valueOf(zArr[lastIndex])).booleanValue()) {
                return take(zArr, lastIndex + 1);
            }
        }
        return l82.emptyList();
    }

    @yfb
    public static final <R> List<R> flatMap(@yfb boolean[] zArr, @yfb qy6<? super Boolean, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        for (boolean z : zArr) {
            q82.addAll(arrayList, qy6Var.invoke(Boolean.valueOf(z)));
        }
        return arrayList;
    }

    @yfb
    public static final <K, M extends Map<? super K, List<Long>>> M groupByTo(@yfb long[] jArr, @yfb M m, @yfb qy6<? super Long, ? extends K> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (long j : jArr) {
            K kInvoke = qy6Var.invoke(Long.valueOf(j));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Long.valueOf(j));
        }
        return m;
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow")
    public static int maxOrThrow(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            int i = iArr[0];
            int lastIndex = getLastIndex(iArr);
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i < i3) {
                        i = i3;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
            return i;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow")
    public static int minOrThrow(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            int i = iArr[0];
            int lastIndex = getLastIndex(iArr);
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i > i3) {
                        i = i3;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
            return i;
        }
        throw new NoSuchElementException();
    }

    @yfb
    public static final scc<List<Long>, List<Long>> partition(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (long j : jArr) {
            if (qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                arrayList.add(Long.valueOf(j));
            } else {
                arrayList2.add(Long.valueOf(j));
            }
        }
        return new scc<>(arrayList, arrayList2);
    }

    public static final boolean reduceRight(@yfb boolean[] zArr, @yfb gz6<? super Boolean, ? super Boolean, Boolean> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            boolean zBooleanValue = zArr[lastIndex];
            for (int i = lastIndex - 1; i >= 0; i--) {
                zBooleanValue = gz6Var.invoke(Boolean.valueOf(zArr[i]), Boolean.valueOf(zBooleanValue)).booleanValue();
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean reduceRightIndexed(@yfb boolean[] zArr, @yfb kz6<? super Integer, ? super Boolean, ? super Boolean, Boolean> kz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            boolean zBooleanValue = zArr[lastIndex];
            for (int i = lastIndex - 1; i >= 0; i--) {
                zBooleanValue = kz6Var.invoke(Integer.valueOf(i), Boolean.valueOf(zArr[i]), Boolean.valueOf(zBooleanValue)).booleanValue();
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @yfb
    public static final boolean[] reversedArray(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                zArr2[lastIndex - i] = zArr[i];
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return zArr2;
    }

    public static final boolean single(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return zArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @yfb
    public static final List<Short> slice(@yfb short[] sArr, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(iterable, "indices");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Short.valueOf(sArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @yfb
    public static final List<Long> take(@yfb long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        if (i >= jArr.length) {
            return toList(jArr);
        }
        if (i == 1) {
            return k82.listOf(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Long> takeLast(@yfb long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        int length = jArr.length;
        if (i >= length) {
            return toList(jArr);
        }
        if (i == 1) {
            return k82.listOf(Long.valueOf(jArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(Long.valueOf(jArr[i2]));
        }
        return arrayList;
    }

    @yfb
    public static final List<Boolean> takeLastWhile(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(zArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Boolean.valueOf(zArr[lastIndex])).booleanValue()) {
                return drop(zArr, lastIndex + 1);
            }
        }
        return toList(zArr);
    }

    @yfb
    public static final List<Boolean> takeWhile(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z : zArr) {
            if (!qy6Var.invoke(Boolean.valueOf(z)).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    @yfb
    public static final List<Boolean> toList(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return l82.emptyList();
        }
        if (length != 1) {
            return toMutableList(zArr);
        }
        return k82.listOf(Boolean.valueOf(zArr[0]));
    }

    @yfb
    public static final Set<Boolean> toSet(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return w6f.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(zArr, new LinkedHashSet(wt9.mapCapacity(zArr.length)));
        }
        return v6f.setOf(Boolean.valueOf(zArr[0]));
    }

    public static final byte first(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (byte b : bArr) {
            if (qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                return b;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @gib
    @jjf(version = "1.4")
    public static final Float maxWithOrNull(@yfb float[] fArr, @yfb Comparator<? super Float> comparator) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                float f2 = fArr[i];
                if (comparator.compare(Float.valueOf(f), Float.valueOf(f2)) < 0) {
                    f = f2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(f);
    }

    @gib
    @jjf(version = "1.4")
    public static final Float minWithOrNull(@yfb float[] fArr, @yfb Comparator<? super Float> comparator) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                float f2 = fArr[i];
                if (comparator.compare(Float.valueOf(f), Float.valueOf(f2)) > 0) {
                    f = f2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(f);
    }

    @gib
    @jjf(version = "1.4")
    public static final Double reduceIndexedOrNull(@yfb double[] dArr, @yfb kz6<? super Integer, ? super Double, ? super Double, Double> kz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0];
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = kz6Var.invoke(Integer.valueOf(i), Double.valueOf(dDoubleValue), Double.valueOf(dArr[i])).doubleValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Double reduceOrNull(@yfb double[] dArr, @yfb gz6<? super Double, ? super Double, Double> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0];
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = gz6Var.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[i])).doubleValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @jjf(version = "1.4")
    public static final void shuffle(@yfb long[] jArr, @yfb tod todVar) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        for (int lastIndex = getLastIndex(jArr); lastIndex > 0; lastIndex--) {
            int iNextInt = todVar.nextInt(lastIndex + 1);
            long j = jArr[lastIndex];
            jArr[lastIndex] = jArr[iNextInt];
            jArr[iNextInt] = j;
        }
    }

    @gib
    public static final Boolean singleOrNull(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Boolean boolValueOf = null;
        boolean z = false;
        for (boolean z2 : zArr) {
            if (qy6Var.invoke(Boolean.valueOf(z2)).booleanValue()) {
                if (z) {
                    return null;
                }
                boolValueOf = Boolean.valueOf(z2);
                z = true;
            }
        }
        if (z) {
            return boolValueOf;
        }
        return null;
    }

    @yfb
    public static byte[] sliceArray(@yfb byte[] bArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? new byte[0] : u70.copyOfRange(bArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1);
    }

    @jjf(version = "1.4")
    public static void sortDescending(@yfb long[] jArr, int i, int i2) {
        md8.checkNotNullParameter(jArr, "<this>");
        u70.sort(jArr, i, i2);
        reverse(jArr, i, i2);
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@yfb double[] dArr, @yfb M m, @yfb qy6<? super Double, ? extends K> qy6Var, @yfb qy6<? super Double, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (double d : dArr) {
            m.put(qy6Var.invoke(Double.valueOf(d)), qy6Var2.invoke(Double.valueOf(d)));
        }
        return m;
    }

    @yfb
    public static final <K> List<Float> distinctBy(@yfb float[] fArr, @yfb qy6<? super Float, ? extends K> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (float f : fArr) {
            if (hashSet.add(qy6Var.invoke(Float.valueOf(f)))) {
                arrayList.add(Float.valueOf(f));
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Double> dropWhile(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (double d : dArr) {
            if (z) {
                arrayList.add(Double.valueOf(d));
            } else if (!qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                arrayList.add(Double.valueOf(d));
                z = true;
            }
        }
        return arrayList;
    }

    @gib
    public static final Boolean lastOrNull(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            boolean z = zArr[length];
            if (qy6Var.invoke(Boolean.valueOf(z)).booleanValue()) {
                return Boolean.valueOf(z);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double maxOf(float[] fArr, qy6<? super Float, Double> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length != 0) {
            double dDoubleValue = qy6Var.invoke(Float.valueOf(fArr[0])).doubleValue();
            int lastIndex = getLastIndex(fArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Float.valueOf(fArr[i])).doubleValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m28762maxOfOrNull(float[] fArr, qy6<? super Float, Double> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Float.valueOf(fArr[0])).doubleValue();
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Float.valueOf(fArr[i])).doubleValue());
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
    private static final <R> R maxOfWith(float[] fArr, Comparator<? super R> comparator, qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length != 0) {
            R rInvoke = qy6Var.invoke(Float.valueOf(fArr[0]));
            int lastIndex = getLastIndex(fArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Float.valueOf(fArr[i]));
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
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R maxOfWithOrNull(double[] dArr, Comparator<? super R> comparator, qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Double.valueOf(dArr[i]));
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

    @jjf(version = "1.7")
    @xn8(name = "maxWithOrThrow")
    public static final float maxWithOrThrow(@yfb float[] fArr, @yfb Comparator<? super Float> comparator) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (fArr.length != 0) {
            float f = fArr[0];
            int lastIndex = getLastIndex(fArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    float f2 = fArr[i];
                    if (comparator.compare(Float.valueOf(f), Float.valueOf(f2)) < 0) {
                        f = f2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return f;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double minOf(float[] fArr, qy6<? super Float, Double> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length != 0) {
            double dDoubleValue = qy6Var.invoke(Float.valueOf(fArr[0])).doubleValue();
            int lastIndex = getLastIndex(fArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Float.valueOf(fArr[i])).doubleValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m28798minOfOrNull(float[] fArr, qy6<? super Float, Double> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Float.valueOf(fArr[0])).doubleValue();
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Float.valueOf(fArr[i])).doubleValue());
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
    private static final <R> R minOfWith(float[] fArr, Comparator<? super R> comparator, qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length != 0) {
            R rInvoke = qy6Var.invoke(Float.valueOf(fArr[0]));
            int lastIndex = getLastIndex(fArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Float.valueOf(fArr[i]));
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
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R minOfWithOrNull(double[] dArr, Comparator<? super R> comparator, qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Double.valueOf(dArr[i]));
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

    @jjf(version = "1.7")
    @xn8(name = "minWithOrThrow")
    public static final float minWithOrThrow(@yfb float[] fArr, @yfb Comparator<? super Float> comparator) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (fArr.length != 0) {
            float f = fArr[0];
            int lastIndex = getLastIndex(fArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    float f2 = fArr[i];
                    if (comparator.compare(Float.valueOf(f), Float.valueOf(f2)) > 0) {
                        f = f2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return f;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.3")
    public static final boolean random(@yfb boolean[] zArr, @yfb tod todVar) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (zArr.length != 0) {
            return zArr[todVar.nextInt(zArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final double reduce(@yfb double[] dArr, @yfb gz6<? super Double, ? super Double, Double> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (dArr.length != 0) {
            double dDoubleValue = dArr[0];
            int lastIndex = getLastIndex(dArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = gz6Var.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[i])).doubleValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final double reduceIndexed(@yfb double[] dArr, @yfb kz6<? super Integer, ? super Double, ? super Double, Double> kz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (dArr.length != 0) {
            double dDoubleValue = dArr[0];
            int lastIndex = getLastIndex(dArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = kz6Var.invoke(Integer.valueOf(i), Double.valueOf(dDoubleValue), Double.valueOf(dArr[i])).doubleValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void reverse(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        int length = (dArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(dArr);
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            double d = dArr[i];
            dArr[i] = dArr[lastIndex];
            dArr[lastIndex] = d;
            lastIndex--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> runningFold(double[] dArr, R r, gz6<? super R, ? super Double, ? extends R> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (dArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r);
        for (double d : dArr) {
            r = gz6Var.invoke(r, Double.valueOf(d));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> runningFoldIndexed(double[] dArr, R r, kz6<? super Integer, ? super R, ? super Double, ? extends R> kz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (dArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r);
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Double.valueOf(dArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final List<Float> runningReduce(float[] fArr, gz6<? super Float, ? super Float, Float> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (fArr.length == 0) {
            return l82.emptyList();
        }
        float fFloatValue = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(fFloatValue));
        int length = fArr.length;
        for (int i = 1; i < length; i++) {
            fFloatValue = gz6Var.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[i])).floatValue();
            arrayList.add(Float.valueOf(fFloatValue));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final List<Float> runningReduceIndexed(float[] fArr, kz6<? super Integer, ? super Float, ? super Float, Float> kz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (fArr.length == 0) {
            return l82.emptyList();
        }
        float fFloatValue = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(fFloatValue));
        int length = fArr.length;
        for (int i = 1; i < length; i++) {
            fFloatValue = kz6Var.invoke(Integer.valueOf(i), Float.valueOf(fFloatValue), Float.valueOf(fArr[i])).floatValue();
            arrayList.add(Float.valueOf(fFloatValue));
        }
        return arrayList;
    }

    public static final short first(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (short s : sArr) {
            if (qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                return s;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final byte last(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                byte b = bArr[length];
                if (!qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return b;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @gib
    @jjf(version = "1.4")
    public static final Character reduceRightIndexedOrNull(@yfb char[] cArr, @yfb kz6<? super Integer, ? super Character, ? super Character, Character> kz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            return null;
        }
        char cCharValue = cArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            cCharValue = kz6Var.invoke(Integer.valueOf(i), Character.valueOf(cArr[i]), Character.valueOf(cCharValue)).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Character reduceRightOrNull(@yfb char[] cArr, @yfb gz6<? super Character, ? super Character, Character> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            return null;
        }
        char cCharValue = cArr[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            cCharValue = gz6Var.invoke(Character.valueOf(cArr[i]), Character.valueOf(cCharValue)).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @yfb
    public static short[] sliceArray(@yfb short[] sArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? new short[0] : u70.copyOfRange(sArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1);
    }

    @jjf(version = "1.4")
    public static void sortDescending(@yfb float[] fArr, int i, int i2) {
        md8.checkNotNullParameter(fArr, "<this>");
        u70.sort(fArr, i, i2);
        reverse(fArr, i, i2);
    }

    @yfb
    public static final <R, V> List<V> zip(@yfb byte[] bArr, @yfb Iterable<? extends R> iterable, @yfb gz6<? super Byte, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(gz6Var.invoke(Byte.valueOf(bArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @yfb
    public static final <K, V> Map<K, V> associate(@yfb char[] cArr, @yfb qy6<? super Character, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(cArr.length), 16));
        for (char c : cArr) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Character.valueOf(c));
            linkedHashMap.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K> Map<K, Character> associateBy(@yfb char[] cArr, @yfb qy6<? super Character, ? extends K> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(cArr.length), 16));
        for (char c : cArr) {
            linkedHashMap.put(qy6Var.invoke(Character.valueOf(c)), Character.valueOf(c));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@yfb boolean[] zArr, @yfb M m, @yfb qy6<? super Boolean, ? extends K> qy6Var, @yfb qy6<? super Boolean, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (boolean z : zArr) {
            m.put(qy6Var.invoke(Boolean.valueOf(z)), qy6Var2.invoke(Boolean.valueOf(z)));
        }
        return m;
    }

    @yfb
    public static final List<Character> dropLastWhile(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(cArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Character.valueOf(cArr[lastIndex])).booleanValue()) {
                return take(cArr, lastIndex + 1);
            }
        }
        return l82.emptyList();
    }

    @yfb
    public static final <R> List<R> flatMap(@yfb char[] cArr, @yfb qy6<? super Character, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        for (char c : cArr) {
            q82.addAll(arrayList, qy6Var.invoke(Character.valueOf(c)));
        }
        return arrayList;
    }

    @yfb
    public static final <K> Map<K, List<Long>> groupBy(@yfb long[] jArr, @yfb qy6<? super Long, ? extends K> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j : jArr) {
            K kInvoke = qy6Var.invoke(Long.valueOf(j));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Long.valueOf(j));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.7")
    @xn8(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> long maxByOrThrow(@yfb long[] jArr, @yfb qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length != 0) {
            long j = jArr[0];
            int lastIndex = getLastIndex(jArr);
            if (lastIndex == 0) {
                return j;
            }
            R rInvoke = qy6Var.invoke(Long.valueOf(j));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long j2 = jArr[i];
                    R rInvoke2 = qy6Var.invoke(Long.valueOf(j2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        j = j2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return j;
        }
        throw new NoSuchElementException();
    }

    @gib
    @jjf(version = "1.4")
    public static final Long maxOrNull(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j2 = jArr[i];
                if (j < j2) {
                    j = j2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(j);
    }

    @jjf(version = "1.7")
    @xn8(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> long minByOrThrow(@yfb long[] jArr, @yfb qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length != 0) {
            long j = jArr[0];
            int lastIndex = getLastIndex(jArr);
            if (lastIndex == 0) {
                return j;
            }
            R rInvoke = qy6Var.invoke(Long.valueOf(j));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long j2 = jArr[i];
                    R rInvoke2 = qy6Var.invoke(Long.valueOf(j2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        j = j2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return j;
        }
        throw new NoSuchElementException();
    }

    @gib
    @jjf(version = "1.4")
    public static final Long minOrNull(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j2 = jArr[i];
                if (j > j2) {
                    j = j2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(j);
    }

    public static final char reduceRight(@yfb char[] cArr, @yfb gz6<? super Character, ? super Character, Character> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            char cCharValue = cArr[lastIndex];
            for (int i = lastIndex - 1; i >= 0; i--) {
                cCharValue = gz6Var.invoke(Character.valueOf(cArr[i]), Character.valueOf(cCharValue)).charValue();
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final char reduceRightIndexed(@yfb char[] cArr, @yfb kz6<? super Integer, ? super Character, ? super Character, Character> kz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            char cCharValue = cArr[lastIndex];
            for (int i = lastIndex - 1; i >= 0; i--) {
                cCharValue = kz6Var.invoke(Integer.valueOf(i), Character.valueOf(cArr[i]), Character.valueOf(cCharValue)).charValue();
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @yfb
    public static final char[] reversedArray(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                cArr2[lastIndex - i] = cArr[i];
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cArr2;
    }

    public static char single(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @gib
    public static final Character singleOrNull(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Character chValueOf = null;
        boolean z = false;
        for (char c : cArr) {
            if (qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                if (z) {
                    return null;
                }
                chValueOf = Character.valueOf(c);
                z = true;
            }
        }
        if (z) {
            return chValueOf;
        }
        return null;
    }

    @yfb
    public static final List<Character> takeLastWhile(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = getLastIndex(cArr); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Character.valueOf(cArr[lastIndex])).booleanValue()) {
                return drop(cArr, lastIndex + 1);
            }
        }
        return toList(cArr);
    }

    @yfb
    public static final List<Character> takeWhile(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c : cArr) {
            if (!qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }

    @yfb
    public static final List<Character> toList(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            return l82.emptyList();
        }
        if (length != 1) {
            return toMutableList(cArr);
        }
        return k82.listOf(Character.valueOf(cArr[0]));
    }

    @yfb
    public static final Set<Character> toSet(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            return w6f.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(cArr, new LinkedHashSet(wt9.mapCapacity(kpd.coerceAtMost(cArr.length, 128))));
        }
        return v6f.setOf(Character.valueOf(cArr[0]));
    }

    public static final int first(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int i : iArr) {
            if (qy6Var.invoke(Integer.valueOf(i)).booleanValue()) {
                return i;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @gib
    public static final Character lastOrNull(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            char c = cArr[length];
            if (qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                return Character.valueOf(c);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow")
    public static final long maxOrThrow(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            long j = jArr[0];
            int lastIndex = getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long j2 = jArr[i];
                    if (j < j2) {
                        j = j2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return j;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow")
    public static final long minOrThrow(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            long j = jArr[0];
            int lastIndex = getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long j2 = jArr[i];
                    if (j > j2) {
                        j = j2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return j;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.3")
    public static final char random(@yfb char[] cArr, @yfb tod todVar) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (cArr.length != 0) {
            return cArr[todVar.nextInt(cArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @yfb
    public static final List<Integer> slice(@yfb int[] iArr, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(iterable, "indices");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @yfb
    public static int[] sliceArray(@yfb int[] iArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? new int[0] : u70.copyOfRange(iArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1);
    }

    @jjf(version = "1.4")
    public static final void sortDescending(@yfb double[] dArr, int i, int i2) {
        md8.checkNotNullParameter(dArr, "<this>");
        u70.sort(dArr, i, i2);
        reverse(dArr, i, i2);
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@yfb char[] cArr, @yfb M m, @yfb qy6<? super Character, ? extends K> qy6Var, @yfb qy6<? super Character, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (char c : cArr) {
            m.put(qy6Var.invoke(Character.valueOf(c)), qy6Var2.invoke(Character.valueOf(c)));
        }
        return m;
    }

    @yfb
    public static final <A extends Appendable> A joinTo(@yfb float[] fArr, @yfb A a, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super Float, ? extends CharSequence> qy6Var) throws IOException {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(a, "buffer");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (float f : fArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (qy6Var != null) {
                a.append(qy6Var.invoke(Float.valueOf(f)));
            } else {
                a.append(String.valueOf(f));
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Long maxByOrNull(@yfb long[] jArr, @yfb qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j);
        }
        R rInvoke = qy6Var.invoke(Long.valueOf(j));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j2 = jArr[i];
                R rInvoke2 = qy6Var.invoke(Long.valueOf(j2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    j = j2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(j);
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Long minByOrNull(@yfb long[] jArr, @yfb qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j);
        }
        R rInvoke = qy6Var.invoke(Long.valueOf(j));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j2 = jArr[i];
                R rInvoke2 = qy6Var.invoke(Long.valueOf(j2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    j = j2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(j);
    }

    @gib
    @jjf(version = "1.4")
    public static final Boolean reduceIndexedOrNull(@yfb boolean[] zArr, @yfb kz6<? super Integer, ? super Boolean, ? super Boolean, Boolean> kz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean zBooleanValue = zArr[0];
        int lastIndex = getLastIndex(zArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                zBooleanValue = kz6Var.invoke(Integer.valueOf(i), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i])).booleanValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Boolean reduceOrNull(@yfb boolean[] zArr, @yfb gz6<? super Boolean, ? super Boolean, Boolean> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean zBooleanValue = zArr[0];
        int lastIndex = getLastIndex(zArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                zBooleanValue = gz6Var.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i])).booleanValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @jjf(version = "1.4")
    public static final void shuffle(@yfb float[] fArr, @yfb tod todVar) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        for (int lastIndex = getLastIndex(fArr); lastIndex > 0; lastIndex--) {
            int iNextInt = todVar.nextInt(lastIndex + 1);
            float f = fArr[lastIndex];
            fArr[lastIndex] = fArr[iNextInt];
            fArr[iNextInt] = f;
        }
    }

    @yfb
    public static final List<Boolean> dropWhile(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (boolean z2 : zArr) {
            if (z) {
                arrayList.add(Boolean.valueOf(z2));
            } else if (!qy6Var.invoke(Boolean.valueOf(z2)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z2));
                z = true;
            }
        }
        return arrayList;
    }

    public static final long first(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (long j : jArr) {
            if (qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                return j;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @yfb
    public static final <K, M extends Map<? super K, List<Float>>> M groupByTo(@yfb float[] fArr, @yfb M m, @yfb qy6<? super Float, ? extends K> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (float f : fArr) {
            K kInvoke = qy6Var.invoke(Float.valueOf(f));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Float.valueOf(f));
        }
        return m;
    }

    public static final short last(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                short s = sArr[length];
                if (!qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return s;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R maxOfWithOrNull(boolean[] zArr, Comparator<? super R> comparator, qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Boolean.valueOf(zArr[i]));
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
    public static final Double maxWithOrNull(@yfb double[] dArr, @yfb Comparator<? super Double> comparator) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                double d2 = dArr[i];
                if (comparator.compare(Double.valueOf(d), Double.valueOf(d2)) < 0) {
                    d = d2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(d);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R minOfWithOrNull(boolean[] zArr, Comparator<? super R> comparator, qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Boolean.valueOf(zArr[i]));
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
    public static final Double minWithOrNull(@yfb double[] dArr, @yfb Comparator<? super Double> comparator) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                double d2 = dArr[i];
                if (comparator.compare(Double.valueOf(d), Double.valueOf(d2)) > 0) {
                    d = d2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(d);
    }

    @yfb
    public static final scc<List<Float>, List<Float>> partition(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (float f : fArr) {
            if (qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                arrayList.add(Float.valueOf(f));
            } else {
                arrayList2.add(Float.valueOf(f));
            }
        }
        return new scc<>(arrayList, arrayList2);
    }

    public static final boolean reduce(@yfb boolean[] zArr, @yfb gz6<? super Boolean, ? super Boolean, Boolean> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (zArr.length != 0) {
            boolean zBooleanValue = zArr[0];
            int lastIndex = getLastIndex(zArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    zBooleanValue = gz6Var.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i])).booleanValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean reduceIndexed(@yfb boolean[] zArr, @yfb kz6<? super Integer, ? super Boolean, ? super Boolean, Boolean> kz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (zArr.length != 0) {
            boolean zBooleanValue = zArr[0];
            int lastIndex = getLastIndex(zArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    zBooleanValue = kz6Var.invoke(Integer.valueOf(i), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i])).booleanValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void reverse(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        int length = (zArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(zArr);
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            boolean z = zArr[i];
            zArr[i] = zArr[lastIndex];
            zArr[lastIndex] = z;
            lastIndex--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> runningFold(boolean[] zArr, R r, gz6<? super R, ? super Boolean, ? extends R> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (zArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r);
        for (boolean z : zArr) {
            r = gz6Var.invoke(r, Boolean.valueOf(z));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> runningFoldIndexed(boolean[] zArr, R r, kz6<? super Integer, ? super R, ? super Boolean, ? extends R> kz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (zArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r);
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Boolean.valueOf(zArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @yfb
    public static long[] sliceArray(@yfb long[] jArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? new long[0] : u70.copyOfRange(jArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1);
    }

    @jjf(version = "1.4")
    public static final void sortDescending(@yfb char[] cArr, int i, int i2) {
        md8.checkNotNullParameter(cArr, "<this>");
        u70.sort(cArr, i, i2);
        reverse(cArr, i, i2);
    }

    @yfb
    public static final List<Float> take(@yfb float[] fArr, int i) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        if (i >= fArr.length) {
            return toList(fArr);
        }
        if (i == 1) {
            return k82.listOf(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Float> takeLast(@yfb float[] fArr, int i) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        int length = fArr.length;
        if (i >= length) {
            return toList(fArr);
        }
        if (i == 1) {
            return k82.listOf(Float.valueOf(fArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(Float.valueOf(fArr[i2]));
        }
        return arrayList;
    }

    @yfb
    public static final <R, V> List<V> zip(@yfb short[] sArr, @yfb Iterable<? extends R> iterable, @yfb gz6<? super Short, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(gz6Var.invoke(Short.valueOf(sArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @yfb
    public static final <T, K, V> Map<K, V> associateBy(@yfb T[] tArr, @yfb qy6<? super T, ? extends K> qy6Var, @yfb qy6<? super T, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(tArr.length), 16));
        for (T t : tArr) {
            linkedHashMap.put(qy6Var.invoke(t), qy6Var2.invoke(t));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K> List<Double> distinctBy(@yfb double[] dArr, @yfb qy6<? super Double, ? extends K> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (double d : dArr) {
            if (hashSet.add(qy6Var.invoke(Double.valueOf(d)))) {
                arrayList.add(Double.valueOf(d));
            }
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double maxOf(double[] dArr, qy6<? super Double, Double> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length != 0) {
            double dDoubleValue = qy6Var.invoke(Double.valueOf(dArr[0])).doubleValue();
            int lastIndex = getLastIndex(dArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Double.valueOf(dArr[i])).doubleValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m28761maxOfOrNull(double[] dArr, qy6<? super Double, Double> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Double.valueOf(dArr[0])).doubleValue();
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Double.valueOf(dArr[i])).doubleValue());
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
    private static final <R> R maxOfWith(double[] dArr, Comparator<? super R> comparator, qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length != 0) {
            R rInvoke = qy6Var.invoke(Double.valueOf(dArr[0]));
            int lastIndex = getLastIndex(dArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Double.valueOf(dArr[i]));
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
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "maxWithOrThrow")
    public static final double maxWithOrThrow(@yfb double[] dArr, @yfb Comparator<? super Double> comparator) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (dArr.length != 0) {
            double d = dArr[0];
            int lastIndex = getLastIndex(dArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    double d2 = dArr[i];
                    if (comparator.compare(Double.valueOf(d), Double.valueOf(d2)) < 0) {
                        d = d2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return d;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double minOf(double[] dArr, qy6<? super Double, Double> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length != 0) {
            double dDoubleValue = qy6Var.invoke(Double.valueOf(dArr[0])).doubleValue();
            int lastIndex = getLastIndex(dArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Double.valueOf(dArr[i])).doubleValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m28797minOfOrNull(double[] dArr, qy6<? super Double, Double> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Double.valueOf(dArr[0])).doubleValue();
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Double.valueOf(dArr[i])).doubleValue());
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
    private static final <R> R minOfWith(double[] dArr, Comparator<? super R> comparator, qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length != 0) {
            R rInvoke = qy6Var.invoke(Double.valueOf(dArr[0]));
            int lastIndex = getLastIndex(dArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Double.valueOf(dArr[i]));
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
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minWithOrThrow")
    public static final double minWithOrThrow(@yfb double[] dArr, @yfb Comparator<? super Double> comparator) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (dArr.length != 0) {
            double d = dArr[0];
            int lastIndex = getLastIndex(dArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    double d2 = dArr[i];
                    if (comparator.compare(Double.valueOf(d), Double.valueOf(d2)) > 0) {
                        d = d2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return d;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.4")
    @t28
    private static final List<Double> runningReduce(double[] dArr, gz6<? super Double, ? super Double, Double> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (dArr.length == 0) {
            return l82.emptyList();
        }
        double dDoubleValue = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(dDoubleValue));
        int length = dArr.length;
        for (int i = 1; i < length; i++) {
            dDoubleValue = gz6Var.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[i])).doubleValue();
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final List<Double> runningReduceIndexed(double[] dArr, kz6<? super Integer, ? super Double, ? super Double, Double> kz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (dArr.length == 0) {
            return l82.emptyList();
        }
        double dDoubleValue = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(dDoubleValue));
        int length = dArr.length;
        for (int i = 1; i < length; i++) {
            dDoubleValue = kz6Var.invoke(Integer.valueOf(i), Double.valueOf(dDoubleValue), Double.valueOf(dArr[i])).doubleValue();
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    public static final <T> T single(@yfb T[] tArr, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : tArr) {
            if (qy6Var.invoke(t2).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float first(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (float f : fArr) {
            if (qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                return f;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @gib
    @jjf(version = "1.4")
    public static final Float maxOrNull(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMax = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fMax = Math.max(fMax, fArr[i]);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fMax);
    }

    @gib
    @jjf(version = "1.4")
    public static final Float minOrNull(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMin = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fMin = Math.min(fMin, fArr[i]);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fMin);
    }

    @yfb
    public static final float[] sliceArray(@yfb float[] fArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? new float[0] : u70.copyOfRange(fArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1);
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow")
    public static final float maxOrThrow(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float fMax = fArr[0];
            int lastIndex = getLastIndex(fArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fMax = Math.max(fMax, fArr[i]);
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fMax;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow")
    public static final float minOrThrow(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float fMin = fArr[0];
            int lastIndex = getLastIndex(fArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fMin = Math.min(fMin, fArr[i]);
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fMin;
        }
        throw new NoSuchElementException();
    }

    @yfb
    public static final List<Long> slice(@yfb long[] jArr, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(iterable, "indices");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(jArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final double first(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (double d : dArr) {
            if (qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                return d;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final int last(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                int i2 = iArr[length];
                if (!qy6Var.invoke(Integer.valueOf(i2)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return i2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @gib
    @jjf(version = "1.4")
    public static final Character reduceIndexedOrNull(@yfb char[] cArr, @yfb kz6<? super Integer, ? super Character, ? super Character, Character> kz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char cCharValue = cArr[0];
        int lastIndex = getLastIndex(cArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                cCharValue = kz6Var.invoke(Integer.valueOf(i), Character.valueOf(cCharValue), Character.valueOf(cArr[i])).charValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharValue);
    }

    @gib
    @jjf(version = "1.4")
    public static final Character reduceOrNull(@yfb char[] cArr, @yfb gz6<? super Character, ? super Character, Character> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char cCharValue = cArr[0];
        int lastIndex = getLastIndex(cArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                cCharValue = gz6Var.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[i])).charValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharValue);
    }

    @jjf(version = "1.4")
    public static final void shuffle(@yfb double[] dArr, @yfb tod todVar) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        for (int lastIndex = getLastIndex(dArr); lastIndex > 0; lastIndex--) {
            int iNextInt = todVar.nextInt(lastIndex + 1);
            double d = dArr[lastIndex];
            dArr[lastIndex] = dArr[iNextInt];
            dArr[iNextInt] = d;
        }
    }

    @yfb
    public static final double[] sliceArray(@yfb double[] dArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? new double[0] : u70.copyOfRange(dArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1);
    }

    @yfb
    public static final <R, V> List<V> zip(@yfb int[] iArr, @yfb Iterable<? extends R> iterable, @yfb gz6<? super Integer, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(gz6Var.invoke(Integer.valueOf(iArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @yfb
    public static final <K, V> Map<K, V> associateBy(@yfb byte[] bArr, @yfb qy6<? super Byte, ? extends K> qy6Var, @yfb qy6<? super Byte, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(bArr.length), 16));
        for (byte b : bArr) {
            linkedHashMap.put(qy6Var.invoke(Byte.valueOf(b)), qy6Var2.invoke(Byte.valueOf(b)));
        }
        return linkedHashMap;
    }

    @yfb
    public static final List<Character> dropWhile(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (char c : cArr) {
            if (z) {
                arrayList.add(Character.valueOf(c));
            } else if (!qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                arrayList.add(Character.valueOf(c));
                z = true;
            }
        }
        return arrayList;
    }

    @yfb
    public static final <K> Map<K, List<Float>> groupBy(@yfb float[] fArr, @yfb qy6<? super Float, ? extends K> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f : fArr) {
            K kInvoke = qy6Var.invoke(Float.valueOf(f));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Float.valueOf(f));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.7")
    @xn8(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> float maxByOrThrow(@yfb float[] fArr, @yfb qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length != 0) {
            float f = fArr[0];
            int lastIndex = getLastIndex(fArr);
            if (lastIndex == 0) {
                return f;
            }
            R rInvoke = qy6Var.invoke(Float.valueOf(f));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    float f2 = fArr[i];
                    R rInvoke2 = qy6Var.invoke(Float.valueOf(f2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        f = f2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return f;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R maxOfWithOrNull(char[] cArr, Comparator<? super R> comparator, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Character.valueOf(cArr[i]));
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

    @jjf(version = "1.7")
    @xn8(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> float minByOrThrow(@yfb float[] fArr, @yfb qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length != 0) {
            float f = fArr[0];
            int lastIndex = getLastIndex(fArr);
            if (lastIndex == 0) {
                return f;
            }
            R rInvoke = qy6Var.invoke(Float.valueOf(f));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    float f2 = fArr[i];
                    R rInvoke2 = qy6Var.invoke(Float.valueOf(f2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        f = f2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return f;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R minOfWithOrNull(char[] cArr, Comparator<? super R> comparator, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Character.valueOf(cArr[i]));
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

    public static final char reduce(@yfb char[] cArr, @yfb gz6<? super Character, ? super Character, Character> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (cArr.length != 0) {
            char cCharValue = cArr[0];
            int lastIndex = getLastIndex(cArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    cCharValue = gz6Var.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[i])).charValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final char reduceIndexed(@yfb char[] cArr, @yfb kz6<? super Integer, ? super Character, ? super Character, Character> kz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (cArr.length != 0) {
            char cCharValue = cArr[0];
            int lastIndex = getLastIndex(cArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    cCharValue = kz6Var.invoke(Integer.valueOf(i), Character.valueOf(cCharValue), Character.valueOf(cArr[i])).charValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void reverse(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        int length = (cArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(cArr);
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            char c = cArr[i];
            cArr[i] = cArr[lastIndex];
            cArr[lastIndex] = c;
            lastIndex--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> runningFold(char[] cArr, R r, gz6<? super R, ? super Character, ? extends R> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (cArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r);
        for (char c : cArr) {
            r = gz6Var.invoke(r, Character.valueOf(c));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final <R> List<R> runningFoldIndexed(char[] cArr, R r, kz6<? super Integer, ? super R, ? super Character, ? extends R> kz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (cArr.length == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r);
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Character.valueOf(cArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    public static final byte single(@yfb byte[] bArr, @yfb qy6<? super Byte, Boolean> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Byte bValueOf = null;
        boolean z = false;
        for (byte b : bArr) {
            if (qy6Var.invoke(Byte.valueOf(b)).booleanValue()) {
                if (!z) {
                    bValueOf = Byte.valueOf(b);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            md8.checkNotNull(bValueOf, "null cannot be cast to non-null type kotlin.Byte");
            return bValueOf.byteValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final boolean first(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (boolean z : zArr) {
            if (qy6Var.invoke(Boolean.valueOf(z)).booleanValue()) {
                return z;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @yfb
    public static final <A extends Appendable> A joinTo(@yfb double[] dArr, @yfb A a, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super Double, ? extends CharSequence> qy6Var) throws IOException {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(a, "buffer");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (double d : dArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (qy6Var != null) {
                a.append(qy6Var.invoke(Double.valueOf(d)));
            } else {
                a.append(String.valueOf(d));
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @gib
    @jjf(version = "1.4")
    public static final Boolean maxWithOrNull(@yfb boolean[] zArr, @yfb Comparator<? super Boolean> comparator) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int lastIndex = getLastIndex(zArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                boolean z2 = zArr[i];
                if (comparator.compare(Boolean.valueOf(z), Boolean.valueOf(z2)) < 0) {
                    z = z2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Boolean.valueOf(z);
    }

    @gib
    @jjf(version = "1.4")
    public static final Boolean minWithOrNull(@yfb boolean[] zArr, @yfb Comparator<? super Boolean> comparator) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int lastIndex = getLastIndex(zArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                boolean z2 = zArr[i];
                if (comparator.compare(Boolean.valueOf(z), Boolean.valueOf(z2)) > 0) {
                    z = z2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Boolean.valueOf(z);
    }

    @yfb
    public static final boolean[] sliceArray(@yfb boolean[] zArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? new boolean[0] : u70.copyOfRange(zArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1);
    }

    @yfb
    public static final <K> List<Boolean> distinctBy(@yfb boolean[] zArr, @yfb qy6<? super Boolean, ? extends K> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (boolean z : zArr) {
            if (hashSet.add(qy6Var.invoke(Boolean.valueOf(z)))) {
                arrayList.add(Boolean.valueOf(z));
            }
        }
        return arrayList;
    }

    @yfb
    public static final <K, M extends Map<? super K, List<Double>>> M groupByTo(@yfb double[] dArr, @yfb M m, @yfb qy6<? super Double, ? extends K> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (double d : dArr) {
            K kInvoke = qy6Var.invoke(Double.valueOf(d));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Double.valueOf(d));
        }
        return m;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double maxOf(boolean[] zArr, qy6<? super Boolean, Double> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length != 0) {
            double dDoubleValue = qy6Var.invoke(Boolean.valueOf(zArr[0])).doubleValue();
            int lastIndex = getLastIndex(zArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Boolean.valueOf(zArr[i])).doubleValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m28767maxOfOrNull(boolean[] zArr, qy6<? super Boolean, Double> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int lastIndex = getLastIndex(zArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Boolean.valueOf(zArr[i])).doubleValue());
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
    private static final <R> R maxOfWith(boolean[] zArr, Comparator<? super R> comparator, qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length != 0) {
            R rInvoke = qy6Var.invoke(Boolean.valueOf(zArr[0]));
            int lastIndex = getLastIndex(zArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Boolean.valueOf(zArr[i]));
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
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "maxWithOrThrow")
    public static final boolean maxWithOrThrow(@yfb boolean[] zArr, @yfb Comparator<? super Boolean> comparator) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (zArr.length != 0) {
            boolean z = zArr[0];
            int lastIndex = getLastIndex(zArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    boolean z2 = zArr[i];
                    if (comparator.compare(Boolean.valueOf(z), Boolean.valueOf(z2)) < 0) {
                        z = z2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return z;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double minOf(boolean[] zArr, qy6<? super Boolean, Double> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length != 0) {
            double dDoubleValue = qy6Var.invoke(Boolean.valueOf(zArr[0])).doubleValue();
            int lastIndex = getLastIndex(zArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Boolean.valueOf(zArr[i])).doubleValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m28803minOfOrNull(boolean[] zArr, qy6<? super Boolean, Double> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int lastIndex = getLastIndex(zArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Boolean.valueOf(zArr[i])).doubleValue());
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
    private static final <R> R minOfWith(boolean[] zArr, Comparator<? super R> comparator, qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length != 0) {
            R rInvoke = qy6Var.invoke(Boolean.valueOf(zArr[0]));
            int lastIndex = getLastIndex(zArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Boolean.valueOf(zArr[i]));
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
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minWithOrThrow")
    public static final boolean minWithOrThrow(@yfb boolean[] zArr, @yfb Comparator<? super Boolean> comparator) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (zArr.length != 0) {
            boolean z = zArr[0];
            int lastIndex = getLastIndex(zArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    boolean z2 = zArr[i];
                    if (comparator.compare(Boolean.valueOf(z), Boolean.valueOf(z2)) > 0) {
                        z = z2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return z;
        }
        throw new NoSuchElementException();
    }

    @yfb
    public static final scc<List<Double>, List<Double>> partition(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (double d : dArr) {
            if (qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                arrayList.add(Double.valueOf(d));
            } else {
                arrayList2.add(Double.valueOf(d));
            }
        }
        return new scc<>(arrayList, arrayList2);
    }

    @jjf(version = "1.4")
    @t28
    private static final List<Boolean> runningReduce(boolean[] zArr, gz6<? super Boolean, ? super Boolean, Boolean> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (zArr.length == 0) {
            return l82.emptyList();
        }
        boolean z = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z));
        int length = zArr.length;
        int i = 1;
        while (i < length) {
            Boolean boolInvoke = gz6Var.invoke(Boolean.valueOf(z), Boolean.valueOf(zArr[i]));
            boolean zBooleanValue = boolInvoke.booleanValue();
            arrayList.add(boolInvoke);
            i++;
            z = zBooleanValue;
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final List<Boolean> runningReduceIndexed(boolean[] zArr, kz6<? super Integer, ? super Boolean, ? super Boolean, Boolean> kz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (zArr.length == 0) {
            return l82.emptyList();
        }
        boolean z = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z));
        int length = zArr.length;
        int i = 1;
        while (i < length) {
            Boolean boolInvoke = kz6Var.invoke(Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(zArr[i]));
            boolean zBooleanValue = boolInvoke.booleanValue();
            arrayList.add(boolInvoke);
            i++;
            z = zBooleanValue;
        }
        return arrayList;
    }

    @yfb
    public static final List<Double> take(@yfb double[] dArr, int i) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        if (i >= dArr.length) {
            return toList(dArr);
        }
        if (i == 1) {
            return k82.listOf(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Double> takeLast(@yfb double[] dArr, int i) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        int length = dArr.length;
        if (i >= length) {
            return toList(dArr);
        }
        if (i == 1) {
            return k82.listOf(Double.valueOf(dArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(Double.valueOf(dArr[i2]));
        }
        return arrayList;
    }

    public static final char first(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (char c : cArr) {
            if (qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                return c;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final long last(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                long j = jArr[length];
                if (!qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return j;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Float maxByOrNull(@yfb float[] fArr, @yfb qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f);
        }
        R rInvoke = qy6Var.invoke(Float.valueOf(f));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                float f2 = fArr[i];
                R rInvoke2 = qy6Var.invoke(Float.valueOf(f2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    f = f2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(f);
    }

    @gib
    @jjf(version = "1.4")
    public static final Double maxOrNull(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dMax = dArr[0];
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dMax = Math.max(dMax, dArr[i]);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dMax);
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Float minByOrNull(@yfb float[] fArr, @yfb qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f);
        }
        R rInvoke = qy6Var.invoke(Float.valueOf(f));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                float f2 = fArr[i];
                R rInvoke2 = qy6Var.invoke(Float.valueOf(f2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    f = f2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(f);
    }

    @gib
    @jjf(version = "1.4")
    public static final Double minOrNull(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dMin = dArr[0];
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dMin = Math.min(dMin, dArr[i]);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dMin);
    }

    @yfb
    public static final List<Float> slice(@yfb float[] fArr, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(iterable, "indices");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(fArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @yfb
    public static final char[] sliceArray(@yfb char[] cArr, @yfb f78 f78Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? new char[0] : u70.copyOfRange(cArr, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1);
    }

    @yfb
    public static final <R, V> List<V> zip(@yfb long[] jArr, @yfb Iterable<? extends R> iterable, @yfb gz6<? super Long, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(gz6Var.invoke(Long.valueOf(jArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @yfb
    public static final <K, V> Map<K, V> associateBy(@yfb short[] sArr, @yfb qy6<? super Short, ? extends K> qy6Var, @yfb qy6<? super Short, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(sArr.length), 16));
        for (short s : sArr) {
            linkedHashMap.put(qy6Var.invoke(Short.valueOf(s)), qy6Var2.invoke(Short.valueOf(s)));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow")
    public static final double maxOrThrow(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            double dMax = dArr[0];
            int lastIndex = getLastIndex(dArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dMax = Math.max(dMax, dArr[i]);
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dMax;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow")
    public static final double minOrThrow(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            double dMin = dArr[0];
            int lastIndex = getLastIndex(dArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dMin = Math.min(dMin, dArr[i]);
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dMin;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.4")
    public static final void shuffle(@yfb boolean[] zArr, @yfb tod todVar) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        for (int lastIndex = getLastIndex(zArr); lastIndex > 0; lastIndex--) {
            int iNextInt = todVar.nextInt(lastIndex + 1);
            boolean z = zArr[lastIndex];
            zArr[lastIndex] = zArr[iNextInt];
            zArr[iNextInt] = z;
        }
    }

    @jjf(version = "1.4")
    public static final <T> void reverse(@yfb T[] tArr, int i, int i2) {
        md8.checkNotNullParameter(tArr, "<this>");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, tArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            T t = tArr[i];
            tArr[i] = tArr[i4];
            tArr[i4] = t;
            i4--;
            i++;
        }
    }

    public static final short single(@yfb short[] sArr, @yfb qy6<? super Short, Boolean> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Short shValueOf = null;
        boolean z = false;
        for (short s : sArr) {
            if (qy6Var.invoke(Short.valueOf(s)).booleanValue()) {
                if (!z) {
                    shValueOf = Short.valueOf(s);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            md8.checkNotNull(shValueOf, "null cannot be cast to non-null type kotlin.Short");
            return shValueOf.shortValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float last(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                float f = fArr[length];
                if (!qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return f;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @gib
    @jjf(version = "1.4")
    public static final Character maxWithOrNull(@yfb char[] cArr, @yfb Comparator<? super Character> comparator) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        int lastIndex = getLastIndex(cArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c2 = cArr[i];
                if (comparator.compare(Character.valueOf(c), Character.valueOf(c2)) < 0) {
                    c = c2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(c);
    }

    @gib
    @jjf(version = "1.4")
    public static final Character minWithOrNull(@yfb char[] cArr, @yfb Comparator<? super Character> comparator) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        int lastIndex = getLastIndex(cArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c2 = cArr[i];
                if (comparator.compare(Character.valueOf(c), Character.valueOf(c2)) > 0) {
                    c = c2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(c);
    }

    @yfb
    public static final <R, V> List<V> zip(@yfb float[] fArr, @yfb Iterable<? extends R> iterable, @yfb gz6<? super Float, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(gz6Var.invoke(Float.valueOf(fArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @yfb
    public static final <K, V> Map<K, V> associateBy(@yfb int[] iArr, @yfb qy6<? super Integer, ? extends K> qy6Var, @yfb qy6<? super Integer, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(iArr.length), 16));
        for (int i : iArr) {
            linkedHashMap.put(qy6Var.invoke(Integer.valueOf(i)), qy6Var2.invoke(Integer.valueOf(i)));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K> List<Character> distinctBy(@yfb char[] cArr, @yfb qy6<? super Character, ? extends K> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (char c : cArr) {
            if (hashSet.add(qy6Var.invoke(Character.valueOf(c)))) {
                arrayList.add(Character.valueOf(c));
            }
        }
        return arrayList;
    }

    @yfb
    public static final <K> Map<K, List<Double>> groupBy(@yfb double[] dArr, @yfb qy6<? super Double, ? extends K> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d : dArr) {
            K kInvoke = qy6Var.invoke(Double.valueOf(d));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Double.valueOf(d));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <A extends Appendable> A joinTo(@yfb boolean[] zArr, @yfb A a, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super Boolean, ? extends CharSequence> qy6Var) throws IOException {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(a, "buffer");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (boolean z : zArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (qy6Var != null) {
                a.append(qy6Var.invoke(Boolean.valueOf(z)));
            } else {
                a.append(String.valueOf(z));
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @jjf(version = "1.7")
    @xn8(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> double maxByOrThrow(@yfb double[] dArr, @yfb qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length != 0) {
            double d = dArr[0];
            int lastIndex = getLastIndex(dArr);
            if (lastIndex == 0) {
                return d;
            }
            R rInvoke = qy6Var.invoke(Double.valueOf(d));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    double d2 = dArr[i];
                    R rInvoke2 = qy6Var.invoke(Double.valueOf(d2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        d = d2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return d;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double maxOf(char[] cArr, qy6<? super Character, Double> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length != 0) {
            double dDoubleValue = qy6Var.invoke(Character.valueOf(cArr[0])).doubleValue();
            int lastIndex = getLastIndex(cArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Character.valueOf(cArr[i])).doubleValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m28760maxOfOrNull(char[] cArr, qy6<? super Character, Double> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Character.valueOf(cArr[0])).doubleValue();
        int lastIndex = getLastIndex(cArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Character.valueOf(cArr[i])).doubleValue());
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
    private static final <R> R maxOfWith(char[] cArr, Comparator<? super R> comparator, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length != 0) {
            R rInvoke = qy6Var.invoke(Character.valueOf(cArr[0]));
            int lastIndex = getLastIndex(cArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Character.valueOf(cArr[i]));
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
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "maxWithOrThrow")
    public static final char maxWithOrThrow(@yfb char[] cArr, @yfb Comparator<? super Character> comparator) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (cArr.length != 0) {
            char c = cArr[0];
            int lastIndex = getLastIndex(cArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    char c2 = cArr[i];
                    if (comparator.compare(Character.valueOf(c), Character.valueOf(c2)) < 0) {
                        c = c2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return c;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> double minByOrThrow(@yfb double[] dArr, @yfb qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length != 0) {
            double d = dArr[0];
            int lastIndex = getLastIndex(dArr);
            if (lastIndex == 0) {
                return d;
            }
            R rInvoke = qy6Var.invoke(Double.valueOf(d));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    double d2 = dArr[i];
                    R rInvoke2 = qy6Var.invoke(Double.valueOf(d2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        d = d2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return d;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double minOf(char[] cArr, qy6<? super Character, Double> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length != 0) {
            double dDoubleValue = qy6Var.invoke(Character.valueOf(cArr[0])).doubleValue();
            int lastIndex = getLastIndex(cArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Character.valueOf(cArr[i])).doubleValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m28796minOfOrNull(char[] cArr, qy6<? super Character, Double> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Character.valueOf(cArr[0])).doubleValue();
        int lastIndex = getLastIndex(cArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Character.valueOf(cArr[i])).doubleValue());
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
    private static final <R> R minOfWith(char[] cArr, Comparator<? super R> comparator, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length != 0) {
            R rInvoke = qy6Var.invoke(Character.valueOf(cArr[0]));
            int lastIndex = getLastIndex(cArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Character.valueOf(cArr[i]));
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
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minWithOrThrow")
    public static final char minWithOrThrow(@yfb char[] cArr, @yfb Comparator<? super Character> comparator) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (cArr.length != 0) {
            char c = cArr[0];
            int lastIndex = getLastIndex(cArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    char c2 = cArr[i];
                    if (comparator.compare(Character.valueOf(c), Character.valueOf(c2)) > 0) {
                        c = c2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return c;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.4")
    @t28
    private static final List<Character> runningReduce(char[] cArr, gz6<? super Character, ? super Character, Character> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (cArr.length == 0) {
            return l82.emptyList();
        }
        char c = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c));
        int length = cArr.length;
        int i = 1;
        while (i < length) {
            Character chInvoke = gz6Var.invoke(Character.valueOf(c), Character.valueOf(cArr[i]));
            char cCharValue = chInvoke.charValue();
            arrayList.add(chInvoke);
            i++;
            c = cCharValue;
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @t28
    private static final List<Character> runningReduceIndexed(char[] cArr, kz6<? super Integer, ? super Character, ? super Character, Character> kz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (cArr.length == 0) {
            return l82.emptyList();
        }
        char c = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c));
        int length = cArr.length;
        int i = 1;
        while (i < length) {
            Character chInvoke = kz6Var.invoke(Integer.valueOf(i), Character.valueOf(c), Character.valueOf(cArr[i]));
            char cCharValue = chInvoke.charValue();
            arrayList.add(chInvoke);
            i++;
            c = cCharValue;
        }
        return arrayList;
    }

    @yfb
    public static final List<Double> slice(@yfb double[] dArr, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(iterable, "indices");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(dArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @yfb
    public static final <K, M extends Map<? super K, List<Boolean>>> M groupByTo(@yfb boolean[] zArr, @yfb M m, @yfb qy6<? super Boolean, ? extends K> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (boolean z : zArr) {
            K kInvoke = qy6Var.invoke(Boolean.valueOf(z));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Boolean.valueOf(z));
        }
        return m;
    }

    @gib
    @jjf(version = "1.4")
    public static final Character maxOrNull(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        int lastIndex = getLastIndex(cArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c2 = cArr[i];
                if (md8.compare((int) c, (int) c2) < 0) {
                    c = c2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(c);
    }

    @gib
    @jjf(version = "1.4")
    public static final Character minOrNull(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        int lastIndex = getLastIndex(cArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c2 = cArr[i];
                if (md8.compare((int) c, (int) c2) > 0) {
                    c = c2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(c);
    }

    @yfb
    public static final scc<List<Boolean>, List<Boolean>> partition(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean z : zArr) {
            if (qy6Var.invoke(Boolean.valueOf(z)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z));
            } else {
                arrayList2.add(Boolean.valueOf(z));
            }
        }
        return new scc<>(arrayList, arrayList2);
    }

    @jjf(version = "1.4")
    public static final void shuffle(@yfb char[] cArr, @yfb tod todVar) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        for (int lastIndex = getLastIndex(cArr); lastIndex > 0; lastIndex--) {
            int iNextInt = todVar.nextInt(lastIndex + 1);
            char c = cArr[lastIndex];
            cArr[lastIndex] = cArr[iNextInt];
            cArr[iNextInt] = c;
        }
    }

    @yfb
    public static final List<Boolean> take(@yfb boolean[] zArr, int i) {
        md8.checkNotNullParameter(zArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        if (i >= zArr.length) {
            return toList(zArr);
        }
        if (i == 1) {
            return k82.listOf(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Boolean> takeLast(@yfb boolean[] zArr, int i) {
        md8.checkNotNullParameter(zArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        int length = zArr.length;
        if (i >= length) {
            return toList(zArr);
        }
        if (i == 1) {
            return k82.listOf(Boolean.valueOf(zArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(Boolean.valueOf(zArr[i2]));
        }
        return arrayList;
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow")
    public static final char maxOrThrow(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            char c = cArr[0];
            int lastIndex = getLastIndex(cArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    char c2 = cArr[i];
                    if (md8.compare((int) c, (int) c2) < 0) {
                        c = c2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return c;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow")
    public static final char minOrThrow(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            char c = cArr[0];
            int lastIndex = getLastIndex(cArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    char c2 = cArr[i];
                    if (md8.compare((int) c, (int) c2) > 0) {
                        c = c2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return c;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.4")
    public static void reverse(@yfb byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "<this>");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, bArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            byte b = bArr[i];
            bArr[i] = bArr[i4];
            bArr[i4] = b;
            i4--;
            i++;
        }
    }

    public static final double last(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                double d = dArr[length];
                if (!qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return d;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @yfb
    public static final <R, V> List<V> zip(@yfb double[] dArr, @yfb Iterable<? extends R> iterable, @yfb gz6<? super Double, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(gz6Var.invoke(Double.valueOf(dArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @yfb
    public static final <K, V> Map<K, V> associateBy(@yfb long[] jArr, @yfb qy6<? super Long, ? extends K> qy6Var, @yfb qy6<? super Long, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(jArr.length), 16));
        for (long j : jArr) {
            linkedHashMap.put(qy6Var.invoke(Long.valueOf(j)), qy6Var2.invoke(Long.valueOf(j)));
        }
        return linkedHashMap;
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Double maxByOrNull(@yfb double[] dArr, @yfb qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d);
        }
        R rInvoke = qy6Var.invoke(Double.valueOf(d));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                double d2 = dArr[i];
                R rInvoke2 = qy6Var.invoke(Double.valueOf(d2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    d = d2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(d);
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Double minByOrNull(@yfb double[] dArr, @yfb qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d);
        }
        R rInvoke = qy6Var.invoke(Double.valueOf(d));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                double d2 = dArr[i];
                R rInvoke2 = qy6Var.invoke(Double.valueOf(d2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    d = d2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(d);
    }

    public static final int single(@yfb int[] iArr, @yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Integer numValueOf = null;
        boolean z = false;
        for (int i : iArr) {
            if (qy6Var.invoke(Integer.valueOf(i)).booleanValue()) {
                if (!z) {
                    numValueOf = Integer.valueOf(i);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            md8.checkNotNull(numValueOf, "null cannot be cast to non-null type kotlin.Int");
            return numValueOf.intValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @yfb
    public static final List<Boolean> slice(@yfb boolean[] zArr, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(iterable, "indices");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(zArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <T> float m28747maxOf(T[] tArr, qy6<? super T, Float> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length != 0) {
            float fFloatValue = qy6Var.invoke(tArr[0]).floatValue();
            int lastIndex = getLastIndex(tArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, qy6Var.invoke(tArr[i]).floatValue());
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
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Float m28774maxOfOrNull(T[] tArr, qy6<? super T, Float> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(tArr[0]).floatValue();
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, qy6Var.invoke(tArr[i]).floatValue());
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <T> float m28783minOf(T[] tArr, qy6<? super T, Float> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length != 0) {
            float fFloatValue = qy6Var.invoke(tArr[0]).floatValue();
            int lastIndex = getLastIndex(tArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, qy6Var.invoke(tArr[i]).floatValue());
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
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Float m28810minOfOrNull(T[] tArr, qy6<? super T, Float> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(tArr[0]).floatValue();
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, qy6Var.invoke(tArr[i]).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @yfb
    public static final <A extends Appendable> A joinTo(@yfb char[] cArr, @yfb A a, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super Character, ? extends CharSequence> qy6Var) throws IOException {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(a, "buffer");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (char c : cArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (qy6Var != null) {
                a.append(qy6Var.invoke(Character.valueOf(c)));
            } else {
                a.append(c);
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final boolean last(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                boolean z = zArr[length];
                if (!qy6Var.invoke(Boolean.valueOf(z)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return z;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @jjf(version = "1.4")
    public static void reverse(@yfb short[] sArr, int i, int i2) {
        md8.checkNotNullParameter(sArr, "<this>");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, sArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            short s = sArr[i];
            sArr[i] = sArr[i4];
            sArr[i4] = s;
            i4--;
            i++;
        }
    }

    @yfb
    public static final <R, V> List<V> zip(@yfb boolean[] zArr, @yfb Iterable<? extends R> iterable, @yfb gz6<? super Boolean, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(gz6Var.invoke(Boolean.valueOf(zArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @yfb
    public static final <K, V> Map<K, V> associateBy(@yfb float[] fArr, @yfb qy6<? super Float, ? extends K> qy6Var, @yfb qy6<? super Float, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(fArr.length), 16));
        for (float f : fArr) {
            linkedHashMap.put(qy6Var.invoke(Float.valueOf(f)), qy6Var2.invoke(Float.valueOf(f)));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K> Map<K, List<Boolean>> groupBy(@yfb boolean[] zArr, @yfb qy6<? super Boolean, ? extends K> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z : zArr) {
            K kInvoke = qy6Var.invoke(Boolean.valueOf(z));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Boolean.valueOf(z));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(@yfb char[] cArr, @yfb M m, @yfb qy6<? super Character, ? extends K> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (char c : cArr) {
            K kInvoke = qy6Var.invoke(Character.valueOf(c));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(c));
        }
        return m;
    }

    @jjf(version = "1.7")
    @xn8(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> boolean maxByOrThrow(@yfb boolean[] zArr, @yfb qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length != 0) {
            boolean z = zArr[0];
            int lastIndex = getLastIndex(zArr);
            if (lastIndex == 0) {
                return z;
            }
            R rInvoke = qy6Var.invoke(Boolean.valueOf(z));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    boolean z2 = zArr[i];
                    R rInvoke2 = qy6Var.invoke(Boolean.valueOf(z2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        z = z2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return z;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> boolean minByOrThrow(@yfb boolean[] zArr, @yfb qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length != 0) {
            boolean z = zArr[0];
            int lastIndex = getLastIndex(zArr);
            if (lastIndex == 0) {
                return z;
            }
            R rInvoke = qy6Var.invoke(Boolean.valueOf(z));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    boolean z2 = zArr[i];
                    R rInvoke2 = qy6Var.invoke(Boolean.valueOf(z2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        z = z2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return z;
        }
        throw new NoSuchElementException();
    }

    @yfb
    public static final scc<List<Character>, List<Character>> partition(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (char c : cArr) {
            if (qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                arrayList.add(Character.valueOf(c));
            } else {
                arrayList2.add(Character.valueOf(c));
            }
        }
        return new scc<>(arrayList, arrayList2);
    }

    @yfb
    public static final List<Character> take(@yfb char[] cArr, int i) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        if (i >= cArr.length) {
            return toList(cArr);
        }
        if (i == 1) {
            return k82.listOf(Character.valueOf(cArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (char c : cArr) {
            arrayList.add(Character.valueOf(c));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @yfb
    public static final List<Character> takeLast(@yfb char[] cArr, int i) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        int length = cArr.length;
        if (i >= length) {
            return toList(cArr);
        }
        if (i == 1) {
            return k82.listOf(Character.valueOf(cArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(Character.valueOf(cArr[i2]));
        }
        return arrayList;
    }

    public static final long single(@yfb long[] jArr, @yfb qy6<? super Long, Boolean> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Long lValueOf = null;
        boolean z = false;
        for (long j : jArr) {
            if (qy6Var.invoke(Long.valueOf(j)).booleanValue()) {
                if (!z) {
                    lValueOf = Long.valueOf(j);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            md8.checkNotNull(lValueOf, "null cannot be cast to non-null type kotlin.Long");
            return lValueOf.longValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @yfb
    public static final List<Character> slice(@yfb char[] cArr, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(iterable, "indices");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(cArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final char last(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char c = cArr[length];
                if (!qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return c;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @yfb
    public static final <R, V> List<V> zip(@yfb char[] cArr, @yfb Iterable<? extends R> iterable, @yfb gz6<? super Character, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(gz6Var.invoke(Character.valueOf(cArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @yfb
    public static final <K, V> Map<K, V> associateBy(@yfb double[] dArr, @yfb qy6<? super Double, ? extends K> qy6Var, @yfb qy6<? super Double, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(dArr.length), 16));
        for (double d : dArr) {
            linkedHashMap.put(qy6Var.invoke(Double.valueOf(d)), qy6Var2.invoke(Double.valueOf(d)));
        }
        return linkedHashMap;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m28741maxOf(byte[] bArr, qy6<? super Byte, Float> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length != 0) {
            float fFloatValue = qy6Var.invoke(Byte.valueOf(bArr[0])).floatValue();
            int lastIndex = getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Byte.valueOf(bArr[i])).floatValue());
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
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m28768maxOfOrNull(byte[] bArr, qy6<? super Byte, Float> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Byte.valueOf(bArr[0])).floatValue();
        int lastIndex = getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Byte.valueOf(bArr[i])).floatValue());
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m28777minOf(byte[] bArr, qy6<? super Byte, Float> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length != 0) {
            float fFloatValue = qy6Var.invoke(Byte.valueOf(bArr[0])).floatValue();
            int lastIndex = getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Byte.valueOf(bArr[i])).floatValue());
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
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m28804minOfOrNull(byte[] bArr, qy6<? super Byte, Float> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Byte.valueOf(bArr[0])).floatValue();
        int lastIndex = getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Byte.valueOf(bArr[i])).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @jjf(version = "1.4")
    public static void reverse(@yfb int[] iArr, int i, int i2) {
        md8.checkNotNullParameter(iArr, "<this>");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, iArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            int i5 = iArr[i];
            iArr[i] = iArr[i4];
            iArr[i4] = i5;
            i4--;
            i++;
        }
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Boolean maxByOrNull(@yfb boolean[] zArr, @yfb qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z);
        }
        R rInvoke = qy6Var.invoke(Boolean.valueOf(z));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                boolean z2 = zArr[i];
                R rInvoke2 = qy6Var.invoke(Boolean.valueOf(z2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    z = z2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Boolean.valueOf(z);
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Boolean minByOrNull(@yfb boolean[] zArr, @yfb qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z);
        }
        R rInvoke = qy6Var.invoke(Boolean.valueOf(z));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                boolean z2 = zArr[i];
                R rInvoke2 = qy6Var.invoke(Boolean.valueOf(z2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    z = z2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(@yfb T[] tArr, @yfb M m, @yfb qy6<? super T, ? extends K> qy6Var, @yfb qy6<? super T, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (T t : tArr) {
            K kInvoke = qy6Var.invoke(t);
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qy6Var2.invoke(t));
        }
        return m;
    }

    @yfb
    public static final <V> List<V> zip(@yfb byte[] bArr, @yfb byte[] bArr2, @yfb gz6<? super Byte, ? super Byte, ? extends V> gz6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(bArr2, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(bArr.length, bArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Byte.valueOf(bArr[i]), Byte.valueOf(bArr2[i])));
        }
        return arrayList;
    }

    @yfb
    public static final <K, V> Map<K, V> associateBy(@yfb boolean[] zArr, @yfb qy6<? super Boolean, ? extends K> qy6Var, @yfb qy6<? super Boolean, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(zArr.length), 16));
        for (boolean z : zArr) {
            linkedHashMap.put(qy6Var.invoke(Boolean.valueOf(z)), qy6Var2.invoke(Boolean.valueOf(z)));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K> Map<K, List<Character>> groupBy(@yfb char[] cArr, @yfb qy6<? super Character, ? extends K> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c : cArr) {
            K kInvoke = qy6Var.invoke(Character.valueOf(c));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(c));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.7")
    @xn8(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char maxByOrThrow(@yfb char[] cArr, @yfb qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length != 0) {
            char c = cArr[0];
            int lastIndex = getLastIndex(cArr);
            if (lastIndex == 0) {
                return c;
            }
            R rInvoke = qy6Var.invoke(Character.valueOf(c));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    char c2 = cArr[i];
                    R rInvoke2 = qy6Var.invoke(Character.valueOf(c2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        c = c2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return c;
        }
        throw new NoSuchElementException();
    }

    @jjf(version = "1.7")
    @xn8(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char minByOrThrow(@yfb char[] cArr, @yfb qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length != 0) {
            char c = cArr[0];
            int lastIndex = getLastIndex(cArr);
            if (lastIndex == 0) {
                return c;
            }
            R rInvoke = qy6Var.invoke(Character.valueOf(c));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    char c2 = cArr[i];
                    R rInvoke2 = qy6Var.invoke(Character.valueOf(c2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        c = c2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return c;
        }
        throw new NoSuchElementException();
    }

    public static final float single(@yfb float[] fArr, @yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Float fValueOf = null;
        boolean z = false;
        for (float f : fArr) {
            if (qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                if (!z) {
                    fValueOf = Float.valueOf(f);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            md8.checkNotNull(fValueOf, "null cannot be cast to non-null type kotlin.Float");
            return fValueOf.floatValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @jjf(version = "1.4")
    public static void reverse(@yfb long[] jArr, int i, int i2) {
        md8.checkNotNullParameter(jArr, "<this>");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, jArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            long j = jArr[i];
            jArr[i] = jArr[i4];
            jArr[i4] = j;
            i4--;
            i++;
        }
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m28748maxOf(short[] sArr, qy6<? super Short, Float> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length != 0) {
            float fFloatValue = qy6Var.invoke(Short.valueOf(sArr[0])).floatValue();
            int lastIndex = getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Short.valueOf(sArr[i])).floatValue());
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
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m28775maxOfOrNull(short[] sArr, qy6<? super Short, Float> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Short.valueOf(sArr[0])).floatValue();
        int lastIndex = getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Short.valueOf(sArr[i])).floatValue());
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m28784minOf(short[] sArr, qy6<? super Short, Float> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length != 0) {
            float fFloatValue = qy6Var.invoke(Short.valueOf(sArr[0])).floatValue();
            int lastIndex = getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Short.valueOf(sArr[i])).floatValue());
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
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m28811minOfOrNull(short[] sArr, qy6<? super Short, Float> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Short.valueOf(sArr[0])).floatValue();
        int lastIndex = getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Short.valueOf(sArr[i])).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @yfb
    public static final <V> List<V> zip(@yfb short[] sArr, @yfb short[] sArr2, @yfb gz6<? super Short, ? super Short, ? extends V> gz6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(sArr2, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(sArr.length, sArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Short.valueOf(sArr[i]), Short.valueOf(sArr2[i])));
        }
        return arrayList;
    }

    @yfb
    public static final <K, V> Map<K, V> associateBy(@yfb char[] cArr, @yfb qy6<? super Character, ? extends K> qy6Var, @yfb qy6<? super Character, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(cArr.length), 16));
        for (char c : cArr) {
            linkedHashMap.put(qy6Var.invoke(Character.valueOf(c)), qy6Var2.invoke(Character.valueOf(c)));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <V> List<V> zip(@yfb int[] iArr, @yfb int[] iArr2, @yfb gz6<? super Integer, ? super Integer, ? extends V> gz6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(iArr2, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(iArr.length, iArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(iArr[i]), Integer.valueOf(iArr2[i])));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@yfb byte[] bArr, @yfb M m, @yfb qy6<? super Byte, ? extends K> qy6Var, @yfb qy6<? super Byte, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (byte b : bArr) {
            K kInvoke = qy6Var.invoke(Byte.valueOf(b));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qy6Var2.invoke(Byte.valueOf(b)));
        }
        return m;
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Character maxByOrNull(@yfb char[] cArr, @yfb qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c);
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(c));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c2 = cArr[i];
                R rInvoke2 = qy6Var.invoke(Character.valueOf(c2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    c = c2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(c);
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Character minByOrNull(@yfb char[] cArr, @yfb qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c);
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(c));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c2 = cArr[i];
                R rInvoke2 = qy6Var.invoke(Character.valueOf(c2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    c = c2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(c);
    }

    @jjf(version = "1.4")
    public static final void reverse(@yfb float[] fArr, int i, int i2) {
        md8.checkNotNullParameter(fArr, "<this>");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, fArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            float f = fArr[i];
            fArr[i] = fArr[i4];
            fArr[i4] = f;
            i4--;
            i++;
        }
    }

    public static final double single(@yfb double[] dArr, @yfb qy6<? super Double, Boolean> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Double dValueOf = null;
        boolean z = false;
        for (double d : dArr) {
            if (qy6Var.invoke(Double.valueOf(d)).booleanValue()) {
                if (!z) {
                    dValueOf = Double.valueOf(d);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            md8.checkNotNull(dValueOf, "null cannot be cast to non-null type kotlin.Double");
            return dValueOf.doubleValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <T, K, V> Map<K, List<V>> groupBy(@yfb T[] tArr, @yfb qy6<? super T, ? extends K> qy6Var, @yfb qy6<? super T, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC0000a interfaceC0000a : tArr) {
            K kInvoke = qy6Var.invoke(interfaceC0000a);
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(qy6Var2.invoke(interfaceC0000a));
        }
        return linkedHashMap;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m28745maxOf(int[] iArr, qy6<? super Integer, Float> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length != 0) {
            float fFloatValue = qy6Var.invoke(Integer.valueOf(iArr[0])).floatValue();
            int lastIndex = getLastIndex(iArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Integer.valueOf(iArr[i])).floatValue());
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
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m28772maxOfOrNull(int[] iArr, qy6<? super Integer, Float> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Integer.valueOf(iArr[0])).floatValue();
        int lastIndex = getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Integer.valueOf(iArr[i])).floatValue());
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m28781minOf(int[] iArr, qy6<? super Integer, Float> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length != 0) {
            float fFloatValue = qy6Var.invoke(Integer.valueOf(iArr[0])).floatValue();
            int lastIndex = getLastIndex(iArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Integer.valueOf(iArr[i])).floatValue());
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
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m28808minOfOrNull(int[] iArr, qy6<? super Integer, Float> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Integer.valueOf(iArr[0])).floatValue();
        int lastIndex = getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Integer.valueOf(iArr[i])).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @yfb
    public static final <V> List<V> zip(@yfb long[] jArr, @yfb long[] jArr2, @yfb gz6<? super Long, ? super Long, ? extends V> gz6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(jArr2, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(jArr.length, jArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Long.valueOf(jArr[i]), Long.valueOf(jArr2[i])));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    public static final void reverse(@yfb double[] dArr, int i, int i2) {
        md8.checkNotNullParameter(dArr, "<this>");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, dArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            double d = dArr[i];
            dArr[i] = dArr[i4];
            dArr[i4] = d;
            i4--;
            i++;
        }
    }

    @yfb
    public static final <V> List<V> zip(@yfb float[] fArr, @yfb float[] fArr2, @yfb gz6<? super Float, ? super Float, ? extends V> gz6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(fArr2, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(fArr.length, fArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Float.valueOf(fArr[i]), Float.valueOf(fArr2[i])));
        }
        return arrayList;
    }

    public static final boolean single(@yfb boolean[] zArr, @yfb qy6<? super Boolean, Boolean> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Boolean boolValueOf = null;
        boolean z = false;
        for (boolean z2 : zArr) {
            if (qy6Var.invoke(Boolean.valueOf(z2)).booleanValue()) {
                if (!z) {
                    boolValueOf = Boolean.valueOf(z2);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            md8.checkNotNull(boolValueOf, "null cannot be cast to non-null type kotlin.Boolean");
            return boolValueOf.booleanValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@yfb short[] sArr, @yfb M m, @yfb qy6<? super Short, ? extends K> qy6Var, @yfb qy6<? super Short, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (short s : sArr) {
            K kInvoke = qy6Var.invoke(Short.valueOf(s));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qy6Var2.invoke(Short.valueOf(s)));
        }
        return m;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m28746maxOf(long[] jArr, qy6<? super Long, Float> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length != 0) {
            float fFloatValue = qy6Var.invoke(Long.valueOf(jArr[0])).floatValue();
            int lastIndex = getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Long.valueOf(jArr[i])).floatValue());
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
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m28773maxOfOrNull(long[] jArr, qy6<? super Long, Float> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Long.valueOf(jArr[0])).floatValue();
        int lastIndex = getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Long.valueOf(jArr[i])).floatValue());
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m28782minOf(long[] jArr, qy6<? super Long, Float> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length != 0) {
            float fFloatValue = qy6Var.invoke(Long.valueOf(jArr[0])).floatValue();
            int lastIndex = getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Long.valueOf(jArr[i])).floatValue());
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
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m28809minOfOrNull(long[] jArr, qy6<? super Long, Float> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Long.valueOf(jArr[0])).floatValue();
        int lastIndex = getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Long.valueOf(jArr[i])).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @yfb
    public static final <V> List<V> zip(@yfb double[] dArr, @yfb double[] dArr2, @yfb gz6<? super Double, ? super Double, ? extends V> gz6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(dArr2, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(dArr.length, dArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Double.valueOf(dArr[i]), Double.valueOf(dArr2[i])));
        }
        return arrayList;
    }

    @yfb
    public static final <K, V> Map<K, List<V>> groupBy(@yfb byte[] bArr, @yfb qy6<? super Byte, ? extends K> qy6Var, @yfb qy6<? super Byte, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b : bArr) {
            K kInvoke = qy6Var.invoke(Byte.valueOf(b));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(qy6Var2.invoke(Byte.valueOf(b)));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.4")
    public static final void reverse(@yfb boolean[] zArr, int i, int i2) {
        md8.checkNotNullParameter(zArr, "<this>");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, zArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            boolean z = zArr[i];
            zArr[i] = zArr[i4];
            zArr[i4] = z;
            i4--;
            i++;
        }
    }

    @yfb
    public static final <V> List<V> zip(@yfb boolean[] zArr, @yfb boolean[] zArr2, @yfb gz6<? super Boolean, ? super Boolean, ? extends V> gz6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(zArr2, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(zArr.length, zArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Boolean.valueOf(zArr[i]), Boolean.valueOf(zArr2[i])));
        }
        return arrayList;
    }

    public static final char single(@yfb char[] cArr, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Character chValueOf = null;
        boolean z = false;
        for (char c : cArr) {
            if (qy6Var.invoke(Character.valueOf(c)).booleanValue()) {
                if (!z) {
                    chValueOf = Character.valueOf(c);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            md8.checkNotNull(chValueOf, "null cannot be cast to non-null type kotlin.Char");
            return chValueOf.charValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@yfb int[] iArr, @yfb M m, @yfb qy6<? super Integer, ? extends K> qy6Var, @yfb qy6<? super Integer, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (int i : iArr) {
            K kInvoke = qy6Var.invoke(Integer.valueOf(i));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qy6Var2.invoke(Integer.valueOf(i)));
        }
        return m;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m28744maxOf(float[] fArr, qy6<? super Float, Float> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length != 0) {
            float fFloatValue = qy6Var.invoke(Float.valueOf(fArr[0])).floatValue();
            int lastIndex = getLastIndex(fArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Float.valueOf(fArr[i])).floatValue());
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
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m28771maxOfOrNull(float[] fArr, qy6<? super Float, Float> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Float.valueOf(fArr[0])).floatValue();
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Float.valueOf(fArr[i])).floatValue());
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m28780minOf(float[] fArr, qy6<? super Float, Float> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length != 0) {
            float fFloatValue = qy6Var.invoke(Float.valueOf(fArr[0])).floatValue();
            int lastIndex = getLastIndex(fArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Float.valueOf(fArr[i])).floatValue());
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
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m28807minOfOrNull(float[] fArr, qy6<? super Float, Float> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Float.valueOf(fArr[0])).floatValue();
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Float.valueOf(fArr[i])).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @yfb
    public static final <V> List<V> zip(@yfb char[] cArr, @yfb char[] cArr2, @yfb gz6<? super Character, ? super Character, ? extends V> gz6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(cArr2, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(cArr.length, cArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Character.valueOf(cArr[i]), Character.valueOf(cArr2[i])));
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    public static final void reverse(@yfb char[] cArr, int i, int i2) {
        md8.checkNotNullParameter(cArr, "<this>");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, cArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            char c = cArr[i];
            cArr[i] = cArr[i4];
            cArr[i4] = c;
            i4--;
            i++;
        }
    }

    @yfb
    public static <T, R> List<scc<T, R>> zip(@yfb T[] tArr, @yfb R[] rArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        int iMin = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(vkh.m24050to(tArr[i], rArr[i]));
        }
        return arrayList;
    }

    @yfb
    public static final <K, V> Map<K, List<V>> groupBy(@yfb short[] sArr, @yfb qy6<? super Short, ? extends K> qy6Var, @yfb qy6<? super Short, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s : sArr) {
            K kInvoke = qy6Var.invoke(Short.valueOf(s));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(qy6Var2.invoke(Short.valueOf(s)));
        }
        return linkedHashMap;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m28743maxOf(double[] dArr, qy6<? super Double, Float> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length != 0) {
            float fFloatValue = qy6Var.invoke(Double.valueOf(dArr[0])).floatValue();
            int lastIndex = getLastIndex(dArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Double.valueOf(dArr[i])).floatValue());
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
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m28770maxOfOrNull(double[] dArr, qy6<? super Double, Float> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Double.valueOf(dArr[0])).floatValue();
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Double.valueOf(dArr[i])).floatValue());
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m28779minOf(double[] dArr, qy6<? super Double, Float> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length != 0) {
            float fFloatValue = qy6Var.invoke(Double.valueOf(dArr[0])).floatValue();
            int lastIndex = getLastIndex(dArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Double.valueOf(dArr[i])).floatValue());
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
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m28806minOfOrNull(double[] dArr, qy6<? super Double, Float> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Double.valueOf(dArr[0])).floatValue();
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Double.valueOf(dArr[i])).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@yfb long[] jArr, @yfb M m, @yfb qy6<? super Long, ? extends K> qy6Var, @yfb qy6<? super Long, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (long j : jArr) {
            K kInvoke = qy6Var.invoke(Long.valueOf(j));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qy6Var2.invoke(Long.valueOf(j)));
        }
        return m;
    }

    @yfb
    public static final <R> List<scc<Byte, R>> zip(@yfb byte[] bArr, @yfb R[] rArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        int iMin = Math.min(bArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            byte b = bArr[i];
            arrayList.add(vkh.m24050to(Byte.valueOf(b), rArr[i]));
        }
        return arrayList;
    }

    @yfb
    public static final <K, V> Map<K, List<V>> groupBy(@yfb int[] iArr, @yfb qy6<? super Integer, ? extends K> qy6Var, @yfb qy6<? super Integer, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i : iArr) {
            K kInvoke = qy6Var.invoke(Integer.valueOf(i));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(qy6Var2.invoke(Integer.valueOf(i)));
        }
        return linkedHashMap;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m28749maxOf(boolean[] zArr, qy6<? super Boolean, Float> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length != 0) {
            float fFloatValue = qy6Var.invoke(Boolean.valueOf(zArr[0])).floatValue();
            int lastIndex = getLastIndex(zArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Boolean.valueOf(zArr[i])).floatValue());
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
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m28776maxOfOrNull(boolean[] zArr, qy6<? super Boolean, Float> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int lastIndex = getLastIndex(zArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Boolean.valueOf(zArr[i])).floatValue());
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m28785minOf(boolean[] zArr, qy6<? super Boolean, Float> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length != 0) {
            float fFloatValue = qy6Var.invoke(Boolean.valueOf(zArr[0])).floatValue();
            int lastIndex = getLastIndex(zArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Boolean.valueOf(zArr[i])).floatValue());
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
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m28812minOfOrNull(boolean[] zArr, qy6<? super Boolean, Float> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int lastIndex = getLastIndex(zArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Boolean.valueOf(zArr[i])).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @yfb
    public static final <R> List<scc<Short, R>> zip(@yfb short[] sArr, @yfb R[] rArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        int iMin = Math.min(sArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            short s = sArr[i];
            arrayList.add(vkh.m24050to(Short.valueOf(s), rArr[i]));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@yfb float[] fArr, @yfb M m, @yfb qy6<? super Float, ? extends K> qy6Var, @yfb qy6<? super Float, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (float f : fArr) {
            K kInvoke = qy6Var.invoke(Float.valueOf(f));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qy6Var2.invoke(Float.valueOf(f)));
        }
        return m;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m28742maxOf(char[] cArr, qy6<? super Character, Float> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length != 0) {
            float fFloatValue = qy6Var.invoke(Character.valueOf(cArr[0])).floatValue();
            int lastIndex = getLastIndex(cArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Character.valueOf(cArr[i])).floatValue());
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
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m28769maxOfOrNull(char[] cArr, qy6<? super Character, Float> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Character.valueOf(cArr[0])).floatValue();
        int lastIndex = getLastIndex(cArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Character.valueOf(cArr[i])).floatValue());
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m28778minOf(char[] cArr, qy6<? super Character, Float> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length != 0) {
            float fFloatValue = qy6Var.invoke(Character.valueOf(cArr[0])).floatValue();
            int lastIndex = getLastIndex(cArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Character.valueOf(cArr[i])).floatValue());
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
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m28805minOfOrNull(char[] cArr, qy6<? super Character, Float> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Character.valueOf(cArr[0])).floatValue();
        int lastIndex = getLastIndex(cArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Character.valueOf(cArr[i])).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @yfb
    public static final <R> List<scc<Integer, R>> zip(@yfb int[] iArr, @yfb R[] rArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        int iMin = Math.min(iArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            int i2 = iArr[i];
            arrayList.add(vkh.m24050to(Integer.valueOf(i2), rArr[i]));
        }
        return arrayList;
    }

    @yfb
    public static final <K, V> Map<K, List<V>> groupBy(@yfb long[] jArr, @yfb qy6<? super Long, ? extends K> qy6Var, @yfb qy6<? super Long, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j : jArr) {
            K kInvoke = qy6Var.invoke(Long.valueOf(j));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(qy6Var2.invoke(Long.valueOf(j)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@yfb double[] dArr, @yfb M m, @yfb qy6<? super Double, ? extends K> qy6Var, @yfb qy6<? super Double, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (double d : dArr) {
            K kInvoke = qy6Var.invoke(Double.valueOf(d));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qy6Var2.invoke(Double.valueOf(d)));
        }
        return m;
    }

    @yfb
    public static final <R> List<scc<Long, R>> zip(@yfb long[] jArr, @yfb R[] rArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        int iMin = Math.min(jArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            long j = jArr[i];
            arrayList.add(vkh.m24050to(Long.valueOf(j), rArr[i]));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m28756maxOf(T[] tArr, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length != 0) {
            R rInvoke = qy6Var.invoke(tArr[0]);
            int lastIndex = getLastIndex(tArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(tArr[i]);
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
    private static final <T, R extends Comparable<? super R>> R maxOfOrNull(T[] tArr, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(tArr[i]);
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m28792minOf(T[] tArr, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length != 0) {
            R rInvoke = qy6Var.invoke(tArr[0]);
            int lastIndex = getLastIndex(tArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(tArr[i]);
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
    private static final <T, R extends Comparable<? super R>> R minOfOrNull(T[] tArr, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(tArr[i]);
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

    @yfb
    public static final <K, V> Map<K, List<V>> groupBy(@yfb float[] fArr, @yfb qy6<? super Float, ? extends K> qy6Var, @yfb qy6<? super Float, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f : fArr) {
            K kInvoke = qy6Var.invoke(Float.valueOf(f));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(qy6Var2.invoke(Float.valueOf(f)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@yfb boolean[] zArr, @yfb M m, @yfb qy6<? super Boolean, ? extends K> qy6Var, @yfb qy6<? super Boolean, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (boolean z : zArr) {
            K kInvoke = qy6Var.invoke(Boolean.valueOf(z));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qy6Var2.invoke(Boolean.valueOf(z)));
        }
        return m;
    }

    @yfb
    public static final <R> List<scc<Float, R>> zip(@yfb float[] fArr, @yfb R[] rArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        int iMin = Math.min(fArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            float f = fArr[i];
            arrayList.add(vkh.m24050to(Float.valueOf(f), rArr[i]));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R extends Comparable<? super R>> R maxOfOrNull(byte[] bArr, qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Byte.valueOf(bArr[i]));
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
    private static final <R extends Comparable<? super R>> R minOfOrNull(byte[] bArr, qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Byte.valueOf(bArr[i]));
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
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m28750maxOf(byte[] bArr, qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length != 0) {
            R rInvoke = qy6Var.invoke(Byte.valueOf(bArr[0]));
            int lastIndex = getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Byte.valueOf(bArr[i]));
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m28786minOf(byte[] bArr, qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length != 0) {
            R rInvoke = qy6Var.invoke(Byte.valueOf(bArr[0]));
            int lastIndex = getLastIndex(bArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Byte.valueOf(bArr[i]));
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

    @yfb
    public static final <R> List<scc<Double, R>> zip(@yfb double[] dArr, @yfb R[] rArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        int iMin = Math.min(dArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            double d = dArr[i];
            arrayList.add(vkh.m24050to(Double.valueOf(d), rArr[i]));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R extends Comparable<? super R>> R maxOfOrNull(short[] sArr, qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Short.valueOf(sArr[i]));
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
    private static final <R extends Comparable<? super R>> R minOfOrNull(short[] sArr, qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Short.valueOf(sArr[i]));
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

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@yfb char[] cArr, @yfb M m, @yfb qy6<? super Character, ? extends K> qy6Var, @yfb qy6<? super Character, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (char c : cArr) {
            K kInvoke = qy6Var.invoke(Character.valueOf(c));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qy6Var2.invoke(Character.valueOf(c)));
        }
        return m;
    }

    @yfb
    public static final <K, V> Map<K, List<V>> groupBy(@yfb double[] dArr, @yfb qy6<? super Double, ? extends K> qy6Var, @yfb qy6<? super Double, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d : dArr) {
            K kInvoke = qy6Var.invoke(Double.valueOf(d));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(qy6Var2.invoke(Double.valueOf(d)));
        }
        return linkedHashMap;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m28757maxOf(short[] sArr, qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length != 0) {
            R rInvoke = qy6Var.invoke(Short.valueOf(sArr[0]));
            int lastIndex = getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Short.valueOf(sArr[i]));
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m28793minOf(short[] sArr, qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length != 0) {
            R rInvoke = qy6Var.invoke(Short.valueOf(sArr[0]));
            int lastIndex = getLastIndex(sArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Short.valueOf(sArr[i]));
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

    @yfb
    public static final <R> List<scc<Boolean, R>> zip(@yfb boolean[] zArr, @yfb R[] rArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        int iMin = Math.min(zArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            boolean z = zArr[i];
            arrayList.add(vkh.m24050to(Boolean.valueOf(z), rArr[i]));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R extends Comparable<? super R>> R maxOfOrNull(int[] iArr, qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Integer.valueOf(iArr[i]));
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
    private static final <R extends Comparable<? super R>> R minOfOrNull(int[] iArr, qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Integer.valueOf(iArr[i]));
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
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m28754maxOf(int[] iArr, qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length != 0) {
            R rInvoke = qy6Var.invoke(Integer.valueOf(iArr[0]));
            int lastIndex = getLastIndex(iArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Integer.valueOf(iArr[i]));
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m28790minOf(int[] iArr, qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length != 0) {
            R rInvoke = qy6Var.invoke(Integer.valueOf(iArr[0]));
            int lastIndex = getLastIndex(iArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Integer.valueOf(iArr[i]));
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

    @yfb
    public static final <R> List<scc<Character, R>> zip(@yfb char[] cArr, @yfb R[] rArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        int iMin = Math.min(cArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            char c = cArr[i];
            arrayList.add(vkh.m24050to(Character.valueOf(c), rArr[i]));
        }
        return arrayList;
    }

    @yfb
    public static final <K, V> Map<K, List<V>> groupBy(@yfb boolean[] zArr, @yfb qy6<? super Boolean, ? extends K> qy6Var, @yfb qy6<? super Boolean, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z : zArr) {
            K kInvoke = qy6Var.invoke(Boolean.valueOf(z));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(qy6Var2.invoke(Boolean.valueOf(z)));
        }
        return linkedHashMap;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R extends Comparable<? super R>> R maxOfOrNull(long[] jArr, qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Long.valueOf(jArr[i]));
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
    private static final <R extends Comparable<? super R>> R minOfOrNull(long[] jArr, qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Long.valueOf(jArr[i]));
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
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m28755maxOf(long[] jArr, qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length != 0) {
            R rInvoke = qy6Var.invoke(Long.valueOf(jArr[0]));
            int lastIndex = getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Long.valueOf(jArr[i]));
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m28791minOf(long[] jArr, qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length != 0) {
            R rInvoke = qy6Var.invoke(Long.valueOf(jArr[0]));
            int lastIndex = getLastIndex(jArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Long.valueOf(jArr[i]));
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

    @yfb
    public static final <T, R> List<scc<T, R>> zip(@yfb T[] tArr, @yfb Iterable<? extends R> iterable) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(vkh.m24050to(tArr[i], r));
            i++;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R extends Comparable<? super R>> R maxOfOrNull(float[] fArr, qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Float.valueOf(fArr[i]));
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
    private static final <R extends Comparable<? super R>> R minOfOrNull(float[] fArr, qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Float.valueOf(fArr[i]));
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

    @yfb
    public static final <K, V> Map<K, List<V>> groupBy(@yfb char[] cArr, @yfb qy6<? super Character, ? extends K> qy6Var, @yfb qy6<? super Character, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c : cArr) {
            K kInvoke = qy6Var.invoke(Character.valueOf(c));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(qy6Var2.invoke(Character.valueOf(c)));
        }
        return linkedHashMap;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m28753maxOf(float[] fArr, qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length != 0) {
            R rInvoke = qy6Var.invoke(Float.valueOf(fArr[0]));
            int lastIndex = getLastIndex(fArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Float.valueOf(fArr[i]));
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
    private static final <R extends Comparable<? super R>> R maxOfOrNull(double[] dArr, qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Double.valueOf(dArr[i]));
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m28789minOf(float[] fArr, qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length != 0) {
            R rInvoke = qy6Var.invoke(Float.valueOf(fArr[0]));
            int lastIndex = getLastIndex(fArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Float.valueOf(fArr[i]));
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
    private static final <R extends Comparable<? super R>> R minOfOrNull(double[] dArr, qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Double.valueOf(dArr[i]));
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

    @yfb
    public static final <R> List<scc<Byte, R>> zip(@yfb byte[] bArr, @yfb Iterable<? extends R> iterable) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(vkh.m24050to(Byte.valueOf(bArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R extends Comparable<? super R>> R maxOfOrNull(boolean[] zArr, qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Boolean.valueOf(zArr[i]));
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
    private static final <R extends Comparable<? super R>> R minOfOrNull(boolean[] zArr, qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Boolean.valueOf(zArr[i]));
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
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m28752maxOf(double[] dArr, qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length != 0) {
            R rInvoke = qy6Var.invoke(Double.valueOf(dArr[0]));
            int lastIndex = getLastIndex(dArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Double.valueOf(dArr[i]));
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m28788minOf(double[] dArr, qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length != 0) {
            R rInvoke = qy6Var.invoke(Double.valueOf(dArr[0]));
            int lastIndex = getLastIndex(dArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Double.valueOf(dArr[i]));
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

    @yfb
    public static final <R> List<scc<Short, R>> zip(@yfb short[] sArr, @yfb Iterable<? extends R> iterable) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(vkh.m24050to(Short.valueOf(sArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R extends Comparable<? super R>> R maxOfOrNull(char[] cArr, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Character.valueOf(cArr[i]));
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
    private static final <R extends Comparable<? super R>> R minOfOrNull(char[] cArr, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Character.valueOf(cArr[i]));
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
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m28758maxOf(boolean[] zArr, qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length != 0) {
            R rInvoke = qy6Var.invoke(Boolean.valueOf(zArr[0]));
            int lastIndex = getLastIndex(zArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Boolean.valueOf(zArr[i]));
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m28794minOf(boolean[] zArr, qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length != 0) {
            R rInvoke = qy6Var.invoke(Boolean.valueOf(zArr[0]));
            int lastIndex = getLastIndex(zArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Boolean.valueOf(zArr[i]));
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

    @yfb
    public static final <R> List<scc<Integer, R>> zip(@yfb int[] iArr, @yfb Iterable<? extends R> iterable) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(vkh.m24050to(Integer.valueOf(iArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m28751maxOf(char[] cArr, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length != 0) {
            R rInvoke = qy6Var.invoke(Character.valueOf(cArr[0]));
            int lastIndex = getLastIndex(cArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Character.valueOf(cArr[i]));
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
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m28787minOf(char[] cArr, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length != 0) {
            R rInvoke = qy6Var.invoke(Character.valueOf(cArr[0]));
            int lastIndex = getLastIndex(cArr);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Character.valueOf(cArr[i]));
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

    @yfb
    public static final <R> List<scc<Long, R>> zip(@yfb long[] jArr, @yfb Iterable<? extends R> iterable) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(vkh.m24050to(Long.valueOf(jArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @yfb
    public static final <R> List<scc<Float, R>> zip(@yfb float[] fArr, @yfb Iterable<? extends R> iterable) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(vkh.m24050to(Float.valueOf(fArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @yfb
    public static final <R> List<scc<Double, R>> zip(@yfb double[] dArr, @yfb Iterable<? extends R> iterable) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(vkh.m24050to(Double.valueOf(dArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @yfb
    public static final <R> List<scc<Boolean, R>> zip(@yfb boolean[] zArr, @yfb Iterable<? extends R> iterable) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(vkh.m24050to(Boolean.valueOf(zArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @yfb
    public static final <R> List<scc<Character, R>> zip(@yfb char[] cArr, @yfb Iterable<? extends R> iterable) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(iterable, "other");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(vkh.m24050to(Character.valueOf(cArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @yfb
    public static final List<scc<Byte, Byte>> zip(@yfb byte[] bArr, @yfb byte[] bArr2) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(bArr2, "other");
        int iMin = Math.min(bArr.length, bArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(vkh.m24050to(Byte.valueOf(bArr[i]), Byte.valueOf(bArr2[i])));
        }
        return arrayList;
    }

    @yfb
    public static final List<scc<Short, Short>> zip(@yfb short[] sArr, @yfb short[] sArr2) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(sArr2, "other");
        int iMin = Math.min(sArr.length, sArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(vkh.m24050to(Short.valueOf(sArr[i]), Short.valueOf(sArr2[i])));
        }
        return arrayList;
    }

    @yfb
    public static final List<scc<Integer, Integer>> zip(@yfb int[] iArr, @yfb int[] iArr2) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(iArr2, "other");
        int iMin = Math.min(iArr.length, iArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(vkh.m24050to(Integer.valueOf(iArr[i]), Integer.valueOf(iArr2[i])));
        }
        return arrayList;
    }

    @yfb
    public static final List<scc<Long, Long>> zip(@yfb long[] jArr, @yfb long[] jArr2) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(jArr2, "other");
        int iMin = Math.min(jArr.length, jArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(vkh.m24050to(Long.valueOf(jArr[i]), Long.valueOf(jArr2[i])));
        }
        return arrayList;
    }

    @yfb
    public static final List<scc<Float, Float>> zip(@yfb float[] fArr, @yfb float[] fArr2) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(fArr2, "other");
        int iMin = Math.min(fArr.length, fArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(vkh.m24050to(Float.valueOf(fArr[i]), Float.valueOf(fArr2[i])));
        }
        return arrayList;
    }

    @yfb
    public static final List<scc<Double, Double>> zip(@yfb double[] dArr, @yfb double[] dArr2) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(dArr2, "other");
        int iMin = Math.min(dArr.length, dArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(vkh.m24050to(Double.valueOf(dArr[i]), Double.valueOf(dArr2[i])));
        }
        return arrayList;
    }

    @yfb
    public static final List<scc<Boolean, Boolean>> zip(@yfb boolean[] zArr, @yfb boolean[] zArr2) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(zArr2, "other");
        int iMin = Math.min(zArr.length, zArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(vkh.m24050to(Boolean.valueOf(zArr[i]), Boolean.valueOf(zArr2[i])));
        }
        return arrayList;
    }

    @yfb
    public static final List<scc<Character, Character>> zip(@yfb char[] cArr, @yfb char[] cArr2) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(cArr2, "other");
        int iMin = Math.min(cArr.length, cArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(vkh.m24050to(Character.valueOf(cArr[i]), Character.valueOf(cArr2[i])));
        }
        return arrayList;
    }
}
