package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.rua;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface jce {
    String fullMethodName();

    rua.EnumC12303d methodType();

    Class<?> requestType();

    Class<?> responseType();
}
