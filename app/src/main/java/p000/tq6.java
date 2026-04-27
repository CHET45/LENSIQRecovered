package p000;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class tq6 {
    public static boolean checkEmail(String email) {
        return Pattern.compile("[0-9a-zA-Z_.-]+[@][0-9a-zA-Z_.-]+([.][a-zA-Z]+){1,2}").matcher(email).matches();
    }

    public static boolean checkPassword(String password) {
        if (password == null) {
            return false;
        }
        return password.matches("^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,12}$");
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() != 11) {
            return false;
        }
        return Pattern.compile("^[1][3-9][0-9]{9}$").matcher(phoneNumber).matches();
    }

    public static boolean checkSmsCode(String code) {
        return code != null && code.length() == 6 && TextUtils.isDigitsOnly(code);
    }

    public static String formatterTime(long time) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(time));
    }

    @igg({"DefaultLocale"})
    public static String paceFormat(long seconds) {
        return String.format("%02d'%02d\"", Integer.valueOf((int) (seconds / 60)), Integer.valueOf((int) (seconds % 60)));
    }
}
