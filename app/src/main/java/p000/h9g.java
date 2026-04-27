package p000;

import com.arthenica.ffmpegkit.MediaInformation;
import com.blankj.utilcode.util.C2473f;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,817:1\n1179#2,2:818\n1#3:820\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:818,2\n*E\n"})
public class h9g extends g9g {
    @t28
    private static final String String(byte[] bArr, int i, int i2, Charset charset) {
        md8.checkNotNullParameter(bArr, "bytes");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new String(bArr, i, i2, charset);
    }

    @t64(warningSince = "1.5")
    @yfb
    @q64(message = "Use replaceFirstChar instead.", replaceWith = @i2e(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    public static final String capitalize(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        md8.checkNotNullExpressionValue(locale, "getDefault(...)");
        return capitalize(str, locale);
    }

    @t28
    private static final int codePointAt(String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        return str.codePointAt(i);
    }

    @t28
    private static final int codePointBefore(String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        return str.codePointBefore(i);
    }

    @t28
    private static final int codePointCount(String str, int i, int i2) {
        md8.checkNotNullParameter(str, "<this>");
        return str.codePointCount(i, i2);
    }

    public static final int compareTo(@yfb String str, @yfb String str2, boolean z) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "other");
        return z ? str.compareToIgnoreCase(str2) : str.compareTo(str2);
    }

    public static /* synthetic */ int compareTo$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return compareTo(str, str2, z);
    }

    @jjf(version = "1.4")
    @yfb
    public static String concatToString(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public static /* synthetic */ String concatToString$default(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        return concatToString(cArr, i, i2);
    }

    @t28
    private static final boolean contentEquals(String str, CharSequence charSequence) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    @t64(warningSince = "1.5")
    @yfb
    @q64(message = "Use replaceFirstChar instead.", replaceWith = @i2e(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    public static final String decapitalize(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Locale locale = Locale.getDefault();
        md8.checkNotNullExpressionValue(locale, "getDefault(...)");
        md8.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        sb.append(lowerCase);
        String strSubstring2 = str.substring(1);
        md8.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    @jjf(version = "1.4")
    @yfb
    public static String decodeToString(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, xw1.f99524b);
    }

    public static /* synthetic */ String decodeToString$default(byte[] bArr, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return decodeToString(bArr, i, i2, z);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ byte[] m12285e(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        byte[] bytes = str.getBytes(charset);
        md8.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @jjf(version = "1.4")
    @yfb
    public static byte[] encodeToByteArray(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(xw1.f99524b);
        md8.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return encodeToByteArray(str, i, i2, z);
    }

    public static boolean endsWith(@yfb String str, @yfb String str2, boolean z) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "suffix");
        return !z ? str.endsWith(str2) : regionMatches(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean endsWith$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return endsWith(str, str2, z);
    }

    public static boolean equals(@gib String str, @gib String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean equals$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return equals(str, str2, z);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ char[] m12286f(String str, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = str.length();
        }
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(cArr, FirebaseAnalytics.C3552d.f23234z);
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    @t28
    private static final String format(String str, Object... objArr) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(objArr, C2473f.f17565y);
        String str2 = String.format(str, Arrays.copyOf(objArr, objArr.length));
        md8.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Pattern m12287g(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        md8.checkNotNullParameter(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i);
        md8.checkNotNullExpressionValue(patternCompile, "compile(...)");
        return patternCompile;
    }

    @yfb
    public static Comparator<String> getCASE_INSENSITIVE_ORDER(@yfb l7g l7gVar) {
        md8.checkNotNullParameter(l7gVar, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        md8.checkNotNullExpressionValue(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    @t28
    private static final String intern(String str) {
        md8.checkNotNullParameter(str, "<this>");
        String strIntern = str.intern();
        md8.checkNotNullExpressionValue(strIntern, "intern(...)");
        return strIntern;
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    @t28
    private static final String lowercase(String str) {
        md8.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @t28
    private static final int nativeIndexOf(String str, char c, int i) {
        md8.checkNotNullParameter(str, "<this>");
        return str.indexOf(c, i);
    }

    @t28
    private static final int nativeLastIndexOf(String str, char c, int i) {
        md8.checkNotNullParameter(str, "<this>");
        return str.lastIndexOf(c, i);
    }

    @t28
    private static final int offsetByCodePoints(String str, int i, int i2) {
        md8.checkNotNullParameter(str, "<this>");
        return str.offsetByCodePoints(i, i2);
    }

    public static final boolean regionMatches(@yfb CharSequence charSequence, int i, @yfb CharSequence charSequence2, int i2, int i3, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(charSequence2, "other");
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? regionMatches((String) charSequence, i, (String) charSequence2, i2, i3, z) : m9g.regionMatchesImpl(charSequence, i, charSequence2, i2, i3, z);
    }

    public static /* synthetic */ boolean regionMatches$default(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return regionMatches(charSequence, i, charSequence2, i2, i3, z);
    }

    @yfb
    public static String repeat(@yfb CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + a18.f100c).toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append(charSequence);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String string = sb.toString();
        md8.checkNotNull(string);
        return string;
    }

    @yfb
    public static final String replace(@yfb String str, char c, char c2, boolean z) {
        md8.checkNotNullParameter(str, "<this>");
        if (!z) {
            String strReplace = str.replace(c, c2);
            md8.checkNotNullExpressionValue(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (uw1.equals(cCharAt, c, z)) {
                cCharAt = c2;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static /* synthetic */ String replace$default(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return replace(str, c, c2, z);
    }

    @yfb
    public static final String replaceFirst(@yfb String str, char c, char c2, boolean z) {
        md8.checkNotNullParameter(str, "<this>");
        int iIndexOf$default = m9g.indexOf$default(str, c, 0, z, 2, (Object) null);
        return iIndexOf$default < 0 ? str : m9g.replaceRange((CharSequence) str, iIndexOf$default, iIndexOf$default + 1, (CharSequence) String.valueOf(c2)).toString();
    }

    public static /* synthetic */ String replaceFirst$default(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return replaceFirst(str, c, c2, z);
    }

    @yfb
    public static final List<String> split(@yfb CharSequence charSequence, @yfb Pattern pattern, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(pattern, "regex");
        m9g.requireNonNegativeLimit(i);
        if (i == 0) {
            i = -1;
        }
        String[] strArrSplit = pattern.split(charSequence, i);
        md8.checkNotNullExpressionValue(strArrSplit, "split(...)");
        return u70.asList(strArrSplit);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, Pattern pattern, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return split(charSequence, pattern, i);
    }

    public static boolean startsWith(@yfb String str, @yfb String str2, boolean z) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "prefix");
        return !z ? str.startsWith(str2) : regionMatches(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return startsWith(str, str2, z);
    }

    @t28
    private static final String substring(String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        String strSubstring = str.substring(i);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @t28
    private static final byte[] toByteArray(String str, Charset charset) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        byte[] bytes = str.getBytes(charset);
        md8.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @jjf(version = "1.4")
    @yfb
    public static final char[] toCharArray(@yfb String str, int i, int i2) {
        md8.checkNotNullParameter(str, "<this>");
        AbstractC7110i2.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        char[] cArr = new char[i2 - i];
        str.getChars(i, i2, cArr, 0);
        return cArr;
    }

    public static /* synthetic */ char[] toCharArray$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return toCharArray(str, i, i2);
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.5")
    @q64(message = "Use lowercase() instead.", replaceWith = @i2e(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    private static final String toLowerCase(String str) {
        md8.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase();
        md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @t28
    private static final Pattern toPattern(String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i);
        md8.checkNotNullExpressionValue(patternCompile, "compile(...)");
        return patternCompile;
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.5")
    @q64(message = "Use uppercase() instead.", replaceWith = @i2e(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    private static final String toUpperCase(String str) {
        md8.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase();
        md8.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    @t28
    private static final String uppercase(String str) {
        md8.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        md8.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @t28
    private static final String String(byte[] bArr, Charset charset) {
        md8.checkNotNullParameter(bArr, "bytes");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new String(bArr, charset);
    }

    @jjf(version = "1.4")
    @t64(warningSince = "1.5")
    @q64(message = "Use replaceFirstChar instead.", replaceWith = @i2e(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @ip9
    @yfb
    public static final String capitalize(@yfb String str, @yfb Locale locale) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(locale, xs1.f99098B);
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
            md8.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strSubstring.toUpperCase(locale);
            md8.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        md8.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    @jjf(version = "1.4")
    @yfb
    public static String concatToString(@yfb char[] cArr, int i, int i2) {
        md8.checkNotNullParameter(cArr, "<this>");
        AbstractC7110i2.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    @t28
    private static final boolean contentEquals(String str, StringBuffer stringBuffer) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(stringBuffer, "stringBuilder");
        return str.contentEquals(stringBuffer);
    }

    @jjf(version = "1.4")
    @t64(warningSince = "1.5")
    @q64(message = "Use replaceFirstChar instead.", replaceWith = @i2e(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @ip9
    @yfb
    public static final String decapitalize(@yfb String str, @yfb Locale locale) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(locale, xs1.f99098B);
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        md8.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        sb.append(lowerCase);
        String strSubstring2 = str.substring(1);
        md8.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    @jjf(version = "1.4")
    @yfb
    public static final String decodeToString(@yfb byte[] bArr, int i, int i2, boolean z) {
        md8.checkNotNullParameter(bArr, "<this>");
        AbstractC7110i2.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, bArr.length);
        if (!z) {
            return new String(bArr, i, i2 - i, xw1.f99524b);
        }
        CharsetDecoder charsetDecoderNewDecoder = xw1.f99524b.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i, i2 - i)).toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @jjf(version = "1.4")
    @yfb
    public static final byte[] encodeToByteArray(@yfb String str, int i, int i2, boolean z) throws CharacterCodingException {
        md8.checkNotNullParameter(str, "<this>");
        AbstractC7110i2.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        if (!z) {
            String strSubstring = str.substring(i, i2);
            md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = xw1.f99524b;
            md8.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = strSubstring.getBytes(charset);
            md8.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        }
        CharsetEncoder charsetEncoderNewEncoder = xw1.f99524b.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i, i2));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            md8.checkNotNull(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                md8.checkNotNull(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    @t28
    private static final String format(l7g l7gVar, String str, Object... objArr) {
        md8.checkNotNullParameter(l7gVar, "<this>");
        md8.checkNotNullParameter(str, MediaInformation.KEY_FORMAT_PROPERTIES);
        md8.checkNotNullParameter(objArr, C2473f.f17565y);
        String str2 = String.format(str, Arrays.copyOf(objArr, objArr.length));
        md8.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    @t28
    private static final String lowercase(String str, Locale locale) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(locale, xs1.f99098B);
        String lowerCase = str.toLowerCase(locale);
        md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @t28
    private static final int nativeIndexOf(String str, String str2, int i) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "str");
        return str.indexOf(str2, i);
    }

    @t28
    private static final int nativeLastIndexOf(String str, String str2, int i) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "str");
        return str.lastIndexOf(str2, i);
    }

    public static /* synthetic */ boolean regionMatches$default(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return regionMatches(str, i, str2, i2, i3, z);
    }

    public static /* synthetic */ String replace$default(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return replace(str, str2, str3, z);
    }

    public static /* synthetic */ String replaceFirst$default(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return replaceFirst(str, str2, str3, z);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return startsWith(str, str2, i, z);
    }

    @t28
    private static final String substring(String str, int i, int i2) {
        md8.checkNotNullParameter(str, "<this>");
        String strSubstring = str.substring(i, i2);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.5")
    @q64(message = "Use lowercase() instead.", replaceWith = @i2e(expression = "lowercase(locale)", imports = {}))
    private static final String toLowerCase(String str, Locale locale) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(locale, xs1.f99098B);
        String lowerCase = str.toLowerCase(locale);
        md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.5")
    @q64(message = "Use uppercase() instead.", replaceWith = @i2e(expression = "uppercase(locale)", imports = {}))
    private static final String toUpperCase(String str, Locale locale) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(locale, xs1.f99098B);
        String upperCase = str.toUpperCase(locale);
        md8.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    @t28
    private static final String uppercase(String str, Locale locale) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(locale, xs1.f99098B);
        String upperCase = str.toUpperCase(locale);
        md8.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @t28
    private static final String String(byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "bytes");
        return new String(bArr, i, i2, xw1.f99524b);
    }

    @jjf(version = "1.5")
    public static boolean contentEquals(@gib CharSequence charSequence, @gib CharSequence charSequence2) {
        if ((charSequence instanceof String) && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        return m9g.contentEqualsImpl(charSequence, charSequence2);
    }

    @jjf(version = "1.4")
    @t28
    private static final String format(String str, Locale locale, Object... objArr) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(objArr, C2473f.f17565y);
        String str2 = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        md8.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    @yfb
    public static final String replaceFirst(@yfb String str, @yfb String str2, @yfb String str3, boolean z) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "oldValue");
        md8.checkNotNullParameter(str3, "newValue");
        int iIndexOf$default = m9g.indexOf$default(str, str2, 0, z, 2, (Object) null);
        return iIndexOf$default < 0 ? str : m9g.replaceRange((CharSequence) str, iIndexOf$default, str2.length() + iIndexOf$default, (CharSequence) str3).toString();
    }

    public static boolean startsWith(@yfb String str, @yfb String str2, int i, boolean z) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return regionMatches(str, i, str2, 0, str2.length(), z);
    }

    @t28
    private static final char[] toCharArray(String str) {
        md8.checkNotNullParameter(str, "<this>");
        char[] charArray = str.toCharArray();
        md8.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        return charArray;
    }

    @t28
    private static final String String(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "bytes");
        return new String(bArr, xw1.f99524b);
    }

    @jjf(version = "1.4")
    @t28
    private static final String format(l7g l7gVar, Locale locale, String str, Object... objArr) {
        md8.checkNotNullParameter(l7gVar, "<this>");
        md8.checkNotNullParameter(str, MediaInformation.KEY_FORMAT_PROPERTIES);
        md8.checkNotNullParameter(objArr, C2473f.f17565y);
        String str2 = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        md8.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    public static boolean regionMatches(@yfb String str, int i, @yfb String str2, int i2, int i3, boolean z) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    @t28
    private static final char[] toCharArray(String str, char[] cArr, int i, int i2, int i3) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(cArr, FirebaseAnalytics.C3552d.f23234z);
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    @t28
    private static final String String(char[] cArr) {
        md8.checkNotNullParameter(cArr, "chars");
        return new String(cArr);
    }

    @t28
    private static final String String(char[] cArr, int i, int i2) {
        md8.checkNotNullParameter(cArr, "chars");
        return new String(cArr, i, i2);
    }

    @jjf(version = "1.5")
    public static final boolean contentEquals(@gib CharSequence charSequence, @gib CharSequence charSequence2, boolean z) {
        if (z) {
            return m9g.contentEqualsIgnoreCaseImpl(charSequence, charSequence2);
        }
        return contentEquals(charSequence, charSequence2);
    }

    @yfb
    public static final String replace(@yfb String str, @yfb String str2, @yfb String str3, boolean z) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "oldValue");
        md8.checkNotNullParameter(str3, "newValue");
        int i = 0;
        int iIndexOf = m9g.indexOf(str, str2, 0, z);
        if (iIndexOf < 0) {
            return str;
        }
        int length = str2.length();
        int iCoerceAtLeast = kpd.coerceAtLeast(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i, iIndexOf);
                sb.append(str3);
                i = iIndexOf + length;
                if (iIndexOf >= str.length()) {
                    break;
                }
                iIndexOf = m9g.indexOf(str, str2, iIndexOf + iCoerceAtLeast, z);
            } while (iIndexOf > 0);
            sb.append((CharSequence) str, i, str.length());
            String string = sb.toString();
            md8.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        throw new OutOfMemoryError();
    }

    @t28
    private static final String String(int[] iArr, int i, int i2) {
        md8.checkNotNullParameter(iArr, "codePoints");
        return new String(iArr, i, i2);
    }

    @t28
    private static final String String(StringBuffer stringBuffer) {
        md8.checkNotNullParameter(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    @t28
    private static final String String(StringBuilder sb) {
        md8.checkNotNullParameter(sb, "stringBuilder");
        return new String(sb);
    }
}
