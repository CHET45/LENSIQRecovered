package p000;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Enumeration;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
public final class zva implements lkb, sjb {

    /* JADX INFO: renamed from: a */
    public static final zva f106146a = new zva();

    private zva() {
    }

    /* JADX INFO: renamed from: a */
    public <T> T m27102a(hw3 hw3Var) {
        lh8 lh8Var = hw3Var.f45134e;
        if (lh8Var.token() == 8) {
            lh8Var.nextToken();
            return null;
        }
        if (lh8Var.token() != 12 && lh8Var.token() != 16) {
            throw new jh8("syntax error: " + sh8.name(lh8Var.token()));
        }
        int iIntValue = 0;
        String strStringVal = null;
        String strStringVal2 = null;
        String strStringVal3 = null;
        while (true) {
            String strScanSymbol = lh8Var.scanSymbol(hw3Var.f45130a);
            if (strScanSymbol == null) {
                if (lh8Var.token() == 13) {
                    lh8Var.nextToken(16);
                    break;
                }
                if (lh8Var.token() != 16 || (lh8Var.f57603c & rp5.AllowArbitraryCommas.f78973a) == 0) {
                }
            }
            lh8Var.nextTokenWithChar(':');
            if ("className".equals(strScanSymbol)) {
                if (lh8Var.token() == 8) {
                    strStringVal = null;
                } else {
                    if (lh8Var.token() != 4) {
                        throw new jh8("syntax error");
                    }
                    strStringVal = lh8Var.stringVal();
                }
            } else if ("methodName".equals(strScanSymbol)) {
                if (lh8Var.token() == 8) {
                    strStringVal2 = null;
                } else {
                    if (lh8Var.token() != 4) {
                        throw new jh8("syntax error");
                    }
                    strStringVal2 = lh8Var.stringVal();
                }
            } else if ("fileName".equals(strScanSymbol)) {
                if (lh8Var.token() == 8) {
                    strStringVal3 = null;
                } else {
                    if (lh8Var.token() != 4) {
                        throw new jh8("syntax error");
                    }
                    strStringVal3 = lh8Var.stringVal();
                }
            } else if ("lineNumber".equals(strScanSymbol)) {
                if (lh8Var.token() == 8) {
                    iIntValue = 0;
                } else {
                    if (lh8Var.token() != 2) {
                        throw new jh8("syntax error");
                    }
                    iIntValue = lh8Var.intValue();
                }
            } else if ("nativeMethod".equals(strScanSymbol)) {
                if (lh8Var.token() != 8 && lh8Var.token() != 6 && lh8Var.token() != 7) {
                    throw new jh8("syntax error");
                }
                lh8Var.nextToken(16);
            } else {
                if (strScanSymbol != fh8.f36584c) {
                    throw new jh8("syntax error : " + strScanSymbol);
                }
                if (lh8Var.token() == 4) {
                    String strStringVal4 = lh8Var.stringVal();
                    if (!strStringVal4.equals("java.lang.StackTraceElement")) {
                        throw new jh8("syntax error : " + strStringVal4);
                    }
                } else if (lh8Var.token() != 8) {
                    throw new jh8("syntax error");
                }
            }
            if (lh8Var.token() == 13) {
                lh8Var.nextToken(16);
                break;
            }
        }
        return (T) new StackTraceElement(strStringVal, strStringVal2, strStringVal3, iIntValue);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.text.DateFormat, java.text.SimpleDateFormat] */
    @Override // p000.sjb
    public <T> T deserialze(hw3 hw3Var, Type type, Object obj) {
        Object obj2;
        if (type == StackTraceElement.class) {
            return (T) m27102a(hw3Var);
        }
        lh8 lh8Var = hw3Var.f45134e;
        if (hw3Var.f45126H == 2) {
            hw3Var.f45126H = 0;
            hw3Var.accept(16);
            if (lh8Var.token() != 4) {
                throw new jh8("syntax error");
            }
            if (!"val".equals(lh8Var.stringVal())) {
                throw new jh8("syntax error");
            }
            lh8Var.nextToken();
            hw3Var.accept(17);
            obj2 = hw3Var.parse();
            hw3Var.accept(13);
        } else {
            obj2 = hw3Var.parse();
        }
        if (obj2 == null) {
            return null;
        }
        if (!(obj2 instanceof String)) {
            throw new jh8("except string value");
        }
        String str = (String) obj2;
        if (str.length() == 0) {
            return null;
        }
        if (type == UUID.class) {
            return (T) UUID.fromString(str);
        }
        if (type == Class.class) {
            return (T) qmh.loadClass(str, hw3Var.f45131b.f94268c);
        }
        if (type == Locale.class) {
            String[] strArrSplit = str.split(p43.f69617m);
            return strArrSplit.length == 1 ? (T) new Locale(strArrSplit[0]) : strArrSplit.length == 2 ? (T) new Locale(strArrSplit[0], strArrSplit[1]) : (T) new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        }
        if (type == URI.class) {
            return (T) URI.create(str);
        }
        if (type == URL.class) {
            try {
                return (T) new URL(str);
            } catch (MalformedURLException e) {
                throw new jh8("create url error", e);
            }
        }
        if (type == Pattern.class) {
            return (T) Pattern.compile(str);
        }
        if (type == Charset.class) {
            return (T) Charset.forName(str);
        }
        if (type == Currency.class) {
            return (T) Currency.getInstance(str);
        }
        if (type != SimpleDateFormat.class) {
            return (type == Character.TYPE || type == Character.class) ? (T) qmh.castToChar(str) : (T) TimeZone.getTimeZone(str);
        }
        ?? r7 = (T) new SimpleDateFormat(str, hw3Var.f45134e.f57612l);
        r7.setTimeZone(hw3Var.f45134e.f57611k);
        return r7;
    }

    @Override // p000.lkb
    public void write(ph8 ph8Var, Object obj, Object obj2, Type type) throws IOException {
        i1f i1fVar = ph8Var.f70792b;
        if (obj == null) {
            if (type == Character.TYPE || type == Character.class) {
                ph8Var.write("");
                return;
            } else if ((i1fVar.f45448c & a2f.WriteNullListAsEmpty.f216a) == 0 || !Enumeration.class.isAssignableFrom(qmh.getClass(type))) {
                i1fVar.writeNull();
                return;
            } else {
                i1fVar.write(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                return;
            }
        }
        if (obj instanceof Pattern) {
            ph8Var.write(((Pattern) obj).pattern());
            return;
        }
        if (obj instanceof TimeZone) {
            ph8Var.write(((TimeZone) obj).getID());
            return;
        }
        if (obj instanceof Currency) {
            ph8Var.write(((Currency) obj).getCurrencyCode());
            return;
        }
        if (obj instanceof Class) {
            ph8Var.write(((Class) obj).getName());
            return;
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            if (ch.charValue() == 0) {
                ph8Var.write("\u0000");
                return;
            } else {
                ph8Var.write(ch.toString());
                return;
            }
        }
        int i = 0;
        if (obj instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) obj).toPattern();
            if ((i1fVar.f45448c & a2f.WriteClassName.f216a) == 0 || obj.getClass() == type) {
                i1fVar.writeString(pattern);
                return;
            }
            i1fVar.write(123);
            i1fVar.writeFieldName(fh8.f36584c, false);
            ph8Var.write(obj.getClass().getName());
            i1fVar.write(44);
            i1fVar.writeFieldName("val", false);
            i1fVar.writeString(pattern);
            i1fVar.write(125);
            return;
        }
        if (obj instanceof qh8) {
            ((qh8) obj).writeJSONString(i1fVar);
            return;
        }
        if (obj instanceof hh8) {
            i1fVar.write(((hh8) obj).toJSONString());
            return;
        }
        if (obj instanceof oh8) {
            ((oh8) obj).write(ph8Var, obj2, type);
            return;
        }
        if (!(obj instanceof Enumeration)) {
            ph8Var.write(obj.toString());
            return;
        }
        Type type2 = ((i1fVar.f45448c & a2f.WriteClassName.f216a) == 0 || !(type instanceof ParameterizedType)) ? null : ((ParameterizedType) type).getActualTypeArguments()[0];
        Enumeration enumeration = (Enumeration) obj;
        e0f e0fVar = ph8Var.f70803m;
        ph8Var.setContext(e0fVar, obj, obj2, 0);
        try {
            i1fVar.write(91);
            while (enumeration.hasMoreElements()) {
                Object objNextElement = enumeration.nextElement();
                int i2 = i + 1;
                if (i != 0) {
                    i1fVar.write(44);
                }
                if (objNextElement == null) {
                    i1fVar.writeNull();
                } else {
                    ph8Var.f70791a.get(objNextElement.getClass()).write(ph8Var, objNextElement, Integer.valueOf(i), type2);
                }
                i = i2;
            }
            i1fVar.write(93);
            ph8Var.f70803m = e0fVar;
        } catch (Throwable th) {
            ph8Var.f70803m = e0fVar;
            throw th;
        }
    }
}
