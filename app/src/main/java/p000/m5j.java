package p000;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.zxing.client.android.Intents;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.compress.compressors.bzip2.BZip2Constants;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes5.dex */
public final class m5j {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @efb
    private static Status zza(String str, @hib String str2) {
        int i;
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    b = 0;
                }
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    b = 1;
                }
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    b = 2;
                }
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    b = 3;
                }
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    b = 4;
                }
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    b = 5;
                }
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    b = 6;
                }
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    b = 7;
                }
                break;
            case -1699246888:
                if (str.equals("INVALID_RECAPTCHA_VERSION")) {
                    b = 8;
                }
                break;
            case -1603818979:
                if (str.equals("RECAPTCHA_NOT_ENABLED")) {
                    b = 9;
                }
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    b = 10;
                }
                break;
            case -1584641425:
                if (str.equals("UNAUTHORIZED_DOMAIN")) {
                    b = 11;
                }
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    b = 12;
                }
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    b = 13;
                }
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    b = 14;
                }
                break;
            case -1368998244:
                if (str.equals("INVALID_HOSTING_LINK_DOMAIN")) {
                    b = 15;
                }
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    b = 16;
                }
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    b = 17;
                }
                break;
            case -1242922234:
                if (str.equals("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
                    b = 18;
                }
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    b = 19;
                }
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    b = 20;
                }
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    b = 21;
                }
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    b = 22;
                }
                break;
            case -974503964:
                if (str.equals("MISSING_OR_INVALID_NONCE")) {
                    b = 23;
                }
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    b = 24;
                }
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    b = 25;
                }
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    b = 26;
                }
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    b = 27;
                }
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    b = 28;
                }
                break;
            case -595928767:
                if (str.equals(Intents.Scan.TIMEOUT)) {
                    b = 29;
                }
                break;
            case -505579581:
                if (str.equals("INVALID_REQ_TYPE")) {
                    b = 30;
                }
                break;
            case -406804866:
                if (str.equals("INVALID_LOGIN_CREDENTIALS")) {
                    b = 31;
                }
                break;
            case -380728810:
                if (str.equals("INVALID_RECAPTCHA_ACTION")) {
                    b = 32;
                }
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    b = 33;
                }
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    b = BuiltinOptions.TopKV2Options;
                }
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    b = BuiltinOptions.SplitOptions;
                }
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    b = 36;
                }
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    b = 37;
                }
                break;
            case -52772551:
                if (str.equals("CAPTCHA_CHECK_FAILED")) {
                    b = 38;
                }
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    b = 39;
                }
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    b = 40;
                }
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    b = 41;
                }
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    b = 42;
                }
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    b = 43;
                }
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    b = 44;
                }
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    b = 45;
                }
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    b = 46;
                }
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    b = 47;
                }
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    b = 48;
                }
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    b = 49;
                }
                break;
            case 492515765:
                if (str.equals("MISSING_CLIENT_TYPE")) {
                    b = 50;
                }
                break;
            case 530628231:
                if (str.equals("MISSING_RECAPTCHA_VERSION")) {
                    b = 51;
                }
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    b = 52;
                }
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    b = 53;
                }
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    b = 54;
                }
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    b = 55;
                }
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    b = 56;
                }
                break;
            case 799258561:
                if (str.equals("INVALID_PROVIDER_ID")) {
                    b = BuiltinOptions.ArgMinOptions;
                }
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    b = BuiltinOptions.FakeQuantOptions;
                }
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    b = BuiltinOptions.PackOptions;
                }
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    b = BuiltinOptions.LogicalOrOptions;
                }
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    b = 61;
                }
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    b = BuiltinOptions.LogicalAndOptions;
                }
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    b = 63;
                }
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    b = 64;
                }
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    b = BuiltinOptions.FloorDivOptions;
                }
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    b = BuiltinOptions.SquareOptions;
                }
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    b = BuiltinOptions.ZerosLikeOptions;
                }
                break;
            case 1113992697:
                if (str.equals("INVALID_RECAPTCHA_TOKEN")) {
                    b = BuiltinOptions.FillOptions;
                }
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    b = BuiltinOptions.BidirectionalSequenceLSTMOptions;
                }
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    b = BuiltinOptions.BidirectionalSequenceRNNOptions;
                }
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    b = BuiltinOptions.UnidirectionalSequenceLSTMOptions;
                }
                break;
            case 1308491624:
                if (str.equals("MISSING_RECAPTCHA_TOKEN")) {
                    b = BuiltinOptions.FloorModOptions;
                }
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    b = BuiltinOptions.RangeOptions;
                }
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    b = BuiltinOptions.ResizeNearestNeighborOptions;
                }
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    b = 75;
                }
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    b = 76;
                }
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    b = 77;
                }
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    b = BuiltinOptions.AbsOptions;
                }
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    b = BuiltinOptions.SplitVOptions;
                }
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    b = BuiltinOptions.UniqueOptions;
                }
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    b = BuiltinOptions.ReverseV2Options;
                }
                break;
        }
        switch (b) {
            case 0:
                i = 18001;
                break;
            case 1:
                i = 17033;
                break;
            case 2:
                i = 17057;
                break;
            case 3:
                i = 17091;
                break;
            case 4:
            case 31:
            case 64:
                i = 17004;
                break;
            case 5:
                i = 17068;
                break;
            case 6:
                i = 17052;
                break;
            case 7:
                i = 17061;
                break;
            case 8:
                i = 17206;
                break;
            case 9:
                i = 17200;
                break;
            case 10:
                i = 17029;
                break;
            case 11:
                i = 17038;
                break;
            case 12:
                i = 17030;
                break;
            case 13:
                i = 17034;
                break;
            case 14:
                i = 17044;
                break;
            case 15:
                i = 17214;
                break;
            case 16:
                i = qx5.f76249r;
                break;
            case 17:
                i = 17079;
                break;
            case 18:
                i = BZip2Constants.MAX_SELECTORS;
                break;
            case 19:
                i = 17046;
                break;
            case 20:
                i = 17087;
                break;
            case 21:
            case 73:
                i = 17008;
                break;
            case 22:
                i = 17085;
                break;
            case 23:
                i = 17094;
                break;
            case 24:
                i = 17064;
                break;
            case 25:
                i = qx5.f76246o;
                break;
            case 26:
                i = 17084;
                break;
            case 27:
                i = 17035;
                break;
            case 28:
                i = qx5.f76244m;
                break;
            case 29:
            case 67:
                i = qx5.f76248q;
                break;
            case 30:
                i = 17207;
                break;
            case 32:
                i = 17203;
                break;
            case 33:
            case 52:
                i = 17006;
                break;
            case 34:
                i = 17062;
                break;
            case 35:
                i = 17088;
                break;
            case 36:
                i = 17082;
                break;
            case 37:
            case 40:
                i = qx5.f76242k;
                break;
            case 38:
                i = 17056;
                break;
            case 39:
                i = 17026;
                break;
            case 41:
                i = 17089;
                break;
            case 42:
                i = 17032;
                break;
            case 43:
                i = 17041;
                break;
            case 44:
                i = 17074;
                break;
            case 45:
                i = 17081;
                break;
            case 46:
                i = 17095;
                break;
            case 47:
                i = 17007;
                break;
            case 48:
                i = qx5.f76247p;
                break;
            case 49:
                i = 17065;
                break;
            case 50:
                i = 17204;
                break;
            case 51:
                i = 17205;
                break;
            case 53:
                i = 17086;
                break;
            case 54:
                i = 17075;
                break;
            case 55:
                i = 17083;
                break;
            case 56:
                i = 17049;
                break;
            case 57:
                i = 17071;
                break;
            case 58:
                i = 17002;
                break;
            case 59:
                i = 17058;
                break;
            case 60:
                i = 17078;
                break;
            case 61:
                i = 17093;
                break;
            case 62:
                i = 17031;
                break;
            case 63:
            case 77:
                i = 17010;
                break;
            case 65:
                i = 17000;
                break;
            case 66:
                i = 17009;
                break;
            case 68:
                i = 17202;
                break;
            case 69:
                i = 17051;
                break;
            case 70:
                i = 17043;
                break;
            case 71:
                i = qx5.f76252u;
                break;
            case 72:
                i = 17201;
                break;
            case 74:
                i = 17005;
                break;
            case 75:
                i = 17042;
                break;
            case 76:
                i = qx5.f76254w;
                break;
            case 78:
                i = 17040;
                break;
            case 79:
                i = 17045;
                break;
            case 80:
                i = 17090;
                break;
            case 81:
                i = 17073;
                break;
            default:
                i = 17499;
                break;
        }
        if (i != 17499) {
            return new Status(i, str2);
        }
        if (str2 == null) {
            return new Status(i, str);
        }
        return new Status(i, str + g1i.f38277c + str2);
    }

    @efb
    public static Status zza(@hib String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(qx5.f76256y);
        }
        String[] strArrSplit = str.split(g1i.f38277c, 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            strArrSplit[1] = str2.trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        if (listAsList.size() > 1) {
            return zza((String) listAsList.get(0), (String) listAsList.get(1));
        }
        return zza((String) listAsList.get(0), null);
    }
}
