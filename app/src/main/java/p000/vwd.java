package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class vwd {

    /* JADX INFO: renamed from: a */
    public static final scf<String, String> f92426a = new scf<>();

    private vwd() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static List<String> getMatches(String str, CharSequence charSequence) {
        if (charSequence == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str).matcher(charSequence);
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        return arrayList;
    }

    public static String getReplaceAll(String str, String str2, String str3) {
        return str == null ? "" : Pattern.compile(str2).matcher(str).replaceAll(str3);
    }

    public static String getReplaceFirst(String str, String str2, String str3) {
        return str == null ? "" : Pattern.compile(str2).matcher(str).replaceFirst(str3);
    }

    public static String[] getSplits(String str, String str2) {
        return str == null ? new String[0] : str.split(str2);
    }

    public static boolean isDate(CharSequence charSequence) {
        return isMatch(rwd.f79965j, charSequence);
    }

    public static boolean isEmail(CharSequence charSequence) {
        return isMatch(rwd.f79961f, charSequence);
    }

    public static boolean isIDCard15(CharSequence charSequence) {
        return isMatch(rwd.f79959d, charSequence);
    }

    public static boolean isIDCard18(CharSequence charSequence) {
        return isMatch(rwd.f79960e, charSequence);
    }

    public static boolean isIDCard18Exact(CharSequence charSequence) {
        if (isIDCard18(charSequence)) {
            int[] iArr = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
            char[] cArr = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
            scf<String, String> scfVar = f92426a;
            if (scfVar.isEmpty()) {
                scfVar.put("11", "北京");
                scfVar.put("12", "天津");
                scfVar.put("13", "河北");
                scfVar.put("14", "山西");
                scfVar.put("15", "内蒙古");
                scfVar.put("21", "辽宁");
                scfVar.put("22", "吉林");
                scfVar.put("23", "黑龙江");
                scfVar.put("31", "上海");
                scfVar.put("32", "江苏");
                scfVar.put("33", "浙江");
                scfVar.put("34", "安徽");
                scfVar.put("35", "福建");
                scfVar.put("36", "江西");
                scfVar.put("37", "山东");
                scfVar.put("41", "河南");
                scfVar.put(vae.f90481f, "湖北");
                scfVar.put("43", "湖南");
                scfVar.put("44", "广东");
                scfVar.put("45", "广西");
                scfVar.put("46", "海南");
                scfVar.put("50", "重庆");
                scfVar.put("51", "四川");
                scfVar.put("52", "贵州");
                scfVar.put("53", "云南");
                scfVar.put("54", "西藏");
                scfVar.put("61", "陕西");
                scfVar.put("62", "甘肃");
                scfVar.put("63", "青海");
                scfVar.put("64", "宁夏");
                scfVar.put("65", "新疆");
                scfVar.put("71", "台湾老");
                scfVar.put("81", "香港");
                scfVar.put("82", "澳门");
                scfVar.put("83", "台湾新");
                scfVar.put("91", "国外");
            }
            if (scfVar.get(charSequence.subSequence(0, 2).toString()) != null) {
                int iCharAt = 0;
                for (int i = 0; i < 17; i++) {
                    iCharAt += (charSequence.charAt(i) - '0') * iArr[i];
                }
                return charSequence.charAt(17) == cArr[iCharAt % 11];
            }
        }
        return false;
    }

    public static boolean isIP(CharSequence charSequence) {
        return isMatch(rwd.f79966k, charSequence);
    }

    public static boolean isMatch(String str, CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0 && Pattern.matches(str, charSequence);
    }

    public static boolean isMobileExact(CharSequence charSequence) {
        return isMobileExact(charSequence, null);
    }

    public static boolean isMobileSimple(CharSequence charSequence) {
        return isMatch(rwd.f79956a, charSequence);
    }

    public static boolean isTel(CharSequence charSequence) {
        return isMatch(rwd.f79958c, charSequence);
    }

    public static boolean isURL(CharSequence charSequence) {
        return isMatch(rwd.f79962g, charSequence);
    }

    public static boolean isUsername(CharSequence charSequence) {
        return isMatch(rwd.f79964i, charSequence);
    }

    public static boolean isZh(CharSequence charSequence) {
        return isMatch(rwd.f79963h, charSequence);
    }

    public static boolean isMobileExact(CharSequence charSequence, List<String> list) {
        if (isMatch(rwd.f79957b, charSequence)) {
            return true;
        }
        if (list != null && charSequence != null && charSequence.length() == 11) {
            String string = charSequence.toString();
            for (char c : string.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (string.startsWith(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
