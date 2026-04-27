package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public final class s4i {
    private s4i() {
    }

    public static void verify(boolean expression) {
        if (!expression) {
            throw new t4i();
        }
    }

    @op1
    public static <T> T verifyNotNull(@wx1 T t) {
        return (T) verifyNotNull(t, "expected a non-null reference", new Object[0]);
    }

    public static void verify(boolean expression, String errorMessageTemplate, @wx1 Object... errorMessageArgs) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, errorMessageArgs));
        }
    }

    @op1
    public static <T> T verifyNotNull(@wx1 T reference, String errorMessageTemplate, @wx1 Object... errorMessageArgs) {
        if (reference != null) {
            return reference;
        }
        throw new t4i(u8g.lenientFormat(errorMessageTemplate, errorMessageArgs));
    }

    public static void verify(boolean expression, String errorMessageTemplate, char p1) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1)));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, int p1) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1)));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, long p1) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1)));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, @wx1 Object p1) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, p1));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, char p1, char p2) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1), Character.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, int p1, char p2) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1), Character.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, long p1, char p2) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1), Character.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, @wx1 Object p1, char p2) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, p1, Character.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, char p1, int p2) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1), Integer.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, int p1, int p2) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1), Integer.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, long p1, int p2) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1), Integer.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, @wx1 Object p1, int p2) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, p1, Integer.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, char p1, long p2) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1), Long.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, int p1, long p2) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1), Long.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, long p1, long p2) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1), Long.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, @wx1 Object p1, long p2) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, p1, Long.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, char p1, @wx1 Object p2) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1), p2));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, int p1, @wx1 Object p2) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1), p2));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, long p1, @wx1 Object p2) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1), p2));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, @wx1 Object p1, @wx1 Object p2) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, p1, p2));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, @wx1 Object p1, @wx1 Object p2, @wx1 Object p3) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, p1, p2, p3));
        }
    }

    public static void verify(boolean expression, String errorMessageTemplate, @wx1 Object p1, @wx1 Object p2, @wx1 Object p3, @wx1 Object p4) {
        if (!expression) {
            throw new t4i(u8g.lenientFormat(errorMessageTemplate, p1, p2, p3, p4));
        }
    }
}
