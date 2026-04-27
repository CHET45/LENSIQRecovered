package p000;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class p55<T> {
    public static <T> p55<T> ofData(int i, T t, @hib wdd wddVar, @hib u55 u55Var) {
        return new pk0(Integer.valueOf(i), t, acd.DEFAULT, wddVar, u55Var);
    }

    public static <T> p55<T> ofTelemetry(int i, T t, @hib wdd wddVar, @hib u55 u55Var) {
        return new pk0(Integer.valueOf(i), t, acd.VERY_LOW, wddVar, u55Var);
    }

    public static <T> p55<T> ofUrgent(int i, T t, @hib wdd wddVar, @hib u55 u55Var) {
        return new pk0(Integer.valueOf(i), t, acd.HIGHEST, wddVar, u55Var);
    }

    @hib
    public abstract Integer getCode();

    @hib
    public abstract u55 getEventContext();

    public abstract T getPayload();

    public abstract acd getPriority();

    @hib
    public abstract wdd getProductData();

    public static <T> p55<T> ofData(int i, T t, @hib wdd wddVar) {
        return new pk0(Integer.valueOf(i), t, acd.DEFAULT, wddVar, null);
    }

    public static <T> p55<T> ofTelemetry(int i, T t, @hib wdd wddVar) {
        return new pk0(Integer.valueOf(i), t, acd.VERY_LOW, wddVar, null);
    }

    public static <T> p55<T> ofUrgent(int i, T t, @hib wdd wddVar) {
        return new pk0(Integer.valueOf(i), t, acd.HIGHEST, wddVar, null);
    }

    public static <T> p55<T> ofData(int i, T t, @hib u55 u55Var) {
        return new pk0(Integer.valueOf(i), t, acd.DEFAULT, null, u55Var);
    }

    public static <T> p55<T> ofTelemetry(int i, T t, @hib u55 u55Var) {
        return new pk0(Integer.valueOf(i), t, acd.VERY_LOW, null, u55Var);
    }

    public static <T> p55<T> ofUrgent(int i, T t, @hib u55 u55Var) {
        return new pk0(Integer.valueOf(i), t, acd.HIGHEST, null, u55Var);
    }

    public static <T> p55<T> ofData(int i, T t) {
        return new pk0(Integer.valueOf(i), t, acd.DEFAULT, null, null);
    }

    public static <T> p55<T> ofTelemetry(int i, T t) {
        return new pk0(Integer.valueOf(i), t, acd.VERY_LOW, null, null);
    }

    public static <T> p55<T> ofUrgent(int i, T t) {
        return new pk0(Integer.valueOf(i), t, acd.HIGHEST, null, null);
    }

    public static <T> p55<T> ofData(T t, @hib wdd wddVar, @hib u55 u55Var) {
        return new pk0(null, t, acd.DEFAULT, wddVar, u55Var);
    }

    public static <T> p55<T> ofTelemetry(T t, @hib wdd wddVar, @hib u55 u55Var) {
        return new pk0(null, t, acd.VERY_LOW, wddVar, u55Var);
    }

    public static <T> p55<T> ofUrgent(T t, @hib wdd wddVar, @hib u55 u55Var) {
        return new pk0(null, t, acd.HIGHEST, wddVar, u55Var);
    }

    public static <T> p55<T> ofData(T t, @hib wdd wddVar) {
        return new pk0(null, t, acd.DEFAULT, wddVar, null);
    }

    public static <T> p55<T> ofTelemetry(T t, @hib wdd wddVar) {
        return new pk0(null, t, acd.VERY_LOW, wddVar, null);
    }

    public static <T> p55<T> ofUrgent(T t, @hib wdd wddVar) {
        return new pk0(null, t, acd.HIGHEST, wddVar, null);
    }

    public static <T> p55<T> ofData(T t, @hib u55 u55Var) {
        return new pk0(null, t, acd.DEFAULT, null, u55Var);
    }

    public static <T> p55<T> ofTelemetry(T t, @hib u55 u55Var) {
        return new pk0(null, t, acd.VERY_LOW, null, u55Var);
    }

    public static <T> p55<T> ofUrgent(T t, @hib u55 u55Var) {
        return new pk0(null, t, acd.HIGHEST, null, u55Var);
    }

    public static <T> p55<T> ofData(T t) {
        return new pk0(null, t, acd.DEFAULT, null, null);
    }

    public static <T> p55<T> ofTelemetry(T t) {
        return new pk0(null, t, acd.VERY_LOW, null, null);
    }

    public static <T> p55<T> ofUrgent(T t) {
        return new pk0(null, t, acd.HIGHEST, null, null);
    }
}
