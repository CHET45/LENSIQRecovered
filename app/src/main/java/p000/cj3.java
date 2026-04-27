package p000;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class cj3 implements lkb, sjb {

    /* JADX INFO: renamed from: a */
    public static final cj3 f16683a = new cj3();

    private cj3() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, java.util.Calendar] */
    /* JADX INFO: renamed from: a */
    public <T> T m3989a(hw3 hw3Var, Type type, Object obj, Object obj2, String str) {
        if (obj2 == 0) {
            return null;
        }
        if (obj2 instanceof Date) {
            return obj2;
        }
        if (obj2 instanceof Number) {
            return (T) new Date(((Number) obj2).longValue());
        }
        if (!(obj2 instanceof String)) {
            throw new jh8("parse error");
        }
        String str2 = (String) obj2;
        if (str2.length() == 0) {
            return null;
        }
        lh8 lh8Var = new lh8(str2);
        try {
            if (lh8Var.scanISO8601DateIfMatch(false)) {
                ?? r2 = (T) lh8Var.getCalendar();
                return type == Calendar.class ? r2 : (T) r2.getTime();
            }
            try {
                return (T) (str != null ? new SimpleDateFormat(str) : hw3Var.getDateFormat()).parse(str2);
            } catch (ParseException unused) {
                return (T) new Date(Long.parseLong(str2));
            }
        } finally {
            lh8Var.close();
        }
    }

    @Override // p000.sjb
    public <T> T deserialze(hw3 hw3Var, Type type, Object obj) {
        return (T) deserialze(hw3Var, type, obj, null);
    }

    @Override // p000.lkb
    public void write(ph8 ph8Var, Object obj, Object obj2, Type type) throws IOException {
        char[] charArray;
        i1f i1fVar = ph8Var.f70792b;
        if (obj == null) {
            i1fVar.writeNull();
            return;
        }
        if ((i1fVar.f45448c & a2f.WriteClassName.f216a) != 0 && obj.getClass() != type) {
            if (obj.getClass() == Date.class) {
                i1fVar.write("new Date(");
                i1fVar.writeLong(((Date) obj).getTime());
                i1fVar.write(41);
                return;
            }
            i1fVar.write(123);
            i1fVar.writeFieldName(fh8.f36584c, false);
            ph8Var.write(obj.getClass().getName());
            i1fVar.write(44);
            i1fVar.writeFieldName("val", false);
            i1fVar.writeLong(((Date) obj).getTime());
            i1fVar.write(125);
            return;
        }
        Date time = obj instanceof Calendar ? ((Calendar) obj).getTime() : (Date) obj;
        if ((i1fVar.f45448c & a2f.WriteDateUseDateFormat.f216a) != 0) {
            DateFormat dateFormat = ph8Var.getDateFormat();
            if (dateFormat == null) {
                dateFormat = new SimpleDateFormat(fh8.f36586e, ph8Var.f70805o);
                dateFormat.setTimeZone(ph8Var.f70804n);
            }
            i1fVar.writeString(dateFormat.format(time));
            return;
        }
        long time2 = time.getTime();
        int i = i1fVar.f45448c;
        if ((a2f.UseISO8601DateFormat.f216a & i) == 0) {
            i1fVar.writeLong(time2);
            return;
        }
        a2f a2fVar = a2f.UseSingleQuotes;
        if ((i & a2fVar.f216a) != 0) {
            i1fVar.write(39);
        } else {
            i1fVar.write(34);
        }
        Calendar calendar = Calendar.getInstance(ph8Var.f70804n, ph8Var.f70805o);
        calendar.setTimeInMillis(time2);
        int i2 = calendar.get(1);
        int i3 = calendar.get(2) + 1;
        int i4 = calendar.get(5);
        int i5 = calendar.get(11);
        int i6 = calendar.get(12);
        int i7 = calendar.get(13);
        int i8 = calendar.get(14);
        if (i8 != 0) {
            charArray = "0000-00-00T00:00:00.000".toCharArray();
            i1f.m12715b(i8, 23, charArray);
            i1f.m12715b(i7, 19, charArray);
            i1f.m12715b(i6, 16, charArray);
            i1f.m12715b(i5, 13, charArray);
            i1f.m12715b(i4, 10, charArray);
            i1f.m12715b(i3, 7, charArray);
            i1f.m12715b(i2, 4, charArray);
        } else if (i7 == 0 && i6 == 0 && i5 == 0) {
            charArray = "0000-00-00".toCharArray();
            i1f.m12715b(i4, 10, charArray);
            i1f.m12715b(i3, 7, charArray);
            i1f.m12715b(i2, 4, charArray);
        } else {
            charArray = "0000-00-00T00:00:00".toCharArray();
            i1f.m12715b(i7, 19, charArray);
            i1f.m12715b(i6, 16, charArray);
            i1f.m12715b(i5, 13, charArray);
            i1f.m12715b(i4, 10, charArray);
            i1f.m12715b(i3, 7, charArray);
            i1f.m12715b(i2, 4, charArray);
        }
        i1fVar.write(charArray);
        if ((i1fVar.f45448c & a2fVar.f216a) != 0) {
            i1fVar.write(39);
        } else {
            i1fVar.write(34);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9, types: [T, java.util.Calendar] */
    /* JADX WARN: Type inference failed for: r1v18, types: [T, java.util.Calendar] */
    public <T> T deserialze(hw3 hw3Var, Type type, Object obj, String str) {
        Object obj2;
        T t;
        Object obj3;
        lh8 lh8Var = hw3Var.f45134e;
        int i = lh8Var.token();
        if (i == 2) {
            Object objValueOf = Long.valueOf(lh8Var.longValue());
            lh8Var.nextToken(16);
            obj3 = objValueOf;
        } else if (i == 4) {
            String strStringVal = lh8Var.stringVal();
            lh8Var.nextToken(16);
            obj3 = strStringVal;
            if ((lh8Var.f57603c & rp5.AllowISO8601DateFormat.f78973a) != 0) {
                lh8 lh8Var2 = new lh8(strStringVal);
                Object time = strStringVal;
                if (lh8Var2.scanISO8601DateIfMatch(true)) {
                    ?? r1 = (T) lh8Var2.getCalendar();
                    if (type == Calendar.class) {
                        lh8Var2.close();
                        return r1;
                    }
                    time = r1.getTime();
                }
                lh8Var2.close();
                obj3 = time;
            }
        } else {
            if (i == 8) {
                lh8Var.nextToken();
                obj2 = null;
                t = (T) m3989a(hw3Var, type, obj, obj2, str);
                if (type != Calendar.class && !(t instanceof Calendar)) {
                    Date date = (Date) t;
                    if (date == null) {
                        return null;
                    }
                    ?? r13 = (T) Calendar.getInstance(lh8Var.f57611k, lh8Var.f57612l);
                    r13.setTime(date);
                    return r13;
                }
            }
            if (i == 12) {
                lh8Var.nextToken();
                if (lh8Var.token() != 4) {
                    throw new jh8("syntax error");
                }
                if (fh8.f36584c.equals(lh8Var.stringVal())) {
                    lh8Var.nextToken();
                    hw3Var.accept(17);
                    Type typeLoadClass = qmh.loadClass(lh8Var.stringVal(), hw3Var.f45131b.f94268c);
                    if (typeLoadClass != null) {
                        type = typeLoadClass;
                    }
                    hw3Var.accept(4);
                    hw3Var.accept(16);
                }
                lh8Var.nextTokenWithChar(':');
                if (lh8Var.token() != 2) {
                    throw new jh8("syntax error : " + lh8Var.tokenName());
                }
                long jLongValue = lh8Var.longValue();
                lh8Var.nextToken();
                Object objValueOf2 = Long.valueOf(jLongValue);
                hw3Var.accept(13);
                obj3 = objValueOf2;
            } else if (hw3Var.f45126H == 2) {
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
                Object obj4 = hw3Var.parse();
                hw3Var.accept(13);
                obj3 = obj4;
            } else {
                obj3 = hw3Var.parse();
            }
        }
        obj2 = obj3;
        t = (T) m3989a(hw3Var, type, obj, obj2, str);
        return type != Calendar.class ? t : t;
    }
}
