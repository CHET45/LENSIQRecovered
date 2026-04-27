package p000;

import android.app.Activity;
import android.app.Notification;
import android.app.Service;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.C1213a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.firebase.firestore.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;
import p000.hf0;
import p000.izc;
import p000.nfa;

/* JADX INFO: loaded from: classes3.dex */
public final class t0i {

    /* JADX INFO: renamed from: a */
    @ovh
    @Deprecated
    public static final int f83316a;

    /* JADX INFO: renamed from: b */
    @ovh
    @Deprecated
    public static final String f83317b;

    /* JADX INFO: renamed from: c */
    @ovh
    @Deprecated
    public static final String f83318c;

    /* JADX INFO: renamed from: d */
    @ovh
    @Deprecated
    public static final String f83319d;

    /* JADX INFO: renamed from: e */
    @ovh
    public static final String f83320e;

    /* JADX INFO: renamed from: f */
    @ovh
    public static final byte[] f83321f;

    /* JADX INFO: renamed from: g */
    @ovh
    public static final long[] f83322g;

    /* JADX INFO: renamed from: h */
    public static final String f83323h = "Util";

    /* JADX INFO: renamed from: i */
    public static final Pattern f83324i;

    /* JADX INFO: renamed from: j */
    public static final Pattern f83325j;

    /* JADX INFO: renamed from: k */
    public static final Pattern f83326k;

    /* JADX INFO: renamed from: l */
    public static final Pattern f83327l;

    /* JADX INFO: renamed from: m */
    public static final String f83328m = "format=m3u8-aapl";

    /* JADX INFO: renamed from: n */
    public static final String f83329n = "format=mpd-time-csf";

    /* JADX INFO: renamed from: o */
    public static final int f83330o = 120;

    /* JADX INFO: renamed from: p */
    @hib
    public static HashMap<String, String> f83331p;

    /* JADX INFO: renamed from: q */
    public static final String[] f83332q;

    /* JADX INFO: renamed from: r */
    public static final String[] f83333r;

    /* JADX INFO: renamed from: s */
    public static final int[] f83334s;

    /* JADX INFO: renamed from: t */
    public static final int[] f83335t;

    /* JADX INFO: renamed from: u */
    public static final int[] f83336u;

    /* JADX INFO: renamed from: t0i$a */
    @c5e(29)
    public static class C12842a {
        private C12842a() {
        }

        public static void startForeground(Service service, int i, Notification notification, int i2, String str) {
            try {
                service.startForeground(i, notification, i2);
            } catch (RuntimeException e) {
                xh9.m25144e("Util", "The service must be declared with a foregroundServiceType that includes " + str);
                throw e;
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f83316a = i;
        String str = Build.DEVICE;
        f83317b = str;
        String str2 = Build.MANUFACTURER;
        f83318c = str2;
        String str3 = Build.MODEL;
        f83319d = str3;
        f83320e = str + ", " + str3 + ", " + str2 + ", " + i;
        f83321f = new byte[0];
        f83322g = new long[0];
        f83324i = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f83325j = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f83326k = Pattern.compile("%([A-Fa-f0-9]{2})");
        f83327l = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f83332q = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", ufh.f87922i, "gre", "el", "fre", ufh.f87919f, "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", h62.f42461w, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f83333r = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f83334s = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f83335t = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f83336u = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, nb2.f63872t, nb2.f63871s, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, HideBottomViewOnScrollBehavior.f20939p, 166, 161, 180, 179, 186, 189, tpc.f85549b, 192, 201, gm2.f40178o, 219, 220, 213, 210, 255, 248, 241, 246, nb2.f63861i, nb2.f63862j, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, dk4.f29869f, 163, 164, 249, gsa.f40915b2, 247, 240, nb2.f63863k, nb2.f63860h, 235, 236, l87.f56762u, 198, gm2.f40180q, 200, 221, bw3.f14995j, 211, nb2.f63868p, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, nb2.f63870r, 197, gm2.f40176m, 203, nb2.f63864l, 225, nb2.f63866n, 239, 250, 253, 244, 243};
    }

    private t0i() {
    }

    @ovh
    public static long addWithOverflowDefault(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? j3 : j4;
    }

    @ovh
    @Deprecated
    @p28(imports = {"java.util.Objects"}, replacement = "Objects.equals(o1, o2)")
    public static boolean areEqual(@hib Object obj, @hib Object obj2) {
        return Objects.equals(obj, obj2);
    }

    @ovh
    public static int binarySearchCeil(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i3 = ~iBinarySearch;
        } else {
            while (true) {
                i2 = iBinarySearch + 1;
                if (i2 >= iArr.length || iArr[i2] != i) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.min(iArr.length - 1, i3) : i3;
    }

    @ovh
    public static int binarySearchFloor(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || iArr[i2] != i) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    @ovh
    @z25({"#1"})
    public static <T> T castNonNull(@hib T t) {
        return t;
    }

    @ovh
    @z25({"#1"})
    public static <T> T[] castNonNullTypeArray(T[] tArr) {
        return tArr;
    }

    @ovh
    public static int ceilDivide(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static boolean checkCleartextTrafficPermitted(nfa... nfaVarArr) {
        for (nfa nfaVar : nfaVarArr) {
            nfa.C9856h c9856h = nfaVar.f64305b;
            if (c9856h != null) {
                if (isTrafficRestricted(c9856h.f64406a)) {
                    return false;
                }
                for (int i = 0; i < nfaVar.f64305b.f64412g.size(); i++) {
                    if (isTrafficRestricted(nfaVar.f64305b.f64412g.get(i).f64433a)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @ovh
    public static void closeQuietly(@hib Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @ovh
    @Deprecated
    @p28(replacement = "Long.compare(left, right)")
    public static int compareLong(long j, long j2) {
        return Long.compare(j, j2);
    }

    @ovh
    public static int constrainValue(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    @ovh
    public static boolean contains(Object[] objArr, @hib Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    @ovh
    public static <T> boolean contentEquals(@hib SparseArray<T> sparseArray, @hib SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                return false;
            }
        }
        return true;
    }

    @ovh
    public static <T> int contentHashCode(SparseArray<T> sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int iKeyAt = 17;
        for (int i = 0; i < sparseArray.size(); i++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i)) * 31) + Objects.hashCode(sparseArray.valueAt(i));
        }
        return iKeyAt;
    }

    @ovh
    public static int crc16(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = hvh.toInt(bArr[i]);
            i3 = crc16UpdateFourBits(i4 & 15, crc16UpdateFourBits(i4 >> 4, i3));
            i++;
        }
        return i3;
    }

    private static int crc16UpdateFourBits(int i, int i2) {
        return (f83335t[(i ^ ((i2 >> 12) & 255)) & 255] ^ ((i2 << 4) & 65535)) & 65535;
    }

    @ovh
    public static int crc32(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f83334s[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    @ovh
    public static int crc8(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f83336u[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    @ovh
    public static Handler createHandler(Looper looper, @hib Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    @ovh
    public static Handler createHandlerForCurrentLooper() {
        return createHandlerForCurrentLooper(null);
    }

    @ovh
    public static Handler createHandlerForCurrentOrMainLooper() {
        return createHandlerForCurrentOrMainLooper(null);
    }

    private static HashMap<String, String> createIsoLanguageReplacementMap() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f83332q.length);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f83332q;
            if (i >= strArr.length) {
                return map;
            }
            map.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    @ovh
    public static ByteBuffer createReadOnlyByteBuffer(ByteBuffer byteBuffer) {
        return byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
    }

    @ovh
    public static File createTempDirectory(Context context, String str) throws IOException {
        File fileCreateTempFile = createTempFile(context, str);
        fileCreateTempFile.delete();
        fileCreateTempFile.mkdir();
        return fileCreateTempFile;
    }

    @ovh
    public static File createTempFile(Context context, String str) throws IOException {
        return File.createTempFile(str, null, (File) v80.checkNotNull(context.getCacheDir()));
    }

    @ovh
    public static long durationUsToSampleCount(long j, int i) {
        return scaleLargeValue(j, i, 1000000L, RoundingMode.UP);
    }

    @ovh
    public static String escapeFileName(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (shouldEscapeCharacter(str.charAt(i3))) {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder((i2 * 2) + length);
        while (i2 > 0) {
            int i4 = i + 1;
            char cCharAt = str.charAt(i);
            if (shouldEscapeCharacter(cCharAt)) {
                sb.append('%');
                sb.append(Integer.toHexString(cCharAt));
                i2--;
            } else {
                sb.append(cCharAt);
            }
            i = i4;
        }
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    @ovh
    public static Uri fixSmoothStreamingIsmManifestUri(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f83327l.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    @ovh
    public static String formatInvariant(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    @ovh
    public static String fromUtf8Bytes(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    @ovh
    public static int generateAudioSessionIdV21(Context context) {
        return he0.getAudioManager(context).generateAudioSessionId();
    }

    @hib
    public static String getAdaptiveMimeTypeForContentType(int i) {
        if (i == 0) {
            return "application/dash+xml";
        }
        if (i == 1) {
            return "application/vnd.ms-sstr+xml";
        }
        if (i != 2) {
            return null;
        }
        return "application/x-mpegURL";
    }

    @ovh
    public static int getApiLevelThatAudioFormatIntroducedAudioEncoding(int i) {
        if (i == 30) {
            return 34;
        }
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i) {
                            case 20:
                                return 30;
                            case 21:
                            case 22:
                                return 31;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
        }
    }

    @ovh
    @Deprecated
    public static int getAudioContentTypeForStreamType(int i) {
        if (i != 0) {
            if (i == 1 || i == 2 || i == 4 || i == 5 || i == 8) {
                return 4;
            }
            if (i != 10) {
                return 2;
            }
        }
        return 1;
    }

    @ovh
    public static AudioFormat getAudioFormat(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    @ovh
    @igg({"InlinedApi"})
    public static int getAudioTrackChannelConfig(int i) {
        if (i == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i == 12) {
            return 743676;
        }
        if (i == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return gm2.f40176m;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    @ovh
    public static int getAudioUsageForStreamType(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 13;
        }
        if (i == 2) {
            return 6;
        }
        int i2 = 4;
        if (i != 4) {
            i2 = 5;
            if (i != 5) {
                if (i != 8) {
                    return i != 10 ? 1 : 11;
                }
                return 3;
            }
        }
        return i2;
    }

    @ovh
    public static String getAuxiliaryTrackTypeString(int i) {
        if (i == 0) {
            return "undefined";
        }
        if (i == 1) {
            return "original";
        }
        if (i == 2) {
            return "depth-linear";
        }
        if (i == 3) {
            return "depth-inverse";
        }
        if (i == 4) {
            return "depth metadata";
        }
        throw new IllegalStateException("Unsupported auxiliary track type");
    }

    @ovh
    public static izc.C7676c getAvailableCommands(izc izcVar, izc.C7676c c7676c) {
        boolean zIsPlayingAd = izcVar.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = izcVar.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = izcVar.hasPreviousMediaItem();
        boolean zHasNextMediaItem = izcVar.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = izcVar.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = izcVar.isCurrentMediaItemDynamic();
        boolean zIsEmpty = izcVar.getCurrentTimeline().isEmpty();
        boolean z = false;
        izc.C7676c.a aVarAddIf = new izc.C7676c.a().addAll(c7676c).addIf(4, !zIsPlayingAd).addIf(5, zIsCurrentMediaItemSeekable && !zIsPlayingAd).addIf(6, zHasPreviousMediaItem && !zIsPlayingAd).addIf(7, !zIsEmpty && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd).addIf(8, zHasNextMediaItem && !zIsPlayingAd).addIf(9, !zIsEmpty && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd).addIf(10, !zIsPlayingAd).addIf(11, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        if (zIsCurrentMediaItemSeekable && !zIsPlayingAd) {
            z = true;
        }
        return aVarAddIf.addIf(12, z).build();
    }

    @ovh
    public static int getBigEndianInt(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    @ovh
    public static int getBufferFlagsFromMediaCodecFlags(int i) {
        int i2 = (i & 1) != 1 ? 0 : 1;
        return (i & 4) == 4 ? i2 | 4 : i2;
    }

    @ovh
    public static int getByteDepth(int i) {
        if (i != 2) {
            if (i == 3) {
                return 1;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    @ovh
    public static byte[] getBytesFromHexString(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    @ovh
    public static int getCodecCountOfType(@hib String str, int i) {
        int i2 = 0;
        for (String str2 : splitCodecs(str)) {
            if (i == rva.getTrackTypeOfCodec(str2)) {
                i2++;
            }
        }
        return i2;
    }

    @hib
    @ovh
    public static String getCodecsOfType(@hib String str, int i) {
        String[] strArrSplitCodecs = splitCodecs(str);
        if (strArrSplitCodecs.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplitCodecs) {
            if (i == rva.getTrackTypeOfCodec(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    @hib
    @ovh
    public static String getCodecsWithoutType(@hib String str, int i) {
        String[] strArrSplitCodecs = splitCodecs(str);
        if (strArrSplitCodecs.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplitCodecs) {
            if (i != rva.getTrackTypeOfCodec(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    @ovh
    public static String getCountryCode(@hib Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return i80.toUpperCase(networkCountryIso);
            }
        }
        return i80.toUpperCase(Locale.getDefault().getCountry());
    }

    @ovh
    public static Point getCurrentDisplayModeSize(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) v80.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return getCurrentDisplayModeSize(context, display);
    }

    @ovh
    public static Looper getCurrentOrMainLooper() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    @ovh
    public static Uri getDataUriForString(String str, String str2) {
        return Uri.parse("data:" + str + ";base64," + Base64.encodeToString(str2.getBytes(), 2));
    }

    @ovh
    public static Locale getDefaultDisplayLocale() {
        return Locale.getDefault(Locale.Category.DISPLAY);
    }

    @c5e(23)
    private static void getDisplaySizeV23(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    @ovh
    public static Drawable getDrawable(Context context, Resources resources, @gq4 int i) {
        return resources.getDrawable(i, context.getTheme());
    }

    @hib
    public static UUID getDrmUuid(String str) {
        String lowerCase = i80.toLowerCase(str);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "playready":
                return jk1.f50933o2;
            case "widevine":
                return jk1.f50928n2;
            case "clearkey":
                return jk1.f50923m2;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    @ovh
    public static int getErrorCodeForMediaDrmErrorCode(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    @ovh
    public static int getErrorCodeFromPlatformDiagnosticsInfo(@hib String str) {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = split(str, p43.f69617m)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            int i = Integer.parseInt((String) v80.checkNotNull(str2));
            return z ? -i : i;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @ovh
    public static String getFormatSupportString(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    @ovh
    public static int getInt24(ByteBuffer byteBuffer, int i) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byte b = byteBuffer.get(byteOrderOrder == byteOrder ? i : i + 2);
        byte b2 = byteBuffer.get(i + 1);
        if (byteBuffer.order() == byteOrder) {
            i += 2;
        }
        return (((byteBuffer.get(i) << 8) & 65280) | (((b << 24) & (-16777216)) | ((b2 << 16) & 16711680))) >> 8;
    }

    @ovh
    public static int getIntegerCodeForString(String str) {
        int length = str.length();
        v80.checkArgument(length <= 4);
        int iCharAt = 0;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt << 8) | str.charAt(i);
        }
        return iCharAt;
    }

    @ovh
    public static String getLocaleLanguageTag(Locale locale) {
        return locale.toLanguageTag();
    }

    @ovh
    public static int getMaxPendingFramesCountForMediaCodecDecoders(Context context) {
        return isFrameDropAllowedOnSurfaceInput(context) ? 1 : 5;
    }

    @ovh
    public static long getMediaDurationForPlayoutDuration(long j, float f) {
        return f == 1.0f ? j : Math.round(j * ((double) f));
    }

    @ovh
    public static long getNowUnixTimeMs(long j) {
        return j == -9223372036854775807L ? System.currentTimeMillis() : j + SystemClock.elapsedRealtime();
    }

    @ovh
    public static int getPcmEncoding(int i) {
        return getPcmEncoding(i, ByteOrder.LITTLE_ENDIAN);
    }

    @ovh
    public static C1213a getPcmFormat(int i, int i2, int i3) {
        return new C1213a.b().setSampleMimeType("audio/raw").setChannelCount(i2).setSampleRate(i3).setPcmEncoding(i).build();
    }

    @ovh
    public static int getPcmFrameSize(int i, int i2) {
        return getByteDepth(i) * i2;
    }

    @ovh
    public static long getPlayoutDurationForMediaDuration(long j, float f) {
        return f == 1.0f ? j : Math.round(j / ((double) f));
    }

    @ovh
    public static List<String> getRoleFlagStrings(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("main");
        }
        if ((i & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i & 16384) != 0) {
            arrayList.add("trick-play");
        }
        if ((i & 32768) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    @ovh
    public static List<String> getSelectionFlagStrings(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i & 1) != 0) {
            arrayList.add("default");
        }
        if ((i & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    @ovh
    @Deprecated
    public static int getStreamTypeForAudioUsage(int i) {
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    @ovh
    public static String getStringForTime(StringBuilder sb, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        String str = j < 0 ? "-" : "";
        long jAbs = (Math.abs(j) + 500) / 1000;
        long j2 = jAbs % 60;
        long j3 = (jAbs / 60) % 60;
        long j4 = jAbs / 3600;
        sb.setLength(0);
        return j4 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j3), Long.valueOf(j2)).toString();
    }

    @ovh
    public static String[] getSystemLanguageCodes() {
        String[] systemLocales = getSystemLocales();
        for (int i = 0; i < systemLocales.length; i++) {
            systemLocales[i] = normalizeLanguageCode(systemLocales[i]);
        }
        return systemLocales;
    }

    private static String[] getSystemLocales() {
        return getSystemLocalesV24(Resources.getSystem().getConfiguration());
    }

    @c5e(24)
    private static String[] getSystemLocalesV24(Configuration configuration) {
        return split(configuration.getLocales().toLanguageTags(), ",");
    }

    @hib
    private static String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            xh9.m25145e("Util", "Failed to read system property " + str, e);
            return null;
        }
    }

    @ovh
    public static String getTrackTypeString(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i < 10000) {
                    return "?";
                }
                return "custom (" + i + c0b.f15434d;
        }
    }

    public static String getUserAgent(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + pj4.f71071b + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") " + dga.f29601c;
    }

    @ovh
    public static byte[] getUtf8Bytes(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    @ovh
    public static byte[] gzip(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public static boolean handlePauseButtonAction(@hib izc izcVar) {
        if (izcVar == null || !izcVar.isCommandAvailable(1)) {
            return false;
        }
        izcVar.pause();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean handlePlayButtonAction(@p000.hib p000.izc r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.getPlaybackState()
            r2 = 1
            if (r1 != r2) goto L17
            r3 = 2
            boolean r3 = r4.isCommandAvailable(r3)
            if (r3 == 0) goto L17
            r4.prepare()
        L15:
            r0 = r2
            goto L24
        L17:
            r3 = 4
            if (r1 != r3) goto L24
            boolean r1 = r4.isCommandAvailable(r3)
            if (r1 == 0) goto L24
            r4.seekToDefaultPosition()
            goto L15
        L24:
            boolean r1 = r4.isCommandAvailable(r2)
            if (r1 == 0) goto L2e
            r4.play()
            goto L2f
        L2e:
            r2 = r0
        L2f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.t0i.handlePlayButtonAction(izc):boolean");
    }

    public static boolean handlePlayPauseButtonAction(@hib izc izcVar) {
        return handlePlayPauseButtonAction(izcVar, true);
    }

    @ovh
    @Deprecated
    public static int inferContentType(Uri uri, @hib String str) {
        return TextUtils.isEmpty(str) ? inferContentType(uri) : inferContentTypeForExtension(str);
    }

    public static int inferContentTypeForExtension(String str) {
        String lowerCase = i80.toLowerCase(str);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static int inferContentTypeForUriAndMimeType(Uri uri, @hib String str) {
        if (str == null) {
            return inferContentType(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    @ovh
    public static boolean inflate(jhc jhcVar, jhc jhcVar2, @hib Inflater inflater) {
        if (jhcVar.bytesLeft() == 0) {
            return false;
        }
        if (jhcVar2.capacity() < jhcVar.bytesLeft()) {
            jhcVar2.ensureCapacity(jhcVar.bytesLeft() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(jhcVar.getData(), jhcVar.getPosition(), jhcVar.bytesLeft());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(jhcVar2.getData(), iInflate, jhcVar2.capacity() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (iInflate == jhcVar2.capacity()) {
                        jhcVar2.ensureCapacity(jhcVar2.capacity() * 2);
                    }
                } else {
                    jhcVar2.setLimit(iInflate);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    @ovh
    public static String intToStringMaxRadix(int i) {
        return Integer.toString(i, 36);
    }

    private static boolean isAppSpecificStorageFileUri(Activity activity, Uri uri) {
        try {
            String path = uri.getPath();
            if (path == null) {
                return false;
            }
            String canonicalPath = new File(path).getCanonicalPath();
            String canonicalPath2 = activity.getFilesDir().getCanonicalPath();
            String canonicalPath3 = null;
            File externalFilesDir = activity.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                canonicalPath3 = externalFilesDir.getCanonicalPath();
            }
            if (!canonicalPath.startsWith(canonicalPath2)) {
                if (canonicalPath3 == null) {
                    return false;
                }
                if (!canonicalPath.startsWith(canonicalPath3)) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @ovh
    public static boolean isAutomotive(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    @ovh
    public static boolean isBitmapFactorySupportedMimeType(String str) {
        str.hashCode();
        switch (str) {
            case "image/avif":
                return Build.VERSION.SDK_INT >= 34;
            case "image/heic":
            case "image/heif":
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    @ovh
    public static boolean isEncodingHighResolutionPcm(int i) {
        return i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    @ovh
    public static boolean isEncodingLinearPcm(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    @p000.ovh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isFrameDropAllowedOnSurfaceInput(android.content.Context r2) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L35
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            int r2 = r2.targetSdkVersion
            if (r2 < r1) goto L35
            r2 = 30
            if (r0 != r2) goto L24
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r1 = "moto g(20)"
            boolean r1 = p000.i80.equalsIgnoreCase(r2, r1)
            if (r1 != 0) goto L35
            java.lang.String r1 = "rmx3231"
            boolean r2 = p000.i80.equalsIgnoreCase(r2, r1)
            if (r2 != 0) goto L35
        L24:
            r2 = 34
            if (r0 != r2) goto L33
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r0 = "sm-x200"
            boolean r2 = p000.i80.equalsIgnoreCase(r2, r0)
            if (r2 == 0) goto L33
            goto L35
        L33:
            r2 = 0
            goto L36
        L35:
            r2 = 1
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.t0i.isFrameDropAllowedOnSurfaceInput(android.content.Context):boolean");
    }

    @ovh
    public static boolean isLinebreak(int i) {
        return i == 10 || i == 13;
    }

    @ovh
    public static boolean isLocalFileUri(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || Objects.equals(scheme, "file");
    }

    private static boolean isMediaStoreExternalContentUri(Uri uri) {
        if (!Objects.equals(uri.getScheme(), "content") || !Objects.equals(uri.getAuthority(), "media")) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.isEmpty()) {
            return false;
        }
        String str = pathSegments.get(0);
        return "external".equals(str) || "external_primary".equals(str);
    }

    @sy1(api = 23)
    private static boolean isReadStoragePermissionRequestNeeded(Activity activity, Uri uri) {
        return isLocalFileUri(uri) ? !isAppSpecificStorageFileUri(activity, uri) : isMediaStoreExternalContentUri(uri);
    }

    @ovh
    public static boolean isRunningOnEmulator() {
        String lowerCase = i80.toLowerCase(Build.DEVICE);
        return lowerCase.contains(BuildConfig.TARGET_BACKEND) || lowerCase.contains("emu64a") || lowerCase.contains("emu64x") || lowerCase.contains("generic");
    }

    @ovh
    public static boolean isSorted(long[] jArr) {
        int i = 0;
        while (i < jArr.length - 1) {
            long j = jArr[i];
            i++;
            if (j > jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @c5e(api = 24)
    private static boolean isTrafficRestricted(Uri uri) {
        return "http".equals(uri.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) v80.checkNotNull(uri.getHost()));
    }

    @ovh
    public static boolean isTv(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    @ovh
    public static boolean isWear(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$newSingleThreadExecutor$3(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$newSingleThreadScheduledExecutor$4(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$postOrRunWithCompletion$0(y6f y6fVar, Runnable runnable, Object obj) {
        try {
            if (y6fVar.isCancelled()) {
                return;
            }
            runnable.run();
            y6fVar.set(obj);
        } catch (Throwable th) {
            y6fVar.setException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$transformFutureAsync$1(y6f y6fVar, ja9 ja9Var) {
        if (y6fVar.isCancelled()) {
            ja9Var.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$transformFutureAsync$2(ja9 ja9Var, y6f y6fVar, v90 v90Var) {
        try {
            try {
                y6fVar.setFuture(v90Var.apply(w17.getDone(ja9Var)));
            } catch (Throwable th) {
                y6fVar.setException(th);
            }
        } catch (Error e) {
            e = e;
            y6fVar.setException(e);
        } catch (CancellationException unused) {
            y6fVar.cancel(false);
        } catch (RuntimeException e2) {
            e = e2;
            y6fVar.setException(e);
        } catch (ExecutionException e3) {
            e = e3;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            y6fVar.setException(e);
        }
    }

    @ovh
    public static int linearSearch(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @ovh
    public static String loadAsset(Context context, String str) throws IOException {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return fromUtf8Bytes(tj1.toByteArray(inputStreamOpen));
        } finally {
            closeQuietly(inputStreamOpen);
        }
    }

    @ovh
    public static long maxValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < sparseLongArray.size(); i++) {
            jMax = Math.max(jMax, sparseLongArray.valueAt(i));
        }
        return jMax;
    }

    @ovh
    public static boolean maybeInflate(jhc jhcVar, jhc jhcVar2, @hib Inflater inflater) {
        return jhcVar.bytesLeft() > 0 && jhcVar.peekUnsignedByte() == 120 && inflate(jhcVar, jhcVar2, inflater);
    }

    private static String maybeReplaceLegacyLanguageTags(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f83333r;
            if (i >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i])) {
                return strArr[i + 1] + str.substring(strArr[i].length());
            }
            i += 2;
        }
    }

    @Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri... uriArr) {
        for (Uri uri : uriArr) {
            if (maybeRequestReadStoragePermission(activity, uri)) {
                return true;
            }
        }
        return false;
    }

    public static boolean maybeRequestReadStoragePermission(Activity activity, nfa... nfaVarArr) {
        for (nfa nfaVar : nfaVarArr) {
            nfa.C9856h c9856h = nfaVar.f64305b;
            if (c9856h != null) {
                if (maybeRequestReadStoragePermission(activity, c9856h.f64406a)) {
                    return true;
                }
                kx7<nfa.C9859k> kx7Var = nfaVar.f64305b.f64412g;
                for (int i = 0; i < kx7Var.size(); i++) {
                    if (maybeRequestReadStoragePermission(activity, kx7Var.get(i).f64433a)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @ovh
    public static long minValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < sparseLongArray.size(); i++) {
            jMin = Math.min(jMin, sparseLongArray.valueAt(i));
        }
        return jMin;
    }

    @ovh
    public static <T> void moveItems(List<T> list, int i, int i2, int i3) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i4 = (i2 - i) - 1; i4 >= 0; i4--) {
            arrayDeque.addFirst(list.remove(i + i4));
        }
        list.addAll(Math.min(i3, list.size()), arrayDeque);
    }

    @ovh
    public static long msToUs(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    @ovh
    public static ExecutorService newSingleThreadExecutor(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: m0i
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return t0i.lambda$newSingleThreadExecutor$3(str, runnable);
            }
        });
    }

    @ovh
    public static ScheduledExecutorService newSingleThreadScheduledExecutor(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: p0i
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return t0i.lambda$newSingleThreadScheduledExecutor$4(str, runnable);
            }
        });
    }

    @ovh
    public static String normalizeLanguageCode(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String lowerCase = i80.toLowerCase(str);
        String str2 = splitAtFirst(lowerCase, "-")[0];
        if (f83331p == null) {
            f83331p = createIsoLanguageReplacementMap();
        }
        String str3 = f83331p.get(str2);
        if (str3 != null) {
            lowerCase = str3 + lowerCase.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? maybeReplaceLegacyLanguageTags(lowerCase) : lowerCase;
    }

    @ovh
    public static <T> T[] nullSafeArrayAppend(T[] tArr, T t) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t;
        return (T[]) castNonNullTypeArray(objArrCopyOf);
    }

    @ovh
    public static <T> T[] nullSafeArrayConcatenation(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    @ovh
    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i) {
        v80.checkArgument(i <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i);
    }

    @ovh
    public static <T> T[] nullSafeArrayCopyOfRange(T[] tArr, int i, int i2) {
        v80.checkArgument(i >= 0);
        v80.checkArgument(i2 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i, i2);
    }

    @ovh
    public static <T> void nullSafeListToArray(List<T> list, T[] tArr) {
        v80.checkState(list.size() == tArr.length);
        list.toArray(tArr);
    }

    @ovh
    public static long parseXsDateTime(String str) throws yhc {
        Matcher matcher = f83324i.matcher(str);
        if (!matcher.matches()) {
            throw yhc.createForMalformedContainer("Invalid date/time format: " + str, null);
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - (((long) i) * 60000) : timeInMillis;
    }

    @ovh
    public static long parseXsDuration(String str) {
        Matcher matcher = f83325j.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d2 = d + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d3 = d2 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d4 = d3 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d5 = d4 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j = (long) ((d5 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j : j;
    }

    @ovh
    public static float percentFloat(long j, long j2) {
        if (j2 == 0 || j != j2) {
            return (j / j2) * 100.0f;
        }
        return 100.0f;
    }

    @ovh
    public static int percentInt(long j, long j2) {
        long jSaturatedMultiply = nl9.saturatedMultiply(j, 100L);
        return rd8.checkedCast((jSaturatedMultiply == Long.MAX_VALUE || jSaturatedMultiply == Long.MIN_VALUE) ? j / (j2 / 100) : jSaturatedMultiply / j2);
    }

    @ovh
    public static boolean postOrRun(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    @ovh
    public static <T> ja9<T> postOrRunWithCompletion(Handler handler, final Runnable runnable, final T t) {
        final y6f y6fVarCreate = y6f.create();
        postOrRun(handler, new Runnable() { // from class: o0i
            @Override // java.lang.Runnable
            public final void run() {
                t0i.lambda$postOrRunWithCompletion$0(y6fVarCreate, runnable, t);
            }
        });
        return y6fVarCreate;
    }

    @ovh
    public static void putInt24(ByteBuffer byteBuffer, int i) {
        v80.checkArgument(((-16777216) & i) == 0 || (i & (-8388608)) == -8388608, "Value out of range of 24-bit integer: " + Integer.toHexString(i));
        v80.checkArgument(byteBuffer.remaining() >= 3);
        ByteOrder byteOrderOrder = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byteBuffer.put((byte) (byteOrderOrder == byteOrder ? (i & 16711680) >> 16 : i & 255)).put((byte) ((65280 & i) >> 8)).put((byte) (byteBuffer.order() == byteOrder ? i & 255 : (i & 16711680) >> 16));
    }

    @ovh
    public static boolean readBoolean(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    @ovh
    public static void recursiveDelete(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    @hib
    @ovh
    public static Intent registerReceiverNotExported(Context context, @hib BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return Build.VERSION.SDK_INT < 33 ? context.registerReceiver(broadcastReceiver, intentFilter) : context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    @ovh
    public static <T> void removeRange(List<T> list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        }
        if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    @c5e(api = 23)
    private static boolean requestExternalStoragePermission(Activity activity) {
        if (activity.checkSelfPermission(xnc.f98579D) == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{xnc.f98579D}, 0);
        return true;
    }

    @c5e(api = 33)
    private static boolean requestReadMediaPermissions(Activity activity) {
        if (activity.checkSelfPermission(xnc.f98623t) == 0 && activity.checkSelfPermission(xnc.f98622s) == 0 && activity.checkSelfPermission(xnc.f98621r) == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{xnc.f98623t, xnc.f98621r, xnc.f98622s}, 0);
        return true;
    }

    @ovh
    public static long sampleCountToDurationUs(long j, int i) {
        return scaleLargeValue(j, 1000000L, i, RoundingMode.DOWN);
    }

    @ovh
    public static long scaleLargeTimestamp(long j, long j2, long j3) {
        return scaleLargeValue(j, j2, j3, RoundingMode.DOWN);
    }

    @ovh
    public static long[] scaleLargeTimestamps(List<Long> list, long j, long j2) {
        return scaleLargeValues(list, j, j2, RoundingMode.DOWN);
    }

    @ovh
    public static void scaleLargeTimestampsInPlace(long[] jArr, long j, long j2) {
        scaleLargeValuesInPlace(jArr, j, j2, RoundingMode.DOWN);
    }

    @ovh
    public static long scaleLargeValue(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        return (j3 < j2 || j3 % j2 != 0) ? (j3 >= j2 || j2 % j3 != 0) ? (j3 < j || j3 % j != 0) ? (j3 >= j || j % j3 != 0) ? scaleLargeValueFallback(j, j2, j3, roundingMode) : nl9.saturatedMultiply(j2, nl9.divide(j, j3, RoundingMode.UNNECESSARY)) : nl9.divide(j2, nl9.divide(j3, j, RoundingMode.UNNECESSARY), roundingMode) : nl9.saturatedMultiply(j, nl9.divide(j2, j3, RoundingMode.UNNECESSARY)) : nl9.divide(j, nl9.divide(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
    }

    private static long scaleLargeValueFallback(long j, long j2, long j3, RoundingMode roundingMode) {
        long jSaturatedMultiply = nl9.saturatedMultiply(j, j2);
        if (jSaturatedMultiply != Long.MAX_VALUE && jSaturatedMultiply != Long.MIN_VALUE) {
            return nl9.divide(jSaturatedMultiply, j3, roundingMode);
        }
        long jGcd = nl9.gcd(Math.abs(j2), Math.abs(j3));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jDivide = nl9.divide(j2, jGcd, roundingMode2);
        long jDivide2 = nl9.divide(j3, jGcd, roundingMode2);
        long jGcd2 = nl9.gcd(Math.abs(j), Math.abs(jDivide2));
        long jDivide3 = nl9.divide(j, jGcd2, roundingMode2);
        long jDivide4 = nl9.divide(jDivide2, jGcd2, roundingMode2);
        long jSaturatedMultiply2 = nl9.saturatedMultiply(jDivide3, jDivide);
        if (jSaturatedMultiply2 != Long.MAX_VALUE && jSaturatedMultiply2 != Long.MIN_VALUE) {
            return nl9.divide(jSaturatedMultiply2, jDivide4, roundingMode);
        }
        double d = jDivide3 * (jDivide / jDivide4);
        if (d > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return dk4.roundToLong(d, roundingMode);
    }

    @ovh
    public static long[] scaleLargeValues(List<Long> list, long j, long j2, RoundingMode roundingMode) {
        int i;
        int size = list.size();
        long[] jArr = new long[size];
        if (j == 0) {
            return jArr;
        }
        int i2 = 0;
        if (j2 >= j && j2 % j == 0) {
            long jDivide = nl9.divide(j2, j, RoundingMode.UNNECESSARY);
            while (i2 < size) {
                jArr[i2] = nl9.divide(list.get(i2).longValue(), jDivide, roundingMode);
                i2++;
            }
            return jArr;
        }
        if (j2 < j && j % j2 == 0) {
            long jDivide2 = nl9.divide(j, j2, RoundingMode.UNNECESSARY);
            while (i2 < size) {
                jArr[i2] = nl9.saturatedMultiply(list.get(i2).longValue(), jDivide2);
                i2++;
            }
            return jArr;
        }
        int i3 = 0;
        while (i3 < size) {
            long jLongValue = list.get(i3).longValue();
            if (jLongValue != 0) {
                if (j2 >= jLongValue && j2 % jLongValue == 0) {
                    jArr[i3] = nl9.divide(j, nl9.divide(j2, jLongValue, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= jLongValue || jLongValue % j2 != 0) {
                    i = i3;
                    jArr[i] = scaleLargeValueFallback(jLongValue, j, j2, roundingMode);
                } else {
                    jArr[i3] = nl9.saturatedMultiply(j, nl9.divide(jLongValue, j2, RoundingMode.UNNECESSARY));
                }
                i = i3;
            } else {
                i = i3;
            }
            i3 = i + 1;
        }
        return jArr;
    }

    @ovh
    public static void scaleLargeValuesInPlace(long[] jArr, long j, long j2, RoundingMode roundingMode) {
        if (j == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i = 0;
        if (j2 >= j && j2 % j == 0) {
            long jDivide = nl9.divide(j2, j, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = nl9.divide(jArr[i], jDivide, roundingMode);
                i++;
            }
            return;
        }
        if (j2 < j && j % j2 == 0) {
            long jDivide2 = nl9.divide(j, j2, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = nl9.saturatedMultiply(jArr[i], jDivide2);
                i++;
            }
            return;
        }
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 != 0) {
                if (j2 >= j3 && j2 % j3 == 0) {
                    jArr[i2] = nl9.divide(j, nl9.divide(j2, j3, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j3 || j3 % j2 != 0) {
                    jArr[i2] = scaleLargeValueFallback(j3, j, j2, roundingMode);
                } else {
                    jArr[i2] = nl9.saturatedMultiply(j, nl9.divide(j3, j2, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    @ovh
    public static void setForegroundServiceNotification(Service service, int i, Notification notification, int i2, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            C12842a.startForeground(service, i, notification, i2, str);
        } else {
            service.startForeground(i, notification);
        }
    }

    @ovh
    @a35(expression = {"#1"}, result = true)
    public static boolean shouldEnablePlayPauseButton(@hib izc izcVar) {
        return (izcVar == null || !izcVar.isCommandAvailable(1) || (izcVar.isCommandAvailable(17) && izcVar.getCurrentTimeline().isEmpty())) ? false : true;
    }

    private static boolean shouldEscapeCharacter(char c) {
        return c == '\"' || c == '%' || c == '*' || c == '/' || c == ':' || c == '<' || c == '\\' || c == '|' || c == '>' || c == '?';
    }

    @a35(expression = {"#1"}, result = false)
    public static boolean shouldShowPlayButton(@hib izc izcVar) {
        return shouldShowPlayButton(izcVar, true);
    }

    @ovh
    public static void sneakyThrow(Throwable th) throws Throwable {
        sneakyThrowInternal(th);
    }

    private static <T extends Throwable> void sneakyThrowInternal(Throwable th) throws Throwable {
        throw th;
    }

    @ovh
    public static String[] split(String str, String str2) {
        return str.split(str2, -1);
    }

    @ovh
    public static String[] splitAtFirst(String str, String str2) {
        return str.split(str2, 2);
    }

    @ovh
    public static String[] splitCodecs(@hib String str) {
        return TextUtils.isEmpty(str) ? new String[0] : split(str.trim(), "(\\s*,\\s*)");
    }

    @hib
    @ovh
    public static ComponentName startForegroundService(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }

    @ovh
    public static long subtractWithOverflowDefault(long j, long j2, long j3) {
        long j4 = j - j2;
        return ((j ^ j4) & (j2 ^ j)) < 0 ? j3 : j4;
    }

    @ovh
    public static long sum(long... jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        return j;
    }

    @ovh
    public static boolean tableExists(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    @ovh
    @Deprecated
    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        return tj1.toByteArray(inputStream);
    }

    @ovh
    public static String toHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(Character.forDigit((bArr[i] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i] & 15, 16));
        }
        return sb.toString();
    }

    @ovh
    public static long toLong(int i, int i2) {
        return toUnsignedLong(i2) | (toUnsignedLong(i) << 32);
    }

    @ovh
    public static long toUnsignedLong(int i) {
        return ((long) i) & 4294967295L;
    }

    @ovh
    public static <T, U> ja9<T> transformFutureAsync(final ja9<U> ja9Var, final v90<U, T> v90Var) {
        final y6f y6fVarCreate = y6f.create();
        y6fVarCreate.addListener(new Runnable() { // from class: g0i
            @Override // java.lang.Runnable
            public final void run() {
                t0i.lambda$transformFutureAsync$1(y6fVarCreate, ja9Var);
            }
        }, xya.directExecutor());
        ja9Var.addListener(new Runnable() { // from class: j0i
            @Override // java.lang.Runnable
            public final void run() {
                t0i.lambda$transformFutureAsync$2(ja9Var, y6fVarCreate, v90Var);
            }
        }, xya.directExecutor());
        return y6fVarCreate;
    }

    @hib
    @ovh
    public static String unescapeFileName(String str) {
        int length = str.length();
        int iEnd = 0;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == '%') {
                i++;
            }
        }
        if (i == 0) {
            return str;
        }
        int i3 = length - (i * 2);
        StringBuilder sb = new StringBuilder(i3);
        Matcher matcher = f83326k.matcher(str);
        while (i > 0 && matcher.find()) {
            char c = (char) Integer.parseInt((String) v80.checkNotNull(matcher.group(1)), 16);
            sb.append((CharSequence) str, iEnd, matcher.start());
            sb.append(c);
            iEnd = matcher.end();
            i--;
        }
        if (iEnd < length) {
            sb.append((CharSequence) str, iEnd, length);
        }
        if (sb.length() != i3) {
            return null;
        }
        return sb.toString();
    }

    @ovh
    public static long usToMs(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    @ovh
    public static void writeBoolean(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    @ovh
    public static long ceilDivide(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    @ovh
    public static long constrainValue(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    @ovh
    public static Handler createHandlerForCurrentLooper(@hib Handler.Callback callback) {
        return createHandler((Looper) v80.checkStateNotNull(Looper.myLooper()), callback);
    }

    @ovh
    public static Handler createHandlerForCurrentOrMainLooper(@hib Handler.Callback callback) {
        return createHandler(getCurrentOrMainLooper(), callback);
    }

    @ovh
    public static String fromUtf8Bytes(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, StandardCharsets.UTF_8);
    }

    @ovh
    public static int getPcmEncoding(int i, ByteOrder byteOrder) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i == 24) {
            if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                return 21;
            }
            return jk1.f50761D;
        }
        if (i != 32) {
            return 0;
        }
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            return 22;
        }
        return jk1.f50771F;
    }

    @ovh
    public static boolean handlePlayPauseButtonAction(@hib izc izcVar, boolean z) {
        return shouldShowPlayButton(izcVar, z) ? handlePlayButtonAction(izcVar) : handlePauseButtonAction(izcVar);
    }

    @ovh
    @a35(expression = {"#1"}, result = false)
    public static boolean shouldShowPlayButton(@hib izc izcVar, boolean z) {
        if (izcVar == null || !izcVar.getPlayWhenReady() || izcVar.getPlaybackState() == 1 || izcVar.getPlaybackState() == 4) {
            return true;
        }
        return (!z || izcVar.getPlaybackSuppressionReason() == 0 || izcVar.getPlaybackSuppressionReason() == 4) ? false : true;
    }

    @ovh
    public static byte[] toByteArray(int... iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        int i = 0;
        for (int i2 : iArr) {
            bArr[i] = (byte) (i2 >> 24);
            bArr[i + 1] = (byte) (i2 >> 16);
            int i3 = i + 3;
            bArr[i + 2] = (byte) (i2 >> 8);
            i += 4;
            bArr[i3] = (byte) i2;
        }
        return bArr;
    }

    @ovh
    public static float constrainValue(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    @ovh
    public static <T> boolean contains(SparseArray<T> sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    @ovh
    public static int linearSearch(long[] jArr, long j) {
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i] == j) {
                return i;
            }
        }
        return -1;
    }

    @Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, nfa... nfaVarArr) {
        return maybeRequestReadStoragePermission(activity, nfaVarArr);
    }

    @ovh
    public static int binarySearchCeil(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i2 = ~iBinarySearch;
        } else {
            while (true) {
                i = iBinarySearch + 1;
                if (i >= jArr.length || jArr[i] != j) {
                    break;
                }
                iBinarySearch = i;
            }
            i2 = z ? iBinarySearch : i;
        }
        return z2 ? Math.min(jArr.length - 1, i2) : i2;
    }

    @ovh
    public static int binarySearchFloor(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i = iBinarySearch - 1;
                if (i < 0 || jArr[i] != j) {
                    break;
                }
                iBinarySearch = i;
            }
            i2 = z ? iBinarySearch : i;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static int inferContentType(Uri uri) {
        int iInferContentTypeForExtension;
        String scheme = uri.getScheme();
        if (scheme != null && (i80.equalsIgnoreCase("rtsp", scheme) || i80.equalsIgnoreCase("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iInferContentTypeForExtension = inferContentTypeForExtension(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iInferContentTypeForExtension;
        }
        Matcher matcher = f83327l.matcher((CharSequence) v80.checkNotNull(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    @ovh
    public static <T extends Comparable<? super T>> int binarySearchCeil(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int i2;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i2 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i = iBinarySearch + 1;
                if (i >= size || list.get(i).compareTo(t) != 0) {
                    break;
                }
                iBinarySearch = i;
            }
            i2 = z ? iBinarySearch : i;
        }
        return z2 ? Math.min(list.size() - 1, i2) : i2;
    }

    @ovh
    public static <T extends Comparable<? super T>> int binarySearchFloor(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int i2;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i = iBinarySearch - 1;
                if (i < 0 || list.get(i).compareTo(t) != 0) {
                    break;
                }
                iBinarySearch = i;
            }
            i2 = z ? iBinarySearch : i;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    @ovh
    public static C1213a getPcmFormat(hf0.C6832a c6832a) {
        return getPcmFormat(c6832a.f43352c, c6832a.f43351b, c6832a.f43350a);
    }

    private static boolean maybeRequestReadStoragePermission(Activity activity, Uri uri) {
        if (!isReadStoragePermissionRequestNeeded(activity, uri)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 33) {
            return requestExternalStoragePermission(activity);
        }
        return requestReadMediaPermissions(activity);
    }

    @ovh
    public static Point getCurrentDisplayModeSize(Context context, Display display) {
        String systemProperty;
        if (display.getDisplayId() == 0 && isTv(context)) {
            if (Build.VERSION.SDK_INT < 28) {
                systemProperty = getSystemProperty("sys.display-size");
            } else {
                systemProperty = getSystemProperty("vendor.display-size");
            }
            if (!TextUtils.isEmpty(systemProperty)) {
                try {
                    String[] strArrSplit = split(systemProperty.trim(), "x");
                    if (strArrSplit.length == 2) {
                        int i = Integer.parseInt(strArrSplit[0]);
                        int i2 = Integer.parseInt(strArrSplit[1]);
                        if (i > 0 && i2 > 0) {
                            return new Point(i, i2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                xh9.m25144e("Util", "Invalid display size: " + systemProperty);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, ff4.f36353b);
            }
        }
        Point point = new Point();
        getDisplaySizeV23(display, point);
        return point;
    }

    @ovh
    public static byte[] toByteArray(float f) {
        return rd8.toByteArray(Float.floatToIntBits(f));
    }

    @ovh
    public static int binarySearchFloor(pk9 pk9Var, long j, boolean z, boolean z2) {
        int i;
        int size = pk9Var.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            if (pk9Var.get(i3) < j) {
                i2 = i3 + 1;
            } else {
                size = i3 - 1;
            }
        }
        if (z && (i = size + 1) < pk9Var.size() && pk9Var.get(i) == j) {
            return i;
        }
        if (z2 && size == -1) {
            return 0;
        }
        return size;
    }

    @ovh
    @Deprecated
    public static int inferContentType(String str) {
        return inferContentType(Uri.parse("file:///" + str));
    }
}
