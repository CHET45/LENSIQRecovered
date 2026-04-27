package p000;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.haibin.calendarview.C3803b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.gcb;
import p000.vp0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class dt3 implements vp0, pdh {

    /* JADX INFO: renamed from: A */
    public static final int f30794A = 3;

    /* JADX INFO: renamed from: B */
    public static final int f30795B = 4;

    /* JADX INFO: renamed from: C */
    public static final int f30796C = 5;

    /* JADX INFO: renamed from: D */
    @hib
    public static dt3 f30797D = null;

    /* JADX INFO: renamed from: E */
    public static final int f30798E = 2000;

    /* JADX INFO: renamed from: F */
    public static final int f30799F = 524288;

    /* JADX INFO: renamed from: p */
    public static final kx7<Long> f30800p = kx7.m15115of(4400000L, 3200000L, 2300000L, 1600000L, 810000L);

    /* JADX INFO: renamed from: q */
    public static final kx7<Long> f30801q = kx7.m15115of(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* JADX INFO: renamed from: r */
    public static final kx7<Long> f30802r = kx7.m15115of(2100000L, 1400000L, 1000000L, 890000L, 640000L);

    /* JADX INFO: renamed from: s */
    public static final kx7<Long> f30803s = kx7.m15115of(2600000L, 1700000L, 1300000L, 1000000L, 700000L);

    /* JADX INFO: renamed from: t */
    public static final kx7<Long> f30804t = kx7.m15115of(5700000L, 3700000L, 2300000L, 1700000L, 990000L);

    /* JADX INFO: renamed from: u */
    public static final kx7<Long> f30805u = kx7.m15115of(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    /* JADX INFO: renamed from: v */
    public static final long f30806v = 1000000;

    /* JADX INFO: renamed from: w */
    public static final int f30807w = 2000;

    /* JADX INFO: renamed from: x */
    public static final int f30808x = 0;

    /* JADX INFO: renamed from: y */
    public static final int f30809y = 1;

    /* JADX INFO: renamed from: z */
    public static final int f30810z = 2;

    /* JADX INFO: renamed from: a */
    public final ox7<Integer, Long> f30811a;

    /* JADX INFO: renamed from: b */
    public final vp0.InterfaceC14197a.a f30812b;

    /* JADX INFO: renamed from: c */
    public final brf f30813c;

    /* JADX INFO: renamed from: d */
    public final h52 f30814d;

    /* JADX INFO: renamed from: e */
    public final boolean f30815e;

    /* JADX INFO: renamed from: f */
    public int f30816f;

    /* JADX INFO: renamed from: g */
    public long f30817g;

    /* JADX INFO: renamed from: h */
    public long f30818h;

    /* JADX INFO: renamed from: i */
    public int f30819i;

    /* JADX INFO: renamed from: j */
    public long f30820j;

    /* JADX INFO: renamed from: k */
    public long f30821k;

    /* JADX INFO: renamed from: l */
    public long f30822l;

    /* JADX INFO: renamed from: m */
    public long f30823m;

    /* JADX INFO: renamed from: n */
    public boolean f30824n;

    /* JADX INFO: renamed from: o */
    public int f30825o;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] getInitialBitrateCountryGroupAssignment(String str) {
        byte b = 0;
        str.hashCode();
        switch (str.hashCode()) {
            case 2083:
                if (!str.equals("AD")) {
                    b = -1;
                }
                break;
            case 2084:
                b = !str.equals("AE") ? (byte) -1 : (byte) 1;
                break;
            case 2085:
                b = !str.equals("AF") ? (byte) -1 : (byte) 2;
                break;
            case 2086:
                b = !str.equals("AG") ? (byte) -1 : (byte) 3;
                break;
            case 2088:
                b = !str.equals("AI") ? (byte) -1 : (byte) 4;
                break;
            case 2091:
                b = !str.equals("AL") ? (byte) -1 : (byte) 5;
                break;
            case 2092:
                b = !str.equals("AM") ? (byte) -1 : (byte) 6;
                break;
            case 2094:
                b = !str.equals("AO") ? (byte) -1 : (byte) 7;
                break;
            case 2096:
                b = !str.equals("AQ") ? (byte) -1 : (byte) 8;
                break;
            case 2098:
                b = !str.equals("AS") ? (byte) -1 : (byte) 9;
                break;
            case C3803b.f23867U0 /* 2099 */:
                b = !str.equals("AT") ? (byte) -1 : (byte) 10;
                break;
            case Videoio.CAP_ARAVIS /* 2100 */:
                b = !str.equals("AU") ? (byte) -1 : (byte) 11;
                break;
            case 2102:
                b = !str.equals("AW") ? (byte) -1 : (byte) 12;
                break;
            case 2103:
                b = !str.equals("AX") ? (byte) -1 : (byte) 13;
                break;
            case 2105:
                b = !str.equals("AZ") ? (byte) -1 : (byte) 14;
                break;
            case 2111:
                b = !str.equals("BA") ? (byte) -1 : (byte) 15;
                break;
            case 2112:
                b = !str.equals("BB") ? (byte) -1 : (byte) 16;
                break;
            case 2114:
                b = !str.equals("BD") ? (byte) -1 : (byte) 17;
                break;
            case 2115:
                b = !str.equals("BE") ? (byte) -1 : (byte) 18;
                break;
            case 2116:
                b = !str.equals("BF") ? (byte) -1 : (byte) 19;
                break;
            case 2117:
                b = !str.equals("BG") ? (byte) -1 : (byte) 20;
                break;
            case 2118:
                b = !str.equals("BH") ? (byte) -1 : (byte) 21;
                break;
            case 2119:
                b = !str.equals("BI") ? (byte) -1 : (byte) 22;
                break;
            case 2120:
                b = !str.equals("BJ") ? (byte) -1 : (byte) 23;
                break;
            case 2122:
                b = !str.equals("BL") ? (byte) -1 : (byte) 24;
                break;
            case 2123:
                b = !str.equals("BM") ? (byte) -1 : (byte) 25;
                break;
            case 2124:
                b = !str.equals("BN") ? (byte) -1 : (byte) 26;
                break;
            case 2125:
                b = !str.equals("BO") ? (byte) -1 : (byte) 27;
                break;
            case 2127:
                b = !str.equals("BQ") ? (byte) -1 : (byte) 28;
                break;
            case 2128:
                b = !str.equals("BR") ? (byte) -1 : (byte) 29;
                break;
            case 2129:
                b = !str.equals("BS") ? (byte) -1 : (byte) 30;
                break;
            case 2130:
                b = !str.equals("BT") ? (byte) -1 : (byte) 31;
                break;
            case 2133:
                b = !str.equals("BW") ? (byte) -1 : (byte) 32;
                break;
            case 2135:
                b = !str.equals("BY") ? (byte) -1 : (byte) 33;
                break;
            case 2136:
                b = !str.equals("BZ") ? (byte) -1 : BuiltinOptions.TopKV2Options;
                break;
            case 2142:
                b = !str.equals("CA") ? (byte) -1 : BuiltinOptions.SplitOptions;
                break;
            case 2145:
                b = !str.equals("CD") ? (byte) -1 : (byte) 36;
                break;
            case 2147:
                b = !str.equals("CF") ? (byte) -1 : (byte) 37;
                break;
            case 2148:
                b = !str.equals("CG") ? (byte) -1 : (byte) 38;
                break;
            case 2149:
                b = !str.equals("CH") ? (byte) -1 : (byte) 39;
                break;
            case 2150:
                b = !str.equals("CI") ? (byte) -1 : (byte) 40;
                break;
            case 2152:
                b = !str.equals("CK") ? (byte) -1 : (byte) 41;
                break;
            case 2153:
                b = !str.equals("CL") ? (byte) -1 : (byte) 42;
                break;
            case 2154:
                b = !str.equals("CM") ? (byte) -1 : (byte) 43;
                break;
            case 2155:
                b = !str.equals("CN") ? (byte) -1 : (byte) 44;
                break;
            case 2156:
                b = !str.equals("CO") ? (byte) -1 : (byte) 45;
                break;
            case 2159:
                b = !str.equals("CR") ? (byte) -1 : (byte) 46;
                break;
            case 2162:
                b = !str.equals("CU") ? (byte) -1 : (byte) 47;
                break;
            case 2163:
                b = !str.equals("CV") ? (byte) -1 : (byte) 48;
                break;
            case 2164:
                b = !str.equals("CW") ? (byte) -1 : (byte) 49;
                break;
            case 2165:
                b = !str.equals("CX") ? (byte) -1 : (byte) 50;
                break;
            case 2166:
                b = !str.equals("CY") ? (byte) -1 : (byte) 51;
                break;
            case 2167:
                b = !str.equals("CZ") ? (byte) -1 : (byte) 52;
                break;
            case 2177:
                b = !str.equals("DE") ? (byte) -1 : (byte) 53;
                break;
            case 2182:
                b = !str.equals("DJ") ? (byte) -1 : (byte) 54;
                break;
            case 2183:
                b = !str.equals("DK") ? (byte) -1 : (byte) 55;
                break;
            case 2185:
                b = !str.equals("DM") ? (byte) -1 : (byte) 56;
                break;
            case 2187:
                b = !str.equals("DO") ? (byte) -1 : BuiltinOptions.ArgMinOptions;
                break;
            case 2198:
                b = !str.equals("DZ") ? (byte) -1 : BuiltinOptions.FakeQuantOptions;
                break;
            case 2206:
                b = !str.equals("EC") ? (byte) -1 : BuiltinOptions.PackOptions;
                break;
            case 2208:
                b = !str.equals("EE") ? (byte) -1 : BuiltinOptions.LogicalOrOptions;
                break;
            case 2210:
                b = !str.equals("EG") ? (byte) -1 : (byte) 61;
                break;
            case 2221:
                b = !str.equals("ER") ? (byte) -1 : BuiltinOptions.LogicalAndOptions;
                break;
            case 2222:
                b = !str.equals("ES") ? (byte) -1 : (byte) 63;
                break;
            case 2223:
                b = !str.equals("ET") ? (byte) -1 : (byte) 64;
                break;
            case 2243:
                b = !str.equals("FI") ? (byte) -1 : BuiltinOptions.FloorDivOptions;
                break;
            case 2244:
                b = !str.equals("FJ") ? (byte) -1 : BuiltinOptions.SquareOptions;
                break;
            case 2247:
                b = !str.equals("FM") ? (byte) -1 : BuiltinOptions.ZerosLikeOptions;
                break;
            case 2249:
                b = !str.equals("FO") ? (byte) -1 : BuiltinOptions.FillOptions;
                break;
            case 2252:
                b = !str.equals("FR") ? (byte) -1 : BuiltinOptions.BidirectionalSequenceLSTMOptions;
                break;
            case 2266:
                b = !str.equals("GA") ? (byte) -1 : BuiltinOptions.BidirectionalSequenceRNNOptions;
                break;
            case 2267:
                b = !str.equals("GB") ? (byte) -1 : BuiltinOptions.UnidirectionalSequenceLSTMOptions;
                break;
            case 2269:
                b = !str.equals("GD") ? (byte) -1 : BuiltinOptions.FloorModOptions;
                break;
            case 2270:
                b = !str.equals("GE") ? (byte) -1 : BuiltinOptions.RangeOptions;
                break;
            case 2271:
                b = !str.equals("GF") ? (byte) -1 : BuiltinOptions.ResizeNearestNeighborOptions;
                break;
            case 2272:
                b = !str.equals("GG") ? (byte) -1 : (byte) 75;
                break;
            case 2273:
                b = !str.equals("GH") ? (byte) -1 : (byte) 76;
                break;
            case 2274:
                b = !str.equals("GI") ? (byte) -1 : (byte) 77;
                break;
            case 2277:
                b = !str.equals("GL") ? (byte) -1 : BuiltinOptions.AbsOptions;
                break;
            case 2278:
                b = !str.equals("GM") ? (byte) -1 : BuiltinOptions.SplitVOptions;
                break;
            case 2279:
                b = !str.equals("GN") ? (byte) -1 : BuiltinOptions.UniqueOptions;
                break;
            case 2281:
                b = !str.equals("GP") ? (byte) -1 : BuiltinOptions.ReverseV2Options;
                break;
            case 2282:
                b = !str.equals("GQ") ? (byte) -1 : BuiltinOptions.AddNOptions;
                break;
            case 2283:
                b = !str.equals("GR") ? (byte) -1 : (byte) 83;
                break;
            case 2285:
                b = !str.equals("GT") ? (byte) -1 : BuiltinOptions.CosOptions;
                break;
            case 2286:
                b = !str.equals("GU") ? (byte) -1 : BuiltinOptions.WhereOptions;
                break;
            case 2288:
                b = !str.equals("GW") ? (byte) -1 : BuiltinOptions.RankOptions;
                break;
            case 2290:
                b = !str.equals("GY") ? (byte) -1 : BuiltinOptions.ReverseSequenceOptions;
                break;
            case 2307:
                b = !str.equals("HK") ? (byte) -1 : (byte) 88;
                break;
            case 2310:
                b = !str.equals("HN") ? (byte) -1 : BuiltinOptions.QuantizeOptions;
                break;
            case 2314:
                b = !str.equals("HR") ? (byte) -1 : BuiltinOptions.MatrixSetDiagOptions;
                break;
            case 2316:
                b = !str.equals("HT") ? (byte) -1 : BuiltinOptions.HardSwishOptions;
                break;
            case 2317:
                b = !str.equals("HU") ? (byte) -1 : BuiltinOptions.IfOptions;
                break;
            case 2331:
                b = !str.equals("ID") ? (byte) -1 : BuiltinOptions.WhileOptions;
                break;
            case 2332:
                b = !str.equals("IE") ? (byte) -1 : BuiltinOptions.DepthToSpaceOptions;
                break;
            case 2339:
                b = !str.equals("IL") ? (byte) -1 : BuiltinOptions.NonMaxSuppressionV4Options;
                break;
            case 2340:
                b = !str.equals("IM") ? (byte) -1 : BuiltinOptions.NonMaxSuppressionV5Options;
                break;
            case 2341:
                b = !str.equals("IN") ? (byte) -1 : BuiltinOptions.ScatterNdOptions;
                break;
            case 2342:
                b = !str.equals("IO") ? (byte) -1 : BuiltinOptions.SelectV2Options;
                break;
            case 2344:
                b = !str.equals("IQ") ? (byte) -1 : BuiltinOptions.DensifyOptions;
                break;
            case 2345:
                b = !str.equals("IR") ? (byte) -1 : (byte) 100;
                break;
            case 2346:
                b = !str.equals("IS") ? (byte) -1 : BuiltinOptions.BatchMatMulOptions;
                break;
            case 2347:
                b = !str.equals("IT") ? (byte) -1 : BuiltinOptions.CumsumOptions;
                break;
            case 2363:
                b = !str.equals("JE") ? (byte) -1 : (byte) 103;
                break;
            case 2371:
                b = !str.equals("JM") ? (byte) -1 : BuiltinOptions.BroadcastToOptions;
                break;
            case 2373:
                b = !str.equals("JO") ? (byte) -1 : BuiltinOptions.Rfft2dOptions;
                break;
            case 2374:
                b = !str.equals("JP") ? (byte) -1 : BuiltinOptions.Conv3DOptions;
                break;
            case 2394:
                b = !str.equals("KE") ? (byte) -1 : BuiltinOptions.HashtableOptions;
                break;
            case 2396:
                b = !str.equals(ExpandedProductParsedResult.KILOGRAM) ? (byte) -1 : BuiltinOptions.HashtableFindOptions;
                break;
            case 2397:
                b = !str.equals("KH") ? (byte) -1 : BuiltinOptions.HashtableImportOptions;
                break;
            case 2398:
                b = !str.equals("KI") ? (byte) -1 : BuiltinOptions.HashtableSizeOptions;
                break;
            case 2402:
                b = !str.equals("KM") ? (byte) -1 : BuiltinOptions.VarHandleOptions;
                break;
            case 2403:
                b = !str.equals("KN") ? (byte) -1 : BuiltinOptions.ReadVariableOptions;
                break;
            case 2407:
                b = !str.equals("KR") ? (byte) -1 : (byte) 113;
                break;
            case 2412:
                b = !str.equals("KW") ? (byte) -1 : BuiltinOptions.RandomOptions;
                break;
            case 2414:
                b = !str.equals("KY") ? (byte) -1 : BuiltinOptions.BucketizeOptions;
                break;
            case 2415:
                b = !str.equals("KZ") ? (byte) -1 : BuiltinOptions.GeluOptions;
                break;
            case 2421:
                b = !str.equals("LA") ? (byte) -1 : BuiltinOptions.DynamicUpdateSliceOptions;
                break;
            case 2422:
                b = !str.equals(ExpandedProductParsedResult.POUND) ? (byte) -1 : BuiltinOptions.UnsortedSegmentProdOptions;
                break;
            case 2423:
                b = !str.equals("LC") ? (byte) -1 : BuiltinOptions.UnsortedSegmentMaxOptions;
                break;
            case 2429:
                b = !str.equals("LI") ? (byte) -1 : (byte) 120;
                break;
            case 2431:
                b = !str.equals("LK") ? (byte) -1 : BuiltinOptions.UnsortedSegmentSumOptions;
                break;
            case 2438:
                b = !str.equals("LR") ? (byte) -1 : BuiltinOptions.ATan2Options;
                break;
            case 2439:
                b = !str.equals("LS") ? (byte) -1 : BuiltinOptions.SignOptions;
                break;
            case 2440:
                b = !str.equals("LT") ? (byte) -1 : BuiltinOptions.BitcastOptions;
                break;
            case 2441:
                b = !str.equals("LU") ? (byte) -1 : BuiltinOptions.BitwiseXorOptions;
                break;
            case 2442:
                b = !str.equals("LV") ? (byte) -1 : BuiltinOptions.RightShiftOptions;
                break;
            case 2445:
                b = !str.equals("LY") ? (byte) -1 : (byte) 127;
                break;
            case 2452:
                b = !str.equals("MA") ? (byte) -1 : (byte) 128;
                break;
            case 2454:
                b = !str.equals("MC") ? (byte) -1 : (byte) 129;
                break;
            case 2455:
                b = !str.equals("MD") ? (byte) -1 : (byte) 130;
                break;
            case 2456:
                b = !str.equals("ME") ? (byte) -1 : (byte) 131;
                break;
            case 2457:
                b = !str.equals("MF") ? (byte) -1 : (byte) 132;
                break;
            case 2458:
                b = !str.equals("MG") ? (byte) -1 : (byte) 133;
                break;
            case 2459:
                b = !str.equals("MH") ? (byte) -1 : (byte) 134;
                break;
            case 2462:
                b = !str.equals("MK") ? (byte) -1 : (byte) 135;
                break;
            case 2463:
                b = !str.equals("ML") ? (byte) -1 : (byte) 136;
                break;
            case 2464:
                b = !str.equals("MM") ? (byte) -1 : (byte) 137;
                break;
            case 2465:
                b = !str.equals("MN") ? (byte) -1 : (byte) 138;
                break;
            case 2466:
                b = !str.equals("MO") ? (byte) -1 : (byte) 139;
                break;
            case 2467:
                b = !str.equals("MP") ? (byte) -1 : (byte) 140;
                break;
            case 2468:
                b = !str.equals("MQ") ? (byte) -1 : (byte) 141;
                break;
            case 2469:
                b = !str.equals("MR") ? (byte) -1 : (byte) 142;
                break;
            case 2470:
                b = !str.equals("MS") ? (byte) -1 : (byte) 143;
                break;
            case 2471:
                b = !str.equals("MT") ? (byte) -1 : (byte) 144;
                break;
            case 2472:
                b = !str.equals("MU") ? (byte) -1 : (byte) 145;
                break;
            case 2473:
                b = !str.equals("MV") ? (byte) -1 : (byte) 146;
                break;
            case 2474:
                b = !str.equals("MW") ? (byte) -1 : (byte) 147;
                break;
            case 2475:
                b = !str.equals("MX") ? (byte) -1 : (byte) 148;
                break;
            case 2476:
                b = !str.equals("MY") ? (byte) -1 : (byte) 149;
                break;
            case 2477:
                b = !str.equals("MZ") ? (byte) -1 : (byte) 150;
                break;
            case 2483:
                b = !str.equals("NA") ? (byte) -1 : (byte) 151;
                break;
            case 2485:
                b = !str.equals("NC") ? (byte) -1 : (byte) 152;
                break;
            case 2487:
                b = !str.equals("NE") ? (byte) -1 : (byte) 153;
                break;
            case 2489:
                b = !str.equals("NG") ? (byte) -1 : (byte) 154;
                break;
            case 2491:
                b = !str.equals("NI") ? (byte) -1 : (byte) 155;
                break;
            case 2494:
                b = !str.equals("NL") ? (byte) -1 : (byte) 156;
                break;
            case 2497:
                b = !str.equals("NO") ? (byte) -1 : (byte) 157;
                break;
            case 2498:
                b = !str.equals("NP") ? (byte) -1 : (byte) 158;
                break;
            case 2500:
                b = !str.equals("NR") ? (byte) -1 : (byte) 159;
                break;
            case 2503:
                b = !str.equals("NU") ? (byte) -1 : (byte) 160;
                break;
            case 2508:
                b = !str.equals("NZ") ? (byte) -1 : (byte) 161;
                break;
            case 2526:
                b = !str.equals("OM") ? (byte) -1 : (byte) 162;
                break;
            case 2545:
                b = !str.equals("PA") ? (byte) -1 : (byte) 163;
                break;
            case 2549:
                b = !str.equals("PE") ? (byte) -1 : (byte) 164;
                break;
            case 2550:
                b = !str.equals("PF") ? (byte) -1 : (byte) 165;
                break;
            case 2551:
                b = !str.equals("PG") ? (byte) -1 : (byte) 166;
                break;
            case 2552:
                b = !str.equals("PH") ? (byte) -1 : (byte) 167;
                break;
            case 2555:
                b = !str.equals("PK") ? (byte) -1 : (byte) 168;
                break;
            case 2556:
                b = !str.equals("PL") ? (byte) -1 : (byte) 169;
                break;
            case 2557:
                b = !str.equals("PM") ? (byte) -1 : (byte) 170;
                break;
            case 2562:
                b = !str.equals("PR") ? (byte) -1 : (byte) 171;
                break;
            case 2563:
                b = !str.equals("PS") ? (byte) -1 : (byte) 172;
                break;
            case 2564:
                b = !str.equals("PT") ? (byte) -1 : (byte) 173;
                break;
            case 2567:
                b = !str.equals("PW") ? (byte) -1 : (byte) 174;
                break;
            case 2569:
                b = !str.equals("PY") ? (byte) -1 : (byte) 175;
                break;
            case 2576:
                b = !str.equals("QA") ? (byte) -1 : (byte) 176;
                break;
            case 2611:
                b = !str.equals("RE") ? (byte) -1 : (byte) 177;
                break;
            case 2621:
                b = !str.equals("RO") ? (byte) -1 : (byte) 178;
                break;
            case 2625:
                b = !str.equals("RS") ? (byte) -1 : (byte) 179;
                break;
            case 2627:
                b = !str.equals("RU") ? (byte) -1 : (byte) 180;
                break;
            case 2629:
                b = !str.equals("RW") ? (byte) -1 : (byte) 181;
                break;
            case 2638:
                b = !str.equals("SA") ? (byte) -1 : (byte) 182;
                break;
            case 2639:
                b = !str.equals("SB") ? (byte) -1 : (byte) 183;
                break;
            case 2640:
                b = !str.equals("SC") ? (byte) -1 : (byte) 184;
                break;
            case 2641:
                b = !str.equals("SD") ? (byte) -1 : (byte) 185;
                break;
            case 2642:
                b = !str.equals("SE") ? (byte) -1 : (byte) 186;
                break;
            case 2644:
                b = !str.equals("SG") ? (byte) -1 : (byte) 187;
                break;
            case 2645:
                b = !str.equals("SH") ? (byte) -1 : (byte) 188;
                break;
            case 2646:
                b = !str.equals("SI") ? (byte) -1 : (byte) 189;
                break;
            case 2647:
                b = !str.equals("SJ") ? (byte) -1 : (byte) 190;
                break;
            case 2648:
                b = !str.equals("SK") ? (byte) -1 : (byte) 191;
                break;
            case 2649:
                b = !str.equals("SL") ? (byte) -1 : k95.f53214o7;
                break;
            case 2650:
                b = !str.equals("SM") ? (byte) -1 : k95.f53222p7;
                break;
            case 2651:
                b = !str.equals("SN") ? (byte) -1 : k95.f53230q7;
                break;
            case 2652:
                b = !str.equals("SO") ? (byte) -1 : k95.f53238r7;
                break;
            case 2655:
                b = !str.equals("SR") ? (byte) -1 : (byte) 196;
                break;
            case 2656:
                b = !str.equals("SS") ? (byte) -1 : k95.f53246s7;
                break;
            case 2657:
                b = !str.equals("ST") ? (byte) -1 : k95.f53254t7;
                break;
            case 2659:
                b = !str.equals("SV") ? (byte) -1 : k95.f53262u7;
                break;
            case 2661:
                b = !str.equals("SX") ? (byte) -1 : (byte) 200;
                break;
            case 2662:
                b = !str.equals("SY") ? (byte) -1 : k95.f53271v7;
                break;
            case 2663:
                b = !str.equals("SZ") ? (byte) -1 : k95.f53280w7;
                break;
            case 2671:
                b = !str.equals("TC") ? (byte) -1 : k95.f53289x7;
                break;
            case 2672:
                b = !str.equals("TD") ? (byte) -1 : (byte) 204;
                break;
            case 2675:
                b = !str.equals("TG") ? (byte) -1 : k95.f53298y7;
                break;
            case 2676:
                b = !str.equals("TH") ? (byte) -1 : k95.f53307z7;
                break;
            case 2678:
                b = !str.equals("TJ") ? (byte) -1 : k95.f52870A7;
                break;
            case 2679:
                b = !str.equals("TK") ? (byte) -1 : (byte) 208;
                break;
            case 2680:
                b = !str.equals("TL") ? (byte) -1 : (byte) 209;
                break;
            case 2681:
                b = !str.equals("TM") ? (byte) -1 : (byte) 210;
                break;
            case 2682:
                b = !str.equals("TN") ? (byte) -1 : (byte) 211;
                break;
            case 2683:
                b = !str.equals("TO") ? (byte) -1 : (byte) 212;
                break;
            case 2686:
                b = !str.equals("TR") ? (byte) -1 : (byte) 213;
                break;
            case 2688:
                b = !str.equals("TT") ? (byte) -1 : (byte) 214;
                break;
            case 2690:
                b = !str.equals("TV") ? (byte) -1 : (byte) 215;
                break;
            case 2691:
                b = !str.equals("TW") ? (byte) -1 : k95.f53206n7;
                break;
            case 2694:
                b = !str.equals("TZ") ? (byte) -1 : k95.f52906E7;
                break;
            case 2700:
                b = !str.equals("UA") ? (byte) -1 : k95.f52879B7;
                break;
            case 2706:
                b = !str.equals("UG") ? (byte) -1 : (byte) 219;
                break;
            case 2718:
                b = !str.equals("US") ? (byte) -1 : (byte) 220;
                break;
            case 2724:
                b = !str.equals("UY") ? (byte) -1 : (byte) 221;
                break;
            case 2725:
                b = !str.equals("UZ") ? (byte) -1 : (byte) 222;
                break;
            case 2731:
                b = !str.equals("VA") ? (byte) -1 : (byte) 223;
                break;
            case 2733:
                b = !str.equals("VC") ? (byte) -1 : (byte) 224;
                break;
            case 2735:
                b = !str.equals("VE") ? (byte) -1 : k95.f52888C7;
                break;
            case 2737:
                b = !str.equals("VG") ? (byte) -1 : (byte) 226;
                break;
            case 2739:
                b = !str.equals("VI") ? (byte) -1 : (byte) 227;
                break;
            case 2744:
                b = !str.equals("VN") ? (byte) -1 : (byte) 228;
                break;
            case 2751:
                b = !str.equals("VU") ? (byte) -1 : (byte) 229;
                break;
            case 2767:
                b = !str.equals("WF") ? (byte) -1 : (byte) 230;
                break;
            case 2780:
                b = !str.equals("WS") ? (byte) -1 : (byte) 231;
                break;
            case 2803:
                b = !str.equals("XK") ? (byte) -1 : ns4.f65437B;
                break;
            case 2828:
                b = !str.equals("YE") ? (byte) -1 : (byte) 233;
                break;
            case 2843:
                b = !str.equals("YT") ? (byte) -1 : (byte) 234;
                break;
            case 2855:
                b = !str.equals("ZA") ? (byte) -1 : (byte) 235;
                break;
            case 2867:
                b = !str.equals("ZM") ? (byte) -1 : (byte) 236;
                break;
            case 2877:
                b = !str.equals("ZW") ? (byte) -1 : (byte) 237;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 49:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 3, 4, 4, 2};
            case 2:
            case 166:
                return new int[]{4, 3, 3, 3, 2, 2};
            case 3:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 4:
            case 16:
            case 25:
            case 28:
            case 56:
            case 68:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 3, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{4, 4, 4, 3, 2, 2};
            case 8:
            case 62:
            case 188:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 10:
                return new int[]{1, 2, 1, 4, 1, 4};
            case 11:
                return new int[]{0, 2, 1, 1, 3, 0};
            case 12:
            case 85:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 13:
            case 50:
            case 120:
            case 140:
            case 143:
            case dk4.f29869f /* 170 */:
            case l87.f56762u /* 193 */:
            case 223:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 14:
            case 19:
            case 58:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 15:
            case 94:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 17:
            case 116:
                return new int[]{2, 1, 2, 2, 2, 2};
            case 18:
                return new int[]{0, 1, 4, 4, 3, 2};
            case 20:
            case 63:
            case 83:
            case 189:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 21:
                return new int[]{1, 3, 1, 4, 4, 2};
            case 22:
            case 91:
            case 133:
            case 153:
            case gm2.f40176m /* 204 */:
            case 225:
            case 233:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 23:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 24:
            case 132:
            case HideBottomViewOnScrollBehavior.f20939p /* 175 */:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{3, 2, 0, 1, 2, 2};
            case 27:
                return new int[]{1, 2, 3, 2, 2, 2};
            case 29:
                return new int[]{1, 1, 2, 1, 1, 0};
            case 30:
            case 118:
                return new int[]{3, 2, 1, 2, 2, 2};
            case 31:
            case 150:
            case 231:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 32:
                return new int[]{3, 2, 1, 0, 2, 2};
            case 33:
                return new int[]{1, 1, 2, 3, 2, 2};
            case 34:
            case 41:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 35:
                return new int[]{0, 2, 3, 3, 3, 3};
            case 36:
            case 111:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 37:
            case 183:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 38:
            case 76:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 39:
                return new int[]{0, 0, 0, 0, 0, 3};
            case 40:
            case 61:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 42:
                return new int[]{1, 1, 2, 1, 3, 2};
            case 43:
                return new int[]{4, 3, 3, 4, 2, 2};
            case 44:
                return new int[]{2, 0, 4, 3, 3, 1};
            case 45:
                return new int[]{2, 3, 4, 2, 2, 2};
            case 46:
                return new int[]{2, 4, 4, 4, 2, 2};
            case 47:
            case 110:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 48:
                return new int[]{2, 3, 0, 1, 2, 2};
            case 51:
            case 90:
            case 126:
                return new int[]{1, 0, 0, 0, 0, 2};
            case 52:
                return new int[]{0, 0, 2, 0, 1, 2};
            case 53:
                return new int[]{0, 1, 3, 2, 2, 2};
            case 54:
            case 201:
            case gm2.f40180q /* 207 */:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 55:
            case 60:
            case 92:
            case 124:
            case 144:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 57:
                return new int[]{3, 4, 4, 4, 4, 2};
            case 59:
                return new int[]{1, 3, 2, 1, 2, 2};
            case 64:
            case nb2.f63870r /* 194 */:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 65:
                return new int[]{0, 0, 0, 2, 0, 2};
            case 66:
                return new int[]{3, 1, 2, 3, 2, 2};
            case 67:
                return new int[]{4, 2, 3, 0, 2, 2};
            case 69:
                return new int[]{1, 1, 2, 1, 1, 2};
            case 70:
            case 205:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 71:
                return new int[]{0, 1, 1, 2, 1, 2};
            case 72:
            case 112:
            case 115:
            case 119:
            case 200:
            case 224:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 73:
                return new int[]{1, 0, 0, 2, 2, 2};
            case 74:
            case 168:
            case 192:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 75:
                return new int[]{0, 2, 1, 0, 2, 2};
            case 77:
            case 103:
                return new int[]{1, 2, 0, 1, 2, 2};
            case 78:
            case 208:
                return new int[]{2, 2, 2, 4, 2, 2};
            case 79:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 80:
                return new int[]{4, 4, 4, 2, 2, 2};
            case 81:
                return new int[]{3, 1, 1, 3, 2, 2};
            case 82:
                return new int[]{4, 4, 3, 3, 2, 2};
            case 84:
                return new int[]{2, 2, 2, 1, 1, 2};
            case 86:
                return new int[]{4, 4, 2, 2, 2, 2};
            case 87:
                return new int[]{3, 0, 1, 1, 2, 2};
            case 88:
                return new int[]{0, 1, 1, 3, 2, 0};
            case 89:
                return new int[]{3, 3, 2, 2, 2, 2};
            case 93:
                return new int[]{3, 1, 1, 2, 3, 2};
            case 95:
                return new int[]{1, 2, 2, 3, 4, 2};
            case 96:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 97:
                return new int[]{1, 1, 2, 1, 2, 1};
            case 98:
            case 215:
            case nb2.f63864l /* 230 */:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 99:
            case 190:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 100:
                return new int[]{4, 2, 3, 3, 4, 2};
            case 101:
                return new int[]{0, 0, 1, 0, 0, 2};
            case 102:
                return new int[]{0, 0, 1, 1, 1, 2};
            case 104:
                return new int[]{2, 4, 2, 1, 2, 2};
            case 105:
                return new int[]{2, 0, 1, 1, 2, 2};
            case 106:
                return new int[]{0, 3, 3, 3, 4, 4};
            case 107:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 108:
            case 141:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 109:
                return new int[]{1, 0, 4, 2, 2, 2};
            case 113:
                return new int[]{0, 2, 2, 4, 4, 4};
            case 114:
                return new int[]{1, 0, 1, 0, 0, 2};
            case 117:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 121:
                return new int[]{3, 2, 3, 4, 4, 2};
            case 122:
                return new int[]{3, 4, 3, 4, 2, 2};
            case 123:
            case 219:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 125:
                return new int[]{1, 1, 4, 2, 0, 2};
            case 127:
            case nb2.f63868p /* 212 */:
            case 237:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 128:
                return new int[]{3, 3, 2, 1, 2, 2};
            case 129:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 130:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 131:
                return new int[]{2, 0, 0, 1, 1, 2};
            case 134:
                return new int[]{4, 2, 1, 3, 2, 2};
            case 135:
                return new int[]{2, 0, 0, 1, 3, 2};
            case 136:
            case 217:
                return new int[]{3, 4, 2, 2, 2, 2};
            case 137:
                return new int[]{2, 2, 2, 3, 4, 2};
            case 138:
                return new int[]{2, 0, 1, 2, 2, 2};
            case 139:
                return new int[]{0, 2, 4, 4, 4, 2};
            case 142:
                return new int[]{4, 2, 3, 4, 2, 2};
            case 145:
            case 182:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 146:
                return new int[]{3, 4, 1, 3, 3, 2};
            case 147:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 148:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 149:
                return new int[]{1, 0, 4, 1, 2, 2};
            case 151:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 152:
                return new int[]{3, 2, 3, 4, 2, 2};
            case 154:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 155:
                return new int[]{2, 3, 4, 3, 2, 2};
            case 156:
                return new int[]{0, 2, 3, 3, 0, 4};
            case 157:
                return new int[]{0, 1, 2, 1, 1, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 2, 2};
            case 159:
                return new int[]{4, 0, 3, 2, 2, 2};
            case 160:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 161:
                return new int[]{1, 0, 2, 2, 4, 2};
            case 162:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 163:
                return new int[]{2, 3, 3, 3, 2, 2};
            case 164:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 165:
            case tpc.f85549b /* 199 */:
                return new int[]{2, 3, 3, 1, 2, 2};
            case 167:
                return new int[]{2, 1, 3, 2, 2, 0};
            case 169:
                return new int[]{2, 1, 2, 2, 4, 2};
            case 171:
                return new int[]{2, 0, 2, 0, 2, 1};
            case 172:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 173:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 174:
                return new int[]{2, 2, 4, 2, 2, 2};
            case 176:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 177:
                return new int[]{1, 2, 2, 3, 1, 2};
            case 178:
                return new int[]{0, 0, 1, 2, 1, 2};
            case 179:
                return new int[]{2, 0, 0, 0, 2, 2};
            case 180:
                return new int[]{1, 0, 0, 0, 3, 3};
            case 181:
                return new int[]{3, 3, 1, 0, 2, 2};
            case 184:
                return new int[]{4, 3, 1, 1, 2, 2};
            case 185:
                return new int[]{4, 3, 4, 2, 2, 2};
            case 186:
                return new int[]{0, 1, 1, 1, 0, 2};
            case 187:
                return new int[]{2, 3, 3, 3, 3, 3};
            case 191:
                return new int[]{1, 1, 1, 1, 3, 2};
            case nb2.f63871s /* 195 */:
                return new int[]{3, 2, 2, 4, 4, 2};
            case nb2.f63872t /* 196 */:
                return new int[]{2, 4, 3, 0, 2, 2};
            case 197:
            case 210:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 198:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 202:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 203:
                return new int[]{2, 2, 1, 3, 2, 2};
            case gm2.f40178o /* 206 */:
                return new int[]{0, 1, 2, 1, 2, 2};
            case 209:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 211:
            case 221:
                return new int[]{2, 1, 1, 1, 2, 2};
            case 213:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 214:
                return new int[]{1, 4, 0, 0, 2, 2};
            case 216:
                return new int[]{0, 2, 0, 0, 0, 0};
            case bw3.f14995j /* 218 */:
                return new int[]{0, 1, 1, 2, 4, 2};
            case 220:
                return new int[]{1, 1, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 2, 3, 4, 3, 2};
            case nb2.f63860h /* 226 */:
                return new int[]{2, 2, 0, 1, 2, 2};
            case nb2.f63861i /* 227 */:
                return new int[]{0, 2, 1, 2, 2, 2};
            case nb2.f63862j /* 228 */:
                return new int[]{0, 0, 1, 2, 2, 1};
            case nb2.f63863k /* 229 */:
                return new int[]{4, 3, 3, 1, 2, 2};
            case nb2.f63866n /* 232 */:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 234:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 235:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 236:
                return new int[]{4, 4, 4, 3, 3, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    private long getInitialBitrateEstimateForNetworkType(int i) {
        Long l = this.f30811a.get(Integer.valueOf(i));
        if (l == null) {
            l = this.f30811a.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public static synchronized dt3 getSingletonInstance(Context context) {
        try {
            if (f30797D == null) {
                f30797D = new C4941b(context).build();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f30797D;
    }

    private static boolean isTransferAtFullNetworkSpeed(yh3 yh3Var, boolean z) {
        return z && !yh3Var.isFlagSet(8);
    }

    private void maybeNotifyBandwidthSample(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.f30823m) {
            return;
        }
        this.f30823m = j2;
        this.f30812b.bandwidthSample(i, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onNetworkTypeChanged(int i) {
        int i2 = this.f30819i;
        if (i2 == 0 || this.f30815e) {
            if (this.f30824n) {
                i = this.f30825o;
            }
            if (i2 == i) {
                return;
            }
            this.f30819i = i;
            if (i != 1 && i != 0 && i != 8) {
                this.f30822l = getInitialBitrateEstimateForNetworkType(i);
                long jElapsedRealtime = this.f30814d.elapsedRealtime();
                maybeNotifyBandwidthSample(this.f30816f > 0 ? (int) (jElapsedRealtime - this.f30817g) : 0, this.f30818h, this.f30822l);
                this.f30817g = jElapsedRealtime;
                this.f30818h = 0L;
                this.f30821k = 0L;
                this.f30820j = 0L;
                this.f30813c.reset();
            }
        }
    }

    @Override // p000.vp0
    public void addEventListener(Handler handler, vp0.InterfaceC14197a interfaceC14197a) {
        u80.checkNotNull(handler);
        u80.checkNotNull(interfaceC14197a);
        this.f30812b.addListener(handler, interfaceC14197a);
    }

    @Override // p000.vp0
    public synchronized long getBitrateEstimate() {
        return this.f30822l;
    }

    @Override // p000.vp0
    public pdh getTransferListener() {
        return this;
    }

    @Override // p000.pdh
    public synchronized void onBytesTransferred(ih3 ih3Var, yh3 yh3Var, boolean z, int i) {
        if (isTransferAtFullNetworkSpeed(yh3Var, z)) {
            this.f30818h += (long) i;
        }
    }

    @Override // p000.pdh
    public synchronized void onTransferEnd(ih3 ih3Var, yh3 yh3Var, boolean z) {
        try {
            if (isTransferAtFullNetworkSpeed(yh3Var, z)) {
                u80.checkState(this.f30816f > 0);
                long jElapsedRealtime = this.f30814d.elapsedRealtime();
                int i = (int) (jElapsedRealtime - this.f30817g);
                this.f30820j += (long) i;
                long j = this.f30821k;
                long j2 = this.f30818h;
                this.f30821k = j + j2;
                if (i > 0) {
                    this.f30813c.addSample((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                    if (this.f30820j >= 2000 || this.f30821k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                        this.f30822l = (long) this.f30813c.getPercentile(0.5f);
                    }
                    maybeNotifyBandwidthSample(i, this.f30818h, this.f30822l);
                    this.f30817g = jElapsedRealtime;
                    this.f30818h = 0L;
                }
                this.f30816f--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.pdh
    public void onTransferInitializing(ih3 ih3Var, yh3 yh3Var, boolean z) {
    }

    @Override // p000.pdh
    public synchronized void onTransferStart(ih3 ih3Var, yh3 yh3Var, boolean z) {
        try {
            if (isTransferAtFullNetworkSpeed(yh3Var, z)) {
                if (this.f30816f == 0) {
                    this.f30817g = this.f30814d.elapsedRealtime();
                }
                this.f30816f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.vp0
    public void removeEventListener(vp0.InterfaceC14197a interfaceC14197a) {
        this.f30812b.removeListener(interfaceC14197a);
    }

    public synchronized void setNetworkTypeOverride(int i) {
        this.f30825o = i;
        this.f30824n = true;
        onNetworkTypeChanged(i);
    }

    /* JADX INFO: renamed from: dt3$b */
    public static final class C4941b {

        /* JADX INFO: renamed from: a */
        @hib
        public final Context f30826a;

        /* JADX INFO: renamed from: b */
        public Map<Integer, Long> f30827b;

        /* JADX INFO: renamed from: c */
        public int f30828c;

        /* JADX INFO: renamed from: d */
        public h52 f30829d;

        /* JADX INFO: renamed from: e */
        public boolean f30830e;

        public C4941b(Context context) {
            this.f30826a = context == null ? null : context.getApplicationContext();
            this.f30827b = getInitialBitrateEstimatesForCountry(x0i.getCountryCode(context));
            this.f30828c = 2000;
            this.f30829d = h52.f42390a;
            this.f30830e = true;
        }

        private static Map<Integer, Long> getInitialBitrateEstimatesForCountry(String str) {
            int[] initialBitrateCountryGroupAssignment = dt3.getInitialBitrateCountryGroupAssignment(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            kx7<Long> kx7Var = dt3.f30800p;
            map.put(2, kx7Var.get(initialBitrateCountryGroupAssignment[0]));
            map.put(3, dt3.f30801q.get(initialBitrateCountryGroupAssignment[1]));
            map.put(4, dt3.f30802r.get(initialBitrateCountryGroupAssignment[2]));
            map.put(5, dt3.f30803s.get(initialBitrateCountryGroupAssignment[3]));
            map.put(10, dt3.f30804t.get(initialBitrateCountryGroupAssignment[4]));
            map.put(9, dt3.f30805u.get(initialBitrateCountryGroupAssignment[5]));
            map.put(7, kx7Var.get(initialBitrateCountryGroupAssignment[0]));
            return map;
        }

        public dt3 build() {
            return new dt3(this.f30826a, this.f30827b, this.f30828c, this.f30829d, this.f30830e);
        }

        @op1
        public C4941b setClock(h52 h52Var) {
            this.f30829d = h52Var;
            return this;
        }

        @op1
        public C4941b setInitialBitrateEstimate(long j) {
            Iterator<Integer> it = this.f30827b.keySet().iterator();
            while (it.hasNext()) {
                setInitialBitrateEstimate(it.next().intValue(), j);
            }
            return this;
        }

        @op1
        public C4941b setResetOnNetworkTypeChange(boolean z) {
            this.f30830e = z;
            return this;
        }

        @op1
        public C4941b setSlidingWindowMaxWeight(int i) {
            this.f30828c = i;
            return this;
        }

        @op1
        public C4941b setInitialBitrateEstimate(int i, long j) {
            this.f30827b.put(Integer.valueOf(i), Long.valueOf(j));
            return this;
        }

        @op1
        public C4941b setInitialBitrateEstimate(String str) {
            this.f30827b = getInitialBitrateEstimatesForCountry(i80.toUpperCase(str));
            return this;
        }
    }

    private dt3(@hib Context context, Map<Integer, Long> map, int i, h52 h52Var, boolean z) {
        this.f30811a = ox7.copyOf((Map) map);
        this.f30812b = new vp0.InterfaceC14197a.a();
        this.f30813c = new brf(i);
        this.f30814d = h52Var;
        this.f30815e = z;
        if (context == null) {
            this.f30819i = 0;
            this.f30822l = getInitialBitrateEstimateForNetworkType(0);
            return;
        }
        gcb gcbVar = gcb.getInstance(context);
        int networkType = gcbVar.getNetworkType();
        this.f30819i = networkType;
        this.f30822l = getInitialBitrateEstimateForNetworkType(networkType);
        gcbVar.register(new gcb.InterfaceC6215c() { // from class: at3
            @Override // p000.gcb.InterfaceC6215c
            public final void onNetworkTypeChanged(int i2) {
                this.f11827a.onNetworkTypeChanged(i2);
            }
        });
    }
}
