package p000;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.C0898a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class vq8 {

    /* JADX INFO: renamed from: b */
    public static final int f91980b = -1;

    /* JADX INFO: renamed from: c */
    public static final String f91981c = "CustomMethod";

    /* JADX INFO: renamed from: d */
    public static final String f91982d = "CustomAttribute";

    /* JADX INFO: renamed from: e */
    public static HashMap<String, Constructor<? extends dq8>> f91983e = null;

    /* JADX INFO: renamed from: f */
    public static final String f91984f = "KeyFrames";

    /* JADX INFO: renamed from: a */
    public HashMap<Integer, ArrayList<dq8>> f91985a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends dq8>> map = new HashMap<>();
        f91983e = map;
        try {
            map.put("KeyAttribute", fq8.class.getConstructor(null));
            f91983e.put("KeyPosition", ir8.class.getConstructor(null));
            f91983e.put("KeyCycle", iq8.class.getConstructor(null));
            f91983e.put("KeyTimeCycle", kr8.class.getConstructor(null));
            f91983e.put("KeyTrigger", mr8.class.getConstructor(null));
        } catch (NoSuchMethodException e) {
            Log.e(f91984f, "unable to load", e);
        }
    }

    public vq8() {
    }

    /* JADX INFO: renamed from: a */
    public static String m24118a(int viewId, Context context) {
        return context.getResources().getResourceEntryName(viewId);
    }

    public void addAllFrames(eza motionController) {
        ArrayList<dq8> arrayList = this.f91985a.get(-1);
        if (arrayList != null) {
            motionController.m10379a(arrayList);
        }
    }

    public void addFrames(eza motionController) {
        ArrayList<dq8> arrayList = this.f91985a.get(Integer.valueOf(motionController.f34585c));
        if (arrayList != null) {
            motionController.m10379a(arrayList);
        }
        ArrayList<dq8> arrayList2 = this.f91985a.get(-1);
        if (arrayList2 != null) {
            for (dq8 dq8Var : arrayList2) {
                if (dq8Var.m9296a(((ConstraintLayout.C0894b) motionController.f34584b.getLayoutParams()).f6714c0)) {
                    motionController.addKey(dq8Var);
                }
            }
        }
    }

    public void addKey(dq8 key) {
        if (!this.f91985a.containsKey(Integer.valueOf(key.f30388b))) {
            this.f91985a.put(Integer.valueOf(key.f30388b), new ArrayList<>());
        }
        ArrayList<dq8> arrayList = this.f91985a.get(Integer.valueOf(key.f30388b));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }

    public ArrayList<dq8> getKeyFramesForView(int id) {
        return this.f91985a.get(Integer.valueOf(id));
    }

    public Set<Integer> getKeys() {
        return this.f91985a.keySet();
    }

    public vq8(Context context, XmlPullParser parser) {
        Exception e;
        dq8 dq8VarNewInstance;
        Constructor<? extends dq8> constructor;
        HashMap<String, C0898a> map;
        HashMap<String, C0898a> map2;
        try {
            int eventType = parser.getEventType();
            dq8 dq8Var = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(parser.getName())) {
                        return;
                    }
                } else {
                    String name = parser.getName();
                    if (f91983e.containsKey(name)) {
                        try {
                            constructor = f91983e.get(name);
                        } catch (Exception e2) {
                            dq8 dq8Var2 = dq8Var;
                            e = e2;
                            dq8VarNewInstance = dq8Var2;
                        }
                        if (constructor != null) {
                            dq8VarNewInstance = constructor.newInstance(null);
                            try {
                                dq8VarNewInstance.load(context, Xml.asAttributeSet(parser));
                                addKey(dq8VarNewInstance);
                            } catch (Exception e3) {
                                e = e3;
                                Log.e(f91984f, "unable to create ", e);
                            }
                            dq8Var = dq8VarNewInstance;
                        } else {
                            throw new NullPointerException("Keymaker for " + name + " not found");
                        }
                        Log.e(f91984f, "unable to create ", e);
                        dq8Var = dq8VarNewInstance;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (dq8Var != null && (map2 = dq8Var.f30391e) != null) {
                            C0898a.parse(context, parser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && dq8Var != null && (map = dq8Var.f30391e) != null) {
                        C0898a.parse(context, parser, map);
                    }
                }
                eventType = parser.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }
}
